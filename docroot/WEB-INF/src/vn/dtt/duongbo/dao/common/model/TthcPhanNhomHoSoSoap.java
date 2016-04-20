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
 * This class is used by SOAP remote services.
 *
 * @author win_64
 * @generated
 */
public class TthcPhanNhomHoSoSoap implements Serializable {
	public static TthcPhanNhomHoSoSoap toSoapModel(TthcPhanNhomHoSo model) {
		TthcPhanNhomHoSoSoap soapModel = new TthcPhanNhomHoSoSoap();

		soapModel.setId(model.getId());
		soapModel.setMaPhanNhom(model.getMaPhanNhom());
		soapModel.setTenPhanNhom(model.getTenPhanNhom());
		soapModel.setTenTiengAnh(model.getTenTiengAnh());
		soapModel.setSoThuTu(model.getSoThuTu());
		soapModel.setLoaiPhanNhom(model.getLoaiPhanNhom());
		soapModel.setToChucQuanLy(model.getToChucQuanLy());

		return soapModel;
	}

	public static TthcPhanNhomHoSoSoap[] toSoapModels(TthcPhanNhomHoSo[] models) {
		TthcPhanNhomHoSoSoap[] soapModels = new TthcPhanNhomHoSoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TthcPhanNhomHoSoSoap[][] toSoapModels(
		TthcPhanNhomHoSo[][] models) {
		TthcPhanNhomHoSoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TthcPhanNhomHoSoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TthcPhanNhomHoSoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TthcPhanNhomHoSoSoap[] toSoapModels(
		List<TthcPhanNhomHoSo> models) {
		List<TthcPhanNhomHoSoSoap> soapModels = new ArrayList<TthcPhanNhomHoSoSoap>(models.size());

		for (TthcPhanNhomHoSo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TthcPhanNhomHoSoSoap[soapModels.size()]);
	}

	public TthcPhanNhomHoSoSoap() {
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

	public String getMaPhanNhom() {
		return _maPhanNhom;
	}

	public void setMaPhanNhom(String maPhanNhom) {
		_maPhanNhom = maPhanNhom;
	}

	public String getTenPhanNhom() {
		return _tenPhanNhom;
	}

	public void setTenPhanNhom(String tenPhanNhom) {
		_tenPhanNhom = tenPhanNhom;
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

	public int getLoaiPhanNhom() {
		return _loaiPhanNhom;
	}

	public void setLoaiPhanNhom(int loaiPhanNhom) {
		_loaiPhanNhom = loaiPhanNhom;
	}

	public long getToChucQuanLy() {
		return _toChucQuanLy;
	}

	public void setToChucQuanLy(long toChucQuanLy) {
		_toChucQuanLy = toChucQuanLy;
	}

	private long _id;
	private String _maPhanNhom;
	private String _tenPhanNhom;
	private String _tenTiengAnh;
	private int _soThuTu;
	private int _loaiPhanNhom;
	private long _toChucQuanLy;
}