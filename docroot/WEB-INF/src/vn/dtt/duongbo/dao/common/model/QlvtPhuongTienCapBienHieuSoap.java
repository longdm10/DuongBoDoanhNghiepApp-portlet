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
public class QlvtPhuongTienCapBienHieuSoap implements Serializable {
	public static QlvtPhuongTienCapBienHieuSoap toSoapModel(
		QlvtPhuongTienCapBienHieu model) {
		QlvtPhuongTienCapBienHieuSoap soapModel = new QlvtPhuongTienCapBienHieuSoap();

		soapModel.setId(model.getId());
		soapModel.setNhanHieu(model.getNhanHieu());
		soapModel.setBienSo(model.getBienSo());
		soapModel.setSoKhung(model.getSoKhung());
		soapModel.setSoMay(model.getSoMay());
		soapModel.setNamSanXuat(model.getNamSanXuat());
		soapModel.setMauSon(model.getMauSon());
		soapModel.setSoChoNgoi(model.getSoChoNgoi());
		soapModel.setNoiDungHoSoId(model.getNoiDungHoSoId());
		soapModel.setHoSoThuTucId(model.getHoSoThuTucId());

		return soapModel;
	}

	public static QlvtPhuongTienCapBienHieuSoap[] toSoapModels(
		QlvtPhuongTienCapBienHieu[] models) {
		QlvtPhuongTienCapBienHieuSoap[] soapModels = new QlvtPhuongTienCapBienHieuSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QlvtPhuongTienCapBienHieuSoap[][] toSoapModels(
		QlvtPhuongTienCapBienHieu[][] models) {
		QlvtPhuongTienCapBienHieuSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QlvtPhuongTienCapBienHieuSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QlvtPhuongTienCapBienHieuSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QlvtPhuongTienCapBienHieuSoap[] toSoapModels(
		List<QlvtPhuongTienCapBienHieu> models) {
		List<QlvtPhuongTienCapBienHieuSoap> soapModels = new ArrayList<QlvtPhuongTienCapBienHieuSoap>(models.size());

		for (QlvtPhuongTienCapBienHieu model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QlvtPhuongTienCapBienHieuSoap[soapModels.size()]);
	}

	public QlvtPhuongTienCapBienHieuSoap() {
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

	public String getSoKhung() {
		return _SoKhung;
	}

	public void setSoKhung(String SoKhung) {
		_SoKhung = SoKhung;
	}

	public String getSoMay() {
		return _SoMay;
	}

	public void setSoMay(String SoMay) {
		_SoMay = SoMay;
	}

	public String getNamSanXuat() {
		return _NamSanXuat;
	}

	public void setNamSanXuat(String NamSanXuat) {
		_NamSanXuat = NamSanXuat;
	}

	public String getMauSon() {
		return _MauSon;
	}

	public void setMauSon(String MauSon) {
		_MauSon = MauSon;
	}

	public long getSoChoNgoi() {
		return _SoChoNgoi;
	}

	public void setSoChoNgoi(long SoChoNgoi) {
		_SoChoNgoi = SoChoNgoi;
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
	private String _SoKhung;
	private String _SoMay;
	private String _NamSanXuat;
	private String _MauSon;
	private long _SoChoNgoi;
	private long _NoiDungHoSoId;
	private long _HoSoThuTucId;
}