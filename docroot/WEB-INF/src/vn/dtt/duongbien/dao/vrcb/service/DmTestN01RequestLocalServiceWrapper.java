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
 * Provides a wrapper for {@link DmTestN01RequestLocalService}.
 *
 * @author longdm
 * @see DmTestN01RequestLocalService
 * @generated
 */
public class DmTestN01RequestLocalServiceWrapper
	implements DmTestN01RequestLocalService,
		ServiceWrapper<DmTestN01RequestLocalService> {
	public DmTestN01RequestLocalServiceWrapper(
		DmTestN01RequestLocalService dmTestN01RequestLocalService) {
		_dmTestN01RequestLocalService = dmTestN01RequestLocalService;
	}

	/**
	* Adds the dm test n01 request to the database. Also notifies the appropriate model listeners.
	*
	* @param dmTestN01Request the dm test n01 request
	* @return the dm test n01 request that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmTestN01Request addDmTestN01Request(
		vn.dtt.duongbien.dao.vrcb.model.DmTestN01Request dmTestN01Request)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmTestN01RequestLocalService.addDmTestN01Request(dmTestN01Request);
	}

	/**
	* Creates a new dm test n01 request with the primary key. Does not add the dm test n01 request to the database.
	*
	* @param requestID the primary key for the new dm test n01 request
	* @return the new dm test n01 request
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmTestN01Request createDmTestN01Request(
		int requestID) {
		return _dmTestN01RequestLocalService.createDmTestN01Request(requestID);
	}

	/**
	* Deletes the dm test n01 request with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param requestID the primary key of the dm test n01 request
	* @return the dm test n01 request that was removed
	* @throws PortalException if a dm test n01 request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmTestN01Request deleteDmTestN01Request(
		int requestID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmTestN01RequestLocalService.deleteDmTestN01Request(requestID);
	}

	/**
	* Deletes the dm test n01 request from the database. Also notifies the appropriate model listeners.
	*
	* @param dmTestN01Request the dm test n01 request
	* @return the dm test n01 request that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmTestN01Request deleteDmTestN01Request(
		vn.dtt.duongbien.dao.vrcb.model.DmTestN01Request dmTestN01Request)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmTestN01RequestLocalService.deleteDmTestN01Request(dmTestN01Request);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dmTestN01RequestLocalService.dynamicQuery();
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
		return _dmTestN01RequestLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmTestN01RequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dmTestN01RequestLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmTestN01RequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dmTestN01RequestLocalService.dynamicQuery(dynamicQuery, start,
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
		return _dmTestN01RequestLocalService.dynamicQueryCount(dynamicQuery);
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
		return _dmTestN01RequestLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmTestN01Request fetchDmTestN01Request(
		int requestID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmTestN01RequestLocalService.fetchDmTestN01Request(requestID);
	}

	/**
	* Returns the dm test n01 request with the primary key.
	*
	* @param requestID the primary key of the dm test n01 request
	* @return the dm test n01 request
	* @throws PortalException if a dm test n01 request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmTestN01Request getDmTestN01Request(
		int requestID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmTestN01RequestLocalService.getDmTestN01Request(requestID);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmTestN01RequestLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm test n01 requests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmTestN01RequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm test n01 requests
	* @param end the upper bound of the range of dm test n01 requests (not inclusive)
	* @return the range of dm test n01 requests
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmTestN01Request> getDmTestN01Requests(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmTestN01RequestLocalService.getDmTestN01Requests(start, end);
	}

	/**
	* Returns the number of dm test n01 requests.
	*
	* @return the number of dm test n01 requests
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDmTestN01RequestsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmTestN01RequestLocalService.getDmTestN01RequestsCount();
	}

	/**
	* Updates the dm test n01 request in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmTestN01Request the dm test n01 request
	* @return the dm test n01 request that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmTestN01Request updateDmTestN01Request(
		vn.dtt.duongbien.dao.vrcb.model.DmTestN01Request dmTestN01Request)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmTestN01RequestLocalService.updateDmTestN01Request(dmTestN01Request);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dmTestN01RequestLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dmTestN01RequestLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dmTestN01RequestLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DmTestN01RequestLocalService getWrappedDmTestN01RequestLocalService() {
		return _dmTestN01RequestLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDmTestN01RequestLocalService(
		DmTestN01RequestLocalService dmTestN01RequestLocalService) {
		_dmTestN01RequestLocalService = dmTestN01RequestLocalService;
	}

	@Override
	public DmTestN01RequestLocalService getWrappedService() {
		return _dmTestN01RequestLocalService;
	}

	@Override
	public void setWrappedService(
		DmTestN01RequestLocalService dmTestN01RequestLocalService) {
		_dmTestN01RequestLocalService = dmTestN01RequestLocalService;
	}

	private DmTestN01RequestLocalService _dmTestN01RequestLocalService;
}