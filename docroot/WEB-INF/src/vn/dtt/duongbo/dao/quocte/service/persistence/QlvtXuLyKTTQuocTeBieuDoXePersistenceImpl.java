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

import vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeBieuDoXeException;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXe;
import vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTeBieuDoXeImpl;
import vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTeBieuDoXeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the qlvt xu ly k t t quoc te bieu do xe service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NoiPham
 * @see QlvtXuLyKTTQuocTeBieuDoXePersistence
 * @see QlvtXuLyKTTQuocTeBieuDoXeUtil
 * @generated
 */
public class QlvtXuLyKTTQuocTeBieuDoXePersistenceImpl
	extends BasePersistenceImpl<QlvtXuLyKTTQuocTeBieuDoXe>
	implements QlvtXuLyKTTQuocTeBieuDoXePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QlvtXuLyKTTQuocTeBieuDoXeUtil} to access the qlvt xu ly k t t quoc te bieu do xe persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QlvtXuLyKTTQuocTeBieuDoXeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QlvtXuLyKTTQuocTeBieuDoXeModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyKTTQuocTeBieuDoXeModelImpl.FINDER_CACHE_ENABLED,
			QlvtXuLyKTTQuocTeBieuDoXeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QlvtXuLyKTTQuocTeBieuDoXeModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyKTTQuocTeBieuDoXeModelImpl.FINDER_CACHE_ENABLED,
			QlvtXuLyKTTQuocTeBieuDoXeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QlvtXuLyKTTQuocTeBieuDoXeModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyKTTQuocTeBieuDoXeModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public QlvtXuLyKTTQuocTeBieuDoXePersistenceImpl() {
		setModelClass(QlvtXuLyKTTQuocTeBieuDoXe.class);
	}

	/**
	 * Caches the qlvt xu ly k t t quoc te bieu do xe in the entity cache if it is enabled.
	 *
	 * @param qlvtXuLyKTTQuocTeBieuDoXe the qlvt xu ly k t t quoc te bieu do xe
	 */
	@Override
	public void cacheResult(QlvtXuLyKTTQuocTeBieuDoXe qlvtXuLyKTTQuocTeBieuDoXe) {
		EntityCacheUtil.putResult(QlvtXuLyKTTQuocTeBieuDoXeModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyKTTQuocTeBieuDoXeImpl.class,
			qlvtXuLyKTTQuocTeBieuDoXe.getPrimaryKey(), qlvtXuLyKTTQuocTeBieuDoXe);

		qlvtXuLyKTTQuocTeBieuDoXe.resetOriginalValues();
	}

	/**
	 * Caches the qlvt xu ly k t t quoc te bieu do xes in the entity cache if it is enabled.
	 *
	 * @param qlvtXuLyKTTQuocTeBieuDoXes the qlvt xu ly k t t quoc te bieu do xes
	 */
	@Override
	public void cacheResult(
		List<QlvtXuLyKTTQuocTeBieuDoXe> qlvtXuLyKTTQuocTeBieuDoXes) {
		for (QlvtXuLyKTTQuocTeBieuDoXe qlvtXuLyKTTQuocTeBieuDoXe : qlvtXuLyKTTQuocTeBieuDoXes) {
			if (EntityCacheUtil.getResult(
						QlvtXuLyKTTQuocTeBieuDoXeModelImpl.ENTITY_CACHE_ENABLED,
						QlvtXuLyKTTQuocTeBieuDoXeImpl.class,
						qlvtXuLyKTTQuocTeBieuDoXe.getPrimaryKey()) == null) {
				cacheResult(qlvtXuLyKTTQuocTeBieuDoXe);
			}
			else {
				qlvtXuLyKTTQuocTeBieuDoXe.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qlvt xu ly k t t quoc te bieu do xes.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QlvtXuLyKTTQuocTeBieuDoXeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QlvtXuLyKTTQuocTeBieuDoXeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qlvt xu ly k t t quoc te bieu do xe.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QlvtXuLyKTTQuocTeBieuDoXe qlvtXuLyKTTQuocTeBieuDoXe) {
		EntityCacheUtil.removeResult(QlvtXuLyKTTQuocTeBieuDoXeModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyKTTQuocTeBieuDoXeImpl.class,
			qlvtXuLyKTTQuocTeBieuDoXe.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<QlvtXuLyKTTQuocTeBieuDoXe> qlvtXuLyKTTQuocTeBieuDoXes) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QlvtXuLyKTTQuocTeBieuDoXe qlvtXuLyKTTQuocTeBieuDoXe : qlvtXuLyKTTQuocTeBieuDoXes) {
			EntityCacheUtil.removeResult(QlvtXuLyKTTQuocTeBieuDoXeModelImpl.ENTITY_CACHE_ENABLED,
				QlvtXuLyKTTQuocTeBieuDoXeImpl.class,
				qlvtXuLyKTTQuocTeBieuDoXe.getPrimaryKey());
		}
	}

	/**
	 * Creates a new qlvt xu ly k t t quoc te bieu do xe with the primary key. Does not add the qlvt xu ly k t t quoc te bieu do xe to the database.
	 *
	 * @param id the primary key for the new qlvt xu ly k t t quoc te bieu do xe
	 * @return the new qlvt xu ly k t t quoc te bieu do xe
	 */
	@Override
	public QlvtXuLyKTTQuocTeBieuDoXe create(long id) {
		QlvtXuLyKTTQuocTeBieuDoXe qlvtXuLyKTTQuocTeBieuDoXe = new QlvtXuLyKTTQuocTeBieuDoXeImpl();

		qlvtXuLyKTTQuocTeBieuDoXe.setNew(true);
		qlvtXuLyKTTQuocTeBieuDoXe.setPrimaryKey(id);

		return qlvtXuLyKTTQuocTeBieuDoXe;
	}

	/**
	 * Removes the qlvt xu ly k t t quoc te bieu do xe with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the qlvt xu ly k t t quoc te bieu do xe
	 * @return the qlvt xu ly k t t quoc te bieu do xe that was removed
	 * @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeBieuDoXeException if a qlvt xu ly k t t quoc te bieu do xe with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyKTTQuocTeBieuDoXe remove(long id)
		throws NoSuchQlvtXuLyKTTQuocTeBieuDoXeException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the qlvt xu ly k t t quoc te bieu do xe with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qlvt xu ly k t t quoc te bieu do xe
	 * @return the qlvt xu ly k t t quoc te bieu do xe that was removed
	 * @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeBieuDoXeException if a qlvt xu ly k t t quoc te bieu do xe with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyKTTQuocTeBieuDoXe remove(Serializable primaryKey)
		throws NoSuchQlvtXuLyKTTQuocTeBieuDoXeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QlvtXuLyKTTQuocTeBieuDoXe qlvtXuLyKTTQuocTeBieuDoXe = (QlvtXuLyKTTQuocTeBieuDoXe)session.get(QlvtXuLyKTTQuocTeBieuDoXeImpl.class,
					primaryKey);

			if (qlvtXuLyKTTQuocTeBieuDoXe == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQlvtXuLyKTTQuocTeBieuDoXeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtXuLyKTTQuocTeBieuDoXe);
		}
		catch (NoSuchQlvtXuLyKTTQuocTeBieuDoXeException nsee) {
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
	protected QlvtXuLyKTTQuocTeBieuDoXe removeImpl(
		QlvtXuLyKTTQuocTeBieuDoXe qlvtXuLyKTTQuocTeBieuDoXe)
		throws SystemException {
		qlvtXuLyKTTQuocTeBieuDoXe = toUnwrappedModel(qlvtXuLyKTTQuocTeBieuDoXe);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtXuLyKTTQuocTeBieuDoXe)) {
				qlvtXuLyKTTQuocTeBieuDoXe = (QlvtXuLyKTTQuocTeBieuDoXe)session.get(QlvtXuLyKTTQuocTeBieuDoXeImpl.class,
						qlvtXuLyKTTQuocTeBieuDoXe.getPrimaryKeyObj());
			}

			if (qlvtXuLyKTTQuocTeBieuDoXe != null) {
				session.delete(qlvtXuLyKTTQuocTeBieuDoXe);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtXuLyKTTQuocTeBieuDoXe != null) {
			clearCache(qlvtXuLyKTTQuocTeBieuDoXe);
		}

		return qlvtXuLyKTTQuocTeBieuDoXe;
	}

	@Override
	public QlvtXuLyKTTQuocTeBieuDoXe updateImpl(
		vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXe qlvtXuLyKTTQuocTeBieuDoXe)
		throws SystemException {
		qlvtXuLyKTTQuocTeBieuDoXe = toUnwrappedModel(qlvtXuLyKTTQuocTeBieuDoXe);

		boolean isNew = qlvtXuLyKTTQuocTeBieuDoXe.isNew();

		Session session = null;

		try {
			session = openSession();

			if (qlvtXuLyKTTQuocTeBieuDoXe.isNew()) {
				session.save(qlvtXuLyKTTQuocTeBieuDoXe);

				qlvtXuLyKTTQuocTeBieuDoXe.setNew(false);
			}
			else {
				session.merge(qlvtXuLyKTTQuocTeBieuDoXe);
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

		EntityCacheUtil.putResult(QlvtXuLyKTTQuocTeBieuDoXeModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyKTTQuocTeBieuDoXeImpl.class,
			qlvtXuLyKTTQuocTeBieuDoXe.getPrimaryKey(), qlvtXuLyKTTQuocTeBieuDoXe);

		return qlvtXuLyKTTQuocTeBieuDoXe;
	}

	protected QlvtXuLyKTTQuocTeBieuDoXe toUnwrappedModel(
		QlvtXuLyKTTQuocTeBieuDoXe qlvtXuLyKTTQuocTeBieuDoXe) {
		if (qlvtXuLyKTTQuocTeBieuDoXe instanceof QlvtXuLyKTTQuocTeBieuDoXeImpl) {
			return qlvtXuLyKTTQuocTeBieuDoXe;
		}

		QlvtXuLyKTTQuocTeBieuDoXeImpl qlvtXuLyKTTQuocTeBieuDoXeImpl = new QlvtXuLyKTTQuocTeBieuDoXeImpl();

		qlvtXuLyKTTQuocTeBieuDoXeImpl.setNew(qlvtXuLyKTTQuocTeBieuDoXe.isNew());
		qlvtXuLyKTTQuocTeBieuDoXeImpl.setPrimaryKey(qlvtXuLyKTTQuocTeBieuDoXe.getPrimaryKey());

		qlvtXuLyKTTQuocTeBieuDoXeImpl.setId(qlvtXuLyKTTQuocTeBieuDoXe.getId());
		qlvtXuLyKTTQuocTeBieuDoXeImpl.setKttQuocTeId(qlvtXuLyKTTQuocTeBieuDoXe.getKttQuocTeId());
		qlvtXuLyKTTQuocTeBieuDoXeImpl.setLoaiLuot(qlvtXuLyKTTQuocTeBieuDoXe.getLoaiLuot());
		qlvtXuLyKTTQuocTeBieuDoXeImpl.setSoThuTuLuot(qlvtXuLyKTTQuocTeBieuDoXe.getSoThuTuLuot());
		qlvtXuLyKTTQuocTeBieuDoXeImpl.setMaBen(qlvtXuLyKTTQuocTeBieuDoXe.getMaBen());
		qlvtXuLyKTTQuocTeBieuDoXeImpl.setGioXuatBen(qlvtXuLyKTTQuocTeBieuDoXe.getGioXuatBen());
		qlvtXuLyKTTQuocTeBieuDoXeImpl.setPhuXuatBen(qlvtXuLyKTTQuocTeBieuDoXe.getPhuXuatBen());
		qlvtXuLyKTTQuocTeBieuDoXeImpl.setTanXuat(qlvtXuLyKTTQuocTeBieuDoXe.getTanXuat());

		return qlvtXuLyKTTQuocTeBieuDoXeImpl;
	}

	/**
	 * Returns the qlvt xu ly k t t quoc te bieu do xe with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt xu ly k t t quoc te bieu do xe
	 * @return the qlvt xu ly k t t quoc te bieu do xe
	 * @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeBieuDoXeException if a qlvt xu ly k t t quoc te bieu do xe with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyKTTQuocTeBieuDoXe findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQlvtXuLyKTTQuocTeBieuDoXeException, SystemException {
		QlvtXuLyKTTQuocTeBieuDoXe qlvtXuLyKTTQuocTeBieuDoXe = fetchByPrimaryKey(primaryKey);

		if (qlvtXuLyKTTQuocTeBieuDoXe == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQlvtXuLyKTTQuocTeBieuDoXeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtXuLyKTTQuocTeBieuDoXe;
	}

	/**
	 * Returns the qlvt xu ly k t t quoc te bieu do xe with the primary key or throws a {@link vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeBieuDoXeException} if it could not be found.
	 *
	 * @param id the primary key of the qlvt xu ly k t t quoc te bieu do xe
	 * @return the qlvt xu ly k t t quoc te bieu do xe
	 * @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeBieuDoXeException if a qlvt xu ly k t t quoc te bieu do xe with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyKTTQuocTeBieuDoXe findByPrimaryKey(long id)
		throws NoSuchQlvtXuLyKTTQuocTeBieuDoXeException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the qlvt xu ly k t t quoc te bieu do xe with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt xu ly k t t quoc te bieu do xe
	 * @return the qlvt xu ly k t t quoc te bieu do xe, or <code>null</code> if a qlvt xu ly k t t quoc te bieu do xe with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyKTTQuocTeBieuDoXe fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QlvtXuLyKTTQuocTeBieuDoXe qlvtXuLyKTTQuocTeBieuDoXe = (QlvtXuLyKTTQuocTeBieuDoXe)EntityCacheUtil.getResult(QlvtXuLyKTTQuocTeBieuDoXeModelImpl.ENTITY_CACHE_ENABLED,
				QlvtXuLyKTTQuocTeBieuDoXeImpl.class, primaryKey);

		if (qlvtXuLyKTTQuocTeBieuDoXe == _nullQlvtXuLyKTTQuocTeBieuDoXe) {
			return null;
		}

		if (qlvtXuLyKTTQuocTeBieuDoXe == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtXuLyKTTQuocTeBieuDoXe = (QlvtXuLyKTTQuocTeBieuDoXe)session.get(QlvtXuLyKTTQuocTeBieuDoXeImpl.class,
						primaryKey);

				if (qlvtXuLyKTTQuocTeBieuDoXe != null) {
					cacheResult(qlvtXuLyKTTQuocTeBieuDoXe);
				}
				else {
					EntityCacheUtil.putResult(QlvtXuLyKTTQuocTeBieuDoXeModelImpl.ENTITY_CACHE_ENABLED,
						QlvtXuLyKTTQuocTeBieuDoXeImpl.class, primaryKey,
						_nullQlvtXuLyKTTQuocTeBieuDoXe);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QlvtXuLyKTTQuocTeBieuDoXeModelImpl.ENTITY_CACHE_ENABLED,
					QlvtXuLyKTTQuocTeBieuDoXeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtXuLyKTTQuocTeBieuDoXe;
	}

	/**
	 * Returns the qlvt xu ly k t t quoc te bieu do xe with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the qlvt xu ly k t t quoc te bieu do xe
	 * @return the qlvt xu ly k t t quoc te bieu do xe, or <code>null</code> if a qlvt xu ly k t t quoc te bieu do xe with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyKTTQuocTeBieuDoXe fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the qlvt xu ly k t t quoc te bieu do xes.
	 *
	 * @return the qlvt xu ly k t t quoc te bieu do xes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyKTTQuocTeBieuDoXe> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt xu ly k t t quoc te bieu do xes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTeBieuDoXeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt xu ly k t t quoc te bieu do xes
	 * @param end the upper bound of the range of qlvt xu ly k t t quoc te bieu do xes (not inclusive)
	 * @return the range of qlvt xu ly k t t quoc te bieu do xes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyKTTQuocTeBieuDoXe> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt xu ly k t t quoc te bieu do xes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTeBieuDoXeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt xu ly k t t quoc te bieu do xes
	 * @param end the upper bound of the range of qlvt xu ly k t t quoc te bieu do xes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qlvt xu ly k t t quoc te bieu do xes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyKTTQuocTeBieuDoXe> findAll(int start, int end,
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

		List<QlvtXuLyKTTQuocTeBieuDoXe> list = (List<QlvtXuLyKTTQuocTeBieuDoXe>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTXULYKTTQUOCTEBIEUDOXE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTXULYKTTQUOCTEBIEUDOXE;

				if (pagination) {
					sql = sql.concat(QlvtXuLyKTTQuocTeBieuDoXeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QlvtXuLyKTTQuocTeBieuDoXe>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtXuLyKTTQuocTeBieuDoXe>(list);
				}
				else {
					list = (List<QlvtXuLyKTTQuocTeBieuDoXe>)QueryUtil.list(q,
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
	 * Removes all the qlvt xu ly k t t quoc te bieu do xes from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QlvtXuLyKTTQuocTeBieuDoXe qlvtXuLyKTTQuocTeBieuDoXe : findAll()) {
			remove(qlvtXuLyKTTQuocTeBieuDoXe);
		}
	}

	/**
	 * Returns the number of qlvt xu ly k t t quoc te bieu do xes.
	 *
	 * @return the number of qlvt xu ly k t t quoc te bieu do xes
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

				Query q = session.createQuery(_SQL_COUNT_QLVTXULYKTTQUOCTEBIEUDOXE);

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
	 * Initializes the qlvt xu ly k t t quoc te bieu do xe persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXe")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QlvtXuLyKTTQuocTeBieuDoXe>> listenersList = new ArrayList<ModelListener<QlvtXuLyKTTQuocTeBieuDoXe>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QlvtXuLyKTTQuocTeBieuDoXe>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QlvtXuLyKTTQuocTeBieuDoXeImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTXULYKTTQUOCTEBIEUDOXE = "SELECT qlvtXuLyKTTQuocTeBieuDoXe FROM QlvtXuLyKTTQuocTeBieuDoXe qlvtXuLyKTTQuocTeBieuDoXe";
	private static final String _SQL_COUNT_QLVTXULYKTTQUOCTEBIEUDOXE = "SELECT COUNT(qlvtXuLyKTTQuocTeBieuDoXe) FROM QlvtXuLyKTTQuocTeBieuDoXe qlvtXuLyKTTQuocTeBieuDoXe";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtXuLyKTTQuocTeBieuDoXe.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QlvtXuLyKTTQuocTeBieuDoXe exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QlvtXuLyKTTQuocTeBieuDoXePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "kttQuocTeId", "loaiLuot", "soThuTuLuot", "maBen",
				"gioXuatBen", "phuXuatBen", "tanXuat"
			});
	private static QlvtXuLyKTTQuocTeBieuDoXe _nullQlvtXuLyKTTQuocTeBieuDoXe = new QlvtXuLyKTTQuocTeBieuDoXeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QlvtXuLyKTTQuocTeBieuDoXe> toCacheModel() {
				return _nullQlvtXuLyKTTQuocTeBieuDoXeCacheModel;
			}
		};

	private static CacheModel<QlvtXuLyKTTQuocTeBieuDoXe> _nullQlvtXuLyKTTQuocTeBieuDoXeCacheModel =
		new CacheModel<QlvtXuLyKTTQuocTeBieuDoXe>() {
			@Override
			public QlvtXuLyKTTQuocTeBieuDoXe toEntityModel() {
				return _nullQlvtXuLyKTTQuocTeBieuDoXe;
			}
		};
}