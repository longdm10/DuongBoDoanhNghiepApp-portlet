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
public class TthcBieuMauHoSoSoap implements Serializable {
	public static TthcBieuMauHoSoSoap toSoapModel(TthcBieuMauHoSo model) {
		TthcBieuMauHoSoSoap soapModel = new TthcBieuMauHoSoSoap();

		soapModel.setId(model.getId());
		soapModel.setMaBieuMau(model.getMaBieuMau());
		soapModel.setTenBieuMau(model.getTenBieuMau());
		soapModel.setTenTiengAnh(model.getTenTiengAnh());
		soapModel.setTaiLieuMau(model.getTaiLieuMau());

		return soapModel;
	}

	public static TthcBieuMauHoSoSoap[] toSoapModels(TthcBieuMauHoSo[] models) {
		TthcBieuMauHoSoSoap[] soapModels = new TthcBieuMauHoSoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TthcBieuMauHoSoSoap[][] toSoapModels(
		TthcBieuMauHoSo[][] models) {
		TthcBieuMauHoSoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TthcBieuMauHoSoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TthcBieuMauHoSoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TthcBieuMauHoSoSoap[] toSoapModels(
		List<TthcBieuMauHoSo> models) {
		List<TthcBieuMauHoSoSoap> soapModels = new ArrayList<TthcBieuMauHoSoSoap>(models.size());

		for (TthcBieuMauHoSo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TthcBieuMauHoSoSoap[soapModels.size()]);
	}

	public TthcBieuMauHoSoSoap() {
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

	public String getMaBieuMau() {
		return _maBieuMau;
	}

	public void setMaBieuMau(String maBieuMau) {
		_maBieuMau = maBieuMau;
	}

	public String getTenBieuMau() {
		return _tenBieuMau;
	}

	public void setTenBieuMau(String tenBieuMau) {
		_tenBieuMau = tenBieuMau;
	}

	public String getTenTiengAnh() {
		return _tenTiengAnh;
	}

	public void setTenTiengAnh(String tenTiengAnh) {
		_tenTiengAnh = tenTiengAnh;
	}

	public long getTaiLieuMau() {
		return _taiLieuMau;
	}

	public void setTaiLieuMau(long taiLieuMau) {
		_taiLieuMau = taiLieuMau;
	}

	private long _id;
	private String _maBieuMau;
	private String _tenBieuMau;
	private String _tenTiengAnh;
	private long _taiLieuMau;
}