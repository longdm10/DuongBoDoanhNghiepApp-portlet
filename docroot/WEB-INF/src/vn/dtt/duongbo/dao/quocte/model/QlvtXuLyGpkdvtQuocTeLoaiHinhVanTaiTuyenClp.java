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

package vn.dtt.duongbo.dao.quocte.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbo.dao.quocte.service.ClpSerializer;
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author NoiPham
 */
public class QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenClp extends BaseModelImpl<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen>
	implements QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen {
	public QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.class.getName();
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
		attributes.put("gpkdLoaiHinhKdId", getGpkdLoaiHinhKdId());
		attributes.put("maTuyen", getMaTuyen());
		attributes.put("tenTuyen", getTenTuyen());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer gpkdLoaiHinhKdId = (Integer)attributes.get("gpkdLoaiHinhKdId");

		if (gpkdLoaiHinhKdId != null) {
			setGpkdLoaiHinhKdId(gpkdLoaiHinhKdId);
		}

		String maTuyen = (String)attributes.get("maTuyen");

		if (maTuyen != null) {
			setMaTuyen(maTuyen);
		}

		String tenTuyen = (String)attributes.get("tenTuyen");

		if (tenTuyen != null) {
			setTenTuyen(tenTuyen);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenRemoteModel,
					id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getGpkdLoaiHinhKdId() {
		return _gpkdLoaiHinhKdId;
	}

	@Override
	public void setGpkdLoaiHinhKdId(int gpkdLoaiHinhKdId) {
		_gpkdLoaiHinhKdId = gpkdLoaiHinhKdId;

		if (_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenRemoteModel.getClass();

				Method method = clazz.getMethod("setGpkdLoaiHinhKdId", int.class);

				method.invoke(_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenRemoteModel,
					gpkdLoaiHinhKdId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaTuyen() {
		return _maTuyen;
	}

	@Override
	public void setMaTuyen(String maTuyen) {
		_maTuyen = maTuyen;

		if (_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenRemoteModel.getClass();

				Method method = clazz.getMethod("setMaTuyen", String.class);

				method.invoke(_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenRemoteModel,
					maTuyen);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenTuyen() {
		return _tenTuyen;
	}

	@Override
	public void setTenTuyen(String tenTuyen) {
		_tenTuyen = tenTuyen;

		if (_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenRemoteModel.getClass();

				Method method = clazz.getMethod("setTenTuyen", String.class);

				method.invoke(_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenRemoteModel,
					tenTuyen);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenRemoteModel() {
		return _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenRemoteModel;
	}

	public void setQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenRemoteModel(
		BaseModel<?> qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenRemoteModel) {
		_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenRemoteModel = qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenRemoteModel;
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

		Class<?> remoteModelClass = _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenLocalServiceUtil.addQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen(this);
		}
		else {
			QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenLocalServiceUtil.updateQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen(this);
		}
	}

	@Override
	public QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen toEscapedModel() {
		return (QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen)ProxyUtil.newProxyInstance(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.class.getClassLoader(),
			new Class[] { QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenClp clone = new QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenClp();

		clone.setId(getId());
		clone.setGpkdLoaiHinhKdId(getGpkdLoaiHinhKdId());
		clone.setMaTuyen(getMaTuyen());
		clone.setTenTuyen(getTenTuyen());

		return clone;
	}

	@Override
	public int compareTo(
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen) {
		int value = 0;

		if (getId() < qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.getId()) {
			value = -1;
		}
		else if (getId() > qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.getId()) {
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

		if (!(obj instanceof QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenClp)) {
			return false;
		}

		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenClp qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen =
			(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenClp)obj;

		long primaryKey = qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", gpkdLoaiHinhKdId=");
		sb.append(getGpkdLoaiHinhKdId());
		sb.append(", maTuyen=");
		sb.append(getMaTuyen());
		sb.append(", tenTuyen=");
		sb.append(getTenTuyen());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append(
			"vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gpkdLoaiHinhKdId</column-name><column-value><![CDATA[");
		sb.append(getGpkdLoaiHinhKdId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maTuyen</column-name><column-value><![CDATA[");
		sb.append(getMaTuyen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenTuyen</column-name><column-value><![CDATA[");
		sb.append(getTenTuyen());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private int _gpkdLoaiHinhKdId;
	private String _maTuyen;
	private String _tenTuyen;
	private BaseModel<?> _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbo.dao.quocte.service.ClpSerializer.class;
}