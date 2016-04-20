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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.nghiepvu.service.http.QlvtQuanLyFileServiceSoap}.
 *
 * @author NhanNc
 * @see vn.dtt.duongbo.dao.nghiepvu.service.http.QlvtQuanLyFileServiceSoap
 * @generated
 */
public class QlvtQuanLyFileSoap implements Serializable {
	public static QlvtQuanLyFileSoap toSoapModel(QlvtQuanLyFile model) {
		QlvtQuanLyFileSoap soapModel = new QlvtQuanLyFileSoap();

		soapModel.setId(model.getId());
		soapModel.setTenFile(model.getTenFile());
		soapModel.setLoaiFile(model.getLoaiFile());
		soapModel.setThongTinFile(model.getThongTinFile());
		soapModel.setNgayTai(model.getNgayTai());
		soapModel.setNgayCap(model.getNgayCap());
		soapModel.setNgayHetHan(model.getNgayHetHan());
		soapModel.setIdFile(model.getIdFile());
		soapModel.setTrangThai(model.getTrangThai());
		soapModel.setDoanhNghiepId(model.getDoanhNghiepId());
		soapModel.setTaiKhoan(model.getTaiKhoan());
		soapModel.setMieuTa(model.getMieuTa());

		return soapModel;
	}

	public static QlvtQuanLyFileSoap[] toSoapModels(QlvtQuanLyFile[] models) {
		QlvtQuanLyFileSoap[] soapModels = new QlvtQuanLyFileSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QlvtQuanLyFileSoap[][] toSoapModels(QlvtQuanLyFile[][] models) {
		QlvtQuanLyFileSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QlvtQuanLyFileSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QlvtQuanLyFileSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QlvtQuanLyFileSoap[] toSoapModels(List<QlvtQuanLyFile> models) {
		List<QlvtQuanLyFileSoap> soapModels = new ArrayList<QlvtQuanLyFileSoap>(models.size());

		for (QlvtQuanLyFile model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QlvtQuanLyFileSoap[soapModels.size()]);
	}

	public QlvtQuanLyFileSoap() {
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

	public String getTenFile() {
		return _tenFile;
	}

	public void setTenFile(String tenFile) {
		_tenFile = tenFile;
	}

	public long getLoaiFile() {
		return _loaiFile;
	}

	public void setLoaiFile(long loaiFile) {
		_loaiFile = loaiFile;
	}

	public String getThongTinFile() {
		return _thongTinFile;
	}

	public void setThongTinFile(String thongTinFile) {
		_thongTinFile = thongTinFile;
	}

	public Date getNgayTai() {
		return _ngayTai;
	}

	public void setNgayTai(Date ngayTai) {
		_ngayTai = ngayTai;
	}

	public Date getNgayCap() {
		return _ngayCap;
	}

	public void setNgayCap(Date ngayCap) {
		_ngayCap = ngayCap;
	}

	public Date getNgayHetHan() {
		return _ngayHetHan;
	}

	public void setNgayHetHan(Date ngayHetHan) {
		_ngayHetHan = ngayHetHan;
	}

	public long getIdFile() {
		return _idFile;
	}

	public void setIdFile(long idFile) {
		_idFile = idFile;
	}

	public String getTrangThai() {
		return _trangThai;
	}

	public void setTrangThai(String trangThai) {
		_trangThai = trangThai;
	}

	public long getDoanhNghiepId() {
		return _doanhNghiepId;
	}

	public void setDoanhNghiepId(long doanhNghiepId) {
		_doanhNghiepId = doanhNghiepId;
	}

	public long getTaiKhoan() {
		return _taiKhoan;
	}

	public void setTaiKhoan(long taiKhoan) {
		_taiKhoan = taiKhoan;
	}

	public String getMieuTa() {
		return _mieuTa;
	}

	public void setMieuTa(String mieuTa) {
		_mieuTa = mieuTa;
	}

	private long _id;
	private String _tenFile;
	private long _loaiFile;
	private String _thongTinFile;
	private Date _ngayTai;
	private Date _ngayCap;
	private Date _ngayHetHan;
	private long _idFile;
	private String _trangThai;
	private long _doanhNghiepId;
	private long _taiKhoan;
	private String _mieuTa;
}