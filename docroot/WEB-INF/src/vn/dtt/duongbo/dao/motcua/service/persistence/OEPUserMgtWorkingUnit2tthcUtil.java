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

import vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc;

import java.util.List;

/**
 * The persistence utility for the o e p user mgt working unit2tthc service. This utility wraps {@link OEPUserMgtWorkingUnit2tthcPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see OEPUserMgtWorkingUnit2tthcPersistence
 * @see OEPUserMgtWorkingUnit2tthcPersistenceImpl
 * @generated
 */
public class OEPUserMgtWorkingUnit2tthcUtil {
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
	public static void clearCache(
		OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc) {
		getPersistence().clearCache(oepUserMgtWorkingUnit2tthc);
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
	public static List<OEPUserMgtWorkingUnit2tthc> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OEPUserMgtWorkingUnit2tthc> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OEPUserMgtWorkingUnit2tthc> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static OEPUserMgtWorkingUnit2tthc update(
		OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc)
		throws SystemException {
		return getPersistence().update(oepUserMgtWorkingUnit2tthc);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static OEPUserMgtWorkingUnit2tthc update(
		OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(oepUserMgtWorkingUnit2tthc, serviceContext);
	}

	/**
	* Returns all the o e p user mgt working unit2tthcs where TTHCId = &#63;.
	*
	* @param TTHCId the t t h c ID
	* @return the matching o e p user mgt working unit2tthcs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc> findByF_TTHCId(
		long TTHCId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByF_TTHCId(TTHCId);
	}

	/**
	* Returns a range of all the o e p user mgt working unit2tthcs where TTHCId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtWorkingUnit2tthcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param TTHCId the t t h c ID
	* @param start the lower bound of the range of o e p user mgt working unit2tthcs
	* @param end the upper bound of the range of o e p user mgt working unit2tthcs (not inclusive)
	* @return the range of matching o e p user mgt working unit2tthcs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc> findByF_TTHCId(
		long TTHCId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByF_TTHCId(TTHCId, start, end);
	}

	/**
	* Returns an ordered range of all the o e p user mgt working unit2tthcs where TTHCId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtWorkingUnit2tthcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param TTHCId the t t h c ID
	* @param start the lower bound of the range of o e p user mgt working unit2tthcs
	* @param end the upper bound of the range of o e p user mgt working unit2tthcs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching o e p user mgt working unit2tthcs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc> findByF_TTHCId(
		long TTHCId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByF_TTHCId(TTHCId, start, end, orderByComparator);
	}

	/**
	* Returns the first o e p user mgt working unit2tthc in the ordered set where TTHCId = &#63;.
	*
	* @param TTHCId the t t h c ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching o e p user mgt working unit2tthc
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException if a matching o e p user mgt working unit2tthc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc findByF_TTHCId_First(
		long TTHCId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException {
		return getPersistence().findByF_TTHCId_First(TTHCId, orderByComparator);
	}

	/**
	* Returns the first o e p user mgt working unit2tthc in the ordered set where TTHCId = &#63;.
	*
	* @param TTHCId the t t h c ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching o e p user mgt working unit2tthc, or <code>null</code> if a matching o e p user mgt working unit2tthc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc fetchByF_TTHCId_First(
		long TTHCId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByF_TTHCId_First(TTHCId, orderByComparator);
	}

	/**
	* Returns the last o e p user mgt working unit2tthc in the ordered set where TTHCId = &#63;.
	*
	* @param TTHCId the t t h c ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching o e p user mgt working unit2tthc
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException if a matching o e p user mgt working unit2tthc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc findByF_TTHCId_Last(
		long TTHCId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException {
		return getPersistence().findByF_TTHCId_Last(TTHCId, orderByComparator);
	}

	/**
	* Returns the last o e p user mgt working unit2tthc in the ordered set where TTHCId = &#63;.
	*
	* @param TTHCId the t t h c ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching o e p user mgt working unit2tthc, or <code>null</code> if a matching o e p user mgt working unit2tthc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc fetchByF_TTHCId_Last(
		long TTHCId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByF_TTHCId_Last(TTHCId, orderByComparator);
	}

	/**
	* Returns the o e p user mgt working unit2tthcs before and after the current o e p user mgt working unit2tthc in the ordered set where TTHCId = &#63;.
	*
	* @param workingUnit2TTHCId the primary key of the current o e p user mgt working unit2tthc
	* @param TTHCId the t t h c ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next o e p user mgt working unit2tthc
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException if a o e p user mgt working unit2tthc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc[] findByF_TTHCId_PrevAndNext(
		long workingUnit2TTHCId, long TTHCId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException {
		return getPersistence()
				   .findByF_TTHCId_PrevAndNext(workingUnit2TTHCId, TTHCId,
			orderByComparator);
	}

	/**
	* Removes all the o e p user mgt working unit2tthcs where TTHCId = &#63; from the database.
	*
	* @param TTHCId the t t h c ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByF_TTHCId(long TTHCId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByF_TTHCId(TTHCId);
	}

	/**
	* Returns the number of o e p user mgt working unit2tthcs where TTHCId = &#63;.
	*
	* @param TTHCId the t t h c ID
	* @return the number of matching o e p user mgt working unit2tthcs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByF_TTHCId(long TTHCId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByF_TTHCId(TTHCId);
	}

	/**
	* Returns the o e p user mgt working unit2tthc where TTHCId = &#63; and workingUnitId = &#63; or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException} if it could not be found.
	*
	* @param TTHCId the t t h c ID
	* @param workingUnitId the working unit ID
	* @return the matching o e p user mgt working unit2tthc
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException if a matching o e p user mgt working unit2tthc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc findByF_TTHCId_workingUnitId(
		long TTHCId, long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException {
		return getPersistence()
				   .findByF_TTHCId_workingUnitId(TTHCId, workingUnitId);
	}

	/**
	* Returns the o e p user mgt working unit2tthc where TTHCId = &#63; and workingUnitId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param TTHCId the t t h c ID
	* @param workingUnitId the working unit ID
	* @return the matching o e p user mgt working unit2tthc, or <code>null</code> if a matching o e p user mgt working unit2tthc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc fetchByF_TTHCId_workingUnitId(
		long TTHCId, long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByF_TTHCId_workingUnitId(TTHCId, workingUnitId);
	}

	/**
	* Returns the o e p user mgt working unit2tthc where TTHCId = &#63; and workingUnitId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param TTHCId the t t h c ID
	* @param workingUnitId the working unit ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching o e p user mgt working unit2tthc, or <code>null</code> if a matching o e p user mgt working unit2tthc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc fetchByF_TTHCId_workingUnitId(
		long TTHCId, long workingUnitId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByF_TTHCId_workingUnitId(TTHCId, workingUnitId,
			retrieveFromCache);
	}

	/**
	* Removes the o e p user mgt working unit2tthc where TTHCId = &#63; and workingUnitId = &#63; from the database.
	*
	* @param TTHCId the t t h c ID
	* @param workingUnitId the working unit ID
	* @return the o e p user mgt working unit2tthc that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc removeByF_TTHCId_workingUnitId(
		long TTHCId, long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException {
		return getPersistence()
				   .removeByF_TTHCId_workingUnitId(TTHCId, workingUnitId);
	}

	/**
	* Returns the number of o e p user mgt working unit2tthcs where TTHCId = &#63; and workingUnitId = &#63;.
	*
	* @param TTHCId the t t h c ID
	* @param workingUnitId the working unit ID
	* @return the number of matching o e p user mgt working unit2tthcs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByF_TTHCId_workingUnitId(long TTHCId,
		long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByF_TTHCId_workingUnitId(TTHCId, workingUnitId);
	}

	/**
	* Caches the o e p user mgt working unit2tthc in the entity cache if it is enabled.
	*
	* @param oepUserMgtWorkingUnit2tthc the o e p user mgt working unit2tthc
	*/
	public static void cacheResult(
		vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc) {
		getPersistence().cacheResult(oepUserMgtWorkingUnit2tthc);
	}

	/**
	* Caches the o e p user mgt working unit2tthcs in the entity cache if it is enabled.
	*
	* @param oepUserMgtWorkingUnit2tthcs the o e p user mgt working unit2tthcs
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc> oepUserMgtWorkingUnit2tthcs) {
		getPersistence().cacheResult(oepUserMgtWorkingUnit2tthcs);
	}

	/**
	* Creates a new o e p user mgt working unit2tthc with the primary key. Does not add the o e p user mgt working unit2tthc to the database.
	*
	* @param workingUnit2TTHCId the primary key for the new o e p user mgt working unit2tthc
	* @return the new o e p user mgt working unit2tthc
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc create(
		long workingUnit2TTHCId) {
		return getPersistence().create(workingUnit2TTHCId);
	}

	/**
	* Removes the o e p user mgt working unit2tthc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param workingUnit2TTHCId the primary key of the o e p user mgt working unit2tthc
	* @return the o e p user mgt working unit2tthc that was removed
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException if a o e p user mgt working unit2tthc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc remove(
		long workingUnit2TTHCId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException {
		return getPersistence().remove(workingUnit2TTHCId);
	}

	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc updateImpl(
		vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(oepUserMgtWorkingUnit2tthc);
	}

	/**
	* Returns the o e p user mgt working unit2tthc with the primary key or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException} if it could not be found.
	*
	* @param workingUnit2TTHCId the primary key of the o e p user mgt working unit2tthc
	* @return the o e p user mgt working unit2tthc
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException if a o e p user mgt working unit2tthc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc findByPrimaryKey(
		long workingUnit2TTHCId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException {
		return getPersistence().findByPrimaryKey(workingUnit2TTHCId);
	}

	/**
	* Returns the o e p user mgt working unit2tthc with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param workingUnit2TTHCId the primary key of the o e p user mgt working unit2tthc
	* @return the o e p user mgt working unit2tthc, or <code>null</code> if a o e p user mgt working unit2tthc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc fetchByPrimaryKey(
		long workingUnit2TTHCId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(workingUnit2TTHCId);
	}

	/**
	* Returns all the o e p user mgt working unit2tthcs.
	*
	* @return the o e p user mgt working unit2tthcs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the o e p user mgt working unit2tthcs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtWorkingUnit2tthcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of o e p user mgt working unit2tthcs
	* @param end the upper bound of the range of o e p user mgt working unit2tthcs (not inclusive)
	* @return the range of o e p user mgt working unit2tthcs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the o e p user mgt working unit2tthcs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtWorkingUnit2tthcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of o e p user mgt working unit2tthcs
	* @param end the upper bound of the range of o e p user mgt working unit2tthcs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of o e p user mgt working unit2tthcs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the o e p user mgt working unit2tthcs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of o e p user mgt working unit2tthcs.
	*
	* @return the number of o e p user mgt working unit2tthcs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static OEPUserMgtWorkingUnit2tthcPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (OEPUserMgtWorkingUnit2tthcPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.motcua.service.ClpSerializer.getServletContextName(),
					OEPUserMgtWorkingUnit2tthcPersistence.class.getName());

			ReferenceRegistry.registerReference(OEPUserMgtWorkingUnit2tthcUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(
		OEPUserMgtWorkingUnit2tthcPersistence persistence) {
	}

	private static OEPUserMgtWorkingUnit2tthcPersistence _persistence;
}