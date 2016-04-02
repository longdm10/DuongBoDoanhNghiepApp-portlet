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
 * Provides a wrapper for {@link ResultCertificateService}.
 *
 * @author longdm
 * @see ResultCertificateService
 * @generated
 */
public class ResultCertificateServiceWrapper implements ResultCertificateService,
	ServiceWrapper<ResultCertificateService> {
	public ResultCertificateServiceWrapper(
		ResultCertificateService resultCertificateService) {
		_resultCertificateService = resultCertificateService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _resultCertificateService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_resultCertificateService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _resultCertificateService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ResultCertificateService getWrappedResultCertificateService() {
		return _resultCertificateService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedResultCertificateService(
		ResultCertificateService resultCertificateService) {
		_resultCertificateService = resultCertificateService;
	}

	@Override
	public ResultCertificateService getWrappedService() {
		return _resultCertificateService;
	}

	@Override
	public void setWrappedService(
		ResultCertificateService resultCertificateService) {
		_resultCertificateService = resultCertificateService;
	}

	private ResultCertificateService _resultCertificateService;
}