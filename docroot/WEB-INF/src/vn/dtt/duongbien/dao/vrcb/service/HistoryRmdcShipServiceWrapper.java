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
 * Provides a wrapper for {@link HistoryRmdcShipService}.
 *
 * @author longdm
 * @see HistoryRmdcShipService
 * @generated
 */
public class HistoryRmdcShipServiceWrapper implements HistoryRmdcShipService,
	ServiceWrapper<HistoryRmdcShipService> {
	public HistoryRmdcShipServiceWrapper(
		HistoryRmdcShipService historyRmdcShipService) {
		_historyRmdcShipService = historyRmdcShipService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _historyRmdcShipService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_historyRmdcShipService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _historyRmdcShipService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public HistoryRmdcShipService getWrappedHistoryRmdcShipService() {
		return _historyRmdcShipService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedHistoryRmdcShipService(
		HistoryRmdcShipService historyRmdcShipService) {
		_historyRmdcShipService = historyRmdcShipService;
	}

	@Override
	public HistoryRmdcShipService getWrappedService() {
		return _historyRmdcShipService;
	}

	@Override
	public void setWrappedService(HistoryRmdcShipService historyRmdcShipService) {
		_historyRmdcShipService = historyRmdcShipService;
	}

	private HistoryRmdcShipService _historyRmdcShipService;
}