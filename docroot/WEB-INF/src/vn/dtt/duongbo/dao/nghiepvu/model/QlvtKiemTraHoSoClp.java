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
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtKiemTraHoSoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author NhanNc
 */
public class QlvtKiemTraHoSoClp extends BaseModelImpl<QlvtKiemTraHoSo>
	implements QlvtKiemTraHoSo {
	public QlvtKiemTraHoSoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtKiemTraHoSo.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtKiemTraHoSo.class.getName();
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
		attributes.put("thongTinXuLyId", getThongTinXuLyId());
		attributes.put("idNoiDungThamTra", getIdNoiDungThamTra());
		attributes.put("yKienThamTra", getYKienThamTra());
		attributes.put("ketQuaXuLy", getKetQuaXuLy());
		attributes.put("maSoHoSo", getMaSoHoSo());
		attributes.put("yKienDanhGia", getYKienDanhGia());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer thongTinXuLyId = (Integer)attributes.get("thongTinXuLyId");

		if (thongTinXuLyId != null) {
			setThongTinXuLyId(thongTinXuLyId);
		}

		Integer idNoiDungThamTra = (Integer)attributes.get("idNoiDungThamTra");

		if (idNoiDungThamTra != null) {
			setIdNoiDungThamTra(idNoiDungThamTra);
		}

		String yKienThamTra = (String)attributes.get("yKienThamTra");

		if (yKienThamTra != null) {
			setYKienThamTra(yKienThamTra);
		}

		Integer ketQuaXuLy = (Integer)attributes.get("ketQuaXuLy");

		if (ketQuaXuLy != null) {
			setKetQuaXuLy(ketQuaXuLy);
		}

		Integer maSoHoSo = (Integer)attributes.get("maSoHoSo");

		if (maSoHoSo != null) {
			setMaSoHoSo(maSoHoSo);
		}

		String yKienDanhGia = (String)attributes.get("yKienDanhGia");

		if (yKienDanhGia != null) {
			setYKienDanhGia(yKienDanhGia);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_qlvtKiemTraHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtKiemTraHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_qlvtKiemTraHoSoRemoteModel, id);
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

		if (_qlvtKiemTraHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtKiemTraHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setThongTinXuLyId", int.class);

				method.invoke(_qlvtKiemTraHoSoRemoteModel, thongTinXuLyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIdNoiDungThamTra() {
		return _idNoiDungThamTra;
	}

	@Override
	public void setIdNoiDungThamTra(int idNoiDungThamTra) {
		_idNoiDungThamTra = idNoiDungThamTra;

		if (_qlvtKiemTraHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtKiemTraHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setIdNoiDungThamTra", int.class);

				method.invoke(_qlvtKiemTraHoSoRemoteModel, idNoiDungThamTra);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getYKienThamTra() {
		return _yKienThamTra;
	}

	@Override
	public void setYKienThamTra(String yKienThamTra) {
		_yKienThamTra = yKienThamTra;

		if (_qlvtKiemTraHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtKiemTraHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setYKienThamTra", String.class);

				method.invoke(_qlvtKiemTraHoSoRemoteModel, yKienThamTra);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getKetQuaXuLy() {
		return _ketQuaXuLy;
	}

	@Override
	public void setKetQuaXuLy(int ketQuaXuLy) {
		_ketQuaXuLy = ketQuaXuLy;

		if (_qlvtKiemTraHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtKiemTraHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setKetQuaXuLy", int.class);

				method.invoke(_qlvtKiemTraHoSoRemoteModel, ketQuaXuLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMaSoHoSo() {
		return _maSoHoSo;
	}

	@Override
	public void setMaSoHoSo(int maSoHoSo) {
		_maSoHoSo = maSoHoSo;

		if (_qlvtKiemTraHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtKiemTraHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setMaSoHoSo", int.class);

				method.invoke(_qlvtKiemTraHoSoRemoteModel, maSoHoSo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getYKienDanhGia() {
		return _yKienDanhGia;
	}

	@Override
	public void setYKienDanhGia(String yKienDanhGia) {
		_yKienDanhGia = yKienDanhGia;

		if (_qlvtKiemTraHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtKiemTraHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setYKienDanhGia", String.class);

				method.invoke(_qlvtKiemTraHoSoRemoteModel, yKienDanhGia);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQlvtKiemTraHoSoRemoteModel() {
		return _qlvtKiemTraHoSoRemoteModel;
	}

	public void setQlvtKiemTraHoSoRemoteModel(
		BaseModel<?> qlvtKiemTraHoSoRemoteModel) {
		_qlvtKiemTraHoSoRemoteModel = qlvtKiemTraHoSoRemoteModel;
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

		Class<?> remoteModelClass = _qlvtKiemTraHoSoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtKiemTraHoSoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtKiemTraHoSoLocalServiceUtil.addQlvtKiemTraHoSo(this);
		}
		else {
			QlvtKiemTraHoSoLocalServiceUtil.updateQlvtKiemTraHoSo(this);
		}
	}

	@Override
	public QlvtKiemTraHoSo toEscapedModel() {
		return (QlvtKiemTraHoSo)ProxyUtil.newProxyInstance(QlvtKiemTraHoSo.class.getClassLoader(),
			new Class[] { QlvtKiemTraHoSo.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QlvtKiemTraHoSoClp clone = new QlvtKiemTraHoSoClp();

		clone.setId(getId());
		clone.setThongTinXuLyId(getThongTinXuLyId());
		clone.setIdNoiDungThamTra(getIdNoiDungThamTra());
		clone.setYKienThamTra(getYKienThamTra());
		clone.setKetQuaXuLy(getKetQuaXuLy());
		clone.setMaSoHoSo(getMaSoHoSo());
		clone.setYKienDanhGia(getYKienDanhGia());

		return clone;
	}

	@Override
	public int compareTo(QlvtKiemTraHoSo qlvtKiemTraHoSo) {
		int value = 0;

		if (getId() < qlvtKiemTraHoSo.getId()) {
			value = -1;
		}
		else if (getId() > qlvtKiemTraHoSo.getId()) {
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

		if (!(obj instanceof QlvtKiemTraHoSoClp)) {
			return false;
		}

		QlvtKiemTraHoSoClp qlvtKiemTraHoSo = (QlvtKiemTraHoSoClp)obj;

		long primaryKey = qlvtKiemTraHoSo.getPrimaryKey();

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
		sb.append(", thongTinXuLyId=");
		sb.append(getThongTinXuLyId());
		sb.append(", idNoiDungThamTra=");
		sb.append(getIdNoiDungThamTra());
		sb.append(", yKienThamTra=");
		sb.append(getYKienThamTra());
		sb.append(", ketQuaXuLy=");
		sb.append(getKetQuaXuLy());
		sb.append(", maSoHoSo=");
		sb.append(getMaSoHoSo());
		sb.append(", yKienDanhGia=");
		sb.append(getYKienDanhGia());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.nghiepvu.model.QlvtKiemTraHoSo");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thongTinXuLyId</column-name><column-value><![CDATA[");
		sb.append(getThongTinXuLyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>idNoiDungThamTra</column-name><column-value><![CDATA[");
		sb.append(getIdNoiDungThamTra());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>yKienThamTra</column-name><column-value><![CDATA[");
		sb.append(getYKienThamTra());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ketQuaXuLy</column-name><column-value><![CDATA[");
		sb.append(getKetQuaXuLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maSoHoSo</column-name><column-value><![CDATA[");
		sb.append(getMaSoHoSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>yKienDanhGia</column-name><column-value><![CDATA[");
		sb.append(getYKienDanhGia());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private int _thongTinXuLyId;
	private int _idNoiDungThamTra;
	private String _yKienThamTra;
	private int _ketQuaXuLy;
	private int _maSoHoSo;
	private String _yKienDanhGia;
	private BaseModel<?> _qlvtKiemTraHoSoRemoteModel;
}