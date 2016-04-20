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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.nghiepvu.service.http.QlvtTTHCNoiDungThamTraServiceSoap}.
 *
 * @author NhanNc
 * @see vn.dtt.duongbo.dao.nghiepvu.service.http.QlvtTTHCNoiDungThamTraServiceSoap
 * @generated
 */
public class QlvtTTHCNoiDungThamTraSoap implements Serializable {
	public static QlvtTTHCNoiDungThamTraSoap toSoapModel(
		QlvtTTHCNoiDungThamTra model) {
		QlvtTTHCNoiDungThamTraSoap soapModel = new QlvtTTHCNoiDungThamTraSoap();

		soapModel.setId(model.getId());
		soapModel.setMaTTHC(model.getMaTTHC());
		soapModel.setToChucXuLy(model.getToChucXuLy());

		return soapModel;
	}

	public static QlvtTTHCNoiDungThamTraSoap[] toSoapModels(
		QlvtTTHCNoiDungThamTra[] models) {
		QlvtTTHCNoiDungThamTraSoap[] soapModels = new QlvtTTHCNoiDungThamTraSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QlvtTTHCNoiDungThamTraSoap[][] toSoapModels(
		QlvtTTHCNoiDungThamTra[][] models) {
		QlvtTTHCNoiDungThamTraSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QlvtTTHCNoiDungThamTraSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QlvtTTHCNoiDungThamTraSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QlvtTTHCNoiDungThamTraSoap[] toSoapModels(
		List<QlvtTTHCNoiDungThamTra> models) {
		List<QlvtTTHCNoiDungThamTraSoap> soapModels = new ArrayList<QlvtTTHCNoiDungThamTraSoap>(models.size());

		for (QlvtTTHCNoiDungThamTra model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QlvtTTHCNoiDungThamTraSoap[soapModels.size()]);
	}

	public QlvtTTHCNoiDungThamTraSoap() {
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

	public String getMaTTHC() {
		return _maTTHC;
	}

	public void setMaTTHC(String maTTHC) {
		_maTTHC = maTTHC;
	}

	public int getToChucXuLy() {
		return _toChucXuLy;
	}

	public void setToChucXuLy(int toChucXuLy) {
		_toChucXuLy = toChucXuLy;
	}

	private long _id;
	private String _maTTHC;
	private int _toChucXuLy;
}