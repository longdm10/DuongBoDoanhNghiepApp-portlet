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

package vn.dtt.duongbo.dao.motcua.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbo.dao.motcua.service.ClpSerializer;
import vn.dtt.duongbo.dao.motcua.service.MotCuaPhanCongXuLyLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class MotCuaPhanCongXuLyClp extends BaseModelImpl<MotCuaPhanCongXuLy>
	implements MotCuaPhanCongXuLy {
	public MotCuaPhanCongXuLyClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return MotCuaPhanCongXuLy.class;
	}

	@Override
	public String getModelClassName() {
		return MotCuaPhanCongXuLy.class.getName();
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
		attributes.put("phieuXuLyId", getPhieuXuLyId());
		attributes.put("trangThaiHoSoId", getTrangThaiHoSoId());
		attributes.put("nguoiXuLy", getNguoiXuLy());
		attributes.put("nhomXuLy", getNhomXuLy());
		attributes.put("ngayPhanCong", getNgayPhanCong());
		attributes.put("nguoiPhanCong", getNguoiPhanCong());
		attributes.put("nguoiDuocUyQuyen", getNguoiDuocUyQuyen());
		attributes.put("toChucXuLy", getToChucXuLy());
		attributes.put("toChucXetDuyet", getToChucXetDuyet());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long phieuXuLyId = (Long)attributes.get("phieuXuLyId");

		if (phieuXuLyId != null) {
			setPhieuXuLyId(phieuXuLyId);
		}

		Long trangThaiHoSoId = (Long)attributes.get("trangThaiHoSoId");

		if (trangThaiHoSoId != null) {
			setTrangThaiHoSoId(trangThaiHoSoId);
		}

		Long nguoiXuLy = (Long)attributes.get("nguoiXuLy");

		if (nguoiXuLy != null) {
			setNguoiXuLy(nguoiXuLy);
		}

		Long nhomXuLy = (Long)attributes.get("nhomXuLy");

		if (nhomXuLy != null) {
			setNhomXuLy(nhomXuLy);
		}

		Date ngayPhanCong = (Date)attributes.get("ngayPhanCong");

		if (ngayPhanCong != null) {
			setNgayPhanCong(ngayPhanCong);
		}

		Long nguoiPhanCong = (Long)attributes.get("nguoiPhanCong");

		if (nguoiPhanCong != null) {
			setNguoiPhanCong(nguoiPhanCong);
		}

		Long nguoiDuocUyQuyen = (Long)attributes.get("nguoiDuocUyQuyen");

		if (nguoiDuocUyQuyen != null) {
			setNguoiDuocUyQuyen(nguoiDuocUyQuyen);
		}

		Long toChucXuLy = (Long)attributes.get("toChucXuLy");

		if (toChucXuLy != null) {
			setToChucXuLy(toChucXuLy);
		}

		Long toChucXetDuyet = (Long)attributes.get("toChucXetDuyet");

		if (toChucXetDuyet != null) {
			setToChucXetDuyet(toChucXetDuyet);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_motCuaPhanCongXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhanCongXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_motCuaPhanCongXuLyRemoteModel, id);
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

		if (_motCuaPhanCongXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhanCongXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setPhieuXuLyId", long.class);

				method.invoke(_motCuaPhanCongXuLyRemoteModel, phieuXuLyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTrangThaiHoSoId() {
		return _trangThaiHoSoId;
	}

	@Override
	public void setTrangThaiHoSoId(long trangThaiHoSoId) {
		_trangThaiHoSoId = trangThaiHoSoId;

		if (_motCuaPhanCongXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhanCongXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThaiHoSoId", long.class);

				method.invoke(_motCuaPhanCongXuLyRemoteModel, trangThaiHoSoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNguoiXuLy() {
		return _nguoiXuLy;
	}

	@Override
	public void setNguoiXuLy(long nguoiXuLy) {
		_nguoiXuLy = nguoiXuLy;

		if (_motCuaPhanCongXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhanCongXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setNguoiXuLy", long.class);

				method.invoke(_motCuaPhanCongXuLyRemoteModel, nguoiXuLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNhomXuLy() {
		return _nhomXuLy;
	}

	@Override
	public void setNhomXuLy(long nhomXuLy) {
		_nhomXuLy = nhomXuLy;

		if (_motCuaPhanCongXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhanCongXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setNhomXuLy", long.class);

				method.invoke(_motCuaPhanCongXuLyRemoteModel, nhomXuLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayPhanCong() {
		return _ngayPhanCong;
	}

	@Override
	public void setNgayPhanCong(Date ngayPhanCong) {
		_ngayPhanCong = ngayPhanCong;

		if (_motCuaPhanCongXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhanCongXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayPhanCong", Date.class);

				method.invoke(_motCuaPhanCongXuLyRemoteModel, ngayPhanCong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNguoiPhanCong() {
		return _nguoiPhanCong;
	}

	@Override
	public void setNguoiPhanCong(long nguoiPhanCong) {
		_nguoiPhanCong = nguoiPhanCong;

		if (_motCuaPhanCongXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhanCongXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setNguoiPhanCong", long.class);

				method.invoke(_motCuaPhanCongXuLyRemoteModel, nguoiPhanCong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNguoiDuocUyQuyen() {
		return _nguoiDuocUyQuyen;
	}

	@Override
	public void setNguoiDuocUyQuyen(long nguoiDuocUyQuyen) {
		_nguoiDuocUyQuyen = nguoiDuocUyQuyen;

		if (_motCuaPhanCongXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhanCongXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setNguoiDuocUyQuyen",
						long.class);

				method.invoke(_motCuaPhanCongXuLyRemoteModel, nguoiDuocUyQuyen);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getToChucXuLy() {
		return _toChucXuLy;
	}

	@Override
	public void setToChucXuLy(long toChucXuLy) {
		_toChucXuLy = toChucXuLy;

		if (_motCuaPhanCongXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhanCongXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setToChucXuLy", long.class);

				method.invoke(_motCuaPhanCongXuLyRemoteModel, toChucXuLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getToChucXetDuyet() {
		return _toChucXetDuyet;
	}

	@Override
	public void setToChucXetDuyet(long toChucXetDuyet) {
		_toChucXetDuyet = toChucXetDuyet;

		if (_motCuaPhanCongXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhanCongXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setToChucXetDuyet", long.class);

				method.invoke(_motCuaPhanCongXuLyRemoteModel, toChucXetDuyet);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getMotCuaPhanCongXuLyRemoteModel() {
		return _motCuaPhanCongXuLyRemoteModel;
	}

	public void setMotCuaPhanCongXuLyRemoteModel(
		BaseModel<?> motCuaPhanCongXuLyRemoteModel) {
		_motCuaPhanCongXuLyRemoteModel = motCuaPhanCongXuLyRemoteModel;
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

		Class<?> remoteModelClass = _motCuaPhanCongXuLyRemoteModel.getClass();

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

		Object returnValue = method.invoke(_motCuaPhanCongXuLyRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			MotCuaPhanCongXuLyLocalServiceUtil.addMotCuaPhanCongXuLy(this);
		}
		else {
			MotCuaPhanCongXuLyLocalServiceUtil.updateMotCuaPhanCongXuLy(this);
		}
	}

	@Override
	public MotCuaPhanCongXuLy toEscapedModel() {
		return (MotCuaPhanCongXuLy)ProxyUtil.newProxyInstance(MotCuaPhanCongXuLy.class.getClassLoader(),
			new Class[] { MotCuaPhanCongXuLy.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		MotCuaPhanCongXuLyClp clone = new MotCuaPhanCongXuLyClp();

		clone.setId(getId());
		clone.setPhieuXuLyId(getPhieuXuLyId());
		clone.setTrangThaiHoSoId(getTrangThaiHoSoId());
		clone.setNguoiXuLy(getNguoiXuLy());
		clone.setNhomXuLy(getNhomXuLy());
		clone.setNgayPhanCong(getNgayPhanCong());
		clone.setNguoiPhanCong(getNguoiPhanCong());
		clone.setNguoiDuocUyQuyen(getNguoiDuocUyQuyen());
		clone.setToChucXuLy(getToChucXuLy());
		clone.setToChucXetDuyet(getToChucXetDuyet());

		return clone;
	}

	@Override
	public int compareTo(MotCuaPhanCongXuLy motCuaPhanCongXuLy) {
		int value = 0;

		if (getId() < motCuaPhanCongXuLy.getId()) {
			value = -1;
		}
		else if (getId() > motCuaPhanCongXuLy.getId()) {
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

		if (!(obj instanceof MotCuaPhanCongXuLyClp)) {
			return false;
		}

		MotCuaPhanCongXuLyClp motCuaPhanCongXuLy = (MotCuaPhanCongXuLyClp)obj;

		long primaryKey = motCuaPhanCongXuLy.getPrimaryKey();

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
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", phieuXuLyId=");
		sb.append(getPhieuXuLyId());
		sb.append(", trangThaiHoSoId=");
		sb.append(getTrangThaiHoSoId());
		sb.append(", nguoiXuLy=");
		sb.append(getNguoiXuLy());
		sb.append(", nhomXuLy=");
		sb.append(getNhomXuLy());
		sb.append(", ngayPhanCong=");
		sb.append(getNgayPhanCong());
		sb.append(", nguoiPhanCong=");
		sb.append(getNguoiPhanCong());
		sb.append(", nguoiDuocUyQuyen=");
		sb.append(getNguoiDuocUyQuyen());
		sb.append(", toChucXuLy=");
		sb.append(getToChucXuLy());
		sb.append(", toChucXetDuyet=");
		sb.append(getToChucXetDuyet());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.motcua.model.MotCuaPhanCongXuLy");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phieuXuLyId</column-name><column-value><![CDATA[");
		sb.append(getPhieuXuLyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThaiHoSoId</column-name><column-value><![CDATA[");
		sb.append(getTrangThaiHoSoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiXuLy</column-name><column-value><![CDATA[");
		sb.append(getNguoiXuLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nhomXuLy</column-name><column-value><![CDATA[");
		sb.append(getNhomXuLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayPhanCong</column-name><column-value><![CDATA[");
		sb.append(getNgayPhanCong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiPhanCong</column-name><column-value><![CDATA[");
		sb.append(getNguoiPhanCong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiDuocUyQuyen</column-name><column-value><![CDATA[");
		sb.append(getNguoiDuocUyQuyen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>toChucXuLy</column-name><column-value><![CDATA[");
		sb.append(getToChucXuLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>toChucXetDuyet</column-name><column-value><![CDATA[");
		sb.append(getToChucXetDuyet());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _phieuXuLyId;
	private long _trangThaiHoSoId;
	private long _nguoiXuLy;
	private long _nhomXuLy;
	private Date _ngayPhanCong;
	private long _nguoiPhanCong;
	private long _nguoiDuocUyQuyen;
	private long _toChucXuLy;
	private long _toChucXetDuyet;
	private BaseModel<?> _motCuaPhanCongXuLyRemoteModel;
}