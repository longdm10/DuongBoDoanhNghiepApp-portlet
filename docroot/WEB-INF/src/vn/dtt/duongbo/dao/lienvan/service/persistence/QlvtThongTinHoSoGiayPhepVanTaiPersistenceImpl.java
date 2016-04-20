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

import vn.dtt.duongbo.dao.lienvan.NoSuchQlvtThongTinHoSoGiayPhepVanTaiException;
import vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTai;
import vn.dtt.duongbo.dao.lienvan.model.impl.QlvtThongTinHoSoGiayPhepVanTaiImpl;
import vn.dtt.duongbo.dao.lienvan.model.impl.QlvtThongTinHoSoGiayPhepVanTaiModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the qlvt thong tin ho so giay phep van tai service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanNc
 * @see QlvtThongTinHoSoGiayPhepVanTaiPersistence
 * @see QlvtThongTinHoSoGiayPhepVanTaiUtil
 * @generated
 */
public class QlvtThongTinHoSoGiayPhepVanTaiPersistenceImpl
	extends BasePersistenceImpl<QlvtThongTinHoSoGiayPhepVanTai>
	implements QlvtThongTinHoSoGiayPhepVanTaiPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QlvtThongTinHoSoGiayPhepVanTaiUtil} to access the qlvt thong tin ho so giay phep van tai persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QlvtThongTinHoSoGiayPhepVanTaiImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QlvtThongTinHoSoGiayPhepVanTaiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinHoSoGiayPhepVanTaiModelImpl.FINDER_CACHE_ENABLED,
			QlvtThongTinHoSoGiayPhepVanTaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QlvtThongTinHoSoGiayPhepVanTaiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinHoSoGiayPhepVanTaiModelImpl.FINDER_CACHE_ENABLED,
			QlvtThongTinHoSoGiayPhepVanTaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QlvtThongTinHoSoGiayPhepVanTaiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinHoSoGiayPhepVanTaiModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public QlvtThongTinHoSoGiayPhepVanTaiPersistenceImpl() {
		setModelClass(QlvtThongTinHoSoGiayPhepVanTai.class);
	}

	/**
	 * Caches the qlvt thong tin ho so giay phep van tai in the entity cache if it is enabled.
	 *
	 * @param qlvtThongTinHoSoGiayPhepVanTai the qlvt thong tin ho so giay phep van tai
	 */
	@Override
	public void cacheResult(
		QlvtThongTinHoSoGiayPhepVanTai qlvtThongTinHoSoGiayPhepVanTai) {
		EntityCacheUtil.putResult(QlvtThongTinHoSoGiayPhepVanTaiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinHoSoGiayPhepVanTaiImpl.class,
			qlvtThongTinHoSoGiayPhepVanTai.getPrimaryKey(),
			qlvtThongTinHoSoGiayPhepVanTai);

		qlvtThongTinHoSoGiayPhepVanTai.resetOriginalValues();
	}

	/**
	 * Caches the qlvt thong tin ho so giay phep van tais in the entity cache if it is enabled.
	 *
	 * @param qlvtThongTinHoSoGiayPhepVanTais the qlvt thong tin ho so giay phep van tais
	 */
	@Override
	public void cacheResult(
		List<QlvtThongTinHoSoGiayPhepVanTai> qlvtThongTinHoSoGiayPhepVanTais) {
		for (QlvtThongTinHoSoGiayPhepVanTai qlvtThongTinHoSoGiayPhepVanTai : qlvtThongTinHoSoGiayPhepVanTais) {
			if (EntityCacheUtil.getResult(
						QlvtThongTinHoSoGiayPhepVanTaiModelImpl.ENTITY_CACHE_ENABLED,
						QlvtThongTinHoSoGiayPhepVanTaiImpl.class,
						qlvtThongTinHoSoGiayPhepVanTai.getPrimaryKey()) == null) {
				cacheResult(qlvtThongTinHoSoGiayPhepVanTai);
			}
			else {
				qlvtThongTinHoSoGiayPhepVanTai.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qlvt thong tin ho so giay phep van tais.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QlvtThongTinHoSoGiayPhepVanTaiImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QlvtThongTinHoSoGiayPhepVanTaiImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qlvt thong tin ho so giay phep van tai.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		QlvtThongTinHoSoGiayPhepVanTai qlvtThongTinHoSoGiayPhepVanTai) {
		EntityCacheUtil.removeResult(QlvtThongTinHoSoGiayPhepVanTaiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinHoSoGiayPhepVanTaiImpl.class,
			qlvtThongTinHoSoGiayPhepVanTai.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<QlvtThongTinHoSoGiayPhepVanTai> qlvtThongTinHoSoGiayPhepVanTais) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QlvtThongTinHoSoGiayPhepVanTai qlvtThongTinHoSoGiayPhepVanTai : qlvtThongTinHoSoGiayPhepVanTais) {
			EntityCacheUtil.removeResult(QlvtThongTinHoSoGiayPhepVanTaiModelImpl.ENTITY_CACHE_ENABLED,
				QlvtThongTinHoSoGiayPhepVanTaiImpl.class,
				qlvtThongTinHoSoGiayPhepVanTai.getPrimaryKey());
		}
	}

	/**
	 * Creates a new qlvt thong tin ho so giay phep van tai with the primary key. Does not add the qlvt thong tin ho so giay phep van tai to the database.
	 *
	 * @param id the primary key for the new qlvt thong tin ho so giay phep van tai
	 * @return the new qlvt thong tin ho so giay phep van tai
	 */
	@Override
	public QlvtThongTinHoSoGiayPhepVanTai create(long id) {
		QlvtThongTinHoSoGiayPhepVanTai qlvtThongTinHoSoGiayPhepVanTai = new QlvtThongTinHoSoGiayPhepVanTaiImpl();

		qlvtThongTinHoSoGiayPhepVanTai.setNew(true);
		qlvtThongTinHoSoGiayPhepVanTai.setPrimaryKey(id);

		return qlvtThongTinHoSoGiayPhepVanTai;
	}

	/**
	 * Removes the qlvt thong tin ho so giay phep van tai with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the qlvt thong tin ho so giay phep van tai
	 * @return the qlvt thong tin ho so giay phep van tai that was removed
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtThongTinHoSoGiayPhepVanTaiException if a qlvt thong tin ho so giay phep van tai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSoGiayPhepVanTai remove(long id)
		throws NoSuchQlvtThongTinHoSoGiayPhepVanTaiException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the qlvt thong tin ho so giay phep van tai with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qlvt thong tin ho so giay phep van tai
	 * @return the qlvt thong tin ho so giay phep van tai that was removed
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtThongTinHoSoGiayPhepVanTaiException if a qlvt thong tin ho so giay phep van tai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSoGiayPhepVanTai remove(Serializable primaryKey)
		throws NoSuchQlvtThongTinHoSoGiayPhepVanTaiException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QlvtThongTinHoSoGiayPhepVanTai qlvtThongTinHoSoGiayPhepVanTai = (QlvtThongTinHoSoGiayPhepVanTai)session.get(QlvtThongTinHoSoGiayPhepVanTaiImpl.class,
					primaryKey);

			if (qlvtThongTinHoSoGiayPhepVanTai == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQlvtThongTinHoSoGiayPhepVanTaiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtThongTinHoSoGiayPhepVanTai);
		}
		catch (NoSuchQlvtThongTinHoSoGiayPhepVanTaiException nsee) {
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
	protected QlvtThongTinHoSoGiayPhepVanTai removeImpl(
		QlvtThongTinHoSoGiayPhepVanTai qlvtThongTinHoSoGiayPhepVanTai)
		throws SystemException {
		qlvtThongTinHoSoGiayPhepVanTai = toUnwrappedModel(qlvtThongTinHoSoGiayPhepVanTai);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtThongTinHoSoGiayPhepVanTai)) {
				qlvtThongTinHoSoGiayPhepVanTai = (QlvtThongTinHoSoGiayPhepVanTai)session.get(QlvtThongTinHoSoGiayPhepVanTaiImpl.class,
						qlvtThongTinHoSoGiayPhepVanTai.getPrimaryKeyObj());
			}

			if (qlvtThongTinHoSoGiayPhepVanTai != null) {
				session.delete(qlvtThongTinHoSoGiayPhepVanTai);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtThongTinHoSoGiayPhepVanTai != null) {
			clearCache(qlvtThongTinHoSoGiayPhepVanTai);
		}

		return qlvtThongTinHoSoGiayPhepVanTai;
	}

	@Override
	public QlvtThongTinHoSoGiayPhepVanTai updateImpl(
		vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTai qlvtThongTinHoSoGiayPhepVanTai)
		throws SystemException {
		qlvtThongTinHoSoGiayPhepVanTai = toUnwrappedModel(qlvtThongTinHoSoGiayPhepVanTai);

		boolean isNew = qlvtThongTinHoSoGiayPhepVanTai.isNew();

		Session session = null;

		try {
			session = openSession();

			if (qlvtThongTinHoSoGiayPhepVanTai.isNew()) {
				session.save(qlvtThongTinHoSoGiayPhepVanTai);

				qlvtThongTinHoSoGiayPhepVanTai.setNew(false);
			}
			else {
				session.merge(qlvtThongTinHoSoGiayPhepVanTai);
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

		EntityCacheUtil.putResult(QlvtThongTinHoSoGiayPhepVanTaiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinHoSoGiayPhepVanTaiImpl.class,
			qlvtThongTinHoSoGiayPhepVanTai.getPrimaryKey(),
			qlvtThongTinHoSoGiayPhepVanTai);

		return qlvtThongTinHoSoGiayPhepVanTai;
	}

	protected QlvtThongTinHoSoGiayPhepVanTai toUnwrappedModel(
		QlvtThongTinHoSoGiayPhepVanTai qlvtThongTinHoSoGiayPhepVanTai) {
		if (qlvtThongTinHoSoGiayPhepVanTai instanceof QlvtThongTinHoSoGiayPhepVanTaiImpl) {
			return qlvtThongTinHoSoGiayPhepVanTai;
		}

		QlvtThongTinHoSoGiayPhepVanTaiImpl qlvtThongTinHoSoGiayPhepVanTaiImpl = new QlvtThongTinHoSoGiayPhepVanTaiImpl();

		qlvtThongTinHoSoGiayPhepVanTaiImpl.setNew(qlvtThongTinHoSoGiayPhepVanTai.isNew());
		qlvtThongTinHoSoGiayPhepVanTaiImpl.setPrimaryKey(qlvtThongTinHoSoGiayPhepVanTai.getPrimaryKey());

		qlvtThongTinHoSoGiayPhepVanTaiImpl.setId(qlvtThongTinHoSoGiayPhepVanTai.getId());
		qlvtThongTinHoSoGiayPhepVanTaiImpl.setThongtinhosoId(qlvtThongTinHoSoGiayPhepVanTai.getThongtinhosoId());
		qlvtThongTinHoSoGiayPhepVanTaiImpl.setCapphepGpkdvtId(qlvtThongTinHoSoGiayPhepVanTai.getCapphepGpkdvtId());

		return qlvtThongTinHoSoGiayPhepVanTaiImpl;
	}

	/**
	 * Returns the qlvt thong tin ho so giay phep van tai with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt thong tin ho so giay phep van tai
	 * @return the qlvt thong tin ho so giay phep van tai
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtThongTinHoSoGiayPhepVanTaiException if a qlvt thong tin ho so giay phep van tai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSoGiayPhepVanTai findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchQlvtThongTinHoSoGiayPhepVanTaiException, SystemException {
		QlvtThongTinHoSoGiayPhepVanTai qlvtThongTinHoSoGiayPhepVanTai = fetchByPrimaryKey(primaryKey);

		if (qlvtThongTinHoSoGiayPhepVanTai == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQlvtThongTinHoSoGiayPhepVanTaiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtThongTinHoSoGiayPhepVanTai;
	}

	/**
	 * Returns the qlvt thong tin ho so giay phep van tai with the primary key or throws a {@link vn.dtt.duongbo.dao.lienvan.NoSuchQlvtThongTinHoSoGiayPhepVanTaiException} if it could not be found.
	 *
	 * @param id the primary key of the qlvt thong tin ho so giay phep van tai
	 * @return the qlvt thong tin ho so giay phep van tai
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtThongTinHoSoGiayPhepVanTaiException if a qlvt thong tin ho so giay phep van tai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSoGiayPhepVanTai findByPrimaryKey(long id)
		throws NoSuchQlvtThongTinHoSoGiayPhepVanTaiException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the qlvt thong tin ho so giay phep van tai with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt thong tin ho so giay phep van tai
	 * @return the qlvt thong tin ho so giay phep van tai, or <code>null</code> if a qlvt thong tin ho so giay phep van tai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSoGiayPhepVanTai fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		QlvtThongTinHoSoGiayPhepVanTai qlvtThongTinHoSoGiayPhepVanTai = (QlvtThongTinHoSoGiayPhepVanTai)EntityCacheUtil.getResult(QlvtThongTinHoSoGiayPhepVanTaiModelImpl.ENTITY_CACHE_ENABLED,
				QlvtThongTinHoSoGiayPhepVanTaiImpl.class, primaryKey);

		if (qlvtThongTinHoSoGiayPhepVanTai == _nullQlvtThongTinHoSoGiayPhepVanTai) {
			return null;
		}

		if (qlvtThongTinHoSoGiayPhepVanTai == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtThongTinHoSoGiayPhepVanTai = (QlvtThongTinHoSoGiayPhepVanTai)session.get(QlvtThongTinHoSoGiayPhepVanTaiImpl.class,
						primaryKey);

				if (qlvtThongTinHoSoGiayPhepVanTai != null) {
					cacheResult(qlvtThongTinHoSoGiayPhepVanTai);
				}
				else {
					EntityCacheUtil.putResult(QlvtThongTinHoSoGiayPhepVanTaiModelImpl.ENTITY_CACHE_ENABLED,
						QlvtThongTinHoSoGiayPhepVanTaiImpl.class, primaryKey,
						_nullQlvtThongTinHoSoGiayPhepVanTai);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QlvtThongTinHoSoGiayPhepVanTaiModelImpl.ENTITY_CACHE_ENABLED,
					QlvtThongTinHoSoGiayPhepVanTaiImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtThongTinHoSoGiayPhepVanTai;
	}

	/**
	 * Returns the qlvt thong tin ho so giay phep van tai with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the qlvt thong tin ho so giay phep van tai
	 * @return the qlvt thong tin ho so giay phep van tai, or <code>null</code> if a qlvt thong tin ho so giay phep van tai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSoGiayPhepVanTai fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the qlvt thong tin ho so giay phep van tais.
	 *
	 * @return the qlvt thong tin ho so giay phep van tais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtThongTinHoSoGiayPhepVanTai> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt thong tin ho so giay phep van tais.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtThongTinHoSoGiayPhepVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt thong tin ho so giay phep van tais
	 * @param end the upper bound of the range of qlvt thong tin ho so giay phep van tais (not inclusive)
	 * @return the range of qlvt thong tin ho so giay phep van tais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtThongTinHoSoGiayPhepVanTai> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt thong tin ho so giay phep van tais.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtThongTinHoSoGiayPhepVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt thong tin ho so giay phep van tais
	 * @param end the upper bound of the range of qlvt thong tin ho so giay phep van tais (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qlvt thong tin ho so giay phep van tais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtThongTinHoSoGiayPhepVanTai> findAll(int start, int end,
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

		List<QlvtThongTinHoSoGiayPhepVanTai> list = (List<QlvtThongTinHoSoGiayPhepVanTai>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTTHONGTINHOSOGIAYPHEPVANTAI);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTTHONGTINHOSOGIAYPHEPVANTAI;

				if (pagination) {
					sql = sql.concat(QlvtThongTinHoSoGiayPhepVanTaiModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QlvtThongTinHoSoGiayPhepVanTai>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtThongTinHoSoGiayPhepVanTai>(list);
				}
				else {
					list = (List<QlvtThongTinHoSoGiayPhepVanTai>)QueryUtil.list(q,
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
	 * Removes all the qlvt thong tin ho so giay phep van tais from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QlvtThongTinHoSoGiayPhepVanTai qlvtThongTinHoSoGiayPhepVanTai : findAll()) {
			remove(qlvtThongTinHoSoGiayPhepVanTai);
		}
	}

	/**
	 * Returns the number of qlvt thong tin ho so giay phep van tais.
	 *
	 * @return the number of qlvt thong tin ho so giay phep van tais
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

				Query q = session.createQuery(_SQL_COUNT_QLVTTHONGTINHOSOGIAYPHEPVANTAI);

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
	 * Initializes the qlvt thong tin ho so giay phep van tai persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTai")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QlvtThongTinHoSoGiayPhepVanTai>> listenersList =
					new ArrayList<ModelListener<QlvtThongTinHoSoGiayPhepVanTai>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QlvtThongTinHoSoGiayPhepVanTai>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QlvtThongTinHoSoGiayPhepVanTaiImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTTHONGTINHOSOGIAYPHEPVANTAI = "SELECT qlvtThongTinHoSoGiayPhepVanTai FROM QlvtThongTinHoSoGiayPhepVanTai qlvtThongTinHoSoGiayPhepVanTai";
	private static final String _SQL_COUNT_QLVTTHONGTINHOSOGIAYPHEPVANTAI = "SELECT COUNT(qlvtThongTinHoSoGiayPhepVanTai) FROM QlvtThongTinHoSoGiayPhepVanTai qlvtThongTinHoSoGiayPhepVanTai";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtThongTinHoSoGiayPhepVanTai.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QlvtThongTinHoSoGiayPhepVanTai exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QlvtThongTinHoSoGiayPhepVanTaiPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "thongtinhosoId", "capphepGpkdvtId"
			});
	private static QlvtThongTinHoSoGiayPhepVanTai _nullQlvtThongTinHoSoGiayPhepVanTai =
		new QlvtThongTinHoSoGiayPhepVanTaiImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QlvtThongTinHoSoGiayPhepVanTai> toCacheModel() {
				return _nullQlvtThongTinHoSoGiayPhepVanTaiCacheModel;
			}
		};

	private static CacheModel<QlvtThongTinHoSoGiayPhepVanTai> _nullQlvtThongTinHoSoGiayPhepVanTaiCacheModel =
		new CacheModel<QlvtThongTinHoSoGiayPhepVanTai>() {
			@Override
			public QlvtThongTinHoSoGiayPhepVanTai toEntityModel() {
				return _nullQlvtThongTinHoSoGiayPhepVanTai;
			}
		};
}