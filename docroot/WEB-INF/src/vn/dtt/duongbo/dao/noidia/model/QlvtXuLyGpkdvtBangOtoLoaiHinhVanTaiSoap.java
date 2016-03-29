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
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.noidia.service.http.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiServiceSoap}.
 *
 * @author NoiPham
 * @see vn.dtt.duongbo.dao.noidia.service.http.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiServiceSoap
 * @generated
 */
public class QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiSoap implements Serializable {
	public static QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiSoap toSoapModel(
		QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai model) {
		QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiSoap soapModel = new QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiSoap();

		soapModel.setId(model.getId());
		soapModel.setGpkdvtBangOtoId(model.getGpkdvtBangOtoId());
		soapModel.setMaLoaiHinhHoatDong(model.getMaLoaiHinhHoatDong());
		soapModel.setLoaiHinhKinhDoanhCuThe(model.getLoaiHinhKinhDoanhCuThe());
		soapModel.setSoLuongPhuongTien(model.getSoLuongPhuongTien());
		soapModel.setThietBiGiamSatHanhTrinh(model.getThietBiGiamSatHanhTrinh());
		soapModel.setPhamViHoatDong(model.getPhamViHoatDong());
		soapModel.setTuyenTu(model.getTuyenTu());
		soapModel.setTuyenDen(model.getTuyenDen());
		soapModel.setSoChuyen(model.getSoChuyen());
		soapModel.setMauSon(model.getMauSon());
		soapModel.setKetQuaXuLy(model.getKetQuaXuLy());

		return soapModel;
	}

	public static QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiSoap[] toSoapModels(
		QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai[] models) {
		QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiSoap[] soapModels = new QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiSoap[][] toSoapModels(
		QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai[][] models) {
		QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiSoap[] toSoapModels(
		List<QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai> models) {
		List<QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiSoap> soapModels = new ArrayList<QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiSoap>(models.size());

		for (QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiSoap[soapModels.size()]);
	}

	public QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiSoap() {
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

	public int getGpkdvtBangOtoId() {
		return _gpkdvtBangOtoId;
	}

	public void setGpkdvtBangOtoId(int gpkdvtBangOtoId) {
		_gpkdvtBangOtoId = gpkdvtBangOtoId;
	}

	public String getMaLoaiHinhHoatDong() {
		return _maLoaiHinhHoatDong;
	}

	public void setMaLoaiHinhHoatDong(String maLoaiHinhHoatDong) {
		_maLoaiHinhHoatDong = maLoaiHinhHoatDong;
	}

	public String getLoaiHinhKinhDoanhCuThe() {
		return _loaiHinhKinhDoanhCuThe;
	}

	public void setLoaiHinhKinhDoanhCuThe(String loaiHinhKinhDoanhCuThe) {
		_loaiHinhKinhDoanhCuThe = loaiHinhKinhDoanhCuThe;
	}

	public int getSoLuongPhuongTien() {
		return _soLuongPhuongTien;
	}

	public void setSoLuongPhuongTien(int soLuongPhuongTien) {
		_soLuongPhuongTien = soLuongPhuongTien;
	}

	public long getThietBiGiamSatHanhTrinh() {
		return _thietBiGiamSatHanhTrinh;
	}

	public void setThietBiGiamSatHanhTrinh(long thietBiGiamSatHanhTrinh) {
		_thietBiGiamSatHanhTrinh = thietBiGiamSatHanhTrinh;
	}

	public String getPhamViHoatDong() {
		return _phamViHoatDong;
	}

	public void setPhamViHoatDong(String phamViHoatDong) {
		_phamViHoatDong = phamViHoatDong;
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

	public int getSoChuyen() {
		return _soChuyen;
	}

	public void setSoChuyen(int soChuyen) {
		_soChuyen = soChuyen;
	}

	public String getMauSon() {
		return _mauSon;
	}

	public void setMauSon(String mauSon) {
		_mauSon = mauSon;
	}

	public String getKetQuaXuLy() {
		return _ketQuaXuLy;
	}

	public void setKetQuaXuLy(String ketQuaXuLy) {
		_ketQuaXuLy = ketQuaXuLy;
	}

	private long _id;
	private int _gpkdvtBangOtoId;
	private String _maLoaiHinhHoatDong;
	private String _loaiHinhKinhDoanhCuThe;
	private int _soLuongPhuongTien;
	private long _thietBiGiamSatHanhTrinh;
	private String _phamViHoatDong;
	private String _tuyenTu;
	private String _tuyenDen;
	private int _soChuyen;
	private String _mauSon;
	private String _ketQuaXuLy;
}