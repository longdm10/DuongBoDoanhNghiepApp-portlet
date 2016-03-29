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
public class TthcTrangThaiHoSoFinderUtil {
	public static vn.dtt.duongbo.dao.common.model.TthcTrangThaiHoSo findMotCuaTrangThaiHoSoById(
		long motCuaTrangThaiHoSoId) {
		return getFinder().findMotCuaTrangThaiHoSoById(motCuaTrangThaiHoSoId);
	}

	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcTrangThaiHoSo> findTrangThaiHoSoInListId(
		java.lang.String idStr) {
		return getFinder().findTrangThaiHoSoInListId(idStr);
	}

	public static TthcTrangThaiHoSoFinder getFinder() {
		if (_finder == null) {
			_finder = (TthcTrangThaiHoSoFinder)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.common.service.ClpSerializer.getServletContextName(),
					TthcTrangThaiHoSoFinder.class.getName());

			ReferenceRegistry.registerReference(TthcTrangThaiHoSoFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(TthcTrangThaiHoSoFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(TthcTrangThaiHoSoFinderUtil.class,
			"_finder");
	}

	private static TthcTrangThaiHoSoFinder _finder;
}