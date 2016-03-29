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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.motcua.service.http.OEPUserMgtWorkingUnitServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.duongbo.dao.motcua.service.http.OEPUserMgtWorkingUnitServiceSoap
 * @generated
 */
public class OEPUserMgtWorkingUnitSoap implements Serializable {
	public static OEPUserMgtWorkingUnitSoap toSoapModel(
		OEPUserMgtWorkingUnit model) {
		OEPUserMgtWorkingUnitSoap soapModel = new OEPUserMgtWorkingUnitSoap();

		soapModel.setWorkingUnitId(model.getWorkingUnitId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setOrganizationId(model.getOrganizationId());
		soapModel.setGovAgentId(model.getGovAgentId());
		soapModel.setName(model.getName());
		soapModel.setEnname(model.getEnname());
		soapModel.setIsRoot(model.getIsRoot());
		soapModel.setParentWorkingUnitId(model.getParentWorkingUnitId());
		soapModel.setAddress(model.getAddress());
		soapModel.setCityNo(model.getCityNo());
		soapModel.setCityName(model.getCityName());
		soapModel.setDistrictNo(model.getDistrictNo());
		soapModel.setDistrictName(model.getDistrictName());
		soapModel.setWardNo(model.getWardNo());
		soapModel.setWardName(model.getWardName());
		soapModel.setGpsPosition(model.getGpsPosition());
		soapModel.setTelNo(model.getTelNo());
		soapModel.setFax(model.getFax());
		soapModel.setEmail(model.getEmail());
		soapModel.setWebsite(model.getWebsite());

		return soapModel;
	}

	public static OEPUserMgtWorkingUnitSoap[] toSoapModels(
		OEPUserMgtWorkingUnit[] models) {
		OEPUserMgtWorkingUnitSoap[] soapModels = new OEPUserMgtWorkingUnitSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static OEPUserMgtWorkingUnitSoap[][] toSoapModels(
		OEPUserMgtWorkingUnit[][] models) {
		OEPUserMgtWorkingUnitSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new OEPUserMgtWorkingUnitSoap[models.length][models[0].length];
		}
		else {
			soapModels = new OEPUserMgtWorkingUnitSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static OEPUserMgtWorkingUnitSoap[] toSoapModels(
		List<OEPUserMgtWorkingUnit> models) {
		List<OEPUserMgtWorkingUnitSoap> soapModels = new ArrayList<OEPUserMgtWorkingUnitSoap>(models.size());

		for (OEPUserMgtWorkingUnit model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new OEPUserMgtWorkingUnitSoap[soapModels.size()]);
	}

	public OEPUserMgtWorkingUnitSoap() {
	}

	public long getPrimaryKey() {
		return _workingUnitId;
	}

	public void setPrimaryKey(long pk) {
		setWorkingUnitId(pk);
	}

	public long getWorkingUnitId() {
		return _workingUnitId;
	}

	public void setWorkingUnitId(long workingUnitId) {
		_workingUnitId = workingUnitId;
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

	public String getOrganizationId() {
		return _organizationId;
	}

	public void setOrganizationId(String organizationId) {
		_organizationId = organizationId;
	}

	public String getGovAgentId() {
		return _govAgentId;
	}

	public void setGovAgentId(String govAgentId) {
		_govAgentId = govAgentId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getEnname() {
		return _enname;
	}

	public void setEnname(String enname) {
		_enname = enname;
	}

	public int getIsRoot() {
		return _isRoot;
	}

	public void setIsRoot(int isRoot) {
		_isRoot = isRoot;
	}

	public long getParentWorkingUnitId() {
		return _parentWorkingUnitId;
	}

	public void setParentWorkingUnitId(long parentWorkingUnitId) {
		_parentWorkingUnitId = parentWorkingUnitId;
	}

	public String getAddress() {
		return _address;
	}

	public void setAddress(String address) {
		_address = address;
	}

	public String getCityNo() {
		return _cityNo;
	}

	public void setCityNo(String cityNo) {
		_cityNo = cityNo;
	}

	public String getCityName() {
		return _cityName;
	}

	public void setCityName(String cityName) {
		_cityName = cityName;
	}

	public String getDistrictNo() {
		return _districtNo;
	}

	public void setDistrictNo(String districtNo) {
		_districtNo = districtNo;
	}

	public String getDistrictName() {
		return _districtName;
	}

	public void setDistrictName(String districtName) {
		_districtName = districtName;
	}

	public String getWardNo() {
		return _wardNo;
	}

	public void setWardNo(String wardNo) {
		_wardNo = wardNo;
	}

	public String getWardName() {
		return _wardName;
	}

	public void setWardName(String wardName) {
		_wardName = wardName;
	}

	public String getGpsPosition() {
		return _gpsPosition;
	}

	public void setGpsPosition(String gpsPosition) {
		_gpsPosition = gpsPosition;
	}

	public String getTelNo() {
		return _telNo;
	}

	public void setTelNo(String telNo) {
		_telNo = telNo;
	}

	public String getFax() {
		return _fax;
	}

	public void setFax(String fax) {
		_fax = fax;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getWebsite() {
		return _website;
	}

	public void setWebsite(String website) {
		_website = website;
	}

	private long _workingUnitId;
	private long _userId;
	private long _groupId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _organizationId;
	private String _govAgentId;
	private String _name;
	private String _enname;
	private int _isRoot;
	private long _parentWorkingUnitId;
	private String _address;
	private String _cityNo;
	private String _cityName;
	private String _districtNo;
	private String _districtName;
	private String _wardNo;
	private String _wardName;
	private String _gpsPosition;
	private String _telNo;
	private String _fax;
	private String _email;
	private String _website;
}