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
public class TthcThanhPhanHoSoBieuMauSoap implements Serializable {
	public static TthcThanhPhanHoSoBieuMauSoap toSoapModel(
		TthcThanhPhanHoSoBieuMau model) {
		TthcThanhPhanHoSoBieuMauSoap soapModel = new TthcThanhPhanHoSoBieuMauSoap();

		soapModel.setId(model.getId());
		soapModel.setThanhPhanHoSoId(model.getThanhPhanHoSoId());
		soapModel.setBieuMauHoSoId(model.getBieuMauHoSoId());
		soapModel.setSoThuTu(model.getSoThuTu());

		return soapModel;
	}

	public static TthcThanhPhanHoSoBieuMauSoap[] toSoapModels(
		TthcThanhPhanHoSoBieuMau[] models) {
		TthcThanhPhanHoSoBieuMauSoap[] soapModels = new TthcThanhPhanHoSoBieuMauSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TthcThanhPhanHoSoBieuMauSoap[][] toSoapModels(
		TthcThanhPhanHoSoBieuMau[][] models) {
		TthcThanhPhanHoSoBieuMauSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TthcThanhPhanHoSoBieuMauSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TthcThanhPhanHoSoBieuMauSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TthcThanhPhanHoSoBieuMauSoap[] toSoapModels(
		List<TthcThanhPhanHoSoBieuMau> models) {
		List<TthcThanhPhanHoSoBieuMauSoap> soapModels = new ArrayList<TthcThanhPhanHoSoBieuMauSoap>(models.size());

		for (TthcThanhPhanHoSoBieuMau model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TthcThanhPhanHoSoBieuMauSoap[soapModels.size()]);
	}

	public TthcThanhPhanHoSoBieuMauSoap() {
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

	public long getThanhPhanHoSoId() {
		return _thanhPhanHoSoId;
	}

	public void setThanhPhanHoSoId(long thanhPhanHoSoId) {
		_thanhPhanHoSoId = thanhPhanHoSoId;
	}

	public long getBieuMauHoSoId() {
		return _bieuMauHoSoId;
	}

	public void setBieuMauHoSoId(long bieuMauHoSoId) {
		_bieuMauHoSoId = bieuMauHoSoId;
	}

	public int getSoThuTu() {
		return _soThuTu;
	}

	public void setSoThuTu(int soThuTu) {
		_soThuTu = soThuTu;
	}

	private long _id;
	private long _thanhPhanHoSoId;
	private long _bieuMauHoSoId;
	private int _soThuTu;
}