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
public class QlvtDiemDungDangKyVietLaoSoap implements Serializable {
	public static QlvtDiemDungDangKyVietLaoSoap toSoapModel(
		QlvtDiemDungDangKyVietLao model) {
		QlvtDiemDungDangKyVietLaoSoap soapModel = new QlvtDiemDungDangKyVietLaoSoap();

		soapModel.setId(model.getId());
		soapModel.setPhuongTienDangKyId(model.getPhuongTienDangKyId());
		soapModel.setNoiDungHoSoId(model.getNoiDungHoSoId());
		soapModel.setHoSoThuTucId(model.getHoSoThuTucId());
		soapModel.setMaDiemDung(model.getMaDiemDung());
		soapModel.setTenDiemDung(model.getTenDiemDung());

		return soapModel;
	}

	public static QlvtDiemDungDangKyVietLaoSoap[] toSoapModels(
		QlvtDiemDungDangKyVietLao[] models) {
		QlvtDiemDungDangKyVietLaoSoap[] soapModels = new QlvtDiemDungDangKyVietLaoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QlvtDiemDungDangKyVietLaoSoap[][] toSoapModels(
		QlvtDiemDungDangKyVietLao[][] models) {
		QlvtDiemDungDangKyVietLaoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QlvtDiemDungDangKyVietLaoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QlvtDiemDungDangKyVietLaoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QlvtDiemDungDangKyVietLaoSoap[] toSoapModels(
		List<QlvtDiemDungDangKyVietLao> models) {
		List<QlvtDiemDungDangKyVietLaoSoap> soapModels = new ArrayList<QlvtDiemDungDangKyVietLaoSoap>(models.size());

		for (QlvtDiemDungDangKyVietLao model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QlvtDiemDungDangKyVietLaoSoap[soapModels.size()]);
	}

	public QlvtDiemDungDangKyVietLaoSoap() {
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

	public String getPhuongTienDangKyId() {
		return _PhuongTienDangKyId;
	}

	public void setPhuongTienDangKyId(String PhuongTienDangKyId) {
		_PhuongTienDangKyId = PhuongTienDangKyId;
	}

	public String getNoiDungHoSoId() {
		return _NoiDungHoSoId;
	}

	public void setNoiDungHoSoId(String NoiDungHoSoId) {
		_NoiDungHoSoId = NoiDungHoSoId;
	}

	public String getHoSoThuTucId() {
		return _HoSoThuTucId;
	}

	public void setHoSoThuTucId(String HoSoThuTucId) {
		_HoSoThuTucId = HoSoThuTucId;
	}

	public long getMaDiemDung() {
		return _MaDiemDung;
	}

	public void setMaDiemDung(long MaDiemDung) {
		_MaDiemDung = MaDiemDung;
	}

	public long getTenDiemDung() {
		return _TenDiemDung;
	}

	public void setTenDiemDung(long TenDiemDung) {
		_TenDiemDung = TenDiemDung;
	}

	private long _id;
	private String _PhuongTienDangKyId;
	private String _NoiDungHoSoId;
	private String _HoSoThuTucId;
	private long _MaDiemDung;
	private long _TenDiemDung;
}