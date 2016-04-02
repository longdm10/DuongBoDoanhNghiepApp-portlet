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

import vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryMaritimeException;
import vn.dtt.duongbien.dao.vrcb.model.DmHistoryMaritime;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryMaritimeImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryMaritimeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dm history maritime service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmHistoryMaritimePersistence
 * @see DmHistoryMaritimeUtil
 * @generated
 */
public class DmHistoryMaritimePersistenceImpl extends BasePersistenceImpl<DmHistoryMaritime>
	implements DmHistoryMaritimePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmHistoryMaritimeUtil} to access the dm history maritime persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmHistoryMaritimeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmHistoryMaritimeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryMaritimeModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryMaritimeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmHistoryMaritimeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryMaritimeModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryMaritimeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmHistoryMaritimeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryMaritimeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MARITIMECODE =
		new FinderPath(DmHistoryMaritimeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryMaritimeModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryMaritimeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByMaritimeCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MARITIMECODE =
		new FinderPath(DmHistoryMaritimeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryMaritimeModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryMaritimeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByMaritimeCode",
			new String[] { String.class.getName() },
			DmHistoryMaritimeModelImpl.MARITIMECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MARITIMECODE = new FinderPath(DmHistoryMaritimeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryMaritimeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMaritimeCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the dm history maritimes where maritimeCode = &#63;.
	 *
	 * @param maritimeCode the maritime code
	 * @return the matching dm history maritimes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryMaritime> findByMaritimeCode(String maritimeCode)
		throws SystemException {
		return findByMaritimeCode(maritimeCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history maritimes where maritimeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryMaritimeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param maritimeCode the maritime code
	 * @param start the lower bound of the range of dm history maritimes
	 * @param end the upper bound of the range of dm history maritimes (not inclusive)
	 * @return the range of matching dm history maritimes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryMaritime> findByMaritimeCode(String maritimeCode,
		int start, int end) throws SystemException {
		return findByMaritimeCode(maritimeCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history maritimes where maritimeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryMaritimeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param maritimeCode the maritime code
	 * @param start the lower bound of the range of dm history maritimes
	 * @param end the upper bound of the range of dm history maritimes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm history maritimes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryMaritime> findByMaritimeCode(String maritimeCode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MARITIMECODE;
			finderArgs = new Object[] { maritimeCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_MARITIMECODE;
			finderArgs = new Object[] {
					maritimeCode,
					
					start, end, orderByComparator
				};
		}

		List<DmHistoryMaritime> list = (List<DmHistoryMaritime>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmHistoryMaritime dmHistoryMaritime : list) {
				if (!Validator.equals(maritimeCode,
							dmHistoryMaritime.getMaritimeCode())) {
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

			query.append(_SQL_SELECT_DMHISTORYMARITIME_WHERE);

			boolean bindMaritimeCode = false;

			if (maritimeCode == null) {
				query.append(_FINDER_COLUMN_MARITIMECODE_MARITIMECODE_1);
			}
			else if (maritimeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MARITIMECODE_MARITIMECODE_3);
			}
			else {
				bindMaritimeCode = true;

				query.append(_FINDER_COLUMN_MARITIMECODE_MARITIMECODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DmHistoryMaritimeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaritimeCode) {
					qPos.add(maritimeCode);
				}

				if (!pagination) {
					list = (List<DmHistoryMaritime>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmHistoryMaritime>(list);
				}
				else {
					list = (List<DmHistoryMaritime>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first dm history maritime in the ordered set where maritimeCode = &#63;.
	 *
	 * @param maritimeCode the maritime code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm history maritime
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryMaritimeException if a matching dm history maritime could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryMaritime findByMaritimeCode_First(String maritimeCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmHistoryMaritimeException, SystemException {
		DmHistoryMaritime dmHistoryMaritime = fetchByMaritimeCode_First(maritimeCode,
				orderByComparator);

		if (dmHistoryMaritime != null) {
			return dmHistoryMaritime;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("maritimeCode=");
		msg.append(maritimeCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmHistoryMaritimeException(msg.toString());
	}

	/**
	 * Returns the first dm history maritime in the ordered set where maritimeCode = &#63;.
	 *
	 * @param maritimeCode the maritime code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm history maritime, or <code>null</code> if a matching dm history maritime could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryMaritime fetchByMaritimeCode_First(String maritimeCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<DmHistoryMaritime> list = findByMaritimeCode(maritimeCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm history maritime in the ordered set where maritimeCode = &#63;.
	 *
	 * @param maritimeCode the maritime code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm history maritime
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryMaritimeException if a matching dm history maritime could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryMaritime findByMaritimeCode_Last(String maritimeCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmHistoryMaritimeException, SystemException {
		DmHistoryMaritime dmHistoryMaritime = fetchByMaritimeCode_Last(maritimeCode,
				orderByComparator);

		if (dmHistoryMaritime != null) {
			return dmHistoryMaritime;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("maritimeCode=");
		msg.append(maritimeCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmHistoryMaritimeException(msg.toString());
	}

	/**
	 * Returns the last dm history maritime in the ordered set where maritimeCode = &#63;.
	 *
	 * @param maritimeCode the maritime code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm history maritime, or <code>null</code> if a matching dm history maritime could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryMaritime fetchByMaritimeCode_Last(String maritimeCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByMaritimeCode(maritimeCode);

		if (count == 0) {
			return null;
		}

		List<DmHistoryMaritime> list = findByMaritimeCode(maritimeCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm history maritimes before and after the current dm history maritime in the ordered set where maritimeCode = &#63;.
	 *
	 * @param id the primary key of the current dm history maritime
	 * @param maritimeCode the maritime code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm history maritime
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryMaritimeException if a dm history maritime with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryMaritime[] findByMaritimeCode_PrevAndNext(int id,
		String maritimeCode, OrderByComparator orderByComparator)
		throws NoSuchDmHistoryMaritimeException, SystemException {
		DmHistoryMaritime dmHistoryMaritime = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmHistoryMaritime[] array = new DmHistoryMaritimeImpl[3];

			array[0] = getByMaritimeCode_PrevAndNext(session,
					dmHistoryMaritime, maritimeCode, orderByComparator, true);

			array[1] = dmHistoryMaritime;

			array[2] = getByMaritimeCode_PrevAndNext(session,
					dmHistoryMaritime, maritimeCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmHistoryMaritime getByMaritimeCode_PrevAndNext(Session session,
		DmHistoryMaritime dmHistoryMaritime, String maritimeCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMHISTORYMARITIME_WHERE);

		boolean bindMaritimeCode = false;

		if (maritimeCode == null) {
			query.append(_FINDER_COLUMN_MARITIMECODE_MARITIMECODE_1);
		}
		else if (maritimeCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_MARITIMECODE_MARITIMECODE_3);
		}
		else {
			bindMaritimeCode = true;

			query.append(_FINDER_COLUMN_MARITIMECODE_MARITIMECODE_2);
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
			query.append(DmHistoryMaritimeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindMaritimeCode) {
			qPos.add(maritimeCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmHistoryMaritime);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmHistoryMaritime> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm history maritimes where maritimeCode = &#63; from the database.
	 *
	 * @param maritimeCode the maritime code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByMaritimeCode(String maritimeCode)
		throws SystemException {
		for (DmHistoryMaritime dmHistoryMaritime : findByMaritimeCode(
				maritimeCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dmHistoryMaritime);
		}
	}

	/**
	 * Returns the number of dm history maritimes where maritimeCode = &#63;.
	 *
	 * @param maritimeCode the maritime code
	 * @return the number of matching dm history maritimes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByMaritimeCode(String maritimeCode)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MARITIMECODE;

		Object[] finderArgs = new Object[] { maritimeCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMHISTORYMARITIME_WHERE);

			boolean bindMaritimeCode = false;

			if (maritimeCode == null) {
				query.append(_FINDER_COLUMN_MARITIMECODE_MARITIMECODE_1);
			}
			else if (maritimeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MARITIMECODE_MARITIMECODE_3);
			}
			else {
				bindMaritimeCode = true;

				query.append(_FINDER_COLUMN_MARITIMECODE_MARITIMECODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaritimeCode) {
					qPos.add(maritimeCode);
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

	private static final String _FINDER_COLUMN_MARITIMECODE_MARITIMECODE_1 = "dmHistoryMaritime.maritimeCode IS NULL";
	private static final String _FINDER_COLUMN_MARITIMECODE_MARITIMECODE_2 = "dmHistoryMaritime.maritimeCode = ?";
	private static final String _FINDER_COLUMN_MARITIMECODE_MARITIMECODE_3 = "(dmHistoryMaritime.maritimeCode IS NULL OR dmHistoryMaritime.maritimeCode = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_MARITIMECODEANDSYNCVERSION =
		new FinderPath(DmHistoryMaritimeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryMaritimeModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryMaritimeImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByMaritimeCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() },
			DmHistoryMaritimeModelImpl.MARITIMECODE_COLUMN_BITMASK |
			DmHistoryMaritimeModelImpl.SYNCVERSION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MARITIMECODEANDSYNCVERSION =
		new FinderPath(DmHistoryMaritimeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryMaritimeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByMaritimeCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns the dm history maritime where maritimeCode = &#63; and syncVersion = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryMaritimeException} if it could not be found.
	 *
	 * @param maritimeCode the maritime code
	 * @param syncVersion the sync version
	 * @return the matching dm history maritime
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryMaritimeException if a matching dm history maritime could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryMaritime findByMaritimeCodeAndSyncVersion(
		String maritimeCode, String syncVersion)
		throws NoSuchDmHistoryMaritimeException, SystemException {
		DmHistoryMaritime dmHistoryMaritime = fetchByMaritimeCodeAndSyncVersion(maritimeCode,
				syncVersion);

		if (dmHistoryMaritime == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("maritimeCode=");
			msg.append(maritimeCode);

			msg.append(", syncVersion=");
			msg.append(syncVersion);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmHistoryMaritimeException(msg.toString());
		}

		return dmHistoryMaritime;
	}

	/**
	 * Returns the dm history maritime where maritimeCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param maritimeCode the maritime code
	 * @param syncVersion the sync version
	 * @return the matching dm history maritime, or <code>null</code> if a matching dm history maritime could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryMaritime fetchByMaritimeCodeAndSyncVersion(
		String maritimeCode, String syncVersion) throws SystemException {
		return fetchByMaritimeCodeAndSyncVersion(maritimeCode, syncVersion, true);
	}

	/**
	 * Returns the dm history maritime where maritimeCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param maritimeCode the maritime code
	 * @param syncVersion the sync version
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm history maritime, or <code>null</code> if a matching dm history maritime could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryMaritime fetchByMaritimeCodeAndSyncVersion(
		String maritimeCode, String syncVersion, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { maritimeCode, syncVersion };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_MARITIMECODEANDSYNCVERSION,
					finderArgs, this);
		}

		if (result instanceof DmHistoryMaritime) {
			DmHistoryMaritime dmHistoryMaritime = (DmHistoryMaritime)result;

			if (!Validator.equals(maritimeCode,
						dmHistoryMaritime.getMaritimeCode()) ||
					!Validator.equals(syncVersion,
						dmHistoryMaritime.getSyncVersion())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DMHISTORYMARITIME_WHERE);

			boolean bindMaritimeCode = false;

			if (maritimeCode == null) {
				query.append(_FINDER_COLUMN_MARITIMECODEANDSYNCVERSION_MARITIMECODE_1);
			}
			else if (maritimeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MARITIMECODEANDSYNCVERSION_MARITIMECODE_3);
			}
			else {
				bindMaritimeCode = true;

				query.append(_FINDER_COLUMN_MARITIMECODEANDSYNCVERSION_MARITIMECODE_2);
			}

			boolean bindSyncVersion = false;

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_MARITIMECODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else if (syncVersion.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MARITIMECODEANDSYNCVERSION_SYNCVERSION_3);
			}
			else {
				bindSyncVersion = true;

				query.append(_FINDER_COLUMN_MARITIMECODEANDSYNCVERSION_SYNCVERSION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaritimeCode) {
					qPos.add(maritimeCode);
				}

				if (bindSyncVersion) {
					qPos.add(syncVersion);
				}

				List<DmHistoryMaritime> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MARITIMECODEANDSYNCVERSION,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DmHistoryMaritimePersistenceImpl.fetchByMaritimeCodeAndSyncVersion(String, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DmHistoryMaritime dmHistoryMaritime = list.get(0);

					result = dmHistoryMaritime;

					cacheResult(dmHistoryMaritime);

					if ((dmHistoryMaritime.getMaritimeCode() == null) ||
							!dmHistoryMaritime.getMaritimeCode()
												  .equals(maritimeCode) ||
							(dmHistoryMaritime.getSyncVersion() == null) ||
							!dmHistoryMaritime.getSyncVersion()
												  .equals(syncVersion)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MARITIMECODEANDSYNCVERSION,
							finderArgs, dmHistoryMaritime);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MARITIMECODEANDSYNCVERSION,
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
			return (DmHistoryMaritime)result;
		}
	}

	/**
	 * Removes the dm history maritime where maritimeCode = &#63; and syncVersion = &#63; from the database.
	 *
	 * @param maritimeCode the maritime code
	 * @param syncVersion the sync version
	 * @return the dm history maritime that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryMaritime removeByMaritimeCodeAndSyncVersion(
		String maritimeCode, String syncVersion)
		throws NoSuchDmHistoryMaritimeException, SystemException {
		DmHistoryMaritime dmHistoryMaritime = findByMaritimeCodeAndSyncVersion(maritimeCode,
				syncVersion);

		return remove(dmHistoryMaritime);
	}

	/**
	 * Returns the number of dm history maritimes where maritimeCode = &#63; and syncVersion = &#63;.
	 *
	 * @param maritimeCode the maritime code
	 * @param syncVersion the sync version
	 * @return the number of matching dm history maritimes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByMaritimeCodeAndSyncVersion(String maritimeCode,
		String syncVersion) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MARITIMECODEANDSYNCVERSION;

		Object[] finderArgs = new Object[] { maritimeCode, syncVersion };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMHISTORYMARITIME_WHERE);

			boolean bindMaritimeCode = false;

			if (maritimeCode == null) {
				query.append(_FINDER_COLUMN_MARITIMECODEANDSYNCVERSION_MARITIMECODE_1);
			}
			else if (maritimeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MARITIMECODEANDSYNCVERSION_MARITIMECODE_3);
			}
			else {
				bindMaritimeCode = true;

				query.append(_FINDER_COLUMN_MARITIMECODEANDSYNCVERSION_MARITIMECODE_2);
			}

			boolean bindSyncVersion = false;

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_MARITIMECODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else if (syncVersion.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MARITIMECODEANDSYNCVERSION_SYNCVERSION_3);
			}
			else {
				bindSyncVersion = true;

				query.append(_FINDER_COLUMN_MARITIMECODEANDSYNCVERSION_SYNCVERSION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaritimeCode) {
					qPos.add(maritimeCode);
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

	private static final String _FINDER_COLUMN_MARITIMECODEANDSYNCVERSION_MARITIMECODE_1 =
		"dmHistoryMaritime.maritimeCode IS NULL AND ";
	private static final String _FINDER_COLUMN_MARITIMECODEANDSYNCVERSION_MARITIMECODE_2 =
		"dmHistoryMaritime.maritimeCode = ? AND ";
	private static final String _FINDER_COLUMN_MARITIMECODEANDSYNCVERSION_MARITIMECODE_3 =
		"(dmHistoryMaritime.maritimeCode IS NULL OR dmHistoryMaritime.maritimeCode = '') AND ";
	private static final String _FINDER_COLUMN_MARITIMECODEANDSYNCVERSION_SYNCVERSION_1 =
		"dmHistoryMaritime.syncVersion IS NULL";
	private static final String _FINDER_COLUMN_MARITIMECODEANDSYNCVERSION_SYNCVERSION_2 =
		"dmHistoryMaritime.syncVersion = ?";
	private static final String _FINDER_COLUMN_MARITIMECODEANDSYNCVERSION_SYNCVERSION_3 =
		"(dmHistoryMaritime.syncVersion IS NULL OR dmHistoryMaritime.syncVersion = '')";

	public DmHistoryMaritimePersistenceImpl() {
		setModelClass(DmHistoryMaritime.class);
	}

	/**
	 * Caches the dm history maritime in the entity cache if it is enabled.
	 *
	 * @param dmHistoryMaritime the dm history maritime
	 */
	@Override
	public void cacheResult(DmHistoryMaritime dmHistoryMaritime) {
		EntityCacheUtil.putResult(DmHistoryMaritimeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryMaritimeImpl.class, dmHistoryMaritime.getPrimaryKey(),
			dmHistoryMaritime);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MARITIMECODEANDSYNCVERSION,
			new Object[] {
				dmHistoryMaritime.getMaritimeCode(),
				dmHistoryMaritime.getSyncVersion()
			}, dmHistoryMaritime);

		dmHistoryMaritime.resetOriginalValues();
	}

	/**
	 * Caches the dm history maritimes in the entity cache if it is enabled.
	 *
	 * @param dmHistoryMaritimes the dm history maritimes
	 */
	@Override
	public void cacheResult(List<DmHistoryMaritime> dmHistoryMaritimes) {
		for (DmHistoryMaritime dmHistoryMaritime : dmHistoryMaritimes) {
			if (EntityCacheUtil.getResult(
						DmHistoryMaritimeModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryMaritimeImpl.class,
						dmHistoryMaritime.getPrimaryKey()) == null) {
				cacheResult(dmHistoryMaritime);
			}
			else {
				dmHistoryMaritime.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm history maritimes.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmHistoryMaritimeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmHistoryMaritimeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm history maritime.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmHistoryMaritime dmHistoryMaritime) {
		EntityCacheUtil.removeResult(DmHistoryMaritimeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryMaritimeImpl.class, dmHistoryMaritime.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(dmHistoryMaritime);
	}

	@Override
	public void clearCache(List<DmHistoryMaritime> dmHistoryMaritimes) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmHistoryMaritime dmHistoryMaritime : dmHistoryMaritimes) {
			EntityCacheUtil.removeResult(DmHistoryMaritimeModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryMaritimeImpl.class, dmHistoryMaritime.getPrimaryKey());

			clearUniqueFindersCache(dmHistoryMaritime);
		}
	}

	protected void cacheUniqueFindersCache(DmHistoryMaritime dmHistoryMaritime) {
		if (dmHistoryMaritime.isNew()) {
			Object[] args = new Object[] {
					dmHistoryMaritime.getMaritimeCode(),
					dmHistoryMaritime.getSyncVersion()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MARITIMECODEANDSYNCVERSION,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MARITIMECODEANDSYNCVERSION,
				args, dmHistoryMaritime);
		}
		else {
			DmHistoryMaritimeModelImpl dmHistoryMaritimeModelImpl = (DmHistoryMaritimeModelImpl)dmHistoryMaritime;

			if ((dmHistoryMaritimeModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_MARITIMECODEANDSYNCVERSION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryMaritime.getMaritimeCode(),
						dmHistoryMaritime.getSyncVersion()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MARITIMECODEANDSYNCVERSION,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MARITIMECODEANDSYNCVERSION,
					args, dmHistoryMaritime);
			}
		}
	}

	protected void clearUniqueFindersCache(DmHistoryMaritime dmHistoryMaritime) {
		DmHistoryMaritimeModelImpl dmHistoryMaritimeModelImpl = (DmHistoryMaritimeModelImpl)dmHistoryMaritime;

		Object[] args = new Object[] {
				dmHistoryMaritime.getMaritimeCode(),
				dmHistoryMaritime.getSyncVersion()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MARITIMECODEANDSYNCVERSION,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MARITIMECODEANDSYNCVERSION,
			args);

		if ((dmHistoryMaritimeModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_MARITIMECODEANDSYNCVERSION.getColumnBitmask()) != 0) {
			args = new Object[] {
					dmHistoryMaritimeModelImpl.getOriginalMaritimeCode(),
					dmHistoryMaritimeModelImpl.getOriginalSyncVersion()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MARITIMECODEANDSYNCVERSION,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MARITIMECODEANDSYNCVERSION,
				args);
		}
	}

	/**
	 * Creates a new dm history maritime with the primary key. Does not add the dm history maritime to the database.
	 *
	 * @param id the primary key for the new dm history maritime
	 * @return the new dm history maritime
	 */
	@Override
	public DmHistoryMaritime create(int id) {
		DmHistoryMaritime dmHistoryMaritime = new DmHistoryMaritimeImpl();

		dmHistoryMaritime.setNew(true);
		dmHistoryMaritime.setPrimaryKey(id);

		return dmHistoryMaritime;
	}

	/**
	 * Removes the dm history maritime with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm history maritime
	 * @return the dm history maritime that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryMaritimeException if a dm history maritime with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryMaritime remove(int id)
		throws NoSuchDmHistoryMaritimeException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the dm history maritime with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm history maritime
	 * @return the dm history maritime that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryMaritimeException if a dm history maritime with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryMaritime remove(Serializable primaryKey)
		throws NoSuchDmHistoryMaritimeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmHistoryMaritime dmHistoryMaritime = (DmHistoryMaritime)session.get(DmHistoryMaritimeImpl.class,
					primaryKey);

			if (dmHistoryMaritime == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmHistoryMaritimeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmHistoryMaritime);
		}
		catch (NoSuchDmHistoryMaritimeException nsee) {
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
	protected DmHistoryMaritime removeImpl(DmHistoryMaritime dmHistoryMaritime)
		throws SystemException {
		dmHistoryMaritime = toUnwrappedModel(dmHistoryMaritime);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dmHistoryMaritime)) {
				dmHistoryMaritime = (DmHistoryMaritime)session.get(DmHistoryMaritimeImpl.class,
						dmHistoryMaritime.getPrimaryKeyObj());
			}

			if (dmHistoryMaritime != null) {
				session.delete(dmHistoryMaritime);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dmHistoryMaritime != null) {
			clearCache(dmHistoryMaritime);
		}

		return dmHistoryMaritime;
	}

	@Override
	public DmHistoryMaritime updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryMaritime dmHistoryMaritime)
		throws SystemException {
		dmHistoryMaritime = toUnwrappedModel(dmHistoryMaritime);

		boolean isNew = dmHistoryMaritime.isNew();

		DmHistoryMaritimeModelImpl dmHistoryMaritimeModelImpl = (DmHistoryMaritimeModelImpl)dmHistoryMaritime;

		Session session = null;

		try {
			session = openSession();

			if (dmHistoryMaritime.isNew()) {
				session.save(dmHistoryMaritime);

				dmHistoryMaritime.setNew(false);
			}
			else {
				session.merge(dmHistoryMaritime);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmHistoryMaritimeModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmHistoryMaritimeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MARITIMECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryMaritimeModelImpl.getOriginalMaritimeCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MARITIMECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MARITIMECODE,
					args);

				args = new Object[] { dmHistoryMaritimeModelImpl.getMaritimeCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MARITIMECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MARITIMECODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmHistoryMaritimeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryMaritimeImpl.class, dmHistoryMaritime.getPrimaryKey(),
			dmHistoryMaritime);

		clearUniqueFindersCache(dmHistoryMaritime);
		cacheUniqueFindersCache(dmHistoryMaritime);

		return dmHistoryMaritime;
	}

	protected DmHistoryMaritime toUnwrappedModel(
		DmHistoryMaritime dmHistoryMaritime) {
		if (dmHistoryMaritime instanceof DmHistoryMaritimeImpl) {
			return dmHistoryMaritime;
		}

		DmHistoryMaritimeImpl dmHistoryMaritimeImpl = new DmHistoryMaritimeImpl();

		dmHistoryMaritimeImpl.setNew(dmHistoryMaritime.isNew());
		dmHistoryMaritimeImpl.setPrimaryKey(dmHistoryMaritime.getPrimaryKey());

		dmHistoryMaritimeImpl.setId(dmHistoryMaritime.getId());
		dmHistoryMaritimeImpl.setMaritimeCode(dmHistoryMaritime.getMaritimeCode());
		dmHistoryMaritimeImpl.setMaritimeReference(dmHistoryMaritime.getMaritimeReference());
		dmHistoryMaritimeImpl.setMaritimeName(dmHistoryMaritime.getMaritimeName());
		dmHistoryMaritimeImpl.setMaritimeNameVN(dmHistoryMaritime.getMaritimeNameVN());
		dmHistoryMaritimeImpl.setAddress(dmHistoryMaritime.getAddress());
		dmHistoryMaritimeImpl.setAddressVN(dmHistoryMaritime.getAddressVN());
		dmHistoryMaritimeImpl.setStateCode(dmHistoryMaritime.getStateCode());
		dmHistoryMaritimeImpl.setCitycode(dmHistoryMaritime.getCitycode());
		dmHistoryMaritimeImpl.setIsDelete(dmHistoryMaritime.getIsDelete());
		dmHistoryMaritimeImpl.setMarkedAsDelete(dmHistoryMaritime.getMarkedAsDelete());
		dmHistoryMaritimeImpl.setModifiedDate(dmHistoryMaritime.getModifiedDate());
		dmHistoryMaritimeImpl.setRequestedDate(dmHistoryMaritime.getRequestedDate());
		dmHistoryMaritimeImpl.setSyncVersion(dmHistoryMaritime.getSyncVersion());

		return dmHistoryMaritimeImpl;
	}

	/**
	 * Returns the dm history maritime with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history maritime
	 * @return the dm history maritime
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryMaritimeException if a dm history maritime with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryMaritime findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDmHistoryMaritimeException, SystemException {
		DmHistoryMaritime dmHistoryMaritime = fetchByPrimaryKey(primaryKey);

		if (dmHistoryMaritime == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDmHistoryMaritimeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dmHistoryMaritime;
	}

	/**
	 * Returns the dm history maritime with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryMaritimeException} if it could not be found.
	 *
	 * @param id the primary key of the dm history maritime
	 * @return the dm history maritime
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryMaritimeException if a dm history maritime with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryMaritime findByPrimaryKey(int id)
		throws NoSuchDmHistoryMaritimeException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dm history maritime with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history maritime
	 * @return the dm history maritime, or <code>null</code> if a dm history maritime with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryMaritime fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DmHistoryMaritime dmHistoryMaritime = (DmHistoryMaritime)EntityCacheUtil.getResult(DmHistoryMaritimeModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryMaritimeImpl.class, primaryKey);

		if (dmHistoryMaritime == _nullDmHistoryMaritime) {
			return null;
		}

		if (dmHistoryMaritime == null) {
			Session session = null;

			try {
				session = openSession();

				dmHistoryMaritime = (DmHistoryMaritime)session.get(DmHistoryMaritimeImpl.class,
						primaryKey);

				if (dmHistoryMaritime != null) {
					cacheResult(dmHistoryMaritime);
				}
				else {
					EntityCacheUtil.putResult(DmHistoryMaritimeModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryMaritimeImpl.class, primaryKey,
						_nullDmHistoryMaritime);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DmHistoryMaritimeModelImpl.ENTITY_CACHE_ENABLED,
					DmHistoryMaritimeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dmHistoryMaritime;
	}

	/**
	 * Returns the dm history maritime with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm history maritime
	 * @return the dm history maritime, or <code>null</code> if a dm history maritime with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryMaritime fetchByPrimaryKey(int id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the dm history maritimes.
	 *
	 * @return the dm history maritimes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryMaritime> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history maritimes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryMaritimeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history maritimes
	 * @param end the upper bound of the range of dm history maritimes (not inclusive)
	 * @return the range of dm history maritimes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryMaritime> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history maritimes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryMaritimeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history maritimes
	 * @param end the upper bound of the range of dm history maritimes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm history maritimes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryMaritime> findAll(int start, int end,
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

		List<DmHistoryMaritime> list = (List<DmHistoryMaritime>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMHISTORYMARITIME);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMHISTORYMARITIME;

				if (pagination) {
					sql = sql.concat(DmHistoryMaritimeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DmHistoryMaritime>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmHistoryMaritime>(list);
				}
				else {
					list = (List<DmHistoryMaritime>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the dm history maritimes from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DmHistoryMaritime dmHistoryMaritime : findAll()) {
			remove(dmHistoryMaritime);
		}
	}

	/**
	 * Returns the number of dm history maritimes.
	 *
	 * @return the number of dm history maritimes
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

				Query q = session.createQuery(_SQL_COUNT_DMHISTORYMARITIME);

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
	 * Initializes the dm history maritime persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.DmHistoryMaritime")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmHistoryMaritime>> listenersList = new ArrayList<ModelListener<DmHistoryMaritime>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmHistoryMaritime>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmHistoryMaritimeImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DMHISTORYMARITIME = "SELECT dmHistoryMaritime FROM DmHistoryMaritime dmHistoryMaritime";
	private static final String _SQL_SELECT_DMHISTORYMARITIME_WHERE = "SELECT dmHistoryMaritime FROM DmHistoryMaritime dmHistoryMaritime WHERE ";
	private static final String _SQL_COUNT_DMHISTORYMARITIME = "SELECT COUNT(dmHistoryMaritime) FROM DmHistoryMaritime dmHistoryMaritime";
	private static final String _SQL_COUNT_DMHISTORYMARITIME_WHERE = "SELECT COUNT(dmHistoryMaritime) FROM DmHistoryMaritime dmHistoryMaritime WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmHistoryMaritime.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmHistoryMaritime exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmHistoryMaritime exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmHistoryMaritimePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"maritimeCode", "maritimeReference", "maritimeName",
				"maritimeNameVN", "address", "addressVN", "stateCode",
				"citycode", "isDelete", "markedAsDelete", "modifiedDate",
				"requestedDate", "syncVersion"
			});
	private static DmHistoryMaritime _nullDmHistoryMaritime = new DmHistoryMaritimeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmHistoryMaritime> toCacheModel() {
				return _nullDmHistoryMaritimeCacheModel;
			}
		};

	private static CacheModel<DmHistoryMaritime> _nullDmHistoryMaritimeCacheModel =
		new CacheModel<DmHistoryMaritime>() {
			@Override
			public DmHistoryMaritime toEntityModel() {
				return _nullDmHistoryMaritime;
			}
		};
}