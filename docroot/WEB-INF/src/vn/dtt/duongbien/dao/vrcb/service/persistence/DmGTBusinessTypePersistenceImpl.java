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
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.duongbien.dao.vrcb.NoSuchDmGTBusinessTypeException;
import vn.dtt.duongbien.dao.vrcb.model.DmGTBusinessType;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmGTBusinessTypeImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmGTBusinessTypeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dm g t business type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmGTBusinessTypePersistence
 * @see DmGTBusinessTypeUtil
 * @generated
 */
public class DmGTBusinessTypePersistenceImpl extends BasePersistenceImpl<DmGTBusinessType>
	implements DmGTBusinessTypePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmGTBusinessTypeUtil} to access the dm g t business type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmGTBusinessTypeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmGTBusinessTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmGTBusinessTypeModelImpl.FINDER_CACHE_ENABLED,
			DmGTBusinessTypeImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmGTBusinessTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmGTBusinessTypeModelImpl.FINDER_CACHE_ENABLED,
			DmGTBusinessTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmGTBusinessTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmGTBusinessTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_BUSINESSTYPECODE = new FinderPath(DmGTBusinessTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmGTBusinessTypeModelImpl.FINDER_CACHE_ENABLED,
			DmGTBusinessTypeImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByBusinessTypeCode",
			new String[] { Integer.class.getName() },
			DmGTBusinessTypeModelImpl.BUSINESSTYPECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_BUSINESSTYPECODE = new FinderPath(DmGTBusinessTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmGTBusinessTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByBusinessTypeCode", new String[] { Integer.class.getName() });

	/**
	 * Returns the dm g t business type where businessTypeCode = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmGTBusinessTypeException} if it could not be found.
	 *
	 * @param businessTypeCode the business type code
	 * @return the matching dm g t business type
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGTBusinessTypeException if a matching dm g t business type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGTBusinessType findByBusinessTypeCode(int businessTypeCode)
		throws NoSuchDmGTBusinessTypeException, SystemException {
		DmGTBusinessType dmGTBusinessType = fetchByBusinessTypeCode(businessTypeCode);

		if (dmGTBusinessType == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("businessTypeCode=");
			msg.append(businessTypeCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmGTBusinessTypeException(msg.toString());
		}

		return dmGTBusinessType;
	}

	/**
	 * Returns the dm g t business type where businessTypeCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param businessTypeCode the business type code
	 * @return the matching dm g t business type, or <code>null</code> if a matching dm g t business type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGTBusinessType fetchByBusinessTypeCode(int businessTypeCode)
		throws SystemException {
		return fetchByBusinessTypeCode(businessTypeCode, true);
	}

	/**
	 * Returns the dm g t business type where businessTypeCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param businessTypeCode the business type code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm g t business type, or <code>null</code> if a matching dm g t business type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGTBusinessType fetchByBusinessTypeCode(int businessTypeCode,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { businessTypeCode };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_BUSINESSTYPECODE,
					finderArgs, this);
		}

		if (result instanceof DmGTBusinessType) {
			DmGTBusinessType dmGTBusinessType = (DmGTBusinessType)result;

			if ((businessTypeCode != dmGTBusinessType.getBusinessTypeCode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_DMGTBUSINESSTYPE_WHERE);

			query.append(_FINDER_COLUMN_BUSINESSTYPECODE_BUSINESSTYPECODE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(businessTypeCode);

				List<DmGTBusinessType> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BUSINESSTYPECODE,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DmGTBusinessTypePersistenceImpl.fetchByBusinessTypeCode(int, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DmGTBusinessType dmGTBusinessType = list.get(0);

					result = dmGTBusinessType;

					cacheResult(dmGTBusinessType);

					if ((dmGTBusinessType.getBusinessTypeCode() != businessTypeCode)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BUSINESSTYPECODE,
							finderArgs, dmGTBusinessType);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_BUSINESSTYPECODE,
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
			return (DmGTBusinessType)result;
		}
	}

	/**
	 * Removes the dm g t business type where businessTypeCode = &#63; from the database.
	 *
	 * @param businessTypeCode the business type code
	 * @return the dm g t business type that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGTBusinessType removeByBusinessTypeCode(int businessTypeCode)
		throws NoSuchDmGTBusinessTypeException, SystemException {
		DmGTBusinessType dmGTBusinessType = findByBusinessTypeCode(businessTypeCode);

		return remove(dmGTBusinessType);
	}

	/**
	 * Returns the number of dm g t business types where businessTypeCode = &#63;.
	 *
	 * @param businessTypeCode the business type code
	 * @return the number of matching dm g t business types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByBusinessTypeCode(int businessTypeCode)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_BUSINESSTYPECODE;

		Object[] finderArgs = new Object[] { businessTypeCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMGTBUSINESSTYPE_WHERE);

			query.append(_FINDER_COLUMN_BUSINESSTYPECODE_BUSINESSTYPECODE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(businessTypeCode);

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

	private static final String _FINDER_COLUMN_BUSINESSTYPECODE_BUSINESSTYPECODE_2 =
		"dmGTBusinessType.businessTypeCode = ?";

	public DmGTBusinessTypePersistenceImpl() {
		setModelClass(DmGTBusinessType.class);
	}

	/**
	 * Caches the dm g t business type in the entity cache if it is enabled.
	 *
	 * @param dmGTBusinessType the dm g t business type
	 */
	@Override
	public void cacheResult(DmGTBusinessType dmGTBusinessType) {
		EntityCacheUtil.putResult(DmGTBusinessTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmGTBusinessTypeImpl.class, dmGTBusinessType.getPrimaryKey(),
			dmGTBusinessType);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BUSINESSTYPECODE,
			new Object[] { dmGTBusinessType.getBusinessTypeCode() },
			dmGTBusinessType);

		dmGTBusinessType.resetOriginalValues();
	}

	/**
	 * Caches the dm g t business types in the entity cache if it is enabled.
	 *
	 * @param dmGTBusinessTypes the dm g t business types
	 */
	@Override
	public void cacheResult(List<DmGTBusinessType> dmGTBusinessTypes) {
		for (DmGTBusinessType dmGTBusinessType : dmGTBusinessTypes) {
			if (EntityCacheUtil.getResult(
						DmGTBusinessTypeModelImpl.ENTITY_CACHE_ENABLED,
						DmGTBusinessTypeImpl.class,
						dmGTBusinessType.getPrimaryKey()) == null) {
				cacheResult(dmGTBusinessType);
			}
			else {
				dmGTBusinessType.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm g t business types.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmGTBusinessTypeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmGTBusinessTypeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm g t business type.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmGTBusinessType dmGTBusinessType) {
		EntityCacheUtil.removeResult(DmGTBusinessTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmGTBusinessTypeImpl.class, dmGTBusinessType.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(dmGTBusinessType);
	}

	@Override
	public void clearCache(List<DmGTBusinessType> dmGTBusinessTypes) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmGTBusinessType dmGTBusinessType : dmGTBusinessTypes) {
			EntityCacheUtil.removeResult(DmGTBusinessTypeModelImpl.ENTITY_CACHE_ENABLED,
				DmGTBusinessTypeImpl.class, dmGTBusinessType.getPrimaryKey());

			clearUniqueFindersCache(dmGTBusinessType);
		}
	}

	protected void cacheUniqueFindersCache(DmGTBusinessType dmGTBusinessType) {
		if (dmGTBusinessType.isNew()) {
			Object[] args = new Object[] { dmGTBusinessType.getBusinessTypeCode() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_BUSINESSTYPECODE,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BUSINESSTYPECODE,
				args, dmGTBusinessType);
		}
		else {
			DmGTBusinessTypeModelImpl dmGTBusinessTypeModelImpl = (DmGTBusinessTypeModelImpl)dmGTBusinessType;

			if ((dmGTBusinessTypeModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_BUSINESSTYPECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmGTBusinessType.getBusinessTypeCode()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_BUSINESSTYPECODE,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BUSINESSTYPECODE,
					args, dmGTBusinessType);
			}
		}
	}

	protected void clearUniqueFindersCache(DmGTBusinessType dmGTBusinessType) {
		DmGTBusinessTypeModelImpl dmGTBusinessTypeModelImpl = (DmGTBusinessTypeModelImpl)dmGTBusinessType;

		Object[] args = new Object[] { dmGTBusinessType.getBusinessTypeCode() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BUSINESSTYPECODE, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_BUSINESSTYPECODE, args);

		if ((dmGTBusinessTypeModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_BUSINESSTYPECODE.getColumnBitmask()) != 0) {
			args = new Object[] {
					dmGTBusinessTypeModelImpl.getOriginalBusinessTypeCode()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BUSINESSTYPECODE,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_BUSINESSTYPECODE,
				args);
		}
	}

	/**
	 * Creates a new dm g t business type with the primary key. Does not add the dm g t business type to the database.
	 *
	 * @param id the primary key for the new dm g t business type
	 * @return the new dm g t business type
	 */
	@Override
	public DmGTBusinessType create(long id) {
		DmGTBusinessType dmGTBusinessType = new DmGTBusinessTypeImpl();

		dmGTBusinessType.setNew(true);
		dmGTBusinessType.setPrimaryKey(id);

		return dmGTBusinessType;
	}

	/**
	 * Removes the dm g t business type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm g t business type
	 * @return the dm g t business type that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGTBusinessTypeException if a dm g t business type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGTBusinessType remove(long id)
		throws NoSuchDmGTBusinessTypeException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the dm g t business type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm g t business type
	 * @return the dm g t business type that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGTBusinessTypeException if a dm g t business type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGTBusinessType remove(Serializable primaryKey)
		throws NoSuchDmGTBusinessTypeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmGTBusinessType dmGTBusinessType = (DmGTBusinessType)session.get(DmGTBusinessTypeImpl.class,
					primaryKey);

			if (dmGTBusinessType == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmGTBusinessTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmGTBusinessType);
		}
		catch (NoSuchDmGTBusinessTypeException nsee) {
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
	protected DmGTBusinessType removeImpl(DmGTBusinessType dmGTBusinessType)
		throws SystemException {
		dmGTBusinessType = toUnwrappedModel(dmGTBusinessType);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dmGTBusinessType)) {
				dmGTBusinessType = (DmGTBusinessType)session.get(DmGTBusinessTypeImpl.class,
						dmGTBusinessType.getPrimaryKeyObj());
			}

			if (dmGTBusinessType != null) {
				session.delete(dmGTBusinessType);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dmGTBusinessType != null) {
			clearCache(dmGTBusinessType);
		}

		return dmGTBusinessType;
	}

	@Override
	public DmGTBusinessType updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmGTBusinessType dmGTBusinessType)
		throws SystemException {
		dmGTBusinessType = toUnwrappedModel(dmGTBusinessType);

		boolean isNew = dmGTBusinessType.isNew();

		Session session = null;

		try {
			session = openSession();

			if (dmGTBusinessType.isNew()) {
				session.save(dmGTBusinessType);

				dmGTBusinessType.setNew(false);
			}
			else {
				session.merge(dmGTBusinessType);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmGTBusinessTypeModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(DmGTBusinessTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmGTBusinessTypeImpl.class, dmGTBusinessType.getPrimaryKey(),
			dmGTBusinessType);

		clearUniqueFindersCache(dmGTBusinessType);
		cacheUniqueFindersCache(dmGTBusinessType);

		return dmGTBusinessType;
	}

	protected DmGTBusinessType toUnwrappedModel(
		DmGTBusinessType dmGTBusinessType) {
		if (dmGTBusinessType instanceof DmGTBusinessTypeImpl) {
			return dmGTBusinessType;
		}

		DmGTBusinessTypeImpl dmGTBusinessTypeImpl = new DmGTBusinessTypeImpl();

		dmGTBusinessTypeImpl.setNew(dmGTBusinessType.isNew());
		dmGTBusinessTypeImpl.setPrimaryKey(dmGTBusinessType.getPrimaryKey());

		dmGTBusinessTypeImpl.setId(dmGTBusinessType.getId());
		dmGTBusinessTypeImpl.setBusinessTypeCode(dmGTBusinessType.getBusinessTypeCode());
		dmGTBusinessTypeImpl.setBusinessTypeName(dmGTBusinessType.getBusinessTypeName());
		dmGTBusinessTypeImpl.setBusinessTypeNameVN(dmGTBusinessType.getBusinessTypeNameVN());
		dmGTBusinessTypeImpl.setBusinessTypeOrder(dmGTBusinessType.getBusinessTypeOrder());
		dmGTBusinessTypeImpl.setIsDelete(dmGTBusinessType.getIsDelete());
		dmGTBusinessTypeImpl.setMarkedAsDelete(dmGTBusinessType.getMarkedAsDelete());
		dmGTBusinessTypeImpl.setModifiedDate(dmGTBusinessType.getModifiedDate());
		dmGTBusinessTypeImpl.setRequestedDate(dmGTBusinessType.getRequestedDate());
		dmGTBusinessTypeImpl.setSyncVersion(dmGTBusinessType.getSyncVersion());
		dmGTBusinessTypeImpl.setRemarks(dmGTBusinessType.getRemarks());

		return dmGTBusinessTypeImpl;
	}

	/**
	 * Returns the dm g t business type with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm g t business type
	 * @return the dm g t business type
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGTBusinessTypeException if a dm g t business type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGTBusinessType findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDmGTBusinessTypeException, SystemException {
		DmGTBusinessType dmGTBusinessType = fetchByPrimaryKey(primaryKey);

		if (dmGTBusinessType == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDmGTBusinessTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dmGTBusinessType;
	}

	/**
	 * Returns the dm g t business type with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmGTBusinessTypeException} if it could not be found.
	 *
	 * @param id the primary key of the dm g t business type
	 * @return the dm g t business type
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGTBusinessTypeException if a dm g t business type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGTBusinessType findByPrimaryKey(long id)
		throws NoSuchDmGTBusinessTypeException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dm g t business type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm g t business type
	 * @return the dm g t business type, or <code>null</code> if a dm g t business type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGTBusinessType fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DmGTBusinessType dmGTBusinessType = (DmGTBusinessType)EntityCacheUtil.getResult(DmGTBusinessTypeModelImpl.ENTITY_CACHE_ENABLED,
				DmGTBusinessTypeImpl.class, primaryKey);

		if (dmGTBusinessType == _nullDmGTBusinessType) {
			return null;
		}

		if (dmGTBusinessType == null) {
			Session session = null;

			try {
				session = openSession();

				dmGTBusinessType = (DmGTBusinessType)session.get(DmGTBusinessTypeImpl.class,
						primaryKey);

				if (dmGTBusinessType != null) {
					cacheResult(dmGTBusinessType);
				}
				else {
					EntityCacheUtil.putResult(DmGTBusinessTypeModelImpl.ENTITY_CACHE_ENABLED,
						DmGTBusinessTypeImpl.class, primaryKey,
						_nullDmGTBusinessType);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DmGTBusinessTypeModelImpl.ENTITY_CACHE_ENABLED,
					DmGTBusinessTypeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dmGTBusinessType;
	}

	/**
	 * Returns the dm g t business type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm g t business type
	 * @return the dm g t business type, or <code>null</code> if a dm g t business type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGTBusinessType fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the dm g t business types.
	 *
	 * @return the dm g t business types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmGTBusinessType> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm g t business types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGTBusinessTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm g t business types
	 * @param end the upper bound of the range of dm g t business types (not inclusive)
	 * @return the range of dm g t business types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmGTBusinessType> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm g t business types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGTBusinessTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm g t business types
	 * @param end the upper bound of the range of dm g t business types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm g t business types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmGTBusinessType> findAll(int start, int end,
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

		List<DmGTBusinessType> list = (List<DmGTBusinessType>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMGTBUSINESSTYPE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMGTBUSINESSTYPE;

				if (pagination) {
					sql = sql.concat(DmGTBusinessTypeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DmGTBusinessType>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmGTBusinessType>(list);
				}
				else {
					list = (List<DmGTBusinessType>)QueryUtil.list(q,
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
	 * Removes all the dm g t business types from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DmGTBusinessType dmGTBusinessType : findAll()) {
			remove(dmGTBusinessType);
		}
	}

	/**
	 * Returns the number of dm g t business types.
	 *
	 * @return the number of dm g t business types
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

				Query q = session.createQuery(_SQL_COUNT_DMGTBUSINESSTYPE);

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
	 * Initializes the dm g t business type persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.DmGTBusinessType")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmGTBusinessType>> listenersList = new ArrayList<ModelListener<DmGTBusinessType>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmGTBusinessType>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmGTBusinessTypeImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DMGTBUSINESSTYPE = "SELECT dmGTBusinessType FROM DmGTBusinessType dmGTBusinessType";
	private static final String _SQL_SELECT_DMGTBUSINESSTYPE_WHERE = "SELECT dmGTBusinessType FROM DmGTBusinessType dmGTBusinessType WHERE ";
	private static final String _SQL_COUNT_DMGTBUSINESSTYPE = "SELECT COUNT(dmGTBusinessType) FROM DmGTBusinessType dmGTBusinessType";
	private static final String _SQL_COUNT_DMGTBUSINESSTYPE_WHERE = "SELECT COUNT(dmGTBusinessType) FROM DmGTBusinessType dmGTBusinessType WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmGTBusinessType.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmGTBusinessType exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmGTBusinessType exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmGTBusinessTypePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"businessTypeCode", "businessTypeName", "businessTypeNameVN",
				"businessTypeOrder", "isDelete", "markedAsDelete",
				"modifiedDate", "requestedDate", "syncVersion", "remarks"
			});
	private static DmGTBusinessType _nullDmGTBusinessType = new DmGTBusinessTypeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmGTBusinessType> toCacheModel() {
				return _nullDmGTBusinessTypeCacheModel;
			}
		};

	private static CacheModel<DmGTBusinessType> _nullDmGTBusinessTypeCacheModel = new CacheModel<DmGTBusinessType>() {
			@Override
			public DmGTBusinessType toEntityModel() {
				return _nullDmGTBusinessType;
			}
		};
}