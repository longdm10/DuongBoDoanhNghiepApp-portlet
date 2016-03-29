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

import vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException;
import vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC;
import vn.dtt.duongbo.dao.motcua.model.impl.MotCuaQuyTrinhThuTucTTHCImpl;
import vn.dtt.duongbo.dao.motcua.model.impl.MotCuaQuyTrinhThuTucTTHCModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the mot cua quy trinh thu tuc t t h c service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see MotCuaQuyTrinhThuTucTTHCPersistence
 * @see MotCuaQuyTrinhThuTucTTHCUtil
 * @generated
 */
public class MotCuaQuyTrinhThuTucTTHCPersistenceImpl extends BasePersistenceImpl<MotCuaQuyTrinhThuTucTTHC>
	implements MotCuaQuyTrinhThuTucTTHCPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link MotCuaQuyTrinhThuTucTTHCUtil} to access the mot cua quy trinh thu tuc t t h c persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = MotCuaQuyTrinhThuTucTTHCImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MotCuaQuyTrinhThuTucTTHCModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaQuyTrinhThuTucTTHCModelImpl.FINDER_CACHE_ENABLED,
			MotCuaQuyTrinhThuTucTTHCImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MotCuaQuyTrinhThuTucTTHCModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaQuyTrinhThuTucTTHCModelImpl.FINDER_CACHE_ENABLED,
			MotCuaQuyTrinhThuTucTTHCImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MotCuaQuyTrinhThuTucTTHCModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaQuyTrinhThuTucTTHCModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDANDQUYTRINHTHUTUCID =
		new FinderPath(MotCuaQuyTrinhThuTucTTHCModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaQuyTrinhThuTucTTHCModelImpl.FINDER_CACHE_ENABLED,
			MotCuaQuyTrinhThuTucTTHCImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByThuTucHanhChinhIDAndQuyTrinhThuTucId",
			new String[] { Long.class.getName(), Long.class.getName() },
			MotCuaQuyTrinhThuTucTTHCModelImpl.QUYTRINHTHUTUCID_COLUMN_BITMASK |
			MotCuaQuyTrinhThuTucTTHCModelImpl.THUTUCHANHCHINHID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_THUTUCHANHCHINHIDANDQUYTRINHTHUTUCID =
		new FinderPath(MotCuaQuyTrinhThuTucTTHCModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaQuyTrinhThuTucTTHCModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByThuTucHanhChinhIDAndQuyTrinhThuTucId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the mot cua quy trinh thu tuc t t h c where quyTrinhThuTucId = &#63; and thuTucHanhChinhID = &#63; or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException} if it could not be found.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param thuTucHanhChinhID the thu tuc hanh chinh i d
	 * @return the matching mot cua quy trinh thu tuc t t h c
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException if a matching mot cua quy trinh thu tuc t t h c could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaQuyTrinhThuTucTTHC findByThuTucHanhChinhIDAndQuyTrinhThuTucId(
		long quyTrinhThuTucId, long thuTucHanhChinhID)
		throws NoSuchMotCuaQuyTrinhThuTucTTHCException, SystemException {
		MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC = fetchByThuTucHanhChinhIDAndQuyTrinhThuTucId(quyTrinhThuTucId,
				thuTucHanhChinhID);

		if (motCuaQuyTrinhThuTucTTHC == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("quyTrinhThuTucId=");
			msg.append(quyTrinhThuTucId);

			msg.append(", thuTucHanhChinhID=");
			msg.append(thuTucHanhChinhID);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchMotCuaQuyTrinhThuTucTTHCException(msg.toString());
		}

		return motCuaQuyTrinhThuTucTTHC;
	}

	/**
	 * Returns the mot cua quy trinh thu tuc t t h c where quyTrinhThuTucId = &#63; and thuTucHanhChinhID = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param thuTucHanhChinhID the thu tuc hanh chinh i d
	 * @return the matching mot cua quy trinh thu tuc t t h c, or <code>null</code> if a matching mot cua quy trinh thu tuc t t h c could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaQuyTrinhThuTucTTHC fetchByThuTucHanhChinhIDAndQuyTrinhThuTucId(
		long quyTrinhThuTucId, long thuTucHanhChinhID)
		throws SystemException {
		return fetchByThuTucHanhChinhIDAndQuyTrinhThuTucId(quyTrinhThuTucId,
			thuTucHanhChinhID, true);
	}

	/**
	 * Returns the mot cua quy trinh thu tuc t t h c where quyTrinhThuTucId = &#63; and thuTucHanhChinhID = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param thuTucHanhChinhID the thu tuc hanh chinh i d
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching mot cua quy trinh thu tuc t t h c, or <code>null</code> if a matching mot cua quy trinh thu tuc t t h c could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaQuyTrinhThuTucTTHC fetchByThuTucHanhChinhIDAndQuyTrinhThuTucId(
		long quyTrinhThuTucId, long thuTucHanhChinhID, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { quyTrinhThuTucId, thuTucHanhChinhID };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDANDQUYTRINHTHUTUCID,
					finderArgs, this);
		}

		if (result instanceof MotCuaQuyTrinhThuTucTTHC) {
			MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC = (MotCuaQuyTrinhThuTucTTHC)result;

			if ((quyTrinhThuTucId != motCuaQuyTrinhThuTucTTHC.getQuyTrinhThuTucId()) ||
					(thuTucHanhChinhID != motCuaQuyTrinhThuTucTTHC.getThuTucHanhChinhID())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_MOTCUAQUYTRINHTHUTUCTTHC_WHERE);

			query.append(_FINDER_COLUMN_THUTUCHANHCHINHIDANDQUYTRINHTHUTUCID_QUYTRINHTHUTUCID_2);

			query.append(_FINDER_COLUMN_THUTUCHANHCHINHIDANDQUYTRINHTHUTUCID_THUTUCHANHCHINHID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(quyTrinhThuTucId);

				qPos.add(thuTucHanhChinhID);

				List<MotCuaQuyTrinhThuTucTTHC> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDANDQUYTRINHTHUTUCID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"MotCuaQuyTrinhThuTucTTHCPersistenceImpl.fetchByThuTucHanhChinhIDAndQuyTrinhThuTucId(long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC = list.get(0);

					result = motCuaQuyTrinhThuTucTTHC;

					cacheResult(motCuaQuyTrinhThuTucTTHC);

					if ((motCuaQuyTrinhThuTucTTHC.getQuyTrinhThuTucId() != quyTrinhThuTucId) ||
							(motCuaQuyTrinhThuTucTTHC.getThuTucHanhChinhID() != thuTucHanhChinhID)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDANDQUYTRINHTHUTUCID,
							finderArgs, motCuaQuyTrinhThuTucTTHC);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDANDQUYTRINHTHUTUCID,
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
			return (MotCuaQuyTrinhThuTucTTHC)result;
		}
	}

	/**
	 * Removes the mot cua quy trinh thu tuc t t h c where quyTrinhThuTucId = &#63; and thuTucHanhChinhID = &#63; from the database.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param thuTucHanhChinhID the thu tuc hanh chinh i d
	 * @return the mot cua quy trinh thu tuc t t h c that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaQuyTrinhThuTucTTHC removeByThuTucHanhChinhIDAndQuyTrinhThuTucId(
		long quyTrinhThuTucId, long thuTucHanhChinhID)
		throws NoSuchMotCuaQuyTrinhThuTucTTHCException, SystemException {
		MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC = findByThuTucHanhChinhIDAndQuyTrinhThuTucId(quyTrinhThuTucId,
				thuTucHanhChinhID);

		return remove(motCuaQuyTrinhThuTucTTHC);
	}

	/**
	 * Returns the number of mot cua quy trinh thu tuc t t h cs where quyTrinhThuTucId = &#63; and thuTucHanhChinhID = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param thuTucHanhChinhID the thu tuc hanh chinh i d
	 * @return the number of matching mot cua quy trinh thu tuc t t h cs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByThuTucHanhChinhIDAndQuyTrinhThuTucId(
		long quyTrinhThuTucId, long thuTucHanhChinhID)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_THUTUCHANHCHINHIDANDQUYTRINHTHUTUCID;

		Object[] finderArgs = new Object[] { quyTrinhThuTucId, thuTucHanhChinhID };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_MOTCUAQUYTRINHTHUTUCTTHC_WHERE);

			query.append(_FINDER_COLUMN_THUTUCHANHCHINHIDANDQUYTRINHTHUTUCID_QUYTRINHTHUTUCID_2);

			query.append(_FINDER_COLUMN_THUTUCHANHCHINHIDANDQUYTRINHTHUTUCID_THUTUCHANHCHINHID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(quyTrinhThuTucId);

				qPos.add(thuTucHanhChinhID);

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

	private static final String _FINDER_COLUMN_THUTUCHANHCHINHIDANDQUYTRINHTHUTUCID_QUYTRINHTHUTUCID_2 =
		"motCuaQuyTrinhThuTucTTHC.quyTrinhThuTucId = ? AND ";
	private static final String _FINDER_COLUMN_THUTUCHANHCHINHIDANDQUYTRINHTHUTUCID_THUTUCHANHCHINHID_2 =
		"motCuaQuyTrinhThuTucTTHC.thuTucHanhChinhID = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDANDTOCHUCXULY =
		new FinderPath(MotCuaQuyTrinhThuTucTTHCModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaQuyTrinhThuTucTTHCModelImpl.FINDER_CACHE_ENABLED,
			MotCuaQuyTrinhThuTucTTHCImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByThuTucHanhChinhIDAndToChucXuLy",
			new String[] { Long.class.getName(), Long.class.getName() },
			MotCuaQuyTrinhThuTucTTHCModelImpl.THUTUCHANHCHINHID_COLUMN_BITMASK |
			MotCuaQuyTrinhThuTucTTHCModelImpl.TOCHUCXULY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_THUTUCHANHCHINHIDANDTOCHUCXULY =
		new FinderPath(MotCuaQuyTrinhThuTucTTHCModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaQuyTrinhThuTucTTHCModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByThuTucHanhChinhIDAndToChucXuLy",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the mot cua quy trinh thu tuc t t h c where thuTucHanhChinhID = &#63; and toChucXuLy = &#63; or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException} if it could not be found.
	 *
	 * @param thuTucHanhChinhID the thu tuc hanh chinh i d
	 * @param toChucXuLy the to chuc xu ly
	 * @return the matching mot cua quy trinh thu tuc t t h c
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException if a matching mot cua quy trinh thu tuc t t h c could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaQuyTrinhThuTucTTHC findByThuTucHanhChinhIDAndToChucXuLy(
		long thuTucHanhChinhID, long toChucXuLy)
		throws NoSuchMotCuaQuyTrinhThuTucTTHCException, SystemException {
		MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC = fetchByThuTucHanhChinhIDAndToChucXuLy(thuTucHanhChinhID,
				toChucXuLy);

		if (motCuaQuyTrinhThuTucTTHC == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("thuTucHanhChinhID=");
			msg.append(thuTucHanhChinhID);

			msg.append(", toChucXuLy=");
			msg.append(toChucXuLy);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchMotCuaQuyTrinhThuTucTTHCException(msg.toString());
		}

		return motCuaQuyTrinhThuTucTTHC;
	}

	/**
	 * Returns the mot cua quy trinh thu tuc t t h c where thuTucHanhChinhID = &#63; and toChucXuLy = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param thuTucHanhChinhID the thu tuc hanh chinh i d
	 * @param toChucXuLy the to chuc xu ly
	 * @return the matching mot cua quy trinh thu tuc t t h c, or <code>null</code> if a matching mot cua quy trinh thu tuc t t h c could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaQuyTrinhThuTucTTHC fetchByThuTucHanhChinhIDAndToChucXuLy(
		long thuTucHanhChinhID, long toChucXuLy) throws SystemException {
		return fetchByThuTucHanhChinhIDAndToChucXuLy(thuTucHanhChinhID,
			toChucXuLy, true);
	}

	/**
	 * Returns the mot cua quy trinh thu tuc t t h c where thuTucHanhChinhID = &#63; and toChucXuLy = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param thuTucHanhChinhID the thu tuc hanh chinh i d
	 * @param toChucXuLy the to chuc xu ly
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching mot cua quy trinh thu tuc t t h c, or <code>null</code> if a matching mot cua quy trinh thu tuc t t h c could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaQuyTrinhThuTucTTHC fetchByThuTucHanhChinhIDAndToChucXuLy(
		long thuTucHanhChinhID, long toChucXuLy, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { thuTucHanhChinhID, toChucXuLy };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDANDTOCHUCXULY,
					finderArgs, this);
		}

		if (result instanceof MotCuaQuyTrinhThuTucTTHC) {
			MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC = (MotCuaQuyTrinhThuTucTTHC)result;

			if ((thuTucHanhChinhID != motCuaQuyTrinhThuTucTTHC.getThuTucHanhChinhID()) ||
					(toChucXuLy != motCuaQuyTrinhThuTucTTHC.getToChucXuLy())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_MOTCUAQUYTRINHTHUTUCTTHC_WHERE);

			query.append(_FINDER_COLUMN_THUTUCHANHCHINHIDANDTOCHUCXULY_THUTUCHANHCHINHID_2);

			query.append(_FINDER_COLUMN_THUTUCHANHCHINHIDANDTOCHUCXULY_TOCHUCXULY_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(thuTucHanhChinhID);

				qPos.add(toChucXuLy);

				List<MotCuaQuyTrinhThuTucTTHC> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDANDTOCHUCXULY,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"MotCuaQuyTrinhThuTucTTHCPersistenceImpl.fetchByThuTucHanhChinhIDAndToChucXuLy(long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC = list.get(0);

					result = motCuaQuyTrinhThuTucTTHC;

					cacheResult(motCuaQuyTrinhThuTucTTHC);

					if ((motCuaQuyTrinhThuTucTTHC.getThuTucHanhChinhID() != thuTucHanhChinhID) ||
							(motCuaQuyTrinhThuTucTTHC.getToChucXuLy() != toChucXuLy)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDANDTOCHUCXULY,
							finderArgs, motCuaQuyTrinhThuTucTTHC);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDANDTOCHUCXULY,
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
			return (MotCuaQuyTrinhThuTucTTHC)result;
		}
	}

	/**
	 * Removes the mot cua quy trinh thu tuc t t h c where thuTucHanhChinhID = &#63; and toChucXuLy = &#63; from the database.
	 *
	 * @param thuTucHanhChinhID the thu tuc hanh chinh i d
	 * @param toChucXuLy the to chuc xu ly
	 * @return the mot cua quy trinh thu tuc t t h c that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaQuyTrinhThuTucTTHC removeByThuTucHanhChinhIDAndToChucXuLy(
		long thuTucHanhChinhID, long toChucXuLy)
		throws NoSuchMotCuaQuyTrinhThuTucTTHCException, SystemException {
		MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC = findByThuTucHanhChinhIDAndToChucXuLy(thuTucHanhChinhID,
				toChucXuLy);

		return remove(motCuaQuyTrinhThuTucTTHC);
	}

	/**
	 * Returns the number of mot cua quy trinh thu tuc t t h cs where thuTucHanhChinhID = &#63; and toChucXuLy = &#63;.
	 *
	 * @param thuTucHanhChinhID the thu tuc hanh chinh i d
	 * @param toChucXuLy the to chuc xu ly
	 * @return the number of matching mot cua quy trinh thu tuc t t h cs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByThuTucHanhChinhIDAndToChucXuLy(long thuTucHanhChinhID,
		long toChucXuLy) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_THUTUCHANHCHINHIDANDTOCHUCXULY;

		Object[] finderArgs = new Object[] { thuTucHanhChinhID, toChucXuLy };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_MOTCUAQUYTRINHTHUTUCTTHC_WHERE);

			query.append(_FINDER_COLUMN_THUTUCHANHCHINHIDANDTOCHUCXULY_THUTUCHANHCHINHID_2);

			query.append(_FINDER_COLUMN_THUTUCHANHCHINHIDANDTOCHUCXULY_TOCHUCXULY_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(thuTucHanhChinhID);

				qPos.add(toChucXuLy);

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

	private static final String _FINDER_COLUMN_THUTUCHANHCHINHIDANDTOCHUCXULY_THUTUCHANHCHINHID_2 =
		"motCuaQuyTrinhThuTucTTHC.thuTucHanhChinhID = ? AND ";
	private static final String _FINDER_COLUMN_THUTUCHANHCHINHIDANDTOCHUCXULY_TOCHUCXULY_2 =
		"motCuaQuyTrinhThuTucTTHC.toChucXuLy = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_THUTUCHANHCHINHID =
		new FinderPath(MotCuaQuyTrinhThuTucTTHCModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaQuyTrinhThuTucTTHCModelImpl.FINDER_CACHE_ENABLED,
			MotCuaQuyTrinhThuTucTTHCImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByThuTucHanhChinhID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_THUTUCHANHCHINHID =
		new FinderPath(MotCuaQuyTrinhThuTucTTHCModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaQuyTrinhThuTucTTHCModelImpl.FINDER_CACHE_ENABLED,
			MotCuaQuyTrinhThuTucTTHCImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByThuTucHanhChinhID", new String[] { Long.class.getName() },
			MotCuaQuyTrinhThuTucTTHCModelImpl.THUTUCHANHCHINHID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_THUTUCHANHCHINHID = new FinderPath(MotCuaQuyTrinhThuTucTTHCModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaQuyTrinhThuTucTTHCModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByThuTucHanhChinhID", new String[] { Long.class.getName() });

	/**
	 * Returns all the mot cua quy trinh thu tuc t t h cs where thuTucHanhChinhID = &#63;.
	 *
	 * @param thuTucHanhChinhID the thu tuc hanh chinh i d
	 * @return the matching mot cua quy trinh thu tuc t t h cs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaQuyTrinhThuTucTTHC> findByThuTucHanhChinhID(
		long thuTucHanhChinhID) throws SystemException {
		return findByThuTucHanhChinhID(thuTucHanhChinhID, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua quy trinh thu tuc t t h cs where thuTucHanhChinhID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaQuyTrinhThuTucTTHCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param thuTucHanhChinhID the thu tuc hanh chinh i d
	 * @param start the lower bound of the range of mot cua quy trinh thu tuc t t h cs
	 * @param end the upper bound of the range of mot cua quy trinh thu tuc t t h cs (not inclusive)
	 * @return the range of matching mot cua quy trinh thu tuc t t h cs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaQuyTrinhThuTucTTHC> findByThuTucHanhChinhID(
		long thuTucHanhChinhID, int start, int end) throws SystemException {
		return findByThuTucHanhChinhID(thuTucHanhChinhID, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua quy trinh thu tuc t t h cs where thuTucHanhChinhID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaQuyTrinhThuTucTTHCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param thuTucHanhChinhID the thu tuc hanh chinh i d
	 * @param start the lower bound of the range of mot cua quy trinh thu tuc t t h cs
	 * @param end the upper bound of the range of mot cua quy trinh thu tuc t t h cs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mot cua quy trinh thu tuc t t h cs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaQuyTrinhThuTucTTHC> findByThuTucHanhChinhID(
		long thuTucHanhChinhID, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_THUTUCHANHCHINHID;
			finderArgs = new Object[] { thuTucHanhChinhID };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_THUTUCHANHCHINHID;
			finderArgs = new Object[] {
					thuTucHanhChinhID,
					
					start, end, orderByComparator
				};
		}

		List<MotCuaQuyTrinhThuTucTTHC> list = (List<MotCuaQuyTrinhThuTucTTHC>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC : list) {
				if ((thuTucHanhChinhID != motCuaQuyTrinhThuTucTTHC.getThuTucHanhChinhID())) {
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

			query.append(_SQL_SELECT_MOTCUAQUYTRINHTHUTUCTTHC_WHERE);

			query.append(_FINDER_COLUMN_THUTUCHANHCHINHID_THUTUCHANHCHINHID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MotCuaQuyTrinhThuTucTTHCModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(thuTucHanhChinhID);

				if (!pagination) {
					list = (List<MotCuaQuyTrinhThuTucTTHC>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaQuyTrinhThuTucTTHC>(list);
				}
				else {
					list = (List<MotCuaQuyTrinhThuTucTTHC>)QueryUtil.list(q,
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
	 * Returns the first mot cua quy trinh thu tuc t t h c in the ordered set where thuTucHanhChinhID = &#63;.
	 *
	 * @param thuTucHanhChinhID the thu tuc hanh chinh i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua quy trinh thu tuc t t h c
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException if a matching mot cua quy trinh thu tuc t t h c could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaQuyTrinhThuTucTTHC findByThuTucHanhChinhID_First(
		long thuTucHanhChinhID, OrderByComparator orderByComparator)
		throws NoSuchMotCuaQuyTrinhThuTucTTHCException, SystemException {
		MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC = fetchByThuTucHanhChinhID_First(thuTucHanhChinhID,
				orderByComparator);

		if (motCuaQuyTrinhThuTucTTHC != null) {
			return motCuaQuyTrinhThuTucTTHC;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("thuTucHanhChinhID=");
		msg.append(thuTucHanhChinhID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaQuyTrinhThuTucTTHCException(msg.toString());
	}

	/**
	 * Returns the first mot cua quy trinh thu tuc t t h c in the ordered set where thuTucHanhChinhID = &#63;.
	 *
	 * @param thuTucHanhChinhID the thu tuc hanh chinh i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua quy trinh thu tuc t t h c, or <code>null</code> if a matching mot cua quy trinh thu tuc t t h c could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaQuyTrinhThuTucTTHC fetchByThuTucHanhChinhID_First(
		long thuTucHanhChinhID, OrderByComparator orderByComparator)
		throws SystemException {
		List<MotCuaQuyTrinhThuTucTTHC> list = findByThuTucHanhChinhID(thuTucHanhChinhID,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mot cua quy trinh thu tuc t t h c in the ordered set where thuTucHanhChinhID = &#63;.
	 *
	 * @param thuTucHanhChinhID the thu tuc hanh chinh i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua quy trinh thu tuc t t h c
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException if a matching mot cua quy trinh thu tuc t t h c could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaQuyTrinhThuTucTTHC findByThuTucHanhChinhID_Last(
		long thuTucHanhChinhID, OrderByComparator orderByComparator)
		throws NoSuchMotCuaQuyTrinhThuTucTTHCException, SystemException {
		MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC = fetchByThuTucHanhChinhID_Last(thuTucHanhChinhID,
				orderByComparator);

		if (motCuaQuyTrinhThuTucTTHC != null) {
			return motCuaQuyTrinhThuTucTTHC;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("thuTucHanhChinhID=");
		msg.append(thuTucHanhChinhID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaQuyTrinhThuTucTTHCException(msg.toString());
	}

	/**
	 * Returns the last mot cua quy trinh thu tuc t t h c in the ordered set where thuTucHanhChinhID = &#63;.
	 *
	 * @param thuTucHanhChinhID the thu tuc hanh chinh i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua quy trinh thu tuc t t h c, or <code>null</code> if a matching mot cua quy trinh thu tuc t t h c could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaQuyTrinhThuTucTTHC fetchByThuTucHanhChinhID_Last(
		long thuTucHanhChinhID, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByThuTucHanhChinhID(thuTucHanhChinhID);

		if (count == 0) {
			return null;
		}

		List<MotCuaQuyTrinhThuTucTTHC> list = findByThuTucHanhChinhID(thuTucHanhChinhID,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mot cua quy trinh thu tuc t t h cs before and after the current mot cua quy trinh thu tuc t t h c in the ordered set where thuTucHanhChinhID = &#63;.
	 *
	 * @param id the primary key of the current mot cua quy trinh thu tuc t t h c
	 * @param thuTucHanhChinhID the thu tuc hanh chinh i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mot cua quy trinh thu tuc t t h c
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException if a mot cua quy trinh thu tuc t t h c with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaQuyTrinhThuTucTTHC[] findByThuTucHanhChinhID_PrevAndNext(
		long id, long thuTucHanhChinhID, OrderByComparator orderByComparator)
		throws NoSuchMotCuaQuyTrinhThuTucTTHCException, SystemException {
		MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			MotCuaQuyTrinhThuTucTTHC[] array = new MotCuaQuyTrinhThuTucTTHCImpl[3];

			array[0] = getByThuTucHanhChinhID_PrevAndNext(session,
					motCuaQuyTrinhThuTucTTHC, thuTucHanhChinhID,
					orderByComparator, true);

			array[1] = motCuaQuyTrinhThuTucTTHC;

			array[2] = getByThuTucHanhChinhID_PrevAndNext(session,
					motCuaQuyTrinhThuTucTTHC, thuTucHanhChinhID,
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

	protected MotCuaQuyTrinhThuTucTTHC getByThuTucHanhChinhID_PrevAndNext(
		Session session, MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC,
		long thuTucHanhChinhID, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MOTCUAQUYTRINHTHUTUCTTHC_WHERE);

		query.append(_FINDER_COLUMN_THUTUCHANHCHINHID_THUTUCHANHCHINHID_2);

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
			query.append(MotCuaQuyTrinhThuTucTTHCModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(thuTucHanhChinhID);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(motCuaQuyTrinhThuTucTTHC);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MotCuaQuyTrinhThuTucTTHC> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mot cua quy trinh thu tuc t t h cs where thuTucHanhChinhID = &#63; from the database.
	 *
	 * @param thuTucHanhChinhID the thu tuc hanh chinh i d
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByThuTucHanhChinhID(long thuTucHanhChinhID)
		throws SystemException {
		for (MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC : findByThuTucHanhChinhID(
				thuTucHanhChinhID, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(motCuaQuyTrinhThuTucTTHC);
		}
	}

	/**
	 * Returns the number of mot cua quy trinh thu tuc t t h cs where thuTucHanhChinhID = &#63;.
	 *
	 * @param thuTucHanhChinhID the thu tuc hanh chinh i d
	 * @return the number of matching mot cua quy trinh thu tuc t t h cs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByThuTucHanhChinhID(long thuTucHanhChinhID)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_THUTUCHANHCHINHID;

		Object[] finderArgs = new Object[] { thuTucHanhChinhID };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MOTCUAQUYTRINHTHUTUCTTHC_WHERE);

			query.append(_FINDER_COLUMN_THUTUCHANHCHINHID_THUTUCHANHCHINHID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(thuTucHanhChinhID);

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

	private static final String _FINDER_COLUMN_THUTUCHANHCHINHID_THUTUCHANHCHINHID_2 =
		"motCuaQuyTrinhThuTucTTHC.thuTucHanhChinhID = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_QUYTRINHTHUTUCID =
		new FinderPath(MotCuaQuyTrinhThuTucTTHCModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaQuyTrinhThuTucTTHCModelImpl.FINDER_CACHE_ENABLED,
			MotCuaQuyTrinhThuTucTTHCImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByquyTrinhThuTucId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCID =
		new FinderPath(MotCuaQuyTrinhThuTucTTHCModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaQuyTrinhThuTucTTHCModelImpl.FINDER_CACHE_ENABLED,
			MotCuaQuyTrinhThuTucTTHCImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByquyTrinhThuTucId", new String[] { Long.class.getName() },
			MotCuaQuyTrinhThuTucTTHCModelImpl.QUYTRINHTHUTUCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_QUYTRINHTHUTUCID = new FinderPath(MotCuaQuyTrinhThuTucTTHCModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaQuyTrinhThuTucTTHCModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByquyTrinhThuTucId", new String[] { Long.class.getName() });

	/**
	 * Returns all the mot cua quy trinh thu tuc t t h cs where quyTrinhThuTucId = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @return the matching mot cua quy trinh thu tuc t t h cs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaQuyTrinhThuTucTTHC> findByquyTrinhThuTucId(
		long quyTrinhThuTucId) throws SystemException {
		return findByquyTrinhThuTucId(quyTrinhThuTucId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua quy trinh thu tuc t t h cs where quyTrinhThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaQuyTrinhThuTucTTHCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param start the lower bound of the range of mot cua quy trinh thu tuc t t h cs
	 * @param end the upper bound of the range of mot cua quy trinh thu tuc t t h cs (not inclusive)
	 * @return the range of matching mot cua quy trinh thu tuc t t h cs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaQuyTrinhThuTucTTHC> findByquyTrinhThuTucId(
		long quyTrinhThuTucId, int start, int end) throws SystemException {
		return findByquyTrinhThuTucId(quyTrinhThuTucId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua quy trinh thu tuc t t h cs where quyTrinhThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaQuyTrinhThuTucTTHCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param start the lower bound of the range of mot cua quy trinh thu tuc t t h cs
	 * @param end the upper bound of the range of mot cua quy trinh thu tuc t t h cs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mot cua quy trinh thu tuc t t h cs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaQuyTrinhThuTucTTHC> findByquyTrinhThuTucId(
		long quyTrinhThuTucId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCID;
			finderArgs = new Object[] { quyTrinhThuTucId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_QUYTRINHTHUTUCID;
			finderArgs = new Object[] {
					quyTrinhThuTucId,
					
					start, end, orderByComparator
				};
		}

		List<MotCuaQuyTrinhThuTucTTHC> list = (List<MotCuaQuyTrinhThuTucTTHC>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC : list) {
				if ((quyTrinhThuTucId != motCuaQuyTrinhThuTucTTHC.getQuyTrinhThuTucId())) {
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

			query.append(_SQL_SELECT_MOTCUAQUYTRINHTHUTUCTTHC_WHERE);

			query.append(_FINDER_COLUMN_QUYTRINHTHUTUCID_QUYTRINHTHUTUCID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MotCuaQuyTrinhThuTucTTHCModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(quyTrinhThuTucId);

				if (!pagination) {
					list = (List<MotCuaQuyTrinhThuTucTTHC>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaQuyTrinhThuTucTTHC>(list);
				}
				else {
					list = (List<MotCuaQuyTrinhThuTucTTHC>)QueryUtil.list(q,
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
	 * Returns the first mot cua quy trinh thu tuc t t h c in the ordered set where quyTrinhThuTucId = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua quy trinh thu tuc t t h c
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException if a matching mot cua quy trinh thu tuc t t h c could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaQuyTrinhThuTucTTHC findByquyTrinhThuTucId_First(
		long quyTrinhThuTucId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaQuyTrinhThuTucTTHCException, SystemException {
		MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC = fetchByquyTrinhThuTucId_First(quyTrinhThuTucId,
				orderByComparator);

		if (motCuaQuyTrinhThuTucTTHC != null) {
			return motCuaQuyTrinhThuTucTTHC;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("quyTrinhThuTucId=");
		msg.append(quyTrinhThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaQuyTrinhThuTucTTHCException(msg.toString());
	}

	/**
	 * Returns the first mot cua quy trinh thu tuc t t h c in the ordered set where quyTrinhThuTucId = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua quy trinh thu tuc t t h c, or <code>null</code> if a matching mot cua quy trinh thu tuc t t h c could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaQuyTrinhThuTucTTHC fetchByquyTrinhThuTucId_First(
		long quyTrinhThuTucId, OrderByComparator orderByComparator)
		throws SystemException {
		List<MotCuaQuyTrinhThuTucTTHC> list = findByquyTrinhThuTucId(quyTrinhThuTucId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mot cua quy trinh thu tuc t t h c in the ordered set where quyTrinhThuTucId = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua quy trinh thu tuc t t h c
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException if a matching mot cua quy trinh thu tuc t t h c could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaQuyTrinhThuTucTTHC findByquyTrinhThuTucId_Last(
		long quyTrinhThuTucId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaQuyTrinhThuTucTTHCException, SystemException {
		MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC = fetchByquyTrinhThuTucId_Last(quyTrinhThuTucId,
				orderByComparator);

		if (motCuaQuyTrinhThuTucTTHC != null) {
			return motCuaQuyTrinhThuTucTTHC;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("quyTrinhThuTucId=");
		msg.append(quyTrinhThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaQuyTrinhThuTucTTHCException(msg.toString());
	}

	/**
	 * Returns the last mot cua quy trinh thu tuc t t h c in the ordered set where quyTrinhThuTucId = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua quy trinh thu tuc t t h c, or <code>null</code> if a matching mot cua quy trinh thu tuc t t h c could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaQuyTrinhThuTucTTHC fetchByquyTrinhThuTucId_Last(
		long quyTrinhThuTucId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByquyTrinhThuTucId(quyTrinhThuTucId);

		if (count == 0) {
			return null;
		}

		List<MotCuaQuyTrinhThuTucTTHC> list = findByquyTrinhThuTucId(quyTrinhThuTucId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mot cua quy trinh thu tuc t t h cs before and after the current mot cua quy trinh thu tuc t t h c in the ordered set where quyTrinhThuTucId = &#63;.
	 *
	 * @param id the primary key of the current mot cua quy trinh thu tuc t t h c
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mot cua quy trinh thu tuc t t h c
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException if a mot cua quy trinh thu tuc t t h c with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaQuyTrinhThuTucTTHC[] findByquyTrinhThuTucId_PrevAndNext(
		long id, long quyTrinhThuTucId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaQuyTrinhThuTucTTHCException, SystemException {
		MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			MotCuaQuyTrinhThuTucTTHC[] array = new MotCuaQuyTrinhThuTucTTHCImpl[3];

			array[0] = getByquyTrinhThuTucId_PrevAndNext(session,
					motCuaQuyTrinhThuTucTTHC, quyTrinhThuTucId,
					orderByComparator, true);

			array[1] = motCuaQuyTrinhThuTucTTHC;

			array[2] = getByquyTrinhThuTucId_PrevAndNext(session,
					motCuaQuyTrinhThuTucTTHC, quyTrinhThuTucId,
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

	protected MotCuaQuyTrinhThuTucTTHC getByquyTrinhThuTucId_PrevAndNext(
		Session session, MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC,
		long quyTrinhThuTucId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MOTCUAQUYTRINHTHUTUCTTHC_WHERE);

		query.append(_FINDER_COLUMN_QUYTRINHTHUTUCID_QUYTRINHTHUTUCID_2);

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
			query.append(MotCuaQuyTrinhThuTucTTHCModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(quyTrinhThuTucId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(motCuaQuyTrinhThuTucTTHC);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MotCuaQuyTrinhThuTucTTHC> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mot cua quy trinh thu tuc t t h cs where quyTrinhThuTucId = &#63; from the database.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByquyTrinhThuTucId(long quyTrinhThuTucId)
		throws SystemException {
		for (MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC : findByquyTrinhThuTucId(
				quyTrinhThuTucId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(motCuaQuyTrinhThuTucTTHC);
		}
	}

	/**
	 * Returns the number of mot cua quy trinh thu tuc t t h cs where quyTrinhThuTucId = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @return the number of matching mot cua quy trinh thu tuc t t h cs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByquyTrinhThuTucId(long quyTrinhThuTucId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_QUYTRINHTHUTUCID;

		Object[] finderArgs = new Object[] { quyTrinhThuTucId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MOTCUAQUYTRINHTHUTUCTTHC_WHERE);

			query.append(_FINDER_COLUMN_QUYTRINHTHUTUCID_QUYTRINHTHUTUCID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

	private static final String _FINDER_COLUMN_QUYTRINHTHUTUCID_QUYTRINHTHUTUCID_2 =
		"motCuaQuyTrinhThuTucTTHC.quyTrinhThuTucId = ?";

	public MotCuaQuyTrinhThuTucTTHCPersistenceImpl() {
		setModelClass(MotCuaQuyTrinhThuTucTTHC.class);
	}

	/**
	 * Caches the mot cua quy trinh thu tuc t t h c in the entity cache if it is enabled.
	 *
	 * @param motCuaQuyTrinhThuTucTTHC the mot cua quy trinh thu tuc t t h c
	 */
	@Override
	public void cacheResult(MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC) {
		EntityCacheUtil.putResult(MotCuaQuyTrinhThuTucTTHCModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaQuyTrinhThuTucTTHCImpl.class,
			motCuaQuyTrinhThuTucTTHC.getPrimaryKey(), motCuaQuyTrinhThuTucTTHC);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDANDQUYTRINHTHUTUCID,
			new Object[] {
				motCuaQuyTrinhThuTucTTHC.getQuyTrinhThuTucId(),
				motCuaQuyTrinhThuTucTTHC.getThuTucHanhChinhID()
			}, motCuaQuyTrinhThuTucTTHC);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDANDTOCHUCXULY,
			new Object[] {
				motCuaQuyTrinhThuTucTTHC.getThuTucHanhChinhID(),
				motCuaQuyTrinhThuTucTTHC.getToChucXuLy()
			}, motCuaQuyTrinhThuTucTTHC);

		motCuaQuyTrinhThuTucTTHC.resetOriginalValues();
	}

	/**
	 * Caches the mot cua quy trinh thu tuc t t h cs in the entity cache if it is enabled.
	 *
	 * @param motCuaQuyTrinhThuTucTTHCs the mot cua quy trinh thu tuc t t h cs
	 */
	@Override
	public void cacheResult(
		List<MotCuaQuyTrinhThuTucTTHC> motCuaQuyTrinhThuTucTTHCs) {
		for (MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC : motCuaQuyTrinhThuTucTTHCs) {
			if (EntityCacheUtil.getResult(
						MotCuaQuyTrinhThuTucTTHCModelImpl.ENTITY_CACHE_ENABLED,
						MotCuaQuyTrinhThuTucTTHCImpl.class,
						motCuaQuyTrinhThuTucTTHC.getPrimaryKey()) == null) {
				cacheResult(motCuaQuyTrinhThuTucTTHC);
			}
			else {
				motCuaQuyTrinhThuTucTTHC.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all mot cua quy trinh thu tuc t t h cs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(MotCuaQuyTrinhThuTucTTHCImpl.class.getName());
		}

		EntityCacheUtil.clearCache(MotCuaQuyTrinhThuTucTTHCImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the mot cua quy trinh thu tuc t t h c.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC) {
		EntityCacheUtil.removeResult(MotCuaQuyTrinhThuTucTTHCModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaQuyTrinhThuTucTTHCImpl.class,
			motCuaQuyTrinhThuTucTTHC.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(motCuaQuyTrinhThuTucTTHC);
	}

	@Override
	public void clearCache(
		List<MotCuaQuyTrinhThuTucTTHC> motCuaQuyTrinhThuTucTTHCs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC : motCuaQuyTrinhThuTucTTHCs) {
			EntityCacheUtil.removeResult(MotCuaQuyTrinhThuTucTTHCModelImpl.ENTITY_CACHE_ENABLED,
				MotCuaQuyTrinhThuTucTTHCImpl.class,
				motCuaQuyTrinhThuTucTTHC.getPrimaryKey());

			clearUniqueFindersCache(motCuaQuyTrinhThuTucTTHC);
		}
	}

	protected void cacheUniqueFindersCache(
		MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC) {
		if (motCuaQuyTrinhThuTucTTHC.isNew()) {
			Object[] args = new Object[] {
					motCuaQuyTrinhThuTucTTHC.getQuyTrinhThuTucId(),
					motCuaQuyTrinhThuTucTTHC.getThuTucHanhChinhID()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_THUTUCHANHCHINHIDANDQUYTRINHTHUTUCID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDANDQUYTRINHTHUTUCID,
				args, motCuaQuyTrinhThuTucTTHC);

			args = new Object[] {
					motCuaQuyTrinhThuTucTTHC.getThuTucHanhChinhID(),
					motCuaQuyTrinhThuTucTTHC.getToChucXuLy()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_THUTUCHANHCHINHIDANDTOCHUCXULY,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDANDTOCHUCXULY,
				args, motCuaQuyTrinhThuTucTTHC);
		}
		else {
			MotCuaQuyTrinhThuTucTTHCModelImpl motCuaQuyTrinhThuTucTTHCModelImpl = (MotCuaQuyTrinhThuTucTTHCModelImpl)motCuaQuyTrinhThuTucTTHC;

			if ((motCuaQuyTrinhThuTucTTHCModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDANDQUYTRINHTHUTUCID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaQuyTrinhThuTucTTHC.getQuyTrinhThuTucId(),
						motCuaQuyTrinhThuTucTTHC.getThuTucHanhChinhID()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_THUTUCHANHCHINHIDANDQUYTRINHTHUTUCID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDANDQUYTRINHTHUTUCID,
					args, motCuaQuyTrinhThuTucTTHC);
			}

			if ((motCuaQuyTrinhThuTucTTHCModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDANDTOCHUCXULY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaQuyTrinhThuTucTTHC.getThuTucHanhChinhID(),
						motCuaQuyTrinhThuTucTTHC.getToChucXuLy()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_THUTUCHANHCHINHIDANDTOCHUCXULY,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDANDTOCHUCXULY,
					args, motCuaQuyTrinhThuTucTTHC);
			}
		}
	}

	protected void clearUniqueFindersCache(
		MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC) {
		MotCuaQuyTrinhThuTucTTHCModelImpl motCuaQuyTrinhThuTucTTHCModelImpl = (MotCuaQuyTrinhThuTucTTHCModelImpl)motCuaQuyTrinhThuTucTTHC;

		Object[] args = new Object[] {
				motCuaQuyTrinhThuTucTTHC.getQuyTrinhThuTucId(),
				motCuaQuyTrinhThuTucTTHC.getThuTucHanhChinhID()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_THUTUCHANHCHINHIDANDQUYTRINHTHUTUCID,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDANDQUYTRINHTHUTUCID,
			args);

		if ((motCuaQuyTrinhThuTucTTHCModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDANDQUYTRINHTHUTUCID.getColumnBitmask()) != 0) {
			args = new Object[] {
					motCuaQuyTrinhThuTucTTHCModelImpl.getOriginalQuyTrinhThuTucId(),
					motCuaQuyTrinhThuTucTTHCModelImpl.getOriginalThuTucHanhChinhID()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_THUTUCHANHCHINHIDANDQUYTRINHTHUTUCID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDANDQUYTRINHTHUTUCID,
				args);
		}

		args = new Object[] {
				motCuaQuyTrinhThuTucTTHC.getThuTucHanhChinhID(),
				motCuaQuyTrinhThuTucTTHC.getToChucXuLy()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_THUTUCHANHCHINHIDANDTOCHUCXULY,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDANDTOCHUCXULY,
			args);

		if ((motCuaQuyTrinhThuTucTTHCModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDANDTOCHUCXULY.getColumnBitmask()) != 0) {
			args = new Object[] {
					motCuaQuyTrinhThuTucTTHCModelImpl.getOriginalThuTucHanhChinhID(),
					motCuaQuyTrinhThuTucTTHCModelImpl.getOriginalToChucXuLy()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_THUTUCHANHCHINHIDANDTOCHUCXULY,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDANDTOCHUCXULY,
				args);
		}
	}

	/**
	 * Creates a new mot cua quy trinh thu tuc t t h c with the primary key. Does not add the mot cua quy trinh thu tuc t t h c to the database.
	 *
	 * @param id the primary key for the new mot cua quy trinh thu tuc t t h c
	 * @return the new mot cua quy trinh thu tuc t t h c
	 */
	@Override
	public MotCuaQuyTrinhThuTucTTHC create(long id) {
		MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC = new MotCuaQuyTrinhThuTucTTHCImpl();

		motCuaQuyTrinhThuTucTTHC.setNew(true);
		motCuaQuyTrinhThuTucTTHC.setPrimaryKey(id);

		return motCuaQuyTrinhThuTucTTHC;
	}

	/**
	 * Removes the mot cua quy trinh thu tuc t t h c with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the mot cua quy trinh thu tuc t t h c
	 * @return the mot cua quy trinh thu tuc t t h c that was removed
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException if a mot cua quy trinh thu tuc t t h c with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaQuyTrinhThuTucTTHC remove(long id)
		throws NoSuchMotCuaQuyTrinhThuTucTTHCException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the mot cua quy trinh thu tuc t t h c with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the mot cua quy trinh thu tuc t t h c
	 * @return the mot cua quy trinh thu tuc t t h c that was removed
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException if a mot cua quy trinh thu tuc t t h c with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaQuyTrinhThuTucTTHC remove(Serializable primaryKey)
		throws NoSuchMotCuaQuyTrinhThuTucTTHCException, SystemException {
		Session session = null;

		try {
			session = openSession();

			MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC = (MotCuaQuyTrinhThuTucTTHC)session.get(MotCuaQuyTrinhThuTucTTHCImpl.class,
					primaryKey);

			if (motCuaQuyTrinhThuTucTTHC == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMotCuaQuyTrinhThuTucTTHCException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(motCuaQuyTrinhThuTucTTHC);
		}
		catch (NoSuchMotCuaQuyTrinhThuTucTTHCException nsee) {
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
	protected MotCuaQuyTrinhThuTucTTHC removeImpl(
		MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC)
		throws SystemException {
		motCuaQuyTrinhThuTucTTHC = toUnwrappedModel(motCuaQuyTrinhThuTucTTHC);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(motCuaQuyTrinhThuTucTTHC)) {
				motCuaQuyTrinhThuTucTTHC = (MotCuaQuyTrinhThuTucTTHC)session.get(MotCuaQuyTrinhThuTucTTHCImpl.class,
						motCuaQuyTrinhThuTucTTHC.getPrimaryKeyObj());
			}

			if (motCuaQuyTrinhThuTucTTHC != null) {
				session.delete(motCuaQuyTrinhThuTucTTHC);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (motCuaQuyTrinhThuTucTTHC != null) {
			clearCache(motCuaQuyTrinhThuTucTTHC);
		}

		return motCuaQuyTrinhThuTucTTHC;
	}

	@Override
	public MotCuaQuyTrinhThuTucTTHC updateImpl(
		vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC)
		throws SystemException {
		motCuaQuyTrinhThuTucTTHC = toUnwrappedModel(motCuaQuyTrinhThuTucTTHC);

		boolean isNew = motCuaQuyTrinhThuTucTTHC.isNew();

		MotCuaQuyTrinhThuTucTTHCModelImpl motCuaQuyTrinhThuTucTTHCModelImpl = (MotCuaQuyTrinhThuTucTTHCModelImpl)motCuaQuyTrinhThuTucTTHC;

		Session session = null;

		try {
			session = openSession();

			if (motCuaQuyTrinhThuTucTTHC.isNew()) {
				session.save(motCuaQuyTrinhThuTucTTHC);

				motCuaQuyTrinhThuTucTTHC.setNew(false);
			}
			else {
				session.merge(motCuaQuyTrinhThuTucTTHC);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !MotCuaQuyTrinhThuTucTTHCModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((motCuaQuyTrinhThuTucTTHCModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_THUTUCHANHCHINHID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaQuyTrinhThuTucTTHCModelImpl.getOriginalThuTucHanhChinhID()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_THUTUCHANHCHINHID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_THUTUCHANHCHINHID,
					args);

				args = new Object[] {
						motCuaQuyTrinhThuTucTTHCModelImpl.getThuTucHanhChinhID()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_THUTUCHANHCHINHID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_THUTUCHANHCHINHID,
					args);
			}

			if ((motCuaQuyTrinhThuTucTTHCModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaQuyTrinhThuTucTTHCModelImpl.getOriginalQuyTrinhThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_QUYTRINHTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCID,
					args);

				args = new Object[] {
						motCuaQuyTrinhThuTucTTHCModelImpl.getQuyTrinhThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_QUYTRINHTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCID,
					args);
			}
		}

		EntityCacheUtil.putResult(MotCuaQuyTrinhThuTucTTHCModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaQuyTrinhThuTucTTHCImpl.class,
			motCuaQuyTrinhThuTucTTHC.getPrimaryKey(), motCuaQuyTrinhThuTucTTHC);

		clearUniqueFindersCache(motCuaQuyTrinhThuTucTTHC);
		cacheUniqueFindersCache(motCuaQuyTrinhThuTucTTHC);

		return motCuaQuyTrinhThuTucTTHC;
	}

	protected MotCuaQuyTrinhThuTucTTHC toUnwrappedModel(
		MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC) {
		if (motCuaQuyTrinhThuTucTTHC instanceof MotCuaQuyTrinhThuTucTTHCImpl) {
			return motCuaQuyTrinhThuTucTTHC;
		}

		MotCuaQuyTrinhThuTucTTHCImpl motCuaQuyTrinhThuTucTTHCImpl = new MotCuaQuyTrinhThuTucTTHCImpl();

		motCuaQuyTrinhThuTucTTHCImpl.setNew(motCuaQuyTrinhThuTucTTHC.isNew());
		motCuaQuyTrinhThuTucTTHCImpl.setPrimaryKey(motCuaQuyTrinhThuTucTTHC.getPrimaryKey());

		motCuaQuyTrinhThuTucTTHCImpl.setId(motCuaQuyTrinhThuTucTTHC.getId());
		motCuaQuyTrinhThuTucTTHCImpl.setQuyTrinhThuTucId(motCuaQuyTrinhThuTucTTHC.getQuyTrinhThuTucId());
		motCuaQuyTrinhThuTucTTHCImpl.setThuTucHanhChinhID(motCuaQuyTrinhThuTucTTHC.getThuTucHanhChinhID());
		motCuaQuyTrinhThuTucTTHCImpl.setToChucXuLy(motCuaQuyTrinhThuTucTTHC.getToChucXuLy());

		return motCuaQuyTrinhThuTucTTHCImpl;
	}

	/**
	 * Returns the mot cua quy trinh thu tuc t t h c with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the mot cua quy trinh thu tuc t t h c
	 * @return the mot cua quy trinh thu tuc t t h c
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException if a mot cua quy trinh thu tuc t t h c with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaQuyTrinhThuTucTTHC findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMotCuaQuyTrinhThuTucTTHCException, SystemException {
		MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC = fetchByPrimaryKey(primaryKey);

		if (motCuaQuyTrinhThuTucTTHC == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMotCuaQuyTrinhThuTucTTHCException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return motCuaQuyTrinhThuTucTTHC;
	}

	/**
	 * Returns the mot cua quy trinh thu tuc t t h c with the primary key or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException} if it could not be found.
	 *
	 * @param id the primary key of the mot cua quy trinh thu tuc t t h c
	 * @return the mot cua quy trinh thu tuc t t h c
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException if a mot cua quy trinh thu tuc t t h c with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaQuyTrinhThuTucTTHC findByPrimaryKey(long id)
		throws NoSuchMotCuaQuyTrinhThuTucTTHCException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the mot cua quy trinh thu tuc t t h c with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the mot cua quy trinh thu tuc t t h c
	 * @return the mot cua quy trinh thu tuc t t h c, or <code>null</code> if a mot cua quy trinh thu tuc t t h c with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaQuyTrinhThuTucTTHC fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC = (MotCuaQuyTrinhThuTucTTHC)EntityCacheUtil.getResult(MotCuaQuyTrinhThuTucTTHCModelImpl.ENTITY_CACHE_ENABLED,
				MotCuaQuyTrinhThuTucTTHCImpl.class, primaryKey);

		if (motCuaQuyTrinhThuTucTTHC == _nullMotCuaQuyTrinhThuTucTTHC) {
			return null;
		}

		if (motCuaQuyTrinhThuTucTTHC == null) {
			Session session = null;

			try {
				session = openSession();

				motCuaQuyTrinhThuTucTTHC = (MotCuaQuyTrinhThuTucTTHC)session.get(MotCuaQuyTrinhThuTucTTHCImpl.class,
						primaryKey);

				if (motCuaQuyTrinhThuTucTTHC != null) {
					cacheResult(motCuaQuyTrinhThuTucTTHC);
				}
				else {
					EntityCacheUtil.putResult(MotCuaQuyTrinhThuTucTTHCModelImpl.ENTITY_CACHE_ENABLED,
						MotCuaQuyTrinhThuTucTTHCImpl.class, primaryKey,
						_nullMotCuaQuyTrinhThuTucTTHC);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(MotCuaQuyTrinhThuTucTTHCModelImpl.ENTITY_CACHE_ENABLED,
					MotCuaQuyTrinhThuTucTTHCImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return motCuaQuyTrinhThuTucTTHC;
	}

	/**
	 * Returns the mot cua quy trinh thu tuc t t h c with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the mot cua quy trinh thu tuc t t h c
	 * @return the mot cua quy trinh thu tuc t t h c, or <code>null</code> if a mot cua quy trinh thu tuc t t h c with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaQuyTrinhThuTucTTHC fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the mot cua quy trinh thu tuc t t h cs.
	 *
	 * @return the mot cua quy trinh thu tuc t t h cs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaQuyTrinhThuTucTTHC> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua quy trinh thu tuc t t h cs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaQuyTrinhThuTucTTHCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mot cua quy trinh thu tuc t t h cs
	 * @param end the upper bound of the range of mot cua quy trinh thu tuc t t h cs (not inclusive)
	 * @return the range of mot cua quy trinh thu tuc t t h cs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaQuyTrinhThuTucTTHC> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua quy trinh thu tuc t t h cs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaQuyTrinhThuTucTTHCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mot cua quy trinh thu tuc t t h cs
	 * @param end the upper bound of the range of mot cua quy trinh thu tuc t t h cs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mot cua quy trinh thu tuc t t h cs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaQuyTrinhThuTucTTHC> findAll(int start, int end,
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

		List<MotCuaQuyTrinhThuTucTTHC> list = (List<MotCuaQuyTrinhThuTucTTHC>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MOTCUAQUYTRINHTHUTUCTTHC);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MOTCUAQUYTRINHTHUTUCTTHC;

				if (pagination) {
					sql = sql.concat(MotCuaQuyTrinhThuTucTTHCModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<MotCuaQuyTrinhThuTucTTHC>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaQuyTrinhThuTucTTHC>(list);
				}
				else {
					list = (List<MotCuaQuyTrinhThuTucTTHC>)QueryUtil.list(q,
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
	 * Removes all the mot cua quy trinh thu tuc t t h cs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC : findAll()) {
			remove(motCuaQuyTrinhThuTucTTHC);
		}
	}

	/**
	 * Returns the number of mot cua quy trinh thu tuc t t h cs.
	 *
	 * @return the number of mot cua quy trinh thu tuc t t h cs
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

				Query q = session.createQuery(_SQL_COUNT_MOTCUAQUYTRINHTHUTUCTTHC);

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
	 * Initializes the mot cua quy trinh thu tuc t t h c persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<MotCuaQuyTrinhThuTucTTHC>> listenersList = new ArrayList<ModelListener<MotCuaQuyTrinhThuTucTTHC>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<MotCuaQuyTrinhThuTucTTHC>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(MotCuaQuyTrinhThuTucTTHCImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_MOTCUAQUYTRINHTHUTUCTTHC = "SELECT motCuaQuyTrinhThuTucTTHC FROM MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC";
	private static final String _SQL_SELECT_MOTCUAQUYTRINHTHUTUCTTHC_WHERE = "SELECT motCuaQuyTrinhThuTucTTHC FROM MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC WHERE ";
	private static final String _SQL_COUNT_MOTCUAQUYTRINHTHUTUCTTHC = "SELECT COUNT(motCuaQuyTrinhThuTucTTHC) FROM MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC";
	private static final String _SQL_COUNT_MOTCUAQUYTRINHTHUTUCTTHC_WHERE = "SELECT COUNT(motCuaQuyTrinhThuTucTTHC) FROM MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "motCuaQuyTrinhThuTucTTHC.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MotCuaQuyTrinhThuTucTTHC exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No MotCuaQuyTrinhThuTucTTHC exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(MotCuaQuyTrinhThuTucTTHCPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"thuTucHanhChinhID", "toChucXuLy"
			});
	private static MotCuaQuyTrinhThuTucTTHC _nullMotCuaQuyTrinhThuTucTTHC = new MotCuaQuyTrinhThuTucTTHCImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<MotCuaQuyTrinhThuTucTTHC> toCacheModel() {
				return _nullMotCuaQuyTrinhThuTucTTHCCacheModel;
			}
		};

	private static CacheModel<MotCuaQuyTrinhThuTucTTHC> _nullMotCuaQuyTrinhThuTucTTHCCacheModel =
		new CacheModel<MotCuaQuyTrinhThuTucTTHC>() {
			@Override
			public MotCuaQuyTrinhThuTucTTHC toEntityModel() {
				return _nullMotCuaQuyTrinhThuTucTTHC;
			}
		};
}