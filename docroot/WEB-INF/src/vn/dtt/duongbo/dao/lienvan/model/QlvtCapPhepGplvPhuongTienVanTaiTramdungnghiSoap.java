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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.lienvan.service.http.QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiServiceSoap}.
 *
 * @author NhanNc
 * @see vn.dtt.duongbo.dao.lienvan.service.http.QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiServiceSoap
 * @generated
 */
public class QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiSoap
	implements Serializable {
	public static QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiSoap toSoapModel(
		QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi model) {
		QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiSoap soapModel = new QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiSoap();

		soapModel.setId(model.getId());
		soapModel.setCapGplienvanPhuongtienId(model.getCapGplienvanPhuongtienId());
		soapModel.setMaTramDungNghi(model.getMaTramDungNghi());

		return soapModel;
	}

	public static QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiSoap[] toSoapModels(
		QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi[] models) {
		QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiSoap[] soapModels = new QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiSoap[][] toSoapModels(
		QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi[][] models) {
		QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiSoap[] toSoapModels(
		List<QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi> models) {
		List<QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiSoap> soapModels = new ArrayList<QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiSoap>(models.size());

		for (QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiSoap[soapModels.size()]);
	}

	public QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiSoap() {
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

	public long getCapGplienvanPhuongtienId() {
		return _capGplienvanPhuongtienId;
	}

	public void setCapGplienvanPhuongtienId(long capGplienvanPhuongtienId) {
		_capGplienvanPhuongtienId = capGplienvanPhuongtienId;
	}

	public String getMaTramDungNghi() {
		return _maTramDungNghi;
	}

	public void setMaTramDungNghi(String maTramDungNghi) {
		_maTramDungNghi = maTramDungNghi;
	}

	private long _id;
	private long _capGplienvanPhuongtienId;
	private String _maTramDungNghi;
}