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
import vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTCapPhepBienHieuLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author binhta
 */
public class QLVTCapPhepBienHieuClp extends BaseModelImpl<QLVTCapPhepBienHieu>
	implements QLVTCapPhepBienHieu {
	public QLVTCapPhepBienHieuClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QLVTCapPhepBienHieu.class;
	}

	@Override
	public String getModelClassName() {
		return QLVTCapPhepBienHieu.class.getName();
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
		attributes.put("thongTinHoSoId", getThongTinHoSoId());
		attributes.put("loaiHinhKinhDoanhId", getLoaiHinhKinhDoanhId());
		attributes.put("soPhuHieu", getSoPhuHieu());
		attributes.put("coQuanCapLanDauId", getCoQuanCapLanDauId());
		attributes.put("CoQuanCapPhepId", getCoQuanCapPhepId());
		attributes.put("ngayCapPhuHieu", getNgayCapPhuHieu());
		attributes.put("thoiHanPhuHieu", getThoiHanPhuHieu());
		attributes.put("maTuyenCoDinh", getMaTuyenCoDinh());
		attributes.put("linhVucKinhDoanhXeDuLich", getLinhVucKinhDoanhXeDuLich());
		attributes.put("doanhNghiepChoThue", getDoanhNghiepChoThue());
		attributes.put("thoiHanThue", getThoiHanThue());
		attributes.put("hopDongSauCung", getHopDongSauCung());
		attributes.put("ngayCapLanDau", getNgayCapLanDau());
		attributes.put("lanGiaHan", getLanGiaHan());
		attributes.put("ghiChu", getGhiChu());
		attributes.put("trangThai", getTrangThai());
		attributes.put("fileId", getFileId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer thongTinHoSoId = (Integer)attributes.get("thongTinHoSoId");

		if (thongTinHoSoId != null) {
			setThongTinHoSoId(thongTinHoSoId);
		}

		Integer loaiHinhKinhDoanhId = (Integer)attributes.get(
				"loaiHinhKinhDoanhId");

		if (loaiHinhKinhDoanhId != null) {
			setLoaiHinhKinhDoanhId(loaiHinhKinhDoanhId);
		}

		Integer soPhuHieu = (Integer)attributes.get("soPhuHieu");

		if (soPhuHieu != null) {
			setSoPhuHieu(soPhuHieu);
		}

		Integer coQuanCapLanDauId = (Integer)attributes.get("coQuanCapLanDauId");

		if (coQuanCapLanDauId != null) {
			setCoQuanCapLanDauId(coQuanCapLanDauId);
		}

		Integer CoQuanCapPhepId = (Integer)attributes.get("CoQuanCapPhepId");

		if (CoQuanCapPhepId != null) {
			setCoQuanCapPhepId(CoQuanCapPhepId);
		}

		Date ngayCapPhuHieu = (Date)attributes.get("ngayCapPhuHieu");

		if (ngayCapPhuHieu != null) {
			setNgayCapPhuHieu(ngayCapPhuHieu);
		}

		Date thoiHanPhuHieu = (Date)attributes.get("thoiHanPhuHieu");

		if (thoiHanPhuHieu != null) {
			setThoiHanPhuHieu(thoiHanPhuHieu);
		}

		String maTuyenCoDinh = (String)attributes.get("maTuyenCoDinh");

		if (maTuyenCoDinh != null) {
			setMaTuyenCoDinh(maTuyenCoDinh);
		}

		String linhVucKinhDoanhXeDuLich = (String)attributes.get(
				"linhVucKinhDoanhXeDuLich");

		if (linhVucKinhDoanhXeDuLich != null) {
			setLinhVucKinhDoanhXeDuLich(linhVucKinhDoanhXeDuLich);
		}

		String doanhNghiepChoThue = (String)attributes.get("doanhNghiepChoThue");

		if (doanhNghiepChoThue != null) {
			setDoanhNghiepChoThue(doanhNghiepChoThue);
		}

		Date thoiHanThue = (Date)attributes.get("thoiHanThue");

		if (thoiHanThue != null) {
			setThoiHanThue(thoiHanThue);
		}

		Integer hopDongSauCung = (Integer)attributes.get("hopDongSauCung");

		if (hopDongSauCung != null) {
			setHopDongSauCung(hopDongSauCung);
		}

		Date ngayCapLanDau = (Date)attributes.get("ngayCapLanDau");

		if (ngayCapLanDau != null) {
			setNgayCapLanDau(ngayCapLanDau);
		}

		Integer lanGiaHan = (Integer)attributes.get("lanGiaHan");

		if (lanGiaHan != null) {
			setLanGiaHan(lanGiaHan);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}

		String trangThai = (String)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}

		Integer fileId = (Integer)attributes.get("fileId");

		if (fileId != null) {
			setFileId(fileId);
		}
	}

	@Override
	public int getId() {
		return _id;
	}

	@Override
	public void setId(int id) {
		_id = id;

		if (_qlvtCapPhepBienHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepBienHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setId", int.class);

				method.invoke(_qlvtCapPhepBienHieuRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getThongTinHoSoId() {
		return _thongTinHoSoId;
	}

	@Override
	public void setThongTinHoSoId(int thongTinHoSoId) {
		_thongTinHoSoId = thongTinHoSoId;

		if (_qlvtCapPhepBienHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepBienHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setThongTinHoSoId", int.class);

				method.invoke(_qlvtCapPhepBienHieuRemoteModel, thongTinHoSoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLoaiHinhKinhDoanhId() {
		return _loaiHinhKinhDoanhId;
	}

	@Override
	public void setLoaiHinhKinhDoanhId(int loaiHinhKinhDoanhId) {
		_loaiHinhKinhDoanhId = loaiHinhKinhDoanhId;

		if (_qlvtCapPhepBienHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepBienHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiHinhKinhDoanhId",
						int.class);

				method.invoke(_qlvtCapPhepBienHieuRemoteModel,
					loaiHinhKinhDoanhId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoPhuHieu() {
		return _soPhuHieu;
	}

	@Override
	public void setSoPhuHieu(int soPhuHieu) {
		_soPhuHieu = soPhuHieu;

		if (_qlvtCapPhepBienHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepBienHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setSoPhuHieu", int.class);

				method.invoke(_qlvtCapPhepBienHieuRemoteModel, soPhuHieu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCoQuanCapLanDauId() {
		return _coQuanCapLanDauId;
	}

	@Override
	public void setCoQuanCapLanDauId(int coQuanCapLanDauId) {
		_coQuanCapLanDauId = coQuanCapLanDauId;

		if (_qlvtCapPhepBienHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepBienHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setCoQuanCapLanDauId",
						int.class);

				method.invoke(_qlvtCapPhepBienHieuRemoteModel, coQuanCapLanDauId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCoQuanCapPhepId() {
		return _CoQuanCapPhepId;
	}

	@Override
	public void setCoQuanCapPhepId(int CoQuanCapPhepId) {
		_CoQuanCapPhepId = CoQuanCapPhepId;

		if (_qlvtCapPhepBienHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepBienHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setCoQuanCapPhepId", int.class);

				method.invoke(_qlvtCapPhepBienHieuRemoteModel, CoQuanCapPhepId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayCapPhuHieu() {
		return _ngayCapPhuHieu;
	}

	@Override
	public void setNgayCapPhuHieu(Date ngayCapPhuHieu) {
		_ngayCapPhuHieu = ngayCapPhuHieu;

		if (_qlvtCapPhepBienHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepBienHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayCapPhuHieu", Date.class);

				method.invoke(_qlvtCapPhepBienHieuRemoteModel, ngayCapPhuHieu);
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

		if (_qlvtCapPhepBienHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepBienHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setThoiHanPhuHieu", Date.class);

				method.invoke(_qlvtCapPhepBienHieuRemoteModel, thoiHanPhuHieu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaTuyenCoDinh() {
		return _maTuyenCoDinh;
	}

	@Override
	public void setMaTuyenCoDinh(String maTuyenCoDinh) {
		_maTuyenCoDinh = maTuyenCoDinh;

		if (_qlvtCapPhepBienHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepBienHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setMaTuyenCoDinh", String.class);

				method.invoke(_qlvtCapPhepBienHieuRemoteModel, maTuyenCoDinh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLinhVucKinhDoanhXeDuLich() {
		return _linhVucKinhDoanhXeDuLich;
	}

	@Override
	public void setLinhVucKinhDoanhXeDuLich(String linhVucKinhDoanhXeDuLich) {
		_linhVucKinhDoanhXeDuLich = linhVucKinhDoanhXeDuLich;

		if (_qlvtCapPhepBienHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepBienHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setLinhVucKinhDoanhXeDuLich",
						String.class);

				method.invoke(_qlvtCapPhepBienHieuRemoteModel,
					linhVucKinhDoanhXeDuLich);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDoanhNghiepChoThue() {
		return _doanhNghiepChoThue;
	}

	@Override
	public void setDoanhNghiepChoThue(String doanhNghiepChoThue) {
		_doanhNghiepChoThue = doanhNghiepChoThue;

		if (_qlvtCapPhepBienHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepBienHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setDoanhNghiepChoThue",
						String.class);

				method.invoke(_qlvtCapPhepBienHieuRemoteModel,
					doanhNghiepChoThue);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getThoiHanThue() {
		return _thoiHanThue;
	}

	@Override
	public void setThoiHanThue(Date thoiHanThue) {
		_thoiHanThue = thoiHanThue;

		if (_qlvtCapPhepBienHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepBienHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setThoiHanThue", Date.class);

				method.invoke(_qlvtCapPhepBienHieuRemoteModel, thoiHanThue);
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

		if (_qlvtCapPhepBienHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepBienHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setHopDongSauCung", int.class);

				method.invoke(_qlvtCapPhepBienHieuRemoteModel, hopDongSauCung);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayCapLanDau() {
		return _ngayCapLanDau;
	}

	@Override
	public void setNgayCapLanDau(Date ngayCapLanDau) {
		_ngayCapLanDau = ngayCapLanDau;

		if (_qlvtCapPhepBienHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepBienHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayCapLanDau", Date.class);

				method.invoke(_qlvtCapPhepBienHieuRemoteModel, ngayCapLanDau);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLanGiaHan() {
		return _lanGiaHan;
	}

	@Override
	public void setLanGiaHan(int lanGiaHan) {
		_lanGiaHan = lanGiaHan;

		if (_qlvtCapPhepBienHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepBienHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setLanGiaHan", int.class);

				method.invoke(_qlvtCapPhepBienHieuRemoteModel, lanGiaHan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGhiChu() {
		return _ghiChu;
	}

	@Override
	public void setGhiChu(String ghiChu) {
		_ghiChu = ghiChu;

		if (_qlvtCapPhepBienHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepBienHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setGhiChu", String.class);

				method.invoke(_qlvtCapPhepBienHieuRemoteModel, ghiChu);
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

		if (_qlvtCapPhepBienHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepBienHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThai", String.class);

				method.invoke(_qlvtCapPhepBienHieuRemoteModel, trangThai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getFileId() {
		return _fileId;
	}

	@Override
	public void setFileId(int fileId) {
		_fileId = fileId;

		if (_qlvtCapPhepBienHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepBienHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setFileId", int.class);

				method.invoke(_qlvtCapPhepBienHieuRemoteModel, fileId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQLVTCapPhepBienHieuRemoteModel() {
		return _qlvtCapPhepBienHieuRemoteModel;
	}

	public void setQLVTCapPhepBienHieuRemoteModel(
		BaseModel<?> qlvtCapPhepBienHieuRemoteModel) {
		_qlvtCapPhepBienHieuRemoteModel = qlvtCapPhepBienHieuRemoteModel;
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

		Class<?> remoteModelClass = _qlvtCapPhepBienHieuRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtCapPhepBienHieuRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QLVTCapPhepBienHieuLocalServiceUtil.addQLVTCapPhepBienHieu(this);
		}
		else {
			QLVTCapPhepBienHieuLocalServiceUtil.updateQLVTCapPhepBienHieu(this);
		}
	}

	@Override
	public QLVTCapPhepBienHieu toEscapedModel() {
		return (QLVTCapPhepBienHieu)ProxyUtil.newProxyInstance(QLVTCapPhepBienHieu.class.getClassLoader(),
			new Class[] { QLVTCapPhepBienHieu.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QLVTCapPhepBienHieuClp clone = new QLVTCapPhepBienHieuClp();

		clone.setId(getId());
		clone.setThongTinHoSoId(getThongTinHoSoId());
		clone.setLoaiHinhKinhDoanhId(getLoaiHinhKinhDoanhId());
		clone.setSoPhuHieu(getSoPhuHieu());
		clone.setCoQuanCapLanDauId(getCoQuanCapLanDauId());
		clone.setCoQuanCapPhepId(getCoQuanCapPhepId());
		clone.setNgayCapPhuHieu(getNgayCapPhuHieu());
		clone.setThoiHanPhuHieu(getThoiHanPhuHieu());
		clone.setMaTuyenCoDinh(getMaTuyenCoDinh());
		clone.setLinhVucKinhDoanhXeDuLich(getLinhVucKinhDoanhXeDuLich());
		clone.setDoanhNghiepChoThue(getDoanhNghiepChoThue());
		clone.setThoiHanThue(getThoiHanThue());
		clone.setHopDongSauCung(getHopDongSauCung());
		clone.setNgayCapLanDau(getNgayCapLanDau());
		clone.setLanGiaHan(getLanGiaHan());
		clone.setGhiChu(getGhiChu());
		clone.setTrangThai(getTrangThai());
		clone.setFileId(getFileId());

		return clone;
	}

	@Override
	public int compareTo(QLVTCapPhepBienHieu qlvtCapPhepBienHieu) {
		int primaryKey = qlvtCapPhepBienHieu.getPrimaryKey();

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

		if (!(obj instanceof QLVTCapPhepBienHieuClp)) {
			return false;
		}

		QLVTCapPhepBienHieuClp qlvtCapPhepBienHieu = (QLVTCapPhepBienHieuClp)obj;

		int primaryKey = qlvtCapPhepBienHieu.getPrimaryKey();

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
		StringBundler sb = new StringBundler(37);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", thongTinHoSoId=");
		sb.append(getThongTinHoSoId());
		sb.append(", loaiHinhKinhDoanhId=");
		sb.append(getLoaiHinhKinhDoanhId());
		sb.append(", soPhuHieu=");
		sb.append(getSoPhuHieu());
		sb.append(", coQuanCapLanDauId=");
		sb.append(getCoQuanCapLanDauId());
		sb.append(", CoQuanCapPhepId=");
		sb.append(getCoQuanCapPhepId());
		sb.append(", ngayCapPhuHieu=");
		sb.append(getNgayCapPhuHieu());
		sb.append(", thoiHanPhuHieu=");
		sb.append(getThoiHanPhuHieu());
		sb.append(", maTuyenCoDinh=");
		sb.append(getMaTuyenCoDinh());
		sb.append(", linhVucKinhDoanhXeDuLich=");
		sb.append(getLinhVucKinhDoanhXeDuLich());
		sb.append(", doanhNghiepChoThue=");
		sb.append(getDoanhNghiepChoThue());
		sb.append(", thoiHanThue=");
		sb.append(getThoiHanThue());
		sb.append(", hopDongSauCung=");
		sb.append(getHopDongSauCung());
		sb.append(", ngayCapLanDau=");
		sb.append(getNgayCapLanDau());
		sb.append(", lanGiaHan=");
		sb.append(getLanGiaHan());
		sb.append(", ghiChu=");
		sb.append(getGhiChu());
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
		sb.append(
			"vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepBienHieu");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thongTinHoSoId</column-name><column-value><![CDATA[");
		sb.append(getThongTinHoSoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiHinhKinhDoanhId</column-name><column-value><![CDATA[");
		sb.append(getLoaiHinhKinhDoanhId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soPhuHieu</column-name><column-value><![CDATA[");
		sb.append(getSoPhuHieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>coQuanCapLanDauId</column-name><column-value><![CDATA[");
		sb.append(getCoQuanCapLanDauId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CoQuanCapPhepId</column-name><column-value><![CDATA[");
		sb.append(getCoQuanCapPhepId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayCapPhuHieu</column-name><column-value><![CDATA[");
		sb.append(getNgayCapPhuHieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thoiHanPhuHieu</column-name><column-value><![CDATA[");
		sb.append(getThoiHanPhuHieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maTuyenCoDinh</column-name><column-value><![CDATA[");
		sb.append(getMaTuyenCoDinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>linhVucKinhDoanhXeDuLich</column-name><column-value><![CDATA[");
		sb.append(getLinhVucKinhDoanhXeDuLich());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>doanhNghiepChoThue</column-name><column-value><![CDATA[");
		sb.append(getDoanhNghiepChoThue());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thoiHanThue</column-name><column-value><![CDATA[");
		sb.append(getThoiHanThue());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hopDongSauCung</column-name><column-value><![CDATA[");
		sb.append(getHopDongSauCung());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayCapLanDau</column-name><column-value><![CDATA[");
		sb.append(getNgayCapLanDau());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lanGiaHan</column-name><column-value><![CDATA[");
		sb.append(getLanGiaHan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ghiChu</column-name><column-value><![CDATA[");
		sb.append(getGhiChu());
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

	private int _id;
	private int _thongTinHoSoId;
	private int _loaiHinhKinhDoanhId;
	private int _soPhuHieu;
	private int _coQuanCapLanDauId;
	private int _CoQuanCapPhepId;
	private Date _ngayCapPhuHieu;
	private Date _thoiHanPhuHieu;
	private String _maTuyenCoDinh;
	private String _linhVucKinhDoanhXeDuLich;
	private String _doanhNghiepChoThue;
	private Date _thoiHanThue;
	private int _hopDongSauCung;
	private Date _ngayCapLanDau;
	private int _lanGiaHan;
	private String _ghiChu;
	private String _trangThai;
	private int _fileId;
	private BaseModel<?> _qlvtCapPhepBienHieuRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbo.dao.capbienhieuphuhieu.service.ClpSerializer.class;
}