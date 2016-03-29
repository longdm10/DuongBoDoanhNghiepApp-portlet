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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.quocte.service.http.QlvtXuLyKTTQuocTeDiemDungNghiServiceSoap}.
 *
 * @author NoiPham
 * @see vn.dtt.duongbo.dao.quocte.service.http.QlvtXuLyKTTQuocTeDiemDungNghiServiceSoap
 * @generated
 */
public class QlvtXuLyKTTQuocTeDiemDungNghiSoap implements Serializable {
	public static QlvtXuLyKTTQuocTeDiemDungNghiSoap toSoapModel(
		QlvtXuLyKTTQuocTeDiemDungNghi model) {
		QlvtXuLyKTTQuocTeDiemDungNghiSoap soapModel = new QlvtXuLyKTTQuocTeDiemDungNghiSoap();

		soapModel.setId(model.getId());
		soapModel.setKttQuocTeId(model.getKttQuocTeId());
		soapModel.setLoaiLuot(model.getLoaiLuot());
		soapModel.setSoThuTuLuot(model.getSoThuTuLuot());
		soapModel.setMaBen(model.getMaBen());
		soapModel.setSoGioDungNghi(model.getSoGioDungNghi());
		soapModel.setSoPhutDungNghi(model.getSoPhutDungNghi());

		return soapModel;
	}

	public static QlvtXuLyKTTQuocTeDiemDungNghiSoap[] toSoapModels(
		QlvtXuLyKTTQuocTeDiemDungNghi[] models) {
		QlvtXuLyKTTQuocTeDiemDungNghiSoap[] soapModels = new QlvtXuLyKTTQuocTeDiemDungNghiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QlvtXuLyKTTQuocTeDiemDungNghiSoap[][] toSoapModels(
		QlvtXuLyKTTQuocTeDiemDungNghi[][] models) {
		QlvtXuLyKTTQuocTeDiemDungNghiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QlvtXuLyKTTQuocTeDiemDungNghiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QlvtXuLyKTTQuocTeDiemDungNghiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QlvtXuLyKTTQuocTeDiemDungNghiSoap[] toSoapModels(
		List<QlvtXuLyKTTQuocTeDiemDungNghi> models) {
		List<QlvtXuLyKTTQuocTeDiemDungNghiSoap> soapModels = new ArrayList<QlvtXuLyKTTQuocTeDiemDungNghiSoap>(models.size());

		for (QlvtXuLyKTTQuocTeDiemDungNghi model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QlvtXuLyKTTQuocTeDiemDungNghiSoap[soapModels.size()]);
	}

	public QlvtXuLyKTTQuocTeDiemDungNghiSoap() {
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

	public int getSoGioDungNghi() {
		return _soGioDungNghi;
	}

	public void setSoGioDungNghi(int soGioDungNghi) {
		_soGioDungNghi = soGioDungNghi;
	}

	public int getSoPhutDungNghi() {
		return _soPhutDungNghi;
	}

	public void setSoPhutDungNghi(int soPhutDungNghi) {
		_soPhutDungNghi = soPhutDungNghi;
	}

	private long _id;
	private int _kttQuocTeId;
	private String _loaiLuot;
	private int _soThuTuLuot;
	private String _maBen;
	private int _soGioDungNghi;
	private int _soPhutDungNghi;
}