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

import vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtYeuCauBoXungException;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtYeuCauBoXung;
import vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtYeuCauBoXungImpl;
import vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtYeuCauBoXungModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the qlvt yeu cau bo xung service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanNc
 * @see QlvtYeuCauBoXungPersistence
 * @see QlvtYeuCauBoXungUtil
 * @generated
 */
public class QlvtYeuCauBoXungPersistenceImpl extends BasePersistenceImpl<QlvtYeuCauBoXung>
	implements QlvtYeuCauBoXungPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QlvtYeuCauBoXungUtil} to access the qlvt yeu cau bo xung persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QlvtYeuCauBoXungImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QlvtYeuCauBoXungModelImpl.ENTITY_CACHE_ENABLED,
			QlvtYeuCauBoXungModelImpl.FINDER_CACHE_ENABLED,
			QlvtYeuCauBoXungImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QlvtYeuCauBoXungModelImpl.ENTITY_CACHE_ENABLED,
			QlvtYeuCauBoXungModelImpl.FINDER_CACHE_ENABLED,
			QlvtYeuCauBoXungImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QlvtYeuCauBoXungModelImpl.ENTITY_CACHE_ENABLED,
			QlvtYeuCauBoXungModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public QlvtYeuCauBoXungPersistenceImpl() {
		setModelClass(QlvtYeuCauBoXung.class);
	}

	/**
	 * Caches the qlvt yeu cau bo xung in the entity cache if it is enabled.
	 *
	 * @param qlvtYeuCauBoXung the qlvt yeu cau bo xung
	 */
	@Override
	public void cacheResult(QlvtYeuCauBoXung qlvtYeuCauBoXung) {
		EntityCacheUtil.putResult(QlvtYeuCauBoXungModelImpl.ENTITY_CACHE_ENABLED,
			QlvtYeuCauBoXungImpl.class, qlvtYeuCauBoXung.getPrimaryKey(),
			qlvtYeuCauBoXung);

		qlvtYeuCauBoXung.resetOriginalValues();
	}

	/**
	 * Caches the qlvt yeu cau bo xungs in the entity cache if it is enabled.
	 *
	 * @param qlvtYeuCauBoXungs the qlvt yeu cau bo xungs
	 */
	@Override
	public void cacheResult(List<QlvtYeuCauBoXung> qlvtYeuCauBoXungs) {
		for (QlvtYeuCauBoXung qlvtYeuCauBoXung : qlvtYeuCauBoXungs) {
			if (EntityCacheUtil.getResult(
						QlvtYeuCauBoXungModelImpl.ENTITY_CACHE_ENABLED,
						QlvtYeuCauBoXungImpl.class,
						qlvtYeuCauBoXung.getPrimaryKey()) == null) {
				cacheResult(qlvtYeuCauBoXung);
			}
			else {
				qlvtYeuCauBoXung.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qlvt yeu cau bo xungs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QlvtYeuCauBoXungImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QlvtYeuCauBoXungImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qlvt yeu cau bo xung.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QlvtYeuCauBoXung qlvtYeuCauBoXung) {
		EntityCacheUtil.removeResult(QlvtYeuCauBoXungModelImpl.ENTITY_CACHE_ENABLED,
			QlvtYeuCauBoXungImpl.class, qlvtYeuCauBoXung.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<QlvtYeuCauBoXung> qlvtYeuCauBoXungs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QlvtYeuCauBoXung qlvtYeuCauBoXung : qlvtYeuCauBoXungs) {
			EntityCacheUtil.removeResult(QlvtYeuCauBoXungModelImpl.ENTITY_CACHE_ENABLED,
				QlvtYeuCauBoXungImpl.class, qlvtYeuCauBoXung.getPrimaryKey());
		}
	}

	/**
	 * Creates a new qlvt yeu cau bo xung with the primary key. Does not add the qlvt yeu cau bo xung to the database.
	 *
	 * @param id the primary key for the new qlvt yeu cau bo xung
	 * @return the new qlvt yeu cau bo xung
	 */
	@Override
	public QlvtYeuCauBoXung create(long id) {
		QlvtYeuCauBoXung qlvtYeuCauBoXung = new QlvtYeuCauBoXungImpl();

		qlvtYeuCauBoXung.setNew(true);
		qlvtYeuCauBoXung.setPrimaryKey(id);

		return qlvtYeuCauBoXung;
	}

	/**
	 * Removes the qlvt yeu cau bo xung with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the qlvt yeu cau bo xung
	 * @return the qlvt yeu cau bo xung that was removed
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtYeuCauBoXungException if a qlvt yeu cau bo xung with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtYeuCauBoXung remove(long id)
		throws NoSuchQlvtYeuCauBoXungException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the qlvt yeu cau bo xung with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qlvt yeu cau bo xung
	 * @return the qlvt yeu cau bo xung that was removed
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtYeuCauBoXungException if a qlvt yeu cau bo xung with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtYeuCauBoXung remove(Serializable primaryKey)
		throws NoSuchQlvtYeuCauBoXungException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QlvtYeuCauBoXung qlvtYeuCauBoXung = (QlvtYeuCauBoXung)session.get(QlvtYeuCauBoXungImpl.class,
					primaryKey);

			if (qlvtYeuCauBoXung == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQlvtYeuCauBoXungException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtYeuCauBoXung);
		}
		catch (NoSuchQlvtYeuCauBoXungException nsee) {
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
	protected QlvtYeuCauBoXung removeImpl(QlvtYeuCauBoXung qlvtYeuCauBoXung)
		throws SystemException {
		qlvtYeuCauBoXung = toUnwrappedModel(qlvtYeuCauBoXung);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtYeuCauBoXung)) {
				qlvtYeuCauBoXung = (QlvtYeuCauBoXung)session.get(QlvtYeuCauBoXungImpl.class,
						qlvtYeuCauBoXung.getPrimaryKeyObj());
			}

			if (qlvtYeuCauBoXung != null) {
				session.delete(qlvtYeuCauBoXung);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtYeuCauBoXung != null) {
			clearCache(qlvtYeuCauBoXung);
		}

		return qlvtYeuCauBoXung;
	}

	@Override
	public QlvtYeuCauBoXung updateImpl(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtYeuCauBoXung qlvtYeuCauBoXung)
		throws SystemException {
		qlvtYeuCauBoXung = toUnwrappedModel(qlvtYeuCauBoXung);

		boolean isNew = qlvtYeuCauBoXung.isNew();

		Session session = null;

		try {
			session = openSession();

			if (qlvtYeuCauBoXung.isNew()) {
				session.save(qlvtYeuCauBoXung);

				qlvtYeuCauBoXung.setNew(false);
			}
			else {
				session.merge(qlvtYeuCauBoXung);
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

		EntityCacheUtil.putResult(QlvtYeuCauBoXungModelImpl.ENTITY_CACHE_ENABLED,
			QlvtYeuCauBoXungImpl.class, qlvtYeuCauBoXung.getPrimaryKey(),
			qlvtYeuCauBoXung);

		return qlvtYeuCauBoXung;
	}

	protected QlvtYeuCauBoXung toUnwrappedModel(
		QlvtYeuCauBoXung qlvtYeuCauBoXung) {
		if (qlvtYeuCauBoXung instanceof QlvtYeuCauBoXungImpl) {
			return qlvtYeuCauBoXung;
		}

		QlvtYeuCauBoXungImpl qlvtYeuCauBoXungImpl = new QlvtYeuCauBoXungImpl();

		qlvtYeuCauBoXungImpl.setNew(qlvtYeuCauBoXung.isNew());
		qlvtYeuCauBoXungImpl.setPrimaryKey(qlvtYeuCauBoXung.getPrimaryKey());

		qlvtYeuCauBoXungImpl.setId(qlvtYeuCauBoXung.getId());
		qlvtYeuCauBoXungImpl.setNoiDung(qlvtYeuCauBoXung.getNoiDung());
		qlvtYeuCauBoXungImpl.setThongTinXuLyId(qlvtYeuCauBoXung.getThongTinXuLyId());
		qlvtYeuCauBoXungImpl.setSoCongVan(qlvtYeuCauBoXung.getSoCongVan());
		qlvtYeuCauBoXungImpl.setNgayCongVan(qlvtYeuCauBoXung.getNgayCongVan());
		qlvtYeuCauBoXungImpl.setFileID(qlvtYeuCauBoXung.getFileID());

		return qlvtYeuCauBoXungImpl;
	}

	/**
	 * Returns the qlvt yeu cau bo xung with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt yeu cau bo xung
	 * @return the qlvt yeu cau bo xung
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtYeuCauBoXungException if a qlvt yeu cau bo xung with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtYeuCauBoXung findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQlvtYeuCauBoXungException, SystemException {
		QlvtYeuCauBoXung qlvtYeuCauBoXung = fetchByPrimaryKey(primaryKey);

		if (qlvtYeuCauBoXung == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQlvtYeuCauBoXungException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtYeuCauBoXung;
	}

	/**
	 * Returns the qlvt yeu cau bo xung with the primary key or throws a {@link vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtYeuCauBoXungException} if it could not be found.
	 *
	 * @param id the primary key of the qlvt yeu cau bo xung
	 * @return the qlvt yeu cau bo xung
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtYeuCauBoXungException if a qlvt yeu cau bo xung with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtYeuCauBoXung findByPrimaryKey(long id)
		throws NoSuchQlvtYeuCauBoXungException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the qlvt yeu cau bo xung with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt yeu cau bo xung
	 * @return the qlvt yeu cau bo xung, or <code>null</code> if a qlvt yeu cau bo xung with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtYeuCauBoXung fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QlvtYeuCauBoXung qlvtYeuCauBoXung = (QlvtYeuCauBoXung)EntityCacheUtil.getResult(QlvtYeuCauBoXungModelImpl.ENTITY_CACHE_ENABLED,
				QlvtYeuCauBoXungImpl.class, primaryKey);

		if (qlvtYeuCauBoXung == _nullQlvtYeuCauBoXung) {
			return null;
		}

		if (qlvtYeuCauBoXung == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtYeuCauBoXung = (QlvtYeuCauBoXung)session.get(QlvtYeuCauBoXungImpl.class,
						primaryKey);

				if (qlvtYeuCauBoXung != null) {
					cacheResult(qlvtYeuCauBoXung);
				}
				else {
					EntityCacheUtil.putResult(QlvtYeuCauBoXungModelImpl.ENTITY_CACHE_ENABLED,
						QlvtYeuCauBoXungImpl.class, primaryKey,
						_nullQlvtYeuCauBoXung);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QlvtYeuCauBoXungModelImpl.ENTITY_CACHE_ENABLED,
					QlvtYeuCauBoXungImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtYeuCauBoXung;
	}

	/**
	 * Returns the qlvt yeu cau bo xung with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the qlvt yeu cau bo xung
	 * @return the qlvt yeu cau bo xung, or <code>null</code> if a qlvt yeu cau bo xung with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtYeuCauBoXung fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the qlvt yeu cau bo xungs.
	 *
	 * @return the qlvt yeu cau bo xungs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtYeuCauBoXung> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt yeu cau bo xungs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtYeuCauBoXungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt yeu cau bo xungs
	 * @param end the upper bound of the range of qlvt yeu cau bo xungs (not inclusive)
	 * @return the range of qlvt yeu cau bo xungs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtYeuCauBoXung> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt yeu cau bo xungs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtYeuCauBoXungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt yeu cau bo xungs
	 * @param end the upper bound of the range of qlvt yeu cau bo xungs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qlvt yeu cau bo xungs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtYeuCauBoXung> findAll(int start, int end,
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

		List<QlvtYeuCauBoXung> list = (List<QlvtYeuCauBoXung>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTYEUCAUBOXUNG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTYEUCAUBOXUNG;

				if (pagination) {
					sql = sql.concat(QlvtYeuCauBoXungModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QlvtYeuCauBoXung>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtYeuCauBoXung>(list);
				}
				else {
					list = (List<QlvtYeuCauBoXung>)QueryUtil.list(q,
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
	 * Removes all the qlvt yeu cau bo xungs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QlvtYeuCauBoXung qlvtYeuCauBoXung : findAll()) {
			remove(qlvtYeuCauBoXung);
		}
	}

	/**
	 * Returns the number of qlvt yeu cau bo xungs.
	 *
	 * @return the number of qlvt yeu cau bo xungs
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

				Query q = session.createQuery(_SQL_COUNT_QLVTYEUCAUBOXUNG);

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
	 * Initializes the qlvt yeu cau bo xung persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.nghiepvu.model.QlvtYeuCauBoXung")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QlvtYeuCauBoXung>> listenersList = new ArrayList<ModelListener<QlvtYeuCauBoXung>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QlvtYeuCauBoXung>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QlvtYeuCauBoXungImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTYEUCAUBOXUNG = "SELECT qlvtYeuCauBoXung FROM QlvtYeuCauBoXung qlvtYeuCauBoXung";
	private static final String _SQL_COUNT_QLVTYEUCAUBOXUNG = "SELECT COUNT(qlvtYeuCauBoXung) FROM QlvtYeuCauBoXung qlvtYeuCauBoXung";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtYeuCauBoXung.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QlvtYeuCauBoXung exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QlvtYeuCauBoXungPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"noiDung", "thongTinXuLyId", "soCongVan", "ngayCongVan",
				"fileID"
			});
	private static QlvtYeuCauBoXung _nullQlvtYeuCauBoXung = new QlvtYeuCauBoXungImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QlvtYeuCauBoXung> toCacheModel() {
				return _nullQlvtYeuCauBoXungCacheModel;
			}
		};

	private static CacheModel<QlvtYeuCauBoXung> _nullQlvtYeuCauBoXungCacheModel = new CacheModel<QlvtYeuCauBoXung>() {
			@Override
			public QlvtYeuCauBoXung toEntityModel() {
				return _nullQlvtYeuCauBoXung;
			}
		};
}