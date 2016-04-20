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

import vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtKiemTraHoSoException;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtKiemTraHoSo;
import vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtKiemTraHoSoImpl;
import vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtKiemTraHoSoModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the qlvt kiem tra ho so service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanNc
 * @see QlvtKiemTraHoSoPersistence
 * @see QlvtKiemTraHoSoUtil
 * @generated
 */
public class QlvtKiemTraHoSoPersistenceImpl extends BasePersistenceImpl<QlvtKiemTraHoSo>
	implements QlvtKiemTraHoSoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QlvtKiemTraHoSoUtil} to access the qlvt kiem tra ho so persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QlvtKiemTraHoSoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QlvtKiemTraHoSoModelImpl.ENTITY_CACHE_ENABLED,
			QlvtKiemTraHoSoModelImpl.FINDER_CACHE_ENABLED,
			QlvtKiemTraHoSoImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QlvtKiemTraHoSoModelImpl.ENTITY_CACHE_ENABLED,
			QlvtKiemTraHoSoModelImpl.FINDER_CACHE_ENABLED,
			QlvtKiemTraHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QlvtKiemTraHoSoModelImpl.ENTITY_CACHE_ENABLED,
			QlvtKiemTraHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public QlvtKiemTraHoSoPersistenceImpl() {
		setModelClass(QlvtKiemTraHoSo.class);
	}

	/**
	 * Caches the qlvt kiem tra ho so in the entity cache if it is enabled.
	 *
	 * @param qlvtKiemTraHoSo the qlvt kiem tra ho so
	 */
	@Override
	public void cacheResult(QlvtKiemTraHoSo qlvtKiemTraHoSo) {
		EntityCacheUtil.putResult(QlvtKiemTraHoSoModelImpl.ENTITY_CACHE_ENABLED,
			QlvtKiemTraHoSoImpl.class, qlvtKiemTraHoSo.getPrimaryKey(),
			qlvtKiemTraHoSo);

		qlvtKiemTraHoSo.resetOriginalValues();
	}

	/**
	 * Caches the qlvt kiem tra ho sos in the entity cache if it is enabled.
	 *
	 * @param qlvtKiemTraHoSos the qlvt kiem tra ho sos
	 */
	@Override
	public void cacheResult(List<QlvtKiemTraHoSo> qlvtKiemTraHoSos) {
		for (QlvtKiemTraHoSo qlvtKiemTraHoSo : qlvtKiemTraHoSos) {
			if (EntityCacheUtil.getResult(
						QlvtKiemTraHoSoModelImpl.ENTITY_CACHE_ENABLED,
						QlvtKiemTraHoSoImpl.class,
						qlvtKiemTraHoSo.getPrimaryKey()) == null) {
				cacheResult(qlvtKiemTraHoSo);
			}
			else {
				qlvtKiemTraHoSo.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qlvt kiem tra ho sos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QlvtKiemTraHoSoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QlvtKiemTraHoSoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qlvt kiem tra ho so.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QlvtKiemTraHoSo qlvtKiemTraHoSo) {
		EntityCacheUtil.removeResult(QlvtKiemTraHoSoModelImpl.ENTITY_CACHE_ENABLED,
			QlvtKiemTraHoSoImpl.class, qlvtKiemTraHoSo.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<QlvtKiemTraHoSo> qlvtKiemTraHoSos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QlvtKiemTraHoSo qlvtKiemTraHoSo : qlvtKiemTraHoSos) {
			EntityCacheUtil.removeResult(QlvtKiemTraHoSoModelImpl.ENTITY_CACHE_ENABLED,
				QlvtKiemTraHoSoImpl.class, qlvtKiemTraHoSo.getPrimaryKey());
		}
	}

	/**
	 * Creates a new qlvt kiem tra ho so with the primary key. Does not add the qlvt kiem tra ho so to the database.
	 *
	 * @param id the primary key for the new qlvt kiem tra ho so
	 * @return the new qlvt kiem tra ho so
	 */
	@Override
	public QlvtKiemTraHoSo create(long id) {
		QlvtKiemTraHoSo qlvtKiemTraHoSo = new QlvtKiemTraHoSoImpl();

		qlvtKiemTraHoSo.setNew(true);
		qlvtKiemTraHoSo.setPrimaryKey(id);

		return qlvtKiemTraHoSo;
	}

	/**
	 * Removes the qlvt kiem tra ho so with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the qlvt kiem tra ho so
	 * @return the qlvt kiem tra ho so that was removed
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtKiemTraHoSoException if a qlvt kiem tra ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtKiemTraHoSo remove(long id)
		throws NoSuchQlvtKiemTraHoSoException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the qlvt kiem tra ho so with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qlvt kiem tra ho so
	 * @return the qlvt kiem tra ho so that was removed
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtKiemTraHoSoException if a qlvt kiem tra ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtKiemTraHoSo remove(Serializable primaryKey)
		throws NoSuchQlvtKiemTraHoSoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QlvtKiemTraHoSo qlvtKiemTraHoSo = (QlvtKiemTraHoSo)session.get(QlvtKiemTraHoSoImpl.class,
					primaryKey);

			if (qlvtKiemTraHoSo == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQlvtKiemTraHoSoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtKiemTraHoSo);
		}
		catch (NoSuchQlvtKiemTraHoSoException nsee) {
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
	protected QlvtKiemTraHoSo removeImpl(QlvtKiemTraHoSo qlvtKiemTraHoSo)
		throws SystemException {
		qlvtKiemTraHoSo = toUnwrappedModel(qlvtKiemTraHoSo);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtKiemTraHoSo)) {
				qlvtKiemTraHoSo = (QlvtKiemTraHoSo)session.get(QlvtKiemTraHoSoImpl.class,
						qlvtKiemTraHoSo.getPrimaryKeyObj());
			}

			if (qlvtKiemTraHoSo != null) {
				session.delete(qlvtKiemTraHoSo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtKiemTraHoSo != null) {
			clearCache(qlvtKiemTraHoSo);
		}

		return qlvtKiemTraHoSo;
	}

	@Override
	public QlvtKiemTraHoSo updateImpl(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtKiemTraHoSo qlvtKiemTraHoSo)
		throws SystemException {
		qlvtKiemTraHoSo = toUnwrappedModel(qlvtKiemTraHoSo);

		boolean isNew = qlvtKiemTraHoSo.isNew();

		Session session = null;

		try {
			session = openSession();

			if (qlvtKiemTraHoSo.isNew()) {
				session.save(qlvtKiemTraHoSo);

				qlvtKiemTraHoSo.setNew(false);
			}
			else {
				session.merge(qlvtKiemTraHoSo);
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

		EntityCacheUtil.putResult(QlvtKiemTraHoSoModelImpl.ENTITY_CACHE_ENABLED,
			QlvtKiemTraHoSoImpl.class, qlvtKiemTraHoSo.getPrimaryKey(),
			qlvtKiemTraHoSo);

		return qlvtKiemTraHoSo;
	}

	protected QlvtKiemTraHoSo toUnwrappedModel(QlvtKiemTraHoSo qlvtKiemTraHoSo) {
		if (qlvtKiemTraHoSo instanceof QlvtKiemTraHoSoImpl) {
			return qlvtKiemTraHoSo;
		}

		QlvtKiemTraHoSoImpl qlvtKiemTraHoSoImpl = new QlvtKiemTraHoSoImpl();

		qlvtKiemTraHoSoImpl.setNew(qlvtKiemTraHoSo.isNew());
		qlvtKiemTraHoSoImpl.setPrimaryKey(qlvtKiemTraHoSo.getPrimaryKey());

		qlvtKiemTraHoSoImpl.setId(qlvtKiemTraHoSo.getId());
		qlvtKiemTraHoSoImpl.setThongTinXuLyId(qlvtKiemTraHoSo.getThongTinXuLyId());
		qlvtKiemTraHoSoImpl.setIdNoiDungThamTra(qlvtKiemTraHoSo.getIdNoiDungThamTra());
		qlvtKiemTraHoSoImpl.setYKienThamTra(qlvtKiemTraHoSo.getYKienThamTra());
		qlvtKiemTraHoSoImpl.setKetQuaXuLy(qlvtKiemTraHoSo.getKetQuaXuLy());
		qlvtKiemTraHoSoImpl.setMaSoHoSo(qlvtKiemTraHoSo.getMaSoHoSo());
		qlvtKiemTraHoSoImpl.setYKienDanhGia(qlvtKiemTraHoSo.getYKienDanhGia());

		return qlvtKiemTraHoSoImpl;
	}

	/**
	 * Returns the qlvt kiem tra ho so with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt kiem tra ho so
	 * @return the qlvt kiem tra ho so
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtKiemTraHoSoException if a qlvt kiem tra ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtKiemTraHoSo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQlvtKiemTraHoSoException, SystemException {
		QlvtKiemTraHoSo qlvtKiemTraHoSo = fetchByPrimaryKey(primaryKey);

		if (qlvtKiemTraHoSo == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQlvtKiemTraHoSoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtKiemTraHoSo;
	}

	/**
	 * Returns the qlvt kiem tra ho so with the primary key or throws a {@link vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtKiemTraHoSoException} if it could not be found.
	 *
	 * @param id the primary key of the qlvt kiem tra ho so
	 * @return the qlvt kiem tra ho so
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtKiemTraHoSoException if a qlvt kiem tra ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtKiemTraHoSo findByPrimaryKey(long id)
		throws NoSuchQlvtKiemTraHoSoException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the qlvt kiem tra ho so with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt kiem tra ho so
	 * @return the qlvt kiem tra ho so, or <code>null</code> if a qlvt kiem tra ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtKiemTraHoSo fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QlvtKiemTraHoSo qlvtKiemTraHoSo = (QlvtKiemTraHoSo)EntityCacheUtil.getResult(QlvtKiemTraHoSoModelImpl.ENTITY_CACHE_ENABLED,
				QlvtKiemTraHoSoImpl.class, primaryKey);

		if (qlvtKiemTraHoSo == _nullQlvtKiemTraHoSo) {
			return null;
		}

		if (qlvtKiemTraHoSo == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtKiemTraHoSo = (QlvtKiemTraHoSo)session.get(QlvtKiemTraHoSoImpl.class,
						primaryKey);

				if (qlvtKiemTraHoSo != null) {
					cacheResult(qlvtKiemTraHoSo);
				}
				else {
					EntityCacheUtil.putResult(QlvtKiemTraHoSoModelImpl.ENTITY_CACHE_ENABLED,
						QlvtKiemTraHoSoImpl.class, primaryKey,
						_nullQlvtKiemTraHoSo);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QlvtKiemTraHoSoModelImpl.ENTITY_CACHE_ENABLED,
					QlvtKiemTraHoSoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtKiemTraHoSo;
	}

	/**
	 * Returns the qlvt kiem tra ho so with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the qlvt kiem tra ho so
	 * @return the qlvt kiem tra ho so, or <code>null</code> if a qlvt kiem tra ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtKiemTraHoSo fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the qlvt kiem tra ho sos.
	 *
	 * @return the qlvt kiem tra ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtKiemTraHoSo> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt kiem tra ho sos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtKiemTraHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt kiem tra ho sos
	 * @param end the upper bound of the range of qlvt kiem tra ho sos (not inclusive)
	 * @return the range of qlvt kiem tra ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtKiemTraHoSo> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt kiem tra ho sos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtKiemTraHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt kiem tra ho sos
	 * @param end the upper bound of the range of qlvt kiem tra ho sos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qlvt kiem tra ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtKiemTraHoSo> findAll(int start, int end,
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

		List<QlvtKiemTraHoSo> list = (List<QlvtKiemTraHoSo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTKIEMTRAHOSO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTKIEMTRAHOSO;

				if (pagination) {
					sql = sql.concat(QlvtKiemTraHoSoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QlvtKiemTraHoSo>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtKiemTraHoSo>(list);
				}
				else {
					list = (List<QlvtKiemTraHoSo>)QueryUtil.list(q,
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
	 * Removes all the qlvt kiem tra ho sos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QlvtKiemTraHoSo qlvtKiemTraHoSo : findAll()) {
			remove(qlvtKiemTraHoSo);
		}
	}

	/**
	 * Returns the number of qlvt kiem tra ho sos.
	 *
	 * @return the number of qlvt kiem tra ho sos
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

				Query q = session.createQuery(_SQL_COUNT_QLVTKIEMTRAHOSO);

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
	 * Initializes the qlvt kiem tra ho so persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.nghiepvu.model.QlvtKiemTraHoSo")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QlvtKiemTraHoSo>> listenersList = new ArrayList<ModelListener<QlvtKiemTraHoSo>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QlvtKiemTraHoSo>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QlvtKiemTraHoSoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTKIEMTRAHOSO = "SELECT qlvtKiemTraHoSo FROM QlvtKiemTraHoSo qlvtKiemTraHoSo";
	private static final String _SQL_COUNT_QLVTKIEMTRAHOSO = "SELECT COUNT(qlvtKiemTraHoSo) FROM QlvtKiemTraHoSo qlvtKiemTraHoSo";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtKiemTraHoSo.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QlvtKiemTraHoSo exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QlvtKiemTraHoSoPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"thongTinXuLyId", "idNoiDungThamTra", "yKienThamTra",
				"ketQuaXuLy", "maSoHoSo", "yKienDanhGia"
			});
	private static QlvtKiemTraHoSo _nullQlvtKiemTraHoSo = new QlvtKiemTraHoSoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QlvtKiemTraHoSo> toCacheModel() {
				return _nullQlvtKiemTraHoSoCacheModel;
			}
		};

	private static CacheModel<QlvtKiemTraHoSo> _nullQlvtKiemTraHoSoCacheModel = new CacheModel<QlvtKiemTraHoSo>() {
			@Override
			public QlvtKiemTraHoSo toEntityModel() {
				return _nullQlvtKiemTraHoSo;
			}
		};
}