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

package vn.dtt.duongbo.dao.capbienhieuphuhieu.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbo.dao.capbienhieuphuhieu.service.ClpSerializer;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyPhuHieuLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author binhta
 */
public class QLVTXuLyPhuHieuClp extends BaseModelImpl<QLVTXuLyPhuHieu>
	implements QLVTXuLyPhuHieu {
	public QLVTXuLyPhuHieuClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QLVTXuLyPhuHieu.class;
	}

	@Override
	public String getModelClassName() {
		return QLVTXuLyPhuHieu.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("soLuongBHPHNopLai", getSoLuongBHPHNopLai());
		attributes.put("soLuongBienHieu", getSoLuongBienHieu());
		attributes.put("thongTinXuLyId", getThongTinXuLyId());
		attributes.put("loaiPhuHieu", getLoaiPhuHieu());
		attributes.put("soLuong", getSoLuong());
		attributes.put("soLuongBH_PHNopLai", getSoLuongBH_PHNopLai());
		attributes.put("sovbChapNhanTuyen", getSovbChapNhanTuyen());
		attributes.put("ngayCapVBChapNhanTuyen", getNgayCapVBChapNhanTuyen());
		attributes.put("lanCap", getLanCap());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer soLuongBHPHNopLai = (Integer)attributes.get("soLuongBHPHNopLai");

		if (soLuongBHPHNopLai != null) {
			setSoLuongBHPHNopLai(soLuongBHPHNopLai);
		}

		Integer soLuongBienHieu = (Integer)attributes.get("soLuongBienHieu");

		if (soLuongBienHieu != null) {
			setSoLuongBienHieu(soLuongBienHieu);
		}

		Integer thongTinXuLyId = (Integer)attributes.get("thongTinXuLyId");

		if (thongTinXuLyId != null) {
			setThongTinXuLyId(thongTinXuLyId);
		}

		String loaiPhuHieu = (String)attributes.get("loaiPhuHieu");

		if (loaiPhuHieu != null) {
			setLoaiPhuHieu(loaiPhuHieu);
		}

		Integer soLuong = (Integer)attributes.get("soLuong");

		if (soLuong != null) {
			setSoLuong(soLuong);
		}

		Integer soLuongBH_PHNopLai = (Integer)attributes.get(
				"soLuongBH_PHNopLai");

		if (soLuongBH_PHNopLai != null) {
			setSoLuongBH_PHNopLai(soLuongBH_PHNopLai);
		}

		String sovbChapNhanTuyen = (String)attributes.get("sovbChapNhanTuyen");

		if (sovbChapNhanTuyen != null) {
			setSovbChapNhanTuyen(sovbChapNhanTuyen);
		}

		Date ngayCapVBChapNhanTuyen = (Date)attributes.get(
				"ngayCapVBChapNhanTuyen");

		if (ngayCapVBChapNhanTuyen != null) {
			setNgayCapVBChapNhanTuyen(ngayCapVBChapNhanTuyen);
		}

		Integer lanCap = (Integer)attributes.get("lanCap");

		if (lanCap != null) {
			setLanCap(lanCap);
		}
	}

	@Override
	public int getId() {
		return _id;
	}

	@Override
	public void setId(int id) {
		_id = id;

		if (_qlvtXuLyPhuHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyPhuHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setId", int.class);

				method.invoke(_qlvtXuLyPhuHieuRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoLuongBHPHNopLai() {
		return _soLuongBHPHNopLai;
	}

	@Override
	public void setSoLuongBHPHNopLai(int soLuongBHPHNopLai) {
		_soLuongBHPHNopLai = soLuongBHPHNopLai;

		if (_qlvtXuLyPhuHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyPhuHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setSoLuongBHPHNopLai",
						int.class);

				method.invoke(_qlvtXuLyPhuHieuRemoteModel, soLuongBHPHNopLai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoLuongBienHieu() {
		return _soLuongBienHieu;
	}

	@Override
	public void setSoLuongBienHieu(int soLuongBienHieu) {
		_soLuongBienHieu = soLuongBienHieu;

		if (_qlvtXuLyPhuHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyPhuHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setSoLuongBienHieu", int.class);

				method.invoke(_qlvtXuLyPhuHieuRemoteModel, soLuongBienHieu);
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

		if (_qlvtXuLyPhuHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyPhuHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setThongTinXuLyId", int.class);

				method.invoke(_qlvtXuLyPhuHieuRemoteModel, thongTinXuLyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLoaiPhuHieu() {
		return _loaiPhuHieu;
	}

	@Override
	public void setLoaiPhuHieu(String loaiPhuHieu) {
		_loaiPhuHieu = loaiPhuHieu;

		if (_qlvtXuLyPhuHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyPhuHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiPhuHieu", String.class);

				method.invoke(_qlvtXuLyPhuHieuRemoteModel, loaiPhuHieu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoLuong() {
		return _soLuong;
	}

	@Override
	public void setSoLuong(int soLuong) {
		_soLuong = soLuong;

		if (_qlvtXuLyPhuHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyPhuHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setSoLuong", int.class);

				method.invoke(_qlvtXuLyPhuHieuRemoteModel, soLuong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoLuongBH_PHNopLai() {
		return _soLuongBH_PHNopLai;
	}

	@Override
	public void setSoLuongBH_PHNopLai(int soLuongBH_PHNopLai) {
		_soLuongBH_PHNopLai = soLuongBH_PHNopLai;

		if (_qlvtXuLyPhuHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyPhuHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setSoLuongBH_PHNopLai",
						int.class);

				method.invoke(_qlvtXuLyPhuHieuRemoteModel, soLuongBH_PHNopLai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSovbChapNhanTuyen() {
		return _sovbChapNhanTuyen;
	}

	@Override
	public void setSovbChapNhanTuyen(String sovbChapNhanTuyen) {
		_sovbChapNhanTuyen = sovbChapNhanTuyen;

		if (_qlvtXuLyPhuHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyPhuHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setSovbChapNhanTuyen",
						String.class);

				method.invoke(_qlvtXuLyPhuHieuRemoteModel, sovbChapNhanTuyen);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayCapVBChapNhanTuyen() {
		return _ngayCapVBChapNhanTuyen;
	}

	@Override
	public void setNgayCapVBChapNhanTuyen(Date ngayCapVBChapNhanTuyen) {
		_ngayCapVBChapNhanTuyen = ngayCapVBChapNhanTuyen;

		if (_qlvtXuLyPhuHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyPhuHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayCapVBChapNhanTuyen",
						Date.class);

				method.invoke(_qlvtXuLyPhuHieuRemoteModel,
					ngayCapVBChapNhanTuyen);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLanCap() {
		return _lanCap;
	}

	@Override
	public void setLanCap(int lanCap) {
		_lanCap = lanCap;

		if (_qlvtXuLyPhuHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyPhuHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setLanCap", int.class);

				method.invoke(_qlvtXuLyPhuHieuRemoteModel, lanCap);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQLVTXuLyPhuHieuRemoteModel() {
		return _qlvtXuLyPhuHieuRemoteModel;
	}

	public void setQLVTXuLyPhuHieuRemoteModel(
		BaseModel<?> qlvtXuLyPhuHieuRemoteModel) {
		_qlvtXuLyPhuHieuRemoteModel = qlvtXuLyPhuHieuRemoteModel;
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

		Class<?> remoteModelClass = _qlvtXuLyPhuHieuRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtXuLyPhuHieuRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QLVTXuLyPhuHieuLocalServiceUtil.addQLVTXuLyPhuHieu(this);
		}
		else {
			QLVTXuLyPhuHieuLocalServiceUtil.updateQLVTXuLyPhuHieu(this);
		}
	}

	@Override
	public QLVTXuLyPhuHieu toEscapedModel() {
		return (QLVTXuLyPhuHieu)ProxyUtil.newProxyInstance(QLVTXuLyPhuHieu.class.getClassLoader(),
			new Class[] { QLVTXuLyPhuHieu.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QLVTXuLyPhuHieuClp clone = new QLVTXuLyPhuHieuClp();

		clone.setId(getId());
		clone.setSoLuongBHPHNopLai(getSoLuongBHPHNopLai());
		clone.setSoLuongBienHieu(getSoLuongBienHieu());
		clone.setThongTinXuLyId(getThongTinXuLyId());
		clone.setLoaiPhuHieu(getLoaiPhuHieu());
		clone.setSoLuong(getSoLuong());
		clone.setSoLuongBH_PHNopLai(getSoLuongBH_PHNopLai());
		clone.setSovbChapNhanTuyen(getSovbChapNhanTuyen());
		clone.setNgayCapVBChapNhanTuyen(getNgayCapVBChapNhanTuyen());
		clone.setLanCap(getLanCap());

		return clone;
	}

	@Override
	public int compareTo(QLVTXuLyPhuHieu qlvtXuLyPhuHieu) {
		int primaryKey = qlvtXuLyPhuHieu.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QLVTXuLyPhuHieuClp)) {
			return false;
		}

		QLVTXuLyPhuHieuClp qlvtXuLyPhuHieu = (QLVTXuLyPhuHieuClp)obj;

		int primaryKey = qlvtXuLyPhuHieu.getPrimaryKey();

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
		return getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", soLuongBHPHNopLai=");
		sb.append(getSoLuongBHPHNopLai());
		sb.append(", soLuongBienHieu=");
		sb.append(getSoLuongBienHieu());
		sb.append(", thongTinXuLyId=");
		sb.append(getThongTinXuLyId());
		sb.append(", loaiPhuHieu=");
		sb.append(getLoaiPhuHieu());
		sb.append(", soLuong=");
		sb.append(getSoLuong());
		sb.append(", soLuongBH_PHNopLai=");
		sb.append(getSoLuongBH_PHNopLai());
		sb.append(", sovbChapNhanTuyen=");
		sb.append(getSovbChapNhanTuyen());
		sb.append(", ngayCapVBChapNhanTuyen=");
		sb.append(getNgayCapVBChapNhanTuyen());
		sb.append(", lanCap=");
		sb.append(getLanCap());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soLuongBHPHNopLai</column-name><column-value><![CDATA[");
		sb.append(getSoLuongBHPHNopLai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soLuongBienHieu</column-name><column-value><![CDATA[");
		sb.append(getSoLuongBienHieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thongTinXuLyId</column-name><column-value><![CDATA[");
		sb.append(getThongTinXuLyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiPhuHieu</column-name><column-value><![CDATA[");
		sb.append(getLoaiPhuHieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soLuong</column-name><column-value><![CDATA[");
		sb.append(getSoLuong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soLuongBH_PHNopLai</column-name><column-value><![CDATA[");
		sb.append(getSoLuongBH_PHNopLai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sovbChapNhanTuyen</column-name><column-value><![CDATA[");
		sb.append(getSovbChapNhanTuyen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayCapVBChapNhanTuyen</column-name><column-value><![CDATA[");
		sb.append(getNgayCapVBChapNhanTuyen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lanCap</column-name><column-value><![CDATA[");
		sb.append(getLanCap());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _id;
	private int _soLuongBHPHNopLai;
	private int _soLuongBienHieu;
	private int _thongTinXuLyId;
	private String _loaiPhuHieu;
	private int _soLuong;
	private int _soLuongBH_PHNopLai;
	private String _sovbChapNhanTuyen;
	private Date _ngayCapVBChapNhanTuyen;
	private int _lanCap;
	private BaseModel<?> _qlvtXuLyPhuHieuRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbo.dao.capbienhieuphuhieu.service.ClpSerializer.class;
}