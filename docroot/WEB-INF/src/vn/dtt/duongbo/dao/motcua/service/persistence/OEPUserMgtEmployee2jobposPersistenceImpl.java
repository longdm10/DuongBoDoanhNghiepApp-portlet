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

package vn.dtt.duongbo.dao.motcua.service.persistence;

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
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployee2jobposException;
import vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee2jobpos;
import vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtEmployee2jobposImpl;
import vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtEmployee2jobposModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the o e p user mgt employee2jobpos service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see OEPUserMgtEmployee2jobposPersistence
 * @see OEPUserMgtEmployee2jobposUtil
 * @generated
 */
public class OEPUserMgtEmployee2jobposPersistenceImpl
	extends BasePersistenceImpl<OEPUserMgtEmployee2jobpos>
	implements OEPUserMgtEmployee2jobposPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link OEPUserMgtEmployee2jobposUtil} to access the o e p user mgt employee2jobpos persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = OEPUserMgtEmployee2jobposImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(OEPUserMgtEmployee2jobposModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtEmployee2jobposModelImpl.FINDER_CACHE_ENABLED,
			OEPUserMgtEmployee2jobposImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(OEPUserMgtEmployee2jobposModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtEmployee2jobposModelImpl.FINDER_CACHE_ENABLED,
			OEPUserMgtEmployee2jobposImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(OEPUserMgtEmployee2jobposModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtEmployee2jobposModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public OEPUserMgtEmployee2jobposPersistenceImpl() {
		setModelClass(OEPUserMgtEmployee2jobpos.class);
	}

	/**
	 * Caches the o e p user mgt employee2jobpos in the entity cache if it is enabled.
	 *
	 * @param oepUserMgtEmployee2jobpos the o e p user mgt employee2jobpos
	 */
	@Override
	public void cacheResult(OEPUserMgtEmployee2jobpos oepUserMgtEmployee2jobpos) {
		EntityCacheUtil.putResult(OEPUserMgtEmployee2jobposModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtEmployee2jobposImpl.class,
			oepUserMgtEmployee2jobpos.getPrimaryKey(), oepUserMgtEmployee2jobpos);

		oepUserMgtEmployee2jobpos.resetOriginalValues();
	}

	/**
	 * Caches the o e p user mgt employee2jobposes in the entity cache if it is enabled.
	 *
	 * @param oepUserMgtEmployee2jobposes the o e p user mgt employee2jobposes
	 */
	@Override
	public void cacheResult(
		List<OEPUserMgtEmployee2jobpos> oepUserMgtEmployee2jobposes) {
		for (OEPUserMgtEmployee2jobpos oepUserMgtEmployee2jobpos : oepUserMgtEmployee2jobposes) {
			if (EntityCacheUtil.getResult(
						OEPUserMgtEmployee2jobposModelImpl.ENTITY_CACHE_ENABLED,
						OEPUserMgtEmployee2jobposImpl.class,
						oepUserMgtEmployee2jobpos.getPrimaryKey()) == null) {
				cacheResult(oepUserMgtEmployee2jobpos);
			}
			else {
				oepUserMgtEmployee2jobpos.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all o e p user mgt employee2jobposes.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(OEPUserMgtEmployee2jobposImpl.class.getName());
		}

		EntityCacheUtil.clearCache(OEPUserMgtEmployee2jobposImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the o e p user mgt employee2jobpos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OEPUserMgtEmployee2jobpos oepUserMgtEmployee2jobpos) {
		EntityCacheUtil.removeResult(OEPUserMgtEmployee2jobposModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtEmployee2jobposImpl.class,
			oepUserMgtEmployee2jobpos.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<OEPUserMgtEmployee2jobpos> oepUserMgtEmployee2jobposes) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (OEPUserMgtEmployee2jobpos oepUserMgtEmployee2jobpos : oepUserMgtEmployee2jobposes) {
			EntityCacheUtil.removeResult(OEPUserMgtEmployee2jobposModelImpl.ENTITY_CACHE_ENABLED,
				OEPUserMgtEmployee2jobposImpl.class,
				oepUserMgtEmployee2jobpos.getPrimaryKey());
		}
	}

	/**
	 * Creates a new o e p user mgt employee2jobpos with the primary key. Does not add the o e p user mgt employee2jobpos to the database.
	 *
	 * @param oepUserMgtEmployee2jobposPK the primary key for the new o e p user mgt employee2jobpos
	 * @return the new o e p user mgt employee2jobpos
	 */
	@Override
	public OEPUserMgtEmployee2jobpos create(
		OEPUserMgtEmployee2jobposPK oepUserMgtEmployee2jobposPK) {
		OEPUserMgtEmployee2jobpos oepUserMgtEmployee2jobpos = new OEPUserMgtEmployee2jobposImpl();

		oepUserMgtEmployee2jobpos.setNew(true);
		oepUserMgtEmployee2jobpos.setPrimaryKey(oepUserMgtEmployee2jobposPK);

		return oepUserMgtEmployee2jobpos;
	}

	/**
	 * Removes the o e p user mgt employee2jobpos with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param oepUserMgtEmployee2jobposPK the primary key of the o e p user mgt employee2jobpos
	 * @return the o e p user mgt employee2jobpos that was removed
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployee2jobposException if a o e p user mgt employee2jobpos with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtEmployee2jobpos remove(
		OEPUserMgtEmployee2jobposPK oepUserMgtEmployee2jobposPK)
		throws NoSuchOEPUserMgtEmployee2jobposException, SystemException {
		return remove((Serializable)oepUserMgtEmployee2jobposPK);
	}

	/**
	 * Removes the o e p user mgt employee2jobpos with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the o e p user mgt employee2jobpos
	 * @return the o e p user mgt employee2jobpos that was removed
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployee2jobposException if a o e p user mgt employee2jobpos with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtEmployee2jobpos remove(Serializable primaryKey)
		throws NoSuchOEPUserMgtEmployee2jobposException, SystemException {
		Session session = null;

		try {
			session = openSession();

			OEPUserMgtEmployee2jobpos oepUserMgtEmployee2jobpos = (OEPUserMgtEmployee2jobpos)session.get(OEPUserMgtEmployee2jobposImpl.class,
					primaryKey);

			if (oepUserMgtEmployee2jobpos == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOEPUserMgtEmployee2jobposException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(oepUserMgtEmployee2jobpos);
		}
		catch (NoSuchOEPUserMgtEmployee2jobposException nsee) {
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
	protected OEPUserMgtEmployee2jobpos removeImpl(
		OEPUserMgtEmployee2jobpos oepUserMgtEmployee2jobpos)
		throws SystemException {
		oepUserMgtEmployee2jobpos = toUnwrappedModel(oepUserMgtEmployee2jobpos);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(oepUserMgtEmployee2jobpos)) {
				oepUserMgtEmployee2jobpos = (OEPUserMgtEmployee2jobpos)session.get(OEPUserMgtEmployee2jobposImpl.class,
						oepUserMgtEmployee2jobpos.getPrimaryKeyObj());
			}

			if (oepUserMgtEmployee2jobpos != null) {
				session.delete(oepUserMgtEmployee2jobpos);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (oepUserMgtEmployee2jobpos != null) {
			clearCache(oepUserMgtEmployee2jobpos);
		}

		return oepUserMgtEmployee2jobpos;
	}

	@Override
	public OEPUserMgtEmployee2jobpos updateImpl(
		vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee2jobpos oepUserMgtEmployee2jobpos)
		throws SystemException {
		oepUserMgtEmployee2jobpos = toUnwrappedModel(oepUserMgtEmployee2jobpos);

		boolean isNew = oepUserMgtEmployee2jobpos.isNew();

		Session session = null;

		try {
			session = openSession();

			if (oepUserMgtEmployee2jobpos.isNew()) {
				session.save(oepUserMgtEmployee2jobpos);

				oepUserMgtEmployee2jobpos.setNew(false);
			}
			else {
				session.merge(oepUserMgtEmployee2jobpos);
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

		EntityCacheUtil.putResult(OEPUserMgtEmployee2jobposModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtEmployee2jobposImpl.class,
			oepUserMgtEmployee2jobpos.getPrimaryKey(), oepUserMgtEmployee2jobpos);

		return oepUserMgtEmployee2jobpos;
	}

	protected OEPUserMgtEmployee2jobpos toUnwrappedModel(
		OEPUserMgtEmployee2jobpos oepUserMgtEmployee2jobpos) {
		if (oepUserMgtEmployee2jobpos instanceof OEPUserMgtEmployee2jobposImpl) {
			return oepUserMgtEmployee2jobpos;
		}

		OEPUserMgtEmployee2jobposImpl oepUserMgtEmployee2jobposImpl = new OEPUserMgtEmployee2jobposImpl();

		oepUserMgtEmployee2jobposImpl.setNew(oepUserMgtEmployee2jobpos.isNew());
		oepUserMgtEmployee2jobposImpl.setPrimaryKey(oepUserMgtEmployee2jobpos.getPrimaryKey());

		oepUserMgtEmployee2jobposImpl.setEmployeeId(oepUserMgtEmployee2jobpos.getEmployeeId());
		oepUserMgtEmployee2jobposImpl.setJobPosId(oepUserMgtEmployee2jobpos.getJobPosId());

		return oepUserMgtEmployee2jobposImpl;
	}

	/**
	 * Returns the o e p user mgt employee2jobpos with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the o e p user mgt employee2jobpos
	 * @return the o e p user mgt employee2jobpos
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployee2jobposException if a o e p user mgt employee2jobpos with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtEmployee2jobpos findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOEPUserMgtEmployee2jobposException, SystemException {
		OEPUserMgtEmployee2jobpos oepUserMgtEmployee2jobpos = fetchByPrimaryKey(primaryKey);

		if (oepUserMgtEmployee2jobpos == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOEPUserMgtEmployee2jobposException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return oepUserMgtEmployee2jobpos;
	}

	/**
	 * Returns the o e p user mgt employee2jobpos with the primary key or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployee2jobposException} if it could not be found.
	 *
	 * @param oepUserMgtEmployee2jobposPK the primary key of the o e p user mgt employee2jobpos
	 * @return the o e p user mgt employee2jobpos
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployee2jobposException if a o e p user mgt employee2jobpos with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtEmployee2jobpos findByPrimaryKey(
		OEPUserMgtEmployee2jobposPK oepUserMgtEmployee2jobposPK)
		throws NoSuchOEPUserMgtEmployee2jobposException, SystemException {
		return findByPrimaryKey((Serializable)oepUserMgtEmployee2jobposPK);
	}

	/**
	 * Returns the o e p user mgt employee2jobpos with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the o e p user mgt employee2jobpos
	 * @return the o e p user mgt employee2jobpos, or <code>null</code> if a o e p user mgt employee2jobpos with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtEmployee2jobpos fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		OEPUserMgtEmployee2jobpos oepUserMgtEmployee2jobpos = (OEPUserMgtEmployee2jobpos)EntityCacheUtil.getResult(OEPUserMgtEmployee2jobposModelImpl.ENTITY_CACHE_ENABLED,
				OEPUserMgtEmployee2jobposImpl.class, primaryKey);

		if (oepUserMgtEmployee2jobpos == _nullOEPUserMgtEmployee2jobpos) {
			return null;
		}

		if (oepUserMgtEmployee2jobpos == null) {
			Session session = null;

			try {
				session = openSession();

				oepUserMgtEmployee2jobpos = (OEPUserMgtEmployee2jobpos)session.get(OEPUserMgtEmployee2jobposImpl.class,
						primaryKey);

				if (oepUserMgtEmployee2jobpos != null) {
					cacheResult(oepUserMgtEmployee2jobpos);
				}
				else {
					EntityCacheUtil.putResult(OEPUserMgtEmployee2jobposModelImpl.ENTITY_CACHE_ENABLED,
						OEPUserMgtEmployee2jobposImpl.class, primaryKey,
						_nullOEPUserMgtEmployee2jobpos);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(OEPUserMgtEmployee2jobposModelImpl.ENTITY_CACHE_ENABLED,
					OEPUserMgtEmployee2jobposImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return oepUserMgtEmployee2jobpos;
	}

	/**
	 * Returns the o e p user mgt employee2jobpos with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param oepUserMgtEmployee2jobposPK the primary key of the o e p user mgt employee2jobpos
	 * @return the o e p user mgt employee2jobpos, or <code>null</code> if a o e p user mgt employee2jobpos with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtEmployee2jobpos fetchByPrimaryKey(
		OEPUserMgtEmployee2jobposPK oepUserMgtEmployee2jobposPK)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)oepUserMgtEmployee2jobposPK);
	}

	/**
	 * Returns all the o e p user mgt employee2jobposes.
	 *
	 * @return the o e p user mgt employee2jobposes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OEPUserMgtEmployee2jobpos> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the o e p user mgt employee2jobposes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtEmployee2jobposModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of o e p user mgt employee2jobposes
	 * @param end the upper bound of the range of o e p user mgt employee2jobposes (not inclusive)
	 * @return the range of o e p user mgt employee2jobposes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OEPUserMgtEmployee2jobpos> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the o e p user mgt employee2jobposes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtEmployee2jobposModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of o e p user mgt employee2jobposes
	 * @param end the upper bound of the range of o e p user mgt employee2jobposes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of o e p user mgt employee2jobposes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OEPUserMgtEmployee2jobpos> findAll(int start, int end,
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

		List<OEPUserMgtEmployee2jobpos> list = (List<OEPUserMgtEmployee2jobpos>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_OEPUSERMGTEMPLOYEE2JOBPOS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_OEPUSERMGTEMPLOYEE2JOBPOS;

				if (pagination) {
					sql = sql.concat(OEPUserMgtEmployee2jobposModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<OEPUserMgtEmployee2jobpos>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<OEPUserMgtEmployee2jobpos>(list);
				}
				else {
					list = (List<OEPUserMgtEmployee2jobpos>)QueryUtil.list(q,
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
	 * Removes all the o e p user mgt employee2jobposes from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (OEPUserMgtEmployee2jobpos oepUserMgtEmployee2jobpos : findAll()) {
			remove(oepUserMgtEmployee2jobpos);
		}
	}

	/**
	 * Returns the number of o e p user mgt employee2jobposes.
	 *
	 * @return the number of o e p user mgt employee2jobposes
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

				Query q = session.createQuery(_SQL_COUNT_OEPUSERMGTEMPLOYEE2JOBPOS);

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

	/**
	 * Initializes the o e p user mgt employee2jobpos persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee2jobpos")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<OEPUserMgtEmployee2jobpos>> listenersList = new ArrayList<ModelListener<OEPUserMgtEmployee2jobpos>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<OEPUserMgtEmployee2jobpos>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(OEPUserMgtEmployee2jobposImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_OEPUSERMGTEMPLOYEE2JOBPOS = "SELECT oepUserMgtEmployee2jobpos FROM OEPUserMgtEmployee2jobpos oepUserMgtEmployee2jobpos";
	private static final String _SQL_COUNT_OEPUSERMGTEMPLOYEE2JOBPOS = "SELECT COUNT(oepUserMgtEmployee2jobpos) FROM OEPUserMgtEmployee2jobpos oepUserMgtEmployee2jobpos";
	private static final String _ORDER_BY_ENTITY_ALIAS = "oepUserMgtEmployee2jobpos.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No OEPUserMgtEmployee2jobpos exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(OEPUserMgtEmployee2jobposPersistenceImpl.class);
	private static OEPUserMgtEmployee2jobpos _nullOEPUserMgtEmployee2jobpos = new OEPUserMgtEmployee2jobposImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<OEPUserMgtEmployee2jobpos> toCacheModel() {
				return _nullOEPUserMgtEmployee2jobposCacheModel;
			}
		};

	private static CacheModel<OEPUserMgtEmployee2jobpos> _nullOEPUserMgtEmployee2jobposCacheModel =
		new CacheModel<OEPUserMgtEmployee2jobpos>() {
			@Override
			public OEPUserMgtEmployee2jobpos toEntityModel() {
				return _nullOEPUserMgtEmployee2jobpos;
			}
		};
}