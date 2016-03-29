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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.motcua.service.http.OEPUserMgtEmployeeServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.duongbo.dao.motcua.service.http.OEPUserMgtEmployeeServiceSoap
 * @generated
 */
public class OEPUserMgtEmployeeSoap implements Serializable {
	public static OEPUserMgtEmployeeSoap toSoapModel(OEPUserMgtEmployee model) {
		OEPUserMgtEmployeeSoap soapModel = new OEPUserMgtEmployeeSoap();

		soapModel.setEmployeeId(model.getEmployeeId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setMappingUserId(model.getMappingUserId());
		soapModel.setWorkingUnitId(model.getWorkingUnitId());
		soapModel.setMainJobPosId(model.getMainJobPosId());
		soapModel.setEmployeeNo(model.getEmployeeNo());
		soapModel.setFullName(model.getFullName());
		soapModel.setOfficeTel(model.getOfficeTel());
		soapModel.setHomeTel(model.getHomeTel());
		soapModel.setMobile(model.getMobile());
		soapModel.setEmail(model.getEmail());
		soapModel.setTypeOfEmployee(model.getTypeOfEmployee());

		return soapModel;
	}

	public static OEPUserMgtEmployeeSoap[] toSoapModels(
		OEPUserMgtEmployee[] models) {
		OEPUserMgtEmployeeSoap[] soapModels = new OEPUserMgtEmployeeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static OEPUserMgtEmployeeSoap[][] toSoapModels(
		OEPUserMgtEmployee[][] models) {
		OEPUserMgtEmployeeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new OEPUserMgtEmployeeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new OEPUserMgtEmployeeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static OEPUserMgtEmployeeSoap[] toSoapModels(
		List<OEPUserMgtEmployee> models) {
		List<OEPUserMgtEmployeeSoap> soapModels = new ArrayList<OEPUserMgtEmployeeSoap>(models.size());

		for (OEPUserMgtEmployee model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new OEPUserMgtEmployeeSoap[soapModels.size()]);
	}

	public OEPUserMgtEmployeeSoap() {
	}

	public long getPrimaryKey() {
		return _employeeId;
	}

	public void setPrimaryKey(long pk) {
		setEmployeeId(pk);
	}

	public long getEmployeeId() {
		return _employeeId;
	}

	public void setEmployeeId(long employeeId) {
		_employeeId = employeeId;
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

	public long getMappingUserId() {
		return _mappingUserId;
	}

	public void setMappingUserId(long mappingUserId) {
		_mappingUserId = mappingUserId;
	}

	public long getWorkingUnitId() {
		return _workingUnitId;
	}

	public void setWorkingUnitId(long workingUnitId) {
		_workingUnitId = workingUnitId;
	}

	public long getMainJobPosId() {
		return _mainJobPosId;
	}

	public void setMainJobPosId(long mainJobPosId) {
		_mainJobPosId = mainJobPosId;
	}

	public String getEmployeeNo() {
		return _employeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		_employeeNo = employeeNo;
	}

	public String getFullName() {
		return _fullName;
	}

	public void setFullName(String fullName) {
		_fullName = fullName;
	}

	public String getOfficeTel() {
		return _officeTel;
	}

	public void setOfficeTel(String officeTel) {
		_officeTel = officeTel;
	}

	public String getHomeTel() {
		return _homeTel;
	}

	public void setHomeTel(String homeTel) {
		_homeTel = homeTel;
	}

	public String getMobile() {
		return _mobile;
	}

	public void setMobile(String mobile) {
		_mobile = mobile;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getTypeOfEmployee() {
		return _typeOfEmployee;
	}

	public void setTypeOfEmployee(String typeOfEmployee) {
		_typeOfEmployee = typeOfEmployee;
	}

	private long _employeeId;
	private long _userId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _mappingUserId;
	private long _workingUnitId;
	private long _mainJobPosId;
	private String _employeeNo;
	private String _fullName;
	private String _officeTel;
	private String _homeTel;
	private String _mobile;
	private String _email;
	private String _typeOfEmployee;
}