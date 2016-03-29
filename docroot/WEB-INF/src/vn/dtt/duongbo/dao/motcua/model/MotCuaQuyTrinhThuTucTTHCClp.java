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
import vn.dtt.duongbo.dao.motcua.service.MotCuaQuyTrinhThuTucTTHCLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class MotCuaQuyTrinhThuTucTTHCClp extends BaseModelImpl<MotCuaQuyTrinhThuTucTTHC>
	implements MotCuaQuyTrinhThuTucTTHC {
	public MotCuaQuyTrinhThuTucTTHCClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return MotCuaQuyTrinhThuTucTTHC.class;
	}

	@Override
	public String getModelClassName() {
		return MotCuaQuyTrinhThuTucTTHC.class.getName();
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
		attributes.put("quyTrinhThuTucId", getQuyTrinhThuTucId());
		attributes.put("thuTucHanhChinhID", getThuTucHanhChinhID());
		attributes.put("toChucXuLy", getToChucXuLy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long quyTrinhThuTucId = (Long)attributes.get("quyTrinhThuTucId");

		if (quyTrinhThuTucId != null) {
			setQuyTrinhThuTucId(quyTrinhThuTucId);
		}

		Long thuTucHanhChinhID = (Long)attributes.get("thuTucHanhChinhID");

		if (thuTucHanhChinhID != null) {
			setThuTucHanhChinhID(thuTucHanhChinhID);
		}

		Long toChucXuLy = (Long)attributes.get("toChucXuLy");

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

		if (_motCuaQuyTrinhThuTucTTHCRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaQuyTrinhThuTucTTHCRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_motCuaQuyTrinhThuTucTTHCRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getQuyTrinhThuTucId() {
		return _quyTrinhThuTucId;
	}

	@Override
	public void setQuyTrinhThuTucId(long quyTrinhThuTucId) {
		_quyTrinhThuTucId = quyTrinhThuTucId;

		if (_motCuaQuyTrinhThuTucTTHCRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaQuyTrinhThuTucTTHCRemoteModel.getClass();

				Method method = clazz.getMethod("setQuyTrinhThuTucId",
						long.class);

				method.invoke(_motCuaQuyTrinhThuTucTTHCRemoteModel,
					quyTrinhThuTucId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getThuTucHanhChinhID() {
		return _thuTucHanhChinhID;
	}

	@Override
	public void setThuTucHanhChinhID(long thuTucHanhChinhID) {
		_thuTucHanhChinhID = thuTucHanhChinhID;

		if (_motCuaQuyTrinhThuTucTTHCRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaQuyTrinhThuTucTTHCRemoteModel.getClass();

				Method method = clazz.getMethod("setThuTucHanhChinhID",
						long.class);

				method.invoke(_motCuaQuyTrinhThuTucTTHCRemoteModel,
					thuTucHanhChinhID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getToChucXuLy() {
		return _toChucXuLy;
	}

	@Override
	public void setToChucXuLy(long toChucXuLy) {
		_toChucXuLy = toChucXuLy;

		if (_motCuaQuyTrinhThuTucTTHCRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaQuyTrinhThuTucTTHCRemoteModel.getClass();

				Method method = clazz.getMethod("setToChucXuLy", long.class);

				method.invoke(_motCuaQuyTrinhThuTucTTHCRemoteModel, toChucXuLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getMotCuaQuyTrinhThuTucTTHCRemoteModel() {
		return _motCuaQuyTrinhThuTucTTHCRemoteModel;
	}

	public void setMotCuaQuyTrinhThuTucTTHCRemoteModel(
		BaseModel<?> motCuaQuyTrinhThuTucTTHCRemoteModel) {
		_motCuaQuyTrinhThuTucTTHCRemoteModel = motCuaQuyTrinhThuTucTTHCRemoteModel;
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

		Class<?> remoteModelClass = _motCuaQuyTrinhThuTucTTHCRemoteModel.getClass();

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

		Object returnValue = method.invoke(_motCuaQuyTrinhThuTucTTHCRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			MotCuaQuyTrinhThuTucTTHCLocalServiceUtil.addMotCuaQuyTrinhThuTucTTHC(this);
		}
		else {
			MotCuaQuyTrinhThuTucTTHCLocalServiceUtil.updateMotCuaQuyTrinhThuTucTTHC(this);
		}
	}

	@Override
	public MotCuaQuyTrinhThuTucTTHC toEscapedModel() {
		return (MotCuaQuyTrinhThuTucTTHC)ProxyUtil.newProxyInstance(MotCuaQuyTrinhThuTucTTHC.class.getClassLoader(),
			new Class[] { MotCuaQuyTrinhThuTucTTHC.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		MotCuaQuyTrinhThuTucTTHCClp clone = new MotCuaQuyTrinhThuTucTTHCClp();

		clone.setId(getId());
		clone.setQuyTrinhThuTucId(getQuyTrinhThuTucId());
		clone.setThuTucHanhChinhID(getThuTucHanhChinhID());
		clone.setToChucXuLy(getToChucXuLy());

		return clone;
	}

	@Override
	public int compareTo(MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC) {
		int value = 0;

		if (getId() < motCuaQuyTrinhThuTucTTHC.getId()) {
			value = -1;
		}
		else if (getId() > motCuaQuyTrinhThuTucTTHC.getId()) {
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

		if (!(obj instanceof MotCuaQuyTrinhThuTucTTHCClp)) {
			return false;
		}

		MotCuaQuyTrinhThuTucTTHCClp motCuaQuyTrinhThuTucTTHC = (MotCuaQuyTrinhThuTucTTHCClp)obj;

		long primaryKey = motCuaQuyTrinhThuTucTTHC.getPrimaryKey();

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
		sb.append(", quyTrinhThuTucId=");
		sb.append(getQuyTrinhThuTucId());
		sb.append(", thuTucHanhChinhID=");
		sb.append(getThuTucHanhChinhID());
		sb.append(", toChucXuLy=");
		sb.append(getToChucXuLy());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>quyTrinhThuTucId</column-name><column-value><![CDATA[");
		sb.append(getQuyTrinhThuTucId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thuTucHanhChinhID</column-name><column-value><![CDATA[");
		sb.append(getThuTucHanhChinhID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>toChucXuLy</column-name><column-value><![CDATA[");
		sb.append(getToChucXuLy());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _quyTrinhThuTucId;
	private long _thuTucHanhChinhID;
	private long _toChucXuLy;
	private BaseModel<?> _motCuaQuyTrinhThuTucTTHCRemoteModel;
}