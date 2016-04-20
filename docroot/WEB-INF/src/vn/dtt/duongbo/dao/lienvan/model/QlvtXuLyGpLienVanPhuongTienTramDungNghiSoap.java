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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.lienvan.service.http.QlvtXuLyGpLienVanPhuongTienTramDungNghiServiceSoap}.
 *
 * @author NhanNc
 * @see vn.dtt.duongbo.dao.lienvan.service.http.QlvtXuLyGpLienVanPhuongTienTramDungNghiServiceSoap
 * @generated
 */
public class QlvtXuLyGpLienVanPhuongTienTramDungNghiSoap implements Serializable {
	public static QlvtXuLyGpLienVanPhuongTienTramDungNghiSoap toSoapModel(
		QlvtXuLyGpLienVanPhuongTienTramDungNghi model) {
		QlvtXuLyGpLienVanPhuongTienTramDungNghiSoap soapModel = new QlvtXuLyGpLienVanPhuongTienTramDungNghiSoap();

		soapModel.setId(model.getId());
		soapModel.setCapGplxPhuongTienId(model.getCapGplxPhuongTienId());
		soapModel.setMaTramDungNghi(model.getMaTramDungNghi());

		return soapModel;
	}

	public static QlvtXuLyGpLienVanPhuongTienTramDungNghiSoap[] toSoapModels(
		QlvtXuLyGpLienVanPhuongTienTramDungNghi[] models) {
		QlvtXuLyGpLienVanPhuongTienTramDungNghiSoap[] soapModels = new QlvtXuLyGpLienVanPhuongTienTramDungNghiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QlvtXuLyGpLienVanPhuongTienTramDungNghiSoap[][] toSoapModels(
		QlvtXuLyGpLienVanPhuongTienTramDungNghi[][] models) {
		QlvtXuLyGpLienVanPhuongTienTramDungNghiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QlvtXuLyGpLienVanPhuongTienTramDungNghiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QlvtXuLyGpLienVanPhuongTienTramDungNghiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QlvtXuLyGpLienVanPhuongTienTramDungNghiSoap[] toSoapModels(
		List<QlvtXuLyGpLienVanPhuongTienTramDungNghi> models) {
		List<QlvtXuLyGpLienVanPhuongTienTramDungNghiSoap> soapModels = new ArrayList<QlvtXuLyGpLienVanPhuongTienTramDungNghiSoap>(models.size());

		for (QlvtXuLyGpLienVanPhuongTienTramDungNghi model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QlvtXuLyGpLienVanPhuongTienTramDungNghiSoap[soapModels.size()]);
	}

	public QlvtXuLyGpLienVanPhuongTienTramDungNghiSoap() {
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

	public long getCapGplxPhuongTienId() {
		return _capGplxPhuongTienId;
	}

	public void setCapGplxPhuongTienId(long capGplxPhuongTienId) {
		_capGplxPhuongTienId = capGplxPhuongTienId;
	}

	public String getMaTramDungNghi() {
		return _maTramDungNghi;
	}

	public void setMaTramDungNghi(String maTramDungNghi) {
		_maTramDungNghi = maTramDungNghi;
	}

	private long _id;
	private long _capGplxPhuongTienId;
	private String _maTramDungNghi;
}