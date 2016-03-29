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

import vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException;
import vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp;
import vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoTmpImpl;
import vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoTmpModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the tthc noidung ho so tmp service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcNoidungHoSoTmpPersistence
 * @see TthcNoidungHoSoTmpUtil
 * @generated
 */
public class TthcNoidungHoSoTmpPersistenceImpl extends BasePersistenceImpl<TthcNoidungHoSoTmp>
	implements TthcNoidungHoSoTmpPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TthcNoidungHoSoTmpUtil} to access the tthc noidung ho so tmp persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TthcNoidungHoSoTmpImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TthcNoidungHoSoTmpModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoTmpModelImpl.FINDER_CACHE_ENABLED,
			TthcNoidungHoSoTmpImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TthcNoidungHoSoTmpModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoTmpModelImpl.FINDER_CACHE_ENABLED,
			TthcNoidungHoSoTmpImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TthcNoidungHoSoTmpModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoTmpModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID =
		new FinderPath(TthcNoidungHoSoTmpModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoTmpModelImpl.FINDER_CACHE_ENABLED,
			TthcNoidungHoSoTmpImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			TthcNoidungHoSoTmpModelImpl.HOSOTHUTUCID_COLUMN_BITMASK |
			TthcNoidungHoSoTmpModelImpl.BIEUMAUHOSOID_COLUMN_BITMASK |
			TthcNoidungHoSoTmpModelImpl.THANHPHANHOSOID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID =
		new FinderPath(TthcNoidungHoSoTmpModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoTmpModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

	/**
	 * Returns the tthc noidung ho so tmp where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException} if it could not be found.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @return the matching tthc noidung ho so tmp
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException if a matching tthc noidung ho so tmp could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoTmp findByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId)
		throws NoSuchTthcNoidungHoSoTmpException, SystemException {
		TthcNoidungHoSoTmp tthcNoidungHoSoTmp = fetchByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId,
				bieuMauHoSoId, thanhPhanHoSoId);

		if (tthcNoidungHoSoTmp == null) {
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

			throw new NoSuchTthcNoidungHoSoTmpException(msg.toString());
		}

		return tthcNoidungHoSoTmp;
	}

	/**
	 * Returns the tthc noidung ho so tmp where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @return the matching tthc noidung ho so tmp, or <code>null</code> if a matching tthc noidung ho so tmp could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoTmp fetchByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId)
		throws SystemException {
		return fetchByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId,
			bieuMauHoSoId, thanhPhanHoSoId, true);
	}

	/**
	 * Returns the tthc noidung ho so tmp where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching tthc noidung ho so tmp, or <code>null</code> if a matching tthc noidung ho so tmp could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoTmp fetchByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(
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

		if (result instanceof TthcNoidungHoSoTmp) {
			TthcNoidungHoSoTmp tthcNoidungHoSoTmp = (TthcNoidungHoSoTmp)result;

			if ((hoSoThuTucId != tthcNoidungHoSoTmp.getHoSoThuTucId()) ||
					(bieuMauHoSoId != tthcNoidungHoSoTmp.getBieuMauHoSoId()) ||
					(thanhPhanHoSoId != tthcNoidungHoSoTmp.getThanhPhanHoSoId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_TTHCNOIDUNGHOSOTMP_WHERE);

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

				List<TthcNoidungHoSoTmp> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"TthcNoidungHoSoTmpPersistenceImpl.fetchByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(long, long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					TthcNoidungHoSoTmp tthcNoidungHoSoTmp = list.get(0);

					result = tthcNoidungHoSoTmp;

					cacheResult(tthcNoidungHoSoTmp);

					if ((tthcNoidungHoSoTmp.getHoSoThuTucId() != hoSoThuTucId) ||
							(tthcNoidungHoSoTmp.getBieuMauHoSoId() != bieuMauHoSoId) ||
							(tthcNoidungHoSoTmp.getThanhPhanHoSoId() != thanhPhanHoSoId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID,
							finderArgs, tthcNoidungHoSoTmp);
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
			return (TthcNoidungHoSoTmp)result;
		}
	}

	/**
	 * Removes the tthc noidung ho so tmp where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; from the database.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @return the tthc noidung ho so tmp that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoTmp removeByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId)
		throws NoSuchTthcNoidungHoSoTmpException, SystemException {
		TthcNoidungHoSoTmp tthcNoidungHoSoTmp = findByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId,
				bieuMauHoSoId, thanhPhanHoSoId);

		return remove(tthcNoidungHoSoTmp);
	}

	/**
	 * Returns the number of tthc noidung ho so tmps where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @return the number of matching tthc noidung ho so tmps
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

			query.append(_SQL_COUNT_TTHCNOIDUNGHOSOTMP_WHERE);

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
		"tthcNoidungHoSoTmp.hoSoThuTucId = ? AND ";
	private static final String _FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID_BIEUMAUHOSOID_2 =
		"tthcNoidungHoSoTmp.bieuMauHoSoId = ? AND ";
	private static final String _FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID_THANHPHANHOSOID_2 =
		"tthcNoidungHoSoTmp.thanhPhanHoSoId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI =
		new FinderPath(TthcNoidungHoSoTmpModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoTmpModelImpl.FINDER_CACHE_ENABLED,
			TthcNoidungHoSoTmpImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				Long.class.getName()
			},
			TthcNoidungHoSoTmpModelImpl.HOSOTHUTUCID_COLUMN_BITMASK |
			TthcNoidungHoSoTmpModelImpl.BIEUMAUHOSOID_COLUMN_BITMASK |
			TthcNoidungHoSoTmpModelImpl.THANHPHANHOSOID_COLUMN_BITMASK |
			TthcNoidungHoSoTmpModelImpl.TRANGTHAI_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI =
		new FinderPath(TthcNoidungHoSoTmpModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoTmpModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				Long.class.getName()
			});

	/**
	 * Returns the tthc noidung ho so tmp where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; and trangThai = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException} if it could not be found.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @param trangThai the trang thai
	 * @return the matching tthc noidung ho so tmp
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException if a matching tthc noidung ho so tmp could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoTmp findByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId,
		long trangThai)
		throws NoSuchTthcNoidungHoSoTmpException, SystemException {
		TthcNoidungHoSoTmp tthcNoidungHoSoTmp = fetchByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai(hoSoThuTucId,
				bieuMauHoSoId, thanhPhanHoSoId, trangThai);

		if (tthcNoidungHoSoTmp == null) {
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

			throw new NoSuchTthcNoidungHoSoTmpException(msg.toString());
		}

		return tthcNoidungHoSoTmp;
	}

	/**
	 * Returns the tthc noidung ho so tmp where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; and trangThai = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @param trangThai the trang thai
	 * @return the matching tthc noidung ho so tmp, or <code>null</code> if a matching tthc noidung ho so tmp could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoTmp fetchByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId,
		long trangThai) throws SystemException {
		return fetchByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai(hoSoThuTucId,
			bieuMauHoSoId, thanhPhanHoSoId, trangThai, true);
	}

	/**
	 * Returns the tthc noidung ho so tmp where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; and trangThai = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @param trangThai the trang thai
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching tthc noidung ho so tmp, or <code>null</code> if a matching tthc noidung ho so tmp could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoTmp fetchByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai(
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

		if (result instanceof TthcNoidungHoSoTmp) {
			TthcNoidungHoSoTmp tthcNoidungHoSoTmp = (TthcNoidungHoSoTmp)result;

			if ((hoSoThuTucId != tthcNoidungHoSoTmp.getHoSoThuTucId()) ||
					(bieuMauHoSoId != tthcNoidungHoSoTmp.getBieuMauHoSoId()) ||
					(thanhPhanHoSoId != tthcNoidungHoSoTmp.getThanhPhanHoSoId()) ||
					(trangThai != tthcNoidungHoSoTmp.getTrangThai())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(6);

			query.append(_SQL_SELECT_TTHCNOIDUNGHOSOTMP_WHERE);

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

				List<TthcNoidungHoSoTmp> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"TthcNoidungHoSoTmpPersistenceImpl.fetchByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai(long, long, long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					TthcNoidungHoSoTmp tthcNoidungHoSoTmp = list.get(0);

					result = tthcNoidungHoSoTmp;

					cacheResult(tthcNoidungHoSoTmp);

					if ((tthcNoidungHoSoTmp.getHoSoThuTucId() != hoSoThuTucId) ||
							(tthcNoidungHoSoTmp.getBieuMauHoSoId() != bieuMauHoSoId) ||
							(tthcNoidungHoSoTmp.getThanhPhanHoSoId() != thanhPhanHoSoId) ||
							(tthcNoidungHoSoTmp.getTrangThai() != trangThai)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI,
							finderArgs, tthcNoidungHoSoTmp);
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
			return (TthcNoidungHoSoTmp)result;
		}
	}

	/**
	 * Removes the tthc noidung ho so tmp where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; and trangThai = &#63; from the database.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @param trangThai the trang thai
	 * @return the tthc noidung ho so tmp that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoTmp removeByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId,
		long trangThai)
		throws NoSuchTthcNoidungHoSoTmpException, SystemException {
		TthcNoidungHoSoTmp tthcNoidungHoSoTmp = findByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai(hoSoThuTucId,
				bieuMauHoSoId, thanhPhanHoSoId, trangThai);

		return remove(tthcNoidungHoSoTmp);
	}

	/**
	 * Returns the number of tthc noidung ho so tmps where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; and trangThai = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @param trangThai the trang thai
	 * @return the number of matching tthc noidung ho so tmps
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

			query.append(_SQL_COUNT_TTHCNOIDUNGHOSOTMP_WHERE);

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
		"tthcNoidungHoSoTmp.hoSoThuTucId = ? AND ";
	private static final String _FINDER_COLUMN_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI_BIEUMAUHOSOID_2 =
		"tthcNoidungHoSoTmp.bieuMauHoSoId = ? AND ";
	private static final String _FINDER_COLUMN_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI_THANHPHANHOSOID_2 =
		"tthcNoidungHoSoTmp.thanhPhanHoSoId = ? AND ";
	private static final String _FINDER_COLUMN_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI_TRANGTHAI_2 =
		"tthcNoidungHoSoTmp.trangThai = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_HOSOTHUTUCIDANDTHANHPHANHOSOID =
		new FinderPath(TthcNoidungHoSoTmpModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoTmpModelImpl.FINDER_CACHE_ENABLED,
			TthcNoidungHoSoTmpImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByHoSoThuTucIdAndThanhPhanHoSoId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCIDANDTHANHPHANHOSOID =
		new FinderPath(TthcNoidungHoSoTmpModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoTmpModelImpl.FINDER_CACHE_ENABLED,
			TthcNoidungHoSoTmpImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByHoSoThuTucIdAndThanhPhanHoSoId",
			new String[] { Long.class.getName(), Long.class.getName() },
			TthcNoidungHoSoTmpModelImpl.HOSOTHUTUCID_COLUMN_BITMASK |
			TthcNoidungHoSoTmpModelImpl.THANHPHANHOSOID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDTHANHPHANHOSOID =
		new FinderPath(TthcNoidungHoSoTmpModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoTmpModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByHoSoThuTucIdAndThanhPhanHoSoId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the tthc noidung ho so tmps where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @return the matching tthc noidung ho so tmps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSoTmp> findByHoSoThuTucIdAndThanhPhanHoSoId(
		long hoSoThuTucId, long thanhPhanHoSoId) throws SystemException {
		return findByHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId,
			thanhPhanHoSoId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc noidung ho so tmps where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoTmpModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @param start the lower bound of the range of tthc noidung ho so tmps
	 * @param end the upper bound of the range of tthc noidung ho so tmps (not inclusive)
	 * @return the range of matching tthc noidung ho so tmps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSoTmp> findByHoSoThuTucIdAndThanhPhanHoSoId(
		long hoSoThuTucId, long thanhPhanHoSoId, int start, int end)
		throws SystemException {
		return findByHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId,
			thanhPhanHoSoId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc noidung ho so tmps where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoTmpModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @param start the lower bound of the range of tthc noidung ho so tmps
	 * @param end the upper bound of the range of tthc noidung ho so tmps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tthc noidung ho so tmps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSoTmp> findByHoSoThuTucIdAndThanhPhanHoSoId(
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

		List<TthcNoidungHoSoTmp> list = (List<TthcNoidungHoSoTmp>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TthcNoidungHoSoTmp tthcNoidungHoSoTmp : list) {
				if ((hoSoThuTucId != tthcNoidungHoSoTmp.getHoSoThuTucId()) ||
						(thanhPhanHoSoId != tthcNoidungHoSoTmp.getThanhPhanHoSoId())) {
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

			query.append(_SQL_SELECT_TTHCNOIDUNGHOSOTMP_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCIDANDTHANHPHANHOSOID_HOSOTHUTUCID_2);

			query.append(_FINDER_COLUMN_HOSOTHUTUCIDANDTHANHPHANHOSOID_THANHPHANHOSOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TthcNoidungHoSoTmpModelImpl.ORDER_BY_JPQL);
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
					list = (List<TthcNoidungHoSoTmp>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcNoidungHoSoTmp>(list);
				}
				else {
					list = (List<TthcNoidungHoSoTmp>)QueryUtil.list(q,
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
	 * Returns the first tthc noidung ho so tmp in the ordered set where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc noidung ho so tmp
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException if a matching tthc noidung ho so tmp could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoTmp findByHoSoThuTucIdAndThanhPhanHoSoId_First(
		long hoSoThuTucId, long thanhPhanHoSoId,
		OrderByComparator orderByComparator)
		throws NoSuchTthcNoidungHoSoTmpException, SystemException {
		TthcNoidungHoSoTmp tthcNoidungHoSoTmp = fetchByHoSoThuTucIdAndThanhPhanHoSoId_First(hoSoThuTucId,
				thanhPhanHoSoId, orderByComparator);

		if (tthcNoidungHoSoTmp != null) {
			return tthcNoidungHoSoTmp;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoSoThuTucId=");
		msg.append(hoSoThuTucId);

		msg.append(", thanhPhanHoSoId=");
		msg.append(thanhPhanHoSoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcNoidungHoSoTmpException(msg.toString());
	}

	/**
	 * Returns the first tthc noidung ho so tmp in the ordered set where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc noidung ho so tmp, or <code>null</code> if a matching tthc noidung ho so tmp could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoTmp fetchByHoSoThuTucIdAndThanhPhanHoSoId_First(
		long hoSoThuTucId, long thanhPhanHoSoId,
		OrderByComparator orderByComparator) throws SystemException {
		List<TthcNoidungHoSoTmp> list = findByHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId,
				thanhPhanHoSoId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tthc noidung ho so tmp in the ordered set where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc noidung ho so tmp
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException if a matching tthc noidung ho so tmp could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoTmp findByHoSoThuTucIdAndThanhPhanHoSoId_Last(
		long hoSoThuTucId, long thanhPhanHoSoId,
		OrderByComparator orderByComparator)
		throws NoSuchTthcNoidungHoSoTmpException, SystemException {
		TthcNoidungHoSoTmp tthcNoidungHoSoTmp = fetchByHoSoThuTucIdAndThanhPhanHoSoId_Last(hoSoThuTucId,
				thanhPhanHoSoId, orderByComparator);

		if (tthcNoidungHoSoTmp != null) {
			return tthcNoidungHoSoTmp;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoSoThuTucId=");
		msg.append(hoSoThuTucId);

		msg.append(", thanhPhanHoSoId=");
		msg.append(thanhPhanHoSoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcNoidungHoSoTmpException(msg.toString());
	}

	/**
	 * Returns the last tthc noidung ho so tmp in the ordered set where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc noidung ho so tmp, or <code>null</code> if a matching tthc noidung ho so tmp could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoTmp fetchByHoSoThuTucIdAndThanhPhanHoSoId_Last(
		long hoSoThuTucId, long thanhPhanHoSoId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId,
				thanhPhanHoSoId);

		if (count == 0) {
			return null;
		}

		List<TthcNoidungHoSoTmp> list = findByHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId,
				thanhPhanHoSoId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tthc noidung ho so tmps before and after the current tthc noidung ho so tmp in the ordered set where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	 *
	 * @param id the primary key of the current tthc noidung ho so tmp
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tthc noidung ho so tmp
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException if a tthc noidung ho so tmp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoTmp[] findByHoSoThuTucIdAndThanhPhanHoSoId_PrevAndNext(
		long id, long hoSoThuTucId, long thanhPhanHoSoId,
		OrderByComparator orderByComparator)
		throws NoSuchTthcNoidungHoSoTmpException, SystemException {
		TthcNoidungHoSoTmp tthcNoidungHoSoTmp = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TthcNoidungHoSoTmp[] array = new TthcNoidungHoSoTmpImpl[3];

			array[0] = getByHoSoThuTucIdAndThanhPhanHoSoId_PrevAndNext(session,
					tthcNoidungHoSoTmp, hoSoThuTucId, thanhPhanHoSoId,
					orderByComparator, true);

			array[1] = tthcNoidungHoSoTmp;

			array[2] = getByHoSoThuTucIdAndThanhPhanHoSoId_PrevAndNext(session,
					tthcNoidungHoSoTmp, hoSoThuTucId, thanhPhanHoSoId,
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

	protected TthcNoidungHoSoTmp getByHoSoThuTucIdAndThanhPhanHoSoId_PrevAndNext(
		Session session, TthcNoidungHoSoTmp tthcNoidungHoSoTmp,
		long hoSoThuTucId, long thanhPhanHoSoId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TTHCNOIDUNGHOSOTMP_WHERE);

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
			query.append(TthcNoidungHoSoTmpModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(hoSoThuTucId);

		qPos.add(thanhPhanHoSoId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tthcNoidungHoSoTmp);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TthcNoidungHoSoTmp> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tthc noidung ho so tmps where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63; from the database.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByHoSoThuTucIdAndThanhPhanHoSoId(long hoSoThuTucId,
		long thanhPhanHoSoId) throws SystemException {
		for (TthcNoidungHoSoTmp tthcNoidungHoSoTmp : findByHoSoThuTucIdAndThanhPhanHoSoId(
				hoSoThuTucId, thanhPhanHoSoId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tthcNoidungHoSoTmp);
		}
	}

	/**
	 * Returns the number of tthc noidung ho so tmps where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @return the number of matching tthc noidung ho so tmps
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

			query.append(_SQL_COUNT_TTHCNOIDUNGHOSOTMP_WHERE);

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
		"tthcNoidungHoSoTmp.hoSoThuTucId = ? AND ";
	private static final String _FINDER_COLUMN_HOSOTHUTUCIDANDTHANHPHANHOSOID_THANHPHANHOSOID_2 =
		"tthcNoidungHoSoTmp.thanhPhanHoSoId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_HOSOTHUTUCID =
		new FinderPath(TthcNoidungHoSoTmpModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoTmpModelImpl.FINDER_CACHE_ENABLED,
			TthcNoidungHoSoTmpImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByHoSoThuTucId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID =
		new FinderPath(TthcNoidungHoSoTmpModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoTmpModelImpl.FINDER_CACHE_ENABLED,
			TthcNoidungHoSoTmpImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByHoSoThuTucId",
			new String[] { Long.class.getName() },
			TthcNoidungHoSoTmpModelImpl.HOSOTHUTUCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_HOSOTHUTUCID = new FinderPath(TthcNoidungHoSoTmpModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoTmpModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByHoSoThuTucId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the tthc noidung ho so tmps where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the matching tthc noidung ho so tmps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSoTmp> findByHoSoThuTucId(long hoSoThuTucId)
		throws SystemException {
		return findByHoSoThuTucId(hoSoThuTucId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc noidung ho so tmps where hoSoThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoTmpModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param start the lower bound of the range of tthc noidung ho so tmps
	 * @param end the upper bound of the range of tthc noidung ho so tmps (not inclusive)
	 * @return the range of matching tthc noidung ho so tmps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSoTmp> findByHoSoThuTucId(long hoSoThuTucId,
		int start, int end) throws SystemException {
		return findByHoSoThuTucId(hoSoThuTucId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc noidung ho so tmps where hoSoThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoTmpModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param start the lower bound of the range of tthc noidung ho so tmps
	 * @param end the upper bound of the range of tthc noidung ho so tmps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tthc noidung ho so tmps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSoTmp> findByHoSoThuTucId(long hoSoThuTucId,
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

		List<TthcNoidungHoSoTmp> list = (List<TthcNoidungHoSoTmp>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TthcNoidungHoSoTmp tthcNoidungHoSoTmp : list) {
				if ((hoSoThuTucId != tthcNoidungHoSoTmp.getHoSoThuTucId())) {
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

			query.append(_SQL_SELECT_TTHCNOIDUNGHOSOTMP_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TthcNoidungHoSoTmpModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				if (!pagination) {
					list = (List<TthcNoidungHoSoTmp>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcNoidungHoSoTmp>(list);
				}
				else {
					list = (List<TthcNoidungHoSoTmp>)QueryUtil.list(q,
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
	 * Returns the first tthc noidung ho so tmp in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc noidung ho so tmp
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException if a matching tthc noidung ho so tmp could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoTmp findByHoSoThuTucId_First(long hoSoThuTucId,
		OrderByComparator orderByComparator)
		throws NoSuchTthcNoidungHoSoTmpException, SystemException {
		TthcNoidungHoSoTmp tthcNoidungHoSoTmp = fetchByHoSoThuTucId_First(hoSoThuTucId,
				orderByComparator);

		if (tthcNoidungHoSoTmp != null) {
			return tthcNoidungHoSoTmp;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoSoThuTucId=");
		msg.append(hoSoThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcNoidungHoSoTmpException(msg.toString());
	}

	/**
	 * Returns the first tthc noidung ho so tmp in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc noidung ho so tmp, or <code>null</code> if a matching tthc noidung ho so tmp could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoTmp fetchByHoSoThuTucId_First(long hoSoThuTucId,
		OrderByComparator orderByComparator) throws SystemException {
		List<TthcNoidungHoSoTmp> list = findByHoSoThuTucId(hoSoThuTucId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tthc noidung ho so tmp in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc noidung ho so tmp
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException if a matching tthc noidung ho so tmp could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoTmp findByHoSoThuTucId_Last(long hoSoThuTucId,
		OrderByComparator orderByComparator)
		throws NoSuchTthcNoidungHoSoTmpException, SystemException {
		TthcNoidungHoSoTmp tthcNoidungHoSoTmp = fetchByHoSoThuTucId_Last(hoSoThuTucId,
				orderByComparator);

		if (tthcNoidungHoSoTmp != null) {
			return tthcNoidungHoSoTmp;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoSoThuTucId=");
		msg.append(hoSoThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcNoidungHoSoTmpException(msg.toString());
	}

	/**
	 * Returns the last tthc noidung ho so tmp in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc noidung ho so tmp, or <code>null</code> if a matching tthc noidung ho so tmp could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoTmp fetchByHoSoThuTucId_Last(long hoSoThuTucId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByHoSoThuTucId(hoSoThuTucId);

		if (count == 0) {
			return null;
		}

		List<TthcNoidungHoSoTmp> list = findByHoSoThuTucId(hoSoThuTucId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tthc noidung ho so tmps before and after the current tthc noidung ho so tmp in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param id the primary key of the current tthc noidung ho so tmp
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tthc noidung ho so tmp
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException if a tthc noidung ho so tmp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoTmp[] findByHoSoThuTucId_PrevAndNext(long id,
		long hoSoThuTucId, OrderByComparator orderByComparator)
		throws NoSuchTthcNoidungHoSoTmpException, SystemException {
		TthcNoidungHoSoTmp tthcNoidungHoSoTmp = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TthcNoidungHoSoTmp[] array = new TthcNoidungHoSoTmpImpl[3];

			array[0] = getByHoSoThuTucId_PrevAndNext(session,
					tthcNoidungHoSoTmp, hoSoThuTucId, orderByComparator, true);

			array[1] = tthcNoidungHoSoTmp;

			array[2] = getByHoSoThuTucId_PrevAndNext(session,
					tthcNoidungHoSoTmp, hoSoThuTucId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TthcNoidungHoSoTmp getByHoSoThuTucId_PrevAndNext(
		Session session, TthcNoidungHoSoTmp tthcNoidungHoSoTmp,
		long hoSoThuTucId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TTHCNOIDUNGHOSOTMP_WHERE);

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
			query.append(TthcNoidungHoSoTmpModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(hoSoThuTucId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tthcNoidungHoSoTmp);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TthcNoidungHoSoTmp> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tthc noidung ho so tmps where hoSoThuTucId = &#63; from the database.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByHoSoThuTucId(long hoSoThuTucId)
		throws SystemException {
		for (TthcNoidungHoSoTmp tthcNoidungHoSoTmp : findByHoSoThuTucId(
				hoSoThuTucId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tthcNoidungHoSoTmp);
		}
	}

	/**
	 * Returns the number of tthc noidung ho so tmps where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the number of matching tthc noidung ho so tmps
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

			query.append(_SQL_COUNT_TTHCNOIDUNGHOSOTMP_WHERE);

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

	private static final String _FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2 = "tthcNoidungHoSoTmp.hoSoThuTucId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOID =
		new FinderPath(TthcNoidungHoSoTmpModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoTmpModelImpl.FINDER_CACHE_ENABLED,
			TthcNoidungHoSoTmpImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByHoSoThuTucIdAndBieuMauHoSoId",
			new String[] { Long.class.getName(), Long.class.getName() },
			TthcNoidungHoSoTmpModelImpl.HOSOTHUTUCID_COLUMN_BITMASK |
			TthcNoidungHoSoTmpModelImpl.BIEUMAUHOSOID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDBIEUMAUHOSOID =
		new FinderPath(TthcNoidungHoSoTmpModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoTmpModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByHoSoThuTucIdAndBieuMauHoSoId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the tthc noidung ho so tmp where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException} if it could not be found.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @return the matching tthc noidung ho so tmp
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException if a matching tthc noidung ho so tmp could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoTmp findByHoSoThuTucIdAndBieuMauHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId)
		throws NoSuchTthcNoidungHoSoTmpException, SystemException {
		TthcNoidungHoSoTmp tthcNoidungHoSoTmp = fetchByHoSoThuTucIdAndBieuMauHoSoId(hoSoThuTucId,
				bieuMauHoSoId);

		if (tthcNoidungHoSoTmp == null) {
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

			throw new NoSuchTthcNoidungHoSoTmpException(msg.toString());
		}

		return tthcNoidungHoSoTmp;
	}

	/**
	 * Returns the tthc noidung ho so tmp where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @return the matching tthc noidung ho so tmp, or <code>null</code> if a matching tthc noidung ho so tmp could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoTmp fetchByHoSoThuTucIdAndBieuMauHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId) throws SystemException {
		return fetchByHoSoThuTucIdAndBieuMauHoSoId(hoSoThuTucId, bieuMauHoSoId,
			true);
	}

	/**
	 * Returns the tthc noidung ho so tmp where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching tthc noidung ho so tmp, or <code>null</code> if a matching tthc noidung ho so tmp could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoTmp fetchByHoSoThuTucIdAndBieuMauHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { hoSoThuTucId, bieuMauHoSoId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOID,
					finderArgs, this);
		}

		if (result instanceof TthcNoidungHoSoTmp) {
			TthcNoidungHoSoTmp tthcNoidungHoSoTmp = (TthcNoidungHoSoTmp)result;

			if ((hoSoThuTucId != tthcNoidungHoSoTmp.getHoSoThuTucId()) ||
					(bieuMauHoSoId != tthcNoidungHoSoTmp.getBieuMauHoSoId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_TTHCNOIDUNGHOSOTMP_WHERE);

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

				List<TthcNoidungHoSoTmp> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"TthcNoidungHoSoTmpPersistenceImpl.fetchByHoSoThuTucIdAndBieuMauHoSoId(long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					TthcNoidungHoSoTmp tthcNoidungHoSoTmp = list.get(0);

					result = tthcNoidungHoSoTmp;

					cacheResult(tthcNoidungHoSoTmp);

					if ((tthcNoidungHoSoTmp.getHoSoThuTucId() != hoSoThuTucId) ||
							(tthcNoidungHoSoTmp.getBieuMauHoSoId() != bieuMauHoSoId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOID,
							finderArgs, tthcNoidungHoSoTmp);
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
			return (TthcNoidungHoSoTmp)result;
		}
	}

	/**
	 * Removes the tthc noidung ho so tmp where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; from the database.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @return the tthc noidung ho so tmp that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoTmp removeByHoSoThuTucIdAndBieuMauHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId)
		throws NoSuchTthcNoidungHoSoTmpException, SystemException {
		TthcNoidungHoSoTmp tthcNoidungHoSoTmp = findByHoSoThuTucIdAndBieuMauHoSoId(hoSoThuTucId,
				bieuMauHoSoId);

		return remove(tthcNoidungHoSoTmp);
	}

	/**
	 * Returns the number of tthc noidung ho so tmps where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @return the number of matching tthc noidung ho so tmps
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

			query.append(_SQL_COUNT_TTHCNOIDUNGHOSOTMP_WHERE);

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
		"tthcNoidungHoSoTmp.hoSoThuTucId = ? AND ";
	private static final String _FINDER_COLUMN_HOSOTHUTUCIDANDBIEUMAUHOSOID_BIEUMAUHOSOID_2 =
		"tthcNoidungHoSoTmp.bieuMauHoSoId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_HOSOTHUTUCIDTHANHPHANHOSOID =
		new FinderPath(TthcNoidungHoSoTmpModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoTmpModelImpl.FINDER_CACHE_ENABLED,
			TthcNoidungHoSoTmpImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByHoSoThuTucIdThanhPhanHoSoId",
			new String[] { Long.class.getName(), Long.class.getName() },
			TthcNoidungHoSoTmpModelImpl.HOSOTHUTUCID_COLUMN_BITMASK |
			TthcNoidungHoSoTmpModelImpl.THANHPHANHOSOID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_HOSOTHUTUCIDTHANHPHANHOSOID =
		new FinderPath(TthcNoidungHoSoTmpModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoTmpModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByHoSoThuTucIdThanhPhanHoSoId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the tthc noidung ho so tmp where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException} if it could not be found.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @return the matching tthc noidung ho so tmp
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException if a matching tthc noidung ho so tmp could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoTmp findByHoSoThuTucIdThanhPhanHoSoId(
		long hoSoThuTucId, long thanhPhanHoSoId)
		throws NoSuchTthcNoidungHoSoTmpException, SystemException {
		TthcNoidungHoSoTmp tthcNoidungHoSoTmp = fetchByHoSoThuTucIdThanhPhanHoSoId(hoSoThuTucId,
				thanhPhanHoSoId);

		if (tthcNoidungHoSoTmp == null) {
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

			throw new NoSuchTthcNoidungHoSoTmpException(msg.toString());
		}

		return tthcNoidungHoSoTmp;
	}

	/**
	 * Returns the tthc noidung ho so tmp where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @return the matching tthc noidung ho so tmp, or <code>null</code> if a matching tthc noidung ho so tmp could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoTmp fetchByHoSoThuTucIdThanhPhanHoSoId(
		long hoSoThuTucId, long thanhPhanHoSoId) throws SystemException {
		return fetchByHoSoThuTucIdThanhPhanHoSoId(hoSoThuTucId,
			thanhPhanHoSoId, true);
	}

	/**
	 * Returns the tthc noidung ho so tmp where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching tthc noidung ho so tmp, or <code>null</code> if a matching tthc noidung ho so tmp could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoTmp fetchByHoSoThuTucIdThanhPhanHoSoId(
		long hoSoThuTucId, long thanhPhanHoSoId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { hoSoThuTucId, thanhPhanHoSoId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDTHANHPHANHOSOID,
					finderArgs, this);
		}

		if (result instanceof TthcNoidungHoSoTmp) {
			TthcNoidungHoSoTmp tthcNoidungHoSoTmp = (TthcNoidungHoSoTmp)result;

			if ((hoSoThuTucId != tthcNoidungHoSoTmp.getHoSoThuTucId()) ||
					(thanhPhanHoSoId != tthcNoidungHoSoTmp.getThanhPhanHoSoId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_TTHCNOIDUNGHOSOTMP_WHERE);

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

				List<TthcNoidungHoSoTmp> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDTHANHPHANHOSOID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"TthcNoidungHoSoTmpPersistenceImpl.fetchByHoSoThuTucIdThanhPhanHoSoId(long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					TthcNoidungHoSoTmp tthcNoidungHoSoTmp = list.get(0);

					result = tthcNoidungHoSoTmp;

					cacheResult(tthcNoidungHoSoTmp);

					if ((tthcNoidungHoSoTmp.getHoSoThuTucId() != hoSoThuTucId) ||
							(tthcNoidungHoSoTmp.getThanhPhanHoSoId() != thanhPhanHoSoId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDTHANHPHANHOSOID,
							finderArgs, tthcNoidungHoSoTmp);
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
			return (TthcNoidungHoSoTmp)result;
		}
	}

	/**
	 * Removes the tthc noidung ho so tmp where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63; from the database.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @return the tthc noidung ho so tmp that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoTmp removeByHoSoThuTucIdThanhPhanHoSoId(
		long hoSoThuTucId, long thanhPhanHoSoId)
		throws NoSuchTthcNoidungHoSoTmpException, SystemException {
		TthcNoidungHoSoTmp tthcNoidungHoSoTmp = findByHoSoThuTucIdThanhPhanHoSoId(hoSoThuTucId,
				thanhPhanHoSoId);

		return remove(tthcNoidungHoSoTmp);
	}

	/**
	 * Returns the number of tthc noidung ho so tmps where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param thanhPhanHoSoId the thanh phan ho so ID
	 * @return the number of matching tthc noidung ho so tmps
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

			query.append(_SQL_COUNT_TTHCNOIDUNGHOSOTMP_WHERE);

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
		"tthcNoidungHoSoTmp.hoSoThuTucId = ? AND ";
	private static final String _FINDER_COLUMN_HOSOTHUTUCIDTHANHPHANHOSOID_THANHPHANHOSOID_2 =
		"tthcNoidungHoSoTmp.thanhPhanHoSoId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH =
		new FinderPath(TthcNoidungHoSoTmpModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoTmpModelImpl.FINDER_CACHE_ENABLED,
			TthcNoidungHoSoTmpImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH =
		new FinderPath(TthcNoidungHoSoTmpModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoTmpModelImpl.FINDER_CACHE_ENABLED,
			TthcNoidungHoSoTmpImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			},
			TthcNoidungHoSoTmpModelImpl.HOSOTHUTUCID_COLUMN_BITMASK |
			TthcNoidungHoSoTmpModelImpl.BIEUMAUHOSOID_COLUMN_BITMASK |
			TthcNoidungHoSoTmpModelImpl.MATUSINH_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH =
		new FinderPath(TthcNoidungHoSoTmpModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoTmpModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the tthc noidung ho so tmps where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @param maTuSinh the ma tu sinh
	 * @return the matching tthc noidung ho so tmps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSoTmp> findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(
		long hoSoThuTucId, long bieuMauHoSoId, String maTuSinh)
		throws SystemException {
		return findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(hoSoThuTucId,
			bieuMauHoSoId, maTuSinh, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc noidung ho so tmps where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoTmpModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @param maTuSinh the ma tu sinh
	 * @param start the lower bound of the range of tthc noidung ho so tmps
	 * @param end the upper bound of the range of tthc noidung ho so tmps (not inclusive)
	 * @return the range of matching tthc noidung ho so tmps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSoTmp> findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(
		long hoSoThuTucId, long bieuMauHoSoId, String maTuSinh, int start,
		int end) throws SystemException {
		return findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(hoSoThuTucId,
			bieuMauHoSoId, maTuSinh, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc noidung ho so tmps where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoTmpModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @param maTuSinh the ma tu sinh
	 * @param start the lower bound of the range of tthc noidung ho so tmps
	 * @param end the upper bound of the range of tthc noidung ho so tmps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tthc noidung ho so tmps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSoTmp> findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(
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

		List<TthcNoidungHoSoTmp> list = (List<TthcNoidungHoSoTmp>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TthcNoidungHoSoTmp tthcNoidungHoSoTmp : list) {
				if ((hoSoThuTucId != tthcNoidungHoSoTmp.getHoSoThuTucId()) ||
						(bieuMauHoSoId != tthcNoidungHoSoTmp.getBieuMauHoSoId()) ||
						!Validator.equals(maTuSinh,
							tthcNoidungHoSoTmp.getMaTuSinh())) {
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

			query.append(_SQL_SELECT_TTHCNOIDUNGHOSOTMP_WHERE);

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
				query.append(TthcNoidungHoSoTmpModelImpl.ORDER_BY_JPQL);
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
					list = (List<TthcNoidungHoSoTmp>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcNoidungHoSoTmp>(list);
				}
				else {
					list = (List<TthcNoidungHoSoTmp>)QueryUtil.list(q,
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
	 * Returns the first tthc noidung ho so tmp in the ordered set where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @param maTuSinh the ma tu sinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc noidung ho so tmp
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException if a matching tthc noidung ho so tmp could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoTmp findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_First(
		long hoSoThuTucId, long bieuMauHoSoId, String maTuSinh,
		OrderByComparator orderByComparator)
		throws NoSuchTthcNoidungHoSoTmpException, SystemException {
		TthcNoidungHoSoTmp tthcNoidungHoSoTmp = fetchByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_First(hoSoThuTucId,
				bieuMauHoSoId, maTuSinh, orderByComparator);

		if (tthcNoidungHoSoTmp != null) {
			return tthcNoidungHoSoTmp;
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

		throw new NoSuchTthcNoidungHoSoTmpException(msg.toString());
	}

	/**
	 * Returns the first tthc noidung ho so tmp in the ordered set where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @param maTuSinh the ma tu sinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc noidung ho so tmp, or <code>null</code> if a matching tthc noidung ho so tmp could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoTmp fetchByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_First(
		long hoSoThuTucId, long bieuMauHoSoId, String maTuSinh,
		OrderByComparator orderByComparator) throws SystemException {
		List<TthcNoidungHoSoTmp> list = findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(hoSoThuTucId,
				bieuMauHoSoId, maTuSinh, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tthc noidung ho so tmp in the ordered set where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @param maTuSinh the ma tu sinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc noidung ho so tmp
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException if a matching tthc noidung ho so tmp could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoTmp findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_Last(
		long hoSoThuTucId, long bieuMauHoSoId, String maTuSinh,
		OrderByComparator orderByComparator)
		throws NoSuchTthcNoidungHoSoTmpException, SystemException {
		TthcNoidungHoSoTmp tthcNoidungHoSoTmp = fetchByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_Last(hoSoThuTucId,
				bieuMauHoSoId, maTuSinh, orderByComparator);

		if (tthcNoidungHoSoTmp != null) {
			return tthcNoidungHoSoTmp;
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

		throw new NoSuchTthcNoidungHoSoTmpException(msg.toString());
	}

	/**
	 * Returns the last tthc noidung ho so tmp in the ordered set where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @param maTuSinh the ma tu sinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc noidung ho so tmp, or <code>null</code> if a matching tthc noidung ho so tmp could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoTmp fetchByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_Last(
		long hoSoThuTucId, long bieuMauHoSoId, String maTuSinh,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(hoSoThuTucId,
				bieuMauHoSoId, maTuSinh);

		if (count == 0) {
			return null;
		}

		List<TthcNoidungHoSoTmp> list = findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(hoSoThuTucId,
				bieuMauHoSoId, maTuSinh, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tthc noidung ho so tmps before and after the current tthc noidung ho so tmp in the ordered set where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	 *
	 * @param id the primary key of the current tthc noidung ho so tmp
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @param maTuSinh the ma tu sinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tthc noidung ho so tmp
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException if a tthc noidung ho so tmp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoTmp[] findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_PrevAndNext(
		long id, long hoSoThuTucId, long bieuMauHoSoId, String maTuSinh,
		OrderByComparator orderByComparator)
		throws NoSuchTthcNoidungHoSoTmpException, SystemException {
		TthcNoidungHoSoTmp tthcNoidungHoSoTmp = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TthcNoidungHoSoTmp[] array = new TthcNoidungHoSoTmpImpl[3];

			array[0] = getByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_PrevAndNext(session,
					tthcNoidungHoSoTmp, hoSoThuTucId, bieuMauHoSoId, maTuSinh,
					orderByComparator, true);

			array[1] = tthcNoidungHoSoTmp;

			array[2] = getByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_PrevAndNext(session,
					tthcNoidungHoSoTmp, hoSoThuTucId, bieuMauHoSoId, maTuSinh,
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

	protected TthcNoidungHoSoTmp getByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_PrevAndNext(
		Session session, TthcNoidungHoSoTmp tthcNoidungHoSoTmp,
		long hoSoThuTucId, long bieuMauHoSoId, String maTuSinh,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TTHCNOIDUNGHOSOTMP_WHERE);

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
			query.append(TthcNoidungHoSoTmpModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(tthcNoidungHoSoTmp);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TthcNoidungHoSoTmp> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tthc noidung ho so tmps where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63; from the database.
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
		for (TthcNoidungHoSoTmp tthcNoidungHoSoTmp : findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(
				hoSoThuTucId, bieuMauHoSoId, maTuSinh, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tthcNoidungHoSoTmp);
		}
	}

	/**
	 * Returns the number of tthc noidung ho so tmps where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param bieuMauHoSoId the bieu mau ho so ID
	 * @param maTuSinh the ma tu sinh
	 * @return the number of matching tthc noidung ho so tmps
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

			query.append(_SQL_COUNT_TTHCNOIDUNGHOSOTMP_WHERE);

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
		"tthcNoidungHoSoTmp.hoSoThuTucId = ? AND ";
	private static final String _FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_BIEUMAUHOSOID_2 =
		"tthcNoidungHoSoTmp.bieuMauHoSoId = ? AND ";
	private static final String _FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_MATUSINH_1 =
		"tthcNoidungHoSoTmp.maTuSinh IS NULL";
	private static final String _FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_MATUSINH_2 =
		"tthcNoidungHoSoTmp.maTuSinh = ?";
	private static final String _FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_MATUSINH_3 =
		"(tthcNoidungHoSoTmp.maTuSinh IS NULL OR tthcNoidungHoSoTmp.maTuSinh = '')";

	public TthcNoidungHoSoTmpPersistenceImpl() {
		setModelClass(TthcNoidungHoSoTmp.class);
	}

	/**
	 * Caches the tthc noidung ho so tmp in the entity cache if it is enabled.
	 *
	 * @param tthcNoidungHoSoTmp the tthc noidung ho so tmp
	 */
	@Override
	public void cacheResult(TthcNoidungHoSoTmp tthcNoidungHoSoTmp) {
		EntityCacheUtil.putResult(TthcNoidungHoSoTmpModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoTmpImpl.class, tthcNoidungHoSoTmp.getPrimaryKey(),
			tthcNoidungHoSoTmp);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID,
			new Object[] {
				tthcNoidungHoSoTmp.getHoSoThuTucId(),
				tthcNoidungHoSoTmp.getBieuMauHoSoId(),
				tthcNoidungHoSoTmp.getThanhPhanHoSoId()
			}, tthcNoidungHoSoTmp);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI,
			new Object[] {
				tthcNoidungHoSoTmp.getHoSoThuTucId(),
				tthcNoidungHoSoTmp.getBieuMauHoSoId(),
				tthcNoidungHoSoTmp.getThanhPhanHoSoId(),
				tthcNoidungHoSoTmp.getTrangThai()
			}, tthcNoidungHoSoTmp);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOID,
			new Object[] {
				tthcNoidungHoSoTmp.getHoSoThuTucId(),
				tthcNoidungHoSoTmp.getBieuMauHoSoId()
			}, tthcNoidungHoSoTmp);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDTHANHPHANHOSOID,
			new Object[] {
				tthcNoidungHoSoTmp.getHoSoThuTucId(),
				tthcNoidungHoSoTmp.getThanhPhanHoSoId()
			}, tthcNoidungHoSoTmp);

		tthcNoidungHoSoTmp.resetOriginalValues();
	}

	/**
	 * Caches the tthc noidung ho so tmps in the entity cache if it is enabled.
	 *
	 * @param tthcNoidungHoSoTmps the tthc noidung ho so tmps
	 */
	@Override
	public void cacheResult(List<TthcNoidungHoSoTmp> tthcNoidungHoSoTmps) {
		for (TthcNoidungHoSoTmp tthcNoidungHoSoTmp : tthcNoidungHoSoTmps) {
			if (EntityCacheUtil.getResult(
						TthcNoidungHoSoTmpModelImpl.ENTITY_CACHE_ENABLED,
						TthcNoidungHoSoTmpImpl.class,
						tthcNoidungHoSoTmp.getPrimaryKey()) == null) {
				cacheResult(tthcNoidungHoSoTmp);
			}
			else {
				tthcNoidungHoSoTmp.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tthc noidung ho so tmps.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TthcNoidungHoSoTmpImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TthcNoidungHoSoTmpImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tthc noidung ho so tmp.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TthcNoidungHoSoTmp tthcNoidungHoSoTmp) {
		EntityCacheUtil.removeResult(TthcNoidungHoSoTmpModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoTmpImpl.class, tthcNoidungHoSoTmp.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(tthcNoidungHoSoTmp);
	}

	@Override
	public void clearCache(List<TthcNoidungHoSoTmp> tthcNoidungHoSoTmps) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TthcNoidungHoSoTmp tthcNoidungHoSoTmp : tthcNoidungHoSoTmps) {
			EntityCacheUtil.removeResult(TthcNoidungHoSoTmpModelImpl.ENTITY_CACHE_ENABLED,
				TthcNoidungHoSoTmpImpl.class, tthcNoidungHoSoTmp.getPrimaryKey());

			clearUniqueFindersCache(tthcNoidungHoSoTmp);
		}
	}

	protected void cacheUniqueFindersCache(
		TthcNoidungHoSoTmp tthcNoidungHoSoTmp) {
		if (tthcNoidungHoSoTmp.isNew()) {
			Object[] args = new Object[] {
					tthcNoidungHoSoTmp.getHoSoThuTucId(),
					tthcNoidungHoSoTmp.getBieuMauHoSoId(),
					tthcNoidungHoSoTmp.getThanhPhanHoSoId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID,
				args, tthcNoidungHoSoTmp);

			args = new Object[] {
					tthcNoidungHoSoTmp.getHoSoThuTucId(),
					tthcNoidungHoSoTmp.getBieuMauHoSoId(),
					tthcNoidungHoSoTmp.getThanhPhanHoSoId(),
					tthcNoidungHoSoTmp.getTrangThai()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI,
				args, tthcNoidungHoSoTmp);

			args = new Object[] {
					tthcNoidungHoSoTmp.getHoSoThuTucId(),
					tthcNoidungHoSoTmp.getBieuMauHoSoId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDBIEUMAUHOSOID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOID,
				args, tthcNoidungHoSoTmp);

			args = new Object[] {
					tthcNoidungHoSoTmp.getHoSoThuTucId(),
					tthcNoidungHoSoTmp.getThanhPhanHoSoId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDTHANHPHANHOSOID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDTHANHPHANHOSOID,
				args, tthcNoidungHoSoTmp);
		}
		else {
			TthcNoidungHoSoTmpModelImpl tthcNoidungHoSoTmpModelImpl = (TthcNoidungHoSoTmpModelImpl)tthcNoidungHoSoTmp;

			if ((tthcNoidungHoSoTmpModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcNoidungHoSoTmp.getHoSoThuTucId(),
						tthcNoidungHoSoTmp.getBieuMauHoSoId(),
						tthcNoidungHoSoTmp.getThanhPhanHoSoId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID,
					args, tthcNoidungHoSoTmp);
			}

			if ((tthcNoidungHoSoTmpModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcNoidungHoSoTmp.getHoSoThuTucId(),
						tthcNoidungHoSoTmp.getBieuMauHoSoId(),
						tthcNoidungHoSoTmp.getThanhPhanHoSoId(),
						tthcNoidungHoSoTmp.getTrangThai()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI,
					args, tthcNoidungHoSoTmp);
			}

			if ((tthcNoidungHoSoTmpModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcNoidungHoSoTmp.getHoSoThuTucId(),
						tthcNoidungHoSoTmp.getBieuMauHoSoId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDBIEUMAUHOSOID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOID,
					args, tthcNoidungHoSoTmp);
			}

			if ((tthcNoidungHoSoTmpModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_HOSOTHUTUCIDTHANHPHANHOSOID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcNoidungHoSoTmp.getHoSoThuTucId(),
						tthcNoidungHoSoTmp.getThanhPhanHoSoId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDTHANHPHANHOSOID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDTHANHPHANHOSOID,
					args, tthcNoidungHoSoTmp);
			}
		}
	}

	protected void clearUniqueFindersCache(
		TthcNoidungHoSoTmp tthcNoidungHoSoTmp) {
		TthcNoidungHoSoTmpModelImpl tthcNoidungHoSoTmpModelImpl = (TthcNoidungHoSoTmpModelImpl)tthcNoidungHoSoTmp;

		Object[] args = new Object[] {
				tthcNoidungHoSoTmp.getHoSoThuTucId(),
				tthcNoidungHoSoTmp.getBieuMauHoSoId(),
				tthcNoidungHoSoTmp.getThanhPhanHoSoId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID,
			args);

		if ((tthcNoidungHoSoTmpModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID.getColumnBitmask()) != 0) {
			args = new Object[] {
					tthcNoidungHoSoTmpModelImpl.getOriginalHoSoThuTucId(),
					tthcNoidungHoSoTmpModelImpl.getOriginalBieuMauHoSoId(),
					tthcNoidungHoSoTmpModelImpl.getOriginalThanhPhanHoSoId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDTHANHPHANHOSOID,
				args);
		}

		args = new Object[] {
				tthcNoidungHoSoTmp.getHoSoThuTucId(),
				tthcNoidungHoSoTmp.getBieuMauHoSoId(),
				tthcNoidungHoSoTmp.getThanhPhanHoSoId(),
				tthcNoidungHoSoTmp.getTrangThai()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI,
			args);

		if ((tthcNoidungHoSoTmpModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI.getColumnBitmask()) != 0) {
			args = new Object[] {
					tthcNoidungHoSoTmpModelImpl.getOriginalHoSoThuTucId(),
					tthcNoidungHoSoTmpModelImpl.getOriginalBieuMauHoSoId(),
					tthcNoidungHoSoTmpModelImpl.getOriginalThanhPhanHoSoId(),
					tthcNoidungHoSoTmpModelImpl.getOriginalTrangThai()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOIDANDTHANHPHANHOSOIDANDTRANGTHAI,
				args);
		}

		args = new Object[] {
				tthcNoidungHoSoTmp.getHoSoThuTucId(),
				tthcNoidungHoSoTmp.getBieuMauHoSoId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDBIEUMAUHOSOID,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOID,
			args);

		if ((tthcNoidungHoSoTmpModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOID.getColumnBitmask()) != 0) {
			args = new Object[] {
					tthcNoidungHoSoTmpModelImpl.getOriginalHoSoThuTucId(),
					tthcNoidungHoSoTmpModelImpl.getOriginalBieuMauHoSoId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDBIEUMAUHOSOID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDBIEUMAUHOSOID,
				args);
		}

		args = new Object[] {
				tthcNoidungHoSoTmp.getHoSoThuTucId(),
				tthcNoidungHoSoTmp.getThanhPhanHoSoId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDTHANHPHANHOSOID,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDTHANHPHANHOSOID,
			args);

		if ((tthcNoidungHoSoTmpModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_HOSOTHUTUCIDTHANHPHANHOSOID.getColumnBitmask()) != 0) {
			args = new Object[] {
					tthcNoidungHoSoTmpModelImpl.getOriginalHoSoThuTucId(),
					tthcNoidungHoSoTmpModelImpl.getOriginalThanhPhanHoSoId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDTHANHPHANHOSOID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDTHANHPHANHOSOID,
				args);
		}
	}

	/**
	 * Creates a new tthc noidung ho so tmp with the primary key. Does not add the tthc noidung ho so tmp to the database.
	 *
	 * @param id the primary key for the new tthc noidung ho so tmp
	 * @return the new tthc noidung ho so tmp
	 */
	@Override
	public TthcNoidungHoSoTmp create(long id) {
		TthcNoidungHoSoTmp tthcNoidungHoSoTmp = new TthcNoidungHoSoTmpImpl();

		tthcNoidungHoSoTmp.setNew(true);
		tthcNoidungHoSoTmp.setPrimaryKey(id);

		return tthcNoidungHoSoTmp;
	}

	/**
	 * Removes the tthc noidung ho so tmp with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the tthc noidung ho so tmp
	 * @return the tthc noidung ho so tmp that was removed
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException if a tthc noidung ho so tmp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoTmp remove(long id)
		throws NoSuchTthcNoidungHoSoTmpException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the tthc noidung ho so tmp with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tthc noidung ho so tmp
	 * @return the tthc noidung ho so tmp that was removed
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException if a tthc noidung ho so tmp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoTmp remove(Serializable primaryKey)
		throws NoSuchTthcNoidungHoSoTmpException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TthcNoidungHoSoTmp tthcNoidungHoSoTmp = (TthcNoidungHoSoTmp)session.get(TthcNoidungHoSoTmpImpl.class,
					primaryKey);

			if (tthcNoidungHoSoTmp == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTthcNoidungHoSoTmpException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tthcNoidungHoSoTmp);
		}
		catch (NoSuchTthcNoidungHoSoTmpException nsee) {
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
	protected TthcNoidungHoSoTmp removeImpl(
		TthcNoidungHoSoTmp tthcNoidungHoSoTmp) throws SystemException {
		tthcNoidungHoSoTmp = toUnwrappedModel(tthcNoidungHoSoTmp);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tthcNoidungHoSoTmp)) {
				tthcNoidungHoSoTmp = (TthcNoidungHoSoTmp)session.get(TthcNoidungHoSoTmpImpl.class,
						tthcNoidungHoSoTmp.getPrimaryKeyObj());
			}

			if (tthcNoidungHoSoTmp != null) {
				session.delete(tthcNoidungHoSoTmp);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tthcNoidungHoSoTmp != null) {
			clearCache(tthcNoidungHoSoTmp);
		}

		return tthcNoidungHoSoTmp;
	}

	@Override
	public TthcNoidungHoSoTmp updateImpl(
		vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp tthcNoidungHoSoTmp)
		throws SystemException {
		tthcNoidungHoSoTmp = toUnwrappedModel(tthcNoidungHoSoTmp);

		boolean isNew = tthcNoidungHoSoTmp.isNew();

		TthcNoidungHoSoTmpModelImpl tthcNoidungHoSoTmpModelImpl = (TthcNoidungHoSoTmpModelImpl)tthcNoidungHoSoTmp;

		Session session = null;

		try {
			session = openSession();

			if (tthcNoidungHoSoTmp.isNew()) {
				session.save(tthcNoidungHoSoTmp);

				tthcNoidungHoSoTmp.setNew(false);
			}
			else {
				session.merge(tthcNoidungHoSoTmp);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TthcNoidungHoSoTmpModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tthcNoidungHoSoTmpModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCIDANDTHANHPHANHOSOID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcNoidungHoSoTmpModelImpl.getOriginalHoSoThuTucId(),
						tthcNoidungHoSoTmpModelImpl.getOriginalThanhPhanHoSoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDTHANHPHANHOSOID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCIDANDTHANHPHANHOSOID,
					args);

				args = new Object[] {
						tthcNoidungHoSoTmpModelImpl.getHoSoThuTucId(),
						tthcNoidungHoSoTmpModelImpl.getThanhPhanHoSoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDTHANHPHANHOSOID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCIDANDTHANHPHANHOSOID,
					args);
			}

			if ((tthcNoidungHoSoTmpModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcNoidungHoSoTmpModelImpl.getOriginalHoSoThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID,
					args);

				args = new Object[] {
						tthcNoidungHoSoTmpModelImpl.getHoSoThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID,
					args);
			}

			if ((tthcNoidungHoSoTmpModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcNoidungHoSoTmpModelImpl.getOriginalHoSoThuTucId(),
						tthcNoidungHoSoTmpModelImpl.getOriginalBieuMauHoSoId(),
						tthcNoidungHoSoTmpModelImpl.getOriginalMaTuSinh()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH,
					args);

				args = new Object[] {
						tthcNoidungHoSoTmpModelImpl.getHoSoThuTucId(),
						tthcNoidungHoSoTmpModelImpl.getBieuMauHoSoId(),
						tthcNoidungHoSoTmpModelImpl.getMaTuSinh()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH,
					args);
			}
		}

		EntityCacheUtil.putResult(TthcNoidungHoSoTmpModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoTmpImpl.class, tthcNoidungHoSoTmp.getPrimaryKey(),
			tthcNoidungHoSoTmp);

		clearUniqueFindersCache(tthcNoidungHoSoTmp);
		cacheUniqueFindersCache(tthcNoidungHoSoTmp);

		return tthcNoidungHoSoTmp;
	}

	protected TthcNoidungHoSoTmp toUnwrappedModel(
		TthcNoidungHoSoTmp tthcNoidungHoSoTmp) {
		if (tthcNoidungHoSoTmp instanceof TthcNoidungHoSoTmpImpl) {
			return tthcNoidungHoSoTmp;
		}

		TthcNoidungHoSoTmpImpl tthcNoidungHoSoTmpImpl = new TthcNoidungHoSoTmpImpl();

		tthcNoidungHoSoTmpImpl.setNew(tthcNoidungHoSoTmp.isNew());
		tthcNoidungHoSoTmpImpl.setPrimaryKey(tthcNoidungHoSoTmp.getPrimaryKey());

		tthcNoidungHoSoTmpImpl.setId(tthcNoidungHoSoTmp.getId());
		tthcNoidungHoSoTmpImpl.setMaTuSinh(tthcNoidungHoSoTmp.getMaTuSinh());
		tthcNoidungHoSoTmpImpl.setHoSoThuTucId(tthcNoidungHoSoTmp.getHoSoThuTucId());
		tthcNoidungHoSoTmpImpl.setThanhPhanHoSoId(tthcNoidungHoSoTmp.getThanhPhanHoSoId());
		tthcNoidungHoSoTmpImpl.setTenTaiLieu(tthcNoidungHoSoTmp.getTenTaiLieu());
		tthcNoidungHoSoTmpImpl.setTaiLieuDinhKem(tthcNoidungHoSoTmp.getTaiLieuDinhKem());
		tthcNoidungHoSoTmpImpl.setNoiDungXml(tthcNoidungHoSoTmp.getNoiDungXml());
		tthcNoidungHoSoTmpImpl.setNoiDungHtml(tthcNoidungHoSoTmp.getNoiDungHtml());
		tthcNoidungHoSoTmpImpl.setBieuMauHoSoId(tthcNoidungHoSoTmp.getBieuMauHoSoId());
		tthcNoidungHoSoTmpImpl.setNgayGuiNhan(tthcNoidungHoSoTmp.getNgayGuiNhan());
		tthcNoidungHoSoTmpImpl.setLoaiTaiLieu(tthcNoidungHoSoTmp.getLoaiTaiLieu());
		tthcNoidungHoSoTmpImpl.setNgayTao(tthcNoidungHoSoTmp.getNgayTao());
		tthcNoidungHoSoTmpImpl.setNguoiTao(tthcNoidungHoSoTmp.getNguoiTao());
		tthcNoidungHoSoTmpImpl.setTrangThai(tthcNoidungHoSoTmp.getTrangThai());

		return tthcNoidungHoSoTmpImpl;
	}

	/**
	 * Returns the tthc noidung ho so tmp with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc noidung ho so tmp
	 * @return the tthc noidung ho so tmp
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException if a tthc noidung ho so tmp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoTmp findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTthcNoidungHoSoTmpException, SystemException {
		TthcNoidungHoSoTmp tthcNoidungHoSoTmp = fetchByPrimaryKey(primaryKey);

		if (tthcNoidungHoSoTmp == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTthcNoidungHoSoTmpException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tthcNoidungHoSoTmp;
	}

	/**
	 * Returns the tthc noidung ho so tmp with the primary key or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException} if it could not be found.
	 *
	 * @param id the primary key of the tthc noidung ho so tmp
	 * @return the tthc noidung ho so tmp
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException if a tthc noidung ho so tmp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoTmp findByPrimaryKey(long id)
		throws NoSuchTthcNoidungHoSoTmpException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the tthc noidung ho so tmp with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc noidung ho so tmp
	 * @return the tthc noidung ho so tmp, or <code>null</code> if a tthc noidung ho so tmp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoTmp fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TthcNoidungHoSoTmp tthcNoidungHoSoTmp = (TthcNoidungHoSoTmp)EntityCacheUtil.getResult(TthcNoidungHoSoTmpModelImpl.ENTITY_CACHE_ENABLED,
				TthcNoidungHoSoTmpImpl.class, primaryKey);

		if (tthcNoidungHoSoTmp == _nullTthcNoidungHoSoTmp) {
			return null;
		}

		if (tthcNoidungHoSoTmp == null) {
			Session session = null;

			try {
				session = openSession();

				tthcNoidungHoSoTmp = (TthcNoidungHoSoTmp)session.get(TthcNoidungHoSoTmpImpl.class,
						primaryKey);

				if (tthcNoidungHoSoTmp != null) {
					cacheResult(tthcNoidungHoSoTmp);
				}
				else {
					EntityCacheUtil.putResult(TthcNoidungHoSoTmpModelImpl.ENTITY_CACHE_ENABLED,
						TthcNoidungHoSoTmpImpl.class, primaryKey,
						_nullTthcNoidungHoSoTmp);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TthcNoidungHoSoTmpModelImpl.ENTITY_CACHE_ENABLED,
					TthcNoidungHoSoTmpImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tthcNoidungHoSoTmp;
	}

	/**
	 * Returns the tthc noidung ho so tmp with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the tthc noidung ho so tmp
	 * @return the tthc noidung ho so tmp, or <code>null</code> if a tthc noidung ho so tmp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoTmp fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the tthc noidung ho so tmps.
	 *
	 * @return the tthc noidung ho so tmps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSoTmp> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc noidung ho so tmps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoTmpModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc noidung ho so tmps
	 * @param end the upper bound of the range of tthc noidung ho so tmps (not inclusive)
	 * @return the range of tthc noidung ho so tmps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSoTmp> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc noidung ho so tmps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoTmpModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc noidung ho so tmps
	 * @param end the upper bound of the range of tthc noidung ho so tmps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tthc noidung ho so tmps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSoTmp> findAll(int start, int end,
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

		List<TthcNoidungHoSoTmp> list = (List<TthcNoidungHoSoTmp>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TTHCNOIDUNGHOSOTMP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TTHCNOIDUNGHOSOTMP;

				if (pagination) {
					sql = sql.concat(TthcNoidungHoSoTmpModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TthcNoidungHoSoTmp>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcNoidungHoSoTmp>(list);
				}
				else {
					list = (List<TthcNoidungHoSoTmp>)QueryUtil.list(q,
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
	 * Removes all the tthc noidung ho so tmps from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TthcNoidungHoSoTmp tthcNoidungHoSoTmp : findAll()) {
			remove(tthcNoidungHoSoTmp);
		}
	}

	/**
	 * Returns the number of tthc noidung ho so tmps.
	 *
	 * @return the number of tthc noidung ho so tmps
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

				Query q = session.createQuery(_SQL_COUNT_TTHCNOIDUNGHOSOTMP);

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
	 * Initializes the tthc noidung ho so tmp persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TthcNoidungHoSoTmp>> listenersList = new ArrayList<ModelListener<TthcNoidungHoSoTmp>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TthcNoidungHoSoTmp>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TthcNoidungHoSoTmpImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TTHCNOIDUNGHOSOTMP = "SELECT tthcNoidungHoSoTmp FROM TthcNoidungHoSoTmp tthcNoidungHoSoTmp";
	private static final String _SQL_SELECT_TTHCNOIDUNGHOSOTMP_WHERE = "SELECT tthcNoidungHoSoTmp FROM TthcNoidungHoSoTmp tthcNoidungHoSoTmp WHERE ";
	private static final String _SQL_COUNT_TTHCNOIDUNGHOSOTMP = "SELECT COUNT(tthcNoidungHoSoTmp) FROM TthcNoidungHoSoTmp tthcNoidungHoSoTmp";
	private static final String _SQL_COUNT_TTHCNOIDUNGHOSOTMP_WHERE = "SELECT COUNT(tthcNoidungHoSoTmp) FROM TthcNoidungHoSoTmp tthcNoidungHoSoTmp WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tthcNoidungHoSoTmp.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TthcNoidungHoSoTmp exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TthcNoidungHoSoTmp exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TthcNoidungHoSoTmpPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"maTuSinh", "hoSoThuTucId", "thanhPhanHoSoId", "tenTaiLieu",
				"taiLieuDinhKem", "noiDungXml", "bieuMauHoSoId", "ngayGuiNhan",
				"loaiTaiLieu", "ngayTao", "nguoiTao", "trangThai"
			});
	private static TthcNoidungHoSoTmp _nullTthcNoidungHoSoTmp = new TthcNoidungHoSoTmpImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TthcNoidungHoSoTmp> toCacheModel() {
				return _nullTthcNoidungHoSoTmpCacheModel;
			}
		};

	private static CacheModel<TthcNoidungHoSoTmp> _nullTthcNoidungHoSoTmpCacheModel =
		new CacheModel<TthcNoidungHoSoTmp>() {
			@Override
			public TthcNoidungHoSoTmp toEntityModel() {
				return _nullTthcNoidungHoSoTmp;
			}
		};
}