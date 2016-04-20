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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException;
import vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep;
import vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepImpl;
import vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dn doanh nghiep service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DnDoanhNghiepPersistence
 * @see DnDoanhNghiepUtil
 * @generated
 */
public class DnDoanhNghiepPersistenceImpl extends BasePersistenceImpl<DnDoanhNghiep>
	implements DnDoanhNghiepPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DnDoanhNghiepUtil} to access the dn doanh nghiep persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DnDoanhNghiepImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DnDoanhNghiepModelImpl.ENTITY_CACHE_ENABLED,
			DnDoanhNghiepModelImpl.FINDER_CACHE_ENABLED,
			DnDoanhNghiepImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DnDoanhNghiepModelImpl.ENTITY_CACHE_ENABLED,
			DnDoanhNghiepModelImpl.FINDER_CACHE_ENABLED,
			DnDoanhNghiepImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DnDoanhNghiepModelImpl.ENTITY_CACHE_ENABLED,
			DnDoanhNghiepModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_DNNGUOILAMTHUTUCID = new FinderPath(DnDoanhNghiepModelImpl.ENTITY_CACHE_ENABLED,
			DnDoanhNghiepModelImpl.FINDER_CACHE_ENABLED,
			DnDoanhNghiepImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByDnNguoiLamThuTucID", new String[] { Long.class.getName() },
			DnDoanhNghiepModelImpl.ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DNNGUOILAMTHUTUCID = new FinderPath(DnDoanhNghiepModelImpl.ENTITY_CACHE_ENABLED,
			DnDoanhNghiepModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDnNguoiLamThuTucID", new String[] { Long.class.getName() });

	/**
	 * Returns the dn doanh nghiep where id = &#63; or throws a {@link vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException} if it could not be found.
	 *
	 * @param id the ID
	 * @return the matching dn doanh nghiep
	 * @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException if a matching dn doanh nghiep could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DnDoanhNghiep findByDnNguoiLamThuTucID(long id)
		throws NoSuchDnDoanhNghiepException, SystemException {
		DnDoanhNghiep dnDoanhNghiep = fetchByDnNguoiLamThuTucID(id);

		if (dnDoanhNghiep == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("id=");
			msg.append(id);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDnDoanhNghiepException(msg.toString());
		}

		return dnDoanhNghiep;
	}

	/**
	 * Returns the dn doanh nghiep where id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param id the ID
	 * @return the matching dn doanh nghiep, or <code>null</code> if a matching dn doanh nghiep could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DnDoanhNghiep fetchByDnNguoiLamThuTucID(long id)
		throws SystemException {
		return fetchByDnNguoiLamThuTucID(id, true);
	}

	/**
	 * Returns the dn doanh nghiep where id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param id the ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dn doanh nghiep, or <code>null</code> if a matching dn doanh nghiep could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DnDoanhNghiep fetchByDnNguoiLamThuTucID(long id,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { id };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_DNNGUOILAMTHUTUCID,
					finderArgs, this);
		}

		if (result instanceof DnDoanhNghiep) {
			DnDoanhNghiep dnDoanhNghiep = (DnDoanhNghiep)result;

			if ((id != dnDoanhNghiep.getId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_DNDOANHNGHIEP_WHERE);

			query.append(_FINDER_COLUMN_DNNGUOILAMTHUTUCID_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(id);

				List<DnDoanhNghiep> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DNNGUOILAMTHUTUCID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DnDoanhNghiepPersistenceImpl.fetchByDnNguoiLamThuTucID(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DnDoanhNghiep dnDoanhNghiep = list.get(0);

					result = dnDoanhNghiep;

					cacheResult(dnDoanhNghiep);

					if ((dnDoanhNghiep.getId() != id)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DNNGUOILAMTHUTUCID,
							finderArgs, dnDoanhNghiep);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DNNGUOILAMTHUTUCID,
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
			return (DnDoanhNghiep)result;
		}
	}

	/**
	 * Removes the dn doanh nghiep where id = &#63; from the database.
	 *
	 * @param id the ID
	 * @return the dn doanh nghiep that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DnDoanhNghiep removeByDnNguoiLamThuTucID(long id)
		throws NoSuchDnDoanhNghiepException, SystemException {
		DnDoanhNghiep dnDoanhNghiep = findByDnNguoiLamThuTucID(id);

		return remove(dnDoanhNghiep);
	}

	/**
	 * Returns the number of dn doanh nghieps where id = &#63;.
	 *
	 * @param id the ID
	 * @return the number of matching dn doanh nghieps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDnNguoiLamThuTucID(long id) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DNNGUOILAMTHUTUCID;

		Object[] finderArgs = new Object[] { id };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DNDOANHNGHIEP_WHERE);

			query.append(_FINDER_COLUMN_DNNGUOILAMTHUTUCID_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(id);

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

	private static final String _FINDER_COLUMN_DNNGUOILAMTHUTUCID_ID_2 = "dnDoanhNghiep.id = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LOAINGUOILAMTHUTUC =
		new FinderPath(DnDoanhNghiepModelImpl.ENTITY_CACHE_ENABLED,
			DnDoanhNghiepModelImpl.FINDER_CACHE_ENABLED,
			DnDoanhNghiepImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByloaiNguoiLamThuTuc",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOAINGUOILAMTHUTUC =
		new FinderPath(DnDoanhNghiepModelImpl.ENTITY_CACHE_ENABLED,
			DnDoanhNghiepModelImpl.FINDER_CACHE_ENABLED,
			DnDoanhNghiepImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByloaiNguoiLamThuTuc",
			new String[] { String.class.getName() },
			DnDoanhNghiepModelImpl.LOAINGUOILAMTHUTUC_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LOAINGUOILAMTHUTUC = new FinderPath(DnDoanhNghiepModelImpl.ENTITY_CACHE_ENABLED,
			DnDoanhNghiepModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByloaiNguoiLamThuTuc", new String[] { String.class.getName() });

	/**
	 * Returns all the dn doanh nghieps where loaiNguoiLamThuTuc = &#63;.
	 *
	 * @param loaiNguoiLamThuTuc the loai nguoi lam thu tuc
	 * @return the matching dn doanh nghieps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DnDoanhNghiep> findByloaiNguoiLamThuTuc(
		String loaiNguoiLamThuTuc) throws SystemException {
		return findByloaiNguoiLamThuTuc(loaiNguoiLamThuTuc, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dn doanh nghieps where loaiNguoiLamThuTuc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param loaiNguoiLamThuTuc the loai nguoi lam thu tuc
	 * @param start the lower bound of the range of dn doanh nghieps
	 * @param end the upper bound of the range of dn doanh nghieps (not inclusive)
	 * @return the range of matching dn doanh nghieps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DnDoanhNghiep> findByloaiNguoiLamThuTuc(
		String loaiNguoiLamThuTuc, int start, int end)
		throws SystemException {
		return findByloaiNguoiLamThuTuc(loaiNguoiLamThuTuc, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dn doanh nghieps where loaiNguoiLamThuTuc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param loaiNguoiLamThuTuc the loai nguoi lam thu tuc
	 * @param start the lower bound of the range of dn doanh nghieps
	 * @param end the upper bound of the range of dn doanh nghieps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dn doanh nghieps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DnDoanhNghiep> findByloaiNguoiLamThuTuc(
		String loaiNguoiLamThuTuc, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOAINGUOILAMTHUTUC;
			finderArgs = new Object[] { loaiNguoiLamThuTuc };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LOAINGUOILAMTHUTUC;
			finderArgs = new Object[] {
					loaiNguoiLamThuTuc,
					
					start, end, orderByComparator
				};
		}

		List<DnDoanhNghiep> list = (List<DnDoanhNghiep>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DnDoanhNghiep dnDoanhNghiep : list) {
				if (!Validator.equals(loaiNguoiLamThuTuc,
							dnDoanhNghiep.getLoaiNguoiLamThuTuc())) {
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

			query.append(_SQL_SELECT_DNDOANHNGHIEP_WHERE);

			boolean bindLoaiNguoiLamThuTuc = false;

			if (loaiNguoiLamThuTuc == null) {
				query.append(_FINDER_COLUMN_LOAINGUOILAMTHUTUC_LOAINGUOILAMTHUTUC_1);
			}
			else if (loaiNguoiLamThuTuc.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LOAINGUOILAMTHUTUC_LOAINGUOILAMTHUTUC_3);
			}
			else {
				bindLoaiNguoiLamThuTuc = true;

				query.append(_FINDER_COLUMN_LOAINGUOILAMTHUTUC_LOAINGUOILAMTHUTUC_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DnDoanhNghiepModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindLoaiNguoiLamThuTuc) {
					qPos.add(loaiNguoiLamThuTuc);
				}

				if (!pagination) {
					list = (List<DnDoanhNghiep>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DnDoanhNghiep>(list);
				}
				else {
					list = (List<DnDoanhNghiep>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dn doanh nghiep in the ordered set where loaiNguoiLamThuTuc = &#63;.
	 *
	 * @param loaiNguoiLamThuTuc the loai nguoi lam thu tuc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dn doanh nghiep
	 * @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException if a matching dn doanh nghiep could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DnDoanhNghiep findByloaiNguoiLamThuTuc_First(
		String loaiNguoiLamThuTuc, OrderByComparator orderByComparator)
		throws NoSuchDnDoanhNghiepException, SystemException {
		DnDoanhNghiep dnDoanhNghiep = fetchByloaiNguoiLamThuTuc_First(loaiNguoiLamThuTuc,
				orderByComparator);

		if (dnDoanhNghiep != null) {
			return dnDoanhNghiep;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("loaiNguoiLamThuTuc=");
		msg.append(loaiNguoiLamThuTuc);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDnDoanhNghiepException(msg.toString());
	}

	/**
	 * Returns the first dn doanh nghiep in the ordered set where loaiNguoiLamThuTuc = &#63;.
	 *
	 * @param loaiNguoiLamThuTuc the loai nguoi lam thu tuc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dn doanh nghiep, or <code>null</code> if a matching dn doanh nghiep could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DnDoanhNghiep fetchByloaiNguoiLamThuTuc_First(
		String loaiNguoiLamThuTuc, OrderByComparator orderByComparator)
		throws SystemException {
		List<DnDoanhNghiep> list = findByloaiNguoiLamThuTuc(loaiNguoiLamThuTuc,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dn doanh nghiep in the ordered set where loaiNguoiLamThuTuc = &#63;.
	 *
	 * @param loaiNguoiLamThuTuc the loai nguoi lam thu tuc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dn doanh nghiep
	 * @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException if a matching dn doanh nghiep could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DnDoanhNghiep findByloaiNguoiLamThuTuc_Last(
		String loaiNguoiLamThuTuc, OrderByComparator orderByComparator)
		throws NoSuchDnDoanhNghiepException, SystemException {
		DnDoanhNghiep dnDoanhNghiep = fetchByloaiNguoiLamThuTuc_Last(loaiNguoiLamThuTuc,
				orderByComparator);

		if (dnDoanhNghiep != null) {
			return dnDoanhNghiep;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("loaiNguoiLamThuTuc=");
		msg.append(loaiNguoiLamThuTuc);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDnDoanhNghiepException(msg.toString());
	}

	/**
	 * Returns the last dn doanh nghiep in the ordered set where loaiNguoiLamThuTuc = &#63;.
	 *
	 * @param loaiNguoiLamThuTuc the loai nguoi lam thu tuc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dn doanh nghiep, or <code>null</code> if a matching dn doanh nghiep could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DnDoanhNghiep fetchByloaiNguoiLamThuTuc_Last(
		String loaiNguoiLamThuTuc, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByloaiNguoiLamThuTuc(loaiNguoiLamThuTuc);

		if (count == 0) {
			return null;
		}

		List<DnDoanhNghiep> list = findByloaiNguoiLamThuTuc(loaiNguoiLamThuTuc,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dn doanh nghieps before and after the current dn doanh nghiep in the ordered set where loaiNguoiLamThuTuc = &#63;.
	 *
	 * @param id the primary key of the current dn doanh nghiep
	 * @param loaiNguoiLamThuTuc the loai nguoi lam thu tuc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dn doanh nghiep
	 * @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException if a dn doanh nghiep with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DnDoanhNghiep[] findByloaiNguoiLamThuTuc_PrevAndNext(long id,
		String loaiNguoiLamThuTuc, OrderByComparator orderByComparator)
		throws NoSuchDnDoanhNghiepException, SystemException {
		DnDoanhNghiep dnDoanhNghiep = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DnDoanhNghiep[] array = new DnDoanhNghiepImpl[3];

			array[0] = getByloaiNguoiLamThuTuc_PrevAndNext(session,
					dnDoanhNghiep, loaiNguoiLamThuTuc, orderByComparator, true);

			array[1] = dnDoanhNghiep;

			array[2] = getByloaiNguoiLamThuTuc_PrevAndNext(session,
					dnDoanhNghiep, loaiNguoiLamThuTuc, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DnDoanhNghiep getByloaiNguoiLamThuTuc_PrevAndNext(
		Session session, DnDoanhNghiep dnDoanhNghiep,
		String loaiNguoiLamThuTuc, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DNDOANHNGHIEP_WHERE);

		boolean bindLoaiNguoiLamThuTuc = false;

		if (loaiNguoiLamThuTuc == null) {
			query.append(_FINDER_COLUMN_LOAINGUOILAMTHUTUC_LOAINGUOILAMTHUTUC_1);
		}
		else if (loaiNguoiLamThuTuc.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_LOAINGUOILAMTHUTUC_LOAINGUOILAMTHUTUC_3);
		}
		else {
			bindLoaiNguoiLamThuTuc = true;

			query.append(_FINDER_COLUMN_LOAINGUOILAMTHUTUC_LOAINGUOILAMTHUTUC_2);
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
			query.append(DnDoanhNghiepModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindLoaiNguoiLamThuTuc) {
			qPos.add(loaiNguoiLamThuTuc);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dnDoanhNghiep);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DnDoanhNghiep> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dn doanh nghieps where loaiNguoiLamThuTuc = &#63; from the database.
	 *
	 * @param loaiNguoiLamThuTuc the loai nguoi lam thu tuc
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByloaiNguoiLamThuTuc(String loaiNguoiLamThuTuc)
		throws SystemException {
		for (DnDoanhNghiep dnDoanhNghiep : findByloaiNguoiLamThuTuc(
				loaiNguoiLamThuTuc, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dnDoanhNghiep);
		}
	}

	/**
	 * Returns the number of dn doanh nghieps where loaiNguoiLamThuTuc = &#63;.
	 *
	 * @param loaiNguoiLamThuTuc the loai nguoi lam thu tuc
	 * @return the number of matching dn doanh nghieps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByloaiNguoiLamThuTuc(String loaiNguoiLamThuTuc)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LOAINGUOILAMTHUTUC;

		Object[] finderArgs = new Object[] { loaiNguoiLamThuTuc };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DNDOANHNGHIEP_WHERE);

			boolean bindLoaiNguoiLamThuTuc = false;

			if (loaiNguoiLamThuTuc == null) {
				query.append(_FINDER_COLUMN_LOAINGUOILAMTHUTUC_LOAINGUOILAMTHUTUC_1);
			}
			else if (loaiNguoiLamThuTuc.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LOAINGUOILAMTHUTUC_LOAINGUOILAMTHUTUC_3);
			}
			else {
				bindLoaiNguoiLamThuTuc = true;

				query.append(_FINDER_COLUMN_LOAINGUOILAMTHUTUC_LOAINGUOILAMTHUTUC_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindLoaiNguoiLamThuTuc) {
					qPos.add(loaiNguoiLamThuTuc);
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

	private static final String _FINDER_COLUMN_LOAINGUOILAMTHUTUC_LOAINGUOILAMTHUTUC_1 =
		"dnDoanhNghiep.loaiNguoiLamThuTuc IS NULL";
	private static final String _FINDER_COLUMN_LOAINGUOILAMTHUTUC_LOAINGUOILAMTHUTUC_2 =
		"dnDoanhNghiep.loaiNguoiLamThuTuc = ?";
	private static final String _FINDER_COLUMN_LOAINGUOILAMTHUTUC_LOAINGUOILAMTHUTUC_3 =
		"(dnDoanhNghiep.loaiNguoiLamThuTuc IS NULL OR dnDoanhNghiep.loaiNguoiLamThuTuc = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_EMAIL = new FinderPath(DnDoanhNghiepModelImpl.ENTITY_CACHE_ENABLED,
			DnDoanhNghiepModelImpl.FINDER_CACHE_ENABLED,
			DnDoanhNghiepImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByEmail",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMAIL = new FinderPath(DnDoanhNghiepModelImpl.ENTITY_CACHE_ENABLED,
			DnDoanhNghiepModelImpl.FINDER_CACHE_ENABLED,
			DnDoanhNghiepImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByEmail", new String[] { String.class.getName() },
			DnDoanhNghiepModelImpl.EMAIL_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_EMAIL = new FinderPath(DnDoanhNghiepModelImpl.ENTITY_CACHE_ENABLED,
			DnDoanhNghiepModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByEmail",
			new String[] { String.class.getName() });

	/**
	 * Returns all the dn doanh nghieps where email = &#63;.
	 *
	 * @param email the email
	 * @return the matching dn doanh nghieps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DnDoanhNghiep> findByEmail(String email)
		throws SystemException {
		return findByEmail(email, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dn doanh nghieps where email = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param email the email
	 * @param start the lower bound of the range of dn doanh nghieps
	 * @param end the upper bound of the range of dn doanh nghieps (not inclusive)
	 * @return the range of matching dn doanh nghieps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DnDoanhNghiep> findByEmail(String email, int start, int end)
		throws SystemException {
		return findByEmail(email, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dn doanh nghieps where email = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param email the email
	 * @param start the lower bound of the range of dn doanh nghieps
	 * @param end the upper bound of the range of dn doanh nghieps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dn doanh nghieps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DnDoanhNghiep> findByEmail(String email, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMAIL;
			finderArgs = new Object[] { email };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_EMAIL;
			finderArgs = new Object[] { email, start, end, orderByComparator };
		}

		List<DnDoanhNghiep> list = (List<DnDoanhNghiep>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DnDoanhNghiep dnDoanhNghiep : list) {
				if (!Validator.equals(email, dnDoanhNghiep.getEmail())) {
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

			query.append(_SQL_SELECT_DNDOANHNGHIEP_WHERE);

			boolean bindEmail = false;

			if (email == null) {
				query.append(_FINDER_COLUMN_EMAIL_EMAIL_1);
			}
			else if (email.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EMAIL_EMAIL_3);
			}
			else {
				bindEmail = true;

				query.append(_FINDER_COLUMN_EMAIL_EMAIL_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DnDoanhNghiepModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEmail) {
					qPos.add(email);
				}

				if (!pagination) {
					list = (List<DnDoanhNghiep>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DnDoanhNghiep>(list);
				}
				else {
					list = (List<DnDoanhNghiep>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dn doanh nghiep in the ordered set where email = &#63;.
	 *
	 * @param email the email
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dn doanh nghiep
	 * @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException if a matching dn doanh nghiep could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DnDoanhNghiep findByEmail_First(String email,
		OrderByComparator orderByComparator)
		throws NoSuchDnDoanhNghiepException, SystemException {
		DnDoanhNghiep dnDoanhNghiep = fetchByEmail_First(email,
				orderByComparator);

		if (dnDoanhNghiep != null) {
			return dnDoanhNghiep;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("email=");
		msg.append(email);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDnDoanhNghiepException(msg.toString());
	}

	/**
	 * Returns the first dn doanh nghiep in the ordered set where email = &#63;.
	 *
	 * @param email the email
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dn doanh nghiep, or <code>null</code> if a matching dn doanh nghiep could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DnDoanhNghiep fetchByEmail_First(String email,
		OrderByComparator orderByComparator) throws SystemException {
		List<DnDoanhNghiep> list = findByEmail(email, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dn doanh nghiep in the ordered set where email = &#63;.
	 *
	 * @param email the email
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dn doanh nghiep
	 * @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException if a matching dn doanh nghiep could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DnDoanhNghiep findByEmail_Last(String email,
		OrderByComparator orderByComparator)
		throws NoSuchDnDoanhNghiepException, SystemException {
		DnDoanhNghiep dnDoanhNghiep = fetchByEmail_Last(email, orderByComparator);

		if (dnDoanhNghiep != null) {
			return dnDoanhNghiep;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("email=");
		msg.append(email);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDnDoanhNghiepException(msg.toString());
	}

	/**
	 * Returns the last dn doanh nghiep in the ordered set where email = &#63;.
	 *
	 * @param email the email
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dn doanh nghiep, or <code>null</code> if a matching dn doanh nghiep could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DnDoanhNghiep fetchByEmail_Last(String email,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByEmail(email);

		if (count == 0) {
			return null;
		}

		List<DnDoanhNghiep> list = findByEmail(email, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dn doanh nghieps before and after the current dn doanh nghiep in the ordered set where email = &#63;.
	 *
	 * @param id the primary key of the current dn doanh nghiep
	 * @param email the email
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dn doanh nghiep
	 * @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException if a dn doanh nghiep with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DnDoanhNghiep[] findByEmail_PrevAndNext(long id, String email,
		OrderByComparator orderByComparator)
		throws NoSuchDnDoanhNghiepException, SystemException {
		DnDoanhNghiep dnDoanhNghiep = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DnDoanhNghiep[] array = new DnDoanhNghiepImpl[3];

			array[0] = getByEmail_PrevAndNext(session, dnDoanhNghiep, email,
					orderByComparator, true);

			array[1] = dnDoanhNghiep;

			array[2] = getByEmail_PrevAndNext(session, dnDoanhNghiep, email,
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

	protected DnDoanhNghiep getByEmail_PrevAndNext(Session session,
		DnDoanhNghiep dnDoanhNghiep, String email,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DNDOANHNGHIEP_WHERE);

		boolean bindEmail = false;

		if (email == null) {
			query.append(_FINDER_COLUMN_EMAIL_EMAIL_1);
		}
		else if (email.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_EMAIL_EMAIL_3);
		}
		else {
			bindEmail = true;

			query.append(_FINDER_COLUMN_EMAIL_EMAIL_2);
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
			query.append(DnDoanhNghiepModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindEmail) {
			qPos.add(email);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dnDoanhNghiep);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DnDoanhNghiep> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dn doanh nghieps where email = &#63; from the database.
	 *
	 * @param email the email
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByEmail(String email) throws SystemException {
		for (DnDoanhNghiep dnDoanhNghiep : findByEmail(email,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dnDoanhNghiep);
		}
	}

	/**
	 * Returns the number of dn doanh nghieps where email = &#63;.
	 *
	 * @param email the email
	 * @return the number of matching dn doanh nghieps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByEmail(String email) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_EMAIL;

		Object[] finderArgs = new Object[] { email };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DNDOANHNGHIEP_WHERE);

			boolean bindEmail = false;

			if (email == null) {
				query.append(_FINDER_COLUMN_EMAIL_EMAIL_1);
			}
			else if (email.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EMAIL_EMAIL_3);
			}
			else {
				bindEmail = true;

				query.append(_FINDER_COLUMN_EMAIL_EMAIL_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEmail) {
					qPos.add(email);
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

	private static final String _FINDER_COLUMN_EMAIL_EMAIL_1 = "dnDoanhNghiep.email IS NULL";
	private static final String _FINDER_COLUMN_EMAIL_EMAIL_2 = "dnDoanhNghiep.email = ?";
	private static final String _FINDER_COLUMN_EMAIL_EMAIL_3 = "(dnDoanhNghiep.email IS NULL OR dnDoanhNghiep.email = '')";

	public DnDoanhNghiepPersistenceImpl() {
		setModelClass(DnDoanhNghiep.class);
	}

	/**
	 * Caches the dn doanh nghiep in the entity cache if it is enabled.
	 *
	 * @param dnDoanhNghiep the dn doanh nghiep
	 */
	@Override
	public void cacheResult(DnDoanhNghiep dnDoanhNghiep) {
		EntityCacheUtil.putResult(DnDoanhNghiepModelImpl.ENTITY_CACHE_ENABLED,
			DnDoanhNghiepImpl.class, dnDoanhNghiep.getPrimaryKey(),
			dnDoanhNghiep);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DNNGUOILAMTHUTUCID,
			new Object[] { dnDoanhNghiep.getId() }, dnDoanhNghiep);

		dnDoanhNghiep.resetOriginalValues();
	}

	/**
	 * Caches the dn doanh nghieps in the entity cache if it is enabled.
	 *
	 * @param dnDoanhNghieps the dn doanh nghieps
	 */
	@Override
	public void cacheResult(List<DnDoanhNghiep> dnDoanhNghieps) {
		for (DnDoanhNghiep dnDoanhNghiep : dnDoanhNghieps) {
			if (EntityCacheUtil.getResult(
						DnDoanhNghiepModelImpl.ENTITY_CACHE_ENABLED,
						DnDoanhNghiepImpl.class, dnDoanhNghiep.getPrimaryKey()) == null) {
				cacheResult(dnDoanhNghiep);
			}
			else {
				dnDoanhNghiep.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dn doanh nghieps.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DnDoanhNghiepImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DnDoanhNghiepImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dn doanh nghiep.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DnDoanhNghiep dnDoanhNghiep) {
		EntityCacheUtil.removeResult(DnDoanhNghiepModelImpl.ENTITY_CACHE_ENABLED,
			DnDoanhNghiepImpl.class, dnDoanhNghiep.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(dnDoanhNghiep);
	}

	@Override
	public void clearCache(List<DnDoanhNghiep> dnDoanhNghieps) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DnDoanhNghiep dnDoanhNghiep : dnDoanhNghieps) {
			EntityCacheUtil.removeResult(DnDoanhNghiepModelImpl.ENTITY_CACHE_ENABLED,
				DnDoanhNghiepImpl.class, dnDoanhNghiep.getPrimaryKey());

			clearUniqueFindersCache(dnDoanhNghiep);
		}
	}

	protected void cacheUniqueFindersCache(DnDoanhNghiep dnDoanhNghiep) {
		if (dnDoanhNghiep.isNew()) {
			Object[] args = new Object[] { dnDoanhNghiep.getId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DNNGUOILAMTHUTUCID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DNNGUOILAMTHUTUCID,
				args, dnDoanhNghiep);
		}
		else {
			DnDoanhNghiepModelImpl dnDoanhNghiepModelImpl = (DnDoanhNghiepModelImpl)dnDoanhNghiep;

			if ((dnDoanhNghiepModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_DNNGUOILAMTHUTUCID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { dnDoanhNghiep.getId() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DNNGUOILAMTHUTUCID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DNNGUOILAMTHUTUCID,
					args, dnDoanhNghiep);
			}
		}
	}

	protected void clearUniqueFindersCache(DnDoanhNghiep dnDoanhNghiep) {
		DnDoanhNghiepModelImpl dnDoanhNghiepModelImpl = (DnDoanhNghiepModelImpl)dnDoanhNghiep;

		Object[] args = new Object[] { dnDoanhNghiep.getId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DNNGUOILAMTHUTUCID,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DNNGUOILAMTHUTUCID,
			args);

		if ((dnDoanhNghiepModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_DNNGUOILAMTHUTUCID.getColumnBitmask()) != 0) {
			args = new Object[] { dnDoanhNghiepModelImpl.getOriginalId() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DNNGUOILAMTHUTUCID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DNNGUOILAMTHUTUCID,
				args);
		}
	}

	/**
	 * Creates a new dn doanh nghiep with the primary key. Does not add the dn doanh nghiep to the database.
	 *
	 * @param id the primary key for the new dn doanh nghiep
	 * @return the new dn doanh nghiep
	 */
	@Override
	public DnDoanhNghiep create(long id) {
		DnDoanhNghiep dnDoanhNghiep = new DnDoanhNghiepImpl();

		dnDoanhNghiep.setNew(true);
		dnDoanhNghiep.setPrimaryKey(id);

		return dnDoanhNghiep;
	}

	/**
	 * Removes the dn doanh nghiep with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dn doanh nghiep
	 * @return the dn doanh nghiep that was removed
	 * @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException if a dn doanh nghiep with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DnDoanhNghiep remove(long id)
		throws NoSuchDnDoanhNghiepException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the dn doanh nghiep with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dn doanh nghiep
	 * @return the dn doanh nghiep that was removed
	 * @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException if a dn doanh nghiep with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DnDoanhNghiep remove(Serializable primaryKey)
		throws NoSuchDnDoanhNghiepException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DnDoanhNghiep dnDoanhNghiep = (DnDoanhNghiep)session.get(DnDoanhNghiepImpl.class,
					primaryKey);

			if (dnDoanhNghiep == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDnDoanhNghiepException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dnDoanhNghiep);
		}
		catch (NoSuchDnDoanhNghiepException nsee) {
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
	protected DnDoanhNghiep removeImpl(DnDoanhNghiep dnDoanhNghiep)
		throws SystemException {
		dnDoanhNghiep = toUnwrappedModel(dnDoanhNghiep);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dnDoanhNghiep)) {
				dnDoanhNghiep = (DnDoanhNghiep)session.get(DnDoanhNghiepImpl.class,
						dnDoanhNghiep.getPrimaryKeyObj());
			}

			if (dnDoanhNghiep != null) {
				session.delete(dnDoanhNghiep);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dnDoanhNghiep != null) {
			clearCache(dnDoanhNghiep);
		}

		return dnDoanhNghiep;
	}

	@Override
	public DnDoanhNghiep updateImpl(
		vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep dnDoanhNghiep)
		throws SystemException {
		dnDoanhNghiep = toUnwrappedModel(dnDoanhNghiep);

		boolean isNew = dnDoanhNghiep.isNew();

		DnDoanhNghiepModelImpl dnDoanhNghiepModelImpl = (DnDoanhNghiepModelImpl)dnDoanhNghiep;

		Session session = null;

		try {
			session = openSession();

			if (dnDoanhNghiep.isNew()) {
				session.save(dnDoanhNghiep);

				dnDoanhNghiep.setNew(false);
			}
			else {
				session.merge(dnDoanhNghiep);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DnDoanhNghiepModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dnDoanhNghiepModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOAINGUOILAMTHUTUC.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dnDoanhNghiepModelImpl.getOriginalLoaiNguoiLamThuTuc()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LOAINGUOILAMTHUTUC,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOAINGUOILAMTHUTUC,
					args);

				args = new Object[] {
						dnDoanhNghiepModelImpl.getLoaiNguoiLamThuTuc()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LOAINGUOILAMTHUTUC,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOAINGUOILAMTHUTUC,
					args);
			}

			if ((dnDoanhNghiepModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMAIL.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dnDoanhNghiepModelImpl.getOriginalEmail()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_EMAIL, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMAIL,
					args);

				args = new Object[] { dnDoanhNghiepModelImpl.getEmail() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_EMAIL, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMAIL,
					args);
			}
		}

		EntityCacheUtil.putResult(DnDoanhNghiepModelImpl.ENTITY_CACHE_ENABLED,
			DnDoanhNghiepImpl.class, dnDoanhNghiep.getPrimaryKey(),
			dnDoanhNghiep);

		clearUniqueFindersCache(dnDoanhNghiep);
		cacheUniqueFindersCache(dnDoanhNghiep);

		return dnDoanhNghiep;
	}

	protected DnDoanhNghiep toUnwrappedModel(DnDoanhNghiep dnDoanhNghiep) {
		if (dnDoanhNghiep instanceof DnDoanhNghiepImpl) {
			return dnDoanhNghiep;
		}

		DnDoanhNghiepImpl dnDoanhNghiepImpl = new DnDoanhNghiepImpl();

		dnDoanhNghiepImpl.setNew(dnDoanhNghiep.isNew());
		dnDoanhNghiepImpl.setPrimaryKey(dnDoanhNghiep.getPrimaryKey());

		dnDoanhNghiepImpl.setId(dnDoanhNghiep.getId());
		dnDoanhNghiepImpl.setMaSoDoanhNghiep(dnDoanhNghiep.getMaSoDoanhNghiep());
		dnDoanhNghiepImpl.setTenDoanhNghiep(dnDoanhNghiep.getTenDoanhNghiep());
		dnDoanhNghiepImpl.setDiaChi(dnDoanhNghiep.getDiaChi());
		dnDoanhNghiepImpl.setMaTinhThanh(dnDoanhNghiep.getMaTinhThanh());
		dnDoanhNghiepImpl.setMaQuanHuyen(dnDoanhNghiep.getMaQuanHuyen());
		dnDoanhNghiepImpl.setMaPhuongXa(dnDoanhNghiep.getMaPhuongXa());
		dnDoanhNghiepImpl.setDienThoai(dnDoanhNghiep.getDienThoai());
		dnDoanhNghiepImpl.setWebsite(dnDoanhNghiep.getWebsite());
		dnDoanhNghiepImpl.setFax(dnDoanhNghiep.getFax());
		dnDoanhNghiepImpl.setEmail(dnDoanhNghiep.getEmail());
		dnDoanhNghiepImpl.setMaster(dnDoanhNghiep.getMaster());
		dnDoanhNghiepImpl.setNgayDangKi(dnDoanhNghiep.getNgayDangKi());
		dnDoanhNghiepImpl.setHangTaiKhoan(dnDoanhNghiep.getHangTaiKhoan());
		dnDoanhNghiepImpl.setMaKichHoat(dnDoanhNghiep.getMaKichHoat());
		dnDoanhNghiepImpl.setNgayKichHoat(dnDoanhNghiep.getNgayKichHoat());
		dnDoanhNghiepImpl.setSoDangKyKinhDoanh(dnDoanhNghiep.getSoDangKyKinhDoanh());
		dnDoanhNghiepImpl.setNgayCapDkKd(dnDoanhNghiep.getNgayCapDkKd());
		dnDoanhNghiepImpl.setNgayHetHanDKKD(dnDoanhNghiep.getNgayHetHanDKKD());
		dnDoanhNghiepImpl.setCoQuanCapDkKd(dnDoanhNghiep.getCoQuanCapDkKd());
		dnDoanhNghiepImpl.setLoaiDoanhNghiep(dnDoanhNghiep.getLoaiDoanhNghiep());
		dnDoanhNghiepImpl.setNguoiDaiDien(dnDoanhNghiep.getNguoiDaiDien());
		dnDoanhNghiepImpl.setSoDienThoaiNguoiDaiDien(dnDoanhNghiep.getSoDienThoaiNguoiDaiDien());
		dnDoanhNghiepImpl.setChucVuNguoiDaiDien(dnDoanhNghiep.getChucVuNguoiDaiDien());
		dnDoanhNghiepImpl.setTenTiengAnh(dnDoanhNghiep.getTenTiengAnh());
		dnDoanhNghiepImpl.setTenVietTat(dnDoanhNghiep.getTenVietTat());
		dnDoanhNghiepImpl.setSoGpkdVanTaiBangOto(dnDoanhNghiep.getSoGpkdVanTaiBangOto());
		dnDoanhNghiepImpl.setNgayCapGpkdVanTaiBangOto(dnDoanhNghiep.getNgayCapGpkdVanTaiBangOto());
		dnDoanhNghiepImpl.setCoQuanCapGpkdVanTaiBangOto(dnDoanhNghiep.getCoQuanCapGpkdVanTaiBangOto());
		dnDoanhNghiepImpl.setMaSoCongDan(dnDoanhNghiep.getMaSoCongDan());
		dnDoanhNghiepImpl.setTenCongDan(dnDoanhNghiep.getTenCongDan());
		dnDoanhNghiepImpl.setQuocTich(dnDoanhNghiep.getQuocTich());
		dnDoanhNghiepImpl.setGioiTinh(dnDoanhNghiep.getGioiTinh());
		dnDoanhNghiepImpl.setNgayCapCMND(dnDoanhNghiep.getNgayCapCMND());
		dnDoanhNghiepImpl.setNoiCapCMND(dnDoanhNghiep.getNoiCapCMND());
		dnDoanhNghiepImpl.setLoaiNguoiLamThuTuc(dnDoanhNghiep.getLoaiNguoiLamThuTuc());
		dnDoanhNghiepImpl.setNamSinh(dnDoanhNghiep.getNamSinh());
		dnDoanhNghiepImpl.setNgaySinh(dnDoanhNghiep.getNgaySinh());

		return dnDoanhNghiepImpl;
	}

	/**
	 * Returns the dn doanh nghiep with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dn doanh nghiep
	 * @return the dn doanh nghiep
	 * @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException if a dn doanh nghiep with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DnDoanhNghiep findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDnDoanhNghiepException, SystemException {
		DnDoanhNghiep dnDoanhNghiep = fetchByPrimaryKey(primaryKey);

		if (dnDoanhNghiep == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDnDoanhNghiepException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dnDoanhNghiep;
	}

	/**
	 * Returns the dn doanh nghiep with the primary key or throws a {@link vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException} if it could not be found.
	 *
	 * @param id the primary key of the dn doanh nghiep
	 * @return the dn doanh nghiep
	 * @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException if a dn doanh nghiep with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DnDoanhNghiep findByPrimaryKey(long id)
		throws NoSuchDnDoanhNghiepException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dn doanh nghiep with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dn doanh nghiep
	 * @return the dn doanh nghiep, or <code>null</code> if a dn doanh nghiep with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DnDoanhNghiep fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DnDoanhNghiep dnDoanhNghiep = (DnDoanhNghiep)EntityCacheUtil.getResult(DnDoanhNghiepModelImpl.ENTITY_CACHE_ENABLED,
				DnDoanhNghiepImpl.class, primaryKey);

		if (dnDoanhNghiep == _nullDnDoanhNghiep) {
			return null;
		}

		if (dnDoanhNghiep == null) {
			Session session = null;

			try {
				session = openSession();

				dnDoanhNghiep = (DnDoanhNghiep)session.get(DnDoanhNghiepImpl.class,
						primaryKey);

				if (dnDoanhNghiep != null) {
					cacheResult(dnDoanhNghiep);
				}
				else {
					EntityCacheUtil.putResult(DnDoanhNghiepModelImpl.ENTITY_CACHE_ENABLED,
						DnDoanhNghiepImpl.class, primaryKey, _nullDnDoanhNghiep);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DnDoanhNghiepModelImpl.ENTITY_CACHE_ENABLED,
					DnDoanhNghiepImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dnDoanhNghiep;
	}

	/**
	 * Returns the dn doanh nghiep with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dn doanh nghiep
	 * @return the dn doanh nghiep, or <code>null</code> if a dn doanh nghiep with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DnDoanhNghiep fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the dn doanh nghieps.
	 *
	 * @return the dn doanh nghieps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DnDoanhNghiep> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dn doanh nghieps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dn doanh nghieps
	 * @param end the upper bound of the range of dn doanh nghieps (not inclusive)
	 * @return the range of dn doanh nghieps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DnDoanhNghiep> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dn doanh nghieps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dn doanh nghieps
	 * @param end the upper bound of the range of dn doanh nghieps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dn doanh nghieps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DnDoanhNghiep> findAll(int start, int end,
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

		List<DnDoanhNghiep> list = (List<DnDoanhNghiep>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DNDOANHNGHIEP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DNDOANHNGHIEP;

				if (pagination) {
					sql = sql.concat(DnDoanhNghiepModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DnDoanhNghiep>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DnDoanhNghiep>(list);
				}
				else {
					list = (List<DnDoanhNghiep>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the dn doanh nghieps from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DnDoanhNghiep dnDoanhNghiep : findAll()) {
			remove(dnDoanhNghiep);
		}
	}

	/**
	 * Returns the number of dn doanh nghieps.
	 *
	 * @return the number of dn doanh nghieps
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

				Query q = session.createQuery(_SQL_COUNT_DNDOANHNGHIEP);

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
	 * Initializes the dn doanh nghiep persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DnDoanhNghiep>> listenersList = new ArrayList<ModelListener<DnDoanhNghiep>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DnDoanhNghiep>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DnDoanhNghiepImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DNDOANHNGHIEP = "SELECT dnDoanhNghiep FROM DnDoanhNghiep dnDoanhNghiep";
	private static final String _SQL_SELECT_DNDOANHNGHIEP_WHERE = "SELECT dnDoanhNghiep FROM DnDoanhNghiep dnDoanhNghiep WHERE ";
	private static final String _SQL_COUNT_DNDOANHNGHIEP = "SELECT COUNT(dnDoanhNghiep) FROM DnDoanhNghiep dnDoanhNghiep";
	private static final String _SQL_COUNT_DNDOANHNGHIEP_WHERE = "SELECT COUNT(dnDoanhNghiep) FROM DnDoanhNghiep dnDoanhNghiep WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dnDoanhNghiep.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DnDoanhNghiep exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DnDoanhNghiep exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DnDoanhNghiepPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"maSoDoanhNghiep", "tenDoanhNghiep", "diaChi", "maTinhThanh",
				"maQuanHuyen", "maPhuongXa", "dienThoai", "website",
				"ngayDangKi", "hangTaiKhoan", "maKichHoat", "ngayKichHoat",
				"soDangKyKinhDoanh", "ngayCapDkKd", "ngayHetHanDKKD",
				"coQuanCapDkKd", "loaiDoanhNghiep", "nguoiDaiDien",
				"soDienThoaiNguoiDaiDien", "chucVuNguoiDaiDien", "tenTiengAnh",
				"tenVietTat", "soGpkdVanTaiBangOto", "ngayCapGpkdVanTaiBangOto",
				"coQuanCapGpkdVanTaiBangOto", "maSoCongDan", "tenCongDan",
				"quocTich", "gioiTinh", "ngayCapCMND", "noiCapCMND",
				"loaiNguoiLamThuTuc", "namSinh", "ngaySinh"
			});
	private static DnDoanhNghiep _nullDnDoanhNghiep = new DnDoanhNghiepImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DnDoanhNghiep> toCacheModel() {
				return _nullDnDoanhNghiepCacheModel;
			}
		};

	private static CacheModel<DnDoanhNghiep> _nullDnDoanhNghiepCacheModel = new CacheModel<DnDoanhNghiep>() {
			@Override
			public DnDoanhNghiep toEntityModel() {
				return _nullDnDoanhNghiep;
			}
		};
}