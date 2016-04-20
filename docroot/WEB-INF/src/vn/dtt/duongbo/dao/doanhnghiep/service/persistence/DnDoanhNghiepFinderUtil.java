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

package vn.dtt.duongbo.dao.doanhnghiep.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author win_64
 */
public class DnDoanhNghiepFinderUtil {
	public static int countBySoDkdk(java.lang.String soDangKyKinhDoanh) {
		return getFinder().countBySoDkdk(soDangKyKinhDoanh);
	}

	public static int countBySoEmail(java.lang.String email) {
		return getFinder().countBySoEmail(email);
	}

	public static int countByMaSoDoanhNghiep(java.lang.String maSoDoanhNghiep) {
		return getFinder().countByMaSoDoanhNghiep(maSoDoanhNghiep);
	}

	public static int countByTenDoanhNghiep(java.lang.String tenDoanhNghiep) {
		return getFinder().countByTenDoanhNghiep(tenDoanhNghiep);
	}

	public static java.util.List<vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep> findBySDK_TDN_TCD_TT_L(
		java.lang.String soDangKy, java.lang.String tenDoanhNghiep,
		java.lang.String tenCongDan, java.lang.String trangThai,
		java.lang.String loaiNguoiLamThuTuc, int start, int end) {
		return getFinder()
				   .findBySDK_TDN_TCD_TT_L(soDangKy, tenDoanhNghiep,
			tenCongDan, trangThai, loaiNguoiLamThuTuc, start, end);
	}

	public static int countBySDK_TDN_TCD_TT_L(java.lang.String soDangKy,
		java.lang.String tenDoanhNghiep, java.lang.String tenCongDan,
		java.lang.String trangThai, java.lang.String loaiNguoiLamThuTuc) {
		return getFinder()
				   .countBySDK_TDN_TCD_TT_L(soDangKy, tenDoanhNghiep,
			tenCongDan, trangThai, loaiNguoiLamThuTuc);
	}

	public static DnDoanhNghiepFinder getFinder() {
		if (_finder == null) {
			_finder = (DnDoanhNghiepFinder)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.doanhnghiep.service.ClpSerializer.getServletContextName(),
					DnDoanhNghiepFinder.class.getName());

			ReferenceRegistry.registerReference(DnDoanhNghiepFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(DnDoanhNghiepFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(DnDoanhNghiepFinderUtil.class,
			"_finder");
	}

	private static DnDoanhNghiepFinder _finder;
}