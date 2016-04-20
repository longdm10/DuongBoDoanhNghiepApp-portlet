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

package vn.dtt.duongbo.dao.nghiepvu.service.persistence;

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

import vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoException;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo;
import vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinHoSoImpl;
import vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinHoSoModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the qlvt thong tin ho so service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanNc
 * @see QlvtThongTinHoSoPersistence
 * @see QlvtThongTinHoSoUtil
 * @generated
 */
public class QlvtThongTinHoSoPersistenceImpl extends BasePersistenceImpl<QlvtThongTinHoSo>
	implements QlvtThongTinHoSoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QlvtThongTinHoSoUtil} to access the qlvt thong tin ho so persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QlvtThongTinHoSoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QlvtThongTinHoSoModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinHoSoModelImpl.FINDER_CACHE_ENABLED,
			QlvtThongTinHoSoImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QlvtThongTinHoSoModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinHoSoModelImpl.FINDER_CACHE_ENABLED,
			QlvtThongTinHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QlvtThongTinHoSoModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_MASOHOSO = new FinderPath(QlvtThongTinHoSoModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinHoSoModelImpl.FINDER_CACHE_ENABLED,
			QlvtThongTinHoSoImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByMaSoHoSo", new String[] { String.class.getName() },
			QlvtThongTinHoSoModelImpl.MASOHOSO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MASOHOSO = new FinderPath(QlvtThongTinHoSoModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMaSoHoSo",
			new String[] { String.class.getName() });

	/**
	 * Returns the qlvt thong tin ho so where maSoHoSo = &#63; or throws a {@link vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoException} if it could not be found.
	 *
	 * @param maSoHoSo the ma so ho so
	 * @return the matching qlvt thong tin ho so
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoException if a matching qlvt thong tin ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSo findByMaSoHoSo(String maSoHoSo)
		throws NoSuchQlvtThongTinHoSoException, SystemException {
		QlvtThongTinHoSo qlvtThongTinHoSo = fetchByMaSoHoSo(maSoHoSo);

		if (qlvtThongTinHoSo == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("maSoHoSo=");
			msg.append(maSoHoSo);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchQlvtThongTinHoSoException(msg.toString());
		}

		return qlvtThongTinHoSo;
	}

	/**
	 * Returns the qlvt thong tin ho so where maSoHoSo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param maSoHoSo the ma so ho so
	 * @return the matching qlvt thong tin ho so, or <code>null</code> if a matching qlvt thong tin ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSo fetchByMaSoHoSo(String maSoHoSo)
		throws SystemException {
		return fetchByMaSoHoSo(maSoHoSo, true);
	}

	/**
	 * Returns the qlvt thong tin ho so where maSoHoSo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param maSoHoSo the ma so ho so
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching qlvt thong tin ho so, or <code>null</code> if a matching qlvt thong tin ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSo fetchByMaSoHoSo(String maSoHoSo,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { maSoHoSo };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_MASOHOSO,
					finderArgs, this);
		}

		if (result instanceof QlvtThongTinHoSo) {
			QlvtThongTinHoSo qlvtThongTinHoSo = (QlvtThongTinHoSo)result;

			if (!Validator.equals(maSoHoSo, qlvtThongTinHoSo.getMaSoHoSo())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_QLVTTHONGTINHOSO_WHERE);

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

				List<QlvtThongTinHoSo> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MASOHOSO,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"QlvtThongTinHoSoPersistenceImpl.fetchByMaSoHoSo(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					QlvtThongTinHoSo qlvtThongTinHoSo = list.get(0);

					result = qlvtThongTinHoSo;

					cacheResult(qlvtThongTinHoSo);

					if ((qlvtThongTinHoSo.getMaSoHoSo() == null) ||
							!qlvtThongTinHoSo.getMaSoHoSo().equals(maSoHoSo)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MASOHOSO,
							finderArgs, qlvtThongTinHoSo);
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
			return (QlvtThongTinHoSo)result;
		}
	}

	/**
	 * Removes the qlvt thong tin ho so where maSoHoSo = &#63; from the database.
	 *
	 * @param maSoHoSo the ma so ho so
	 * @return the qlvt thong tin ho so that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSo removeByMaSoHoSo(String maSoHoSo)
		throws NoSuchQlvtThongTinHoSoException, SystemException {
		QlvtThongTinHoSo qlvtThongTinHoSo = findByMaSoHoSo(maSoHoSo);

		return remove(qlvtThongTinHoSo);
	}

	/**
	 * Returns the number of qlvt thong tin ho sos where maSoHoSo = &#63;.
	 *
	 * @param maSoHoSo the ma so ho so
	 * @return the number of matching qlvt thong tin ho sos
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

			query.append(_SQL_COUNT_QLVTTHONGTINHOSO_WHERE);

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

	private static final String _FINDER_COLUMN_MASOHOSO_MASOHOSO_1 = "qlvtThongTinHoSo.maSoHoSo IS NULL";
	private static final String _FINDER_COLUMN_MASOHOSO_MASOHOSO_2 = "qlvtThongTinHoSo.maSoHoSo = ?";
	private static final String _FINDER_COLUMN_MASOHOSO_MASOHOSO_3 = "(qlvtThongTinHoSo.maSoHoSo IS NULL OR qlvtThongTinHoSo.maSoHoSo = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_PHIEUXULYID = new FinderPath(QlvtThongTinHoSoModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinHoSoModelImpl.FINDER_CACHE_ENABLED,
			QlvtThongTinHoSoImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByphieuXuLyId", new String[] { Long.class.getName() },
			QlvtThongTinHoSoModelImpl.PHIEUXULYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PHIEUXULYID = new FinderPath(QlvtThongTinHoSoModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByphieuXuLyId",
			new String[] { Long.class.getName() });

	/**
	 * Returns the qlvt thong tin ho so where phieuXuLyId = &#63; or throws a {@link vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoException} if it could not be found.
	 *
	 * @param phieuXuLyId the phieu xu ly ID
	 * @return the matching qlvt thong tin ho so
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoException if a matching qlvt thong tin ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSo findByphieuXuLyId(long phieuXuLyId)
		throws NoSuchQlvtThongTinHoSoException, SystemException {
		QlvtThongTinHoSo qlvtThongTinHoSo = fetchByphieuXuLyId(phieuXuLyId);

		if (qlvtThongTinHoSo == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("phieuXuLyId=");
			msg.append(phieuXuLyId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchQlvtThongTinHoSoException(msg.toString());
		}

		return qlvtThongTinHoSo;
	}

	/**
	 * Returns the qlvt thong tin ho so where phieuXuLyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param phieuXuLyId the phieu xu ly ID
	 * @return the matching qlvt thong tin ho so, or <code>null</code> if a matching qlvt thong tin ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSo fetchByphieuXuLyId(long phieuXuLyId)
		throws SystemException {
		return fetchByphieuXuLyId(phieuXuLyId, true);
	}

	/**
	 * Returns the qlvt thong tin ho so where phieuXuLyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param phieuXuLyId the phieu xu ly ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching qlvt thong tin ho so, or <code>null</code> if a matching qlvt thong tin ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSo fetchByphieuXuLyId(long phieuXuLyId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { phieuXuLyId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_PHIEUXULYID,
					finderArgs, this);
		}

		if (result instanceof QlvtThongTinHoSo) {
			QlvtThongTinHoSo qlvtThongTinHoSo = (QlvtThongTinHoSo)result;

			if ((phieuXuLyId != qlvtThongTinHoSo.getPhieuXuLyId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_QLVTTHONGTINHOSO_WHERE);

			query.append(_FINDER_COLUMN_PHIEUXULYID_PHIEUXULYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(phieuXuLyId);

				List<QlvtThongTinHoSo> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PHIEUXULYID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"QlvtThongTinHoSoPersistenceImpl.fetchByphieuXuLyId(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					QlvtThongTinHoSo qlvtThongTinHoSo = list.get(0);

					result = qlvtThongTinHoSo;

					cacheResult(qlvtThongTinHoSo);

					if ((qlvtThongTinHoSo.getPhieuXuLyId() != phieuXuLyId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PHIEUXULYID,
							finderArgs, qlvtThongTinHoSo);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PHIEUXULYID,
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
			return (QlvtThongTinHoSo)result;
		}
	}

	/**
	 * Removes the qlvt thong tin ho so where phieuXuLyId = &#63; from the database.
	 *
	 * @param phieuXuLyId the phieu xu ly ID
	 * @return the qlvt thong tin ho so that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSo removeByphieuXuLyId(long phieuXuLyId)
		throws NoSuchQlvtThongTinHoSoException, SystemException {
		QlvtThongTinHoSo qlvtThongTinHoSo = findByphieuXuLyId(phieuXuLyId);

		return remove(qlvtThongTinHoSo);
	}

	/**
	 * Returns the number of qlvt thong tin ho sos where phieuXuLyId = &#63;.
	 *
	 * @param phieuXuLyId the phieu xu ly ID
	 * @return the number of matching qlvt thong tin ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByphieuXuLyId(long phieuXuLyId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PHIEUXULYID;

		Object[] finderArgs = new Object[] { phieuXuLyId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_QLVTTHONGTINHOSO_WHERE);

			query.append(_FINDER_COLUMN_PHIEUXULYID_PHIEUXULYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(phieuXuLyId);

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

	private static final String _FINDER_COLUMN_PHIEUXULYID_PHIEUXULYID_2 = "qlvtThongTinHoSo.phieuXuLyId = ?";

	public QlvtThongTinHoSoPersistenceImpl() {
		setModelClass(QlvtThongTinHoSo.class);
	}

	/**
	 * Caches the qlvt thong tin ho so in the entity cache if it is enabled.
	 *
	 * @param qlvtThongTinHoSo the qlvt thong tin ho so
	 */
	@Override
	public void cacheResult(QlvtThongTinHoSo qlvtThongTinHoSo) {
		EntityCacheUtil.putResult(QlvtThongTinHoSoModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinHoSoImpl.class, qlvtThongTinHoSo.getPrimaryKey(),
			qlvtThongTinHoSo);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MASOHOSO,
			new Object[] { qlvtThongTinHoSo.getMaSoHoSo() }, qlvtThongTinHoSo);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PHIEUXULYID,
			new Object[] { qlvtThongTinHoSo.getPhieuXuLyId() }, qlvtThongTinHoSo);

		qlvtThongTinHoSo.resetOriginalValues();
	}

	/**
	 * Caches the qlvt thong tin ho sos in the entity cache if it is enabled.
	 *
	 * @param qlvtThongTinHoSos the qlvt thong tin ho sos
	 */
	@Override
	public void cacheResult(List<QlvtThongTinHoSo> qlvtThongTinHoSos) {
		for (QlvtThongTinHoSo qlvtThongTinHoSo : qlvtThongTinHoSos) {
			if (EntityCacheUtil.getResult(
						QlvtThongTinHoSoModelImpl.ENTITY_CACHE_ENABLED,
						QlvtThongTinHoSoImpl.class,
						qlvtThongTinHoSo.getPrimaryKey()) == null) {
				cacheResult(qlvtThongTinHoSo);
			}
			else {
				qlvtThongTinHoSo.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qlvt thong tin ho sos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QlvtThongTinHoSoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QlvtThongTinHoSoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qlvt thong tin ho so.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QlvtThongTinHoSo qlvtThongTinHoSo) {
		EntityCacheUtil.removeResult(QlvtThongTinHoSoModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinHoSoImpl.class, qlvtThongTinHoSo.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(qlvtThongTinHoSo);
	}

	@Override
	public void clearCache(List<QlvtThongTinHoSo> qlvtThongTinHoSos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QlvtThongTinHoSo qlvtThongTinHoSo : qlvtThongTinHoSos) {
			EntityCacheUtil.removeResult(QlvtThongTinHoSoModelImpl.ENTITY_CACHE_ENABLED,
				QlvtThongTinHoSoImpl.class, qlvtThongTinHoSo.getPrimaryKey());

			clearUniqueFindersCache(qlvtThongTinHoSo);
		}
	}

	protected void cacheUniqueFindersCache(QlvtThongTinHoSo qlvtThongTinHoSo) {
		if (qlvtThongTinHoSo.isNew()) {
			Object[] args = new Object[] { qlvtThongTinHoSo.getMaSoHoSo() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MASOHOSO, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MASOHOSO, args,
				qlvtThongTinHoSo);

			args = new Object[] { qlvtThongTinHoSo.getPhieuXuLyId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PHIEUXULYID, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PHIEUXULYID, args,
				qlvtThongTinHoSo);
		}
		else {
			QlvtThongTinHoSoModelImpl qlvtThongTinHoSoModelImpl = (QlvtThongTinHoSoModelImpl)qlvtThongTinHoSo;

			if ((qlvtThongTinHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_MASOHOSO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { qlvtThongTinHoSo.getMaSoHoSo() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MASOHOSO, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MASOHOSO, args,
					qlvtThongTinHoSo);
			}

			if ((qlvtThongTinHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_PHIEUXULYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { qlvtThongTinHoSo.getPhieuXuLyId() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PHIEUXULYID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PHIEUXULYID,
					args, qlvtThongTinHoSo);
			}
		}
	}

	protected void clearUniqueFindersCache(QlvtThongTinHoSo qlvtThongTinHoSo) {
		QlvtThongTinHoSoModelImpl qlvtThongTinHoSoModelImpl = (QlvtThongTinHoSoModelImpl)qlvtThongTinHoSo;

		Object[] args = new Object[] { qlvtThongTinHoSo.getMaSoHoSo() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MASOHOSO, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MASOHOSO, args);

		if ((qlvtThongTinHoSoModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_MASOHOSO.getColumnBitmask()) != 0) {
			args = new Object[] { qlvtThongTinHoSoModelImpl.getOriginalMaSoHoSo() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MASOHOSO, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MASOHOSO, args);
		}

		args = new Object[] { qlvtThongTinHoSo.getPhieuXuLyId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHIEUXULYID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PHIEUXULYID, args);

		if ((qlvtThongTinHoSoModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_PHIEUXULYID.getColumnBitmask()) != 0) {
			args = new Object[] {
					qlvtThongTinHoSoModelImpl.getOriginalPhieuXuLyId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHIEUXULYID, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PHIEUXULYID, args);
		}
	}

	/**
	 * Creates a new qlvt thong tin ho so with the primary key. Does not add the qlvt thong tin ho so to the database.
	 *
	 * @param id the primary key for the new qlvt thong tin ho so
	 * @return the new qlvt thong tin ho so
	 */
	@Override
	public QlvtThongTinHoSo create(long id) {
		QlvtThongTinHoSo qlvtThongTinHoSo = new QlvtThongTinHoSoImpl();

		qlvtThongTinHoSo.setNew(true);
		qlvtThongTinHoSo.setPrimaryKey(id);

		return qlvtThongTinHoSo;
	}

	/**
	 * Removes the qlvt thong tin ho so with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the qlvt thong tin ho so
	 * @return the qlvt thong tin ho so that was removed
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoException if a qlvt thong tin ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSo remove(long id)
		throws NoSuchQlvtThongTinHoSoException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the qlvt thong tin ho so with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qlvt thong tin ho so
	 * @return the qlvt thong tin ho so that was removed
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoException if a qlvt thong tin ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSo remove(Serializable primaryKey)
		throws NoSuchQlvtThongTinHoSoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QlvtThongTinHoSo qlvtThongTinHoSo = (QlvtThongTinHoSo)session.get(QlvtThongTinHoSoImpl.class,
					primaryKey);

			if (qlvtThongTinHoSo == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQlvtThongTinHoSoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtThongTinHoSo);
		}
		catch (NoSuchQlvtThongTinHoSoException nsee) {
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
	protected QlvtThongTinHoSo removeImpl(QlvtThongTinHoSo qlvtThongTinHoSo)
		throws SystemException {
		qlvtThongTinHoSo = toUnwrappedModel(qlvtThongTinHoSo);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtThongTinHoSo)) {
				qlvtThongTinHoSo = (QlvtThongTinHoSo)session.get(QlvtThongTinHoSoImpl.class,
						qlvtThongTinHoSo.getPrimaryKeyObj());
			}

			if (qlvtThongTinHoSo != null) {
				session.delete(qlvtThongTinHoSo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtThongTinHoSo != null) {
			clearCache(qlvtThongTinHoSo);
		}

		return qlvtThongTinHoSo;
	}

	@Override
	public QlvtThongTinHoSo updateImpl(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo qlvtThongTinHoSo)
		throws SystemException {
		qlvtThongTinHoSo = toUnwrappedModel(qlvtThongTinHoSo);

		boolean isNew = qlvtThongTinHoSo.isNew();

		Session session = null;

		try {
			session = openSession();

			if (qlvtThongTinHoSo.isNew()) {
				session.save(qlvtThongTinHoSo);

				qlvtThongTinHoSo.setNew(false);
			}
			else {
				session.merge(qlvtThongTinHoSo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !QlvtThongTinHoSoModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(QlvtThongTinHoSoModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinHoSoImpl.class, qlvtThongTinHoSo.getPrimaryKey(),
			qlvtThongTinHoSo);

		clearUniqueFindersCache(qlvtThongTinHoSo);
		cacheUniqueFindersCache(qlvtThongTinHoSo);

		return qlvtThongTinHoSo;
	}

	protected QlvtThongTinHoSo toUnwrappedModel(
		QlvtThongTinHoSo qlvtThongTinHoSo) {
		if (qlvtThongTinHoSo instanceof QlvtThongTinHoSoImpl) {
			return qlvtThongTinHoSo;
		}

		QlvtThongTinHoSoImpl qlvtThongTinHoSoImpl = new QlvtThongTinHoSoImpl();

		qlvtThongTinHoSoImpl.setNew(qlvtThongTinHoSo.isNew());
		qlvtThongTinHoSoImpl.setPrimaryKey(qlvtThongTinHoSo.getPrimaryKey());

		qlvtThongTinHoSoImpl.setId(qlvtThongTinHoSo.getId());
		qlvtThongTinHoSoImpl.setSoCongVanDen(qlvtThongTinHoSo.getSoCongVanDen());
		qlvtThongTinHoSoImpl.setTenDn(qlvtThongTinHoSo.getTenDn());
		qlvtThongTinHoSoImpl.setDiaChiDn(qlvtThongTinHoSo.getDiaChiDn());
		qlvtThongTinHoSoImpl.setDienThoaiDn(qlvtThongTinHoSo.getDienThoaiDn());
		qlvtThongTinHoSoImpl.setSoFaxDn(qlvtThongTinHoSo.getSoFaxDn());
		qlvtThongTinHoSoImpl.setEmailDn(qlvtThongTinHoSo.getEmailDn());
		qlvtThongTinHoSoImpl.setWebSiteDn(qlvtThongTinHoSo.getWebSiteDn());
		qlvtThongTinHoSoImpl.setSoDkkd(qlvtThongTinHoSo.getSoDkkd());
		qlvtThongTinHoSoImpl.setNgayCapDkkd(qlvtThongTinHoSo.getNgayCapDkkd());
		qlvtThongTinHoSoImpl.setNgayHetHanDkkd(qlvtThongTinHoSo.getNgayHetHanDkkd());
		qlvtThongTinHoSoImpl.setCoQuanCapDkkd(qlvtThongTinHoSo.getCoQuanCapDkkd());
		qlvtThongTinHoSoImpl.setDaiDienDn(qlvtThongTinHoSo.getDaiDienDn());
		qlvtThongTinHoSoImpl.setCoQuanGiaiQuyet(qlvtThongTinHoSo.getCoQuanGiaiQuyet());
		qlvtThongTinHoSoImpl.setDiaDiemLamHoSo(qlvtThongTinHoSo.getDiaDiemLamHoSo());
		qlvtThongTinHoSoImpl.setPhieuXuLyId(qlvtThongTinHoSo.getPhieuXuLyId());
		qlvtThongTinHoSoImpl.setMaSoHoSo(qlvtThongTinHoSo.getMaSoHoSo());
		qlvtThongTinHoSoImpl.setLyDoCapLai(qlvtThongTinHoSo.getLyDoCapLai());
		qlvtThongTinHoSoImpl.setLanCapGiayDangKyKinhDoanh(qlvtThongTinHoSo.getLanCapGiayDangKyKinhDoanh());
		qlvtThongTinHoSoImpl.setSoGiayPhepKinhDoanhVanTaiNoiDia(qlvtThongTinHoSo.getSoGiayPhepKinhDoanhVanTaiNoiDia());
		qlvtThongTinHoSoImpl.setNgayCapGPKDVTNoiDia(qlvtThongTinHoSo.getNgayCapGPKDVTNoiDia());
		qlvtThongTinHoSoImpl.setNgayGiaHanGPKDVTNoiDia(qlvtThongTinHoSo.getNgayGiaHanGPKDVTNoiDia());
		qlvtThongTinHoSoImpl.setNgayHetHanGPKDVTNoiDia(qlvtThongTinHoSo.getNgayHetHanGPKDVTNoiDia());
		qlvtThongTinHoSoImpl.setLanCapGPKDVTNoiDia(qlvtThongTinHoSo.getLanCapGPKDVTNoiDia());
		qlvtThongTinHoSoImpl.setNgayGiaHanGiayDangKyKinhDoanh(qlvtThongTinHoSo.getNgayGiaHanGiayDangKyKinhDoanh());
		qlvtThongTinHoSoImpl.setSoGiayPhepKinhDoanhVanTaiQuocTe(qlvtThongTinHoSo.getSoGiayPhepKinhDoanhVanTaiQuocTe());
		qlvtThongTinHoSoImpl.setLanCapGPKDVTQuocTe(qlvtThongTinHoSo.getLanCapGPKDVTQuocTe());
		qlvtThongTinHoSoImpl.setNgayCapGPKDVTQuocTe(qlvtThongTinHoSo.getNgayCapGPKDVTQuocTe());
		qlvtThongTinHoSoImpl.setNgayGiaHanGPKDVTQuocTe(qlvtThongTinHoSo.getNgayGiaHanGPKDVTQuocTe());
		qlvtThongTinHoSoImpl.setNgayHetHanGPKDVTQuocTe(qlvtThongTinHoSo.getNgayHetHanGPKDVTQuocTe());
		qlvtThongTinHoSoImpl.setNguoiLienHeTraKetQua(qlvtThongTinHoSo.getNguoiLienHeTraKetQua());
		qlvtThongTinHoSoImpl.setSoDienThoaiNguoiLienHe(qlvtThongTinHoSo.getSoDienThoaiNguoiLienHe());
		qlvtThongTinHoSoImpl.setCoQuanCapGPKDVTNoiDia(qlvtThongTinHoSo.getCoQuanCapGPKDVTNoiDia());
		qlvtThongTinHoSoImpl.setNguoiNhanKetQua(qlvtThongTinHoSo.getNguoiNhanKetQua());
		qlvtThongTinHoSoImpl.setThongTinTraKetQua(qlvtThongTinHoSo.getThongTinTraKetQua());
		qlvtThongTinHoSoImpl.setNgayTraKetQua(qlvtThongTinHoSo.getNgayTraKetQua());
		qlvtThongTinHoSoImpl.setDiaChiNguoiLienHeTraKetQua(qlvtThongTinHoSo.getDiaChiNguoiLienHeTraKetQua());

		return qlvtThongTinHoSoImpl;
	}

	/**
	 * Returns the qlvt thong tin ho so with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt thong tin ho so
	 * @return the qlvt thong tin ho so
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoException if a qlvt thong tin ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQlvtThongTinHoSoException, SystemException {
		QlvtThongTinHoSo qlvtThongTinHoSo = fetchByPrimaryKey(primaryKey);

		if (qlvtThongTinHoSo == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQlvtThongTinHoSoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtThongTinHoSo;
	}

	/**
	 * Returns the qlvt thong tin ho so with the primary key or throws a {@link vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoException} if it could not be found.
	 *
	 * @param id the primary key of the qlvt thong tin ho so
	 * @return the qlvt thong tin ho so
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoException if a qlvt thong tin ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSo findByPrimaryKey(long id)
		throws NoSuchQlvtThongTinHoSoException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the qlvt thong tin ho so with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt thong tin ho so
	 * @return the qlvt thong tin ho so, or <code>null</code> if a qlvt thong tin ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSo fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QlvtThongTinHoSo qlvtThongTinHoSo = (QlvtThongTinHoSo)EntityCacheUtil.getResult(QlvtThongTinHoSoModelImpl.ENTITY_CACHE_ENABLED,
				QlvtThongTinHoSoImpl.class, primaryKey);

		if (qlvtThongTinHoSo == _nullQlvtThongTinHoSo) {
			return null;
		}

		if (qlvtThongTinHoSo == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtThongTinHoSo = (QlvtThongTinHoSo)session.get(QlvtThongTinHoSoImpl.class,
						primaryKey);

				if (qlvtThongTinHoSo != null) {
					cacheResult(qlvtThongTinHoSo);
				}
				else {
					EntityCacheUtil.putResult(QlvtThongTinHoSoModelImpl.ENTITY_CACHE_ENABLED,
						QlvtThongTinHoSoImpl.class, primaryKey,
						_nullQlvtThongTinHoSo);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QlvtThongTinHoSoModelImpl.ENTITY_CACHE_ENABLED,
					QlvtThongTinHoSoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtThongTinHoSo;
	}

	/**
	 * Returns the qlvt thong tin ho so with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the qlvt thong tin ho so
	 * @return the qlvt thong tin ho so, or <code>null</code> if a qlvt thong tin ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSo fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the qlvt thong tin ho sos.
	 *
	 * @return the qlvt thong tin ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtThongTinHoSo> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt thong tin ho sos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt thong tin ho sos
	 * @param end the upper bound of the range of qlvt thong tin ho sos (not inclusive)
	 * @return the range of qlvt thong tin ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtThongTinHoSo> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt thong tin ho sos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt thong tin ho sos
	 * @param end the upper bound of the range of qlvt thong tin ho sos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qlvt thong tin ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtThongTinHoSo> findAll(int start, int end,
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

		List<QlvtThongTinHoSo> list = (List<QlvtThongTinHoSo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTTHONGTINHOSO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTTHONGTINHOSO;

				if (pagination) {
					sql = sql.concat(QlvtThongTinHoSoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QlvtThongTinHoSo>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtThongTinHoSo>(list);
				}
				else {
					list = (List<QlvtThongTinHoSo>)QueryUtil.list(q,
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
	 * Removes all the qlvt thong tin ho sos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QlvtThongTinHoSo qlvtThongTinHoSo : findAll()) {
			remove(qlvtThongTinHoSo);
		}
	}

	/**
	 * Returns the number of qlvt thong tin ho sos.
	 *
	 * @return the number of qlvt thong tin ho sos
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

				Query q = session.createQuery(_SQL_COUNT_QLVTTHONGTINHOSO);

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
	 * Initializes the qlvt thong tin ho so persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QlvtThongTinHoSo>> listenersList = new ArrayList<ModelListener<QlvtThongTinHoSo>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QlvtThongTinHoSo>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QlvtThongTinHoSoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTTHONGTINHOSO = "SELECT qlvtThongTinHoSo FROM QlvtThongTinHoSo qlvtThongTinHoSo";
	private static final String _SQL_SELECT_QLVTTHONGTINHOSO_WHERE = "SELECT qlvtThongTinHoSo FROM QlvtThongTinHoSo qlvtThongTinHoSo WHERE ";
	private static final String _SQL_COUNT_QLVTTHONGTINHOSO = "SELECT COUNT(qlvtThongTinHoSo) FROM QlvtThongTinHoSo qlvtThongTinHoSo";
	private static final String _SQL_COUNT_QLVTTHONGTINHOSO_WHERE = "SELECT COUNT(qlvtThongTinHoSo) FROM QlvtThongTinHoSo qlvtThongTinHoSo WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtThongTinHoSo.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QlvtThongTinHoSo exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No QlvtThongTinHoSo exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QlvtThongTinHoSoPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"soCongVanDen", "tenDn", "diaChiDn", "dienThoaiDn", "soFaxDn",
				"emailDn", "webSiteDn", "soDkkd", "ngayCapDkkd",
				"ngayHetHanDkkd", "coQuanCapDkkd", "daiDienDn",
				"coQuanGiaiQuyet", "diaDiemLamHoSo", "phieuXuLyId", "maSoHoSo",
				"lyDoCapLai", "lanCapGiayDangKyKinhDoanh",
				"soGiayPhepKinhDoanhVanTaiNoiDia", "ngayCapGPKDVTNoiDia",
				"NgayGiaHanGPKDVTNoiDia", "NgayHetHanGPKDVTNoiDia",
				"lanCapGPKDVTNoiDia", "ngayGiaHanGiayDangKyKinhDoanh",
				"soGiayPhepKinhDoanhVanTaiQuocTe", "lanCapGPKDVTQuocTe",
				"ngayCapGPKDVTQuocTe", "ngayGiaHanGPKDVTQuocTe",
				"ngayHetHanGPKDVTQuocTe", "nguoiLienHeTraKetQua",
				"soDienThoaiNguoiLienHe", "coQuanCapGPKDVTNoiDia",
				"nguoiNhanKetQua", "thongTinTraKetQua", "ngayTraKetQua",
				"diaChiNguoiLienHeTraKetQua"
			});
	private static QlvtThongTinHoSo _nullQlvtThongTinHoSo = new QlvtThongTinHoSoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QlvtThongTinHoSo> toCacheModel() {
				return _nullQlvtThongTinHoSoCacheModel;
			}
		};

	private static CacheModel<QlvtThongTinHoSo> _nullQlvtThongTinHoSoCacheModel = new CacheModel<QlvtThongTinHoSo>() {
			@Override
			public QlvtThongTinHoSo toEntityModel() {
				return _nullQlvtThongTinHoSo;
			}
		};
}