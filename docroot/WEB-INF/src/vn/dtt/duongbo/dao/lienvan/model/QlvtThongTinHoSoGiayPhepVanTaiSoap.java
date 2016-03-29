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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.lienvan.service.http.QlvtThongTinHoSoGiayPhepVanTaiServiceSoap}.
 *
 * @author NhanNc
 * @see vn.dtt.duongbo.dao.lienvan.service.http.QlvtThongTinHoSoGiayPhepVanTaiServiceSoap
 * @generated
 */
public class QlvtThongTinHoSoGiayPhepVanTaiSoap implements Serializable {
	public static QlvtThongTinHoSoGiayPhepVanTaiSoap toSoapModel(
		QlvtThongTinHoSoGiayPhepVanTai model) {
		QlvtThongTinHoSoGiayPhepVanTaiSoap soapModel = new QlvtThongTinHoSoGiayPhepVanTaiSoap();

		soapModel.setId(model.getId());
		soapModel.setThongtinhosoId(model.getThongtinhosoId());
		soapModel.setCapphepGpkdvtId(model.getCapphepGpkdvtId());

		return soapModel;
	}

	public static QlvtThongTinHoSoGiayPhepVanTaiSoap[] toSoapModels(
		QlvtThongTinHoSoGiayPhepVanTai[] models) {
		QlvtThongTinHoSoGiayPhepVanTaiSoap[] soapModels = new QlvtThongTinHoSoGiayPhepVanTaiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QlvtThongTinHoSoGiayPhepVanTaiSoap[][] toSoapModels(
		QlvtThongTinHoSoGiayPhepVanTai[][] models) {
		QlvtThongTinHoSoGiayPhepVanTaiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QlvtThongTinHoSoGiayPhepVanTaiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QlvtThongTinHoSoGiayPhepVanTaiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QlvtThongTinHoSoGiayPhepVanTaiSoap[] toSoapModels(
		List<QlvtThongTinHoSoGiayPhepVanTai> models) {
		List<QlvtThongTinHoSoGiayPhepVanTaiSoap> soapModels = new ArrayList<QlvtThongTinHoSoGiayPhepVanTaiSoap>(models.size());

		for (QlvtThongTinHoSoGiayPhepVanTai model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QlvtThongTinHoSoGiayPhepVanTaiSoap[soapModels.size()]);
	}

	public QlvtThongTinHoSoGiayPhepVanTaiSoap() {
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

	public long getCapphepGpkdvtId() {
		return _capphepGpkdvtId;
	}

	public void setCapphepGpkdvtId(long capphepGpkdvtId) {
		_capphepGpkdvtId = capphepGpkdvtId;
	}

	private long _id;
	private long _thongtinhosoId;
	private long _capphepGpkdvtId;
}