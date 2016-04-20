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

package vn.dtt.duongbo.dao.common.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbo.dao.common.service.ClpSerializer;
import vn.dtt.duongbo.dao.common.service.DmDataVersionLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class DmDataVersionClp extends BaseModelImpl<DmDataVersion>
	implements DmDataVersion {
	public DmDataVersionClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DmDataVersion.class;
	}

	@Override
	public String getModelClassName() {
		return DmDataVersion.class.getName();
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
		attributes.put("dataGroupId", getDataGroupId());
		attributes.put("version", getVersion());
		attributes.put("issuedTime", getIssuedTime());
		attributes.put("validateDFrom", getValidateDFrom());
		attributes.put("validatedTo", getValidatedTo());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long dataGroupId = (Long)attributes.get("dataGroupId");

		if (dataGroupId != null) {
			setDataGroupId(dataGroupId);
		}

		String version = (String)attributes.get("version");

		if (version != null) {
			setVersion(version);
		}

		Date issuedTime = (Date)attributes.get("issuedTime");

		if (issuedTime != null) {
			setIssuedTime(issuedTime);
		}

		Date validateDFrom = (Date)attributes.get("validateDFrom");

		if (validateDFrom != null) {
			setValidateDFrom(validateDFrom);
		}

		Date validatedTo = (Date)attributes.get("validatedTo");

		if (validatedTo != null) {
			setValidatedTo(validatedTo);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_dmDataVersionRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_dmDataVersionRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDataGroupId() {
		return _dataGroupId;
	}

	@Override
	public void setDataGroupId(long dataGroupId) {
		_dataGroupId = dataGroupId;

		if (_dmDataVersionRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setDataGroupId", long.class);

				method.invoke(_dmDataVersionRemoteModel, dataGroupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVersion() {
		return _version;
	}

	@Override
	public void setVersion(String version) {
		_version = version;

		if (_dmDataVersionRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setVersion", String.class);

				method.invoke(_dmDataVersionRemoteModel, version);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getIssuedTime() {
		return _issuedTime;
	}

	@Override
	public void setIssuedTime(Date issuedTime) {
		_issuedTime = issuedTime;

		if (_dmDataVersionRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setIssuedTime", Date.class);

				method.invoke(_dmDataVersionRemoteModel, issuedTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getValidateDFrom() {
		return _validateDFrom;
	}

	@Override
	public void setValidateDFrom(Date validateDFrom) {
		_validateDFrom = validateDFrom;

		if (_dmDataVersionRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setValidateDFrom", Date.class);

				method.invoke(_dmDataVersionRemoteModel, validateDFrom);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getValidatedTo() {
		return _validatedTo;
	}

	@Override
	public void setValidatedTo(Date validatedTo) {
		_validatedTo = validatedTo;

		if (_dmDataVersionRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setValidatedTo", Date.class);

				method.invoke(_dmDataVersionRemoteModel, validatedTo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDmDataVersionRemoteModel() {
		return _dmDataVersionRemoteModel;
	}

	public void setDmDataVersionRemoteModel(
		BaseModel<?> dmDataVersionRemoteModel) {
		_dmDataVersionRemoteModel = dmDataVersionRemoteModel;
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

		Class<?> remoteModelClass = _dmDataVersionRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dmDataVersionRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DmDataVersionLocalServiceUtil.addDmDataVersion(this);
		}
		else {
			DmDataVersionLocalServiceUtil.updateDmDataVersion(this);
		}
	}

	@Override
	public DmDataVersion toEscapedModel() {
		return (DmDataVersion)ProxyUtil.newProxyInstance(DmDataVersion.class.getClassLoader(),
			new Class[] { DmDataVersion.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmDataVersionClp clone = new DmDataVersionClp();

		clone.setId(getId());
		clone.setDataGroupId(getDataGroupId());
		clone.setVersion(getVersion());
		clone.setIssuedTime(getIssuedTime());
		clone.setValidateDFrom(getValidateDFrom());
		clone.setValidatedTo(getValidatedTo());

		return clone;
	}

	@Override
	public int compareTo(DmDataVersion dmDataVersion) {
		int value = 0;

		if (getId() < dmDataVersion.getId()) {
			value = -1;
		}
		else if (getId() > dmDataVersion.getId()) {
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

		if (!(obj instanceof DmDataVersionClp)) {
			return false;
		}

		DmDataVersionClp dmDataVersion = (DmDataVersionClp)obj;

		long primaryKey = dmDataVersion.getPrimaryKey();

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
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", dataGroupId=");
		sb.append(getDataGroupId());
		sb.append(", version=");
		sb.append(getVersion());
		sb.append(", issuedTime=");
		sb.append(getIssuedTime());
		sb.append(", validateDFrom=");
		sb.append(getValidateDFrom());
		sb.append(", validatedTo=");
		sb.append(getValidatedTo());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.common.model.DmDataVersion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dataGroupId</column-name><column-value><![CDATA[");
		sb.append(getDataGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>version</column-name><column-value><![CDATA[");
		sb.append(getVersion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>issuedTime</column-name><column-value><![CDATA[");
		sb.append(getIssuedTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>validateDFrom</column-name><column-value><![CDATA[");
		sb.append(getValidateDFrom());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>validatedTo</column-name><column-value><![CDATA[");
		sb.append(getValidatedTo());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _dataGroupId;
	private String _version;
	private Date _issuedTime;
	private Date _validateDFrom;
	private Date _validatedTo;
	private BaseModel<?> _dmDataVersionRemoteModel;
}