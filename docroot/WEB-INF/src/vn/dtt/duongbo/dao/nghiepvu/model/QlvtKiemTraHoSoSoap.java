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

package vn.dtt.duongbo.dao.nghiepvu.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.nghiepvu.service.http.QlvtKiemTraHoSoServiceSoap}.
 *
 * @author NhanNc
 * @see vn.dtt.duongbo.dao.nghiepvu.service.http.QlvtKiemTraHoSoServiceSoap
 * @generated
 */
public class QlvtKiemTraHoSoSoap implements Serializable {
	public static QlvtKiemTraHoSoSoap toSoapModel(QlvtKiemTraHoSo model) {
		QlvtKiemTraHoSoSoap soapModel = new QlvtKiemTraHoSoSoap();

		soapModel.setId(model.getId());
		soapModel.setThongTinXuLyId(model.getThongTinXuLyId());
		soapModel.setIdNoiDungThamTra(model.getIdNoiDungThamTra());
		soapModel.setYKienThamTra(model.getYKienThamTra());
		soapModel.setKetQuaXuLy(model.getKetQuaXuLy());
		soapModel.setMaSoHoSo(model.getMaSoHoSo());
		soapModel.setYKienDanhGia(model.getYKienDanhGia());

		return soapModel;
	}

	public static QlvtKiemTraHoSoSoap[] toSoapModels(QlvtKiemTraHoSo[] models) {
		QlvtKiemTraHoSoSoap[] soapModels = new QlvtKiemTraHoSoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QlvtKiemTraHoSoSoap[][] toSoapModels(
		QlvtKiemTraHoSo[][] models) {
		QlvtKiemTraHoSoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QlvtKiemTraHoSoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QlvtKiemTraHoSoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QlvtKiemTraHoSoSoap[] toSoapModels(
		List<QlvtKiemTraHoSo> models) {
		List<QlvtKiemTraHoSoSoap> soapModels = new ArrayList<QlvtKiemTraHoSoSoap>(models.size());

		for (QlvtKiemTraHoSo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QlvtKiemTraHoSoSoap[soapModels.size()]);
	}

	public QlvtKiemTraHoSoSoap() {
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

	public int getIdNoiDungThamTra() {
		return _idNoiDungThamTra;
	}

	public void setIdNoiDungThamTra(int idNoiDungThamTra) {
		_idNoiDungThamTra = idNoiDungThamTra;
	}

	public String getYKienThamTra() {
		return _yKienThamTra;
	}

	public void setYKienThamTra(String yKienThamTra) {
		_yKienThamTra = yKienThamTra;
	}

	public int getKetQuaXuLy() {
		return _ketQuaXuLy;
	}

	public void setKetQuaXuLy(int ketQuaXuLy) {
		_ketQuaXuLy = ketQuaXuLy;
	}

	public int getMaSoHoSo() {
		return _maSoHoSo;
	}

	public void setMaSoHoSo(int maSoHoSo) {
		_maSoHoSo = maSoHoSo;
	}

	public String getYKienDanhGia() {
		return _yKienDanhGia;
	}

	public void setYKienDanhGia(String yKienDanhGia) {
		_yKienDanhGia = yKienDanhGia;
	}

	private long _id;
	private int _thongTinXuLyId;
	private int _idNoiDungThamTra;
	private String _yKienThamTra;
	private int _ketQuaXuLy;
	private int _maSoHoSo;
	private String _yKienDanhGia;
}