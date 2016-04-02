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

import vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryStateException;
import vn.dtt.duongbien.dao.vrcb.model.DmHistoryState;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryStateImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryStateModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dm history state service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmHistoryStatePersistence
 * @see DmHistoryStateUtil
 * @generated
 */
public class DmHistoryStatePersistenceImpl extends BasePersistenceImpl<DmHistoryState>
	implements DmHistoryStatePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmHistoryStateUtil} to access the dm history state persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmHistoryStateImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmHistoryStateModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryStateModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryStateImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmHistoryStateModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryStateModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryStateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmHistoryStateModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryStateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SYNCVERSION =
		new FinderPath(DmHistoryStateModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryStateModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryStateImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBySyncVersion",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SYNCVERSION =
		new FinderPath(DmHistoryStateModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryStateModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryStateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBySyncVersion",
			new String[] { String.class.getName() },
			DmHistoryStateModelImpl.SYNCVERSION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SYNCVERSION = new FinderPath(DmHistoryStateModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryStateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBySyncVersion",
			new String[] { String.class.getName() });

	/**
	 * Returns all the dm history states where syncVersion = &#63;.
	 *
	 * @param syncVersion the sync version
	 * @return the matching dm history states
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryState> findBySyncVersion(String syncVersion)
		throws SystemException {
		return findBySyncVersion(syncVersion, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history states where syncVersion = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryStateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param syncVersion the sync version
	 * @param start the lower bound of the range of dm history states
	 * @param end the upper bound of the range of dm history states (not inclusive)
	 * @return the range of matching dm history states
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryState> findBySyncVersion(String syncVersion,
		int start, int end) throws SystemException {
		return findBySyncVersion(syncVersion, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history states where syncVersion = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryStateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param syncVersion the sync version
	 * @param start the lower bound of the range of dm history states
	 * @param end the upper bound of the range of dm history states (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm history states
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryState> findBySyncVersion(String syncVersion,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SYNCVERSION;
			finderArgs = new Object[] { syncVersion };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SYNCVERSION;
			finderArgs = new Object[] { syncVersion, start, end, orderByComparator };
		}

		List<DmHistoryState> list = (List<DmHistoryState>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmHistoryState dmHistoryState : list) {
				if (!Validator.equals(syncVersion,
							dmHistoryState.getSyncVersion())) {
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

			query.append(_SQL_SELECT_DMHISTORYSTATE_WHERE);

			boolean bindSyncVersion = false;

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_SYNCVERSION_SYNCVERSION_1);
			}
			else if (syncVersion.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SYNCVERSION_SYNCVERSION_3);
			}
			else {
				bindSyncVersion = true;

				query.append(_FINDER_COLUMN_SYNCVERSION_SYNCVERSION_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DmHistoryStateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSyncVersion) {
					qPos.add(syncVersion);
				}

				if (!pagination) {
					list = (List<DmHistoryState>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmHistoryState>(list);
				}
				else {
					list = (List<DmHistoryState>)QueryUtil.list(q,
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
	 * Returns the first dm history state in the ordered set where syncVersion = &#63;.
	 *
	 * @param syncVersion the sync version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm history state
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryStateException if a matching dm history state could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryState findBySyncVersion_First(String syncVersion,
		OrderByComparator orderByComparator)
		throws NoSuchDmHistoryStateException, SystemException {
		DmHistoryState dmHistoryState = fetchBySyncVersion_First(syncVersion,
				orderByComparator);

		if (dmHistoryState != null) {
			return dmHistoryState;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("syncVersion=");
		msg.append(syncVersion);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmHistoryStateException(msg.toString());
	}

	/**
	 * Returns the first dm history state in the ordered set where syncVersion = &#63;.
	 *
	 * @param syncVersion the sync version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm history state, or <code>null</code> if a matching dm history state could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryState fetchBySyncVersion_First(String syncVersion,
		OrderByComparator orderByComparator) throws SystemException {
		List<DmHistoryState> list = findBySyncVersion(syncVersion, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm history state in the ordered set where syncVersion = &#63;.
	 *
	 * @param syncVersion the sync version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm history state
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryStateException if a matching dm history state could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryState findBySyncVersion_Last(String syncVersion,
		OrderByComparator orderByComparator)
		throws NoSuchDmHistoryStateException, SystemException {
		DmHistoryState dmHistoryState = fetchBySyncVersion_Last(syncVersion,
				orderByComparator);

		if (dmHistoryState != null) {
			return dmHistoryState;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("syncVersion=");
		msg.append(syncVersion);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmHistoryStateException(msg.toString());
	}

	/**
	 * Returns the last dm history state in the ordered set where syncVersion = &#63;.
	 *
	 * @param syncVersion the sync version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm history state, or <code>null</code> if a matching dm history state could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryState fetchBySyncVersion_Last(String syncVersion,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBySyncVersion(syncVersion);

		if (count == 0) {
			return null;
		}

		List<DmHistoryState> list = findBySyncVersion(syncVersion, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm history states before and after the current dm history state in the ordered set where syncVersion = &#63;.
	 *
	 * @param id the primary key of the current dm history state
	 * @param syncVersion the sync version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm history state
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryStateException if a dm history state with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryState[] findBySyncVersion_PrevAndNext(int id,
		String syncVersion, OrderByComparator orderByComparator)
		throws NoSuchDmHistoryStateException, SystemException {
		DmHistoryState dmHistoryState = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmHistoryState[] array = new DmHistoryStateImpl[3];

			array[0] = getBySyncVersion_PrevAndNext(session, dmHistoryState,
					syncVersion, orderByComparator, true);

			array[1] = dmHistoryState;

			array[2] = getBySyncVersion_PrevAndNext(session, dmHistoryState,
					syncVersion, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmHistoryState getBySyncVersion_PrevAndNext(Session session,
		DmHistoryState dmHistoryState, String syncVersion,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMHISTORYSTATE_WHERE);

		boolean bindSyncVersion = false;

		if (syncVersion == null) {
			query.append(_FINDER_COLUMN_SYNCVERSION_SYNCVERSION_1);
		}
		else if (syncVersion.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_SYNCVERSION_SYNCVERSION_3);
		}
		else {
			bindSyncVersion = true;

			query.append(_FINDER_COLUMN_SYNCVERSION_SYNCVERSION_2);
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
			query.append(DmHistoryStateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindSyncVersion) {
			qPos.add(syncVersion);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmHistoryState);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmHistoryState> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm history states where syncVersion = &#63; from the database.
	 *
	 * @param syncVersion the sync version
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBySyncVersion(String syncVersion)
		throws SystemException {
		for (DmHistoryState dmHistoryState : findBySyncVersion(syncVersion,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dmHistoryState);
		}
	}

	/**
	 * Returns the number of dm history states where syncVersion = &#63;.
	 *
	 * @param syncVersion the sync version
	 * @return the number of matching dm history states
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBySyncVersion(String syncVersion) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SYNCVERSION;

		Object[] finderArgs = new Object[] { syncVersion };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMHISTORYSTATE_WHERE);

			boolean bindSyncVersion = false;

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_SYNCVERSION_SYNCVERSION_1);
			}
			else if (syncVersion.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SYNCVERSION_SYNCVERSION_3);
			}
			else {
				bindSyncVersion = true;

				query.append(_FINDER_COLUMN_SYNCVERSION_SYNCVERSION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

	private static final String _FINDER_COLUMN_SYNCVERSION_SYNCVERSION_1 = "dmHistoryState.syncVersion IS NULL";
	private static final String _FINDER_COLUMN_SYNCVERSION_SYNCVERSION_2 = "dmHistoryState.syncVersion = ?";
	private static final String _FINDER_COLUMN_SYNCVERSION_SYNCVERSION_3 = "(dmHistoryState.syncVersion IS NULL OR dmHistoryState.syncVersion = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATECODE =
		new FinderPath(DmHistoryStateModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryStateModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryStateImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByStateCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATECODE =
		new FinderPath(DmHistoryStateModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryStateModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryStateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByStateCode",
			new String[] { String.class.getName() },
			DmHistoryStateModelImpl.STATECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STATECODE = new FinderPath(DmHistoryStateModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryStateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStateCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the dm history states where stateCode = &#63;.
	 *
	 * @param stateCode the state code
	 * @return the matching dm history states
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryState> findByStateCode(String stateCode)
		throws SystemException {
		return findByStateCode(stateCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the dm history states where stateCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryStateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param stateCode the state code
	 * @param start the lower bound of the range of dm history states
	 * @param end the upper bound of the range of dm history states (not inclusive)
	 * @return the range of matching dm history states
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryState> findByStateCode(String stateCode, int start,
		int end) throws SystemException {
		return findByStateCode(stateCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history states where stateCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryStateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param stateCode the state code
	 * @param start the lower bound of the range of dm history states
	 * @param end the upper bound of the range of dm history states (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm history states
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryState> findByStateCode(String stateCode, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATECODE;
			finderArgs = new Object[] { stateCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_STATECODE;
			finderArgs = new Object[] { stateCode, start, end, orderByComparator };
		}

		List<DmHistoryState> list = (List<DmHistoryState>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmHistoryState dmHistoryState : list) {
				if (!Validator.equals(stateCode, dmHistoryState.getStateCode())) {
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

			query.append(_SQL_SELECT_DMHISTORYSTATE_WHERE);

			boolean bindStateCode = false;

			if (stateCode == null) {
				query.append(_FINDER_COLUMN_STATECODE_STATECODE_1);
			}
			else if (stateCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_STATECODE_STATECODE_3);
			}
			else {
				bindStateCode = true;

				query.append(_FINDER_COLUMN_STATECODE_STATECODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DmHistoryStateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindStateCode) {
					qPos.add(stateCode);
				}

				if (!pagination) {
					list = (List<DmHistoryState>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmHistoryState>(list);
				}
				else {
					list = (List<DmHistoryState>)QueryUtil.list(q,
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
	 * Returns the first dm history state in the ordered set where stateCode = &#63;.
	 *
	 * @param stateCode the state code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm history state
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryStateException if a matching dm history state could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryState findByStateCode_First(String stateCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmHistoryStateException, SystemException {
		DmHistoryState dmHistoryState = fetchByStateCode_First(stateCode,
				orderByComparator);

		if (dmHistoryState != null) {
			return dmHistoryState;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("stateCode=");
		msg.append(stateCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmHistoryStateException(msg.toString());
	}

	/**
	 * Returns the first dm history state in the ordered set where stateCode = &#63;.
	 *
	 * @param stateCode the state code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm history state, or <code>null</code> if a matching dm history state could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryState fetchByStateCode_First(String stateCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<DmHistoryState> list = findByStateCode(stateCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm history state in the ordered set where stateCode = &#63;.
	 *
	 * @param stateCode the state code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm history state
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryStateException if a matching dm history state could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryState findByStateCode_Last(String stateCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmHistoryStateException, SystemException {
		DmHistoryState dmHistoryState = fetchByStateCode_Last(stateCode,
				orderByComparator);

		if (dmHistoryState != null) {
			return dmHistoryState;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("stateCode=");
		msg.append(stateCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmHistoryStateException(msg.toString());
	}

	/**
	 * Returns the last dm history state in the ordered set where stateCode = &#63;.
	 *
	 * @param stateCode the state code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm history state, or <code>null</code> if a matching dm history state could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryState fetchByStateCode_Last(String stateCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByStateCode(stateCode);

		if (count == 0) {
			return null;
		}

		List<DmHistoryState> list = findByStateCode(stateCode, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm history states before and after the current dm history state in the ordered set where stateCode = &#63;.
	 *
	 * @param id the primary key of the current dm history state
	 * @param stateCode the state code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm history state
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryStateException if a dm history state with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryState[] findByStateCode_PrevAndNext(int id,
		String stateCode, OrderByComparator orderByComparator)
		throws NoSuchDmHistoryStateException, SystemException {
		DmHistoryState dmHistoryState = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmHistoryState[] array = new DmHistoryStateImpl[3];

			array[0] = getByStateCode_PrevAndNext(session, dmHistoryState,
					stateCode, orderByComparator, true);

			array[1] = dmHistoryState;

			array[2] = getByStateCode_PrevAndNext(session, dmHistoryState,
					stateCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmHistoryState getByStateCode_PrevAndNext(Session session,
		DmHistoryState dmHistoryState, String stateCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMHISTORYSTATE_WHERE);

		boolean bindStateCode = false;

		if (stateCode == null) {
			query.append(_FINDER_COLUMN_STATECODE_STATECODE_1);
		}
		else if (stateCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_STATECODE_STATECODE_3);
		}
		else {
			bindStateCode = true;

			query.append(_FINDER_COLUMN_STATECODE_STATECODE_2);
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
			query.append(DmHistoryStateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindStateCode) {
			qPos.add(stateCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmHistoryState);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmHistoryState> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm history states where stateCode = &#63; from the database.
	 *
	 * @param stateCode the state code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByStateCode(String stateCode) throws SystemException {
		for (DmHistoryState dmHistoryState : findByStateCode(stateCode,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dmHistoryState);
		}
	}

	/**
	 * Returns the number of dm history states where stateCode = &#63;.
	 *
	 * @param stateCode the state code
	 * @return the number of matching dm history states
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByStateCode(String stateCode) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_STATECODE;

		Object[] finderArgs = new Object[] { stateCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMHISTORYSTATE_WHERE);

			boolean bindStateCode = false;

			if (stateCode == null) {
				query.append(_FINDER_COLUMN_STATECODE_STATECODE_1);
			}
			else if (stateCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_STATECODE_STATECODE_3);
			}
			else {
				bindStateCode = true;

				query.append(_FINDER_COLUMN_STATECODE_STATECODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindStateCode) {
					qPos.add(stateCode);
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

	private static final String _FINDER_COLUMN_STATECODE_STATECODE_1 = "dmHistoryState.stateCode IS NULL";
	private static final String _FINDER_COLUMN_STATECODE_STATECODE_2 = "dmHistoryState.stateCode = ?";
	private static final String _FINDER_COLUMN_STATECODE_STATECODE_3 = "(dmHistoryState.stateCode IS NULL OR dmHistoryState.stateCode = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_STATECODEANDSYNCVERSION = new FinderPath(DmHistoryStateModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryStateModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryStateImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByStateCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() },
			DmHistoryStateModelImpl.STATECODE_COLUMN_BITMASK |
			DmHistoryStateModelImpl.SYNCVERSION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STATECODEANDSYNCVERSION = new FinderPath(DmHistoryStateModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryStateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByStateCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns the dm history state where stateCode = &#63; and syncVersion = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryStateException} if it could not be found.
	 *
	 * @param stateCode the state code
	 * @param syncVersion the sync version
	 * @return the matching dm history state
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryStateException if a matching dm history state could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryState findByStateCodeAndSyncVersion(String stateCode,
		String syncVersion)
		throws NoSuchDmHistoryStateException, SystemException {
		DmHistoryState dmHistoryState = fetchByStateCodeAndSyncVersion(stateCode,
				syncVersion);

		if (dmHistoryState == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("stateCode=");
			msg.append(stateCode);

			msg.append(", syncVersion=");
			msg.append(syncVersion);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmHistoryStateException(msg.toString());
		}

		return dmHistoryState;
	}

	/**
	 * Returns the dm history state where stateCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param stateCode the state code
	 * @param syncVersion the sync version
	 * @return the matching dm history state, or <code>null</code> if a matching dm history state could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryState fetchByStateCodeAndSyncVersion(String stateCode,
		String syncVersion) throws SystemException {
		return fetchByStateCodeAndSyncVersion(stateCode, syncVersion, true);
	}

	/**
	 * Returns the dm history state where stateCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param stateCode the state code
	 * @param syncVersion the sync version
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm history state, or <code>null</code> if a matching dm history state could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryState fetchByStateCodeAndSyncVersion(String stateCode,
		String syncVersion, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { stateCode, syncVersion };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_STATECODEANDSYNCVERSION,
					finderArgs, this);
		}

		if (result instanceof DmHistoryState) {
			DmHistoryState dmHistoryState = (DmHistoryState)result;

			if (!Validator.equals(stateCode, dmHistoryState.getStateCode()) ||
					!Validator.equals(syncVersion,
						dmHistoryState.getSyncVersion())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DMHISTORYSTATE_WHERE);

			boolean bindStateCode = false;

			if (stateCode == null) {
				query.append(_FINDER_COLUMN_STATECODEANDSYNCVERSION_STATECODE_1);
			}
			else if (stateCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_STATECODEANDSYNCVERSION_STATECODE_3);
			}
			else {
				bindStateCode = true;

				query.append(_FINDER_COLUMN_STATECODEANDSYNCVERSION_STATECODE_2);
			}

			boolean bindSyncVersion = false;

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_STATECODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else if (syncVersion.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_STATECODEANDSYNCVERSION_SYNCVERSION_3);
			}
			else {
				bindSyncVersion = true;

				query.append(_FINDER_COLUMN_STATECODEANDSYNCVERSION_SYNCVERSION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindStateCode) {
					qPos.add(stateCode);
				}

				if (bindSyncVersion) {
					qPos.add(syncVersion);
				}

				List<DmHistoryState> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_STATECODEANDSYNCVERSION,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DmHistoryStatePersistenceImpl.fetchByStateCodeAndSyncVersion(String, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DmHistoryState dmHistoryState = list.get(0);

					result = dmHistoryState;

					cacheResult(dmHistoryState);

					if ((dmHistoryState.getStateCode() == null) ||
							!dmHistoryState.getStateCode().equals(stateCode) ||
							(dmHistoryState.getSyncVersion() == null) ||
							!dmHistoryState.getSyncVersion().equals(syncVersion)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_STATECODEANDSYNCVERSION,
							finderArgs, dmHistoryState);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_STATECODEANDSYNCVERSION,
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
			return (DmHistoryState)result;
		}
	}

	/**
	 * Removes the dm history state where stateCode = &#63; and syncVersion = &#63; from the database.
	 *
	 * @param stateCode the state code
	 * @param syncVersion the sync version
	 * @return the dm history state that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryState removeByStateCodeAndSyncVersion(String stateCode,
		String syncVersion)
		throws NoSuchDmHistoryStateException, SystemException {
		DmHistoryState dmHistoryState = findByStateCodeAndSyncVersion(stateCode,
				syncVersion);

		return remove(dmHistoryState);
	}

	/**
	 * Returns the number of dm history states where stateCode = &#63; and syncVersion = &#63;.
	 *
	 * @param stateCode the state code
	 * @param syncVersion the sync version
	 * @return the number of matching dm history states
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByStateCodeAndSyncVersion(String stateCode,
		String syncVersion) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_STATECODEANDSYNCVERSION;

		Object[] finderArgs = new Object[] { stateCode, syncVersion };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMHISTORYSTATE_WHERE);

			boolean bindStateCode = false;

			if (stateCode == null) {
				query.append(_FINDER_COLUMN_STATECODEANDSYNCVERSION_STATECODE_1);
			}
			else if (stateCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_STATECODEANDSYNCVERSION_STATECODE_3);
			}
			else {
				bindStateCode = true;

				query.append(_FINDER_COLUMN_STATECODEANDSYNCVERSION_STATECODE_2);
			}

			boolean bindSyncVersion = false;

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_STATECODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else if (syncVersion.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_STATECODEANDSYNCVERSION_SYNCVERSION_3);
			}
			else {
				bindSyncVersion = true;

				query.append(_FINDER_COLUMN_STATECODEANDSYNCVERSION_SYNCVERSION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindStateCode) {
					qPos.add(stateCode);
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

	private static final String _FINDER_COLUMN_STATECODEANDSYNCVERSION_STATECODE_1 =
		"dmHistoryState.stateCode IS NULL AND ";
	private static final String _FINDER_COLUMN_STATECODEANDSYNCVERSION_STATECODE_2 =
		"dmHistoryState.stateCode = ? AND ";
	private static final String _FINDER_COLUMN_STATECODEANDSYNCVERSION_STATECODE_3 =
		"(dmHistoryState.stateCode IS NULL OR dmHistoryState.stateCode = '') AND ";
	private static final String _FINDER_COLUMN_STATECODEANDSYNCVERSION_SYNCVERSION_1 =
		"dmHistoryState.syncVersion IS NULL";
	private static final String _FINDER_COLUMN_STATECODEANDSYNCVERSION_SYNCVERSION_2 =
		"dmHistoryState.syncVersion = ?";
	private static final String _FINDER_COLUMN_STATECODEANDSYNCVERSION_SYNCVERSION_3 =
		"(dmHistoryState.syncVersion IS NULL OR dmHistoryState.syncVersion = '')";

	public DmHistoryStatePersistenceImpl() {
		setModelClass(DmHistoryState.class);
	}

	/**
	 * Caches the dm history state in the entity cache if it is enabled.
	 *
	 * @param dmHistoryState the dm history state
	 */
	@Override
	public void cacheResult(DmHistoryState dmHistoryState) {
		EntityCacheUtil.putResult(DmHistoryStateModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryStateImpl.class, dmHistoryState.getPrimaryKey(),
			dmHistoryState);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_STATECODEANDSYNCVERSION,
			new Object[] {
				dmHistoryState.getStateCode(), dmHistoryState.getSyncVersion()
			}, dmHistoryState);

		dmHistoryState.resetOriginalValues();
	}

	/**
	 * Caches the dm history states in the entity cache if it is enabled.
	 *
	 * @param dmHistoryStates the dm history states
	 */
	@Override
	public void cacheResult(List<DmHistoryState> dmHistoryStates) {
		for (DmHistoryState dmHistoryState : dmHistoryStates) {
			if (EntityCacheUtil.getResult(
						DmHistoryStateModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryStateImpl.class, dmHistoryState.getPrimaryKey()) == null) {
				cacheResult(dmHistoryState);
			}
			else {
				dmHistoryState.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm history states.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmHistoryStateImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmHistoryStateImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm history state.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmHistoryState dmHistoryState) {
		EntityCacheUtil.removeResult(DmHistoryStateModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryStateImpl.class, dmHistoryState.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(dmHistoryState);
	}

	@Override
	public void clearCache(List<DmHistoryState> dmHistoryStates) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmHistoryState dmHistoryState : dmHistoryStates) {
			EntityCacheUtil.removeResult(DmHistoryStateModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryStateImpl.class, dmHistoryState.getPrimaryKey());

			clearUniqueFindersCache(dmHistoryState);
		}
	}

	protected void cacheUniqueFindersCache(DmHistoryState dmHistoryState) {
		if (dmHistoryState.isNew()) {
			Object[] args = new Object[] {
					dmHistoryState.getStateCode(),
					dmHistoryState.getSyncVersion()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_STATECODEANDSYNCVERSION,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_STATECODEANDSYNCVERSION,
				args, dmHistoryState);
		}
		else {
			DmHistoryStateModelImpl dmHistoryStateModelImpl = (DmHistoryStateModelImpl)dmHistoryState;

			if ((dmHistoryStateModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_STATECODEANDSYNCVERSION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryState.getStateCode(),
						dmHistoryState.getSyncVersion()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_STATECODEANDSYNCVERSION,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_STATECODEANDSYNCVERSION,
					args, dmHistoryState);
			}
		}
	}

	protected void clearUniqueFindersCache(DmHistoryState dmHistoryState) {
		DmHistoryStateModelImpl dmHistoryStateModelImpl = (DmHistoryStateModelImpl)dmHistoryState;

		Object[] args = new Object[] {
				dmHistoryState.getStateCode(), dmHistoryState.getSyncVersion()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATECODEANDSYNCVERSION,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_STATECODEANDSYNCVERSION,
			args);

		if ((dmHistoryStateModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_STATECODEANDSYNCVERSION.getColumnBitmask()) != 0) {
			args = new Object[] {
					dmHistoryStateModelImpl.getOriginalStateCode(),
					dmHistoryStateModelImpl.getOriginalSyncVersion()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATECODEANDSYNCVERSION,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_STATECODEANDSYNCVERSION,
				args);
		}
	}

	/**
	 * Creates a new dm history state with the primary key. Does not add the dm history state to the database.
	 *
	 * @param id the primary key for the new dm history state
	 * @return the new dm history state
	 */
	@Override
	public DmHistoryState create(int id) {
		DmHistoryState dmHistoryState = new DmHistoryStateImpl();

		dmHistoryState.setNew(true);
		dmHistoryState.setPrimaryKey(id);

		return dmHistoryState;
	}

	/**
	 * Removes the dm history state with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm history state
	 * @return the dm history state that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryStateException if a dm history state with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryState remove(int id)
		throws NoSuchDmHistoryStateException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the dm history state with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm history state
	 * @return the dm history state that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryStateException if a dm history state with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryState remove(Serializable primaryKey)
		throws NoSuchDmHistoryStateException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmHistoryState dmHistoryState = (DmHistoryState)session.get(DmHistoryStateImpl.class,
					primaryKey);

			if (dmHistoryState == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmHistoryStateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmHistoryState);
		}
		catch (NoSuchDmHistoryStateException nsee) {
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
	protected DmHistoryState removeImpl(DmHistoryState dmHistoryState)
		throws SystemException {
		dmHistoryState = toUnwrappedModel(dmHistoryState);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dmHistoryState)) {
				dmHistoryState = (DmHistoryState)session.get(DmHistoryStateImpl.class,
						dmHistoryState.getPrimaryKeyObj());
			}

			if (dmHistoryState != null) {
				session.delete(dmHistoryState);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dmHistoryState != null) {
			clearCache(dmHistoryState);
		}

		return dmHistoryState;
	}

	@Override
	public DmHistoryState updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryState dmHistoryState)
		throws SystemException {
		dmHistoryState = toUnwrappedModel(dmHistoryState);

		boolean isNew = dmHistoryState.isNew();

		DmHistoryStateModelImpl dmHistoryStateModelImpl = (DmHistoryStateModelImpl)dmHistoryState;

		Session session = null;

		try {
			session = openSession();

			if (dmHistoryState.isNew()) {
				session.save(dmHistoryState);

				dmHistoryState.setNew(false);
			}
			else {
				session.merge(dmHistoryState);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmHistoryStateModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmHistoryStateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SYNCVERSION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryStateModelImpl.getOriginalSyncVersion()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SYNCVERSION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SYNCVERSION,
					args);

				args = new Object[] { dmHistoryStateModelImpl.getSyncVersion() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SYNCVERSION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SYNCVERSION,
					args);
			}

			if ((dmHistoryStateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryStateModelImpl.getOriginalStateCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATECODE,
					args);

				args = new Object[] { dmHistoryStateModelImpl.getStateCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATECODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmHistoryStateModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryStateImpl.class, dmHistoryState.getPrimaryKey(),
			dmHistoryState);

		clearUniqueFindersCache(dmHistoryState);
		cacheUniqueFindersCache(dmHistoryState);

		return dmHistoryState;
	}

	protected DmHistoryState toUnwrappedModel(DmHistoryState dmHistoryState) {
		if (dmHistoryState instanceof DmHistoryStateImpl) {
			return dmHistoryState;
		}

		DmHistoryStateImpl dmHistoryStateImpl = new DmHistoryStateImpl();

		dmHistoryStateImpl.setNew(dmHistoryState.isNew());
		dmHistoryStateImpl.setPrimaryKey(dmHistoryState.getPrimaryKey());

		dmHistoryStateImpl.setId(dmHistoryState.getId());
		dmHistoryStateImpl.setStateCode(dmHistoryState.getStateCode());
		dmHistoryStateImpl.setStateName(dmHistoryState.getStateName());
		dmHistoryStateImpl.setDescription(dmHistoryState.getDescription());
		dmHistoryStateImpl.setIsDelete(dmHistoryState.getIsDelete());
		dmHistoryStateImpl.setMarkedAsDelete(dmHistoryState.getMarkedAsDelete());
		dmHistoryStateImpl.setModifiedDate(dmHistoryState.getModifiedDate());
		dmHistoryStateImpl.setRequestedDate(dmHistoryState.getRequestedDate());
		dmHistoryStateImpl.setSyncVersion(dmHistoryState.getSyncVersion());

		return dmHistoryStateImpl;
	}

	/**
	 * Returns the dm history state with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history state
	 * @return the dm history state
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryStateException if a dm history state with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryState findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDmHistoryStateException, SystemException {
		DmHistoryState dmHistoryState = fetchByPrimaryKey(primaryKey);

		if (dmHistoryState == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDmHistoryStateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dmHistoryState;
	}

	/**
	 * Returns the dm history state with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryStateException} if it could not be found.
	 *
	 * @param id the primary key of the dm history state
	 * @return the dm history state
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryStateException if a dm history state with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryState findByPrimaryKey(int id)
		throws NoSuchDmHistoryStateException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dm history state with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history state
	 * @return the dm history state, or <code>null</code> if a dm history state with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryState fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DmHistoryState dmHistoryState = (DmHistoryState)EntityCacheUtil.getResult(DmHistoryStateModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryStateImpl.class, primaryKey);

		if (dmHistoryState == _nullDmHistoryState) {
			return null;
		}

		if (dmHistoryState == null) {
			Session session = null;

			try {
				session = openSession();

				dmHistoryState = (DmHistoryState)session.get(DmHistoryStateImpl.class,
						primaryKey);

				if (dmHistoryState != null) {
					cacheResult(dmHistoryState);
				}
				else {
					EntityCacheUtil.putResult(DmHistoryStateModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryStateImpl.class, primaryKey,
						_nullDmHistoryState);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DmHistoryStateModelImpl.ENTITY_CACHE_ENABLED,
					DmHistoryStateImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dmHistoryState;
	}

	/**
	 * Returns the dm history state with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm history state
	 * @return the dm history state, or <code>null</code> if a dm history state with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryState fetchByPrimaryKey(int id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the dm history states.
	 *
	 * @return the dm history states
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryState> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history states.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryStateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history states
	 * @param end the upper bound of the range of dm history states (not inclusive)
	 * @return the range of dm history states
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryState> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history states.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryStateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history states
	 * @param end the upper bound of the range of dm history states (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm history states
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryState> findAll(int start, int end,
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

		List<DmHistoryState> list = (List<DmHistoryState>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMHISTORYSTATE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMHISTORYSTATE;

				if (pagination) {
					sql = sql.concat(DmHistoryStateModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DmHistoryState>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmHistoryState>(list);
				}
				else {
					list = (List<DmHistoryState>)QueryUtil.list(q,
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
	 * Removes all the dm history states from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DmHistoryState dmHistoryState : findAll()) {
			remove(dmHistoryState);
		}
	}

	/**
	 * Returns the number of dm history states.
	 *
	 * @return the number of dm history states
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

				Query q = session.createQuery(_SQL_COUNT_DMHISTORYSTATE);

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
	 * Initializes the dm history state persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.DmHistoryState")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmHistoryState>> listenersList = new ArrayList<ModelListener<DmHistoryState>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmHistoryState>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmHistoryStateImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DMHISTORYSTATE = "SELECT dmHistoryState FROM DmHistoryState dmHistoryState";
	private static final String _SQL_SELECT_DMHISTORYSTATE_WHERE = "SELECT dmHistoryState FROM DmHistoryState dmHistoryState WHERE ";
	private static final String _SQL_COUNT_DMHISTORYSTATE = "SELECT COUNT(dmHistoryState) FROM DmHistoryState dmHistoryState";
	private static final String _SQL_COUNT_DMHISTORYSTATE_WHERE = "SELECT COUNT(dmHistoryState) FROM DmHistoryState dmHistoryState WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmHistoryState.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmHistoryState exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmHistoryState exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmHistoryStatePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"stateCode", "stateName", "isDelete", "markedAsDelete",
				"modifiedDate", "requestedDate", "syncVersion"
			});
	private static DmHistoryState _nullDmHistoryState = new DmHistoryStateImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmHistoryState> toCacheModel() {
				return _nullDmHistoryStateCacheModel;
			}
		};

	private static CacheModel<DmHistoryState> _nullDmHistoryStateCacheModel = new CacheModel<DmHistoryState>() {
			@Override
			public DmHistoryState toEntityModel() {
				return _nullDmHistoryState;
			}
		};
}