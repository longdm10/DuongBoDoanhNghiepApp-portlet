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
public class TthcLinhVucThuTucSoap implements Serializable {
	public static TthcLinhVucThuTucSoap toSoapModel(TthcLinhVucThuTuc model) {
		TthcLinhVucThuTucSoap soapModel = new TthcLinhVucThuTucSoap();

		soapModel.setId(model.getId());
		soapModel.setTenCoQuanQltt(model.getTenCoQuanQltt());
		soapModel.setTenTiengAnh(model.getTenTiengAnh());
		soapModel.setIdCha(model.getIdCha());

		return soapModel;
	}

	public static TthcLinhVucThuTucSoap[] toSoapModels(
		TthcLinhVucThuTuc[] models) {
		TthcLinhVucThuTucSoap[] soapModels = new TthcLinhVucThuTucSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TthcLinhVucThuTucSoap[][] toSoapModels(
		TthcLinhVucThuTuc[][] models) {
		TthcLinhVucThuTucSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TthcLinhVucThuTucSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TthcLinhVucThuTucSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TthcLinhVucThuTucSoap[] toSoapModels(
		List<TthcLinhVucThuTuc> models) {
		List<TthcLinhVucThuTucSoap> soapModels = new ArrayList<TthcLinhVucThuTucSoap>(models.size());

		for (TthcLinhVucThuTuc model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TthcLinhVucThuTucSoap[soapModels.size()]);
	}

	public TthcLinhVucThuTucSoap() {
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

	public String getTenCoQuanQltt() {
		return _tenCoQuanQltt;
	}

	public void setTenCoQuanQltt(String tenCoQuanQltt) {
		_tenCoQuanQltt = tenCoQuanQltt;
	}

	public String getTenTiengAnh() {
		return _tenTiengAnh;
	}

	public void setTenTiengAnh(String tenTiengAnh) {
		_tenTiengAnh = tenTiengAnh;
	}

	public long getIdCha() {
		return _idCha;
	}

	public void setIdCha(long idCha) {
		_idCha = idCha;
	}

	private long _id;
	private String _tenCoQuanQltt;
	private String _tenTiengAnh;
	private long _idCha;
}