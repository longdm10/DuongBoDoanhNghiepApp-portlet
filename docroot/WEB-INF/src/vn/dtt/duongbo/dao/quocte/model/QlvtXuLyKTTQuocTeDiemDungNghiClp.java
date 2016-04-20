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

package vn.dtt.duongbo.dao.quocte.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbo.dao.quocte.service.ClpSerializer;
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyKTTQuocTeDiemDungNghiLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author NoiPham
 */
public class QlvtXuLyKTTQuocTeDiemDungNghiClp extends BaseModelImpl<QlvtXuLyKTTQuocTeDiemDungNghi>
	implements QlvtXuLyKTTQuocTeDiemDungNghi {
	public QlvtXuLyKTTQuocTeDiemDungNghiClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtXuLyKTTQuocTeDiemDungNghi.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtXuLyKTTQuocTeDiemDungNghi.class.getName();
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
		attributes.put("kttQuocTeId", getKttQuocTeId());
		attributes.put("loaiLuot", getLoaiLuot());
		attributes.put("soThuTuLuot", getSoThuTuLuot());
		attributes.put("maBen", getMaBen());
		attributes.put("soGioDungNghi", getSoGioDungNghi());
		attributes.put("soPhutDungNghi", getSoPhutDungNghi());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer kttQuocTeId = (Integer)attributes.get("kttQuocTeId");

		if (kttQuocTeId != null) {
			setKttQuocTeId(kttQuocTeId);
		}

		String loaiLuot = (String)attributes.get("loaiLuot");

		if (loaiLuot != null) {
			setLoaiLuot(loaiLuot);
		}

		Integer soThuTuLuot = (Integer)attributes.get("soThuTuLuot");

		if (soThuTuLuot != null) {
			setSoThuTuLuot(soThuTuLuot);
		}

		String maBen = (String)attributes.get("maBen");

		if (maBen != null) {
			setMaBen(maBen);
		}

		Integer soGioDungNghi = (Integer)attributes.get("soGioDungNghi");

		if (soGioDungNghi != null) {
			setSoGioDungNghi(soGioDungNghi);
		}

		Integer soPhutDungNghi = (Integer)attributes.get("soPhutDungNghi");

		if (soPhutDungNghi != null) {
			setSoPhutDungNghi(soPhutDungNghi);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_qlvtXuLyKTTQuocTeDiemDungNghiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTeDiemDungNghiRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_qlvtXuLyKTTQuocTeDiemDungNghiRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getKttQuocTeId() {
		return _kttQuocTeId;
	}

	@Override
	public void setKttQuocTeId(int kttQuocTeId) {
		_kttQuocTeId = kttQuocTeId;

		if (_qlvtXuLyKTTQuocTeDiemDungNghiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTeDiemDungNghiRemoteModel.getClass();

				Method method = clazz.getMethod("setKttQuocTeId", int.class);

				method.invoke(_qlvtXuLyKTTQuocTeDiemDungNghiRemoteModel,
					kttQuocTeId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLoaiLuot() {
		return _loaiLuot;
	}

	@Override
	public void setLoaiLuot(String loaiLuot) {
		_loaiLuot = loaiLuot;

		if (_qlvtXuLyKTTQuocTeDiemDungNghiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTeDiemDungNghiRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiLuot", String.class);

				method.invoke(_qlvtXuLyKTTQuocTeDiemDungNghiRemoteModel,
					loaiLuot);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoThuTuLuot() {
		return _soThuTuLuot;
	}

	@Override
	public void setSoThuTuLuot(int soThuTuLuot) {
		_soThuTuLuot = soThuTuLuot;

		if (_qlvtXuLyKTTQuocTeDiemDungNghiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTeDiemDungNghiRemoteModel.getClass();

				Method method = clazz.getMethod("setSoThuTuLuot", int.class);

				method.invoke(_qlvtXuLyKTTQuocTeDiemDungNghiRemoteModel,
					soThuTuLuot);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaBen() {
		return _maBen;
	}

	@Override
	public void setMaBen(String maBen) {
		_maBen = maBen;

		if (_qlvtXuLyKTTQuocTeDiemDungNghiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTeDiemDungNghiRemoteModel.getClass();

				Method method = clazz.getMethod("setMaBen", String.class);

				method.invoke(_qlvtXuLyKTTQuocTeDiemDungNghiRemoteModel, maBen);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoGioDungNghi() {
		return _soGioDungNghi;
	}

	@Override
	public void setSoGioDungNghi(int soGioDungNghi) {
		_soGioDungNghi = soGioDungNghi;

		if (_qlvtXuLyKTTQuocTeDiemDungNghiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTeDiemDungNghiRemoteModel.getClass();

				Method method = clazz.getMethod("setSoGioDungNghi", int.class);

				method.invoke(_qlvtXuLyKTTQuocTeDiemDungNghiRemoteModel,
					soGioDungNghi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoPhutDungNghi() {
		return _soPhutDungNghi;
	}

	@Override
	public void setSoPhutDungNghi(int soPhutDungNghi) {
		_soPhutDungNghi = soPhutDungNghi;

		if (_qlvtXuLyKTTQuocTeDiemDungNghiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTeDiemDungNghiRemoteModel.getClass();

				Method method = clazz.getMethod("setSoPhutDungNghi", int.class);

				method.invoke(_qlvtXuLyKTTQuocTeDiemDungNghiRemoteModel,
					soPhutDungNghi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQlvtXuLyKTTQuocTeDiemDungNghiRemoteModel() {
		return _qlvtXuLyKTTQuocTeDiemDungNghiRemoteModel;
	}

	public void setQlvtXuLyKTTQuocTeDiemDungNghiRemoteModel(
		BaseModel<?> qlvtXuLyKTTQuocTeDiemDungNghiRemoteModel) {
		_qlvtXuLyKTTQuocTeDiemDungNghiRemoteModel = qlvtXuLyKTTQuocTeDiemDungNghiRemoteModel;
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

		Class<?> remoteModelClass = _qlvtXuLyKTTQuocTeDiemDungNghiRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtXuLyKTTQuocTeDiemDungNghiRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtXuLyKTTQuocTeDiemDungNghiLocalServiceUtil.addQlvtXuLyKTTQuocTeDiemDungNghi(this);
		}
		else {
			QlvtXuLyKTTQuocTeDiemDungNghiLocalServiceUtil.updateQlvtXuLyKTTQuocTeDiemDungNghi(this);
		}
	}

	@Override
	public QlvtXuLyKTTQuocTeDiemDungNghi toEscapedModel() {
		return (QlvtXuLyKTTQuocTeDiemDungNghi)ProxyUtil.newProxyInstance(QlvtXuLyKTTQuocTeDiemDungNghi.class.getClassLoader(),
			new Class[] { QlvtXuLyKTTQuocTeDiemDungNghi.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QlvtXuLyKTTQuocTeDiemDungNghiClp clone = new QlvtXuLyKTTQuocTeDiemDungNghiClp();

		clone.setId(getId());
		clone.setKttQuocTeId(getKttQuocTeId());
		clone.setLoaiLuot(getLoaiLuot());
		clone.setSoThuTuLuot(getSoThuTuLuot());
		clone.setMaBen(getMaBen());
		clone.setSoGioDungNghi(getSoGioDungNghi());
		clone.setSoPhutDungNghi(getSoPhutDungNghi());

		return clone;
	}

	@Override
	public int compareTo(
		QlvtXuLyKTTQuocTeDiemDungNghi qlvtXuLyKTTQuocTeDiemDungNghi) {
		int value = 0;

		if (getId() < qlvtXuLyKTTQuocTeDiemDungNghi.getId()) {
			value = -1;
		}
		else if (getId() > qlvtXuLyKTTQuocTeDiemDungNghi.getId()) {
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

		if (!(obj instanceof QlvtXuLyKTTQuocTeDiemDungNghiClp)) {
			return false;
		}

		QlvtXuLyKTTQuocTeDiemDungNghiClp qlvtXuLyKTTQuocTeDiemDungNghi = (QlvtXuLyKTTQuocTeDiemDungNghiClp)obj;

		long primaryKey = qlvtXuLyKTTQuocTeDiemDungNghi.getPrimaryKey();

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
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", kttQuocTeId=");
		sb.append(getKttQuocTeId());
		sb.append(", loaiLuot=");
		sb.append(getLoaiLuot());
		sb.append(", soThuTuLuot=");
		sb.append(getSoThuTuLuot());
		sb.append(", maBen=");
		sb.append(getMaBen());
		sb.append(", soGioDungNghi=");
		sb.append(getSoGioDungNghi());
		sb.append(", soPhutDungNghi=");
		sb.append(getSoPhutDungNghi());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append(
			"vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeDiemDungNghi");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kttQuocTeId</column-name><column-value><![CDATA[");
		sb.append(getKttQuocTeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiLuot</column-name><column-value><![CDATA[");
		sb.append(getLoaiLuot());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soThuTuLuot</column-name><column-value><![CDATA[");
		sb.append(getSoThuTuLuot());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maBen</column-name><column-value><![CDATA[");
		sb.append(getMaBen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soGioDungNghi</column-name><column-value><![CDATA[");
		sb.append(getSoGioDungNghi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soPhutDungNghi</column-name><column-value><![CDATA[");
		sb.append(getSoPhutDungNghi());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private int _kttQuocTeId;
	private String _loaiLuot;
	private int _soThuTuLuot;
	private String _maBen;
	private int _soGioDungNghi;
	private int _soPhutDungNghi;
	private BaseModel<?> _qlvtXuLyKTTQuocTeDiemDungNghiRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbo.dao.quocte.service.ClpSerializer.class;
}