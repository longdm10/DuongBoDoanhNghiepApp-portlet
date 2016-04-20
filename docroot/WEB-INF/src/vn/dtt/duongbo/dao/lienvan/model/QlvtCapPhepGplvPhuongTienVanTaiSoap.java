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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.lienvan.service.http.QlvtCapPhepGplvPhuongTienVanTaiServiceSoap}.
 *
 * @author NhanNc
 * @see vn.dtt.duongbo.dao.lienvan.service.http.QlvtCapPhepGplvPhuongTienVanTaiServiceSoap
 * @generated
 */
public class QlvtCapPhepGplvPhuongTienVanTaiSoap implements Serializable {
	public static QlvtCapPhepGplvPhuongTienVanTaiSoap toSoapModel(
		QlvtCapPhepGplvPhuongTienVanTai model) {
		QlvtCapPhepGplvPhuongTienVanTaiSoap soapModel = new QlvtCapPhepGplvPhuongTienVanTaiSoap();

		soapModel.setId(model.getId());
		soapModel.setCapphepGplienvanPhuongtienId(model.getCapphepGplienvanPhuongtienId());
		soapModel.setCapphepPhuongtienvantaiId(model.getCapphepPhuongtienvantaiId());

		return soapModel;
	}

	public static QlvtCapPhepGplvPhuongTienVanTaiSoap[] toSoapModels(
		QlvtCapPhepGplvPhuongTienVanTai[] models) {
		QlvtCapPhepGplvPhuongTienVanTaiSoap[] soapModels = new QlvtCapPhepGplvPhuongTienVanTaiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QlvtCapPhepGplvPhuongTienVanTaiSoap[][] toSoapModels(
		QlvtCapPhepGplvPhuongTienVanTai[][] models) {
		QlvtCapPhepGplvPhuongTienVanTaiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QlvtCapPhepGplvPhuongTienVanTaiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QlvtCapPhepGplvPhuongTienVanTaiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QlvtCapPhepGplvPhuongTienVanTaiSoap[] toSoapModels(
		List<QlvtCapPhepGplvPhuongTienVanTai> models) {
		List<QlvtCapPhepGplvPhuongTienVanTaiSoap> soapModels = new ArrayList<QlvtCapPhepGplvPhuongTienVanTaiSoap>(models.size());

		for (QlvtCapPhepGplvPhuongTienVanTai model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QlvtCapPhepGplvPhuongTienVanTaiSoap[soapModels.size()]);
	}

	public QlvtCapPhepGplvPhuongTienVanTaiSoap() {
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

	public long getCapphepGplienvanPhuongtienId() {
		return _capphepGplienvanPhuongtienId;
	}

	public void setCapphepGplienvanPhuongtienId(
		long capphepGplienvanPhuongtienId) {
		_capphepGplienvanPhuongtienId = capphepGplienvanPhuongtienId;
	}

	public long getCapphepPhuongtienvantaiId() {
		return _capphepPhuongtienvantaiId;
	}

	public void setCapphepPhuongtienvantaiId(long capphepPhuongtienvantaiId) {
		_capphepPhuongtienvantaiId = capphepPhuongtienvantaiId;
	}

	private long _id;
	private long _capphepGplienvanPhuongtienId;
	private long _capphepPhuongtienvantaiId;
}