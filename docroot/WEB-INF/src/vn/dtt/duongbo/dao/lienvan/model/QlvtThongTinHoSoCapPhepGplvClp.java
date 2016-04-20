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

package vn.dtt.duongbo.dao.lienvan.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbo.dao.lienvan.service.ClpSerializer;
import vn.dtt.duongbo.dao.lienvan.service.QlvtThongTinHoSoCapPhepGplvLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author NhanNc
 */
public class QlvtThongTinHoSoCapPhepGplvClp extends BaseModelImpl<QlvtThongTinHoSoCapPhepGplv>
	implements QlvtThongTinHoSoCapPhepGplv {
	public QlvtThongTinHoSoCapPhepGplvClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtThongTinHoSoCapPhepGplv.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtThongTinHoSoCapPhepGplv.class.getName();
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
		attributes.put("thongtinhosoId", getThongtinhosoId());
		attributes.put("capphepGplienvanId", getCapphepGplienvanId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long thongtinhosoId = (Long)attributes.get("thongtinhosoId");

		if (thongtinhosoId != null) {
			setThongtinhosoId(thongtinhosoId);
		}

		Long capphepGplienvanId = (Long)attributes.get("capphepGplienvanId");

		if (capphepGplienvanId != null) {
			setCapphepGplienvanId(capphepGplienvanId);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_qlvtThongTinHoSoCapPhepGplvRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoCapPhepGplvRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_qlvtThongTinHoSoCapPhepGplvRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getThongtinhosoId() {
		return _thongtinhosoId;
	}

	@Override
	public void setThongtinhosoId(long thongtinhosoId) {
		_thongtinhosoId = thongtinhosoId;

		if (_qlvtThongTinHoSoCapPhepGplvRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoCapPhepGplvRemoteModel.getClass();

				Method method = clazz.getMethod("setThongtinhosoId", long.class);

				method.invoke(_qlvtThongTinHoSoCapPhepGplvRemoteModel,
					thongtinhosoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCapphepGplienvanId() {
		return _capphepGplienvanId;
	}

	@Override
	public void setCapphepGplienvanId(long capphepGplienvanId) {
		_capphepGplienvanId = capphepGplienvanId;

		if (_qlvtThongTinHoSoCapPhepGplvRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoCapPhepGplvRemoteModel.getClass();

				Method method = clazz.getMethod("setCapphepGplienvanId",
						long.class);

				method.invoke(_qlvtThongTinHoSoCapPhepGplvRemoteModel,
					capphepGplienvanId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQlvtThongTinHoSoCapPhepGplvRemoteModel() {
		return _qlvtThongTinHoSoCapPhepGplvRemoteModel;
	}

	public void setQlvtThongTinHoSoCapPhepGplvRemoteModel(
		BaseModel<?> qlvtThongTinHoSoCapPhepGplvRemoteModel) {
		_qlvtThongTinHoSoCapPhepGplvRemoteModel = qlvtThongTinHoSoCapPhepGplvRemoteModel;
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

		Class<?> remoteModelClass = _qlvtThongTinHoSoCapPhepGplvRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtThongTinHoSoCapPhepGplvRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtThongTinHoSoCapPhepGplvLocalServiceUtil.addQlvtThongTinHoSoCapPhepGplv(this);
		}
		else {
			QlvtThongTinHoSoCapPhepGplvLocalServiceUtil.updateQlvtThongTinHoSoCapPhepGplv(this);
		}
	}

	@Override
	public QlvtThongTinHoSoCapPhepGplv toEscapedModel() {
		return (QlvtThongTinHoSoCapPhepGplv)ProxyUtil.newProxyInstance(QlvtThongTinHoSoCapPhepGplv.class.getClassLoader(),
			new Class[] { QlvtThongTinHoSoCapPhepGplv.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QlvtThongTinHoSoCapPhepGplvClp clone = new QlvtThongTinHoSoCapPhepGplvClp();

		clone.setId(getId());
		clone.setThongtinhosoId(getThongtinhosoId());
		clone.setCapphepGplienvanId(getCapphepGplienvanId());

		return clone;
	}

	@Override
	public int compareTo(
		QlvtThongTinHoSoCapPhepGplv qlvtThongTinHoSoCapPhepGplv) {
		int value = 0;

		if (getId() < qlvtThongTinHoSoCapPhepGplv.getId()) {
			value = -1;
		}
		else if (getId() > qlvtThongTinHoSoCapPhepGplv.getId()) {
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

		if (!(obj instanceof QlvtThongTinHoSoCapPhepGplvClp)) {
			return false;
		}

		QlvtThongTinHoSoCapPhepGplvClp qlvtThongTinHoSoCapPhepGplv = (QlvtThongTinHoSoCapPhepGplvClp)obj;

		long primaryKey = qlvtThongTinHoSoCapPhepGplv.getPrimaryKey();

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
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", thongtinhosoId=");
		sb.append(getThongtinhosoId());
		sb.append(", capphepGplienvanId=");
		sb.append(getCapphepGplienvanId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append(
			"vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoCapPhepGplv");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thongtinhosoId</column-name><column-value><![CDATA[");
		sb.append(getThongtinhosoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>capphepGplienvanId</column-name><column-value><![CDATA[");
		sb.append(getCapphepGplienvanId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _thongtinhosoId;
	private long _capphepGplienvanId;
	private BaseModel<?> _qlvtThongTinHoSoCapPhepGplvRemoteModel;
}