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
 * Provides a wrapper for {@link MotCuaNhanTraHoSoService}.
 *
 * @author win_64
 * @see MotCuaNhanTraHoSoService
 * @generated
 */
public class MotCuaNhanTraHoSoServiceWrapper implements MotCuaNhanTraHoSoService,
	ServiceWrapper<MotCuaNhanTraHoSoService> {
	public MotCuaNhanTraHoSoServiceWrapper(
		MotCuaNhanTraHoSoService motCuaNhanTraHoSoService) {
		_motCuaNhanTraHoSoService = motCuaNhanTraHoSoService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _motCuaNhanTraHoSoService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_motCuaNhanTraHoSoService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _motCuaNhanTraHoSoService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public MotCuaNhanTraHoSoService getWrappedMotCuaNhanTraHoSoService() {
		return _motCuaNhanTraHoSoService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedMotCuaNhanTraHoSoService(
		MotCuaNhanTraHoSoService motCuaNhanTraHoSoService) {
		_motCuaNhanTraHoSoService = motCuaNhanTraHoSoService;
	}

	@Override
	public MotCuaNhanTraHoSoService getWrappedService() {
		return _motCuaNhanTraHoSoService;
	}

	@Override
	public void setWrappedService(
		MotCuaNhanTraHoSoService motCuaNhanTraHoSoService) {
		_motCuaNhanTraHoSoService = motCuaNhanTraHoSoService;
	}

	private MotCuaNhanTraHoSoService _motCuaNhanTraHoSoService;
}