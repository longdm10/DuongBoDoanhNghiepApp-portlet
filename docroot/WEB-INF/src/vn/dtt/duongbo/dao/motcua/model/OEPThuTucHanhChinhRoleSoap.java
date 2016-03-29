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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.motcua.service.http.OEPThuTucHanhChinhRoleServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.duongbo.dao.motcua.service.http.OEPThuTucHanhChinhRoleServiceSoap
 * @generated
 */
public class OEPThuTucHanhChinhRoleSoap implements Serializable {
	public static OEPThuTucHanhChinhRoleSoap toSoapModel(
		OEPThuTucHanhChinhRole model) {
		OEPThuTucHanhChinhRoleSoap soapModel = new OEPThuTucHanhChinhRoleSoap();

		soapModel.setId(model.getId());
		soapModel.setThuTucHinhChinhId(model.getThuTucHinhChinhId());
		soapModel.setVaiTroThucHien(model.getVaiTroThucHien());

		return soapModel;
	}

	public static OEPThuTucHanhChinhRoleSoap[] toSoapModels(
		OEPThuTucHanhChinhRole[] models) {
		OEPThuTucHanhChinhRoleSoap[] soapModels = new OEPThuTucHanhChinhRoleSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static OEPThuTucHanhChinhRoleSoap[][] toSoapModels(
		OEPThuTucHanhChinhRole[][] models) {
		OEPThuTucHanhChinhRoleSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new OEPThuTucHanhChinhRoleSoap[models.length][models[0].length];
		}
		else {
			soapModels = new OEPThuTucHanhChinhRoleSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static OEPThuTucHanhChinhRoleSoap[] toSoapModels(
		List<OEPThuTucHanhChinhRole> models) {
		List<OEPThuTucHanhChinhRoleSoap> soapModels = new ArrayList<OEPThuTucHanhChinhRoleSoap>(models.size());

		for (OEPThuTucHanhChinhRole model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new OEPThuTucHanhChinhRoleSoap[soapModels.size()]);
	}

	public OEPThuTucHanhChinhRoleSoap() {
	}

	public int getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(int pk) {
		setId(pk);
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

	public int getThuTucHinhChinhId() {
		return _thuTucHinhChinhId;
	}

	public void setThuTucHinhChinhId(int thuTucHinhChinhId) {
		_thuTucHinhChinhId = thuTucHinhChinhId;
	}

	public int getVaiTroThucHien() {
		return _vaiTroThucHien;
	}

	public void setVaiTroThucHien(int vaiTroThucHien) {
		_vaiTroThucHien = vaiTroThucHien;
	}

	private int _id;
	private int _thuTucHinhChinhId;
	private int _vaiTroThucHien;
}