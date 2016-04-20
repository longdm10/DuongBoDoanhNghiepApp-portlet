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
public class QLVTCapPhepBienHieuSoap implements Serializable {
	public static QLVTCapPhepBienHieuSoap toSoapModel(QLVTCapPhepBienHieu model) {
		QLVTCapPhepBienHieuSoap soapModel = new QLVTCapPhepBienHieuSoap();

		soapModel.setId(model.getId());
		soapModel.setThongTinHoSoId(model.getThongTinHoSoId());
		soapModel.setLoaiHinhKinhDoanhId(model.getLoaiHinhKinhDoanhId());
		soapModel.setSoPhuHieu(model.getSoPhuHieu());
		soapModel.setCoQuanCapLanDauId(model.getCoQuanCapLanDauId());
		soapModel.setCoQuanCapPhepId(model.getCoQuanCapPhepId());
		soapModel.setNgayCapPhuHieu(model.getNgayCapPhuHieu());
		soapModel.setThoiHanPhuHieu(model.getThoiHanPhuHieu());
		soapModel.setMaTuyenCoDinh(model.getMaTuyenCoDinh());
		soapModel.setLinhVucKinhDoanhXeDuLich(model.getLinhVucKinhDoanhXeDuLich());
		soapModel.setDoanhNghiepChoThue(model.getDoanhNghiepChoThue());
		soapModel.setThoiHanThue(model.getThoiHanThue());
		soapModel.setHopDongSauCung(model.getHopDongSauCung());
		soapModel.setNgayCapLanDau(model.getNgayCapLanDau());
		soapModel.setLanGiaHan(model.getLanGiaHan());
		soapModel.setGhiChu(model.getGhiChu());
		soapModel.setTrangThai(model.getTrangThai());
		soapModel.setFileId(model.getFileId());

		return soapModel;
	}

	public static QLVTCapPhepBienHieuSoap[] toSoapModels(
		QLVTCapPhepBienHieu[] models) {
		QLVTCapPhepBienHieuSoap[] soapModels = new QLVTCapPhepBienHieuSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QLVTCapPhepBienHieuSoap[][] toSoapModels(
		QLVTCapPhepBienHieu[][] models) {
		QLVTCapPhepBienHieuSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QLVTCapPhepBienHieuSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QLVTCapPhepBienHieuSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QLVTCapPhepBienHieuSoap[] toSoapModels(
		List<QLVTCapPhepBienHieu> models) {
		List<QLVTCapPhepBienHieuSoap> soapModels = new ArrayList<QLVTCapPhepBienHieuSoap>(models.size());

		for (QLVTCapPhepBienHieu model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QLVTCapPhepBienHieuSoap[soapModels.size()]);
	}

	public QLVTCapPhepBienHieuSoap() {
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

	public String getMaTuyenCoDinh() {
		return _maTuyenCoDinh;
	}

	public void setMaTuyenCoDinh(String maTuyenCoDinh) {
		_maTuyenCoDinh = maTuyenCoDinh;
	}

	public String getLinhVucKinhDoanhXeDuLich() {
		return _linhVucKinhDoanhXeDuLich;
	}

	public void setLinhVucKinhDoanhXeDuLich(String linhVucKinhDoanhXeDuLich) {
		_linhVucKinhDoanhXeDuLich = linhVucKinhDoanhXeDuLich;
	}

	public String getDoanhNghiepChoThue() {
		return _doanhNghiepChoThue;
	}

	public void setDoanhNghiepChoThue(String doanhNghiepChoThue) {
		_doanhNghiepChoThue = doanhNghiepChoThue;
	}

	public Date getThoiHanThue() {
		return _thoiHanThue;
	}

	public void setThoiHanThue(Date thoiHanThue) {
		_thoiHanThue = thoiHanThue;
	}

	public int getHopDongSauCung() {
		return _hopDongSauCung;
	}

	public void setHopDongSauCung(int hopDongSauCung) {
		_hopDongSauCung = hopDongSauCung;
	}

	public Date getNgayCapLanDau() {
		return _ngayCapLanDau;
	}

	public void setNgayCapLanDau(Date ngayCapLanDau) {
		_ngayCapLanDau = ngayCapLanDau;
	}

	public int getLanGiaHan() {
		return _lanGiaHan;
	}

	public void setLanGiaHan(int lanGiaHan) {
		_lanGiaHan = lanGiaHan;
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
	private String _maTuyenCoDinh;
	private String _linhVucKinhDoanhXeDuLich;
	private String _doanhNghiepChoThue;
	private Date _thoiHanThue;
	private int _hopDongSauCung;
	private Date _ngayCapLanDau;
	private int _lanGiaHan;
	private String _ghiChu;
	private String _trangThai;
	private int _fileId;
}