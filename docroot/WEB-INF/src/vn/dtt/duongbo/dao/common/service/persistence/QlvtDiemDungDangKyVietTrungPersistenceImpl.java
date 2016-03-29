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

import vn.dtt.duongbo.dao.common.NoSuchQlvtDiemDungDangKyVietTrungException;
import vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietTrung;
import vn.dtt.duongbo.dao.common.model.impl.QlvtDiemDungDangKyVietTrungImpl;
import vn.dtt.duongbo.dao.common.model.impl.QlvtDiemDungDangKyVietTrungModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the qlvt diem dung dang ky viet trung service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see QlvtDiemDungDangKyVietTrungPersistence
 * @see QlvtDiemDungDangKyVietTrungUtil
 * @generated
 */
public class QlvtDiemDungDangKyVietTrungPersistenceImpl
	extends BasePersistenceImpl<QlvtDiemDungDangKyVietTrung>
	implements QlvtDiemDungDangKyVietTrungPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QlvtDiemDungDangKyVietTrungUtil} to access the qlvt diem dung dang ky viet trung persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QlvtDiemDungDangKyVietTrungImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QlvtDiemDungDangKyVietTrungModelImpl.ENTITY_CACHE_ENABLED,
			QlvtDiemDungDangKyVietTrungModelImpl.FINDER_CACHE_ENABLED,
			QlvtDiemDungDangKyVietTrungImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QlvtDiemDungDangKyVietTrungModelImpl.ENTITY_CACHE_ENABLED,
			QlvtDiemDungDangKyVietTrungModelImpl.FINDER_CACHE_ENABLED,
			QlvtDiemDungDangKyVietTrungImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QlvtDiemDungDangKyVietTrungModelImpl.ENTITY_CACHE_ENABLED,
			QlvtDiemDungDangKyVietTrungModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public QlvtDiemDungDangKyVietTrungPersistenceImpl() {
		setModelClass(QlvtDiemDungDangKyVietTrung.class);
	}

	/**
	 * Caches the qlvt diem dung dang ky viet trung in the entity cache if it is enabled.
	 *
	 * @param qlvtDiemDungDangKyVietTrung the qlvt diem dung dang ky viet trung
	 */
	@Override
	public void cacheResult(
		QlvtDiemDungDangKyVietTrung qlvtDiemDungDangKyVietTrung) {
		EntityCacheUtil.putResult(QlvtDiemDungDangKyVietTrungModelImpl.ENTITY_CACHE_ENABLED,
			QlvtDiemDungDangKyVietTrungImpl.class,
			qlvtDiemDungDangKyVietTrung.getPrimaryKey(),
			qlvtDiemDungDangKyVietTrung);

		qlvtDiemDungDangKyVietTrung.resetOriginalValues();
	}

	/**
	 * Caches the qlvt diem dung dang ky viet trungs in the entity cache if it is enabled.
	 *
	 * @param qlvtDiemDungDangKyVietTrungs the qlvt diem dung dang ky viet trungs
	 */
	@Override
	public void cacheResult(
		List<QlvtDiemDungDangKyVietTrung> qlvtDiemDungDangKyVietTrungs) {
		for (QlvtDiemDungDangKyVietTrung qlvtDiemDungDangKyVietTrung : qlvtDiemDungDangKyVietTrungs) {
			if (EntityCacheUtil.getResult(
						QlvtDiemDungDangKyVietTrungModelImpl.ENTITY_CACHE_ENABLED,
						QlvtDiemDungDangKyVietTrungImpl.class,
						qlvtDiemDungDangKyVietTrung.getPrimaryKey()) == null) {
				cacheResult(qlvtDiemDungDangKyVietTrung);
			}
			else {
				qlvtDiemDungDangKyVietTrung.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qlvt diem dung dang ky viet trungs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QlvtDiemDungDangKyVietTrungImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QlvtDiemDungDangKyVietTrungImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qlvt diem dung dang ky viet trung.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		QlvtDiemDungDangKyVietTrung qlvtDiemDungDangKyVietTrung) {
		EntityCacheUtil.removeResult(QlvtDiemDungDangKyVietTrungModelImpl.ENTITY_CACHE_ENABLED,
			QlvtDiemDungDangKyVietTrungImpl.class,
			qlvtDiemDungDangKyVietTrung.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<QlvtDiemDungDangKyVietTrung> qlvtDiemDungDangKyVietTrungs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QlvtDiemDungDangKyVietTrung qlvtDiemDungDangKyVietTrung : qlvtDiemDungDangKyVietTrungs) {
			EntityCacheUtil.removeResult(QlvtDiemDungDangKyVietTrungModelImpl.ENTITY_CACHE_ENABLED,
				QlvtDiemDungDangKyVietTrungImpl.class,
				qlvtDiemDungDangKyVietTrung.getPrimaryKey());
		}
	}

	/**
	 * Creates a new qlvt diem dung dang ky viet trung with the primary key. Does not add the qlvt diem dung dang ky viet trung to the database.
	 *
	 * @param id the primary key for the new qlvt diem dung dang ky viet trung
	 * @return the new qlvt diem dung dang ky viet trung
	 */
	@Override
	public QlvtDiemDungDangKyVietTrung create(long id) {
		QlvtDiemDungDangKyVietTrung qlvtDiemDungDangKyVietTrung = new QlvtDiemDungDangKyVietTrungImpl();

		qlvtDiemDungDangKyVietTrung.setNew(true);
		qlvtDiemDungDangKyVietTrung.setPrimaryKey(id);

		return qlvtDiemDungDangKyVietTrung;
	}

	/**
	 * Removes the qlvt diem dung dang ky viet trung with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the qlvt diem dung dang ky viet trung
	 * @return the qlvt diem dung dang ky viet trung that was removed
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtDiemDungDangKyVietTrungException if a qlvt diem dung dang ky viet trung with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtDiemDungDangKyVietTrung remove(long id)
		throws NoSuchQlvtDiemDungDangKyVietTrungException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the qlvt diem dung dang ky viet trung with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qlvt diem dung dang ky viet trung
	 * @return the qlvt diem dung dang ky viet trung that was removed
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtDiemDungDangKyVietTrungException if a qlvt diem dung dang ky viet trung with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtDiemDungDangKyVietTrung remove(Serializable primaryKey)
		throws NoSuchQlvtDiemDungDangKyVietTrungException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QlvtDiemDungDangKyVietTrung qlvtDiemDungDangKyVietTrung = (QlvtDiemDungDangKyVietTrung)session.get(QlvtDiemDungDangKyVietTrungImpl.class,
					primaryKey);

			if (qlvtDiemDungDangKyVietTrung == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQlvtDiemDungDangKyVietTrungException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtDiemDungDangKyVietTrung);
		}
		catch (NoSuchQlvtDiemDungDangKyVietTrungException nsee) {
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
	protected QlvtDiemDungDangKyVietTrung removeImpl(
		QlvtDiemDungDangKyVietTrung qlvtDiemDungDangKyVietTrung)
		throws SystemException {
		qlvtDiemDungDangKyVietTrung = toUnwrappedModel(qlvtDiemDungDangKyVietTrung);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtDiemDungDangKyVietTrung)) {
				qlvtDiemDungDangKyVietTrung = (QlvtDiemDungDangKyVietTrung)session.get(QlvtDiemDungDangKyVietTrungImpl.class,
						qlvtDiemDungDangKyVietTrung.getPrimaryKeyObj());
			}

			if (qlvtDiemDungDangKyVietTrung != null) {
				session.delete(qlvtDiemDungDangKyVietTrung);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtDiemDungDangKyVietTrung != null) {
			clearCache(qlvtDiemDungDangKyVietTrung);
		}

		return qlvtDiemDungDangKyVietTrung;
	}

	@Override
	public QlvtDiemDungDangKyVietTrung updateImpl(
		vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietTrung qlvtDiemDungDangKyVietTrung)
		throws SystemException {
		qlvtDiemDungDangKyVietTrung = toUnwrappedModel(qlvtDiemDungDangKyVietTrung);

		boolean isNew = qlvtDiemDungDangKyVietTrung.isNew();

		Session session = null;

		try {
			session = openSession();

			if (qlvtDiemDungDangKyVietTrung.isNew()) {
				session.save(qlvtDiemDungDangKyVietTrung);

				qlvtDiemDungDangKyVietTrung.setNew(false);
			}
			else {
				session.merge(qlvtDiemDungDangKyVietTrung);
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

		EntityCacheUtil.putResult(QlvtDiemDungDangKyVietTrungModelImpl.ENTITY_CACHE_ENABLED,
			QlvtDiemDungDangKyVietTrungImpl.class,
			qlvtDiemDungDangKyVietTrung.getPrimaryKey(),
			qlvtDiemDungDangKyVietTrung);

		return qlvtDiemDungDangKyVietTrung;
	}

	protected QlvtDiemDungDangKyVietTrung toUnwrappedModel(
		QlvtDiemDungDangKyVietTrung qlvtDiemDungDangKyVietTrung) {
		if (qlvtDiemDungDangKyVietTrung instanceof QlvtDiemDungDangKyVietTrungImpl) {
			return qlvtDiemDungDangKyVietTrung;
		}

		QlvtDiemDungDangKyVietTrungImpl qlvtDiemDungDangKyVietTrungImpl = new QlvtDiemDungDangKyVietTrungImpl();

		qlvtDiemDungDangKyVietTrungImpl.setNew(qlvtDiemDungDangKyVietTrung.isNew());
		qlvtDiemDungDangKyVietTrungImpl.setPrimaryKey(qlvtDiemDungDangKyVietTrung.getPrimaryKey());

		qlvtDiemDungDangKyVietTrungImpl.setId(qlvtDiemDungDangKyVietTrung.getId());
		qlvtDiemDungDangKyVietTrungImpl.setPhuongTienDangKyId(qlvtDiemDungDangKyVietTrung.getPhuongTienDangKyId());
		qlvtDiemDungDangKyVietTrungImpl.setNoiDungHoSoId(qlvtDiemDungDangKyVietTrung.getNoiDungHoSoId());
		qlvtDiemDungDangKyVietTrungImpl.setHoSoThuTucId(qlvtDiemDungDangKyVietTrung.getHoSoThuTucId());
		qlvtDiemDungDangKyVietTrungImpl.setMaDiemDung(qlvtDiemDungDangKyVietTrung.getMaDiemDung());
		qlvtDiemDungDangKyVietTrungImpl.setTenDiemDung(qlvtDiemDungDangKyVietTrung.getTenDiemDung());

		return qlvtDiemDungDangKyVietTrungImpl;
	}

	/**
	 * Returns the qlvt diem dung dang ky viet trung with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt diem dung dang ky viet trung
	 * @return the qlvt diem dung dang ky viet trung
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtDiemDungDangKyVietTrungException if a qlvt diem dung dang ky viet trung with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtDiemDungDangKyVietTrung findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQlvtDiemDungDangKyVietTrungException, SystemException {
		QlvtDiemDungDangKyVietTrung qlvtDiemDungDangKyVietTrung = fetchByPrimaryKey(primaryKey);

		if (qlvtDiemDungDangKyVietTrung == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQlvtDiemDungDangKyVietTrungException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtDiemDungDangKyVietTrung;
	}

	/**
	 * Returns the qlvt diem dung dang ky viet trung with the primary key or throws a {@link vn.dtt.duongbo.dao.common.NoSuchQlvtDiemDungDangKyVietTrungException} if it could not be found.
	 *
	 * @param id the primary key of the qlvt diem dung dang ky viet trung
	 * @return the qlvt diem dung dang ky viet trung
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtDiemDungDangKyVietTrungException if a qlvt diem dung dang ky viet trung with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtDiemDungDangKyVietTrung findByPrimaryKey(long id)
		throws NoSuchQlvtDiemDungDangKyVietTrungException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the qlvt diem dung dang ky viet trung with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt diem dung dang ky viet trung
	 * @return the qlvt diem dung dang ky viet trung, or <code>null</code> if a qlvt diem dung dang ky viet trung with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtDiemDungDangKyVietTrung fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		QlvtDiemDungDangKyVietTrung qlvtDiemDungDangKyVietTrung = (QlvtDiemDungDangKyVietTrung)EntityCacheUtil.getResult(QlvtDiemDungDangKyVietTrungModelImpl.ENTITY_CACHE_ENABLED,
				QlvtDiemDungDangKyVietTrungImpl.class, primaryKey);

		if (qlvtDiemDungDangKyVietTrung == _nullQlvtDiemDungDangKyVietTrung) {
			return null;
		}

		if (qlvtDiemDungDangKyVietTrung == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtDiemDungDangKyVietTrung = (QlvtDiemDungDangKyVietTrung)session.get(QlvtDiemDungDangKyVietTrungImpl.class,
						primaryKey);

				if (qlvtDiemDungDangKyVietTrung != null) {
					cacheResult(qlvtDiemDungDangKyVietTrung);
				}
				else {
					EntityCacheUtil.putResult(QlvtDiemDungDangKyVietTrungModelImpl.ENTITY_CACHE_ENABLED,
						QlvtDiemDungDangKyVietTrungImpl.class, primaryKey,
						_nullQlvtDiemDungDangKyVietTrung);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QlvtDiemDungDangKyVietTrungModelImpl.ENTITY_CACHE_ENABLED,
					QlvtDiemDungDangKyVietTrungImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtDiemDungDangKyVietTrung;
	}

	/**
	 * Returns the qlvt diem dung dang ky viet trung with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the qlvt diem dung dang ky viet trung
	 * @return the qlvt diem dung dang ky viet trung, or <code>null</code> if a qlvt diem dung dang ky viet trung with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtDiemDungDangKyVietTrung fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the qlvt diem dung dang ky viet trungs.
	 *
	 * @return the qlvt diem dung dang ky viet trungs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtDiemDungDangKyVietTrung> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt diem dung dang ky viet trungs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtDiemDungDangKyVietTrungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt diem dung dang ky viet trungs
	 * @param end the upper bound of the range of qlvt diem dung dang ky viet trungs (not inclusive)
	 * @return the range of qlvt diem dung dang ky viet trungs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtDiemDungDangKyVietTrung> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt diem dung dang ky viet trungs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtDiemDungDangKyVietTrungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt diem dung dang ky viet trungs
	 * @param end the upper bound of the range of qlvt diem dung dang ky viet trungs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qlvt diem dung dang ky viet trungs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtDiemDungDangKyVietTrung> findAll(int start, int end,
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

		List<QlvtDiemDungDangKyVietTrung> list = (List<QlvtDiemDungDangKyVietTrung>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTDIEMDUNGDANGKYVIETTRUNG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTDIEMDUNGDANGKYVIETTRUNG;

				if (pagination) {
					sql = sql.concat(QlvtDiemDungDangKyVietTrungModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QlvtDiemDungDangKyVietTrung>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtDiemDungDangKyVietTrung>(list);
				}
				else {
					list = (List<QlvtDiemDungDangKyVietTrung>)QueryUtil.list(q,
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
	 * Removes all the qlvt diem dung dang ky viet trungs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QlvtDiemDungDangKyVietTrung qlvtDiemDungDangKyVietTrung : findAll()) {
			remove(qlvtDiemDungDangKyVietTrung);
		}
	}

	/**
	 * Returns the number of qlvt diem dung dang ky viet trungs.
	 *
	 * @return the number of qlvt diem dung dang ky viet trungs
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

				Query q = session.createQuery(_SQL_COUNT_QLVTDIEMDUNGDANGKYVIETTRUNG);

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
	 * Initializes the qlvt diem dung dang ky viet trung persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietTrung")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QlvtDiemDungDangKyVietTrung>> listenersList = new ArrayList<ModelListener<QlvtDiemDungDangKyVietTrung>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QlvtDiemDungDangKyVietTrung>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QlvtDiemDungDangKyVietTrungImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTDIEMDUNGDANGKYVIETTRUNG = "SELECT qlvtDiemDungDangKyVietTrung FROM QlvtDiemDungDangKyVietTrung qlvtDiemDungDangKyVietTrung";
	private static final String _SQL_COUNT_QLVTDIEMDUNGDANGKYVIETTRUNG = "SELECT COUNT(qlvtDiemDungDangKyVietTrung) FROM QlvtDiemDungDangKyVietTrung qlvtDiemDungDangKyVietTrung";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtDiemDungDangKyVietTrung.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QlvtDiemDungDangKyVietTrung exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QlvtDiemDungDangKyVietTrungPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "PhuongTienDangKyId", "NoiDungHoSoId", "HoSoThuTucId",
				"MaDiemDung", "TenDiemDung"
			});
	private static QlvtDiemDungDangKyVietTrung _nullQlvtDiemDungDangKyVietTrung = new QlvtDiemDungDangKyVietTrungImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QlvtDiemDungDangKyVietTrung> toCacheModel() {
				return _nullQlvtDiemDungDangKyVietTrungCacheModel;
			}
		};

	private static CacheModel<QlvtDiemDungDangKyVietTrung> _nullQlvtDiemDungDangKyVietTrungCacheModel =
		new CacheModel<QlvtDiemDungDangKyVietTrung>() {
			@Override
			public QlvtDiemDungDangKyVietTrung toEntityModel() {
				return _nullQlvtDiemDungDangKyVietTrung;
			}
		};
}