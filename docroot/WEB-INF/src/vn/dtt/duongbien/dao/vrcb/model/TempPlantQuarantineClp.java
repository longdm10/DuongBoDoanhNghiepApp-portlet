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
import vn.dtt.duongbien.dao.vrcb.service.TempPlantQuarantineLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class TempPlantQuarantineClp extends BaseModelImpl<TempPlantQuarantine>
	implements TempPlantQuarantine {
	public TempPlantQuarantineClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TempPlantQuarantine.class;
	}

	@Override
	public String getModelClassName() {
		return TempPlantQuarantine.class.getName();
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
		attributes.put("userCreated", getUserCreated());
		attributes.put("documentYear", getDocumentYear());
		attributes.put("nameOfShip", getNameOfShip());
		attributes.put("flagStateOfShip", getFlagStateOfShip());
		attributes.put("nameOfMaster", getNameOfMaster());
		attributes.put("doctorName", getDoctorName());
		attributes.put("numberOfCrew", getNumberOfCrew());
		attributes.put("numberOfPassengers", getNumberOfPassengers());
		attributes.put("lastPortOfCallCode", getLastPortOfCallCode());
		attributes.put("nextPortOfCallCode", getNextPortOfCallCode());
		attributes.put("firstPortOfLoadingCode", getFirstPortOfLoadingCode());
		attributes.put("dateOfdeparture", getDateOfdeparture());
		attributes.put("plantNameFirst", getPlantNameFirst());
		attributes.put("plantNameBetween", getPlantNameBetween());
		attributes.put("plantNameThis", getPlantNameThis());
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

		String userCreated = (String)attributes.get("userCreated");

		if (userCreated != null) {
			setUserCreated(userCreated);
		}

		Integer documentYear = (Integer)attributes.get("documentYear");

		if (documentYear != null) {
			setDocumentYear(documentYear);
		}

		String nameOfShip = (String)attributes.get("nameOfShip");

		if (nameOfShip != null) {
			setNameOfShip(nameOfShip);
		}

		String flagStateOfShip = (String)attributes.get("flagStateOfShip");

		if (flagStateOfShip != null) {
			setFlagStateOfShip(flagStateOfShip);
		}

		String nameOfMaster = (String)attributes.get("nameOfMaster");

		if (nameOfMaster != null) {
			setNameOfMaster(nameOfMaster);
		}

		String doctorName = (String)attributes.get("doctorName");

		if (doctorName != null) {
			setDoctorName(doctorName);
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

		String firstPortOfLoadingCode = (String)attributes.get(
				"firstPortOfLoadingCode");

		if (firstPortOfLoadingCode != null) {
			setFirstPortOfLoadingCode(firstPortOfLoadingCode);
		}

		Date dateOfdeparture = (Date)attributes.get("dateOfdeparture");

		if (dateOfdeparture != null) {
			setDateOfdeparture(dateOfdeparture);
		}

		String plantNameFirst = (String)attributes.get("plantNameFirst");

		if (plantNameFirst != null) {
			setPlantNameFirst(plantNameFirst);
		}

		String plantNameBetween = (String)attributes.get("plantNameBetween");

		if (plantNameBetween != null) {
			setPlantNameBetween(plantNameBetween);
		}

		String plantNameThis = (String)attributes.get("plantNameThis");

		if (plantNameThis != null) {
			setPlantNameThis(plantNameThis);
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

		if (_tempPlantQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempPlantQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tempPlantQuarantineRemoteModel, id);
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

		if (_tempPlantQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempPlantQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestCode", String.class);

				method.invoke(_tempPlantQuarantineRemoteModel, requestCode);
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

		if (_tempPlantQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempPlantQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestState", int.class);

				method.invoke(_tempPlantQuarantineRemoteModel, requestState);
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

		if (_tempPlantQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempPlantQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentName", long.class);

				method.invoke(_tempPlantQuarantineRemoteModel, documentName);
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

		if (_tempPlantQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempPlantQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setUserCreated", String.class);

				method.invoke(_tempPlantQuarantineRemoteModel, userCreated);
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

		if (_tempPlantQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempPlantQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentYear", int.class);

				method.invoke(_tempPlantQuarantineRemoteModel, documentYear);
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

		if (_tempPlantQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempPlantQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setNameOfShip", String.class);

				method.invoke(_tempPlantQuarantineRemoteModel, nameOfShip);
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

		if (_tempPlantQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempPlantQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setFlagStateOfShip",
						String.class);

				method.invoke(_tempPlantQuarantineRemoteModel, flagStateOfShip);
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

		if (_tempPlantQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempPlantQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setNameOfMaster", String.class);

				method.invoke(_tempPlantQuarantineRemoteModel, nameOfMaster);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDoctorName() {
		return _doctorName;
	}

	@Override
	public void setDoctorName(String doctorName) {
		_doctorName = doctorName;

		if (_tempPlantQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempPlantQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setDoctorName", String.class);

				method.invoke(_tempPlantQuarantineRemoteModel, doctorName);
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

		if (_tempPlantQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempPlantQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setNumberOfCrew", int.class);

				method.invoke(_tempPlantQuarantineRemoteModel, numberOfCrew);
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

		if (_tempPlantQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempPlantQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setNumberOfPassengers",
						int.class);

				method.invoke(_tempPlantQuarantineRemoteModel,
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

		if (_tempPlantQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempPlantQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setLastPortOfCallCode",
						String.class);

				method.invoke(_tempPlantQuarantineRemoteModel,
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

		if (_tempPlantQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempPlantQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setNextPortOfCallCode",
						String.class);

				method.invoke(_tempPlantQuarantineRemoteModel,
					nextPortOfCallCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFirstPortOfLoadingCode() {
		return _firstPortOfLoadingCode;
	}

	@Override
	public void setFirstPortOfLoadingCode(String firstPortOfLoadingCode) {
		_firstPortOfLoadingCode = firstPortOfLoadingCode;

		if (_tempPlantQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempPlantQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setFirstPortOfLoadingCode",
						String.class);

				method.invoke(_tempPlantQuarantineRemoteModel,
					firstPortOfLoadingCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDateOfdeparture() {
		return _dateOfdeparture;
	}

	@Override
	public void setDateOfdeparture(Date dateOfdeparture) {
		_dateOfdeparture = dateOfdeparture;

		if (_tempPlantQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempPlantQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setDateOfdeparture", Date.class);

				method.invoke(_tempPlantQuarantineRemoteModel, dateOfdeparture);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPlantNameFirst() {
		return _plantNameFirst;
	}

	@Override
	public void setPlantNameFirst(String plantNameFirst) {
		_plantNameFirst = plantNameFirst;

		if (_tempPlantQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempPlantQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setPlantNameFirst",
						String.class);

				method.invoke(_tempPlantQuarantineRemoteModel, plantNameFirst);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPlantNameBetween() {
		return _plantNameBetween;
	}

	@Override
	public void setPlantNameBetween(String plantNameBetween) {
		_plantNameBetween = plantNameBetween;

		if (_tempPlantQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempPlantQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setPlantNameBetween",
						String.class);

				method.invoke(_tempPlantQuarantineRemoteModel, plantNameBetween);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPlantNameThis() {
		return _plantNameThis;
	}

	@Override
	public void setPlantNameThis(String plantNameThis) {
		_plantNameThis = plantNameThis;

		if (_tempPlantQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempPlantQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setPlantNameThis", String.class);

				method.invoke(_tempPlantQuarantineRemoteModel, plantNameThis);
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

		if (_tempPlantQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempPlantQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setSignPlace", String.class);

				method.invoke(_tempPlantQuarantineRemoteModel, signPlace);
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

		if (_tempPlantQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempPlantQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setSignDate", Date.class);

				method.invoke(_tempPlantQuarantineRemoteModel, signDate);
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

		if (_tempPlantQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempPlantQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setMasterSigned", int.class);

				method.invoke(_tempPlantQuarantineRemoteModel, masterSigned);
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

		if (_tempPlantQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempPlantQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setMasterSignedImage",
						int.class);

				method.invoke(_tempPlantQuarantineRemoteModel, masterSignedImage);
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

		if (_tempPlantQuarantineRemoteModel != null) {
			try {
				Class<?> clazz = _tempPlantQuarantineRemoteModel.getClass();

				Method method = clazz.getMethod("setAttachedFile", long.class);

				method.invoke(_tempPlantQuarantineRemoteModel, attachedFile);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTempPlantQuarantineRemoteModel() {
		return _tempPlantQuarantineRemoteModel;
	}

	public void setTempPlantQuarantineRemoteModel(
		BaseModel<?> tempPlantQuarantineRemoteModel) {
		_tempPlantQuarantineRemoteModel = tempPlantQuarantineRemoteModel;
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

		Class<?> remoteModelClass = _tempPlantQuarantineRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tempPlantQuarantineRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TempPlantQuarantineLocalServiceUtil.addTempPlantQuarantine(this);
		}
		else {
			TempPlantQuarantineLocalServiceUtil.updateTempPlantQuarantine(this);
		}
	}

	@Override
	public TempPlantQuarantine toEscapedModel() {
		return (TempPlantQuarantine)ProxyUtil.newProxyInstance(TempPlantQuarantine.class.getClassLoader(),
			new Class[] { TempPlantQuarantine.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempPlantQuarantineClp clone = new TempPlantQuarantineClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setRequestState(getRequestState());
		clone.setDocumentName(getDocumentName());
		clone.setUserCreated(getUserCreated());
		clone.setDocumentYear(getDocumentYear());
		clone.setNameOfShip(getNameOfShip());
		clone.setFlagStateOfShip(getFlagStateOfShip());
		clone.setNameOfMaster(getNameOfMaster());
		clone.setDoctorName(getDoctorName());
		clone.setNumberOfCrew(getNumberOfCrew());
		clone.setNumberOfPassengers(getNumberOfPassengers());
		clone.setLastPortOfCallCode(getLastPortOfCallCode());
		clone.setNextPortOfCallCode(getNextPortOfCallCode());
		clone.setFirstPortOfLoadingCode(getFirstPortOfLoadingCode());
		clone.setDateOfdeparture(getDateOfdeparture());
		clone.setPlantNameFirst(getPlantNameFirst());
		clone.setPlantNameBetween(getPlantNameBetween());
		clone.setPlantNameThis(getPlantNameThis());
		clone.setSignPlace(getSignPlace());
		clone.setSignDate(getSignDate());
		clone.setMasterSigned(getMasterSigned());
		clone.setMasterSignedImage(getMasterSignedImage());
		clone.setAttachedFile(getAttachedFile());

		return clone;
	}

	@Override
	public int compareTo(TempPlantQuarantine tempPlantQuarantine) {
		int value = 0;

		if (getId() < tempPlantQuarantine.getId()) {
			value = -1;
		}
		else if (getId() > tempPlantQuarantine.getId()) {
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

		if (!(obj instanceof TempPlantQuarantineClp)) {
			return false;
		}

		TempPlantQuarantineClp tempPlantQuarantine = (TempPlantQuarantineClp)obj;

		long primaryKey = tempPlantQuarantine.getPrimaryKey();

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
		StringBundler sb = new StringBundler(49);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", requestState=");
		sb.append(getRequestState());
		sb.append(", documentName=");
		sb.append(getDocumentName());
		sb.append(", userCreated=");
		sb.append(getUserCreated());
		sb.append(", documentYear=");
		sb.append(getDocumentYear());
		sb.append(", nameOfShip=");
		sb.append(getNameOfShip());
		sb.append(", flagStateOfShip=");
		sb.append(getFlagStateOfShip());
		sb.append(", nameOfMaster=");
		sb.append(getNameOfMaster());
		sb.append(", doctorName=");
		sb.append(getDoctorName());
		sb.append(", numberOfCrew=");
		sb.append(getNumberOfCrew());
		sb.append(", numberOfPassengers=");
		sb.append(getNumberOfPassengers());
		sb.append(", lastPortOfCallCode=");
		sb.append(getLastPortOfCallCode());
		sb.append(", nextPortOfCallCode=");
		sb.append(getNextPortOfCallCode());
		sb.append(", firstPortOfLoadingCode=");
		sb.append(getFirstPortOfLoadingCode());
		sb.append(", dateOfdeparture=");
		sb.append(getDateOfdeparture());
		sb.append(", plantNameFirst=");
		sb.append(getPlantNameFirst());
		sb.append(", plantNameBetween=");
		sb.append(getPlantNameBetween());
		sb.append(", plantNameThis=");
		sb.append(getPlantNameThis());
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
		StringBundler sb = new StringBundler(76);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.TempPlantQuarantine");
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
			"<column><column-name>userCreated</column-name><column-value><![CDATA[");
		sb.append(getUserCreated());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentYear</column-name><column-value><![CDATA[");
		sb.append(getDocumentYear());
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
			"<column><column-name>nameOfMaster</column-name><column-value><![CDATA[");
		sb.append(getNameOfMaster());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>doctorName</column-name><column-value><![CDATA[");
		sb.append(getDoctorName());
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
			"<column><column-name>firstPortOfLoadingCode</column-name><column-value><![CDATA[");
		sb.append(getFirstPortOfLoadingCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateOfdeparture</column-name><column-value><![CDATA[");
		sb.append(getDateOfdeparture());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>plantNameFirst</column-name><column-value><![CDATA[");
		sb.append(getPlantNameFirst());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>plantNameBetween</column-name><column-value><![CDATA[");
		sb.append(getPlantNameBetween());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>plantNameThis</column-name><column-value><![CDATA[");
		sb.append(getPlantNameThis());
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
	private String _userCreated;
	private int _documentYear;
	private String _nameOfShip;
	private String _flagStateOfShip;
	private String _nameOfMaster;
	private String _doctorName;
	private int _numberOfCrew;
	private int _numberOfPassengers;
	private String _lastPortOfCallCode;
	private String _nextPortOfCallCode;
	private String _firstPortOfLoadingCode;
	private Date _dateOfdeparture;
	private String _plantNameFirst;
	private String _plantNameBetween;
	private String _plantNameThis;
	private String _signPlace;
	private Date _signDate;
	private int _masterSigned;
	private int _masterSignedImage;
	private long _attachedFile;
	private BaseModel<?> _tempPlantQuarantineRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.class;
}