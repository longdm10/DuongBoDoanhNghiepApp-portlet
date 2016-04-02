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
import vn.dtt.duongbien.dao.vrcb.service.DmGTFunctionTypeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class DmGTFunctionTypeClp extends BaseModelImpl<DmGTFunctionType>
	implements DmGTFunctionType {
	public DmGTFunctionTypeClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DmGTFunctionType.class;
	}

	@Override
	public String getModelClassName() {
		return DmGTFunctionType.class.getName();
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
		attributes.put("functionTypeCode", getFunctionTypeCode());
		attributes.put("functionTypeName", getFunctionTypeName());
		attributes.put("functionTypeNameVN", getFunctionTypeNameVN());
		attributes.put("functionTypeOrder", getFunctionTypeOrder());
		attributes.put("isDelete", getIsDelete());
		attributes.put("markedAsDelete", getMarkedAsDelete());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("requestedDate", getRequestedDate());
		attributes.put("syncVersion", getSyncVersion());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String functionTypeCode = (String)attributes.get("functionTypeCode");

		if (functionTypeCode != null) {
			setFunctionTypeCode(functionTypeCode);
		}

		String functionTypeName = (String)attributes.get("functionTypeName");

		if (functionTypeName != null) {
			setFunctionTypeName(functionTypeName);
		}

		String functionTypeNameVN = (String)attributes.get("functionTypeNameVN");

		if (functionTypeNameVN != null) {
			setFunctionTypeNameVN(functionTypeNameVN);
		}

		Integer functionTypeOrder = (Integer)attributes.get("functionTypeOrder");

		if (functionTypeOrder != null) {
			setFunctionTypeOrder(functionTypeOrder);
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
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_dmGTFunctionTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmGTFunctionTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_dmGTFunctionTypeRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFunctionTypeCode() {
		return _functionTypeCode;
	}

	@Override
	public void setFunctionTypeCode(String functionTypeCode) {
		_functionTypeCode = functionTypeCode;

		if (_dmGTFunctionTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmGTFunctionTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setFunctionTypeCode",
						String.class);

				method.invoke(_dmGTFunctionTypeRemoteModel, functionTypeCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFunctionTypeName() {
		return _functionTypeName;
	}

	@Override
	public void setFunctionTypeName(String functionTypeName) {
		_functionTypeName = functionTypeName;

		if (_dmGTFunctionTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmGTFunctionTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setFunctionTypeName",
						String.class);

				method.invoke(_dmGTFunctionTypeRemoteModel, functionTypeName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFunctionTypeNameVN() {
		return _functionTypeNameVN;
	}

	@Override
	public void setFunctionTypeNameVN(String functionTypeNameVN) {
		_functionTypeNameVN = functionTypeNameVN;

		if (_dmGTFunctionTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmGTFunctionTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setFunctionTypeNameVN",
						String.class);

				method.invoke(_dmGTFunctionTypeRemoteModel, functionTypeNameVN);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getFunctionTypeOrder() {
		return _functionTypeOrder;
	}

	@Override
	public void setFunctionTypeOrder(int functionTypeOrder) {
		_functionTypeOrder = functionTypeOrder;

		if (_dmGTFunctionTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmGTFunctionTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setFunctionTypeOrder",
						int.class);

				method.invoke(_dmGTFunctionTypeRemoteModel, functionTypeOrder);
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

		if (_dmGTFunctionTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmGTFunctionTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setIsDelete", int.class);

				method.invoke(_dmGTFunctionTypeRemoteModel, isDelete);
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

		if (_dmGTFunctionTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmGTFunctionTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkedAsDelete", int.class);

				method.invoke(_dmGTFunctionTypeRemoteModel, markedAsDelete);
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

		if (_dmGTFunctionTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmGTFunctionTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_dmGTFunctionTypeRemoteModel, modifiedDate);
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

		if (_dmGTFunctionTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmGTFunctionTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestedDate", Date.class);

				method.invoke(_dmGTFunctionTypeRemoteModel, requestedDate);
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

		if (_dmGTFunctionTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmGTFunctionTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setSyncVersion", String.class);

				method.invoke(_dmGTFunctionTypeRemoteModel, syncVersion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDmGTFunctionTypeRemoteModel() {
		return _dmGTFunctionTypeRemoteModel;
	}

	public void setDmGTFunctionTypeRemoteModel(
		BaseModel<?> dmGTFunctionTypeRemoteModel) {
		_dmGTFunctionTypeRemoteModel = dmGTFunctionTypeRemoteModel;
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

		Class<?> remoteModelClass = _dmGTFunctionTypeRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dmGTFunctionTypeRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DmGTFunctionTypeLocalServiceUtil.addDmGTFunctionType(this);
		}
		else {
			DmGTFunctionTypeLocalServiceUtil.updateDmGTFunctionType(this);
		}
	}

	@Override
	public DmGTFunctionType toEscapedModel() {
		return (DmGTFunctionType)ProxyUtil.newProxyInstance(DmGTFunctionType.class.getClassLoader(),
			new Class[] { DmGTFunctionType.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmGTFunctionTypeClp clone = new DmGTFunctionTypeClp();

		clone.setId(getId());
		clone.setFunctionTypeCode(getFunctionTypeCode());
		clone.setFunctionTypeName(getFunctionTypeName());
		clone.setFunctionTypeNameVN(getFunctionTypeNameVN());
		clone.setFunctionTypeOrder(getFunctionTypeOrder());
		clone.setIsDelete(getIsDelete());
		clone.setMarkedAsDelete(getMarkedAsDelete());
		clone.setModifiedDate(getModifiedDate());
		clone.setRequestedDate(getRequestedDate());
		clone.setSyncVersion(getSyncVersion());

		return clone;
	}

	@Override
	public int compareTo(DmGTFunctionType dmGTFunctionType) {
		int value = 0;

		if (getId() < dmGTFunctionType.getId()) {
			value = -1;
		}
		else if (getId() > dmGTFunctionType.getId()) {
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

		if (!(obj instanceof DmGTFunctionTypeClp)) {
			return false;
		}

		DmGTFunctionTypeClp dmGTFunctionType = (DmGTFunctionTypeClp)obj;

		long primaryKey = dmGTFunctionType.getPrimaryKey();

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
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", functionTypeCode=");
		sb.append(getFunctionTypeCode());
		sb.append(", functionTypeName=");
		sb.append(getFunctionTypeName());
		sb.append(", functionTypeNameVN=");
		sb.append(getFunctionTypeNameVN());
		sb.append(", functionTypeOrder=");
		sb.append(getFunctionTypeOrder());
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
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DmGTFunctionType");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>functionTypeCode</column-name><column-value><![CDATA[");
		sb.append(getFunctionTypeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>functionTypeName</column-name><column-value><![CDATA[");
		sb.append(getFunctionTypeName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>functionTypeNameVN</column-name><column-value><![CDATA[");
		sb.append(getFunctionTypeNameVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>functionTypeOrder</column-name><column-value><![CDATA[");
		sb.append(getFunctionTypeOrder());
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

	private long _id;
	private String _functionTypeCode;
	private String _functionTypeName;
	private String _functionTypeNameVN;
	private int _functionTypeOrder;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private BaseModel<?> _dmGTFunctionTypeRemoteModel;
}