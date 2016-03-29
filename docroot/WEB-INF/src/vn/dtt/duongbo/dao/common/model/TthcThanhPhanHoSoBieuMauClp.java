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
import vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoBieuMauLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class TthcThanhPhanHoSoBieuMauClp extends BaseModelImpl<TthcThanhPhanHoSoBieuMau>
	implements TthcThanhPhanHoSoBieuMau {
	public TthcThanhPhanHoSoBieuMauClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TthcThanhPhanHoSoBieuMau.class;
	}

	@Override
	public String getModelClassName() {
		return TthcThanhPhanHoSoBieuMau.class.getName();
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
		attributes.put("thanhPhanHoSoId", getThanhPhanHoSoId());
		attributes.put("bieuMauHoSoId", getBieuMauHoSoId());
		attributes.put("soThuTu", getSoThuTu());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long thanhPhanHoSoId = (Long)attributes.get("thanhPhanHoSoId");

		if (thanhPhanHoSoId != null) {
			setThanhPhanHoSoId(thanhPhanHoSoId);
		}

		Long bieuMauHoSoId = (Long)attributes.get("bieuMauHoSoId");

		if (bieuMauHoSoId != null) {
			setBieuMauHoSoId(bieuMauHoSoId);
		}

		Integer soThuTu = (Integer)attributes.get("soThuTu");

		if (soThuTu != null) {
			setSoThuTu(soThuTu);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tthcThanhPhanHoSoBieuMauRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThanhPhanHoSoBieuMauRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tthcThanhPhanHoSoBieuMauRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getThanhPhanHoSoId() {
		return _thanhPhanHoSoId;
	}

	@Override
	public void setThanhPhanHoSoId(long thanhPhanHoSoId) {
		_thanhPhanHoSoId = thanhPhanHoSoId;

		if (_tthcThanhPhanHoSoBieuMauRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThanhPhanHoSoBieuMauRemoteModel.getClass();

				Method method = clazz.getMethod("setThanhPhanHoSoId", long.class);

				method.invoke(_tthcThanhPhanHoSoBieuMauRemoteModel,
					thanhPhanHoSoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getBieuMauHoSoId() {
		return _bieuMauHoSoId;
	}

	@Override
	public void setBieuMauHoSoId(long bieuMauHoSoId) {
		_bieuMauHoSoId = bieuMauHoSoId;

		if (_tthcThanhPhanHoSoBieuMauRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThanhPhanHoSoBieuMauRemoteModel.getClass();

				Method method = clazz.getMethod("setBieuMauHoSoId", long.class);

				method.invoke(_tthcThanhPhanHoSoBieuMauRemoteModel,
					bieuMauHoSoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoThuTu() {
		return _soThuTu;
	}

	@Override
	public void setSoThuTu(int soThuTu) {
		_soThuTu = soThuTu;

		if (_tthcThanhPhanHoSoBieuMauRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThanhPhanHoSoBieuMauRemoteModel.getClass();

				Method method = clazz.getMethod("setSoThuTu", int.class);

				method.invoke(_tthcThanhPhanHoSoBieuMauRemoteModel, soThuTu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTthcThanhPhanHoSoBieuMauRemoteModel() {
		return _tthcThanhPhanHoSoBieuMauRemoteModel;
	}

	public void setTthcThanhPhanHoSoBieuMauRemoteModel(
		BaseModel<?> tthcThanhPhanHoSoBieuMauRemoteModel) {
		_tthcThanhPhanHoSoBieuMauRemoteModel = tthcThanhPhanHoSoBieuMauRemoteModel;
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

		Class<?> remoteModelClass = _tthcThanhPhanHoSoBieuMauRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tthcThanhPhanHoSoBieuMauRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TthcThanhPhanHoSoBieuMauLocalServiceUtil.addTthcThanhPhanHoSoBieuMau(this);
		}
		else {
			TthcThanhPhanHoSoBieuMauLocalServiceUtil.updateTthcThanhPhanHoSoBieuMau(this);
		}
	}

	@Override
	public TthcThanhPhanHoSoBieuMau toEscapedModel() {
		return (TthcThanhPhanHoSoBieuMau)ProxyUtil.newProxyInstance(TthcThanhPhanHoSoBieuMau.class.getClassLoader(),
			new Class[] { TthcThanhPhanHoSoBieuMau.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TthcThanhPhanHoSoBieuMauClp clone = new TthcThanhPhanHoSoBieuMauClp();

		clone.setId(getId());
		clone.setThanhPhanHoSoId(getThanhPhanHoSoId());
		clone.setBieuMauHoSoId(getBieuMauHoSoId());
		clone.setSoThuTu(getSoThuTu());

		return clone;
	}

	@Override
	public int compareTo(TthcThanhPhanHoSoBieuMau tthcThanhPhanHoSoBieuMau) {
		int value = 0;

		if (getId() < tthcThanhPhanHoSoBieuMau.getId()) {
			value = -1;
		}
		else if (getId() > tthcThanhPhanHoSoBieuMau.getId()) {
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

		if (!(obj instanceof TthcThanhPhanHoSoBieuMauClp)) {
			return false;
		}

		TthcThanhPhanHoSoBieuMauClp tthcThanhPhanHoSoBieuMau = (TthcThanhPhanHoSoBieuMauClp)obj;

		long primaryKey = tthcThanhPhanHoSoBieuMau.getPrimaryKey();

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
		sb.append(", thanhPhanHoSoId=");
		sb.append(getThanhPhanHoSoId());
		sb.append(", bieuMauHoSoId=");
		sb.append(getBieuMauHoSoId());
		sb.append(", soThuTu=");
		sb.append(getSoThuTu());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thanhPhanHoSoId</column-name><column-value><![CDATA[");
		sb.append(getThanhPhanHoSoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bieuMauHoSoId</column-name><column-value><![CDATA[");
		sb.append(getBieuMauHoSoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soThuTu</column-name><column-value><![CDATA[");
		sb.append(getSoThuTu());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _thanhPhanHoSoId;
	private long _bieuMauHoSoId;
	private int _soThuTu;
	private BaseModel<?> _tthcThanhPhanHoSoBieuMauRemoteModel;
}