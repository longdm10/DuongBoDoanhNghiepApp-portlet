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
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.lienvan.service.http.QlvtCapPhepPhuongTienVanTaiServiceSoap}.
 *
 * @author NhanNc
 * @see vn.dtt.duongbo.dao.lienvan.service.http.QlvtCapPhepPhuongTienVanTaiServiceSoap
 * @generated
 */
public class QlvtCapPhepPhuongTienVanTaiSoap implements Serializable {
	public static QlvtCapPhepPhuongTienVanTaiSoap toSoapModel(
		QlvtCapPhepPhuongTienVanTai model) {
		QlvtCapPhepPhuongTienVanTaiSoap soapModel = new QlvtCapPhepPhuongTienVanTaiSoap();

		soapModel.setId(model.getId());
		soapModel.setBienSoXe(model.getBienSoXe());
		soapModel.setNhanHieu(model.getNhanHieu());
		soapModel.setTrongTai(model.getTrongTai());
		soapModel.setNoiSanXuat(model.getNoiSanXuat());
		soapModel.setNamSanXuat(model.getNamSanXuat());
		soapModel.setSoChoNgoi(model.getSoChoNgoi());
		soapModel.setHinhThucSoHuuXe(model.getHinhThucSoHuuXe());
		soapModel.setNienHanSuDungGiayDangKiem(model.getNienHanSuDungGiayDangKiem());
		soapModel.setNienHanSuDungND86(model.getNienHanSuDungND86());
		soapModel.setSoKhung(model.getSoKhung());
		soapModel.setSoMay(model.getSoMay());
		soapModel.setMauSon(model.getMauSon());
		soapModel.setThongTinXuLyViPham(model.getThongTinXuLyViPham());
		soapModel.setTrangThai(model.getTrangThai());
		soapModel.setFileId(model.getFileId());

		return soapModel;
	}

	public static QlvtCapPhepPhuongTienVanTaiSoap[] toSoapModels(
		QlvtCapPhepPhuongTienVanTai[] models) {
		QlvtCapPhepPhuongTienVanTaiSoap[] soapModels = new QlvtCapPhepPhuongTienVanTaiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QlvtCapPhepPhuongTienVanTaiSoap[][] toSoapModels(
		QlvtCapPhepPhuongTienVanTai[][] models) {
		QlvtCapPhepPhuongTienVanTaiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QlvtCapPhepPhuongTienVanTaiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QlvtCapPhepPhuongTienVanTaiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QlvtCapPhepPhuongTienVanTaiSoap[] toSoapModels(
		List<QlvtCapPhepPhuongTienVanTai> models) {
		List<QlvtCapPhepPhuongTienVanTaiSoap> soapModels = new ArrayList<QlvtCapPhepPhuongTienVanTaiSoap>(models.size());

		for (QlvtCapPhepPhuongTienVanTai model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QlvtCapPhepPhuongTienVanTaiSoap[soapModels.size()]);
	}

	public QlvtCapPhepPhuongTienVanTaiSoap() {
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

	public String getBienSoXe() {
		return _bienSoXe;
	}

	public void setBienSoXe(String bienSoXe) {
		_bienSoXe = bienSoXe;
	}

	public String getNhanHieu() {
		return _nhanHieu;
	}

	public void setNhanHieu(String nhanHieu) {
		_nhanHieu = nhanHieu;
	}

	public int getTrongTai() {
		return _trongTai;
	}

	public void setTrongTai(int trongTai) {
		_trongTai = trongTai;
	}

	public String getNoiSanXuat() {
		return _noiSanXuat;
	}

	public void setNoiSanXuat(String noiSanXuat) {
		_noiSanXuat = noiSanXuat;
	}

	public int getNamSanXuat() {
		return _namSanXuat;
	}

	public void setNamSanXuat(int namSanXuat) {
		_namSanXuat = namSanXuat;
	}

	public int getSoChoNgoi() {
		return _soChoNgoi;
	}

	public void setSoChoNgoi(int soChoNgoi) {
		_soChoNgoi = soChoNgoi;
	}

	public String getHinhThucSoHuuXe() {
		return _hinhThucSoHuuXe;
	}

	public void setHinhThucSoHuuXe(String hinhThucSoHuuXe) {
		_hinhThucSoHuuXe = hinhThucSoHuuXe;
	}

	public int getNienHanSuDungGiayDangKiem() {
		return _nienHanSuDungGiayDangKiem;
	}

	public void setNienHanSuDungGiayDangKiem(int nienHanSuDungGiayDangKiem) {
		_nienHanSuDungGiayDangKiem = nienHanSuDungGiayDangKiem;
	}

	public int getNienHanSuDungND86() {
		return _nienHanSuDungND86;
	}

	public void setNienHanSuDungND86(int nienHanSuDungND86) {
		_nienHanSuDungND86 = nienHanSuDungND86;
	}

	public String getSoKhung() {
		return _soKhung;
	}

	public void setSoKhung(String soKhung) {
		_soKhung = soKhung;
	}

	public String getSoMay() {
		return _soMay;
	}

	public void setSoMay(String soMay) {
		_soMay = soMay;
	}

	public String getMauSon() {
		return _mauSon;
	}

	public void setMauSon(String mauSon) {
		_mauSon = mauSon;
	}

	public String getThongTinXuLyViPham() {
		return _thongTinXuLyViPham;
	}

	public void setThongTinXuLyViPham(String thongTinXuLyViPham) {
		_thongTinXuLyViPham = thongTinXuLyViPham;
	}

	public String getTrangThai() {
		return _trangThai;
	}

	public void setTrangThai(String trangThai) {
		_trangThai = trangThai;
	}

	public long getFileId() {
		return _fileId;
	}

	public void setFileId(long fileId) {
		_fileId = fileId;
	}

	private long _id;
	private String _bienSoXe;
	private String _nhanHieu;
	private int _trongTai;
	private String _noiSanXuat;
	private int _namSanXuat;
	private int _soChoNgoi;
	private String _hinhThucSoHuuXe;
	private int _nienHanSuDungGiayDangKiem;
	private int _nienHanSuDungND86;
	private String _soKhung;
	private String _soMay;
	private String _mauSon;
	private String _thongTinXuLyViPham;
	private String _trangThai;
	private long _fileId;
}