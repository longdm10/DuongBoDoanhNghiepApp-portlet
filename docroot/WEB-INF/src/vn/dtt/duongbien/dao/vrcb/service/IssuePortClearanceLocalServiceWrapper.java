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
 * Provides a wrapper for {@link IssuePortClearanceLocalService}.
 *
 * @author longdm
 * @see IssuePortClearanceLocalService
 * @generated
 */
public class IssuePortClearanceLocalServiceWrapper
	implements IssuePortClearanceLocalService,
		ServiceWrapper<IssuePortClearanceLocalService> {
	public IssuePortClearanceLocalServiceWrapper(
		IssuePortClearanceLocalService issuePortClearanceLocalService) {
		_issuePortClearanceLocalService = issuePortClearanceLocalService;
	}

	/**
	* Adds the issue port clearance to the database. Also notifies the appropriate model listeners.
	*
	* @param issuePortClearance the issue port clearance
	* @return the issue port clearance that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance addIssuePortClearance(
		vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance issuePortClearance)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _issuePortClearanceLocalService.addIssuePortClearance(issuePortClearance);
	}

	/**
	* Creates a new issue port clearance with the primary key. Does not add the issue port clearance to the database.
	*
	* @param id the primary key for the new issue port clearance
	* @return the new issue port clearance
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance createIssuePortClearance(
		long id) {
		return _issuePortClearanceLocalService.createIssuePortClearance(id);
	}

	/**
	* Deletes the issue port clearance with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the issue port clearance
	* @return the issue port clearance that was removed
	* @throws PortalException if a issue port clearance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance deleteIssuePortClearance(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _issuePortClearanceLocalService.deleteIssuePortClearance(id);
	}

	/**
	* Deletes the issue port clearance from the database. Also notifies the appropriate model listeners.
	*
	* @param issuePortClearance the issue port clearance
	* @return the issue port clearance that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance deleteIssuePortClearance(
		vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance issuePortClearance)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _issuePortClearanceLocalService.deleteIssuePortClearance(issuePortClearance);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _issuePortClearanceLocalService.dynamicQuery();
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
		return _issuePortClearanceLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssuePortClearanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _issuePortClearanceLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssuePortClearanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _issuePortClearanceLocalService.dynamicQuery(dynamicQuery,
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
		return _issuePortClearanceLocalService.dynamicQueryCount(dynamicQuery);
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
		return _issuePortClearanceLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance fetchIssuePortClearance(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _issuePortClearanceLocalService.fetchIssuePortClearance(id);
	}

	/**
	* Returns the issue port clearance with the primary key.
	*
	* @param id the primary key of the issue port clearance
	* @return the issue port clearance
	* @throws PortalException if a issue port clearance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance getIssuePortClearance(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _issuePortClearanceLocalService.getIssuePortClearance(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _issuePortClearanceLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the issue port clearances.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssuePortClearanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of issue port clearances
	* @param end the upper bound of the range of issue port clearances (not inclusive)
	* @return the range of issue port clearances
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance> getIssuePortClearances(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _issuePortClearanceLocalService.getIssuePortClearances(start, end);
	}

	/**
	* Returns the number of issue port clearances.
	*
	* @return the number of issue port clearances
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getIssuePortClearancesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _issuePortClearanceLocalService.getIssuePortClearancesCount();
	}

	/**
	* Updates the issue port clearance in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param issuePortClearance the issue port clearance
	* @return the issue port clearance that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance updateIssuePortClearance(
		vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance issuePortClearance)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _issuePortClearanceLocalService.updateIssuePortClearance(issuePortClearance);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _issuePortClearanceLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_issuePortClearanceLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _issuePortClearanceLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public IssuePortClearanceLocalService getWrappedIssuePortClearanceLocalService() {
		return _issuePortClearanceLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedIssuePortClearanceLocalService(
		IssuePortClearanceLocalService issuePortClearanceLocalService) {
		_issuePortClearanceLocalService = issuePortClearanceLocalService;
	}

	@Override
	public IssuePortClearanceLocalService getWrappedService() {
		return _issuePortClearanceLocalService;
	}

	@Override
	public void setWrappedService(
		IssuePortClearanceLocalService issuePortClearanceLocalService) {
		_issuePortClearanceLocalService = issuePortClearanceLocalService;
	}

	private IssuePortClearanceLocalService _issuePortClearanceLocalService;
}