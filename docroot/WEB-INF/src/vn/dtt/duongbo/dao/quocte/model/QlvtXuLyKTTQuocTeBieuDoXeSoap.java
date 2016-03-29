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
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.quocte.service.http.QlvtXuLyKTTQuocTeBieuDoXeServiceSoap}.
 *
 * @author NoiPham
 * @see vn.dtt.duongbo.dao.quocte.service.http.QlvtXuLyKTTQuocTeBieuDoXeServiceSoap
 * @generated
 */
public class QlvtXuLyKTTQuocTeBieuDoXeSoap implements Serializable {
	public static QlvtXuLyKTTQuocTeBieuDoXeSoap toSoapModel(
		QlvtXuLyKTTQuocTeBieuDoXe model) {
		QlvtXuLyKTTQuocTeBieuDoXeSoap soapModel = new QlvtXuLyKTTQuocTeBieuDoXeSoap();

		soapModel.setId(model.getId());
		soapModel.setKttQuocTeId(model.getKttQuocTeId());
		soapModel.setLoaiLuot(model.getLoaiLuot());
		soapModel.setSoThuTuLuot(model.getSoThuTuLuot());
		soapModel.setMaBen(model.getMaBen());
		soapModel.setGioXuatBen(model.getGioXuatBen());
		soapModel.setPhuXuatBen(model.getPhuXuatBen());
		soapModel.setTanXuat(model.getTanXuat());

		return soapModel;
	}

	public static QlvtXuLyKTTQuocTeBieuDoXeSoap[] toSoapModels(
		QlvtXuLyKTTQuocTeBieuDoXe[] models) {
		QlvtXuLyKTTQuocTeBieuDoXeSoap[] soapModels = new QlvtXuLyKTTQuocTeBieuDoXeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QlvtXuLyKTTQuocTeBieuDoXeSoap[][] toSoapModels(
		QlvtXuLyKTTQuocTeBieuDoXe[][] models) {
		QlvtXuLyKTTQuocTeBieuDoXeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QlvtXuLyKTTQuocTeBieuDoXeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QlvtXuLyKTTQuocTeBieuDoXeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QlvtXuLyKTTQuocTeBieuDoXeSoap[] toSoapModels(
		List<QlvtXuLyKTTQuocTeBieuDoXe> models) {
		List<QlvtXuLyKTTQuocTeBieuDoXeSoap> soapModels = new ArrayList<QlvtXuLyKTTQuocTeBieuDoXeSoap>(models.size());

		for (QlvtXuLyKTTQuocTeBieuDoXe model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QlvtXuLyKTTQuocTeBieuDoXeSoap[soapModels.size()]);
	}

	public QlvtXuLyKTTQuocTeBieuDoXeSoap() {
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

	public int getKttQuocTeId() {
		return _kttQuocTeId;
	}

	public void setKttQuocTeId(int kttQuocTeId) {
		_kttQuocTeId = kttQuocTeId;
	}

	public String getLoaiLuot() {
		return _loaiLuot;
	}

	public void setLoaiLuot(String loaiLuot) {
		_loaiLuot = loaiLuot;
	}

	public int getSoThuTuLuot() {
		return _soThuTuLuot;
	}

	public void setSoThuTuLuot(int soThuTuLuot) {
		_soThuTuLuot = soThuTuLuot;
	}

	public String getMaBen() {
		return _maBen;
	}

	public void setMaBen(String maBen) {
		_maBen = maBen;
	}

	public int getGioXuatBen() {
		return _gioXuatBen;
	}

	public void setGioXuatBen(int gioXuatBen) {
		_gioXuatBen = gioXuatBen;
	}

	public int getPhuXuatBen() {
		return _phuXuatBen;
	}

	public void setPhuXuatBen(int phuXuatBen) {
		_phuXuatBen = phuXuatBen;
	}

	public int getTanXuat() {
		return _tanXuat;
	}

	public void setTanXuat(int tanXuat) {
		_tanXuat = tanXuat;
	}

	private long _id;
	private int _kttQuocTeId;
	private String _loaiLuot;
	private int _soThuTuLuot;
	private String _maBen;
	private int _gioXuatBen;
	private int _phuXuatBen;
	private int _tanXuat;
}