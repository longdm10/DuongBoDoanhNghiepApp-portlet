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

package vn.dtt.duongbo.dao.quocte.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen. This utility wraps
 * {@link vn.dtt.duongbo.dao.quocte.service.impl.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author NoiPham
 * @see QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenService
 * @see vn.dtt.duongbo.dao.quocte.service.base.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenServiceBaseImpl
 * @see vn.dtt.duongbo.dao.quocte.service.impl.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenServiceImpl
 * @generated
 */
public class QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.duongbo.dao.quocte.service.impl.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void clearService() {
		_service = null;
	}

	public static QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenService.class.getName());

			if (invokableService instanceof QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenService) {
				_service = (QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenService)invokableService;
			}
			else {
				_service = new QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenService service) {
	}

	private static QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenService _service;
}