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
 * Provides a wrapper for {@link InterfaceRequestService}.
 *
 * @author longdm
 * @see InterfaceRequestService
 * @generated
 */
public class InterfaceRequestServiceWrapper implements InterfaceRequestService,
	ServiceWrapper<InterfaceRequestService> {
	public InterfaceRequestServiceWrapper(
		InterfaceRequestService interfaceRequestService) {
		_interfaceRequestService = interfaceRequestService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _interfaceRequestService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_interfaceRequestService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _interfaceRequestService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public InterfaceRequestService getWrappedInterfaceRequestService() {
		return _interfaceRequestService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedInterfaceRequestService(
		InterfaceRequestService interfaceRequestService) {
		_interfaceRequestService = interfaceRequestService;
	}

	@Override
	public InterfaceRequestService getWrappedService() {
		return _interfaceRequestService;
	}

	@Override
	public void setWrappedService(
		InterfaceRequestService interfaceRequestService) {
		_interfaceRequestService = interfaceRequestService;
	}

	private InterfaceRequestService _interfaceRequestService;
}