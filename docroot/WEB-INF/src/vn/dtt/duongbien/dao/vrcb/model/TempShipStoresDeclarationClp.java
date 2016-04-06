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
import vn.dtt.duongbien.dao.vrcb.service.TempShipStoresDeclarationLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class TempShipStoresDeclarationClp extends BaseModelImpl<TempShipStoresDeclaration>
	implements TempShipStoresDeclaration {
	public TempShipStoresDeclarationClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TempShipStoresDeclaration.class;
	}

	@Override
	public String getModelClassName() {
		return TempShipStoresDeclaration.class.getName();
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
		attributes.put("callsign", getCallsign());
		attributes.put("voyageNumber", getVoyageNumber());
		attributes.put("nationalityOfShip", getNationalityOfShip());
		attributes.put("portOfArrivalCode", getPortOfArrivalCode());
		attributes.put("dateOfArrival", getDateOfArrival());
		attributes.put("lastPortOfCallCode", getLastPortOfCallCode());
		attributes.put("numberOfPersonsOnBoat", getNumberOfPersonsOnBoat());
		attributes.put("periodOfStay", getPeriodOfStay());
		attributes.put("periodOfStayUnit", getPeriodOfStayUnit());
		attributes.put("nameOfMaster", getNameOfMaster());
		attributes.put("listShipsStores", getListShipsStores());
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

		String callsign = (String)attributes.get("callsign");

		if (callsign != null) {
			setCallsign(callsign);
		}

		String voyageNumber = (String)attributes.get("voyageNumber");

		if (voyageNumber != null) {
			setVoyageNumber(voyageNumber);
		}

		String nationalityOfShip = (String)attributes.get("nationalityOfShip");

		if (nationalityOfShip != null) {
			setNationalityOfShip(nationalityOfShip);
		}

		String portOfArrivalCode = (String)attributes.get("portOfArrivalCode");

		if (portOfArrivalCode != null) {
			setPortOfArrivalCode(portOfArrivalCode);
		}

		Date dateOfArrival = (Date)attributes.get("dateOfArrival");

		if (dateOfArrival != null) {
			setDateOfArrival(dateOfArrival);
		}

		String lastPortOfCallCode = (String)attributes.get("lastPortOfCallCode");

		if (lastPortOfCallCode != null) {
			setLastPortOfCallCode(lastPortOfCallCode);
		}

		Integer numberOfPersonsOnBoat = (Integer)attributes.get(
				"numberOfPersonsOnBoat");

		if (numberOfPersonsOnBoat != null) {
			setNumberOfPersonsOnBoat(numberOfPersonsOnBoat);
		}

		String periodOfStay = (String)attributes.get("periodOfStay");

		if (periodOfStay != null) {
			setPeriodOfStay(periodOfStay);
		}

		String periodOfStayUnit = (String)attributes.get("periodOfStayUnit");

		if (periodOfStayUnit != null) {
			setPeriodOfStayUnit(periodOfStayUnit);
		}

		String nameOfMaster = (String)attributes.get("nameOfMaster");

		if (nameOfMaster != null) {
			setNameOfMaster(nameOfMaster);
		}

		Integer listShipsStores = (Integer)attributes.get("listShipsStores");

		if (listShipsStores != null) {
			setListShipsStores(listShipsStores);
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

		if (_tempShipStoresDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipStoresDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tempShipStoresDeclarationRemoteModel, id);
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

		if (_tempShipStoresDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipStoresDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestCode", String.class);

				method.invoke(_tempShipStoresDeclarationRemoteModel, requestCode);
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

		if (_tempShipStoresDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipStoresDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestState", int.class);

				method.invoke(_tempShipStoresDeclarationRemoteModel,
					requestState);
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

		if (_tempShipStoresDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipStoresDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentName", long.class);

				method.invoke(_tempShipStoresDeclarationRemoteModel,
					documentName);
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

		if (_tempShipStoresDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipStoresDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentYear", int.class);

				method.invoke(_tempShipStoresDeclarationRemoteModel,
					documentYear);
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

		if (_tempShipStoresDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipStoresDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setUserCreated", String.class);

				method.invoke(_tempShipStoresDeclarationRemoteModel, userCreated);
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

		if (_tempShipStoresDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipStoresDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setIsArrival", int.class);

				method.invoke(_tempShipStoresDeclarationRemoteModel, isArrival);
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

		if (_tempShipStoresDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipStoresDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setNameOfShip", String.class);

				method.invoke(_tempShipStoresDeclarationRemoteModel, nameOfShip);
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

		if (_tempShipStoresDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipStoresDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setImoNumber", String.class);

				method.invoke(_tempShipStoresDeclarationRemoteModel, imoNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCallsign() {
		return _callsign;
	}

	@Override
	public void setCallsign(String callsign) {
		_callsign = callsign;

		if (_tempShipStoresDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipStoresDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setCallsign", String.class);

				method.invoke(_tempShipStoresDeclarationRemoteModel, callsign);
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

		if (_tempShipStoresDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipStoresDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setVoyageNumber", String.class);

				method.invoke(_tempShipStoresDeclarationRemoteModel,
					voyageNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNationalityOfShip() {
		return _nationalityOfShip;
	}

	@Override
	public void setNationalityOfShip(String nationalityOfShip) {
		_nationalityOfShip = nationalityOfShip;

		if (_tempShipStoresDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipStoresDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setNationalityOfShip",
						String.class);

				method.invoke(_tempShipStoresDeclarationRemoteModel,
					nationalityOfShip);
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

		if (_tempShipStoresDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipStoresDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setPortOfArrivalCode",
						String.class);

				method.invoke(_tempShipStoresDeclarationRemoteModel,
					portOfArrivalCode);
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

		if (_tempShipStoresDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipStoresDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setDateOfArrival", Date.class);

				method.invoke(_tempShipStoresDeclarationRemoteModel,
					dateOfArrival);
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

		if (_tempShipStoresDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipStoresDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setLastPortOfCallCode",
						String.class);

				method.invoke(_tempShipStoresDeclarationRemoteModel,
					lastPortOfCallCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNumberOfPersonsOnBoat() {
		return _numberOfPersonsOnBoat;
	}

	@Override
	public void setNumberOfPersonsOnBoat(int numberOfPersonsOnBoat) {
		_numberOfPersonsOnBoat = numberOfPersonsOnBoat;

		if (_tempShipStoresDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipStoresDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setNumberOfPersonsOnBoat",
						int.class);

				method.invoke(_tempShipStoresDeclarationRemoteModel,
					numberOfPersonsOnBoat);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPeriodOfStay() {
		return _periodOfStay;
	}

	@Override
	public void setPeriodOfStay(String periodOfStay) {
		_periodOfStay = periodOfStay;

		if (_tempShipStoresDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipStoresDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setPeriodOfStay", String.class);

				method.invoke(_tempShipStoresDeclarationRemoteModel,
					periodOfStay);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPeriodOfStayUnit() {
		return _periodOfStayUnit;
	}

	@Override
	public void setPeriodOfStayUnit(String periodOfStayUnit) {
		_periodOfStayUnit = periodOfStayUnit;

		if (_tempShipStoresDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipStoresDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setPeriodOfStayUnit",
						String.class);

				method.invoke(_tempShipStoresDeclarationRemoteModel,
					periodOfStayUnit);
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

		if (_tempShipStoresDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipStoresDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setNameOfMaster", String.class);

				method.invoke(_tempShipStoresDeclarationRemoteModel,
					nameOfMaster);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getListShipsStores() {
		return _listShipsStores;
	}

	@Override
	public void setListShipsStores(int listShipsStores) {
		_listShipsStores = listShipsStores;

		if (_tempShipStoresDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipStoresDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setListShipsStores", int.class);

				method.invoke(_tempShipStoresDeclarationRemoteModel,
					listShipsStores);
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

		if (_tempShipStoresDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipStoresDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setSignPlace", String.class);

				method.invoke(_tempShipStoresDeclarationRemoteModel, signPlace);
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

		if (_tempShipStoresDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipStoresDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setSignDate", Date.class);

				method.invoke(_tempShipStoresDeclarationRemoteModel, signDate);
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

		if (_tempShipStoresDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipStoresDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setMasterSigned", int.class);

				method.invoke(_tempShipStoresDeclarationRemoteModel,
					masterSigned);
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

		if (_tempShipStoresDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipStoresDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setMasterSignedImage",
						int.class);

				method.invoke(_tempShipStoresDeclarationRemoteModel,
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

		if (_tempShipStoresDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipStoresDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setAttachedFile", long.class);

				method.invoke(_tempShipStoresDeclarationRemoteModel,
					attachedFile);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTempShipStoresDeclarationRemoteModel() {
		return _tempShipStoresDeclarationRemoteModel;
	}

	public void setTempShipStoresDeclarationRemoteModel(
		BaseModel<?> tempShipStoresDeclarationRemoteModel) {
		_tempShipStoresDeclarationRemoteModel = tempShipStoresDeclarationRemoteModel;
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

		Class<?> remoteModelClass = _tempShipStoresDeclarationRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tempShipStoresDeclarationRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TempShipStoresDeclarationLocalServiceUtil.addTempShipStoresDeclaration(this);
		}
		else {
			TempShipStoresDeclarationLocalServiceUtil.updateTempShipStoresDeclaration(this);
		}
	}

	@Override
	public TempShipStoresDeclaration toEscapedModel() {
		return (TempShipStoresDeclaration)ProxyUtil.newProxyInstance(TempShipStoresDeclaration.class.getClassLoader(),
			new Class[] { TempShipStoresDeclaration.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempShipStoresDeclarationClp clone = new TempShipStoresDeclarationClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setRequestState(getRequestState());
		clone.setDocumentName(getDocumentName());
		clone.setDocumentYear(getDocumentYear());
		clone.setUserCreated(getUserCreated());
		clone.setIsArrival(getIsArrival());
		clone.setNameOfShip(getNameOfShip());
		clone.setImoNumber(getImoNumber());
		clone.setCallsign(getCallsign());
		clone.setVoyageNumber(getVoyageNumber());
		clone.setNationalityOfShip(getNationalityOfShip());
		clone.setPortOfArrivalCode(getPortOfArrivalCode());
		clone.setDateOfArrival(getDateOfArrival());
		clone.setLastPortOfCallCode(getLastPortOfCallCode());
		clone.setNumberOfPersonsOnBoat(getNumberOfPersonsOnBoat());
		clone.setPeriodOfStay(getPeriodOfStay());
		clone.setPeriodOfStayUnit(getPeriodOfStayUnit());
		clone.setNameOfMaster(getNameOfMaster());
		clone.setListShipsStores(getListShipsStores());
		clone.setSignPlace(getSignPlace());
		clone.setSignDate(getSignDate());
		clone.setMasterSigned(getMasterSigned());
		clone.setMasterSignedImage(getMasterSignedImage());
		clone.setAttachedFile(getAttachedFile());

		return clone;
	}

	@Override
	public int compareTo(TempShipStoresDeclaration tempShipStoresDeclaration) {
		int value = 0;

		if (getId() < tempShipStoresDeclaration.getId()) {
			value = -1;
		}
		else if (getId() > tempShipStoresDeclaration.getId()) {
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

		if (!(obj instanceof TempShipStoresDeclarationClp)) {
			return false;
		}

		TempShipStoresDeclarationClp tempShipStoresDeclaration = (TempShipStoresDeclarationClp)obj;

		long primaryKey = tempShipStoresDeclaration.getPrimaryKey();

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
		StringBundler sb = new StringBundler(51);

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
		sb.append(", callsign=");
		sb.append(getCallsign());
		sb.append(", voyageNumber=");
		sb.append(getVoyageNumber());
		sb.append(", nationalityOfShip=");
		sb.append(getNationalityOfShip());
		sb.append(", portOfArrivalCode=");
		sb.append(getPortOfArrivalCode());
		sb.append(", dateOfArrival=");
		sb.append(getDateOfArrival());
		sb.append(", lastPortOfCallCode=");
		sb.append(getLastPortOfCallCode());
		sb.append(", numberOfPersonsOnBoat=");
		sb.append(getNumberOfPersonsOnBoat());
		sb.append(", periodOfStay=");
		sb.append(getPeriodOfStay());
		sb.append(", periodOfStayUnit=");
		sb.append(getPeriodOfStayUnit());
		sb.append(", nameOfMaster=");
		sb.append(getNameOfMaster());
		sb.append(", listShipsStores=");
		sb.append(getListShipsStores());
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
		StringBundler sb = new StringBundler(79);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.TempShipStoresDeclaration");
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
			"<column><column-name>callsign</column-name><column-value><![CDATA[");
		sb.append(getCallsign());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>voyageNumber</column-name><column-value><![CDATA[");
		sb.append(getVoyageNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nationalityOfShip</column-name><column-value><![CDATA[");
		sb.append(getNationalityOfShip());
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
			"<column><column-name>lastPortOfCallCode</column-name><column-value><![CDATA[");
		sb.append(getLastPortOfCallCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>numberOfPersonsOnBoat</column-name><column-value><![CDATA[");
		sb.append(getNumberOfPersonsOnBoat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>periodOfStay</column-name><column-value><![CDATA[");
		sb.append(getPeriodOfStay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>periodOfStayUnit</column-name><column-value><![CDATA[");
		sb.append(getPeriodOfStayUnit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameOfMaster</column-name><column-value><![CDATA[");
		sb.append(getNameOfMaster());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>listShipsStores</column-name><column-value><![CDATA[");
		sb.append(getListShipsStores());
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
	private String _callsign;
	private String _voyageNumber;
	private String _nationalityOfShip;
	private String _portOfArrivalCode;
	private Date _dateOfArrival;
	private String _lastPortOfCallCode;
	private int _numberOfPersonsOnBoat;
	private String _periodOfStay;
	private String _periodOfStayUnit;
	private String _nameOfMaster;
	private int _listShipsStores;
	private String _signPlace;
	private Date _signDate;
	private int _masterSigned;
	private int _masterSignedImage;
	private long _attachedFile;
	private BaseModel<?> _tempShipStoresDeclarationRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.class;
}