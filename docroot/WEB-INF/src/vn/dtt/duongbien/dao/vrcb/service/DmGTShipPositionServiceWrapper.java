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
 * Provides a wrapper for {@link DmGTShipPositionService}.
 *
 * @author longdm
 * @see DmGTShipPositionService
 * @generated
 */
public class DmGTShipPositionServiceWrapper implements DmGTShipPositionService,
	ServiceWrapper<DmGTShipPositionService> {
	public DmGTShipPositionServiceWrapper(
		DmGTShipPositionService dmGTShipPositionService) {
		_dmGTShipPositionService = dmGTShipPositionService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dmGTShipPositionService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dmGTShipPositionService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dmGTShipPositionService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DmGTShipPositionService getWrappedDmGTShipPositionService() {
		return _dmGTShipPositionService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDmGTShipPositionService(
		DmGTShipPositionService dmGTShipPositionService) {
		_dmGTShipPositionService = dmGTShipPositionService;
	}

	@Override
	public DmGTShipPositionService getWrappedService() {
		return _dmGTShipPositionService;
	}

	@Override
	public void setWrappedService(
		DmGTShipPositionService dmGTShipPositionService) {
		_dmGTShipPositionService = dmGTShipPositionService;
	}

	private DmGTShipPositionService _dmGTShipPositionService;
}