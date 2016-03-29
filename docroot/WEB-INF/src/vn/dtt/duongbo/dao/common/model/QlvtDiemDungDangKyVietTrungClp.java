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

package vn.dtt.duongbo.dao.common.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbo.dao.common.service.ClpSerializer;
import vn.dtt.duongbo.dao.common.service.QlvtDiemDungDangKyVietTrungLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class QlvtDiemDungDangKyVietTrungClp extends BaseModelImpl<QlvtDiemDungDangKyVietTrung>
	implements QlvtDiemDungDangKyVietTrung {
	public QlvtDiemDungDangKyVietTrungClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtDiemDungDangKyVietTrung.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtDiemDungDangKyVietTrung.class.getName();
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
		attributes.put("PhuongTienDangKyId", getPhuongTienDangKyId());
		attributes.put("NoiDungHoSoId", getNoiDungHoSoId());
		attributes.put("HoSoThuTucId", getHoSoThuTucId());
		attributes.put("MaDiemDung", getMaDiemDung());
		attributes.put("TenDiemDung", getTenDiemDung());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String PhuongTienDangKyId = (String)attributes.get("PhuongTienDangKyId");

		if (PhuongTienDangKyId != null) {
			setPhuongTienDangKyId(PhuongTienDangKyId);
		}

		String NoiDungHoSoId = (String)attributes.get("NoiDungHoSoId");

		if (NoiDungHoSoId != null) {
			setNoiDungHoSoId(NoiDungHoSoId);
		}

		String HoSoThuTucId = (String)attributes.get("HoSoThuTucId");

		if (HoSoThuTucId != null) {
			setHoSoThuTucId(HoSoThuTucId);
		}

		Long MaDiemDung = (Long)attributes.get("MaDiemDung");

		if (MaDiemDung != null) {
			setMaDiemDung(MaDiemDung);
		}

		Long TenDiemDung = (Long)attributes.get("TenDiemDung");

		if (TenDiemDung != null) {
			setTenDiemDung(TenDiemDung);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_qlvtDiemDungDangKyVietTrungRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtDiemDungDangKyVietTrungRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_qlvtDiemDungDangKyVietTrungRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPhuongTienDangKyId() {
		return _PhuongTienDangKyId;
	}

	@Override
	public void setPhuongTienDangKyId(String PhuongTienDangKyId) {
		_PhuongTienDangKyId = PhuongTienDangKyId;

		if (_qlvtDiemDungDangKyVietTrungRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtDiemDungDangKyVietTrungRemoteModel.getClass();

				Method method = clazz.getMethod("setPhuongTienDangKyId",
						String.class);

				method.invoke(_qlvtDiemDungDangKyVietTrungRemoteModel,
					PhuongTienDangKyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNoiDungHoSoId() {
		return _NoiDungHoSoId;
	}

	@Override
	public void setNoiDungHoSoId(String NoiDungHoSoId) {
		_NoiDungHoSoId = NoiDungHoSoId;

		if (_qlvtDiemDungDangKyVietTrungRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtDiemDungDangKyVietTrungRemoteModel.getClass();

				Method method = clazz.getMethod("setNoiDungHoSoId", String.class);

				method.invoke(_qlvtDiemDungDangKyVietTrungRemoteModel,
					NoiDungHoSoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getHoSoThuTucId() {
		return _HoSoThuTucId;
	}

	@Override
	public void setHoSoThuTucId(String HoSoThuTucId) {
		_HoSoThuTucId = HoSoThuTucId;

		if (_qlvtDiemDungDangKyVietTrungRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtDiemDungDangKyVietTrungRemoteModel.getClass();

				Method method = clazz.getMethod("setHoSoThuTucId", String.class);

				method.invoke(_qlvtDiemDungDangKyVietTrungRemoteModel,
					HoSoThuTucId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getMaDiemDung() {
		return _MaDiemDung;
	}

	@Override
	public void setMaDiemDung(long MaDiemDung) {
		_MaDiemDung = MaDiemDung;

		if (_qlvtDiemDungDangKyVietTrungRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtDiemDungDangKyVietTrungRemoteModel.getClass();

				Method method = clazz.getMethod("setMaDiemDung", long.class);

				method.invoke(_qlvtDiemDungDangKyVietTrungRemoteModel,
					MaDiemDung);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTenDiemDung() {
		return _TenDiemDung;
	}

	@Override
	public void setTenDiemDung(long TenDiemDung) {
		_TenDiemDung = TenDiemDung;

		if (_qlvtDiemDungDangKyVietTrungRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtDiemDungDangKyVietTrungRemoteModel.getClass();

				Method method = clazz.getMethod("setTenDiemDung", long.class);

				method.invoke(_qlvtDiemDungDangKyVietTrungRemoteModel,
					TenDiemDung);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQlvtDiemDungDangKyVietTrungRemoteModel() {
		return _qlvtDiemDungDangKyVietTrungRemoteModel;
	}

	public void setQlvtDiemDungDangKyVietTrungRemoteModel(
		BaseModel<?> qlvtDiemDungDangKyVietTrungRemoteModel) {
		_qlvtDiemDungDangKyVietTrungRemoteModel = qlvtDiemDungDangKyVietTrungRemoteModel;
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

		Class<?> remoteModelClass = _qlvtDiemDungDangKyVietTrungRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtDiemDungDangKyVietTrungRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtDiemDungDangKyVietTrungLocalServiceUtil.addQlvtDiemDungDangKyVietTrung(this);
		}
		else {
			QlvtDiemDungDangKyVietTrungLocalServiceUtil.updateQlvtDiemDungDangKyVietTrung(this);
		}
	}

	@Override
	public QlvtDiemDungDangKyVietTrung toEscapedModel() {
		return (QlvtDiemDungDangKyVietTrung)ProxyUtil.newProxyInstance(QlvtDiemDungDangKyVietTrung.class.getClassLoader(),
			new Class[] { QlvtDiemDungDangKyVietTrung.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QlvtDiemDungDangKyVietTrungClp clone = new QlvtDiemDungDangKyVietTrungClp();

		clone.setId(getId());
		clone.setPhuongTienDangKyId(getPhuongTienDangKyId());
		clone.setNoiDungHoSoId(getNoiDungHoSoId());
		clone.setHoSoThuTucId(getHoSoThuTucId());
		clone.setMaDiemDung(getMaDiemDung());
		clone.setTenDiemDung(getTenDiemDung());

		return clone;
	}

	@Override
	public int compareTo(
		QlvtDiemDungDangKyVietTrung qlvtDiemDungDangKyVietTrung) {
		int value = 0;

		if (getId() < qlvtDiemDungDangKyVietTrung.getId()) {
			value = -1;
		}
		else if (getId() > qlvtDiemDungDangKyVietTrung.getId()) {
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

		if (!(obj instanceof QlvtDiemDungDangKyVietTrungClp)) {
			return false;
		}

		QlvtDiemDungDangKyVietTrungClp qlvtDiemDungDangKyVietTrung = (QlvtDiemDungDangKyVietTrungClp)obj;

		long primaryKey = qlvtDiemDungDangKyVietTrung.getPrimaryKey();

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
		sb.append(", PhuongTienDangKyId=");
		sb.append(getPhuongTienDangKyId());
		sb.append(", NoiDungHoSoId=");
		sb.append(getNoiDungHoSoId());
		sb.append(", HoSoThuTucId=");
		sb.append(getHoSoThuTucId());
		sb.append(", MaDiemDung=");
		sb.append(getMaDiemDung());
		sb.append(", TenDiemDung=");
		sb.append(getTenDiemDung());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietTrung");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PhuongTienDangKyId</column-name><column-value><![CDATA[");
		sb.append(getPhuongTienDangKyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NoiDungHoSoId</column-name><column-value><![CDATA[");
		sb.append(getNoiDungHoSoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>HoSoThuTucId</column-name><column-value><![CDATA[");
		sb.append(getHoSoThuTucId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MaDiemDung</column-name><column-value><![CDATA[");
		sb.append(getMaDiemDung());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TenDiemDung</column-name><column-value><![CDATA[");
		sb.append(getTenDiemDung());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _PhuongTienDangKyId;
	private String _NoiDungHoSoId;
	private String _HoSoThuTucId;
	private long _MaDiemDung;
	private long _TenDiemDung;
	private BaseModel<?> _qlvtDiemDungDangKyVietTrungRemoteModel;
}