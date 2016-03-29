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

package vn.dtt.duongbo.dao.common.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;

import vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.duongbo.dao.common.service.base.TthcHoSoThuTucLocalServiceBaseImpl;
import vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep;
import vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepLocalServiceUtil;

/**
 * The implementation of the tthc ho so thu tuc local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.duongbo.dao.common.service.base.TthcHoSoThuTucLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil
 */
public class TthcHoSoThuTucLocalServiceImpl extends TthcHoSoThuTucLocalServiceBaseImpl {
	public TthcHoSoThuTuc updateHoSoThuTuc(long userId, long nguoiLamThuTucId,
			long hoSoThuTucId, long thuTucHanhChinhId, long thanhPhanHoSoId,
			long bieuMauHoSoId, String trangThaiHoSoThuTuc, long phanNhomHoSoId,
			long organizationId, String noiDungXML, int trangThaiNoiDungHoSo)
		throws PortalException, SystemException {
		
		DnDoanhNghiep nguoiLamThuTuc = DnDoanhNghiepLocalServiceUtil.getDnDoanhNghiep(nguoiLamThuTucId);
		
		TthcHoSoThuTuc hoSoThuTuc = null;
		
		Date now = new Date();
		
		if(hoSoThuTucId > 0){
			hoSoThuTuc = tthcHoSoThuTucPersistence.findByPrimaryKey(hoSoThuTucId);
		} else {
			hoSoThuTucId = counterLocalService.increment(TthcHoSoThuTuc.class.getName());
			
			hoSoThuTuc = tthcHoSoThuTucPersistence.create(hoSoThuTucId);
			hoSoThuTuc.setNguoiTao(userId);
			hoSoThuTuc.setNgayTao(now);
		}
		
		hoSoThuTuc.setMaSoHoSo(String.valueOf(hoSoThuTucId));
		hoSoThuTuc.setNguoiLamThuTucId(nguoiLamThuTucId);
		hoSoThuTuc.setThuTucHanhChinhId(thuTucHanhChinhId);
		hoSoThuTuc.setTrangThaiHoSo(trangThaiHoSoThuTuc);
		hoSoThuTuc.setPhanNhomHoSoId(phanNhomHoSoId);
		hoSoThuTuc.setNgayGuiHoSo(now);
		hoSoThuTuc.setToChucQuanLy(organizationId);
		
		hoSoThuTuc.setMaSoChuHoSo(nguoiLamThuTuc.getMaSoDoanhNghiep());
		hoSoThuTuc.setMaTinhThanh(nguoiLamThuTuc.getMaTinhThanh());
		hoSoThuTuc.setMaQuanHuyen(nguoiLamThuTuc.getMaQuanHuyen());
		hoSoThuTuc.setMaPhuongXa(nguoiLamThuTuc.getMaPhuongXa());
		hoSoThuTuc.setTenChuHoSo(nguoiLamThuTuc.getTenDoanhNghiep());
		hoSoThuTuc.setDiaChiChuHoSo(nguoiLamThuTuc.getDiaChi());
		
		tthcNoidungHoSoLocalService.updateNoiDungHoSo(userId, hoSoThuTucId,
			thanhPhanHoSoId, StringPool.BLANK, 0, noiDungXML, 0, trangThaiNoiDungHoSo);
		
		tthcHoSoThuTucPersistence.update(hoSoThuTuc);
		
		return hoSoThuTuc;
	}
	
	public TthcHoSoThuTuc findByMaSoHoSo(String maSoHoSo){
		try {
			return tthcHoSoThuTucPersistence.findByMaSoHoSo(maSoHoSo);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public List<TthcHoSoThuTuc> getByNguoiLamThuTucId(long nguoiLamThuTucId){
		try {
			return tthcHoSoThuTucPersistence.findByNguoiLamThuTucId(nguoiLamThuTucId);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<TthcHoSoThuTuc>();
	}
	
	public List<TthcHoSoThuTuc> getByNguoiLamThuTucIdAndThuTucHanhChinhId(long nguoiLamThuTucId, long thuTucHanhChinhId){
		try {
			return tthcHoSoThuTucPersistence.findByNguoiLamThuTucIdAndThuTucHanhChinhId(nguoiLamThuTucId, thuTucHanhChinhId);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<TthcHoSoThuTuc>();
	}
	
	public List<TthcHoSoThuTuc> findByNguoiTaoAndThuTucHanhChinhId(long nguoiTao, long thuTucHanhChinhId){
		try {
			return tthcHoSoThuTucPersistence.findByNguoiTaoAndThuTucHanhChinhId(nguoiTao, thuTucHanhChinhId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<TthcHoSoThuTuc>();
	}
	
	public List<TthcHoSoThuTuc> searchQuanLyHoSo(String maBienNhan, String thuTucHanhChinhId, long userLoginId, long phanNhomHoSoId, int start, int end) {
		try {
			return tthcHoSoThuTucFinder.searchQuanLyHoSo(maBienNhan, thuTucHanhChinhId, userLoginId, phanNhomHoSoId, start, end);
		} catch (SystemException e) {
			_log.error(e);
		}
		return new ArrayList<TthcHoSoThuTuc>();
	}
	
	public List<TthcHoSoThuTuc> findHoSoByNguoiLamThuTucIdAndMaTrangThai(long nguoiLamThuTucId, String maTrangThai) {
		try {
			return tthcHoSoThuTucFinder.findHoSoByNguoiLamThuTucIdAndMaTrangThai(nguoiLamThuTucId, maTrangThai);
		} catch (SystemException e) {
			_log.error(e);
		}
		return null;
	}
	
	public int countQuanLyHoSo(String maBienNhan, String thuTucHanhChinhId, long userLoginId, long phanNhomHoSoId) {
		try {
			return tthcHoSoThuTucFinder.countQuanLyHoSo(maBienNhan, thuTucHanhChinhId, userLoginId, phanNhomHoSoId);
		} catch (SystemException e) {
			_log.error(e);
		}
		return 0;
	}
	
	public int countByGroupMaTrangThaiDoanhNghiepAndNguoiLamThuTucId(String groupMaTrangThaiDoanhNghiep, long nguoiLamThuTucId) {
		try {
			return tthcHoSoThuTucFinder.countByGroupMaTrangThaiDoanhNghiepAndNguoiLamThuTucId(groupMaTrangThaiDoanhNghiep, nguoiLamThuTucId);
		} catch (SystemException e) {
			_log.error(e);
		}
		return 0;
	}
	
	
	public List<TthcHoSoThuTuc> searchQuanLyHoSoInPhanNhomGroup(String maBienNhan, String thuTucHanhChinhId, long userLoginId, String groupPhanNhomHoSoId, int start, int end) {
		try {
			return tthcHoSoThuTucFinder.searchQuanLyHoSoInPhanNhomGroup(maBienNhan, thuTucHanhChinhId, userLoginId, groupPhanNhomHoSoId, start, end);
		} catch (SystemException e) {
			_log.error(e);
		}
		return new ArrayList<TthcHoSoThuTuc>();
	}
	
	public int countQuanLyHoSoInPhanNhomGroup(String maBienNhan, String thuTucHanhChinhId, long userLoginId, String groupPhanNhomHoSoId) {
		try {
			return tthcHoSoThuTucFinder.countQuanLyHoSoInPhanNhomGroup(maBienNhan, thuTucHanhChinhId, userLoginId, groupPhanNhomHoSoId);
		} catch (SystemException e) {
			_log.error(e);
		}
		return 0;
	}
	
	public List<TthcHoSoThuTuc> searchQuanLyHoSoInPhanNhomHoSoDoanhNghiep(String linhVucThuTuc,String maBienNhan, String thuTucHanhChinhId, long userLoginId, String groupTrangThaiDoanhNghiepCode, int start, int end) {
		try {
			return tthcHoSoThuTucFinder.searchQuanLyHoSoInPhanNhomHoSoDoanhNghiep(linhVucThuTuc,maBienNhan, thuTucHanhChinhId, userLoginId, groupTrangThaiDoanhNghiepCode, start, end);
		} catch (SystemException e) {
			_log.error(e);
		}
		return new ArrayList<TthcHoSoThuTuc>();
	}
	
	public int countQuanLyHoSoInPhanNhomHoSoDoanhNghiep(String linhVucThuTuc,String maBienNhan, String thuTucHanhChinhId, long userLoginId, String groupTrangThaiDoanhNghiepCode) {
		try {
			return tthcHoSoThuTucFinder.countQuanLyHoSoInPhanNhomHoSoDoanhNghiep(linhVucThuTuc,maBienNhan, thuTucHanhChinhId, userLoginId, groupTrangThaiDoanhNghiepCode);
		} catch (SystemException e) {
			_log.error(e);
		}
		return 0;
	}
	
	public int countHoSoThuTucByPhanNhomHoSoIdAndNguoiLamThuTucId(long phanNhomHoSoId, long nguoiLamThuTucId) {
		try {
			return tthcHoSoThuTucFinder.countHoSoThuTucByPhanNhomHoSoIdAndNguoiLamThuTucId(phanNhomHoSoId, nguoiLamThuTucId);
		} catch (SystemException e) {
			_log.error(e);
		}
		return 0;
	}
	
	public int countByPhanNhomHoSoIdGroupAndNguoiLamThuTucId(String phanNhomHoSoIdGroup, long nguoiLamThuTucId) {
		try {
			return tthcHoSoThuTucFinder.countByPhanNhomHoSoIdGroupAndNguoiLamThuTucId(phanNhomHoSoIdGroup, nguoiLamThuTucId);
		} catch (SystemException e) {
			_log.error(e);
		}
		return 0;
	}
	
	public List<TthcHoSoThuTuc> findByUserAndThuTucHanhChinhId(long userLoginId, long thuTucHanhChinhId) {
		try {
			return tthcHoSoThuTucPersistence.findByNguoiTaoAndThuTucHanhChinhId(userLoginId, thuTucHanhChinhId);
		} catch (SystemException e) {
			_log.error(e);
		}
		return new ArrayList<TthcHoSoThuTuc>();
	}
	
	public String maxMaBienNhan(Date date) {
		return tthcHoSoThuTucFinder.maxMaBienNhan(date);
	}
	
	public String maxMaSoHoSo(String soDangKyKinhDoanh) {
		return tthcHoSoThuTucFinder.maxMaSoHoSo(soDangKyKinhDoanh);
	}
	
	public int countHoSoThuTucByTrangThai(String trangThaiId) {
		return tthcHoSoThuTucFinder.countHoSoThuTucByTrangThai(trangThaiId);
	}
	
	private static Log _log = LogFactoryUtil.getLog(TthcHoSoThuTucLocalServiceImpl.class.getName());
}