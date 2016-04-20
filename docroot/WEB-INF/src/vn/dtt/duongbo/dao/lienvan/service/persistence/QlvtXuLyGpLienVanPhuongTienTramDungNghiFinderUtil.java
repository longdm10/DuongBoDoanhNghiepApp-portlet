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

package vn.dtt.duongbo.dao.lienvan.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author NhanNc
 */
public class QlvtXuLyGpLienVanPhuongTienTramDungNghiFinderUtil {
	public static boolean deleteByCapGplvPhuongTienId(long capGplvPhuongTienId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().deleteByCapGplvPhuongTienId(capGplvPhuongTienId);
	}

	public static QlvtXuLyGpLienVanPhuongTienTramDungNghiFinder getFinder() {
		if (_finder == null) {
			_finder = (QlvtXuLyGpLienVanPhuongTienTramDungNghiFinder)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.lienvan.service.ClpSerializer.getServletContextName(),
					QlvtXuLyGpLienVanPhuongTienTramDungNghiFinder.class.getName());

			ReferenceRegistry.registerReference(QlvtXuLyGpLienVanPhuongTienTramDungNghiFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(QlvtXuLyGpLienVanPhuongTienTramDungNghiFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(QlvtXuLyGpLienVanPhuongTienTramDungNghiFinderUtil.class,
			"_finder");
	}

	private static QlvtXuLyGpLienVanPhuongTienTramDungNghiFinder _finder;
}