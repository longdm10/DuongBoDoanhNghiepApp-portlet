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

package vn.dtt.duongbo.dao.lienvan.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.lienvan.service.http.QlvtThongTinHoSoCapPhepGplvServiceSoap}.
 *
 * @author NhanNc
 * @see vn.dtt.duongbo.dao.lienvan.service.http.QlvtThongTinHoSoCapPhepGplvServiceSoap
 * @generated
 */
public class QlvtThongTinHoSoCapPhepGplvSoap implements Serializable {
	public static QlvtThongTinHoSoCapPhepGplvSoap toSoapModel(
		QlvtThongTinHoSoCapPhepGplv model) {
		QlvtThongTinHoSoCapPhepGplvSoap soapModel = new QlvtThongTinHoSoCapPhepGplvSoap();

		soapModel.setId(model.getId());
		soapModel.setThongtinhosoId(model.getThongtinhosoId());
		soapModel.setCapphepGplienvanId(model.getCapphepGplienvanId());

		return soapModel;
	}

	public static QlvtThongTinHoSoCapPhepGplvSoap[] toSoapModels(
		QlvtThongTinHoSoCapPhepGplv[] models) {
		QlvtThongTinHoSoCapPhepGplvSoap[] soapModels = new QlvtThongTinHoSoCapPhepGplvSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QlvtThongTinHoSoCapPhepGplvSoap[][] toSoapModels(
		QlvtThongTinHoSoCapPhepGplv[][] models) {
		QlvtThongTinHoSoCapPhepGplvSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QlvtThongTinHoSoCapPhepGplvSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QlvtThongTinHoSoCapPhepGplvSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QlvtThongTinHoSoCapPhepGplvSoap[] toSoapModels(
		List<QlvtThongTinHoSoCapPhepGplv> models) {
		List<QlvtThongTinHoSoCapPhepGplvSoap> soapModels = new ArrayList<QlvtThongTinHoSoCapPhepGplvSoap>(models.size());

		for (QlvtThongTinHoSoCapPhepGplv model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QlvtThongTinHoSoCapPhepGplvSoap[soapModels.size()]);
	}

	public QlvtThongTinHoSoCapPhepGplvSoap() {
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

	public long getThongtinhosoId() {
		return _thongtinhosoId;
	}

	public void setThongtinhosoId(long thongtinhosoId) {
		_thongtinhosoId = thongtinhosoId;
	}

	public long getCapphepGplienvanId() {
		return _capphepGplienvanId;
	}

	public void setCapphepGplienvanId(long capphepGplienvanId) {
		_capphepGplienvanId = capphepGplienvanId;
	}

	private long _id;
	private long _thongtinhosoId;
	private long _capphepGplienvanId;
}