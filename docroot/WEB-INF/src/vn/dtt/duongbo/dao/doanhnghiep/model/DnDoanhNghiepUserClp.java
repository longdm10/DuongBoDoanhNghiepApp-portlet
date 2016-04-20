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

package vn.dtt.duongbo.dao.doanhnghiep.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import vn.dtt.duongbo.dao.doanhnghiep.service.ClpSerializer;
import vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepUserLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class DnDoanhNghiepUserClp extends BaseModelImpl<DnDoanhNghiepUser>
	implements DnDoanhNghiepUser {
	public DnDoanhNghiepUserClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DnDoanhNghiepUser.class;
	}

	@Override
	public String getModelClassName() {
		return DnDoanhNghiepUser.class.getName();
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
		attributes.put("nguoiLamThuTucId", getNguoiLamThuTucId());
		attributes.put("userId", getUserId());
		attributes.put("toChucQuanLy", getToChucQuanLy());
		attributes.put("master", getMaster());
		attributes.put("tenTaiKhoan", getTenTaiKhoan());
		attributes.put("tenNguoiDung", getTenNguoiDung());
		attributes.put("tinhTrangHoatDong", getTinhTrangHoatDong());
		attributes.put("dienThoai", getDienThoai());
		attributes.put("ngayTaoTaiKhoan", getNgayTaoTaiKhoan());
		attributes.put("ngayMoTaiKhoan", getNgayMoTaiKhoan());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long nguoiLamThuTucId = (Long)attributes.get("nguoiLamThuTucId");

		if (nguoiLamThuTucId != null) {
			setNguoiLamThuTucId(nguoiLamThuTucId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String toChucQuanLy = (String)attributes.get("toChucQuanLy");

		if (toChucQuanLy != null) {
			setToChucQuanLy(toChucQuanLy);
		}

		String master = (String)attributes.get("master");

		if (master != null) {
			setMaster(master);
		}

		String tenTaiKhoan = (String)attributes.get("tenTaiKhoan");

		if (tenTaiKhoan != null) {
			setTenTaiKhoan(tenTaiKhoan);
		}

		String tenNguoiDung = (String)attributes.get("tenNguoiDung");

		if (tenNguoiDung != null) {
			setTenNguoiDung(tenNguoiDung);
		}

		String tinhTrangHoatDong = (String)attributes.get("tinhTrangHoatDong");

		if (tinhTrangHoatDong != null) {
			setTinhTrangHoatDong(tinhTrangHoatDong);
		}

		String dienThoai = (String)attributes.get("dienThoai");

		if (dienThoai != null) {
			setDienThoai(dienThoai);
		}

		Date ngayTaoTaiKhoan = (Date)attributes.get("ngayTaoTaiKhoan");

		if (ngayTaoTaiKhoan != null) {
			setNgayTaoTaiKhoan(ngayTaoTaiKhoan);
		}

		Date ngayMoTaiKhoan = (Date)attributes.get("ngayMoTaiKhoan");

		if (ngayMoTaiKhoan != null) {
			setNgayMoTaiKhoan(ngayMoTaiKhoan);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_dnDoanhNghiepUserRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepUserRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_dnDoanhNghiepUserRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNguoiLamThuTucId() {
		return _nguoiLamThuTucId;
	}

	@Override
	public void setNguoiLamThuTucId(long nguoiLamThuTucId) {
		_nguoiLamThuTucId = nguoiLamThuTucId;

		if (_dnDoanhNghiepUserRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepUserRemoteModel.getClass();

				Method method = clazz.getMethod("setNguoiLamThuTucId",
						long.class);

				method.invoke(_dnDoanhNghiepUserRemoteModel, nguoiLamThuTucId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_dnDoanhNghiepUserRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepUserRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_dnDoanhNghiepUserRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getToChucQuanLy() {
		return _toChucQuanLy;
	}

	@Override
	public void setToChucQuanLy(String toChucQuanLy) {
		_toChucQuanLy = toChucQuanLy;

		if (_dnDoanhNghiepUserRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepUserRemoteModel.getClass();

				Method method = clazz.getMethod("setToChucQuanLy", String.class);

				method.invoke(_dnDoanhNghiepUserRemoteModel, toChucQuanLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaster() {
		return _master;
	}

	@Override
	public void setMaster(String master) {
		_master = master;

		if (_dnDoanhNghiepUserRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepUserRemoteModel.getClass();

				Method method = clazz.getMethod("setMaster", String.class);

				method.invoke(_dnDoanhNghiepUserRemoteModel, master);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenTaiKhoan() {
		return _tenTaiKhoan;
	}

	@Override
	public void setTenTaiKhoan(String tenTaiKhoan) {
		_tenTaiKhoan = tenTaiKhoan;

		if (_dnDoanhNghiepUserRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepUserRemoteModel.getClass();

				Method method = clazz.getMethod("setTenTaiKhoan", String.class);

				method.invoke(_dnDoanhNghiepUserRemoteModel, tenTaiKhoan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenNguoiDung() {
		return _tenNguoiDung;
	}

	@Override
	public void setTenNguoiDung(String tenNguoiDung) {
		_tenNguoiDung = tenNguoiDung;

		if (_dnDoanhNghiepUserRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepUserRemoteModel.getClass();

				Method method = clazz.getMethod("setTenNguoiDung", String.class);

				method.invoke(_dnDoanhNghiepUserRemoteModel, tenNguoiDung);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTinhTrangHoatDong() {
		return _tinhTrangHoatDong;
	}

	@Override
	public void setTinhTrangHoatDong(String tinhTrangHoatDong) {
		_tinhTrangHoatDong = tinhTrangHoatDong;

		if (_dnDoanhNghiepUserRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepUserRemoteModel.getClass();

				Method method = clazz.getMethod("setTinhTrangHoatDong",
						String.class);

				method.invoke(_dnDoanhNghiepUserRemoteModel, tinhTrangHoatDong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDienThoai() {
		return _dienThoai;
	}

	@Override
	public void setDienThoai(String dienThoai) {
		_dienThoai = dienThoai;

		if (_dnDoanhNghiepUserRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepUserRemoteModel.getClass();

				Method method = clazz.getMethod("setDienThoai", String.class);

				method.invoke(_dnDoanhNghiepUserRemoteModel, dienThoai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayTaoTaiKhoan() {
		return _ngayTaoTaiKhoan;
	}

	@Override
	public void setNgayTaoTaiKhoan(Date ngayTaoTaiKhoan) {
		_ngayTaoTaiKhoan = ngayTaoTaiKhoan;

		if (_dnDoanhNghiepUserRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepUserRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayTaoTaiKhoan", Date.class);

				method.invoke(_dnDoanhNghiepUserRemoteModel, ngayTaoTaiKhoan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayMoTaiKhoan() {
		return _ngayMoTaiKhoan;
	}

	@Override
	public void setNgayMoTaiKhoan(Date ngayMoTaiKhoan) {
		_ngayMoTaiKhoan = ngayMoTaiKhoan;

		if (_dnDoanhNghiepUserRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepUserRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayMoTaiKhoan", Date.class);

				method.invoke(_dnDoanhNghiepUserRemoteModel, ngayMoTaiKhoan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDnDoanhNghiepUserRemoteModel() {
		return _dnDoanhNghiepUserRemoteModel;
	}

	public void setDnDoanhNghiepUserRemoteModel(
		BaseModel<?> dnDoanhNghiepUserRemoteModel) {
		_dnDoanhNghiepUserRemoteModel = dnDoanhNghiepUserRemoteModel;
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

		Class<?> remoteModelClass = _dnDoanhNghiepUserRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dnDoanhNghiepUserRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DnDoanhNghiepUserLocalServiceUtil.addDnDoanhNghiepUser(this);
		}
		else {
			DnDoanhNghiepUserLocalServiceUtil.updateDnDoanhNghiepUser(this);
		}
	}

	@Override
	public DnDoanhNghiepUser toEscapedModel() {
		return (DnDoanhNghiepUser)ProxyUtil.newProxyInstance(DnDoanhNghiepUser.class.getClassLoader(),
			new Class[] { DnDoanhNghiepUser.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DnDoanhNghiepUserClp clone = new DnDoanhNghiepUserClp();

		clone.setId(getId());
		clone.setNguoiLamThuTucId(getNguoiLamThuTucId());
		clone.setUserId(getUserId());
		clone.setToChucQuanLy(getToChucQuanLy());
		clone.setMaster(getMaster());
		clone.setTenTaiKhoan(getTenTaiKhoan());
		clone.setTenNguoiDung(getTenNguoiDung());
		clone.setTinhTrangHoatDong(getTinhTrangHoatDong());
		clone.setDienThoai(getDienThoai());
		clone.setNgayTaoTaiKhoan(getNgayTaoTaiKhoan());
		clone.setNgayMoTaiKhoan(getNgayMoTaiKhoan());

		return clone;
	}

	@Override
	public int compareTo(DnDoanhNghiepUser dnDoanhNghiepUser) {
		int value = 0;

		if (getId() < dnDoanhNghiepUser.getId()) {
			value = -1;
		}
		else if (getId() > dnDoanhNghiepUser.getId()) {
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

		if (!(obj instanceof DnDoanhNghiepUserClp)) {
			return false;
		}

		DnDoanhNghiepUserClp dnDoanhNghiepUser = (DnDoanhNghiepUserClp)obj;

		long primaryKey = dnDoanhNghiepUser.getPrimaryKey();

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
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", nguoiLamThuTucId=");
		sb.append(getNguoiLamThuTucId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", toChucQuanLy=");
		sb.append(getToChucQuanLy());
		sb.append(", master=");
		sb.append(getMaster());
		sb.append(", tenTaiKhoan=");
		sb.append(getTenTaiKhoan());
		sb.append(", tenNguoiDung=");
		sb.append(getTenNguoiDung());
		sb.append(", tinhTrangHoatDong=");
		sb.append(getTinhTrangHoatDong());
		sb.append(", dienThoai=");
		sb.append(getDienThoai());
		sb.append(", ngayTaoTaiKhoan=");
		sb.append(getNgayTaoTaiKhoan());
		sb.append(", ngayMoTaiKhoan=");
		sb.append(getNgayMoTaiKhoan());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiLamThuTucId</column-name><column-value><![CDATA[");
		sb.append(getNguoiLamThuTucId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>toChucQuanLy</column-name><column-value><![CDATA[");
		sb.append(getToChucQuanLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>master</column-name><column-value><![CDATA[");
		sb.append(getMaster());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenTaiKhoan</column-name><column-value><![CDATA[");
		sb.append(getTenTaiKhoan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenNguoiDung</column-name><column-value><![CDATA[");
		sb.append(getTenNguoiDung());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tinhTrangHoatDong</column-name><column-value><![CDATA[");
		sb.append(getTinhTrangHoatDong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dienThoai</column-name><column-value><![CDATA[");
		sb.append(getDienThoai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayTaoTaiKhoan</column-name><column-value><![CDATA[");
		sb.append(getNgayTaoTaiKhoan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayMoTaiKhoan</column-name><column-value><![CDATA[");
		sb.append(getNgayMoTaiKhoan());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _nguoiLamThuTucId;
	private long _userId;
	private String _userUuid;
	private String _toChucQuanLy;
	private String _master;
	private String _tenTaiKhoan;
	private String _tenNguoiDung;
	private String _tinhTrangHoatDong;
	private String _dienThoai;
	private Date _ngayTaoTaiKhoan;
	private Date _ngayMoTaiKhoan;
	private BaseModel<?> _dnDoanhNghiepUserRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbo.dao.doanhnghiep.service.ClpSerializer.class;
}