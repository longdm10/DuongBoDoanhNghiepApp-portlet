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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.nghiepvu.service.http.QlvtThongTinHoSoQuocTeServiceSoap}.
 *
 * @author NhanNc
 * @see vn.dtt.duongbo.dao.nghiepvu.service.http.QlvtThongTinHoSoQuocTeServiceSoap
 * @generated
 */
public class QlvtThongTinHoSoQuocTeSoap implements Serializable {
	public static QlvtThongTinHoSoQuocTeSoap toSoapModel(
		QlvtThongTinHoSoQuocTe model) {
		QlvtThongTinHoSoQuocTeSoap soapModel = new QlvtThongTinHoSoQuocTeSoap();

		soapModel.setId(model.getId());
		soapModel.setThongtinHoSoId(model.getThongtinHoSoId());
		soapModel.setGpkdvtID(model.getGpkdvtID());

		return soapModel;
	}

	public static QlvtThongTinHoSoQuocTeSoap[] toSoapModels(
		QlvtThongTinHoSoQuocTe[] models) {
		QlvtThongTinHoSoQuocTeSoap[] soapModels = new QlvtThongTinHoSoQuocTeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QlvtThongTinHoSoQuocTeSoap[][] toSoapModels(
		QlvtThongTinHoSoQuocTe[][] models) {
		QlvtThongTinHoSoQuocTeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QlvtThongTinHoSoQuocTeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QlvtThongTinHoSoQuocTeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QlvtThongTinHoSoQuocTeSoap[] toSoapModels(
		List<QlvtThongTinHoSoQuocTe> models) {
		List<QlvtThongTinHoSoQuocTeSoap> soapModels = new ArrayList<QlvtThongTinHoSoQuocTeSoap>(models.size());

		for (QlvtThongTinHoSoQuocTe model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QlvtThongTinHoSoQuocTeSoap[soapModels.size()]);
	}

	public QlvtThongTinHoSoQuocTeSoap() {
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

	public long getGpkdvtID() {
		return _gpkdvtID;
	}

	public void setGpkdvtID(long gpkdvtID) {
		_gpkdvtID = gpkdvtID;
	}

	private long _id;
	private long _thongtinHoSoId;
	private long _gpkdvtID;
}