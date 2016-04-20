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

package vn.dtt.duongbo.dao.thanhtoan.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author win_64
 */
public class ThanhToanKeyPayFinderUtil {
	public static java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.ThanhToanKeyPay> findByGoodCode(
		java.lang.String goodCode) {
		return getFinder().findByGoodCode(goodCode);
	}

	public static vn.dtt.duongbo.dao.thanhtoan.model.ThanhToanKeyPay findByGoodCodeAndMerchantCodeAndMerchantTransIdAndLoaiMessage(
		java.lang.String goodCode, java.lang.String merchantCode,
		java.lang.String merchantTransId, int loaiMessage) {
		return getFinder()
				   .findByGoodCodeAndMerchantCodeAndMerchantTransIdAndLoaiMessage(goodCode,
			merchantCode, merchantTransId, loaiMessage);
	}

	public static ThanhToanKeyPayFinder getFinder() {
		if (_finder == null) {
			_finder = (ThanhToanKeyPayFinder)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.thanhtoan.service.ClpSerializer.getServletContextName(),
					ThanhToanKeyPayFinder.class.getName());

			ReferenceRegistry.registerReference(ThanhToanKeyPayFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(ThanhToanKeyPayFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(ThanhToanKeyPayFinderUtil.class,
			"_finder");
	}

	private static ThanhToanKeyPayFinder _finder;
}