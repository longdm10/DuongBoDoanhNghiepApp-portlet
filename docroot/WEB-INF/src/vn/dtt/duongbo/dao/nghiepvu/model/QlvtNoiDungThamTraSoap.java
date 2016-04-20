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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.nghiepvu.service.http.QlvtNoiDungThamTraServiceSoap}.
 *
 * @author NhanNc
 * @see vn.dtt.duongbo.dao.nghiepvu.service.http.QlvtNoiDungThamTraServiceSoap
 * @generated
 */
public class QlvtNoiDungThamTraSoap implements Serializable {
	public static QlvtNoiDungThamTraSoap toSoapModel(QlvtNoiDungThamTra model) {
		QlvtNoiDungThamTraSoap soapModel = new QlvtNoiDungThamTraSoap();

		soapModel.setId(model.getId());
		soapModel.setMucKiemTra(model.getMucKiemTra());
		soapModel.setChaId(model.getChaId());
		soapModel.setCoYKien(model.getCoYKien());
		soapModel.setBuocXuLy(model.getBuocXuLy());
		soapModel.setThuTuHienThi(model.getThuTuHienThi());
		soapModel.setTthcNoiDungThamTraId(model.getTthcNoiDungThamTraId());
		soapModel.setTienTo(model.getTienTo());
		soapModel.setThanhPhanHoSo(model.getThanhPhanHoSo());

		return soapModel;
	}

	public static QlvtNoiDungThamTraSoap[] toSoapModels(
		QlvtNoiDungThamTra[] models) {
		QlvtNoiDungThamTraSoap[] soapModels = new QlvtNoiDungThamTraSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QlvtNoiDungThamTraSoap[][] toSoapModels(
		QlvtNoiDungThamTra[][] models) {
		QlvtNoiDungThamTraSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QlvtNoiDungThamTraSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QlvtNoiDungThamTraSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QlvtNoiDungThamTraSoap[] toSoapModels(
		List<QlvtNoiDungThamTra> models) {
		List<QlvtNoiDungThamTraSoap> soapModels = new ArrayList<QlvtNoiDungThamTraSoap>(models.size());

		for (QlvtNoiDungThamTra model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QlvtNoiDungThamTraSoap[soapModels.size()]);
	}

	public QlvtNoiDungThamTraSoap() {
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

	public String getMucKiemTra() {
		return _mucKiemTra;
	}

	public void setMucKiemTra(String mucKiemTra) {
		_mucKiemTra = mucKiemTra;
	}

	public int getChaId() {
		return _chaId;
	}

	public void setChaId(int chaId) {
		_chaId = chaId;
	}

	public int getCoYKien() {
		return _coYKien;
	}

	public void setCoYKien(int coYKien) {
		_coYKien = coYKien;
	}

	public int getBuocXuLy() {
		return _buocXuLy;
	}

	public void setBuocXuLy(int buocXuLy) {
		_buocXuLy = buocXuLy;
	}

	public int getThuTuHienThi() {
		return _thuTuHienThi;
	}

	public void setThuTuHienThi(int thuTuHienThi) {
		_thuTuHienThi = thuTuHienThi;
	}

	public int getTthcNoiDungThamTraId() {
		return _tthcNoiDungThamTraId;
	}

	public void setTthcNoiDungThamTraId(int tthcNoiDungThamTraId) {
		_tthcNoiDungThamTraId = tthcNoiDungThamTraId;
	}

	public String getTienTo() {
		return _tienTo;
	}

	public void setTienTo(String tienTo) {
		_tienTo = tienTo;
	}

	public String getThanhPhanHoSo() {
		return _thanhPhanHoSo;
	}

	public void setThanhPhanHoSo(String thanhPhanHoSo) {
		_thanhPhanHoSo = thanhPhanHoSo;
	}

	private long _id;
	private String _mucKiemTra;
	private int _chaId;
	private int _coYKien;
	private int _buocXuLy;
	private int _thuTuHienThi;
	private int _tthcNoiDungThamTraId;
	private String _tienTo;
	private String _thanhPhanHoSo;
}