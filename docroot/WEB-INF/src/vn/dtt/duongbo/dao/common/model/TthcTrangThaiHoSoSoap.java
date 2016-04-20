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

package vn.dtt.duongbo.dao.common.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.common.service.http.TthcTrangThaiHoSoServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.duongbo.dao.common.service.http.TthcTrangThaiHoSoServiceSoap
 * @generated
 */
public class TthcTrangThaiHoSoSoap implements Serializable {
	public static TthcTrangThaiHoSoSoap toSoapModel(TthcTrangThaiHoSo model) {
		TthcTrangThaiHoSoSoap soapModel = new TthcTrangThaiHoSoSoap();

		soapModel.setId(model.getId());
		soapModel.setQuyTrinhThuTucId(model.getQuyTrinhThuTucId());
		soapModel.setMaTrangThai(model.getMaTrangThai());
		soapModel.setTenTrangThai(model.getTenTrangThai());
		soapModel.setTenTiengAnh(model.getTenTiengAnh());
		soapModel.setSoThuTu(model.getSoThuTu());
		soapModel.setTrangThaiKetThuc(model.getTrangThaiKetThuc());
		soapModel.setMoTaTrangThai(model.getMoTaTrangThai());
		soapModel.setVaiTroXuLy1(model.getVaiTroXuLy1());
		soapModel.setVaiTroXuLy2(model.getVaiTroXuLy2());
		soapModel.setVaiTroXuLy3(model.getVaiTroXuLy3());
		soapModel.setFormXuLy(model.getFormXuLy());

		return soapModel;
	}

	public static TthcTrangThaiHoSoSoap[] toSoapModels(
		TthcTrangThaiHoSo[] models) {
		TthcTrangThaiHoSoSoap[] soapModels = new TthcTrangThaiHoSoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TthcTrangThaiHoSoSoap[][] toSoapModels(
		TthcTrangThaiHoSo[][] models) {
		TthcTrangThaiHoSoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TthcTrangThaiHoSoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TthcTrangThaiHoSoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TthcTrangThaiHoSoSoap[] toSoapModels(
		List<TthcTrangThaiHoSo> models) {
		List<TthcTrangThaiHoSoSoap> soapModels = new ArrayList<TthcTrangThaiHoSoSoap>(models.size());

		for (TthcTrangThaiHoSo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TthcTrangThaiHoSoSoap[soapModels.size()]);
	}

	public TthcTrangThaiHoSoSoap() {
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

	public long getQuyTrinhThuTucId() {
		return _quyTrinhThuTucId;
	}

	public void setQuyTrinhThuTucId(long quyTrinhThuTucId) {
		_quyTrinhThuTucId = quyTrinhThuTucId;
	}

	public String getMaTrangThai() {
		return _maTrangThai;
	}

	public void setMaTrangThai(String maTrangThai) {
		_maTrangThai = maTrangThai;
	}

	public String getTenTrangThai() {
		return _tenTrangThai;
	}

	public void setTenTrangThai(String tenTrangThai) {
		_tenTrangThai = tenTrangThai;
	}

	public String getTenTiengAnh() {
		return _tenTiengAnh;
	}

	public void setTenTiengAnh(String tenTiengAnh) {
		_tenTiengAnh = tenTiengAnh;
	}

	public int getSoThuTu() {
		return _soThuTu;
	}

	public void setSoThuTu(int soThuTu) {
		_soThuTu = soThuTu;
	}

	public int getTrangThaiKetThuc() {
		return _trangThaiKetThuc;
	}

	public void setTrangThaiKetThuc(int trangThaiKetThuc) {
		_trangThaiKetThuc = trangThaiKetThuc;
	}

	public String getMoTaTrangThai() {
		return _moTaTrangThai;
	}

	public void setMoTaTrangThai(String moTaTrangThai) {
		_moTaTrangThai = moTaTrangThai;
	}

	public long getVaiTroXuLy1() {
		return _vaiTroXuLy1;
	}

	public void setVaiTroXuLy1(long vaiTroXuLy1) {
		_vaiTroXuLy1 = vaiTroXuLy1;
	}

	public long getVaiTroXuLy2() {
		return _vaiTroXuLy2;
	}

	public void setVaiTroXuLy2(long vaiTroXuLy2) {
		_vaiTroXuLy2 = vaiTroXuLy2;
	}

	public long getVaiTroXuLy3() {
		return _vaiTroXuLy3;
	}

	public void setVaiTroXuLy3(long vaiTroXuLy3) {
		_vaiTroXuLy3 = vaiTroXuLy3;
	}

	public String getFormXuLy() {
		return _formXuLy;
	}

	public void setFormXuLy(String formXuLy) {
		_formXuLy = formXuLy;
	}

	private long _id;
	private long _quyTrinhThuTucId;
	private String _maTrangThai;
	private String _tenTrangThai;
	private String _tenTiengAnh;
	private int _soThuTu;
	private int _trangThaiKetThuc;
	private String _moTaTrangThai;
	private long _vaiTroXuLy1;
	private long _vaiTroXuLy2;
	private long _vaiTroXuLy3;
	private String _formXuLy;
}