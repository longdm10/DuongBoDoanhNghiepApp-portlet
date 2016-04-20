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
import vn.dtt.duongbo.dao.lienvan.service.QlvtCapPhepGplvPhuongTienVanTaiLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author NhanNc
 */
public class QlvtCapPhepGplvPhuongTienVanTaiClp extends BaseModelImpl<QlvtCapPhepGplvPhuongTienVanTai>
	implements QlvtCapPhepGplvPhuongTienVanTai {
	public QlvtCapPhepGplvPhuongTienVanTaiClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtCapPhepGplvPhuongTienVanTai.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtCapPhepGplvPhuongTienVanTai.class.getName();
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
		attributes.put("capphepGplienvanPhuongtienId",
			getCapphepGplienvanPhuongtienId());
		attributes.put("capphepPhuongtienvantaiId",
			getCapphepPhuongtienvantaiId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long capphepGplienvanPhuongtienId = (Long)attributes.get(
				"capphepGplienvanPhuongtienId");

		if (capphepGplienvanPhuongtienId != null) {
			setCapphepGplienvanPhuongtienId(capphepGplienvanPhuongtienId);
		}

		Long capphepPhuongtienvantaiId = (Long)attributes.get(
				"capphepPhuongtienvantaiId");

		if (capphepPhuongtienvantaiId != null) {
			setCapphepPhuongtienvantaiId(capphepPhuongtienvantaiId);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_qlvtCapPhepGplvPhuongTienVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGplvPhuongTienVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_qlvtCapPhepGplvPhuongTienVanTaiRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCapphepGplienvanPhuongtienId() {
		return _capphepGplienvanPhuongtienId;
	}

	@Override
	public void setCapphepGplienvanPhuongtienId(
		long capphepGplienvanPhuongtienId) {
		_capphepGplienvanPhuongtienId = capphepGplienvanPhuongtienId;

		if (_qlvtCapPhepGplvPhuongTienVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGplvPhuongTienVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setCapphepGplienvanPhuongtienId",
						long.class);

				method.invoke(_qlvtCapPhepGplvPhuongTienVanTaiRemoteModel,
					capphepGplienvanPhuongtienId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCapphepPhuongtienvantaiId() {
		return _capphepPhuongtienvantaiId;
	}

	@Override
	public void setCapphepPhuongtienvantaiId(long capphepPhuongtienvantaiId) {
		_capphepPhuongtienvantaiId = capphepPhuongtienvantaiId;

		if (_qlvtCapPhepGplvPhuongTienVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGplvPhuongTienVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setCapphepPhuongtienvantaiId",
						long.class);

				method.invoke(_qlvtCapPhepGplvPhuongTienVanTaiRemoteModel,
					capphepPhuongtienvantaiId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQlvtCapPhepGplvPhuongTienVanTaiRemoteModel() {
		return _qlvtCapPhepGplvPhuongTienVanTaiRemoteModel;
	}

	public void setQlvtCapPhepGplvPhuongTienVanTaiRemoteModel(
		BaseModel<?> qlvtCapPhepGplvPhuongTienVanTaiRemoteModel) {
		_qlvtCapPhepGplvPhuongTienVanTaiRemoteModel = qlvtCapPhepGplvPhuongTienVanTaiRemoteModel;
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

		Class<?> remoteModelClass = _qlvtCapPhepGplvPhuongTienVanTaiRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtCapPhepGplvPhuongTienVanTaiRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtCapPhepGplvPhuongTienVanTaiLocalServiceUtil.addQlvtCapPhepGplvPhuongTienVanTai(this);
		}
		else {
			QlvtCapPhepGplvPhuongTienVanTaiLocalServiceUtil.updateQlvtCapPhepGplvPhuongTienVanTai(this);
		}
	}

	@Override
	public QlvtCapPhepGplvPhuongTienVanTai toEscapedModel() {
		return (QlvtCapPhepGplvPhuongTienVanTai)ProxyUtil.newProxyInstance(QlvtCapPhepGplvPhuongTienVanTai.class.getClassLoader(),
			new Class[] { QlvtCapPhepGplvPhuongTienVanTai.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QlvtCapPhepGplvPhuongTienVanTaiClp clone = new QlvtCapPhepGplvPhuongTienVanTaiClp();

		clone.setId(getId());
		clone.setCapphepGplienvanPhuongtienId(getCapphepGplienvanPhuongtienId());
		clone.setCapphepPhuongtienvantaiId(getCapphepPhuongtienvantaiId());

		return clone;
	}

	@Override
	public int compareTo(
		QlvtCapPhepGplvPhuongTienVanTai qlvtCapPhepGplvPhuongTienVanTai) {
		int value = 0;

		if (getId() < qlvtCapPhepGplvPhuongTienVanTai.getId()) {
			value = -1;
		}
		else if (getId() > qlvtCapPhepGplvPhuongTienVanTai.getId()) {
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

		if (!(obj instanceof QlvtCapPhepGplvPhuongTienVanTaiClp)) {
			return false;
		}

		QlvtCapPhepGplvPhuongTienVanTaiClp qlvtCapPhepGplvPhuongTienVanTai = (QlvtCapPhepGplvPhuongTienVanTaiClp)obj;

		long primaryKey = qlvtCapPhepGplvPhuongTienVanTai.getPrimaryKey();

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
		sb.append(", capphepGplienvanPhuongtienId=");
		sb.append(getCapphepGplienvanPhuongtienId());
		sb.append(", capphepPhuongtienvantaiId=");
		sb.append(getCapphepPhuongtienvantaiId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append(
			"vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvPhuongTienVanTai");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>capphepGplienvanPhuongtienId</column-name><column-value><![CDATA[");
		sb.append(getCapphepGplienvanPhuongtienId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>capphepPhuongtienvantaiId</column-name><column-value><![CDATA[");
		sb.append(getCapphepPhuongtienvantaiId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _capphepGplienvanPhuongtienId;
	private long _capphepPhuongtienvantaiId;
	private BaseModel<?> _qlvtCapPhepGplvPhuongTienVanTaiRemoteModel;
}