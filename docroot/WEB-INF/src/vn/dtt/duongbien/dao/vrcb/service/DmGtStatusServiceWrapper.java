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
 * Provides a wrapper for {@link DmGtStatusService}.
 *
 * @author longdm
 * @see DmGtStatusService
 * @generated
 */
public class DmGtStatusServiceWrapper implements DmGtStatusService,
	ServiceWrapper<DmGtStatusService> {
	public DmGtStatusServiceWrapper(DmGtStatusService dmGtStatusService) {
		_dmGtStatusService = dmGtStatusService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dmGtStatusService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dmGtStatusService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dmGtStatusService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DmGtStatusService getWrappedDmGtStatusService() {
		return _dmGtStatusService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDmGtStatusService(DmGtStatusService dmGtStatusService) {
		_dmGtStatusService = dmGtStatusService;
	}

	@Override
	public DmGtStatusService getWrappedService() {
		return _dmGtStatusService;
	}

	@Override
	public void setWrappedService(DmGtStatusService dmGtStatusService) {
		_dmGtStatusService = dmGtStatusService;
	}

	private DmGtStatusService _dmGtStatusService;
}