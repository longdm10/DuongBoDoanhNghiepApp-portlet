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

package vn.dtt.duongbo.dao.lienvan.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link QlvtXuLyGpLienVanService}.
 *
 * @author NhanNc
 * @see QlvtXuLyGpLienVanService
 * @generated
 */
public class QlvtXuLyGpLienVanServiceWrapper implements QlvtXuLyGpLienVanService,
	ServiceWrapper<QlvtXuLyGpLienVanService> {
	public QlvtXuLyGpLienVanServiceWrapper(
		QlvtXuLyGpLienVanService qlvtXuLyGpLienVanService) {
		_qlvtXuLyGpLienVanService = qlvtXuLyGpLienVanService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _qlvtXuLyGpLienVanService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_qlvtXuLyGpLienVanService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _qlvtXuLyGpLienVanService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public QlvtXuLyGpLienVanService getWrappedQlvtXuLyGpLienVanService() {
		return _qlvtXuLyGpLienVanService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedQlvtXuLyGpLienVanService(
		QlvtXuLyGpLienVanService qlvtXuLyGpLienVanService) {
		_qlvtXuLyGpLienVanService = qlvtXuLyGpLienVanService;
	}

	@Override
	public QlvtXuLyGpLienVanService getWrappedService() {
		return _qlvtXuLyGpLienVanService;
	}

	@Override
	public void setWrappedService(
		QlvtXuLyGpLienVanService qlvtXuLyGpLienVanService) {
		_qlvtXuLyGpLienVanService = qlvtXuLyGpLienVanService;
	}

	private QlvtXuLyGpLienVanService _qlvtXuLyGpLienVanService;
}