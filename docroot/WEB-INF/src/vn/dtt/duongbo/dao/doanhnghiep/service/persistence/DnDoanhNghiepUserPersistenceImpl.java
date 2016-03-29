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

package vn.dtt.duongbo.dao.doanhnghiep.service.persistence;

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
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepUserException;
import vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser;
import vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepUserImpl;
import vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepUserModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dn doanh nghiep user service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DnDoanhNghiepUserPersistence
 * @see DnDoanhNghiepUserUtil
 * @generated
 */
public class DnDoanhNghiepUserPersistenceImpl extends BasePersistenceImpl<DnDoanhNghiepUser>
	implements DnDoanhNghiepUserPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DnDoanhNghiepUserUtil} to access the dn doanh nghiep user persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DnDoanhNghiepUserImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DnDoanhNghiepUserModelImpl.ENTITY_CACHE_ENABLED,
			DnDoanhNghiepUserModelImpl.FINDER_CACHE_ENABLED,
			DnDoanhNghiepUserImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DnDoanhNghiepUserModelImpl.ENTITY_CACHE_ENABLED,
			DnDoanhNghiepUserModelImpl.FINDER_CACHE_ENABLED,
			DnDoanhNghiepUserImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DnDoanhNghiepUserModelImpl.ENTITY_CACHE_ENABLED,
			DnDoanhNghiepUserModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_USERID = new FinderPath(DnDoanhNghiepUserModelImpl.ENTITY_CACHE_ENABLED,
			DnDoanhNghiepUserModelImpl.FINDER_CACHE_ENABLED,
			DnDoanhNghiepUserImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByUserId", new String[] { Long.class.getName() },
			DnDoanhNghiepUserModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(DnDoanhNghiepUserModelImpl.ENTITY_CACHE_ENABLED,
			DnDoanhNghiepUserModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
			new String[] { Long.class.getName() });

	/**
	 * Returns the dn doanh nghiep user where userId = &#63; or throws a {@link vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepUserException} if it could not be found.
	 *
	 * @param userId the user ID
	 * @return the matching dn doanh nghiep user
	 * @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepUserException if a matching dn doanh nghiep user could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DnDoanhNghiepUser findByUserId(long userId)
		throws NoSuchDnDoanhNghiepUserException, SystemException {
		DnDoanhNghiepUser dnDoanhNghiepUser = fetchByUserId(userId);

		if (dnDoanhNghiepUser == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("userId=");
			msg.append(userId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDnDoanhNghiepUserException(msg.toString());
		}

		return dnDoanhNghiepUser;
	}

	/**
	 * Returns the dn doanh nghiep user where userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param userId the user ID
	 * @return the matching dn doanh nghiep user, or <code>null</code> if a matching dn doanh nghiep user could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DnDoanhNghiepUser fetchByUserId(long userId)
		throws SystemException {
		return fetchByUserId(userId, true);
	}

	/**
	 * Returns the dn doanh nghiep user where userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param userId the user ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dn doanh nghiep user, or <code>null</code> if a matching dn doanh nghiep user could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DnDoanhNghiepUser fetchByUserId(long userId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { userId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_USERID,
					finderArgs, this);
		}

		if (result instanceof DnDoanhNghiepUser) {
			DnDoanhNghiepUser dnDoanhNghiepUser = (DnDoanhNghiepUser)result;

			if ((userId != dnDoanhNghiepUser.getUserId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_DNDOANHNGHIEPUSER_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				List<DnDoanhNghiepUser> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DnDoanhNghiepUserPersistenceImpl.fetchByUserId(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DnDoanhNghiepUser dnDoanhNghiepUser = list.get(0);

					result = dnDoanhNghiepUser;

					cacheResult(dnDoanhNghiepUser);

					if ((dnDoanhNghiepUser.getUserId() != userId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
							finderArgs, dnDoanhNghiepUser);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_USERID,
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
			return (DnDoanhNghiepUser)result;
		}
	}

	/**
	 * Removes the dn doanh nghiep user where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @return the dn doanh nghiep user that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DnDoanhNghiepUser removeByUserId(long userId)
		throws NoSuchDnDoanhNghiepUserException, SystemException {
		DnDoanhNghiepUser dnDoanhNghiepUser = findByUserId(userId);

		return remove(dnDoanhNghiepUser);
	}

	/**
	 * Returns the number of dn doanh nghiep users where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching dn doanh nghiep users
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUserId(long userId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USERID;

		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DNDOANHNGHIEPUSER_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

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

	private static final String _FINDER_COLUMN_USERID_USERID_2 = "dnDoanhNghiepUser.userId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DNNGUOILAMTHUTUCUSERID =
		new FinderPath(DnDoanhNghiepUserModelImpl.ENTITY_CACHE_ENABLED,
			DnDoanhNghiepUserModelImpl.FINDER_CACHE_ENABLED,
			DnDoanhNghiepUserImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDnNguoiLamThuTucUserID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DNNGUOILAMTHUTUCUSERID =
		new FinderPath(DnDoanhNghiepUserModelImpl.ENTITY_CACHE_ENABLED,
			DnDoanhNghiepUserModelImpl.FINDER_CACHE_ENABLED,
			DnDoanhNghiepUserImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDnNguoiLamThuTucUserID",
			new String[] { Long.class.getName() },
			DnDoanhNghiepUserModelImpl.NGUOILAMTHUTUCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DNNGUOILAMTHUTUCUSERID = new FinderPath(DnDoanhNghiepUserModelImpl.ENTITY_CACHE_ENABLED,
			DnDoanhNghiepUserModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDnNguoiLamThuTucUserID",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the dn doanh nghiep users where nguoiLamThuTucId = &#63;.
	 *
	 * @param nguoiLamThuTucId the nguoi lam thu tuc ID
	 * @return the matching dn doanh nghiep users
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DnDoanhNghiepUser> findByDnNguoiLamThuTucUserID(
		long nguoiLamThuTucId) throws SystemException {
		return findByDnNguoiLamThuTucUserID(nguoiLamThuTucId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dn doanh nghiep users where nguoiLamThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param nguoiLamThuTucId the nguoi lam thu tuc ID
	 * @param start the lower bound of the range of dn doanh nghiep users
	 * @param end the upper bound of the range of dn doanh nghiep users (not inclusive)
	 * @return the range of matching dn doanh nghiep users
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DnDoanhNghiepUser> findByDnNguoiLamThuTucUserID(
		long nguoiLamThuTucId, int start, int end) throws SystemException {
		return findByDnNguoiLamThuTucUserID(nguoiLamThuTucId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dn doanh nghiep users where nguoiLamThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param nguoiLamThuTucId the nguoi lam thu tuc ID
	 * @param start the lower bound of the range of dn doanh nghiep users
	 * @param end the upper bound of the range of dn doanh nghiep users (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dn doanh nghiep users
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DnDoanhNghiepUser> findByDnNguoiLamThuTucUserID(
		long nguoiLamThuTucId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DNNGUOILAMTHUTUCUSERID;
			finderArgs = new Object[] { nguoiLamThuTucId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DNNGUOILAMTHUTUCUSERID;
			finderArgs = new Object[] {
					nguoiLamThuTucId,
					
					start, end, orderByComparator
				};
		}

		List<DnDoanhNghiepUser> list = (List<DnDoanhNghiepUser>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DnDoanhNghiepUser dnDoanhNghiepUser : list) {
				if ((nguoiLamThuTucId != dnDoanhNghiepUser.getNguoiLamThuTucId())) {
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

			query.append(_SQL_SELECT_DNDOANHNGHIEPUSER_WHERE);

			query.append(_FINDER_COLUMN_DNNGUOILAMTHUTUCUSERID_NGUOILAMTHUTUCID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DnDoanhNghiepUserModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(nguoiLamThuTucId);

				if (!pagination) {
					list = (List<DnDoanhNghiepUser>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DnDoanhNghiepUser>(list);
				}
				else {
					list = (List<DnDoanhNghiepUser>)QueryUtil.list(q,
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
	 * Returns the first dn doanh nghiep user in the ordered set where nguoiLamThuTucId = &#63;.
	 *
	 * @param nguoiLamThuTucId the nguoi lam thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dn doanh nghiep user
	 * @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepUserException if a matching dn doanh nghiep user could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DnDoanhNghiepUser findByDnNguoiLamThuTucUserID_First(
		long nguoiLamThuTucId, OrderByComparator orderByComparator)
		throws NoSuchDnDoanhNghiepUserException, SystemException {
		DnDoanhNghiepUser dnDoanhNghiepUser = fetchByDnNguoiLamThuTucUserID_First(nguoiLamThuTucId,
				orderByComparator);

		if (dnDoanhNghiepUser != null) {
			return dnDoanhNghiepUser;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("nguoiLamThuTucId=");
		msg.append(nguoiLamThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDnDoanhNghiepUserException(msg.toString());
	}

	/**
	 * Returns the first dn doanh nghiep user in the ordered set where nguoiLamThuTucId = &#63;.
	 *
	 * @param nguoiLamThuTucId the nguoi lam thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dn doanh nghiep user, or <code>null</code> if a matching dn doanh nghiep user could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DnDoanhNghiepUser fetchByDnNguoiLamThuTucUserID_First(
		long nguoiLamThuTucId, OrderByComparator orderByComparator)
		throws SystemException {
		List<DnDoanhNghiepUser> list = findByDnNguoiLamThuTucUserID(nguoiLamThuTucId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dn doanh nghiep user in the ordered set where nguoiLamThuTucId = &#63;.
	 *
	 * @param nguoiLamThuTucId the nguoi lam thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dn doanh nghiep user
	 * @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepUserException if a matching dn doanh nghiep user could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DnDoanhNghiepUser findByDnNguoiLamThuTucUserID_Last(
		long nguoiLamThuTucId, OrderByComparator orderByComparator)
		throws NoSuchDnDoanhNghiepUserException, SystemException {
		DnDoanhNghiepUser dnDoanhNghiepUser = fetchByDnNguoiLamThuTucUserID_Last(nguoiLamThuTucId,
				orderByComparator);

		if (dnDoanhNghiepUser != null) {
			return dnDoanhNghiepUser;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("nguoiLamThuTucId=");
		msg.append(nguoiLamThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDnDoanhNghiepUserException(msg.toString());
	}

	/**
	 * Returns the last dn doanh nghiep user in the ordered set where nguoiLamThuTucId = &#63;.
	 *
	 * @param nguoiLamThuTucId the nguoi lam thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dn doanh nghiep user, or <code>null</code> if a matching dn doanh nghiep user could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DnDoanhNghiepUser fetchByDnNguoiLamThuTucUserID_Last(
		long nguoiLamThuTucId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByDnNguoiLamThuTucUserID(nguoiLamThuTucId);

		if (count == 0) {
			return null;
		}

		List<DnDoanhNghiepUser> list = findByDnNguoiLamThuTucUserID(nguoiLamThuTucId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dn doanh nghiep users before and after the current dn doanh nghiep user in the ordered set where nguoiLamThuTucId = &#63;.
	 *
	 * @param id the primary key of the current dn doanh nghiep user
	 * @param nguoiLamThuTucId the nguoi lam thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dn doanh nghiep user
	 * @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepUserException if a dn doanh nghiep user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DnDoanhNghiepUser[] findByDnNguoiLamThuTucUserID_PrevAndNext(
		long id, long nguoiLamThuTucId, OrderByComparator orderByComparator)
		throws NoSuchDnDoanhNghiepUserException, SystemException {
		DnDoanhNghiepUser dnDoanhNghiepUser = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DnDoanhNghiepUser[] array = new DnDoanhNghiepUserImpl[3];

			array[0] = getByDnNguoiLamThuTucUserID_PrevAndNext(session,
					dnDoanhNghiepUser, nguoiLamThuTucId, orderByComparator, true);

			array[1] = dnDoanhNghiepUser;

			array[2] = getByDnNguoiLamThuTucUserID_PrevAndNext(session,
					dnDoanhNghiepUser, nguoiLamThuTucId, orderByComparator,
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

	protected DnDoanhNghiepUser getByDnNguoiLamThuTucUserID_PrevAndNext(
		Session session, DnDoanhNghiepUser dnDoanhNghiepUser,
		long nguoiLamThuTucId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DNDOANHNGHIEPUSER_WHERE);

		query.append(_FINDER_COLUMN_DNNGUOILAMTHUTUCUSERID_NGUOILAMTHUTUCID_2);

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
			query.append(DnDoanhNghiepUserModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(nguoiLamThuTucId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dnDoanhNghiepUser);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DnDoanhNghiepUser> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dn doanh nghiep users where nguoiLamThuTucId = &#63; from the database.
	 *
	 * @param nguoiLamThuTucId the nguoi lam thu tuc ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDnNguoiLamThuTucUserID(long nguoiLamThuTucId)
		throws SystemException {
		for (DnDoanhNghiepUser dnDoanhNghiepUser : findByDnNguoiLamThuTucUserID(
				nguoiLamThuTucId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dnDoanhNghiepUser);
		}
	}

	/**
	 * Returns the number of dn doanh nghiep users where nguoiLamThuTucId = &#63;.
	 *
	 * @param nguoiLamThuTucId the nguoi lam thu tuc ID
	 * @return the number of matching dn doanh nghiep users
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDnNguoiLamThuTucUserID(long nguoiLamThuTucId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DNNGUOILAMTHUTUCUSERID;

		Object[] finderArgs = new Object[] { nguoiLamThuTucId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DNDOANHNGHIEPUSER_WHERE);

			query.append(_FINDER_COLUMN_DNNGUOILAMTHUTUCUSERID_NGUOILAMTHUTUCID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(nguoiLamThuTucId);

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

	private static final String _FINDER_COLUMN_DNNGUOILAMTHUTUCUSERID_NGUOILAMTHUTUCID_2 =
		"dnDoanhNghiepUser.nguoiLamThuTucId = ?";

	public DnDoanhNghiepUserPersistenceImpl() {
		setModelClass(DnDoanhNghiepUser.class);
	}

	/**
	 * Caches the dn doanh nghiep user in the entity cache if it is enabled.
	 *
	 * @param dnDoanhNghiepUser the dn doanh nghiep user
	 */
	@Override
	public void cacheResult(DnDoanhNghiepUser dnDoanhNghiepUser) {
		EntityCacheUtil.putResult(DnDoanhNghiepUserModelImpl.ENTITY_CACHE_ENABLED,
			DnDoanhNghiepUserImpl.class, dnDoanhNghiepUser.getPrimaryKey(),
			dnDoanhNghiepUser);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
			new Object[] { dnDoanhNghiepUser.getUserId() }, dnDoanhNghiepUser);

		dnDoanhNghiepUser.resetOriginalValues();
	}

	/**
	 * Caches the dn doanh nghiep users in the entity cache if it is enabled.
	 *
	 * @param dnDoanhNghiepUsers the dn doanh nghiep users
	 */
	@Override
	public void cacheResult(List<DnDoanhNghiepUser> dnDoanhNghiepUsers) {
		for (DnDoanhNghiepUser dnDoanhNghiepUser : dnDoanhNghiepUsers) {
			if (EntityCacheUtil.getResult(
						DnDoanhNghiepUserModelImpl.ENTITY_CACHE_ENABLED,
						DnDoanhNghiepUserImpl.class,
						dnDoanhNghiepUser.getPrimaryKey()) == null) {
				cacheResult(dnDoanhNghiepUser);
			}
			else {
				dnDoanhNghiepUser.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dn doanh nghiep users.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DnDoanhNghiepUserImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DnDoanhNghiepUserImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dn doanh nghiep user.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DnDoanhNghiepUser dnDoanhNghiepUser) {
		EntityCacheUtil.removeResult(DnDoanhNghiepUserModelImpl.ENTITY_CACHE_ENABLED,
			DnDoanhNghiepUserImpl.class, dnDoanhNghiepUser.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(dnDoanhNghiepUser);
	}

	@Override
	public void clearCache(List<DnDoanhNghiepUser> dnDoanhNghiepUsers) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DnDoanhNghiepUser dnDoanhNghiepUser : dnDoanhNghiepUsers) {
			EntityCacheUtil.removeResult(DnDoanhNghiepUserModelImpl.ENTITY_CACHE_ENABLED,
				DnDoanhNghiepUserImpl.class, dnDoanhNghiepUser.getPrimaryKey());

			clearUniqueFindersCache(dnDoanhNghiepUser);
		}
	}

	protected void cacheUniqueFindersCache(DnDoanhNghiepUser dnDoanhNghiepUser) {
		if (dnDoanhNghiepUser.isNew()) {
			Object[] args = new Object[] { dnDoanhNghiepUser.getUserId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_USERID, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID, args,
				dnDoanhNghiepUser);
		}
		else {
			DnDoanhNghiepUserModelImpl dnDoanhNghiepUserModelImpl = (DnDoanhNghiepUserModelImpl)dnDoanhNghiepUser;

			if ((dnDoanhNghiepUserModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_USERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { dnDoanhNghiepUser.getUserId() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_USERID, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID, args,
					dnDoanhNghiepUser);
			}
		}
	}

	protected void clearUniqueFindersCache(DnDoanhNghiepUser dnDoanhNghiepUser) {
		DnDoanhNghiepUserModelImpl dnDoanhNghiepUserModelImpl = (DnDoanhNghiepUserModelImpl)dnDoanhNghiepUser;

		Object[] args = new Object[] { dnDoanhNghiepUser.getUserId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_USERID, args);

		if ((dnDoanhNghiepUserModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_USERID.getColumnBitmask()) != 0) {
			args = new Object[] { dnDoanhNghiepUserModelImpl.getOriginalUserId() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_USERID, args);
		}
	}

	/**
	 * Creates a new dn doanh nghiep user with the primary key. Does not add the dn doanh nghiep user to the database.
	 *
	 * @param id the primary key for the new dn doanh nghiep user
	 * @return the new dn doanh nghiep user
	 */
	@Override
	public DnDoanhNghiepUser create(long id) {
		DnDoanhNghiepUser dnDoanhNghiepUser = new DnDoanhNghiepUserImpl();

		dnDoanhNghiepUser.setNew(true);
		dnDoanhNghiepUser.setPrimaryKey(id);

		return dnDoanhNghiepUser;
	}

	/**
	 * Removes the dn doanh nghiep user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dn doanh nghiep user
	 * @return the dn doanh nghiep user that was removed
	 * @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepUserException if a dn doanh nghiep user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DnDoanhNghiepUser remove(long id)
		throws NoSuchDnDoanhNghiepUserException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the dn doanh nghiep user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dn doanh nghiep user
	 * @return the dn doanh nghiep user that was removed
	 * @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepUserException if a dn doanh nghiep user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DnDoanhNghiepUser remove(Serializable primaryKey)
		throws NoSuchDnDoanhNghiepUserException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DnDoanhNghiepUser dnDoanhNghiepUser = (DnDoanhNghiepUser)session.get(DnDoanhNghiepUserImpl.class,
					primaryKey);

			if (dnDoanhNghiepUser == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDnDoanhNghiepUserException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dnDoanhNghiepUser);
		}
		catch (NoSuchDnDoanhNghiepUserException nsee) {
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
	protected DnDoanhNghiepUser removeImpl(DnDoanhNghiepUser dnDoanhNghiepUser)
		throws SystemException {
		dnDoanhNghiepUser = toUnwrappedModel(dnDoanhNghiepUser);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dnDoanhNghiepUser)) {
				dnDoanhNghiepUser = (DnDoanhNghiepUser)session.get(DnDoanhNghiepUserImpl.class,
						dnDoanhNghiepUser.getPrimaryKeyObj());
			}

			if (dnDoanhNghiepUser != null) {
				session.delete(dnDoanhNghiepUser);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dnDoanhNghiepUser != null) {
			clearCache(dnDoanhNghiepUser);
		}

		return dnDoanhNghiepUser;
	}

	@Override
	public DnDoanhNghiepUser updateImpl(
		vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser dnDoanhNghiepUser)
		throws SystemException {
		dnDoanhNghiepUser = toUnwrappedModel(dnDoanhNghiepUser);

		boolean isNew = dnDoanhNghiepUser.isNew();

		DnDoanhNghiepUserModelImpl dnDoanhNghiepUserModelImpl = (DnDoanhNghiepUserModelImpl)dnDoanhNghiepUser;

		Session session = null;

		try {
			session = openSession();

			if (dnDoanhNghiepUser.isNew()) {
				session.save(dnDoanhNghiepUser);

				dnDoanhNghiepUser.setNew(false);
			}
			else {
				session.merge(dnDoanhNghiepUser);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DnDoanhNghiepUserModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dnDoanhNghiepUserModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DNNGUOILAMTHUTUCUSERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dnDoanhNghiepUserModelImpl.getOriginalNguoiLamThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DNNGUOILAMTHUTUCUSERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DNNGUOILAMTHUTUCUSERID,
					args);

				args = new Object[] {
						dnDoanhNghiepUserModelImpl.getNguoiLamThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DNNGUOILAMTHUTUCUSERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DNNGUOILAMTHUTUCUSERID,
					args);
			}
		}

		EntityCacheUtil.putResult(DnDoanhNghiepUserModelImpl.ENTITY_CACHE_ENABLED,
			DnDoanhNghiepUserImpl.class, dnDoanhNghiepUser.getPrimaryKey(),
			dnDoanhNghiepUser);

		clearUniqueFindersCache(dnDoanhNghiepUser);
		cacheUniqueFindersCache(dnDoanhNghiepUser);

		return dnDoanhNghiepUser;
	}

	protected DnDoanhNghiepUser toUnwrappedModel(
		DnDoanhNghiepUser dnDoanhNghiepUser) {
		if (dnDoanhNghiepUser instanceof DnDoanhNghiepUserImpl) {
			return dnDoanhNghiepUser;
		}

		DnDoanhNghiepUserImpl dnDoanhNghiepUserImpl = new DnDoanhNghiepUserImpl();

		dnDoanhNghiepUserImpl.setNew(dnDoanhNghiepUser.isNew());
		dnDoanhNghiepUserImpl.setPrimaryKey(dnDoanhNghiepUser.getPrimaryKey());

		dnDoanhNghiepUserImpl.setId(dnDoanhNghiepUser.getId());
		dnDoanhNghiepUserImpl.setNguoiLamThuTucId(dnDoanhNghiepUser.getNguoiLamThuTucId());
		dnDoanhNghiepUserImpl.setUserId(dnDoanhNghiepUser.getUserId());
		dnDoanhNghiepUserImpl.setToChucQuanLy(dnDoanhNghiepUser.getToChucQuanLy());
		dnDoanhNghiepUserImpl.setMaster(dnDoanhNghiepUser.getMaster());
		dnDoanhNghiepUserImpl.setTenTaiKhoan(dnDoanhNghiepUser.getTenTaiKhoan());
		dnDoanhNghiepUserImpl.setTenNguoiDung(dnDoanhNghiepUser.getTenNguoiDung());
		dnDoanhNghiepUserImpl.setTinhTrangHoatDong(dnDoanhNghiepUser.getTinhTrangHoatDong());
		dnDoanhNghiepUserImpl.setDienThoai(dnDoanhNghiepUser.getDienThoai());
		dnDoanhNghiepUserImpl.setNgayTaoTaiKhoan(dnDoanhNghiepUser.getNgayTaoTaiKhoan());
		dnDoanhNghiepUserImpl.setNgayMoTaiKhoan(dnDoanhNghiepUser.getNgayMoTaiKhoan());

		return dnDoanhNghiepUserImpl;
	}

	/**
	 * Returns the dn doanh nghiep user with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dn doanh nghiep user
	 * @return the dn doanh nghiep user
	 * @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepUserException if a dn doanh nghiep user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DnDoanhNghiepUser findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDnDoanhNghiepUserException, SystemException {
		DnDoanhNghiepUser dnDoanhNghiepUser = fetchByPrimaryKey(primaryKey);

		if (dnDoanhNghiepUser == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDnDoanhNghiepUserException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dnDoanhNghiepUser;
	}

	/**
	 * Returns the dn doanh nghiep user with the primary key or throws a {@link vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepUserException} if it could not be found.
	 *
	 * @param id the primary key of the dn doanh nghiep user
	 * @return the dn doanh nghiep user
	 * @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepUserException if a dn doanh nghiep user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DnDoanhNghiepUser findByPrimaryKey(long id)
		throws NoSuchDnDoanhNghiepUserException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dn doanh nghiep user with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dn doanh nghiep user
	 * @return the dn doanh nghiep user, or <code>null</code> if a dn doanh nghiep user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DnDoanhNghiepUser fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DnDoanhNghiepUser dnDoanhNghiepUser = (DnDoanhNghiepUser)EntityCacheUtil.getResult(DnDoanhNghiepUserModelImpl.ENTITY_CACHE_ENABLED,
				DnDoanhNghiepUserImpl.class, primaryKey);

		if (dnDoanhNghiepUser == _nullDnDoanhNghiepUser) {
			return null;
		}

		if (dnDoanhNghiepUser == null) {
			Session session = null;

			try {
				session = openSession();

				dnDoanhNghiepUser = (DnDoanhNghiepUser)session.get(DnDoanhNghiepUserImpl.class,
						primaryKey);

				if (dnDoanhNghiepUser != null) {
					cacheResult(dnDoanhNghiepUser);
				}
				else {
					EntityCacheUtil.putResult(DnDoanhNghiepUserModelImpl.ENTITY_CACHE_ENABLED,
						DnDoanhNghiepUserImpl.class, primaryKey,
						_nullDnDoanhNghiepUser);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DnDoanhNghiepUserModelImpl.ENTITY_CACHE_ENABLED,
					DnDoanhNghiepUserImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dnDoanhNghiepUser;
	}

	/**
	 * Returns the dn doanh nghiep user with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dn doanh nghiep user
	 * @return the dn doanh nghiep user, or <code>null</code> if a dn doanh nghiep user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DnDoanhNghiepUser fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the dn doanh nghiep users.
	 *
	 * @return the dn doanh nghiep users
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DnDoanhNghiepUser> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dn doanh nghiep users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dn doanh nghiep users
	 * @param end the upper bound of the range of dn doanh nghiep users (not inclusive)
	 * @return the range of dn doanh nghiep users
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DnDoanhNghiepUser> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dn doanh nghiep users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dn doanh nghiep users
	 * @param end the upper bound of the range of dn doanh nghiep users (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dn doanh nghiep users
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DnDoanhNghiepUser> findAll(int start, int end,
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

		List<DnDoanhNghiepUser> list = (List<DnDoanhNghiepUser>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DNDOANHNGHIEPUSER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DNDOANHNGHIEPUSER;

				if (pagination) {
					sql = sql.concat(DnDoanhNghiepUserModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DnDoanhNghiepUser>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DnDoanhNghiepUser>(list);
				}
				else {
					list = (List<DnDoanhNghiepUser>)QueryUtil.list(q,
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
	 * Removes all the dn doanh nghiep users from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DnDoanhNghiepUser dnDoanhNghiepUser : findAll()) {
			remove(dnDoanhNghiepUser);
		}
	}

	/**
	 * Returns the number of dn doanh nghiep users.
	 *
	 * @return the number of dn doanh nghiep users
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

				Query q = session.createQuery(_SQL_COUNT_DNDOANHNGHIEPUSER);

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
	 * Initializes the dn doanh nghiep user persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DnDoanhNghiepUser>> listenersList = new ArrayList<ModelListener<DnDoanhNghiepUser>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DnDoanhNghiepUser>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DnDoanhNghiepUserImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DNDOANHNGHIEPUSER = "SELECT dnDoanhNghiepUser FROM DnDoanhNghiepUser dnDoanhNghiepUser";
	private static final String _SQL_SELECT_DNDOANHNGHIEPUSER_WHERE = "SELECT dnDoanhNghiepUser FROM DnDoanhNghiepUser dnDoanhNghiepUser WHERE ";
	private static final String _SQL_COUNT_DNDOANHNGHIEPUSER = "SELECT COUNT(dnDoanhNghiepUser) FROM DnDoanhNghiepUser dnDoanhNghiepUser";
	private static final String _SQL_COUNT_DNDOANHNGHIEPUSER_WHERE = "SELECT COUNT(dnDoanhNghiepUser) FROM DnDoanhNghiepUser dnDoanhNghiepUser WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dnDoanhNghiepUser.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DnDoanhNghiepUser exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DnDoanhNghiepUser exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DnDoanhNghiepUserPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"nguoiLamThuTucId", "userId", "toChucQuanLy", "master",
				"tenTaiKhoan", "tenNguoiDung", "tinhTrangHoatDong", "dienThoai",
				"ngayTaoTaiKhoan", "ngayMoTaiKhoan"
			});
	private static DnDoanhNghiepUser _nullDnDoanhNghiepUser = new DnDoanhNghiepUserImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DnDoanhNghiepUser> toCacheModel() {
				return _nullDnDoanhNghiepUserCacheModel;
			}
		};

	private static CacheModel<DnDoanhNghiepUser> _nullDnDoanhNghiepUserCacheModel =
		new CacheModel<DnDoanhNghiepUser>() {
			@Override
			public DnDoanhNghiepUser toEntityModel() {
				return _nullDnDoanhNghiepUser;
			}
		};
}