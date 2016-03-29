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
public class TthcHinhThucNopPhiSoap implements Serializable {
	public static TthcHinhThucNopPhiSoap toSoapModel(TthcHinhThucNopPhi model) {
		TthcHinhThucNopPhiSoap soapModel = new TthcHinhThucNopPhiSoap();

		soapModel.setId(model.getId());
		soapModel.setThuTucHanhChinhId(model.getThuTucHanhChinhId());
		soapModel.setDonViThucHienId(model.getDonViThucHienId());
		soapModel.setPhiNopBanDau(model.getPhiNopBanDau());
		soapModel.setChuyenKhoan(model.getChuyenKhoan());
		soapModel.setKeyPay(model.getKeyPay());

		return soapModel;
	}

	public static TthcHinhThucNopPhiSoap[] toSoapModels(
		TthcHinhThucNopPhi[] models) {
		TthcHinhThucNopPhiSoap[] soapModels = new TthcHinhThucNopPhiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TthcHinhThucNopPhiSoap[][] toSoapModels(
		TthcHinhThucNopPhi[][] models) {
		TthcHinhThucNopPhiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TthcHinhThucNopPhiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TthcHinhThucNopPhiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TthcHinhThucNopPhiSoap[] toSoapModels(
		List<TthcHinhThucNopPhi> models) {
		List<TthcHinhThucNopPhiSoap> soapModels = new ArrayList<TthcHinhThucNopPhiSoap>(models.size());

		for (TthcHinhThucNopPhi model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TthcHinhThucNopPhiSoap[soapModels.size()]);
	}

	public TthcHinhThucNopPhiSoap() {
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

	public long getThuTucHanhChinhId() {
		return _thuTucHanhChinhId;
	}

	public void setThuTucHanhChinhId(long thuTucHanhChinhId) {
		_thuTucHanhChinhId = thuTucHanhChinhId;
	}

	public long getDonViThucHienId() {
		return _donViThucHienId;
	}

	public void setDonViThucHienId(long donViThucHienId) {
		_donViThucHienId = donViThucHienId;
	}

	public long getPhiNopBanDau() {
		return _phiNopBanDau;
	}

	public void setPhiNopBanDau(long phiNopBanDau) {
		_phiNopBanDau = phiNopBanDau;
	}

	public String getChuyenKhoan() {
		return _chuyenKhoan;
	}

	public void setChuyenKhoan(String chuyenKhoan) {
		_chuyenKhoan = chuyenKhoan;
	}

	public String getKeyPay() {
		return _keyPay;
	}

	public void setKeyPay(String keyPay) {
		_keyPay = keyPay;
	}

	private long _id;
	private long _thuTucHanhChinhId;
	private long _donViThucHienId;
	private long _phiNopBanDau;
	private String _chuyenKhoan;
	private String _keyPay;
}