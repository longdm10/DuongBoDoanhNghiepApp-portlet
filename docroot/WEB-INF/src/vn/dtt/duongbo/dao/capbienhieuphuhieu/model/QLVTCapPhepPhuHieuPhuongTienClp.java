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

package vn.dtt.duongbo.dao.capbienhieuphuhieu.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbo.dao.capbienhieuphuhieu.service.ClpSerializer;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTCapPhepPhuHieuPhuongTienLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author binhta
 */
public class QLVTCapPhepPhuHieuPhuongTienClp extends BaseModelImpl<QLVTCapPhepPhuHieuPhuongTien>
	implements QLVTCapPhepPhuHieuPhuongTien {
	public QLVTCapPhepPhuHieuPhuongTienClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QLVTCapPhepPhuHieuPhuongTien.class;
	}

	@Override
	public String getModelClassName() {
		return QLVTCapPhepPhuHieuPhuongTien.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("qlvtCapPhepPhuHieuXeId", getQlvtCapPhepPhuHieuXeId());
		attributes.put("qlvtPhuongTienVanTaiId", getQlvtPhuongTienVanTaiId());
		attributes.put("trangThai", getTrangThai());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer qlvtCapPhepPhuHieuXeId = (Integer)attributes.get(
				"qlvtCapPhepPhuHieuXeId");

		if (qlvtCapPhepPhuHieuXeId != null) {
			setQlvtCapPhepPhuHieuXeId(qlvtCapPhepPhuHieuXeId);
		}

		Integer qlvtPhuongTienVanTaiId = (Integer)attributes.get(
				"qlvtPhuongTienVanTaiId");

		if (qlvtPhuongTienVanTaiId != null) {
			setQlvtPhuongTienVanTaiId(qlvtPhuongTienVanTaiId);
		}

		String trangThai = (String)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}
	}

	@Override
	public int getId() {
		return _id;
	}

	@Override
	public void setId(int id) {
		_id = id;

		if (_qlvtCapPhepPhuHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepPhuHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setId", int.class);

				method.invoke(_qlvtCapPhepPhuHieuPhuongTienRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getQlvtCapPhepPhuHieuXeId() {
		return _qlvtCapPhepPhuHieuXeId;
	}

	@Override
	public void setQlvtCapPhepPhuHieuXeId(int qlvtCapPhepPhuHieuXeId) {
		_qlvtCapPhepPhuHieuXeId = qlvtCapPhepPhuHieuXeId;

		if (_qlvtCapPhepPhuHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepPhuHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setQlvtCapPhepPhuHieuXeId",
						int.class);

				method.invoke(_qlvtCapPhepPhuHieuPhuongTienRemoteModel,
					qlvtCapPhepPhuHieuXeId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getQlvtPhuongTienVanTaiId() {
		return _qlvtPhuongTienVanTaiId;
	}

	@Override
	public void setQlvtPhuongTienVanTaiId(int qlvtPhuongTienVanTaiId) {
		_qlvtPhuongTienVanTaiId = qlvtPhuongTienVanTaiId;

		if (_qlvtCapPhepPhuHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepPhuHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setQlvtPhuongTienVanTaiId",
						int.class);

				method.invoke(_qlvtCapPhepPhuHieuPhuongTienRemoteModel,
					qlvtPhuongTienVanTaiId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTrangThai() {
		return _trangThai;
	}

	@Override
	public void setTrangThai(String trangThai) {
		_trangThai = trangThai;

		if (_qlvtCapPhepPhuHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepPhuHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThai", String.class);

				method.invoke(_qlvtCapPhepPhuHieuPhuongTienRemoteModel,
					trangThai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQLVTCapPhepPhuHieuPhuongTienRemoteModel() {
		return _qlvtCapPhepPhuHieuPhuongTienRemoteModel;
	}

	public void setQLVTCapPhepPhuHieuPhuongTienRemoteModel(
		BaseModel<?> qlvtCapPhepPhuHieuPhuongTienRemoteModel) {
		_qlvtCapPhepPhuHieuPhuongTienRemoteModel = qlvtCapPhepPhuHieuPhuongTienRemoteModel;
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

		Class<?> remoteModelClass = _qlvtCapPhepPhuHieuPhuongTienRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtCapPhepPhuHieuPhuongTienRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QLVTCapPhepPhuHieuPhuongTienLocalServiceUtil.addQLVTCapPhepPhuHieuPhuongTien(this);
		}
		else {
			QLVTCapPhepPhuHieuPhuongTienLocalServiceUtil.updateQLVTCapPhepPhuHieuPhuongTien(this);
		}
	}

	@Override
	public QLVTCapPhepPhuHieuPhuongTien toEscapedModel() {
		return (QLVTCapPhepPhuHieuPhuongTien)ProxyUtil.newProxyInstance(QLVTCapPhepPhuHieuPhuongTien.class.getClassLoader(),
			new Class[] { QLVTCapPhepPhuHieuPhuongTien.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QLVTCapPhepPhuHieuPhuongTienClp clone = new QLVTCapPhepPhuHieuPhuongTienClp();

		clone.setId(getId());
		clone.setQlvtCapPhepPhuHieuXeId(getQlvtCapPhepPhuHieuXeId());
		clone.setQlvtPhuongTienVanTaiId(getQlvtPhuongTienVanTaiId());
		clone.setTrangThai(getTrangThai());

		return clone;
	}

	@Override
	public int compareTo(
		QLVTCapPhepPhuHieuPhuongTien qlvtCapPhepPhuHieuPhuongTien) {
		int primaryKey = qlvtCapPhepPhuHieuPhuongTien.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QLVTCapPhepPhuHieuPhuongTienClp)) {
			return false;
		}

		QLVTCapPhepPhuHieuPhuongTienClp qlvtCapPhepPhuHieuPhuongTien = (QLVTCapPhepPhuHieuPhuongTienClp)obj;

		int primaryKey = qlvtCapPhepPhuHieuPhuongTien.getPrimaryKey();

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
		return getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", qlvtCapPhepPhuHieuXeId=");
		sb.append(getQlvtCapPhepPhuHieuXeId());
		sb.append(", qlvtPhuongTienVanTaiId=");
		sb.append(getQlvtPhuongTienVanTaiId());
		sb.append(", trangThai=");
		sb.append(getTrangThai());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append(
			"vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepPhuHieuPhuongTien");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>qlvtCapPhepPhuHieuXeId</column-name><column-value><![CDATA[");
		sb.append(getQlvtCapPhepPhuHieuXeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>qlvtPhuongTienVanTaiId</column-name><column-value><![CDATA[");
		sb.append(getQlvtPhuongTienVanTaiId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThai</column-name><column-value><![CDATA[");
		sb.append(getTrangThai());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _id;
	private int _qlvtCapPhepPhuHieuXeId;
	private int _qlvtPhuongTienVanTaiId;
	private String _trangThai;
	private BaseModel<?> _qlvtCapPhepPhuHieuPhuongTienRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbo.dao.capbienhieuphuhieu.service.ClpSerializer.class;
}