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

import vn.dtt.duongbo.dao.lienvan.NoSuchQlvtThongTinHoSoCapPhepGplvException;
import vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoCapPhepGplv;
import vn.dtt.duongbo.dao.lienvan.model.impl.QlvtThongTinHoSoCapPhepGplvImpl;
import vn.dtt.duongbo.dao.lienvan.model.impl.QlvtThongTinHoSoCapPhepGplvModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the qlvt thong tin ho so cap phep gplv service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanNc
 * @see QlvtThongTinHoSoCapPhepGplvPersistence
 * @see QlvtThongTinHoSoCapPhepGplvUtil
 * @generated
 */
public class QlvtThongTinHoSoCapPhepGplvPersistenceImpl
	extends BasePersistenceImpl<QlvtThongTinHoSoCapPhepGplv>
	implements QlvtThongTinHoSoCapPhepGplvPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QlvtThongTinHoSoCapPhepGplvUtil} to access the qlvt thong tin ho so cap phep gplv persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QlvtThongTinHoSoCapPhepGplvImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QlvtThongTinHoSoCapPhepGplvModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinHoSoCapPhepGplvModelImpl.FINDER_CACHE_ENABLED,
			QlvtThongTinHoSoCapPhepGplvImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QlvtThongTinHoSoCapPhepGplvModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinHoSoCapPhepGplvModelImpl.FINDER_CACHE_ENABLED,
			QlvtThongTinHoSoCapPhepGplvImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QlvtThongTinHoSoCapPhepGplvModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinHoSoCapPhepGplvModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public QlvtThongTinHoSoCapPhepGplvPersistenceImpl() {
		setModelClass(QlvtThongTinHoSoCapPhepGplv.class);
	}

	/**
	 * Caches the qlvt thong tin ho so cap phep gplv in the entity cache if it is enabled.
	 *
	 * @param qlvtThongTinHoSoCapPhepGplv the qlvt thong tin ho so cap phep gplv
	 */
	@Override
	public void cacheResult(
		QlvtThongTinHoSoCapPhepGplv qlvtThongTinHoSoCapPhepGplv) {
		EntityCacheUtil.putResult(QlvtThongTinHoSoCapPhepGplvModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinHoSoCapPhepGplvImpl.class,
			qlvtThongTinHoSoCapPhepGplv.getPrimaryKey(),
			qlvtThongTinHoSoCapPhepGplv);

		qlvtThongTinHoSoCapPhepGplv.resetOriginalValues();
	}

	/**
	 * Caches the qlvt thong tin ho so cap phep gplvs in the entity cache if it is enabled.
	 *
	 * @param qlvtThongTinHoSoCapPhepGplvs the qlvt thong tin ho so cap phep gplvs
	 */
	@Override
	public void cacheResult(
		List<QlvtThongTinHoSoCapPhepGplv> qlvtThongTinHoSoCapPhepGplvs) {
		for (QlvtThongTinHoSoCapPhepGplv qlvtThongTinHoSoCapPhepGplv : qlvtThongTinHoSoCapPhepGplvs) {
			if (EntityCacheUtil.getResult(
						QlvtThongTinHoSoCapPhepGplvModelImpl.ENTITY_CACHE_ENABLED,
						QlvtThongTinHoSoCapPhepGplvImpl.class,
						qlvtThongTinHoSoCapPhepGplv.getPrimaryKey()) == null) {
				cacheResult(qlvtThongTinHoSoCapPhepGplv);
			}
			else {
				qlvtThongTinHoSoCapPhepGplv.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qlvt thong tin ho so cap phep gplvs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QlvtThongTinHoSoCapPhepGplvImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QlvtThongTinHoSoCapPhepGplvImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qlvt thong tin ho so cap phep gplv.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		QlvtThongTinHoSoCapPhepGplv qlvtThongTinHoSoCapPhepGplv) {
		EntityCacheUtil.removeResult(QlvtThongTinHoSoCapPhepGplvModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinHoSoCapPhepGplvImpl.class,
			qlvtThongTinHoSoCapPhepGplv.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<QlvtThongTinHoSoCapPhepGplv> qlvtThongTinHoSoCapPhepGplvs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QlvtThongTinHoSoCapPhepGplv qlvtThongTinHoSoCapPhepGplv : qlvtThongTinHoSoCapPhepGplvs) {
			EntityCacheUtil.removeResult(QlvtThongTinHoSoCapPhepGplvModelImpl.ENTITY_CACHE_ENABLED,
				QlvtThongTinHoSoCapPhepGplvImpl.class,
				qlvtThongTinHoSoCapPhepGplv.getPrimaryKey());
		}
	}

	/**
	 * Creates a new qlvt thong tin ho so cap phep gplv with the primary key. Does not add the qlvt thong tin ho so cap phep gplv to the database.
	 *
	 * @param id the primary key for the new qlvt thong tin ho so cap phep gplv
	 * @return the new qlvt thong tin ho so cap phep gplv
	 */
	@Override
	public QlvtThongTinHoSoCapPhepGplv create(long id) {
		QlvtThongTinHoSoCapPhepGplv qlvtThongTinHoSoCapPhepGplv = new QlvtThongTinHoSoCapPhepGplvImpl();

		qlvtThongTinHoSoCapPhepGplv.setNew(true);
		qlvtThongTinHoSoCapPhepGplv.setPrimaryKey(id);

		return qlvtThongTinHoSoCapPhepGplv;
	}

	/**
	 * Removes the qlvt thong tin ho so cap phep gplv with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the qlvt thong tin ho so cap phep gplv
	 * @return the qlvt thong tin ho so cap phep gplv that was removed
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtThongTinHoSoCapPhepGplvException if a qlvt thong tin ho so cap phep gplv with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSoCapPhepGplv remove(long id)
		throws NoSuchQlvtThongTinHoSoCapPhepGplvException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the qlvt thong tin ho so cap phep gplv with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qlvt thong tin ho so cap phep gplv
	 * @return the qlvt thong tin ho so cap phep gplv that was removed
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtThongTinHoSoCapPhepGplvException if a qlvt thong tin ho so cap phep gplv with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSoCapPhepGplv remove(Serializable primaryKey)
		throws NoSuchQlvtThongTinHoSoCapPhepGplvException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QlvtThongTinHoSoCapPhepGplv qlvtThongTinHoSoCapPhepGplv = (QlvtThongTinHoSoCapPhepGplv)session.get(QlvtThongTinHoSoCapPhepGplvImpl.class,
					primaryKey);

			if (qlvtThongTinHoSoCapPhepGplv == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQlvtThongTinHoSoCapPhepGplvException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtThongTinHoSoCapPhepGplv);
		}
		catch (NoSuchQlvtThongTinHoSoCapPhepGplvException nsee) {
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
	protected QlvtThongTinHoSoCapPhepGplv removeImpl(
		QlvtThongTinHoSoCapPhepGplv qlvtThongTinHoSoCapPhepGplv)
		throws SystemException {
		qlvtThongTinHoSoCapPhepGplv = toUnwrappedModel(qlvtThongTinHoSoCapPhepGplv);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtThongTinHoSoCapPhepGplv)) {
				qlvtThongTinHoSoCapPhepGplv = (QlvtThongTinHoSoCapPhepGplv)session.get(QlvtThongTinHoSoCapPhepGplvImpl.class,
						qlvtThongTinHoSoCapPhepGplv.getPrimaryKeyObj());
			}

			if (qlvtThongTinHoSoCapPhepGplv != null) {
				session.delete(qlvtThongTinHoSoCapPhepGplv);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtThongTinHoSoCapPhepGplv != null) {
			clearCache(qlvtThongTinHoSoCapPhepGplv);
		}

		return qlvtThongTinHoSoCapPhepGplv;
	}

	@Override
	public QlvtThongTinHoSoCapPhepGplv updateImpl(
		vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoCapPhepGplv qlvtThongTinHoSoCapPhepGplv)
		throws SystemException {
		qlvtThongTinHoSoCapPhepGplv = toUnwrappedModel(qlvtThongTinHoSoCapPhepGplv);

		boolean isNew = qlvtThongTinHoSoCapPhepGplv.isNew();

		Session session = null;

		try {
			session = openSession();

			if (qlvtThongTinHoSoCapPhepGplv.isNew()) {
				session.save(qlvtThongTinHoSoCapPhepGplv);

				qlvtThongTinHoSoCapPhepGplv.setNew(false);
			}
			else {
				session.merge(qlvtThongTinHoSoCapPhepGplv);
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

		EntityCacheUtil.putResult(QlvtThongTinHoSoCapPhepGplvModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinHoSoCapPhepGplvImpl.class,
			qlvtThongTinHoSoCapPhepGplv.getPrimaryKey(),
			qlvtThongTinHoSoCapPhepGplv);

		return qlvtThongTinHoSoCapPhepGplv;
	}

	protected QlvtThongTinHoSoCapPhepGplv toUnwrappedModel(
		QlvtThongTinHoSoCapPhepGplv qlvtThongTinHoSoCapPhepGplv) {
		if (qlvtThongTinHoSoCapPhepGplv instanceof QlvtThongTinHoSoCapPhepGplvImpl) {
			return qlvtThongTinHoSoCapPhepGplv;
		}

		QlvtThongTinHoSoCapPhepGplvImpl qlvtThongTinHoSoCapPhepGplvImpl = new QlvtThongTinHoSoCapPhepGplvImpl();

		qlvtThongTinHoSoCapPhepGplvImpl.setNew(qlvtThongTinHoSoCapPhepGplv.isNew());
		qlvtThongTinHoSoCapPhepGplvImpl.setPrimaryKey(qlvtThongTinHoSoCapPhepGplv.getPrimaryKey());

		qlvtThongTinHoSoCapPhepGplvImpl.setId(qlvtThongTinHoSoCapPhepGplv.getId());
		qlvtThongTinHoSoCapPhepGplvImpl.setThongtinhosoId(qlvtThongTinHoSoCapPhepGplv.getThongtinhosoId());
		qlvtThongTinHoSoCapPhepGplvImpl.setCapphepGplienvanId(qlvtThongTinHoSoCapPhepGplv.getCapphepGplienvanId());

		return qlvtThongTinHoSoCapPhepGplvImpl;
	}

	/**
	 * Returns the qlvt thong tin ho so cap phep gplv with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt thong tin ho so cap phep gplv
	 * @return the qlvt thong tin ho so cap phep gplv
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtThongTinHoSoCapPhepGplvException if a qlvt thong tin ho so cap phep gplv with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSoCapPhepGplv findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQlvtThongTinHoSoCapPhepGplvException, SystemException {
		QlvtThongTinHoSoCapPhepGplv qlvtThongTinHoSoCapPhepGplv = fetchByPrimaryKey(primaryKey);

		if (qlvtThongTinHoSoCapPhepGplv == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQlvtThongTinHoSoCapPhepGplvException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtThongTinHoSoCapPhepGplv;
	}

	/**
	 * Returns the qlvt thong tin ho so cap phep gplv with the primary key or throws a {@link vn.dtt.duongbo.dao.lienvan.NoSuchQlvtThongTinHoSoCapPhepGplvException} if it could not be found.
	 *
	 * @param id the primary key of the qlvt thong tin ho so cap phep gplv
	 * @return the qlvt thong tin ho so cap phep gplv
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtThongTinHoSoCapPhepGplvException if a qlvt thong tin ho so cap phep gplv with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSoCapPhepGplv findByPrimaryKey(long id)
		throws NoSuchQlvtThongTinHoSoCapPhepGplvException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the qlvt thong tin ho so cap phep gplv with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt thong tin ho so cap phep gplv
	 * @return the qlvt thong tin ho so cap phep gplv, or <code>null</code> if a qlvt thong tin ho so cap phep gplv with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSoCapPhepGplv fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		QlvtThongTinHoSoCapPhepGplv qlvtThongTinHoSoCapPhepGplv = (QlvtThongTinHoSoCapPhepGplv)EntityCacheUtil.getResult(QlvtThongTinHoSoCapPhepGplvModelImpl.ENTITY_CACHE_ENABLED,
				QlvtThongTinHoSoCapPhepGplvImpl.class, primaryKey);

		if (qlvtThongTinHoSoCapPhepGplv == _nullQlvtThongTinHoSoCapPhepGplv) {
			return null;
		}

		if (qlvtThongTinHoSoCapPhepGplv == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtThongTinHoSoCapPhepGplv = (QlvtThongTinHoSoCapPhepGplv)session.get(QlvtThongTinHoSoCapPhepGplvImpl.class,
						primaryKey);

				if (qlvtThongTinHoSoCapPhepGplv != null) {
					cacheResult(qlvtThongTinHoSoCapPhepGplv);
				}
				else {
					EntityCacheUtil.putResult(QlvtThongTinHoSoCapPhepGplvModelImpl.ENTITY_CACHE_ENABLED,
						QlvtThongTinHoSoCapPhepGplvImpl.class, primaryKey,
						_nullQlvtThongTinHoSoCapPhepGplv);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QlvtThongTinHoSoCapPhepGplvModelImpl.ENTITY_CACHE_ENABLED,
					QlvtThongTinHoSoCapPhepGplvImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtThongTinHoSoCapPhepGplv;
	}

	/**
	 * Returns the qlvt thong tin ho so cap phep gplv with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the qlvt thong tin ho so cap phep gplv
	 * @return the qlvt thong tin ho so cap phep gplv, or <code>null</code> if a qlvt thong tin ho so cap phep gplv with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSoCapPhepGplv fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the qlvt thong tin ho so cap phep gplvs.
	 *
	 * @return the qlvt thong tin ho so cap phep gplvs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtThongTinHoSoCapPhepGplv> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt thong tin ho so cap phep gplvs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtThongTinHoSoCapPhepGplvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt thong tin ho so cap phep gplvs
	 * @param end the upper bound of the range of qlvt thong tin ho so cap phep gplvs (not inclusive)
	 * @return the range of qlvt thong tin ho so cap phep gplvs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtThongTinHoSoCapPhepGplv> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt thong tin ho so cap phep gplvs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtThongTinHoSoCapPhepGplvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt thong tin ho so cap phep gplvs
	 * @param end the upper bound of the range of qlvt thong tin ho so cap phep gplvs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qlvt thong tin ho so cap phep gplvs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtThongTinHoSoCapPhepGplv> findAll(int start, int end,
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

		List<QlvtThongTinHoSoCapPhepGplv> list = (List<QlvtThongTinHoSoCapPhepGplv>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTTHONGTINHOSOCAPPHEPGPLV);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTTHONGTINHOSOCAPPHEPGPLV;

				if (pagination) {
					sql = sql.concat(QlvtThongTinHoSoCapPhepGplvModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QlvtThongTinHoSoCapPhepGplv>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtThongTinHoSoCapPhepGplv>(list);
				}
				else {
					list = (List<QlvtThongTinHoSoCapPhepGplv>)QueryUtil.list(q,
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
	 * Removes all the qlvt thong tin ho so cap phep gplvs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QlvtThongTinHoSoCapPhepGplv qlvtThongTinHoSoCapPhepGplv : findAll()) {
			remove(qlvtThongTinHoSoCapPhepGplv);
		}
	}

	/**
	 * Returns the number of qlvt thong tin ho so cap phep gplvs.
	 *
	 * @return the number of qlvt thong tin ho so cap phep gplvs
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

				Query q = session.createQuery(_SQL_COUNT_QLVTTHONGTINHOSOCAPPHEPGPLV);

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
	 * Initializes the qlvt thong tin ho so cap phep gplv persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoCapPhepGplv")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QlvtThongTinHoSoCapPhepGplv>> listenersList = new ArrayList<ModelListener<QlvtThongTinHoSoCapPhepGplv>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QlvtThongTinHoSoCapPhepGplv>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QlvtThongTinHoSoCapPhepGplvImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTTHONGTINHOSOCAPPHEPGPLV = "SELECT qlvtThongTinHoSoCapPhepGplv FROM QlvtThongTinHoSoCapPhepGplv qlvtThongTinHoSoCapPhepGplv";
	private static final String _SQL_COUNT_QLVTTHONGTINHOSOCAPPHEPGPLV = "SELECT COUNT(qlvtThongTinHoSoCapPhepGplv) FROM QlvtThongTinHoSoCapPhepGplv qlvtThongTinHoSoCapPhepGplv";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtThongTinHoSoCapPhepGplv.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QlvtThongTinHoSoCapPhepGplv exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QlvtThongTinHoSoCapPhepGplvPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "thongtinhosoId", "capphepGplienvanId"
			});
	private static QlvtThongTinHoSoCapPhepGplv _nullQlvtThongTinHoSoCapPhepGplv = new QlvtThongTinHoSoCapPhepGplvImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QlvtThongTinHoSoCapPhepGplv> toCacheModel() {
				return _nullQlvtThongTinHoSoCapPhepGplvCacheModel;
			}
		};

	private static CacheModel<QlvtThongTinHoSoCapPhepGplv> _nullQlvtThongTinHoSoCapPhepGplvCacheModel =
		new CacheModel<QlvtThongTinHoSoCapPhepGplv>() {
			@Override
			public QlvtThongTinHoSoCapPhepGplv toEntityModel() {
				return _nullQlvtThongTinHoSoCapPhepGplv;
			}
		};
}