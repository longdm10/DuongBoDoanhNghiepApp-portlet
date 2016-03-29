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

package vn.dtt.duongbo.dao.motcua.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OEPUserMgtWorkingUnit2tthcService}.
 *
 * @author win_64
 * @see OEPUserMgtWorkingUnit2tthcService
 * @generated
 */
public class OEPUserMgtWorkingUnit2tthcServiceWrapper
	implements OEPUserMgtWorkingUnit2tthcService,
		ServiceWrapper<OEPUserMgtWorkingUnit2tthcService> {
	public OEPUserMgtWorkingUnit2tthcServiceWrapper(
		OEPUserMgtWorkingUnit2tthcService oepUserMgtWorkingUnit2tthcService) {
		_oepUserMgtWorkingUnit2tthcService = oepUserMgtWorkingUnit2tthcService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _oepUserMgtWorkingUnit2tthcService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_oepUserMgtWorkingUnit2tthcService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _oepUserMgtWorkingUnit2tthcService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public OEPUserMgtWorkingUnit2tthcService getWrappedOEPUserMgtWorkingUnit2tthcService() {
		return _oepUserMgtWorkingUnit2tthcService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedOEPUserMgtWorkingUnit2tthcService(
		OEPUserMgtWorkingUnit2tthcService oepUserMgtWorkingUnit2tthcService) {
		_oepUserMgtWorkingUnit2tthcService = oepUserMgtWorkingUnit2tthcService;
	}

	@Override
	public OEPUserMgtWorkingUnit2tthcService getWrappedService() {
		return _oepUserMgtWorkingUnit2tthcService;
	}

	@Override
	public void setWrappedService(
		OEPUserMgtWorkingUnit2tthcService oepUserMgtWorkingUnit2tthcService) {
		_oepUserMgtWorkingUnit2tthcService = oepUserMgtWorkingUnit2tthcService;
	}

	private OEPUserMgtWorkingUnit2tthcService _oepUserMgtWorkingUnit2tthcService;
}