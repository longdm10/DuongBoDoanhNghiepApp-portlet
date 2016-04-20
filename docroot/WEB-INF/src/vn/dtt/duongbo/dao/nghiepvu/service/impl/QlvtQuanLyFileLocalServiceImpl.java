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

package vn.dtt.duongbo.dao.nghiepvu.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile;
import vn.dtt.duongbo.dao.nghiepvu.service.base.QlvtQuanLyFileLocalServiceBaseImpl;

/**
 * The implementation of the qlvt quan ly file local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.duongbo.dao.nghiepvu.service.QlvtQuanLyFileLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author NhanNc
 * @see vn.dtt.duongbo.dao.nghiepvu.service.base.QlvtQuanLyFileLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.nghiepvu.service.QlvtQuanLyFileLocalServiceUtil
 */
public class QlvtQuanLyFileLocalServiceImpl extends QlvtQuanLyFileLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.duongbo.dao.nghiepvu.service.QlvtQuanLyFileLocalServiceUtil} to access the qlvt quan ly file local service.
	 */
	
	public QlvtQuanLyFile updateQuanLyFile(long userId, long doanhNghiepId, String tenFile, long loaiFile,
			String thongTinFile, long fileId, int trangThai,
			String mieuTaFile) throws SystemException {
		
		QlvtQuanLyFile quanLyFile = qlvtQuanLyFilePersistence.fetchByIdFile(fileId);
		
		Date now = new Date();
		
		if(quanLyFile == null) {
			fileId = counterLocalService.increment(QlvtQuanLyFile.class.getName());
			quanLyFile = qlvtQuanLyFilePersistence.create(fileId);
			quanLyFile.setNgayTai(now);
			quanLyFile.setNgayCap(now);
		}
		
		quanLyFile.setTenFile(tenFile);
		quanLyFile.setLoaiFile(loaiFile);
		quanLyFile.setThongTinFile(thongTinFile);
		quanLyFile.setIdFile(fileId);
		quanLyFile.setDoanhNghiepId(doanhNghiepId);
		quanLyFile.setTaiKhoan(userId);
		quanLyFile.setMieuTa(mieuTaFile);
		
		qlvtQuanLyFilePersistence.update(quanLyFile);
		
		return quanLyFile;
	}
	
	public QlvtQuanLyFile findByIdFile(long idFile) {
		try {
			
			return qlvtQuanLyFilePersistence.findByIdFile(idFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	public QlvtQuanLyFile findByIdFileAndDoanhNghiepID(long idFile,long doanhNghiepId) {
		try {
			return qlvtQuanLyFilePersistence.findByIdFileAndDoanhNghiepID(idFile, doanhNghiepId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	
	public List<QlvtQuanLyFile> findByDoanhNghiepId(long doanhNghiepId) {
		try {
			return qlvtQuanLyFilePersistence.findByDoanhNghiepId(doanhNghiepId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public List<QlvtQuanLyFile> searchQuanLyFile(long doanhNghiepId, long loaiFile,String trangThai,String tenGiayTo,Date fromNgayCP, Date toNgayCP,Date fromNgayHH, Date toNgayHH,Date fromNgayTai, Date toNgayTai, int start, int end) {
		try {
			return qlvtQuanLyFileFinder.searchQuanLyFile(doanhNghiepId, loaiFile, trangThai, tenGiayTo, fromNgayCP, toNgayCP, fromNgayHH, toNgayHH,fromNgayTai,toNgayTai, start, end);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public int countQuanLyFile(long doanhNghiepId, long loaiFile,String trangThai,String tenGiayTo,Date fromNgayCP, Date toNgayCP,Date fromNgayHH, Date toNgayHH,Date fromNgayTai, Date toNgayTai) {
		try {
			return qlvtQuanLyFileFinder.countQuanLyFile(doanhNghiepId, loaiFile, trangThai, tenGiayTo, fromNgayCP, toNgayCP, fromNgayHH, toNgayHH,fromNgayTai,toNgayTai);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
}