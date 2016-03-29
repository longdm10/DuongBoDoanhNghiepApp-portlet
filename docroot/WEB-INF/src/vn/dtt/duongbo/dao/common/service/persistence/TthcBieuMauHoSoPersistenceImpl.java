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

import vn.dtt.duongbo.dao.common.NoSuchTthcBieuMauHoSoException;
import vn.dtt.duongbo.dao.common.model.TthcBieuMauHoSo;
import vn.dtt.duongbo.dao.common.model.impl.TthcBieuMauHoSoImpl;
import vn.dtt.duongbo.dao.common.model.impl.TthcBieuMauHoSoModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the tthc bieu mau ho so service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcBieuMauHoSoPersistence
 * @see TthcBieuMauHoSoUtil
 * @generated
 */
public class TthcBieuMauHoSoPersistenceImpl extends BasePersistenceImpl<TthcBieuMauHoSo>
	implements TthcBieuMauHoSoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TthcBieuMauHoSoUtil} to access the tthc bieu mau ho so persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TthcBieuMauHoSoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TthcBieuMauHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcBieuMauHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcBieuMauHoSoImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TthcBieuMauHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcBieuMauHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcBieuMauHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TthcBieuMauHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcBieuMauHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_MABIEUMAU = new FinderPath(TthcBieuMauHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcBieuMauHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcBieuMauHoSoImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByMaBieuMau", new String[] { String.class.getName() },
			TthcBieuMauHoSoModelImpl.MABIEUMAU_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MABIEUMAU = new FinderPath(TthcBieuMauHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcBieuMauHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMaBieuMau",
			new String[] { String.class.getName() });

	/**
	 * Returns the tthc bieu mau ho so where maBieuMau = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcBieuMauHoSoException} if it could not be found.
	 *
	 * @param maBieuMau the ma bieu mau
	 * @return the matching tthc bieu mau ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcBieuMauHoSoException if a matching tthc bieu mau ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcBieuMauHoSo findByMaBieuMau(String maBieuMau)
		throws NoSuchTthcBieuMauHoSoException, SystemException {
		TthcBieuMauHoSo tthcBieuMauHoSo = fetchByMaBieuMau(maBieuMau);

		if (tthcBieuMauHoSo == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("maBieuMau=");
			msg.append(maBieuMau);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchTthcBieuMauHoSoException(msg.toString());
		}

		return tthcBieuMauHoSo;
	}

	/**
	 * Returns the tthc bieu mau ho so where maBieuMau = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param maBieuMau the ma bieu mau
	 * @return the matching tthc bieu mau ho so, or <code>null</code> if a matching tthc bieu mau ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcBieuMauHoSo fetchByMaBieuMau(String maBieuMau)
		throws SystemException {
		return fetchByMaBieuMau(maBieuMau, true);
	}

	/**
	 * Returns the tthc bieu mau ho so where maBieuMau = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param maBieuMau the ma bieu mau
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching tthc bieu mau ho so, or <code>null</code> if a matching tthc bieu mau ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcBieuMauHoSo fetchByMaBieuMau(String maBieuMau,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { maBieuMau };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_MABIEUMAU,
					finderArgs, this);
		}

		if (result instanceof TthcBieuMauHoSo) {
			TthcBieuMauHoSo tthcBieuMauHoSo = (TthcBieuMauHoSo)result;

			if (!Validator.equals(maBieuMau, tthcBieuMauHoSo.getMaBieuMau())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_TTHCBIEUMAUHOSO_WHERE);

			boolean bindMaBieuMau = false;

			if (maBieuMau == null) {
				query.append(_FINDER_COLUMN_MABIEUMAU_MABIEUMAU_1);
			}
			else if (maBieuMau.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MABIEUMAU_MABIEUMAU_3);
			}
			else {
				bindMaBieuMau = true;

				query.append(_FINDER_COLUMN_MABIEUMAU_MABIEUMAU_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaBieuMau) {
					qPos.add(maBieuMau);
				}

				List<TthcBieuMauHoSo> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MABIEUMAU,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"TthcBieuMauHoSoPersistenceImpl.fetchByMaBieuMau(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					TthcBieuMauHoSo tthcBieuMauHoSo = list.get(0);

					result = tthcBieuMauHoSo;

					cacheResult(tthcBieuMauHoSo);

					if ((tthcBieuMauHoSo.getMaBieuMau() == null) ||
							!tthcBieuMauHoSo.getMaBieuMau().equals(maBieuMau)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MABIEUMAU,
							finderArgs, tthcBieuMauHoSo);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MABIEUMAU,
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
			return (TthcBieuMauHoSo)result;
		}
	}

	/**
	 * Removes the tthc bieu mau ho so where maBieuMau = &#63; from the database.
	 *
	 * @param maBieuMau the ma bieu mau
	 * @return the tthc bieu mau ho so that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcBieuMauHoSo removeByMaBieuMau(String maBieuMau)
		throws NoSuchTthcBieuMauHoSoException, SystemException {
		TthcBieuMauHoSo tthcBieuMauHoSo = findByMaBieuMau(maBieuMau);

		return remove(tthcBieuMauHoSo);
	}

	/**
	 * Returns the number of tthc bieu mau ho sos where maBieuMau = &#63;.
	 *
	 * @param maBieuMau the ma bieu mau
	 * @return the number of matching tthc bieu mau ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByMaBieuMau(String maBieuMau) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MABIEUMAU;

		Object[] finderArgs = new Object[] { maBieuMau };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TTHCBIEUMAUHOSO_WHERE);

			boolean bindMaBieuMau = false;

			if (maBieuMau == null) {
				query.append(_FINDER_COLUMN_MABIEUMAU_MABIEUMAU_1);
			}
			else if (maBieuMau.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MABIEUMAU_MABIEUMAU_3);
			}
			else {
				bindMaBieuMau = true;

				query.append(_FINDER_COLUMN_MABIEUMAU_MABIEUMAU_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaBieuMau) {
					qPos.add(maBieuMau);
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

	private static final String _FINDER_COLUMN_MABIEUMAU_MABIEUMAU_1 = "tthcBieuMauHoSo.maBieuMau IS NULL";
	private static final String _FINDER_COLUMN_MABIEUMAU_MABIEUMAU_2 = "tthcBieuMauHoSo.maBieuMau = ?";
	private static final String _FINDER_COLUMN_MABIEUMAU_MABIEUMAU_3 = "(tthcBieuMauHoSo.maBieuMau IS NULL OR tthcBieuMauHoSo.maBieuMau = '')";

	public TthcBieuMauHoSoPersistenceImpl() {
		setModelClass(TthcBieuMauHoSo.class);
	}

	/**
	 * Caches the tthc bieu mau ho so in the entity cache if it is enabled.
	 *
	 * @param tthcBieuMauHoSo the tthc bieu mau ho so
	 */
	@Override
	public void cacheResult(TthcBieuMauHoSo tthcBieuMauHoSo) {
		EntityCacheUtil.putResult(TthcBieuMauHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcBieuMauHoSoImpl.class, tthcBieuMauHoSo.getPrimaryKey(),
			tthcBieuMauHoSo);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MABIEUMAU,
			new Object[] { tthcBieuMauHoSo.getMaBieuMau() }, tthcBieuMauHoSo);

		tthcBieuMauHoSo.resetOriginalValues();
	}

	/**
	 * Caches the tthc bieu mau ho sos in the entity cache if it is enabled.
	 *
	 * @param tthcBieuMauHoSos the tthc bieu mau ho sos
	 */
	@Override
	public void cacheResult(List<TthcBieuMauHoSo> tthcBieuMauHoSos) {
		for (TthcBieuMauHoSo tthcBieuMauHoSo : tthcBieuMauHoSos) {
			if (EntityCacheUtil.getResult(
						TthcBieuMauHoSoModelImpl.ENTITY_CACHE_ENABLED,
						TthcBieuMauHoSoImpl.class,
						tthcBieuMauHoSo.getPrimaryKey()) == null) {
				cacheResult(tthcBieuMauHoSo);
			}
			else {
				tthcBieuMauHoSo.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tthc bieu mau ho sos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TthcBieuMauHoSoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TthcBieuMauHoSoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tthc bieu mau ho so.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TthcBieuMauHoSo tthcBieuMauHoSo) {
		EntityCacheUtil.removeResult(TthcBieuMauHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcBieuMauHoSoImpl.class, tthcBieuMauHoSo.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(tthcBieuMauHoSo);
	}

	@Override
	public void clearCache(List<TthcBieuMauHoSo> tthcBieuMauHoSos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TthcBieuMauHoSo tthcBieuMauHoSo : tthcBieuMauHoSos) {
			EntityCacheUtil.removeResult(TthcBieuMauHoSoModelImpl.ENTITY_CACHE_ENABLED,
				TthcBieuMauHoSoImpl.class, tthcBieuMauHoSo.getPrimaryKey());

			clearUniqueFindersCache(tthcBieuMauHoSo);
		}
	}

	protected void cacheUniqueFindersCache(TthcBieuMauHoSo tthcBieuMauHoSo) {
		if (tthcBieuMauHoSo.isNew()) {
			Object[] args = new Object[] { tthcBieuMauHoSo.getMaBieuMau() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MABIEUMAU, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MABIEUMAU, args,
				tthcBieuMauHoSo);
		}
		else {
			TthcBieuMauHoSoModelImpl tthcBieuMauHoSoModelImpl = (TthcBieuMauHoSoModelImpl)tthcBieuMauHoSo;

			if ((tthcBieuMauHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_MABIEUMAU.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { tthcBieuMauHoSo.getMaBieuMau() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MABIEUMAU, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MABIEUMAU, args,
					tthcBieuMauHoSo);
			}
		}
	}

	protected void clearUniqueFindersCache(TthcBieuMauHoSo tthcBieuMauHoSo) {
		TthcBieuMauHoSoModelImpl tthcBieuMauHoSoModelImpl = (TthcBieuMauHoSoModelImpl)tthcBieuMauHoSo;

		Object[] args = new Object[] { tthcBieuMauHoSo.getMaBieuMau() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MABIEUMAU, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MABIEUMAU, args);

		if ((tthcBieuMauHoSoModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_MABIEUMAU.getColumnBitmask()) != 0) {
			args = new Object[] { tthcBieuMauHoSoModelImpl.getOriginalMaBieuMau() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MABIEUMAU, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MABIEUMAU, args);
		}
	}

	/**
	 * Creates a new tthc bieu mau ho so with the primary key. Does not add the tthc bieu mau ho so to the database.
	 *
	 * @param id the primary key for the new tthc bieu mau ho so
	 * @return the new tthc bieu mau ho so
	 */
	@Override
	public TthcBieuMauHoSo create(long id) {
		TthcBieuMauHoSo tthcBieuMauHoSo = new TthcBieuMauHoSoImpl();

		tthcBieuMauHoSo.setNew(true);
		tthcBieuMauHoSo.setPrimaryKey(id);

		return tthcBieuMauHoSo;
	}

	/**
	 * Removes the tthc bieu mau ho so with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the tthc bieu mau ho so
	 * @return the tthc bieu mau ho so that was removed
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcBieuMauHoSoException if a tthc bieu mau ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcBieuMauHoSo remove(long id)
		throws NoSuchTthcBieuMauHoSoException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the tthc bieu mau ho so with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tthc bieu mau ho so
	 * @return the tthc bieu mau ho so that was removed
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcBieuMauHoSoException if a tthc bieu mau ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcBieuMauHoSo remove(Serializable primaryKey)
		throws NoSuchTthcBieuMauHoSoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TthcBieuMauHoSo tthcBieuMauHoSo = (TthcBieuMauHoSo)session.get(TthcBieuMauHoSoImpl.class,
					primaryKey);

			if (tthcBieuMauHoSo == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTthcBieuMauHoSoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tthcBieuMauHoSo);
		}
		catch (NoSuchTthcBieuMauHoSoException nsee) {
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
	protected TthcBieuMauHoSo removeImpl(TthcBieuMauHoSo tthcBieuMauHoSo)
		throws SystemException {
		tthcBieuMauHoSo = toUnwrappedModel(tthcBieuMauHoSo);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tthcBieuMauHoSo)) {
				tthcBieuMauHoSo = (TthcBieuMauHoSo)session.get(TthcBieuMauHoSoImpl.class,
						tthcBieuMauHoSo.getPrimaryKeyObj());
			}

			if (tthcBieuMauHoSo != null) {
				session.delete(tthcBieuMauHoSo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tthcBieuMauHoSo != null) {
			clearCache(tthcBieuMauHoSo);
		}

		return tthcBieuMauHoSo;
	}

	@Override
	public TthcBieuMauHoSo updateImpl(
		vn.dtt.duongbo.dao.common.model.TthcBieuMauHoSo tthcBieuMauHoSo)
		throws SystemException {
		tthcBieuMauHoSo = toUnwrappedModel(tthcBieuMauHoSo);

		boolean isNew = tthcBieuMauHoSo.isNew();

		Session session = null;

		try {
			session = openSession();

			if (tthcBieuMauHoSo.isNew()) {
				session.save(tthcBieuMauHoSo);

				tthcBieuMauHoSo.setNew(false);
			}
			else {
				session.merge(tthcBieuMauHoSo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TthcBieuMauHoSoModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(TthcBieuMauHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcBieuMauHoSoImpl.class, tthcBieuMauHoSo.getPrimaryKey(),
			tthcBieuMauHoSo);

		clearUniqueFindersCache(tthcBieuMauHoSo);
		cacheUniqueFindersCache(tthcBieuMauHoSo);

		return tthcBieuMauHoSo;
	}

	protected TthcBieuMauHoSo toUnwrappedModel(TthcBieuMauHoSo tthcBieuMauHoSo) {
		if (tthcBieuMauHoSo instanceof TthcBieuMauHoSoImpl) {
			return tthcBieuMauHoSo;
		}

		TthcBieuMauHoSoImpl tthcBieuMauHoSoImpl = new TthcBieuMauHoSoImpl();

		tthcBieuMauHoSoImpl.setNew(tthcBieuMauHoSo.isNew());
		tthcBieuMauHoSoImpl.setPrimaryKey(tthcBieuMauHoSo.getPrimaryKey());

		tthcBieuMauHoSoImpl.setId(tthcBieuMauHoSo.getId());
		tthcBieuMauHoSoImpl.setMaBieuMau(tthcBieuMauHoSo.getMaBieuMau());
		tthcBieuMauHoSoImpl.setTenBieuMau(tthcBieuMauHoSo.getTenBieuMau());
		tthcBieuMauHoSoImpl.setTenTiengAnh(tthcBieuMauHoSo.getTenTiengAnh());
		tthcBieuMauHoSoImpl.setTaiLieuMau(tthcBieuMauHoSo.getTaiLieuMau());

		return tthcBieuMauHoSoImpl;
	}

	/**
	 * Returns the tthc bieu mau ho so with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc bieu mau ho so
	 * @return the tthc bieu mau ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcBieuMauHoSoException if a tthc bieu mau ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcBieuMauHoSo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTthcBieuMauHoSoException, SystemException {
		TthcBieuMauHoSo tthcBieuMauHoSo = fetchByPrimaryKey(primaryKey);

		if (tthcBieuMauHoSo == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTthcBieuMauHoSoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tthcBieuMauHoSo;
	}

	/**
	 * Returns the tthc bieu mau ho so with the primary key or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcBieuMauHoSoException} if it could not be found.
	 *
	 * @param id the primary key of the tthc bieu mau ho so
	 * @return the tthc bieu mau ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcBieuMauHoSoException if a tthc bieu mau ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcBieuMauHoSo findByPrimaryKey(long id)
		throws NoSuchTthcBieuMauHoSoException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the tthc bieu mau ho so with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc bieu mau ho so
	 * @return the tthc bieu mau ho so, or <code>null</code> if a tthc bieu mau ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcBieuMauHoSo fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TthcBieuMauHoSo tthcBieuMauHoSo = (TthcBieuMauHoSo)EntityCacheUtil.getResult(TthcBieuMauHoSoModelImpl.ENTITY_CACHE_ENABLED,
				TthcBieuMauHoSoImpl.class, primaryKey);

		if (tthcBieuMauHoSo == _nullTthcBieuMauHoSo) {
			return null;
		}

		if (tthcBieuMauHoSo == null) {
			Session session = null;

			try {
				session = openSession();

				tthcBieuMauHoSo = (TthcBieuMauHoSo)session.get(TthcBieuMauHoSoImpl.class,
						primaryKey);

				if (tthcBieuMauHoSo != null) {
					cacheResult(tthcBieuMauHoSo);
				}
				else {
					EntityCacheUtil.putResult(TthcBieuMauHoSoModelImpl.ENTITY_CACHE_ENABLED,
						TthcBieuMauHoSoImpl.class, primaryKey,
						_nullTthcBieuMauHoSo);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TthcBieuMauHoSoModelImpl.ENTITY_CACHE_ENABLED,
					TthcBieuMauHoSoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tthcBieuMauHoSo;
	}

	/**
	 * Returns the tthc bieu mau ho so with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the tthc bieu mau ho so
	 * @return the tthc bieu mau ho so, or <code>null</code> if a tthc bieu mau ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcBieuMauHoSo fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the tthc bieu mau ho sos.
	 *
	 * @return the tthc bieu mau ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcBieuMauHoSo> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc bieu mau ho sos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcBieuMauHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc bieu mau ho sos
	 * @param end the upper bound of the range of tthc bieu mau ho sos (not inclusive)
	 * @return the range of tthc bieu mau ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcBieuMauHoSo> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc bieu mau ho sos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcBieuMauHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc bieu mau ho sos
	 * @param end the upper bound of the range of tthc bieu mau ho sos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tthc bieu mau ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcBieuMauHoSo> findAll(int start, int end,
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

		List<TthcBieuMauHoSo> list = (List<TthcBieuMauHoSo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TTHCBIEUMAUHOSO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TTHCBIEUMAUHOSO;

				if (pagination) {
					sql = sql.concat(TthcBieuMauHoSoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TthcBieuMauHoSo>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcBieuMauHoSo>(list);
				}
				else {
					list = (List<TthcBieuMauHoSo>)QueryUtil.list(q,
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
	 * Removes all the tthc bieu mau ho sos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TthcBieuMauHoSo tthcBieuMauHoSo : findAll()) {
			remove(tthcBieuMauHoSo);
		}
	}

	/**
	 * Returns the number of tthc bieu mau ho sos.
	 *
	 * @return the number of tthc bieu mau ho sos
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

				Query q = session.createQuery(_SQL_COUNT_TTHCBIEUMAUHOSO);

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
	 * Initializes the tthc bieu mau ho so persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.common.model.TthcBieuMauHoSo")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TthcBieuMauHoSo>> listenersList = new ArrayList<ModelListener<TthcBieuMauHoSo>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TthcBieuMauHoSo>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TthcBieuMauHoSoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TTHCBIEUMAUHOSO = "SELECT tthcBieuMauHoSo FROM TthcBieuMauHoSo tthcBieuMauHoSo";
	private static final String _SQL_SELECT_TTHCBIEUMAUHOSO_WHERE = "SELECT tthcBieuMauHoSo FROM TthcBieuMauHoSo tthcBieuMauHoSo WHERE ";
	private static final String _SQL_COUNT_TTHCBIEUMAUHOSO = "SELECT COUNT(tthcBieuMauHoSo) FROM TthcBieuMauHoSo tthcBieuMauHoSo";
	private static final String _SQL_COUNT_TTHCBIEUMAUHOSO_WHERE = "SELECT COUNT(tthcBieuMauHoSo) FROM TthcBieuMauHoSo tthcBieuMauHoSo WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tthcBieuMauHoSo.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TthcBieuMauHoSo exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TthcBieuMauHoSo exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TthcBieuMauHoSoPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"maBieuMau", "tenBieuMau", "tenTiengAnh", "taiLieuMau"
			});
	private static TthcBieuMauHoSo _nullTthcBieuMauHoSo = new TthcBieuMauHoSoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TthcBieuMauHoSo> toCacheModel() {
				return _nullTthcBieuMauHoSoCacheModel;
			}
		};

	private static CacheModel<TthcBieuMauHoSo> _nullTthcBieuMauHoSoCacheModel = new CacheModel<TthcBieuMauHoSo>() {
			@Override
			public TthcBieuMauHoSo toEntityModel() {
				return _nullTthcBieuMauHoSo;
			}
		};
}