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
import vn.dtt.duongbien.dao.vrcb.service.DmGtVersionLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class DmGtVersionClp extends BaseModelImpl<DmGtVersion>
	implements DmGtVersion {
	public DmGtVersionClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DmGtVersion.class;
	}

	@Override
	public String getModelClassName() {
		return DmGtVersion.class.getName();
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
		attributes.put("versionName", getVersionName());
		attributes.put("versionDate", getVersionDate());
		attributes.put("versionDeployer", getVersionDeployer());
		attributes.put("contents", getContents());
		attributes.put("description", getDescription());
		attributes.put("dbFileName", getDbFileName());
		attributes.put("dbFileSize", getDbFileSize());
		attributes.put("dbDescription", getDbDescription());
		attributes.put("appFileName", getAppFileName());
		attributes.put("appFileSize", getAppFileSize());
		attributes.put("appDescription", getAppDescription());
		attributes.put("specFileName", getSpecFileName());
		attributes.put("specFileSize", getSpecFileSize());
		attributes.put("specDescription", getSpecDescription());
		attributes.put("organizationCode", getOrganizationCode());
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

		String versionName = (String)attributes.get("versionName");

		if (versionName != null) {
			setVersionName(versionName);
		}

		Date versionDate = (Date)attributes.get("versionDate");

		if (versionDate != null) {
			setVersionDate(versionDate);
		}

		String versionDeployer = (String)attributes.get("versionDeployer");

		if (versionDeployer != null) {
			setVersionDeployer(versionDeployer);
		}

		String contents = (String)attributes.get("contents");

		if (contents != null) {
			setContents(contents);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String dbFileName = (String)attributes.get("dbFileName");

		if (dbFileName != null) {
			setDbFileName(dbFileName);
		}

		String dbFileSize = (String)attributes.get("dbFileSize");

		if (dbFileSize != null) {
			setDbFileSize(dbFileSize);
		}

		String dbDescription = (String)attributes.get("dbDescription");

		if (dbDescription != null) {
			setDbDescription(dbDescription);
		}

		String appFileName = (String)attributes.get("appFileName");

		if (appFileName != null) {
			setAppFileName(appFileName);
		}

		String appFileSize = (String)attributes.get("appFileSize");

		if (appFileSize != null) {
			setAppFileSize(appFileSize);
		}

		String appDescription = (String)attributes.get("appDescription");

		if (appDescription != null) {
			setAppDescription(appDescription);
		}

		String specFileName = (String)attributes.get("specFileName");

		if (specFileName != null) {
			setSpecFileName(specFileName);
		}

		String specFileSize = (String)attributes.get("specFileSize");

		if (specFileSize != null) {
			setSpecFileSize(specFileSize);
		}

		String specDescription = (String)attributes.get("specDescription");

		if (specDescription != null) {
			setSpecDescription(specDescription);
		}

		String organizationCode = (String)attributes.get("organizationCode");

		if (organizationCode != null) {
			setOrganizationCode(organizationCode);
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

		if (_dmGtVersionRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setId", int.class);

				method.invoke(_dmGtVersionRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVersionName() {
		return _versionName;
	}

	@Override
	public void setVersionName(String versionName) {
		_versionName = versionName;

		if (_dmGtVersionRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setVersionName", String.class);

				method.invoke(_dmGtVersionRemoteModel, versionName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getVersionDate() {
		return _versionDate;
	}

	@Override
	public void setVersionDate(Date versionDate) {
		_versionDate = versionDate;

		if (_dmGtVersionRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setVersionDate", Date.class);

				method.invoke(_dmGtVersionRemoteModel, versionDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVersionDeployer() {
		return _versionDeployer;
	}

	@Override
	public void setVersionDeployer(String versionDeployer) {
		_versionDeployer = versionDeployer;

		if (_dmGtVersionRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setVersionDeployer",
						String.class);

				method.invoke(_dmGtVersionRemoteModel, versionDeployer);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getContents() {
		return _contents;
	}

	@Override
	public void setContents(String contents) {
		_contents = contents;

		if (_dmGtVersionRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setContents", String.class);

				method.invoke(_dmGtVersionRemoteModel, contents);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescription() {
		return _description;
	}

	@Override
	public void setDescription(String description) {
		_description = description;

		if (_dmGtVersionRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_dmGtVersionRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDbFileName() {
		return _dbFileName;
	}

	@Override
	public void setDbFileName(String dbFileName) {
		_dbFileName = dbFileName;

		if (_dmGtVersionRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setDbFileName", String.class);

				method.invoke(_dmGtVersionRemoteModel, dbFileName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDbFileSize() {
		return _dbFileSize;
	}

	@Override
	public void setDbFileSize(String dbFileSize) {
		_dbFileSize = dbFileSize;

		if (_dmGtVersionRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setDbFileSize", String.class);

				method.invoke(_dmGtVersionRemoteModel, dbFileSize);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDbDescription() {
		return _dbDescription;
	}

	@Override
	public void setDbDescription(String dbDescription) {
		_dbDescription = dbDescription;

		if (_dmGtVersionRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setDbDescription", String.class);

				method.invoke(_dmGtVersionRemoteModel, dbDescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAppFileName() {
		return _appFileName;
	}

	@Override
	public void setAppFileName(String appFileName) {
		_appFileName = appFileName;

		if (_dmGtVersionRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setAppFileName", String.class);

				method.invoke(_dmGtVersionRemoteModel, appFileName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAppFileSize() {
		return _appFileSize;
	}

	@Override
	public void setAppFileSize(String appFileSize) {
		_appFileSize = appFileSize;

		if (_dmGtVersionRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setAppFileSize", String.class);

				method.invoke(_dmGtVersionRemoteModel, appFileSize);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAppDescription() {
		return _appDescription;
	}

	@Override
	public void setAppDescription(String appDescription) {
		_appDescription = appDescription;

		if (_dmGtVersionRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setAppDescription",
						String.class);

				method.invoke(_dmGtVersionRemoteModel, appDescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSpecFileName() {
		return _specFileName;
	}

	@Override
	public void setSpecFileName(String specFileName) {
		_specFileName = specFileName;

		if (_dmGtVersionRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setSpecFileName", String.class);

				method.invoke(_dmGtVersionRemoteModel, specFileName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSpecFileSize() {
		return _specFileSize;
	}

	@Override
	public void setSpecFileSize(String specFileSize) {
		_specFileSize = specFileSize;

		if (_dmGtVersionRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setSpecFileSize", String.class);

				method.invoke(_dmGtVersionRemoteModel, specFileSize);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSpecDescription() {
		return _specDescription;
	}

	@Override
	public void setSpecDescription(String specDescription) {
		_specDescription = specDescription;

		if (_dmGtVersionRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setSpecDescription",
						String.class);

				method.invoke(_dmGtVersionRemoteModel, specDescription);
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

		if (_dmGtVersionRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setOrganizationCode",
						String.class);

				method.invoke(_dmGtVersionRemoteModel, organizationCode);
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

		if (_dmGtVersionRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setIsDelete", int.class);

				method.invoke(_dmGtVersionRemoteModel, isDelete);
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

		if (_dmGtVersionRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkedAsDelete", int.class);

				method.invoke(_dmGtVersionRemoteModel, markedAsDelete);
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

		if (_dmGtVersionRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_dmGtVersionRemoteModel, modifiedDate);
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

		if (_dmGtVersionRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestedDate", Date.class);

				method.invoke(_dmGtVersionRemoteModel, requestedDate);
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

		if (_dmGtVersionRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setSyncVersion", String.class);

				method.invoke(_dmGtVersionRemoteModel, syncVersion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDmGtVersionRemoteModel() {
		return _dmGtVersionRemoteModel;
	}

	public void setDmGtVersionRemoteModel(BaseModel<?> dmGtVersionRemoteModel) {
		_dmGtVersionRemoteModel = dmGtVersionRemoteModel;
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

		Class<?> remoteModelClass = _dmGtVersionRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dmGtVersionRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DmGtVersionLocalServiceUtil.addDmGtVersion(this);
		}
		else {
			DmGtVersionLocalServiceUtil.updateDmGtVersion(this);
		}
	}

	@Override
	public DmGtVersion toEscapedModel() {
		return (DmGtVersion)ProxyUtil.newProxyInstance(DmGtVersion.class.getClassLoader(),
			new Class[] { DmGtVersion.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmGtVersionClp clone = new DmGtVersionClp();

		clone.setId(getId());
		clone.setVersionName(getVersionName());
		clone.setVersionDate(getVersionDate());
		clone.setVersionDeployer(getVersionDeployer());
		clone.setContents(getContents());
		clone.setDescription(getDescription());
		clone.setDbFileName(getDbFileName());
		clone.setDbFileSize(getDbFileSize());
		clone.setDbDescription(getDbDescription());
		clone.setAppFileName(getAppFileName());
		clone.setAppFileSize(getAppFileSize());
		clone.setAppDescription(getAppDescription());
		clone.setSpecFileName(getSpecFileName());
		clone.setSpecFileSize(getSpecFileSize());
		clone.setSpecDescription(getSpecDescription());
		clone.setOrganizationCode(getOrganizationCode());
		clone.setIsDelete(getIsDelete());
		clone.setMarkedAsDelete(getMarkedAsDelete());
		clone.setModifiedDate(getModifiedDate());
		clone.setRequestedDate(getRequestedDate());
		clone.setSyncVersion(getSyncVersion());

		return clone;
	}

	@Override
	public int compareTo(DmGtVersion dmGtVersion) {
		int value = 0;

		if (getId() < dmGtVersion.getId()) {
			value = -1;
		}
		else if (getId() > dmGtVersion.getId()) {
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

		if (!(obj instanceof DmGtVersionClp)) {
			return false;
		}

		DmGtVersionClp dmGtVersion = (DmGtVersionClp)obj;

		int primaryKey = dmGtVersion.getPrimaryKey();

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
		StringBundler sb = new StringBundler(43);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", versionName=");
		sb.append(getVersionName());
		sb.append(", versionDate=");
		sb.append(getVersionDate());
		sb.append(", versionDeployer=");
		sb.append(getVersionDeployer());
		sb.append(", contents=");
		sb.append(getContents());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", dbFileName=");
		sb.append(getDbFileName());
		sb.append(", dbFileSize=");
		sb.append(getDbFileSize());
		sb.append(", dbDescription=");
		sb.append(getDbDescription());
		sb.append(", appFileName=");
		sb.append(getAppFileName());
		sb.append(", appFileSize=");
		sb.append(getAppFileSize());
		sb.append(", appDescription=");
		sb.append(getAppDescription());
		sb.append(", specFileName=");
		sb.append(getSpecFileName());
		sb.append(", specFileSize=");
		sb.append(getSpecFileSize());
		sb.append(", specDescription=");
		sb.append(getSpecDescription());
		sb.append(", organizationCode=");
		sb.append(getOrganizationCode());
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
		StringBundler sb = new StringBundler(67);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DmGtVersion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>versionName</column-name><column-value><![CDATA[");
		sb.append(getVersionName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>versionDate</column-name><column-value><![CDATA[");
		sb.append(getVersionDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>versionDeployer</column-name><column-value><![CDATA[");
		sb.append(getVersionDeployer());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contents</column-name><column-value><![CDATA[");
		sb.append(getContents());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dbFileName</column-name><column-value><![CDATA[");
		sb.append(getDbFileName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dbFileSize</column-name><column-value><![CDATA[");
		sb.append(getDbFileSize());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dbDescription</column-name><column-value><![CDATA[");
		sb.append(getDbDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>appFileName</column-name><column-value><![CDATA[");
		sb.append(getAppFileName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>appFileSize</column-name><column-value><![CDATA[");
		sb.append(getAppFileSize());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>appDescription</column-name><column-value><![CDATA[");
		sb.append(getAppDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specFileName</column-name><column-value><![CDATA[");
		sb.append(getSpecFileName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specFileSize</column-name><column-value><![CDATA[");
		sb.append(getSpecFileSize());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specDescription</column-name><column-value><![CDATA[");
		sb.append(getSpecDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organizationCode</column-name><column-value><![CDATA[");
		sb.append(getOrganizationCode());
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
	private String _versionName;
	private Date _versionDate;
	private String _versionDeployer;
	private String _contents;
	private String _description;
	private String _dbFileName;
	private String _dbFileSize;
	private String _dbDescription;
	private String _appFileName;
	private String _appFileSize;
	private String _appDescription;
	private String _specFileName;
	private String _specFileSize;
	private String _specDescription;
	private String _organizationCode;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private BaseModel<?> _dmGtVersionRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.class;
}