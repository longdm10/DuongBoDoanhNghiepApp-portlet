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
import vn.dtt.duongbien.dao.vrcb.service.DmHistoryPortHarbourLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class DmHistoryPortHarbourClp extends BaseModelImpl<DmHistoryPortHarbour>
	implements DmHistoryPortHarbour {
	public DmHistoryPortHarbourClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DmHistoryPortHarbour.class;
	}

	@Override
	public String getModelClassName() {
		return DmHistoryPortHarbour.class.getName();
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
		attributes.put("portHarbourCode", getPortHarbourCode());
		attributes.put("portHarbourName", getPortHarbourName());
		attributes.put("portHarbourNameVN", getPortHarbourNameVN());
		attributes.put("portHarbourType", getPortHarbourType());
		attributes.put("portCode", getPortCode());
		attributes.put("portRegionCode", getPortRegionCode());
		attributes.put("note", getNote());
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

		String portHarbourCode = (String)attributes.get("portHarbourCode");

		if (portHarbourCode != null) {
			setPortHarbourCode(portHarbourCode);
		}

		String portHarbourName = (String)attributes.get("portHarbourName");

		if (portHarbourName != null) {
			setPortHarbourName(portHarbourName);
		}

		String portHarbourNameVN = (String)attributes.get("portHarbourNameVN");

		if (portHarbourNameVN != null) {
			setPortHarbourNameVN(portHarbourNameVN);
		}

		Integer portHarbourType = (Integer)attributes.get("portHarbourType");

		if (portHarbourType != null) {
			setPortHarbourType(portHarbourType);
		}

		String portCode = (String)attributes.get("portCode");

		if (portCode != null) {
			setPortCode(portCode);
		}

		String portRegionCode = (String)attributes.get("portRegionCode");

		if (portRegionCode != null) {
			setPortRegionCode(portRegionCode);
		}

		String note = (String)attributes.get("note");

		if (note != null) {
			setNote(note);
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

		if (_dmHistoryPortHarbourRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortHarbourRemoteModel.getClass();

				Method method = clazz.getMethod("setId", int.class);

				method.invoke(_dmHistoryPortHarbourRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPortHarbourCode() {
		return _portHarbourCode;
	}

	@Override
	public void setPortHarbourCode(String portHarbourCode) {
		_portHarbourCode = portHarbourCode;

		if (_dmHistoryPortHarbourRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortHarbourRemoteModel.getClass();

				Method method = clazz.getMethod("setPortHarbourCode",
						String.class);

				method.invoke(_dmHistoryPortHarbourRemoteModel, portHarbourCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPortHarbourName() {
		return _portHarbourName;
	}

	@Override
	public void setPortHarbourName(String portHarbourName) {
		_portHarbourName = portHarbourName;

		if (_dmHistoryPortHarbourRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortHarbourRemoteModel.getClass();

				Method method = clazz.getMethod("setPortHarbourName",
						String.class);

				method.invoke(_dmHistoryPortHarbourRemoteModel, portHarbourName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPortHarbourNameVN() {
		return _portHarbourNameVN;
	}

	@Override
	public void setPortHarbourNameVN(String portHarbourNameVN) {
		_portHarbourNameVN = portHarbourNameVN;

		if (_dmHistoryPortHarbourRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortHarbourRemoteModel.getClass();

				Method method = clazz.getMethod("setPortHarbourNameVN",
						String.class);

				method.invoke(_dmHistoryPortHarbourRemoteModel,
					portHarbourNameVN);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPortHarbourType() {
		return _portHarbourType;
	}

	@Override
	public void setPortHarbourType(int portHarbourType) {
		_portHarbourType = portHarbourType;

		if (_dmHistoryPortHarbourRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortHarbourRemoteModel.getClass();

				Method method = clazz.getMethod("setPortHarbourType", int.class);

				method.invoke(_dmHistoryPortHarbourRemoteModel, portHarbourType);
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

		if (_dmHistoryPortHarbourRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortHarbourRemoteModel.getClass();

				Method method = clazz.getMethod("setPortCode", String.class);

				method.invoke(_dmHistoryPortHarbourRemoteModel, portCode);
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

		if (_dmHistoryPortHarbourRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortHarbourRemoteModel.getClass();

				Method method = clazz.getMethod("setPortRegionCode",
						String.class);

				method.invoke(_dmHistoryPortHarbourRemoteModel, portRegionCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNote() {
		return _note;
	}

	@Override
	public void setNote(String note) {
		_note = note;

		if (_dmHistoryPortHarbourRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortHarbourRemoteModel.getClass();

				Method method = clazz.getMethod("setNote", String.class);

				method.invoke(_dmHistoryPortHarbourRemoteModel, note);
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

		if (_dmHistoryPortHarbourRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortHarbourRemoteModel.getClass();

				Method method = clazz.getMethod("setIsDelete", int.class);

				method.invoke(_dmHistoryPortHarbourRemoteModel, isDelete);
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

		if (_dmHistoryPortHarbourRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortHarbourRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkedAsDelete", int.class);

				method.invoke(_dmHistoryPortHarbourRemoteModel, markedAsDelete);
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

		if (_dmHistoryPortHarbourRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortHarbourRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_dmHistoryPortHarbourRemoteModel, modifiedDate);
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

		if (_dmHistoryPortHarbourRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortHarbourRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestedDate", Date.class);

				method.invoke(_dmHistoryPortHarbourRemoteModel, requestedDate);
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

		if (_dmHistoryPortHarbourRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortHarbourRemoteModel.getClass();

				Method method = clazz.getMethod("setSyncVersion", String.class);

				method.invoke(_dmHistoryPortHarbourRemoteModel, syncVersion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDmHistoryPortHarbourRemoteModel() {
		return _dmHistoryPortHarbourRemoteModel;
	}

	public void setDmHistoryPortHarbourRemoteModel(
		BaseModel<?> dmHistoryPortHarbourRemoteModel) {
		_dmHistoryPortHarbourRemoteModel = dmHistoryPortHarbourRemoteModel;
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

		Class<?> remoteModelClass = _dmHistoryPortHarbourRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dmHistoryPortHarbourRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DmHistoryPortHarbourLocalServiceUtil.addDmHistoryPortHarbour(this);
		}
		else {
			DmHistoryPortHarbourLocalServiceUtil.updateDmHistoryPortHarbour(this);
		}
	}

	@Override
	public DmHistoryPortHarbour toEscapedModel() {
		return (DmHistoryPortHarbour)ProxyUtil.newProxyInstance(DmHistoryPortHarbour.class.getClassLoader(),
			new Class[] { DmHistoryPortHarbour.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmHistoryPortHarbourClp clone = new DmHistoryPortHarbourClp();

		clone.setId(getId());
		clone.setPortHarbourCode(getPortHarbourCode());
		clone.setPortHarbourName(getPortHarbourName());
		clone.setPortHarbourNameVN(getPortHarbourNameVN());
		clone.setPortHarbourType(getPortHarbourType());
		clone.setPortCode(getPortCode());
		clone.setPortRegionCode(getPortRegionCode());
		clone.setNote(getNote());
		clone.setIsDelete(getIsDelete());
		clone.setMarkedAsDelete(getMarkedAsDelete());
		clone.setModifiedDate(getModifiedDate());
		clone.setRequestedDate(getRequestedDate());
		clone.setSyncVersion(getSyncVersion());

		return clone;
	}

	@Override
	public int compareTo(DmHistoryPortHarbour dmHistoryPortHarbour) {
		int value = 0;

		if (getId() < dmHistoryPortHarbour.getId()) {
			value = -1;
		}
		else if (getId() > dmHistoryPortHarbour.getId()) {
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

		if (!(obj instanceof DmHistoryPortHarbourClp)) {
			return false;
		}

		DmHistoryPortHarbourClp dmHistoryPortHarbour = (DmHistoryPortHarbourClp)obj;

		int primaryKey = dmHistoryPortHarbour.getPrimaryKey();

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
		StringBundler sb = new StringBundler(27);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", portHarbourCode=");
		sb.append(getPortHarbourCode());
		sb.append(", portHarbourName=");
		sb.append(getPortHarbourName());
		sb.append(", portHarbourNameVN=");
		sb.append(getPortHarbourNameVN());
		sb.append(", portHarbourType=");
		sb.append(getPortHarbourType());
		sb.append(", portCode=");
		sb.append(getPortCode());
		sb.append(", portRegionCode=");
		sb.append(getPortRegionCode());
		sb.append(", note=");
		sb.append(getNote());
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
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portHarbourCode</column-name><column-value><![CDATA[");
		sb.append(getPortHarbourCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portHarbourName</column-name><column-value><![CDATA[");
		sb.append(getPortHarbourName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portHarbourNameVN</column-name><column-value><![CDATA[");
		sb.append(getPortHarbourNameVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portHarbourType</column-name><column-value><![CDATA[");
		sb.append(getPortHarbourType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portCode</column-name><column-value><![CDATA[");
		sb.append(getPortCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portRegionCode</column-name><column-value><![CDATA[");
		sb.append(getPortRegionCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>note</column-name><column-value><![CDATA[");
		sb.append(getNote());
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
	private String _portHarbourCode;
	private String _portHarbourName;
	private String _portHarbourNameVN;
	private int _portHarbourType;
	private String _portCode;
	private String _portRegionCode;
	private String _note;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private BaseModel<?> _dmHistoryPortHarbourRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.class;
}