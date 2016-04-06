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
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbien.dao.vrcb.service.ClpSerializer;
import vn.dtt.duongbien.dao.vrcb.service.PassengerListLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class PassengerListClp extends BaseModelImpl<PassengerList>
	implements PassengerList {
	public PassengerListClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return PassengerList.class;
	}

	@Override
	public String getModelClassName() {
		return PassengerList.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("passengerCode", getPassengerCode());
		attributes.put("documentNo", getDocumentNo());
		attributes.put("fullName", getFullName());
		attributes.put("stateCode", getStateCode());
		attributes.put("birthDay", getBirthDay());
		attributes.put("birthPlace", getBirthPlace());
		attributes.put("passportTypeCode", getPassportTypeCode());
		attributes.put("passPortNo", getPassPortNo());
		attributes.put("portCheckInCode", getPortCheckInCode());
		attributes.put("portCheckOutCode", getPortCheckOutCode());
		attributes.put("isTransit", getIsTransit());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifyDate", getModifyDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String passengerCode = (String)attributes.get("passengerCode");

		if (passengerCode != null) {
			setPassengerCode(passengerCode);
		}

		String documentNo = (String)attributes.get("documentNo");

		if (documentNo != null) {
			setDocumentNo(documentNo);
		}

		String fullName = (String)attributes.get("fullName");

		if (fullName != null) {
			setFullName(fullName);
		}

		String stateCode = (String)attributes.get("stateCode");

		if (stateCode != null) {
			setStateCode(stateCode);
		}

		Date birthDay = (Date)attributes.get("birthDay");

		if (birthDay != null) {
			setBirthDay(birthDay);
		}

		String birthPlace = (String)attributes.get("birthPlace");

		if (birthPlace != null) {
			setBirthPlace(birthPlace);
		}

		String passportTypeCode = (String)attributes.get("passportTypeCode");

		if (passportTypeCode != null) {
			setPassportTypeCode(passportTypeCode);
		}

		String passPortNo = (String)attributes.get("passPortNo");

		if (passPortNo != null) {
			setPassPortNo(passPortNo);
		}

		String portCheckInCode = (String)attributes.get("portCheckInCode");

		if (portCheckInCode != null) {
			setPortCheckInCode(portCheckInCode);
		}

		String portCheckOutCode = (String)attributes.get("portCheckOutCode");

		if (portCheckOutCode != null) {
			setPortCheckOutCode(portCheckOutCode);
		}

		Boolean isTransit = (Boolean)attributes.get("isTransit");

		if (isTransit != null) {
			setIsTransit(isTransit);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifyDate = (Date)attributes.get("modifyDate");

		if (modifyDate != null) {
			setModifyDate(modifyDate);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_passengerListRemoteModel != null) {
			try {
				Class<?> clazz = _passengerListRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_passengerListRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPassengerCode() {
		return _passengerCode;
	}

	@Override
	public void setPassengerCode(String passengerCode) {
		_passengerCode = passengerCode;

		if (_passengerListRemoteModel != null) {
			try {
				Class<?> clazz = _passengerListRemoteModel.getClass();

				Method method = clazz.getMethod("setPassengerCode", String.class);

				method.invoke(_passengerListRemoteModel, passengerCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDocumentNo() {
		return _documentNo;
	}

	@Override
	public void setDocumentNo(String documentNo) {
		_documentNo = documentNo;

		if (_passengerListRemoteModel != null) {
			try {
				Class<?> clazz = _passengerListRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentNo", String.class);

				method.invoke(_passengerListRemoteModel, documentNo);
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

		if (_passengerListRemoteModel != null) {
			try {
				Class<?> clazz = _passengerListRemoteModel.getClass();

				Method method = clazz.getMethod("setFullName", String.class);

				method.invoke(_passengerListRemoteModel, fullName);
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

		if (_passengerListRemoteModel != null) {
			try {
				Class<?> clazz = _passengerListRemoteModel.getClass();

				Method method = clazz.getMethod("setStateCode", String.class);

				method.invoke(_passengerListRemoteModel, stateCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getBirthDay() {
		return _birthDay;
	}

	@Override
	public void setBirthDay(Date birthDay) {
		_birthDay = birthDay;

		if (_passengerListRemoteModel != null) {
			try {
				Class<?> clazz = _passengerListRemoteModel.getClass();

				Method method = clazz.getMethod("setBirthDay", Date.class);

				method.invoke(_passengerListRemoteModel, birthDay);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBirthPlace() {
		return _birthPlace;
	}

	@Override
	public void setBirthPlace(String birthPlace) {
		_birthPlace = birthPlace;

		if (_passengerListRemoteModel != null) {
			try {
				Class<?> clazz = _passengerListRemoteModel.getClass();

				Method method = clazz.getMethod("setBirthPlace", String.class);

				method.invoke(_passengerListRemoteModel, birthPlace);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPassportTypeCode() {
		return _passportTypeCode;
	}

	@Override
	public void setPassportTypeCode(String passportTypeCode) {
		_passportTypeCode = passportTypeCode;

		if (_passengerListRemoteModel != null) {
			try {
				Class<?> clazz = _passengerListRemoteModel.getClass();

				Method method = clazz.getMethod("setPassportTypeCode",
						String.class);

				method.invoke(_passengerListRemoteModel, passportTypeCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPassPortNo() {
		return _passPortNo;
	}

	@Override
	public void setPassPortNo(String passPortNo) {
		_passPortNo = passPortNo;

		if (_passengerListRemoteModel != null) {
			try {
				Class<?> clazz = _passengerListRemoteModel.getClass();

				Method method = clazz.getMethod("setPassPortNo", String.class);

				method.invoke(_passengerListRemoteModel, passPortNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPortCheckInCode() {
		return _portCheckInCode;
	}

	@Override
	public void setPortCheckInCode(String portCheckInCode) {
		_portCheckInCode = portCheckInCode;

		if (_passengerListRemoteModel != null) {
			try {
				Class<?> clazz = _passengerListRemoteModel.getClass();

				Method method = clazz.getMethod("setPortCheckInCode",
						String.class);

				method.invoke(_passengerListRemoteModel, portCheckInCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPortCheckOutCode() {
		return _portCheckOutCode;
	}

	@Override
	public void setPortCheckOutCode(String portCheckOutCode) {
		_portCheckOutCode = portCheckOutCode;

		if (_passengerListRemoteModel != null) {
			try {
				Class<?> clazz = _passengerListRemoteModel.getClass();

				Method method = clazz.getMethod("setPortCheckOutCode",
						String.class);

				method.invoke(_passengerListRemoteModel, portCheckOutCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getIsTransit() {
		return _isTransit;
	}

	@Override
	public boolean isIsTransit() {
		return _isTransit;
	}

	@Override
	public void setIsTransit(boolean isTransit) {
		_isTransit = isTransit;

		if (_passengerListRemoteModel != null) {
			try {
				Class<?> clazz = _passengerListRemoteModel.getClass();

				Method method = clazz.getMethod("setIsTransit", boolean.class);

				method.invoke(_passengerListRemoteModel, isTransit);
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

		if (_passengerListRemoteModel != null) {
			try {
				Class<?> clazz = _passengerListRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_passengerListRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifyDate() {
		return _modifyDate;
	}

	@Override
	public void setModifyDate(Date modifyDate) {
		_modifyDate = modifyDate;

		if (_passengerListRemoteModel != null) {
			try {
				Class<?> clazz = _passengerListRemoteModel.getClass();

				Method method = clazz.getMethod("setModifyDate", Date.class);

				method.invoke(_passengerListRemoteModel, modifyDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPassengerListRemoteModel() {
		return _passengerListRemoteModel;
	}

	public void setPassengerListRemoteModel(
		BaseModel<?> passengerListRemoteModel) {
		_passengerListRemoteModel = passengerListRemoteModel;
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

		Class<?> remoteModelClass = _passengerListRemoteModel.getClass();

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

		Object returnValue = method.invoke(_passengerListRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PassengerListLocalServiceUtil.addPassengerList(this);
		}
		else {
			PassengerListLocalServiceUtil.updatePassengerList(this);
		}
	}

	@Override
	public PassengerList toEscapedModel() {
		return (PassengerList)ProxyUtil.newProxyInstance(PassengerList.class.getClassLoader(),
			new Class[] { PassengerList.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PassengerListClp clone = new PassengerListClp();

		clone.setId(getId());
		clone.setPassengerCode(getPassengerCode());
		clone.setDocumentNo(getDocumentNo());
		clone.setFullName(getFullName());
		clone.setStateCode(getStateCode());
		clone.setBirthDay(getBirthDay());
		clone.setBirthPlace(getBirthPlace());
		clone.setPassportTypeCode(getPassportTypeCode());
		clone.setPassPortNo(getPassPortNo());
		clone.setPortCheckInCode(getPortCheckInCode());
		clone.setPortCheckOutCode(getPortCheckOutCode());
		clone.setIsTransit(getIsTransit());
		clone.setCreateDate(getCreateDate());
		clone.setModifyDate(getModifyDate());

		return clone;
	}

	@Override
	public int compareTo(PassengerList passengerList) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(),
				passengerList.getCreateDate());

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

		if (!(obj instanceof PassengerListClp)) {
			return false;
		}

		PassengerListClp passengerList = (PassengerListClp)obj;

		long primaryKey = passengerList.getPrimaryKey();

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
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", passengerCode=");
		sb.append(getPassengerCode());
		sb.append(", documentNo=");
		sb.append(getDocumentNo());
		sb.append(", fullName=");
		sb.append(getFullName());
		sb.append(", stateCode=");
		sb.append(getStateCode());
		sb.append(", birthDay=");
		sb.append(getBirthDay());
		sb.append(", birthPlace=");
		sb.append(getBirthPlace());
		sb.append(", passportTypeCode=");
		sb.append(getPassportTypeCode());
		sb.append(", passPortNo=");
		sb.append(getPassPortNo());
		sb.append(", portCheckInCode=");
		sb.append(getPortCheckInCode());
		sb.append(", portCheckOutCode=");
		sb.append(getPortCheckOutCode());
		sb.append(", isTransit=");
		sb.append(getIsTransit());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifyDate=");
		sb.append(getModifyDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.PassengerList");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>passengerCode</column-name><column-value><![CDATA[");
		sb.append(getPassengerCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentNo</column-name><column-value><![CDATA[");
		sb.append(getDocumentNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fullName</column-name><column-value><![CDATA[");
		sb.append(getFullName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stateCode</column-name><column-value><![CDATA[");
		sb.append(getStateCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>birthDay</column-name><column-value><![CDATA[");
		sb.append(getBirthDay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>birthPlace</column-name><column-value><![CDATA[");
		sb.append(getBirthPlace());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>passportTypeCode</column-name><column-value><![CDATA[");
		sb.append(getPassportTypeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>passPortNo</column-name><column-value><![CDATA[");
		sb.append(getPassPortNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portCheckInCode</column-name><column-value><![CDATA[");
		sb.append(getPortCheckInCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portCheckOutCode</column-name><column-value><![CDATA[");
		sb.append(getPortCheckOutCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isTransit</column-name><column-value><![CDATA[");
		sb.append(getIsTransit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifyDate</column-name><column-value><![CDATA[");
		sb.append(getModifyDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _passengerCode;
	private String _documentNo;
	private String _fullName;
	private String _stateCode;
	private Date _birthDay;
	private String _birthPlace;
	private String _passportTypeCode;
	private String _passPortNo;
	private String _portCheckInCode;
	private String _portCheckOutCode;
	private boolean _isTransit;
	private Date _createDate;
	private Date _modifyDate;
	private BaseModel<?> _passengerListRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.class;
}