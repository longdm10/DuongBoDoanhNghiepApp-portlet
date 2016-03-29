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

package vn.dtt.duongbo.dao.nghiepvu.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link QlvtThongTinXuLyService}.
 *
 * @author NhanNc
 * @see QlvtThongTinXuLyService
 * @generated
 */
public class QlvtThongTinXuLyServiceWrapper implements QlvtThongTinXuLyService,
	ServiceWrapper<QlvtThongTinXuLyService> {
	public QlvtThongTinXuLyServiceWrapper(
		QlvtThongTinXuLyService qlvtThongTinXuLyService) {
		_qlvtThongTinXuLyService = qlvtThongTinXuLyService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _qlvtThongTinXuLyService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_qlvtThongTinXuLyService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _qlvtThongTinXuLyService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public QlvtThongTinXuLyService getWrappedQlvtThongTinXuLyService() {
		return _qlvtThongTinXuLyService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedQlvtThongTinXuLyService(
		QlvtThongTinXuLyService qlvtThongTinXuLyService) {
		_qlvtThongTinXuLyService = qlvtThongTinXuLyService;
	}

	@Override
	public QlvtThongTinXuLyService getWrappedService() {
		return _qlvtThongTinXuLyService;
	}

	@Override
	public void setWrappedService(
		QlvtThongTinXuLyService qlvtThongTinXuLyService) {
		_qlvtThongTinXuLyService = qlvtThongTinXuLyService;
	}

	private QlvtThongTinXuLyService _qlvtThongTinXuLyService;
}