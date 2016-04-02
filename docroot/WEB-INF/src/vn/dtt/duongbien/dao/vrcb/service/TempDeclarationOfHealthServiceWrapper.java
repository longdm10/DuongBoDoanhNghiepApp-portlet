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
 * Provides a wrapper for {@link TempDeclarationOfHealthService}.
 *
 * @author longdm
 * @see TempDeclarationOfHealthService
 * @generated
 */
public class TempDeclarationOfHealthServiceWrapper
	implements TempDeclarationOfHealthService,
		ServiceWrapper<TempDeclarationOfHealthService> {
	public TempDeclarationOfHealthServiceWrapper(
		TempDeclarationOfHealthService tempDeclarationOfHealthService) {
		_tempDeclarationOfHealthService = tempDeclarationOfHealthService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _tempDeclarationOfHealthService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tempDeclarationOfHealthService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tempDeclarationOfHealthService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TempDeclarationOfHealthService getWrappedTempDeclarationOfHealthService() {
		return _tempDeclarationOfHealthService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTempDeclarationOfHealthService(
		TempDeclarationOfHealthService tempDeclarationOfHealthService) {
		_tempDeclarationOfHealthService = tempDeclarationOfHealthService;
	}

	@Override
	public TempDeclarationOfHealthService getWrappedService() {
		return _tempDeclarationOfHealthService;
	}

	@Override
	public void setWrappedService(
		TempDeclarationOfHealthService tempDeclarationOfHealthService) {
		_tempDeclarationOfHealthService = tempDeclarationOfHealthService;
	}

	private TempDeclarationOfHealthService _tempDeclarationOfHealthService;
}