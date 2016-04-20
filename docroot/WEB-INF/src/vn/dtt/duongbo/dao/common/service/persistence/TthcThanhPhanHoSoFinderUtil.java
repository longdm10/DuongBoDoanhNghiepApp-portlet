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
public class TthcThanhPhanHoSoFinderUtil {
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo> findByThutucHanhChinhIdAndLoaiThanhPhan(
		java.lang.String thuTucHanhChinhId, java.lang.String loaiThanhPhan) {
		return getFinder()
				   .findByThutucHanhChinhIdAndLoaiThanhPhan(thuTucHanhChinhId,
			loaiThanhPhan);
	}

	public static TthcThanhPhanHoSoFinder getFinder() {
		if (_finder == null) {
			_finder = (TthcThanhPhanHoSoFinder)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.common.service.ClpSerializer.getServletContextName(),
					TthcThanhPhanHoSoFinder.class.getName());

			ReferenceRegistry.registerReference(TthcThanhPhanHoSoFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(TthcThanhPhanHoSoFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(TthcThanhPhanHoSoFinderUtil.class,
			"_finder");
	}

	private static TthcThanhPhanHoSoFinder _finder;
}