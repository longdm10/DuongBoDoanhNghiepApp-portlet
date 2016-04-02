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
 * Provides a wrapper for {@link DmGTBusinessTypeLocalService}.
 *
 * @author longdm
 * @see DmGTBusinessTypeLocalService
 * @generated
 */
public class DmGTBusinessTypeLocalServiceWrapper
	implements DmGTBusinessTypeLocalService,
		ServiceWrapper<DmGTBusinessTypeLocalService> {
	public DmGTBusinessTypeLocalServiceWrapper(
		DmGTBusinessTypeLocalService dmGTBusinessTypeLocalService) {
		_dmGTBusinessTypeLocalService = dmGTBusinessTypeLocalService;
	}

	/**
	* Adds the dm g t business type to the database. Also notifies the appropriate model listeners.
	*
	* @param dmGTBusinessType the dm g t business type
	* @return the dm g t business type that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGTBusinessType addDmGTBusinessType(
		vn.dtt.duongbien.dao.vrcb.model.DmGTBusinessType dmGTBusinessType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGTBusinessTypeLocalService.addDmGTBusinessType(dmGTBusinessType);
	}

	/**
	* Creates a new dm g t business type with the primary key. Does not add the dm g t business type to the database.
	*
	* @param id the primary key for the new dm g t business type
	* @return the new dm g t business type
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGTBusinessType createDmGTBusinessType(
		long id) {
		return _dmGTBusinessTypeLocalService.createDmGTBusinessType(id);
	}

	/**
	* Deletes the dm g t business type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm g t business type
	* @return the dm g t business type that was removed
	* @throws PortalException if a dm g t business type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGTBusinessType deleteDmGTBusinessType(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmGTBusinessTypeLocalService.deleteDmGTBusinessType(id);
	}

	/**
	* Deletes the dm g t business type from the database. Also notifies the appropriate model listeners.
	*
	* @param dmGTBusinessType the dm g t business type
	* @return the dm g t business type that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGTBusinessType deleteDmGTBusinessType(
		vn.dtt.duongbien.dao.vrcb.model.DmGTBusinessType dmGTBusinessType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGTBusinessTypeLocalService.deleteDmGTBusinessType(dmGTBusinessType);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dmGTBusinessTypeLocalService.dynamicQuery();
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
		return _dmGTBusinessTypeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGTBusinessTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dmGTBusinessTypeLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGTBusinessTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dmGTBusinessTypeLocalService.dynamicQuery(dynamicQuery, start,
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
		return _dmGTBusinessTypeLocalService.dynamicQueryCount(dynamicQuery);
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
		return _dmGTBusinessTypeLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGTBusinessType fetchDmGTBusinessType(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGTBusinessTypeLocalService.fetchDmGTBusinessType(id);
	}

	/**
	* Returns the dm g t business type with the primary key.
	*
	* @param id the primary key of the dm g t business type
	* @return the dm g t business type
	* @throws PortalException if a dm g t business type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGTBusinessType getDmGTBusinessType(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmGTBusinessTypeLocalService.getDmGTBusinessType(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmGTBusinessTypeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm g t business types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGTBusinessTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm g t business types
	* @param end the upper bound of the range of dm g t business types (not inclusive)
	* @return the range of dm g t business types
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGTBusinessType> getDmGTBusinessTypes(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGTBusinessTypeLocalService.getDmGTBusinessTypes(start, end);
	}

	/**
	* Returns the number of dm g t business types.
	*
	* @return the number of dm g t business types
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDmGTBusinessTypesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGTBusinessTypeLocalService.getDmGTBusinessTypesCount();
	}

	/**
	* Updates the dm g t business type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmGTBusinessType the dm g t business type
	* @return the dm g t business type that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGTBusinessType updateDmGTBusinessType(
		vn.dtt.duongbien.dao.vrcb.model.DmGTBusinessType dmGTBusinessType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGTBusinessTypeLocalService.updateDmGTBusinessType(dmGTBusinessType);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dmGTBusinessTypeLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dmGTBusinessTypeLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dmGTBusinessTypeLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DmGTBusinessTypeLocalService getWrappedDmGTBusinessTypeLocalService() {
		return _dmGTBusinessTypeLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDmGTBusinessTypeLocalService(
		DmGTBusinessTypeLocalService dmGTBusinessTypeLocalService) {
		_dmGTBusinessTypeLocalService = dmGTBusinessTypeLocalService;
	}

	@Override
	public DmGTBusinessTypeLocalService getWrappedService() {
		return _dmGTBusinessTypeLocalService;
	}

	@Override
	public void setWrappedService(
		DmGTBusinessTypeLocalService dmGTBusinessTypeLocalService) {
		_dmGTBusinessTypeLocalService = dmGTBusinessTypeLocalService;
	}

	private DmGTBusinessTypeLocalService _dmGTBusinessTypeLocalService;
}