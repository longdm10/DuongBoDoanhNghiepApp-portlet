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
import vn.dtt.duongbien.dao.vrcb.service.ModifyLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class ModifyClp extends BaseModelImpl<Modify> implements Modify {
	public ModifyClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Modify.class;
	}

	@Override
	public String getModelClassName() {
		return Modify.class.getName();
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
		attributes.put("modifyCode", getModifyCode());
		attributes.put("modifyDesc", getModifyDesc());
		attributes.put("organization", getOrganization());
		attributes.put("division", getDivision());
		attributes.put("name", getName());
		attributes.put("modifyDate", getModifyDate());
		attributes.put("documentName", getDocumentName());
		attributes.put("documentYear", getDocumentYear());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String modifyCode = (String)attributes.get("modifyCode");

		if (modifyCode != null) {
			setModifyCode(modifyCode);
		}

		String modifyDesc = (String)attributes.get("modifyDesc");

		if (modifyDesc != null) {
			setModifyDesc(modifyDesc);
		}

		String organization = (String)attributes.get("organization");

		if (organization != null) {
			setOrganization(organization);
		}

		String division = (String)attributes.get("division");

		if (division != null) {
			setDivision(division);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Date modifyDate = (Date)attributes.get("modifyDate");

		if (modifyDate != null) {
			setModifyDate(modifyDate);
		}

		Long documentName = (Long)attributes.get("documentName");

		if (documentName != null) {
			setDocumentName(documentName);
		}

		Long documentYear = (Long)attributes.get("documentYear");

		if (documentYear != null) {
			setDocumentYear(documentYear);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_modifyRemoteModel != null) {
			try {
				Class<?> clazz = _modifyRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_modifyRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getModifyCode() {
		return _modifyCode;
	}

	@Override
	public void setModifyCode(String modifyCode) {
		_modifyCode = modifyCode;

		if (_modifyRemoteModel != null) {
			try {
				Class<?> clazz = _modifyRemoteModel.getClass();

				Method method = clazz.getMethod("setModifyCode", String.class);

				method.invoke(_modifyRemoteModel, modifyCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getModifyDesc() {
		return _modifyDesc;
	}

	@Override
	public void setModifyDesc(String modifyDesc) {
		_modifyDesc = modifyDesc;

		if (_modifyRemoteModel != null) {
			try {
				Class<?> clazz = _modifyRemoteModel.getClass();

				Method method = clazz.getMethod("setModifyDesc", String.class);

				method.invoke(_modifyRemoteModel, modifyDesc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOrganization() {
		return _organization;
	}

	@Override
	public void setOrganization(String organization) {
		_organization = organization;

		if (_modifyRemoteModel != null) {
			try {
				Class<?> clazz = _modifyRemoteModel.getClass();

				Method method = clazz.getMethod("setOrganization", String.class);

				method.invoke(_modifyRemoteModel, organization);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDivision() {
		return _division;
	}

	@Override
	public void setDivision(String division) {
		_division = division;

		if (_modifyRemoteModel != null) {
			try {
				Class<?> clazz = _modifyRemoteModel.getClass();

				Method method = clazz.getMethod("setDivision", String.class);

				method.invoke(_modifyRemoteModel, division);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_modifyRemoteModel != null) {
			try {
				Class<?> clazz = _modifyRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_modifyRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifyDate() {
		return _modifyDate;
	}

	@Override
	public void setModifyDate(Date modifyDate) {
		_modifyDate = modifyDate;

		if (_modifyRemoteModel != null) {
			try {
				Class<?> clazz = _modifyRemoteModel.getClass();

				Method method = clazz.getMethod("setModifyDate", Date.class);

				method.invoke(_modifyRemoteModel, modifyDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDocumentName() {
		return _documentName;
	}

	@Override
	public void setDocumentName(long documentName) {
		_documentName = documentName;

		if (_modifyRemoteModel != null) {
			try {
				Class<?> clazz = _modifyRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentName", long.class);

				method.invoke(_modifyRemoteModel, documentName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDocumentYear() {
		return _documentYear;
	}

	@Override
	public void setDocumentYear(long documentYear) {
		_documentYear = documentYear;

		if (_modifyRemoteModel != null) {
			try {
				Class<?> clazz = _modifyRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentYear", long.class);

				method.invoke(_modifyRemoteModel, documentYear);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getModifyRemoteModel() {
		return _modifyRemoteModel;
	}

	public void setModifyRemoteModel(BaseModel<?> modifyRemoteModel) {
		_modifyRemoteModel = modifyRemoteModel;
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

		Class<?> remoteModelClass = _modifyRemoteModel.getClass();

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

		Object returnValue = method.invoke(_modifyRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ModifyLocalServiceUtil.addModify(this);
		}
		else {
			ModifyLocalServiceUtil.updateModify(this);
		}
	}

	@Override
	public Modify toEscapedModel() {
		return (Modify)ProxyUtil.newProxyInstance(Modify.class.getClassLoader(),
			new Class[] { Modify.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ModifyClp clone = new ModifyClp();

		clone.setId(getId());
		clone.setModifyCode(getModifyCode());
		clone.setModifyDesc(getModifyDesc());
		clone.setOrganization(getOrganization());
		clone.setDivision(getDivision());
		clone.setName(getName());
		clone.setModifyDate(getModifyDate());
		clone.setDocumentName(getDocumentName());
		clone.setDocumentYear(getDocumentYear());

		return clone;
	}

	@Override
	public int compareTo(Modify modify) {
		int value = 0;

		if (getId() < modify.getId()) {
			value = -1;
		}
		else if (getId() > modify.getId()) {
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

		if (!(obj instanceof ModifyClp)) {
			return false;
		}

		ModifyClp modify = (ModifyClp)obj;

		long primaryKey = modify.getPrimaryKey();

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
		sb.append(", modifyCode=");
		sb.append(getModifyCode());
		sb.append(", modifyDesc=");
		sb.append(getModifyDesc());
		sb.append(", organization=");
		sb.append(getOrganization());
		sb.append(", division=");
		sb.append(getDivision());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", modifyDate=");
		sb.append(getModifyDate());
		sb.append(", documentName=");
		sb.append(getDocumentName());
		sb.append(", documentYear=");
		sb.append(getDocumentYear());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.Modify");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifyCode</column-name><column-value><![CDATA[");
		sb.append(getModifyCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifyDesc</column-name><column-value><![CDATA[");
		sb.append(getModifyDesc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organization</column-name><column-value><![CDATA[");
		sb.append(getOrganization());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>division</column-name><column-value><![CDATA[");
		sb.append(getDivision());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifyDate</column-name><column-value><![CDATA[");
		sb.append(getModifyDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentName</column-name><column-value><![CDATA[");
		sb.append(getDocumentName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentYear</column-name><column-value><![CDATA[");
		sb.append(getDocumentYear());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _modifyCode;
	private String _modifyDesc;
	private String _organization;
	private String _division;
	private String _name;
	private Date _modifyDate;
	private long _documentName;
	private long _documentYear;
	private BaseModel<?> _modifyRemoteModel;
}