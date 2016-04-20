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
public class TthcXacNhanThanhToanFinderUtil {
	public static java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan> findTthcXacNhanThanhToan(
		java.lang.String maGiaoDich, java.lang.String loaiGiaoDich,
		java.lang.String hinhThucThanhToan, long toChucQuanLy,
		java.lang.String trangThai, java.lang.String trangThaiSearch,
		java.util.Date tuNgay, java.util.Date denNGay,
		java.lang.String tenDoanhNGhiep, int year, int start, int end) {
		return getFinder()
				   .findTthcXacNhanThanhToan(maGiaoDich, loaiGiaoDich,
			hinhThucThanhToan, toChucQuanLy, trangThai, trangThaiSearch,
			tuNgay, denNGay, tenDoanhNGhiep, year, start, end);
	}

	public static int countTthcXacNhanThanhToan(java.lang.String maGiaoDich,
		java.lang.String loaiGiaoDich, java.lang.String hinhThucThanhToan,
		long toChucQuanLy, java.lang.String trangThai,
		java.lang.String trangThaiSearch, java.util.Date tuNgay,
		java.util.Date denNGay, java.lang.String tenDoanhNGhiep, int year) {
		return getFinder()
				   .countTthcXacNhanThanhToan(maGiaoDich, loaiGiaoDich,
			hinhThucThanhToan, toChucQuanLy, trangThai, trangThaiSearch,
			tuNgay, denNGay, tenDoanhNGhiep, year);
	}

	public static java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan> findByTrangThaiXacNhanAndToChucQuanLy(
		long toChucQuanLy, java.lang.String trangThai, int start, int end) {
		return getFinder()
				   .findByTrangThaiXacNhanAndToChucQuanLy(toChucQuanLy,
			trangThai, start, end);
	}

	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan findByMaTuSinh(
		java.lang.String maTuSinh) {
		return getFinder().findByMaTuSinh(maTuSinh);
	}

	public static int countByTrangThaiXacNhanAndToChucQuanLy(
		long toChucQuanLy, java.lang.String trangThai) {
		return getFinder()
				   .countByTrangThaiXacNhanAndToChucQuanLy(toChucQuanLy,
			trangThai);
	}

	public static int sumTienByTrangThaiXacNhanAndToChucQuanLy(
		int hinhthucthanhtoan, java.lang.String loaiPhi, int trangThai,
		long tochucquanly, java.util.Date ngayGiaoDichTu,
		java.util.Date ngayGiaoDichDen) {
		return getFinder()
				   .sumTienByTrangThaiXacNhanAndToChucQuanLy(hinhthucthanhtoan,
			loaiPhi, trangThai, tochucquanly, ngayGiaoDichTu, ngayGiaoDichDen);
	}

	public static int countSoHoSoByTrangThaiXacNhanAndToChucQuanLy(
		int hinhthucthanhtoan, java.lang.String loaiPhi, int trangThai,
		long tochucquanly, java.util.Date ngayGiaoDichTu,
		java.util.Date ngayGiaoDichDen) {
		return getFinder()
				   .countSoHoSoByTrangThaiXacNhanAndToChucQuanLy(hinhthucthanhtoan,
			loaiPhi, trangThai, tochucquanly, ngayGiaoDichTu, ngayGiaoDichDen);
	}

	public static TthcXacNhanThanhToanFinder getFinder() {
		if (_finder == null) {
			_finder = (TthcXacNhanThanhToanFinder)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.thanhtoan.service.ClpSerializer.getServletContextName(),
					TthcXacNhanThanhToanFinder.class.getName());

			ReferenceRegistry.registerReference(TthcXacNhanThanhToanFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(TthcXacNhanThanhToanFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(TthcXacNhanThanhToanFinderUtil.class,
			"_finder");
	}

	private static TthcXacNhanThanhToanFinder _finder;
}