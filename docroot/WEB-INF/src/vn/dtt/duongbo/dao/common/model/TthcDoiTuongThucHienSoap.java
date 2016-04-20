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
public class TthcDoiTuongThucHienSoap implements Serializable {
	public static TthcDoiTuongThucHienSoap toSoapModel(
		TthcDoiTuongThucHien model) {
		TthcDoiTuongThucHienSoap soapModel = new TthcDoiTuongThucHienSoap();

		soapModel.setId(model.getId());
		soapModel.setThuTucHanhChinhId(model.getThuTucHanhChinhId());
		soapModel.setLoaiDoiTuongThucHien(model.getLoaiDoiTuongThucHien());

		return soapModel;
	}

	public static TthcDoiTuongThucHienSoap[] toSoapModels(
		TthcDoiTuongThucHien[] models) {
		TthcDoiTuongThucHienSoap[] soapModels = new TthcDoiTuongThucHienSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TthcDoiTuongThucHienSoap[][] toSoapModels(
		TthcDoiTuongThucHien[][] models) {
		TthcDoiTuongThucHienSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TthcDoiTuongThucHienSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TthcDoiTuongThucHienSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TthcDoiTuongThucHienSoap[] toSoapModels(
		List<TthcDoiTuongThucHien> models) {
		List<TthcDoiTuongThucHienSoap> soapModels = new ArrayList<TthcDoiTuongThucHienSoap>(models.size());

		for (TthcDoiTuongThucHien model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TthcDoiTuongThucHienSoap[soapModels.size()]);
	}

	public TthcDoiTuongThucHienSoap() {
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

	public long getThuTucHanhChinhId() {
		return _thuTucHanhChinhId;
	}

	public void setThuTucHanhChinhId(long thuTucHanhChinhId) {
		_thuTucHanhChinhId = thuTucHanhChinhId;
	}

	public String getLoaiDoiTuongThucHien() {
		return _loaiDoiTuongThucHien;
	}

	public void setLoaiDoiTuongThucHien(String loaiDoiTuongThucHien) {
		_loaiDoiTuongThucHien = loaiDoiTuongThucHien;
	}

	private long _id;
	private long _thuTucHanhChinhId;
	private String _loaiDoiTuongThucHien;
}