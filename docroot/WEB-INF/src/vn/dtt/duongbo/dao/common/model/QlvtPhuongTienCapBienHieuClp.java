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
import vn.dtt.duongbo.dao.common.service.QlvtPhuongTienCapBienHieuLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class QlvtPhuongTienCapBienHieuClp extends BaseModelImpl<QlvtPhuongTienCapBienHieu>
	implements QlvtPhuongTienCapBienHieu {
	public QlvtPhuongTienCapBienHieuClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtPhuongTienCapBienHieu.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtPhuongTienCapBienHieu.class.getName();
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
		attributes.put("SoKhung", getSoKhung());
		attributes.put("SoMay", getSoMay());
		attributes.put("NamSanXuat", getNamSanXuat());
		attributes.put("MauSon", getMauSon());
		attributes.put("SoChoNgoi", getSoChoNgoi());
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

		String SoKhung = (String)attributes.get("SoKhung");

		if (SoKhung != null) {
			setSoKhung(SoKhung);
		}

		String SoMay = (String)attributes.get("SoMay");

		if (SoMay != null) {
			setSoMay(SoMay);
		}

		String NamSanXuat = (String)attributes.get("NamSanXuat");

		if (NamSanXuat != null) {
			setNamSanXuat(NamSanXuat);
		}

		String MauSon = (String)attributes.get("MauSon");

		if (MauSon != null) {
			setMauSon(MauSon);
		}

		Long SoChoNgoi = (Long)attributes.get("SoChoNgoi");

		if (SoChoNgoi != null) {
			setSoChoNgoi(SoChoNgoi);
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

		if (_qlvtPhuongTienCapBienHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtPhuongTienCapBienHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_qlvtPhuongTienCapBienHieuRemoteModel, id);
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

		if (_qlvtPhuongTienCapBienHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtPhuongTienCapBienHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setNhanHieu", String.class);

				method.invoke(_qlvtPhuongTienCapBienHieuRemoteModel, NhanHieu);
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

		if (_qlvtPhuongTienCapBienHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtPhuongTienCapBienHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setBienSo", String.class);

				method.invoke(_qlvtPhuongTienCapBienHieuRemoteModel, BienSo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoKhung() {
		return _SoKhung;
	}

	@Override
	public void setSoKhung(String SoKhung) {
		_SoKhung = SoKhung;

		if (_qlvtPhuongTienCapBienHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtPhuongTienCapBienHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setSoKhung", String.class);

				method.invoke(_qlvtPhuongTienCapBienHieuRemoteModel, SoKhung);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoMay() {
		return _SoMay;
	}

	@Override
	public void setSoMay(String SoMay) {
		_SoMay = SoMay;

		if (_qlvtPhuongTienCapBienHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtPhuongTienCapBienHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setSoMay", String.class);

				method.invoke(_qlvtPhuongTienCapBienHieuRemoteModel, SoMay);
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

		if (_qlvtPhuongTienCapBienHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtPhuongTienCapBienHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setNamSanXuat", String.class);

				method.invoke(_qlvtPhuongTienCapBienHieuRemoteModel, NamSanXuat);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMauSon() {
		return _MauSon;
	}

	@Override
	public void setMauSon(String MauSon) {
		_MauSon = MauSon;

		if (_qlvtPhuongTienCapBienHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtPhuongTienCapBienHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setMauSon", String.class);

				method.invoke(_qlvtPhuongTienCapBienHieuRemoteModel, MauSon);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSoChoNgoi() {
		return _SoChoNgoi;
	}

	@Override
	public void setSoChoNgoi(long SoChoNgoi) {
		_SoChoNgoi = SoChoNgoi;

		if (_qlvtPhuongTienCapBienHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtPhuongTienCapBienHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setSoChoNgoi", long.class);

				method.invoke(_qlvtPhuongTienCapBienHieuRemoteModel, SoChoNgoi);
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

		if (_qlvtPhuongTienCapBienHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtPhuongTienCapBienHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setNoiDungHoSoId", long.class);

				method.invoke(_qlvtPhuongTienCapBienHieuRemoteModel,
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

		if (_qlvtPhuongTienCapBienHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtPhuongTienCapBienHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setHoSoThuTucId", long.class);

				method.invoke(_qlvtPhuongTienCapBienHieuRemoteModel,
					HoSoThuTucId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQlvtPhuongTienCapBienHieuRemoteModel() {
		return _qlvtPhuongTienCapBienHieuRemoteModel;
	}

	public void setQlvtPhuongTienCapBienHieuRemoteModel(
		BaseModel<?> qlvtPhuongTienCapBienHieuRemoteModel) {
		_qlvtPhuongTienCapBienHieuRemoteModel = qlvtPhuongTienCapBienHieuRemoteModel;
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

		Class<?> remoteModelClass = _qlvtPhuongTienCapBienHieuRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtPhuongTienCapBienHieuRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtPhuongTienCapBienHieuLocalServiceUtil.addQlvtPhuongTienCapBienHieu(this);
		}
		else {
			QlvtPhuongTienCapBienHieuLocalServiceUtil.updateQlvtPhuongTienCapBienHieu(this);
		}
	}

	@Override
	public QlvtPhuongTienCapBienHieu toEscapedModel() {
		return (QlvtPhuongTienCapBienHieu)ProxyUtil.newProxyInstance(QlvtPhuongTienCapBienHieu.class.getClassLoader(),
			new Class[] { QlvtPhuongTienCapBienHieu.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QlvtPhuongTienCapBienHieuClp clone = new QlvtPhuongTienCapBienHieuClp();

		clone.setId(getId());
		clone.setNhanHieu(getNhanHieu());
		clone.setBienSo(getBienSo());
		clone.setSoKhung(getSoKhung());
		clone.setSoMay(getSoMay());
		clone.setNamSanXuat(getNamSanXuat());
		clone.setMauSon(getMauSon());
		clone.setSoChoNgoi(getSoChoNgoi());
		clone.setNoiDungHoSoId(getNoiDungHoSoId());
		clone.setHoSoThuTucId(getHoSoThuTucId());

		return clone;
	}

	@Override
	public int compareTo(QlvtPhuongTienCapBienHieu qlvtPhuongTienCapBienHieu) {
		int value = 0;

		if (getId() < qlvtPhuongTienCapBienHieu.getId()) {
			value = -1;
		}
		else if (getId() > qlvtPhuongTienCapBienHieu.getId()) {
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

		if (!(obj instanceof QlvtPhuongTienCapBienHieuClp)) {
			return false;
		}

		QlvtPhuongTienCapBienHieuClp qlvtPhuongTienCapBienHieu = (QlvtPhuongTienCapBienHieuClp)obj;

		long primaryKey = qlvtPhuongTienCapBienHieu.getPrimaryKey();

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
		sb.append(", SoKhung=");
		sb.append(getSoKhung());
		sb.append(", SoMay=");
		sb.append(getSoMay());
		sb.append(", NamSanXuat=");
		sb.append(getNamSanXuat());
		sb.append(", MauSon=");
		sb.append(getMauSon());
		sb.append(", SoChoNgoi=");
		sb.append(getSoChoNgoi());
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
		sb.append("vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapBienHieu");
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
			"<column><column-name>SoKhung</column-name><column-value><![CDATA[");
		sb.append(getSoKhung());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SoMay</column-name><column-value><![CDATA[");
		sb.append(getSoMay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NamSanXuat</column-name><column-value><![CDATA[");
		sb.append(getNamSanXuat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MauSon</column-name><column-value><![CDATA[");
		sb.append(getMauSon());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SoChoNgoi</column-name><column-value><![CDATA[");
		sb.append(getSoChoNgoi());
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
	private String _SoKhung;
	private String _SoMay;
	private String _NamSanXuat;
	private String _MauSon;
	private long _SoChoNgoi;
	private long _NoiDungHoSoId;
	private long _HoSoThuTucId;
	private BaseModel<?> _qlvtPhuongTienCapBienHieuRemoteModel;
}