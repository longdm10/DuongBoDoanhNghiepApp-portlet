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

package vn.dtt.duongbo.dao.doanhnghiep.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep;
import vn.dtt.duongbo.dao.doanhnghiep.service.base.DnDoanhNghiepLocalServiceBaseImpl;

/**
 * The implementation of the dn doanh nghiep local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.duongbo.dao.doanhnghiep.service.base.DnDoanhNghiepLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepLocalServiceUtil
 */
public class DnDoanhNghiepLocalServiceImpl
	extends DnDoanhNghiepLocalServiceBaseImpl {
	
	public int countBySoDkdk(String soDangKyKinhDoanh) {
		return dnDoanhNghiepFinder.countBySoDkdk(soDangKyKinhDoanh);
	}
	
	public int countByEmail(String email) {
		
		try {
			return dnDoanhNghiepPersistence.countByEmail(email);
		} catch(SystemException e) {
			_log.error(e);
		}
		
		return 0;
	}
	
	public List<DnDoanhNghiep> findByEmail(String email) {
		try {
			return dnDoanhNghiepPersistence.findByEmail(email);
		} catch(SystemException e) {
			_log.error(e);
		}
		
		return new ArrayList<DnDoanhNghiep>();
	}
	
	public int countByMaSoDoanhNghiep(String maSoDoanhNghiep) {
		return dnDoanhNghiepFinder.countByMaSoDoanhNghiep(maSoDoanhNghiep);
	}
	
	public int countByTenDoanhNghiep(String tenDoanhNghiep) {
		return dnDoanhNghiepFinder.countByTenDoanhNghiep(tenDoanhNghiep);
	}
	
	public List<DnDoanhNghiep> findBySDK_TDN_TCD_TT_L(String soDangKy, String tenDoanhNghiep, String tenCongDan, String trangThai, String loaiNguoiLamThuTuc, int start, int end) {
		return dnDoanhNghiepFinder.findBySDK_TDN_TCD_TT_L(soDangKy, tenDoanhNghiep, tenCongDan, trangThai, loaiNguoiLamThuTuc, start, end);
	}
	
	public int countBySDK_TDN_TCD_TT_L(String soDangKy, String tenDoanhNghiep, String tenCongDan, String trangThai, String loaiNguoiLamThuTuc){
		return dnDoanhNghiepFinder.countBySDK_TDN_TCD_TT_L(soDangKy, tenDoanhNghiep, tenCongDan, trangThai, loaiNguoiLamThuTuc);
	}
	
	private static Log _log = LogFactoryUtil.getLog(DnDoanhNghiepLocalServiceImpl.class);
}