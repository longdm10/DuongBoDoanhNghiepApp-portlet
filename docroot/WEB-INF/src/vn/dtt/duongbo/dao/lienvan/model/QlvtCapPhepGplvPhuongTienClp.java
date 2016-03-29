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

package vn.dtt.duongbo.dao.lienvan.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbo.dao.lienvan.service.ClpSerializer;
import vn.dtt.duongbo.dao.lienvan.service.QlvtCapPhepGplvPhuongTienLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author NhanNc
 */
public class QlvtCapPhepGplvPhuongTienClp extends BaseModelImpl<QlvtCapPhepGplvPhuongTien>
	implements QlvtCapPhepGplvPhuongTien {
	public QlvtCapPhepGplvPhuongTienClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtCapPhepGplvPhuongTien.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtCapPhepGplvPhuongTien.class.getName();
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
		attributes.put("giayPhepLienVanId", getGiayPhepLienVanId());
		attributes.put("soPhuHieu", getSoPhuHieu());
		attributes.put("ngayCapPhep", getNgayCapPhep());
		attributes.put("ngayGiaHan", getNgayGiaHan());
		attributes.put("ngayHetHan", getNgayHetHan());
		attributes.put("cuaKhau", getCuaKhau());
		attributes.put("maCuaKhau", getMaCuaKhau());
		attributes.put("hinhThucHoatDong", getHinhThucHoatDong());
		attributes.put("thoiHanPhuHieu", getThoiHanPhuHieu());
		attributes.put("soHuu", getSoHuu());
		attributes.put("chuSoHuu", getChuSoHuu());
		attributes.put("thoiHanChoThue", getThoiHanChoThue());
		attributes.put("hopDongSauCung", getHopDongSauCung());
		attributes.put("mucPhi", getMucPhi());
		attributes.put("thongTinXuLyViPham", getThongTinXuLyViPham());
		attributes.put("trangThai", getTrangThai());
		attributes.put("fileId", getFileId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long giayPhepLienVanId = (Long)attributes.get("giayPhepLienVanId");

		if (giayPhepLienVanId != null) {
			setGiayPhepLienVanId(giayPhepLienVanId);
		}

		String soPhuHieu = (String)attributes.get("soPhuHieu");

		if (soPhuHieu != null) {
			setSoPhuHieu(soPhuHieu);
		}

		Date ngayCapPhep = (Date)attributes.get("ngayCapPhep");

		if (ngayCapPhep != null) {
			setNgayCapPhep(ngayCapPhep);
		}

		Date ngayGiaHan = (Date)attributes.get("ngayGiaHan");

		if (ngayGiaHan != null) {
			setNgayGiaHan(ngayGiaHan);
		}

		Date ngayHetHan = (Date)attributes.get("ngayHetHan");

		if (ngayHetHan != null) {
			setNgayHetHan(ngayHetHan);
		}

		String cuaKhau = (String)attributes.get("cuaKhau");

		if (cuaKhau != null) {
			setCuaKhau(cuaKhau);
		}

		String maCuaKhau = (String)attributes.get("maCuaKhau");

		if (maCuaKhau != null) {
			setMaCuaKhau(maCuaKhau);
		}

		String hinhThucHoatDong = (String)attributes.get("hinhThucHoatDong");

		if (hinhThucHoatDong != null) {
			setHinhThucHoatDong(hinhThucHoatDong);
		}

		Date thoiHanPhuHieu = (Date)attributes.get("thoiHanPhuHieu");

		if (thoiHanPhuHieu != null) {
			setThoiHanPhuHieu(thoiHanPhuHieu);
		}

		Integer soHuu = (Integer)attributes.get("soHuu");

		if (soHuu != null) {
			setSoHuu(soHuu);
		}

		String chuSoHuu = (String)attributes.get("chuSoHuu");

		if (chuSoHuu != null) {
			setChuSoHuu(chuSoHuu);
		}

		Date thoiHanChoThue = (Date)attributes.get("thoiHanChoThue");

		if (thoiHanChoThue != null) {
			setThoiHanChoThue(thoiHanChoThue);
		}

		Integer hopDongSauCung = (Integer)attributes.get("hopDongSauCung");

		if (hopDongSauCung != null) {
			setHopDongSauCung(hopDongSauCung);
		}

		String mucPhi = (String)attributes.get("mucPhi");

		if (mucPhi != null) {
			setMucPhi(mucPhi);
		}

		String thongTinXuLyViPham = (String)attributes.get("thongTinXuLyViPham");

		if (thongTinXuLyViPham != null) {
			setThongTinXuLyViPham(thongTinXuLyViPham);
		}

		String trangThai = (String)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}

		Long fileId = (Long)attributes.get("fileId");

		if (fileId != null) {
			setFileId(fileId);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_qlvtCapPhepGplvPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGplvPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_qlvtCapPhepGplvPhuongTienRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGiayPhepLienVanId() {
		return _giayPhepLienVanId;
	}

	@Override
	public void setGiayPhepLienVanId(long giayPhepLienVanId) {
		_giayPhepLienVanId = giayPhepLienVanId;

		if (_qlvtCapPhepGplvPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGplvPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setGiayPhepLienVanId",
						long.class);

				method.invoke(_qlvtCapPhepGplvPhuongTienRemoteModel,
					giayPhepLienVanId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoPhuHieu() {
		return _soPhuHieu;
	}

	@Override
	public void setSoPhuHieu(String soPhuHieu) {
		_soPhuHieu = soPhuHieu;

		if (_qlvtCapPhepGplvPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGplvPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setSoPhuHieu", String.class);

				method.invoke(_qlvtCapPhepGplvPhuongTienRemoteModel, soPhuHieu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayCapPhep() {
		return _ngayCapPhep;
	}

	@Override
	public void setNgayCapPhep(Date ngayCapPhep) {
		_ngayCapPhep = ngayCapPhep;

		if (_qlvtCapPhepGplvPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGplvPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayCapPhep", Date.class);

				method.invoke(_qlvtCapPhepGplvPhuongTienRemoteModel, ngayCapPhep);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayGiaHan() {
		return _ngayGiaHan;
	}

	@Override
	public void setNgayGiaHan(Date ngayGiaHan) {
		_ngayGiaHan = ngayGiaHan;

		if (_qlvtCapPhepGplvPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGplvPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayGiaHan", Date.class);

				method.invoke(_qlvtCapPhepGplvPhuongTienRemoteModel, ngayGiaHan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayHetHan() {
		return _ngayHetHan;
	}

	@Override
	public void setNgayHetHan(Date ngayHetHan) {
		_ngayHetHan = ngayHetHan;

		if (_qlvtCapPhepGplvPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGplvPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayHetHan", Date.class);

				method.invoke(_qlvtCapPhepGplvPhuongTienRemoteModel, ngayHetHan);
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

		if (_qlvtCapPhepGplvPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGplvPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setCuaKhau", String.class);

				method.invoke(_qlvtCapPhepGplvPhuongTienRemoteModel, cuaKhau);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaCuaKhau() {
		return _maCuaKhau;
	}

	@Override
	public void setMaCuaKhau(String maCuaKhau) {
		_maCuaKhau = maCuaKhau;

		if (_qlvtCapPhepGplvPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGplvPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setMaCuaKhau", String.class);

				method.invoke(_qlvtCapPhepGplvPhuongTienRemoteModel, maCuaKhau);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getHinhThucHoatDong() {
		return _hinhThucHoatDong;
	}

	@Override
	public void setHinhThucHoatDong(String hinhThucHoatDong) {
		_hinhThucHoatDong = hinhThucHoatDong;

		if (_qlvtCapPhepGplvPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGplvPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setHinhThucHoatDong",
						String.class);

				method.invoke(_qlvtCapPhepGplvPhuongTienRemoteModel,
					hinhThucHoatDong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getThoiHanPhuHieu() {
		return _thoiHanPhuHieu;
	}

	@Override
	public void setThoiHanPhuHieu(Date thoiHanPhuHieu) {
		_thoiHanPhuHieu = thoiHanPhuHieu;

		if (_qlvtCapPhepGplvPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGplvPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setThoiHanPhuHieu", Date.class);

				method.invoke(_qlvtCapPhepGplvPhuongTienRemoteModel,
					thoiHanPhuHieu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoHuu() {
		return _soHuu;
	}

	@Override
	public void setSoHuu(int soHuu) {
		_soHuu = soHuu;

		if (_qlvtCapPhepGplvPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGplvPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setSoHuu", int.class);

				method.invoke(_qlvtCapPhepGplvPhuongTienRemoteModel, soHuu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getChuSoHuu() {
		return _chuSoHuu;
	}

	@Override
	public void setChuSoHuu(String chuSoHuu) {
		_chuSoHuu = chuSoHuu;

		if (_qlvtCapPhepGplvPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGplvPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setChuSoHuu", String.class);

				method.invoke(_qlvtCapPhepGplvPhuongTienRemoteModel, chuSoHuu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getThoiHanChoThue() {
		return _thoiHanChoThue;
	}

	@Override
	public void setThoiHanChoThue(Date thoiHanChoThue) {
		_thoiHanChoThue = thoiHanChoThue;

		if (_qlvtCapPhepGplvPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGplvPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setThoiHanChoThue", Date.class);

				method.invoke(_qlvtCapPhepGplvPhuongTienRemoteModel,
					thoiHanChoThue);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getHopDongSauCung() {
		return _hopDongSauCung;
	}

	@Override
	public void setHopDongSauCung(int hopDongSauCung) {
		_hopDongSauCung = hopDongSauCung;

		if (_qlvtCapPhepGplvPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGplvPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setHopDongSauCung", int.class);

				method.invoke(_qlvtCapPhepGplvPhuongTienRemoteModel,
					hopDongSauCung);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMucPhi() {
		return _mucPhi;
	}

	@Override
	public void setMucPhi(String mucPhi) {
		_mucPhi = mucPhi;

		if (_qlvtCapPhepGplvPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGplvPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setMucPhi", String.class);

				method.invoke(_qlvtCapPhepGplvPhuongTienRemoteModel, mucPhi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getThongTinXuLyViPham() {
		return _thongTinXuLyViPham;
	}

	@Override
	public void setThongTinXuLyViPham(String thongTinXuLyViPham) {
		_thongTinXuLyViPham = thongTinXuLyViPham;

		if (_qlvtCapPhepGplvPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGplvPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setThongTinXuLyViPham",
						String.class);

				method.invoke(_qlvtCapPhepGplvPhuongTienRemoteModel,
					thongTinXuLyViPham);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTrangThai() {
		return _trangThai;
	}

	@Override
	public void setTrangThai(String trangThai) {
		_trangThai = trangThai;

		if (_qlvtCapPhepGplvPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGplvPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThai", String.class);

				method.invoke(_qlvtCapPhepGplvPhuongTienRemoteModel, trangThai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getFileId() {
		return _fileId;
	}

	@Override
	public void setFileId(long fileId) {
		_fileId = fileId;

		if (_qlvtCapPhepGplvPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGplvPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setFileId", long.class);

				method.invoke(_qlvtCapPhepGplvPhuongTienRemoteModel, fileId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQlvtCapPhepGplvPhuongTienRemoteModel() {
		return _qlvtCapPhepGplvPhuongTienRemoteModel;
	}

	public void setQlvtCapPhepGplvPhuongTienRemoteModel(
		BaseModel<?> qlvtCapPhepGplvPhuongTienRemoteModel) {
		_qlvtCapPhepGplvPhuongTienRemoteModel = qlvtCapPhepGplvPhuongTienRemoteModel;
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

		Class<?> remoteModelClass = _qlvtCapPhepGplvPhuongTienRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtCapPhepGplvPhuongTienRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtCapPhepGplvPhuongTienLocalServiceUtil.addQlvtCapPhepGplvPhuongTien(this);
		}
		else {
			QlvtCapPhepGplvPhuongTienLocalServiceUtil.updateQlvtCapPhepGplvPhuongTien(this);
		}
	}

	@Override
	public QlvtCapPhepGplvPhuongTien toEscapedModel() {
		return (QlvtCapPhepGplvPhuongTien)ProxyUtil.newProxyInstance(QlvtCapPhepGplvPhuongTien.class.getClassLoader(),
			new Class[] { QlvtCapPhepGplvPhuongTien.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QlvtCapPhepGplvPhuongTienClp clone = new QlvtCapPhepGplvPhuongTienClp();

		clone.setId(getId());
		clone.setGiayPhepLienVanId(getGiayPhepLienVanId());
		clone.setSoPhuHieu(getSoPhuHieu());
		clone.setNgayCapPhep(getNgayCapPhep());
		clone.setNgayGiaHan(getNgayGiaHan());
		clone.setNgayHetHan(getNgayHetHan());
		clone.setCuaKhau(getCuaKhau());
		clone.setMaCuaKhau(getMaCuaKhau());
		clone.setHinhThucHoatDong(getHinhThucHoatDong());
		clone.setThoiHanPhuHieu(getThoiHanPhuHieu());
		clone.setSoHuu(getSoHuu());
		clone.setChuSoHuu(getChuSoHuu());
		clone.setThoiHanChoThue(getThoiHanChoThue());
		clone.setHopDongSauCung(getHopDongSauCung());
		clone.setMucPhi(getMucPhi());
		clone.setThongTinXuLyViPham(getThongTinXuLyViPham());
		clone.setTrangThai(getTrangThai());
		clone.setFileId(getFileId());

		return clone;
	}

	@Override
	public int compareTo(QlvtCapPhepGplvPhuongTien qlvtCapPhepGplvPhuongTien) {
		int value = 0;

		if (getId() < qlvtCapPhepGplvPhuongTien.getId()) {
			value = -1;
		}
		else if (getId() > qlvtCapPhepGplvPhuongTien.getId()) {
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

		if (!(obj instanceof QlvtCapPhepGplvPhuongTienClp)) {
			return false;
		}

		QlvtCapPhepGplvPhuongTienClp qlvtCapPhepGplvPhuongTien = (QlvtCapPhepGplvPhuongTienClp)obj;

		long primaryKey = qlvtCapPhepGplvPhuongTien.getPrimaryKey();

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
		StringBundler sb = new StringBundler(37);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", giayPhepLienVanId=");
		sb.append(getGiayPhepLienVanId());
		sb.append(", soPhuHieu=");
		sb.append(getSoPhuHieu());
		sb.append(", ngayCapPhep=");
		sb.append(getNgayCapPhep());
		sb.append(", ngayGiaHan=");
		sb.append(getNgayGiaHan());
		sb.append(", ngayHetHan=");
		sb.append(getNgayHetHan());
		sb.append(", cuaKhau=");
		sb.append(getCuaKhau());
		sb.append(", maCuaKhau=");
		sb.append(getMaCuaKhau());
		sb.append(", hinhThucHoatDong=");
		sb.append(getHinhThucHoatDong());
		sb.append(", thoiHanPhuHieu=");
		sb.append(getThoiHanPhuHieu());
		sb.append(", soHuu=");
		sb.append(getSoHuu());
		sb.append(", chuSoHuu=");
		sb.append(getChuSoHuu());
		sb.append(", thoiHanChoThue=");
		sb.append(getThoiHanChoThue());
		sb.append(", hopDongSauCung=");
		sb.append(getHopDongSauCung());
		sb.append(", mucPhi=");
		sb.append(getMucPhi());
		sb.append(", thongTinXuLyViPham=");
		sb.append(getThongTinXuLyViPham());
		sb.append(", trangThai=");
		sb.append(getTrangThai());
		sb.append(", fileId=");
		sb.append(getFileId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(58);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvPhuongTien");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>giayPhepLienVanId</column-name><column-value><![CDATA[");
		sb.append(getGiayPhepLienVanId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soPhuHieu</column-name><column-value><![CDATA[");
		sb.append(getSoPhuHieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayCapPhep</column-name><column-value><![CDATA[");
		sb.append(getNgayCapPhep());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayGiaHan</column-name><column-value><![CDATA[");
		sb.append(getNgayGiaHan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayHetHan</column-name><column-value><![CDATA[");
		sb.append(getNgayHetHan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cuaKhau</column-name><column-value><![CDATA[");
		sb.append(getCuaKhau());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maCuaKhau</column-name><column-value><![CDATA[");
		sb.append(getMaCuaKhau());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hinhThucHoatDong</column-name><column-value><![CDATA[");
		sb.append(getHinhThucHoatDong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thoiHanPhuHieu</column-name><column-value><![CDATA[");
		sb.append(getThoiHanPhuHieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soHuu</column-name><column-value><![CDATA[");
		sb.append(getSoHuu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chuSoHuu</column-name><column-value><![CDATA[");
		sb.append(getChuSoHuu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thoiHanChoThue</column-name><column-value><![CDATA[");
		sb.append(getThoiHanChoThue());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hopDongSauCung</column-name><column-value><![CDATA[");
		sb.append(getHopDongSauCung());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mucPhi</column-name><column-value><![CDATA[");
		sb.append(getMucPhi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thongTinXuLyViPham</column-name><column-value><![CDATA[");
		sb.append(getThongTinXuLyViPham());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThai</column-name><column-value><![CDATA[");
		sb.append(getTrangThai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fileId</column-name><column-value><![CDATA[");
		sb.append(getFileId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _giayPhepLienVanId;
	private String _soPhuHieu;
	private Date _ngayCapPhep;
	private Date _ngayGiaHan;
	private Date _ngayHetHan;
	private String _cuaKhau;
	private String _maCuaKhau;
	private String _hinhThucHoatDong;
	private Date _thoiHanPhuHieu;
	private int _soHuu;
	private String _chuSoHuu;
	private Date _thoiHanChoThue;
	private int _hopDongSauCung;
	private String _mucPhi;
	private String _thongTinXuLyViPham;
	private String _trangThai;
	private long _fileId;
	private BaseModel<?> _qlvtCapPhepGplvPhuongTienRemoteModel;
}