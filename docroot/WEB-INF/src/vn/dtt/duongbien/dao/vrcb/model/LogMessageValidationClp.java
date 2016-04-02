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
import vn.dtt.duongbien.dao.vrcb.service.LogMessageValidationLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class LogMessageValidationClp extends BaseModelImpl<LogMessageValidation>
	implements LogMessageValidation {
	public LogMessageValidationClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return LogMessageValidation.class;
	}

	@Override
	public String getModelClassName() {
		return LogMessageValidation.class.getName();
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
		attributes.put("requestDirection", getRequestDirection());
		attributes.put("requestDate", getRequestDate());
		attributes.put("documentName", getDocumentName());
		attributes.put("documentYear", getDocumentYear());
		attributes.put("documentType", getDocumentType());
		attributes.put("tagProperty", getTagProperty());
		attributes.put("dataValidation", getDataValidation());

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

		String requestDirection = (String)attributes.get("requestDirection");

		if (requestDirection != null) {
			setRequestDirection(requestDirection);
		}

		Date requestDate = (Date)attributes.get("requestDate");

		if (requestDate != null) {
			setRequestDate(requestDate);
		}

		Long documentName = (Long)attributes.get("documentName");

		if (documentName != null) {
			setDocumentName(documentName);
		}

		Integer documentYear = (Integer)attributes.get("documentYear");

		if (documentYear != null) {
			setDocumentYear(documentYear);
		}

		String documentType = (String)attributes.get("documentType");

		if (documentType != null) {
			setDocumentType(documentType);
		}

		String tagProperty = (String)attributes.get("tagProperty");

		if (tagProperty != null) {
			setTagProperty(tagProperty);
		}

		String dataValidation = (String)attributes.get("dataValidation");

		if (dataValidation != null) {
			setDataValidation(dataValidation);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_logMessageValidationRemoteModel != null) {
			try {
				Class<?> clazz = _logMessageValidationRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_logMessageValidationRemoteModel, id);
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

		if (_logMessageValidationRemoteModel != null) {
			try {
				Class<?> clazz = _logMessageValidationRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestCode", String.class);

				method.invoke(_logMessageValidationRemoteModel, requestCode);
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

		if (_logMessageValidationRemoteModel != null) {
			try {
				Class<?> clazz = _logMessageValidationRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestDirection",
						String.class);

				method.invoke(_logMessageValidationRemoteModel, requestDirection);
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

		if (_logMessageValidationRemoteModel != null) {
			try {
				Class<?> clazz = _logMessageValidationRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestDate", Date.class);

				method.invoke(_logMessageValidationRemoteModel, requestDate);
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

		if (_logMessageValidationRemoteModel != null) {
			try {
				Class<?> clazz = _logMessageValidationRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentName", long.class);

				method.invoke(_logMessageValidationRemoteModel, documentName);
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

		if (_logMessageValidationRemoteModel != null) {
			try {
				Class<?> clazz = _logMessageValidationRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentYear", int.class);

				method.invoke(_logMessageValidationRemoteModel, documentYear);
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

		if (_logMessageValidationRemoteModel != null) {
			try {
				Class<?> clazz = _logMessageValidationRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentType", String.class);

				method.invoke(_logMessageValidationRemoteModel, documentType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTagProperty() {
		return _tagProperty;
	}

	@Override
	public void setTagProperty(String tagProperty) {
		_tagProperty = tagProperty;

		if (_logMessageValidationRemoteModel != null) {
			try {
				Class<?> clazz = _logMessageValidationRemoteModel.getClass();

				Method method = clazz.getMethod("setTagProperty", String.class);

				method.invoke(_logMessageValidationRemoteModel, tagProperty);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDataValidation() {
		return _dataValidation;
	}

	@Override
	public void setDataValidation(String dataValidation) {
		_dataValidation = dataValidation;

		if (_logMessageValidationRemoteModel != null) {
			try {
				Class<?> clazz = _logMessageValidationRemoteModel.getClass();

				Method method = clazz.getMethod("setDataValidation",
						String.class);

				method.invoke(_logMessageValidationRemoteModel, dataValidation);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getLogMessageValidationRemoteModel() {
		return _logMessageValidationRemoteModel;
	}

	public void setLogMessageValidationRemoteModel(
		BaseModel<?> logMessageValidationRemoteModel) {
		_logMessageValidationRemoteModel = logMessageValidationRemoteModel;
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

		Class<?> remoteModelClass = _logMessageValidationRemoteModel.getClass();

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

		Object returnValue = method.invoke(_logMessageValidationRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			LogMessageValidationLocalServiceUtil.addLogMessageValidation(this);
		}
		else {
			LogMessageValidationLocalServiceUtil.updateLogMessageValidation(this);
		}
	}

	@Override
	public LogMessageValidation toEscapedModel() {
		return (LogMessageValidation)ProxyUtil.newProxyInstance(LogMessageValidation.class.getClassLoader(),
			new Class[] { LogMessageValidation.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		LogMessageValidationClp clone = new LogMessageValidationClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setRequestDirection(getRequestDirection());
		clone.setRequestDate(getRequestDate());
		clone.setDocumentName(getDocumentName());
		clone.setDocumentYear(getDocumentYear());
		clone.setDocumentType(getDocumentType());
		clone.setTagProperty(getTagProperty());
		clone.setDataValidation(getDataValidation());

		return clone;
	}

	@Override
	public int compareTo(LogMessageValidation logMessageValidation) {
		int value = 0;

		if (getId() < logMessageValidation.getId()) {
			value = -1;
		}
		else if (getId() > logMessageValidation.getId()) {
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

		if (!(obj instanceof LogMessageValidationClp)) {
			return false;
		}

		LogMessageValidationClp logMessageValidation = (LogMessageValidationClp)obj;

		long primaryKey = logMessageValidation.getPrimaryKey();

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
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", requestDirection=");
		sb.append(getRequestDirection());
		sb.append(", requestDate=");
		sb.append(getRequestDate());
		sb.append(", documentName=");
		sb.append(getDocumentName());
		sb.append(", documentYear=");
		sb.append(getDocumentYear());
		sb.append(", documentType=");
		sb.append(getDocumentType());
		sb.append(", tagProperty=");
		sb.append(getTagProperty());
		sb.append(", dataValidation=");
		sb.append(getDataValidation());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.LogMessageValidation");
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
			"<column><column-name>requestDirection</column-name><column-value><![CDATA[");
		sb.append(getRequestDirection());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestDate</column-name><column-value><![CDATA[");
		sb.append(getRequestDate());
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
			"<column><column-name>documentType</column-name><column-value><![CDATA[");
		sb.append(getDocumentType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tagProperty</column-name><column-value><![CDATA[");
		sb.append(getTagProperty());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dataValidation</column-name><column-value><![CDATA[");
		sb.append(getDataValidation());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private String _requestDirection;
	private Date _requestDate;
	private long _documentName;
	private int _documentYear;
	private String _documentType;
	private String _tagProperty;
	private String _dataValidation;
	private BaseModel<?> _logMessageValidationRemoteModel;
}