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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.lienvan.service.http.QlvtCapPhepGplvPhuongTienServiceSoap}.
 *
 * @author NhanNc
 * @see vn.dtt.duongbo.dao.lienvan.service.http.QlvtCapPhepGplvPhuongTienServiceSoap
 * @generated
 */
public class QlvtCapPhepGplvPhuongTienSoap implements Serializable {
	public static QlvtCapPhepGplvPhuongTienSoap toSoapModel(
		QlvtCapPhepGplvPhuongTien model) {
		QlvtCapPhepGplvPhuongTienSoap soapModel = new QlvtCapPhepGplvPhuongTienSoap();

		soapModel.setId(model.getId());
		soapModel.setGiayPhepLienVanId(model.getGiayPhepLienVanId());
		soapModel.setSoPhuHieu(model.getSoPhuHieu());
		soapModel.setNgayCapPhep(model.getNgayCapPhep());
		soapModel.setNgayGiaHan(model.getNgayGiaHan());
		soapModel.setNgayHetHan(model.getNgayHetHan());
		soapModel.setCuaKhau(model.getCuaKhau());
		soapModel.setMaCuaKhau(model.getMaCuaKhau());
		soapModel.setHinhThucHoatDong(model.getHinhThucHoatDong());
		soapModel.setThoiHanPhuHieu(model.getThoiHanPhuHieu());
		soapModel.setSoHuu(model.getSoHuu());
		soapModel.setChuSoHuu(model.getChuSoHuu());
		soapModel.setThoiHanChoThue(model.getThoiHanChoThue());
		soapModel.setHopDongSauCung(model.getHopDongSauCung());
		soapModel.setMucPhi(model.getMucPhi());
		soapModel.setThongTinXuLyViPham(model.getThongTinXuLyViPham());
		soapModel.setTrangThai(model.getTrangThai());
		soapModel.setFileId(model.getFileId());

		return soapModel;
	}

	public static QlvtCapPhepGplvPhuongTienSoap[] toSoapModels(
		QlvtCapPhepGplvPhuongTien[] models) {
		QlvtCapPhepGplvPhuongTienSoap[] soapModels = new QlvtCapPhepGplvPhuongTienSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QlvtCapPhepGplvPhuongTienSoap[][] toSoapModels(
		QlvtCapPhepGplvPhuongTien[][] models) {
		QlvtCapPhepGplvPhuongTienSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QlvtCapPhepGplvPhuongTienSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QlvtCapPhepGplvPhuongTienSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QlvtCapPhepGplvPhuongTienSoap[] toSoapModels(
		List<QlvtCapPhepGplvPhuongTien> models) {
		List<QlvtCapPhepGplvPhuongTienSoap> soapModels = new ArrayList<QlvtCapPhepGplvPhuongTienSoap>(models.size());

		for (QlvtCapPhepGplvPhuongTien model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QlvtCapPhepGplvPhuongTienSoap[soapModels.size()]);
	}

	public QlvtCapPhepGplvPhuongTienSoap() {
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

	public long getGiayPhepLienVanId() {
		return _giayPhepLienVanId;
	}

	public void setGiayPhepLienVanId(long giayPhepLienVanId) {
		_giayPhepLienVanId = giayPhepLienVanId;
	}

	public String getSoPhuHieu() {
		return _soPhuHieu;
	}

	public void setSoPhuHieu(String soPhuHieu) {
		_soPhuHieu = soPhuHieu;
	}

	public Date getNgayCapPhep() {
		return _ngayCapPhep;
	}

	public void setNgayCapPhep(Date ngayCapPhep) {
		_ngayCapPhep = ngayCapPhep;
	}

	public Date getNgayGiaHan() {
		return _ngayGiaHan;
	}

	public void setNgayGiaHan(Date ngayGiaHan) {
		_ngayGiaHan = ngayGiaHan;
	}

	public Date getNgayHetHan() {
		return _ngayHetHan;
	}

	public void setNgayHetHan(Date ngayHetHan) {
		_ngayHetHan = ngayHetHan;
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

	public String getHinhThucHoatDong() {
		return _hinhThucHoatDong;
	}

	public void setHinhThucHoatDong(String hinhThucHoatDong) {
		_hinhThucHoatDong = hinhThucHoatDong;
	}

	public Date getThoiHanPhuHieu() {
		return _thoiHanPhuHieu;
	}

	public void setThoiHanPhuHieu(Date thoiHanPhuHieu) {
		_thoiHanPhuHieu = thoiHanPhuHieu;
	}

	public int getSoHuu() {
		return _soHuu;
	}

	public void setSoHuu(int soHuu) {
		_soHuu = soHuu;
	}

	public String getChuSoHuu() {
		return _chuSoHuu;
	}

	public void setChuSoHuu(String chuSoHuu) {
		_chuSoHuu = chuSoHuu;
	}

	public Date getThoiHanChoThue() {
		return _thoiHanChoThue;
	}

	public void setThoiHanChoThue(Date thoiHanChoThue) {
		_thoiHanChoThue = thoiHanChoThue;
	}

	public int getHopDongSauCung() {
		return _hopDongSauCung;
	}

	public void setHopDongSauCung(int hopDongSauCung) {
		_hopDongSauCung = hopDongSauCung;
	}

	public String getMucPhi() {
		return _mucPhi;
	}

	public void setMucPhi(String mucPhi) {
		_mucPhi = mucPhi;
	}

	public String getThongTinXuLyViPham() {
		return _thongTinXuLyViPham;
	}

	public void setThongTinXuLyViPham(String thongTinXuLyViPham) {
		_thongTinXuLyViPham = thongTinXuLyViPham;
	}

	public String getTrangThai() {
		return _trangThai;
	}

	public void setTrangThai(String trangThai) {
		_trangThai = trangThai;
	}

	public long getFileId() {
		return _fileId;
	}

	public void setFileId(long fileId) {
		_fileId = fileId;
	}

	private long _id;
	private long _giayPhepLienVanId;
	private String _soPhuHieu;
	private Date _ngayCapPhep;
	private Date _ngayGiaHan;
	private Date _ngayHetHan;
	private String _cuaKhau;
	private String _maCuaKhau;
	private String _hinhThucHoatDong;
	private Date _thoiHanPhuHieu;
	private int _soHuu;
	private String _chuSoHuu;
	private Date _thoiHanChoThue;
	private int _hopDongSauCung;
	private String _mucPhi;
	private String _thongTinXuLyViPham;
	private String _trangThai;
	private long _fileId;
}