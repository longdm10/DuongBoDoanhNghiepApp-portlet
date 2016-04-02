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
 * Provides a wrapper for {@link DmGtRouteConfigService}.
 *
 * @author longdm
 * @see DmGtRouteConfigService
 * @generated
 */
public class DmGtRouteConfigServiceWrapper implements DmGtRouteConfigService,
	ServiceWrapper<DmGtRouteConfigService> {
	public DmGtRouteConfigServiceWrapper(
		DmGtRouteConfigService dmGtRouteConfigService) {
		_dmGtRouteConfigService = dmGtRouteConfigService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dmGtRouteConfigService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dmGtRouteConfigService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dmGtRouteConfigService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DmGtRouteConfigService getWrappedDmGtRouteConfigService() {
		return _dmGtRouteConfigService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDmGtRouteConfigService(
		DmGtRouteConfigService dmGtRouteConfigService) {
		_dmGtRouteConfigService = dmGtRouteConfigService;
	}

	@Override
	public DmGtRouteConfigService getWrappedService() {
		return _dmGtRouteConfigService;
	}

	@Override
	public void setWrappedService(DmGtRouteConfigService dmGtRouteConfigService) {
		_dmGtRouteConfigService = dmGtRouteConfigService;
	}

	private DmGtRouteConfigService _dmGtRouteConfigService;
}