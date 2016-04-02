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
 * Provides a wrapper for {@link DmGtVersionLocalService}.
 *
 * @author longdm
 * @see DmGtVersionLocalService
 * @generated
 */
public class DmGtVersionLocalServiceWrapper implements DmGtVersionLocalService,
	ServiceWrapper<DmGtVersionLocalService> {
	public DmGtVersionLocalServiceWrapper(
		DmGtVersionLocalService dmGtVersionLocalService) {
		_dmGtVersionLocalService = dmGtVersionLocalService;
	}

	/**
	* Adds the dm gt version to the database. Also notifies the appropriate model listeners.
	*
	* @param dmGtVersion the dm gt version
	* @return the dm gt version that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGtVersion addDmGtVersion(
		vn.dtt.duongbien.dao.vrcb.model.DmGtVersion dmGtVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGtVersionLocalService.addDmGtVersion(dmGtVersion);
	}

	/**
	* Creates a new dm gt version with the primary key. Does not add the dm gt version to the database.
	*
	* @param id the primary key for the new dm gt version
	* @return the new dm gt version
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGtVersion createDmGtVersion(int id) {
		return _dmGtVersionLocalService.createDmGtVersion(id);
	}

	/**
	* Deletes the dm gt version with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm gt version
	* @return the dm gt version that was removed
	* @throws PortalException if a dm gt version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGtVersion deleteDmGtVersion(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmGtVersionLocalService.deleteDmGtVersion(id);
	}

	/**
	* Deletes the dm gt version from the database. Also notifies the appropriate model listeners.
	*
	* @param dmGtVersion the dm gt version
	* @return the dm gt version that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGtVersion deleteDmGtVersion(
		vn.dtt.duongbien.dao.vrcb.model.DmGtVersion dmGtVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGtVersionLocalService.deleteDmGtVersion(dmGtVersion);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dmGtVersionLocalService.dynamicQuery();
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
		return _dmGtVersionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGtVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dmGtVersionLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGtVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dmGtVersionLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
		return _dmGtVersionLocalService.dynamicQueryCount(dynamicQuery);
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
		return _dmGtVersionLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGtVersion fetchDmGtVersion(int id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGtVersionLocalService.fetchDmGtVersion(id);
	}

	/**
	* Returns the dm gt version with the primary key.
	*
	* @param id the primary key of the dm gt version
	* @return the dm gt version
	* @throws PortalException if a dm gt version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGtVersion getDmGtVersion(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmGtVersionLocalService.getDmGtVersion(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmGtVersionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm gt versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGtVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm gt versions
	* @param end the upper bound of the range of dm gt versions (not inclusive)
	* @return the range of dm gt versions
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGtVersion> getDmGtVersions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGtVersionLocalService.getDmGtVersions(start, end);
	}

	/**
	* Returns the number of dm gt versions.
	*
	* @return the number of dm gt versions
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDmGtVersionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGtVersionLocalService.getDmGtVersionsCount();
	}

	/**
	* Updates the dm gt version in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmGtVersion the dm gt version
	* @return the dm gt version that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGtVersion updateDmGtVersion(
		vn.dtt.duongbien.dao.vrcb.model.DmGtVersion dmGtVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGtVersionLocalService.updateDmGtVersion(dmGtVersion);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dmGtVersionLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dmGtVersionLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dmGtVersionLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DmGtVersionLocalService getWrappedDmGtVersionLocalService() {
		return _dmGtVersionLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDmGtVersionLocalService(
		DmGtVersionLocalService dmGtVersionLocalService) {
		_dmGtVersionLocalService = dmGtVersionLocalService;
	}

	@Override
	public DmGtVersionLocalService getWrappedService() {
		return _dmGtVersionLocalService;
	}

	@Override
	public void setWrappedService(
		DmGtVersionLocalService dmGtVersionLocalService) {
		_dmGtVersionLocalService = dmGtVersionLocalService;
	}

	private DmGtVersionLocalService _dmGtVersionLocalService;
}