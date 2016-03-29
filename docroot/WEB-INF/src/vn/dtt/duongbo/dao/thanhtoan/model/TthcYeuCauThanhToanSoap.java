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
public class TthcYeuCauThanhToanSoap implements Serializable {
	public static TthcYeuCauThanhToanSoap toSoapModel(TthcYeuCauThanhToan model) {
		TthcYeuCauThanhToanSoap soapModel = new TthcYeuCauThanhToanSoap();

		soapModel.setId(model.getId());
		soapModel.setMaSoYeuCau(model.getMaSoYeuCau());
		soapModel.setSoTien(model.getSoTien());
		soapModel.setChiTietYeuCau(model.getChiTietYeuCau());
		soapModel.setNgayTao(model.getNgayTao());
		soapModel.setNguoiTao(model.getNguoiTao());
		soapModel.setToChucQuanLy(model.getToChucQuanLy());
		soapModel.setHoSoThuTucId(model.getHoSoThuTucId());
		soapModel.setXacNhanThanhToanId(model.getXacNhanThanhToanId());

		return soapModel;
	}

	public static TthcYeuCauThanhToanSoap[] toSoapModels(
		TthcYeuCauThanhToan[] models) {
		TthcYeuCauThanhToanSoap[] soapModels = new TthcYeuCauThanhToanSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TthcYeuCauThanhToanSoap[][] toSoapModels(
		TthcYeuCauThanhToan[][] models) {
		TthcYeuCauThanhToanSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TthcYeuCauThanhToanSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TthcYeuCauThanhToanSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TthcYeuCauThanhToanSoap[] toSoapModels(
		List<TthcYeuCauThanhToan> models) {
		List<TthcYeuCauThanhToanSoap> soapModels = new ArrayList<TthcYeuCauThanhToanSoap>(models.size());

		for (TthcYeuCauThanhToan model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TthcYeuCauThanhToanSoap[soapModels.size()]);
	}

	public TthcYeuCauThanhToanSoap() {
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

	public String getMaSoYeuCau() {
		return _maSoYeuCau;
	}

	public void setMaSoYeuCau(String maSoYeuCau) {
		_maSoYeuCau = maSoYeuCau;
	}

	public long getSoTien() {
		return _soTien;
	}

	public void setSoTien(long soTien) {
		_soTien = soTien;
	}

	public String getChiTietYeuCau() {
		return _chiTietYeuCau;
	}

	public void setChiTietYeuCau(String chiTietYeuCau) {
		_chiTietYeuCau = chiTietYeuCau;
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

	public long getToChucQuanLy() {
		return _toChucQuanLy;
	}

	public void setToChucQuanLy(long toChucQuanLy) {
		_toChucQuanLy = toChucQuanLy;
	}

	public long getHoSoThuTucId() {
		return _hoSoThuTucId;
	}

	public void setHoSoThuTucId(long hoSoThuTucId) {
		_hoSoThuTucId = hoSoThuTucId;
	}

	public long getXacNhanThanhToanId() {
		return _xacNhanThanhToanId;
	}

	public void setXacNhanThanhToanId(long xacNhanThanhToanId) {
		_xacNhanThanhToanId = xacNhanThanhToanId;
	}

	private long _id;
	private String _maSoYeuCau;
	private long _soTien;
	private String _chiTietYeuCau;
	private Date _ngayTao;
	private long _nguoiTao;
	private long _toChucQuanLy;
	private long _hoSoThuTucId;
	private long _xacNhanThanhToanId;
}