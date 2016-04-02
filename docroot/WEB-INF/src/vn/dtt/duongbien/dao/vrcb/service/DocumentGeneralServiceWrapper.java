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
 * Provides a wrapper for {@link DocumentGeneralService}.
 *
 * @author longdm
 * @see DocumentGeneralService
 * @generated
 */
public class DocumentGeneralServiceWrapper implements DocumentGeneralService,
	ServiceWrapper<DocumentGeneralService> {
	public DocumentGeneralServiceWrapper(
		DocumentGeneralService documentGeneralService) {
		_documentGeneralService = documentGeneralService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _documentGeneralService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_documentGeneralService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _documentGeneralService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DocumentGeneralService getWrappedDocumentGeneralService() {
		return _documentGeneralService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDocumentGeneralService(
		DocumentGeneralService documentGeneralService) {
		_documentGeneralService = documentGeneralService;
	}

	@Override
	public DocumentGeneralService getWrappedService() {
		return _documentGeneralService;
	}

	@Override
	public void setWrappedService(DocumentGeneralService documentGeneralService) {
		_documentGeneralService = documentGeneralService;
	}

	private DocumentGeneralService _documentGeneralService;
}