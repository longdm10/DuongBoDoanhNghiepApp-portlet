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
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyKTTQuocTeBieuDoXeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author NoiPham
 */
public class QlvtXuLyKTTQuocTeBieuDoXeClp extends BaseModelImpl<QlvtXuLyKTTQuocTeBieuDoXe>
	implements QlvtXuLyKTTQuocTeBieuDoXe {
	public QlvtXuLyKTTQuocTeBieuDoXeClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtXuLyKTTQuocTeBieuDoXe.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtXuLyKTTQuocTeBieuDoXe.class.getName();
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
		attributes.put("gioXuatBen", getGioXuatBen());
		attributes.put("phuXuatBen", getPhuXuatBen());
		attributes.put("tanXuat", getTanXuat());

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

		Integer gioXuatBen = (Integer)attributes.get("gioXuatBen");

		if (gioXuatBen != null) {
			setGioXuatBen(gioXuatBen);
		}

		Integer phuXuatBen = (Integer)attributes.get("phuXuatBen");

		if (phuXuatBen != null) {
			setPhuXuatBen(phuXuatBen);
		}

		Integer tanXuat = (Integer)attributes.get("tanXuat");

		if (tanXuat != null) {
			setTanXuat(tanXuat);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_qlvtXuLyKTTQuocTeBieuDoXeRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTeBieuDoXeRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_qlvtXuLyKTTQuocTeBieuDoXeRemoteModel, id);
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

		if (_qlvtXuLyKTTQuocTeBieuDoXeRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTeBieuDoXeRemoteModel.getClass();

				Method method = clazz.getMethod("setKttQuocTeId", int.class);

				method.invoke(_qlvtXuLyKTTQuocTeBieuDoXeRemoteModel, kttQuocTeId);
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

		if (_qlvtXuLyKTTQuocTeBieuDoXeRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTeBieuDoXeRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiLuot", String.class);

				method.invoke(_qlvtXuLyKTTQuocTeBieuDoXeRemoteModel, loaiLuot);
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

		if (_qlvtXuLyKTTQuocTeBieuDoXeRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTeBieuDoXeRemoteModel.getClass();

				Method method = clazz.getMethod("setSoThuTuLuot", int.class);

				method.invoke(_qlvtXuLyKTTQuocTeBieuDoXeRemoteModel, soThuTuLuot);
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

		if (_qlvtXuLyKTTQuocTeBieuDoXeRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTeBieuDoXeRemoteModel.getClass();

				Method method = clazz.getMethod("setMaBen", String.class);

				method.invoke(_qlvtXuLyKTTQuocTeBieuDoXeRemoteModel, maBen);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getGioXuatBen() {
		return _gioXuatBen;
	}

	@Override
	public void setGioXuatBen(int gioXuatBen) {
		_gioXuatBen = gioXuatBen;

		if (_qlvtXuLyKTTQuocTeBieuDoXeRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTeBieuDoXeRemoteModel.getClass();

				Method method = clazz.getMethod("setGioXuatBen", int.class);

				method.invoke(_qlvtXuLyKTTQuocTeBieuDoXeRemoteModel, gioXuatBen);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPhuXuatBen() {
		return _phuXuatBen;
	}

	@Override
	public void setPhuXuatBen(int phuXuatBen) {
		_phuXuatBen = phuXuatBen;

		if (_qlvtXuLyKTTQuocTeBieuDoXeRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTeBieuDoXeRemoteModel.getClass();

				Method method = clazz.getMethod("setPhuXuatBen", int.class);

				method.invoke(_qlvtXuLyKTTQuocTeBieuDoXeRemoteModel, phuXuatBen);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTanXuat() {
		return _tanXuat;
	}

	@Override
	public void setTanXuat(int tanXuat) {
		_tanXuat = tanXuat;

		if (_qlvtXuLyKTTQuocTeBieuDoXeRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTeBieuDoXeRemoteModel.getClass();

				Method method = clazz.getMethod("setTanXuat", int.class);

				method.invoke(_qlvtXuLyKTTQuocTeBieuDoXeRemoteModel, tanXuat);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQlvtXuLyKTTQuocTeBieuDoXeRemoteModel() {
		return _qlvtXuLyKTTQuocTeBieuDoXeRemoteModel;
	}

	public void setQlvtXuLyKTTQuocTeBieuDoXeRemoteModel(
		BaseModel<?> qlvtXuLyKTTQuocTeBieuDoXeRemoteModel) {
		_qlvtXuLyKTTQuocTeBieuDoXeRemoteModel = qlvtXuLyKTTQuocTeBieuDoXeRemoteModel;
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

		Class<?> remoteModelClass = _qlvtXuLyKTTQuocTeBieuDoXeRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtXuLyKTTQuocTeBieuDoXeRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtXuLyKTTQuocTeBieuDoXeLocalServiceUtil.addQlvtXuLyKTTQuocTeBieuDoXe(this);
		}
		else {
			QlvtXuLyKTTQuocTeBieuDoXeLocalServiceUtil.updateQlvtXuLyKTTQuocTeBieuDoXe(this);
		}
	}

	@Override
	public QlvtXuLyKTTQuocTeBieuDoXe toEscapedModel() {
		return (QlvtXuLyKTTQuocTeBieuDoXe)ProxyUtil.newProxyInstance(QlvtXuLyKTTQuocTeBieuDoXe.class.getClassLoader(),
			new Class[] { QlvtXuLyKTTQuocTeBieuDoXe.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QlvtXuLyKTTQuocTeBieuDoXeClp clone = new QlvtXuLyKTTQuocTeBieuDoXeClp();

		clone.setId(getId());
		clone.setKttQuocTeId(getKttQuocTeId());
		clone.setLoaiLuot(getLoaiLuot());
		clone.setSoThuTuLuot(getSoThuTuLuot());
		clone.setMaBen(getMaBen());
		clone.setGioXuatBen(getGioXuatBen());
		clone.setPhuXuatBen(getPhuXuatBen());
		clone.setTanXuat(getTanXuat());

		return clone;
	}

	@Override
	public int compareTo(QlvtXuLyKTTQuocTeBieuDoXe qlvtXuLyKTTQuocTeBieuDoXe) {
		int value = 0;

		if (getId() < qlvtXuLyKTTQuocTeBieuDoXe.getId()) {
			value = -1;
		}
		else if (getId() > qlvtXuLyKTTQuocTeBieuDoXe.getId()) {
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

		if (!(obj instanceof QlvtXuLyKTTQuocTeBieuDoXeClp)) {
			return false;
		}

		QlvtXuLyKTTQuocTeBieuDoXeClp qlvtXuLyKTTQuocTeBieuDoXe = (QlvtXuLyKTTQuocTeBieuDoXeClp)obj;

		long primaryKey = qlvtXuLyKTTQuocTeBieuDoXe.getPrimaryKey();

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
		StringBundler sb = new StringBundler(17);

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
		sb.append(", gioXuatBen=");
		sb.append(getGioXuatBen());
		sb.append(", phuXuatBen=");
		sb.append(getPhuXuatBen());
		sb.append(", tanXuat=");
		sb.append(getTanXuat());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXe");
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
			"<column><column-name>gioXuatBen</column-name><column-value><![CDATA[");
		sb.append(getGioXuatBen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phuXuatBen</column-name><column-value><![CDATA[");
		sb.append(getPhuXuatBen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tanXuat</column-name><column-value><![CDATA[");
		sb.append(getTanXuat());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private int _kttQuocTeId;
	private String _loaiLuot;
	private int _soThuTuLuot;
	private String _maBen;
	private int _gioXuatBen;
	private int _phuXuatBen;
	private int _tanXuat;
	private BaseModel<?> _qlvtXuLyKTTQuocTeBieuDoXeRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbo.dao.quocte.service.ClpSerializer.class;
}