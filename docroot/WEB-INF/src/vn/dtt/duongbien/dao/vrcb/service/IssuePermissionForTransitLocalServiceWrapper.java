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
 * Provides a wrapper for {@link IssuePermissionForTransitLocalService}.
 *
 * @author longdm
 * @see IssuePermissionForTransitLocalService
 * @generated
 */
public class IssuePermissionForTransitLocalServiceWrapper
	implements IssuePermissionForTransitLocalService,
		ServiceWrapper<IssuePermissionForTransitLocalService> {
	public IssuePermissionForTransitLocalServiceWrapper(
		IssuePermissionForTransitLocalService issuePermissionForTransitLocalService) {
		_issuePermissionForTransitLocalService = issuePermissionForTransitLocalService;
	}

	/**
	* Adds the issue permission for transit to the database. Also notifies the appropriate model listeners.
	*
	* @param issuePermissionForTransit the issue permission for transit
	* @return the issue permission for transit that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit addIssuePermissionForTransit(
		vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit issuePermissionForTransit)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _issuePermissionForTransitLocalService.addIssuePermissionForTransit(issuePermissionForTransit);
	}

	/**
	* Creates a new issue permission for transit with the primary key. Does not add the issue permission for transit to the database.
	*
	* @param id the primary key for the new issue permission for transit
	* @return the new issue permission for transit
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit createIssuePermissionForTransit(
		long id) {
		return _issuePermissionForTransitLocalService.createIssuePermissionForTransit(id);
	}

	/**
	* Deletes the issue permission for transit with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the issue permission for transit
	* @return the issue permission for transit that was removed
	* @throws PortalException if a issue permission for transit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit deleteIssuePermissionForTransit(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _issuePermissionForTransitLocalService.deleteIssuePermissionForTransit(id);
	}

	/**
	* Deletes the issue permission for transit from the database. Also notifies the appropriate model listeners.
	*
	* @param issuePermissionForTransit the issue permission for transit
	* @return the issue permission for transit that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit deleteIssuePermissionForTransit(
		vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit issuePermissionForTransit)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _issuePermissionForTransitLocalService.deleteIssuePermissionForTransit(issuePermissionForTransit);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _issuePermissionForTransitLocalService.dynamicQuery();
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
		return _issuePermissionForTransitLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssuePermissionForTransitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _issuePermissionForTransitLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssuePermissionForTransitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _issuePermissionForTransitLocalService.dynamicQuery(dynamicQuery,
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
		return _issuePermissionForTransitLocalService.dynamicQueryCount(dynamicQuery);
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
		return _issuePermissionForTransitLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit fetchIssuePermissionForTransit(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _issuePermissionForTransitLocalService.fetchIssuePermissionForTransit(id);
	}

	/**
	* Returns the issue permission for transit with the primary key.
	*
	* @param id the primary key of the issue permission for transit
	* @return the issue permission for transit
	* @throws PortalException if a issue permission for transit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit getIssuePermissionForTransit(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _issuePermissionForTransitLocalService.getIssuePermissionForTransit(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _issuePermissionForTransitLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the issue permission for transits.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssuePermissionForTransitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of issue permission for transits
	* @param end the upper bound of the range of issue permission for transits (not inclusive)
	* @return the range of issue permission for transits
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit> getIssuePermissionForTransits(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _issuePermissionForTransitLocalService.getIssuePermissionForTransits(start,
			end);
	}

	/**
	* Returns the number of issue permission for transits.
	*
	* @return the number of issue permission for transits
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getIssuePermissionForTransitsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _issuePermissionForTransitLocalService.getIssuePermissionForTransitsCount();
	}

	/**
	* Updates the issue permission for transit in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param issuePermissionForTransit the issue permission for transit
	* @return the issue permission for transit that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit updateIssuePermissionForTransit(
		vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit issuePermissionForTransit)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _issuePermissionForTransitLocalService.updateIssuePermissionForTransit(issuePermissionForTransit);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _issuePermissionForTransitLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_issuePermissionForTransitLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _issuePermissionForTransitLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public IssuePermissionForTransitLocalService getWrappedIssuePermissionForTransitLocalService() {
		return _issuePermissionForTransitLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedIssuePermissionForTransitLocalService(
		IssuePermissionForTransitLocalService issuePermissionForTransitLocalService) {
		_issuePermissionForTransitLocalService = issuePermissionForTransitLocalService;
	}

	@Override
	public IssuePermissionForTransitLocalService getWrappedService() {
		return _issuePermissionForTransitLocalService;
	}

	@Override
	public void setWrappedService(
		IssuePermissionForTransitLocalService issuePermissionForTransitLocalService) {
		_issuePermissionForTransitLocalService = issuePermissionForTransitLocalService;
	}

	private IssuePermissionForTransitLocalService _issuePermissionForTransitLocalService;
}