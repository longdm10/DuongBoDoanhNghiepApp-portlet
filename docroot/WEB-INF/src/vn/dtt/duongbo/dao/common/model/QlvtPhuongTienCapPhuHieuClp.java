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

package vn.dtt.duongbo.dao.common.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbo.dao.common.service.ClpSerializer;
import vn.dtt.duongbo.dao.common.service.QlvtPhuongTienCapPhuHieuLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class QlvtPhuongTienCapPhuHieuClp extends BaseModelImpl<QlvtPhuongTienCapPhuHieu>
	implements QlvtPhuongTienCapPhuHieu {
	public QlvtPhuongTienCapPhuHieuClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtPhuongTienCapPhuHieu.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtPhuongTienCapPhuHieu.class.getName();
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
		attributes.put("NhanHieu", getNhanHieu());
		attributes.put("BienSo", getBienSo());
		attributes.put("TrongTai", getTrongTai());
		attributes.put("NuocSanXuat", getNuocSanXuat());
		attributes.put("NamSanXuat", getNamSanXuat());
		attributes.put("TuyenHoatDong", getTuyenHoatDong());
		attributes.put("LoaiHinhHoatDong", getLoaiHinhHoatDong());
		attributes.put("NoiDungHoSoId", getNoiDungHoSoId());
		attributes.put("HoSoThuTucId", getHoSoThuTucId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String NhanHieu = (String)attributes.get("NhanHieu");

		if (NhanHieu != null) {
			setNhanHieu(NhanHieu);
		}

		String BienSo = (String)attributes.get("BienSo");

		if (BienSo != null) {
			setBienSo(BienSo);
		}

		Long TrongTai = (Long)attributes.get("TrongTai");

		if (TrongTai != null) {
			setTrongTai(TrongTai);
		}

		String NuocSanXuat = (String)attributes.get("NuocSanXuat");

		if (NuocSanXuat != null) {
			setNuocSanXuat(NuocSanXuat);
		}

		String NamSanXuat = (String)attributes.get("NamSanXuat");

		if (NamSanXuat != null) {
			setNamSanXuat(NamSanXuat);
		}

		String TuyenHoatDong = (String)attributes.get("TuyenHoatDong");

		if (TuyenHoatDong != null) {
			setTuyenHoatDong(TuyenHoatDong);
		}

		String LoaiHinhHoatDong = (String)attributes.get("LoaiHinhHoatDong");

		if (LoaiHinhHoatDong != null) {
			setLoaiHinhHoatDong(LoaiHinhHoatDong);
		}

		Long NoiDungHoSoId = (Long)attributes.get("NoiDungHoSoId");

		if (NoiDungHoSoId != null) {
			setNoiDungHoSoId(NoiDungHoSoId);
		}

		Long HoSoThuTucId = (Long)attributes.get("HoSoThuTucId");

		if (HoSoThuTucId != null) {
			setHoSoThuTucId(HoSoThuTucId);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_qlvtPhuongTienCapPhuHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtPhuongTienCapPhuHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_qlvtPhuongTienCapPhuHieuRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNhanHieu() {
		return _NhanHieu;
	}

	@Override
	public void setNhanHieu(String NhanHieu) {
		_NhanHieu = NhanHieu;

		if (_qlvtPhuongTienCapPhuHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtPhuongTienCapPhuHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setNhanHieu", String.class);

				method.invoke(_qlvtPhuongTienCapPhuHieuRemoteModel, NhanHieu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBienSo() {
		return _BienSo;
	}

	@Override
	public void setBienSo(String BienSo) {
		_BienSo = BienSo;

		if (_qlvtPhuongTienCapPhuHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtPhuongTienCapPhuHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setBienSo", String.class);

				method.invoke(_qlvtPhuongTienCapPhuHieuRemoteModel, BienSo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTrongTai() {
		return _TrongTai;
	}

	@Override
	public void setTrongTai(long TrongTai) {
		_TrongTai = TrongTai;

		if (_qlvtPhuongTienCapPhuHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtPhuongTienCapPhuHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setTrongTai", long.class);

				method.invoke(_qlvtPhuongTienCapPhuHieuRemoteModel, TrongTai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNuocSanXuat() {
		return _NuocSanXuat;
	}

	@Override
	public void setNuocSanXuat(String NuocSanXuat) {
		_NuocSanXuat = NuocSanXuat;

		if (_qlvtPhuongTienCapPhuHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtPhuongTienCapPhuHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setNuocSanXuat", String.class);

				method.invoke(_qlvtPhuongTienCapPhuHieuRemoteModel, NuocSanXuat);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNamSanXuat() {
		return _NamSanXuat;
	}

	@Override
	public void setNamSanXuat(String NamSanXuat) {
		_NamSanXuat = NamSanXuat;

		if (_qlvtPhuongTienCapPhuHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtPhuongTienCapPhuHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setNamSanXuat", String.class);

				method.invoke(_qlvtPhuongTienCapPhuHieuRemoteModel, NamSanXuat);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTuyenHoatDong() {
		return _TuyenHoatDong;
	}

	@Override
	public void setTuyenHoatDong(String TuyenHoatDong) {
		_TuyenHoatDong = TuyenHoatDong;

		if (_qlvtPhuongTienCapPhuHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtPhuongTienCapPhuHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setTuyenHoatDong", String.class);

				method.invoke(_qlvtPhuongTienCapPhuHieuRemoteModel,
					TuyenHoatDong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLoaiHinhHoatDong() {
		return _LoaiHinhHoatDong;
	}

	@Override
	public void setLoaiHinhHoatDong(String LoaiHinhHoatDong) {
		_LoaiHinhHoatDong = LoaiHinhHoatDong;

		if (_qlvtPhuongTienCapPhuHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtPhuongTienCapPhuHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiHinhHoatDong",
						String.class);

				method.invoke(_qlvtPhuongTienCapPhuHieuRemoteModel,
					LoaiHinhHoatDong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNoiDungHoSoId() {
		return _NoiDungHoSoId;
	}

	@Override
	public void setNoiDungHoSoId(long NoiDungHoSoId) {
		_NoiDungHoSoId = NoiDungHoSoId;

		if (_qlvtPhuongTienCapPhuHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtPhuongTienCapPhuHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setNoiDungHoSoId", long.class);

				method.invoke(_qlvtPhuongTienCapPhuHieuRemoteModel,
					NoiDungHoSoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getHoSoThuTucId() {
		return _HoSoThuTucId;
	}

	@Override
	public void setHoSoThuTucId(long HoSoThuTucId) {
		_HoSoThuTucId = HoSoThuTucId;

		if (_qlvtPhuongTienCapPhuHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtPhuongTienCapPhuHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setHoSoThuTucId", long.class);

				method.invoke(_qlvtPhuongTienCapPhuHieuRemoteModel, HoSoThuTucId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQlvtPhuongTienCapPhuHieuRemoteModel() {
		return _qlvtPhuongTienCapPhuHieuRemoteModel;
	}

	public void setQlvtPhuongTienCapPhuHieuRemoteModel(
		BaseModel<?> qlvtPhuongTienCapPhuHieuRemoteModel) {
		_qlvtPhuongTienCapPhuHieuRemoteModel = qlvtPhuongTienCapPhuHieuRemoteModel;
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

		Class<?> remoteModelClass = _qlvtPhuongTienCapPhuHieuRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtPhuongTienCapPhuHieuRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtPhuongTienCapPhuHieuLocalServiceUtil.addQlvtPhuongTienCapPhuHieu(this);
		}
		else {
			QlvtPhuongTienCapPhuHieuLocalServiceUtil.updateQlvtPhuongTienCapPhuHieu(this);
		}
	}

	@Override
	public QlvtPhuongTienCapPhuHieu toEscapedModel() {
		return (QlvtPhuongTienCapPhuHieu)ProxyUtil.newProxyInstance(QlvtPhuongTienCapPhuHieu.class.getClassLoader(),
			new Class[] { QlvtPhuongTienCapPhuHieu.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QlvtPhuongTienCapPhuHieuClp clone = new QlvtPhuongTienCapPhuHieuClp();

		clone.setId(getId());
		clone.setNhanHieu(getNhanHieu());
		clone.setBienSo(getBienSo());
		clone.setTrongTai(getTrongTai());
		clone.setNuocSanXuat(getNuocSanXuat());
		clone.setNamSanXuat(getNamSanXuat());
		clone.setTuyenHoatDong(getTuyenHoatDong());
		clone.setLoaiHinhHoatDong(getLoaiHinhHoatDong());
		clone.setNoiDungHoSoId(getNoiDungHoSoId());
		clone.setHoSoThuTucId(getHoSoThuTucId());

		return clone;
	}

	@Override
	public int compareTo(QlvtPhuongTienCapPhuHieu qlvtPhuongTienCapPhuHieu) {
		int value = 0;

		if (getId() < qlvtPhuongTienCapPhuHieu.getId()) {
			value = -1;
		}
		else if (getId() > qlvtPhuongTienCapPhuHieu.getId()) {
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

		if (!(obj instanceof QlvtPhuongTienCapPhuHieuClp)) {
			return false;
		}

		QlvtPhuongTienCapPhuHieuClp qlvtPhuongTienCapPhuHieu = (QlvtPhuongTienCapPhuHieuClp)obj;

		long primaryKey = qlvtPhuongTienCapPhuHieu.getPrimaryKey();

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
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", NhanHieu=");
		sb.append(getNhanHieu());
		sb.append(", BienSo=");
		sb.append(getBienSo());
		sb.append(", TrongTai=");
		sb.append(getTrongTai());
		sb.append(", NuocSanXuat=");
		sb.append(getNuocSanXuat());
		sb.append(", NamSanXuat=");
		sb.append(getNamSanXuat());
		sb.append(", TuyenHoatDong=");
		sb.append(getTuyenHoatDong());
		sb.append(", LoaiHinhHoatDong=");
		sb.append(getLoaiHinhHoatDong());
		sb.append(", NoiDungHoSoId=");
		sb.append(getNoiDungHoSoId());
		sb.append(", HoSoThuTucId=");
		sb.append(getHoSoThuTucId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NhanHieu</column-name><column-value><![CDATA[");
		sb.append(getNhanHieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>BienSo</column-name><column-value><![CDATA[");
		sb.append(getBienSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TrongTai</column-name><column-value><![CDATA[");
		sb.append(getTrongTai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NuocSanXuat</column-name><column-value><![CDATA[");
		sb.append(getNuocSanXuat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NamSanXuat</column-name><column-value><![CDATA[");
		sb.append(getNamSanXuat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TuyenHoatDong</column-name><column-value><![CDATA[");
		sb.append(getTuyenHoatDong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LoaiHinhHoatDong</column-name><column-value><![CDATA[");
		sb.append(getLoaiHinhHoatDong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NoiDungHoSoId</column-name><column-value><![CDATA[");
		sb.append(getNoiDungHoSoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>HoSoThuTucId</column-name><column-value><![CDATA[");
		sb.append(getHoSoThuTucId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _NhanHieu;
	private String _BienSo;
	private long _TrongTai;
	private String _NuocSanXuat;
	private String _NamSanXuat;
	private String _TuyenHoatDong;
	private String _LoaiHinhHoatDong;
	private long _NoiDungHoSoId;
	private long _HoSoThuTucId;
	private BaseModel<?> _qlvtPhuongTienCapPhuHieuRemoteModel;
}