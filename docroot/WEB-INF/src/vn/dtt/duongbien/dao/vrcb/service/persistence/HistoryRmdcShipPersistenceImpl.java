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

import vn.dtt.duongbien.dao.vrcb.NoSuchHistoryRmdcShipException;
import vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip;
import vn.dtt.duongbien.dao.vrcb.model.impl.HistoryRmdcShipImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.HistoryRmdcShipModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the history rmdc ship service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see HistoryRmdcShipPersistence
 * @see HistoryRmdcShipUtil
 * @generated
 */
public class HistoryRmdcShipPersistenceImpl extends BasePersistenceImpl<HistoryRmdcShip>
	implements HistoryRmdcShipPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link HistoryRmdcShipUtil} to access the history rmdc ship persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = HistoryRmdcShipImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(HistoryRmdcShipModelImpl.ENTITY_CACHE_ENABLED,
			HistoryRmdcShipModelImpl.FINDER_CACHE_ENABLED,
			HistoryRmdcShipImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(HistoryRmdcShipModelImpl.ENTITY_CACHE_ENABLED,
			HistoryRmdcShipModelImpl.FINDER_CACHE_ENABLED,
			HistoryRmdcShipImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(HistoryRmdcShipModelImpl.ENTITY_CACHE_ENABLED,
			HistoryRmdcShipModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SYNCVERSION =
		new FinderPath(HistoryRmdcShipModelImpl.ENTITY_CACHE_ENABLED,
			HistoryRmdcShipModelImpl.FINDER_CACHE_ENABLED,
			HistoryRmdcShipImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBySyncVersion",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SYNCVERSION =
		new FinderPath(HistoryRmdcShipModelImpl.ENTITY_CACHE_ENABLED,
			HistoryRmdcShipModelImpl.FINDER_CACHE_ENABLED,
			HistoryRmdcShipImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBySyncVersion",
			new String[] { String.class.getName() },
			HistoryRmdcShipModelImpl.SYNCVERSION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SYNCVERSION = new FinderPath(HistoryRmdcShipModelImpl.ENTITY_CACHE_ENABLED,
			HistoryRmdcShipModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBySyncVersion",
			new String[] { String.class.getName() });

	/**
	 * Returns all the history rmdc ships where syncVersion = &#63;.
	 *
	 * @param syncVersion the sync version
	 * @return the matching history rmdc ships
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<HistoryRmdcShip> findBySyncVersion(String syncVersion)
		throws SystemException {
		return findBySyncVersion(syncVersion, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the history rmdc ships where syncVersion = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.HistoryRmdcShipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param syncVersion the sync version
	 * @param start the lower bound of the range of history rmdc ships
	 * @param end the upper bound of the range of history rmdc ships (not inclusive)
	 * @return the range of matching history rmdc ships
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<HistoryRmdcShip> findBySyncVersion(String syncVersion,
		int start, int end) throws SystemException {
		return findBySyncVersion(syncVersion, start, end, null);
	}

	/**
	 * Returns an ordered range of all the history rmdc ships where syncVersion = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.HistoryRmdcShipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param syncVersion the sync version
	 * @param start the lower bound of the range of history rmdc ships
	 * @param end the upper bound of the range of history rmdc ships (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching history rmdc ships
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<HistoryRmdcShip> findBySyncVersion(String syncVersion,
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

		List<HistoryRmdcShip> list = (List<HistoryRmdcShip>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (HistoryRmdcShip historyRmdcShip : list) {
				if (!Validator.equals(syncVersion,
							historyRmdcShip.getSyncVersion())) {
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

			query.append(_SQL_SELECT_HISTORYRMDCSHIP_WHERE);

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
				query.append(HistoryRmdcShipModelImpl.ORDER_BY_JPQL);
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
					list = (List<HistoryRmdcShip>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<HistoryRmdcShip>(list);
				}
				else {
					list = (List<HistoryRmdcShip>)QueryUtil.list(q,
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
	 * Returns the first history rmdc ship in the ordered set where syncVersion = &#63;.
	 *
	 * @param syncVersion the sync version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching history rmdc ship
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryRmdcShipException if a matching history rmdc ship could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryRmdcShip findBySyncVersion_First(String syncVersion,
		OrderByComparator orderByComparator)
		throws NoSuchHistoryRmdcShipException, SystemException {
		HistoryRmdcShip historyRmdcShip = fetchBySyncVersion_First(syncVersion,
				orderByComparator);

		if (historyRmdcShip != null) {
			return historyRmdcShip;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("syncVersion=");
		msg.append(syncVersion);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchHistoryRmdcShipException(msg.toString());
	}

	/**
	 * Returns the first history rmdc ship in the ordered set where syncVersion = &#63;.
	 *
	 * @param syncVersion the sync version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching history rmdc ship, or <code>null</code> if a matching history rmdc ship could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryRmdcShip fetchBySyncVersion_First(String syncVersion,
		OrderByComparator orderByComparator) throws SystemException {
		List<HistoryRmdcShip> list = findBySyncVersion(syncVersion, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last history rmdc ship in the ordered set where syncVersion = &#63;.
	 *
	 * @param syncVersion the sync version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching history rmdc ship
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryRmdcShipException if a matching history rmdc ship could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryRmdcShip findBySyncVersion_Last(String syncVersion,
		OrderByComparator orderByComparator)
		throws NoSuchHistoryRmdcShipException, SystemException {
		HistoryRmdcShip historyRmdcShip = fetchBySyncVersion_Last(syncVersion,
				orderByComparator);

		if (historyRmdcShip != null) {
			return historyRmdcShip;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("syncVersion=");
		msg.append(syncVersion);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchHistoryRmdcShipException(msg.toString());
	}

	/**
	 * Returns the last history rmdc ship in the ordered set where syncVersion = &#63;.
	 *
	 * @param syncVersion the sync version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching history rmdc ship, or <code>null</code> if a matching history rmdc ship could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryRmdcShip fetchBySyncVersion_Last(String syncVersion,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBySyncVersion(syncVersion);

		if (count == 0) {
			return null;
		}

		List<HistoryRmdcShip> list = findBySyncVersion(syncVersion, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the history rmdc ships before and after the current history rmdc ship in the ordered set where syncVersion = &#63;.
	 *
	 * @param id the primary key of the current history rmdc ship
	 * @param syncVersion the sync version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next history rmdc ship
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryRmdcShipException if a history rmdc ship with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryRmdcShip[] findBySyncVersion_PrevAndNext(long id,
		String syncVersion, OrderByComparator orderByComparator)
		throws NoSuchHistoryRmdcShipException, SystemException {
		HistoryRmdcShip historyRmdcShip = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			HistoryRmdcShip[] array = new HistoryRmdcShipImpl[3];

			array[0] = getBySyncVersion_PrevAndNext(session, historyRmdcShip,
					syncVersion, orderByComparator, true);

			array[1] = historyRmdcShip;

			array[2] = getBySyncVersion_PrevAndNext(session, historyRmdcShip,
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

	protected HistoryRmdcShip getBySyncVersion_PrevAndNext(Session session,
		HistoryRmdcShip historyRmdcShip, String syncVersion,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_HISTORYRMDCSHIP_WHERE);

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
			query.append(HistoryRmdcShipModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(historyRmdcShip);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<HistoryRmdcShip> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the history rmdc ships where syncVersion = &#63; from the database.
	 *
	 * @param syncVersion the sync version
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBySyncVersion(String syncVersion)
		throws SystemException {
		for (HistoryRmdcShip historyRmdcShip : findBySyncVersion(syncVersion,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(historyRmdcShip);
		}
	}

	/**
	 * Returns the number of history rmdc ships where syncVersion = &#63;.
	 *
	 * @param syncVersion the sync version
	 * @return the number of matching history rmdc ships
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

			query.append(_SQL_COUNT_HISTORYRMDCSHIP_WHERE);

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

	private static final String _FINDER_COLUMN_SYNCVERSION_SYNCVERSION_1 = "historyRmdcShip.syncVersion IS NULL";
	private static final String _FINDER_COLUMN_SYNCVERSION_SYNCVERSION_2 = "historyRmdcShip.syncVersion = ?";
	private static final String _FINDER_COLUMN_SYNCVERSION_SYNCVERSION_3 = "(historyRmdcShip.syncVersion IS NULL OR historyRmdcShip.syncVersion = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SHIPTYPECODE =
		new FinderPath(HistoryRmdcShipModelImpl.ENTITY_CACHE_ENABLED,
			HistoryRmdcShipModelImpl.FINDER_CACHE_ENABLED,
			HistoryRmdcShipImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByShipTypeCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SHIPTYPECODE =
		new FinderPath(HistoryRmdcShipModelImpl.ENTITY_CACHE_ENABLED,
			HistoryRmdcShipModelImpl.FINDER_CACHE_ENABLED,
			HistoryRmdcShipImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByShipTypeCode",
			new String[] { String.class.getName() },
			HistoryRmdcShipModelImpl.SHIPTYPECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SHIPTYPECODE = new FinderPath(HistoryRmdcShipModelImpl.ENTITY_CACHE_ENABLED,
			HistoryRmdcShipModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByShipTypeCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the history rmdc ships where shipTypeCode = &#63;.
	 *
	 * @param shipTypeCode the ship type code
	 * @return the matching history rmdc ships
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<HistoryRmdcShip> findByShipTypeCode(String shipTypeCode)
		throws SystemException {
		return findByShipTypeCode(shipTypeCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the history rmdc ships where shipTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.HistoryRmdcShipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param shipTypeCode the ship type code
	 * @param start the lower bound of the range of history rmdc ships
	 * @param end the upper bound of the range of history rmdc ships (not inclusive)
	 * @return the range of matching history rmdc ships
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<HistoryRmdcShip> findByShipTypeCode(String shipTypeCode,
		int start, int end) throws SystemException {
		return findByShipTypeCode(shipTypeCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the history rmdc ships where shipTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.HistoryRmdcShipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param shipTypeCode the ship type code
	 * @param start the lower bound of the range of history rmdc ships
	 * @param end the upper bound of the range of history rmdc ships (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching history rmdc ships
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<HistoryRmdcShip> findByShipTypeCode(String shipTypeCode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SHIPTYPECODE;
			finderArgs = new Object[] { shipTypeCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SHIPTYPECODE;
			finderArgs = new Object[] {
					shipTypeCode,
					
					start, end, orderByComparator
				};
		}

		List<HistoryRmdcShip> list = (List<HistoryRmdcShip>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (HistoryRmdcShip historyRmdcShip : list) {
				if (!Validator.equals(shipTypeCode,
							historyRmdcShip.getShipTypeCode())) {
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

			query.append(_SQL_SELECT_HISTORYRMDCSHIP_WHERE);

			boolean bindShipTypeCode = false;

			if (shipTypeCode == null) {
				query.append(_FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_1);
			}
			else if (shipTypeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_3);
			}
			else {
				bindShipTypeCode = true;

				query.append(_FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(HistoryRmdcShipModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindShipTypeCode) {
					qPos.add(shipTypeCode);
				}

				if (!pagination) {
					list = (List<HistoryRmdcShip>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<HistoryRmdcShip>(list);
				}
				else {
					list = (List<HistoryRmdcShip>)QueryUtil.list(q,
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
	 * Returns the first history rmdc ship in the ordered set where shipTypeCode = &#63;.
	 *
	 * @param shipTypeCode the ship type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching history rmdc ship
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryRmdcShipException if a matching history rmdc ship could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryRmdcShip findByShipTypeCode_First(String shipTypeCode,
		OrderByComparator orderByComparator)
		throws NoSuchHistoryRmdcShipException, SystemException {
		HistoryRmdcShip historyRmdcShip = fetchByShipTypeCode_First(shipTypeCode,
				orderByComparator);

		if (historyRmdcShip != null) {
			return historyRmdcShip;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("shipTypeCode=");
		msg.append(shipTypeCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchHistoryRmdcShipException(msg.toString());
	}

	/**
	 * Returns the first history rmdc ship in the ordered set where shipTypeCode = &#63;.
	 *
	 * @param shipTypeCode the ship type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching history rmdc ship, or <code>null</code> if a matching history rmdc ship could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryRmdcShip fetchByShipTypeCode_First(String shipTypeCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<HistoryRmdcShip> list = findByShipTypeCode(shipTypeCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last history rmdc ship in the ordered set where shipTypeCode = &#63;.
	 *
	 * @param shipTypeCode the ship type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching history rmdc ship
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryRmdcShipException if a matching history rmdc ship could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryRmdcShip findByShipTypeCode_Last(String shipTypeCode,
		OrderByComparator orderByComparator)
		throws NoSuchHistoryRmdcShipException, SystemException {
		HistoryRmdcShip historyRmdcShip = fetchByShipTypeCode_Last(shipTypeCode,
				orderByComparator);

		if (historyRmdcShip != null) {
			return historyRmdcShip;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("shipTypeCode=");
		msg.append(shipTypeCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchHistoryRmdcShipException(msg.toString());
	}

	/**
	 * Returns the last history rmdc ship in the ordered set where shipTypeCode = &#63;.
	 *
	 * @param shipTypeCode the ship type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching history rmdc ship, or <code>null</code> if a matching history rmdc ship could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryRmdcShip fetchByShipTypeCode_Last(String shipTypeCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByShipTypeCode(shipTypeCode);

		if (count == 0) {
			return null;
		}

		List<HistoryRmdcShip> list = findByShipTypeCode(shipTypeCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the history rmdc ships before and after the current history rmdc ship in the ordered set where shipTypeCode = &#63;.
	 *
	 * @param id the primary key of the current history rmdc ship
	 * @param shipTypeCode the ship type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next history rmdc ship
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryRmdcShipException if a history rmdc ship with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryRmdcShip[] findByShipTypeCode_PrevAndNext(long id,
		String shipTypeCode, OrderByComparator orderByComparator)
		throws NoSuchHistoryRmdcShipException, SystemException {
		HistoryRmdcShip historyRmdcShip = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			HistoryRmdcShip[] array = new HistoryRmdcShipImpl[3];

			array[0] = getByShipTypeCode_PrevAndNext(session, historyRmdcShip,
					shipTypeCode, orderByComparator, true);

			array[1] = historyRmdcShip;

			array[2] = getByShipTypeCode_PrevAndNext(session, historyRmdcShip,
					shipTypeCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected HistoryRmdcShip getByShipTypeCode_PrevAndNext(Session session,
		HistoryRmdcShip historyRmdcShip, String shipTypeCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_HISTORYRMDCSHIP_WHERE);

		boolean bindShipTypeCode = false;

		if (shipTypeCode == null) {
			query.append(_FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_1);
		}
		else if (shipTypeCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_3);
		}
		else {
			bindShipTypeCode = true;

			query.append(_FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_2);
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
			query.append(HistoryRmdcShipModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindShipTypeCode) {
			qPos.add(shipTypeCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(historyRmdcShip);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<HistoryRmdcShip> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the history rmdc ships where shipTypeCode = &#63; from the database.
	 *
	 * @param shipTypeCode the ship type code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByShipTypeCode(String shipTypeCode)
		throws SystemException {
		for (HistoryRmdcShip historyRmdcShip : findByShipTypeCode(
				shipTypeCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(historyRmdcShip);
		}
	}

	/**
	 * Returns the number of history rmdc ships where shipTypeCode = &#63;.
	 *
	 * @param shipTypeCode the ship type code
	 * @return the number of matching history rmdc ships
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByShipTypeCode(String shipTypeCode)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SHIPTYPECODE;

		Object[] finderArgs = new Object[] { shipTypeCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_HISTORYRMDCSHIP_WHERE);

			boolean bindShipTypeCode = false;

			if (shipTypeCode == null) {
				query.append(_FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_1);
			}
			else if (shipTypeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_3);
			}
			else {
				bindShipTypeCode = true;

				query.append(_FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindShipTypeCode) {
					qPos.add(shipTypeCode);
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

	private static final String _FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_1 = "historyRmdcShip.shipTypeCode IS NULL";
	private static final String _FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_2 = "historyRmdcShip.shipTypeCode = ?";
	private static final String _FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_3 = "(historyRmdcShip.shipTypeCode IS NULL OR historyRmdcShip.shipTypeCode = '')";

	public HistoryRmdcShipPersistenceImpl() {
		setModelClass(HistoryRmdcShip.class);
	}

	/**
	 * Caches the history rmdc ship in the entity cache if it is enabled.
	 *
	 * @param historyRmdcShip the history rmdc ship
	 */
	@Override
	public void cacheResult(HistoryRmdcShip historyRmdcShip) {
		EntityCacheUtil.putResult(HistoryRmdcShipModelImpl.ENTITY_CACHE_ENABLED,
			HistoryRmdcShipImpl.class, historyRmdcShip.getPrimaryKey(),
			historyRmdcShip);

		historyRmdcShip.resetOriginalValues();
	}

	/**
	 * Caches the history rmdc ships in the entity cache if it is enabled.
	 *
	 * @param historyRmdcShips the history rmdc ships
	 */
	@Override
	public void cacheResult(List<HistoryRmdcShip> historyRmdcShips) {
		for (HistoryRmdcShip historyRmdcShip : historyRmdcShips) {
			if (EntityCacheUtil.getResult(
						HistoryRmdcShipModelImpl.ENTITY_CACHE_ENABLED,
						HistoryRmdcShipImpl.class,
						historyRmdcShip.getPrimaryKey()) == null) {
				cacheResult(historyRmdcShip);
			}
			else {
				historyRmdcShip.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all history rmdc ships.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(HistoryRmdcShipImpl.class.getName());
		}

		EntityCacheUtil.clearCache(HistoryRmdcShipImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the history rmdc ship.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(HistoryRmdcShip historyRmdcShip) {
		EntityCacheUtil.removeResult(HistoryRmdcShipModelImpl.ENTITY_CACHE_ENABLED,
			HistoryRmdcShipImpl.class, historyRmdcShip.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<HistoryRmdcShip> historyRmdcShips) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (HistoryRmdcShip historyRmdcShip : historyRmdcShips) {
			EntityCacheUtil.removeResult(HistoryRmdcShipModelImpl.ENTITY_CACHE_ENABLED,
				HistoryRmdcShipImpl.class, historyRmdcShip.getPrimaryKey());
		}
	}

	/**
	 * Creates a new history rmdc ship with the primary key. Does not add the history rmdc ship to the database.
	 *
	 * @param id the primary key for the new history rmdc ship
	 * @return the new history rmdc ship
	 */
	@Override
	public HistoryRmdcShip create(long id) {
		HistoryRmdcShip historyRmdcShip = new HistoryRmdcShipImpl();

		historyRmdcShip.setNew(true);
		historyRmdcShip.setPrimaryKey(id);

		return historyRmdcShip;
	}

	/**
	 * Removes the history rmdc ship with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the history rmdc ship
	 * @return the history rmdc ship that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryRmdcShipException if a history rmdc ship with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryRmdcShip remove(long id)
		throws NoSuchHistoryRmdcShipException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the history rmdc ship with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the history rmdc ship
	 * @return the history rmdc ship that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryRmdcShipException if a history rmdc ship with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryRmdcShip remove(Serializable primaryKey)
		throws NoSuchHistoryRmdcShipException, SystemException {
		Session session = null;

		try {
			session = openSession();

			HistoryRmdcShip historyRmdcShip = (HistoryRmdcShip)session.get(HistoryRmdcShipImpl.class,
					primaryKey);

			if (historyRmdcShip == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchHistoryRmdcShipException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(historyRmdcShip);
		}
		catch (NoSuchHistoryRmdcShipException nsee) {
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
	protected HistoryRmdcShip removeImpl(HistoryRmdcShip historyRmdcShip)
		throws SystemException {
		historyRmdcShip = toUnwrappedModel(historyRmdcShip);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(historyRmdcShip)) {
				historyRmdcShip = (HistoryRmdcShip)session.get(HistoryRmdcShipImpl.class,
						historyRmdcShip.getPrimaryKeyObj());
			}

			if (historyRmdcShip != null) {
				session.delete(historyRmdcShip);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (historyRmdcShip != null) {
			clearCache(historyRmdcShip);
		}

		return historyRmdcShip;
	}

	@Override
	public HistoryRmdcShip updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip historyRmdcShip)
		throws SystemException {
		historyRmdcShip = toUnwrappedModel(historyRmdcShip);

		boolean isNew = historyRmdcShip.isNew();

		HistoryRmdcShipModelImpl historyRmdcShipModelImpl = (HistoryRmdcShipModelImpl)historyRmdcShip;

		Session session = null;

		try {
			session = openSession();

			if (historyRmdcShip.isNew()) {
				session.save(historyRmdcShip);

				historyRmdcShip.setNew(false);
			}
			else {
				session.merge(historyRmdcShip);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !HistoryRmdcShipModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((historyRmdcShipModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SYNCVERSION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						historyRmdcShipModelImpl.getOriginalSyncVersion()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SYNCVERSION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SYNCVERSION,
					args);

				args = new Object[] { historyRmdcShipModelImpl.getSyncVersion() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SYNCVERSION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SYNCVERSION,
					args);
			}

			if ((historyRmdcShipModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SHIPTYPECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						historyRmdcShipModelImpl.getOriginalShipTypeCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SHIPTYPECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SHIPTYPECODE,
					args);

				args = new Object[] { historyRmdcShipModelImpl.getShipTypeCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SHIPTYPECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SHIPTYPECODE,
					args);
			}
		}

		EntityCacheUtil.putResult(HistoryRmdcShipModelImpl.ENTITY_CACHE_ENABLED,
			HistoryRmdcShipImpl.class, historyRmdcShip.getPrimaryKey(),
			historyRmdcShip);

		return historyRmdcShip;
	}

	protected HistoryRmdcShip toUnwrappedModel(HistoryRmdcShip historyRmdcShip) {
		if (historyRmdcShip instanceof HistoryRmdcShipImpl) {
			return historyRmdcShip;
		}

		HistoryRmdcShipImpl historyRmdcShipImpl = new HistoryRmdcShipImpl();

		historyRmdcShipImpl.setNew(historyRmdcShip.isNew());
		historyRmdcShipImpl.setPrimaryKey(historyRmdcShip.getPrimaryKey());

		historyRmdcShipImpl.setId(historyRmdcShip.getId());
		historyRmdcShipImpl.setShipId(historyRmdcShip.getShipId());
		historyRmdcShipImpl.setShipName(historyRmdcShip.getShipName());
		historyRmdcShipImpl.setShipTypeId(historyRmdcShip.getShipTypeId());
		historyRmdcShipImpl.setShipTypeCode(historyRmdcShip.getShipTypeCode());
		historyRmdcShipImpl.setImo(historyRmdcShip.getImo());
		historyRmdcShipImpl.setCallSign(historyRmdcShip.getCallSign());
		historyRmdcShipImpl.setStateId(historyRmdcShip.getStateId());
		historyRmdcShipImpl.setStateCode(historyRmdcShip.getStateCode());
		historyRmdcShipImpl.setRegistryNumber(historyRmdcShip.getRegistryNumber());
		historyRmdcShipImpl.setRegistryDate(historyRmdcShip.getRegistryDate());
		historyRmdcShipImpl.setRegistryPortId(historyRmdcShip.getRegistryPortId());
		historyRmdcShipImpl.setRegistryPortCode(historyRmdcShip.getRegistryPortCode());
		historyRmdcShipImpl.setGt(historyRmdcShip.getGt());
		historyRmdcShipImpl.setNrt(historyRmdcShip.getNrt());
		historyRmdcShipImpl.setDwt(historyRmdcShip.getDwt());
		historyRmdcShipImpl.setLength(historyRmdcShip.getLength());
		historyRmdcShipImpl.setWidth(historyRmdcShip.getWidth());
		historyRmdcShipImpl.setHeight(historyRmdcShip.getHeight());
		historyRmdcShipImpl.setSailingSpeed(historyRmdcShip.getSailingSpeed());
		historyRmdcShipImpl.setColor(historyRmdcShip.getColor());
		historyRmdcShipImpl.setBoneCode(historyRmdcShip.getBoneCode());
		historyRmdcShipImpl.setMachineCode(historyRmdcShip.getMachineCode());
		historyRmdcShipImpl.setShipAgencyId(historyRmdcShip.getShipAgencyId());
		historyRmdcShipImpl.setShipAgencyCode(historyRmdcShip.getShipAgencyCode());
		historyRmdcShipImpl.setFishingBoatRegistration(historyRmdcShip.getFishingBoatRegistration());
		historyRmdcShipImpl.setRoleShip(historyRmdcShip.getRoleShip());
		historyRmdcShipImpl.setIsDelete(historyRmdcShip.getIsDelete());
		historyRmdcShipImpl.setMarkedAsDelete(historyRmdcShip.getMarkedAsDelete());
		historyRmdcShipImpl.setModifiedDate(historyRmdcShip.getModifiedDate());
		historyRmdcShipImpl.setRequestedDate(historyRmdcShip.getRequestedDate());
		historyRmdcShipImpl.setSyncVersion(historyRmdcShip.getSyncVersion());

		return historyRmdcShipImpl;
	}

	/**
	 * Returns the history rmdc ship with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the history rmdc ship
	 * @return the history rmdc ship
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryRmdcShipException if a history rmdc ship with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryRmdcShip findByPrimaryKey(Serializable primaryKey)
		throws NoSuchHistoryRmdcShipException, SystemException {
		HistoryRmdcShip historyRmdcShip = fetchByPrimaryKey(primaryKey);

		if (historyRmdcShip == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchHistoryRmdcShipException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return historyRmdcShip;
	}

	/**
	 * Returns the history rmdc ship with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchHistoryRmdcShipException} if it could not be found.
	 *
	 * @param id the primary key of the history rmdc ship
	 * @return the history rmdc ship
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryRmdcShipException if a history rmdc ship with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryRmdcShip findByPrimaryKey(long id)
		throws NoSuchHistoryRmdcShipException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the history rmdc ship with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the history rmdc ship
	 * @return the history rmdc ship, or <code>null</code> if a history rmdc ship with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryRmdcShip fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		HistoryRmdcShip historyRmdcShip = (HistoryRmdcShip)EntityCacheUtil.getResult(HistoryRmdcShipModelImpl.ENTITY_CACHE_ENABLED,
				HistoryRmdcShipImpl.class, primaryKey);

		if (historyRmdcShip == _nullHistoryRmdcShip) {
			return null;
		}

		if (historyRmdcShip == null) {
			Session session = null;

			try {
				session = openSession();

				historyRmdcShip = (HistoryRmdcShip)session.get(HistoryRmdcShipImpl.class,
						primaryKey);

				if (historyRmdcShip != null) {
					cacheResult(historyRmdcShip);
				}
				else {
					EntityCacheUtil.putResult(HistoryRmdcShipModelImpl.ENTITY_CACHE_ENABLED,
						HistoryRmdcShipImpl.class, primaryKey,
						_nullHistoryRmdcShip);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(HistoryRmdcShipModelImpl.ENTITY_CACHE_ENABLED,
					HistoryRmdcShipImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return historyRmdcShip;
	}

	/**
	 * Returns the history rmdc ship with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the history rmdc ship
	 * @return the history rmdc ship, or <code>null</code> if a history rmdc ship with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryRmdcShip fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the history rmdc ships.
	 *
	 * @return the history rmdc ships
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<HistoryRmdcShip> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the history rmdc ships.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.HistoryRmdcShipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of history rmdc ships
	 * @param end the upper bound of the range of history rmdc ships (not inclusive)
	 * @return the range of history rmdc ships
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<HistoryRmdcShip> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the history rmdc ships.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.HistoryRmdcShipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of history rmdc ships
	 * @param end the upper bound of the range of history rmdc ships (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of history rmdc ships
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<HistoryRmdcShip> findAll(int start, int end,
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

		List<HistoryRmdcShip> list = (List<HistoryRmdcShip>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_HISTORYRMDCSHIP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_HISTORYRMDCSHIP;

				if (pagination) {
					sql = sql.concat(HistoryRmdcShipModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<HistoryRmdcShip>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<HistoryRmdcShip>(list);
				}
				else {
					list = (List<HistoryRmdcShip>)QueryUtil.list(q,
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
	 * Removes all the history rmdc ships from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (HistoryRmdcShip historyRmdcShip : findAll()) {
			remove(historyRmdcShip);
		}
	}

	/**
	 * Returns the number of history rmdc ships.
	 *
	 * @return the number of history rmdc ships
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

				Query q = session.createQuery(_SQL_COUNT_HISTORYRMDCSHIP);

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
	 * Initializes the history rmdc ship persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<HistoryRmdcShip>> listenersList = new ArrayList<ModelListener<HistoryRmdcShip>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<HistoryRmdcShip>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(HistoryRmdcShipImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_HISTORYRMDCSHIP = "SELECT historyRmdcShip FROM HistoryRmdcShip historyRmdcShip";
	private static final String _SQL_SELECT_HISTORYRMDCSHIP_WHERE = "SELECT historyRmdcShip FROM HistoryRmdcShip historyRmdcShip WHERE ";
	private static final String _SQL_COUNT_HISTORYRMDCSHIP = "SELECT COUNT(historyRmdcShip) FROM HistoryRmdcShip historyRmdcShip";
	private static final String _SQL_COUNT_HISTORYRMDCSHIP_WHERE = "SELECT COUNT(historyRmdcShip) FROM HistoryRmdcShip historyRmdcShip WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "historyRmdcShip.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No HistoryRmdcShip exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No HistoryRmdcShip exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(HistoryRmdcShipPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"shipId", "shipName", "shipTypeId", "shipTypeCode", "callSign",
				"stateId", "stateCode", "registryNumber", "registryDate",
				"registryPortId", "registryPortCode", "length", "width",
				"height", "sailingSpeed", "boneCode", "machineCode",
				"shipAgencyId", "shipAgencyCode", "fishingBoatRegistration",
				"roleShip", "isDelete", "markedAsDelete", "modifiedDate",
				"requestedDate", "syncVersion"
			});
	private static HistoryRmdcShip _nullHistoryRmdcShip = new HistoryRmdcShipImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<HistoryRmdcShip> toCacheModel() {
				return _nullHistoryRmdcShipCacheModel;
			}
		};

	private static CacheModel<HistoryRmdcShip> _nullHistoryRmdcShipCacheModel = new CacheModel<HistoryRmdcShip>() {
			@Override
			public HistoryRmdcShip toEntityModel() {
				return _nullHistoryRmdcShip;
			}
		};
}