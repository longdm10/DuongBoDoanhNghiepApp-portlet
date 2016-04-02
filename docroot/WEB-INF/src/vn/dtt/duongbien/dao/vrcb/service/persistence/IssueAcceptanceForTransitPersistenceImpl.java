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

import vn.dtt.duongbien.dao.vrcb.NoSuchIssueAcceptanceForTransitException;
import vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransit;
import vn.dtt.duongbien.dao.vrcb.model.impl.IssueAcceptanceForTransitImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.IssueAcceptanceForTransitModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the issue acceptance for transit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see IssueAcceptanceForTransitPersistence
 * @see IssueAcceptanceForTransitUtil
 * @generated
 */
public class IssueAcceptanceForTransitPersistenceImpl
	extends BasePersistenceImpl<IssueAcceptanceForTransit>
	implements IssueAcceptanceForTransitPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link IssueAcceptanceForTransitUtil} to access the issue acceptance for transit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = IssueAcceptanceForTransitImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(IssueAcceptanceForTransitModelImpl.ENTITY_CACHE_ENABLED,
			IssueAcceptanceForTransitModelImpl.FINDER_CACHE_ENABLED,
			IssueAcceptanceForTransitImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(IssueAcceptanceForTransitModelImpl.ENTITY_CACHE_ENABLED,
			IssueAcceptanceForTransitModelImpl.FINDER_CACHE_ENABLED,
			IssueAcceptanceForTransitImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(IssueAcceptanceForTransitModelImpl.ENTITY_CACHE_ENABLED,
			IssueAcceptanceForTransitModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR =
		new FinderPath(IssueAcceptanceForTransitModelImpl.ENTITY_CACHE_ENABLED,
			IssueAcceptanceForTransitModelImpl.FINDER_CACHE_ENABLED,
			IssueAcceptanceForTransitImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByfindIssueAcceptanceForTransitByDocumentYearAndDocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() },
			IssueAcceptanceForTransitModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			IssueAcceptanceForTransitModelImpl.DOCUMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR =
		new FinderPath(IssueAcceptanceForTransitModelImpl.ENTITY_CACHE_ENABLED,
			IssueAcceptanceForTransitModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByfindIssueAcceptanceForTransitByDocumentYearAndDocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns the issue acceptance for transit where documentName = &#63; and documentYear = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchIssueAcceptanceForTransitException} if it could not be found.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the matching issue acceptance for transit
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssueAcceptanceForTransitException if a matching issue acceptance for transit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueAcceptanceForTransit findByfindIssueAcceptanceForTransitByDocumentYearAndDocumentYear(
		long documentName, int documentYear)
		throws NoSuchIssueAcceptanceForTransitException, SystemException {
		IssueAcceptanceForTransit issueAcceptanceForTransit = fetchByfindIssueAcceptanceForTransitByDocumentYearAndDocumentYear(documentName,
				documentYear);

		if (issueAcceptanceForTransit == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchIssueAcceptanceForTransitException(msg.toString());
		}

		return issueAcceptanceForTransit;
	}

	/**
	 * Returns the issue acceptance for transit where documentName = &#63; and documentYear = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the matching issue acceptance for transit, or <code>null</code> if a matching issue acceptance for transit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueAcceptanceForTransit fetchByfindIssueAcceptanceForTransitByDocumentYearAndDocumentYear(
		long documentName, int documentYear) throws SystemException {
		return fetchByfindIssueAcceptanceForTransitByDocumentYearAndDocumentYear(documentName,
			documentYear, true);
	}

	/**
	 * Returns the issue acceptance for transit where documentName = &#63; and documentYear = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching issue acceptance for transit, or <code>null</code> if a matching issue acceptance for transit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueAcceptanceForTransit fetchByfindIssueAcceptanceForTransitByDocumentYearAndDocumentYear(
		long documentName, int documentYear, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { documentName, documentYear };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR,
					finderArgs, this);
		}

		if (result instanceof IssueAcceptanceForTransit) {
			IssueAcceptanceForTransit issueAcceptanceForTransit = (IssueAcceptanceForTransit)result;

			if ((documentName != issueAcceptanceForTransit.getDocumentName()) ||
					(documentYear != issueAcceptanceForTransit.getDocumentYear())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_ISSUEACCEPTANCEFORTRANSIT_WHERE);

			query.append(_FINDER_COLUMN_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTYEAR_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				List<IssueAcceptanceForTransit> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"IssueAcceptanceForTransitPersistenceImpl.fetchByfindIssueAcceptanceForTransitByDocumentYearAndDocumentYear(long, int, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					IssueAcceptanceForTransit issueAcceptanceForTransit = list.get(0);

					result = issueAcceptanceForTransit;

					cacheResult(issueAcceptanceForTransit);

					if ((issueAcceptanceForTransit.getDocumentName() != documentName) ||
							(issueAcceptanceForTransit.getDocumentYear() != documentYear)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR,
							finderArgs, issueAcceptanceForTransit);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR,
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
			return (IssueAcceptanceForTransit)result;
		}
	}

	/**
	 * Removes the issue acceptance for transit where documentName = &#63; and documentYear = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the issue acceptance for transit that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueAcceptanceForTransit removeByfindIssueAcceptanceForTransitByDocumentYearAndDocumentYear(
		long documentName, int documentYear)
		throws NoSuchIssueAcceptanceForTransitException, SystemException {
		IssueAcceptanceForTransit issueAcceptanceForTransit = findByfindIssueAcceptanceForTransitByDocumentYearAndDocumentYear(documentName,
				documentYear);

		return remove(issueAcceptanceForTransit);
	}

	/**
	 * Returns the number of issue acceptance for transits where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the number of matching issue acceptance for transits
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByfindIssueAcceptanceForTransitByDocumentYearAndDocumentYear(
		long documentName, int documentYear) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR;

		Object[] finderArgs = new Object[] { documentName, documentYear };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ISSUEACCEPTANCEFORTRANSIT_WHERE);

			query.append(_FINDER_COLUMN_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTYEAR_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

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

	private static final String _FINDER_COLUMN_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTNAME_2 =
		"issueAcceptanceForTransit.documentName = ? AND ";
	private static final String _FINDER_COLUMN_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTYEAR_2 =
		"issueAcceptanceForTransit.documentYear = ?";

	public IssueAcceptanceForTransitPersistenceImpl() {
		setModelClass(IssueAcceptanceForTransit.class);
	}

	/**
	 * Caches the issue acceptance for transit in the entity cache if it is enabled.
	 *
	 * @param issueAcceptanceForTransit the issue acceptance for transit
	 */
	@Override
	public void cacheResult(IssueAcceptanceForTransit issueAcceptanceForTransit) {
		EntityCacheUtil.putResult(IssueAcceptanceForTransitModelImpl.ENTITY_CACHE_ENABLED,
			IssueAcceptanceForTransitImpl.class,
			issueAcceptanceForTransit.getPrimaryKey(), issueAcceptanceForTransit);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR,
			new Object[] {
				issueAcceptanceForTransit.getDocumentName(),
				issueAcceptanceForTransit.getDocumentYear()
			}, issueAcceptanceForTransit);

		issueAcceptanceForTransit.resetOriginalValues();
	}

	/**
	 * Caches the issue acceptance for transits in the entity cache if it is enabled.
	 *
	 * @param issueAcceptanceForTransits the issue acceptance for transits
	 */
	@Override
	public void cacheResult(
		List<IssueAcceptanceForTransit> issueAcceptanceForTransits) {
		for (IssueAcceptanceForTransit issueAcceptanceForTransit : issueAcceptanceForTransits) {
			if (EntityCacheUtil.getResult(
						IssueAcceptanceForTransitModelImpl.ENTITY_CACHE_ENABLED,
						IssueAcceptanceForTransitImpl.class,
						issueAcceptanceForTransit.getPrimaryKey()) == null) {
				cacheResult(issueAcceptanceForTransit);
			}
			else {
				issueAcceptanceForTransit.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all issue acceptance for transits.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(IssueAcceptanceForTransitImpl.class.getName());
		}

		EntityCacheUtil.clearCache(IssueAcceptanceForTransitImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the issue acceptance for transit.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(IssueAcceptanceForTransit issueAcceptanceForTransit) {
		EntityCacheUtil.removeResult(IssueAcceptanceForTransitModelImpl.ENTITY_CACHE_ENABLED,
			IssueAcceptanceForTransitImpl.class,
			issueAcceptanceForTransit.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(issueAcceptanceForTransit);
	}

	@Override
	public void clearCache(
		List<IssueAcceptanceForTransit> issueAcceptanceForTransits) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (IssueAcceptanceForTransit issueAcceptanceForTransit : issueAcceptanceForTransits) {
			EntityCacheUtil.removeResult(IssueAcceptanceForTransitModelImpl.ENTITY_CACHE_ENABLED,
				IssueAcceptanceForTransitImpl.class,
				issueAcceptanceForTransit.getPrimaryKey());

			clearUniqueFindersCache(issueAcceptanceForTransit);
		}
	}

	protected void cacheUniqueFindersCache(
		IssueAcceptanceForTransit issueAcceptanceForTransit) {
		if (issueAcceptanceForTransit.isNew()) {
			Object[] args = new Object[] {
					issueAcceptanceForTransit.getDocumentName(),
					issueAcceptanceForTransit.getDocumentYear()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR,
				args, issueAcceptanceForTransit);
		}
		else {
			IssueAcceptanceForTransitModelImpl issueAcceptanceForTransitModelImpl =
				(IssueAcceptanceForTransitModelImpl)issueAcceptanceForTransit;

			if ((issueAcceptanceForTransitModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						issueAcceptanceForTransit.getDocumentName(),
						issueAcceptanceForTransit.getDocumentYear()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR,
					args, issueAcceptanceForTransit);
			}
		}
	}

	protected void clearUniqueFindersCache(
		IssueAcceptanceForTransit issueAcceptanceForTransit) {
		IssueAcceptanceForTransitModelImpl issueAcceptanceForTransitModelImpl = (IssueAcceptanceForTransitModelImpl)issueAcceptanceForTransit;

		Object[] args = new Object[] {
				issueAcceptanceForTransit.getDocumentName(),
				issueAcceptanceForTransit.getDocumentYear()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR,
			args);

		if ((issueAcceptanceForTransitModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR.getColumnBitmask()) != 0) {
			args = new Object[] {
					issueAcceptanceForTransitModelImpl.getOriginalDocumentName(),
					issueAcceptanceForTransitModelImpl.getOriginalDocumentYear()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR,
				args);
		}
	}

	/**
	 * Creates a new issue acceptance for transit with the primary key. Does not add the issue acceptance for transit to the database.
	 *
	 * @param id the primary key for the new issue acceptance for transit
	 * @return the new issue acceptance for transit
	 */
	@Override
	public IssueAcceptanceForTransit create(long id) {
		IssueAcceptanceForTransit issueAcceptanceForTransit = new IssueAcceptanceForTransitImpl();

		issueAcceptanceForTransit.setNew(true);
		issueAcceptanceForTransit.setPrimaryKey(id);

		return issueAcceptanceForTransit;
	}

	/**
	 * Removes the issue acceptance for transit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the issue acceptance for transit
	 * @return the issue acceptance for transit that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssueAcceptanceForTransitException if a issue acceptance for transit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueAcceptanceForTransit remove(long id)
		throws NoSuchIssueAcceptanceForTransitException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the issue acceptance for transit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the issue acceptance for transit
	 * @return the issue acceptance for transit that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssueAcceptanceForTransitException if a issue acceptance for transit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueAcceptanceForTransit remove(Serializable primaryKey)
		throws NoSuchIssueAcceptanceForTransitException, SystemException {
		Session session = null;

		try {
			session = openSession();

			IssueAcceptanceForTransit issueAcceptanceForTransit = (IssueAcceptanceForTransit)session.get(IssueAcceptanceForTransitImpl.class,
					primaryKey);

			if (issueAcceptanceForTransit == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchIssueAcceptanceForTransitException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(issueAcceptanceForTransit);
		}
		catch (NoSuchIssueAcceptanceForTransitException nsee) {
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
	protected IssueAcceptanceForTransit removeImpl(
		IssueAcceptanceForTransit issueAcceptanceForTransit)
		throws SystemException {
		issueAcceptanceForTransit = toUnwrappedModel(issueAcceptanceForTransit);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(issueAcceptanceForTransit)) {
				issueAcceptanceForTransit = (IssueAcceptanceForTransit)session.get(IssueAcceptanceForTransitImpl.class,
						issueAcceptanceForTransit.getPrimaryKeyObj());
			}

			if (issueAcceptanceForTransit != null) {
				session.delete(issueAcceptanceForTransit);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (issueAcceptanceForTransit != null) {
			clearCache(issueAcceptanceForTransit);
		}

		return issueAcceptanceForTransit;
	}

	@Override
	public IssueAcceptanceForTransit updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransit issueAcceptanceForTransit)
		throws SystemException {
		issueAcceptanceForTransit = toUnwrappedModel(issueAcceptanceForTransit);

		boolean isNew = issueAcceptanceForTransit.isNew();

		Session session = null;

		try {
			session = openSession();

			if (issueAcceptanceForTransit.isNew()) {
				session.save(issueAcceptanceForTransit);

				issueAcceptanceForTransit.setNew(false);
			}
			else {
				session.merge(issueAcceptanceForTransit);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew ||
				!IssueAcceptanceForTransitModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(IssueAcceptanceForTransitModelImpl.ENTITY_CACHE_ENABLED,
			IssueAcceptanceForTransitImpl.class,
			issueAcceptanceForTransit.getPrimaryKey(), issueAcceptanceForTransit);

		clearUniqueFindersCache(issueAcceptanceForTransit);
		cacheUniqueFindersCache(issueAcceptanceForTransit);

		return issueAcceptanceForTransit;
	}

	protected IssueAcceptanceForTransit toUnwrappedModel(
		IssueAcceptanceForTransit issueAcceptanceForTransit) {
		if (issueAcceptanceForTransit instanceof IssueAcceptanceForTransitImpl) {
			return issueAcceptanceForTransit;
		}

		IssueAcceptanceForTransitImpl issueAcceptanceForTransitImpl = new IssueAcceptanceForTransitImpl();

		issueAcceptanceForTransitImpl.setNew(issueAcceptanceForTransit.isNew());
		issueAcceptanceForTransitImpl.setPrimaryKey(issueAcceptanceForTransit.getPrimaryKey());

		issueAcceptanceForTransitImpl.setId(issueAcceptanceForTransit.getId());
		issueAcceptanceForTransitImpl.setRequestCode(issueAcceptanceForTransit.getRequestCode());
		issueAcceptanceForTransitImpl.setNumberAcceptanceForTransit(issueAcceptanceForTransit.getNumberAcceptanceForTransit());
		issueAcceptanceForTransitImpl.setDocumentName(issueAcceptanceForTransit.getDocumentName());
		issueAcceptanceForTransitImpl.setDocumentYear(issueAcceptanceForTransit.getDocumentYear());
		issueAcceptanceForTransitImpl.setNameOfShip(issueAcceptanceForTransit.getNameOfShip());
		issueAcceptanceForTransitImpl.setFlagStateOfShip(issueAcceptanceForTransit.getFlagStateOfShip());
		issueAcceptanceForTransitImpl.setCallSign(issueAcceptanceForTransit.getCallSign());
		issueAcceptanceForTransitImpl.setNameOfMaster(issueAcceptanceForTransit.getNameOfMaster());
		issueAcceptanceForTransitImpl.setLoa(issueAcceptanceForTransit.getLoa());
		issueAcceptanceForTransitImpl.setUnitLOA(issueAcceptanceForTransit.getUnitLOA());
		issueAcceptanceForTransitImpl.setBreadth(issueAcceptanceForTransit.getBreadth());
		issueAcceptanceForTransitImpl.setUnitBreadth(issueAcceptanceForTransit.getUnitBreadth());
		issueAcceptanceForTransitImpl.setGrossTonnage(issueAcceptanceForTransit.getGrossTonnage());
		issueAcceptanceForTransitImpl.setGrossTonnageUnit(issueAcceptanceForTransit.getGrossTonnageUnit());
		issueAcceptanceForTransitImpl.setNetTonnage(issueAcceptanceForTransit.getNetTonnage());
		issueAcceptanceForTransitImpl.setNetTonnageUnit(issueAcceptanceForTransit.getNetTonnageUnit());
		issueAcceptanceForTransitImpl.setDwt(issueAcceptanceForTransit.getDwt());
		issueAcceptanceForTransitImpl.setUnitDWT(issueAcceptanceForTransit.getUnitDWT());
		issueAcceptanceForTransitImpl.setShownDraftxF(issueAcceptanceForTransit.getShownDraftxF());
		issueAcceptanceForTransitImpl.setUnitShownDraftxF(issueAcceptanceForTransit.getUnitShownDraftxF());
		issueAcceptanceForTransitImpl.setShownDraftxA(issueAcceptanceForTransit.getShownDraftxA());
		issueAcceptanceForTransitImpl.setUnitShownDraftxA(issueAcceptanceForTransit.getUnitShownDraftxA());
		issueAcceptanceForTransitImpl.setClearanceHeight(issueAcceptanceForTransit.getClearanceHeight());
		issueAcceptanceForTransitImpl.setUnitClearanceHeight(issueAcceptanceForTransit.getUnitClearanceHeight());
		issueAcceptanceForTransitImpl.setPermittedTransitFrom(issueAcceptanceForTransit.getPermittedTransitFrom());
		issueAcceptanceForTransitImpl.setPermittedTransitTo(issueAcceptanceForTransit.getPermittedTransitTo());
		issueAcceptanceForTransitImpl.setTimeOfDeparture(issueAcceptanceForTransit.getTimeOfDeparture());

		return issueAcceptanceForTransitImpl;
	}

	/**
	 * Returns the issue acceptance for transit with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the issue acceptance for transit
	 * @return the issue acceptance for transit
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssueAcceptanceForTransitException if a issue acceptance for transit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueAcceptanceForTransit findByPrimaryKey(Serializable primaryKey)
		throws NoSuchIssueAcceptanceForTransitException, SystemException {
		IssueAcceptanceForTransit issueAcceptanceForTransit = fetchByPrimaryKey(primaryKey);

		if (issueAcceptanceForTransit == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchIssueAcceptanceForTransitException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return issueAcceptanceForTransit;
	}

	/**
	 * Returns the issue acceptance for transit with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchIssueAcceptanceForTransitException} if it could not be found.
	 *
	 * @param id the primary key of the issue acceptance for transit
	 * @return the issue acceptance for transit
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssueAcceptanceForTransitException if a issue acceptance for transit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueAcceptanceForTransit findByPrimaryKey(long id)
		throws NoSuchIssueAcceptanceForTransitException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the issue acceptance for transit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the issue acceptance for transit
	 * @return the issue acceptance for transit, or <code>null</code> if a issue acceptance for transit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueAcceptanceForTransit fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		IssueAcceptanceForTransit issueAcceptanceForTransit = (IssueAcceptanceForTransit)EntityCacheUtil.getResult(IssueAcceptanceForTransitModelImpl.ENTITY_CACHE_ENABLED,
				IssueAcceptanceForTransitImpl.class, primaryKey);

		if (issueAcceptanceForTransit == _nullIssueAcceptanceForTransit) {
			return null;
		}

		if (issueAcceptanceForTransit == null) {
			Session session = null;

			try {
				session = openSession();

				issueAcceptanceForTransit = (IssueAcceptanceForTransit)session.get(IssueAcceptanceForTransitImpl.class,
						primaryKey);

				if (issueAcceptanceForTransit != null) {
					cacheResult(issueAcceptanceForTransit);
				}
				else {
					EntityCacheUtil.putResult(IssueAcceptanceForTransitModelImpl.ENTITY_CACHE_ENABLED,
						IssueAcceptanceForTransitImpl.class, primaryKey,
						_nullIssueAcceptanceForTransit);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(IssueAcceptanceForTransitModelImpl.ENTITY_CACHE_ENABLED,
					IssueAcceptanceForTransitImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return issueAcceptanceForTransit;
	}

	/**
	 * Returns the issue acceptance for transit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the issue acceptance for transit
	 * @return the issue acceptance for transit, or <code>null</code> if a issue acceptance for transit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueAcceptanceForTransit fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the issue acceptance for transits.
	 *
	 * @return the issue acceptance for transits
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueAcceptanceForTransit> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the issue acceptance for transits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssueAcceptanceForTransitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of issue acceptance for transits
	 * @param end the upper bound of the range of issue acceptance for transits (not inclusive)
	 * @return the range of issue acceptance for transits
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueAcceptanceForTransit> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the issue acceptance for transits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssueAcceptanceForTransitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of issue acceptance for transits
	 * @param end the upper bound of the range of issue acceptance for transits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of issue acceptance for transits
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueAcceptanceForTransit> findAll(int start, int end,
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

		List<IssueAcceptanceForTransit> list = (List<IssueAcceptanceForTransit>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ISSUEACCEPTANCEFORTRANSIT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ISSUEACCEPTANCEFORTRANSIT;

				if (pagination) {
					sql = sql.concat(IssueAcceptanceForTransitModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<IssueAcceptanceForTransit>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<IssueAcceptanceForTransit>(list);
				}
				else {
					list = (List<IssueAcceptanceForTransit>)QueryUtil.list(q,
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
	 * Removes all the issue acceptance for transits from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (IssueAcceptanceForTransit issueAcceptanceForTransit : findAll()) {
			remove(issueAcceptanceForTransit);
		}
	}

	/**
	 * Returns the number of issue acceptance for transits.
	 *
	 * @return the number of issue acceptance for transits
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

				Query q = session.createQuery(_SQL_COUNT_ISSUEACCEPTANCEFORTRANSIT);

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
	 * Initializes the issue acceptance for transit persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransit")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<IssueAcceptanceForTransit>> listenersList = new ArrayList<ModelListener<IssueAcceptanceForTransit>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<IssueAcceptanceForTransit>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(IssueAcceptanceForTransitImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ISSUEACCEPTANCEFORTRANSIT = "SELECT issueAcceptanceForTransit FROM IssueAcceptanceForTransit issueAcceptanceForTransit";
	private static final String _SQL_SELECT_ISSUEACCEPTANCEFORTRANSIT_WHERE = "SELECT issueAcceptanceForTransit FROM IssueAcceptanceForTransit issueAcceptanceForTransit WHERE ";
	private static final String _SQL_COUNT_ISSUEACCEPTANCEFORTRANSIT = "SELECT COUNT(issueAcceptanceForTransit) FROM IssueAcceptanceForTransit issueAcceptanceForTransit";
	private static final String _SQL_COUNT_ISSUEACCEPTANCEFORTRANSIT_WHERE = "SELECT COUNT(issueAcceptanceForTransit) FROM IssueAcceptanceForTransit issueAcceptanceForTransit WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "issueAcceptanceForTransit.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No IssueAcceptanceForTransit exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No IssueAcceptanceForTransit exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(IssueAcceptanceForTransitPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "requestCode", "numberAcceptanceForTransit",
				"documentName", "documentYear", "nameOfShip", "flagStateOfShip",
				"callSign", "nameOfMaster", "loa", "unitLOA", "breadth",
				"unitBreadth", "grossTonnage", "grossTonnageUnit", "netTonnage",
				"netTonnageUnit", "dwt", "unitDWT", "shownDraftxF",
				"unitShownDraftxF", "shownDraftxA", "unitShownDraftxA",
				"clearanceHeight", "unitClearanceHeight", "permittedTransitFrom",
				"permittedTransitTo", "timeOfDeparture"
			});
	private static IssueAcceptanceForTransit _nullIssueAcceptanceForTransit = new IssueAcceptanceForTransitImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<IssueAcceptanceForTransit> toCacheModel() {
				return _nullIssueAcceptanceForTransitCacheModel;
			}
		};

	private static CacheModel<IssueAcceptanceForTransit> _nullIssueAcceptanceForTransitCacheModel =
		new CacheModel<IssueAcceptanceForTransit>() {
			@Override
			public IssueAcceptanceForTransit toEntityModel() {
				return _nullIssueAcceptanceForTransit;
			}
		};
}