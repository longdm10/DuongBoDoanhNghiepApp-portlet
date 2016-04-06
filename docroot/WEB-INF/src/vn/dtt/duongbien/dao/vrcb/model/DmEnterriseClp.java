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

package vn.dtt.duongbien.dao.vrcb.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbien.dao.vrcb.service.ClpSerializer;
import vn.dtt.duongbien.dao.vrcb.service.DmEnterriseLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class DmEnterriseClp extends BaseModelImpl<DmEnterrise>
	implements DmEnterrise {
	public DmEnterriseClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DmEnterrise.class;
	}

	@Override
	public String getModelClassName() {
		return DmEnterrise.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("enterpriseCode", getEnterpriseCode());
		attributes.put("enterpriseTaxCode", getEnterpriseTaxCode());
		attributes.put("enterpriseName", getEnterpriseName());
		attributes.put("enterpriseShortName", getEnterpriseShortName());
		attributes.put("enterpriseForeignName", getEnterpriseForeignName());
		attributes.put("enterprisePerson", getEnterprisePerson());
		attributes.put("enterpriseHOAddress", getEnterpriseHOAddress());
		attributes.put("stateCode", getStateCode());
		attributes.put("cityCode", getCityCode());
		attributes.put("districtCode", getDistrictCode());
		attributes.put("wardCode", getWardCode());
		attributes.put("telephoneNo", getTelephoneNo());
		attributes.put("registrationCode", getRegistrationCode());
		attributes.put("registrationAddress", getRegistrationAddress());
		attributes.put("registrationDate", getRegistrationDate());
		attributes.put("isDelete", getIsDelete());
		attributes.put("markedAsDelete", getMarkedAsDelete());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("requestedDate", getRequestedDate());
		attributes.put("syncVersion", getSyncVersion());
		attributes.put("modifiedUser", getModifiedUser());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String enterpriseCode = (String)attributes.get("enterpriseCode");

		if (enterpriseCode != null) {
			setEnterpriseCode(enterpriseCode);
		}

		String enterpriseTaxCode = (String)attributes.get("enterpriseTaxCode");

		if (enterpriseTaxCode != null) {
			setEnterpriseTaxCode(enterpriseTaxCode);
		}

		String enterpriseName = (String)attributes.get("enterpriseName");

		if (enterpriseName != null) {
			setEnterpriseName(enterpriseName);
		}

		String enterpriseShortName = (String)attributes.get(
				"enterpriseShortName");

		if (enterpriseShortName != null) {
			setEnterpriseShortName(enterpriseShortName);
		}

		String enterpriseForeignName = (String)attributes.get(
				"enterpriseForeignName");

		if (enterpriseForeignName != null) {
			setEnterpriseForeignName(enterpriseForeignName);
		}

		String enterprisePerson = (String)attributes.get("enterprisePerson");

		if (enterprisePerson != null) {
			setEnterprisePerson(enterprisePerson);
		}

		String enterpriseHOAddress = (String)attributes.get(
				"enterpriseHOAddress");

		if (enterpriseHOAddress != null) {
			setEnterpriseHOAddress(enterpriseHOAddress);
		}

		String stateCode = (String)attributes.get("stateCode");

		if (stateCode != null) {
			setStateCode(stateCode);
		}

		String cityCode = (String)attributes.get("cityCode");

		if (cityCode != null) {
			setCityCode(cityCode);
		}

		String districtCode = (String)attributes.get("districtCode");

		if (districtCode != null) {
			setDistrictCode(districtCode);
		}

		String wardCode = (String)attributes.get("wardCode");

		if (wardCode != null) {
			setWardCode(wardCode);
		}

		String telephoneNo = (String)attributes.get("telephoneNo");

		if (telephoneNo != null) {
			setTelephoneNo(telephoneNo);
		}

		String registrationCode = (String)attributes.get("registrationCode");

		if (registrationCode != null) {
			setRegistrationCode(registrationCode);
		}

		String registrationAddress = (String)attributes.get(
				"registrationAddress");

		if (registrationAddress != null) {
			setRegistrationAddress(registrationAddress);
		}

		Date registrationDate = (Date)attributes.get("registrationDate");

		if (registrationDate != null) {
			setRegistrationDate(registrationDate);
		}

		Integer isDelete = (Integer)attributes.get("isDelete");

		if (isDelete != null) {
			setIsDelete(isDelete);
		}

		Integer markedAsDelete = (Integer)attributes.get("markedAsDelete");

		if (markedAsDelete != null) {
			setMarkedAsDelete(markedAsDelete);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Date requestedDate = (Date)attributes.get("requestedDate");

		if (requestedDate != null) {
			setRequestedDate(requestedDate);
		}

		String syncVersion = (String)attributes.get("syncVersion");

		if (syncVersion != null) {
			setSyncVersion(syncVersion);
		}

		String modifiedUser = (String)attributes.get("modifiedUser");

		if (modifiedUser != null) {
			setModifiedUser(modifiedUser);
		}
	}

	@Override
	public int getId() {
		return _id;
	}

	@Override
	public void setId(int id) {
		_id = id;

		if (_dmEnterriseRemoteModel != null) {
			try {
				Class<?> clazz = _dmEnterriseRemoteModel.getClass();

				Method method = clazz.getMethod("setId", int.class);

				method.invoke(_dmEnterriseRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEnterpriseCode() {
		return _enterpriseCode;
	}

	@Override
	public void setEnterpriseCode(String enterpriseCode) {
		_enterpriseCode = enterpriseCode;

		if (_dmEnterriseRemoteModel != null) {
			try {
				Class<?> clazz = _dmEnterriseRemoteModel.getClass();

				Method method = clazz.getMethod("setEnterpriseCode",
						String.class);

				method.invoke(_dmEnterriseRemoteModel, enterpriseCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEnterpriseTaxCode() {
		return _enterpriseTaxCode;
	}

	@Override
	public void setEnterpriseTaxCode(String enterpriseTaxCode) {
		_enterpriseTaxCode = enterpriseTaxCode;

		if (_dmEnterriseRemoteModel != null) {
			try {
				Class<?> clazz = _dmEnterriseRemoteModel.getClass();

				Method method = clazz.getMethod("setEnterpriseTaxCode",
						String.class);

				method.invoke(_dmEnterriseRemoteModel, enterpriseTaxCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEnterpriseName() {
		return _enterpriseName;
	}

	@Override
	public void setEnterpriseName(String enterpriseName) {
		_enterpriseName = enterpriseName;

		if (_dmEnterriseRemoteModel != null) {
			try {
				Class<?> clazz = _dmEnterriseRemoteModel.getClass();

				Method method = clazz.getMethod("setEnterpriseName",
						String.class);

				method.invoke(_dmEnterriseRemoteModel, enterpriseName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEnterpriseShortName() {
		return _enterpriseShortName;
	}

	@Override
	public void setEnterpriseShortName(String enterpriseShortName) {
		_enterpriseShortName = enterpriseShortName;

		if (_dmEnterriseRemoteModel != null) {
			try {
				Class<?> clazz = _dmEnterriseRemoteModel.getClass();

				Method method = clazz.getMethod("setEnterpriseShortName",
						String.class);

				method.invoke(_dmEnterriseRemoteModel, enterpriseShortName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEnterpriseForeignName() {
		return _enterpriseForeignName;
	}

	@Override
	public void setEnterpriseForeignName(String enterpriseForeignName) {
		_enterpriseForeignName = enterpriseForeignName;

		if (_dmEnterriseRemoteModel != null) {
			try {
				Class<?> clazz = _dmEnterriseRemoteModel.getClass();

				Method method = clazz.getMethod("setEnterpriseForeignName",
						String.class);

				method.invoke(_dmEnterriseRemoteModel, enterpriseForeignName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEnterprisePerson() {
		return _enterprisePerson;
	}

	@Override
	public void setEnterprisePerson(String enterprisePerson) {
		_enterprisePerson = enterprisePerson;

		if (_dmEnterriseRemoteModel != null) {
			try {
				Class<?> clazz = _dmEnterriseRemoteModel.getClass();

				Method method = clazz.getMethod("setEnterprisePerson",
						String.class);

				method.invoke(_dmEnterriseRemoteModel, enterprisePerson);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEnterpriseHOAddress() {
		return _enterpriseHOAddress;
	}

	@Override
	public void setEnterpriseHOAddress(String enterpriseHOAddress) {
		_enterpriseHOAddress = enterpriseHOAddress;

		if (_dmEnterriseRemoteModel != null) {
			try {
				Class<?> clazz = _dmEnterriseRemoteModel.getClass();

				Method method = clazz.getMethod("setEnterpriseHOAddress",
						String.class);

				method.invoke(_dmEnterriseRemoteModel, enterpriseHOAddress);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStateCode() {
		return _stateCode;
	}

	@Override
	public void setStateCode(String stateCode) {
		_stateCode = stateCode;

		if (_dmEnterriseRemoteModel != null) {
			try {
				Class<?> clazz = _dmEnterriseRemoteModel.getClass();

				Method method = clazz.getMethod("setStateCode", String.class);

				method.invoke(_dmEnterriseRemoteModel, stateCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCityCode() {
		return _cityCode;
	}

	@Override
	public void setCityCode(String cityCode) {
		_cityCode = cityCode;

		if (_dmEnterriseRemoteModel != null) {
			try {
				Class<?> clazz = _dmEnterriseRemoteModel.getClass();

				Method method = clazz.getMethod("setCityCode", String.class);

				method.invoke(_dmEnterriseRemoteModel, cityCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDistrictCode() {
		return _districtCode;
	}

	@Override
	public void setDistrictCode(String districtCode) {
		_districtCode = districtCode;

		if (_dmEnterriseRemoteModel != null) {
			try {
				Class<?> clazz = _dmEnterriseRemoteModel.getClass();

				Method method = clazz.getMethod("setDistrictCode", String.class);

				method.invoke(_dmEnterriseRemoteModel, districtCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getWardCode() {
		return _wardCode;
	}

	@Override
	public void setWardCode(String wardCode) {
		_wardCode = wardCode;

		if (_dmEnterriseRemoteModel != null) {
			try {
				Class<?> clazz = _dmEnterriseRemoteModel.getClass();

				Method method = clazz.getMethod("setWardCode", String.class);

				method.invoke(_dmEnterriseRemoteModel, wardCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTelephoneNo() {
		return _telephoneNo;
	}

	@Override
	public void setTelephoneNo(String telephoneNo) {
		_telephoneNo = telephoneNo;

		if (_dmEnterriseRemoteModel != null) {
			try {
				Class<?> clazz = _dmEnterriseRemoteModel.getClass();

				Method method = clazz.getMethod("setTelephoneNo", String.class);

				method.invoke(_dmEnterriseRemoteModel, telephoneNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRegistrationCode() {
		return _registrationCode;
	}

	@Override
	public void setRegistrationCode(String registrationCode) {
		_registrationCode = registrationCode;

		if (_dmEnterriseRemoteModel != null) {
			try {
				Class<?> clazz = _dmEnterriseRemoteModel.getClass();

				Method method = clazz.getMethod("setRegistrationCode",
						String.class);

				method.invoke(_dmEnterriseRemoteModel, registrationCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRegistrationAddress() {
		return _registrationAddress;
	}

	@Override
	public void setRegistrationAddress(String registrationAddress) {
		_registrationAddress = registrationAddress;

		if (_dmEnterriseRemoteModel != null) {
			try {
				Class<?> clazz = _dmEnterriseRemoteModel.getClass();

				Method method = clazz.getMethod("setRegistrationAddress",
						String.class);

				method.invoke(_dmEnterriseRemoteModel, registrationAddress);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getRegistrationDate() {
		return _registrationDate;
	}

	@Override
	public void setRegistrationDate(Date registrationDate) {
		_registrationDate = registrationDate;

		if (_dmEnterriseRemoteModel != null) {
			try {
				Class<?> clazz = _dmEnterriseRemoteModel.getClass();

				Method method = clazz.getMethod("setRegistrationDate",
						Date.class);

				method.invoke(_dmEnterriseRemoteModel, registrationDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIsDelete() {
		return _isDelete;
	}

	@Override
	public void setIsDelete(int isDelete) {
		_isDelete = isDelete;

		if (_dmEnterriseRemoteModel != null) {
			try {
				Class<?> clazz = _dmEnterriseRemoteModel.getClass();

				Method method = clazz.getMethod("setIsDelete", int.class);

				method.invoke(_dmEnterriseRemoteModel, isDelete);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMarkedAsDelete() {
		return _markedAsDelete;
	}

	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_markedAsDelete = markedAsDelete;

		if (_dmEnterriseRemoteModel != null) {
			try {
				Class<?> clazz = _dmEnterriseRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkedAsDelete", int.class);

				method.invoke(_dmEnterriseRemoteModel, markedAsDelete);
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

		if (_dmEnterriseRemoteModel != null) {
			try {
				Class<?> clazz = _dmEnterriseRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_dmEnterriseRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getRequestedDate() {
		return _requestedDate;
	}

	@Override
	public void setRequestedDate(Date requestedDate) {
		_requestedDate = requestedDate;

		if (_dmEnterriseRemoteModel != null) {
			try {
				Class<?> clazz = _dmEnterriseRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestedDate", Date.class);

				method.invoke(_dmEnterriseRemoteModel, requestedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSyncVersion() {
		return _syncVersion;
	}

	@Override
	public void setSyncVersion(String syncVersion) {
		_syncVersion = syncVersion;

		if (_dmEnterriseRemoteModel != null) {
			try {
				Class<?> clazz = _dmEnterriseRemoteModel.getClass();

				Method method = clazz.getMethod("setSyncVersion", String.class);

				method.invoke(_dmEnterriseRemoteModel, syncVersion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getModifiedUser() {
		return _modifiedUser;
	}

	@Override
	public void setModifiedUser(String modifiedUser) {
		_modifiedUser = modifiedUser;

		if (_dmEnterriseRemoteModel != null) {
			try {
				Class<?> clazz = _dmEnterriseRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedUser", String.class);

				method.invoke(_dmEnterriseRemoteModel, modifiedUser);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDmEnterriseRemoteModel() {
		return _dmEnterriseRemoteModel;
	}

	public void setDmEnterriseRemoteModel(BaseModel<?> dmEnterriseRemoteModel) {
		_dmEnterriseRemoteModel = dmEnterriseRemoteModel;
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

		Class<?> remoteModelClass = _dmEnterriseRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dmEnterriseRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DmEnterriseLocalServiceUtil.addDmEnterrise(this);
		}
		else {
			DmEnterriseLocalServiceUtil.updateDmEnterrise(this);
		}
	}

	@Override
	public DmEnterrise toEscapedModel() {
		return (DmEnterrise)ProxyUtil.newProxyInstance(DmEnterrise.class.getClassLoader(),
			new Class[] { DmEnterrise.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmEnterriseClp clone = new DmEnterriseClp();

		clone.setId(getId());
		clone.setEnterpriseCode(getEnterpriseCode());
		clone.setEnterpriseTaxCode(getEnterpriseTaxCode());
		clone.setEnterpriseName(getEnterpriseName());
		clone.setEnterpriseShortName(getEnterpriseShortName());
		clone.setEnterpriseForeignName(getEnterpriseForeignName());
		clone.setEnterprisePerson(getEnterprisePerson());
		clone.setEnterpriseHOAddress(getEnterpriseHOAddress());
		clone.setStateCode(getStateCode());
		clone.setCityCode(getCityCode());
		clone.setDistrictCode(getDistrictCode());
		clone.setWardCode(getWardCode());
		clone.setTelephoneNo(getTelephoneNo());
		clone.setRegistrationCode(getRegistrationCode());
		clone.setRegistrationAddress(getRegistrationAddress());
		clone.setRegistrationDate(getRegistrationDate());
		clone.setIsDelete(getIsDelete());
		clone.setMarkedAsDelete(getMarkedAsDelete());
		clone.setModifiedDate(getModifiedDate());
		clone.setRequestedDate(getRequestedDate());
		clone.setSyncVersion(getSyncVersion());
		clone.setModifiedUser(getModifiedUser());

		return clone;
	}

	@Override
	public int compareTo(DmEnterrise dmEnterrise) {
		int value = 0;

		if (getId() < dmEnterrise.getId()) {
			value = -1;
		}
		else if (getId() > dmEnterrise.getId()) {
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

		if (!(obj instanceof DmEnterriseClp)) {
			return false;
		}

		DmEnterriseClp dmEnterrise = (DmEnterriseClp)obj;

		int primaryKey = dmEnterrise.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(45);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", enterpriseCode=");
		sb.append(getEnterpriseCode());
		sb.append(", enterpriseTaxCode=");
		sb.append(getEnterpriseTaxCode());
		sb.append(", enterpriseName=");
		sb.append(getEnterpriseName());
		sb.append(", enterpriseShortName=");
		sb.append(getEnterpriseShortName());
		sb.append(", enterpriseForeignName=");
		sb.append(getEnterpriseForeignName());
		sb.append(", enterprisePerson=");
		sb.append(getEnterprisePerson());
		sb.append(", enterpriseHOAddress=");
		sb.append(getEnterpriseHOAddress());
		sb.append(", stateCode=");
		sb.append(getStateCode());
		sb.append(", cityCode=");
		sb.append(getCityCode());
		sb.append(", districtCode=");
		sb.append(getDistrictCode());
		sb.append(", wardCode=");
		sb.append(getWardCode());
		sb.append(", telephoneNo=");
		sb.append(getTelephoneNo());
		sb.append(", registrationCode=");
		sb.append(getRegistrationCode());
		sb.append(", registrationAddress=");
		sb.append(getRegistrationAddress());
		sb.append(", registrationDate=");
		sb.append(getRegistrationDate());
		sb.append(", isDelete=");
		sb.append(getIsDelete());
		sb.append(", markedAsDelete=");
		sb.append(getMarkedAsDelete());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", requestedDate=");
		sb.append(getRequestedDate());
		sb.append(", syncVersion=");
		sb.append(getSyncVersion());
		sb.append(", modifiedUser=");
		sb.append(getModifiedUser());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(70);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DmEnterrise");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>enterpriseCode</column-name><column-value><![CDATA[");
		sb.append(getEnterpriseCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>enterpriseTaxCode</column-name><column-value><![CDATA[");
		sb.append(getEnterpriseTaxCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>enterpriseName</column-name><column-value><![CDATA[");
		sb.append(getEnterpriseName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>enterpriseShortName</column-name><column-value><![CDATA[");
		sb.append(getEnterpriseShortName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>enterpriseForeignName</column-name><column-value><![CDATA[");
		sb.append(getEnterpriseForeignName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>enterprisePerson</column-name><column-value><![CDATA[");
		sb.append(getEnterprisePerson());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>enterpriseHOAddress</column-name><column-value><![CDATA[");
		sb.append(getEnterpriseHOAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stateCode</column-name><column-value><![CDATA[");
		sb.append(getStateCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cityCode</column-name><column-value><![CDATA[");
		sb.append(getCityCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>districtCode</column-name><column-value><![CDATA[");
		sb.append(getDistrictCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wardCode</column-name><column-value><![CDATA[");
		sb.append(getWardCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>telephoneNo</column-name><column-value><![CDATA[");
		sb.append(getTelephoneNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registrationCode</column-name><column-value><![CDATA[");
		sb.append(getRegistrationCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registrationAddress</column-name><column-value><![CDATA[");
		sb.append(getRegistrationAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registrationDate</column-name><column-value><![CDATA[");
		sb.append(getRegistrationDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isDelete</column-name><column-value><![CDATA[");
		sb.append(getIsDelete());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markedAsDelete</column-name><column-value><![CDATA[");
		sb.append(getMarkedAsDelete());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestedDate</column-name><column-value><![CDATA[");
		sb.append(getRequestedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>syncVersion</column-name><column-value><![CDATA[");
		sb.append(getSyncVersion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedUser</column-name><column-value><![CDATA[");
		sb.append(getModifiedUser());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _id;
	private String _enterpriseCode;
	private String _enterpriseTaxCode;
	private String _enterpriseName;
	private String _enterpriseShortName;
	private String _enterpriseForeignName;
	private String _enterprisePerson;
	private String _enterpriseHOAddress;
	private String _stateCode;
	private String _cityCode;
	private String _districtCode;
	private String _wardCode;
	private String _telephoneNo;
	private String _registrationCode;
	private String _registrationAddress;
	private Date _registrationDate;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private String _modifiedUser;
	private BaseModel<?> _dmEnterriseRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.class;
}