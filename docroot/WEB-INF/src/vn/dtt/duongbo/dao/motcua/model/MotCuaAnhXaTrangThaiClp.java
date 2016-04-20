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

package vn.dtt.duongbo.dao.motcua.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbo.dao.motcua.service.ClpSerializer;
import vn.dtt.duongbo.dao.motcua.service.MotCuaAnhXaTrangThaiLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class MotCuaAnhXaTrangThaiClp extends BaseModelImpl<MotCuaAnhXaTrangThai>
	implements MotCuaAnhXaTrangThai {
	public MotCuaAnhXaTrangThaiClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return MotCuaAnhXaTrangThai.class;
	}

	@Override
	public String getModelClassName() {
		return MotCuaAnhXaTrangThai.class.getName();
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
		attributes.put("maTTCanBo", getMaTTCanBo());
		attributes.put("maTTDoanhNghiep", getMaTTDoanhNghiep());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String maTTCanBo = (String)attributes.get("maTTCanBo");

		if (maTTCanBo != null) {
			setMaTTCanBo(maTTCanBo);
		}

		String maTTDoanhNghiep = (String)attributes.get("maTTDoanhNghiep");

		if (maTTDoanhNghiep != null) {
			setMaTTDoanhNghiep(maTTDoanhNghiep);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_motCuaAnhXaTrangThaiRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaAnhXaTrangThaiRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_motCuaAnhXaTrangThaiRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaTTCanBo() {
		return _maTTCanBo;
	}

	@Override
	public void setMaTTCanBo(String maTTCanBo) {
		_maTTCanBo = maTTCanBo;

		if (_motCuaAnhXaTrangThaiRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaAnhXaTrangThaiRemoteModel.getClass();

				Method method = clazz.getMethod("setMaTTCanBo", String.class);

				method.invoke(_motCuaAnhXaTrangThaiRemoteModel, maTTCanBo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaTTDoanhNghiep() {
		return _maTTDoanhNghiep;
	}

	@Override
	public void setMaTTDoanhNghiep(String maTTDoanhNghiep) {
		_maTTDoanhNghiep = maTTDoanhNghiep;

		if (_motCuaAnhXaTrangThaiRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaAnhXaTrangThaiRemoteModel.getClass();

				Method method = clazz.getMethod("setMaTTDoanhNghiep",
						String.class);

				method.invoke(_motCuaAnhXaTrangThaiRemoteModel, maTTDoanhNghiep);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getMotCuaAnhXaTrangThaiRemoteModel() {
		return _motCuaAnhXaTrangThaiRemoteModel;
	}

	public void setMotCuaAnhXaTrangThaiRemoteModel(
		BaseModel<?> motCuaAnhXaTrangThaiRemoteModel) {
		_motCuaAnhXaTrangThaiRemoteModel = motCuaAnhXaTrangThaiRemoteModel;
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

		Class<?> remoteModelClass = _motCuaAnhXaTrangThaiRemoteModel.getClass();

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

		Object returnValue = method.invoke(_motCuaAnhXaTrangThaiRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			MotCuaAnhXaTrangThaiLocalServiceUtil.addMotCuaAnhXaTrangThai(this);
		}
		else {
			MotCuaAnhXaTrangThaiLocalServiceUtil.updateMotCuaAnhXaTrangThai(this);
		}
	}

	@Override
	public MotCuaAnhXaTrangThai toEscapedModel() {
		return (MotCuaAnhXaTrangThai)ProxyUtil.newProxyInstance(MotCuaAnhXaTrangThai.class.getClassLoader(),
			new Class[] { MotCuaAnhXaTrangThai.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		MotCuaAnhXaTrangThaiClp clone = new MotCuaAnhXaTrangThaiClp();

		clone.setId(getId());
		clone.setMaTTCanBo(getMaTTCanBo());
		clone.setMaTTDoanhNghiep(getMaTTDoanhNghiep());

		return clone;
	}

	@Override
	public int compareTo(MotCuaAnhXaTrangThai motCuaAnhXaTrangThai) {
		int value = 0;

		if (getId() < motCuaAnhXaTrangThai.getId()) {
			value = -1;
		}
		else if (getId() > motCuaAnhXaTrangThai.getId()) {
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

		if (!(obj instanceof MotCuaAnhXaTrangThaiClp)) {
			return false;
		}

		MotCuaAnhXaTrangThaiClp motCuaAnhXaTrangThai = (MotCuaAnhXaTrangThaiClp)obj;

		long primaryKey = motCuaAnhXaTrangThai.getPrimaryKey();

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
		sb.append(", maTTCanBo=");
		sb.append(getMaTTCanBo());
		sb.append(", maTTDoanhNghiep=");
		sb.append(getMaTTDoanhNghiep());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maTTCanBo</column-name><column-value><![CDATA[");
		sb.append(getMaTTCanBo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maTTDoanhNghiep</column-name><column-value><![CDATA[");
		sb.append(getMaTTDoanhNghiep());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _maTTCanBo;
	private String _maTTDoanhNghiep;
	private BaseModel<?> _motCuaAnhXaTrangThaiRemoteModel;
}