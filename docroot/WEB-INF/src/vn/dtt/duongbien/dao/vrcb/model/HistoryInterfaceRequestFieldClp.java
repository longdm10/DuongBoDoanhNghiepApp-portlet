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
import vn.dtt.duongbien.dao.vrcb.service.HistoryInterfaceRequestFieldLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class HistoryInterfaceRequestFieldClp extends BaseModelImpl<HistoryInterfaceRequestField>
	implements HistoryInterfaceRequestField {
	public HistoryInterfaceRequestFieldClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return HistoryInterfaceRequestField.class;
	}

	@Override
	public String getModelClassName() {
		return HistoryInterfaceRequestField.class.getName();
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
		attributes.put("organizationCode", getOrganizationCode());
		attributes.put("locCode", getLocCode());
		attributes.put("requestDate", getRequestDate());
		attributes.put("requestedDate", getRequestedDate());
		attributes.put("requestDirection", getRequestDirection());
		attributes.put("requestState", getRequestState());
		attributes.put("requestResponseTime", getRequestResponseTime());
		attributes.put("documentType", getDocumentType());
		attributes.put("businessType", getBusinessType());
		attributes.put("functionType", getFunctionType());
		attributes.put("senderName", getSenderName());
		attributes.put("requestVersion", getRequestVersion());
		attributes.put("senderIdentify", getSenderIdentify());
		attributes.put("receiverName", getReceiverName());
		attributes.put("sendingDate", getSendingDate());
		attributes.put("receiverIdentify", getReceiverIdentify());
		attributes.put("remarks", getRemarks());

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

		String organizationCode = (String)attributes.get("organizationCode");

		if (organizationCode != null) {
			setOrganizationCode(organizationCode);
		}

		String locCode = (String)attributes.get("locCode");

		if (locCode != null) {
			setLocCode(locCode);
		}

		Date requestDate = (Date)attributes.get("requestDate");

		if (requestDate != null) {
			setRequestDate(requestDate);
		}

		Date requestedDate = (Date)attributes.get("requestedDate");

		if (requestedDate != null) {
			setRequestedDate(requestedDate);
		}

		String requestDirection = (String)attributes.get("requestDirection");

		if (requestDirection != null) {
			setRequestDirection(requestDirection);
		}

		Integer requestState = (Integer)attributes.get("requestState");

		if (requestState != null) {
			setRequestState(requestState);
		}

		Date requestResponseTime = (Date)attributes.get("requestResponseTime");

		if (requestResponseTime != null) {
			setRequestResponseTime(requestResponseTime);
		}

		String documentType = (String)attributes.get("documentType");

		if (documentType != null) {
			setDocumentType(documentType);
		}

		String businessType = (String)attributes.get("businessType");

		if (businessType != null) {
			setBusinessType(businessType);
		}

		String functionType = (String)attributes.get("functionType");

		if (functionType != null) {
			setFunctionType(functionType);
		}

		String senderName = (String)attributes.get("senderName");

		if (senderName != null) {
			setSenderName(senderName);
		}

		String requestVersion = (String)attributes.get("requestVersion");

		if (requestVersion != null) {
			setRequestVersion(requestVersion);
		}

		String senderIdentify = (String)attributes.get("senderIdentify");

		if (senderIdentify != null) {
			setSenderIdentify(senderIdentify);
		}

		String receiverName = (String)attributes.get("receiverName");

		if (receiverName != null) {
			setReceiverName(receiverName);
		}

		Date sendingDate = (Date)attributes.get("sendingDate");

		if (sendingDate != null) {
			setSendingDate(sendingDate);
		}

		String receiverIdentify = (String)attributes.get("receiverIdentify");

		if (receiverIdentify != null) {
			setReceiverIdentify(receiverIdentify);
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

		if (_historyInterfaceRequestFieldRemoteModel != null) {
			try {
				Class<?> clazz = _historyInterfaceRequestFieldRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_historyInterfaceRequestFieldRemoteModel, id);
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

		if (_historyInterfaceRequestFieldRemoteModel != null) {
			try {
				Class<?> clazz = _historyInterfaceRequestFieldRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestCode", String.class);

				method.invoke(_historyInterfaceRequestFieldRemoteModel,
					requestCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOrganizationCode() {
		return _organizationCode;
	}

	@Override
	public void setOrganizationCode(String organizationCode) {
		_organizationCode = organizationCode;

		if (_historyInterfaceRequestFieldRemoteModel != null) {
			try {
				Class<?> clazz = _historyInterfaceRequestFieldRemoteModel.getClass();

				Method method = clazz.getMethod("setOrganizationCode",
						String.class);

				method.invoke(_historyInterfaceRequestFieldRemoteModel,
					organizationCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLocCode() {
		return _locCode;
	}

	@Override
	public void setLocCode(String locCode) {
		_locCode = locCode;

		if (_historyInterfaceRequestFieldRemoteModel != null) {
			try {
				Class<?> clazz = _historyInterfaceRequestFieldRemoteModel.getClass();

				Method method = clazz.getMethod("setLocCode", String.class);

				method.invoke(_historyInterfaceRequestFieldRemoteModel, locCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getRequestDate() {
		return _requestDate;
	}

	@Override
	public void setRequestDate(Date requestDate) {
		_requestDate = requestDate;

		if (_historyInterfaceRequestFieldRemoteModel != null) {
			try {
				Class<?> clazz = _historyInterfaceRequestFieldRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestDate", Date.class);

				method.invoke(_historyInterfaceRequestFieldRemoteModel,
					requestDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getRequestedDate() {
		return _requestedDate;
	}

	@Override
	public void setRequestedDate(Date requestedDate) {
		_requestedDate = requestedDate;

		if (_historyInterfaceRequestFieldRemoteModel != null) {
			try {
				Class<?> clazz = _historyInterfaceRequestFieldRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestedDate", Date.class);

				method.invoke(_historyInterfaceRequestFieldRemoteModel,
					requestedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRequestDirection() {
		return _requestDirection;
	}

	@Override
	public void setRequestDirection(String requestDirection) {
		_requestDirection = requestDirection;

		if (_historyInterfaceRequestFieldRemoteModel != null) {
			try {
				Class<?> clazz = _historyInterfaceRequestFieldRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestDirection",
						String.class);

				method.invoke(_historyInterfaceRequestFieldRemoteModel,
					requestDirection);
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

		if (_historyInterfaceRequestFieldRemoteModel != null) {
			try {
				Class<?> clazz = _historyInterfaceRequestFieldRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestState", int.class);

				method.invoke(_historyInterfaceRequestFieldRemoteModel,
					requestState);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getRequestResponseTime() {
		return _requestResponseTime;
	}

	@Override
	public void setRequestResponseTime(Date requestResponseTime) {
		_requestResponseTime = requestResponseTime;

		if (_historyInterfaceRequestFieldRemoteModel != null) {
			try {
				Class<?> clazz = _historyInterfaceRequestFieldRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestResponseTime",
						Date.class);

				method.invoke(_historyInterfaceRequestFieldRemoteModel,
					requestResponseTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDocumentType() {
		return _documentType;
	}

	@Override
	public void setDocumentType(String documentType) {
		_documentType = documentType;

		if (_historyInterfaceRequestFieldRemoteModel != null) {
			try {
				Class<?> clazz = _historyInterfaceRequestFieldRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentType", String.class);

				method.invoke(_historyInterfaceRequestFieldRemoteModel,
					documentType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBusinessType() {
		return _businessType;
	}

	@Override
	public void setBusinessType(String businessType) {
		_businessType = businessType;

		if (_historyInterfaceRequestFieldRemoteModel != null) {
			try {
				Class<?> clazz = _historyInterfaceRequestFieldRemoteModel.getClass();

				Method method = clazz.getMethod("setBusinessType", String.class);

				method.invoke(_historyInterfaceRequestFieldRemoteModel,
					businessType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFunctionType() {
		return _functionType;
	}

	@Override
	public void setFunctionType(String functionType) {
		_functionType = functionType;

		if (_historyInterfaceRequestFieldRemoteModel != null) {
			try {
				Class<?> clazz = _historyInterfaceRequestFieldRemoteModel.getClass();

				Method method = clazz.getMethod("setFunctionType", String.class);

				method.invoke(_historyInterfaceRequestFieldRemoteModel,
					functionType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSenderName() {
		return _senderName;
	}

	@Override
	public void setSenderName(String senderName) {
		_senderName = senderName;

		if (_historyInterfaceRequestFieldRemoteModel != null) {
			try {
				Class<?> clazz = _historyInterfaceRequestFieldRemoteModel.getClass();

				Method method = clazz.getMethod("setSenderName", String.class);

				method.invoke(_historyInterfaceRequestFieldRemoteModel,
					senderName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRequestVersion() {
		return _requestVersion;
	}

	@Override
	public void setRequestVersion(String requestVersion) {
		_requestVersion = requestVersion;

		if (_historyInterfaceRequestFieldRemoteModel != null) {
			try {
				Class<?> clazz = _historyInterfaceRequestFieldRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestVersion",
						String.class);

				method.invoke(_historyInterfaceRequestFieldRemoteModel,
					requestVersion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSenderIdentify() {
		return _senderIdentify;
	}

	@Override
	public void setSenderIdentify(String senderIdentify) {
		_senderIdentify = senderIdentify;

		if (_historyInterfaceRequestFieldRemoteModel != null) {
			try {
				Class<?> clazz = _historyInterfaceRequestFieldRemoteModel.getClass();

				Method method = clazz.getMethod("setSenderIdentify",
						String.class);

				method.invoke(_historyInterfaceRequestFieldRemoteModel,
					senderIdentify);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getReceiverName() {
		return _receiverName;
	}

	@Override
	public void setReceiverName(String receiverName) {
		_receiverName = receiverName;

		if (_historyInterfaceRequestFieldRemoteModel != null) {
			try {
				Class<?> clazz = _historyInterfaceRequestFieldRemoteModel.getClass();

				Method method = clazz.getMethod("setReceiverName", String.class);

				method.invoke(_historyInterfaceRequestFieldRemoteModel,
					receiverName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getSendingDate() {
		return _sendingDate;
	}

	@Override
	public void setSendingDate(Date sendingDate) {
		_sendingDate = sendingDate;

		if (_historyInterfaceRequestFieldRemoteModel != null) {
			try {
				Class<?> clazz = _historyInterfaceRequestFieldRemoteModel.getClass();

				Method method = clazz.getMethod("setSendingDate", Date.class);

				method.invoke(_historyInterfaceRequestFieldRemoteModel,
					sendingDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getReceiverIdentify() {
		return _receiverIdentify;
	}

	@Override
	public void setReceiverIdentify(String receiverIdentify) {
		_receiverIdentify = receiverIdentify;

		if (_historyInterfaceRequestFieldRemoteModel != null) {
			try {
				Class<?> clazz = _historyInterfaceRequestFieldRemoteModel.getClass();

				Method method = clazz.getMethod("setReceiverIdentify",
						String.class);

				method.invoke(_historyInterfaceRequestFieldRemoteModel,
					receiverIdentify);
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

		if (_historyInterfaceRequestFieldRemoteModel != null) {
			try {
				Class<?> clazz = _historyInterfaceRequestFieldRemoteModel.getClass();

				Method method = clazz.getMethod("setRemarks", String.class);

				method.invoke(_historyInterfaceRequestFieldRemoteModel, remarks);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getHistoryInterfaceRequestFieldRemoteModel() {
		return _historyInterfaceRequestFieldRemoteModel;
	}

	public void setHistoryInterfaceRequestFieldRemoteModel(
		BaseModel<?> historyInterfaceRequestFieldRemoteModel) {
		_historyInterfaceRequestFieldRemoteModel = historyInterfaceRequestFieldRemoteModel;
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

		Class<?> remoteModelClass = _historyInterfaceRequestFieldRemoteModel.getClass();

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

		Object returnValue = method.invoke(_historyInterfaceRequestFieldRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			HistoryInterfaceRequestFieldLocalServiceUtil.addHistoryInterfaceRequestField(this);
		}
		else {
			HistoryInterfaceRequestFieldLocalServiceUtil.updateHistoryInterfaceRequestField(this);
		}
	}

	@Override
	public HistoryInterfaceRequestField toEscapedModel() {
		return (HistoryInterfaceRequestField)ProxyUtil.newProxyInstance(HistoryInterfaceRequestField.class.getClassLoader(),
			new Class[] { HistoryInterfaceRequestField.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		HistoryInterfaceRequestFieldClp clone = new HistoryInterfaceRequestFieldClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setOrganizationCode(getOrganizationCode());
		clone.setLocCode(getLocCode());
		clone.setRequestDate(getRequestDate());
		clone.setRequestedDate(getRequestedDate());
		clone.setRequestDirection(getRequestDirection());
		clone.setRequestState(getRequestState());
		clone.setRequestResponseTime(getRequestResponseTime());
		clone.setDocumentType(getDocumentType());
		clone.setBusinessType(getBusinessType());
		clone.setFunctionType(getFunctionType());
		clone.setSenderName(getSenderName());
		clone.setRequestVersion(getRequestVersion());
		clone.setSenderIdentify(getSenderIdentify());
		clone.setReceiverName(getReceiverName());
		clone.setSendingDate(getSendingDate());
		clone.setReceiverIdentify(getReceiverIdentify());
		clone.setRemarks(getRemarks());

		return clone;
	}

	@Override
	public int compareTo(
		HistoryInterfaceRequestField historyInterfaceRequestField) {
		int value = 0;

		if (getId() < historyInterfaceRequestField.getId()) {
			value = -1;
		}
		else if (getId() > historyInterfaceRequestField.getId()) {
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

		if (!(obj instanceof HistoryInterfaceRequestFieldClp)) {
			return false;
		}

		HistoryInterfaceRequestFieldClp historyInterfaceRequestField = (HistoryInterfaceRequestFieldClp)obj;

		long primaryKey = historyInterfaceRequestField.getPrimaryKey();

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
		StringBundler sb = new StringBundler(39);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", organizationCode=");
		sb.append(getOrganizationCode());
		sb.append(", locCode=");
		sb.append(getLocCode());
		sb.append(", requestDate=");
		sb.append(getRequestDate());
		sb.append(", requestedDate=");
		sb.append(getRequestedDate());
		sb.append(", requestDirection=");
		sb.append(getRequestDirection());
		sb.append(", requestState=");
		sb.append(getRequestState());
		sb.append(", requestResponseTime=");
		sb.append(getRequestResponseTime());
		sb.append(", documentType=");
		sb.append(getDocumentType());
		sb.append(", businessType=");
		sb.append(getBusinessType());
		sb.append(", functionType=");
		sb.append(getFunctionType());
		sb.append(", senderName=");
		sb.append(getSenderName());
		sb.append(", requestVersion=");
		sb.append(getRequestVersion());
		sb.append(", senderIdentify=");
		sb.append(getSenderIdentify());
		sb.append(", receiverName=");
		sb.append(getReceiverName());
		sb.append(", sendingDate=");
		sb.append(getSendingDate());
		sb.append(", receiverIdentify=");
		sb.append(getReceiverIdentify());
		sb.append(", remarks=");
		sb.append(getRemarks());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(61);

		sb.append("<model><model-name>");
		sb.append(
			"vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequestField");
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
			"<column><column-name>organizationCode</column-name><column-value><![CDATA[");
		sb.append(getOrganizationCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>locCode</column-name><column-value><![CDATA[");
		sb.append(getLocCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestDate</column-name><column-value><![CDATA[");
		sb.append(getRequestDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestedDate</column-name><column-value><![CDATA[");
		sb.append(getRequestedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestDirection</column-name><column-value><![CDATA[");
		sb.append(getRequestDirection());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestState</column-name><column-value><![CDATA[");
		sb.append(getRequestState());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestResponseTime</column-name><column-value><![CDATA[");
		sb.append(getRequestResponseTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentType</column-name><column-value><![CDATA[");
		sb.append(getDocumentType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>businessType</column-name><column-value><![CDATA[");
		sb.append(getBusinessType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>functionType</column-name><column-value><![CDATA[");
		sb.append(getFunctionType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>senderName</column-name><column-value><![CDATA[");
		sb.append(getSenderName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestVersion</column-name><column-value><![CDATA[");
		sb.append(getRequestVersion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>senderIdentify</column-name><column-value><![CDATA[");
		sb.append(getSenderIdentify());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>receiverName</column-name><column-value><![CDATA[");
		sb.append(getReceiverName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sendingDate</column-name><column-value><![CDATA[");
		sb.append(getSendingDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>receiverIdentify</column-name><column-value><![CDATA[");
		sb.append(getReceiverIdentify());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remarks</column-name><column-value><![CDATA[");
		sb.append(getRemarks());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private String _organizationCode;
	private String _locCode;
	private Date _requestDate;
	private Date _requestedDate;
	private String _requestDirection;
	private int _requestState;
	private Date _requestResponseTime;
	private String _documentType;
	private String _businessType;
	private String _functionType;
	private String _senderName;
	private String _requestVersion;
	private String _senderIdentify;
	private String _receiverName;
	private Date _sendingDate;
	private String _receiverIdentify;
	private String _remarks;
	private BaseModel<?> _historyInterfaceRequestFieldRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.class;
}