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
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtYeuCauBoXungLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author NhanNc
 */
public class QlvtYeuCauBoXungClp extends BaseModelImpl<QlvtYeuCauBoXung>
	implements QlvtYeuCauBoXung {
	public QlvtYeuCauBoXungClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtYeuCauBoXung.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtYeuCauBoXung.class.getName();
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
		attributes.put("noiDung", getNoiDung());
		attributes.put("thongTinXuLyId", getThongTinXuLyId());
		attributes.put("soCongVan", getSoCongVan());
		attributes.put("ngayCongVan", getNgayCongVan());
		attributes.put("fileID", getFileID());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String noiDung = (String)attributes.get("noiDung");

		if (noiDung != null) {
			setNoiDung(noiDung);
		}

		Integer thongTinXuLyId = (Integer)attributes.get("thongTinXuLyId");

		if (thongTinXuLyId != null) {
			setThongTinXuLyId(thongTinXuLyId);
		}

		String soCongVan = (String)attributes.get("soCongVan");

		if (soCongVan != null) {
			setSoCongVan(soCongVan);
		}

		Date ngayCongVan = (Date)attributes.get("ngayCongVan");

		if (ngayCongVan != null) {
			setNgayCongVan(ngayCongVan);
		}

		Integer fileID = (Integer)attributes.get("fileID");

		if (fileID != null) {
			setFileID(fileID);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_qlvtYeuCauBoXungRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtYeuCauBoXungRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_qlvtYeuCauBoXungRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNoiDung() {
		return _noiDung;
	}

	@Override
	public void setNoiDung(String noiDung) {
		_noiDung = noiDung;

		if (_qlvtYeuCauBoXungRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtYeuCauBoXungRemoteModel.getClass();

				Method method = clazz.getMethod("setNoiDung", String.class);

				method.invoke(_qlvtYeuCauBoXungRemoteModel, noiDung);
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

		if (_qlvtYeuCauBoXungRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtYeuCauBoXungRemoteModel.getClass();

				Method method = clazz.getMethod("setThongTinXuLyId", int.class);

				method.invoke(_qlvtYeuCauBoXungRemoteModel, thongTinXuLyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoCongVan() {
		return _soCongVan;
	}

	@Override
	public void setSoCongVan(String soCongVan) {
		_soCongVan = soCongVan;

		if (_qlvtYeuCauBoXungRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtYeuCauBoXungRemoteModel.getClass();

				Method method = clazz.getMethod("setSoCongVan", String.class);

				method.invoke(_qlvtYeuCauBoXungRemoteModel, soCongVan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayCongVan() {
		return _ngayCongVan;
	}

	@Override
	public void setNgayCongVan(Date ngayCongVan) {
		_ngayCongVan = ngayCongVan;

		if (_qlvtYeuCauBoXungRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtYeuCauBoXungRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayCongVan", Date.class);

				method.invoke(_qlvtYeuCauBoXungRemoteModel, ngayCongVan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getFileID() {
		return _fileID;
	}

	@Override
	public void setFileID(int fileID) {
		_fileID = fileID;

		if (_qlvtYeuCauBoXungRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtYeuCauBoXungRemoteModel.getClass();

				Method method = clazz.getMethod("setFileID", int.class);

				method.invoke(_qlvtYeuCauBoXungRemoteModel, fileID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQlvtYeuCauBoXungRemoteModel() {
		return _qlvtYeuCauBoXungRemoteModel;
	}

	public void setQlvtYeuCauBoXungRemoteModel(
		BaseModel<?> qlvtYeuCauBoXungRemoteModel) {
		_qlvtYeuCauBoXungRemoteModel = qlvtYeuCauBoXungRemoteModel;
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

		Class<?> remoteModelClass = _qlvtYeuCauBoXungRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtYeuCauBoXungRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtYeuCauBoXungLocalServiceUtil.addQlvtYeuCauBoXung(this);
		}
		else {
			QlvtYeuCauBoXungLocalServiceUtil.updateQlvtYeuCauBoXung(this);
		}
	}

	@Override
	public QlvtYeuCauBoXung toEscapedModel() {
		return (QlvtYeuCauBoXung)ProxyUtil.newProxyInstance(QlvtYeuCauBoXung.class.getClassLoader(),
			new Class[] { QlvtYeuCauBoXung.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QlvtYeuCauBoXungClp clone = new QlvtYeuCauBoXungClp();

		clone.setId(getId());
		clone.setNoiDung(getNoiDung());
		clone.setThongTinXuLyId(getThongTinXuLyId());
		clone.setSoCongVan(getSoCongVan());
		clone.setNgayCongVan(getNgayCongVan());
		clone.setFileID(getFileID());

		return clone;
	}

	@Override
	public int compareTo(QlvtYeuCauBoXung qlvtYeuCauBoXung) {
		int value = 0;

		if (getId() < qlvtYeuCauBoXung.getId()) {
			value = -1;
		}
		else if (getId() > qlvtYeuCauBoXung.getId()) {
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

		if (!(obj instanceof QlvtYeuCauBoXungClp)) {
			return false;
		}

		QlvtYeuCauBoXungClp qlvtYeuCauBoXung = (QlvtYeuCauBoXungClp)obj;

		long primaryKey = qlvtYeuCauBoXung.getPrimaryKey();

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
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", noiDung=");
		sb.append(getNoiDung());
		sb.append(", thongTinXuLyId=");
		sb.append(getThongTinXuLyId());
		sb.append(", soCongVan=");
		sb.append(getSoCongVan());
		sb.append(", ngayCongVan=");
		sb.append(getNgayCongVan());
		sb.append(", fileID=");
		sb.append(getFileID());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.nghiepvu.model.QlvtYeuCauBoXung");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>noiDung</column-name><column-value><![CDATA[");
		sb.append(getNoiDung());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thongTinXuLyId</column-name><column-value><![CDATA[");
		sb.append(getThongTinXuLyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soCongVan</column-name><column-value><![CDATA[");
		sb.append(getSoCongVan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayCongVan</column-name><column-value><![CDATA[");
		sb.append(getNgayCongVan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fileID</column-name><column-value><![CDATA[");
		sb.append(getFileID());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _noiDung;
	private int _thongTinXuLyId;
	private String _soCongVan;
	private Date _ngayCongVan;
	private int _fileID;
	private BaseModel<?> _qlvtYeuCauBoXungRemoteModel;
}