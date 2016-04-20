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
import vn.dtt.duongbo.dao.thanhtoan.service.TthcYeuCauThanhToanLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class TthcYeuCauThanhToanClp extends BaseModelImpl<TthcYeuCauThanhToan>
	implements TthcYeuCauThanhToan {
	public TthcYeuCauThanhToanClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TthcYeuCauThanhToan.class;
	}

	@Override
	public String getModelClassName() {
		return TthcYeuCauThanhToan.class.getName();
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
		attributes.put("maSoYeuCau", getMaSoYeuCau());
		attributes.put("soTien", getSoTien());
		attributes.put("chiTietYeuCau", getChiTietYeuCau());
		attributes.put("ngayTao", getNgayTao());
		attributes.put("nguoiTao", getNguoiTao());
		attributes.put("toChucQuanLy", getToChucQuanLy());
		attributes.put("hoSoThuTucId", getHoSoThuTucId());
		attributes.put("xacNhanThanhToanId", getXacNhanThanhToanId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String maSoYeuCau = (String)attributes.get("maSoYeuCau");

		if (maSoYeuCau != null) {
			setMaSoYeuCau(maSoYeuCau);
		}

		Long soTien = (Long)attributes.get("soTien");

		if (soTien != null) {
			setSoTien(soTien);
		}

		String chiTietYeuCau = (String)attributes.get("chiTietYeuCau");

		if (chiTietYeuCau != null) {
			setChiTietYeuCau(chiTietYeuCau);
		}

		Date ngayTao = (Date)attributes.get("ngayTao");

		if (ngayTao != null) {
			setNgayTao(ngayTao);
		}

		Long nguoiTao = (Long)attributes.get("nguoiTao");

		if (nguoiTao != null) {
			setNguoiTao(nguoiTao);
		}

		Long toChucQuanLy = (Long)attributes.get("toChucQuanLy");

		if (toChucQuanLy != null) {
			setToChucQuanLy(toChucQuanLy);
		}

		Long hoSoThuTucId = (Long)attributes.get("hoSoThuTucId");

		if (hoSoThuTucId != null) {
			setHoSoThuTucId(hoSoThuTucId);
		}

		Long xacNhanThanhToanId = (Long)attributes.get("xacNhanThanhToanId");

		if (xacNhanThanhToanId != null) {
			setXacNhanThanhToanId(xacNhanThanhToanId);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tthcYeuCauThanhToanRemoteModel != null) {
			try {
				Class<?> clazz = _tthcYeuCauThanhToanRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tthcYeuCauThanhToanRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaSoYeuCau() {
		return _maSoYeuCau;
	}

	@Override
	public void setMaSoYeuCau(String maSoYeuCau) {
		_maSoYeuCau = maSoYeuCau;

		if (_tthcYeuCauThanhToanRemoteModel != null) {
			try {
				Class<?> clazz = _tthcYeuCauThanhToanRemoteModel.getClass();

				Method method = clazz.getMethod("setMaSoYeuCau", String.class);

				method.invoke(_tthcYeuCauThanhToanRemoteModel, maSoYeuCau);
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

		if (_tthcYeuCauThanhToanRemoteModel != null) {
			try {
				Class<?> clazz = _tthcYeuCauThanhToanRemoteModel.getClass();

				Method method = clazz.getMethod("setSoTien", long.class);

				method.invoke(_tthcYeuCauThanhToanRemoteModel, soTien);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getChiTietYeuCau() {
		return _chiTietYeuCau;
	}

	@Override
	public void setChiTietYeuCau(String chiTietYeuCau) {
		_chiTietYeuCau = chiTietYeuCau;

		if (_tthcYeuCauThanhToanRemoteModel != null) {
			try {
				Class<?> clazz = _tthcYeuCauThanhToanRemoteModel.getClass();

				Method method = clazz.getMethod("setChiTietYeuCau", String.class);

				method.invoke(_tthcYeuCauThanhToanRemoteModel, chiTietYeuCau);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayTao() {
		return _ngayTao;
	}

	@Override
	public void setNgayTao(Date ngayTao) {
		_ngayTao = ngayTao;

		if (_tthcYeuCauThanhToanRemoteModel != null) {
			try {
				Class<?> clazz = _tthcYeuCauThanhToanRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayTao", Date.class);

				method.invoke(_tthcYeuCauThanhToanRemoteModel, ngayTao);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNguoiTao() {
		return _nguoiTao;
	}

	@Override
	public void setNguoiTao(long nguoiTao) {
		_nguoiTao = nguoiTao;

		if (_tthcYeuCauThanhToanRemoteModel != null) {
			try {
				Class<?> clazz = _tthcYeuCauThanhToanRemoteModel.getClass();

				Method method = clazz.getMethod("setNguoiTao", long.class);

				method.invoke(_tthcYeuCauThanhToanRemoteModel, nguoiTao);
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

		if (_tthcYeuCauThanhToanRemoteModel != null) {
			try {
				Class<?> clazz = _tthcYeuCauThanhToanRemoteModel.getClass();

				Method method = clazz.getMethod("setToChucQuanLy", long.class);

				method.invoke(_tthcYeuCauThanhToanRemoteModel, toChucQuanLy);
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

		if (_tthcYeuCauThanhToanRemoteModel != null) {
			try {
				Class<?> clazz = _tthcYeuCauThanhToanRemoteModel.getClass();

				Method method = clazz.getMethod("setHoSoThuTucId", long.class);

				method.invoke(_tthcYeuCauThanhToanRemoteModel, hoSoThuTucId);
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

		if (_tthcYeuCauThanhToanRemoteModel != null) {
			try {
				Class<?> clazz = _tthcYeuCauThanhToanRemoteModel.getClass();

				Method method = clazz.getMethod("setXacNhanThanhToanId",
						long.class);

				method.invoke(_tthcYeuCauThanhToanRemoteModel,
					xacNhanThanhToanId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTthcYeuCauThanhToanRemoteModel() {
		return _tthcYeuCauThanhToanRemoteModel;
	}

	public void setTthcYeuCauThanhToanRemoteModel(
		BaseModel<?> tthcYeuCauThanhToanRemoteModel) {
		_tthcYeuCauThanhToanRemoteModel = tthcYeuCauThanhToanRemoteModel;
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

		Class<?> remoteModelClass = _tthcYeuCauThanhToanRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tthcYeuCauThanhToanRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TthcYeuCauThanhToanLocalServiceUtil.addTthcYeuCauThanhToan(this);
		}
		else {
			TthcYeuCauThanhToanLocalServiceUtil.updateTthcYeuCauThanhToan(this);
		}
	}

	@Override
	public TthcYeuCauThanhToan toEscapedModel() {
		return (TthcYeuCauThanhToan)ProxyUtil.newProxyInstance(TthcYeuCauThanhToan.class.getClassLoader(),
			new Class[] { TthcYeuCauThanhToan.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TthcYeuCauThanhToanClp clone = new TthcYeuCauThanhToanClp();

		clone.setId(getId());
		clone.setMaSoYeuCau(getMaSoYeuCau());
		clone.setSoTien(getSoTien());
		clone.setChiTietYeuCau(getChiTietYeuCau());
		clone.setNgayTao(getNgayTao());
		clone.setNguoiTao(getNguoiTao());
		clone.setToChucQuanLy(getToChucQuanLy());
		clone.setHoSoThuTucId(getHoSoThuTucId());
		clone.setXacNhanThanhToanId(getXacNhanThanhToanId());

		return clone;
	}

	@Override
	public int compareTo(TthcYeuCauThanhToan tthcYeuCauThanhToan) {
		int value = 0;

		if (getId() < tthcYeuCauThanhToan.getId()) {
			value = -1;
		}
		else if (getId() > tthcYeuCauThanhToan.getId()) {
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

		if (!(obj instanceof TthcYeuCauThanhToanClp)) {
			return false;
		}

		TthcYeuCauThanhToanClp tthcYeuCauThanhToan = (TthcYeuCauThanhToanClp)obj;

		long primaryKey = tthcYeuCauThanhToan.getPrimaryKey();

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
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", maSoYeuCau=");
		sb.append(getMaSoYeuCau());
		sb.append(", soTien=");
		sb.append(getSoTien());
		sb.append(", chiTietYeuCau=");
		sb.append(getChiTietYeuCau());
		sb.append(", ngayTao=");
		sb.append(getNgayTao());
		sb.append(", nguoiTao=");
		sb.append(getNguoiTao());
		sb.append(", toChucQuanLy=");
		sb.append(getToChucQuanLy());
		sb.append(", hoSoThuTucId=");
		sb.append(getHoSoThuTucId());
		sb.append(", xacNhanThanhToanId=");
		sb.append(getXacNhanThanhToanId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.thanhtoan.model.TthcYeuCauThanhToan");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maSoYeuCau</column-name><column-value><![CDATA[");
		sb.append(getMaSoYeuCau());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soTien</column-name><column-value><![CDATA[");
		sb.append(getSoTien());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chiTietYeuCau</column-name><column-value><![CDATA[");
		sb.append(getChiTietYeuCau());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayTao</column-name><column-value><![CDATA[");
		sb.append(getNgayTao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiTao</column-name><column-value><![CDATA[");
		sb.append(getNguoiTao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>toChucQuanLy</column-name><column-value><![CDATA[");
		sb.append(getToChucQuanLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoSoThuTucId</column-name><column-value><![CDATA[");
		sb.append(getHoSoThuTucId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>xacNhanThanhToanId</column-name><column-value><![CDATA[");
		sb.append(getXacNhanThanhToanId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _maSoYeuCau;
	private long _soTien;
	private String _chiTietYeuCau;
	private Date _ngayTao;
	private long _nguoiTao;
	private long _toChucQuanLy;
	private long _hoSoThuTucId;
	private long _xacNhanThanhToanId;
	private BaseModel<?> _tthcYeuCauThanhToanRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbo.dao.thanhtoan.service.ClpSerializer.class;
}