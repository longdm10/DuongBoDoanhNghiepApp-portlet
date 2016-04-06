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
import vn.dtt.duongbien.dao.vrcb.service.DmGtOrganizationLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class DmGtOrganizationClp extends BaseModelImpl<DmGtOrganization>
	implements DmGtOrganization {
	public DmGtOrganizationClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DmGtOrganization.class;
	}

	@Override
	public String getModelClassName() {
		return DmGtOrganization.class.getName();
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
		attributes.put("organizationCode", getOrganizationCode());
		attributes.put("organizationName", getOrganizationName());
		attributes.put("organizationNameVN", getOrganizationNameVN());
		attributes.put("organizationorder", getOrganizationorder());
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

		String organizationCode = (String)attributes.get("organizationCode");

		if (organizationCode != null) {
			setOrganizationCode(organizationCode);
		}

		String organizationName = (String)attributes.get("organizationName");

		if (organizationName != null) {
			setOrganizationName(organizationName);
		}

		String organizationNameVN = (String)attributes.get("organizationNameVN");

		if (organizationNameVN != null) {
			setOrganizationNameVN(organizationNameVN);
		}

		Integer organizationorder = (Integer)attributes.get("organizationorder");

		if (organizationorder != null) {
			setOrganizationorder(organizationorder);
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

		if (_dmGtOrganizationRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtOrganizationRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_dmGtOrganizationRemoteModel, id);
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

		if (_dmGtOrganizationRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtOrganizationRemoteModel.getClass();

				Method method = clazz.getMethod("setOrganizationCode",
						String.class);

				method.invoke(_dmGtOrganizationRemoteModel, organizationCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOrganizationName() {
		return _organizationName;
	}

	@Override
	public void setOrganizationName(String organizationName) {
		_organizationName = organizationName;

		if (_dmGtOrganizationRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtOrganizationRemoteModel.getClass();

				Method method = clazz.getMethod("setOrganizationName",
						String.class);

				method.invoke(_dmGtOrganizationRemoteModel, organizationName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOrganizationNameVN() {
		return _organizationNameVN;
	}

	@Override
	public void setOrganizationNameVN(String organizationNameVN) {
		_organizationNameVN = organizationNameVN;

		if (_dmGtOrganizationRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtOrganizationRemoteModel.getClass();

				Method method = clazz.getMethod("setOrganizationNameVN",
						String.class);

				method.invoke(_dmGtOrganizationRemoteModel, organizationNameVN);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getOrganizationorder() {
		return _organizationorder;
	}

	@Override
	public void setOrganizationorder(int organizationorder) {
		_organizationorder = organizationorder;

		if (_dmGtOrganizationRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtOrganizationRemoteModel.getClass();

				Method method = clazz.getMethod("setOrganizationorder",
						int.class);

				method.invoke(_dmGtOrganizationRemoteModel, organizationorder);
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

		if (_dmGtOrganizationRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtOrganizationRemoteModel.getClass();

				Method method = clazz.getMethod("setIsDelete", int.class);

				method.invoke(_dmGtOrganizationRemoteModel, isDelete);
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

		if (_dmGtOrganizationRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtOrganizationRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkedAsDelete", int.class);

				method.invoke(_dmGtOrganizationRemoteModel, markedAsDelete);
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

		if (_dmGtOrganizationRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtOrganizationRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_dmGtOrganizationRemoteModel, modifiedDate);
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

		if (_dmGtOrganizationRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtOrganizationRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestedDate", Date.class);

				method.invoke(_dmGtOrganizationRemoteModel, requestedDate);
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

		if (_dmGtOrganizationRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtOrganizationRemoteModel.getClass();

				Method method = clazz.getMethod("setSyncVersion", String.class);

				method.invoke(_dmGtOrganizationRemoteModel, syncVersion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDmGtOrganizationRemoteModel() {
		return _dmGtOrganizationRemoteModel;
	}

	public void setDmGtOrganizationRemoteModel(
		BaseModel<?> dmGtOrganizationRemoteModel) {
		_dmGtOrganizationRemoteModel = dmGtOrganizationRemoteModel;
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

		Class<?> remoteModelClass = _dmGtOrganizationRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dmGtOrganizationRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DmGtOrganizationLocalServiceUtil.addDmGtOrganization(this);
		}
		else {
			DmGtOrganizationLocalServiceUtil.updateDmGtOrganization(this);
		}
	}

	@Override
	public DmGtOrganization toEscapedModel() {
		return (DmGtOrganization)ProxyUtil.newProxyInstance(DmGtOrganization.class.getClassLoader(),
			new Class[] { DmGtOrganization.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmGtOrganizationClp clone = new DmGtOrganizationClp();

		clone.setId(getId());
		clone.setOrganizationCode(getOrganizationCode());
		clone.setOrganizationName(getOrganizationName());
		clone.setOrganizationNameVN(getOrganizationNameVN());
		clone.setOrganizationorder(getOrganizationorder());
		clone.setIsDelete(getIsDelete());
		clone.setMarkedAsDelete(getMarkedAsDelete());
		clone.setModifiedDate(getModifiedDate());
		clone.setRequestedDate(getRequestedDate());
		clone.setSyncVersion(getSyncVersion());

		return clone;
	}

	@Override
	public int compareTo(DmGtOrganization dmGtOrganization) {
		int value = 0;

		if (getId() < dmGtOrganization.getId()) {
			value = -1;
		}
		else if (getId() > dmGtOrganization.getId()) {
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

		if (!(obj instanceof DmGtOrganizationClp)) {
			return false;
		}

		DmGtOrganizationClp dmGtOrganization = (DmGtOrganizationClp)obj;

		long primaryKey = dmGtOrganization.getPrimaryKey();

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
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", organizationCode=");
		sb.append(getOrganizationCode());
		sb.append(", organizationName=");
		sb.append(getOrganizationName());
		sb.append(", organizationNameVN=");
		sb.append(getOrganizationNameVN());
		sb.append(", organizationorder=");
		sb.append(getOrganizationorder());
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
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DmGtOrganization");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organizationCode</column-name><column-value><![CDATA[");
		sb.append(getOrganizationCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organizationName</column-name><column-value><![CDATA[");
		sb.append(getOrganizationName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organizationNameVN</column-name><column-value><![CDATA[");
		sb.append(getOrganizationNameVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organizationorder</column-name><column-value><![CDATA[");
		sb.append(getOrganizationorder());
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
	private String _organizationCode;
	private String _organizationName;
	private String _organizationNameVN;
	private int _organizationorder;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private BaseModel<?> _dmGtOrganizationRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.class;
}