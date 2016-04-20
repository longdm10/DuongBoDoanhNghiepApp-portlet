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

/**
 * @author win_64
 */
public interface DnDoanhNghiepFinder {
	public int countBySoDkdk(java.lang.String soDangKyKinhDoanh);

	public int countBySoEmail(java.lang.String email);

	public int countByMaSoDoanhNghiep(java.lang.String maSoDoanhNghiep);

	public int countByTenDoanhNghiep(java.lang.String tenDoanhNghiep);

	public java.util.List<vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep> findBySDK_TDN_TCD_TT_L(
		java.lang.String soDangKy, java.lang.String tenDoanhNghiep,
		java.lang.String tenCongDan, java.lang.String trangThai,
		java.lang.String loaiNguoiLamThuTuc, int start, int end);

	public int countBySDK_TDN_TCD_TT_L(java.lang.String soDangKy,
		java.lang.String tenDoanhNghiep, java.lang.String tenCongDan,
		java.lang.String trangThai, java.lang.String loaiNguoiLamThuTuc);
}