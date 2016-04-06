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
import vn.dtt.duongbien.dao.vrcb.service.NoticeShipMessageLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class NoticeShipMessageClp extends BaseModelImpl<NoticeShipMessage>
	implements NoticeShipMessage {
	public NoticeShipMessageClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return NoticeShipMessage.class;
	}

	@Override
	public String getModelClassName() {
		return NoticeShipMessage.class.getName();
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
		attributes.put("noticeShipCode", getNoticeShipCode());
		attributes.put("documentName", getDocumentName());
		attributes.put("userCreated", getUserCreated());
		attributes.put("confirmTime", getConfirmTime());
		attributes.put("callSign", getCallSign());
		attributes.put("arrivalDate", getArrivalDate());
		attributes.put("arrivalPortCode", getArrivalPortCode());
		attributes.put("portGoingToCode", getPortGoingToCode());
		attributes.put("nameAndAddOfShipOwners", getNameAndAddOfShipOwners());
		attributes.put("clearanceHeight", getClearanceHeight());
		attributes.put("shownDraft", getShownDraft());
		attributes.put("dwt", getDwt());
		attributes.put("shipAgencyCode", getShipAgencyCode());
		attributes.put("purposeCode", getPurposeCode());
		attributes.put("crewNumber", getCrewNumber());
		attributes.put("passengerNumber", getPassengerNumber());
		attributes.put("quantityAndTypeOfCargo", getQuantityAndTypeOfCargo());
		attributes.put("otherPersons", getOtherPersons());
		attributes.put("remarks", getRemarks());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String noticeShipCode = (String)attributes.get("noticeShipCode");

		if (noticeShipCode != null) {
			setNoticeShipCode(noticeShipCode);
		}

		Long documentName = (Long)attributes.get("documentName");

		if (documentName != null) {
			setDocumentName(documentName);
		}

		String userCreated = (String)attributes.get("userCreated");

		if (userCreated != null) {
			setUserCreated(userCreated);
		}

		Integer confirmTime = (Integer)attributes.get("confirmTime");

		if (confirmTime != null) {
			setConfirmTime(confirmTime);
		}

		String callSign = (String)attributes.get("callSign");

		if (callSign != null) {
			setCallSign(callSign);
		}

		Date arrivalDate = (Date)attributes.get("arrivalDate");

		if (arrivalDate != null) {
			setArrivalDate(arrivalDate);
		}

		String arrivalPortCode = (String)attributes.get("arrivalPortCode");

		if (arrivalPortCode != null) {
			setArrivalPortCode(arrivalPortCode);
		}

		String portGoingToCode = (String)attributes.get("portGoingToCode");

		if (portGoingToCode != null) {
			setPortGoingToCode(portGoingToCode);
		}

		String nameAndAddOfShipOwners = (String)attributes.get(
				"nameAndAddOfShipOwners");

		if (nameAndAddOfShipOwners != null) {
			setNameAndAddOfShipOwners(nameAndAddOfShipOwners);
		}

		Long clearanceHeight = (Long)attributes.get("clearanceHeight");

		if (clearanceHeight != null) {
			setClearanceHeight(clearanceHeight);
		}

		Long shownDraft = (Long)attributes.get("shownDraft");

		if (shownDraft != null) {
			setShownDraft(shownDraft);
		}

		Long dwt = (Long)attributes.get("dwt");

		if (dwt != null) {
			setDwt(dwt);
		}

		String shipAgencyCode = (String)attributes.get("shipAgencyCode");

		if (shipAgencyCode != null) {
			setShipAgencyCode(shipAgencyCode);
		}

		Integer purposeCode = (Integer)attributes.get("purposeCode");

		if (purposeCode != null) {
			setPurposeCode(purposeCode);
		}

		Long crewNumber = (Long)attributes.get("crewNumber");

		if (crewNumber != null) {
			setCrewNumber(crewNumber);
		}

		Long passengerNumber = (Long)attributes.get("passengerNumber");

		if (passengerNumber != null) {
			setPassengerNumber(passengerNumber);
		}

		String quantityAndTypeOfCargo = (String)attributes.get(
				"quantityAndTypeOfCargo");

		if (quantityAndTypeOfCargo != null) {
			setQuantityAndTypeOfCargo(quantityAndTypeOfCargo);
		}

		Integer otherPersons = (Integer)attributes.get("otherPersons");

		if (otherPersons != null) {
			setOtherPersons(otherPersons);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_noticeShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _noticeShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_noticeShipMessageRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNoticeShipCode() {
		return _noticeShipCode;
	}

	@Override
	public void setNoticeShipCode(String noticeShipCode) {
		_noticeShipCode = noticeShipCode;

		if (_noticeShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _noticeShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setNoticeShipCode",
						String.class);

				method.invoke(_noticeShipMessageRemoteModel, noticeShipCode);
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

		if (_noticeShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _noticeShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentName", long.class);

				method.invoke(_noticeShipMessageRemoteModel, documentName);
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

		if (_noticeShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _noticeShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setUserCreated", String.class);

				method.invoke(_noticeShipMessageRemoteModel, userCreated);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getConfirmTime() {
		return _confirmTime;
	}

	@Override
	public void setConfirmTime(int confirmTime) {
		_confirmTime = confirmTime;

		if (_noticeShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _noticeShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setConfirmTime", int.class);

				method.invoke(_noticeShipMessageRemoteModel, confirmTime);
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

		if (_noticeShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _noticeShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setCallSign", String.class);

				method.invoke(_noticeShipMessageRemoteModel, callSign);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getArrivalDate() {
		return _arrivalDate;
	}

	@Override
	public void setArrivalDate(Date arrivalDate) {
		_arrivalDate = arrivalDate;

		if (_noticeShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _noticeShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setArrivalDate", Date.class);

				method.invoke(_noticeShipMessageRemoteModel, arrivalDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getArrivalPortCode() {
		return _arrivalPortCode;
	}

	@Override
	public void setArrivalPortCode(String arrivalPortCode) {
		_arrivalPortCode = arrivalPortCode;

		if (_noticeShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _noticeShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setArrivalPortCode",
						String.class);

				method.invoke(_noticeShipMessageRemoteModel, arrivalPortCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPortGoingToCode() {
		return _portGoingToCode;
	}

	@Override
	public void setPortGoingToCode(String portGoingToCode) {
		_portGoingToCode = portGoingToCode;

		if (_noticeShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _noticeShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setPortGoingToCode",
						String.class);

				method.invoke(_noticeShipMessageRemoteModel, portGoingToCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNameAndAddOfShipOwners() {
		return _nameAndAddOfShipOwners;
	}

	@Override
	public void setNameAndAddOfShipOwners(String nameAndAddOfShipOwners) {
		_nameAndAddOfShipOwners = nameAndAddOfShipOwners;

		if (_noticeShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _noticeShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setNameAndAddOfShipOwners",
						String.class);

				method.invoke(_noticeShipMessageRemoteModel,
					nameAndAddOfShipOwners);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getClearanceHeight() {
		return _clearanceHeight;
	}

	@Override
	public void setClearanceHeight(long clearanceHeight) {
		_clearanceHeight = clearanceHeight;

		if (_noticeShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _noticeShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setClearanceHeight", long.class);

				method.invoke(_noticeShipMessageRemoteModel, clearanceHeight);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getShownDraft() {
		return _shownDraft;
	}

	@Override
	public void setShownDraft(long shownDraft) {
		_shownDraft = shownDraft;

		if (_noticeShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _noticeShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setShownDraft", long.class);

				method.invoke(_noticeShipMessageRemoteModel, shownDraft);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDwt() {
		return _dwt;
	}

	@Override
	public void setDwt(long dwt) {
		_dwt = dwt;

		if (_noticeShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _noticeShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setDwt", long.class);

				method.invoke(_noticeShipMessageRemoteModel, dwt);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getShipAgencyCode() {
		return _shipAgencyCode;
	}

	@Override
	public void setShipAgencyCode(String shipAgencyCode) {
		_shipAgencyCode = shipAgencyCode;

		if (_noticeShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _noticeShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setShipAgencyCode",
						String.class);

				method.invoke(_noticeShipMessageRemoteModel, shipAgencyCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPurposeCode() {
		return _purposeCode;
	}

	@Override
	public void setPurposeCode(int purposeCode) {
		_purposeCode = purposeCode;

		if (_noticeShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _noticeShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setPurposeCode", int.class);

				method.invoke(_noticeShipMessageRemoteModel, purposeCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCrewNumber() {
		return _crewNumber;
	}

	@Override
	public void setCrewNumber(long crewNumber) {
		_crewNumber = crewNumber;

		if (_noticeShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _noticeShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setCrewNumber", long.class);

				method.invoke(_noticeShipMessageRemoteModel, crewNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPassengerNumber() {
		return _passengerNumber;
	}

	@Override
	public void setPassengerNumber(long passengerNumber) {
		_passengerNumber = passengerNumber;

		if (_noticeShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _noticeShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setPassengerNumber", long.class);

				method.invoke(_noticeShipMessageRemoteModel, passengerNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getQuantityAndTypeOfCargo() {
		return _quantityAndTypeOfCargo;
	}

	@Override
	public void setQuantityAndTypeOfCargo(String quantityAndTypeOfCargo) {
		_quantityAndTypeOfCargo = quantityAndTypeOfCargo;

		if (_noticeShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _noticeShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setQuantityAndTypeOfCargo",
						String.class);

				method.invoke(_noticeShipMessageRemoteModel,
					quantityAndTypeOfCargo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getOtherPersons() {
		return _otherPersons;
	}

	@Override
	public void setOtherPersons(int otherPersons) {
		_otherPersons = otherPersons;

		if (_noticeShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _noticeShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setOtherPersons", int.class);

				method.invoke(_noticeShipMessageRemoteModel, otherPersons);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRemarks() {
		return _remarks;
	}

	@Override
	public void setRemarks(String remarks) {
		_remarks = remarks;

		if (_noticeShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _noticeShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setRemarks", String.class);

				method.invoke(_noticeShipMessageRemoteModel, remarks);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getNoticeShipMessageRemoteModel() {
		return _noticeShipMessageRemoteModel;
	}

	public void setNoticeShipMessageRemoteModel(
		BaseModel<?> noticeShipMessageRemoteModel) {
		_noticeShipMessageRemoteModel = noticeShipMessageRemoteModel;
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

		Class<?> remoteModelClass = _noticeShipMessageRemoteModel.getClass();

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

		Object returnValue = method.invoke(_noticeShipMessageRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			NoticeShipMessageLocalServiceUtil.addNoticeShipMessage(this);
		}
		else {
			NoticeShipMessageLocalServiceUtil.updateNoticeShipMessage(this);
		}
	}

	@Override
	public NoticeShipMessage toEscapedModel() {
		return (NoticeShipMessage)ProxyUtil.newProxyInstance(NoticeShipMessage.class.getClassLoader(),
			new Class[] { NoticeShipMessage.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		NoticeShipMessageClp clone = new NoticeShipMessageClp();

		clone.setId(getId());
		clone.setNoticeShipCode(getNoticeShipCode());
		clone.setDocumentName(getDocumentName());
		clone.setUserCreated(getUserCreated());
		clone.setConfirmTime(getConfirmTime());
		clone.setCallSign(getCallSign());
		clone.setArrivalDate(getArrivalDate());
		clone.setArrivalPortCode(getArrivalPortCode());
		clone.setPortGoingToCode(getPortGoingToCode());
		clone.setNameAndAddOfShipOwners(getNameAndAddOfShipOwners());
		clone.setClearanceHeight(getClearanceHeight());
		clone.setShownDraft(getShownDraft());
		clone.setDwt(getDwt());
		clone.setShipAgencyCode(getShipAgencyCode());
		clone.setPurposeCode(getPurposeCode());
		clone.setCrewNumber(getCrewNumber());
		clone.setPassengerNumber(getPassengerNumber());
		clone.setQuantityAndTypeOfCargo(getQuantityAndTypeOfCargo());
		clone.setOtherPersons(getOtherPersons());
		clone.setRemarks(getRemarks());

		return clone;
	}

	@Override
	public int compareTo(NoticeShipMessage noticeShipMessage) {
		int value = 0;

		if (getId() < noticeShipMessage.getId()) {
			value = -1;
		}
		else if (getId() > noticeShipMessage.getId()) {
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

		if (!(obj instanceof NoticeShipMessageClp)) {
			return false;
		}

		NoticeShipMessageClp noticeShipMessage = (NoticeShipMessageClp)obj;

		long primaryKey = noticeShipMessage.getPrimaryKey();

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
		StringBundler sb = new StringBundler(41);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", noticeShipCode=");
		sb.append(getNoticeShipCode());
		sb.append(", documentName=");
		sb.append(getDocumentName());
		sb.append(", userCreated=");
		sb.append(getUserCreated());
		sb.append(", confirmTime=");
		sb.append(getConfirmTime());
		sb.append(", callSign=");
		sb.append(getCallSign());
		sb.append(", arrivalDate=");
		sb.append(getArrivalDate());
		sb.append(", arrivalPortCode=");
		sb.append(getArrivalPortCode());
		sb.append(", portGoingToCode=");
		sb.append(getPortGoingToCode());
		sb.append(", nameAndAddOfShipOwners=");
		sb.append(getNameAndAddOfShipOwners());
		sb.append(", clearanceHeight=");
		sb.append(getClearanceHeight());
		sb.append(", shownDraft=");
		sb.append(getShownDraft());
		sb.append(", dwt=");
		sb.append(getDwt());
		sb.append(", shipAgencyCode=");
		sb.append(getShipAgencyCode());
		sb.append(", purposeCode=");
		sb.append(getPurposeCode());
		sb.append(", crewNumber=");
		sb.append(getCrewNumber());
		sb.append(", passengerNumber=");
		sb.append(getPassengerNumber());
		sb.append(", quantityAndTypeOfCargo=");
		sb.append(getQuantityAndTypeOfCargo());
		sb.append(", otherPersons=");
		sb.append(getOtherPersons());
		sb.append(", remarks=");
		sb.append(getRemarks());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(64);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.NoticeShipMessage");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>noticeShipCode</column-name><column-value><![CDATA[");
		sb.append(getNoticeShipCode());
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
			"<column><column-name>confirmTime</column-name><column-value><![CDATA[");
		sb.append(getConfirmTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>callSign</column-name><column-value><![CDATA[");
		sb.append(getCallSign());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>arrivalDate</column-name><column-value><![CDATA[");
		sb.append(getArrivalDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>arrivalPortCode</column-name><column-value><![CDATA[");
		sb.append(getArrivalPortCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portGoingToCode</column-name><column-value><![CDATA[");
		sb.append(getPortGoingToCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameAndAddOfShipOwners</column-name><column-value><![CDATA[");
		sb.append(getNameAndAddOfShipOwners());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>clearanceHeight</column-name><column-value><![CDATA[");
		sb.append(getClearanceHeight());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shownDraft</column-name><column-value><![CDATA[");
		sb.append(getShownDraft());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dwt</column-name><column-value><![CDATA[");
		sb.append(getDwt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipAgencyCode</column-name><column-value><![CDATA[");
		sb.append(getShipAgencyCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>purposeCode</column-name><column-value><![CDATA[");
		sb.append(getPurposeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>crewNumber</column-name><column-value><![CDATA[");
		sb.append(getCrewNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>passengerNumber</column-name><column-value><![CDATA[");
		sb.append(getPassengerNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>quantityAndTypeOfCargo</column-name><column-value><![CDATA[");
		sb.append(getQuantityAndTypeOfCargo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>otherPersons</column-name><column-value><![CDATA[");
		sb.append(getOtherPersons());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remarks</column-name><column-value><![CDATA[");
		sb.append(getRemarks());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _noticeShipCode;
	private long _documentName;
	private String _userCreated;
	private int _confirmTime;
	private String _callSign;
	private Date _arrivalDate;
	private String _arrivalPortCode;
	private String _portGoingToCode;
	private String _nameAndAddOfShipOwners;
	private long _clearanceHeight;
	private long _shownDraft;
	private long _dwt;
	private String _shipAgencyCode;
	private int _purposeCode;
	private long _crewNumber;
	private long _passengerNumber;
	private String _quantityAndTypeOfCargo;
	private int _otherPersons;
	private String _remarks;
	private BaseModel<?> _noticeShipMessageRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.class;
}