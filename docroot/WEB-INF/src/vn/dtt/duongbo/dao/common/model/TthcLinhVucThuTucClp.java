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
import vn.dtt.duongbo.dao.common.service.TthcLinhVucThuTucLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class TthcLinhVucThuTucClp extends BaseModelImpl<TthcLinhVucThuTuc>
	implements TthcLinhVucThuTuc {
	public TthcLinhVucThuTucClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TthcLinhVucThuTuc.class;
	}

	@Override
	public String getModelClassName() {
		return TthcLinhVucThuTuc.class.getName();
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
		attributes.put("tenCoQuanQltt", getTenCoQuanQltt());
		attributes.put("tenTiengAnh", getTenTiengAnh());
		attributes.put("idCha", getIdCha());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String tenCoQuanQltt = (String)attributes.get("tenCoQuanQltt");

		if (tenCoQuanQltt != null) {
			setTenCoQuanQltt(tenCoQuanQltt);
		}

		String tenTiengAnh = (String)attributes.get("tenTiengAnh");

		if (tenTiengAnh != null) {
			setTenTiengAnh(tenTiengAnh);
		}

		Long idCha = (Long)attributes.get("idCha");

		if (idCha != null) {
			setIdCha(idCha);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tthcLinhVucThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcLinhVucThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tthcLinhVucThuTucRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenCoQuanQltt() {
		return _tenCoQuanQltt;
	}

	@Override
	public void setTenCoQuanQltt(String tenCoQuanQltt) {
		_tenCoQuanQltt = tenCoQuanQltt;

		if (_tthcLinhVucThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcLinhVucThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setTenCoQuanQltt", String.class);

				method.invoke(_tthcLinhVucThuTucRemoteModel, tenCoQuanQltt);
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

		if (_tthcLinhVucThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcLinhVucThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setTenTiengAnh", String.class);

				method.invoke(_tthcLinhVucThuTucRemoteModel, tenTiengAnh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getIdCha() {
		return _idCha;
	}

	@Override
	public void setIdCha(long idCha) {
		_idCha = idCha;

		if (_tthcLinhVucThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcLinhVucThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setIdCha", long.class);

				method.invoke(_tthcLinhVucThuTucRemoteModel, idCha);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTthcLinhVucThuTucRemoteModel() {
		return _tthcLinhVucThuTucRemoteModel;
	}

	public void setTthcLinhVucThuTucRemoteModel(
		BaseModel<?> tthcLinhVucThuTucRemoteModel) {
		_tthcLinhVucThuTucRemoteModel = tthcLinhVucThuTucRemoteModel;
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

		Class<?> remoteModelClass = _tthcLinhVucThuTucRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tthcLinhVucThuTucRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TthcLinhVucThuTucLocalServiceUtil.addTthcLinhVucThuTuc(this);
		}
		else {
			TthcLinhVucThuTucLocalServiceUtil.updateTthcLinhVucThuTuc(this);
		}
	}

	@Override
	public TthcLinhVucThuTuc toEscapedModel() {
		return (TthcLinhVucThuTuc)ProxyUtil.newProxyInstance(TthcLinhVucThuTuc.class.getClassLoader(),
			new Class[] { TthcLinhVucThuTuc.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TthcLinhVucThuTucClp clone = new TthcLinhVucThuTucClp();

		clone.setId(getId());
		clone.setTenCoQuanQltt(getTenCoQuanQltt());
		clone.setTenTiengAnh(getTenTiengAnh());
		clone.setIdCha(getIdCha());

		return clone;
	}

	@Override
	public int compareTo(TthcLinhVucThuTuc tthcLinhVucThuTuc) {
		int value = 0;

		if (getId() < tthcLinhVucThuTuc.getId()) {
			value = -1;
		}
		else if (getId() > tthcLinhVucThuTuc.getId()) {
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

		if (!(obj instanceof TthcLinhVucThuTucClp)) {
			return false;
		}

		TthcLinhVucThuTucClp tthcLinhVucThuTuc = (TthcLinhVucThuTucClp)obj;

		long primaryKey = tthcLinhVucThuTuc.getPrimaryKey();

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
		sb.append(", tenCoQuanQltt=");
		sb.append(getTenCoQuanQltt());
		sb.append(", tenTiengAnh=");
		sb.append(getTenTiengAnh());
		sb.append(", idCha=");
		sb.append(getIdCha());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.common.model.TthcLinhVucThuTuc");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenCoQuanQltt</column-name><column-value><![CDATA[");
		sb.append(getTenCoQuanQltt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenTiengAnh</column-name><column-value><![CDATA[");
		sb.append(getTenTiengAnh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>idCha</column-name><column-value><![CDATA[");
		sb.append(getIdCha());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _tenCoQuanQltt;
	private String _tenTiengAnh;
	private long _idCha;
	private BaseModel<?> _tthcLinhVucThuTucRemoteModel;
}