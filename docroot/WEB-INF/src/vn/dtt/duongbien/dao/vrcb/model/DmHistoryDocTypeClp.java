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
import vn.dtt.duongbien.dao.vrcb.service.DmHistoryDocTypeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class DmHistoryDocTypeClp extends BaseModelImpl<DmHistoryDocType>
	implements DmHistoryDocType {
	public DmHistoryDocTypeClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DmHistoryDocType.class;
	}

	@Override
	public String getModelClassName() {
		return DmHistoryDocType.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("documentTypeCode", getDocumentTypeCode());
		attributes.put("documentType", getDocumentType());
		attributes.put("documentTypeName", getDocumentTypeName());
		attributes.put("isDelete", getIsDelete());
		attributes.put("markedAsDelete", getMarkedAsDelete());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("requestedDate", getRequestedDate());
		attributes.put("syncVersion", getSyncVersion());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String documentTypeCode = (String)attributes.get("documentTypeCode");

		if (documentTypeCode != null) {
			setDocumentTypeCode(documentTypeCode);
		}

		String documentType = (String)attributes.get("documentType");

		if (documentType != null) {
			setDocumentType(documentType);
		}

		String documentTypeName = (String)attributes.get("documentTypeName");

		if (documentTypeName != null) {
			setDocumentTypeName(documentTypeName);
		}

		Integer isDelete = (Integer)attributes.get("isDelete");

		if (isDelete != null) {
			setIsDelete(isDelete);
		}

		Integer markedAsDelete = (Integer)attributes.get("markedAsDelete");

		if (markedAsDelete != null) {
			setMarkedAsDelete(markedAsDelete);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Date requestedDate = (Date)attributes.get("requestedDate");

		if (requestedDate != null) {
			setRequestedDate(requestedDate);
		}

		String syncVersion = (String)attributes.get("syncVersion");

		if (syncVersion != null) {
			setSyncVersion(syncVersion);
		}
	}

	@Override
	public int getId() {
		return _id;
	}

	@Override
	public void setId(int id) {
		_id = id;

		if (_dmHistoryDocTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryDocTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setId", int.class);

				method.invoke(_dmHistoryDocTypeRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDocumentTypeCode() {
		return _documentTypeCode;
	}

	@Override
	public void setDocumentTypeCode(String documentTypeCode) {
		_documentTypeCode = documentTypeCode;

		if (_dmHistoryDocTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryDocTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentTypeCode",
						String.class);

				method.invoke(_dmHistoryDocTypeRemoteModel, documentTypeCode);
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

		if (_dmHistoryDocTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryDocTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentType", String.class);

				method.invoke(_dmHistoryDocTypeRemoteModel, documentType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDocumentTypeName() {
		return _documentTypeName;
	}

	@Override
	public void setDocumentTypeName(String documentTypeName) {
		_documentTypeName = documentTypeName;

		if (_dmHistoryDocTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryDocTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentTypeName",
						String.class);

				method.invoke(_dmHistoryDocTypeRemoteModel, documentTypeName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIsDelete() {
		return _isDelete;
	}

	@Override
	public void setIsDelete(int isDelete) {
		_isDelete = isDelete;

		if (_dmHistoryDocTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryDocTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setIsDelete", int.class);

				method.invoke(_dmHistoryDocTypeRemoteModel, isDelete);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMarkedAsDelete() {
		return _markedAsDelete;
	}

	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_markedAsDelete = markedAsDelete;

		if (_dmHistoryDocTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryDocTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkedAsDelete", int.class);

				method.invoke(_dmHistoryDocTypeRemoteModel, markedAsDelete);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_dmHistoryDocTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryDocTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_dmHistoryDocTypeRemoteModel, modifiedDate);
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

		if (_dmHistoryDocTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryDocTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestedDate", Date.class);

				method.invoke(_dmHistoryDocTypeRemoteModel, requestedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSyncVersion() {
		return _syncVersion;
	}

	@Override
	public void setSyncVersion(String syncVersion) {
		_syncVersion = syncVersion;

		if (_dmHistoryDocTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryDocTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setSyncVersion", String.class);

				method.invoke(_dmHistoryDocTypeRemoteModel, syncVersion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDmHistoryDocTypeRemoteModel() {
		return _dmHistoryDocTypeRemoteModel;
	}

	public void setDmHistoryDocTypeRemoteModel(
		BaseModel<?> dmHistoryDocTypeRemoteModel) {
		_dmHistoryDocTypeRemoteModel = dmHistoryDocTypeRemoteModel;
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

		Class<?> remoteModelClass = _dmHistoryDocTypeRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dmHistoryDocTypeRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DmHistoryDocTypeLocalServiceUtil.addDmHistoryDocType(this);
		}
		else {
			DmHistoryDocTypeLocalServiceUtil.updateDmHistoryDocType(this);
		}
	}

	@Override
	public DmHistoryDocType toEscapedModel() {
		return (DmHistoryDocType)ProxyUtil.newProxyInstance(DmHistoryDocType.class.getClassLoader(),
			new Class[] { DmHistoryDocType.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmHistoryDocTypeClp clone = new DmHistoryDocTypeClp();

		clone.setId(getId());
		clone.setDocumentTypeCode(getDocumentTypeCode());
		clone.setDocumentType(getDocumentType());
		clone.setDocumentTypeName(getDocumentTypeName());
		clone.setIsDelete(getIsDelete());
		clone.setMarkedAsDelete(getMarkedAsDelete());
		clone.setModifiedDate(getModifiedDate());
		clone.setRequestedDate(getRequestedDate());
		clone.setSyncVersion(getSyncVersion());

		return clone;
	}

	@Override
	public int compareTo(DmHistoryDocType dmHistoryDocType) {
		int value = 0;

		if (getId() < dmHistoryDocType.getId()) {
			value = -1;
		}
		else if (getId() > dmHistoryDocType.getId()) {
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

		if (!(obj instanceof DmHistoryDocTypeClp)) {
			return false;
		}

		DmHistoryDocTypeClp dmHistoryDocType = (DmHistoryDocTypeClp)obj;

		int primaryKey = dmHistoryDocType.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", documentTypeCode=");
		sb.append(getDocumentTypeCode());
		sb.append(", documentType=");
		sb.append(getDocumentType());
		sb.append(", documentTypeName=");
		sb.append(getDocumentTypeName());
		sb.append(", isDelete=");
		sb.append(getIsDelete());
		sb.append(", markedAsDelete=");
		sb.append(getMarkedAsDelete());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", requestedDate=");
		sb.append(getRequestedDate());
		sb.append(", syncVersion=");
		sb.append(getSyncVersion());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentTypeCode</column-name><column-value><![CDATA[");
		sb.append(getDocumentTypeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentType</column-name><column-value><![CDATA[");
		sb.append(getDocumentType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentTypeName</column-name><column-value><![CDATA[");
		sb.append(getDocumentTypeName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isDelete</column-name><column-value><![CDATA[");
		sb.append(getIsDelete());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markedAsDelete</column-name><column-value><![CDATA[");
		sb.append(getMarkedAsDelete());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestedDate</column-name><column-value><![CDATA[");
		sb.append(getRequestedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>syncVersion</column-name><column-value><![CDATA[");
		sb.append(getSyncVersion());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _id;
	private String _documentTypeCode;
	private String _documentType;
	private String _documentTypeName;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private BaseModel<?> _dmHistoryDocTypeRemoteModel;
}