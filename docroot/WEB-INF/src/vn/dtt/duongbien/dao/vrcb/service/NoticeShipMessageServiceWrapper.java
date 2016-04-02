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
 * Provides a wrapper for {@link NoticeShipMessageService}.
 *
 * @author longdm
 * @see NoticeShipMessageService
 * @generated
 */
public class NoticeShipMessageServiceWrapper implements NoticeShipMessageService,
	ServiceWrapper<NoticeShipMessageService> {
	public NoticeShipMessageServiceWrapper(
		NoticeShipMessageService noticeShipMessageService) {
		_noticeShipMessageService = noticeShipMessageService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _noticeShipMessageService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_noticeShipMessageService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _noticeShipMessageService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public NoticeShipMessageService getWrappedNoticeShipMessageService() {
		return _noticeShipMessageService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedNoticeShipMessageService(
		NoticeShipMessageService noticeShipMessageService) {
		_noticeShipMessageService = noticeShipMessageService;
	}

	@Override
	public NoticeShipMessageService getWrappedService() {
		return _noticeShipMessageService;
	}

	@Override
	public void setWrappedService(
		NoticeShipMessageService noticeShipMessageService) {
		_noticeShipMessageService = noticeShipMessageService;
	}

	private NoticeShipMessageService _noticeShipMessageService;
}