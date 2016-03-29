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
 * Provides a wrapper for {@link OEPUserMgtWorkingUnitLocalService}.
 *
 * @author win_64
 * @see OEPUserMgtWorkingUnitLocalService
 * @generated
 */
public class OEPUserMgtWorkingUnitLocalServiceWrapper
	implements OEPUserMgtWorkingUnitLocalService,
		ServiceWrapper<OEPUserMgtWorkingUnitLocalService> {
	public OEPUserMgtWorkingUnitLocalServiceWrapper(
		OEPUserMgtWorkingUnitLocalService oepUserMgtWorkingUnitLocalService) {
		_oepUserMgtWorkingUnitLocalService = oepUserMgtWorkingUnitLocalService;
	}

	/**
	* Adds the o e p user mgt working unit to the database. Also notifies the appropriate model listeners.
	*
	* @param oepUserMgtWorkingUnit the o e p user mgt working unit
	* @return the o e p user mgt working unit that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit addOEPUserMgtWorkingUnit(
		vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit oepUserMgtWorkingUnit)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtWorkingUnitLocalService.addOEPUserMgtWorkingUnit(oepUserMgtWorkingUnit);
	}

	/**
	* Creates a new o e p user mgt working unit with the primary key. Does not add the o e p user mgt working unit to the database.
	*
	* @param workingUnitId the primary key for the new o e p user mgt working unit
	* @return the new o e p user mgt working unit
	*/
	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit createOEPUserMgtWorkingUnit(
		long workingUnitId) {
		return _oepUserMgtWorkingUnitLocalService.createOEPUserMgtWorkingUnit(workingUnitId);
	}

	/**
	* Deletes the o e p user mgt working unit with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param workingUnitId the primary key of the o e p user mgt working unit
	* @return the o e p user mgt working unit that was removed
	* @throws PortalException if a o e p user mgt working unit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit deleteOEPUserMgtWorkingUnit(
		long workingUnitId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtWorkingUnitLocalService.deleteOEPUserMgtWorkingUnit(workingUnitId);
	}

	/**
	* Deletes the o e p user mgt working unit from the database. Also notifies the appropriate model listeners.
	*
	* @param oepUserMgtWorkingUnit the o e p user mgt working unit
	* @return the o e p user mgt working unit that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit deleteOEPUserMgtWorkingUnit(
		vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit oepUserMgtWorkingUnit)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtWorkingUnitLocalService.deleteOEPUserMgtWorkingUnit(oepUserMgtWorkingUnit);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _oepUserMgtWorkingUnitLocalService.dynamicQuery();
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
		return _oepUserMgtWorkingUnitLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtWorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _oepUserMgtWorkingUnitLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtWorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _oepUserMgtWorkingUnitLocalService.dynamicQuery(dynamicQuery,
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
		return _oepUserMgtWorkingUnitLocalService.dynamicQueryCount(dynamicQuery);
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
		return _oepUserMgtWorkingUnitLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit fetchOEPUserMgtWorkingUnit(
		long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtWorkingUnitLocalService.fetchOEPUserMgtWorkingUnit(workingUnitId);
	}

	/**
	* Returns the o e p user mgt working unit with the primary key.
	*
	* @param workingUnitId the primary key of the o e p user mgt working unit
	* @return the o e p user mgt working unit
	* @throws PortalException if a o e p user mgt working unit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit getOEPUserMgtWorkingUnit(
		long workingUnitId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtWorkingUnitLocalService.getOEPUserMgtWorkingUnit(workingUnitId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtWorkingUnitLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit> getOEPUserMgtWorkingUnits(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtWorkingUnitLocalService.getOEPUserMgtWorkingUnits(start,
			end);
	}

	/**
	* Returns the number of o e p user mgt working units.
	*
	* @return the number of o e p user mgt working units
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getOEPUserMgtWorkingUnitsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtWorkingUnitLocalService.getOEPUserMgtWorkingUnitsCount();
	}

	/**
	* Updates the o e p user mgt working unit in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param oepUserMgtWorkingUnit the o e p user mgt working unit
	* @return the o e p user mgt working unit that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit updateOEPUserMgtWorkingUnit(
		vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit oepUserMgtWorkingUnit)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtWorkingUnitLocalService.updateOEPUserMgtWorkingUnit(oepUserMgtWorkingUnit);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _oepUserMgtWorkingUnitLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_oepUserMgtWorkingUnitLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _oepUserMgtWorkingUnitLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit> getWorkingUnitByTTHCId(
		long tthcId) {
		return _oepUserMgtWorkingUnitLocalService.getWorkingUnitByTTHCId(tthcId);
	}

	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit getByGovAgentId(
		java.lang.String govAgentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnitException {
		return _oepUserMgtWorkingUnitLocalService.getByGovAgentId(govAgentId);
	}

	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit fetchByF_organizationId(
		java.lang.String organizationId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnitException {
		return _oepUserMgtWorkingUnitLocalService.fetchByF_organizationId(organizationId);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit> findByF_parentWorkingUnitId(
		long parentWorkingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtWorkingUnitLocalService.findByF_parentWorkingUnitId(parentWorkingUnitId);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit> findByF_parentWorkingUnitId(
		long parentWorkingUnitId, long TTHCId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtWorkingUnitLocalService.findByF_parentWorkingUnitId(parentWorkingUnitId,
			TTHCId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public OEPUserMgtWorkingUnitLocalService getWrappedOEPUserMgtWorkingUnitLocalService() {
		return _oepUserMgtWorkingUnitLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedOEPUserMgtWorkingUnitLocalService(
		OEPUserMgtWorkingUnitLocalService oepUserMgtWorkingUnitLocalService) {
		_oepUserMgtWorkingUnitLocalService = oepUserMgtWorkingUnitLocalService;
	}

	@Override
	public OEPUserMgtWorkingUnitLocalService getWrappedService() {
		return _oepUserMgtWorkingUnitLocalService;
	}

	@Override
	public void setWrappedService(
		OEPUserMgtWorkingUnitLocalService oepUserMgtWorkingUnitLocalService) {
		_oepUserMgtWorkingUnitLocalService = oepUserMgtWorkingUnitLocalService;
	}

	private OEPUserMgtWorkingUnitLocalService _oepUserMgtWorkingUnitLocalService;
}