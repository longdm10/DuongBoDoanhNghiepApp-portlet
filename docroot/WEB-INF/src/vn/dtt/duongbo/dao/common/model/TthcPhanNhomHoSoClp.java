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
import vn.dtt.duongbo.dao.common.service.TthcPhanNhomHoSoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class TthcPhanNhomHoSoClp extends BaseModelImpl<TthcPhanNhomHoSo>
	implements TthcPhanNhomHoSo {
	public TthcPhanNhomHoSoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TthcPhanNhomHoSo.class;
	}

	@Override
	public String getModelClassName() {
		return TthcPhanNhomHoSo.class.getName();
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
		attributes.put("maPhanNhom", getMaPhanNhom());
		attributes.put("tenPhanNhom", getTenPhanNhom());
		attributes.put("tenTiengAnh", getTenTiengAnh());
		attributes.put("soThuTu", getSoThuTu());
		attributes.put("loaiPhanNhom", getLoaiPhanNhom());
		attributes.put("toChucQuanLy", getToChucQuanLy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String maPhanNhom = (String)attributes.get("maPhanNhom");

		if (maPhanNhom != null) {
			setMaPhanNhom(maPhanNhom);
		}

		String tenPhanNhom = (String)attributes.get("tenPhanNhom");

		if (tenPhanNhom != null) {
			setTenPhanNhom(tenPhanNhom);
		}

		String tenTiengAnh = (String)attributes.get("tenTiengAnh");

		if (tenTiengAnh != null) {
			setTenTiengAnh(tenTiengAnh);
		}

		Integer soThuTu = (Integer)attributes.get("soThuTu");

		if (soThuTu != null) {
			setSoThuTu(soThuTu);
		}

		Integer loaiPhanNhom = (Integer)attributes.get("loaiPhanNhom");

		if (loaiPhanNhom != null) {
			setLoaiPhanNhom(loaiPhanNhom);
		}

		Long toChucQuanLy = (Long)attributes.get("toChucQuanLy");

		if (toChucQuanLy != null) {
			setToChucQuanLy(toChucQuanLy);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tthcPhanNhomHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcPhanNhomHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tthcPhanNhomHoSoRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaPhanNhom() {
		return _maPhanNhom;
	}

	@Override
	public void setMaPhanNhom(String maPhanNhom) {
		_maPhanNhom = maPhanNhom;

		if (_tthcPhanNhomHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcPhanNhomHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setMaPhanNhom", String.class);

				method.invoke(_tthcPhanNhomHoSoRemoteModel, maPhanNhom);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenPhanNhom() {
		return _tenPhanNhom;
	}

	@Override
	public void setTenPhanNhom(String tenPhanNhom) {
		_tenPhanNhom = tenPhanNhom;

		if (_tthcPhanNhomHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcPhanNhomHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setTenPhanNhom", String.class);

				method.invoke(_tthcPhanNhomHoSoRemoteModel, tenPhanNhom);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenTiengAnh() {
		return _tenTiengAnh;
	}

	@Override
	public void setTenTiengAnh(String tenTiengAnh) {
		_tenTiengAnh = tenTiengAnh;

		if (_tthcPhanNhomHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcPhanNhomHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setTenTiengAnh", String.class);

				method.invoke(_tthcPhanNhomHoSoRemoteModel, tenTiengAnh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoThuTu() {
		return _soThuTu;
	}

	@Override
	public void setSoThuTu(int soThuTu) {
		_soThuTu = soThuTu;

		if (_tthcPhanNhomHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcPhanNhomHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setSoThuTu", int.class);

				method.invoke(_tthcPhanNhomHoSoRemoteModel, soThuTu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLoaiPhanNhom() {
		return _loaiPhanNhom;
	}

	@Override
	public void setLoaiPhanNhom(int loaiPhanNhom) {
		_loaiPhanNhom = loaiPhanNhom;

		if (_tthcPhanNhomHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcPhanNhomHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiPhanNhom", int.class);

				method.invoke(_tthcPhanNhomHoSoRemoteModel, loaiPhanNhom);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getToChucQuanLy() {
		return _toChucQuanLy;
	}

	@Override
	public void setToChucQuanLy(long toChucQuanLy) {
		_toChucQuanLy = toChucQuanLy;

		if (_tthcPhanNhomHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcPhanNhomHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setToChucQuanLy", long.class);

				method.invoke(_tthcPhanNhomHoSoRemoteModel, toChucQuanLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTthcPhanNhomHoSoRemoteModel() {
		return _tthcPhanNhomHoSoRemoteModel;
	}

	public void setTthcPhanNhomHoSoRemoteModel(
		BaseModel<?> tthcPhanNhomHoSoRemoteModel) {
		_tthcPhanNhomHoSoRemoteModel = tthcPhanNhomHoSoRemoteModel;
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

		Class<?> remoteModelClass = _tthcPhanNhomHoSoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tthcPhanNhomHoSoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TthcPhanNhomHoSoLocalServiceUtil.addTthcPhanNhomHoSo(this);
		}
		else {
			TthcPhanNhomHoSoLocalServiceUtil.updateTthcPhanNhomHoSo(this);
		}
	}

	@Override
	public TthcPhanNhomHoSo toEscapedModel() {
		return (TthcPhanNhomHoSo)ProxyUtil.newProxyInstance(TthcPhanNhomHoSo.class.getClassLoader(),
			new Class[] { TthcPhanNhomHoSo.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TthcPhanNhomHoSoClp clone = new TthcPhanNhomHoSoClp();

		clone.setId(getId());
		clone.setMaPhanNhom(getMaPhanNhom());
		clone.setTenPhanNhom(getTenPhanNhom());
		clone.setTenTiengAnh(getTenTiengAnh());
		clone.setSoThuTu(getSoThuTu());
		clone.setLoaiPhanNhom(getLoaiPhanNhom());
		clone.setToChucQuanLy(getToChucQuanLy());

		return clone;
	}

	@Override
	public int compareTo(TthcPhanNhomHoSo tthcPhanNhomHoSo) {
		int value = 0;

		if (getId() < tthcPhanNhomHoSo.getId()) {
			value = -1;
		}
		else if (getId() > tthcPhanNhomHoSo.getId()) {
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

		if (!(obj instanceof TthcPhanNhomHoSoClp)) {
			return false;
		}

		TthcPhanNhomHoSoClp tthcPhanNhomHoSo = (TthcPhanNhomHoSoClp)obj;

		long primaryKey = tthcPhanNhomHoSo.getPrimaryKey();

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
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", maPhanNhom=");
		sb.append(getMaPhanNhom());
		sb.append(", tenPhanNhom=");
		sb.append(getTenPhanNhom());
		sb.append(", tenTiengAnh=");
		sb.append(getTenTiengAnh());
		sb.append(", soThuTu=");
		sb.append(getSoThuTu());
		sb.append(", loaiPhanNhom=");
		sb.append(getLoaiPhanNhom());
		sb.append(", toChucQuanLy=");
		sb.append(getToChucQuanLy());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maPhanNhom</column-name><column-value><![CDATA[");
		sb.append(getMaPhanNhom());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenPhanNhom</column-name><column-value><![CDATA[");
		sb.append(getTenPhanNhom());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenTiengAnh</column-name><column-value><![CDATA[");
		sb.append(getTenTiengAnh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soThuTu</column-name><column-value><![CDATA[");
		sb.append(getSoThuTu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiPhanNhom</column-name><column-value><![CDATA[");
		sb.append(getLoaiPhanNhom());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>toChucQuanLy</column-name><column-value><![CDATA[");
		sb.append(getToChucQuanLy());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _maPhanNhom;
	private String _tenPhanNhom;
	private String _tenTiengAnh;
	private int _soThuTu;
	private int _loaiPhanNhom;
	private long _toChucQuanLy;
	private BaseModel<?> _tthcPhanNhomHoSoRemoteModel;
}