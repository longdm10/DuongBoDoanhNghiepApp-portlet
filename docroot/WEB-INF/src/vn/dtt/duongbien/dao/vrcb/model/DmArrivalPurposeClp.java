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
import vn.dtt.duongbien.dao.vrcb.service.DmArrivalPurposeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class DmArrivalPurposeClp extends BaseModelImpl<DmArrivalPurpose>
	implements DmArrivalPurpose {
	public DmArrivalPurposeClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DmArrivalPurpose.class;
	}

	@Override
	public String getModelClassName() {
		return DmArrivalPurpose.class.getName();
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
		attributes.put("purposeCode", getPurposeCode());
		attributes.put("purposeName", getPurposeName());
		attributes.put("purposeNameVN", getPurposeNameVN());
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

		String purposeCode = (String)attributes.get("purposeCode");

		if (purposeCode != null) {
			setPurposeCode(purposeCode);
		}

		String purposeName = (String)attributes.get("purposeName");

		if (purposeName != null) {
			setPurposeName(purposeName);
		}

		String purposeNameVN = (String)attributes.get("purposeNameVN");

		if (purposeNameVN != null) {
			setPurposeNameVN(purposeNameVN);
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

		if (_dmArrivalPurposeRemoteModel != null) {
			try {
				Class<?> clazz = _dmArrivalPurposeRemoteModel.getClass();

				Method method = clazz.getMethod("setId", int.class);

				method.invoke(_dmArrivalPurposeRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPurposeCode() {
		return _purposeCode;
	}

	@Override
	public void setPurposeCode(String purposeCode) {
		_purposeCode = purposeCode;

		if (_dmArrivalPurposeRemoteModel != null) {
			try {
				Class<?> clazz = _dmArrivalPurposeRemoteModel.getClass();

				Method method = clazz.getMethod("setPurposeCode", String.class);

				method.invoke(_dmArrivalPurposeRemoteModel, purposeCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPurposeName() {
		return _purposeName;
	}

	@Override
	public void setPurposeName(String purposeName) {
		_purposeName = purposeName;

		if (_dmArrivalPurposeRemoteModel != null) {
			try {
				Class<?> clazz = _dmArrivalPurposeRemoteModel.getClass();

				Method method = clazz.getMethod("setPurposeName", String.class);

				method.invoke(_dmArrivalPurposeRemoteModel, purposeName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPurposeNameVN() {
		return _purposeNameVN;
	}

	@Override
	public void setPurposeNameVN(String purposeNameVN) {
		_purposeNameVN = purposeNameVN;

		if (_dmArrivalPurposeRemoteModel != null) {
			try {
				Class<?> clazz = _dmArrivalPurposeRemoteModel.getClass();

				Method method = clazz.getMethod("setPurposeNameVN", String.class);

				method.invoke(_dmArrivalPurposeRemoteModel, purposeNameVN);
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

		if (_dmArrivalPurposeRemoteModel != null) {
			try {
				Class<?> clazz = _dmArrivalPurposeRemoteModel.getClass();

				Method method = clazz.getMethod("setIsDelete", int.class);

				method.invoke(_dmArrivalPurposeRemoteModel, isDelete);
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

		if (_dmArrivalPurposeRemoteModel != null) {
			try {
				Class<?> clazz = _dmArrivalPurposeRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkedAsDelete", int.class);

				method.invoke(_dmArrivalPurposeRemoteModel, markedAsDelete);
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

		if (_dmArrivalPurposeRemoteModel != null) {
			try {
				Class<?> clazz = _dmArrivalPurposeRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_dmArrivalPurposeRemoteModel, modifiedDate);
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

		if (_dmArrivalPurposeRemoteModel != null) {
			try {
				Class<?> clazz = _dmArrivalPurposeRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestedDate", Date.class);

				method.invoke(_dmArrivalPurposeRemoteModel, requestedDate);
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

		if (_dmArrivalPurposeRemoteModel != null) {
			try {
				Class<?> clazz = _dmArrivalPurposeRemoteModel.getClass();

				Method method = clazz.getMethod("setSyncVersion", String.class);

				method.invoke(_dmArrivalPurposeRemoteModel, syncVersion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDmArrivalPurposeRemoteModel() {
		return _dmArrivalPurposeRemoteModel;
	}

	public void setDmArrivalPurposeRemoteModel(
		BaseModel<?> dmArrivalPurposeRemoteModel) {
		_dmArrivalPurposeRemoteModel = dmArrivalPurposeRemoteModel;
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

		Class<?> remoteModelClass = _dmArrivalPurposeRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dmArrivalPurposeRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DmArrivalPurposeLocalServiceUtil.addDmArrivalPurpose(this);
		}
		else {
			DmArrivalPurposeLocalServiceUtil.updateDmArrivalPurpose(this);
		}
	}

	@Override
	public DmArrivalPurpose toEscapedModel() {
		return (DmArrivalPurpose)ProxyUtil.newProxyInstance(DmArrivalPurpose.class.getClassLoader(),
			new Class[] { DmArrivalPurpose.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmArrivalPurposeClp clone = new DmArrivalPurposeClp();

		clone.setId(getId());
		clone.setPurposeCode(getPurposeCode());
		clone.setPurposeName(getPurposeName());
		clone.setPurposeNameVN(getPurposeNameVN());
		clone.setIsDelete(getIsDelete());
		clone.setMarkedAsDelete(getMarkedAsDelete());
		clone.setModifiedDate(getModifiedDate());
		clone.setRequestedDate(getRequestedDate());
		clone.setSyncVersion(getSyncVersion());

		return clone;
	}

	@Override
	public int compareTo(DmArrivalPurpose dmArrivalPurpose) {
		int value = 0;

		if (getId() < dmArrivalPurpose.getId()) {
			value = -1;
		}
		else if (getId() > dmArrivalPurpose.getId()) {
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

		if (!(obj instanceof DmArrivalPurposeClp)) {
			return false;
		}

		DmArrivalPurposeClp dmArrivalPurpose = (DmArrivalPurposeClp)obj;

		int primaryKey = dmArrivalPurpose.getPrimaryKey();

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
		return getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", purposeCode=");
		sb.append(getPurposeCode());
		sb.append(", purposeName=");
		sb.append(getPurposeName());
		sb.append(", purposeNameVN=");
		sb.append(getPurposeNameVN());
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
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DmArrivalPurpose");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>purposeCode</column-name><column-value><![CDATA[");
		sb.append(getPurposeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>purposeName</column-name><column-value><![CDATA[");
		sb.append(getPurposeName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>purposeNameVN</column-name><column-value><![CDATA[");
		sb.append(getPurposeNameVN());
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
	private String _purposeCode;
	private String _purposeName;
	private String _purposeNameVN;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private BaseModel<?> _dmArrivalPurposeRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.class;
}