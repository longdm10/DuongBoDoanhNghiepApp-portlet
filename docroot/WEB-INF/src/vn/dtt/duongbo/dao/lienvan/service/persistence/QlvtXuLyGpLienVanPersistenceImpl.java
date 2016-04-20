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

package vn.dtt.duongbo.dao.lienvan.service.persistence;

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

import vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanException;
import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVan;
import vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanImpl;
import vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the qlvt xu ly gp lien van service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanNc
 * @see QlvtXuLyGpLienVanPersistence
 * @see QlvtXuLyGpLienVanUtil
 * @generated
 */
public class QlvtXuLyGpLienVanPersistenceImpl extends BasePersistenceImpl<QlvtXuLyGpLienVan>
	implements QlvtXuLyGpLienVanPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QlvtXuLyGpLienVanUtil} to access the qlvt xu ly gp lien van persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QlvtXuLyGpLienVanImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QlvtXuLyGpLienVanModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanModelImpl.FINDER_CACHE_ENABLED,
			QlvtXuLyGpLienVanImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QlvtXuLyGpLienVanModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanModelImpl.FINDER_CACHE_ENABLED,
			QlvtXuLyGpLienVanImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QlvtXuLyGpLienVanModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_THONGTINXULYID = new FinderPath(QlvtXuLyGpLienVanModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanModelImpl.FINDER_CACHE_ENABLED,
			QlvtXuLyGpLienVanImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchBythongTinXuLyId", new String[] { Long.class.getName() },
			QlvtXuLyGpLienVanModelImpl.THONGTINXULYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_THONGTINXULYID = new FinderPath(QlvtXuLyGpLienVanModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBythongTinXuLyId",
			new String[] { Long.class.getName() });

	/**
	 * Returns the qlvt xu ly gp lien van where thongTinXuLyId = &#63; or throws a {@link vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanException} if it could not be found.
	 *
	 * @param thongTinXuLyId the thong tin xu ly ID
	 * @return the matching qlvt xu ly gp lien van
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanException if a matching qlvt xu ly gp lien van could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVan findBythongTinXuLyId(long thongTinXuLyId)
		throws NoSuchQlvtXuLyGpLienVanException, SystemException {
		QlvtXuLyGpLienVan qlvtXuLyGpLienVan = fetchBythongTinXuLyId(thongTinXuLyId);

		if (qlvtXuLyGpLienVan == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("thongTinXuLyId=");
			msg.append(thongTinXuLyId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchQlvtXuLyGpLienVanException(msg.toString());
		}

		return qlvtXuLyGpLienVan;
	}

	/**
	 * Returns the qlvt xu ly gp lien van where thongTinXuLyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param thongTinXuLyId the thong tin xu ly ID
	 * @return the matching qlvt xu ly gp lien van, or <code>null</code> if a matching qlvt xu ly gp lien van could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVan fetchBythongTinXuLyId(long thongTinXuLyId)
		throws SystemException {
		return fetchBythongTinXuLyId(thongTinXuLyId, true);
	}

	/**
	 * Returns the qlvt xu ly gp lien van where thongTinXuLyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param thongTinXuLyId the thong tin xu ly ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching qlvt xu ly gp lien van, or <code>null</code> if a matching qlvt xu ly gp lien van could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVan fetchBythongTinXuLyId(long thongTinXuLyId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { thongTinXuLyId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_THONGTINXULYID,
					finderArgs, this);
		}

		if (result instanceof QlvtXuLyGpLienVan) {
			QlvtXuLyGpLienVan qlvtXuLyGpLienVan = (QlvtXuLyGpLienVan)result;

			if ((thongTinXuLyId != qlvtXuLyGpLienVan.getThongTinXuLyId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_QLVTXULYGPLIENVAN_WHERE);

			query.append(_FINDER_COLUMN_THONGTINXULYID_THONGTINXULYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(thongTinXuLyId);

				List<QlvtXuLyGpLienVan> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THONGTINXULYID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"QlvtXuLyGpLienVanPersistenceImpl.fetchBythongTinXuLyId(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					QlvtXuLyGpLienVan qlvtXuLyGpLienVan = list.get(0);

					result = qlvtXuLyGpLienVan;

					cacheResult(qlvtXuLyGpLienVan);

					if ((qlvtXuLyGpLienVan.getThongTinXuLyId() != thongTinXuLyId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THONGTINXULYID,
							finderArgs, qlvtXuLyGpLienVan);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_THONGTINXULYID,
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
			return (QlvtXuLyGpLienVan)result;
		}
	}

	/**
	 * Removes the qlvt xu ly gp lien van where thongTinXuLyId = &#63; from the database.
	 *
	 * @param thongTinXuLyId the thong tin xu ly ID
	 * @return the qlvt xu ly gp lien van that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVan removeBythongTinXuLyId(long thongTinXuLyId)
		throws NoSuchQlvtXuLyGpLienVanException, SystemException {
		QlvtXuLyGpLienVan qlvtXuLyGpLienVan = findBythongTinXuLyId(thongTinXuLyId);

		return remove(qlvtXuLyGpLienVan);
	}

	/**
	 * Returns the number of qlvt xu ly gp lien vans where thongTinXuLyId = &#63;.
	 *
	 * @param thongTinXuLyId the thong tin xu ly ID
	 * @return the number of matching qlvt xu ly gp lien vans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBythongTinXuLyId(long thongTinXuLyId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_THONGTINXULYID;

		Object[] finderArgs = new Object[] { thongTinXuLyId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_QLVTXULYGPLIENVAN_WHERE);

			query.append(_FINDER_COLUMN_THONGTINXULYID_THONGTINXULYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(thongTinXuLyId);

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

	private static final String _FINDER_COLUMN_THONGTINXULYID_THONGTINXULYID_2 = "qlvtXuLyGpLienVan.thongTinXuLyId = ?";

	public QlvtXuLyGpLienVanPersistenceImpl() {
		setModelClass(QlvtXuLyGpLienVan.class);
	}

	/**
	 * Caches the qlvt xu ly gp lien van in the entity cache if it is enabled.
	 *
	 * @param qlvtXuLyGpLienVan the qlvt xu ly gp lien van
	 */
	@Override
	public void cacheResult(QlvtXuLyGpLienVan qlvtXuLyGpLienVan) {
		EntityCacheUtil.putResult(QlvtXuLyGpLienVanModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanImpl.class, qlvtXuLyGpLienVan.getPrimaryKey(),
			qlvtXuLyGpLienVan);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THONGTINXULYID,
			new Object[] { qlvtXuLyGpLienVan.getThongTinXuLyId() },
			qlvtXuLyGpLienVan);

		qlvtXuLyGpLienVan.resetOriginalValues();
	}

	/**
	 * Caches the qlvt xu ly gp lien vans in the entity cache if it is enabled.
	 *
	 * @param qlvtXuLyGpLienVans the qlvt xu ly gp lien vans
	 */
	@Override
	public void cacheResult(List<QlvtXuLyGpLienVan> qlvtXuLyGpLienVans) {
		for (QlvtXuLyGpLienVan qlvtXuLyGpLienVan : qlvtXuLyGpLienVans) {
			if (EntityCacheUtil.getResult(
						QlvtXuLyGpLienVanModelImpl.ENTITY_CACHE_ENABLED,
						QlvtXuLyGpLienVanImpl.class,
						qlvtXuLyGpLienVan.getPrimaryKey()) == null) {
				cacheResult(qlvtXuLyGpLienVan);
			}
			else {
				qlvtXuLyGpLienVan.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qlvt xu ly gp lien vans.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QlvtXuLyGpLienVanImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QlvtXuLyGpLienVanImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qlvt xu ly gp lien van.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QlvtXuLyGpLienVan qlvtXuLyGpLienVan) {
		EntityCacheUtil.removeResult(QlvtXuLyGpLienVanModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanImpl.class, qlvtXuLyGpLienVan.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(qlvtXuLyGpLienVan);
	}

	@Override
	public void clearCache(List<QlvtXuLyGpLienVan> qlvtXuLyGpLienVans) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QlvtXuLyGpLienVan qlvtXuLyGpLienVan : qlvtXuLyGpLienVans) {
			EntityCacheUtil.removeResult(QlvtXuLyGpLienVanModelImpl.ENTITY_CACHE_ENABLED,
				QlvtXuLyGpLienVanImpl.class, qlvtXuLyGpLienVan.getPrimaryKey());

			clearUniqueFindersCache(qlvtXuLyGpLienVan);
		}
	}

	protected void cacheUniqueFindersCache(QlvtXuLyGpLienVan qlvtXuLyGpLienVan) {
		if (qlvtXuLyGpLienVan.isNew()) {
			Object[] args = new Object[] { qlvtXuLyGpLienVan.getThongTinXuLyId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_THONGTINXULYID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THONGTINXULYID,
				args, qlvtXuLyGpLienVan);
		}
		else {
			QlvtXuLyGpLienVanModelImpl qlvtXuLyGpLienVanModelImpl = (QlvtXuLyGpLienVanModelImpl)qlvtXuLyGpLienVan;

			if ((qlvtXuLyGpLienVanModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_THONGTINXULYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						qlvtXuLyGpLienVan.getThongTinXuLyId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_THONGTINXULYID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THONGTINXULYID,
					args, qlvtXuLyGpLienVan);
			}
		}
	}

	protected void clearUniqueFindersCache(QlvtXuLyGpLienVan qlvtXuLyGpLienVan) {
		QlvtXuLyGpLienVanModelImpl qlvtXuLyGpLienVanModelImpl = (QlvtXuLyGpLienVanModelImpl)qlvtXuLyGpLienVan;

		Object[] args = new Object[] { qlvtXuLyGpLienVan.getThongTinXuLyId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_THONGTINXULYID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_THONGTINXULYID, args);

		if ((qlvtXuLyGpLienVanModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_THONGTINXULYID.getColumnBitmask()) != 0) {
			args = new Object[] {
					qlvtXuLyGpLienVanModelImpl.getOriginalThongTinXuLyId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_THONGTINXULYID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_THONGTINXULYID,
				args);
		}
	}

	/**
	 * Creates a new qlvt xu ly gp lien van with the primary key. Does not add the qlvt xu ly gp lien van to the database.
	 *
	 * @param id the primary key for the new qlvt xu ly gp lien van
	 * @return the new qlvt xu ly gp lien van
	 */
	@Override
	public QlvtXuLyGpLienVan create(long id) {
		QlvtXuLyGpLienVan qlvtXuLyGpLienVan = new QlvtXuLyGpLienVanImpl();

		qlvtXuLyGpLienVan.setNew(true);
		qlvtXuLyGpLienVan.setPrimaryKey(id);

		return qlvtXuLyGpLienVan;
	}

	/**
	 * Removes the qlvt xu ly gp lien van with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the qlvt xu ly gp lien van
	 * @return the qlvt xu ly gp lien van that was removed
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanException if a qlvt xu ly gp lien van with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVan remove(long id)
		throws NoSuchQlvtXuLyGpLienVanException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the qlvt xu ly gp lien van with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qlvt xu ly gp lien van
	 * @return the qlvt xu ly gp lien van that was removed
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanException if a qlvt xu ly gp lien van with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVan remove(Serializable primaryKey)
		throws NoSuchQlvtXuLyGpLienVanException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QlvtXuLyGpLienVan qlvtXuLyGpLienVan = (QlvtXuLyGpLienVan)session.get(QlvtXuLyGpLienVanImpl.class,
					primaryKey);

			if (qlvtXuLyGpLienVan == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQlvtXuLyGpLienVanException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtXuLyGpLienVan);
		}
		catch (NoSuchQlvtXuLyGpLienVanException nsee) {
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
	protected QlvtXuLyGpLienVan removeImpl(QlvtXuLyGpLienVan qlvtXuLyGpLienVan)
		throws SystemException {
		qlvtXuLyGpLienVan = toUnwrappedModel(qlvtXuLyGpLienVan);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtXuLyGpLienVan)) {
				qlvtXuLyGpLienVan = (QlvtXuLyGpLienVan)session.get(QlvtXuLyGpLienVanImpl.class,
						qlvtXuLyGpLienVan.getPrimaryKeyObj());
			}

			if (qlvtXuLyGpLienVan != null) {
				session.delete(qlvtXuLyGpLienVan);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtXuLyGpLienVan != null) {
			clearCache(qlvtXuLyGpLienVan);
		}

		return qlvtXuLyGpLienVan;
	}

	@Override
	public QlvtXuLyGpLienVan updateImpl(
		vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVan qlvtXuLyGpLienVan)
		throws SystemException {
		qlvtXuLyGpLienVan = toUnwrappedModel(qlvtXuLyGpLienVan);

		boolean isNew = qlvtXuLyGpLienVan.isNew();

		Session session = null;

		try {
			session = openSession();

			if (qlvtXuLyGpLienVan.isNew()) {
				session.save(qlvtXuLyGpLienVan);

				qlvtXuLyGpLienVan.setNew(false);
			}
			else {
				session.merge(qlvtXuLyGpLienVan);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !QlvtXuLyGpLienVanModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(QlvtXuLyGpLienVanModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanImpl.class, qlvtXuLyGpLienVan.getPrimaryKey(),
			qlvtXuLyGpLienVan);

		clearUniqueFindersCache(qlvtXuLyGpLienVan);
		cacheUniqueFindersCache(qlvtXuLyGpLienVan);

		return qlvtXuLyGpLienVan;
	}

	protected QlvtXuLyGpLienVan toUnwrappedModel(
		QlvtXuLyGpLienVan qlvtXuLyGpLienVan) {
		if (qlvtXuLyGpLienVan instanceof QlvtXuLyGpLienVanImpl) {
			return qlvtXuLyGpLienVan;
		}

		QlvtXuLyGpLienVanImpl qlvtXuLyGpLienVanImpl = new QlvtXuLyGpLienVanImpl();

		qlvtXuLyGpLienVanImpl.setNew(qlvtXuLyGpLienVan.isNew());
		qlvtXuLyGpLienVanImpl.setPrimaryKey(qlvtXuLyGpLienVan.getPrimaryKey());

		qlvtXuLyGpLienVanImpl.setId(qlvtXuLyGpLienVan.getId());
		qlvtXuLyGpLienVanImpl.setThongTinXuLyId(qlvtXuLyGpLienVan.getThongTinXuLyId());
		qlvtXuLyGpLienVanImpl.setLoaiCapPhep(qlvtXuLyGpLienVan.getLoaiCapPhep());
		qlvtXuLyGpLienVanImpl.setSoGpvt(qlvtXuLyGpLienVan.getSoGpvt());
		qlvtXuLyGpLienVanImpl.setNgayCapGpvt(qlvtXuLyGpLienVan.getNgayCapGpvt());
		qlvtXuLyGpLienVanImpl.setSoCongVanChapThuanTcd(qlvtXuLyGpLienVan.getSoCongVanChapThuanTcd());
		qlvtXuLyGpLienVanImpl.setNgayCongVanChapThuanTCD(qlvtXuLyGpLienVan.getNgayCongVanChapThuanTCD());
		qlvtXuLyGpLienVanImpl.setTuyenTu(qlvtXuLyGpLienVan.getTuyenTu());
		qlvtXuLyGpLienVanImpl.setTuyenDi(qlvtXuLyGpLienVan.getTuyenDi());
		qlvtXuLyGpLienVanImpl.setCuLy(qlvtXuLyGpLienVan.getCuLy());
		qlvtXuLyGpLienVanImpl.setMaBenDi(qlvtXuLyGpLienVan.getMaBenDi());
		qlvtXuLyGpLienVanImpl.setMaBenDen(qlvtXuLyGpLienVan.getMaBenDen());
		qlvtXuLyGpLienVanImpl.setMaTinhDi(qlvtXuLyGpLienVan.getMaTinhDi());
		qlvtXuLyGpLienVanImpl.setMaTinhDen(qlvtXuLyGpLienVan.getMaTinhDen());
		qlvtXuLyGpLienVanImpl.setHanhTrinh(qlvtXuLyGpLienVan.getHanhTrinh());
		qlvtXuLyGpLienVanImpl.setMucPhi(qlvtXuLyGpLienVan.getMucPhi());
		qlvtXuLyGpLienVanImpl.setMucDichChuyenDi(qlvtXuLyGpLienVan.getMucDichChuyenDi());
		qlvtXuLyGpLienVanImpl.setLoaiGiayPhepLienVan(qlvtXuLyGpLienVan.getLoaiGiayPhepLienVan());
		qlvtXuLyGpLienVanImpl.setSoGiayPhepLienVan(qlvtXuLyGpLienVan.getSoGiayPhepLienVan());
		qlvtXuLyGpLienVanImpl.setNgayCapGiayPhepLienVan(qlvtXuLyGpLienVan.getNgayCapGiayPhepLienVan());
		qlvtXuLyGpLienVanImpl.setNgayHetHanGiayPhepLienVan(qlvtXuLyGpLienVan.getNgayHetHanGiayPhepLienVan());
		qlvtXuLyGpLienVanImpl.setCoQuanCapPhepLienVan(qlvtXuLyGpLienVan.getCoQuanCapPhepLienVan());
		qlvtXuLyGpLienVanImpl.setKetQuaXuLy(qlvtXuLyGpLienVan.getKetQuaXuLy());
		qlvtXuLyGpLienVanImpl.setLyDoKhongDat(qlvtXuLyGpLienVan.getLyDoKhongDat());
		qlvtXuLyGpLienVanImpl.setNgayCapGiayPhepLienVan_LanDau(qlvtXuLyGpLienVan.getNgayCapGiayPhepLienVan_LanDau());

		return qlvtXuLyGpLienVanImpl;
	}

	/**
	 * Returns the qlvt xu ly gp lien van with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt xu ly gp lien van
	 * @return the qlvt xu ly gp lien van
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanException if a qlvt xu ly gp lien van with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVan findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQlvtXuLyGpLienVanException, SystemException {
		QlvtXuLyGpLienVan qlvtXuLyGpLienVan = fetchByPrimaryKey(primaryKey);

		if (qlvtXuLyGpLienVan == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQlvtXuLyGpLienVanException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtXuLyGpLienVan;
	}

	/**
	 * Returns the qlvt xu ly gp lien van with the primary key or throws a {@link vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanException} if it could not be found.
	 *
	 * @param id the primary key of the qlvt xu ly gp lien van
	 * @return the qlvt xu ly gp lien van
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanException if a qlvt xu ly gp lien van with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVan findByPrimaryKey(long id)
		throws NoSuchQlvtXuLyGpLienVanException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the qlvt xu ly gp lien van with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt xu ly gp lien van
	 * @return the qlvt xu ly gp lien van, or <code>null</code> if a qlvt xu ly gp lien van with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVan fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QlvtXuLyGpLienVan qlvtXuLyGpLienVan = (QlvtXuLyGpLienVan)EntityCacheUtil.getResult(QlvtXuLyGpLienVanModelImpl.ENTITY_CACHE_ENABLED,
				QlvtXuLyGpLienVanImpl.class, primaryKey);

		if (qlvtXuLyGpLienVan == _nullQlvtXuLyGpLienVan) {
			return null;
		}

		if (qlvtXuLyGpLienVan == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtXuLyGpLienVan = (QlvtXuLyGpLienVan)session.get(QlvtXuLyGpLienVanImpl.class,
						primaryKey);

				if (qlvtXuLyGpLienVan != null) {
					cacheResult(qlvtXuLyGpLienVan);
				}
				else {
					EntityCacheUtil.putResult(QlvtXuLyGpLienVanModelImpl.ENTITY_CACHE_ENABLED,
						QlvtXuLyGpLienVanImpl.class, primaryKey,
						_nullQlvtXuLyGpLienVan);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QlvtXuLyGpLienVanModelImpl.ENTITY_CACHE_ENABLED,
					QlvtXuLyGpLienVanImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtXuLyGpLienVan;
	}

	/**
	 * Returns the qlvt xu ly gp lien van with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the qlvt xu ly gp lien van
	 * @return the qlvt xu ly gp lien van, or <code>null</code> if a qlvt xu ly gp lien van with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVan fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the qlvt xu ly gp lien vans.
	 *
	 * @return the qlvt xu ly gp lien vans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpLienVan> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt xu ly gp lien vans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt xu ly gp lien vans
	 * @param end the upper bound of the range of qlvt xu ly gp lien vans (not inclusive)
	 * @return the range of qlvt xu ly gp lien vans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpLienVan> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt xu ly gp lien vans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt xu ly gp lien vans
	 * @param end the upper bound of the range of qlvt xu ly gp lien vans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qlvt xu ly gp lien vans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpLienVan> findAll(int start, int end,
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

		List<QlvtXuLyGpLienVan> list = (List<QlvtXuLyGpLienVan>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTXULYGPLIENVAN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTXULYGPLIENVAN;

				if (pagination) {
					sql = sql.concat(QlvtXuLyGpLienVanModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QlvtXuLyGpLienVan>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtXuLyGpLienVan>(list);
				}
				else {
					list = (List<QlvtXuLyGpLienVan>)QueryUtil.list(q,
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
	 * Removes all the qlvt xu ly gp lien vans from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QlvtXuLyGpLienVan qlvtXuLyGpLienVan : findAll()) {
			remove(qlvtXuLyGpLienVan);
		}
	}

	/**
	 * Returns the number of qlvt xu ly gp lien vans.
	 *
	 * @return the number of qlvt xu ly gp lien vans
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

				Query q = session.createQuery(_SQL_COUNT_QLVTXULYGPLIENVAN);

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
	 * Initializes the qlvt xu ly gp lien van persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVan")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QlvtXuLyGpLienVan>> listenersList = new ArrayList<ModelListener<QlvtXuLyGpLienVan>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QlvtXuLyGpLienVan>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QlvtXuLyGpLienVanImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTXULYGPLIENVAN = "SELECT qlvtXuLyGpLienVan FROM QlvtXuLyGpLienVan qlvtXuLyGpLienVan";
	private static final String _SQL_SELECT_QLVTXULYGPLIENVAN_WHERE = "SELECT qlvtXuLyGpLienVan FROM QlvtXuLyGpLienVan qlvtXuLyGpLienVan WHERE ";
	private static final String _SQL_COUNT_QLVTXULYGPLIENVAN = "SELECT COUNT(qlvtXuLyGpLienVan) FROM QlvtXuLyGpLienVan qlvtXuLyGpLienVan";
	private static final String _SQL_COUNT_QLVTXULYGPLIENVAN_WHERE = "SELECT COUNT(qlvtXuLyGpLienVan) FROM QlvtXuLyGpLienVan qlvtXuLyGpLienVan WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtXuLyGpLienVan.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QlvtXuLyGpLienVan exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No QlvtXuLyGpLienVan exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QlvtXuLyGpLienVanPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "thongTinXuLyId", "loaiCapPhep", "soGpvt", "ngayCapGpvt",
				"soCongVanChapThuanTcd", "ngayCongVanChapThuanTCD", "tuyenTu",
				"tuyenDi", "cuLy", "maBenDi", "maBenDen", "maTinhDi",
				"maTinhDen", "hanhTrinh", "mucPhi", "mucDichChuyenDi",
				"loaiGiayPhepLienVan", "soGiayPhepLienVan",
				"ngayCapGiayPhepLienVan", "ngayHetHanGiayPhepLienVan",
				"coQuanCapPhepLienVan", "ketQuaXuLy", "lyDoKhongDat",
				"ngayCapGiayPhepLienVan_LanDau"
			});
	private static QlvtXuLyGpLienVan _nullQlvtXuLyGpLienVan = new QlvtXuLyGpLienVanImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QlvtXuLyGpLienVan> toCacheModel() {
				return _nullQlvtXuLyGpLienVanCacheModel;
			}
		};

	private static CacheModel<QlvtXuLyGpLienVan> _nullQlvtXuLyGpLienVanCacheModel =
		new CacheModel<QlvtXuLyGpLienVan>() {
			@Override
			public QlvtXuLyGpLienVan toEntityModel() {
				return _nullQlvtXuLyGpLienVan;
			}
		};
}