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

import vn.dtt.duongbo.dao.common.NoSuchQlvtLoaiHinhHoatDongDnException;
import vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn;
import vn.dtt.duongbo.dao.common.model.impl.QlvtLoaiHinhHoatDongDnImpl;
import vn.dtt.duongbo.dao.common.model.impl.QlvtLoaiHinhHoatDongDnModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the qlvt loai hinh hoat dong dn service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see QlvtLoaiHinhHoatDongDnPersistence
 * @see QlvtLoaiHinhHoatDongDnUtil
 * @generated
 */
public class QlvtLoaiHinhHoatDongDnPersistenceImpl extends BasePersistenceImpl<QlvtLoaiHinhHoatDongDn>
	implements QlvtLoaiHinhHoatDongDnPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QlvtLoaiHinhHoatDongDnUtil} to access the qlvt loai hinh hoat dong dn persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QlvtLoaiHinhHoatDongDnImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QlvtLoaiHinhHoatDongDnModelImpl.ENTITY_CACHE_ENABLED,
			QlvtLoaiHinhHoatDongDnModelImpl.FINDER_CACHE_ENABLED,
			QlvtLoaiHinhHoatDongDnImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QlvtLoaiHinhHoatDongDnModelImpl.ENTITY_CACHE_ENABLED,
			QlvtLoaiHinhHoatDongDnModelImpl.FINDER_CACHE_ENABLED,
			QlvtLoaiHinhHoatDongDnImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QlvtLoaiHinhHoatDongDnModelImpl.ENTITY_CACHE_ENABLED,
			QlvtLoaiHinhHoatDongDnModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDMALHHD = new FinderPath(QlvtLoaiHinhHoatDongDnModelImpl.ENTITY_CACHE_ENABLED,
			QlvtLoaiHinhHoatDongDnModelImpl.FINDER_CACHE_ENABLED,
			QlvtLoaiHinhHoatDongDnImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByHoSoThuTucIdAndMaLhhd",
			new String[] { Long.class.getName(), String.class.getName() },
			QlvtLoaiHinhHoatDongDnModelImpl.HOSOTHUTUCID_COLUMN_BITMASK |
			QlvtLoaiHinhHoatDongDnModelImpl.MALOAIHINHHOATDONG_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDMALHHD = new FinderPath(QlvtLoaiHinhHoatDongDnModelImpl.ENTITY_CACHE_ENABLED,
			QlvtLoaiHinhHoatDongDnModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByHoSoThuTucIdAndMaLhhd",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the qlvt loai hinh hoat dong dn where hoSoThuTucId = &#63; and maLoaiHinhHoatDong = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchQlvtLoaiHinhHoatDongDnException} if it could not be found.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param maLoaiHinhHoatDong the ma loai hinh hoat dong
	 * @return the matching qlvt loai hinh hoat dong dn
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtLoaiHinhHoatDongDnException if a matching qlvt loai hinh hoat dong dn could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtLoaiHinhHoatDongDn findByHoSoThuTucIdAndMaLhhd(
		long hoSoThuTucId, String maLoaiHinhHoatDong)
		throws NoSuchQlvtLoaiHinhHoatDongDnException, SystemException {
		QlvtLoaiHinhHoatDongDn qlvtLoaiHinhHoatDongDn = fetchByHoSoThuTucIdAndMaLhhd(hoSoThuTucId,
				maLoaiHinhHoatDong);

		if (qlvtLoaiHinhHoatDongDn == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("hoSoThuTucId=");
			msg.append(hoSoThuTucId);

			msg.append(", maLoaiHinhHoatDong=");
			msg.append(maLoaiHinhHoatDong);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchQlvtLoaiHinhHoatDongDnException(msg.toString());
		}

		return qlvtLoaiHinhHoatDongDn;
	}

	/**
	 * Returns the qlvt loai hinh hoat dong dn where hoSoThuTucId = &#63; and maLoaiHinhHoatDong = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param maLoaiHinhHoatDong the ma loai hinh hoat dong
	 * @return the matching qlvt loai hinh hoat dong dn, or <code>null</code> if a matching qlvt loai hinh hoat dong dn could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtLoaiHinhHoatDongDn fetchByHoSoThuTucIdAndMaLhhd(
		long hoSoThuTucId, String maLoaiHinhHoatDong) throws SystemException {
		return fetchByHoSoThuTucIdAndMaLhhd(hoSoThuTucId, maLoaiHinhHoatDong,
			true);
	}

	/**
	 * Returns the qlvt loai hinh hoat dong dn where hoSoThuTucId = &#63; and maLoaiHinhHoatDong = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param maLoaiHinhHoatDong the ma loai hinh hoat dong
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching qlvt loai hinh hoat dong dn, or <code>null</code> if a matching qlvt loai hinh hoat dong dn could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtLoaiHinhHoatDongDn fetchByHoSoThuTucIdAndMaLhhd(
		long hoSoThuTucId, String maLoaiHinhHoatDong, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { hoSoThuTucId, maLoaiHinhHoatDong };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDMALHHD,
					finderArgs, this);
		}

		if (result instanceof QlvtLoaiHinhHoatDongDn) {
			QlvtLoaiHinhHoatDongDn qlvtLoaiHinhHoatDongDn = (QlvtLoaiHinhHoatDongDn)result;

			if ((hoSoThuTucId != qlvtLoaiHinhHoatDongDn.getHoSoThuTucId()) ||
					!Validator.equals(maLoaiHinhHoatDong,
						qlvtLoaiHinhHoatDongDn.getMaLoaiHinhHoatDong())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_QLVTLOAIHINHHOATDONGDN_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCIDANDMALHHD_HOSOTHUTUCID_2);

			boolean bindMaLoaiHinhHoatDong = false;

			if (maLoaiHinhHoatDong == null) {
				query.append(_FINDER_COLUMN_HOSOTHUTUCIDANDMALHHD_MALOAIHINHHOATDONG_1);
			}
			else if (maLoaiHinhHoatDong.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_HOSOTHUTUCIDANDMALHHD_MALOAIHINHHOATDONG_3);
			}
			else {
				bindMaLoaiHinhHoatDong = true;

				query.append(_FINDER_COLUMN_HOSOTHUTUCIDANDMALHHD_MALOAIHINHHOATDONG_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				if (bindMaLoaiHinhHoatDong) {
					qPos.add(maLoaiHinhHoatDong);
				}

				List<QlvtLoaiHinhHoatDongDn> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDMALHHD,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"QlvtLoaiHinhHoatDongDnPersistenceImpl.fetchByHoSoThuTucIdAndMaLhhd(long, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					QlvtLoaiHinhHoatDongDn qlvtLoaiHinhHoatDongDn = list.get(0);

					result = qlvtLoaiHinhHoatDongDn;

					cacheResult(qlvtLoaiHinhHoatDongDn);

					if ((qlvtLoaiHinhHoatDongDn.getHoSoThuTucId() != hoSoThuTucId) ||
							(qlvtLoaiHinhHoatDongDn.getMaLoaiHinhHoatDong() == null) ||
							!qlvtLoaiHinhHoatDongDn.getMaLoaiHinhHoatDong()
													   .equals(maLoaiHinhHoatDong)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDMALHHD,
							finderArgs, qlvtLoaiHinhHoatDongDn);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDMALHHD,
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
			return (QlvtLoaiHinhHoatDongDn)result;
		}
	}

	/**
	 * Removes the qlvt loai hinh hoat dong dn where hoSoThuTucId = &#63; and maLoaiHinhHoatDong = &#63; from the database.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param maLoaiHinhHoatDong the ma loai hinh hoat dong
	 * @return the qlvt loai hinh hoat dong dn that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtLoaiHinhHoatDongDn removeByHoSoThuTucIdAndMaLhhd(
		long hoSoThuTucId, String maLoaiHinhHoatDong)
		throws NoSuchQlvtLoaiHinhHoatDongDnException, SystemException {
		QlvtLoaiHinhHoatDongDn qlvtLoaiHinhHoatDongDn = findByHoSoThuTucIdAndMaLhhd(hoSoThuTucId,
				maLoaiHinhHoatDong);

		return remove(qlvtLoaiHinhHoatDongDn);
	}

	/**
	 * Returns the number of qlvt loai hinh hoat dong dns where hoSoThuTucId = &#63; and maLoaiHinhHoatDong = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param maLoaiHinhHoatDong the ma loai hinh hoat dong
	 * @return the number of matching qlvt loai hinh hoat dong dns
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByHoSoThuTucIdAndMaLhhd(long hoSoThuTucId,
		String maLoaiHinhHoatDong) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDMALHHD;

		Object[] finderArgs = new Object[] { hoSoThuTucId, maLoaiHinhHoatDong };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_QLVTLOAIHINHHOATDONGDN_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCIDANDMALHHD_HOSOTHUTUCID_2);

			boolean bindMaLoaiHinhHoatDong = false;

			if (maLoaiHinhHoatDong == null) {
				query.append(_FINDER_COLUMN_HOSOTHUTUCIDANDMALHHD_MALOAIHINHHOATDONG_1);
			}
			else if (maLoaiHinhHoatDong.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_HOSOTHUTUCIDANDMALHHD_MALOAIHINHHOATDONG_3);
			}
			else {
				bindMaLoaiHinhHoatDong = true;

				query.append(_FINDER_COLUMN_HOSOTHUTUCIDANDMALHHD_MALOAIHINHHOATDONG_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				if (bindMaLoaiHinhHoatDong) {
					qPos.add(maLoaiHinhHoatDong);
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

	private static final String _FINDER_COLUMN_HOSOTHUTUCIDANDMALHHD_HOSOTHUTUCID_2 =
		"qlvtLoaiHinhHoatDongDn.hoSoThuTucId = ? AND ";
	private static final String _FINDER_COLUMN_HOSOTHUTUCIDANDMALHHD_MALOAIHINHHOATDONG_1 =
		"qlvtLoaiHinhHoatDongDn.maLoaiHinhHoatDong IS NULL";
	private static final String _FINDER_COLUMN_HOSOTHUTUCIDANDMALHHD_MALOAIHINHHOATDONG_2 =
		"qlvtLoaiHinhHoatDongDn.maLoaiHinhHoatDong = ?";
	private static final String _FINDER_COLUMN_HOSOTHUTUCIDANDMALHHD_MALOAIHINHHOATDONG_3 =
		"(qlvtLoaiHinhHoatDongDn.maLoaiHinhHoatDong IS NULL OR qlvtLoaiHinhHoatDongDn.maLoaiHinhHoatDong = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NOIDUNGHOSOID =
		new FinderPath(QlvtLoaiHinhHoatDongDnModelImpl.ENTITY_CACHE_ENABLED,
			QlvtLoaiHinhHoatDongDnModelImpl.FINDER_CACHE_ENABLED,
			QlvtLoaiHinhHoatDongDnImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByNoiDungHoSoId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOIDUNGHOSOID =
		new FinderPath(QlvtLoaiHinhHoatDongDnModelImpl.ENTITY_CACHE_ENABLED,
			QlvtLoaiHinhHoatDongDnModelImpl.FINDER_CACHE_ENABLED,
			QlvtLoaiHinhHoatDongDnImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByNoiDungHoSoId",
			new String[] { Long.class.getName() },
			QlvtLoaiHinhHoatDongDnModelImpl.NOIDUNGHOSOID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NOIDUNGHOSOID = new FinderPath(QlvtLoaiHinhHoatDongDnModelImpl.ENTITY_CACHE_ENABLED,
			QlvtLoaiHinhHoatDongDnModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByNoiDungHoSoId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the qlvt loai hinh hoat dong dns where noiDungHoSoId = &#63;.
	 *
	 * @param noiDungHoSoId the noi dung ho so ID
	 * @return the matching qlvt loai hinh hoat dong dns
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtLoaiHinhHoatDongDn> findByNoiDungHoSoId(long noiDungHoSoId)
		throws SystemException {
		return findByNoiDungHoSoId(noiDungHoSoId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt loai hinh hoat dong dns where noiDungHoSoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtLoaiHinhHoatDongDnModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param noiDungHoSoId the noi dung ho so ID
	 * @param start the lower bound of the range of qlvt loai hinh hoat dong dns
	 * @param end the upper bound of the range of qlvt loai hinh hoat dong dns (not inclusive)
	 * @return the range of matching qlvt loai hinh hoat dong dns
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtLoaiHinhHoatDongDn> findByNoiDungHoSoId(
		long noiDungHoSoId, int start, int end) throws SystemException {
		return findByNoiDungHoSoId(noiDungHoSoId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt loai hinh hoat dong dns where noiDungHoSoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtLoaiHinhHoatDongDnModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param noiDungHoSoId the noi dung ho so ID
	 * @param start the lower bound of the range of qlvt loai hinh hoat dong dns
	 * @param end the upper bound of the range of qlvt loai hinh hoat dong dns (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching qlvt loai hinh hoat dong dns
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtLoaiHinhHoatDongDn> findByNoiDungHoSoId(
		long noiDungHoSoId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOIDUNGHOSOID;
			finderArgs = new Object[] { noiDungHoSoId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NOIDUNGHOSOID;
			finderArgs = new Object[] {
					noiDungHoSoId,
					
					start, end, orderByComparator
				};
		}

		List<QlvtLoaiHinhHoatDongDn> list = (List<QlvtLoaiHinhHoatDongDn>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (QlvtLoaiHinhHoatDongDn qlvtLoaiHinhHoatDongDn : list) {
				if ((noiDungHoSoId != qlvtLoaiHinhHoatDongDn.getNoiDungHoSoId())) {
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

			query.append(_SQL_SELECT_QLVTLOAIHINHHOATDONGDN_WHERE);

			query.append(_FINDER_COLUMN_NOIDUNGHOSOID_NOIDUNGHOSOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(QlvtLoaiHinhHoatDongDnModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(noiDungHoSoId);

				if (!pagination) {
					list = (List<QlvtLoaiHinhHoatDongDn>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtLoaiHinhHoatDongDn>(list);
				}
				else {
					list = (List<QlvtLoaiHinhHoatDongDn>)QueryUtil.list(q,
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
	 * Returns the first qlvt loai hinh hoat dong dn in the ordered set where noiDungHoSoId = &#63;.
	 *
	 * @param noiDungHoSoId the noi dung ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qlvt loai hinh hoat dong dn
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtLoaiHinhHoatDongDnException if a matching qlvt loai hinh hoat dong dn could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtLoaiHinhHoatDongDn findByNoiDungHoSoId_First(
		long noiDungHoSoId, OrderByComparator orderByComparator)
		throws NoSuchQlvtLoaiHinhHoatDongDnException, SystemException {
		QlvtLoaiHinhHoatDongDn qlvtLoaiHinhHoatDongDn = fetchByNoiDungHoSoId_First(noiDungHoSoId,
				orderByComparator);

		if (qlvtLoaiHinhHoatDongDn != null) {
			return qlvtLoaiHinhHoatDongDn;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("noiDungHoSoId=");
		msg.append(noiDungHoSoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchQlvtLoaiHinhHoatDongDnException(msg.toString());
	}

	/**
	 * Returns the first qlvt loai hinh hoat dong dn in the ordered set where noiDungHoSoId = &#63;.
	 *
	 * @param noiDungHoSoId the noi dung ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qlvt loai hinh hoat dong dn, or <code>null</code> if a matching qlvt loai hinh hoat dong dn could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtLoaiHinhHoatDongDn fetchByNoiDungHoSoId_First(
		long noiDungHoSoId, OrderByComparator orderByComparator)
		throws SystemException {
		List<QlvtLoaiHinhHoatDongDn> list = findByNoiDungHoSoId(noiDungHoSoId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last qlvt loai hinh hoat dong dn in the ordered set where noiDungHoSoId = &#63;.
	 *
	 * @param noiDungHoSoId the noi dung ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qlvt loai hinh hoat dong dn
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtLoaiHinhHoatDongDnException if a matching qlvt loai hinh hoat dong dn could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtLoaiHinhHoatDongDn findByNoiDungHoSoId_Last(long noiDungHoSoId,
		OrderByComparator orderByComparator)
		throws NoSuchQlvtLoaiHinhHoatDongDnException, SystemException {
		QlvtLoaiHinhHoatDongDn qlvtLoaiHinhHoatDongDn = fetchByNoiDungHoSoId_Last(noiDungHoSoId,
				orderByComparator);

		if (qlvtLoaiHinhHoatDongDn != null) {
			return qlvtLoaiHinhHoatDongDn;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("noiDungHoSoId=");
		msg.append(noiDungHoSoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchQlvtLoaiHinhHoatDongDnException(msg.toString());
	}

	/**
	 * Returns the last qlvt loai hinh hoat dong dn in the ordered set where noiDungHoSoId = &#63;.
	 *
	 * @param noiDungHoSoId the noi dung ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qlvt loai hinh hoat dong dn, or <code>null</code> if a matching qlvt loai hinh hoat dong dn could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtLoaiHinhHoatDongDn fetchByNoiDungHoSoId_Last(
		long noiDungHoSoId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByNoiDungHoSoId(noiDungHoSoId);

		if (count == 0) {
			return null;
		}

		List<QlvtLoaiHinhHoatDongDn> list = findByNoiDungHoSoId(noiDungHoSoId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the qlvt loai hinh hoat dong dns before and after the current qlvt loai hinh hoat dong dn in the ordered set where noiDungHoSoId = &#63;.
	 *
	 * @param id the primary key of the current qlvt loai hinh hoat dong dn
	 * @param noiDungHoSoId the noi dung ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next qlvt loai hinh hoat dong dn
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtLoaiHinhHoatDongDnException if a qlvt loai hinh hoat dong dn with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtLoaiHinhHoatDongDn[] findByNoiDungHoSoId_PrevAndNext(long id,
		long noiDungHoSoId, OrderByComparator orderByComparator)
		throws NoSuchQlvtLoaiHinhHoatDongDnException, SystemException {
		QlvtLoaiHinhHoatDongDn qlvtLoaiHinhHoatDongDn = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			QlvtLoaiHinhHoatDongDn[] array = new QlvtLoaiHinhHoatDongDnImpl[3];

			array[0] = getByNoiDungHoSoId_PrevAndNext(session,
					qlvtLoaiHinhHoatDongDn, noiDungHoSoId, orderByComparator,
					true);

			array[1] = qlvtLoaiHinhHoatDongDn;

			array[2] = getByNoiDungHoSoId_PrevAndNext(session,
					qlvtLoaiHinhHoatDongDn, noiDungHoSoId, orderByComparator,
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

	protected QlvtLoaiHinhHoatDongDn getByNoiDungHoSoId_PrevAndNext(
		Session session, QlvtLoaiHinhHoatDongDn qlvtLoaiHinhHoatDongDn,
		long noiDungHoSoId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_QLVTLOAIHINHHOATDONGDN_WHERE);

		query.append(_FINDER_COLUMN_NOIDUNGHOSOID_NOIDUNGHOSOID_2);

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
			query.append(QlvtLoaiHinhHoatDongDnModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(noiDungHoSoId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(qlvtLoaiHinhHoatDongDn);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<QlvtLoaiHinhHoatDongDn> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the qlvt loai hinh hoat dong dns where noiDungHoSoId = &#63; from the database.
	 *
	 * @param noiDungHoSoId the noi dung ho so ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByNoiDungHoSoId(long noiDungHoSoId)
		throws SystemException {
		for (QlvtLoaiHinhHoatDongDn qlvtLoaiHinhHoatDongDn : findByNoiDungHoSoId(
				noiDungHoSoId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(qlvtLoaiHinhHoatDongDn);
		}
	}

	/**
	 * Returns the number of qlvt loai hinh hoat dong dns where noiDungHoSoId = &#63;.
	 *
	 * @param noiDungHoSoId the noi dung ho so ID
	 * @return the number of matching qlvt loai hinh hoat dong dns
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByNoiDungHoSoId(long noiDungHoSoId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_NOIDUNGHOSOID;

		Object[] finderArgs = new Object[] { noiDungHoSoId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_QLVTLOAIHINHHOATDONGDN_WHERE);

			query.append(_FINDER_COLUMN_NOIDUNGHOSOID_NOIDUNGHOSOID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(noiDungHoSoId);

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

	private static final String _FINDER_COLUMN_NOIDUNGHOSOID_NOIDUNGHOSOID_2 = "qlvtLoaiHinhHoatDongDn.noiDungHoSoId = ?";

	public QlvtLoaiHinhHoatDongDnPersistenceImpl() {
		setModelClass(QlvtLoaiHinhHoatDongDn.class);
	}

	/**
	 * Caches the qlvt loai hinh hoat dong dn in the entity cache if it is enabled.
	 *
	 * @param qlvtLoaiHinhHoatDongDn the qlvt loai hinh hoat dong dn
	 */
	@Override
	public void cacheResult(QlvtLoaiHinhHoatDongDn qlvtLoaiHinhHoatDongDn) {
		EntityCacheUtil.putResult(QlvtLoaiHinhHoatDongDnModelImpl.ENTITY_CACHE_ENABLED,
			QlvtLoaiHinhHoatDongDnImpl.class,
			qlvtLoaiHinhHoatDongDn.getPrimaryKey(), qlvtLoaiHinhHoatDongDn);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDMALHHD,
			new Object[] {
				qlvtLoaiHinhHoatDongDn.getHoSoThuTucId(),
				qlvtLoaiHinhHoatDongDn.getMaLoaiHinhHoatDong()
			}, qlvtLoaiHinhHoatDongDn);

		qlvtLoaiHinhHoatDongDn.resetOriginalValues();
	}

	/**
	 * Caches the qlvt loai hinh hoat dong dns in the entity cache if it is enabled.
	 *
	 * @param qlvtLoaiHinhHoatDongDns the qlvt loai hinh hoat dong dns
	 */
	@Override
	public void cacheResult(
		List<QlvtLoaiHinhHoatDongDn> qlvtLoaiHinhHoatDongDns) {
		for (QlvtLoaiHinhHoatDongDn qlvtLoaiHinhHoatDongDn : qlvtLoaiHinhHoatDongDns) {
			if (EntityCacheUtil.getResult(
						QlvtLoaiHinhHoatDongDnModelImpl.ENTITY_CACHE_ENABLED,
						QlvtLoaiHinhHoatDongDnImpl.class,
						qlvtLoaiHinhHoatDongDn.getPrimaryKey()) == null) {
				cacheResult(qlvtLoaiHinhHoatDongDn);
			}
			else {
				qlvtLoaiHinhHoatDongDn.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qlvt loai hinh hoat dong dns.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QlvtLoaiHinhHoatDongDnImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QlvtLoaiHinhHoatDongDnImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qlvt loai hinh hoat dong dn.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QlvtLoaiHinhHoatDongDn qlvtLoaiHinhHoatDongDn) {
		EntityCacheUtil.removeResult(QlvtLoaiHinhHoatDongDnModelImpl.ENTITY_CACHE_ENABLED,
			QlvtLoaiHinhHoatDongDnImpl.class,
			qlvtLoaiHinhHoatDongDn.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(qlvtLoaiHinhHoatDongDn);
	}

	@Override
	public void clearCache(List<QlvtLoaiHinhHoatDongDn> qlvtLoaiHinhHoatDongDns) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QlvtLoaiHinhHoatDongDn qlvtLoaiHinhHoatDongDn : qlvtLoaiHinhHoatDongDns) {
			EntityCacheUtil.removeResult(QlvtLoaiHinhHoatDongDnModelImpl.ENTITY_CACHE_ENABLED,
				QlvtLoaiHinhHoatDongDnImpl.class,
				qlvtLoaiHinhHoatDongDn.getPrimaryKey());

			clearUniqueFindersCache(qlvtLoaiHinhHoatDongDn);
		}
	}

	protected void cacheUniqueFindersCache(
		QlvtLoaiHinhHoatDongDn qlvtLoaiHinhHoatDongDn) {
		if (qlvtLoaiHinhHoatDongDn.isNew()) {
			Object[] args = new Object[] {
					qlvtLoaiHinhHoatDongDn.getHoSoThuTucId(),
					qlvtLoaiHinhHoatDongDn.getMaLoaiHinhHoatDong()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDMALHHD,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDMALHHD,
				args, qlvtLoaiHinhHoatDongDn);
		}
		else {
			QlvtLoaiHinhHoatDongDnModelImpl qlvtLoaiHinhHoatDongDnModelImpl = (QlvtLoaiHinhHoatDongDnModelImpl)qlvtLoaiHinhHoatDongDn;

			if ((qlvtLoaiHinhHoatDongDnModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDMALHHD.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						qlvtLoaiHinhHoatDongDn.getHoSoThuTucId(),
						qlvtLoaiHinhHoatDongDn.getMaLoaiHinhHoatDong()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDMALHHD,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDMALHHD,
					args, qlvtLoaiHinhHoatDongDn);
			}
		}
	}

	protected void clearUniqueFindersCache(
		QlvtLoaiHinhHoatDongDn qlvtLoaiHinhHoatDongDn) {
		QlvtLoaiHinhHoatDongDnModelImpl qlvtLoaiHinhHoatDongDnModelImpl = (QlvtLoaiHinhHoatDongDnModelImpl)qlvtLoaiHinhHoatDongDn;

		Object[] args = new Object[] {
				qlvtLoaiHinhHoatDongDn.getHoSoThuTucId(),
				qlvtLoaiHinhHoatDongDn.getMaLoaiHinhHoatDong()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDMALHHD,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDMALHHD,
			args);

		if ((qlvtLoaiHinhHoatDongDnModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDMALHHD.getColumnBitmask()) != 0) {
			args = new Object[] {
					qlvtLoaiHinhHoatDongDnModelImpl.getOriginalHoSoThuTucId(),
					qlvtLoaiHinhHoatDongDnModelImpl.getOriginalMaLoaiHinhHoatDong()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDMALHHD,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDMALHHD,
				args);
		}
	}

	/**
	 * Creates a new qlvt loai hinh hoat dong dn with the primary key. Does not add the qlvt loai hinh hoat dong dn to the database.
	 *
	 * @param id the primary key for the new qlvt loai hinh hoat dong dn
	 * @return the new qlvt loai hinh hoat dong dn
	 */
	@Override
	public QlvtLoaiHinhHoatDongDn create(long id) {
		QlvtLoaiHinhHoatDongDn qlvtLoaiHinhHoatDongDn = new QlvtLoaiHinhHoatDongDnImpl();

		qlvtLoaiHinhHoatDongDn.setNew(true);
		qlvtLoaiHinhHoatDongDn.setPrimaryKey(id);

		return qlvtLoaiHinhHoatDongDn;
	}

	/**
	 * Removes the qlvt loai hinh hoat dong dn with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the qlvt loai hinh hoat dong dn
	 * @return the qlvt loai hinh hoat dong dn that was removed
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtLoaiHinhHoatDongDnException if a qlvt loai hinh hoat dong dn with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtLoaiHinhHoatDongDn remove(long id)
		throws NoSuchQlvtLoaiHinhHoatDongDnException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the qlvt loai hinh hoat dong dn with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qlvt loai hinh hoat dong dn
	 * @return the qlvt loai hinh hoat dong dn that was removed
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtLoaiHinhHoatDongDnException if a qlvt loai hinh hoat dong dn with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtLoaiHinhHoatDongDn remove(Serializable primaryKey)
		throws NoSuchQlvtLoaiHinhHoatDongDnException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QlvtLoaiHinhHoatDongDn qlvtLoaiHinhHoatDongDn = (QlvtLoaiHinhHoatDongDn)session.get(QlvtLoaiHinhHoatDongDnImpl.class,
					primaryKey);

			if (qlvtLoaiHinhHoatDongDn == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQlvtLoaiHinhHoatDongDnException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtLoaiHinhHoatDongDn);
		}
		catch (NoSuchQlvtLoaiHinhHoatDongDnException nsee) {
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
	protected QlvtLoaiHinhHoatDongDn removeImpl(
		QlvtLoaiHinhHoatDongDn qlvtLoaiHinhHoatDongDn)
		throws SystemException {
		qlvtLoaiHinhHoatDongDn = toUnwrappedModel(qlvtLoaiHinhHoatDongDn);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtLoaiHinhHoatDongDn)) {
				qlvtLoaiHinhHoatDongDn = (QlvtLoaiHinhHoatDongDn)session.get(QlvtLoaiHinhHoatDongDnImpl.class,
						qlvtLoaiHinhHoatDongDn.getPrimaryKeyObj());
			}

			if (qlvtLoaiHinhHoatDongDn != null) {
				session.delete(qlvtLoaiHinhHoatDongDn);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtLoaiHinhHoatDongDn != null) {
			clearCache(qlvtLoaiHinhHoatDongDn);
		}

		return qlvtLoaiHinhHoatDongDn;
	}

	@Override
	public QlvtLoaiHinhHoatDongDn updateImpl(
		vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn qlvtLoaiHinhHoatDongDn)
		throws SystemException {
		qlvtLoaiHinhHoatDongDn = toUnwrappedModel(qlvtLoaiHinhHoatDongDn);

		boolean isNew = qlvtLoaiHinhHoatDongDn.isNew();

		QlvtLoaiHinhHoatDongDnModelImpl qlvtLoaiHinhHoatDongDnModelImpl = (QlvtLoaiHinhHoatDongDnModelImpl)qlvtLoaiHinhHoatDongDn;

		Session session = null;

		try {
			session = openSession();

			if (qlvtLoaiHinhHoatDongDn.isNew()) {
				session.save(qlvtLoaiHinhHoatDongDn);

				qlvtLoaiHinhHoatDongDn.setNew(false);
			}
			else {
				session.merge(qlvtLoaiHinhHoatDongDn);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !QlvtLoaiHinhHoatDongDnModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((qlvtLoaiHinhHoatDongDnModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOIDUNGHOSOID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						qlvtLoaiHinhHoatDongDnModelImpl.getOriginalNoiDungHoSoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NOIDUNGHOSOID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOIDUNGHOSOID,
					args);

				args = new Object[] {
						qlvtLoaiHinhHoatDongDnModelImpl.getNoiDungHoSoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NOIDUNGHOSOID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOIDUNGHOSOID,
					args);
			}
		}

		EntityCacheUtil.putResult(QlvtLoaiHinhHoatDongDnModelImpl.ENTITY_CACHE_ENABLED,
			QlvtLoaiHinhHoatDongDnImpl.class,
			qlvtLoaiHinhHoatDongDn.getPrimaryKey(), qlvtLoaiHinhHoatDongDn);

		clearUniqueFindersCache(qlvtLoaiHinhHoatDongDn);
		cacheUniqueFindersCache(qlvtLoaiHinhHoatDongDn);

		return qlvtLoaiHinhHoatDongDn;
	}

	protected QlvtLoaiHinhHoatDongDn toUnwrappedModel(
		QlvtLoaiHinhHoatDongDn qlvtLoaiHinhHoatDongDn) {
		if (qlvtLoaiHinhHoatDongDn instanceof QlvtLoaiHinhHoatDongDnImpl) {
			return qlvtLoaiHinhHoatDongDn;
		}

		QlvtLoaiHinhHoatDongDnImpl qlvtLoaiHinhHoatDongDnImpl = new QlvtLoaiHinhHoatDongDnImpl();

		qlvtLoaiHinhHoatDongDnImpl.setNew(qlvtLoaiHinhHoatDongDn.isNew());
		qlvtLoaiHinhHoatDongDnImpl.setPrimaryKey(qlvtLoaiHinhHoatDongDn.getPrimaryKey());

		qlvtLoaiHinhHoatDongDnImpl.setId(qlvtLoaiHinhHoatDongDn.getId());
		qlvtLoaiHinhHoatDongDnImpl.setHoSoThuTucId(qlvtLoaiHinhHoatDongDn.getHoSoThuTucId());
		qlvtLoaiHinhHoatDongDnImpl.setNoiDungHoSoId(qlvtLoaiHinhHoatDongDn.getNoiDungHoSoId());
		qlvtLoaiHinhHoatDongDnImpl.setMaLoaiHinhHoatDong(qlvtLoaiHinhHoatDongDn.getMaLoaiHinhHoatDong());
		qlvtLoaiHinhHoatDongDnImpl.setMaMauSon(qlvtLoaiHinhHoatDongDn.getMaMauSon());
		qlvtLoaiHinhHoatDongDnImpl.setMaPhamViHoatDong(qlvtLoaiHinhHoatDongDn.getMaPhamViHoatDong());
		qlvtLoaiHinhHoatDongDnImpl.setSoLuongPhuongTien(qlvtLoaiHinhHoatDongDn.getSoLuongPhuongTien());
		qlvtLoaiHinhHoatDongDnImpl.setThietBiGiamSatHanhTrinh(qlvtLoaiHinhHoatDongDn.getThietBiGiamSatHanhTrinh());

		return qlvtLoaiHinhHoatDongDnImpl;
	}

	/**
	 * Returns the qlvt loai hinh hoat dong dn with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt loai hinh hoat dong dn
	 * @return the qlvt loai hinh hoat dong dn
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtLoaiHinhHoatDongDnException if a qlvt loai hinh hoat dong dn with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtLoaiHinhHoatDongDn findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQlvtLoaiHinhHoatDongDnException, SystemException {
		QlvtLoaiHinhHoatDongDn qlvtLoaiHinhHoatDongDn = fetchByPrimaryKey(primaryKey);

		if (qlvtLoaiHinhHoatDongDn == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQlvtLoaiHinhHoatDongDnException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtLoaiHinhHoatDongDn;
	}

	/**
	 * Returns the qlvt loai hinh hoat dong dn with the primary key or throws a {@link vn.dtt.duongbo.dao.common.NoSuchQlvtLoaiHinhHoatDongDnException} if it could not be found.
	 *
	 * @param id the primary key of the qlvt loai hinh hoat dong dn
	 * @return the qlvt loai hinh hoat dong dn
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtLoaiHinhHoatDongDnException if a qlvt loai hinh hoat dong dn with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtLoaiHinhHoatDongDn findByPrimaryKey(long id)
		throws NoSuchQlvtLoaiHinhHoatDongDnException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the qlvt loai hinh hoat dong dn with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt loai hinh hoat dong dn
	 * @return the qlvt loai hinh hoat dong dn, or <code>null</code> if a qlvt loai hinh hoat dong dn with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtLoaiHinhHoatDongDn fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QlvtLoaiHinhHoatDongDn qlvtLoaiHinhHoatDongDn = (QlvtLoaiHinhHoatDongDn)EntityCacheUtil.getResult(QlvtLoaiHinhHoatDongDnModelImpl.ENTITY_CACHE_ENABLED,
				QlvtLoaiHinhHoatDongDnImpl.class, primaryKey);

		if (qlvtLoaiHinhHoatDongDn == _nullQlvtLoaiHinhHoatDongDn) {
			return null;
		}

		if (qlvtLoaiHinhHoatDongDn == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtLoaiHinhHoatDongDn = (QlvtLoaiHinhHoatDongDn)session.get(QlvtLoaiHinhHoatDongDnImpl.class,
						primaryKey);

				if (qlvtLoaiHinhHoatDongDn != null) {
					cacheResult(qlvtLoaiHinhHoatDongDn);
				}
				else {
					EntityCacheUtil.putResult(QlvtLoaiHinhHoatDongDnModelImpl.ENTITY_CACHE_ENABLED,
						QlvtLoaiHinhHoatDongDnImpl.class, primaryKey,
						_nullQlvtLoaiHinhHoatDongDn);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QlvtLoaiHinhHoatDongDnModelImpl.ENTITY_CACHE_ENABLED,
					QlvtLoaiHinhHoatDongDnImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtLoaiHinhHoatDongDn;
	}

	/**
	 * Returns the qlvt loai hinh hoat dong dn with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the qlvt loai hinh hoat dong dn
	 * @return the qlvt loai hinh hoat dong dn, or <code>null</code> if a qlvt loai hinh hoat dong dn with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtLoaiHinhHoatDongDn fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the qlvt loai hinh hoat dong dns.
	 *
	 * @return the qlvt loai hinh hoat dong dns
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtLoaiHinhHoatDongDn> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt loai hinh hoat dong dns.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtLoaiHinhHoatDongDnModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt loai hinh hoat dong dns
	 * @param end the upper bound of the range of qlvt loai hinh hoat dong dns (not inclusive)
	 * @return the range of qlvt loai hinh hoat dong dns
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtLoaiHinhHoatDongDn> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt loai hinh hoat dong dns.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtLoaiHinhHoatDongDnModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt loai hinh hoat dong dns
	 * @param end the upper bound of the range of qlvt loai hinh hoat dong dns (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qlvt loai hinh hoat dong dns
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtLoaiHinhHoatDongDn> findAll(int start, int end,
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

		List<QlvtLoaiHinhHoatDongDn> list = (List<QlvtLoaiHinhHoatDongDn>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTLOAIHINHHOATDONGDN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTLOAIHINHHOATDONGDN;

				if (pagination) {
					sql = sql.concat(QlvtLoaiHinhHoatDongDnModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QlvtLoaiHinhHoatDongDn>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtLoaiHinhHoatDongDn>(list);
				}
				else {
					list = (List<QlvtLoaiHinhHoatDongDn>)QueryUtil.list(q,
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
	 * Removes all the qlvt loai hinh hoat dong dns from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QlvtLoaiHinhHoatDongDn qlvtLoaiHinhHoatDongDn : findAll()) {
			remove(qlvtLoaiHinhHoatDongDn);
		}
	}

	/**
	 * Returns the number of qlvt loai hinh hoat dong dns.
	 *
	 * @return the number of qlvt loai hinh hoat dong dns
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

				Query q = session.createQuery(_SQL_COUNT_QLVTLOAIHINHHOATDONGDN);

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
	 * Initializes the qlvt loai hinh hoat dong dn persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QlvtLoaiHinhHoatDongDn>> listenersList = new ArrayList<ModelListener<QlvtLoaiHinhHoatDongDn>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QlvtLoaiHinhHoatDongDn>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QlvtLoaiHinhHoatDongDnImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTLOAIHINHHOATDONGDN = "SELECT qlvtLoaiHinhHoatDongDn FROM QlvtLoaiHinhHoatDongDn qlvtLoaiHinhHoatDongDn";
	private static final String _SQL_SELECT_QLVTLOAIHINHHOATDONGDN_WHERE = "SELECT qlvtLoaiHinhHoatDongDn FROM QlvtLoaiHinhHoatDongDn qlvtLoaiHinhHoatDongDn WHERE ";
	private static final String _SQL_COUNT_QLVTLOAIHINHHOATDONGDN = "SELECT COUNT(qlvtLoaiHinhHoatDongDn) FROM QlvtLoaiHinhHoatDongDn qlvtLoaiHinhHoatDongDn";
	private static final String _SQL_COUNT_QLVTLOAIHINHHOATDONGDN_WHERE = "SELECT COUNT(qlvtLoaiHinhHoatDongDn) FROM QlvtLoaiHinhHoatDongDn qlvtLoaiHinhHoatDongDn WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtLoaiHinhHoatDongDn.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QlvtLoaiHinhHoatDongDn exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No QlvtLoaiHinhHoatDongDn exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QlvtLoaiHinhHoatDongDnPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"hoSoThuTucId", "noiDungHoSoId", "maLoaiHinhHoatDong",
				"maMauSon", "maPhamViHoatDong", "soLuongPhuongTien",
				"thietBiGiamSatHanhTrinh"
			});
	private static QlvtLoaiHinhHoatDongDn _nullQlvtLoaiHinhHoatDongDn = new QlvtLoaiHinhHoatDongDnImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QlvtLoaiHinhHoatDongDn> toCacheModel() {
				return _nullQlvtLoaiHinhHoatDongDnCacheModel;
			}
		};

	private static CacheModel<QlvtLoaiHinhHoatDongDn> _nullQlvtLoaiHinhHoatDongDnCacheModel =
		new CacheModel<QlvtLoaiHinhHoatDongDn>() {
			@Override
			public QlvtLoaiHinhHoatDongDn toEntityModel() {
				return _nullQlvtLoaiHinhHoatDongDn;
			}
		};
}