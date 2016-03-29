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

import vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException;
import vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo;
import vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoImpl;
import vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the tthc noidung ho so service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcNoidungHoSoPersistence
 * @see TthcNoidungHoSoUtil
 * @generated
 */
public class TthcNoidungHoSoPersistenceImpl extends BasePersistenceImpl<TthcNoidungHoSo>
	implements TthcNoidungHoSoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TthcNoidungHoSoUtil} to access the tthc noidung ho so persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TthcNoidungHoSoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcNoidungHoSoImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcNoidungHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID =
		new FinderPath(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcNoidungHoSoImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			TthcNoidungHoSoModelImpl.HOSOTHUTUCID_COLUMN_BITMASK |
			TthcNoidungHoSoModelImpl.BIEUMAUHOSOID_COLUMN_BITMASK |
			TthcNoidungHoSoModelImpl.THANHPHANHOSOID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID =
		new FinderPath(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

	/**
	 * Returns the tthc noidung ho so where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException} if it could not be found.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @return the matching tthc noidung ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo findByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId)
		throws NoSuchTthcNoidungHoSoException, SystemException {
		TthcNoidungHoSo tthcNoidungHoSo = fetchByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId,
				bieuMauHoSoId, thanhPhanHoSoId);

		if (tthcNoidungHoSo == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("hoSoThuTucId=");
			msg.append(hoSoThuTucId);

			msg.append(", bieuMauHoSoId=");
			msg.append(bieuMauHoSoId);

			msg.append(", thanhPhanHoSoId=");
			msg.append(thanhPhanHoSoId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchTthcNoidungHoSoException(msg.toString());
		}

		return tthcNoidungHoSo;
	}

	/**
	 * Returns the tthc noidung ho so where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @return the matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo fetchByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId)
		throws SystemException {
		return fetchByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId,
			bieuMauHoSoId, thanhPhanHoSoId, true);
	}

	/**
	 * Returns the tthc noidung ho so where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo fetchByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] {
				hoSoThuTucId, bieuMauHoSoId, thanhPhanHoSoId
			};

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID,
					finderArgs, this);
		}

		if (result instanceof TthcNoidungHoSo) {
			TthcNoidungHoSo tthcNoidungHoSo = (TthcNoidungHoSo)result;

			if ((hoSoThuTucId != tthcNoidungHoSo.getHoSoThuTucId()) ||
					(bieuMauHoSoId != tthcNoidungHoSo.getBieuMauHoSoId()) ||
					(thanhPhanHoSoId != tthcNoidungHoSo.getThanhPhanHoSoId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_TTHCNOIDUNGHOSO_WHERE);

			query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID_HOSOTHUTUCID_2);

			query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID_BIEUMAUHOSOID_2);

			query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID_THANHPHANHOSOID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				qPos.add(bieuMauHoSoId);

				qPos.add(thanhPhanHoSoId);

				List<TthcNoidungHoSo> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"TthcNoidungHoSoPersistenceImpl.fetchByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(long, long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					TthcNoidungHoSo tthcNoidungHoSo = list.get(0);

					result = tthcNoidungHoSo;

					cacheResult(tthcNoidungHoSo);

					if ((tthcNoidungHoSo.getHoSoThuTucId() != hoSoThuTucId) ||
							(tthcNoidungHoSo.getBieuMauHoSoId() != bieuMauHoSoId) ||
							(tthcNoidungHoSo.getThanhPhanHoSoId() != thanhPhanHoSoId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID,
							finderArgs, tthcNoidungHoSo);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID,
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
			return (TthcNoidungHoSo)result;
		}
	}

	/**
	 * Removes the tthc noidung ho so where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; from the database.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @return the tthc noidung ho so that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo removeByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId)
		throws NoSuchTthcNoidungHoSoException, SystemException {
		TthcNoidungHoSo tthcNoidungHoSo = findByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId,
				bieuMauHoSoId, thanhPhanHoSoId);

		return remove(tthcNoidungHoSo);
	}

	/**
	 * Returns the number of tthc noidung ho sos where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @return the number of matching tthc noidung ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID;

		Object[] finderArgs = new Object[] {
				hoSoThuTucId, bieuMauHoSoId, thanhPhanHoSoId
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_TTHCNOIDUNGHOSO_WHERE);

			query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID_HOSOTHUTUCID_2);

			query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID_BIEUMAUHOSOID_2);

			query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID_THANHPHANHOSOID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				qPos.add(bieuMauHoSoId);

				qPos.add(thanhPhanHoSoId);

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

	private static final String _FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID_HOSOTHUTUCID_2 =
		"tthcNoidungHoSo.hoSoThuTucId = ? AND ";
	private static final String _FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID_BIEUMAUHOSOID_2 =
		"tthcNoidungHoSo.bieuMauHoSoId = ? AND ";
	private static final String _FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID_THANHPHANHOSOID_2 =
		"tthcNoidungHoSo.thanhPhanHoSoId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI =
		new FinderPath(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcNoidungHoSoImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				Long.class.getName()
			},
			TthcNoidungHoSoModelImpl.HOSOTHUTUCID_COLUMN_BITMASK |
			TthcNoidungHoSoModelImpl.BIEUMAUHOSOID_COLUMN_BITMASK |
			TthcNoidungHoSoModelImpl.THANHPHANHOSOID_COLUMN_BITMASK |
			TthcNoidungHoSoModelImpl.TRANGTHAI_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI =
		new FinderPath(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				Long.class.getName()
			});

	/**
	 * Returns the tthc noidung ho so where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; and trangThai = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException} if it could not be found.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @param trangThai the trang thai
	 * @return the matching tthc noidung ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo findByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId,
		long trangThai) throws NoSuchTthcNoidungHoSoException, SystemException {
		TthcNoidungHoSo tthcNoidungHoSo = fetchByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai(hoSoThuTucId,
				bieuMauHoSoId, thanhPhanHoSoId, trangThai);

		if (tthcNoidungHoSo == null) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("hoSoThuTucId=");
			msg.append(hoSoThuTucId);

			msg.append(", bieuMauHoSoId=");
			msg.append(bieuMauHoSoId);

			msg.append(", thanhPhanHoSoId=");
			msg.append(thanhPhanHoSoId);

			msg.append(", trangThai=");
			msg.append(trangThai);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchTthcNoidungHoSoException(msg.toString());
		}

		return tthcNoidungHoSo;
	}

	/**
	 * Returns the tthc noidung ho so where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; and trangThai = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @param trangThai the trang thai
	 * @return the matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo fetchByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId,
		long trangThai) throws SystemException {
		return fetchByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai(hoSoThuTucId,
			bieuMauHoSoId, thanhPhanHoSoId, trangThai, true);
	}

	/**
	 * Returns the tthc noidung ho so where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; and trangThai = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @param trangThai the trang thai
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo fetchByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId,
		long trangThai, boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] {
				hoSoThuTucId, bieuMauHoSoId, thanhPhanHoSoId, trangThai
			};

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI,
					finderArgs, this);
		}

		if (result instanceof TthcNoidungHoSo) {
			TthcNoidungHoSo tthcNoidungHoSo = (TthcNoidungHoSo)result;

			if ((hoSoThuTucId != tthcNoidungHoSo.getHoSoThuTucId()) ||
					(bieuMauHoSoId != tthcNoidungHoSo.getBieuMauHoSoId()) ||
					(thanhPhanHoSoId != tthcNoidungHoSo.getThanhPhanHoSoId()) ||
					(trangThai != tthcNoidungHoSo.getTrangThai())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(6);

			query.append(_SQL_SELECT_TTHCNOIDUNGHOSO_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI_HOSOTHUTUCID_2);

			query.append(_FINDER_COLUMN_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI_BIEUMAUHOSOID_2);

			query.append(_FINDER_COLUMN_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI_THANHPHANHOSOID_2);

			query.append(_FINDER_COLUMN_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI_TRANGTHAI_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				qPos.add(bieuMauHoSoId);

				qPos.add(thanhPhanHoSoId);

				qPos.add(trangThai);

				List<TthcNoidungHoSo> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"TthcNoidungHoSoPersistenceImpl.fetchByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai(long, long, long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					TthcNoidungHoSo tthcNoidungHoSo = list.get(0);

					result = tthcNoidungHoSo;

					cacheResult(tthcNoidungHoSo);

					if ((tthcNoidungHoSo.getHoSoThuTucId() != hoSoThuTucId) ||
							(tthcNoidungHoSo.getBieuMauHoSoId() != bieuMauHoSoId) ||
							(tthcNoidungHoSo.getThanhPhanHoSoId() != thanhPhanHoSoId) ||
							(tthcNoidungHoSo.getTrangThai() != trangThai)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI,
							finderArgs, tthcNoidungHoSo);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI,
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
			return (TthcNoidungHoSo)result;
		}
	}

	/**
	 * Removes the tthc noidung ho so where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; and trangThai = &#63; from the database.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @param trangThai the trang thai
	 * @return the tthc noidung ho so that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo removeByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId,
		long trangThai) throws NoSuchTthcNoidungHoSoException, SystemException {
		TthcNoidungHoSo tthcNoidungHoSo = findByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai(hoSoThuTucId,
				bieuMauHoSoId, thanhPhanHoSoId, trangThai);

		return remove(tthcNoidungHoSo);
	}

	/**
	 * Returns the number of tthc noidung ho sos where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; and trangThai = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @param trangThai the trang thai
	 * @return the number of matching tthc noidung ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId,
		long trangThai) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI;

		Object[] finderArgs = new Object[] {
				hoSoThuTucId, bieuMauHoSoId, thanhPhanHoSoId, trangThai
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_TTHCNOIDUNGHOSO_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI_HOSOTHUTUCID_2);

			query.append(_FINDER_COLUMN_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI_BIEUMAUHOSOID_2);

			query.append(_FINDER_COLUMN_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI_THANHPHANHOSOID_2);

			query.append(_FINDER_COLUMN_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI_TRANGTHAI_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				qPos.add(bieuMauHoSoId);

				qPos.add(thanhPhanHoSoId);

				qPos.add(trangThai);

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

	private static final String _FINDER_COLUMN_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI_HOSOTHUTUCID_2 =
		"tthcNoidungHoSo.hoSoThuTucId = ? AND ";
	private static final String _FINDER_COLUMN_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI_BIEUMAUHOSOID_2 =
		"tthcNoidungHoSo.bieuMauHoSoId = ? AND ";
	private static final String _FINDER_COLUMN_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI_THANHPHANHOSOID_2 =
		"tthcNoidungHoSo.thanhPhanHoSoId = ? AND ";
	private static final String _FINDER_COLUMN_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI_TRANGTHAI_2 =
		"tthcNoidungHoSo.trangThai = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_HOSOTHUTUCIDANDTHANHPHANHOSOID =
		new FinderPath(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcNoidungHoSoImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByHoSoThuTucIdAndThanhPhanHoSoId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCIDANDTHANHPHANHOSOID =
		new FinderPath(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcNoidungHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByHoSoThuTucIdAndThanhPhanHoSoId",
			new String[] { Long.class.getName(), Long.class.getName() },
			TthcNoidungHoSoModelImpl.HOSOTHUTUCID_COLUMN_BITMASK |
			TthcNoidungHoSoModelImpl.THANHPHANHOSOID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDTHANHPHANHOSOID =
		new FinderPath(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByHoSoThuTucIdAndThanhPhanHoSoId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the tthc noidung ho sos where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @return the matching tthc noidung ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSo> findByHoSoThuTucIdAndThanhPhanHoSoId(
		long hoSoThuTucId, long thanhPhanHoSoId) throws SystemException {
		return findByHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId,
			thanhPhanHoSoId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc noidung ho sos where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @param start the lower bound of the range of tthc noidung ho sos
	 * @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	 * @return the range of matching tthc noidung ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSo> findByHoSoThuTucIdAndThanhPhanHoSoId(
		long hoSoThuTucId, long thanhPhanHoSoId, int start, int end)
		throws SystemException {
		return findByHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId,
			thanhPhanHoSoId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc noidung ho sos where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @param start the lower bound of the range of tthc noidung ho sos
	 * @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tthc noidung ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSo> findByHoSoThuTucIdAndThanhPhanHoSoId(
		long hoSoThuTucId, long thanhPhanHoSoId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCIDANDTHANHPHANHOSOID;
			finderArgs = new Object[] { hoSoThuTucId, thanhPhanHoSoId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_HOSOTHUTUCIDANDTHANHPHANHOSOID;
			finderArgs = new Object[] {
					hoSoThuTucId, thanhPhanHoSoId,
					
					start, end, orderByComparator
				};
		}

		List<TthcNoidungHoSo> list = (List<TthcNoidungHoSo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TthcNoidungHoSo tthcNoidungHoSo : list) {
				if ((hoSoThuTucId != tthcNoidungHoSo.getHoSoThuTucId()) ||
						(thanhPhanHoSoId != tthcNoidungHoSo.getThanhPhanHoSoId())) {
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

			query.append(_SQL_SELECT_TTHCNOIDUNGHOSO_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCIDANDTHANHPHANHOSOID_HOSOTHUTUCID_2);

			query.append(_FINDER_COLUMN_HOSOTHUTUCIDANDTHANHPHANHOSOID_THANHPHANHOSOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TthcNoidungHoSoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				qPos.add(thanhPhanHoSoId);

				if (!pagination) {
					list = (List<TthcNoidungHoSo>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcNoidungHoSo>(list);
				}
				else {
					list = (List<TthcNoidungHoSo>)QueryUtil.list(q,
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
	 * Returns the first tthc noidung ho so in the ordered set where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc noidung ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo findByHoSoThuTucIdAndThanhPhanHoSoId_First(
		long hoSoThuTucId, long thanhPhanHoSoId,
		OrderByComparator orderByComparator)
		throws NoSuchTthcNoidungHoSoException, SystemException {
		TthcNoidungHoSo tthcNoidungHoSo = fetchByHoSoThuTucIdAndThanhPhanHoSoId_First(hoSoThuTucId,
				thanhPhanHoSoId, orderByComparator);

		if (tthcNoidungHoSo != null) {
			return tthcNoidungHoSo;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoSoThuTucId=");
		msg.append(hoSoThuTucId);

		msg.append(", thanhPhanHoSoId=");
		msg.append(thanhPhanHoSoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcNoidungHoSoException(msg.toString());
	}

	/**
	 * Returns the first tthc noidung ho so in the ordered set where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo fetchByHoSoThuTucIdAndThanhPhanHoSoId_First(
		long hoSoThuTucId, long thanhPhanHoSoId,
		OrderByComparator orderByComparator) throws SystemException {
		List<TthcNoidungHoSo> list = findByHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId,
				thanhPhanHoSoId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tthc noidung ho so in the ordered set where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc noidung ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo findByHoSoThuTucIdAndThanhPhanHoSoId_Last(
		long hoSoThuTucId, long thanhPhanHoSoId,
		OrderByComparator orderByComparator)
		throws NoSuchTthcNoidungHoSoException, SystemException {
		TthcNoidungHoSo tthcNoidungHoSo = fetchByHoSoThuTucIdAndThanhPhanHoSoId_Last(hoSoThuTucId,
				thanhPhanHoSoId, orderByComparator);

		if (tthcNoidungHoSo != null) {
			return tthcNoidungHoSo;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoSoThuTucId=");
		msg.append(hoSoThuTucId);

		msg.append(", thanhPhanHoSoId=");
		msg.append(thanhPhanHoSoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcNoidungHoSoException(msg.toString());
	}

	/**
	 * Returns the last tthc noidung ho so in the ordered set where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo fetchByHoSoThuTucIdAndThanhPhanHoSoId_Last(
		long hoSoThuTucId, long thanhPhanHoSoId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId,
				thanhPhanHoSoId);

		if (count == 0) {
			return null;
		}

		List<TthcNoidungHoSo> list = findByHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId,
				thanhPhanHoSoId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tthc noidung ho sos before and after the current tthc noidung ho so in the ordered set where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	 *
	 * @param id the primary key of the current tthc noidung ho so
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tthc noidung ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a tthc noidung ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo[] findByHoSoThuTucIdAndThanhPhanHoSoId_PrevAndNext(
		long id, long hoSoThuTucId, long thanhPhanHoSoId,
		OrderByComparator orderByComparator)
		throws NoSuchTthcNoidungHoSoException, SystemException {
		TthcNoidungHoSo tthcNoidungHoSo = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TthcNoidungHoSo[] array = new TthcNoidungHoSoImpl[3];

			array[0] = getByHoSoThuTucIdAndThanhPhanHoSoId_PrevAndNext(session,
					tthcNoidungHoSo, hoSoThuTucId, thanhPhanHoSoId,
					orderByComparator, true);

			array[1] = tthcNoidungHoSo;

			array[2] = getByHoSoThuTucIdAndThanhPhanHoSoId_PrevAndNext(session,
					tthcNoidungHoSo, hoSoThuTucId, thanhPhanHoSoId,
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

	protected TthcNoidungHoSo getByHoSoThuTucIdAndThanhPhanHoSoId_PrevAndNext(
		Session session, TthcNoidungHoSo tthcNoidungHoSo, long hoSoThuTucId,
		long thanhPhanHoSoId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TTHCNOIDUNGHOSO_WHERE);

		query.append(_FINDER_COLUMN_HOSOTHUTUCIDANDTHANHPHANHOSOID_HOSOTHUTUCID_2);

		query.append(_FINDER_COLUMN_HOSOTHUTUCIDANDTHANHPHANHOSOID_THANHPHANHOSOID_2);

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
			query.append(TthcNoidungHoSoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(hoSoThuTucId);

		qPos.add(thanhPhanHoSoId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tthcNoidungHoSo);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TthcNoidungHoSo> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tthc noidung ho sos where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63; from the database.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByHoSoThuTucIdAndThanhPhanHoSoId(long hoSoThuTucId,
		long thanhPhanHoSoId) throws SystemException {
		for (TthcNoidungHoSo tthcNoidungHoSo : findByHoSoThuTucIdAndThanhPhanHoSoId(
				hoSoThuTucId, thanhPhanHoSoId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tthcNoidungHoSo);
		}
	}

	/**
	 * Returns the number of tthc noidung ho sos where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @return the number of matching tthc noidung ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByHoSoThuTucIdAndThanhPhanHoSoId(long hoSoThuTucId,
		long thanhPhanHoSoId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDTHANHPHANHOSOID;

		Object[] finderArgs = new Object[] { hoSoThuTucId, thanhPhanHoSoId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TTHCNOIDUNGHOSO_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCIDANDTHANHPHANHOSOID_HOSOTHUTUCID_2);

			query.append(_FINDER_COLUMN_HOSOTHUTUCIDANDTHANHPHANHOSOID_THANHPHANHOSOID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				qPos.add(thanhPhanHoSoId);

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

	private static final String _FINDER_COLUMN_HOSOTHUTUCIDANDTHANHPHANHOSOID_HOSOTHUTUCID_2 =
		"tthcNoidungHoSo.hoSoThuTucId = ? AND ";
	private static final String _FINDER_COLUMN_HOSOTHUTUCIDANDTHANHPHANHOSOID_THANHPHANHOSOID_2 =
		"tthcNoidungHoSo.thanhPhanHoSoId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_HOSOTHUTUCID =
		new FinderPath(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcNoidungHoSoImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByHoSoThuTucId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID =
		new FinderPath(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcNoidungHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByHoSoThuTucId",
			new String[] { Long.class.getName() },
			TthcNoidungHoSoModelImpl.HOSOTHUTUCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_HOSOTHUTUCID = new FinderPath(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByHoSoThuTucId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the tthc noidung ho sos where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the matching tthc noidung ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSo> findByHoSoThuTucId(long hoSoThuTucId)
		throws SystemException {
		return findByHoSoThuTucId(hoSoThuTucId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc noidung ho sos where hoSoThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param start the lower bound of the range of tthc noidung ho sos
	 * @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	 * @return the range of matching tthc noidung ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSo> findByHoSoThuTucId(long hoSoThuTucId,
		int start, int end) throws SystemException {
		return findByHoSoThuTucId(hoSoThuTucId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc noidung ho sos where hoSoThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param start the lower bound of the range of tthc noidung ho sos
	 * @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tthc noidung ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSo> findByHoSoThuTucId(long hoSoThuTucId,
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

		List<TthcNoidungHoSo> list = (List<TthcNoidungHoSo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TthcNoidungHoSo tthcNoidungHoSo : list) {
				if ((hoSoThuTucId != tthcNoidungHoSo.getHoSoThuTucId())) {
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

			query.append(_SQL_SELECT_TTHCNOIDUNGHOSO_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TthcNoidungHoSoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				if (!pagination) {
					list = (List<TthcNoidungHoSo>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcNoidungHoSo>(list);
				}
				else {
					list = (List<TthcNoidungHoSo>)QueryUtil.list(q,
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
	 * Returns the first tthc noidung ho so in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc noidung ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo findByHoSoThuTucId_First(long hoSoThuTucId,
		OrderByComparator orderByComparator)
		throws NoSuchTthcNoidungHoSoException, SystemException {
		TthcNoidungHoSo tthcNoidungHoSo = fetchByHoSoThuTucId_First(hoSoThuTucId,
				orderByComparator);

		if (tthcNoidungHoSo != null) {
			return tthcNoidungHoSo;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoSoThuTucId=");
		msg.append(hoSoThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcNoidungHoSoException(msg.toString());
	}

	/**
	 * Returns the first tthc noidung ho so in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo fetchByHoSoThuTucId_First(long hoSoThuTucId,
		OrderByComparator orderByComparator) throws SystemException {
		List<TthcNoidungHoSo> list = findByHoSoThuTucId(hoSoThuTucId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tthc noidung ho so in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc noidung ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo findByHoSoThuTucId_Last(long hoSoThuTucId,
		OrderByComparator orderByComparator)
		throws NoSuchTthcNoidungHoSoException, SystemException {
		TthcNoidungHoSo tthcNoidungHoSo = fetchByHoSoThuTucId_Last(hoSoThuTucId,
				orderByComparator);

		if (tthcNoidungHoSo != null) {
			return tthcNoidungHoSo;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoSoThuTucId=");
		msg.append(hoSoThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcNoidungHoSoException(msg.toString());
	}

	/**
	 * Returns the last tthc noidung ho so in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo fetchByHoSoThuTucId_Last(long hoSoThuTucId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByHoSoThuTucId(hoSoThuTucId);

		if (count == 0) {
			return null;
		}

		List<TthcNoidungHoSo> list = findByHoSoThuTucId(hoSoThuTucId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tthc noidung ho sos before and after the current tthc noidung ho so in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param id the primary key of the current tthc noidung ho so
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tthc noidung ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a tthc noidung ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo[] findByHoSoThuTucId_PrevAndNext(long id,
		long hoSoThuTucId, OrderByComparator orderByComparator)
		throws NoSuchTthcNoidungHoSoException, SystemException {
		TthcNoidungHoSo tthcNoidungHoSo = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TthcNoidungHoSo[] array = new TthcNoidungHoSoImpl[3];

			array[0] = getByHoSoThuTucId_PrevAndNext(session, tthcNoidungHoSo,
					hoSoThuTucId, orderByComparator, true);

			array[1] = tthcNoidungHoSo;

			array[2] = getByHoSoThuTucId_PrevAndNext(session, tthcNoidungHoSo,
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

	protected TthcNoidungHoSo getByHoSoThuTucId_PrevAndNext(Session session,
		TthcNoidungHoSo tthcNoidungHoSo, long hoSoThuTucId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TTHCNOIDUNGHOSO_WHERE);

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
			query.append(TthcNoidungHoSoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(hoSoThuTucId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tthcNoidungHoSo);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TthcNoidungHoSo> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tthc noidung ho sos where hoSoThuTucId = &#63; from the database.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByHoSoThuTucId(long hoSoThuTucId)
		throws SystemException {
		for (TthcNoidungHoSo tthcNoidungHoSo : findByHoSoThuTucId(
				hoSoThuTucId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tthcNoidungHoSo);
		}
	}

	/**
	 * Returns the number of tthc noidung ho sos where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the number of matching tthc noidung ho sos
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

			query.append(_SQL_COUNT_TTHCNOIDUNGHOSO_WHERE);

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

	private static final String _FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2 = "tthcNoidungHoSo.hoSoThuTucId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_HOSOTHUTUCID_TAILIEUDINHKEM =
		new FinderPath(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcNoidungHoSoImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByHoSoThuTucId_TaiLieuDinhKem",
			new String[] { Long.class.getName(), Long.class.getName() },
			TthcNoidungHoSoModelImpl.HOSOTHUTUCID_COLUMN_BITMASK |
			TthcNoidungHoSoModelImpl.TAILIEUDINHKEM_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_HOSOTHUTUCID_TAILIEUDINHKEM =
		new FinderPath(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByHoSoThuTucId_TaiLieuDinhKem",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the tthc noidung ho so where hoSoThuTucId = &#63; and taiLieuDinhKem = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException} if it could not be found.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param taiLieuDinhKem the tai lieu dinh kem
	 * @return the matching tthc noidung ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo findByHoSoThuTucId_TaiLieuDinhKem(
		long hoSoThuTucId, long taiLieuDinhKem)
		throws NoSuchTthcNoidungHoSoException, SystemException {
		TthcNoidungHoSo tthcNoidungHoSo = fetchByHoSoThuTucId_TaiLieuDinhKem(hoSoThuTucId,
				taiLieuDinhKem);

		if (tthcNoidungHoSo == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("hoSoThuTucId=");
			msg.append(hoSoThuTucId);

			msg.append(", taiLieuDinhKem=");
			msg.append(taiLieuDinhKem);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchTthcNoidungHoSoException(msg.toString());
		}

		return tthcNoidungHoSo;
	}

	/**
	 * Returns the tthc noidung ho so where hoSoThuTucId = &#63; and taiLieuDinhKem = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param taiLieuDinhKem the tai lieu dinh kem
	 * @return the matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo fetchByHoSoThuTucId_TaiLieuDinhKem(
		long hoSoThuTucId, long taiLieuDinhKem) throws SystemException {
		return fetchByHoSoThuTucId_TaiLieuDinhKem(hoSoThuTucId, taiLieuDinhKem,
			true);
	}

	/**
	 * Returns the tthc noidung ho so where hoSoThuTucId = &#63; and taiLieuDinhKem = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param taiLieuDinhKem the tai lieu dinh kem
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo fetchByHoSoThuTucId_TaiLieuDinhKem(
		long hoSoThuTucId, long taiLieuDinhKem, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { hoSoThuTucId, taiLieuDinhKem };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCID_TAILIEUDINHKEM,
					finderArgs, this);
		}

		if (result instanceof TthcNoidungHoSo) {
			TthcNoidungHoSo tthcNoidungHoSo = (TthcNoidungHoSo)result;

			if ((hoSoThuTucId != tthcNoidungHoSo.getHoSoThuTucId()) ||
					(taiLieuDinhKem != tthcNoidungHoSo.getTaiLieuDinhKem())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_TTHCNOIDUNGHOSO_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCID_TAILIEUDINHKEM_HOSOTHUTUCID_2);

			query.append(_FINDER_COLUMN_HOSOTHUTUCID_TAILIEUDINHKEM_TAILIEUDINHKEM_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				qPos.add(taiLieuDinhKem);

				List<TthcNoidungHoSo> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCID_TAILIEUDINHKEM,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"TthcNoidungHoSoPersistenceImpl.fetchByHoSoThuTucId_TaiLieuDinhKem(long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					TthcNoidungHoSo tthcNoidungHoSo = list.get(0);

					result = tthcNoidungHoSo;

					cacheResult(tthcNoidungHoSo);

					if ((tthcNoidungHoSo.getHoSoThuTucId() != hoSoThuTucId) ||
							(tthcNoidungHoSo.getTaiLieuDinhKem() != taiLieuDinhKem)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCID_TAILIEUDINHKEM,
							finderArgs, tthcNoidungHoSo);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCID_TAILIEUDINHKEM,
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
			return (TthcNoidungHoSo)result;
		}
	}

	/**
	 * Removes the tthc noidung ho so where hoSoThuTucId = &#63; and taiLieuDinhKem = &#63; from the database.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param taiLieuDinhKem the tai lieu dinh kem
	 * @return the tthc noidung ho so that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo removeByHoSoThuTucId_TaiLieuDinhKem(
		long hoSoThuTucId, long taiLieuDinhKem)
		throws NoSuchTthcNoidungHoSoException, SystemException {
		TthcNoidungHoSo tthcNoidungHoSo = findByHoSoThuTucId_TaiLieuDinhKem(hoSoThuTucId,
				taiLieuDinhKem);

		return remove(tthcNoidungHoSo);
	}

	/**
	 * Returns the number of tthc noidung ho sos where hoSoThuTucId = &#63; and taiLieuDinhKem = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param taiLieuDinhKem the tai lieu dinh kem
	 * @return the number of matching tthc noidung ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByHoSoThuTucId_TaiLieuDinhKem(long hoSoThuTucId,
		long taiLieuDinhKem) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_HOSOTHUTUCID_TAILIEUDINHKEM;

		Object[] finderArgs = new Object[] { hoSoThuTucId, taiLieuDinhKem };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TTHCNOIDUNGHOSO_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCID_TAILIEUDINHKEM_HOSOTHUTUCID_2);

			query.append(_FINDER_COLUMN_HOSOTHUTUCID_TAILIEUDINHKEM_TAILIEUDINHKEM_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				qPos.add(taiLieuDinhKem);

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

	private static final String _FINDER_COLUMN_HOSOTHUTUCID_TAILIEUDINHKEM_HOSOTHUTUCID_2 =
		"tthcNoidungHoSo.hoSoThuTucId = ? AND ";
	private static final String _FINDER_COLUMN_HOSOTHUTUCID_TAILIEUDINHKEM_TAILIEUDINHKEM_2 =
		"tthcNoidungHoSo.taiLieuDinhKem = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOID =
		new FinderPath(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcNoidungHoSoImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByHoSoThuTucIdAndBieuMauHoSoId",
			new String[] { Long.class.getName(), Long.class.getName() },
			TthcNoidungHoSoModelImpl.HOSOTHUTUCID_COLUMN_BITMASK |
			TthcNoidungHoSoModelImpl.BIEUMAUHOSOID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDBIEUMAUHOSOID =
		new FinderPath(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByHoSoThuTucIdAndBieuMauHoSoId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the tthc noidung ho so where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException} if it could not be found.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @return the matching tthc noidung ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo findByHoSoThuTucIdAndBieuMauHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId)
		throws NoSuchTthcNoidungHoSoException, SystemException {
		TthcNoidungHoSo tthcNoidungHoSo = fetchByHoSoThuTucIdAndBieuMauHoSoId(hoSoThuTucId,
				bieuMauHoSoId);

		if (tthcNoidungHoSo == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("hoSoThuTucId=");
			msg.append(hoSoThuTucId);

			msg.append(", bieuMauHoSoId=");
			msg.append(bieuMauHoSoId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchTthcNoidungHoSoException(msg.toString());
		}

		return tthcNoidungHoSo;
	}

	/**
	 * Returns the tthc noidung ho so where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @return the matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo fetchByHoSoThuTucIdAndBieuMauHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId) throws SystemException {
		return fetchByHoSoThuTucIdAndBieuMauHoSoId(hoSoThuTucId, bieuMauHoSoId,
			true);
	}

	/**
	 * Returns the tthc noidung ho so where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo fetchByHoSoThuTucIdAndBieuMauHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { hoSoThuTucId, bieuMauHoSoId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOID,
					finderArgs, this);
		}

		if (result instanceof TthcNoidungHoSo) {
			TthcNoidungHoSo tthcNoidungHoSo = (TthcNoidungHoSo)result;

			if ((hoSoThuTucId != tthcNoidungHoSo.getHoSoThuTucId()) ||
					(bieuMauHoSoId != tthcNoidungHoSo.getBieuMauHoSoId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_TTHCNOIDUNGHOSO_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCIDANDBIEUMAUHOSOID_HOSOTHUTUCID_2);

			query.append(_FINDER_COLUMN_HOSOTHUTUCIDANDBIEUMAUHOSOID_BIEUMAUHOSOID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				qPos.add(bieuMauHoSoId);

				List<TthcNoidungHoSo> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"TthcNoidungHoSoPersistenceImpl.fetchByHoSoThuTucIdAndBieuMauHoSoId(long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					TthcNoidungHoSo tthcNoidungHoSo = list.get(0);

					result = tthcNoidungHoSo;

					cacheResult(tthcNoidungHoSo);

					if ((tthcNoidungHoSo.getHoSoThuTucId() != hoSoThuTucId) ||
							(tthcNoidungHoSo.getBieuMauHoSoId() != bieuMauHoSoId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOID,
							finderArgs, tthcNoidungHoSo);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOID,
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
			return (TthcNoidungHoSo)result;
		}
	}

	/**
	 * Removes the tthc noidung ho so where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; from the database.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @return the tthc noidung ho so that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo removeByHoSoThuTucIdAndBieuMauHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId)
		throws NoSuchTthcNoidungHoSoException, SystemException {
		TthcNoidungHoSo tthcNoidungHoSo = findByHoSoThuTucIdAndBieuMauHoSoId(hoSoThuTucId,
				bieuMauHoSoId);

		return remove(tthcNoidungHoSo);
	}

	/**
	 * Returns the number of tthc noidung ho sos where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @return the number of matching tthc noidung ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByHoSoThuTucIdAndBieuMauHoSoId(long hoSoThuTucId,
		long bieuMauHoSoId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDBIEUMAUHOSOID;

		Object[] finderArgs = new Object[] { hoSoThuTucId, bieuMauHoSoId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TTHCNOIDUNGHOSO_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCIDANDBIEUMAUHOSOID_HOSOTHUTUCID_2);

			query.append(_FINDER_COLUMN_HOSOTHUTUCIDANDBIEUMAUHOSOID_BIEUMAUHOSOID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				qPos.add(bieuMauHoSoId);

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

	private static final String _FINDER_COLUMN_HOSOTHUTUCIDANDBIEUMAUHOSOID_HOSOTHUTUCID_2 =
		"tthcNoidungHoSo.hoSoThuTucId = ? AND ";
	private static final String _FINDER_COLUMN_HOSOTHUTUCIDANDBIEUMAUHOSOID_BIEUMAUHOSOID_2 =
		"tthcNoidungHoSo.bieuMauHoSoId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_HOSOTHUTUCIDTHANHPHANHOSOID =
		new FinderPath(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcNoidungHoSoImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByHoSoThuTucIdThanhPhanHoSoId",
			new String[] { Long.class.getName(), Long.class.getName() },
			TthcNoidungHoSoModelImpl.HOSOTHUTUCID_COLUMN_BITMASK |
			TthcNoidungHoSoModelImpl.THANHPHANHOSOID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_HOSOTHUTUCIDTHANHPHANHOSOID =
		new FinderPath(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByHoSoThuTucIdThanhPhanHoSoId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the tthc noidung ho so where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException} if it could not be found.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @return the matching tthc noidung ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo findByHoSoThuTucIdThanhPhanHoSoId(
		long hoSoThuTucId, long thanhPhanHoSoId)
		throws NoSuchTthcNoidungHoSoException, SystemException {
		TthcNoidungHoSo tthcNoidungHoSo = fetchByHoSoThuTucIdThanhPhanHoSoId(hoSoThuTucId,
				thanhPhanHoSoId);

		if (tthcNoidungHoSo == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("hoSoThuTucId=");
			msg.append(hoSoThuTucId);

			msg.append(", thanhPhanHoSoId=");
			msg.append(thanhPhanHoSoId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchTthcNoidungHoSoException(msg.toString());
		}

		return tthcNoidungHoSo;
	}

	/**
	 * Returns the tthc noidung ho so where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @return the matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo fetchByHoSoThuTucIdThanhPhanHoSoId(
		long hoSoThuTucId, long thanhPhanHoSoId) throws SystemException {
		return fetchByHoSoThuTucIdThanhPhanHoSoId(hoSoThuTucId,
			thanhPhanHoSoId, true);
	}

	/**
	 * Returns the tthc noidung ho so where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo fetchByHoSoThuTucIdThanhPhanHoSoId(
		long hoSoThuTucId, long thanhPhanHoSoId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { hoSoThuTucId, thanhPhanHoSoId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDTHANHPHANHOSOID,
					finderArgs, this);
		}

		if (result instanceof TthcNoidungHoSo) {
			TthcNoidungHoSo tthcNoidungHoSo = (TthcNoidungHoSo)result;

			if ((hoSoThuTucId != tthcNoidungHoSo.getHoSoThuTucId()) ||
					(thanhPhanHoSoId != tthcNoidungHoSo.getThanhPhanHoSoId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_TTHCNOIDUNGHOSO_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCIDTHANHPHANHOSOID_HOSOTHUTUCID_2);

			query.append(_FINDER_COLUMN_HOSOTHUTUCIDTHANHPHANHOSOID_THANHPHANHOSOID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				qPos.add(thanhPhanHoSoId);

				List<TthcNoidungHoSo> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDTHANHPHANHOSOID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"TthcNoidungHoSoPersistenceImpl.fetchByHoSoThuTucIdThanhPhanHoSoId(long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					TthcNoidungHoSo tthcNoidungHoSo = list.get(0);

					result = tthcNoidungHoSo;

					cacheResult(tthcNoidungHoSo);

					if ((tthcNoidungHoSo.getHoSoThuTucId() != hoSoThuTucId) ||
							(tthcNoidungHoSo.getThanhPhanHoSoId() != thanhPhanHoSoId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDTHANHPHANHOSOID,
							finderArgs, tthcNoidungHoSo);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDTHANHPHANHOSOID,
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
			return (TthcNoidungHoSo)result;
		}
	}

	/**
	 * Removes the tthc noidung ho so where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63; from the database.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @return the tthc noidung ho so that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo removeByHoSoThuTucIdThanhPhanHoSoId(
		long hoSoThuTucId, long thanhPhanHoSoId)
		throws NoSuchTthcNoidungHoSoException, SystemException {
		TthcNoidungHoSo tthcNoidungHoSo = findByHoSoThuTucIdThanhPhanHoSoId(hoSoThuTucId,
				thanhPhanHoSoId);

		return remove(tthcNoidungHoSo);
	}

	/**
	 * Returns the number of tthc noidung ho sos where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @return the number of matching tthc noidung ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByHoSoThuTucIdThanhPhanHoSoId(long hoSoThuTucId,
		long thanhPhanHoSoId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_HOSOTHUTUCIDTHANHPHANHOSOID;

		Object[] finderArgs = new Object[] { hoSoThuTucId, thanhPhanHoSoId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TTHCNOIDUNGHOSO_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCIDTHANHPHANHOSOID_HOSOTHUTUCID_2);

			query.append(_FINDER_COLUMN_HOSOTHUTUCIDTHANHPHANHOSOID_THANHPHANHOSOID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				qPos.add(thanhPhanHoSoId);

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

	private static final String _FINDER_COLUMN_HOSOTHUTUCIDTHANHPHANHOSOID_HOSOTHUTUCID_2 =
		"tthcNoidungHoSo.hoSoThuTucId = ? AND ";
	private static final String _FINDER_COLUMN_HOSOTHUTUCIDTHANHPHANHOSOID_THANHPHANHOSOID_2 =
		"tthcNoidungHoSo.thanhPhanHoSoId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH =
		new FinderPath(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcNoidungHoSoImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH =
		new FinderPath(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcNoidungHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			},
			TthcNoidungHoSoModelImpl.HOSOTHUTUCID_COLUMN_BITMASK |
			TthcNoidungHoSoModelImpl.BIEUMAUHOSOID_COLUMN_BITMASK |
			TthcNoidungHoSoModelImpl.MATUSINH_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH =
		new FinderPath(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the tthc noidung ho sos where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @param maTuSinh the ma tu sinh
	 * @return the matching tthc noidung ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSo> findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(
		long hoSoThuTucId, long bieuMauHoSoId, String maTuSinh)
		throws SystemException {
		return findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(hoSoThuTucId,
			bieuMauHoSoId, maTuSinh, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc noidung ho sos where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @param maTuSinh the ma tu sinh
	 * @param start the lower bound of the range of tthc noidung ho sos
	 * @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	 * @return the range of matching tthc noidung ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSo> findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(
		long hoSoThuTucId, long bieuMauHoSoId, String maTuSinh, int start,
		int end) throws SystemException {
		return findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(hoSoThuTucId,
			bieuMauHoSoId, maTuSinh, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc noidung ho sos where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @param maTuSinh the ma tu sinh
	 * @param start the lower bound of the range of tthc noidung ho sos
	 * @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tthc noidung ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSo> findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(
		long hoSoThuTucId, long bieuMauHoSoId, String maTuSinh, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH;
			finderArgs = new Object[] { hoSoThuTucId, bieuMauHoSoId, maTuSinh };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH;
			finderArgs = new Object[] {
					hoSoThuTucId, bieuMauHoSoId, maTuSinh,
					
					start, end, orderByComparator
				};
		}

		List<TthcNoidungHoSo> list = (List<TthcNoidungHoSo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TthcNoidungHoSo tthcNoidungHoSo : list) {
				if ((hoSoThuTucId != tthcNoidungHoSo.getHoSoThuTucId()) ||
						(bieuMauHoSoId != tthcNoidungHoSo.getBieuMauHoSoId()) ||
						!Validator.equals(maTuSinh,
							tthcNoidungHoSo.getMaTuSinh())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_TTHCNOIDUNGHOSO_WHERE);

			query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_HOSOTHUTUCID_2);

			query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_BIEUMAUHOSOID_2);

			boolean bindMaTuSinh = false;

			if (maTuSinh == null) {
				query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_MATUSINH_1);
			}
			else if (maTuSinh.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_MATUSINH_3);
			}
			else {
				bindMaTuSinh = true;

				query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_MATUSINH_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TthcNoidungHoSoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				qPos.add(bieuMauHoSoId);

				if (bindMaTuSinh) {
					qPos.add(maTuSinh);
				}

				if (!pagination) {
					list = (List<TthcNoidungHoSo>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcNoidungHoSo>(list);
				}
				else {
					list = (List<TthcNoidungHoSo>)QueryUtil.list(q,
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
	 * Returns the first tthc noidung ho so in the ordered set where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @param maTuSinh the ma tu sinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc noidung ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_First(
		long hoSoThuTucId, long bieuMauHoSoId, String maTuSinh,
		OrderByComparator orderByComparator)
		throws NoSuchTthcNoidungHoSoException, SystemException {
		TthcNoidungHoSo tthcNoidungHoSo = fetchByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_First(hoSoThuTucId,
				bieuMauHoSoId, maTuSinh, orderByComparator);

		if (tthcNoidungHoSo != null) {
			return tthcNoidungHoSo;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoSoThuTucId=");
		msg.append(hoSoThuTucId);

		msg.append(", bieuMauHoSoId=");
		msg.append(bieuMauHoSoId);

		msg.append(", maTuSinh=");
		msg.append(maTuSinh);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcNoidungHoSoException(msg.toString());
	}

	/**
	 * Returns the first tthc noidung ho so in the ordered set where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @param maTuSinh the ma tu sinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo fetchByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_First(
		long hoSoThuTucId, long bieuMauHoSoId, String maTuSinh,
		OrderByComparator orderByComparator) throws SystemException {
		List<TthcNoidungHoSo> list = findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(hoSoThuTucId,
				bieuMauHoSoId, maTuSinh, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tthc noidung ho so in the ordered set where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @param maTuSinh the ma tu sinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc noidung ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_Last(
		long hoSoThuTucId, long bieuMauHoSoId, String maTuSinh,
		OrderByComparator orderByComparator)
		throws NoSuchTthcNoidungHoSoException, SystemException {
		TthcNoidungHoSo tthcNoidungHoSo = fetchByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_Last(hoSoThuTucId,
				bieuMauHoSoId, maTuSinh, orderByComparator);

		if (tthcNoidungHoSo != null) {
			return tthcNoidungHoSo;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoSoThuTucId=");
		msg.append(hoSoThuTucId);

		msg.append(", bieuMauHoSoId=");
		msg.append(bieuMauHoSoId);

		msg.append(", maTuSinh=");
		msg.append(maTuSinh);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcNoidungHoSoException(msg.toString());
	}

	/**
	 * Returns the last tthc noidung ho so in the ordered set where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @param maTuSinh the ma tu sinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo fetchByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_Last(
		long hoSoThuTucId, long bieuMauHoSoId, String maTuSinh,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(hoSoThuTucId,
				bieuMauHoSoId, maTuSinh);

		if (count == 0) {
			return null;
		}

		List<TthcNoidungHoSo> list = findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(hoSoThuTucId,
				bieuMauHoSoId, maTuSinh, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tthc noidung ho sos before and after the current tthc noidung ho so in the ordered set where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	 *
	 * @param id the primary key of the current tthc noidung ho so
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @param maTuSinh the ma tu sinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tthc noidung ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a tthc noidung ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo[] findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_PrevAndNext(
		long id, long hoSoThuTucId, long bieuMauHoSoId, String maTuSinh,
		OrderByComparator orderByComparator)
		throws NoSuchTthcNoidungHoSoException, SystemException {
		TthcNoidungHoSo tthcNoidungHoSo = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TthcNoidungHoSo[] array = new TthcNoidungHoSoImpl[3];

			array[0] = getByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_PrevAndNext(session,
					tthcNoidungHoSo, hoSoThuTucId, bieuMauHoSoId, maTuSinh,
					orderByComparator, true);

			array[1] = tthcNoidungHoSo;

			array[2] = getByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_PrevAndNext(session,
					tthcNoidungHoSo, hoSoThuTucId, bieuMauHoSoId, maTuSinh,
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

	protected TthcNoidungHoSo getByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_PrevAndNext(
		Session session, TthcNoidungHoSo tthcNoidungHoSo, long hoSoThuTucId,
		long bieuMauHoSoId, String maTuSinh,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TTHCNOIDUNGHOSO_WHERE);

		query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_HOSOTHUTUCID_2);

		query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_BIEUMAUHOSOID_2);

		boolean bindMaTuSinh = false;

		if (maTuSinh == null) {
			query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_MATUSINH_1);
		}
		else if (maTuSinh.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_MATUSINH_3);
		}
		else {
			bindMaTuSinh = true;

			query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_MATUSINH_2);
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
			query.append(TthcNoidungHoSoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(hoSoThuTucId);

		qPos.add(bieuMauHoSoId);

		if (bindMaTuSinh) {
			qPos.add(maTuSinh);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tthcNoidungHoSo);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TthcNoidungHoSo> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tthc noidung ho sos where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63; from the database.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @param maTuSinh the ma tu sinh
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(
		long hoSoThuTucId, long bieuMauHoSoId, String maTuSinh)
		throws SystemException {
		for (TthcNoidungHoSo tthcNoidungHoSo : findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(
				hoSoThuTucId, bieuMauHoSoId, maTuSinh, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tthcNoidungHoSo);
		}
	}

	/**
	 * Returns the number of tthc noidung ho sos where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @param maTuSinh the ma tu sinh
	 * @return the number of matching tthc noidung ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(
		long hoSoThuTucId, long bieuMauHoSoId, String maTuSinh)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH;

		Object[] finderArgs = new Object[] { hoSoThuTucId, bieuMauHoSoId, maTuSinh };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_TTHCNOIDUNGHOSO_WHERE);

			query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_HOSOTHUTUCID_2);

			query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_BIEUMAUHOSOID_2);

			boolean bindMaTuSinh = false;

			if (maTuSinh == null) {
				query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_MATUSINH_1);
			}
			else if (maTuSinh.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_MATUSINH_3);
			}
			else {
				bindMaTuSinh = true;

				query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_MATUSINH_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				qPos.add(bieuMauHoSoId);

				if (bindMaTuSinh) {
					qPos.add(maTuSinh);
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

	private static final String _FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_HOSOTHUTUCID_2 =
		"tthcNoidungHoSo.hoSoThuTucId = ? AND ";
	private static final String _FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_BIEUMAUHOSOID_2 =
		"tthcNoidungHoSo.bieuMauHoSoId = ? AND ";
	private static final String _FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_MATUSINH_1 =
		"tthcNoidungHoSo.maTuSinh IS NULL";
	private static final String _FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_MATUSINH_2 =
		"tthcNoidungHoSo.maTuSinh = ?";
	private static final String _FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_MATUSINH_3 =
		"(tthcNoidungHoSo.maTuSinh IS NULL OR tthcNoidungHoSo.maTuSinh = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_HOSOTHUTUCDONONLINE = new FinderPath(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcNoidungHoSoImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByHoSoThuTucDonOnline",
			new String[] { Long.class.getName(), Long.class.getName() },
			TthcNoidungHoSoModelImpl.HOSOTHUTUCID_COLUMN_BITMASK |
			TthcNoidungHoSoModelImpl.THANHPHANHOSOID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_HOSOTHUTUCDONONLINE = new FinderPath(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByHoSoThuTucDonOnline",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the tthc noidung ho so where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException} if it could not be found.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @return the matching tthc noidung ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo findByHoSoThuTucDonOnline(long hoSoThuTucId,
		long thanhPhanHoSoId)
		throws NoSuchTthcNoidungHoSoException, SystemException {
		TthcNoidungHoSo tthcNoidungHoSo = fetchByHoSoThuTucDonOnline(hoSoThuTucId,
				thanhPhanHoSoId);

		if (tthcNoidungHoSo == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("hoSoThuTucId=");
			msg.append(hoSoThuTucId);

			msg.append(", thanhPhanHoSoId=");
			msg.append(thanhPhanHoSoId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchTthcNoidungHoSoException(msg.toString());
		}

		return tthcNoidungHoSo;
	}

	/**
	 * Returns the tthc noidung ho so where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @return the matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo fetchByHoSoThuTucDonOnline(long hoSoThuTucId,
		long thanhPhanHoSoId) throws SystemException {
		return fetchByHoSoThuTucDonOnline(hoSoThuTucId, thanhPhanHoSoId, true);
	}

	/**
	 * Returns the tthc noidung ho so where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo fetchByHoSoThuTucDonOnline(long hoSoThuTucId,
		long thanhPhanHoSoId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { hoSoThuTucId, thanhPhanHoSoId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCDONONLINE,
					finderArgs, this);
		}

		if (result instanceof TthcNoidungHoSo) {
			TthcNoidungHoSo tthcNoidungHoSo = (TthcNoidungHoSo)result;

			if ((hoSoThuTucId != tthcNoidungHoSo.getHoSoThuTucId()) ||
					(thanhPhanHoSoId != tthcNoidungHoSo.getThanhPhanHoSoId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_TTHCNOIDUNGHOSO_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCDONONLINE_HOSOTHUTUCID_2);

			query.append(_FINDER_COLUMN_HOSOTHUTUCDONONLINE_THANHPHANHOSOID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				qPos.add(thanhPhanHoSoId);

				List<TthcNoidungHoSo> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCDONONLINE,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"TthcNoidungHoSoPersistenceImpl.fetchByHoSoThuTucDonOnline(long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					TthcNoidungHoSo tthcNoidungHoSo = list.get(0);

					result = tthcNoidungHoSo;

					cacheResult(tthcNoidungHoSo);

					if ((tthcNoidungHoSo.getHoSoThuTucId() != hoSoThuTucId) ||
							(tthcNoidungHoSo.getThanhPhanHoSoId() != thanhPhanHoSoId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCDONONLINE,
							finderArgs, tthcNoidungHoSo);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCDONONLINE,
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
			return (TthcNoidungHoSo)result;
		}
	}

	/**
	 * Removes the tthc noidung ho so where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63; from the database.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @return the tthc noidung ho so that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo removeByHoSoThuTucDonOnline(long hoSoThuTucId,
		long thanhPhanHoSoId)
		throws NoSuchTthcNoidungHoSoException, SystemException {
		TthcNoidungHoSo tthcNoidungHoSo = findByHoSoThuTucDonOnline(hoSoThuTucId,
				thanhPhanHoSoId);

		return remove(tthcNoidungHoSo);
	}

	/**
	 * Returns the number of tthc noidung ho sos where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @return the number of matching tthc noidung ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByHoSoThuTucDonOnline(long hoSoThuTucId,
		long thanhPhanHoSoId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_HOSOTHUTUCDONONLINE;

		Object[] finderArgs = new Object[] { hoSoThuTucId, thanhPhanHoSoId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TTHCNOIDUNGHOSO_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCDONONLINE_HOSOTHUTUCID_2);

			query.append(_FINDER_COLUMN_HOSOTHUTUCDONONLINE_THANHPHANHOSOID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				qPos.add(thanhPhanHoSoId);

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

	private static final String _FINDER_COLUMN_HOSOTHUTUCDONONLINE_HOSOTHUTUCID_2 =
		"tthcNoidungHoSo.hoSoThuTucId = ? AND ";
	private static final String _FINDER_COLUMN_HOSOTHUTUCDONONLINE_THANHPHANHOSOID_2 =
		"tthcNoidungHoSo.thanhPhanHoSoId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_F_HS_DINH_KEM =
		new FinderPath(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcNoidungHoSoImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByF_HS_DINH_KEM",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_HS_DINH_KEM =
		new FinderPath(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcNoidungHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByF_HS_DINH_KEM",
			new String[] { Long.class.getName() },
			TthcNoidungHoSoModelImpl.HOSOTHUTUCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_HS_DINH_KEM = new FinderPath(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByF_HS_DINH_KEM",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the tthc noidung ho sos where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the matching tthc noidung ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSo> findByF_HS_DINH_KEM(long hoSoThuTucId)
		throws SystemException {
		return findByF_HS_DINH_KEM(hoSoThuTucId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc noidung ho sos where hoSoThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param start the lower bound of the range of tthc noidung ho sos
	 * @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	 * @return the range of matching tthc noidung ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSo> findByF_HS_DINH_KEM(long hoSoThuTucId,
		int start, int end) throws SystemException {
		return findByF_HS_DINH_KEM(hoSoThuTucId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc noidung ho sos where hoSoThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param start the lower bound of the range of tthc noidung ho sos
	 * @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tthc noidung ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSo> findByF_HS_DINH_KEM(long hoSoThuTucId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_HS_DINH_KEM;
			finderArgs = new Object[] { hoSoThuTucId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_F_HS_DINH_KEM;
			finderArgs = new Object[] {
					hoSoThuTucId,
					
					start, end, orderByComparator
				};
		}

		List<TthcNoidungHoSo> list = (List<TthcNoidungHoSo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TthcNoidungHoSo tthcNoidungHoSo : list) {
				if ((hoSoThuTucId != tthcNoidungHoSo.getHoSoThuTucId())) {
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

			query.append(_SQL_SELECT_TTHCNOIDUNGHOSO_WHERE);

			query.append(_FINDER_COLUMN_F_HS_DINH_KEM_HOSOTHUTUCID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TthcNoidungHoSoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				if (!pagination) {
					list = (List<TthcNoidungHoSo>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcNoidungHoSo>(list);
				}
				else {
					list = (List<TthcNoidungHoSo>)QueryUtil.list(q,
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
	 * Returns the first tthc noidung ho so in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc noidung ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo findByF_HS_DINH_KEM_First(long hoSoThuTucId,
		OrderByComparator orderByComparator)
		throws NoSuchTthcNoidungHoSoException, SystemException {
		TthcNoidungHoSo tthcNoidungHoSo = fetchByF_HS_DINH_KEM_First(hoSoThuTucId,
				orderByComparator);

		if (tthcNoidungHoSo != null) {
			return tthcNoidungHoSo;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoSoThuTucId=");
		msg.append(hoSoThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcNoidungHoSoException(msg.toString());
	}

	/**
	 * Returns the first tthc noidung ho so in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo fetchByF_HS_DINH_KEM_First(long hoSoThuTucId,
		OrderByComparator orderByComparator) throws SystemException {
		List<TthcNoidungHoSo> list = findByF_HS_DINH_KEM(hoSoThuTucId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tthc noidung ho so in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc noidung ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo findByF_HS_DINH_KEM_Last(long hoSoThuTucId,
		OrderByComparator orderByComparator)
		throws NoSuchTthcNoidungHoSoException, SystemException {
		TthcNoidungHoSo tthcNoidungHoSo = fetchByF_HS_DINH_KEM_Last(hoSoThuTucId,
				orderByComparator);

		if (tthcNoidungHoSo != null) {
			return tthcNoidungHoSo;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoSoThuTucId=");
		msg.append(hoSoThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcNoidungHoSoException(msg.toString());
	}

	/**
	 * Returns the last tthc noidung ho so in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo fetchByF_HS_DINH_KEM_Last(long hoSoThuTucId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByF_HS_DINH_KEM(hoSoThuTucId);

		if (count == 0) {
			return null;
		}

		List<TthcNoidungHoSo> list = findByF_HS_DINH_KEM(hoSoThuTucId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tthc noidung ho sos before and after the current tthc noidung ho so in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param id the primary key of the current tthc noidung ho so
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tthc noidung ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a tthc noidung ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo[] findByF_HS_DINH_KEM_PrevAndNext(long id,
		long hoSoThuTucId, OrderByComparator orderByComparator)
		throws NoSuchTthcNoidungHoSoException, SystemException {
		TthcNoidungHoSo tthcNoidungHoSo = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TthcNoidungHoSo[] array = new TthcNoidungHoSoImpl[3];

			array[0] = getByF_HS_DINH_KEM_PrevAndNext(session, tthcNoidungHoSo,
					hoSoThuTucId, orderByComparator, true);

			array[1] = tthcNoidungHoSo;

			array[2] = getByF_HS_DINH_KEM_PrevAndNext(session, tthcNoidungHoSo,
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

	protected TthcNoidungHoSo getByF_HS_DINH_KEM_PrevAndNext(Session session,
		TthcNoidungHoSo tthcNoidungHoSo, long hoSoThuTucId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TTHCNOIDUNGHOSO_WHERE);

		query.append(_FINDER_COLUMN_F_HS_DINH_KEM_HOSOTHUTUCID_2);

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
			query.append(TthcNoidungHoSoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(hoSoThuTucId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tthcNoidungHoSo);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TthcNoidungHoSo> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tthc noidung ho sos where hoSoThuTucId = &#63; from the database.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByF_HS_DINH_KEM(long hoSoThuTucId)
		throws SystemException {
		for (TthcNoidungHoSo tthcNoidungHoSo : findByF_HS_DINH_KEM(
				hoSoThuTucId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tthcNoidungHoSo);
		}
	}

	/**
	 * Returns the number of tthc noidung ho sos where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the number of matching tthc noidung ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByF_HS_DINH_KEM(long hoSoThuTucId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_HS_DINH_KEM;

		Object[] finderArgs = new Object[] { hoSoThuTucId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TTHCNOIDUNGHOSO_WHERE);

			query.append(_FINDER_COLUMN_F_HS_DINH_KEM_HOSOTHUTUCID_2);

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

	private static final String _FINDER_COLUMN_F_HS_DINH_KEM_HOSOTHUTUCID_2 = "tthcNoidungHoSo.hoSoThuTucId = ? AND  concat('',tthcNoidungHoSo.noiDungXml * 1) = tthcNoidungHoSo.noiDungXml ";

	public TthcNoidungHoSoPersistenceImpl() {
		setModelClass(TthcNoidungHoSo.class);
	}

	/**
	 * Caches the tthc noidung ho so in the entity cache if it is enabled.
	 *
	 * @param tthcNoidungHoSo the tthc noidung ho so
	 */
	@Override
	public void cacheResult(TthcNoidungHoSo tthcNoidungHoSo) {
		EntityCacheUtil.putResult(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoImpl.class, tthcNoidungHoSo.getPrimaryKey(),
			tthcNoidungHoSo);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID,
			new Object[] {
				tthcNoidungHoSo.getHoSoThuTucId(),
				tthcNoidungHoSo.getBieuMauHoSoId(),
				tthcNoidungHoSo.getThanhPhanHoSoId()
			}, tthcNoidungHoSo);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI,
			new Object[] {
				tthcNoidungHoSo.getHoSoThuTucId(),
				tthcNoidungHoSo.getBieuMauHoSoId(),
				tthcNoidungHoSo.getThanhPhanHoSoId(),
				tthcNoidungHoSo.getTrangThai()
			}, tthcNoidungHoSo);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCID_TAILIEUDINHKEM,
			new Object[] {
				tthcNoidungHoSo.getHoSoThuTucId(),
				tthcNoidungHoSo.getTaiLieuDinhKem()
			}, tthcNoidungHoSo);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOID,
			new Object[] {
				tthcNoidungHoSo.getHoSoThuTucId(),
				tthcNoidungHoSo.getBieuMauHoSoId()
			}, tthcNoidungHoSo);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDTHANHPHANHOSOID,
			new Object[] {
				tthcNoidungHoSo.getHoSoThuTucId(),
				tthcNoidungHoSo.getThanhPhanHoSoId()
			}, tthcNoidungHoSo);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCDONONLINE,
			new Object[] {
				tthcNoidungHoSo.getHoSoThuTucId(),
				tthcNoidungHoSo.getThanhPhanHoSoId()
			}, tthcNoidungHoSo);

		tthcNoidungHoSo.resetOriginalValues();
	}

	/**
	 * Caches the tthc noidung ho sos in the entity cache if it is enabled.
	 *
	 * @param tthcNoidungHoSos the tthc noidung ho sos
	 */
	@Override
	public void cacheResult(List<TthcNoidungHoSo> tthcNoidungHoSos) {
		for (TthcNoidungHoSo tthcNoidungHoSo : tthcNoidungHoSos) {
			if (EntityCacheUtil.getResult(
						TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
						TthcNoidungHoSoImpl.class,
						tthcNoidungHoSo.getPrimaryKey()) == null) {
				cacheResult(tthcNoidungHoSo);
			}
			else {
				tthcNoidungHoSo.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tthc noidung ho sos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TthcNoidungHoSoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TthcNoidungHoSoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tthc noidung ho so.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TthcNoidungHoSo tthcNoidungHoSo) {
		EntityCacheUtil.removeResult(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoImpl.class, tthcNoidungHoSo.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(tthcNoidungHoSo);
	}

	@Override
	public void clearCache(List<TthcNoidungHoSo> tthcNoidungHoSos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TthcNoidungHoSo tthcNoidungHoSo : tthcNoidungHoSos) {
			EntityCacheUtil.removeResult(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
				TthcNoidungHoSoImpl.class, tthcNoidungHoSo.getPrimaryKey());

			clearUniqueFindersCache(tthcNoidungHoSo);
		}
	}

	protected void cacheUniqueFindersCache(TthcNoidungHoSo tthcNoidungHoSo) {
		if (tthcNoidungHoSo.isNew()) {
			Object[] args = new Object[] {
					tthcNoidungHoSo.getHoSoThuTucId(),
					tthcNoidungHoSo.getBieuMauHoSoId(),
					tthcNoidungHoSo.getThanhPhanHoSoId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID,
				args, tthcNoidungHoSo);

			args = new Object[] {
					tthcNoidungHoSo.getHoSoThuTucId(),
					tthcNoidungHoSo.getBieuMauHoSoId(),
					tthcNoidungHoSo.getThanhPhanHoSoId(),
					tthcNoidungHoSo.getTrangThai()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI,
				args, tthcNoidungHoSo);

			args = new Object[] {
					tthcNoidungHoSo.getHoSoThuTucId(),
					tthcNoidungHoSo.getTaiLieuDinhKem()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID_TAILIEUDINHKEM,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCID_TAILIEUDINHKEM,
				args, tthcNoidungHoSo);

			args = new Object[] {
					tthcNoidungHoSo.getHoSoThuTucId(),
					tthcNoidungHoSo.getBieuMauHoSoId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDBIEUMAUHOSOID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOID,
				args, tthcNoidungHoSo);

			args = new Object[] {
					tthcNoidungHoSo.getHoSoThuTucId(),
					tthcNoidungHoSo.getThanhPhanHoSoId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDTHANHPHANHOSOID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDTHANHPHANHOSOID,
				args, tthcNoidungHoSo);

			args = new Object[] {
					tthcNoidungHoSo.getHoSoThuTucId(),
					tthcNoidungHoSo.getThanhPhanHoSoId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCDONONLINE,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCDONONLINE,
				args, tthcNoidungHoSo);
		}
		else {
			TthcNoidungHoSoModelImpl tthcNoidungHoSoModelImpl = (TthcNoidungHoSoModelImpl)tthcNoidungHoSo;

			if ((tthcNoidungHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcNoidungHoSo.getHoSoThuTucId(),
						tthcNoidungHoSo.getBieuMauHoSoId(),
						tthcNoidungHoSo.getThanhPhanHoSoId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID,
					args, tthcNoidungHoSo);
			}

			if ((tthcNoidungHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcNoidungHoSo.getHoSoThuTucId(),
						tthcNoidungHoSo.getBieuMauHoSoId(),
						tthcNoidungHoSo.getThanhPhanHoSoId(),
						tthcNoidungHoSo.getTrangThai()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI,
					args, tthcNoidungHoSo);
			}

			if ((tthcNoidungHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_HOSOTHUTUCID_TAILIEUDINHKEM.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcNoidungHoSo.getHoSoThuTucId(),
						tthcNoidungHoSo.getTaiLieuDinhKem()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID_TAILIEUDINHKEM,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCID_TAILIEUDINHKEM,
					args, tthcNoidungHoSo);
			}

			if ((tthcNoidungHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcNoidungHoSo.getHoSoThuTucId(),
						tthcNoidungHoSo.getBieuMauHoSoId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDBIEUMAUHOSOID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOID,
					args, tthcNoidungHoSo);
			}

			if ((tthcNoidungHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_HOSOTHUTUCIDTHANHPHANHOSOID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcNoidungHoSo.getHoSoThuTucId(),
						tthcNoidungHoSo.getThanhPhanHoSoId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDTHANHPHANHOSOID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDTHANHPHANHOSOID,
					args, tthcNoidungHoSo);
			}

			if ((tthcNoidungHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_HOSOTHUTUCDONONLINE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcNoidungHoSo.getHoSoThuTucId(),
						tthcNoidungHoSo.getThanhPhanHoSoId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCDONONLINE,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCDONONLINE,
					args, tthcNoidungHoSo);
			}
		}
	}

	protected void clearUniqueFindersCache(TthcNoidungHoSo tthcNoidungHoSo) {
		TthcNoidungHoSoModelImpl tthcNoidungHoSoModelImpl = (TthcNoidungHoSoModelImpl)tthcNoidungHoSo;

		Object[] args = new Object[] {
				tthcNoidungHoSo.getHoSoThuTucId(),
				tthcNoidungHoSo.getBieuMauHoSoId(),
				tthcNoidungHoSo.getThanhPhanHoSoId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID,
			args);

		if ((tthcNoidungHoSoModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID.getColumnBitmask()) != 0) {
			args = new Object[] {
					tthcNoidungHoSoModelImpl.getOriginalHoSoThuTucId(),
					tthcNoidungHoSoModelImpl.getOriginalBieuMauHoSoId(),
					tthcNoidungHoSoModelImpl.getOriginalThanhPhanHoSoId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID,
				args);
		}

		args = new Object[] {
				tthcNoidungHoSo.getHoSoThuTucId(),
				tthcNoidungHoSo.getBieuMauHoSoId(),
				tthcNoidungHoSo.getThanhPhanHoSoId(),
				tthcNoidungHoSo.getTrangThai()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI,
			args);

		if ((tthcNoidungHoSoModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI.getColumnBitmask()) != 0) {
			args = new Object[] {
					tthcNoidungHoSoModelImpl.getOriginalHoSoThuTucId(),
					tthcNoidungHoSoModelImpl.getOriginalBieuMauHoSoId(),
					tthcNoidungHoSoModelImpl.getOriginalThanhPhanHoSoId(),
					tthcNoidungHoSoModelImpl.getOriginalTrangThai()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI,
				args);
		}

		args = new Object[] {
				tthcNoidungHoSo.getHoSoThuTucId(),
				tthcNoidungHoSo.getTaiLieuDinhKem()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID_TAILIEUDINHKEM,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCID_TAILIEUDINHKEM,
			args);

		if ((tthcNoidungHoSoModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_HOSOTHUTUCID_TAILIEUDINHKEM.getColumnBitmask()) != 0) {
			args = new Object[] {
					tthcNoidungHoSoModelImpl.getOriginalHoSoThuTucId(),
					tthcNoidungHoSoModelImpl.getOriginalTaiLieuDinhKem()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID_TAILIEUDINHKEM,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCID_TAILIEUDINHKEM,
				args);
		}

		args = new Object[] {
				tthcNoidungHoSo.getHoSoThuTucId(),
				tthcNoidungHoSo.getBieuMauHoSoId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDBIEUMAUHOSOID,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOID,
			args);

		if ((tthcNoidungHoSoModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOID.getColumnBitmask()) != 0) {
			args = new Object[] {
					tthcNoidungHoSoModelImpl.getOriginalHoSoThuTucId(),
					tthcNoidungHoSoModelImpl.getOriginalBieuMauHoSoId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDBIEUMAUHOSOID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOID,
				args);
		}

		args = new Object[] {
				tthcNoidungHoSo.getHoSoThuTucId(),
				tthcNoidungHoSo.getThanhPhanHoSoId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDTHANHPHANHOSOID,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDTHANHPHANHOSOID,
			args);

		if ((tthcNoidungHoSoModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_HOSOTHUTUCIDTHANHPHANHOSOID.getColumnBitmask()) != 0) {
			args = new Object[] {
					tthcNoidungHoSoModelImpl.getOriginalHoSoThuTucId(),
					tthcNoidungHoSoModelImpl.getOriginalThanhPhanHoSoId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDTHANHPHANHOSOID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDTHANHPHANHOSOID,
				args);
		}

		args = new Object[] {
				tthcNoidungHoSo.getHoSoThuTucId(),
				tthcNoidungHoSo.getThanhPhanHoSoId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCDONONLINE,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCDONONLINE,
			args);

		if ((tthcNoidungHoSoModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_HOSOTHUTUCDONONLINE.getColumnBitmask()) != 0) {
			args = new Object[] {
					tthcNoidungHoSoModelImpl.getOriginalHoSoThuTucId(),
					tthcNoidungHoSoModelImpl.getOriginalThanhPhanHoSoId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCDONONLINE,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCDONONLINE,
				args);
		}
	}

	/**
	 * Creates a new tthc noidung ho so with the primary key. Does not add the tthc noidung ho so to the database.
	 *
	 * @param id the primary key for the new tthc noidung ho so
	 * @return the new tthc noidung ho so
	 */
	@Override
	public TthcNoidungHoSo create(long id) {
		TthcNoidungHoSo tthcNoidungHoSo = new TthcNoidungHoSoImpl();

		tthcNoidungHoSo.setNew(true);
		tthcNoidungHoSo.setPrimaryKey(id);

		return tthcNoidungHoSo;
	}

	/**
	 * Removes the tthc noidung ho so with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the tthc noidung ho so
	 * @return the tthc noidung ho so that was removed
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a tthc noidung ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo remove(long id)
		throws NoSuchTthcNoidungHoSoException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the tthc noidung ho so with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tthc noidung ho so
	 * @return the tthc noidung ho so that was removed
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a tthc noidung ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo remove(Serializable primaryKey)
		throws NoSuchTthcNoidungHoSoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TthcNoidungHoSo tthcNoidungHoSo = (TthcNoidungHoSo)session.get(TthcNoidungHoSoImpl.class,
					primaryKey);

			if (tthcNoidungHoSo == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTthcNoidungHoSoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tthcNoidungHoSo);
		}
		catch (NoSuchTthcNoidungHoSoException nsee) {
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
	protected TthcNoidungHoSo removeImpl(TthcNoidungHoSo tthcNoidungHoSo)
		throws SystemException {
		tthcNoidungHoSo = toUnwrappedModel(tthcNoidungHoSo);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tthcNoidungHoSo)) {
				tthcNoidungHoSo = (TthcNoidungHoSo)session.get(TthcNoidungHoSoImpl.class,
						tthcNoidungHoSo.getPrimaryKeyObj());
			}

			if (tthcNoidungHoSo != null) {
				session.delete(tthcNoidungHoSo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tthcNoidungHoSo != null) {
			clearCache(tthcNoidungHoSo);
		}

		return tthcNoidungHoSo;
	}

	@Override
	public TthcNoidungHoSo updateImpl(
		vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo tthcNoidungHoSo)
		throws SystemException {
		tthcNoidungHoSo = toUnwrappedModel(tthcNoidungHoSo);

		boolean isNew = tthcNoidungHoSo.isNew();

		TthcNoidungHoSoModelImpl tthcNoidungHoSoModelImpl = (TthcNoidungHoSoModelImpl)tthcNoidungHoSo;

		Session session = null;

		try {
			session = openSession();

			if (tthcNoidungHoSo.isNew()) {
				session.save(tthcNoidungHoSo);

				tthcNoidungHoSo.setNew(false);
			}
			else {
				session.merge(tthcNoidungHoSo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TthcNoidungHoSoModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tthcNoidungHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCIDANDTHANHPHANHOSOID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcNoidungHoSoModelImpl.getOriginalHoSoThuTucId(),
						tthcNoidungHoSoModelImpl.getOriginalThanhPhanHoSoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDTHANHPHANHOSOID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCIDANDTHANHPHANHOSOID,
					args);

				args = new Object[] {
						tthcNoidungHoSoModelImpl.getHoSoThuTucId(),
						tthcNoidungHoSoModelImpl.getThanhPhanHoSoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDTHANHPHANHOSOID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCIDANDTHANHPHANHOSOID,
					args);
			}

			if ((tthcNoidungHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcNoidungHoSoModelImpl.getOriginalHoSoThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID,
					args);

				args = new Object[] { tthcNoidungHoSoModelImpl.getHoSoThuTucId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID,
					args);
			}

			if ((tthcNoidungHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcNoidungHoSoModelImpl.getOriginalHoSoThuTucId(),
						tthcNoidungHoSoModelImpl.getOriginalBieuMauHoSoId(),
						tthcNoidungHoSoModelImpl.getOriginalMaTuSinh()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH,
					args);

				args = new Object[] {
						tthcNoidungHoSoModelImpl.getHoSoThuTucId(),
						tthcNoidungHoSoModelImpl.getBieuMauHoSoId(),
						tthcNoidungHoSoModelImpl.getMaTuSinh()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH,
					args);
			}

			if ((tthcNoidungHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_HS_DINH_KEM.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcNoidungHoSoModelImpl.getOriginalHoSoThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_HS_DINH_KEM,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_HS_DINH_KEM,
					args);

				args = new Object[] { tthcNoidungHoSoModelImpl.getHoSoThuTucId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_HS_DINH_KEM,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_HS_DINH_KEM,
					args);
			}
		}

		EntityCacheUtil.putResult(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoImpl.class, tthcNoidungHoSo.getPrimaryKey(),
			tthcNoidungHoSo);

		clearUniqueFindersCache(tthcNoidungHoSo);
		cacheUniqueFindersCache(tthcNoidungHoSo);

		return tthcNoidungHoSo;
	}

	protected TthcNoidungHoSo toUnwrappedModel(TthcNoidungHoSo tthcNoidungHoSo) {
		if (tthcNoidungHoSo instanceof TthcNoidungHoSoImpl) {
			return tthcNoidungHoSo;
		}

		TthcNoidungHoSoImpl tthcNoidungHoSoImpl = new TthcNoidungHoSoImpl();

		tthcNoidungHoSoImpl.setNew(tthcNoidungHoSo.isNew());
		tthcNoidungHoSoImpl.setPrimaryKey(tthcNoidungHoSo.getPrimaryKey());

		tthcNoidungHoSoImpl.setId(tthcNoidungHoSo.getId());
		tthcNoidungHoSoImpl.setMaTuSinh(tthcNoidungHoSo.getMaTuSinh());
		tthcNoidungHoSoImpl.setHoSoThuTucId(tthcNoidungHoSo.getHoSoThuTucId());
		tthcNoidungHoSoImpl.setThanhPhanHoSoId(tthcNoidungHoSo.getThanhPhanHoSoId());
		tthcNoidungHoSoImpl.setTenTaiLieu(tthcNoidungHoSo.getTenTaiLieu());
		tthcNoidungHoSoImpl.setTaiLieuDinhKem(tthcNoidungHoSo.getTaiLieuDinhKem());
		tthcNoidungHoSoImpl.setNoiDungXml(tthcNoidungHoSo.getNoiDungXml());
		tthcNoidungHoSoImpl.setNoiDungHtml(tthcNoidungHoSo.getNoiDungHtml());
		tthcNoidungHoSoImpl.setBieuMauHoSoId(tthcNoidungHoSo.getBieuMauHoSoId());
		tthcNoidungHoSoImpl.setNgayGuiNhan(tthcNoidungHoSo.getNgayGuiNhan());
		tthcNoidungHoSoImpl.setLoaiTaiLieu(tthcNoidungHoSo.getLoaiTaiLieu());
		tthcNoidungHoSoImpl.setNgayTao(tthcNoidungHoSo.getNgayTao());
		tthcNoidungHoSoImpl.setNguoiTao(tthcNoidungHoSo.getNguoiTao());
		tthcNoidungHoSoImpl.setTrangThai(tthcNoidungHoSo.getTrangThai());

		return tthcNoidungHoSoImpl;
	}

	/**
	 * Returns the tthc noidung ho so with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc noidung ho so
	 * @return the tthc noidung ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a tthc noidung ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTthcNoidungHoSoException, SystemException {
		TthcNoidungHoSo tthcNoidungHoSo = fetchByPrimaryKey(primaryKey);

		if (tthcNoidungHoSo == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTthcNoidungHoSoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tthcNoidungHoSo;
	}

	/**
	 * Returns the tthc noidung ho so with the primary key or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException} if it could not be found.
	 *
	 * @param id the primary key of the tthc noidung ho so
	 * @return the tthc noidung ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a tthc noidung ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo findByPrimaryKey(long id)
		throws NoSuchTthcNoidungHoSoException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the tthc noidung ho so with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc noidung ho so
	 * @return the tthc noidung ho so, or <code>null</code> if a tthc noidung ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TthcNoidungHoSo tthcNoidungHoSo = (TthcNoidungHoSo)EntityCacheUtil.getResult(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
				TthcNoidungHoSoImpl.class, primaryKey);

		if (tthcNoidungHoSo == _nullTthcNoidungHoSo) {
			return null;
		}

		if (tthcNoidungHoSo == null) {
			Session session = null;

			try {
				session = openSession();

				tthcNoidungHoSo = (TthcNoidungHoSo)session.get(TthcNoidungHoSoImpl.class,
						primaryKey);

				if (tthcNoidungHoSo != null) {
					cacheResult(tthcNoidungHoSo);
				}
				else {
					EntityCacheUtil.putResult(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
						TthcNoidungHoSoImpl.class, primaryKey,
						_nullTthcNoidungHoSo);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
					TthcNoidungHoSoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tthcNoidungHoSo;
	}

	/**
	 * Returns the tthc noidung ho so with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the tthc noidung ho so
	 * @return the tthc noidung ho so, or <code>null</code> if a tthc noidung ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the tthc noidung ho sos.
	 *
	 * @return the tthc noidung ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSo> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc noidung ho sos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc noidung ho sos
	 * @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	 * @return the range of tthc noidung ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSo> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc noidung ho sos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc noidung ho sos
	 * @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tthc noidung ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSo> findAll(int start, int end,
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

		List<TthcNoidungHoSo> list = (List<TthcNoidungHoSo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TTHCNOIDUNGHOSO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TTHCNOIDUNGHOSO;

				if (pagination) {
					sql = sql.concat(TthcNoidungHoSoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TthcNoidungHoSo>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcNoidungHoSo>(list);
				}
				else {
					list = (List<TthcNoidungHoSo>)QueryUtil.list(q,
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
	 * Removes all the tthc noidung ho sos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TthcNoidungHoSo tthcNoidungHoSo : findAll()) {
			remove(tthcNoidungHoSo);
		}
	}

	/**
	 * Returns the number of tthc noidung ho sos.
	 *
	 * @return the number of tthc noidung ho sos
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

				Query q = session.createQuery(_SQL_COUNT_TTHCNOIDUNGHOSO);

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
	 * Initializes the tthc noidung ho so persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TthcNoidungHoSo>> listenersList = new ArrayList<ModelListener<TthcNoidungHoSo>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TthcNoidungHoSo>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TthcNoidungHoSoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TTHCNOIDUNGHOSO = "SELECT tthcNoidungHoSo FROM TthcNoidungHoSo tthcNoidungHoSo";
	private static final String _SQL_SELECT_TTHCNOIDUNGHOSO_WHERE = "SELECT tthcNoidungHoSo FROM TthcNoidungHoSo tthcNoidungHoSo WHERE ";
	private static final String _SQL_COUNT_TTHCNOIDUNGHOSO = "SELECT COUNT(tthcNoidungHoSo) FROM TthcNoidungHoSo tthcNoidungHoSo";
	private static final String _SQL_COUNT_TTHCNOIDUNGHOSO_WHERE = "SELECT COUNT(tthcNoidungHoSo) FROM TthcNoidungHoSo tthcNoidungHoSo WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tthcNoidungHoSo.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TthcNoidungHoSo exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TthcNoidungHoSo exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TthcNoidungHoSoPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"maTuSinh", "hoSoThuTucId", "thanhPhanHoSoId", "tenTaiLieu",
				"taiLieuDinhKem", "noiDungXml", "bieuMauHoSoId", "ngayGuiNhan",
				"loaiTaiLieu", "ngayTao", "nguoiTao", "trangThai"
			});
	private static TthcNoidungHoSo _nullTthcNoidungHoSo = new TthcNoidungHoSoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TthcNoidungHoSo> toCacheModel() {
				return _nullTthcNoidungHoSoCacheModel;
			}
		};

	private static CacheModel<TthcNoidungHoSo> _nullTthcNoidungHoSoCacheModel = new CacheModel<TthcNoidungHoSo>() {
			@Override
			public TthcNoidungHoSo toEntityModel() {
				return _nullTthcNoidungHoSo;
			}
		};
}