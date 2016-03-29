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

package vn.dtt.duongbo.dao.noidia.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbo.dao.noidia.service.ClpSerializer;
import vn.dtt.duongbo.dao.noidia.service.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author NoiPham
 */
public class QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiClp extends BaseModelImpl<QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai>
	implements QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai {
	public QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.class.getName();
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
		attributes.put("gpkdvtBangOtoId", getGpkdvtBangOtoId());
		attributes.put("maLoaiHinhHoatDong", getMaLoaiHinhHoatDong());
		attributes.put("loaiHinhKinhDoanhCuThe", getLoaiHinhKinhDoanhCuThe());
		attributes.put("soLuongPhuongTien", getSoLuongPhuongTien());
		attributes.put("thietBiGiamSatHanhTrinh", getThietBiGiamSatHanhTrinh());
		attributes.put("phamViHoatDong", getPhamViHoatDong());
		attributes.put("tuyenTu", getTuyenTu());
		attributes.put("tuyenDen", getTuyenDen());
		attributes.put("soChuyen", getSoChuyen());
		attributes.put("mauSon", getMauSon());
		attributes.put("ketQuaXuLy", getKetQuaXuLy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer gpkdvtBangOtoId = (Integer)attributes.get("gpkdvtBangOtoId");

		if (gpkdvtBangOtoId != null) {
			setGpkdvtBangOtoId(gpkdvtBangOtoId);
		}

		String maLoaiHinhHoatDong = (String)attributes.get("maLoaiHinhHoatDong");

		if (maLoaiHinhHoatDong != null) {
			setMaLoaiHinhHoatDong(maLoaiHinhHoatDong);
		}

		String loaiHinhKinhDoanhCuThe = (String)attributes.get(
				"loaiHinhKinhDoanhCuThe");

		if (loaiHinhKinhDoanhCuThe != null) {
			setLoaiHinhKinhDoanhCuThe(loaiHinhKinhDoanhCuThe);
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

		String tuyenTu = (String)attributes.get("tuyenTu");

		if (tuyenTu != null) {
			setTuyenTu(tuyenTu);
		}

		String tuyenDen = (String)attributes.get("tuyenDen");

		if (tuyenDen != null) {
			setTuyenDen(tuyenDen);
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
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel,
					id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getGpkdvtBangOtoId() {
		return _gpkdvtBangOtoId;
	}

	@Override
	public void setGpkdvtBangOtoId(int gpkdvtBangOtoId) {
		_gpkdvtBangOtoId = gpkdvtBangOtoId;

		if (_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setGpkdvtBangOtoId", int.class);

				method.invoke(_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel,
					gpkdvtBangOtoId);
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

		if (_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setMaLoaiHinhHoatDong",
						String.class);

				method.invoke(_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel,
					maLoaiHinhHoatDong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLoaiHinhKinhDoanhCuThe() {
		return _loaiHinhKinhDoanhCuThe;
	}

	@Override
	public void setLoaiHinhKinhDoanhCuThe(String loaiHinhKinhDoanhCuThe) {
		_loaiHinhKinhDoanhCuThe = loaiHinhKinhDoanhCuThe;

		if (_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiHinhKinhDoanhCuThe",
						String.class);

				method.invoke(_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel,
					loaiHinhKinhDoanhCuThe);
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

		if (_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setSoLuongPhuongTien",
						int.class);

				method.invoke(_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel,
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

		if (_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setThietBiGiamSatHanhTrinh",
						long.class);

				method.invoke(_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel,
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

		if (_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setPhamViHoatDong",
						String.class);

				method.invoke(_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel,
					phamViHoatDong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTuyenTu() {
		return _tuyenTu;
	}

	@Override
	public void setTuyenTu(String tuyenTu) {
		_tuyenTu = tuyenTu;

		if (_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setTuyenTu", String.class);

				method.invoke(_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel,
					tuyenTu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTuyenDen() {
		return _tuyenDen;
	}

	@Override
	public void setTuyenDen(String tuyenDen) {
		_tuyenDen = tuyenDen;

		if (_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setTuyenDen", String.class);

				method.invoke(_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel,
					tuyenDen);
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

		if (_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setSoChuyen", int.class);

				method.invoke(_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel,
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

		if (_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setMauSon", String.class);

				method.invoke(_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel,
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

		if (_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setKetQuaXuLy", String.class);

				method.invoke(_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel,
					ketQuaXuLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel() {
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel;
	}

	public void setQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel(
		BaseModel<?> qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel) {
		_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel = qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel;
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

		Class<?> remoteModelClass = _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalServiceUtil.addQlvtXuLyGpkdvtBangOtoLoaiHinhVanTai(this);
		}
		else {
			QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalServiceUtil.updateQlvtXuLyGpkdvtBangOtoLoaiHinhVanTai(this);
		}
	}

	@Override
	public QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai toEscapedModel() {
		return (QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai)ProxyUtil.newProxyInstance(QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.class.getClassLoader(),
			new Class[] { QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiClp clone = new QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiClp();

		clone.setId(getId());
		clone.setGpkdvtBangOtoId(getGpkdvtBangOtoId());
		clone.setMaLoaiHinhHoatDong(getMaLoaiHinhHoatDong());
		clone.setLoaiHinhKinhDoanhCuThe(getLoaiHinhKinhDoanhCuThe());
		clone.setSoLuongPhuongTien(getSoLuongPhuongTien());
		clone.setThietBiGiamSatHanhTrinh(getThietBiGiamSatHanhTrinh());
		clone.setPhamViHoatDong(getPhamViHoatDong());
		clone.setTuyenTu(getTuyenTu());
		clone.setTuyenDen(getTuyenDen());
		clone.setSoChuyen(getSoChuyen());
		clone.setMauSon(getMauSon());
		clone.setKetQuaXuLy(getKetQuaXuLy());

		return clone;
	}

	@Override
	public int compareTo(
		QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai) {
		int value = 0;

		if (getId() < qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.getId()) {
			value = -1;
		}
		else if (getId() > qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.getId()) {
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

		if (!(obj instanceof QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiClp)) {
			return false;
		}

		QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiClp qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai =
			(QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiClp)obj;

		long primaryKey = qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.getPrimaryKey();

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
		sb.append(", gpkdvtBangOtoId=");
		sb.append(getGpkdvtBangOtoId());
		sb.append(", maLoaiHinhHoatDong=");
		sb.append(getMaLoaiHinhHoatDong());
		sb.append(", loaiHinhKinhDoanhCuThe=");
		sb.append(getLoaiHinhKinhDoanhCuThe());
		sb.append(", soLuongPhuongTien=");
		sb.append(getSoLuongPhuongTien());
		sb.append(", thietBiGiamSatHanhTrinh=");
		sb.append(getThietBiGiamSatHanhTrinh());
		sb.append(", phamViHoatDong=");
		sb.append(getPhamViHoatDong());
		sb.append(", tuyenTu=");
		sb.append(getTuyenTu());
		sb.append(", tuyenDen=");
		sb.append(getTuyenDen());
		sb.append(", soChuyen=");
		sb.append(getSoChuyen());
		sb.append(", mauSon=");
		sb.append(getMauSon());
		sb.append(", ketQuaXuLy=");
		sb.append(getKetQuaXuLy());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append(
			"vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gpkdvtBangOtoId</column-name><column-value><![CDATA[");
		sb.append(getGpkdvtBangOtoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maLoaiHinhHoatDong</column-name><column-value><![CDATA[");
		sb.append(getMaLoaiHinhHoatDong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiHinhKinhDoanhCuThe</column-name><column-value><![CDATA[");
		sb.append(getLoaiHinhKinhDoanhCuThe());
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
			"<column><column-name>tuyenTu</column-name><column-value><![CDATA[");
		sb.append(getTuyenTu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tuyenDen</column-name><column-value><![CDATA[");
		sb.append(getTuyenDen());
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

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private int _gpkdvtBangOtoId;
	private String _maLoaiHinhHoatDong;
	private String _loaiHinhKinhDoanhCuThe;
	private int _soLuongPhuongTien;
	private long _thietBiGiamSatHanhTrinh;
	private String _phamViHoatDong;
	private String _tuyenTu;
	private String _tuyenDen;
	private int _soChuyen;
	private String _mauSon;
	private String _ketQuaXuLy;
	private BaseModel<?> _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbo.dao.noidia.service.ClpSerializer.class;
}