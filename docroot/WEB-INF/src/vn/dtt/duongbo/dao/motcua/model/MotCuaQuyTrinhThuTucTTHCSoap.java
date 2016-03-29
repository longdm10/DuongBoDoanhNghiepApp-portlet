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

package vn.dtt.duongbo.dao.motcua.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.motcua.service.http.MotCuaQuyTrinhThuTucTTHCServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.duongbo.dao.motcua.service.http.MotCuaQuyTrinhThuTucTTHCServiceSoap
 * @generated
 */
public class MotCuaQuyTrinhThuTucTTHCSoap implements Serializable {
	public static MotCuaQuyTrinhThuTucTTHCSoap toSoapModel(
		MotCuaQuyTrinhThuTucTTHC model) {
		MotCuaQuyTrinhThuTucTTHCSoap soapModel = new MotCuaQuyTrinhThuTucTTHCSoap();

		soapModel.setId(model.getId());
		soapModel.setQuyTrinhThuTucId(model.getQuyTrinhThuTucId());
		soapModel.setThuTucHanhChinhID(model.getThuTucHanhChinhID());
		soapModel.setToChucXuLy(model.getToChucXuLy());

		return soapModel;
	}

	public static MotCuaQuyTrinhThuTucTTHCSoap[] toSoapModels(
		MotCuaQuyTrinhThuTucTTHC[] models) {
		MotCuaQuyTrinhThuTucTTHCSoap[] soapModels = new MotCuaQuyTrinhThuTucTTHCSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MotCuaQuyTrinhThuTucTTHCSoap[][] toSoapModels(
		MotCuaQuyTrinhThuTucTTHC[][] models) {
		MotCuaQuyTrinhThuTucTTHCSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MotCuaQuyTrinhThuTucTTHCSoap[models.length][models[0].length];
		}
		else {
			soapModels = new MotCuaQuyTrinhThuTucTTHCSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MotCuaQuyTrinhThuTucTTHCSoap[] toSoapModels(
		List<MotCuaQuyTrinhThuTucTTHC> models) {
		List<MotCuaQuyTrinhThuTucTTHCSoap> soapModels = new ArrayList<MotCuaQuyTrinhThuTucTTHCSoap>(models.size());

		for (MotCuaQuyTrinhThuTucTTHC model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MotCuaQuyTrinhThuTucTTHCSoap[soapModels.size()]);
	}

	public MotCuaQuyTrinhThuTucTTHCSoap() {
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

	public long getQuyTrinhThuTucId() {
		return _quyTrinhThuTucId;
	}

	public void setQuyTrinhThuTucId(long quyTrinhThuTucId) {
		_quyTrinhThuTucId = quyTrinhThuTucId;
	}

	public long getThuTucHanhChinhID() {
		return _thuTucHanhChinhID;
	}

	public void setThuTucHanhChinhID(long thuTucHanhChinhID) {
		_thuTucHanhChinhID = thuTucHanhChinhID;
	}

	public long getToChucXuLy() {
		return _toChucXuLy;
	}

	public void setToChucXuLy(long toChucXuLy) {
		_toChucXuLy = toChucXuLy;
	}

	private long _id;
	private long _quyTrinhThuTucId;
	private long _thuTucHanhChinhID;
	private long _toChucXuLy;
}