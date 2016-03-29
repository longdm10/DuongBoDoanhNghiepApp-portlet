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

import vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTCapPhepPhuHieuException;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepPhuHieu;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTCapPhepPhuHieuImpl;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTCapPhepPhuHieuModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the q l v t cap phep phu hieu service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author binhta
 * @see QLVTCapPhepPhuHieuPersistence
 * @see QLVTCapPhepPhuHieuUtil
 * @generated
 */
public class QLVTCapPhepPhuHieuPersistenceImpl extends BasePersistenceImpl<QLVTCapPhepPhuHieu>
	implements QLVTCapPhepPhuHieuPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QLVTCapPhepPhuHieuUtil} to access the q l v t cap phep phu hieu persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QLVTCapPhepPhuHieuImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QLVTCapPhepPhuHieuModelImpl.ENTITY_CACHE_ENABLED,
			QLVTCapPhepPhuHieuModelImpl.FINDER_CACHE_ENABLED,
			QLVTCapPhepPhuHieuImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QLVTCapPhepPhuHieuModelImpl.ENTITY_CACHE_ENABLED,
			QLVTCapPhepPhuHieuModelImpl.FINDER_CACHE_ENABLED,
			QLVTCapPhepPhuHieuImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QLVTCapPhepPhuHieuModelImpl.ENTITY_CACHE_ENABLED,
			QLVTCapPhepPhuHieuModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public QLVTCapPhepPhuHieuPersistenceImpl() {
		setModelClass(QLVTCapPhepPhuHieu.class);
	}

	/**
	 * Caches the q l v t cap phep phu hieu in the entity cache if it is enabled.
	 *
	 * @param qlvtCapPhepPhuHieu the q l v t cap phep phu hieu
	 */
	@Override
	public void cacheResult(QLVTCapPhepPhuHieu qlvtCapPhepPhuHieu) {
		EntityCacheUtil.putResult(QLVTCapPhepPhuHieuModelImpl.ENTITY_CACHE_ENABLED,
			QLVTCapPhepPhuHieuImpl.class, qlvtCapPhepPhuHieu.getPrimaryKey(),
			qlvtCapPhepPhuHieu);

		qlvtCapPhepPhuHieu.resetOriginalValues();
	}

	/**
	 * Caches the q l v t cap phep phu hieus in the entity cache if it is enabled.
	 *
	 * @param qlvtCapPhepPhuHieus the q l v t cap phep phu hieus
	 */
	@Override
	public void cacheResult(List<QLVTCapPhepPhuHieu> qlvtCapPhepPhuHieus) {
		for (QLVTCapPhepPhuHieu qlvtCapPhepPhuHieu : qlvtCapPhepPhuHieus) {
			if (EntityCacheUtil.getResult(
						QLVTCapPhepPhuHieuModelImpl.ENTITY_CACHE_ENABLED,
						QLVTCapPhepPhuHieuImpl.class,
						qlvtCapPhepPhuHieu.getPrimaryKey()) == null) {
				cacheResult(qlvtCapPhepPhuHieu);
			}
			else {
				qlvtCapPhepPhuHieu.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all q l v t cap phep phu hieus.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QLVTCapPhepPhuHieuImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QLVTCapPhepPhuHieuImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the q l v t cap phep phu hieu.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QLVTCapPhepPhuHieu qlvtCapPhepPhuHieu) {
		EntityCacheUtil.removeResult(QLVTCapPhepPhuHieuModelImpl.ENTITY_CACHE_ENABLED,
			QLVTCapPhepPhuHieuImpl.class, qlvtCapPhepPhuHieu.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<QLVTCapPhepPhuHieu> qlvtCapPhepPhuHieus) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QLVTCapPhepPhuHieu qlvtCapPhepPhuHieu : qlvtCapPhepPhuHieus) {
			EntityCacheUtil.removeResult(QLVTCapPhepPhuHieuModelImpl.ENTITY_CACHE_ENABLED,
				QLVTCapPhepPhuHieuImpl.class, qlvtCapPhepPhuHieu.getPrimaryKey());
		}
	}

	/**
	 * Creates a new q l v t cap phep phu hieu with the primary key. Does not add the q l v t cap phep phu hieu to the database.
	 *
	 * @param id the primary key for the new q l v t cap phep phu hieu
	 * @return the new q l v t cap phep phu hieu
	 */
	@Override
	public QLVTCapPhepPhuHieu create(int id) {
		QLVTCapPhepPhuHieu qlvtCapPhepPhuHieu = new QLVTCapPhepPhuHieuImpl();

		qlvtCapPhepPhuHieu.setNew(true);
		qlvtCapPhepPhuHieu.setPrimaryKey(id);

		return qlvtCapPhepPhuHieu;
	}

	/**
	 * Removes the q l v t cap phep phu hieu with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the q l v t cap phep phu hieu
	 * @return the q l v t cap phep phu hieu that was removed
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTCapPhepPhuHieuException if a q l v t cap phep phu hieu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTCapPhepPhuHieu remove(int id)
		throws NoSuchQLVTCapPhepPhuHieuException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the q l v t cap phep phu hieu with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the q l v t cap phep phu hieu
	 * @return the q l v t cap phep phu hieu that was removed
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTCapPhepPhuHieuException if a q l v t cap phep phu hieu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTCapPhepPhuHieu remove(Serializable primaryKey)
		throws NoSuchQLVTCapPhepPhuHieuException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QLVTCapPhepPhuHieu qlvtCapPhepPhuHieu = (QLVTCapPhepPhuHieu)session.get(QLVTCapPhepPhuHieuImpl.class,
					primaryKey);

			if (qlvtCapPhepPhuHieu == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQLVTCapPhepPhuHieuException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtCapPhepPhuHieu);
		}
		catch (NoSuchQLVTCapPhepPhuHieuException nsee) {
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
	protected QLVTCapPhepPhuHieu removeImpl(
		QLVTCapPhepPhuHieu qlvtCapPhepPhuHieu) throws SystemException {
		qlvtCapPhepPhuHieu = toUnwrappedModel(qlvtCapPhepPhuHieu);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtCapPhepPhuHieu)) {
				qlvtCapPhepPhuHieu = (QLVTCapPhepPhuHieu)session.get(QLVTCapPhepPhuHieuImpl.class,
						qlvtCapPhepPhuHieu.getPrimaryKeyObj());
			}

			if (qlvtCapPhepPhuHieu != null) {
				session.delete(qlvtCapPhepPhuHieu);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtCapPhepPhuHieu != null) {
			clearCache(qlvtCapPhepPhuHieu);
		}

		return qlvtCapPhepPhuHieu;
	}

	@Override
	public QLVTCapPhepPhuHieu updateImpl(
		vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepPhuHieu qlvtCapPhepPhuHieu)
		throws SystemException {
		qlvtCapPhepPhuHieu = toUnwrappedModel(qlvtCapPhepPhuHieu);

		boolean isNew = qlvtCapPhepPhuHieu.isNew();

		Session session = null;

		try {
			session = openSession();

			if (qlvtCapPhepPhuHieu.isNew()) {
				session.save(qlvtCapPhepPhuHieu);

				qlvtCapPhepPhuHieu.setNew(false);
			}
			else {
				session.merge(qlvtCapPhepPhuHieu);
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

		EntityCacheUtil.putResult(QLVTCapPhepPhuHieuModelImpl.ENTITY_CACHE_ENABLED,
			QLVTCapPhepPhuHieuImpl.class, qlvtCapPhepPhuHieu.getPrimaryKey(),
			qlvtCapPhepPhuHieu);

		return qlvtCapPhepPhuHieu;
	}

	protected QLVTCapPhepPhuHieu toUnwrappedModel(
		QLVTCapPhepPhuHieu qlvtCapPhepPhuHieu) {
		if (qlvtCapPhepPhuHieu instanceof QLVTCapPhepPhuHieuImpl) {
			return qlvtCapPhepPhuHieu;
		}

		QLVTCapPhepPhuHieuImpl qlvtCapPhepPhuHieuImpl = new QLVTCapPhepPhuHieuImpl();

		qlvtCapPhepPhuHieuImpl.setNew(qlvtCapPhepPhuHieu.isNew());
		qlvtCapPhepPhuHieuImpl.setPrimaryKey(qlvtCapPhepPhuHieu.getPrimaryKey());

		qlvtCapPhepPhuHieuImpl.setId(qlvtCapPhepPhuHieu.getId());
		qlvtCapPhepPhuHieuImpl.setThongTinHoSoId(qlvtCapPhepPhuHieu.getThongTinHoSoId());
		qlvtCapPhepPhuHieuImpl.setLoaiHinhKinhDoanhId(qlvtCapPhepPhuHieu.getLoaiHinhKinhDoanhId());
		qlvtCapPhepPhuHieuImpl.setSoPhuHieu(qlvtCapPhepPhuHieu.getSoPhuHieu());
		qlvtCapPhepPhuHieuImpl.setCoQuanCapLanDauId(qlvtCapPhepPhuHieu.getCoQuanCapLanDauId());
		qlvtCapPhepPhuHieuImpl.setCoQuanCapPhepId(qlvtCapPhepPhuHieu.getCoQuanCapPhepId());
		qlvtCapPhepPhuHieuImpl.setNgayCapPhuHieu(qlvtCapPhepPhuHieu.getNgayCapPhuHieu());
		qlvtCapPhepPhuHieuImpl.setThoiHanPhuHieu(qlvtCapPhepPhuHieu.getThoiHanPhuHieu());
		qlvtCapPhepPhuHieuImpl.setNoiSanXuat(qlvtCapPhepPhuHieu.getNoiSanXuat());
		qlvtCapPhepPhuHieuImpl.setNamSanXuat(qlvtCapPhepPhuHieu.getNamSanXuat());
		qlvtCapPhepPhuHieuImpl.setMaTuyenCoDinh(qlvtCapPhepPhuHieu.getMaTuyenCoDinh());
		qlvtCapPhepPhuHieuImpl.setLoaiPhuHieu(qlvtCapPhepPhuHieu.getLoaiPhuHieu());
		qlvtCapPhepPhuHieuImpl.setLanGiaHan(qlvtCapPhepPhuHieu.getLanGiaHan());
		qlvtCapPhepPhuHieuImpl.setNgayCapLanDau(qlvtCapPhepPhuHieu.getNgayCapLanDau());
		qlvtCapPhepPhuHieuImpl.setGhiChu(qlvtCapPhepPhuHieu.getGhiChu());
		qlvtCapPhepPhuHieuImpl.setTrangThai(qlvtCapPhepPhuHieu.getTrangThai());
		qlvtCapPhepPhuHieuImpl.setFileId(qlvtCapPhepPhuHieu.getFileId());

		return qlvtCapPhepPhuHieuImpl;
	}

	/**
	 * Returns the q l v t cap phep phu hieu with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the q l v t cap phep phu hieu
	 * @return the q l v t cap phep phu hieu
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTCapPhepPhuHieuException if a q l v t cap phep phu hieu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTCapPhepPhuHieu findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQLVTCapPhepPhuHieuException, SystemException {
		QLVTCapPhepPhuHieu qlvtCapPhepPhuHieu = fetchByPrimaryKey(primaryKey);

		if (qlvtCapPhepPhuHieu == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQLVTCapPhepPhuHieuException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtCapPhepPhuHieu;
	}

	/**
	 * Returns the q l v t cap phep phu hieu with the primary key or throws a {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTCapPhepPhuHieuException} if it could not be found.
	 *
	 * @param id the primary key of the q l v t cap phep phu hieu
	 * @return the q l v t cap phep phu hieu
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTCapPhepPhuHieuException if a q l v t cap phep phu hieu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTCapPhepPhuHieu findByPrimaryKey(int id)
		throws NoSuchQLVTCapPhepPhuHieuException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the q l v t cap phep phu hieu with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the q l v t cap phep phu hieu
	 * @return the q l v t cap phep phu hieu, or <code>null</code> if a q l v t cap phep phu hieu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTCapPhepPhuHieu fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QLVTCapPhepPhuHieu qlvtCapPhepPhuHieu = (QLVTCapPhepPhuHieu)EntityCacheUtil.getResult(QLVTCapPhepPhuHieuModelImpl.ENTITY_CACHE_ENABLED,
				QLVTCapPhepPhuHieuImpl.class, primaryKey);

		if (qlvtCapPhepPhuHieu == _nullQLVTCapPhepPhuHieu) {
			return null;
		}

		if (qlvtCapPhepPhuHieu == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtCapPhepPhuHieu = (QLVTCapPhepPhuHieu)session.get(QLVTCapPhepPhuHieuImpl.class,
						primaryKey);

				if (qlvtCapPhepPhuHieu != null) {
					cacheResult(qlvtCapPhepPhuHieu);
				}
				else {
					EntityCacheUtil.putResult(QLVTCapPhepPhuHieuModelImpl.ENTITY_CACHE_ENABLED,
						QLVTCapPhepPhuHieuImpl.class, primaryKey,
						_nullQLVTCapPhepPhuHieu);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QLVTCapPhepPhuHieuModelImpl.ENTITY_CACHE_ENABLED,
					QLVTCapPhepPhuHieuImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtCapPhepPhuHieu;
	}

	/**
	 * Returns the q l v t cap phep phu hieu with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the q l v t cap phep phu hieu
	 * @return the q l v t cap phep phu hieu, or <code>null</code> if a q l v t cap phep phu hieu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTCapPhepPhuHieu fetchByPrimaryKey(int id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the q l v t cap phep phu hieus.
	 *
	 * @return the q l v t cap phep phu hieus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QLVTCapPhepPhuHieu> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the q l v t cap phep phu hieus.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTCapPhepPhuHieuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of q l v t cap phep phu hieus
	 * @param end the upper bound of the range of q l v t cap phep phu hieus (not inclusive)
	 * @return the range of q l v t cap phep phu hieus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QLVTCapPhepPhuHieu> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the q l v t cap phep phu hieus.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTCapPhepPhuHieuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of q l v t cap phep phu hieus
	 * @param end the upper bound of the range of q l v t cap phep phu hieus (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of q l v t cap phep phu hieus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QLVTCapPhepPhuHieu> findAll(int start, int end,
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

		List<QLVTCapPhepPhuHieu> list = (List<QLVTCapPhepPhuHieu>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTCAPPHEPPHUHIEU);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTCAPPHEPPHUHIEU;

				if (pagination) {
					sql = sql.concat(QLVTCapPhepPhuHieuModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QLVTCapPhepPhuHieu>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QLVTCapPhepPhuHieu>(list);
				}
				else {
					list = (List<QLVTCapPhepPhuHieu>)QueryUtil.list(q,
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
	 * Removes all the q l v t cap phep phu hieus from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QLVTCapPhepPhuHieu qlvtCapPhepPhuHieu : findAll()) {
			remove(qlvtCapPhepPhuHieu);
		}
	}

	/**
	 * Returns the number of q l v t cap phep phu hieus.
	 *
	 * @return the number of q l v t cap phep phu hieus
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

				Query q = session.createQuery(_SQL_COUNT_QLVTCAPPHEPPHUHIEU);

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
	 * Initializes the q l v t cap phep phu hieu persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepPhuHieu")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QLVTCapPhepPhuHieu>> listenersList = new ArrayList<ModelListener<QLVTCapPhepPhuHieu>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QLVTCapPhepPhuHieu>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QLVTCapPhepPhuHieuImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTCAPPHEPPHUHIEU = "SELECT qlvtCapPhepPhuHieu FROM QLVTCapPhepPhuHieu qlvtCapPhepPhuHieu";
	private static final String _SQL_COUNT_QLVTCAPPHEPPHUHIEU = "SELECT COUNT(qlvtCapPhepPhuHieu) FROM QLVTCapPhepPhuHieu qlvtCapPhepPhuHieu";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtCapPhepPhuHieu.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QLVTCapPhepPhuHieu exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QLVTCapPhepPhuHieuPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "thongTinHoSoId", "loaiHinhKinhDoanhId", "soPhuHieu",
				"coQuanCapLanDauId", "CoQuanCapPhepId", "ngayCapPhuHieu",
				"thoiHanPhuHieu", "noiSanXuat", "namSanXuat", "maTuyenCoDinh",
				"loaiPhuHieu", "lanGiaHan", "ngayCapLanDau", "ghiChu",
				"trangThai", "fileId"
			});
	private static QLVTCapPhepPhuHieu _nullQLVTCapPhepPhuHieu = new QLVTCapPhepPhuHieuImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QLVTCapPhepPhuHieu> toCacheModel() {
				return _nullQLVTCapPhepPhuHieuCacheModel;
			}
		};

	private static CacheModel<QLVTCapPhepPhuHieu> _nullQLVTCapPhepPhuHieuCacheModel =
		new CacheModel<QLVTCapPhepPhuHieu>() {
			@Override
			public QLVTCapPhepPhuHieu toEntityModel() {
				return _nullQLVTCapPhepPhuHieu;
			}
		};
}