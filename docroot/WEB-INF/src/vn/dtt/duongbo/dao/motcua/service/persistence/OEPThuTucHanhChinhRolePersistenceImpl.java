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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.duongbo.dao.motcua.NoSuchOEPThuTucHanhChinhRoleException;
import vn.dtt.duongbo.dao.motcua.model.OEPThuTucHanhChinhRole;
import vn.dtt.duongbo.dao.motcua.model.impl.OEPThuTucHanhChinhRoleImpl;
import vn.dtt.duongbo.dao.motcua.model.impl.OEPThuTucHanhChinhRoleModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the o e p thu tuc hanh chinh role service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see OEPThuTucHanhChinhRolePersistence
 * @see OEPThuTucHanhChinhRoleUtil
 * @generated
 */
public class OEPThuTucHanhChinhRolePersistenceImpl extends BasePersistenceImpl<OEPThuTucHanhChinhRole>
	implements OEPThuTucHanhChinhRolePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link OEPThuTucHanhChinhRoleUtil} to access the o e p thu tuc hanh chinh role persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = OEPThuTucHanhChinhRoleImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(OEPThuTucHanhChinhRoleModelImpl.ENTITY_CACHE_ENABLED,
			OEPThuTucHanhChinhRoleModelImpl.FINDER_CACHE_ENABLED,
			OEPThuTucHanhChinhRoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(OEPThuTucHanhChinhRoleModelImpl.ENTITY_CACHE_ENABLED,
			OEPThuTucHanhChinhRoleModelImpl.FINDER_CACHE_ENABLED,
			OEPThuTucHanhChinhRoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(OEPThuTucHanhChinhRoleModelImpl.ENTITY_CACHE_ENABLED,
			OEPThuTucHanhChinhRoleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public OEPThuTucHanhChinhRolePersistenceImpl() {
		setModelClass(OEPThuTucHanhChinhRole.class);
	}

	/**
	 * Caches the o e p thu tuc hanh chinh role in the entity cache if it is enabled.
	 *
	 * @param oepThuTucHanhChinhRole the o e p thu tuc hanh chinh role
	 */
	@Override
	public void cacheResult(OEPThuTucHanhChinhRole oepThuTucHanhChinhRole) {
		EntityCacheUtil.putResult(OEPThuTucHanhChinhRoleModelImpl.ENTITY_CACHE_ENABLED,
			OEPThuTucHanhChinhRoleImpl.class,
			oepThuTucHanhChinhRole.getPrimaryKey(), oepThuTucHanhChinhRole);

		oepThuTucHanhChinhRole.resetOriginalValues();
	}

	/**
	 * Caches the o e p thu tuc hanh chinh roles in the entity cache if it is enabled.
	 *
	 * @param oepThuTucHanhChinhRoles the o e p thu tuc hanh chinh roles
	 */
	@Override
	public void cacheResult(
		List<OEPThuTucHanhChinhRole> oepThuTucHanhChinhRoles) {
		for (OEPThuTucHanhChinhRole oepThuTucHanhChinhRole : oepThuTucHanhChinhRoles) {
			if (EntityCacheUtil.getResult(
						OEPThuTucHanhChinhRoleModelImpl.ENTITY_CACHE_ENABLED,
						OEPThuTucHanhChinhRoleImpl.class,
						oepThuTucHanhChinhRole.getPrimaryKey()) == null) {
				cacheResult(oepThuTucHanhChinhRole);
			}
			else {
				oepThuTucHanhChinhRole.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all o e p thu tuc hanh chinh roles.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(OEPThuTucHanhChinhRoleImpl.class.getName());
		}

		EntityCacheUtil.clearCache(OEPThuTucHanhChinhRoleImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the o e p thu tuc hanh chinh role.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OEPThuTucHanhChinhRole oepThuTucHanhChinhRole) {
		EntityCacheUtil.removeResult(OEPThuTucHanhChinhRoleModelImpl.ENTITY_CACHE_ENABLED,
			OEPThuTucHanhChinhRoleImpl.class,
			oepThuTucHanhChinhRole.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<OEPThuTucHanhChinhRole> oepThuTucHanhChinhRoles) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (OEPThuTucHanhChinhRole oepThuTucHanhChinhRole : oepThuTucHanhChinhRoles) {
			EntityCacheUtil.removeResult(OEPThuTucHanhChinhRoleModelImpl.ENTITY_CACHE_ENABLED,
				OEPThuTucHanhChinhRoleImpl.class,
				oepThuTucHanhChinhRole.getPrimaryKey());
		}
	}

	/**
	 * Creates a new o e p thu tuc hanh chinh role with the primary key. Does not add the o e p thu tuc hanh chinh role to the database.
	 *
	 * @param id the primary key for the new o e p thu tuc hanh chinh role
	 * @return the new o e p thu tuc hanh chinh role
	 */
	@Override
	public OEPThuTucHanhChinhRole create(int id) {
		OEPThuTucHanhChinhRole oepThuTucHanhChinhRole = new OEPThuTucHanhChinhRoleImpl();

		oepThuTucHanhChinhRole.setNew(true);
		oepThuTucHanhChinhRole.setPrimaryKey(id);

		return oepThuTucHanhChinhRole;
	}

	/**
	 * Removes the o e p thu tuc hanh chinh role with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the o e p thu tuc hanh chinh role
	 * @return the o e p thu tuc hanh chinh role that was removed
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPThuTucHanhChinhRoleException if a o e p thu tuc hanh chinh role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPThuTucHanhChinhRole remove(int id)
		throws NoSuchOEPThuTucHanhChinhRoleException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the o e p thu tuc hanh chinh role with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the o e p thu tuc hanh chinh role
	 * @return the o e p thu tuc hanh chinh role that was removed
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPThuTucHanhChinhRoleException if a o e p thu tuc hanh chinh role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPThuTucHanhChinhRole remove(Serializable primaryKey)
		throws NoSuchOEPThuTucHanhChinhRoleException, SystemException {
		Session session = null;

		try {
			session = openSession();

			OEPThuTucHanhChinhRole oepThuTucHanhChinhRole = (OEPThuTucHanhChinhRole)session.get(OEPThuTucHanhChinhRoleImpl.class,
					primaryKey);

			if (oepThuTucHanhChinhRole == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOEPThuTucHanhChinhRoleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(oepThuTucHanhChinhRole);
		}
		catch (NoSuchOEPThuTucHanhChinhRoleException nsee) {
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
	protected OEPThuTucHanhChinhRole removeImpl(
		OEPThuTucHanhChinhRole oepThuTucHanhChinhRole)
		throws SystemException {
		oepThuTucHanhChinhRole = toUnwrappedModel(oepThuTucHanhChinhRole);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(oepThuTucHanhChinhRole)) {
				oepThuTucHanhChinhRole = (OEPThuTucHanhChinhRole)session.get(OEPThuTucHanhChinhRoleImpl.class,
						oepThuTucHanhChinhRole.getPrimaryKeyObj());
			}

			if (oepThuTucHanhChinhRole != null) {
				session.delete(oepThuTucHanhChinhRole);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (oepThuTucHanhChinhRole != null) {
			clearCache(oepThuTucHanhChinhRole);
		}

		return oepThuTucHanhChinhRole;
	}

	@Override
	public OEPThuTucHanhChinhRole updateImpl(
		vn.dtt.duongbo.dao.motcua.model.OEPThuTucHanhChinhRole oepThuTucHanhChinhRole)
		throws SystemException {
		oepThuTucHanhChinhRole = toUnwrappedModel(oepThuTucHanhChinhRole);

		boolean isNew = oepThuTucHanhChinhRole.isNew();

		Session session = null;

		try {
			session = openSession();

			if (oepThuTucHanhChinhRole.isNew()) {
				session.save(oepThuTucHanhChinhRole);

				oepThuTucHanhChinhRole.setNew(false);
			}
			else {
				session.merge(oepThuTucHanhChinhRole);
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

		EntityCacheUtil.putResult(OEPThuTucHanhChinhRoleModelImpl.ENTITY_CACHE_ENABLED,
			OEPThuTucHanhChinhRoleImpl.class,
			oepThuTucHanhChinhRole.getPrimaryKey(), oepThuTucHanhChinhRole);

		return oepThuTucHanhChinhRole;
	}

	protected OEPThuTucHanhChinhRole toUnwrappedModel(
		OEPThuTucHanhChinhRole oepThuTucHanhChinhRole) {
		if (oepThuTucHanhChinhRole instanceof OEPThuTucHanhChinhRoleImpl) {
			return oepThuTucHanhChinhRole;
		}

		OEPThuTucHanhChinhRoleImpl oepThuTucHanhChinhRoleImpl = new OEPThuTucHanhChinhRoleImpl();

		oepThuTucHanhChinhRoleImpl.setNew(oepThuTucHanhChinhRole.isNew());
		oepThuTucHanhChinhRoleImpl.setPrimaryKey(oepThuTucHanhChinhRole.getPrimaryKey());

		oepThuTucHanhChinhRoleImpl.setId(oepThuTucHanhChinhRole.getId());
		oepThuTucHanhChinhRoleImpl.setThuTucHinhChinhId(oepThuTucHanhChinhRole.getThuTucHinhChinhId());
		oepThuTucHanhChinhRoleImpl.setVaiTroThucHien(oepThuTucHanhChinhRole.getVaiTroThucHien());

		return oepThuTucHanhChinhRoleImpl;
	}

	/**
	 * Returns the o e p thu tuc hanh chinh role with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the o e p thu tuc hanh chinh role
	 * @return the o e p thu tuc hanh chinh role
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPThuTucHanhChinhRoleException if a o e p thu tuc hanh chinh role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPThuTucHanhChinhRole findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOEPThuTucHanhChinhRoleException, SystemException {
		OEPThuTucHanhChinhRole oepThuTucHanhChinhRole = fetchByPrimaryKey(primaryKey);

		if (oepThuTucHanhChinhRole == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOEPThuTucHanhChinhRoleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return oepThuTucHanhChinhRole;
	}

	/**
	 * Returns the o e p thu tuc hanh chinh role with the primary key or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchOEPThuTucHanhChinhRoleException} if it could not be found.
	 *
	 * @param id the primary key of the o e p thu tuc hanh chinh role
	 * @return the o e p thu tuc hanh chinh role
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPThuTucHanhChinhRoleException if a o e p thu tuc hanh chinh role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPThuTucHanhChinhRole findByPrimaryKey(int id)
		throws NoSuchOEPThuTucHanhChinhRoleException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the o e p thu tuc hanh chinh role with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the o e p thu tuc hanh chinh role
	 * @return the o e p thu tuc hanh chinh role, or <code>null</code> if a o e p thu tuc hanh chinh role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPThuTucHanhChinhRole fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		OEPThuTucHanhChinhRole oepThuTucHanhChinhRole = (OEPThuTucHanhChinhRole)EntityCacheUtil.getResult(OEPThuTucHanhChinhRoleModelImpl.ENTITY_CACHE_ENABLED,
				OEPThuTucHanhChinhRoleImpl.class, primaryKey);

		if (oepThuTucHanhChinhRole == _nullOEPThuTucHanhChinhRole) {
			return null;
		}

		if (oepThuTucHanhChinhRole == null) {
			Session session = null;

			try {
				session = openSession();

				oepThuTucHanhChinhRole = (OEPThuTucHanhChinhRole)session.get(OEPThuTucHanhChinhRoleImpl.class,
						primaryKey);

				if (oepThuTucHanhChinhRole != null) {
					cacheResult(oepThuTucHanhChinhRole);
				}
				else {
					EntityCacheUtil.putResult(OEPThuTucHanhChinhRoleModelImpl.ENTITY_CACHE_ENABLED,
						OEPThuTucHanhChinhRoleImpl.class, primaryKey,
						_nullOEPThuTucHanhChinhRole);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(OEPThuTucHanhChinhRoleModelImpl.ENTITY_CACHE_ENABLED,
					OEPThuTucHanhChinhRoleImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return oepThuTucHanhChinhRole;
	}

	/**
	 * Returns the o e p thu tuc hanh chinh role with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the o e p thu tuc hanh chinh role
	 * @return the o e p thu tuc hanh chinh role, or <code>null</code> if a o e p thu tuc hanh chinh role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPThuTucHanhChinhRole fetchByPrimaryKey(int id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the o e p thu tuc hanh chinh roles.
	 *
	 * @return the o e p thu tuc hanh chinh roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OEPThuTucHanhChinhRole> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the o e p thu tuc hanh chinh roles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPThuTucHanhChinhRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of o e p thu tuc hanh chinh roles
	 * @param end the upper bound of the range of o e p thu tuc hanh chinh roles (not inclusive)
	 * @return the range of o e p thu tuc hanh chinh roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OEPThuTucHanhChinhRole> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the o e p thu tuc hanh chinh roles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPThuTucHanhChinhRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of o e p thu tuc hanh chinh roles
	 * @param end the upper bound of the range of o e p thu tuc hanh chinh roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of o e p thu tuc hanh chinh roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OEPThuTucHanhChinhRole> findAll(int start, int end,
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

		List<OEPThuTucHanhChinhRole> list = (List<OEPThuTucHanhChinhRole>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_OEPTHUTUCHANHCHINHROLE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_OEPTHUTUCHANHCHINHROLE;

				if (pagination) {
					sql = sql.concat(OEPThuTucHanhChinhRoleModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<OEPThuTucHanhChinhRole>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<OEPThuTucHanhChinhRole>(list);
				}
				else {
					list = (List<OEPThuTucHanhChinhRole>)QueryUtil.list(q,
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
	 * Removes all the o e p thu tuc hanh chinh roles from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (OEPThuTucHanhChinhRole oepThuTucHanhChinhRole : findAll()) {
			remove(oepThuTucHanhChinhRole);
		}
	}

	/**
	 * Returns the number of o e p thu tuc hanh chinh roles.
	 *
	 * @return the number of o e p thu tuc hanh chinh roles
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

				Query q = session.createQuery(_SQL_COUNT_OEPTHUTUCHANHCHINHROLE);

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
	 * Initializes the o e p thu tuc hanh chinh role persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.motcua.model.OEPThuTucHanhChinhRole")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<OEPThuTucHanhChinhRole>> listenersList = new ArrayList<ModelListener<OEPThuTucHanhChinhRole>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<OEPThuTucHanhChinhRole>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(OEPThuTucHanhChinhRoleImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_OEPTHUTUCHANHCHINHROLE = "SELECT oepThuTucHanhChinhRole FROM OEPThuTucHanhChinhRole oepThuTucHanhChinhRole";
	private static final String _SQL_COUNT_OEPTHUTUCHANHCHINHROLE = "SELECT COUNT(oepThuTucHanhChinhRole) FROM OEPThuTucHanhChinhRole oepThuTucHanhChinhRole";
	private static final String _ORDER_BY_ENTITY_ALIAS = "oepThuTucHanhChinhRole.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No OEPThuTucHanhChinhRole exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(OEPThuTucHanhChinhRolePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "thuTucHinhChinhId", "vaiTroThucHien"
			});
	private static OEPThuTucHanhChinhRole _nullOEPThuTucHanhChinhRole = new OEPThuTucHanhChinhRoleImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<OEPThuTucHanhChinhRole> toCacheModel() {
				return _nullOEPThuTucHanhChinhRoleCacheModel;
			}
		};

	private static CacheModel<OEPThuTucHanhChinhRole> _nullOEPThuTucHanhChinhRoleCacheModel =
		new CacheModel<OEPThuTucHanhChinhRole>() {
			@Override
			public OEPThuTucHanhChinhRole toEntityModel() {
				return _nullOEPThuTucHanhChinhRole;
			}
		};
}