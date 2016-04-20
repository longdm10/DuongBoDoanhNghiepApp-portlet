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
import vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTCapPhepPhuHieuLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author binhta
 */
public class QLVTCapPhepPhuHieuClp extends BaseModelImpl<QLVTCapPhepPhuHieu>
	implements QLVTCapPhepPhuHieu {
	public QLVTCapPhepPhuHieuClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QLVTCapPhepPhuHieu.class;
	}

	@Override
	public String getModelClassName() {
		return QLVTCapPhepPhuHieu.class.getName();
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
		attributes.put("noiSanXuat", getNoiSanXuat());
		attributes.put("namSanXuat", getNamSanXuat());
		attributes.put("maTuyenCoDinh", getMaTuyenCoDinh());
		attributes.put("loaiPhuHieu", getLoaiPhuHieu());
		attributes.put("lanGiaHan", getLanGiaHan());
		attributes.put("ngayCapLanDau", getNgayCapLanDau());
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

		String noiSanXuat = (String)attributes.get("noiSanXuat");

		if (noiSanXuat != null) {
			setNoiSanXuat(noiSanXuat);
		}

		Integer namSanXuat = (Integer)attributes.get("namSanXuat");

		if (namSanXuat != null) {
			setNamSanXuat(namSanXuat);
		}

		String maTuyenCoDinh = (String)attributes.get("maTuyenCoDinh");

		if (maTuyenCoDinh != null) {
			setMaTuyenCoDinh(maTuyenCoDinh);
		}

		String loaiPhuHieu = (String)attributes.get("loaiPhuHieu");

		if (loaiPhuHieu != null) {
			setLoaiPhuHieu(loaiPhuHieu);
		}

		Integer lanGiaHan = (Integer)attributes.get("lanGiaHan");

		if (lanGiaHan != null) {
			setLanGiaHan(lanGiaHan);
		}

		Date ngayCapLanDau = (Date)attributes.get("ngayCapLanDau");

		if (ngayCapLanDau != null) {
			setNgayCapLanDau(ngayCapLanDau);
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

		if (_qlvtCapPhepPhuHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepPhuHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setId", int.class);

				method.invoke(_qlvtCapPhepPhuHieuRemoteModel, id);
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

		if (_qlvtCapPhepPhuHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepPhuHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setThongTinHoSoId", int.class);

				method.invoke(_qlvtCapPhepPhuHieuRemoteModel, thongTinHoSoId);
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

		if (_qlvtCapPhepPhuHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepPhuHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiHinhKinhDoanhId",
						int.class);

				method.invoke(_qlvtCapPhepPhuHieuRemoteModel,
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

		if (_qlvtCapPhepPhuHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepPhuHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setSoPhuHieu", int.class);

				method.invoke(_qlvtCapPhepPhuHieuRemoteModel, soPhuHieu);
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

		if (_qlvtCapPhepPhuHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepPhuHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setCoQuanCapLanDauId",
						int.class);

				method.invoke(_qlvtCapPhepPhuHieuRemoteModel, coQuanCapLanDauId);
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

		if (_qlvtCapPhepPhuHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepPhuHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setCoQuanCapPhepId", int.class);

				method.invoke(_qlvtCapPhepPhuHieuRemoteModel, CoQuanCapPhepId);
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

		if (_qlvtCapPhepPhuHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepPhuHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayCapPhuHieu", Date.class);

				method.invoke(_qlvtCapPhepPhuHieuRemoteModel, ngayCapPhuHieu);
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

		if (_qlvtCapPhepPhuHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepPhuHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setThoiHanPhuHieu", Date.class);

				method.invoke(_qlvtCapPhepPhuHieuRemoteModel, thoiHanPhuHieu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNoiSanXuat() {
		return _noiSanXuat;
	}

	@Override
	public void setNoiSanXuat(String noiSanXuat) {
		_noiSanXuat = noiSanXuat;

		if (_qlvtCapPhepPhuHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepPhuHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setNoiSanXuat", String.class);

				method.invoke(_qlvtCapPhepPhuHieuRemoteModel, noiSanXuat);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNamSanXuat() {
		return _namSanXuat;
	}

	@Override
	public void setNamSanXuat(int namSanXuat) {
		_namSanXuat = namSanXuat;

		if (_qlvtCapPhepPhuHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepPhuHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setNamSanXuat", int.class);

				method.invoke(_qlvtCapPhepPhuHieuRemoteModel, namSanXuat);
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

		if (_qlvtCapPhepPhuHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepPhuHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setMaTuyenCoDinh", String.class);

				method.invoke(_qlvtCapPhepPhuHieuRemoteModel, maTuyenCoDinh);
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

		if (_qlvtCapPhepPhuHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepPhuHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiPhuHieu", String.class);

				method.invoke(_qlvtCapPhepPhuHieuRemoteModel, loaiPhuHieu);
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

		if (_qlvtCapPhepPhuHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepPhuHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setLanGiaHan", int.class);

				method.invoke(_qlvtCapPhepPhuHieuRemoteModel, lanGiaHan);
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

		if (_qlvtCapPhepPhuHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepPhuHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayCapLanDau", Date.class);

				method.invoke(_qlvtCapPhepPhuHieuRemoteModel, ngayCapLanDau);
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

		if (_qlvtCapPhepPhuHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepPhuHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setGhiChu", String.class);

				method.invoke(_qlvtCapPhepPhuHieuRemoteModel, ghiChu);
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

		if (_qlvtCapPhepPhuHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepPhuHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThai", String.class);

				method.invoke(_qlvtCapPhepPhuHieuRemoteModel, trangThai);
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

		if (_qlvtCapPhepPhuHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepPhuHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setFileId", int.class);

				method.invoke(_qlvtCapPhepPhuHieuRemoteModel, fileId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQLVTCapPhepPhuHieuRemoteModel() {
		return _qlvtCapPhepPhuHieuRemoteModel;
	}

	public void setQLVTCapPhepPhuHieuRemoteModel(
		BaseModel<?> qlvtCapPhepPhuHieuRemoteModel) {
		_qlvtCapPhepPhuHieuRemoteModel = qlvtCapPhepPhuHieuRemoteModel;
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

		Class<?> remoteModelClass = _qlvtCapPhepPhuHieuRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtCapPhepPhuHieuRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QLVTCapPhepPhuHieuLocalServiceUtil.addQLVTCapPhepPhuHieu(this);
		}
		else {
			QLVTCapPhepPhuHieuLocalServiceUtil.updateQLVTCapPhepPhuHieu(this);
		}
	}

	@Override
	public QLVTCapPhepPhuHieu toEscapedModel() {
		return (QLVTCapPhepPhuHieu)ProxyUtil.newProxyInstance(QLVTCapPhepPhuHieu.class.getClassLoader(),
			new Class[] { QLVTCapPhepPhuHieu.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QLVTCapPhepPhuHieuClp clone = new QLVTCapPhepPhuHieuClp();

		clone.setId(getId());
		clone.setThongTinHoSoId(getThongTinHoSoId());
		clone.setLoaiHinhKinhDoanhId(getLoaiHinhKinhDoanhId());
		clone.setSoPhuHieu(getSoPhuHieu());
		clone.setCoQuanCapLanDauId(getCoQuanCapLanDauId());
		clone.setCoQuanCapPhepId(getCoQuanCapPhepId());
		clone.setNgayCapPhuHieu(getNgayCapPhuHieu());
		clone.setThoiHanPhuHieu(getThoiHanPhuHieu());
		clone.setNoiSanXuat(getNoiSanXuat());
		clone.setNamSanXuat(getNamSanXuat());
		clone.setMaTuyenCoDinh(getMaTuyenCoDinh());
		clone.setLoaiPhuHieu(getLoaiPhuHieu());
		clone.setLanGiaHan(getLanGiaHan());
		clone.setNgayCapLanDau(getNgayCapLanDau());
		clone.setGhiChu(getGhiChu());
		clone.setTrangThai(getTrangThai());
		clone.setFileId(getFileId());

		return clone;
	}

	@Override
	public int compareTo(QLVTCapPhepPhuHieu qlvtCapPhepPhuHieu) {
		int primaryKey = qlvtCapPhepPhuHieu.getPrimaryKey();

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

		if (!(obj instanceof QLVTCapPhepPhuHieuClp)) {
			return false;
		}

		QLVTCapPhepPhuHieuClp qlvtCapPhepPhuHieu = (QLVTCapPhepPhuHieuClp)obj;

		int primaryKey = qlvtCapPhepPhuHieu.getPrimaryKey();

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
		StringBundler sb = new StringBundler(35);

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
		sb.append(", noiSanXuat=");
		sb.append(getNoiSanXuat());
		sb.append(", namSanXuat=");
		sb.append(getNamSanXuat());
		sb.append(", maTuyenCoDinh=");
		sb.append(getMaTuyenCoDinh());
		sb.append(", loaiPhuHieu=");
		sb.append(getLoaiPhuHieu());
		sb.append(", lanGiaHan=");
		sb.append(getLanGiaHan());
		sb.append(", ngayCapLanDau=");
		sb.append(getNgayCapLanDau());
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
		StringBundler sb = new StringBundler(55);

		sb.append("<model><model-name>");
		sb.append(
			"vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepPhuHieu");
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
			"<column><column-name>noiSanXuat</column-name><column-value><![CDATA[");
		sb.append(getNoiSanXuat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>namSanXuat</column-name><column-value><![CDATA[");
		sb.append(getNamSanXuat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maTuyenCoDinh</column-name><column-value><![CDATA[");
		sb.append(getMaTuyenCoDinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiPhuHieu</column-name><column-value><![CDATA[");
		sb.append(getLoaiPhuHieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lanGiaHan</column-name><column-value><![CDATA[");
		sb.append(getLanGiaHan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayCapLanDau</column-name><column-value><![CDATA[");
		sb.append(getNgayCapLanDau());
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
	private String _noiSanXuat;
	private int _namSanXuat;
	private String _maTuyenCoDinh;
	private String _loaiPhuHieu;
	private int _lanGiaHan;
	private Date _ngayCapLanDau;
	private String _ghiChu;
	private String _trangThai;
	private int _fileId;
	private BaseModel<?> _qlvtCapPhepPhuHieuRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbo.dao.capbienhieuphuhieu.service.ClpSerializer.class;
}