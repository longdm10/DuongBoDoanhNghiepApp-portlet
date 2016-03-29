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

package vn.dtt.duongbo.dao.lienvan.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.lienvan.service.http.QlvtXuLyGpLienVanLoaiHinhVanTaiServiceSoap}.
 *
 * @author NhanNc
 * @see vn.dtt.duongbo.dao.lienvan.service.http.QlvtXuLyGpLienVanLoaiHinhVanTaiServiceSoap
 * @generated
 */
public class QlvtXuLyGpLienVanLoaiHinhVanTaiSoap implements Serializable {
	public static QlvtXuLyGpLienVanLoaiHinhVanTaiSoap toSoapModel(
		QlvtXuLyGpLienVanLoaiHinhVanTai model) {
		QlvtXuLyGpLienVanLoaiHinhVanTaiSoap soapModel = new QlvtXuLyGpLienVanLoaiHinhVanTaiSoap();

		soapModel.setId(model.getId());
		soapModel.setGpLienVanId(model.getGpLienVanId());
		soapModel.setMaLoaiHinhVanTai(model.getMaLoaiHinhVanTai());

		return soapModel;
	}

	public static QlvtXuLyGpLienVanLoaiHinhVanTaiSoap[] toSoapModels(
		QlvtXuLyGpLienVanLoaiHinhVanTai[] models) {
		QlvtXuLyGpLienVanLoaiHinhVanTaiSoap[] soapModels = new QlvtXuLyGpLienVanLoaiHinhVanTaiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QlvtXuLyGpLienVanLoaiHinhVanTaiSoap[][] toSoapModels(
		QlvtXuLyGpLienVanLoaiHinhVanTai[][] models) {
		QlvtXuLyGpLienVanLoaiHinhVanTaiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QlvtXuLyGpLienVanLoaiHinhVanTaiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QlvtXuLyGpLienVanLoaiHinhVanTaiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QlvtXuLyGpLienVanLoaiHinhVanTaiSoap[] toSoapModels(
		List<QlvtXuLyGpLienVanLoaiHinhVanTai> models) {
		List<QlvtXuLyGpLienVanLoaiHinhVanTaiSoap> soapModels = new ArrayList<QlvtXuLyGpLienVanLoaiHinhVanTaiSoap>(models.size());

		for (QlvtXuLyGpLienVanLoaiHinhVanTai model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QlvtXuLyGpLienVanLoaiHinhVanTaiSoap[soapModels.size()]);
	}

	public QlvtXuLyGpLienVanLoaiHinhVanTaiSoap() {
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

	public long getGpLienVanId() {
		return _gpLienVanId;
	}

	public void setGpLienVanId(long gpLienVanId) {
		_gpLienVanId = gpLienVanId;
	}

	public String getMaLoaiHinhVanTai() {
		return _maLoaiHinhVanTai;
	}

	public void setMaLoaiHinhVanTai(String maLoaiHinhVanTai) {
		_maLoaiHinhVanTai = maLoaiHinhVanTai;
	}

	private long _id;
	private long _gpLienVanId;
	private String _maLoaiHinhVanTai;
}