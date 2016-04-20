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

import vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtJobposException;
import vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos;
import vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtJobposImpl;
import vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtJobposModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the o e p user mgt jobpos service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see OEPUserMgtJobposPersistence
 * @see OEPUserMgtJobposUtil
 * @generated
 */
public class OEPUserMgtJobposPersistenceImpl extends BasePersistenceImpl<OEPUserMgtJobpos>
	implements OEPUserMgtJobposPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link OEPUserMgtJobposUtil} to access the o e p user mgt jobpos persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = OEPUserMgtJobposImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(OEPUserMgtJobposModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtJobposModelImpl.FINDER_CACHE_ENABLED,
			OEPUserMgtJobposImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(OEPUserMgtJobposModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtJobposModelImpl.FINDER_CACHE_ENABLED,
			OEPUserMgtJobposImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(OEPUserMgtJobposModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtJobposModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public OEPUserMgtJobposPersistenceImpl() {
		setModelClass(OEPUserMgtJobpos.class);
	}

	/**
	 * Caches the o e p user mgt jobpos in the entity cache if it is enabled.
	 *
	 * @param oepUserMgtJobpos the o e p user mgt jobpos
	 */
	@Override
	public void cacheResult(OEPUserMgtJobpos oepUserMgtJobpos) {
		EntityCacheUtil.putResult(OEPUserMgtJobposModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtJobposImpl.class, oepUserMgtJobpos.getPrimaryKey(),
			oepUserMgtJobpos);

		oepUserMgtJobpos.resetOriginalValues();
	}

	/**
	 * Caches the o e p user mgt jobposes in the entity cache if it is enabled.
	 *
	 * @param oepUserMgtJobposes the o e p user mgt jobposes
	 */
	@Override
	public void cacheResult(List<OEPUserMgtJobpos> oepUserMgtJobposes) {
		for (OEPUserMgtJobpos oepUserMgtJobpos : oepUserMgtJobposes) {
			if (EntityCacheUtil.getResult(
						OEPUserMgtJobposModelImpl.ENTITY_CACHE_ENABLED,
						OEPUserMgtJobposImpl.class,
						oepUserMgtJobpos.getPrimaryKey()) == null) {
				cacheResult(oepUserMgtJobpos);
			}
			else {
				oepUserMgtJobpos.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all o e p user mgt jobposes.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(OEPUserMgtJobposImpl.class.getName());
		}

		EntityCacheUtil.clearCache(OEPUserMgtJobposImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the o e p user mgt jobpos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OEPUserMgtJobpos oepUserMgtJobpos) {
		EntityCacheUtil.removeResult(OEPUserMgtJobposModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtJobposImpl.class, oepUserMgtJobpos.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<OEPUserMgtJobpos> oepUserMgtJobposes) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (OEPUserMgtJobpos oepUserMgtJobpos : oepUserMgtJobposes) {
			EntityCacheUtil.removeResult(OEPUserMgtJobposModelImpl.ENTITY_CACHE_ENABLED,
				OEPUserMgtJobposImpl.class, oepUserMgtJobpos.getPrimaryKey());
		}
	}

	/**
	 * Creates a new o e p user mgt jobpos with the primary key. Does not add the o e p user mgt jobpos to the database.
	 *
	 * @param jobPosId the primary key for the new o e p user mgt jobpos
	 * @return the new o e p user mgt jobpos
	 */
	@Override
	public OEPUserMgtJobpos create(long jobPosId) {
		OEPUserMgtJobpos oepUserMgtJobpos = new OEPUserMgtJobposImpl();

		oepUserMgtJobpos.setNew(true);
		oepUserMgtJobpos.setPrimaryKey(jobPosId);

		return oepUserMgtJobpos;
	}

	/**
	 * Removes the o e p user mgt jobpos with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jobPosId the primary key of the o e p user mgt jobpos
	 * @return the o e p user mgt jobpos that was removed
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtJobposException if a o e p user mgt jobpos with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtJobpos remove(long jobPosId)
		throws NoSuchOEPUserMgtJobposException, SystemException {
		return remove((Serializable)jobPosId);
	}

	/**
	 * Removes the o e p user mgt jobpos with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the o e p user mgt jobpos
	 * @return the o e p user mgt jobpos that was removed
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtJobposException if a o e p user mgt jobpos with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtJobpos remove(Serializable primaryKey)
		throws NoSuchOEPUserMgtJobposException, SystemException {
		Session session = null;

		try {
			session = openSession();

			OEPUserMgtJobpos oepUserMgtJobpos = (OEPUserMgtJobpos)session.get(OEPUserMgtJobposImpl.class,
					primaryKey);

			if (oepUserMgtJobpos == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOEPUserMgtJobposException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(oepUserMgtJobpos);
		}
		catch (NoSuchOEPUserMgtJobposException nsee) {
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
	protected OEPUserMgtJobpos removeImpl(OEPUserMgtJobpos oepUserMgtJobpos)
		throws SystemException {
		oepUserMgtJobpos = toUnwrappedModel(oepUserMgtJobpos);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(oepUserMgtJobpos)) {
				oepUserMgtJobpos = (OEPUserMgtJobpos)session.get(OEPUserMgtJobposImpl.class,
						oepUserMgtJobpos.getPrimaryKeyObj());
			}

			if (oepUserMgtJobpos != null) {
				session.delete(oepUserMgtJobpos);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (oepUserMgtJobpos != null) {
			clearCache(oepUserMgtJobpos);
		}

		return oepUserMgtJobpos;
	}

	@Override
	public OEPUserMgtJobpos updateImpl(
		vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos oepUserMgtJobpos)
		throws SystemException {
		oepUserMgtJobpos = toUnwrappedModel(oepUserMgtJobpos);

		boolean isNew = oepUserMgtJobpos.isNew();

		Session session = null;

		try {
			session = openSession();

			if (oepUserMgtJobpos.isNew()) {
				session.save(oepUserMgtJobpos);

				oepUserMgtJobpos.setNew(false);
			}
			else {
				session.merge(oepUserMgtJobpos);
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

		EntityCacheUtil.putResult(OEPUserMgtJobposModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtJobposImpl.class, oepUserMgtJobpos.getPrimaryKey(),
			oepUserMgtJobpos);

		return oepUserMgtJobpos;
	}

	protected OEPUserMgtJobpos toUnwrappedModel(
		OEPUserMgtJobpos oepUserMgtJobpos) {
		if (oepUserMgtJobpos instanceof OEPUserMgtJobposImpl) {
			return oepUserMgtJobpos;
		}

		OEPUserMgtJobposImpl oepUserMgtJobposImpl = new OEPUserMgtJobposImpl();

		oepUserMgtJobposImpl.setNew(oepUserMgtJobpos.isNew());
		oepUserMgtJobposImpl.setPrimaryKey(oepUserMgtJobpos.getPrimaryKey());

		oepUserMgtJobposImpl.setJobPosId(oepUserMgtJobpos.getJobPosId());
		oepUserMgtJobposImpl.setUserId(oepUserMgtJobpos.getUserId());
		oepUserMgtJobposImpl.setGroupId(oepUserMgtJobpos.getGroupId());
		oepUserMgtJobposImpl.setCompanyId(oepUserMgtJobpos.getCompanyId());
		oepUserMgtJobposImpl.setCreateDate(oepUserMgtJobpos.getCreateDate());
		oepUserMgtJobposImpl.setModifiedDate(oepUserMgtJobpos.getModifiedDate());
		oepUserMgtJobposImpl.setTitle(oepUserMgtJobpos.getTitle());
		oepUserMgtJobposImpl.setPositionCatNo(oepUserMgtJobpos.getPositionCatNo());
		oepUserMgtJobposImpl.setWorkingUnitId(oepUserMgtJobpos.getWorkingUnitId());
		oepUserMgtJobposImpl.setLeader(oepUserMgtJobpos.getLeader());

		return oepUserMgtJobposImpl;
	}

	/**
	 * Returns the o e p user mgt jobpos with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the o e p user mgt jobpos
	 * @return the o e p user mgt jobpos
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtJobposException if a o e p user mgt jobpos with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtJobpos findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOEPUserMgtJobposException, SystemException {
		OEPUserMgtJobpos oepUserMgtJobpos = fetchByPrimaryKey(primaryKey);

		if (oepUserMgtJobpos == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOEPUserMgtJobposException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return oepUserMgtJobpos;
	}

	/**
	 * Returns the o e p user mgt jobpos with the primary key or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtJobposException} if it could not be found.
	 *
	 * @param jobPosId the primary key of the o e p user mgt jobpos
	 * @return the o e p user mgt jobpos
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtJobposException if a o e p user mgt jobpos with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtJobpos findByPrimaryKey(long jobPosId)
		throws NoSuchOEPUserMgtJobposException, SystemException {
		return findByPrimaryKey((Serializable)jobPosId);
	}

	/**
	 * Returns the o e p user mgt jobpos with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the o e p user mgt jobpos
	 * @return the o e p user mgt jobpos, or <code>null</code> if a o e p user mgt jobpos with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtJobpos fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		OEPUserMgtJobpos oepUserMgtJobpos = (OEPUserMgtJobpos)EntityCacheUtil.getResult(OEPUserMgtJobposModelImpl.ENTITY_CACHE_ENABLED,
				OEPUserMgtJobposImpl.class, primaryKey);

		if (oepUserMgtJobpos == _nullOEPUserMgtJobpos) {
			return null;
		}

		if (oepUserMgtJobpos == null) {
			Session session = null;

			try {
				session = openSession();

				oepUserMgtJobpos = (OEPUserMgtJobpos)session.get(OEPUserMgtJobposImpl.class,
						primaryKey);

				if (oepUserMgtJobpos != null) {
					cacheResult(oepUserMgtJobpos);
				}
				else {
					EntityCacheUtil.putResult(OEPUserMgtJobposModelImpl.ENTITY_CACHE_ENABLED,
						OEPUserMgtJobposImpl.class, primaryKey,
						_nullOEPUserMgtJobpos);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(OEPUserMgtJobposModelImpl.ENTITY_CACHE_ENABLED,
					OEPUserMgtJobposImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return oepUserMgtJobpos;
	}

	/**
	 * Returns the o e p user mgt jobpos with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jobPosId the primary key of the o e p user mgt jobpos
	 * @return the o e p user mgt jobpos, or <code>null</code> if a o e p user mgt jobpos with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtJobpos fetchByPrimaryKey(long jobPosId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)jobPosId);
	}

	/**
	 * Returns all the o e p user mgt jobposes.
	 *
	 * @return the o e p user mgt jobposes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OEPUserMgtJobpos> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the o e p user mgt jobposes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtJobposModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of o e p user mgt jobposes
	 * @param end the upper bound of the range of o e p user mgt jobposes (not inclusive)
	 * @return the range of o e p user mgt jobposes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OEPUserMgtJobpos> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the o e p user mgt jobposes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtJobposModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of o e p user mgt jobposes
	 * @param end the upper bound of the range of o e p user mgt jobposes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of o e p user mgt jobposes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OEPUserMgtJobpos> findAll(int start, int end,
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

		List<OEPUserMgtJobpos> list = (List<OEPUserMgtJobpos>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_OEPUSERMGTJOBPOS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_OEPUSERMGTJOBPOS;

				if (pagination) {
					sql = sql.concat(OEPUserMgtJobposModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<OEPUserMgtJobpos>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<OEPUserMgtJobpos>(list);
				}
				else {
					list = (List<OEPUserMgtJobpos>)QueryUtil.list(q,
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
	 * Removes all the o e p user mgt jobposes from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (OEPUserMgtJobpos oepUserMgtJobpos : findAll()) {
			remove(oepUserMgtJobpos);
		}
	}

	/**
	 * Returns the number of o e p user mgt jobposes.
	 *
	 * @return the number of o e p user mgt jobposes
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

				Query q = session.createQuery(_SQL_COUNT_OEPUSERMGTJOBPOS);

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
	 * Initializes the o e p user mgt jobpos persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<OEPUserMgtJobpos>> listenersList = new ArrayList<ModelListener<OEPUserMgtJobpos>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<OEPUserMgtJobpos>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(OEPUserMgtJobposImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_OEPUSERMGTJOBPOS = "SELECT oepUserMgtJobpos FROM OEPUserMgtJobpos oepUserMgtJobpos";
	private static final String _SQL_COUNT_OEPUSERMGTJOBPOS = "SELECT COUNT(oepUserMgtJobpos) FROM OEPUserMgtJobpos oepUserMgtJobpos";
	private static final String _ORDER_BY_ENTITY_ALIAS = "oepUserMgtJobpos.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No OEPUserMgtJobpos exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(OEPUserMgtJobposPersistenceImpl.class);
	private static OEPUserMgtJobpos _nullOEPUserMgtJobpos = new OEPUserMgtJobposImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<OEPUserMgtJobpos> toCacheModel() {
				return _nullOEPUserMgtJobposCacheModel;
			}
		};

	private static CacheModel<OEPUserMgtJobpos> _nullOEPUserMgtJobposCacheModel = new CacheModel<OEPUserMgtJobpos>() {
			@Override
			public OEPUserMgtJobpos toEntityModel() {
				return _nullOEPUserMgtJobpos;
			}
		};
}