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

package vn.dtt.duongbo.dao.common.service.persistence;

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

import vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException;
import vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.duongbo.dao.common.model.impl.TthcHoSoThuTucImpl;
import vn.dtt.duongbo.dao.common.model.impl.TthcHoSoThuTucModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the tthc ho so thu tuc service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcHoSoThuTucPersistence
 * @see TthcHoSoThuTucUtil
 * @generated
 */
public class TthcHoSoThuTucPersistenceImpl extends BasePersistenceImpl<TthcHoSoThuTuc>
	implements TthcHoSoThuTucPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TthcHoSoThuTucUtil} to access the tthc ho so thu tuc persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TthcHoSoThuTucImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TthcHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
			TthcHoSoThuTucModelImpl.FINDER_CACHE_ENABLED,
			TthcHoSoThuTucImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TthcHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
			TthcHoSoThuTucModelImpl.FINDER_CACHE_ENABLED,
			TthcHoSoThuTucImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TthcHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
			TthcHoSoThuTucModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_MASOHOSO = new FinderPath(TthcHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
			TthcHoSoThuTucModelImpl.FINDER_CACHE_ENABLED,
			TthcHoSoThuTucImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByMaSoHoSo", new String[] { String.class.getName() },
			TthcHoSoThuTucModelImpl.MASOHOSO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MASOHOSO = new FinderPath(TthcHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
			TthcHoSoThuTucModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMaSoHoSo",
			new String[] { String.class.getName() });

	/**
	 * Returns the tthc ho so thu tuc where maSoHoSo = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException} if it could not be found.
	 *
	 * @param maSoHoSo the ma so ho so
	 * @return the matching tthc ho so thu tuc
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException if a matching tthc ho so thu tuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHoSoThuTuc findByMaSoHoSo(String maSoHoSo)
		throws NoSuchTthcHoSoThuTucException, SystemException {
		TthcHoSoThuTuc tthcHoSoThuTuc = fetchByMaSoHoSo(maSoHoSo);

		if (tthcHoSoThuTuc == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("maSoHoSo=");
			msg.append(maSoHoSo);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchTthcHoSoThuTucException(msg.toString());
		}

		return tthcHoSoThuTuc;
	}

	/**
	 * Returns the tthc ho so thu tuc where maSoHoSo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param maSoHoSo the ma so ho so
	 * @return the matching tthc ho so thu tuc, or <code>null</code> if a matching tthc ho so thu tuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHoSoThuTuc fetchByMaSoHoSo(String maSoHoSo)
		throws SystemException {
		return fetchByMaSoHoSo(maSoHoSo, true);
	}

	/**
	 * Returns the tthc ho so thu tuc where maSoHoSo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param maSoHoSo the ma so ho so
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching tthc ho so thu tuc, or <code>null</code> if a matching tthc ho so thu tuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHoSoThuTuc fetchByMaSoHoSo(String maSoHoSo,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { maSoHoSo };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_MASOHOSO,
					finderArgs, this);
		}

		if (result instanceof TthcHoSoThuTuc) {
			TthcHoSoThuTuc tthcHoSoThuTuc = (TthcHoSoThuTuc)result;

			if (!Validator.equals(maSoHoSo, tthcHoSoThuTuc.getMaSoHoSo())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_TTHCHOSOTHUTUC_WHERE);

			boolean bindMaSoHoSo = false;

			if (maSoHoSo == null) {
				query.append(_FINDER_COLUMN_MASOHOSO_MASOHOSO_1);
			}
			else if (maSoHoSo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MASOHOSO_MASOHOSO_3);
			}
			else {
				bindMaSoHoSo = true;

				query.append(_FINDER_COLUMN_MASOHOSO_MASOHOSO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaSoHoSo) {
					qPos.add(maSoHoSo);
				}

				List<TthcHoSoThuTuc> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MASOHOSO,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"TthcHoSoThuTucPersistenceImpl.fetchByMaSoHoSo(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					TthcHoSoThuTuc tthcHoSoThuTuc = list.get(0);

					result = tthcHoSoThuTuc;

					cacheResult(tthcHoSoThuTuc);

					if ((tthcHoSoThuTuc.getMaSoHoSo() == null) ||
							!tthcHoSoThuTuc.getMaSoHoSo().equals(maSoHoSo)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MASOHOSO,
							finderArgs, tthcHoSoThuTuc);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MASOHOSO,
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
			return (TthcHoSoThuTuc)result;
		}
	}

	/**
	 * Removes the tthc ho so thu tuc where maSoHoSo = &#63; from the database.
	 *
	 * @param maSoHoSo the ma so ho so
	 * @return the tthc ho so thu tuc that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHoSoThuTuc removeByMaSoHoSo(String maSoHoSo)
		throws NoSuchTthcHoSoThuTucException, SystemException {
		TthcHoSoThuTuc tthcHoSoThuTuc = findByMaSoHoSo(maSoHoSo);

		return remove(tthcHoSoThuTuc);
	}

	/**
	 * Returns the number of tthc ho so thu tucs where maSoHoSo = &#63;.
	 *
	 * @param maSoHoSo the ma so ho so
	 * @return the number of matching tthc ho so thu tucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByMaSoHoSo(String maSoHoSo) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MASOHOSO;

		Object[] finderArgs = new Object[] { maSoHoSo };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TTHCHOSOTHUTUC_WHERE);

			boolean bindMaSoHoSo = false;

			if (maSoHoSo == null) {
				query.append(_FINDER_COLUMN_MASOHOSO_MASOHOSO_1);
			}
			else if (maSoHoSo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MASOHOSO_MASOHOSO_3);
			}
			else {
				bindMaSoHoSo = true;

				query.append(_FINDER_COLUMN_MASOHOSO_MASOHOSO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaSoHoSo) {
					qPos.add(maSoHoSo);
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

	private static final String _FINDER_COLUMN_MASOHOSO_MASOHOSO_1 = "tthcHoSoThuTuc.maSoHoSo IS NULL";
	private static final String _FINDER_COLUMN_MASOHOSO_MASOHOSO_2 = "tthcHoSoThuTuc.maSoHoSo = ?";
	private static final String _FINDER_COLUMN_MASOHOSO_MASOHOSO_3 = "(tthcHoSoThuTuc.maSoHoSo IS NULL OR tthcHoSoThuTuc.maSoHoSo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NGUOILAMTHUTUCID =
		new FinderPath(TthcHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
			TthcHoSoThuTucModelImpl.FINDER_CACHE_ENABLED,
			TthcHoSoThuTucImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByNguoiLamThuTucId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGUOILAMTHUTUCID =
		new FinderPath(TthcHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
			TthcHoSoThuTucModelImpl.FINDER_CACHE_ENABLED,
			TthcHoSoThuTucImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByNguoiLamThuTucId", new String[] { Long.class.getName() },
			TthcHoSoThuTucModelImpl.NGUOILAMTHUTUCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NGUOILAMTHUTUCID = new FinderPath(TthcHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
			TthcHoSoThuTucModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByNguoiLamThuTucId", new String[] { Long.class.getName() });

	/**
	 * Returns all the tthc ho so thu tucs where nguoiLamThuTucId = &#63;.
	 *
	 * @param nguoiLamThuTucId the nguoi lam thu tuc ID
	 * @return the matching tthc ho so thu tucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcHoSoThuTuc> findByNguoiLamThuTucId(long nguoiLamThuTucId)
		throws SystemException {
		return findByNguoiLamThuTucId(nguoiLamThuTucId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc ho so thu tucs where nguoiLamThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcHoSoThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param nguoiLamThuTucId the nguoi lam thu tuc ID
	 * @param start the lower bound of the range of tthc ho so thu tucs
	 * @param end the upper bound of the range of tthc ho so thu tucs (not inclusive)
	 * @return the range of matching tthc ho so thu tucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcHoSoThuTuc> findByNguoiLamThuTucId(long nguoiLamThuTucId,
		int start, int end) throws SystemException {
		return findByNguoiLamThuTucId(nguoiLamThuTucId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc ho so thu tucs where nguoiLamThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcHoSoThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param nguoiLamThuTucId the nguoi lam thu tuc ID
	 * @param start the lower bound of the range of tthc ho so thu tucs
	 * @param end the upper bound of the range of tthc ho so thu tucs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tthc ho so thu tucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcHoSoThuTuc> findByNguoiLamThuTucId(long nguoiLamThuTucId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGUOILAMTHUTUCID;
			finderArgs = new Object[] { nguoiLamThuTucId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NGUOILAMTHUTUCID;
			finderArgs = new Object[] {
					nguoiLamThuTucId,
					
					start, end, orderByComparator
				};
		}

		List<TthcHoSoThuTuc> list = (List<TthcHoSoThuTuc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TthcHoSoThuTuc tthcHoSoThuTuc : list) {
				if ((nguoiLamThuTucId != tthcHoSoThuTuc.getNguoiLamThuTucId())) {
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

			query.append(_SQL_SELECT_TTHCHOSOTHUTUC_WHERE);

			query.append(_FINDER_COLUMN_NGUOILAMTHUTUCID_NGUOILAMTHUTUCID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TthcHoSoThuTucModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(nguoiLamThuTucId);

				if (!pagination) {
					list = (List<TthcHoSoThuTuc>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcHoSoThuTuc>(list);
				}
				else {
					list = (List<TthcHoSoThuTuc>)QueryUtil.list(q,
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
	 * Returns the first tthc ho so thu tuc in the ordered set where nguoiLamThuTucId = &#63;.
	 *
	 * @param nguoiLamThuTucId the nguoi lam thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc ho so thu tuc
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException if a matching tthc ho so thu tuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHoSoThuTuc findByNguoiLamThuTucId_First(long nguoiLamThuTucId,
		OrderByComparator orderByComparator)
		throws NoSuchTthcHoSoThuTucException, SystemException {
		TthcHoSoThuTuc tthcHoSoThuTuc = fetchByNguoiLamThuTucId_First(nguoiLamThuTucId,
				orderByComparator);

		if (tthcHoSoThuTuc != null) {
			return tthcHoSoThuTuc;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("nguoiLamThuTucId=");
		msg.append(nguoiLamThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcHoSoThuTucException(msg.toString());
	}

	/**
	 * Returns the first tthc ho so thu tuc in the ordered set where nguoiLamThuTucId = &#63;.
	 *
	 * @param nguoiLamThuTucId the nguoi lam thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc ho so thu tuc, or <code>null</code> if a matching tthc ho so thu tuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHoSoThuTuc fetchByNguoiLamThuTucId_First(long nguoiLamThuTucId,
		OrderByComparator orderByComparator) throws SystemException {
		List<TthcHoSoThuTuc> list = findByNguoiLamThuTucId(nguoiLamThuTucId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tthc ho so thu tuc in the ordered set where nguoiLamThuTucId = &#63;.
	 *
	 * @param nguoiLamThuTucId the nguoi lam thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc ho so thu tuc
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException if a matching tthc ho so thu tuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHoSoThuTuc findByNguoiLamThuTucId_Last(long nguoiLamThuTucId,
		OrderByComparator orderByComparator)
		throws NoSuchTthcHoSoThuTucException, SystemException {
		TthcHoSoThuTuc tthcHoSoThuTuc = fetchByNguoiLamThuTucId_Last(nguoiLamThuTucId,
				orderByComparator);

		if (tthcHoSoThuTuc != null) {
			return tthcHoSoThuTuc;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("nguoiLamThuTucId=");
		msg.append(nguoiLamThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcHoSoThuTucException(msg.toString());
	}

	/**
	 * Returns the last tthc ho so thu tuc in the ordered set where nguoiLamThuTucId = &#63;.
	 *
	 * @param nguoiLamThuTucId the nguoi lam thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc ho so thu tuc, or <code>null</code> if a matching tthc ho so thu tuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHoSoThuTuc fetchByNguoiLamThuTucId_Last(long nguoiLamThuTucId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByNguoiLamThuTucId(nguoiLamThuTucId);

		if (count == 0) {
			return null;
		}

		List<TthcHoSoThuTuc> list = findByNguoiLamThuTucId(nguoiLamThuTucId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tthc ho so thu tucs before and after the current tthc ho so thu tuc in the ordered set where nguoiLamThuTucId = &#63;.
	 *
	 * @param id the primary key of the current tthc ho so thu tuc
	 * @param nguoiLamThuTucId the nguoi lam thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tthc ho so thu tuc
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException if a tthc ho so thu tuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHoSoThuTuc[] findByNguoiLamThuTucId_PrevAndNext(long id,
		long nguoiLamThuTucId, OrderByComparator orderByComparator)
		throws NoSuchTthcHoSoThuTucException, SystemException {
		TthcHoSoThuTuc tthcHoSoThuTuc = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TthcHoSoThuTuc[] array = new TthcHoSoThuTucImpl[3];

			array[0] = getByNguoiLamThuTucId_PrevAndNext(session,
					tthcHoSoThuTuc, nguoiLamThuTucId, orderByComparator, true);

			array[1] = tthcHoSoThuTuc;

			array[2] = getByNguoiLamThuTucId_PrevAndNext(session,
					tthcHoSoThuTuc, nguoiLamThuTucId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TthcHoSoThuTuc getByNguoiLamThuTucId_PrevAndNext(
		Session session, TthcHoSoThuTuc tthcHoSoThuTuc, long nguoiLamThuTucId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TTHCHOSOTHUTUC_WHERE);

		query.append(_FINDER_COLUMN_NGUOILAMTHUTUCID_NGUOILAMTHUTUCID_2);

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
			query.append(TthcHoSoThuTucModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(nguoiLamThuTucId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tthcHoSoThuTuc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TthcHoSoThuTuc> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tthc ho so thu tucs where nguoiLamThuTucId = &#63; from the database.
	 *
	 * @param nguoiLamThuTucId the nguoi lam thu tuc ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByNguoiLamThuTucId(long nguoiLamThuTucId)
		throws SystemException {
		for (TthcHoSoThuTuc tthcHoSoThuTuc : findByNguoiLamThuTucId(
				nguoiLamThuTucId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tthcHoSoThuTuc);
		}
	}

	/**
	 * Returns the number of tthc ho so thu tucs where nguoiLamThuTucId = &#63;.
	 *
	 * @param nguoiLamThuTucId the nguoi lam thu tuc ID
	 * @return the number of matching tthc ho so thu tucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByNguoiLamThuTucId(long nguoiLamThuTucId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_NGUOILAMTHUTUCID;

		Object[] finderArgs = new Object[] { nguoiLamThuTucId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TTHCHOSOTHUTUC_WHERE);

			query.append(_FINDER_COLUMN_NGUOILAMTHUTUCID_NGUOILAMTHUTUCID_2);

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

	private static final String _FINDER_COLUMN_NGUOILAMTHUTUCID_NGUOILAMTHUTUCID_2 =
		"tthcHoSoThuTuc.nguoiLamThuTucId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NGUOILAMTHUTUCIDANDTHUTUCHANHCHINHID =
		new FinderPath(TthcHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
			TthcHoSoThuTucModelImpl.FINDER_CACHE_ENABLED,
			TthcHoSoThuTucImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByNguoiLamThuTucIdAndThuTucHanhChinhId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGUOILAMTHUTUCIDANDTHUTUCHANHCHINHID =
		new FinderPath(TthcHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
			TthcHoSoThuTucModelImpl.FINDER_CACHE_ENABLED,
			TthcHoSoThuTucImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByNguoiLamThuTucIdAndThuTucHanhChinhId",
			new String[] { Long.class.getName(), Long.class.getName() },
			TthcHoSoThuTucModelImpl.NGUOILAMTHUTUCID_COLUMN_BITMASK |
			TthcHoSoThuTucModelImpl.THUTUCHANHCHINHID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NGUOILAMTHUTUCIDANDTHUTUCHANHCHINHID =
		new FinderPath(TthcHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
			TthcHoSoThuTucModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByNguoiLamThuTucIdAndThuTucHanhChinhId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the tthc ho so thu tucs where nguoiLamThuTucId = &#63; and thuTucHanhChinhId = &#63;.
	 *
	 * @param nguoiLamThuTucId the nguoi lam thu tuc ID
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @return the matching tthc ho so thu tucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcHoSoThuTuc> findByNguoiLamThuTucIdAndThuTucHanhChinhId(
		long nguoiLamThuTucId, long thuTucHanhChinhId)
		throws SystemException {
		return findByNguoiLamThuTucIdAndThuTucHanhChinhId(nguoiLamThuTucId,
			thuTucHanhChinhId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc ho so thu tucs where nguoiLamThuTucId = &#63; and thuTucHanhChinhId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcHoSoThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param nguoiLamThuTucId the nguoi lam thu tuc ID
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param start the lower bound of the range of tthc ho so thu tucs
	 * @param end the upper bound of the range of tthc ho so thu tucs (not inclusive)
	 * @return the range of matching tthc ho so thu tucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcHoSoThuTuc> findByNguoiLamThuTucIdAndThuTucHanhChinhId(
		long nguoiLamThuTucId, long thuTucHanhChinhId, int start, int end)
		throws SystemException {
		return findByNguoiLamThuTucIdAndThuTucHanhChinhId(nguoiLamThuTucId,
			thuTucHanhChinhId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc ho so thu tucs where nguoiLamThuTucId = &#63; and thuTucHanhChinhId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcHoSoThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param nguoiLamThuTucId the nguoi lam thu tuc ID
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param start the lower bound of the range of tthc ho so thu tucs
	 * @param end the upper bound of the range of tthc ho so thu tucs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tthc ho so thu tucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcHoSoThuTuc> findByNguoiLamThuTucIdAndThuTucHanhChinhId(
		long nguoiLamThuTucId, long thuTucHanhChinhId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGUOILAMTHUTUCIDANDTHUTUCHANHCHINHID;
			finderArgs = new Object[] { nguoiLamThuTucId, thuTucHanhChinhId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NGUOILAMTHUTUCIDANDTHUTUCHANHCHINHID;
			finderArgs = new Object[] {
					nguoiLamThuTucId, thuTucHanhChinhId,
					
					start, end, orderByComparator
				};
		}

		List<TthcHoSoThuTuc> list = (List<TthcHoSoThuTuc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TthcHoSoThuTuc tthcHoSoThuTuc : list) {
				if ((nguoiLamThuTucId != tthcHoSoThuTuc.getNguoiLamThuTucId()) ||
						(thuTucHanhChinhId != tthcHoSoThuTuc.getThuTucHanhChinhId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_TTHCHOSOTHUTUC_WHERE);

			query.append(_FINDER_COLUMN_NGUOILAMTHUTUCIDANDTHUTUCHANHCHINHID_NGUOILAMTHUTUCID_2);

			query.append(_FINDER_COLUMN_NGUOILAMTHUTUCIDANDTHUTUCHANHCHINHID_THUTUCHANHCHINHID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TthcHoSoThuTucModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(nguoiLamThuTucId);

				qPos.add(thuTucHanhChinhId);

				if (!pagination) {
					list = (List<TthcHoSoThuTuc>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcHoSoThuTuc>(list);
				}
				else {
					list = (List<TthcHoSoThuTuc>)QueryUtil.list(q,
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
	 * Returns the first tthc ho so thu tuc in the ordered set where nguoiLamThuTucId = &#63; and thuTucHanhChinhId = &#63;.
	 *
	 * @param nguoiLamThuTucId the nguoi lam thu tuc ID
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc ho so thu tuc
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException if a matching tthc ho so thu tuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHoSoThuTuc findByNguoiLamThuTucIdAndThuTucHanhChinhId_First(
		long nguoiLamThuTucId, long thuTucHanhChinhId,
		OrderByComparator orderByComparator)
		throws NoSuchTthcHoSoThuTucException, SystemException {
		TthcHoSoThuTuc tthcHoSoThuTuc = fetchByNguoiLamThuTucIdAndThuTucHanhChinhId_First(nguoiLamThuTucId,
				thuTucHanhChinhId, orderByComparator);

		if (tthcHoSoThuTuc != null) {
			return tthcHoSoThuTuc;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("nguoiLamThuTucId=");
		msg.append(nguoiLamThuTucId);

		msg.append(", thuTucHanhChinhId=");
		msg.append(thuTucHanhChinhId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcHoSoThuTucException(msg.toString());
	}

	/**
	 * Returns the first tthc ho so thu tuc in the ordered set where nguoiLamThuTucId = &#63; and thuTucHanhChinhId = &#63;.
	 *
	 * @param nguoiLamThuTucId the nguoi lam thu tuc ID
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc ho so thu tuc, or <code>null</code> if a matching tthc ho so thu tuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHoSoThuTuc fetchByNguoiLamThuTucIdAndThuTucHanhChinhId_First(
		long nguoiLamThuTucId, long thuTucHanhChinhId,
		OrderByComparator orderByComparator) throws SystemException {
		List<TthcHoSoThuTuc> list = findByNguoiLamThuTucIdAndThuTucHanhChinhId(nguoiLamThuTucId,
				thuTucHanhChinhId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tthc ho so thu tuc in the ordered set where nguoiLamThuTucId = &#63; and thuTucHanhChinhId = &#63;.
	 *
	 * @param nguoiLamThuTucId the nguoi lam thu tuc ID
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc ho so thu tuc
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException if a matching tthc ho so thu tuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHoSoThuTuc findByNguoiLamThuTucIdAndThuTucHanhChinhId_Last(
		long nguoiLamThuTucId, long thuTucHanhChinhId,
		OrderByComparator orderByComparator)
		throws NoSuchTthcHoSoThuTucException, SystemException {
		TthcHoSoThuTuc tthcHoSoThuTuc = fetchByNguoiLamThuTucIdAndThuTucHanhChinhId_Last(nguoiLamThuTucId,
				thuTucHanhChinhId, orderByComparator);

		if (tthcHoSoThuTuc != null) {
			return tthcHoSoThuTuc;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("nguoiLamThuTucId=");
		msg.append(nguoiLamThuTucId);

		msg.append(", thuTucHanhChinhId=");
		msg.append(thuTucHanhChinhId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcHoSoThuTucException(msg.toString());
	}

	/**
	 * Returns the last tthc ho so thu tuc in the ordered set where nguoiLamThuTucId = &#63; and thuTucHanhChinhId = &#63;.
	 *
	 * @param nguoiLamThuTucId the nguoi lam thu tuc ID
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc ho so thu tuc, or <code>null</code> if a matching tthc ho so thu tuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHoSoThuTuc fetchByNguoiLamThuTucIdAndThuTucHanhChinhId_Last(
		long nguoiLamThuTucId, long thuTucHanhChinhId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByNguoiLamThuTucIdAndThuTucHanhChinhId(nguoiLamThuTucId,
				thuTucHanhChinhId);

		if (count == 0) {
			return null;
		}

		List<TthcHoSoThuTuc> list = findByNguoiLamThuTucIdAndThuTucHanhChinhId(nguoiLamThuTucId,
				thuTucHanhChinhId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tthc ho so thu tucs before and after the current tthc ho so thu tuc in the ordered set where nguoiLamThuTucId = &#63; and thuTucHanhChinhId = &#63;.
	 *
	 * @param id the primary key of the current tthc ho so thu tuc
	 * @param nguoiLamThuTucId the nguoi lam thu tuc ID
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tthc ho so thu tuc
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException if a tthc ho so thu tuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHoSoThuTuc[] findByNguoiLamThuTucIdAndThuTucHanhChinhId_PrevAndNext(
		long id, long nguoiLamThuTucId, long thuTucHanhChinhId,
		OrderByComparator orderByComparator)
		throws NoSuchTthcHoSoThuTucException, SystemException {
		TthcHoSoThuTuc tthcHoSoThuTuc = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TthcHoSoThuTuc[] array = new TthcHoSoThuTucImpl[3];

			array[0] = getByNguoiLamThuTucIdAndThuTucHanhChinhId_PrevAndNext(session,
					tthcHoSoThuTuc, nguoiLamThuTucId, thuTucHanhChinhId,
					orderByComparator, true);

			array[1] = tthcHoSoThuTuc;

			array[2] = getByNguoiLamThuTucIdAndThuTucHanhChinhId_PrevAndNext(session,
					tthcHoSoThuTuc, nguoiLamThuTucId, thuTucHanhChinhId,
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

	protected TthcHoSoThuTuc getByNguoiLamThuTucIdAndThuTucHanhChinhId_PrevAndNext(
		Session session, TthcHoSoThuTuc tthcHoSoThuTuc, long nguoiLamThuTucId,
		long thuTucHanhChinhId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TTHCHOSOTHUTUC_WHERE);

		query.append(_FINDER_COLUMN_NGUOILAMTHUTUCIDANDTHUTUCHANHCHINHID_NGUOILAMTHUTUCID_2);

		query.append(_FINDER_COLUMN_NGUOILAMTHUTUCIDANDTHUTUCHANHCHINHID_THUTUCHANHCHINHID_2);

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
			query.append(TthcHoSoThuTucModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(nguoiLamThuTucId);

		qPos.add(thuTucHanhChinhId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tthcHoSoThuTuc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TthcHoSoThuTuc> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tthc ho so thu tucs where nguoiLamThuTucId = &#63; and thuTucHanhChinhId = &#63; from the database.
	 *
	 * @param nguoiLamThuTucId the nguoi lam thu tuc ID
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByNguoiLamThuTucIdAndThuTucHanhChinhId(
		long nguoiLamThuTucId, long thuTucHanhChinhId)
		throws SystemException {
		for (TthcHoSoThuTuc tthcHoSoThuTuc : findByNguoiLamThuTucIdAndThuTucHanhChinhId(
				nguoiLamThuTucId, thuTucHanhChinhId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tthcHoSoThuTuc);
		}
	}

	/**
	 * Returns the number of tthc ho so thu tucs where nguoiLamThuTucId = &#63; and thuTucHanhChinhId = &#63;.
	 *
	 * @param nguoiLamThuTucId the nguoi lam thu tuc ID
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @return the number of matching tthc ho so thu tucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByNguoiLamThuTucIdAndThuTucHanhChinhId(
		long nguoiLamThuTucId, long thuTucHanhChinhId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_NGUOILAMTHUTUCIDANDTHUTUCHANHCHINHID;

		Object[] finderArgs = new Object[] { nguoiLamThuTucId, thuTucHanhChinhId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TTHCHOSOTHUTUC_WHERE);

			query.append(_FINDER_COLUMN_NGUOILAMTHUTUCIDANDTHUTUCHANHCHINHID_NGUOILAMTHUTUCID_2);

			query.append(_FINDER_COLUMN_NGUOILAMTHUTUCIDANDTHUTUCHANHCHINHID_THUTUCHANHCHINHID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(nguoiLamThuTucId);

				qPos.add(thuTucHanhChinhId);

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

	private static final String _FINDER_COLUMN_NGUOILAMTHUTUCIDANDTHUTUCHANHCHINHID_NGUOILAMTHUTUCID_2 =
		"tthcHoSoThuTuc.nguoiLamThuTucId = ? AND ";
	private static final String _FINDER_COLUMN_NGUOILAMTHUTUCIDANDTHUTUCHANHCHINHID_THUTUCHANHCHINHID_2 =
		"tthcHoSoThuTuc.thuTucHanhChinhId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NGUOITAOANDTHUTUCHANHCHINHID =
		new FinderPath(TthcHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
			TthcHoSoThuTucModelImpl.FINDER_CACHE_ENABLED,
			TthcHoSoThuTucImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByNguoiTaoAndThuTucHanhChinhId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGUOITAOANDTHUTUCHANHCHINHID =
		new FinderPath(TthcHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
			TthcHoSoThuTucModelImpl.FINDER_CACHE_ENABLED,
			TthcHoSoThuTucImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByNguoiTaoAndThuTucHanhChinhId",
			new String[] { Long.class.getName(), Long.class.getName() },
			TthcHoSoThuTucModelImpl.NGUOITAO_COLUMN_BITMASK |
			TthcHoSoThuTucModelImpl.THUTUCHANHCHINHID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NGUOITAOANDTHUTUCHANHCHINHID =
		new FinderPath(TthcHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
			TthcHoSoThuTucModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByNguoiTaoAndThuTucHanhChinhId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the tthc ho so thu tucs where nguoiTao = &#63; and thuTucHanhChinhId = &#63;.
	 *
	 * @param nguoiTao the nguoi tao
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @return the matching tthc ho so thu tucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcHoSoThuTuc> findByNguoiTaoAndThuTucHanhChinhId(
		long nguoiTao, long thuTucHanhChinhId) throws SystemException {
		return findByNguoiTaoAndThuTucHanhChinhId(nguoiTao, thuTucHanhChinhId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc ho so thu tucs where nguoiTao = &#63; and thuTucHanhChinhId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcHoSoThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param nguoiTao the nguoi tao
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param start the lower bound of the range of tthc ho so thu tucs
	 * @param end the upper bound of the range of tthc ho so thu tucs (not inclusive)
	 * @return the range of matching tthc ho so thu tucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcHoSoThuTuc> findByNguoiTaoAndThuTucHanhChinhId(
		long nguoiTao, long thuTucHanhChinhId, int start, int end)
		throws SystemException {
		return findByNguoiTaoAndThuTucHanhChinhId(nguoiTao, thuTucHanhChinhId,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc ho so thu tucs where nguoiTao = &#63; and thuTucHanhChinhId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcHoSoThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param nguoiTao the nguoi tao
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param start the lower bound of the range of tthc ho so thu tucs
	 * @param end the upper bound of the range of tthc ho so thu tucs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tthc ho so thu tucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcHoSoThuTuc> findByNguoiTaoAndThuTucHanhChinhId(
		long nguoiTao, long thuTucHanhChinhId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGUOITAOANDTHUTUCHANHCHINHID;
			finderArgs = new Object[] { nguoiTao, thuTucHanhChinhId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NGUOITAOANDTHUTUCHANHCHINHID;
			finderArgs = new Object[] {
					nguoiTao, thuTucHanhChinhId,
					
					start, end, orderByComparator
				};
		}

		List<TthcHoSoThuTuc> list = (List<TthcHoSoThuTuc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TthcHoSoThuTuc tthcHoSoThuTuc : list) {
				if ((nguoiTao != tthcHoSoThuTuc.getNguoiTao()) ||
						(thuTucHanhChinhId != tthcHoSoThuTuc.getThuTucHanhChinhId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_TTHCHOSOTHUTUC_WHERE);

			query.append(_FINDER_COLUMN_NGUOITAOANDTHUTUCHANHCHINHID_NGUOITAO_2);

			query.append(_FINDER_COLUMN_NGUOITAOANDTHUTUCHANHCHINHID_THUTUCHANHCHINHID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TthcHoSoThuTucModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(nguoiTao);

				qPos.add(thuTucHanhChinhId);

				if (!pagination) {
					list = (List<TthcHoSoThuTuc>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcHoSoThuTuc>(list);
				}
				else {
					list = (List<TthcHoSoThuTuc>)QueryUtil.list(q,
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
	 * Returns the first tthc ho so thu tuc in the ordered set where nguoiTao = &#63; and thuTucHanhChinhId = &#63;.
	 *
	 * @param nguoiTao the nguoi tao
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc ho so thu tuc
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException if a matching tthc ho so thu tuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHoSoThuTuc findByNguoiTaoAndThuTucHanhChinhId_First(
		long nguoiTao, long thuTucHanhChinhId,
		OrderByComparator orderByComparator)
		throws NoSuchTthcHoSoThuTucException, SystemException {
		TthcHoSoThuTuc tthcHoSoThuTuc = fetchByNguoiTaoAndThuTucHanhChinhId_First(nguoiTao,
				thuTucHanhChinhId, orderByComparator);

		if (tthcHoSoThuTuc != null) {
			return tthcHoSoThuTuc;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("nguoiTao=");
		msg.append(nguoiTao);

		msg.append(", thuTucHanhChinhId=");
		msg.append(thuTucHanhChinhId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcHoSoThuTucException(msg.toString());
	}

	/**
	 * Returns the first tthc ho so thu tuc in the ordered set where nguoiTao = &#63; and thuTucHanhChinhId = &#63;.
	 *
	 * @param nguoiTao the nguoi tao
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc ho so thu tuc, or <code>null</code> if a matching tthc ho so thu tuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHoSoThuTuc fetchByNguoiTaoAndThuTucHanhChinhId_First(
		long nguoiTao, long thuTucHanhChinhId,
		OrderByComparator orderByComparator) throws SystemException {
		List<TthcHoSoThuTuc> list = findByNguoiTaoAndThuTucHanhChinhId(nguoiTao,
				thuTucHanhChinhId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tthc ho so thu tuc in the ordered set where nguoiTao = &#63; and thuTucHanhChinhId = &#63;.
	 *
	 * @param nguoiTao the nguoi tao
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc ho so thu tuc
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException if a matching tthc ho so thu tuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHoSoThuTuc findByNguoiTaoAndThuTucHanhChinhId_Last(
		long nguoiTao, long thuTucHanhChinhId,
		OrderByComparator orderByComparator)
		throws NoSuchTthcHoSoThuTucException, SystemException {
		TthcHoSoThuTuc tthcHoSoThuTuc = fetchByNguoiTaoAndThuTucHanhChinhId_Last(nguoiTao,
				thuTucHanhChinhId, orderByComparator);

		if (tthcHoSoThuTuc != null) {
			return tthcHoSoThuTuc;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("nguoiTao=");
		msg.append(nguoiTao);

		msg.append(", thuTucHanhChinhId=");
		msg.append(thuTucHanhChinhId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcHoSoThuTucException(msg.toString());
	}

	/**
	 * Returns the last tthc ho so thu tuc in the ordered set where nguoiTao = &#63; and thuTucHanhChinhId = &#63;.
	 *
	 * @param nguoiTao the nguoi tao
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc ho so thu tuc, or <code>null</code> if a matching tthc ho so thu tuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHoSoThuTuc fetchByNguoiTaoAndThuTucHanhChinhId_Last(
		long nguoiTao, long thuTucHanhChinhId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByNguoiTaoAndThuTucHanhChinhId(nguoiTao,
				thuTucHanhChinhId);

		if (count == 0) {
			return null;
		}

		List<TthcHoSoThuTuc> list = findByNguoiTaoAndThuTucHanhChinhId(nguoiTao,
				thuTucHanhChinhId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tthc ho so thu tucs before and after the current tthc ho so thu tuc in the ordered set where nguoiTao = &#63; and thuTucHanhChinhId = &#63;.
	 *
	 * @param id the primary key of the current tthc ho so thu tuc
	 * @param nguoiTao the nguoi tao
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tthc ho so thu tuc
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException if a tthc ho so thu tuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHoSoThuTuc[] findByNguoiTaoAndThuTucHanhChinhId_PrevAndNext(
		long id, long nguoiTao, long thuTucHanhChinhId,
		OrderByComparator orderByComparator)
		throws NoSuchTthcHoSoThuTucException, SystemException {
		TthcHoSoThuTuc tthcHoSoThuTuc = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TthcHoSoThuTuc[] array = new TthcHoSoThuTucImpl[3];

			array[0] = getByNguoiTaoAndThuTucHanhChinhId_PrevAndNext(session,
					tthcHoSoThuTuc, nguoiTao, thuTucHanhChinhId,
					orderByComparator, true);

			array[1] = tthcHoSoThuTuc;

			array[2] = getByNguoiTaoAndThuTucHanhChinhId_PrevAndNext(session,
					tthcHoSoThuTuc, nguoiTao, thuTucHanhChinhId,
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

	protected TthcHoSoThuTuc getByNguoiTaoAndThuTucHanhChinhId_PrevAndNext(
		Session session, TthcHoSoThuTuc tthcHoSoThuTuc, long nguoiTao,
		long thuTucHanhChinhId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TTHCHOSOTHUTUC_WHERE);

		query.append(_FINDER_COLUMN_NGUOITAOANDTHUTUCHANHCHINHID_NGUOITAO_2);

		query.append(_FINDER_COLUMN_NGUOITAOANDTHUTUCHANHCHINHID_THUTUCHANHCHINHID_2);

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
			query.append(TthcHoSoThuTucModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(nguoiTao);

		qPos.add(thuTucHanhChinhId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tthcHoSoThuTuc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TthcHoSoThuTuc> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tthc ho so thu tucs where nguoiTao = &#63; and thuTucHanhChinhId = &#63; from the database.
	 *
	 * @param nguoiTao the nguoi tao
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByNguoiTaoAndThuTucHanhChinhId(long nguoiTao,
		long thuTucHanhChinhId) throws SystemException {
		for (TthcHoSoThuTuc tthcHoSoThuTuc : findByNguoiTaoAndThuTucHanhChinhId(
				nguoiTao, thuTucHanhChinhId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tthcHoSoThuTuc);
		}
	}

	/**
	 * Returns the number of tthc ho so thu tucs where nguoiTao = &#63; and thuTucHanhChinhId = &#63;.
	 *
	 * @param nguoiTao the nguoi tao
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @return the number of matching tthc ho so thu tucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByNguoiTaoAndThuTucHanhChinhId(long nguoiTao,
		long thuTucHanhChinhId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_NGUOITAOANDTHUTUCHANHCHINHID;

		Object[] finderArgs = new Object[] { nguoiTao, thuTucHanhChinhId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TTHCHOSOTHUTUC_WHERE);

			query.append(_FINDER_COLUMN_NGUOITAOANDTHUTUCHANHCHINHID_NGUOITAO_2);

			query.append(_FINDER_COLUMN_NGUOITAOANDTHUTUCHANHCHINHID_THUTUCHANHCHINHID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(nguoiTao);

				qPos.add(thuTucHanhChinhId);

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

	private static final String _FINDER_COLUMN_NGUOITAOANDTHUTUCHANHCHINHID_NGUOITAO_2 =
		"tthcHoSoThuTuc.nguoiTao = ? AND ";
	private static final String _FINDER_COLUMN_NGUOITAOANDTHUTUCHANHCHINHID_THUTUCHANHCHINHID_2 =
		"tthcHoSoThuTuc.thuTucHanhChinhId = ?";

	public TthcHoSoThuTucPersistenceImpl() {
		setModelClass(TthcHoSoThuTuc.class);
	}

	/**
	 * Caches the tthc ho so thu tuc in the entity cache if it is enabled.
	 *
	 * @param tthcHoSoThuTuc the tthc ho so thu tuc
	 */
	@Override
	public void cacheResult(TthcHoSoThuTuc tthcHoSoThuTuc) {
		EntityCacheUtil.putResult(TthcHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
			TthcHoSoThuTucImpl.class, tthcHoSoThuTuc.getPrimaryKey(),
			tthcHoSoThuTuc);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MASOHOSO,
			new Object[] { tthcHoSoThuTuc.getMaSoHoSo() }, tthcHoSoThuTuc);

		tthcHoSoThuTuc.resetOriginalValues();
	}

	/**
	 * Caches the tthc ho so thu tucs in the entity cache if it is enabled.
	 *
	 * @param tthcHoSoThuTucs the tthc ho so thu tucs
	 */
	@Override
	public void cacheResult(List<TthcHoSoThuTuc> tthcHoSoThuTucs) {
		for (TthcHoSoThuTuc tthcHoSoThuTuc : tthcHoSoThuTucs) {
			if (EntityCacheUtil.getResult(
						TthcHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
						TthcHoSoThuTucImpl.class, tthcHoSoThuTuc.getPrimaryKey()) == null) {
				cacheResult(tthcHoSoThuTuc);
			}
			else {
				tthcHoSoThuTuc.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tthc ho so thu tucs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TthcHoSoThuTucImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TthcHoSoThuTucImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tthc ho so thu tuc.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TthcHoSoThuTuc tthcHoSoThuTuc) {
		EntityCacheUtil.removeResult(TthcHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
			TthcHoSoThuTucImpl.class, tthcHoSoThuTuc.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(tthcHoSoThuTuc);
	}

	@Override
	public void clearCache(List<TthcHoSoThuTuc> tthcHoSoThuTucs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TthcHoSoThuTuc tthcHoSoThuTuc : tthcHoSoThuTucs) {
			EntityCacheUtil.removeResult(TthcHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
				TthcHoSoThuTucImpl.class, tthcHoSoThuTuc.getPrimaryKey());

			clearUniqueFindersCache(tthcHoSoThuTuc);
		}
	}

	protected void cacheUniqueFindersCache(TthcHoSoThuTuc tthcHoSoThuTuc) {
		if (tthcHoSoThuTuc.isNew()) {
			Object[] args = new Object[] { tthcHoSoThuTuc.getMaSoHoSo() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MASOHOSO, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MASOHOSO, args,
				tthcHoSoThuTuc);
		}
		else {
			TthcHoSoThuTucModelImpl tthcHoSoThuTucModelImpl = (TthcHoSoThuTucModelImpl)tthcHoSoThuTuc;

			if ((tthcHoSoThuTucModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_MASOHOSO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { tthcHoSoThuTuc.getMaSoHoSo() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MASOHOSO, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MASOHOSO, args,
					tthcHoSoThuTuc);
			}
		}
	}

	protected void clearUniqueFindersCache(TthcHoSoThuTuc tthcHoSoThuTuc) {
		TthcHoSoThuTucModelImpl tthcHoSoThuTucModelImpl = (TthcHoSoThuTucModelImpl)tthcHoSoThuTuc;

		Object[] args = new Object[] { tthcHoSoThuTuc.getMaSoHoSo() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MASOHOSO, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MASOHOSO, args);

		if ((tthcHoSoThuTucModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_MASOHOSO.getColumnBitmask()) != 0) {
			args = new Object[] { tthcHoSoThuTucModelImpl.getOriginalMaSoHoSo() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MASOHOSO, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MASOHOSO, args);
		}
	}

	/**
	 * Creates a new tthc ho so thu tuc with the primary key. Does not add the tthc ho so thu tuc to the database.
	 *
	 * @param id the primary key for the new tthc ho so thu tuc
	 * @return the new tthc ho so thu tuc
	 */
	@Override
	public TthcHoSoThuTuc create(long id) {
		TthcHoSoThuTuc tthcHoSoThuTuc = new TthcHoSoThuTucImpl();

		tthcHoSoThuTuc.setNew(true);
		tthcHoSoThuTuc.setPrimaryKey(id);

		return tthcHoSoThuTuc;
	}

	/**
	 * Removes the tthc ho so thu tuc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the tthc ho so thu tuc
	 * @return the tthc ho so thu tuc that was removed
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException if a tthc ho so thu tuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHoSoThuTuc remove(long id)
		throws NoSuchTthcHoSoThuTucException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the tthc ho so thu tuc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tthc ho so thu tuc
	 * @return the tthc ho so thu tuc that was removed
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException if a tthc ho so thu tuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHoSoThuTuc remove(Serializable primaryKey)
		throws NoSuchTthcHoSoThuTucException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TthcHoSoThuTuc tthcHoSoThuTuc = (TthcHoSoThuTuc)session.get(TthcHoSoThuTucImpl.class,
					primaryKey);

			if (tthcHoSoThuTuc == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTthcHoSoThuTucException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tthcHoSoThuTuc);
		}
		catch (NoSuchTthcHoSoThuTucException nsee) {
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
	protected TthcHoSoThuTuc removeImpl(TthcHoSoThuTuc tthcHoSoThuTuc)
		throws SystemException {
		tthcHoSoThuTuc = toUnwrappedModel(tthcHoSoThuTuc);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tthcHoSoThuTuc)) {
				tthcHoSoThuTuc = (TthcHoSoThuTuc)session.get(TthcHoSoThuTucImpl.class,
						tthcHoSoThuTuc.getPrimaryKeyObj());
			}

			if (tthcHoSoThuTuc != null) {
				session.delete(tthcHoSoThuTuc);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tthcHoSoThuTuc != null) {
			clearCache(tthcHoSoThuTuc);
		}

		return tthcHoSoThuTuc;
	}

	@Override
	public TthcHoSoThuTuc updateImpl(
		vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc tthcHoSoThuTuc)
		throws SystemException {
		tthcHoSoThuTuc = toUnwrappedModel(tthcHoSoThuTuc);

		boolean isNew = tthcHoSoThuTuc.isNew();

		TthcHoSoThuTucModelImpl tthcHoSoThuTucModelImpl = (TthcHoSoThuTucModelImpl)tthcHoSoThuTuc;

		Session session = null;

		try {
			session = openSession();

			if (tthcHoSoThuTuc.isNew()) {
				session.save(tthcHoSoThuTuc);

				tthcHoSoThuTuc.setNew(false);
			}
			else {
				session.merge(tthcHoSoThuTuc);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TthcHoSoThuTucModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tthcHoSoThuTucModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGUOILAMTHUTUCID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcHoSoThuTucModelImpl.getOriginalNguoiLamThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NGUOILAMTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGUOILAMTHUTUCID,
					args);

				args = new Object[] {
						tthcHoSoThuTucModelImpl.getNguoiLamThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NGUOILAMTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGUOILAMTHUTUCID,
					args);
			}

			if ((tthcHoSoThuTucModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGUOILAMTHUTUCIDANDTHUTUCHANHCHINHID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcHoSoThuTucModelImpl.getOriginalNguoiLamThuTucId(),
						tthcHoSoThuTucModelImpl.getOriginalThuTucHanhChinhId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NGUOILAMTHUTUCIDANDTHUTUCHANHCHINHID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGUOILAMTHUTUCIDANDTHUTUCHANHCHINHID,
					args);

				args = new Object[] {
						tthcHoSoThuTucModelImpl.getNguoiLamThuTucId(),
						tthcHoSoThuTucModelImpl.getThuTucHanhChinhId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NGUOILAMTHUTUCIDANDTHUTUCHANHCHINHID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGUOILAMTHUTUCIDANDTHUTUCHANHCHINHID,
					args);
			}

			if ((tthcHoSoThuTucModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGUOITAOANDTHUTUCHANHCHINHID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcHoSoThuTucModelImpl.getOriginalNguoiTao(),
						tthcHoSoThuTucModelImpl.getOriginalThuTucHanhChinhId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NGUOITAOANDTHUTUCHANHCHINHID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGUOITAOANDTHUTUCHANHCHINHID,
					args);

				args = new Object[] {
						tthcHoSoThuTucModelImpl.getNguoiTao(),
						tthcHoSoThuTucModelImpl.getThuTucHanhChinhId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NGUOITAOANDTHUTUCHANHCHINHID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGUOITAOANDTHUTUCHANHCHINHID,
					args);
			}
		}

		EntityCacheUtil.putResult(TthcHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
			TthcHoSoThuTucImpl.class, tthcHoSoThuTuc.getPrimaryKey(),
			tthcHoSoThuTuc);

		clearUniqueFindersCache(tthcHoSoThuTuc);
		cacheUniqueFindersCache(tthcHoSoThuTuc);

		return tthcHoSoThuTuc;
	}

	protected TthcHoSoThuTuc toUnwrappedModel(TthcHoSoThuTuc tthcHoSoThuTuc) {
		if (tthcHoSoThuTuc instanceof TthcHoSoThuTucImpl) {
			return tthcHoSoThuTuc;
		}

		TthcHoSoThuTucImpl tthcHoSoThuTucImpl = new TthcHoSoThuTucImpl();

		tthcHoSoThuTucImpl.setNew(tthcHoSoThuTuc.isNew());
		tthcHoSoThuTucImpl.setPrimaryKey(tthcHoSoThuTuc.getPrimaryKey());

		tthcHoSoThuTucImpl.setId(tthcHoSoThuTuc.getId());
		tthcHoSoThuTucImpl.setMaSoHoSo(tthcHoSoThuTuc.getMaSoHoSo());
		tthcHoSoThuTucImpl.setMaBienNhan(tthcHoSoThuTuc.getMaBienNhan());
		tthcHoSoThuTucImpl.setThuTucHanhChinhId(tthcHoSoThuTuc.getThuTucHanhChinhId());
		tthcHoSoThuTucImpl.setLoaiChuHoSo(tthcHoSoThuTuc.getLoaiChuHoSo());
		tthcHoSoThuTucImpl.setMaSoChuHoSo(tthcHoSoThuTuc.getMaSoChuHoSo());
		tthcHoSoThuTucImpl.setTenChuHoSo(tthcHoSoThuTuc.getTenChuHoSo());
		tthcHoSoThuTucImpl.setDiaChiChuHoSo(tthcHoSoThuTuc.getDiaChiChuHoSo());
		tthcHoSoThuTucImpl.setMaDonVi(tthcHoSoThuTuc.getMaDonVi());
		tthcHoSoThuTucImpl.setNguonGocHoSo(tthcHoSoThuTuc.getNguonGocHoSo());
		tthcHoSoThuTucImpl.setTrichYeuNoiDung(tthcHoSoThuTuc.getTrichYeuNoiDung());
		tthcHoSoThuTucImpl.setNgayGuiHoSo(tthcHoSoThuTuc.getNgayGuiHoSo());
		tthcHoSoThuTucImpl.setNgayTiepNhan(tthcHoSoThuTuc.getNgayTiepNhan());
		tthcHoSoThuTucImpl.setNgayBoSung(tthcHoSoThuTuc.getNgayBoSung());
		tthcHoSoThuTucImpl.setNgayHenTra(tthcHoSoThuTuc.getNgayHenTra());
		tthcHoSoThuTucImpl.setNgayTraKetQua(tthcHoSoThuTuc.getNgayTraKetQua());
		tthcHoSoThuTucImpl.setNgayDongHoSo(tthcHoSoThuTuc.getNgayDongHoSo());
		tthcHoSoThuTucImpl.setTrangThaiHoSo(tthcHoSoThuTuc.getTrangThaiHoSo());
		tthcHoSoThuTucImpl.setPhanNhomHoSoId(tthcHoSoThuTuc.getPhanNhomHoSoId());
		tthcHoSoThuTucImpl.setMaTinhThanh(tthcHoSoThuTuc.getMaTinhThanh());
		tthcHoSoThuTucImpl.setMaQuanHuyen(tthcHoSoThuTuc.getMaQuanHuyen());
		tthcHoSoThuTucImpl.setMaPhuongXa(tthcHoSoThuTuc.getMaPhuongXa());
		tthcHoSoThuTucImpl.setThongBaoXuLy(tthcHoSoThuTuc.getThongBaoXuLy());
		tthcHoSoThuTucImpl.setToChucQuanLy(tthcHoSoThuTuc.getToChucQuanLy());
		tthcHoSoThuTucImpl.setNgayTao(tthcHoSoThuTuc.getNgayTao());
		tthcHoSoThuTucImpl.setNguoiTao(tthcHoSoThuTuc.getNguoiTao());
		tthcHoSoThuTucImpl.setGhiChu(tthcHoSoThuTuc.getGhiChu());
		tthcHoSoThuTucImpl.setNguoiLamThuTucId(tthcHoSoThuTuc.getNguoiLamThuTucId());

		return tthcHoSoThuTucImpl;
	}

	/**
	 * Returns the tthc ho so thu tuc with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc ho so thu tuc
	 * @return the tthc ho so thu tuc
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException if a tthc ho so thu tuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHoSoThuTuc findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTthcHoSoThuTucException, SystemException {
		TthcHoSoThuTuc tthcHoSoThuTuc = fetchByPrimaryKey(primaryKey);

		if (tthcHoSoThuTuc == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTthcHoSoThuTucException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tthcHoSoThuTuc;
	}

	/**
	 * Returns the tthc ho so thu tuc with the primary key or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException} if it could not be found.
	 *
	 * @param id the primary key of the tthc ho so thu tuc
	 * @return the tthc ho so thu tuc
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException if a tthc ho so thu tuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHoSoThuTuc findByPrimaryKey(long id)
		throws NoSuchTthcHoSoThuTucException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the tthc ho so thu tuc with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc ho so thu tuc
	 * @return the tthc ho so thu tuc, or <code>null</code> if a tthc ho so thu tuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHoSoThuTuc fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TthcHoSoThuTuc tthcHoSoThuTuc = (TthcHoSoThuTuc)EntityCacheUtil.getResult(TthcHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
				TthcHoSoThuTucImpl.class, primaryKey);

		if (tthcHoSoThuTuc == _nullTthcHoSoThuTuc) {
			return null;
		}

		if (tthcHoSoThuTuc == null) {
			Session session = null;

			try {
				session = openSession();

				tthcHoSoThuTuc = (TthcHoSoThuTuc)session.get(TthcHoSoThuTucImpl.class,
						primaryKey);

				if (tthcHoSoThuTuc != null) {
					cacheResult(tthcHoSoThuTuc);
				}
				else {
					EntityCacheUtil.putResult(TthcHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
						TthcHoSoThuTucImpl.class, primaryKey,
						_nullTthcHoSoThuTuc);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TthcHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
					TthcHoSoThuTucImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tthcHoSoThuTuc;
	}

	/**
	 * Returns the tthc ho so thu tuc with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the tthc ho so thu tuc
	 * @return the tthc ho so thu tuc, or <code>null</code> if a tthc ho so thu tuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHoSoThuTuc fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the tthc ho so thu tucs.
	 *
	 * @return the tthc ho so thu tucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcHoSoThuTuc> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc ho so thu tucs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcHoSoThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc ho so thu tucs
	 * @param end the upper bound of the range of tthc ho so thu tucs (not inclusive)
	 * @return the range of tthc ho so thu tucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcHoSoThuTuc> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc ho so thu tucs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcHoSoThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc ho so thu tucs
	 * @param end the upper bound of the range of tthc ho so thu tucs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tthc ho so thu tucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcHoSoThuTuc> findAll(int start, int end,
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

		List<TthcHoSoThuTuc> list = (List<TthcHoSoThuTuc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TTHCHOSOTHUTUC);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TTHCHOSOTHUTUC;

				if (pagination) {
					sql = sql.concat(TthcHoSoThuTucModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TthcHoSoThuTuc>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcHoSoThuTuc>(list);
				}
				else {
					list = (List<TthcHoSoThuTuc>)QueryUtil.list(q,
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
	 * Removes all the tthc ho so thu tucs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TthcHoSoThuTuc tthcHoSoThuTuc : findAll()) {
			remove(tthcHoSoThuTuc);
		}
	}

	/**
	 * Returns the number of tthc ho so thu tucs.
	 *
	 * @return the number of tthc ho so thu tucs
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

				Query q = session.createQuery(_SQL_COUNT_TTHCHOSOTHUTUC);

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
	 * Initializes the tthc ho so thu tuc persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TthcHoSoThuTuc>> listenersList = new ArrayList<ModelListener<TthcHoSoThuTuc>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TthcHoSoThuTuc>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TthcHoSoThuTucImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TTHCHOSOTHUTUC = "SELECT tthcHoSoThuTuc FROM TthcHoSoThuTuc tthcHoSoThuTuc";
	private static final String _SQL_SELECT_TTHCHOSOTHUTUC_WHERE = "SELECT tthcHoSoThuTuc FROM TthcHoSoThuTuc tthcHoSoThuTuc WHERE ";
	private static final String _SQL_COUNT_TTHCHOSOTHUTUC = "SELECT COUNT(tthcHoSoThuTuc) FROM TthcHoSoThuTuc tthcHoSoThuTuc";
	private static final String _SQL_COUNT_TTHCHOSOTHUTUC_WHERE = "SELECT COUNT(tthcHoSoThuTuc) FROM TthcHoSoThuTuc tthcHoSoThuTuc WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tthcHoSoThuTuc.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TthcHoSoThuTuc exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TthcHoSoThuTuc exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TthcHoSoThuTucPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"maSoHoSo", "maBienNhan", "thuTucHanhChinhId", "loaiChuHoSo",
				"maSoChuHoSo", "tenChuHoSo", "diaChiChuHoSo", "maDonVi",
				"nguonGocHoSo", "trichYeuNoiDung", "ngayGuiHoSo", "ngayTiepNhan",
				"ngayBoSung", "ngayHenTra", "ngayTraKetQua", "ngayDongHoSo",
				"trangThaiHoSo", "phanNhomHoSoId", "maTinhThanh", "maQuanHuyen",
				"maPhuongXa", "thongBaoXuLy", "toChucQuanLy", "ngayTao",
				"nguoiTao", "ghiChu", "nguoiLamThuTucId"
			});
	private static TthcHoSoThuTuc _nullTthcHoSoThuTuc = new TthcHoSoThuTucImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TthcHoSoThuTuc> toCacheModel() {
				return _nullTthcHoSoThuTucCacheModel;
			}
		};

	private static CacheModel<TthcHoSoThuTuc> _nullTthcHoSoThuTucCacheModel = new CacheModel<TthcHoSoThuTuc>() {
			@Override
			public TthcHoSoThuTuc toEntityModel() {
				return _nullTthcHoSoThuTuc;
			}
		};
}