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
import vn.dtt.duongbien.dao.vrcb.service.TempPassengerDetailsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class TempPassengerDetailsClp extends BaseModelImpl<TempPassengerDetails>
	implements TempPassengerDetails {
	public TempPassengerDetailsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TempPassengerDetails.class;
	}

	@Override
	public String getModelClassName() {
		return TempPassengerDetails.class.getName();
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
		attributes.put("passengerCode", getPassengerCode());
		attributes.put("familyName", getFamilyName());
		attributes.put("givenName", getGivenName());
		attributes.put("nationality", getNationality());
		attributes.put("birthDay", getBirthDay());
		attributes.put("birthPlace", getBirthPlace());
		attributes.put("typeOfIdentity", getTypeOfIdentity());
		attributes.put("passportExpiredDate", getPassportExpiredDate());
		attributes.put("serialNumberOfIdentity", getSerialNumberOfIdentity());
		attributes.put("portOfEmbarkation", getPortOfEmbarkation());
		attributes.put("portOfDisembarkation", getPortOfDisembarkation());
		attributes.put("isTransit", getIsTransit());

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

		String passengerCode = (String)attributes.get("passengerCode");

		if (passengerCode != null) {
			setPassengerCode(passengerCode);
		}

		String familyName = (String)attributes.get("familyName");

		if (familyName != null) {
			setFamilyName(familyName);
		}

		String givenName = (String)attributes.get("givenName");

		if (givenName != null) {
			setGivenName(givenName);
		}

		String nationality = (String)attributes.get("nationality");

		if (nationality != null) {
			setNationality(nationality);
		}

		Date birthDay = (Date)attributes.get("birthDay");

		if (birthDay != null) {
			setBirthDay(birthDay);
		}

		String birthPlace = (String)attributes.get("birthPlace");

		if (birthPlace != null) {
			setBirthPlace(birthPlace);
		}

		String typeOfIdentity = (String)attributes.get("typeOfIdentity");

		if (typeOfIdentity != null) {
			setTypeOfIdentity(typeOfIdentity);
		}

		Date passportExpiredDate = (Date)attributes.get("passportExpiredDate");

		if (passportExpiredDate != null) {
			setPassportExpiredDate(passportExpiredDate);
		}

		String serialNumberOfIdentity = (String)attributes.get(
				"serialNumberOfIdentity");

		if (serialNumberOfIdentity != null) {
			setSerialNumberOfIdentity(serialNumberOfIdentity);
		}

		String portOfEmbarkation = (String)attributes.get("portOfEmbarkation");

		if (portOfEmbarkation != null) {
			setPortOfEmbarkation(portOfEmbarkation);
		}

		String portOfDisembarkation = (String)attributes.get(
				"portOfDisembarkation");

		if (portOfDisembarkation != null) {
			setPortOfDisembarkation(portOfDisembarkation);
		}

		Integer isTransit = (Integer)attributes.get("isTransit");

		if (isTransit != null) {
			setIsTransit(isTransit);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tempPassengerDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _tempPassengerDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tempPassengerDetailsRemoteModel, id);
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

		if (_tempPassengerDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _tempPassengerDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestCode", String.class);

				method.invoke(_tempPassengerDetailsRemoteModel, requestCode);
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

		if (_tempPassengerDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _tempPassengerDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPassengerCode", String.class);

				method.invoke(_tempPassengerDetailsRemoteModel, passengerCode);
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

		if (_tempPassengerDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _tempPassengerDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setFamilyName", String.class);

				method.invoke(_tempPassengerDetailsRemoteModel, familyName);
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

		if (_tempPassengerDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _tempPassengerDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setGivenName", String.class);

				method.invoke(_tempPassengerDetailsRemoteModel, givenName);
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

		if (_tempPassengerDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _tempPassengerDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setNationality", String.class);

				method.invoke(_tempPassengerDetailsRemoteModel, nationality);
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

		if (_tempPassengerDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _tempPassengerDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setBirthDay", Date.class);

				method.invoke(_tempPassengerDetailsRemoteModel, birthDay);
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

		if (_tempPassengerDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _tempPassengerDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setBirthPlace", String.class);

				method.invoke(_tempPassengerDetailsRemoteModel, birthPlace);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTypeOfIdentity() {
		return _typeOfIdentity;
	}

	@Override
	public void setTypeOfIdentity(String typeOfIdentity) {
		_typeOfIdentity = typeOfIdentity;

		if (_tempPassengerDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _tempPassengerDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setTypeOfIdentity",
						String.class);

				method.invoke(_tempPassengerDetailsRemoteModel, typeOfIdentity);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getPassportExpiredDate() {
		return _passportExpiredDate;
	}

	@Override
	public void setPassportExpiredDate(Date passportExpiredDate) {
		_passportExpiredDate = passportExpiredDate;

		if (_tempPassengerDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _tempPassengerDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPassportExpiredDate",
						Date.class);

				method.invoke(_tempPassengerDetailsRemoteModel,
					passportExpiredDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSerialNumberOfIdentity() {
		return _serialNumberOfIdentity;
	}

	@Override
	public void setSerialNumberOfIdentity(String serialNumberOfIdentity) {
		_serialNumberOfIdentity = serialNumberOfIdentity;

		if (_tempPassengerDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _tempPassengerDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setSerialNumberOfIdentity",
						String.class);

				method.invoke(_tempPassengerDetailsRemoteModel,
					serialNumberOfIdentity);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPortOfEmbarkation() {
		return _portOfEmbarkation;
	}

	@Override
	public void setPortOfEmbarkation(String portOfEmbarkation) {
		_portOfEmbarkation = portOfEmbarkation;

		if (_tempPassengerDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _tempPassengerDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPortOfEmbarkation",
						String.class);

				method.invoke(_tempPassengerDetailsRemoteModel,
					portOfEmbarkation);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPortOfDisembarkation() {
		return _portOfDisembarkation;
	}

	@Override
	public void setPortOfDisembarkation(String portOfDisembarkation) {
		_portOfDisembarkation = portOfDisembarkation;

		if (_tempPassengerDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _tempPassengerDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPortOfDisembarkation",
						String.class);

				method.invoke(_tempPassengerDetailsRemoteModel,
					portOfDisembarkation);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIsTransit() {
		return _isTransit;
	}

	@Override
	public void setIsTransit(int isTransit) {
		_isTransit = isTransit;

		if (_tempPassengerDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _tempPassengerDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setIsTransit", int.class);

				method.invoke(_tempPassengerDetailsRemoteModel, isTransit);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTempPassengerDetailsRemoteModel() {
		return _tempPassengerDetailsRemoteModel;
	}

	public void setTempPassengerDetailsRemoteModel(
		BaseModel<?> tempPassengerDetailsRemoteModel) {
		_tempPassengerDetailsRemoteModel = tempPassengerDetailsRemoteModel;
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

		Class<?> remoteModelClass = _tempPassengerDetailsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tempPassengerDetailsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TempPassengerDetailsLocalServiceUtil.addTempPassengerDetails(this);
		}
		else {
			TempPassengerDetailsLocalServiceUtil.updateTempPassengerDetails(this);
		}
	}

	@Override
	public TempPassengerDetails toEscapedModel() {
		return (TempPassengerDetails)ProxyUtil.newProxyInstance(TempPassengerDetails.class.getClassLoader(),
			new Class[] { TempPassengerDetails.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempPassengerDetailsClp clone = new TempPassengerDetailsClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setPassengerCode(getPassengerCode());
		clone.setFamilyName(getFamilyName());
		clone.setGivenName(getGivenName());
		clone.setNationality(getNationality());
		clone.setBirthDay(getBirthDay());
		clone.setBirthPlace(getBirthPlace());
		clone.setTypeOfIdentity(getTypeOfIdentity());
		clone.setPassportExpiredDate(getPassportExpiredDate());
		clone.setSerialNumberOfIdentity(getSerialNumberOfIdentity());
		clone.setPortOfEmbarkation(getPortOfEmbarkation());
		clone.setPortOfDisembarkation(getPortOfDisembarkation());
		clone.setIsTransit(getIsTransit());

		return clone;
	}

	@Override
	public int compareTo(TempPassengerDetails tempPassengerDetails) {
		int value = 0;

		if (getId() < tempPassengerDetails.getId()) {
			value = -1;
		}
		else if (getId() > tempPassengerDetails.getId()) {
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

		if (!(obj instanceof TempPassengerDetailsClp)) {
			return false;
		}

		TempPassengerDetailsClp tempPassengerDetails = (TempPassengerDetailsClp)obj;

		long primaryKey = tempPassengerDetails.getPrimaryKey();

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
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", passengerCode=");
		sb.append(getPassengerCode());
		sb.append(", familyName=");
		sb.append(getFamilyName());
		sb.append(", givenName=");
		sb.append(getGivenName());
		sb.append(", nationality=");
		sb.append(getNationality());
		sb.append(", birthDay=");
		sb.append(getBirthDay());
		sb.append(", birthPlace=");
		sb.append(getBirthPlace());
		sb.append(", typeOfIdentity=");
		sb.append(getTypeOfIdentity());
		sb.append(", passportExpiredDate=");
		sb.append(getPassportExpiredDate());
		sb.append(", serialNumberOfIdentity=");
		sb.append(getSerialNumberOfIdentity());
		sb.append(", portOfEmbarkation=");
		sb.append(getPortOfEmbarkation());
		sb.append(", portOfDisembarkation=");
		sb.append(getPortOfDisembarkation());
		sb.append(", isTransit=");
		sb.append(getIsTransit());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.TempPassengerDetails");
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
			"<column><column-name>passengerCode</column-name><column-value><![CDATA[");
		sb.append(getPassengerCode());
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
			"<column><column-name>nationality</column-name><column-value><![CDATA[");
		sb.append(getNationality());
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
			"<column><column-name>typeOfIdentity</column-name><column-value><![CDATA[");
		sb.append(getTypeOfIdentity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>passportExpiredDate</column-name><column-value><![CDATA[");
		sb.append(getPassportExpiredDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serialNumberOfIdentity</column-name><column-value><![CDATA[");
		sb.append(getSerialNumberOfIdentity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portOfEmbarkation</column-name><column-value><![CDATA[");
		sb.append(getPortOfEmbarkation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portOfDisembarkation</column-name><column-value><![CDATA[");
		sb.append(getPortOfDisembarkation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isTransit</column-name><column-value><![CDATA[");
		sb.append(getIsTransit());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private String _passengerCode;
	private String _familyName;
	private String _givenName;
	private String _nationality;
	private Date _birthDay;
	private String _birthPlace;
	private String _typeOfIdentity;
	private Date _passportExpiredDate;
	private String _serialNumberOfIdentity;
	private String _portOfEmbarkation;
	private String _portOfDisembarkation;
	private int _isTransit;
	private BaseModel<?> _tempPassengerDetailsRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.class;
}