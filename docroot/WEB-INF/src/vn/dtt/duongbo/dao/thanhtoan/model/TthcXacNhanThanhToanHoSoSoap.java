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
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author win_64
 * @generated
 */
public class TthcXacNhanThanhToanHoSoSoap implements Serializable {
	public static TthcXacNhanThanhToanHoSoSoap toSoapModel(
		TthcXacNhanThanhToanHoSo model) {
		TthcXacNhanThanhToanHoSoSoap soapModel = new TthcXacNhanThanhToanHoSoSoap();

		soapModel.setId(model.getId());
		soapModel.setXacNhanThanhToanId(model.getXacNhanThanhToanId());
		soapModel.setHoSoThuTucId(model.getHoSoThuTucId());
		soapModel.setSoTien(model.getSoTien());
		soapModel.setPhieuXuLyId(model.getPhieuXuLyId());

		return soapModel;
	}

	public static TthcXacNhanThanhToanHoSoSoap[] toSoapModels(
		TthcXacNhanThanhToanHoSo[] models) {
		TthcXacNhanThanhToanHoSoSoap[] soapModels = new TthcXacNhanThanhToanHoSoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TthcXacNhanThanhToanHoSoSoap[][] toSoapModels(
		TthcXacNhanThanhToanHoSo[][] models) {
		TthcXacNhanThanhToanHoSoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TthcXacNhanThanhToanHoSoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TthcXacNhanThanhToanHoSoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TthcXacNhanThanhToanHoSoSoap[] toSoapModels(
		List<TthcXacNhanThanhToanHoSo> models) {
		List<TthcXacNhanThanhToanHoSoSoap> soapModels = new ArrayList<TthcXacNhanThanhToanHoSoSoap>(models.size());

		for (TthcXacNhanThanhToanHoSo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TthcXacNhanThanhToanHoSoSoap[soapModels.size()]);
	}

	public TthcXacNhanThanhToanHoSoSoap() {
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

	public long getXacNhanThanhToanId() {
		return _xacNhanThanhToanId;
	}

	public void setXacNhanThanhToanId(long xacNhanThanhToanId) {
		_xacNhanThanhToanId = xacNhanThanhToanId;
	}

	public long getHoSoThuTucId() {
		return _hoSoThuTucId;
	}

	public void setHoSoThuTucId(long hoSoThuTucId) {
		_hoSoThuTucId = hoSoThuTucId;
	}

	public long getSoTien() {
		return _soTien;
	}

	public void setSoTien(long soTien) {
		_soTien = soTien;
	}

	public long getPhieuXuLyId() {
		return _phieuXuLyId;
	}

	public void setPhieuXuLyId(long phieuXuLyId) {
		_phieuXuLyId = phieuXuLyId;
	}

	private long _id;
	private long _xacNhanThanhToanId;
	private long _hoSoThuTucId;
	private long _soTien;
	private long _phieuXuLyId;
}