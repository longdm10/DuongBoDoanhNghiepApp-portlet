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

package vn.dtt.duongbo.dao.doanhnghiep.model;

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
public class DnDoanhNghiepUserSoap implements Serializable {
	public static DnDoanhNghiepUserSoap toSoapModel(DnDoanhNghiepUser model) {
		DnDoanhNghiepUserSoap soapModel = new DnDoanhNghiepUserSoap();

		soapModel.setId(model.getId());
		soapModel.setNguoiLamThuTucId(model.getNguoiLamThuTucId());
		soapModel.setUserId(model.getUserId());
		soapModel.setToChucQuanLy(model.getToChucQuanLy());
		soapModel.setMaster(model.getMaster());
		soapModel.setTenTaiKhoan(model.getTenTaiKhoan());
		soapModel.setTenNguoiDung(model.getTenNguoiDung());
		soapModel.setTinhTrangHoatDong(model.getTinhTrangHoatDong());
		soapModel.setDienThoai(model.getDienThoai());
		soapModel.setNgayTaoTaiKhoan(model.getNgayTaoTaiKhoan());
		soapModel.setNgayMoTaiKhoan(model.getNgayMoTaiKhoan());

		return soapModel;
	}

	public static DnDoanhNghiepUserSoap[] toSoapModels(
		DnDoanhNghiepUser[] models) {
		DnDoanhNghiepUserSoap[] soapModels = new DnDoanhNghiepUserSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DnDoanhNghiepUserSoap[][] toSoapModels(
		DnDoanhNghiepUser[][] models) {
		DnDoanhNghiepUserSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DnDoanhNghiepUserSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DnDoanhNghiepUserSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DnDoanhNghiepUserSoap[] toSoapModels(
		List<DnDoanhNghiepUser> models) {
		List<DnDoanhNghiepUserSoap> soapModels = new ArrayList<DnDoanhNghiepUserSoap>(models.size());

		for (DnDoanhNghiepUser model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DnDoanhNghiepUserSoap[soapModels.size()]);
	}

	public DnDoanhNghiepUserSoap() {
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

	public long getNguoiLamThuTucId() {
		return _nguoiLamThuTucId;
	}

	public void setNguoiLamThuTucId(long nguoiLamThuTucId) {
		_nguoiLamThuTucId = nguoiLamThuTucId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getToChucQuanLy() {
		return _toChucQuanLy;
	}

	public void setToChucQuanLy(String toChucQuanLy) {
		_toChucQuanLy = toChucQuanLy;
	}

	public String getMaster() {
		return _master;
	}

	public void setMaster(String master) {
		_master = master;
	}

	public String getTenTaiKhoan() {
		return _tenTaiKhoan;
	}

	public void setTenTaiKhoan(String tenTaiKhoan) {
		_tenTaiKhoan = tenTaiKhoan;
	}

	public String getTenNguoiDung() {
		return _tenNguoiDung;
	}

	public void setTenNguoiDung(String tenNguoiDung) {
		_tenNguoiDung = tenNguoiDung;
	}

	public String getTinhTrangHoatDong() {
		return _tinhTrangHoatDong;
	}

	public void setTinhTrangHoatDong(String tinhTrangHoatDong) {
		_tinhTrangHoatDong = tinhTrangHoatDong;
	}

	public String getDienThoai() {
		return _dienThoai;
	}

	public void setDienThoai(String dienThoai) {
		_dienThoai = dienThoai;
	}

	public Date getNgayTaoTaiKhoan() {
		return _ngayTaoTaiKhoan;
	}

	public void setNgayTaoTaiKhoan(Date ngayTaoTaiKhoan) {
		_ngayTaoTaiKhoan = ngayTaoTaiKhoan;
	}

	public Date getNgayMoTaiKhoan() {
		return _ngayMoTaiKhoan;
	}

	public void setNgayMoTaiKhoan(Date ngayMoTaiKhoan) {
		_ngayMoTaiKhoan = ngayMoTaiKhoan;
	}

	private long _id;
	private long _nguoiLamThuTucId;
	private long _userId;
	private String _toChucQuanLy;
	private String _master;
	private String _tenTaiKhoan;
	private String _tenNguoiDung;
	private String _tinhTrangHoatDong;
	private String _dienThoai;
	private Date _ngayTaoTaiKhoan;
	private Date _ngayMoTaiKhoan;
}