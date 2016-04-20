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

import vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoQuocTeException;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoQuocTe;
import vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinHoSoQuocTeImpl;
import vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinHoSoQuocTeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the qlvt thong tin ho so quoc te service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanNc
 * @see QlvtThongTinHoSoQuocTePersistence
 * @see QlvtThongTinHoSoQuocTeUtil
 * @generated
 */
public class QlvtThongTinHoSoQuocTePersistenceImpl extends BasePersistenceImpl<QlvtThongTinHoSoQuocTe>
	implements QlvtThongTinHoSoQuocTePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QlvtThongTinHoSoQuocTeUtil} to access the qlvt thong tin ho so quoc te persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QlvtThongTinHoSoQuocTeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QlvtThongTinHoSoQuocTeModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinHoSoQuocTeModelImpl.FINDER_CACHE_ENABLED,
			QlvtThongTinHoSoQuocTeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QlvtThongTinHoSoQuocTeModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinHoSoQuocTeModelImpl.FINDER_CACHE_ENABLED,
			QlvtThongTinHoSoQuocTeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QlvtThongTinHoSoQuocTeModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinHoSoQuocTeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public QlvtThongTinHoSoQuocTePersistenceImpl() {
		setModelClass(QlvtThongTinHoSoQuocTe.class);
	}

	/**
	 * Caches the qlvt thong tin ho so quoc te in the entity cache if it is enabled.
	 *
	 * @param qlvtThongTinHoSoQuocTe the qlvt thong tin ho so quoc te
	 */
	@Override
	public void cacheResult(QlvtThongTinHoSoQuocTe qlvtThongTinHoSoQuocTe) {
		EntityCacheUtil.putResult(QlvtThongTinHoSoQuocTeModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinHoSoQuocTeImpl.class,
			qlvtThongTinHoSoQuocTe.getPrimaryKey(), qlvtThongTinHoSoQuocTe);

		qlvtThongTinHoSoQuocTe.resetOriginalValues();
	}

	/**
	 * Caches the qlvt thong tin ho so quoc tes in the entity cache if it is enabled.
	 *
	 * @param qlvtThongTinHoSoQuocTes the qlvt thong tin ho so quoc tes
	 */
	@Override
	public void cacheResult(
		List<QlvtThongTinHoSoQuocTe> qlvtThongTinHoSoQuocTes) {
		for (QlvtThongTinHoSoQuocTe qlvtThongTinHoSoQuocTe : qlvtThongTinHoSoQuocTes) {
			if (EntityCacheUtil.getResult(
						QlvtThongTinHoSoQuocTeModelImpl.ENTITY_CACHE_ENABLED,
						QlvtThongTinHoSoQuocTeImpl.class,
						qlvtThongTinHoSoQuocTe.getPrimaryKey()) == null) {
				cacheResult(qlvtThongTinHoSoQuocTe);
			}
			else {
				qlvtThongTinHoSoQuocTe.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qlvt thong tin ho so quoc tes.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QlvtThongTinHoSoQuocTeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QlvtThongTinHoSoQuocTeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qlvt thong tin ho so quoc te.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QlvtThongTinHoSoQuocTe qlvtThongTinHoSoQuocTe) {
		EntityCacheUtil.removeResult(QlvtThongTinHoSoQuocTeModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinHoSoQuocTeImpl.class,
			qlvtThongTinHoSoQuocTe.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<QlvtThongTinHoSoQuocTe> qlvtThongTinHoSoQuocTes) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QlvtThongTinHoSoQuocTe qlvtThongTinHoSoQuocTe : qlvtThongTinHoSoQuocTes) {
			EntityCacheUtil.removeResult(QlvtThongTinHoSoQuocTeModelImpl.ENTITY_CACHE_ENABLED,
				QlvtThongTinHoSoQuocTeImpl.class,
				qlvtThongTinHoSoQuocTe.getPrimaryKey());
		}
	}

	/**
	 * Creates a new qlvt thong tin ho so quoc te with the primary key. Does not add the qlvt thong tin ho so quoc te to the database.
	 *
	 * @param id the primary key for the new qlvt thong tin ho so quoc te
	 * @return the new qlvt thong tin ho so quoc te
	 */
	@Override
	public QlvtThongTinHoSoQuocTe create(long id) {
		QlvtThongTinHoSoQuocTe qlvtThongTinHoSoQuocTe = new QlvtThongTinHoSoQuocTeImpl();

		qlvtThongTinHoSoQuocTe.setNew(true);
		qlvtThongTinHoSoQuocTe.setPrimaryKey(id);

		return qlvtThongTinHoSoQuocTe;
	}

	/**
	 * Removes the qlvt thong tin ho so quoc te with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the qlvt thong tin ho so quoc te
	 * @return the qlvt thong tin ho so quoc te that was removed
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoQuocTeException if a qlvt thong tin ho so quoc te with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSoQuocTe remove(long id)
		throws NoSuchQlvtThongTinHoSoQuocTeException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the qlvt thong tin ho so quoc te with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qlvt thong tin ho so quoc te
	 * @return the qlvt thong tin ho so quoc te that was removed
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoQuocTeException if a qlvt thong tin ho so quoc te with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSoQuocTe remove(Serializable primaryKey)
		throws NoSuchQlvtThongTinHoSoQuocTeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QlvtThongTinHoSoQuocTe qlvtThongTinHoSoQuocTe = (QlvtThongTinHoSoQuocTe)session.get(QlvtThongTinHoSoQuocTeImpl.class,
					primaryKey);

			if (qlvtThongTinHoSoQuocTe == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQlvtThongTinHoSoQuocTeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtThongTinHoSoQuocTe);
		}
		catch (NoSuchQlvtThongTinHoSoQuocTeException nsee) {
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
	protected QlvtThongTinHoSoQuocTe removeImpl(
		QlvtThongTinHoSoQuocTe qlvtThongTinHoSoQuocTe)
		throws SystemException {
		qlvtThongTinHoSoQuocTe = toUnwrappedModel(qlvtThongTinHoSoQuocTe);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtThongTinHoSoQuocTe)) {
				qlvtThongTinHoSoQuocTe = (QlvtThongTinHoSoQuocTe)session.get(QlvtThongTinHoSoQuocTeImpl.class,
						qlvtThongTinHoSoQuocTe.getPrimaryKeyObj());
			}

			if (qlvtThongTinHoSoQuocTe != null) {
				session.delete(qlvtThongTinHoSoQuocTe);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtThongTinHoSoQuocTe != null) {
			clearCache(qlvtThongTinHoSoQuocTe);
		}

		return qlvtThongTinHoSoQuocTe;
	}

	@Override
	public QlvtThongTinHoSoQuocTe updateImpl(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoQuocTe qlvtThongTinHoSoQuocTe)
		throws SystemException {
		qlvtThongTinHoSoQuocTe = toUnwrappedModel(qlvtThongTinHoSoQuocTe);

		boolean isNew = qlvtThongTinHoSoQuocTe.isNew();

		Session session = null;

		try {
			session = openSession();

			if (qlvtThongTinHoSoQuocTe.isNew()) {
				session.save(qlvtThongTinHoSoQuocTe);

				qlvtThongTinHoSoQuocTe.setNew(false);
			}
			else {
				session.merge(qlvtThongTinHoSoQuocTe);
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

		EntityCacheUtil.putResult(QlvtThongTinHoSoQuocTeModelImpl.ENTITY_CACHE_ENABLED,
			QlvtThongTinHoSoQuocTeImpl.class,
			qlvtThongTinHoSoQuocTe.getPrimaryKey(), qlvtThongTinHoSoQuocTe);

		return qlvtThongTinHoSoQuocTe;
	}

	protected QlvtThongTinHoSoQuocTe toUnwrappedModel(
		QlvtThongTinHoSoQuocTe qlvtThongTinHoSoQuocTe) {
		if (qlvtThongTinHoSoQuocTe instanceof QlvtThongTinHoSoQuocTeImpl) {
			return qlvtThongTinHoSoQuocTe;
		}

		QlvtThongTinHoSoQuocTeImpl qlvtThongTinHoSoQuocTeImpl = new QlvtThongTinHoSoQuocTeImpl();

		qlvtThongTinHoSoQuocTeImpl.setNew(qlvtThongTinHoSoQuocTe.isNew());
		qlvtThongTinHoSoQuocTeImpl.setPrimaryKey(qlvtThongTinHoSoQuocTe.getPrimaryKey());

		qlvtThongTinHoSoQuocTeImpl.setId(qlvtThongTinHoSoQuocTe.getId());
		qlvtThongTinHoSoQuocTeImpl.setThongtinHoSoId(qlvtThongTinHoSoQuocTe.getThongtinHoSoId());
		qlvtThongTinHoSoQuocTeImpl.setGpkdvtID(qlvtThongTinHoSoQuocTe.getGpkdvtID());

		return qlvtThongTinHoSoQuocTeImpl;
	}

	/**
	 * Returns the qlvt thong tin ho so quoc te with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt thong tin ho so quoc te
	 * @return the qlvt thong tin ho so quoc te
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoQuocTeException if a qlvt thong tin ho so quoc te with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSoQuocTe findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQlvtThongTinHoSoQuocTeException, SystemException {
		QlvtThongTinHoSoQuocTe qlvtThongTinHoSoQuocTe = fetchByPrimaryKey(primaryKey);

		if (qlvtThongTinHoSoQuocTe == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQlvtThongTinHoSoQuocTeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtThongTinHoSoQuocTe;
	}

	/**
	 * Returns the qlvt thong tin ho so quoc te with the primary key or throws a {@link vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoQuocTeException} if it could not be found.
	 *
	 * @param id the primary key of the qlvt thong tin ho so quoc te
	 * @return the qlvt thong tin ho so quoc te
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoQuocTeException if a qlvt thong tin ho so quoc te with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSoQuocTe findByPrimaryKey(long id)
		throws NoSuchQlvtThongTinHoSoQuocTeException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the qlvt thong tin ho so quoc te with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt thong tin ho so quoc te
	 * @return the qlvt thong tin ho so quoc te, or <code>null</code> if a qlvt thong tin ho so quoc te with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSoQuocTe fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QlvtThongTinHoSoQuocTe qlvtThongTinHoSoQuocTe = (QlvtThongTinHoSoQuocTe)EntityCacheUtil.getResult(QlvtThongTinHoSoQuocTeModelImpl.ENTITY_CACHE_ENABLED,
				QlvtThongTinHoSoQuocTeImpl.class, primaryKey);

		if (qlvtThongTinHoSoQuocTe == _nullQlvtThongTinHoSoQuocTe) {
			return null;
		}

		if (qlvtThongTinHoSoQuocTe == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtThongTinHoSoQuocTe = (QlvtThongTinHoSoQuocTe)session.get(QlvtThongTinHoSoQuocTeImpl.class,
						primaryKey);

				if (qlvtThongTinHoSoQuocTe != null) {
					cacheResult(qlvtThongTinHoSoQuocTe);
				}
				else {
					EntityCacheUtil.putResult(QlvtThongTinHoSoQuocTeModelImpl.ENTITY_CACHE_ENABLED,
						QlvtThongTinHoSoQuocTeImpl.class, primaryKey,
						_nullQlvtThongTinHoSoQuocTe);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QlvtThongTinHoSoQuocTeModelImpl.ENTITY_CACHE_ENABLED,
					QlvtThongTinHoSoQuocTeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtThongTinHoSoQuocTe;
	}

	/**
	 * Returns the qlvt thong tin ho so quoc te with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the qlvt thong tin ho so quoc te
	 * @return the qlvt thong tin ho so quoc te, or <code>null</code> if a qlvt thong tin ho so quoc te with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtThongTinHoSoQuocTe fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the qlvt thong tin ho so quoc tes.
	 *
	 * @return the qlvt thong tin ho so quoc tes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtThongTinHoSoQuocTe> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt thong tin ho so quoc tes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinHoSoQuocTeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt thong tin ho so quoc tes
	 * @param end the upper bound of the range of qlvt thong tin ho so quoc tes (not inclusive)
	 * @return the range of qlvt thong tin ho so quoc tes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtThongTinHoSoQuocTe> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt thong tin ho so quoc tes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinHoSoQuocTeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt thong tin ho so quoc tes
	 * @param end the upper bound of the range of qlvt thong tin ho so quoc tes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qlvt thong tin ho so quoc tes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtThongTinHoSoQuocTe> findAll(int start, int end,
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

		List<QlvtThongTinHoSoQuocTe> list = (List<QlvtThongTinHoSoQuocTe>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTTHONGTINHOSOQUOCTE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTTHONGTINHOSOQUOCTE;

				if (pagination) {
					sql = sql.concat(QlvtThongTinHoSoQuocTeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QlvtThongTinHoSoQuocTe>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtThongTinHoSoQuocTe>(list);
				}
				else {
					list = (List<QlvtThongTinHoSoQuocTe>)QueryUtil.list(q,
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
	 * Removes all the qlvt thong tin ho so quoc tes from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QlvtThongTinHoSoQuocTe qlvtThongTinHoSoQuocTe : findAll()) {
			remove(qlvtThongTinHoSoQuocTe);
		}
	}

	/**
	 * Returns the number of qlvt thong tin ho so quoc tes.
	 *
	 * @return the number of qlvt thong tin ho so quoc tes
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

				Query q = session.createQuery(_SQL_COUNT_QLVTTHONGTINHOSOQUOCTE);

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
	 * Initializes the qlvt thong tin ho so quoc te persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoQuocTe")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QlvtThongTinHoSoQuocTe>> listenersList = new ArrayList<ModelListener<QlvtThongTinHoSoQuocTe>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QlvtThongTinHoSoQuocTe>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QlvtThongTinHoSoQuocTeImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTTHONGTINHOSOQUOCTE = "SELECT qlvtThongTinHoSoQuocTe FROM QlvtThongTinHoSoQuocTe qlvtThongTinHoSoQuocTe";
	private static final String _SQL_COUNT_QLVTTHONGTINHOSOQUOCTE = "SELECT COUNT(qlvtThongTinHoSoQuocTe) FROM QlvtThongTinHoSoQuocTe qlvtThongTinHoSoQuocTe";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtThongTinHoSoQuocTe.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QlvtThongTinHoSoQuocTe exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QlvtThongTinHoSoQuocTePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"thongtinHoSoId", "gpkdvtID"
			});
	private static QlvtThongTinHoSoQuocTe _nullQlvtThongTinHoSoQuocTe = new QlvtThongTinHoSoQuocTeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QlvtThongTinHoSoQuocTe> toCacheModel() {
				return _nullQlvtThongTinHoSoQuocTeCacheModel;
			}
		};

	private static CacheModel<QlvtThongTinHoSoQuocTe> _nullQlvtThongTinHoSoQuocTeCacheModel =
		new CacheModel<QlvtThongTinHoSoQuocTe>() {
			@Override
			public QlvtThongTinHoSoQuocTe toEntityModel() {
				return _nullQlvtThongTinHoSoQuocTe;
			}
		};
}