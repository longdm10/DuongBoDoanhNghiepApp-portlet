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

package vn.dtt.duongbo.dao.thanhtoan.service.persistence;

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

import vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcHinhThucNopPhiException;
import vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi;
import vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcHinhThucNopPhiImpl;
import vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcHinhThucNopPhiModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the tthc hinh thuc nop phi service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcHinhThucNopPhiPersistence
 * @see TthcHinhThucNopPhiUtil
 * @generated
 */
public class TthcHinhThucNopPhiPersistenceImpl extends BasePersistenceImpl<TthcHinhThucNopPhi>
	implements TthcHinhThucNopPhiPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TthcHinhThucNopPhiUtil} to access the tthc hinh thuc nop phi persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TthcHinhThucNopPhiImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TthcHinhThucNopPhiModelImpl.ENTITY_CACHE_ENABLED,
			TthcHinhThucNopPhiModelImpl.FINDER_CACHE_ENABLED,
			TthcHinhThucNopPhiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TthcHinhThucNopPhiModelImpl.ENTITY_CACHE_ENABLED,
			TthcHinhThucNopPhiModelImpl.FINDER_CACHE_ENABLED,
			TthcHinhThucNopPhiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TthcHinhThucNopPhiModelImpl.ENTITY_CACHE_ENABLED,
			TthcHinhThucNopPhiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_THUTUCHANHCHINHID = new FinderPath(TthcHinhThucNopPhiModelImpl.ENTITY_CACHE_ENABLED,
			TthcHinhThucNopPhiModelImpl.FINDER_CACHE_ENABLED,
			TthcHinhThucNopPhiImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByThuTucHanhChinhId", new String[] { Long.class.getName() },
			TthcHinhThucNopPhiModelImpl.THUTUCHANHCHINHID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_THUTUCHANHCHINHID = new FinderPath(TthcHinhThucNopPhiModelImpl.ENTITY_CACHE_ENABLED,
			TthcHinhThucNopPhiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByThuTucHanhChinhId", new String[] { Long.class.getName() });

	/**
	 * Returns the tthc hinh thuc nop phi where thuTucHanhChinhId = &#63; or throws a {@link vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcHinhThucNopPhiException} if it could not be found.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @return the matching tthc hinh thuc nop phi
	 * @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcHinhThucNopPhiException if a matching tthc hinh thuc nop phi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHinhThucNopPhi findByThuTucHanhChinhId(long thuTucHanhChinhId)
		throws NoSuchTthcHinhThucNopPhiException, SystemException {
		TthcHinhThucNopPhi tthcHinhThucNopPhi = fetchByThuTucHanhChinhId(thuTucHanhChinhId);

		if (tthcHinhThucNopPhi == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("thuTucHanhChinhId=");
			msg.append(thuTucHanhChinhId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchTthcHinhThucNopPhiException(msg.toString());
		}

		return tthcHinhThucNopPhi;
	}

	/**
	 * Returns the tthc hinh thuc nop phi where thuTucHanhChinhId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @return the matching tthc hinh thuc nop phi, or <code>null</code> if a matching tthc hinh thuc nop phi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHinhThucNopPhi fetchByThuTucHanhChinhId(long thuTucHanhChinhId)
		throws SystemException {
		return fetchByThuTucHanhChinhId(thuTucHanhChinhId, true);
	}

	/**
	 * Returns the tthc hinh thuc nop phi where thuTucHanhChinhId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching tthc hinh thuc nop phi, or <code>null</code> if a matching tthc hinh thuc nop phi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHinhThucNopPhi fetchByThuTucHanhChinhId(long thuTucHanhChinhId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { thuTucHanhChinhId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHID,
					finderArgs, this);
		}

		if (result instanceof TthcHinhThucNopPhi) {
			TthcHinhThucNopPhi tthcHinhThucNopPhi = (TthcHinhThucNopPhi)result;

			if ((thuTucHanhChinhId != tthcHinhThucNopPhi.getThuTucHanhChinhId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_TTHCHINHTHUCNOPPHI_WHERE);

			query.append(_FINDER_COLUMN_THUTUCHANHCHINHID_THUTUCHANHCHINHID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(thuTucHanhChinhId);

				List<TthcHinhThucNopPhi> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"TthcHinhThucNopPhiPersistenceImpl.fetchByThuTucHanhChinhId(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					TthcHinhThucNopPhi tthcHinhThucNopPhi = list.get(0);

					result = tthcHinhThucNopPhi;

					cacheResult(tthcHinhThucNopPhi);

					if ((tthcHinhThucNopPhi.getThuTucHanhChinhId() != thuTucHanhChinhId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHID,
							finderArgs, tthcHinhThucNopPhi);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHID,
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
			return (TthcHinhThucNopPhi)result;
		}
	}

	/**
	 * Removes the tthc hinh thuc nop phi where thuTucHanhChinhId = &#63; from the database.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @return the tthc hinh thuc nop phi that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHinhThucNopPhi removeByThuTucHanhChinhId(long thuTucHanhChinhId)
		throws NoSuchTthcHinhThucNopPhiException, SystemException {
		TthcHinhThucNopPhi tthcHinhThucNopPhi = findByThuTucHanhChinhId(thuTucHanhChinhId);

		return remove(tthcHinhThucNopPhi);
	}

	/**
	 * Returns the number of tthc hinh thuc nop phis where thuTucHanhChinhId = &#63;.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @return the number of matching tthc hinh thuc nop phis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByThuTucHanhChinhId(long thuTucHanhChinhId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_THUTUCHANHCHINHID;

		Object[] finderArgs = new Object[] { thuTucHanhChinhId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TTHCHINHTHUCNOPPHI_WHERE);

			query.append(_FINDER_COLUMN_THUTUCHANHCHINHID_THUTUCHANHCHINHID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

	private static final String _FINDER_COLUMN_THUTUCHANHCHINHID_THUTUCHANHCHINHID_2 =
		"tthcHinhThucNopPhi.thuTucHanhChinhId = ?";

	public TthcHinhThucNopPhiPersistenceImpl() {
		setModelClass(TthcHinhThucNopPhi.class);
	}

	/**
	 * Caches the tthc hinh thuc nop phi in the entity cache if it is enabled.
	 *
	 * @param tthcHinhThucNopPhi the tthc hinh thuc nop phi
	 */
	@Override
	public void cacheResult(TthcHinhThucNopPhi tthcHinhThucNopPhi) {
		EntityCacheUtil.putResult(TthcHinhThucNopPhiModelImpl.ENTITY_CACHE_ENABLED,
			TthcHinhThucNopPhiImpl.class, tthcHinhThucNopPhi.getPrimaryKey(),
			tthcHinhThucNopPhi);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHID,
			new Object[] { tthcHinhThucNopPhi.getThuTucHanhChinhId() },
			tthcHinhThucNopPhi);

		tthcHinhThucNopPhi.resetOriginalValues();
	}

	/**
	 * Caches the tthc hinh thuc nop phis in the entity cache if it is enabled.
	 *
	 * @param tthcHinhThucNopPhis the tthc hinh thuc nop phis
	 */
	@Override
	public void cacheResult(List<TthcHinhThucNopPhi> tthcHinhThucNopPhis) {
		for (TthcHinhThucNopPhi tthcHinhThucNopPhi : tthcHinhThucNopPhis) {
			if (EntityCacheUtil.getResult(
						TthcHinhThucNopPhiModelImpl.ENTITY_CACHE_ENABLED,
						TthcHinhThucNopPhiImpl.class,
						tthcHinhThucNopPhi.getPrimaryKey()) == null) {
				cacheResult(tthcHinhThucNopPhi);
			}
			else {
				tthcHinhThucNopPhi.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tthc hinh thuc nop phis.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TthcHinhThucNopPhiImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TthcHinhThucNopPhiImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tthc hinh thuc nop phi.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TthcHinhThucNopPhi tthcHinhThucNopPhi) {
		EntityCacheUtil.removeResult(TthcHinhThucNopPhiModelImpl.ENTITY_CACHE_ENABLED,
			TthcHinhThucNopPhiImpl.class, tthcHinhThucNopPhi.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(tthcHinhThucNopPhi);
	}

	@Override
	public void clearCache(List<TthcHinhThucNopPhi> tthcHinhThucNopPhis) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TthcHinhThucNopPhi tthcHinhThucNopPhi : tthcHinhThucNopPhis) {
			EntityCacheUtil.removeResult(TthcHinhThucNopPhiModelImpl.ENTITY_CACHE_ENABLED,
				TthcHinhThucNopPhiImpl.class, tthcHinhThucNopPhi.getPrimaryKey());

			clearUniqueFindersCache(tthcHinhThucNopPhi);
		}
	}

	protected void cacheUniqueFindersCache(
		TthcHinhThucNopPhi tthcHinhThucNopPhi) {
		if (tthcHinhThucNopPhi.isNew()) {
			Object[] args = new Object[] {
					tthcHinhThucNopPhi.getThuTucHanhChinhId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_THUTUCHANHCHINHID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHID,
				args, tthcHinhThucNopPhi);
		}
		else {
			TthcHinhThucNopPhiModelImpl tthcHinhThucNopPhiModelImpl = (TthcHinhThucNopPhiModelImpl)tthcHinhThucNopPhi;

			if ((tthcHinhThucNopPhiModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_THUTUCHANHCHINHID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcHinhThucNopPhi.getThuTucHanhChinhId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_THUTUCHANHCHINHID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHID,
					args, tthcHinhThucNopPhi);
			}
		}
	}

	protected void clearUniqueFindersCache(
		TthcHinhThucNopPhi tthcHinhThucNopPhi) {
		TthcHinhThucNopPhiModelImpl tthcHinhThucNopPhiModelImpl = (TthcHinhThucNopPhiModelImpl)tthcHinhThucNopPhi;

		Object[] args = new Object[] { tthcHinhThucNopPhi.getThuTucHanhChinhId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_THUTUCHANHCHINHID,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHID,
			args);

		if ((tthcHinhThucNopPhiModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_THUTUCHANHCHINHID.getColumnBitmask()) != 0) {
			args = new Object[] {
					tthcHinhThucNopPhiModelImpl.getOriginalThuTucHanhChinhId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_THUTUCHANHCHINHID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHID,
				args);
		}
	}

	/**
	 * Creates a new tthc hinh thuc nop phi with the primary key. Does not add the tthc hinh thuc nop phi to the database.
	 *
	 * @param id the primary key for the new tthc hinh thuc nop phi
	 * @return the new tthc hinh thuc nop phi
	 */
	@Override
	public TthcHinhThucNopPhi create(long id) {
		TthcHinhThucNopPhi tthcHinhThucNopPhi = new TthcHinhThucNopPhiImpl();

		tthcHinhThucNopPhi.setNew(true);
		tthcHinhThucNopPhi.setPrimaryKey(id);

		return tthcHinhThucNopPhi;
	}

	/**
	 * Removes the tthc hinh thuc nop phi with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the tthc hinh thuc nop phi
	 * @return the tthc hinh thuc nop phi that was removed
	 * @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcHinhThucNopPhiException if a tthc hinh thuc nop phi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHinhThucNopPhi remove(long id)
		throws NoSuchTthcHinhThucNopPhiException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the tthc hinh thuc nop phi with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tthc hinh thuc nop phi
	 * @return the tthc hinh thuc nop phi that was removed
	 * @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcHinhThucNopPhiException if a tthc hinh thuc nop phi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHinhThucNopPhi remove(Serializable primaryKey)
		throws NoSuchTthcHinhThucNopPhiException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TthcHinhThucNopPhi tthcHinhThucNopPhi = (TthcHinhThucNopPhi)session.get(TthcHinhThucNopPhiImpl.class,
					primaryKey);

			if (tthcHinhThucNopPhi == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTthcHinhThucNopPhiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tthcHinhThucNopPhi);
		}
		catch (NoSuchTthcHinhThucNopPhiException nsee) {
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
	protected TthcHinhThucNopPhi removeImpl(
		TthcHinhThucNopPhi tthcHinhThucNopPhi) throws SystemException {
		tthcHinhThucNopPhi = toUnwrappedModel(tthcHinhThucNopPhi);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tthcHinhThucNopPhi)) {
				tthcHinhThucNopPhi = (TthcHinhThucNopPhi)session.get(TthcHinhThucNopPhiImpl.class,
						tthcHinhThucNopPhi.getPrimaryKeyObj());
			}

			if (tthcHinhThucNopPhi != null) {
				session.delete(tthcHinhThucNopPhi);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tthcHinhThucNopPhi != null) {
			clearCache(tthcHinhThucNopPhi);
		}

		return tthcHinhThucNopPhi;
	}

	@Override
	public TthcHinhThucNopPhi updateImpl(
		vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi tthcHinhThucNopPhi)
		throws SystemException {
		tthcHinhThucNopPhi = toUnwrappedModel(tthcHinhThucNopPhi);

		boolean isNew = tthcHinhThucNopPhi.isNew();

		Session session = null;

		try {
			session = openSession();

			if (tthcHinhThucNopPhi.isNew()) {
				session.save(tthcHinhThucNopPhi);

				tthcHinhThucNopPhi.setNew(false);
			}
			else {
				session.merge(tthcHinhThucNopPhi);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TthcHinhThucNopPhiModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(TthcHinhThucNopPhiModelImpl.ENTITY_CACHE_ENABLED,
			TthcHinhThucNopPhiImpl.class, tthcHinhThucNopPhi.getPrimaryKey(),
			tthcHinhThucNopPhi);

		clearUniqueFindersCache(tthcHinhThucNopPhi);
		cacheUniqueFindersCache(tthcHinhThucNopPhi);

		return tthcHinhThucNopPhi;
	}

	protected TthcHinhThucNopPhi toUnwrappedModel(
		TthcHinhThucNopPhi tthcHinhThucNopPhi) {
		if (tthcHinhThucNopPhi instanceof TthcHinhThucNopPhiImpl) {
			return tthcHinhThucNopPhi;
		}

		TthcHinhThucNopPhiImpl tthcHinhThucNopPhiImpl = new TthcHinhThucNopPhiImpl();

		tthcHinhThucNopPhiImpl.setNew(tthcHinhThucNopPhi.isNew());
		tthcHinhThucNopPhiImpl.setPrimaryKey(tthcHinhThucNopPhi.getPrimaryKey());

		tthcHinhThucNopPhiImpl.setId(tthcHinhThucNopPhi.getId());
		tthcHinhThucNopPhiImpl.setThuTucHanhChinhId(tthcHinhThucNopPhi.getThuTucHanhChinhId());
		tthcHinhThucNopPhiImpl.setDonViThucHienId(tthcHinhThucNopPhi.getDonViThucHienId());
		tthcHinhThucNopPhiImpl.setPhiNopBanDau(tthcHinhThucNopPhi.getPhiNopBanDau());
		tthcHinhThucNopPhiImpl.setChuyenKhoan(tthcHinhThucNopPhi.getChuyenKhoan());
		tthcHinhThucNopPhiImpl.setKeyPay(tthcHinhThucNopPhi.getKeyPay());

		return tthcHinhThucNopPhiImpl;
	}

	/**
	 * Returns the tthc hinh thuc nop phi with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc hinh thuc nop phi
	 * @return the tthc hinh thuc nop phi
	 * @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcHinhThucNopPhiException if a tthc hinh thuc nop phi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHinhThucNopPhi findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTthcHinhThucNopPhiException, SystemException {
		TthcHinhThucNopPhi tthcHinhThucNopPhi = fetchByPrimaryKey(primaryKey);

		if (tthcHinhThucNopPhi == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTthcHinhThucNopPhiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tthcHinhThucNopPhi;
	}

	/**
	 * Returns the tthc hinh thuc nop phi with the primary key or throws a {@link vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcHinhThucNopPhiException} if it could not be found.
	 *
	 * @param id the primary key of the tthc hinh thuc nop phi
	 * @return the tthc hinh thuc nop phi
	 * @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcHinhThucNopPhiException if a tthc hinh thuc nop phi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHinhThucNopPhi findByPrimaryKey(long id)
		throws NoSuchTthcHinhThucNopPhiException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the tthc hinh thuc nop phi with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc hinh thuc nop phi
	 * @return the tthc hinh thuc nop phi, or <code>null</code> if a tthc hinh thuc nop phi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHinhThucNopPhi fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TthcHinhThucNopPhi tthcHinhThucNopPhi = (TthcHinhThucNopPhi)EntityCacheUtil.getResult(TthcHinhThucNopPhiModelImpl.ENTITY_CACHE_ENABLED,
				TthcHinhThucNopPhiImpl.class, primaryKey);

		if (tthcHinhThucNopPhi == _nullTthcHinhThucNopPhi) {
			return null;
		}

		if (tthcHinhThucNopPhi == null) {
			Session session = null;

			try {
				session = openSession();

				tthcHinhThucNopPhi = (TthcHinhThucNopPhi)session.get(TthcHinhThucNopPhiImpl.class,
						primaryKey);

				if (tthcHinhThucNopPhi != null) {
					cacheResult(tthcHinhThucNopPhi);
				}
				else {
					EntityCacheUtil.putResult(TthcHinhThucNopPhiModelImpl.ENTITY_CACHE_ENABLED,
						TthcHinhThucNopPhiImpl.class, primaryKey,
						_nullTthcHinhThucNopPhi);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TthcHinhThucNopPhiModelImpl.ENTITY_CACHE_ENABLED,
					TthcHinhThucNopPhiImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tthcHinhThucNopPhi;
	}

	/**
	 * Returns the tthc hinh thuc nop phi with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the tthc hinh thuc nop phi
	 * @return the tthc hinh thuc nop phi, or <code>null</code> if a tthc hinh thuc nop phi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHinhThucNopPhi fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the tthc hinh thuc nop phis.
	 *
	 * @return the tthc hinh thuc nop phis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcHinhThucNopPhi> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc hinh thuc nop phis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcHinhThucNopPhiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc hinh thuc nop phis
	 * @param end the upper bound of the range of tthc hinh thuc nop phis (not inclusive)
	 * @return the range of tthc hinh thuc nop phis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcHinhThucNopPhi> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc hinh thuc nop phis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcHinhThucNopPhiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc hinh thuc nop phis
	 * @param end the upper bound of the range of tthc hinh thuc nop phis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tthc hinh thuc nop phis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcHinhThucNopPhi> findAll(int start, int end,
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

		List<TthcHinhThucNopPhi> list = (List<TthcHinhThucNopPhi>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TTHCHINHTHUCNOPPHI);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TTHCHINHTHUCNOPPHI;

				if (pagination) {
					sql = sql.concat(TthcHinhThucNopPhiModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TthcHinhThucNopPhi>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcHinhThucNopPhi>(list);
				}
				else {
					list = (List<TthcHinhThucNopPhi>)QueryUtil.list(q,
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
	 * Removes all the tthc hinh thuc nop phis from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TthcHinhThucNopPhi tthcHinhThucNopPhi : findAll()) {
			remove(tthcHinhThucNopPhi);
		}
	}

	/**
	 * Returns the number of tthc hinh thuc nop phis.
	 *
	 * @return the number of tthc hinh thuc nop phis
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

				Query q = session.createQuery(_SQL_COUNT_TTHCHINHTHUCNOPPHI);

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
	 * Initializes the tthc hinh thuc nop phi persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TthcHinhThucNopPhi>> listenersList = new ArrayList<ModelListener<TthcHinhThucNopPhi>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TthcHinhThucNopPhi>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TthcHinhThucNopPhiImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TTHCHINHTHUCNOPPHI = "SELECT tthcHinhThucNopPhi FROM TthcHinhThucNopPhi tthcHinhThucNopPhi";
	private static final String _SQL_SELECT_TTHCHINHTHUCNOPPHI_WHERE = "SELECT tthcHinhThucNopPhi FROM TthcHinhThucNopPhi tthcHinhThucNopPhi WHERE ";
	private static final String _SQL_COUNT_TTHCHINHTHUCNOPPHI = "SELECT COUNT(tthcHinhThucNopPhi) FROM TthcHinhThucNopPhi tthcHinhThucNopPhi";
	private static final String _SQL_COUNT_TTHCHINHTHUCNOPPHI_WHERE = "SELECT COUNT(tthcHinhThucNopPhi) FROM TthcHinhThucNopPhi tthcHinhThucNopPhi WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tthcHinhThucNopPhi.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TthcHinhThucNopPhi exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TthcHinhThucNopPhi exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TthcHinhThucNopPhiPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"thuTucHanhChinhId", "donViThucHienId", "phiNopBanDau",
				"chuyenKhoan", "keyPay"
			});
	private static TthcHinhThucNopPhi _nullTthcHinhThucNopPhi = new TthcHinhThucNopPhiImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TthcHinhThucNopPhi> toCacheModel() {
				return _nullTthcHinhThucNopPhiCacheModel;
			}
		};

	private static CacheModel<TthcHinhThucNopPhi> _nullTthcHinhThucNopPhiCacheModel =
		new CacheModel<TthcHinhThucNopPhi>() {
			@Override
			public TthcHinhThucNopPhi toEntityModel() {
				return _nullTthcHinhThucNopPhi;
			}
		};
}