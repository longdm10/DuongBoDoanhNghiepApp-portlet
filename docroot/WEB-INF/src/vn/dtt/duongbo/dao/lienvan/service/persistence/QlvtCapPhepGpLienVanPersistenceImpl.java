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

import vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepGpLienVanException;
import vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpLienVan;
import vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGpLienVanImpl;
import vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGpLienVanModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the qlvt cap phep gp lien van service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanNc
 * @see QlvtCapPhepGpLienVanPersistence
 * @see QlvtCapPhepGpLienVanUtil
 * @generated
 */
public class QlvtCapPhepGpLienVanPersistenceImpl extends BasePersistenceImpl<QlvtCapPhepGpLienVan>
	implements QlvtCapPhepGpLienVanPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QlvtCapPhepGpLienVanUtil} to access the qlvt cap phep gp lien van persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QlvtCapPhepGpLienVanImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QlvtCapPhepGpLienVanModelImpl.ENTITY_CACHE_ENABLED,
			QlvtCapPhepGpLienVanModelImpl.FINDER_CACHE_ENABLED,
			QlvtCapPhepGpLienVanImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QlvtCapPhepGpLienVanModelImpl.ENTITY_CACHE_ENABLED,
			QlvtCapPhepGpLienVanModelImpl.FINDER_CACHE_ENABLED,
			QlvtCapPhepGpLienVanImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QlvtCapPhepGpLienVanModelImpl.ENTITY_CACHE_ENABLED,
			QlvtCapPhepGpLienVanModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public QlvtCapPhepGpLienVanPersistenceImpl() {
		setModelClass(QlvtCapPhepGpLienVan.class);
	}

	/**
	 * Caches the qlvt cap phep gp lien van in the entity cache if it is enabled.
	 *
	 * @param qlvtCapPhepGpLienVan the qlvt cap phep gp lien van
	 */
	@Override
	public void cacheResult(QlvtCapPhepGpLienVan qlvtCapPhepGpLienVan) {
		EntityCacheUtil.putResult(QlvtCapPhepGpLienVanModelImpl.ENTITY_CACHE_ENABLED,
			QlvtCapPhepGpLienVanImpl.class,
			qlvtCapPhepGpLienVan.getPrimaryKey(), qlvtCapPhepGpLienVan);

		qlvtCapPhepGpLienVan.resetOriginalValues();
	}

	/**
	 * Caches the qlvt cap phep gp lien vans in the entity cache if it is enabled.
	 *
	 * @param qlvtCapPhepGpLienVans the qlvt cap phep gp lien vans
	 */
	@Override
	public void cacheResult(List<QlvtCapPhepGpLienVan> qlvtCapPhepGpLienVans) {
		for (QlvtCapPhepGpLienVan qlvtCapPhepGpLienVan : qlvtCapPhepGpLienVans) {
			if (EntityCacheUtil.getResult(
						QlvtCapPhepGpLienVanModelImpl.ENTITY_CACHE_ENABLED,
						QlvtCapPhepGpLienVanImpl.class,
						qlvtCapPhepGpLienVan.getPrimaryKey()) == null) {
				cacheResult(qlvtCapPhepGpLienVan);
			}
			else {
				qlvtCapPhepGpLienVan.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qlvt cap phep gp lien vans.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QlvtCapPhepGpLienVanImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QlvtCapPhepGpLienVanImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qlvt cap phep gp lien van.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QlvtCapPhepGpLienVan qlvtCapPhepGpLienVan) {
		EntityCacheUtil.removeResult(QlvtCapPhepGpLienVanModelImpl.ENTITY_CACHE_ENABLED,
			QlvtCapPhepGpLienVanImpl.class, qlvtCapPhepGpLienVan.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<QlvtCapPhepGpLienVan> qlvtCapPhepGpLienVans) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QlvtCapPhepGpLienVan qlvtCapPhepGpLienVan : qlvtCapPhepGpLienVans) {
			EntityCacheUtil.removeResult(QlvtCapPhepGpLienVanModelImpl.ENTITY_CACHE_ENABLED,
				QlvtCapPhepGpLienVanImpl.class,
				qlvtCapPhepGpLienVan.getPrimaryKey());
		}
	}

	/**
	 * Creates a new qlvt cap phep gp lien van with the primary key. Does not add the qlvt cap phep gp lien van to the database.
	 *
	 * @param id the primary key for the new qlvt cap phep gp lien van
	 * @return the new qlvt cap phep gp lien van
	 */
	@Override
	public QlvtCapPhepGpLienVan create(long id) {
		QlvtCapPhepGpLienVan qlvtCapPhepGpLienVan = new QlvtCapPhepGpLienVanImpl();

		qlvtCapPhepGpLienVan.setNew(true);
		qlvtCapPhepGpLienVan.setPrimaryKey(id);

		return qlvtCapPhepGpLienVan;
	}

	/**
	 * Removes the qlvt cap phep gp lien van with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the qlvt cap phep gp lien van
	 * @return the qlvt cap phep gp lien van that was removed
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepGpLienVanException if a qlvt cap phep gp lien van with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtCapPhepGpLienVan remove(long id)
		throws NoSuchQlvtCapPhepGpLienVanException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the qlvt cap phep gp lien van with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qlvt cap phep gp lien van
	 * @return the qlvt cap phep gp lien van that was removed
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepGpLienVanException if a qlvt cap phep gp lien van with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtCapPhepGpLienVan remove(Serializable primaryKey)
		throws NoSuchQlvtCapPhepGpLienVanException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QlvtCapPhepGpLienVan qlvtCapPhepGpLienVan = (QlvtCapPhepGpLienVan)session.get(QlvtCapPhepGpLienVanImpl.class,
					primaryKey);

			if (qlvtCapPhepGpLienVan == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQlvtCapPhepGpLienVanException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtCapPhepGpLienVan);
		}
		catch (NoSuchQlvtCapPhepGpLienVanException nsee) {
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
	protected QlvtCapPhepGpLienVan removeImpl(
		QlvtCapPhepGpLienVan qlvtCapPhepGpLienVan) throws SystemException {
		qlvtCapPhepGpLienVan = toUnwrappedModel(qlvtCapPhepGpLienVan);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtCapPhepGpLienVan)) {
				qlvtCapPhepGpLienVan = (QlvtCapPhepGpLienVan)session.get(QlvtCapPhepGpLienVanImpl.class,
						qlvtCapPhepGpLienVan.getPrimaryKeyObj());
			}

			if (qlvtCapPhepGpLienVan != null) {
				session.delete(qlvtCapPhepGpLienVan);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtCapPhepGpLienVan != null) {
			clearCache(qlvtCapPhepGpLienVan);
		}

		return qlvtCapPhepGpLienVan;
	}

	@Override
	public QlvtCapPhepGpLienVan updateImpl(
		vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpLienVan qlvtCapPhepGpLienVan)
		throws SystemException {
		qlvtCapPhepGpLienVan = toUnwrappedModel(qlvtCapPhepGpLienVan);

		boolean isNew = qlvtCapPhepGpLienVan.isNew();

		Session session = null;

		try {
			session = openSession();

			if (qlvtCapPhepGpLienVan.isNew()) {
				session.save(qlvtCapPhepGpLienVan);

				qlvtCapPhepGpLienVan.setNew(false);
			}
			else {
				session.merge(qlvtCapPhepGpLienVan);
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

		EntityCacheUtil.putResult(QlvtCapPhepGpLienVanModelImpl.ENTITY_CACHE_ENABLED,
			QlvtCapPhepGpLienVanImpl.class,
			qlvtCapPhepGpLienVan.getPrimaryKey(), qlvtCapPhepGpLienVan);

		return qlvtCapPhepGpLienVan;
	}

	protected QlvtCapPhepGpLienVan toUnwrappedModel(
		QlvtCapPhepGpLienVan qlvtCapPhepGpLienVan) {
		if (qlvtCapPhepGpLienVan instanceof QlvtCapPhepGpLienVanImpl) {
			return qlvtCapPhepGpLienVan;
		}

		QlvtCapPhepGpLienVanImpl qlvtCapPhepGpLienVanImpl = new QlvtCapPhepGpLienVanImpl();

		qlvtCapPhepGpLienVanImpl.setNew(qlvtCapPhepGpLienVan.isNew());
		qlvtCapPhepGpLienVanImpl.setPrimaryKey(qlvtCapPhepGpLienVan.getPrimaryKey());

		qlvtCapPhepGpLienVanImpl.setId(qlvtCapPhepGpLienVan.getId());
		qlvtCapPhepGpLienVanImpl.setGpkdvtVietLaoId(qlvtCapPhepGpLienVan.getGpkdvtVietLaoId());
		qlvtCapPhepGpLienVanImpl.setLoaiCapPhep(qlvtCapPhepGpLienVan.getLoaiCapPhep());
		qlvtCapPhepGpLienVanImpl.setLoaiGiayPhepLienVan(qlvtCapPhepGpLienVan.getLoaiGiayPhepLienVan());
		qlvtCapPhepGpLienVanImpl.setSoGiayPhepLienVan(qlvtCapPhepGpLienVan.getSoGiayPhepLienVan());
		qlvtCapPhepGpLienVanImpl.setNgayCapGplv(qlvtCapPhepGpLienVan.getNgayCapGplv());
		qlvtCapPhepGpLienVanImpl.setNgayHetHanGplv(qlvtCapPhepGpLienVan.getNgayHetHanGplv());
		qlvtCapPhepGpLienVanImpl.setCoQuanCpLienVan(qlvtCapPhepGpLienVan.getCoQuanCpLienVan());
		qlvtCapPhepGpLienVanImpl.setSoCongVanChapThuanTCD(qlvtCapPhepGpLienVan.getSoCongVanChapThuanTCD());
		qlvtCapPhepGpLienVanImpl.setNgayCongVanChapThuanTCD(qlvtCapPhepGpLienVan.getNgayCongVanChapThuanTCD());
		qlvtCapPhepGpLienVanImpl.setTuyenTu(qlvtCapPhepGpLienVan.getTuyenTu());
		qlvtCapPhepGpLienVanImpl.setTuyenDi(qlvtCapPhepGpLienVan.getTuyenDi());
		qlvtCapPhepGpLienVanImpl.setCuLy(qlvtCapPhepGpLienVan.getCuLy());
		qlvtCapPhepGpLienVanImpl.setMaBenDi(qlvtCapPhepGpLienVan.getMaBenDi());
		qlvtCapPhepGpLienVanImpl.setMaBenDen(qlvtCapPhepGpLienVan.getMaBenDen());
		qlvtCapPhepGpLienVanImpl.setMaTinhDi(qlvtCapPhepGpLienVan.getMaTinhDi());
		qlvtCapPhepGpLienVanImpl.setMaTinhDen(qlvtCapPhepGpLienVan.getMaTinhDen());
		qlvtCapPhepGpLienVanImpl.setHanhTrinh(qlvtCapPhepGpLienVan.getHanhTrinh());
		qlvtCapPhepGpLienVanImpl.setMucPhi(qlvtCapPhepGpLienVan.getMucPhi());
		qlvtCapPhepGpLienVanImpl.setMucDichChuyenDi(qlvtCapPhepGpLienVan.getMucDichChuyenDi());
		qlvtCapPhepGpLienVanImpl.setFileId(qlvtCapPhepGpLienVan.getFileId());
		qlvtCapPhepGpLienVanImpl.setTrangThai(qlvtCapPhepGpLienVan.getTrangThai());

		return qlvtCapPhepGpLienVanImpl;
	}

	/**
	 * Returns the qlvt cap phep gp lien van with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt cap phep gp lien van
	 * @return the qlvt cap phep gp lien van
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepGpLienVanException if a qlvt cap phep gp lien van with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtCapPhepGpLienVan findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQlvtCapPhepGpLienVanException, SystemException {
		QlvtCapPhepGpLienVan qlvtCapPhepGpLienVan = fetchByPrimaryKey(primaryKey);

		if (qlvtCapPhepGpLienVan == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQlvtCapPhepGpLienVanException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtCapPhepGpLienVan;
	}

	/**
	 * Returns the qlvt cap phep gp lien van with the primary key or throws a {@link vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepGpLienVanException} if it could not be found.
	 *
	 * @param id the primary key of the qlvt cap phep gp lien van
	 * @return the qlvt cap phep gp lien van
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepGpLienVanException if a qlvt cap phep gp lien van with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtCapPhepGpLienVan findByPrimaryKey(long id)
		throws NoSuchQlvtCapPhepGpLienVanException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the qlvt cap phep gp lien van with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt cap phep gp lien van
	 * @return the qlvt cap phep gp lien van, or <code>null</code> if a qlvt cap phep gp lien van with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtCapPhepGpLienVan fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QlvtCapPhepGpLienVan qlvtCapPhepGpLienVan = (QlvtCapPhepGpLienVan)EntityCacheUtil.getResult(QlvtCapPhepGpLienVanModelImpl.ENTITY_CACHE_ENABLED,
				QlvtCapPhepGpLienVanImpl.class, primaryKey);

		if (qlvtCapPhepGpLienVan == _nullQlvtCapPhepGpLienVan) {
			return null;
		}

		if (qlvtCapPhepGpLienVan == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtCapPhepGpLienVan = (QlvtCapPhepGpLienVan)session.get(QlvtCapPhepGpLienVanImpl.class,
						primaryKey);

				if (qlvtCapPhepGpLienVan != null) {
					cacheResult(qlvtCapPhepGpLienVan);
				}
				else {
					EntityCacheUtil.putResult(QlvtCapPhepGpLienVanModelImpl.ENTITY_CACHE_ENABLED,
						QlvtCapPhepGpLienVanImpl.class, primaryKey,
						_nullQlvtCapPhepGpLienVan);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QlvtCapPhepGpLienVanModelImpl.ENTITY_CACHE_ENABLED,
					QlvtCapPhepGpLienVanImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtCapPhepGpLienVan;
	}

	/**
	 * Returns the qlvt cap phep gp lien van with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the qlvt cap phep gp lien van
	 * @return the qlvt cap phep gp lien van, or <code>null</code> if a qlvt cap phep gp lien van with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtCapPhepGpLienVan fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the qlvt cap phep gp lien vans.
	 *
	 * @return the qlvt cap phep gp lien vans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtCapPhepGpLienVan> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt cap phep gp lien vans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGpLienVanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt cap phep gp lien vans
	 * @param end the upper bound of the range of qlvt cap phep gp lien vans (not inclusive)
	 * @return the range of qlvt cap phep gp lien vans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtCapPhepGpLienVan> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt cap phep gp lien vans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGpLienVanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt cap phep gp lien vans
	 * @param end the upper bound of the range of qlvt cap phep gp lien vans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qlvt cap phep gp lien vans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtCapPhepGpLienVan> findAll(int start, int end,
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

		List<QlvtCapPhepGpLienVan> list = (List<QlvtCapPhepGpLienVan>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTCAPPHEPGPLIENVAN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTCAPPHEPGPLIENVAN;

				if (pagination) {
					sql = sql.concat(QlvtCapPhepGpLienVanModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QlvtCapPhepGpLienVan>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtCapPhepGpLienVan>(list);
				}
				else {
					list = (List<QlvtCapPhepGpLienVan>)QueryUtil.list(q,
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
	 * Removes all the qlvt cap phep gp lien vans from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QlvtCapPhepGpLienVan qlvtCapPhepGpLienVan : findAll()) {
			remove(qlvtCapPhepGpLienVan);
		}
	}

	/**
	 * Returns the number of qlvt cap phep gp lien vans.
	 *
	 * @return the number of qlvt cap phep gp lien vans
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

				Query q = session.createQuery(_SQL_COUNT_QLVTCAPPHEPGPLIENVAN);

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
	 * Initializes the qlvt cap phep gp lien van persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpLienVan")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QlvtCapPhepGpLienVan>> listenersList = new ArrayList<ModelListener<QlvtCapPhepGpLienVan>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QlvtCapPhepGpLienVan>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QlvtCapPhepGpLienVanImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTCAPPHEPGPLIENVAN = "SELECT qlvtCapPhepGpLienVan FROM QlvtCapPhepGpLienVan qlvtCapPhepGpLienVan";
	private static final String _SQL_COUNT_QLVTCAPPHEPGPLIENVAN = "SELECT COUNT(qlvtCapPhepGpLienVan) FROM QlvtCapPhepGpLienVan qlvtCapPhepGpLienVan";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtCapPhepGpLienVan.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QlvtCapPhepGpLienVan exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QlvtCapPhepGpLienVanPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "gpkdvtVietLaoId", "loaiCapPhep", "loaiGiayPhepLienVan",
				"soGiayPhepLienVan", "ngayCapGplv", "ngayHetHanGplv",
				"coQuanCpLienVan", "soCongVanChapThuanTCD",
				"ngayCongVanChapThuanTCD", "tuyenTu", "tuyenDi", "cuLy",
				"maBenDi", "maBenDen", "maTinhDi", "maTinhDen", "hanhTrinh",
				"mucPhi", "mucDichChuyenDi", "fileId", "trangThai"
			});
	private static QlvtCapPhepGpLienVan _nullQlvtCapPhepGpLienVan = new QlvtCapPhepGpLienVanImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QlvtCapPhepGpLienVan> toCacheModel() {
				return _nullQlvtCapPhepGpLienVanCacheModel;
			}
		};

	private static CacheModel<QlvtCapPhepGpLienVan> _nullQlvtCapPhepGpLienVanCacheModel =
		new CacheModel<QlvtCapPhepGpLienVan>() {
			@Override
			public QlvtCapPhepGpLienVan toEntityModel() {
				return _nullQlvtCapPhepGpLienVan;
			}
		};
}