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
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnitException;
import vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit;
import vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtWorkingUnitImpl;
import vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtWorkingUnitModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the o e p user mgt working unit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see OEPUserMgtWorkingUnitPersistence
 * @see OEPUserMgtWorkingUnitUtil
 * @generated
 */
public class OEPUserMgtWorkingUnitPersistenceImpl extends BasePersistenceImpl<OEPUserMgtWorkingUnit>
	implements OEPUserMgtWorkingUnitPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link OEPUserMgtWorkingUnitUtil} to access the o e p user mgt working unit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = OEPUserMgtWorkingUnitImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(OEPUserMgtWorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtWorkingUnitModelImpl.FINDER_CACHE_ENABLED,
			OEPUserMgtWorkingUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(OEPUserMgtWorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtWorkingUnitModelImpl.FINDER_CACHE_ENABLED,
			OEPUserMgtWorkingUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(OEPUserMgtWorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtWorkingUnitModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_GOVAGENTID = new FinderPath(OEPUserMgtWorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtWorkingUnitModelImpl.FINDER_CACHE_ENABLED,
			OEPUserMgtWorkingUnitImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByGovAgentId", new String[] { String.class.getName() },
			OEPUserMgtWorkingUnitModelImpl.GOVAGENTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GOVAGENTID = new FinderPath(OEPUserMgtWorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtWorkingUnitModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGovAgentId",
			new String[] { String.class.getName() });

	/**
	 * Returns the o e p user mgt working unit where govAgentId = &#63; or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnitException} if it could not be found.
	 *
	 * @param govAgentId the gov agent ID
	 * @return the matching o e p user mgt working unit
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnitException if a matching o e p user mgt working unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtWorkingUnit findByGovAgentId(String govAgentId)
		throws NoSuchOEPUserMgtWorkingUnitException, SystemException {
		OEPUserMgtWorkingUnit oepUserMgtWorkingUnit = fetchByGovAgentId(govAgentId);

		if (oepUserMgtWorkingUnit == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("govAgentId=");
			msg.append(govAgentId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchOEPUserMgtWorkingUnitException(msg.toString());
		}

		return oepUserMgtWorkingUnit;
	}

	/**
	 * Returns the o e p user mgt working unit where govAgentId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param govAgentId the gov agent ID
	 * @return the matching o e p user mgt working unit, or <code>null</code> if a matching o e p user mgt working unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtWorkingUnit fetchByGovAgentId(String govAgentId)
		throws SystemException {
		return fetchByGovAgentId(govAgentId, true);
	}

	/**
	 * Returns the o e p user mgt working unit where govAgentId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param govAgentId the gov agent ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching o e p user mgt working unit, or <code>null</code> if a matching o e p user mgt working unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtWorkingUnit fetchByGovAgentId(String govAgentId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { govAgentId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_GOVAGENTID,
					finderArgs, this);
		}

		if (result instanceof OEPUserMgtWorkingUnit) {
			OEPUserMgtWorkingUnit oepUserMgtWorkingUnit = (OEPUserMgtWorkingUnit)result;

			if (!Validator.equals(govAgentId,
						oepUserMgtWorkingUnit.getGovAgentId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_OEPUSERMGTWORKINGUNIT_WHERE);

			boolean bindGovAgentId = false;

			if (govAgentId == null) {
				query.append(_FINDER_COLUMN_GOVAGENTID_GOVAGENTID_1);
			}
			else if (govAgentId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GOVAGENTID_GOVAGENTID_3);
			}
			else {
				bindGovAgentId = true;

				query.append(_FINDER_COLUMN_GOVAGENTID_GOVAGENTID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindGovAgentId) {
					qPos.add(govAgentId);
				}

				List<OEPUserMgtWorkingUnit> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GOVAGENTID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"OEPUserMgtWorkingUnitPersistenceImpl.fetchByGovAgentId(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					OEPUserMgtWorkingUnit oepUserMgtWorkingUnit = list.get(0);

					result = oepUserMgtWorkingUnit;

					cacheResult(oepUserMgtWorkingUnit);

					if ((oepUserMgtWorkingUnit.getGovAgentId() == null) ||
							!oepUserMgtWorkingUnit.getGovAgentId()
													  .equals(govAgentId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GOVAGENTID,
							finderArgs, oepUserMgtWorkingUnit);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GOVAGENTID,
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
			return (OEPUserMgtWorkingUnit)result;
		}
	}

	/**
	 * Removes the o e p user mgt working unit where govAgentId = &#63; from the database.
	 *
	 * @param govAgentId the gov agent ID
	 * @return the o e p user mgt working unit that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtWorkingUnit removeByGovAgentId(String govAgentId)
		throws NoSuchOEPUserMgtWorkingUnitException, SystemException {
		OEPUserMgtWorkingUnit oepUserMgtWorkingUnit = findByGovAgentId(govAgentId);

		return remove(oepUserMgtWorkingUnit);
	}

	/**
	 * Returns the number of o e p user mgt working units where govAgentId = &#63;.
	 *
	 * @param govAgentId the gov agent ID
	 * @return the number of matching o e p user mgt working units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByGovAgentId(String govAgentId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GOVAGENTID;

		Object[] finderArgs = new Object[] { govAgentId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_OEPUSERMGTWORKINGUNIT_WHERE);

			boolean bindGovAgentId = false;

			if (govAgentId == null) {
				query.append(_FINDER_COLUMN_GOVAGENTID_GOVAGENTID_1);
			}
			else if (govAgentId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GOVAGENTID_GOVAGENTID_3);
			}
			else {
				bindGovAgentId = true;

				query.append(_FINDER_COLUMN_GOVAGENTID_GOVAGENTID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindGovAgentId) {
					qPos.add(govAgentId);
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

	private static final String _FINDER_COLUMN_GOVAGENTID_GOVAGENTID_1 = "oepUserMgtWorkingUnit.govAgentId IS NULL";
	private static final String _FINDER_COLUMN_GOVAGENTID_GOVAGENTID_2 = "oepUserMgtWorkingUnit.govAgentId = ?";
	private static final String _FINDER_COLUMN_GOVAGENTID_GOVAGENTID_3 = "(oepUserMgtWorkingUnit.govAgentId IS NULL OR oepUserMgtWorkingUnit.govAgentId = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_F_ORGANIZATIONID = new FinderPath(OEPUserMgtWorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtWorkingUnitModelImpl.FINDER_CACHE_ENABLED,
			OEPUserMgtWorkingUnitImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByF_organizationId", new String[] { String.class.getName() },
			OEPUserMgtWorkingUnitModelImpl.ORGANIZATIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_ORGANIZATIONID = new FinderPath(OEPUserMgtWorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtWorkingUnitModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByF_organizationId", new String[] { String.class.getName() });

	/**
	 * Returns the o e p user mgt working unit where organizationId = &#63; or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnitException} if it could not be found.
	 *
	 * @param organizationId the organization ID
	 * @return the matching o e p user mgt working unit
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnitException if a matching o e p user mgt working unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtWorkingUnit findByF_organizationId(String organizationId)
		throws NoSuchOEPUserMgtWorkingUnitException, SystemException {
		OEPUserMgtWorkingUnit oepUserMgtWorkingUnit = fetchByF_organizationId(organizationId);

		if (oepUserMgtWorkingUnit == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("organizationId=");
			msg.append(organizationId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchOEPUserMgtWorkingUnitException(msg.toString());
		}

		return oepUserMgtWorkingUnit;
	}

	/**
	 * Returns the o e p user mgt working unit where organizationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param organizationId the organization ID
	 * @return the matching o e p user mgt working unit, or <code>null</code> if a matching o e p user mgt working unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtWorkingUnit fetchByF_organizationId(String organizationId)
		throws SystemException {
		return fetchByF_organizationId(organizationId, true);
	}

	/**
	 * Returns the o e p user mgt working unit where organizationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param organizationId the organization ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching o e p user mgt working unit, or <code>null</code> if a matching o e p user mgt working unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtWorkingUnit fetchByF_organizationId(
		String organizationId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { organizationId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_F_ORGANIZATIONID,
					finderArgs, this);
		}

		if (result instanceof OEPUserMgtWorkingUnit) {
			OEPUserMgtWorkingUnit oepUserMgtWorkingUnit = (OEPUserMgtWorkingUnit)result;

			if (!Validator.equals(organizationId,
						oepUserMgtWorkingUnit.getOrganizationId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_OEPUSERMGTWORKINGUNIT_WHERE);

			boolean bindOrganizationId = false;

			if (organizationId == null) {
				query.append(_FINDER_COLUMN_F_ORGANIZATIONID_ORGANIZATIONID_1);
			}
			else if (organizationId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_ORGANIZATIONID_ORGANIZATIONID_3);
			}
			else {
				bindOrganizationId = true;

				query.append(_FINDER_COLUMN_F_ORGANIZATIONID_ORGANIZATIONID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindOrganizationId) {
					qPos.add(organizationId);
				}

				List<OEPUserMgtWorkingUnit> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_ORGANIZATIONID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"OEPUserMgtWorkingUnitPersistenceImpl.fetchByF_organizationId(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					OEPUserMgtWorkingUnit oepUserMgtWorkingUnit = list.get(0);

					result = oepUserMgtWorkingUnit;

					cacheResult(oepUserMgtWorkingUnit);

					if ((oepUserMgtWorkingUnit.getOrganizationId() == null) ||
							!oepUserMgtWorkingUnit.getOrganizationId()
													  .equals(organizationId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_ORGANIZATIONID,
							finderArgs, oepUserMgtWorkingUnit);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_F_ORGANIZATIONID,
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
			return (OEPUserMgtWorkingUnit)result;
		}
	}

	/**
	 * Removes the o e p user mgt working unit where organizationId = &#63; from the database.
	 *
	 * @param organizationId the organization ID
	 * @return the o e p user mgt working unit that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtWorkingUnit removeByF_organizationId(String organizationId)
		throws NoSuchOEPUserMgtWorkingUnitException, SystemException {
		OEPUserMgtWorkingUnit oepUserMgtWorkingUnit = findByF_organizationId(organizationId);

		return remove(oepUserMgtWorkingUnit);
	}

	/**
	 * Returns the number of o e p user mgt working units where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @return the number of matching o e p user mgt working units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByF_organizationId(String organizationId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_ORGANIZATIONID;

		Object[] finderArgs = new Object[] { organizationId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_OEPUSERMGTWORKINGUNIT_WHERE);

			boolean bindOrganizationId = false;

			if (organizationId == null) {
				query.append(_FINDER_COLUMN_F_ORGANIZATIONID_ORGANIZATIONID_1);
			}
			else if (organizationId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_ORGANIZATIONID_ORGANIZATIONID_3);
			}
			else {
				bindOrganizationId = true;

				query.append(_FINDER_COLUMN_F_ORGANIZATIONID_ORGANIZATIONID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindOrganizationId) {
					qPos.add(organizationId);
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

	private static final String _FINDER_COLUMN_F_ORGANIZATIONID_ORGANIZATIONID_1 =
		"oepUserMgtWorkingUnit.organizationId IS NULL";
	private static final String _FINDER_COLUMN_F_ORGANIZATIONID_ORGANIZATIONID_2 =
		"oepUserMgtWorkingUnit.organizationId = ?";
	private static final String _FINDER_COLUMN_F_ORGANIZATIONID_ORGANIZATIONID_3 =
		"(oepUserMgtWorkingUnit.organizationId IS NULL OR oepUserMgtWorkingUnit.organizationId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_F_PARENTWORKINGUNITID =
		new FinderPath(OEPUserMgtWorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtWorkingUnitModelImpl.FINDER_CACHE_ENABLED,
			OEPUserMgtWorkingUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByF_parentWorkingUnitId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_PARENTWORKINGUNITID =
		new FinderPath(OEPUserMgtWorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtWorkingUnitModelImpl.FINDER_CACHE_ENABLED,
			OEPUserMgtWorkingUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByF_parentWorkingUnitId",
			new String[] { Long.class.getName() },
			OEPUserMgtWorkingUnitModelImpl.PARENTWORKINGUNITID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_PARENTWORKINGUNITID = new FinderPath(OEPUserMgtWorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtWorkingUnitModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByF_parentWorkingUnitId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the o e p user mgt working units where parentWorkingUnitId = &#63;.
	 *
	 * @param parentWorkingUnitId the parent working unit ID
	 * @return the matching o e p user mgt working units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OEPUserMgtWorkingUnit> findByF_parentWorkingUnitId(
		long parentWorkingUnitId) throws SystemException {
		return findByF_parentWorkingUnitId(parentWorkingUnitId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the o e p user mgt working units where parentWorkingUnitId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtWorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param parentWorkingUnitId the parent working unit ID
	 * @param start the lower bound of the range of o e p user mgt working units
	 * @param end the upper bound of the range of o e p user mgt working units (not inclusive)
	 * @return the range of matching o e p user mgt working units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OEPUserMgtWorkingUnit> findByF_parentWorkingUnitId(
		long parentWorkingUnitId, int start, int end) throws SystemException {
		return findByF_parentWorkingUnitId(parentWorkingUnitId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the o e p user mgt working units where parentWorkingUnitId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtWorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param parentWorkingUnitId the parent working unit ID
	 * @param start the lower bound of the range of o e p user mgt working units
	 * @param end the upper bound of the range of o e p user mgt working units (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching o e p user mgt working units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OEPUserMgtWorkingUnit> findByF_parentWorkingUnitId(
		long parentWorkingUnitId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_PARENTWORKINGUNITID;
			finderArgs = new Object[] { parentWorkingUnitId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_F_PARENTWORKINGUNITID;
			finderArgs = new Object[] {
					parentWorkingUnitId,
					
					start, end, orderByComparator
				};
		}

		List<OEPUserMgtWorkingUnit> list = (List<OEPUserMgtWorkingUnit>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (OEPUserMgtWorkingUnit oepUserMgtWorkingUnit : list) {
				if ((parentWorkingUnitId != oepUserMgtWorkingUnit.getParentWorkingUnitId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_OEPUSERMGTWORKINGUNIT_WHERE);

			query.append(_FINDER_COLUMN_F_PARENTWORKINGUNITID_PARENTWORKINGUNITID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(OEPUserMgtWorkingUnitModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(parentWorkingUnitId);

				if (!pagination) {
					list = (List<OEPUserMgtWorkingUnit>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<OEPUserMgtWorkingUnit>(list);
				}
				else {
					list = (List<OEPUserMgtWorkingUnit>)QueryUtil.list(q,
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
	 * Returns the first o e p user mgt working unit in the ordered set where parentWorkingUnitId = &#63;.
	 *
	 * @param parentWorkingUnitId the parent working unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching o e p user mgt working unit
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnitException if a matching o e p user mgt working unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtWorkingUnit findByF_parentWorkingUnitId_First(
		long parentWorkingUnitId, OrderByComparator orderByComparator)
		throws NoSuchOEPUserMgtWorkingUnitException, SystemException {
		OEPUserMgtWorkingUnit oepUserMgtWorkingUnit = fetchByF_parentWorkingUnitId_First(parentWorkingUnitId,
				orderByComparator);

		if (oepUserMgtWorkingUnit != null) {
			return oepUserMgtWorkingUnit;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("parentWorkingUnitId=");
		msg.append(parentWorkingUnitId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOEPUserMgtWorkingUnitException(msg.toString());
	}

	/**
	 * Returns the first o e p user mgt working unit in the ordered set where parentWorkingUnitId = &#63;.
	 *
	 * @param parentWorkingUnitId the parent working unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching o e p user mgt working unit, or <code>null</code> if a matching o e p user mgt working unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtWorkingUnit fetchByF_parentWorkingUnitId_First(
		long parentWorkingUnitId, OrderByComparator orderByComparator)
		throws SystemException {
		List<OEPUserMgtWorkingUnit> list = findByF_parentWorkingUnitId(parentWorkingUnitId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last o e p user mgt working unit in the ordered set where parentWorkingUnitId = &#63;.
	 *
	 * @param parentWorkingUnitId the parent working unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching o e p user mgt working unit
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnitException if a matching o e p user mgt working unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtWorkingUnit findByF_parentWorkingUnitId_Last(
		long parentWorkingUnitId, OrderByComparator orderByComparator)
		throws NoSuchOEPUserMgtWorkingUnitException, SystemException {
		OEPUserMgtWorkingUnit oepUserMgtWorkingUnit = fetchByF_parentWorkingUnitId_Last(parentWorkingUnitId,
				orderByComparator);

		if (oepUserMgtWorkingUnit != null) {
			return oepUserMgtWorkingUnit;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("parentWorkingUnitId=");
		msg.append(parentWorkingUnitId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOEPUserMgtWorkingUnitException(msg.toString());
	}

	/**
	 * Returns the last o e p user mgt working unit in the ordered set where parentWorkingUnitId = &#63;.
	 *
	 * @param parentWorkingUnitId the parent working unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching o e p user mgt working unit, or <code>null</code> if a matching o e p user mgt working unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtWorkingUnit fetchByF_parentWorkingUnitId_Last(
		long parentWorkingUnitId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByF_parentWorkingUnitId(parentWorkingUnitId);

		if (count == 0) {
			return null;
		}

		List<OEPUserMgtWorkingUnit> list = findByF_parentWorkingUnitId(parentWorkingUnitId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the o e p user mgt working units before and after the current o e p user mgt working unit in the ordered set where parentWorkingUnitId = &#63;.
	 *
	 * @param workingUnitId the primary key of the current o e p user mgt working unit
	 * @param parentWorkingUnitId the parent working unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next o e p user mgt working unit
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnitException if a o e p user mgt working unit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtWorkingUnit[] findByF_parentWorkingUnitId_PrevAndNext(
		long workingUnitId, long parentWorkingUnitId,
		OrderByComparator orderByComparator)
		throws NoSuchOEPUserMgtWorkingUnitException, SystemException {
		OEPUserMgtWorkingUnit oepUserMgtWorkingUnit = findByPrimaryKey(workingUnitId);

		Session session = null;

		try {
			session = openSession();

			OEPUserMgtWorkingUnit[] array = new OEPUserMgtWorkingUnitImpl[3];

			array[0] = getByF_parentWorkingUnitId_PrevAndNext(session,
					oepUserMgtWorkingUnit, parentWorkingUnitId,
					orderByComparator, true);

			array[1] = oepUserMgtWorkingUnit;

			array[2] = getByF_parentWorkingUnitId_PrevAndNext(session,
					oepUserMgtWorkingUnit, parentWorkingUnitId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected OEPUserMgtWorkingUnit getByF_parentWorkingUnitId_PrevAndNext(
		Session session, OEPUserMgtWorkingUnit oepUserMgtWorkingUnit,
		long parentWorkingUnitId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_OEPUSERMGTWORKINGUNIT_WHERE);

		query.append(_FINDER_COLUMN_F_PARENTWORKINGUNITID_PARENTWORKINGUNITID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(OEPUserMgtWorkingUnitModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(parentWorkingUnitId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(oepUserMgtWorkingUnit);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<OEPUserMgtWorkingUnit> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the o e p user mgt working units where parentWorkingUnitId = &#63; from the database.
	 *
	 * @param parentWorkingUnitId the parent working unit ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByF_parentWorkingUnitId(long parentWorkingUnitId)
		throws SystemException {
		for (OEPUserMgtWorkingUnit oepUserMgtWorkingUnit : findByF_parentWorkingUnitId(
				parentWorkingUnitId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(oepUserMgtWorkingUnit);
		}
	}

	/**
	 * Returns the number of o e p user mgt working units where parentWorkingUnitId = &#63;.
	 *
	 * @param parentWorkingUnitId the parent working unit ID
	 * @return the number of matching o e p user mgt working units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByF_parentWorkingUnitId(long parentWorkingUnitId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_PARENTWORKINGUNITID;

		Object[] finderArgs = new Object[] { parentWorkingUnitId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_OEPUSERMGTWORKINGUNIT_WHERE);

			query.append(_FINDER_COLUMN_F_PARENTWORKINGUNITID_PARENTWORKINGUNITID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(parentWorkingUnitId);

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

	private static final String _FINDER_COLUMN_F_PARENTWORKINGUNITID_PARENTWORKINGUNITID_2 =
		"oepUserMgtWorkingUnit.parentWorkingUnitId = ?";

	public OEPUserMgtWorkingUnitPersistenceImpl() {
		setModelClass(OEPUserMgtWorkingUnit.class);
	}

	/**
	 * Caches the o e p user mgt working unit in the entity cache if it is enabled.
	 *
	 * @param oepUserMgtWorkingUnit the o e p user mgt working unit
	 */
	@Override
	public void cacheResult(OEPUserMgtWorkingUnit oepUserMgtWorkingUnit) {
		EntityCacheUtil.putResult(OEPUserMgtWorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtWorkingUnitImpl.class,
			oepUserMgtWorkingUnit.getPrimaryKey(), oepUserMgtWorkingUnit);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GOVAGENTID,
			new Object[] { oepUserMgtWorkingUnit.getGovAgentId() },
			oepUserMgtWorkingUnit);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_ORGANIZATIONID,
			new Object[] { oepUserMgtWorkingUnit.getOrganizationId() },
			oepUserMgtWorkingUnit);

		oepUserMgtWorkingUnit.resetOriginalValues();
	}

	/**
	 * Caches the o e p user mgt working units in the entity cache if it is enabled.
	 *
	 * @param oepUserMgtWorkingUnits the o e p user mgt working units
	 */
	@Override
	public void cacheResult(List<OEPUserMgtWorkingUnit> oepUserMgtWorkingUnits) {
		for (OEPUserMgtWorkingUnit oepUserMgtWorkingUnit : oepUserMgtWorkingUnits) {
			if (EntityCacheUtil.getResult(
						OEPUserMgtWorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
						OEPUserMgtWorkingUnitImpl.class,
						oepUserMgtWorkingUnit.getPrimaryKey()) == null) {
				cacheResult(oepUserMgtWorkingUnit);
			}
			else {
				oepUserMgtWorkingUnit.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all o e p user mgt working units.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(OEPUserMgtWorkingUnitImpl.class.getName());
		}

		EntityCacheUtil.clearCache(OEPUserMgtWorkingUnitImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the o e p user mgt working unit.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OEPUserMgtWorkingUnit oepUserMgtWorkingUnit) {
		EntityCacheUtil.removeResult(OEPUserMgtWorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtWorkingUnitImpl.class,
			oepUserMgtWorkingUnit.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(oepUserMgtWorkingUnit);
	}

	@Override
	public void clearCache(List<OEPUserMgtWorkingUnit> oepUserMgtWorkingUnits) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (OEPUserMgtWorkingUnit oepUserMgtWorkingUnit : oepUserMgtWorkingUnits) {
			EntityCacheUtil.removeResult(OEPUserMgtWorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
				OEPUserMgtWorkingUnitImpl.class,
				oepUserMgtWorkingUnit.getPrimaryKey());

			clearUniqueFindersCache(oepUserMgtWorkingUnit);
		}
	}

	protected void cacheUniqueFindersCache(
		OEPUserMgtWorkingUnit oepUserMgtWorkingUnit) {
		if (oepUserMgtWorkingUnit.isNew()) {
			Object[] args = new Object[] { oepUserMgtWorkingUnit.getGovAgentId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GOVAGENTID, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GOVAGENTID, args,
				oepUserMgtWorkingUnit);

			args = new Object[] { oepUserMgtWorkingUnit.getOrganizationId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_F_ORGANIZATIONID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_ORGANIZATIONID,
				args, oepUserMgtWorkingUnit);
		}
		else {
			OEPUserMgtWorkingUnitModelImpl oepUserMgtWorkingUnitModelImpl = (OEPUserMgtWorkingUnitModelImpl)oepUserMgtWorkingUnit;

			if ((oepUserMgtWorkingUnitModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_GOVAGENTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						oepUserMgtWorkingUnit.getGovAgentId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GOVAGENTID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GOVAGENTID,
					args, oepUserMgtWorkingUnit);
			}

			if ((oepUserMgtWorkingUnitModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_F_ORGANIZATIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						oepUserMgtWorkingUnit.getOrganizationId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_F_ORGANIZATIONID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_ORGANIZATIONID,
					args, oepUserMgtWorkingUnit);
			}
		}
	}

	protected void clearUniqueFindersCache(
		OEPUserMgtWorkingUnit oepUserMgtWorkingUnit) {
		OEPUserMgtWorkingUnitModelImpl oepUserMgtWorkingUnitModelImpl = (OEPUserMgtWorkingUnitModelImpl)oepUserMgtWorkingUnit;

		Object[] args = new Object[] { oepUserMgtWorkingUnit.getGovAgentId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GOVAGENTID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GOVAGENTID, args);

		if ((oepUserMgtWorkingUnitModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_GOVAGENTID.getColumnBitmask()) != 0) {
			args = new Object[] {
					oepUserMgtWorkingUnitModelImpl.getOriginalGovAgentId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GOVAGENTID, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GOVAGENTID, args);
		}

		args = new Object[] { oepUserMgtWorkingUnit.getOrganizationId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_ORGANIZATIONID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_F_ORGANIZATIONID, args);

		if ((oepUserMgtWorkingUnitModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_F_ORGANIZATIONID.getColumnBitmask()) != 0) {
			args = new Object[] {
					oepUserMgtWorkingUnitModelImpl.getOriginalOrganizationId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_ORGANIZATIONID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_F_ORGANIZATIONID,
				args);
		}
	}

	/**
	 * Creates a new o e p user mgt working unit with the primary key. Does not add the o e p user mgt working unit to the database.
	 *
	 * @param workingUnitId the primary key for the new o e p user mgt working unit
	 * @return the new o e p user mgt working unit
	 */
	@Override
	public OEPUserMgtWorkingUnit create(long workingUnitId) {
		OEPUserMgtWorkingUnit oepUserMgtWorkingUnit = new OEPUserMgtWorkingUnitImpl();

		oepUserMgtWorkingUnit.setNew(true);
		oepUserMgtWorkingUnit.setPrimaryKey(workingUnitId);

		return oepUserMgtWorkingUnit;
	}

	/**
	 * Removes the o e p user mgt working unit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param workingUnitId the primary key of the o e p user mgt working unit
	 * @return the o e p user mgt working unit that was removed
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnitException if a o e p user mgt working unit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtWorkingUnit remove(long workingUnitId)
		throws NoSuchOEPUserMgtWorkingUnitException, SystemException {
		return remove((Serializable)workingUnitId);
	}

	/**
	 * Removes the o e p user mgt working unit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the o e p user mgt working unit
	 * @return the o e p user mgt working unit that was removed
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnitException if a o e p user mgt working unit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtWorkingUnit remove(Serializable primaryKey)
		throws NoSuchOEPUserMgtWorkingUnitException, SystemException {
		Session session = null;

		try {
			session = openSession();

			OEPUserMgtWorkingUnit oepUserMgtWorkingUnit = (OEPUserMgtWorkingUnit)session.get(OEPUserMgtWorkingUnitImpl.class,
					primaryKey);

			if (oepUserMgtWorkingUnit == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOEPUserMgtWorkingUnitException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(oepUserMgtWorkingUnit);
		}
		catch (NoSuchOEPUserMgtWorkingUnitException nsee) {
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
	protected OEPUserMgtWorkingUnit removeImpl(
		OEPUserMgtWorkingUnit oepUserMgtWorkingUnit) throws SystemException {
		oepUserMgtWorkingUnit = toUnwrappedModel(oepUserMgtWorkingUnit);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(oepUserMgtWorkingUnit)) {
				oepUserMgtWorkingUnit = (OEPUserMgtWorkingUnit)session.get(OEPUserMgtWorkingUnitImpl.class,
						oepUserMgtWorkingUnit.getPrimaryKeyObj());
			}

			if (oepUserMgtWorkingUnit != null) {
				session.delete(oepUserMgtWorkingUnit);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (oepUserMgtWorkingUnit != null) {
			clearCache(oepUserMgtWorkingUnit);
		}

		return oepUserMgtWorkingUnit;
	}

	@Override
	public OEPUserMgtWorkingUnit updateImpl(
		vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit oepUserMgtWorkingUnit)
		throws SystemException {
		oepUserMgtWorkingUnit = toUnwrappedModel(oepUserMgtWorkingUnit);

		boolean isNew = oepUserMgtWorkingUnit.isNew();

		OEPUserMgtWorkingUnitModelImpl oepUserMgtWorkingUnitModelImpl = (OEPUserMgtWorkingUnitModelImpl)oepUserMgtWorkingUnit;

		Session session = null;

		try {
			session = openSession();

			if (oepUserMgtWorkingUnit.isNew()) {
				session.save(oepUserMgtWorkingUnit);

				oepUserMgtWorkingUnit.setNew(false);
			}
			else {
				session.merge(oepUserMgtWorkingUnit);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !OEPUserMgtWorkingUnitModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((oepUserMgtWorkingUnitModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_PARENTWORKINGUNITID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						oepUserMgtWorkingUnitModelImpl.getOriginalParentWorkingUnitId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_PARENTWORKINGUNITID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_PARENTWORKINGUNITID,
					args);

				args = new Object[] {
						oepUserMgtWorkingUnitModelImpl.getParentWorkingUnitId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_PARENTWORKINGUNITID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_PARENTWORKINGUNITID,
					args);
			}
		}

		EntityCacheUtil.putResult(OEPUserMgtWorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtWorkingUnitImpl.class,
			oepUserMgtWorkingUnit.getPrimaryKey(), oepUserMgtWorkingUnit);

		clearUniqueFindersCache(oepUserMgtWorkingUnit);
		cacheUniqueFindersCache(oepUserMgtWorkingUnit);

		return oepUserMgtWorkingUnit;
	}

	protected OEPUserMgtWorkingUnit toUnwrappedModel(
		OEPUserMgtWorkingUnit oepUserMgtWorkingUnit) {
		if (oepUserMgtWorkingUnit instanceof OEPUserMgtWorkingUnitImpl) {
			return oepUserMgtWorkingUnit;
		}

		OEPUserMgtWorkingUnitImpl oepUserMgtWorkingUnitImpl = new OEPUserMgtWorkingUnitImpl();

		oepUserMgtWorkingUnitImpl.setNew(oepUserMgtWorkingUnit.isNew());
		oepUserMgtWorkingUnitImpl.setPrimaryKey(oepUserMgtWorkingUnit.getPrimaryKey());

		oepUserMgtWorkingUnitImpl.setWorkingUnitId(oepUserMgtWorkingUnit.getWorkingUnitId());
		oepUserMgtWorkingUnitImpl.setUserId(oepUserMgtWorkingUnit.getUserId());
		oepUserMgtWorkingUnitImpl.setGroupId(oepUserMgtWorkingUnit.getGroupId());
		oepUserMgtWorkingUnitImpl.setCreateDate(oepUserMgtWorkingUnit.getCreateDate());
		oepUserMgtWorkingUnitImpl.setModifiedDate(oepUserMgtWorkingUnit.getModifiedDate());
		oepUserMgtWorkingUnitImpl.setOrganizationId(oepUserMgtWorkingUnit.getOrganizationId());
		oepUserMgtWorkingUnitImpl.setGovAgentId(oepUserMgtWorkingUnit.getGovAgentId());
		oepUserMgtWorkingUnitImpl.setName(oepUserMgtWorkingUnit.getName());
		oepUserMgtWorkingUnitImpl.setEnname(oepUserMgtWorkingUnit.getEnname());
		oepUserMgtWorkingUnitImpl.setIsRoot(oepUserMgtWorkingUnit.getIsRoot());
		oepUserMgtWorkingUnitImpl.setParentWorkingUnitId(oepUserMgtWorkingUnit.getParentWorkingUnitId());
		oepUserMgtWorkingUnitImpl.setAddress(oepUserMgtWorkingUnit.getAddress());
		oepUserMgtWorkingUnitImpl.setCityNo(oepUserMgtWorkingUnit.getCityNo());
		oepUserMgtWorkingUnitImpl.setCityName(oepUserMgtWorkingUnit.getCityName());
		oepUserMgtWorkingUnitImpl.setDistrictNo(oepUserMgtWorkingUnit.getDistrictNo());
		oepUserMgtWorkingUnitImpl.setDistrictName(oepUserMgtWorkingUnit.getDistrictName());
		oepUserMgtWorkingUnitImpl.setWardNo(oepUserMgtWorkingUnit.getWardNo());
		oepUserMgtWorkingUnitImpl.setWardName(oepUserMgtWorkingUnit.getWardName());
		oepUserMgtWorkingUnitImpl.setGpsPosition(oepUserMgtWorkingUnit.getGpsPosition());
		oepUserMgtWorkingUnitImpl.setTelNo(oepUserMgtWorkingUnit.getTelNo());
		oepUserMgtWorkingUnitImpl.setFax(oepUserMgtWorkingUnit.getFax());
		oepUserMgtWorkingUnitImpl.setEmail(oepUserMgtWorkingUnit.getEmail());
		oepUserMgtWorkingUnitImpl.setWebsite(oepUserMgtWorkingUnit.getWebsite());

		return oepUserMgtWorkingUnitImpl;
	}

	/**
	 * Returns the o e p user mgt working unit with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the o e p user mgt working unit
	 * @return the o e p user mgt working unit
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnitException if a o e p user mgt working unit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtWorkingUnit findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOEPUserMgtWorkingUnitException, SystemException {
		OEPUserMgtWorkingUnit oepUserMgtWorkingUnit = fetchByPrimaryKey(primaryKey);

		if (oepUserMgtWorkingUnit == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOEPUserMgtWorkingUnitException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return oepUserMgtWorkingUnit;
	}

	/**
	 * Returns the o e p user mgt working unit with the primary key or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnitException} if it could not be found.
	 *
	 * @param workingUnitId the primary key of the o e p user mgt working unit
	 * @return the o e p user mgt working unit
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnitException if a o e p user mgt working unit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtWorkingUnit findByPrimaryKey(long workingUnitId)
		throws NoSuchOEPUserMgtWorkingUnitException, SystemException {
		return findByPrimaryKey((Serializable)workingUnitId);
	}

	/**
	 * Returns the o e p user mgt working unit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the o e p user mgt working unit
	 * @return the o e p user mgt working unit, or <code>null</code> if a o e p user mgt working unit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtWorkingUnit fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		OEPUserMgtWorkingUnit oepUserMgtWorkingUnit = (OEPUserMgtWorkingUnit)EntityCacheUtil.getResult(OEPUserMgtWorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
				OEPUserMgtWorkingUnitImpl.class, primaryKey);

		if (oepUserMgtWorkingUnit == _nullOEPUserMgtWorkingUnit) {
			return null;
		}

		if (oepUserMgtWorkingUnit == null) {
			Session session = null;

			try {
				session = openSession();

				oepUserMgtWorkingUnit = (OEPUserMgtWorkingUnit)session.get(OEPUserMgtWorkingUnitImpl.class,
						primaryKey);

				if (oepUserMgtWorkingUnit != null) {
					cacheResult(oepUserMgtWorkingUnit);
				}
				else {
					EntityCacheUtil.putResult(OEPUserMgtWorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
						OEPUserMgtWorkingUnitImpl.class, primaryKey,
						_nullOEPUserMgtWorkingUnit);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(OEPUserMgtWorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
					OEPUserMgtWorkingUnitImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return oepUserMgtWorkingUnit;
	}

	/**
	 * Returns the o e p user mgt working unit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param workingUnitId the primary key of the o e p user mgt working unit
	 * @return the o e p user mgt working unit, or <code>null</code> if a o e p user mgt working unit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtWorkingUnit fetchByPrimaryKey(long workingUnitId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)workingUnitId);
	}

	/**
	 * Returns all the o e p user mgt working units.
	 *
	 * @return the o e p user mgt working units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OEPUserMgtWorkingUnit> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the o e p user mgt working units.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtWorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of o e p user mgt working units
	 * @param end the upper bound of the range of o e p user mgt working units (not inclusive)
	 * @return the range of o e p user mgt working units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OEPUserMgtWorkingUnit> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the o e p user mgt working units.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtWorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of o e p user mgt working units
	 * @param end the upper bound of the range of o e p user mgt working units (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of o e p user mgt working units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OEPUserMgtWorkingUnit> findAll(int start, int end,
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

		List<OEPUserMgtWorkingUnit> list = (List<OEPUserMgtWorkingUnit>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_OEPUSERMGTWORKINGUNIT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_OEPUSERMGTWORKINGUNIT;

				if (pagination) {
					sql = sql.concat(OEPUserMgtWorkingUnitModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<OEPUserMgtWorkingUnit>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<OEPUserMgtWorkingUnit>(list);
				}
				else {
					list = (List<OEPUserMgtWorkingUnit>)QueryUtil.list(q,
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
	 * Removes all the o e p user mgt working units from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (OEPUserMgtWorkingUnit oepUserMgtWorkingUnit : findAll()) {
			remove(oepUserMgtWorkingUnit);
		}
	}

	/**
	 * Returns the number of o e p user mgt working units.
	 *
	 * @return the number of o e p user mgt working units
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

				Query q = session.createQuery(_SQL_COUNT_OEPUSERMGTWORKINGUNIT);

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
	 * Initializes the o e p user mgt working unit persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<OEPUserMgtWorkingUnit>> listenersList = new ArrayList<ModelListener<OEPUserMgtWorkingUnit>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<OEPUserMgtWorkingUnit>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(OEPUserMgtWorkingUnitImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_OEPUSERMGTWORKINGUNIT = "SELECT oepUserMgtWorkingUnit FROM OEPUserMgtWorkingUnit oepUserMgtWorkingUnit";
	private static final String _SQL_SELECT_OEPUSERMGTWORKINGUNIT_WHERE = "SELECT oepUserMgtWorkingUnit FROM OEPUserMgtWorkingUnit oepUserMgtWorkingUnit WHERE ";
	private static final String _SQL_COUNT_OEPUSERMGTWORKINGUNIT = "SELECT COUNT(oepUserMgtWorkingUnit) FROM OEPUserMgtWorkingUnit oepUserMgtWorkingUnit";
	private static final String _SQL_COUNT_OEPUSERMGTWORKINGUNIT_WHERE = "SELECT COUNT(oepUserMgtWorkingUnit) FROM OEPUserMgtWorkingUnit oepUserMgtWorkingUnit WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "oepUserMgtWorkingUnit.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No OEPUserMgtWorkingUnit exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No OEPUserMgtWorkingUnit exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(OEPUserMgtWorkingUnitPersistenceImpl.class);
	private static OEPUserMgtWorkingUnit _nullOEPUserMgtWorkingUnit = new OEPUserMgtWorkingUnitImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<OEPUserMgtWorkingUnit> toCacheModel() {
				return _nullOEPUserMgtWorkingUnitCacheModel;
			}
		};

	private static CacheModel<OEPUserMgtWorkingUnit> _nullOEPUserMgtWorkingUnitCacheModel =
		new CacheModel<OEPUserMgtWorkingUnit>() {
			@Override
			public OEPUserMgtWorkingUnit toEntityModel() {
				return _nullOEPUserMgtWorkingUnit;
			}
		};
}