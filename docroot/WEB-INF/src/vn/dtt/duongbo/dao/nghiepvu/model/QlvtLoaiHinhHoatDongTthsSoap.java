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
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.nghiepvu.service.http.QlvtLoaiHinhHoatDongTthsServiceSoap}.
 *
 * @author NhanNc
 * @see vn.dtt.duongbo.dao.nghiepvu.service.http.QlvtLoaiHinhHoatDongTthsServiceSoap
 * @generated
 */
public class QlvtLoaiHinhHoatDongTthsSoap implements Serializable {
	public static QlvtLoaiHinhHoatDongTthsSoap toSoapModel(
		QlvtLoaiHinhHoatDongTths model) {
		QlvtLoaiHinhHoatDongTthsSoap soapModel = new QlvtLoaiHinhHoatDongTthsSoap();

		soapModel.setId(model.getId());
		soapModel.setMaLoaiHinhHoatDong(model.getMaLoaiHinhHoatDong());
		soapModel.setThongTinHoSoId(model.getThongTinHoSoId());
		soapModel.setSoLuongPhuongTien(model.getSoLuongPhuongTien());
		soapModel.setThietBiGiamSatHanhTrinh(model.getThietBiGiamSatHanhTrinh());
		soapModel.setTuyenTu(model.getTuyenTu());
		soapModel.setTuyenDen(model.getTuyenDen());
		soapModel.setSoChuyen(model.getSoChuyen());
		soapModel.setMauSon(model.getMauSon());
		soapModel.setLoaiHinhKinhDoanhCuThe(model.getLoaiHinhKinhDoanhCuThe());
		soapModel.setDanhGia(model.getDanhGia());
		soapModel.setLyDoKhongDat(model.getLyDoKhongDat());

		return soapModel;
	}

	public static QlvtLoaiHinhHoatDongTthsSoap[] toSoapModels(
		QlvtLoaiHinhHoatDongTths[] models) {
		QlvtLoaiHinhHoatDongTthsSoap[] soapModels = new QlvtLoaiHinhHoatDongTthsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QlvtLoaiHinhHoatDongTthsSoap[][] toSoapModels(
		QlvtLoaiHinhHoatDongTths[][] models) {
		QlvtLoaiHinhHoatDongTthsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QlvtLoaiHinhHoatDongTthsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QlvtLoaiHinhHoatDongTthsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QlvtLoaiHinhHoatDongTthsSoap[] toSoapModels(
		List<QlvtLoaiHinhHoatDongTths> models) {
		List<QlvtLoaiHinhHoatDongTthsSoap> soapModels = new ArrayList<QlvtLoaiHinhHoatDongTthsSoap>(models.size());

		for (QlvtLoaiHinhHoatDongTths model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QlvtLoaiHinhHoatDongTthsSoap[soapModels.size()]);
	}

	public QlvtLoaiHinhHoatDongTthsSoap() {
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

	public String getMaLoaiHinhHoatDong() {
		return _maLoaiHinhHoatDong;
	}

	public void setMaLoaiHinhHoatDong(String maLoaiHinhHoatDong) {
		_maLoaiHinhHoatDong = maLoaiHinhHoatDong;
	}

	public long getThongTinHoSoId() {
		return _thongTinHoSoId;
	}

	public void setThongTinHoSoId(long thongTinHoSoId) {
		_thongTinHoSoId = thongTinHoSoId;
	}

	public int getSoLuongPhuongTien() {
		return _soLuongPhuongTien;
	}

	public void setSoLuongPhuongTien(int soLuongPhuongTien) {
		_soLuongPhuongTien = soLuongPhuongTien;
	}

	public int getThietBiGiamSatHanhTrinh() {
		return _thietBiGiamSatHanhTrinh;
	}

	public void setThietBiGiamSatHanhTrinh(int thietBiGiamSatHanhTrinh) {
		_thietBiGiamSatHanhTrinh = thietBiGiamSatHanhTrinh;
	}

	public String getTuyenTu() {
		return _tuyenTu;
	}

	public void setTuyenTu(String tuyenTu) {
		_tuyenTu = tuyenTu;
	}

	public String getTuyenDen() {
		return _tuyenDen;
	}

	public void setTuyenDen(String tuyenDen) {
		_tuyenDen = tuyenDen;
	}

	public long getSoChuyen() {
		return _soChuyen;
	}

	public void setSoChuyen(long soChuyen) {
		_soChuyen = soChuyen;
	}

	public String getMauSon() {
		return _mauSon;
	}

	public void setMauSon(String mauSon) {
		_mauSon = mauSon;
	}

	public String getLoaiHinhKinhDoanhCuThe() {
		return _loaiHinhKinhDoanhCuThe;
	}

	public void setLoaiHinhKinhDoanhCuThe(String loaiHinhKinhDoanhCuThe) {
		_loaiHinhKinhDoanhCuThe = loaiHinhKinhDoanhCuThe;
	}

	public int getDanhGia() {
		return _danhGia;
	}

	public void setDanhGia(int danhGia) {
		_danhGia = danhGia;
	}

	public String getLyDoKhongDat() {
		return _lyDoKhongDat;
	}

	public void setLyDoKhongDat(String lyDoKhongDat) {
		_lyDoKhongDat = lyDoKhongDat;
	}

	private long _id;
	private String _maLoaiHinhHoatDong;
	private long _thongTinHoSoId;
	private int _soLuongPhuongTien;
	private int _thietBiGiamSatHanhTrinh;
	private String _tuyenTu;
	private String _tuyenDen;
	private long _soChuyen;
	private String _mauSon;
	private String _loaiHinhKinhDoanhCuThe;
	private int _danhGia;
	private String _lyDoKhongDat;
}