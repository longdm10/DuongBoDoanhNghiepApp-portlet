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

import vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepGpkdvtDuongboQuocTeException;
import vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpkdvtDuongboQuocTe;
import vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGpkdvtDuongboQuocTeImpl;
import vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGpkdvtDuongboQuocTeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the qlvt cap phep gpkdvt duongbo quoc te service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanNc
 * @see QlvtCapPhepGpkdvtDuongboQuocTePersistence
 * @see QlvtCapPhepGpkdvtDuongboQuocTeUtil
 * @generated
 */
public class QlvtCapPhepGpkdvtDuongboQuocTePersistenceImpl
	extends BasePersistenceImpl<QlvtCapPhepGpkdvtDuongboQuocTe>
	implements QlvtCapPhepGpkdvtDuongboQuocTePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QlvtCapPhepGpkdvtDuongboQuocTeUtil} to access the qlvt cap phep gpkdvt duongbo quoc te persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QlvtCapPhepGpkdvtDuongboQuocTeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QlvtCapPhepGpkdvtDuongboQuocTeModelImpl.ENTITY_CACHE_ENABLED,
			QlvtCapPhepGpkdvtDuongboQuocTeModelImpl.FINDER_CACHE_ENABLED,
			QlvtCapPhepGpkdvtDuongboQuocTeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QlvtCapPhepGpkdvtDuongboQuocTeModelImpl.ENTITY_CACHE_ENABLED,
			QlvtCapPhepGpkdvtDuongboQuocTeModelImpl.FINDER_CACHE_ENABLED,
			QlvtCapPhepGpkdvtDuongboQuocTeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QlvtCapPhepGpkdvtDuongboQuocTeModelImpl.ENTITY_CACHE_ENABLED,
			QlvtCapPhepGpkdvtDuongboQuocTeModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public QlvtCapPhepGpkdvtDuongboQuocTePersistenceImpl() {
		setModelClass(QlvtCapPhepGpkdvtDuongboQuocTe.class);
	}

	/**
	 * Caches the qlvt cap phep gpkdvt duongbo quoc te in the entity cache if it is enabled.
	 *
	 * @param qlvtCapPhepGpkdvtDuongboQuocTe the qlvt cap phep gpkdvt duongbo quoc te
	 */
	@Override
	public void cacheResult(
		QlvtCapPhepGpkdvtDuongboQuocTe qlvtCapPhepGpkdvtDuongboQuocTe) {
		EntityCacheUtil.putResult(QlvtCapPhepGpkdvtDuongboQuocTeModelImpl.ENTITY_CACHE_ENABLED,
			QlvtCapPhepGpkdvtDuongboQuocTeImpl.class,
			qlvtCapPhepGpkdvtDuongboQuocTe.getPrimaryKey(),
			qlvtCapPhepGpkdvtDuongboQuocTe);

		qlvtCapPhepGpkdvtDuongboQuocTe.resetOriginalValues();
	}

	/**
	 * Caches the qlvt cap phep gpkdvt duongbo quoc tes in the entity cache if it is enabled.
	 *
	 * @param qlvtCapPhepGpkdvtDuongboQuocTes the qlvt cap phep gpkdvt duongbo quoc tes
	 */
	@Override
	public void cacheResult(
		List<QlvtCapPhepGpkdvtDuongboQuocTe> qlvtCapPhepGpkdvtDuongboQuocTes) {
		for (QlvtCapPhepGpkdvtDuongboQuocTe qlvtCapPhepGpkdvtDuongboQuocTe : qlvtCapPhepGpkdvtDuongboQuocTes) {
			if (EntityCacheUtil.getResult(
						QlvtCapPhepGpkdvtDuongboQuocTeModelImpl.ENTITY_CACHE_ENABLED,
						QlvtCapPhepGpkdvtDuongboQuocTeImpl.class,
						qlvtCapPhepGpkdvtDuongboQuocTe.getPrimaryKey()) == null) {
				cacheResult(qlvtCapPhepGpkdvtDuongboQuocTe);
			}
			else {
				qlvtCapPhepGpkdvtDuongboQuocTe.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qlvt cap phep gpkdvt duongbo quoc tes.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QlvtCapPhepGpkdvtDuongboQuocTeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QlvtCapPhepGpkdvtDuongboQuocTeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qlvt cap phep gpkdvt duongbo quoc te.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		QlvtCapPhepGpkdvtDuongboQuocTe qlvtCapPhepGpkdvtDuongboQuocTe) {
		EntityCacheUtil.removeResult(QlvtCapPhepGpkdvtDuongboQuocTeModelImpl.ENTITY_CACHE_ENABLED,
			QlvtCapPhepGpkdvtDuongboQuocTeImpl.class,
			qlvtCapPhepGpkdvtDuongboQuocTe.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<QlvtCapPhepGpkdvtDuongboQuocTe> qlvtCapPhepGpkdvtDuongboQuocTes) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QlvtCapPhepGpkdvtDuongboQuocTe qlvtCapPhepGpkdvtDuongboQuocTe : qlvtCapPhepGpkdvtDuongboQuocTes) {
			EntityCacheUtil.removeResult(QlvtCapPhepGpkdvtDuongboQuocTeModelImpl.ENTITY_CACHE_ENABLED,
				QlvtCapPhepGpkdvtDuongboQuocTeImpl.class,
				qlvtCapPhepGpkdvtDuongboQuocTe.getPrimaryKey());
		}
	}

	/**
	 * Creates a new qlvt cap phep gpkdvt duongbo quoc te with the primary key. Does not add the qlvt cap phep gpkdvt duongbo quoc te to the database.
	 *
	 * @param id the primary key for the new qlvt cap phep gpkdvt duongbo quoc te
	 * @return the new qlvt cap phep gpkdvt duongbo quoc te
	 */
	@Override
	public QlvtCapPhepGpkdvtDuongboQuocTe create(long id) {
		QlvtCapPhepGpkdvtDuongboQuocTe qlvtCapPhepGpkdvtDuongboQuocTe = new QlvtCapPhepGpkdvtDuongboQuocTeImpl();

		qlvtCapPhepGpkdvtDuongboQuocTe.setNew(true);
		qlvtCapPhepGpkdvtDuongboQuocTe.setPrimaryKey(id);

		return qlvtCapPhepGpkdvtDuongboQuocTe;
	}

	/**
	 * Removes the qlvt cap phep gpkdvt duongbo quoc te with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the qlvt cap phep gpkdvt duongbo quoc te
	 * @return the qlvt cap phep gpkdvt duongbo quoc te that was removed
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepGpkdvtDuongboQuocTeException if a qlvt cap phep gpkdvt duongbo quoc te with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtCapPhepGpkdvtDuongboQuocTe remove(long id)
		throws NoSuchQlvtCapPhepGpkdvtDuongboQuocTeException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the qlvt cap phep gpkdvt duongbo quoc te with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qlvt cap phep gpkdvt duongbo quoc te
	 * @return the qlvt cap phep gpkdvt duongbo quoc te that was removed
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepGpkdvtDuongboQuocTeException if a qlvt cap phep gpkdvt duongbo quoc te with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtCapPhepGpkdvtDuongboQuocTe remove(Serializable primaryKey)
		throws NoSuchQlvtCapPhepGpkdvtDuongboQuocTeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QlvtCapPhepGpkdvtDuongboQuocTe qlvtCapPhepGpkdvtDuongboQuocTe = (QlvtCapPhepGpkdvtDuongboQuocTe)session.get(QlvtCapPhepGpkdvtDuongboQuocTeImpl.class,
					primaryKey);

			if (qlvtCapPhepGpkdvtDuongboQuocTe == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQlvtCapPhepGpkdvtDuongboQuocTeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtCapPhepGpkdvtDuongboQuocTe);
		}
		catch (NoSuchQlvtCapPhepGpkdvtDuongboQuocTeException nsee) {
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
	protected QlvtCapPhepGpkdvtDuongboQuocTe removeImpl(
		QlvtCapPhepGpkdvtDuongboQuocTe qlvtCapPhepGpkdvtDuongboQuocTe)
		throws SystemException {
		qlvtCapPhepGpkdvtDuongboQuocTe = toUnwrappedModel(qlvtCapPhepGpkdvtDuongboQuocTe);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtCapPhepGpkdvtDuongboQuocTe)) {
				qlvtCapPhepGpkdvtDuongboQuocTe = (QlvtCapPhepGpkdvtDuongboQuocTe)session.get(QlvtCapPhepGpkdvtDuongboQuocTeImpl.class,
						qlvtCapPhepGpkdvtDuongboQuocTe.getPrimaryKeyObj());
			}

			if (qlvtCapPhepGpkdvtDuongboQuocTe != null) {
				session.delete(qlvtCapPhepGpkdvtDuongboQuocTe);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtCapPhepGpkdvtDuongboQuocTe != null) {
			clearCache(qlvtCapPhepGpkdvtDuongboQuocTe);
		}

		return qlvtCapPhepGpkdvtDuongboQuocTe;
	}

	@Override
	public QlvtCapPhepGpkdvtDuongboQuocTe updateImpl(
		vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpkdvtDuongboQuocTe qlvtCapPhepGpkdvtDuongboQuocTe)
		throws SystemException {
		qlvtCapPhepGpkdvtDuongboQuocTe = toUnwrappedModel(qlvtCapPhepGpkdvtDuongboQuocTe);

		boolean isNew = qlvtCapPhepGpkdvtDuongboQuocTe.isNew();

		Session session = null;

		try {
			session = openSession();

			if (qlvtCapPhepGpkdvtDuongboQuocTe.isNew()) {
				session.save(qlvtCapPhepGpkdvtDuongboQuocTe);

				qlvtCapPhepGpkdvtDuongboQuocTe.setNew(false);
			}
			else {
				session.merge(qlvtCapPhepGpkdvtDuongboQuocTe);
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

		EntityCacheUtil.putResult(QlvtCapPhepGpkdvtDuongboQuocTeModelImpl.ENTITY_CACHE_ENABLED,
			QlvtCapPhepGpkdvtDuongboQuocTeImpl.class,
			qlvtCapPhepGpkdvtDuongboQuocTe.getPrimaryKey(),
			qlvtCapPhepGpkdvtDuongboQuocTe);

		return qlvtCapPhepGpkdvtDuongboQuocTe;
	}

	protected QlvtCapPhepGpkdvtDuongboQuocTe toUnwrappedModel(
		QlvtCapPhepGpkdvtDuongboQuocTe qlvtCapPhepGpkdvtDuongboQuocTe) {
		if (qlvtCapPhepGpkdvtDuongboQuocTe instanceof QlvtCapPhepGpkdvtDuongboQuocTeImpl) {
			return qlvtCapPhepGpkdvtDuongboQuocTe;
		}

		QlvtCapPhepGpkdvtDuongboQuocTeImpl qlvtCapPhepGpkdvtDuongboQuocTeImpl = new QlvtCapPhepGpkdvtDuongboQuocTeImpl();

		qlvtCapPhepGpkdvtDuongboQuocTeImpl.setNew(qlvtCapPhepGpkdvtDuongboQuocTe.isNew());
		qlvtCapPhepGpkdvtDuongboQuocTeImpl.setPrimaryKey(qlvtCapPhepGpkdvtDuongboQuocTe.getPrimaryKey());

		qlvtCapPhepGpkdvtDuongboQuocTeImpl.setId(qlvtCapPhepGpkdvtDuongboQuocTe.getId());
		qlvtCapPhepGpkdvtDuongboQuocTeImpl.setGpKinhDoanhVanTaiOtoId(qlvtCapPhepGpkdvtDuongboQuocTe.getGpKinhDoanhVanTaiOtoId());
		qlvtCapPhepGpkdvtDuongboQuocTeImpl.setSoGpvtQuocTe(qlvtCapPhepGpkdvtDuongboQuocTe.getSoGpvtQuocTe());
		qlvtCapPhepGpkdvtDuongboQuocTeImpl.setCoQuanCapLanDauId(qlvtCapPhepGpkdvtDuongboQuocTe.getCoQuanCapLanDauId());
		qlvtCapPhepGpkdvtDuongboQuocTeImpl.setNgayCapGpvt(qlvtCapPhepGpkdvtDuongboQuocTe.getNgayCapGpvt());
		qlvtCapPhepGpkdvtDuongboQuocTeImpl.setCoQuanCapGpvtId(qlvtCapPhepGpkdvtDuongboQuocTe.getCoQuanCapGpvtId());
		qlvtCapPhepGpkdvtDuongboQuocTeImpl.setNgayGiaHan(qlvtCapPhepGpkdvtDuongboQuocTe.getNgayGiaHan());
		qlvtCapPhepGpkdvtDuongboQuocTeImpl.setNgayHetHan(qlvtCapPhepGpkdvtDuongboQuocTe.getNgayHetHan());
		qlvtCapPhepGpkdvtDuongboQuocTeImpl.setLanGiaHan(qlvtCapPhepGpkdvtDuongboQuocTe.getLanGiaHan());
		qlvtCapPhepGpkdvtDuongboQuocTeImpl.setFileId(qlvtCapPhepGpkdvtDuongboQuocTe.getFileId());
		qlvtCapPhepGpkdvtDuongboQuocTeImpl.setTrangThai(qlvtCapPhepGpkdvtDuongboQuocTe.getTrangThai());

		return qlvtCapPhepGpkdvtDuongboQuocTeImpl;
	}

	/**
	 * Returns the qlvt cap phep gpkdvt duongbo quoc te with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt cap phep gpkdvt duongbo quoc te
	 * @return the qlvt cap phep gpkdvt duongbo quoc te
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepGpkdvtDuongboQuocTeException if a qlvt cap phep gpkdvt duongbo quoc te with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtCapPhepGpkdvtDuongboQuocTe findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchQlvtCapPhepGpkdvtDuongboQuocTeException, SystemException {
		QlvtCapPhepGpkdvtDuongboQuocTe qlvtCapPhepGpkdvtDuongboQuocTe = fetchByPrimaryKey(primaryKey);

		if (qlvtCapPhepGpkdvtDuongboQuocTe == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQlvtCapPhepGpkdvtDuongboQuocTeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtCapPhepGpkdvtDuongboQuocTe;
	}

	/**
	 * Returns the qlvt cap phep gpkdvt duongbo quoc te with the primary key or throws a {@link vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepGpkdvtDuongboQuocTeException} if it could not be found.
	 *
	 * @param id the primary key of the qlvt cap phep gpkdvt duongbo quoc te
	 * @return the qlvt cap phep gpkdvt duongbo quoc te
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepGpkdvtDuongboQuocTeException if a qlvt cap phep gpkdvt duongbo quoc te with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtCapPhepGpkdvtDuongboQuocTe findByPrimaryKey(long id)
		throws NoSuchQlvtCapPhepGpkdvtDuongboQuocTeException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the qlvt cap phep gpkdvt duongbo quoc te with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt cap phep gpkdvt duongbo quoc te
	 * @return the qlvt cap phep gpkdvt duongbo quoc te, or <code>null</code> if a qlvt cap phep gpkdvt duongbo quoc te with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtCapPhepGpkdvtDuongboQuocTe fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		QlvtCapPhepGpkdvtDuongboQuocTe qlvtCapPhepGpkdvtDuongboQuocTe = (QlvtCapPhepGpkdvtDuongboQuocTe)EntityCacheUtil.getResult(QlvtCapPhepGpkdvtDuongboQuocTeModelImpl.ENTITY_CACHE_ENABLED,
				QlvtCapPhepGpkdvtDuongboQuocTeImpl.class, primaryKey);

		if (qlvtCapPhepGpkdvtDuongboQuocTe == _nullQlvtCapPhepGpkdvtDuongboQuocTe) {
			return null;
		}

		if (qlvtCapPhepGpkdvtDuongboQuocTe == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtCapPhepGpkdvtDuongboQuocTe = (QlvtCapPhepGpkdvtDuongboQuocTe)session.get(QlvtCapPhepGpkdvtDuongboQuocTeImpl.class,
						primaryKey);

				if (qlvtCapPhepGpkdvtDuongboQuocTe != null) {
					cacheResult(qlvtCapPhepGpkdvtDuongboQuocTe);
				}
				else {
					EntityCacheUtil.putResult(QlvtCapPhepGpkdvtDuongboQuocTeModelImpl.ENTITY_CACHE_ENABLED,
						QlvtCapPhepGpkdvtDuongboQuocTeImpl.class, primaryKey,
						_nullQlvtCapPhepGpkdvtDuongboQuocTe);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QlvtCapPhepGpkdvtDuongboQuocTeModelImpl.ENTITY_CACHE_ENABLED,
					QlvtCapPhepGpkdvtDuongboQuocTeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtCapPhepGpkdvtDuongboQuocTe;
	}

	/**
	 * Returns the qlvt cap phep gpkdvt duongbo quoc te with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the qlvt cap phep gpkdvt duongbo quoc te
	 * @return the qlvt cap phep gpkdvt duongbo quoc te, or <code>null</code> if a qlvt cap phep gpkdvt duongbo quoc te with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtCapPhepGpkdvtDuongboQuocTe fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the qlvt cap phep gpkdvt duongbo quoc tes.
	 *
	 * @return the qlvt cap phep gpkdvt duongbo quoc tes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtCapPhepGpkdvtDuongboQuocTe> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt cap phep gpkdvt duongbo quoc tes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGpkdvtDuongboQuocTeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt cap phep gpkdvt duongbo quoc tes
	 * @param end the upper bound of the range of qlvt cap phep gpkdvt duongbo quoc tes (not inclusive)
	 * @return the range of qlvt cap phep gpkdvt duongbo quoc tes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtCapPhepGpkdvtDuongboQuocTe> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt cap phep gpkdvt duongbo quoc tes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGpkdvtDuongboQuocTeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt cap phep gpkdvt duongbo quoc tes
	 * @param end the upper bound of the range of qlvt cap phep gpkdvt duongbo quoc tes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qlvt cap phep gpkdvt duongbo quoc tes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtCapPhepGpkdvtDuongboQuocTe> findAll(int start, int end,
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

		List<QlvtCapPhepGpkdvtDuongboQuocTe> list = (List<QlvtCapPhepGpkdvtDuongboQuocTe>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTCAPPHEPGPKDVTDUONGBOQUOCTE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTCAPPHEPGPKDVTDUONGBOQUOCTE;

				if (pagination) {
					sql = sql.concat(QlvtCapPhepGpkdvtDuongboQuocTeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QlvtCapPhepGpkdvtDuongboQuocTe>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtCapPhepGpkdvtDuongboQuocTe>(list);
				}
				else {
					list = (List<QlvtCapPhepGpkdvtDuongboQuocTe>)QueryUtil.list(q,
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
	 * Removes all the qlvt cap phep gpkdvt duongbo quoc tes from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QlvtCapPhepGpkdvtDuongboQuocTe qlvtCapPhepGpkdvtDuongboQuocTe : findAll()) {
			remove(qlvtCapPhepGpkdvtDuongboQuocTe);
		}
	}

	/**
	 * Returns the number of qlvt cap phep gpkdvt duongbo quoc tes.
	 *
	 * @return the number of qlvt cap phep gpkdvt duongbo quoc tes
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

				Query q = session.createQuery(_SQL_COUNT_QLVTCAPPHEPGPKDVTDUONGBOQUOCTE);

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
	 * Initializes the qlvt cap phep gpkdvt duongbo quoc te persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpkdvtDuongboQuocTe")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QlvtCapPhepGpkdvtDuongboQuocTe>> listenersList =
					new ArrayList<ModelListener<QlvtCapPhepGpkdvtDuongboQuocTe>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QlvtCapPhepGpkdvtDuongboQuocTe>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QlvtCapPhepGpkdvtDuongboQuocTeImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTCAPPHEPGPKDVTDUONGBOQUOCTE = "SELECT qlvtCapPhepGpkdvtDuongboQuocTe FROM QlvtCapPhepGpkdvtDuongboQuocTe qlvtCapPhepGpkdvtDuongboQuocTe";
	private static final String _SQL_COUNT_QLVTCAPPHEPGPKDVTDUONGBOQUOCTE = "SELECT COUNT(qlvtCapPhepGpkdvtDuongboQuocTe) FROM QlvtCapPhepGpkdvtDuongboQuocTe qlvtCapPhepGpkdvtDuongboQuocTe";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtCapPhepGpkdvtDuongboQuocTe.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QlvtCapPhepGpkdvtDuongboQuocTe exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QlvtCapPhepGpkdvtDuongboQuocTePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "gpKinhDoanhVanTaiOtoId", "soGpvtQuocTe",
				"coQuanCapLanDauId", "ngayCapGpvt", "coQuanCapGpvtId",
				"ngayGiaHan", "ngayHetHan", "lanGiaHan", "fileId", "trangThai"
			});
	private static QlvtCapPhepGpkdvtDuongboQuocTe _nullQlvtCapPhepGpkdvtDuongboQuocTe =
		new QlvtCapPhepGpkdvtDuongboQuocTeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QlvtCapPhepGpkdvtDuongboQuocTe> toCacheModel() {
				return _nullQlvtCapPhepGpkdvtDuongboQuocTeCacheModel;
			}
		};

	private static CacheModel<QlvtCapPhepGpkdvtDuongboQuocTe> _nullQlvtCapPhepGpkdvtDuongboQuocTeCacheModel =
		new CacheModel<QlvtCapPhepGpkdvtDuongboQuocTe>() {
			@Override
			public QlvtCapPhepGpkdvtDuongboQuocTe toEntityModel() {
				return _nullQlvtCapPhepGpkdvtDuongboQuocTe;
			}
		};
}