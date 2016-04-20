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
import vn.dtt.duongbo.dao.common.service.QlvtLoaiHinhHoatDongDnLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class QlvtLoaiHinhHoatDongDnClp extends BaseModelImpl<QlvtLoaiHinhHoatDongDn>
	implements QlvtLoaiHinhHoatDongDn {
	public QlvtLoaiHinhHoatDongDnClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtLoaiHinhHoatDongDn.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtLoaiHinhHoatDongDn.class.getName();
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
		attributes.put("hoSoThuTucId", getHoSoThuTucId());
		attributes.put("noiDungHoSoId", getNoiDungHoSoId());
		attributes.put("maLoaiHinhHoatDong", getMaLoaiHinhHoatDong());
		attributes.put("maMauSon", getMaMauSon());
		attributes.put("maPhamViHoatDong", getMaPhamViHoatDong());
		attributes.put("soLuongPhuongTien", getSoLuongPhuongTien());
		attributes.put("thietBiGiamSatHanhTrinh", getThietBiGiamSatHanhTrinh());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long hoSoThuTucId = (Long)attributes.get("hoSoThuTucId");

		if (hoSoThuTucId != null) {
			setHoSoThuTucId(hoSoThuTucId);
		}

		Long noiDungHoSoId = (Long)attributes.get("noiDungHoSoId");

		if (noiDungHoSoId != null) {
			setNoiDungHoSoId(noiDungHoSoId);
		}

		String maLoaiHinhHoatDong = (String)attributes.get("maLoaiHinhHoatDong");

		if (maLoaiHinhHoatDong != null) {
			setMaLoaiHinhHoatDong(maLoaiHinhHoatDong);
		}

		String maMauSon = (String)attributes.get("maMauSon");

		if (maMauSon != null) {
			setMaMauSon(maMauSon);
		}

		String maPhamViHoatDong = (String)attributes.get("maPhamViHoatDong");

		if (maPhamViHoatDong != null) {
			setMaPhamViHoatDong(maPhamViHoatDong);
		}

		String soLuongPhuongTien = (String)attributes.get("soLuongPhuongTien");

		if (soLuongPhuongTien != null) {
			setSoLuongPhuongTien(soLuongPhuongTien);
		}

		String thietBiGiamSatHanhTrinh = (String)attributes.get(
				"thietBiGiamSatHanhTrinh");

		if (thietBiGiamSatHanhTrinh != null) {
			setThietBiGiamSatHanhTrinh(thietBiGiamSatHanhTrinh);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_qlvtLoaiHinhHoatDongDnRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtLoaiHinhHoatDongDnRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_qlvtLoaiHinhHoatDongDnRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getHoSoThuTucId() {
		return _hoSoThuTucId;
	}

	@Override
	public void setHoSoThuTucId(long hoSoThuTucId) {
		_hoSoThuTucId = hoSoThuTucId;

		if (_qlvtLoaiHinhHoatDongDnRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtLoaiHinhHoatDongDnRemoteModel.getClass();

				Method method = clazz.getMethod("setHoSoThuTucId", long.class);

				method.invoke(_qlvtLoaiHinhHoatDongDnRemoteModel, hoSoThuTucId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNoiDungHoSoId() {
		return _noiDungHoSoId;
	}

	@Override
	public void setNoiDungHoSoId(long noiDungHoSoId) {
		_noiDungHoSoId = noiDungHoSoId;

		if (_qlvtLoaiHinhHoatDongDnRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtLoaiHinhHoatDongDnRemoteModel.getClass();

				Method method = clazz.getMethod("setNoiDungHoSoId", long.class);

				method.invoke(_qlvtLoaiHinhHoatDongDnRemoteModel, noiDungHoSoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaLoaiHinhHoatDong() {
		return _maLoaiHinhHoatDong;
	}

	@Override
	public void setMaLoaiHinhHoatDong(String maLoaiHinhHoatDong) {
		_maLoaiHinhHoatDong = maLoaiHinhHoatDong;

		if (_qlvtLoaiHinhHoatDongDnRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtLoaiHinhHoatDongDnRemoteModel.getClass();

				Method method = clazz.getMethod("setMaLoaiHinhHoatDong",
						String.class);

				method.invoke(_qlvtLoaiHinhHoatDongDnRemoteModel,
					maLoaiHinhHoatDong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaMauSon() {
		return _maMauSon;
	}

	@Override
	public void setMaMauSon(String maMauSon) {
		_maMauSon = maMauSon;

		if (_qlvtLoaiHinhHoatDongDnRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtLoaiHinhHoatDongDnRemoteModel.getClass();

				Method method = clazz.getMethod("setMaMauSon", String.class);

				method.invoke(_qlvtLoaiHinhHoatDongDnRemoteModel, maMauSon);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaPhamViHoatDong() {
		return _maPhamViHoatDong;
	}

	@Override
	public void setMaPhamViHoatDong(String maPhamViHoatDong) {
		_maPhamViHoatDong = maPhamViHoatDong;

		if (_qlvtLoaiHinhHoatDongDnRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtLoaiHinhHoatDongDnRemoteModel.getClass();

				Method method = clazz.getMethod("setMaPhamViHoatDong",
						String.class);

				method.invoke(_qlvtLoaiHinhHoatDongDnRemoteModel,
					maPhamViHoatDong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoLuongPhuongTien() {
		return _soLuongPhuongTien;
	}

	@Override
	public void setSoLuongPhuongTien(String soLuongPhuongTien) {
		_soLuongPhuongTien = soLuongPhuongTien;

		if (_qlvtLoaiHinhHoatDongDnRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtLoaiHinhHoatDongDnRemoteModel.getClass();

				Method method = clazz.getMethod("setSoLuongPhuongTien",
						String.class);

				method.invoke(_qlvtLoaiHinhHoatDongDnRemoteModel,
					soLuongPhuongTien);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getThietBiGiamSatHanhTrinh() {
		return _thietBiGiamSatHanhTrinh;
	}

	@Override
	public void setThietBiGiamSatHanhTrinh(String thietBiGiamSatHanhTrinh) {
		_thietBiGiamSatHanhTrinh = thietBiGiamSatHanhTrinh;

		if (_qlvtLoaiHinhHoatDongDnRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtLoaiHinhHoatDongDnRemoteModel.getClass();

				Method method = clazz.getMethod("setThietBiGiamSatHanhTrinh",
						String.class);

				method.invoke(_qlvtLoaiHinhHoatDongDnRemoteModel,
					thietBiGiamSatHanhTrinh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQlvtLoaiHinhHoatDongDnRemoteModel() {
		return _qlvtLoaiHinhHoatDongDnRemoteModel;
	}

	public void setQlvtLoaiHinhHoatDongDnRemoteModel(
		BaseModel<?> qlvtLoaiHinhHoatDongDnRemoteModel) {
		_qlvtLoaiHinhHoatDongDnRemoteModel = qlvtLoaiHinhHoatDongDnRemoteModel;
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

		Class<?> remoteModelClass = _qlvtLoaiHinhHoatDongDnRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtLoaiHinhHoatDongDnRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtLoaiHinhHoatDongDnLocalServiceUtil.addQlvtLoaiHinhHoatDongDn(this);
		}
		else {
			QlvtLoaiHinhHoatDongDnLocalServiceUtil.updateQlvtLoaiHinhHoatDongDn(this);
		}
	}

	@Override
	public QlvtLoaiHinhHoatDongDn toEscapedModel() {
		return (QlvtLoaiHinhHoatDongDn)ProxyUtil.newProxyInstance(QlvtLoaiHinhHoatDongDn.class.getClassLoader(),
			new Class[] { QlvtLoaiHinhHoatDongDn.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QlvtLoaiHinhHoatDongDnClp clone = new QlvtLoaiHinhHoatDongDnClp();

		clone.setId(getId());
		clone.setHoSoThuTucId(getHoSoThuTucId());
		clone.setNoiDungHoSoId(getNoiDungHoSoId());
		clone.setMaLoaiHinhHoatDong(getMaLoaiHinhHoatDong());
		clone.setMaMauSon(getMaMauSon());
		clone.setMaPhamViHoatDong(getMaPhamViHoatDong());
		clone.setSoLuongPhuongTien(getSoLuongPhuongTien());
		clone.setThietBiGiamSatHanhTrinh(getThietBiGiamSatHanhTrinh());

		return clone;
	}

	@Override
	public int compareTo(QlvtLoaiHinhHoatDongDn qlvtLoaiHinhHoatDongDn) {
		int value = 0;

		if (getId() < qlvtLoaiHinhHoatDongDn.getId()) {
			value = -1;
		}
		else if (getId() > qlvtLoaiHinhHoatDongDn.getId()) {
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

		if (!(obj instanceof QlvtLoaiHinhHoatDongDnClp)) {
			return false;
		}

		QlvtLoaiHinhHoatDongDnClp qlvtLoaiHinhHoatDongDn = (QlvtLoaiHinhHoatDongDnClp)obj;

		long primaryKey = qlvtLoaiHinhHoatDongDn.getPrimaryKey();

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
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", hoSoThuTucId=");
		sb.append(getHoSoThuTucId());
		sb.append(", noiDungHoSoId=");
		sb.append(getNoiDungHoSoId());
		sb.append(", maLoaiHinhHoatDong=");
		sb.append(getMaLoaiHinhHoatDong());
		sb.append(", maMauSon=");
		sb.append(getMaMauSon());
		sb.append(", maPhamViHoatDong=");
		sb.append(getMaPhamViHoatDong());
		sb.append(", soLuongPhuongTien=");
		sb.append(getSoLuongPhuongTien());
		sb.append(", thietBiGiamSatHanhTrinh=");
		sb.append(getThietBiGiamSatHanhTrinh());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoSoThuTucId</column-name><column-value><![CDATA[");
		sb.append(getHoSoThuTucId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>noiDungHoSoId</column-name><column-value><![CDATA[");
		sb.append(getNoiDungHoSoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maLoaiHinhHoatDong</column-name><column-value><![CDATA[");
		sb.append(getMaLoaiHinhHoatDong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maMauSon</column-name><column-value><![CDATA[");
		sb.append(getMaMauSon());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maPhamViHoatDong</column-name><column-value><![CDATA[");
		sb.append(getMaPhamViHoatDong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soLuongPhuongTien</column-name><column-value><![CDATA[");
		sb.append(getSoLuongPhuongTien());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thietBiGiamSatHanhTrinh</column-name><column-value><![CDATA[");
		sb.append(getThietBiGiamSatHanhTrinh());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _hoSoThuTucId;
	private long _noiDungHoSoId;
	private String _maLoaiHinhHoatDong;
	private String _maMauSon;
	private String _maPhamViHoatDong;
	private String _soLuongPhuongTien;
	private String _thietBiGiamSatHanhTrinh;
	private BaseModel<?> _qlvtLoaiHinhHoatDongDnRemoteModel;
}