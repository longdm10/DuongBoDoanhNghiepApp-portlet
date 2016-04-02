/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package vn.dtt.duongbien.dao.vrcb.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortException;
import vn.dtt.duongbien.dao.vrcb.model.DmHistoryPort;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPortImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPortModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dm history port service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmHistoryPortPersistence
 * @see DmHistoryPortUtil
 * @generated
 */
public class DmHistoryPortPersistenceImpl extends BasePersistenceImpl<DmHistoryPort>
	implements DmHistoryPortPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmHistoryPortUtil} to access the dm history port persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmHistoryPortImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmHistoryPortModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryPortImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmHistoryPortModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryPortImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmHistoryPortModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PORTCODE = new FinderPath(DmHistoryPortModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryPortImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByPortCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTCODE =
		new FinderPath(DmHistoryPortModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryPortImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByPortCode", new String[] { String.class.getName() },
			DmHistoryPortModelImpl.PORTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PORTCODE = new FinderPath(DmHistoryPortModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPortCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the dm history ports where portCode = &#63;.
	 *
	 * @param portCode the port code
	 * @return the matching dm history ports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryPort> findByPortCode(String portCode)
		throws SystemException {
		return findByPortCode(portCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the dm history ports where portCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPortModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param portCode the port code
	 * @param start the lower bound of the range of dm history ports
	 * @param end the upper bound of the range of dm history ports (not inclusive)
	 * @return the range of matching dm history ports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryPort> findByPortCode(String portCode, int start,
		int end) throws SystemException {
		return findByPortCode(portCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history ports where portCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPortModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param portCode the port code
	 * @param start the lower bound of the range of dm history ports
	 * @param end the upper bound of the range of dm history ports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm history ports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryPort> findByPortCode(String portCode, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTCODE;
			finderArgs = new Object[] { portCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PORTCODE;
			finderArgs = new Object[] { portCode, start, end, orderByComparator };
		}

		List<DmHistoryPort> list = (List<DmHistoryPort>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmHistoryPort dmHistoryPort : list) {
				if (!Validator.equals(portCode, dmHistoryPort.getPortCode())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_DMHISTORYPORT_WHERE);

			boolean bindPortCode = false;

			if (portCode == null) {
				query.append(_FINDER_COLUMN_PORTCODE_PORTCODE_1);
			}
			else if (portCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PORTCODE_PORTCODE_3);
			}
			else {
				bindPortCode = true;

				query.append(_FINDER_COLUMN_PORTCODE_PORTCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DmHistoryPortModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPortCode) {
					qPos.add(portCode);
				}

				if (!pagination) {
					list = (List<DmHistoryPort>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmHistoryPort>(list);
				}
				else {
					list = (List<DmHistoryPort>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first dm history port in the ordered set where portCode = &#63;.
	 *
	 * @param portCode the port code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm history port
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortException if a matching dm history port could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPort findByPortCode_First(String portCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmHistoryPortException, SystemException {
		DmHistoryPort dmHistoryPort = fetchByPortCode_First(portCode,
				orderByComparator);

		if (dmHistoryPort != null) {
			return dmHistoryPort;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("portCode=");
		msg.append(portCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmHistoryPortException(msg.toString());
	}

	/**
	 * Returns the first dm history port in the ordered set where portCode = &#63;.
	 *
	 * @param portCode the port code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm history port, or <code>null</code> if a matching dm history port could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPort fetchByPortCode_First(String portCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<DmHistoryPort> list = findByPortCode(portCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm history port in the ordered set where portCode = &#63;.
	 *
	 * @param portCode the port code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm history port
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortException if a matching dm history port could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPort findByPortCode_Last(String portCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmHistoryPortException, SystemException {
		DmHistoryPort dmHistoryPort = fetchByPortCode_Last(portCode,
				orderByComparator);

		if (dmHistoryPort != null) {
			return dmHistoryPort;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("portCode=");
		msg.append(portCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmHistoryPortException(msg.toString());
	}

	/**
	 * Returns the last dm history port in the ordered set where portCode = &#63;.
	 *
	 * @param portCode the port code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm history port, or <code>null</code> if a matching dm history port could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPort fetchByPortCode_Last(String portCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByPortCode(portCode);

		if (count == 0) {
			return null;
		}

		List<DmHistoryPort> list = findByPortCode(portCode, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm history ports before and after the current dm history port in the ordered set where portCode = &#63;.
	 *
	 * @param id the primary key of the current dm history port
	 * @param portCode the port code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm history port
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortException if a dm history port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPort[] findByPortCode_PrevAndNext(int id, String portCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmHistoryPortException, SystemException {
		DmHistoryPort dmHistoryPort = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmHistoryPort[] array = new DmHistoryPortImpl[3];

			array[0] = getByPortCode_PrevAndNext(session, dmHistoryPort,
					portCode, orderByComparator, true);

			array[1] = dmHistoryPort;

			array[2] = getByPortCode_PrevAndNext(session, dmHistoryPort,
					portCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmHistoryPort getByPortCode_PrevAndNext(Session session,
		DmHistoryPort dmHistoryPort, String portCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMHISTORYPORT_WHERE);

		boolean bindPortCode = false;

		if (portCode == null) {
			query.append(_FINDER_COLUMN_PORTCODE_PORTCODE_1);
		}
		else if (portCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PORTCODE_PORTCODE_3);
		}
		else {
			bindPortCode = true;

			query.append(_FINDER_COLUMN_PORTCODE_PORTCODE_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(DmHistoryPortModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindPortCode) {
			qPos.add(portCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmHistoryPort);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmHistoryPort> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm history ports where portCode = &#63; from the database.
	 *
	 * @param portCode the port code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPortCode(String portCode) throws SystemException {
		for (DmHistoryPort dmHistoryPort : findByPortCode(portCode,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dmHistoryPort);
		}
	}

	/**
	 * Returns the number of dm history ports where portCode = &#63;.
	 *
	 * @param portCode the port code
	 * @return the number of matching dm history ports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPortCode(String portCode) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PORTCODE;

		Object[] finderArgs = new Object[] { portCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMHISTORYPORT_WHERE);

			boolean bindPortCode = false;

			if (portCode == null) {
				query.append(_FINDER_COLUMN_PORTCODE_PORTCODE_1);
			}
			else if (portCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PORTCODE_PORTCODE_3);
			}
			else {
				bindPortCode = true;

				query.append(_FINDER_COLUMN_PORTCODE_PORTCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPortCode) {
					qPos.add(portCode);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_PORTCODE_PORTCODE_1 = "dmHistoryPort.portCode IS NULL";
	private static final String _FINDER_COLUMN_PORTCODE_PORTCODE_2 = "dmHistoryPort.portCode = ?";
	private static final String _FINDER_COLUMN_PORTCODE_PORTCODE_3 = "(dmHistoryPort.portCode IS NULL OR dmHistoryPort.portCode = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_PORTCODEANDSYNCVERSION = new FinderPath(DmHistoryPortModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryPortImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByPortCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() },
			DmHistoryPortModelImpl.PORTCODE_COLUMN_BITMASK |
			DmHistoryPortModelImpl.SYNCVERSION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PORTCODEANDSYNCVERSION = new FinderPath(DmHistoryPortModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByPortCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns the dm history port where portCode = &#63; and syncVersion = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortException} if it could not be found.
	 *
	 * @param portCode the port code
	 * @param syncVersion the sync version
	 * @return the matching dm history port
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortException if a matching dm history port could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPort findByPortCodeAndSyncVersion(String portCode,
		String syncVersion)
		throws NoSuchDmHistoryPortException, SystemException {
		DmHistoryPort dmHistoryPort = fetchByPortCodeAndSyncVersion(portCode,
				syncVersion);

		if (dmHistoryPort == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("portCode=");
			msg.append(portCode);

			msg.append(", syncVersion=");
			msg.append(syncVersion);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmHistoryPortException(msg.toString());
		}

		return dmHistoryPort;
	}

	/**
	 * Returns the dm history port where portCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param portCode the port code
	 * @param syncVersion the sync version
	 * @return the matching dm history port, or <code>null</code> if a matching dm history port could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPort fetchByPortCodeAndSyncVersion(String portCode,
		String syncVersion) throws SystemException {
		return fetchByPortCodeAndSyncVersion(portCode, syncVersion, true);
	}

	/**
	 * Returns the dm history port where portCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param portCode the port code
	 * @param syncVersion the sync version
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm history port, or <code>null</code> if a matching dm history port could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPort fetchByPortCodeAndSyncVersion(String portCode,
		String syncVersion, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { portCode, syncVersion };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_PORTCODEANDSYNCVERSION,
					finderArgs, this);
		}

		if (result instanceof DmHistoryPort) {
			DmHistoryPort dmHistoryPort = (DmHistoryPort)result;

			if (!Validator.equals(portCode, dmHistoryPort.getPortCode()) ||
					!Validator.equals(syncVersion,
						dmHistoryPort.getSyncVersion())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DMHISTORYPORT_WHERE);

			boolean bindPortCode = false;

			if (portCode == null) {
				query.append(_FINDER_COLUMN_PORTCODEANDSYNCVERSION_PORTCODE_1);
			}
			else if (portCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PORTCODEANDSYNCVERSION_PORTCODE_3);
			}
			else {
				bindPortCode = true;

				query.append(_FINDER_COLUMN_PORTCODEANDSYNCVERSION_PORTCODE_2);
			}

			boolean bindSyncVersion = false;

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_PORTCODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else if (syncVersion.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PORTCODEANDSYNCVERSION_SYNCVERSION_3);
			}
			else {
				bindSyncVersion = true;

				query.append(_FINDER_COLUMN_PORTCODEANDSYNCVERSION_SYNCVERSION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPortCode) {
					qPos.add(portCode);
				}

				if (bindSyncVersion) {
					qPos.add(syncVersion);
				}

				List<DmHistoryPort> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PORTCODEANDSYNCVERSION,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DmHistoryPortPersistenceImpl.fetchByPortCodeAndSyncVersion(String, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DmHistoryPort dmHistoryPort = list.get(0);

					result = dmHistoryPort;

					cacheResult(dmHistoryPort);

					if ((dmHistoryPort.getPortCode() == null) ||
							!dmHistoryPort.getPortCode().equals(portCode) ||
							(dmHistoryPort.getSyncVersion() == null) ||
							!dmHistoryPort.getSyncVersion().equals(syncVersion)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PORTCODEANDSYNCVERSION,
							finderArgs, dmHistoryPort);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PORTCODEANDSYNCVERSION,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (DmHistoryPort)result;
		}
	}

	/**
	 * Removes the dm history port where portCode = &#63; and syncVersion = &#63; from the database.
	 *
	 * @param portCode the port code
	 * @param syncVersion the sync version
	 * @return the dm history port that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPort removeByPortCodeAndSyncVersion(String portCode,
		String syncVersion)
		throws NoSuchDmHistoryPortException, SystemException {
		DmHistoryPort dmHistoryPort = findByPortCodeAndSyncVersion(portCode,
				syncVersion);

		return remove(dmHistoryPort);
	}

	/**
	 * Returns the number of dm history ports where portCode = &#63; and syncVersion = &#63;.
	 *
	 * @param portCode the port code
	 * @param syncVersion the sync version
	 * @return the number of matching dm history ports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPortCodeAndSyncVersion(String portCode, String syncVersion)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PORTCODEANDSYNCVERSION;

		Object[] finderArgs = new Object[] { portCode, syncVersion };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMHISTORYPORT_WHERE);

			boolean bindPortCode = false;

			if (portCode == null) {
				query.append(_FINDER_COLUMN_PORTCODEANDSYNCVERSION_PORTCODE_1);
			}
			else if (portCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PORTCODEANDSYNCVERSION_PORTCODE_3);
			}
			else {
				bindPortCode = true;

				query.append(_FINDER_COLUMN_PORTCODEANDSYNCVERSION_PORTCODE_2);
			}

			boolean bindSyncVersion = false;

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_PORTCODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else if (syncVersion.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PORTCODEANDSYNCVERSION_SYNCVERSION_3);
			}
			else {
				bindSyncVersion = true;

				query.append(_FINDER_COLUMN_PORTCODEANDSYNCVERSION_SYNCVERSION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPortCode) {
					qPos.add(portCode);
				}

				if (bindSyncVersion) {
					qPos.add(syncVersion);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_PORTCODEANDSYNCVERSION_PORTCODE_1 =
		"dmHistoryPort.portCode IS NULL AND ";
	private static final String _FINDER_COLUMN_PORTCODEANDSYNCVERSION_PORTCODE_2 =
		"dmHistoryPort.portCode = ? AND ";
	private static final String _FINDER_COLUMN_PORTCODEANDSYNCVERSION_PORTCODE_3 =
		"(dmHistoryPort.portCode IS NULL OR dmHistoryPort.portCode = '') AND ";
	private static final String _FINDER_COLUMN_PORTCODEANDSYNCVERSION_SYNCVERSION_1 =
		"dmHistoryPort.syncVersion IS NULL";
	private static final String _FINDER_COLUMN_PORTCODEANDSYNCVERSION_SYNCVERSION_2 =
		"dmHistoryPort.syncVersion = ?";
	private static final String _FINDER_COLUMN_PORTCODEANDSYNCVERSION_SYNCVERSION_3 =
		"(dmHistoryPort.syncVersion IS NULL OR dmHistoryPort.syncVersion = '')";

	public DmHistoryPortPersistenceImpl() {
		setModelClass(DmHistoryPort.class);
	}

	/**
	 * Caches the dm history port in the entity cache if it is enabled.
	 *
	 * @param dmHistoryPort the dm history port
	 */
	@Override
	public void cacheResult(DmHistoryPort dmHistoryPort) {
		EntityCacheUtil.putResult(DmHistoryPortModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortImpl.class, dmHistoryPort.getPrimaryKey(),
			dmHistoryPort);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PORTCODEANDSYNCVERSION,
			new Object[] {
				dmHistoryPort.getPortCode(), dmHistoryPort.getSyncVersion()
			}, dmHistoryPort);

		dmHistoryPort.resetOriginalValues();
	}

	/**
	 * Caches the dm history ports in the entity cache if it is enabled.
	 *
	 * @param dmHistoryPorts the dm history ports
	 */
	@Override
	public void cacheResult(List<DmHistoryPort> dmHistoryPorts) {
		for (DmHistoryPort dmHistoryPort : dmHistoryPorts) {
			if (EntityCacheUtil.getResult(
						DmHistoryPortModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryPortImpl.class, dmHistoryPort.getPrimaryKey()) == null) {
				cacheResult(dmHistoryPort);
			}
			else {
				dmHistoryPort.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm history ports.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmHistoryPortImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmHistoryPortImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm history port.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmHistoryPort dmHistoryPort) {
		EntityCacheUtil.removeResult(DmHistoryPortModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortImpl.class, dmHistoryPort.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(dmHistoryPort);
	}

	@Override
	public void clearCache(List<DmHistoryPort> dmHistoryPorts) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmHistoryPort dmHistoryPort : dmHistoryPorts) {
			EntityCacheUtil.removeResult(DmHistoryPortModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryPortImpl.class, dmHistoryPort.getPrimaryKey());

			clearUniqueFindersCache(dmHistoryPort);
		}
	}

	protected void cacheUniqueFindersCache(DmHistoryPort dmHistoryPort) {
		if (dmHistoryPort.isNew()) {
			Object[] args = new Object[] {
					dmHistoryPort.getPortCode(), dmHistoryPort.getSyncVersion()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PORTCODEANDSYNCVERSION,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PORTCODEANDSYNCVERSION,
				args, dmHistoryPort);
		}
		else {
			DmHistoryPortModelImpl dmHistoryPortModelImpl = (DmHistoryPortModelImpl)dmHistoryPort;

			if ((dmHistoryPortModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_PORTCODEANDSYNCVERSION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryPort.getPortCode(),
						dmHistoryPort.getSyncVersion()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PORTCODEANDSYNCVERSION,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PORTCODEANDSYNCVERSION,
					args, dmHistoryPort);
			}
		}
	}

	protected void clearUniqueFindersCache(DmHistoryPort dmHistoryPort) {
		DmHistoryPortModelImpl dmHistoryPortModelImpl = (DmHistoryPortModelImpl)dmHistoryPort;

		Object[] args = new Object[] {
				dmHistoryPort.getPortCode(), dmHistoryPort.getSyncVersion()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTCODEANDSYNCVERSION,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PORTCODEANDSYNCVERSION,
			args);

		if ((dmHistoryPortModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_PORTCODEANDSYNCVERSION.getColumnBitmask()) != 0) {
			args = new Object[] {
					dmHistoryPortModelImpl.getOriginalPortCode(),
					dmHistoryPortModelImpl.getOriginalSyncVersion()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTCODEANDSYNCVERSION,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PORTCODEANDSYNCVERSION,
				args);
		}
	}

	/**
	 * Creates a new dm history port with the primary key. Does not add the dm history port to the database.
	 *
	 * @param id the primary key for the new dm history port
	 * @return the new dm history port
	 */
	@Override
	public DmHistoryPort create(int id) {
		DmHistoryPort dmHistoryPort = new DmHistoryPortImpl();

		dmHistoryPort.setNew(true);
		dmHistoryPort.setPrimaryKey(id);

		return dmHistoryPort;
	}

	/**
	 * Removes the dm history port with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm history port
	 * @return the dm history port that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortException if a dm history port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPort remove(int id)
		throws NoSuchDmHistoryPortException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the dm history port with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm history port
	 * @return the dm history port that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortException if a dm history port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPort remove(Serializable primaryKey)
		throws NoSuchDmHistoryPortException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmHistoryPort dmHistoryPort = (DmHistoryPort)session.get(DmHistoryPortImpl.class,
					primaryKey);

			if (dmHistoryPort == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmHistoryPortException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmHistoryPort);
		}
		catch (NoSuchDmHistoryPortException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected DmHistoryPort removeImpl(DmHistoryPort dmHistoryPort)
		throws SystemException {
		dmHistoryPort = toUnwrappedModel(dmHistoryPort);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dmHistoryPort)) {
				dmHistoryPort = (DmHistoryPort)session.get(DmHistoryPortImpl.class,
						dmHistoryPort.getPrimaryKeyObj());
			}

			if (dmHistoryPort != null) {
				session.delete(dmHistoryPort);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dmHistoryPort != null) {
			clearCache(dmHistoryPort);
		}

		return dmHistoryPort;
	}

	@Override
	public DmHistoryPort updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryPort dmHistoryPort)
		throws SystemException {
		dmHistoryPort = toUnwrappedModel(dmHistoryPort);

		boolean isNew = dmHistoryPort.isNew();

		DmHistoryPortModelImpl dmHistoryPortModelImpl = (DmHistoryPortModelImpl)dmHistoryPort;

		Session session = null;

		try {
			session = openSession();

			if (dmHistoryPort.isNew()) {
				session.save(dmHistoryPort);

				dmHistoryPort.setNew(false);
			}
			else {
				session.merge(dmHistoryPort);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmHistoryPortModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmHistoryPortModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryPortModelImpl.getOriginalPortCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTCODE,
					args);

				args = new Object[] { dmHistoryPortModelImpl.getPortCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmHistoryPortModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortImpl.class, dmHistoryPort.getPrimaryKey(),
			dmHistoryPort);

		clearUniqueFindersCache(dmHistoryPort);
		cacheUniqueFindersCache(dmHistoryPort);

		return dmHistoryPort;
	}

	protected DmHistoryPort toUnwrappedModel(DmHistoryPort dmHistoryPort) {
		if (dmHistoryPort instanceof DmHistoryPortImpl) {
			return dmHistoryPort;
		}

		DmHistoryPortImpl dmHistoryPortImpl = new DmHistoryPortImpl();

		dmHistoryPortImpl.setNew(dmHistoryPort.isNew());
		dmHistoryPortImpl.setPrimaryKey(dmHistoryPort.getPrimaryKey());

		dmHistoryPortImpl.setId(dmHistoryPort.getId());
		dmHistoryPortImpl.setPortCode(dmHistoryPort.getPortCode());
		dmHistoryPortImpl.setLoCode(dmHistoryPort.getLoCode());
		dmHistoryPortImpl.setPortName(dmHistoryPort.getPortName());
		dmHistoryPortImpl.setFullName(dmHistoryPort.getFullName());
		dmHistoryPortImpl.setFullNameVN(dmHistoryPort.getFullNameVN());
		dmHistoryPortImpl.setPortType(dmHistoryPort.getPortType());
		dmHistoryPortImpl.setPortOrder(dmHistoryPort.getPortOrder());
		dmHistoryPortImpl.setAddress(dmHistoryPort.getAddress());
		dmHistoryPortImpl.setAddressVN(dmHistoryPort.getAddressVN());
		dmHistoryPortImpl.setStateCode(dmHistoryPort.getStateCode());
		dmHistoryPortImpl.setCitycode(dmHistoryPort.getCitycode());
		dmHistoryPortImpl.setIsDelete(dmHistoryPort.getIsDelete());
		dmHistoryPortImpl.setMarkedAsDelete(dmHistoryPort.getMarkedAsDelete());
		dmHistoryPortImpl.setModifiedDate(dmHistoryPort.getModifiedDate());
		dmHistoryPortImpl.setRequestedDate(dmHistoryPort.getRequestedDate());
		dmHistoryPortImpl.setSyncVersion(dmHistoryPort.getSyncVersion());

		return dmHistoryPortImpl;
	}

	/**
	 * Returns the dm history port with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history port
	 * @return the dm history port
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortException if a dm history port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPort findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDmHistoryPortException, SystemException {
		DmHistoryPort dmHistoryPort = fetchByPrimaryKey(primaryKey);

		if (dmHistoryPort == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDmHistoryPortException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dmHistoryPort;
	}

	/**
	 * Returns the dm history port with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortException} if it could not be found.
	 *
	 * @param id the primary key of the dm history port
	 * @return the dm history port
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortException if a dm history port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPort findByPrimaryKey(int id)
		throws NoSuchDmHistoryPortException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dm history port with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history port
	 * @return the dm history port, or <code>null</code> if a dm history port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPort fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DmHistoryPort dmHistoryPort = (DmHistoryPort)EntityCacheUtil.getResult(DmHistoryPortModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryPortImpl.class, primaryKey);

		if (dmHistoryPort == _nullDmHistoryPort) {
			return null;
		}

		if (dmHistoryPort == null) {
			Session session = null;

			try {
				session = openSession();

				dmHistoryPort = (DmHistoryPort)session.get(DmHistoryPortImpl.class,
						primaryKey);

				if (dmHistoryPort != null) {
					cacheResult(dmHistoryPort);
				}
				else {
					EntityCacheUtil.putResult(DmHistoryPortModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryPortImpl.class, primaryKey, _nullDmHistoryPort);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DmHistoryPortModelImpl.ENTITY_CACHE_ENABLED,
					DmHistoryPortImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dmHistoryPort;
	}

	/**
	 * Returns the dm history port with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm history port
	 * @return the dm history port, or <code>null</code> if a dm history port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPort fetchByPrimaryKey(int id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the dm history ports.
	 *
	 * @return the dm history ports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryPort> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history ports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPortModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history ports
	 * @param end the upper bound of the range of dm history ports (not inclusive)
	 * @return the range of dm history ports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryPort> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history ports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPortModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history ports
	 * @param end the upper bound of the range of dm history ports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm history ports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryPort> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<DmHistoryPort> list = (List<DmHistoryPort>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMHISTORYPORT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMHISTORYPORT;

				if (pagination) {
					sql = sql.concat(DmHistoryPortModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DmHistoryPort>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmHistoryPort>(list);
				}
				else {
					list = (List<DmHistoryPort>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the dm history ports from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DmHistoryPort dmHistoryPort : findAll()) {
			remove(dmHistoryPort);
		}
	}

	/**
	 * Returns the number of dm history ports.
	 *
	 * @return the number of dm history ports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DMHISTORYPORT);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the dm history port persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.DmHistoryPort")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmHistoryPort>> listenersList = new ArrayList<ModelListener<DmHistoryPort>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmHistoryPort>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(DmHistoryPortImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DMHISTORYPORT = "SELECT dmHistoryPort FROM DmHistoryPort dmHistoryPort";
	private static final String _SQL_SELECT_DMHISTORYPORT_WHERE = "SELECT dmHistoryPort FROM DmHistoryPort dmHistoryPort WHERE ";
	private static final String _SQL_COUNT_DMHISTORYPORT = "SELECT COUNT(dmHistoryPort) FROM DmHistoryPort dmHistoryPort";
	private static final String _SQL_COUNT_DMHISTORYPORT_WHERE = "SELECT COUNT(dmHistoryPort) FROM DmHistoryPort dmHistoryPort WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmHistoryPort.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmHistoryPort exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmHistoryPort exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmHistoryPortPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"portCode", "loCode", "portName", "fullName", "fullNameVN",
				"portType", "portOrder", "address", "addressVN", "stateCode",
				"citycode", "isDelete", "markedAsDelete", "modifiedDate",
				"requestedDate", "syncVersion"
			});
	private static DmHistoryPort _nullDmHistoryPort = new DmHistoryPortImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmHistoryPort> toCacheModel() {
				return _nullDmHistoryPortCacheModel;
			}
		};

	private static CacheModel<DmHistoryPort> _nullDmHistoryPortCacheModel = new CacheModel<DmHistoryPort>() {
			@Override
			public DmHistoryPort toEntityModel() {
				return _nullDmHistoryPort;
			}
		};
}