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
public class DmDataVersionSoap implements Serializable {
	public static DmDataVersionSoap toSoapModel(DmDataVersion model) {
		DmDataVersionSoap soapModel = new DmDataVersionSoap();

		soapModel.setId(model.getId());
		soapModel.setDataGroupId(model.getDataGroupId());
		soapModel.setVersion(model.getVersion());
		soapModel.setIssuedTime(model.getIssuedTime());
		soapModel.setValidateDFrom(model.getValidateDFrom());
		soapModel.setValidatedTo(model.getValidatedTo());

		return soapModel;
	}

	public static DmDataVersionSoap[] toSoapModels(DmDataVersion[] models) {
		DmDataVersionSoap[] soapModels = new DmDataVersionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DmDataVersionSoap[][] toSoapModels(DmDataVersion[][] models) {
		DmDataVersionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DmDataVersionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DmDataVersionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DmDataVersionSoap[] toSoapModels(List<DmDataVersion> models) {
		List<DmDataVersionSoap> soapModels = new ArrayList<DmDataVersionSoap>(models.size());

		for (DmDataVersion model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DmDataVersionSoap[soapModels.size()]);
	}

	public DmDataVersionSoap() {
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

	public long getDataGroupId() {
		return _dataGroupId;
	}

	public void setDataGroupId(long dataGroupId) {
		_dataGroupId = dataGroupId;
	}

	public String getVersion() {
		return _version;
	}

	public void setVersion(String version) {
		_version = version;
	}

	public Date getIssuedTime() {
		return _issuedTime;
	}

	public void setIssuedTime(Date issuedTime) {
		_issuedTime = issuedTime;
	}

	public Date getValidateDFrom() {
		return _validateDFrom;
	}

	public void setValidateDFrom(Date validateDFrom) {
		_validateDFrom = validateDFrom;
	}

	public Date getValidatedTo() {
		return _validatedTo;
	}

	public void setValidatedTo(Date validatedTo) {
		_validatedTo = validatedTo;
	}

	private long _id;
	private long _dataGroupId;
	private String _version;
	private Date _issuedTime;
	private Date _validateDFrom;
	private Date _validatedTo;
}