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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.quocte.service.http.QlvtXuLyKTTQuocTeServiceSoap}.
 *
 * @author NoiPham
 * @see vn.dtt.duongbo.dao.quocte.service.http.QlvtXuLyKTTQuocTeServiceSoap
 * @generated
 */
public class QlvtXuLyKTTQuocTeSoap implements Serializable {
	public static QlvtXuLyKTTQuocTeSoap toSoapModel(QlvtXuLyKTTQuocTe model) {
		QlvtXuLyKTTQuocTeSoap soapModel = new QlvtXuLyKTTQuocTeSoap();

		soapModel.setId(model.getId());
		soapModel.setThongTinXuLyId(model.getThongTinXuLyId());
		soapModel.setLoaiCapPhep(model.getLoaiCapPhep());
		soapModel.setBenDi(model.getBenDi());
		soapModel.setDiemDi(model.getDiemDi());
		soapModel.setBenDen(model.getBenDen());
		soapModel.setDiemDen(model.getDiemDen());
		soapModel.setCuLyVanChuyen(model.getCuLyVanChuyen());
		soapModel.setHanhTrinhChay(model.getHanhTrinhChay());
		soapModel.setCuaKhau(model.getCuaKhau());
		soapModel.setKetQuaDanhGiaGPVT(model.getKetQuaDanhGiaGPVT());
		soapModel.setLyDoKhongDat(model.getLyDoKhongDat());

		return soapModel;
	}

	public static QlvtXuLyKTTQuocTeSoap[] toSoapModels(
		QlvtXuLyKTTQuocTe[] models) {
		QlvtXuLyKTTQuocTeSoap[] soapModels = new QlvtXuLyKTTQuocTeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QlvtXuLyKTTQuocTeSoap[][] toSoapModels(
		QlvtXuLyKTTQuocTe[][] models) {
		QlvtXuLyKTTQuocTeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QlvtXuLyKTTQuocTeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QlvtXuLyKTTQuocTeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QlvtXuLyKTTQuocTeSoap[] toSoapModels(
		List<QlvtXuLyKTTQuocTe> models) {
		List<QlvtXuLyKTTQuocTeSoap> soapModels = new ArrayList<QlvtXuLyKTTQuocTeSoap>(models.size());

		for (QlvtXuLyKTTQuocTe model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QlvtXuLyKTTQuocTeSoap[soapModels.size()]);
	}

	public QlvtXuLyKTTQuocTeSoap() {
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

	public int getThongTinXuLyId() {
		return _thongTinXuLyId;
	}

	public void setThongTinXuLyId(int thongTinXuLyId) {
		_thongTinXuLyId = thongTinXuLyId;
	}

	public String getLoaiCapPhep() {
		return _loaiCapPhep;
	}

	public void setLoaiCapPhep(String loaiCapPhep) {
		_loaiCapPhep = loaiCapPhep;
	}

	public String getBenDi() {
		return _benDi;
	}

	public void setBenDi(String benDi) {
		_benDi = benDi;
	}

	public String getDiemDi() {
		return _diemDi;
	}

	public void setDiemDi(String diemDi) {
		_diemDi = diemDi;
	}

	public String getBenDen() {
		return _benDen;
	}

	public void setBenDen(String benDen) {
		_benDen = benDen;
	}

	public String getDiemDen() {
		return _diemDen;
	}

	public void setDiemDen(String diemDen) {
		_diemDen = diemDen;
	}

	public int getCuLyVanChuyen() {
		return _cuLyVanChuyen;
	}

	public void setCuLyVanChuyen(int cuLyVanChuyen) {
		_cuLyVanChuyen = cuLyVanChuyen;
	}

	public String getHanhTrinhChay() {
		return _hanhTrinhChay;
	}

	public void setHanhTrinhChay(String hanhTrinhChay) {
		_hanhTrinhChay = hanhTrinhChay;
	}

	public String getCuaKhau() {
		return _cuaKhau;
	}

	public void setCuaKhau(String cuaKhau) {
		_cuaKhau = cuaKhau;
	}

	public String getKetQuaDanhGiaGPVT() {
		return _ketQuaDanhGiaGPVT;
	}

	public void setKetQuaDanhGiaGPVT(String ketQuaDanhGiaGPVT) {
		_ketQuaDanhGiaGPVT = ketQuaDanhGiaGPVT;
	}

	public String getLyDoKhongDat() {
		return _lyDoKhongDat;
	}

	public void setLyDoKhongDat(String lyDoKhongDat) {
		_lyDoKhongDat = lyDoKhongDat;
	}

	private long _id;
	private int _thongTinXuLyId;
	private String _loaiCapPhep;
	private String _benDi;
	private String _diemDi;
	private String _benDen;
	private String _diemDen;
	private int _cuLyVanChuyen;
	private String _hanhTrinhChay;
	private String _cuaKhau;
	private String _ketQuaDanhGiaGPVT;
	private String _lyDoKhongDat;
}