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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for QlvtCapPhepGpLienVan. This utility wraps
 * {@link vn.dtt.duongbo.dao.lienvan.service.impl.QlvtCapPhepGpLienVanServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author NhanNc
 * @see QlvtCapPhepGpLienVanService
 * @see vn.dtt.duongbo.dao.lienvan.service.base.QlvtCapPhepGpLienVanServiceBaseImpl
 * @see vn.dtt.duongbo.dao.lienvan.service.impl.QlvtCapPhepGpLienVanServiceImpl
 * @generated
 */
public class QlvtCapPhepGpLienVanServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.duongbo.dao.lienvan.service.impl.QlvtCapPhepGpLienVanServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	public static QlvtCapPhepGpLienVanService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					QlvtCapPhepGpLienVanService.class.getName());

			if (invokableService instanceof QlvtCapPhepGpLienVanService) {
				_service = (QlvtCapPhepGpLienVanService)invokableService;
			}
			else {
				_service = new QlvtCapPhepGpLienVanServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(QlvtCapPhepGpLienVanServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(QlvtCapPhepGpLienVanService service) {
	}

	private static QlvtCapPhepGpLienVanService _service;
}