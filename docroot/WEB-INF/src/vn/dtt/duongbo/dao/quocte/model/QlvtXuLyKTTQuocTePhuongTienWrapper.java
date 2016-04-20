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

package vn.dtt.duongbo.dao.quocte.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link QlvtXuLyKTTQuocTePhuongTien}.
 * </p>
 *
 * @author NoiPham
 * @see QlvtXuLyKTTQuocTePhuongTien
 * @generated
 */
public class QlvtXuLyKTTQuocTePhuongTienWrapper
	implements QlvtXuLyKTTQuocTePhuongTien,
		ModelWrapper<QlvtXuLyKTTQuocTePhuongTien> {
	public QlvtXuLyKTTQuocTePhuongTienWrapper(
		QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien) {
		_qlvtXuLyKTTQuocTePhuongTien = qlvtXuLyKTTQuocTePhuongTien;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtXuLyKTTQuocTePhuongTien.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtXuLyKTTQuocTePhuongTien.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("kttQuocTeID", getKttQuocTeID());
		attributes.put("bienSo", getBienSo());
		attributes.put("trongTai", getTrongTai());
		attributes.put("namSx", getNamSx());
		attributes.put("nhanHieu", getNhanHieu());
		attributes.put("soKhung", getSoKhung());
		attributes.put("soMay", getSoMay());
		attributes.put("cuaKhau", getCuaKhau());
		attributes.put("maCuaKhau", getMaCuaKhau());
		attributes.put("hinhThucSoHuu", getHinhThucSoHuu());
		attributes.put("doanhNghiepChoThue", getDoanhNghiepChoThue());
		attributes.put("thoiHanChoThue", getThoiHanChoThue());
		attributes.put("hopDongSauCung", getHopDongSauCung());
		attributes.put("thoiGianNhapCanh", getThoiGianNhapCanh());
		attributes.put("thoiGianKhoiHanh", getThoiGianKhoiHanh());
		attributes.put("xinCapPhepTuNgay", getXinCapPhepTuNgay());
		attributes.put("xinCapPhepDenNgay", getXinCapPhepDenNgay());
		attributes.put("hinhThucHoatDong", getHinhThucHoatDong());
		attributes.put("loaiHinhGiaHan", getLoaiHinhGiaHan());
		attributes.put("ketQuaXuLy", getKetQuaXuLy());
		attributes.put("lyDoKhongDat", getLyDoKhongDat());
		attributes.put("capPhepKTTQuocTeID", getCapPhepKTTQuocTeID());
		attributes.put("loaiGiayPhep", getLoaiGiayPhep());
		attributes.put("soChoNgoi", getSoChoNgoi());
		attributes.put("tenDangKySoHuu", getTenDangKySoHuu());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long kttQuocTeID = (Long)attributes.get("kttQuocTeID");

		if (kttQuocTeID != null) {
			setKttQuocTeID(kttQuocTeID);
		}

		String bienSo = (String)attributes.get("bienSo");

		if (bienSo != null) {
			setBienSo(bienSo);
		}

		Integer trongTai = (Integer)attributes.get("trongTai");

		if (trongTai != null) {
			setTrongTai(trongTai);
		}

		Integer namSx = (Integer)attributes.get("namSx");

		if (namSx != null) {
			setNamSx(namSx);
		}

		String nhanHieu = (String)attributes.get("nhanHieu");

		if (nhanHieu != null) {
			setNhanHieu(nhanHieu);
		}

		String soKhung = (String)attributes.get("soKhung");

		if (soKhung != null) {
			setSoKhung(soKhung);
		}

		String soMay = (String)attributes.get("soMay");

		if (soMay != null) {
			setSoMay(soMay);
		}

		String cuaKhau = (String)attributes.get("cuaKhau");

		if (cuaKhau != null) {
			setCuaKhau(cuaKhau);
		}

		String maCuaKhau = (String)attributes.get("maCuaKhau");

		if (maCuaKhau != null) {
			setMaCuaKhau(maCuaKhau);
		}

		String hinhThucSoHuu = (String)attributes.get("hinhThucSoHuu");

		if (hinhThucSoHuu != null) {
			setHinhThucSoHuu(hinhThucSoHuu);
		}

		String doanhNghiepChoThue = (String)attributes.get("doanhNghiepChoThue");

		if (doanhNghiepChoThue != null) {
			setDoanhNghiepChoThue(doanhNghiepChoThue);
		}

		Date thoiHanChoThue = (Date)attributes.get("thoiHanChoThue");

		if (thoiHanChoThue != null) {
			setThoiHanChoThue(thoiHanChoThue);
		}

		Long hopDongSauCung = (Long)attributes.get("hopDongSauCung");

		if (hopDongSauCung != null) {
			setHopDongSauCung(hopDongSauCung);
		}

		Date thoiGianNhapCanh = (Date)attributes.get("thoiGianNhapCanh");

		if (thoiGianNhapCanh != null) {
			setThoiGianNhapCanh(thoiGianNhapCanh);
		}

		Date thoiGianKhoiHanh = (Date)attributes.get("thoiGianKhoiHanh");

		if (thoiGianKhoiHanh != null) {
			setThoiGianKhoiHanh(thoiGianKhoiHanh);
		}

		Date xinCapPhepTuNgay = (Date)attributes.get("xinCapPhepTuNgay");

		if (xinCapPhepTuNgay != null) {
			setXinCapPhepTuNgay(xinCapPhepTuNgay);
		}

		Date xinCapPhepDenNgay = (Date)attributes.get("xinCapPhepDenNgay");

		if (xinCapPhepDenNgay != null) {
			setXinCapPhepDenNgay(xinCapPhepDenNgay);
		}

		String hinhThucHoatDong = (String)attributes.get("hinhThucHoatDong");

		if (hinhThucHoatDong != null) {
			setHinhThucHoatDong(hinhThucHoatDong);
		}

		String loaiHinhGiaHan = (String)attributes.get("loaiHinhGiaHan");

		if (loaiHinhGiaHan != null) {
			setLoaiHinhGiaHan(loaiHinhGiaHan);
		}

		String ketQuaXuLy = (String)attributes.get("ketQuaXuLy");

		if (ketQuaXuLy != null) {
			setKetQuaXuLy(ketQuaXuLy);
		}

		String lyDoKhongDat = (String)attributes.get("lyDoKhongDat");

		if (lyDoKhongDat != null) {
			setLyDoKhongDat(lyDoKhongDat);
		}

		Long capPhepKTTQuocTeID = (Long)attributes.get("capPhepKTTQuocTeID");

		if (capPhepKTTQuocTeID != null) {
			setCapPhepKTTQuocTeID(capPhepKTTQuocTeID);
		}

		String loaiGiayPhep = (String)attributes.get("loaiGiayPhep");

		if (loaiGiayPhep != null) {
			setLoaiGiayPhep(loaiGiayPhep);
		}

		Integer soChoNgoi = (Integer)attributes.get("soChoNgoi");

		if (soChoNgoi != null) {
			setSoChoNgoi(soChoNgoi);
		}

		String tenDangKySoHuu = (String)attributes.get("tenDangKySoHuu");

		if (tenDangKySoHuu != null) {
			setTenDangKySoHuu(tenDangKySoHuu);
		}
	}

	/**
	* Returns the primary key of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @return the primary key of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtXuLyKTTQuocTePhuongTien.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @param primaryKey the primary key of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtXuLyKTTQuocTePhuongTien.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @return the ID of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public long getId() {
		return _qlvtXuLyKTTQuocTePhuongTien.getId();
	}

	/**
	* Sets the ID of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @param id the ID of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public void setId(long id) {
		_qlvtXuLyKTTQuocTePhuongTien.setId(id);
	}

	/**
	* Returns the ktt quoc te i d of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @return the ktt quoc te i d of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public long getKttQuocTeID() {
		return _qlvtXuLyKTTQuocTePhuongTien.getKttQuocTeID();
	}

	/**
	* Sets the ktt quoc te i d of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @param kttQuocTeID the ktt quoc te i d of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public void setKttQuocTeID(long kttQuocTeID) {
		_qlvtXuLyKTTQuocTePhuongTien.setKttQuocTeID(kttQuocTeID);
	}

	/**
	* Returns the bien so of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @return the bien so of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public java.lang.String getBienSo() {
		return _qlvtXuLyKTTQuocTePhuongTien.getBienSo();
	}

	/**
	* Sets the bien so of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @param bienSo the bien so of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public void setBienSo(java.lang.String bienSo) {
		_qlvtXuLyKTTQuocTePhuongTien.setBienSo(bienSo);
	}

	/**
	* Returns the trong tai of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @return the trong tai of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public int getTrongTai() {
		return _qlvtXuLyKTTQuocTePhuongTien.getTrongTai();
	}

	/**
	* Sets the trong tai of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @param trongTai the trong tai of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public void setTrongTai(int trongTai) {
		_qlvtXuLyKTTQuocTePhuongTien.setTrongTai(trongTai);
	}

	/**
	* Returns the nam sx of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @return the nam sx of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public int getNamSx() {
		return _qlvtXuLyKTTQuocTePhuongTien.getNamSx();
	}

	/**
	* Sets the nam sx of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @param namSx the nam sx of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public void setNamSx(int namSx) {
		_qlvtXuLyKTTQuocTePhuongTien.setNamSx(namSx);
	}

	/**
	* Returns the nhan hieu of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @return the nhan hieu of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public java.lang.String getNhanHieu() {
		return _qlvtXuLyKTTQuocTePhuongTien.getNhanHieu();
	}

	/**
	* Sets the nhan hieu of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @param nhanHieu the nhan hieu of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public void setNhanHieu(java.lang.String nhanHieu) {
		_qlvtXuLyKTTQuocTePhuongTien.setNhanHieu(nhanHieu);
	}

	/**
	* Returns the so khung of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @return the so khung of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public java.lang.String getSoKhung() {
		return _qlvtXuLyKTTQuocTePhuongTien.getSoKhung();
	}

	/**
	* Sets the so khung of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @param soKhung the so khung of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public void setSoKhung(java.lang.String soKhung) {
		_qlvtXuLyKTTQuocTePhuongTien.setSoKhung(soKhung);
	}

	/**
	* Returns the so may of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @return the so may of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public java.lang.String getSoMay() {
		return _qlvtXuLyKTTQuocTePhuongTien.getSoMay();
	}

	/**
	* Sets the so may of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @param soMay the so may of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public void setSoMay(java.lang.String soMay) {
		_qlvtXuLyKTTQuocTePhuongTien.setSoMay(soMay);
	}

	/**
	* Returns the cua khau of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @return the cua khau of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public java.lang.String getCuaKhau() {
		return _qlvtXuLyKTTQuocTePhuongTien.getCuaKhau();
	}

	/**
	* Sets the cua khau of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @param cuaKhau the cua khau of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public void setCuaKhau(java.lang.String cuaKhau) {
		_qlvtXuLyKTTQuocTePhuongTien.setCuaKhau(cuaKhau);
	}

	/**
	* Returns the ma cua khau of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @return the ma cua khau of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public java.lang.String getMaCuaKhau() {
		return _qlvtXuLyKTTQuocTePhuongTien.getMaCuaKhau();
	}

	/**
	* Sets the ma cua khau of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @param maCuaKhau the ma cua khau of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public void setMaCuaKhau(java.lang.String maCuaKhau) {
		_qlvtXuLyKTTQuocTePhuongTien.setMaCuaKhau(maCuaKhau);
	}

	/**
	* Returns the hinh thuc so huu of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @return the hinh thuc so huu of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public java.lang.String getHinhThucSoHuu() {
		return _qlvtXuLyKTTQuocTePhuongTien.getHinhThucSoHuu();
	}

	/**
	* Sets the hinh thuc so huu of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @param hinhThucSoHuu the hinh thuc so huu of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public void setHinhThucSoHuu(java.lang.String hinhThucSoHuu) {
		_qlvtXuLyKTTQuocTePhuongTien.setHinhThucSoHuu(hinhThucSoHuu);
	}

	/**
	* Returns the doanh nghiep cho thue of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @return the doanh nghiep cho thue of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public java.lang.String getDoanhNghiepChoThue() {
		return _qlvtXuLyKTTQuocTePhuongTien.getDoanhNghiepChoThue();
	}

	/**
	* Sets the doanh nghiep cho thue of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @param doanhNghiepChoThue the doanh nghiep cho thue of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public void setDoanhNghiepChoThue(java.lang.String doanhNghiepChoThue) {
		_qlvtXuLyKTTQuocTePhuongTien.setDoanhNghiepChoThue(doanhNghiepChoThue);
	}

	/**
	* Returns the thoi han cho thue of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @return the thoi han cho thue of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public java.util.Date getThoiHanChoThue() {
		return _qlvtXuLyKTTQuocTePhuongTien.getThoiHanChoThue();
	}

	/**
	* Sets the thoi han cho thue of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @param thoiHanChoThue the thoi han cho thue of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public void setThoiHanChoThue(java.util.Date thoiHanChoThue) {
		_qlvtXuLyKTTQuocTePhuongTien.setThoiHanChoThue(thoiHanChoThue);
	}

	/**
	* Returns the hop dong sau cung of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @return the hop dong sau cung of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public long getHopDongSauCung() {
		return _qlvtXuLyKTTQuocTePhuongTien.getHopDongSauCung();
	}

	/**
	* Sets the hop dong sau cung of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @param hopDongSauCung the hop dong sau cung of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public void setHopDongSauCung(long hopDongSauCung) {
		_qlvtXuLyKTTQuocTePhuongTien.setHopDongSauCung(hopDongSauCung);
	}

	/**
	* Returns the thoi gian nhap canh of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @return the thoi gian nhap canh of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public java.util.Date getThoiGianNhapCanh() {
		return _qlvtXuLyKTTQuocTePhuongTien.getThoiGianNhapCanh();
	}

	/**
	* Sets the thoi gian nhap canh of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @param thoiGianNhapCanh the thoi gian nhap canh of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public void setThoiGianNhapCanh(java.util.Date thoiGianNhapCanh) {
		_qlvtXuLyKTTQuocTePhuongTien.setThoiGianNhapCanh(thoiGianNhapCanh);
	}

	/**
	* Returns the thoi gian khoi hanh of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @return the thoi gian khoi hanh of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public java.util.Date getThoiGianKhoiHanh() {
		return _qlvtXuLyKTTQuocTePhuongTien.getThoiGianKhoiHanh();
	}

	/**
	* Sets the thoi gian khoi hanh of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @param thoiGianKhoiHanh the thoi gian khoi hanh of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public void setThoiGianKhoiHanh(java.util.Date thoiGianKhoiHanh) {
		_qlvtXuLyKTTQuocTePhuongTien.setThoiGianKhoiHanh(thoiGianKhoiHanh);
	}

	/**
	* Returns the xin cap phep tu ngay of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @return the xin cap phep tu ngay of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public java.util.Date getXinCapPhepTuNgay() {
		return _qlvtXuLyKTTQuocTePhuongTien.getXinCapPhepTuNgay();
	}

	/**
	* Sets the xin cap phep tu ngay of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @param xinCapPhepTuNgay the xin cap phep tu ngay of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public void setXinCapPhepTuNgay(java.util.Date xinCapPhepTuNgay) {
		_qlvtXuLyKTTQuocTePhuongTien.setXinCapPhepTuNgay(xinCapPhepTuNgay);
	}

	/**
	* Returns the xin cap phep den ngay of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @return the xin cap phep den ngay of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public java.util.Date getXinCapPhepDenNgay() {
		return _qlvtXuLyKTTQuocTePhuongTien.getXinCapPhepDenNgay();
	}

	/**
	* Sets the xin cap phep den ngay of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @param xinCapPhepDenNgay the xin cap phep den ngay of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public void setXinCapPhepDenNgay(java.util.Date xinCapPhepDenNgay) {
		_qlvtXuLyKTTQuocTePhuongTien.setXinCapPhepDenNgay(xinCapPhepDenNgay);
	}

	/**
	* Returns the hinh thuc hoat dong of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @return the hinh thuc hoat dong of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public java.lang.String getHinhThucHoatDong() {
		return _qlvtXuLyKTTQuocTePhuongTien.getHinhThucHoatDong();
	}

	/**
	* Sets the hinh thuc hoat dong of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @param hinhThucHoatDong the hinh thuc hoat dong of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public void setHinhThucHoatDong(java.lang.String hinhThucHoatDong) {
		_qlvtXuLyKTTQuocTePhuongTien.setHinhThucHoatDong(hinhThucHoatDong);
	}

	/**
	* Returns the loai hinh gia han of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @return the loai hinh gia han of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public java.lang.String getLoaiHinhGiaHan() {
		return _qlvtXuLyKTTQuocTePhuongTien.getLoaiHinhGiaHan();
	}

	/**
	* Sets the loai hinh gia han of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @param loaiHinhGiaHan the loai hinh gia han of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public void setLoaiHinhGiaHan(java.lang.String loaiHinhGiaHan) {
		_qlvtXuLyKTTQuocTePhuongTien.setLoaiHinhGiaHan(loaiHinhGiaHan);
	}

	/**
	* Returns the ket qua xu ly of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @return the ket qua xu ly of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public java.lang.String getKetQuaXuLy() {
		return _qlvtXuLyKTTQuocTePhuongTien.getKetQuaXuLy();
	}

	/**
	* Sets the ket qua xu ly of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @param ketQuaXuLy the ket qua xu ly of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public void setKetQuaXuLy(java.lang.String ketQuaXuLy) {
		_qlvtXuLyKTTQuocTePhuongTien.setKetQuaXuLy(ketQuaXuLy);
	}

	/**
	* Returns the ly do khong dat of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @return the ly do khong dat of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public java.lang.String getLyDoKhongDat() {
		return _qlvtXuLyKTTQuocTePhuongTien.getLyDoKhongDat();
	}

	/**
	* Sets the ly do khong dat of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @param lyDoKhongDat the ly do khong dat of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public void setLyDoKhongDat(java.lang.String lyDoKhongDat) {
		_qlvtXuLyKTTQuocTePhuongTien.setLyDoKhongDat(lyDoKhongDat);
	}

	/**
	* Returns the cap phep k t t quoc te i d of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @return the cap phep k t t quoc te i d of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public long getCapPhepKTTQuocTeID() {
		return _qlvtXuLyKTTQuocTePhuongTien.getCapPhepKTTQuocTeID();
	}

	/**
	* Sets the cap phep k t t quoc te i d of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @param capPhepKTTQuocTeID the cap phep k t t quoc te i d of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public void setCapPhepKTTQuocTeID(long capPhepKTTQuocTeID) {
		_qlvtXuLyKTTQuocTePhuongTien.setCapPhepKTTQuocTeID(capPhepKTTQuocTeID);
	}

	/**
	* Returns the loai giay phep of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @return the loai giay phep of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public java.lang.String getLoaiGiayPhep() {
		return _qlvtXuLyKTTQuocTePhuongTien.getLoaiGiayPhep();
	}

	/**
	* Sets the loai giay phep of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @param loaiGiayPhep the loai giay phep of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public void setLoaiGiayPhep(java.lang.String loaiGiayPhep) {
		_qlvtXuLyKTTQuocTePhuongTien.setLoaiGiayPhep(loaiGiayPhep);
	}

	/**
	* Returns the so cho ngoi of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @return the so cho ngoi of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public int getSoChoNgoi() {
		return _qlvtXuLyKTTQuocTePhuongTien.getSoChoNgoi();
	}

	/**
	* Sets the so cho ngoi of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @param soChoNgoi the so cho ngoi of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public void setSoChoNgoi(int soChoNgoi) {
		_qlvtXuLyKTTQuocTePhuongTien.setSoChoNgoi(soChoNgoi);
	}

	/**
	* Returns the ten dang ky so huu of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @return the ten dang ky so huu of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public java.lang.String getTenDangKySoHuu() {
		return _qlvtXuLyKTTQuocTePhuongTien.getTenDangKySoHuu();
	}

	/**
	* Sets the ten dang ky so huu of this qlvt xu ly k t t quoc te phuong tien.
	*
	* @param tenDangKySoHuu the ten dang ky so huu of this qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public void setTenDangKySoHuu(java.lang.String tenDangKySoHuu) {
		_qlvtXuLyKTTQuocTePhuongTien.setTenDangKySoHuu(tenDangKySoHuu);
	}

	@Override
	public boolean isNew() {
		return _qlvtXuLyKTTQuocTePhuongTien.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtXuLyKTTQuocTePhuongTien.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtXuLyKTTQuocTePhuongTien.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtXuLyKTTQuocTePhuongTien.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtXuLyKTTQuocTePhuongTien.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtXuLyKTTQuocTePhuongTien.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtXuLyKTTQuocTePhuongTien.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtXuLyKTTQuocTePhuongTien.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtXuLyKTTQuocTePhuongTien.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtXuLyKTTQuocTePhuongTien.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtXuLyKTTQuocTePhuongTien.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtXuLyKTTQuocTePhuongTienWrapper((QlvtXuLyKTTQuocTePhuongTien)_qlvtXuLyKTTQuocTePhuongTien.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien) {
		return _qlvtXuLyKTTQuocTePhuongTien.compareTo(qlvtXuLyKTTQuocTePhuongTien);
	}

	@Override
	public int hashCode() {
		return _qlvtXuLyKTTQuocTePhuongTien.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien> toCacheModel() {
		return _qlvtXuLyKTTQuocTePhuongTien.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien toEscapedModel() {
		return new QlvtXuLyKTTQuocTePhuongTienWrapper(_qlvtXuLyKTTQuocTePhuongTien.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien toUnescapedModel() {
		return new QlvtXuLyKTTQuocTePhuongTienWrapper(_qlvtXuLyKTTQuocTePhuongTien.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtXuLyKTTQuocTePhuongTien.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtXuLyKTTQuocTePhuongTien.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtXuLyKTTQuocTePhuongTien.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtXuLyKTTQuocTePhuongTienWrapper)) {
			return false;
		}

		QlvtXuLyKTTQuocTePhuongTienWrapper qlvtXuLyKTTQuocTePhuongTienWrapper = (QlvtXuLyKTTQuocTePhuongTienWrapper)obj;

		if (Validator.equals(_qlvtXuLyKTTQuocTePhuongTien,
					qlvtXuLyKTTQuocTePhuongTienWrapper._qlvtXuLyKTTQuocTePhuongTien)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtXuLyKTTQuocTePhuongTien getWrappedQlvtXuLyKTTQuocTePhuongTien() {
		return _qlvtXuLyKTTQuocTePhuongTien;
	}

	@Override
	public QlvtXuLyKTTQuocTePhuongTien getWrappedModel() {
		return _qlvtXuLyKTTQuocTePhuongTien;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtXuLyKTTQuocTePhuongTien.resetOriginalValues();
	}

	private QlvtXuLyKTTQuocTePhuongTien _qlvtXuLyKTTQuocTePhuongTien;
}