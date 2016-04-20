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
import vn.dtt.duongbo.dao.lienvan.service.QlvtCapPhepGplvLoaiHinhVanTaiLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author NhanNc
 */
public class QlvtCapPhepGplvLoaiHinhVanTaiClp extends BaseModelImpl<QlvtCapPhepGplvLoaiHinhVanTai>
	implements QlvtCapPhepGplvLoaiHinhVanTai {
	public QlvtCapPhepGplvLoaiHinhVanTaiClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtCapPhepGplvLoaiHinhVanTai.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtCapPhepGplvLoaiHinhVanTai.class.getName();
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
		attributes.put("gpLienVanId", getGpLienVanId());
		attributes.put("maLoaiHinhVanTai", getMaLoaiHinhVanTai());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long gpLienVanId = (Long)attributes.get("gpLienVanId");

		if (gpLienVanId != null) {
			setGpLienVanId(gpLienVanId);
		}

		String maLoaiHinhVanTai = (String)attributes.get("maLoaiHinhVanTai");

		if (maLoaiHinhVanTai != null) {
			setMaLoaiHinhVanTai(maLoaiHinhVanTai);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_qlvtCapPhepGplvLoaiHinhVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGplvLoaiHinhVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_qlvtCapPhepGplvLoaiHinhVanTaiRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGpLienVanId() {
		return _gpLienVanId;
	}

	@Override
	public void setGpLienVanId(long gpLienVanId) {
		_gpLienVanId = gpLienVanId;

		if (_qlvtCapPhepGplvLoaiHinhVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGplvLoaiHinhVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setGpLienVanId", long.class);

				method.invoke(_qlvtCapPhepGplvLoaiHinhVanTaiRemoteModel,
					gpLienVanId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaLoaiHinhVanTai() {
		return _maLoaiHinhVanTai;
	}

	@Override
	public void setMaLoaiHinhVanTai(String maLoaiHinhVanTai) {
		_maLoaiHinhVanTai = maLoaiHinhVanTai;

		if (_qlvtCapPhepGplvLoaiHinhVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGplvLoaiHinhVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setMaLoaiHinhVanTai",
						String.class);

				method.invoke(_qlvtCapPhepGplvLoaiHinhVanTaiRemoteModel,
					maLoaiHinhVanTai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQlvtCapPhepGplvLoaiHinhVanTaiRemoteModel() {
		return _qlvtCapPhepGplvLoaiHinhVanTaiRemoteModel;
	}

	public void setQlvtCapPhepGplvLoaiHinhVanTaiRemoteModel(
		BaseModel<?> qlvtCapPhepGplvLoaiHinhVanTaiRemoteModel) {
		_qlvtCapPhepGplvLoaiHinhVanTaiRemoteModel = qlvtCapPhepGplvLoaiHinhVanTaiRemoteModel;
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

		Class<?> remoteModelClass = _qlvtCapPhepGplvLoaiHinhVanTaiRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtCapPhepGplvLoaiHinhVanTaiRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtCapPhepGplvLoaiHinhVanTaiLocalServiceUtil.addQlvtCapPhepGplvLoaiHinhVanTai(this);
		}
		else {
			QlvtCapPhepGplvLoaiHinhVanTaiLocalServiceUtil.updateQlvtCapPhepGplvLoaiHinhVanTai(this);
		}
	}

	@Override
	public QlvtCapPhepGplvLoaiHinhVanTai toEscapedModel() {
		return (QlvtCapPhepGplvLoaiHinhVanTai)ProxyUtil.newProxyInstance(QlvtCapPhepGplvLoaiHinhVanTai.class.getClassLoader(),
			new Class[] { QlvtCapPhepGplvLoaiHinhVanTai.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QlvtCapPhepGplvLoaiHinhVanTaiClp clone = new QlvtCapPhepGplvLoaiHinhVanTaiClp();

		clone.setId(getId());
		clone.setGpLienVanId(getGpLienVanId());
		clone.setMaLoaiHinhVanTai(getMaLoaiHinhVanTai());

		return clone;
	}

	@Override
	public int compareTo(
		QlvtCapPhepGplvLoaiHinhVanTai qlvtCapPhepGplvLoaiHinhVanTai) {
		int value = 0;

		if (getId() < qlvtCapPhepGplvLoaiHinhVanTai.getId()) {
			value = -1;
		}
		else if (getId() > qlvtCapPhepGplvLoaiHinhVanTai.getId()) {
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

		if (!(obj instanceof QlvtCapPhepGplvLoaiHinhVanTaiClp)) {
			return false;
		}

		QlvtCapPhepGplvLoaiHinhVanTaiClp qlvtCapPhepGplvLoaiHinhVanTai = (QlvtCapPhepGplvLoaiHinhVanTaiClp)obj;

		long primaryKey = qlvtCapPhepGplvLoaiHinhVanTai.getPrimaryKey();

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
		sb.append(", gpLienVanId=");
		sb.append(getGpLienVanId());
		sb.append(", maLoaiHinhVanTai=");
		sb.append(getMaLoaiHinhVanTai());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append(
			"vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvLoaiHinhVanTai");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gpLienVanId</column-name><column-value><![CDATA[");
		sb.append(getGpLienVanId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maLoaiHinhVanTai</column-name><column-value><![CDATA[");
		sb.append(getMaLoaiHinhVanTai());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _gpLienVanId;
	private String _maLoaiHinhVanTai;
	private BaseModel<?> _qlvtCapPhepGplvLoaiHinhVanTaiRemoteModel;
}