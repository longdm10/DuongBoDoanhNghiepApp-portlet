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
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author NoiPham
 */
public class QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiClp extends BaseModelImpl<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai>
	implements QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai {
	public QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.class.getName();
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
		attributes.put("thongTinCapGpkdVanTaiId", getThongTinCapGpkdVanTaiId());
		attributes.put("maLoaiHinhHoatDong", getMaLoaiHinhHoatDong());
		attributes.put("soLuongPhuongTien", getSoLuongPhuongTien());
		attributes.put("thietBiGiamSatHanhTrinh", getThietBiGiamSatHanhTrinh());
		attributes.put("phamViHoatDong", getPhamViHoatDong());
		attributes.put("soChuyen", getSoChuyen());
		attributes.put("mauSon", getMauSon());
		attributes.put("ketQuaXuLy", getKetQuaXuLy());
		attributes.put("lyDoKhongDat", getLyDoKhongDat());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer thongTinCapGpkdVanTaiId = (Integer)attributes.get(
				"thongTinCapGpkdVanTaiId");

		if (thongTinCapGpkdVanTaiId != null) {
			setThongTinCapGpkdVanTaiId(thongTinCapGpkdVanTaiId);
		}

		String maLoaiHinhHoatDong = (String)attributes.get("maLoaiHinhHoatDong");

		if (maLoaiHinhHoatDong != null) {
			setMaLoaiHinhHoatDong(maLoaiHinhHoatDong);
		}

		Integer soLuongPhuongTien = (Integer)attributes.get("soLuongPhuongTien");

		if (soLuongPhuongTien != null) {
			setSoLuongPhuongTien(soLuongPhuongTien);
		}

		Long thietBiGiamSatHanhTrinh = (Long)attributes.get(
				"thietBiGiamSatHanhTrinh");

		if (thietBiGiamSatHanhTrinh != null) {
			setThietBiGiamSatHanhTrinh(thietBiGiamSatHanhTrinh);
		}

		String phamViHoatDong = (String)attributes.get("phamViHoatDong");

		if (phamViHoatDong != null) {
			setPhamViHoatDong(phamViHoatDong);
		}

		Integer soChuyen = (Integer)attributes.get("soChuyen");

		if (soChuyen != null) {
			setSoChuyen(soChuyen);
		}

		String mauSon = (String)attributes.get("mauSon");

		if (mauSon != null) {
			setMauSon(mauSon);
		}

		String ketQuaXuLy = (String)attributes.get("ketQuaXuLy");

		if (ketQuaXuLy != null) {
			setKetQuaXuLy(ketQuaXuLy);
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

		if (_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getThongTinCapGpkdVanTaiId() {
		return _thongTinCapGpkdVanTaiId;
	}

	@Override
	public void setThongTinCapGpkdVanTaiId(int thongTinCapGpkdVanTaiId) {
		_thongTinCapGpkdVanTaiId = thongTinCapGpkdVanTaiId;

		if (_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setThongTinCapGpkdVanTaiId",
						int.class);

				method.invoke(_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiRemoteModel,
					thongTinCapGpkdVanTaiId);
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

		if (_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setMaLoaiHinhHoatDong",
						String.class);

				method.invoke(_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiRemoteModel,
					maLoaiHinhHoatDong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoLuongPhuongTien() {
		return _soLuongPhuongTien;
	}

	@Override
	public void setSoLuongPhuongTien(int soLuongPhuongTien) {
		_soLuongPhuongTien = soLuongPhuongTien;

		if (_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setSoLuongPhuongTien",
						int.class);

				method.invoke(_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiRemoteModel,
					soLuongPhuongTien);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getThietBiGiamSatHanhTrinh() {
		return _thietBiGiamSatHanhTrinh;
	}

	@Override
	public void setThietBiGiamSatHanhTrinh(long thietBiGiamSatHanhTrinh) {
		_thietBiGiamSatHanhTrinh = thietBiGiamSatHanhTrinh;

		if (_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setThietBiGiamSatHanhTrinh",
						long.class);

				method.invoke(_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiRemoteModel,
					thietBiGiamSatHanhTrinh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPhamViHoatDong() {
		return _phamViHoatDong;
	}

	@Override
	public void setPhamViHoatDong(String phamViHoatDong) {
		_phamViHoatDong = phamViHoatDong;

		if (_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setPhamViHoatDong",
						String.class);

				method.invoke(_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiRemoteModel,
					phamViHoatDong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoChuyen() {
		return _soChuyen;
	}

	@Override
	public void setSoChuyen(int soChuyen) {
		_soChuyen = soChuyen;

		if (_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setSoChuyen", int.class);

				method.invoke(_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiRemoteModel,
					soChuyen);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMauSon() {
		return _mauSon;
	}

	@Override
	public void setMauSon(String mauSon) {
		_mauSon = mauSon;

		if (_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setMauSon", String.class);

				method.invoke(_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiRemoteModel,
					mauSon);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getKetQuaXuLy() {
		return _ketQuaXuLy;
	}

	@Override
	public void setKetQuaXuLy(String ketQuaXuLy) {
		_ketQuaXuLy = ketQuaXuLy;

		if (_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setKetQuaXuLy", String.class);

				method.invoke(_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiRemoteModel,
					ketQuaXuLy);
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

		if (_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setLyDoKhongDat", String.class);

				method.invoke(_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiRemoteModel,
					lyDoKhongDat);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiRemoteModel() {
		return _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiRemoteModel;
	}

	public void setQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiRemoteModel(
		BaseModel<?> qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiRemoteModel) {
		_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiRemoteModel = qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiRemoteModel;
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

		Class<?> remoteModelClass = _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiLocalServiceUtil.addQlvtXuLyGpkdvtQuocTeLoaiHinhVanTai(this);
		}
		else {
			QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiLocalServiceUtil.updateQlvtXuLyGpkdvtQuocTeLoaiHinhVanTai(this);
		}
	}

	@Override
	public QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai toEscapedModel() {
		return (QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai)ProxyUtil.newProxyInstance(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.class.getClassLoader(),
			new Class[] { QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiClp clone = new QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiClp();

		clone.setId(getId());
		clone.setThongTinCapGpkdVanTaiId(getThongTinCapGpkdVanTaiId());
		clone.setMaLoaiHinhHoatDong(getMaLoaiHinhHoatDong());
		clone.setSoLuongPhuongTien(getSoLuongPhuongTien());
		clone.setThietBiGiamSatHanhTrinh(getThietBiGiamSatHanhTrinh());
		clone.setPhamViHoatDong(getPhamViHoatDong());
		clone.setSoChuyen(getSoChuyen());
		clone.setMauSon(getMauSon());
		clone.setKetQuaXuLy(getKetQuaXuLy());
		clone.setLyDoKhongDat(getLyDoKhongDat());

		return clone;
	}

	@Override
	public int compareTo(
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai) {
		int value = 0;

		if (getId() < qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.getId()) {
			value = -1;
		}
		else if (getId() > qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.getId()) {
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

		if (!(obj instanceof QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiClp)) {
			return false;
		}

		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiClp qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai =
			(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiClp)obj;

		long primaryKey = qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.getPrimaryKey();

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
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", thongTinCapGpkdVanTaiId=");
		sb.append(getThongTinCapGpkdVanTaiId());
		sb.append(", maLoaiHinhHoatDong=");
		sb.append(getMaLoaiHinhHoatDong());
		sb.append(", soLuongPhuongTien=");
		sb.append(getSoLuongPhuongTien());
		sb.append(", thietBiGiamSatHanhTrinh=");
		sb.append(getThietBiGiamSatHanhTrinh());
		sb.append(", phamViHoatDong=");
		sb.append(getPhamViHoatDong());
		sb.append(", soChuyen=");
		sb.append(getSoChuyen());
		sb.append(", mauSon=");
		sb.append(getMauSon());
		sb.append(", ketQuaXuLy=");
		sb.append(getKetQuaXuLy());
		sb.append(", lyDoKhongDat=");
		sb.append(getLyDoKhongDat());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append(
			"vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thongTinCapGpkdVanTaiId</column-name><column-value><![CDATA[");
		sb.append(getThongTinCapGpkdVanTaiId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maLoaiHinhHoatDong</column-name><column-value><![CDATA[");
		sb.append(getMaLoaiHinhHoatDong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soLuongPhuongTien</column-name><column-value><![CDATA[");
		sb.append(getSoLuongPhuongTien());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thietBiGiamSatHanhTrinh</column-name><column-value><![CDATA[");
		sb.append(getThietBiGiamSatHanhTrinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phamViHoatDong</column-name><column-value><![CDATA[");
		sb.append(getPhamViHoatDong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soChuyen</column-name><column-value><![CDATA[");
		sb.append(getSoChuyen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mauSon</column-name><column-value><![CDATA[");
		sb.append(getMauSon());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ketQuaXuLy</column-name><column-value><![CDATA[");
		sb.append(getKetQuaXuLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lyDoKhongDat</column-name><column-value><![CDATA[");
		sb.append(getLyDoKhongDat());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private int _thongTinCapGpkdVanTaiId;
	private String _maLoaiHinhHoatDong;
	private int _soLuongPhuongTien;
	private long _thietBiGiamSatHanhTrinh;
	private String _phamViHoatDong;
	private int _soChuyen;
	private String _mauSon;
	private String _ketQuaXuLy;
	private String _lyDoKhongDat;
	private BaseModel<?> _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbo.dao.quocte.service.ClpSerializer.class;
}