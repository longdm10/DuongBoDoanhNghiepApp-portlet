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

import vn.dtt.duongbien.dao.vrcb.NoSuchHistorySyncVersionException;
import vn.dtt.duongbien.dao.vrcb.model.HistorySyncVersion;
import vn.dtt.duongbien.dao.vrcb.model.impl.HistorySyncVersionImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.HistorySyncVersionModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the history sync version service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see HistorySyncVersionPersistence
 * @see HistorySyncVersionUtil
 * @generated
 */
public class HistorySyncVersionPersistenceImpl extends BasePersistenceImpl<HistorySyncVersion>
	implements HistorySyncVersionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link HistorySyncVersionUtil} to access the history sync version persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = HistorySyncVersionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(HistorySyncVersionModelImpl.ENTITY_CACHE_ENABLED,
			HistorySyncVersionModelImpl.FINDER_CACHE_ENABLED,
			HistorySyncVersionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(HistorySyncVersionModelImpl.ENTITY_CACHE_ENABLED,
			HistorySyncVersionModelImpl.FINDER_CACHE_ENABLED,
			HistorySyncVersionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(HistorySyncVersionModelImpl.ENTITY_CACHE_ENABLED,
			HistorySyncVersionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SYNCVERSION =
		new FinderPath(HistorySyncVersionModelImpl.ENTITY_CACHE_ENABLED,
			HistorySyncVersionModelImpl.FINDER_CACHE_ENABLED,
			HistorySyncVersionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBySyncVersion",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SYNCVERSION =
		new FinderPath(HistorySyncVersionModelImpl.ENTITY_CACHE_ENABLED,
			HistorySyncVersionModelImpl.FINDER_CACHE_ENABLED,
			HistorySyncVersionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBySyncVersion",
			new String[] { String.class.getName() },
			HistorySyncVersionModelImpl.SYNCVERSION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SYNCVERSION = new FinderPath(HistorySyncVersionModelImpl.ENTITY_CACHE_ENABLED,
			HistorySyncVersionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBySyncVersion",
			new String[] { String.class.getName() });

	/**
	 * Returns all the history sync versions where syncVersion = &#63;.
	 *
	 * @param syncVersion the sync version
	 * @return the matching history sync versions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<HistorySyncVersion> findBySyncVersion(String syncVersion)
		throws SystemException {
		return findBySyncVersion(syncVersion, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the history sync versions where syncVersion = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.HistorySyncVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param syncVersion the sync version
	 * @param start the lower bound of the range of history sync versions
	 * @param end the upper bound of the range of history sync versions (not inclusive)
	 * @return the range of matching history sync versions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<HistorySyncVersion> findBySyncVersion(String syncVersion,
		int start, int end) throws SystemException {
		return findBySyncVersion(syncVersion, start, end, null);
	}

	/**
	 * Returns an ordered range of all the history sync versions where syncVersion = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.HistorySyncVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param syncVersion the sync version
	 * @param start the lower bound of the range of history sync versions
	 * @param end the upper bound of the range of history sync versions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching history sync versions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<HistorySyncVersion> findBySyncVersion(String syncVersion,
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

		List<HistorySyncVersion> list = (List<HistorySyncVersion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (HistorySyncVersion historySyncVersion : list) {
				if (!Validator.equals(syncVersion,
							historySyncVersion.getSyncVersion())) {
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

			query.append(_SQL_SELECT_HISTORYSYNCVERSION_WHERE);

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
				query.append(HistorySyncVersionModelImpl.ORDER_BY_JPQL);
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
					list = (List<HistorySyncVersion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<HistorySyncVersion>(list);
				}
				else {
					list = (List<HistorySyncVersion>)QueryUtil.list(q,
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
	 * Returns the first history sync version in the ordered set where syncVersion = &#63;.
	 *
	 * @param syncVersion the sync version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching history sync version
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistorySyncVersionException if a matching history sync version could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistorySyncVersion findBySyncVersion_First(String syncVersion,
		OrderByComparator orderByComparator)
		throws NoSuchHistorySyncVersionException, SystemException {
		HistorySyncVersion historySyncVersion = fetchBySyncVersion_First(syncVersion,
				orderByComparator);

		if (historySyncVersion != null) {
			return historySyncVersion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("syncVersion=");
		msg.append(syncVersion);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchHistorySyncVersionException(msg.toString());
	}

	/**
	 * Returns the first history sync version in the ordered set where syncVersion = &#63;.
	 *
	 * @param syncVersion the sync version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching history sync version, or <code>null</code> if a matching history sync version could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistorySyncVersion fetchBySyncVersion_First(String syncVersion,
		OrderByComparator orderByComparator) throws SystemException {
		List<HistorySyncVersion> list = findBySyncVersion(syncVersion, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last history sync version in the ordered set where syncVersion = &#63;.
	 *
	 * @param syncVersion the sync version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching history sync version
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistorySyncVersionException if a matching history sync version could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistorySyncVersion findBySyncVersion_Last(String syncVersion,
		OrderByComparator orderByComparator)
		throws NoSuchHistorySyncVersionException, SystemException {
		HistorySyncVersion historySyncVersion = fetchBySyncVersion_Last(syncVersion,
				orderByComparator);

		if (historySyncVersion != null) {
			return historySyncVersion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("syncVersion=");
		msg.append(syncVersion);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchHistorySyncVersionException(msg.toString());
	}

	/**
	 * Returns the last history sync version in the ordered set where syncVersion = &#63;.
	 *
	 * @param syncVersion the sync version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching history sync version, or <code>null</code> if a matching history sync version could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistorySyncVersion fetchBySyncVersion_Last(String syncVersion,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBySyncVersion(syncVersion);

		if (count == 0) {
			return null;
		}

		List<HistorySyncVersion> list = findBySyncVersion(syncVersion,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the history sync versions before and after the current history sync version in the ordered set where syncVersion = &#63;.
	 *
	 * @param id the primary key of the current history sync version
	 * @param syncVersion the sync version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next history sync version
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistorySyncVersionException if a history sync version with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistorySyncVersion[] findBySyncVersion_PrevAndNext(long id,
		String syncVersion, OrderByComparator orderByComparator)
		throws NoSuchHistorySyncVersionException, SystemException {
		HistorySyncVersion historySyncVersion = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			HistorySyncVersion[] array = new HistorySyncVersionImpl[3];

			array[0] = getBySyncVersion_PrevAndNext(session,
					historySyncVersion, syncVersion, orderByComparator, true);

			array[1] = historySyncVersion;

			array[2] = getBySyncVersion_PrevAndNext(session,
					historySyncVersion, syncVersion, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected HistorySyncVersion getBySyncVersion_PrevAndNext(Session session,
		HistorySyncVersion historySyncVersion, String syncVersion,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_HISTORYSYNCVERSION_WHERE);

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
			query.append(HistorySyncVersionModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(historySyncVersion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<HistorySyncVersion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the history sync versions where syncVersion = &#63; from the database.
	 *
	 * @param syncVersion the sync version
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBySyncVersion(String syncVersion)
		throws SystemException {
		for (HistorySyncVersion historySyncVersion : findBySyncVersion(
				syncVersion, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(historySyncVersion);
		}
	}

	/**
	 * Returns the number of history sync versions where syncVersion = &#63;.
	 *
	 * @param syncVersion the sync version
	 * @return the number of matching history sync versions
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

			query.append(_SQL_COUNT_HISTORYSYNCVERSION_WHERE);

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

	private static final String _FINDER_COLUMN_SYNCVERSION_SYNCVERSION_1 = "historySyncVersion.syncVersion IS NULL";
	private static final String _FINDER_COLUMN_SYNCVERSION_SYNCVERSION_2 = "historySyncVersion.syncVersion = ?";
	private static final String _FINDER_COLUMN_SYNCVERSION_SYNCVERSION_3 = "(historySyncVersion.syncVersion IS NULL OR historySyncVersion.syncVersion = '')";

	public HistorySyncVersionPersistenceImpl() {
		setModelClass(HistorySyncVersion.class);
	}

	/**
	 * Caches the history sync version in the entity cache if it is enabled.
	 *
	 * @param historySyncVersion the history sync version
	 */
	@Override
	public void cacheResult(HistorySyncVersion historySyncVersion) {
		EntityCacheUtil.putResult(HistorySyncVersionModelImpl.ENTITY_CACHE_ENABLED,
			HistorySyncVersionImpl.class, historySyncVersion.getPrimaryKey(),
			historySyncVersion);

		historySyncVersion.resetOriginalValues();
	}

	/**
	 * Caches the history sync versions in the entity cache if it is enabled.
	 *
	 * @param historySyncVersions the history sync versions
	 */
	@Override
	public void cacheResult(List<HistorySyncVersion> historySyncVersions) {
		for (HistorySyncVersion historySyncVersion : historySyncVersions) {
			if (EntityCacheUtil.getResult(
						HistorySyncVersionModelImpl.ENTITY_CACHE_ENABLED,
						HistorySyncVersionImpl.class,
						historySyncVersion.getPrimaryKey()) == null) {
				cacheResult(historySyncVersion);
			}
			else {
				historySyncVersion.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all history sync versions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(HistorySyncVersionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(HistorySyncVersionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the history sync version.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(HistorySyncVersion historySyncVersion) {
		EntityCacheUtil.removeResult(HistorySyncVersionModelImpl.ENTITY_CACHE_ENABLED,
			HistorySyncVersionImpl.class, historySyncVersion.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<HistorySyncVersion> historySyncVersions) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (HistorySyncVersion historySyncVersion : historySyncVersions) {
			EntityCacheUtil.removeResult(HistorySyncVersionModelImpl.ENTITY_CACHE_ENABLED,
				HistorySyncVersionImpl.class, historySyncVersion.getPrimaryKey());
		}
	}

	/**
	 * Creates a new history sync version with the primary key. Does not add the history sync version to the database.
	 *
	 * @param id the primary key for the new history sync version
	 * @return the new history sync version
	 */
	@Override
	public HistorySyncVersion create(long id) {
		HistorySyncVersion historySyncVersion = new HistorySyncVersionImpl();

		historySyncVersion.setNew(true);
		historySyncVersion.setPrimaryKey(id);

		return historySyncVersion;
	}

	/**
	 * Removes the history sync version with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the history sync version
	 * @return the history sync version that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistorySyncVersionException if a history sync version with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistorySyncVersion remove(long id)
		throws NoSuchHistorySyncVersionException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the history sync version with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the history sync version
	 * @return the history sync version that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistorySyncVersionException if a history sync version with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistorySyncVersion remove(Serializable primaryKey)
		throws NoSuchHistorySyncVersionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			HistorySyncVersion historySyncVersion = (HistorySyncVersion)session.get(HistorySyncVersionImpl.class,
					primaryKey);

			if (historySyncVersion == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchHistorySyncVersionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(historySyncVersion);
		}
		catch (NoSuchHistorySyncVersionException nsee) {
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
	protected HistorySyncVersion removeImpl(
		HistorySyncVersion historySyncVersion) throws SystemException {
		historySyncVersion = toUnwrappedModel(historySyncVersion);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(historySyncVersion)) {
				historySyncVersion = (HistorySyncVersion)session.get(HistorySyncVersionImpl.class,
						historySyncVersion.getPrimaryKeyObj());
			}

			if (historySyncVersion != null) {
				session.delete(historySyncVersion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (historySyncVersion != null) {
			clearCache(historySyncVersion);
		}

		return historySyncVersion;
	}

	@Override
	public HistorySyncVersion updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.HistorySyncVersion historySyncVersion)
		throws SystemException {
		historySyncVersion = toUnwrappedModel(historySyncVersion);

		boolean isNew = historySyncVersion.isNew();

		HistorySyncVersionModelImpl historySyncVersionModelImpl = (HistorySyncVersionModelImpl)historySyncVersion;

		Session session = null;

		try {
			session = openSession();

			if (historySyncVersion.isNew()) {
				session.save(historySyncVersion);

				historySyncVersion.setNew(false);
			}
			else {
				session.merge(historySyncVersion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !HistorySyncVersionModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((historySyncVersionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SYNCVERSION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						historySyncVersionModelImpl.getOriginalSyncVersion()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SYNCVERSION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SYNCVERSION,
					args);

				args = new Object[] { historySyncVersionModelImpl.getSyncVersion() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SYNCVERSION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SYNCVERSION,
					args);
			}
		}

		EntityCacheUtil.putResult(HistorySyncVersionModelImpl.ENTITY_CACHE_ENABLED,
			HistorySyncVersionImpl.class, historySyncVersion.getPrimaryKey(),
			historySyncVersion);

		return historySyncVersion;
	}

	protected HistorySyncVersion toUnwrappedModel(
		HistorySyncVersion historySyncVersion) {
		if (historySyncVersion instanceof HistorySyncVersionImpl) {
			return historySyncVersion;
		}

		HistorySyncVersionImpl historySyncVersionImpl = new HistorySyncVersionImpl();

		historySyncVersionImpl.setNew(historySyncVersion.isNew());
		historySyncVersionImpl.setPrimaryKey(historySyncVersion.getPrimaryKey());

		historySyncVersionImpl.setId(historySyncVersion.getId());
		historySyncVersionImpl.setRequestedDate(historySyncVersion.getRequestedDate());
		historySyncVersionImpl.setTimeofPublish(historySyncVersion.getTimeofPublish());
		historySyncVersionImpl.setCategoryID(historySyncVersion.getCategoryID());
		historySyncVersionImpl.setSyncUnit(historySyncVersion.getSyncUnit());
		historySyncVersionImpl.setSyncUser(historySyncVersion.getSyncUser());
		historySyncVersionImpl.setSyncVersion(historySyncVersion.getSyncVersion());
		historySyncVersionImpl.setLatestValueDate(historySyncVersion.getLatestValueDate());

		return historySyncVersionImpl;
	}

	/**
	 * Returns the history sync version with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the history sync version
	 * @return the history sync version
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistorySyncVersionException if a history sync version with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistorySyncVersion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchHistorySyncVersionException, SystemException {
		HistorySyncVersion historySyncVersion = fetchByPrimaryKey(primaryKey);

		if (historySyncVersion == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchHistorySyncVersionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return historySyncVersion;
	}

	/**
	 * Returns the history sync version with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchHistorySyncVersionException} if it could not be found.
	 *
	 * @param id the primary key of the history sync version
	 * @return the history sync version
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistorySyncVersionException if a history sync version with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistorySyncVersion findByPrimaryKey(long id)
		throws NoSuchHistorySyncVersionException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the history sync version with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the history sync version
	 * @return the history sync version, or <code>null</code> if a history sync version with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistorySyncVersion fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		HistorySyncVersion historySyncVersion = (HistorySyncVersion)EntityCacheUtil.getResult(HistorySyncVersionModelImpl.ENTITY_CACHE_ENABLED,
				HistorySyncVersionImpl.class, primaryKey);

		if (historySyncVersion == _nullHistorySyncVersion) {
			return null;
		}

		if (historySyncVersion == null) {
			Session session = null;

			try {
				session = openSession();

				historySyncVersion = (HistorySyncVersion)session.get(HistorySyncVersionImpl.class,
						primaryKey);

				if (historySyncVersion != null) {
					cacheResult(historySyncVersion);
				}
				else {
					EntityCacheUtil.putResult(HistorySyncVersionModelImpl.ENTITY_CACHE_ENABLED,
						HistorySyncVersionImpl.class, primaryKey,
						_nullHistorySyncVersion);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(HistorySyncVersionModelImpl.ENTITY_CACHE_ENABLED,
					HistorySyncVersionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return historySyncVersion;
	}

	/**
	 * Returns the history sync version with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the history sync version
	 * @return the history sync version, or <code>null</code> if a history sync version with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistorySyncVersion fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the history sync versions.
	 *
	 * @return the history sync versions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<HistorySyncVersion> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the history sync versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.HistorySyncVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of history sync versions
	 * @param end the upper bound of the range of history sync versions (not inclusive)
	 * @return the range of history sync versions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<HistorySyncVersion> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the history sync versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.HistorySyncVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of history sync versions
	 * @param end the upper bound of the range of history sync versions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of history sync versions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<HistorySyncVersion> findAll(int start, int end,
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

		List<HistorySyncVersion> list = (List<HistorySyncVersion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_HISTORYSYNCVERSION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_HISTORYSYNCVERSION;

				if (pagination) {
					sql = sql.concat(HistorySyncVersionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<HistorySyncVersion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<HistorySyncVersion>(list);
				}
				else {
					list = (List<HistorySyncVersion>)QueryUtil.list(q,
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
	 * Removes all the history sync versions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (HistorySyncVersion historySyncVersion : findAll()) {
			remove(historySyncVersion);
		}
	}

	/**
	 * Returns the number of history sync versions.
	 *
	 * @return the number of history sync versions
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

				Query q = session.createQuery(_SQL_COUNT_HISTORYSYNCVERSION);

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
	 * Initializes the history sync version persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.HistorySyncVersion")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<HistorySyncVersion>> listenersList = new ArrayList<ModelListener<HistorySyncVersion>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<HistorySyncVersion>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(HistorySyncVersionImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_HISTORYSYNCVERSION = "SELECT historySyncVersion FROM HistorySyncVersion historySyncVersion";
	private static final String _SQL_SELECT_HISTORYSYNCVERSION_WHERE = "SELECT historySyncVersion FROM HistorySyncVersion historySyncVersion WHERE ";
	private static final String _SQL_COUNT_HISTORYSYNCVERSION = "SELECT COUNT(historySyncVersion) FROM HistorySyncVersion historySyncVersion";
	private static final String _SQL_COUNT_HISTORYSYNCVERSION_WHERE = "SELECT COUNT(historySyncVersion) FROM HistorySyncVersion historySyncVersion WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "historySyncVersion.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No HistorySyncVersion exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No HistorySyncVersion exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(HistorySyncVersionPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"requestedDate", "timeofPublish", "categoryID", "syncUnit",
				"syncUser", "syncVersion", "latestValueDate"
			});
	private static HistorySyncVersion _nullHistorySyncVersion = new HistorySyncVersionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<HistorySyncVersion> toCacheModel() {
				return _nullHistorySyncVersionCacheModel;
			}
		};

	private static CacheModel<HistorySyncVersion> _nullHistorySyncVersionCacheModel =
		new CacheModel<HistorySyncVersion>() {
			@Override
			public HistorySyncVersion toEntityModel() {
				return _nullHistorySyncVersion;
			}
		};
}