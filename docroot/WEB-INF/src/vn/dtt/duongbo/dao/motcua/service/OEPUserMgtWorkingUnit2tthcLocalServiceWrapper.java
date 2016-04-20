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
 * Provides a wrapper for {@link OEPUserMgtWorkingUnit2tthcLocalService}.
 *
 * @author win_64
 * @see OEPUserMgtWorkingUnit2tthcLocalService
 * @generated
 */
public class OEPUserMgtWorkingUnit2tthcLocalServiceWrapper
	implements OEPUserMgtWorkingUnit2tthcLocalService,
		ServiceWrapper<OEPUserMgtWorkingUnit2tthcLocalService> {
	public OEPUserMgtWorkingUnit2tthcLocalServiceWrapper(
		OEPUserMgtWorkingUnit2tthcLocalService oepUserMgtWorkingUnit2tthcLocalService) {
		_oepUserMgtWorkingUnit2tthcLocalService = oepUserMgtWorkingUnit2tthcLocalService;
	}

	/**
	* Adds the o e p user mgt working unit2tthc to the database. Also notifies the appropriate model listeners.
	*
	* @param oepUserMgtWorkingUnit2tthc the o e p user mgt working unit2tthc
	* @return the o e p user mgt working unit2tthc that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc addOEPUserMgtWorkingUnit2tthc(
		vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtWorkingUnit2tthcLocalService.addOEPUserMgtWorkingUnit2tthc(oepUserMgtWorkingUnit2tthc);
	}

	/**
	* Creates a new o e p user mgt working unit2tthc with the primary key. Does not add the o e p user mgt working unit2tthc to the database.
	*
	* @param workingUnit2TTHCId the primary key for the new o e p user mgt working unit2tthc
	* @return the new o e p user mgt working unit2tthc
	*/
	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc createOEPUserMgtWorkingUnit2tthc(
		long workingUnit2TTHCId) {
		return _oepUserMgtWorkingUnit2tthcLocalService.createOEPUserMgtWorkingUnit2tthc(workingUnit2TTHCId);
	}

	/**
	* Deletes the o e p user mgt working unit2tthc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param workingUnit2TTHCId the primary key of the o e p user mgt working unit2tthc
	* @return the o e p user mgt working unit2tthc that was removed
	* @throws PortalException if a o e p user mgt working unit2tthc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc deleteOEPUserMgtWorkingUnit2tthc(
		long workingUnit2TTHCId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtWorkingUnit2tthcLocalService.deleteOEPUserMgtWorkingUnit2tthc(workingUnit2TTHCId);
	}

	/**
	* Deletes the o e p user mgt working unit2tthc from the database. Also notifies the appropriate model listeners.
	*
	* @param oepUserMgtWorkingUnit2tthc the o e p user mgt working unit2tthc
	* @return the o e p user mgt working unit2tthc that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc deleteOEPUserMgtWorkingUnit2tthc(
		vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtWorkingUnit2tthcLocalService.deleteOEPUserMgtWorkingUnit2tthc(oepUserMgtWorkingUnit2tthc);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _oepUserMgtWorkingUnit2tthcLocalService.dynamicQuery();
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
		return _oepUserMgtWorkingUnit2tthcLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtWorkingUnit2tthcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _oepUserMgtWorkingUnit2tthcLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtWorkingUnit2tthcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _oepUserMgtWorkingUnit2tthcLocalService.dynamicQuery(dynamicQuery,
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
		return _oepUserMgtWorkingUnit2tthcLocalService.dynamicQueryCount(dynamicQuery);
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
		return _oepUserMgtWorkingUnit2tthcLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc fetchOEPUserMgtWorkingUnit2tthc(
		long workingUnit2TTHCId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtWorkingUnit2tthcLocalService.fetchOEPUserMgtWorkingUnit2tthc(workingUnit2TTHCId);
	}

	/**
	* Returns the o e p user mgt working unit2tthc with the primary key.
	*
	* @param workingUnit2TTHCId the primary key of the o e p user mgt working unit2tthc
	* @return the o e p user mgt working unit2tthc
	* @throws PortalException if a o e p user mgt working unit2tthc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc getOEPUserMgtWorkingUnit2tthc(
		long workingUnit2TTHCId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtWorkingUnit2tthcLocalService.getOEPUserMgtWorkingUnit2tthc(workingUnit2TTHCId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtWorkingUnit2tthcLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc> getOEPUserMgtWorkingUnit2tthcs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtWorkingUnit2tthcLocalService.getOEPUserMgtWorkingUnit2tthcs(start,
			end);
	}

	/**
	* Returns the number of o e p user mgt working unit2tthcs.
	*
	* @return the number of o e p user mgt working unit2tthcs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getOEPUserMgtWorkingUnit2tthcsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtWorkingUnit2tthcLocalService.getOEPUserMgtWorkingUnit2tthcsCount();
	}

	/**
	* Updates the o e p user mgt working unit2tthc in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param oepUserMgtWorkingUnit2tthc the o e p user mgt working unit2tthc
	* @return the o e p user mgt working unit2tthc that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc updateOEPUserMgtWorkingUnit2tthc(
		vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtWorkingUnit2tthcLocalService.updateOEPUserMgtWorkingUnit2tthc(oepUserMgtWorkingUnit2tthc);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _oepUserMgtWorkingUnit2tthcLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_oepUserMgtWorkingUnit2tthcLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _oepUserMgtWorkingUnit2tthcLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc fetchByF_TTHCId_workingUnitId(
		long TTHCId, long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtWorkingUnit2tthcLocalService.fetchByF_TTHCId_workingUnitId(TTHCId,
			workingUnitId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public OEPUserMgtWorkingUnit2tthcLocalService getWrappedOEPUserMgtWorkingUnit2tthcLocalService() {
		return _oepUserMgtWorkingUnit2tthcLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedOEPUserMgtWorkingUnit2tthcLocalService(
		OEPUserMgtWorkingUnit2tthcLocalService oepUserMgtWorkingUnit2tthcLocalService) {
		_oepUserMgtWorkingUnit2tthcLocalService = oepUserMgtWorkingUnit2tthcLocalService;
	}

	@Override
	public OEPUserMgtWorkingUnit2tthcLocalService getWrappedService() {
		return _oepUserMgtWorkingUnit2tthcLocalService;
	}

	@Override
	public void setWrappedService(
		OEPUserMgtWorkingUnit2tthcLocalService oepUserMgtWorkingUnit2tthcLocalService) {
		_oepUserMgtWorkingUnit2tthcLocalService = oepUserMgtWorkingUnit2tthcLocalService;
	}

	private OEPUserMgtWorkingUnit2tthcLocalService _oepUserMgtWorkingUnit2tthcLocalService;
}