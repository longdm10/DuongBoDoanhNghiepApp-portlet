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
public class QLVTXuLyPhuHieuPhuongTienSoap implements Serializable {
	public static QLVTXuLyPhuHieuPhuongTienSoap toSoapModel(
		QLVTXuLyPhuHieuPhuongTien model) {
		QLVTXuLyPhuHieuPhuongTienSoap soapModel = new QLVTXuLyPhuHieuPhuongTienSoap();

		soapModel.setId(model.getId());
		soapModel.setCapPhuHieuID(model.getCapPhuHieuID());
		soapModel.setNhanHieu(model.getNhanHieu());
		soapModel.setBienSo(model.getBienSo());
		soapModel.setTrongTai(model.getTrongTai());
		soapModel.setSoChoNgoi(model.getSoChoNgoi());
		soapModel.setNoiSanXuat(model.getNoiSanXuat());
		soapModel.setNamSanXuat(model.getNamSanXuat());
		soapModel.setMaTuyenCoDinh(model.getMaTuyenCoDinh());
		soapModel.setLoaiTuyen(model.getLoaiTuyen());
		soapModel.setHinhThucSoHuuXe(model.getHinhThucSoHuuXe());
		soapModel.setLinhVucKinhDoanhXeDuLich(model.getLinhVucKinhDoanhXeDuLich());
		soapModel.setNienHanSuDungGiayDangKiem(model.getNienHanSuDungGiayDangKiem());
		soapModel.setNienHanSuDungND86(model.getNienHanSuDungND86());
		soapModel.setDoanhNghiepSoHuuThue(model.getDoanhNghiepSoHuuThue());
		soapModel.setThoiHanThue(model.getThoiHanThue());
		soapModel.setHopDongSauCung(model.getHopDongSauCung());
		soapModel.setKetQuaXuLy(model.getKetQuaXuLy());
		soapModel.setSoPhuHieuDuocCap(model.getSoPhuHieuDuocCap());
		soapModel.setThoiHanDuocCapPhep(model.getThoiHanDuocCapPhep());
		soapModel.setLoaiPhuHieuXinCap(model.getLoaiPhuHieuXinCap());
		soapModel.setLyDoKhongDat(model.getLyDoKhongDat());
		soapModel.setCoGiaTriDen(model.getCoGiaTriDen());

		return soapModel;
	}

	public static QLVTXuLyPhuHieuPhuongTienSoap[] toSoapModels(
		QLVTXuLyPhuHieuPhuongTien[] models) {
		QLVTXuLyPhuHieuPhuongTienSoap[] soapModels = new QLVTXuLyPhuHieuPhuongTienSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QLVTXuLyPhuHieuPhuongTienSoap[][] toSoapModels(
		QLVTXuLyPhuHieuPhuongTien[][] models) {
		QLVTXuLyPhuHieuPhuongTienSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QLVTXuLyPhuHieuPhuongTienSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QLVTXuLyPhuHieuPhuongTienSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QLVTXuLyPhuHieuPhuongTienSoap[] toSoapModels(
		List<QLVTXuLyPhuHieuPhuongTien> models) {
		List<QLVTXuLyPhuHieuPhuongTienSoap> soapModels = new ArrayList<QLVTXuLyPhuHieuPhuongTienSoap>(models.size());

		for (QLVTXuLyPhuHieuPhuongTien model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QLVTXuLyPhuHieuPhuongTienSoap[soapModels.size()]);
	}

	public QLVTXuLyPhuHieuPhuongTienSoap() {
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

	public int getCapPhuHieuID() {
		return _capPhuHieuID;
	}

	public void setCapPhuHieuID(int capPhuHieuID) {
		_capPhuHieuID = capPhuHieuID;
	}

	public String getNhanHieu() {
		return _nhanHieu;
	}

	public void setNhanHieu(String nhanHieu) {
		_nhanHieu = nhanHieu;
	}

	public String getBienSo() {
		return _bienSo;
	}

	public void setBienSo(String bienSo) {
		_bienSo = bienSo;
	}

	public int getTrongTai() {
		return _trongTai;
	}

	public void setTrongTai(int trongTai) {
		_trongTai = trongTai;
	}

	public int getSoChoNgoi() {
		return _soChoNgoi;
	}

	public void setSoChoNgoi(int soChoNgoi) {
		_soChoNgoi = soChoNgoi;
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

	public String getLoaiTuyen() {
		return _loaiTuyen;
	}

	public void setLoaiTuyen(String loaiTuyen) {
		_loaiTuyen = loaiTuyen;
	}

	public String getHinhThucSoHuuXe() {
		return _hinhThucSoHuuXe;
	}

	public void setHinhThucSoHuuXe(String hinhThucSoHuuXe) {
		_hinhThucSoHuuXe = hinhThucSoHuuXe;
	}

	public String getLinhVucKinhDoanhXeDuLich() {
		return _linhVucKinhDoanhXeDuLich;
	}

	public void setLinhVucKinhDoanhXeDuLich(String linhVucKinhDoanhXeDuLich) {
		_linhVucKinhDoanhXeDuLich = linhVucKinhDoanhXeDuLich;
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

	public String getDoanhNghiepSoHuuThue() {
		return _doanhNghiepSoHuuThue;
	}

	public void setDoanhNghiepSoHuuThue(String doanhNghiepSoHuuThue) {
		_doanhNghiepSoHuuThue = doanhNghiepSoHuuThue;
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

	public String getKetQuaXuLy() {
		return _ketQuaXuLy;
	}

	public void setKetQuaXuLy(String ketQuaXuLy) {
		_ketQuaXuLy = ketQuaXuLy;
	}

	public String getSoPhuHieuDuocCap() {
		return _soPhuHieuDuocCap;
	}

	public void setSoPhuHieuDuocCap(String soPhuHieuDuocCap) {
		_soPhuHieuDuocCap = soPhuHieuDuocCap;
	}

	public Date getThoiHanDuocCapPhep() {
		return _thoiHanDuocCapPhep;
	}

	public void setThoiHanDuocCapPhep(Date thoiHanDuocCapPhep) {
		_thoiHanDuocCapPhep = thoiHanDuocCapPhep;
	}

	public String getLoaiPhuHieuXinCap() {
		return _loaiPhuHieuXinCap;
	}

	public void setLoaiPhuHieuXinCap(String loaiPhuHieuXinCap) {
		_loaiPhuHieuXinCap = loaiPhuHieuXinCap;
	}

	public String getLyDoKhongDat() {
		return _lyDoKhongDat;
	}

	public void setLyDoKhongDat(String lyDoKhongDat) {
		_lyDoKhongDat = lyDoKhongDat;
	}

	public Date getCoGiaTriDen() {
		return _coGiaTriDen;
	}

	public void setCoGiaTriDen(Date coGiaTriDen) {
		_coGiaTriDen = coGiaTriDen;
	}

	private int _id;
	private int _capPhuHieuID;
	private String _nhanHieu;
	private String _bienSo;
	private int _trongTai;
	private int _soChoNgoi;
	private String _noiSanXuat;
	private int _namSanXuat;
	private String _maTuyenCoDinh;
	private String _loaiTuyen;
	private String _hinhThucSoHuuXe;
	private String _linhVucKinhDoanhXeDuLich;
	private int _nienHanSuDungGiayDangKiem;
	private int _nienHanSuDungND86;
	private String _doanhNghiepSoHuuThue;
	private Date _thoiHanThue;
	private int _hopDongSauCung;
	private String _ketQuaXuLy;
	private String _soPhuHieuDuocCap;
	private Date _thoiHanDuocCapPhep;
	private String _loaiPhuHieuXinCap;
	private String _lyDoKhongDat;
	private Date _coGiaTriDen;
}