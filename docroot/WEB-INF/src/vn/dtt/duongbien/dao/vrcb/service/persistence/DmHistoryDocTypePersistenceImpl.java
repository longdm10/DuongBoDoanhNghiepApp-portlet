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

import vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryDocTypeException;
import vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryDocTypeImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryDocTypeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dm history doc type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmHistoryDocTypePersistence
 * @see DmHistoryDocTypeUtil
 * @generated
 */
public class DmHistoryDocTypePersistenceImpl extends BasePersistenceImpl<DmHistoryDocType>
	implements DmHistoryDocTypePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmHistoryDocTypeUtil} to access the dm history doc type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmHistoryDocTypeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmHistoryDocTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryDocTypeModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryDocTypeImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmHistoryDocTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryDocTypeModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryDocTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmHistoryDocTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryDocTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_DOCUMENTTYPE = new FinderPath(DmHistoryDocTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryDocTypeModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryDocTypeImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByDocumentType", new String[] { String.class.getName() },
			DmHistoryDocTypeModelImpl.DOCUMENTTYPE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTTYPE = new FinderPath(DmHistoryDocTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryDocTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDocumentType",
			new String[] { String.class.getName() });

	/**
	 * Returns the dm history doc type where documentType = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryDocTypeException} if it could not be found.
	 *
	 * @param documentType the document type
	 * @return the matching dm history doc type
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryDocTypeException if a matching dm history doc type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryDocType findByDocumentType(String documentType)
		throws NoSuchDmHistoryDocTypeException, SystemException {
		DmHistoryDocType dmHistoryDocType = fetchByDocumentType(documentType);

		if (dmHistoryDocType == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentType=");
			msg.append(documentType);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmHistoryDocTypeException(msg.toString());
		}

		return dmHistoryDocType;
	}

	/**
	 * Returns the dm history doc type where documentType = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param documentType the document type
	 * @return the matching dm history doc type, or <code>null</code> if a matching dm history doc type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryDocType fetchByDocumentType(String documentType)
		throws SystemException {
		return fetchByDocumentType(documentType, true);
	}

	/**
	 * Returns the dm history doc type where documentType = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param documentType the document type
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm history doc type, or <code>null</code> if a matching dm history doc type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryDocType fetchByDocumentType(String documentType,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { documentType };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_DOCUMENTTYPE,
					finderArgs, this);
		}

		if (result instanceof DmHistoryDocType) {
			DmHistoryDocType dmHistoryDocType = (DmHistoryDocType)result;

			if (!Validator.equals(documentType,
						dmHistoryDocType.getDocumentType())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_DMHISTORYDOCTYPE_WHERE);

			boolean bindDocumentType = false;

			if (documentType == null) {
				query.append(_FINDER_COLUMN_DOCUMENTTYPE_DOCUMENTTYPE_1);
			}
			else if (documentType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCUMENTTYPE_DOCUMENTTYPE_3);
			}
			else {
				bindDocumentType = true;

				query.append(_FINDER_COLUMN_DOCUMENTTYPE_DOCUMENTTYPE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDocumentType) {
					qPos.add(documentType);
				}

				List<DmHistoryDocType> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTTYPE,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DmHistoryDocTypePersistenceImpl.fetchByDocumentType(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DmHistoryDocType dmHistoryDocType = list.get(0);

					result = dmHistoryDocType;

					cacheResult(dmHistoryDocType);

					if ((dmHistoryDocType.getDocumentType() == null) ||
							!dmHistoryDocType.getDocumentType()
												 .equals(documentType)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTTYPE,
							finderArgs, dmHistoryDocType);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DOCUMENTTYPE,
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
			return (DmHistoryDocType)result;
		}
	}

	/**
	 * Removes the dm history doc type where documentType = &#63; from the database.
	 *
	 * @param documentType the document type
	 * @return the dm history doc type that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryDocType removeByDocumentType(String documentType)
		throws NoSuchDmHistoryDocTypeException, SystemException {
		DmHistoryDocType dmHistoryDocType = findByDocumentType(documentType);

		return remove(dmHistoryDocType);
	}

	/**
	 * Returns the number of dm history doc types where documentType = &#63;.
	 *
	 * @param documentType the document type
	 * @return the number of matching dm history doc types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDocumentType(String documentType)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOCUMENTTYPE;

		Object[] finderArgs = new Object[] { documentType };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMHISTORYDOCTYPE_WHERE);

			boolean bindDocumentType = false;

			if (documentType == null) {
				query.append(_FINDER_COLUMN_DOCUMENTTYPE_DOCUMENTTYPE_1);
			}
			else if (documentType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCUMENTTYPE_DOCUMENTTYPE_3);
			}
			else {
				bindDocumentType = true;

				query.append(_FINDER_COLUMN_DOCUMENTTYPE_DOCUMENTTYPE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDocumentType) {
					qPos.add(documentType);
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

	private static final String _FINDER_COLUMN_DOCUMENTTYPE_DOCUMENTTYPE_1 = "dmHistoryDocType.documentType IS NULL";
	private static final String _FINDER_COLUMN_DOCUMENTTYPE_DOCUMENTTYPE_2 = "dmHistoryDocType.documentType = ?";
	private static final String _FINDER_COLUMN_DOCUMENTTYPE_DOCUMENTTYPE_3 = "(dmHistoryDocType.documentType IS NULL OR dmHistoryDocType.documentType = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_DOCUMENTTYPEANDSYNCVERSION =
		new FinderPath(DmHistoryDocTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryDocTypeModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryDocTypeImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByDocumentTypeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() },
			DmHistoryDocTypeModelImpl.DOCUMENTTYPE_COLUMN_BITMASK |
			DmHistoryDocTypeModelImpl.SYNCVERSION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTTYPEANDSYNCVERSION =
		new FinderPath(DmHistoryDocTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryDocTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDocumentTypeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns the dm history doc type where documentType = &#63; and syncVersion = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryDocTypeException} if it could not be found.
	 *
	 * @param documentType the document type
	 * @param syncVersion the sync version
	 * @return the matching dm history doc type
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryDocTypeException if a matching dm history doc type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryDocType findByDocumentTypeAndSyncVersion(
		String documentType, String syncVersion)
		throws NoSuchDmHistoryDocTypeException, SystemException {
		DmHistoryDocType dmHistoryDocType = fetchByDocumentTypeAndSyncVersion(documentType,
				syncVersion);

		if (dmHistoryDocType == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentType=");
			msg.append(documentType);

			msg.append(", syncVersion=");
			msg.append(syncVersion);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmHistoryDocTypeException(msg.toString());
		}

		return dmHistoryDocType;
	}

	/**
	 * Returns the dm history doc type where documentType = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param documentType the document type
	 * @param syncVersion the sync version
	 * @return the matching dm history doc type, or <code>null</code> if a matching dm history doc type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryDocType fetchByDocumentTypeAndSyncVersion(
		String documentType, String syncVersion) throws SystemException {
		return fetchByDocumentTypeAndSyncVersion(documentType, syncVersion, true);
	}

	/**
	 * Returns the dm history doc type where documentType = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param documentType the document type
	 * @param syncVersion the sync version
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm history doc type, or <code>null</code> if a matching dm history doc type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryDocType fetchByDocumentTypeAndSyncVersion(
		String documentType, String syncVersion, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { documentType, syncVersion };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_DOCUMENTTYPEANDSYNCVERSION,
					finderArgs, this);
		}

		if (result instanceof DmHistoryDocType) {
			DmHistoryDocType dmHistoryDocType = (DmHistoryDocType)result;

			if (!Validator.equals(documentType,
						dmHistoryDocType.getDocumentType()) ||
					!Validator.equals(syncVersion,
						dmHistoryDocType.getSyncVersion())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DMHISTORYDOCTYPE_WHERE);

			boolean bindDocumentType = false;

			if (documentType == null) {
				query.append(_FINDER_COLUMN_DOCUMENTTYPEANDSYNCVERSION_DOCUMENTTYPE_1);
			}
			else if (documentType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCUMENTTYPEANDSYNCVERSION_DOCUMENTTYPE_3);
			}
			else {
				bindDocumentType = true;

				query.append(_FINDER_COLUMN_DOCUMENTTYPEANDSYNCVERSION_DOCUMENTTYPE_2);
			}

			boolean bindSyncVersion = false;

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_DOCUMENTTYPEANDSYNCVERSION_SYNCVERSION_1);
			}
			else if (syncVersion.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCUMENTTYPEANDSYNCVERSION_SYNCVERSION_3);
			}
			else {
				bindSyncVersion = true;

				query.append(_FINDER_COLUMN_DOCUMENTTYPEANDSYNCVERSION_SYNCVERSION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDocumentType) {
					qPos.add(documentType);
				}

				if (bindSyncVersion) {
					qPos.add(syncVersion);
				}

				List<DmHistoryDocType> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTTYPEANDSYNCVERSION,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DmHistoryDocTypePersistenceImpl.fetchByDocumentTypeAndSyncVersion(String, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DmHistoryDocType dmHistoryDocType = list.get(0);

					result = dmHistoryDocType;

					cacheResult(dmHistoryDocType);

					if ((dmHistoryDocType.getDocumentType() == null) ||
							!dmHistoryDocType.getDocumentType()
												 .equals(documentType) ||
							(dmHistoryDocType.getSyncVersion() == null) ||
							!dmHistoryDocType.getSyncVersion()
												 .equals(syncVersion)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTTYPEANDSYNCVERSION,
							finderArgs, dmHistoryDocType);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DOCUMENTTYPEANDSYNCVERSION,
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
			return (DmHistoryDocType)result;
		}
	}

	/**
	 * Removes the dm history doc type where documentType = &#63; and syncVersion = &#63; from the database.
	 *
	 * @param documentType the document type
	 * @param syncVersion the sync version
	 * @return the dm history doc type that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryDocType removeByDocumentTypeAndSyncVersion(
		String documentType, String syncVersion)
		throws NoSuchDmHistoryDocTypeException, SystemException {
		DmHistoryDocType dmHistoryDocType = findByDocumentTypeAndSyncVersion(documentType,
				syncVersion);

		return remove(dmHistoryDocType);
	}

	/**
	 * Returns the number of dm history doc types where documentType = &#63; and syncVersion = &#63;.
	 *
	 * @param documentType the document type
	 * @param syncVersion the sync version
	 * @return the number of matching dm history doc types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDocumentTypeAndSyncVersion(String documentType,
		String syncVersion) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOCUMENTTYPEANDSYNCVERSION;

		Object[] finderArgs = new Object[] { documentType, syncVersion };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMHISTORYDOCTYPE_WHERE);

			boolean bindDocumentType = false;

			if (documentType == null) {
				query.append(_FINDER_COLUMN_DOCUMENTTYPEANDSYNCVERSION_DOCUMENTTYPE_1);
			}
			else if (documentType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCUMENTTYPEANDSYNCVERSION_DOCUMENTTYPE_3);
			}
			else {
				bindDocumentType = true;

				query.append(_FINDER_COLUMN_DOCUMENTTYPEANDSYNCVERSION_DOCUMENTTYPE_2);
			}

			boolean bindSyncVersion = false;

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_DOCUMENTTYPEANDSYNCVERSION_SYNCVERSION_1);
			}
			else if (syncVersion.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCUMENTTYPEANDSYNCVERSION_SYNCVERSION_3);
			}
			else {
				bindSyncVersion = true;

				query.append(_FINDER_COLUMN_DOCUMENTTYPEANDSYNCVERSION_SYNCVERSION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDocumentType) {
					qPos.add(documentType);
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

	private static final String _FINDER_COLUMN_DOCUMENTTYPEANDSYNCVERSION_DOCUMENTTYPE_1 =
		"dmHistoryDocType.documentType IS NULL AND ";
	private static final String _FINDER_COLUMN_DOCUMENTTYPEANDSYNCVERSION_DOCUMENTTYPE_2 =
		"dmHistoryDocType.documentType = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTTYPEANDSYNCVERSION_DOCUMENTTYPE_3 =
		"(dmHistoryDocType.documentType IS NULL OR dmHistoryDocType.documentType = '') AND ";
	private static final String _FINDER_COLUMN_DOCUMENTTYPEANDSYNCVERSION_SYNCVERSION_1 =
		"dmHistoryDocType.syncVersion IS NULL";
	private static final String _FINDER_COLUMN_DOCUMENTTYPEANDSYNCVERSION_SYNCVERSION_2 =
		"dmHistoryDocType.syncVersion = ?";
	private static final String _FINDER_COLUMN_DOCUMENTTYPEANDSYNCVERSION_SYNCVERSION_3 =
		"(dmHistoryDocType.syncVersion IS NULL OR dmHistoryDocType.syncVersion = '')";

	public DmHistoryDocTypePersistenceImpl() {
		setModelClass(DmHistoryDocType.class);
	}

	/**
	 * Caches the dm history doc type in the entity cache if it is enabled.
	 *
	 * @param dmHistoryDocType the dm history doc type
	 */
	@Override
	public void cacheResult(DmHistoryDocType dmHistoryDocType) {
		EntityCacheUtil.putResult(DmHistoryDocTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryDocTypeImpl.class, dmHistoryDocType.getPrimaryKey(),
			dmHistoryDocType);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTTYPE,
			new Object[] { dmHistoryDocType.getDocumentType() },
			dmHistoryDocType);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTTYPEANDSYNCVERSION,
			new Object[] {
				dmHistoryDocType.getDocumentType(),
				dmHistoryDocType.getSyncVersion()
			}, dmHistoryDocType);

		dmHistoryDocType.resetOriginalValues();
	}

	/**
	 * Caches the dm history doc types in the entity cache if it is enabled.
	 *
	 * @param dmHistoryDocTypes the dm history doc types
	 */
	@Override
	public void cacheResult(List<DmHistoryDocType> dmHistoryDocTypes) {
		for (DmHistoryDocType dmHistoryDocType : dmHistoryDocTypes) {
			if (EntityCacheUtil.getResult(
						DmHistoryDocTypeModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryDocTypeImpl.class,
						dmHistoryDocType.getPrimaryKey()) == null) {
				cacheResult(dmHistoryDocType);
			}
			else {
				dmHistoryDocType.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm history doc types.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmHistoryDocTypeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmHistoryDocTypeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm history doc type.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmHistoryDocType dmHistoryDocType) {
		EntityCacheUtil.removeResult(DmHistoryDocTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryDocTypeImpl.class, dmHistoryDocType.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(dmHistoryDocType);
	}

	@Override
	public void clearCache(List<DmHistoryDocType> dmHistoryDocTypes) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmHistoryDocType dmHistoryDocType : dmHistoryDocTypes) {
			EntityCacheUtil.removeResult(DmHistoryDocTypeModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryDocTypeImpl.class, dmHistoryDocType.getPrimaryKey());

			clearUniqueFindersCache(dmHistoryDocType);
		}
	}

	protected void cacheUniqueFindersCache(DmHistoryDocType dmHistoryDocType) {
		if (dmHistoryDocType.isNew()) {
			Object[] args = new Object[] { dmHistoryDocType.getDocumentType() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOCUMENTTYPE, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTTYPE, args,
				dmHistoryDocType);

			args = new Object[] {
					dmHistoryDocType.getDocumentType(),
					dmHistoryDocType.getSyncVersion()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOCUMENTTYPEANDSYNCVERSION,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTTYPEANDSYNCVERSION,
				args, dmHistoryDocType);
		}
		else {
			DmHistoryDocTypeModelImpl dmHistoryDocTypeModelImpl = (DmHistoryDocTypeModelImpl)dmHistoryDocType;

			if ((dmHistoryDocTypeModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_DOCUMENTTYPE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { dmHistoryDocType.getDocumentType() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOCUMENTTYPE,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTTYPE,
					args, dmHistoryDocType);
			}

			if ((dmHistoryDocTypeModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_DOCUMENTTYPEANDSYNCVERSION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryDocType.getDocumentType(),
						dmHistoryDocType.getSyncVersion()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOCUMENTTYPEANDSYNCVERSION,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTTYPEANDSYNCVERSION,
					args, dmHistoryDocType);
			}
		}
	}

	protected void clearUniqueFindersCache(DmHistoryDocType dmHistoryDocType) {
		DmHistoryDocTypeModelImpl dmHistoryDocTypeModelImpl = (DmHistoryDocTypeModelImpl)dmHistoryDocType;

		Object[] args = new Object[] { dmHistoryDocType.getDocumentType() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTTYPE, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DOCUMENTTYPE, args);

		if ((dmHistoryDocTypeModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_DOCUMENTTYPE.getColumnBitmask()) != 0) {
			args = new Object[] {
					dmHistoryDocTypeModelImpl.getOriginalDocumentType()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTTYPE, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DOCUMENTTYPE, args);
		}

		args = new Object[] {
				dmHistoryDocType.getDocumentType(),
				dmHistoryDocType.getSyncVersion()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTTYPEANDSYNCVERSION,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DOCUMENTTYPEANDSYNCVERSION,
			args);

		if ((dmHistoryDocTypeModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_DOCUMENTTYPEANDSYNCVERSION.getColumnBitmask()) != 0) {
			args = new Object[] {
					dmHistoryDocTypeModelImpl.getOriginalDocumentType(),
					dmHistoryDocTypeModelImpl.getOriginalSyncVersion()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTTYPEANDSYNCVERSION,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DOCUMENTTYPEANDSYNCVERSION,
				args);
		}
	}

	/**
	 * Creates a new dm history doc type with the primary key. Does not add the dm history doc type to the database.
	 *
	 * @param id the primary key for the new dm history doc type
	 * @return the new dm history doc type
	 */
	@Override
	public DmHistoryDocType create(int id) {
		DmHistoryDocType dmHistoryDocType = new DmHistoryDocTypeImpl();

		dmHistoryDocType.setNew(true);
		dmHistoryDocType.setPrimaryKey(id);

		return dmHistoryDocType;
	}

	/**
	 * Removes the dm history doc type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm history doc type
	 * @return the dm history doc type that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryDocTypeException if a dm history doc type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryDocType remove(int id)
		throws NoSuchDmHistoryDocTypeException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the dm history doc type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm history doc type
	 * @return the dm history doc type that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryDocTypeException if a dm history doc type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryDocType remove(Serializable primaryKey)
		throws NoSuchDmHistoryDocTypeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmHistoryDocType dmHistoryDocType = (DmHistoryDocType)session.get(DmHistoryDocTypeImpl.class,
					primaryKey);

			if (dmHistoryDocType == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmHistoryDocTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmHistoryDocType);
		}
		catch (NoSuchDmHistoryDocTypeException nsee) {
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
	protected DmHistoryDocType removeImpl(DmHistoryDocType dmHistoryDocType)
		throws SystemException {
		dmHistoryDocType = toUnwrappedModel(dmHistoryDocType);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dmHistoryDocType)) {
				dmHistoryDocType = (DmHistoryDocType)session.get(DmHistoryDocTypeImpl.class,
						dmHistoryDocType.getPrimaryKeyObj());
			}

			if (dmHistoryDocType != null) {
				session.delete(dmHistoryDocType);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dmHistoryDocType != null) {
			clearCache(dmHistoryDocType);
		}

		return dmHistoryDocType;
	}

	@Override
	public DmHistoryDocType updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType dmHistoryDocType)
		throws SystemException {
		dmHistoryDocType = toUnwrappedModel(dmHistoryDocType);

		boolean isNew = dmHistoryDocType.isNew();

		Session session = null;

		try {
			session = openSession();

			if (dmHistoryDocType.isNew()) {
				session.save(dmHistoryDocType);

				dmHistoryDocType.setNew(false);
			}
			else {
				session.merge(dmHistoryDocType);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmHistoryDocTypeModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(DmHistoryDocTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryDocTypeImpl.class, dmHistoryDocType.getPrimaryKey(),
			dmHistoryDocType);

		clearUniqueFindersCache(dmHistoryDocType);
		cacheUniqueFindersCache(dmHistoryDocType);

		return dmHistoryDocType;
	}

	protected DmHistoryDocType toUnwrappedModel(
		DmHistoryDocType dmHistoryDocType) {
		if (dmHistoryDocType instanceof DmHistoryDocTypeImpl) {
			return dmHistoryDocType;
		}

		DmHistoryDocTypeImpl dmHistoryDocTypeImpl = new DmHistoryDocTypeImpl();

		dmHistoryDocTypeImpl.setNew(dmHistoryDocType.isNew());
		dmHistoryDocTypeImpl.setPrimaryKey(dmHistoryDocType.getPrimaryKey());

		dmHistoryDocTypeImpl.setId(dmHistoryDocType.getId());
		dmHistoryDocTypeImpl.setDocumentTypeCode(dmHistoryDocType.getDocumentTypeCode());
		dmHistoryDocTypeImpl.setDocumentType(dmHistoryDocType.getDocumentType());
		dmHistoryDocTypeImpl.setDocumentTypeName(dmHistoryDocType.getDocumentTypeName());
		dmHistoryDocTypeImpl.setIsDelete(dmHistoryDocType.getIsDelete());
		dmHistoryDocTypeImpl.setMarkedAsDelete(dmHistoryDocType.getMarkedAsDelete());
		dmHistoryDocTypeImpl.setModifiedDate(dmHistoryDocType.getModifiedDate());
		dmHistoryDocTypeImpl.setRequestedDate(dmHistoryDocType.getRequestedDate());
		dmHistoryDocTypeImpl.setSyncVersion(dmHistoryDocType.getSyncVersion());

		return dmHistoryDocTypeImpl;
	}

	/**
	 * Returns the dm history doc type with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history doc type
	 * @return the dm history doc type
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryDocTypeException if a dm history doc type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryDocType findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDmHistoryDocTypeException, SystemException {
		DmHistoryDocType dmHistoryDocType = fetchByPrimaryKey(primaryKey);

		if (dmHistoryDocType == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDmHistoryDocTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dmHistoryDocType;
	}

	/**
	 * Returns the dm history doc type with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryDocTypeException} if it could not be found.
	 *
	 * @param id the primary key of the dm history doc type
	 * @return the dm history doc type
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryDocTypeException if a dm history doc type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryDocType findByPrimaryKey(int id)
		throws NoSuchDmHistoryDocTypeException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dm history doc type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history doc type
	 * @return the dm history doc type, or <code>null</code> if a dm history doc type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryDocType fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DmHistoryDocType dmHistoryDocType = (DmHistoryDocType)EntityCacheUtil.getResult(DmHistoryDocTypeModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryDocTypeImpl.class, primaryKey);

		if (dmHistoryDocType == _nullDmHistoryDocType) {
			return null;
		}

		if (dmHistoryDocType == null) {
			Session session = null;

			try {
				session = openSession();

				dmHistoryDocType = (DmHistoryDocType)session.get(DmHistoryDocTypeImpl.class,
						primaryKey);

				if (dmHistoryDocType != null) {
					cacheResult(dmHistoryDocType);
				}
				else {
					EntityCacheUtil.putResult(DmHistoryDocTypeModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryDocTypeImpl.class, primaryKey,
						_nullDmHistoryDocType);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DmHistoryDocTypeModelImpl.ENTITY_CACHE_ENABLED,
					DmHistoryDocTypeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dmHistoryDocType;
	}

	/**
	 * Returns the dm history doc type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm history doc type
	 * @return the dm history doc type, or <code>null</code> if a dm history doc type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryDocType fetchByPrimaryKey(int id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the dm history doc types.
	 *
	 * @return the dm history doc types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryDocType> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history doc types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryDocTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history doc types
	 * @param end the upper bound of the range of dm history doc types (not inclusive)
	 * @return the range of dm history doc types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryDocType> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history doc types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryDocTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history doc types
	 * @param end the upper bound of the range of dm history doc types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm history doc types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryDocType> findAll(int start, int end,
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

		List<DmHistoryDocType> list = (List<DmHistoryDocType>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMHISTORYDOCTYPE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMHISTORYDOCTYPE;

				if (pagination) {
					sql = sql.concat(DmHistoryDocTypeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DmHistoryDocType>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmHistoryDocType>(list);
				}
				else {
					list = (List<DmHistoryDocType>)QueryUtil.list(q,
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
	 * Removes all the dm history doc types from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DmHistoryDocType dmHistoryDocType : findAll()) {
			remove(dmHistoryDocType);
		}
	}

	/**
	 * Returns the number of dm history doc types.
	 *
	 * @return the number of dm history doc types
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

				Query q = session.createQuery(_SQL_COUNT_DMHISTORYDOCTYPE);

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
	 * Initializes the dm history doc type persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmHistoryDocType>> listenersList = new ArrayList<ModelListener<DmHistoryDocType>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmHistoryDocType>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmHistoryDocTypeImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DMHISTORYDOCTYPE = "SELECT dmHistoryDocType FROM DmHistoryDocType dmHistoryDocType";
	private static final String _SQL_SELECT_DMHISTORYDOCTYPE_WHERE = "SELECT dmHistoryDocType FROM DmHistoryDocType dmHistoryDocType WHERE ";
	private static final String _SQL_COUNT_DMHISTORYDOCTYPE = "SELECT COUNT(dmHistoryDocType) FROM DmHistoryDocType dmHistoryDocType";
	private static final String _SQL_COUNT_DMHISTORYDOCTYPE_WHERE = "SELECT COUNT(dmHistoryDocType) FROM DmHistoryDocType dmHistoryDocType WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmHistoryDocType.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmHistoryDocType exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmHistoryDocType exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmHistoryDocTypePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"documentTypeCode", "documentType", "documentTypeName",
				"isDelete", "markedAsDelete", "modifiedDate", "requestedDate",
				"syncVersion"
			});
	private static DmHistoryDocType _nullDmHistoryDocType = new DmHistoryDocTypeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmHistoryDocType> toCacheModel() {
				return _nullDmHistoryDocTypeCacheModel;
			}
		};

	private static CacheModel<DmHistoryDocType> _nullDmHistoryDocTypeCacheModel = new CacheModel<DmHistoryDocType>() {
			@Override
			public DmHistoryDocType toEntityModel() {
				return _nullDmHistoryDocType;
			}
		};
}