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
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtQuanLyFileLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author NhanNc
 */
public class QlvtQuanLyFileClp extends BaseModelImpl<QlvtQuanLyFile>
	implements QlvtQuanLyFile {
	public QlvtQuanLyFileClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtQuanLyFile.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtQuanLyFile.class.getName();
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
		attributes.put("tenFile", getTenFile());
		attributes.put("loaiFile", getLoaiFile());
		attributes.put("thongTinFile", getThongTinFile());
		attributes.put("ngayTai", getNgayTai());
		attributes.put("ngayCap", getNgayCap());
		attributes.put("ngayHetHan", getNgayHetHan());
		attributes.put("idFile", getIdFile());
		attributes.put("trangThai", getTrangThai());
		attributes.put("doanhNghiepId", getDoanhNghiepId());
		attributes.put("taiKhoan", getTaiKhoan());
		attributes.put("mieuTa", getMieuTa());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String tenFile = (String)attributes.get("tenFile");

		if (tenFile != null) {
			setTenFile(tenFile);
		}

		Long loaiFile = (Long)attributes.get("loaiFile");

		if (loaiFile != null) {
			setLoaiFile(loaiFile);
		}

		String thongTinFile = (String)attributes.get("thongTinFile");

		if (thongTinFile != null) {
			setThongTinFile(thongTinFile);
		}

		Date ngayTai = (Date)attributes.get("ngayTai");

		if (ngayTai != null) {
			setNgayTai(ngayTai);
		}

		Date ngayCap = (Date)attributes.get("ngayCap");

		if (ngayCap != null) {
			setNgayCap(ngayCap);
		}

		Date ngayHetHan = (Date)attributes.get("ngayHetHan");

		if (ngayHetHan != null) {
			setNgayHetHan(ngayHetHan);
		}

		Long idFile = (Long)attributes.get("idFile");

		if (idFile != null) {
			setIdFile(idFile);
		}

		String trangThai = (String)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}

		Long doanhNghiepId = (Long)attributes.get("doanhNghiepId");

		if (doanhNghiepId != null) {
			setDoanhNghiepId(doanhNghiepId);
		}

		Long taiKhoan = (Long)attributes.get("taiKhoan");

		if (taiKhoan != null) {
			setTaiKhoan(taiKhoan);
		}

		String mieuTa = (String)attributes.get("mieuTa");

		if (mieuTa != null) {
			setMieuTa(mieuTa);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_qlvtQuanLyFileRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtQuanLyFileRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_qlvtQuanLyFileRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenFile() {
		return _tenFile;
	}

	@Override
	public void setTenFile(String tenFile) {
		_tenFile = tenFile;

		if (_qlvtQuanLyFileRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtQuanLyFileRemoteModel.getClass();

				Method method = clazz.getMethod("setTenFile", String.class);

				method.invoke(_qlvtQuanLyFileRemoteModel, tenFile);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getLoaiFile() {
		return _loaiFile;
	}

	@Override
	public void setLoaiFile(long loaiFile) {
		_loaiFile = loaiFile;

		if (_qlvtQuanLyFileRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtQuanLyFileRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiFile", long.class);

				method.invoke(_qlvtQuanLyFileRemoteModel, loaiFile);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getThongTinFile() {
		return _thongTinFile;
	}

	@Override
	public void setThongTinFile(String thongTinFile) {
		_thongTinFile = thongTinFile;

		if (_qlvtQuanLyFileRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtQuanLyFileRemoteModel.getClass();

				Method method = clazz.getMethod("setThongTinFile", String.class);

				method.invoke(_qlvtQuanLyFileRemoteModel, thongTinFile);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayTai() {
		return _ngayTai;
	}

	@Override
	public void setNgayTai(Date ngayTai) {
		_ngayTai = ngayTai;

		if (_qlvtQuanLyFileRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtQuanLyFileRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayTai", Date.class);

				method.invoke(_qlvtQuanLyFileRemoteModel, ngayTai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayCap() {
		return _ngayCap;
	}

	@Override
	public void setNgayCap(Date ngayCap) {
		_ngayCap = ngayCap;

		if (_qlvtQuanLyFileRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtQuanLyFileRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayCap", Date.class);

				method.invoke(_qlvtQuanLyFileRemoteModel, ngayCap);
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

		if (_qlvtQuanLyFileRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtQuanLyFileRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayHetHan", Date.class);

				method.invoke(_qlvtQuanLyFileRemoteModel, ngayHetHan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getIdFile() {
		return _idFile;
	}

	@Override
	public void setIdFile(long idFile) {
		_idFile = idFile;

		if (_qlvtQuanLyFileRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtQuanLyFileRemoteModel.getClass();

				Method method = clazz.getMethod("setIdFile", long.class);

				method.invoke(_qlvtQuanLyFileRemoteModel, idFile);
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

		if (_qlvtQuanLyFileRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtQuanLyFileRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThai", String.class);

				method.invoke(_qlvtQuanLyFileRemoteModel, trangThai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDoanhNghiepId() {
		return _doanhNghiepId;
	}

	@Override
	public void setDoanhNghiepId(long doanhNghiepId) {
		_doanhNghiepId = doanhNghiepId;

		if (_qlvtQuanLyFileRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtQuanLyFileRemoteModel.getClass();

				Method method = clazz.getMethod("setDoanhNghiepId", long.class);

				method.invoke(_qlvtQuanLyFileRemoteModel, doanhNghiepId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTaiKhoan() {
		return _taiKhoan;
	}

	@Override
	public void setTaiKhoan(long taiKhoan) {
		_taiKhoan = taiKhoan;

		if (_qlvtQuanLyFileRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtQuanLyFileRemoteModel.getClass();

				Method method = clazz.getMethod("setTaiKhoan", long.class);

				method.invoke(_qlvtQuanLyFileRemoteModel, taiKhoan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMieuTa() {
		return _mieuTa;
	}

	@Override
	public void setMieuTa(String mieuTa) {
		_mieuTa = mieuTa;

		if (_qlvtQuanLyFileRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtQuanLyFileRemoteModel.getClass();

				Method method = clazz.getMethod("setMieuTa", String.class);

				method.invoke(_qlvtQuanLyFileRemoteModel, mieuTa);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQlvtQuanLyFileRemoteModel() {
		return _qlvtQuanLyFileRemoteModel;
	}

	public void setQlvtQuanLyFileRemoteModel(
		BaseModel<?> qlvtQuanLyFileRemoteModel) {
		_qlvtQuanLyFileRemoteModel = qlvtQuanLyFileRemoteModel;
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

		Class<?> remoteModelClass = _qlvtQuanLyFileRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtQuanLyFileRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtQuanLyFileLocalServiceUtil.addQlvtQuanLyFile(this);
		}
		else {
			QlvtQuanLyFileLocalServiceUtil.updateQlvtQuanLyFile(this);
		}
	}

	@Override
	public QlvtQuanLyFile toEscapedModel() {
		return (QlvtQuanLyFile)ProxyUtil.newProxyInstance(QlvtQuanLyFile.class.getClassLoader(),
			new Class[] { QlvtQuanLyFile.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QlvtQuanLyFileClp clone = new QlvtQuanLyFileClp();

		clone.setId(getId());
		clone.setTenFile(getTenFile());
		clone.setLoaiFile(getLoaiFile());
		clone.setThongTinFile(getThongTinFile());
		clone.setNgayTai(getNgayTai());
		clone.setNgayCap(getNgayCap());
		clone.setNgayHetHan(getNgayHetHan());
		clone.setIdFile(getIdFile());
		clone.setTrangThai(getTrangThai());
		clone.setDoanhNghiepId(getDoanhNghiepId());
		clone.setTaiKhoan(getTaiKhoan());
		clone.setMieuTa(getMieuTa());

		return clone;
	}

	@Override
	public int compareTo(QlvtQuanLyFile qlvtQuanLyFile) {
		int value = 0;

		if (getId() < qlvtQuanLyFile.getId()) {
			value = -1;
		}
		else if (getId() > qlvtQuanLyFile.getId()) {
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

		if (!(obj instanceof QlvtQuanLyFileClp)) {
			return false;
		}

		QlvtQuanLyFileClp qlvtQuanLyFile = (QlvtQuanLyFileClp)obj;

		long primaryKey = qlvtQuanLyFile.getPrimaryKey();

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
		sb.append(", tenFile=");
		sb.append(getTenFile());
		sb.append(", loaiFile=");
		sb.append(getLoaiFile());
		sb.append(", thongTinFile=");
		sb.append(getThongTinFile());
		sb.append(", ngayTai=");
		sb.append(getNgayTai());
		sb.append(", ngayCap=");
		sb.append(getNgayCap());
		sb.append(", ngayHetHan=");
		sb.append(getNgayHetHan());
		sb.append(", idFile=");
		sb.append(getIdFile());
		sb.append(", trangThai=");
		sb.append(getTrangThai());
		sb.append(", doanhNghiepId=");
		sb.append(getDoanhNghiepId());
		sb.append(", taiKhoan=");
		sb.append(getTaiKhoan());
		sb.append(", mieuTa=");
		sb.append(getMieuTa());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenFile</column-name><column-value><![CDATA[");
		sb.append(getTenFile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiFile</column-name><column-value><![CDATA[");
		sb.append(getLoaiFile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thongTinFile</column-name><column-value><![CDATA[");
		sb.append(getThongTinFile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayTai</column-name><column-value><![CDATA[");
		sb.append(getNgayTai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayCap</column-name><column-value><![CDATA[");
		sb.append(getNgayCap());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayHetHan</column-name><column-value><![CDATA[");
		sb.append(getNgayHetHan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>idFile</column-name><column-value><![CDATA[");
		sb.append(getIdFile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThai</column-name><column-value><![CDATA[");
		sb.append(getTrangThai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>doanhNghiepId</column-name><column-value><![CDATA[");
		sb.append(getDoanhNghiepId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>taiKhoan</column-name><column-value><![CDATA[");
		sb.append(getTaiKhoan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mieuTa</column-name><column-value><![CDATA[");
		sb.append(getMieuTa());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _tenFile;
	private long _loaiFile;
	private String _thongTinFile;
	private Date _ngayTai;
	private Date _ngayCap;
	private Date _ngayHetHan;
	private long _idFile;
	private String _trangThai;
	private long _doanhNghiepId;
	private long _taiKhoan;
	private String _mieuTa;
	private BaseModel<?> _qlvtQuanLyFileRemoteModel;
}