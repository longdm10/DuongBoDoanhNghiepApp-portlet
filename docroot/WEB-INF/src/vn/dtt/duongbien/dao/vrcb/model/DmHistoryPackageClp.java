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
import vn.dtt.duongbien.dao.vrcb.service.DmHistoryPackageLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class DmHistoryPackageClp extends BaseModelImpl<DmHistoryPackage>
	implements DmHistoryPackage {
	public DmHistoryPackageClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DmHistoryPackage.class;
	}

	@Override
	public String getModelClassName() {
		return DmHistoryPackage.class.getName();
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
		attributes.put("packageCode", getPackageCode());
		attributes.put("packageName", getPackageName());
		attributes.put("packageNameVN", getPackageNameVN());
		attributes.put("packageOrder", getPackageOrder());
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

		String packageCode = (String)attributes.get("packageCode");

		if (packageCode != null) {
			setPackageCode(packageCode);
		}

		String packageName = (String)attributes.get("packageName");

		if (packageName != null) {
			setPackageName(packageName);
		}

		String packageNameVN = (String)attributes.get("packageNameVN");

		if (packageNameVN != null) {
			setPackageNameVN(packageNameVN);
		}

		Integer packageOrder = (Integer)attributes.get("packageOrder");

		if (packageOrder != null) {
			setPackageOrder(packageOrder);
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

		if (_dmHistoryPackageRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPackageRemoteModel.getClass();

				Method method = clazz.getMethod("setId", int.class);

				method.invoke(_dmHistoryPackageRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPackageCode() {
		return _packageCode;
	}

	@Override
	public void setPackageCode(String packageCode) {
		_packageCode = packageCode;

		if (_dmHistoryPackageRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPackageRemoteModel.getClass();

				Method method = clazz.getMethod("setPackageCode", String.class);

				method.invoke(_dmHistoryPackageRemoteModel, packageCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPackageName() {
		return _packageName;
	}

	@Override
	public void setPackageName(String packageName) {
		_packageName = packageName;

		if (_dmHistoryPackageRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPackageRemoteModel.getClass();

				Method method = clazz.getMethod("setPackageName", String.class);

				method.invoke(_dmHistoryPackageRemoteModel, packageName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPackageNameVN() {
		return _packageNameVN;
	}

	@Override
	public void setPackageNameVN(String packageNameVN) {
		_packageNameVN = packageNameVN;

		if (_dmHistoryPackageRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPackageRemoteModel.getClass();

				Method method = clazz.getMethod("setPackageNameVN", String.class);

				method.invoke(_dmHistoryPackageRemoteModel, packageNameVN);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPackageOrder() {
		return _packageOrder;
	}

	@Override
	public void setPackageOrder(int packageOrder) {
		_packageOrder = packageOrder;

		if (_dmHistoryPackageRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPackageRemoteModel.getClass();

				Method method = clazz.getMethod("setPackageOrder", int.class);

				method.invoke(_dmHistoryPackageRemoteModel, packageOrder);
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

		if (_dmHistoryPackageRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPackageRemoteModel.getClass();

				Method method = clazz.getMethod("setIsDelete", int.class);

				method.invoke(_dmHistoryPackageRemoteModel, isDelete);
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

		if (_dmHistoryPackageRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPackageRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkedAsDelete", int.class);

				method.invoke(_dmHistoryPackageRemoteModel, markedAsDelete);
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

		if (_dmHistoryPackageRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPackageRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_dmHistoryPackageRemoteModel, modifiedDate);
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

		if (_dmHistoryPackageRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPackageRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestedDate", Date.class);

				method.invoke(_dmHistoryPackageRemoteModel, requestedDate);
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

		if (_dmHistoryPackageRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryPackageRemoteModel.getClass();

				Method method = clazz.getMethod("setSyncVersion", String.class);

				method.invoke(_dmHistoryPackageRemoteModel, syncVersion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDmHistoryPackageRemoteModel() {
		return _dmHistoryPackageRemoteModel;
	}

	public void setDmHistoryPackageRemoteModel(
		BaseModel<?> dmHistoryPackageRemoteModel) {
		_dmHistoryPackageRemoteModel = dmHistoryPackageRemoteModel;
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

		Class<?> remoteModelClass = _dmHistoryPackageRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dmHistoryPackageRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DmHistoryPackageLocalServiceUtil.addDmHistoryPackage(this);
		}
		else {
			DmHistoryPackageLocalServiceUtil.updateDmHistoryPackage(this);
		}
	}

	@Override
	public DmHistoryPackage toEscapedModel() {
		return (DmHistoryPackage)ProxyUtil.newProxyInstance(DmHistoryPackage.class.getClassLoader(),
			new Class[] { DmHistoryPackage.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmHistoryPackageClp clone = new DmHistoryPackageClp();

		clone.setId(getId());
		clone.setPackageCode(getPackageCode());
		clone.setPackageName(getPackageName());
		clone.setPackageNameVN(getPackageNameVN());
		clone.setPackageOrder(getPackageOrder());
		clone.setIsDelete(getIsDelete());
		clone.setMarkedAsDelete(getMarkedAsDelete());
		clone.setModifiedDate(getModifiedDate());
		clone.setRequestedDate(getRequestedDate());
		clone.setSyncVersion(getSyncVersion());

		return clone;
	}

	@Override
	public int compareTo(DmHistoryPackage dmHistoryPackage) {
		int value = 0;

		if (getId() < dmHistoryPackage.getId()) {
			value = -1;
		}
		else if (getId() > dmHistoryPackage.getId()) {
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

		if (!(obj instanceof DmHistoryPackageClp)) {
			return false;
		}

		DmHistoryPackageClp dmHistoryPackage = (DmHistoryPackageClp)obj;

		int primaryKey = dmHistoryPackage.getPrimaryKey();

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
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", packageCode=");
		sb.append(getPackageCode());
		sb.append(", packageName=");
		sb.append(getPackageName());
		sb.append(", packageNameVN=");
		sb.append(getPackageNameVN());
		sb.append(", packageOrder=");
		sb.append(getPackageOrder());
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
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DmHistoryPackage");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>packageCode</column-name><column-value><![CDATA[");
		sb.append(getPackageCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>packageName</column-name><column-value><![CDATA[");
		sb.append(getPackageName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>packageNameVN</column-name><column-value><![CDATA[");
		sb.append(getPackageNameVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>packageOrder</column-name><column-value><![CDATA[");
		sb.append(getPackageOrder());
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
	private String _packageCode;
	private String _packageName;
	private String _packageNameVN;
	private int _packageOrder;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private BaseModel<?> _dmHistoryPackageRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.class;
}