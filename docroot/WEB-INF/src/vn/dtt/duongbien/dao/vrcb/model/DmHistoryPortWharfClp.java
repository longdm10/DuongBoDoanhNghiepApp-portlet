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
import vn.dtt.duongbien.dao.vrcb.service.DmHistoryPortWharfLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class DmHistoryPortWharfClp extends BaseModelImpl<DmHistoryPortWharf>
	implements DmHistoryPortWharf {
	public DmHistoryPortWharfClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DmHistoryPortWharf.class;
	}

	@Override
	public String getModelClassName() {
		return DmHistoryPortWharf.class.getName();
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
		attributes.put("portWharfCode", getPortWharfCode());
		attributes.put("portWharfName", getPortWharfName());
		attributes.put("portWharfNameVN", getPortWharfNameVN());
		attributes.put("portWharfType", getPortWharfType());
		attributes.put("portHarbourCode", getPortHarbourCode());
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

		String portWharfCode = (String)attributes.get("portWharfCode");

		if (portWharfCode != null) {
			setPortWharfCode(portWharfCode);
		}

		String portWharfName = (String)attributes.get("portWharfName");

		if (portWharfName != null) {
			setPortWharfName(portWharfName);
		}

		String portWharfNameVN = (String)attributes.get("portWharfNameVN");

		if (portWharfNameVN != null) {
			setPortWharfNameVN(portWharfNameVN);
		}

		Integer portWharfType = (Integer)attributes.get("portWharfType");

		if (portWharfType != null) {
			setPortWharfType(portWharfType);
		}

		String portHarbourCode = (String)attributes.get("portHarbourCode");

		if (portHarbourCode != null) {
			setPortHarbourCode(portHarbourCode);
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

		if (_dmHistoryPortWharfRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortWharfRemoteModel.getClass();

				Method method = clazz.getMethod("setId", int.class);

				method.invoke(_dmHistoryPortWharfRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPortWharfCode() {
		return _portWharfCode;
	}

	@Override
	public void setPortWharfCode(String portWharfCode) {
		_portWharfCode = portWharfCode;

		if (_dmHistoryPortWharfRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortWharfRemoteModel.getClass();

				Method method = clazz.getMethod("setPortWharfCode", String.class);

				method.invoke(_dmHistoryPortWharfRemoteModel, portWharfCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPortWharfName() {
		return _portWharfName;
	}

	@Override
	public void setPortWharfName(String portWharfName) {
		_portWharfName = portWharfName;

		if (_dmHistoryPortWharfRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortWharfRemoteModel.getClass();

				Method method = clazz.getMethod("setPortWharfName", String.class);

				method.invoke(_dmHistoryPortWharfRemoteModel, portWharfName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPortWharfNameVN() {
		return _portWharfNameVN;
	}

	@Override
	public void setPortWharfNameVN(String portWharfNameVN) {
		_portWharfNameVN = portWharfNameVN;

		if (_dmHistoryPortWharfRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortWharfRemoteModel.getClass();

				Method method = clazz.getMethod("setPortWharfNameVN",
						String.class);

				method.invoke(_dmHistoryPortWharfRemoteModel, portWharfNameVN);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPortWharfType() {
		return _portWharfType;
	}

	@Override
	public void setPortWharfType(int portWharfType) {
		_portWharfType = portWharfType;

		if (_dmHistoryPortWharfRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortWharfRemoteModel.getClass();

				Method method = clazz.getMethod("setPortWharfType", int.class);

				method.invoke(_dmHistoryPortWharfRemoteModel, portWharfType);
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

		if (_dmHistoryPortWharfRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortWharfRemoteModel.getClass();

				Method method = clazz.getMethod("setPortHarbourCode",
						String.class);

				method.invoke(_dmHistoryPortWharfRemoteModel, portHarbourCode);
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

		if (_dmHistoryPortWharfRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortWharfRemoteModel.getClass();

				Method method = clazz.getMethod("setPortCode", String.class);

				method.invoke(_dmHistoryPortWharfRemoteModel, portCode);
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

		if (_dmHistoryPortWharfRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortWharfRemoteModel.getClass();

				Method method = clazz.getMethod("setPortRegionCode",
						String.class);

				method.invoke(_dmHistoryPortWharfRemoteModel, portRegionCode);
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

		if (_dmHistoryPortWharfRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortWharfRemoteModel.getClass();

				Method method = clazz.getMethod("setNote", String.class);

				method.invoke(_dmHistoryPortWharfRemoteModel, note);
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

		if (_dmHistoryPortWharfRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortWharfRemoteModel.getClass();

				Method method = clazz.getMethod("setIsDelete", int.class);

				method.invoke(_dmHistoryPortWharfRemoteModel, isDelete);
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

		if (_dmHistoryPortWharfRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortWharfRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkedAsDelete", int.class);

				method.invoke(_dmHistoryPortWharfRemoteModel, markedAsDelete);
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

		if (_dmHistoryPortWharfRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortWharfRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_dmHistoryPortWharfRemoteModel, modifiedDate);
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

		if (_dmHistoryPortWharfRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortWharfRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestedDate", Date.class);

				method.invoke(_dmHistoryPortWharfRemoteModel, requestedDate);
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

		if (_dmHistoryPortWharfRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortWharfRemoteModel.getClass();

				Method method = clazz.getMethod("setSyncVersion", String.class);

				method.invoke(_dmHistoryPortWharfRemoteModel, syncVersion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDmHistoryPortWharfRemoteModel() {
		return _dmHistoryPortWharfRemoteModel;
	}

	public void setDmHistoryPortWharfRemoteModel(
		BaseModel<?> dmHistoryPortWharfRemoteModel) {
		_dmHistoryPortWharfRemoteModel = dmHistoryPortWharfRemoteModel;
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

		Class<?> remoteModelClass = _dmHistoryPortWharfRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dmHistoryPortWharfRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DmHistoryPortWharfLocalServiceUtil.addDmHistoryPortWharf(this);
		}
		else {
			DmHistoryPortWharfLocalServiceUtil.updateDmHistoryPortWharf(this);
		}
	}

	@Override
	public DmHistoryPortWharf toEscapedModel() {
		return (DmHistoryPortWharf)ProxyUtil.newProxyInstance(DmHistoryPortWharf.class.getClassLoader(),
			new Class[] { DmHistoryPortWharf.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmHistoryPortWharfClp clone = new DmHistoryPortWharfClp();

		clone.setId(getId());
		clone.setPortWharfCode(getPortWharfCode());
		clone.setPortWharfName(getPortWharfName());
		clone.setPortWharfNameVN(getPortWharfNameVN());
		clone.setPortWharfType(getPortWharfType());
		clone.setPortHarbourCode(getPortHarbourCode());
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
	public int compareTo(DmHistoryPortWharf dmHistoryPortWharf) {
		int value = 0;

		if (getId() < dmHistoryPortWharf.getId()) {
			value = -1;
		}
		else if (getId() > dmHistoryPortWharf.getId()) {
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

		if (!(obj instanceof DmHistoryPortWharfClp)) {
			return false;
		}

		DmHistoryPortWharfClp dmHistoryPortWharf = (DmHistoryPortWharfClp)obj;

		int primaryKey = dmHistoryPortWharf.getPrimaryKey();

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
		StringBundler sb = new StringBundler(29);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", portWharfCode=");
		sb.append(getPortWharfCode());
		sb.append(", portWharfName=");
		sb.append(getPortWharfName());
		sb.append(", portWharfNameVN=");
		sb.append(getPortWharfNameVN());
		sb.append(", portWharfType=");
		sb.append(getPortWharfType());
		sb.append(", portHarbourCode=");
		sb.append(getPortHarbourCode());
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
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortWharf");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portWharfCode</column-name><column-value><![CDATA[");
		sb.append(getPortWharfCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portWharfName</column-name><column-value><![CDATA[");
		sb.append(getPortWharfName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portWharfNameVN</column-name><column-value><![CDATA[");
		sb.append(getPortWharfNameVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portWharfType</column-name><column-value><![CDATA[");
		sb.append(getPortWharfType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portHarbourCode</column-name><column-value><![CDATA[");
		sb.append(getPortHarbourCode());
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
	private String _portWharfCode;
	private String _portWharfName;
	private String _portWharfNameVN;
	private int _portWharfType;
	private String _portHarbourCode;
	private String _portCode;
	private String _portRegionCode;
	private String _note;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private BaseModel<?> _dmHistoryPortWharfRemoteModel;
}