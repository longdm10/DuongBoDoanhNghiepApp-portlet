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
 * Provides a wrapper for {@link InterfaceRequestFieldLocalService}.
 *
 * @author longdm
 * @see InterfaceRequestFieldLocalService
 * @generated
 */
public class InterfaceRequestFieldLocalServiceWrapper
	implements InterfaceRequestFieldLocalService,
		ServiceWrapper<InterfaceRequestFieldLocalService> {
	public InterfaceRequestFieldLocalServiceWrapper(
		InterfaceRequestFieldLocalService interfaceRequestFieldLocalService) {
		_interfaceRequestFieldLocalService = interfaceRequestFieldLocalService;
	}

	/**
	* Adds the interface request field to the database. Also notifies the appropriate model listeners.
	*
	* @param interfaceRequestField the interface request field
	* @return the interface request field that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField addInterfaceRequestField(
		vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField interfaceRequestField)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _interfaceRequestFieldLocalService.addInterfaceRequestField(interfaceRequestField);
	}

	/**
	* Creates a new interface request field with the primary key. Does not add the interface request field to the database.
	*
	* @param id the primary key for the new interface request field
	* @return the new interface request field
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField createInterfaceRequestField(
		long id) {
		return _interfaceRequestFieldLocalService.createInterfaceRequestField(id);
	}

	/**
	* Deletes the interface request field with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the interface request field
	* @return the interface request field that was removed
	* @throws PortalException if a interface request field with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField deleteInterfaceRequestField(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _interfaceRequestFieldLocalService.deleteInterfaceRequestField(id);
	}

	/**
	* Deletes the interface request field from the database. Also notifies the appropriate model listeners.
	*
	* @param interfaceRequestField the interface request field
	* @return the interface request field that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField deleteInterfaceRequestField(
		vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField interfaceRequestField)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _interfaceRequestFieldLocalService.deleteInterfaceRequestField(interfaceRequestField);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _interfaceRequestFieldLocalService.dynamicQuery();
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
		return _interfaceRequestFieldLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.InterfaceRequestFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _interfaceRequestFieldLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.InterfaceRequestFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _interfaceRequestFieldLocalService.dynamicQuery(dynamicQuery,
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
		return _interfaceRequestFieldLocalService.dynamicQueryCount(dynamicQuery);
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
		return _interfaceRequestFieldLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField fetchInterfaceRequestField(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _interfaceRequestFieldLocalService.fetchInterfaceRequestField(id);
	}

	/**
	* Returns the interface request field with the primary key.
	*
	* @param id the primary key of the interface request field
	* @return the interface request field
	* @throws PortalException if a interface request field with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField getInterfaceRequestField(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _interfaceRequestFieldLocalService.getInterfaceRequestField(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _interfaceRequestFieldLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the interface request fields.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.InterfaceRequestFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of interface request fields
	* @param end the upper bound of the range of interface request fields (not inclusive)
	* @return the range of interface request fields
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField> getInterfaceRequestFields(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _interfaceRequestFieldLocalService.getInterfaceRequestFields(start,
			end);
	}

	/**
	* Returns the number of interface request fields.
	*
	* @return the number of interface request fields
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getInterfaceRequestFieldsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _interfaceRequestFieldLocalService.getInterfaceRequestFieldsCount();
	}

	/**
	* Updates the interface request field in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param interfaceRequestField the interface request field
	* @return the interface request field that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField updateInterfaceRequestField(
		vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField interfaceRequestField)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _interfaceRequestFieldLocalService.updateInterfaceRequestField(interfaceRequestField);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _interfaceRequestFieldLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_interfaceRequestFieldLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _interfaceRequestFieldLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public InterfaceRequestFieldLocalService getWrappedInterfaceRequestFieldLocalService() {
		return _interfaceRequestFieldLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedInterfaceRequestFieldLocalService(
		InterfaceRequestFieldLocalService interfaceRequestFieldLocalService) {
		_interfaceRequestFieldLocalService = interfaceRequestFieldLocalService;
	}

	@Override
	public InterfaceRequestFieldLocalService getWrappedService() {
		return _interfaceRequestFieldLocalService;
	}

	@Override
	public void setWrappedService(
		InterfaceRequestFieldLocalService interfaceRequestFieldLocalService) {
		_interfaceRequestFieldLocalService = interfaceRequestFieldLocalService;
	}

	private InterfaceRequestFieldLocalService _interfaceRequestFieldLocalService;
}