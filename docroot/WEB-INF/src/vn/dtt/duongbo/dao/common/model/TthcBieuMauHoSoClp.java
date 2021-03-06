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
import vn.dtt.duongbo.dao.common.service.TthcBieuMauHoSoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class TthcBieuMauHoSoClp extends BaseModelImpl<TthcBieuMauHoSo>
	implements TthcBieuMauHoSo {
	public TthcBieuMauHoSoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TthcBieuMauHoSo.class;
	}

	@Override
	public String getModelClassName() {
		return TthcBieuMauHoSo.class.getName();
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
		attributes.put("maBieuMau", getMaBieuMau());
		attributes.put("tenBieuMau", getTenBieuMau());
		attributes.put("tenTiengAnh", getTenTiengAnh());
		attributes.put("taiLieuMau", getTaiLieuMau());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String maBieuMau = (String)attributes.get("maBieuMau");

		if (maBieuMau != null) {
			setMaBieuMau(maBieuMau);
		}

		String tenBieuMau = (String)attributes.get("tenBieuMau");

		if (tenBieuMau != null) {
			setTenBieuMau(tenBieuMau);
		}

		String tenTiengAnh = (String)attributes.get("tenTiengAnh");

		if (tenTiengAnh != null) {
			setTenTiengAnh(tenTiengAnh);
		}

		Long taiLieuMau = (Long)attributes.get("taiLieuMau");

		if (taiLieuMau != null) {
			setTaiLieuMau(taiLieuMau);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tthcBieuMauHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcBieuMauHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tthcBieuMauHoSoRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaBieuMau() {
		return _maBieuMau;
	}

	@Override
	public void setMaBieuMau(String maBieuMau) {
		_maBieuMau = maBieuMau;

		if (_tthcBieuMauHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcBieuMauHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setMaBieuMau", String.class);

				method.invoke(_tthcBieuMauHoSoRemoteModel, maBieuMau);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenBieuMau() {
		return _tenBieuMau;
	}

	@Override
	public void setTenBieuMau(String tenBieuMau) {
		_tenBieuMau = tenBieuMau;

		if (_tthcBieuMauHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcBieuMauHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setTenBieuMau", String.class);

				method.invoke(_tthcBieuMauHoSoRemoteModel, tenBieuMau);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenTiengAnh() {
		return _tenTiengAnh;
	}

	@Override
	public void setTenTiengAnh(String tenTiengAnh) {
		_tenTiengAnh = tenTiengAnh;

		if (_tthcBieuMauHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcBieuMauHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setTenTiengAnh", String.class);

				method.invoke(_tthcBieuMauHoSoRemoteModel, tenTiengAnh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTaiLieuMau() {
		return _taiLieuMau;
	}

	@Override
	public void setTaiLieuMau(long taiLieuMau) {
		_taiLieuMau = taiLieuMau;

		if (_tthcBieuMauHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcBieuMauHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setTaiLieuMau", long.class);

				method.invoke(_tthcBieuMauHoSoRemoteModel, taiLieuMau);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTthcBieuMauHoSoRemoteModel() {
		return _tthcBieuMauHoSoRemoteModel;
	}

	public void setTthcBieuMauHoSoRemoteModel(
		BaseModel<?> tthcBieuMauHoSoRemoteModel) {
		_tthcBieuMauHoSoRemoteModel = tthcBieuMauHoSoRemoteModel;
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

		Class<?> remoteModelClass = _tthcBieuMauHoSoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tthcBieuMauHoSoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TthcBieuMauHoSoLocalServiceUtil.addTthcBieuMauHoSo(this);
		}
		else {
			TthcBieuMauHoSoLocalServiceUtil.updateTthcBieuMauHoSo(this);
		}
	}

	@Override
	public TthcBieuMauHoSo toEscapedModel() {
		return (TthcBieuMauHoSo)ProxyUtil.newProxyInstance(TthcBieuMauHoSo.class.getClassLoader(),
			new Class[] { TthcBieuMauHoSo.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TthcBieuMauHoSoClp clone = new TthcBieuMauHoSoClp();

		clone.setId(getId());
		clone.setMaBieuMau(getMaBieuMau());
		clone.setTenBieuMau(getTenBieuMau());
		clone.setTenTiengAnh(getTenTiengAnh());
		clone.setTaiLieuMau(getTaiLieuMau());

		return clone;
	}

	@Override
	public int compareTo(TthcBieuMauHoSo tthcBieuMauHoSo) {
		int value = 0;

		if (getId() < tthcBieuMauHoSo.getId()) {
			value = -1;
		}
		else if (getId() > tthcBieuMauHoSo.getId()) {
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

		if (!(obj instanceof TthcBieuMauHoSoClp)) {
			return false;
		}

		TthcBieuMauHoSoClp tthcBieuMauHoSo = (TthcBieuMauHoSoClp)obj;

		long primaryKey = tthcBieuMauHoSo.getPrimaryKey();

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
		sb.append(", maBieuMau=");
		sb.append(getMaBieuMau());
		sb.append(", tenBieuMau=");
		sb.append(getTenBieuMau());
		sb.append(", tenTiengAnh=");
		sb.append(getTenTiengAnh());
		sb.append(", taiLieuMau=");
		sb.append(getTaiLieuMau());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.common.model.TthcBieuMauHoSo");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maBieuMau</column-name><column-value><![CDATA[");
		sb.append(getMaBieuMau());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenBieuMau</column-name><column-value><![CDATA[");
		sb.append(getTenBieuMau());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenTiengAnh</column-name><column-value><![CDATA[");
		sb.append(getTenTiengAnh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>taiLieuMau</column-name><column-value><![CDATA[");
		sb.append(getTaiLieuMau());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _maBieuMau;
	private String _tenBieuMau;
	private String _tenTiengAnh;
	private long _taiLieuMau;
	private BaseModel<?> _tthcBieuMauHoSoRemoteModel;
}