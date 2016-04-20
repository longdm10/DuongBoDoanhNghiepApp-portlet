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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.quocte.service.http.QlvtXuLyGpkdvtQuocTeServiceSoap}.
 *
 * @author NoiPham
 * @see vn.dtt.duongbo.dao.quocte.service.http.QlvtXuLyGpkdvtQuocTeServiceSoap
 * @generated
 */
public class QlvtXuLyGpkdvtQuocTeSoap implements Serializable {
	public static QlvtXuLyGpkdvtQuocTeSoap toSoapModel(
		QlvtXuLyGpkdvtQuocTe model) {
		QlvtXuLyGpkdvtQuocTeSoap soapModel = new QlvtXuLyGpkdvtQuocTeSoap();

		soapModel.setId(model.getId());
		soapModel.setThongTinXuLyId(model.getThongTinXuLyId());
		soapModel.setLoaiCapPhep(model.getLoaiCapPhep());
		soapModel.setSoGiapPhepVanTai(model.getSoGiapPhepVanTai());
		soapModel.setNgayCapGiayPhepVanTai(model.getNgayCapGiayPhepVanTai());
		soapModel.setCoQuanCapGiayPhepVanTaiId(model.getCoQuanCapGiayPhepVanTaiId());
		soapModel.setNgayHetHanGiayPhepVanTai(model.getNgayHetHanGiayPhepVanTai());
		soapModel.setMucPhi(model.getMucPhi());
		soapModel.setKetQuaXuLy(model.getKetQuaXuLy());
		soapModel.setLyDoKhongDat(model.getLyDoKhongDat());

		return soapModel;
	}

	public static QlvtXuLyGpkdvtQuocTeSoap[] toSoapModels(
		QlvtXuLyGpkdvtQuocTe[] models) {
		QlvtXuLyGpkdvtQuocTeSoap[] soapModels = new QlvtXuLyGpkdvtQuocTeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QlvtXuLyGpkdvtQuocTeSoap[][] toSoapModels(
		QlvtXuLyGpkdvtQuocTe[][] models) {
		QlvtXuLyGpkdvtQuocTeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QlvtXuLyGpkdvtQuocTeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QlvtXuLyGpkdvtQuocTeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QlvtXuLyGpkdvtQuocTeSoap[] toSoapModels(
		List<QlvtXuLyGpkdvtQuocTe> models) {
		List<QlvtXuLyGpkdvtQuocTeSoap> soapModels = new ArrayList<QlvtXuLyGpkdvtQuocTeSoap>(models.size());

		for (QlvtXuLyGpkdvtQuocTe model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QlvtXuLyGpkdvtQuocTeSoap[soapModels.size()]);
	}

	public QlvtXuLyGpkdvtQuocTeSoap() {
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

	public int getThongTinXuLyId() {
		return _thongTinXuLyId;
	}

	public void setThongTinXuLyId(int thongTinXuLyId) {
		_thongTinXuLyId = thongTinXuLyId;
	}

	public String getLoaiCapPhep() {
		return _loaiCapPhep;
	}

	public void setLoaiCapPhep(String loaiCapPhep) {
		_loaiCapPhep = loaiCapPhep;
	}

	public String getSoGiapPhepVanTai() {
		return _soGiapPhepVanTai;
	}

	public void setSoGiapPhepVanTai(String soGiapPhepVanTai) {
		_soGiapPhepVanTai = soGiapPhepVanTai;
	}

	public Date getNgayCapGiayPhepVanTai() {
		return _ngayCapGiayPhepVanTai;
	}

	public void setNgayCapGiayPhepVanTai(Date ngayCapGiayPhepVanTai) {
		_ngayCapGiayPhepVanTai = ngayCapGiayPhepVanTai;
	}

	public String getCoQuanCapGiayPhepVanTaiId() {
		return _coQuanCapGiayPhepVanTaiId;
	}

	public void setCoQuanCapGiayPhepVanTaiId(String coQuanCapGiayPhepVanTaiId) {
		_coQuanCapGiayPhepVanTaiId = coQuanCapGiayPhepVanTaiId;
	}

	public Date getNgayHetHanGiayPhepVanTai() {
		return _ngayHetHanGiayPhepVanTai;
	}

	public void setNgayHetHanGiayPhepVanTai(Date ngayHetHanGiayPhepVanTai) {
		_ngayHetHanGiayPhepVanTai = ngayHetHanGiayPhepVanTai;
	}

	public String getMucPhi() {
		return _mucPhi;
	}

	public void setMucPhi(String mucPhi) {
		_mucPhi = mucPhi;
	}

	public String getKetQuaXuLy() {
		return _ketQuaXuLy;
	}

	public void setKetQuaXuLy(String ketQuaXuLy) {
		_ketQuaXuLy = ketQuaXuLy;
	}

	public String getLyDoKhongDat() {
		return _lyDoKhongDat;
	}

	public void setLyDoKhongDat(String lyDoKhongDat) {
		_lyDoKhongDat = lyDoKhongDat;
	}

	private long _id;
	private int _thongTinXuLyId;
	private String _loaiCapPhep;
	private String _soGiapPhepVanTai;
	private Date _ngayCapGiayPhepVanTai;
	private String _coQuanCapGiayPhepVanTaiId;
	private Date _ngayHetHanGiayPhepVanTai;
	private String _mucPhi;
	private String _ketQuaXuLy;
	private String _lyDoKhongDat;
}