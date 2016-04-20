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

import vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepGplvPhuongTienVanTaiTramdungnghiException;
import vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi;
import vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiImpl;
import vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the qlvt cap phep gplv phuong tien van tai tramdungnghi service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanNc
 * @see QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiPersistence
 * @see QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiUtil
 * @generated
 */
public class QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiPersistenceImpl
	extends BasePersistenceImpl<QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi>
	implements QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiUtil} to access the qlvt cap phep gplv phuong tien van tai tramdungnghi persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiModelImpl.FINDER_CACHE_ENABLED,
			QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiModelImpl.FINDER_CACHE_ENABLED,
			QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiPersistenceImpl() {
		setModelClass(QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.class);
	}

	/**
	 * Caches the qlvt cap phep gplv phuong tien van tai tramdungnghi in the entity cache if it is enabled.
	 *
	 * @param qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi the qlvt cap phep gplv phuong tien van tai tramdungnghi
	 */
	@Override
	public void cacheResult(
		QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi) {
		EntityCacheUtil.putResult(QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiImpl.class,
			qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.getPrimaryKey(),
			qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi);

		qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.resetOriginalValues();
	}

	/**
	 * Caches the qlvt cap phep gplv phuong tien van tai tramdungnghis in the entity cache if it is enabled.
	 *
	 * @param qlvtCapPhepGplvPhuongTienVanTaiTramdungnghis the qlvt cap phep gplv phuong tien van tai tramdungnghis
	 */
	@Override
	public void cacheResult(
		List<QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi> qlvtCapPhepGplvPhuongTienVanTaiTramdungnghis) {
		for (QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi : qlvtCapPhepGplvPhuongTienVanTaiTramdungnghis) {
			if (EntityCacheUtil.getResult(
						QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiModelImpl.ENTITY_CACHE_ENABLED,
						QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiImpl.class,
						qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.getPrimaryKey()) == null) {
				cacheResult(qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi);
			}
			else {
				qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qlvt cap phep gplv phuong tien van tai tramdungnghis.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qlvt cap phep gplv phuong tien van tai tramdungnghi.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi) {
		EntityCacheUtil.removeResult(QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiImpl.class,
			qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi> qlvtCapPhepGplvPhuongTienVanTaiTramdungnghis) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi : qlvtCapPhepGplvPhuongTienVanTaiTramdungnghis) {
			EntityCacheUtil.removeResult(QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiModelImpl.ENTITY_CACHE_ENABLED,
				QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiImpl.class,
				qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.getPrimaryKey());
		}
	}

	/**
	 * Creates a new qlvt cap phep gplv phuong tien van tai tramdungnghi with the primary key. Does not add the qlvt cap phep gplv phuong tien van tai tramdungnghi to the database.
	 *
	 * @param id the primary key for the new qlvt cap phep gplv phuong tien van tai tramdungnghi
	 * @return the new qlvt cap phep gplv phuong tien van tai tramdungnghi
	 */
	@Override
	public QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi create(long id) {
		QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi =
			new QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiImpl();

		qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.setNew(true);
		qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.setPrimaryKey(id);

		return qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi;
	}

	/**
	 * Removes the qlvt cap phep gplv phuong tien van tai tramdungnghi with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the qlvt cap phep gplv phuong tien van tai tramdungnghi
	 * @return the qlvt cap phep gplv phuong tien van tai tramdungnghi that was removed
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepGplvPhuongTienVanTaiTramdungnghiException if a qlvt cap phep gplv phuong tien van tai tramdungnghi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi remove(long id)
		throws NoSuchQlvtCapPhepGplvPhuongTienVanTaiTramdungnghiException,
			SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the qlvt cap phep gplv phuong tien van tai tramdungnghi with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qlvt cap phep gplv phuong tien van tai tramdungnghi
	 * @return the qlvt cap phep gplv phuong tien van tai tramdungnghi that was removed
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepGplvPhuongTienVanTaiTramdungnghiException if a qlvt cap phep gplv phuong tien van tai tramdungnghi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi remove(
		Serializable primaryKey)
		throws NoSuchQlvtCapPhepGplvPhuongTienVanTaiTramdungnghiException,
			SystemException {
		Session session = null;

		try {
			session = openSession();

			QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi =
				(QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi)session.get(QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiImpl.class,
					primaryKey);

			if (qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQlvtCapPhepGplvPhuongTienVanTaiTramdungnghiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi);
		}
		catch (NoSuchQlvtCapPhepGplvPhuongTienVanTaiTramdungnghiException nsee) {
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
	protected QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi removeImpl(
		QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi)
		throws SystemException {
		qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi = toUnwrappedModel(qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi)) {
				qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi = (QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi)session.get(QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiImpl.class,
						qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.getPrimaryKeyObj());
			}

			if (qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi != null) {
				session.delete(qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi != null) {
			clearCache(qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi);
		}

		return qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi;
	}

	@Override
	public QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi updateImpl(
		vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi)
		throws SystemException {
		qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi = toUnwrappedModel(qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi);

		boolean isNew = qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.isNew();

		Session session = null;

		try {
			session = openSession();

			if (qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.isNew()) {
				session.save(qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi);

				qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.setNew(false);
			}
			else {
				session.merge(qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi);
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

		EntityCacheUtil.putResult(QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiImpl.class,
			qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.getPrimaryKey(),
			qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi);

		return qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi;
	}

	protected QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi toUnwrappedModel(
		QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi) {
		if (qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi instanceof QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiImpl) {
			return qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi;
		}

		QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiImpl qlvtCapPhepGplvPhuongTienVanTaiTramdungnghiImpl =
			new QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiImpl();

		qlvtCapPhepGplvPhuongTienVanTaiTramdungnghiImpl.setNew(qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.isNew());
		qlvtCapPhepGplvPhuongTienVanTaiTramdungnghiImpl.setPrimaryKey(qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.getPrimaryKey());

		qlvtCapPhepGplvPhuongTienVanTaiTramdungnghiImpl.setId(qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.getId());
		qlvtCapPhepGplvPhuongTienVanTaiTramdungnghiImpl.setCapGplienvanPhuongtienId(qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.getCapGplienvanPhuongtienId());
		qlvtCapPhepGplvPhuongTienVanTaiTramdungnghiImpl.setMaTramDungNghi(qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.getMaTramDungNghi());

		return qlvtCapPhepGplvPhuongTienVanTaiTramdungnghiImpl;
	}

	/**
	 * Returns the qlvt cap phep gplv phuong tien van tai tramdungnghi with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt cap phep gplv phuong tien van tai tramdungnghi
	 * @return the qlvt cap phep gplv phuong tien van tai tramdungnghi
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepGplvPhuongTienVanTaiTramdungnghiException if a qlvt cap phep gplv phuong tien van tai tramdungnghi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchQlvtCapPhepGplvPhuongTienVanTaiTramdungnghiException,
			SystemException {
		QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi =
			fetchByPrimaryKey(primaryKey);

		if (qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQlvtCapPhepGplvPhuongTienVanTaiTramdungnghiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi;
	}

	/**
	 * Returns the qlvt cap phep gplv phuong tien van tai tramdungnghi with the primary key or throws a {@link vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepGplvPhuongTienVanTaiTramdungnghiException} if it could not be found.
	 *
	 * @param id the primary key of the qlvt cap phep gplv phuong tien van tai tramdungnghi
	 * @return the qlvt cap phep gplv phuong tien van tai tramdungnghi
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepGplvPhuongTienVanTaiTramdungnghiException if a qlvt cap phep gplv phuong tien van tai tramdungnghi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi findByPrimaryKey(long id)
		throws NoSuchQlvtCapPhepGplvPhuongTienVanTaiTramdungnghiException,
			SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the qlvt cap phep gplv phuong tien van tai tramdungnghi with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt cap phep gplv phuong tien van tai tramdungnghi
	 * @return the qlvt cap phep gplv phuong tien van tai tramdungnghi, or <code>null</code> if a qlvt cap phep gplv phuong tien van tai tramdungnghi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi =
			(QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi)EntityCacheUtil.getResult(QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiModelImpl.ENTITY_CACHE_ENABLED,
				QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiImpl.class,
				primaryKey);

		if (qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi == _nullQlvtCapPhepGplvPhuongTienVanTaiTramdungnghi) {
			return null;
		}

		if (qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi = (QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi)session.get(QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiImpl.class,
						primaryKey);

				if (qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi != null) {
					cacheResult(qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi);
				}
				else {
					EntityCacheUtil.putResult(QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiModelImpl.ENTITY_CACHE_ENABLED,
						QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiImpl.class,
						primaryKey,
						_nullQlvtCapPhepGplvPhuongTienVanTaiTramdungnghi);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiModelImpl.ENTITY_CACHE_ENABLED,
					QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiImpl.class,
					primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi;
	}

	/**
	 * Returns the qlvt cap phep gplv phuong tien van tai tramdungnghi with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the qlvt cap phep gplv phuong tien van tai tramdungnghi
	 * @return the qlvt cap phep gplv phuong tien van tai tramdungnghi, or <code>null</code> if a qlvt cap phep gplv phuong tien van tai tramdungnghi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi fetchByPrimaryKey(
		long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the qlvt cap phep gplv phuong tien van tai tramdungnghis.
	 *
	 * @return the qlvt cap phep gplv phuong tien van tai tramdungnghis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt cap phep gplv phuong tien van tai tramdungnghis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt cap phep gplv phuong tien van tai tramdungnghis
	 * @param end the upper bound of the range of qlvt cap phep gplv phuong tien van tai tramdungnghis (not inclusive)
	 * @return the range of qlvt cap phep gplv phuong tien van tai tramdungnghis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi> findAll(
		int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt cap phep gplv phuong tien van tai tramdungnghis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt cap phep gplv phuong tien van tai tramdungnghis
	 * @param end the upper bound of the range of qlvt cap phep gplv phuong tien van tai tramdungnghis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qlvt cap phep gplv phuong tien van tai tramdungnghis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi> findAll(
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
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

		List<QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi> list = (List<QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTCAPPHEPGPLVPHUONGTIENVANTAITRAMDUNGNGHI);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTCAPPHEPGPLVPHUONGTIENVANTAITRAMDUNGNGHI;

				if (pagination) {
					sql = sql.concat(QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi>(list);
				}
				else {
					list = (List<QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi>)QueryUtil.list(q,
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
	 * Removes all the qlvt cap phep gplv phuong tien van tai tramdungnghis from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi : findAll()) {
			remove(qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi);
		}
	}

	/**
	 * Returns the number of qlvt cap phep gplv phuong tien van tai tramdungnghis.
	 *
	 * @return the number of qlvt cap phep gplv phuong tien van tai tramdungnghis
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

				Query q = session.createQuery(_SQL_COUNT_QLVTCAPPHEPGPLVPHUONGTIENVANTAITRAMDUNGNGHI);

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
	 * Initializes the qlvt cap phep gplv phuong tien van tai tramdungnghi persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi>> listenersList =
					new ArrayList<ModelListener<QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTCAPPHEPGPLVPHUONGTIENVANTAITRAMDUNGNGHI =
		"SELECT qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi FROM QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi";
	private static final String _SQL_COUNT_QLVTCAPPHEPGPLVPHUONGTIENVANTAITRAMDUNGNGHI =
		"SELECT COUNT(qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi) FROM QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "capGplienvanPhuongtienId", "maTramDungNghi"
			});
	private static QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi _nullQlvtCapPhepGplvPhuongTienVanTaiTramdungnghi =
		new QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi> toCacheModel() {
				return _nullQlvtCapPhepGplvPhuongTienVanTaiTramdungnghiCacheModel;
			}
		};

	private static CacheModel<QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi> _nullQlvtCapPhepGplvPhuongTienVanTaiTramdungnghiCacheModel =
		new CacheModel<QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi>() {
			@Override
			public QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi toEntityModel() {
				return _nullQlvtCapPhepGplvPhuongTienVanTaiTramdungnghi;
			}
		};
}