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
import vn.dtt.duongbien.dao.vrcb.service.DmHistoryPortLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class DmHistoryPortClp extends BaseModelImpl<DmHistoryPort>
	implements DmHistoryPort {
	public DmHistoryPortClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DmHistoryPort.class;
	}

	@Override
	public String getModelClassName() {
		return DmHistoryPort.class.getName();
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
		attributes.put("portCode", getPortCode());
		attributes.put("loCode", getLoCode());
		attributes.put("portName", getPortName());
		attributes.put("fullName", getFullName());
		attributes.put("fullNameVN", getFullNameVN());
		attributes.put("portType", getPortType());
		attributes.put("portOrder", getPortOrder());
		attributes.put("address", getAddress());
		attributes.put("addressVN", getAddressVN());
		attributes.put("stateCode", getStateCode());
		attributes.put("citycode", getCitycode());
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

		String portCode = (String)attributes.get("portCode");

		if (portCode != null) {
			setPortCode(portCode);
		}

		String loCode = (String)attributes.get("loCode");

		if (loCode != null) {
			setLoCode(loCode);
		}

		String portName = (String)attributes.get("portName");

		if (portName != null) {
			setPortName(portName);
		}

		String fullName = (String)attributes.get("fullName");

		if (fullName != null) {
			setFullName(fullName);
		}

		String fullNameVN = (String)attributes.get("fullNameVN");

		if (fullNameVN != null) {
			setFullNameVN(fullNameVN);
		}

		String portType = (String)attributes.get("portType");

		if (portType != null) {
			setPortType(portType);
		}

		Integer portOrder = (Integer)attributes.get("portOrder");

		if (portOrder != null) {
			setPortOrder(portOrder);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String addressVN = (String)attributes.get("addressVN");

		if (addressVN != null) {
			setAddressVN(addressVN);
		}

		String stateCode = (String)attributes.get("stateCode");

		if (stateCode != null) {
			setStateCode(stateCode);
		}

		String citycode = (String)attributes.get("citycode");

		if (citycode != null) {
			setCitycode(citycode);
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

		if (_dmHistoryPortRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortRemoteModel.getClass();

				Method method = clazz.getMethod("setId", int.class);

				method.invoke(_dmHistoryPortRemoteModel, id);
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

		if (_dmHistoryPortRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortRemoteModel.getClass();

				Method method = clazz.getMethod("setPortCode", String.class);

				method.invoke(_dmHistoryPortRemoteModel, portCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLoCode() {
		return _loCode;
	}

	@Override
	public void setLoCode(String loCode) {
		_loCode = loCode;

		if (_dmHistoryPortRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortRemoteModel.getClass();

				Method method = clazz.getMethod("setLoCode", String.class);

				method.invoke(_dmHistoryPortRemoteModel, loCode);
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

		if (_dmHistoryPortRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortRemoteModel.getClass();

				Method method = clazz.getMethod("setPortName", String.class);

				method.invoke(_dmHistoryPortRemoteModel, portName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFullName() {
		return _fullName;
	}

	@Override
	public void setFullName(String fullName) {
		_fullName = fullName;

		if (_dmHistoryPortRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortRemoteModel.getClass();

				Method method = clazz.getMethod("setFullName", String.class);

				method.invoke(_dmHistoryPortRemoteModel, fullName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFullNameVN() {
		return _fullNameVN;
	}

	@Override
	public void setFullNameVN(String fullNameVN) {
		_fullNameVN = fullNameVN;

		if (_dmHistoryPortRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortRemoteModel.getClass();

				Method method = clazz.getMethod("setFullNameVN", String.class);

				method.invoke(_dmHistoryPortRemoteModel, fullNameVN);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPortType() {
		return _portType;
	}

	@Override
	public void setPortType(String portType) {
		_portType = portType;

		if (_dmHistoryPortRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortRemoteModel.getClass();

				Method method = clazz.getMethod("setPortType", String.class);

				method.invoke(_dmHistoryPortRemoteModel, portType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPortOrder() {
		return _portOrder;
	}

	@Override
	public void setPortOrder(int portOrder) {
		_portOrder = portOrder;

		if (_dmHistoryPortRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortRemoteModel.getClass();

				Method method = clazz.getMethod("setPortOrder", int.class);

				method.invoke(_dmHistoryPortRemoteModel, portOrder);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAddress() {
		return _address;
	}

	@Override
	public void setAddress(String address) {
		_address = address;

		if (_dmHistoryPortRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortRemoteModel.getClass();

				Method method = clazz.getMethod("setAddress", String.class);

				method.invoke(_dmHistoryPortRemoteModel, address);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAddressVN() {
		return _addressVN;
	}

	@Override
	public void setAddressVN(String addressVN) {
		_addressVN = addressVN;

		if (_dmHistoryPortRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortRemoteModel.getClass();

				Method method = clazz.getMethod("setAddressVN", String.class);

				method.invoke(_dmHistoryPortRemoteModel, addressVN);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStateCode() {
		return _stateCode;
	}

	@Override
	public void setStateCode(String stateCode) {
		_stateCode = stateCode;

		if (_dmHistoryPortRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortRemoteModel.getClass();

				Method method = clazz.getMethod("setStateCode", String.class);

				method.invoke(_dmHistoryPortRemoteModel, stateCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCitycode() {
		return _citycode;
	}

	@Override
	public void setCitycode(String citycode) {
		_citycode = citycode;

		if (_dmHistoryPortRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortRemoteModel.getClass();

				Method method = clazz.getMethod("setCitycode", String.class);

				method.invoke(_dmHistoryPortRemoteModel, citycode);
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

		if (_dmHistoryPortRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortRemoteModel.getClass();

				Method method = clazz.getMethod("setIsDelete", int.class);

				method.invoke(_dmHistoryPortRemoteModel, isDelete);
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

		if (_dmHistoryPortRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkedAsDelete", int.class);

				method.invoke(_dmHistoryPortRemoteModel, markedAsDelete);
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

		if (_dmHistoryPortRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_dmHistoryPortRemoteModel, modifiedDate);
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

		if (_dmHistoryPortRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestedDate", Date.class);

				method.invoke(_dmHistoryPortRemoteModel, requestedDate);
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

		if (_dmHistoryPortRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPortRemoteModel.getClass();

				Method method = clazz.getMethod("setSyncVersion", String.class);

				method.invoke(_dmHistoryPortRemoteModel, syncVersion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDmHistoryPortRemoteModel() {
		return _dmHistoryPortRemoteModel;
	}

	public void setDmHistoryPortRemoteModel(
		BaseModel<?> dmHistoryPortRemoteModel) {
		_dmHistoryPortRemoteModel = dmHistoryPortRemoteModel;
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

		Class<?> remoteModelClass = _dmHistoryPortRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dmHistoryPortRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DmHistoryPortLocalServiceUtil.addDmHistoryPort(this);
		}
		else {
			DmHistoryPortLocalServiceUtil.updateDmHistoryPort(this);
		}
	}

	@Override
	public DmHistoryPort toEscapedModel() {
		return (DmHistoryPort)ProxyUtil.newProxyInstance(DmHistoryPort.class.getClassLoader(),
			new Class[] { DmHistoryPort.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmHistoryPortClp clone = new DmHistoryPortClp();

		clone.setId(getId());
		clone.setPortCode(getPortCode());
		clone.setLoCode(getLoCode());
		clone.setPortName(getPortName());
		clone.setFullName(getFullName());
		clone.setFullNameVN(getFullNameVN());
		clone.setPortType(getPortType());
		clone.setPortOrder(getPortOrder());
		clone.setAddress(getAddress());
		clone.setAddressVN(getAddressVN());
		clone.setStateCode(getStateCode());
		clone.setCitycode(getCitycode());
		clone.setIsDelete(getIsDelete());
		clone.setMarkedAsDelete(getMarkedAsDelete());
		clone.setModifiedDate(getModifiedDate());
		clone.setRequestedDate(getRequestedDate());
		clone.setSyncVersion(getSyncVersion());

		return clone;
	}

	@Override
	public int compareTo(DmHistoryPort dmHistoryPort) {
		int value = 0;

		if (getId() < dmHistoryPort.getId()) {
			value = -1;
		}
		else if (getId() > dmHistoryPort.getId()) {
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

		if (!(obj instanceof DmHistoryPortClp)) {
			return false;
		}

		DmHistoryPortClp dmHistoryPort = (DmHistoryPortClp)obj;

		int primaryKey = dmHistoryPort.getPrimaryKey();

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
		StringBundler sb = new StringBundler(35);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", portCode=");
		sb.append(getPortCode());
		sb.append(", loCode=");
		sb.append(getLoCode());
		sb.append(", portName=");
		sb.append(getPortName());
		sb.append(", fullName=");
		sb.append(getFullName());
		sb.append(", fullNameVN=");
		sb.append(getFullNameVN());
		sb.append(", portType=");
		sb.append(getPortType());
		sb.append(", portOrder=");
		sb.append(getPortOrder());
		sb.append(", address=");
		sb.append(getAddress());
		sb.append(", addressVN=");
		sb.append(getAddressVN());
		sb.append(", stateCode=");
		sb.append(getStateCode());
		sb.append(", citycode=");
		sb.append(getCitycode());
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
		StringBundler sb = new StringBundler(55);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DmHistoryPort");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portCode</column-name><column-value><![CDATA[");
		sb.append(getPortCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loCode</column-name><column-value><![CDATA[");
		sb.append(getLoCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portName</column-name><column-value><![CDATA[");
		sb.append(getPortName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fullName</column-name><column-value><![CDATA[");
		sb.append(getFullName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fullNameVN</column-name><column-value><![CDATA[");
		sb.append(getFullNameVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portType</column-name><column-value><![CDATA[");
		sb.append(getPortType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portOrder</column-name><column-value><![CDATA[");
		sb.append(getPortOrder());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address</column-name><column-value><![CDATA[");
		sb.append(getAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>addressVN</column-name><column-value><![CDATA[");
		sb.append(getAddressVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stateCode</column-name><column-value><![CDATA[");
		sb.append(getStateCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>citycode</column-name><column-value><![CDATA[");
		sb.append(getCitycode());
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
	private String _portCode;
	private String _loCode;
	private String _portName;
	private String _fullName;
	private String _fullNameVN;
	private String _portType;
	private int _portOrder;
	private String _address;
	private String _addressVN;
	private String _stateCode;
	private String _citycode;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private BaseModel<?> _dmHistoryPortRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.class;
}