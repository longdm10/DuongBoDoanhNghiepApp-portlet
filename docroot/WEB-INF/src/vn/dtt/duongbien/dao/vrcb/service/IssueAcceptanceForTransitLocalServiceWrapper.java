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
 * Provides a wrapper for {@link IssueAcceptanceForTransitLocalService}.
 *
 * @author longdm
 * @see IssueAcceptanceForTransitLocalService
 * @generated
 */
public class IssueAcceptanceForTransitLocalServiceWrapper
	implements IssueAcceptanceForTransitLocalService,
		ServiceWrapper<IssueAcceptanceForTransitLocalService> {
	public IssueAcceptanceForTransitLocalServiceWrapper(
		IssueAcceptanceForTransitLocalService issueAcceptanceForTransitLocalService) {
		_issueAcceptanceForTransitLocalService = issueAcceptanceForTransitLocalService;
	}

	/**
	* Adds the issue acceptance for transit to the database. Also notifies the appropriate model listeners.
	*
	* @param issueAcceptanceForTransit the issue acceptance for transit
	* @return the issue acceptance for transit that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransit addIssueAcceptanceForTransit(
		vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransit issueAcceptanceForTransit)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _issueAcceptanceForTransitLocalService.addIssueAcceptanceForTransit(issueAcceptanceForTransit);
	}

	/**
	* Creates a new issue acceptance for transit with the primary key. Does not add the issue acceptance for transit to the database.
	*
	* @param id the primary key for the new issue acceptance for transit
	* @return the new issue acceptance for transit
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransit createIssueAcceptanceForTransit(
		long id) {
		return _issueAcceptanceForTransitLocalService.createIssueAcceptanceForTransit(id);
	}

	/**
	* Deletes the issue acceptance for transit with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the issue acceptance for transit
	* @return the issue acceptance for transit that was removed
	* @throws PortalException if a issue acceptance for transit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransit deleteIssueAcceptanceForTransit(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _issueAcceptanceForTransitLocalService.deleteIssueAcceptanceForTransit(id);
	}

	/**
	* Deletes the issue acceptance for transit from the database. Also notifies the appropriate model listeners.
	*
	* @param issueAcceptanceForTransit the issue acceptance for transit
	* @return the issue acceptance for transit that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransit deleteIssueAcceptanceForTransit(
		vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransit issueAcceptanceForTransit)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _issueAcceptanceForTransitLocalService.deleteIssueAcceptanceForTransit(issueAcceptanceForTransit);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _issueAcceptanceForTransitLocalService.dynamicQuery();
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
		return _issueAcceptanceForTransitLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssueAcceptanceForTransitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _issueAcceptanceForTransitLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssueAcceptanceForTransitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _issueAcceptanceForTransitLocalService.dynamicQuery(dynamicQuery,
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
		return _issueAcceptanceForTransitLocalService.dynamicQueryCount(dynamicQuery);
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
		return _issueAcceptanceForTransitLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransit fetchIssueAcceptanceForTransit(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _issueAcceptanceForTransitLocalService.fetchIssueAcceptanceForTransit(id);
	}

	/**
	* Returns the issue acceptance for transit with the primary key.
	*
	* @param id the primary key of the issue acceptance for transit
	* @return the issue acceptance for transit
	* @throws PortalException if a issue acceptance for transit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransit getIssueAcceptanceForTransit(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _issueAcceptanceForTransitLocalService.getIssueAcceptanceForTransit(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _issueAcceptanceForTransitLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the issue acceptance for transits.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssueAcceptanceForTransitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of issue acceptance for transits
	* @param end the upper bound of the range of issue acceptance for transits (not inclusive)
	* @return the range of issue acceptance for transits
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransit> getIssueAcceptanceForTransits(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _issueAcceptanceForTransitLocalService.getIssueAcceptanceForTransits(start,
			end);
	}

	/**
	* Returns the number of issue acceptance for transits.
	*
	* @return the number of issue acceptance for transits
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getIssueAcceptanceForTransitsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _issueAcceptanceForTransitLocalService.getIssueAcceptanceForTransitsCount();
	}

	/**
	* Updates the issue acceptance for transit in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param issueAcceptanceForTransit the issue acceptance for transit
	* @return the issue acceptance for transit that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransit updateIssueAcceptanceForTransit(
		vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransit issueAcceptanceForTransit)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _issueAcceptanceForTransitLocalService.updateIssueAcceptanceForTransit(issueAcceptanceForTransit);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _issueAcceptanceForTransitLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_issueAcceptanceForTransitLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _issueAcceptanceForTransitLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public IssueAcceptanceForTransitLocalService getWrappedIssueAcceptanceForTransitLocalService() {
		return _issueAcceptanceForTransitLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedIssueAcceptanceForTransitLocalService(
		IssueAcceptanceForTransitLocalService issueAcceptanceForTransitLocalService) {
		_issueAcceptanceForTransitLocalService = issueAcceptanceForTransitLocalService;
	}

	@Override
	public IssueAcceptanceForTransitLocalService getWrappedService() {
		return _issueAcceptanceForTransitLocalService;
	}

	@Override
	public void setWrappedService(
		IssueAcceptanceForTransitLocalService issueAcceptanceForTransitLocalService) {
		_issueAcceptanceForTransitLocalService = issueAcceptanceForTransitLocalService;
	}

	private IssueAcceptanceForTransitLocalService _issueAcceptanceForTransitLocalService;
}