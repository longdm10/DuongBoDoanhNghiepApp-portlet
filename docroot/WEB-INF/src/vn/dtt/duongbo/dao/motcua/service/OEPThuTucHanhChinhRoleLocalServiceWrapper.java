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
 * Provides a wrapper for {@link OEPThuTucHanhChinhRoleLocalService}.
 *
 * @author win_64
 * @see OEPThuTucHanhChinhRoleLocalService
 * @generated
 */
public class OEPThuTucHanhChinhRoleLocalServiceWrapper
	implements OEPThuTucHanhChinhRoleLocalService,
		ServiceWrapper<OEPThuTucHanhChinhRoleLocalService> {
	public OEPThuTucHanhChinhRoleLocalServiceWrapper(
		OEPThuTucHanhChinhRoleLocalService oepThuTucHanhChinhRoleLocalService) {
		_oepThuTucHanhChinhRoleLocalService = oepThuTucHanhChinhRoleLocalService;
	}

	/**
	* Adds the o e p thu tuc hanh chinh role to the database. Also notifies the appropriate model listeners.
	*
	* @param oepThuTucHanhChinhRole the o e p thu tuc hanh chinh role
	* @return the o e p thu tuc hanh chinh role that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPThuTucHanhChinhRole addOEPThuTucHanhChinhRole(
		vn.dtt.duongbo.dao.motcua.model.OEPThuTucHanhChinhRole oepThuTucHanhChinhRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oepThuTucHanhChinhRoleLocalService.addOEPThuTucHanhChinhRole(oepThuTucHanhChinhRole);
	}

	/**
	* Creates a new o e p thu tuc hanh chinh role with the primary key. Does not add the o e p thu tuc hanh chinh role to the database.
	*
	* @param id the primary key for the new o e p thu tuc hanh chinh role
	* @return the new o e p thu tuc hanh chinh role
	*/
	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPThuTucHanhChinhRole createOEPThuTucHanhChinhRole(
		int id) {
		return _oepThuTucHanhChinhRoleLocalService.createOEPThuTucHanhChinhRole(id);
	}

	/**
	* Deletes the o e p thu tuc hanh chinh role with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the o e p thu tuc hanh chinh role
	* @return the o e p thu tuc hanh chinh role that was removed
	* @throws PortalException if a o e p thu tuc hanh chinh role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPThuTucHanhChinhRole deleteOEPThuTucHanhChinhRole(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _oepThuTucHanhChinhRoleLocalService.deleteOEPThuTucHanhChinhRole(id);
	}

	/**
	* Deletes the o e p thu tuc hanh chinh role from the database. Also notifies the appropriate model listeners.
	*
	* @param oepThuTucHanhChinhRole the o e p thu tuc hanh chinh role
	* @return the o e p thu tuc hanh chinh role that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPThuTucHanhChinhRole deleteOEPThuTucHanhChinhRole(
		vn.dtt.duongbo.dao.motcua.model.OEPThuTucHanhChinhRole oepThuTucHanhChinhRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oepThuTucHanhChinhRoleLocalService.deleteOEPThuTucHanhChinhRole(oepThuTucHanhChinhRole);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _oepThuTucHanhChinhRoleLocalService.dynamicQuery();
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
		return _oepThuTucHanhChinhRoleLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPThuTucHanhChinhRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _oepThuTucHanhChinhRoleLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPThuTucHanhChinhRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _oepThuTucHanhChinhRoleLocalService.dynamicQuery(dynamicQuery,
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
		return _oepThuTucHanhChinhRoleLocalService.dynamicQueryCount(dynamicQuery);
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
		return _oepThuTucHanhChinhRoleLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPThuTucHanhChinhRole fetchOEPThuTucHanhChinhRole(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return _oepThuTucHanhChinhRoleLocalService.fetchOEPThuTucHanhChinhRole(id);
	}

	/**
	* Returns the o e p thu tuc hanh chinh role with the primary key.
	*
	* @param id the primary key of the o e p thu tuc hanh chinh role
	* @return the o e p thu tuc hanh chinh role
	* @throws PortalException if a o e p thu tuc hanh chinh role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPThuTucHanhChinhRole getOEPThuTucHanhChinhRole(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _oepThuTucHanhChinhRoleLocalService.getOEPThuTucHanhChinhRole(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _oepThuTucHanhChinhRoleLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the o e p thu tuc hanh chinh roles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPThuTucHanhChinhRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of o e p thu tuc hanh chinh roles
	* @param end the upper bound of the range of o e p thu tuc hanh chinh roles (not inclusive)
	* @return the range of o e p thu tuc hanh chinh roles
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPThuTucHanhChinhRole> getOEPThuTucHanhChinhRoles(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oepThuTucHanhChinhRoleLocalService.getOEPThuTucHanhChinhRoles(start,
			end);
	}

	/**
	* Returns the number of o e p thu tuc hanh chinh roles.
	*
	* @return the number of o e p thu tuc hanh chinh roles
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getOEPThuTucHanhChinhRolesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oepThuTucHanhChinhRoleLocalService.getOEPThuTucHanhChinhRolesCount();
	}

	/**
	* Updates the o e p thu tuc hanh chinh role in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param oepThuTucHanhChinhRole the o e p thu tuc hanh chinh role
	* @return the o e p thu tuc hanh chinh role that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPThuTucHanhChinhRole updateOEPThuTucHanhChinhRole(
		vn.dtt.duongbo.dao.motcua.model.OEPThuTucHanhChinhRole oepThuTucHanhChinhRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oepThuTucHanhChinhRoleLocalService.updateOEPThuTucHanhChinhRole(oepThuTucHanhChinhRole);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _oepThuTucHanhChinhRoleLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_oepThuTucHanhChinhRoleLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _oepThuTucHanhChinhRoleLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public OEPThuTucHanhChinhRoleLocalService getWrappedOEPThuTucHanhChinhRoleLocalService() {
		return _oepThuTucHanhChinhRoleLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedOEPThuTucHanhChinhRoleLocalService(
		OEPThuTucHanhChinhRoleLocalService oepThuTucHanhChinhRoleLocalService) {
		_oepThuTucHanhChinhRoleLocalService = oepThuTucHanhChinhRoleLocalService;
	}

	@Override
	public OEPThuTucHanhChinhRoleLocalService getWrappedService() {
		return _oepThuTucHanhChinhRoleLocalService;
	}

	@Override
	public void setWrappedService(
		OEPThuTucHanhChinhRoleLocalService oepThuTucHanhChinhRoleLocalService) {
		_oepThuTucHanhChinhRoleLocalService = oepThuTucHanhChinhRoleLocalService;
	}

	private OEPThuTucHanhChinhRoleLocalService _oepThuTucHanhChinhRoleLocalService;
}