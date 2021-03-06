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
import vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyPhuHieuPhuongTienTuyenLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author binhta
 */
public class QLVTXuLyPhuHieuPhuongTienTuyenClp extends BaseModelImpl<QLVTXuLyPhuHieuPhuongTienTuyen>
	implements QLVTXuLyPhuHieuPhuongTienTuyen {
	public QLVTXuLyPhuHieuPhuongTienTuyenClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QLVTXuLyPhuHieuPhuongTienTuyen.class;
	}

	@Override
	public String getModelClassName() {
		return QLVTXuLyPhuHieuPhuongTienTuyen.class.getName();
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
		attributes.put("ptCapPhuHieuId", getPtCapPhuHieuId());
		attributes.put("maTuyen", getMaTuyen());
		attributes.put("tenTuyen", getTenTuyen());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer ptCapPhuHieuId = (Integer)attributes.get("ptCapPhuHieuId");

		if (ptCapPhuHieuId != null) {
			setPtCapPhuHieuId(ptCapPhuHieuId);
		}

		String maTuyen = (String)attributes.get("maTuyen");

		if (maTuyen != null) {
			setMaTuyen(maTuyen);
		}

		String tenTuyen = (String)attributes.get("tenTuyen");

		if (tenTuyen != null) {
			setTenTuyen(tenTuyen);
		}
	}

	@Override
	public int getId() {
		return _id;
	}

	@Override
	public void setId(int id) {
		_id = id;

		if (_qlvtXuLyPhuHieuPhuongTienTuyenRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyPhuHieuPhuongTienTuyenRemoteModel.getClass();

				Method method = clazz.getMethod("setId", int.class);

				method.invoke(_qlvtXuLyPhuHieuPhuongTienTuyenRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPtCapPhuHieuId() {
		return _ptCapPhuHieuId;
	}

	@Override
	public void setPtCapPhuHieuId(int ptCapPhuHieuId) {
		_ptCapPhuHieuId = ptCapPhuHieuId;

		if (_qlvtXuLyPhuHieuPhuongTienTuyenRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyPhuHieuPhuongTienTuyenRemoteModel.getClass();

				Method method = clazz.getMethod("setPtCapPhuHieuId", int.class);

				method.invoke(_qlvtXuLyPhuHieuPhuongTienTuyenRemoteModel,
					ptCapPhuHieuId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaTuyen() {
		return _maTuyen;
	}

	@Override
	public void setMaTuyen(String maTuyen) {
		_maTuyen = maTuyen;

		if (_qlvtXuLyPhuHieuPhuongTienTuyenRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyPhuHieuPhuongTienTuyenRemoteModel.getClass();

				Method method = clazz.getMethod("setMaTuyen", String.class);

				method.invoke(_qlvtXuLyPhuHieuPhuongTienTuyenRemoteModel,
					maTuyen);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenTuyen() {
		return _tenTuyen;
	}

	@Override
	public void setTenTuyen(String tenTuyen) {
		_tenTuyen = tenTuyen;

		if (_qlvtXuLyPhuHieuPhuongTienTuyenRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyPhuHieuPhuongTienTuyenRemoteModel.getClass();

				Method method = clazz.getMethod("setTenTuyen", String.class);

				method.invoke(_qlvtXuLyPhuHieuPhuongTienTuyenRemoteModel,
					tenTuyen);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQLVTXuLyPhuHieuPhuongTienTuyenRemoteModel() {
		return _qlvtXuLyPhuHieuPhuongTienTuyenRemoteModel;
	}

	public void setQLVTXuLyPhuHieuPhuongTienTuyenRemoteModel(
		BaseModel<?> qlvtXuLyPhuHieuPhuongTienTuyenRemoteModel) {
		_qlvtXuLyPhuHieuPhuongTienTuyenRemoteModel = qlvtXuLyPhuHieuPhuongTienTuyenRemoteModel;
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

		Class<?> remoteModelClass = _qlvtXuLyPhuHieuPhuongTienTuyenRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtXuLyPhuHieuPhuongTienTuyenRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QLVTXuLyPhuHieuPhuongTienTuyenLocalServiceUtil.addQLVTXuLyPhuHieuPhuongTienTuyen(this);
		}
		else {
			QLVTXuLyPhuHieuPhuongTienTuyenLocalServiceUtil.updateQLVTXuLyPhuHieuPhuongTienTuyen(this);
		}
	}

	@Override
	public QLVTXuLyPhuHieuPhuongTienTuyen toEscapedModel() {
		return (QLVTXuLyPhuHieuPhuongTienTuyen)ProxyUtil.newProxyInstance(QLVTXuLyPhuHieuPhuongTienTuyen.class.getClassLoader(),
			new Class[] { QLVTXuLyPhuHieuPhuongTienTuyen.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QLVTXuLyPhuHieuPhuongTienTuyenClp clone = new QLVTXuLyPhuHieuPhuongTienTuyenClp();

		clone.setId(getId());
		clone.setPtCapPhuHieuId(getPtCapPhuHieuId());
		clone.setMaTuyen(getMaTuyen());
		clone.setTenTuyen(getTenTuyen());

		return clone;
	}

	@Override
	public int compareTo(
		QLVTXuLyPhuHieuPhuongTienTuyen qlvtXuLyPhuHieuPhuongTienTuyen) {
		int primaryKey = qlvtXuLyPhuHieuPhuongTienTuyen.getPrimaryKey();

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

		if (!(obj instanceof QLVTXuLyPhuHieuPhuongTienTuyenClp)) {
			return false;
		}

		QLVTXuLyPhuHieuPhuongTienTuyenClp qlvtXuLyPhuHieuPhuongTienTuyen = (QLVTXuLyPhuHieuPhuongTienTuyenClp)obj;

		int primaryKey = qlvtXuLyPhuHieuPhuongTienTuyen.getPrimaryKey();

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
		sb.append(", ptCapPhuHieuId=");
		sb.append(getPtCapPhuHieuId());
		sb.append(", maTuyen=");
		sb.append(getMaTuyen());
		sb.append(", tenTuyen=");
		sb.append(getTenTuyen());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append(
			"vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTienTuyen");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ptCapPhuHieuId</column-name><column-value><![CDATA[");
		sb.append(getPtCapPhuHieuId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maTuyen</column-name><column-value><![CDATA[");
		sb.append(getMaTuyen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenTuyen</column-name><column-value><![CDATA[");
		sb.append(getTenTuyen());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _id;
	private int _ptCapPhuHieuId;
	private String _maTuyen;
	private String _tenTuyen;
	private BaseModel<?> _qlvtXuLyPhuHieuPhuongTienTuyenRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbo.dao.capbienhieuphuhieu.service.ClpSerializer.class;
}