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

package vn.dtt.duongbo.dao.motcua.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OEPUserMgtEmployeeLocalService}.
 *
 * @author win_64
 * @see OEPUserMgtEmployeeLocalService
 * @generated
 */
public class OEPUserMgtEmployeeLocalServiceWrapper
	implements OEPUserMgtEmployeeLocalService,
		ServiceWrapper<OEPUserMgtEmployeeLocalService> {
	public OEPUserMgtEmployeeLocalServiceWrapper(
		OEPUserMgtEmployeeLocalService oepUserMgtEmployeeLocalService) {
		_oepUserMgtEmployeeLocalService = oepUserMgtEmployeeLocalService;
	}

	/**
	* Adds the o e p user mgt employee to the database. Also notifies the appropriate model listeners.
	*
	* @param oepUserMgtEmployee the o e p user mgt employee
	* @return the o e p user mgt employee that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee addOEPUserMgtEmployee(
		vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee oepUserMgtEmployee)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtEmployeeLocalService.addOEPUserMgtEmployee(oepUserMgtEmployee);
	}

	/**
	* Creates a new o e p user mgt employee with the primary key. Does not add the o e p user mgt employee to the database.
	*
	* @param employeeId the primary key for the new o e p user mgt employee
	* @return the new o e p user mgt employee
	*/
	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee createOEPUserMgtEmployee(
		long employeeId) {
		return _oepUserMgtEmployeeLocalService.createOEPUserMgtEmployee(employeeId);
	}

	/**
	* Deletes the o e p user mgt employee with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeId the primary key of the o e p user mgt employee
	* @return the o e p user mgt employee that was removed
	* @throws PortalException if a o e p user mgt employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee deleteOEPUserMgtEmployee(
		long employeeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtEmployeeLocalService.deleteOEPUserMgtEmployee(employeeId);
	}

	/**
	* Deletes the o e p user mgt employee from the database. Also notifies the appropriate model listeners.
	*
	* @param oepUserMgtEmployee the o e p user mgt employee
	* @return the o e p user mgt employee that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee deleteOEPUserMgtEmployee(
		vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee oepUserMgtEmployee)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtEmployeeLocalService.deleteOEPUserMgtEmployee(oepUserMgtEmployee);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _oepUserMgtEmployeeLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtEmployeeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtEmployeeLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtEmployeeLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtEmployeeLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtEmployeeLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee fetchOEPUserMgtEmployee(
		long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtEmployeeLocalService.fetchOEPUserMgtEmployee(employeeId);
	}

	/**
	* Returns the o e p user mgt employee with the primary key.
	*
	* @param employeeId the primary key of the o e p user mgt employee
	* @return the o e p user mgt employee
	* @throws PortalException if a o e p user mgt employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee getOEPUserMgtEmployee(
		long employeeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtEmployeeLocalService.getOEPUserMgtEmployee(employeeId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtEmployeeLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee> getOEPUserMgtEmployees(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtEmployeeLocalService.getOEPUserMgtEmployees(start, end);
	}

	/**
	* Returns the number of o e p user mgt employees.
	*
	* @return the number of o e p user mgt employees
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getOEPUserMgtEmployeesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtEmployeeLocalService.getOEPUserMgtEmployeesCount();
	}

	/**
	* Updates the o e p user mgt employee in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param oepUserMgtEmployee the o e p user mgt employee
	* @return the o e p user mgt employee that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee updateOEPUserMgtEmployee(
		vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee oepUserMgtEmployee)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtEmployeeLocalService.updateOEPUserMgtEmployee(oepUserMgtEmployee);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _oepUserMgtEmployeeLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_oepUserMgtEmployeeLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _oepUserMgtEmployeeLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee> getEmployeeByWorkingUnitId(
		long workingUnitId) {
		return _oepUserMgtEmployeeLocalService.getEmployeeByWorkingUnitId(workingUnitId);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee> findByworkingUnitId(
		long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtEmployeeLocalService.findByworkingUnitId(workingUnitId);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee> getEmployeeByWorkingUserId(
		long userId) {
		return _oepUserMgtEmployeeLocalService.getEmployeeByWorkingUserId(userId);
	}

	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee fetchByF_mappingUserId(
		long mappingUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtEmployeeLocalService.fetchByF_mappingUserId(mappingUserId);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee> findByF_workingUnitId_typeOfEmployee(
		long mappingUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtEmployeeLocalService.findByF_workingUnitId_typeOfEmployee(mappingUserId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public OEPUserMgtEmployeeLocalService getWrappedOEPUserMgtEmployeeLocalService() {
		return _oepUserMgtEmployeeLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedOEPUserMgtEmployeeLocalService(
		OEPUserMgtEmployeeLocalService oepUserMgtEmployeeLocalService) {
		_oepUserMgtEmployeeLocalService = oepUserMgtEmployeeLocalService;
	}

	@Override
	public OEPUserMgtEmployeeLocalService getWrappedService() {
		return _oepUserMgtEmployeeLocalService;
	}

	@Override
	public void setWrappedService(
		OEPUserMgtEmployeeLocalService oepUserMgtEmployeeLocalService) {
		_oepUserMgtEmployeeLocalService = oepUserMgtEmployeeLocalService;
	}

	private OEPUserMgtEmployeeLocalService _oepUserMgtEmployeeLocalService;
}