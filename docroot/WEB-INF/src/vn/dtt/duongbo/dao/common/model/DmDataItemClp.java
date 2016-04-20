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
import vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class DmDataItemClp extends BaseModelImpl<DmDataItem>
	implements DmDataItem {
	public DmDataItemClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DmDataItem.class;
	}

	@Override
	public String getModelClassName() {
		return DmDataItem.class.getName();
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
		attributes.put("dataGroupId", getDataGroupId());
		attributes.put("code", getCode());
		attributes.put("node1", getNode1());
		attributes.put("node2", getNode2());
		attributes.put("node3", getNode3());
		attributes.put("node4", getNode4());
		attributes.put("level", getLevel());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("validatedFrom", getValidatedFrom());
		attributes.put("validatedTo", getValidatedTo());
		attributes.put("status", getStatus());
		attributes.put("order", getOrder());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long dataGroupId = (Long)attributes.get("dataGroupId");

		if (dataGroupId != null) {
			setDataGroupId(dataGroupId);
		}

		String code = (String)attributes.get("code");

		if (code != null) {
			setCode(code);
		}

		String node1 = (String)attributes.get("node1");

		if (node1 != null) {
			setNode1(node1);
		}

		String node2 = (String)attributes.get("node2");

		if (node2 != null) {
			setNode2(node2);
		}

		String node3 = (String)attributes.get("node3");

		if (node3 != null) {
			setNode3(node3);
		}

		String node4 = (String)attributes.get("node4");

		if (node4 != null) {
			setNode4(node4);
		}

		Integer level = (Integer)attributes.get("level");

		if (level != null) {
			setLevel(level);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String validatedFrom = (String)attributes.get("validatedFrom");

		if (validatedFrom != null) {
			setValidatedFrom(validatedFrom);
		}

		String validatedTo = (String)attributes.get("validatedTo");

		if (validatedTo != null) {
			setValidatedTo(validatedTo);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Integer order = (Integer)attributes.get("order");

		if (order != null) {
			setOrder(order);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_dmDataItemRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataItemRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_dmDataItemRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDataGroupId() {
		return _dataGroupId;
	}

	@Override
	public void setDataGroupId(long dataGroupId) {
		_dataGroupId = dataGroupId;

		if (_dmDataItemRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataItemRemoteModel.getClass();

				Method method = clazz.getMethod("setDataGroupId", long.class);

				method.invoke(_dmDataItemRemoteModel, dataGroupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCode() {
		return _code;
	}

	@Override
	public void setCode(String code) {
		_code = code;

		if (_dmDataItemRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataItemRemoteModel.getClass();

				Method method = clazz.getMethod("setCode", String.class);

				method.invoke(_dmDataItemRemoteModel, code);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNode1() {
		return _node1;
	}

	@Override
	public void setNode1(String node1) {
		_node1 = node1;

		if (_dmDataItemRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataItemRemoteModel.getClass();

				Method method = clazz.getMethod("setNode1", String.class);

				method.invoke(_dmDataItemRemoteModel, node1);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNode2() {
		return _node2;
	}

	@Override
	public void setNode2(String node2) {
		_node2 = node2;

		if (_dmDataItemRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataItemRemoteModel.getClass();

				Method method = clazz.getMethod("setNode2", String.class);

				method.invoke(_dmDataItemRemoteModel, node2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNode3() {
		return _node3;
	}

	@Override
	public void setNode3(String node3) {
		_node3 = node3;

		if (_dmDataItemRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataItemRemoteModel.getClass();

				Method method = clazz.getMethod("setNode3", String.class);

				method.invoke(_dmDataItemRemoteModel, node3);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNode4() {
		return _node4;
	}

	@Override
	public void setNode4(String node4) {
		_node4 = node4;

		if (_dmDataItemRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataItemRemoteModel.getClass();

				Method method = clazz.getMethod("setNode4", String.class);

				method.invoke(_dmDataItemRemoteModel, node4);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLevel() {
		return _level;
	}

	@Override
	public void setLevel(int level) {
		_level = level;

		if (_dmDataItemRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataItemRemoteModel.getClass();

				Method method = clazz.getMethod("setLevel", int.class);

				method.invoke(_dmDataItemRemoteModel, level);
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

		if (_dmDataItemRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataItemRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_dmDataItemRemoteModel, name);
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

		if (_dmDataItemRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataItemRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_dmDataItemRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getValidatedFrom() {
		return _validatedFrom;
	}

	@Override
	public void setValidatedFrom(String validatedFrom) {
		_validatedFrom = validatedFrom;

		if (_dmDataItemRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataItemRemoteModel.getClass();

				Method method = clazz.getMethod("setValidatedFrom", String.class);

				method.invoke(_dmDataItemRemoteModel, validatedFrom);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getValidatedTo() {
		return _validatedTo;
	}

	@Override
	public void setValidatedTo(String validatedTo) {
		_validatedTo = validatedTo;

		if (_dmDataItemRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataItemRemoteModel.getClass();

				Method method = clazz.getMethod("setValidatedTo", String.class);

				method.invoke(_dmDataItemRemoteModel, validatedTo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_status = status;

		if (_dmDataItemRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataItemRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", int.class);

				method.invoke(_dmDataItemRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getOrder() {
		return _order;
	}

	@Override
	public void setOrder(int order) {
		_order = order;

		if (_dmDataItemRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataItemRemoteModel.getClass();

				Method method = clazz.getMethod("setOrder", int.class);

				method.invoke(_dmDataItemRemoteModel, order);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDmDataItemRemoteModel() {
		return _dmDataItemRemoteModel;
	}

	public void setDmDataItemRemoteModel(BaseModel<?> dmDataItemRemoteModel) {
		_dmDataItemRemoteModel = dmDataItemRemoteModel;
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

		Class<?> remoteModelClass = _dmDataItemRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dmDataItemRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DmDataItemLocalServiceUtil.addDmDataItem(this);
		}
		else {
			DmDataItemLocalServiceUtil.updateDmDataItem(this);
		}
	}

	@Override
	public DmDataItem toEscapedModel() {
		return (DmDataItem)ProxyUtil.newProxyInstance(DmDataItem.class.getClassLoader(),
			new Class[] { DmDataItem.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmDataItemClp clone = new DmDataItemClp();

		clone.setId(getId());
		clone.setDataGroupId(getDataGroupId());
		clone.setCode(getCode());
		clone.setNode1(getNode1());
		clone.setNode2(getNode2());
		clone.setNode3(getNode3());
		clone.setNode4(getNode4());
		clone.setLevel(getLevel());
		clone.setName(getName());
		clone.setDescription(getDescription());
		clone.setValidatedFrom(getValidatedFrom());
		clone.setValidatedTo(getValidatedTo());
		clone.setStatus(getStatus());
		clone.setOrder(getOrder());

		return clone;
	}

	@Override
	public int compareTo(DmDataItem dmDataItem) {
		int value = 0;

		if (getId() < dmDataItem.getId()) {
			value = -1;
		}
		else if (getId() > dmDataItem.getId()) {
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

		if (!(obj instanceof DmDataItemClp)) {
			return false;
		}

		DmDataItemClp dmDataItem = (DmDataItemClp)obj;

		long primaryKey = dmDataItem.getPrimaryKey();

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
		StringBundler sb = new StringBundler(29);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", dataGroupId=");
		sb.append(getDataGroupId());
		sb.append(", code=");
		sb.append(getCode());
		sb.append(", node1=");
		sb.append(getNode1());
		sb.append(", node2=");
		sb.append(getNode2());
		sb.append(", node3=");
		sb.append(getNode3());
		sb.append(", node4=");
		sb.append(getNode4());
		sb.append(", level=");
		sb.append(getLevel());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", validatedFrom=");
		sb.append(getValidatedFrom());
		sb.append(", validatedTo=");
		sb.append(getValidatedTo());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", order=");
		sb.append(getOrder());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.common.model.DmDataItem");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dataGroupId</column-name><column-value><![CDATA[");
		sb.append(getDataGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>code</column-name><column-value><![CDATA[");
		sb.append(getCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>node1</column-name><column-value><![CDATA[");
		sb.append(getNode1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>node2</column-name><column-value><![CDATA[");
		sb.append(getNode2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>node3</column-name><column-value><![CDATA[");
		sb.append(getNode3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>node4</column-name><column-value><![CDATA[");
		sb.append(getNode4());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>level</column-name><column-value><![CDATA[");
		sb.append(getLevel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>validatedFrom</column-name><column-value><![CDATA[");
		sb.append(getValidatedFrom());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>validatedTo</column-name><column-value><![CDATA[");
		sb.append(getValidatedTo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>order</column-name><column-value><![CDATA[");
		sb.append(getOrder());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _dataGroupId;
	private String _code;
	private String _node1;
	private String _node2;
	private String _node3;
	private String _node4;
	private int _level;
	private String _name;
	private String _description;
	private String _validatedFrom;
	private String _validatedTo;
	private int _status;
	private int _order;
	private BaseModel<?> _dmDataItemRemoteModel;
}