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

import vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTCapPhepPhuHieuPhuongTienException;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepPhuHieuPhuongTien;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTCapPhepPhuHieuPhuongTienImpl;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTCapPhepPhuHieuPhuongTienModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the q l v t cap phep phu hieu phuong tien service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author binhta
 * @see QLVTCapPhepPhuHieuPhuongTienPersistence
 * @see QLVTCapPhepPhuHieuPhuongTienUtil
 * @generated
 */
public class QLVTCapPhepPhuHieuPhuongTienPersistenceImpl
	extends BasePersistenceImpl<QLVTCapPhepPhuHieuPhuongTien>
	implements QLVTCapPhepPhuHieuPhuongTienPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QLVTCapPhepPhuHieuPhuongTienUtil} to access the q l v t cap phep phu hieu phuong tien persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QLVTCapPhepPhuHieuPhuongTienImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QLVTCapPhepPhuHieuPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QLVTCapPhepPhuHieuPhuongTienModelImpl.FINDER_CACHE_ENABLED,
			QLVTCapPhepPhuHieuPhuongTienImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QLVTCapPhepPhuHieuPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QLVTCapPhepPhuHieuPhuongTienModelImpl.FINDER_CACHE_ENABLED,
			QLVTCapPhepPhuHieuPhuongTienImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QLVTCapPhepPhuHieuPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QLVTCapPhepPhuHieuPhuongTienModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public QLVTCapPhepPhuHieuPhuongTienPersistenceImpl() {
		setModelClass(QLVTCapPhepPhuHieuPhuongTien.class);
	}

	/**
	 * Caches the q l v t cap phep phu hieu phuong tien in the entity cache if it is enabled.
	 *
	 * @param qlvtCapPhepPhuHieuPhuongTien the q l v t cap phep phu hieu phuong tien
	 */
	@Override
	public void cacheResult(
		QLVTCapPhepPhuHieuPhuongTien qlvtCapPhepPhuHieuPhuongTien) {
		EntityCacheUtil.putResult(QLVTCapPhepPhuHieuPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QLVTCapPhepPhuHieuPhuongTienImpl.class,
			qlvtCapPhepPhuHieuPhuongTien.getPrimaryKey(),
			qlvtCapPhepPhuHieuPhuongTien);

		qlvtCapPhepPhuHieuPhuongTien.resetOriginalValues();
	}

	/**
	 * Caches the q l v t cap phep phu hieu phuong tiens in the entity cache if it is enabled.
	 *
	 * @param qlvtCapPhepPhuHieuPhuongTiens the q l v t cap phep phu hieu phuong tiens
	 */
	@Override
	public void cacheResult(
		List<QLVTCapPhepPhuHieuPhuongTien> qlvtCapPhepPhuHieuPhuongTiens) {
		for (QLVTCapPhepPhuHieuPhuongTien qlvtCapPhepPhuHieuPhuongTien : qlvtCapPhepPhuHieuPhuongTiens) {
			if (EntityCacheUtil.getResult(
						QLVTCapPhepPhuHieuPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
						QLVTCapPhepPhuHieuPhuongTienImpl.class,
						qlvtCapPhepPhuHieuPhuongTien.getPrimaryKey()) == null) {
				cacheResult(qlvtCapPhepPhuHieuPhuongTien);
			}
			else {
				qlvtCapPhepPhuHieuPhuongTien.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all q l v t cap phep phu hieu phuong tiens.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QLVTCapPhepPhuHieuPhuongTienImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QLVTCapPhepPhuHieuPhuongTienImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the q l v t cap phep phu hieu phuong tien.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		QLVTCapPhepPhuHieuPhuongTien qlvtCapPhepPhuHieuPhuongTien) {
		EntityCacheUtil.removeResult(QLVTCapPhepPhuHieuPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QLVTCapPhepPhuHieuPhuongTienImpl.class,
			qlvtCapPhepPhuHieuPhuongTien.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<QLVTCapPhepPhuHieuPhuongTien> qlvtCapPhepPhuHieuPhuongTiens) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QLVTCapPhepPhuHieuPhuongTien qlvtCapPhepPhuHieuPhuongTien : qlvtCapPhepPhuHieuPhuongTiens) {
			EntityCacheUtil.removeResult(QLVTCapPhepPhuHieuPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
				QLVTCapPhepPhuHieuPhuongTienImpl.class,
				qlvtCapPhepPhuHieuPhuongTien.getPrimaryKey());
		}
	}

	/**
	 * Creates a new q l v t cap phep phu hieu phuong tien with the primary key. Does not add the q l v t cap phep phu hieu phuong tien to the database.
	 *
	 * @param id the primary key for the new q l v t cap phep phu hieu phuong tien
	 * @return the new q l v t cap phep phu hieu phuong tien
	 */
	@Override
	public QLVTCapPhepPhuHieuPhuongTien create(int id) {
		QLVTCapPhepPhuHieuPhuongTien qlvtCapPhepPhuHieuPhuongTien = new QLVTCapPhepPhuHieuPhuongTienImpl();

		qlvtCapPhepPhuHieuPhuongTien.setNew(true);
		qlvtCapPhepPhuHieuPhuongTien.setPrimaryKey(id);

		return qlvtCapPhepPhuHieuPhuongTien;
	}

	/**
	 * Removes the q l v t cap phep phu hieu phuong tien with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the q l v t cap phep phu hieu phuong tien
	 * @return the q l v t cap phep phu hieu phuong tien that was removed
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTCapPhepPhuHieuPhuongTienException if a q l v t cap phep phu hieu phuong tien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTCapPhepPhuHieuPhuongTien remove(int id)
		throws NoSuchQLVTCapPhepPhuHieuPhuongTienException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the q l v t cap phep phu hieu phuong tien with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the q l v t cap phep phu hieu phuong tien
	 * @return the q l v t cap phep phu hieu phuong tien that was removed
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTCapPhepPhuHieuPhuongTienException if a q l v t cap phep phu hieu phuong tien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTCapPhepPhuHieuPhuongTien remove(Serializable primaryKey)
		throws NoSuchQLVTCapPhepPhuHieuPhuongTienException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QLVTCapPhepPhuHieuPhuongTien qlvtCapPhepPhuHieuPhuongTien = (QLVTCapPhepPhuHieuPhuongTien)session.get(QLVTCapPhepPhuHieuPhuongTienImpl.class,
					primaryKey);

			if (qlvtCapPhepPhuHieuPhuongTien == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQLVTCapPhepPhuHieuPhuongTienException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtCapPhepPhuHieuPhuongTien);
		}
		catch (NoSuchQLVTCapPhepPhuHieuPhuongTienException nsee) {
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
	protected QLVTCapPhepPhuHieuPhuongTien removeImpl(
		QLVTCapPhepPhuHieuPhuongTien qlvtCapPhepPhuHieuPhuongTien)
		throws SystemException {
		qlvtCapPhepPhuHieuPhuongTien = toUnwrappedModel(qlvtCapPhepPhuHieuPhuongTien);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtCapPhepPhuHieuPhuongTien)) {
				qlvtCapPhepPhuHieuPhuongTien = (QLVTCapPhepPhuHieuPhuongTien)session.get(QLVTCapPhepPhuHieuPhuongTienImpl.class,
						qlvtCapPhepPhuHieuPhuongTien.getPrimaryKeyObj());
			}

			if (qlvtCapPhepPhuHieuPhuongTien != null) {
				session.delete(qlvtCapPhepPhuHieuPhuongTien);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtCapPhepPhuHieuPhuongTien != null) {
			clearCache(qlvtCapPhepPhuHieuPhuongTien);
		}

		return qlvtCapPhepPhuHieuPhuongTien;
	}

	@Override
	public QLVTCapPhepPhuHieuPhuongTien updateImpl(
		vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepPhuHieuPhuongTien qlvtCapPhepPhuHieuPhuongTien)
		throws SystemException {
		qlvtCapPhepPhuHieuPhuongTien = toUnwrappedModel(qlvtCapPhepPhuHieuPhuongTien);

		boolean isNew = qlvtCapPhepPhuHieuPhuongTien.isNew();

		Session session = null;

		try {
			session = openSession();

			if (qlvtCapPhepPhuHieuPhuongTien.isNew()) {
				session.save(qlvtCapPhepPhuHieuPhuongTien);

				qlvtCapPhepPhuHieuPhuongTien.setNew(false);
			}
			else {
				session.merge(qlvtCapPhepPhuHieuPhuongTien);
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

		EntityCacheUtil.putResult(QLVTCapPhepPhuHieuPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QLVTCapPhepPhuHieuPhuongTienImpl.class,
			qlvtCapPhepPhuHieuPhuongTien.getPrimaryKey(),
			qlvtCapPhepPhuHieuPhuongTien);

		return qlvtCapPhepPhuHieuPhuongTien;
	}

	protected QLVTCapPhepPhuHieuPhuongTien toUnwrappedModel(
		QLVTCapPhepPhuHieuPhuongTien qlvtCapPhepPhuHieuPhuongTien) {
		if (qlvtCapPhepPhuHieuPhuongTien instanceof QLVTCapPhepPhuHieuPhuongTienImpl) {
			return qlvtCapPhepPhuHieuPhuongTien;
		}

		QLVTCapPhepPhuHieuPhuongTienImpl qlvtCapPhepPhuHieuPhuongTienImpl = new QLVTCapPhepPhuHieuPhuongTienImpl();

		qlvtCapPhepPhuHieuPhuongTienImpl.setNew(qlvtCapPhepPhuHieuPhuongTien.isNew());
		qlvtCapPhepPhuHieuPhuongTienImpl.setPrimaryKey(qlvtCapPhepPhuHieuPhuongTien.getPrimaryKey());

		qlvtCapPhepPhuHieuPhuongTienImpl.setId(qlvtCapPhepPhuHieuPhuongTien.getId());
		qlvtCapPhepPhuHieuPhuongTienImpl.setQlvtCapPhepPhuHieuXeId(qlvtCapPhepPhuHieuPhuongTien.getQlvtCapPhepPhuHieuXeId());
		qlvtCapPhepPhuHieuPhuongTienImpl.setQlvtPhuongTienVanTaiId(qlvtCapPhepPhuHieuPhuongTien.getQlvtPhuongTienVanTaiId());
		qlvtCapPhepPhuHieuPhuongTienImpl.setTrangThai(qlvtCapPhepPhuHieuPhuongTien.getTrangThai());

		return qlvtCapPhepPhuHieuPhuongTienImpl;
	}

	/**
	 * Returns the q l v t cap phep phu hieu phuong tien with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the q l v t cap phep phu hieu phuong tien
	 * @return the q l v t cap phep phu hieu phuong tien
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTCapPhepPhuHieuPhuongTienException if a q l v t cap phep phu hieu phuong tien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTCapPhepPhuHieuPhuongTien findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchQLVTCapPhepPhuHieuPhuongTienException, SystemException {
		QLVTCapPhepPhuHieuPhuongTien qlvtCapPhepPhuHieuPhuongTien = fetchByPrimaryKey(primaryKey);

		if (qlvtCapPhepPhuHieuPhuongTien == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQLVTCapPhepPhuHieuPhuongTienException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtCapPhepPhuHieuPhuongTien;
	}

	/**
	 * Returns the q l v t cap phep phu hieu phuong tien with the primary key or throws a {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTCapPhepPhuHieuPhuongTienException} if it could not be found.
	 *
	 * @param id the primary key of the q l v t cap phep phu hieu phuong tien
	 * @return the q l v t cap phep phu hieu phuong tien
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTCapPhepPhuHieuPhuongTienException if a q l v t cap phep phu hieu phuong tien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTCapPhepPhuHieuPhuongTien findByPrimaryKey(int id)
		throws NoSuchQLVTCapPhepPhuHieuPhuongTienException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the q l v t cap phep phu hieu phuong tien with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the q l v t cap phep phu hieu phuong tien
	 * @return the q l v t cap phep phu hieu phuong tien, or <code>null</code> if a q l v t cap phep phu hieu phuong tien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTCapPhepPhuHieuPhuongTien fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		QLVTCapPhepPhuHieuPhuongTien qlvtCapPhepPhuHieuPhuongTien = (QLVTCapPhepPhuHieuPhuongTien)EntityCacheUtil.getResult(QLVTCapPhepPhuHieuPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
				QLVTCapPhepPhuHieuPhuongTienImpl.class, primaryKey);

		if (qlvtCapPhepPhuHieuPhuongTien == _nullQLVTCapPhepPhuHieuPhuongTien) {
			return null;
		}

		if (qlvtCapPhepPhuHieuPhuongTien == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtCapPhepPhuHieuPhuongTien = (QLVTCapPhepPhuHieuPhuongTien)session.get(QLVTCapPhepPhuHieuPhuongTienImpl.class,
						primaryKey);

				if (qlvtCapPhepPhuHieuPhuongTien != null) {
					cacheResult(qlvtCapPhepPhuHieuPhuongTien);
				}
				else {
					EntityCacheUtil.putResult(QLVTCapPhepPhuHieuPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
						QLVTCapPhepPhuHieuPhuongTienImpl.class, primaryKey,
						_nullQLVTCapPhepPhuHieuPhuongTien);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QLVTCapPhepPhuHieuPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
					QLVTCapPhepPhuHieuPhuongTienImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtCapPhepPhuHieuPhuongTien;
	}

	/**
	 * Returns the q l v t cap phep phu hieu phuong tien with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the q l v t cap phep phu hieu phuong tien
	 * @return the q l v t cap phep phu hieu phuong tien, or <code>null</code> if a q l v t cap phep phu hieu phuong tien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTCapPhepPhuHieuPhuongTien fetchByPrimaryKey(int id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the q l v t cap phep phu hieu phuong tiens.
	 *
	 * @return the q l v t cap phep phu hieu phuong tiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QLVTCapPhepPhuHieuPhuongTien> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the q l v t cap phep phu hieu phuong tiens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTCapPhepPhuHieuPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of q l v t cap phep phu hieu phuong tiens
	 * @param end the upper bound of the range of q l v t cap phep phu hieu phuong tiens (not inclusive)
	 * @return the range of q l v t cap phep phu hieu phuong tiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QLVTCapPhepPhuHieuPhuongTien> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the q l v t cap phep phu hieu phuong tiens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTCapPhepPhuHieuPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of q l v t cap phep phu hieu phuong tiens
	 * @param end the upper bound of the range of q l v t cap phep phu hieu phuong tiens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of q l v t cap phep phu hieu phuong tiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QLVTCapPhepPhuHieuPhuongTien> findAll(int start, int end,
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

		List<QLVTCapPhepPhuHieuPhuongTien> list = (List<QLVTCapPhepPhuHieuPhuongTien>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTCAPPHEPPHUHIEUPHUONGTIEN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTCAPPHEPPHUHIEUPHUONGTIEN;

				if (pagination) {
					sql = sql.concat(QLVTCapPhepPhuHieuPhuongTienModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QLVTCapPhepPhuHieuPhuongTien>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QLVTCapPhepPhuHieuPhuongTien>(list);
				}
				else {
					list = (List<QLVTCapPhepPhuHieuPhuongTien>)QueryUtil.list(q,
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
	 * Removes all the q l v t cap phep phu hieu phuong tiens from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QLVTCapPhepPhuHieuPhuongTien qlvtCapPhepPhuHieuPhuongTien : findAll()) {
			remove(qlvtCapPhepPhuHieuPhuongTien);
		}
	}

	/**
	 * Returns the number of q l v t cap phep phu hieu phuong tiens.
	 *
	 * @return the number of q l v t cap phep phu hieu phuong tiens
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

				Query q = session.createQuery(_SQL_COUNT_QLVTCAPPHEPPHUHIEUPHUONGTIEN);

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
	 * Initializes the q l v t cap phep phu hieu phuong tien persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepPhuHieuPhuongTien")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QLVTCapPhepPhuHieuPhuongTien>> listenersList = new ArrayList<ModelListener<QLVTCapPhepPhuHieuPhuongTien>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QLVTCapPhepPhuHieuPhuongTien>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QLVTCapPhepPhuHieuPhuongTienImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTCAPPHEPPHUHIEUPHUONGTIEN = "SELECT qlvtCapPhepPhuHieuPhuongTien FROM QLVTCapPhepPhuHieuPhuongTien qlvtCapPhepPhuHieuPhuongTien";
	private static final String _SQL_COUNT_QLVTCAPPHEPPHUHIEUPHUONGTIEN = "SELECT COUNT(qlvtCapPhepPhuHieuPhuongTien) FROM QLVTCapPhepPhuHieuPhuongTien qlvtCapPhepPhuHieuPhuongTien";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtCapPhepPhuHieuPhuongTien.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QLVTCapPhepPhuHieuPhuongTien exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QLVTCapPhepPhuHieuPhuongTienPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "qlvtCapPhepPhuHieuXeId", "qlvtPhuongTienVanTaiId",
				"trangThai"
			});
	private static QLVTCapPhepPhuHieuPhuongTien _nullQLVTCapPhepPhuHieuPhuongTien =
		new QLVTCapPhepPhuHieuPhuongTienImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QLVTCapPhepPhuHieuPhuongTien> toCacheModel() {
				return _nullQLVTCapPhepPhuHieuPhuongTienCacheModel;
			}
		};

	private static CacheModel<QLVTCapPhepPhuHieuPhuongTien> _nullQLVTCapPhepPhuHieuPhuongTienCacheModel =
		new CacheModel<QLVTCapPhepPhuHieuPhuongTien>() {
			@Override
			public QLVTCapPhepPhuHieuPhuongTien toEntityModel() {
				return _nullQLVTCapPhepPhuHieuPhuongTien;
			}
		};
}