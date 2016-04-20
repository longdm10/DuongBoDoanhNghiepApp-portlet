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

package vn.dtt.duongbo.dao.lienvan.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbo.dao.lienvan.service.ClpSerializer;
import vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanTuyenLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author NhanNc
 */
public class QlvtXuLyGpLienVanTuyenClp extends BaseModelImpl<QlvtXuLyGpLienVanTuyen>
	implements QlvtXuLyGpLienVanTuyen {
	public QlvtXuLyGpLienVanTuyenClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtXuLyGpLienVanTuyen.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtXuLyGpLienVanTuyen.class.getName();
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
		attributes.put("gpLienVanPhuongTienId", getGpLienVanPhuongTienId());
		attributes.put("maTuyen", getMaTuyen());
		attributes.put("tenTuyen", getTenTuyen());
		attributes.put("tuNgay", getTuNgay());
		attributes.put("denNgay", getDenNgay());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long gpLienVanPhuongTienId = (Long)attributes.get(
				"gpLienVanPhuongTienId");

		if (gpLienVanPhuongTienId != null) {
			setGpLienVanPhuongTienId(gpLienVanPhuongTienId);
		}

		String maTuyen = (String)attributes.get("maTuyen");

		if (maTuyen != null) {
			setMaTuyen(maTuyen);
		}

		String tenTuyen = (String)attributes.get("tenTuyen");

		if (tenTuyen != null) {
			setTenTuyen(tenTuyen);
		}

		Date tuNgay = (Date)attributes.get("tuNgay");

		if (tuNgay != null) {
			setTuNgay(tuNgay);
		}

		Date denNgay = (Date)attributes.get("denNgay");

		if (denNgay != null) {
			setDenNgay(denNgay);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_qlvtXuLyGpLienVanTuyenRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanTuyenRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_qlvtXuLyGpLienVanTuyenRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGpLienVanPhuongTienId() {
		return _gpLienVanPhuongTienId;
	}

	@Override
	public void setGpLienVanPhuongTienId(long gpLienVanPhuongTienId) {
		_gpLienVanPhuongTienId = gpLienVanPhuongTienId;

		if (_qlvtXuLyGpLienVanTuyenRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanTuyenRemoteModel.getClass();

				Method method = clazz.getMethod("setGpLienVanPhuongTienId",
						long.class);

				method.invoke(_qlvtXuLyGpLienVanTuyenRemoteModel,
					gpLienVanPhuongTienId);
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

		if (_qlvtXuLyGpLienVanTuyenRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanTuyenRemoteModel.getClass();

				Method method = clazz.getMethod("setMaTuyen", String.class);

				method.invoke(_qlvtXuLyGpLienVanTuyenRemoteModel, maTuyen);
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

		if (_qlvtXuLyGpLienVanTuyenRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanTuyenRemoteModel.getClass();

				Method method = clazz.getMethod("setTenTuyen", String.class);

				method.invoke(_qlvtXuLyGpLienVanTuyenRemoteModel, tenTuyen);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getTuNgay() {
		return _tuNgay;
	}

	@Override
	public void setTuNgay(Date tuNgay) {
		_tuNgay = tuNgay;

		if (_qlvtXuLyGpLienVanTuyenRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanTuyenRemoteModel.getClass();

				Method method = clazz.getMethod("setTuNgay", Date.class);

				method.invoke(_qlvtXuLyGpLienVanTuyenRemoteModel, tuNgay);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDenNgay() {
		return _denNgay;
	}

	@Override
	public void setDenNgay(Date denNgay) {
		_denNgay = denNgay;

		if (_qlvtXuLyGpLienVanTuyenRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanTuyenRemoteModel.getClass();

				Method method = clazz.getMethod("setDenNgay", Date.class);

				method.invoke(_qlvtXuLyGpLienVanTuyenRemoteModel, denNgay);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQlvtXuLyGpLienVanTuyenRemoteModel() {
		return _qlvtXuLyGpLienVanTuyenRemoteModel;
	}

	public void setQlvtXuLyGpLienVanTuyenRemoteModel(
		BaseModel<?> qlvtXuLyGpLienVanTuyenRemoteModel) {
		_qlvtXuLyGpLienVanTuyenRemoteModel = qlvtXuLyGpLienVanTuyenRemoteModel;
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

		Class<?> remoteModelClass = _qlvtXuLyGpLienVanTuyenRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtXuLyGpLienVanTuyenRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtXuLyGpLienVanTuyenLocalServiceUtil.addQlvtXuLyGpLienVanTuyen(this);
		}
		else {
			QlvtXuLyGpLienVanTuyenLocalServiceUtil.updateQlvtXuLyGpLienVanTuyen(this);
		}
	}

	@Override
	public QlvtXuLyGpLienVanTuyen toEscapedModel() {
		return (QlvtXuLyGpLienVanTuyen)ProxyUtil.newProxyInstance(QlvtXuLyGpLienVanTuyen.class.getClassLoader(),
			new Class[] { QlvtXuLyGpLienVanTuyen.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QlvtXuLyGpLienVanTuyenClp clone = new QlvtXuLyGpLienVanTuyenClp();

		clone.setId(getId());
		clone.setGpLienVanPhuongTienId(getGpLienVanPhuongTienId());
		clone.setMaTuyen(getMaTuyen());
		clone.setTenTuyen(getTenTuyen());
		clone.setTuNgay(getTuNgay());
		clone.setDenNgay(getDenNgay());

		return clone;
	}

	@Override
	public int compareTo(QlvtXuLyGpLienVanTuyen qlvtXuLyGpLienVanTuyen) {
		int value = 0;

		if (getId() < qlvtXuLyGpLienVanTuyen.getId()) {
			value = -1;
		}
		else if (getId() > qlvtXuLyGpLienVanTuyen.getId()) {
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

		if (!(obj instanceof QlvtXuLyGpLienVanTuyenClp)) {
			return false;
		}

		QlvtXuLyGpLienVanTuyenClp qlvtXuLyGpLienVanTuyen = (QlvtXuLyGpLienVanTuyenClp)obj;

		long primaryKey = qlvtXuLyGpLienVanTuyen.getPrimaryKey();

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
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", gpLienVanPhuongTienId=");
		sb.append(getGpLienVanPhuongTienId());
		sb.append(", maTuyen=");
		sb.append(getMaTuyen());
		sb.append(", tenTuyen=");
		sb.append(getTenTuyen());
		sb.append(", tuNgay=");
		sb.append(getTuNgay());
		sb.append(", denNgay=");
		sb.append(getDenNgay());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gpLienVanPhuongTienId</column-name><column-value><![CDATA[");
		sb.append(getGpLienVanPhuongTienId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maTuyen</column-name><column-value><![CDATA[");
		sb.append(getMaTuyen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenTuyen</column-name><column-value><![CDATA[");
		sb.append(getTenTuyen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tuNgay</column-name><column-value><![CDATA[");
		sb.append(getTuNgay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>denNgay</column-name><column-value><![CDATA[");
		sb.append(getDenNgay());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _gpLienVanPhuongTienId;
	private String _maTuyen;
	private String _tenTuyen;
	private Date _tuNgay;
	private Date _denNgay;
	private BaseModel<?> _qlvtXuLyGpLienVanTuyenRemoteModel;
}