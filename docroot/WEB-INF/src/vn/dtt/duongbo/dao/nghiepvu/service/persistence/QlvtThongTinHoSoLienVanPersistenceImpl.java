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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoLienVanException;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoLienVan;
import vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinHoSoLienVanImpl;
import vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinHoSoLienVanModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the qlvt thong tin ho so lien van service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanNc
 * @see QlvtThongTinHoSoLienVanPersistence
 * @see QlvtThongTinHoSoLienVanUtil
 * @generated
 */
public class QlvtThongTinHoSoLienVanPersistenceImpl extends BasePersistenceImpl<QlvtThongTinHoSoLienVan>
	implements QlvtThongTinHoSoLienVanPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QlvtThongTinHoSoLienVanUtil} to access the qlvt thong tin ho so lien van persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QlvtThongTinHoSoLienVanImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QlvtThongTinHoSoLienVanModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinHoSoLienVanModelImpl.FINDER_CACHE_ENABLED,
			QlvtThongTinHoSoLienVanImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QlvtThongTinHoSoLienVanModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinHoSoLienVanModelImpl.FINDER_CACHE_ENABLED,
			QlvtThongTinHoSoLienVanImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QlvtThongTinHoSoLienVanModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinHoSoLienVanModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public QlvtThongTinHoSoLienVanPersistenceImpl() {
		setModelClass(QlvtThongTinHoSoLienVan.class);
	}

	/**
	 * Caches the qlvt thong tin ho so lien van in the entity cache if it is enabled.
	 *
	 * @param qlvtThongTinHoSoLienVan the qlvt thong tin ho so lien van
	 */
	@Override
	public void cacheResult(QlvtThongTinHoSoLienVan qlvtThongTinHoSoLienVan) {
		EntityCacheUtil.putResult(QlvtThongTinHoSoLienVanModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinHoSoLienVanImpl.class,
			qlvtThongTinHoSoLienVan.getPrimaryKey(), qlvtThongTinHoSoLienVan);

		qlvtThongTinHoSoLienVan.resetOriginalValues();
	}

	/**
	 * Caches the qlvt thong tin ho so lien vans in the entity cache if it is enabled.
	 *
	 * @param qlvtThongTinHoSoLienVans the qlvt thong tin ho so lien vans
	 */
	@Override
	public void cacheResult(
		List<QlvtThongTinHoSoLienVan> qlvtThongTinHoSoLienVans) {
		for (QlvtThongTinHoSoLienVan qlvtThongTinHoSoLienVan : qlvtThongTinHoSoLienVans) {
			if (EntityCacheUtil.getResult(
						QlvtThongTinHoSoLienVanModelImpl.ENTITY_CACHE_ENABLED,
						QlvtThongTinHoSoLienVanImpl.class,
						qlvtThongTinHoSoLienVan.getPrimaryKey()) == null) {
				cacheResult(qlvtThongTinHoSoLienVan);
			}
			else {
				qlvtThongTinHoSoLienVan.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qlvt thong tin ho so lien vans.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QlvtThongTinHoSoLienVanImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QlvtThongTinHoSoLienVanImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qlvt thong tin ho so lien van.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QlvtThongTinHoSoLienVan qlvtThongTinHoSoLienVan) {
		EntityCacheUtil.removeResult(QlvtThongTinHoSoLienVanModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinHoSoLienVanImpl.class,
			qlvtThongTinHoSoLienVan.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<QlvtThongTinHoSoLienVan> qlvtThongTinHoSoLienVans) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QlvtThongTinHoSoLienVan qlvtThongTinHoSoLienVan : qlvtThongTinHoSoLienVans) {
			EntityCacheUtil.removeResult(QlvtThongTinHoSoLienVanModelImpl.ENTITY_CACHE_ENABLED,
				QlvtThongTinHoSoLienVanImpl.class,
				qlvtThongTinHoSoLienVan.getPrimaryKey());
		}
	}

	/**
	 * Creates a new qlvt thong tin ho so lien van with the primary key. Does not add the qlvt thong tin ho so lien van to the database.
	 *
	 * @param id the primary key for the new qlvt thong tin ho so lien van
	 * @return the new qlvt thong tin ho so lien van
	 */
	@Override
	public QlvtThongTinHoSoLienVan create(long id) {
		QlvtThongTinHoSoLienVan qlvtThongTinHoSoLienVan = new QlvtThongTinHoSoLienVanImpl();

		qlvtThongTinHoSoLienVan.setNew(true);
		qlvtThongTinHoSoLienVan.setPrimaryKey(id);

		return qlvtThongTinHoSoLienVan;
	}

	/**
	 * Removes the qlvt thong tin ho so lien van with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the qlvt thong tin ho so lien van
	 * @return the qlvt thong tin ho so lien van that was removed
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoLienVanException if a qlvt thong tin ho so lien van with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSoLienVan remove(long id)
		throws NoSuchQlvtThongTinHoSoLienVanException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the qlvt thong tin ho so lien van with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qlvt thong tin ho so lien van
	 * @return the qlvt thong tin ho so lien van that was removed
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoLienVanException if a qlvt thong tin ho so lien van with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSoLienVan remove(Serializable primaryKey)
		throws NoSuchQlvtThongTinHoSoLienVanException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QlvtThongTinHoSoLienVan qlvtThongTinHoSoLienVan = (QlvtThongTinHoSoLienVan)session.get(QlvtThongTinHoSoLienVanImpl.class,
					primaryKey);

			if (qlvtThongTinHoSoLienVan == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQlvtThongTinHoSoLienVanException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtThongTinHoSoLienVan);
		}
		catch (NoSuchQlvtThongTinHoSoLienVanException nsee) {
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
	protected QlvtThongTinHoSoLienVan removeImpl(
		QlvtThongTinHoSoLienVan qlvtThongTinHoSoLienVan)
		throws SystemException {
		qlvtThongTinHoSoLienVan = toUnwrappedModel(qlvtThongTinHoSoLienVan);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtThongTinHoSoLienVan)) {
				qlvtThongTinHoSoLienVan = (QlvtThongTinHoSoLienVan)session.get(QlvtThongTinHoSoLienVanImpl.class,
						qlvtThongTinHoSoLienVan.getPrimaryKeyObj());
			}

			if (qlvtThongTinHoSoLienVan != null) {
				session.delete(qlvtThongTinHoSoLienVan);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtThongTinHoSoLienVan != null) {
			clearCache(qlvtThongTinHoSoLienVan);
		}

		return qlvtThongTinHoSoLienVan;
	}

	@Override
	public QlvtThongTinHoSoLienVan updateImpl(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoLienVan qlvtThongTinHoSoLienVan)
		throws SystemException {
		qlvtThongTinHoSoLienVan = toUnwrappedModel(qlvtThongTinHoSoLienVan);

		boolean isNew = qlvtThongTinHoSoLienVan.isNew();

		Session session = null;

		try {
			session = openSession();

			if (qlvtThongTinHoSoLienVan.isNew()) {
				session.save(qlvtThongTinHoSoLienVan);

				qlvtThongTinHoSoLienVan.setNew(false);
			}
			else {
				session.merge(qlvtThongTinHoSoLienVan);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(QlvtThongTinHoSoLienVanModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinHoSoLienVanImpl.class,
			qlvtThongTinHoSoLienVan.getPrimaryKey(), qlvtThongTinHoSoLienVan);

		return qlvtThongTinHoSoLienVan;
	}

	protected QlvtThongTinHoSoLienVan toUnwrappedModel(
		QlvtThongTinHoSoLienVan qlvtThongTinHoSoLienVan) {
		if (qlvtThongTinHoSoLienVan instanceof QlvtThongTinHoSoLienVanImpl) {
			return qlvtThongTinHoSoLienVan;
		}

		QlvtThongTinHoSoLienVanImpl qlvtThongTinHoSoLienVanImpl = new QlvtThongTinHoSoLienVanImpl();

		qlvtThongTinHoSoLienVanImpl.setNew(qlvtThongTinHoSoLienVan.isNew());
		qlvtThongTinHoSoLienVanImpl.setPrimaryKey(qlvtThongTinHoSoLienVan.getPrimaryKey());

		qlvtThongTinHoSoLienVanImpl.setId(qlvtThongTinHoSoLienVan.getId());
		qlvtThongTinHoSoLienVanImpl.setThongtinHoSoId(qlvtThongTinHoSoLienVan.getThongtinHoSoId());
		qlvtThongTinHoSoLienVanImpl.setGplienvanID(qlvtThongTinHoSoLienVan.getGplienvanID());

		return qlvtThongTinHoSoLienVanImpl;
	}

	/**
	 * Returns the qlvt thong tin ho so lien van with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt thong tin ho so lien van
	 * @return the qlvt thong tin ho so lien van
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoLienVanException if a qlvt thong tin ho so lien van with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSoLienVan findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQlvtThongTinHoSoLienVanException, SystemException {
		QlvtThongTinHoSoLienVan qlvtThongTinHoSoLienVan = fetchByPrimaryKey(primaryKey);

		if (qlvtThongTinHoSoLienVan == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQlvtThongTinHoSoLienVanException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtThongTinHoSoLienVan;
	}

	/**
	 * Returns the qlvt thong tin ho so lien van with the primary key or throws a {@link vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoLienVanException} if it could not be found.
	 *
	 * @param id the primary key of the qlvt thong tin ho so lien van
	 * @return the qlvt thong tin ho so lien van
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoLienVanException if a qlvt thong tin ho so lien van with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSoLienVan findByPrimaryKey(long id)
		throws NoSuchQlvtThongTinHoSoLienVanException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the qlvt thong tin ho so lien van with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt thong tin ho so lien van
	 * @return the qlvt thong tin ho so lien van, or <code>null</code> if a qlvt thong tin ho so lien van with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSoLienVan fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QlvtThongTinHoSoLienVan qlvtThongTinHoSoLienVan = (QlvtThongTinHoSoLienVan)EntityCacheUtil.getResult(QlvtThongTinHoSoLienVanModelImpl.ENTITY_CACHE_ENABLED,
				QlvtThongTinHoSoLienVanImpl.class, primaryKey);

		if (qlvtThongTinHoSoLienVan == _nullQlvtThongTinHoSoLienVan) {
			return null;
		}

		if (qlvtThongTinHoSoLienVan == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtThongTinHoSoLienVan = (QlvtThongTinHoSoLienVan)session.get(QlvtThongTinHoSoLienVanImpl.class,
						primaryKey);

				if (qlvtThongTinHoSoLienVan != null) {
					cacheResult(qlvtThongTinHoSoLienVan);
				}
				else {
					EntityCacheUtil.putResult(QlvtThongTinHoSoLienVanModelImpl.ENTITY_CACHE_ENABLED,
						QlvtThongTinHoSoLienVanImpl.class, primaryKey,
						_nullQlvtThongTinHoSoLienVan);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QlvtThongTinHoSoLienVanModelImpl.ENTITY_CACHE_ENABLED,
					QlvtThongTinHoSoLienVanImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtThongTinHoSoLienVan;
	}

	/**
	 * Returns the qlvt thong tin ho so lien van with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the qlvt thong tin ho so lien van
	 * @return the qlvt thong tin ho so lien van, or <code>null</code> if a qlvt thong tin ho so lien van with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSoLienVan fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the qlvt thong tin ho so lien vans.
	 *
	 * @return the qlvt thong tin ho so lien vans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtThongTinHoSoLienVan> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt thong tin ho so lien vans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinHoSoLienVanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt thong tin ho so lien vans
	 * @param end the upper bound of the range of qlvt thong tin ho so lien vans (not inclusive)
	 * @return the range of qlvt thong tin ho so lien vans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtThongTinHoSoLienVan> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt thong tin ho so lien vans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinHoSoLienVanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt thong tin ho so lien vans
	 * @param end the upper bound of the range of qlvt thong tin ho so lien vans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qlvt thong tin ho so lien vans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtThongTinHoSoLienVan> findAll(int start, int end,
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

		List<QlvtThongTinHoSoLienVan> list = (List<QlvtThongTinHoSoLienVan>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTTHONGTINHOSOLIENVAN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTTHONGTINHOSOLIENVAN;

				if (pagination) {
					sql = sql.concat(QlvtThongTinHoSoLienVanModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QlvtThongTinHoSoLienVan>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtThongTinHoSoLienVan>(list);
				}
				else {
					list = (List<QlvtThongTinHoSoLienVan>)QueryUtil.list(q,
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
	 * Removes all the qlvt thong tin ho so lien vans from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QlvtThongTinHoSoLienVan qlvtThongTinHoSoLienVan : findAll()) {
			remove(qlvtThongTinHoSoLienVan);
		}
	}

	/**
	 * Returns the number of qlvt thong tin ho so lien vans.
	 *
	 * @return the number of qlvt thong tin ho so lien vans
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

				Query q = session.createQuery(_SQL_COUNT_QLVTTHONGTINHOSOLIENVAN);

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
	 * Initializes the qlvt thong tin ho so lien van persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoLienVan")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QlvtThongTinHoSoLienVan>> listenersList = new ArrayList<ModelListener<QlvtThongTinHoSoLienVan>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QlvtThongTinHoSoLienVan>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QlvtThongTinHoSoLienVanImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTTHONGTINHOSOLIENVAN = "SELECT qlvtThongTinHoSoLienVan FROM QlvtThongTinHoSoLienVan qlvtThongTinHoSoLienVan";
	private static final String _SQL_COUNT_QLVTTHONGTINHOSOLIENVAN = "SELECT COUNT(qlvtThongTinHoSoLienVan) FROM QlvtThongTinHoSoLienVan qlvtThongTinHoSoLienVan";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtThongTinHoSoLienVan.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QlvtThongTinHoSoLienVan exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QlvtThongTinHoSoLienVanPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"thongtinHoSoId", "gplienvanID"
			});
	private static QlvtThongTinHoSoLienVan _nullQlvtThongTinHoSoLienVan = new QlvtThongTinHoSoLienVanImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QlvtThongTinHoSoLienVan> toCacheModel() {
				return _nullQlvtThongTinHoSoLienVanCacheModel;
			}
		};

	private static CacheModel<QlvtThongTinHoSoLienVan> _nullQlvtThongTinHoSoLienVanCacheModel =
		new CacheModel<QlvtThongTinHoSoLienVan>() {
			@Override
			public QlvtThongTinHoSoLienVan toEntityModel() {
				return _nullQlvtThongTinHoSoLienVan;
			}
		};
}