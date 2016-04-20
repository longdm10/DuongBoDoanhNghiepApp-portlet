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

import vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepGplvPhuongTienException;
import vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvPhuongTien;
import vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGplvPhuongTienImpl;
import vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGplvPhuongTienModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the qlvt cap phep gplv phuong tien service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanNc
 * @see QlvtCapPhepGplvPhuongTienPersistence
 * @see QlvtCapPhepGplvPhuongTienUtil
 * @generated
 */
public class QlvtCapPhepGplvPhuongTienPersistenceImpl
	extends BasePersistenceImpl<QlvtCapPhepGplvPhuongTien>
	implements QlvtCapPhepGplvPhuongTienPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QlvtCapPhepGplvPhuongTienUtil} to access the qlvt cap phep gplv phuong tien persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QlvtCapPhepGplvPhuongTienImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QlvtCapPhepGplvPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QlvtCapPhepGplvPhuongTienModelImpl.FINDER_CACHE_ENABLED,
			QlvtCapPhepGplvPhuongTienImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QlvtCapPhepGplvPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QlvtCapPhepGplvPhuongTienModelImpl.FINDER_CACHE_ENABLED,
			QlvtCapPhepGplvPhuongTienImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QlvtCapPhepGplvPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QlvtCapPhepGplvPhuongTienModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public QlvtCapPhepGplvPhuongTienPersistenceImpl() {
		setModelClass(QlvtCapPhepGplvPhuongTien.class);
	}

	/**
	 * Caches the qlvt cap phep gplv phuong tien in the entity cache if it is enabled.
	 *
	 * @param qlvtCapPhepGplvPhuongTien the qlvt cap phep gplv phuong tien
	 */
	@Override
	public void cacheResult(QlvtCapPhepGplvPhuongTien qlvtCapPhepGplvPhuongTien) {
		EntityCacheUtil.putResult(QlvtCapPhepGplvPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QlvtCapPhepGplvPhuongTienImpl.class,
			qlvtCapPhepGplvPhuongTien.getPrimaryKey(), qlvtCapPhepGplvPhuongTien);

		qlvtCapPhepGplvPhuongTien.resetOriginalValues();
	}

	/**
	 * Caches the qlvt cap phep gplv phuong tiens in the entity cache if it is enabled.
	 *
	 * @param qlvtCapPhepGplvPhuongTiens the qlvt cap phep gplv phuong tiens
	 */
	@Override
	public void cacheResult(
		List<QlvtCapPhepGplvPhuongTien> qlvtCapPhepGplvPhuongTiens) {
		for (QlvtCapPhepGplvPhuongTien qlvtCapPhepGplvPhuongTien : qlvtCapPhepGplvPhuongTiens) {
			if (EntityCacheUtil.getResult(
						QlvtCapPhepGplvPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
						QlvtCapPhepGplvPhuongTienImpl.class,
						qlvtCapPhepGplvPhuongTien.getPrimaryKey()) == null) {
				cacheResult(qlvtCapPhepGplvPhuongTien);
			}
			else {
				qlvtCapPhepGplvPhuongTien.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qlvt cap phep gplv phuong tiens.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QlvtCapPhepGplvPhuongTienImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QlvtCapPhepGplvPhuongTienImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qlvt cap phep gplv phuong tien.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QlvtCapPhepGplvPhuongTien qlvtCapPhepGplvPhuongTien) {
		EntityCacheUtil.removeResult(QlvtCapPhepGplvPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QlvtCapPhepGplvPhuongTienImpl.class,
			qlvtCapPhepGplvPhuongTien.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<QlvtCapPhepGplvPhuongTien> qlvtCapPhepGplvPhuongTiens) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QlvtCapPhepGplvPhuongTien qlvtCapPhepGplvPhuongTien : qlvtCapPhepGplvPhuongTiens) {
			EntityCacheUtil.removeResult(QlvtCapPhepGplvPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
				QlvtCapPhepGplvPhuongTienImpl.class,
				qlvtCapPhepGplvPhuongTien.getPrimaryKey());
		}
	}

	/**
	 * Creates a new qlvt cap phep gplv phuong tien with the primary key. Does not add the qlvt cap phep gplv phuong tien to the database.
	 *
	 * @param id the primary key for the new qlvt cap phep gplv phuong tien
	 * @return the new qlvt cap phep gplv phuong tien
	 */
	@Override
	public QlvtCapPhepGplvPhuongTien create(long id) {
		QlvtCapPhepGplvPhuongTien qlvtCapPhepGplvPhuongTien = new QlvtCapPhepGplvPhuongTienImpl();

		qlvtCapPhepGplvPhuongTien.setNew(true);
		qlvtCapPhepGplvPhuongTien.setPrimaryKey(id);

		return qlvtCapPhepGplvPhuongTien;
	}

	/**
	 * Removes the qlvt cap phep gplv phuong tien with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the qlvt cap phep gplv phuong tien
	 * @return the qlvt cap phep gplv phuong tien that was removed
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepGplvPhuongTienException if a qlvt cap phep gplv phuong tien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtCapPhepGplvPhuongTien remove(long id)
		throws NoSuchQlvtCapPhepGplvPhuongTienException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the qlvt cap phep gplv phuong tien with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qlvt cap phep gplv phuong tien
	 * @return the qlvt cap phep gplv phuong tien that was removed
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepGplvPhuongTienException if a qlvt cap phep gplv phuong tien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtCapPhepGplvPhuongTien remove(Serializable primaryKey)
		throws NoSuchQlvtCapPhepGplvPhuongTienException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QlvtCapPhepGplvPhuongTien qlvtCapPhepGplvPhuongTien = (QlvtCapPhepGplvPhuongTien)session.get(QlvtCapPhepGplvPhuongTienImpl.class,
					primaryKey);

			if (qlvtCapPhepGplvPhuongTien == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQlvtCapPhepGplvPhuongTienException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtCapPhepGplvPhuongTien);
		}
		catch (NoSuchQlvtCapPhepGplvPhuongTienException nsee) {
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
	protected QlvtCapPhepGplvPhuongTien removeImpl(
		QlvtCapPhepGplvPhuongTien qlvtCapPhepGplvPhuongTien)
		throws SystemException {
		qlvtCapPhepGplvPhuongTien = toUnwrappedModel(qlvtCapPhepGplvPhuongTien);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtCapPhepGplvPhuongTien)) {
				qlvtCapPhepGplvPhuongTien = (QlvtCapPhepGplvPhuongTien)session.get(QlvtCapPhepGplvPhuongTienImpl.class,
						qlvtCapPhepGplvPhuongTien.getPrimaryKeyObj());
			}

			if (qlvtCapPhepGplvPhuongTien != null) {
				session.delete(qlvtCapPhepGplvPhuongTien);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtCapPhepGplvPhuongTien != null) {
			clearCache(qlvtCapPhepGplvPhuongTien);
		}

		return qlvtCapPhepGplvPhuongTien;
	}

	@Override
	public QlvtCapPhepGplvPhuongTien updateImpl(
		vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvPhuongTien qlvtCapPhepGplvPhuongTien)
		throws SystemException {
		qlvtCapPhepGplvPhuongTien = toUnwrappedModel(qlvtCapPhepGplvPhuongTien);

		boolean isNew = qlvtCapPhepGplvPhuongTien.isNew();

		Session session = null;

		try {
			session = openSession();

			if (qlvtCapPhepGplvPhuongTien.isNew()) {
				session.save(qlvtCapPhepGplvPhuongTien);

				qlvtCapPhepGplvPhuongTien.setNew(false);
			}
			else {
				session.merge(qlvtCapPhepGplvPhuongTien);
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

		EntityCacheUtil.putResult(QlvtCapPhepGplvPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QlvtCapPhepGplvPhuongTienImpl.class,
			qlvtCapPhepGplvPhuongTien.getPrimaryKey(), qlvtCapPhepGplvPhuongTien);

		return qlvtCapPhepGplvPhuongTien;
	}

	protected QlvtCapPhepGplvPhuongTien toUnwrappedModel(
		QlvtCapPhepGplvPhuongTien qlvtCapPhepGplvPhuongTien) {
		if (qlvtCapPhepGplvPhuongTien instanceof QlvtCapPhepGplvPhuongTienImpl) {
			return qlvtCapPhepGplvPhuongTien;
		}

		QlvtCapPhepGplvPhuongTienImpl qlvtCapPhepGplvPhuongTienImpl = new QlvtCapPhepGplvPhuongTienImpl();

		qlvtCapPhepGplvPhuongTienImpl.setNew(qlvtCapPhepGplvPhuongTien.isNew());
		qlvtCapPhepGplvPhuongTienImpl.setPrimaryKey(qlvtCapPhepGplvPhuongTien.getPrimaryKey());

		qlvtCapPhepGplvPhuongTienImpl.setId(qlvtCapPhepGplvPhuongTien.getId());
		qlvtCapPhepGplvPhuongTienImpl.setGiayPhepLienVanId(qlvtCapPhepGplvPhuongTien.getGiayPhepLienVanId());
		qlvtCapPhepGplvPhuongTienImpl.setSoPhuHieu(qlvtCapPhepGplvPhuongTien.getSoPhuHieu());
		qlvtCapPhepGplvPhuongTienImpl.setNgayCapPhep(qlvtCapPhepGplvPhuongTien.getNgayCapPhep());
		qlvtCapPhepGplvPhuongTienImpl.setNgayGiaHan(qlvtCapPhepGplvPhuongTien.getNgayGiaHan());
		qlvtCapPhepGplvPhuongTienImpl.setNgayHetHan(qlvtCapPhepGplvPhuongTien.getNgayHetHan());
		qlvtCapPhepGplvPhuongTienImpl.setCuaKhau(qlvtCapPhepGplvPhuongTien.getCuaKhau());
		qlvtCapPhepGplvPhuongTienImpl.setMaCuaKhau(qlvtCapPhepGplvPhuongTien.getMaCuaKhau());
		qlvtCapPhepGplvPhuongTienImpl.setHinhThucHoatDong(qlvtCapPhepGplvPhuongTien.getHinhThucHoatDong());
		qlvtCapPhepGplvPhuongTienImpl.setThoiHanPhuHieu(qlvtCapPhepGplvPhuongTien.getThoiHanPhuHieu());
		qlvtCapPhepGplvPhuongTienImpl.setSoHuu(qlvtCapPhepGplvPhuongTien.getSoHuu());
		qlvtCapPhepGplvPhuongTienImpl.setChuSoHuu(qlvtCapPhepGplvPhuongTien.getChuSoHuu());
		qlvtCapPhepGplvPhuongTienImpl.setThoiHanChoThue(qlvtCapPhepGplvPhuongTien.getThoiHanChoThue());
		qlvtCapPhepGplvPhuongTienImpl.setHopDongSauCung(qlvtCapPhepGplvPhuongTien.getHopDongSauCung());
		qlvtCapPhepGplvPhuongTienImpl.setMucPhi(qlvtCapPhepGplvPhuongTien.getMucPhi());
		qlvtCapPhepGplvPhuongTienImpl.setThongTinXuLyViPham(qlvtCapPhepGplvPhuongTien.getThongTinXuLyViPham());
		qlvtCapPhepGplvPhuongTienImpl.setTrangThai(qlvtCapPhepGplvPhuongTien.getTrangThai());
		qlvtCapPhepGplvPhuongTienImpl.setFileId(qlvtCapPhepGplvPhuongTien.getFileId());

		return qlvtCapPhepGplvPhuongTienImpl;
	}

	/**
	 * Returns the qlvt cap phep gplv phuong tien with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt cap phep gplv phuong tien
	 * @return the qlvt cap phep gplv phuong tien
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepGplvPhuongTienException if a qlvt cap phep gplv phuong tien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtCapPhepGplvPhuongTien findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQlvtCapPhepGplvPhuongTienException, SystemException {
		QlvtCapPhepGplvPhuongTien qlvtCapPhepGplvPhuongTien = fetchByPrimaryKey(primaryKey);

		if (qlvtCapPhepGplvPhuongTien == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQlvtCapPhepGplvPhuongTienException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtCapPhepGplvPhuongTien;
	}

	/**
	 * Returns the qlvt cap phep gplv phuong tien with the primary key or throws a {@link vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepGplvPhuongTienException} if it could not be found.
	 *
	 * @param id the primary key of the qlvt cap phep gplv phuong tien
	 * @return the qlvt cap phep gplv phuong tien
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepGplvPhuongTienException if a qlvt cap phep gplv phuong tien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtCapPhepGplvPhuongTien findByPrimaryKey(long id)
		throws NoSuchQlvtCapPhepGplvPhuongTienException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the qlvt cap phep gplv phuong tien with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt cap phep gplv phuong tien
	 * @return the qlvt cap phep gplv phuong tien, or <code>null</code> if a qlvt cap phep gplv phuong tien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtCapPhepGplvPhuongTien fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QlvtCapPhepGplvPhuongTien qlvtCapPhepGplvPhuongTien = (QlvtCapPhepGplvPhuongTien)EntityCacheUtil.getResult(QlvtCapPhepGplvPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
				QlvtCapPhepGplvPhuongTienImpl.class, primaryKey);

		if (qlvtCapPhepGplvPhuongTien == _nullQlvtCapPhepGplvPhuongTien) {
			return null;
		}

		if (qlvtCapPhepGplvPhuongTien == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtCapPhepGplvPhuongTien = (QlvtCapPhepGplvPhuongTien)session.get(QlvtCapPhepGplvPhuongTienImpl.class,
						primaryKey);

				if (qlvtCapPhepGplvPhuongTien != null) {
					cacheResult(qlvtCapPhepGplvPhuongTien);
				}
				else {
					EntityCacheUtil.putResult(QlvtCapPhepGplvPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
						QlvtCapPhepGplvPhuongTienImpl.class, primaryKey,
						_nullQlvtCapPhepGplvPhuongTien);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QlvtCapPhepGplvPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
					QlvtCapPhepGplvPhuongTienImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtCapPhepGplvPhuongTien;
	}

	/**
	 * Returns the qlvt cap phep gplv phuong tien with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the qlvt cap phep gplv phuong tien
	 * @return the qlvt cap phep gplv phuong tien, or <code>null</code> if a qlvt cap phep gplv phuong tien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtCapPhepGplvPhuongTien fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the qlvt cap phep gplv phuong tiens.
	 *
	 * @return the qlvt cap phep gplv phuong tiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtCapPhepGplvPhuongTien> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt cap phep gplv phuong tiens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGplvPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt cap phep gplv phuong tiens
	 * @param end the upper bound of the range of qlvt cap phep gplv phuong tiens (not inclusive)
	 * @return the range of qlvt cap phep gplv phuong tiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtCapPhepGplvPhuongTien> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt cap phep gplv phuong tiens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGplvPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt cap phep gplv phuong tiens
	 * @param end the upper bound of the range of qlvt cap phep gplv phuong tiens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qlvt cap phep gplv phuong tiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtCapPhepGplvPhuongTien> findAll(int start, int end,
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

		List<QlvtCapPhepGplvPhuongTien> list = (List<QlvtCapPhepGplvPhuongTien>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTCAPPHEPGPLVPHUONGTIEN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTCAPPHEPGPLVPHUONGTIEN;

				if (pagination) {
					sql = sql.concat(QlvtCapPhepGplvPhuongTienModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QlvtCapPhepGplvPhuongTien>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtCapPhepGplvPhuongTien>(list);
				}
				else {
					list = (List<QlvtCapPhepGplvPhuongTien>)QueryUtil.list(q,
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
	 * Removes all the qlvt cap phep gplv phuong tiens from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QlvtCapPhepGplvPhuongTien qlvtCapPhepGplvPhuongTien : findAll()) {
			remove(qlvtCapPhepGplvPhuongTien);
		}
	}

	/**
	 * Returns the number of qlvt cap phep gplv phuong tiens.
	 *
	 * @return the number of qlvt cap phep gplv phuong tiens
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

				Query q = session.createQuery(_SQL_COUNT_QLVTCAPPHEPGPLVPHUONGTIEN);

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
	 * Initializes the qlvt cap phep gplv phuong tien persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvPhuongTien")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QlvtCapPhepGplvPhuongTien>> listenersList = new ArrayList<ModelListener<QlvtCapPhepGplvPhuongTien>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QlvtCapPhepGplvPhuongTien>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QlvtCapPhepGplvPhuongTienImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTCAPPHEPGPLVPHUONGTIEN = "SELECT qlvtCapPhepGplvPhuongTien FROM QlvtCapPhepGplvPhuongTien qlvtCapPhepGplvPhuongTien";
	private static final String _SQL_COUNT_QLVTCAPPHEPGPLVPHUONGTIEN = "SELECT COUNT(qlvtCapPhepGplvPhuongTien) FROM QlvtCapPhepGplvPhuongTien qlvtCapPhepGplvPhuongTien";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtCapPhepGplvPhuongTien.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QlvtCapPhepGplvPhuongTien exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QlvtCapPhepGplvPhuongTienPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "giayPhepLienVanId", "soPhuHieu", "ngayCapPhep",
				"ngayGiaHan", "ngayHetHan", "cuaKhau", "maCuaKhau",
				"hinhThucHoatDong", "thoiHanPhuHieu", "soHuu", "chuSoHuu",
				"thoiHanChoThue", "hopDongSauCung", "mucPhi",
				"thongTinXuLyViPham", "trangThai", "fileId"
			});
	private static QlvtCapPhepGplvPhuongTien _nullQlvtCapPhepGplvPhuongTien = new QlvtCapPhepGplvPhuongTienImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QlvtCapPhepGplvPhuongTien> toCacheModel() {
				return _nullQlvtCapPhepGplvPhuongTienCacheModel;
			}
		};

	private static CacheModel<QlvtCapPhepGplvPhuongTien> _nullQlvtCapPhepGplvPhuongTienCacheModel =
		new CacheModel<QlvtCapPhepGplvPhuongTien>() {
			@Override
			public QlvtCapPhepGplvPhuongTien toEntityModel() {
				return _nullQlvtCapPhepGplvPhuongTien;
			}
		};
}