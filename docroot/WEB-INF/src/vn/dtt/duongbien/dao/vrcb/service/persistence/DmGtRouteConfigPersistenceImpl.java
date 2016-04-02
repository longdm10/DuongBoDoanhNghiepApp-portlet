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

import vn.dtt.duongbien.dao.vrcb.NoSuchDmGtRouteConfigException;
import vn.dtt.duongbien.dao.vrcb.model.DmGtRouteConfig;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmGtRouteConfigImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmGtRouteConfigModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dm gt route config service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmGtRouteConfigPersistence
 * @see DmGtRouteConfigUtil
 * @generated
 */
public class DmGtRouteConfigPersistenceImpl extends BasePersistenceImpl<DmGtRouteConfig>
	implements DmGtRouteConfigPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmGtRouteConfigUtil} to access the dm gt route config persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmGtRouteConfigImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmGtRouteConfigModelImpl.ENTITY_CACHE_ENABLED,
			DmGtRouteConfigModelImpl.FINDER_CACHE_ENABLED,
			DmGtRouteConfigImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmGtRouteConfigModelImpl.ENTITY_CACHE_ENABLED,
			DmGtRouteConfigModelImpl.FINDER_CACHE_ENABLED,
			DmGtRouteConfigImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmGtRouteConfigModelImpl.ENTITY_CACHE_ENABLED,
			DmGtRouteConfigModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_ROUTECODE = new FinderPath(DmGtRouteConfigModelImpl.ENTITY_CACHE_ENABLED,
			DmGtRouteConfigModelImpl.FINDER_CACHE_ENABLED,
			DmGtRouteConfigImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByRouteCode", new String[] { String.class.getName() },
			DmGtRouteConfigModelImpl.ROUTECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ROUTECODE = new FinderPath(DmGtRouteConfigModelImpl.ENTITY_CACHE_ENABLED,
			DmGtRouteConfigModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRouteCode",
			new String[] { String.class.getName() });

	/**
	 * Returns the dm gt route config where routeCode = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmGtRouteConfigException} if it could not be found.
	 *
	 * @param routeCode the route code
	 * @return the matching dm gt route config
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtRouteConfigException if a matching dm gt route config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtRouteConfig findByRouteCode(String routeCode)
		throws NoSuchDmGtRouteConfigException, SystemException {
		DmGtRouteConfig dmGtRouteConfig = fetchByRouteCode(routeCode);

		if (dmGtRouteConfig == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("routeCode=");
			msg.append(routeCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmGtRouteConfigException(msg.toString());
		}

		return dmGtRouteConfig;
	}

	/**
	 * Returns the dm gt route config where routeCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param routeCode the route code
	 * @return the matching dm gt route config, or <code>null</code> if a matching dm gt route config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtRouteConfig fetchByRouteCode(String routeCode)
		throws SystemException {
		return fetchByRouteCode(routeCode, true);
	}

	/**
	 * Returns the dm gt route config where routeCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param routeCode the route code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm gt route config, or <code>null</code> if a matching dm gt route config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtRouteConfig fetchByRouteCode(String routeCode,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { routeCode };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_ROUTECODE,
					finderArgs, this);
		}

		if (result instanceof DmGtRouteConfig) {
			DmGtRouteConfig dmGtRouteConfig = (DmGtRouteConfig)result;

			if (!Validator.equals(routeCode, dmGtRouteConfig.getRouteCode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_DMGTROUTECONFIG_WHERE);

			boolean bindRouteCode = false;

			if (routeCode == null) {
				query.append(_FINDER_COLUMN_ROUTECODE_ROUTECODE_1);
			}
			else if (routeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ROUTECODE_ROUTECODE_3);
			}
			else {
				bindRouteCode = true;

				query.append(_FINDER_COLUMN_ROUTECODE_ROUTECODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRouteCode) {
					qPos.add(routeCode);
				}

				List<DmGtRouteConfig> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ROUTECODE,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DmGtRouteConfigPersistenceImpl.fetchByRouteCode(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DmGtRouteConfig dmGtRouteConfig = list.get(0);

					result = dmGtRouteConfig;

					cacheResult(dmGtRouteConfig);

					if ((dmGtRouteConfig.getRouteCode() == null) ||
							!dmGtRouteConfig.getRouteCode().equals(routeCode)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ROUTECODE,
							finderArgs, dmGtRouteConfig);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ROUTECODE,
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
			return (DmGtRouteConfig)result;
		}
	}

	/**
	 * Removes the dm gt route config where routeCode = &#63; from the database.
	 *
	 * @param routeCode the route code
	 * @return the dm gt route config that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtRouteConfig removeByRouteCode(String routeCode)
		throws NoSuchDmGtRouteConfigException, SystemException {
		DmGtRouteConfig dmGtRouteConfig = findByRouteCode(routeCode);

		return remove(dmGtRouteConfig);
	}

	/**
	 * Returns the number of dm gt route configs where routeCode = &#63;.
	 *
	 * @param routeCode the route code
	 * @return the number of matching dm gt route configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByRouteCode(String routeCode) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ROUTECODE;

		Object[] finderArgs = new Object[] { routeCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMGTROUTECONFIG_WHERE);

			boolean bindRouteCode = false;

			if (routeCode == null) {
				query.append(_FINDER_COLUMN_ROUTECODE_ROUTECODE_1);
			}
			else if (routeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ROUTECODE_ROUTECODE_3);
			}
			else {
				bindRouteCode = true;

				query.append(_FINDER_COLUMN_ROUTECODE_ROUTECODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRouteCode) {
					qPos.add(routeCode);
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

	private static final String _FINDER_COLUMN_ROUTECODE_ROUTECODE_1 = "dmGtRouteConfig.routeCode IS NULL";
	private static final String _FINDER_COLUMN_ROUTECODE_ROUTECODE_2 = "dmGtRouteConfig.routeCode = ?";
	private static final String _FINDER_COLUMN_ROUTECODE_ROUTECODE_3 = "(dmGtRouteConfig.routeCode IS NULL OR dmGtRouteConfig.routeCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ISDELETE = new FinderPath(DmGtRouteConfigModelImpl.ENTITY_CACHE_ENABLED,
			DmGtRouteConfigModelImpl.FINDER_CACHE_ENABLED,
			DmGtRouteConfigImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByIsDelete",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISDELETE =
		new FinderPath(DmGtRouteConfigModelImpl.ENTITY_CACHE_ENABLED,
			DmGtRouteConfigModelImpl.FINDER_CACHE_ENABLED,
			DmGtRouteConfigImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByIsDelete",
			new String[] { Integer.class.getName() },
			DmGtRouteConfigModelImpl.ISDELETE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ISDELETE = new FinderPath(DmGtRouteConfigModelImpl.ENTITY_CACHE_ENABLED,
			DmGtRouteConfigModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByIsDelete",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the dm gt route configs where isDelete = &#63;.
	 *
	 * @param isDelete the is delete
	 * @return the matching dm gt route configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmGtRouteConfig> findByIsDelete(int isDelete)
		throws SystemException {
		return findByIsDelete(isDelete, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the dm gt route configs where isDelete = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGtRouteConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param isDelete the is delete
	 * @param start the lower bound of the range of dm gt route configs
	 * @param end the upper bound of the range of dm gt route configs (not inclusive)
	 * @return the range of matching dm gt route configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmGtRouteConfig> findByIsDelete(int isDelete, int start, int end)
		throws SystemException {
		return findByIsDelete(isDelete, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm gt route configs where isDelete = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGtRouteConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param isDelete the is delete
	 * @param start the lower bound of the range of dm gt route configs
	 * @param end the upper bound of the range of dm gt route configs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm gt route configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmGtRouteConfig> findByIsDelete(int isDelete, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISDELETE;
			finderArgs = new Object[] { isDelete };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ISDELETE;
			finderArgs = new Object[] { isDelete, start, end, orderByComparator };
		}

		List<DmGtRouteConfig> list = (List<DmGtRouteConfig>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmGtRouteConfig dmGtRouteConfig : list) {
				if ((isDelete != dmGtRouteConfig.getIsDelete())) {
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

			query.append(_SQL_SELECT_DMGTROUTECONFIG_WHERE);

			query.append(_FINDER_COLUMN_ISDELETE_ISDELETE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DmGtRouteConfigModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isDelete);

				if (!pagination) {
					list = (List<DmGtRouteConfig>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmGtRouteConfig>(list);
				}
				else {
					list = (List<DmGtRouteConfig>)QueryUtil.list(q,
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
	 * Returns the first dm gt route config in the ordered set where isDelete = &#63;.
	 *
	 * @param isDelete the is delete
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm gt route config
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtRouteConfigException if a matching dm gt route config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtRouteConfig findByIsDelete_First(int isDelete,
		OrderByComparator orderByComparator)
		throws NoSuchDmGtRouteConfigException, SystemException {
		DmGtRouteConfig dmGtRouteConfig = fetchByIsDelete_First(isDelete,
				orderByComparator);

		if (dmGtRouteConfig != null) {
			return dmGtRouteConfig;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isDelete=");
		msg.append(isDelete);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmGtRouteConfigException(msg.toString());
	}

	/**
	 * Returns the first dm gt route config in the ordered set where isDelete = &#63;.
	 *
	 * @param isDelete the is delete
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm gt route config, or <code>null</code> if a matching dm gt route config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtRouteConfig fetchByIsDelete_First(int isDelete,
		OrderByComparator orderByComparator) throws SystemException {
		List<DmGtRouteConfig> list = findByIsDelete(isDelete, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm gt route config in the ordered set where isDelete = &#63;.
	 *
	 * @param isDelete the is delete
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm gt route config
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtRouteConfigException if a matching dm gt route config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtRouteConfig findByIsDelete_Last(int isDelete,
		OrderByComparator orderByComparator)
		throws NoSuchDmGtRouteConfigException, SystemException {
		DmGtRouteConfig dmGtRouteConfig = fetchByIsDelete_Last(isDelete,
				orderByComparator);

		if (dmGtRouteConfig != null) {
			return dmGtRouteConfig;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isDelete=");
		msg.append(isDelete);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmGtRouteConfigException(msg.toString());
	}

	/**
	 * Returns the last dm gt route config in the ordered set where isDelete = &#63;.
	 *
	 * @param isDelete the is delete
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm gt route config, or <code>null</code> if a matching dm gt route config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtRouteConfig fetchByIsDelete_Last(int isDelete,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByIsDelete(isDelete);

		if (count == 0) {
			return null;
		}

		List<DmGtRouteConfig> list = findByIsDelete(isDelete, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm gt route configs before and after the current dm gt route config in the ordered set where isDelete = &#63;.
	 *
	 * @param id the primary key of the current dm gt route config
	 * @param isDelete the is delete
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm gt route config
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtRouteConfigException if a dm gt route config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtRouteConfig[] findByIsDelete_PrevAndNext(long id, int isDelete,
		OrderByComparator orderByComparator)
		throws NoSuchDmGtRouteConfigException, SystemException {
		DmGtRouteConfig dmGtRouteConfig = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmGtRouteConfig[] array = new DmGtRouteConfigImpl[3];

			array[0] = getByIsDelete_PrevAndNext(session, dmGtRouteConfig,
					isDelete, orderByComparator, true);

			array[1] = dmGtRouteConfig;

			array[2] = getByIsDelete_PrevAndNext(session, dmGtRouteConfig,
					isDelete, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmGtRouteConfig getByIsDelete_PrevAndNext(Session session,
		DmGtRouteConfig dmGtRouteConfig, int isDelete,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMGTROUTECONFIG_WHERE);

		query.append(_FINDER_COLUMN_ISDELETE_ISDELETE_2);

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
			query.append(DmGtRouteConfigModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(isDelete);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmGtRouteConfig);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmGtRouteConfig> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm gt route configs where isDelete = &#63; from the database.
	 *
	 * @param isDelete the is delete
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByIsDelete(int isDelete) throws SystemException {
		for (DmGtRouteConfig dmGtRouteConfig : findByIsDelete(isDelete,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dmGtRouteConfig);
		}
	}

	/**
	 * Returns the number of dm gt route configs where isDelete = &#63;.
	 *
	 * @param isDelete the is delete
	 * @return the number of matching dm gt route configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByIsDelete(int isDelete) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ISDELETE;

		Object[] finderArgs = new Object[] { isDelete };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMGTROUTECONFIG_WHERE);

			query.append(_FINDER_COLUMN_ISDELETE_ISDELETE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isDelete);

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

	private static final String _FINDER_COLUMN_ISDELETE_ISDELETE_2 = "dmGtRouteConfig.isDelete = ?";

	public DmGtRouteConfigPersistenceImpl() {
		setModelClass(DmGtRouteConfig.class);
	}

	/**
	 * Caches the dm gt route config in the entity cache if it is enabled.
	 *
	 * @param dmGtRouteConfig the dm gt route config
	 */
	@Override
	public void cacheResult(DmGtRouteConfig dmGtRouteConfig) {
		EntityCacheUtil.putResult(DmGtRouteConfigModelImpl.ENTITY_CACHE_ENABLED,
			DmGtRouteConfigImpl.class, dmGtRouteConfig.getPrimaryKey(),
			dmGtRouteConfig);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ROUTECODE,
			new Object[] { dmGtRouteConfig.getRouteCode() }, dmGtRouteConfig);

		dmGtRouteConfig.resetOriginalValues();
	}

	/**
	 * Caches the dm gt route configs in the entity cache if it is enabled.
	 *
	 * @param dmGtRouteConfigs the dm gt route configs
	 */
	@Override
	public void cacheResult(List<DmGtRouteConfig> dmGtRouteConfigs) {
		for (DmGtRouteConfig dmGtRouteConfig : dmGtRouteConfigs) {
			if (EntityCacheUtil.getResult(
						DmGtRouteConfigModelImpl.ENTITY_CACHE_ENABLED,
						DmGtRouteConfigImpl.class,
						dmGtRouteConfig.getPrimaryKey()) == null) {
				cacheResult(dmGtRouteConfig);
			}
			else {
				dmGtRouteConfig.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm gt route configs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmGtRouteConfigImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmGtRouteConfigImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm gt route config.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmGtRouteConfig dmGtRouteConfig) {
		EntityCacheUtil.removeResult(DmGtRouteConfigModelImpl.ENTITY_CACHE_ENABLED,
			DmGtRouteConfigImpl.class, dmGtRouteConfig.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(dmGtRouteConfig);
	}

	@Override
	public void clearCache(List<DmGtRouteConfig> dmGtRouteConfigs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmGtRouteConfig dmGtRouteConfig : dmGtRouteConfigs) {
			EntityCacheUtil.removeResult(DmGtRouteConfigModelImpl.ENTITY_CACHE_ENABLED,
				DmGtRouteConfigImpl.class, dmGtRouteConfig.getPrimaryKey());

			clearUniqueFindersCache(dmGtRouteConfig);
		}
	}

	protected void cacheUniqueFindersCache(DmGtRouteConfig dmGtRouteConfig) {
		if (dmGtRouteConfig.isNew()) {
			Object[] args = new Object[] { dmGtRouteConfig.getRouteCode() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ROUTECODE, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ROUTECODE, args,
				dmGtRouteConfig);
		}
		else {
			DmGtRouteConfigModelImpl dmGtRouteConfigModelImpl = (DmGtRouteConfigModelImpl)dmGtRouteConfig;

			if ((dmGtRouteConfigModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_ROUTECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { dmGtRouteConfig.getRouteCode() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ROUTECODE, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ROUTECODE, args,
					dmGtRouteConfig);
			}
		}
	}

	protected void clearUniqueFindersCache(DmGtRouteConfig dmGtRouteConfig) {
		DmGtRouteConfigModelImpl dmGtRouteConfigModelImpl = (DmGtRouteConfigModelImpl)dmGtRouteConfig;

		Object[] args = new Object[] { dmGtRouteConfig.getRouteCode() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ROUTECODE, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ROUTECODE, args);

		if ((dmGtRouteConfigModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_ROUTECODE.getColumnBitmask()) != 0) {
			args = new Object[] { dmGtRouteConfigModelImpl.getOriginalRouteCode() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ROUTECODE, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ROUTECODE, args);
		}
	}

	/**
	 * Creates a new dm gt route config with the primary key. Does not add the dm gt route config to the database.
	 *
	 * @param id the primary key for the new dm gt route config
	 * @return the new dm gt route config
	 */
	@Override
	public DmGtRouteConfig create(long id) {
		DmGtRouteConfig dmGtRouteConfig = new DmGtRouteConfigImpl();

		dmGtRouteConfig.setNew(true);
		dmGtRouteConfig.setPrimaryKey(id);

		return dmGtRouteConfig;
	}

	/**
	 * Removes the dm gt route config with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm gt route config
	 * @return the dm gt route config that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtRouteConfigException if a dm gt route config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtRouteConfig remove(long id)
		throws NoSuchDmGtRouteConfigException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the dm gt route config with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm gt route config
	 * @return the dm gt route config that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtRouteConfigException if a dm gt route config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtRouteConfig remove(Serializable primaryKey)
		throws NoSuchDmGtRouteConfigException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmGtRouteConfig dmGtRouteConfig = (DmGtRouteConfig)session.get(DmGtRouteConfigImpl.class,
					primaryKey);

			if (dmGtRouteConfig == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmGtRouteConfigException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmGtRouteConfig);
		}
		catch (NoSuchDmGtRouteConfigException nsee) {
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
	protected DmGtRouteConfig removeImpl(DmGtRouteConfig dmGtRouteConfig)
		throws SystemException {
		dmGtRouteConfig = toUnwrappedModel(dmGtRouteConfig);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dmGtRouteConfig)) {
				dmGtRouteConfig = (DmGtRouteConfig)session.get(DmGtRouteConfigImpl.class,
						dmGtRouteConfig.getPrimaryKeyObj());
			}

			if (dmGtRouteConfig != null) {
				session.delete(dmGtRouteConfig);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dmGtRouteConfig != null) {
			clearCache(dmGtRouteConfig);
		}

		return dmGtRouteConfig;
	}

	@Override
	public DmGtRouteConfig updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmGtRouteConfig dmGtRouteConfig)
		throws SystemException {
		dmGtRouteConfig = toUnwrappedModel(dmGtRouteConfig);

		boolean isNew = dmGtRouteConfig.isNew();

		DmGtRouteConfigModelImpl dmGtRouteConfigModelImpl = (DmGtRouteConfigModelImpl)dmGtRouteConfig;

		Session session = null;

		try {
			session = openSession();

			if (dmGtRouteConfig.isNew()) {
				session.save(dmGtRouteConfig);

				dmGtRouteConfig.setNew(false);
			}
			else {
				session.merge(dmGtRouteConfig);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmGtRouteConfigModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmGtRouteConfigModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISDELETE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmGtRouteConfigModelImpl.getOriginalIsDelete()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ISDELETE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISDELETE,
					args);

				args = new Object[] { dmGtRouteConfigModelImpl.getIsDelete() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ISDELETE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISDELETE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmGtRouteConfigModelImpl.ENTITY_CACHE_ENABLED,
			DmGtRouteConfigImpl.class, dmGtRouteConfig.getPrimaryKey(),
			dmGtRouteConfig);

		clearUniqueFindersCache(dmGtRouteConfig);
		cacheUniqueFindersCache(dmGtRouteConfig);

		return dmGtRouteConfig;
	}

	protected DmGtRouteConfig toUnwrappedModel(DmGtRouteConfig dmGtRouteConfig) {
		if (dmGtRouteConfig instanceof DmGtRouteConfigImpl) {
			return dmGtRouteConfig;
		}

		DmGtRouteConfigImpl dmGtRouteConfigImpl = new DmGtRouteConfigImpl();

		dmGtRouteConfigImpl.setNew(dmGtRouteConfig.isNew());
		dmGtRouteConfigImpl.setPrimaryKey(dmGtRouteConfig.getPrimaryKey());

		dmGtRouteConfigImpl.setId(dmGtRouteConfig.getId());
		dmGtRouteConfigImpl.setRouteCode(dmGtRouteConfig.getRouteCode());
		dmGtRouteConfigImpl.setOrganizationCode(dmGtRouteConfig.getOrganizationCode());
		dmGtRouteConfigImpl.setLocCode(dmGtRouteConfig.getLocCode());
		dmGtRouteConfigImpl.setIpName(dmGtRouteConfig.getIpName());
		dmGtRouteConfigImpl.setPortName(dmGtRouteConfig.getPortName());
		dmGtRouteConfigImpl.setLinkAddress(dmGtRouteConfig.getLinkAddress());
		dmGtRouteConfigImpl.setIsDelete(dmGtRouteConfig.getIsDelete());
		dmGtRouteConfigImpl.setMarkedAsDelete(dmGtRouteConfig.getMarkedAsDelete());
		dmGtRouteConfigImpl.setModifiedDate(dmGtRouteConfig.getModifiedDate());
		dmGtRouteConfigImpl.setRequestedDate(dmGtRouteConfig.getRequestedDate());
		dmGtRouteConfigImpl.setSyncVersion(dmGtRouteConfig.getSyncVersion());

		return dmGtRouteConfigImpl;
	}

	/**
	 * Returns the dm gt route config with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm gt route config
	 * @return the dm gt route config
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtRouteConfigException if a dm gt route config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtRouteConfig findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDmGtRouteConfigException, SystemException {
		DmGtRouteConfig dmGtRouteConfig = fetchByPrimaryKey(primaryKey);

		if (dmGtRouteConfig == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDmGtRouteConfigException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dmGtRouteConfig;
	}

	/**
	 * Returns the dm gt route config with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmGtRouteConfigException} if it could not be found.
	 *
	 * @param id the primary key of the dm gt route config
	 * @return the dm gt route config
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtRouteConfigException if a dm gt route config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtRouteConfig findByPrimaryKey(long id)
		throws NoSuchDmGtRouteConfigException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dm gt route config with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm gt route config
	 * @return the dm gt route config, or <code>null</code> if a dm gt route config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtRouteConfig fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DmGtRouteConfig dmGtRouteConfig = (DmGtRouteConfig)EntityCacheUtil.getResult(DmGtRouteConfigModelImpl.ENTITY_CACHE_ENABLED,
				DmGtRouteConfigImpl.class, primaryKey);

		if (dmGtRouteConfig == _nullDmGtRouteConfig) {
			return null;
		}

		if (dmGtRouteConfig == null) {
			Session session = null;

			try {
				session = openSession();

				dmGtRouteConfig = (DmGtRouteConfig)session.get(DmGtRouteConfigImpl.class,
						primaryKey);

				if (dmGtRouteConfig != null) {
					cacheResult(dmGtRouteConfig);
				}
				else {
					EntityCacheUtil.putResult(DmGtRouteConfigModelImpl.ENTITY_CACHE_ENABLED,
						DmGtRouteConfigImpl.class, primaryKey,
						_nullDmGtRouteConfig);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DmGtRouteConfigModelImpl.ENTITY_CACHE_ENABLED,
					DmGtRouteConfigImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dmGtRouteConfig;
	}

	/**
	 * Returns the dm gt route config with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm gt route config
	 * @return the dm gt route config, or <code>null</code> if a dm gt route config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtRouteConfig fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the dm gt route configs.
	 *
	 * @return the dm gt route configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmGtRouteConfig> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm gt route configs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGtRouteConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm gt route configs
	 * @param end the upper bound of the range of dm gt route configs (not inclusive)
	 * @return the range of dm gt route configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmGtRouteConfig> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm gt route configs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGtRouteConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm gt route configs
	 * @param end the upper bound of the range of dm gt route configs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm gt route configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmGtRouteConfig> findAll(int start, int end,
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

		List<DmGtRouteConfig> list = (List<DmGtRouteConfig>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMGTROUTECONFIG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMGTROUTECONFIG;

				if (pagination) {
					sql = sql.concat(DmGtRouteConfigModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DmGtRouteConfig>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmGtRouteConfig>(list);
				}
				else {
					list = (List<DmGtRouteConfig>)QueryUtil.list(q,
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
	 * Removes all the dm gt route configs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DmGtRouteConfig dmGtRouteConfig : findAll()) {
			remove(dmGtRouteConfig);
		}
	}

	/**
	 * Returns the number of dm gt route configs.
	 *
	 * @return the number of dm gt route configs
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

				Query q = session.createQuery(_SQL_COUNT_DMGTROUTECONFIG);

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
	 * Initializes the dm gt route config persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.DmGtRouteConfig")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmGtRouteConfig>> listenersList = new ArrayList<ModelListener<DmGtRouteConfig>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmGtRouteConfig>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmGtRouteConfigImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DMGTROUTECONFIG = "SELECT dmGtRouteConfig FROM DmGtRouteConfig dmGtRouteConfig";
	private static final String _SQL_SELECT_DMGTROUTECONFIG_WHERE = "SELECT dmGtRouteConfig FROM DmGtRouteConfig dmGtRouteConfig WHERE ";
	private static final String _SQL_COUNT_DMGTROUTECONFIG = "SELECT COUNT(dmGtRouteConfig) FROM DmGtRouteConfig dmGtRouteConfig";
	private static final String _SQL_COUNT_DMGTROUTECONFIG_WHERE = "SELECT COUNT(dmGtRouteConfig) FROM DmGtRouteConfig dmGtRouteConfig WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmGtRouteConfig.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmGtRouteConfig exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmGtRouteConfig exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmGtRouteConfigPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "routeCode", "organizationCode", "locCode", "ipName",
				"portName", "linkAddress", "isDelete", "markedAsDelete",
				"modifiedDate", "requestedDate", "syncVersion"
			});
	private static DmGtRouteConfig _nullDmGtRouteConfig = new DmGtRouteConfigImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmGtRouteConfig> toCacheModel() {
				return _nullDmGtRouteConfigCacheModel;
			}
		};

	private static CacheModel<DmGtRouteConfig> _nullDmGtRouteConfigCacheModel = new CacheModel<DmGtRouteConfig>() {
			@Override
			public DmGtRouteConfig toEntityModel() {
				return _nullDmGtRouteConfig;
			}
		};
}