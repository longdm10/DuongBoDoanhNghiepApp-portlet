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
import vn.dtt.duongbien.dao.vrcb.service.DmSyncCategoryLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class DmSyncCategoryClp extends BaseModelImpl<DmSyncCategory>
	implements DmSyncCategory {
	public DmSyncCategoryClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DmSyncCategory.class;
	}

	@Override
	public String getModelClassName() {
		return DmSyncCategory.class.getName();
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
		attributes.put("categoryId", getCategoryId());
		attributes.put("categoryDescription", getCategoryDescription());
		attributes.put("modifiedUser", getModifiedUser());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String categoryId = (String)attributes.get("categoryId");

		if (categoryId != null) {
			setCategoryId(categoryId);
		}

		String categoryDescription = (String)attributes.get(
				"categoryDescription");

		if (categoryDescription != null) {
			setCategoryDescription(categoryDescription);
		}

		String modifiedUser = (String)attributes.get("modifiedUser");

		if (modifiedUser != null) {
			setModifiedUser(modifiedUser);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_dmSyncCategoryRemoteModel != null) {
			try {
				Class<?> clazz = _dmSyncCategoryRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_dmSyncCategoryRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCategoryId() {
		return _categoryId;
	}

	@Override
	public void setCategoryId(String categoryId) {
		_categoryId = categoryId;

		if (_dmSyncCategoryRemoteModel != null) {
			try {
				Class<?> clazz = _dmSyncCategoryRemoteModel.getClass();

				Method method = clazz.getMethod("setCategoryId", String.class);

				method.invoke(_dmSyncCategoryRemoteModel, categoryId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCategoryDescription() {
		return _categoryDescription;
	}

	@Override
	public void setCategoryDescription(String categoryDescription) {
		_categoryDescription = categoryDescription;

		if (_dmSyncCategoryRemoteModel != null) {
			try {
				Class<?> clazz = _dmSyncCategoryRemoteModel.getClass();

				Method method = clazz.getMethod("setCategoryDescription",
						String.class);

				method.invoke(_dmSyncCategoryRemoteModel, categoryDescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getModifiedUser() {
		return _modifiedUser;
	}

	@Override
	public void setModifiedUser(String modifiedUser) {
		_modifiedUser = modifiedUser;

		if (_dmSyncCategoryRemoteModel != null) {
			try {
				Class<?> clazz = _dmSyncCategoryRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedUser", String.class);

				method.invoke(_dmSyncCategoryRemoteModel, modifiedUser);
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

		if (_dmSyncCategoryRemoteModel != null) {
			try {
				Class<?> clazz = _dmSyncCategoryRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_dmSyncCategoryRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDmSyncCategoryRemoteModel() {
		return _dmSyncCategoryRemoteModel;
	}

	public void setDmSyncCategoryRemoteModel(
		BaseModel<?> dmSyncCategoryRemoteModel) {
		_dmSyncCategoryRemoteModel = dmSyncCategoryRemoteModel;
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

		Class<?> remoteModelClass = _dmSyncCategoryRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dmSyncCategoryRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DmSyncCategoryLocalServiceUtil.addDmSyncCategory(this);
		}
		else {
			DmSyncCategoryLocalServiceUtil.updateDmSyncCategory(this);
		}
	}

	@Override
	public DmSyncCategory toEscapedModel() {
		return (DmSyncCategory)ProxyUtil.newProxyInstance(DmSyncCategory.class.getClassLoader(),
			new Class[] { DmSyncCategory.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmSyncCategoryClp clone = new DmSyncCategoryClp();

		clone.setId(getId());
		clone.setCategoryId(getCategoryId());
		clone.setCategoryDescription(getCategoryDescription());
		clone.setModifiedUser(getModifiedUser());
		clone.setModifiedDate(getModifiedDate());

		return clone;
	}

	@Override
	public int compareTo(DmSyncCategory dmSyncCategory) {
		int value = 0;

		if (getId() < dmSyncCategory.getId()) {
			value = -1;
		}
		else if (getId() > dmSyncCategory.getId()) {
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

		if (!(obj instanceof DmSyncCategoryClp)) {
			return false;
		}

		DmSyncCategoryClp dmSyncCategory = (DmSyncCategoryClp)obj;

		long primaryKey = dmSyncCategory.getPrimaryKey();

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
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", categoryId=");
		sb.append(getCategoryId());
		sb.append(", categoryDescription=");
		sb.append(getCategoryDescription());
		sb.append(", modifiedUser=");
		sb.append(getModifiedUser());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DmSyncCategory");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>categoryId</column-name><column-value><![CDATA[");
		sb.append(getCategoryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>categoryDescription</column-name><column-value><![CDATA[");
		sb.append(getCategoryDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedUser</column-name><column-value><![CDATA[");
		sb.append(getModifiedUser());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _categoryId;
	private String _categoryDescription;
	private String _modifiedUser;
	private Date _modifiedDate;
	private BaseModel<?> _dmSyncCategoryRemoteModel;
}