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

package vn.dtt.duongbo.dao.common.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author win_64
 */
public class QlvtLoaiHinhHoatDongDnFinderUtil {
	public static java.util.List<java.lang.Long> findIdNoiDungHoSoId(
		long noiDungHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findIdNoiDungHoSoId(noiDungHoSoId);
	}

	public static boolean deleteAllByNoiDungHoSoId(long noiDungHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().deleteAllByNoiDungHoSoId(noiDungHoSoId);
	}

	public static QlvtLoaiHinhHoatDongDnFinder getFinder() {
		if (_finder == null) {
			_finder = (QlvtLoaiHinhHoatDongDnFinder)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.common.service.ClpSerializer.getServletContextName(),
					QlvtLoaiHinhHoatDongDnFinder.class.getName());

			ReferenceRegistry.registerReference(QlvtLoaiHinhHoatDongDnFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(QlvtLoaiHinhHoatDongDnFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(QlvtLoaiHinhHoatDongDnFinderUtil.class,
			"_finder");
	}

	private static QlvtLoaiHinhHoatDongDnFinder _finder;
}