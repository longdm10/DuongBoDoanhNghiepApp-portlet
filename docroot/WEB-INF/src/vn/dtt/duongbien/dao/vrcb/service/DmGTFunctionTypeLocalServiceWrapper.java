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
 * Provides a wrapper for {@link DmGTFunctionTypeLocalService}.
 *
 * @author longdm
 * @see DmGTFunctionTypeLocalService
 * @generated
 */
public class DmGTFunctionTypeLocalServiceWrapper
	implements DmGTFunctionTypeLocalService,
		ServiceWrapper<DmGTFunctionTypeLocalService> {
	public DmGTFunctionTypeLocalServiceWrapper(
		DmGTFunctionTypeLocalService dmGTFunctionTypeLocalService) {
		_dmGTFunctionTypeLocalService = dmGTFunctionTypeLocalService;
	}

	/**
	* Adds the dm g t function type to the database. Also notifies the appropriate model listeners.
	*
	* @param dmGTFunctionType the dm g t function type
	* @return the dm g t function type that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGTFunctionType addDmGTFunctionType(
		vn.dtt.duongbien.dao.vrcb.model.DmGTFunctionType dmGTFunctionType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGTFunctionTypeLocalService.addDmGTFunctionType(dmGTFunctionType);
	}

	/**
	* Creates a new dm g t function type with the primary key. Does not add the dm g t function type to the database.
	*
	* @param id the primary key for the new dm g t function type
	* @return the new dm g t function type
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGTFunctionType createDmGTFunctionType(
		long id) {
		return _dmGTFunctionTypeLocalService.createDmGTFunctionType(id);
	}

	/**
	* Deletes the dm g t function type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm g t function type
	* @return the dm g t function type that was removed
	* @throws PortalException if a dm g t function type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGTFunctionType deleteDmGTFunctionType(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmGTFunctionTypeLocalService.deleteDmGTFunctionType(id);
	}

	/**
	* Deletes the dm g t function type from the database. Also notifies the appropriate model listeners.
	*
	* @param dmGTFunctionType the dm g t function type
	* @return the dm g t function type that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGTFunctionType deleteDmGTFunctionType(
		vn.dtt.duongbien.dao.vrcb.model.DmGTFunctionType dmGTFunctionType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGTFunctionTypeLocalService.deleteDmGTFunctionType(dmGTFunctionType);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dmGTFunctionTypeLocalService.dynamicQuery();
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
		return _dmGTFunctionTypeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGTFunctionTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dmGTFunctionTypeLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGTFunctionTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dmGTFunctionTypeLocalService.dynamicQuery(dynamicQuery, start,
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
		return _dmGTFunctionTypeLocalService.dynamicQueryCount(dynamicQuery);
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
		return _dmGTFunctionTypeLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGTFunctionType fetchDmGTFunctionType(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGTFunctionTypeLocalService.fetchDmGTFunctionType(id);
	}

	/**
	* Returns the dm g t function type with the primary key.
	*
	* @param id the primary key of the dm g t function type
	* @return the dm g t function type
	* @throws PortalException if a dm g t function type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGTFunctionType getDmGTFunctionType(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmGTFunctionTypeLocalService.getDmGTFunctionType(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmGTFunctionTypeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm g t function types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGTFunctionTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm g t function types
	* @param end the upper bound of the range of dm g t function types (not inclusive)
	* @return the range of dm g t function types
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGTFunctionType> getDmGTFunctionTypes(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGTFunctionTypeLocalService.getDmGTFunctionTypes(start, end);
	}

	/**
	* Returns the number of dm g t function types.
	*
	* @return the number of dm g t function types
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDmGTFunctionTypesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGTFunctionTypeLocalService.getDmGTFunctionTypesCount();
	}

	/**
	* Updates the dm g t function type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmGTFunctionType the dm g t function type
	* @return the dm g t function type that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGTFunctionType updateDmGTFunctionType(
		vn.dtt.duongbien.dao.vrcb.model.DmGTFunctionType dmGTFunctionType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGTFunctionTypeLocalService.updateDmGTFunctionType(dmGTFunctionType);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dmGTFunctionTypeLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dmGTFunctionTypeLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dmGTFunctionTypeLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DmGTFunctionTypeLocalService getWrappedDmGTFunctionTypeLocalService() {
		return _dmGTFunctionTypeLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDmGTFunctionTypeLocalService(
		DmGTFunctionTypeLocalService dmGTFunctionTypeLocalService) {
		_dmGTFunctionTypeLocalService = dmGTFunctionTypeLocalService;
	}

	@Override
	public DmGTFunctionTypeLocalService getWrappedService() {
		return _dmGTFunctionTypeLocalService;
	}

	@Override
	public void setWrappedService(
		DmGTFunctionTypeLocalService dmGTFunctionTypeLocalService) {
		_dmGTFunctionTypeLocalService = dmGTFunctionTypeLocalService;
	}

	private DmGTFunctionTypeLocalService _dmGTFunctionTypeLocalService;
}