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
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtTTHCNoiDungThamTraLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author NhanNc
 */
public class QlvtTTHCNoiDungThamTraClp extends BaseModelImpl<QlvtTTHCNoiDungThamTra>
	implements QlvtTTHCNoiDungThamTra {
	public QlvtTTHCNoiDungThamTraClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtTTHCNoiDungThamTra.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtTTHCNoiDungThamTra.class.getName();
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
		attributes.put("maTTHC", getMaTTHC());
		attributes.put("toChucXuLy", getToChucXuLy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String maTTHC = (String)attributes.get("maTTHC");

		if (maTTHC != null) {
			setMaTTHC(maTTHC);
		}

		Integer toChucXuLy = (Integer)attributes.get("toChucXuLy");

		if (toChucXuLy != null) {
			setToChucXuLy(toChucXuLy);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_qlvtTTHCNoiDungThamTraRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtTTHCNoiDungThamTraRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_qlvtTTHCNoiDungThamTraRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaTTHC() {
		return _maTTHC;
	}

	@Override
	public void setMaTTHC(String maTTHC) {
		_maTTHC = maTTHC;

		if (_qlvtTTHCNoiDungThamTraRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtTTHCNoiDungThamTraRemoteModel.getClass();

				Method method = clazz.getMethod("setMaTTHC", String.class);

				method.invoke(_qlvtTTHCNoiDungThamTraRemoteModel, maTTHC);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getToChucXuLy() {
		return _toChucXuLy;
	}

	@Override
	public void setToChucXuLy(int toChucXuLy) {
		_toChucXuLy = toChucXuLy;

		if (_qlvtTTHCNoiDungThamTraRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtTTHCNoiDungThamTraRemoteModel.getClass();

				Method method = clazz.getMethod("setToChucXuLy", int.class);

				method.invoke(_qlvtTTHCNoiDungThamTraRemoteModel, toChucXuLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQlvtTTHCNoiDungThamTraRemoteModel() {
		return _qlvtTTHCNoiDungThamTraRemoteModel;
	}

	public void setQlvtTTHCNoiDungThamTraRemoteModel(
		BaseModel<?> qlvtTTHCNoiDungThamTraRemoteModel) {
		_qlvtTTHCNoiDungThamTraRemoteModel = qlvtTTHCNoiDungThamTraRemoteModel;
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

		Class<?> remoteModelClass = _qlvtTTHCNoiDungThamTraRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtTTHCNoiDungThamTraRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtTTHCNoiDungThamTraLocalServiceUtil.addQlvtTTHCNoiDungThamTra(this);
		}
		else {
			QlvtTTHCNoiDungThamTraLocalServiceUtil.updateQlvtTTHCNoiDungThamTra(this);
		}
	}

	@Override
	public QlvtTTHCNoiDungThamTra toEscapedModel() {
		return (QlvtTTHCNoiDungThamTra)ProxyUtil.newProxyInstance(QlvtTTHCNoiDungThamTra.class.getClassLoader(),
			new Class[] { QlvtTTHCNoiDungThamTra.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QlvtTTHCNoiDungThamTraClp clone = new QlvtTTHCNoiDungThamTraClp();

		clone.setId(getId());
		clone.setMaTTHC(getMaTTHC());
		clone.setToChucXuLy(getToChucXuLy());

		return clone;
	}

	@Override
	public int compareTo(QlvtTTHCNoiDungThamTra qlvtTTHCNoiDungThamTra) {
		int value = 0;

		if (getId() < qlvtTTHCNoiDungThamTra.getId()) {
			value = -1;
		}
		else if (getId() > qlvtTTHCNoiDungThamTra.getId()) {
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

		if (!(obj instanceof QlvtTTHCNoiDungThamTraClp)) {
			return false;
		}

		QlvtTTHCNoiDungThamTraClp qlvtTTHCNoiDungThamTra = (QlvtTTHCNoiDungThamTraClp)obj;

		long primaryKey = qlvtTTHCNoiDungThamTra.getPrimaryKey();

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
		sb.append(", maTTHC=");
		sb.append(getMaTTHC());
		sb.append(", toChucXuLy=");
		sb.append(getToChucXuLy());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maTTHC</column-name><column-value><![CDATA[");
		sb.append(getMaTTHC());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>toChucXuLy</column-name><column-value><![CDATA[");
		sb.append(getToChucXuLy());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _maTTHC;
	private int _toChucXuLy;
	private BaseModel<?> _qlvtTTHCNoiDungThamTraRemoteModel;
}