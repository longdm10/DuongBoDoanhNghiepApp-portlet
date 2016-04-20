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
public class QlvtLoaiHinhHoatDongDnSoap implements Serializable {
	public static QlvtLoaiHinhHoatDongDnSoap toSoapModel(
		QlvtLoaiHinhHoatDongDn model) {
		QlvtLoaiHinhHoatDongDnSoap soapModel = new QlvtLoaiHinhHoatDongDnSoap();

		soapModel.setId(model.getId());
		soapModel.setHoSoThuTucId(model.getHoSoThuTucId());
		soapModel.setNoiDungHoSoId(model.getNoiDungHoSoId());
		soapModel.setMaLoaiHinhHoatDong(model.getMaLoaiHinhHoatDong());
		soapModel.setMaMauSon(model.getMaMauSon());
		soapModel.setMaPhamViHoatDong(model.getMaPhamViHoatDong());
		soapModel.setSoLuongPhuongTien(model.getSoLuongPhuongTien());
		soapModel.setThietBiGiamSatHanhTrinh(model.getThietBiGiamSatHanhTrinh());

		return soapModel;
	}

	public static QlvtLoaiHinhHoatDongDnSoap[] toSoapModels(
		QlvtLoaiHinhHoatDongDn[] models) {
		QlvtLoaiHinhHoatDongDnSoap[] soapModels = new QlvtLoaiHinhHoatDongDnSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QlvtLoaiHinhHoatDongDnSoap[][] toSoapModels(
		QlvtLoaiHinhHoatDongDn[][] models) {
		QlvtLoaiHinhHoatDongDnSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QlvtLoaiHinhHoatDongDnSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QlvtLoaiHinhHoatDongDnSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QlvtLoaiHinhHoatDongDnSoap[] toSoapModels(
		List<QlvtLoaiHinhHoatDongDn> models) {
		List<QlvtLoaiHinhHoatDongDnSoap> soapModels = new ArrayList<QlvtLoaiHinhHoatDongDnSoap>(models.size());

		for (QlvtLoaiHinhHoatDongDn model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QlvtLoaiHinhHoatDongDnSoap[soapModels.size()]);
	}

	public QlvtLoaiHinhHoatDongDnSoap() {
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

	public long getHoSoThuTucId() {
		return _hoSoThuTucId;
	}

	public void setHoSoThuTucId(long hoSoThuTucId) {
		_hoSoThuTucId = hoSoThuTucId;
	}

	public long getNoiDungHoSoId() {
		return _noiDungHoSoId;
	}

	public void setNoiDungHoSoId(long noiDungHoSoId) {
		_noiDungHoSoId = noiDungHoSoId;
	}

	public String getMaLoaiHinhHoatDong() {
		return _maLoaiHinhHoatDong;
	}

	public void setMaLoaiHinhHoatDong(String maLoaiHinhHoatDong) {
		_maLoaiHinhHoatDong = maLoaiHinhHoatDong;
	}

	public String getMaMauSon() {
		return _maMauSon;
	}

	public void setMaMauSon(String maMauSon) {
		_maMauSon = maMauSon;
	}

	public String getMaPhamViHoatDong() {
		return _maPhamViHoatDong;
	}

	public void setMaPhamViHoatDong(String maPhamViHoatDong) {
		_maPhamViHoatDong = maPhamViHoatDong;
	}

	public String getSoLuongPhuongTien() {
		return _soLuongPhuongTien;
	}

	public void setSoLuongPhuongTien(String soLuongPhuongTien) {
		_soLuongPhuongTien = soLuongPhuongTien;
	}

	public String getThietBiGiamSatHanhTrinh() {
		return _thietBiGiamSatHanhTrinh;
	}

	public void setThietBiGiamSatHanhTrinh(String thietBiGiamSatHanhTrinh) {
		_thietBiGiamSatHanhTrinh = thietBiGiamSatHanhTrinh;
	}

	private long _id;
	private long _hoSoThuTucId;
	private long _noiDungHoSoId;
	private String _maLoaiHinhHoatDong;
	private String _maMauSon;
	private String _maPhamViHoatDong;
	private String _soLuongPhuongTien;
	private String _thietBiGiamSatHanhTrinh;
}