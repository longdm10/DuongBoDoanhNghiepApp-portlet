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

import vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee;

import java.util.List;

/**
 * The persistence utility for the o e p user mgt employee service. This utility wraps {@link OEPUserMgtEmployeePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see OEPUserMgtEmployeePersistence
 * @see OEPUserMgtEmployeePersistenceImpl
 * @generated
 */
public class OEPUserMgtEmployeeUtil {
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
	public static void clearCache(OEPUserMgtEmployee oepUserMgtEmployee) {
		getPersistence().clearCache(oepUserMgtEmployee);
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
	public static List<OEPUserMgtEmployee> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OEPUserMgtEmployee> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OEPUserMgtEmployee> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static OEPUserMgtEmployee update(
		OEPUserMgtEmployee oepUserMgtEmployee) throws SystemException {
		return getPersistence().update(oepUserMgtEmployee);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static OEPUserMgtEmployee update(
		OEPUserMgtEmployee oepUserMgtEmployee, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(oepUserMgtEmployee, serviceContext);
	}

	/**
	* Returns all the o e p user mgt employees where workingUnitId = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @return the matching o e p user mgt employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee> findByF_workingUnitId(
		long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByF_workingUnitId(workingUnitId);
	}

	/**
	* Returns a range of all the o e p user mgt employees where workingUnitId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param workingUnitId the working unit ID
	* @param start the lower bound of the range of o e p user mgt employees
	* @param end the upper bound of the range of o e p user mgt employees (not inclusive)
	* @return the range of matching o e p user mgt employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee> findByF_workingUnitId(
		long workingUnitId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByF_workingUnitId(workingUnitId, start, end);
	}

	/**
	* Returns an ordered range of all the o e p user mgt employees where workingUnitId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param workingUnitId the working unit ID
	* @param start the lower bound of the range of o e p user mgt employees
	* @param end the upper bound of the range of o e p user mgt employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching o e p user mgt employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee> findByF_workingUnitId(
		long workingUnitId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByF_workingUnitId(workingUnitId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first o e p user mgt employee in the ordered set where workingUnitId = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching o e p user mgt employee
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException if a matching o e p user mgt employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee findByF_workingUnitId_First(
		long workingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException {
		return getPersistence()
				   .findByF_workingUnitId_First(workingUnitId, orderByComparator);
	}

	/**
	* Returns the first o e p user mgt employee in the ordered set where workingUnitId = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching o e p user mgt employee, or <code>null</code> if a matching o e p user mgt employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee fetchByF_workingUnitId_First(
		long workingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByF_workingUnitId_First(workingUnitId,
			orderByComparator);
	}

	/**
	* Returns the last o e p user mgt employee in the ordered set where workingUnitId = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching o e p user mgt employee
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException if a matching o e p user mgt employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee findByF_workingUnitId_Last(
		long workingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException {
		return getPersistence()
				   .findByF_workingUnitId_Last(workingUnitId, orderByComparator);
	}

	/**
	* Returns the last o e p user mgt employee in the ordered set where workingUnitId = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching o e p user mgt employee, or <code>null</code> if a matching o e p user mgt employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee fetchByF_workingUnitId_Last(
		long workingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByF_workingUnitId_Last(workingUnitId, orderByComparator);
	}

	/**
	* Returns the o e p user mgt employees before and after the current o e p user mgt employee in the ordered set where workingUnitId = &#63;.
	*
	* @param employeeId the primary key of the current o e p user mgt employee
	* @param workingUnitId the working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next o e p user mgt employee
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException if a o e p user mgt employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee[] findByF_workingUnitId_PrevAndNext(
		long employeeId, long workingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException {
		return getPersistence()
				   .findByF_workingUnitId_PrevAndNext(employeeId,
			workingUnitId, orderByComparator);
	}

	/**
	* Removes all the o e p user mgt employees where workingUnitId = &#63; from the database.
	*
	* @param workingUnitId the working unit ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByF_workingUnitId(long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByF_workingUnitId(workingUnitId);
	}

	/**
	* Returns the number of o e p user mgt employees where workingUnitId = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @return the number of matching o e p user mgt employees
	* @throws SystemException if a system exception occurred
	*/
	public static int countByF_workingUnitId(long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByF_workingUnitId(workingUnitId);
	}

	/**
	* Returns all the o e p user mgt employees where workingUnitId = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @return the matching o e p user mgt employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee> findByworkingUnitId(
		long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByworkingUnitId(workingUnitId);
	}

	/**
	* Returns a range of all the o e p user mgt employees where workingUnitId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param workingUnitId the working unit ID
	* @param start the lower bound of the range of o e p user mgt employees
	* @param end the upper bound of the range of o e p user mgt employees (not inclusive)
	* @return the range of matching o e p user mgt employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee> findByworkingUnitId(
		long workingUnitId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByworkingUnitId(workingUnitId, start, end);
	}

	/**
	* Returns an ordered range of all the o e p user mgt employees where workingUnitId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param workingUnitId the working unit ID
	* @param start the lower bound of the range of o e p user mgt employees
	* @param end the upper bound of the range of o e p user mgt employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching o e p user mgt employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee> findByworkingUnitId(
		long workingUnitId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByworkingUnitId(workingUnitId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first o e p user mgt employee in the ordered set where workingUnitId = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching o e p user mgt employee
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException if a matching o e p user mgt employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee findByworkingUnitId_First(
		long workingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException {
		return getPersistence()
				   .findByworkingUnitId_First(workingUnitId, orderByComparator);
	}

	/**
	* Returns the first o e p user mgt employee in the ordered set where workingUnitId = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching o e p user mgt employee, or <code>null</code> if a matching o e p user mgt employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee fetchByworkingUnitId_First(
		long workingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByworkingUnitId_First(workingUnitId, orderByComparator);
	}

	/**
	* Returns the last o e p user mgt employee in the ordered set where workingUnitId = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching o e p user mgt employee
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException if a matching o e p user mgt employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee findByworkingUnitId_Last(
		long workingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException {
		return getPersistence()
				   .findByworkingUnitId_Last(workingUnitId, orderByComparator);
	}

	/**
	* Returns the last o e p user mgt employee in the ordered set where workingUnitId = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching o e p user mgt employee, or <code>null</code> if a matching o e p user mgt employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee fetchByworkingUnitId_Last(
		long workingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByworkingUnitId_Last(workingUnitId, orderByComparator);
	}

	/**
	* Returns the o e p user mgt employees before and after the current o e p user mgt employee in the ordered set where workingUnitId = &#63;.
	*
	* @param employeeId the primary key of the current o e p user mgt employee
	* @param workingUnitId the working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next o e p user mgt employee
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException if a o e p user mgt employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee[] findByworkingUnitId_PrevAndNext(
		long employeeId, long workingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException {
		return getPersistence()
				   .findByworkingUnitId_PrevAndNext(employeeId, workingUnitId,
			orderByComparator);
	}

	/**
	* Removes all the o e p user mgt employees where workingUnitId = &#63; from the database.
	*
	* @param workingUnitId the working unit ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByworkingUnitId(long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByworkingUnitId(workingUnitId);
	}

	/**
	* Returns the number of o e p user mgt employees where workingUnitId = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @return the number of matching o e p user mgt employees
	* @throws SystemException if a system exception occurred
	*/
	public static int countByworkingUnitId(long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByworkingUnitId(workingUnitId);
	}

	/**
	* Returns all the o e p user mgt employees where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching o e p user mgt employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee> findByF_userId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByF_userId(userId);
	}

	/**
	* Returns a range of all the o e p user mgt employees where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of o e p user mgt employees
	* @param end the upper bound of the range of o e p user mgt employees (not inclusive)
	* @return the range of matching o e p user mgt employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee> findByF_userId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByF_userId(userId, start, end);
	}

	/**
	* Returns an ordered range of all the o e p user mgt employees where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of o e p user mgt employees
	* @param end the upper bound of the range of o e p user mgt employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching o e p user mgt employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee> findByF_userId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByF_userId(userId, start, end, orderByComparator);
	}

	/**
	* Returns the first o e p user mgt employee in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching o e p user mgt employee
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException if a matching o e p user mgt employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee findByF_userId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException {
		return getPersistence().findByF_userId_First(userId, orderByComparator);
	}

	/**
	* Returns the first o e p user mgt employee in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching o e p user mgt employee, or <code>null</code> if a matching o e p user mgt employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee fetchByF_userId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByF_userId_First(userId, orderByComparator);
	}

	/**
	* Returns the last o e p user mgt employee in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching o e p user mgt employee
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException if a matching o e p user mgt employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee findByF_userId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException {
		return getPersistence().findByF_userId_Last(userId, orderByComparator);
	}

	/**
	* Returns the last o e p user mgt employee in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching o e p user mgt employee, or <code>null</code> if a matching o e p user mgt employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee fetchByF_userId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByF_userId_Last(userId, orderByComparator);
	}

	/**
	* Returns the o e p user mgt employees before and after the current o e p user mgt employee in the ordered set where userId = &#63;.
	*
	* @param employeeId the primary key of the current o e p user mgt employee
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next o e p user mgt employee
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException if a o e p user mgt employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee[] findByF_userId_PrevAndNext(
		long employeeId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException {
		return getPersistence()
				   .findByF_userId_PrevAndNext(employeeId, userId,
			orderByComparator);
	}

	/**
	* Removes all the o e p user mgt employees where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByF_userId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByF_userId(userId);
	}

	/**
	* Returns the number of o e p user mgt employees where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching o e p user mgt employees
	* @throws SystemException if a system exception occurred
	*/
	public static int countByF_userId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByF_userId(userId);
	}

	/**
	* Returns all the o e p user mgt employees where workingUnitId = &#63; and typeOfEmployee = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param typeOfEmployee the type of employee
	* @return the matching o e p user mgt employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee> findByF_workingUnitId_typeOfEmployee(
		long workingUnitId, java.lang.String typeOfEmployee)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByF_workingUnitId_typeOfEmployee(workingUnitId,
			typeOfEmployee);
	}

	/**
	* Returns a range of all the o e p user mgt employees where workingUnitId = &#63; and typeOfEmployee = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param workingUnitId the working unit ID
	* @param typeOfEmployee the type of employee
	* @param start the lower bound of the range of o e p user mgt employees
	* @param end the upper bound of the range of o e p user mgt employees (not inclusive)
	* @return the range of matching o e p user mgt employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee> findByF_workingUnitId_typeOfEmployee(
		long workingUnitId, java.lang.String typeOfEmployee, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByF_workingUnitId_typeOfEmployee(workingUnitId,
			typeOfEmployee, start, end);
	}

	/**
	* Returns an ordered range of all the o e p user mgt employees where workingUnitId = &#63; and typeOfEmployee = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param workingUnitId the working unit ID
	* @param typeOfEmployee the type of employee
	* @param start the lower bound of the range of o e p user mgt employees
	* @param end the upper bound of the range of o e p user mgt employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching o e p user mgt employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee> findByF_workingUnitId_typeOfEmployee(
		long workingUnitId, java.lang.String typeOfEmployee, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByF_workingUnitId_typeOfEmployee(workingUnitId,
			typeOfEmployee, start, end, orderByComparator);
	}

	/**
	* Returns the first o e p user mgt employee in the ordered set where workingUnitId = &#63; and typeOfEmployee = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param typeOfEmployee the type of employee
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching o e p user mgt employee
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException if a matching o e p user mgt employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee findByF_workingUnitId_typeOfEmployee_First(
		long workingUnitId, java.lang.String typeOfEmployee,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException {
		return getPersistence()
				   .findByF_workingUnitId_typeOfEmployee_First(workingUnitId,
			typeOfEmployee, orderByComparator);
	}

	/**
	* Returns the first o e p user mgt employee in the ordered set where workingUnitId = &#63; and typeOfEmployee = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param typeOfEmployee the type of employee
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching o e p user mgt employee, or <code>null</code> if a matching o e p user mgt employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee fetchByF_workingUnitId_typeOfEmployee_First(
		long workingUnitId, java.lang.String typeOfEmployee,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByF_workingUnitId_typeOfEmployee_First(workingUnitId,
			typeOfEmployee, orderByComparator);
	}

	/**
	* Returns the last o e p user mgt employee in the ordered set where workingUnitId = &#63; and typeOfEmployee = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param typeOfEmployee the type of employee
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching o e p user mgt employee
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException if a matching o e p user mgt employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee findByF_workingUnitId_typeOfEmployee_Last(
		long workingUnitId, java.lang.String typeOfEmployee,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException {
		return getPersistence()
				   .findByF_workingUnitId_typeOfEmployee_Last(workingUnitId,
			typeOfEmployee, orderByComparator);
	}

	/**
	* Returns the last o e p user mgt employee in the ordered set where workingUnitId = &#63; and typeOfEmployee = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param typeOfEmployee the type of employee
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching o e p user mgt employee, or <code>null</code> if a matching o e p user mgt employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee fetchByF_workingUnitId_typeOfEmployee_Last(
		long workingUnitId, java.lang.String typeOfEmployee,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByF_workingUnitId_typeOfEmployee_Last(workingUnitId,
			typeOfEmployee, orderByComparator);
	}

	/**
	* Returns the o e p user mgt employees before and after the current o e p user mgt employee in the ordered set where workingUnitId = &#63; and typeOfEmployee = &#63;.
	*
	* @param employeeId the primary key of the current o e p user mgt employee
	* @param workingUnitId the working unit ID
	* @param typeOfEmployee the type of employee
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next o e p user mgt employee
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException if a o e p user mgt employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee[] findByF_workingUnitId_typeOfEmployee_PrevAndNext(
		long employeeId, long workingUnitId, java.lang.String typeOfEmployee,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException {
		return getPersistence()
				   .findByF_workingUnitId_typeOfEmployee_PrevAndNext(employeeId,
			workingUnitId, typeOfEmployee, orderByComparator);
	}

	/**
	* Removes all the o e p user mgt employees where workingUnitId = &#63; and typeOfEmployee = &#63; from the database.
	*
	* @param workingUnitId the working unit ID
	* @param typeOfEmployee the type of employee
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByF_workingUnitId_typeOfEmployee(
		long workingUnitId, java.lang.String typeOfEmployee)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByF_workingUnitId_typeOfEmployee(workingUnitId,
			typeOfEmployee);
	}

	/**
	* Returns the number of o e p user mgt employees where workingUnitId = &#63; and typeOfEmployee = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param typeOfEmployee the type of employee
	* @return the number of matching o e p user mgt employees
	* @throws SystemException if a system exception occurred
	*/
	public static int countByF_workingUnitId_typeOfEmployee(
		long workingUnitId, java.lang.String typeOfEmployee)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByF_workingUnitId_typeOfEmployee(workingUnitId,
			typeOfEmployee);
	}

	/**
	* Returns the o e p user mgt employee where mappingUserId = &#63; or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException} if it could not be found.
	*
	* @param mappingUserId the mapping user ID
	* @return the matching o e p user mgt employee
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException if a matching o e p user mgt employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee findByF_mappingUserId(
		long mappingUserId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException {
		return getPersistence().findByF_mappingUserId(mappingUserId);
	}

	/**
	* Returns the o e p user mgt employee where mappingUserId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param mappingUserId the mapping user ID
	* @return the matching o e p user mgt employee, or <code>null</code> if a matching o e p user mgt employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee fetchByF_mappingUserId(
		long mappingUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByF_mappingUserId(mappingUserId);
	}

	/**
	* Returns the o e p user mgt employee where mappingUserId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param mappingUserId the mapping user ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching o e p user mgt employee, or <code>null</code> if a matching o e p user mgt employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee fetchByF_mappingUserId(
		long mappingUserId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByF_mappingUserId(mappingUserId, retrieveFromCache);
	}

	/**
	* Removes the o e p user mgt employee where mappingUserId = &#63; from the database.
	*
	* @param mappingUserId the mapping user ID
	* @return the o e p user mgt employee that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee removeByF_mappingUserId(
		long mappingUserId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException {
		return getPersistence().removeByF_mappingUserId(mappingUserId);
	}

	/**
	* Returns the number of o e p user mgt employees where mappingUserId = &#63;.
	*
	* @param mappingUserId the mapping user ID
	* @return the number of matching o e p user mgt employees
	* @throws SystemException if a system exception occurred
	*/
	public static int countByF_mappingUserId(long mappingUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByF_mappingUserId(mappingUserId);
	}

	/**
	* Caches the o e p user mgt employee in the entity cache if it is enabled.
	*
	* @param oepUserMgtEmployee the o e p user mgt employee
	*/
	public static void cacheResult(
		vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee oepUserMgtEmployee) {
		getPersistence().cacheResult(oepUserMgtEmployee);
	}

	/**
	* Caches the o e p user mgt employees in the entity cache if it is enabled.
	*
	* @param oepUserMgtEmployees the o e p user mgt employees
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee> oepUserMgtEmployees) {
		getPersistence().cacheResult(oepUserMgtEmployees);
	}

	/**
	* Creates a new o e p user mgt employee with the primary key. Does not add the o e p user mgt employee to the database.
	*
	* @param employeeId the primary key for the new o e p user mgt employee
	* @return the new o e p user mgt employee
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee create(
		long employeeId) {
		return getPersistence().create(employeeId);
	}

	/**
	* Removes the o e p user mgt employee with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeId the primary key of the o e p user mgt employee
	* @return the o e p user mgt employee that was removed
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException if a o e p user mgt employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee remove(
		long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException {
		return getPersistence().remove(employeeId);
	}

	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee updateImpl(
		vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee oepUserMgtEmployee)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(oepUserMgtEmployee);
	}

	/**
	* Returns the o e p user mgt employee with the primary key or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException} if it could not be found.
	*
	* @param employeeId the primary key of the o e p user mgt employee
	* @return the o e p user mgt employee
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException if a o e p user mgt employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee findByPrimaryKey(
		long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException {
		return getPersistence().findByPrimaryKey(employeeId);
	}

	/**
	* Returns the o e p user mgt employee with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param employeeId the primary key of the o e p user mgt employee
	* @return the o e p user mgt employee, or <code>null</code> if a o e p user mgt employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee fetchByPrimaryKey(
		long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(employeeId);
	}

	/**
	* Returns all the o e p user mgt employees.
	*
	* @return the o e p user mgt employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the o e p user mgt employees.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of o e p user mgt employees
	* @param end the upper bound of the range of o e p user mgt employees (not inclusive)
	* @return the range of o e p user mgt employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the o e p user mgt employees.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of o e p user mgt employees
	* @param end the upper bound of the range of o e p user mgt employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of o e p user mgt employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the o e p user mgt employees from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of o e p user mgt employees.
	*
	* @return the number of o e p user mgt employees
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static OEPUserMgtEmployeePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (OEPUserMgtEmployeePersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.motcua.service.ClpSerializer.getServletContextName(),
					OEPUserMgtEmployeePersistence.class.getName());

			ReferenceRegistry.registerReference(OEPUserMgtEmployeeUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(OEPUserMgtEmployeePersistence persistence) {
	}

	private static OEPUserMgtEmployeePersistence _persistence;
}