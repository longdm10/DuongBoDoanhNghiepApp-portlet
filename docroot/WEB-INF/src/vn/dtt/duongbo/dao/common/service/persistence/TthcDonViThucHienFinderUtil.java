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
public class TthcDonViThucHienFinderUtil {
	public static java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByThuTucHanhChinhId(
		long thuTucHanhChinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findByThuTucHanhChinhId(thuTucHanhChinhId);
	}

	public static TthcDonViThucHienFinder getFinder() {
		if (_finder == null) {
			_finder = (TthcDonViThucHienFinder)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.common.service.ClpSerializer.getServletContextName(),
					TthcDonViThucHienFinder.class.getName());

			ReferenceRegistry.registerReference(TthcDonViThucHienFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(TthcDonViThucHienFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(TthcDonViThucHienFinderUtil.class,
			"_finder");
	}

	private static TthcDonViThucHienFinder _finder;
}