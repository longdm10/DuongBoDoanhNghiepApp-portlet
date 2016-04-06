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
import vn.dtt.duongbien.dao.vrcb.service.TempCrewDetailsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class TempCrewDetailsClp extends BaseModelImpl<TempCrewDetails>
	implements TempCrewDetails {
	public TempCrewDetailsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TempCrewDetails.class;
	}

	@Override
	public String getModelClassName() {
		return TempCrewDetails.class.getName();
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
		attributes.put("requestCode", getRequestCode());
		attributes.put("crewcode", getCrewcode());
		attributes.put("familyName", getFamilyName());
		attributes.put("givenName", getGivenName());
		attributes.put("rankCode", getRankCode());
		attributes.put("nationality", getNationality());
		attributes.put("dateOfBirth", getDateOfBirth());
		attributes.put("placeOfBirth", getPlaceOfBirth());
		attributes.put("passportNumber", getPassportNumber());
		attributes.put("passportTypeCode", getPassportTypeCode());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String requestCode = (String)attributes.get("requestCode");

		if (requestCode != null) {
			setRequestCode(requestCode);
		}

		String crewcode = (String)attributes.get("crewcode");

		if (crewcode != null) {
			setCrewcode(crewcode);
		}

		String familyName = (String)attributes.get("familyName");

		if (familyName != null) {
			setFamilyName(familyName);
		}

		String givenName = (String)attributes.get("givenName");

		if (givenName != null) {
			setGivenName(givenName);
		}

		String rankCode = (String)attributes.get("rankCode");

		if (rankCode != null) {
			setRankCode(rankCode);
		}

		String nationality = (String)attributes.get("nationality");

		if (nationality != null) {
			setNationality(nationality);
		}

		Date dateOfBirth = (Date)attributes.get("dateOfBirth");

		if (dateOfBirth != null) {
			setDateOfBirth(dateOfBirth);
		}

		String placeOfBirth = (String)attributes.get("placeOfBirth");

		if (placeOfBirth != null) {
			setPlaceOfBirth(placeOfBirth);
		}

		String passportNumber = (String)attributes.get("passportNumber");

		if (passportNumber != null) {
			setPassportNumber(passportNumber);
		}

		String passportTypeCode = (String)attributes.get("passportTypeCode");

		if (passportTypeCode != null) {
			setPassportTypeCode(passportTypeCode);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tempCrewDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _tempCrewDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tempCrewDetailsRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRequestCode() {
		return _requestCode;
	}

	@Override
	public void setRequestCode(String requestCode) {
		_requestCode = requestCode;

		if (_tempCrewDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _tempCrewDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestCode", String.class);

				method.invoke(_tempCrewDetailsRemoteModel, requestCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCrewcode() {
		return _crewcode;
	}

	@Override
	public void setCrewcode(String crewcode) {
		_crewcode = crewcode;

		if (_tempCrewDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _tempCrewDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setCrewcode", String.class);

				method.invoke(_tempCrewDetailsRemoteModel, crewcode);
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

		if (_tempCrewDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _tempCrewDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setFamilyName", String.class);

				method.invoke(_tempCrewDetailsRemoteModel, familyName);
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

		if (_tempCrewDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _tempCrewDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setGivenName", String.class);

				method.invoke(_tempCrewDetailsRemoteModel, givenName);
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

		if (_tempCrewDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _tempCrewDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setRankCode", String.class);

				method.invoke(_tempCrewDetailsRemoteModel, rankCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNationality() {
		return _nationality;
	}

	@Override
	public void setNationality(String nationality) {
		_nationality = nationality;

		if (_tempCrewDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _tempCrewDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setNationality", String.class);

				method.invoke(_tempCrewDetailsRemoteModel, nationality);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDateOfBirth() {
		return _dateOfBirth;
	}

	@Override
	public void setDateOfBirth(Date dateOfBirth) {
		_dateOfBirth = dateOfBirth;

		if (_tempCrewDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _tempCrewDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setDateOfBirth", Date.class);

				method.invoke(_tempCrewDetailsRemoteModel, dateOfBirth);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPlaceOfBirth() {
		return _placeOfBirth;
	}

	@Override
	public void setPlaceOfBirth(String placeOfBirth) {
		_placeOfBirth = placeOfBirth;

		if (_tempCrewDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _tempCrewDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPlaceOfBirth", String.class);

				method.invoke(_tempCrewDetailsRemoteModel, placeOfBirth);
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

		if (_tempCrewDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _tempCrewDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPassportNumber",
						String.class);

				method.invoke(_tempCrewDetailsRemoteModel, passportNumber);
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

		if (_tempCrewDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _tempCrewDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPassportTypeCode",
						String.class);

				method.invoke(_tempCrewDetailsRemoteModel, passportTypeCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTempCrewDetailsRemoteModel() {
		return _tempCrewDetailsRemoteModel;
	}

	public void setTempCrewDetailsRemoteModel(
		BaseModel<?> tempCrewDetailsRemoteModel) {
		_tempCrewDetailsRemoteModel = tempCrewDetailsRemoteModel;
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

		Class<?> remoteModelClass = _tempCrewDetailsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tempCrewDetailsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TempCrewDetailsLocalServiceUtil.addTempCrewDetails(this);
		}
		else {
			TempCrewDetailsLocalServiceUtil.updateTempCrewDetails(this);
		}
	}

	@Override
	public TempCrewDetails toEscapedModel() {
		return (TempCrewDetails)ProxyUtil.newProxyInstance(TempCrewDetails.class.getClassLoader(),
			new Class[] { TempCrewDetails.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempCrewDetailsClp clone = new TempCrewDetailsClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setCrewcode(getCrewcode());
		clone.setFamilyName(getFamilyName());
		clone.setGivenName(getGivenName());
		clone.setRankCode(getRankCode());
		clone.setNationality(getNationality());
		clone.setDateOfBirth(getDateOfBirth());
		clone.setPlaceOfBirth(getPlaceOfBirth());
		clone.setPassportNumber(getPassportNumber());
		clone.setPassportTypeCode(getPassportTypeCode());

		return clone;
	}

	@Override
	public int compareTo(TempCrewDetails tempCrewDetails) {
		int value = 0;

		if (getId() < tempCrewDetails.getId()) {
			value = -1;
		}
		else if (getId() > tempCrewDetails.getId()) {
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

		if (!(obj instanceof TempCrewDetailsClp)) {
			return false;
		}

		TempCrewDetailsClp tempCrewDetails = (TempCrewDetailsClp)obj;

		long primaryKey = tempCrewDetails.getPrimaryKey();

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
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", crewcode=");
		sb.append(getCrewcode());
		sb.append(", familyName=");
		sb.append(getFamilyName());
		sb.append(", givenName=");
		sb.append(getGivenName());
		sb.append(", rankCode=");
		sb.append(getRankCode());
		sb.append(", nationality=");
		sb.append(getNationality());
		sb.append(", dateOfBirth=");
		sb.append(getDateOfBirth());
		sb.append(", placeOfBirth=");
		sb.append(getPlaceOfBirth());
		sb.append(", passportNumber=");
		sb.append(getPassportNumber());
		sb.append(", passportTypeCode=");
		sb.append(getPassportTypeCode());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.TempCrewDetails");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestCode</column-name><column-value><![CDATA[");
		sb.append(getRequestCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>crewcode</column-name><column-value><![CDATA[");
		sb.append(getCrewcode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>familyName</column-name><column-value><![CDATA[");
		sb.append(getFamilyName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>givenName</column-name><column-value><![CDATA[");
		sb.append(getGivenName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rankCode</column-name><column-value><![CDATA[");
		sb.append(getRankCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nationality</column-name><column-value><![CDATA[");
		sb.append(getNationality());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateOfBirth</column-name><column-value><![CDATA[");
		sb.append(getDateOfBirth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>placeOfBirth</column-name><column-value><![CDATA[");
		sb.append(getPlaceOfBirth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>passportNumber</column-name><column-value><![CDATA[");
		sb.append(getPassportNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>passportTypeCode</column-name><column-value><![CDATA[");
		sb.append(getPassportTypeCode());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private String _crewcode;
	private String _familyName;
	private String _givenName;
	private String _rankCode;
	private String _nationality;
	private Date _dateOfBirth;
	private String _placeOfBirth;
	private String _passportNumber;
	private String _passportTypeCode;
	private BaseModel<?> _tempCrewDetailsRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.class;
}