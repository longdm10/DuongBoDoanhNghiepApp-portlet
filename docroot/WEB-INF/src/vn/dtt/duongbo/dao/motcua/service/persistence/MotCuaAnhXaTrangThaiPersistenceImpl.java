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

package vn.dtt.duongbo.dao.motcua.service.persistence;

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

import vn.dtt.duongbo.dao.motcua.NoSuchMotCuaAnhXaTrangThaiException;
import vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai;
import vn.dtt.duongbo.dao.motcua.model.impl.MotCuaAnhXaTrangThaiImpl;
import vn.dtt.duongbo.dao.motcua.model.impl.MotCuaAnhXaTrangThaiModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the mot cua anh xa trang thai service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see MotCuaAnhXaTrangThaiPersistence
 * @see MotCuaAnhXaTrangThaiUtil
 * @generated
 */
public class MotCuaAnhXaTrangThaiPersistenceImpl extends BasePersistenceImpl<MotCuaAnhXaTrangThai>
	implements MotCuaAnhXaTrangThaiPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link MotCuaAnhXaTrangThaiUtil} to access the mot cua anh xa trang thai persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = MotCuaAnhXaTrangThaiImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MotCuaAnhXaTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaAnhXaTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			MotCuaAnhXaTrangThaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MotCuaAnhXaTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaAnhXaTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			MotCuaAnhXaTrangThaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MotCuaAnhXaTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaAnhXaTrangThaiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_MATTCANBO = new FinderPath(MotCuaAnhXaTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaAnhXaTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			MotCuaAnhXaTrangThaiImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByMaTTCanBo", new String[] { String.class.getName() },
			MotCuaAnhXaTrangThaiModelImpl.MATTCANBO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MATTCANBO = new FinderPath(MotCuaAnhXaTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaAnhXaTrangThaiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMaTTCanBo",
			new String[] { String.class.getName() });

	/**
	 * Returns the mot cua anh xa trang thai where maTTCanBo = &#63; or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchMotCuaAnhXaTrangThaiException} if it could not be found.
	 *
	 * @param maTTCanBo the ma t t can bo
	 * @return the matching mot cua anh xa trang thai
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaAnhXaTrangThaiException if a matching mot cua anh xa trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaAnhXaTrangThai findByMaTTCanBo(String maTTCanBo)
		throws NoSuchMotCuaAnhXaTrangThaiException, SystemException {
		MotCuaAnhXaTrangThai motCuaAnhXaTrangThai = fetchByMaTTCanBo(maTTCanBo);

		if (motCuaAnhXaTrangThai == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("maTTCanBo=");
			msg.append(maTTCanBo);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchMotCuaAnhXaTrangThaiException(msg.toString());
		}

		return motCuaAnhXaTrangThai;
	}

	/**
	 * Returns the mot cua anh xa trang thai where maTTCanBo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param maTTCanBo the ma t t can bo
	 * @return the matching mot cua anh xa trang thai, or <code>null</code> if a matching mot cua anh xa trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaAnhXaTrangThai fetchByMaTTCanBo(String maTTCanBo)
		throws SystemException {
		return fetchByMaTTCanBo(maTTCanBo, true);
	}

	/**
	 * Returns the mot cua anh xa trang thai where maTTCanBo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param maTTCanBo the ma t t can bo
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching mot cua anh xa trang thai, or <code>null</code> if a matching mot cua anh xa trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaAnhXaTrangThai fetchByMaTTCanBo(String maTTCanBo,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { maTTCanBo };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_MATTCANBO,
					finderArgs, this);
		}

		if (result instanceof MotCuaAnhXaTrangThai) {
			MotCuaAnhXaTrangThai motCuaAnhXaTrangThai = (MotCuaAnhXaTrangThai)result;

			if (!Validator.equals(maTTCanBo, motCuaAnhXaTrangThai.getMaTTCanBo())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_MOTCUAANHXATRANGTHAI_WHERE);

			boolean bindMaTTCanBo = false;

			if (maTTCanBo == null) {
				query.append(_FINDER_COLUMN_MATTCANBO_MATTCANBO_1);
			}
			else if (maTTCanBo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MATTCANBO_MATTCANBO_3);
			}
			else {
				bindMaTTCanBo = true;

				query.append(_FINDER_COLUMN_MATTCANBO_MATTCANBO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaTTCanBo) {
					qPos.add(maTTCanBo);
				}

				List<MotCuaAnhXaTrangThai> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATTCANBO,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"MotCuaAnhXaTrangThaiPersistenceImpl.fetchByMaTTCanBo(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					MotCuaAnhXaTrangThai motCuaAnhXaTrangThai = list.get(0);

					result = motCuaAnhXaTrangThai;

					cacheResult(motCuaAnhXaTrangThai);

					if ((motCuaAnhXaTrangThai.getMaTTCanBo() == null) ||
							!motCuaAnhXaTrangThai.getMaTTCanBo()
													 .equals(maTTCanBo)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATTCANBO,
							finderArgs, motCuaAnhXaTrangThai);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MATTCANBO,
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
			return (MotCuaAnhXaTrangThai)result;
		}
	}

	/**
	 * Removes the mot cua anh xa trang thai where maTTCanBo = &#63; from the database.
	 *
	 * @param maTTCanBo the ma t t can bo
	 * @return the mot cua anh xa trang thai that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaAnhXaTrangThai removeByMaTTCanBo(String maTTCanBo)
		throws NoSuchMotCuaAnhXaTrangThaiException, SystemException {
		MotCuaAnhXaTrangThai motCuaAnhXaTrangThai = findByMaTTCanBo(maTTCanBo);

		return remove(motCuaAnhXaTrangThai);
	}

	/**
	 * Returns the number of mot cua anh xa trang thais where maTTCanBo = &#63;.
	 *
	 * @param maTTCanBo the ma t t can bo
	 * @return the number of matching mot cua anh xa trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByMaTTCanBo(String maTTCanBo) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MATTCANBO;

		Object[] finderArgs = new Object[] { maTTCanBo };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MOTCUAANHXATRANGTHAI_WHERE);

			boolean bindMaTTCanBo = false;

			if (maTTCanBo == null) {
				query.append(_FINDER_COLUMN_MATTCANBO_MATTCANBO_1);
			}
			else if (maTTCanBo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MATTCANBO_MATTCANBO_3);
			}
			else {
				bindMaTTCanBo = true;

				query.append(_FINDER_COLUMN_MATTCANBO_MATTCANBO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaTTCanBo) {
					qPos.add(maTTCanBo);
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

	private static final String _FINDER_COLUMN_MATTCANBO_MATTCANBO_1 = "motCuaAnhXaTrangThai.maTTCanBo IS NULL";
	private static final String _FINDER_COLUMN_MATTCANBO_MATTCANBO_2 = "motCuaAnhXaTrangThai.maTTCanBo = ?";
	private static final String _FINDER_COLUMN_MATTCANBO_MATTCANBO_3 = "(motCuaAnhXaTrangThai.maTTCanBo IS NULL OR motCuaAnhXaTrangThai.maTTCanBo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MATTDOANHNGHIEP =
		new FinderPath(MotCuaAnhXaTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaAnhXaTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			MotCuaAnhXaTrangThaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByMaTTDoanhNghiep",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MATTDOANHNGHIEP =
		new FinderPath(MotCuaAnhXaTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaAnhXaTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			MotCuaAnhXaTrangThaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByMaTTDoanhNghiep",
			new String[] { String.class.getName() },
			MotCuaAnhXaTrangThaiModelImpl.MATTDOANHNGHIEP_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MATTDOANHNGHIEP = new FinderPath(MotCuaAnhXaTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaAnhXaTrangThaiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByMaTTDoanhNghiep", new String[] { String.class.getName() });

	/**
	 * Returns all the mot cua anh xa trang thais where maTTDoanhNghiep = &#63;.
	 *
	 * @param maTTDoanhNghiep the ma t t doanh nghiep
	 * @return the matching mot cua anh xa trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaAnhXaTrangThai> findByMaTTDoanhNghiep(
		String maTTDoanhNghiep) throws SystemException {
		return findByMaTTDoanhNghiep(maTTDoanhNghiep, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua anh xa trang thais where maTTDoanhNghiep = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaAnhXaTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param maTTDoanhNghiep the ma t t doanh nghiep
	 * @param start the lower bound of the range of mot cua anh xa trang thais
	 * @param end the upper bound of the range of mot cua anh xa trang thais (not inclusive)
	 * @return the range of matching mot cua anh xa trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaAnhXaTrangThai> findByMaTTDoanhNghiep(
		String maTTDoanhNghiep, int start, int end) throws SystemException {
		return findByMaTTDoanhNghiep(maTTDoanhNghiep, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua anh xa trang thais where maTTDoanhNghiep = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaAnhXaTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param maTTDoanhNghiep the ma t t doanh nghiep
	 * @param start the lower bound of the range of mot cua anh xa trang thais
	 * @param end the upper bound of the range of mot cua anh xa trang thais (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mot cua anh xa trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaAnhXaTrangThai> findByMaTTDoanhNghiep(
		String maTTDoanhNghiep, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MATTDOANHNGHIEP;
			finderArgs = new Object[] { maTTDoanhNghiep };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_MATTDOANHNGHIEP;
			finderArgs = new Object[] {
					maTTDoanhNghiep,
					
					start, end, orderByComparator
				};
		}

		List<MotCuaAnhXaTrangThai> list = (List<MotCuaAnhXaTrangThai>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MotCuaAnhXaTrangThai motCuaAnhXaTrangThai : list) {
				if (!Validator.equals(maTTDoanhNghiep,
							motCuaAnhXaTrangThai.getMaTTDoanhNghiep())) {
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

			query.append(_SQL_SELECT_MOTCUAANHXATRANGTHAI_WHERE);

			boolean bindMaTTDoanhNghiep = false;

			if (maTTDoanhNghiep == null) {
				query.append(_FINDER_COLUMN_MATTDOANHNGHIEP_MATTDOANHNGHIEP_1);
			}
			else if (maTTDoanhNghiep.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MATTDOANHNGHIEP_MATTDOANHNGHIEP_3);
			}
			else {
				bindMaTTDoanhNghiep = true;

				query.append(_FINDER_COLUMN_MATTDOANHNGHIEP_MATTDOANHNGHIEP_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MotCuaAnhXaTrangThaiModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaTTDoanhNghiep) {
					qPos.add(maTTDoanhNghiep);
				}

				if (!pagination) {
					list = (List<MotCuaAnhXaTrangThai>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaAnhXaTrangThai>(list);
				}
				else {
					list = (List<MotCuaAnhXaTrangThai>)QueryUtil.list(q,
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
	 * Returns the first mot cua anh xa trang thai in the ordered set where maTTDoanhNghiep = &#63;.
	 *
	 * @param maTTDoanhNghiep the ma t t doanh nghiep
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua anh xa trang thai
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaAnhXaTrangThaiException if a matching mot cua anh xa trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaAnhXaTrangThai findByMaTTDoanhNghiep_First(
		String maTTDoanhNghiep, OrderByComparator orderByComparator)
		throws NoSuchMotCuaAnhXaTrangThaiException, SystemException {
		MotCuaAnhXaTrangThai motCuaAnhXaTrangThai = fetchByMaTTDoanhNghiep_First(maTTDoanhNghiep,
				orderByComparator);

		if (motCuaAnhXaTrangThai != null) {
			return motCuaAnhXaTrangThai;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("maTTDoanhNghiep=");
		msg.append(maTTDoanhNghiep);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaAnhXaTrangThaiException(msg.toString());
	}

	/**
	 * Returns the first mot cua anh xa trang thai in the ordered set where maTTDoanhNghiep = &#63;.
	 *
	 * @param maTTDoanhNghiep the ma t t doanh nghiep
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua anh xa trang thai, or <code>null</code> if a matching mot cua anh xa trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaAnhXaTrangThai fetchByMaTTDoanhNghiep_First(
		String maTTDoanhNghiep, OrderByComparator orderByComparator)
		throws SystemException {
		List<MotCuaAnhXaTrangThai> list = findByMaTTDoanhNghiep(maTTDoanhNghiep,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mot cua anh xa trang thai in the ordered set where maTTDoanhNghiep = &#63;.
	 *
	 * @param maTTDoanhNghiep the ma t t doanh nghiep
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua anh xa trang thai
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaAnhXaTrangThaiException if a matching mot cua anh xa trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaAnhXaTrangThai findByMaTTDoanhNghiep_Last(
		String maTTDoanhNghiep, OrderByComparator orderByComparator)
		throws NoSuchMotCuaAnhXaTrangThaiException, SystemException {
		MotCuaAnhXaTrangThai motCuaAnhXaTrangThai = fetchByMaTTDoanhNghiep_Last(maTTDoanhNghiep,
				orderByComparator);

		if (motCuaAnhXaTrangThai != null) {
			return motCuaAnhXaTrangThai;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("maTTDoanhNghiep=");
		msg.append(maTTDoanhNghiep);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaAnhXaTrangThaiException(msg.toString());
	}

	/**
	 * Returns the last mot cua anh xa trang thai in the ordered set where maTTDoanhNghiep = &#63;.
	 *
	 * @param maTTDoanhNghiep the ma t t doanh nghiep
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua anh xa trang thai, or <code>null</code> if a matching mot cua anh xa trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaAnhXaTrangThai fetchByMaTTDoanhNghiep_Last(
		String maTTDoanhNghiep, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByMaTTDoanhNghiep(maTTDoanhNghiep);

		if (count == 0) {
			return null;
		}

		List<MotCuaAnhXaTrangThai> list = findByMaTTDoanhNghiep(maTTDoanhNghiep,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mot cua anh xa trang thais before and after the current mot cua anh xa trang thai in the ordered set where maTTDoanhNghiep = &#63;.
	 *
	 * @param id the primary key of the current mot cua anh xa trang thai
	 * @param maTTDoanhNghiep the ma t t doanh nghiep
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mot cua anh xa trang thai
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaAnhXaTrangThaiException if a mot cua anh xa trang thai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaAnhXaTrangThai[] findByMaTTDoanhNghiep_PrevAndNext(long id,
		String maTTDoanhNghiep, OrderByComparator orderByComparator)
		throws NoSuchMotCuaAnhXaTrangThaiException, SystemException {
		MotCuaAnhXaTrangThai motCuaAnhXaTrangThai = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			MotCuaAnhXaTrangThai[] array = new MotCuaAnhXaTrangThaiImpl[3];

			array[0] = getByMaTTDoanhNghiep_PrevAndNext(session,
					motCuaAnhXaTrangThai, maTTDoanhNghiep, orderByComparator,
					true);

			array[1] = motCuaAnhXaTrangThai;

			array[2] = getByMaTTDoanhNghiep_PrevAndNext(session,
					motCuaAnhXaTrangThai, maTTDoanhNghiep, orderByComparator,
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

	protected MotCuaAnhXaTrangThai getByMaTTDoanhNghiep_PrevAndNext(
		Session session, MotCuaAnhXaTrangThai motCuaAnhXaTrangThai,
		String maTTDoanhNghiep, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MOTCUAANHXATRANGTHAI_WHERE);

		boolean bindMaTTDoanhNghiep = false;

		if (maTTDoanhNghiep == null) {
			query.append(_FINDER_COLUMN_MATTDOANHNGHIEP_MATTDOANHNGHIEP_1);
		}
		else if (maTTDoanhNghiep.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_MATTDOANHNGHIEP_MATTDOANHNGHIEP_3);
		}
		else {
			bindMaTTDoanhNghiep = true;

			query.append(_FINDER_COLUMN_MATTDOANHNGHIEP_MATTDOANHNGHIEP_2);
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
			query.append(MotCuaAnhXaTrangThaiModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindMaTTDoanhNghiep) {
			qPos.add(maTTDoanhNghiep);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(motCuaAnhXaTrangThai);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MotCuaAnhXaTrangThai> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mot cua anh xa trang thais where maTTDoanhNghiep = &#63; from the database.
	 *
	 * @param maTTDoanhNghiep the ma t t doanh nghiep
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByMaTTDoanhNghiep(String maTTDoanhNghiep)
		throws SystemException {
		for (MotCuaAnhXaTrangThai motCuaAnhXaTrangThai : findByMaTTDoanhNghiep(
				maTTDoanhNghiep, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(motCuaAnhXaTrangThai);
		}
	}

	/**
	 * Returns the number of mot cua anh xa trang thais where maTTDoanhNghiep = &#63;.
	 *
	 * @param maTTDoanhNghiep the ma t t doanh nghiep
	 * @return the number of matching mot cua anh xa trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByMaTTDoanhNghiep(String maTTDoanhNghiep)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MATTDOANHNGHIEP;

		Object[] finderArgs = new Object[] { maTTDoanhNghiep };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MOTCUAANHXATRANGTHAI_WHERE);

			boolean bindMaTTDoanhNghiep = false;

			if (maTTDoanhNghiep == null) {
				query.append(_FINDER_COLUMN_MATTDOANHNGHIEP_MATTDOANHNGHIEP_1);
			}
			else if (maTTDoanhNghiep.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MATTDOANHNGHIEP_MATTDOANHNGHIEP_3);
			}
			else {
				bindMaTTDoanhNghiep = true;

				query.append(_FINDER_COLUMN_MATTDOANHNGHIEP_MATTDOANHNGHIEP_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaTTDoanhNghiep) {
					qPos.add(maTTDoanhNghiep);
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

	private static final String _FINDER_COLUMN_MATTDOANHNGHIEP_MATTDOANHNGHIEP_1 =
		"motCuaAnhXaTrangThai.maTTDoanhNghiep IS NULL";
	private static final String _FINDER_COLUMN_MATTDOANHNGHIEP_MATTDOANHNGHIEP_2 =
		"motCuaAnhXaTrangThai.maTTDoanhNghiep = ?";
	private static final String _FINDER_COLUMN_MATTDOANHNGHIEP_MATTDOANHNGHIEP_3 =
		"(motCuaAnhXaTrangThai.maTTDoanhNghiep IS NULL OR motCuaAnhXaTrangThai.maTTDoanhNghiep = '')";

	public MotCuaAnhXaTrangThaiPersistenceImpl() {
		setModelClass(MotCuaAnhXaTrangThai.class);
	}

	/**
	 * Caches the mot cua anh xa trang thai in the entity cache if it is enabled.
	 *
	 * @param motCuaAnhXaTrangThai the mot cua anh xa trang thai
	 */
	@Override
	public void cacheResult(MotCuaAnhXaTrangThai motCuaAnhXaTrangThai) {
		EntityCacheUtil.putResult(MotCuaAnhXaTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaAnhXaTrangThaiImpl.class,
			motCuaAnhXaTrangThai.getPrimaryKey(), motCuaAnhXaTrangThai);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATTCANBO,
			new Object[] { motCuaAnhXaTrangThai.getMaTTCanBo() },
			motCuaAnhXaTrangThai);

		motCuaAnhXaTrangThai.resetOriginalValues();
	}

	/**
	 * Caches the mot cua anh xa trang thais in the entity cache if it is enabled.
	 *
	 * @param motCuaAnhXaTrangThais the mot cua anh xa trang thais
	 */
	@Override
	public void cacheResult(List<MotCuaAnhXaTrangThai> motCuaAnhXaTrangThais) {
		for (MotCuaAnhXaTrangThai motCuaAnhXaTrangThai : motCuaAnhXaTrangThais) {
			if (EntityCacheUtil.getResult(
						MotCuaAnhXaTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
						MotCuaAnhXaTrangThaiImpl.class,
						motCuaAnhXaTrangThai.getPrimaryKey()) == null) {
				cacheResult(motCuaAnhXaTrangThai);
			}
			else {
				motCuaAnhXaTrangThai.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all mot cua anh xa trang thais.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(MotCuaAnhXaTrangThaiImpl.class.getName());
		}

		EntityCacheUtil.clearCache(MotCuaAnhXaTrangThaiImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the mot cua anh xa trang thai.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MotCuaAnhXaTrangThai motCuaAnhXaTrangThai) {
		EntityCacheUtil.removeResult(MotCuaAnhXaTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaAnhXaTrangThaiImpl.class, motCuaAnhXaTrangThai.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(motCuaAnhXaTrangThai);
	}

	@Override
	public void clearCache(List<MotCuaAnhXaTrangThai> motCuaAnhXaTrangThais) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (MotCuaAnhXaTrangThai motCuaAnhXaTrangThai : motCuaAnhXaTrangThais) {
			EntityCacheUtil.removeResult(MotCuaAnhXaTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
				MotCuaAnhXaTrangThaiImpl.class,
				motCuaAnhXaTrangThai.getPrimaryKey());

			clearUniqueFindersCache(motCuaAnhXaTrangThai);
		}
	}

	protected void cacheUniqueFindersCache(
		MotCuaAnhXaTrangThai motCuaAnhXaTrangThai) {
		if (motCuaAnhXaTrangThai.isNew()) {
			Object[] args = new Object[] { motCuaAnhXaTrangThai.getMaTTCanBo() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MATTCANBO, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATTCANBO, args,
				motCuaAnhXaTrangThai);
		}
		else {
			MotCuaAnhXaTrangThaiModelImpl motCuaAnhXaTrangThaiModelImpl = (MotCuaAnhXaTrangThaiModelImpl)motCuaAnhXaTrangThai;

			if ((motCuaAnhXaTrangThaiModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_MATTCANBO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { motCuaAnhXaTrangThai.getMaTTCanBo() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MATTCANBO, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATTCANBO, args,
					motCuaAnhXaTrangThai);
			}
		}
	}

	protected void clearUniqueFindersCache(
		MotCuaAnhXaTrangThai motCuaAnhXaTrangThai) {
		MotCuaAnhXaTrangThaiModelImpl motCuaAnhXaTrangThaiModelImpl = (MotCuaAnhXaTrangThaiModelImpl)motCuaAnhXaTrangThai;

		Object[] args = new Object[] { motCuaAnhXaTrangThai.getMaTTCanBo() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MATTCANBO, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MATTCANBO, args);

		if ((motCuaAnhXaTrangThaiModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_MATTCANBO.getColumnBitmask()) != 0) {
			args = new Object[] {
					motCuaAnhXaTrangThaiModelImpl.getOriginalMaTTCanBo()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MATTCANBO, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MATTCANBO, args);
		}
	}

	/**
	 * Creates a new mot cua anh xa trang thai with the primary key. Does not add the mot cua anh xa trang thai to the database.
	 *
	 * @param id the primary key for the new mot cua anh xa trang thai
	 * @return the new mot cua anh xa trang thai
	 */
	@Override
	public MotCuaAnhXaTrangThai create(long id) {
		MotCuaAnhXaTrangThai motCuaAnhXaTrangThai = new MotCuaAnhXaTrangThaiImpl();

		motCuaAnhXaTrangThai.setNew(true);
		motCuaAnhXaTrangThai.setPrimaryKey(id);

		return motCuaAnhXaTrangThai;
	}

	/**
	 * Removes the mot cua anh xa trang thai with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the mot cua anh xa trang thai
	 * @return the mot cua anh xa trang thai that was removed
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaAnhXaTrangThaiException if a mot cua anh xa trang thai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaAnhXaTrangThai remove(long id)
		throws NoSuchMotCuaAnhXaTrangThaiException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the mot cua anh xa trang thai with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the mot cua anh xa trang thai
	 * @return the mot cua anh xa trang thai that was removed
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaAnhXaTrangThaiException if a mot cua anh xa trang thai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaAnhXaTrangThai remove(Serializable primaryKey)
		throws NoSuchMotCuaAnhXaTrangThaiException, SystemException {
		Session session = null;

		try {
			session = openSession();

			MotCuaAnhXaTrangThai motCuaAnhXaTrangThai = (MotCuaAnhXaTrangThai)session.get(MotCuaAnhXaTrangThaiImpl.class,
					primaryKey);

			if (motCuaAnhXaTrangThai == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMotCuaAnhXaTrangThaiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(motCuaAnhXaTrangThai);
		}
		catch (NoSuchMotCuaAnhXaTrangThaiException nsee) {
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
	protected MotCuaAnhXaTrangThai removeImpl(
		MotCuaAnhXaTrangThai motCuaAnhXaTrangThai) throws SystemException {
		motCuaAnhXaTrangThai = toUnwrappedModel(motCuaAnhXaTrangThai);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(motCuaAnhXaTrangThai)) {
				motCuaAnhXaTrangThai = (MotCuaAnhXaTrangThai)session.get(MotCuaAnhXaTrangThaiImpl.class,
						motCuaAnhXaTrangThai.getPrimaryKeyObj());
			}

			if (motCuaAnhXaTrangThai != null) {
				session.delete(motCuaAnhXaTrangThai);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (motCuaAnhXaTrangThai != null) {
			clearCache(motCuaAnhXaTrangThai);
		}

		return motCuaAnhXaTrangThai;
	}

	@Override
	public MotCuaAnhXaTrangThai updateImpl(
		vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai motCuaAnhXaTrangThai)
		throws SystemException {
		motCuaAnhXaTrangThai = toUnwrappedModel(motCuaAnhXaTrangThai);

		boolean isNew = motCuaAnhXaTrangThai.isNew();

		MotCuaAnhXaTrangThaiModelImpl motCuaAnhXaTrangThaiModelImpl = (MotCuaAnhXaTrangThaiModelImpl)motCuaAnhXaTrangThai;

		Session session = null;

		try {
			session = openSession();

			if (motCuaAnhXaTrangThai.isNew()) {
				session.save(motCuaAnhXaTrangThai);

				motCuaAnhXaTrangThai.setNew(false);
			}
			else {
				session.merge(motCuaAnhXaTrangThai);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !MotCuaAnhXaTrangThaiModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((motCuaAnhXaTrangThaiModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MATTDOANHNGHIEP.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaAnhXaTrangThaiModelImpl.getOriginalMaTTDoanhNghiep()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MATTDOANHNGHIEP,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MATTDOANHNGHIEP,
					args);

				args = new Object[] {
						motCuaAnhXaTrangThaiModelImpl.getMaTTDoanhNghiep()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MATTDOANHNGHIEP,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MATTDOANHNGHIEP,
					args);
			}
		}

		EntityCacheUtil.putResult(MotCuaAnhXaTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaAnhXaTrangThaiImpl.class,
			motCuaAnhXaTrangThai.getPrimaryKey(), motCuaAnhXaTrangThai);

		clearUniqueFindersCache(motCuaAnhXaTrangThai);
		cacheUniqueFindersCache(motCuaAnhXaTrangThai);

		return motCuaAnhXaTrangThai;
	}

	protected MotCuaAnhXaTrangThai toUnwrappedModel(
		MotCuaAnhXaTrangThai motCuaAnhXaTrangThai) {
		if (motCuaAnhXaTrangThai instanceof MotCuaAnhXaTrangThaiImpl) {
			return motCuaAnhXaTrangThai;
		}

		MotCuaAnhXaTrangThaiImpl motCuaAnhXaTrangThaiImpl = new MotCuaAnhXaTrangThaiImpl();

		motCuaAnhXaTrangThaiImpl.setNew(motCuaAnhXaTrangThai.isNew());
		motCuaAnhXaTrangThaiImpl.setPrimaryKey(motCuaAnhXaTrangThai.getPrimaryKey());

		motCuaAnhXaTrangThaiImpl.setId(motCuaAnhXaTrangThai.getId());
		motCuaAnhXaTrangThaiImpl.setMaTTCanBo(motCuaAnhXaTrangThai.getMaTTCanBo());
		motCuaAnhXaTrangThaiImpl.setMaTTDoanhNghiep(motCuaAnhXaTrangThai.getMaTTDoanhNghiep());

		return motCuaAnhXaTrangThaiImpl;
	}

	/**
	 * Returns the mot cua anh xa trang thai with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the mot cua anh xa trang thai
	 * @return the mot cua anh xa trang thai
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaAnhXaTrangThaiException if a mot cua anh xa trang thai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaAnhXaTrangThai findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMotCuaAnhXaTrangThaiException, SystemException {
		MotCuaAnhXaTrangThai motCuaAnhXaTrangThai = fetchByPrimaryKey(primaryKey);

		if (motCuaAnhXaTrangThai == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMotCuaAnhXaTrangThaiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return motCuaAnhXaTrangThai;
	}

	/**
	 * Returns the mot cua anh xa trang thai with the primary key or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchMotCuaAnhXaTrangThaiException} if it could not be found.
	 *
	 * @param id the primary key of the mot cua anh xa trang thai
	 * @return the mot cua anh xa trang thai
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaAnhXaTrangThaiException if a mot cua anh xa trang thai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaAnhXaTrangThai findByPrimaryKey(long id)
		throws NoSuchMotCuaAnhXaTrangThaiException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the mot cua anh xa trang thai with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the mot cua anh xa trang thai
	 * @return the mot cua anh xa trang thai, or <code>null</code> if a mot cua anh xa trang thai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaAnhXaTrangThai fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		MotCuaAnhXaTrangThai motCuaAnhXaTrangThai = (MotCuaAnhXaTrangThai)EntityCacheUtil.getResult(MotCuaAnhXaTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
				MotCuaAnhXaTrangThaiImpl.class, primaryKey);

		if (motCuaAnhXaTrangThai == _nullMotCuaAnhXaTrangThai) {
			return null;
		}

		if (motCuaAnhXaTrangThai == null) {
			Session session = null;

			try {
				session = openSession();

				motCuaAnhXaTrangThai = (MotCuaAnhXaTrangThai)session.get(MotCuaAnhXaTrangThaiImpl.class,
						primaryKey);

				if (motCuaAnhXaTrangThai != null) {
					cacheResult(motCuaAnhXaTrangThai);
				}
				else {
					EntityCacheUtil.putResult(MotCuaAnhXaTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
						MotCuaAnhXaTrangThaiImpl.class, primaryKey,
						_nullMotCuaAnhXaTrangThai);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(MotCuaAnhXaTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
					MotCuaAnhXaTrangThaiImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return motCuaAnhXaTrangThai;
	}

	/**
	 * Returns the mot cua anh xa trang thai with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the mot cua anh xa trang thai
	 * @return the mot cua anh xa trang thai, or <code>null</code> if a mot cua anh xa trang thai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaAnhXaTrangThai fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the mot cua anh xa trang thais.
	 *
	 * @return the mot cua anh xa trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaAnhXaTrangThai> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua anh xa trang thais.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaAnhXaTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mot cua anh xa trang thais
	 * @param end the upper bound of the range of mot cua anh xa trang thais (not inclusive)
	 * @return the range of mot cua anh xa trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaAnhXaTrangThai> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua anh xa trang thais.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaAnhXaTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mot cua anh xa trang thais
	 * @param end the upper bound of the range of mot cua anh xa trang thais (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mot cua anh xa trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaAnhXaTrangThai> findAll(int start, int end,
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

		List<MotCuaAnhXaTrangThai> list = (List<MotCuaAnhXaTrangThai>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MOTCUAANHXATRANGTHAI);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MOTCUAANHXATRANGTHAI;

				if (pagination) {
					sql = sql.concat(MotCuaAnhXaTrangThaiModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<MotCuaAnhXaTrangThai>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaAnhXaTrangThai>(list);
				}
				else {
					list = (List<MotCuaAnhXaTrangThai>)QueryUtil.list(q,
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
	 * Removes all the mot cua anh xa trang thais from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (MotCuaAnhXaTrangThai motCuaAnhXaTrangThai : findAll()) {
			remove(motCuaAnhXaTrangThai);
		}
	}

	/**
	 * Returns the number of mot cua anh xa trang thais.
	 *
	 * @return the number of mot cua anh xa trang thais
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

				Query q = session.createQuery(_SQL_COUNT_MOTCUAANHXATRANGTHAI);

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
	 * Initializes the mot cua anh xa trang thai persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<MotCuaAnhXaTrangThai>> listenersList = new ArrayList<ModelListener<MotCuaAnhXaTrangThai>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<MotCuaAnhXaTrangThai>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(MotCuaAnhXaTrangThaiImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_MOTCUAANHXATRANGTHAI = "SELECT motCuaAnhXaTrangThai FROM MotCuaAnhXaTrangThai motCuaAnhXaTrangThai";
	private static final String _SQL_SELECT_MOTCUAANHXATRANGTHAI_WHERE = "SELECT motCuaAnhXaTrangThai FROM MotCuaAnhXaTrangThai motCuaAnhXaTrangThai WHERE ";
	private static final String _SQL_COUNT_MOTCUAANHXATRANGTHAI = "SELECT COUNT(motCuaAnhXaTrangThai) FROM MotCuaAnhXaTrangThai motCuaAnhXaTrangThai";
	private static final String _SQL_COUNT_MOTCUAANHXATRANGTHAI_WHERE = "SELECT COUNT(motCuaAnhXaTrangThai) FROM MotCuaAnhXaTrangThai motCuaAnhXaTrangThai WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "motCuaAnhXaTrangThai.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MotCuaAnhXaTrangThai exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No MotCuaAnhXaTrangThai exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(MotCuaAnhXaTrangThaiPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"maTTCanBo", "maTTDoanhNghiep"
			});
	private static MotCuaAnhXaTrangThai _nullMotCuaAnhXaTrangThai = new MotCuaAnhXaTrangThaiImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<MotCuaAnhXaTrangThai> toCacheModel() {
				return _nullMotCuaAnhXaTrangThaiCacheModel;
			}
		};

	private static CacheModel<MotCuaAnhXaTrangThai> _nullMotCuaAnhXaTrangThaiCacheModel =
		new CacheModel<MotCuaAnhXaTrangThai>() {
			@Override
			public MotCuaAnhXaTrangThai toEntityModel() {
				return _nullMotCuaAnhXaTrangThai;
			}
		};
}