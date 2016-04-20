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

import vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtJobpos2roleException;
import vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos2role;
import vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtJobpos2roleImpl;
import vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtJobpos2roleModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the o e p user mgt jobpos2role service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see OEPUserMgtJobpos2rolePersistence
 * @see OEPUserMgtJobpos2roleUtil
 * @generated
 */
public class OEPUserMgtJobpos2rolePersistenceImpl extends BasePersistenceImpl<OEPUserMgtJobpos2role>
	implements OEPUserMgtJobpos2rolePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link OEPUserMgtJobpos2roleUtil} to access the o e p user mgt jobpos2role persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = OEPUserMgtJobpos2roleImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(OEPUserMgtJobpos2roleModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtJobpos2roleModelImpl.FINDER_CACHE_ENABLED,
			OEPUserMgtJobpos2roleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(OEPUserMgtJobpos2roleModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtJobpos2roleModelImpl.FINDER_CACHE_ENABLED,
			OEPUserMgtJobpos2roleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(OEPUserMgtJobpos2roleModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtJobpos2roleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public OEPUserMgtJobpos2rolePersistenceImpl() {
		setModelClass(OEPUserMgtJobpos2role.class);
	}

	/**
	 * Caches the o e p user mgt jobpos2role in the entity cache if it is enabled.
	 *
	 * @param oepUserMgtJobpos2role the o e p user mgt jobpos2role
	 */
	@Override
	public void cacheResult(OEPUserMgtJobpos2role oepUserMgtJobpos2role) {
		EntityCacheUtil.putResult(OEPUserMgtJobpos2roleModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtJobpos2roleImpl.class,
			oepUserMgtJobpos2role.getPrimaryKey(), oepUserMgtJobpos2role);

		oepUserMgtJobpos2role.resetOriginalValues();
	}

	/**
	 * Caches the o e p user mgt jobpos2roles in the entity cache if it is enabled.
	 *
	 * @param oepUserMgtJobpos2roles the o e p user mgt jobpos2roles
	 */
	@Override
	public void cacheResult(List<OEPUserMgtJobpos2role> oepUserMgtJobpos2roles) {
		for (OEPUserMgtJobpos2role oepUserMgtJobpos2role : oepUserMgtJobpos2roles) {
			if (EntityCacheUtil.getResult(
						OEPUserMgtJobpos2roleModelImpl.ENTITY_CACHE_ENABLED,
						OEPUserMgtJobpos2roleImpl.class,
						oepUserMgtJobpos2role.getPrimaryKey()) == null) {
				cacheResult(oepUserMgtJobpos2role);
			}
			else {
				oepUserMgtJobpos2role.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all o e p user mgt jobpos2roles.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(OEPUserMgtJobpos2roleImpl.class.getName());
		}

		EntityCacheUtil.clearCache(OEPUserMgtJobpos2roleImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the o e p user mgt jobpos2role.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OEPUserMgtJobpos2role oepUserMgtJobpos2role) {
		EntityCacheUtil.removeResult(OEPUserMgtJobpos2roleModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtJobpos2roleImpl.class,
			oepUserMgtJobpos2role.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<OEPUserMgtJobpos2role> oepUserMgtJobpos2roles) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (OEPUserMgtJobpos2role oepUserMgtJobpos2role : oepUserMgtJobpos2roles) {
			EntityCacheUtil.removeResult(OEPUserMgtJobpos2roleModelImpl.ENTITY_CACHE_ENABLED,
				OEPUserMgtJobpos2roleImpl.class,
				oepUserMgtJobpos2role.getPrimaryKey());
		}
	}

	/**
	 * Creates a new o e p user mgt jobpos2role with the primary key. Does not add the o e p user mgt jobpos2role to the database.
	 *
	 * @param oepUserMgtJobpos2rolePK the primary key for the new o e p user mgt jobpos2role
	 * @return the new o e p user mgt jobpos2role
	 */
	@Override
	public OEPUserMgtJobpos2role create(
		OEPUserMgtJobpos2rolePK oepUserMgtJobpos2rolePK) {
		OEPUserMgtJobpos2role oepUserMgtJobpos2role = new OEPUserMgtJobpos2roleImpl();

		oepUserMgtJobpos2role.setNew(true);
		oepUserMgtJobpos2role.setPrimaryKey(oepUserMgtJobpos2rolePK);

		return oepUserMgtJobpos2role;
	}

	/**
	 * Removes the o e p user mgt jobpos2role with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param oepUserMgtJobpos2rolePK the primary key of the o e p user mgt jobpos2role
	 * @return the o e p user mgt jobpos2role that was removed
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtJobpos2roleException if a o e p user mgt jobpos2role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtJobpos2role remove(
		OEPUserMgtJobpos2rolePK oepUserMgtJobpos2rolePK)
		throws NoSuchOEPUserMgtJobpos2roleException, SystemException {
		return remove((Serializable)oepUserMgtJobpos2rolePK);
	}

	/**
	 * Removes the o e p user mgt jobpos2role with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the o e p user mgt jobpos2role
	 * @return the o e p user mgt jobpos2role that was removed
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtJobpos2roleException if a o e p user mgt jobpos2role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtJobpos2role remove(Serializable primaryKey)
		throws NoSuchOEPUserMgtJobpos2roleException, SystemException {
		Session session = null;

		try {
			session = openSession();

			OEPUserMgtJobpos2role oepUserMgtJobpos2role = (OEPUserMgtJobpos2role)session.get(OEPUserMgtJobpos2roleImpl.class,
					primaryKey);

			if (oepUserMgtJobpos2role == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOEPUserMgtJobpos2roleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(oepUserMgtJobpos2role);
		}
		catch (NoSuchOEPUserMgtJobpos2roleException nsee) {
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
	protected OEPUserMgtJobpos2role removeImpl(
		OEPUserMgtJobpos2role oepUserMgtJobpos2role) throws SystemException {
		oepUserMgtJobpos2role = toUnwrappedModel(oepUserMgtJobpos2role);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(oepUserMgtJobpos2role)) {
				oepUserMgtJobpos2role = (OEPUserMgtJobpos2role)session.get(OEPUserMgtJobpos2roleImpl.class,
						oepUserMgtJobpos2role.getPrimaryKeyObj());
			}

			if (oepUserMgtJobpos2role != null) {
				session.delete(oepUserMgtJobpos2role);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (oepUserMgtJobpos2role != null) {
			clearCache(oepUserMgtJobpos2role);
		}

		return oepUserMgtJobpos2role;
	}

	@Override
	public OEPUserMgtJobpos2role updateImpl(
		vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos2role oepUserMgtJobpos2role)
		throws SystemException {
		oepUserMgtJobpos2role = toUnwrappedModel(oepUserMgtJobpos2role);

		boolean isNew = oepUserMgtJobpos2role.isNew();

		Session session = null;

		try {
			session = openSession();

			if (oepUserMgtJobpos2role.isNew()) {
				session.save(oepUserMgtJobpos2role);

				oepUserMgtJobpos2role.setNew(false);
			}
			else {
				session.merge(oepUserMgtJobpos2role);
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

		EntityCacheUtil.putResult(OEPUserMgtJobpos2roleModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtJobpos2roleImpl.class,
			oepUserMgtJobpos2role.getPrimaryKey(), oepUserMgtJobpos2role);

		return oepUserMgtJobpos2role;
	}

	protected OEPUserMgtJobpos2role toUnwrappedModel(
		OEPUserMgtJobpos2role oepUserMgtJobpos2role) {
		if (oepUserMgtJobpos2role instanceof OEPUserMgtJobpos2roleImpl) {
			return oepUserMgtJobpos2role;
		}

		OEPUserMgtJobpos2roleImpl oepUserMgtJobpos2roleImpl = new OEPUserMgtJobpos2roleImpl();

		oepUserMgtJobpos2roleImpl.setNew(oepUserMgtJobpos2role.isNew());
		oepUserMgtJobpos2roleImpl.setPrimaryKey(oepUserMgtJobpos2role.getPrimaryKey());

		oepUserMgtJobpos2roleImpl.setJobPosId(oepUserMgtJobpos2role.getJobPosId());
		oepUserMgtJobpos2roleImpl.setRoleId(oepUserMgtJobpos2role.getRoleId());

		return oepUserMgtJobpos2roleImpl;
	}

	/**
	 * Returns the o e p user mgt jobpos2role with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the o e p user mgt jobpos2role
	 * @return the o e p user mgt jobpos2role
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtJobpos2roleException if a o e p user mgt jobpos2role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtJobpos2role findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOEPUserMgtJobpos2roleException, SystemException {
		OEPUserMgtJobpos2role oepUserMgtJobpos2role = fetchByPrimaryKey(primaryKey);

		if (oepUserMgtJobpos2role == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOEPUserMgtJobpos2roleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return oepUserMgtJobpos2role;
	}

	/**
	 * Returns the o e p user mgt jobpos2role with the primary key or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtJobpos2roleException} if it could not be found.
	 *
	 * @param oepUserMgtJobpos2rolePK the primary key of the o e p user mgt jobpos2role
	 * @return the o e p user mgt jobpos2role
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtJobpos2roleException if a o e p user mgt jobpos2role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtJobpos2role findByPrimaryKey(
		OEPUserMgtJobpos2rolePK oepUserMgtJobpos2rolePK)
		throws NoSuchOEPUserMgtJobpos2roleException, SystemException {
		return findByPrimaryKey((Serializable)oepUserMgtJobpos2rolePK);
	}

	/**
	 * Returns the o e p user mgt jobpos2role with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the o e p user mgt jobpos2role
	 * @return the o e p user mgt jobpos2role, or <code>null</code> if a o e p user mgt jobpos2role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtJobpos2role fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		OEPUserMgtJobpos2role oepUserMgtJobpos2role = (OEPUserMgtJobpos2role)EntityCacheUtil.getResult(OEPUserMgtJobpos2roleModelImpl.ENTITY_CACHE_ENABLED,
				OEPUserMgtJobpos2roleImpl.class, primaryKey);

		if (oepUserMgtJobpos2role == _nullOEPUserMgtJobpos2role) {
			return null;
		}

		if (oepUserMgtJobpos2role == null) {
			Session session = null;

			try {
				session = openSession();

				oepUserMgtJobpos2role = (OEPUserMgtJobpos2role)session.get(OEPUserMgtJobpos2roleImpl.class,
						primaryKey);

				if (oepUserMgtJobpos2role != null) {
					cacheResult(oepUserMgtJobpos2role);
				}
				else {
					EntityCacheUtil.putResult(OEPUserMgtJobpos2roleModelImpl.ENTITY_CACHE_ENABLED,
						OEPUserMgtJobpos2roleImpl.class, primaryKey,
						_nullOEPUserMgtJobpos2role);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(OEPUserMgtJobpos2roleModelImpl.ENTITY_CACHE_ENABLED,
					OEPUserMgtJobpos2roleImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return oepUserMgtJobpos2role;
	}

	/**
	 * Returns the o e p user mgt jobpos2role with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param oepUserMgtJobpos2rolePK the primary key of the o e p user mgt jobpos2role
	 * @return the o e p user mgt jobpos2role, or <code>null</code> if a o e p user mgt jobpos2role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtJobpos2role fetchByPrimaryKey(
		OEPUserMgtJobpos2rolePK oepUserMgtJobpos2rolePK)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)oepUserMgtJobpos2rolePK);
	}

	/**
	 * Returns all the o e p user mgt jobpos2roles.
	 *
	 * @return the o e p user mgt jobpos2roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OEPUserMgtJobpos2role> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the o e p user mgt jobpos2roles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtJobpos2roleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of o e p user mgt jobpos2roles
	 * @param end the upper bound of the range of o e p user mgt jobpos2roles (not inclusive)
	 * @return the range of o e p user mgt jobpos2roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OEPUserMgtJobpos2role> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the o e p user mgt jobpos2roles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtJobpos2roleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of o e p user mgt jobpos2roles
	 * @param end the upper bound of the range of o e p user mgt jobpos2roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of o e p user mgt jobpos2roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OEPUserMgtJobpos2role> findAll(int start, int end,
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

		List<OEPUserMgtJobpos2role> list = (List<OEPUserMgtJobpos2role>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_OEPUSERMGTJOBPOS2ROLE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_OEPUSERMGTJOBPOS2ROLE;

				if (pagination) {
					sql = sql.concat(OEPUserMgtJobpos2roleModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<OEPUserMgtJobpos2role>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<OEPUserMgtJobpos2role>(list);
				}
				else {
					list = (List<OEPUserMgtJobpos2role>)QueryUtil.list(q,
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
	 * Removes all the o e p user mgt jobpos2roles from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (OEPUserMgtJobpos2role oepUserMgtJobpos2role : findAll()) {
			remove(oepUserMgtJobpos2role);
		}
	}

	/**
	 * Returns the number of o e p user mgt jobpos2roles.
	 *
	 * @return the number of o e p user mgt jobpos2roles
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

				Query q = session.createQuery(_SQL_COUNT_OEPUSERMGTJOBPOS2ROLE);

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
	 * Initializes the o e p user mgt jobpos2role persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos2role")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<OEPUserMgtJobpos2role>> listenersList = new ArrayList<ModelListener<OEPUserMgtJobpos2role>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<OEPUserMgtJobpos2role>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(OEPUserMgtJobpos2roleImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_OEPUSERMGTJOBPOS2ROLE = "SELECT oepUserMgtJobpos2role FROM OEPUserMgtJobpos2role oepUserMgtJobpos2role";
	private static final String _SQL_COUNT_OEPUSERMGTJOBPOS2ROLE = "SELECT COUNT(oepUserMgtJobpos2role) FROM OEPUserMgtJobpos2role oepUserMgtJobpos2role";
	private static final String _ORDER_BY_ENTITY_ALIAS = "oepUserMgtJobpos2role.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No OEPUserMgtJobpos2role exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(OEPUserMgtJobpos2rolePersistenceImpl.class);
	private static OEPUserMgtJobpos2role _nullOEPUserMgtJobpos2role = new OEPUserMgtJobpos2roleImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<OEPUserMgtJobpos2role> toCacheModel() {
				return _nullOEPUserMgtJobpos2roleCacheModel;
			}
		};

	private static CacheModel<OEPUserMgtJobpos2role> _nullOEPUserMgtJobpos2roleCacheModel =
		new CacheModel<OEPUserMgtJobpos2role>() {
			@Override
			public OEPUserMgtJobpos2role toEntityModel() {
				return _nullOEPUserMgtJobpos2role;
			}
		};
}