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

package vn.dtt.duongbo.dao.nghiepvu.service.persistence;

/**
 * @author NhanNc
 */
public interface QlvtQuanLyFileFinder {
	public java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile> searchQuanLyFile(
		long doanhNghiepId, long loaiFile, java.lang.String trangThai,
		java.lang.String tenGiayTo, java.util.Date fromNgayCP,
		java.util.Date toNgayCP, java.util.Date fromNgayHH,
		java.util.Date toNgayHH, java.util.Date fromNgayTai,
		java.util.Date toNgayTai, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countQuanLyFile(long doanhNghiepId, long loaiFile,
		java.lang.String trangThai, java.lang.String tenGiayTo,
		java.util.Date fromNgayCP, java.util.Date toNgayCP,
		java.util.Date fromNgayHH, java.util.Date toNgayHH,
		java.util.Date fromNgayTai, java.util.Date toNgayTai)
		throws com.liferay.portal.kernel.exception.SystemException;
}