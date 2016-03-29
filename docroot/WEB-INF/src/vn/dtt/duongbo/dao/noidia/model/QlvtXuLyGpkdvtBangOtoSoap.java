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

package vn.dtt.duongbo.dao.noidia.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.noidia.service.http.QlvtXuLyGpkdvtBangOtoServiceSoap}.
 *
 * @author NoiPham
 * @see vn.dtt.duongbo.dao.noidia.service.http.QlvtXuLyGpkdvtBangOtoServiceSoap
 * @generated
 */
public class QlvtXuLyGpkdvtBangOtoSoap implements Serializable {
	public static QlvtXuLyGpkdvtBangOtoSoap toSoapModel(
		QlvtXuLyGpkdvtBangOto model) {
		QlvtXuLyGpkdvtBangOtoSoap soapModel = new QlvtXuLyGpkdvtBangOtoSoap();

		soapModel.setId(model.getId());
		soapModel.setThongTinXuLyId(model.getThongTinXuLyId());
		soapModel.setLoaiHinhCap(model.getLoaiHinhCap());
		soapModel.setSoGpkdVanTaiBangOto(model.getSoGpkdVanTaiBangOto());
		soapModel.setNgayCapGpkdVanTaiBangOto(model.getNgayCapGpkdVanTaiBangOto());
		soapModel.setCoQuanCapGpkdVanTaiBangOto(model.getCoQuanCapGpkdVanTaiBangOto());
		soapModel.setNgayHetHanGpkdVanTaiBangOto(model.getNgayHetHanGpkdVanTaiBangOto());
		soapModel.setNguoiTrucTiepDieuHanh(model.getNguoiTrucTiepDieuHanh());
		soapModel.setSoCmtNguoiDieuHanh(model.getSoCmtNguoiDieuHanh());
		soapModel.setNgayCapNguoiDieuHanh(model.getNgayCapNguoiDieuHanh());
		soapModel.setNoiCapNguoiDieuHanh(model.getNoiCapNguoiDieuHanh());
		soapModel.setBangCapNguoiDieuHanh(model.getBangCapNguoiDieuHanh());
		soapModel.setThoiGianBatDauDieuHanh(model.getThoiGianBatDauDieuHanh());
		soapModel.setThoiGianKetThucDieuHanh(model.getThoiGianKetThucDieuHanh());
		soapModel.setSoGiayPhepNguoiDieuHanh(model.getSoGiayPhepNguoiDieuHanh());
		soapModel.setLanCapNguoiDieuHanh(model.getLanCapNguoiDieuHanh());
		soapModel.setNgayCapCcDieuHanh(model.getNgayCapCcDieuHanh());
		soapModel.setNgayHetHanCcDieuHanh(model.getNgayHetHanCcDieuHanh());
		soapModel.setKetQuaXuLy(model.getKetQuaXuLy());
		soapModel.setLyDoKhongDat(model.getLyDoKhongDat());
		soapModel.setKetQuaXuLyNguoiDieuHanh(model.getKetQuaXuLyNguoiDieuHanh());
		soapModel.setLyDoKhongDatNguoiDieuHanh(model.getLyDoKhongDatNguoiDieuHanh());

		return soapModel;
	}

	public static QlvtXuLyGpkdvtBangOtoSoap[] toSoapModels(
		QlvtXuLyGpkdvtBangOto[] models) {
		QlvtXuLyGpkdvtBangOtoSoap[] soapModels = new QlvtXuLyGpkdvtBangOtoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QlvtXuLyGpkdvtBangOtoSoap[][] toSoapModels(
		QlvtXuLyGpkdvtBangOto[][] models) {
		QlvtXuLyGpkdvtBangOtoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QlvtXuLyGpkdvtBangOtoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QlvtXuLyGpkdvtBangOtoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QlvtXuLyGpkdvtBangOtoSoap[] toSoapModels(
		List<QlvtXuLyGpkdvtBangOto> models) {
		List<QlvtXuLyGpkdvtBangOtoSoap> soapModels = new ArrayList<QlvtXuLyGpkdvtBangOtoSoap>(models.size());

		for (QlvtXuLyGpkdvtBangOto model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QlvtXuLyGpkdvtBangOtoSoap[soapModels.size()]);
	}

	public QlvtXuLyGpkdvtBangOtoSoap() {
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

	public String getLoaiHinhCap() {
		return _loaiHinhCap;
	}

	public void setLoaiHinhCap(String loaiHinhCap) {
		_loaiHinhCap = loaiHinhCap;
	}

	public String getSoGpkdVanTaiBangOto() {
		return _soGpkdVanTaiBangOto;
	}

	public void setSoGpkdVanTaiBangOto(String soGpkdVanTaiBangOto) {
		_soGpkdVanTaiBangOto = soGpkdVanTaiBangOto;
	}

	public Date getNgayCapGpkdVanTaiBangOto() {
		return _ngayCapGpkdVanTaiBangOto;
	}

	public void setNgayCapGpkdVanTaiBangOto(Date ngayCapGpkdVanTaiBangOto) {
		_ngayCapGpkdVanTaiBangOto = ngayCapGpkdVanTaiBangOto;
	}

	public String getCoQuanCapGpkdVanTaiBangOto() {
		return _coQuanCapGpkdVanTaiBangOto;
	}

	public void setCoQuanCapGpkdVanTaiBangOto(String coQuanCapGpkdVanTaiBangOto) {
		_coQuanCapGpkdVanTaiBangOto = coQuanCapGpkdVanTaiBangOto;
	}

	public Date getNgayHetHanGpkdVanTaiBangOto() {
		return _ngayHetHanGpkdVanTaiBangOto;
	}

	public void setNgayHetHanGpkdVanTaiBangOto(Date ngayHetHanGpkdVanTaiBangOto) {
		_ngayHetHanGpkdVanTaiBangOto = ngayHetHanGpkdVanTaiBangOto;
	}

	public String getNguoiTrucTiepDieuHanh() {
		return _nguoiTrucTiepDieuHanh;
	}

	public void setNguoiTrucTiepDieuHanh(String nguoiTrucTiepDieuHanh) {
		_nguoiTrucTiepDieuHanh = nguoiTrucTiepDieuHanh;
	}

	public String getSoCmtNguoiDieuHanh() {
		return _soCmtNguoiDieuHanh;
	}

	public void setSoCmtNguoiDieuHanh(String soCmtNguoiDieuHanh) {
		_soCmtNguoiDieuHanh = soCmtNguoiDieuHanh;
	}

	public Date getNgayCapNguoiDieuHanh() {
		return _ngayCapNguoiDieuHanh;
	}

	public void setNgayCapNguoiDieuHanh(Date ngayCapNguoiDieuHanh) {
		_ngayCapNguoiDieuHanh = ngayCapNguoiDieuHanh;
	}

	public String getNoiCapNguoiDieuHanh() {
		return _noiCapNguoiDieuHanh;
	}

	public void setNoiCapNguoiDieuHanh(String noiCapNguoiDieuHanh) {
		_noiCapNguoiDieuHanh = noiCapNguoiDieuHanh;
	}

	public String getBangCapNguoiDieuHanh() {
		return _bangCapNguoiDieuHanh;
	}

	public void setBangCapNguoiDieuHanh(String bangCapNguoiDieuHanh) {
		_bangCapNguoiDieuHanh = bangCapNguoiDieuHanh;
	}

	public Date getThoiGianBatDauDieuHanh() {
		return _thoiGianBatDauDieuHanh;
	}

	public void setThoiGianBatDauDieuHanh(Date thoiGianBatDauDieuHanh) {
		_thoiGianBatDauDieuHanh = thoiGianBatDauDieuHanh;
	}

	public Date getThoiGianKetThucDieuHanh() {
		return _thoiGianKetThucDieuHanh;
	}

	public void setThoiGianKetThucDieuHanh(Date thoiGianKetThucDieuHanh) {
		_thoiGianKetThucDieuHanh = thoiGianKetThucDieuHanh;
	}

	public String getSoGiayPhepNguoiDieuHanh() {
		return _soGiayPhepNguoiDieuHanh;
	}

	public void setSoGiayPhepNguoiDieuHanh(String soGiayPhepNguoiDieuHanh) {
		_soGiayPhepNguoiDieuHanh = soGiayPhepNguoiDieuHanh;
	}

	public int getLanCapNguoiDieuHanh() {
		return _lanCapNguoiDieuHanh;
	}

	public void setLanCapNguoiDieuHanh(int lanCapNguoiDieuHanh) {
		_lanCapNguoiDieuHanh = lanCapNguoiDieuHanh;
	}

	public Date getNgayCapCcDieuHanh() {
		return _ngayCapCcDieuHanh;
	}

	public void setNgayCapCcDieuHanh(Date ngayCapCcDieuHanh) {
		_ngayCapCcDieuHanh = ngayCapCcDieuHanh;
	}

	public Date getNgayHetHanCcDieuHanh() {
		return _ngayHetHanCcDieuHanh;
	}

	public void setNgayHetHanCcDieuHanh(Date ngayHetHanCcDieuHanh) {
		_ngayHetHanCcDieuHanh = ngayHetHanCcDieuHanh;
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

	public String getKetQuaXuLyNguoiDieuHanh() {
		return _ketQuaXuLyNguoiDieuHanh;
	}

	public void setKetQuaXuLyNguoiDieuHanh(String ketQuaXuLyNguoiDieuHanh) {
		_ketQuaXuLyNguoiDieuHanh = ketQuaXuLyNguoiDieuHanh;
	}

	public String getLyDoKhongDatNguoiDieuHanh() {
		return _lyDoKhongDatNguoiDieuHanh;
	}

	public void setLyDoKhongDatNguoiDieuHanh(String lyDoKhongDatNguoiDieuHanh) {
		_lyDoKhongDatNguoiDieuHanh = lyDoKhongDatNguoiDieuHanh;
	}

	private long _id;
	private int _thongTinXuLyId;
	private String _loaiHinhCap;
	private String _soGpkdVanTaiBangOto;
	private Date _ngayCapGpkdVanTaiBangOto;
	private String _coQuanCapGpkdVanTaiBangOto;
	private Date _ngayHetHanGpkdVanTaiBangOto;
	private String _nguoiTrucTiepDieuHanh;
	private String _soCmtNguoiDieuHanh;
	private Date _ngayCapNguoiDieuHanh;
	private String _noiCapNguoiDieuHanh;
	private String _bangCapNguoiDieuHanh;
	private Date _thoiGianBatDauDieuHanh;
	private Date _thoiGianKetThucDieuHanh;
	private String _soGiayPhepNguoiDieuHanh;
	private int _lanCapNguoiDieuHanh;
	private Date _ngayCapCcDieuHanh;
	private Date _ngayHetHanCcDieuHanh;
	private String _ketQuaXuLy;
	private String _lyDoKhongDat;
	private String _ketQuaXuLyNguoiDieuHanh;
	private String _lyDoKhongDatNguoiDieuHanh;
}