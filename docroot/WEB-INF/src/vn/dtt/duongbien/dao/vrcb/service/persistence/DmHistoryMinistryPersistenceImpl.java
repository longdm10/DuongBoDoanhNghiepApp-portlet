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

import vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryMinistryException;
import vn.dtt.duongbien.dao.vrcb.model.DmHistoryMinistry;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryMinistryImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryMinistryModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dm history ministry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmHistoryMinistryPersistence
 * @see DmHistoryMinistryUtil
 * @generated
 */
public class DmHistoryMinistryPersistenceImpl extends BasePersistenceImpl<DmHistoryMinistry>
	implements DmHistoryMinistryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmHistoryMinistryUtil} to access the dm history ministry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmHistoryMinistryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryMinistryModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryMinistryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryMinistryModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryMinistryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryMinistryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_MINISTRYCODE = new FinderPath(DmHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryMinistryModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryMinistryImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByMinistryCode", new String[] { String.class.getName() },
			DmHistoryMinistryModelImpl.MINISTRYCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MINISTRYCODE = new FinderPath(DmHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryMinistryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMinistryCode",
			new String[] { String.class.getName() });

	/**
	 * Returns the dm history ministry where ministryCode = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryMinistryException} if it could not be found.
	 *
	 * @param ministryCode the ministry code
	 * @return the matching dm history ministry
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryMinistryException if a matching dm history ministry could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryMinistry findByMinistryCode(String ministryCode)
		throws NoSuchDmHistoryMinistryException, SystemException {
		DmHistoryMinistry dmHistoryMinistry = fetchByMinistryCode(ministryCode);

		if (dmHistoryMinistry == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("ministryCode=");
			msg.append(ministryCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmHistoryMinistryException(msg.toString());
		}

		return dmHistoryMinistry;
	}

	/**
	 * Returns the dm history ministry where ministryCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ministryCode the ministry code
	 * @return the matching dm history ministry, or <code>null</code> if a matching dm history ministry could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryMinistry fetchByMinistryCode(String ministryCode)
		throws SystemException {
		return fetchByMinistryCode(ministryCode, true);
	}

	/**
	 * Returns the dm history ministry where ministryCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ministryCode the ministry code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm history ministry, or <code>null</code> if a matching dm history ministry could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryMinistry fetchByMinistryCode(String ministryCode,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { ministryCode };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_MINISTRYCODE,
					finderArgs, this);
		}

		if (result instanceof DmHistoryMinistry) {
			DmHistoryMinistry dmHistoryMinistry = (DmHistoryMinistry)result;

			if (!Validator.equals(ministryCode,
						dmHistoryMinistry.getMinistryCode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_DMHISTORYMINISTRY_WHERE);

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

				List<DmHistoryMinistry> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MINISTRYCODE,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DmHistoryMinistryPersistenceImpl.fetchByMinistryCode(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DmHistoryMinistry dmHistoryMinistry = list.get(0);

					result = dmHistoryMinistry;

					cacheResult(dmHistoryMinistry);

					if ((dmHistoryMinistry.getMinistryCode() == null) ||
							!dmHistoryMinistry.getMinistryCode()
												  .equals(ministryCode)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MINISTRYCODE,
							finderArgs, dmHistoryMinistry);
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
			return (DmHistoryMinistry)result;
		}
	}

	/**
	 * Removes the dm history ministry where ministryCode = &#63; from the database.
	 *
	 * @param ministryCode the ministry code
	 * @return the dm history ministry that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryMinistry removeByMinistryCode(String ministryCode)
		throws NoSuchDmHistoryMinistryException, SystemException {
		DmHistoryMinistry dmHistoryMinistry = findByMinistryCode(ministryCode);

		return remove(dmHistoryMinistry);
	}

	/**
	 * Returns the number of dm history ministries where ministryCode = &#63;.
	 *
	 * @param ministryCode the ministry code
	 * @return the number of matching dm history ministries
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

			query.append(_SQL_COUNT_DMHISTORYMINISTRY_WHERE);

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

	private static final String _FINDER_COLUMN_MINISTRYCODE_MINISTRYCODE_1 = "dmHistoryMinistry.ministryCode IS NULL";
	private static final String _FINDER_COLUMN_MINISTRYCODE_MINISTRYCODE_2 = "dmHistoryMinistry.ministryCode = ?";
	private static final String _FINDER_COLUMN_MINISTRYCODE_MINISTRYCODE_3 = "(dmHistoryMinistry.ministryCode IS NULL OR dmHistoryMinistry.ministryCode = '')";

	public DmHistoryMinistryPersistenceImpl() {
		setModelClass(DmHistoryMinistry.class);
	}

	/**
	 * Caches the dm history ministry in the entity cache if it is enabled.
	 *
	 * @param dmHistoryMinistry the dm history ministry
	 */
	@Override
	public void cacheResult(DmHistoryMinistry dmHistoryMinistry) {
		EntityCacheUtil.putResult(DmHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryMinistryImpl.class, dmHistoryMinistry.getPrimaryKey(),
			dmHistoryMinistry);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MINISTRYCODE,
			new Object[] { dmHistoryMinistry.getMinistryCode() },
			dmHistoryMinistry);

		dmHistoryMinistry.resetOriginalValues();
	}

	/**
	 * Caches the dm history ministries in the entity cache if it is enabled.
	 *
	 * @param dmHistoryMinistries the dm history ministries
	 */
	@Override
	public void cacheResult(List<DmHistoryMinistry> dmHistoryMinistries) {
		for (DmHistoryMinistry dmHistoryMinistry : dmHistoryMinistries) {
			if (EntityCacheUtil.getResult(
						DmHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryMinistryImpl.class,
						dmHistoryMinistry.getPrimaryKey()) == null) {
				cacheResult(dmHistoryMinistry);
			}
			else {
				dmHistoryMinistry.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm history ministries.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmHistoryMinistryImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmHistoryMinistryImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm history ministry.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmHistoryMinistry dmHistoryMinistry) {
		EntityCacheUtil.removeResult(DmHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryMinistryImpl.class, dmHistoryMinistry.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(dmHistoryMinistry);
	}

	@Override
	public void clearCache(List<DmHistoryMinistry> dmHistoryMinistries) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmHistoryMinistry dmHistoryMinistry : dmHistoryMinistries) {
			EntityCacheUtil.removeResult(DmHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryMinistryImpl.class, dmHistoryMinistry.getPrimaryKey());

			clearUniqueFindersCache(dmHistoryMinistry);
		}
	}

	protected void cacheUniqueFindersCache(DmHistoryMinistry dmHistoryMinistry) {
		if (dmHistoryMinistry.isNew()) {
			Object[] args = new Object[] { dmHistoryMinistry.getMinistryCode() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MINISTRYCODE, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MINISTRYCODE, args,
				dmHistoryMinistry);
		}
		else {
			DmHistoryMinistryModelImpl dmHistoryMinistryModelImpl = (DmHistoryMinistryModelImpl)dmHistoryMinistry;

			if ((dmHistoryMinistryModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_MINISTRYCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { dmHistoryMinistry.getMinistryCode() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MINISTRYCODE,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MINISTRYCODE,
					args, dmHistoryMinistry);
			}
		}
	}

	protected void clearUniqueFindersCache(DmHistoryMinistry dmHistoryMinistry) {
		DmHistoryMinistryModelImpl dmHistoryMinistryModelImpl = (DmHistoryMinistryModelImpl)dmHistoryMinistry;

		Object[] args = new Object[] { dmHistoryMinistry.getMinistryCode() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MINISTRYCODE, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MINISTRYCODE, args);

		if ((dmHistoryMinistryModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_MINISTRYCODE.getColumnBitmask()) != 0) {
			args = new Object[] {
					dmHistoryMinistryModelImpl.getOriginalMinistryCode()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MINISTRYCODE, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MINISTRYCODE, args);
		}
	}

	/**
	 * Creates a new dm history ministry with the primary key. Does not add the dm history ministry to the database.
	 *
	 * @param id the primary key for the new dm history ministry
	 * @return the new dm history ministry
	 */
	@Override
	public DmHistoryMinistry create(long id) {
		DmHistoryMinistry dmHistoryMinistry = new DmHistoryMinistryImpl();

		dmHistoryMinistry.setNew(true);
		dmHistoryMinistry.setPrimaryKey(id);

		return dmHistoryMinistry;
	}

	/**
	 * Removes the dm history ministry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm history ministry
	 * @return the dm history ministry that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryMinistryException if a dm history ministry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryMinistry remove(long id)
		throws NoSuchDmHistoryMinistryException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the dm history ministry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm history ministry
	 * @return the dm history ministry that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryMinistryException if a dm history ministry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryMinistry remove(Serializable primaryKey)
		throws NoSuchDmHistoryMinistryException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmHistoryMinistry dmHistoryMinistry = (DmHistoryMinistry)session.get(DmHistoryMinistryImpl.class,
					primaryKey);

			if (dmHistoryMinistry == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmHistoryMinistryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmHistoryMinistry);
		}
		catch (NoSuchDmHistoryMinistryException nsee) {
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
	protected DmHistoryMinistry removeImpl(DmHistoryMinistry dmHistoryMinistry)
		throws SystemException {
		dmHistoryMinistry = toUnwrappedModel(dmHistoryMinistry);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dmHistoryMinistry)) {
				dmHistoryMinistry = (DmHistoryMinistry)session.get(DmHistoryMinistryImpl.class,
						dmHistoryMinistry.getPrimaryKeyObj());
			}

			if (dmHistoryMinistry != null) {
				session.delete(dmHistoryMinistry);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dmHistoryMinistry != null) {
			clearCache(dmHistoryMinistry);
		}

		return dmHistoryMinistry;
	}

	@Override
	public DmHistoryMinistry updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryMinistry dmHistoryMinistry)
		throws SystemException {
		dmHistoryMinistry = toUnwrappedModel(dmHistoryMinistry);

		boolean isNew = dmHistoryMinistry.isNew();

		Session session = null;

		try {
			session = openSession();

			if (dmHistoryMinistry.isNew()) {
				session.save(dmHistoryMinistry);

				dmHistoryMinistry.setNew(false);
			}
			else {
				session.merge(dmHistoryMinistry);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmHistoryMinistryModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(DmHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryMinistryImpl.class, dmHistoryMinistry.getPrimaryKey(),
			dmHistoryMinistry);

		clearUniqueFindersCache(dmHistoryMinistry);
		cacheUniqueFindersCache(dmHistoryMinistry);

		return dmHistoryMinistry;
	}

	protected DmHistoryMinistry toUnwrappedModel(
		DmHistoryMinistry dmHistoryMinistry) {
		if (dmHistoryMinistry instanceof DmHistoryMinistryImpl) {
			return dmHistoryMinistry;
		}

		DmHistoryMinistryImpl dmHistoryMinistryImpl = new DmHistoryMinistryImpl();

		dmHistoryMinistryImpl.setNew(dmHistoryMinistry.isNew());
		dmHistoryMinistryImpl.setPrimaryKey(dmHistoryMinistry.getPrimaryKey());

		dmHistoryMinistryImpl.setId(dmHistoryMinistry.getId());
		dmHistoryMinistryImpl.setMinistryCode(dmHistoryMinistry.getMinistryCode());
		dmHistoryMinistryImpl.setMinistryName(dmHistoryMinistry.getMinistryName());
		dmHistoryMinistryImpl.setMinistryNameVN(dmHistoryMinistry.getMinistryNameVN());
		dmHistoryMinistryImpl.setMinistryOrder(dmHistoryMinistry.getMinistryOrder());
		dmHistoryMinistryImpl.setIsDelete(dmHistoryMinistry.getIsDelete());
		dmHistoryMinistryImpl.setMarkedAsDelete(dmHistoryMinistry.getMarkedAsDelete());
		dmHistoryMinistryImpl.setModifiedDate(dmHistoryMinistry.getModifiedDate());
		dmHistoryMinistryImpl.setRequestedDate(dmHistoryMinistry.getRequestedDate());
		dmHistoryMinistryImpl.setSyncVersion(dmHistoryMinistry.getSyncVersion());

		return dmHistoryMinistryImpl;
	}

	/**
	 * Returns the dm history ministry with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history ministry
	 * @return the dm history ministry
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryMinistryException if a dm history ministry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryMinistry findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDmHistoryMinistryException, SystemException {
		DmHistoryMinistry dmHistoryMinistry = fetchByPrimaryKey(primaryKey);

		if (dmHistoryMinistry == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDmHistoryMinistryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dmHistoryMinistry;
	}

	/**
	 * Returns the dm history ministry with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryMinistryException} if it could not be found.
	 *
	 * @param id the primary key of the dm history ministry
	 * @return the dm history ministry
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryMinistryException if a dm history ministry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryMinistry findByPrimaryKey(long id)
		throws NoSuchDmHistoryMinistryException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dm history ministry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history ministry
	 * @return the dm history ministry, or <code>null</code> if a dm history ministry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryMinistry fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DmHistoryMinistry dmHistoryMinistry = (DmHistoryMinistry)EntityCacheUtil.getResult(DmHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryMinistryImpl.class, primaryKey);

		if (dmHistoryMinistry == _nullDmHistoryMinistry) {
			return null;
		}

		if (dmHistoryMinistry == null) {
			Session session = null;

			try {
				session = openSession();

				dmHistoryMinistry = (DmHistoryMinistry)session.get(DmHistoryMinistryImpl.class,
						primaryKey);

				if (dmHistoryMinistry != null) {
					cacheResult(dmHistoryMinistry);
				}
				else {
					EntityCacheUtil.putResult(DmHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryMinistryImpl.class, primaryKey,
						_nullDmHistoryMinistry);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DmHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
					DmHistoryMinistryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dmHistoryMinistry;
	}

	/**
	 * Returns the dm history ministry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm history ministry
	 * @return the dm history ministry, or <code>null</code> if a dm history ministry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryMinistry fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the dm history ministries.
	 *
	 * @return the dm history ministries
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryMinistry> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history ministries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryMinistryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history ministries
	 * @param end the upper bound of the range of dm history ministries (not inclusive)
	 * @return the range of dm history ministries
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryMinistry> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history ministries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryMinistryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history ministries
	 * @param end the upper bound of the range of dm history ministries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm history ministries
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryMinistry> findAll(int start, int end,
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

		List<DmHistoryMinistry> list = (List<DmHistoryMinistry>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMHISTORYMINISTRY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMHISTORYMINISTRY;

				if (pagination) {
					sql = sql.concat(DmHistoryMinistryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DmHistoryMinistry>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmHistoryMinistry>(list);
				}
				else {
					list = (List<DmHistoryMinistry>)QueryUtil.list(q,
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
	 * Removes all the dm history ministries from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DmHistoryMinistry dmHistoryMinistry : findAll()) {
			remove(dmHistoryMinistry);
		}
	}

	/**
	 * Returns the number of dm history ministries.
	 *
	 * @return the number of dm history ministries
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

				Query q = session.createQuery(_SQL_COUNT_DMHISTORYMINISTRY);

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
	 * Initializes the dm history ministry persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.DmHistoryMinistry")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmHistoryMinistry>> listenersList = new ArrayList<ModelListener<DmHistoryMinistry>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmHistoryMinistry>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmHistoryMinistryImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DMHISTORYMINISTRY = "SELECT dmHistoryMinistry FROM DmHistoryMinistry dmHistoryMinistry";
	private static final String _SQL_SELECT_DMHISTORYMINISTRY_WHERE = "SELECT dmHistoryMinistry FROM DmHistoryMinistry dmHistoryMinistry WHERE ";
	private static final String _SQL_COUNT_DMHISTORYMINISTRY = "SELECT COUNT(dmHistoryMinistry) FROM DmHistoryMinistry dmHistoryMinistry";
	private static final String _SQL_COUNT_DMHISTORYMINISTRY_WHERE = "SELECT COUNT(dmHistoryMinistry) FROM DmHistoryMinistry dmHistoryMinistry WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmHistoryMinistry.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmHistoryMinistry exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmHistoryMinistry exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmHistoryMinistryPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "ministryCode", "ministryName", "ministryNameVN",
				"ministryOrder", "isDelete", "markedAsDelete", "modifiedDate",
				"requestedDate", "syncVersion"
			});
	private static DmHistoryMinistry _nullDmHistoryMinistry = new DmHistoryMinistryImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmHistoryMinistry> toCacheModel() {
				return _nullDmHistoryMinistryCacheModel;
			}
		};

	private static CacheModel<DmHistoryMinistry> _nullDmHistoryMinistryCacheModel =
		new CacheModel<DmHistoryMinistry>() {
			@Override
			public DmHistoryMinistry toEntityModel() {
				return _nullDmHistoryMinistry;
			}
		};
}