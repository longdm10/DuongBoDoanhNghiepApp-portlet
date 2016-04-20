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
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinXuLyException;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy;
import vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinXuLyImpl;
import vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinXuLyModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the qlvt thong tin xu ly service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanNc
 * @see QlvtThongTinXuLyPersistence
 * @see QlvtThongTinXuLyUtil
 * @generated
 */
public class QlvtThongTinXuLyPersistenceImpl extends BasePersistenceImpl<QlvtThongTinXuLy>
	implements QlvtThongTinXuLyPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QlvtThongTinXuLyUtil} to access the qlvt thong tin xu ly persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QlvtThongTinXuLyImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QlvtThongTinXuLyModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinXuLyModelImpl.FINDER_CACHE_ENABLED,
			QlvtThongTinXuLyImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QlvtThongTinXuLyModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinXuLyModelImpl.FINDER_CACHE_ENABLED,
			QlvtThongTinXuLyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QlvtThongTinXuLyModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinXuLyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_THONGTINHOSOID = new FinderPath(QlvtThongTinXuLyModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinXuLyModelImpl.FINDER_CACHE_ENABLED,
			QlvtThongTinXuLyImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchBythongTinHoSoId", new String[] { Long.class.getName() },
			QlvtThongTinXuLyModelImpl.THONGTINHOSOID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_THONGTINHOSOID = new FinderPath(QlvtThongTinXuLyModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinXuLyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBythongTinHoSoId",
			new String[] { Long.class.getName() });

	/**
	 * Returns the qlvt thong tin xu ly where thongTinHoSoId = &#63; or throws a {@link vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinXuLyException} if it could not be found.
	 *
	 * @param thongTinHoSoId the thong tin ho so ID
	 * @return the matching qlvt thong tin xu ly
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinXuLyException if a matching qlvt thong tin xu ly could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinXuLy findBythongTinHoSoId(long thongTinHoSoId)
		throws NoSuchQlvtThongTinXuLyException, SystemException {
		QlvtThongTinXuLy qlvtThongTinXuLy = fetchBythongTinHoSoId(thongTinHoSoId);

		if (qlvtThongTinXuLy == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("thongTinHoSoId=");
			msg.append(thongTinHoSoId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchQlvtThongTinXuLyException(msg.toString());
		}

		return qlvtThongTinXuLy;
	}

	/**
	 * Returns the qlvt thong tin xu ly where thongTinHoSoId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param thongTinHoSoId the thong tin ho so ID
	 * @return the matching qlvt thong tin xu ly, or <code>null</code> if a matching qlvt thong tin xu ly could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinXuLy fetchBythongTinHoSoId(long thongTinHoSoId)
		throws SystemException {
		return fetchBythongTinHoSoId(thongTinHoSoId, true);
	}

	/**
	 * Returns the qlvt thong tin xu ly where thongTinHoSoId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param thongTinHoSoId the thong tin ho so ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching qlvt thong tin xu ly, or <code>null</code> if a matching qlvt thong tin xu ly could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinXuLy fetchBythongTinHoSoId(long thongTinHoSoId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { thongTinHoSoId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_THONGTINHOSOID,
					finderArgs, this);
		}

		if (result instanceof QlvtThongTinXuLy) {
			QlvtThongTinXuLy qlvtThongTinXuLy = (QlvtThongTinXuLy)result;

			if ((thongTinHoSoId != qlvtThongTinXuLy.getThongTinHoSoId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_QLVTTHONGTINXULY_WHERE);

			query.append(_FINDER_COLUMN_THONGTINHOSOID_THONGTINHOSOID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(thongTinHoSoId);

				List<QlvtThongTinXuLy> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THONGTINHOSOID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"QlvtThongTinXuLyPersistenceImpl.fetchBythongTinHoSoId(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					QlvtThongTinXuLy qlvtThongTinXuLy = list.get(0);

					result = qlvtThongTinXuLy;

					cacheResult(qlvtThongTinXuLy);

					if ((qlvtThongTinXuLy.getThongTinHoSoId() != thongTinHoSoId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THONGTINHOSOID,
							finderArgs, qlvtThongTinXuLy);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_THONGTINHOSOID,
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
			return (QlvtThongTinXuLy)result;
		}
	}

	/**
	 * Removes the qlvt thong tin xu ly where thongTinHoSoId = &#63; from the database.
	 *
	 * @param thongTinHoSoId the thong tin ho so ID
	 * @return the qlvt thong tin xu ly that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinXuLy removeBythongTinHoSoId(long thongTinHoSoId)
		throws NoSuchQlvtThongTinXuLyException, SystemException {
		QlvtThongTinXuLy qlvtThongTinXuLy = findBythongTinHoSoId(thongTinHoSoId);

		return remove(qlvtThongTinXuLy);
	}

	/**
	 * Returns the number of qlvt thong tin xu lies where thongTinHoSoId = &#63;.
	 *
	 * @param thongTinHoSoId the thong tin ho so ID
	 * @return the number of matching qlvt thong tin xu lies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBythongTinHoSoId(long thongTinHoSoId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_THONGTINHOSOID;

		Object[] finderArgs = new Object[] { thongTinHoSoId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_QLVTTHONGTINXULY_WHERE);

			query.append(_FINDER_COLUMN_THONGTINHOSOID_THONGTINHOSOID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(thongTinHoSoId);

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

	private static final String _FINDER_COLUMN_THONGTINHOSOID_THONGTINHOSOID_2 = "qlvtThongTinXuLy.thongTinHoSoId = ?";

	public QlvtThongTinXuLyPersistenceImpl() {
		setModelClass(QlvtThongTinXuLy.class);
	}

	/**
	 * Caches the qlvt thong tin xu ly in the entity cache if it is enabled.
	 *
	 * @param qlvtThongTinXuLy the qlvt thong tin xu ly
	 */
	@Override
	public void cacheResult(QlvtThongTinXuLy qlvtThongTinXuLy) {
		EntityCacheUtil.putResult(QlvtThongTinXuLyModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinXuLyImpl.class, qlvtThongTinXuLy.getPrimaryKey(),
			qlvtThongTinXuLy);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THONGTINHOSOID,
			new Object[] { qlvtThongTinXuLy.getThongTinHoSoId() },
			qlvtThongTinXuLy);

		qlvtThongTinXuLy.resetOriginalValues();
	}

	/**
	 * Caches the qlvt thong tin xu lies in the entity cache if it is enabled.
	 *
	 * @param qlvtThongTinXuLies the qlvt thong tin xu lies
	 */
	@Override
	public void cacheResult(List<QlvtThongTinXuLy> qlvtThongTinXuLies) {
		for (QlvtThongTinXuLy qlvtThongTinXuLy : qlvtThongTinXuLies) {
			if (EntityCacheUtil.getResult(
						QlvtThongTinXuLyModelImpl.ENTITY_CACHE_ENABLED,
						QlvtThongTinXuLyImpl.class,
						qlvtThongTinXuLy.getPrimaryKey()) == null) {
				cacheResult(qlvtThongTinXuLy);
			}
			else {
				qlvtThongTinXuLy.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qlvt thong tin xu lies.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QlvtThongTinXuLyImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QlvtThongTinXuLyImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qlvt thong tin xu ly.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QlvtThongTinXuLy qlvtThongTinXuLy) {
		EntityCacheUtil.removeResult(QlvtThongTinXuLyModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinXuLyImpl.class, qlvtThongTinXuLy.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(qlvtThongTinXuLy);
	}

	@Override
	public void clearCache(List<QlvtThongTinXuLy> qlvtThongTinXuLies) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QlvtThongTinXuLy qlvtThongTinXuLy : qlvtThongTinXuLies) {
			EntityCacheUtil.removeResult(QlvtThongTinXuLyModelImpl.ENTITY_CACHE_ENABLED,
				QlvtThongTinXuLyImpl.class, qlvtThongTinXuLy.getPrimaryKey());

			clearUniqueFindersCache(qlvtThongTinXuLy);
		}
	}

	protected void cacheUniqueFindersCache(QlvtThongTinXuLy qlvtThongTinXuLy) {
		if (qlvtThongTinXuLy.isNew()) {
			Object[] args = new Object[] { qlvtThongTinXuLy.getThongTinHoSoId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_THONGTINHOSOID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THONGTINHOSOID,
				args, qlvtThongTinXuLy);
		}
		else {
			QlvtThongTinXuLyModelImpl qlvtThongTinXuLyModelImpl = (QlvtThongTinXuLyModelImpl)qlvtThongTinXuLy;

			if ((qlvtThongTinXuLyModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_THONGTINHOSOID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						qlvtThongTinXuLy.getThongTinHoSoId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_THONGTINHOSOID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THONGTINHOSOID,
					args, qlvtThongTinXuLy);
			}
		}
	}

	protected void clearUniqueFindersCache(QlvtThongTinXuLy qlvtThongTinXuLy) {
		QlvtThongTinXuLyModelImpl qlvtThongTinXuLyModelImpl = (QlvtThongTinXuLyModelImpl)qlvtThongTinXuLy;

		Object[] args = new Object[] { qlvtThongTinXuLy.getThongTinHoSoId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_THONGTINHOSOID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_THONGTINHOSOID, args);

		if ((qlvtThongTinXuLyModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_THONGTINHOSOID.getColumnBitmask()) != 0) {
			args = new Object[] {
					qlvtThongTinXuLyModelImpl.getOriginalThongTinHoSoId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_THONGTINHOSOID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_THONGTINHOSOID,
				args);
		}
	}

	/**
	 * Creates a new qlvt thong tin xu ly with the primary key. Does not add the qlvt thong tin xu ly to the database.
	 *
	 * @param id the primary key for the new qlvt thong tin xu ly
	 * @return the new qlvt thong tin xu ly
	 */
	@Override
	public QlvtThongTinXuLy create(long id) {
		QlvtThongTinXuLy qlvtThongTinXuLy = new QlvtThongTinXuLyImpl();

		qlvtThongTinXuLy.setNew(true);
		qlvtThongTinXuLy.setPrimaryKey(id);

		return qlvtThongTinXuLy;
	}

	/**
	 * Removes the qlvt thong tin xu ly with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the qlvt thong tin xu ly
	 * @return the qlvt thong tin xu ly that was removed
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinXuLyException if a qlvt thong tin xu ly with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinXuLy remove(long id)
		throws NoSuchQlvtThongTinXuLyException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the qlvt thong tin xu ly with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qlvt thong tin xu ly
	 * @return the qlvt thong tin xu ly that was removed
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinXuLyException if a qlvt thong tin xu ly with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinXuLy remove(Serializable primaryKey)
		throws NoSuchQlvtThongTinXuLyException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QlvtThongTinXuLy qlvtThongTinXuLy = (QlvtThongTinXuLy)session.get(QlvtThongTinXuLyImpl.class,
					primaryKey);

			if (qlvtThongTinXuLy == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQlvtThongTinXuLyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtThongTinXuLy);
		}
		catch (NoSuchQlvtThongTinXuLyException nsee) {
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
	protected QlvtThongTinXuLy removeImpl(QlvtThongTinXuLy qlvtThongTinXuLy)
		throws SystemException {
		qlvtThongTinXuLy = toUnwrappedModel(qlvtThongTinXuLy);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtThongTinXuLy)) {
				qlvtThongTinXuLy = (QlvtThongTinXuLy)session.get(QlvtThongTinXuLyImpl.class,
						qlvtThongTinXuLy.getPrimaryKeyObj());
			}

			if (qlvtThongTinXuLy != null) {
				session.delete(qlvtThongTinXuLy);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtThongTinXuLy != null) {
			clearCache(qlvtThongTinXuLy);
		}

		return qlvtThongTinXuLy;
	}

	@Override
	public QlvtThongTinXuLy updateImpl(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy qlvtThongTinXuLy)
		throws SystemException {
		qlvtThongTinXuLy = toUnwrappedModel(qlvtThongTinXuLy);

		boolean isNew = qlvtThongTinXuLy.isNew();

		Session session = null;

		try {
			session = openSession();

			if (qlvtThongTinXuLy.isNew()) {
				session.save(qlvtThongTinXuLy);

				qlvtThongTinXuLy.setNew(false);
			}
			else {
				session.merge(qlvtThongTinXuLy);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !QlvtThongTinXuLyModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(QlvtThongTinXuLyModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinXuLyImpl.class, qlvtThongTinXuLy.getPrimaryKey(),
			qlvtThongTinXuLy);

		clearUniqueFindersCache(qlvtThongTinXuLy);
		cacheUniqueFindersCache(qlvtThongTinXuLy);

		return qlvtThongTinXuLy;
	}

	protected QlvtThongTinXuLy toUnwrappedModel(
		QlvtThongTinXuLy qlvtThongTinXuLy) {
		if (qlvtThongTinXuLy instanceof QlvtThongTinXuLyImpl) {
			return qlvtThongTinXuLy;
		}

		QlvtThongTinXuLyImpl qlvtThongTinXuLyImpl = new QlvtThongTinXuLyImpl();

		qlvtThongTinXuLyImpl.setNew(qlvtThongTinXuLy.isNew());
		qlvtThongTinXuLyImpl.setPrimaryKey(qlvtThongTinXuLy.getPrimaryKey());

		qlvtThongTinXuLyImpl.setId(qlvtThongTinXuLy.getId());
		qlvtThongTinXuLyImpl.setKetQuaXuLy(qlvtThongTinXuLy.getKetQuaXuLy());
		qlvtThongTinXuLyImpl.setThongTinHoSoId(qlvtThongTinXuLy.getThongTinHoSoId());
		qlvtThongTinXuLyImpl.setMaSoHoSo(qlvtThongTinXuLy.getMaSoHoSo());
		qlvtThongTinXuLyImpl.setCanBoXuLy(qlvtThongTinXuLy.getCanBoXuLy());
		qlvtThongTinXuLyImpl.setThoiGianXuLy(qlvtThongTinXuLy.getThoiGianXuLy());
		qlvtThongTinXuLyImpl.setYKienCanBoXuLy(qlvtThongTinXuLy.getYKienCanBoXuLy());
		qlvtThongTinXuLyImpl.setLanhDaoDuyet(qlvtThongTinXuLy.getLanhDaoDuyet());
		qlvtThongTinXuLyImpl.setYKienLanhDaoDuyet(qlvtThongTinXuLy.getYKienLanhDaoDuyet());
		qlvtThongTinXuLyImpl.setThoiGianDuyet(qlvtThongTinXuLy.getThoiGianDuyet());
		qlvtThongTinXuLyImpl.setKetQuaDuyet(qlvtThongTinXuLy.getKetQuaDuyet());
		qlvtThongTinXuLyImpl.setLanhDaoPheDuyet(qlvtThongTinXuLy.getLanhDaoPheDuyet());
		qlvtThongTinXuLyImpl.setThoiGianPheDuyet(qlvtThongTinXuLy.getThoiGianPheDuyet());
		qlvtThongTinXuLyImpl.setKetQuaPheDuyet(qlvtThongTinXuLy.getKetQuaPheDuyet());
		qlvtThongTinXuLyImpl.setYKienLanhDaoPheDuyet(qlvtThongTinXuLy.getYKienLanhDaoPheDuyet());
		qlvtThongTinXuLyImpl.setNguoiTraKetQua(qlvtThongTinXuLy.getNguoiTraKetQua());
		qlvtThongTinXuLyImpl.setThoiGianTraKetQua(qlvtThongTinXuLy.getThoiGianTraKetQua());
		qlvtThongTinXuLyImpl.setThoiGianCapPhep(qlvtThongTinXuLy.getThoiGianCapPhep());
		qlvtThongTinXuLyImpl.setKetQuaThamDinhXML(qlvtThongTinXuLy.getKetQuaThamDinhXML());

		return qlvtThongTinXuLyImpl;
	}

	/**
	 * Returns the qlvt thong tin xu ly with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt thong tin xu ly
	 * @return the qlvt thong tin xu ly
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinXuLyException if a qlvt thong tin xu ly with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinXuLy findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQlvtThongTinXuLyException, SystemException {
		QlvtThongTinXuLy qlvtThongTinXuLy = fetchByPrimaryKey(primaryKey);

		if (qlvtThongTinXuLy == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQlvtThongTinXuLyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtThongTinXuLy;
	}

	/**
	 * Returns the qlvt thong tin xu ly with the primary key or throws a {@link vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinXuLyException} if it could not be found.
	 *
	 * @param id the primary key of the qlvt thong tin xu ly
	 * @return the qlvt thong tin xu ly
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinXuLyException if a qlvt thong tin xu ly with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinXuLy findByPrimaryKey(long id)
		throws NoSuchQlvtThongTinXuLyException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the qlvt thong tin xu ly with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt thong tin xu ly
	 * @return the qlvt thong tin xu ly, or <code>null</code> if a qlvt thong tin xu ly with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinXuLy fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QlvtThongTinXuLy qlvtThongTinXuLy = (QlvtThongTinXuLy)EntityCacheUtil.getResult(QlvtThongTinXuLyModelImpl.ENTITY_CACHE_ENABLED,
				QlvtThongTinXuLyImpl.class, primaryKey);

		if (qlvtThongTinXuLy == _nullQlvtThongTinXuLy) {
			return null;
		}

		if (qlvtThongTinXuLy == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtThongTinXuLy = (QlvtThongTinXuLy)session.get(QlvtThongTinXuLyImpl.class,
						primaryKey);

				if (qlvtThongTinXuLy != null) {
					cacheResult(qlvtThongTinXuLy);
				}
				else {
					EntityCacheUtil.putResult(QlvtThongTinXuLyModelImpl.ENTITY_CACHE_ENABLED,
						QlvtThongTinXuLyImpl.class, primaryKey,
						_nullQlvtThongTinXuLy);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QlvtThongTinXuLyModelImpl.ENTITY_CACHE_ENABLED,
					QlvtThongTinXuLyImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtThongTinXuLy;
	}

	/**
	 * Returns the qlvt thong tin xu ly with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the qlvt thong tin xu ly
	 * @return the qlvt thong tin xu ly, or <code>null</code> if a qlvt thong tin xu ly with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinXuLy fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the qlvt thong tin xu lies.
	 *
	 * @return the qlvt thong tin xu lies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtThongTinXuLy> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt thong tin xu lies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt thong tin xu lies
	 * @param end the upper bound of the range of qlvt thong tin xu lies (not inclusive)
	 * @return the range of qlvt thong tin xu lies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtThongTinXuLy> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt thong tin xu lies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt thong tin xu lies
	 * @param end the upper bound of the range of qlvt thong tin xu lies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qlvt thong tin xu lies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtThongTinXuLy> findAll(int start, int end,
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

		List<QlvtThongTinXuLy> list = (List<QlvtThongTinXuLy>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTTHONGTINXULY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTTHONGTINXULY;

				if (pagination) {
					sql = sql.concat(QlvtThongTinXuLyModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QlvtThongTinXuLy>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtThongTinXuLy>(list);
				}
				else {
					list = (List<QlvtThongTinXuLy>)QueryUtil.list(q,
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
	 * Removes all the qlvt thong tin xu lies from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QlvtThongTinXuLy qlvtThongTinXuLy : findAll()) {
			remove(qlvtThongTinXuLy);
		}
	}

	/**
	 * Returns the number of qlvt thong tin xu lies.
	 *
	 * @return the number of qlvt thong tin xu lies
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

				Query q = session.createQuery(_SQL_COUNT_QLVTTHONGTINXULY);

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
	 * Initializes the qlvt thong tin xu ly persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QlvtThongTinXuLy>> listenersList = new ArrayList<ModelListener<QlvtThongTinXuLy>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QlvtThongTinXuLy>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QlvtThongTinXuLyImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTTHONGTINXULY = "SELECT qlvtThongTinXuLy FROM QlvtThongTinXuLy qlvtThongTinXuLy";
	private static final String _SQL_SELECT_QLVTTHONGTINXULY_WHERE = "SELECT qlvtThongTinXuLy FROM QlvtThongTinXuLy qlvtThongTinXuLy WHERE ";
	private static final String _SQL_COUNT_QLVTTHONGTINXULY = "SELECT COUNT(qlvtThongTinXuLy) FROM QlvtThongTinXuLy qlvtThongTinXuLy";
	private static final String _SQL_COUNT_QLVTTHONGTINXULY_WHERE = "SELECT COUNT(qlvtThongTinXuLy) FROM QlvtThongTinXuLy qlvtThongTinXuLy WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtThongTinXuLy.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QlvtThongTinXuLy exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No QlvtThongTinXuLy exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QlvtThongTinXuLyPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"ketQuaXuLy", "thongTinHoSoId", "maSoHoSo", "canBoXuLy",
				"thoiGianXuLy", "yKienCanBoXuLy", "lanhDaoDuyet",
				"yKienLanhDaoDuyet", "thoiGianDuyet", "ketQuaDuyet",
				"lanhDaoPheDuyet", "thoiGianPheDuyet", "ketQuaPheDuyet",
				"yKienLanhDaoPheDuyet", "nguoiTraKetQua", "thoiGianTraKetQua",
				"thoiGianCapPhep", "ketQuaThamDinhXML"
			});
	private static QlvtThongTinXuLy _nullQlvtThongTinXuLy = new QlvtThongTinXuLyImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QlvtThongTinXuLy> toCacheModel() {
				return _nullQlvtThongTinXuLyCacheModel;
			}
		};

	private static CacheModel<QlvtThongTinXuLy> _nullQlvtThongTinXuLyCacheModel = new CacheModel<QlvtThongTinXuLy>() {
			@Override
			public QlvtThongTinXuLy toEntityModel() {
				return _nullQlvtThongTinXuLy;
			}
		};
}