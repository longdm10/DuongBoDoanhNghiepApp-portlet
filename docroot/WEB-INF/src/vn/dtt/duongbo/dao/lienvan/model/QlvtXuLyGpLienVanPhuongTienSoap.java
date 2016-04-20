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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.lienvan.service.http.QlvtXuLyGpLienVanPhuongTienServiceSoap}.
 *
 * @author NhanNc
 * @see vn.dtt.duongbo.dao.lienvan.service.http.QlvtXuLyGpLienVanPhuongTienServiceSoap
 * @generated
 */
public class QlvtXuLyGpLienVanPhuongTienSoap implements Serializable {
	public static QlvtXuLyGpLienVanPhuongTienSoap toSoapModel(
		QlvtXuLyGpLienVanPhuongTien model) {
		QlvtXuLyGpLienVanPhuongTienSoap soapModel = new QlvtXuLyGpLienVanPhuongTienSoap();

		soapModel.setId(model.getId());
		soapModel.setCapGplvId(model.getCapGplvId());
		soapModel.setBienSo(model.getBienSo());
		soapModel.setTrongTai(model.getTrongTai());
		soapModel.setNamSx(model.getNamSx());
		soapModel.setNhanHieu(model.getNhanHieu());
		soapModel.setSoKhung(model.getSoKhung());
		soapModel.setSoMay(model.getSoMay());
		soapModel.setMauSon(model.getMauSon());
		soapModel.setCuaKhau(model.getCuaKhau());
		soapModel.setMaCuaKhau(model.getMaCuaKhau());
		soapModel.setXinCapPhepTuNgay(model.getXinCapPhepTuNgay());
		soapModel.setXinCapPhepDenNgay(model.getXinCapPhepDenNgay());
		soapModel.setHinhThucHoatDong(model.getHinhThucHoatDong());
		soapModel.setSoPhuHieu(model.getSoPhuHieu());
		soapModel.setThoiHanPhuHieu(model.getThoiHanPhuHieu());
		soapModel.setSoNgayXinhGiaHan(model.getSoNgayXinhGiaHan());
		soapModel.setXinGiaHanTuNgay(model.getXinGiaHanTuNgay());
		soapModel.setXinGiaHanDenNgay(model.getXinGiaHanDenNgay());
		soapModel.setHinhThucSoHuu(model.getHinhThucSoHuu());
		soapModel.setDoanhNghiepChoThue(model.getDoanhNghiepChoThue());
		soapModel.setThoiHanChoThue(model.getThoiHanChoThue());
		soapModel.setHopDongSauCung(model.getHopDongSauCung());
		soapModel.setThoiGianNhapCanh(model.getThoiGianNhapCanh());
		soapModel.setThoiGianKhoiHanh(model.getThoiGianKhoiHanh());
		soapModel.setLoaiHinhGiaHan(model.getLoaiHinhGiaHan());
		soapModel.setLoaiGiayPhep(model.getLoaiGiayPhep());
		soapModel.setKetQuaXuLy(model.getKetQuaXuLy());
		soapModel.setLyDoKhongDat(model.getLyDoKhongDat());
		soapModel.setSoChoNgoi(model.getSoChoNgoi());
		soapModel.setHanhTrinh(model.getHanhTrinh());
		soapModel.setPhiCapPhep(model.getPhiCapPhep());
		soapModel.setSoGiayPhepLienVanPhuongTien(model.getSoGiayPhepLienVanPhuongTien());
		soapModel.setLoaiTuyen(model.getLoaiTuyen());
		soapModel.setLoaiHangVanChuyen(model.getLoaiHangVanChuyen());

		return soapModel;
	}

	public static QlvtXuLyGpLienVanPhuongTienSoap[] toSoapModels(
		QlvtXuLyGpLienVanPhuongTien[] models) {
		QlvtXuLyGpLienVanPhuongTienSoap[] soapModels = new QlvtXuLyGpLienVanPhuongTienSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QlvtXuLyGpLienVanPhuongTienSoap[][] toSoapModels(
		QlvtXuLyGpLienVanPhuongTien[][] models) {
		QlvtXuLyGpLienVanPhuongTienSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QlvtXuLyGpLienVanPhuongTienSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QlvtXuLyGpLienVanPhuongTienSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QlvtXuLyGpLienVanPhuongTienSoap[] toSoapModels(
		List<QlvtXuLyGpLienVanPhuongTien> models) {
		List<QlvtXuLyGpLienVanPhuongTienSoap> soapModels = new ArrayList<QlvtXuLyGpLienVanPhuongTienSoap>(models.size());

		for (QlvtXuLyGpLienVanPhuongTien model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QlvtXuLyGpLienVanPhuongTienSoap[soapModels.size()]);
	}

	public QlvtXuLyGpLienVanPhuongTienSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getCapGplvId() {
		return _capGplvId;
	}

	public void setCapGplvId(long capGplvId) {
		_capGplvId = capGplvId;
	}

	public String getBienSo() {
		return _bienSo;
	}

	public void setBienSo(String bienSo) {
		_bienSo = bienSo;
	}

	public int getTrongTai() {
		return _trongTai;
	}

	public void setTrongTai(int trongTai) {
		_trongTai = trongTai;
	}

	public int getNamSx() {
		return _namSx;
	}

	public void setNamSx(int namSx) {
		_namSx = namSx;
	}

	public String getNhanHieu() {
		return _nhanHieu;
	}

	public void setNhanHieu(String nhanHieu) {
		_nhanHieu = nhanHieu;
	}

	public String getSoKhung() {
		return _soKhung;
	}

	public void setSoKhung(String soKhung) {
		_soKhung = soKhung;
	}

	public String getSoMay() {
		return _soMay;
	}

	public void setSoMay(String soMay) {
		_soMay = soMay;
	}

	public String getMauSon() {
		return _mauSon;
	}

	public void setMauSon(String mauSon) {
		_mauSon = mauSon;
	}

	public String getCuaKhau() {
		return _cuaKhau;
	}

	public void setCuaKhau(String cuaKhau) {
		_cuaKhau = cuaKhau;
	}

	public String getMaCuaKhau() {
		return _maCuaKhau;
	}

	public void setMaCuaKhau(String maCuaKhau) {
		_maCuaKhau = maCuaKhau;
	}

	public Date getXinCapPhepTuNgay() {
		return _xinCapPhepTuNgay;
	}

	public void setXinCapPhepTuNgay(Date xinCapPhepTuNgay) {
		_xinCapPhepTuNgay = xinCapPhepTuNgay;
	}

	public Date getXinCapPhepDenNgay() {
		return _xinCapPhepDenNgay;
	}

	public void setXinCapPhepDenNgay(Date xinCapPhepDenNgay) {
		_xinCapPhepDenNgay = xinCapPhepDenNgay;
	}

	public String getHinhThucHoatDong() {
		return _hinhThucHoatDong;
	}

	public void setHinhThucHoatDong(String hinhThucHoatDong) {
		_hinhThucHoatDong = hinhThucHoatDong;
	}

	public String getSoPhuHieu() {
		return _soPhuHieu;
	}

	public void setSoPhuHieu(String soPhuHieu) {
		_soPhuHieu = soPhuHieu;
	}

	public Date getThoiHanPhuHieu() {
		return _thoiHanPhuHieu;
	}

	public void setThoiHanPhuHieu(Date thoiHanPhuHieu) {
		_thoiHanPhuHieu = thoiHanPhuHieu;
	}

	public int getSoNgayXinhGiaHan() {
		return _soNgayXinhGiaHan;
	}

	public void setSoNgayXinhGiaHan(int soNgayXinhGiaHan) {
		_soNgayXinhGiaHan = soNgayXinhGiaHan;
	}

	public Date getXinGiaHanTuNgay() {
		return _xinGiaHanTuNgay;
	}

	public void setXinGiaHanTuNgay(Date xinGiaHanTuNgay) {
		_xinGiaHanTuNgay = xinGiaHanTuNgay;
	}

	public Date getXinGiaHanDenNgay() {
		return _xinGiaHanDenNgay;
	}

	public void setXinGiaHanDenNgay(Date xinGiaHanDenNgay) {
		_xinGiaHanDenNgay = xinGiaHanDenNgay;
	}

	public String getHinhThucSoHuu() {
		return _hinhThucSoHuu;
	}

	public void setHinhThucSoHuu(String hinhThucSoHuu) {
		_hinhThucSoHuu = hinhThucSoHuu;
	}

	public String getDoanhNghiepChoThue() {
		return _doanhNghiepChoThue;
	}

	public void setDoanhNghiepChoThue(String doanhNghiepChoThue) {
		_doanhNghiepChoThue = doanhNghiepChoThue;
	}

	public Date getThoiHanChoThue() {
		return _thoiHanChoThue;
	}

	public void setThoiHanChoThue(Date thoiHanChoThue) {
		_thoiHanChoThue = thoiHanChoThue;
	}

	public long getHopDongSauCung() {
		return _hopDongSauCung;
	}

	public void setHopDongSauCung(long hopDongSauCung) {
		_hopDongSauCung = hopDongSauCung;
	}

	public Date getThoiGianNhapCanh() {
		return _thoiGianNhapCanh;
	}

	public void setThoiGianNhapCanh(Date thoiGianNhapCanh) {
		_thoiGianNhapCanh = thoiGianNhapCanh;
	}

	public Date getThoiGianKhoiHanh() {
		return _thoiGianKhoiHanh;
	}

	public void setThoiGianKhoiHanh(Date thoiGianKhoiHanh) {
		_thoiGianKhoiHanh = thoiGianKhoiHanh;
	}

	public String getLoaiHinhGiaHan() {
		return _loaiHinhGiaHan;
	}

	public void setLoaiHinhGiaHan(String loaiHinhGiaHan) {
		_loaiHinhGiaHan = loaiHinhGiaHan;
	}

	public String getLoaiGiayPhep() {
		return _loaiGiayPhep;
	}

	public void setLoaiGiayPhep(String loaiGiayPhep) {
		_loaiGiayPhep = loaiGiayPhep;
	}

	public String getKetQuaXuLy() {
		return _ketQuaXuLy;
	}

	public void setKetQuaXuLy(String ketQuaXuLy) {
		_ketQuaXuLy = ketQuaXuLy;
	}

	public String getLyDoKhongDat() {
		return _lyDoKhongDat;
	}

	public void setLyDoKhongDat(String lyDoKhongDat) {
		_lyDoKhongDat = lyDoKhongDat;
	}

	public String getSoChoNgoi() {
		return _soChoNgoi;
	}

	public void setSoChoNgoi(String soChoNgoi) {
		_soChoNgoi = soChoNgoi;
	}

	public String getHanhTrinh() {
		return _hanhTrinh;
	}

	public void setHanhTrinh(String hanhTrinh) {
		_hanhTrinh = hanhTrinh;
	}

	public int getPhiCapPhep() {
		return _phiCapPhep;
	}

	public void setPhiCapPhep(int phiCapPhep) {
		_phiCapPhep = phiCapPhep;
	}

	public String getSoGiayPhepLienVanPhuongTien() {
		return _soGiayPhepLienVanPhuongTien;
	}

	public void setSoGiayPhepLienVanPhuongTien(
		String soGiayPhepLienVanPhuongTien) {
		_soGiayPhepLienVanPhuongTien = soGiayPhepLienVanPhuongTien;
	}

	public String getLoaiTuyen() {
		return _loaiTuyen;
	}

	public void setLoaiTuyen(String loaiTuyen) {
		_loaiTuyen = loaiTuyen;
	}

	public String getLoaiHangVanChuyen() {
		return _loaiHangVanChuyen;
	}

	public void setLoaiHangVanChuyen(String loaiHangVanChuyen) {
		_loaiHangVanChuyen = loaiHangVanChuyen;
	}

	private long _id;
	private long _capGplvId;
	private String _bienSo;
	private int _trongTai;
	private int _namSx;
	private String _nhanHieu;
	private String _soKhung;
	private String _soMay;
	private String _mauSon;
	private String _cuaKhau;
	private String _maCuaKhau;
	private Date _xinCapPhepTuNgay;
	private Date _xinCapPhepDenNgay;
	private String _hinhThucHoatDong;
	private String _soPhuHieu;
	private Date _thoiHanPhuHieu;
	private int _soNgayXinhGiaHan;
	private Date _xinGiaHanTuNgay;
	private Date _xinGiaHanDenNgay;
	private String _hinhThucSoHuu;
	private String _doanhNghiepChoThue;
	private Date _thoiHanChoThue;
	private long _hopDongSauCung;
	private Date _thoiGianNhapCanh;
	private Date _thoiGianKhoiHanh;
	private String _loaiHinhGiaHan;
	private String _loaiGiayPhep;
	private String _ketQuaXuLy;
	private String _lyDoKhongDat;
	private String _soChoNgoi;
	private String _hanhTrinh;
	private int _phiCapPhep;
	private String _soGiayPhepLienVanPhuongTien;
	private String _loaiTuyen;
	private String _loaiHangVanChuyen;
}