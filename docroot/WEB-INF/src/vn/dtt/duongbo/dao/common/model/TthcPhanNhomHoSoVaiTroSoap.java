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
public class TthcPhanNhomHoSoVaiTroSoap implements Serializable {
	public static TthcPhanNhomHoSoVaiTroSoap toSoapModel(
		TthcPhanNhomHoSoVaiTro model) {
		TthcPhanNhomHoSoVaiTroSoap soapModel = new TthcPhanNhomHoSoVaiTroSoap();

		soapModel.setId(model.getId());
		soapModel.setPhanNhomHoSoId(model.getPhanNhomHoSoId());
		soapModel.setVaiTroXuLy(model.getVaiTroXuLy());

		return soapModel;
	}

	public static TthcPhanNhomHoSoVaiTroSoap[] toSoapModels(
		TthcPhanNhomHoSoVaiTro[] models) {
		TthcPhanNhomHoSoVaiTroSoap[] soapModels = new TthcPhanNhomHoSoVaiTroSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TthcPhanNhomHoSoVaiTroSoap[][] toSoapModels(
		TthcPhanNhomHoSoVaiTro[][] models) {
		TthcPhanNhomHoSoVaiTroSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TthcPhanNhomHoSoVaiTroSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TthcPhanNhomHoSoVaiTroSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TthcPhanNhomHoSoVaiTroSoap[] toSoapModels(
		List<TthcPhanNhomHoSoVaiTro> models) {
		List<TthcPhanNhomHoSoVaiTroSoap> soapModels = new ArrayList<TthcPhanNhomHoSoVaiTroSoap>(models.size());

		for (TthcPhanNhomHoSoVaiTro model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TthcPhanNhomHoSoVaiTroSoap[soapModels.size()]);
	}

	public TthcPhanNhomHoSoVaiTroSoap() {
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

	public long getPhanNhomHoSoId() {
		return _phanNhomHoSoId;
	}

	public void setPhanNhomHoSoId(long phanNhomHoSoId) {
		_phanNhomHoSoId = phanNhomHoSoId;
	}

	public long getVaiTroXuLy() {
		return _vaiTroXuLy;
	}

	public void setVaiTroXuLy(long vaiTroXuLy) {
		_vaiTroXuLy = vaiTroXuLy;
	}

	private long _id;
	private long _phanNhomHoSoId;
	private long _vaiTroXuLy;
}