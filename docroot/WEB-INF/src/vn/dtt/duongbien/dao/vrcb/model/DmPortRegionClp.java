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
import vn.dtt.duongbien.dao.vrcb.service.DmPortRegionLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class DmPortRegionClp extends BaseModelImpl<DmPortRegion>
	implements DmPortRegion {
	public DmPortRegionClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DmPortRegion.class;
	}

	@Override
	public String getModelClassName() {
		return DmPortRegion.class.getName();
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
		attributes.put("portRegionCode", getPortRegionCode());
		attributes.put("portRegionName", getPortRegionName());
		attributes.put("portRegionNameVN", getPortRegionNameVN());
		attributes.put("portRegionRef", getPortRegionRef());
		attributes.put("portCode", getPortCode());
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

		String portRegionCode = (String)attributes.get("portRegionCode");

		if (portRegionCode != null) {
			setPortRegionCode(portRegionCode);
		}

		String portRegionName = (String)attributes.get("portRegionName");

		if (portRegionName != null) {
			setPortRegionName(portRegionName);
		}

		String portRegionNameVN = (String)attributes.get("portRegionNameVN");

		if (portRegionNameVN != null) {
			setPortRegionNameVN(portRegionNameVN);
		}

		String portRegionRef = (String)attributes.get("portRegionRef");

		if (portRegionRef != null) {
			setPortRegionRef(portRegionRef);
		}

		String portCode = (String)attributes.get("portCode");

		if (portCode != null) {
			setPortCode(portCode);
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

		if (_dmPortRegionRemoteModel != null) {
			try {
				Class<?> clazz = _dmPortRegionRemoteModel.getClass();

				Method method = clazz.getMethod("setId", int.class);

				method.invoke(_dmPortRegionRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPortRegionCode() {
		return _portRegionCode;
	}

	@Override
	public void setPortRegionCode(String portRegionCode) {
		_portRegionCode = portRegionCode;

		if (_dmPortRegionRemoteModel != null) {
			try {
				Class<?> clazz = _dmPortRegionRemoteModel.getClass();

				Method method = clazz.getMethod("setPortRegionCode",
						String.class);

				method.invoke(_dmPortRegionRemoteModel, portRegionCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPortRegionName() {
		return _portRegionName;
	}

	@Override
	public void setPortRegionName(String portRegionName) {
		_portRegionName = portRegionName;

		if (_dmPortRegionRemoteModel != null) {
			try {
				Class<?> clazz = _dmPortRegionRemoteModel.getClass();

				Method method = clazz.getMethod("setPortRegionName",
						String.class);

				method.invoke(_dmPortRegionRemoteModel, portRegionName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPortRegionNameVN() {
		return _portRegionNameVN;
	}

	@Override
	public void setPortRegionNameVN(String portRegionNameVN) {
		_portRegionNameVN = portRegionNameVN;

		if (_dmPortRegionRemoteModel != null) {
			try {
				Class<?> clazz = _dmPortRegionRemoteModel.getClass();

				Method method = clazz.getMethod("setPortRegionNameVN",
						String.class);

				method.invoke(_dmPortRegionRemoteModel, portRegionNameVN);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPortRegionRef() {
		return _portRegionRef;
	}

	@Override
	public void setPortRegionRef(String portRegionRef) {
		_portRegionRef = portRegionRef;

		if (_dmPortRegionRemoteModel != null) {
			try {
				Class<?> clazz = _dmPortRegionRemoteModel.getClass();

				Method method = clazz.getMethod("setPortRegionRef", String.class);

				method.invoke(_dmPortRegionRemoteModel, portRegionRef);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPortCode() {
		return _portCode;
	}

	@Override
	public void setPortCode(String portCode) {
		_portCode = portCode;

		if (_dmPortRegionRemoteModel != null) {
			try {
				Class<?> clazz = _dmPortRegionRemoteModel.getClass();

				Method method = clazz.getMethod("setPortCode", String.class);

				method.invoke(_dmPortRegionRemoteModel, portCode);
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

		if (_dmPortRegionRemoteModel != null) {
			try {
				Class<?> clazz = _dmPortRegionRemoteModel.getClass();

				Method method = clazz.getMethod("setIsDelete", int.class);

				method.invoke(_dmPortRegionRemoteModel, isDelete);
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

		if (_dmPortRegionRemoteModel != null) {
			try {
				Class<?> clazz = _dmPortRegionRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkedAsDelete", int.class);

				method.invoke(_dmPortRegionRemoteModel, markedAsDelete);
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

		if (_dmPortRegionRemoteModel != null) {
			try {
				Class<?> clazz = _dmPortRegionRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_dmPortRegionRemoteModel, modifiedDate);
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

		if (_dmPortRegionRemoteModel != null) {
			try {
				Class<?> clazz = _dmPortRegionRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestedDate", Date.class);

				method.invoke(_dmPortRegionRemoteModel, requestedDate);
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

		if (_dmPortRegionRemoteModel != null) {
			try {
				Class<?> clazz = _dmPortRegionRemoteModel.getClass();

				Method method = clazz.getMethod("setSyncVersion", String.class);

				method.invoke(_dmPortRegionRemoteModel, syncVersion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDmPortRegionRemoteModel() {
		return _dmPortRegionRemoteModel;
	}

	public void setDmPortRegionRemoteModel(BaseModel<?> dmPortRegionRemoteModel) {
		_dmPortRegionRemoteModel = dmPortRegionRemoteModel;
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

		Class<?> remoteModelClass = _dmPortRegionRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dmPortRegionRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DmPortRegionLocalServiceUtil.addDmPortRegion(this);
		}
		else {
			DmPortRegionLocalServiceUtil.updateDmPortRegion(this);
		}
	}

	@Override
	public DmPortRegion toEscapedModel() {
		return (DmPortRegion)ProxyUtil.newProxyInstance(DmPortRegion.class.getClassLoader(),
			new Class[] { DmPortRegion.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmPortRegionClp clone = new DmPortRegionClp();

		clone.setId(getId());
		clone.setPortRegionCode(getPortRegionCode());
		clone.setPortRegionName(getPortRegionName());
		clone.setPortRegionNameVN(getPortRegionNameVN());
		clone.setPortRegionRef(getPortRegionRef());
		clone.setPortCode(getPortCode());
		clone.setIsDelete(getIsDelete());
		clone.setMarkedAsDelete(getMarkedAsDelete());
		clone.setModifiedDate(getModifiedDate());
		clone.setRequestedDate(getRequestedDate());
		clone.setSyncVersion(getSyncVersion());

		return clone;
	}

	@Override
	public int compareTo(DmPortRegion dmPortRegion) {
		int value = 0;

		if (getId() < dmPortRegion.getId()) {
			value = -1;
		}
		else if (getId() > dmPortRegion.getId()) {
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

		if (!(obj instanceof DmPortRegionClp)) {
			return false;
		}

		DmPortRegionClp dmPortRegion = (DmPortRegionClp)obj;

		int primaryKey = dmPortRegion.getPrimaryKey();

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
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", portRegionCode=");
		sb.append(getPortRegionCode());
		sb.append(", portRegionName=");
		sb.append(getPortRegionName());
		sb.append(", portRegionNameVN=");
		sb.append(getPortRegionNameVN());
		sb.append(", portRegionRef=");
		sb.append(getPortRegionRef());
		sb.append(", portCode=");
		sb.append(getPortCode());
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
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DmPortRegion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portRegionCode</column-name><column-value><![CDATA[");
		sb.append(getPortRegionCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portRegionName</column-name><column-value><![CDATA[");
		sb.append(getPortRegionName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portRegionNameVN</column-name><column-value><![CDATA[");
		sb.append(getPortRegionNameVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portRegionRef</column-name><column-value><![CDATA[");
		sb.append(getPortRegionRef());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portCode</column-name><column-value><![CDATA[");
		sb.append(getPortCode());
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
	private String _portRegionCode;
	private String _portRegionName;
	private String _portRegionNameVN;
	private String _portRegionRef;
	private String _portCode;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private BaseModel<?> _dmPortRegionRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.class;
}