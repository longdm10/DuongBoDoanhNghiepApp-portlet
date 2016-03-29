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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.lienvan.service.http.QlvtXuLyGpLienVanServiceSoap}.
 *
 * @author NhanNc
 * @see vn.dtt.duongbo.dao.lienvan.service.http.QlvtXuLyGpLienVanServiceSoap
 * @generated
 */
public class QlvtXuLyGpLienVanSoap implements Serializable {
	public static QlvtXuLyGpLienVanSoap toSoapModel(QlvtXuLyGpLienVan model) {
		QlvtXuLyGpLienVanSoap soapModel = new QlvtXuLyGpLienVanSoap();

		soapModel.setId(model.getId());
		soapModel.setThongTinXuLyId(model.getThongTinXuLyId());
		soapModel.setLoaiCapPhep(model.getLoaiCapPhep());
		soapModel.setSoGpvt(model.getSoGpvt());
		soapModel.setNgayCapGpvt(model.getNgayCapGpvt());
		soapModel.setSoCongVanChapThuanTcd(model.getSoCongVanChapThuanTcd());
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
		soapModel.setLoaiGiayPhepLienVan(model.getLoaiGiayPhepLienVan());
		soapModel.setSoGiayPhepLienVan(model.getSoGiayPhepLienVan());
		soapModel.setNgayCapGiayPhepLienVan(model.getNgayCapGiayPhepLienVan());
		soapModel.setNgayHetHanGiayPhepLienVan(model.getNgayHetHanGiayPhepLienVan());
		soapModel.setCoQuanCapPhepLienVan(model.getCoQuanCapPhepLienVan());
		soapModel.setKetQuaXuLy(model.getKetQuaXuLy());
		soapModel.setLyDoKhongDat(model.getLyDoKhongDat());
		soapModel.setNgayCapGiayPhepLienVan_LanDau(model.getNgayCapGiayPhepLienVan_LanDau());

		return soapModel;
	}

	public static QlvtXuLyGpLienVanSoap[] toSoapModels(
		QlvtXuLyGpLienVan[] models) {
		QlvtXuLyGpLienVanSoap[] soapModels = new QlvtXuLyGpLienVanSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QlvtXuLyGpLienVanSoap[][] toSoapModels(
		QlvtXuLyGpLienVan[][] models) {
		QlvtXuLyGpLienVanSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QlvtXuLyGpLienVanSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QlvtXuLyGpLienVanSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QlvtXuLyGpLienVanSoap[] toSoapModels(
		List<QlvtXuLyGpLienVan> models) {
		List<QlvtXuLyGpLienVanSoap> soapModels = new ArrayList<QlvtXuLyGpLienVanSoap>(models.size());

		for (QlvtXuLyGpLienVan model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QlvtXuLyGpLienVanSoap[soapModels.size()]);
	}

	public QlvtXuLyGpLienVanSoap() {
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

	public long getThongTinXuLyId() {
		return _thongTinXuLyId;
	}

	public void setThongTinXuLyId(long thongTinXuLyId) {
		_thongTinXuLyId = thongTinXuLyId;
	}

	public String getLoaiCapPhep() {
		return _loaiCapPhep;
	}

	public void setLoaiCapPhep(String loaiCapPhep) {
		_loaiCapPhep = loaiCapPhep;
	}

	public String getSoGpvt() {
		return _soGpvt;
	}

	public void setSoGpvt(String soGpvt) {
		_soGpvt = soGpvt;
	}

	public Date getNgayCapGpvt() {
		return _ngayCapGpvt;
	}

	public void setNgayCapGpvt(Date ngayCapGpvt) {
		_ngayCapGpvt = ngayCapGpvt;
	}

	public String getSoCongVanChapThuanTcd() {
		return _soCongVanChapThuanTcd;
	}

	public void setSoCongVanChapThuanTcd(String soCongVanChapThuanTcd) {
		_soCongVanChapThuanTcd = soCongVanChapThuanTcd;
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

	public Date getNgayCapGiayPhepLienVan() {
		return _ngayCapGiayPhepLienVan;
	}

	public void setNgayCapGiayPhepLienVan(Date ngayCapGiayPhepLienVan) {
		_ngayCapGiayPhepLienVan = ngayCapGiayPhepLienVan;
	}

	public Date getNgayHetHanGiayPhepLienVan() {
		return _ngayHetHanGiayPhepLienVan;
	}

	public void setNgayHetHanGiayPhepLienVan(Date ngayHetHanGiayPhepLienVan) {
		_ngayHetHanGiayPhepLienVan = ngayHetHanGiayPhepLienVan;
	}

	public String getCoQuanCapPhepLienVan() {
		return _coQuanCapPhepLienVan;
	}

	public void setCoQuanCapPhepLienVan(String coQuanCapPhepLienVan) {
		_coQuanCapPhepLienVan = coQuanCapPhepLienVan;
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

	public Date getNgayCapGiayPhepLienVan_LanDau() {
		return _ngayCapGiayPhepLienVan_LanDau;
	}

	public void setNgayCapGiayPhepLienVan_LanDau(
		Date ngayCapGiayPhepLienVan_LanDau) {
		_ngayCapGiayPhepLienVan_LanDau = ngayCapGiayPhepLienVan_LanDau;
	}

	private long _id;
	private long _thongTinXuLyId;
	private String _loaiCapPhep;
	private String _soGpvt;
	private Date _ngayCapGpvt;
	private String _soCongVanChapThuanTcd;
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
	private String _loaiGiayPhepLienVan;
	private String _soGiayPhepLienVan;
	private Date _ngayCapGiayPhepLienVan;
	private Date _ngayHetHanGiayPhepLienVan;
	private String _coQuanCapPhepLienVan;
	private String _ketQuaXuLy;
	private String _lyDoKhongDat;
	private Date _ngayCapGiayPhepLienVan_LanDau;
}