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

package vn.dtt.duongbo.dao.common.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbo.dao.common.service.ClpSerializer;
import vn.dtt.duongbo.dao.common.service.DmMetaDataLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class DmMetaDataClp extends BaseModelImpl<DmMetaData>
	implements DmMetaData {
	public DmMetaDataClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DmMetaData.class;
	}

	@Override
	public String getModelClassName() {
		return DmMetaData.class.getName();
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
		attributes.put("entity", getEntity());
		attributes.put("fieldCode", getFieldCode());
		attributes.put("fieldName", getFieldName());
		attributes.put("fieldAlterName", getFieldAlterName());
		attributes.put("fieldDescription", getFieldDescription());
		attributes.put("fieldDataSet", getFieldDataSet());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String entity = (String)attributes.get("entity");

		if (entity != null) {
			setEntity(entity);
		}

		String fieldCode = (String)attributes.get("fieldCode");

		if (fieldCode != null) {
			setFieldCode(fieldCode);
		}

		String fieldName = (String)attributes.get("fieldName");

		if (fieldName != null) {
			setFieldName(fieldName);
		}

		String fieldAlterName = (String)attributes.get("fieldAlterName");

		if (fieldAlterName != null) {
			setFieldAlterName(fieldAlterName);
		}

		String fieldDescription = (String)attributes.get("fieldDescription");

		if (fieldDescription != null) {
			setFieldDescription(fieldDescription);
		}

		String fieldDataSet = (String)attributes.get("fieldDataSet");

		if (fieldDataSet != null) {
			setFieldDataSet(fieldDataSet);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_dmMetaDataRemoteModel != null) {
			try {
				Class<?> clazz = _dmMetaDataRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_dmMetaDataRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEntity() {
		return _entity;
	}

	@Override
	public void setEntity(String entity) {
		_entity = entity;

		if (_dmMetaDataRemoteModel != null) {
			try {
				Class<?> clazz = _dmMetaDataRemoteModel.getClass();

				Method method = clazz.getMethod("setEntity", String.class);

				method.invoke(_dmMetaDataRemoteModel, entity);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFieldCode() {
		return _fieldCode;
	}

	@Override
	public void setFieldCode(String fieldCode) {
		_fieldCode = fieldCode;

		if (_dmMetaDataRemoteModel != null) {
			try {
				Class<?> clazz = _dmMetaDataRemoteModel.getClass();

				Method method = clazz.getMethod("setFieldCode", String.class);

				method.invoke(_dmMetaDataRemoteModel, fieldCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFieldName() {
		return _fieldName;
	}

	@Override
	public void setFieldName(String fieldName) {
		_fieldName = fieldName;

		if (_dmMetaDataRemoteModel != null) {
			try {
				Class<?> clazz = _dmMetaDataRemoteModel.getClass();

				Method method = clazz.getMethod("setFieldName", String.class);

				method.invoke(_dmMetaDataRemoteModel, fieldName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFieldAlterName() {
		return _fieldAlterName;
	}

	@Override
	public void setFieldAlterName(String fieldAlterName) {
		_fieldAlterName = fieldAlterName;

		if (_dmMetaDataRemoteModel != null) {
			try {
				Class<?> clazz = _dmMetaDataRemoteModel.getClass();

				Method method = clazz.getMethod("setFieldAlterName",
						String.class);

				method.invoke(_dmMetaDataRemoteModel, fieldAlterName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFieldDescription() {
		return _fieldDescription;
	}

	@Override
	public void setFieldDescription(String fieldDescription) {
		_fieldDescription = fieldDescription;

		if (_dmMetaDataRemoteModel != null) {
			try {
				Class<?> clazz = _dmMetaDataRemoteModel.getClass();

				Method method = clazz.getMethod("setFieldDescription",
						String.class);

				method.invoke(_dmMetaDataRemoteModel, fieldDescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFieldDataSet() {
		return _fieldDataSet;
	}

	@Override
	public void setFieldDataSet(String fieldDataSet) {
		_fieldDataSet = fieldDataSet;

		if (_dmMetaDataRemoteModel != null) {
			try {
				Class<?> clazz = _dmMetaDataRemoteModel.getClass();

				Method method = clazz.getMethod("setFieldDataSet", String.class);

				method.invoke(_dmMetaDataRemoteModel, fieldDataSet);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDmMetaDataRemoteModel() {
		return _dmMetaDataRemoteModel;
	}

	public void setDmMetaDataRemoteModel(BaseModel<?> dmMetaDataRemoteModel) {
		_dmMetaDataRemoteModel = dmMetaDataRemoteModel;
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

		Class<?> remoteModelClass = _dmMetaDataRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dmMetaDataRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DmMetaDataLocalServiceUtil.addDmMetaData(this);
		}
		else {
			DmMetaDataLocalServiceUtil.updateDmMetaData(this);
		}
	}

	@Override
	public DmMetaData toEscapedModel() {
		return (DmMetaData)ProxyUtil.newProxyInstance(DmMetaData.class.getClassLoader(),
			new Class[] { DmMetaData.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmMetaDataClp clone = new DmMetaDataClp();

		clone.setId(getId());
		clone.setEntity(getEntity());
		clone.setFieldCode(getFieldCode());
		clone.setFieldName(getFieldName());
		clone.setFieldAlterName(getFieldAlterName());
		clone.setFieldDescription(getFieldDescription());
		clone.setFieldDataSet(getFieldDataSet());

		return clone;
	}

	@Override
	public int compareTo(DmMetaData dmMetaData) {
		int value = 0;

		if (getId() < dmMetaData.getId()) {
			value = -1;
		}
		else if (getId() > dmMetaData.getId()) {
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

		if (!(obj instanceof DmMetaDataClp)) {
			return false;
		}

		DmMetaDataClp dmMetaData = (DmMetaDataClp)obj;

		long primaryKey = dmMetaData.getPrimaryKey();

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
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", entity=");
		sb.append(getEntity());
		sb.append(", fieldCode=");
		sb.append(getFieldCode());
		sb.append(", fieldName=");
		sb.append(getFieldName());
		sb.append(", fieldAlterName=");
		sb.append(getFieldAlterName());
		sb.append(", fieldDescription=");
		sb.append(getFieldDescription());
		sb.append(", fieldDataSet=");
		sb.append(getFieldDataSet());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.common.model.DmMetaData");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>entity</column-name><column-value><![CDATA[");
		sb.append(getEntity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fieldCode</column-name><column-value><![CDATA[");
		sb.append(getFieldCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fieldName</column-name><column-value><![CDATA[");
		sb.append(getFieldName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fieldAlterName</column-name><column-value><![CDATA[");
		sb.append(getFieldAlterName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fieldDescription</column-name><column-value><![CDATA[");
		sb.append(getFieldDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fieldDataSet</column-name><column-value><![CDATA[");
		sb.append(getFieldDataSet());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _entity;
	private String _fieldCode;
	private String _fieldName;
	private String _fieldAlterName;
	private String _fieldDescription;
	private String _fieldDataSet;
	private BaseModel<?> _dmMetaDataRemoteModel;
}