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
import vn.dtt.duongbien.dao.vrcb.service.TempCrewListLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class TempCrewListClp extends BaseModelImpl<TempCrewList>
	implements TempCrewList {
	public TempCrewListClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TempCrewList.class;
	}

	@Override
	public String getModelClassName() {
		return TempCrewList.class.getName();
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
		attributes.put("isArrival", getIsArrival());
		attributes.put("nameOfShip", getNameOfShip());
		attributes.put("imoNumber", getImoNumber());
		attributes.put("callSign", getCallSign());
		attributes.put("voyageNumber", getVoyageNumber());
		attributes.put("portOfArrivalCode", getPortOfArrivalCode());
		attributes.put("dateOfArrival", getDateOfArrival());
		attributes.put("flagStateOfShip", getFlagStateOfShip());
		attributes.put("lastPortOfCallCode", getLastPortOfCallCode());
		attributes.put("crewList", getCrewList());
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

		Integer isArrival = (Integer)attributes.get("isArrival");

		if (isArrival != null) {
			setIsArrival(isArrival);
		}

		String nameOfShip = (String)attributes.get("nameOfShip");

		if (nameOfShip != null) {
			setNameOfShip(nameOfShip);
		}

		String imoNumber = (String)attributes.get("imoNumber");

		if (imoNumber != null) {
			setImoNumber(imoNumber);
		}

		String callSign = (String)attributes.get("callSign");

		if (callSign != null) {
			setCallSign(callSign);
		}

		String voyageNumber = (String)attributes.get("voyageNumber");

		if (voyageNumber != null) {
			setVoyageNumber(voyageNumber);
		}

		String portOfArrivalCode = (String)attributes.get("portOfArrivalCode");

		if (portOfArrivalCode != null) {
			setPortOfArrivalCode(portOfArrivalCode);
		}

		Date dateOfArrival = (Date)attributes.get("dateOfArrival");

		if (dateOfArrival != null) {
			setDateOfArrival(dateOfArrival);
		}

		String flagStateOfShip = (String)attributes.get("flagStateOfShip");

		if (flagStateOfShip != null) {
			setFlagStateOfShip(flagStateOfShip);
		}

		String lastPortOfCallCode = (String)attributes.get("lastPortOfCallCode");

		if (lastPortOfCallCode != null) {
			setLastPortOfCallCode(lastPortOfCallCode);
		}

		Integer crewList = (Integer)attributes.get("crewList");

		if (crewList != null) {
			setCrewList(crewList);
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

		if (_tempCrewListRemoteModel != null) {
			try {
				Class<?> clazz = _tempCrewListRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tempCrewListRemoteModel, id);
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

		if (_tempCrewListRemoteModel != null) {
			try {
				Class<?> clazz = _tempCrewListRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestCode", String.class);

				method.invoke(_tempCrewListRemoteModel, requestCode);
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

		if (_tempCrewListRemoteModel != null) {
			try {
				Class<?> clazz = _tempCrewListRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestState", int.class);

				method.invoke(_tempCrewListRemoteModel, requestState);
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

		if (_tempCrewListRemoteModel != null) {
			try {
				Class<?> clazz = _tempCrewListRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentName", long.class);

				method.invoke(_tempCrewListRemoteModel, documentName);
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

		if (_tempCrewListRemoteModel != null) {
			try {
				Class<?> clazz = _tempCrewListRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentYear", int.class);

				method.invoke(_tempCrewListRemoteModel, documentYear);
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

		if (_tempCrewListRemoteModel != null) {
			try {
				Class<?> clazz = _tempCrewListRemoteModel.getClass();

				Method method = clazz.getMethod("setUserCreated", String.class);

				method.invoke(_tempCrewListRemoteModel, userCreated);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIsArrival() {
		return _isArrival;
	}

	@Override
	public void setIsArrival(int isArrival) {
		_isArrival = isArrival;

		if (_tempCrewListRemoteModel != null) {
			try {
				Class<?> clazz = _tempCrewListRemoteModel.getClass();

				Method method = clazz.getMethod("setIsArrival", int.class);

				method.invoke(_tempCrewListRemoteModel, isArrival);
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

		if (_tempCrewListRemoteModel != null) {
			try {
				Class<?> clazz = _tempCrewListRemoteModel.getClass();

				Method method = clazz.getMethod("setNameOfShip", String.class);

				method.invoke(_tempCrewListRemoteModel, nameOfShip);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getImoNumber() {
		return _imoNumber;
	}

	@Override
	public void setImoNumber(String imoNumber) {
		_imoNumber = imoNumber;

		if (_tempCrewListRemoteModel != null) {
			try {
				Class<?> clazz = _tempCrewListRemoteModel.getClass();

				Method method = clazz.getMethod("setImoNumber", String.class);

				method.invoke(_tempCrewListRemoteModel, imoNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCallSign() {
		return _callSign;
	}

	@Override
	public void setCallSign(String callSign) {
		_callSign = callSign;

		if (_tempCrewListRemoteModel != null) {
			try {
				Class<?> clazz = _tempCrewListRemoteModel.getClass();

				Method method = clazz.getMethod("setCallSign", String.class);

				method.invoke(_tempCrewListRemoteModel, callSign);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVoyageNumber() {
		return _voyageNumber;
	}

	@Override
	public void setVoyageNumber(String voyageNumber) {
		_voyageNumber = voyageNumber;

		if (_tempCrewListRemoteModel != null) {
			try {
				Class<?> clazz = _tempCrewListRemoteModel.getClass();

				Method method = clazz.getMethod("setVoyageNumber", String.class);

				method.invoke(_tempCrewListRemoteModel, voyageNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPortOfArrivalCode() {
		return _portOfArrivalCode;
	}

	@Override
	public void setPortOfArrivalCode(String portOfArrivalCode) {
		_portOfArrivalCode = portOfArrivalCode;

		if (_tempCrewListRemoteModel != null) {
			try {
				Class<?> clazz = _tempCrewListRemoteModel.getClass();

				Method method = clazz.getMethod("setPortOfArrivalCode",
						String.class);

				method.invoke(_tempCrewListRemoteModel, portOfArrivalCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDateOfArrival() {
		return _dateOfArrival;
	}

	@Override
	public void setDateOfArrival(Date dateOfArrival) {
		_dateOfArrival = dateOfArrival;

		if (_tempCrewListRemoteModel != null) {
			try {
				Class<?> clazz = _tempCrewListRemoteModel.getClass();

				Method method = clazz.getMethod("setDateOfArrival", Date.class);

				method.invoke(_tempCrewListRemoteModel, dateOfArrival);
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

		if (_tempCrewListRemoteModel != null) {
			try {
				Class<?> clazz = _tempCrewListRemoteModel.getClass();

				Method method = clazz.getMethod("setFlagStateOfShip",
						String.class);

				method.invoke(_tempCrewListRemoteModel, flagStateOfShip);
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

		if (_tempCrewListRemoteModel != null) {
			try {
				Class<?> clazz = _tempCrewListRemoteModel.getClass();

				Method method = clazz.getMethod("setLastPortOfCallCode",
						String.class);

				method.invoke(_tempCrewListRemoteModel, lastPortOfCallCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCrewList() {
		return _crewList;
	}

	@Override
	public void setCrewList(int crewList) {
		_crewList = crewList;

		if (_tempCrewListRemoteModel != null) {
			try {
				Class<?> clazz = _tempCrewListRemoteModel.getClass();

				Method method = clazz.getMethod("setCrewList", int.class);

				method.invoke(_tempCrewListRemoteModel, crewList);
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

		if (_tempCrewListRemoteModel != null) {
			try {
				Class<?> clazz = _tempCrewListRemoteModel.getClass();

				Method method = clazz.getMethod("setSignPlace", String.class);

				method.invoke(_tempCrewListRemoteModel, signPlace);
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

		if (_tempCrewListRemoteModel != null) {
			try {
				Class<?> clazz = _tempCrewListRemoteModel.getClass();

				Method method = clazz.getMethod("setSignDate", Date.class);

				method.invoke(_tempCrewListRemoteModel, signDate);
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

		if (_tempCrewListRemoteModel != null) {
			try {
				Class<?> clazz = _tempCrewListRemoteModel.getClass();

				Method method = clazz.getMethod("setMasterSigned", int.class);

				method.invoke(_tempCrewListRemoteModel, masterSigned);
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

		if (_tempCrewListRemoteModel != null) {
			try {
				Class<?> clazz = _tempCrewListRemoteModel.getClass();

				Method method = clazz.getMethod("setMasterSignedImage",
						int.class);

				method.invoke(_tempCrewListRemoteModel, masterSignedImage);
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

		if (_tempCrewListRemoteModel != null) {
			try {
				Class<?> clazz = _tempCrewListRemoteModel.getClass();

				Method method = clazz.getMethod("setAttachedFile", long.class);

				method.invoke(_tempCrewListRemoteModel, attachedFile);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTempCrewListRemoteModel() {
		return _tempCrewListRemoteModel;
	}

	public void setTempCrewListRemoteModel(BaseModel<?> tempCrewListRemoteModel) {
		_tempCrewListRemoteModel = tempCrewListRemoteModel;
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

		Class<?> remoteModelClass = _tempCrewListRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tempCrewListRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TempCrewListLocalServiceUtil.addTempCrewList(this);
		}
		else {
			TempCrewListLocalServiceUtil.updateTempCrewList(this);
		}
	}

	@Override
	public TempCrewList toEscapedModel() {
		return (TempCrewList)ProxyUtil.newProxyInstance(TempCrewList.class.getClassLoader(),
			new Class[] { TempCrewList.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempCrewListClp clone = new TempCrewListClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setRequestState(getRequestState());
		clone.setDocumentName(getDocumentName());
		clone.setDocumentYear(getDocumentYear());
		clone.setUserCreated(getUserCreated());
		clone.setIsArrival(getIsArrival());
		clone.setNameOfShip(getNameOfShip());
		clone.setImoNumber(getImoNumber());
		clone.setCallSign(getCallSign());
		clone.setVoyageNumber(getVoyageNumber());
		clone.setPortOfArrivalCode(getPortOfArrivalCode());
		clone.setDateOfArrival(getDateOfArrival());
		clone.setFlagStateOfShip(getFlagStateOfShip());
		clone.setLastPortOfCallCode(getLastPortOfCallCode());
		clone.setCrewList(getCrewList());
		clone.setSignPlace(getSignPlace());
		clone.setSignDate(getSignDate());
		clone.setMasterSigned(getMasterSigned());
		clone.setMasterSignedImage(getMasterSignedImage());
		clone.setAttachedFile(getAttachedFile());

		return clone;
	}

	@Override
	public int compareTo(TempCrewList tempCrewList) {
		int value = 0;

		if (getId() < tempCrewList.getId()) {
			value = -1;
		}
		else if (getId() > tempCrewList.getId()) {
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

		if (!(obj instanceof TempCrewListClp)) {
			return false;
		}

		TempCrewListClp tempCrewList = (TempCrewListClp)obj;

		long primaryKey = tempCrewList.getPrimaryKey();

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
		sb.append(", isArrival=");
		sb.append(getIsArrival());
		sb.append(", nameOfShip=");
		sb.append(getNameOfShip());
		sb.append(", imoNumber=");
		sb.append(getImoNumber());
		sb.append(", callSign=");
		sb.append(getCallSign());
		sb.append(", voyageNumber=");
		sb.append(getVoyageNumber());
		sb.append(", portOfArrivalCode=");
		sb.append(getPortOfArrivalCode());
		sb.append(", dateOfArrival=");
		sb.append(getDateOfArrival());
		sb.append(", flagStateOfShip=");
		sb.append(getFlagStateOfShip());
		sb.append(", lastPortOfCallCode=");
		sb.append(getLastPortOfCallCode());
		sb.append(", crewList=");
		sb.append(getCrewList());
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
		sb.append("vn.dtt.duongbien.dao.vrcb.model.TempCrewList");
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
			"<column><column-name>isArrival</column-name><column-value><![CDATA[");
		sb.append(getIsArrival());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameOfShip</column-name><column-value><![CDATA[");
		sb.append(getNameOfShip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>imoNumber</column-name><column-value><![CDATA[");
		sb.append(getImoNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>callSign</column-name><column-value><![CDATA[");
		sb.append(getCallSign());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>voyageNumber</column-name><column-value><![CDATA[");
		sb.append(getVoyageNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portOfArrivalCode</column-name><column-value><![CDATA[");
		sb.append(getPortOfArrivalCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateOfArrival</column-name><column-value><![CDATA[");
		sb.append(getDateOfArrival());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>flagStateOfShip</column-name><column-value><![CDATA[");
		sb.append(getFlagStateOfShip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lastPortOfCallCode</column-name><column-value><![CDATA[");
		sb.append(getLastPortOfCallCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>crewList</column-name><column-value><![CDATA[");
		sb.append(getCrewList());
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
	private int _isArrival;
	private String _nameOfShip;
	private String _imoNumber;
	private String _callSign;
	private String _voyageNumber;
	private String _portOfArrivalCode;
	private Date _dateOfArrival;
	private String _flagStateOfShip;
	private String _lastPortOfCallCode;
	private int _crewList;
	private String _signPlace;
	private Date _signDate;
	private int _masterSigned;
	private int _masterSignedImage;
	private long _attachedFile;
	private BaseModel<?> _tempCrewListRemoteModel;
}