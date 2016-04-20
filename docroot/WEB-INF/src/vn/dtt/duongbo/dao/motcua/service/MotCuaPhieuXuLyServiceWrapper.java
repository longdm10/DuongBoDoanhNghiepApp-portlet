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
 * Provides a wrapper for {@link MotCuaPhieuXuLyService}.
 *
 * @author win_64
 * @see MotCuaPhieuXuLyService
 * @generated
 */
public class MotCuaPhieuXuLyServiceWrapper implements MotCuaPhieuXuLyService,
	ServiceWrapper<MotCuaPhieuXuLyService> {
	public MotCuaPhieuXuLyServiceWrapper(
		MotCuaPhieuXuLyService motCuaPhieuXuLyService) {
		_motCuaPhieuXuLyService = motCuaPhieuXuLyService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _motCuaPhieuXuLyService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_motCuaPhieuXuLyService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _motCuaPhieuXuLyService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public MotCuaPhieuXuLyService getWrappedMotCuaPhieuXuLyService() {
		return _motCuaPhieuXuLyService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedMotCuaPhieuXuLyService(
		MotCuaPhieuXuLyService motCuaPhieuXuLyService) {
		_motCuaPhieuXuLyService = motCuaPhieuXuLyService;
	}

	@Override
	public MotCuaPhieuXuLyService getWrappedService() {
		return _motCuaPhieuXuLyService;
	}

	@Override
	public void setWrappedService(MotCuaPhieuXuLyService motCuaPhieuXuLyService) {
		_motCuaPhieuXuLyService = motCuaPhieuXuLyService;
	}

	private MotCuaPhieuXuLyService _motCuaPhieuXuLyService;
}