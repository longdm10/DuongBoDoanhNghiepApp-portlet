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

package vn.dtt.duongbo.dao.thanhtoan.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan;
import vn.dtt.duongbo.dao.thanhtoan.service.base.TthcXacNhanThanhToanLocalServiceBaseImpl;

/**
 * The implementation of the tthc xac nhan thanh toan local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.duongbo.dao.thanhtoan.service.TthcXacNhanThanhToanLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.duongbo.dao.thanhtoan.service.base.TthcXacNhanThanhToanLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.thanhtoan.service.TthcXacNhanThanhToanLocalServiceUtil
 */
public class TthcXacNhanThanhToanLocalServiceImpl
	extends TthcXacNhanThanhToanLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.duongbo.dao.thanhtoan.service.TthcXacNhanThanhToanLocalServiceUtil} to access the tthc xac nhan thanh toan local service.
	 */
	
	public List<TthcXacNhanThanhToan> findAll() {
		try {
			return tthcXacNhanThanhToanPersistence.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new ArrayList<TthcXacNhanThanhToan>();
	}
	
	public List<TthcXacNhanThanhToan> findByToChucQuanLy(long toChucQuanLy){
		try{
			return tthcXacNhanThanhToanPersistence.findByToChucQuanLy(toChucQuanLy);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return new ArrayList<TthcXacNhanThanhToan>();
	}
	
	public TthcXacNhanThanhToan findByMaTuSinh(String maTuSinh){
		try{
			return tthcXacNhanThanhToanFinder.findByMaTuSinh(maTuSinh);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<TthcXacNhanThanhToan> findByTrangThaiXacNhanAndToChucQuanLy(long toChucQuanLy, String trangThai, int start, int end) {
		try{
			return tthcXacNhanThanhToanFinder.findByTrangThaiXacNhanAndToChucQuanLy(toChucQuanLy, trangThai, start, end);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<TthcXacNhanThanhToan>();
	}

	public List<TthcXacNhanThanhToan> findTthcXacNhanThanhToan(String maGiaoDich,String loaiGiaoDich, String hinhThucThanhToan, long toChucQuanLy, String trangThai, String trangThaiSearch, Date tuNgay, Date denNGay, String tenDoanhNGhiep, int year, int start, int end) {
		try{
			return tthcXacNhanThanhToanFinder.findTthcXacNhanThanhToan(maGiaoDich,loaiGiaoDich, hinhThucThanhToan, toChucQuanLy, trangThai, trangThaiSearch, tuNgay, denNGay, tenDoanhNGhiep, year, start, end);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<TthcXacNhanThanhToan>();
	}
	
	public int countTthcXacNhanThanhToan(String maGiaoDich,String loaiGiaoDich, String hinhThucThanhToan, long toChucQuanLy, String trangThai, String trangThaiSearch, Date tuNgay, Date denNGay, String tenDoanhNGhiep, int year) {
		return tthcXacNhanThanhToanFinder.countTthcXacNhanThanhToan(maGiaoDich,loaiGiaoDich, hinhThucThanhToan, toChucQuanLy, trangThai, trangThaiSearch, tuNgay, denNGay, tenDoanhNGhiep, year);
	}
	
	public int countByTrangThaiXacNhanAndToChucQuanLy(long toChucQuanLy, String trangThai) {
		try{
			return tthcXacNhanThanhToanFinder.countByTrangThaiXacNhanAndToChucQuanLy(toChucQuanLy, trangThai);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	public int sumTienByTrangThaiXacNhanAndToChucQuanLy(int hinhthucthanhtoan, String loaiPhi, int trangThai, long tochucquanly, Date ngayGiaoDichTu, Date ngayGiaoDichDen) {
		return tthcXacNhanThanhToanFinder.sumTienByTrangThaiXacNhanAndToChucQuanLy(hinhthucthanhtoan, loaiPhi, trangThai, tochucquanly, ngayGiaoDichTu, ngayGiaoDichDen);
	}
	
	public int countSoHoSoByTrangThaiXacNhanAndToChucQuanLy(int hinhthucthanhtoan, String loaiPhi, int trangThai, long tochucquanly, Date ngayGiaoDichTu, Date ngayGiaoDichDen) {
		return tthcXacNhanThanhToanFinder.countSoHoSoByTrangThaiXacNhanAndToChucQuanLy(hinhthucthanhtoan, loaiPhi, trangThai, tochucquanly, ngayGiaoDichTu, ngayGiaoDichDen);
	}
	
	}
	
	