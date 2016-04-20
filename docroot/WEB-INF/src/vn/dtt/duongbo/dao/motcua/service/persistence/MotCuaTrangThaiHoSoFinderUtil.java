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
public class MotCuaTrangThaiHoSoFinderUtil {
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaTrangThaiHoSo findMotCuaTrangThaiHoSoById(
		long motCuaTrangThaiHoSoId) {
		return getFinder().findMotCuaTrangThaiHoSoById(motCuaTrangThaiHoSoId);
	}

	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaTrangThaiHoSo> findTrangThaiHoSoInListId(
		java.lang.String idStr) {
		return getFinder().findTrangThaiHoSoInListId(idStr);
	}

	public static MotCuaTrangThaiHoSoFinder getFinder() {
		if (_finder == null) {
			_finder = (MotCuaTrangThaiHoSoFinder)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.motcua.service.ClpSerializer.getServletContextName(),
					MotCuaTrangThaiHoSoFinder.class.getName());

			ReferenceRegistry.registerReference(MotCuaTrangThaiHoSoFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(MotCuaTrangThaiHoSoFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(MotCuaTrangThaiHoSoFinderUtil.class,
			"_finder");
	}

	private static MotCuaTrangThaiHoSoFinder _finder;
}