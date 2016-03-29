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

package vn.dtt.duongbo.dao.common.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author win_64
 * @generated
 */
public class QlvtPhuongTienDangKyVietLaoSoap implements Serializable {
	public static QlvtPhuongTienDangKyVietLaoSoap toSoapModel(
		QlvtPhuongTienDangKyVietLao model) {
		QlvtPhuongTienDangKyVietLaoSoap soapModel = new QlvtPhuongTienDangKyVietLaoSoap();

		soapModel.setId(model.getId());
		soapModel.setBienSo(model.getBienSo());
		soapModel.setTenDangKySoHuu(model.getTenDangKySoHuu());
		soapModel.setNhanHieu(model.getNhanHieu());
		soapModel.setTrongTai(model.getTrongTai());
		soapModel.setNamSanXuat(model.getNamSanXuat());
		soapModel.setCuaKhauXuatNhap(model.getCuaKhauXuatNhap());
		soapModel.setHinhThucHoatDong(model.getHinhThucHoatDong());
		soapModel.setLoaiHinhHoatDong(model.getLoaiHinhHoatDong());
		soapModel.setTuyenHoatDong(model.getTuyenHoatDong());
		soapModel.setThoiGianXinCapPhepTu(model.getThoiGianXinCapPhepTu());
		soapModel.setThoiGianXinCapPhepDen(model.getThoiGianXinCapPhepDen());
		soapModel.setSoKhung(model.getSoKhung());
		soapModel.setMauSon(model.getMauSon());
		soapModel.setSoMay(model.getSoMay());
		soapModel.setLoaiHangVanChuyen(model.getLoaiHangVanChuyen());
		soapModel.setThoiGianDuKienKhoiHanh(model.getThoiGianDuKienKhoiHanh());
		soapModel.setNoiDungHoSoId(model.getNoiDungHoSoId());
		soapModel.setHoSoThuTucId(model.getHoSoThuTucId());

		return soapModel;
	}

	public static QlvtPhuongTienDangKyVietLaoSoap[] toSoapModels(
		QlvtPhuongTienDangKyVietLao[] models) {
		QlvtPhuongTienDangKyVietLaoSoap[] soapModels = new QlvtPhuongTienDangKyVietLaoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QlvtPhuongTienDangKyVietLaoSoap[][] toSoapModels(
		QlvtPhuongTienDangKyVietLao[][] models) {
		QlvtPhuongTienDangKyVietLaoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QlvtPhuongTienDangKyVietLaoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QlvtPhuongTienDangKyVietLaoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QlvtPhuongTienDangKyVietLaoSoap[] toSoapModels(
		List<QlvtPhuongTienDangKyVietLao> models) {
		List<QlvtPhuongTienDangKyVietLaoSoap> soapModels = new ArrayList<QlvtPhuongTienDangKyVietLaoSoap>(models.size());

		for (QlvtPhuongTienDangKyVietLao model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QlvtPhuongTienDangKyVietLaoSoap[soapModels.size()]);
	}

	public QlvtPhuongTienDangKyVietLaoSoap() {
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

	public String getBienSo() {
		return _BienSo;
	}

	public void setBienSo(String BienSo) {
		_BienSo = BienSo;
	}

	public String getTenDangKySoHuu() {
		return _TenDangKySoHuu;
	}

	public void setTenDangKySoHuu(String TenDangKySoHuu) {
		_TenDangKySoHuu = TenDangKySoHuu;
	}

	public String getNhanHieu() {
		return _NhanHieu;
	}

	public void setNhanHieu(String NhanHieu) {
		_NhanHieu = NhanHieu;
	}

	public String getTrongTai() {
		return _TrongTai;
	}

	public void setTrongTai(String TrongTai) {
		_TrongTai = TrongTai;
	}

	public String getNamSanXuat() {
		return _NamSanXuat;
	}

	public void setNamSanXuat(String NamSanXuat) {
		_NamSanXuat = NamSanXuat;
	}

	public String getCuaKhauXuatNhap() {
		return _CuaKhauXuatNhap;
	}

	public void setCuaKhauXuatNhap(String CuaKhauXuatNhap) {
		_CuaKhauXuatNhap = CuaKhauXuatNhap;
	}

	public String getHinhThucHoatDong() {
		return _HinhThucHoatDong;
	}

	public void setHinhThucHoatDong(String HinhThucHoatDong) {
		_HinhThucHoatDong = HinhThucHoatDong;
	}

	public String getLoaiHinhHoatDong() {
		return _LoaiHinhHoatDong;
	}

	public void setLoaiHinhHoatDong(String LoaiHinhHoatDong) {
		_LoaiHinhHoatDong = LoaiHinhHoatDong;
	}

	public String getTuyenHoatDong() {
		return _TuyenHoatDong;
	}

	public void setTuyenHoatDong(String TuyenHoatDong) {
		_TuyenHoatDong = TuyenHoatDong;
	}

	public Date getThoiGianXinCapPhepTu() {
		return _ThoiGianXinCapPhepTu;
	}

	public void setThoiGianXinCapPhepTu(Date ThoiGianXinCapPhepTu) {
		_ThoiGianXinCapPhepTu = ThoiGianXinCapPhepTu;
	}

	public Date getThoiGianXinCapPhepDen() {
		return _ThoiGianXinCapPhepDen;
	}

	public void setThoiGianXinCapPhepDen(Date ThoiGianXinCapPhepDen) {
		_ThoiGianXinCapPhepDen = ThoiGianXinCapPhepDen;
	}

	public String getSoKhung() {
		return _SoKhung;
	}

	public void setSoKhung(String SoKhung) {
		_SoKhung = SoKhung;
	}

	public String getMauSon() {
		return _MauSon;
	}

	public void setMauSon(String MauSon) {
		_MauSon = MauSon;
	}

	public String getSoMay() {
		return _SoMay;
	}

	public void setSoMay(String SoMay) {
		_SoMay = SoMay;
	}

	public String getLoaiHangVanChuyen() {
		return _LoaiHangVanChuyen;
	}

	public void setLoaiHangVanChuyen(String LoaiHangVanChuyen) {
		_LoaiHangVanChuyen = LoaiHangVanChuyen;
	}

	public Date getThoiGianDuKienKhoiHanh() {
		return _ThoiGianDuKienKhoiHanh;
	}

	public void setThoiGianDuKienKhoiHanh(Date ThoiGianDuKienKhoiHanh) {
		_ThoiGianDuKienKhoiHanh = ThoiGianDuKienKhoiHanh;
	}

	public long getNoiDungHoSoId() {
		return _NoiDungHoSoId;
	}

	public void setNoiDungHoSoId(long NoiDungHoSoId) {
		_NoiDungHoSoId = NoiDungHoSoId;
	}

	public long getHoSoThuTucId() {
		return _HoSoThuTucId;
	}

	public void setHoSoThuTucId(long HoSoThuTucId) {
		_HoSoThuTucId = HoSoThuTucId;
	}

	private long _id;
	private String _BienSo;
	private String _TenDangKySoHuu;
	private String _NhanHieu;
	private String _TrongTai;
	private String _NamSanXuat;
	private String _CuaKhauXuatNhap;
	private String _HinhThucHoatDong;
	private String _LoaiHinhHoatDong;
	private String _TuyenHoatDong;
	private Date _ThoiGianXinCapPhepTu;
	private Date _ThoiGianXinCapPhepDen;
	private String _SoKhung;
	private String _MauSon;
	private String _SoMay;
	private String _LoaiHangVanChuyen;
	private Date _ThoiGianDuKienKhoiHanh;
	private long _NoiDungHoSoId;
	private long _HoSoThuTucId;
}