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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.lienvan.service.http.QlvtCapPhepGpLienVanServiceSoap}.
 *
 * @author NhanNc
 * @see vn.dtt.duongbo.dao.lienvan.service.http.QlvtCapPhepGpLienVanServiceSoap
 * @generated
 */
public class QlvtCapPhepGpLienVanSoap implements Serializable {
	public static QlvtCapPhepGpLienVanSoap toSoapModel(
		QlvtCapPhepGpLienVan model) {
		QlvtCapPhepGpLienVanSoap soapModel = new QlvtCapPhepGpLienVanSoap();

		soapModel.setId(model.getId());
		soapModel.setGpkdvtVietLaoId(model.getGpkdvtVietLaoId());
		soapModel.setLoaiCapPhep(model.getLoaiCapPhep());
		soapModel.setLoaiGiayPhepLienVan(model.getLoaiGiayPhepLienVan());
		soapModel.setSoGiayPhepLienVan(model.getSoGiayPhepLienVan());
		soapModel.setNgayCapGplv(model.getNgayCapGplv());
		soapModel.setNgayHetHanGplv(model.getNgayHetHanGplv());
		soapModel.setCoQuanCpLienVan(model.getCoQuanCpLienVan());
		soapModel.setSoCongVanChapThuanTCD(model.getSoCongVanChapThuanTCD());
		soapModel.setNgayCongVanChapThuanTCD(model.getNgayCongVanChapThuanTCD());
		soapModel.setTuyenTu(model.getTuyenTu());
		soapModel.setTuyenDi(model.getTuyenDi());
		soapModel.setCuLy(model.getCuLy());
		soapModel.setMaBenDi(model.getMaBenDi());
		soapModel.setMaBenDen(model.getMaBenDen());
		soapModel.setMaTinhDi(model.getMaTinhDi());
		soapModel.setMaTinhDen(model.getMaTinhDen());
		soapModel.setHanhTrinh(model.getHanhTrinh());
		soapModel.setMucPhi(model.getMucPhi());
		soapModel.setMucDichChuyenDi(model.getMucDichChuyenDi());
		soapModel.setFileId(model.getFileId());
		soapModel.setTrangThai(model.getTrangThai());

		return soapModel;
	}

	public static QlvtCapPhepGpLienVanSoap[] toSoapModels(
		QlvtCapPhepGpLienVan[] models) {
		QlvtCapPhepGpLienVanSoap[] soapModels = new QlvtCapPhepGpLienVanSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QlvtCapPhepGpLienVanSoap[][] toSoapModels(
		QlvtCapPhepGpLienVan[][] models) {
		QlvtCapPhepGpLienVanSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QlvtCapPhepGpLienVanSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QlvtCapPhepGpLienVanSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QlvtCapPhepGpLienVanSoap[] toSoapModels(
		List<QlvtCapPhepGpLienVan> models) {
		List<QlvtCapPhepGpLienVanSoap> soapModels = new ArrayList<QlvtCapPhepGpLienVanSoap>(models.size());

		for (QlvtCapPhepGpLienVan model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QlvtCapPhepGpLienVanSoap[soapModels.size()]);
	}

	public QlvtCapPhepGpLienVanSoap() {
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

	public long getGpkdvtVietLaoId() {
		return _gpkdvtVietLaoId;
	}

	public void setGpkdvtVietLaoId(long gpkdvtVietLaoId) {
		_gpkdvtVietLaoId = gpkdvtVietLaoId;
	}

	public String getLoaiCapPhep() {
		return _loaiCapPhep;
	}

	public void setLoaiCapPhep(String loaiCapPhep) {
		_loaiCapPhep = loaiCapPhep;
	}

	public String getLoaiGiayPhepLienVan() {
		return _loaiGiayPhepLienVan;
	}

	public void setLoaiGiayPhepLienVan(String loaiGiayPhepLienVan) {
		_loaiGiayPhepLienVan = loaiGiayPhepLienVan;
	}

	public String getSoGiayPhepLienVan() {
		return _soGiayPhepLienVan;
	}

	public void setSoGiayPhepLienVan(String soGiayPhepLienVan) {
		_soGiayPhepLienVan = soGiayPhepLienVan;
	}

	public Date getNgayCapGplv() {
		return _ngayCapGplv;
	}

	public void setNgayCapGplv(Date ngayCapGplv) {
		_ngayCapGplv = ngayCapGplv;
	}

	public Date getNgayHetHanGplv() {
		return _ngayHetHanGplv;
	}

	public void setNgayHetHanGplv(Date ngayHetHanGplv) {
		_ngayHetHanGplv = ngayHetHanGplv;
	}

	public String getCoQuanCpLienVan() {
		return _coQuanCpLienVan;
	}

	public void setCoQuanCpLienVan(String coQuanCpLienVan) {
		_coQuanCpLienVan = coQuanCpLienVan;
	}

	public String getSoCongVanChapThuanTCD() {
		return _soCongVanChapThuanTCD;
	}

	public void setSoCongVanChapThuanTCD(String soCongVanChapThuanTCD) {
		_soCongVanChapThuanTCD = soCongVanChapThuanTCD;
	}

	public Date getNgayCongVanChapThuanTCD() {
		return _ngayCongVanChapThuanTCD;
	}

	public void setNgayCongVanChapThuanTCD(Date ngayCongVanChapThuanTCD) {
		_ngayCongVanChapThuanTCD = ngayCongVanChapThuanTCD;
	}

	public String getTuyenTu() {
		return _tuyenTu;
	}

	public void setTuyenTu(String tuyenTu) {
		_tuyenTu = tuyenTu;
	}

	public String getTuyenDi() {
		return _tuyenDi;
	}

	public void setTuyenDi(String tuyenDi) {
		_tuyenDi = tuyenDi;
	}

	public String getCuLy() {
		return _cuLy;
	}

	public void setCuLy(String cuLy) {
		_cuLy = cuLy;
	}

	public String getMaBenDi() {
		return _maBenDi;
	}

	public void setMaBenDi(String maBenDi) {
		_maBenDi = maBenDi;
	}

	public String getMaBenDen() {
		return _maBenDen;
	}

	public void setMaBenDen(String maBenDen) {
		_maBenDen = maBenDen;
	}

	public String getMaTinhDi() {
		return _maTinhDi;
	}

	public void setMaTinhDi(String maTinhDi) {
		_maTinhDi = maTinhDi;
	}

	public String getMaTinhDen() {
		return _maTinhDen;
	}

	public void setMaTinhDen(String maTinhDen) {
		_maTinhDen = maTinhDen;
	}

	public String getHanhTrinh() {
		return _hanhTrinh;
	}

	public void setHanhTrinh(String hanhTrinh) {
		_hanhTrinh = hanhTrinh;
	}

	public String getMucPhi() {
		return _mucPhi;
	}

	public void setMucPhi(String mucPhi) {
		_mucPhi = mucPhi;
	}

	public String getMucDichChuyenDi() {
		return _mucDichChuyenDi;
	}

	public void setMucDichChuyenDi(String mucDichChuyenDi) {
		_mucDichChuyenDi = mucDichChuyenDi;
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
	private long _gpkdvtVietLaoId;
	private String _loaiCapPhep;
	private String _loaiGiayPhepLienVan;
	private String _soGiayPhepLienVan;
	private Date _ngayCapGplv;
	private Date _ngayHetHanGplv;
	private String _coQuanCpLienVan;
	private String _soCongVanChapThuanTCD;
	private Date _ngayCongVanChapThuanTCD;
	private String _tuyenTu;
	private String _tuyenDi;
	private String _cuLy;
	private String _maBenDi;
	private String _maBenDen;
	private String _maTinhDi;
	private String _maTinhDen;
	private String _hanhTrinh;
	private String _mucPhi;
	private String _mucDichChuyenDi;
	private long _fileId;
	private String _trangThai;
}