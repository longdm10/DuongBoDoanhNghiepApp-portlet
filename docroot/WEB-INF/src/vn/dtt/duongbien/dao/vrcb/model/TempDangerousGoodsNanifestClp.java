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
import vn.dtt.duongbien.dao.vrcb.service.TempDangerousGoodsNanifestLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class TempDangerousGoodsNanifestClp extends BaseModelImpl<TempDangerousGoodsNanifest>
	implements TempDangerousGoodsNanifest {
	public TempDangerousGoodsNanifestClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TempDangerousGoodsNanifest.class;
	}

	@Override
	public String getModelClassName() {
		return TempDangerousGoodsNanifest.class.getName();
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
		attributes.put("nameOfShip", getNameOfShip());
		attributes.put("flagStateOfShip", getFlagStateOfShip());
		attributes.put("masterName", getMasterName());
		attributes.put("imoNumber", getImoNumber());
		attributes.put("callsign", getCallsign());
		attributes.put("voyageNumber", getVoyageNumber());
		attributes.put("portOfLoadingCode", getPortOfLoadingCode());
		attributes.put("portOfDischargeCode", getPortOfDischargeCode());
		attributes.put("shippingAgent", getShippingAgent());
		attributes.put("additionalRemark", getAdditionalRemark());
		attributes.put("listDangerousGoods", getListDangerousGoods());
		attributes.put("signPlace", getSignPlace());
		attributes.put("signDate", getSignDate());
		attributes.put("masterSigned", getMasterSigned());
		attributes.put("masterSignedImage", getMasterSignedImage());
		attributes.put("attachedFile", getAttachedFile());
		attributes.put("documentYear", getDocumentYear());

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

		String nameOfShip = (String)attributes.get("nameOfShip");

		if (nameOfShip != null) {
			setNameOfShip(nameOfShip);
		}

		String flagStateOfShip = (String)attributes.get("flagStateOfShip");

		if (flagStateOfShip != null) {
			setFlagStateOfShip(flagStateOfShip);
		}

		String masterName = (String)attributes.get("masterName");

		if (masterName != null) {
			setMasterName(masterName);
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

		String portOfLoadingCode = (String)attributes.get("portOfLoadingCode");

		if (portOfLoadingCode != null) {
			setPortOfLoadingCode(portOfLoadingCode);
		}

		String portOfDischargeCode = (String)attributes.get(
				"portOfDischargeCode");

		if (portOfDischargeCode != null) {
			setPortOfDischargeCode(portOfDischargeCode);
		}

		String shippingAgent = (String)attributes.get("shippingAgent");

		if (shippingAgent != null) {
			setShippingAgent(shippingAgent);
		}

		String additionalRemark = (String)attributes.get("additionalRemark");

		if (additionalRemark != null) {
			setAdditionalRemark(additionalRemark);
		}

		Integer listDangerousGoods = (Integer)attributes.get(
				"listDangerousGoods");

		if (listDangerousGoods != null) {
			setListDangerousGoods(listDangerousGoods);
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

		Integer documentYear = (Integer)attributes.get("documentYear");

		if (documentYear != null) {
			setDocumentYear(documentYear);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tempDangerousGoodsNanifestRemoteModel != null) {
			try {
				Class<?> clazz = _tempDangerousGoodsNanifestRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tempDangerousGoodsNanifestRemoteModel, id);
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

		if (_tempDangerousGoodsNanifestRemoteModel != null) {
			try {
				Class<?> clazz = _tempDangerousGoodsNanifestRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestCode", String.class);

				method.invoke(_tempDangerousGoodsNanifestRemoteModel,
					requestCode);
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

		if (_tempDangerousGoodsNanifestRemoteModel != null) {
			try {
				Class<?> clazz = _tempDangerousGoodsNanifestRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestState", int.class);

				method.invoke(_tempDangerousGoodsNanifestRemoteModel,
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

		if (_tempDangerousGoodsNanifestRemoteModel != null) {
			try {
				Class<?> clazz = _tempDangerousGoodsNanifestRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentName", long.class);

				method.invoke(_tempDangerousGoodsNanifestRemoteModel,
					documentName);
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

		if (_tempDangerousGoodsNanifestRemoteModel != null) {
			try {
				Class<?> clazz = _tempDangerousGoodsNanifestRemoteModel.getClass();

				Method method = clazz.getMethod("setUserCreated", String.class);

				method.invoke(_tempDangerousGoodsNanifestRemoteModel,
					userCreated);
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

		if (_tempDangerousGoodsNanifestRemoteModel != null) {
			try {
				Class<?> clazz = _tempDangerousGoodsNanifestRemoteModel.getClass();

				Method method = clazz.getMethod("setNameOfShip", String.class);

				method.invoke(_tempDangerousGoodsNanifestRemoteModel, nameOfShip);
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

		if (_tempDangerousGoodsNanifestRemoteModel != null) {
			try {
				Class<?> clazz = _tempDangerousGoodsNanifestRemoteModel.getClass();

				Method method = clazz.getMethod("setFlagStateOfShip",
						String.class);

				method.invoke(_tempDangerousGoodsNanifestRemoteModel,
					flagStateOfShip);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMasterName() {
		return _masterName;
	}

	@Override
	public void setMasterName(String masterName) {
		_masterName = masterName;

		if (_tempDangerousGoodsNanifestRemoteModel != null) {
			try {
				Class<?> clazz = _tempDangerousGoodsNanifestRemoteModel.getClass();

				Method method = clazz.getMethod("setMasterName", String.class);

				method.invoke(_tempDangerousGoodsNanifestRemoteModel, masterName);
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

		if (_tempDangerousGoodsNanifestRemoteModel != null) {
			try {
				Class<?> clazz = _tempDangerousGoodsNanifestRemoteModel.getClass();

				Method method = clazz.getMethod("setImoNumber", String.class);

				method.invoke(_tempDangerousGoodsNanifestRemoteModel, imoNumber);
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

		if (_tempDangerousGoodsNanifestRemoteModel != null) {
			try {
				Class<?> clazz = _tempDangerousGoodsNanifestRemoteModel.getClass();

				Method method = clazz.getMethod("setCallsign", String.class);

				method.invoke(_tempDangerousGoodsNanifestRemoteModel, callsign);
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

		if (_tempDangerousGoodsNanifestRemoteModel != null) {
			try {
				Class<?> clazz = _tempDangerousGoodsNanifestRemoteModel.getClass();

				Method method = clazz.getMethod("setVoyageNumber", String.class);

				method.invoke(_tempDangerousGoodsNanifestRemoteModel,
					voyageNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPortOfLoadingCode() {
		return _portOfLoadingCode;
	}

	@Override
	public void setPortOfLoadingCode(String portOfLoadingCode) {
		_portOfLoadingCode = portOfLoadingCode;

		if (_tempDangerousGoodsNanifestRemoteModel != null) {
			try {
				Class<?> clazz = _tempDangerousGoodsNanifestRemoteModel.getClass();

				Method method = clazz.getMethod("setPortOfLoadingCode",
						String.class);

				method.invoke(_tempDangerousGoodsNanifestRemoteModel,
					portOfLoadingCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPortOfDischargeCode() {
		return _portOfDischargeCode;
	}

	@Override
	public void setPortOfDischargeCode(String portOfDischargeCode) {
		_portOfDischargeCode = portOfDischargeCode;

		if (_tempDangerousGoodsNanifestRemoteModel != null) {
			try {
				Class<?> clazz = _tempDangerousGoodsNanifestRemoteModel.getClass();

				Method method = clazz.getMethod("setPortOfDischargeCode",
						String.class);

				method.invoke(_tempDangerousGoodsNanifestRemoteModel,
					portOfDischargeCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getShippingAgent() {
		return _shippingAgent;
	}

	@Override
	public void setShippingAgent(String shippingAgent) {
		_shippingAgent = shippingAgent;

		if (_tempDangerousGoodsNanifestRemoteModel != null) {
			try {
				Class<?> clazz = _tempDangerousGoodsNanifestRemoteModel.getClass();

				Method method = clazz.getMethod("setShippingAgent", String.class);

				method.invoke(_tempDangerousGoodsNanifestRemoteModel,
					shippingAgent);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAdditionalRemark() {
		return _additionalRemark;
	}

	@Override
	public void setAdditionalRemark(String additionalRemark) {
		_additionalRemark = additionalRemark;

		if (_tempDangerousGoodsNanifestRemoteModel != null) {
			try {
				Class<?> clazz = _tempDangerousGoodsNanifestRemoteModel.getClass();

				Method method = clazz.getMethod("setAdditionalRemark",
						String.class);

				method.invoke(_tempDangerousGoodsNanifestRemoteModel,
					additionalRemark);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getListDangerousGoods() {
		return _listDangerousGoods;
	}

	@Override
	public void setListDangerousGoods(int listDangerousGoods) {
		_listDangerousGoods = listDangerousGoods;

		if (_tempDangerousGoodsNanifestRemoteModel != null) {
			try {
				Class<?> clazz = _tempDangerousGoodsNanifestRemoteModel.getClass();

				Method method = clazz.getMethod("setListDangerousGoods",
						int.class);

				method.invoke(_tempDangerousGoodsNanifestRemoteModel,
					listDangerousGoods);
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

		if (_tempDangerousGoodsNanifestRemoteModel != null) {
			try {
				Class<?> clazz = _tempDangerousGoodsNanifestRemoteModel.getClass();

				Method method = clazz.getMethod("setSignPlace", String.class);

				method.invoke(_tempDangerousGoodsNanifestRemoteModel, signPlace);
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

		if (_tempDangerousGoodsNanifestRemoteModel != null) {
			try {
				Class<?> clazz = _tempDangerousGoodsNanifestRemoteModel.getClass();

				Method method = clazz.getMethod("setSignDate", Date.class);

				method.invoke(_tempDangerousGoodsNanifestRemoteModel, signDate);
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

		if (_tempDangerousGoodsNanifestRemoteModel != null) {
			try {
				Class<?> clazz = _tempDangerousGoodsNanifestRemoteModel.getClass();

				Method method = clazz.getMethod("setMasterSigned", int.class);

				method.invoke(_tempDangerousGoodsNanifestRemoteModel,
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

		if (_tempDangerousGoodsNanifestRemoteModel != null) {
			try {
				Class<?> clazz = _tempDangerousGoodsNanifestRemoteModel.getClass();

				Method method = clazz.getMethod("setMasterSignedImage",
						int.class);

				method.invoke(_tempDangerousGoodsNanifestRemoteModel,
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

		if (_tempDangerousGoodsNanifestRemoteModel != null) {
			try {
				Class<?> clazz = _tempDangerousGoodsNanifestRemoteModel.getClass();

				Method method = clazz.getMethod("setAttachedFile", long.class);

				method.invoke(_tempDangerousGoodsNanifestRemoteModel,
					attachedFile);
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

		if (_tempDangerousGoodsNanifestRemoteModel != null) {
			try {
				Class<?> clazz = _tempDangerousGoodsNanifestRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentYear", int.class);

				method.invoke(_tempDangerousGoodsNanifestRemoteModel,
					documentYear);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTempDangerousGoodsNanifestRemoteModel() {
		return _tempDangerousGoodsNanifestRemoteModel;
	}

	public void setTempDangerousGoodsNanifestRemoteModel(
		BaseModel<?> tempDangerousGoodsNanifestRemoteModel) {
		_tempDangerousGoodsNanifestRemoteModel = tempDangerousGoodsNanifestRemoteModel;
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

		Class<?> remoteModelClass = _tempDangerousGoodsNanifestRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tempDangerousGoodsNanifestRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TempDangerousGoodsNanifestLocalServiceUtil.addTempDangerousGoodsNanifest(this);
		}
		else {
			TempDangerousGoodsNanifestLocalServiceUtil.updateTempDangerousGoodsNanifest(this);
		}
	}

	@Override
	public TempDangerousGoodsNanifest toEscapedModel() {
		return (TempDangerousGoodsNanifest)ProxyUtil.newProxyInstance(TempDangerousGoodsNanifest.class.getClassLoader(),
			new Class[] { TempDangerousGoodsNanifest.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempDangerousGoodsNanifestClp clone = new TempDangerousGoodsNanifestClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setRequestState(getRequestState());
		clone.setDocumentName(getDocumentName());
		clone.setUserCreated(getUserCreated());
		clone.setNameOfShip(getNameOfShip());
		clone.setFlagStateOfShip(getFlagStateOfShip());
		clone.setMasterName(getMasterName());
		clone.setImoNumber(getImoNumber());
		clone.setCallsign(getCallsign());
		clone.setVoyageNumber(getVoyageNumber());
		clone.setPortOfLoadingCode(getPortOfLoadingCode());
		clone.setPortOfDischargeCode(getPortOfDischargeCode());
		clone.setShippingAgent(getShippingAgent());
		clone.setAdditionalRemark(getAdditionalRemark());
		clone.setListDangerousGoods(getListDangerousGoods());
		clone.setSignPlace(getSignPlace());
		clone.setSignDate(getSignDate());
		clone.setMasterSigned(getMasterSigned());
		clone.setMasterSignedImage(getMasterSignedImage());
		clone.setAttachedFile(getAttachedFile());
		clone.setDocumentYear(getDocumentYear());

		return clone;
	}

	@Override
	public int compareTo(TempDangerousGoodsNanifest tempDangerousGoodsNanifest) {
		int value = 0;

		if (getId() < tempDangerousGoodsNanifest.getId()) {
			value = -1;
		}
		else if (getId() > tempDangerousGoodsNanifest.getId()) {
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

		if (!(obj instanceof TempDangerousGoodsNanifestClp)) {
			return false;
		}

		TempDangerousGoodsNanifestClp tempDangerousGoodsNanifest = (TempDangerousGoodsNanifestClp)obj;

		long primaryKey = tempDangerousGoodsNanifest.getPrimaryKey();

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
		StringBundler sb = new StringBundler(45);

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
		sb.append(", nameOfShip=");
		sb.append(getNameOfShip());
		sb.append(", flagStateOfShip=");
		sb.append(getFlagStateOfShip());
		sb.append(", masterName=");
		sb.append(getMasterName());
		sb.append(", imoNumber=");
		sb.append(getImoNumber());
		sb.append(", callsign=");
		sb.append(getCallsign());
		sb.append(", voyageNumber=");
		sb.append(getVoyageNumber());
		sb.append(", portOfLoadingCode=");
		sb.append(getPortOfLoadingCode());
		sb.append(", portOfDischargeCode=");
		sb.append(getPortOfDischargeCode());
		sb.append(", shippingAgent=");
		sb.append(getShippingAgent());
		sb.append(", additionalRemark=");
		sb.append(getAdditionalRemark());
		sb.append(", listDangerousGoods=");
		sb.append(getListDangerousGoods());
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
		sb.append(", documentYear=");
		sb.append(getDocumentYear());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(70);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.TempDangerousGoodsNanifest");
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
			"<column><column-name>nameOfShip</column-name><column-value><![CDATA[");
		sb.append(getNameOfShip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>flagStateOfShip</column-name><column-value><![CDATA[");
		sb.append(getFlagStateOfShip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>masterName</column-name><column-value><![CDATA[");
		sb.append(getMasterName());
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
			"<column><column-name>portOfLoadingCode</column-name><column-value><![CDATA[");
		sb.append(getPortOfLoadingCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portOfDischargeCode</column-name><column-value><![CDATA[");
		sb.append(getPortOfDischargeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shippingAgent</column-name><column-value><![CDATA[");
		sb.append(getShippingAgent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>additionalRemark</column-name><column-value><![CDATA[");
		sb.append(getAdditionalRemark());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>listDangerousGoods</column-name><column-value><![CDATA[");
		sb.append(getListDangerousGoods());
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
		sb.append(
			"<column><column-name>documentYear</column-name><column-value><![CDATA[");
		sb.append(getDocumentYear());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private int _requestState;
	private long _documentName;
	private String _userCreated;
	private String _nameOfShip;
	private String _flagStateOfShip;
	private String _masterName;
	private String _imoNumber;
	private String _callsign;
	private String _voyageNumber;
	private String _portOfLoadingCode;
	private String _portOfDischargeCode;
	private String _shippingAgent;
	private String _additionalRemark;
	private int _listDangerousGoods;
	private String _signPlace;
	private Date _signDate;
	private int _masterSigned;
	private int _masterSignedImage;
	private long _attachedFile;
	private int _documentYear;
	private BaseModel<?> _tempDangerousGoodsNanifestRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.class;
}