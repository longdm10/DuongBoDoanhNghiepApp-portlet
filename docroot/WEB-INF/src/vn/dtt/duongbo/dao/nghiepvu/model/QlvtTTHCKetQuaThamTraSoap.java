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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.nghiepvu.service.http.QlvtTTHCKetQuaThamTraServiceSoap}.
 *
 * @author NhanNc
 * @see vn.dtt.duongbo.dao.nghiepvu.service.http.QlvtTTHCKetQuaThamTraServiceSoap
 * @generated
 */
public class QlvtTTHCKetQuaThamTraSoap implements Serializable {
	public static QlvtTTHCKetQuaThamTraSoap toSoapModel(
		QlvtTTHCKetQuaThamTra model) {
		QlvtTTHCKetQuaThamTraSoap soapModel = new QlvtTTHCKetQuaThamTraSoap();

		soapModel.setId(model.getId());
		soapModel.setMaKetQuaThamTra(model.getMaKetQuaThamTra());
		soapModel.setMaTTHC(model.getMaTTHC());
		soapModel.setBuocXuLy(model.getBuocXuLy());
		soapModel.setToChucXuLy(model.getToChucXuLy());

		return soapModel;
	}

	public static QlvtTTHCKetQuaThamTraSoap[] toSoapModels(
		QlvtTTHCKetQuaThamTra[] models) {
		QlvtTTHCKetQuaThamTraSoap[] soapModels = new QlvtTTHCKetQuaThamTraSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QlvtTTHCKetQuaThamTraSoap[][] toSoapModels(
		QlvtTTHCKetQuaThamTra[][] models) {
		QlvtTTHCKetQuaThamTraSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QlvtTTHCKetQuaThamTraSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QlvtTTHCKetQuaThamTraSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QlvtTTHCKetQuaThamTraSoap[] toSoapModels(
		List<QlvtTTHCKetQuaThamTra> models) {
		List<QlvtTTHCKetQuaThamTraSoap> soapModels = new ArrayList<QlvtTTHCKetQuaThamTraSoap>(models.size());

		for (QlvtTTHCKetQuaThamTra model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QlvtTTHCKetQuaThamTraSoap[soapModels.size()]);
	}

	public QlvtTTHCKetQuaThamTraSoap() {
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

	public String getMaKetQuaThamTra() {
		return _maKetQuaThamTra;
	}

	public void setMaKetQuaThamTra(String maKetQuaThamTra) {
		_maKetQuaThamTra = maKetQuaThamTra;
	}

	public String getMaTTHC() {
		return _maTTHC;
	}

	public void setMaTTHC(String maTTHC) {
		_maTTHC = maTTHC;
	}

	public int getBuocXuLy() {
		return _buocXuLy;
	}

	public void setBuocXuLy(int buocXuLy) {
		_buocXuLy = buocXuLy;
	}

	public int getToChucXuLy() {
		return _toChucXuLy;
	}

	public void setToChucXuLy(int toChucXuLy) {
		_toChucXuLy = toChucXuLy;
	}

	private long _id;
	private String _maKetQuaThamTra;
	private String _maTTHC;
	private int _buocXuLy;
	private int _toChucXuLy;
}