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
public class MotCuaPhieuXuLyFinderUtil {
	public static int countMotCuaPhieuXuLyByTrangThai(
		java.lang.String trangThaiId) {
		return getFinder().countMotCuaPhieuXuLyByTrangThai(trangThaiId);
	}

	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> searhMotCuaPhieuXuLy(
		long thuTucHanhChinhId, java.lang.String maSoHoSo,
		java.lang.String ngayGuiHoSoFrom, java.lang.String ngayGuiHoSoTo,
		int start, int end) {
		return getFinder()
				   .searhMotCuaPhieuXuLy(thuTucHanhChinhId, maSoHoSo,
			ngayGuiHoSoFrom, ngayGuiHoSoTo, start, end);
	}

	public static int countMotCuaPhieuXuLy(long thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayGuiHoSoFrom,
		java.lang.String ngayGuiHoSoTo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countMotCuaPhieuXuLy(thuTucHanhChinhId, maSoHoSo,
			ngayGuiHoSoFrom, ngayGuiHoSoTo);
	}

	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findMotCuaPhieuXuLy(
		long phanNhomHoSo, long ogrId, java.lang.String maSoBienNhan,
		java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		java.util.Date henTraTuNgay, java.util.Date henTraDenNgay,
		java.lang.String doanhNghiep, java.lang.String linhVucThuTucHanhChinh,
		long idThuTucHanhChinh, long userId, java.lang.String role, int start,
		int end) {
		return getFinder()
				   .findMotCuaPhieuXuLy(phanNhomHoSo, ogrId, maSoBienNhan,
			nopTuNgay, nopDenNgay, henTraTuNgay, henTraDenNgay, doanhNghiep,
			linhVucThuTucHanhChinh, idThuTucHanhChinh, userId, role, start, end);
	}

	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findMotCuaPhieuXuLyByUserId(
		long phanNhomHoSo, long ogrId, java.lang.String maSoBienNhan,
		java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		java.util.Date henTraTuNgay, java.util.Date henTraDenNgay,
		java.lang.String doanhNghiep, java.lang.String linhVucThuTucHanhChinh,
		long idThuTucHanhChinh, long userId, int start, int end) {
		return getFinder()
				   .findMotCuaPhieuXuLyByUserId(phanNhomHoSo, ogrId,
			maSoBienNhan, nopTuNgay, nopDenNgay, henTraTuNgay, henTraDenNgay,
			doanhNghiep, linhVucThuTucHanhChinh, idThuTucHanhChinh, userId,
			start, end);
	}

	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findMotCuaPhieuXuLyByUserId_TC01(
		long phanNhomHoSo, long ogrId, java.lang.String maSoBienNhan,
		java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		java.util.Date henTraTuNgay, java.util.Date henTraDenNgay,
		java.lang.String doanhNghiep, java.lang.String linhVucThuTucHanhChinh,
		long idThuTucHanhChinh, long userId, int start, int end) {
		return getFinder()
				   .findMotCuaPhieuXuLyByUserId_TC01(phanNhomHoSo, ogrId,
			maSoBienNhan, nopTuNgay, nopDenNgay, henTraTuNgay, henTraDenNgay,
			doanhNghiep, linhVucThuTucHanhChinh, idThuTucHanhChinh, userId,
			start, end);
	}

	public static int countMotCuaPhieuXuLyByUserId(long phanNhomHoSo,
		long ogrId, java.lang.String maSoBienNhan, java.util.Date nopTuNgay,
		java.util.Date nopDenNgay, java.util.Date henTraTuNgay,
		java.util.Date henTraDenNgay, java.lang.String doanhNghiep,
		java.lang.String linhVucThuTucHanhChinh, long idThuTucHanhChinh,
		long userId) {
		return getFinder()
				   .countMotCuaPhieuXuLyByUserId(phanNhomHoSo, ogrId,
			maSoBienNhan, nopTuNgay, nopDenNgay, henTraTuNgay, henTraDenNgay,
			doanhNghiep, linhVucThuTucHanhChinh, idThuTucHanhChinh, userId);
	}

	public static int countMotCuaPhieuXuLyByUserId_TC01(long phanNhomHoSo,
		long ogrId, java.lang.String maSoBienNhan, java.util.Date nopTuNgay,
		java.util.Date nopDenNgay, java.util.Date henTraTuNgay,
		java.util.Date henTraDenNgay, java.lang.String doanhNghiep,
		java.lang.String linhVucThuTucHanhChinh, long idThuTucHanhChinh,
		long userId) {
		return getFinder()
				   .countMotCuaPhieuXuLyByUserId_TC01(phanNhomHoSo, ogrId,
			maSoBienNhan, nopTuNgay, nopDenNgay, henTraTuNgay, henTraDenNgay,
			doanhNghiep, linhVucThuTucHanhChinh, idThuTucHanhChinh, userId);
	}

	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findMotCuaPhieuXuLyByUserId2(
		long phanNhomHoSo, long ogrId, java.lang.String maSoBienNhan,
		java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		java.util.Date henTraTuNgay, java.util.Date henTraDenNgay,
		java.lang.String doanhNghiep, java.lang.String linhVucThuTucHanhChinh,
		long idThuTucHanhChinh, long userId, int start, int end) {
		return getFinder()
				   .findMotCuaPhieuXuLyByUserId2(phanNhomHoSo, ogrId,
			maSoBienNhan, nopTuNgay, nopDenNgay, henTraTuNgay, henTraDenNgay,
			doanhNghiep, linhVucThuTucHanhChinh, idThuTucHanhChinh, userId,
			start, end);
	}

	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findMotCuaPhieuXuLyDoneByOrgid(
		long ogrId) {
		return getFinder().findMotCuaPhieuXuLyDoneByOrgid(ogrId);
	}

	public static int countMotCuaPhieuXuLyByUserId2(long phanNhomHoSo,
		long ogrId, java.lang.String maSoBienNhan, java.util.Date nopTuNgay,
		java.util.Date nopDenNgay, java.util.Date henTraTuNgay,
		java.util.Date henTraDenNgay, java.lang.String doanhNghiep,
		java.lang.String linhVucThuTucHanhChinh, long idThuTucHanhChinh,
		long userId) {
		return getFinder()
				   .countMotCuaPhieuXuLyByUserId2(phanNhomHoSo, ogrId,
			maSoBienNhan, nopTuNgay, nopDenNgay, henTraTuNgay, henTraDenNgay,
			doanhNghiep, linhVucThuTucHanhChinh, idThuTucHanhChinh, userId);
	}

	public static java.util.List<java.lang.Object> getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc(
		long ogrId, java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		long idThuTucHanhChinh, long userId, java.lang.String trangThaiIds) {
		return getFinder()
				   .getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc(ogrId,
			nopTuNgay, nopDenNgay, idThuTucHanhChinh, userId, trangThaiIds);
	}

	public static java.util.List<java.lang.Object> getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc2(
		long ogrId, java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		long idThuTucHanhChinh, long userId, java.lang.String trangThaiIds) {
		return getFinder()
				   .getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc2(ogrId,
			nopTuNgay, nopDenNgay, idThuTucHanhChinh, userId, trangThaiIds);
	}

	public static java.util.List<java.lang.Object> getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc3(
		long ogrId, java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		long idThuTucHanhChinh, long userId, java.lang.String trangThaiIds) {
		return getFinder()
				   .getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc3(ogrId,
			nopTuNgay, nopDenNgay, idThuTucHanhChinh, userId, trangThaiIds);
	}

	public static java.util.List<java.lang.Object> getMotCuaPhieuXuLyByOrgs(
		long ogrId) {
		return getFinder().getMotCuaPhieuXuLyByOrgs(ogrId);
	}

	public static java.util.List<java.lang.Object> getMotCuaPhieuXuLyByOrgs2(
		long ogrId) {
		return getFinder().getMotCuaPhieuXuLyByOrgs2(ogrId);
	}

	public static java.util.List<java.lang.Object> getMotCuaPhieuXuLyByTrangThaiAndUserId(
		long ogrId, java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		long idThuTucHanhChinh, long userId, java.lang.String trangThaiIds) {
		return getFinder()
				   .getMotCuaPhieuXuLyByTrangThaiAndUserId(ogrId, nopTuNgay,
			nopDenNgay, idThuTucHanhChinh, userId, trangThaiIds);
	}

	public static java.util.List<java.lang.Object> getMotCuaPhieuXuLyVanThuByOrgs(
		long ogrId) {
		return getFinder().getMotCuaPhieuXuLyVanThuByOrgs(ogrId);
	}

	public static int countMotCuaPhieuXuLyByTrangThaiVanThu(long ogrId,
		long idThuTucHanhChinh, java.lang.String trangThaiIds) {
		return getFinder()
				   .countMotCuaPhieuXuLyByTrangThaiVanThu(ogrId,
			idThuTucHanhChinh, trangThaiIds);
	}

	public static int countMotCuaPhieuXuLyByTrangThaiAndUserId(long ogrId,
		java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		long idThuTucHanhChinh, long userId, java.lang.String trangThaiIds) {
		return getFinder()
				   .countMotCuaPhieuXuLyByTrangThaiAndUserId(ogrId, nopTuNgay,
			nopDenNgay, idThuTucHanhChinh, userId, trangThaiIds);
	}

	public static int countMotCuaPhieuXuLyByTrangThaiAndUserId2(long ogrId,
		java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		long idThuTucHanhChinh, long userId, java.lang.String trangThaiIds) {
		return getFinder()
				   .countMotCuaPhieuXuLyByTrangThaiAndUserId2(ogrId, nopTuNgay,
			nopDenNgay, idThuTucHanhChinh, userId, trangThaiIds);
	}

	public static int countMotCuaPhieuXuLy(long phanNhomHoSo, long ogrId,
		java.lang.String maSoBienNhan, java.util.Date nopTuNgay,
		java.util.Date nopDenNgay, java.util.Date henTraTuNgay,
		java.util.Date henTraDenNgay, java.lang.String doanhNghiep,
		java.lang.String linhVucThuTucHanhChinh, long idThuTucHanhChinh,
		long userId, java.lang.String role) {
		return getFinder()
				   .countMotCuaPhieuXuLy(phanNhomHoSo, ogrId, maSoBienNhan,
			nopTuNgay, nopDenNgay, henTraTuNgay, henTraDenNgay, doanhNghiep,
			linhVucThuTucHanhChinh, idThuTucHanhChinh, userId, role);
	}

	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findMotCuaPhieuXuLyTrangThai(
		long phanNhomHoSo, long ogrId, java.lang.String maSoBienNhan,
		java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		java.util.Date henTraTuNgay, java.util.Date henTraDenNgay,
		java.lang.String doanhNghiep, java.lang.String linhVucThuTucHanhChinh,
		long idThuTucHanhChinh, long trangThaiHienTaiId, int start, int end) {
		return getFinder()
				   .findMotCuaPhieuXuLyTrangThai(phanNhomHoSo, ogrId,
			maSoBienNhan, nopTuNgay, nopDenNgay, henTraTuNgay, henTraDenNgay,
			doanhNghiep, linhVucThuTucHanhChinh, idThuTucHanhChinh,
			trangThaiHienTaiId, start, end);
	}

	public static int countMotCuaPhieuXuLyTrangThai(long phanNhomHoSo,
		long ogrId, java.lang.String maSoBienNhan, java.util.Date nopTuNgay,
		java.util.Date nopDenNgay, java.util.Date henTraTuNgay,
		java.util.Date henTraDenNgay, java.lang.String doanhNghiep,
		java.lang.String linhVucThuTucHanhChinh, long idThuTucHanhChinh,
		long trangThaiHienTaiId) {
		return getFinder()
				   .countMotCuaPhieuXuLyTrangThai(phanNhomHoSo, ogrId,
			maSoBienNhan, nopTuNgay, nopDenNgay, henTraTuNgay, henTraDenNgay,
			doanhNghiep, linhVucThuTucHanhChinh, idThuTucHanhChinh,
			trangThaiHienTaiId);
	}

	public static int countMotCuaPhieuXuLyByPhanNhomHoSo(long phanNhomHoSo,
		long ogrId, long userId, java.lang.String role)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countMotCuaPhieuXuLyByPhanNhomHoSo(phanNhomHoSo, ogrId,
			userId, role);
	}

	public static int layHoSoDaXuLyOrDangXuLy(long userId,
		java.lang.String trangThai, java.util.Date date) {
		return getFinder().layHoSoDaXuLyOrDangXuLy(userId, trangThai, date);
	}

	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findMotCuaPhieuXuLy_NEW(
		java.util.List<java.lang.String> lstPar, int start, int end) {
		return getFinder().findMotCuaPhieuXuLy_NEW(lstPar, start, end);
	}

	public static int countMotCuaPhieuXuLy_NEW(
		java.util.List<java.lang.String> lstPar) {
		return getFinder().countMotCuaPhieuXuLy_NEW(lstPar);
	}

	public static MotCuaPhieuXuLyFinder getFinder() {
		if (_finder == null) {
			_finder = (MotCuaPhieuXuLyFinder)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.motcua.service.ClpSerializer.getServletContextName(),
					MotCuaPhieuXuLyFinder.class.getName());

			ReferenceRegistry.registerReference(MotCuaPhieuXuLyFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(MotCuaPhieuXuLyFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(MotCuaPhieuXuLyFinderUtil.class,
			"_finder");
	}

	private static MotCuaPhieuXuLyFinder _finder;
}