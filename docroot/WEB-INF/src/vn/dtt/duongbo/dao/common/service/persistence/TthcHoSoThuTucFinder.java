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

/**
 * @author win_64
 */
public interface TthcHoSoThuTucFinder {
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc> searchQuanLyHoSo(
		java.lang.String maBienNhan, java.lang.String thuTucHanhChinhId,
		long nguoiLamThuTucId, long phanNhomHoSoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc> searchQuanLyHoSoInPhanNhomHoSoDoanhNghiep(
		java.lang.String linhVucThuTuc, java.lang.String maBienNhan,
		java.lang.String thuTucHanhChinhId, long nguoiLamThuTucId,
		java.lang.String groupTrangThaiDoanhNghiepCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc> findHoSoByNguoiLamThuTucIdAndMaTrangThai(
		long nguoiLamThuTucId, java.lang.String maTrangThai)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc> searchQuanLyHoSoInPhanNhomGroup(
		java.lang.String maBienNhan, java.lang.String thuTucHanhChinhId,
		long nguoiLamThuTucId, java.lang.String groupPhanNhomHoSoId, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	public java.lang.String maxMaBienNhan(java.util.Date date);

	public java.lang.String maxMaSoHoSo(java.lang.String soDangKyKinhDoanh);

	public int countQuanLyHoSo(java.lang.String maBienNhan,
		java.lang.String thuTucHanhChinhId, long nguoiLamThuTucId,
		long phanNhomHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countQuanLyHoSoInPhanNhomHoSoDoanhNghiep(
		java.lang.String linhVucThuTuc, java.lang.String maBienNhan,
		java.lang.String thuTucHanhChinhId, long nguoiLamThuTucId,
		java.lang.String groupTrangThaiDoanhNghiepCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countQuanLyHoSoInPhanNhomGroup(java.lang.String maBienNhan,
		java.lang.String thuTucHanhChinhId, long nguoiLamThuTucId,
		java.lang.String groupPhanNhomHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countHoSoThuTucByPhanNhomHoSoIdAndNguoiLamThuTucId(
		long phanNhomHoSoId, long nguoiLamThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByGroupMaTrangThaiDoanhNghiepAndNguoiLamThuTucId(
		java.lang.String groupMaTrangThaiDoanhNghiep, long nguoiLamThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByPhanNhomHoSoIdGroupAndNguoiLamThuTucId(
		java.lang.String phanNhomHoSoIdGroup, long nguoiLamThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countHoSoChoXuLy()
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countHoSoDangXuLy()
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countHoSoDaXuLy()
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countHoSoThuTucByTrangThai(java.lang.String trangThaiId);
}