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
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException;
import vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy;
import vn.dtt.duongbo.dao.motcua.model.impl.MotCuaPhieuXuLyImpl;
import vn.dtt.duongbo.dao.motcua.model.impl.MotCuaPhieuXuLyModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the mot cua phieu xu ly service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see MotCuaPhieuXuLyPersistence
 * @see MotCuaPhieuXuLyUtil
 * @generated
 */
public class MotCuaPhieuXuLyPersistenceImpl extends BasePersistenceImpl<MotCuaPhieuXuLy>
	implements MotCuaPhieuXuLyPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link MotCuaPhieuXuLyUtil} to access the mot cua phieu xu ly persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = MotCuaPhieuXuLyImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MotCuaPhieuXuLyModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyModelImpl.FINDER_CACHE_ENABLED,
			MotCuaPhieuXuLyImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MotCuaPhieuXuLyModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyModelImpl.FINDER_CACHE_ENABLED,
			MotCuaPhieuXuLyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MotCuaPhieuXuLyModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDQUYTRINHTHUTUCID =
		new FinderPath(MotCuaPhieuXuLyModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyModelImpl.FINDER_CACHE_ENABLED,
			MotCuaPhieuXuLyImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByHoSoThuTucIdAndQuyTrinhThuTucId",
			new String[] { Long.class.getName(), Long.class.getName() },
			MotCuaPhieuXuLyModelImpl.HOSOTHUTUCID_COLUMN_BITMASK |
			MotCuaPhieuXuLyModelImpl.QUYTRINHTHUTUCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDQUYTRINHTHUTUCID =
		new FinderPath(MotCuaPhieuXuLyModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByHoSoThuTucIdAndQuyTrinhThuTucId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the mot cua phieu xu ly where hoSoThuTucId = &#63; and quyTrinhThuTucId = &#63; or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException} if it could not be found.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @return the matching mot cua phieu xu ly
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException if a matching mot cua phieu xu ly could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLy findByHoSoThuTucIdAndQuyTrinhThuTucId(
		long hoSoThuTucId, long quyTrinhThuTucId)
		throws NoSuchMotCuaPhieuXuLyException, SystemException {
		MotCuaPhieuXuLy motCuaPhieuXuLy = fetchByHoSoThuTucIdAndQuyTrinhThuTucId(hoSoThuTucId,
				quyTrinhThuTucId);

		if (motCuaPhieuXuLy == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("hoSoThuTucId=");
			msg.append(hoSoThuTucId);

			msg.append(", quyTrinhThuTucId=");
			msg.append(quyTrinhThuTucId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchMotCuaPhieuXuLyException(msg.toString());
		}

		return motCuaPhieuXuLy;
	}

	/**
	 * Returns the mot cua phieu xu ly where hoSoThuTucId = &#63; and quyTrinhThuTucId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @return the matching mot cua phieu xu ly, or <code>null</code> if a matching mot cua phieu xu ly could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLy fetchByHoSoThuTucIdAndQuyTrinhThuTucId(
		long hoSoThuTucId, long quyTrinhThuTucId) throws SystemException {
		return fetchByHoSoThuTucIdAndQuyTrinhThuTucId(hoSoThuTucId,
			quyTrinhThuTucId, true);
	}

	/**
	 * Returns the mot cua phieu xu ly where hoSoThuTucId = &#63; and quyTrinhThuTucId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching mot cua phieu xu ly, or <code>null</code> if a matching mot cua phieu xu ly could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLy fetchByHoSoThuTucIdAndQuyTrinhThuTucId(
		long hoSoThuTucId, long quyTrinhThuTucId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { hoSoThuTucId, quyTrinhThuTucId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDQUYTRINHTHUTUCID,
					finderArgs, this);
		}

		if (result instanceof MotCuaPhieuXuLy) {
			MotCuaPhieuXuLy motCuaPhieuXuLy = (MotCuaPhieuXuLy)result;

			if ((hoSoThuTucId != motCuaPhieuXuLy.getHoSoThuTucId()) ||
					(quyTrinhThuTucId != motCuaPhieuXuLy.getQuyTrinhThuTucId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_MOTCUAPHIEUXULY_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCIDANDQUYTRINHTHUTUCID_HOSOTHUTUCID_2);

			query.append(_FINDER_COLUMN_HOSOTHUTUCIDANDQUYTRINHTHUTUCID_QUYTRINHTHUTUCID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				qPos.add(quyTrinhThuTucId);

				List<MotCuaPhieuXuLy> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDQUYTRINHTHUTUCID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"MotCuaPhieuXuLyPersistenceImpl.fetchByHoSoThuTucIdAndQuyTrinhThuTucId(long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					MotCuaPhieuXuLy motCuaPhieuXuLy = list.get(0);

					result = motCuaPhieuXuLy;

					cacheResult(motCuaPhieuXuLy);

					if ((motCuaPhieuXuLy.getHoSoThuTucId() != hoSoThuTucId) ||
							(motCuaPhieuXuLy.getQuyTrinhThuTucId() != quyTrinhThuTucId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDQUYTRINHTHUTUCID,
							finderArgs, motCuaPhieuXuLy);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDQUYTRINHTHUTUCID,
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
			return (MotCuaPhieuXuLy)result;
		}
	}

	/**
	 * Removes the mot cua phieu xu ly where hoSoThuTucId = &#63; and quyTrinhThuTucId = &#63; from the database.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @return the mot cua phieu xu ly that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLy removeByHoSoThuTucIdAndQuyTrinhThuTucId(
		long hoSoThuTucId, long quyTrinhThuTucId)
		throws NoSuchMotCuaPhieuXuLyException, SystemException {
		MotCuaPhieuXuLy motCuaPhieuXuLy = findByHoSoThuTucIdAndQuyTrinhThuTucId(hoSoThuTucId,
				quyTrinhThuTucId);

		return remove(motCuaPhieuXuLy);
	}

	/**
	 * Returns the number of mot cua phieu xu lies where hoSoThuTucId = &#63; and quyTrinhThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @return the number of matching mot cua phieu xu lies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByHoSoThuTucIdAndQuyTrinhThuTucId(long hoSoThuTucId,
		long quyTrinhThuTucId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDQUYTRINHTHUTUCID;

		Object[] finderArgs = new Object[] { hoSoThuTucId, quyTrinhThuTucId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_MOTCUAPHIEUXULY_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCIDANDQUYTRINHTHUTUCID_HOSOTHUTUCID_2);

			query.append(_FINDER_COLUMN_HOSOTHUTUCIDANDQUYTRINHTHUTUCID_QUYTRINHTHUTUCID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				qPos.add(quyTrinhThuTucId);

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

	private static final String _FINDER_COLUMN_HOSOTHUTUCIDANDQUYTRINHTHUTUCID_HOSOTHUTUCID_2 =
		"motCuaPhieuXuLy.hoSoThuTucId = ? AND ";
	private static final String _FINDER_COLUMN_HOSOTHUTUCIDANDQUYTRINHTHUTUCID_QUYTRINHTHUTUCID_2 =
		"motCuaPhieuXuLy.quyTrinhThuTucId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TOCHUCQUANLYANDPHANNHOMHOSO =
		new FinderPath(MotCuaPhieuXuLyModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyModelImpl.FINDER_CACHE_ENABLED,
			MotCuaPhieuXuLyImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByToChucQuanLyAndPhanNhomHoSo",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOCHUCQUANLYANDPHANNHOMHOSO =
		new FinderPath(MotCuaPhieuXuLyModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyModelImpl.FINDER_CACHE_ENABLED,
			MotCuaPhieuXuLyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByToChucQuanLyAndPhanNhomHoSo",
			new String[] { Long.class.getName(), Long.class.getName() },
			MotCuaPhieuXuLyModelImpl.TOCHUCQUANLY_COLUMN_BITMASK |
			MotCuaPhieuXuLyModelImpl.PHANNHOMHOSOID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TOCHUCQUANLYANDPHANNHOMHOSO =
		new FinderPath(MotCuaPhieuXuLyModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByToChucQuanLyAndPhanNhomHoSo",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the mot cua phieu xu lies where toChucQuanLy = &#63; and phanNhomHoSoId = &#63;.
	 *
	 * @param toChucQuanLy the to chuc quan ly
	 * @param phanNhomHoSoId the phan nhom ho so ID
	 * @return the matching mot cua phieu xu lies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaPhieuXuLy> findByToChucQuanLyAndPhanNhomHoSo(
		long toChucQuanLy, long phanNhomHoSoId) throws SystemException {
		return findByToChucQuanLyAndPhanNhomHoSo(toChucQuanLy, phanNhomHoSoId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua phieu xu lies where toChucQuanLy = &#63; and phanNhomHoSoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaPhieuXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param toChucQuanLy the to chuc quan ly
	 * @param phanNhomHoSoId the phan nhom ho so ID
	 * @param start the lower bound of the range of mot cua phieu xu lies
	 * @param end the upper bound of the range of mot cua phieu xu lies (not inclusive)
	 * @return the range of matching mot cua phieu xu lies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaPhieuXuLy> findByToChucQuanLyAndPhanNhomHoSo(
		long toChucQuanLy, long phanNhomHoSoId, int start, int end)
		throws SystemException {
		return findByToChucQuanLyAndPhanNhomHoSo(toChucQuanLy, phanNhomHoSoId,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua phieu xu lies where toChucQuanLy = &#63; and phanNhomHoSoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaPhieuXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param toChucQuanLy the to chuc quan ly
	 * @param phanNhomHoSoId the phan nhom ho so ID
	 * @param start the lower bound of the range of mot cua phieu xu lies
	 * @param end the upper bound of the range of mot cua phieu xu lies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mot cua phieu xu lies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaPhieuXuLy> findByToChucQuanLyAndPhanNhomHoSo(
		long toChucQuanLy, long phanNhomHoSoId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOCHUCQUANLYANDPHANNHOMHOSO;
			finderArgs = new Object[] { toChucQuanLy, phanNhomHoSoId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TOCHUCQUANLYANDPHANNHOMHOSO;
			finderArgs = new Object[] {
					toChucQuanLy, phanNhomHoSoId,
					
					start, end, orderByComparator
				};
		}

		List<MotCuaPhieuXuLy> list = (List<MotCuaPhieuXuLy>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MotCuaPhieuXuLy motCuaPhieuXuLy : list) {
				if ((toChucQuanLy != motCuaPhieuXuLy.getToChucQuanLy()) ||
						(phanNhomHoSoId != motCuaPhieuXuLy.getPhanNhomHoSoId())) {
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

			query.append(_SQL_SELECT_MOTCUAPHIEUXULY_WHERE);

			query.append(_FINDER_COLUMN_TOCHUCQUANLYANDPHANNHOMHOSO_TOCHUCQUANLY_2);

			query.append(_FINDER_COLUMN_TOCHUCQUANLYANDPHANNHOMHOSO_PHANNHOMHOSOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MotCuaPhieuXuLyModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(toChucQuanLy);

				qPos.add(phanNhomHoSoId);

				if (!pagination) {
					list = (List<MotCuaPhieuXuLy>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaPhieuXuLy>(list);
				}
				else {
					list = (List<MotCuaPhieuXuLy>)QueryUtil.list(q,
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
	 * Returns the first mot cua phieu xu ly in the ordered set where toChucQuanLy = &#63; and phanNhomHoSoId = &#63;.
	 *
	 * @param toChucQuanLy the to chuc quan ly
	 * @param phanNhomHoSoId the phan nhom ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua phieu xu ly
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException if a matching mot cua phieu xu ly could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLy findByToChucQuanLyAndPhanNhomHoSo_First(
		long toChucQuanLy, long phanNhomHoSoId,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaPhieuXuLyException, SystemException {
		MotCuaPhieuXuLy motCuaPhieuXuLy = fetchByToChucQuanLyAndPhanNhomHoSo_First(toChucQuanLy,
				phanNhomHoSoId, orderByComparator);

		if (motCuaPhieuXuLy != null) {
			return motCuaPhieuXuLy;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("toChucQuanLy=");
		msg.append(toChucQuanLy);

		msg.append(", phanNhomHoSoId=");
		msg.append(phanNhomHoSoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaPhieuXuLyException(msg.toString());
	}

	/**
	 * Returns the first mot cua phieu xu ly in the ordered set where toChucQuanLy = &#63; and phanNhomHoSoId = &#63;.
	 *
	 * @param toChucQuanLy the to chuc quan ly
	 * @param phanNhomHoSoId the phan nhom ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua phieu xu ly, or <code>null</code> if a matching mot cua phieu xu ly could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLy fetchByToChucQuanLyAndPhanNhomHoSo_First(
		long toChucQuanLy, long phanNhomHoSoId,
		OrderByComparator orderByComparator) throws SystemException {
		List<MotCuaPhieuXuLy> list = findByToChucQuanLyAndPhanNhomHoSo(toChucQuanLy,
				phanNhomHoSoId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mot cua phieu xu ly in the ordered set where toChucQuanLy = &#63; and phanNhomHoSoId = &#63;.
	 *
	 * @param toChucQuanLy the to chuc quan ly
	 * @param phanNhomHoSoId the phan nhom ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua phieu xu ly
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException if a matching mot cua phieu xu ly could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLy findByToChucQuanLyAndPhanNhomHoSo_Last(
		long toChucQuanLy, long phanNhomHoSoId,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaPhieuXuLyException, SystemException {
		MotCuaPhieuXuLy motCuaPhieuXuLy = fetchByToChucQuanLyAndPhanNhomHoSo_Last(toChucQuanLy,
				phanNhomHoSoId, orderByComparator);

		if (motCuaPhieuXuLy != null) {
			return motCuaPhieuXuLy;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("toChucQuanLy=");
		msg.append(toChucQuanLy);

		msg.append(", phanNhomHoSoId=");
		msg.append(phanNhomHoSoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaPhieuXuLyException(msg.toString());
	}

	/**
	 * Returns the last mot cua phieu xu ly in the ordered set where toChucQuanLy = &#63; and phanNhomHoSoId = &#63;.
	 *
	 * @param toChucQuanLy the to chuc quan ly
	 * @param phanNhomHoSoId the phan nhom ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua phieu xu ly, or <code>null</code> if a matching mot cua phieu xu ly could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLy fetchByToChucQuanLyAndPhanNhomHoSo_Last(
		long toChucQuanLy, long phanNhomHoSoId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByToChucQuanLyAndPhanNhomHoSo(toChucQuanLy,
				phanNhomHoSoId);

		if (count == 0) {
			return null;
		}

		List<MotCuaPhieuXuLy> list = findByToChucQuanLyAndPhanNhomHoSo(toChucQuanLy,
				phanNhomHoSoId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mot cua phieu xu lies before and after the current mot cua phieu xu ly in the ordered set where toChucQuanLy = &#63; and phanNhomHoSoId = &#63;.
	 *
	 * @param id the primary key of the current mot cua phieu xu ly
	 * @param toChucQuanLy the to chuc quan ly
	 * @param phanNhomHoSoId the phan nhom ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mot cua phieu xu ly
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException if a mot cua phieu xu ly with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLy[] findByToChucQuanLyAndPhanNhomHoSo_PrevAndNext(
		long id, long toChucQuanLy, long phanNhomHoSoId,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaPhieuXuLyException, SystemException {
		MotCuaPhieuXuLy motCuaPhieuXuLy = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			MotCuaPhieuXuLy[] array = new MotCuaPhieuXuLyImpl[3];

			array[0] = getByToChucQuanLyAndPhanNhomHoSo_PrevAndNext(session,
					motCuaPhieuXuLy, toChucQuanLy, phanNhomHoSoId,
					orderByComparator, true);

			array[1] = motCuaPhieuXuLy;

			array[2] = getByToChucQuanLyAndPhanNhomHoSo_PrevAndNext(session,
					motCuaPhieuXuLy, toChucQuanLy, phanNhomHoSoId,
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

	protected MotCuaPhieuXuLy getByToChucQuanLyAndPhanNhomHoSo_PrevAndNext(
		Session session, MotCuaPhieuXuLy motCuaPhieuXuLy, long toChucQuanLy,
		long phanNhomHoSoId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MOTCUAPHIEUXULY_WHERE);

		query.append(_FINDER_COLUMN_TOCHUCQUANLYANDPHANNHOMHOSO_TOCHUCQUANLY_2);

		query.append(_FINDER_COLUMN_TOCHUCQUANLYANDPHANNHOMHOSO_PHANNHOMHOSOID_2);

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
			query.append(MotCuaPhieuXuLyModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(toChucQuanLy);

		qPos.add(phanNhomHoSoId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(motCuaPhieuXuLy);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MotCuaPhieuXuLy> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mot cua phieu xu lies where toChucQuanLy = &#63; and phanNhomHoSoId = &#63; from the database.
	 *
	 * @param toChucQuanLy the to chuc quan ly
	 * @param phanNhomHoSoId the phan nhom ho so ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByToChucQuanLyAndPhanNhomHoSo(long toChucQuanLy,
		long phanNhomHoSoId) throws SystemException {
		for (MotCuaPhieuXuLy motCuaPhieuXuLy : findByToChucQuanLyAndPhanNhomHoSo(
				toChucQuanLy, phanNhomHoSoId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(motCuaPhieuXuLy);
		}
	}

	/**
	 * Returns the number of mot cua phieu xu lies where toChucQuanLy = &#63; and phanNhomHoSoId = &#63;.
	 *
	 * @param toChucQuanLy the to chuc quan ly
	 * @param phanNhomHoSoId the phan nhom ho so ID
	 * @return the number of matching mot cua phieu xu lies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByToChucQuanLyAndPhanNhomHoSo(long toChucQuanLy,
		long phanNhomHoSoId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TOCHUCQUANLYANDPHANNHOMHOSO;

		Object[] finderArgs = new Object[] { toChucQuanLy, phanNhomHoSoId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_MOTCUAPHIEUXULY_WHERE);

			query.append(_FINDER_COLUMN_TOCHUCQUANLYANDPHANNHOMHOSO_TOCHUCQUANLY_2);

			query.append(_FINDER_COLUMN_TOCHUCQUANLYANDPHANNHOMHOSO_PHANNHOMHOSOID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(toChucQuanLy);

				qPos.add(phanNhomHoSoId);

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

	private static final String _FINDER_COLUMN_TOCHUCQUANLYANDPHANNHOMHOSO_TOCHUCQUANLY_2 =
		"motCuaPhieuXuLy.toChucQuanLy = ? AND ";
	private static final String _FINDER_COLUMN_TOCHUCQUANLYANDPHANNHOMHOSO_PHANNHOMHOSOID_2 =
		"motCuaPhieuXuLy.phanNhomHoSoId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TOCHUCQUANLYID =
		new FinderPath(MotCuaPhieuXuLyModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyModelImpl.FINDER_CACHE_ENABLED,
			MotCuaPhieuXuLyImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByToChucQuanLyId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOCHUCQUANLYID =
		new FinderPath(MotCuaPhieuXuLyModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyModelImpl.FINDER_CACHE_ENABLED,
			MotCuaPhieuXuLyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByToChucQuanLyId",
			new String[] { Long.class.getName() },
			MotCuaPhieuXuLyModelImpl.TOCHUCQUANLY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TOCHUCQUANLYID = new FinderPath(MotCuaPhieuXuLyModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByToChucQuanLyId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the mot cua phieu xu lies where toChucQuanLy = &#63;.
	 *
	 * @param toChucQuanLy the to chuc quan ly
	 * @return the matching mot cua phieu xu lies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaPhieuXuLy> findByToChucQuanLyId(long toChucQuanLy)
		throws SystemException {
		return findByToChucQuanLyId(toChucQuanLy, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua phieu xu lies where toChucQuanLy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaPhieuXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param toChucQuanLy the to chuc quan ly
	 * @param start the lower bound of the range of mot cua phieu xu lies
	 * @param end the upper bound of the range of mot cua phieu xu lies (not inclusive)
	 * @return the range of matching mot cua phieu xu lies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaPhieuXuLy> findByToChucQuanLyId(long toChucQuanLy,
		int start, int end) throws SystemException {
		return findByToChucQuanLyId(toChucQuanLy, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua phieu xu lies where toChucQuanLy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaPhieuXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param toChucQuanLy the to chuc quan ly
	 * @param start the lower bound of the range of mot cua phieu xu lies
	 * @param end the upper bound of the range of mot cua phieu xu lies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mot cua phieu xu lies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaPhieuXuLy> findByToChucQuanLyId(long toChucQuanLy,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOCHUCQUANLYID;
			finderArgs = new Object[] { toChucQuanLy };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TOCHUCQUANLYID;
			finderArgs = new Object[] {
					toChucQuanLy,
					
					start, end, orderByComparator
				};
		}

		List<MotCuaPhieuXuLy> list = (List<MotCuaPhieuXuLy>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MotCuaPhieuXuLy motCuaPhieuXuLy : list) {
				if ((toChucQuanLy != motCuaPhieuXuLy.getToChucQuanLy())) {
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

			query.append(_SQL_SELECT_MOTCUAPHIEUXULY_WHERE);

			query.append(_FINDER_COLUMN_TOCHUCQUANLYID_TOCHUCQUANLY_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MotCuaPhieuXuLyModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(toChucQuanLy);

				if (!pagination) {
					list = (List<MotCuaPhieuXuLy>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaPhieuXuLy>(list);
				}
				else {
					list = (List<MotCuaPhieuXuLy>)QueryUtil.list(q,
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
	 * Returns the first mot cua phieu xu ly in the ordered set where toChucQuanLy = &#63;.
	 *
	 * @param toChucQuanLy the to chuc quan ly
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua phieu xu ly
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException if a matching mot cua phieu xu ly could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLy findByToChucQuanLyId_First(long toChucQuanLy,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaPhieuXuLyException, SystemException {
		MotCuaPhieuXuLy motCuaPhieuXuLy = fetchByToChucQuanLyId_First(toChucQuanLy,
				orderByComparator);

		if (motCuaPhieuXuLy != null) {
			return motCuaPhieuXuLy;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("toChucQuanLy=");
		msg.append(toChucQuanLy);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaPhieuXuLyException(msg.toString());
	}

	/**
	 * Returns the first mot cua phieu xu ly in the ordered set where toChucQuanLy = &#63;.
	 *
	 * @param toChucQuanLy the to chuc quan ly
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua phieu xu ly, or <code>null</code> if a matching mot cua phieu xu ly could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLy fetchByToChucQuanLyId_First(long toChucQuanLy,
		OrderByComparator orderByComparator) throws SystemException {
		List<MotCuaPhieuXuLy> list = findByToChucQuanLyId(toChucQuanLy, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mot cua phieu xu ly in the ordered set where toChucQuanLy = &#63;.
	 *
	 * @param toChucQuanLy the to chuc quan ly
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua phieu xu ly
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException if a matching mot cua phieu xu ly could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLy findByToChucQuanLyId_Last(long toChucQuanLy,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaPhieuXuLyException, SystemException {
		MotCuaPhieuXuLy motCuaPhieuXuLy = fetchByToChucQuanLyId_Last(toChucQuanLy,
				orderByComparator);

		if (motCuaPhieuXuLy != null) {
			return motCuaPhieuXuLy;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("toChucQuanLy=");
		msg.append(toChucQuanLy);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaPhieuXuLyException(msg.toString());
	}

	/**
	 * Returns the last mot cua phieu xu ly in the ordered set where toChucQuanLy = &#63;.
	 *
	 * @param toChucQuanLy the to chuc quan ly
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua phieu xu ly, or <code>null</code> if a matching mot cua phieu xu ly could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLy fetchByToChucQuanLyId_Last(long toChucQuanLy,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByToChucQuanLyId(toChucQuanLy);

		if (count == 0) {
			return null;
		}

		List<MotCuaPhieuXuLy> list = findByToChucQuanLyId(toChucQuanLy,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mot cua phieu xu lies before and after the current mot cua phieu xu ly in the ordered set where toChucQuanLy = &#63;.
	 *
	 * @param id the primary key of the current mot cua phieu xu ly
	 * @param toChucQuanLy the to chuc quan ly
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mot cua phieu xu ly
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException if a mot cua phieu xu ly with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLy[] findByToChucQuanLyId_PrevAndNext(long id,
		long toChucQuanLy, OrderByComparator orderByComparator)
		throws NoSuchMotCuaPhieuXuLyException, SystemException {
		MotCuaPhieuXuLy motCuaPhieuXuLy = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			MotCuaPhieuXuLy[] array = new MotCuaPhieuXuLyImpl[3];

			array[0] = getByToChucQuanLyId_PrevAndNext(session,
					motCuaPhieuXuLy, toChucQuanLy, orderByComparator, true);

			array[1] = motCuaPhieuXuLy;

			array[2] = getByToChucQuanLyId_PrevAndNext(session,
					motCuaPhieuXuLy, toChucQuanLy, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected MotCuaPhieuXuLy getByToChucQuanLyId_PrevAndNext(Session session,
		MotCuaPhieuXuLy motCuaPhieuXuLy, long toChucQuanLy,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MOTCUAPHIEUXULY_WHERE);

		query.append(_FINDER_COLUMN_TOCHUCQUANLYID_TOCHUCQUANLY_2);

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
			query.append(MotCuaPhieuXuLyModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(toChucQuanLy);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(motCuaPhieuXuLy);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MotCuaPhieuXuLy> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mot cua phieu xu lies where toChucQuanLy = &#63; from the database.
	 *
	 * @param toChucQuanLy the to chuc quan ly
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByToChucQuanLyId(long toChucQuanLy)
		throws SystemException {
		for (MotCuaPhieuXuLy motCuaPhieuXuLy : findByToChucQuanLyId(
				toChucQuanLy, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(motCuaPhieuXuLy);
		}
	}

	/**
	 * Returns the number of mot cua phieu xu lies where toChucQuanLy = &#63;.
	 *
	 * @param toChucQuanLy the to chuc quan ly
	 * @return the number of matching mot cua phieu xu lies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByToChucQuanLyId(long toChucQuanLy)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TOCHUCQUANLYID;

		Object[] finderArgs = new Object[] { toChucQuanLy };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MOTCUAPHIEUXULY_WHERE);

			query.append(_FINDER_COLUMN_TOCHUCQUANLYID_TOCHUCQUANLY_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(toChucQuanLy);

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

	private static final String _FINDER_COLUMN_TOCHUCQUANLYID_TOCHUCQUANLY_2 = "motCuaPhieuXuLy.toChucQuanLy = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_HOSOTHUTUCID =
		new FinderPath(MotCuaPhieuXuLyModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyModelImpl.FINDER_CACHE_ENABLED,
			MotCuaPhieuXuLyImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByHoSoThuTucId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID =
		new FinderPath(MotCuaPhieuXuLyModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyModelImpl.FINDER_CACHE_ENABLED,
			MotCuaPhieuXuLyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByHoSoThuTucId",
			new String[] { Long.class.getName() },
			MotCuaPhieuXuLyModelImpl.HOSOTHUTUCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_HOSOTHUTUCID = new FinderPath(MotCuaPhieuXuLyModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByHoSoThuTucId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the mot cua phieu xu lies where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the matching mot cua phieu xu lies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaPhieuXuLy> findByHoSoThuTucId(long hoSoThuTucId)
		throws SystemException {
		return findByHoSoThuTucId(hoSoThuTucId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua phieu xu lies where hoSoThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaPhieuXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param start the lower bound of the range of mot cua phieu xu lies
	 * @param end the upper bound of the range of mot cua phieu xu lies (not inclusive)
	 * @return the range of matching mot cua phieu xu lies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaPhieuXuLy> findByHoSoThuTucId(long hoSoThuTucId,
		int start, int end) throws SystemException {
		return findByHoSoThuTucId(hoSoThuTucId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua phieu xu lies where hoSoThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaPhieuXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param start the lower bound of the range of mot cua phieu xu lies
	 * @param end the upper bound of the range of mot cua phieu xu lies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mot cua phieu xu lies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaPhieuXuLy> findByHoSoThuTucId(long hoSoThuTucId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID;
			finderArgs = new Object[] { hoSoThuTucId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_HOSOTHUTUCID;
			finderArgs = new Object[] {
					hoSoThuTucId,
					
					start, end, orderByComparator
				};
		}

		List<MotCuaPhieuXuLy> list = (List<MotCuaPhieuXuLy>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MotCuaPhieuXuLy motCuaPhieuXuLy : list) {
				if ((hoSoThuTucId != motCuaPhieuXuLy.getHoSoThuTucId())) {
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

			query.append(_SQL_SELECT_MOTCUAPHIEUXULY_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MotCuaPhieuXuLyModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				if (!pagination) {
					list = (List<MotCuaPhieuXuLy>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaPhieuXuLy>(list);
				}
				else {
					list = (List<MotCuaPhieuXuLy>)QueryUtil.list(q,
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
	 * Returns the first mot cua phieu xu ly in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua phieu xu ly
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException if a matching mot cua phieu xu ly could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLy findByHoSoThuTucId_First(long hoSoThuTucId,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaPhieuXuLyException, SystemException {
		MotCuaPhieuXuLy motCuaPhieuXuLy = fetchByHoSoThuTucId_First(hoSoThuTucId,
				orderByComparator);

		if (motCuaPhieuXuLy != null) {
			return motCuaPhieuXuLy;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoSoThuTucId=");
		msg.append(hoSoThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaPhieuXuLyException(msg.toString());
	}

	/**
	 * Returns the first mot cua phieu xu ly in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua phieu xu ly, or <code>null</code> if a matching mot cua phieu xu ly could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLy fetchByHoSoThuTucId_First(long hoSoThuTucId,
		OrderByComparator orderByComparator) throws SystemException {
		List<MotCuaPhieuXuLy> list = findByHoSoThuTucId(hoSoThuTucId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mot cua phieu xu ly in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua phieu xu ly
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException if a matching mot cua phieu xu ly could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLy findByHoSoThuTucId_Last(long hoSoThuTucId,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaPhieuXuLyException, SystemException {
		MotCuaPhieuXuLy motCuaPhieuXuLy = fetchByHoSoThuTucId_Last(hoSoThuTucId,
				orderByComparator);

		if (motCuaPhieuXuLy != null) {
			return motCuaPhieuXuLy;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoSoThuTucId=");
		msg.append(hoSoThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaPhieuXuLyException(msg.toString());
	}

	/**
	 * Returns the last mot cua phieu xu ly in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua phieu xu ly, or <code>null</code> if a matching mot cua phieu xu ly could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLy fetchByHoSoThuTucId_Last(long hoSoThuTucId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByHoSoThuTucId(hoSoThuTucId);

		if (count == 0) {
			return null;
		}

		List<MotCuaPhieuXuLy> list = findByHoSoThuTucId(hoSoThuTucId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mot cua phieu xu lies before and after the current mot cua phieu xu ly in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param id the primary key of the current mot cua phieu xu ly
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mot cua phieu xu ly
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException if a mot cua phieu xu ly with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLy[] findByHoSoThuTucId_PrevAndNext(long id,
		long hoSoThuTucId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaPhieuXuLyException, SystemException {
		MotCuaPhieuXuLy motCuaPhieuXuLy = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			MotCuaPhieuXuLy[] array = new MotCuaPhieuXuLyImpl[3];

			array[0] = getByHoSoThuTucId_PrevAndNext(session, motCuaPhieuXuLy,
					hoSoThuTucId, orderByComparator, true);

			array[1] = motCuaPhieuXuLy;

			array[2] = getByHoSoThuTucId_PrevAndNext(session, motCuaPhieuXuLy,
					hoSoThuTucId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected MotCuaPhieuXuLy getByHoSoThuTucId_PrevAndNext(Session session,
		MotCuaPhieuXuLy motCuaPhieuXuLy, long hoSoThuTucId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MOTCUAPHIEUXULY_WHERE);

		query.append(_FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2);

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
			query.append(MotCuaPhieuXuLyModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(hoSoThuTucId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(motCuaPhieuXuLy);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MotCuaPhieuXuLy> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mot cua phieu xu lies where hoSoThuTucId = &#63; from the database.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByHoSoThuTucId(long hoSoThuTucId)
		throws SystemException {
		for (MotCuaPhieuXuLy motCuaPhieuXuLy : findByHoSoThuTucId(
				hoSoThuTucId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(motCuaPhieuXuLy);
		}
	}

	/**
	 * Returns the number of mot cua phieu xu lies where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the number of matching mot cua phieu xu lies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByHoSoThuTucId(long hoSoThuTucId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_HOSOTHUTUCID;

		Object[] finderArgs = new Object[] { hoSoThuTucId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MOTCUAPHIEUXULY_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

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

	private static final String _FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2 = "motCuaPhieuXuLy.hoSoThuTucId = ?";

	public MotCuaPhieuXuLyPersistenceImpl() {
		setModelClass(MotCuaPhieuXuLy.class);
	}

	/**
	 * Caches the mot cua phieu xu ly in the entity cache if it is enabled.
	 *
	 * @param motCuaPhieuXuLy the mot cua phieu xu ly
	 */
	@Override
	public void cacheResult(MotCuaPhieuXuLy motCuaPhieuXuLy) {
		EntityCacheUtil.putResult(MotCuaPhieuXuLyModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyImpl.class, motCuaPhieuXuLy.getPrimaryKey(),
			motCuaPhieuXuLy);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDQUYTRINHTHUTUCID,
			new Object[] {
				motCuaPhieuXuLy.getHoSoThuTucId(),
				motCuaPhieuXuLy.getQuyTrinhThuTucId()
			}, motCuaPhieuXuLy);

		motCuaPhieuXuLy.resetOriginalValues();
	}

	/**
	 * Caches the mot cua phieu xu lies in the entity cache if it is enabled.
	 *
	 * @param motCuaPhieuXuLies the mot cua phieu xu lies
	 */
	@Override
	public void cacheResult(List<MotCuaPhieuXuLy> motCuaPhieuXuLies) {
		for (MotCuaPhieuXuLy motCuaPhieuXuLy : motCuaPhieuXuLies) {
			if (EntityCacheUtil.getResult(
						MotCuaPhieuXuLyModelImpl.ENTITY_CACHE_ENABLED,
						MotCuaPhieuXuLyImpl.class,
						motCuaPhieuXuLy.getPrimaryKey()) == null) {
				cacheResult(motCuaPhieuXuLy);
			}
			else {
				motCuaPhieuXuLy.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all mot cua phieu xu lies.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(MotCuaPhieuXuLyImpl.class.getName());
		}

		EntityCacheUtil.clearCache(MotCuaPhieuXuLyImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the mot cua phieu xu ly.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MotCuaPhieuXuLy motCuaPhieuXuLy) {
		EntityCacheUtil.removeResult(MotCuaPhieuXuLyModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyImpl.class, motCuaPhieuXuLy.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(motCuaPhieuXuLy);
	}

	@Override
	public void clearCache(List<MotCuaPhieuXuLy> motCuaPhieuXuLies) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (MotCuaPhieuXuLy motCuaPhieuXuLy : motCuaPhieuXuLies) {
			EntityCacheUtil.removeResult(MotCuaPhieuXuLyModelImpl.ENTITY_CACHE_ENABLED,
				MotCuaPhieuXuLyImpl.class, motCuaPhieuXuLy.getPrimaryKey());

			clearUniqueFindersCache(motCuaPhieuXuLy);
		}
	}

	protected void cacheUniqueFindersCache(MotCuaPhieuXuLy motCuaPhieuXuLy) {
		if (motCuaPhieuXuLy.isNew()) {
			Object[] args = new Object[] {
					motCuaPhieuXuLy.getHoSoThuTucId(),
					motCuaPhieuXuLy.getQuyTrinhThuTucId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDQUYTRINHTHUTUCID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDQUYTRINHTHUTUCID,
				args, motCuaPhieuXuLy);
		}
		else {
			MotCuaPhieuXuLyModelImpl motCuaPhieuXuLyModelImpl = (MotCuaPhieuXuLyModelImpl)motCuaPhieuXuLy;

			if ((motCuaPhieuXuLyModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDQUYTRINHTHUTUCID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaPhieuXuLy.getHoSoThuTucId(),
						motCuaPhieuXuLy.getQuyTrinhThuTucId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDQUYTRINHTHUTUCID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDQUYTRINHTHUTUCID,
					args, motCuaPhieuXuLy);
			}
		}
	}

	protected void clearUniqueFindersCache(MotCuaPhieuXuLy motCuaPhieuXuLy) {
		MotCuaPhieuXuLyModelImpl motCuaPhieuXuLyModelImpl = (MotCuaPhieuXuLyModelImpl)motCuaPhieuXuLy;

		Object[] args = new Object[] {
				motCuaPhieuXuLy.getHoSoThuTucId(),
				motCuaPhieuXuLy.getQuyTrinhThuTucId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDQUYTRINHTHUTUCID,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDQUYTRINHTHUTUCID,
			args);

		if ((motCuaPhieuXuLyModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDQUYTRINHTHUTUCID.getColumnBitmask()) != 0) {
			args = new Object[] {
					motCuaPhieuXuLyModelImpl.getOriginalHoSoThuTucId(),
					motCuaPhieuXuLyModelImpl.getOriginalQuyTrinhThuTucId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDQUYTRINHTHUTUCID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDQUYTRINHTHUTUCID,
				args);
		}
	}

	/**
	 * Creates a new mot cua phieu xu ly with the primary key. Does not add the mot cua phieu xu ly to the database.
	 *
	 * @param id the primary key for the new mot cua phieu xu ly
	 * @return the new mot cua phieu xu ly
	 */
	@Override
	public MotCuaPhieuXuLy create(long id) {
		MotCuaPhieuXuLy motCuaPhieuXuLy = new MotCuaPhieuXuLyImpl();

		motCuaPhieuXuLy.setNew(true);
		motCuaPhieuXuLy.setPrimaryKey(id);

		return motCuaPhieuXuLy;
	}

	/**
	 * Removes the mot cua phieu xu ly with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the mot cua phieu xu ly
	 * @return the mot cua phieu xu ly that was removed
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException if a mot cua phieu xu ly with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLy remove(long id)
		throws NoSuchMotCuaPhieuXuLyException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the mot cua phieu xu ly with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the mot cua phieu xu ly
	 * @return the mot cua phieu xu ly that was removed
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException if a mot cua phieu xu ly with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLy remove(Serializable primaryKey)
		throws NoSuchMotCuaPhieuXuLyException, SystemException {
		Session session = null;

		try {
			session = openSession();

			MotCuaPhieuXuLy motCuaPhieuXuLy = (MotCuaPhieuXuLy)session.get(MotCuaPhieuXuLyImpl.class,
					primaryKey);

			if (motCuaPhieuXuLy == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMotCuaPhieuXuLyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(motCuaPhieuXuLy);
		}
		catch (NoSuchMotCuaPhieuXuLyException nsee) {
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
	protected MotCuaPhieuXuLy removeImpl(MotCuaPhieuXuLy motCuaPhieuXuLy)
		throws SystemException {
		motCuaPhieuXuLy = toUnwrappedModel(motCuaPhieuXuLy);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(motCuaPhieuXuLy)) {
				motCuaPhieuXuLy = (MotCuaPhieuXuLy)session.get(MotCuaPhieuXuLyImpl.class,
						motCuaPhieuXuLy.getPrimaryKeyObj());
			}

			if (motCuaPhieuXuLy != null) {
				session.delete(motCuaPhieuXuLy);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (motCuaPhieuXuLy != null) {
			clearCache(motCuaPhieuXuLy);
		}

		return motCuaPhieuXuLy;
	}

	@Override
	public MotCuaPhieuXuLy updateImpl(
		vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy motCuaPhieuXuLy)
		throws SystemException {
		motCuaPhieuXuLy = toUnwrappedModel(motCuaPhieuXuLy);

		boolean isNew = motCuaPhieuXuLy.isNew();

		MotCuaPhieuXuLyModelImpl motCuaPhieuXuLyModelImpl = (MotCuaPhieuXuLyModelImpl)motCuaPhieuXuLy;

		Session session = null;

		try {
			session = openSession();

			if (motCuaPhieuXuLy.isNew()) {
				session.save(motCuaPhieuXuLy);

				motCuaPhieuXuLy.setNew(false);
			}
			else {
				session.merge(motCuaPhieuXuLy);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !MotCuaPhieuXuLyModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((motCuaPhieuXuLyModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOCHUCQUANLYANDPHANNHOMHOSO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaPhieuXuLyModelImpl.getOriginalToChucQuanLy(),
						motCuaPhieuXuLyModelImpl.getOriginalPhanNhomHoSoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TOCHUCQUANLYANDPHANNHOMHOSO,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOCHUCQUANLYANDPHANNHOMHOSO,
					args);

				args = new Object[] {
						motCuaPhieuXuLyModelImpl.getToChucQuanLy(),
						motCuaPhieuXuLyModelImpl.getPhanNhomHoSoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TOCHUCQUANLYANDPHANNHOMHOSO,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOCHUCQUANLYANDPHANNHOMHOSO,
					args);
			}

			if ((motCuaPhieuXuLyModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOCHUCQUANLYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaPhieuXuLyModelImpl.getOriginalToChucQuanLy()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TOCHUCQUANLYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOCHUCQUANLYID,
					args);

				args = new Object[] { motCuaPhieuXuLyModelImpl.getToChucQuanLy() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TOCHUCQUANLYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOCHUCQUANLYID,
					args);
			}

			if ((motCuaPhieuXuLyModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaPhieuXuLyModelImpl.getOriginalHoSoThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID,
					args);

				args = new Object[] { motCuaPhieuXuLyModelImpl.getHoSoThuTucId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID,
					args);
			}
		}

		EntityCacheUtil.putResult(MotCuaPhieuXuLyModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyImpl.class, motCuaPhieuXuLy.getPrimaryKey(),
			motCuaPhieuXuLy);

		clearUniqueFindersCache(motCuaPhieuXuLy);
		cacheUniqueFindersCache(motCuaPhieuXuLy);

		return motCuaPhieuXuLy;
	}

	protected MotCuaPhieuXuLy toUnwrappedModel(MotCuaPhieuXuLy motCuaPhieuXuLy) {
		if (motCuaPhieuXuLy instanceof MotCuaPhieuXuLyImpl) {
			return motCuaPhieuXuLy;
		}

		MotCuaPhieuXuLyImpl motCuaPhieuXuLyImpl = new MotCuaPhieuXuLyImpl();

		motCuaPhieuXuLyImpl.setNew(motCuaPhieuXuLy.isNew());
		motCuaPhieuXuLyImpl.setPrimaryKey(motCuaPhieuXuLy.getPrimaryKey());

		motCuaPhieuXuLyImpl.setId(motCuaPhieuXuLy.getId());
		motCuaPhieuXuLyImpl.setHoSoThuTucId(motCuaPhieuXuLy.getHoSoThuTucId());
		motCuaPhieuXuLyImpl.setQuyTrinhThuTucId(motCuaPhieuXuLy.getQuyTrinhThuTucId());
		motCuaPhieuXuLyImpl.setSoThuTu(motCuaPhieuXuLy.getSoThuTu());
		motCuaPhieuXuLyImpl.setTrichYeuNoiDung(motCuaPhieuXuLy.getTrichYeuNoiDung());
		motCuaPhieuXuLyImpl.setGhiChu(motCuaPhieuXuLy.getGhiChu());
		motCuaPhieuXuLyImpl.setPhieuXuLyCha(motCuaPhieuXuLy.getPhieuXuLyCha());
		motCuaPhieuXuLyImpl.setTrangThaiHienTaiId(motCuaPhieuXuLy.getTrangThaiHienTaiId());
		motCuaPhieuXuLyImpl.setPhanNhomHoSoId(motCuaPhieuXuLy.getPhanNhomHoSoId());
		motCuaPhieuXuLyImpl.setChiemQuyenXuLy(motCuaPhieuXuLy.getChiemQuyenXuLy());
		motCuaPhieuXuLyImpl.setTrangThaiKetThuc(motCuaPhieuXuLy.getTrangThaiKetThuc());
		motCuaPhieuXuLyImpl.setToChucQuanLy(motCuaPhieuXuLy.getToChucQuanLy());
		motCuaPhieuXuLyImpl.setFileTaiLieu(motCuaPhieuXuLy.getFileTaiLieu());
		motCuaPhieuXuLyImpl.setNguoiXuLy(motCuaPhieuXuLy.getNguoiXuLy());
		motCuaPhieuXuLyImpl.setNguoiDuocUyQuyen(motCuaPhieuXuLy.getNguoiDuocUyQuyen());

		return motCuaPhieuXuLyImpl;
	}

	/**
	 * Returns the mot cua phieu xu ly with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the mot cua phieu xu ly
	 * @return the mot cua phieu xu ly
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException if a mot cua phieu xu ly with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLy findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMotCuaPhieuXuLyException, SystemException {
		MotCuaPhieuXuLy motCuaPhieuXuLy = fetchByPrimaryKey(primaryKey);

		if (motCuaPhieuXuLy == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMotCuaPhieuXuLyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return motCuaPhieuXuLy;
	}

	/**
	 * Returns the mot cua phieu xu ly with the primary key or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException} if it could not be found.
	 *
	 * @param id the primary key of the mot cua phieu xu ly
	 * @return the mot cua phieu xu ly
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException if a mot cua phieu xu ly with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLy findByPrimaryKey(long id)
		throws NoSuchMotCuaPhieuXuLyException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the mot cua phieu xu ly with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the mot cua phieu xu ly
	 * @return the mot cua phieu xu ly, or <code>null</code> if a mot cua phieu xu ly with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLy fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		MotCuaPhieuXuLy motCuaPhieuXuLy = (MotCuaPhieuXuLy)EntityCacheUtil.getResult(MotCuaPhieuXuLyModelImpl.ENTITY_CACHE_ENABLED,
				MotCuaPhieuXuLyImpl.class, primaryKey);

		if (motCuaPhieuXuLy == _nullMotCuaPhieuXuLy) {
			return null;
		}

		if (motCuaPhieuXuLy == null) {
			Session session = null;

			try {
				session = openSession();

				motCuaPhieuXuLy = (MotCuaPhieuXuLy)session.get(MotCuaPhieuXuLyImpl.class,
						primaryKey);

				if (motCuaPhieuXuLy != null) {
					cacheResult(motCuaPhieuXuLy);
				}
				else {
					EntityCacheUtil.putResult(MotCuaPhieuXuLyModelImpl.ENTITY_CACHE_ENABLED,
						MotCuaPhieuXuLyImpl.class, primaryKey,
						_nullMotCuaPhieuXuLy);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(MotCuaPhieuXuLyModelImpl.ENTITY_CACHE_ENABLED,
					MotCuaPhieuXuLyImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return motCuaPhieuXuLy;
	}

	/**
	 * Returns the mot cua phieu xu ly with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the mot cua phieu xu ly
	 * @return the mot cua phieu xu ly, or <code>null</code> if a mot cua phieu xu ly with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLy fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the mot cua phieu xu lies.
	 *
	 * @return the mot cua phieu xu lies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaPhieuXuLy> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua phieu xu lies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaPhieuXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mot cua phieu xu lies
	 * @param end the upper bound of the range of mot cua phieu xu lies (not inclusive)
	 * @return the range of mot cua phieu xu lies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaPhieuXuLy> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua phieu xu lies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaPhieuXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mot cua phieu xu lies
	 * @param end the upper bound of the range of mot cua phieu xu lies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mot cua phieu xu lies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaPhieuXuLy> findAll(int start, int end,
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

		List<MotCuaPhieuXuLy> list = (List<MotCuaPhieuXuLy>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MOTCUAPHIEUXULY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MOTCUAPHIEUXULY;

				if (pagination) {
					sql = sql.concat(MotCuaPhieuXuLyModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<MotCuaPhieuXuLy>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaPhieuXuLy>(list);
				}
				else {
					list = (List<MotCuaPhieuXuLy>)QueryUtil.list(q,
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
	 * Removes all the mot cua phieu xu lies from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (MotCuaPhieuXuLy motCuaPhieuXuLy : findAll()) {
			remove(motCuaPhieuXuLy);
		}
	}

	/**
	 * Returns the number of mot cua phieu xu lies.
	 *
	 * @return the number of mot cua phieu xu lies
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

				Query q = session.createQuery(_SQL_COUNT_MOTCUAPHIEUXULY);

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
	 * Initializes the mot cua phieu xu ly persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<MotCuaPhieuXuLy>> listenersList = new ArrayList<ModelListener<MotCuaPhieuXuLy>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<MotCuaPhieuXuLy>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(MotCuaPhieuXuLyImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_MOTCUAPHIEUXULY = "SELECT motCuaPhieuXuLy FROM MotCuaPhieuXuLy motCuaPhieuXuLy";
	private static final String _SQL_SELECT_MOTCUAPHIEUXULY_WHERE = "SELECT motCuaPhieuXuLy FROM MotCuaPhieuXuLy motCuaPhieuXuLy WHERE ";
	private static final String _SQL_COUNT_MOTCUAPHIEUXULY = "SELECT COUNT(motCuaPhieuXuLy) FROM MotCuaPhieuXuLy motCuaPhieuXuLy";
	private static final String _SQL_COUNT_MOTCUAPHIEUXULY_WHERE = "SELECT COUNT(motCuaPhieuXuLy) FROM MotCuaPhieuXuLy motCuaPhieuXuLy WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "motCuaPhieuXuLy.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MotCuaPhieuXuLy exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No MotCuaPhieuXuLy exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(MotCuaPhieuXuLyPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"hoSoThuTucId", "quyTrinhThuTucId", "soThuTu", "trichYeuNoiDung",
				"ghiChu", "phieuXuLyCha", "trangThaiHienTaiId", "phanNhomHoSoId",
				"chiemQuyenXuLy", "trangThaiKetThuc", "toChucQuanLy",
				"fileTaiLieu", "nguoiXuLy", "nguoiDuocUyQuyen"
			});
	private static MotCuaPhieuXuLy _nullMotCuaPhieuXuLy = new MotCuaPhieuXuLyImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<MotCuaPhieuXuLy> toCacheModel() {
				return _nullMotCuaPhieuXuLyCacheModel;
			}
		};

	private static CacheModel<MotCuaPhieuXuLy> _nullMotCuaPhieuXuLyCacheModel = new CacheModel<MotCuaPhieuXuLy>() {
			@Override
			public MotCuaPhieuXuLy toEntityModel() {
				return _nullMotCuaPhieuXuLy;
			}
		};
}