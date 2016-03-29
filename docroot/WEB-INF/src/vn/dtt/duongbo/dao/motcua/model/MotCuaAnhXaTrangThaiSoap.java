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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.motcua.service.http.MotCuaAnhXaTrangThaiServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.duongbo.dao.motcua.service.http.MotCuaAnhXaTrangThaiServiceSoap
 * @generated
 */
public class MotCuaAnhXaTrangThaiSoap implements Serializable {
	public static MotCuaAnhXaTrangThaiSoap toSoapModel(
		MotCuaAnhXaTrangThai model) {
		MotCuaAnhXaTrangThaiSoap soapModel = new MotCuaAnhXaTrangThaiSoap();

		soapModel.setId(model.getId());
		soapModel.setMaTTCanBo(model.getMaTTCanBo());
		soapModel.setMaTTDoanhNghiep(model.getMaTTDoanhNghiep());

		return soapModel;
	}

	public static MotCuaAnhXaTrangThaiSoap[] toSoapModels(
		MotCuaAnhXaTrangThai[] models) {
		MotCuaAnhXaTrangThaiSoap[] soapModels = new MotCuaAnhXaTrangThaiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MotCuaAnhXaTrangThaiSoap[][] toSoapModels(
		MotCuaAnhXaTrangThai[][] models) {
		MotCuaAnhXaTrangThaiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MotCuaAnhXaTrangThaiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new MotCuaAnhXaTrangThaiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MotCuaAnhXaTrangThaiSoap[] toSoapModels(
		List<MotCuaAnhXaTrangThai> models) {
		List<MotCuaAnhXaTrangThaiSoap> soapModels = new ArrayList<MotCuaAnhXaTrangThaiSoap>(models.size());

		for (MotCuaAnhXaTrangThai model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MotCuaAnhXaTrangThaiSoap[soapModels.size()]);
	}

	public MotCuaAnhXaTrangThaiSoap() {
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

	public String getMaTTCanBo() {
		return _maTTCanBo;
	}

	public void setMaTTCanBo(String maTTCanBo) {
		_maTTCanBo = maTTCanBo;
	}

	public String getMaTTDoanhNghiep() {
		return _maTTDoanhNghiep;
	}

	public void setMaTTDoanhNghiep(String maTTDoanhNghiep) {
		_maTTDoanhNghiep = maTTDoanhNghiep;
	}

	private long _id;
	private String _maTTCanBo;
	private String _maTTDoanhNghiep;
}