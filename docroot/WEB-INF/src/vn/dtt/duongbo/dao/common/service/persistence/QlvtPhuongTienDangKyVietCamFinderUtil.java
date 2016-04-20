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
public class QlvtPhuongTienDangKyVietCamFinderUtil {
	public static java.util.List<java.lang.Long> findIdNoiDungHoSoId(
		long noiDungHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findIdNoiDungHoSoId(noiDungHoSoId);
	}

	public static boolean deleteAllByNoiDungHoSoId(long noiDungHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().deleteAllByNoiDungHoSoId(noiDungHoSoId);
	}

	public static QlvtPhuongTienDangKyVietCamFinder getFinder() {
		if (_finder == null) {
			_finder = (QlvtPhuongTienDangKyVietCamFinder)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.common.service.ClpSerializer.getServletContextName(),
					QlvtPhuongTienDangKyVietCamFinder.class.getName());

			ReferenceRegistry.registerReference(QlvtPhuongTienDangKyVietCamFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(QlvtPhuongTienDangKyVietCamFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(QlvtPhuongTienDangKyVietCamFinderUtil.class,
			"_finder");
	}

	private static QlvtPhuongTienDangKyVietCamFinder _finder;
}