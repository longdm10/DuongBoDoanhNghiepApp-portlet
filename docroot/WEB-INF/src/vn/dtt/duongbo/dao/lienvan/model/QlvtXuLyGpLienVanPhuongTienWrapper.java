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

package vn.dtt.duongbo.dao.lienvan.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link QlvtXuLyGpLienVanPhuongTien}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtXuLyGpLienVanPhuongTien
 * @generated
 */
public class QlvtXuLyGpLienVanPhuongTienWrapper
	implements QlvtXuLyGpLienVanPhuongTien,
		ModelWrapper<QlvtXuLyGpLienVanPhuongTien> {
	public QlvtXuLyGpLienVanPhuongTienWrapper(
		QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien) {
		_qlvtXuLyGpLienVanPhuongTien = qlvtXuLyGpLienVanPhuongTien;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtXuLyGpLienVanPhuongTien.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtXuLyGpLienVanPhuongTien.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("capGplvId", getCapGplvId());
		attributes.put("bienSo", getBienSo());
		attributes.put("trongTai", getTrongTai());
		attributes.put("namSx", getNamSx());
		attributes.put("nhanHieu", getNhanHieu());
		attributes.put("soKhung", getSoKhung());
		attributes.put("soMay", getSoMay());
		attributes.put("mauSon", getMauSon());
		attributes.put("cuaKhau", getCuaKhau());
		attributes.put("maCuaKhau", getMaCuaKhau());
		attributes.put("xinCapPhepTuNgay", getXinCapPhepTuNgay());
		attributes.put("xinCapPhepDenNgay", getXinCapPhepDenNgay());
		attributes.put("hinhThucHoatDong", getHinhThucHoatDong());
		attributes.put("soPhuHieu", getSoPhuHieu());
		attributes.put("thoiHanPhuHieu", getThoiHanPhuHieu());
		attributes.put("soNgayXinhGiaHan", getSoNgayXinhGiaHan());
		attributes.put("xinGiaHanTuNgay", getXinGiaHanTuNgay());
		attributes.put("xinGiaHanDenNgay", getXinGiaHanDenNgay());
		attributes.put("hinhThucSoHuu", getHinhThucSoHuu());
		attributes.put("doanhNghiepChoThue", getDoanhNghiepChoThue());
		attributes.put("thoiHanChoThue", getThoiHanChoThue());
		attributes.put("hopDongSauCung", getHopDongSauCung());
		attributes.put("thoiGianNhapCanh", getThoiGianNhapCanh());
		attributes.put("thoiGianKhoiHanh", getThoiGianKhoiHanh());
		attributes.put("loaiHinhGiaHan", getLoaiHinhGiaHan());
		attributes.put("loaiGiayPhep", getLoaiGiayPhep());
		attributes.put("ketQuaXuLy", getKetQuaXuLy());
		attributes.put("lyDoKhongDat", getLyDoKhongDat());
		attributes.put("soChoNgoi", getSoChoNgoi());
		attributes.put("hanhTrinh", getHanhTrinh());
		attributes.put("phiCapPhep", getPhiCapPhep());
		attributes.put("soGiayPhepLienVanPhuongTien",
			getSoGiayPhepLienVanPhuongTien());
		attributes.put("loaiTuyen", getLoaiTuyen());
		attributes.put("loaiHangVanChuyen", getLoaiHangVanChuyen());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long capGplvId = (Long)attributes.get("capGplvId");

		if (capGplvId != null) {
			setCapGplvId(capGplvId);
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

		String mauSon = (String)attributes.get("mauSon");

		if (mauSon != null) {
			setMauSon(mauSon);
		}

		String cuaKhau = (String)attributes.get("cuaKhau");

		if (cuaKhau != null) {
			setCuaKhau(cuaKhau);
		}

		String maCuaKhau = (String)attributes.get("maCuaKhau");

		if (maCuaKhau != null) {
			setMaCuaKhau(maCuaKhau);
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

		String soPhuHieu = (String)attributes.get("soPhuHieu");

		if (soPhuHieu != null) {
			setSoPhuHieu(soPhuHieu);
		}

		Date thoiHanPhuHieu = (Date)attributes.get("thoiHanPhuHieu");

		if (thoiHanPhuHieu != null) {
			setThoiHanPhuHieu(thoiHanPhuHieu);
		}

		Integer soNgayXinhGiaHan = (Integer)attributes.get("soNgayXinhGiaHan");

		if (soNgayXinhGiaHan != null) {
			setSoNgayXinhGiaHan(soNgayXinhGiaHan);
		}

		Date xinGiaHanTuNgay = (Date)attributes.get("xinGiaHanTuNgay");

		if (xinGiaHanTuNgay != null) {
			setXinGiaHanTuNgay(xinGiaHanTuNgay);
		}

		Date xinGiaHanDenNgay = (Date)attributes.get("xinGiaHanDenNgay");

		if (xinGiaHanDenNgay != null) {
			setXinGiaHanDenNgay(xinGiaHanDenNgay);
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

		String loaiHinhGiaHan = (String)attributes.get("loaiHinhGiaHan");

		if (loaiHinhGiaHan != null) {
			setLoaiHinhGiaHan(loaiHinhGiaHan);
		}

		String loaiGiayPhep = (String)attributes.get("loaiGiayPhep");

		if (loaiGiayPhep != null) {
			setLoaiGiayPhep(loaiGiayPhep);
		}

		String ketQuaXuLy = (String)attributes.get("ketQuaXuLy");

		if (ketQuaXuLy != null) {
			setKetQuaXuLy(ketQuaXuLy);
		}

		String lyDoKhongDat = (String)attributes.get("lyDoKhongDat");

		if (lyDoKhongDat != null) {
			setLyDoKhongDat(lyDoKhongDat);
		}

		String soChoNgoi = (String)attributes.get("soChoNgoi");

		if (soChoNgoi != null) {
			setSoChoNgoi(soChoNgoi);
		}

		String hanhTrinh = (String)attributes.get("hanhTrinh");

		if (hanhTrinh != null) {
			setHanhTrinh(hanhTrinh);
		}

		Integer phiCapPhep = (Integer)attributes.get("phiCapPhep");

		if (phiCapPhep != null) {
			setPhiCapPhep(phiCapPhep);
		}

		String soGiayPhepLienVanPhuongTien = (String)attributes.get(
				"soGiayPhepLienVanPhuongTien");

		if (soGiayPhepLienVanPhuongTien != null) {
			setSoGiayPhepLienVanPhuongTien(soGiayPhepLienVanPhuongTien);
		}

		String loaiTuyen = (String)attributes.get("loaiTuyen");

		if (loaiTuyen != null) {
			setLoaiTuyen(loaiTuyen);
		}

		String loaiHangVanChuyen = (String)attributes.get("loaiHangVanChuyen");

		if (loaiHangVanChuyen != null) {
			setLoaiHangVanChuyen(loaiHangVanChuyen);
		}
	}

	/**
	* Returns the primary key of this qlvt xu ly gp lien van phuong tien.
	*
	* @return the primary key of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtXuLyGpLienVanPhuongTien.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt xu ly gp lien van phuong tien.
	*
	* @param primaryKey the primary key of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtXuLyGpLienVanPhuongTien.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt xu ly gp lien van phuong tien.
	*
	* @return the ID of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public long getId() {
		return _qlvtXuLyGpLienVanPhuongTien.getId();
	}

	/**
	* Sets the ID of this qlvt xu ly gp lien van phuong tien.
	*
	* @param id the ID of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public void setId(long id) {
		_qlvtXuLyGpLienVanPhuongTien.setId(id);
	}

	/**
	* Returns the cap gplv ID of this qlvt xu ly gp lien van phuong tien.
	*
	* @return the cap gplv ID of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public long getCapGplvId() {
		return _qlvtXuLyGpLienVanPhuongTien.getCapGplvId();
	}

	/**
	* Sets the cap gplv ID of this qlvt xu ly gp lien van phuong tien.
	*
	* @param capGplvId the cap gplv ID of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public void setCapGplvId(long capGplvId) {
		_qlvtXuLyGpLienVanPhuongTien.setCapGplvId(capGplvId);
	}

	/**
	* Returns the bien so of this qlvt xu ly gp lien van phuong tien.
	*
	* @return the bien so of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public java.lang.String getBienSo() {
		return _qlvtXuLyGpLienVanPhuongTien.getBienSo();
	}

	/**
	* Sets the bien so of this qlvt xu ly gp lien van phuong tien.
	*
	* @param bienSo the bien so of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public void setBienSo(java.lang.String bienSo) {
		_qlvtXuLyGpLienVanPhuongTien.setBienSo(bienSo);
	}

	/**
	* Returns the trong tai of this qlvt xu ly gp lien van phuong tien.
	*
	* @return the trong tai of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public int getTrongTai() {
		return _qlvtXuLyGpLienVanPhuongTien.getTrongTai();
	}

	/**
	* Sets the trong tai of this qlvt xu ly gp lien van phuong tien.
	*
	* @param trongTai the trong tai of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public void setTrongTai(int trongTai) {
		_qlvtXuLyGpLienVanPhuongTien.setTrongTai(trongTai);
	}

	/**
	* Returns the nam sx of this qlvt xu ly gp lien van phuong tien.
	*
	* @return the nam sx of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public int getNamSx() {
		return _qlvtXuLyGpLienVanPhuongTien.getNamSx();
	}

	/**
	* Sets the nam sx of this qlvt xu ly gp lien van phuong tien.
	*
	* @param namSx the nam sx of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public void setNamSx(int namSx) {
		_qlvtXuLyGpLienVanPhuongTien.setNamSx(namSx);
	}

	/**
	* Returns the nhan hieu of this qlvt xu ly gp lien van phuong tien.
	*
	* @return the nhan hieu of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public java.lang.String getNhanHieu() {
		return _qlvtXuLyGpLienVanPhuongTien.getNhanHieu();
	}

	/**
	* Sets the nhan hieu of this qlvt xu ly gp lien van phuong tien.
	*
	* @param nhanHieu the nhan hieu of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public void setNhanHieu(java.lang.String nhanHieu) {
		_qlvtXuLyGpLienVanPhuongTien.setNhanHieu(nhanHieu);
	}

	/**
	* Returns the so khung of this qlvt xu ly gp lien van phuong tien.
	*
	* @return the so khung of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public java.lang.String getSoKhung() {
		return _qlvtXuLyGpLienVanPhuongTien.getSoKhung();
	}

	/**
	* Sets the so khung of this qlvt xu ly gp lien van phuong tien.
	*
	* @param soKhung the so khung of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public void setSoKhung(java.lang.String soKhung) {
		_qlvtXuLyGpLienVanPhuongTien.setSoKhung(soKhung);
	}

	/**
	* Returns the so may of this qlvt xu ly gp lien van phuong tien.
	*
	* @return the so may of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public java.lang.String getSoMay() {
		return _qlvtXuLyGpLienVanPhuongTien.getSoMay();
	}

	/**
	* Sets the so may of this qlvt xu ly gp lien van phuong tien.
	*
	* @param soMay the so may of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public void setSoMay(java.lang.String soMay) {
		_qlvtXuLyGpLienVanPhuongTien.setSoMay(soMay);
	}

	/**
	* Returns the mau son of this qlvt xu ly gp lien van phuong tien.
	*
	* @return the mau son of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public java.lang.String getMauSon() {
		return _qlvtXuLyGpLienVanPhuongTien.getMauSon();
	}

	/**
	* Sets the mau son of this qlvt xu ly gp lien van phuong tien.
	*
	* @param mauSon the mau son of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public void setMauSon(java.lang.String mauSon) {
		_qlvtXuLyGpLienVanPhuongTien.setMauSon(mauSon);
	}

	/**
	* Returns the cua khau of this qlvt xu ly gp lien van phuong tien.
	*
	* @return the cua khau of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public java.lang.String getCuaKhau() {
		return _qlvtXuLyGpLienVanPhuongTien.getCuaKhau();
	}

	/**
	* Sets the cua khau of this qlvt xu ly gp lien van phuong tien.
	*
	* @param cuaKhau the cua khau of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public void setCuaKhau(java.lang.String cuaKhau) {
		_qlvtXuLyGpLienVanPhuongTien.setCuaKhau(cuaKhau);
	}

	/**
	* Returns the ma cua khau of this qlvt xu ly gp lien van phuong tien.
	*
	* @return the ma cua khau of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public java.lang.String getMaCuaKhau() {
		return _qlvtXuLyGpLienVanPhuongTien.getMaCuaKhau();
	}

	/**
	* Sets the ma cua khau of this qlvt xu ly gp lien van phuong tien.
	*
	* @param maCuaKhau the ma cua khau of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public void setMaCuaKhau(java.lang.String maCuaKhau) {
		_qlvtXuLyGpLienVanPhuongTien.setMaCuaKhau(maCuaKhau);
	}

	/**
	* Returns the xin cap phep tu ngay of this qlvt xu ly gp lien van phuong tien.
	*
	* @return the xin cap phep tu ngay of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public java.util.Date getXinCapPhepTuNgay() {
		return _qlvtXuLyGpLienVanPhuongTien.getXinCapPhepTuNgay();
	}

	/**
	* Sets the xin cap phep tu ngay of this qlvt xu ly gp lien van phuong tien.
	*
	* @param xinCapPhepTuNgay the xin cap phep tu ngay of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public void setXinCapPhepTuNgay(java.util.Date xinCapPhepTuNgay) {
		_qlvtXuLyGpLienVanPhuongTien.setXinCapPhepTuNgay(xinCapPhepTuNgay);
	}

	/**
	* Returns the xin cap phep den ngay of this qlvt xu ly gp lien van phuong tien.
	*
	* @return the xin cap phep den ngay of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public java.util.Date getXinCapPhepDenNgay() {
		return _qlvtXuLyGpLienVanPhuongTien.getXinCapPhepDenNgay();
	}

	/**
	* Sets the xin cap phep den ngay of this qlvt xu ly gp lien van phuong tien.
	*
	* @param xinCapPhepDenNgay the xin cap phep den ngay of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public void setXinCapPhepDenNgay(java.util.Date xinCapPhepDenNgay) {
		_qlvtXuLyGpLienVanPhuongTien.setXinCapPhepDenNgay(xinCapPhepDenNgay);
	}

	/**
	* Returns the hinh thuc hoat dong of this qlvt xu ly gp lien van phuong tien.
	*
	* @return the hinh thuc hoat dong of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public java.lang.String getHinhThucHoatDong() {
		return _qlvtXuLyGpLienVanPhuongTien.getHinhThucHoatDong();
	}

	/**
	* Sets the hinh thuc hoat dong of this qlvt xu ly gp lien van phuong tien.
	*
	* @param hinhThucHoatDong the hinh thuc hoat dong of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public void setHinhThucHoatDong(java.lang.String hinhThucHoatDong) {
		_qlvtXuLyGpLienVanPhuongTien.setHinhThucHoatDong(hinhThucHoatDong);
	}

	/**
	* Returns the so phu hieu of this qlvt xu ly gp lien van phuong tien.
	*
	* @return the so phu hieu of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public java.lang.String getSoPhuHieu() {
		return _qlvtXuLyGpLienVanPhuongTien.getSoPhuHieu();
	}

	/**
	* Sets the so phu hieu of this qlvt xu ly gp lien van phuong tien.
	*
	* @param soPhuHieu the so phu hieu of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public void setSoPhuHieu(java.lang.String soPhuHieu) {
		_qlvtXuLyGpLienVanPhuongTien.setSoPhuHieu(soPhuHieu);
	}

	/**
	* Returns the thoi han phu hieu of this qlvt xu ly gp lien van phuong tien.
	*
	* @return the thoi han phu hieu of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public java.util.Date getThoiHanPhuHieu() {
		return _qlvtXuLyGpLienVanPhuongTien.getThoiHanPhuHieu();
	}

	/**
	* Sets the thoi han phu hieu of this qlvt xu ly gp lien van phuong tien.
	*
	* @param thoiHanPhuHieu the thoi han phu hieu of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public void setThoiHanPhuHieu(java.util.Date thoiHanPhuHieu) {
		_qlvtXuLyGpLienVanPhuongTien.setThoiHanPhuHieu(thoiHanPhuHieu);
	}

	/**
	* Returns the so ngay xinh gia han of this qlvt xu ly gp lien van phuong tien.
	*
	* @return the so ngay xinh gia han of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public int getSoNgayXinhGiaHan() {
		return _qlvtXuLyGpLienVanPhuongTien.getSoNgayXinhGiaHan();
	}

	/**
	* Sets the so ngay xinh gia han of this qlvt xu ly gp lien van phuong tien.
	*
	* @param soNgayXinhGiaHan the so ngay xinh gia han of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public void setSoNgayXinhGiaHan(int soNgayXinhGiaHan) {
		_qlvtXuLyGpLienVanPhuongTien.setSoNgayXinhGiaHan(soNgayXinhGiaHan);
	}

	/**
	* Returns the xin gia han tu ngay of this qlvt xu ly gp lien van phuong tien.
	*
	* @return the xin gia han tu ngay of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public java.util.Date getXinGiaHanTuNgay() {
		return _qlvtXuLyGpLienVanPhuongTien.getXinGiaHanTuNgay();
	}

	/**
	* Sets the xin gia han tu ngay of this qlvt xu ly gp lien van phuong tien.
	*
	* @param xinGiaHanTuNgay the xin gia han tu ngay of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public void setXinGiaHanTuNgay(java.util.Date xinGiaHanTuNgay) {
		_qlvtXuLyGpLienVanPhuongTien.setXinGiaHanTuNgay(xinGiaHanTuNgay);
	}

	/**
	* Returns the xin gia han den ngay of this qlvt xu ly gp lien van phuong tien.
	*
	* @return the xin gia han den ngay of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public java.util.Date getXinGiaHanDenNgay() {
		return _qlvtXuLyGpLienVanPhuongTien.getXinGiaHanDenNgay();
	}

	/**
	* Sets the xin gia han den ngay of this qlvt xu ly gp lien van phuong tien.
	*
	* @param xinGiaHanDenNgay the xin gia han den ngay of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public void setXinGiaHanDenNgay(java.util.Date xinGiaHanDenNgay) {
		_qlvtXuLyGpLienVanPhuongTien.setXinGiaHanDenNgay(xinGiaHanDenNgay);
	}

	/**
	* Returns the hinh thuc so huu of this qlvt xu ly gp lien van phuong tien.
	*
	* @return the hinh thuc so huu of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public java.lang.String getHinhThucSoHuu() {
		return _qlvtXuLyGpLienVanPhuongTien.getHinhThucSoHuu();
	}

	/**
	* Sets the hinh thuc so huu of this qlvt xu ly gp lien van phuong tien.
	*
	* @param hinhThucSoHuu the hinh thuc so huu of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public void setHinhThucSoHuu(java.lang.String hinhThucSoHuu) {
		_qlvtXuLyGpLienVanPhuongTien.setHinhThucSoHuu(hinhThucSoHuu);
	}

	/**
	* Returns the doanh nghiep cho thue of this qlvt xu ly gp lien van phuong tien.
	*
	* @return the doanh nghiep cho thue of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public java.lang.String getDoanhNghiepChoThue() {
		return _qlvtXuLyGpLienVanPhuongTien.getDoanhNghiepChoThue();
	}

	/**
	* Sets the doanh nghiep cho thue of this qlvt xu ly gp lien van phuong tien.
	*
	* @param doanhNghiepChoThue the doanh nghiep cho thue of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public void setDoanhNghiepChoThue(java.lang.String doanhNghiepChoThue) {
		_qlvtXuLyGpLienVanPhuongTien.setDoanhNghiepChoThue(doanhNghiepChoThue);
	}

	/**
	* Returns the thoi han cho thue of this qlvt xu ly gp lien van phuong tien.
	*
	* @return the thoi han cho thue of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public java.util.Date getThoiHanChoThue() {
		return _qlvtXuLyGpLienVanPhuongTien.getThoiHanChoThue();
	}

	/**
	* Sets the thoi han cho thue of this qlvt xu ly gp lien van phuong tien.
	*
	* @param thoiHanChoThue the thoi han cho thue of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public void setThoiHanChoThue(java.util.Date thoiHanChoThue) {
		_qlvtXuLyGpLienVanPhuongTien.setThoiHanChoThue(thoiHanChoThue);
	}

	/**
	* Returns the hop dong sau cung of this qlvt xu ly gp lien van phuong tien.
	*
	* @return the hop dong sau cung of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public long getHopDongSauCung() {
		return _qlvtXuLyGpLienVanPhuongTien.getHopDongSauCung();
	}

	/**
	* Sets the hop dong sau cung of this qlvt xu ly gp lien van phuong tien.
	*
	* @param hopDongSauCung the hop dong sau cung of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public void setHopDongSauCung(long hopDongSauCung) {
		_qlvtXuLyGpLienVanPhuongTien.setHopDongSauCung(hopDongSauCung);
	}

	/**
	* Returns the thoi gian nhap canh of this qlvt xu ly gp lien van phuong tien.
	*
	* @return the thoi gian nhap canh of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public java.util.Date getThoiGianNhapCanh() {
		return _qlvtXuLyGpLienVanPhuongTien.getThoiGianNhapCanh();
	}

	/**
	* Sets the thoi gian nhap canh of this qlvt xu ly gp lien van phuong tien.
	*
	* @param thoiGianNhapCanh the thoi gian nhap canh of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public void setThoiGianNhapCanh(java.util.Date thoiGianNhapCanh) {
		_qlvtXuLyGpLienVanPhuongTien.setThoiGianNhapCanh(thoiGianNhapCanh);
	}

	/**
	* Returns the thoi gian khoi hanh of this qlvt xu ly gp lien van phuong tien.
	*
	* @return the thoi gian khoi hanh of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public java.util.Date getThoiGianKhoiHanh() {
		return _qlvtXuLyGpLienVanPhuongTien.getThoiGianKhoiHanh();
	}

	/**
	* Sets the thoi gian khoi hanh of this qlvt xu ly gp lien van phuong tien.
	*
	* @param thoiGianKhoiHanh the thoi gian khoi hanh of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public void setThoiGianKhoiHanh(java.util.Date thoiGianKhoiHanh) {
		_qlvtXuLyGpLienVanPhuongTien.setThoiGianKhoiHanh(thoiGianKhoiHanh);
	}

	/**
	* Returns the loai hinh gia han of this qlvt xu ly gp lien van phuong tien.
	*
	* @return the loai hinh gia han of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public java.lang.String getLoaiHinhGiaHan() {
		return _qlvtXuLyGpLienVanPhuongTien.getLoaiHinhGiaHan();
	}

	/**
	* Sets the loai hinh gia han of this qlvt xu ly gp lien van phuong tien.
	*
	* @param loaiHinhGiaHan the loai hinh gia han of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public void setLoaiHinhGiaHan(java.lang.String loaiHinhGiaHan) {
		_qlvtXuLyGpLienVanPhuongTien.setLoaiHinhGiaHan(loaiHinhGiaHan);
	}

	/**
	* Returns the loai giay phep of this qlvt xu ly gp lien van phuong tien.
	*
	* @return the loai giay phep of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public java.lang.String getLoaiGiayPhep() {
		return _qlvtXuLyGpLienVanPhuongTien.getLoaiGiayPhep();
	}

	/**
	* Sets the loai giay phep of this qlvt xu ly gp lien van phuong tien.
	*
	* @param loaiGiayPhep the loai giay phep of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public void setLoaiGiayPhep(java.lang.String loaiGiayPhep) {
		_qlvtXuLyGpLienVanPhuongTien.setLoaiGiayPhep(loaiGiayPhep);
	}

	/**
	* Returns the ket qua xu ly of this qlvt xu ly gp lien van phuong tien.
	*
	* @return the ket qua xu ly of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public java.lang.String getKetQuaXuLy() {
		return _qlvtXuLyGpLienVanPhuongTien.getKetQuaXuLy();
	}

	/**
	* Sets the ket qua xu ly of this qlvt xu ly gp lien van phuong tien.
	*
	* @param ketQuaXuLy the ket qua xu ly of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public void setKetQuaXuLy(java.lang.String ketQuaXuLy) {
		_qlvtXuLyGpLienVanPhuongTien.setKetQuaXuLy(ketQuaXuLy);
	}

	/**
	* Returns the ly do khong dat of this qlvt xu ly gp lien van phuong tien.
	*
	* @return the ly do khong dat of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public java.lang.String getLyDoKhongDat() {
		return _qlvtXuLyGpLienVanPhuongTien.getLyDoKhongDat();
	}

	/**
	* Sets the ly do khong dat of this qlvt xu ly gp lien van phuong tien.
	*
	* @param lyDoKhongDat the ly do khong dat of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public void setLyDoKhongDat(java.lang.String lyDoKhongDat) {
		_qlvtXuLyGpLienVanPhuongTien.setLyDoKhongDat(lyDoKhongDat);
	}

	/**
	* Returns the so cho ngoi of this qlvt xu ly gp lien van phuong tien.
	*
	* @return the so cho ngoi of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public java.lang.String getSoChoNgoi() {
		return _qlvtXuLyGpLienVanPhuongTien.getSoChoNgoi();
	}

	/**
	* Sets the so cho ngoi of this qlvt xu ly gp lien van phuong tien.
	*
	* @param soChoNgoi the so cho ngoi of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public void setSoChoNgoi(java.lang.String soChoNgoi) {
		_qlvtXuLyGpLienVanPhuongTien.setSoChoNgoi(soChoNgoi);
	}

	/**
	* Returns the hanh trinh of this qlvt xu ly gp lien van phuong tien.
	*
	* @return the hanh trinh of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public java.lang.String getHanhTrinh() {
		return _qlvtXuLyGpLienVanPhuongTien.getHanhTrinh();
	}

	/**
	* Sets the hanh trinh of this qlvt xu ly gp lien van phuong tien.
	*
	* @param hanhTrinh the hanh trinh of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public void setHanhTrinh(java.lang.String hanhTrinh) {
		_qlvtXuLyGpLienVanPhuongTien.setHanhTrinh(hanhTrinh);
	}

	/**
	* Returns the phi cap phep of this qlvt xu ly gp lien van phuong tien.
	*
	* @return the phi cap phep of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public int getPhiCapPhep() {
		return _qlvtXuLyGpLienVanPhuongTien.getPhiCapPhep();
	}

	/**
	* Sets the phi cap phep of this qlvt xu ly gp lien van phuong tien.
	*
	* @param phiCapPhep the phi cap phep of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public void setPhiCapPhep(int phiCapPhep) {
		_qlvtXuLyGpLienVanPhuongTien.setPhiCapPhep(phiCapPhep);
	}

	/**
	* Returns the so giay phep lien van phuong tien of this qlvt xu ly gp lien van phuong tien.
	*
	* @return the so giay phep lien van phuong tien of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public java.lang.String getSoGiayPhepLienVanPhuongTien() {
		return _qlvtXuLyGpLienVanPhuongTien.getSoGiayPhepLienVanPhuongTien();
	}

	/**
	* Sets the so giay phep lien van phuong tien of this qlvt xu ly gp lien van phuong tien.
	*
	* @param soGiayPhepLienVanPhuongTien the so giay phep lien van phuong tien of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public void setSoGiayPhepLienVanPhuongTien(
		java.lang.String soGiayPhepLienVanPhuongTien) {
		_qlvtXuLyGpLienVanPhuongTien.setSoGiayPhepLienVanPhuongTien(soGiayPhepLienVanPhuongTien);
	}

	/**
	* Returns the loai tuyen of this qlvt xu ly gp lien van phuong tien.
	*
	* @return the loai tuyen of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public java.lang.String getLoaiTuyen() {
		return _qlvtXuLyGpLienVanPhuongTien.getLoaiTuyen();
	}

	/**
	* Sets the loai tuyen of this qlvt xu ly gp lien van phuong tien.
	*
	* @param loaiTuyen the loai tuyen of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public void setLoaiTuyen(java.lang.String loaiTuyen) {
		_qlvtXuLyGpLienVanPhuongTien.setLoaiTuyen(loaiTuyen);
	}

	/**
	* Returns the loai hang van chuyen of this qlvt xu ly gp lien van phuong tien.
	*
	* @return the loai hang van chuyen of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public java.lang.String getLoaiHangVanChuyen() {
		return _qlvtXuLyGpLienVanPhuongTien.getLoaiHangVanChuyen();
	}

	/**
	* Sets the loai hang van chuyen of this qlvt xu ly gp lien van phuong tien.
	*
	* @param loaiHangVanChuyen the loai hang van chuyen of this qlvt xu ly gp lien van phuong tien
	*/
	@Override
	public void setLoaiHangVanChuyen(java.lang.String loaiHangVanChuyen) {
		_qlvtXuLyGpLienVanPhuongTien.setLoaiHangVanChuyen(loaiHangVanChuyen);
	}

	@Override
	public boolean isNew() {
		return _qlvtXuLyGpLienVanPhuongTien.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtXuLyGpLienVanPhuongTien.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtXuLyGpLienVanPhuongTien.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtXuLyGpLienVanPhuongTien.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtXuLyGpLienVanPhuongTien.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtXuLyGpLienVanPhuongTien.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtXuLyGpLienVanPhuongTien.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtXuLyGpLienVanPhuongTien.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtXuLyGpLienVanPhuongTien.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtXuLyGpLienVanPhuongTien.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtXuLyGpLienVanPhuongTien.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtXuLyGpLienVanPhuongTienWrapper((QlvtXuLyGpLienVanPhuongTien)_qlvtXuLyGpLienVanPhuongTien.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien) {
		return _qlvtXuLyGpLienVanPhuongTien.compareTo(qlvtXuLyGpLienVanPhuongTien);
	}

	@Override
	public int hashCode() {
		return _qlvtXuLyGpLienVanPhuongTien.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTien> toCacheModel() {
		return _qlvtXuLyGpLienVanPhuongTien.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTien toEscapedModel() {
		return new QlvtXuLyGpLienVanPhuongTienWrapper(_qlvtXuLyGpLienVanPhuongTien.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTien toUnescapedModel() {
		return new QlvtXuLyGpLienVanPhuongTienWrapper(_qlvtXuLyGpLienVanPhuongTien.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtXuLyGpLienVanPhuongTien.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtXuLyGpLienVanPhuongTien.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtXuLyGpLienVanPhuongTien.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtXuLyGpLienVanPhuongTienWrapper)) {
			return false;
		}

		QlvtXuLyGpLienVanPhuongTienWrapper qlvtXuLyGpLienVanPhuongTienWrapper = (QlvtXuLyGpLienVanPhuongTienWrapper)obj;

		if (Validator.equals(_qlvtXuLyGpLienVanPhuongTien,
					qlvtXuLyGpLienVanPhuongTienWrapper._qlvtXuLyGpLienVanPhuongTien)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtXuLyGpLienVanPhuongTien getWrappedQlvtXuLyGpLienVanPhuongTien() {
		return _qlvtXuLyGpLienVanPhuongTien;
	}

	@Override
	public QlvtXuLyGpLienVanPhuongTien getWrappedModel() {
		return _qlvtXuLyGpLienVanPhuongTien;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtXuLyGpLienVanPhuongTien.resetOriginalValues();
	}

	private QlvtXuLyGpLienVanPhuongTien _qlvtXuLyGpLienVanPhuongTien;
}