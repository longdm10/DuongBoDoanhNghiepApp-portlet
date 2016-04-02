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
import vn.dtt.duongbien.dao.vrcb.service.DmGtReportTemplateLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class DmGtReportTemplateClp extends BaseModelImpl<DmGtReportTemplate>
	implements DmGtReportTemplate {
	public DmGtReportTemplateClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DmGtReportTemplate.class;
	}

	@Override
	public String getModelClassName() {
		return DmGtReportTemplate.class.getName();
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
		attributes.put("reportCode", getReportCode());
		attributes.put("reportName", getReportName());
		attributes.put("reportType", getReportType());
		attributes.put("category", getCategory());
		attributes.put("description", getDescription());
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

		Integer reportCode = (Integer)attributes.get("reportCode");

		if (reportCode != null) {
			setReportCode(reportCode);
		}

		String reportName = (String)attributes.get("reportName");

		if (reportName != null) {
			setReportName(reportName);
		}

		Integer reportType = (Integer)attributes.get("reportType");

		if (reportType != null) {
			setReportType(reportType);
		}

		String category = (String)attributes.get("category");

		if (category != null) {
			setCategory(category);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
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

		if (_dmGtReportTemplateRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtReportTemplateRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_dmGtReportTemplateRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getReportCode() {
		return _reportCode;
	}

	@Override
	public void setReportCode(int reportCode) {
		_reportCode = reportCode;

		if (_dmGtReportTemplateRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtReportTemplateRemoteModel.getClass();

				Method method = clazz.getMethod("setReportCode", int.class);

				method.invoke(_dmGtReportTemplateRemoteModel, reportCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getReportName() {
		return _reportName;
	}

	@Override
	public void setReportName(String reportName) {
		_reportName = reportName;

		if (_dmGtReportTemplateRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtReportTemplateRemoteModel.getClass();

				Method method = clazz.getMethod("setReportName", String.class);

				method.invoke(_dmGtReportTemplateRemoteModel, reportName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getReportType() {
		return _reportType;
	}

	@Override
	public void setReportType(int reportType) {
		_reportType = reportType;

		if (_dmGtReportTemplateRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtReportTemplateRemoteModel.getClass();

				Method method = clazz.getMethod("setReportType", int.class);

				method.invoke(_dmGtReportTemplateRemoteModel, reportType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCategory() {
		return _category;
	}

	@Override
	public void setCategory(String category) {
		_category = category;

		if (_dmGtReportTemplateRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtReportTemplateRemoteModel.getClass();

				Method method = clazz.getMethod("setCategory", String.class);

				method.invoke(_dmGtReportTemplateRemoteModel, category);
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

		if (_dmGtReportTemplateRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtReportTemplateRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_dmGtReportTemplateRemoteModel, description);
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

		if (_dmGtReportTemplateRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtReportTemplateRemoteModel.getClass();

				Method method = clazz.getMethod("setIsDelete", int.class);

				method.invoke(_dmGtReportTemplateRemoteModel, isDelete);
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

		if (_dmGtReportTemplateRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtReportTemplateRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkedAsDelete", int.class);

				method.invoke(_dmGtReportTemplateRemoteModel, markedAsDelete);
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

		if (_dmGtReportTemplateRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtReportTemplateRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_dmGtReportTemplateRemoteModel, modifiedDate);
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

		if (_dmGtReportTemplateRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtReportTemplateRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestedDate", Date.class);

				method.invoke(_dmGtReportTemplateRemoteModel, requestedDate);
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

		if (_dmGtReportTemplateRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtReportTemplateRemoteModel.getClass();

				Method method = clazz.getMethod("setSyncVersion", String.class);

				method.invoke(_dmGtReportTemplateRemoteModel, syncVersion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDmGtReportTemplateRemoteModel() {
		return _dmGtReportTemplateRemoteModel;
	}

	public void setDmGtReportTemplateRemoteModel(
		BaseModel<?> dmGtReportTemplateRemoteModel) {
		_dmGtReportTemplateRemoteModel = dmGtReportTemplateRemoteModel;
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

		Class<?> remoteModelClass = _dmGtReportTemplateRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dmGtReportTemplateRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DmGtReportTemplateLocalServiceUtil.addDmGtReportTemplate(this);
		}
		else {
			DmGtReportTemplateLocalServiceUtil.updateDmGtReportTemplate(this);
		}
	}

	@Override
	public DmGtReportTemplate toEscapedModel() {
		return (DmGtReportTemplate)ProxyUtil.newProxyInstance(DmGtReportTemplate.class.getClassLoader(),
			new Class[] { DmGtReportTemplate.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmGtReportTemplateClp clone = new DmGtReportTemplateClp();

		clone.setId(getId());
		clone.setReportCode(getReportCode());
		clone.setReportName(getReportName());
		clone.setReportType(getReportType());
		clone.setCategory(getCategory());
		clone.setDescription(getDescription());
		clone.setIsDelete(getIsDelete());
		clone.setMarkedAsDelete(getMarkedAsDelete());
		clone.setModifiedDate(getModifiedDate());
		clone.setRequestedDate(getRequestedDate());
		clone.setSyncVersion(getSyncVersion());

		return clone;
	}

	@Override
	public int compareTo(DmGtReportTemplate dmGtReportTemplate) {
		int value = 0;

		if (getId() < dmGtReportTemplate.getId()) {
			value = -1;
		}
		else if (getId() > dmGtReportTemplate.getId()) {
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

		if (!(obj instanceof DmGtReportTemplateClp)) {
			return false;
		}

		DmGtReportTemplateClp dmGtReportTemplate = (DmGtReportTemplateClp)obj;

		long primaryKey = dmGtReportTemplate.getPrimaryKey();

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
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", reportCode=");
		sb.append(getReportCode());
		sb.append(", reportName=");
		sb.append(getReportName());
		sb.append(", reportType=");
		sb.append(getReportType());
		sb.append(", category=");
		sb.append(getCategory());
		sb.append(", description=");
		sb.append(getDescription());
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
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DmGtReportTemplate");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reportCode</column-name><column-value><![CDATA[");
		sb.append(getReportCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reportName</column-name><column-value><![CDATA[");
		sb.append(getReportName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reportType</column-name><column-value><![CDATA[");
		sb.append(getReportType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>category</column-name><column-value><![CDATA[");
		sb.append(getCategory());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
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
	private int _reportCode;
	private String _reportName;
	private int _reportType;
	private String _category;
	private String _description;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private BaseModel<?> _dmGtReportTemplateRemoteModel;
}