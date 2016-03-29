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
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyKTTQuocTeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author NoiPham
 */
public class QlvtXuLyKTTQuocTeClp extends BaseModelImpl<QlvtXuLyKTTQuocTe>
	implements QlvtXuLyKTTQuocTe {
	public QlvtXuLyKTTQuocTeClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtXuLyKTTQuocTe.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtXuLyKTTQuocTe.class.getName();
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
		attributes.put("thongTinXuLyId", getThongTinXuLyId());
		attributes.put("loaiCapPhep", getLoaiCapPhep());
		attributes.put("benDi", getBenDi());
		attributes.put("diemDi", getDiemDi());
		attributes.put("benDen", getBenDen());
		attributes.put("diemDen", getDiemDen());
		attributes.put("cuLyVanChuyen", getCuLyVanChuyen());
		attributes.put("hanhTrinhChay", getHanhTrinhChay());
		attributes.put("cuaKhau", getCuaKhau());
		attributes.put("ketQuaDanhGiaGPVT", getKetQuaDanhGiaGPVT());
		attributes.put("lyDoKhongDat", getLyDoKhongDat());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer thongTinXuLyId = (Integer)attributes.get("thongTinXuLyId");

		if (thongTinXuLyId != null) {
			setThongTinXuLyId(thongTinXuLyId);
		}

		String loaiCapPhep = (String)attributes.get("loaiCapPhep");

		if (loaiCapPhep != null) {
			setLoaiCapPhep(loaiCapPhep);
		}

		String benDi = (String)attributes.get("benDi");

		if (benDi != null) {
			setBenDi(benDi);
		}

		String diemDi = (String)attributes.get("diemDi");

		if (diemDi != null) {
			setDiemDi(diemDi);
		}

		String benDen = (String)attributes.get("benDen");

		if (benDen != null) {
			setBenDen(benDen);
		}

		String diemDen = (String)attributes.get("diemDen");

		if (diemDen != null) {
			setDiemDen(diemDen);
		}

		Integer cuLyVanChuyen = (Integer)attributes.get("cuLyVanChuyen");

		if (cuLyVanChuyen != null) {
			setCuLyVanChuyen(cuLyVanChuyen);
		}

		String hanhTrinhChay = (String)attributes.get("hanhTrinhChay");

		if (hanhTrinhChay != null) {
			setHanhTrinhChay(hanhTrinhChay);
		}

		String cuaKhau = (String)attributes.get("cuaKhau");

		if (cuaKhau != null) {
			setCuaKhau(cuaKhau);
		}

		String ketQuaDanhGiaGPVT = (String)attributes.get("ketQuaDanhGiaGPVT");

		if (ketQuaDanhGiaGPVT != null) {
			setKetQuaDanhGiaGPVT(ketQuaDanhGiaGPVT);
		}

		String lyDoKhongDat = (String)attributes.get("lyDoKhongDat");

		if (lyDoKhongDat != null) {
			setLyDoKhongDat(lyDoKhongDat);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_qlvtXuLyKTTQuocTeRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTeRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_qlvtXuLyKTTQuocTeRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getThongTinXuLyId() {
		return _thongTinXuLyId;
	}

	@Override
	public void setThongTinXuLyId(int thongTinXuLyId) {
		_thongTinXuLyId = thongTinXuLyId;

		if (_qlvtXuLyKTTQuocTeRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTeRemoteModel.getClass();

				Method method = clazz.getMethod("setThongTinXuLyId", int.class);

				method.invoke(_qlvtXuLyKTTQuocTeRemoteModel, thongTinXuLyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLoaiCapPhep() {
		return _loaiCapPhep;
	}

	@Override
	public void setLoaiCapPhep(String loaiCapPhep) {
		_loaiCapPhep = loaiCapPhep;

		if (_qlvtXuLyKTTQuocTeRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTeRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiCapPhep", String.class);

				method.invoke(_qlvtXuLyKTTQuocTeRemoteModel, loaiCapPhep);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBenDi() {
		return _benDi;
	}

	@Override
	public void setBenDi(String benDi) {
		_benDi = benDi;

		if (_qlvtXuLyKTTQuocTeRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTeRemoteModel.getClass();

				Method method = clazz.getMethod("setBenDi", String.class);

				method.invoke(_qlvtXuLyKTTQuocTeRemoteModel, benDi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDiemDi() {
		return _diemDi;
	}

	@Override
	public void setDiemDi(String diemDi) {
		_diemDi = diemDi;

		if (_qlvtXuLyKTTQuocTeRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTeRemoteModel.getClass();

				Method method = clazz.getMethod("setDiemDi", String.class);

				method.invoke(_qlvtXuLyKTTQuocTeRemoteModel, diemDi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBenDen() {
		return _benDen;
	}

	@Override
	public void setBenDen(String benDen) {
		_benDen = benDen;

		if (_qlvtXuLyKTTQuocTeRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTeRemoteModel.getClass();

				Method method = clazz.getMethod("setBenDen", String.class);

				method.invoke(_qlvtXuLyKTTQuocTeRemoteModel, benDen);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDiemDen() {
		return _diemDen;
	}

	@Override
	public void setDiemDen(String diemDen) {
		_diemDen = diemDen;

		if (_qlvtXuLyKTTQuocTeRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTeRemoteModel.getClass();

				Method method = clazz.getMethod("setDiemDen", String.class);

				method.invoke(_qlvtXuLyKTTQuocTeRemoteModel, diemDen);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCuLyVanChuyen() {
		return _cuLyVanChuyen;
	}

	@Override
	public void setCuLyVanChuyen(int cuLyVanChuyen) {
		_cuLyVanChuyen = cuLyVanChuyen;

		if (_qlvtXuLyKTTQuocTeRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTeRemoteModel.getClass();

				Method method = clazz.getMethod("setCuLyVanChuyen", int.class);

				method.invoke(_qlvtXuLyKTTQuocTeRemoteModel, cuLyVanChuyen);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getHanhTrinhChay() {
		return _hanhTrinhChay;
	}

	@Override
	public void setHanhTrinhChay(String hanhTrinhChay) {
		_hanhTrinhChay = hanhTrinhChay;

		if (_qlvtXuLyKTTQuocTeRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTeRemoteModel.getClass();

				Method method = clazz.getMethod("setHanhTrinhChay", String.class);

				method.invoke(_qlvtXuLyKTTQuocTeRemoteModel, hanhTrinhChay);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCuaKhau() {
		return _cuaKhau;
	}

	@Override
	public void setCuaKhau(String cuaKhau) {
		_cuaKhau = cuaKhau;

		if (_qlvtXuLyKTTQuocTeRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTeRemoteModel.getClass();

				Method method = clazz.getMethod("setCuaKhau", String.class);

				method.invoke(_qlvtXuLyKTTQuocTeRemoteModel, cuaKhau);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getKetQuaDanhGiaGPVT() {
		return _ketQuaDanhGiaGPVT;
	}

	@Override
	public void setKetQuaDanhGiaGPVT(String ketQuaDanhGiaGPVT) {
		_ketQuaDanhGiaGPVT = ketQuaDanhGiaGPVT;

		if (_qlvtXuLyKTTQuocTeRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTeRemoteModel.getClass();

				Method method = clazz.getMethod("setKetQuaDanhGiaGPVT",
						String.class);

				method.invoke(_qlvtXuLyKTTQuocTeRemoteModel, ketQuaDanhGiaGPVT);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLyDoKhongDat() {
		return _lyDoKhongDat;
	}

	@Override
	public void setLyDoKhongDat(String lyDoKhongDat) {
		_lyDoKhongDat = lyDoKhongDat;

		if (_qlvtXuLyKTTQuocTeRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTeRemoteModel.getClass();

				Method method = clazz.getMethod("setLyDoKhongDat", String.class);

				method.invoke(_qlvtXuLyKTTQuocTeRemoteModel, lyDoKhongDat);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQlvtXuLyKTTQuocTeRemoteModel() {
		return _qlvtXuLyKTTQuocTeRemoteModel;
	}

	public void setQlvtXuLyKTTQuocTeRemoteModel(
		BaseModel<?> qlvtXuLyKTTQuocTeRemoteModel) {
		_qlvtXuLyKTTQuocTeRemoteModel = qlvtXuLyKTTQuocTeRemoteModel;
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

		Class<?> remoteModelClass = _qlvtXuLyKTTQuocTeRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtXuLyKTTQuocTeRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtXuLyKTTQuocTeLocalServiceUtil.addQlvtXuLyKTTQuocTe(this);
		}
		else {
			QlvtXuLyKTTQuocTeLocalServiceUtil.updateQlvtXuLyKTTQuocTe(this);
		}
	}

	@Override
	public QlvtXuLyKTTQuocTe toEscapedModel() {
		return (QlvtXuLyKTTQuocTe)ProxyUtil.newProxyInstance(QlvtXuLyKTTQuocTe.class.getClassLoader(),
			new Class[] { QlvtXuLyKTTQuocTe.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QlvtXuLyKTTQuocTeClp clone = new QlvtXuLyKTTQuocTeClp();

		clone.setId(getId());
		clone.setThongTinXuLyId(getThongTinXuLyId());
		clone.setLoaiCapPhep(getLoaiCapPhep());
		clone.setBenDi(getBenDi());
		clone.setDiemDi(getDiemDi());
		clone.setBenDen(getBenDen());
		clone.setDiemDen(getDiemDen());
		clone.setCuLyVanChuyen(getCuLyVanChuyen());
		clone.setHanhTrinhChay(getHanhTrinhChay());
		clone.setCuaKhau(getCuaKhau());
		clone.setKetQuaDanhGiaGPVT(getKetQuaDanhGiaGPVT());
		clone.setLyDoKhongDat(getLyDoKhongDat());

		return clone;
	}

	@Override
	public int compareTo(QlvtXuLyKTTQuocTe qlvtXuLyKTTQuocTe) {
		int value = 0;

		if (getId() < qlvtXuLyKTTQuocTe.getId()) {
			value = -1;
		}
		else if (getId() > qlvtXuLyKTTQuocTe.getId()) {
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

		if (!(obj instanceof QlvtXuLyKTTQuocTeClp)) {
			return false;
		}

		QlvtXuLyKTTQuocTeClp qlvtXuLyKTTQuocTe = (QlvtXuLyKTTQuocTeClp)obj;

		long primaryKey = qlvtXuLyKTTQuocTe.getPrimaryKey();

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
		StringBundler sb = new StringBundler(25);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", thongTinXuLyId=");
		sb.append(getThongTinXuLyId());
		sb.append(", loaiCapPhep=");
		sb.append(getLoaiCapPhep());
		sb.append(", benDi=");
		sb.append(getBenDi());
		sb.append(", diemDi=");
		sb.append(getDiemDi());
		sb.append(", benDen=");
		sb.append(getBenDen());
		sb.append(", diemDen=");
		sb.append(getDiemDen());
		sb.append(", cuLyVanChuyen=");
		sb.append(getCuLyVanChuyen());
		sb.append(", hanhTrinhChay=");
		sb.append(getHanhTrinhChay());
		sb.append(", cuaKhau=");
		sb.append(getCuaKhau());
		sb.append(", ketQuaDanhGiaGPVT=");
		sb.append(getKetQuaDanhGiaGPVT());
		sb.append(", lyDoKhongDat=");
		sb.append(getLyDoKhongDat());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTe");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thongTinXuLyId</column-name><column-value><![CDATA[");
		sb.append(getThongTinXuLyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiCapPhep</column-name><column-value><![CDATA[");
		sb.append(getLoaiCapPhep());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>benDi</column-name><column-value><![CDATA[");
		sb.append(getBenDi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>diemDi</column-name><column-value><![CDATA[");
		sb.append(getDiemDi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>benDen</column-name><column-value><![CDATA[");
		sb.append(getBenDen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>diemDen</column-name><column-value><![CDATA[");
		sb.append(getDiemDen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cuLyVanChuyen</column-name><column-value><![CDATA[");
		sb.append(getCuLyVanChuyen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hanhTrinhChay</column-name><column-value><![CDATA[");
		sb.append(getHanhTrinhChay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cuaKhau</column-name><column-value><![CDATA[");
		sb.append(getCuaKhau());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ketQuaDanhGiaGPVT</column-name><column-value><![CDATA[");
		sb.append(getKetQuaDanhGiaGPVT());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lyDoKhongDat</column-name><column-value><![CDATA[");
		sb.append(getLyDoKhongDat());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private int _thongTinXuLyId;
	private String _loaiCapPhep;
	private String _benDi;
	private String _diemDi;
	private String _benDen;
	private String _diemDen;
	private int _cuLyVanChuyen;
	private String _hanhTrinhChay;
	private String _cuaKhau;
	private String _ketQuaDanhGiaGPVT;
	private String _lyDoKhongDat;
	private BaseModel<?> _qlvtXuLyKTTQuocTeRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbo.dao.quocte.service.ClpSerializer.class;
}