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
import vn.dtt.duongbo.dao.common.service.TthcDonViThucHienLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class TthcDonViThucHienClp extends BaseModelImpl<TthcDonViThucHien>
	implements TthcDonViThucHien {
	public TthcDonViThucHienClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TthcDonViThucHien.class;
	}

	@Override
	public String getModelClassName() {
		return TthcDonViThucHien.class.getName();
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
		attributes.put("maDonVi", getMaDonVi());
		attributes.put("toChuc", getToChuc());

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

		String maDonVi = (String)attributes.get("maDonVi");

		if (maDonVi != null) {
			setMaDonVi(maDonVi);
		}

		Long toChuc = (Long)attributes.get("toChuc");

		if (toChuc != null) {
			setToChuc(toChuc);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tthcDonViThucHienRemoteModel != null) {
			try {
				Class<?> clazz = _tthcDonViThucHienRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tthcDonViThucHienRemoteModel, id);
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

		if (_tthcDonViThucHienRemoteModel != null) {
			try {
				Class<?> clazz = _tthcDonViThucHienRemoteModel.getClass();

				Method method = clazz.getMethod("setThuTucHanhChinhId",
						long.class);

				method.invoke(_tthcDonViThucHienRemoteModel, thuTucHanhChinhId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaDonVi() {
		return _maDonVi;
	}

	@Override
	public void setMaDonVi(String maDonVi) {
		_maDonVi = maDonVi;

		if (_tthcDonViThucHienRemoteModel != null) {
			try {
				Class<?> clazz = _tthcDonViThucHienRemoteModel.getClass();

				Method method = clazz.getMethod("setMaDonVi", String.class);

				method.invoke(_tthcDonViThucHienRemoteModel, maDonVi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getToChuc() {
		return _toChuc;
	}

	@Override
	public void setToChuc(long toChuc) {
		_toChuc = toChuc;

		if (_tthcDonViThucHienRemoteModel != null) {
			try {
				Class<?> clazz = _tthcDonViThucHienRemoteModel.getClass();

				Method method = clazz.getMethod("setToChuc", long.class);

				method.invoke(_tthcDonViThucHienRemoteModel, toChuc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTthcDonViThucHienRemoteModel() {
		return _tthcDonViThucHienRemoteModel;
	}

	public void setTthcDonViThucHienRemoteModel(
		BaseModel<?> tthcDonViThucHienRemoteModel) {
		_tthcDonViThucHienRemoteModel = tthcDonViThucHienRemoteModel;
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

		Class<?> remoteModelClass = _tthcDonViThucHienRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tthcDonViThucHienRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TthcDonViThucHienLocalServiceUtil.addTthcDonViThucHien(this);
		}
		else {
			TthcDonViThucHienLocalServiceUtil.updateTthcDonViThucHien(this);
		}
	}

	@Override
	public TthcDonViThucHien toEscapedModel() {
		return (TthcDonViThucHien)ProxyUtil.newProxyInstance(TthcDonViThucHien.class.getClassLoader(),
			new Class[] { TthcDonViThucHien.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TthcDonViThucHienClp clone = new TthcDonViThucHienClp();

		clone.setId(getId());
		clone.setThuTucHanhChinhId(getThuTucHanhChinhId());
		clone.setMaDonVi(getMaDonVi());
		clone.setToChuc(getToChuc());

		return clone;
	}

	@Override
	public int compareTo(TthcDonViThucHien tthcDonViThucHien) {
		int value = 0;

		if (getId() < tthcDonViThucHien.getId()) {
			value = -1;
		}
		else if (getId() > tthcDonViThucHien.getId()) {
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

		if (!(obj instanceof TthcDonViThucHienClp)) {
			return false;
		}

		TthcDonViThucHienClp tthcDonViThucHien = (TthcDonViThucHienClp)obj;

		long primaryKey = tthcDonViThucHien.getPrimaryKey();

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
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", thuTucHanhChinhId=");
		sb.append(getThuTucHanhChinhId());
		sb.append(", maDonVi=");
		sb.append(getMaDonVi());
		sb.append(", toChuc=");
		sb.append(getToChuc());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.common.model.TthcDonViThucHien");
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
			"<column><column-name>maDonVi</column-name><column-value><![CDATA[");
		sb.append(getMaDonVi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>toChuc</column-name><column-value><![CDATA[");
		sb.append(getToChuc());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _thuTucHanhChinhId;
	private String _maDonVi;
	private long _toChuc;
	private BaseModel<?> _tthcDonViThucHienRemoteModel;
}