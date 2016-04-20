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

package vn.dtt.duongbo.dao.nghiepvu.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbo.dao.nghiepvu.service.ClpSerializer;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtLoaiHinhHoatDongTthsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author NhanNc
 */
public class QlvtLoaiHinhHoatDongTthsClp extends BaseModelImpl<QlvtLoaiHinhHoatDongTths>
	implements QlvtLoaiHinhHoatDongTths {
	public QlvtLoaiHinhHoatDongTthsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtLoaiHinhHoatDongTths.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtLoaiHinhHoatDongTths.class.getName();
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
		attributes.put("maLoaiHinhHoatDong", getMaLoaiHinhHoatDong());
		attributes.put("thongTinHoSoId", getThongTinHoSoId());
		attributes.put("soLuongPhuongTien", getSoLuongPhuongTien());
		attributes.put("thietBiGiamSatHanhTrinh", getThietBiGiamSatHanhTrinh());
		attributes.put("tuyenTu", getTuyenTu());
		attributes.put("tuyenDen", getTuyenDen());
		attributes.put("soChuyen", getSoChuyen());
		attributes.put("mauSon", getMauSon());
		attributes.put("loaiHinhKinhDoanhCuThe", getLoaiHinhKinhDoanhCuThe());
		attributes.put("danhGia", getDanhGia());
		attributes.put("lyDoKhongDat", getLyDoKhongDat());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String maLoaiHinhHoatDong = (String)attributes.get("maLoaiHinhHoatDong");

		if (maLoaiHinhHoatDong != null) {
			setMaLoaiHinhHoatDong(maLoaiHinhHoatDong);
		}

		Long thongTinHoSoId = (Long)attributes.get("thongTinHoSoId");

		if (thongTinHoSoId != null) {
			setThongTinHoSoId(thongTinHoSoId);
		}

		Integer soLuongPhuongTien = (Integer)attributes.get("soLuongPhuongTien");

		if (soLuongPhuongTien != null) {
			setSoLuongPhuongTien(soLuongPhuongTien);
		}

		Integer thietBiGiamSatHanhTrinh = (Integer)attributes.get(
				"thietBiGiamSatHanhTrinh");

		if (thietBiGiamSatHanhTrinh != null) {
			setThietBiGiamSatHanhTrinh(thietBiGiamSatHanhTrinh);
		}

		String tuyenTu = (String)attributes.get("tuyenTu");

		if (tuyenTu != null) {
			setTuyenTu(tuyenTu);
		}

		String tuyenDen = (String)attributes.get("tuyenDen");

		if (tuyenDen != null) {
			setTuyenDen(tuyenDen);
		}

		Long soChuyen = (Long)attributes.get("soChuyen");

		if (soChuyen != null) {
			setSoChuyen(soChuyen);
		}

		String mauSon = (String)attributes.get("mauSon");

		if (mauSon != null) {
			setMauSon(mauSon);
		}

		String loaiHinhKinhDoanhCuThe = (String)attributes.get(
				"loaiHinhKinhDoanhCuThe");

		if (loaiHinhKinhDoanhCuThe != null) {
			setLoaiHinhKinhDoanhCuThe(loaiHinhKinhDoanhCuThe);
		}

		Integer danhGia = (Integer)attributes.get("danhGia");

		if (danhGia != null) {
			setDanhGia(danhGia);
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

		if (_qlvtLoaiHinhHoatDongTthsRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtLoaiHinhHoatDongTthsRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_qlvtLoaiHinhHoatDongTthsRemoteModel, id);
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

		if (_qlvtLoaiHinhHoatDongTthsRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtLoaiHinhHoatDongTthsRemoteModel.getClass();

				Method method = clazz.getMethod("setMaLoaiHinhHoatDong",
						String.class);

				method.invoke(_qlvtLoaiHinhHoatDongTthsRemoteModel,
					maLoaiHinhHoatDong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getThongTinHoSoId() {
		return _thongTinHoSoId;
	}

	@Override
	public void setThongTinHoSoId(long thongTinHoSoId) {
		_thongTinHoSoId = thongTinHoSoId;

		if (_qlvtLoaiHinhHoatDongTthsRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtLoaiHinhHoatDongTthsRemoteModel.getClass();

				Method method = clazz.getMethod("setThongTinHoSoId", long.class);

				method.invoke(_qlvtLoaiHinhHoatDongTthsRemoteModel,
					thongTinHoSoId);
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

		if (_qlvtLoaiHinhHoatDongTthsRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtLoaiHinhHoatDongTthsRemoteModel.getClass();

				Method method = clazz.getMethod("setSoLuongPhuongTien",
						int.class);

				method.invoke(_qlvtLoaiHinhHoatDongTthsRemoteModel,
					soLuongPhuongTien);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getThietBiGiamSatHanhTrinh() {
		return _thietBiGiamSatHanhTrinh;
	}

	@Override
	public void setThietBiGiamSatHanhTrinh(int thietBiGiamSatHanhTrinh) {
		_thietBiGiamSatHanhTrinh = thietBiGiamSatHanhTrinh;

		if (_qlvtLoaiHinhHoatDongTthsRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtLoaiHinhHoatDongTthsRemoteModel.getClass();

				Method method = clazz.getMethod("setThietBiGiamSatHanhTrinh",
						int.class);

				method.invoke(_qlvtLoaiHinhHoatDongTthsRemoteModel,
					thietBiGiamSatHanhTrinh);
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

		if (_qlvtLoaiHinhHoatDongTthsRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtLoaiHinhHoatDongTthsRemoteModel.getClass();

				Method method = clazz.getMethod("setTuyenTu", String.class);

				method.invoke(_qlvtLoaiHinhHoatDongTthsRemoteModel, tuyenTu);
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

		if (_qlvtLoaiHinhHoatDongTthsRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtLoaiHinhHoatDongTthsRemoteModel.getClass();

				Method method = clazz.getMethod("setTuyenDen", String.class);

				method.invoke(_qlvtLoaiHinhHoatDongTthsRemoteModel, tuyenDen);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSoChuyen() {
		return _soChuyen;
	}

	@Override
	public void setSoChuyen(long soChuyen) {
		_soChuyen = soChuyen;

		if (_qlvtLoaiHinhHoatDongTthsRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtLoaiHinhHoatDongTthsRemoteModel.getClass();

				Method method = clazz.getMethod("setSoChuyen", long.class);

				method.invoke(_qlvtLoaiHinhHoatDongTthsRemoteModel, soChuyen);
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

		if (_qlvtLoaiHinhHoatDongTthsRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtLoaiHinhHoatDongTthsRemoteModel.getClass();

				Method method = clazz.getMethod("setMauSon", String.class);

				method.invoke(_qlvtLoaiHinhHoatDongTthsRemoteModel, mauSon);
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

		if (_qlvtLoaiHinhHoatDongTthsRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtLoaiHinhHoatDongTthsRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiHinhKinhDoanhCuThe",
						String.class);

				method.invoke(_qlvtLoaiHinhHoatDongTthsRemoteModel,
					loaiHinhKinhDoanhCuThe);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDanhGia() {
		return _danhGia;
	}

	@Override
	public void setDanhGia(int danhGia) {
		_danhGia = danhGia;

		if (_qlvtLoaiHinhHoatDongTthsRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtLoaiHinhHoatDongTthsRemoteModel.getClass();

				Method method = clazz.getMethod("setDanhGia", int.class);

				method.invoke(_qlvtLoaiHinhHoatDongTthsRemoteModel, danhGia);
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

		if (_qlvtLoaiHinhHoatDongTthsRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtLoaiHinhHoatDongTthsRemoteModel.getClass();

				Method method = clazz.getMethod("setLyDoKhongDat", String.class);

				method.invoke(_qlvtLoaiHinhHoatDongTthsRemoteModel, lyDoKhongDat);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQlvtLoaiHinhHoatDongTthsRemoteModel() {
		return _qlvtLoaiHinhHoatDongTthsRemoteModel;
	}

	public void setQlvtLoaiHinhHoatDongTthsRemoteModel(
		BaseModel<?> qlvtLoaiHinhHoatDongTthsRemoteModel) {
		_qlvtLoaiHinhHoatDongTthsRemoteModel = qlvtLoaiHinhHoatDongTthsRemoteModel;
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

		Class<?> remoteModelClass = _qlvtLoaiHinhHoatDongTthsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtLoaiHinhHoatDongTthsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtLoaiHinhHoatDongTthsLocalServiceUtil.addQlvtLoaiHinhHoatDongTths(this);
		}
		else {
			QlvtLoaiHinhHoatDongTthsLocalServiceUtil.updateQlvtLoaiHinhHoatDongTths(this);
		}
	}

	@Override
	public QlvtLoaiHinhHoatDongTths toEscapedModel() {
		return (QlvtLoaiHinhHoatDongTths)ProxyUtil.newProxyInstance(QlvtLoaiHinhHoatDongTths.class.getClassLoader(),
			new Class[] { QlvtLoaiHinhHoatDongTths.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QlvtLoaiHinhHoatDongTthsClp clone = new QlvtLoaiHinhHoatDongTthsClp();

		clone.setId(getId());
		clone.setMaLoaiHinhHoatDong(getMaLoaiHinhHoatDong());
		clone.setThongTinHoSoId(getThongTinHoSoId());
		clone.setSoLuongPhuongTien(getSoLuongPhuongTien());
		clone.setThietBiGiamSatHanhTrinh(getThietBiGiamSatHanhTrinh());
		clone.setTuyenTu(getTuyenTu());
		clone.setTuyenDen(getTuyenDen());
		clone.setSoChuyen(getSoChuyen());
		clone.setMauSon(getMauSon());
		clone.setLoaiHinhKinhDoanhCuThe(getLoaiHinhKinhDoanhCuThe());
		clone.setDanhGia(getDanhGia());
		clone.setLyDoKhongDat(getLyDoKhongDat());

		return clone;
	}

	@Override
	public int compareTo(QlvtLoaiHinhHoatDongTths qlvtLoaiHinhHoatDongTths) {
		int value = 0;

		if (getId() < qlvtLoaiHinhHoatDongTths.getId()) {
			value = -1;
		}
		else if (getId() > qlvtLoaiHinhHoatDongTths.getId()) {
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

		if (!(obj instanceof QlvtLoaiHinhHoatDongTthsClp)) {
			return false;
		}

		QlvtLoaiHinhHoatDongTthsClp qlvtLoaiHinhHoatDongTths = (QlvtLoaiHinhHoatDongTthsClp)obj;

		long primaryKey = qlvtLoaiHinhHoatDongTths.getPrimaryKey();

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
		StringBundler sb = new StringBundler(25);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", maLoaiHinhHoatDong=");
		sb.append(getMaLoaiHinhHoatDong());
		sb.append(", thongTinHoSoId=");
		sb.append(getThongTinHoSoId());
		sb.append(", soLuongPhuongTien=");
		sb.append(getSoLuongPhuongTien());
		sb.append(", thietBiGiamSatHanhTrinh=");
		sb.append(getThietBiGiamSatHanhTrinh());
		sb.append(", tuyenTu=");
		sb.append(getTuyenTu());
		sb.append(", tuyenDen=");
		sb.append(getTuyenDen());
		sb.append(", soChuyen=");
		sb.append(getSoChuyen());
		sb.append(", mauSon=");
		sb.append(getMauSon());
		sb.append(", loaiHinhKinhDoanhCuThe=");
		sb.append(getLoaiHinhKinhDoanhCuThe());
		sb.append(", danhGia=");
		sb.append(getDanhGia());
		sb.append(", lyDoKhongDat=");
		sb.append(getLyDoKhongDat());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maLoaiHinhHoatDong</column-name><column-value><![CDATA[");
		sb.append(getMaLoaiHinhHoatDong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thongTinHoSoId</column-name><column-value><![CDATA[");
		sb.append(getThongTinHoSoId());
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
			"<column><column-name>loaiHinhKinhDoanhCuThe</column-name><column-value><![CDATA[");
		sb.append(getLoaiHinhKinhDoanhCuThe());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>danhGia</column-name><column-value><![CDATA[");
		sb.append(getDanhGia());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lyDoKhongDat</column-name><column-value><![CDATA[");
		sb.append(getLyDoKhongDat());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _maLoaiHinhHoatDong;
	private long _thongTinHoSoId;
	private int _soLuongPhuongTien;
	private int _thietBiGiamSatHanhTrinh;
	private String _tuyenTu;
	private String _tuyenDen;
	private long _soChuyen;
	private String _mauSon;
	private String _loaiHinhKinhDoanhCuThe;
	private int _danhGia;
	private String _lyDoKhongDat;
	private BaseModel<?> _qlvtLoaiHinhHoatDongTthsRemoteModel;
}