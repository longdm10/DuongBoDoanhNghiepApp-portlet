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
import vn.dtt.duongbo.dao.lienvan.service.QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author NhanNc
 */
public class QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiClp
	extends BaseModelImpl<QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi>
	implements QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi {
	public QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.class.getName();
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
		attributes.put("capGplienvanPhuongtienId", getCapGplienvanPhuongtienId());
		attributes.put("maTramDungNghi", getMaTramDungNghi());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long capGplienvanPhuongtienId = (Long)attributes.get(
				"capGplienvanPhuongtienId");

		if (capGplienvanPhuongtienId != null) {
			setCapGplienvanPhuongtienId(capGplienvanPhuongtienId);
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

		if (_qlvtCapPhepGplvPhuongTienVanTaiTramdungnghiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGplvPhuongTienVanTaiTramdungnghiRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_qlvtCapPhepGplvPhuongTienVanTaiTramdungnghiRemoteModel,
					id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCapGplienvanPhuongtienId() {
		return _capGplienvanPhuongtienId;
	}

	@Override
	public void setCapGplienvanPhuongtienId(long capGplienvanPhuongtienId) {
		_capGplienvanPhuongtienId = capGplienvanPhuongtienId;

		if (_qlvtCapPhepGplvPhuongTienVanTaiTramdungnghiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGplvPhuongTienVanTaiTramdungnghiRemoteModel.getClass();

				Method method = clazz.getMethod("setCapGplienvanPhuongtienId",
						long.class);

				method.invoke(_qlvtCapPhepGplvPhuongTienVanTaiTramdungnghiRemoteModel,
					capGplienvanPhuongtienId);
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

		if (_qlvtCapPhepGplvPhuongTienVanTaiTramdungnghiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGplvPhuongTienVanTaiTramdungnghiRemoteModel.getClass();

				Method method = clazz.getMethod("setMaTramDungNghi",
						String.class);

				method.invoke(_qlvtCapPhepGplvPhuongTienVanTaiTramdungnghiRemoteModel,
					maTramDungNghi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQlvtCapPhepGplvPhuongTienVanTaiTramdungnghiRemoteModel() {
		return _qlvtCapPhepGplvPhuongTienVanTaiTramdungnghiRemoteModel;
	}

	public void setQlvtCapPhepGplvPhuongTienVanTaiTramdungnghiRemoteModel(
		BaseModel<?> qlvtCapPhepGplvPhuongTienVanTaiTramdungnghiRemoteModel) {
		_qlvtCapPhepGplvPhuongTienVanTaiTramdungnghiRemoteModel = qlvtCapPhepGplvPhuongTienVanTaiTramdungnghiRemoteModel;
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

		Class<?> remoteModelClass = _qlvtCapPhepGplvPhuongTienVanTaiTramdungnghiRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtCapPhepGplvPhuongTienVanTaiTramdungnghiRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiLocalServiceUtil.addQlvtCapPhepGplvPhuongTienVanTaiTramdungnghi(this);
		}
		else {
			QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiLocalServiceUtil.updateQlvtCapPhepGplvPhuongTienVanTaiTramdungnghi(this);
		}
	}

	@Override
	public QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi toEscapedModel() {
		return (QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi)ProxyUtil.newProxyInstance(QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.class.getClassLoader(),
			new Class[] { QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiClp clone = new QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiClp();

		clone.setId(getId());
		clone.setCapGplienvanPhuongtienId(getCapGplienvanPhuongtienId());
		clone.setMaTramDungNghi(getMaTramDungNghi());

		return clone;
	}

	@Override
	public int compareTo(
		QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi) {
		int value = 0;

		if (getId() < qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.getId()) {
			value = -1;
		}
		else if (getId() > qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.getId()) {
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

		if (!(obj instanceof QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiClp)) {
			return false;
		}

		QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiClp qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi =
			(QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiClp)obj;

		long primaryKey = qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.getPrimaryKey();

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
		sb.append(", capGplienvanPhuongtienId=");
		sb.append(getCapGplienvanPhuongtienId());
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
			"vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>capGplienvanPhuongtienId</column-name><column-value><![CDATA[");
		sb.append(getCapGplienvanPhuongtienId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maTramDungNghi</column-name><column-value><![CDATA[");
		sb.append(getMaTramDungNghi());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _capGplienvanPhuongtienId;
	private String _maTramDungNghi;
	private BaseModel<?> _qlvtCapPhepGplvPhuongTienVanTaiTramdungnghiRemoteModel;
}