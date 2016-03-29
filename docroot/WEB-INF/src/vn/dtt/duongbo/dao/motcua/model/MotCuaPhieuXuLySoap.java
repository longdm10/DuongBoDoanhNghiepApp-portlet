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

package vn.dtt.duongbo.dao.motcua.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.motcua.service.http.MotCuaPhieuXuLyServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.duongbo.dao.motcua.service.http.MotCuaPhieuXuLyServiceSoap
 * @generated
 */
public class MotCuaPhieuXuLySoap implements Serializable {
	public static MotCuaPhieuXuLySoap toSoapModel(MotCuaPhieuXuLy model) {
		MotCuaPhieuXuLySoap soapModel = new MotCuaPhieuXuLySoap();

		soapModel.setId(model.getId());
		soapModel.setHoSoThuTucId(model.getHoSoThuTucId());
		soapModel.setQuyTrinhThuTucId(model.getQuyTrinhThuTucId());
		soapModel.setSoThuTu(model.getSoThuTu());
		soapModel.setTrichYeuNoiDung(model.getTrichYeuNoiDung());
		soapModel.setGhiChu(model.getGhiChu());
		soapModel.setPhieuXuLyCha(model.getPhieuXuLyCha());
		soapModel.setTrangThaiHienTaiId(model.getTrangThaiHienTaiId());
		soapModel.setPhanNhomHoSoId(model.getPhanNhomHoSoId());
		soapModel.setChiemQuyenXuLy(model.getChiemQuyenXuLy());
		soapModel.setTrangThaiKetThuc(model.getTrangThaiKetThuc());
		soapModel.setToChucQuanLy(model.getToChucQuanLy());
		soapModel.setFileTaiLieu(model.getFileTaiLieu());
		soapModel.setNguoiXuLy(model.getNguoiXuLy());
		soapModel.setNguoiDuocUyQuyen(model.getNguoiDuocUyQuyen());

		return soapModel;
	}

	public static MotCuaPhieuXuLySoap[] toSoapModels(MotCuaPhieuXuLy[] models) {
		MotCuaPhieuXuLySoap[] soapModels = new MotCuaPhieuXuLySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MotCuaPhieuXuLySoap[][] toSoapModels(
		MotCuaPhieuXuLy[][] models) {
		MotCuaPhieuXuLySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MotCuaPhieuXuLySoap[models.length][models[0].length];
		}
		else {
			soapModels = new MotCuaPhieuXuLySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MotCuaPhieuXuLySoap[] toSoapModels(
		List<MotCuaPhieuXuLy> models) {
		List<MotCuaPhieuXuLySoap> soapModels = new ArrayList<MotCuaPhieuXuLySoap>(models.size());

		for (MotCuaPhieuXuLy model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MotCuaPhieuXuLySoap[soapModels.size()]);
	}

	public MotCuaPhieuXuLySoap() {
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

	public long getHoSoThuTucId() {
		return _hoSoThuTucId;
	}

	public void setHoSoThuTucId(long hoSoThuTucId) {
		_hoSoThuTucId = hoSoThuTucId;
	}

	public long getQuyTrinhThuTucId() {
		return _quyTrinhThuTucId;
	}

	public void setQuyTrinhThuTucId(long quyTrinhThuTucId) {
		_quyTrinhThuTucId = quyTrinhThuTucId;
	}

	public int getSoThuTu() {
		return _soThuTu;
	}

	public void setSoThuTu(int soThuTu) {
		_soThuTu = soThuTu;
	}

	public String getTrichYeuNoiDung() {
		return _trichYeuNoiDung;
	}

	public void setTrichYeuNoiDung(String trichYeuNoiDung) {
		_trichYeuNoiDung = trichYeuNoiDung;
	}

	public String getGhiChu() {
		return _ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		_ghiChu = ghiChu;
	}

	public long getPhieuXuLyCha() {
		return _phieuXuLyCha;
	}

	public void setPhieuXuLyCha(long phieuXuLyCha) {
		_phieuXuLyCha = phieuXuLyCha;
	}

	public long getTrangThaiHienTaiId() {
		return _trangThaiHienTaiId;
	}

	public void setTrangThaiHienTaiId(long trangThaiHienTaiId) {
		_trangThaiHienTaiId = trangThaiHienTaiId;
	}

	public long getPhanNhomHoSoId() {
		return _phanNhomHoSoId;
	}

	public void setPhanNhomHoSoId(long phanNhomHoSoId) {
		_phanNhomHoSoId = phanNhomHoSoId;
	}

	public long getChiemQuyenXuLy() {
		return _chiemQuyenXuLy;
	}

	public void setChiemQuyenXuLy(long chiemQuyenXuLy) {
		_chiemQuyenXuLy = chiemQuyenXuLy;
	}

	public long getTrangThaiKetThuc() {
		return _trangThaiKetThuc;
	}

	public void setTrangThaiKetThuc(long trangThaiKetThuc) {
		_trangThaiKetThuc = trangThaiKetThuc;
	}

	public long getToChucQuanLy() {
		return _toChucQuanLy;
	}

	public void setToChucQuanLy(long toChucQuanLy) {
		_toChucQuanLy = toChucQuanLy;
	}

	public long getFileTaiLieu() {
		return _fileTaiLieu;
	}

	public void setFileTaiLieu(long fileTaiLieu) {
		_fileTaiLieu = fileTaiLieu;
	}

	public long getNguoiXuLy() {
		return _nguoiXuLy;
	}

	public void setNguoiXuLy(long nguoiXuLy) {
		_nguoiXuLy = nguoiXuLy;
	}

	public long getNguoiDuocUyQuyen() {
		return _nguoiDuocUyQuyen;
	}

	public void setNguoiDuocUyQuyen(long nguoiDuocUyQuyen) {
		_nguoiDuocUyQuyen = nguoiDuocUyQuyen;
	}

	private long _id;
	private long _hoSoThuTucId;
	private long _quyTrinhThuTucId;
	private int _soThuTu;
	private String _trichYeuNoiDung;
	private String _ghiChu;
	private long _phieuXuLyCha;
	private long _trangThaiHienTaiId;
	private long _phanNhomHoSoId;
	private long _chiemQuyenXuLy;
	private long _trangThaiKetThuc;
	private long _toChucQuanLy;
	private long _fileTaiLieu;
	private long _nguoiXuLy;
	private long _nguoiDuocUyQuyen;
}