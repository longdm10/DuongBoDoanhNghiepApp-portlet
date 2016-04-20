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

import vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuPhuongTienTuyenException;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTienTuyen;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyPhuHieuPhuongTienTuyenImpl;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyPhuHieuPhuongTienTuyenModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the q l v t xu ly phu hieu phuong tien tuyen service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author binhta
 * @see QLVTXuLyPhuHieuPhuongTienTuyenPersistence
 * @see QLVTXuLyPhuHieuPhuongTienTuyenUtil
 * @generated
 */
public class QLVTXuLyPhuHieuPhuongTienTuyenPersistenceImpl
	extends BasePersistenceImpl<QLVTXuLyPhuHieuPhuongTienTuyen>
	implements QLVTXuLyPhuHieuPhuongTienTuyenPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QLVTXuLyPhuHieuPhuongTienTuyenUtil} to access the q l v t xu ly phu hieu phuong tien tuyen persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QLVTXuLyPhuHieuPhuongTienTuyenImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QLVTXuLyPhuHieuPhuongTienTuyenModelImpl.ENTITY_CACHE_ENABLED,
			QLVTXuLyPhuHieuPhuongTienTuyenModelImpl.FINDER_CACHE_ENABLED,
			QLVTXuLyPhuHieuPhuongTienTuyenImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QLVTXuLyPhuHieuPhuongTienTuyenModelImpl.ENTITY_CACHE_ENABLED,
			QLVTXuLyPhuHieuPhuongTienTuyenModelImpl.FINDER_CACHE_ENABLED,
			QLVTXuLyPhuHieuPhuongTienTuyenImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QLVTXuLyPhuHieuPhuongTienTuyenModelImpl.ENTITY_CACHE_ENABLED,
			QLVTXuLyPhuHieuPhuongTienTuyenModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public QLVTXuLyPhuHieuPhuongTienTuyenPersistenceImpl() {
		setModelClass(QLVTXuLyPhuHieuPhuongTienTuyen.class);
	}

	/**
	 * Caches the q l v t xu ly phu hieu phuong tien tuyen in the entity cache if it is enabled.
	 *
	 * @param qlvtXuLyPhuHieuPhuongTienTuyen the q l v t xu ly phu hieu phuong tien tuyen
	 */
	@Override
	public void cacheResult(
		QLVTXuLyPhuHieuPhuongTienTuyen qlvtXuLyPhuHieuPhuongTienTuyen) {
		EntityCacheUtil.putResult(QLVTXuLyPhuHieuPhuongTienTuyenModelImpl.ENTITY_CACHE_ENABLED,
			QLVTXuLyPhuHieuPhuongTienTuyenImpl.class,
			qlvtXuLyPhuHieuPhuongTienTuyen.getPrimaryKey(),
			qlvtXuLyPhuHieuPhuongTienTuyen);

		qlvtXuLyPhuHieuPhuongTienTuyen.resetOriginalValues();
	}

	/**
	 * Caches the q l v t xu ly phu hieu phuong tien tuyens in the entity cache if it is enabled.
	 *
	 * @param qlvtXuLyPhuHieuPhuongTienTuyens the q l v t xu ly phu hieu phuong tien tuyens
	 */
	@Override
	public void cacheResult(
		List<QLVTXuLyPhuHieuPhuongTienTuyen> qlvtXuLyPhuHieuPhuongTienTuyens) {
		for (QLVTXuLyPhuHieuPhuongTienTuyen qlvtXuLyPhuHieuPhuongTienTuyen : qlvtXuLyPhuHieuPhuongTienTuyens) {
			if (EntityCacheUtil.getResult(
						QLVTXuLyPhuHieuPhuongTienTuyenModelImpl.ENTITY_CACHE_ENABLED,
						QLVTXuLyPhuHieuPhuongTienTuyenImpl.class,
						qlvtXuLyPhuHieuPhuongTienTuyen.getPrimaryKey()) == null) {
				cacheResult(qlvtXuLyPhuHieuPhuongTienTuyen);
			}
			else {
				qlvtXuLyPhuHieuPhuongTienTuyen.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all q l v t xu ly phu hieu phuong tien tuyens.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QLVTXuLyPhuHieuPhuongTienTuyenImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QLVTXuLyPhuHieuPhuongTienTuyenImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the q l v t xu ly phu hieu phuong tien tuyen.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		QLVTXuLyPhuHieuPhuongTienTuyen qlvtXuLyPhuHieuPhuongTienTuyen) {
		EntityCacheUtil.removeResult(QLVTXuLyPhuHieuPhuongTienTuyenModelImpl.ENTITY_CACHE_ENABLED,
			QLVTXuLyPhuHieuPhuongTienTuyenImpl.class,
			qlvtXuLyPhuHieuPhuongTienTuyen.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<QLVTXuLyPhuHieuPhuongTienTuyen> qlvtXuLyPhuHieuPhuongTienTuyens) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QLVTXuLyPhuHieuPhuongTienTuyen qlvtXuLyPhuHieuPhuongTienTuyen : qlvtXuLyPhuHieuPhuongTienTuyens) {
			EntityCacheUtil.removeResult(QLVTXuLyPhuHieuPhuongTienTuyenModelImpl.ENTITY_CACHE_ENABLED,
				QLVTXuLyPhuHieuPhuongTienTuyenImpl.class,
				qlvtXuLyPhuHieuPhuongTienTuyen.getPrimaryKey());
		}
	}

	/**
	 * Creates a new q l v t xu ly phu hieu phuong tien tuyen with the primary key. Does not add the q l v t xu ly phu hieu phuong tien tuyen to the database.
	 *
	 * @param id the primary key for the new q l v t xu ly phu hieu phuong tien tuyen
	 * @return the new q l v t xu ly phu hieu phuong tien tuyen
	 */
	@Override
	public QLVTXuLyPhuHieuPhuongTienTuyen create(int id) {
		QLVTXuLyPhuHieuPhuongTienTuyen qlvtXuLyPhuHieuPhuongTienTuyen = new QLVTXuLyPhuHieuPhuongTienTuyenImpl();

		qlvtXuLyPhuHieuPhuongTienTuyen.setNew(true);
		qlvtXuLyPhuHieuPhuongTienTuyen.setPrimaryKey(id);

		return qlvtXuLyPhuHieuPhuongTienTuyen;
	}

	/**
	 * Removes the q l v t xu ly phu hieu phuong tien tuyen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the q l v t xu ly phu hieu phuong tien tuyen
	 * @return the q l v t xu ly phu hieu phuong tien tuyen that was removed
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuPhuongTienTuyenException if a q l v t xu ly phu hieu phuong tien tuyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyPhuHieuPhuongTienTuyen remove(int id)
		throws NoSuchQLVTXuLyPhuHieuPhuongTienTuyenException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the q l v t xu ly phu hieu phuong tien tuyen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the q l v t xu ly phu hieu phuong tien tuyen
	 * @return the q l v t xu ly phu hieu phuong tien tuyen that was removed
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuPhuongTienTuyenException if a q l v t xu ly phu hieu phuong tien tuyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyPhuHieuPhuongTienTuyen remove(Serializable primaryKey)
		throws NoSuchQLVTXuLyPhuHieuPhuongTienTuyenException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QLVTXuLyPhuHieuPhuongTienTuyen qlvtXuLyPhuHieuPhuongTienTuyen = (QLVTXuLyPhuHieuPhuongTienTuyen)session.get(QLVTXuLyPhuHieuPhuongTienTuyenImpl.class,
					primaryKey);

			if (qlvtXuLyPhuHieuPhuongTienTuyen == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQLVTXuLyPhuHieuPhuongTienTuyenException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtXuLyPhuHieuPhuongTienTuyen);
		}
		catch (NoSuchQLVTXuLyPhuHieuPhuongTienTuyenException nsee) {
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
	protected QLVTXuLyPhuHieuPhuongTienTuyen removeImpl(
		QLVTXuLyPhuHieuPhuongTienTuyen qlvtXuLyPhuHieuPhuongTienTuyen)
		throws SystemException {
		qlvtXuLyPhuHieuPhuongTienTuyen = toUnwrappedModel(qlvtXuLyPhuHieuPhuongTienTuyen);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtXuLyPhuHieuPhuongTienTuyen)) {
				qlvtXuLyPhuHieuPhuongTienTuyen = (QLVTXuLyPhuHieuPhuongTienTuyen)session.get(QLVTXuLyPhuHieuPhuongTienTuyenImpl.class,
						qlvtXuLyPhuHieuPhuongTienTuyen.getPrimaryKeyObj());
			}

			if (qlvtXuLyPhuHieuPhuongTienTuyen != null) {
				session.delete(qlvtXuLyPhuHieuPhuongTienTuyen);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtXuLyPhuHieuPhuongTienTuyen != null) {
			clearCache(qlvtXuLyPhuHieuPhuongTienTuyen);
		}

		return qlvtXuLyPhuHieuPhuongTienTuyen;
	}

	@Override
	public QLVTXuLyPhuHieuPhuongTienTuyen updateImpl(
		vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTienTuyen qlvtXuLyPhuHieuPhuongTienTuyen)
		throws SystemException {
		qlvtXuLyPhuHieuPhuongTienTuyen = toUnwrappedModel(qlvtXuLyPhuHieuPhuongTienTuyen);

		boolean isNew = qlvtXuLyPhuHieuPhuongTienTuyen.isNew();

		Session session = null;

		try {
			session = openSession();

			if (qlvtXuLyPhuHieuPhuongTienTuyen.isNew()) {
				session.save(qlvtXuLyPhuHieuPhuongTienTuyen);

				qlvtXuLyPhuHieuPhuongTienTuyen.setNew(false);
			}
			else {
				session.merge(qlvtXuLyPhuHieuPhuongTienTuyen);
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

		EntityCacheUtil.putResult(QLVTXuLyPhuHieuPhuongTienTuyenModelImpl.ENTITY_CACHE_ENABLED,
			QLVTXuLyPhuHieuPhuongTienTuyenImpl.class,
			qlvtXuLyPhuHieuPhuongTienTuyen.getPrimaryKey(),
			qlvtXuLyPhuHieuPhuongTienTuyen);

		return qlvtXuLyPhuHieuPhuongTienTuyen;
	}

	protected QLVTXuLyPhuHieuPhuongTienTuyen toUnwrappedModel(
		QLVTXuLyPhuHieuPhuongTienTuyen qlvtXuLyPhuHieuPhuongTienTuyen) {
		if (qlvtXuLyPhuHieuPhuongTienTuyen instanceof QLVTXuLyPhuHieuPhuongTienTuyenImpl) {
			return qlvtXuLyPhuHieuPhuongTienTuyen;
		}

		QLVTXuLyPhuHieuPhuongTienTuyenImpl qlvtXuLyPhuHieuPhuongTienTuyenImpl = new QLVTXuLyPhuHieuPhuongTienTuyenImpl();

		qlvtXuLyPhuHieuPhuongTienTuyenImpl.setNew(qlvtXuLyPhuHieuPhuongTienTuyen.isNew());
		qlvtXuLyPhuHieuPhuongTienTuyenImpl.setPrimaryKey(qlvtXuLyPhuHieuPhuongTienTuyen.getPrimaryKey());

		qlvtXuLyPhuHieuPhuongTienTuyenImpl.setId(qlvtXuLyPhuHieuPhuongTienTuyen.getId());
		qlvtXuLyPhuHieuPhuongTienTuyenImpl.setPtCapPhuHieuId(qlvtXuLyPhuHieuPhuongTienTuyen.getPtCapPhuHieuId());
		qlvtXuLyPhuHieuPhuongTienTuyenImpl.setMaTuyen(qlvtXuLyPhuHieuPhuongTienTuyen.getMaTuyen());
		qlvtXuLyPhuHieuPhuongTienTuyenImpl.setTenTuyen(qlvtXuLyPhuHieuPhuongTienTuyen.getTenTuyen());

		return qlvtXuLyPhuHieuPhuongTienTuyenImpl;
	}

	/**
	 * Returns the q l v t xu ly phu hieu phuong tien tuyen with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the q l v t xu ly phu hieu phuong tien tuyen
	 * @return the q l v t xu ly phu hieu phuong tien tuyen
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuPhuongTienTuyenException if a q l v t xu ly phu hieu phuong tien tuyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyPhuHieuPhuongTienTuyen findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchQLVTXuLyPhuHieuPhuongTienTuyenException, SystemException {
		QLVTXuLyPhuHieuPhuongTienTuyen qlvtXuLyPhuHieuPhuongTienTuyen = fetchByPrimaryKey(primaryKey);

		if (qlvtXuLyPhuHieuPhuongTienTuyen == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQLVTXuLyPhuHieuPhuongTienTuyenException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtXuLyPhuHieuPhuongTienTuyen;
	}

	/**
	 * Returns the q l v t xu ly phu hieu phuong tien tuyen with the primary key or throws a {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuPhuongTienTuyenException} if it could not be found.
	 *
	 * @param id the primary key of the q l v t xu ly phu hieu phuong tien tuyen
	 * @return the q l v t xu ly phu hieu phuong tien tuyen
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuPhuongTienTuyenException if a q l v t xu ly phu hieu phuong tien tuyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyPhuHieuPhuongTienTuyen findByPrimaryKey(int id)
		throws NoSuchQLVTXuLyPhuHieuPhuongTienTuyenException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the q l v t xu ly phu hieu phuong tien tuyen with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the q l v t xu ly phu hieu phuong tien tuyen
	 * @return the q l v t xu ly phu hieu phuong tien tuyen, or <code>null</code> if a q l v t xu ly phu hieu phuong tien tuyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyPhuHieuPhuongTienTuyen fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		QLVTXuLyPhuHieuPhuongTienTuyen qlvtXuLyPhuHieuPhuongTienTuyen = (QLVTXuLyPhuHieuPhuongTienTuyen)EntityCacheUtil.getResult(QLVTXuLyPhuHieuPhuongTienTuyenModelImpl.ENTITY_CACHE_ENABLED,
				QLVTXuLyPhuHieuPhuongTienTuyenImpl.class, primaryKey);

		if (qlvtXuLyPhuHieuPhuongTienTuyen == _nullQLVTXuLyPhuHieuPhuongTienTuyen) {
			return null;
		}

		if (qlvtXuLyPhuHieuPhuongTienTuyen == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtXuLyPhuHieuPhuongTienTuyen = (QLVTXuLyPhuHieuPhuongTienTuyen)session.get(QLVTXuLyPhuHieuPhuongTienTuyenImpl.class,
						primaryKey);

				if (qlvtXuLyPhuHieuPhuongTienTuyen != null) {
					cacheResult(qlvtXuLyPhuHieuPhuongTienTuyen);
				}
				else {
					EntityCacheUtil.putResult(QLVTXuLyPhuHieuPhuongTienTuyenModelImpl.ENTITY_CACHE_ENABLED,
						QLVTXuLyPhuHieuPhuongTienTuyenImpl.class, primaryKey,
						_nullQLVTXuLyPhuHieuPhuongTienTuyen);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QLVTXuLyPhuHieuPhuongTienTuyenModelImpl.ENTITY_CACHE_ENABLED,
					QLVTXuLyPhuHieuPhuongTienTuyenImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtXuLyPhuHieuPhuongTienTuyen;
	}

	/**
	 * Returns the q l v t xu ly phu hieu phuong tien tuyen with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the q l v t xu ly phu hieu phuong tien tuyen
	 * @return the q l v t xu ly phu hieu phuong tien tuyen, or <code>null</code> if a q l v t xu ly phu hieu phuong tien tuyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyPhuHieuPhuongTienTuyen fetchByPrimaryKey(int id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the q l v t xu ly phu hieu phuong tien tuyens.
	 *
	 * @return the q l v t xu ly phu hieu phuong tien tuyens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QLVTXuLyPhuHieuPhuongTienTuyen> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the q l v t xu ly phu hieu phuong tien tuyens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyPhuHieuPhuongTienTuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of q l v t xu ly phu hieu phuong tien tuyens
	 * @param end the upper bound of the range of q l v t xu ly phu hieu phuong tien tuyens (not inclusive)
	 * @return the range of q l v t xu ly phu hieu phuong tien tuyens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QLVTXuLyPhuHieuPhuongTienTuyen> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the q l v t xu ly phu hieu phuong tien tuyens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyPhuHieuPhuongTienTuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of q l v t xu ly phu hieu phuong tien tuyens
	 * @param end the upper bound of the range of q l v t xu ly phu hieu phuong tien tuyens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of q l v t xu ly phu hieu phuong tien tuyens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QLVTXuLyPhuHieuPhuongTienTuyen> findAll(int start, int end,
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

		List<QLVTXuLyPhuHieuPhuongTienTuyen> list = (List<QLVTXuLyPhuHieuPhuongTienTuyen>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTXULYPHUHIEUPHUONGTIENTUYEN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTXULYPHUHIEUPHUONGTIENTUYEN;

				if (pagination) {
					sql = sql.concat(QLVTXuLyPhuHieuPhuongTienTuyenModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QLVTXuLyPhuHieuPhuongTienTuyen>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QLVTXuLyPhuHieuPhuongTienTuyen>(list);
				}
				else {
					list = (List<QLVTXuLyPhuHieuPhuongTienTuyen>)QueryUtil.list(q,
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
	 * Removes all the q l v t xu ly phu hieu phuong tien tuyens from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QLVTXuLyPhuHieuPhuongTienTuyen qlvtXuLyPhuHieuPhuongTienTuyen : findAll()) {
			remove(qlvtXuLyPhuHieuPhuongTienTuyen);
		}
	}

	/**
	 * Returns the number of q l v t xu ly phu hieu phuong tien tuyens.
	 *
	 * @return the number of q l v t xu ly phu hieu phuong tien tuyens
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

				Query q = session.createQuery(_SQL_COUNT_QLVTXULYPHUHIEUPHUONGTIENTUYEN);

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
	 * Initializes the q l v t xu ly phu hieu phuong tien tuyen persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTienTuyen")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QLVTXuLyPhuHieuPhuongTienTuyen>> listenersList =
					new ArrayList<ModelListener<QLVTXuLyPhuHieuPhuongTienTuyen>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QLVTXuLyPhuHieuPhuongTienTuyen>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QLVTXuLyPhuHieuPhuongTienTuyenImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTXULYPHUHIEUPHUONGTIENTUYEN = "SELECT qlvtXuLyPhuHieuPhuongTienTuyen FROM QLVTXuLyPhuHieuPhuongTienTuyen qlvtXuLyPhuHieuPhuongTienTuyen";
	private static final String _SQL_COUNT_QLVTXULYPHUHIEUPHUONGTIENTUYEN = "SELECT COUNT(qlvtXuLyPhuHieuPhuongTienTuyen) FROM QLVTXuLyPhuHieuPhuongTienTuyen qlvtXuLyPhuHieuPhuongTienTuyen";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtXuLyPhuHieuPhuongTienTuyen.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QLVTXuLyPhuHieuPhuongTienTuyen exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QLVTXuLyPhuHieuPhuongTienTuyenPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "ptCapPhuHieuId", "maTuyen", "tenTuyen"
			});
	private static QLVTXuLyPhuHieuPhuongTienTuyen _nullQLVTXuLyPhuHieuPhuongTienTuyen =
		new QLVTXuLyPhuHieuPhuongTienTuyenImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QLVTXuLyPhuHieuPhuongTienTuyen> toCacheModel() {
				return _nullQLVTXuLyPhuHieuPhuongTienTuyenCacheModel;
			}
		};

	private static CacheModel<QLVTXuLyPhuHieuPhuongTienTuyen> _nullQLVTXuLyPhuHieuPhuongTienTuyenCacheModel =
		new CacheModel<QLVTXuLyPhuHieuPhuongTienTuyen>() {
			@Override
			public QLVTXuLyPhuHieuPhuongTienTuyen toEntityModel() {
				return _nullQLVTXuLyPhuHieuPhuongTienTuyen;
			}
		};
}