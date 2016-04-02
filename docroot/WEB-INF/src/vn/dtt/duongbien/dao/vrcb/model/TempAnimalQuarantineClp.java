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
import vn.dtt.duongbien.dao.vrcb.service.TempAnimalQuarantineLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class TempAnimalQuarantineClp extends BaseModelImpl<TempAnimalQuarantine>
	implements TempAnimalQuarantine {
	public TempAnimalQuarantineClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TempAnimalQuarantine.class;
	}

	@Override
	public String getModelClassName() {
		return TempAnimalQuarantine.class.getName();
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
		attributes.put("requestState", getRequestState());
		attributes.put("documentName", getDocumentName());
		attributes.put("documentYear", getDocumentYear());
		attributes.put("userCreated", getUserCreated());
		attributes.put("nameOfShip", getNameOfShip());
		attributes.put("flagStateOfShip", getFlagStateOfShip());
		attributes.put("numberOfCrew", getNumberOfCrew());
		attributes.put("numberOfPassengers", getNumberOfPassengers());
		attributes.put("lastPortOfCallCode", getLastPortOfCallCode());
		attributes.put("nextPortOfCallCode", getNextPortOfCallCode());
		attributes.put("animalNameFirst", getAnimalNameFirst());
		attributes.put("animalNameBetween", getAnimalNameBetween());
		attributes.put("animalNameThis", getAnimalNameThis());
		attributes.put("nameOfMaster", getNameOfMaster());
		attributes.put("signPlace", getSignPlace());
		attributes.put("signDate", getSignDate());
		attributes.put("masterSigned", getMasterSigned());
		attributes.put("masterSignedImage", getMasterSignedImage());
		attributes.put("attachedFile", getAttachedFile());

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

		Integer requestState = (Integer)attributes.get("requestState");

		if (requestState != null) {
			setRequestState(requestState);
		}

		Long documentName = (Long)attributes.get("documentName");

		if (documentName != null) {
			setDocumentName(documentName);
		}

		Integer documentYear = (Integer)attributes.get("documentYear");

		if (documentYear != null) {
			setDocumentYear(documentYear);
		}

		String userCreated = (String)attributes.get("userCreated");

		if (userCreated != null) {
			setUserCreated(userCreated);
		}

		String nameOfShip = (String)attributes.get("nameOfShip");

		if (nameOfShip != null) {
			setNameOfShip(nameOfShip);
		}

		String flagStateOfShip = (String)attributes.get("flagStateOfShip");

		if (flagStateOfShip != null) {
			setFlagStateOfShip(flagStateOfShip);
		}

		Integer numberOfCrew = (Integer)attributes.get("numberOfCrew");

		if (numberOfCrew != null) {
			setNumberOfCrew(numberOfCrew);
		}

		Integer numberOfPassengers = (Integer)attributes.get(
				"numberOfPassengers");

		if (numberOfPassengers != null) {
			setNumberOfPassengers(numberOfPassengers);
		}

		String lastPortOfCallCode = (String)attributes.get("lastPortOfCallCode");

		if (lastPortOfCallCode != null) {
			setLastPortOfCallCode(lastPortOfCallCode);
		}

		String nextPortOfCallCode = (String)attributes.get("nextPortOfCallCode");

		if (nextPortOfCallCode != null) {
			setNextPortOfCallCode(nextPortOfCallCode);
		}

		String animalNameFirst = (String)attributes.get("animalNameFirst");

		if (animalNameFirst != null) {
			setAnimalNameFirst(animalNameFirst);
		}

		String animalNameBetween = (String)attributes.get("animalNameBetween");

		if (animalNameBetween != null) {
			setAnimalNameBetween(animalNameBetween);
		}

		String animalNameThis = (String)attributes.get("animalNameThis");

		if (animalNameThis != null) {
			setAnimalNameThis(animalNameThis);
		}

		String nameOfMaster = (String)attributes.get("nameOfMaster");

		if (nameOfMaster != null) {
			setNameOfMaster(nameOfMaster);
		}

		String signPlace = (String)attributes.get("signPlace");

		if (signPlace != null) {
			setSignPlace(signPlace);
		}

		Date signDate = (Date)attributes.get("signDate");

		if (signDate != null) {
			setSignDate(signDate);
		}

		Integer masterSigned = (Integer)attributes.get("masterSigned");

		if (masterSigned != null) {
			setMasterSigned(masterSigned);
		}

		Integer masterSignedImage = (Integer)attributes.get("masterSignedImage");

		if (masterSignedImage != null) {
			setMasterSignedImage(masterSignedImage);
		}

		Long attachedFile = (Long)attributes.get("attachedFile");

		if (attachedFile != null) {
			setAttachedFile(attachedFile);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tempAnimalQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempAnimalQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tempAnimalQuarantineRemoteModel, id);
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

		if (_tempAnimalQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempAnimalQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestCode", String.class);

				method.invoke(_tempAnimalQuarantineRemoteModel, requestCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getRequestState() {
		return _requestState;
	}

	@Override
	public void setRequestState(int requestState) {
		_requestState = requestState;

		if (_tempAnimalQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempAnimalQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestState", int.class);

				method.invoke(_tempAnimalQuarantineRemoteModel, requestState);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDocumentName() {
		return _documentName;
	}

	@Override
	public void setDocumentName(long documentName) {
		_documentName = documentName;

		if (_tempAnimalQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempAnimalQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentName", long.class);

				method.invoke(_tempAnimalQuarantineRemoteModel, documentName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDocumentYear() {
		return _documentYear;
	}

	@Override
	public void setDocumentYear(int documentYear) {
		_documentYear = documentYear;

		if (_tempAnimalQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempAnimalQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentYear", int.class);

				method.invoke(_tempAnimalQuarantineRemoteModel, documentYear);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserCreated() {
		return _userCreated;
	}

	@Override
	public void setUserCreated(String userCreated) {
		_userCreated = userCreated;

		if (_tempAnimalQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempAnimalQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setUserCreated", String.class);

				method.invoke(_tempAnimalQuarantineRemoteModel, userCreated);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNameOfShip() {
		return _nameOfShip;
	}

	@Override
	public void setNameOfShip(String nameOfShip) {
		_nameOfShip = nameOfShip;

		if (_tempAnimalQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempAnimalQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setNameOfShip", String.class);

				method.invoke(_tempAnimalQuarantineRemoteModel, nameOfShip);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFlagStateOfShip() {
		return _flagStateOfShip;
	}

	@Override
	public void setFlagStateOfShip(String flagStateOfShip) {
		_flagStateOfShip = flagStateOfShip;

		if (_tempAnimalQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempAnimalQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setFlagStateOfShip",
						String.class);

				method.invoke(_tempAnimalQuarantineRemoteModel, flagStateOfShip);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNumberOfCrew() {
		return _numberOfCrew;
	}

	@Override
	public void setNumberOfCrew(int numberOfCrew) {
		_numberOfCrew = numberOfCrew;

		if (_tempAnimalQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempAnimalQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setNumberOfCrew", int.class);

				method.invoke(_tempAnimalQuarantineRemoteModel, numberOfCrew);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNumberOfPassengers() {
		return _numberOfPassengers;
	}

	@Override
	public void setNumberOfPassengers(int numberOfPassengers) {
		_numberOfPassengers = numberOfPassengers;

		if (_tempAnimalQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempAnimalQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setNumberOfPassengers",
						int.class);

				method.invoke(_tempAnimalQuarantineRemoteModel,
					numberOfPassengers);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLastPortOfCallCode() {
		return _lastPortOfCallCode;
	}

	@Override
	public void setLastPortOfCallCode(String lastPortOfCallCode) {
		_lastPortOfCallCode = lastPortOfCallCode;

		if (_tempAnimalQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempAnimalQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setLastPortOfCallCode",
						String.class);

				method.invoke(_tempAnimalQuarantineRemoteModel,
					lastPortOfCallCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNextPortOfCallCode() {
		return _nextPortOfCallCode;
	}

	@Override
	public void setNextPortOfCallCode(String nextPortOfCallCode) {
		_nextPortOfCallCode = nextPortOfCallCode;

		if (_tempAnimalQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempAnimalQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setNextPortOfCallCode",
						String.class);

				method.invoke(_tempAnimalQuarantineRemoteModel,
					nextPortOfCallCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAnimalNameFirst() {
		return _animalNameFirst;
	}

	@Override
	public void setAnimalNameFirst(String animalNameFirst) {
		_animalNameFirst = animalNameFirst;

		if (_tempAnimalQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempAnimalQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setAnimalNameFirst",
						String.class);

				method.invoke(_tempAnimalQuarantineRemoteModel, animalNameFirst);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAnimalNameBetween() {
		return _animalNameBetween;
	}

	@Override
	public void setAnimalNameBetween(String animalNameBetween) {
		_animalNameBetween = animalNameBetween;

		if (_tempAnimalQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempAnimalQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setAnimalNameBetween",
						String.class);

				method.invoke(_tempAnimalQuarantineRemoteModel,
					animalNameBetween);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAnimalNameThis() {
		return _animalNameThis;
	}

	@Override
	public void setAnimalNameThis(String animalNameThis) {
		_animalNameThis = animalNameThis;

		if (_tempAnimalQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempAnimalQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setAnimalNameThis",
						String.class);

				method.invoke(_tempAnimalQuarantineRemoteModel, animalNameThis);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNameOfMaster() {
		return _nameOfMaster;
	}

	@Override
	public void setNameOfMaster(String nameOfMaster) {
		_nameOfMaster = nameOfMaster;

		if (_tempAnimalQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempAnimalQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setNameOfMaster", String.class);

				method.invoke(_tempAnimalQuarantineRemoteModel, nameOfMaster);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSignPlace() {
		return _signPlace;
	}

	@Override
	public void setSignPlace(String signPlace) {
		_signPlace = signPlace;

		if (_tempAnimalQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempAnimalQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setSignPlace", String.class);

				method.invoke(_tempAnimalQuarantineRemoteModel, signPlace);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getSignDate() {
		return _signDate;
	}

	@Override
	public void setSignDate(Date signDate) {
		_signDate = signDate;

		if (_tempAnimalQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempAnimalQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setSignDate", Date.class);

				method.invoke(_tempAnimalQuarantineRemoteModel, signDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMasterSigned() {
		return _masterSigned;
	}

	@Override
	public void setMasterSigned(int masterSigned) {
		_masterSigned = masterSigned;

		if (_tempAnimalQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempAnimalQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setMasterSigned", int.class);

				method.invoke(_tempAnimalQuarantineRemoteModel, masterSigned);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMasterSignedImage() {
		return _masterSignedImage;
	}

	@Override
	public void setMasterSignedImage(int masterSignedImage) {
		_masterSignedImage = masterSignedImage;

		if (_tempAnimalQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempAnimalQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setMasterSignedImage",
						int.class);

				method.invoke(_tempAnimalQuarantineRemoteModel,
					masterSignedImage);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAttachedFile() {
		return _attachedFile;
	}

	@Override
	public void setAttachedFile(long attachedFile) {
		_attachedFile = attachedFile;

		if (_tempAnimalQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempAnimalQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setAttachedFile", long.class);

				method.invoke(_tempAnimalQuarantineRemoteModel, attachedFile);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTempAnimalQuarantineRemoteModel() {
		return _tempAnimalQuarantineRemoteModel;
	}

	public void setTempAnimalQuarantineRemoteModel(
		BaseModel<?> tempAnimalQuarantineRemoteModel) {
		_tempAnimalQuarantineRemoteModel = tempAnimalQuarantineRemoteModel;
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

		Class<?> remoteModelClass = _tempAnimalQuarantineRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tempAnimalQuarantineRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TempAnimalQuarantineLocalServiceUtil.addTempAnimalQuarantine(this);
		}
		else {
			TempAnimalQuarantineLocalServiceUtil.updateTempAnimalQuarantine(this);
		}
	}

	@Override
	public TempAnimalQuarantine toEscapedModel() {
		return (TempAnimalQuarantine)ProxyUtil.newProxyInstance(TempAnimalQuarantine.class.getClassLoader(),
			new Class[] { TempAnimalQuarantine.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempAnimalQuarantineClp clone = new TempAnimalQuarantineClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setRequestState(getRequestState());
		clone.setDocumentName(getDocumentName());
		clone.setDocumentYear(getDocumentYear());
		clone.setUserCreated(getUserCreated());
		clone.setNameOfShip(getNameOfShip());
		clone.setFlagStateOfShip(getFlagStateOfShip());
		clone.setNumberOfCrew(getNumberOfCrew());
		clone.setNumberOfPassengers(getNumberOfPassengers());
		clone.setLastPortOfCallCode(getLastPortOfCallCode());
		clone.setNextPortOfCallCode(getNextPortOfCallCode());
		clone.setAnimalNameFirst(getAnimalNameFirst());
		clone.setAnimalNameBetween(getAnimalNameBetween());
		clone.setAnimalNameThis(getAnimalNameThis());
		clone.setNameOfMaster(getNameOfMaster());
		clone.setSignPlace(getSignPlace());
		clone.setSignDate(getSignDate());
		clone.setMasterSigned(getMasterSigned());
		clone.setMasterSignedImage(getMasterSignedImage());
		clone.setAttachedFile(getAttachedFile());

		return clone;
	}

	@Override
	public int compareTo(TempAnimalQuarantine tempAnimalQuarantine) {
		int value = 0;

		if (getId() < tempAnimalQuarantine.getId()) {
			value = -1;
		}
		else if (getId() > tempAnimalQuarantine.getId()) {
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

		if (!(obj instanceof TempAnimalQuarantineClp)) {
			return false;
		}

		TempAnimalQuarantineClp tempAnimalQuarantine = (TempAnimalQuarantineClp)obj;

		long primaryKey = tempAnimalQuarantine.getPrimaryKey();

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
		StringBundler sb = new StringBundler(43);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", requestState=");
		sb.append(getRequestState());
		sb.append(", documentName=");
		sb.append(getDocumentName());
		sb.append(", documentYear=");
		sb.append(getDocumentYear());
		sb.append(", userCreated=");
		sb.append(getUserCreated());
		sb.append(", nameOfShip=");
		sb.append(getNameOfShip());
		sb.append(", flagStateOfShip=");
		sb.append(getFlagStateOfShip());
		sb.append(", numberOfCrew=");
		sb.append(getNumberOfCrew());
		sb.append(", numberOfPassengers=");
		sb.append(getNumberOfPassengers());
		sb.append(", lastPortOfCallCode=");
		sb.append(getLastPortOfCallCode());
		sb.append(", nextPortOfCallCode=");
		sb.append(getNextPortOfCallCode());
		sb.append(", animalNameFirst=");
		sb.append(getAnimalNameFirst());
		sb.append(", animalNameBetween=");
		sb.append(getAnimalNameBetween());
		sb.append(", animalNameThis=");
		sb.append(getAnimalNameThis());
		sb.append(", nameOfMaster=");
		sb.append(getNameOfMaster());
		sb.append(", signPlace=");
		sb.append(getSignPlace());
		sb.append(", signDate=");
		sb.append(getSignDate());
		sb.append(", masterSigned=");
		sb.append(getMasterSigned());
		sb.append(", masterSignedImage=");
		sb.append(getMasterSignedImage());
		sb.append(", attachedFile=");
		sb.append(getAttachedFile());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(67);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.TempAnimalQuarantine");
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
			"<column><column-name>requestState</column-name><column-value><![CDATA[");
		sb.append(getRequestState());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentName</column-name><column-value><![CDATA[");
		sb.append(getDocumentName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentYear</column-name><column-value><![CDATA[");
		sb.append(getDocumentYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userCreated</column-name><column-value><![CDATA[");
		sb.append(getUserCreated());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameOfShip</column-name><column-value><![CDATA[");
		sb.append(getNameOfShip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>flagStateOfShip</column-name><column-value><![CDATA[");
		sb.append(getFlagStateOfShip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>numberOfCrew</column-name><column-value><![CDATA[");
		sb.append(getNumberOfCrew());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>numberOfPassengers</column-name><column-value><![CDATA[");
		sb.append(getNumberOfPassengers());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lastPortOfCallCode</column-name><column-value><![CDATA[");
		sb.append(getLastPortOfCallCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nextPortOfCallCode</column-name><column-value><![CDATA[");
		sb.append(getNextPortOfCallCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>animalNameFirst</column-name><column-value><![CDATA[");
		sb.append(getAnimalNameFirst());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>animalNameBetween</column-name><column-value><![CDATA[");
		sb.append(getAnimalNameBetween());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>animalNameThis</column-name><column-value><![CDATA[");
		sb.append(getAnimalNameThis());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameOfMaster</column-name><column-value><![CDATA[");
		sb.append(getNameOfMaster());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signPlace</column-name><column-value><![CDATA[");
		sb.append(getSignPlace());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signDate</column-name><column-value><![CDATA[");
		sb.append(getSignDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>masterSigned</column-name><column-value><![CDATA[");
		sb.append(getMasterSigned());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>masterSignedImage</column-name><column-value><![CDATA[");
		sb.append(getMasterSignedImage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>attachedFile</column-name><column-value><![CDATA[");
		sb.append(getAttachedFile());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private int _requestState;
	private long _documentName;
	private int _documentYear;
	private String _userCreated;
	private String _nameOfShip;
	private String _flagStateOfShip;
	private int _numberOfCrew;
	private int _numberOfPassengers;
	private String _lastPortOfCallCode;
	private String _nextPortOfCallCode;
	private String _animalNameFirst;
	private String _animalNameBetween;
	private String _animalNameThis;
	private String _nameOfMaster;
	private String _signPlace;
	private Date _signDate;
	private int _masterSigned;
	private int _masterSignedImage;
	private long _attachedFile;
	private BaseModel<?> _tempAnimalQuarantineRemoteModel;
}