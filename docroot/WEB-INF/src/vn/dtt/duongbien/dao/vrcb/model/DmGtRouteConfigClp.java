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
import vn.dtt.duongbien.dao.vrcb.service.DmGtRouteConfigLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class DmGtRouteConfigClp extends BaseModelImpl<DmGtRouteConfig>
	implements DmGtRouteConfig {
	public DmGtRouteConfigClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DmGtRouteConfig.class;
	}

	@Override
	public String getModelClassName() {
		return DmGtRouteConfig.class.getName();
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
		attributes.put("routeCode", getRouteCode());
		attributes.put("organizationCode", getOrganizationCode());
		attributes.put("locCode", getLocCode());
		attributes.put("ipName", getIpName());
		attributes.put("portName", getPortName());
		attributes.put("linkAddress", getLinkAddress());
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

		String routeCode = (String)attributes.get("routeCode");

		if (routeCode != null) {
			setRouteCode(routeCode);
		}

		String organizationCode = (String)attributes.get("organizationCode");

		if (organizationCode != null) {
			setOrganizationCode(organizationCode);
		}

		String locCode = (String)attributes.get("locCode");

		if (locCode != null) {
			setLocCode(locCode);
		}

		String ipName = (String)attributes.get("ipName");

		if (ipName != null) {
			setIpName(ipName);
		}

		String portName = (String)attributes.get("portName");

		if (portName != null) {
			setPortName(portName);
		}

		String linkAddress = (String)attributes.get("linkAddress");

		if (linkAddress != null) {
			setLinkAddress(linkAddress);
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

		if (_dmGtRouteConfigRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtRouteConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_dmGtRouteConfigRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRouteCode() {
		return _routeCode;
	}

	@Override
	public void setRouteCode(String routeCode) {
		_routeCode = routeCode;

		if (_dmGtRouteConfigRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtRouteConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setRouteCode", String.class);

				method.invoke(_dmGtRouteConfigRemoteModel, routeCode);
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

		if (_dmGtRouteConfigRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtRouteConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setOrganizationCode",
						String.class);

				method.invoke(_dmGtRouteConfigRemoteModel, organizationCode);
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

		if (_dmGtRouteConfigRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtRouteConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setLocCode", String.class);

				method.invoke(_dmGtRouteConfigRemoteModel, locCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getIpName() {
		return _ipName;
	}

	@Override
	public void setIpName(String ipName) {
		_ipName = ipName;

		if (_dmGtRouteConfigRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtRouteConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setIpName", String.class);

				method.invoke(_dmGtRouteConfigRemoteModel, ipName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPortName() {
		return _portName;
	}

	@Override
	public void setPortName(String portName) {
		_portName = portName;

		if (_dmGtRouteConfigRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtRouteConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setPortName", String.class);

				method.invoke(_dmGtRouteConfigRemoteModel, portName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLinkAddress() {
		return _linkAddress;
	}

	@Override
	public void setLinkAddress(String linkAddress) {
		_linkAddress = linkAddress;

		if (_dmGtRouteConfigRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtRouteConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setLinkAddress", String.class);

				method.invoke(_dmGtRouteConfigRemoteModel, linkAddress);
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

		if (_dmGtRouteConfigRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtRouteConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setIsDelete", int.class);

				method.invoke(_dmGtRouteConfigRemoteModel, isDelete);
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

		if (_dmGtRouteConfigRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtRouteConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkedAsDelete", int.class);

				method.invoke(_dmGtRouteConfigRemoteModel, markedAsDelete);
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

		if (_dmGtRouteConfigRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtRouteConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_dmGtRouteConfigRemoteModel, modifiedDate);
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

		if (_dmGtRouteConfigRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtRouteConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestedDate", Date.class);

				method.invoke(_dmGtRouteConfigRemoteModel, requestedDate);
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

		if (_dmGtRouteConfigRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtRouteConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setSyncVersion", String.class);

				method.invoke(_dmGtRouteConfigRemoteModel, syncVersion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDmGtRouteConfigRemoteModel() {
		return _dmGtRouteConfigRemoteModel;
	}

	public void setDmGtRouteConfigRemoteModel(
		BaseModel<?> dmGtRouteConfigRemoteModel) {
		_dmGtRouteConfigRemoteModel = dmGtRouteConfigRemoteModel;
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

		Class<?> remoteModelClass = _dmGtRouteConfigRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dmGtRouteConfigRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DmGtRouteConfigLocalServiceUtil.addDmGtRouteConfig(this);
		}
		else {
			DmGtRouteConfigLocalServiceUtil.updateDmGtRouteConfig(this);
		}
	}

	@Override
	public DmGtRouteConfig toEscapedModel() {
		return (DmGtRouteConfig)ProxyUtil.newProxyInstance(DmGtRouteConfig.class.getClassLoader(),
			new Class[] { DmGtRouteConfig.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmGtRouteConfigClp clone = new DmGtRouteConfigClp();

		clone.setId(getId());
		clone.setRouteCode(getRouteCode());
		clone.setOrganizationCode(getOrganizationCode());
		clone.setLocCode(getLocCode());
		clone.setIpName(getIpName());
		clone.setPortName(getPortName());
		clone.setLinkAddress(getLinkAddress());
		clone.setIsDelete(getIsDelete());
		clone.setMarkedAsDelete(getMarkedAsDelete());
		clone.setModifiedDate(getModifiedDate());
		clone.setRequestedDate(getRequestedDate());
		clone.setSyncVersion(getSyncVersion());

		return clone;
	}

	@Override
	public int compareTo(DmGtRouteConfig dmGtRouteConfig) {
		int value = 0;

		if (getId() < dmGtRouteConfig.getId()) {
			value = -1;
		}
		else if (getId() > dmGtRouteConfig.getId()) {
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

		if (!(obj instanceof DmGtRouteConfigClp)) {
			return false;
		}

		DmGtRouteConfigClp dmGtRouteConfig = (DmGtRouteConfigClp)obj;

		long primaryKey = dmGtRouteConfig.getPrimaryKey();

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
		StringBundler sb = new StringBundler(25);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", routeCode=");
		sb.append(getRouteCode());
		sb.append(", organizationCode=");
		sb.append(getOrganizationCode());
		sb.append(", locCode=");
		sb.append(getLocCode());
		sb.append(", ipName=");
		sb.append(getIpName());
		sb.append(", portName=");
		sb.append(getPortName());
		sb.append(", linkAddress=");
		sb.append(getLinkAddress());
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
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DmGtRouteConfig");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>routeCode</column-name><column-value><![CDATA[");
		sb.append(getRouteCode());
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
			"<column><column-name>ipName</column-name><column-value><![CDATA[");
		sb.append(getIpName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portName</column-name><column-value><![CDATA[");
		sb.append(getPortName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>linkAddress</column-name><column-value><![CDATA[");
		sb.append(getLinkAddress());
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
	private String _routeCode;
	private String _organizationCode;
	private String _locCode;
	private String _ipName;
	private String _portName;
	private String _linkAddress;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private BaseModel<?> _dmGtRouteConfigRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.class;
}