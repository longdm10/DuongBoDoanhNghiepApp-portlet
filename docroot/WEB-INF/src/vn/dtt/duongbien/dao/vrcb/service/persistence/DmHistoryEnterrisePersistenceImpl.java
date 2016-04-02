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

import vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException;
import vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryEnterriseImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryEnterriseModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dm history enterrise service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmHistoryEnterrisePersistence
 * @see DmHistoryEnterriseUtil
 * @generated
 */
public class DmHistoryEnterrisePersistenceImpl extends BasePersistenceImpl<DmHistoryEnterrise>
	implements DmHistoryEnterrisePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmHistoryEnterriseUtil} to access the dm history enterrise persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmHistoryEnterriseImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmHistoryEnterriseModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryEnterriseModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryEnterriseImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmHistoryEnterriseModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryEnterriseModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryEnterriseImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmHistoryEnterriseModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryEnterriseModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SYNCVERSION =
		new FinderPath(DmHistoryEnterriseModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryEnterriseModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryEnterriseImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBySyncVersion",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SYNCVERSION =
		new FinderPath(DmHistoryEnterriseModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryEnterriseModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryEnterriseImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBySyncVersion",
			new String[] { String.class.getName() },
			DmHistoryEnterriseModelImpl.SYNCVERSION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SYNCVERSION = new FinderPath(DmHistoryEnterriseModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryEnterriseModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBySyncVersion",
			new String[] { String.class.getName() });

	/**
	 * Returns all the dm history enterrises where syncVersion = &#63;.
	 *
	 * @param syncVersion the sync version
	 * @return the matching dm history enterrises
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryEnterrise> findBySyncVersion(String syncVersion)
		throws SystemException {
		return findBySyncVersion(syncVersion, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history enterrises where syncVersion = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryEnterriseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param syncVersion the sync version
	 * @param start the lower bound of the range of dm history enterrises
	 * @param end the upper bound of the range of dm history enterrises (not inclusive)
	 * @return the range of matching dm history enterrises
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryEnterrise> findBySyncVersion(String syncVersion,
		int start, int end) throws SystemException {
		return findBySyncVersion(syncVersion, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history enterrises where syncVersion = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryEnterriseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param syncVersion the sync version
	 * @param start the lower bound of the range of dm history enterrises
	 * @param end the upper bound of the range of dm history enterrises (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm history enterrises
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryEnterrise> findBySyncVersion(String syncVersion,
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

		List<DmHistoryEnterrise> list = (List<DmHistoryEnterrise>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmHistoryEnterrise dmHistoryEnterrise : list) {
				if (!Validator.equals(syncVersion,
							dmHistoryEnterrise.getSyncVersion())) {
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

			query.append(_SQL_SELECT_DMHISTORYENTERRISE_WHERE);

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
				query.append(DmHistoryEnterriseModelImpl.ORDER_BY_JPQL);
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
					list = (List<DmHistoryEnterrise>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmHistoryEnterrise>(list);
				}
				else {
					list = (List<DmHistoryEnterrise>)QueryUtil.list(q,
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
	 * Returns the first dm history enterrise in the ordered set where syncVersion = &#63;.
	 *
	 * @param syncVersion the sync version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm history enterrise
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException if a matching dm history enterrise could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryEnterrise findBySyncVersion_First(String syncVersion,
		OrderByComparator orderByComparator)
		throws NoSuchDmHistoryEnterriseException, SystemException {
		DmHistoryEnterrise dmHistoryEnterrise = fetchBySyncVersion_First(syncVersion,
				orderByComparator);

		if (dmHistoryEnterrise != null) {
			return dmHistoryEnterrise;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("syncVersion=");
		msg.append(syncVersion);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmHistoryEnterriseException(msg.toString());
	}

	/**
	 * Returns the first dm history enterrise in the ordered set where syncVersion = &#63;.
	 *
	 * @param syncVersion the sync version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm history enterrise, or <code>null</code> if a matching dm history enterrise could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryEnterrise fetchBySyncVersion_First(String syncVersion,
		OrderByComparator orderByComparator) throws SystemException {
		List<DmHistoryEnterrise> list = findBySyncVersion(syncVersion, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm history enterrise in the ordered set where syncVersion = &#63;.
	 *
	 * @param syncVersion the sync version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm history enterrise
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException if a matching dm history enterrise could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryEnterrise findBySyncVersion_Last(String syncVersion,
		OrderByComparator orderByComparator)
		throws NoSuchDmHistoryEnterriseException, SystemException {
		DmHistoryEnterrise dmHistoryEnterrise = fetchBySyncVersion_Last(syncVersion,
				orderByComparator);

		if (dmHistoryEnterrise != null) {
			return dmHistoryEnterrise;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("syncVersion=");
		msg.append(syncVersion);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmHistoryEnterriseException(msg.toString());
	}

	/**
	 * Returns the last dm history enterrise in the ordered set where syncVersion = &#63;.
	 *
	 * @param syncVersion the sync version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm history enterrise, or <code>null</code> if a matching dm history enterrise could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryEnterrise fetchBySyncVersion_Last(String syncVersion,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBySyncVersion(syncVersion);

		if (count == 0) {
			return null;
		}

		List<DmHistoryEnterrise> list = findBySyncVersion(syncVersion,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm history enterrises before and after the current dm history enterrise in the ordered set where syncVersion = &#63;.
	 *
	 * @param id the primary key of the current dm history enterrise
	 * @param syncVersion the sync version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm history enterrise
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException if a dm history enterrise with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryEnterrise[] findBySyncVersion_PrevAndNext(int id,
		String syncVersion, OrderByComparator orderByComparator)
		throws NoSuchDmHistoryEnterriseException, SystemException {
		DmHistoryEnterrise dmHistoryEnterrise = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmHistoryEnterrise[] array = new DmHistoryEnterriseImpl[3];

			array[0] = getBySyncVersion_PrevAndNext(session,
					dmHistoryEnterrise, syncVersion, orderByComparator, true);

			array[1] = dmHistoryEnterrise;

			array[2] = getBySyncVersion_PrevAndNext(session,
					dmHistoryEnterrise, syncVersion, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmHistoryEnterrise getBySyncVersion_PrevAndNext(Session session,
		DmHistoryEnterrise dmHistoryEnterrise, String syncVersion,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMHISTORYENTERRISE_WHERE);

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
			query.append(DmHistoryEnterriseModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(dmHistoryEnterrise);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmHistoryEnterrise> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm history enterrises where syncVersion = &#63; from the database.
	 *
	 * @param syncVersion the sync version
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBySyncVersion(String syncVersion)
		throws SystemException {
		for (DmHistoryEnterrise dmHistoryEnterrise : findBySyncVersion(
				syncVersion, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dmHistoryEnterrise);
		}
	}

	/**
	 * Returns the number of dm history enterrises where syncVersion = &#63;.
	 *
	 * @param syncVersion the sync version
	 * @return the number of matching dm history enterrises
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

			query.append(_SQL_COUNT_DMHISTORYENTERRISE_WHERE);

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

	private static final String _FINDER_COLUMN_SYNCVERSION_SYNCVERSION_1 = "dmHistoryEnterrise.syncVersion IS NULL";
	private static final String _FINDER_COLUMN_SYNCVERSION_SYNCVERSION_2 = "dmHistoryEnterrise.syncVersion = ?";
	private static final String _FINDER_COLUMN_SYNCVERSION_SYNCVERSION_3 = "(dmHistoryEnterrise.syncVersion IS NULL OR dmHistoryEnterrise.syncVersion = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ENTERPRISECODE =
		new FinderPath(DmHistoryEnterriseModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryEnterriseModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryEnterriseImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByEnterpriseCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ENTERPRISECODE =
		new FinderPath(DmHistoryEnterriseModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryEnterriseModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryEnterriseImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByEnterpriseCode",
			new String[] { String.class.getName() },
			DmHistoryEnterriseModelImpl.ENTERPRISECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ENTERPRISECODE = new FinderPath(DmHistoryEnterriseModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryEnterriseModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByEnterpriseCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the dm history enterrises where enterpriseCode = &#63;.
	 *
	 * @param enterpriseCode the enterprise code
	 * @return the matching dm history enterrises
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryEnterrise> findByEnterpriseCode(String enterpriseCode)
		throws SystemException {
		return findByEnterpriseCode(enterpriseCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history enterrises where enterpriseCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryEnterriseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param enterpriseCode the enterprise code
	 * @param start the lower bound of the range of dm history enterrises
	 * @param end the upper bound of the range of dm history enterrises (not inclusive)
	 * @return the range of matching dm history enterrises
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryEnterrise> findByEnterpriseCode(
		String enterpriseCode, int start, int end) throws SystemException {
		return findByEnterpriseCode(enterpriseCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history enterrises where enterpriseCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryEnterriseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param enterpriseCode the enterprise code
	 * @param start the lower bound of the range of dm history enterrises
	 * @param end the upper bound of the range of dm history enterrises (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm history enterrises
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryEnterrise> findByEnterpriseCode(
		String enterpriseCode, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ENTERPRISECODE;
			finderArgs = new Object[] { enterpriseCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ENTERPRISECODE;
			finderArgs = new Object[] {
					enterpriseCode,
					
					start, end, orderByComparator
				};
		}

		List<DmHistoryEnterrise> list = (List<DmHistoryEnterrise>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmHistoryEnterrise dmHistoryEnterrise : list) {
				if (!Validator.equals(enterpriseCode,
							dmHistoryEnterrise.getEnterpriseCode())) {
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

			query.append(_SQL_SELECT_DMHISTORYENTERRISE_WHERE);

			boolean bindEnterpriseCode = false;

			if (enterpriseCode == null) {
				query.append(_FINDER_COLUMN_ENTERPRISECODE_ENTERPRISECODE_1);
			}
			else if (enterpriseCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ENTERPRISECODE_ENTERPRISECODE_3);
			}
			else {
				bindEnterpriseCode = true;

				query.append(_FINDER_COLUMN_ENTERPRISECODE_ENTERPRISECODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DmHistoryEnterriseModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEnterpriseCode) {
					qPos.add(enterpriseCode);
				}

				if (!pagination) {
					list = (List<DmHistoryEnterrise>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmHistoryEnterrise>(list);
				}
				else {
					list = (List<DmHistoryEnterrise>)QueryUtil.list(q,
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
	 * Returns the first dm history enterrise in the ordered set where enterpriseCode = &#63;.
	 *
	 * @param enterpriseCode the enterprise code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm history enterrise
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException if a matching dm history enterrise could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryEnterrise findByEnterpriseCode_First(
		String enterpriseCode, OrderByComparator orderByComparator)
		throws NoSuchDmHistoryEnterriseException, SystemException {
		DmHistoryEnterrise dmHistoryEnterrise = fetchByEnterpriseCode_First(enterpriseCode,
				orderByComparator);

		if (dmHistoryEnterrise != null) {
			return dmHistoryEnterrise;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("enterpriseCode=");
		msg.append(enterpriseCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmHistoryEnterriseException(msg.toString());
	}

	/**
	 * Returns the first dm history enterrise in the ordered set where enterpriseCode = &#63;.
	 *
	 * @param enterpriseCode the enterprise code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm history enterrise, or <code>null</code> if a matching dm history enterrise could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryEnterrise fetchByEnterpriseCode_First(
		String enterpriseCode, OrderByComparator orderByComparator)
		throws SystemException {
		List<DmHistoryEnterrise> list = findByEnterpriseCode(enterpriseCode, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm history enterrise in the ordered set where enterpriseCode = &#63;.
	 *
	 * @param enterpriseCode the enterprise code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm history enterrise
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException if a matching dm history enterrise could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryEnterrise findByEnterpriseCode_Last(String enterpriseCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmHistoryEnterriseException, SystemException {
		DmHistoryEnterrise dmHistoryEnterrise = fetchByEnterpriseCode_Last(enterpriseCode,
				orderByComparator);

		if (dmHistoryEnterrise != null) {
			return dmHistoryEnterrise;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("enterpriseCode=");
		msg.append(enterpriseCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmHistoryEnterriseException(msg.toString());
	}

	/**
	 * Returns the last dm history enterrise in the ordered set where enterpriseCode = &#63;.
	 *
	 * @param enterpriseCode the enterprise code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm history enterrise, or <code>null</code> if a matching dm history enterrise could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryEnterrise fetchByEnterpriseCode_Last(
		String enterpriseCode, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByEnterpriseCode(enterpriseCode);

		if (count == 0) {
			return null;
		}

		List<DmHistoryEnterrise> list = findByEnterpriseCode(enterpriseCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm history enterrises before and after the current dm history enterrise in the ordered set where enterpriseCode = &#63;.
	 *
	 * @param id the primary key of the current dm history enterrise
	 * @param enterpriseCode the enterprise code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm history enterrise
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException if a dm history enterrise with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryEnterrise[] findByEnterpriseCode_PrevAndNext(int id,
		String enterpriseCode, OrderByComparator orderByComparator)
		throws NoSuchDmHistoryEnterriseException, SystemException {
		DmHistoryEnterrise dmHistoryEnterrise = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmHistoryEnterrise[] array = new DmHistoryEnterriseImpl[3];

			array[0] = getByEnterpriseCode_PrevAndNext(session,
					dmHistoryEnterrise, enterpriseCode, orderByComparator, true);

			array[1] = dmHistoryEnterrise;

			array[2] = getByEnterpriseCode_PrevAndNext(session,
					dmHistoryEnterrise, enterpriseCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmHistoryEnterrise getByEnterpriseCode_PrevAndNext(
		Session session, DmHistoryEnterrise dmHistoryEnterrise,
		String enterpriseCode, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMHISTORYENTERRISE_WHERE);

		boolean bindEnterpriseCode = false;

		if (enterpriseCode == null) {
			query.append(_FINDER_COLUMN_ENTERPRISECODE_ENTERPRISECODE_1);
		}
		else if (enterpriseCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_ENTERPRISECODE_ENTERPRISECODE_3);
		}
		else {
			bindEnterpriseCode = true;

			query.append(_FINDER_COLUMN_ENTERPRISECODE_ENTERPRISECODE_2);
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
			query.append(DmHistoryEnterriseModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindEnterpriseCode) {
			qPos.add(enterpriseCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmHistoryEnterrise);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmHistoryEnterrise> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm history enterrises where enterpriseCode = &#63; from the database.
	 *
	 * @param enterpriseCode the enterprise code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByEnterpriseCode(String enterpriseCode)
		throws SystemException {
		for (DmHistoryEnterrise dmHistoryEnterrise : findByEnterpriseCode(
				enterpriseCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dmHistoryEnterrise);
		}
	}

	/**
	 * Returns the number of dm history enterrises where enterpriseCode = &#63;.
	 *
	 * @param enterpriseCode the enterprise code
	 * @return the number of matching dm history enterrises
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByEnterpriseCode(String enterpriseCode)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ENTERPRISECODE;

		Object[] finderArgs = new Object[] { enterpriseCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMHISTORYENTERRISE_WHERE);

			boolean bindEnterpriseCode = false;

			if (enterpriseCode == null) {
				query.append(_FINDER_COLUMN_ENTERPRISECODE_ENTERPRISECODE_1);
			}
			else if (enterpriseCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ENTERPRISECODE_ENTERPRISECODE_3);
			}
			else {
				bindEnterpriseCode = true;

				query.append(_FINDER_COLUMN_ENTERPRISECODE_ENTERPRISECODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEnterpriseCode) {
					qPos.add(enterpriseCode);
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

	private static final String _FINDER_COLUMN_ENTERPRISECODE_ENTERPRISECODE_1 = "dmHistoryEnterrise.enterpriseCode IS NULL";
	private static final String _FINDER_COLUMN_ENTERPRISECODE_ENTERPRISECODE_2 = "dmHistoryEnterrise.enterpriseCode = ?";
	private static final String _FINDER_COLUMN_ENTERPRISECODE_ENTERPRISECODE_3 = "(dmHistoryEnterrise.enterpriseCode IS NULL OR dmHistoryEnterrise.enterpriseCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ENTERPRISETAXCODE =
		new FinderPath(DmHistoryEnterriseModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryEnterriseModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryEnterriseImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByEnterpriseTaxCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ENTERPRISETAXCODE =
		new FinderPath(DmHistoryEnterriseModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryEnterriseModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryEnterriseImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByEnterpriseTaxCode", new String[] { String.class.getName() },
			DmHistoryEnterriseModelImpl.ENTERPRISETAXCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ENTERPRISETAXCODE = new FinderPath(DmHistoryEnterriseModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryEnterriseModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByEnterpriseTaxCode", new String[] { String.class.getName() });

	/**
	 * Returns all the dm history enterrises where enterpriseTaxCode = &#63;.
	 *
	 * @param enterpriseTaxCode the enterprise tax code
	 * @return the matching dm history enterrises
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryEnterrise> findByEnterpriseTaxCode(
		String enterpriseTaxCode) throws SystemException {
		return findByEnterpriseTaxCode(enterpriseTaxCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history enterrises where enterpriseTaxCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryEnterriseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param enterpriseTaxCode the enterprise tax code
	 * @param start the lower bound of the range of dm history enterrises
	 * @param end the upper bound of the range of dm history enterrises (not inclusive)
	 * @return the range of matching dm history enterrises
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryEnterrise> findByEnterpriseTaxCode(
		String enterpriseTaxCode, int start, int end) throws SystemException {
		return findByEnterpriseTaxCode(enterpriseTaxCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history enterrises where enterpriseTaxCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryEnterriseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param enterpriseTaxCode the enterprise tax code
	 * @param start the lower bound of the range of dm history enterrises
	 * @param end the upper bound of the range of dm history enterrises (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm history enterrises
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryEnterrise> findByEnterpriseTaxCode(
		String enterpriseTaxCode, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ENTERPRISETAXCODE;
			finderArgs = new Object[] { enterpriseTaxCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ENTERPRISETAXCODE;
			finderArgs = new Object[] {
					enterpriseTaxCode,
					
					start, end, orderByComparator
				};
		}

		List<DmHistoryEnterrise> list = (List<DmHistoryEnterrise>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmHistoryEnterrise dmHistoryEnterrise : list) {
				if (!Validator.equals(enterpriseTaxCode,
							dmHistoryEnterrise.getEnterpriseTaxCode())) {
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

			query.append(_SQL_SELECT_DMHISTORYENTERRISE_WHERE);

			boolean bindEnterpriseTaxCode = false;

			if (enterpriseTaxCode == null) {
				query.append(_FINDER_COLUMN_ENTERPRISETAXCODE_ENTERPRISETAXCODE_1);
			}
			else if (enterpriseTaxCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ENTERPRISETAXCODE_ENTERPRISETAXCODE_3);
			}
			else {
				bindEnterpriseTaxCode = true;

				query.append(_FINDER_COLUMN_ENTERPRISETAXCODE_ENTERPRISETAXCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DmHistoryEnterriseModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEnterpriseTaxCode) {
					qPos.add(enterpriseTaxCode);
				}

				if (!pagination) {
					list = (List<DmHistoryEnterrise>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmHistoryEnterrise>(list);
				}
				else {
					list = (List<DmHistoryEnterrise>)QueryUtil.list(q,
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
	 * Returns the first dm history enterrise in the ordered set where enterpriseTaxCode = &#63;.
	 *
	 * @param enterpriseTaxCode the enterprise tax code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm history enterrise
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException if a matching dm history enterrise could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryEnterrise findByEnterpriseTaxCode_First(
		String enterpriseTaxCode, OrderByComparator orderByComparator)
		throws NoSuchDmHistoryEnterriseException, SystemException {
		DmHistoryEnterrise dmHistoryEnterrise = fetchByEnterpriseTaxCode_First(enterpriseTaxCode,
				orderByComparator);

		if (dmHistoryEnterrise != null) {
			return dmHistoryEnterrise;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("enterpriseTaxCode=");
		msg.append(enterpriseTaxCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmHistoryEnterriseException(msg.toString());
	}

	/**
	 * Returns the first dm history enterrise in the ordered set where enterpriseTaxCode = &#63;.
	 *
	 * @param enterpriseTaxCode the enterprise tax code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm history enterrise, or <code>null</code> if a matching dm history enterrise could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryEnterrise fetchByEnterpriseTaxCode_First(
		String enterpriseTaxCode, OrderByComparator orderByComparator)
		throws SystemException {
		List<DmHistoryEnterrise> list = findByEnterpriseTaxCode(enterpriseTaxCode,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm history enterrise in the ordered set where enterpriseTaxCode = &#63;.
	 *
	 * @param enterpriseTaxCode the enterprise tax code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm history enterrise
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException if a matching dm history enterrise could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryEnterrise findByEnterpriseTaxCode_Last(
		String enterpriseTaxCode, OrderByComparator orderByComparator)
		throws NoSuchDmHistoryEnterriseException, SystemException {
		DmHistoryEnterrise dmHistoryEnterrise = fetchByEnterpriseTaxCode_Last(enterpriseTaxCode,
				orderByComparator);

		if (dmHistoryEnterrise != null) {
			return dmHistoryEnterrise;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("enterpriseTaxCode=");
		msg.append(enterpriseTaxCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmHistoryEnterriseException(msg.toString());
	}

	/**
	 * Returns the last dm history enterrise in the ordered set where enterpriseTaxCode = &#63;.
	 *
	 * @param enterpriseTaxCode the enterprise tax code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm history enterrise, or <code>null</code> if a matching dm history enterrise could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryEnterrise fetchByEnterpriseTaxCode_Last(
		String enterpriseTaxCode, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByEnterpriseTaxCode(enterpriseTaxCode);

		if (count == 0) {
			return null;
		}

		List<DmHistoryEnterrise> list = findByEnterpriseTaxCode(enterpriseTaxCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm history enterrises before and after the current dm history enterrise in the ordered set where enterpriseTaxCode = &#63;.
	 *
	 * @param id the primary key of the current dm history enterrise
	 * @param enterpriseTaxCode the enterprise tax code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm history enterrise
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException if a dm history enterrise with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryEnterrise[] findByEnterpriseTaxCode_PrevAndNext(int id,
		String enterpriseTaxCode, OrderByComparator orderByComparator)
		throws NoSuchDmHistoryEnterriseException, SystemException {
		DmHistoryEnterrise dmHistoryEnterrise = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmHistoryEnterrise[] array = new DmHistoryEnterriseImpl[3];

			array[0] = getByEnterpriseTaxCode_PrevAndNext(session,
					dmHistoryEnterrise, enterpriseTaxCode, orderByComparator,
					true);

			array[1] = dmHistoryEnterrise;

			array[2] = getByEnterpriseTaxCode_PrevAndNext(session,
					dmHistoryEnterrise, enterpriseTaxCode, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmHistoryEnterrise getByEnterpriseTaxCode_PrevAndNext(
		Session session, DmHistoryEnterrise dmHistoryEnterrise,
		String enterpriseTaxCode, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMHISTORYENTERRISE_WHERE);

		boolean bindEnterpriseTaxCode = false;

		if (enterpriseTaxCode == null) {
			query.append(_FINDER_COLUMN_ENTERPRISETAXCODE_ENTERPRISETAXCODE_1);
		}
		else if (enterpriseTaxCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_ENTERPRISETAXCODE_ENTERPRISETAXCODE_3);
		}
		else {
			bindEnterpriseTaxCode = true;

			query.append(_FINDER_COLUMN_ENTERPRISETAXCODE_ENTERPRISETAXCODE_2);
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
			query.append(DmHistoryEnterriseModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindEnterpriseTaxCode) {
			qPos.add(enterpriseTaxCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmHistoryEnterrise);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmHistoryEnterrise> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm history enterrises where enterpriseTaxCode = &#63; from the database.
	 *
	 * @param enterpriseTaxCode the enterprise tax code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByEnterpriseTaxCode(String enterpriseTaxCode)
		throws SystemException {
		for (DmHistoryEnterrise dmHistoryEnterrise : findByEnterpriseTaxCode(
				enterpriseTaxCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dmHistoryEnterrise);
		}
	}

	/**
	 * Returns the number of dm history enterrises where enterpriseTaxCode = &#63;.
	 *
	 * @param enterpriseTaxCode the enterprise tax code
	 * @return the number of matching dm history enterrises
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByEnterpriseTaxCode(String enterpriseTaxCode)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ENTERPRISETAXCODE;

		Object[] finderArgs = new Object[] { enterpriseTaxCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMHISTORYENTERRISE_WHERE);

			boolean bindEnterpriseTaxCode = false;

			if (enterpriseTaxCode == null) {
				query.append(_FINDER_COLUMN_ENTERPRISETAXCODE_ENTERPRISETAXCODE_1);
			}
			else if (enterpriseTaxCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ENTERPRISETAXCODE_ENTERPRISETAXCODE_3);
			}
			else {
				bindEnterpriseTaxCode = true;

				query.append(_FINDER_COLUMN_ENTERPRISETAXCODE_ENTERPRISETAXCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEnterpriseTaxCode) {
					qPos.add(enterpriseTaxCode);
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

	private static final String _FINDER_COLUMN_ENTERPRISETAXCODE_ENTERPRISETAXCODE_1 =
		"dmHistoryEnterrise.enterpriseTaxCode IS NULL";
	private static final String _FINDER_COLUMN_ENTERPRISETAXCODE_ENTERPRISETAXCODE_2 =
		"dmHistoryEnterrise.enterpriseTaxCode = ?";
	private static final String _FINDER_COLUMN_ENTERPRISETAXCODE_ENTERPRISETAXCODE_3 =
		"(dmHistoryEnterrise.enterpriseTaxCode IS NULL OR dmHistoryEnterrise.enterpriseTaxCode = '')";

	public DmHistoryEnterrisePersistenceImpl() {
		setModelClass(DmHistoryEnterrise.class);
	}

	/**
	 * Caches the dm history enterrise in the entity cache if it is enabled.
	 *
	 * @param dmHistoryEnterrise the dm history enterrise
	 */
	@Override
	public void cacheResult(DmHistoryEnterrise dmHistoryEnterrise) {
		EntityCacheUtil.putResult(DmHistoryEnterriseModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryEnterriseImpl.class, dmHistoryEnterrise.getPrimaryKey(),
			dmHistoryEnterrise);

		dmHistoryEnterrise.resetOriginalValues();
	}

	/**
	 * Caches the dm history enterrises in the entity cache if it is enabled.
	 *
	 * @param dmHistoryEnterrises the dm history enterrises
	 */
	@Override
	public void cacheResult(List<DmHistoryEnterrise> dmHistoryEnterrises) {
		for (DmHistoryEnterrise dmHistoryEnterrise : dmHistoryEnterrises) {
			if (EntityCacheUtil.getResult(
						DmHistoryEnterriseModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryEnterriseImpl.class,
						dmHistoryEnterrise.getPrimaryKey()) == null) {
				cacheResult(dmHistoryEnterrise);
			}
			else {
				dmHistoryEnterrise.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm history enterrises.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmHistoryEnterriseImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmHistoryEnterriseImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm history enterrise.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmHistoryEnterrise dmHistoryEnterrise) {
		EntityCacheUtil.removeResult(DmHistoryEnterriseModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryEnterriseImpl.class, dmHistoryEnterrise.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DmHistoryEnterrise> dmHistoryEnterrises) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmHistoryEnterrise dmHistoryEnterrise : dmHistoryEnterrises) {
			EntityCacheUtil.removeResult(DmHistoryEnterriseModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryEnterriseImpl.class, dmHistoryEnterrise.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dm history enterrise with the primary key. Does not add the dm history enterrise to the database.
	 *
	 * @param id the primary key for the new dm history enterrise
	 * @return the new dm history enterrise
	 */
	@Override
	public DmHistoryEnterrise create(int id) {
		DmHistoryEnterrise dmHistoryEnterrise = new DmHistoryEnterriseImpl();

		dmHistoryEnterrise.setNew(true);
		dmHistoryEnterrise.setPrimaryKey(id);

		return dmHistoryEnterrise;
	}

	/**
	 * Removes the dm history enterrise with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm history enterrise
	 * @return the dm history enterrise that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException if a dm history enterrise with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryEnterrise remove(int id)
		throws NoSuchDmHistoryEnterriseException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the dm history enterrise with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm history enterrise
	 * @return the dm history enterrise that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException if a dm history enterrise with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryEnterrise remove(Serializable primaryKey)
		throws NoSuchDmHistoryEnterriseException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmHistoryEnterrise dmHistoryEnterrise = (DmHistoryEnterrise)session.get(DmHistoryEnterriseImpl.class,
					primaryKey);

			if (dmHistoryEnterrise == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmHistoryEnterriseException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmHistoryEnterrise);
		}
		catch (NoSuchDmHistoryEnterriseException nsee) {
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
	protected DmHistoryEnterrise removeImpl(
		DmHistoryEnterrise dmHistoryEnterrise) throws SystemException {
		dmHistoryEnterrise = toUnwrappedModel(dmHistoryEnterrise);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dmHistoryEnterrise)) {
				dmHistoryEnterrise = (DmHistoryEnterrise)session.get(DmHistoryEnterriseImpl.class,
						dmHistoryEnterrise.getPrimaryKeyObj());
			}

			if (dmHistoryEnterrise != null) {
				session.delete(dmHistoryEnterrise);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dmHistoryEnterrise != null) {
			clearCache(dmHistoryEnterrise);
		}

		return dmHistoryEnterrise;
	}

	@Override
	public DmHistoryEnterrise updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise dmHistoryEnterrise)
		throws SystemException {
		dmHistoryEnterrise = toUnwrappedModel(dmHistoryEnterrise);

		boolean isNew = dmHistoryEnterrise.isNew();

		DmHistoryEnterriseModelImpl dmHistoryEnterriseModelImpl = (DmHistoryEnterriseModelImpl)dmHistoryEnterrise;

		Session session = null;

		try {
			session = openSession();

			if (dmHistoryEnterrise.isNew()) {
				session.save(dmHistoryEnterrise);

				dmHistoryEnterrise.setNew(false);
			}
			else {
				session.merge(dmHistoryEnterrise);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmHistoryEnterriseModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmHistoryEnterriseModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SYNCVERSION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryEnterriseModelImpl.getOriginalSyncVersion()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SYNCVERSION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SYNCVERSION,
					args);

				args = new Object[] { dmHistoryEnterriseModelImpl.getSyncVersion() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SYNCVERSION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SYNCVERSION,
					args);
			}

			if ((dmHistoryEnterriseModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ENTERPRISECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryEnterriseModelImpl.getOriginalEnterpriseCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ENTERPRISECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ENTERPRISECODE,
					args);

				args = new Object[] {
						dmHistoryEnterriseModelImpl.getEnterpriseCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ENTERPRISECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ENTERPRISECODE,
					args);
			}

			if ((dmHistoryEnterriseModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ENTERPRISETAXCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryEnterriseModelImpl.getOriginalEnterpriseTaxCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ENTERPRISETAXCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ENTERPRISETAXCODE,
					args);

				args = new Object[] {
						dmHistoryEnterriseModelImpl.getEnterpriseTaxCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ENTERPRISETAXCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ENTERPRISETAXCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmHistoryEnterriseModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryEnterriseImpl.class, dmHistoryEnterrise.getPrimaryKey(),
			dmHistoryEnterrise);

		return dmHistoryEnterrise;
	}

	protected DmHistoryEnterrise toUnwrappedModel(
		DmHistoryEnterrise dmHistoryEnterrise) {
		if (dmHistoryEnterrise instanceof DmHistoryEnterriseImpl) {
			return dmHistoryEnterrise;
		}

		DmHistoryEnterriseImpl dmHistoryEnterriseImpl = new DmHistoryEnterriseImpl();

		dmHistoryEnterriseImpl.setNew(dmHistoryEnterrise.isNew());
		dmHistoryEnterriseImpl.setPrimaryKey(dmHistoryEnterrise.getPrimaryKey());

		dmHistoryEnterriseImpl.setId(dmHistoryEnterrise.getId());
		dmHistoryEnterriseImpl.setEnterpriseCode(dmHistoryEnterrise.getEnterpriseCode());
		dmHistoryEnterriseImpl.setEnterpriseTaxCode(dmHistoryEnterrise.getEnterpriseTaxCode());
		dmHistoryEnterriseImpl.setEnterpriseName(dmHistoryEnterrise.getEnterpriseName());
		dmHistoryEnterriseImpl.setEnterpriseShortName(dmHistoryEnterrise.getEnterpriseShortName());
		dmHistoryEnterriseImpl.setEnterpriseForeignName(dmHistoryEnterrise.getEnterpriseForeignName());
		dmHistoryEnterriseImpl.setEnterprisePerson(dmHistoryEnterrise.getEnterprisePerson());
		dmHistoryEnterriseImpl.setEnterpriseHOAddress(dmHistoryEnterrise.getEnterpriseHOAddress());
		dmHistoryEnterriseImpl.setStateCode(dmHistoryEnterrise.getStateCode());
		dmHistoryEnterriseImpl.setCityCode(dmHistoryEnterrise.getCityCode());
		dmHistoryEnterriseImpl.setDistrictCode(dmHistoryEnterrise.getDistrictCode());
		dmHistoryEnterriseImpl.setWardCode(dmHistoryEnterrise.getWardCode());
		dmHistoryEnterriseImpl.setTelephoneNo(dmHistoryEnterrise.getTelephoneNo());
		dmHistoryEnterriseImpl.setRegistrationCode(dmHistoryEnterrise.getRegistrationCode());
		dmHistoryEnterriseImpl.setRegistrationAddress(dmHistoryEnterrise.getRegistrationAddress());
		dmHistoryEnterriseImpl.setRegistrationDate(dmHistoryEnterrise.getRegistrationDate());
		dmHistoryEnterriseImpl.setIsDelete(dmHistoryEnterrise.getIsDelete());
		dmHistoryEnterriseImpl.setMarkedAsDelete(dmHistoryEnterrise.getMarkedAsDelete());
		dmHistoryEnterriseImpl.setModifiedDate(dmHistoryEnterrise.getModifiedDate());
		dmHistoryEnterriseImpl.setRequestedDate(dmHistoryEnterrise.getRequestedDate());
		dmHistoryEnterriseImpl.setSyncVersion(dmHistoryEnterrise.getSyncVersion());
		dmHistoryEnterriseImpl.setModifiedUser(dmHistoryEnterrise.getModifiedUser());

		return dmHistoryEnterriseImpl;
	}

	/**
	 * Returns the dm history enterrise with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history enterrise
	 * @return the dm history enterrise
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException if a dm history enterrise with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryEnterrise findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDmHistoryEnterriseException, SystemException {
		DmHistoryEnterrise dmHistoryEnterrise = fetchByPrimaryKey(primaryKey);

		if (dmHistoryEnterrise == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDmHistoryEnterriseException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dmHistoryEnterrise;
	}

	/**
	 * Returns the dm history enterrise with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException} if it could not be found.
	 *
	 * @param id the primary key of the dm history enterrise
	 * @return the dm history enterrise
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException if a dm history enterrise with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryEnterrise findByPrimaryKey(int id)
		throws NoSuchDmHistoryEnterriseException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dm history enterrise with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history enterrise
	 * @return the dm history enterrise, or <code>null</code> if a dm history enterrise with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryEnterrise fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DmHistoryEnterrise dmHistoryEnterrise = (DmHistoryEnterrise)EntityCacheUtil.getResult(DmHistoryEnterriseModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryEnterriseImpl.class, primaryKey);

		if (dmHistoryEnterrise == _nullDmHistoryEnterrise) {
			return null;
		}

		if (dmHistoryEnterrise == null) {
			Session session = null;

			try {
				session = openSession();

				dmHistoryEnterrise = (DmHistoryEnterrise)session.get(DmHistoryEnterriseImpl.class,
						primaryKey);

				if (dmHistoryEnterrise != null) {
					cacheResult(dmHistoryEnterrise);
				}
				else {
					EntityCacheUtil.putResult(DmHistoryEnterriseModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryEnterriseImpl.class, primaryKey,
						_nullDmHistoryEnterrise);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DmHistoryEnterriseModelImpl.ENTITY_CACHE_ENABLED,
					DmHistoryEnterriseImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dmHistoryEnterrise;
	}

	/**
	 * Returns the dm history enterrise with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm history enterrise
	 * @return the dm history enterrise, or <code>null</code> if a dm history enterrise with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryEnterrise fetchByPrimaryKey(int id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the dm history enterrises.
	 *
	 * @return the dm history enterrises
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryEnterrise> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history enterrises.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryEnterriseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history enterrises
	 * @param end the upper bound of the range of dm history enterrises (not inclusive)
	 * @return the range of dm history enterrises
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryEnterrise> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history enterrises.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryEnterriseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history enterrises
	 * @param end the upper bound of the range of dm history enterrises (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm history enterrises
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryEnterrise> findAll(int start, int end,
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

		List<DmHistoryEnterrise> list = (List<DmHistoryEnterrise>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMHISTORYENTERRISE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMHISTORYENTERRISE;

				if (pagination) {
					sql = sql.concat(DmHistoryEnterriseModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DmHistoryEnterrise>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmHistoryEnterrise>(list);
				}
				else {
					list = (List<DmHistoryEnterrise>)QueryUtil.list(q,
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
	 * Removes all the dm history enterrises from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DmHistoryEnterrise dmHistoryEnterrise : findAll()) {
			remove(dmHistoryEnterrise);
		}
	}

	/**
	 * Returns the number of dm history enterrises.
	 *
	 * @return the number of dm history enterrises
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

				Query q = session.createQuery(_SQL_COUNT_DMHISTORYENTERRISE);

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
	 * Initializes the dm history enterrise persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmHistoryEnterrise>> listenersList = new ArrayList<ModelListener<DmHistoryEnterrise>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmHistoryEnterrise>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmHistoryEnterriseImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DMHISTORYENTERRISE = "SELECT dmHistoryEnterrise FROM DmHistoryEnterrise dmHistoryEnterrise";
	private static final String _SQL_SELECT_DMHISTORYENTERRISE_WHERE = "SELECT dmHistoryEnterrise FROM DmHistoryEnterrise dmHistoryEnterrise WHERE ";
	private static final String _SQL_COUNT_DMHISTORYENTERRISE = "SELECT COUNT(dmHistoryEnterrise) FROM DmHistoryEnterrise dmHistoryEnterrise";
	private static final String _SQL_COUNT_DMHISTORYENTERRISE_WHERE = "SELECT COUNT(dmHistoryEnterrise) FROM DmHistoryEnterrise dmHistoryEnterrise WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmHistoryEnterrise.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmHistoryEnterrise exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmHistoryEnterrise exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmHistoryEnterrisePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"enterpriseCode", "enterpriseTaxCode", "enterpriseName",
				"enterpriseShortName", "enterpriseForeignName",
				"enterprisePerson", "enterpriseHOAddress", "stateCode",
				"cityCode", "districtCode", "wardCode", "telephoneNo",
				"registrationCode", "registrationAddress", "registrationDate",
				"isDelete", "markedAsDelete", "modifiedDate", "requestedDate",
				"syncVersion", "modifiedUser"
			});
	private static DmHistoryEnterrise _nullDmHistoryEnterrise = new DmHistoryEnterriseImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmHistoryEnterrise> toCacheModel() {
				return _nullDmHistoryEnterriseCacheModel;
			}
		};

	private static CacheModel<DmHistoryEnterrise> _nullDmHistoryEnterriseCacheModel =
		new CacheModel<DmHistoryEnterrise>() {
			@Override
			public DmHistoryEnterrise toEntityModel() {
				return _nullDmHistoryEnterrise;
			}
		};
}