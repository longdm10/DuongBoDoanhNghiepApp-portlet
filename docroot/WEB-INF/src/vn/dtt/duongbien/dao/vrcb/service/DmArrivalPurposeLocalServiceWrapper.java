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
 * Provides a wrapper for {@link DmArrivalPurposeLocalService}.
 *
 * @author longdm
 * @see DmArrivalPurposeLocalService
 * @generated
 */
public class DmArrivalPurposeLocalServiceWrapper
	implements DmArrivalPurposeLocalService,
		ServiceWrapper<DmArrivalPurposeLocalService> {
	public DmArrivalPurposeLocalServiceWrapper(
		DmArrivalPurposeLocalService dmArrivalPurposeLocalService) {
		_dmArrivalPurposeLocalService = dmArrivalPurposeLocalService;
	}

	/**
	* Adds the dm arrival purpose to the database. Also notifies the appropriate model listeners.
	*
	* @param dmArrivalPurpose the dm arrival purpose
	* @return the dm arrival purpose that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmArrivalPurpose addDmArrivalPurpose(
		vn.dtt.duongbien.dao.vrcb.model.DmArrivalPurpose dmArrivalPurpose)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmArrivalPurposeLocalService.addDmArrivalPurpose(dmArrivalPurpose);
	}

	/**
	* Creates a new dm arrival purpose with the primary key. Does not add the dm arrival purpose to the database.
	*
	* @param id the primary key for the new dm arrival purpose
	* @return the new dm arrival purpose
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmArrivalPurpose createDmArrivalPurpose(
		int id) {
		return _dmArrivalPurposeLocalService.createDmArrivalPurpose(id);
	}

	/**
	* Deletes the dm arrival purpose with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm arrival purpose
	* @return the dm arrival purpose that was removed
	* @throws PortalException if a dm arrival purpose with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmArrivalPurpose deleteDmArrivalPurpose(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmArrivalPurposeLocalService.deleteDmArrivalPurpose(id);
	}

	/**
	* Deletes the dm arrival purpose from the database. Also notifies the appropriate model listeners.
	*
	* @param dmArrivalPurpose the dm arrival purpose
	* @return the dm arrival purpose that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmArrivalPurpose deleteDmArrivalPurpose(
		vn.dtt.duongbien.dao.vrcb.model.DmArrivalPurpose dmArrivalPurpose)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmArrivalPurposeLocalService.deleteDmArrivalPurpose(dmArrivalPurpose);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dmArrivalPurposeLocalService.dynamicQuery();
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
		return _dmArrivalPurposeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmArrivalPurposeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dmArrivalPurposeLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmArrivalPurposeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dmArrivalPurposeLocalService.dynamicQuery(dynamicQuery, start,
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
		return _dmArrivalPurposeLocalService.dynamicQueryCount(dynamicQuery);
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
		return _dmArrivalPurposeLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmArrivalPurpose fetchDmArrivalPurpose(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return _dmArrivalPurposeLocalService.fetchDmArrivalPurpose(id);
	}

	/**
	* Returns the dm arrival purpose with the primary key.
	*
	* @param id the primary key of the dm arrival purpose
	* @return the dm arrival purpose
	* @throws PortalException if a dm arrival purpose with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmArrivalPurpose getDmArrivalPurpose(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmArrivalPurposeLocalService.getDmArrivalPurpose(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmArrivalPurposeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm arrival purposes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmArrivalPurposeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm arrival purposes
	* @param end the upper bound of the range of dm arrival purposes (not inclusive)
	* @return the range of dm arrival purposes
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmArrivalPurpose> getDmArrivalPurposes(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmArrivalPurposeLocalService.getDmArrivalPurposes(start, end);
	}

	/**
	* Returns the number of dm arrival purposes.
	*
	* @return the number of dm arrival purposes
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDmArrivalPurposesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmArrivalPurposeLocalService.getDmArrivalPurposesCount();
	}

	/**
	* Updates the dm arrival purpose in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmArrivalPurpose the dm arrival purpose
	* @return the dm arrival purpose that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmArrivalPurpose updateDmArrivalPurpose(
		vn.dtt.duongbien.dao.vrcb.model.DmArrivalPurpose dmArrivalPurpose)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmArrivalPurposeLocalService.updateDmArrivalPurpose(dmArrivalPurpose);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dmArrivalPurposeLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dmArrivalPurposeLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dmArrivalPurposeLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DmArrivalPurposeLocalService getWrappedDmArrivalPurposeLocalService() {
		return _dmArrivalPurposeLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDmArrivalPurposeLocalService(
		DmArrivalPurposeLocalService dmArrivalPurposeLocalService) {
		_dmArrivalPurposeLocalService = dmArrivalPurposeLocalService;
	}

	@Override
	public DmArrivalPurposeLocalService getWrappedService() {
		return _dmArrivalPurposeLocalService;
	}

	@Override
	public void setWrappedService(
		DmArrivalPurposeLocalService dmArrivalPurposeLocalService) {
		_dmArrivalPurposeLocalService = dmArrivalPurposeLocalService;
	}

	private DmArrivalPurposeLocalService _dmArrivalPurposeLocalService;
}