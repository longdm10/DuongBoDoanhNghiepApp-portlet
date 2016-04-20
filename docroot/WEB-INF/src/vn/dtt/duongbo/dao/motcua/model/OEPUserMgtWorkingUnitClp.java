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
import vn.dtt.duongbo.dao.motcua.service.OEPUserMgtWorkingUnitLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class OEPUserMgtWorkingUnitClp extends BaseModelImpl<OEPUserMgtWorkingUnit>
	implements OEPUserMgtWorkingUnit {
	public OEPUserMgtWorkingUnitClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return OEPUserMgtWorkingUnit.class;
	}

	@Override
	public String getModelClassName() {
		return OEPUserMgtWorkingUnit.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _workingUnitId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setWorkingUnitId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _workingUnitId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("workingUnitId", getWorkingUnitId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("organizationId", getOrganizationId());
		attributes.put("govAgentId", getGovAgentId());
		attributes.put("name", getName());
		attributes.put("enname", getEnname());
		attributes.put("isRoot", getIsRoot());
		attributes.put("parentWorkingUnitId", getParentWorkingUnitId());
		attributes.put("address", getAddress());
		attributes.put("cityNo", getCityNo());
		attributes.put("cityName", getCityName());
		attributes.put("districtNo", getDistrictNo());
		attributes.put("districtName", getDistrictName());
		attributes.put("wardNo", getWardNo());
		attributes.put("wardName", getWardName());
		attributes.put("gpsPosition", getGpsPosition());
		attributes.put("telNo", getTelNo());
		attributes.put("fax", getFax());
		attributes.put("email", getEmail());
		attributes.put("website", getWebsite());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long workingUnitId = (Long)attributes.get("workingUnitId");

		if (workingUnitId != null) {
			setWorkingUnitId(workingUnitId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String organizationId = (String)attributes.get("organizationId");

		if (organizationId != null) {
			setOrganizationId(organizationId);
		}

		String govAgentId = (String)attributes.get("govAgentId");

		if (govAgentId != null) {
			setGovAgentId(govAgentId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String enname = (String)attributes.get("enname");

		if (enname != null) {
			setEnname(enname);
		}

		Integer isRoot = (Integer)attributes.get("isRoot");

		if (isRoot != null) {
			setIsRoot(isRoot);
		}

		Long parentWorkingUnitId = (Long)attributes.get("parentWorkingUnitId");

		if (parentWorkingUnitId != null) {
			setParentWorkingUnitId(parentWorkingUnitId);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String cityNo = (String)attributes.get("cityNo");

		if (cityNo != null) {
			setCityNo(cityNo);
		}

		String cityName = (String)attributes.get("cityName");

		if (cityName != null) {
			setCityName(cityName);
		}

		String districtNo = (String)attributes.get("districtNo");

		if (districtNo != null) {
			setDistrictNo(districtNo);
		}

		String districtName = (String)attributes.get("districtName");

		if (districtName != null) {
			setDistrictName(districtName);
		}

		String wardNo = (String)attributes.get("wardNo");

		if (wardNo != null) {
			setWardNo(wardNo);
		}

		String wardName = (String)attributes.get("wardName");

		if (wardName != null) {
			setWardName(wardName);
		}

		String gpsPosition = (String)attributes.get("gpsPosition");

		if (gpsPosition != null) {
			setGpsPosition(gpsPosition);
		}

		String telNo = (String)attributes.get("telNo");

		if (telNo != null) {
			setTelNo(telNo);
		}

		String fax = (String)attributes.get("fax");

		if (fax != null) {
			setFax(fax);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String website = (String)attributes.get("website");

		if (website != null) {
			setWebsite(website);
		}
	}

	@Override
	public long getWorkingUnitId() {
		return _workingUnitId;
	}

	@Override
	public void setWorkingUnitId(long workingUnitId) {
		_workingUnitId = workingUnitId;

		if (_oepUserMgtWorkingUnitRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtWorkingUnitRemoteModel.getClass();

				Method method = clazz.getMethod("setWorkingUnitId", long.class);

				method.invoke(_oepUserMgtWorkingUnitRemoteModel, workingUnitId);
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

		if (_oepUserMgtWorkingUnitRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtWorkingUnitRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_oepUserMgtWorkingUnitRemoteModel, userId);
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

		if (_oepUserMgtWorkingUnitRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtWorkingUnitRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_oepUserMgtWorkingUnitRemoteModel, groupId);
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

		if (_oepUserMgtWorkingUnitRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtWorkingUnitRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_oepUserMgtWorkingUnitRemoteModel, createDate);
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

		if (_oepUserMgtWorkingUnitRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtWorkingUnitRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_oepUserMgtWorkingUnitRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOrganizationId() {
		return _organizationId;
	}

	@Override
	public void setOrganizationId(String organizationId) {
		_organizationId = organizationId;

		if (_oepUserMgtWorkingUnitRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtWorkingUnitRemoteModel.getClass();

				Method method = clazz.getMethod("setOrganizationId",
						String.class);

				method.invoke(_oepUserMgtWorkingUnitRemoteModel, organizationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGovAgentId() {
		return _govAgentId;
	}

	@Override
	public void setGovAgentId(String govAgentId) {
		_govAgentId = govAgentId;

		if (_oepUserMgtWorkingUnitRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtWorkingUnitRemoteModel.getClass();

				Method method = clazz.getMethod("setGovAgentId", String.class);

				method.invoke(_oepUserMgtWorkingUnitRemoteModel, govAgentId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_oepUserMgtWorkingUnitRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtWorkingUnitRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_oepUserMgtWorkingUnitRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEnname() {
		return _enname;
	}

	@Override
	public void setEnname(String enname) {
		_enname = enname;

		if (_oepUserMgtWorkingUnitRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtWorkingUnitRemoteModel.getClass();

				Method method = clazz.getMethod("setEnname", String.class);

				method.invoke(_oepUserMgtWorkingUnitRemoteModel, enname);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIsRoot() {
		return _isRoot;
	}

	@Override
	public void setIsRoot(int isRoot) {
		_isRoot = isRoot;

		if (_oepUserMgtWorkingUnitRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtWorkingUnitRemoteModel.getClass();

				Method method = clazz.getMethod("setIsRoot", int.class);

				method.invoke(_oepUserMgtWorkingUnitRemoteModel, isRoot);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getParentWorkingUnitId() {
		return _parentWorkingUnitId;
	}

	@Override
	public void setParentWorkingUnitId(long parentWorkingUnitId) {
		_parentWorkingUnitId = parentWorkingUnitId;

		if (_oepUserMgtWorkingUnitRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtWorkingUnitRemoteModel.getClass();

				Method method = clazz.getMethod("setParentWorkingUnitId",
						long.class);

				method.invoke(_oepUserMgtWorkingUnitRemoteModel,
					parentWorkingUnitId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAddress() {
		return _address;
	}

	@Override
	public void setAddress(String address) {
		_address = address;

		if (_oepUserMgtWorkingUnitRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtWorkingUnitRemoteModel.getClass();

				Method method = clazz.getMethod("setAddress", String.class);

				method.invoke(_oepUserMgtWorkingUnitRemoteModel, address);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCityNo() {
		return _cityNo;
	}

	@Override
	public void setCityNo(String cityNo) {
		_cityNo = cityNo;

		if (_oepUserMgtWorkingUnitRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtWorkingUnitRemoteModel.getClass();

				Method method = clazz.getMethod("setCityNo", String.class);

				method.invoke(_oepUserMgtWorkingUnitRemoteModel, cityNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCityName() {
		return _cityName;
	}

	@Override
	public void setCityName(String cityName) {
		_cityName = cityName;

		if (_oepUserMgtWorkingUnitRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtWorkingUnitRemoteModel.getClass();

				Method method = clazz.getMethod("setCityName", String.class);

				method.invoke(_oepUserMgtWorkingUnitRemoteModel, cityName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDistrictNo() {
		return _districtNo;
	}

	@Override
	public void setDistrictNo(String districtNo) {
		_districtNo = districtNo;

		if (_oepUserMgtWorkingUnitRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtWorkingUnitRemoteModel.getClass();

				Method method = clazz.getMethod("setDistrictNo", String.class);

				method.invoke(_oepUserMgtWorkingUnitRemoteModel, districtNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDistrictName() {
		return _districtName;
	}

	@Override
	public void setDistrictName(String districtName) {
		_districtName = districtName;

		if (_oepUserMgtWorkingUnitRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtWorkingUnitRemoteModel.getClass();

				Method method = clazz.getMethod("setDistrictName", String.class);

				method.invoke(_oepUserMgtWorkingUnitRemoteModel, districtName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getWardNo() {
		return _wardNo;
	}

	@Override
	public void setWardNo(String wardNo) {
		_wardNo = wardNo;

		if (_oepUserMgtWorkingUnitRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtWorkingUnitRemoteModel.getClass();

				Method method = clazz.getMethod("setWardNo", String.class);

				method.invoke(_oepUserMgtWorkingUnitRemoteModel, wardNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getWardName() {
		return _wardName;
	}

	@Override
	public void setWardName(String wardName) {
		_wardName = wardName;

		if (_oepUserMgtWorkingUnitRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtWorkingUnitRemoteModel.getClass();

				Method method = clazz.getMethod("setWardName", String.class);

				method.invoke(_oepUserMgtWorkingUnitRemoteModel, wardName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGpsPosition() {
		return _gpsPosition;
	}

	@Override
	public void setGpsPosition(String gpsPosition) {
		_gpsPosition = gpsPosition;

		if (_oepUserMgtWorkingUnitRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtWorkingUnitRemoteModel.getClass();

				Method method = clazz.getMethod("setGpsPosition", String.class);

				method.invoke(_oepUserMgtWorkingUnitRemoteModel, gpsPosition);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTelNo() {
		return _telNo;
	}

	@Override
	public void setTelNo(String telNo) {
		_telNo = telNo;

		if (_oepUserMgtWorkingUnitRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtWorkingUnitRemoteModel.getClass();

				Method method = clazz.getMethod("setTelNo", String.class);

				method.invoke(_oepUserMgtWorkingUnitRemoteModel, telNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFax() {
		return _fax;
	}

	@Override
	public void setFax(String fax) {
		_fax = fax;

		if (_oepUserMgtWorkingUnitRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtWorkingUnitRemoteModel.getClass();

				Method method = clazz.getMethod("setFax", String.class);

				method.invoke(_oepUserMgtWorkingUnitRemoteModel, fax);
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

		if (_oepUserMgtWorkingUnitRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtWorkingUnitRemoteModel.getClass();

				Method method = clazz.getMethod("setEmail", String.class);

				method.invoke(_oepUserMgtWorkingUnitRemoteModel, email);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getWebsite() {
		return _website;
	}

	@Override
	public void setWebsite(String website) {
		_website = website;

		if (_oepUserMgtWorkingUnitRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtWorkingUnitRemoteModel.getClass();

				Method method = clazz.getMethod("setWebsite", String.class);

				method.invoke(_oepUserMgtWorkingUnitRemoteModel, website);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getOEPUserMgtWorkingUnitRemoteModel() {
		return _oepUserMgtWorkingUnitRemoteModel;
	}

	public void setOEPUserMgtWorkingUnitRemoteModel(
		BaseModel<?> oepUserMgtWorkingUnitRemoteModel) {
		_oepUserMgtWorkingUnitRemoteModel = oepUserMgtWorkingUnitRemoteModel;
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

		Class<?> remoteModelClass = _oepUserMgtWorkingUnitRemoteModel.getClass();

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

		Object returnValue = method.invoke(_oepUserMgtWorkingUnitRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			OEPUserMgtWorkingUnitLocalServiceUtil.addOEPUserMgtWorkingUnit(this);
		}
		else {
			OEPUserMgtWorkingUnitLocalServiceUtil.updateOEPUserMgtWorkingUnit(this);
		}
	}

	@Override
	public OEPUserMgtWorkingUnit toEscapedModel() {
		return (OEPUserMgtWorkingUnit)ProxyUtil.newProxyInstance(OEPUserMgtWorkingUnit.class.getClassLoader(),
			new Class[] { OEPUserMgtWorkingUnit.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		OEPUserMgtWorkingUnitClp clone = new OEPUserMgtWorkingUnitClp();

		clone.setWorkingUnitId(getWorkingUnitId());
		clone.setUserId(getUserId());
		clone.setGroupId(getGroupId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setOrganizationId(getOrganizationId());
		clone.setGovAgentId(getGovAgentId());
		clone.setName(getName());
		clone.setEnname(getEnname());
		clone.setIsRoot(getIsRoot());
		clone.setParentWorkingUnitId(getParentWorkingUnitId());
		clone.setAddress(getAddress());
		clone.setCityNo(getCityNo());
		clone.setCityName(getCityName());
		clone.setDistrictNo(getDistrictNo());
		clone.setDistrictName(getDistrictName());
		clone.setWardNo(getWardNo());
		clone.setWardName(getWardName());
		clone.setGpsPosition(getGpsPosition());
		clone.setTelNo(getTelNo());
		clone.setFax(getFax());
		clone.setEmail(getEmail());
		clone.setWebsite(getWebsite());

		return clone;
	}

	@Override
	public int compareTo(OEPUserMgtWorkingUnit oepUserMgtWorkingUnit) {
		int value = 0;

		if (getWorkingUnitId() < oepUserMgtWorkingUnit.getWorkingUnitId()) {
			value = -1;
		}
		else if (getWorkingUnitId() > oepUserMgtWorkingUnit.getWorkingUnitId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OEPUserMgtWorkingUnitClp)) {
			return false;
		}

		OEPUserMgtWorkingUnitClp oepUserMgtWorkingUnit = (OEPUserMgtWorkingUnitClp)obj;

		long primaryKey = oepUserMgtWorkingUnit.getPrimaryKey();

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
		StringBundler sb = new StringBundler(47);

		sb.append("{workingUnitId=");
		sb.append(getWorkingUnitId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", organizationId=");
		sb.append(getOrganizationId());
		sb.append(", govAgentId=");
		sb.append(getGovAgentId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", enname=");
		sb.append(getEnname());
		sb.append(", isRoot=");
		sb.append(getIsRoot());
		sb.append(", parentWorkingUnitId=");
		sb.append(getParentWorkingUnitId());
		sb.append(", address=");
		sb.append(getAddress());
		sb.append(", cityNo=");
		sb.append(getCityNo());
		sb.append(", cityName=");
		sb.append(getCityName());
		sb.append(", districtNo=");
		sb.append(getDistrictNo());
		sb.append(", districtName=");
		sb.append(getDistrictName());
		sb.append(", wardNo=");
		sb.append(getWardNo());
		sb.append(", wardName=");
		sb.append(getWardName());
		sb.append(", gpsPosition=");
		sb.append(getGpsPosition());
		sb.append(", telNo=");
		sb.append(getTelNo());
		sb.append(", fax=");
		sb.append(getFax());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", website=");
		sb.append(getWebsite());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(73);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>workingUnitId</column-name><column-value><![CDATA[");
		sb.append(getWorkingUnitId());
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
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organizationId</column-name><column-value><![CDATA[");
		sb.append(getOrganizationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>govAgentId</column-name><column-value><![CDATA[");
		sb.append(getGovAgentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>enname</column-name><column-value><![CDATA[");
		sb.append(getEnname());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isRoot</column-name><column-value><![CDATA[");
		sb.append(getIsRoot());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parentWorkingUnitId</column-name><column-value><![CDATA[");
		sb.append(getParentWorkingUnitId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address</column-name><column-value><![CDATA[");
		sb.append(getAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cityNo</column-name><column-value><![CDATA[");
		sb.append(getCityNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cityName</column-name><column-value><![CDATA[");
		sb.append(getCityName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>districtNo</column-name><column-value><![CDATA[");
		sb.append(getDistrictNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>districtName</column-name><column-value><![CDATA[");
		sb.append(getDistrictName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wardNo</column-name><column-value><![CDATA[");
		sb.append(getWardNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wardName</column-name><column-value><![CDATA[");
		sb.append(getWardName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gpsPosition</column-name><column-value><![CDATA[");
		sb.append(getGpsPosition());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>telNo</column-name><column-value><![CDATA[");
		sb.append(getTelNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fax</column-name><column-value><![CDATA[");
		sb.append(getFax());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>website</column-name><column-value><![CDATA[");
		sb.append(getWebsite());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _workingUnitId;
	private long _userId;
	private String _userUuid;
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
	private BaseModel<?> _oepUserMgtWorkingUnitRemoteModel;
}