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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.nghiepvu.service.http.QlvtThongTinHoSoNoiDiaServiceSoap}.
 *
 * @author NhanNc
 * @see vn.dtt.duongbo.dao.nghiepvu.service.http.QlvtThongTinHoSoNoiDiaServiceSoap
 * @generated
 */
public class QlvtThongTinHoSoNoiDiaSoap implements Serializable {
	public static QlvtThongTinHoSoNoiDiaSoap toSoapModel(
		QlvtThongTinHoSoNoiDia model) {
		QlvtThongTinHoSoNoiDiaSoap soapModel = new QlvtThongTinHoSoNoiDiaSoap();

		soapModel.setId(model.getId());
		soapModel.setThongtinHoSoId(model.getThongtinHoSoId());
		soapModel.setNoiDiaId(model.getNoiDiaId());

		return soapModel;
	}

	public static QlvtThongTinHoSoNoiDiaSoap[] toSoapModels(
		QlvtThongTinHoSoNoiDia[] models) {
		QlvtThongTinHoSoNoiDiaSoap[] soapModels = new QlvtThongTinHoSoNoiDiaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QlvtThongTinHoSoNoiDiaSoap[][] toSoapModels(
		QlvtThongTinHoSoNoiDia[][] models) {
		QlvtThongTinHoSoNoiDiaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QlvtThongTinHoSoNoiDiaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QlvtThongTinHoSoNoiDiaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QlvtThongTinHoSoNoiDiaSoap[] toSoapModels(
		List<QlvtThongTinHoSoNoiDia> models) {
		List<QlvtThongTinHoSoNoiDiaSoap> soapModels = new ArrayList<QlvtThongTinHoSoNoiDiaSoap>(models.size());

		for (QlvtThongTinHoSoNoiDia model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QlvtThongTinHoSoNoiDiaSoap[soapModels.size()]);
	}

	public QlvtThongTinHoSoNoiDiaSoap() {
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

	public long getThongtinHoSoId() {
		return _thongtinHoSoId;
	}

	public void setThongtinHoSoId(long thongtinHoSoId) {
		_thongtinHoSoId = thongtinHoSoId;
	}

	public long getNoiDiaId() {
		return _noiDiaId;
	}

	public void setNoiDiaId(long noiDiaId) {
		_noiDiaId = noiDiaId;
	}

	private long _id;
	private long _thongtinHoSoId;
	private long _noiDiaId;
}