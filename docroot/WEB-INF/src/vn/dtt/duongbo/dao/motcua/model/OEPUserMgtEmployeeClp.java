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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import vn.dtt.duongbo.dao.motcua.service.ClpSerializer;
import vn.dtt.duongbo.dao.motcua.service.OEPUserMgtEmployeeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class OEPUserMgtEmployeeClp extends BaseModelImpl<OEPUserMgtEmployee>
	implements OEPUserMgtEmployee {
	public OEPUserMgtEmployeeClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return OEPUserMgtEmployee.class;
	}

	@Override
	public String getModelClassName() {
		return OEPUserMgtEmployee.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _employeeId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEmployeeId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _employeeId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeId", getEmployeeId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("mappingUserId", getMappingUserId());
		attributes.put("workingUnitId", getWorkingUnitId());
		attributes.put("mainJobPosId", getMainJobPosId());
		attributes.put("employeeNo", getEmployeeNo());
		attributes.put("fullName", getFullName());
		attributes.put("officeTel", getOfficeTel());
		attributes.put("homeTel", getHomeTel());
		attributes.put("mobile", getMobile());
		attributes.put("email", getEmail());
		attributes.put("typeOfEmployee", getTypeOfEmployee());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long employeeId = (Long)attributes.get("employeeId");

		if (employeeId != null) {
			setEmployeeId(employeeId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long mappingUserId = (Long)attributes.get("mappingUserId");

		if (mappingUserId != null) {
			setMappingUserId(mappingUserId);
		}

		Long workingUnitId = (Long)attributes.get("workingUnitId");

		if (workingUnitId != null) {
			setWorkingUnitId(workingUnitId);
		}

		Long mainJobPosId = (Long)attributes.get("mainJobPosId");

		if (mainJobPosId != null) {
			setMainJobPosId(mainJobPosId);
		}

		String employeeNo = (String)attributes.get("employeeNo");

		if (employeeNo != null) {
			setEmployeeNo(employeeNo);
		}

		String fullName = (String)attributes.get("fullName");

		if (fullName != null) {
			setFullName(fullName);
		}

		String officeTel = (String)attributes.get("officeTel");

		if (officeTel != null) {
			setOfficeTel(officeTel);
		}

		String homeTel = (String)attributes.get("homeTel");

		if (homeTel != null) {
			setHomeTel(homeTel);
		}

		String mobile = (String)attributes.get("mobile");

		if (mobile != null) {
			setMobile(mobile);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String typeOfEmployee = (String)attributes.get("typeOfEmployee");

		if (typeOfEmployee != null) {
			setTypeOfEmployee(typeOfEmployee);
		}
	}

	@Override
	public long getEmployeeId() {
		return _employeeId;
	}

	@Override
	public void setEmployeeId(long employeeId) {
		_employeeId = employeeId;

		if (_oepUserMgtEmployeeRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtEmployeeRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployeeId", long.class);

				method.invoke(_oepUserMgtEmployeeRemoteModel, employeeId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_oepUserMgtEmployeeRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtEmployeeRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_oepUserMgtEmployeeRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_oepUserMgtEmployeeRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtEmployeeRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_oepUserMgtEmployeeRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_oepUserMgtEmployeeRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtEmployeeRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_oepUserMgtEmployeeRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_oepUserMgtEmployeeRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtEmployeeRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_oepUserMgtEmployeeRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_oepUserMgtEmployeeRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtEmployeeRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_oepUserMgtEmployeeRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getMappingUserId() {
		return _mappingUserId;
	}

	@Override
	public void setMappingUserId(long mappingUserId) {
		_mappingUserId = mappingUserId;

		if (_oepUserMgtEmployeeRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtEmployeeRemoteModel.getClass();

				Method method = clazz.getMethod("setMappingUserId", long.class);

				method.invoke(_oepUserMgtEmployeeRemoteModel, mappingUserId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMappingUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getMappingUserId(), "uuid",
			_mappingUserUuid);
	}

	@Override
	public void setMappingUserUuid(String mappingUserUuid) {
		_mappingUserUuid = mappingUserUuid;
	}

	@Override
	public long getWorkingUnitId() {
		return _workingUnitId;
	}

	@Override
	public void setWorkingUnitId(long workingUnitId) {
		_workingUnitId = workingUnitId;

		if (_oepUserMgtEmployeeRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtEmployeeRemoteModel.getClass();

				Method method = clazz.getMethod("setWorkingUnitId", long.class);

				method.invoke(_oepUserMgtEmployeeRemoteModel, workingUnitId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getMainJobPosId() {
		return _mainJobPosId;
	}

	@Override
	public void setMainJobPosId(long mainJobPosId) {
		_mainJobPosId = mainJobPosId;

		if (_oepUserMgtEmployeeRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtEmployeeRemoteModel.getClass();

				Method method = clazz.getMethod("setMainJobPosId", long.class);

				method.invoke(_oepUserMgtEmployeeRemoteModel, mainJobPosId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmployeeNo() {
		return _employeeNo;
	}

	@Override
	public void setEmployeeNo(String employeeNo) {
		_employeeNo = employeeNo;

		if (_oepUserMgtEmployeeRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtEmployeeRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployeeNo", String.class);

				method.invoke(_oepUserMgtEmployeeRemoteModel, employeeNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFullName() {
		return _fullName;
	}

	@Override
	public void setFullName(String fullName) {
		_fullName = fullName;

		if (_oepUserMgtEmployeeRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtEmployeeRemoteModel.getClass();

				Method method = clazz.getMethod("setFullName", String.class);

				method.invoke(_oepUserMgtEmployeeRemoteModel, fullName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOfficeTel() {
		return _officeTel;
	}

	@Override
	public void setOfficeTel(String officeTel) {
		_officeTel = officeTel;

		if (_oepUserMgtEmployeeRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtEmployeeRemoteModel.getClass();

				Method method = clazz.getMethod("setOfficeTel", String.class);

				method.invoke(_oepUserMgtEmployeeRemoteModel, officeTel);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getHomeTel() {
		return _homeTel;
	}

	@Override
	public void setHomeTel(String homeTel) {
		_homeTel = homeTel;

		if (_oepUserMgtEmployeeRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtEmployeeRemoteModel.getClass();

				Method method = clazz.getMethod("setHomeTel", String.class);

				method.invoke(_oepUserMgtEmployeeRemoteModel, homeTel);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMobile() {
		return _mobile;
	}

	@Override
	public void setMobile(String mobile) {
		_mobile = mobile;

		if (_oepUserMgtEmployeeRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtEmployeeRemoteModel.getClass();

				Method method = clazz.getMethod("setMobile", String.class);

				method.invoke(_oepUserMgtEmployeeRemoteModel, mobile);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmail() {
		return _email;
	}

	@Override
	public void setEmail(String email) {
		_email = email;

		if (_oepUserMgtEmployeeRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtEmployeeRemoteModel.getClass();

				Method method = clazz.getMethod("setEmail", String.class);

				method.invoke(_oepUserMgtEmployeeRemoteModel, email);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTypeOfEmployee() {
		return _typeOfEmployee;
	}

	@Override
	public void setTypeOfEmployee(String typeOfEmployee) {
		_typeOfEmployee = typeOfEmployee;

		if (_oepUserMgtEmployeeRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtEmployeeRemoteModel.getClass();

				Method method = clazz.getMethod("setTypeOfEmployee",
						String.class);

				method.invoke(_oepUserMgtEmployeeRemoteModel, typeOfEmployee);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getOEPUserMgtEmployeeRemoteModel() {
		return _oepUserMgtEmployeeRemoteModel;
	}

	public void setOEPUserMgtEmployeeRemoteModel(
		BaseModel<?> oepUserMgtEmployeeRemoteModel) {
		_oepUserMgtEmployeeRemoteModel = oepUserMgtEmployeeRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _oepUserMgtEmployeeRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_oepUserMgtEmployeeRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			OEPUserMgtEmployeeLocalServiceUtil.addOEPUserMgtEmployee(this);
		}
		else {
			OEPUserMgtEmployeeLocalServiceUtil.updateOEPUserMgtEmployee(this);
		}
	}

	@Override
	public OEPUserMgtEmployee toEscapedModel() {
		return (OEPUserMgtEmployee)ProxyUtil.newProxyInstance(OEPUserMgtEmployee.class.getClassLoader(),
			new Class[] { OEPUserMgtEmployee.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		OEPUserMgtEmployeeClp clone = new OEPUserMgtEmployeeClp();

		clone.setEmployeeId(getEmployeeId());
		clone.setUserId(getUserId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setMappingUserId(getMappingUserId());
		clone.setWorkingUnitId(getWorkingUnitId());
		clone.setMainJobPosId(getMainJobPosId());
		clone.setEmployeeNo(getEmployeeNo());
		clone.setFullName(getFullName());
		clone.setOfficeTel(getOfficeTel());
		clone.setHomeTel(getHomeTel());
		clone.setMobile(getMobile());
		clone.setEmail(getEmail());
		clone.setTypeOfEmployee(getTypeOfEmployee());

		return clone;
	}

	@Override
	public int compareTo(OEPUserMgtEmployee oepUserMgtEmployee) {
		long primaryKey = oepUserMgtEmployee.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OEPUserMgtEmployeeClp)) {
			return false;
		}

		OEPUserMgtEmployeeClp oepUserMgtEmployee = (OEPUserMgtEmployeeClp)obj;

		long primaryKey = oepUserMgtEmployee.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{employeeId=");
		sb.append(getEmployeeId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", mappingUserId=");
		sb.append(getMappingUserId());
		sb.append(", workingUnitId=");
		sb.append(getWorkingUnitId());
		sb.append(", mainJobPosId=");
		sb.append(getMainJobPosId());
		sb.append(", employeeNo=");
		sb.append(getEmployeeNo());
		sb.append(", fullName=");
		sb.append(getFullName());
		sb.append(", officeTel=");
		sb.append(getOfficeTel());
		sb.append(", homeTel=");
		sb.append(getHomeTel());
		sb.append(", mobile=");
		sb.append(getMobile());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", typeOfEmployee=");
		sb.append(getTypeOfEmployee());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(52);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>employeeId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mappingUserId</column-name><column-value><![CDATA[");
		sb.append(getMappingUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>workingUnitId</column-name><column-value><![CDATA[");
		sb.append(getWorkingUnitId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mainJobPosId</column-name><column-value><![CDATA[");
		sb.append(getMainJobPosId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employeeNo</column-name><column-value><![CDATA[");
		sb.append(getEmployeeNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fullName</column-name><column-value><![CDATA[");
		sb.append(getFullName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>officeTel</column-name><column-value><![CDATA[");
		sb.append(getOfficeTel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>homeTel</column-name><column-value><![CDATA[");
		sb.append(getHomeTel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mobile</column-name><column-value><![CDATA[");
		sb.append(getMobile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>typeOfEmployee</column-name><column-value><![CDATA[");
		sb.append(getTypeOfEmployee());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _employeeId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _mappingUserId;
	private String _mappingUserUuid;
	private long _workingUnitId;
	private long _mainJobPosId;
	private String _employeeNo;
	private String _fullName;
	private String _officeTel;
	private String _homeTel;
	private String _mobile;
	private String _email;
	private String _typeOfEmployee;
	private BaseModel<?> _oepUserMgtEmployeeRemoteModel;
}