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
import vn.dtt.duongbo.dao.lienvan.service.QlvtThongTinHoSoGiayPhepVanTaiLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author NhanNc
 */
public class QlvtThongTinHoSoGiayPhepVanTaiClp extends BaseModelImpl<QlvtThongTinHoSoGiayPhepVanTai>
	implements QlvtThongTinHoSoGiayPhepVanTai {
	public QlvtThongTinHoSoGiayPhepVanTaiClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtThongTinHoSoGiayPhepVanTai.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtThongTinHoSoGiayPhepVanTai.class.getName();
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
		attributes.put("capphepGpkdvtId", getCapphepGpkdvtId());

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

		Long capphepGpkdvtId = (Long)attributes.get("capphepGpkdvtId");

		if (capphepGpkdvtId != null) {
			setCapphepGpkdvtId(capphepGpkdvtId);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_qlvtThongTinHoSoGiayPhepVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoGiayPhepVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_qlvtThongTinHoSoGiayPhepVanTaiRemoteModel, id);
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

		if (_qlvtThongTinHoSoGiayPhepVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoGiayPhepVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setThongtinhosoId", long.class);

				method.invoke(_qlvtThongTinHoSoGiayPhepVanTaiRemoteModel,
					thongtinhosoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCapphepGpkdvtId() {
		return _capphepGpkdvtId;
	}

	@Override
	public void setCapphepGpkdvtId(long capphepGpkdvtId) {
		_capphepGpkdvtId = capphepGpkdvtId;

		if (_qlvtThongTinHoSoGiayPhepVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoGiayPhepVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setCapphepGpkdvtId", long.class);

				method.invoke(_qlvtThongTinHoSoGiayPhepVanTaiRemoteModel,
					capphepGpkdvtId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQlvtThongTinHoSoGiayPhepVanTaiRemoteModel() {
		return _qlvtThongTinHoSoGiayPhepVanTaiRemoteModel;
	}

	public void setQlvtThongTinHoSoGiayPhepVanTaiRemoteModel(
		BaseModel<?> qlvtThongTinHoSoGiayPhepVanTaiRemoteModel) {
		_qlvtThongTinHoSoGiayPhepVanTaiRemoteModel = qlvtThongTinHoSoGiayPhepVanTaiRemoteModel;
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

		Class<?> remoteModelClass = _qlvtThongTinHoSoGiayPhepVanTaiRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtThongTinHoSoGiayPhepVanTaiRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtThongTinHoSoGiayPhepVanTaiLocalServiceUtil.addQlvtThongTinHoSoGiayPhepVanTai(this);
		}
		else {
			QlvtThongTinHoSoGiayPhepVanTaiLocalServiceUtil.updateQlvtThongTinHoSoGiayPhepVanTai(this);
		}
	}

	@Override
	public QlvtThongTinHoSoGiayPhepVanTai toEscapedModel() {
		return (QlvtThongTinHoSoGiayPhepVanTai)ProxyUtil.newProxyInstance(QlvtThongTinHoSoGiayPhepVanTai.class.getClassLoader(),
			new Class[] { QlvtThongTinHoSoGiayPhepVanTai.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QlvtThongTinHoSoGiayPhepVanTaiClp clone = new QlvtThongTinHoSoGiayPhepVanTaiClp();

		clone.setId(getId());
		clone.setThongtinhosoId(getThongtinhosoId());
		clone.setCapphepGpkdvtId(getCapphepGpkdvtId());

		return clone;
	}

	@Override
	public int compareTo(
		QlvtThongTinHoSoGiayPhepVanTai qlvtThongTinHoSoGiayPhepVanTai) {
		int value = 0;

		if (getId() < qlvtThongTinHoSoGiayPhepVanTai.getId()) {
			value = -1;
		}
		else if (getId() > qlvtThongTinHoSoGiayPhepVanTai.getId()) {
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

		if (!(obj instanceof QlvtThongTinHoSoGiayPhepVanTaiClp)) {
			return false;
		}

		QlvtThongTinHoSoGiayPhepVanTaiClp qlvtThongTinHoSoGiayPhepVanTai = (QlvtThongTinHoSoGiayPhepVanTaiClp)obj;

		long primaryKey = qlvtThongTinHoSoGiayPhepVanTai.getPrimaryKey();

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
		sb.append(", capphepGpkdvtId=");
		sb.append(getCapphepGpkdvtId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append(
			"vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTai");
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
			"<column><column-name>capphepGpkdvtId</column-name><column-value><![CDATA[");
		sb.append(getCapphepGpkdvtId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _thongtinhosoId;
	private long _capphepGpkdvtId;
	private BaseModel<?> _qlvtThongTinHoSoGiayPhepVanTaiRemoteModel;
}