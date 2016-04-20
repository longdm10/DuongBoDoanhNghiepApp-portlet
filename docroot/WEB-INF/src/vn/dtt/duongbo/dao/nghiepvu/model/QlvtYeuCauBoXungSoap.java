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

package vn.dtt.duongbo.dao.nghiepvu.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.nghiepvu.service.http.QlvtYeuCauBoXungServiceSoap}.
 *
 * @author NhanNc
 * @see vn.dtt.duongbo.dao.nghiepvu.service.http.QlvtYeuCauBoXungServiceSoap
 * @generated
 */
public class QlvtYeuCauBoXungSoap implements Serializable {
	public static QlvtYeuCauBoXungSoap toSoapModel(QlvtYeuCauBoXung model) {
		QlvtYeuCauBoXungSoap soapModel = new QlvtYeuCauBoXungSoap();

		soapModel.setId(model.getId());
		soapModel.setNoiDung(model.getNoiDung());
		soapModel.setThongTinXuLyId(model.getThongTinXuLyId());
		soapModel.setSoCongVan(model.getSoCongVan());
		soapModel.setNgayCongVan(model.getNgayCongVan());
		soapModel.setFileID(model.getFileID());

		return soapModel;
	}

	public static QlvtYeuCauBoXungSoap[] toSoapModels(QlvtYeuCauBoXung[] models) {
		QlvtYeuCauBoXungSoap[] soapModels = new QlvtYeuCauBoXungSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QlvtYeuCauBoXungSoap[][] toSoapModels(
		QlvtYeuCauBoXung[][] models) {
		QlvtYeuCauBoXungSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QlvtYeuCauBoXungSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QlvtYeuCauBoXungSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QlvtYeuCauBoXungSoap[] toSoapModels(
		List<QlvtYeuCauBoXung> models) {
		List<QlvtYeuCauBoXungSoap> soapModels = new ArrayList<QlvtYeuCauBoXungSoap>(models.size());

		for (QlvtYeuCauBoXung model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QlvtYeuCauBoXungSoap[soapModels.size()]);
	}

	public QlvtYeuCauBoXungSoap() {
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

	public String getNoiDung() {
		return _noiDung;
	}

	public void setNoiDung(String noiDung) {
		_noiDung = noiDung;
	}

	public int getThongTinXuLyId() {
		return _thongTinXuLyId;
	}

	public void setThongTinXuLyId(int thongTinXuLyId) {
		_thongTinXuLyId = thongTinXuLyId;
	}

	public String getSoCongVan() {
		return _soCongVan;
	}

	public void setSoCongVan(String soCongVan) {
		_soCongVan = soCongVan;
	}

	public Date getNgayCongVan() {
		return _ngayCongVan;
	}

	public void setNgayCongVan(Date ngayCongVan) {
		_ngayCongVan = ngayCongVan;
	}

	public int getFileID() {
		return _fileID;
	}

	public void setFileID(int fileID) {
		_fileID = fileID;
	}

	private long _id;
	private String _noiDung;
	private int _thongTinXuLyId;
	private String _soCongVan;
	private Date _ngayCongVan;
	private int _fileID;
}