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
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.quocte.service.http.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiServiceSoap}.
 *
 * @author NoiPham
 * @see vn.dtt.duongbo.dao.quocte.service.http.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiServiceSoap
 * @generated
 */
public class QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiSoap implements Serializable {
	public static QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiSoap toSoapModel(
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai model) {
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiSoap soapModel = new QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiSoap();

		soapModel.setId(model.getId());
		soapModel.setThongTinCapGpkdVanTaiId(model.getThongTinCapGpkdVanTaiId());
		soapModel.setMaLoaiHinhHoatDong(model.getMaLoaiHinhHoatDong());
		soapModel.setSoLuongPhuongTien(model.getSoLuongPhuongTien());
		soapModel.setThietBiGiamSatHanhTrinh(model.getThietBiGiamSatHanhTrinh());
		soapModel.setPhamViHoatDong(model.getPhamViHoatDong());
		soapModel.setSoChuyen(model.getSoChuyen());
		soapModel.setMauSon(model.getMauSon());
		soapModel.setKetQuaXuLy(model.getKetQuaXuLy());
		soapModel.setLyDoKhongDat(model.getLyDoKhongDat());

		return soapModel;
	}

	public static QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiSoap[] toSoapModels(
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai[] models) {
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiSoap[] soapModels = new QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiSoap[][] toSoapModels(
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai[][] models) {
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiSoap[] toSoapModels(
		List<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai> models) {
		List<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiSoap> soapModels = new ArrayList<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiSoap>(models.size());

		for (QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiSoap[soapModels.size()]);
	}

	public QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiSoap() {
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

	public int getThongTinCapGpkdVanTaiId() {
		return _thongTinCapGpkdVanTaiId;
	}

	public void setThongTinCapGpkdVanTaiId(int thongTinCapGpkdVanTaiId) {
		_thongTinCapGpkdVanTaiId = thongTinCapGpkdVanTaiId;
	}

	public String getMaLoaiHinhHoatDong() {
		return _maLoaiHinhHoatDong;
	}

	public void setMaLoaiHinhHoatDong(String maLoaiHinhHoatDong) {
		_maLoaiHinhHoatDong = maLoaiHinhHoatDong;
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

	public String getLyDoKhongDat() {
		return _lyDoKhongDat;
	}

	public void setLyDoKhongDat(String lyDoKhongDat) {
		_lyDoKhongDat = lyDoKhongDat;
	}

	private long _id;
	private int _thongTinCapGpkdVanTaiId;
	private String _maLoaiHinhHoatDong;
	private int _soLuongPhuongTien;
	private long _thietBiGiamSatHanhTrinh;
	private String _phamViHoatDong;
	private int _soChuyen;
	private String _mauSon;
	private String _ketQuaXuLy;
	private String _lyDoKhongDat;
}