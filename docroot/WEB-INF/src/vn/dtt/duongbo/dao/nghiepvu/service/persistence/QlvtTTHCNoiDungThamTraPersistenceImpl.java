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

import vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCNoiDungThamTraException;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra;
import vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtTTHCNoiDungThamTraImpl;
import vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtTTHCNoiDungThamTraModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the qlvt t t h c noi dung tham tra service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanNc
 * @see QlvtTTHCNoiDungThamTraPersistence
 * @see QlvtTTHCNoiDungThamTraUtil
 * @generated
 */
public class QlvtTTHCNoiDungThamTraPersistenceImpl extends BasePersistenceImpl<QlvtTTHCNoiDungThamTra>
	implements QlvtTTHCNoiDungThamTraPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QlvtTTHCNoiDungThamTraUtil} to access the qlvt t t h c noi dung tham tra persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QlvtTTHCNoiDungThamTraImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QlvtTTHCNoiDungThamTraModelImpl.ENTITY_CACHE_ENABLED,
			QlvtTTHCNoiDungThamTraModelImpl.FINDER_CACHE_ENABLED,
			QlvtTTHCNoiDungThamTraImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QlvtTTHCNoiDungThamTraModelImpl.ENTITY_CACHE_ENABLED,
			QlvtTTHCNoiDungThamTraModelImpl.FINDER_CACHE_ENABLED,
			QlvtTTHCNoiDungThamTraImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QlvtTTHCNoiDungThamTraModelImpl.ENTITY_CACHE_ENABLED,
			QlvtTTHCNoiDungThamTraModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_F_MATTHC = new FinderPath(QlvtTTHCNoiDungThamTraModelImpl.ENTITY_CACHE_ENABLED,
			QlvtTTHCNoiDungThamTraModelImpl.FINDER_CACHE_ENABLED,
			QlvtTTHCNoiDungThamTraImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByF_MaTTHC", new String[] { String.class.getName() },
			QlvtTTHCNoiDungThamTraModelImpl.MATTHC_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_MATTHC = new FinderPath(QlvtTTHCNoiDungThamTraModelImpl.ENTITY_CACHE_ENABLED,
			QlvtTTHCNoiDungThamTraModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByF_MaTTHC",
			new String[] { String.class.getName() });

	/**
	 * Returns the qlvt t t h c noi dung tham tra where maTTHC = &#63; or throws a {@link vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCNoiDungThamTraException} if it could not be found.
	 *
	 * @param maTTHC the ma t t h c
	 * @return the matching qlvt t t h c noi dung tham tra
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCNoiDungThamTraException if a matching qlvt t t h c noi dung tham tra could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtTTHCNoiDungThamTra findByF_MaTTHC(String maTTHC)
		throws NoSuchQlvtTTHCNoiDungThamTraException, SystemException {
		QlvtTTHCNoiDungThamTra qlvtTTHCNoiDungThamTra = fetchByF_MaTTHC(maTTHC);

		if (qlvtTTHCNoiDungThamTra == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("maTTHC=");
			msg.append(maTTHC);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchQlvtTTHCNoiDungThamTraException(msg.toString());
		}

		return qlvtTTHCNoiDungThamTra;
	}

	/**
	 * Returns the qlvt t t h c noi dung tham tra where maTTHC = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param maTTHC the ma t t h c
	 * @return the matching qlvt t t h c noi dung tham tra, or <code>null</code> if a matching qlvt t t h c noi dung tham tra could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtTTHCNoiDungThamTra fetchByF_MaTTHC(String maTTHC)
		throws SystemException {
		return fetchByF_MaTTHC(maTTHC, true);
	}

	/**
	 * Returns the qlvt t t h c noi dung tham tra where maTTHC = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param maTTHC the ma t t h c
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching qlvt t t h c noi dung tham tra, or <code>null</code> if a matching qlvt t t h c noi dung tham tra could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtTTHCNoiDungThamTra fetchByF_MaTTHC(String maTTHC,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { maTTHC };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_F_MATTHC,
					finderArgs, this);
		}

		if (result instanceof QlvtTTHCNoiDungThamTra) {
			QlvtTTHCNoiDungThamTra qlvtTTHCNoiDungThamTra = (QlvtTTHCNoiDungThamTra)result;

			if (!Validator.equals(maTTHC, qlvtTTHCNoiDungThamTra.getMaTTHC())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_QLVTTTHCNOIDUNGTHAMTRA_WHERE);

			boolean bindMaTTHC = false;

			if (maTTHC == null) {
				query.append(_FINDER_COLUMN_F_MATTHC_MATTHC_1);
			}
			else if (maTTHC.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_MATTHC_MATTHC_3);
			}
			else {
				bindMaTTHC = true;

				query.append(_FINDER_COLUMN_F_MATTHC_MATTHC_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaTTHC) {
					qPos.add(maTTHC);
				}

				List<QlvtTTHCNoiDungThamTra> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_MATTHC,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"QlvtTTHCNoiDungThamTraPersistenceImpl.fetchByF_MaTTHC(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					QlvtTTHCNoiDungThamTra qlvtTTHCNoiDungThamTra = list.get(0);

					result = qlvtTTHCNoiDungThamTra;

					cacheResult(qlvtTTHCNoiDungThamTra);

					if ((qlvtTTHCNoiDungThamTra.getMaTTHC() == null) ||
							!qlvtTTHCNoiDungThamTra.getMaTTHC().equals(maTTHC)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_MATTHC,
							finderArgs, qlvtTTHCNoiDungThamTra);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_F_MATTHC,
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
			return (QlvtTTHCNoiDungThamTra)result;
		}
	}

	/**
	 * Removes the qlvt t t h c noi dung tham tra where maTTHC = &#63; from the database.
	 *
	 * @param maTTHC the ma t t h c
	 * @return the qlvt t t h c noi dung tham tra that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtTTHCNoiDungThamTra removeByF_MaTTHC(String maTTHC)
		throws NoSuchQlvtTTHCNoiDungThamTraException, SystemException {
		QlvtTTHCNoiDungThamTra qlvtTTHCNoiDungThamTra = findByF_MaTTHC(maTTHC);

		return remove(qlvtTTHCNoiDungThamTra);
	}

	/**
	 * Returns the number of qlvt t t h c noi dung tham tras where maTTHC = &#63;.
	 *
	 * @param maTTHC the ma t t h c
	 * @return the number of matching qlvt t t h c noi dung tham tras
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByF_MaTTHC(String maTTHC) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_MATTHC;

		Object[] finderArgs = new Object[] { maTTHC };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_QLVTTTHCNOIDUNGTHAMTRA_WHERE);

			boolean bindMaTTHC = false;

			if (maTTHC == null) {
				query.append(_FINDER_COLUMN_F_MATTHC_MATTHC_1);
			}
			else if (maTTHC.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_MATTHC_MATTHC_3);
			}
			else {
				bindMaTTHC = true;

				query.append(_FINDER_COLUMN_F_MATTHC_MATTHC_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaTTHC) {
					qPos.add(maTTHC);
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

	private static final String _FINDER_COLUMN_F_MATTHC_MATTHC_1 = "qlvtTTHCNoiDungThamTra.maTTHC IS NULL";
	private static final String _FINDER_COLUMN_F_MATTHC_MATTHC_2 = "qlvtTTHCNoiDungThamTra.maTTHC = ?";
	private static final String _FINDER_COLUMN_F_MATTHC_MATTHC_3 = "(qlvtTTHCNoiDungThamTra.maTTHC IS NULL OR qlvtTTHCNoiDungThamTra.maTTHC = '')";

	public QlvtTTHCNoiDungThamTraPersistenceImpl() {
		setModelClass(QlvtTTHCNoiDungThamTra.class);
	}

	/**
	 * Caches the qlvt t t h c noi dung tham tra in the entity cache if it is enabled.
	 *
	 * @param qlvtTTHCNoiDungThamTra the qlvt t t h c noi dung tham tra
	 */
	@Override
	public void cacheResult(QlvtTTHCNoiDungThamTra qlvtTTHCNoiDungThamTra) {
		EntityCacheUtil.putResult(QlvtTTHCNoiDungThamTraModelImpl.ENTITY_CACHE_ENABLED,
			QlvtTTHCNoiDungThamTraImpl.class,
			qlvtTTHCNoiDungThamTra.getPrimaryKey(), qlvtTTHCNoiDungThamTra);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_MATTHC,
			new Object[] { qlvtTTHCNoiDungThamTra.getMaTTHC() },
			qlvtTTHCNoiDungThamTra);

		qlvtTTHCNoiDungThamTra.resetOriginalValues();
	}

	/**
	 * Caches the qlvt t t h c noi dung tham tras in the entity cache if it is enabled.
	 *
	 * @param qlvtTTHCNoiDungThamTras the qlvt t t h c noi dung tham tras
	 */
	@Override
	public void cacheResult(
		List<QlvtTTHCNoiDungThamTra> qlvtTTHCNoiDungThamTras) {
		for (QlvtTTHCNoiDungThamTra qlvtTTHCNoiDungThamTra : qlvtTTHCNoiDungThamTras) {
			if (EntityCacheUtil.getResult(
						QlvtTTHCNoiDungThamTraModelImpl.ENTITY_CACHE_ENABLED,
						QlvtTTHCNoiDungThamTraImpl.class,
						qlvtTTHCNoiDungThamTra.getPrimaryKey()) == null) {
				cacheResult(qlvtTTHCNoiDungThamTra);
			}
			else {
				qlvtTTHCNoiDungThamTra.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qlvt t t h c noi dung tham tras.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QlvtTTHCNoiDungThamTraImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QlvtTTHCNoiDungThamTraImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qlvt t t h c noi dung tham tra.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QlvtTTHCNoiDungThamTra qlvtTTHCNoiDungThamTra) {
		EntityCacheUtil.removeResult(QlvtTTHCNoiDungThamTraModelImpl.ENTITY_CACHE_ENABLED,
			QlvtTTHCNoiDungThamTraImpl.class,
			qlvtTTHCNoiDungThamTra.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(qlvtTTHCNoiDungThamTra);
	}

	@Override
	public void clearCache(List<QlvtTTHCNoiDungThamTra> qlvtTTHCNoiDungThamTras) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QlvtTTHCNoiDungThamTra qlvtTTHCNoiDungThamTra : qlvtTTHCNoiDungThamTras) {
			EntityCacheUtil.removeResult(QlvtTTHCNoiDungThamTraModelImpl.ENTITY_CACHE_ENABLED,
				QlvtTTHCNoiDungThamTraImpl.class,
				qlvtTTHCNoiDungThamTra.getPrimaryKey());

			clearUniqueFindersCache(qlvtTTHCNoiDungThamTra);
		}
	}

	protected void cacheUniqueFindersCache(
		QlvtTTHCNoiDungThamTra qlvtTTHCNoiDungThamTra) {
		if (qlvtTTHCNoiDungThamTra.isNew()) {
			Object[] args = new Object[] { qlvtTTHCNoiDungThamTra.getMaTTHC() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_F_MATTHC, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_MATTHC, args,
				qlvtTTHCNoiDungThamTra);
		}
		else {
			QlvtTTHCNoiDungThamTraModelImpl qlvtTTHCNoiDungThamTraModelImpl = (QlvtTTHCNoiDungThamTraModelImpl)qlvtTTHCNoiDungThamTra;

			if ((qlvtTTHCNoiDungThamTraModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_F_MATTHC.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { qlvtTTHCNoiDungThamTra.getMaTTHC() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_F_MATTHC, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_MATTHC, args,
					qlvtTTHCNoiDungThamTra);
			}
		}
	}

	protected void clearUniqueFindersCache(
		QlvtTTHCNoiDungThamTra qlvtTTHCNoiDungThamTra) {
		QlvtTTHCNoiDungThamTraModelImpl qlvtTTHCNoiDungThamTraModelImpl = (QlvtTTHCNoiDungThamTraModelImpl)qlvtTTHCNoiDungThamTra;

		Object[] args = new Object[] { qlvtTTHCNoiDungThamTra.getMaTTHC() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_MATTHC, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_F_MATTHC, args);

		if ((qlvtTTHCNoiDungThamTraModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_F_MATTHC.getColumnBitmask()) != 0) {
			args = new Object[] {
					qlvtTTHCNoiDungThamTraModelImpl.getOriginalMaTTHC()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_MATTHC, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_F_MATTHC, args);
		}
	}

	/**
	 * Creates a new qlvt t t h c noi dung tham tra with the primary key. Does not add the qlvt t t h c noi dung tham tra to the database.
	 *
	 * @param id the primary key for the new qlvt t t h c noi dung tham tra
	 * @return the new qlvt t t h c noi dung tham tra
	 */
	@Override
	public QlvtTTHCNoiDungThamTra create(long id) {
		QlvtTTHCNoiDungThamTra qlvtTTHCNoiDungThamTra = new QlvtTTHCNoiDungThamTraImpl();

		qlvtTTHCNoiDungThamTra.setNew(true);
		qlvtTTHCNoiDungThamTra.setPrimaryKey(id);

		return qlvtTTHCNoiDungThamTra;
	}

	/**
	 * Removes the qlvt t t h c noi dung tham tra with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the qlvt t t h c noi dung tham tra
	 * @return the qlvt t t h c noi dung tham tra that was removed
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCNoiDungThamTraException if a qlvt t t h c noi dung tham tra with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtTTHCNoiDungThamTra remove(long id)
		throws NoSuchQlvtTTHCNoiDungThamTraException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the qlvt t t h c noi dung tham tra with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qlvt t t h c noi dung tham tra
	 * @return the qlvt t t h c noi dung tham tra that was removed
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCNoiDungThamTraException if a qlvt t t h c noi dung tham tra with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtTTHCNoiDungThamTra remove(Serializable primaryKey)
		throws NoSuchQlvtTTHCNoiDungThamTraException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QlvtTTHCNoiDungThamTra qlvtTTHCNoiDungThamTra = (QlvtTTHCNoiDungThamTra)session.get(QlvtTTHCNoiDungThamTraImpl.class,
					primaryKey);

			if (qlvtTTHCNoiDungThamTra == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQlvtTTHCNoiDungThamTraException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtTTHCNoiDungThamTra);
		}
		catch (NoSuchQlvtTTHCNoiDungThamTraException nsee) {
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
	protected QlvtTTHCNoiDungThamTra removeImpl(
		QlvtTTHCNoiDungThamTra qlvtTTHCNoiDungThamTra)
		throws SystemException {
		qlvtTTHCNoiDungThamTra = toUnwrappedModel(qlvtTTHCNoiDungThamTra);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtTTHCNoiDungThamTra)) {
				qlvtTTHCNoiDungThamTra = (QlvtTTHCNoiDungThamTra)session.get(QlvtTTHCNoiDungThamTraImpl.class,
						qlvtTTHCNoiDungThamTra.getPrimaryKeyObj());
			}

			if (qlvtTTHCNoiDungThamTra != null) {
				session.delete(qlvtTTHCNoiDungThamTra);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtTTHCNoiDungThamTra != null) {
			clearCache(qlvtTTHCNoiDungThamTra);
		}

		return qlvtTTHCNoiDungThamTra;
	}

	@Override
	public QlvtTTHCNoiDungThamTra updateImpl(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra qlvtTTHCNoiDungThamTra)
		throws SystemException {
		qlvtTTHCNoiDungThamTra = toUnwrappedModel(qlvtTTHCNoiDungThamTra);

		boolean isNew = qlvtTTHCNoiDungThamTra.isNew();

		Session session = null;

		try {
			session = openSession();

			if (qlvtTTHCNoiDungThamTra.isNew()) {
				session.save(qlvtTTHCNoiDungThamTra);

				qlvtTTHCNoiDungThamTra.setNew(false);
			}
			else {
				session.merge(qlvtTTHCNoiDungThamTra);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !QlvtTTHCNoiDungThamTraModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(QlvtTTHCNoiDungThamTraModelImpl.ENTITY_CACHE_ENABLED,
			QlvtTTHCNoiDungThamTraImpl.class,
			qlvtTTHCNoiDungThamTra.getPrimaryKey(), qlvtTTHCNoiDungThamTra);

		clearUniqueFindersCache(qlvtTTHCNoiDungThamTra);
		cacheUniqueFindersCache(qlvtTTHCNoiDungThamTra);

		return qlvtTTHCNoiDungThamTra;
	}

	protected QlvtTTHCNoiDungThamTra toUnwrappedModel(
		QlvtTTHCNoiDungThamTra qlvtTTHCNoiDungThamTra) {
		if (qlvtTTHCNoiDungThamTra instanceof QlvtTTHCNoiDungThamTraImpl) {
			return qlvtTTHCNoiDungThamTra;
		}

		QlvtTTHCNoiDungThamTraImpl qlvtTTHCNoiDungThamTraImpl = new QlvtTTHCNoiDungThamTraImpl();

		qlvtTTHCNoiDungThamTraImpl.setNew(qlvtTTHCNoiDungThamTra.isNew());
		qlvtTTHCNoiDungThamTraImpl.setPrimaryKey(qlvtTTHCNoiDungThamTra.getPrimaryKey());

		qlvtTTHCNoiDungThamTraImpl.setId(qlvtTTHCNoiDungThamTra.getId());
		qlvtTTHCNoiDungThamTraImpl.setMaTTHC(qlvtTTHCNoiDungThamTra.getMaTTHC());
		qlvtTTHCNoiDungThamTraImpl.setToChucXuLy(qlvtTTHCNoiDungThamTra.getToChucXuLy());

		return qlvtTTHCNoiDungThamTraImpl;
	}

	/**
	 * Returns the qlvt t t h c noi dung tham tra with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt t t h c noi dung tham tra
	 * @return the qlvt t t h c noi dung tham tra
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCNoiDungThamTraException if a qlvt t t h c noi dung tham tra with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtTTHCNoiDungThamTra findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQlvtTTHCNoiDungThamTraException, SystemException {
		QlvtTTHCNoiDungThamTra qlvtTTHCNoiDungThamTra = fetchByPrimaryKey(primaryKey);

		if (qlvtTTHCNoiDungThamTra == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQlvtTTHCNoiDungThamTraException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtTTHCNoiDungThamTra;
	}

	/**
	 * Returns the qlvt t t h c noi dung tham tra with the primary key or throws a {@link vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCNoiDungThamTraException} if it could not be found.
	 *
	 * @param id the primary key of the qlvt t t h c noi dung tham tra
	 * @return the qlvt t t h c noi dung tham tra
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCNoiDungThamTraException if a qlvt t t h c noi dung tham tra with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtTTHCNoiDungThamTra findByPrimaryKey(long id)
		throws NoSuchQlvtTTHCNoiDungThamTraException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the qlvt t t h c noi dung tham tra with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt t t h c noi dung tham tra
	 * @return the qlvt t t h c noi dung tham tra, or <code>null</code> if a qlvt t t h c noi dung tham tra with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtTTHCNoiDungThamTra fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QlvtTTHCNoiDungThamTra qlvtTTHCNoiDungThamTra = (QlvtTTHCNoiDungThamTra)EntityCacheUtil.getResult(QlvtTTHCNoiDungThamTraModelImpl.ENTITY_CACHE_ENABLED,
				QlvtTTHCNoiDungThamTraImpl.class, primaryKey);

		if (qlvtTTHCNoiDungThamTra == _nullQlvtTTHCNoiDungThamTra) {
			return null;
		}

		if (qlvtTTHCNoiDungThamTra == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtTTHCNoiDungThamTra = (QlvtTTHCNoiDungThamTra)session.get(QlvtTTHCNoiDungThamTraImpl.class,
						primaryKey);

				if (qlvtTTHCNoiDungThamTra != null) {
					cacheResult(qlvtTTHCNoiDungThamTra);
				}
				else {
					EntityCacheUtil.putResult(QlvtTTHCNoiDungThamTraModelImpl.ENTITY_CACHE_ENABLED,
						QlvtTTHCNoiDungThamTraImpl.class, primaryKey,
						_nullQlvtTTHCNoiDungThamTra);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QlvtTTHCNoiDungThamTraModelImpl.ENTITY_CACHE_ENABLED,
					QlvtTTHCNoiDungThamTraImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtTTHCNoiDungThamTra;
	}

	/**
	 * Returns the qlvt t t h c noi dung tham tra with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the qlvt t t h c noi dung tham tra
	 * @return the qlvt t t h c noi dung tham tra, or <code>null</code> if a qlvt t t h c noi dung tham tra with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtTTHCNoiDungThamTra fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the qlvt t t h c noi dung tham tras.
	 *
	 * @return the qlvt t t h c noi dung tham tras
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtTTHCNoiDungThamTra> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt t t h c noi dung tham tras.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtTTHCNoiDungThamTraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt t t h c noi dung tham tras
	 * @param end the upper bound of the range of qlvt t t h c noi dung tham tras (not inclusive)
	 * @return the range of qlvt t t h c noi dung tham tras
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtTTHCNoiDungThamTra> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt t t h c noi dung tham tras.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtTTHCNoiDungThamTraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt t t h c noi dung tham tras
	 * @param end the upper bound of the range of qlvt t t h c noi dung tham tras (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qlvt t t h c noi dung tham tras
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtTTHCNoiDungThamTra> findAll(int start, int end,
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

		List<QlvtTTHCNoiDungThamTra> list = (List<QlvtTTHCNoiDungThamTra>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTTTHCNOIDUNGTHAMTRA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTTTHCNOIDUNGTHAMTRA;

				if (pagination) {
					sql = sql.concat(QlvtTTHCNoiDungThamTraModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QlvtTTHCNoiDungThamTra>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtTTHCNoiDungThamTra>(list);
				}
				else {
					list = (List<QlvtTTHCNoiDungThamTra>)QueryUtil.list(q,
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
	 * Removes all the qlvt t t h c noi dung tham tras from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QlvtTTHCNoiDungThamTra qlvtTTHCNoiDungThamTra : findAll()) {
			remove(qlvtTTHCNoiDungThamTra);
		}
	}

	/**
	 * Returns the number of qlvt t t h c noi dung tham tras.
	 *
	 * @return the number of qlvt t t h c noi dung tham tras
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

				Query q = session.createQuery(_SQL_COUNT_QLVTTTHCNOIDUNGTHAMTRA);

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
	 * Initializes the qlvt t t h c noi dung tham tra persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QlvtTTHCNoiDungThamTra>> listenersList = new ArrayList<ModelListener<QlvtTTHCNoiDungThamTra>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QlvtTTHCNoiDungThamTra>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QlvtTTHCNoiDungThamTraImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTTTHCNOIDUNGTHAMTRA = "SELECT qlvtTTHCNoiDungThamTra FROM QlvtTTHCNoiDungThamTra qlvtTTHCNoiDungThamTra";
	private static final String _SQL_SELECT_QLVTTTHCNOIDUNGTHAMTRA_WHERE = "SELECT qlvtTTHCNoiDungThamTra FROM QlvtTTHCNoiDungThamTra qlvtTTHCNoiDungThamTra WHERE ";
	private static final String _SQL_COUNT_QLVTTTHCNOIDUNGTHAMTRA = "SELECT COUNT(qlvtTTHCNoiDungThamTra) FROM QlvtTTHCNoiDungThamTra qlvtTTHCNoiDungThamTra";
	private static final String _SQL_COUNT_QLVTTTHCNOIDUNGTHAMTRA_WHERE = "SELECT COUNT(qlvtTTHCNoiDungThamTra) FROM QlvtTTHCNoiDungThamTra qlvtTTHCNoiDungThamTra WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtTTHCNoiDungThamTra.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QlvtTTHCNoiDungThamTra exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No QlvtTTHCNoiDungThamTra exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QlvtTTHCNoiDungThamTraPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"maTTHC", "toChucXuLy"
			});
	private static QlvtTTHCNoiDungThamTra _nullQlvtTTHCNoiDungThamTra = new QlvtTTHCNoiDungThamTraImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QlvtTTHCNoiDungThamTra> toCacheModel() {
				return _nullQlvtTTHCNoiDungThamTraCacheModel;
			}
		};

	private static CacheModel<QlvtTTHCNoiDungThamTra> _nullQlvtTTHCNoiDungThamTraCacheModel =
		new CacheModel<QlvtTTHCNoiDungThamTra>() {
			@Override
			public QlvtTTHCNoiDungThamTra toEntityModel() {
				return _nullQlvtTTHCNoiDungThamTra;
			}
		};
}