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

package vn.dtt.duongbo.dao.nghiepvu.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbo.dao.nghiepvu.service.ClpSerializer;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinHoSoNoiDiaLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author NhanNc
 */
public class QlvtThongTinHoSoNoiDiaClp extends BaseModelImpl<QlvtThongTinHoSoNoiDia>
	implements QlvtThongTinHoSoNoiDia {
	public QlvtThongTinHoSoNoiDiaClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtThongTinHoSoNoiDia.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtThongTinHoSoNoiDia.class.getName();
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
		attributes.put("thongtinHoSoId", getThongtinHoSoId());
		attributes.put("noiDiaId", getNoiDiaId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long thongtinHoSoId = (Long)attributes.get("thongtinHoSoId");

		if (thongtinHoSoId != null) {
			setThongtinHoSoId(thongtinHoSoId);
		}

		Long noiDiaId = (Long)attributes.get("noiDiaId");

		if (noiDiaId != null) {
			setNoiDiaId(noiDiaId);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_qlvtThongTinHoSoNoiDiaRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoNoiDiaRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_qlvtThongTinHoSoNoiDiaRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getThongtinHoSoId() {
		return _thongtinHoSoId;
	}

	@Override
	public void setThongtinHoSoId(long thongtinHoSoId) {
		_thongtinHoSoId = thongtinHoSoId;

		if (_qlvtThongTinHoSoNoiDiaRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoNoiDiaRemoteModel.getClass();

				Method method = clazz.getMethod("setThongtinHoSoId", long.class);

				method.invoke(_qlvtThongTinHoSoNoiDiaRemoteModel, thongtinHoSoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNoiDiaId() {
		return _noiDiaId;
	}

	@Override
	public void setNoiDiaId(long noiDiaId) {
		_noiDiaId = noiDiaId;

		if (_qlvtThongTinHoSoNoiDiaRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoNoiDiaRemoteModel.getClass();

				Method method = clazz.getMethod("setNoiDiaId", long.class);

				method.invoke(_qlvtThongTinHoSoNoiDiaRemoteModel, noiDiaId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQlvtThongTinHoSoNoiDiaRemoteModel() {
		return _qlvtThongTinHoSoNoiDiaRemoteModel;
	}

	public void setQlvtThongTinHoSoNoiDiaRemoteModel(
		BaseModel<?> qlvtThongTinHoSoNoiDiaRemoteModel) {
		_qlvtThongTinHoSoNoiDiaRemoteModel = qlvtThongTinHoSoNoiDiaRemoteModel;
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

		Class<?> remoteModelClass = _qlvtThongTinHoSoNoiDiaRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtThongTinHoSoNoiDiaRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtThongTinHoSoNoiDiaLocalServiceUtil.addQlvtThongTinHoSoNoiDia(this);
		}
		else {
			QlvtThongTinHoSoNoiDiaLocalServiceUtil.updateQlvtThongTinHoSoNoiDia(this);
		}
	}

	@Override
	public QlvtThongTinHoSoNoiDia toEscapedModel() {
		return (QlvtThongTinHoSoNoiDia)ProxyUtil.newProxyInstance(QlvtThongTinHoSoNoiDia.class.getClassLoader(),
			new Class[] { QlvtThongTinHoSoNoiDia.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QlvtThongTinHoSoNoiDiaClp clone = new QlvtThongTinHoSoNoiDiaClp();

		clone.setId(getId());
		clone.setThongtinHoSoId(getThongtinHoSoId());
		clone.setNoiDiaId(getNoiDiaId());

		return clone;
	}

	@Override
	public int compareTo(QlvtThongTinHoSoNoiDia qlvtThongTinHoSoNoiDia) {
		int value = 0;

		if (getId() < qlvtThongTinHoSoNoiDia.getId()) {
			value = -1;
		}
		else if (getId() > qlvtThongTinHoSoNoiDia.getId()) {
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

		if (!(obj instanceof QlvtThongTinHoSoNoiDiaClp)) {
			return false;
		}

		QlvtThongTinHoSoNoiDiaClp qlvtThongTinHoSoNoiDia = (QlvtThongTinHoSoNoiDiaClp)obj;

		long primaryKey = qlvtThongTinHoSoNoiDia.getPrimaryKey();

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
		sb.append(", thongtinHoSoId=");
		sb.append(getThongtinHoSoId());
		sb.append(", noiDiaId=");
		sb.append(getNoiDiaId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoNoiDia");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thongtinHoSoId</column-name><column-value><![CDATA[");
		sb.append(getThongtinHoSoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>noiDiaId</column-name><column-value><![CDATA[");
		sb.append(getNoiDiaId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _thongtinHoSoId;
	private long _noiDiaId;
	private BaseModel<?> _qlvtThongTinHoSoNoiDiaRemoteModel;
}