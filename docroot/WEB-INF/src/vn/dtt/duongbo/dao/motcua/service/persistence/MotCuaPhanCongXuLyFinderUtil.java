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

package vn.dtt.duongbo.dao.motcua.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author win_64
 */
public class MotCuaPhanCongXuLyFinderUtil {
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhanCongXuLy findMotCuaPhanCongXuLyByPhieuXuLyId(
		long idPhieuXuLy) {
		return getFinder().findMotCuaPhanCongXuLyByPhieuXuLyId(idPhieuXuLy);
	}

	public static int updateMotCuaPhanCongXuLy(long idNguoiPhanCong,
		long idNguoiDuocUyQuyen) {
		return getFinder()
				   .updateMotCuaPhanCongXuLy(idNguoiPhanCong, idNguoiDuocUyQuyen);
	}

	public static MotCuaPhanCongXuLyFinder getFinder() {
		if (_finder == null) {
			_finder = (MotCuaPhanCongXuLyFinder)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.motcua.service.ClpSerializer.getServletContextName(),
					MotCuaPhanCongXuLyFinder.class.getName());

			ReferenceRegistry.registerReference(MotCuaPhanCongXuLyFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(MotCuaPhanCongXuLyFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(MotCuaPhanCongXuLyFinderUtil.class,
			"_finder");
	}

	private static MotCuaPhanCongXuLyFinder _finder;
}