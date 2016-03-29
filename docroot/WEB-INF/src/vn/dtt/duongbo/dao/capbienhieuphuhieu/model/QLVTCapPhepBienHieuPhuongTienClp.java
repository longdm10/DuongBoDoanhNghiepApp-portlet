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
import vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTCapPhepBienHieuPhuongTienLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author binhta
 */
public class QLVTCapPhepBienHieuPhuongTienClp extends BaseModelImpl<QLVTCapPhepBienHieuPhuongTien>
	implements QLVTCapPhepBienHieuPhuongTien {
	public QLVTCapPhepBienHieuPhuongTienClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QLVTCapPhepBienHieuPhuongTien.class;
	}

	@Override
	public String getModelClassName() {
		return QLVTCapPhepBienHieuPhuongTien.class.getName();
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
		attributes.put("qlvtCapHepBienHieuId", getQlvtCapHepBienHieuId());
		attributes.put("qlvtPhuongTienVanTaiId", getQlvtPhuongTienVanTaiId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer qlvtCapHepBienHieuId = (Integer)attributes.get(
				"qlvtCapHepBienHieuId");

		if (qlvtCapHepBienHieuId != null) {
			setQlvtCapHepBienHieuId(qlvtCapHepBienHieuId);
		}

		Integer qlvtPhuongTienVanTaiId = (Integer)attributes.get(
				"qlvtPhuongTienVanTaiId");

		if (qlvtPhuongTienVanTaiId != null) {
			setQlvtPhuongTienVanTaiId(qlvtPhuongTienVanTaiId);
		}
	}

	@Override
	public int getId() {
		return _id;
	}

	@Override
	public void setId(int id) {
		_id = id;

		if (_qlvtCapPhepBienHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepBienHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setId", int.class);

				method.invoke(_qlvtCapPhepBienHieuPhuongTienRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getQlvtCapHepBienHieuId() {
		return _qlvtCapHepBienHieuId;
	}

	@Override
	public void setQlvtCapHepBienHieuId(int qlvtCapHepBienHieuId) {
		_qlvtCapHepBienHieuId = qlvtCapHepBienHieuId;

		if (_qlvtCapPhepBienHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepBienHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setQlvtCapHepBienHieuId",
						int.class);

				method.invoke(_qlvtCapPhepBienHieuPhuongTienRemoteModel,
					qlvtCapHepBienHieuId);
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

		if (_qlvtCapPhepBienHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepBienHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setQlvtPhuongTienVanTaiId",
						int.class);

				method.invoke(_qlvtCapPhepBienHieuPhuongTienRemoteModel,
					qlvtPhuongTienVanTaiId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQLVTCapPhepBienHieuPhuongTienRemoteModel() {
		return _qlvtCapPhepBienHieuPhuongTienRemoteModel;
	}

	public void setQLVTCapPhepBienHieuPhuongTienRemoteModel(
		BaseModel<?> qlvtCapPhepBienHieuPhuongTienRemoteModel) {
		_qlvtCapPhepBienHieuPhuongTienRemoteModel = qlvtCapPhepBienHieuPhuongTienRemoteModel;
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

		Class<?> remoteModelClass = _qlvtCapPhepBienHieuPhuongTienRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtCapPhepBienHieuPhuongTienRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QLVTCapPhepBienHieuPhuongTienLocalServiceUtil.addQLVTCapPhepBienHieuPhuongTien(this);
		}
		else {
			QLVTCapPhepBienHieuPhuongTienLocalServiceUtil.updateQLVTCapPhepBienHieuPhuongTien(this);
		}
	}

	@Override
	public QLVTCapPhepBienHieuPhuongTien toEscapedModel() {
		return (QLVTCapPhepBienHieuPhuongTien)ProxyUtil.newProxyInstance(QLVTCapPhepBienHieuPhuongTien.class.getClassLoader(),
			new Class[] { QLVTCapPhepBienHieuPhuongTien.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QLVTCapPhepBienHieuPhuongTienClp clone = new QLVTCapPhepBienHieuPhuongTienClp();

		clone.setId(getId());
		clone.setQlvtCapHepBienHieuId(getQlvtCapHepBienHieuId());
		clone.setQlvtPhuongTienVanTaiId(getQlvtPhuongTienVanTaiId());

		return clone;
	}

	@Override
	public int compareTo(
		QLVTCapPhepBienHieuPhuongTien qlvtCapPhepBienHieuPhuongTien) {
		int primaryKey = qlvtCapPhepBienHieuPhuongTien.getPrimaryKey();

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

		if (!(obj instanceof QLVTCapPhepBienHieuPhuongTienClp)) {
			return false;
		}

		QLVTCapPhepBienHieuPhuongTienClp qlvtCapPhepBienHieuPhuongTien = (QLVTCapPhepBienHieuPhuongTienClp)obj;

		int primaryKey = qlvtCapPhepBienHieuPhuongTien.getPrimaryKey();

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
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", qlvtCapHepBienHieuId=");
		sb.append(getQlvtCapHepBienHieuId());
		sb.append(", qlvtPhuongTienVanTaiId=");
		sb.append(getQlvtPhuongTienVanTaiId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append(
			"vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepBienHieuPhuongTien");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>qlvtCapHepBienHieuId</column-name><column-value><![CDATA[");
		sb.append(getQlvtCapHepBienHieuId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>qlvtPhuongTienVanTaiId</column-name><column-value><![CDATA[");
		sb.append(getQlvtPhuongTienVanTaiId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _id;
	private int _qlvtCapHepBienHieuId;
	private int _qlvtPhuongTienVanTaiId;
	private BaseModel<?> _qlvtCapPhepBienHieuPhuongTienRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbo.dao.capbienhieuphuhieu.service.ClpSerializer.class;
}