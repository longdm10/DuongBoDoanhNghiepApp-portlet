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
 * Provides a wrapper for {@link TempGeneralDeclarationService}.
 *
 * @author longdm
 * @see TempGeneralDeclarationService
 * @generated
 */
public class TempGeneralDeclarationServiceWrapper
	implements TempGeneralDeclarationService,
		ServiceWrapper<TempGeneralDeclarationService> {
	public TempGeneralDeclarationServiceWrapper(
		TempGeneralDeclarationService tempGeneralDeclarationService) {
		_tempGeneralDeclarationService = tempGeneralDeclarationService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _tempGeneralDeclarationService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tempGeneralDeclarationService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tempGeneralDeclarationService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TempGeneralDeclarationService getWrappedTempGeneralDeclarationService() {
		return _tempGeneralDeclarationService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTempGeneralDeclarationService(
		TempGeneralDeclarationService tempGeneralDeclarationService) {
		_tempGeneralDeclarationService = tempGeneralDeclarationService;
	}

	@Override
	public TempGeneralDeclarationService getWrappedService() {
		return _tempGeneralDeclarationService;
	}

	@Override
	public void setWrappedService(
		TempGeneralDeclarationService tempGeneralDeclarationService) {
		_tempGeneralDeclarationService = tempGeneralDeclarationService;
	}

	private TempGeneralDeclarationService _tempGeneralDeclarationService;
}