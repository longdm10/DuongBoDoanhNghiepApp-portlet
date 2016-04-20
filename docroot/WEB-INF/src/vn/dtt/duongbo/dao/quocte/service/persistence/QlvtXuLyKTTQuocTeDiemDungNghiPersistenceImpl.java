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

package vn.dtt.duongbo.dao.quocte.service.persistence;

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

import vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeDiemDungNghiException;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeDiemDungNghi;
import vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTeDiemDungNghiImpl;
import vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTeDiemDungNghiModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the qlvt xu ly k t t quoc te diem dung nghi service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NoiPham
 * @see QlvtXuLyKTTQuocTeDiemDungNghiPersistence
 * @see QlvtXuLyKTTQuocTeDiemDungNghiUtil
 * @generated
 */
public class QlvtXuLyKTTQuocTeDiemDungNghiPersistenceImpl
	extends BasePersistenceImpl<QlvtXuLyKTTQuocTeDiemDungNghi>
	implements QlvtXuLyKTTQuocTeDiemDungNghiPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QlvtXuLyKTTQuocTeDiemDungNghiUtil} to access the qlvt xu ly k t t quoc te diem dung nghi persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QlvtXuLyKTTQuocTeDiemDungNghiImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QlvtXuLyKTTQuocTeDiemDungNghiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyKTTQuocTeDiemDungNghiModelImpl.FINDER_CACHE_ENABLED,
			QlvtXuLyKTTQuocTeDiemDungNghiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QlvtXuLyKTTQuocTeDiemDungNghiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyKTTQuocTeDiemDungNghiModelImpl.FINDER_CACHE_ENABLED,
			QlvtXuLyKTTQuocTeDiemDungNghiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QlvtXuLyKTTQuocTeDiemDungNghiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyKTTQuocTeDiemDungNghiModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public QlvtXuLyKTTQuocTeDiemDungNghiPersistenceImpl() {
		setModelClass(QlvtXuLyKTTQuocTeDiemDungNghi.class);
	}

	/**
	 * Caches the qlvt xu ly k t t quoc te diem dung nghi in the entity cache if it is enabled.
	 *
	 * @param qlvtXuLyKTTQuocTeDiemDungNghi the qlvt xu ly k t t quoc te diem dung nghi
	 */
	@Override
	public void cacheResult(
		QlvtXuLyKTTQuocTeDiemDungNghi qlvtXuLyKTTQuocTeDiemDungNghi) {
		EntityCacheUtil.putResult(QlvtXuLyKTTQuocTeDiemDungNghiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyKTTQuocTeDiemDungNghiImpl.class,
			qlvtXuLyKTTQuocTeDiemDungNghi.getPrimaryKey(),
			qlvtXuLyKTTQuocTeDiemDungNghi);

		qlvtXuLyKTTQuocTeDiemDungNghi.resetOriginalValues();
	}

	/**
	 * Caches the qlvt xu ly k t t quoc te diem dung nghis in the entity cache if it is enabled.
	 *
	 * @param qlvtXuLyKTTQuocTeDiemDungNghis the qlvt xu ly k t t quoc te diem dung nghis
	 */
	@Override
	public void cacheResult(
		List<QlvtXuLyKTTQuocTeDiemDungNghi> qlvtXuLyKTTQuocTeDiemDungNghis) {
		for (QlvtXuLyKTTQuocTeDiemDungNghi qlvtXuLyKTTQuocTeDiemDungNghi : qlvtXuLyKTTQuocTeDiemDungNghis) {
			if (EntityCacheUtil.getResult(
						QlvtXuLyKTTQuocTeDiemDungNghiModelImpl.ENTITY_CACHE_ENABLED,
						QlvtXuLyKTTQuocTeDiemDungNghiImpl.class,
						qlvtXuLyKTTQuocTeDiemDungNghi.getPrimaryKey()) == null) {
				cacheResult(qlvtXuLyKTTQuocTeDiemDungNghi);
			}
			else {
				qlvtXuLyKTTQuocTeDiemDungNghi.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qlvt xu ly k t t quoc te diem dung nghis.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QlvtXuLyKTTQuocTeDiemDungNghiImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QlvtXuLyKTTQuocTeDiemDungNghiImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qlvt xu ly k t t quoc te diem dung nghi.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		QlvtXuLyKTTQuocTeDiemDungNghi qlvtXuLyKTTQuocTeDiemDungNghi) {
		EntityCacheUtil.removeResult(QlvtXuLyKTTQuocTeDiemDungNghiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyKTTQuocTeDiemDungNghiImpl.class,
			qlvtXuLyKTTQuocTeDiemDungNghi.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<QlvtXuLyKTTQuocTeDiemDungNghi> qlvtXuLyKTTQuocTeDiemDungNghis) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QlvtXuLyKTTQuocTeDiemDungNghi qlvtXuLyKTTQuocTeDiemDungNghi : qlvtXuLyKTTQuocTeDiemDungNghis) {
			EntityCacheUtil.removeResult(QlvtXuLyKTTQuocTeDiemDungNghiModelImpl.ENTITY_CACHE_ENABLED,
				QlvtXuLyKTTQuocTeDiemDungNghiImpl.class,
				qlvtXuLyKTTQuocTeDiemDungNghi.getPrimaryKey());
		}
	}

	/**
	 * Creates a new qlvt xu ly k t t quoc te diem dung nghi with the primary key. Does not add the qlvt xu ly k t t quoc te diem dung nghi to the database.
	 *
	 * @param id the primary key for the new qlvt xu ly k t t quoc te diem dung nghi
	 * @return the new qlvt xu ly k t t quoc te diem dung nghi
	 */
	@Override
	public QlvtXuLyKTTQuocTeDiemDungNghi create(long id) {
		QlvtXuLyKTTQuocTeDiemDungNghi qlvtXuLyKTTQuocTeDiemDungNghi = new QlvtXuLyKTTQuocTeDiemDungNghiImpl();

		qlvtXuLyKTTQuocTeDiemDungNghi.setNew(true);
		qlvtXuLyKTTQuocTeDiemDungNghi.setPrimaryKey(id);

		return qlvtXuLyKTTQuocTeDiemDungNghi;
	}

	/**
	 * Removes the qlvt xu ly k t t quoc te diem dung nghi with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the qlvt xu ly k t t quoc te diem dung nghi
	 * @return the qlvt xu ly k t t quoc te diem dung nghi that was removed
	 * @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeDiemDungNghiException if a qlvt xu ly k t t quoc te diem dung nghi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyKTTQuocTeDiemDungNghi remove(long id)
		throws NoSuchQlvtXuLyKTTQuocTeDiemDungNghiException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the qlvt xu ly k t t quoc te diem dung nghi with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qlvt xu ly k t t quoc te diem dung nghi
	 * @return the qlvt xu ly k t t quoc te diem dung nghi that was removed
	 * @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeDiemDungNghiException if a qlvt xu ly k t t quoc te diem dung nghi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyKTTQuocTeDiemDungNghi remove(Serializable primaryKey)
		throws NoSuchQlvtXuLyKTTQuocTeDiemDungNghiException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QlvtXuLyKTTQuocTeDiemDungNghi qlvtXuLyKTTQuocTeDiemDungNghi = (QlvtXuLyKTTQuocTeDiemDungNghi)session.get(QlvtXuLyKTTQuocTeDiemDungNghiImpl.class,
					primaryKey);

			if (qlvtXuLyKTTQuocTeDiemDungNghi == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQlvtXuLyKTTQuocTeDiemDungNghiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtXuLyKTTQuocTeDiemDungNghi);
		}
		catch (NoSuchQlvtXuLyKTTQuocTeDiemDungNghiException nsee) {
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
	protected QlvtXuLyKTTQuocTeDiemDungNghi removeImpl(
		QlvtXuLyKTTQuocTeDiemDungNghi qlvtXuLyKTTQuocTeDiemDungNghi)
		throws SystemException {
		qlvtXuLyKTTQuocTeDiemDungNghi = toUnwrappedModel(qlvtXuLyKTTQuocTeDiemDungNghi);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtXuLyKTTQuocTeDiemDungNghi)) {
				qlvtXuLyKTTQuocTeDiemDungNghi = (QlvtXuLyKTTQuocTeDiemDungNghi)session.get(QlvtXuLyKTTQuocTeDiemDungNghiImpl.class,
						qlvtXuLyKTTQuocTeDiemDungNghi.getPrimaryKeyObj());
			}

			if (qlvtXuLyKTTQuocTeDiemDungNghi != null) {
				session.delete(qlvtXuLyKTTQuocTeDiemDungNghi);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtXuLyKTTQuocTeDiemDungNghi != null) {
			clearCache(qlvtXuLyKTTQuocTeDiemDungNghi);
		}

		return qlvtXuLyKTTQuocTeDiemDungNghi;
	}

	@Override
	public QlvtXuLyKTTQuocTeDiemDungNghi updateImpl(
		vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeDiemDungNghi qlvtXuLyKTTQuocTeDiemDungNghi)
		throws SystemException {
		qlvtXuLyKTTQuocTeDiemDungNghi = toUnwrappedModel(qlvtXuLyKTTQuocTeDiemDungNghi);

		boolean isNew = qlvtXuLyKTTQuocTeDiemDungNghi.isNew();

		Session session = null;

		try {
			session = openSession();

			if (qlvtXuLyKTTQuocTeDiemDungNghi.isNew()) {
				session.save(qlvtXuLyKTTQuocTeDiemDungNghi);

				qlvtXuLyKTTQuocTeDiemDungNghi.setNew(false);
			}
			else {
				session.merge(qlvtXuLyKTTQuocTeDiemDungNghi);
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

		EntityCacheUtil.putResult(QlvtXuLyKTTQuocTeDiemDungNghiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyKTTQuocTeDiemDungNghiImpl.class,
			qlvtXuLyKTTQuocTeDiemDungNghi.getPrimaryKey(),
			qlvtXuLyKTTQuocTeDiemDungNghi);

		return qlvtXuLyKTTQuocTeDiemDungNghi;
	}

	protected QlvtXuLyKTTQuocTeDiemDungNghi toUnwrappedModel(
		QlvtXuLyKTTQuocTeDiemDungNghi qlvtXuLyKTTQuocTeDiemDungNghi) {
		if (qlvtXuLyKTTQuocTeDiemDungNghi instanceof QlvtXuLyKTTQuocTeDiemDungNghiImpl) {
			return qlvtXuLyKTTQuocTeDiemDungNghi;
		}

		QlvtXuLyKTTQuocTeDiemDungNghiImpl qlvtXuLyKTTQuocTeDiemDungNghiImpl = new QlvtXuLyKTTQuocTeDiemDungNghiImpl();

		qlvtXuLyKTTQuocTeDiemDungNghiImpl.setNew(qlvtXuLyKTTQuocTeDiemDungNghi.isNew());
		qlvtXuLyKTTQuocTeDiemDungNghiImpl.setPrimaryKey(qlvtXuLyKTTQuocTeDiemDungNghi.getPrimaryKey());

		qlvtXuLyKTTQuocTeDiemDungNghiImpl.setId(qlvtXuLyKTTQuocTeDiemDungNghi.getId());
		qlvtXuLyKTTQuocTeDiemDungNghiImpl.setKttQuocTeId(qlvtXuLyKTTQuocTeDiemDungNghi.getKttQuocTeId());
		qlvtXuLyKTTQuocTeDiemDungNghiImpl.setLoaiLuot(qlvtXuLyKTTQuocTeDiemDungNghi.getLoaiLuot());
		qlvtXuLyKTTQuocTeDiemDungNghiImpl.setSoThuTuLuot(qlvtXuLyKTTQuocTeDiemDungNghi.getSoThuTuLuot());
		qlvtXuLyKTTQuocTeDiemDungNghiImpl.setMaBen(qlvtXuLyKTTQuocTeDiemDungNghi.getMaBen());
		qlvtXuLyKTTQuocTeDiemDungNghiImpl.setSoGioDungNghi(qlvtXuLyKTTQuocTeDiemDungNghi.getSoGioDungNghi());
		qlvtXuLyKTTQuocTeDiemDungNghiImpl.setSoPhutDungNghi(qlvtXuLyKTTQuocTeDiemDungNghi.getSoPhutDungNghi());

		return qlvtXuLyKTTQuocTeDiemDungNghiImpl;
	}

	/**
	 * Returns the qlvt xu ly k t t quoc te diem dung nghi with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt xu ly k t t quoc te diem dung nghi
	 * @return the qlvt xu ly k t t quoc te diem dung nghi
	 * @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeDiemDungNghiException if a qlvt xu ly k t t quoc te diem dung nghi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyKTTQuocTeDiemDungNghi findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchQlvtXuLyKTTQuocTeDiemDungNghiException, SystemException {
		QlvtXuLyKTTQuocTeDiemDungNghi qlvtXuLyKTTQuocTeDiemDungNghi = fetchByPrimaryKey(primaryKey);

		if (qlvtXuLyKTTQuocTeDiemDungNghi == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQlvtXuLyKTTQuocTeDiemDungNghiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtXuLyKTTQuocTeDiemDungNghi;
	}

	/**
	 * Returns the qlvt xu ly k t t quoc te diem dung nghi with the primary key or throws a {@link vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeDiemDungNghiException} if it could not be found.
	 *
	 * @param id the primary key of the qlvt xu ly k t t quoc te diem dung nghi
	 * @return the qlvt xu ly k t t quoc te diem dung nghi
	 * @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeDiemDungNghiException if a qlvt xu ly k t t quoc te diem dung nghi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyKTTQuocTeDiemDungNghi findByPrimaryKey(long id)
		throws NoSuchQlvtXuLyKTTQuocTeDiemDungNghiException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the qlvt xu ly k t t quoc te diem dung nghi with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt xu ly k t t quoc te diem dung nghi
	 * @return the qlvt xu ly k t t quoc te diem dung nghi, or <code>null</code> if a qlvt xu ly k t t quoc te diem dung nghi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyKTTQuocTeDiemDungNghi fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		QlvtXuLyKTTQuocTeDiemDungNghi qlvtXuLyKTTQuocTeDiemDungNghi = (QlvtXuLyKTTQuocTeDiemDungNghi)EntityCacheUtil.getResult(QlvtXuLyKTTQuocTeDiemDungNghiModelImpl.ENTITY_CACHE_ENABLED,
				QlvtXuLyKTTQuocTeDiemDungNghiImpl.class, primaryKey);

		if (qlvtXuLyKTTQuocTeDiemDungNghi == _nullQlvtXuLyKTTQuocTeDiemDungNghi) {
			return null;
		}

		if (qlvtXuLyKTTQuocTeDiemDungNghi == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtXuLyKTTQuocTeDiemDungNghi = (QlvtXuLyKTTQuocTeDiemDungNghi)session.get(QlvtXuLyKTTQuocTeDiemDungNghiImpl.class,
						primaryKey);

				if (qlvtXuLyKTTQuocTeDiemDungNghi != null) {
					cacheResult(qlvtXuLyKTTQuocTeDiemDungNghi);
				}
				else {
					EntityCacheUtil.putResult(QlvtXuLyKTTQuocTeDiemDungNghiModelImpl.ENTITY_CACHE_ENABLED,
						QlvtXuLyKTTQuocTeDiemDungNghiImpl.class, primaryKey,
						_nullQlvtXuLyKTTQuocTeDiemDungNghi);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QlvtXuLyKTTQuocTeDiemDungNghiModelImpl.ENTITY_CACHE_ENABLED,
					QlvtXuLyKTTQuocTeDiemDungNghiImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtXuLyKTTQuocTeDiemDungNghi;
	}

	/**
	 * Returns the qlvt xu ly k t t quoc te diem dung nghi with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the qlvt xu ly k t t quoc te diem dung nghi
	 * @return the qlvt xu ly k t t quoc te diem dung nghi, or <code>null</code> if a qlvt xu ly k t t quoc te diem dung nghi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyKTTQuocTeDiemDungNghi fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the qlvt xu ly k t t quoc te diem dung nghis.
	 *
	 * @return the qlvt xu ly k t t quoc te diem dung nghis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyKTTQuocTeDiemDungNghi> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt xu ly k t t quoc te diem dung nghis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTeDiemDungNghiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt xu ly k t t quoc te diem dung nghis
	 * @param end the upper bound of the range of qlvt xu ly k t t quoc te diem dung nghis (not inclusive)
	 * @return the range of qlvt xu ly k t t quoc te diem dung nghis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyKTTQuocTeDiemDungNghi> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt xu ly k t t quoc te diem dung nghis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTeDiemDungNghiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt xu ly k t t quoc te diem dung nghis
	 * @param end the upper bound of the range of qlvt xu ly k t t quoc te diem dung nghis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qlvt xu ly k t t quoc te diem dung nghis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyKTTQuocTeDiemDungNghi> findAll(int start, int end,
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

		List<QlvtXuLyKTTQuocTeDiemDungNghi> list = (List<QlvtXuLyKTTQuocTeDiemDungNghi>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTXULYKTTQUOCTEDIEMDUNGNGHI);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTXULYKTTQUOCTEDIEMDUNGNGHI;

				if (pagination) {
					sql = sql.concat(QlvtXuLyKTTQuocTeDiemDungNghiModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QlvtXuLyKTTQuocTeDiemDungNghi>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtXuLyKTTQuocTeDiemDungNghi>(list);
				}
				else {
					list = (List<QlvtXuLyKTTQuocTeDiemDungNghi>)QueryUtil.list(q,
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
	 * Removes all the qlvt xu ly k t t quoc te diem dung nghis from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QlvtXuLyKTTQuocTeDiemDungNghi qlvtXuLyKTTQuocTeDiemDungNghi : findAll()) {
			remove(qlvtXuLyKTTQuocTeDiemDungNghi);
		}
	}

	/**
	 * Returns the number of qlvt xu ly k t t quoc te diem dung nghis.
	 *
	 * @return the number of qlvt xu ly k t t quoc te diem dung nghis
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

				Query q = session.createQuery(_SQL_COUNT_QLVTXULYKTTQUOCTEDIEMDUNGNGHI);

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
	 * Initializes the qlvt xu ly k t t quoc te diem dung nghi persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeDiemDungNghi")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QlvtXuLyKTTQuocTeDiemDungNghi>> listenersList =
					new ArrayList<ModelListener<QlvtXuLyKTTQuocTeDiemDungNghi>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QlvtXuLyKTTQuocTeDiemDungNghi>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QlvtXuLyKTTQuocTeDiemDungNghiImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTXULYKTTQUOCTEDIEMDUNGNGHI = "SELECT qlvtXuLyKTTQuocTeDiemDungNghi FROM QlvtXuLyKTTQuocTeDiemDungNghi qlvtXuLyKTTQuocTeDiemDungNghi";
	private static final String _SQL_COUNT_QLVTXULYKTTQUOCTEDIEMDUNGNGHI = "SELECT COUNT(qlvtXuLyKTTQuocTeDiemDungNghi) FROM QlvtXuLyKTTQuocTeDiemDungNghi qlvtXuLyKTTQuocTeDiemDungNghi";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtXuLyKTTQuocTeDiemDungNghi.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QlvtXuLyKTTQuocTeDiemDungNghi exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QlvtXuLyKTTQuocTeDiemDungNghiPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "kttQuocTeId", "loaiLuot", "soThuTuLuot", "maBen",
				"soGioDungNghi", "soPhutDungNghi"
			});
	private static QlvtXuLyKTTQuocTeDiemDungNghi _nullQlvtXuLyKTTQuocTeDiemDungNghi =
		new QlvtXuLyKTTQuocTeDiemDungNghiImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QlvtXuLyKTTQuocTeDiemDungNghi> toCacheModel() {
				return _nullQlvtXuLyKTTQuocTeDiemDungNghiCacheModel;
			}
		};

	private static CacheModel<QlvtXuLyKTTQuocTeDiemDungNghi> _nullQlvtXuLyKTTQuocTeDiemDungNghiCacheModel =
		new CacheModel<QlvtXuLyKTTQuocTeDiemDungNghi>() {
			@Override
			public QlvtXuLyKTTQuocTeDiemDungNghi toEntityModel() {
				return _nullQlvtXuLyKTTQuocTeDiemDungNghi;
			}
		};
}