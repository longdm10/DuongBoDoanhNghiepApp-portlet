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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit;

import java.util.List;

/**
 * The persistence utility for the o e p user mgt working unit service. This utility wraps {@link OEPUserMgtWorkingUnitPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see OEPUserMgtWorkingUnitPersistence
 * @see OEPUserMgtWorkingUnitPersistenceImpl
 * @generated
 */
public class OEPUserMgtWorkingUnitUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(OEPUserMgtWorkingUnit oepUserMgtWorkingUnit) {
		getPersistence().clearCache(oepUserMgtWorkingUnit);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OEPUserMgtWorkingUnit> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OEPUserMgtWorkingUnit> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OEPUserMgtWorkingUnit> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static OEPUserMgtWorkingUnit update(
		OEPUserMgtWorkingUnit oepUserMgtWorkingUnit) throws SystemException {
		return getPersistence().update(oepUserMgtWorkingUnit);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static OEPUserMgtWorkingUnit update(
		OEPUserMgtWorkingUnit oepUserMgtWorkingUnit,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(oepUserMgtWorkingUnit, serviceContext);
	}

	/**
	* Returns the o e p user mgt working unit where govAgentId = &#63; or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnitException} if it could not be found.
	*
	* @param govAgentId the gov agent ID
	* @return the matching o e p user mgt working unit
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnitException if a matching o e p user mgt working unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit findByGovAgentId(
		java.lang.String govAgentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnitException {
		return getPersistence().findByGovAgentId(govAgentId);
	}

	/**
	* Returns the o e p user mgt working unit where govAgentId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param govAgentId the gov agent ID
	* @return the matching o e p user mgt working unit, or <code>null</code> if a matching o e p user mgt working unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit fetchByGovAgentId(
		java.lang.String govAgentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGovAgentId(govAgentId);
	}

	/**
	* Returns the o e p user mgt working unit where govAgentId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param govAgentId the gov agent ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching o e p user mgt working unit, or <code>null</code> if a matching o e p user mgt working unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit fetchByGovAgentId(
		java.lang.String govAgentId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGovAgentId(govAgentId, retrieveFromCache);
	}

	/**
	* Removes the o e p user mgt working unit where govAgentId = &#63; from the database.
	*
	* @param govAgentId the gov agent ID
	* @return the o e p user mgt working unit that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit removeByGovAgentId(
		java.lang.String govAgentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnitException {
		return getPersistence().removeByGovAgentId(govAgentId);
	}

	/**
	* Returns the number of o e p user mgt working units where govAgentId = &#63;.
	*
	* @param govAgentId the gov agent ID
	* @return the number of matching o e p user mgt working units
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGovAgentId(java.lang.String govAgentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGovAgentId(govAgentId);
	}

	/**
	* Returns the o e p user mgt working unit where organizationId = &#63; or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnitException} if it could not be found.
	*
	* @param organizationId the organization ID
	* @return the matching o e p user mgt working unit
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnitException if a matching o e p user mgt working unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit findByF_organizationId(
		java.lang.String organizationId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnitException {
		return getPersistence().findByF_organizationId(organizationId);
	}

	/**
	* Returns the o e p user mgt working unit where organizationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param organizationId the organization ID
	* @return the matching o e p user mgt working unit, or <code>null</code> if a matching o e p user mgt working unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit fetchByF_organizationId(
		java.lang.String organizationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByF_organizationId(organizationId);
	}

	/**
	* Returns the o e p user mgt working unit where organizationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param organizationId the organization ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching o e p user mgt working unit, or <code>null</code> if a matching o e p user mgt working unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit fetchByF_organizationId(
		java.lang.String organizationId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByF_organizationId(organizationId, retrieveFromCache);
	}

	/**
	* Removes the o e p user mgt working unit where organizationId = &#63; from the database.
	*
	* @param organizationId the organization ID
	* @return the o e p user mgt working unit that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit removeByF_organizationId(
		java.lang.String organizationId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnitException {
		return getPersistence().removeByF_organizationId(organizationId);
	}

	/**
	* Returns the number of o e p user mgt working units where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the number of matching o e p user mgt working units
	* @throws SystemException if a system exception occurred
	*/
	public static int countByF_organizationId(java.lang.String organizationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByF_organizationId(organizationId);
	}

	/**
	* Returns all the o e p user mgt working units where parentWorkingUnitId = &#63;.
	*
	* @param parentWorkingUnitId the parent working unit ID
	* @return the matching o e p user mgt working units
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit> findByF_parentWorkingUnitId(
		long parentWorkingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByF_parentWorkingUnitId(parentWorkingUnitId);
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
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit> findByF_parentWorkingUnitId(
		long parentWorkingUnitId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByF_parentWorkingUnitId(parentWorkingUnitId, start, end);
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
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit> findByF_parentWorkingUnitId(
		long parentWorkingUnitId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByF_parentWorkingUnitId(parentWorkingUnitId, start,
			end, orderByComparator);
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
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit findByF_parentWorkingUnitId_First(
		long parentWorkingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnitException {
		return getPersistence()
				   .findByF_parentWorkingUnitId_First(parentWorkingUnitId,
			orderByComparator);
	}

	/**
	* Returns the first o e p user mgt working unit in the ordered set where parentWorkingUnitId = &#63;.
	*
	* @param parentWorkingUnitId the parent working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching o e p user mgt working unit, or <code>null</code> if a matching o e p user mgt working unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit fetchByF_parentWorkingUnitId_First(
		long parentWorkingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByF_parentWorkingUnitId_First(parentWorkingUnitId,
			orderByComparator);
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
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit findByF_parentWorkingUnitId_Last(
		long parentWorkingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnitException {
		return getPersistence()
				   .findByF_parentWorkingUnitId_Last(parentWorkingUnitId,
			orderByComparator);
	}

	/**
	* Returns the last o e p user mgt working unit in the ordered set where parentWorkingUnitId = &#63;.
	*
	* @param parentWorkingUnitId the parent working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching o e p user mgt working unit, or <code>null</code> if a matching o e p user mgt working unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit fetchByF_parentWorkingUnitId_Last(
		long parentWorkingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByF_parentWorkingUnitId_Last(parentWorkingUnitId,
			orderByComparator);
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
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit[] findByF_parentWorkingUnitId_PrevAndNext(
		long workingUnitId, long parentWorkingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnitException {
		return getPersistence()
				   .findByF_parentWorkingUnitId_PrevAndNext(workingUnitId,
			parentWorkingUnitId, orderByComparator);
	}

	/**
	* Removes all the o e p user mgt working units where parentWorkingUnitId = &#63; from the database.
	*
	* @param parentWorkingUnitId the parent working unit ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByF_parentWorkingUnitId(long parentWorkingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByF_parentWorkingUnitId(parentWorkingUnitId);
	}

	/**
	* Returns the number of o e p user mgt working units where parentWorkingUnitId = &#63;.
	*
	* @param parentWorkingUnitId the parent working unit ID
	* @return the number of matching o e p user mgt working units
	* @throws SystemException if a system exception occurred
	*/
	public static int countByF_parentWorkingUnitId(long parentWorkingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByF_parentWorkingUnitId(parentWorkingUnitId);
	}

	/**
	* Caches the o e p user mgt working unit in the entity cache if it is enabled.
	*
	* @param oepUserMgtWorkingUnit the o e p user mgt working unit
	*/
	public static void cacheResult(
		vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit oepUserMgtWorkingUnit) {
		getPersistence().cacheResult(oepUserMgtWorkingUnit);
	}

	/**
	* Caches the o e p user mgt working units in the entity cache if it is enabled.
	*
	* @param oepUserMgtWorkingUnits the o e p user mgt working units
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit> oepUserMgtWorkingUnits) {
		getPersistence().cacheResult(oepUserMgtWorkingUnits);
	}

	/**
	* Creates a new o e p user mgt working unit with the primary key. Does not add the o e p user mgt working unit to the database.
	*
	* @param workingUnitId the primary key for the new o e p user mgt working unit
	* @return the new o e p user mgt working unit
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit create(
		long workingUnitId) {
		return getPersistence().create(workingUnitId);
	}

	/**
	* Removes the o e p user mgt working unit with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param workingUnitId the primary key of the o e p user mgt working unit
	* @return the o e p user mgt working unit that was removed
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnitException if a o e p user mgt working unit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit remove(
		long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnitException {
		return getPersistence().remove(workingUnitId);
	}

	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit updateImpl(
		vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit oepUserMgtWorkingUnit)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(oepUserMgtWorkingUnit);
	}

	/**
	* Returns the o e p user mgt working unit with the primary key or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnitException} if it could not be found.
	*
	* @param workingUnitId the primary key of the o e p user mgt working unit
	* @return the o e p user mgt working unit
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnitException if a o e p user mgt working unit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit findByPrimaryKey(
		long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnitException {
		return getPersistence().findByPrimaryKey(workingUnitId);
	}

	/**
	* Returns the o e p user mgt working unit with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param workingUnitId the primary key of the o e p user mgt working unit
	* @return the o e p user mgt working unit, or <code>null</code> if a o e p user mgt working unit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit fetchByPrimaryKey(
		long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(workingUnitId);
	}

	/**
	* Returns all the o e p user mgt working units.
	*
	* @return the o e p user mgt working units
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
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
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the o e p user mgt working units from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of o e p user mgt working units.
	*
	* @return the number of o e p user mgt working units
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static OEPUserMgtWorkingUnitPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (OEPUserMgtWorkingUnitPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.motcua.service.ClpSerializer.getServletContextName(),
					OEPUserMgtWorkingUnitPersistence.class.getName());

			ReferenceRegistry.registerReference(OEPUserMgtWorkingUnitUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(OEPUserMgtWorkingUnitPersistence persistence) {
	}

	private static OEPUserMgtWorkingUnitPersistence _persistence;
}