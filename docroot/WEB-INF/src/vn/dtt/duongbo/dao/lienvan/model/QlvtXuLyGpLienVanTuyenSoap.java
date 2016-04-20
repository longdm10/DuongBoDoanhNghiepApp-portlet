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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.lienvan.service.http.QlvtXuLyGpLienVanTuyenServiceSoap}.
 *
 * @author NhanNc
 * @see vn.dtt.duongbo.dao.lienvan.service.http.QlvtXuLyGpLienVanTuyenServiceSoap
 * @generated
 */
public class QlvtXuLyGpLienVanTuyenSoap implements Serializable {
	public static QlvtXuLyGpLienVanTuyenSoap toSoapModel(
		QlvtXuLyGpLienVanTuyen model) {
		QlvtXuLyGpLienVanTuyenSoap soapModel = new QlvtXuLyGpLienVanTuyenSoap();

		soapModel.setId(model.getId());
		soapModel.setGpLienVanPhuongTienId(model.getGpLienVanPhuongTienId());
		soapModel.setMaTuyen(model.getMaTuyen());
		soapModel.setTenTuyen(model.getTenTuyen());
		soapModel.setTuNgay(model.getTuNgay());
		soapModel.setDenNgay(model.getDenNgay());

		return soapModel;
	}

	public static QlvtXuLyGpLienVanTuyenSoap[] toSoapModels(
		QlvtXuLyGpLienVanTuyen[] models) {
		QlvtXuLyGpLienVanTuyenSoap[] soapModels = new QlvtXuLyGpLienVanTuyenSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QlvtXuLyGpLienVanTuyenSoap[][] toSoapModels(
		QlvtXuLyGpLienVanTuyen[][] models) {
		QlvtXuLyGpLienVanTuyenSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QlvtXuLyGpLienVanTuyenSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QlvtXuLyGpLienVanTuyenSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QlvtXuLyGpLienVanTuyenSoap[] toSoapModels(
		List<QlvtXuLyGpLienVanTuyen> models) {
		List<QlvtXuLyGpLienVanTuyenSoap> soapModels = new ArrayList<QlvtXuLyGpLienVanTuyenSoap>(models.size());

		for (QlvtXuLyGpLienVanTuyen model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QlvtXuLyGpLienVanTuyenSoap[soapModels.size()]);
	}

	public QlvtXuLyGpLienVanTuyenSoap() {
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

	public long getGpLienVanPhuongTienId() {
		return _gpLienVanPhuongTienId;
	}

	public void setGpLienVanPhuongTienId(long gpLienVanPhuongTienId) {
		_gpLienVanPhuongTienId = gpLienVanPhuongTienId;
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

	public Date getTuNgay() {
		return _tuNgay;
	}

	public void setTuNgay(Date tuNgay) {
		_tuNgay = tuNgay;
	}

	public Date getDenNgay() {
		return _denNgay;
	}

	public void setDenNgay(Date denNgay) {
		_denNgay = denNgay;
	}

	private long _id;
	private long _gpLienVanPhuongTienId;
	private String _maTuyen;
	private String _tenTuyen;
	private Date _tuNgay;
	private Date _denNgay;
}