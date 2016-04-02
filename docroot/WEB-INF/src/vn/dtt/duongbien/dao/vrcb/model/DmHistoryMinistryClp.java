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
import vn.dtt.duongbien.dao.vrcb.service.DmHistoryMinistryLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class DmHistoryMinistryClp extends BaseModelImpl<DmHistoryMinistry>
	implements DmHistoryMinistry {
	public DmHistoryMinistryClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DmHistoryMinistry.class;
	}

	@Override
	public String getModelClassName() {
		return DmHistoryMinistry.class.getName();
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
		attributes.put("ministryCode", getMinistryCode());
		attributes.put("ministryName", getMinistryName());
		attributes.put("ministryNameVN", getMinistryNameVN());
		attributes.put("ministryOrder", getMinistryOrder());
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

		String ministryCode = (String)attributes.get("ministryCode");

		if (ministryCode != null) {
			setMinistryCode(ministryCode);
		}

		String ministryName = (String)attributes.get("ministryName");

		if (ministryName != null) {
			setMinistryName(ministryName);
		}

		String ministryNameVN = (String)attributes.get("ministryNameVN");

		if (ministryNameVN != null) {
			setMinistryNameVN(ministryNameVN);
		}

		Integer ministryOrder = (Integer)attributes.get("ministryOrder");

		if (ministryOrder != null) {
			setMinistryOrder(ministryOrder);
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

		if (_dmHistoryMinistryRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryMinistryRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_dmHistoryMinistryRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMinistryCode() {
		return _ministryCode;
	}

	@Override
	public void setMinistryCode(String ministryCode) {
		_ministryCode = ministryCode;

		if (_dmHistoryMinistryRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryMinistryRemoteModel.getClass();

				Method method = clazz.getMethod("setMinistryCode", String.class);

				method.invoke(_dmHistoryMinistryRemoteModel, ministryCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMinistryName() {
		return _ministryName;
	}

	@Override
	public void setMinistryName(String ministryName) {
		_ministryName = ministryName;

		if (_dmHistoryMinistryRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryMinistryRemoteModel.getClass();

				Method method = clazz.getMethod("setMinistryName", String.class);

				method.invoke(_dmHistoryMinistryRemoteModel, ministryName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMinistryNameVN() {
		return _ministryNameVN;
	}

	@Override
	public void setMinistryNameVN(String ministryNameVN) {
		_ministryNameVN = ministryNameVN;

		if (_dmHistoryMinistryRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryMinistryRemoteModel.getClass();

				Method method = clazz.getMethod("setMinistryNameVN",
						String.class);

				method.invoke(_dmHistoryMinistryRemoteModel, ministryNameVN);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMinistryOrder() {
		return _ministryOrder;
	}

	@Override
	public void setMinistryOrder(int ministryOrder) {
		_ministryOrder = ministryOrder;

		if (_dmHistoryMinistryRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryMinistryRemoteModel.getClass();

				Method method = clazz.getMethod("setMinistryOrder", int.class);

				method.invoke(_dmHistoryMinistryRemoteModel, ministryOrder);
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

		if (_dmHistoryMinistryRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryMinistryRemoteModel.getClass();

				Method method = clazz.getMethod("setIsDelete", int.class);

				method.invoke(_dmHistoryMinistryRemoteModel, isDelete);
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

		if (_dmHistoryMinistryRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryMinistryRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkedAsDelete", int.class);

				method.invoke(_dmHistoryMinistryRemoteModel, markedAsDelete);
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

		if (_dmHistoryMinistryRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryMinistryRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_dmHistoryMinistryRemoteModel, modifiedDate);
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

		if (_dmHistoryMinistryRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryMinistryRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestedDate", Date.class);

				method.invoke(_dmHistoryMinistryRemoteModel, requestedDate);
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

		if (_dmHistoryMinistryRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryMinistryRemoteModel.getClass();

				Method method = clazz.getMethod("setSyncVersion", String.class);

				method.invoke(_dmHistoryMinistryRemoteModel, syncVersion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDmHistoryMinistryRemoteModel() {
		return _dmHistoryMinistryRemoteModel;
	}

	public void setDmHistoryMinistryRemoteModel(
		BaseModel<?> dmHistoryMinistryRemoteModel) {
		_dmHistoryMinistryRemoteModel = dmHistoryMinistryRemoteModel;
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

		Class<?> remoteModelClass = _dmHistoryMinistryRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dmHistoryMinistryRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DmHistoryMinistryLocalServiceUtil.addDmHistoryMinistry(this);
		}
		else {
			DmHistoryMinistryLocalServiceUtil.updateDmHistoryMinistry(this);
		}
	}

	@Override
	public DmHistoryMinistry toEscapedModel() {
		return (DmHistoryMinistry)ProxyUtil.newProxyInstance(DmHistoryMinistry.class.getClassLoader(),
			new Class[] { DmHistoryMinistry.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmHistoryMinistryClp clone = new DmHistoryMinistryClp();

		clone.setId(getId());
		clone.setMinistryCode(getMinistryCode());
		clone.setMinistryName(getMinistryName());
		clone.setMinistryNameVN(getMinistryNameVN());
		clone.setMinistryOrder(getMinistryOrder());
		clone.setIsDelete(getIsDelete());
		clone.setMarkedAsDelete(getMarkedAsDelete());
		clone.setModifiedDate(getModifiedDate());
		clone.setRequestedDate(getRequestedDate());
		clone.setSyncVersion(getSyncVersion());

		return clone;
	}

	@Override
	public int compareTo(DmHistoryMinistry dmHistoryMinistry) {
		int value = 0;

		if (getId() < dmHistoryMinistry.getId()) {
			value = -1;
		}
		else if (getId() > dmHistoryMinistry.getId()) {
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

		if (!(obj instanceof DmHistoryMinistryClp)) {
			return false;
		}

		DmHistoryMinistryClp dmHistoryMinistry = (DmHistoryMinistryClp)obj;

		long primaryKey = dmHistoryMinistry.getPrimaryKey();

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
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", ministryCode=");
		sb.append(getMinistryCode());
		sb.append(", ministryName=");
		sb.append(getMinistryName());
		sb.append(", ministryNameVN=");
		sb.append(getMinistryNameVN());
		sb.append(", ministryOrder=");
		sb.append(getMinistryOrder());
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
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DmHistoryMinistry");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ministryCode</column-name><column-value><![CDATA[");
		sb.append(getMinistryCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ministryName</column-name><column-value><![CDATA[");
		sb.append(getMinistryName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ministryNameVN</column-name><column-value><![CDATA[");
		sb.append(getMinistryNameVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ministryOrder</column-name><column-value><![CDATA[");
		sb.append(getMinistryOrder());
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
	private String _ministryCode;
	private String _ministryName;
	private String _ministryNameVN;
	private int _ministryOrder;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private BaseModel<?> _dmHistoryMinistryRemoteModel;
}