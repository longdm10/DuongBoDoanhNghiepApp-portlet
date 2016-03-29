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
import vn.dtt.duongbo.dao.common.service.TthcDoiTuongThucHienLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class TthcDoiTuongThucHienClp extends BaseModelImpl<TthcDoiTuongThucHien>
	implements TthcDoiTuongThucHien {
	public TthcDoiTuongThucHienClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TthcDoiTuongThucHien.class;
	}

	@Override
	public String getModelClassName() {
		return TthcDoiTuongThucHien.class.getName();
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
		attributes.put("thuTucHanhChinhId", getThuTucHanhChinhId());
		attributes.put("loaiDoiTuongThucHien", getLoaiDoiTuongThucHien());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long thuTucHanhChinhId = (Long)attributes.get("thuTucHanhChinhId");

		if (thuTucHanhChinhId != null) {
			setThuTucHanhChinhId(thuTucHanhChinhId);
		}

		String loaiDoiTuongThucHien = (String)attributes.get(
				"loaiDoiTuongThucHien");

		if (loaiDoiTuongThucHien != null) {
			setLoaiDoiTuongThucHien(loaiDoiTuongThucHien);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tthcDoiTuongThucHienRemoteModel != null) {
			try {
				Class<?> clazz = _tthcDoiTuongThucHienRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tthcDoiTuongThucHienRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getThuTucHanhChinhId() {
		return _thuTucHanhChinhId;
	}

	@Override
	public void setThuTucHanhChinhId(long thuTucHanhChinhId) {
		_thuTucHanhChinhId = thuTucHanhChinhId;

		if (_tthcDoiTuongThucHienRemoteModel != null) {
			try {
				Class<?> clazz = _tthcDoiTuongThucHienRemoteModel.getClass();

				Method method = clazz.getMethod("setThuTucHanhChinhId",
						long.class);

				method.invoke(_tthcDoiTuongThucHienRemoteModel,
					thuTucHanhChinhId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLoaiDoiTuongThucHien() {
		return _loaiDoiTuongThucHien;
	}

	@Override
	public void setLoaiDoiTuongThucHien(String loaiDoiTuongThucHien) {
		_loaiDoiTuongThucHien = loaiDoiTuongThucHien;

		if (_tthcDoiTuongThucHienRemoteModel != null) {
			try {
				Class<?> clazz = _tthcDoiTuongThucHienRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiDoiTuongThucHien",
						String.class);

				method.invoke(_tthcDoiTuongThucHienRemoteModel,
					loaiDoiTuongThucHien);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTthcDoiTuongThucHienRemoteModel() {
		return _tthcDoiTuongThucHienRemoteModel;
	}

	public void setTthcDoiTuongThucHienRemoteModel(
		BaseModel<?> tthcDoiTuongThucHienRemoteModel) {
		_tthcDoiTuongThucHienRemoteModel = tthcDoiTuongThucHienRemoteModel;
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

		Class<?> remoteModelClass = _tthcDoiTuongThucHienRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tthcDoiTuongThucHienRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TthcDoiTuongThucHienLocalServiceUtil.addTthcDoiTuongThucHien(this);
		}
		else {
			TthcDoiTuongThucHienLocalServiceUtil.updateTthcDoiTuongThucHien(this);
		}
	}

	@Override
	public TthcDoiTuongThucHien toEscapedModel() {
		return (TthcDoiTuongThucHien)ProxyUtil.newProxyInstance(TthcDoiTuongThucHien.class.getClassLoader(),
			new Class[] { TthcDoiTuongThucHien.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TthcDoiTuongThucHienClp clone = new TthcDoiTuongThucHienClp();

		clone.setId(getId());
		clone.setThuTucHanhChinhId(getThuTucHanhChinhId());
		clone.setLoaiDoiTuongThucHien(getLoaiDoiTuongThucHien());

		return clone;
	}

	@Override
	public int compareTo(TthcDoiTuongThucHien tthcDoiTuongThucHien) {
		int value = 0;

		if (getId() < tthcDoiTuongThucHien.getId()) {
			value = -1;
		}
		else if (getId() > tthcDoiTuongThucHien.getId()) {
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

		if (!(obj instanceof TthcDoiTuongThucHienClp)) {
			return false;
		}

		TthcDoiTuongThucHienClp tthcDoiTuongThucHien = (TthcDoiTuongThucHienClp)obj;

		long primaryKey = tthcDoiTuongThucHien.getPrimaryKey();

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
		sb.append(", thuTucHanhChinhId=");
		sb.append(getThuTucHanhChinhId());
		sb.append(", loaiDoiTuongThucHien=");
		sb.append(getLoaiDoiTuongThucHien());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.common.model.TthcDoiTuongThucHien");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thuTucHanhChinhId</column-name><column-value><![CDATA[");
		sb.append(getThuTucHanhChinhId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiDoiTuongThucHien</column-name><column-value><![CDATA[");
		sb.append(getLoaiDoiTuongThucHien());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _thuTucHanhChinhId;
	private String _loaiDoiTuongThucHien;
	private BaseModel<?> _tthcDoiTuongThucHienRemoteModel;
}