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
public class TthcThanhPhanHoSoSoap implements Serializable {
	public static TthcThanhPhanHoSoSoap toSoapModel(TthcThanhPhanHoSo model) {
		TthcThanhPhanHoSoSoap soapModel = new TthcThanhPhanHoSoSoap();

		soapModel.setId(model.getId());
		soapModel.setThuTucHanhChinhId(model.getThuTucHanhChinhId());
		soapModel.setTenThanhPhan(model.getTenThanhPhan());
		soapModel.setGhiChu(model.getGhiChu());
		soapModel.setMaThanhPhan(model.getMaThanhPhan());
		soapModel.setThuTuHienThi(model.getThuTuHienThi());
		soapModel.setLoaiThanhPhan(model.getLoaiThanhPhan());
		soapModel.setSoTaiLieuDinhKem(model.getSoTaiLieuDinhKem());
		soapModel.setMauTrucTuyen(model.getMauTrucTuyen());

		return soapModel;
	}

	public static TthcThanhPhanHoSoSoap[] toSoapModels(
		TthcThanhPhanHoSo[] models) {
		TthcThanhPhanHoSoSoap[] soapModels = new TthcThanhPhanHoSoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TthcThanhPhanHoSoSoap[][] toSoapModels(
		TthcThanhPhanHoSo[][] models) {
		TthcThanhPhanHoSoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TthcThanhPhanHoSoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TthcThanhPhanHoSoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TthcThanhPhanHoSoSoap[] toSoapModels(
		List<TthcThanhPhanHoSo> models) {
		List<TthcThanhPhanHoSoSoap> soapModels = new ArrayList<TthcThanhPhanHoSoSoap>(models.size());

		for (TthcThanhPhanHoSo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TthcThanhPhanHoSoSoap[soapModels.size()]);
	}

	public TthcThanhPhanHoSoSoap() {
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

	public String getTenThanhPhan() {
		return _tenThanhPhan;
	}

	public void setTenThanhPhan(String tenThanhPhan) {
		_tenThanhPhan = tenThanhPhan;
	}

	public String getGhiChu() {
		return _ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		_ghiChu = ghiChu;
	}

	public String getMaThanhPhan() {
		return _maThanhPhan;
	}

	public void setMaThanhPhan(String maThanhPhan) {
		_maThanhPhan = maThanhPhan;
	}

	public long getThuTuHienThi() {
		return _thuTuHienThi;
	}

	public void setThuTuHienThi(long thuTuHienThi) {
		_thuTuHienThi = thuTuHienThi;
	}

	public long getLoaiThanhPhan() {
		return _loaiThanhPhan;
	}

	public void setLoaiThanhPhan(long loaiThanhPhan) {
		_loaiThanhPhan = loaiThanhPhan;
	}

	public long getSoTaiLieuDinhKem() {
		return _soTaiLieuDinhKem;
	}

	public void setSoTaiLieuDinhKem(long soTaiLieuDinhKem) {
		_soTaiLieuDinhKem = soTaiLieuDinhKem;
	}

	public String getMauTrucTuyen() {
		return _mauTrucTuyen;
	}

	public void setMauTrucTuyen(String mauTrucTuyen) {
		_mauTrucTuyen = mauTrucTuyen;
	}

	private long _id;
	private long _thuTucHanhChinhId;
	private String _tenThanhPhan;
	private String _ghiChu;
	private String _maThanhPhan;
	private long _thuTuHienThi;
	private long _loaiThanhPhan;
	private long _soTaiLieuDinhKem;
	private String _mauTrucTuyen;
}