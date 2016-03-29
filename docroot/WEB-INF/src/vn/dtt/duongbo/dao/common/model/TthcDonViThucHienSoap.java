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
public class TthcDonViThucHienSoap implements Serializable {
	public static TthcDonViThucHienSoap toSoapModel(TthcDonViThucHien model) {
		TthcDonViThucHienSoap soapModel = new TthcDonViThucHienSoap();

		soapModel.setId(model.getId());
		soapModel.setThuTucHanhChinhId(model.getThuTucHanhChinhId());
		soapModel.setMaDonVi(model.getMaDonVi());
		soapModel.setToChuc(model.getToChuc());

		return soapModel;
	}

	public static TthcDonViThucHienSoap[] toSoapModels(
		TthcDonViThucHien[] models) {
		TthcDonViThucHienSoap[] soapModels = new TthcDonViThucHienSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TthcDonViThucHienSoap[][] toSoapModels(
		TthcDonViThucHien[][] models) {
		TthcDonViThucHienSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TthcDonViThucHienSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TthcDonViThucHienSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TthcDonViThucHienSoap[] toSoapModels(
		List<TthcDonViThucHien> models) {
		List<TthcDonViThucHienSoap> soapModels = new ArrayList<TthcDonViThucHienSoap>(models.size());

		for (TthcDonViThucHien model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TthcDonViThucHienSoap[soapModels.size()]);
	}

	public TthcDonViThucHienSoap() {
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

	public String getMaDonVi() {
		return _maDonVi;
	}

	public void setMaDonVi(String maDonVi) {
		_maDonVi = maDonVi;
	}

	public long getToChuc() {
		return _toChuc;
	}

	public void setToChuc(long toChuc) {
		_toChuc = toChuc;
	}

	private long _id;
	private long _thuTucHanhChinhId;
	private String _maDonVi;
	private long _toChuc;
}