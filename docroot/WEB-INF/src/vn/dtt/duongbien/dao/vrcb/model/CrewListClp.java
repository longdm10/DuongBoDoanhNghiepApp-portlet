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
import vn.dtt.duongbien.dao.vrcb.service.CrewListLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class CrewListClp extends BaseModelImpl<CrewList> implements CrewList {
	public CrewListClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return CrewList.class;
	}

	@Override
	public String getModelClassName() {
		return CrewList.class.getName();
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
		attributes.put("crewCode", getCrewCode());
		attributes.put("documentNo", getDocumentNo());
		attributes.put("stateCode", getStateCode());
		attributes.put("birthDay", getBirthDay());
		attributes.put("birthPlace", getBirthPlace());
		attributes.put("familyName", getFamilyName());
		attributes.put("fullName", getFullName());
		attributes.put("givenName", getGivenName());
		attributes.put("passportNumber", getPassportNumber());
		attributes.put("passportType", getPassportType());
		attributes.put("rankCode", getRankCode());
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

		String crewCode = (String)attributes.get("crewCode");

		if (crewCode != null) {
			setCrewCode(crewCode);
		}

		String documentNo = (String)attributes.get("documentNo");

		if (documentNo != null) {
			setDocumentNo(documentNo);
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

		String familyName = (String)attributes.get("familyName");

		if (familyName != null) {
			setFamilyName(familyName);
		}

		String fullName = (String)attributes.get("fullName");

		if (fullName != null) {
			setFullName(fullName);
		}

		String givenName = (String)attributes.get("givenName");

		if (givenName != null) {
			setGivenName(givenName);
		}

		String passportNumber = (String)attributes.get("passportNumber");

		if (passportNumber != null) {
			setPassportNumber(passportNumber);
		}

		String passportType = (String)attributes.get("passportType");

		if (passportType != null) {
			setPassportType(passportType);
		}

		String rankCode = (String)attributes.get("rankCode");

		if (rankCode != null) {
			setRankCode(rankCode);
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

		if (_crewListRemoteModel != null) {
			try {
				Class<?> clazz = _crewListRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_crewListRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCrewCode() {
		return _crewCode;
	}

	@Override
	public void setCrewCode(String crewCode) {
		_crewCode = crewCode;

		if (_crewListRemoteModel != null) {
			try {
				Class<?> clazz = _crewListRemoteModel.getClass();

				Method method = clazz.getMethod("setCrewCode", String.class);

				method.invoke(_crewListRemoteModel, crewCode);
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

		if (_crewListRemoteModel != null) {
			try {
				Class<?> clazz = _crewListRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentNo", String.class);

				method.invoke(_crewListRemoteModel, documentNo);
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

		if (_crewListRemoteModel != null) {
			try {
				Class<?> clazz = _crewListRemoteModel.getClass();

				Method method = clazz.getMethod("setStateCode", String.class);

				method.invoke(_crewListRemoteModel, stateCode);
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

		if (_crewListRemoteModel != null) {
			try {
				Class<?> clazz = _crewListRemoteModel.getClass();

				Method method = clazz.getMethod("setBirthDay", Date.class);

				method.invoke(_crewListRemoteModel, birthDay);
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

		if (_crewListRemoteModel != null) {
			try {
				Class<?> clazz = _crewListRemoteModel.getClass();

				Method method = clazz.getMethod("setBirthPlace", String.class);

				method.invoke(_crewListRemoteModel, birthPlace);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFamilyName() {
		return _familyName;
	}

	@Override
	public void setFamilyName(String familyName) {
		_familyName = familyName;

		if (_crewListRemoteModel != null) {
			try {
				Class<?> clazz = _crewListRemoteModel.getClass();

				Method method = clazz.getMethod("setFamilyName", String.class);

				method.invoke(_crewListRemoteModel, familyName);
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

		if (_crewListRemoteModel != null) {
			try {
				Class<?> clazz = _crewListRemoteModel.getClass();

				Method method = clazz.getMethod("setFullName", String.class);

				method.invoke(_crewListRemoteModel, fullName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGivenName() {
		return _givenName;
	}

	@Override
	public void setGivenName(String givenName) {
		_givenName = givenName;

		if (_crewListRemoteModel != null) {
			try {
				Class<?> clazz = _crewListRemoteModel.getClass();

				Method method = clazz.getMethod("setGivenName", String.class);

				method.invoke(_crewListRemoteModel, givenName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPassportNumber() {
		return _passportNumber;
	}

	@Override
	public void setPassportNumber(String passportNumber) {
		_passportNumber = passportNumber;

		if (_crewListRemoteModel != null) {
			try {
				Class<?> clazz = _crewListRemoteModel.getClass();

				Method method = clazz.getMethod("setPassportNumber",
						String.class);

				method.invoke(_crewListRemoteModel, passportNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPassportType() {
		return _passportType;
	}

	@Override
	public void setPassportType(String passportType) {
		_passportType = passportType;

		if (_crewListRemoteModel != null) {
			try {
				Class<?> clazz = _crewListRemoteModel.getClass();

				Method method = clazz.getMethod("setPassportType", String.class);

				method.invoke(_crewListRemoteModel, passportType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRankCode() {
		return _rankCode;
	}

	@Override
	public void setRankCode(String rankCode) {
		_rankCode = rankCode;

		if (_crewListRemoteModel != null) {
			try {
				Class<?> clazz = _crewListRemoteModel.getClass();

				Method method = clazz.getMethod("setRankCode", String.class);

				method.invoke(_crewListRemoteModel, rankCode);
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

		if (_crewListRemoteModel != null) {
			try {
				Class<?> clazz = _crewListRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_crewListRemoteModel, createDate);
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

		if (_crewListRemoteModel != null) {
			try {
				Class<?> clazz = _crewListRemoteModel.getClass();

				Method method = clazz.getMethod("setModifyDate", Date.class);

				method.invoke(_crewListRemoteModel, modifyDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCrewListRemoteModel() {
		return _crewListRemoteModel;
	}

	public void setCrewListRemoteModel(BaseModel<?> crewListRemoteModel) {
		_crewListRemoteModel = crewListRemoteModel;
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

		Class<?> remoteModelClass = _crewListRemoteModel.getClass();

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

		Object returnValue = method.invoke(_crewListRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CrewListLocalServiceUtil.addCrewList(this);
		}
		else {
			CrewListLocalServiceUtil.updateCrewList(this);
		}
	}

	@Override
	public CrewList toEscapedModel() {
		return (CrewList)ProxyUtil.newProxyInstance(CrewList.class.getClassLoader(),
			new Class[] { CrewList.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CrewListClp clone = new CrewListClp();

		clone.setId(getId());
		clone.setCrewCode(getCrewCode());
		clone.setDocumentNo(getDocumentNo());
		clone.setStateCode(getStateCode());
		clone.setBirthDay(getBirthDay());
		clone.setBirthPlace(getBirthPlace());
		clone.setFamilyName(getFamilyName());
		clone.setFullName(getFullName());
		clone.setGivenName(getGivenName());
		clone.setPassportNumber(getPassportNumber());
		clone.setPassportType(getPassportType());
		clone.setRankCode(getRankCode());
		clone.setCreateDate(getCreateDate());
		clone.setModifyDate(getModifyDate());

		return clone;
	}

	@Override
	public int compareTo(CrewList crewList) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), crewList.getCreateDate());

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

		if (!(obj instanceof CrewListClp)) {
			return false;
		}

		CrewListClp crewList = (CrewListClp)obj;

		long primaryKey = crewList.getPrimaryKey();

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
		StringBundler sb = new StringBundler(29);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", crewCode=");
		sb.append(getCrewCode());
		sb.append(", documentNo=");
		sb.append(getDocumentNo());
		sb.append(", stateCode=");
		sb.append(getStateCode());
		sb.append(", birthDay=");
		sb.append(getBirthDay());
		sb.append(", birthPlace=");
		sb.append(getBirthPlace());
		sb.append(", familyName=");
		sb.append(getFamilyName());
		sb.append(", fullName=");
		sb.append(getFullName());
		sb.append(", givenName=");
		sb.append(getGivenName());
		sb.append(", passportNumber=");
		sb.append(getPassportNumber());
		sb.append(", passportType=");
		sb.append(getPassportType());
		sb.append(", rankCode=");
		sb.append(getRankCode());
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
		sb.append("vn.dtt.duongbien.dao.vrcb.model.CrewList");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>crewCode</column-name><column-value><![CDATA[");
		sb.append(getCrewCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentNo</column-name><column-value><![CDATA[");
		sb.append(getDocumentNo());
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
			"<column><column-name>familyName</column-name><column-value><![CDATA[");
		sb.append(getFamilyName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fullName</column-name><column-value><![CDATA[");
		sb.append(getFullName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>givenName</column-name><column-value><![CDATA[");
		sb.append(getGivenName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>passportNumber</column-name><column-value><![CDATA[");
		sb.append(getPassportNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>passportType</column-name><column-value><![CDATA[");
		sb.append(getPassportType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rankCode</column-name><column-value><![CDATA[");
		sb.append(getRankCode());
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
	private String _crewCode;
	private String _documentNo;
	private String _stateCode;
	private Date _birthDay;
	private String _birthPlace;
	private String _familyName;
	private String _fullName;
	private String _givenName;
	private String _passportNumber;
	private String _passportType;
	private String _rankCode;
	private Date _createDate;
	private Date _modifyDate;
	private BaseModel<?> _crewListRemoteModel;
}