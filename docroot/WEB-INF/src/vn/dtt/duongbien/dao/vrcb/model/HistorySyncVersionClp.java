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
import vn.dtt.duongbien.dao.vrcb.service.HistorySyncVersionLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class HistorySyncVersionClp extends BaseModelImpl<HistorySyncVersion>
	implements HistorySyncVersion {
	public HistorySyncVersionClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return HistorySyncVersion.class;
	}

	@Override
	public String getModelClassName() {
		return HistorySyncVersion.class.getName();
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
		attributes.put("requestedDate", getRequestedDate());
		attributes.put("timeofPublish", getTimeofPublish());
		attributes.put("categoryID", getCategoryID());
		attributes.put("syncUnit", getSyncUnit());
		attributes.put("syncUser", getSyncUser());
		attributes.put("syncVersion", getSyncVersion());
		attributes.put("latestValueDate", getLatestValueDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Date requestedDate = (Date)attributes.get("requestedDate");

		if (requestedDate != null) {
			setRequestedDate(requestedDate);
		}

		Date timeofPublish = (Date)attributes.get("timeofPublish");

		if (timeofPublish != null) {
			setTimeofPublish(timeofPublish);
		}

		String categoryID = (String)attributes.get("categoryID");

		if (categoryID != null) {
			setCategoryID(categoryID);
		}

		String syncUnit = (String)attributes.get("syncUnit");

		if (syncUnit != null) {
			setSyncUnit(syncUnit);
		}

		String syncUser = (String)attributes.get("syncUser");

		if (syncUser != null) {
			setSyncUser(syncUser);
		}

		String syncVersion = (String)attributes.get("syncVersion");

		if (syncVersion != null) {
			setSyncVersion(syncVersion);
		}

		Date latestValueDate = (Date)attributes.get("latestValueDate");

		if (latestValueDate != null) {
			setLatestValueDate(latestValueDate);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_historySyncVersionRemoteModel != null) {
			try {
				Class<?> clazz = _historySyncVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_historySyncVersionRemoteModel, id);
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

		if (_historySyncVersionRemoteModel != null) {
			try {
				Class<?> clazz = _historySyncVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestedDate", Date.class);

				method.invoke(_historySyncVersionRemoteModel, requestedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getTimeofPublish() {
		return _timeofPublish;
	}

	@Override
	public void setTimeofPublish(Date timeofPublish) {
		_timeofPublish = timeofPublish;

		if (_historySyncVersionRemoteModel != null) {
			try {
				Class<?> clazz = _historySyncVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setTimeofPublish", Date.class);

				method.invoke(_historySyncVersionRemoteModel, timeofPublish);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCategoryID() {
		return _categoryID;
	}

	@Override
	public void setCategoryID(String categoryID) {
		_categoryID = categoryID;

		if (_historySyncVersionRemoteModel != null) {
			try {
				Class<?> clazz = _historySyncVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setCategoryID", String.class);

				method.invoke(_historySyncVersionRemoteModel, categoryID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSyncUnit() {
		return _syncUnit;
	}

	@Override
	public void setSyncUnit(String syncUnit) {
		_syncUnit = syncUnit;

		if (_historySyncVersionRemoteModel != null) {
			try {
				Class<?> clazz = _historySyncVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setSyncUnit", String.class);

				method.invoke(_historySyncVersionRemoteModel, syncUnit);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSyncUser() {
		return _syncUser;
	}

	@Override
	public void setSyncUser(String syncUser) {
		_syncUser = syncUser;

		if (_historySyncVersionRemoteModel != null) {
			try {
				Class<?> clazz = _historySyncVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setSyncUser", String.class);

				method.invoke(_historySyncVersionRemoteModel, syncUser);
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

		if (_historySyncVersionRemoteModel != null) {
			try {
				Class<?> clazz = _historySyncVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setSyncVersion", String.class);

				method.invoke(_historySyncVersionRemoteModel, syncVersion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getLatestValueDate() {
		return _latestValueDate;
	}

	@Override
	public void setLatestValueDate(Date latestValueDate) {
		_latestValueDate = latestValueDate;

		if (_historySyncVersionRemoteModel != null) {
			try {
				Class<?> clazz = _historySyncVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setLatestValueDate", Date.class);

				method.invoke(_historySyncVersionRemoteModel, latestValueDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getHistorySyncVersionRemoteModel() {
		return _historySyncVersionRemoteModel;
	}

	public void setHistorySyncVersionRemoteModel(
		BaseModel<?> historySyncVersionRemoteModel) {
		_historySyncVersionRemoteModel = historySyncVersionRemoteModel;
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

		Class<?> remoteModelClass = _historySyncVersionRemoteModel.getClass();

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

		Object returnValue = method.invoke(_historySyncVersionRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			HistorySyncVersionLocalServiceUtil.addHistorySyncVersion(this);
		}
		else {
			HistorySyncVersionLocalServiceUtil.updateHistorySyncVersion(this);
		}
	}

	@Override
	public HistorySyncVersion toEscapedModel() {
		return (HistorySyncVersion)ProxyUtil.newProxyInstance(HistorySyncVersion.class.getClassLoader(),
			new Class[] { HistorySyncVersion.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		HistorySyncVersionClp clone = new HistorySyncVersionClp();

		clone.setId(getId());
		clone.setRequestedDate(getRequestedDate());
		clone.setTimeofPublish(getTimeofPublish());
		clone.setCategoryID(getCategoryID());
		clone.setSyncUnit(getSyncUnit());
		clone.setSyncUser(getSyncUser());
		clone.setSyncVersion(getSyncVersion());
		clone.setLatestValueDate(getLatestValueDate());

		return clone;
	}

	@Override
	public int compareTo(HistorySyncVersion historySyncVersion) {
		int value = 0;

		if (getId() < historySyncVersion.getId()) {
			value = -1;
		}
		else if (getId() > historySyncVersion.getId()) {
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

		if (!(obj instanceof HistorySyncVersionClp)) {
			return false;
		}

		HistorySyncVersionClp historySyncVersion = (HistorySyncVersionClp)obj;

		long primaryKey = historySyncVersion.getPrimaryKey();

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
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestedDate=");
		sb.append(getRequestedDate());
		sb.append(", timeofPublish=");
		sb.append(getTimeofPublish());
		sb.append(", categoryID=");
		sb.append(getCategoryID());
		sb.append(", syncUnit=");
		sb.append(getSyncUnit());
		sb.append(", syncUser=");
		sb.append(getSyncUser());
		sb.append(", syncVersion=");
		sb.append(getSyncVersion());
		sb.append(", latestValueDate=");
		sb.append(getLatestValueDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.HistorySyncVersion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestedDate</column-name><column-value><![CDATA[");
		sb.append(getRequestedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>timeofPublish</column-name><column-value><![CDATA[");
		sb.append(getTimeofPublish());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>categoryID</column-name><column-value><![CDATA[");
		sb.append(getCategoryID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>syncUnit</column-name><column-value><![CDATA[");
		sb.append(getSyncUnit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>syncUser</column-name><column-value><![CDATA[");
		sb.append(getSyncUser());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>syncVersion</column-name><column-value><![CDATA[");
		sb.append(getSyncVersion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>latestValueDate</column-name><column-value><![CDATA[");
		sb.append(getLatestValueDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private Date _requestedDate;
	private Date _timeofPublish;
	private String _categoryID;
	private String _syncUnit;
	private String _syncUser;
	private String _syncVersion;
	private Date _latestValueDate;
	private BaseModel<?> _historySyncVersionRemoteModel;
}