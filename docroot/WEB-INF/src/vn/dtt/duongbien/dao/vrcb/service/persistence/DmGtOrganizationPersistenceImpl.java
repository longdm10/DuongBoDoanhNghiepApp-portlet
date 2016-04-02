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

package vn.dtt.duongbien.dao.vrcb.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.duongbien.dao.vrcb.NoSuchDmGtOrganizationException;
import vn.dtt.duongbien.dao.vrcb.model.DmGtOrganization;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmGtOrganizationImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmGtOrganizationModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dm gt organization service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmGtOrganizationPersistence
 * @see DmGtOrganizationUtil
 * @generated
 */
public class DmGtOrganizationPersistenceImpl extends BasePersistenceImpl<DmGtOrganization>
	implements DmGtOrganizationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmGtOrganizationUtil} to access the dm gt organization persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmGtOrganizationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmGtOrganizationModelImpl.ENTITY_CACHE_ENABLED,
			DmGtOrganizationModelImpl.FINDER_CACHE_ENABLED,
			DmGtOrganizationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmGtOrganizationModelImpl.ENTITY_CACHE_ENABLED,
			DmGtOrganizationModelImpl.FINDER_CACHE_ENABLED,
			DmGtOrganizationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmGtOrganizationModelImpl.ENTITY_CACHE_ENABLED,
			DmGtOrganizationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_ORGANIZATIONCODE = new FinderPath(DmGtOrganizationModelImpl.ENTITY_CACHE_ENABLED,
			DmGtOrganizationModelImpl.FINDER_CACHE_ENABLED,
			DmGtOrganizationImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByOrganizationCode", new String[] { String.class.getName() },
			DmGtOrganizationModelImpl.ORGANIZATIONCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ORGANIZATIONCODE = new FinderPath(DmGtOrganizationModelImpl.ENTITY_CACHE_ENABLED,
			DmGtOrganizationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByOrganizationCode", new String[] { String.class.getName() });

	/**
	 * Returns the dm gt organization where organizationCode = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmGtOrganizationException} if it could not be found.
	 *
	 * @param organizationCode the organization code
	 * @return the matching dm gt organization
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtOrganizationException if a matching dm gt organization could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtOrganization findByOrganizationCode(String organizationCode)
		throws NoSuchDmGtOrganizationException, SystemException {
		DmGtOrganization dmGtOrganization = fetchByOrganizationCode(organizationCode);

		if (dmGtOrganization == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("organizationCode=");
			msg.append(organizationCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmGtOrganizationException(msg.toString());
		}

		return dmGtOrganization;
	}

	/**
	 * Returns the dm gt organization where organizationCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param organizationCode the organization code
	 * @return the matching dm gt organization, or <code>null</code> if a matching dm gt organization could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtOrganization fetchByOrganizationCode(String organizationCode)
		throws SystemException {
		return fetchByOrganizationCode(organizationCode, true);
	}

	/**
	 * Returns the dm gt organization where organizationCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param organizationCode the organization code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm gt organization, or <code>null</code> if a matching dm gt organization could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtOrganization fetchByOrganizationCode(String organizationCode,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { organizationCode };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_ORGANIZATIONCODE,
					finderArgs, this);
		}

		if (result instanceof DmGtOrganization) {
			DmGtOrganization dmGtOrganization = (DmGtOrganization)result;

			if (!Validator.equals(organizationCode,
						dmGtOrganization.getOrganizationCode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_DMGTORGANIZATION_WHERE);

			boolean bindOrganizationCode = false;

			if (organizationCode == null) {
				query.append(_FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_1);
			}
			else if (organizationCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_3);
			}
			else {
				bindOrganizationCode = true;

				query.append(_FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindOrganizationCode) {
					qPos.add(organizationCode);
				}

				List<DmGtOrganization> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ORGANIZATIONCODE,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DmGtOrganizationPersistenceImpl.fetchByOrganizationCode(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DmGtOrganization dmGtOrganization = list.get(0);

					result = dmGtOrganization;

					cacheResult(dmGtOrganization);

					if ((dmGtOrganization.getOrganizationCode() == null) ||
							!dmGtOrganization.getOrganizationCode()
												 .equals(organizationCode)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ORGANIZATIONCODE,
							finderArgs, dmGtOrganization);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ORGANIZATIONCODE,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (DmGtOrganization)result;
		}
	}

	/**
	 * Removes the dm gt organization where organizationCode = &#63; from the database.
	 *
	 * @param organizationCode the organization code
	 * @return the dm gt organization that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtOrganization removeByOrganizationCode(String organizationCode)
		throws NoSuchDmGtOrganizationException, SystemException {
		DmGtOrganization dmGtOrganization = findByOrganizationCode(organizationCode);

		return remove(dmGtOrganization);
	}

	/**
	 * Returns the number of dm gt organizations where organizationCode = &#63;.
	 *
	 * @param organizationCode the organization code
	 * @return the number of matching dm gt organizations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByOrganizationCode(String organizationCode)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ORGANIZATIONCODE;

		Object[] finderArgs = new Object[] { organizationCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMGTORGANIZATION_WHERE);

			boolean bindOrganizationCode = false;

			if (organizationCode == null) {
				query.append(_FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_1);
			}
			else if (organizationCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_3);
			}
			else {
				bindOrganizationCode = true;

				query.append(_FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindOrganizationCode) {
					qPos.add(organizationCode);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_1 =
		"dmGtOrganization.organizationCode IS NULL";
	private static final String _FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_2 =
		"dmGtOrganization.organizationCode = ?";
	private static final String _FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_3 =
		"(dmGtOrganization.organizationCode IS NULL OR dmGtOrganization.organizationCode = '')";

	public DmGtOrganizationPersistenceImpl() {
		setModelClass(DmGtOrganization.class);
	}

	/**
	 * Caches the dm gt organization in the entity cache if it is enabled.
	 *
	 * @param dmGtOrganization the dm gt organization
	 */
	@Override
	public void cacheResult(DmGtOrganization dmGtOrganization) {
		EntityCacheUtil.putResult(DmGtOrganizationModelImpl.ENTITY_CACHE_ENABLED,
			DmGtOrganizationImpl.class, dmGtOrganization.getPrimaryKey(),
			dmGtOrganization);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ORGANIZATIONCODE,
			new Object[] { dmGtOrganization.getOrganizationCode() },
			dmGtOrganization);

		dmGtOrganization.resetOriginalValues();
	}

	/**
	 * Caches the dm gt organizations in the entity cache if it is enabled.
	 *
	 * @param dmGtOrganizations the dm gt organizations
	 */
	@Override
	public void cacheResult(List<DmGtOrganization> dmGtOrganizations) {
		for (DmGtOrganization dmGtOrganization : dmGtOrganizations) {
			if (EntityCacheUtil.getResult(
						DmGtOrganizationModelImpl.ENTITY_CACHE_ENABLED,
						DmGtOrganizationImpl.class,
						dmGtOrganization.getPrimaryKey()) == null) {
				cacheResult(dmGtOrganization);
			}
			else {
				dmGtOrganization.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm gt organizations.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmGtOrganizationImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmGtOrganizationImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm gt organization.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmGtOrganization dmGtOrganization) {
		EntityCacheUtil.removeResult(DmGtOrganizationModelImpl.ENTITY_CACHE_ENABLED,
			DmGtOrganizationImpl.class, dmGtOrganization.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(dmGtOrganization);
	}

	@Override
	public void clearCache(List<DmGtOrganization> dmGtOrganizations) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmGtOrganization dmGtOrganization : dmGtOrganizations) {
			EntityCacheUtil.removeResult(DmGtOrganizationModelImpl.ENTITY_CACHE_ENABLED,
				DmGtOrganizationImpl.class, dmGtOrganization.getPrimaryKey());

			clearUniqueFindersCache(dmGtOrganization);
		}
	}

	protected void cacheUniqueFindersCache(DmGtOrganization dmGtOrganization) {
		if (dmGtOrganization.isNew()) {
			Object[] args = new Object[] { dmGtOrganization.getOrganizationCode() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ORGANIZATIONCODE,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ORGANIZATIONCODE,
				args, dmGtOrganization);
		}
		else {
			DmGtOrganizationModelImpl dmGtOrganizationModelImpl = (DmGtOrganizationModelImpl)dmGtOrganization;

			if ((dmGtOrganizationModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_ORGANIZATIONCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmGtOrganization.getOrganizationCode()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ORGANIZATIONCODE,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ORGANIZATIONCODE,
					args, dmGtOrganization);
			}
		}
	}

	protected void clearUniqueFindersCache(DmGtOrganization dmGtOrganization) {
		DmGtOrganizationModelImpl dmGtOrganizationModelImpl = (DmGtOrganizationModelImpl)dmGtOrganization;

		Object[] args = new Object[] { dmGtOrganization.getOrganizationCode() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONCODE, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ORGANIZATIONCODE, args);

		if ((dmGtOrganizationModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_ORGANIZATIONCODE.getColumnBitmask()) != 0) {
			args = new Object[] {
					dmGtOrganizationModelImpl.getOriginalOrganizationCode()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONCODE,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ORGANIZATIONCODE,
				args);
		}
	}

	/**
	 * Creates a new dm gt organization with the primary key. Does not add the dm gt organization to the database.
	 *
	 * @param id the primary key for the new dm gt organization
	 * @return the new dm gt organization
	 */
	@Override
	public DmGtOrganization create(long id) {
		DmGtOrganization dmGtOrganization = new DmGtOrganizationImpl();

		dmGtOrganization.setNew(true);
		dmGtOrganization.setPrimaryKey(id);

		return dmGtOrganization;
	}

	/**
	 * Removes the dm gt organization with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm gt organization
	 * @return the dm gt organization that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtOrganizationException if a dm gt organization with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtOrganization remove(long id)
		throws NoSuchDmGtOrganizationException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the dm gt organization with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm gt organization
	 * @return the dm gt organization that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtOrganizationException if a dm gt organization with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtOrganization remove(Serializable primaryKey)
		throws NoSuchDmGtOrganizationException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmGtOrganization dmGtOrganization = (DmGtOrganization)session.get(DmGtOrganizationImpl.class,
					primaryKey);

			if (dmGtOrganization == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmGtOrganizationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmGtOrganization);
		}
		catch (NoSuchDmGtOrganizationException nsee) {
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
	protected DmGtOrganization removeImpl(DmGtOrganization dmGtOrganization)
		throws SystemException {
		dmGtOrganization = toUnwrappedModel(dmGtOrganization);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dmGtOrganization)) {
				dmGtOrganization = (DmGtOrganization)session.get(DmGtOrganizationImpl.class,
						dmGtOrganization.getPrimaryKeyObj());
			}

			if (dmGtOrganization != null) {
				session.delete(dmGtOrganization);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dmGtOrganization != null) {
			clearCache(dmGtOrganization);
		}

		return dmGtOrganization;
	}

	@Override
	public DmGtOrganization updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmGtOrganization dmGtOrganization)
		throws SystemException {
		dmGtOrganization = toUnwrappedModel(dmGtOrganization);

		boolean isNew = dmGtOrganization.isNew();

		Session session = null;

		try {
			session = openSession();

			if (dmGtOrganization.isNew()) {
				session.save(dmGtOrganization);

				dmGtOrganization.setNew(false);
			}
			else {
				session.merge(dmGtOrganization);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmGtOrganizationModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(DmGtOrganizationModelImpl.ENTITY_CACHE_ENABLED,
			DmGtOrganizationImpl.class, dmGtOrganization.getPrimaryKey(),
			dmGtOrganization);

		clearUniqueFindersCache(dmGtOrganization);
		cacheUniqueFindersCache(dmGtOrganization);

		return dmGtOrganization;
	}

	protected DmGtOrganization toUnwrappedModel(
		DmGtOrganization dmGtOrganization) {
		if (dmGtOrganization instanceof DmGtOrganizationImpl) {
			return dmGtOrganization;
		}

		DmGtOrganizationImpl dmGtOrganizationImpl = new DmGtOrganizationImpl();

		dmGtOrganizationImpl.setNew(dmGtOrganization.isNew());
		dmGtOrganizationImpl.setPrimaryKey(dmGtOrganization.getPrimaryKey());

		dmGtOrganizationImpl.setId(dmGtOrganization.getId());
		dmGtOrganizationImpl.setOrganizationCode(dmGtOrganization.getOrganizationCode());
		dmGtOrganizationImpl.setOrganizationName(dmGtOrganization.getOrganizationName());
		dmGtOrganizationImpl.setOrganizationNameVN(dmGtOrganization.getOrganizationNameVN());
		dmGtOrganizationImpl.setOrganizationorder(dmGtOrganization.getOrganizationorder());
		dmGtOrganizationImpl.setIsDelete(dmGtOrganization.getIsDelete());
		dmGtOrganizationImpl.setMarkedAsDelete(dmGtOrganization.getMarkedAsDelete());
		dmGtOrganizationImpl.setModifiedDate(dmGtOrganization.getModifiedDate());
		dmGtOrganizationImpl.setRequestedDate(dmGtOrganization.getRequestedDate());
		dmGtOrganizationImpl.setSyncVersion(dmGtOrganization.getSyncVersion());

		return dmGtOrganizationImpl;
	}

	/**
	 * Returns the dm gt organization with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm gt organization
	 * @return the dm gt organization
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtOrganizationException if a dm gt organization with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtOrganization findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDmGtOrganizationException, SystemException {
		DmGtOrganization dmGtOrganization = fetchByPrimaryKey(primaryKey);

		if (dmGtOrganization == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDmGtOrganizationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dmGtOrganization;
	}

	/**
	 * Returns the dm gt organization with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmGtOrganizationException} if it could not be found.
	 *
	 * @param id the primary key of the dm gt organization
	 * @return the dm gt organization
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtOrganizationException if a dm gt organization with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtOrganization findByPrimaryKey(long id)
		throws NoSuchDmGtOrganizationException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dm gt organization with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm gt organization
	 * @return the dm gt organization, or <code>null</code> if a dm gt organization with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtOrganization fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DmGtOrganization dmGtOrganization = (DmGtOrganization)EntityCacheUtil.getResult(DmGtOrganizationModelImpl.ENTITY_CACHE_ENABLED,
				DmGtOrganizationImpl.class, primaryKey);

		if (dmGtOrganization == _nullDmGtOrganization) {
			return null;
		}

		if (dmGtOrganization == null) {
			Session session = null;

			try {
				session = openSession();

				dmGtOrganization = (DmGtOrganization)session.get(DmGtOrganizationImpl.class,
						primaryKey);

				if (dmGtOrganization != null) {
					cacheResult(dmGtOrganization);
				}
				else {
					EntityCacheUtil.putResult(DmGtOrganizationModelImpl.ENTITY_CACHE_ENABLED,
						DmGtOrganizationImpl.class, primaryKey,
						_nullDmGtOrganization);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DmGtOrganizationModelImpl.ENTITY_CACHE_ENABLED,
					DmGtOrganizationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dmGtOrganization;
	}

	/**
	 * Returns the dm gt organization with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm gt organization
	 * @return the dm gt organization, or <code>null</code> if a dm gt organization with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtOrganization fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the dm gt organizations.
	 *
	 * @return the dm gt organizations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmGtOrganization> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm gt organizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGtOrganizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm gt organizations
	 * @param end the upper bound of the range of dm gt organizations (not inclusive)
	 * @return the range of dm gt organizations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmGtOrganization> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm gt organizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGtOrganizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm gt organizations
	 * @param end the upper bound of the range of dm gt organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm gt organizations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmGtOrganization> findAll(int start, int end,
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

		List<DmGtOrganization> list = (List<DmGtOrganization>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMGTORGANIZATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMGTORGANIZATION;

				if (pagination) {
					sql = sql.concat(DmGtOrganizationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DmGtOrganization>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmGtOrganization>(list);
				}
				else {
					list = (List<DmGtOrganization>)QueryUtil.list(q,
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
	 * Removes all the dm gt organizations from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DmGtOrganization dmGtOrganization : findAll()) {
			remove(dmGtOrganization);
		}
	}

	/**
	 * Returns the number of dm gt organizations.
	 *
	 * @return the number of dm gt organizations
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

				Query q = session.createQuery(_SQL_COUNT_DMGTORGANIZATION);

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
	 * Initializes the dm gt organization persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.DmGtOrganization")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmGtOrganization>> listenersList = new ArrayList<ModelListener<DmGtOrganization>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmGtOrganization>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmGtOrganizationImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DMGTORGANIZATION = "SELECT dmGtOrganization FROM DmGtOrganization dmGtOrganization";
	private static final String _SQL_SELECT_DMGTORGANIZATION_WHERE = "SELECT dmGtOrganization FROM DmGtOrganization dmGtOrganization WHERE ";
	private static final String _SQL_COUNT_DMGTORGANIZATION = "SELECT COUNT(dmGtOrganization) FROM DmGtOrganization dmGtOrganization";
	private static final String _SQL_COUNT_DMGTORGANIZATION_WHERE = "SELECT COUNT(dmGtOrganization) FROM DmGtOrganization dmGtOrganization WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmGtOrganization.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmGtOrganization exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmGtOrganization exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmGtOrganizationPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "organizationCode", "organizationName",
				"organizationNameVN", "organizationorder", "isDelete",
				"markedAsDelete", "modifiedDate", "requestedDate", "syncVersion"
			});
	private static DmGtOrganization _nullDmGtOrganization = new DmGtOrganizationImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmGtOrganization> toCacheModel() {
				return _nullDmGtOrganizationCacheModel;
			}
		};

	private static CacheModel<DmGtOrganization> _nullDmGtOrganizationCacheModel = new CacheModel<DmGtOrganization>() {
			@Override
			public DmGtOrganization toEntityModel() {
				return _nullDmGtOrganization;
			}
		};
}