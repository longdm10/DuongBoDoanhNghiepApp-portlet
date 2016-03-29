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

import vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTCapPhepPhuHieuTuyenException;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepPhuHieuTuyen;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTCapPhepPhuHieuTuyenImpl;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTCapPhepPhuHieuTuyenModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the q l v t cap phep phu hieu tuyen service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author binhta
 * @see QLVTCapPhepPhuHieuTuyenPersistence
 * @see QLVTCapPhepPhuHieuTuyenUtil
 * @generated
 */
public class QLVTCapPhepPhuHieuTuyenPersistenceImpl extends BasePersistenceImpl<QLVTCapPhepPhuHieuTuyen>
	implements QLVTCapPhepPhuHieuTuyenPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QLVTCapPhepPhuHieuTuyenUtil} to access the q l v t cap phep phu hieu tuyen persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QLVTCapPhepPhuHieuTuyenImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QLVTCapPhepPhuHieuTuyenModelImpl.ENTITY_CACHE_ENABLED,
			QLVTCapPhepPhuHieuTuyenModelImpl.FINDER_CACHE_ENABLED,
			QLVTCapPhepPhuHieuTuyenImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QLVTCapPhepPhuHieuTuyenModelImpl.ENTITY_CACHE_ENABLED,
			QLVTCapPhepPhuHieuTuyenModelImpl.FINDER_CACHE_ENABLED,
			QLVTCapPhepPhuHieuTuyenImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QLVTCapPhepPhuHieuTuyenModelImpl.ENTITY_CACHE_ENABLED,
			QLVTCapPhepPhuHieuTuyenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public QLVTCapPhepPhuHieuTuyenPersistenceImpl() {
		setModelClass(QLVTCapPhepPhuHieuTuyen.class);
	}

	/**
	 * Caches the q l v t cap phep phu hieu tuyen in the entity cache if it is enabled.
	 *
	 * @param qlvtCapPhepPhuHieuTuyen the q l v t cap phep phu hieu tuyen
	 */
	@Override
	public void cacheResult(QLVTCapPhepPhuHieuTuyen qlvtCapPhepPhuHieuTuyen) {
		EntityCacheUtil.putResult(QLVTCapPhepPhuHieuTuyenModelImpl.ENTITY_CACHE_ENABLED,
			QLVTCapPhepPhuHieuTuyenImpl.class,
			qlvtCapPhepPhuHieuTuyen.getPrimaryKey(), qlvtCapPhepPhuHieuTuyen);

		qlvtCapPhepPhuHieuTuyen.resetOriginalValues();
	}

	/**
	 * Caches the q l v t cap phep phu hieu tuyens in the entity cache if it is enabled.
	 *
	 * @param qlvtCapPhepPhuHieuTuyens the q l v t cap phep phu hieu tuyens
	 */
	@Override
	public void cacheResult(
		List<QLVTCapPhepPhuHieuTuyen> qlvtCapPhepPhuHieuTuyens) {
		for (QLVTCapPhepPhuHieuTuyen qlvtCapPhepPhuHieuTuyen : qlvtCapPhepPhuHieuTuyens) {
			if (EntityCacheUtil.getResult(
						QLVTCapPhepPhuHieuTuyenModelImpl.ENTITY_CACHE_ENABLED,
						QLVTCapPhepPhuHieuTuyenImpl.class,
						qlvtCapPhepPhuHieuTuyen.getPrimaryKey()) == null) {
				cacheResult(qlvtCapPhepPhuHieuTuyen);
			}
			else {
				qlvtCapPhepPhuHieuTuyen.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all q l v t cap phep phu hieu tuyens.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QLVTCapPhepPhuHieuTuyenImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QLVTCapPhepPhuHieuTuyenImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the q l v t cap phep phu hieu tuyen.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QLVTCapPhepPhuHieuTuyen qlvtCapPhepPhuHieuTuyen) {
		EntityCacheUtil.removeResult(QLVTCapPhepPhuHieuTuyenModelImpl.ENTITY_CACHE_ENABLED,
			QLVTCapPhepPhuHieuTuyenImpl.class,
			qlvtCapPhepPhuHieuTuyen.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<QLVTCapPhepPhuHieuTuyen> qlvtCapPhepPhuHieuTuyens) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QLVTCapPhepPhuHieuTuyen qlvtCapPhepPhuHieuTuyen : qlvtCapPhepPhuHieuTuyens) {
			EntityCacheUtil.removeResult(QLVTCapPhepPhuHieuTuyenModelImpl.ENTITY_CACHE_ENABLED,
				QLVTCapPhepPhuHieuTuyenImpl.class,
				qlvtCapPhepPhuHieuTuyen.getPrimaryKey());
		}
	}

	/**
	 * Creates a new q l v t cap phep phu hieu tuyen with the primary key. Does not add the q l v t cap phep phu hieu tuyen to the database.
	 *
	 * @param id the primary key for the new q l v t cap phep phu hieu tuyen
	 * @return the new q l v t cap phep phu hieu tuyen
	 */
	@Override
	public QLVTCapPhepPhuHieuTuyen create(int id) {
		QLVTCapPhepPhuHieuTuyen qlvtCapPhepPhuHieuTuyen = new QLVTCapPhepPhuHieuTuyenImpl();

		qlvtCapPhepPhuHieuTuyen.setNew(true);
		qlvtCapPhepPhuHieuTuyen.setPrimaryKey(id);

		return qlvtCapPhepPhuHieuTuyen;
	}

	/**
	 * Removes the q l v t cap phep phu hieu tuyen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the q l v t cap phep phu hieu tuyen
	 * @return the q l v t cap phep phu hieu tuyen that was removed
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTCapPhepPhuHieuTuyenException if a q l v t cap phep phu hieu tuyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTCapPhepPhuHieuTuyen remove(int id)
		throws NoSuchQLVTCapPhepPhuHieuTuyenException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the q l v t cap phep phu hieu tuyen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the q l v t cap phep phu hieu tuyen
	 * @return the q l v t cap phep phu hieu tuyen that was removed
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTCapPhepPhuHieuTuyenException if a q l v t cap phep phu hieu tuyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTCapPhepPhuHieuTuyen remove(Serializable primaryKey)
		throws NoSuchQLVTCapPhepPhuHieuTuyenException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QLVTCapPhepPhuHieuTuyen qlvtCapPhepPhuHieuTuyen = (QLVTCapPhepPhuHieuTuyen)session.get(QLVTCapPhepPhuHieuTuyenImpl.class,
					primaryKey);

			if (qlvtCapPhepPhuHieuTuyen == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQLVTCapPhepPhuHieuTuyenException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtCapPhepPhuHieuTuyen);
		}
		catch (NoSuchQLVTCapPhepPhuHieuTuyenException nsee) {
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
	protected QLVTCapPhepPhuHieuTuyen removeImpl(
		QLVTCapPhepPhuHieuTuyen qlvtCapPhepPhuHieuTuyen)
		throws SystemException {
		qlvtCapPhepPhuHieuTuyen = toUnwrappedModel(qlvtCapPhepPhuHieuTuyen);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtCapPhepPhuHieuTuyen)) {
				qlvtCapPhepPhuHieuTuyen = (QLVTCapPhepPhuHieuTuyen)session.get(QLVTCapPhepPhuHieuTuyenImpl.class,
						qlvtCapPhepPhuHieuTuyen.getPrimaryKeyObj());
			}

			if (qlvtCapPhepPhuHieuTuyen != null) {
				session.delete(qlvtCapPhepPhuHieuTuyen);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtCapPhepPhuHieuTuyen != null) {
			clearCache(qlvtCapPhepPhuHieuTuyen);
		}

		return qlvtCapPhepPhuHieuTuyen;
	}

	@Override
	public QLVTCapPhepPhuHieuTuyen updateImpl(
		vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepPhuHieuTuyen qlvtCapPhepPhuHieuTuyen)
		throws SystemException {
		qlvtCapPhepPhuHieuTuyen = toUnwrappedModel(qlvtCapPhepPhuHieuTuyen);

		boolean isNew = qlvtCapPhepPhuHieuTuyen.isNew();

		Session session = null;

		try {
			session = openSession();

			if (qlvtCapPhepPhuHieuTuyen.isNew()) {
				session.save(qlvtCapPhepPhuHieuTuyen);

				qlvtCapPhepPhuHieuTuyen.setNew(false);
			}
			else {
				session.merge(qlvtCapPhepPhuHieuTuyen);
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

		EntityCacheUtil.putResult(QLVTCapPhepPhuHieuTuyenModelImpl.ENTITY_CACHE_ENABLED,
			QLVTCapPhepPhuHieuTuyenImpl.class,
			qlvtCapPhepPhuHieuTuyen.getPrimaryKey(), qlvtCapPhepPhuHieuTuyen);

		return qlvtCapPhepPhuHieuTuyen;
	}

	protected QLVTCapPhepPhuHieuTuyen toUnwrappedModel(
		QLVTCapPhepPhuHieuTuyen qlvtCapPhepPhuHieuTuyen) {
		if (qlvtCapPhepPhuHieuTuyen instanceof QLVTCapPhepPhuHieuTuyenImpl) {
			return qlvtCapPhepPhuHieuTuyen;
		}

		QLVTCapPhepPhuHieuTuyenImpl qlvtCapPhepPhuHieuTuyenImpl = new QLVTCapPhepPhuHieuTuyenImpl();

		qlvtCapPhepPhuHieuTuyenImpl.setNew(qlvtCapPhepPhuHieuTuyen.isNew());
		qlvtCapPhepPhuHieuTuyenImpl.setPrimaryKey(qlvtCapPhepPhuHieuTuyen.getPrimaryKey());

		qlvtCapPhepPhuHieuTuyenImpl.setId(qlvtCapPhepPhuHieuTuyen.getId());
		qlvtCapPhepPhuHieuTuyenImpl.setPtCapPhuHieuId(qlvtCapPhepPhuHieuTuyen.getPtCapPhuHieuId());
		qlvtCapPhepPhuHieuTuyenImpl.setMaTuyen(qlvtCapPhepPhuHieuTuyen.getMaTuyen());
		qlvtCapPhepPhuHieuTuyenImpl.setTenTuyen(qlvtCapPhepPhuHieuTuyen.getTenTuyen());

		return qlvtCapPhepPhuHieuTuyenImpl;
	}

	/**
	 * Returns the q l v t cap phep phu hieu tuyen with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the q l v t cap phep phu hieu tuyen
	 * @return the q l v t cap phep phu hieu tuyen
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTCapPhepPhuHieuTuyenException if a q l v t cap phep phu hieu tuyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTCapPhepPhuHieuTuyen findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQLVTCapPhepPhuHieuTuyenException, SystemException {
		QLVTCapPhepPhuHieuTuyen qlvtCapPhepPhuHieuTuyen = fetchByPrimaryKey(primaryKey);

		if (qlvtCapPhepPhuHieuTuyen == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQLVTCapPhepPhuHieuTuyenException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtCapPhepPhuHieuTuyen;
	}

	/**
	 * Returns the q l v t cap phep phu hieu tuyen with the primary key or throws a {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTCapPhepPhuHieuTuyenException} if it could not be found.
	 *
	 * @param id the primary key of the q l v t cap phep phu hieu tuyen
	 * @return the q l v t cap phep phu hieu tuyen
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTCapPhepPhuHieuTuyenException if a q l v t cap phep phu hieu tuyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTCapPhepPhuHieuTuyen findByPrimaryKey(int id)
		throws NoSuchQLVTCapPhepPhuHieuTuyenException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the q l v t cap phep phu hieu tuyen with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the q l v t cap phep phu hieu tuyen
	 * @return the q l v t cap phep phu hieu tuyen, or <code>null</code> if a q l v t cap phep phu hieu tuyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTCapPhepPhuHieuTuyen fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QLVTCapPhepPhuHieuTuyen qlvtCapPhepPhuHieuTuyen = (QLVTCapPhepPhuHieuTuyen)EntityCacheUtil.getResult(QLVTCapPhepPhuHieuTuyenModelImpl.ENTITY_CACHE_ENABLED,
				QLVTCapPhepPhuHieuTuyenImpl.class, primaryKey);

		if (qlvtCapPhepPhuHieuTuyen == _nullQLVTCapPhepPhuHieuTuyen) {
			return null;
		}

		if (qlvtCapPhepPhuHieuTuyen == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtCapPhepPhuHieuTuyen = (QLVTCapPhepPhuHieuTuyen)session.get(QLVTCapPhepPhuHieuTuyenImpl.class,
						primaryKey);

				if (qlvtCapPhepPhuHieuTuyen != null) {
					cacheResult(qlvtCapPhepPhuHieuTuyen);
				}
				else {
					EntityCacheUtil.putResult(QLVTCapPhepPhuHieuTuyenModelImpl.ENTITY_CACHE_ENABLED,
						QLVTCapPhepPhuHieuTuyenImpl.class, primaryKey,
						_nullQLVTCapPhepPhuHieuTuyen);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QLVTCapPhepPhuHieuTuyenModelImpl.ENTITY_CACHE_ENABLED,
					QLVTCapPhepPhuHieuTuyenImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtCapPhepPhuHieuTuyen;
	}

	/**
	 * Returns the q l v t cap phep phu hieu tuyen with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the q l v t cap phep phu hieu tuyen
	 * @return the q l v t cap phep phu hieu tuyen, or <code>null</code> if a q l v t cap phep phu hieu tuyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTCapPhepPhuHieuTuyen fetchByPrimaryKey(int id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the q l v t cap phep phu hieu tuyens.
	 *
	 * @return the q l v t cap phep phu hieu tuyens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QLVTCapPhepPhuHieuTuyen> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the q l v t cap phep phu hieu tuyens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTCapPhepPhuHieuTuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of q l v t cap phep phu hieu tuyens
	 * @param end the upper bound of the range of q l v t cap phep phu hieu tuyens (not inclusive)
	 * @return the range of q l v t cap phep phu hieu tuyens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QLVTCapPhepPhuHieuTuyen> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the q l v t cap phep phu hieu tuyens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTCapPhepPhuHieuTuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of q l v t cap phep phu hieu tuyens
	 * @param end the upper bound of the range of q l v t cap phep phu hieu tuyens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of q l v t cap phep phu hieu tuyens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QLVTCapPhepPhuHieuTuyen> findAll(int start, int end,
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

		List<QLVTCapPhepPhuHieuTuyen> list = (List<QLVTCapPhepPhuHieuTuyen>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTCAPPHEPPHUHIEUTUYEN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTCAPPHEPPHUHIEUTUYEN;

				if (pagination) {
					sql = sql.concat(QLVTCapPhepPhuHieuTuyenModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QLVTCapPhepPhuHieuTuyen>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QLVTCapPhepPhuHieuTuyen>(list);
				}
				else {
					list = (List<QLVTCapPhepPhuHieuTuyen>)QueryUtil.list(q,
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
	 * Removes all the q l v t cap phep phu hieu tuyens from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QLVTCapPhepPhuHieuTuyen qlvtCapPhepPhuHieuTuyen : findAll()) {
			remove(qlvtCapPhepPhuHieuTuyen);
		}
	}

	/**
	 * Returns the number of q l v t cap phep phu hieu tuyens.
	 *
	 * @return the number of q l v t cap phep phu hieu tuyens
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

				Query q = session.createQuery(_SQL_COUNT_QLVTCAPPHEPPHUHIEUTUYEN);

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
	 * Initializes the q l v t cap phep phu hieu tuyen persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepPhuHieuTuyen")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QLVTCapPhepPhuHieuTuyen>> listenersList = new ArrayList<ModelListener<QLVTCapPhepPhuHieuTuyen>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QLVTCapPhepPhuHieuTuyen>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QLVTCapPhepPhuHieuTuyenImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTCAPPHEPPHUHIEUTUYEN = "SELECT qlvtCapPhepPhuHieuTuyen FROM QLVTCapPhepPhuHieuTuyen qlvtCapPhepPhuHieuTuyen";
	private static final String _SQL_COUNT_QLVTCAPPHEPPHUHIEUTUYEN = "SELECT COUNT(qlvtCapPhepPhuHieuTuyen) FROM QLVTCapPhepPhuHieuTuyen qlvtCapPhepPhuHieuTuyen";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtCapPhepPhuHieuTuyen.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QLVTCapPhepPhuHieuTuyen exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QLVTCapPhepPhuHieuTuyenPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "ptCapPhuHieuId", "maTuyen", "tenTuyen"
			});
	private static QLVTCapPhepPhuHieuTuyen _nullQLVTCapPhepPhuHieuTuyen = new QLVTCapPhepPhuHieuTuyenImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QLVTCapPhepPhuHieuTuyen> toCacheModel() {
				return _nullQLVTCapPhepPhuHieuTuyenCacheModel;
			}
		};

	private static CacheModel<QLVTCapPhepPhuHieuTuyen> _nullQLVTCapPhepPhuHieuTuyenCacheModel =
		new CacheModel<QLVTCapPhepPhuHieuTuyen>() {
			@Override
			public QLVTCapPhepPhuHieuTuyen toEntityModel() {
				return _nullQLVTCapPhepPhuHieuTuyen;
			}
		};
}