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

import vn.dtt.duongbien.dao.vrcb.NoSuchDmPackageException;
import vn.dtt.duongbien.dao.vrcb.model.DmPackage;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmPackageImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmPackageModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dm package service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmPackagePersistence
 * @see DmPackageUtil
 * @generated
 */
public class DmPackagePersistenceImpl extends BasePersistenceImpl<DmPackage>
	implements DmPackagePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmPackageUtil} to access the dm package persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmPackageImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmPackageModelImpl.ENTITY_CACHE_ENABLED,
			DmPackageModelImpl.FINDER_CACHE_ENABLED, DmPackageImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmPackageModelImpl.ENTITY_CACHE_ENABLED,
			DmPackageModelImpl.FINDER_CACHE_ENABLED, DmPackageImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmPackageModelImpl.ENTITY_CACHE_ENABLED,
			DmPackageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PACKAGECODE =
		new FinderPath(DmPackageModelImpl.ENTITY_CACHE_ENABLED,
			DmPackageModelImpl.FINDER_CACHE_ENABLED, DmPackageImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPackageCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PACKAGECODE =
		new FinderPath(DmPackageModelImpl.ENTITY_CACHE_ENABLED,
			DmPackageModelImpl.FINDER_CACHE_ENABLED, DmPackageImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPackageCode",
			new String[] { String.class.getName() },
			DmPackageModelImpl.PACKAGECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PACKAGECODE = new FinderPath(DmPackageModelImpl.ENTITY_CACHE_ENABLED,
			DmPackageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPackageCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the dm packages where packageCode = &#63;.
	 *
	 * @param packageCode the package code
	 * @return the matching dm packages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmPackage> findByPackageCode(String packageCode)
		throws SystemException {
		return findByPackageCode(packageCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm packages where packageCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param packageCode the package code
	 * @param start the lower bound of the range of dm packages
	 * @param end the upper bound of the range of dm packages (not inclusive)
	 * @return the range of matching dm packages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmPackage> findByPackageCode(String packageCode, int start,
		int end) throws SystemException {
		return findByPackageCode(packageCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm packages where packageCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param packageCode the package code
	 * @param start the lower bound of the range of dm packages
	 * @param end the upper bound of the range of dm packages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm packages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmPackage> findByPackageCode(String packageCode, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
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

		List<DmPackage> list = (List<DmPackage>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmPackage dmPackage : list) {
				if (!Validator.equals(packageCode, dmPackage.getPackageCode())) {
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

			query.append(_SQL_SELECT_DMPACKAGE_WHERE);

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
				query.append(DmPackageModelImpl.ORDER_BY_JPQL);
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
					list = (List<DmPackage>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmPackage>(list);
				}
				else {
					list = (List<DmPackage>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dm package in the ordered set where packageCode = &#63;.
	 *
	 * @param packageCode the package code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm package
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPackageException if a matching dm package could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPackage findByPackageCode_First(String packageCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmPackageException, SystemException {
		DmPackage dmPackage = fetchByPackageCode_First(packageCode,
				orderByComparator);

		if (dmPackage != null) {
			return dmPackage;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("packageCode=");
		msg.append(packageCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmPackageException(msg.toString());
	}

	/**
	 * Returns the first dm package in the ordered set where packageCode = &#63;.
	 *
	 * @param packageCode the package code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm package, or <code>null</code> if a matching dm package could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPackage fetchByPackageCode_First(String packageCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<DmPackage> list = findByPackageCode(packageCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm package in the ordered set where packageCode = &#63;.
	 *
	 * @param packageCode the package code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm package
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPackageException if a matching dm package could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPackage findByPackageCode_Last(String packageCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmPackageException, SystemException {
		DmPackage dmPackage = fetchByPackageCode_Last(packageCode,
				orderByComparator);

		if (dmPackage != null) {
			return dmPackage;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("packageCode=");
		msg.append(packageCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmPackageException(msg.toString());
	}

	/**
	 * Returns the last dm package in the ordered set where packageCode = &#63;.
	 *
	 * @param packageCode the package code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm package, or <code>null</code> if a matching dm package could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPackage fetchByPackageCode_Last(String packageCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByPackageCode(packageCode);

		if (count == 0) {
			return null;
		}

		List<DmPackage> list = findByPackageCode(packageCode, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm packages before and after the current dm package in the ordered set where packageCode = &#63;.
	 *
	 * @param id the primary key of the current dm package
	 * @param packageCode the package code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm package
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPackageException if a dm package with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPackage[] findByPackageCode_PrevAndNext(int id,
		String packageCode, OrderByComparator orderByComparator)
		throws NoSuchDmPackageException, SystemException {
		DmPackage dmPackage = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmPackage[] array = new DmPackageImpl[3];

			array[0] = getByPackageCode_PrevAndNext(session, dmPackage,
					packageCode, orderByComparator, true);

			array[1] = dmPackage;

			array[2] = getByPackageCode_PrevAndNext(session, dmPackage,
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

	protected DmPackage getByPackageCode_PrevAndNext(Session session,
		DmPackage dmPackage, String packageCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMPACKAGE_WHERE);

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
			query.append(DmPackageModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(dmPackage);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmPackage> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm packages where packageCode = &#63; from the database.
	 *
	 * @param packageCode the package code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPackageCode(String packageCode)
		throws SystemException {
		for (DmPackage dmPackage : findByPackageCode(packageCode,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dmPackage);
		}
	}

	/**
	 * Returns the number of dm packages where packageCode = &#63;.
	 *
	 * @param packageCode the package code
	 * @return the number of matching dm packages
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

			query.append(_SQL_COUNT_DMPACKAGE_WHERE);

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

	private static final String _FINDER_COLUMN_PACKAGECODE_PACKAGECODE_1 = "dmPackage.packageCode IS NULL";
	private static final String _FINDER_COLUMN_PACKAGECODE_PACKAGECODE_2 = "dmPackage.packageCode = ?";
	private static final String _FINDER_COLUMN_PACKAGECODE_PACKAGECODE_3 = "(dmPackage.packageCode IS NULL OR dmPackage.packageCode = '')";

	public DmPackagePersistenceImpl() {
		setModelClass(DmPackage.class);
	}

	/**
	 * Caches the dm package in the entity cache if it is enabled.
	 *
	 * @param dmPackage the dm package
	 */
	@Override
	public void cacheResult(DmPackage dmPackage) {
		EntityCacheUtil.putResult(DmPackageModelImpl.ENTITY_CACHE_ENABLED,
			DmPackageImpl.class, dmPackage.getPrimaryKey(), dmPackage);

		dmPackage.resetOriginalValues();
	}

	/**
	 * Caches the dm packages in the entity cache if it is enabled.
	 *
	 * @param dmPackages the dm packages
	 */
	@Override
	public void cacheResult(List<DmPackage> dmPackages) {
		for (DmPackage dmPackage : dmPackages) {
			if (EntityCacheUtil.getResult(
						DmPackageModelImpl.ENTITY_CACHE_ENABLED,
						DmPackageImpl.class, dmPackage.getPrimaryKey()) == null) {
				cacheResult(dmPackage);
			}
			else {
				dmPackage.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm packages.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmPackageImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmPackageImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm package.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmPackage dmPackage) {
		EntityCacheUtil.removeResult(DmPackageModelImpl.ENTITY_CACHE_ENABLED,
			DmPackageImpl.class, dmPackage.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DmPackage> dmPackages) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmPackage dmPackage : dmPackages) {
			EntityCacheUtil.removeResult(DmPackageModelImpl.ENTITY_CACHE_ENABLED,
				DmPackageImpl.class, dmPackage.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dm package with the primary key. Does not add the dm package to the database.
	 *
	 * @param id the primary key for the new dm package
	 * @return the new dm package
	 */
	@Override
	public DmPackage create(int id) {
		DmPackage dmPackage = new DmPackageImpl();

		dmPackage.setNew(true);
		dmPackage.setPrimaryKey(id);

		return dmPackage;
	}

	/**
	 * Removes the dm package with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm package
	 * @return the dm package that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPackageException if a dm package with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPackage remove(int id)
		throws NoSuchDmPackageException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the dm package with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm package
	 * @return the dm package that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPackageException if a dm package with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPackage remove(Serializable primaryKey)
		throws NoSuchDmPackageException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmPackage dmPackage = (DmPackage)session.get(DmPackageImpl.class,
					primaryKey);

			if (dmPackage == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmPackageException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmPackage);
		}
		catch (NoSuchDmPackageException nsee) {
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
	protected DmPackage removeImpl(DmPackage dmPackage)
		throws SystemException {
		dmPackage = toUnwrappedModel(dmPackage);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dmPackage)) {
				dmPackage = (DmPackage)session.get(DmPackageImpl.class,
						dmPackage.getPrimaryKeyObj());
			}

			if (dmPackage != null) {
				session.delete(dmPackage);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dmPackage != null) {
			clearCache(dmPackage);
		}

		return dmPackage;
	}

	@Override
	public DmPackage updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmPackage dmPackage)
		throws SystemException {
		dmPackage = toUnwrappedModel(dmPackage);

		boolean isNew = dmPackage.isNew();

		DmPackageModelImpl dmPackageModelImpl = (DmPackageModelImpl)dmPackage;

		Session session = null;

		try {
			session = openSession();

			if (dmPackage.isNew()) {
				session.save(dmPackage);

				dmPackage.setNew(false);
			}
			else {
				session.merge(dmPackage);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmPackageModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmPackageModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PACKAGECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmPackageModelImpl.getOriginalPackageCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PACKAGECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PACKAGECODE,
					args);

				args = new Object[] { dmPackageModelImpl.getPackageCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PACKAGECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PACKAGECODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmPackageModelImpl.ENTITY_CACHE_ENABLED,
			DmPackageImpl.class, dmPackage.getPrimaryKey(), dmPackage);

		return dmPackage;
	}

	protected DmPackage toUnwrappedModel(DmPackage dmPackage) {
		if (dmPackage instanceof DmPackageImpl) {
			return dmPackage;
		}

		DmPackageImpl dmPackageImpl = new DmPackageImpl();

		dmPackageImpl.setNew(dmPackage.isNew());
		dmPackageImpl.setPrimaryKey(dmPackage.getPrimaryKey());

		dmPackageImpl.setId(dmPackage.getId());
		dmPackageImpl.setPackageCode(dmPackage.getPackageCode());
		dmPackageImpl.setPackageName(dmPackage.getPackageName());
		dmPackageImpl.setPackageNameVN(dmPackage.getPackageNameVN());
		dmPackageImpl.setPackageOrder(dmPackage.getPackageOrder());
		dmPackageImpl.setIsDelete(dmPackage.getIsDelete());
		dmPackageImpl.setMarkedAsDelete(dmPackage.getMarkedAsDelete());
		dmPackageImpl.setModifiedDate(dmPackage.getModifiedDate());
		dmPackageImpl.setRequestedDate(dmPackage.getRequestedDate());
		dmPackageImpl.setSyncVersion(dmPackage.getSyncVersion());

		return dmPackageImpl;
	}

	/**
	 * Returns the dm package with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm package
	 * @return the dm package
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPackageException if a dm package with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPackage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDmPackageException, SystemException {
		DmPackage dmPackage = fetchByPrimaryKey(primaryKey);

		if (dmPackage == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDmPackageException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dmPackage;
	}

	/**
	 * Returns the dm package with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmPackageException} if it could not be found.
	 *
	 * @param id the primary key of the dm package
	 * @return the dm package
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPackageException if a dm package with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPackage findByPrimaryKey(int id)
		throws NoSuchDmPackageException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dm package with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm package
	 * @return the dm package, or <code>null</code> if a dm package with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPackage fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DmPackage dmPackage = (DmPackage)EntityCacheUtil.getResult(DmPackageModelImpl.ENTITY_CACHE_ENABLED,
				DmPackageImpl.class, primaryKey);

		if (dmPackage == _nullDmPackage) {
			return null;
		}

		if (dmPackage == null) {
			Session session = null;

			try {
				session = openSession();

				dmPackage = (DmPackage)session.get(DmPackageImpl.class,
						primaryKey);

				if (dmPackage != null) {
					cacheResult(dmPackage);
				}
				else {
					EntityCacheUtil.putResult(DmPackageModelImpl.ENTITY_CACHE_ENABLED,
						DmPackageImpl.class, primaryKey, _nullDmPackage);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DmPackageModelImpl.ENTITY_CACHE_ENABLED,
					DmPackageImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dmPackage;
	}

	/**
	 * Returns the dm package with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm package
	 * @return the dm package, or <code>null</code> if a dm package with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPackage fetchByPrimaryKey(int id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the dm packages.
	 *
	 * @return the dm packages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmPackage> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm packages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm packages
	 * @param end the upper bound of the range of dm packages (not inclusive)
	 * @return the range of dm packages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmPackage> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm packages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm packages
	 * @param end the upper bound of the range of dm packages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm packages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmPackage> findAll(int start, int end,
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

		List<DmPackage> list = (List<DmPackage>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMPACKAGE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMPACKAGE;

				if (pagination) {
					sql = sql.concat(DmPackageModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DmPackage>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmPackage>(list);
				}
				else {
					list = (List<DmPackage>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the dm packages from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DmPackage dmPackage : findAll()) {
			remove(dmPackage);
		}
	}

	/**
	 * Returns the number of dm packages.
	 *
	 * @return the number of dm packages
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

				Query q = session.createQuery(_SQL_COUNT_DMPACKAGE);

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
	 * Initializes the dm package persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.DmPackage")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmPackage>> listenersList = new ArrayList<ModelListener<DmPackage>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmPackage>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmPackageImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DMPACKAGE = "SELECT dmPackage FROM DmPackage dmPackage";
	private static final String _SQL_SELECT_DMPACKAGE_WHERE = "SELECT dmPackage FROM DmPackage dmPackage WHERE ";
	private static final String _SQL_COUNT_DMPACKAGE = "SELECT COUNT(dmPackage) FROM DmPackage dmPackage";
	private static final String _SQL_COUNT_DMPACKAGE_WHERE = "SELECT COUNT(dmPackage) FROM DmPackage dmPackage WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmPackage.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmPackage exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmPackage exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmPackagePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"packageCode", "packageName", "packageNameVN", "packageOrder",
				"isDelete", "markedAsDelete", "modifiedDate", "requestedDate",
				"syncVersion"
			});
	private static DmPackage _nullDmPackage = new DmPackageImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmPackage> toCacheModel() {
				return _nullDmPackageCacheModel;
			}
		};

	private static CacheModel<DmPackage> _nullDmPackageCacheModel = new CacheModel<DmPackage>() {
			@Override
			public DmPackage toEntityModel() {
				return _nullDmPackage;
			}
		};
}