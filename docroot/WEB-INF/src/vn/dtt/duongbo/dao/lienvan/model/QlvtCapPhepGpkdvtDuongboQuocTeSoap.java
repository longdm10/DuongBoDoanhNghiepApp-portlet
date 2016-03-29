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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.lienvan.service.http.QlvtCapPhepGpkdvtDuongboQuocTeServiceSoap}.
 *
 * @author NhanNc
 * @see vn.dtt.duongbo.dao.lienvan.service.http.QlvtCapPhepGpkdvtDuongboQuocTeServiceSoap
 * @generated
 */
public class QlvtCapPhepGpkdvtDuongboQuocTeSoap implements Serializable {
	public static QlvtCapPhepGpkdvtDuongboQuocTeSoap toSoapModel(
		QlvtCapPhepGpkdvtDuongboQuocTe model) {
		QlvtCapPhepGpkdvtDuongboQuocTeSoap soapModel = new QlvtCapPhepGpkdvtDuongboQuocTeSoap();

		soapModel.setId(model.getId());
		soapModel.setGpKinhDoanhVanTaiOtoId(model.getGpKinhDoanhVanTaiOtoId());
		soapModel.setSoGpvtQuocTe(model.getSoGpvtQuocTe());
		soapModel.setCoQuanCapLanDauId(model.getCoQuanCapLanDauId());
		soapModel.setNgayCapGpvt(model.getNgayCapGpvt());
		soapModel.setCoQuanCapGpvtId(model.getCoQuanCapGpvtId());
		soapModel.setNgayGiaHan(model.getNgayGiaHan());
		soapModel.setNgayHetHan(model.getNgayHetHan());
		soapModel.setLanGiaHan(model.getLanGiaHan());
		soapModel.setFileId(model.getFileId());
		soapModel.setTrangThai(model.getTrangThai());

		return soapModel;
	}

	public static QlvtCapPhepGpkdvtDuongboQuocTeSoap[] toSoapModels(
		QlvtCapPhepGpkdvtDuongboQuocTe[] models) {
		QlvtCapPhepGpkdvtDuongboQuocTeSoap[] soapModels = new QlvtCapPhepGpkdvtDuongboQuocTeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QlvtCapPhepGpkdvtDuongboQuocTeSoap[][] toSoapModels(
		QlvtCapPhepGpkdvtDuongboQuocTe[][] models) {
		QlvtCapPhepGpkdvtDuongboQuocTeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QlvtCapPhepGpkdvtDuongboQuocTeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QlvtCapPhepGpkdvtDuongboQuocTeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QlvtCapPhepGpkdvtDuongboQuocTeSoap[] toSoapModels(
		List<QlvtCapPhepGpkdvtDuongboQuocTe> models) {
		List<QlvtCapPhepGpkdvtDuongboQuocTeSoap> soapModels = new ArrayList<QlvtCapPhepGpkdvtDuongboQuocTeSoap>(models.size());

		for (QlvtCapPhepGpkdvtDuongboQuocTe model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QlvtCapPhepGpkdvtDuongboQuocTeSoap[soapModels.size()]);
	}

	public QlvtCapPhepGpkdvtDuongboQuocTeSoap() {
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

	public long getGpKinhDoanhVanTaiOtoId() {
		return _gpKinhDoanhVanTaiOtoId;
	}

	public void setGpKinhDoanhVanTaiOtoId(long gpKinhDoanhVanTaiOtoId) {
		_gpKinhDoanhVanTaiOtoId = gpKinhDoanhVanTaiOtoId;
	}

	public String getSoGpvtQuocTe() {
		return _soGpvtQuocTe;
	}

	public void setSoGpvtQuocTe(String soGpvtQuocTe) {
		_soGpvtQuocTe = soGpvtQuocTe;
	}

	public long getCoQuanCapLanDauId() {
		return _coQuanCapLanDauId;
	}

	public void setCoQuanCapLanDauId(long coQuanCapLanDauId) {
		_coQuanCapLanDauId = coQuanCapLanDauId;
	}

	public Date getNgayCapGpvt() {
		return _ngayCapGpvt;
	}

	public void setNgayCapGpvt(Date ngayCapGpvt) {
		_ngayCapGpvt = ngayCapGpvt;
	}

	public long getCoQuanCapGpvtId() {
		return _coQuanCapGpvtId;
	}

	public void setCoQuanCapGpvtId(long coQuanCapGpvtId) {
		_coQuanCapGpvtId = coQuanCapGpvtId;
	}

	public Date getNgayGiaHan() {
		return _ngayGiaHan;
	}

	public void setNgayGiaHan(Date ngayGiaHan) {
		_ngayGiaHan = ngayGiaHan;
	}

	public Date getNgayHetHan() {
		return _ngayHetHan;
	}

	public void setNgayHetHan(Date ngayHetHan) {
		_ngayHetHan = ngayHetHan;
	}

	public int getLanGiaHan() {
		return _lanGiaHan;
	}

	public void setLanGiaHan(int lanGiaHan) {
		_lanGiaHan = lanGiaHan;
	}

	public long getFileId() {
		return _fileId;
	}

	public void setFileId(long fileId) {
		_fileId = fileId;
	}

	public String getTrangThai() {
		return _trangThai;
	}

	public void setTrangThai(String trangThai) {
		_trangThai = trangThai;
	}

	private long _id;
	private long _gpKinhDoanhVanTaiOtoId;
	private String _soGpvtQuocTe;
	private long _coQuanCapLanDauId;
	private Date _ngayCapGpvt;
	private long _coQuanCapGpvtId;
	private Date _ngayGiaHan;
	private Date _ngayHetHan;
	private int _lanGiaHan;
	private long _fileId;
	private String _trangThai;
}