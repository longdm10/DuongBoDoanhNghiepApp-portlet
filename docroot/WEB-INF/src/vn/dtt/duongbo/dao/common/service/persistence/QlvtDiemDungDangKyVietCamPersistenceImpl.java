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

package vn.dtt.duongbo.dao.common.service.persistence;

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

import vn.dtt.duongbo.dao.common.NoSuchQlvtDiemDungDangKyVietCamException;
import vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietCam;
import vn.dtt.duongbo.dao.common.model.impl.QlvtDiemDungDangKyVietCamImpl;
import vn.dtt.duongbo.dao.common.model.impl.QlvtDiemDungDangKyVietCamModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the qlvt diem dung dang ky viet cam service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see QlvtDiemDungDangKyVietCamPersistence
 * @see QlvtDiemDungDangKyVietCamUtil
 * @generated
 */
public class QlvtDiemDungDangKyVietCamPersistenceImpl
	extends BasePersistenceImpl<QlvtDiemDungDangKyVietCam>
	implements QlvtDiemDungDangKyVietCamPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QlvtDiemDungDangKyVietCamUtil} to access the qlvt diem dung dang ky viet cam persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QlvtDiemDungDangKyVietCamImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QlvtDiemDungDangKyVietCamModelImpl.ENTITY_CACHE_ENABLED,
			QlvtDiemDungDangKyVietCamModelImpl.FINDER_CACHE_ENABLED,
			QlvtDiemDungDangKyVietCamImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QlvtDiemDungDangKyVietCamModelImpl.ENTITY_CACHE_ENABLED,
			QlvtDiemDungDangKyVietCamModelImpl.FINDER_CACHE_ENABLED,
			QlvtDiemDungDangKyVietCamImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QlvtDiemDungDangKyVietCamModelImpl.ENTITY_CACHE_ENABLED,
			QlvtDiemDungDangKyVietCamModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public QlvtDiemDungDangKyVietCamPersistenceImpl() {
		setModelClass(QlvtDiemDungDangKyVietCam.class);
	}

	/**
	 * Caches the qlvt diem dung dang ky viet cam in the entity cache if it is enabled.
	 *
	 * @param qlvtDiemDungDangKyVietCam the qlvt diem dung dang ky viet cam
	 */
	@Override
	public void cacheResult(QlvtDiemDungDangKyVietCam qlvtDiemDungDangKyVietCam) {
		EntityCacheUtil.putResult(QlvtDiemDungDangKyVietCamModelImpl.ENTITY_CACHE_ENABLED,
			QlvtDiemDungDangKyVietCamImpl.class,
			qlvtDiemDungDangKyVietCam.getPrimaryKey(), qlvtDiemDungDangKyVietCam);

		qlvtDiemDungDangKyVietCam.resetOriginalValues();
	}

	/**
	 * Caches the qlvt diem dung dang ky viet cams in the entity cache if it is enabled.
	 *
	 * @param qlvtDiemDungDangKyVietCams the qlvt diem dung dang ky viet cams
	 */
	@Override
	public void cacheResult(
		List<QlvtDiemDungDangKyVietCam> qlvtDiemDungDangKyVietCams) {
		for (QlvtDiemDungDangKyVietCam qlvtDiemDungDangKyVietCam : qlvtDiemDungDangKyVietCams) {
			if (EntityCacheUtil.getResult(
						QlvtDiemDungDangKyVietCamModelImpl.ENTITY_CACHE_ENABLED,
						QlvtDiemDungDangKyVietCamImpl.class,
						qlvtDiemDungDangKyVietCam.getPrimaryKey()) == null) {
				cacheResult(qlvtDiemDungDangKyVietCam);
			}
			else {
				qlvtDiemDungDangKyVietCam.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qlvt diem dung dang ky viet cams.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QlvtDiemDungDangKyVietCamImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QlvtDiemDungDangKyVietCamImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qlvt diem dung dang ky viet cam.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QlvtDiemDungDangKyVietCam qlvtDiemDungDangKyVietCam) {
		EntityCacheUtil.removeResult(QlvtDiemDungDangKyVietCamModelImpl.ENTITY_CACHE_ENABLED,
			QlvtDiemDungDangKyVietCamImpl.class,
			qlvtDiemDungDangKyVietCam.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<QlvtDiemDungDangKyVietCam> qlvtDiemDungDangKyVietCams) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QlvtDiemDungDangKyVietCam qlvtDiemDungDangKyVietCam : qlvtDiemDungDangKyVietCams) {
			EntityCacheUtil.removeResult(QlvtDiemDungDangKyVietCamModelImpl.ENTITY_CACHE_ENABLED,
				QlvtDiemDungDangKyVietCamImpl.class,
				qlvtDiemDungDangKyVietCam.getPrimaryKey());
		}
	}

	/**
	 * Creates a new qlvt diem dung dang ky viet cam with the primary key. Does not add the qlvt diem dung dang ky viet cam to the database.
	 *
	 * @param id the primary key for the new qlvt diem dung dang ky viet cam
	 * @return the new qlvt diem dung dang ky viet cam
	 */
	@Override
	public QlvtDiemDungDangKyVietCam create(long id) {
		QlvtDiemDungDangKyVietCam qlvtDiemDungDangKyVietCam = new QlvtDiemDungDangKyVietCamImpl();

		qlvtDiemDungDangKyVietCam.setNew(true);
		qlvtDiemDungDangKyVietCam.setPrimaryKey(id);

		return qlvtDiemDungDangKyVietCam;
	}

	/**
	 * Removes the qlvt diem dung dang ky viet cam with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the qlvt diem dung dang ky viet cam
	 * @return the qlvt diem dung dang ky viet cam that was removed
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtDiemDungDangKyVietCamException if a qlvt diem dung dang ky viet cam with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtDiemDungDangKyVietCam remove(long id)
		throws NoSuchQlvtDiemDungDangKyVietCamException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the qlvt diem dung dang ky viet cam with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qlvt diem dung dang ky viet cam
	 * @return the qlvt diem dung dang ky viet cam that was removed
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtDiemDungDangKyVietCamException if a qlvt diem dung dang ky viet cam with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtDiemDungDangKyVietCam remove(Serializable primaryKey)
		throws NoSuchQlvtDiemDungDangKyVietCamException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QlvtDiemDungDangKyVietCam qlvtDiemDungDangKyVietCam = (QlvtDiemDungDangKyVietCam)session.get(QlvtDiemDungDangKyVietCamImpl.class,
					primaryKey);

			if (qlvtDiemDungDangKyVietCam == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQlvtDiemDungDangKyVietCamException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtDiemDungDangKyVietCam);
		}
		catch (NoSuchQlvtDiemDungDangKyVietCamException nsee) {
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
	protected QlvtDiemDungDangKyVietCam removeImpl(
		QlvtDiemDungDangKyVietCam qlvtDiemDungDangKyVietCam)
		throws SystemException {
		qlvtDiemDungDangKyVietCam = toUnwrappedModel(qlvtDiemDungDangKyVietCam);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtDiemDungDangKyVietCam)) {
				qlvtDiemDungDangKyVietCam = (QlvtDiemDungDangKyVietCam)session.get(QlvtDiemDungDangKyVietCamImpl.class,
						qlvtDiemDungDangKyVietCam.getPrimaryKeyObj());
			}

			if (qlvtDiemDungDangKyVietCam != null) {
				session.delete(qlvtDiemDungDangKyVietCam);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtDiemDungDangKyVietCam != null) {
			clearCache(qlvtDiemDungDangKyVietCam);
		}

		return qlvtDiemDungDangKyVietCam;
	}

	@Override
	public QlvtDiemDungDangKyVietCam updateImpl(
		vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietCam qlvtDiemDungDangKyVietCam)
		throws SystemException {
		qlvtDiemDungDangKyVietCam = toUnwrappedModel(qlvtDiemDungDangKyVietCam);

		boolean isNew = qlvtDiemDungDangKyVietCam.isNew();

		Session session = null;

		try {
			session = openSession();

			if (qlvtDiemDungDangKyVietCam.isNew()) {
				session.save(qlvtDiemDungDangKyVietCam);

				qlvtDiemDungDangKyVietCam.setNew(false);
			}
			else {
				session.merge(qlvtDiemDungDangKyVietCam);
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

		EntityCacheUtil.putResult(QlvtDiemDungDangKyVietCamModelImpl.ENTITY_CACHE_ENABLED,
			QlvtDiemDungDangKyVietCamImpl.class,
			qlvtDiemDungDangKyVietCam.getPrimaryKey(), qlvtDiemDungDangKyVietCam);

		return qlvtDiemDungDangKyVietCam;
	}

	protected QlvtDiemDungDangKyVietCam toUnwrappedModel(
		QlvtDiemDungDangKyVietCam qlvtDiemDungDangKyVietCam) {
		if (qlvtDiemDungDangKyVietCam instanceof QlvtDiemDungDangKyVietCamImpl) {
			return qlvtDiemDungDangKyVietCam;
		}

		QlvtDiemDungDangKyVietCamImpl qlvtDiemDungDangKyVietCamImpl = new QlvtDiemDungDangKyVietCamImpl();

		qlvtDiemDungDangKyVietCamImpl.setNew(qlvtDiemDungDangKyVietCam.isNew());
		qlvtDiemDungDangKyVietCamImpl.setPrimaryKey(qlvtDiemDungDangKyVietCam.getPrimaryKey());

		qlvtDiemDungDangKyVietCamImpl.setId(qlvtDiemDungDangKyVietCam.getId());
		qlvtDiemDungDangKyVietCamImpl.setPhuongTienDangKyId(qlvtDiemDungDangKyVietCam.getPhuongTienDangKyId());
		qlvtDiemDungDangKyVietCamImpl.setNoiDungHoSoId(qlvtDiemDungDangKyVietCam.getNoiDungHoSoId());
		qlvtDiemDungDangKyVietCamImpl.setHoSoThuTucId(qlvtDiemDungDangKyVietCam.getHoSoThuTucId());
		qlvtDiemDungDangKyVietCamImpl.setMaDiemDung(qlvtDiemDungDangKyVietCam.getMaDiemDung());
		qlvtDiemDungDangKyVietCamImpl.setTenDiemDung(qlvtDiemDungDangKyVietCam.getTenDiemDung());

		return qlvtDiemDungDangKyVietCamImpl;
	}

	/**
	 * Returns the qlvt diem dung dang ky viet cam with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt diem dung dang ky viet cam
	 * @return the qlvt diem dung dang ky viet cam
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtDiemDungDangKyVietCamException if a qlvt diem dung dang ky viet cam with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtDiemDungDangKyVietCam findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQlvtDiemDungDangKyVietCamException, SystemException {
		QlvtDiemDungDangKyVietCam qlvtDiemDungDangKyVietCam = fetchByPrimaryKey(primaryKey);

		if (qlvtDiemDungDangKyVietCam == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQlvtDiemDungDangKyVietCamException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtDiemDungDangKyVietCam;
	}

	/**
	 * Returns the qlvt diem dung dang ky viet cam with the primary key or throws a {@link vn.dtt.duongbo.dao.common.NoSuchQlvtDiemDungDangKyVietCamException} if it could not be found.
	 *
	 * @param id the primary key of the qlvt diem dung dang ky viet cam
	 * @return the qlvt diem dung dang ky viet cam
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtDiemDungDangKyVietCamException if a qlvt diem dung dang ky viet cam with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtDiemDungDangKyVietCam findByPrimaryKey(long id)
		throws NoSuchQlvtDiemDungDangKyVietCamException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the qlvt diem dung dang ky viet cam with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt diem dung dang ky viet cam
	 * @return the qlvt diem dung dang ky viet cam, or <code>null</code> if a qlvt diem dung dang ky viet cam with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtDiemDungDangKyVietCam fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QlvtDiemDungDangKyVietCam qlvtDiemDungDangKyVietCam = (QlvtDiemDungDangKyVietCam)EntityCacheUtil.getResult(QlvtDiemDungDangKyVietCamModelImpl.ENTITY_CACHE_ENABLED,
				QlvtDiemDungDangKyVietCamImpl.class, primaryKey);

		if (qlvtDiemDungDangKyVietCam == _nullQlvtDiemDungDangKyVietCam) {
			return null;
		}

		if (qlvtDiemDungDangKyVietCam == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtDiemDungDangKyVietCam = (QlvtDiemDungDangKyVietCam)session.get(QlvtDiemDungDangKyVietCamImpl.class,
						primaryKey);

				if (qlvtDiemDungDangKyVietCam != null) {
					cacheResult(qlvtDiemDungDangKyVietCam);
				}
				else {
					EntityCacheUtil.putResult(QlvtDiemDungDangKyVietCamModelImpl.ENTITY_CACHE_ENABLED,
						QlvtDiemDungDangKyVietCamImpl.class, primaryKey,
						_nullQlvtDiemDungDangKyVietCam);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QlvtDiemDungDangKyVietCamModelImpl.ENTITY_CACHE_ENABLED,
					QlvtDiemDungDangKyVietCamImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtDiemDungDangKyVietCam;
	}

	/**
	 * Returns the qlvt diem dung dang ky viet cam with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the qlvt diem dung dang ky viet cam
	 * @return the qlvt diem dung dang ky viet cam, or <code>null</code> if a qlvt diem dung dang ky viet cam with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtDiemDungDangKyVietCam fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the qlvt diem dung dang ky viet cams.
	 *
	 * @return the qlvt diem dung dang ky viet cams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtDiemDungDangKyVietCam> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt diem dung dang ky viet cams.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtDiemDungDangKyVietCamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt diem dung dang ky viet cams
	 * @param end the upper bound of the range of qlvt diem dung dang ky viet cams (not inclusive)
	 * @return the range of qlvt diem dung dang ky viet cams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtDiemDungDangKyVietCam> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt diem dung dang ky viet cams.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtDiemDungDangKyVietCamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt diem dung dang ky viet cams
	 * @param end the upper bound of the range of qlvt diem dung dang ky viet cams (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qlvt diem dung dang ky viet cams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtDiemDungDangKyVietCam> findAll(int start, int end,
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

		List<QlvtDiemDungDangKyVietCam> list = (List<QlvtDiemDungDangKyVietCam>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTDIEMDUNGDANGKYVIETCAM);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTDIEMDUNGDANGKYVIETCAM;

				if (pagination) {
					sql = sql.concat(QlvtDiemDungDangKyVietCamModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QlvtDiemDungDangKyVietCam>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtDiemDungDangKyVietCam>(list);
				}
				else {
					list = (List<QlvtDiemDungDangKyVietCam>)QueryUtil.list(q,
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
	 * Removes all the qlvt diem dung dang ky viet cams from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QlvtDiemDungDangKyVietCam qlvtDiemDungDangKyVietCam : findAll()) {
			remove(qlvtDiemDungDangKyVietCam);
		}
	}

	/**
	 * Returns the number of qlvt diem dung dang ky viet cams.
	 *
	 * @return the number of qlvt diem dung dang ky viet cams
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

				Query q = session.createQuery(_SQL_COUNT_QLVTDIEMDUNGDANGKYVIETCAM);

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
	 * Initializes the qlvt diem dung dang ky viet cam persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietCam")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QlvtDiemDungDangKyVietCam>> listenersList = new ArrayList<ModelListener<QlvtDiemDungDangKyVietCam>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QlvtDiemDungDangKyVietCam>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QlvtDiemDungDangKyVietCamImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTDIEMDUNGDANGKYVIETCAM = "SELECT qlvtDiemDungDangKyVietCam FROM QlvtDiemDungDangKyVietCam qlvtDiemDungDangKyVietCam";
	private static final String _SQL_COUNT_QLVTDIEMDUNGDANGKYVIETCAM = "SELECT COUNT(qlvtDiemDungDangKyVietCam) FROM QlvtDiemDungDangKyVietCam qlvtDiemDungDangKyVietCam";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtDiemDungDangKyVietCam.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QlvtDiemDungDangKyVietCam exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QlvtDiemDungDangKyVietCamPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "PhuongTienDangKyId", "NoiDungHoSoId", "HoSoThuTucId",
				"MaDiemDung", "TenDiemDung"
			});
	private static QlvtDiemDungDangKyVietCam _nullQlvtDiemDungDangKyVietCam = new QlvtDiemDungDangKyVietCamImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QlvtDiemDungDangKyVietCam> toCacheModel() {
				return _nullQlvtDiemDungDangKyVietCamCacheModel;
			}
		};

	private static CacheModel<QlvtDiemDungDangKyVietCam> _nullQlvtDiemDungDangKyVietCamCacheModel =
		new CacheModel<QlvtDiemDungDangKyVietCam>() {
			@Override
			public QlvtDiemDungDangKyVietCam toEntityModel() {
				return _nullQlvtDiemDungDangKyVietCam;
			}
		};
}