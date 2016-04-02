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

package vn.dtt.duongbien.dao.vrcb.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link InterfaceRequestLocalService}.
 *
 * @author longdm
 * @see InterfaceRequestLocalService
 * @generated
 */
public class InterfaceRequestLocalServiceWrapper
	implements InterfaceRequestLocalService,
		ServiceWrapper<InterfaceRequestLocalService> {
	public InterfaceRequestLocalServiceWrapper(
		InterfaceRequestLocalService interfaceRequestLocalService) {
		_interfaceRequestLocalService = interfaceRequestLocalService;
	}

	/**
	* Adds the interface request to the database. Also notifies the appropriate model listeners.
	*
	* @param interfaceRequest the interface request
	* @return the interface request that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.InterfaceRequest addInterfaceRequest(
		vn.dtt.duongbien.dao.vrcb.model.InterfaceRequest interfaceRequest)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _interfaceRequestLocalService.addInterfaceRequest(interfaceRequest);
	}

	/**
	* Creates a new interface request with the primary key. Does not add the interface request to the database.
	*
	* @param id the primary key for the new interface request
	* @return the new interface request
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.InterfaceRequest createInterfaceRequest(
		long id) {
		return _interfaceRequestLocalService.createInterfaceRequest(id);
	}

	/**
	* Deletes the interface request with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the interface request
	* @return the interface request that was removed
	* @throws PortalException if a interface request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.InterfaceRequest deleteInterfaceRequest(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _interfaceRequestLocalService.deleteInterfaceRequest(id);
	}

	/**
	* Deletes the interface request from the database. Also notifies the appropriate model listeners.
	*
	* @param interfaceRequest the interface request
	* @return the interface request that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.InterfaceRequest deleteInterfaceRequest(
		vn.dtt.duongbien.dao.vrcb.model.InterfaceRequest interfaceRequest)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _interfaceRequestLocalService.deleteInterfaceRequest(interfaceRequest);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _interfaceRequestLocalService.dynamicQuery();
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
		return _interfaceRequestLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.InterfaceRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _interfaceRequestLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.InterfaceRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _interfaceRequestLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _interfaceRequestLocalService.dynamicQueryCount(dynamicQuery);
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
		return _interfaceRequestLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.InterfaceRequest fetchInterfaceRequest(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _interfaceRequestLocalService.fetchInterfaceRequest(id);
	}

	/**
	* Returns the interface request with the primary key.
	*
	* @param id the primary key of the interface request
	* @return the interface request
	* @throws PortalException if a interface request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.InterfaceRequest getInterfaceRequest(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _interfaceRequestLocalService.getInterfaceRequest(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _interfaceRequestLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the interface requests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.InterfaceRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of interface requests
	* @param end the upper bound of the range of interface requests (not inclusive)
	* @return the range of interface requests
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.InterfaceRequest> getInterfaceRequests(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _interfaceRequestLocalService.getInterfaceRequests(start, end);
	}

	/**
	* Returns the number of interface requests.
	*
	* @return the number of interface requests
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getInterfaceRequestsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _interfaceRequestLocalService.getInterfaceRequestsCount();
	}

	/**
	* Updates the interface request in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param interfaceRequest the interface request
	* @return the interface request that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.InterfaceRequest updateInterfaceRequest(
		vn.dtt.duongbien.dao.vrcb.model.InterfaceRequest interfaceRequest)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _interfaceRequestLocalService.updateInterfaceRequest(interfaceRequest);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _interfaceRequestLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_interfaceRequestLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _interfaceRequestLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public InterfaceRequestLocalService getWrappedInterfaceRequestLocalService() {
		return _interfaceRequestLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedInterfaceRequestLocalService(
		InterfaceRequestLocalService interfaceRequestLocalService) {
		_interfaceRequestLocalService = interfaceRequestLocalService;
	}

	@Override
	public InterfaceRequestLocalService getWrappedService() {
		return _interfaceRequestLocalService;
	}

	@Override
	public void setWrappedService(
		InterfaceRequestLocalService interfaceRequestLocalService) {
		_interfaceRequestLocalService = interfaceRequestLocalService;
	}

	private InterfaceRequestLocalService _interfaceRequestLocalService;
}