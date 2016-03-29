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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author binhta
 * @generated
 */
public class QLVTCapPhepPhuHieuSoap implements Serializable {
	public static QLVTCapPhepPhuHieuSoap toSoapModel(QLVTCapPhepPhuHieu model) {
		QLVTCapPhepPhuHieuSoap soapModel = new QLVTCapPhepPhuHieuSoap();

		soapModel.setId(model.getId());
		soapModel.setThongTinHoSoId(model.getThongTinHoSoId());
		soapModel.setLoaiHinhKinhDoanhId(model.getLoaiHinhKinhDoanhId());
		soapModel.setSoPhuHieu(model.getSoPhuHieu());
		soapModel.setCoQuanCapLanDauId(model.getCoQuanCapLanDauId());
		soapModel.setCoQuanCapPhepId(model.getCoQuanCapPhepId());
		soapModel.setNgayCapPhuHieu(model.getNgayCapPhuHieu());
		soapModel.setThoiHanPhuHieu(model.getThoiHanPhuHieu());
		soapModel.setNoiSanXuat(model.getNoiSanXuat());
		soapModel.setNamSanXuat(model.getNamSanXuat());
		soapModel.setMaTuyenCoDinh(model.getMaTuyenCoDinh());
		soapModel.setLoaiPhuHieu(model.getLoaiPhuHieu());
		soapModel.setLanGiaHan(model.getLanGiaHan());
		soapModel.setNgayCapLanDau(model.getNgayCapLanDau());
		soapModel.setGhiChu(model.getGhiChu());
		soapModel.setTrangThai(model.getTrangThai());
		soapModel.setFileId(model.getFileId());

		return soapModel;
	}

	public static QLVTCapPhepPhuHieuSoap[] toSoapModels(
		QLVTCapPhepPhuHieu[] models) {
		QLVTCapPhepPhuHieuSoap[] soapModels = new QLVTCapPhepPhuHieuSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QLVTCapPhepPhuHieuSoap[][] toSoapModels(
		QLVTCapPhepPhuHieu[][] models) {
		QLVTCapPhepPhuHieuSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QLVTCapPhepPhuHieuSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QLVTCapPhepPhuHieuSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QLVTCapPhepPhuHieuSoap[] toSoapModels(
		List<QLVTCapPhepPhuHieu> models) {
		List<QLVTCapPhepPhuHieuSoap> soapModels = new ArrayList<QLVTCapPhepPhuHieuSoap>(models.size());

		for (QLVTCapPhepPhuHieu model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QLVTCapPhepPhuHieuSoap[soapModels.size()]);
	}

	public QLVTCapPhepPhuHieuSoap() {
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

	public int getThongTinHoSoId() {
		return _thongTinHoSoId;
	}

	public void setThongTinHoSoId(int thongTinHoSoId) {
		_thongTinHoSoId = thongTinHoSoId;
	}

	public int getLoaiHinhKinhDoanhId() {
		return _loaiHinhKinhDoanhId;
	}

	public void setLoaiHinhKinhDoanhId(int loaiHinhKinhDoanhId) {
		_loaiHinhKinhDoanhId = loaiHinhKinhDoanhId;
	}

	public int getSoPhuHieu() {
		return _soPhuHieu;
	}

	public void setSoPhuHieu(int soPhuHieu) {
		_soPhuHieu = soPhuHieu;
	}

	public int getCoQuanCapLanDauId() {
		return _coQuanCapLanDauId;
	}

	public void setCoQuanCapLanDauId(int coQuanCapLanDauId) {
		_coQuanCapLanDauId = coQuanCapLanDauId;
	}

	public int getCoQuanCapPhepId() {
		return _CoQuanCapPhepId;
	}

	public void setCoQuanCapPhepId(int CoQuanCapPhepId) {
		_CoQuanCapPhepId = CoQuanCapPhepId;
	}

	public Date getNgayCapPhuHieu() {
		return _ngayCapPhuHieu;
	}

	public void setNgayCapPhuHieu(Date ngayCapPhuHieu) {
		_ngayCapPhuHieu = ngayCapPhuHieu;
	}

	public Date getThoiHanPhuHieu() {
		return _thoiHanPhuHieu;
	}

	public void setThoiHanPhuHieu(Date thoiHanPhuHieu) {
		_thoiHanPhuHieu = thoiHanPhuHieu;
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

	public String getMaTuyenCoDinh() {
		return _maTuyenCoDinh;
	}

	public void setMaTuyenCoDinh(String maTuyenCoDinh) {
		_maTuyenCoDinh = maTuyenCoDinh;
	}

	public String getLoaiPhuHieu() {
		return _loaiPhuHieu;
	}

	public void setLoaiPhuHieu(String loaiPhuHieu) {
		_loaiPhuHieu = loaiPhuHieu;
	}

	public int getLanGiaHan() {
		return _lanGiaHan;
	}

	public void setLanGiaHan(int lanGiaHan) {
		_lanGiaHan = lanGiaHan;
	}

	public Date getNgayCapLanDau() {
		return _ngayCapLanDau;
	}

	public void setNgayCapLanDau(Date ngayCapLanDau) {
		_ngayCapLanDau = ngayCapLanDau;
	}

	public String getGhiChu() {
		return _ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		_ghiChu = ghiChu;
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
	private int _thongTinHoSoId;
	private int _loaiHinhKinhDoanhId;
	private int _soPhuHieu;
	private int _coQuanCapLanDauId;
	private int _CoQuanCapPhepId;
	private Date _ngayCapPhuHieu;
	private Date _thoiHanPhuHieu;
	private String _noiSanXuat;
	private int _namSanXuat;
	private String _maTuyenCoDinh;
	private String _loaiPhuHieu;
	private int _lanGiaHan;
	private Date _ngayCapLanDau;
	private String _ghiChu;
	private String _trangThai;
	private int _fileId;
}