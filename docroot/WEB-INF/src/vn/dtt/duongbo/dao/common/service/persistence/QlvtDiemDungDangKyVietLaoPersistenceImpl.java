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

import vn.dtt.duongbo.dao.common.NoSuchQlvtDiemDungDangKyVietLaoException;
import vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietLao;
import vn.dtt.duongbo.dao.common.model.impl.QlvtDiemDungDangKyVietLaoImpl;
import vn.dtt.duongbo.dao.common.model.impl.QlvtDiemDungDangKyVietLaoModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the qlvt diem dung dang ky viet lao service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see QlvtDiemDungDangKyVietLaoPersistence
 * @see QlvtDiemDungDangKyVietLaoUtil
 * @generated
 */
public class QlvtDiemDungDangKyVietLaoPersistenceImpl
	extends BasePersistenceImpl<QlvtDiemDungDangKyVietLao>
	implements QlvtDiemDungDangKyVietLaoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QlvtDiemDungDangKyVietLaoUtil} to access the qlvt diem dung dang ky viet lao persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QlvtDiemDungDangKyVietLaoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QlvtDiemDungDangKyVietLaoModelImpl.ENTITY_CACHE_ENABLED,
			QlvtDiemDungDangKyVietLaoModelImpl.FINDER_CACHE_ENABLED,
			QlvtDiemDungDangKyVietLaoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QlvtDiemDungDangKyVietLaoModelImpl.ENTITY_CACHE_ENABLED,
			QlvtDiemDungDangKyVietLaoModelImpl.FINDER_CACHE_ENABLED,
			QlvtDiemDungDangKyVietLaoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QlvtDiemDungDangKyVietLaoModelImpl.ENTITY_CACHE_ENABLED,
			QlvtDiemDungDangKyVietLaoModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public QlvtDiemDungDangKyVietLaoPersistenceImpl() {
		setModelClass(QlvtDiemDungDangKyVietLao.class);
	}

	/**
	 * Caches the qlvt diem dung dang ky viet lao in the entity cache if it is enabled.
	 *
	 * @param qlvtDiemDungDangKyVietLao the qlvt diem dung dang ky viet lao
	 */
	@Override
	public void cacheResult(QlvtDiemDungDangKyVietLao qlvtDiemDungDangKyVietLao) {
		EntityCacheUtil.putResult(QlvtDiemDungDangKyVietLaoModelImpl.ENTITY_CACHE_ENABLED,
			QlvtDiemDungDangKyVietLaoImpl.class,
			qlvtDiemDungDangKyVietLao.getPrimaryKey(), qlvtDiemDungDangKyVietLao);

		qlvtDiemDungDangKyVietLao.resetOriginalValues();
	}

	/**
	 * Caches the qlvt diem dung dang ky viet laos in the entity cache if it is enabled.
	 *
	 * @param qlvtDiemDungDangKyVietLaos the qlvt diem dung dang ky viet laos
	 */
	@Override
	public void cacheResult(
		List<QlvtDiemDungDangKyVietLao> qlvtDiemDungDangKyVietLaos) {
		for (QlvtDiemDungDangKyVietLao qlvtDiemDungDangKyVietLao : qlvtDiemDungDangKyVietLaos) {
			if (EntityCacheUtil.getResult(
						QlvtDiemDungDangKyVietLaoModelImpl.ENTITY_CACHE_ENABLED,
						QlvtDiemDungDangKyVietLaoImpl.class,
						qlvtDiemDungDangKyVietLao.getPrimaryKey()) == null) {
				cacheResult(qlvtDiemDungDangKyVietLao);
			}
			else {
				qlvtDiemDungDangKyVietLao.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qlvt diem dung dang ky viet laos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QlvtDiemDungDangKyVietLaoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QlvtDiemDungDangKyVietLaoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qlvt diem dung dang ky viet lao.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QlvtDiemDungDangKyVietLao qlvtDiemDungDangKyVietLao) {
		EntityCacheUtil.removeResult(QlvtDiemDungDangKyVietLaoModelImpl.ENTITY_CACHE_ENABLED,
			QlvtDiemDungDangKyVietLaoImpl.class,
			qlvtDiemDungDangKyVietLao.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<QlvtDiemDungDangKyVietLao> qlvtDiemDungDangKyVietLaos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QlvtDiemDungDangKyVietLao qlvtDiemDungDangKyVietLao : qlvtDiemDungDangKyVietLaos) {
			EntityCacheUtil.removeResult(QlvtDiemDungDangKyVietLaoModelImpl.ENTITY_CACHE_ENABLED,
				QlvtDiemDungDangKyVietLaoImpl.class,
				qlvtDiemDungDangKyVietLao.getPrimaryKey());
		}
	}

	/**
	 * Creates a new qlvt diem dung dang ky viet lao with the primary key. Does not add the qlvt diem dung dang ky viet lao to the database.
	 *
	 * @param id the primary key for the new qlvt diem dung dang ky viet lao
	 * @return the new qlvt diem dung dang ky viet lao
	 */
	@Override
	public QlvtDiemDungDangKyVietLao create(long id) {
		QlvtDiemDungDangKyVietLao qlvtDiemDungDangKyVietLao = new QlvtDiemDungDangKyVietLaoImpl();

		qlvtDiemDungDangKyVietLao.setNew(true);
		qlvtDiemDungDangKyVietLao.setPrimaryKey(id);

		return qlvtDiemDungDangKyVietLao;
	}

	/**
	 * Removes the qlvt diem dung dang ky viet lao with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the qlvt diem dung dang ky viet lao
	 * @return the qlvt diem dung dang ky viet lao that was removed
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtDiemDungDangKyVietLaoException if a qlvt diem dung dang ky viet lao with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtDiemDungDangKyVietLao remove(long id)
		throws NoSuchQlvtDiemDungDangKyVietLaoException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the qlvt diem dung dang ky viet lao with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qlvt diem dung dang ky viet lao
	 * @return the qlvt diem dung dang ky viet lao that was removed
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtDiemDungDangKyVietLaoException if a qlvt diem dung dang ky viet lao with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtDiemDungDangKyVietLao remove(Serializable primaryKey)
		throws NoSuchQlvtDiemDungDangKyVietLaoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QlvtDiemDungDangKyVietLao qlvtDiemDungDangKyVietLao = (QlvtDiemDungDangKyVietLao)session.get(QlvtDiemDungDangKyVietLaoImpl.class,
					primaryKey);

			if (qlvtDiemDungDangKyVietLao == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQlvtDiemDungDangKyVietLaoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtDiemDungDangKyVietLao);
		}
		catch (NoSuchQlvtDiemDungDangKyVietLaoException nsee) {
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
	protected QlvtDiemDungDangKyVietLao removeImpl(
		QlvtDiemDungDangKyVietLao qlvtDiemDungDangKyVietLao)
		throws SystemException {
		qlvtDiemDungDangKyVietLao = toUnwrappedModel(qlvtDiemDungDangKyVietLao);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtDiemDungDangKyVietLao)) {
				qlvtDiemDungDangKyVietLao = (QlvtDiemDungDangKyVietLao)session.get(QlvtDiemDungDangKyVietLaoImpl.class,
						qlvtDiemDungDangKyVietLao.getPrimaryKeyObj());
			}

			if (qlvtDiemDungDangKyVietLao != null) {
				session.delete(qlvtDiemDungDangKyVietLao);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtDiemDungDangKyVietLao != null) {
			clearCache(qlvtDiemDungDangKyVietLao);
		}

		return qlvtDiemDungDangKyVietLao;
	}

	@Override
	public QlvtDiemDungDangKyVietLao updateImpl(
		vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietLao qlvtDiemDungDangKyVietLao)
		throws SystemException {
		qlvtDiemDungDangKyVietLao = toUnwrappedModel(qlvtDiemDungDangKyVietLao);

		boolean isNew = qlvtDiemDungDangKyVietLao.isNew();

		Session session = null;

		try {
			session = openSession();

			if (qlvtDiemDungDangKyVietLao.isNew()) {
				session.save(qlvtDiemDungDangKyVietLao);

				qlvtDiemDungDangKyVietLao.setNew(false);
			}
			else {
				session.merge(qlvtDiemDungDangKyVietLao);
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

		EntityCacheUtil.putResult(QlvtDiemDungDangKyVietLaoModelImpl.ENTITY_CACHE_ENABLED,
			QlvtDiemDungDangKyVietLaoImpl.class,
			qlvtDiemDungDangKyVietLao.getPrimaryKey(), qlvtDiemDungDangKyVietLao);

		return qlvtDiemDungDangKyVietLao;
	}

	protected QlvtDiemDungDangKyVietLao toUnwrappedModel(
		QlvtDiemDungDangKyVietLao qlvtDiemDungDangKyVietLao) {
		if (qlvtDiemDungDangKyVietLao instanceof QlvtDiemDungDangKyVietLaoImpl) {
			return qlvtDiemDungDangKyVietLao;
		}

		QlvtDiemDungDangKyVietLaoImpl qlvtDiemDungDangKyVietLaoImpl = new QlvtDiemDungDangKyVietLaoImpl();

		qlvtDiemDungDangKyVietLaoImpl.setNew(qlvtDiemDungDangKyVietLao.isNew());
		qlvtDiemDungDangKyVietLaoImpl.setPrimaryKey(qlvtDiemDungDangKyVietLao.getPrimaryKey());

		qlvtDiemDungDangKyVietLaoImpl.setId(qlvtDiemDungDangKyVietLao.getId());
		qlvtDiemDungDangKyVietLaoImpl.setPhuongTienDangKyId(qlvtDiemDungDangKyVietLao.getPhuongTienDangKyId());
		qlvtDiemDungDangKyVietLaoImpl.setNoiDungHoSoId(qlvtDiemDungDangKyVietLao.getNoiDungHoSoId());
		qlvtDiemDungDangKyVietLaoImpl.setHoSoThuTucId(qlvtDiemDungDangKyVietLao.getHoSoThuTucId());
		qlvtDiemDungDangKyVietLaoImpl.setMaDiemDung(qlvtDiemDungDangKyVietLao.getMaDiemDung());
		qlvtDiemDungDangKyVietLaoImpl.setTenDiemDung(qlvtDiemDungDangKyVietLao.getTenDiemDung());

		return qlvtDiemDungDangKyVietLaoImpl;
	}

	/**
	 * Returns the qlvt diem dung dang ky viet lao with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt diem dung dang ky viet lao
	 * @return the qlvt diem dung dang ky viet lao
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtDiemDungDangKyVietLaoException if a qlvt diem dung dang ky viet lao with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtDiemDungDangKyVietLao findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQlvtDiemDungDangKyVietLaoException, SystemException {
		QlvtDiemDungDangKyVietLao qlvtDiemDungDangKyVietLao = fetchByPrimaryKey(primaryKey);

		if (qlvtDiemDungDangKyVietLao == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQlvtDiemDungDangKyVietLaoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtDiemDungDangKyVietLao;
	}

	/**
	 * Returns the qlvt diem dung dang ky viet lao with the primary key or throws a {@link vn.dtt.duongbo.dao.common.NoSuchQlvtDiemDungDangKyVietLaoException} if it could not be found.
	 *
	 * @param id the primary key of the qlvt diem dung dang ky viet lao
	 * @return the qlvt diem dung dang ky viet lao
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtDiemDungDangKyVietLaoException if a qlvt diem dung dang ky viet lao with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtDiemDungDangKyVietLao findByPrimaryKey(long id)
		throws NoSuchQlvtDiemDungDangKyVietLaoException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the qlvt diem dung dang ky viet lao with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt diem dung dang ky viet lao
	 * @return the qlvt diem dung dang ky viet lao, or <code>null</code> if a qlvt diem dung dang ky viet lao with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtDiemDungDangKyVietLao fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QlvtDiemDungDangKyVietLao qlvtDiemDungDangKyVietLao = (QlvtDiemDungDangKyVietLao)EntityCacheUtil.getResult(QlvtDiemDungDangKyVietLaoModelImpl.ENTITY_CACHE_ENABLED,
				QlvtDiemDungDangKyVietLaoImpl.class, primaryKey);

		if (qlvtDiemDungDangKyVietLao == _nullQlvtDiemDungDangKyVietLao) {
			return null;
		}

		if (qlvtDiemDungDangKyVietLao == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtDiemDungDangKyVietLao = (QlvtDiemDungDangKyVietLao)session.get(QlvtDiemDungDangKyVietLaoImpl.class,
						primaryKey);

				if (qlvtDiemDungDangKyVietLao != null) {
					cacheResult(qlvtDiemDungDangKyVietLao);
				}
				else {
					EntityCacheUtil.putResult(QlvtDiemDungDangKyVietLaoModelImpl.ENTITY_CACHE_ENABLED,
						QlvtDiemDungDangKyVietLaoImpl.class, primaryKey,
						_nullQlvtDiemDungDangKyVietLao);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QlvtDiemDungDangKyVietLaoModelImpl.ENTITY_CACHE_ENABLED,
					QlvtDiemDungDangKyVietLaoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtDiemDungDangKyVietLao;
	}

	/**
	 * Returns the qlvt diem dung dang ky viet lao with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the qlvt diem dung dang ky viet lao
	 * @return the qlvt diem dung dang ky viet lao, or <code>null</code> if a qlvt diem dung dang ky viet lao with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtDiemDungDangKyVietLao fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the qlvt diem dung dang ky viet laos.
	 *
	 * @return the qlvt diem dung dang ky viet laos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtDiemDungDangKyVietLao> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt diem dung dang ky viet laos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtDiemDungDangKyVietLaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt diem dung dang ky viet laos
	 * @param end the upper bound of the range of qlvt diem dung dang ky viet laos (not inclusive)
	 * @return the range of qlvt diem dung dang ky viet laos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtDiemDungDangKyVietLao> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt diem dung dang ky viet laos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtDiemDungDangKyVietLaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt diem dung dang ky viet laos
	 * @param end the upper bound of the range of qlvt diem dung dang ky viet laos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qlvt diem dung dang ky viet laos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtDiemDungDangKyVietLao> findAll(int start, int end,
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

		List<QlvtDiemDungDangKyVietLao> list = (List<QlvtDiemDungDangKyVietLao>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTDIEMDUNGDANGKYVIETLAO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTDIEMDUNGDANGKYVIETLAO;

				if (pagination) {
					sql = sql.concat(QlvtDiemDungDangKyVietLaoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QlvtDiemDungDangKyVietLao>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtDiemDungDangKyVietLao>(list);
				}
				else {
					list = (List<QlvtDiemDungDangKyVietLao>)QueryUtil.list(q,
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
	 * Removes all the qlvt diem dung dang ky viet laos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QlvtDiemDungDangKyVietLao qlvtDiemDungDangKyVietLao : findAll()) {
			remove(qlvtDiemDungDangKyVietLao);
		}
	}

	/**
	 * Returns the number of qlvt diem dung dang ky viet laos.
	 *
	 * @return the number of qlvt diem dung dang ky viet laos
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

				Query q = session.createQuery(_SQL_COUNT_QLVTDIEMDUNGDANGKYVIETLAO);

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
	 * Initializes the qlvt diem dung dang ky viet lao persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietLao")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QlvtDiemDungDangKyVietLao>> listenersList = new ArrayList<ModelListener<QlvtDiemDungDangKyVietLao>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QlvtDiemDungDangKyVietLao>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QlvtDiemDungDangKyVietLaoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTDIEMDUNGDANGKYVIETLAO = "SELECT qlvtDiemDungDangKyVietLao FROM QlvtDiemDungDangKyVietLao qlvtDiemDungDangKyVietLao";
	private static final String _SQL_COUNT_QLVTDIEMDUNGDANGKYVIETLAO = "SELECT COUNT(qlvtDiemDungDangKyVietLao) FROM QlvtDiemDungDangKyVietLao qlvtDiemDungDangKyVietLao";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtDiemDungDangKyVietLao.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QlvtDiemDungDangKyVietLao exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QlvtDiemDungDangKyVietLaoPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "PhuongTienDangKyId", "NoiDungHoSoId", "HoSoThuTucId",
				"MaDiemDung", "TenDiemDung"
			});
	private static QlvtDiemDungDangKyVietLao _nullQlvtDiemDungDangKyVietLao = new QlvtDiemDungDangKyVietLaoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QlvtDiemDungDangKyVietLao> toCacheModel() {
				return _nullQlvtDiemDungDangKyVietLaoCacheModel;
			}
		};

	private static CacheModel<QlvtDiemDungDangKyVietLao> _nullQlvtDiemDungDangKyVietLaoCacheModel =
		new CacheModel<QlvtDiemDungDangKyVietLao>() {
			@Override
			public QlvtDiemDungDangKyVietLao toEntityModel() {
				return _nullQlvtDiemDungDangKyVietLao;
			}
		};
}