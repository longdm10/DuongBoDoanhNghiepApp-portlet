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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.quocte.service.http.QlvtXuLyKTTQuocTePhuongTienServiceSoap}.
 *
 * @author NoiPham
 * @see vn.dtt.duongbo.dao.quocte.service.http.QlvtXuLyKTTQuocTePhuongTienServiceSoap
 * @generated
 */
public class QlvtXuLyKTTQuocTePhuongTienSoap implements Serializable {
	public static QlvtXuLyKTTQuocTePhuongTienSoap toSoapModel(
		QlvtXuLyKTTQuocTePhuongTien model) {
		QlvtXuLyKTTQuocTePhuongTienSoap soapModel = new QlvtXuLyKTTQuocTePhuongTienSoap();

		soapModel.setId(model.getId());
		soapModel.setKttQuocTeID(model.getKttQuocTeID());
		soapModel.setBienSo(model.getBienSo());
		soapModel.setTrongTai(model.getTrongTai());
		soapModel.setNamSx(model.getNamSx());
		soapModel.setNhanHieu(model.getNhanHieu());
		soapModel.setSoKhung(model.getSoKhung());
		soapModel.setSoMay(model.getSoMay());
		soapModel.setCuaKhau(model.getCuaKhau());
		soapModel.setMaCuaKhau(model.getMaCuaKhau());
		soapModel.setHinhThucSoHuu(model.getHinhThucSoHuu());
		soapModel.setDoanhNghiepChoThue(model.getDoanhNghiepChoThue());
		soapModel.setThoiHanChoThue(model.getThoiHanChoThue());
		soapModel.setHopDongSauCung(model.getHopDongSauCung());
		soapModel.setThoiGianNhapCanh(model.getThoiGianNhapCanh());
		soapModel.setThoiGianKhoiHanh(model.getThoiGianKhoiHanh());
		soapModel.setXinCapPhepTuNgay(model.getXinCapPhepTuNgay());
		soapModel.setXinCapPhepDenNgay(model.getXinCapPhepDenNgay());
		soapModel.setHinhThucHoatDong(model.getHinhThucHoatDong());
		soapModel.setLoaiHinhGiaHan(model.getLoaiHinhGiaHan());
		soapModel.setKetQuaXuLy(model.getKetQuaXuLy());
		soapModel.setLyDoKhongDat(model.getLyDoKhongDat());
		soapModel.setCapPhepKTTQuocTeID(model.getCapPhepKTTQuocTeID());
		soapModel.setLoaiGiayPhep(model.getLoaiGiayPhep());
		soapModel.setSoChoNgoi(model.getSoChoNgoi());
		soapModel.setTenDangKySoHuu(model.getTenDangKySoHuu());

		return soapModel;
	}

	public static QlvtXuLyKTTQuocTePhuongTienSoap[] toSoapModels(
		QlvtXuLyKTTQuocTePhuongTien[] models) {
		QlvtXuLyKTTQuocTePhuongTienSoap[] soapModels = new QlvtXuLyKTTQuocTePhuongTienSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QlvtXuLyKTTQuocTePhuongTienSoap[][] toSoapModels(
		QlvtXuLyKTTQuocTePhuongTien[][] models) {
		QlvtXuLyKTTQuocTePhuongTienSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QlvtXuLyKTTQuocTePhuongTienSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QlvtXuLyKTTQuocTePhuongTienSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QlvtXuLyKTTQuocTePhuongTienSoap[] toSoapModels(
		List<QlvtXuLyKTTQuocTePhuongTien> models) {
		List<QlvtXuLyKTTQuocTePhuongTienSoap> soapModels = new ArrayList<QlvtXuLyKTTQuocTePhuongTienSoap>(models.size());

		for (QlvtXuLyKTTQuocTePhuongTien model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QlvtXuLyKTTQuocTePhuongTienSoap[soapModels.size()]);
	}

	public QlvtXuLyKTTQuocTePhuongTienSoap() {
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

	public long getKttQuocTeID() {
		return _kttQuocTeID;
	}

	public void setKttQuocTeID(long kttQuocTeID) {
		_kttQuocTeID = kttQuocTeID;
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

	public String getLoaiHinhGiaHan() {
		return _loaiHinhGiaHan;
	}

	public void setLoaiHinhGiaHan(String loaiHinhGiaHan) {
		_loaiHinhGiaHan = loaiHinhGiaHan;
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

	public long getCapPhepKTTQuocTeID() {
		return _capPhepKTTQuocTeID;
	}

	public void setCapPhepKTTQuocTeID(long capPhepKTTQuocTeID) {
		_capPhepKTTQuocTeID = capPhepKTTQuocTeID;
	}

	public String getLoaiGiayPhep() {
		return _loaiGiayPhep;
	}

	public void setLoaiGiayPhep(String loaiGiayPhep) {
		_loaiGiayPhep = loaiGiayPhep;
	}

	public int getSoChoNgoi() {
		return _soChoNgoi;
	}

	public void setSoChoNgoi(int soChoNgoi) {
		_soChoNgoi = soChoNgoi;
	}

	public String getTenDangKySoHuu() {
		return _tenDangKySoHuu;
	}

	public void setTenDangKySoHuu(String tenDangKySoHuu) {
		_tenDangKySoHuu = tenDangKySoHuu;
	}

	private long _id;
	private long _kttQuocTeID;
	private String _bienSo;
	private int _trongTai;
	private int _namSx;
	private String _nhanHieu;
	private String _soKhung;
	private String _soMay;
	private String _cuaKhau;
	private String _maCuaKhau;
	private String _hinhThucSoHuu;
	private String _doanhNghiepChoThue;
	private Date _thoiHanChoThue;
	private long _hopDongSauCung;
	private Date _thoiGianNhapCanh;
	private Date _thoiGianKhoiHanh;
	private Date _xinCapPhepTuNgay;
	private Date _xinCapPhepDenNgay;
	private String _hinhThucHoatDong;
	private String _loaiHinhGiaHan;
	private String _ketQuaXuLy;
	private String _lyDoKhongDat;
	private long _capPhepKTTQuocTeID;
	private String _loaiGiayPhep;
	private int _soChoNgoi;
	private String _tenDangKySoHuu;
}