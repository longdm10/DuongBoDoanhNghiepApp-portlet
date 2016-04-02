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

import vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException;
import vn.dtt.duongbien.dao.vrcb.model.DmPort;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmPortImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmPortModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dm port service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmPortPersistence
 * @see DmPortUtil
 * @generated
 */
public class DmPortPersistenceImpl extends BasePersistenceImpl<DmPort>
	implements DmPortPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmPortUtil} to access the dm port persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmPortImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmPortModelImpl.ENTITY_CACHE_ENABLED,
			DmPortModelImpl.FINDER_CACHE_ENABLED, DmPortImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmPortModelImpl.ENTITY_CACHE_ENABLED,
			DmPortModelImpl.FINDER_CACHE_ENABLED, DmPortImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmPortModelImpl.ENTITY_CACHE_ENABLED,
			DmPortModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PORTCODE = new FinderPath(DmPortModelImpl.ENTITY_CACHE_ENABLED,
			DmPortModelImpl.FINDER_CACHE_ENABLED, DmPortImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPortCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTCODE =
		new FinderPath(DmPortModelImpl.ENTITY_CACHE_ENABLED,
			DmPortModelImpl.FINDER_CACHE_ENABLED, DmPortImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPortCode",
			new String[] { String.class.getName() },
			DmPortModelImpl.PORTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PORTCODE = new FinderPath(DmPortModelImpl.ENTITY_CACHE_ENABLED,
			DmPortModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPortCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the dm ports where portCode = &#63;.
	 *
	 * @param portCode the port code
	 * @return the matching dm ports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmPort> findByPortCode(String portCode)
		throws SystemException {
		return findByPortCode(portCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the dm ports where portCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param portCode the port code
	 * @param start the lower bound of the range of dm ports
	 * @param end the upper bound of the range of dm ports (not inclusive)
	 * @return the range of matching dm ports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmPort> findByPortCode(String portCode, int start, int end)
		throws SystemException {
		return findByPortCode(portCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm ports where portCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param portCode the port code
	 * @param start the lower bound of the range of dm ports
	 * @param end the upper bound of the range of dm ports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm ports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmPort> findByPortCode(String portCode, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
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

		List<DmPort> list = (List<DmPort>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmPort dmPort : list) {
				if (!Validator.equals(portCode, dmPort.getPortCode())) {
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

			query.append(_SQL_SELECT_DMPORT_WHERE);

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
				query.append(DmPortModelImpl.ORDER_BY_JPQL);
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
					list = (List<DmPort>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmPort>(list);
				}
				else {
					list = (List<DmPort>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first dm port in the ordered set where portCode = &#63;.
	 *
	 * @param portCode the port code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm port
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException if a matching dm port could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPort findByPortCode_First(String portCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmPortException, SystemException {
		DmPort dmPort = fetchByPortCode_First(portCode, orderByComparator);

		if (dmPort != null) {
			return dmPort;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("portCode=");
		msg.append(portCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmPortException(msg.toString());
	}

	/**
	 * Returns the first dm port in the ordered set where portCode = &#63;.
	 *
	 * @param portCode the port code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm port, or <code>null</code> if a matching dm port could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPort fetchByPortCode_First(String portCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<DmPort> list = findByPortCode(portCode, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm port in the ordered set where portCode = &#63;.
	 *
	 * @param portCode the port code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm port
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException if a matching dm port could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPort findByPortCode_Last(String portCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmPortException, SystemException {
		DmPort dmPort = fetchByPortCode_Last(portCode, orderByComparator);

		if (dmPort != null) {
			return dmPort;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("portCode=");
		msg.append(portCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmPortException(msg.toString());
	}

	/**
	 * Returns the last dm port in the ordered set where portCode = &#63;.
	 *
	 * @param portCode the port code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm port, or <code>null</code> if a matching dm port could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPort fetchByPortCode_Last(String portCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByPortCode(portCode);

		if (count == 0) {
			return null;
		}

		List<DmPort> list = findByPortCode(portCode, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm ports before and after the current dm port in the ordered set where portCode = &#63;.
	 *
	 * @param id the primary key of the current dm port
	 * @param portCode the port code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm port
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException if a dm port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPort[] findByPortCode_PrevAndNext(int id, String portCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmPortException, SystemException {
		DmPort dmPort = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmPort[] array = new DmPortImpl[3];

			array[0] = getByPortCode_PrevAndNext(session, dmPort, portCode,
					orderByComparator, true);

			array[1] = dmPort;

			array[2] = getByPortCode_PrevAndNext(session, dmPort, portCode,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmPort getByPortCode_PrevAndNext(Session session, DmPort dmPort,
		String portCode, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMPORT_WHERE);

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
			query.append(DmPortModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(dmPort);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmPort> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm ports where portCode = &#63; from the database.
	 *
	 * @param portCode the port code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPortCode(String portCode) throws SystemException {
		for (DmPort dmPort : findByPortCode(portCode, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(dmPort);
		}
	}

	/**
	 * Returns the number of dm ports where portCode = &#63;.
	 *
	 * @param portCode the port code
	 * @return the number of matching dm ports
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

			query.append(_SQL_COUNT_DMPORT_WHERE);

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

	private static final String _FINDER_COLUMN_PORTCODE_PORTCODE_1 = "dmPort.portCode IS NULL";
	private static final String _FINDER_COLUMN_PORTCODE_PORTCODE_2 = "dmPort.portCode = ?";
	private static final String _FINDER_COLUMN_PORTCODE_PORTCODE_3 = "(dmPort.portCode IS NULL OR dmPort.portCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LOCODE = new FinderPath(DmPortModelImpl.ENTITY_CACHE_ENABLED,
			DmPortModelImpl.FINDER_CACHE_ENABLED, DmPortImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByLoCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCODE =
		new FinderPath(DmPortModelImpl.ENTITY_CACHE_ENABLED,
			DmPortModelImpl.FINDER_CACHE_ENABLED, DmPortImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByLoCode",
			new String[] { String.class.getName() },
			DmPortModelImpl.LOCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LOCODE = new FinderPath(DmPortModelImpl.ENTITY_CACHE_ENABLED,
			DmPortModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByLoCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the dm ports where loCode = &#63;.
	 *
	 * @param loCode the lo code
	 * @return the matching dm ports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmPort> findByLoCode(String loCode) throws SystemException {
		return findByLoCode(loCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm ports where loCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param loCode the lo code
	 * @param start the lower bound of the range of dm ports
	 * @param end the upper bound of the range of dm ports (not inclusive)
	 * @return the range of matching dm ports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmPort> findByLoCode(String loCode, int start, int end)
		throws SystemException {
		return findByLoCode(loCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm ports where loCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param loCode the lo code
	 * @param start the lower bound of the range of dm ports
	 * @param end the upper bound of the range of dm ports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm ports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmPort> findByLoCode(String loCode, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCODE;
			finderArgs = new Object[] { loCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LOCODE;
			finderArgs = new Object[] { loCode, start, end, orderByComparator };
		}

		List<DmPort> list = (List<DmPort>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmPort dmPort : list) {
				if (!Validator.equals(loCode, dmPort.getLoCode())) {
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

			query.append(_SQL_SELECT_DMPORT_WHERE);

			boolean bindLoCode = false;

			if (loCode == null) {
				query.append(_FINDER_COLUMN_LOCODE_LOCODE_1);
			}
			else if (loCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LOCODE_LOCODE_3);
			}
			else {
				bindLoCode = true;

				query.append(_FINDER_COLUMN_LOCODE_LOCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DmPortModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindLoCode) {
					qPos.add(loCode);
				}

				if (!pagination) {
					list = (List<DmPort>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmPort>(list);
				}
				else {
					list = (List<DmPort>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first dm port in the ordered set where loCode = &#63;.
	 *
	 * @param loCode the lo code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm port
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException if a matching dm port could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPort findByLoCode_First(String loCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmPortException, SystemException {
		DmPort dmPort = fetchByLoCode_First(loCode, orderByComparator);

		if (dmPort != null) {
			return dmPort;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("loCode=");
		msg.append(loCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmPortException(msg.toString());
	}

	/**
	 * Returns the first dm port in the ordered set where loCode = &#63;.
	 *
	 * @param loCode the lo code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm port, or <code>null</code> if a matching dm port could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPort fetchByLoCode_First(String loCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<DmPort> list = findByLoCode(loCode, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm port in the ordered set where loCode = &#63;.
	 *
	 * @param loCode the lo code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm port
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException if a matching dm port could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPort findByLoCode_Last(String loCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmPortException, SystemException {
		DmPort dmPort = fetchByLoCode_Last(loCode, orderByComparator);

		if (dmPort != null) {
			return dmPort;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("loCode=");
		msg.append(loCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmPortException(msg.toString());
	}

	/**
	 * Returns the last dm port in the ordered set where loCode = &#63;.
	 *
	 * @param loCode the lo code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm port, or <code>null</code> if a matching dm port could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPort fetchByLoCode_Last(String loCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByLoCode(loCode);

		if (count == 0) {
			return null;
		}

		List<DmPort> list = findByLoCode(loCode, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm ports before and after the current dm port in the ordered set where loCode = &#63;.
	 *
	 * @param id the primary key of the current dm port
	 * @param loCode the lo code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm port
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException if a dm port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPort[] findByLoCode_PrevAndNext(int id, String loCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmPortException, SystemException {
		DmPort dmPort = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmPort[] array = new DmPortImpl[3];

			array[0] = getByLoCode_PrevAndNext(session, dmPort, loCode,
					orderByComparator, true);

			array[1] = dmPort;

			array[2] = getByLoCode_PrevAndNext(session, dmPort, loCode,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmPort getByLoCode_PrevAndNext(Session session, DmPort dmPort,
		String loCode, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMPORT_WHERE);

		boolean bindLoCode = false;

		if (loCode == null) {
			query.append(_FINDER_COLUMN_LOCODE_LOCODE_1);
		}
		else if (loCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_LOCODE_LOCODE_3);
		}
		else {
			bindLoCode = true;

			query.append(_FINDER_COLUMN_LOCODE_LOCODE_2);
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
			query.append(DmPortModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindLoCode) {
			qPos.add(loCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmPort);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmPort> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm ports where loCode = &#63; from the database.
	 *
	 * @param loCode the lo code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByLoCode(String loCode) throws SystemException {
		for (DmPort dmPort : findByLoCode(loCode, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(dmPort);
		}
	}

	/**
	 * Returns the number of dm ports where loCode = &#63;.
	 *
	 * @param loCode the lo code
	 * @return the number of matching dm ports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByLoCode(String loCode) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LOCODE;

		Object[] finderArgs = new Object[] { loCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMPORT_WHERE);

			boolean bindLoCode = false;

			if (loCode == null) {
				query.append(_FINDER_COLUMN_LOCODE_LOCODE_1);
			}
			else if (loCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LOCODE_LOCODE_3);
			}
			else {
				bindLoCode = true;

				query.append(_FINDER_COLUMN_LOCODE_LOCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindLoCode) {
					qPos.add(loCode);
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

	private static final String _FINDER_COLUMN_LOCODE_LOCODE_1 = "dmPort.loCode IS NULL";
	private static final String _FINDER_COLUMN_LOCODE_LOCODE_2 = "dmPort.loCode = ?";
	private static final String _FINDER_COLUMN_LOCODE_LOCODE_3 = "(dmPort.loCode IS NULL OR dmPort.loCode = '')";

	public DmPortPersistenceImpl() {
		setModelClass(DmPort.class);
	}

	/**
	 * Caches the dm port in the entity cache if it is enabled.
	 *
	 * @param dmPort the dm port
	 */
	@Override
	public void cacheResult(DmPort dmPort) {
		EntityCacheUtil.putResult(DmPortModelImpl.ENTITY_CACHE_ENABLED,
			DmPortImpl.class, dmPort.getPrimaryKey(), dmPort);

		dmPort.resetOriginalValues();
	}

	/**
	 * Caches the dm ports in the entity cache if it is enabled.
	 *
	 * @param dmPorts the dm ports
	 */
	@Override
	public void cacheResult(List<DmPort> dmPorts) {
		for (DmPort dmPort : dmPorts) {
			if (EntityCacheUtil.getResult(
						DmPortModelImpl.ENTITY_CACHE_ENABLED, DmPortImpl.class,
						dmPort.getPrimaryKey()) == null) {
				cacheResult(dmPort);
			}
			else {
				dmPort.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm ports.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmPortImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmPortImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm port.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmPort dmPort) {
		EntityCacheUtil.removeResult(DmPortModelImpl.ENTITY_CACHE_ENABLED,
			DmPortImpl.class, dmPort.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DmPort> dmPorts) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmPort dmPort : dmPorts) {
			EntityCacheUtil.removeResult(DmPortModelImpl.ENTITY_CACHE_ENABLED,
				DmPortImpl.class, dmPort.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dm port with the primary key. Does not add the dm port to the database.
	 *
	 * @param id the primary key for the new dm port
	 * @return the new dm port
	 */
	@Override
	public DmPort create(int id) {
		DmPort dmPort = new DmPortImpl();

		dmPort.setNew(true);
		dmPort.setPrimaryKey(id);

		return dmPort;
	}

	/**
	 * Removes the dm port with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm port
	 * @return the dm port that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException if a dm port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPort remove(int id) throws NoSuchDmPortException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the dm port with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm port
	 * @return the dm port that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException if a dm port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPort remove(Serializable primaryKey)
		throws NoSuchDmPortException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmPort dmPort = (DmPort)session.get(DmPortImpl.class, primaryKey);

			if (dmPort == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmPortException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmPort);
		}
		catch (NoSuchDmPortException nsee) {
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
	protected DmPort removeImpl(DmPort dmPort) throws SystemException {
		dmPort = toUnwrappedModel(dmPort);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dmPort)) {
				dmPort = (DmPort)session.get(DmPortImpl.class,
						dmPort.getPrimaryKeyObj());
			}

			if (dmPort != null) {
				session.delete(dmPort);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dmPort != null) {
			clearCache(dmPort);
		}

		return dmPort;
	}

	@Override
	public DmPort updateImpl(vn.dtt.duongbien.dao.vrcb.model.DmPort dmPort)
		throws SystemException {
		dmPort = toUnwrappedModel(dmPort);

		boolean isNew = dmPort.isNew();

		DmPortModelImpl dmPortModelImpl = (DmPortModelImpl)dmPort;

		Session session = null;

		try {
			session = openSession();

			if (dmPort.isNew()) {
				session.save(dmPort);

				dmPort.setNew(false);
			}
			else {
				session.merge(dmPort);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmPortModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmPortModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmPortModelImpl.getOriginalPortCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTCODE,
					args);

				args = new Object[] { dmPortModelImpl.getPortCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTCODE,
					args);
			}

			if ((dmPortModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { dmPortModelImpl.getOriginalLoCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LOCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCODE,
					args);

				args = new Object[] { dmPortModelImpl.getLoCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LOCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmPortModelImpl.ENTITY_CACHE_ENABLED,
			DmPortImpl.class, dmPort.getPrimaryKey(), dmPort);

		return dmPort;
	}

	protected DmPort toUnwrappedModel(DmPort dmPort) {
		if (dmPort instanceof DmPortImpl) {
			return dmPort;
		}

		DmPortImpl dmPortImpl = new DmPortImpl();

		dmPortImpl.setNew(dmPort.isNew());
		dmPortImpl.setPrimaryKey(dmPort.getPrimaryKey());

		dmPortImpl.setId(dmPort.getId());
		dmPortImpl.setPortCode(dmPort.getPortCode());
		dmPortImpl.setLoCode(dmPort.getLoCode());
		dmPortImpl.setPortName(dmPort.getPortName());
		dmPortImpl.setFullName(dmPort.getFullName());
		dmPortImpl.setFullNameVN(dmPort.getFullNameVN());
		dmPortImpl.setPortType(dmPort.getPortType());
		dmPortImpl.setPortOrder(dmPort.getPortOrder());
		dmPortImpl.setAddress(dmPort.getAddress());
		dmPortImpl.setAddressVN(dmPort.getAddressVN());
		dmPortImpl.setStateCode(dmPort.getStateCode());
		dmPortImpl.setCitycode(dmPort.getCitycode());
		dmPortImpl.setIsDelete(dmPort.getIsDelete());
		dmPortImpl.setMarkedAsDelete(dmPort.getMarkedAsDelete());
		dmPortImpl.setModifiedDate(dmPort.getModifiedDate());
		dmPortImpl.setRequestedDate(dmPort.getRequestedDate());
		dmPortImpl.setSyncVersion(dmPort.getSyncVersion());

		return dmPortImpl;
	}

	/**
	 * Returns the dm port with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm port
	 * @return the dm port
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException if a dm port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPort findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDmPortException, SystemException {
		DmPort dmPort = fetchByPrimaryKey(primaryKey);

		if (dmPort == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDmPortException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dmPort;
	}

	/**
	 * Returns the dm port with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException} if it could not be found.
	 *
	 * @param id the primary key of the dm port
	 * @return the dm port
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException if a dm port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPort findByPrimaryKey(int id)
		throws NoSuchDmPortException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dm port with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm port
	 * @return the dm port, or <code>null</code> if a dm port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPort fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DmPort dmPort = (DmPort)EntityCacheUtil.getResult(DmPortModelImpl.ENTITY_CACHE_ENABLED,
				DmPortImpl.class, primaryKey);

		if (dmPort == _nullDmPort) {
			return null;
		}

		if (dmPort == null) {
			Session session = null;

			try {
				session = openSession();

				dmPort = (DmPort)session.get(DmPortImpl.class, primaryKey);

				if (dmPort != null) {
					cacheResult(dmPort);
				}
				else {
					EntityCacheUtil.putResult(DmPortModelImpl.ENTITY_CACHE_ENABLED,
						DmPortImpl.class, primaryKey, _nullDmPort);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DmPortModelImpl.ENTITY_CACHE_ENABLED,
					DmPortImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dmPort;
	}

	/**
	 * Returns the dm port with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm port
	 * @return the dm port, or <code>null</code> if a dm port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPort fetchByPrimaryKey(int id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the dm ports.
	 *
	 * @return the dm ports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmPort> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm ports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm ports
	 * @param end the upper bound of the range of dm ports (not inclusive)
	 * @return the range of dm ports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmPort> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm ports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm ports
	 * @param end the upper bound of the range of dm ports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm ports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmPort> findAll(int start, int end,
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

		List<DmPort> list = (List<DmPort>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMPORT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMPORT;

				if (pagination) {
					sql = sql.concat(DmPortModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DmPort>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmPort>(list);
				}
				else {
					list = (List<DmPort>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the dm ports from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DmPort dmPort : findAll()) {
			remove(dmPort);
		}
	}

	/**
	 * Returns the number of dm ports.
	 *
	 * @return the number of dm ports
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

				Query q = session.createQuery(_SQL_COUNT_DMPORT);

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
	 * Initializes the dm port persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.DmPort")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmPort>> listenersList = new ArrayList<ModelListener<DmPort>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmPort>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmPortImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DMPORT = "SELECT dmPort FROM DmPort dmPort";
	private static final String _SQL_SELECT_DMPORT_WHERE = "SELECT dmPort FROM DmPort dmPort WHERE ";
	private static final String _SQL_COUNT_DMPORT = "SELECT COUNT(dmPort) FROM DmPort dmPort";
	private static final String _SQL_COUNT_DMPORT_WHERE = "SELECT COUNT(dmPort) FROM DmPort dmPort WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmPort.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmPort exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmPort exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmPortPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"portCode", "loCode", "portName", "fullName", "fullNameVN",
				"portType", "portOrder", "address", "addressVN", "stateCode",
				"citycode", "isDelete", "markedAsDelete", "modifiedDate",
				"requestedDate", "syncVersion"
			});
	private static DmPort _nullDmPort = new DmPortImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmPort> toCacheModel() {
				return _nullDmPortCacheModel;
			}
		};

	private static CacheModel<DmPort> _nullDmPortCacheModel = new CacheModel<DmPort>() {
			@Override
			public DmPort toEntityModel() {
				return _nullDmPort;
			}
		};
}