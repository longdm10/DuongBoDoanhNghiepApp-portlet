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
 * Provides a wrapper for {@link IssuePortClearanceService}.
 *
 * @author longdm
 * @see IssuePortClearanceService
 * @generated
 */
public class IssuePortClearanceServiceWrapper
	implements IssuePortClearanceService,
		ServiceWrapper<IssuePortClearanceService> {
	public IssuePortClearanceServiceWrapper(
		IssuePortClearanceService issuePortClearanceService) {
		_issuePortClearanceService = issuePortClearanceService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _issuePortClearanceService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_issuePortClearanceService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _issuePortClearanceService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public IssuePortClearanceService getWrappedIssuePortClearanceService() {
		return _issuePortClearanceService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedIssuePortClearanceService(
		IssuePortClearanceService issuePortClearanceService) {
		_issuePortClearanceService = issuePortClearanceService;
	}

	@Override
	public IssuePortClearanceService getWrappedService() {
		return _issuePortClearanceService;
	}

	@Override
	public void setWrappedService(
		IssuePortClearanceService issuePortClearanceService) {
		_issuePortClearanceService = issuePortClearanceService;
	}

	private IssuePortClearanceService _issuePortClearanceService;
}