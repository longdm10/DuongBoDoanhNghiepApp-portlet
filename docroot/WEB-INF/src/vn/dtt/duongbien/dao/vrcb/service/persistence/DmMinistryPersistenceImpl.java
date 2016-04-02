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

import vn.dtt.duongbien.dao.vrcb.NoSuchDmMinistryException;
import vn.dtt.duongbien.dao.vrcb.model.DmMinistry;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmMinistryImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmMinistryModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dm ministry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmMinistryPersistence
 * @see DmMinistryUtil
 * @generated
 */
public class DmMinistryPersistenceImpl extends BasePersistenceImpl<DmMinistry>
	implements DmMinistryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmMinistryUtil} to access the dm ministry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmMinistryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmMinistryModelImpl.ENTITY_CACHE_ENABLED,
			DmMinistryModelImpl.FINDER_CACHE_ENABLED, DmMinistryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmMinistryModelImpl.ENTITY_CACHE_ENABLED,
			DmMinistryModelImpl.FINDER_CACHE_ENABLED, DmMinistryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmMinistryModelImpl.ENTITY_CACHE_ENABLED,
			DmMinistryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_MINISTRYCODE = new FinderPath(DmMinistryModelImpl.ENTITY_CACHE_ENABLED,
			DmMinistryModelImpl.FINDER_CACHE_ENABLED, DmMinistryImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByMinistryCode",
			new String[] { String.class.getName() },
			DmMinistryModelImpl.MINISTRYCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MINISTRYCODE = new FinderPath(DmMinistryModelImpl.ENTITY_CACHE_ENABLED,
			DmMinistryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMinistryCode",
			new String[] { String.class.getName() });

	/**
	 * Returns the dm ministry where ministryCode = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmMinistryException} if it could not be found.
	 *
	 * @param ministryCode the ministry code
	 * @return the matching dm ministry
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmMinistryException if a matching dm ministry could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmMinistry findByMinistryCode(String ministryCode)
		throws NoSuchDmMinistryException, SystemException {
		DmMinistry dmMinistry = fetchByMinistryCode(ministryCode);

		if (dmMinistry == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("ministryCode=");
			msg.append(ministryCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmMinistryException(msg.toString());
		}

		return dmMinistry;
	}

	/**
	 * Returns the dm ministry where ministryCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ministryCode the ministry code
	 * @return the matching dm ministry, or <code>null</code> if a matching dm ministry could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmMinistry fetchByMinistryCode(String ministryCode)
		throws SystemException {
		return fetchByMinistryCode(ministryCode, true);
	}

	/**
	 * Returns the dm ministry where ministryCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ministryCode the ministry code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm ministry, or <code>null</code> if a matching dm ministry could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmMinistry fetchByMinistryCode(String ministryCode,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { ministryCode };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_MINISTRYCODE,
					finderArgs, this);
		}

		if (result instanceof DmMinistry) {
			DmMinistry dmMinistry = (DmMinistry)result;

			if (!Validator.equals(ministryCode, dmMinistry.getMinistryCode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_DMMINISTRY_WHERE);

			boolean bindMinistryCode = false;

			if (ministryCode == null) {
				query.append(_FINDER_COLUMN_MINISTRYCODE_MINISTRYCODE_1);
			}
			else if (ministryCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MINISTRYCODE_MINISTRYCODE_3);
			}
			else {
				bindMinistryCode = true;

				query.append(_FINDER_COLUMN_MINISTRYCODE_MINISTRYCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMinistryCode) {
					qPos.add(ministryCode);
				}

				List<DmMinistry> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MINISTRYCODE,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DmMinistryPersistenceImpl.fetchByMinistryCode(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DmMinistry dmMinistry = list.get(0);

					result = dmMinistry;

					cacheResult(dmMinistry);

					if ((dmMinistry.getMinistryCode() == null) ||
							!dmMinistry.getMinistryCode().equals(ministryCode)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MINISTRYCODE,
							finderArgs, dmMinistry);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MINISTRYCODE,
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
			return (DmMinistry)result;
		}
	}

	/**
	 * Removes the dm ministry where ministryCode = &#63; from the database.
	 *
	 * @param ministryCode the ministry code
	 * @return the dm ministry that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmMinistry removeByMinistryCode(String ministryCode)
		throws NoSuchDmMinistryException, SystemException {
		DmMinistry dmMinistry = findByMinistryCode(ministryCode);

		return remove(dmMinistry);
	}

	/**
	 * Returns the number of dm ministries where ministryCode = &#63;.
	 *
	 * @param ministryCode the ministry code
	 * @return the number of matching dm ministries
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByMinistryCode(String ministryCode)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MINISTRYCODE;

		Object[] finderArgs = new Object[] { ministryCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMMINISTRY_WHERE);

			boolean bindMinistryCode = false;

			if (ministryCode == null) {
				query.append(_FINDER_COLUMN_MINISTRYCODE_MINISTRYCODE_1);
			}
			else if (ministryCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MINISTRYCODE_MINISTRYCODE_3);
			}
			else {
				bindMinistryCode = true;

				query.append(_FINDER_COLUMN_MINISTRYCODE_MINISTRYCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMinistryCode) {
					qPos.add(ministryCode);
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

	private static final String _FINDER_COLUMN_MINISTRYCODE_MINISTRYCODE_1 = "dmMinistry.ministryCode IS NULL";
	private static final String _FINDER_COLUMN_MINISTRYCODE_MINISTRYCODE_2 = "dmMinistry.ministryCode = ?";
	private static final String _FINDER_COLUMN_MINISTRYCODE_MINISTRYCODE_3 = "(dmMinistry.ministryCode IS NULL OR dmMinistry.ministryCode = '')";

	public DmMinistryPersistenceImpl() {
		setModelClass(DmMinistry.class);
	}

	/**
	 * Caches the dm ministry in the entity cache if it is enabled.
	 *
	 * @param dmMinistry the dm ministry
	 */
	@Override
	public void cacheResult(DmMinistry dmMinistry) {
		EntityCacheUtil.putResult(DmMinistryModelImpl.ENTITY_CACHE_ENABLED,
			DmMinistryImpl.class, dmMinistry.getPrimaryKey(), dmMinistry);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MINISTRYCODE,
			new Object[] { dmMinistry.getMinistryCode() }, dmMinistry);

		dmMinistry.resetOriginalValues();
	}

	/**
	 * Caches the dm ministries in the entity cache if it is enabled.
	 *
	 * @param dmMinistries the dm ministries
	 */
	@Override
	public void cacheResult(List<DmMinistry> dmMinistries) {
		for (DmMinistry dmMinistry : dmMinistries) {
			if (EntityCacheUtil.getResult(
						DmMinistryModelImpl.ENTITY_CACHE_ENABLED,
						DmMinistryImpl.class, dmMinistry.getPrimaryKey()) == null) {
				cacheResult(dmMinistry);
			}
			else {
				dmMinistry.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm ministries.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmMinistryImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmMinistryImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm ministry.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmMinistry dmMinistry) {
		EntityCacheUtil.removeResult(DmMinistryModelImpl.ENTITY_CACHE_ENABLED,
			DmMinistryImpl.class, dmMinistry.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(dmMinistry);
	}

	@Override
	public void clearCache(List<DmMinistry> dmMinistries) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmMinistry dmMinistry : dmMinistries) {
			EntityCacheUtil.removeResult(DmMinistryModelImpl.ENTITY_CACHE_ENABLED,
				DmMinistryImpl.class, dmMinistry.getPrimaryKey());

			clearUniqueFindersCache(dmMinistry);
		}
	}

	protected void cacheUniqueFindersCache(DmMinistry dmMinistry) {
		if (dmMinistry.isNew()) {
			Object[] args = new Object[] { dmMinistry.getMinistryCode() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MINISTRYCODE, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MINISTRYCODE, args,
				dmMinistry);
		}
		else {
			DmMinistryModelImpl dmMinistryModelImpl = (DmMinistryModelImpl)dmMinistry;

			if ((dmMinistryModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_MINISTRYCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { dmMinistry.getMinistryCode() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MINISTRYCODE,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MINISTRYCODE,
					args, dmMinistry);
			}
		}
	}

	protected void clearUniqueFindersCache(DmMinistry dmMinistry) {
		DmMinistryModelImpl dmMinistryModelImpl = (DmMinistryModelImpl)dmMinistry;

		Object[] args = new Object[] { dmMinistry.getMinistryCode() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MINISTRYCODE, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MINISTRYCODE, args);

		if ((dmMinistryModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_MINISTRYCODE.getColumnBitmask()) != 0) {
			args = new Object[] { dmMinistryModelImpl.getOriginalMinistryCode() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MINISTRYCODE, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MINISTRYCODE, args);
		}
	}

	/**
	 * Creates a new dm ministry with the primary key. Does not add the dm ministry to the database.
	 *
	 * @param id the primary key for the new dm ministry
	 * @return the new dm ministry
	 */
	@Override
	public DmMinistry create(long id) {
		DmMinistry dmMinistry = new DmMinistryImpl();

		dmMinistry.setNew(true);
		dmMinistry.setPrimaryKey(id);

		return dmMinistry;
	}

	/**
	 * Removes the dm ministry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm ministry
	 * @return the dm ministry that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmMinistryException if a dm ministry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmMinistry remove(long id)
		throws NoSuchDmMinistryException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the dm ministry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm ministry
	 * @return the dm ministry that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmMinistryException if a dm ministry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmMinistry remove(Serializable primaryKey)
		throws NoSuchDmMinistryException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmMinistry dmMinistry = (DmMinistry)session.get(DmMinistryImpl.class,
					primaryKey);

			if (dmMinistry == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmMinistryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmMinistry);
		}
		catch (NoSuchDmMinistryException nsee) {
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
	protected DmMinistry removeImpl(DmMinistry dmMinistry)
		throws SystemException {
		dmMinistry = toUnwrappedModel(dmMinistry);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dmMinistry)) {
				dmMinistry = (DmMinistry)session.get(DmMinistryImpl.class,
						dmMinistry.getPrimaryKeyObj());
			}

			if (dmMinistry != null) {
				session.delete(dmMinistry);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dmMinistry != null) {
			clearCache(dmMinistry);
		}

		return dmMinistry;
	}

	@Override
	public DmMinistry updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmMinistry dmMinistry)
		throws SystemException {
		dmMinistry = toUnwrappedModel(dmMinistry);

		boolean isNew = dmMinistry.isNew();

		Session session = null;

		try {
			session = openSession();

			if (dmMinistry.isNew()) {
				session.save(dmMinistry);

				dmMinistry.setNew(false);
			}
			else {
				session.merge(dmMinistry);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmMinistryModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(DmMinistryModelImpl.ENTITY_CACHE_ENABLED,
			DmMinistryImpl.class, dmMinistry.getPrimaryKey(), dmMinistry);

		clearUniqueFindersCache(dmMinistry);
		cacheUniqueFindersCache(dmMinistry);

		return dmMinistry;
	}

	protected DmMinistry toUnwrappedModel(DmMinistry dmMinistry) {
		if (dmMinistry instanceof DmMinistryImpl) {
			return dmMinistry;
		}

		DmMinistryImpl dmMinistryImpl = new DmMinistryImpl();

		dmMinistryImpl.setNew(dmMinistry.isNew());
		dmMinistryImpl.setPrimaryKey(dmMinistry.getPrimaryKey());

		dmMinistryImpl.setId(dmMinistry.getId());
		dmMinistryImpl.setMinistryCode(dmMinistry.getMinistryCode());
		dmMinistryImpl.setMinistryName(dmMinistry.getMinistryName());
		dmMinistryImpl.setMinistryNameVN(dmMinistry.getMinistryNameVN());
		dmMinistryImpl.setMinistryOrder(dmMinistry.getMinistryOrder());
		dmMinistryImpl.setIsDelete(dmMinistry.getIsDelete());
		dmMinistryImpl.setMarkedAsDelete(dmMinistry.getMarkedAsDelete());
		dmMinistryImpl.setModifiedDate(dmMinistry.getModifiedDate());
		dmMinistryImpl.setRequestedDate(dmMinistry.getRequestedDate());
		dmMinistryImpl.setSyncVersion(dmMinistry.getSyncVersion());

		return dmMinistryImpl;
	}

	/**
	 * Returns the dm ministry with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm ministry
	 * @return the dm ministry
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmMinistryException if a dm ministry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmMinistry findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDmMinistryException, SystemException {
		DmMinistry dmMinistry = fetchByPrimaryKey(primaryKey);

		if (dmMinistry == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDmMinistryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dmMinistry;
	}

	/**
	 * Returns the dm ministry with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmMinistryException} if it could not be found.
	 *
	 * @param id the primary key of the dm ministry
	 * @return the dm ministry
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmMinistryException if a dm ministry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmMinistry findByPrimaryKey(long id)
		throws NoSuchDmMinistryException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dm ministry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm ministry
	 * @return the dm ministry, or <code>null</code> if a dm ministry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmMinistry fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DmMinistry dmMinistry = (DmMinistry)EntityCacheUtil.getResult(DmMinistryModelImpl.ENTITY_CACHE_ENABLED,
				DmMinistryImpl.class, primaryKey);

		if (dmMinistry == _nullDmMinistry) {
			return null;
		}

		if (dmMinistry == null) {
			Session session = null;

			try {
				session = openSession();

				dmMinistry = (DmMinistry)session.get(DmMinistryImpl.class,
						primaryKey);

				if (dmMinistry != null) {
					cacheResult(dmMinistry);
				}
				else {
					EntityCacheUtil.putResult(DmMinistryModelImpl.ENTITY_CACHE_ENABLED,
						DmMinistryImpl.class, primaryKey, _nullDmMinistry);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DmMinistryModelImpl.ENTITY_CACHE_ENABLED,
					DmMinistryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dmMinistry;
	}

	/**
	 * Returns the dm ministry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm ministry
	 * @return the dm ministry, or <code>null</code> if a dm ministry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmMinistry fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the dm ministries.
	 *
	 * @return the dm ministries
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmMinistry> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm ministries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmMinistryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm ministries
	 * @param end the upper bound of the range of dm ministries (not inclusive)
	 * @return the range of dm ministries
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmMinistry> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm ministries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmMinistryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm ministries
	 * @param end the upper bound of the range of dm ministries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm ministries
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmMinistry> findAll(int start, int end,
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

		List<DmMinistry> list = (List<DmMinistry>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMMINISTRY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMMINISTRY;

				if (pagination) {
					sql = sql.concat(DmMinistryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DmMinistry>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmMinistry>(list);
				}
				else {
					list = (List<DmMinistry>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the dm ministries from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DmMinistry dmMinistry : findAll()) {
			remove(dmMinistry);
		}
	}

	/**
	 * Returns the number of dm ministries.
	 *
	 * @return the number of dm ministries
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

				Query q = session.createQuery(_SQL_COUNT_DMMINISTRY);

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
	 * Initializes the dm ministry persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.DmMinistry")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmMinistry>> listenersList = new ArrayList<ModelListener<DmMinistry>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmMinistry>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmMinistryImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DMMINISTRY = "SELECT dmMinistry FROM DmMinistry dmMinistry";
	private static final String _SQL_SELECT_DMMINISTRY_WHERE = "SELECT dmMinistry FROM DmMinistry dmMinistry WHERE ";
	private static final String _SQL_COUNT_DMMINISTRY = "SELECT COUNT(dmMinistry) FROM DmMinistry dmMinistry";
	private static final String _SQL_COUNT_DMMINISTRY_WHERE = "SELECT COUNT(dmMinistry) FROM DmMinistry dmMinistry WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmMinistry.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmMinistry exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmMinistry exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmMinistryPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "ministryCode", "ministryName", "ministryNameVN",
				"ministryOrder", "isDelete", "markedAsDelete", "modifiedDate",
				"requestedDate", "syncVersion"
			});
	private static DmMinistry _nullDmMinistry = new DmMinistryImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmMinistry> toCacheModel() {
				return _nullDmMinistryCacheModel;
			}
		};

	private static CacheModel<DmMinistry> _nullDmMinistryCacheModel = new CacheModel<DmMinistry>() {
			@Override
			public DmMinistry toEntityModel() {
				return _nullDmMinistry;
			}
		};
}