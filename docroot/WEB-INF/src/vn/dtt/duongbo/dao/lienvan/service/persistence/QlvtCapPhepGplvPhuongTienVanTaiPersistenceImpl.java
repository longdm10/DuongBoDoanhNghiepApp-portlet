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

import vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepGplvPhuongTienVanTaiException;
import vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvPhuongTienVanTai;
import vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGplvPhuongTienVanTaiImpl;
import vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGplvPhuongTienVanTaiModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the qlvt cap phep gplv phuong tien van tai service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanNc
 * @see QlvtCapPhepGplvPhuongTienVanTaiPersistence
 * @see QlvtCapPhepGplvPhuongTienVanTaiUtil
 * @generated
 */
public class QlvtCapPhepGplvPhuongTienVanTaiPersistenceImpl
	extends BasePersistenceImpl<QlvtCapPhepGplvPhuongTienVanTai>
	implements QlvtCapPhepGplvPhuongTienVanTaiPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QlvtCapPhepGplvPhuongTienVanTaiUtil} to access the qlvt cap phep gplv phuong tien van tai persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QlvtCapPhepGplvPhuongTienVanTaiImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QlvtCapPhepGplvPhuongTienVanTaiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtCapPhepGplvPhuongTienVanTaiModelImpl.FINDER_CACHE_ENABLED,
			QlvtCapPhepGplvPhuongTienVanTaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QlvtCapPhepGplvPhuongTienVanTaiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtCapPhepGplvPhuongTienVanTaiModelImpl.FINDER_CACHE_ENABLED,
			QlvtCapPhepGplvPhuongTienVanTaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QlvtCapPhepGplvPhuongTienVanTaiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtCapPhepGplvPhuongTienVanTaiModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public QlvtCapPhepGplvPhuongTienVanTaiPersistenceImpl() {
		setModelClass(QlvtCapPhepGplvPhuongTienVanTai.class);
	}

	/**
	 * Caches the qlvt cap phep gplv phuong tien van tai in the entity cache if it is enabled.
	 *
	 * @param qlvtCapPhepGplvPhuongTienVanTai the qlvt cap phep gplv phuong tien van tai
	 */
	@Override
	public void cacheResult(
		QlvtCapPhepGplvPhuongTienVanTai qlvtCapPhepGplvPhuongTienVanTai) {
		EntityCacheUtil.putResult(QlvtCapPhepGplvPhuongTienVanTaiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtCapPhepGplvPhuongTienVanTaiImpl.class,
			qlvtCapPhepGplvPhuongTienVanTai.getPrimaryKey(),
			qlvtCapPhepGplvPhuongTienVanTai);

		qlvtCapPhepGplvPhuongTienVanTai.resetOriginalValues();
	}

	/**
	 * Caches the qlvt cap phep gplv phuong tien van tais in the entity cache if it is enabled.
	 *
	 * @param qlvtCapPhepGplvPhuongTienVanTais the qlvt cap phep gplv phuong tien van tais
	 */
	@Override
	public void cacheResult(
		List<QlvtCapPhepGplvPhuongTienVanTai> qlvtCapPhepGplvPhuongTienVanTais) {
		for (QlvtCapPhepGplvPhuongTienVanTai qlvtCapPhepGplvPhuongTienVanTai : qlvtCapPhepGplvPhuongTienVanTais) {
			if (EntityCacheUtil.getResult(
						QlvtCapPhepGplvPhuongTienVanTaiModelImpl.ENTITY_CACHE_ENABLED,
						QlvtCapPhepGplvPhuongTienVanTaiImpl.class,
						qlvtCapPhepGplvPhuongTienVanTai.getPrimaryKey()) == null) {
				cacheResult(qlvtCapPhepGplvPhuongTienVanTai);
			}
			else {
				qlvtCapPhepGplvPhuongTienVanTai.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qlvt cap phep gplv phuong tien van tais.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QlvtCapPhepGplvPhuongTienVanTaiImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QlvtCapPhepGplvPhuongTienVanTaiImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qlvt cap phep gplv phuong tien van tai.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		QlvtCapPhepGplvPhuongTienVanTai qlvtCapPhepGplvPhuongTienVanTai) {
		EntityCacheUtil.removeResult(QlvtCapPhepGplvPhuongTienVanTaiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtCapPhepGplvPhuongTienVanTaiImpl.class,
			qlvtCapPhepGplvPhuongTienVanTai.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<QlvtCapPhepGplvPhuongTienVanTai> qlvtCapPhepGplvPhuongTienVanTais) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QlvtCapPhepGplvPhuongTienVanTai qlvtCapPhepGplvPhuongTienVanTai : qlvtCapPhepGplvPhuongTienVanTais) {
			EntityCacheUtil.removeResult(QlvtCapPhepGplvPhuongTienVanTaiModelImpl.ENTITY_CACHE_ENABLED,
				QlvtCapPhepGplvPhuongTienVanTaiImpl.class,
				qlvtCapPhepGplvPhuongTienVanTai.getPrimaryKey());
		}
	}

	/**
	 * Creates a new qlvt cap phep gplv phuong tien van tai with the primary key. Does not add the qlvt cap phep gplv phuong tien van tai to the database.
	 *
	 * @param id the primary key for the new qlvt cap phep gplv phuong tien van tai
	 * @return the new qlvt cap phep gplv phuong tien van tai
	 */
	@Override
	public QlvtCapPhepGplvPhuongTienVanTai create(long id) {
		QlvtCapPhepGplvPhuongTienVanTai qlvtCapPhepGplvPhuongTienVanTai = new QlvtCapPhepGplvPhuongTienVanTaiImpl();

		qlvtCapPhepGplvPhuongTienVanTai.setNew(true);
		qlvtCapPhepGplvPhuongTienVanTai.setPrimaryKey(id);

		return qlvtCapPhepGplvPhuongTienVanTai;
	}

	/**
	 * Removes the qlvt cap phep gplv phuong tien van tai with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the qlvt cap phep gplv phuong tien van tai
	 * @return the qlvt cap phep gplv phuong tien van tai that was removed
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepGplvPhuongTienVanTaiException if a qlvt cap phep gplv phuong tien van tai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtCapPhepGplvPhuongTienVanTai remove(long id)
		throws NoSuchQlvtCapPhepGplvPhuongTienVanTaiException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the qlvt cap phep gplv phuong tien van tai with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qlvt cap phep gplv phuong tien van tai
	 * @return the qlvt cap phep gplv phuong tien van tai that was removed
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepGplvPhuongTienVanTaiException if a qlvt cap phep gplv phuong tien van tai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtCapPhepGplvPhuongTienVanTai remove(Serializable primaryKey)
		throws NoSuchQlvtCapPhepGplvPhuongTienVanTaiException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QlvtCapPhepGplvPhuongTienVanTai qlvtCapPhepGplvPhuongTienVanTai = (QlvtCapPhepGplvPhuongTienVanTai)session.get(QlvtCapPhepGplvPhuongTienVanTaiImpl.class,
					primaryKey);

			if (qlvtCapPhepGplvPhuongTienVanTai == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQlvtCapPhepGplvPhuongTienVanTaiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtCapPhepGplvPhuongTienVanTai);
		}
		catch (NoSuchQlvtCapPhepGplvPhuongTienVanTaiException nsee) {
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
	protected QlvtCapPhepGplvPhuongTienVanTai removeImpl(
		QlvtCapPhepGplvPhuongTienVanTai qlvtCapPhepGplvPhuongTienVanTai)
		throws SystemException {
		qlvtCapPhepGplvPhuongTienVanTai = toUnwrappedModel(qlvtCapPhepGplvPhuongTienVanTai);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtCapPhepGplvPhuongTienVanTai)) {
				qlvtCapPhepGplvPhuongTienVanTai = (QlvtCapPhepGplvPhuongTienVanTai)session.get(QlvtCapPhepGplvPhuongTienVanTaiImpl.class,
						qlvtCapPhepGplvPhuongTienVanTai.getPrimaryKeyObj());
			}

			if (qlvtCapPhepGplvPhuongTienVanTai != null) {
				session.delete(qlvtCapPhepGplvPhuongTienVanTai);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtCapPhepGplvPhuongTienVanTai != null) {
			clearCache(qlvtCapPhepGplvPhuongTienVanTai);
		}

		return qlvtCapPhepGplvPhuongTienVanTai;
	}

	@Override
	public QlvtCapPhepGplvPhuongTienVanTai updateImpl(
		vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvPhuongTienVanTai qlvtCapPhepGplvPhuongTienVanTai)
		throws SystemException {
		qlvtCapPhepGplvPhuongTienVanTai = toUnwrappedModel(qlvtCapPhepGplvPhuongTienVanTai);

		boolean isNew = qlvtCapPhepGplvPhuongTienVanTai.isNew();

		Session session = null;

		try {
			session = openSession();

			if (qlvtCapPhepGplvPhuongTienVanTai.isNew()) {
				session.save(qlvtCapPhepGplvPhuongTienVanTai);

				qlvtCapPhepGplvPhuongTienVanTai.setNew(false);
			}
			else {
				session.merge(qlvtCapPhepGplvPhuongTienVanTai);
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

		EntityCacheUtil.putResult(QlvtCapPhepGplvPhuongTienVanTaiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtCapPhepGplvPhuongTienVanTaiImpl.class,
			qlvtCapPhepGplvPhuongTienVanTai.getPrimaryKey(),
			qlvtCapPhepGplvPhuongTienVanTai);

		return qlvtCapPhepGplvPhuongTienVanTai;
	}

	protected QlvtCapPhepGplvPhuongTienVanTai toUnwrappedModel(
		QlvtCapPhepGplvPhuongTienVanTai qlvtCapPhepGplvPhuongTienVanTai) {
		if (qlvtCapPhepGplvPhuongTienVanTai instanceof QlvtCapPhepGplvPhuongTienVanTaiImpl) {
			return qlvtCapPhepGplvPhuongTienVanTai;
		}

		QlvtCapPhepGplvPhuongTienVanTaiImpl qlvtCapPhepGplvPhuongTienVanTaiImpl = new QlvtCapPhepGplvPhuongTienVanTaiImpl();

		qlvtCapPhepGplvPhuongTienVanTaiImpl.setNew(qlvtCapPhepGplvPhuongTienVanTai.isNew());
		qlvtCapPhepGplvPhuongTienVanTaiImpl.setPrimaryKey(qlvtCapPhepGplvPhuongTienVanTai.getPrimaryKey());

		qlvtCapPhepGplvPhuongTienVanTaiImpl.setId(qlvtCapPhepGplvPhuongTienVanTai.getId());
		qlvtCapPhepGplvPhuongTienVanTaiImpl.setCapphepGplienvanPhuongtienId(qlvtCapPhepGplvPhuongTienVanTai.getCapphepGplienvanPhuongtienId());
		qlvtCapPhepGplvPhuongTienVanTaiImpl.setCapphepPhuongtienvantaiId(qlvtCapPhepGplvPhuongTienVanTai.getCapphepPhuongtienvantaiId());

		return qlvtCapPhepGplvPhuongTienVanTaiImpl;
	}

	/**
	 * Returns the qlvt cap phep gplv phuong tien van tai with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt cap phep gplv phuong tien van tai
	 * @return the qlvt cap phep gplv phuong tien van tai
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepGplvPhuongTienVanTaiException if a qlvt cap phep gplv phuong tien van tai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtCapPhepGplvPhuongTienVanTai findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchQlvtCapPhepGplvPhuongTienVanTaiException, SystemException {
		QlvtCapPhepGplvPhuongTienVanTai qlvtCapPhepGplvPhuongTienVanTai = fetchByPrimaryKey(primaryKey);

		if (qlvtCapPhepGplvPhuongTienVanTai == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQlvtCapPhepGplvPhuongTienVanTaiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtCapPhepGplvPhuongTienVanTai;
	}

	/**
	 * Returns the qlvt cap phep gplv phuong tien van tai with the primary key or throws a {@link vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepGplvPhuongTienVanTaiException} if it could not be found.
	 *
	 * @param id the primary key of the qlvt cap phep gplv phuong tien van tai
	 * @return the qlvt cap phep gplv phuong tien van tai
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepGplvPhuongTienVanTaiException if a qlvt cap phep gplv phuong tien van tai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtCapPhepGplvPhuongTienVanTai findByPrimaryKey(long id)
		throws NoSuchQlvtCapPhepGplvPhuongTienVanTaiException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the qlvt cap phep gplv phuong tien van tai with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt cap phep gplv phuong tien van tai
	 * @return the qlvt cap phep gplv phuong tien van tai, or <code>null</code> if a qlvt cap phep gplv phuong tien van tai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtCapPhepGplvPhuongTienVanTai fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		QlvtCapPhepGplvPhuongTienVanTai qlvtCapPhepGplvPhuongTienVanTai = (QlvtCapPhepGplvPhuongTienVanTai)EntityCacheUtil.getResult(QlvtCapPhepGplvPhuongTienVanTaiModelImpl.ENTITY_CACHE_ENABLED,
				QlvtCapPhepGplvPhuongTienVanTaiImpl.class, primaryKey);

		if (qlvtCapPhepGplvPhuongTienVanTai == _nullQlvtCapPhepGplvPhuongTienVanTai) {
			return null;
		}

		if (qlvtCapPhepGplvPhuongTienVanTai == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtCapPhepGplvPhuongTienVanTai = (QlvtCapPhepGplvPhuongTienVanTai)session.get(QlvtCapPhepGplvPhuongTienVanTaiImpl.class,
						primaryKey);

				if (qlvtCapPhepGplvPhuongTienVanTai != null) {
					cacheResult(qlvtCapPhepGplvPhuongTienVanTai);
				}
				else {
					EntityCacheUtil.putResult(QlvtCapPhepGplvPhuongTienVanTaiModelImpl.ENTITY_CACHE_ENABLED,
						QlvtCapPhepGplvPhuongTienVanTaiImpl.class, primaryKey,
						_nullQlvtCapPhepGplvPhuongTienVanTai);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QlvtCapPhepGplvPhuongTienVanTaiModelImpl.ENTITY_CACHE_ENABLED,
					QlvtCapPhepGplvPhuongTienVanTaiImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtCapPhepGplvPhuongTienVanTai;
	}

	/**
	 * Returns the qlvt cap phep gplv phuong tien van tai with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the qlvt cap phep gplv phuong tien van tai
	 * @return the qlvt cap phep gplv phuong tien van tai, or <code>null</code> if a qlvt cap phep gplv phuong tien van tai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtCapPhepGplvPhuongTienVanTai fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the qlvt cap phep gplv phuong tien van tais.
	 *
	 * @return the qlvt cap phep gplv phuong tien van tais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtCapPhepGplvPhuongTienVanTai> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt cap phep gplv phuong tien van tais.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGplvPhuongTienVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt cap phep gplv phuong tien van tais
	 * @param end the upper bound of the range of qlvt cap phep gplv phuong tien van tais (not inclusive)
	 * @return the range of qlvt cap phep gplv phuong tien van tais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtCapPhepGplvPhuongTienVanTai> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt cap phep gplv phuong tien van tais.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGplvPhuongTienVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt cap phep gplv phuong tien van tais
	 * @param end the upper bound of the range of qlvt cap phep gplv phuong tien van tais (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qlvt cap phep gplv phuong tien van tais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtCapPhepGplvPhuongTienVanTai> findAll(int start, int end,
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

		List<QlvtCapPhepGplvPhuongTienVanTai> list = (List<QlvtCapPhepGplvPhuongTienVanTai>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTCAPPHEPGPLVPHUONGTIENVANTAI);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTCAPPHEPGPLVPHUONGTIENVANTAI;

				if (pagination) {
					sql = sql.concat(QlvtCapPhepGplvPhuongTienVanTaiModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QlvtCapPhepGplvPhuongTienVanTai>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtCapPhepGplvPhuongTienVanTai>(list);
				}
				else {
					list = (List<QlvtCapPhepGplvPhuongTienVanTai>)QueryUtil.list(q,
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
	 * Removes all the qlvt cap phep gplv phuong tien van tais from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QlvtCapPhepGplvPhuongTienVanTai qlvtCapPhepGplvPhuongTienVanTai : findAll()) {
			remove(qlvtCapPhepGplvPhuongTienVanTai);
		}
	}

	/**
	 * Returns the number of qlvt cap phep gplv phuong tien van tais.
	 *
	 * @return the number of qlvt cap phep gplv phuong tien van tais
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

				Query q = session.createQuery(_SQL_COUNT_QLVTCAPPHEPGPLVPHUONGTIENVANTAI);

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
	 * Initializes the qlvt cap phep gplv phuong tien van tai persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvPhuongTienVanTai")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QlvtCapPhepGplvPhuongTienVanTai>> listenersList =
					new ArrayList<ModelListener<QlvtCapPhepGplvPhuongTienVanTai>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QlvtCapPhepGplvPhuongTienVanTai>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QlvtCapPhepGplvPhuongTienVanTaiImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTCAPPHEPGPLVPHUONGTIENVANTAI = "SELECT qlvtCapPhepGplvPhuongTienVanTai FROM QlvtCapPhepGplvPhuongTienVanTai qlvtCapPhepGplvPhuongTienVanTai";
	private static final String _SQL_COUNT_QLVTCAPPHEPGPLVPHUONGTIENVANTAI = "SELECT COUNT(qlvtCapPhepGplvPhuongTienVanTai) FROM QlvtCapPhepGplvPhuongTienVanTai qlvtCapPhepGplvPhuongTienVanTai";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtCapPhepGplvPhuongTienVanTai.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QlvtCapPhepGplvPhuongTienVanTai exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QlvtCapPhepGplvPhuongTienVanTaiPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "capphepGplienvanPhuongtienId",
				"capphepPhuongtienvantaiId"
			});
	private static QlvtCapPhepGplvPhuongTienVanTai _nullQlvtCapPhepGplvPhuongTienVanTai =
		new QlvtCapPhepGplvPhuongTienVanTaiImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QlvtCapPhepGplvPhuongTienVanTai> toCacheModel() {
				return _nullQlvtCapPhepGplvPhuongTienVanTaiCacheModel;
			}
		};

	private static CacheModel<QlvtCapPhepGplvPhuongTienVanTai> _nullQlvtCapPhepGplvPhuongTienVanTaiCacheModel =
		new CacheModel<QlvtCapPhepGplvPhuongTienVanTai>() {
			@Override
			public QlvtCapPhepGplvPhuongTienVanTai toEntityModel() {
				return _nullQlvtCapPhepGplvPhuongTienVanTai;
			}
		};
}