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
import vn.dtt.duongbien.dao.vrcb.service.DmHistoryPassportTypeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class DmHistoryPassportTypeClp extends BaseModelImpl<DmHistoryPassportType>
	implements DmHistoryPassportType {
	public DmHistoryPassportTypeClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DmHistoryPassportType.class;
	}

	@Override
	public String getModelClassName() {
		return DmHistoryPassportType.class.getName();
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
		attributes.put("passportTypeCode", getPassportTypeCode());
		attributes.put("passportType", getPassportType());
		attributes.put("passportTypeName", getPassportTypeName());
		attributes.put("passportTypeNameVN", getPassportTypeNameVN());
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

		String passportTypeCode = (String)attributes.get("passportTypeCode");

		if (passportTypeCode != null) {
			setPassportTypeCode(passportTypeCode);
		}

		String passportType = (String)attributes.get("passportType");

		if (passportType != null) {
			setPassportType(passportType);
		}

		String passportTypeName = (String)attributes.get("passportTypeName");

		if (passportTypeName != null) {
			setPassportTypeName(passportTypeName);
		}

		String passportTypeNameVN = (String)attributes.get("passportTypeNameVN");

		if (passportTypeNameVN != null) {
			setPassportTypeNameVN(passportTypeNameVN);
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

		if (_dmHistoryPassportTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPassportTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setId", int.class);

				method.invoke(_dmHistoryPassportTypeRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPassportTypeCode() {
		return _passportTypeCode;
	}

	@Override
	public void setPassportTypeCode(String passportTypeCode) {
		_passportTypeCode = passportTypeCode;

		if (_dmHistoryPassportTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPassportTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setPassportTypeCode",
						String.class);

				method.invoke(_dmHistoryPassportTypeRemoteModel,
					passportTypeCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPassportType() {
		return _passportType;
	}

	@Override
	public void setPassportType(String passportType) {
		_passportType = passportType;

		if (_dmHistoryPassportTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPassportTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setPassportType", String.class);

				method.invoke(_dmHistoryPassportTypeRemoteModel, passportType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPassportTypeName() {
		return _passportTypeName;
	}

	@Override
	public void setPassportTypeName(String passportTypeName) {
		_passportTypeName = passportTypeName;

		if (_dmHistoryPassportTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPassportTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setPassportTypeName",
						String.class);

				method.invoke(_dmHistoryPassportTypeRemoteModel,
					passportTypeName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPassportTypeNameVN() {
		return _passportTypeNameVN;
	}

	@Override
	public void setPassportTypeNameVN(String passportTypeNameVN) {
		_passportTypeNameVN = passportTypeNameVN;

		if (_dmHistoryPassportTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPassportTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setPassportTypeNameVN",
						String.class);

				method.invoke(_dmHistoryPassportTypeRemoteModel,
					passportTypeNameVN);
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

		if (_dmHistoryPassportTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPassportTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setIsDelete", int.class);

				method.invoke(_dmHistoryPassportTypeRemoteModel, isDelete);
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

		if (_dmHistoryPassportTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPassportTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkedAsDelete", int.class);

				method.invoke(_dmHistoryPassportTypeRemoteModel, markedAsDelete);
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

		if (_dmHistoryPassportTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPassportTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_dmHistoryPassportTypeRemoteModel, modifiedDate);
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

		if (_dmHistoryPassportTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPassportTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestedDate", Date.class);

				method.invoke(_dmHistoryPassportTypeRemoteModel, requestedDate);
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

		if (_dmHistoryPassportTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPassportTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setSyncVersion", String.class);

				method.invoke(_dmHistoryPassportTypeRemoteModel, syncVersion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDmHistoryPassportTypeRemoteModel() {
		return _dmHistoryPassportTypeRemoteModel;
	}

	public void setDmHistoryPassportTypeRemoteModel(
		BaseModel<?> dmHistoryPassportTypeRemoteModel) {
		_dmHistoryPassportTypeRemoteModel = dmHistoryPassportTypeRemoteModel;
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

		Class<?> remoteModelClass = _dmHistoryPassportTypeRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dmHistoryPassportTypeRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DmHistoryPassportTypeLocalServiceUtil.addDmHistoryPassportType(this);
		}
		else {
			DmHistoryPassportTypeLocalServiceUtil.updateDmHistoryPassportType(this);
		}
	}

	@Override
	public DmHistoryPassportType toEscapedModel() {
		return (DmHistoryPassportType)ProxyUtil.newProxyInstance(DmHistoryPassportType.class.getClassLoader(),
			new Class[] { DmHistoryPassportType.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmHistoryPassportTypeClp clone = new DmHistoryPassportTypeClp();

		clone.setId(getId());
		clone.setPassportTypeCode(getPassportTypeCode());
		clone.setPassportType(getPassportType());
		clone.setPassportTypeName(getPassportTypeName());
		clone.setPassportTypeNameVN(getPassportTypeNameVN());
		clone.setIsDelete(getIsDelete());
		clone.setMarkedAsDelete(getMarkedAsDelete());
		clone.setModifiedDate(getModifiedDate());
		clone.setRequestedDate(getRequestedDate());
		clone.setSyncVersion(getSyncVersion());

		return clone;
	}

	@Override
	public int compareTo(DmHistoryPassportType dmHistoryPassportType) {
		int value = 0;

		if (getId() < dmHistoryPassportType.getId()) {
			value = -1;
		}
		else if (getId() > dmHistoryPassportType.getId()) {
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

		if (!(obj instanceof DmHistoryPassportTypeClp)) {
			return false;
		}

		DmHistoryPassportTypeClp dmHistoryPassportType = (DmHistoryPassportTypeClp)obj;

		int primaryKey = dmHistoryPassportType.getPrimaryKey();

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
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", passportTypeCode=");
		sb.append(getPassportTypeCode());
		sb.append(", passportType=");
		sb.append(getPassportType());
		sb.append(", passportTypeName=");
		sb.append(getPassportTypeName());
		sb.append(", passportTypeNameVN=");
		sb.append(getPassportTypeNameVN());
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
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DmHistoryPassportType");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>passportTypeCode</column-name><column-value><![CDATA[");
		sb.append(getPassportTypeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>passportType</column-name><column-value><![CDATA[");
		sb.append(getPassportType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>passportTypeName</column-name><column-value><![CDATA[");
		sb.append(getPassportTypeName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>passportTypeNameVN</column-name><column-value><![CDATA[");
		sb.append(getPassportTypeNameVN());
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
	private String _passportTypeCode;
	private String _passportType;
	private String _passportTypeName;
	private String _passportTypeNameVN;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private BaseModel<?> _dmHistoryPassportTypeRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.class;
}