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
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtTTHCKetQuaThamTraLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author NhanNc
 */
public class QlvtTTHCKetQuaThamTraClp extends BaseModelImpl<QlvtTTHCKetQuaThamTra>
	implements QlvtTTHCKetQuaThamTra {
	public QlvtTTHCKetQuaThamTraClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtTTHCKetQuaThamTra.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtTTHCKetQuaThamTra.class.getName();
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
		attributes.put("maKetQuaThamTra", getMaKetQuaThamTra());
		attributes.put("maTTHC", getMaTTHC());
		attributes.put("buocXuLy", getBuocXuLy());
		attributes.put("toChucXuLy", getToChucXuLy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String maKetQuaThamTra = (String)attributes.get("maKetQuaThamTra");

		if (maKetQuaThamTra != null) {
			setMaKetQuaThamTra(maKetQuaThamTra);
		}

		String maTTHC = (String)attributes.get("maTTHC");

		if (maTTHC != null) {
			setMaTTHC(maTTHC);
		}

		Integer buocXuLy = (Integer)attributes.get("buocXuLy");

		if (buocXuLy != null) {
			setBuocXuLy(buocXuLy);
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

		if (_qlvtTTHCKetQuaThamTraRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtTTHCKetQuaThamTraRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_qlvtTTHCKetQuaThamTraRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaKetQuaThamTra() {
		return _maKetQuaThamTra;
	}

	@Override
	public void setMaKetQuaThamTra(String maKetQuaThamTra) {
		_maKetQuaThamTra = maKetQuaThamTra;

		if (_qlvtTTHCKetQuaThamTraRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtTTHCKetQuaThamTraRemoteModel.getClass();

				Method method = clazz.getMethod("setMaKetQuaThamTra",
						String.class);

				method.invoke(_qlvtTTHCKetQuaThamTraRemoteModel, maKetQuaThamTra);
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

		if (_qlvtTTHCKetQuaThamTraRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtTTHCKetQuaThamTraRemoteModel.getClass();

				Method method = clazz.getMethod("setMaTTHC", String.class);

				method.invoke(_qlvtTTHCKetQuaThamTraRemoteModel, maTTHC);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getBuocXuLy() {
		return _buocXuLy;
	}

	@Override
	public void setBuocXuLy(int buocXuLy) {
		_buocXuLy = buocXuLy;

		if (_qlvtTTHCKetQuaThamTraRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtTTHCKetQuaThamTraRemoteModel.getClass();

				Method method = clazz.getMethod("setBuocXuLy", int.class);

				method.invoke(_qlvtTTHCKetQuaThamTraRemoteModel, buocXuLy);
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

		if (_qlvtTTHCKetQuaThamTraRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtTTHCKetQuaThamTraRemoteModel.getClass();

				Method method = clazz.getMethod("setToChucXuLy", int.class);

				method.invoke(_qlvtTTHCKetQuaThamTraRemoteModel, toChucXuLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQlvtTTHCKetQuaThamTraRemoteModel() {
		return _qlvtTTHCKetQuaThamTraRemoteModel;
	}

	public void setQlvtTTHCKetQuaThamTraRemoteModel(
		BaseModel<?> qlvtTTHCKetQuaThamTraRemoteModel) {
		_qlvtTTHCKetQuaThamTraRemoteModel = qlvtTTHCKetQuaThamTraRemoteModel;
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

		Class<?> remoteModelClass = _qlvtTTHCKetQuaThamTraRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtTTHCKetQuaThamTraRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtTTHCKetQuaThamTraLocalServiceUtil.addQlvtTTHCKetQuaThamTra(this);
		}
		else {
			QlvtTTHCKetQuaThamTraLocalServiceUtil.updateQlvtTTHCKetQuaThamTra(this);
		}
	}

	@Override
	public QlvtTTHCKetQuaThamTra toEscapedModel() {
		return (QlvtTTHCKetQuaThamTra)ProxyUtil.newProxyInstance(QlvtTTHCKetQuaThamTra.class.getClassLoader(),
			new Class[] { QlvtTTHCKetQuaThamTra.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QlvtTTHCKetQuaThamTraClp clone = new QlvtTTHCKetQuaThamTraClp();

		clone.setId(getId());
		clone.setMaKetQuaThamTra(getMaKetQuaThamTra());
		clone.setMaTTHC(getMaTTHC());
		clone.setBuocXuLy(getBuocXuLy());
		clone.setToChucXuLy(getToChucXuLy());

		return clone;
	}

	@Override
	public int compareTo(QlvtTTHCKetQuaThamTra qlvtTTHCKetQuaThamTra) {
		int value = 0;

		if (getId() < qlvtTTHCKetQuaThamTra.getId()) {
			value = -1;
		}
		else if (getId() > qlvtTTHCKetQuaThamTra.getId()) {
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

		if (!(obj instanceof QlvtTTHCKetQuaThamTraClp)) {
			return false;
		}

		QlvtTTHCKetQuaThamTraClp qlvtTTHCKetQuaThamTra = (QlvtTTHCKetQuaThamTraClp)obj;

		long primaryKey = qlvtTTHCKetQuaThamTra.getPrimaryKey();

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
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", maKetQuaThamTra=");
		sb.append(getMaKetQuaThamTra());
		sb.append(", maTTHC=");
		sb.append(getMaTTHC());
		sb.append(", buocXuLy=");
		sb.append(getBuocXuLy());
		sb.append(", toChucXuLy=");
		sb.append(getToChucXuLy());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTra");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maKetQuaThamTra</column-name><column-value><![CDATA[");
		sb.append(getMaKetQuaThamTra());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maTTHC</column-name><column-value><![CDATA[");
		sb.append(getMaTTHC());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>buocXuLy</column-name><column-value><![CDATA[");
		sb.append(getBuocXuLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>toChucXuLy</column-name><column-value><![CDATA[");
		sb.append(getToChucXuLy());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _maKetQuaThamTra;
	private String _maTTHC;
	private int _buocXuLy;
	private int _toChucXuLy;
	private BaseModel<?> _qlvtTTHCKetQuaThamTraRemoteModel;
}