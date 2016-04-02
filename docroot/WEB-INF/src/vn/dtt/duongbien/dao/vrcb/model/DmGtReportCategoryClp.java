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
import vn.dtt.duongbien.dao.vrcb.service.DmGtReportCategoryLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class DmGtReportCategoryClp extends BaseModelImpl<DmGtReportCategory>
	implements DmGtReportCategory {
	public DmGtReportCategoryClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DmGtReportCategory.class;
	}

	@Override
	public String getModelClassName() {
		return DmGtReportCategory.class.getName();
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
		attributes.put("category", getCategory());
		attributes.put("categoryName", getCategoryName());
		attributes.put("categoryOrder", getCategoryOrder());
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

		String category = (String)attributes.get("category");

		if (category != null) {
			setCategory(category);
		}

		String categoryName = (String)attributes.get("categoryName");

		if (categoryName != null) {
			setCategoryName(categoryName);
		}

		Integer categoryOrder = (Integer)attributes.get("categoryOrder");

		if (categoryOrder != null) {
			setCategoryOrder(categoryOrder);
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

		if (_dmGtReportCategoryRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtReportCategoryRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_dmGtReportCategoryRemoteModel, id);
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

		if (_dmGtReportCategoryRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtReportCategoryRemoteModel.getClass();

				Method method = clazz.getMethod("setCategory", String.class);

				method.invoke(_dmGtReportCategoryRemoteModel, category);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCategoryName() {
		return _categoryName;
	}

	@Override
	public void setCategoryName(String categoryName) {
		_categoryName = categoryName;

		if (_dmGtReportCategoryRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtReportCategoryRemoteModel.getClass();

				Method method = clazz.getMethod("setCategoryName", String.class);

				method.invoke(_dmGtReportCategoryRemoteModel, categoryName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCategoryOrder() {
		return _categoryOrder;
	}

	@Override
	public void setCategoryOrder(int categoryOrder) {
		_categoryOrder = categoryOrder;

		if (_dmGtReportCategoryRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtReportCategoryRemoteModel.getClass();

				Method method = clazz.getMethod("setCategoryOrder", int.class);

				method.invoke(_dmGtReportCategoryRemoteModel, categoryOrder);
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

		if (_dmGtReportCategoryRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtReportCategoryRemoteModel.getClass();

				Method method = clazz.getMethod("setIsDelete", int.class);

				method.invoke(_dmGtReportCategoryRemoteModel, isDelete);
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

		if (_dmGtReportCategoryRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtReportCategoryRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkedAsDelete", int.class);

				method.invoke(_dmGtReportCategoryRemoteModel, markedAsDelete);
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

		if (_dmGtReportCategoryRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtReportCategoryRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_dmGtReportCategoryRemoteModel, modifiedDate);
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

		if (_dmGtReportCategoryRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtReportCategoryRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestedDate", Date.class);

				method.invoke(_dmGtReportCategoryRemoteModel, requestedDate);
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

		if (_dmGtReportCategoryRemoteModel != null) {
			try {
				Class<?> clazz = _dmGtReportCategoryRemoteModel.getClass();

				Method method = clazz.getMethod("setSyncVersion", String.class);

				method.invoke(_dmGtReportCategoryRemoteModel, syncVersion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDmGtReportCategoryRemoteModel() {
		return _dmGtReportCategoryRemoteModel;
	}

	public void setDmGtReportCategoryRemoteModel(
		BaseModel<?> dmGtReportCategoryRemoteModel) {
		_dmGtReportCategoryRemoteModel = dmGtReportCategoryRemoteModel;
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

		Class<?> remoteModelClass = _dmGtReportCategoryRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dmGtReportCategoryRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DmGtReportCategoryLocalServiceUtil.addDmGtReportCategory(this);
		}
		else {
			DmGtReportCategoryLocalServiceUtil.updateDmGtReportCategory(this);
		}
	}

	@Override
	public DmGtReportCategory toEscapedModel() {
		return (DmGtReportCategory)ProxyUtil.newProxyInstance(DmGtReportCategory.class.getClassLoader(),
			new Class[] { DmGtReportCategory.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmGtReportCategoryClp clone = new DmGtReportCategoryClp();

		clone.setId(getId());
		clone.setCategory(getCategory());
		clone.setCategoryName(getCategoryName());
		clone.setCategoryOrder(getCategoryOrder());
		clone.setIsDelete(getIsDelete());
		clone.setMarkedAsDelete(getMarkedAsDelete());
		clone.setModifiedDate(getModifiedDate());
		clone.setRequestedDate(getRequestedDate());
		clone.setSyncVersion(getSyncVersion());

		return clone;
	}

	@Override
	public int compareTo(DmGtReportCategory dmGtReportCategory) {
		int value = 0;

		if (getId() < dmGtReportCategory.getId()) {
			value = -1;
		}
		else if (getId() > dmGtReportCategory.getId()) {
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

		if (!(obj instanceof DmGtReportCategoryClp)) {
			return false;
		}

		DmGtReportCategoryClp dmGtReportCategory = (DmGtReportCategoryClp)obj;

		long primaryKey = dmGtReportCategory.getPrimaryKey();

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
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", category=");
		sb.append(getCategory());
		sb.append(", categoryName=");
		sb.append(getCategoryName());
		sb.append(", categoryOrder=");
		sb.append(getCategoryOrder());
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
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DmGtReportCategory");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>category</column-name><column-value><![CDATA[");
		sb.append(getCategory());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>categoryName</column-name><column-value><![CDATA[");
		sb.append(getCategoryName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>categoryOrder</column-name><column-value><![CDATA[");
		sb.append(getCategoryOrder());
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
	private String _category;
	private String _categoryName;
	private int _categoryOrder;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private BaseModel<?> _dmGtReportCategoryRemoteModel;
}