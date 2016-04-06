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
import vn.dtt.duongbien.dao.vrcb.service.DmGTShipPositionLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class DmGTShipPositionClp extends BaseModelImpl<DmGTShipPosition>
	implements DmGTShipPosition {
	public DmGTShipPositionClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DmGTShipPosition.class;
	}

	@Override
	public String getModelClassName() {
		return DmGTShipPosition.class.getName();
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
		attributes.put("positionCode", getPositionCode());
		attributes.put("positionName", getPositionName());
		attributes.put("remarks", getRemarks());
		attributes.put("positionOrder", getPositionOrder());
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

		String positionCode = (String)attributes.get("positionCode");

		if (positionCode != null) {
			setPositionCode(positionCode);
		}

		String positionName = (String)attributes.get("positionName");

		if (positionName != null) {
			setPositionName(positionName);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		Integer positionOrder = (Integer)attributes.get("positionOrder");

		if (positionOrder != null) {
			setPositionOrder(positionOrder);
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

		if (_dmGTShipPositionRemoteModel != null) {
			try {
				Class<?> clazz = _dmGTShipPositionRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_dmGTShipPositionRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPositionCode() {
		return _positionCode;
	}

	@Override
	public void setPositionCode(String positionCode) {
		_positionCode = positionCode;

		if (_dmGTShipPositionRemoteModel != null) {
			try {
				Class<?> clazz = _dmGTShipPositionRemoteModel.getClass();

				Method method = clazz.getMethod("setPositionCode", String.class);

				method.invoke(_dmGTShipPositionRemoteModel, positionCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPositionName() {
		return _positionName;
	}

	@Override
	public void setPositionName(String positionName) {
		_positionName = positionName;

		if (_dmGTShipPositionRemoteModel != null) {
			try {
				Class<?> clazz = _dmGTShipPositionRemoteModel.getClass();

				Method method = clazz.getMethod("setPositionName", String.class);

				method.invoke(_dmGTShipPositionRemoteModel, positionName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRemarks() {
		return _remarks;
	}

	@Override
	public void setRemarks(String remarks) {
		_remarks = remarks;

		if (_dmGTShipPositionRemoteModel != null) {
			try {
				Class<?> clazz = _dmGTShipPositionRemoteModel.getClass();

				Method method = clazz.getMethod("setRemarks", String.class);

				method.invoke(_dmGTShipPositionRemoteModel, remarks);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPositionOrder() {
		return _positionOrder;
	}

	@Override
	public void setPositionOrder(int positionOrder) {
		_positionOrder = positionOrder;

		if (_dmGTShipPositionRemoteModel != null) {
			try {
				Class<?> clazz = _dmGTShipPositionRemoteModel.getClass();

				Method method = clazz.getMethod("setPositionOrder", int.class);

				method.invoke(_dmGTShipPositionRemoteModel, positionOrder);
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

		if (_dmGTShipPositionRemoteModel != null) {
			try {
				Class<?> clazz = _dmGTShipPositionRemoteModel.getClass();

				Method method = clazz.getMethod("setIsDelete", int.class);

				method.invoke(_dmGTShipPositionRemoteModel, isDelete);
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

		if (_dmGTShipPositionRemoteModel != null) {
			try {
				Class<?> clazz = _dmGTShipPositionRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkedAsDelete", int.class);

				method.invoke(_dmGTShipPositionRemoteModel, markedAsDelete);
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

		if (_dmGTShipPositionRemoteModel != null) {
			try {
				Class<?> clazz = _dmGTShipPositionRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_dmGTShipPositionRemoteModel, modifiedDate);
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

		if (_dmGTShipPositionRemoteModel != null) {
			try {
				Class<?> clazz = _dmGTShipPositionRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestedDate", Date.class);

				method.invoke(_dmGTShipPositionRemoteModel, requestedDate);
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

		if (_dmGTShipPositionRemoteModel != null) {
			try {
				Class<?> clazz = _dmGTShipPositionRemoteModel.getClass();

				Method method = clazz.getMethod("setSyncVersion", String.class);

				method.invoke(_dmGTShipPositionRemoteModel, syncVersion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDmGTShipPositionRemoteModel() {
		return _dmGTShipPositionRemoteModel;
	}

	public void setDmGTShipPositionRemoteModel(
		BaseModel<?> dmGTShipPositionRemoteModel) {
		_dmGTShipPositionRemoteModel = dmGTShipPositionRemoteModel;
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

		Class<?> remoteModelClass = _dmGTShipPositionRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dmGTShipPositionRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DmGTShipPositionLocalServiceUtil.addDmGTShipPosition(this);
		}
		else {
			DmGTShipPositionLocalServiceUtil.updateDmGTShipPosition(this);
		}
	}

	@Override
	public DmGTShipPosition toEscapedModel() {
		return (DmGTShipPosition)ProxyUtil.newProxyInstance(DmGTShipPosition.class.getClassLoader(),
			new Class[] { DmGTShipPosition.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmGTShipPositionClp clone = new DmGTShipPositionClp();

		clone.setId(getId());
		clone.setPositionCode(getPositionCode());
		clone.setPositionName(getPositionName());
		clone.setRemarks(getRemarks());
		clone.setPositionOrder(getPositionOrder());
		clone.setIsDelete(getIsDelete());
		clone.setMarkedAsDelete(getMarkedAsDelete());
		clone.setModifiedDate(getModifiedDate());
		clone.setRequestedDate(getRequestedDate());
		clone.setSyncVersion(getSyncVersion());

		return clone;
	}

	@Override
	public int compareTo(DmGTShipPosition dmGTShipPosition) {
		int value = 0;

		if (getId() < dmGTShipPosition.getId()) {
			value = -1;
		}
		else if (getId() > dmGTShipPosition.getId()) {
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

		if (!(obj instanceof DmGTShipPositionClp)) {
			return false;
		}

		DmGTShipPositionClp dmGTShipPosition = (DmGTShipPositionClp)obj;

		long primaryKey = dmGTShipPosition.getPrimaryKey();

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
		sb.append(", positionCode=");
		sb.append(getPositionCode());
		sb.append(", positionName=");
		sb.append(getPositionName());
		sb.append(", remarks=");
		sb.append(getRemarks());
		sb.append(", positionOrder=");
		sb.append(getPositionOrder());
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
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DmGTShipPosition");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>positionCode</column-name><column-value><![CDATA[");
		sb.append(getPositionCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>positionName</column-name><column-value><![CDATA[");
		sb.append(getPositionName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remarks</column-name><column-value><![CDATA[");
		sb.append(getRemarks());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>positionOrder</column-name><column-value><![CDATA[");
		sb.append(getPositionOrder());
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
	private String _positionCode;
	private String _positionName;
	private String _remarks;
	private int _positionOrder;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private BaseModel<?> _dmGTShipPositionRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.class;
}