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

package vn.dtt.duongbo.dao.capbienhieuphuhieu.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author binhta
 * @generated
 */
public class QLVTPhuongTienVanTaiSoap implements Serializable {
	public static QLVTPhuongTienVanTaiSoap toSoapModel(
		QLVTPhuongTienVanTai model) {
		QLVTPhuongTienVanTaiSoap soapModel = new QLVTPhuongTienVanTaiSoap();

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

	public static QLVTPhuongTienVanTaiSoap[] toSoapModels(
		QLVTPhuongTienVanTai[] models) {
		QLVTPhuongTienVanTaiSoap[] soapModels = new QLVTPhuongTienVanTaiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QLVTPhuongTienVanTaiSoap[][] toSoapModels(
		QLVTPhuongTienVanTai[][] models) {
		QLVTPhuongTienVanTaiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QLVTPhuongTienVanTaiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QLVTPhuongTienVanTaiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QLVTPhuongTienVanTaiSoap[] toSoapModels(
		List<QLVTPhuongTienVanTai> models) {
		List<QLVTPhuongTienVanTaiSoap> soapModels = new ArrayList<QLVTPhuongTienVanTaiSoap>(models.size());

		for (QLVTPhuongTienVanTai model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QLVTPhuongTienVanTaiSoap[soapModels.size()]);
	}

	public QLVTPhuongTienVanTaiSoap() {
	}

	public int getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(int pk) {
		setId(pk);
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

	public int getBienSoXe() {
		return _bienSoXe;
	}

	public void setBienSoXe(int bienSoXe) {
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

	public int getFileId() {
		return _fileId;
	}

	public void setFileId(int fileId) {
		_fileId = fileId;
	}

	private int _id;
	private int _bienSoXe;
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
	private int _fileId;
}