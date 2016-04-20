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

package vn.dtt.duongbo.dao.motcua.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy;
import vn.dtt.duongbo.dao.motcua.service.base.MotCuaPhieuXuLyLocalServiceBaseImpl;

/**
 * The implementation of the mot cua phieu xu ly local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.duongbo.dao.motcua.service.MotCuaPhieuXuLyLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.duongbo.dao.motcua.service.base.MotCuaPhieuXuLyLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.motcua.service.MotCuaPhieuXuLyLocalServiceUtil
 */
public class MotCuaPhieuXuLyLocalServiceImpl
	extends MotCuaPhieuXuLyLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.duongbo.dao.motcua.service.MotCuaPhieuXuLyLocalServiceUtil} to access the mot cua phieu xu ly local service.
	 */
	public MotCuaPhieuXuLy findByHoSoThuTucIdAndQuyTrinhThuTucId(long hoSoThuTucId, long quyTrinhThuTucId) {
		try {
			return motCuaPhieuXuLyPersistence.findByHoSoThuTucIdAndQuyTrinhThuTucId(hoSoThuTucId, quyTrinhThuTucId);
		} catch (Exception e) {
		}
		return null;
	}
	
	public List<MotCuaPhieuXuLy> findByHoSoThuTucId(long hoSoThuTucId) {
		try {
			return motCuaPhieuXuLyPersistence.findByHoSoThuTucId(hoSoThuTucId);
		} catch (Exception e) {
		}
		
		return null;
	}
	
	public List<MotCuaPhieuXuLy> findByToChucQuanLyId(long toChucQuanLy) {
		try {
			return motCuaPhieuXuLyPersistence.findByToChucQuanLyId(toChucQuanLy);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new ArrayList<MotCuaPhieuXuLy>();
	}
	
	public List<MotCuaPhieuXuLy> findByToChucQuanLyAndPhanNhomHoSo(long toChucQuanLy, long phanNhomHoSoId) {
		try {
			return motCuaPhieuXuLyPersistence.findByToChucQuanLyAndPhanNhomHoSo(toChucQuanLy, phanNhomHoSoId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<MotCuaPhieuXuLy>();
	}
	
	public List<MotCuaPhieuXuLy> searhMotCuaPhieuXuLy(long thuTucHanhChinhId, String maSoHoSo, String ngayGuiHoSoFrom, String ngayGuiHoSoTo, int start, int end) {
		return motCuaPhieuXuLyFinder.searhMotCuaPhieuXuLy(thuTucHanhChinhId, maSoHoSo, ngayGuiHoSoFrom, ngayGuiHoSoTo, start, end);
	}
	
	
	public int countMotCuaPhieuXuLy(long thuTucHanhChinhId, String maSoHoSo, String ngayGuiHoSoFrom, String ngayGuiHoSoTo) {
		try {
			return motCuaPhieuXuLyFinder.countMotCuaPhieuXuLy(thuTucHanhChinhId, maSoHoSo, ngayGuiHoSoFrom, ngayGuiHoSoTo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int countMotCuaPhieuXuLy(long phanNhomHoSo, long ogrId, String maSoBienNhan, Date nopTuNgay, Date nopDenNgay, Date henTraTuNgay, Date henTraDenNgay, 
			String doanhNghiep, String linhVucThuTucHanhChinh, long idThuTucHanhChinh, long userId, String role) {
		return motCuaPhieuXuLyFinder.countMotCuaPhieuXuLy(phanNhomHoSo, ogrId, maSoBienNhan, nopTuNgay, nopDenNgay, henTraTuNgay, henTraDenNgay, doanhNghiep, linhVucThuTucHanhChinh, idThuTucHanhChinh, userId, role);
	}
	
	public int countMotCuaPhieuXuLyByPhanNhomHoSo(long phanNhomHoSo,
			long ogrId, long userId, String role) throws SystemException {
		return motCuaPhieuXuLyFinder.countMotCuaPhieuXuLyByPhanNhomHoSo(phanNhomHoSo, ogrId, userId, role);
	}
	
	public List<MotCuaPhieuXuLy> findMotCuaPhieuXuLy(long phanNhomHoSo,
			long ogrId, String maSoBienNhan, Date nopTuNgay, Date nopDenNgay, Date henTraTuNgay, Date henTraDenNgay, String doanhNghiep, String linhVucThuTucHanhChinh, long idThuTucHanhChinh, long userId, String role , int start, int end) {
		System.out
				.println("MotCuaPhieuXuLyLocalServiceImpl.findMotCuaPhieuXuLy()");
		return motCuaPhieuXuLyFinder.findMotCuaPhieuXuLy(phanNhomHoSo, ogrId, maSoBienNhan, nopTuNgay, nopDenNgay, henTraTuNgay, henTraDenNgay, doanhNghiep, linhVucThuTucHanhChinh, idThuTucHanhChinh, userId, role, start, end);
	}
	
	public int countMotCuaPhieuXuLyByTrangThai(String trangThaiId) {
		return motCuaPhieuXuLyFinder.countMotCuaPhieuXuLyByTrangThai(trangThaiId);
	}

	public int layHoSoDaXuLyOrDangXuLy(long userId, String trangThai, Date date) {
		return motCuaPhieuXuLyFinder.layHoSoDaXuLyOrDangXuLy(userId, trangThai, date);
	}
	
	public int countMotCuaPhieuXuLyByUserId_TC01(long phanNhomHoSo, long ogrId, String maSoBienNhan, Date nopTuNgay, Date nopDenNgay , Date henTraTuNgay, Date henTraDenNgay, 
			String doanhNghiep, String linhVucThuTucHanhChinh, long idThuTucHanhChinh, long userId) {
		return motCuaPhieuXuLyFinder.countMotCuaPhieuXuLyByUserId_TC01(phanNhomHoSo, ogrId, maSoBienNhan, nopTuNgay, nopDenNgay, henTraTuNgay, henTraDenNgay, doanhNghiep, linhVucThuTucHanhChinh, idThuTucHanhChinh, userId);
	}
	
	public int countMotCuaPhieuXuLyByUserId(long phanNhomHoSo, long ogrId, String maSoBienNhan, Date nopTuNgay, Date nopDenNgay , Date henTraTuNgay, Date henTraDenNgay, 
			String doanhNghiep, String linhVucThuTucHanhChinh, long idThuTucHanhChinh, long userId) {
		return motCuaPhieuXuLyFinder.countMotCuaPhieuXuLyByUserId(phanNhomHoSo, ogrId, maSoBienNhan, nopTuNgay, nopDenNgay, henTraTuNgay, henTraDenNgay, doanhNghiep, linhVucThuTucHanhChinh, idThuTucHanhChinh, userId);
	}
	
	public int countMotCuaPhieuXuLyByUserId2(long phanNhomHoSo, long ogrId, String maSoBienNhan, Date nopTuNgay, Date nopDenNgay , Date henTraTuNgay, Date henTraDenNgay, 
			String doanhNghiep, String linhVucThuTucHanhChinh, long idThuTucHanhChinh, long userId) {
		return motCuaPhieuXuLyFinder.countMotCuaPhieuXuLyByUserId2(phanNhomHoSo, ogrId, maSoBienNhan, nopTuNgay, nopDenNgay, henTraTuNgay, henTraDenNgay, doanhNghiep, linhVucThuTucHanhChinh, idThuTucHanhChinh, userId);
	}
	
	
	public List<MotCuaPhieuXuLy> findMotCuaPhieuXuLyByUserId(long phanNhomHoSo, long ogrId, String maSoBienNhan, Date nopTuNgay, Date nopDenNgay, Date henTraTuNgay, Date henTraDenNgay,  
			String doanhNghiep, String linhVucThuTucHanhChinh, long idThuTucHanhChinh, long userId , int start, int end) {
		return motCuaPhieuXuLyFinder.findMotCuaPhieuXuLyByUserId(phanNhomHoSo, ogrId, maSoBienNhan, nopTuNgay, nopDenNgay, henTraTuNgay, henTraDenNgay, doanhNghiep, linhVucThuTucHanhChinh, idThuTucHanhChinh, userId, start, end);
	}
	
	public List<MotCuaPhieuXuLy> findMotCuaPhieuXuLyByUserId_TC01(long phanNhomHoSo, long ogrId, String maSoBienNhan, Date nopTuNgay, Date nopDenNgay, Date henTraTuNgay, Date henTraDenNgay,  
			String doanhNghiep, String linhVucThuTucHanhChinh, long idThuTucHanhChinh, long userId , int start, int end) {
		return motCuaPhieuXuLyFinder.findMotCuaPhieuXuLyByUserId_TC01(phanNhomHoSo, ogrId, maSoBienNhan, nopTuNgay, nopDenNgay, henTraTuNgay, henTraDenNgay, doanhNghiep, linhVucThuTucHanhChinh, idThuTucHanhChinh, userId, start, end);
	}
	
	public List<MotCuaPhieuXuLy> findMotCuaPhieuXuLyByUserId2(long phanNhomHoSo, long ogrId, String maSoBienNhan, Date nopTuNgay, Date nopDenNgay, Date henTraTuNgay, Date henTraDenNgay,  
			String doanhNghiep, String linhVucThuTucHanhChinh, long idThuTucHanhChinh, long userId , int start, int end) {
		return motCuaPhieuXuLyFinder.findMotCuaPhieuXuLyByUserId2(phanNhomHoSo, ogrId, maSoBienNhan, nopTuNgay, nopDenNgay, henTraTuNgay, henTraDenNgay, doanhNghiep, linhVucThuTucHanhChinh, idThuTucHanhChinh, userId, start, end);
	}
	
	public List<MotCuaPhieuXuLy> findMotCuaPhieuXuLyDoneByOrgid(long ogrId) {
		return motCuaPhieuXuLyFinder.findMotCuaPhieuXuLyDoneByOrgid(ogrId);
	}

	public int countMotCuaPhieuXuLyTrangThai(long phanNhomHoSo, long ogrId, String maSoBienNhan, Date nopTuNgay, Date nopDenNgay , Date henTraTuNgay, Date henTraDenNgay, 
			String doanhNghiep, String linhVucThuTucHanhChinh, long idThuTucHanhChinh, long trangThaiHienTaiId) {
		return motCuaPhieuXuLyFinder.countMotCuaPhieuXuLyTrangThai(phanNhomHoSo, ogrId, maSoBienNhan, nopTuNgay, nopDenNgay, henTraTuNgay, henTraDenNgay, doanhNghiep, linhVucThuTucHanhChinh, idThuTucHanhChinh, trangThaiHienTaiId);
	}
	
	public List<MotCuaPhieuXuLy> findMotCuaPhieuXuLyTrangThai(long phanNhomHoSo, long ogrId, String maSoBienNhan, Date nopTuNgay, Date nopDenNgay, Date henTraTuNgay, Date henTraDenNgay,  
			String doanhNghiep, String linhVucThuTucHanhChinh, long idThuTucHanhChinh , long trangThaiHienTaiId, int start, int end) {
		return motCuaPhieuXuLyFinder.findMotCuaPhieuXuLyTrangThai(phanNhomHoSo, ogrId, maSoBienNhan, nopTuNgay, nopDenNgay, henTraTuNgay, henTraDenNgay, doanhNghiep, linhVucThuTucHanhChinh, idThuTucHanhChinh, trangThaiHienTaiId, start, end);
	}
	
	public int countMotCuaPhieuXuLyByTrangThaiAndUserId(long ogrId, Date nopTuNgay, Date nopDenNgay, long idThuTucHanhChinh, long userId, String trangThaiIds) {
		return motCuaPhieuXuLyFinder.countMotCuaPhieuXuLyByTrangThaiAndUserId(ogrId, nopTuNgay, nopDenNgay, idThuTucHanhChinh, userId, trangThaiIds);
	}
	
	public int countMotCuaPhieuXuLyByTrangThaiAndUserId2(long ogrId, Date nopTuNgay, Date nopDenNgay, long idThuTucHanhChinh, long userId, String trangThaiIds) {
		return motCuaPhieuXuLyFinder.countMotCuaPhieuXuLyByTrangThaiAndUserId2(ogrId, nopTuNgay, nopDenNgay, idThuTucHanhChinh, userId, trangThaiIds);
	}
	
	public List<Object> getMotCuaPhieuXuLyByTrangThaiAndUserId(long ogrId, Date nopTuNgay, Date nopDenNgay, long idThuTucHanhChinh, long userId, String trangThaiIds) {
		return motCuaPhieuXuLyFinder.getMotCuaPhieuXuLyByTrangThaiAndUserId(ogrId, nopTuNgay, nopDenNgay, idThuTucHanhChinh, userId, trangThaiIds);
	}
	
	public List<Object> getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc(long ogrId, Date nopTuNgay, Date nopDenNgay, long idThuTucHanhChinh, long userId, String trangThaiIds) {
		return motCuaPhieuXuLyFinder.getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc(ogrId, nopTuNgay, nopDenNgay, idThuTucHanhChinh, userId, trangThaiIds);
	}
	
	public List<Object> getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc2(long ogrId, Date nopTuNgay, Date nopDenNgay, long idThuTucHanhChinh, long userId, String trangThaiIds) {
		return motCuaPhieuXuLyFinder.getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc2(ogrId, nopTuNgay, nopDenNgay, idThuTucHanhChinh, userId, trangThaiIds);
	}
	
	public List<Object> getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc3(long ogrId, Date nopTuNgay, Date nopDenNgay, long idThuTucHanhChinh, long userId, String trangThaiIds) {
		return motCuaPhieuXuLyFinder.getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc3(ogrId, nopTuNgay, nopDenNgay, idThuTucHanhChinh, userId, trangThaiIds);
	}
	
	public List<Object> getMotCuaPhieuXuLyByOrgs(long ogrId) {
		return motCuaPhieuXuLyFinder.getMotCuaPhieuXuLyByOrgs(ogrId);
	}
	
	public List<Object> getMotCuaPhieuXuLyByOrgs2(long ogrId) {
		return motCuaPhieuXuLyFinder.getMotCuaPhieuXuLyByOrgs2(ogrId);
	}
	
	public List<Object> getMotCuaPhieuXuLyVanThuByOrgs(long ogrId) {
		return motCuaPhieuXuLyFinder.getMotCuaPhieuXuLyVanThuByOrgs(ogrId);
	}
	
	public int countMotCuaPhieuXuLyByTrangThaiVanThu(long ogrId, long idThuTucHanhChinh, String trangThaiIds) {
		return motCuaPhieuXuLyFinder.countMotCuaPhieuXuLyByTrangThaiVanThu(ogrId, idThuTucHanhChinh, trangThaiIds);
	}
	public List<MotCuaPhieuXuLy> findMotCuaPhieuXuLy_NEW(List<String> lstPar, int start, int end){
		return motCuaPhieuXuLyFinder.findMotCuaPhieuXuLy_NEW(lstPar, start, end);
	}
	public int countMotCuaPhieuXuLy_NEW(List<String> lstCount){
		return motCuaPhieuXuLyFinder.countMotCuaPhieuXuLy_NEW(lstCount);
	}
}