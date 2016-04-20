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

package vn.dtt.duongbo.dao.thanhtoan.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbo.dao.thanhtoan.service.ClpSerializer;
import vn.dtt.duongbo.dao.thanhtoan.service.TthcXacNhanThanhToanHoSoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class TthcXacNhanThanhToanHoSoClp extends BaseModelImpl<TthcXacNhanThanhToanHoSo>
	implements TthcXacNhanThanhToanHoSo {
	public TthcXacNhanThanhToanHoSoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TthcXacNhanThanhToanHoSo.class;
	}

	@Override
	public String getModelClassName() {
		return TthcXacNhanThanhToanHoSo.class.getName();
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
		attributes.put("xacNhanThanhToanId", getXacNhanThanhToanId());
		attributes.put("hoSoThuTucId", getHoSoThuTucId());
		attributes.put("soTien", getSoTien());
		attributes.put("phieuXuLyId", getPhieuXuLyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long xacNhanThanhToanId = (Long)attributes.get("xacNhanThanhToanId");

		if (xacNhanThanhToanId != null) {
			setXacNhanThanhToanId(xacNhanThanhToanId);
		}

		Long hoSoThuTucId = (Long)attributes.get("hoSoThuTucId");

		if (hoSoThuTucId != null) {
			setHoSoThuTucId(hoSoThuTucId);
		}

		Long soTien = (Long)attributes.get("soTien");

		if (soTien != null) {
			setSoTien(soTien);
		}

		Long phieuXuLyId = (Long)attributes.get("phieuXuLyId");

		if (phieuXuLyId != null) {
			setPhieuXuLyId(phieuXuLyId);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tthcXacNhanThanhToanHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcXacNhanThanhToanHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tthcXacNhanThanhToanHoSoRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getXacNhanThanhToanId() {
		return _xacNhanThanhToanId;
	}

	@Override
	public void setXacNhanThanhToanId(long xacNhanThanhToanId) {
		_xacNhanThanhToanId = xacNhanThanhToanId;

		if (_tthcXacNhanThanhToanHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcXacNhanThanhToanHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setXacNhanThanhToanId",
						long.class);

				method.invoke(_tthcXacNhanThanhToanHoSoRemoteModel,
					xacNhanThanhToanId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getHoSoThuTucId() {
		return _hoSoThuTucId;
	}

	@Override
	public void setHoSoThuTucId(long hoSoThuTucId) {
		_hoSoThuTucId = hoSoThuTucId;

		if (_tthcXacNhanThanhToanHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcXacNhanThanhToanHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setHoSoThuTucId", long.class);

				method.invoke(_tthcXacNhanThanhToanHoSoRemoteModel, hoSoThuTucId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSoTien() {
		return _soTien;
	}

	@Override
	public void setSoTien(long soTien) {
		_soTien = soTien;

		if (_tthcXacNhanThanhToanHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcXacNhanThanhToanHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setSoTien", long.class);

				method.invoke(_tthcXacNhanThanhToanHoSoRemoteModel, soTien);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPhieuXuLyId() {
		return _phieuXuLyId;
	}

	@Override
	public void setPhieuXuLyId(long phieuXuLyId) {
		_phieuXuLyId = phieuXuLyId;

		if (_tthcXacNhanThanhToanHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcXacNhanThanhToanHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setPhieuXuLyId", long.class);

				method.invoke(_tthcXacNhanThanhToanHoSoRemoteModel, phieuXuLyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTthcXacNhanThanhToanHoSoRemoteModel() {
		return _tthcXacNhanThanhToanHoSoRemoteModel;
	}

	public void setTthcXacNhanThanhToanHoSoRemoteModel(
		BaseModel<?> tthcXacNhanThanhToanHoSoRemoteModel) {
		_tthcXacNhanThanhToanHoSoRemoteModel = tthcXacNhanThanhToanHoSoRemoteModel;
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

		Class<?> remoteModelClass = _tthcXacNhanThanhToanHoSoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tthcXacNhanThanhToanHoSoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TthcXacNhanThanhToanHoSoLocalServiceUtil.addTthcXacNhanThanhToanHoSo(this);
		}
		else {
			TthcXacNhanThanhToanHoSoLocalServiceUtil.updateTthcXacNhanThanhToanHoSo(this);
		}
	}

	@Override
	public TthcXacNhanThanhToanHoSo toEscapedModel() {
		return (TthcXacNhanThanhToanHoSo)ProxyUtil.newProxyInstance(TthcXacNhanThanhToanHoSo.class.getClassLoader(),
			new Class[] { TthcXacNhanThanhToanHoSo.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TthcXacNhanThanhToanHoSoClp clone = new TthcXacNhanThanhToanHoSoClp();

		clone.setId(getId());
		clone.setXacNhanThanhToanId(getXacNhanThanhToanId());
		clone.setHoSoThuTucId(getHoSoThuTucId());
		clone.setSoTien(getSoTien());
		clone.setPhieuXuLyId(getPhieuXuLyId());

		return clone;
	}

	@Override
	public int compareTo(TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo) {
		int value = 0;

		if (getId() < tthcXacNhanThanhToanHoSo.getId()) {
			value = -1;
		}
		else if (getId() > tthcXacNhanThanhToanHoSo.getId()) {
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

		if (!(obj instanceof TthcXacNhanThanhToanHoSoClp)) {
			return false;
		}

		TthcXacNhanThanhToanHoSoClp tthcXacNhanThanhToanHoSo = (TthcXacNhanThanhToanHoSoClp)obj;

		long primaryKey = tthcXacNhanThanhToanHoSo.getPrimaryKey();

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
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", xacNhanThanhToanId=");
		sb.append(getXacNhanThanhToanId());
		sb.append(", hoSoThuTucId=");
		sb.append(getHoSoThuTucId());
		sb.append(", soTien=");
		sb.append(getSoTien());
		sb.append(", phieuXuLyId=");
		sb.append(getPhieuXuLyId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>xacNhanThanhToanId</column-name><column-value><![CDATA[");
		sb.append(getXacNhanThanhToanId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoSoThuTucId</column-name><column-value><![CDATA[");
		sb.append(getHoSoThuTucId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soTien</column-name><column-value><![CDATA[");
		sb.append(getSoTien());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phieuXuLyId</column-name><column-value><![CDATA[");
		sb.append(getPhieuXuLyId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _xacNhanThanhToanId;
	private long _hoSoThuTucId;
	private long _soTien;
	private long _phieuXuLyId;
	private BaseModel<?> _tthcXacNhanThanhToanHoSoRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbo.dao.thanhtoan.service.ClpSerializer.class;
}