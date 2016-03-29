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

package vn.dtt.duongbo.dao.capbienhieuphuhieu.service.persistence;

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

import vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTPhuongTienVanTaiException;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTPhuongTienVanTai;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTPhuongTienVanTaiImpl;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTPhuongTienVanTaiModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the q l v t phuong tien van tai service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author binhta
 * @see QLVTPhuongTienVanTaiPersistence
 * @see QLVTPhuongTienVanTaiUtil
 * @generated
 */
public class QLVTPhuongTienVanTaiPersistenceImpl extends BasePersistenceImpl<QLVTPhuongTienVanTai>
	implements QLVTPhuongTienVanTaiPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QLVTPhuongTienVanTaiUtil} to access the q l v t phuong tien van tai persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QLVTPhuongTienVanTaiImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QLVTPhuongTienVanTaiModelImpl.ENTITY_CACHE_ENABLED,
			QLVTPhuongTienVanTaiModelImpl.FINDER_CACHE_ENABLED,
			QLVTPhuongTienVanTaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QLVTPhuongTienVanTaiModelImpl.ENTITY_CACHE_ENABLED,
			QLVTPhuongTienVanTaiModelImpl.FINDER_CACHE_ENABLED,
			QLVTPhuongTienVanTaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QLVTPhuongTienVanTaiModelImpl.ENTITY_CACHE_ENABLED,
			QLVTPhuongTienVanTaiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public QLVTPhuongTienVanTaiPersistenceImpl() {
		setModelClass(QLVTPhuongTienVanTai.class);
	}

	/**
	 * Caches the q l v t phuong tien van tai in the entity cache if it is enabled.
	 *
	 * @param qlvtPhuongTienVanTai the q l v t phuong tien van tai
	 */
	@Override
	public void cacheResult(QLVTPhuongTienVanTai qlvtPhuongTienVanTai) {
		EntityCacheUtil.putResult(QLVTPhuongTienVanTaiModelImpl.ENTITY_CACHE_ENABLED,
			QLVTPhuongTienVanTaiImpl.class,
			qlvtPhuongTienVanTai.getPrimaryKey(), qlvtPhuongTienVanTai);

		qlvtPhuongTienVanTai.resetOriginalValues();
	}

	/**
	 * Caches the q l v t phuong tien van tais in the entity cache if it is enabled.
	 *
	 * @param qlvtPhuongTienVanTais the q l v t phuong tien van tais
	 */
	@Override
	public void cacheResult(List<QLVTPhuongTienVanTai> qlvtPhuongTienVanTais) {
		for (QLVTPhuongTienVanTai qlvtPhuongTienVanTai : qlvtPhuongTienVanTais) {
			if (EntityCacheUtil.getResult(
						QLVTPhuongTienVanTaiModelImpl.ENTITY_CACHE_ENABLED,
						QLVTPhuongTienVanTaiImpl.class,
						qlvtPhuongTienVanTai.getPrimaryKey()) == null) {
				cacheResult(qlvtPhuongTienVanTai);
			}
			else {
				qlvtPhuongTienVanTai.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all q l v t phuong tien van tais.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QLVTPhuongTienVanTaiImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QLVTPhuongTienVanTaiImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the q l v t phuong tien van tai.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QLVTPhuongTienVanTai qlvtPhuongTienVanTai) {
		EntityCacheUtil.removeResult(QLVTPhuongTienVanTaiModelImpl.ENTITY_CACHE_ENABLED,
			QLVTPhuongTienVanTaiImpl.class, qlvtPhuongTienVanTai.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<QLVTPhuongTienVanTai> qlvtPhuongTienVanTais) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QLVTPhuongTienVanTai qlvtPhuongTienVanTai : qlvtPhuongTienVanTais) {
			EntityCacheUtil.removeResult(QLVTPhuongTienVanTaiModelImpl.ENTITY_CACHE_ENABLED,
				QLVTPhuongTienVanTaiImpl.class,
				qlvtPhuongTienVanTai.getPrimaryKey());
		}
	}

	/**
	 * Creates a new q l v t phuong tien van tai with the primary key. Does not add the q l v t phuong tien van tai to the database.
	 *
	 * @param id the primary key for the new q l v t phuong tien van tai
	 * @return the new q l v t phuong tien van tai
	 */
	@Override
	public QLVTPhuongTienVanTai create(int id) {
		QLVTPhuongTienVanTai qlvtPhuongTienVanTai = new QLVTPhuongTienVanTaiImpl();

		qlvtPhuongTienVanTai.setNew(true);
		qlvtPhuongTienVanTai.setPrimaryKey(id);

		return qlvtPhuongTienVanTai;
	}

	/**
	 * Removes the q l v t phuong tien van tai with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the q l v t phuong tien van tai
	 * @return the q l v t phuong tien van tai that was removed
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTPhuongTienVanTaiException if a q l v t phuong tien van tai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTPhuongTienVanTai remove(int id)
		throws NoSuchQLVTPhuongTienVanTaiException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the q l v t phuong tien van tai with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the q l v t phuong tien van tai
	 * @return the q l v t phuong tien van tai that was removed
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTPhuongTienVanTaiException if a q l v t phuong tien van tai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTPhuongTienVanTai remove(Serializable primaryKey)
		throws NoSuchQLVTPhuongTienVanTaiException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QLVTPhuongTienVanTai qlvtPhuongTienVanTai = (QLVTPhuongTienVanTai)session.get(QLVTPhuongTienVanTaiImpl.class,
					primaryKey);

			if (qlvtPhuongTienVanTai == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQLVTPhuongTienVanTaiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtPhuongTienVanTai);
		}
		catch (NoSuchQLVTPhuongTienVanTaiException nsee) {
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
	protected QLVTPhuongTienVanTai removeImpl(
		QLVTPhuongTienVanTai qlvtPhuongTienVanTai) throws SystemException {
		qlvtPhuongTienVanTai = toUnwrappedModel(qlvtPhuongTienVanTai);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtPhuongTienVanTai)) {
				qlvtPhuongTienVanTai = (QLVTPhuongTienVanTai)session.get(QLVTPhuongTienVanTaiImpl.class,
						qlvtPhuongTienVanTai.getPrimaryKeyObj());
			}

			if (qlvtPhuongTienVanTai != null) {
				session.delete(qlvtPhuongTienVanTai);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtPhuongTienVanTai != null) {
			clearCache(qlvtPhuongTienVanTai);
		}

		return qlvtPhuongTienVanTai;
	}

	@Override
	public QLVTPhuongTienVanTai updateImpl(
		vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTPhuongTienVanTai qlvtPhuongTienVanTai)
		throws SystemException {
		qlvtPhuongTienVanTai = toUnwrappedModel(qlvtPhuongTienVanTai);

		boolean isNew = qlvtPhuongTienVanTai.isNew();

		Session session = null;

		try {
			session = openSession();

			if (qlvtPhuongTienVanTai.isNew()) {
				session.save(qlvtPhuongTienVanTai);

				qlvtPhuongTienVanTai.setNew(false);
			}
			else {
				session.merge(qlvtPhuongTienVanTai);
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

		EntityCacheUtil.putResult(QLVTPhuongTienVanTaiModelImpl.ENTITY_CACHE_ENABLED,
			QLVTPhuongTienVanTaiImpl.class,
			qlvtPhuongTienVanTai.getPrimaryKey(), qlvtPhuongTienVanTai);

		return qlvtPhuongTienVanTai;
	}

	protected QLVTPhuongTienVanTai toUnwrappedModel(
		QLVTPhuongTienVanTai qlvtPhuongTienVanTai) {
		if (qlvtPhuongTienVanTai instanceof QLVTPhuongTienVanTaiImpl) {
			return qlvtPhuongTienVanTai;
		}

		QLVTPhuongTienVanTaiImpl qlvtPhuongTienVanTaiImpl = new QLVTPhuongTienVanTaiImpl();

		qlvtPhuongTienVanTaiImpl.setNew(qlvtPhuongTienVanTai.isNew());
		qlvtPhuongTienVanTaiImpl.setPrimaryKey(qlvtPhuongTienVanTai.getPrimaryKey());

		qlvtPhuongTienVanTaiImpl.setId(qlvtPhuongTienVanTai.getId());
		qlvtPhuongTienVanTaiImpl.setBienSoXe(qlvtPhuongTienVanTai.getBienSoXe());
		qlvtPhuongTienVanTaiImpl.setNhanHieu(qlvtPhuongTienVanTai.getNhanHieu());
		qlvtPhuongTienVanTaiImpl.setTrongTai(qlvtPhuongTienVanTai.getTrongTai());
		qlvtPhuongTienVanTaiImpl.setNoiSanXuat(qlvtPhuongTienVanTai.getNoiSanXuat());
		qlvtPhuongTienVanTaiImpl.setNamSanXuat(qlvtPhuongTienVanTai.getNamSanXuat());
		qlvtPhuongTienVanTaiImpl.setSoChoNgoi(qlvtPhuongTienVanTai.getSoChoNgoi());
		qlvtPhuongTienVanTaiImpl.setHinhThucSoHuuXe(qlvtPhuongTienVanTai.getHinhThucSoHuuXe());
		qlvtPhuongTienVanTaiImpl.setNienHanSuDungGiayDangKiem(qlvtPhuongTienVanTai.getNienHanSuDungGiayDangKiem());
		qlvtPhuongTienVanTaiImpl.setNienHanSuDungND86(qlvtPhuongTienVanTai.getNienHanSuDungND86());
		qlvtPhuongTienVanTaiImpl.setSoKhung(qlvtPhuongTienVanTai.getSoKhung());
		qlvtPhuongTienVanTaiImpl.setSoMay(qlvtPhuongTienVanTai.getSoMay());
		qlvtPhuongTienVanTaiImpl.setMauSon(qlvtPhuongTienVanTai.getMauSon());
		qlvtPhuongTienVanTaiImpl.setThongTinXuLyViPham(qlvtPhuongTienVanTai.getThongTinXuLyViPham());
		qlvtPhuongTienVanTaiImpl.setTrangThai(qlvtPhuongTienVanTai.getTrangThai());
		qlvtPhuongTienVanTaiImpl.setFileId(qlvtPhuongTienVanTai.getFileId());

		return qlvtPhuongTienVanTaiImpl;
	}

	/**
	 * Returns the q l v t phuong tien van tai with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the q l v t phuong tien van tai
	 * @return the q l v t phuong tien van tai
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTPhuongTienVanTaiException if a q l v t phuong tien van tai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTPhuongTienVanTai findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQLVTPhuongTienVanTaiException, SystemException {
		QLVTPhuongTienVanTai qlvtPhuongTienVanTai = fetchByPrimaryKey(primaryKey);

		if (qlvtPhuongTienVanTai == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQLVTPhuongTienVanTaiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtPhuongTienVanTai;
	}

	/**
	 * Returns the q l v t phuong tien van tai with the primary key or throws a {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTPhuongTienVanTaiException} if it could not be found.
	 *
	 * @param id the primary key of the q l v t phuong tien van tai
	 * @return the q l v t phuong tien van tai
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTPhuongTienVanTaiException if a q l v t phuong tien van tai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTPhuongTienVanTai findByPrimaryKey(int id)
		throws NoSuchQLVTPhuongTienVanTaiException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the q l v t phuong tien van tai with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the q l v t phuong tien van tai
	 * @return the q l v t phuong tien van tai, or <code>null</code> if a q l v t phuong tien van tai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTPhuongTienVanTai fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QLVTPhuongTienVanTai qlvtPhuongTienVanTai = (QLVTPhuongTienVanTai)EntityCacheUtil.getResult(QLVTPhuongTienVanTaiModelImpl.ENTITY_CACHE_ENABLED,
				QLVTPhuongTienVanTaiImpl.class, primaryKey);

		if (qlvtPhuongTienVanTai == _nullQLVTPhuongTienVanTai) {
			return null;
		}

		if (qlvtPhuongTienVanTai == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtPhuongTienVanTai = (QLVTPhuongTienVanTai)session.get(QLVTPhuongTienVanTaiImpl.class,
						primaryKey);

				if (qlvtPhuongTienVanTai != null) {
					cacheResult(qlvtPhuongTienVanTai);
				}
				else {
					EntityCacheUtil.putResult(QLVTPhuongTienVanTaiModelImpl.ENTITY_CACHE_ENABLED,
						QLVTPhuongTienVanTaiImpl.class, primaryKey,
						_nullQLVTPhuongTienVanTai);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QLVTPhuongTienVanTaiModelImpl.ENTITY_CACHE_ENABLED,
					QLVTPhuongTienVanTaiImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtPhuongTienVanTai;
	}

	/**
	 * Returns the q l v t phuong tien van tai with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the q l v t phuong tien van tai
	 * @return the q l v t phuong tien van tai, or <code>null</code> if a q l v t phuong tien van tai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTPhuongTienVanTai fetchByPrimaryKey(int id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the q l v t phuong tien van tais.
	 *
	 * @return the q l v t phuong tien van tais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QLVTPhuongTienVanTai> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the q l v t phuong tien van tais.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTPhuongTienVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of q l v t phuong tien van tais
	 * @param end the upper bound of the range of q l v t phuong tien van tais (not inclusive)
	 * @return the range of q l v t phuong tien van tais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QLVTPhuongTienVanTai> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the q l v t phuong tien van tais.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTPhuongTienVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of q l v t phuong tien van tais
	 * @param end the upper bound of the range of q l v t phuong tien van tais (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of q l v t phuong tien van tais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QLVTPhuongTienVanTai> findAll(int start, int end,
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

		List<QLVTPhuongTienVanTai> list = (List<QLVTPhuongTienVanTai>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTPHUONGTIENVANTAI);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTPHUONGTIENVANTAI;

				if (pagination) {
					sql = sql.concat(QLVTPhuongTienVanTaiModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QLVTPhuongTienVanTai>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QLVTPhuongTienVanTai>(list);
				}
				else {
					list = (List<QLVTPhuongTienVanTai>)QueryUtil.list(q,
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
	 * Removes all the q l v t phuong tien van tais from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QLVTPhuongTienVanTai qlvtPhuongTienVanTai : findAll()) {
			remove(qlvtPhuongTienVanTai);
		}
	}

	/**
	 * Returns the number of q l v t phuong tien van tais.
	 *
	 * @return the number of q l v t phuong tien van tais
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

				Query q = session.createQuery(_SQL_COUNT_QLVTPHUONGTIENVANTAI);

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
	 * Initializes the q l v t phuong tien van tai persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTPhuongTienVanTai")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QLVTPhuongTienVanTai>> listenersList = new ArrayList<ModelListener<QLVTPhuongTienVanTai>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QLVTPhuongTienVanTai>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QLVTPhuongTienVanTaiImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTPHUONGTIENVANTAI = "SELECT qlvtPhuongTienVanTai FROM QLVTPhuongTienVanTai qlvtPhuongTienVanTai";
	private static final String _SQL_COUNT_QLVTPHUONGTIENVANTAI = "SELECT COUNT(qlvtPhuongTienVanTai) FROM QLVTPhuongTienVanTai qlvtPhuongTienVanTai";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtPhuongTienVanTai.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QLVTPhuongTienVanTai exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QLVTPhuongTienVanTaiPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "bienSoXe", "nhanHieu", "trongTai", "noiSanXuat",
				"namSanXuat", "soChoNgoi", "hinhThucSoHuuXe",
				"nienHanSuDungGiayDangKiem", "nienHanSuDungND86", "soKhung",
				"soMay", "mauSon", "thongTinXuLyViPham", "trangThai", "fileId"
			});
	private static QLVTPhuongTienVanTai _nullQLVTPhuongTienVanTai = new QLVTPhuongTienVanTaiImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QLVTPhuongTienVanTai> toCacheModel() {
				return _nullQLVTPhuongTienVanTaiCacheModel;
			}
		};

	private static CacheModel<QLVTPhuongTienVanTai> _nullQLVTPhuongTienVanTaiCacheModel =
		new CacheModel<QLVTPhuongTienVanTai>() {
			@Override
			public QLVTPhuongTienVanTai toEntityModel() {
				return _nullQLVTPhuongTienVanTai;
			}
		};
}