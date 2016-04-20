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

package vn.dtt.duongbo.dao.thanhtoan.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author win_64
 * @generated
 */
public class TthcXacNhanThanhToanSoap implements Serializable {
	public static TthcXacNhanThanhToanSoap toSoapModel(
		TthcXacNhanThanhToan model) {
		TthcXacNhanThanhToanSoap soapModel = new TthcXacNhanThanhToanSoap();

		soapModel.setId(model.getId());
		soapModel.setMaTuSinh(model.getMaTuSinh());
		soapModel.setSoTien(model.getSoTien());
		soapModel.setHinhThucThanhToan(model.getHinhThucThanhToan());
		soapModel.setThongTinXacNhan(model.getThongTinXacNhan());
		soapModel.setTaiLieuDinhKem(model.getTaiLieuDinhKem());
		soapModel.setNgayTao(model.getNgayTao());
		soapModel.setNguoiTao(model.getNguoiTao());
		soapModel.setNgayXacNhan(model.getNgayXacNhan());
		soapModel.setNguoiXacNhan(model.getNguoiXacNhan());
		soapModel.setToChucQuanLy(model.getToChucQuanLy());
		soapModel.setTrangThaiXacNhan(model.getTrangThaiXacNhan());
		soapModel.setYKienXuLy(model.getYKienXuLy());
		soapModel.setLoaiPhi(model.getLoaiPhi());
		soapModel.setTenDoanhNghiep(model.getTenDoanhNghiep());
		soapModel.setGhiChu(model.getGhiChu());

		return soapModel;
	}

	public static TthcXacNhanThanhToanSoap[] toSoapModels(
		TthcXacNhanThanhToan[] models) {
		TthcXacNhanThanhToanSoap[] soapModels = new TthcXacNhanThanhToanSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TthcXacNhanThanhToanSoap[][] toSoapModels(
		TthcXacNhanThanhToan[][] models) {
		TthcXacNhanThanhToanSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TthcXacNhanThanhToanSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TthcXacNhanThanhToanSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TthcXacNhanThanhToanSoap[] toSoapModels(
		List<TthcXacNhanThanhToan> models) {
		List<TthcXacNhanThanhToanSoap> soapModels = new ArrayList<TthcXacNhanThanhToanSoap>(models.size());

		for (TthcXacNhanThanhToan model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TthcXacNhanThanhToanSoap[soapModels.size()]);
	}

	public TthcXacNhanThanhToanSoap() {
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

	public String getMaTuSinh() {
		return _maTuSinh;
	}

	public void setMaTuSinh(String maTuSinh) {
		_maTuSinh = maTuSinh;
	}

	public long getSoTien() {
		return _soTien;
	}

	public void setSoTien(long soTien) {
		_soTien = soTien;
	}

	public long getHinhThucThanhToan() {
		return _hinhThucThanhToan;
	}

	public void setHinhThucThanhToan(long hinhThucThanhToan) {
		_hinhThucThanhToan = hinhThucThanhToan;
	}

	public String getThongTinXacNhan() {
		return _thongTinXacNhan;
	}

	public void setThongTinXacNhan(String thongTinXacNhan) {
		_thongTinXacNhan = thongTinXacNhan;
	}

	public long getTaiLieuDinhKem() {
		return _taiLieuDinhKem;
	}

	public void setTaiLieuDinhKem(long taiLieuDinhKem) {
		_taiLieuDinhKem = taiLieuDinhKem;
	}

	public Date getNgayTao() {
		return _ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		_ngayTao = ngayTao;
	}

	public long getNguoiTao() {
		return _nguoiTao;
	}

	public void setNguoiTao(long nguoiTao) {
		_nguoiTao = nguoiTao;
	}

	public Date getNgayXacNhan() {
		return _ngayXacNhan;
	}

	public void setNgayXacNhan(Date ngayXacNhan) {
		_ngayXacNhan = ngayXacNhan;
	}

	public long getNguoiXacNhan() {
		return _nguoiXacNhan;
	}

	public void setNguoiXacNhan(long nguoiXacNhan) {
		_nguoiXacNhan = nguoiXacNhan;
	}

	public long getToChucQuanLy() {
		return _toChucQuanLy;
	}

	public void setToChucQuanLy(long toChucQuanLy) {
		_toChucQuanLy = toChucQuanLy;
	}

	public int getTrangThaiXacNhan() {
		return _trangThaiXacNhan;
	}

	public void setTrangThaiXacNhan(int trangThaiXacNhan) {
		_trangThaiXacNhan = trangThaiXacNhan;
	}

	public String getYKienXuLy() {
		return _yKienXuLy;
	}

	public void setYKienXuLy(String yKienXuLy) {
		_yKienXuLy = yKienXuLy;
	}

	public String getLoaiPhi() {
		return _loaiPhi;
	}

	public void setLoaiPhi(String loaiPhi) {
		_loaiPhi = loaiPhi;
	}

	public String getTenDoanhNghiep() {
		return _tenDoanhNghiep;
	}

	public void setTenDoanhNghiep(String tenDoanhNghiep) {
		_tenDoanhNghiep = tenDoanhNghiep;
	}

	public String getGhiChu() {
		return _ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		_ghiChu = ghiChu;
	}

	private long _id;
	private String _maTuSinh;
	private long _soTien;
	private long _hinhThucThanhToan;
	private String _thongTinXacNhan;
	private long _taiLieuDinhKem;
	private Date _ngayTao;
	private long _nguoiTao;
	private Date _ngayXacNhan;
	private long _nguoiXacNhan;
	private long _toChucQuanLy;
	private int _trangThaiXacNhan;
	private String _yKienXuLy;
	private String _loaiPhi;
	private String _tenDoanhNghiep;
	private String _ghiChu;
}