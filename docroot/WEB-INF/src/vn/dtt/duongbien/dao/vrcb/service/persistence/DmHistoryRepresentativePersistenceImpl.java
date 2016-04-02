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

import vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryRepresentativeException;
import vn.dtt.duongbien.dao.vrcb.model.DmHistoryRepresentative;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryRepresentativeImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryRepresentativeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dm history representative service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmHistoryRepresentativePersistence
 * @see DmHistoryRepresentativeUtil
 * @generated
 */
public class DmHistoryRepresentativePersistenceImpl extends BasePersistenceImpl<DmHistoryRepresentative>
	implements DmHistoryRepresentativePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmHistoryRepresentativeUtil} to access the dm history representative persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmHistoryRepresentativeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmHistoryRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRepresentativeModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryRepresentativeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmHistoryRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRepresentativeModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryRepresentativeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmHistoryRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRepresentativeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_REPCODE = new FinderPath(DmHistoryRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRepresentativeModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryRepresentativeImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByRepCode", new String[] { String.class.getName() },
			DmHistoryRepresentativeModelImpl.REPCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REPCODE = new FinderPath(DmHistoryRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRepresentativeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRepCode",
			new String[] { String.class.getName() });

	/**
	 * Returns the dm history representative where repCode = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryRepresentativeException} if it could not be found.
	 *
	 * @param repCode the rep code
	 * @return the matching dm history representative
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryRepresentativeException if a matching dm history representative could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryRepresentative findByRepCode(String repCode)
		throws NoSuchDmHistoryRepresentativeException, SystemException {
		DmHistoryRepresentative dmHistoryRepresentative = fetchByRepCode(repCode);

		if (dmHistoryRepresentative == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("repCode=");
			msg.append(repCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmHistoryRepresentativeException(msg.toString());
		}

		return dmHistoryRepresentative;
	}

	/**
	 * Returns the dm history representative where repCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param repCode the rep code
	 * @return the matching dm history representative, or <code>null</code> if a matching dm history representative could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryRepresentative fetchByRepCode(String repCode)
		throws SystemException {
		return fetchByRepCode(repCode, true);
	}

	/**
	 * Returns the dm history representative where repCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param repCode the rep code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm history representative, or <code>null</code> if a matching dm history representative could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryRepresentative fetchByRepCode(String repCode,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { repCode };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_REPCODE,
					finderArgs, this);
		}

		if (result instanceof DmHistoryRepresentative) {
			DmHistoryRepresentative dmHistoryRepresentative = (DmHistoryRepresentative)result;

			if (!Validator.equals(repCode, dmHistoryRepresentative.getRepCode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_DMHISTORYREPRESENTATIVE_WHERE);

			boolean bindRepCode = false;

			if (repCode == null) {
				query.append(_FINDER_COLUMN_REPCODE_REPCODE_1);
			}
			else if (repCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_REPCODE_REPCODE_3);
			}
			else {
				bindRepCode = true;

				query.append(_FINDER_COLUMN_REPCODE_REPCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRepCode) {
					qPos.add(repCode);
				}

				List<DmHistoryRepresentative> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPCODE,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DmHistoryRepresentativePersistenceImpl.fetchByRepCode(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DmHistoryRepresentative dmHistoryRepresentative = list.get(0);

					result = dmHistoryRepresentative;

					cacheResult(dmHistoryRepresentative);

					if ((dmHistoryRepresentative.getRepCode() == null) ||
							!dmHistoryRepresentative.getRepCode().equals(repCode)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPCODE,
							finderArgs, dmHistoryRepresentative);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REPCODE,
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
			return (DmHistoryRepresentative)result;
		}
	}

	/**
	 * Removes the dm history representative where repCode = &#63; from the database.
	 *
	 * @param repCode the rep code
	 * @return the dm history representative that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryRepresentative removeByRepCode(String repCode)
		throws NoSuchDmHistoryRepresentativeException, SystemException {
		DmHistoryRepresentative dmHistoryRepresentative = findByRepCode(repCode);

		return remove(dmHistoryRepresentative);
	}

	/**
	 * Returns the number of dm history representatives where repCode = &#63;.
	 *
	 * @param repCode the rep code
	 * @return the number of matching dm history representatives
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByRepCode(String repCode) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REPCODE;

		Object[] finderArgs = new Object[] { repCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMHISTORYREPRESENTATIVE_WHERE);

			boolean bindRepCode = false;

			if (repCode == null) {
				query.append(_FINDER_COLUMN_REPCODE_REPCODE_1);
			}
			else if (repCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_REPCODE_REPCODE_3);
			}
			else {
				bindRepCode = true;

				query.append(_FINDER_COLUMN_REPCODE_REPCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRepCode) {
					qPos.add(repCode);
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

	private static final String _FINDER_COLUMN_REPCODE_REPCODE_1 = "dmHistoryRepresentative.repCode IS NULL";
	private static final String _FINDER_COLUMN_REPCODE_REPCODE_2 = "dmHistoryRepresentative.repCode = ?";
	private static final String _FINDER_COLUMN_REPCODE_REPCODE_3 = "(dmHistoryRepresentative.repCode IS NULL OR dmHistoryRepresentative.repCode = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_REPCODEANDSYNCVERSION = new FinderPath(DmHistoryRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRepresentativeModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryRepresentativeImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByRepCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() },
			DmHistoryRepresentativeModelImpl.REPCODE_COLUMN_BITMASK |
			DmHistoryRepresentativeModelImpl.SYNCVERSION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REPCODEANDSYNCVERSION = new FinderPath(DmHistoryRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRepresentativeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByRepCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns the dm history representative where repCode = &#63; and syncVersion = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryRepresentativeException} if it could not be found.
	 *
	 * @param repCode the rep code
	 * @param syncVersion the sync version
	 * @return the matching dm history representative
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryRepresentativeException if a matching dm history representative could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryRepresentative findByRepCodeAndSyncVersion(String repCode,
		String syncVersion)
		throws NoSuchDmHistoryRepresentativeException, SystemException {
		DmHistoryRepresentative dmHistoryRepresentative = fetchByRepCodeAndSyncVersion(repCode,
				syncVersion);

		if (dmHistoryRepresentative == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("repCode=");
			msg.append(repCode);

			msg.append(", syncVersion=");
			msg.append(syncVersion);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmHistoryRepresentativeException(msg.toString());
		}

		return dmHistoryRepresentative;
	}

	/**
	 * Returns the dm history representative where repCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param repCode the rep code
	 * @param syncVersion the sync version
	 * @return the matching dm history representative, or <code>null</code> if a matching dm history representative could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryRepresentative fetchByRepCodeAndSyncVersion(
		String repCode, String syncVersion) throws SystemException {
		return fetchByRepCodeAndSyncVersion(repCode, syncVersion, true);
	}

	/**
	 * Returns the dm history representative where repCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param repCode the rep code
	 * @param syncVersion the sync version
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm history representative, or <code>null</code> if a matching dm history representative could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryRepresentative fetchByRepCodeAndSyncVersion(
		String repCode, String syncVersion, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { repCode, syncVersion };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_REPCODEANDSYNCVERSION,
					finderArgs, this);
		}

		if (result instanceof DmHistoryRepresentative) {
			DmHistoryRepresentative dmHistoryRepresentative = (DmHistoryRepresentative)result;

			if (!Validator.equals(repCode, dmHistoryRepresentative.getRepCode()) ||
					!Validator.equals(syncVersion,
						dmHistoryRepresentative.getSyncVersion())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DMHISTORYREPRESENTATIVE_WHERE);

			boolean bindRepCode = false;

			if (repCode == null) {
				query.append(_FINDER_COLUMN_REPCODEANDSYNCVERSION_REPCODE_1);
			}
			else if (repCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_REPCODEANDSYNCVERSION_REPCODE_3);
			}
			else {
				bindRepCode = true;

				query.append(_FINDER_COLUMN_REPCODEANDSYNCVERSION_REPCODE_2);
			}

			boolean bindSyncVersion = false;

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_REPCODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else if (syncVersion.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_REPCODEANDSYNCVERSION_SYNCVERSION_3);
			}
			else {
				bindSyncVersion = true;

				query.append(_FINDER_COLUMN_REPCODEANDSYNCVERSION_SYNCVERSION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRepCode) {
					qPos.add(repCode);
				}

				if (bindSyncVersion) {
					qPos.add(syncVersion);
				}

				List<DmHistoryRepresentative> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPCODEANDSYNCVERSION,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DmHistoryRepresentativePersistenceImpl.fetchByRepCodeAndSyncVersion(String, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DmHistoryRepresentative dmHistoryRepresentative = list.get(0);

					result = dmHistoryRepresentative;

					cacheResult(dmHistoryRepresentative);

					if ((dmHistoryRepresentative.getRepCode() == null) ||
							!dmHistoryRepresentative.getRepCode().equals(repCode) ||
							(dmHistoryRepresentative.getSyncVersion() == null) ||
							!dmHistoryRepresentative.getSyncVersion()
														.equals(syncVersion)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPCODEANDSYNCVERSION,
							finderArgs, dmHistoryRepresentative);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REPCODEANDSYNCVERSION,
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
			return (DmHistoryRepresentative)result;
		}
	}

	/**
	 * Removes the dm history representative where repCode = &#63; and syncVersion = &#63; from the database.
	 *
	 * @param repCode the rep code
	 * @param syncVersion the sync version
	 * @return the dm history representative that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryRepresentative removeByRepCodeAndSyncVersion(
		String repCode, String syncVersion)
		throws NoSuchDmHistoryRepresentativeException, SystemException {
		DmHistoryRepresentative dmHistoryRepresentative = findByRepCodeAndSyncVersion(repCode,
				syncVersion);

		return remove(dmHistoryRepresentative);
	}

	/**
	 * Returns the number of dm history representatives where repCode = &#63; and syncVersion = &#63;.
	 *
	 * @param repCode the rep code
	 * @param syncVersion the sync version
	 * @return the number of matching dm history representatives
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByRepCodeAndSyncVersion(String repCode, String syncVersion)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REPCODEANDSYNCVERSION;

		Object[] finderArgs = new Object[] { repCode, syncVersion };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMHISTORYREPRESENTATIVE_WHERE);

			boolean bindRepCode = false;

			if (repCode == null) {
				query.append(_FINDER_COLUMN_REPCODEANDSYNCVERSION_REPCODE_1);
			}
			else if (repCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_REPCODEANDSYNCVERSION_REPCODE_3);
			}
			else {
				bindRepCode = true;

				query.append(_FINDER_COLUMN_REPCODEANDSYNCVERSION_REPCODE_2);
			}

			boolean bindSyncVersion = false;

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_REPCODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else if (syncVersion.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_REPCODEANDSYNCVERSION_SYNCVERSION_3);
			}
			else {
				bindSyncVersion = true;

				query.append(_FINDER_COLUMN_REPCODEANDSYNCVERSION_SYNCVERSION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRepCode) {
					qPos.add(repCode);
				}

				if (bindSyncVersion) {
					qPos.add(syncVersion);
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

	private static final String _FINDER_COLUMN_REPCODEANDSYNCVERSION_REPCODE_1 = "dmHistoryRepresentative.repCode IS NULL AND ";
	private static final String _FINDER_COLUMN_REPCODEANDSYNCVERSION_REPCODE_2 = "dmHistoryRepresentative.repCode = ? AND ";
	private static final String _FINDER_COLUMN_REPCODEANDSYNCVERSION_REPCODE_3 = "(dmHistoryRepresentative.repCode IS NULL OR dmHistoryRepresentative.repCode = '') AND ";
	private static final String _FINDER_COLUMN_REPCODEANDSYNCVERSION_SYNCVERSION_1 =
		"dmHistoryRepresentative.syncVersion IS NULL";
	private static final String _FINDER_COLUMN_REPCODEANDSYNCVERSION_SYNCVERSION_2 =
		"dmHistoryRepresentative.syncVersion = ?";
	private static final String _FINDER_COLUMN_REPCODEANDSYNCVERSION_SYNCVERSION_3 =
		"(dmHistoryRepresentative.syncVersion IS NULL OR dmHistoryRepresentative.syncVersion = '')";

	public DmHistoryRepresentativePersistenceImpl() {
		setModelClass(DmHistoryRepresentative.class);
	}

	/**
	 * Caches the dm history representative in the entity cache if it is enabled.
	 *
	 * @param dmHistoryRepresentative the dm history representative
	 */
	@Override
	public void cacheResult(DmHistoryRepresentative dmHistoryRepresentative) {
		EntityCacheUtil.putResult(DmHistoryRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRepresentativeImpl.class,
			dmHistoryRepresentative.getPrimaryKey(), dmHistoryRepresentative);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPCODE,
			new Object[] { dmHistoryRepresentative.getRepCode() },
			dmHistoryRepresentative);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPCODEANDSYNCVERSION,
			new Object[] {
				dmHistoryRepresentative.getRepCode(),
				dmHistoryRepresentative.getSyncVersion()
			}, dmHistoryRepresentative);

		dmHistoryRepresentative.resetOriginalValues();
	}

	/**
	 * Caches the dm history representatives in the entity cache if it is enabled.
	 *
	 * @param dmHistoryRepresentatives the dm history representatives
	 */
	@Override
	public void cacheResult(
		List<DmHistoryRepresentative> dmHistoryRepresentatives) {
		for (DmHistoryRepresentative dmHistoryRepresentative : dmHistoryRepresentatives) {
			if (EntityCacheUtil.getResult(
						DmHistoryRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryRepresentativeImpl.class,
						dmHistoryRepresentative.getPrimaryKey()) == null) {
				cacheResult(dmHistoryRepresentative);
			}
			else {
				dmHistoryRepresentative.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm history representatives.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmHistoryRepresentativeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmHistoryRepresentativeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm history representative.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmHistoryRepresentative dmHistoryRepresentative) {
		EntityCacheUtil.removeResult(DmHistoryRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRepresentativeImpl.class,
			dmHistoryRepresentative.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(dmHistoryRepresentative);
	}

	@Override
	public void clearCache(
		List<DmHistoryRepresentative> dmHistoryRepresentatives) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmHistoryRepresentative dmHistoryRepresentative : dmHistoryRepresentatives) {
			EntityCacheUtil.removeResult(DmHistoryRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryRepresentativeImpl.class,
				dmHistoryRepresentative.getPrimaryKey());

			clearUniqueFindersCache(dmHistoryRepresentative);
		}
	}

	protected void cacheUniqueFindersCache(
		DmHistoryRepresentative dmHistoryRepresentative) {
		if (dmHistoryRepresentative.isNew()) {
			Object[] args = new Object[] { dmHistoryRepresentative.getRepCode() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REPCODE, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPCODE, args,
				dmHistoryRepresentative);

			args = new Object[] {
					dmHistoryRepresentative.getRepCode(),
					dmHistoryRepresentative.getSyncVersion()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REPCODEANDSYNCVERSION,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPCODEANDSYNCVERSION,
				args, dmHistoryRepresentative);
		}
		else {
			DmHistoryRepresentativeModelImpl dmHistoryRepresentativeModelImpl = (DmHistoryRepresentativeModelImpl)dmHistoryRepresentative;

			if ((dmHistoryRepresentativeModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_REPCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryRepresentative.getRepCode()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REPCODE, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPCODE, args,
					dmHistoryRepresentative);
			}

			if ((dmHistoryRepresentativeModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_REPCODEANDSYNCVERSION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryRepresentative.getRepCode(),
						dmHistoryRepresentative.getSyncVersion()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REPCODEANDSYNCVERSION,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPCODEANDSYNCVERSION,
					args, dmHistoryRepresentative);
			}
		}
	}

	protected void clearUniqueFindersCache(
		DmHistoryRepresentative dmHistoryRepresentative) {
		DmHistoryRepresentativeModelImpl dmHistoryRepresentativeModelImpl = (DmHistoryRepresentativeModelImpl)dmHistoryRepresentative;

		Object[] args = new Object[] { dmHistoryRepresentative.getRepCode() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REPCODE, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REPCODE, args);

		if ((dmHistoryRepresentativeModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_REPCODE.getColumnBitmask()) != 0) {
			args = new Object[] {
					dmHistoryRepresentativeModelImpl.getOriginalRepCode()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REPCODE, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REPCODE, args);
		}

		args = new Object[] {
				dmHistoryRepresentative.getRepCode(),
				dmHistoryRepresentative.getSyncVersion()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REPCODEANDSYNCVERSION,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REPCODEANDSYNCVERSION,
			args);

		if ((dmHistoryRepresentativeModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_REPCODEANDSYNCVERSION.getColumnBitmask()) != 0) {
			args = new Object[] {
					dmHistoryRepresentativeModelImpl.getOriginalRepCode(),
					dmHistoryRepresentativeModelImpl.getOriginalSyncVersion()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REPCODEANDSYNCVERSION,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REPCODEANDSYNCVERSION,
				args);
		}
	}

	/**
	 * Creates a new dm history representative with the primary key. Does not add the dm history representative to the database.
	 *
	 * @param id the primary key for the new dm history representative
	 * @return the new dm history representative
	 */
	@Override
	public DmHistoryRepresentative create(int id) {
		DmHistoryRepresentative dmHistoryRepresentative = new DmHistoryRepresentativeImpl();

		dmHistoryRepresentative.setNew(true);
		dmHistoryRepresentative.setPrimaryKey(id);

		return dmHistoryRepresentative;
	}

	/**
	 * Removes the dm history representative with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm history representative
	 * @return the dm history representative that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryRepresentativeException if a dm history representative with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryRepresentative remove(int id)
		throws NoSuchDmHistoryRepresentativeException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the dm history representative with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm history representative
	 * @return the dm history representative that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryRepresentativeException if a dm history representative with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryRepresentative remove(Serializable primaryKey)
		throws NoSuchDmHistoryRepresentativeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmHistoryRepresentative dmHistoryRepresentative = (DmHistoryRepresentative)session.get(DmHistoryRepresentativeImpl.class,
					primaryKey);

			if (dmHistoryRepresentative == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmHistoryRepresentativeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmHistoryRepresentative);
		}
		catch (NoSuchDmHistoryRepresentativeException nsee) {
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
	protected DmHistoryRepresentative removeImpl(
		DmHistoryRepresentative dmHistoryRepresentative)
		throws SystemException {
		dmHistoryRepresentative = toUnwrappedModel(dmHistoryRepresentative);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dmHistoryRepresentative)) {
				dmHistoryRepresentative = (DmHistoryRepresentative)session.get(DmHistoryRepresentativeImpl.class,
						dmHistoryRepresentative.getPrimaryKeyObj());
			}

			if (dmHistoryRepresentative != null) {
				session.delete(dmHistoryRepresentative);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dmHistoryRepresentative != null) {
			clearCache(dmHistoryRepresentative);
		}

		return dmHistoryRepresentative;
	}

	@Override
	public DmHistoryRepresentative updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryRepresentative dmHistoryRepresentative)
		throws SystemException {
		dmHistoryRepresentative = toUnwrappedModel(dmHistoryRepresentative);

		boolean isNew = dmHistoryRepresentative.isNew();

		Session session = null;

		try {
			session = openSession();

			if (dmHistoryRepresentative.isNew()) {
				session.save(dmHistoryRepresentative);

				dmHistoryRepresentative.setNew(false);
			}
			else {
				session.merge(dmHistoryRepresentative);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmHistoryRepresentativeModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(DmHistoryRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRepresentativeImpl.class,
			dmHistoryRepresentative.getPrimaryKey(), dmHistoryRepresentative);

		clearUniqueFindersCache(dmHistoryRepresentative);
		cacheUniqueFindersCache(dmHistoryRepresentative);

		return dmHistoryRepresentative;
	}

	protected DmHistoryRepresentative toUnwrappedModel(
		DmHistoryRepresentative dmHistoryRepresentative) {
		if (dmHistoryRepresentative instanceof DmHistoryRepresentativeImpl) {
			return dmHistoryRepresentative;
		}

		DmHistoryRepresentativeImpl dmHistoryRepresentativeImpl = new DmHistoryRepresentativeImpl();

		dmHistoryRepresentativeImpl.setNew(dmHistoryRepresentative.isNew());
		dmHistoryRepresentativeImpl.setPrimaryKey(dmHistoryRepresentative.getPrimaryKey());

		dmHistoryRepresentativeImpl.setId(dmHistoryRepresentative.getId());
		dmHistoryRepresentativeImpl.setRepCode(dmHistoryRepresentative.getRepCode());
		dmHistoryRepresentativeImpl.setRepName(dmHistoryRepresentative.getRepName());
		dmHistoryRepresentativeImpl.setRepNameVN(dmHistoryRepresentative.getRepNameVN());
		dmHistoryRepresentativeImpl.setRepOrder(dmHistoryRepresentative.getRepOrder());
		dmHistoryRepresentativeImpl.setMaritimeCode(dmHistoryRepresentative.getMaritimeCode());
		dmHistoryRepresentativeImpl.setIsDelete(dmHistoryRepresentative.getIsDelete());
		dmHistoryRepresentativeImpl.setMarkedAsDelete(dmHistoryRepresentative.getMarkedAsDelete());
		dmHistoryRepresentativeImpl.setModifiedDate(dmHistoryRepresentative.getModifiedDate());
		dmHistoryRepresentativeImpl.setRequestedDate(dmHistoryRepresentative.getRequestedDate());
		dmHistoryRepresentativeImpl.setSyncVersion(dmHistoryRepresentative.getSyncVersion());

		return dmHistoryRepresentativeImpl;
	}

	/**
	 * Returns the dm history representative with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history representative
	 * @return the dm history representative
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryRepresentativeException if a dm history representative with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryRepresentative findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDmHistoryRepresentativeException, SystemException {
		DmHistoryRepresentative dmHistoryRepresentative = fetchByPrimaryKey(primaryKey);

		if (dmHistoryRepresentative == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDmHistoryRepresentativeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dmHistoryRepresentative;
	}

	/**
	 * Returns the dm history representative with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryRepresentativeException} if it could not be found.
	 *
	 * @param id the primary key of the dm history representative
	 * @return the dm history representative
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryRepresentativeException if a dm history representative with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryRepresentative findByPrimaryKey(int id)
		throws NoSuchDmHistoryRepresentativeException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dm history representative with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history representative
	 * @return the dm history representative, or <code>null</code> if a dm history representative with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryRepresentative fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DmHistoryRepresentative dmHistoryRepresentative = (DmHistoryRepresentative)EntityCacheUtil.getResult(DmHistoryRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryRepresentativeImpl.class, primaryKey);

		if (dmHistoryRepresentative == _nullDmHistoryRepresentative) {
			return null;
		}

		if (dmHistoryRepresentative == null) {
			Session session = null;

			try {
				session = openSession();

				dmHistoryRepresentative = (DmHistoryRepresentative)session.get(DmHistoryRepresentativeImpl.class,
						primaryKey);

				if (dmHistoryRepresentative != null) {
					cacheResult(dmHistoryRepresentative);
				}
				else {
					EntityCacheUtil.putResult(DmHistoryRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryRepresentativeImpl.class, primaryKey,
						_nullDmHistoryRepresentative);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DmHistoryRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
					DmHistoryRepresentativeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dmHistoryRepresentative;
	}

	/**
	 * Returns the dm history representative with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm history representative
	 * @return the dm history representative, or <code>null</code> if a dm history representative with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryRepresentative fetchByPrimaryKey(int id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the dm history representatives.
	 *
	 * @return the dm history representatives
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryRepresentative> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history representatives.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryRepresentativeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history representatives
	 * @param end the upper bound of the range of dm history representatives (not inclusive)
	 * @return the range of dm history representatives
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryRepresentative> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history representatives.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryRepresentativeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history representatives
	 * @param end the upper bound of the range of dm history representatives (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm history representatives
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryRepresentative> findAll(int start, int end,
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

		List<DmHistoryRepresentative> list = (List<DmHistoryRepresentative>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMHISTORYREPRESENTATIVE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMHISTORYREPRESENTATIVE;

				if (pagination) {
					sql = sql.concat(DmHistoryRepresentativeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DmHistoryRepresentative>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmHistoryRepresentative>(list);
				}
				else {
					list = (List<DmHistoryRepresentative>)QueryUtil.list(q,
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
	 * Removes all the dm history representatives from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DmHistoryRepresentative dmHistoryRepresentative : findAll()) {
			remove(dmHistoryRepresentative);
		}
	}

	/**
	 * Returns the number of dm history representatives.
	 *
	 * @return the number of dm history representatives
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

				Query q = session.createQuery(_SQL_COUNT_DMHISTORYREPRESENTATIVE);

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
	 * Initializes the dm history representative persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.DmHistoryRepresentative")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmHistoryRepresentative>> listenersList = new ArrayList<ModelListener<DmHistoryRepresentative>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmHistoryRepresentative>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmHistoryRepresentativeImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DMHISTORYREPRESENTATIVE = "SELECT dmHistoryRepresentative FROM DmHistoryRepresentative dmHistoryRepresentative";
	private static final String _SQL_SELECT_DMHISTORYREPRESENTATIVE_WHERE = "SELECT dmHistoryRepresentative FROM DmHistoryRepresentative dmHistoryRepresentative WHERE ";
	private static final String _SQL_COUNT_DMHISTORYREPRESENTATIVE = "SELECT COUNT(dmHistoryRepresentative) FROM DmHistoryRepresentative dmHistoryRepresentative";
	private static final String _SQL_COUNT_DMHISTORYREPRESENTATIVE_WHERE = "SELECT COUNT(dmHistoryRepresentative) FROM DmHistoryRepresentative dmHistoryRepresentative WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmHistoryRepresentative.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmHistoryRepresentative exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmHistoryRepresentative exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmHistoryRepresentativePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"repCode", "repName", "repNameVN", "repOrder", "maritimeCode",
				"isDelete", "markedAsDelete", "modifiedDate", "requestedDate",
				"syncVersion"
			});
	private static DmHistoryRepresentative _nullDmHistoryRepresentative = new DmHistoryRepresentativeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmHistoryRepresentative> toCacheModel() {
				return _nullDmHistoryRepresentativeCacheModel;
			}
		};

	private static CacheModel<DmHistoryRepresentative> _nullDmHistoryRepresentativeCacheModel =
		new CacheModel<DmHistoryRepresentative>() {
			@Override
			public DmHistoryRepresentative toEntityModel() {
				return _nullDmHistoryRepresentative;
			}
		};
}