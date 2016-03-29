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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.motcua.service.http.OEPUserMgtWorkingUnit2tthcServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.duongbo.dao.motcua.service.http.OEPUserMgtWorkingUnit2tthcServiceSoap
 * @generated
 */
public class OEPUserMgtWorkingUnit2tthcSoap implements Serializable {
	public static OEPUserMgtWorkingUnit2tthcSoap toSoapModel(
		OEPUserMgtWorkingUnit2tthc model) {
		OEPUserMgtWorkingUnit2tthcSoap soapModel = new OEPUserMgtWorkingUnit2tthcSoap();

		soapModel.setWorkingUnit2TTHCId(model.getWorkingUnit2TTHCId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setWorkingUnitId(model.getWorkingUnitId());
		soapModel.setTTHCId(model.getTTHCId());
		soapModel.setLaDonViTiepNhanBanDau(model.getLaDonViTiepNhanBanDau());
		soapModel.setParentWorkingUnitID(model.getParentWorkingUnitID());
		soapModel.setTiepNhanTrucTiep(model.getTiepNhanTrucTiep());

		return soapModel;
	}

	public static OEPUserMgtWorkingUnit2tthcSoap[] toSoapModels(
		OEPUserMgtWorkingUnit2tthc[] models) {
		OEPUserMgtWorkingUnit2tthcSoap[] soapModels = new OEPUserMgtWorkingUnit2tthcSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static OEPUserMgtWorkingUnit2tthcSoap[][] toSoapModels(
		OEPUserMgtWorkingUnit2tthc[][] models) {
		OEPUserMgtWorkingUnit2tthcSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new OEPUserMgtWorkingUnit2tthcSoap[models.length][models[0].length];
		}
		else {
			soapModels = new OEPUserMgtWorkingUnit2tthcSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static OEPUserMgtWorkingUnit2tthcSoap[] toSoapModels(
		List<OEPUserMgtWorkingUnit2tthc> models) {
		List<OEPUserMgtWorkingUnit2tthcSoap> soapModels = new ArrayList<OEPUserMgtWorkingUnit2tthcSoap>(models.size());

		for (OEPUserMgtWorkingUnit2tthc model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new OEPUserMgtWorkingUnit2tthcSoap[soapModels.size()]);
	}

	public OEPUserMgtWorkingUnit2tthcSoap() {
	}

	public long getPrimaryKey() {
		return _workingUnit2TTHCId;
	}

	public void setPrimaryKey(long pk) {
		setWorkingUnit2TTHCId(pk);
	}

	public long getWorkingUnit2TTHCId() {
		return _workingUnit2TTHCId;
	}

	public void setWorkingUnit2TTHCId(long workingUnit2TTHCId) {
		_workingUnit2TTHCId = workingUnit2TTHCId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getWorkingUnitId() {
		return _workingUnitId;
	}

	public void setWorkingUnitId(long workingUnitId) {
		_workingUnitId = workingUnitId;
	}

	public long getTTHCId() {
		return _TTHCId;
	}

	public void setTTHCId(long TTHCId) {
		_TTHCId = TTHCId;
	}

	public int getLaDonViTiepNhanBanDau() {
		return _laDonViTiepNhanBanDau;
	}

	public void setLaDonViTiepNhanBanDau(int laDonViTiepNhanBanDau) {
		_laDonViTiepNhanBanDau = laDonViTiepNhanBanDau;
	}

	public long getParentWorkingUnitID() {
		return _parentWorkingUnitID;
	}

	public void setParentWorkingUnitID(long parentWorkingUnitID) {
		_parentWorkingUnitID = parentWorkingUnitID;
	}

	public int getTiepNhanTrucTiep() {
		return _tiepNhanTrucTiep;
	}

	public void setTiepNhanTrucTiep(int tiepNhanTrucTiep) {
		_tiepNhanTrucTiep = tiepNhanTrucTiep;
	}

	private long _workingUnit2TTHCId;
	private long _userId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _workingUnitId;
	private long _TTHCId;
	private int _laDonViTiepNhanBanDau;
	private long _parentWorkingUnitID;
	private int _tiepNhanTrucTiep;
}