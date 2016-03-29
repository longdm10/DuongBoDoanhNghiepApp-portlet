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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author win_64
 * @generated
 */
public class TthcThongBaoXuLySoap implements Serializable {
	public static TthcThongBaoXuLySoap toSoapModel(TthcThongBaoXuLy model) {
		TthcThongBaoXuLySoap soapModel = new TthcThongBaoXuLySoap();

		soapModel.setId(model.getId());
		soapModel.setHoSoThuTucId(model.getHoSoThuTucId());
		soapModel.setMaThongBao(model.getMaThongBao());
		soapModel.setNoiDungThongBao(model.getNoiDungThongBao());
		soapModel.setDuLieuThongBao(model.getDuLieuThongBao());
		soapModel.setNgayGio(model.getNgayGio());

		return soapModel;
	}

	public static TthcThongBaoXuLySoap[] toSoapModels(TthcThongBaoXuLy[] models) {
		TthcThongBaoXuLySoap[] soapModels = new TthcThongBaoXuLySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TthcThongBaoXuLySoap[][] toSoapModels(
		TthcThongBaoXuLy[][] models) {
		TthcThongBaoXuLySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TthcThongBaoXuLySoap[models.length][models[0].length];
		}
		else {
			soapModels = new TthcThongBaoXuLySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TthcThongBaoXuLySoap[] toSoapModels(
		List<TthcThongBaoXuLy> models) {
		List<TthcThongBaoXuLySoap> soapModels = new ArrayList<TthcThongBaoXuLySoap>(models.size());

		for (TthcThongBaoXuLy model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TthcThongBaoXuLySoap[soapModels.size()]);
	}

	public TthcThongBaoXuLySoap() {
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

	public String getMaThongBao() {
		return _maThongBao;
	}

	public void setMaThongBao(String maThongBao) {
		_maThongBao = maThongBao;
	}

	public String getNoiDungThongBao() {
		return _noiDungThongBao;
	}

	public void setNoiDungThongBao(String noiDungThongBao) {
		_noiDungThongBao = noiDungThongBao;
	}

	public String getDuLieuThongBao() {
		return _duLieuThongBao;
	}

	public void setDuLieuThongBao(String duLieuThongBao) {
		_duLieuThongBao = duLieuThongBao;
	}

	public Date getNgayGio() {
		return _ngayGio;
	}

	public void setNgayGio(Date ngayGio) {
		_ngayGio = ngayGio;
	}

	private long _id;
	private long _hoSoThuTucId;
	private String _maThongBao;
	private String _noiDungThongBao;
	private String _duLieuThongBao;
	private Date _ngayGio;
}