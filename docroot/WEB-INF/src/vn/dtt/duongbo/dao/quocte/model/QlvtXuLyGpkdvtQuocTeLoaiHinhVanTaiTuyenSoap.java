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

package vn.dtt.duongbo.dao.quocte.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.quocte.service.http.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenServiceSoap}.
 *
 * @author NoiPham
 * @see vn.dtt.duongbo.dao.quocte.service.http.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenServiceSoap
 * @generated
 */
public class QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenSoap implements Serializable {
	public static QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenSoap toSoapModel(
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen model) {
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenSoap soapModel = new QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenSoap();

		soapModel.setId(model.getId());
		soapModel.setGpkdLoaiHinhKdId(model.getGpkdLoaiHinhKdId());
		soapModel.setMaTuyen(model.getMaTuyen());
		soapModel.setTenTuyen(model.getTenTuyen());

		return soapModel;
	}

	public static QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenSoap[] toSoapModels(
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen[] models) {
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenSoap[] soapModels = new QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenSoap[][] toSoapModels(
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen[][] models) {
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenSoap[] toSoapModels(
		List<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen> models) {
		List<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenSoap> soapModels = new ArrayList<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenSoap>(models.size());

		for (QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenSoap[soapModels.size()]);
	}

	public QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenSoap() {
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

	public int getGpkdLoaiHinhKdId() {
		return _gpkdLoaiHinhKdId;
	}

	public void setGpkdLoaiHinhKdId(int gpkdLoaiHinhKdId) {
		_gpkdLoaiHinhKdId = gpkdLoaiHinhKdId;
	}

	public String getMaTuyen() {
		return _maTuyen;
	}

	public void setMaTuyen(String maTuyen) {
		_maTuyen = maTuyen;
	}

	public String getTenTuyen() {
		return _tenTuyen;
	}

	public void setTenTuyen(String tenTuyen) {
		_tenTuyen = tenTuyen;
	}

	private long _id;
	private int _gpkdLoaiHinhKdId;
	private String _maTuyen;
	private String _tenTuyen;
}