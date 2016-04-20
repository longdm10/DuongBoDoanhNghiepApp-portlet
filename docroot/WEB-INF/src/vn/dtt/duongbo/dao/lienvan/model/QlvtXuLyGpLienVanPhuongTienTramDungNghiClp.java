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
import vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author NhanNc
 */
public class QlvtXuLyGpLienVanPhuongTienTramDungNghiClp extends BaseModelImpl<QlvtXuLyGpLienVanPhuongTienTramDungNghi>
	implements QlvtXuLyGpLienVanPhuongTienTramDungNghi {
	public QlvtXuLyGpLienVanPhuongTienTramDungNghiClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtXuLyGpLienVanPhuongTienTramDungNghi.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtXuLyGpLienVanPhuongTienTramDungNghi.class.getName();
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
		attributes.put("capGplxPhuongTienId", getCapGplxPhuongTienId());
		attributes.put("maTramDungNghi", getMaTramDungNghi());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long capGplxPhuongTienId = (Long)attributes.get("capGplxPhuongTienId");

		if (capGplxPhuongTienId != null) {
			setCapGplxPhuongTienId(capGplxPhuongTienId);
		}

		String maTramDungNghi = (String)attributes.get("maTramDungNghi");

		if (maTramDungNghi != null) {
			setMaTramDungNghi(maTramDungNghi);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_qlvtXuLyGpLienVanPhuongTienTramDungNghiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanPhuongTienTramDungNghiRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_qlvtXuLyGpLienVanPhuongTienTramDungNghiRemoteModel,
					id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCapGplxPhuongTienId() {
		return _capGplxPhuongTienId;
	}

	@Override
	public void setCapGplxPhuongTienId(long capGplxPhuongTienId) {
		_capGplxPhuongTienId = capGplxPhuongTienId;

		if (_qlvtXuLyGpLienVanPhuongTienTramDungNghiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanPhuongTienTramDungNghiRemoteModel.getClass();

				Method method = clazz.getMethod("setCapGplxPhuongTienId",
						long.class);

				method.invoke(_qlvtXuLyGpLienVanPhuongTienTramDungNghiRemoteModel,
					capGplxPhuongTienId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaTramDungNghi() {
		return _maTramDungNghi;
	}

	@Override
	public void setMaTramDungNghi(String maTramDungNghi) {
		_maTramDungNghi = maTramDungNghi;

		if (_qlvtXuLyGpLienVanPhuongTienTramDungNghiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanPhuongTienTramDungNghiRemoteModel.getClass();

				Method method = clazz.getMethod("setMaTramDungNghi",
						String.class);

				method.invoke(_qlvtXuLyGpLienVanPhuongTienTramDungNghiRemoteModel,
					maTramDungNghi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQlvtXuLyGpLienVanPhuongTienTramDungNghiRemoteModel() {
		return _qlvtXuLyGpLienVanPhuongTienTramDungNghiRemoteModel;
	}

	public void setQlvtXuLyGpLienVanPhuongTienTramDungNghiRemoteModel(
		BaseModel<?> qlvtXuLyGpLienVanPhuongTienTramDungNghiRemoteModel) {
		_qlvtXuLyGpLienVanPhuongTienTramDungNghiRemoteModel = qlvtXuLyGpLienVanPhuongTienTramDungNghiRemoteModel;
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

		Class<?> remoteModelClass = _qlvtXuLyGpLienVanPhuongTienTramDungNghiRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtXuLyGpLienVanPhuongTienTramDungNghiRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalServiceUtil.addQlvtXuLyGpLienVanPhuongTienTramDungNghi(this);
		}
		else {
			QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalServiceUtil.updateQlvtXuLyGpLienVanPhuongTienTramDungNghi(this);
		}
	}

	@Override
	public QlvtXuLyGpLienVanPhuongTienTramDungNghi toEscapedModel() {
		return (QlvtXuLyGpLienVanPhuongTienTramDungNghi)ProxyUtil.newProxyInstance(QlvtXuLyGpLienVanPhuongTienTramDungNghi.class.getClassLoader(),
			new Class[] { QlvtXuLyGpLienVanPhuongTienTramDungNghi.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QlvtXuLyGpLienVanPhuongTienTramDungNghiClp clone = new QlvtXuLyGpLienVanPhuongTienTramDungNghiClp();

		clone.setId(getId());
		clone.setCapGplxPhuongTienId(getCapGplxPhuongTienId());
		clone.setMaTramDungNghi(getMaTramDungNghi());

		return clone;
	}

	@Override
	public int compareTo(
		QlvtXuLyGpLienVanPhuongTienTramDungNghi qlvtXuLyGpLienVanPhuongTienTramDungNghi) {
		int value = 0;

		if (getId() < qlvtXuLyGpLienVanPhuongTienTramDungNghi.getId()) {
			value = -1;
		}
		else if (getId() > qlvtXuLyGpLienVanPhuongTienTramDungNghi.getId()) {
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

		if (!(obj instanceof QlvtXuLyGpLienVanPhuongTienTramDungNghiClp)) {
			return false;
		}

		QlvtXuLyGpLienVanPhuongTienTramDungNghiClp qlvtXuLyGpLienVanPhuongTienTramDungNghi =
			(QlvtXuLyGpLienVanPhuongTienTramDungNghiClp)obj;

		long primaryKey = qlvtXuLyGpLienVanPhuongTienTramDungNghi.getPrimaryKey();

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
		sb.append(", capGplxPhuongTienId=");
		sb.append(getCapGplxPhuongTienId());
		sb.append(", maTramDungNghi=");
		sb.append(getMaTramDungNghi());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append(
			"vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>capGplxPhuongTienId</column-name><column-value><![CDATA[");
		sb.append(getCapGplxPhuongTienId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maTramDungNghi</column-name><column-value><![CDATA[");
		sb.append(getMaTramDungNghi());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _capGplxPhuongTienId;
	private String _maTramDungNghi;
	private BaseModel<?> _qlvtXuLyGpLienVanPhuongTienTramDungNghiRemoteModel;
}