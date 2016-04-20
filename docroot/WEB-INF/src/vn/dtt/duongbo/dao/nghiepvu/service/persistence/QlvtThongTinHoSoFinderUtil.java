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

package vn.dtt.duongbo.dao.nghiepvu.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author NhanNc
 */
public class QlvtThongTinHoSoFinderUtil {
	public static QlvtThongTinHoSoFinder getFinder() {
		if (_finder == null) {
			_finder = (QlvtThongTinHoSoFinder)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					QlvtThongTinHoSoFinder.class.getName());

			ReferenceRegistry.registerReference(QlvtThongTinHoSoFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(QlvtThongTinHoSoFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(QlvtThongTinHoSoFinderUtil.class,
			"_finder");
	}

	private static QlvtThongTinHoSoFinder _finder;
}