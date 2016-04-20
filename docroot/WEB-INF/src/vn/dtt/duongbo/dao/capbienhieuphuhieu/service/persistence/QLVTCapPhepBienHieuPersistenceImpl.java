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

import vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTCapPhepBienHieuException;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepBienHieu;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTCapPhepBienHieuImpl;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTCapPhepBienHieuModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the q l v t cap phep bien hieu service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author binhta
 * @see QLVTCapPhepBienHieuPersistence
 * @see QLVTCapPhepBienHieuUtil
 * @generated
 */
public class QLVTCapPhepBienHieuPersistenceImpl extends BasePersistenceImpl<QLVTCapPhepBienHieu>
	implements QLVTCapPhepBienHieuPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QLVTCapPhepBienHieuUtil} to access the q l v t cap phep bien hieu persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QLVTCapPhepBienHieuImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QLVTCapPhepBienHieuModelImpl.ENTITY_CACHE_ENABLED,
			QLVTCapPhepBienHieuModelImpl.FINDER_CACHE_ENABLED,
			QLVTCapPhepBienHieuImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QLVTCapPhepBienHieuModelImpl.ENTITY_CACHE_ENABLED,
			QLVTCapPhepBienHieuModelImpl.FINDER_CACHE_ENABLED,
			QLVTCapPhepBienHieuImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QLVTCapPhepBienHieuModelImpl.ENTITY_CACHE_ENABLED,
			QLVTCapPhepBienHieuModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public QLVTCapPhepBienHieuPersistenceImpl() {
		setModelClass(QLVTCapPhepBienHieu.class);
	}

	/**
	 * Caches the q l v t cap phep bien hieu in the entity cache if it is enabled.
	 *
	 * @param qlvtCapPhepBienHieu the q l v t cap phep bien hieu
	 */
	@Override
	public void cacheResult(QLVTCapPhepBienHieu qlvtCapPhepBienHieu) {
		EntityCacheUtil.putResult(QLVTCapPhepBienHieuModelImpl.ENTITY_CACHE_ENABLED,
			QLVTCapPhepBienHieuImpl.class, qlvtCapPhepBienHieu.getPrimaryKey(),
			qlvtCapPhepBienHieu);

		qlvtCapPhepBienHieu.resetOriginalValues();
	}

	/**
	 * Caches the q l v t cap phep bien hieus in the entity cache if it is enabled.
	 *
	 * @param qlvtCapPhepBienHieus the q l v t cap phep bien hieus
	 */
	@Override
	public void cacheResult(List<QLVTCapPhepBienHieu> qlvtCapPhepBienHieus) {
		for (QLVTCapPhepBienHieu qlvtCapPhepBienHieu : qlvtCapPhepBienHieus) {
			if (EntityCacheUtil.getResult(
						QLVTCapPhepBienHieuModelImpl.ENTITY_CACHE_ENABLED,
						QLVTCapPhepBienHieuImpl.class,
						qlvtCapPhepBienHieu.getPrimaryKey()) == null) {
				cacheResult(qlvtCapPhepBienHieu);
			}
			else {
				qlvtCapPhepBienHieu.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all q l v t cap phep bien hieus.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QLVTCapPhepBienHieuImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QLVTCapPhepBienHieuImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the q l v t cap phep bien hieu.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QLVTCapPhepBienHieu qlvtCapPhepBienHieu) {
		EntityCacheUtil.removeResult(QLVTCapPhepBienHieuModelImpl.ENTITY_CACHE_ENABLED,
			QLVTCapPhepBienHieuImpl.class, qlvtCapPhepBienHieu.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<QLVTCapPhepBienHieu> qlvtCapPhepBienHieus) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QLVTCapPhepBienHieu qlvtCapPhepBienHieu : qlvtCapPhepBienHieus) {
			EntityCacheUtil.removeResult(QLVTCapPhepBienHieuModelImpl.ENTITY_CACHE_ENABLED,
				QLVTCapPhepBienHieuImpl.class,
				qlvtCapPhepBienHieu.getPrimaryKey());
		}
	}

	/**
	 * Creates a new q l v t cap phep bien hieu with the primary key. Does not add the q l v t cap phep bien hieu to the database.
	 *
	 * @param id the primary key for the new q l v t cap phep bien hieu
	 * @return the new q l v t cap phep bien hieu
	 */
	@Override
	public QLVTCapPhepBienHieu create(int id) {
		QLVTCapPhepBienHieu qlvtCapPhepBienHieu = new QLVTCapPhepBienHieuImpl();

		qlvtCapPhepBienHieu.setNew(true);
		qlvtCapPhepBienHieu.setPrimaryKey(id);

		return qlvtCapPhepBienHieu;
	}

	/**
	 * Removes the q l v t cap phep bien hieu with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the q l v t cap phep bien hieu
	 * @return the q l v t cap phep bien hieu that was removed
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTCapPhepBienHieuException if a q l v t cap phep bien hieu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTCapPhepBienHieu remove(int id)
		throws NoSuchQLVTCapPhepBienHieuException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the q l v t cap phep bien hieu with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the q l v t cap phep bien hieu
	 * @return the q l v t cap phep bien hieu that was removed
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTCapPhepBienHieuException if a q l v t cap phep bien hieu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTCapPhepBienHieu remove(Serializable primaryKey)
		throws NoSuchQLVTCapPhepBienHieuException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QLVTCapPhepBienHieu qlvtCapPhepBienHieu = (QLVTCapPhepBienHieu)session.get(QLVTCapPhepBienHieuImpl.class,
					primaryKey);

			if (qlvtCapPhepBienHieu == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQLVTCapPhepBienHieuException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtCapPhepBienHieu);
		}
		catch (NoSuchQLVTCapPhepBienHieuException nsee) {
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
	protected QLVTCapPhepBienHieu removeImpl(
		QLVTCapPhepBienHieu qlvtCapPhepBienHieu) throws SystemException {
		qlvtCapPhepBienHieu = toUnwrappedModel(qlvtCapPhepBienHieu);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtCapPhepBienHieu)) {
				qlvtCapPhepBienHieu = (QLVTCapPhepBienHieu)session.get(QLVTCapPhepBienHieuImpl.class,
						qlvtCapPhepBienHieu.getPrimaryKeyObj());
			}

			if (qlvtCapPhepBienHieu != null) {
				session.delete(qlvtCapPhepBienHieu);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtCapPhepBienHieu != null) {
			clearCache(qlvtCapPhepBienHieu);
		}

		return qlvtCapPhepBienHieu;
	}

	@Override
	public QLVTCapPhepBienHieu updateImpl(
		vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepBienHieu qlvtCapPhepBienHieu)
		throws SystemException {
		qlvtCapPhepBienHieu = toUnwrappedModel(qlvtCapPhepBienHieu);

		boolean isNew = qlvtCapPhepBienHieu.isNew();

		Session session = null;

		try {
			session = openSession();

			if (qlvtCapPhepBienHieu.isNew()) {
				session.save(qlvtCapPhepBienHieu);

				qlvtCapPhepBienHieu.setNew(false);
			}
			else {
				session.merge(qlvtCapPhepBienHieu);
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

		EntityCacheUtil.putResult(QLVTCapPhepBienHieuModelImpl.ENTITY_CACHE_ENABLED,
			QLVTCapPhepBienHieuImpl.class, qlvtCapPhepBienHieu.getPrimaryKey(),
			qlvtCapPhepBienHieu);

		return qlvtCapPhepBienHieu;
	}

	protected QLVTCapPhepBienHieu toUnwrappedModel(
		QLVTCapPhepBienHieu qlvtCapPhepBienHieu) {
		if (qlvtCapPhepBienHieu instanceof QLVTCapPhepBienHieuImpl) {
			return qlvtCapPhepBienHieu;
		}

		QLVTCapPhepBienHieuImpl qlvtCapPhepBienHieuImpl = new QLVTCapPhepBienHieuImpl();

		qlvtCapPhepBienHieuImpl.setNew(qlvtCapPhepBienHieu.isNew());
		qlvtCapPhepBienHieuImpl.setPrimaryKey(qlvtCapPhepBienHieu.getPrimaryKey());

		qlvtCapPhepBienHieuImpl.setId(qlvtCapPhepBienHieu.getId());
		qlvtCapPhepBienHieuImpl.setThongTinHoSoId(qlvtCapPhepBienHieu.getThongTinHoSoId());
		qlvtCapPhepBienHieuImpl.setLoaiHinhKinhDoanhId(qlvtCapPhepBienHieu.getLoaiHinhKinhDoanhId());
		qlvtCapPhepBienHieuImpl.setSoPhuHieu(qlvtCapPhepBienHieu.getSoPhuHieu());
		qlvtCapPhepBienHieuImpl.setCoQuanCapLanDauId(qlvtCapPhepBienHieu.getCoQuanCapLanDauId());
		qlvtCapPhepBienHieuImpl.setCoQuanCapPhepId(qlvtCapPhepBienHieu.getCoQuanCapPhepId());
		qlvtCapPhepBienHieuImpl.setNgayCapPhuHieu(qlvtCapPhepBienHieu.getNgayCapPhuHieu());
		qlvtCapPhepBienHieuImpl.setThoiHanPhuHieu(qlvtCapPhepBienHieu.getThoiHanPhuHieu());
		qlvtCapPhepBienHieuImpl.setMaTuyenCoDinh(qlvtCapPhepBienHieu.getMaTuyenCoDinh());
		qlvtCapPhepBienHieuImpl.setLinhVucKinhDoanhXeDuLich(qlvtCapPhepBienHieu.getLinhVucKinhDoanhXeDuLich());
		qlvtCapPhepBienHieuImpl.setDoanhNghiepChoThue(qlvtCapPhepBienHieu.getDoanhNghiepChoThue());
		qlvtCapPhepBienHieuImpl.setThoiHanThue(qlvtCapPhepBienHieu.getThoiHanThue());
		qlvtCapPhepBienHieuImpl.setHopDongSauCung(qlvtCapPhepBienHieu.getHopDongSauCung());
		qlvtCapPhepBienHieuImpl.setNgayCapLanDau(qlvtCapPhepBienHieu.getNgayCapLanDau());
		qlvtCapPhepBienHieuImpl.setLanGiaHan(qlvtCapPhepBienHieu.getLanGiaHan());
		qlvtCapPhepBienHieuImpl.setGhiChu(qlvtCapPhepBienHieu.getGhiChu());
		qlvtCapPhepBienHieuImpl.setTrangThai(qlvtCapPhepBienHieu.getTrangThai());
		qlvtCapPhepBienHieuImpl.setFileId(qlvtCapPhepBienHieu.getFileId());

		return qlvtCapPhepBienHieuImpl;
	}

	/**
	 * Returns the q l v t cap phep bien hieu with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the q l v t cap phep bien hieu
	 * @return the q l v t cap phep bien hieu
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTCapPhepBienHieuException if a q l v t cap phep bien hieu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTCapPhepBienHieu findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQLVTCapPhepBienHieuException, SystemException {
		QLVTCapPhepBienHieu qlvtCapPhepBienHieu = fetchByPrimaryKey(primaryKey);

		if (qlvtCapPhepBienHieu == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQLVTCapPhepBienHieuException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtCapPhepBienHieu;
	}

	/**
	 * Returns the q l v t cap phep bien hieu with the primary key or throws a {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTCapPhepBienHieuException} if it could not be found.
	 *
	 * @param id the primary key of the q l v t cap phep bien hieu
	 * @return the q l v t cap phep bien hieu
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTCapPhepBienHieuException if a q l v t cap phep bien hieu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTCapPhepBienHieu findByPrimaryKey(int id)
		throws NoSuchQLVTCapPhepBienHieuException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the q l v t cap phep bien hieu with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the q l v t cap phep bien hieu
	 * @return the q l v t cap phep bien hieu, or <code>null</code> if a q l v t cap phep bien hieu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTCapPhepBienHieu fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QLVTCapPhepBienHieu qlvtCapPhepBienHieu = (QLVTCapPhepBienHieu)EntityCacheUtil.getResult(QLVTCapPhepBienHieuModelImpl.ENTITY_CACHE_ENABLED,
				QLVTCapPhepBienHieuImpl.class, primaryKey);

		if (qlvtCapPhepBienHieu == _nullQLVTCapPhepBienHieu) {
			return null;
		}

		if (qlvtCapPhepBienHieu == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtCapPhepBienHieu = (QLVTCapPhepBienHieu)session.get(QLVTCapPhepBienHieuImpl.class,
						primaryKey);

				if (qlvtCapPhepBienHieu != null) {
					cacheResult(qlvtCapPhepBienHieu);
				}
				else {
					EntityCacheUtil.putResult(QLVTCapPhepBienHieuModelImpl.ENTITY_CACHE_ENABLED,
						QLVTCapPhepBienHieuImpl.class, primaryKey,
						_nullQLVTCapPhepBienHieu);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QLVTCapPhepBienHieuModelImpl.ENTITY_CACHE_ENABLED,
					QLVTCapPhepBienHieuImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtCapPhepBienHieu;
	}

	/**
	 * Returns the q l v t cap phep bien hieu with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the q l v t cap phep bien hieu
	 * @return the q l v t cap phep bien hieu, or <code>null</code> if a q l v t cap phep bien hieu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTCapPhepBienHieu fetchByPrimaryKey(int id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the q l v t cap phep bien hieus.
	 *
	 * @return the q l v t cap phep bien hieus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QLVTCapPhepBienHieu> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the q l v t cap phep bien hieus.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTCapPhepBienHieuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of q l v t cap phep bien hieus
	 * @param end the upper bound of the range of q l v t cap phep bien hieus (not inclusive)
	 * @return the range of q l v t cap phep bien hieus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QLVTCapPhepBienHieu> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the q l v t cap phep bien hieus.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTCapPhepBienHieuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of q l v t cap phep bien hieus
	 * @param end the upper bound of the range of q l v t cap phep bien hieus (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of q l v t cap phep bien hieus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QLVTCapPhepBienHieu> findAll(int start, int end,
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

		List<QLVTCapPhepBienHieu> list = (List<QLVTCapPhepBienHieu>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTCAPPHEPBIENHIEU);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTCAPPHEPBIENHIEU;

				if (pagination) {
					sql = sql.concat(QLVTCapPhepBienHieuModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QLVTCapPhepBienHieu>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QLVTCapPhepBienHieu>(list);
				}
				else {
					list = (List<QLVTCapPhepBienHieu>)QueryUtil.list(q,
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
	 * Removes all the q l v t cap phep bien hieus from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QLVTCapPhepBienHieu qlvtCapPhepBienHieu : findAll()) {
			remove(qlvtCapPhepBienHieu);
		}
	}

	/**
	 * Returns the number of q l v t cap phep bien hieus.
	 *
	 * @return the number of q l v t cap phep bien hieus
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

				Query q = session.createQuery(_SQL_COUNT_QLVTCAPPHEPBIENHIEU);

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
	 * Initializes the q l v t cap phep bien hieu persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepBienHieu")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QLVTCapPhepBienHieu>> listenersList = new ArrayList<ModelListener<QLVTCapPhepBienHieu>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QLVTCapPhepBienHieu>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QLVTCapPhepBienHieuImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTCAPPHEPBIENHIEU = "SELECT qlvtCapPhepBienHieu FROM QLVTCapPhepBienHieu qlvtCapPhepBienHieu";
	private static final String _SQL_COUNT_QLVTCAPPHEPBIENHIEU = "SELECT COUNT(qlvtCapPhepBienHieu) FROM QLVTCapPhepBienHieu qlvtCapPhepBienHieu";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtCapPhepBienHieu.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QLVTCapPhepBienHieu exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QLVTCapPhepBienHieuPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "thongTinHoSoId", "loaiHinhKinhDoanhId", "soPhuHieu",
				"coQuanCapLanDauId", "CoQuanCapPhepId", "ngayCapPhuHieu",
				"thoiHanPhuHieu", "maTuyenCoDinh", "linhVucKinhDoanhXeDuLich",
				"doanhNghiepChoThue", "thoiHanThue", "hopDongSauCung",
				"ngayCapLanDau", "lanGiaHan", "ghiChu", "trangThai", "fileId"
			});
	private static QLVTCapPhepBienHieu _nullQLVTCapPhepBienHieu = new QLVTCapPhepBienHieuImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QLVTCapPhepBienHieu> toCacheModel() {
				return _nullQLVTCapPhepBienHieuCacheModel;
			}
		};

	private static CacheModel<QLVTCapPhepBienHieu> _nullQLVTCapPhepBienHieuCacheModel =
		new CacheModel<QLVTCapPhepBienHieu>() {
			@Override
			public QLVTCapPhepBienHieu toEntityModel() {
				return _nullQLVTCapPhepBienHieu;
			}
		};
}