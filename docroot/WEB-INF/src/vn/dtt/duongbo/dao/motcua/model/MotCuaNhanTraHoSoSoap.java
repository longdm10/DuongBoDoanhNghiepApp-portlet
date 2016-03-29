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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.motcua.service.http.MotCuaNhanTraHoSoServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.duongbo.dao.motcua.service.http.MotCuaNhanTraHoSoServiceSoap
 * @generated
 */
public class MotCuaNhanTraHoSoSoap implements Serializable {
	public static MotCuaNhanTraHoSoSoap toSoapModel(MotCuaNhanTraHoSo model) {
		MotCuaNhanTraHoSoSoap soapModel = new MotCuaNhanTraHoSoSoap();

		soapModel.setId(model.getId());
		soapModel.setHoSoThuTucId(model.getHoSoThuTucId());
		soapModel.setTenNguoiNop(model.getTenNguoiNop());
		soapModel.setCmndNguoiNop(model.getCmndNguoiNop());
		soapModel.setDiaChiNguoiNop(model.getDiaChiNguoiNop());
		soapModel.setSoDienThoaiNguoiNop(model.getSoDienThoaiNguoiNop());
		soapModel.setEmailNguoiNop(model.getEmailNguoiNop());

		return soapModel;
	}

	public static MotCuaNhanTraHoSoSoap[] toSoapModels(
		MotCuaNhanTraHoSo[] models) {
		MotCuaNhanTraHoSoSoap[] soapModels = new MotCuaNhanTraHoSoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MotCuaNhanTraHoSoSoap[][] toSoapModels(
		MotCuaNhanTraHoSo[][] models) {
		MotCuaNhanTraHoSoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MotCuaNhanTraHoSoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new MotCuaNhanTraHoSoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MotCuaNhanTraHoSoSoap[] toSoapModels(
		List<MotCuaNhanTraHoSo> models) {
		List<MotCuaNhanTraHoSoSoap> soapModels = new ArrayList<MotCuaNhanTraHoSoSoap>(models.size());

		for (MotCuaNhanTraHoSo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MotCuaNhanTraHoSoSoap[soapModels.size()]);
	}

	public MotCuaNhanTraHoSoSoap() {
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

	public String getTenNguoiNop() {
		return _tenNguoiNop;
	}

	public void setTenNguoiNop(String tenNguoiNop) {
		_tenNguoiNop = tenNguoiNop;
	}

	public String getCmndNguoiNop() {
		return _cmndNguoiNop;
	}

	public void setCmndNguoiNop(String cmndNguoiNop) {
		_cmndNguoiNop = cmndNguoiNop;
	}

	public String getDiaChiNguoiNop() {
		return _diaChiNguoiNop;
	}

	public void setDiaChiNguoiNop(String diaChiNguoiNop) {
		_diaChiNguoiNop = diaChiNguoiNop;
	}

	public String getSoDienThoaiNguoiNop() {
		return _soDienThoaiNguoiNop;
	}

	public void setSoDienThoaiNguoiNop(String soDienThoaiNguoiNop) {
		_soDienThoaiNguoiNop = soDienThoaiNguoiNop;
	}

	public String getEmailNguoiNop() {
		return _emailNguoiNop;
	}

	public void setEmailNguoiNop(String emailNguoiNop) {
		_emailNguoiNop = emailNguoiNop;
	}

	private long _id;
	private long _hoSoThuTucId;
	private String _tenNguoiNop;
	private String _cmndNguoiNop;
	private String _diaChiNguoiNop;
	private String _soDienThoaiNguoiNop;
	private String _emailNguoiNop;
}