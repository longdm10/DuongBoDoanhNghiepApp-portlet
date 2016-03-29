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

package vn.dtt.duongbo.dao.nghiepvu.service.persistence;

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

import vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoNoiDiaException;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoNoiDia;
import vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinHoSoNoiDiaImpl;
import vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinHoSoNoiDiaModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the qlvt thong tin ho so noi dia service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanNc
 * @see QlvtThongTinHoSoNoiDiaPersistence
 * @see QlvtThongTinHoSoNoiDiaUtil
 * @generated
 */
public class QlvtThongTinHoSoNoiDiaPersistenceImpl extends BasePersistenceImpl<QlvtThongTinHoSoNoiDia>
	implements QlvtThongTinHoSoNoiDiaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QlvtThongTinHoSoNoiDiaUtil} to access the qlvt thong tin ho so noi dia persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QlvtThongTinHoSoNoiDiaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QlvtThongTinHoSoNoiDiaModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinHoSoNoiDiaModelImpl.FINDER_CACHE_ENABLED,
			QlvtThongTinHoSoNoiDiaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QlvtThongTinHoSoNoiDiaModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinHoSoNoiDiaModelImpl.FINDER_CACHE_ENABLED,
			QlvtThongTinHoSoNoiDiaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QlvtThongTinHoSoNoiDiaModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinHoSoNoiDiaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public QlvtThongTinHoSoNoiDiaPersistenceImpl() {
		setModelClass(QlvtThongTinHoSoNoiDia.class);
	}

	/**
	 * Caches the qlvt thong tin ho so noi dia in the entity cache if it is enabled.
	 *
	 * @param qlvtThongTinHoSoNoiDia the qlvt thong tin ho so noi dia
	 */
	@Override
	public void cacheResult(QlvtThongTinHoSoNoiDia qlvtThongTinHoSoNoiDia) {
		EntityCacheUtil.putResult(QlvtThongTinHoSoNoiDiaModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinHoSoNoiDiaImpl.class,
			qlvtThongTinHoSoNoiDia.getPrimaryKey(), qlvtThongTinHoSoNoiDia);

		qlvtThongTinHoSoNoiDia.resetOriginalValues();
	}

	/**
	 * Caches the qlvt thong tin ho so noi dias in the entity cache if it is enabled.
	 *
	 * @param qlvtThongTinHoSoNoiDias the qlvt thong tin ho so noi dias
	 */
	@Override
	public void cacheResult(
		List<QlvtThongTinHoSoNoiDia> qlvtThongTinHoSoNoiDias) {
		for (QlvtThongTinHoSoNoiDia qlvtThongTinHoSoNoiDia : qlvtThongTinHoSoNoiDias) {
			if (EntityCacheUtil.getResult(
						QlvtThongTinHoSoNoiDiaModelImpl.ENTITY_CACHE_ENABLED,
						QlvtThongTinHoSoNoiDiaImpl.class,
						qlvtThongTinHoSoNoiDia.getPrimaryKey()) == null) {
				cacheResult(qlvtThongTinHoSoNoiDia);
			}
			else {
				qlvtThongTinHoSoNoiDia.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qlvt thong tin ho so noi dias.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QlvtThongTinHoSoNoiDiaImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QlvtThongTinHoSoNoiDiaImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qlvt thong tin ho so noi dia.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QlvtThongTinHoSoNoiDia qlvtThongTinHoSoNoiDia) {
		EntityCacheUtil.removeResult(QlvtThongTinHoSoNoiDiaModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinHoSoNoiDiaImpl.class,
			qlvtThongTinHoSoNoiDia.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<QlvtThongTinHoSoNoiDia> qlvtThongTinHoSoNoiDias) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QlvtThongTinHoSoNoiDia qlvtThongTinHoSoNoiDia : qlvtThongTinHoSoNoiDias) {
			EntityCacheUtil.removeResult(QlvtThongTinHoSoNoiDiaModelImpl.ENTITY_CACHE_ENABLED,
				QlvtThongTinHoSoNoiDiaImpl.class,
				qlvtThongTinHoSoNoiDia.getPrimaryKey());
		}
	}

	/**
	 * Creates a new qlvt thong tin ho so noi dia with the primary key. Does not add the qlvt thong tin ho so noi dia to the database.
	 *
	 * @param id the primary key for the new qlvt thong tin ho so noi dia
	 * @return the new qlvt thong tin ho so noi dia
	 */
	@Override
	public QlvtThongTinHoSoNoiDia create(long id) {
		QlvtThongTinHoSoNoiDia qlvtThongTinHoSoNoiDia = new QlvtThongTinHoSoNoiDiaImpl();

		qlvtThongTinHoSoNoiDia.setNew(true);
		qlvtThongTinHoSoNoiDia.setPrimaryKey(id);

		return qlvtThongTinHoSoNoiDia;
	}

	/**
	 * Removes the qlvt thong tin ho so noi dia with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the qlvt thong tin ho so noi dia
	 * @return the qlvt thong tin ho so noi dia that was removed
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoNoiDiaException if a qlvt thong tin ho so noi dia with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSoNoiDia remove(long id)
		throws NoSuchQlvtThongTinHoSoNoiDiaException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the qlvt thong tin ho so noi dia with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qlvt thong tin ho so noi dia
	 * @return the qlvt thong tin ho so noi dia that was removed
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoNoiDiaException if a qlvt thong tin ho so noi dia with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSoNoiDia remove(Serializable primaryKey)
		throws NoSuchQlvtThongTinHoSoNoiDiaException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QlvtThongTinHoSoNoiDia qlvtThongTinHoSoNoiDia = (QlvtThongTinHoSoNoiDia)session.get(QlvtThongTinHoSoNoiDiaImpl.class,
					primaryKey);

			if (qlvtThongTinHoSoNoiDia == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQlvtThongTinHoSoNoiDiaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtThongTinHoSoNoiDia);
		}
		catch (NoSuchQlvtThongTinHoSoNoiDiaException nsee) {
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
	protected QlvtThongTinHoSoNoiDia removeImpl(
		QlvtThongTinHoSoNoiDia qlvtThongTinHoSoNoiDia)
		throws SystemException {
		qlvtThongTinHoSoNoiDia = toUnwrappedModel(qlvtThongTinHoSoNoiDia);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtThongTinHoSoNoiDia)) {
				qlvtThongTinHoSoNoiDia = (QlvtThongTinHoSoNoiDia)session.get(QlvtThongTinHoSoNoiDiaImpl.class,
						qlvtThongTinHoSoNoiDia.getPrimaryKeyObj());
			}

			if (qlvtThongTinHoSoNoiDia != null) {
				session.delete(qlvtThongTinHoSoNoiDia);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtThongTinHoSoNoiDia != null) {
			clearCache(qlvtThongTinHoSoNoiDia);
		}

		return qlvtThongTinHoSoNoiDia;
	}

	@Override
	public QlvtThongTinHoSoNoiDia updateImpl(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoNoiDia qlvtThongTinHoSoNoiDia)
		throws SystemException {
		qlvtThongTinHoSoNoiDia = toUnwrappedModel(qlvtThongTinHoSoNoiDia);

		boolean isNew = qlvtThongTinHoSoNoiDia.isNew();

		Session session = null;

		try {
			session = openSession();

			if (qlvtThongTinHoSoNoiDia.isNew()) {
				session.save(qlvtThongTinHoSoNoiDia);

				qlvtThongTinHoSoNoiDia.setNew(false);
			}
			else {
				session.merge(qlvtThongTinHoSoNoiDia);
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

		EntityCacheUtil.putResult(QlvtThongTinHoSoNoiDiaModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinHoSoNoiDiaImpl.class,
			qlvtThongTinHoSoNoiDia.getPrimaryKey(), qlvtThongTinHoSoNoiDia);

		return qlvtThongTinHoSoNoiDia;
	}

	protected QlvtThongTinHoSoNoiDia toUnwrappedModel(
		QlvtThongTinHoSoNoiDia qlvtThongTinHoSoNoiDia) {
		if (qlvtThongTinHoSoNoiDia instanceof QlvtThongTinHoSoNoiDiaImpl) {
			return qlvtThongTinHoSoNoiDia;
		}

		QlvtThongTinHoSoNoiDiaImpl qlvtThongTinHoSoNoiDiaImpl = new QlvtThongTinHoSoNoiDiaImpl();

		qlvtThongTinHoSoNoiDiaImpl.setNew(qlvtThongTinHoSoNoiDia.isNew());
		qlvtThongTinHoSoNoiDiaImpl.setPrimaryKey(qlvtThongTinHoSoNoiDia.getPrimaryKey());

		qlvtThongTinHoSoNoiDiaImpl.setId(qlvtThongTinHoSoNoiDia.getId());
		qlvtThongTinHoSoNoiDiaImpl.setThongtinHoSoId(qlvtThongTinHoSoNoiDia.getThongtinHoSoId());
		qlvtThongTinHoSoNoiDiaImpl.setNoiDiaId(qlvtThongTinHoSoNoiDia.getNoiDiaId());

		return qlvtThongTinHoSoNoiDiaImpl;
	}

	/**
	 * Returns the qlvt thong tin ho so noi dia with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt thong tin ho so noi dia
	 * @return the qlvt thong tin ho so noi dia
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoNoiDiaException if a qlvt thong tin ho so noi dia with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSoNoiDia findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQlvtThongTinHoSoNoiDiaException, SystemException {
		QlvtThongTinHoSoNoiDia qlvtThongTinHoSoNoiDia = fetchByPrimaryKey(primaryKey);

		if (qlvtThongTinHoSoNoiDia == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQlvtThongTinHoSoNoiDiaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtThongTinHoSoNoiDia;
	}

	/**
	 * Returns the qlvt thong tin ho so noi dia with the primary key or throws a {@link vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoNoiDiaException} if it could not be found.
	 *
	 * @param id the primary key of the qlvt thong tin ho so noi dia
	 * @return the qlvt thong tin ho so noi dia
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoNoiDiaException if a qlvt thong tin ho so noi dia with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSoNoiDia findByPrimaryKey(long id)
		throws NoSuchQlvtThongTinHoSoNoiDiaException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the qlvt thong tin ho so noi dia with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt thong tin ho so noi dia
	 * @return the qlvt thong tin ho so noi dia, or <code>null</code> if a qlvt thong tin ho so noi dia with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSoNoiDia fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QlvtThongTinHoSoNoiDia qlvtThongTinHoSoNoiDia = (QlvtThongTinHoSoNoiDia)EntityCacheUtil.getResult(QlvtThongTinHoSoNoiDiaModelImpl.ENTITY_CACHE_ENABLED,
				QlvtThongTinHoSoNoiDiaImpl.class, primaryKey);

		if (qlvtThongTinHoSoNoiDia == _nullQlvtThongTinHoSoNoiDia) {
			return null;
		}

		if (qlvtThongTinHoSoNoiDia == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtThongTinHoSoNoiDia = (QlvtThongTinHoSoNoiDia)session.get(QlvtThongTinHoSoNoiDiaImpl.class,
						primaryKey);

				if (qlvtThongTinHoSoNoiDia != null) {
					cacheResult(qlvtThongTinHoSoNoiDia);
				}
				else {
					EntityCacheUtil.putResult(QlvtThongTinHoSoNoiDiaModelImpl.ENTITY_CACHE_ENABLED,
						QlvtThongTinHoSoNoiDiaImpl.class, primaryKey,
						_nullQlvtThongTinHoSoNoiDia);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QlvtThongTinHoSoNoiDiaModelImpl.ENTITY_CACHE_ENABLED,
					QlvtThongTinHoSoNoiDiaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtThongTinHoSoNoiDia;
	}

	/**
	 * Returns the qlvt thong tin ho so noi dia with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the qlvt thong tin ho so noi dia
	 * @return the qlvt thong tin ho so noi dia, or <code>null</code> if a qlvt thong tin ho so noi dia with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSoNoiDia fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the qlvt thong tin ho so noi dias.
	 *
	 * @return the qlvt thong tin ho so noi dias
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtThongTinHoSoNoiDia> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt thong tin ho so noi dias.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinHoSoNoiDiaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt thong tin ho so noi dias
	 * @param end the upper bound of the range of qlvt thong tin ho so noi dias (not inclusive)
	 * @return the range of qlvt thong tin ho so noi dias
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtThongTinHoSoNoiDia> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt thong tin ho so noi dias.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinHoSoNoiDiaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt thong tin ho so noi dias
	 * @param end the upper bound of the range of qlvt thong tin ho so noi dias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qlvt thong tin ho so noi dias
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtThongTinHoSoNoiDia> findAll(int start, int end,
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

		List<QlvtThongTinHoSoNoiDia> list = (List<QlvtThongTinHoSoNoiDia>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTTHONGTINHOSONOIDIA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTTHONGTINHOSONOIDIA;

				if (pagination) {
					sql = sql.concat(QlvtThongTinHoSoNoiDiaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QlvtThongTinHoSoNoiDia>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtThongTinHoSoNoiDia>(list);
				}
				else {
					list = (List<QlvtThongTinHoSoNoiDia>)QueryUtil.list(q,
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
	 * Removes all the qlvt thong tin ho so noi dias from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QlvtThongTinHoSoNoiDia qlvtThongTinHoSoNoiDia : findAll()) {
			remove(qlvtThongTinHoSoNoiDia);
		}
	}

	/**
	 * Returns the number of qlvt thong tin ho so noi dias.
	 *
	 * @return the number of qlvt thong tin ho so noi dias
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

				Query q = session.createQuery(_SQL_COUNT_QLVTTHONGTINHOSONOIDIA);

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
	 * Initializes the qlvt thong tin ho so noi dia persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoNoiDia")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QlvtThongTinHoSoNoiDia>> listenersList = new ArrayList<ModelListener<QlvtThongTinHoSoNoiDia>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QlvtThongTinHoSoNoiDia>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QlvtThongTinHoSoNoiDiaImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTTHONGTINHOSONOIDIA = "SELECT qlvtThongTinHoSoNoiDia FROM QlvtThongTinHoSoNoiDia qlvtThongTinHoSoNoiDia";
	private static final String _SQL_COUNT_QLVTTHONGTINHOSONOIDIA = "SELECT COUNT(qlvtThongTinHoSoNoiDia) FROM QlvtThongTinHoSoNoiDia qlvtThongTinHoSoNoiDia";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtThongTinHoSoNoiDia.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QlvtThongTinHoSoNoiDia exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QlvtThongTinHoSoNoiDiaPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"thongtinHoSoId", "noiDiaId"
			});
	private static QlvtThongTinHoSoNoiDia _nullQlvtThongTinHoSoNoiDia = new QlvtThongTinHoSoNoiDiaImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QlvtThongTinHoSoNoiDia> toCacheModel() {
				return _nullQlvtThongTinHoSoNoiDiaCacheModel;
			}
		};

	private static CacheModel<QlvtThongTinHoSoNoiDia> _nullQlvtThongTinHoSoNoiDiaCacheModel =
		new CacheModel<QlvtThongTinHoSoNoiDia>() {
			@Override
			public QlvtThongTinHoSoNoiDia toEntityModel() {
				return _nullQlvtThongTinHoSoNoiDia;
			}
		};
}