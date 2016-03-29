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
import vn.dtt.duongbo.dao.lienvan.service.QlvtCapPhepGpkdvtDuongboQuocTeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author NhanNc
 */
public class QlvtCapPhepGpkdvtDuongboQuocTeClp extends BaseModelImpl<QlvtCapPhepGpkdvtDuongboQuocTe>
	implements QlvtCapPhepGpkdvtDuongboQuocTe {
	public QlvtCapPhepGpkdvtDuongboQuocTeClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtCapPhepGpkdvtDuongboQuocTe.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtCapPhepGpkdvtDuongboQuocTe.class.getName();
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
		attributes.put("gpKinhDoanhVanTaiOtoId", getGpKinhDoanhVanTaiOtoId());
		attributes.put("soGpvtQuocTe", getSoGpvtQuocTe());
		attributes.put("coQuanCapLanDauId", getCoQuanCapLanDauId());
		attributes.put("ngayCapGpvt", getNgayCapGpvt());
		attributes.put("coQuanCapGpvtId", getCoQuanCapGpvtId());
		attributes.put("ngayGiaHan", getNgayGiaHan());
		attributes.put("ngayHetHan", getNgayHetHan());
		attributes.put("lanGiaHan", getLanGiaHan());
		attributes.put("fileId", getFileId());
		attributes.put("trangThai", getTrangThai());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long gpKinhDoanhVanTaiOtoId = (Long)attributes.get(
				"gpKinhDoanhVanTaiOtoId");

		if (gpKinhDoanhVanTaiOtoId != null) {
			setGpKinhDoanhVanTaiOtoId(gpKinhDoanhVanTaiOtoId);
		}

		String soGpvtQuocTe = (String)attributes.get("soGpvtQuocTe");

		if (soGpvtQuocTe != null) {
			setSoGpvtQuocTe(soGpvtQuocTe);
		}

		Long coQuanCapLanDauId = (Long)attributes.get("coQuanCapLanDauId");

		if (coQuanCapLanDauId != null) {
			setCoQuanCapLanDauId(coQuanCapLanDauId);
		}

		Date ngayCapGpvt = (Date)attributes.get("ngayCapGpvt");

		if (ngayCapGpvt != null) {
			setNgayCapGpvt(ngayCapGpvt);
		}

		Long coQuanCapGpvtId = (Long)attributes.get("coQuanCapGpvtId");

		if (coQuanCapGpvtId != null) {
			setCoQuanCapGpvtId(coQuanCapGpvtId);
		}

		Date ngayGiaHan = (Date)attributes.get("ngayGiaHan");

		if (ngayGiaHan != null) {
			setNgayGiaHan(ngayGiaHan);
		}

		Date ngayHetHan = (Date)attributes.get("ngayHetHan");

		if (ngayHetHan != null) {
			setNgayHetHan(ngayHetHan);
		}

		Integer lanGiaHan = (Integer)attributes.get("lanGiaHan");

		if (lanGiaHan != null) {
			setLanGiaHan(lanGiaHan);
		}

		Long fileId = (Long)attributes.get("fileId");

		if (fileId != null) {
			setFileId(fileId);
		}

		String trangThai = (String)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_qlvtCapPhepGpkdvtDuongboQuocTeRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGpkdvtDuongboQuocTeRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_qlvtCapPhepGpkdvtDuongboQuocTeRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGpKinhDoanhVanTaiOtoId() {
		return _gpKinhDoanhVanTaiOtoId;
	}

	@Override
	public void setGpKinhDoanhVanTaiOtoId(long gpKinhDoanhVanTaiOtoId) {
		_gpKinhDoanhVanTaiOtoId = gpKinhDoanhVanTaiOtoId;

		if (_qlvtCapPhepGpkdvtDuongboQuocTeRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGpkdvtDuongboQuocTeRemoteModel.getClass();

				Method method = clazz.getMethod("setGpKinhDoanhVanTaiOtoId",
						long.class);

				method.invoke(_qlvtCapPhepGpkdvtDuongboQuocTeRemoteModel,
					gpKinhDoanhVanTaiOtoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoGpvtQuocTe() {
		return _soGpvtQuocTe;
	}

	@Override
	public void setSoGpvtQuocTe(String soGpvtQuocTe) {
		_soGpvtQuocTe = soGpvtQuocTe;

		if (_qlvtCapPhepGpkdvtDuongboQuocTeRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGpkdvtDuongboQuocTeRemoteModel.getClass();

				Method method = clazz.getMethod("setSoGpvtQuocTe", String.class);

				method.invoke(_qlvtCapPhepGpkdvtDuongboQuocTeRemoteModel,
					soGpvtQuocTe);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCoQuanCapLanDauId() {
		return _coQuanCapLanDauId;
	}

	@Override
	public void setCoQuanCapLanDauId(long coQuanCapLanDauId) {
		_coQuanCapLanDauId = coQuanCapLanDauId;

		if (_qlvtCapPhepGpkdvtDuongboQuocTeRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGpkdvtDuongboQuocTeRemoteModel.getClass();

				Method method = clazz.getMethod("setCoQuanCapLanDauId",
						long.class);

				method.invoke(_qlvtCapPhepGpkdvtDuongboQuocTeRemoteModel,
					coQuanCapLanDauId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayCapGpvt() {
		return _ngayCapGpvt;
	}

	@Override
	public void setNgayCapGpvt(Date ngayCapGpvt) {
		_ngayCapGpvt = ngayCapGpvt;

		if (_qlvtCapPhepGpkdvtDuongboQuocTeRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGpkdvtDuongboQuocTeRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayCapGpvt", Date.class);

				method.invoke(_qlvtCapPhepGpkdvtDuongboQuocTeRemoteModel,
					ngayCapGpvt);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCoQuanCapGpvtId() {
		return _coQuanCapGpvtId;
	}

	@Override
	public void setCoQuanCapGpvtId(long coQuanCapGpvtId) {
		_coQuanCapGpvtId = coQuanCapGpvtId;

		if (_qlvtCapPhepGpkdvtDuongboQuocTeRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGpkdvtDuongboQuocTeRemoteModel.getClass();

				Method method = clazz.getMethod("setCoQuanCapGpvtId", long.class);

				method.invoke(_qlvtCapPhepGpkdvtDuongboQuocTeRemoteModel,
					coQuanCapGpvtId);
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

		if (_qlvtCapPhepGpkdvtDuongboQuocTeRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGpkdvtDuongboQuocTeRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayGiaHan", Date.class);

				method.invoke(_qlvtCapPhepGpkdvtDuongboQuocTeRemoteModel,
					ngayGiaHan);
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

		if (_qlvtCapPhepGpkdvtDuongboQuocTeRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGpkdvtDuongboQuocTeRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayHetHan", Date.class);

				method.invoke(_qlvtCapPhepGpkdvtDuongboQuocTeRemoteModel,
					ngayHetHan);
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

		if (_qlvtCapPhepGpkdvtDuongboQuocTeRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGpkdvtDuongboQuocTeRemoteModel.getClass();

				Method method = clazz.getMethod("setLanGiaHan", int.class);

				method.invoke(_qlvtCapPhepGpkdvtDuongboQuocTeRemoteModel,
					lanGiaHan);
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

		if (_qlvtCapPhepGpkdvtDuongboQuocTeRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGpkdvtDuongboQuocTeRemoteModel.getClass();

				Method method = clazz.getMethod("setFileId", long.class);

				method.invoke(_qlvtCapPhepGpkdvtDuongboQuocTeRemoteModel, fileId);
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

		if (_qlvtCapPhepGpkdvtDuongboQuocTeRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGpkdvtDuongboQuocTeRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThai", String.class);

				method.invoke(_qlvtCapPhepGpkdvtDuongboQuocTeRemoteModel,
					trangThai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQlvtCapPhepGpkdvtDuongboQuocTeRemoteModel() {
		return _qlvtCapPhepGpkdvtDuongboQuocTeRemoteModel;
	}

	public void setQlvtCapPhepGpkdvtDuongboQuocTeRemoteModel(
		BaseModel<?> qlvtCapPhepGpkdvtDuongboQuocTeRemoteModel) {
		_qlvtCapPhepGpkdvtDuongboQuocTeRemoteModel = qlvtCapPhepGpkdvtDuongboQuocTeRemoteModel;
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

		Class<?> remoteModelClass = _qlvtCapPhepGpkdvtDuongboQuocTeRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtCapPhepGpkdvtDuongboQuocTeRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtCapPhepGpkdvtDuongboQuocTeLocalServiceUtil.addQlvtCapPhepGpkdvtDuongboQuocTe(this);
		}
		else {
			QlvtCapPhepGpkdvtDuongboQuocTeLocalServiceUtil.updateQlvtCapPhepGpkdvtDuongboQuocTe(this);
		}
	}

	@Override
	public QlvtCapPhepGpkdvtDuongboQuocTe toEscapedModel() {
		return (QlvtCapPhepGpkdvtDuongboQuocTe)ProxyUtil.newProxyInstance(QlvtCapPhepGpkdvtDuongboQuocTe.class.getClassLoader(),
			new Class[] { QlvtCapPhepGpkdvtDuongboQuocTe.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QlvtCapPhepGpkdvtDuongboQuocTeClp clone = new QlvtCapPhepGpkdvtDuongboQuocTeClp();

		clone.setId(getId());
		clone.setGpKinhDoanhVanTaiOtoId(getGpKinhDoanhVanTaiOtoId());
		clone.setSoGpvtQuocTe(getSoGpvtQuocTe());
		clone.setCoQuanCapLanDauId(getCoQuanCapLanDauId());
		clone.setNgayCapGpvt(getNgayCapGpvt());
		clone.setCoQuanCapGpvtId(getCoQuanCapGpvtId());
		clone.setNgayGiaHan(getNgayGiaHan());
		clone.setNgayHetHan(getNgayHetHan());
		clone.setLanGiaHan(getLanGiaHan());
		clone.setFileId(getFileId());
		clone.setTrangThai(getTrangThai());

		return clone;
	}

	@Override
	public int compareTo(
		QlvtCapPhepGpkdvtDuongboQuocTe qlvtCapPhepGpkdvtDuongboQuocTe) {
		int value = 0;

		if (getId() < qlvtCapPhepGpkdvtDuongboQuocTe.getId()) {
			value = -1;
		}
		else if (getId() > qlvtCapPhepGpkdvtDuongboQuocTe.getId()) {
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

		if (!(obj instanceof QlvtCapPhepGpkdvtDuongboQuocTeClp)) {
			return false;
		}

		QlvtCapPhepGpkdvtDuongboQuocTeClp qlvtCapPhepGpkdvtDuongboQuocTe = (QlvtCapPhepGpkdvtDuongboQuocTeClp)obj;

		long primaryKey = qlvtCapPhepGpkdvtDuongboQuocTe.getPrimaryKey();

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
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", gpKinhDoanhVanTaiOtoId=");
		sb.append(getGpKinhDoanhVanTaiOtoId());
		sb.append(", soGpvtQuocTe=");
		sb.append(getSoGpvtQuocTe());
		sb.append(", coQuanCapLanDauId=");
		sb.append(getCoQuanCapLanDauId());
		sb.append(", ngayCapGpvt=");
		sb.append(getNgayCapGpvt());
		sb.append(", coQuanCapGpvtId=");
		sb.append(getCoQuanCapGpvtId());
		sb.append(", ngayGiaHan=");
		sb.append(getNgayGiaHan());
		sb.append(", ngayHetHan=");
		sb.append(getNgayHetHan());
		sb.append(", lanGiaHan=");
		sb.append(getLanGiaHan());
		sb.append(", fileId=");
		sb.append(getFileId());
		sb.append(", trangThai=");
		sb.append(getTrangThai());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append(
			"vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpkdvtDuongboQuocTe");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gpKinhDoanhVanTaiOtoId</column-name><column-value><![CDATA[");
		sb.append(getGpKinhDoanhVanTaiOtoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soGpvtQuocTe</column-name><column-value><![CDATA[");
		sb.append(getSoGpvtQuocTe());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>coQuanCapLanDauId</column-name><column-value><![CDATA[");
		sb.append(getCoQuanCapLanDauId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayCapGpvt</column-name><column-value><![CDATA[");
		sb.append(getNgayCapGpvt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>coQuanCapGpvtId</column-name><column-value><![CDATA[");
		sb.append(getCoQuanCapGpvtId());
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
			"<column><column-name>lanGiaHan</column-name><column-value><![CDATA[");
		sb.append(getLanGiaHan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fileId</column-name><column-value><![CDATA[");
		sb.append(getFileId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThai</column-name><column-value><![CDATA[");
		sb.append(getTrangThai());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _gpKinhDoanhVanTaiOtoId;
	private String _soGpvtQuocTe;
	private long _coQuanCapLanDauId;
	private Date _ngayCapGpvt;
	private long _coQuanCapGpvtId;
	private Date _ngayGiaHan;
	private Date _ngayHetHan;
	private int _lanGiaHan;
	private long _fileId;
	private String _trangThai;
	private BaseModel<?> _qlvtCapPhepGpkdvtDuongboQuocTeRemoteModel;
}