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
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinHoSoLienVanLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author NhanNc
 */
public class QlvtThongTinHoSoLienVanClp extends BaseModelImpl<QlvtThongTinHoSoLienVan>
	implements QlvtThongTinHoSoLienVan {
	public QlvtThongTinHoSoLienVanClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtThongTinHoSoLienVan.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtThongTinHoSoLienVan.class.getName();
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
		attributes.put("gplienvanID", getGplienvanID());

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

		Long gplienvanID = (Long)attributes.get("gplienvanID");

		if (gplienvanID != null) {
			setGplienvanID(gplienvanID);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_qlvtThongTinHoSoLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_qlvtThongTinHoSoLienVanRemoteModel, id);
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

		if (_qlvtThongTinHoSoLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setThongtinHoSoId", long.class);

				method.invoke(_qlvtThongTinHoSoLienVanRemoteModel,
					thongtinHoSoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGplienvanID() {
		return _gplienvanID;
	}

	@Override
	public void setGplienvanID(long gplienvanID) {
		_gplienvanID = gplienvanID;

		if (_qlvtThongTinHoSoLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setGplienvanID", long.class);

				method.invoke(_qlvtThongTinHoSoLienVanRemoteModel, gplienvanID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQlvtThongTinHoSoLienVanRemoteModel() {
		return _qlvtThongTinHoSoLienVanRemoteModel;
	}

	public void setQlvtThongTinHoSoLienVanRemoteModel(
		BaseModel<?> qlvtThongTinHoSoLienVanRemoteModel) {
		_qlvtThongTinHoSoLienVanRemoteModel = qlvtThongTinHoSoLienVanRemoteModel;
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

		Class<?> remoteModelClass = _qlvtThongTinHoSoLienVanRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtThongTinHoSoLienVanRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtThongTinHoSoLienVanLocalServiceUtil.addQlvtThongTinHoSoLienVan(this);
		}
		else {
			QlvtThongTinHoSoLienVanLocalServiceUtil.updateQlvtThongTinHoSoLienVan(this);
		}
	}

	@Override
	public QlvtThongTinHoSoLienVan toEscapedModel() {
		return (QlvtThongTinHoSoLienVan)ProxyUtil.newProxyInstance(QlvtThongTinHoSoLienVan.class.getClassLoader(),
			new Class[] { QlvtThongTinHoSoLienVan.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QlvtThongTinHoSoLienVanClp clone = new QlvtThongTinHoSoLienVanClp();

		clone.setId(getId());
		clone.setThongtinHoSoId(getThongtinHoSoId());
		clone.setGplienvanID(getGplienvanID());

		return clone;
	}

	@Override
	public int compareTo(QlvtThongTinHoSoLienVan qlvtThongTinHoSoLienVan) {
		int value = 0;

		if (getId() < qlvtThongTinHoSoLienVan.getId()) {
			value = -1;
		}
		else if (getId() > qlvtThongTinHoSoLienVan.getId()) {
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

		if (!(obj instanceof QlvtThongTinHoSoLienVanClp)) {
			return false;
		}

		QlvtThongTinHoSoLienVanClp qlvtThongTinHoSoLienVan = (QlvtThongTinHoSoLienVanClp)obj;

		long primaryKey = qlvtThongTinHoSoLienVan.getPrimaryKey();

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
		sb.append(", gplienvanID=");
		sb.append(getGplienvanID());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoLienVan");
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
			"<column><column-name>gplienvanID</column-name><column-value><![CDATA[");
		sb.append(getGplienvanID());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _thongtinHoSoId;
	private long _gplienvanID;
	private BaseModel<?> _qlvtThongTinHoSoLienVanRemoteModel;
}