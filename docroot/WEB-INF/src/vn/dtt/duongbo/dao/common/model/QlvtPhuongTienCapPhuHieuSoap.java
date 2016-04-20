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
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author win_64
 * @generated
 */
public class QlvtPhuongTienCapPhuHieuSoap implements Serializable {
	public static QlvtPhuongTienCapPhuHieuSoap toSoapModel(
		QlvtPhuongTienCapPhuHieu model) {
		QlvtPhuongTienCapPhuHieuSoap soapModel = new QlvtPhuongTienCapPhuHieuSoap();

		soapModel.setId(model.getId());
		soapModel.setNhanHieu(model.getNhanHieu());
		soapModel.setBienSo(model.getBienSo());
		soapModel.setTrongTai(model.getTrongTai());
		soapModel.setNuocSanXuat(model.getNuocSanXuat());
		soapModel.setNamSanXuat(model.getNamSanXuat());
		soapModel.setTuyenHoatDong(model.getTuyenHoatDong());
		soapModel.setLoaiHinhHoatDong(model.getLoaiHinhHoatDong());
		soapModel.setNoiDungHoSoId(model.getNoiDungHoSoId());
		soapModel.setHoSoThuTucId(model.getHoSoThuTucId());

		return soapModel;
	}

	public static QlvtPhuongTienCapPhuHieuSoap[] toSoapModels(
		QlvtPhuongTienCapPhuHieu[] models) {
		QlvtPhuongTienCapPhuHieuSoap[] soapModels = new QlvtPhuongTienCapPhuHieuSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QlvtPhuongTienCapPhuHieuSoap[][] toSoapModels(
		QlvtPhuongTienCapPhuHieu[][] models) {
		QlvtPhuongTienCapPhuHieuSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QlvtPhuongTienCapPhuHieuSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QlvtPhuongTienCapPhuHieuSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QlvtPhuongTienCapPhuHieuSoap[] toSoapModels(
		List<QlvtPhuongTienCapPhuHieu> models) {
		List<QlvtPhuongTienCapPhuHieuSoap> soapModels = new ArrayList<QlvtPhuongTienCapPhuHieuSoap>(models.size());

		for (QlvtPhuongTienCapPhuHieu model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QlvtPhuongTienCapPhuHieuSoap[soapModels.size()]);
	}

	public QlvtPhuongTienCapPhuHieuSoap() {
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

	public String getNhanHieu() {
		return _NhanHieu;
	}

	public void setNhanHieu(String NhanHieu) {
		_NhanHieu = NhanHieu;
	}

	public String getBienSo() {
		return _BienSo;
	}

	public void setBienSo(String BienSo) {
		_BienSo = BienSo;
	}

	public long getTrongTai() {
		return _TrongTai;
	}

	public void setTrongTai(long TrongTai) {
		_TrongTai = TrongTai;
	}

	public String getNuocSanXuat() {
		return _NuocSanXuat;
	}

	public void setNuocSanXuat(String NuocSanXuat) {
		_NuocSanXuat = NuocSanXuat;
	}

	public String getNamSanXuat() {
		return _NamSanXuat;
	}

	public void setNamSanXuat(String NamSanXuat) {
		_NamSanXuat = NamSanXuat;
	}

	public String getTuyenHoatDong() {
		return _TuyenHoatDong;
	}

	public void setTuyenHoatDong(String TuyenHoatDong) {
		_TuyenHoatDong = TuyenHoatDong;
	}

	public String getLoaiHinhHoatDong() {
		return _LoaiHinhHoatDong;
	}

	public void setLoaiHinhHoatDong(String LoaiHinhHoatDong) {
		_LoaiHinhHoatDong = LoaiHinhHoatDong;
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
	private String _NhanHieu;
	private String _BienSo;
	private long _TrongTai;
	private String _NuocSanXuat;
	private String _NamSanXuat;
	private String _TuyenHoatDong;
	private String _LoaiHinhHoatDong;
	private long _NoiDungHoSoId;
	private long _HoSoThuTucId;
}