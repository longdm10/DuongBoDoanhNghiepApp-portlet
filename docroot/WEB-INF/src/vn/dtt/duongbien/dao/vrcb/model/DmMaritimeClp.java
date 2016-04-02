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
import vn.dtt.duongbien.dao.vrcb.service.DmMaritimeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class DmMaritimeClp extends BaseModelImpl<DmMaritime>
	implements DmMaritime {
	public DmMaritimeClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DmMaritime.class;
	}

	@Override
	public String getModelClassName() {
		return DmMaritime.class.getName();
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
		attributes.put("maritimeCode", getMaritimeCode());
		attributes.put("maritimeReference", getMaritimeReference());
		attributes.put("maritimeOrder", getMaritimeOrder());
		attributes.put("maritimeName", getMaritimeName());
		attributes.put("maritimeNameVN", getMaritimeNameVN());
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

		String maritimeCode = (String)attributes.get("maritimeCode");

		if (maritimeCode != null) {
			setMaritimeCode(maritimeCode);
		}

		String maritimeReference = (String)attributes.get("maritimeReference");

		if (maritimeReference != null) {
			setMaritimeReference(maritimeReference);
		}

		Integer maritimeOrder = (Integer)attributes.get("maritimeOrder");

		if (maritimeOrder != null) {
			setMaritimeOrder(maritimeOrder);
		}

		String maritimeName = (String)attributes.get("maritimeName");

		if (maritimeName != null) {
			setMaritimeName(maritimeName);
		}

		String maritimeNameVN = (String)attributes.get("maritimeNameVN");

		if (maritimeNameVN != null) {
			setMaritimeNameVN(maritimeNameVN);
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

		if (_dmMaritimeRemoteModel != null) {
			try {
				Class<?> clazz = _dmMaritimeRemoteModel.getClass();

				Method method = clazz.getMethod("setId", int.class);

				method.invoke(_dmMaritimeRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaritimeCode() {
		return _maritimeCode;
	}

	@Override
	public void setMaritimeCode(String maritimeCode) {
		_maritimeCode = maritimeCode;

		if (_dmMaritimeRemoteModel != null) {
			try {
				Class<?> clazz = _dmMaritimeRemoteModel.getClass();

				Method method = clazz.getMethod("setMaritimeCode", String.class);

				method.invoke(_dmMaritimeRemoteModel, maritimeCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaritimeReference() {
		return _maritimeReference;
	}

	@Override
	public void setMaritimeReference(String maritimeReference) {
		_maritimeReference = maritimeReference;

		if (_dmMaritimeRemoteModel != null) {
			try {
				Class<?> clazz = _dmMaritimeRemoteModel.getClass();

				Method method = clazz.getMethod("setMaritimeReference",
						String.class);

				method.invoke(_dmMaritimeRemoteModel, maritimeReference);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMaritimeOrder() {
		return _maritimeOrder;
	}

	@Override
	public void setMaritimeOrder(int maritimeOrder) {
		_maritimeOrder = maritimeOrder;

		if (_dmMaritimeRemoteModel != null) {
			try {
				Class<?> clazz = _dmMaritimeRemoteModel.getClass();

				Method method = clazz.getMethod("setMaritimeOrder", int.class);

				method.invoke(_dmMaritimeRemoteModel, maritimeOrder);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaritimeName() {
		return _maritimeName;
	}

	@Override
	public void setMaritimeName(String maritimeName) {
		_maritimeName = maritimeName;

		if (_dmMaritimeRemoteModel != null) {
			try {
				Class<?> clazz = _dmMaritimeRemoteModel.getClass();

				Method method = clazz.getMethod("setMaritimeName", String.class);

				method.invoke(_dmMaritimeRemoteModel, maritimeName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaritimeNameVN() {
		return _maritimeNameVN;
	}

	@Override
	public void setMaritimeNameVN(String maritimeNameVN) {
		_maritimeNameVN = maritimeNameVN;

		if (_dmMaritimeRemoteModel != null) {
			try {
				Class<?> clazz = _dmMaritimeRemoteModel.getClass();

				Method method = clazz.getMethod("setMaritimeNameVN",
						String.class);

				method.invoke(_dmMaritimeRemoteModel, maritimeNameVN);
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

		if (_dmMaritimeRemoteModel != null) {
			try {
				Class<?> clazz = _dmMaritimeRemoteModel.getClass();

				Method method = clazz.getMethod("setAddress", String.class);

				method.invoke(_dmMaritimeRemoteModel, address);
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

		if (_dmMaritimeRemoteModel != null) {
			try {
				Class<?> clazz = _dmMaritimeRemoteModel.getClass();

				Method method = clazz.getMethod("setAddressVN", String.class);

				method.invoke(_dmMaritimeRemoteModel, addressVN);
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

		if (_dmMaritimeRemoteModel != null) {
			try {
				Class<?> clazz = _dmMaritimeRemoteModel.getClass();

				Method method = clazz.getMethod("setStateCode", String.class);

				method.invoke(_dmMaritimeRemoteModel, stateCode);
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

		if (_dmMaritimeRemoteModel != null) {
			try {
				Class<?> clazz = _dmMaritimeRemoteModel.getClass();

				Method method = clazz.getMethod("setCitycode", String.class);

				method.invoke(_dmMaritimeRemoteModel, citycode);
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

		if (_dmMaritimeRemoteModel != null) {
			try {
				Class<?> clazz = _dmMaritimeRemoteModel.getClass();

				Method method = clazz.getMethod("setIsDelete", int.class);

				method.invoke(_dmMaritimeRemoteModel, isDelete);
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

		if (_dmMaritimeRemoteModel != null) {
			try {
				Class<?> clazz = _dmMaritimeRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkedAsDelete", int.class);

				method.invoke(_dmMaritimeRemoteModel, markedAsDelete);
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

		if (_dmMaritimeRemoteModel != null) {
			try {
				Class<?> clazz = _dmMaritimeRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_dmMaritimeRemoteModel, modifiedDate);
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

		if (_dmMaritimeRemoteModel != null) {
			try {
				Class<?> clazz = _dmMaritimeRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestedDate", Date.class);

				method.invoke(_dmMaritimeRemoteModel, requestedDate);
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

		if (_dmMaritimeRemoteModel != null) {
			try {
				Class<?> clazz = _dmMaritimeRemoteModel.getClass();

				Method method = clazz.getMethod("setSyncVersion", String.class);

				method.invoke(_dmMaritimeRemoteModel, syncVersion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDmMaritimeRemoteModel() {
		return _dmMaritimeRemoteModel;
	}

	public void setDmMaritimeRemoteModel(BaseModel<?> dmMaritimeRemoteModel) {
		_dmMaritimeRemoteModel = dmMaritimeRemoteModel;
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

		Class<?> remoteModelClass = _dmMaritimeRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dmMaritimeRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DmMaritimeLocalServiceUtil.addDmMaritime(this);
		}
		else {
			DmMaritimeLocalServiceUtil.updateDmMaritime(this);
		}
	}

	@Override
	public DmMaritime toEscapedModel() {
		return (DmMaritime)ProxyUtil.newProxyInstance(DmMaritime.class.getClassLoader(),
			new Class[] { DmMaritime.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmMaritimeClp clone = new DmMaritimeClp();

		clone.setId(getId());
		clone.setMaritimeCode(getMaritimeCode());
		clone.setMaritimeReference(getMaritimeReference());
		clone.setMaritimeOrder(getMaritimeOrder());
		clone.setMaritimeName(getMaritimeName());
		clone.setMaritimeNameVN(getMaritimeNameVN());
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
	public int compareTo(DmMaritime dmMaritime) {
		int value = 0;

		if (getId() < dmMaritime.getId()) {
			value = -1;
		}
		else if (getId() > dmMaritime.getId()) {
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

		if (!(obj instanceof DmMaritimeClp)) {
			return false;
		}

		DmMaritimeClp dmMaritime = (DmMaritimeClp)obj;

		int primaryKey = dmMaritime.getPrimaryKey();

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
		StringBundler sb = new StringBundler(31);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", maritimeCode=");
		sb.append(getMaritimeCode());
		sb.append(", maritimeReference=");
		sb.append(getMaritimeReference());
		sb.append(", maritimeOrder=");
		sb.append(getMaritimeOrder());
		sb.append(", maritimeName=");
		sb.append(getMaritimeName());
		sb.append(", maritimeNameVN=");
		sb.append(getMaritimeNameVN());
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
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DmMaritime");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maritimeCode</column-name><column-value><![CDATA[");
		sb.append(getMaritimeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maritimeReference</column-name><column-value><![CDATA[");
		sb.append(getMaritimeReference());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maritimeOrder</column-name><column-value><![CDATA[");
		sb.append(getMaritimeOrder());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maritimeName</column-name><column-value><![CDATA[");
		sb.append(getMaritimeName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maritimeNameVN</column-name><column-value><![CDATA[");
		sb.append(getMaritimeNameVN());
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
	private String _maritimeCode;
	private String _maritimeReference;
	private int _maritimeOrder;
	private String _maritimeName;
	private String _maritimeNameVN;
	private String _address;
	private String _addressVN;
	private String _stateCode;
	private String _citycode;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private BaseModel<?> _dmMaritimeRemoteModel;
}