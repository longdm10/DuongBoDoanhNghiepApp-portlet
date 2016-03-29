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
public class TthcHoSoThuTucFinderUtil {
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc> searchQuanLyHoSo(
		java.lang.String maBienNhan, java.lang.String thuTucHanhChinhId,
		long nguoiLamThuTucId, long phanNhomHoSoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .searchQuanLyHoSo(maBienNhan, thuTucHanhChinhId,
			nguoiLamThuTucId, phanNhomHoSoId, start, end);
	}

	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc> searchQuanLyHoSoInPhanNhomHoSoDoanhNghiep(
		java.lang.String linhVucThuTuc, java.lang.String maBienNhan,
		java.lang.String thuTucHanhChinhId, long nguoiLamThuTucId,
		java.lang.String groupTrangThaiDoanhNghiepCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .searchQuanLyHoSoInPhanNhomHoSoDoanhNghiep(linhVucThuTuc,
			maBienNhan, thuTucHanhChinhId, nguoiLamThuTucId,
			groupTrangThaiDoanhNghiepCode, start, end);
	}

	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc> findHoSoByNguoiLamThuTucIdAndMaTrangThai(
		long nguoiLamThuTucId, java.lang.String maTrangThai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findHoSoByNguoiLamThuTucIdAndMaTrangThai(nguoiLamThuTucId,
			maTrangThai);
	}

	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc> searchQuanLyHoSoInPhanNhomGroup(
		java.lang.String maBienNhan, java.lang.String thuTucHanhChinhId,
		long nguoiLamThuTucId, java.lang.String groupPhanNhomHoSoId, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .searchQuanLyHoSoInPhanNhomGroup(maBienNhan,
			thuTucHanhChinhId, nguoiLamThuTucId, groupPhanNhomHoSoId, start, end);
	}

	public static java.lang.String maxMaBienNhan(java.util.Date date) {
		return getFinder().maxMaBienNhan(date);
	}

	public static java.lang.String maxMaSoHoSo(
		java.lang.String soDangKyKinhDoanh) {
		return getFinder().maxMaSoHoSo(soDangKyKinhDoanh);
	}

	public static int countQuanLyHoSo(java.lang.String maBienNhan,
		java.lang.String thuTucHanhChinhId, long nguoiLamThuTucId,
		long phanNhomHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countQuanLyHoSo(maBienNhan, thuTucHanhChinhId,
			nguoiLamThuTucId, phanNhomHoSoId);
	}

	public static int countQuanLyHoSoInPhanNhomHoSoDoanhNghiep(
		java.lang.String linhVucThuTuc, java.lang.String maBienNhan,
		java.lang.String thuTucHanhChinhId, long nguoiLamThuTucId,
		java.lang.String groupTrangThaiDoanhNghiepCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countQuanLyHoSoInPhanNhomHoSoDoanhNghiep(linhVucThuTuc,
			maBienNhan, thuTucHanhChinhId, nguoiLamThuTucId,
			groupTrangThaiDoanhNghiepCode);
	}

	public static int countQuanLyHoSoInPhanNhomGroup(
		java.lang.String maBienNhan, java.lang.String thuTucHanhChinhId,
		long nguoiLamThuTucId, java.lang.String groupPhanNhomHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countQuanLyHoSoInPhanNhomGroup(maBienNhan,
			thuTucHanhChinhId, nguoiLamThuTucId, groupPhanNhomHoSoId);
	}

	public static int countHoSoThuTucByPhanNhomHoSoIdAndNguoiLamThuTucId(
		long phanNhomHoSoId, long nguoiLamThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countHoSoThuTucByPhanNhomHoSoIdAndNguoiLamThuTucId(phanNhomHoSoId,
			nguoiLamThuTucId);
	}

	public static int countByGroupMaTrangThaiDoanhNghiepAndNguoiLamThuTucId(
		java.lang.String groupMaTrangThaiDoanhNghiep, long nguoiLamThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countByGroupMaTrangThaiDoanhNghiepAndNguoiLamThuTucId(groupMaTrangThaiDoanhNghiep,
			nguoiLamThuTucId);
	}

	public static int countByPhanNhomHoSoIdGroupAndNguoiLamThuTucId(
		java.lang.String phanNhomHoSoIdGroup, long nguoiLamThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countByPhanNhomHoSoIdGroupAndNguoiLamThuTucId(phanNhomHoSoIdGroup,
			nguoiLamThuTucId);
	}

	public static int countHoSoChoXuLy()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countHoSoChoXuLy();
	}

	public static int countHoSoDangXuLy()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countHoSoDangXuLy();
	}

	public static int countHoSoDaXuLy()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countHoSoDaXuLy();
	}

	public static int countHoSoThuTucByTrangThai(java.lang.String trangThaiId) {
		return getFinder().countHoSoThuTucByTrangThai(trangThaiId);
	}

	public static TthcHoSoThuTucFinder getFinder() {
		if (_finder == null) {
			_finder = (TthcHoSoThuTucFinder)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.common.service.ClpSerializer.getServletContextName(),
					TthcHoSoThuTucFinder.class.getName());

			ReferenceRegistry.registerReference(TthcHoSoThuTucFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(TthcHoSoThuTucFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(TthcHoSoThuTucFinderUtil.class,
			"_finder");
	}

	private static TthcHoSoThuTucFinder _finder;
}