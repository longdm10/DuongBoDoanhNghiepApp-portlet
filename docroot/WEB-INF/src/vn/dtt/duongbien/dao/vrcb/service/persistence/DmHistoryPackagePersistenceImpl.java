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

import vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPackageException;
import vn.dtt.duongbien.dao.vrcb.model.DmHistoryPackage;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPackageImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPackageModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dm history package service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmHistoryPackagePersistence
 * @see DmHistoryPackageUtil
 * @generated
 */
public class DmHistoryPackagePersistenceImpl extends BasePersistenceImpl<DmHistoryPackage>
	implements DmHistoryPackagePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmHistoryPackageUtil} to access the dm history package persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmHistoryPackageImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmHistoryPackageModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPackageModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryPackageImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmHistoryPackageModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPackageModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryPackageImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmHistoryPackageModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPackageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PACKAGECODE =
		new FinderPath(DmHistoryPackageModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPackageModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryPackageImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByPackageCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PACKAGECODE =
		new FinderPath(DmHistoryPackageModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPackageModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryPackageImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPackageCode",
			new String[] { String.class.getName() },
			DmHistoryPackageModelImpl.PACKAGECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PACKAGECODE = new FinderPath(DmHistoryPackageModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPackageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPackageCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the dm history packages where packageCode = &#63;.
	 *
	 * @param packageCode the package code
	 * @return the matching dm history packages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryPackage> findByPackageCode(String packageCode)
		throws SystemException {
		return findByPackageCode(packageCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history packages where packageCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param packageCode the package code
	 * @param start the lower bound of the range of dm history packages
	 * @param end the upper bound of the range of dm history packages (not inclusive)
	 * @return the range of matching dm history packages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryPackage> findByPackageCode(String packageCode,
		int start, int end) throws SystemException {
		return findByPackageCode(packageCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history packages where packageCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param packageCode the package code
	 * @param start the lower bound of the range of dm history packages
	 * @param end the upper bound of the range of dm history packages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm history packages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryPackage> findByPackageCode(String packageCode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PACKAGECODE;
			finderArgs = new Object[] { packageCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PACKAGECODE;
			finderArgs = new Object[] { packageCode, start, end, orderByComparator };
		}

		List<DmHistoryPackage> list = (List<DmHistoryPackage>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmHistoryPackage dmHistoryPackage : list) {
				if (!Validator.equals(packageCode,
							dmHistoryPackage.getPackageCode())) {
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

			query.append(_SQL_SELECT_DMHISTORYPACKAGE_WHERE);

			boolean bindPackageCode = false;

			if (packageCode == null) {
				query.append(_FINDER_COLUMN_PACKAGECODE_PACKAGECODE_1);
			}
			else if (packageCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PACKAGECODE_PACKAGECODE_3);
			}
			else {
				bindPackageCode = true;

				query.append(_FINDER_COLUMN_PACKAGECODE_PACKAGECODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DmHistoryPackageModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPackageCode) {
					qPos.add(packageCode);
				}

				if (!pagination) {
					list = (List<DmHistoryPackage>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmHistoryPackage>(list);
				}
				else {
					list = (List<DmHistoryPackage>)QueryUtil.list(q,
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
	 * Returns the first dm history package in the ordered set where packageCode = &#63;.
	 *
	 * @param packageCode the package code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm history package
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPackageException if a matching dm history package could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPackage findByPackageCode_First(String packageCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmHistoryPackageException, SystemException {
		DmHistoryPackage dmHistoryPackage = fetchByPackageCode_First(packageCode,
				orderByComparator);

		if (dmHistoryPackage != null) {
			return dmHistoryPackage;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("packageCode=");
		msg.append(packageCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmHistoryPackageException(msg.toString());
	}

	/**
	 * Returns the first dm history package in the ordered set where packageCode = &#63;.
	 *
	 * @param packageCode the package code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm history package, or <code>null</code> if a matching dm history package could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPackage fetchByPackageCode_First(String packageCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<DmHistoryPackage> list = findByPackageCode(packageCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm history package in the ordered set where packageCode = &#63;.
	 *
	 * @param packageCode the package code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm history package
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPackageException if a matching dm history package could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPackage findByPackageCode_Last(String packageCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmHistoryPackageException, SystemException {
		DmHistoryPackage dmHistoryPackage = fetchByPackageCode_Last(packageCode,
				orderByComparator);

		if (dmHistoryPackage != null) {
			return dmHistoryPackage;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("packageCode=");
		msg.append(packageCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmHistoryPackageException(msg.toString());
	}

	/**
	 * Returns the last dm history package in the ordered set where packageCode = &#63;.
	 *
	 * @param packageCode the package code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm history package, or <code>null</code> if a matching dm history package could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPackage fetchByPackageCode_Last(String packageCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByPackageCode(packageCode);

		if (count == 0) {
			return null;
		}

		List<DmHistoryPackage> list = findByPackageCode(packageCode, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm history packages before and after the current dm history package in the ordered set where packageCode = &#63;.
	 *
	 * @param id the primary key of the current dm history package
	 * @param packageCode the package code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm history package
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPackageException if a dm history package with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPackage[] findByPackageCode_PrevAndNext(int id,
		String packageCode, OrderByComparator orderByComparator)
		throws NoSuchDmHistoryPackageException, SystemException {
		DmHistoryPackage dmHistoryPackage = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmHistoryPackage[] array = new DmHistoryPackageImpl[3];

			array[0] = getByPackageCode_PrevAndNext(session, dmHistoryPackage,
					packageCode, orderByComparator, true);

			array[1] = dmHistoryPackage;

			array[2] = getByPackageCode_PrevAndNext(session, dmHistoryPackage,
					packageCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmHistoryPackage getByPackageCode_PrevAndNext(Session session,
		DmHistoryPackage dmHistoryPackage, String packageCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMHISTORYPACKAGE_WHERE);

		boolean bindPackageCode = false;

		if (packageCode == null) {
			query.append(_FINDER_COLUMN_PACKAGECODE_PACKAGECODE_1);
		}
		else if (packageCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PACKAGECODE_PACKAGECODE_3);
		}
		else {
			bindPackageCode = true;

			query.append(_FINDER_COLUMN_PACKAGECODE_PACKAGECODE_2);
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
			query.append(DmHistoryPackageModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindPackageCode) {
			qPos.add(packageCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmHistoryPackage);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmHistoryPackage> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm history packages where packageCode = &#63; from the database.
	 *
	 * @param packageCode the package code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPackageCode(String packageCode)
		throws SystemException {
		for (DmHistoryPackage dmHistoryPackage : findByPackageCode(
				packageCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dmHistoryPackage);
		}
	}

	/**
	 * Returns the number of dm history packages where packageCode = &#63;.
	 *
	 * @param packageCode the package code
	 * @return the number of matching dm history packages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPackageCode(String packageCode) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PACKAGECODE;

		Object[] finderArgs = new Object[] { packageCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMHISTORYPACKAGE_WHERE);

			boolean bindPackageCode = false;

			if (packageCode == null) {
				query.append(_FINDER_COLUMN_PACKAGECODE_PACKAGECODE_1);
			}
			else if (packageCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PACKAGECODE_PACKAGECODE_3);
			}
			else {
				bindPackageCode = true;

				query.append(_FINDER_COLUMN_PACKAGECODE_PACKAGECODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPackageCode) {
					qPos.add(packageCode);
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

	private static final String _FINDER_COLUMN_PACKAGECODE_PACKAGECODE_1 = "dmHistoryPackage.packageCode IS NULL";
	private static final String _FINDER_COLUMN_PACKAGECODE_PACKAGECODE_2 = "dmHistoryPackage.packageCode = ?";
	private static final String _FINDER_COLUMN_PACKAGECODE_PACKAGECODE_3 = "(dmHistoryPackage.packageCode IS NULL OR dmHistoryPackage.packageCode = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_PACKAGECODEANDSYNCVERSION =
		new FinderPath(DmHistoryPackageModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPackageModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryPackageImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByPackageCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() },
			DmHistoryPackageModelImpl.PACKAGECODE_COLUMN_BITMASK |
			DmHistoryPackageModelImpl.SYNCVERSION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PACKAGECODEANDSYNCVERSION =
		new FinderPath(DmHistoryPackageModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPackageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByPackageCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns the dm history package where packageCode = &#63; and syncVersion = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPackageException} if it could not be found.
	 *
	 * @param packageCode the package code
	 * @param syncVersion the sync version
	 * @return the matching dm history package
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPackageException if a matching dm history package could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPackage findByPackageCodeAndSyncVersion(
		String packageCode, String syncVersion)
		throws NoSuchDmHistoryPackageException, SystemException {
		DmHistoryPackage dmHistoryPackage = fetchByPackageCodeAndSyncVersion(packageCode,
				syncVersion);

		if (dmHistoryPackage == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("packageCode=");
			msg.append(packageCode);

			msg.append(", syncVersion=");
			msg.append(syncVersion);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmHistoryPackageException(msg.toString());
		}

		return dmHistoryPackage;
	}

	/**
	 * Returns the dm history package where packageCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param packageCode the package code
	 * @param syncVersion the sync version
	 * @return the matching dm history package, or <code>null</code> if a matching dm history package could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPackage fetchByPackageCodeAndSyncVersion(
		String packageCode, String syncVersion) throws SystemException {
		return fetchByPackageCodeAndSyncVersion(packageCode, syncVersion, true);
	}

	/**
	 * Returns the dm history package where packageCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param packageCode the package code
	 * @param syncVersion the sync version
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm history package, or <code>null</code> if a matching dm history package could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPackage fetchByPackageCodeAndSyncVersion(
		String packageCode, String syncVersion, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { packageCode, syncVersion };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_PACKAGECODEANDSYNCVERSION,
					finderArgs, this);
		}

		if (result instanceof DmHistoryPackage) {
			DmHistoryPackage dmHistoryPackage = (DmHistoryPackage)result;

			if (!Validator.equals(packageCode, dmHistoryPackage.getPackageCode()) ||
					!Validator.equals(syncVersion,
						dmHistoryPackage.getSyncVersion())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DMHISTORYPACKAGE_WHERE);

			boolean bindPackageCode = false;

			if (packageCode == null) {
				query.append(_FINDER_COLUMN_PACKAGECODEANDSYNCVERSION_PACKAGECODE_1);
			}
			else if (packageCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PACKAGECODEANDSYNCVERSION_PACKAGECODE_3);
			}
			else {
				bindPackageCode = true;

				query.append(_FINDER_COLUMN_PACKAGECODEANDSYNCVERSION_PACKAGECODE_2);
			}

			boolean bindSyncVersion = false;

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_PACKAGECODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else if (syncVersion.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PACKAGECODEANDSYNCVERSION_SYNCVERSION_3);
			}
			else {
				bindSyncVersion = true;

				query.append(_FINDER_COLUMN_PACKAGECODEANDSYNCVERSION_SYNCVERSION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPackageCode) {
					qPos.add(packageCode);
				}

				if (bindSyncVersion) {
					qPos.add(syncVersion);
				}

				List<DmHistoryPackage> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PACKAGECODEANDSYNCVERSION,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DmHistoryPackagePersistenceImpl.fetchByPackageCodeAndSyncVersion(String, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DmHistoryPackage dmHistoryPackage = list.get(0);

					result = dmHistoryPackage;

					cacheResult(dmHistoryPackage);

					if ((dmHistoryPackage.getPackageCode() == null) ||
							!dmHistoryPackage.getPackageCode()
												 .equals(packageCode) ||
							(dmHistoryPackage.getSyncVersion() == null) ||
							!dmHistoryPackage.getSyncVersion()
												 .equals(syncVersion)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PACKAGECODEANDSYNCVERSION,
							finderArgs, dmHistoryPackage);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PACKAGECODEANDSYNCVERSION,
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
			return (DmHistoryPackage)result;
		}
	}

	/**
	 * Removes the dm history package where packageCode = &#63; and syncVersion = &#63; from the database.
	 *
	 * @param packageCode the package code
	 * @param syncVersion the sync version
	 * @return the dm history package that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPackage removeByPackageCodeAndSyncVersion(
		String packageCode, String syncVersion)
		throws NoSuchDmHistoryPackageException, SystemException {
		DmHistoryPackage dmHistoryPackage = findByPackageCodeAndSyncVersion(packageCode,
				syncVersion);

		return remove(dmHistoryPackage);
	}

	/**
	 * Returns the number of dm history packages where packageCode = &#63; and syncVersion = &#63;.
	 *
	 * @param packageCode the package code
	 * @param syncVersion the sync version
	 * @return the number of matching dm history packages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPackageCodeAndSyncVersion(String packageCode,
		String syncVersion) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PACKAGECODEANDSYNCVERSION;

		Object[] finderArgs = new Object[] { packageCode, syncVersion };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMHISTORYPACKAGE_WHERE);

			boolean bindPackageCode = false;

			if (packageCode == null) {
				query.append(_FINDER_COLUMN_PACKAGECODEANDSYNCVERSION_PACKAGECODE_1);
			}
			else if (packageCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PACKAGECODEANDSYNCVERSION_PACKAGECODE_3);
			}
			else {
				bindPackageCode = true;

				query.append(_FINDER_COLUMN_PACKAGECODEANDSYNCVERSION_PACKAGECODE_2);
			}

			boolean bindSyncVersion = false;

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_PACKAGECODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else if (syncVersion.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PACKAGECODEANDSYNCVERSION_SYNCVERSION_3);
			}
			else {
				bindSyncVersion = true;

				query.append(_FINDER_COLUMN_PACKAGECODEANDSYNCVERSION_SYNCVERSION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPackageCode) {
					qPos.add(packageCode);
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

	private static final String _FINDER_COLUMN_PACKAGECODEANDSYNCVERSION_PACKAGECODE_1 =
		"dmHistoryPackage.packageCode IS NULL AND ";
	private static final String _FINDER_COLUMN_PACKAGECODEANDSYNCVERSION_PACKAGECODE_2 =
		"dmHistoryPackage.packageCode = ? AND ";
	private static final String _FINDER_COLUMN_PACKAGECODEANDSYNCVERSION_PACKAGECODE_3 =
		"(dmHistoryPackage.packageCode IS NULL OR dmHistoryPackage.packageCode = '') AND ";
	private static final String _FINDER_COLUMN_PACKAGECODEANDSYNCVERSION_SYNCVERSION_1 =
		"dmHistoryPackage.syncVersion IS NULL";
	private static final String _FINDER_COLUMN_PACKAGECODEANDSYNCVERSION_SYNCVERSION_2 =
		"dmHistoryPackage.syncVersion = ?";
	private static final String _FINDER_COLUMN_PACKAGECODEANDSYNCVERSION_SYNCVERSION_3 =
		"(dmHistoryPackage.syncVersion IS NULL OR dmHistoryPackage.syncVersion = '')";

	public DmHistoryPackagePersistenceImpl() {
		setModelClass(DmHistoryPackage.class);
	}

	/**
	 * Caches the dm history package in the entity cache if it is enabled.
	 *
	 * @param dmHistoryPackage the dm history package
	 */
	@Override
	public void cacheResult(DmHistoryPackage dmHistoryPackage) {
		EntityCacheUtil.putResult(DmHistoryPackageModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPackageImpl.class, dmHistoryPackage.getPrimaryKey(),
			dmHistoryPackage);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PACKAGECODEANDSYNCVERSION,
			new Object[] {
				dmHistoryPackage.getPackageCode(),
				dmHistoryPackage.getSyncVersion()
			}, dmHistoryPackage);

		dmHistoryPackage.resetOriginalValues();
	}

	/**
	 * Caches the dm history packages in the entity cache if it is enabled.
	 *
	 * @param dmHistoryPackages the dm history packages
	 */
	@Override
	public void cacheResult(List<DmHistoryPackage> dmHistoryPackages) {
		for (DmHistoryPackage dmHistoryPackage : dmHistoryPackages) {
			if (EntityCacheUtil.getResult(
						DmHistoryPackageModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryPackageImpl.class,
						dmHistoryPackage.getPrimaryKey()) == null) {
				cacheResult(dmHistoryPackage);
			}
			else {
				dmHistoryPackage.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm history packages.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmHistoryPackageImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmHistoryPackageImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm history package.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmHistoryPackage dmHistoryPackage) {
		EntityCacheUtil.removeResult(DmHistoryPackageModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPackageImpl.class, dmHistoryPackage.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(dmHistoryPackage);
	}

	@Override
	public void clearCache(List<DmHistoryPackage> dmHistoryPackages) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmHistoryPackage dmHistoryPackage : dmHistoryPackages) {
			EntityCacheUtil.removeResult(DmHistoryPackageModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryPackageImpl.class, dmHistoryPackage.getPrimaryKey());

			clearUniqueFindersCache(dmHistoryPackage);
		}
	}

	protected void cacheUniqueFindersCache(DmHistoryPackage dmHistoryPackage) {
		if (dmHistoryPackage.isNew()) {
			Object[] args = new Object[] {
					dmHistoryPackage.getPackageCode(),
					dmHistoryPackage.getSyncVersion()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PACKAGECODEANDSYNCVERSION,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PACKAGECODEANDSYNCVERSION,
				args, dmHistoryPackage);
		}
		else {
			DmHistoryPackageModelImpl dmHistoryPackageModelImpl = (DmHistoryPackageModelImpl)dmHistoryPackage;

			if ((dmHistoryPackageModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_PACKAGECODEANDSYNCVERSION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryPackage.getPackageCode(),
						dmHistoryPackage.getSyncVersion()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PACKAGECODEANDSYNCVERSION,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PACKAGECODEANDSYNCVERSION,
					args, dmHistoryPackage);
			}
		}
	}

	protected void clearUniqueFindersCache(DmHistoryPackage dmHistoryPackage) {
		DmHistoryPackageModelImpl dmHistoryPackageModelImpl = (DmHistoryPackageModelImpl)dmHistoryPackage;

		Object[] args = new Object[] {
				dmHistoryPackage.getPackageCode(),
				dmHistoryPackage.getSyncVersion()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PACKAGECODEANDSYNCVERSION,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PACKAGECODEANDSYNCVERSION,
			args);

		if ((dmHistoryPackageModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_PACKAGECODEANDSYNCVERSION.getColumnBitmask()) != 0) {
			args = new Object[] {
					dmHistoryPackageModelImpl.getOriginalPackageCode(),
					dmHistoryPackageModelImpl.getOriginalSyncVersion()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PACKAGECODEANDSYNCVERSION,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PACKAGECODEANDSYNCVERSION,
				args);
		}
	}

	/**
	 * Creates a new dm history package with the primary key. Does not add the dm history package to the database.
	 *
	 * @param id the primary key for the new dm history package
	 * @return the new dm history package
	 */
	@Override
	public DmHistoryPackage create(int id) {
		DmHistoryPackage dmHistoryPackage = new DmHistoryPackageImpl();

		dmHistoryPackage.setNew(true);
		dmHistoryPackage.setPrimaryKey(id);

		return dmHistoryPackage;
	}

	/**
	 * Removes the dm history package with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm history package
	 * @return the dm history package that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPackageException if a dm history package with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPackage remove(int id)
		throws NoSuchDmHistoryPackageException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the dm history package with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm history package
	 * @return the dm history package that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPackageException if a dm history package with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPackage remove(Serializable primaryKey)
		throws NoSuchDmHistoryPackageException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmHistoryPackage dmHistoryPackage = (DmHistoryPackage)session.get(DmHistoryPackageImpl.class,
					primaryKey);

			if (dmHistoryPackage == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmHistoryPackageException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmHistoryPackage);
		}
		catch (NoSuchDmHistoryPackageException nsee) {
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
	protected DmHistoryPackage removeImpl(DmHistoryPackage dmHistoryPackage)
		throws SystemException {
		dmHistoryPackage = toUnwrappedModel(dmHistoryPackage);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dmHistoryPackage)) {
				dmHistoryPackage = (DmHistoryPackage)session.get(DmHistoryPackageImpl.class,
						dmHistoryPackage.getPrimaryKeyObj());
			}

			if (dmHistoryPackage != null) {
				session.delete(dmHistoryPackage);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dmHistoryPackage != null) {
			clearCache(dmHistoryPackage);
		}

		return dmHistoryPackage;
	}

	@Override
	public DmHistoryPackage updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryPackage dmHistoryPackage)
		throws SystemException {
		dmHistoryPackage = toUnwrappedModel(dmHistoryPackage);

		boolean isNew = dmHistoryPackage.isNew();

		DmHistoryPackageModelImpl dmHistoryPackageModelImpl = (DmHistoryPackageModelImpl)dmHistoryPackage;

		Session session = null;

		try {
			session = openSession();

			if (dmHistoryPackage.isNew()) {
				session.save(dmHistoryPackage);

				dmHistoryPackage.setNew(false);
			}
			else {
				session.merge(dmHistoryPackage);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmHistoryPackageModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmHistoryPackageModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PACKAGECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryPackageModelImpl.getOriginalPackageCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PACKAGECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PACKAGECODE,
					args);

				args = new Object[] { dmHistoryPackageModelImpl.getPackageCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PACKAGECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PACKAGECODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmHistoryPackageModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPackageImpl.class, dmHistoryPackage.getPrimaryKey(),
			dmHistoryPackage);

		clearUniqueFindersCache(dmHistoryPackage);
		cacheUniqueFindersCache(dmHistoryPackage);

		return dmHistoryPackage;
	}

	protected DmHistoryPackage toUnwrappedModel(
		DmHistoryPackage dmHistoryPackage) {
		if (dmHistoryPackage instanceof DmHistoryPackageImpl) {
			return dmHistoryPackage;
		}

		DmHistoryPackageImpl dmHistoryPackageImpl = new DmHistoryPackageImpl();

		dmHistoryPackageImpl.setNew(dmHistoryPackage.isNew());
		dmHistoryPackageImpl.setPrimaryKey(dmHistoryPackage.getPrimaryKey());

		dmHistoryPackageImpl.setId(dmHistoryPackage.getId());
		dmHistoryPackageImpl.setPackageCode(dmHistoryPackage.getPackageCode());
		dmHistoryPackageImpl.setPackageName(dmHistoryPackage.getPackageName());
		dmHistoryPackageImpl.setPackageNameVN(dmHistoryPackage.getPackageNameVN());
		dmHistoryPackageImpl.setPackageOrder(dmHistoryPackage.getPackageOrder());
		dmHistoryPackageImpl.setIsDelete(dmHistoryPackage.getIsDelete());
		dmHistoryPackageImpl.setMarkedAsDelete(dmHistoryPackage.getMarkedAsDelete());
		dmHistoryPackageImpl.setModifiedDate(dmHistoryPackage.getModifiedDate());
		dmHistoryPackageImpl.setRequestedDate(dmHistoryPackage.getRequestedDate());
		dmHistoryPackageImpl.setSyncVersion(dmHistoryPackage.getSyncVersion());

		return dmHistoryPackageImpl;
	}

	/**
	 * Returns the dm history package with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history package
	 * @return the dm history package
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPackageException if a dm history package with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPackage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDmHistoryPackageException, SystemException {
		DmHistoryPackage dmHistoryPackage = fetchByPrimaryKey(primaryKey);

		if (dmHistoryPackage == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDmHistoryPackageException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dmHistoryPackage;
	}

	/**
	 * Returns the dm history package with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPackageException} if it could not be found.
	 *
	 * @param id the primary key of the dm history package
	 * @return the dm history package
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPackageException if a dm history package with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPackage findByPrimaryKey(int id)
		throws NoSuchDmHistoryPackageException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dm history package with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history package
	 * @return the dm history package, or <code>null</code> if a dm history package with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPackage fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DmHistoryPackage dmHistoryPackage = (DmHistoryPackage)EntityCacheUtil.getResult(DmHistoryPackageModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryPackageImpl.class, primaryKey);

		if (dmHistoryPackage == _nullDmHistoryPackage) {
			return null;
		}

		if (dmHistoryPackage == null) {
			Session session = null;

			try {
				session = openSession();

				dmHistoryPackage = (DmHistoryPackage)session.get(DmHistoryPackageImpl.class,
						primaryKey);

				if (dmHistoryPackage != null) {
					cacheResult(dmHistoryPackage);
				}
				else {
					EntityCacheUtil.putResult(DmHistoryPackageModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryPackageImpl.class, primaryKey,
						_nullDmHistoryPackage);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DmHistoryPackageModelImpl.ENTITY_CACHE_ENABLED,
					DmHistoryPackageImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dmHistoryPackage;
	}

	/**
	 * Returns the dm history package with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm history package
	 * @return the dm history package, or <code>null</code> if a dm history package with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPackage fetchByPrimaryKey(int id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the dm history packages.
	 *
	 * @return the dm history packages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryPackage> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history packages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history packages
	 * @param end the upper bound of the range of dm history packages (not inclusive)
	 * @return the range of dm history packages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryPackage> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history packages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history packages
	 * @param end the upper bound of the range of dm history packages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm history packages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryPackage> findAll(int start, int end,
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

		List<DmHistoryPackage> list = (List<DmHistoryPackage>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMHISTORYPACKAGE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMHISTORYPACKAGE;

				if (pagination) {
					sql = sql.concat(DmHistoryPackageModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DmHistoryPackage>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmHistoryPackage>(list);
				}
				else {
					list = (List<DmHistoryPackage>)QueryUtil.list(q,
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
	 * Removes all the dm history packages from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DmHistoryPackage dmHistoryPackage : findAll()) {
			remove(dmHistoryPackage);
		}
	}

	/**
	 * Returns the number of dm history packages.
	 *
	 * @return the number of dm history packages
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

				Query q = session.createQuery(_SQL_COUNT_DMHISTORYPACKAGE);

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
	 * Initializes the dm history package persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.DmHistoryPackage")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmHistoryPackage>> listenersList = new ArrayList<ModelListener<DmHistoryPackage>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmHistoryPackage>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmHistoryPackageImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DMHISTORYPACKAGE = "SELECT dmHistoryPackage FROM DmHistoryPackage dmHistoryPackage";
	private static final String _SQL_SELECT_DMHISTORYPACKAGE_WHERE = "SELECT dmHistoryPackage FROM DmHistoryPackage dmHistoryPackage WHERE ";
	private static final String _SQL_COUNT_DMHISTORYPACKAGE = "SELECT COUNT(dmHistoryPackage) FROM DmHistoryPackage dmHistoryPackage";
	private static final String _SQL_COUNT_DMHISTORYPACKAGE_WHERE = "SELECT COUNT(dmHistoryPackage) FROM DmHistoryPackage dmHistoryPackage WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmHistoryPackage.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmHistoryPackage exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmHistoryPackage exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmHistoryPackagePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"packageCode", "packageName", "packageNameVN", "packageOrder",
				"isDelete", "markedAsDelete", "modifiedDate", "requestedDate",
				"syncVersion"
			});
	private static DmHistoryPackage _nullDmHistoryPackage = new DmHistoryPackageImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmHistoryPackage> toCacheModel() {
				return _nullDmHistoryPackageCacheModel;
			}
		};

	private static CacheModel<DmHistoryPackage> _nullDmHistoryPackageCacheModel = new CacheModel<DmHistoryPackage>() {
			@Override
			public DmHistoryPackage toEntityModel() {
				return _nullDmHistoryPackage;
			}
		};
}