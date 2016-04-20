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
import vn.dtt.duongbo.dao.thanhtoan.service.TthcHinhThucNopPhiLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class TthcHinhThucNopPhiClp extends BaseModelImpl<TthcHinhThucNopPhi>
	implements TthcHinhThucNopPhi {
	public TthcHinhThucNopPhiClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TthcHinhThucNopPhi.class;
	}

	@Override
	public String getModelClassName() {
		return TthcHinhThucNopPhi.class.getName();
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
		attributes.put("thuTucHanhChinhId", getThuTucHanhChinhId());
		attributes.put("donViThucHienId", getDonViThucHienId());
		attributes.put("phiNopBanDau", getPhiNopBanDau());
		attributes.put("chuyenKhoan", getChuyenKhoan());
		attributes.put("keyPay", getKeyPay());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long thuTucHanhChinhId = (Long)attributes.get("thuTucHanhChinhId");

		if (thuTucHanhChinhId != null) {
			setThuTucHanhChinhId(thuTucHanhChinhId);
		}

		Long donViThucHienId = (Long)attributes.get("donViThucHienId");

		if (donViThucHienId != null) {
			setDonViThucHienId(donViThucHienId);
		}

		Long phiNopBanDau = (Long)attributes.get("phiNopBanDau");

		if (phiNopBanDau != null) {
			setPhiNopBanDau(phiNopBanDau);
		}

		String chuyenKhoan = (String)attributes.get("chuyenKhoan");

		if (chuyenKhoan != null) {
			setChuyenKhoan(chuyenKhoan);
		}

		String keyPay = (String)attributes.get("keyPay");

		if (keyPay != null) {
			setKeyPay(keyPay);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tthcHinhThucNopPhiRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHinhThucNopPhiRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tthcHinhThucNopPhiRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getThuTucHanhChinhId() {
		return _thuTucHanhChinhId;
	}

	@Override
	public void setThuTucHanhChinhId(long thuTucHanhChinhId) {
		_thuTucHanhChinhId = thuTucHanhChinhId;

		if (_tthcHinhThucNopPhiRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHinhThucNopPhiRemoteModel.getClass();

				Method method = clazz.getMethod("setThuTucHanhChinhId",
						long.class);

				method.invoke(_tthcHinhThucNopPhiRemoteModel, thuTucHanhChinhId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDonViThucHienId() {
		return _donViThucHienId;
	}

	@Override
	public void setDonViThucHienId(long donViThucHienId) {
		_donViThucHienId = donViThucHienId;

		if (_tthcHinhThucNopPhiRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHinhThucNopPhiRemoteModel.getClass();

				Method method = clazz.getMethod("setDonViThucHienId", long.class);

				method.invoke(_tthcHinhThucNopPhiRemoteModel, donViThucHienId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPhiNopBanDau() {
		return _phiNopBanDau;
	}

	@Override
	public void setPhiNopBanDau(long phiNopBanDau) {
		_phiNopBanDau = phiNopBanDau;

		if (_tthcHinhThucNopPhiRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHinhThucNopPhiRemoteModel.getClass();

				Method method = clazz.getMethod("setPhiNopBanDau", long.class);

				method.invoke(_tthcHinhThucNopPhiRemoteModel, phiNopBanDau);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getChuyenKhoan() {
		return _chuyenKhoan;
	}

	@Override
	public void setChuyenKhoan(String chuyenKhoan) {
		_chuyenKhoan = chuyenKhoan;

		if (_tthcHinhThucNopPhiRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHinhThucNopPhiRemoteModel.getClass();

				Method method = clazz.getMethod("setChuyenKhoan", String.class);

				method.invoke(_tthcHinhThucNopPhiRemoteModel, chuyenKhoan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getKeyPay() {
		return _keyPay;
	}

	@Override
	public void setKeyPay(String keyPay) {
		_keyPay = keyPay;

		if (_tthcHinhThucNopPhiRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHinhThucNopPhiRemoteModel.getClass();

				Method method = clazz.getMethod("setKeyPay", String.class);

				method.invoke(_tthcHinhThucNopPhiRemoteModel, keyPay);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTthcHinhThucNopPhiRemoteModel() {
		return _tthcHinhThucNopPhiRemoteModel;
	}

	public void setTthcHinhThucNopPhiRemoteModel(
		BaseModel<?> tthcHinhThucNopPhiRemoteModel) {
		_tthcHinhThucNopPhiRemoteModel = tthcHinhThucNopPhiRemoteModel;
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

		Class<?> remoteModelClass = _tthcHinhThucNopPhiRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tthcHinhThucNopPhiRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TthcHinhThucNopPhiLocalServiceUtil.addTthcHinhThucNopPhi(this);
		}
		else {
			TthcHinhThucNopPhiLocalServiceUtil.updateTthcHinhThucNopPhi(this);
		}
	}

	@Override
	public TthcHinhThucNopPhi toEscapedModel() {
		return (TthcHinhThucNopPhi)ProxyUtil.newProxyInstance(TthcHinhThucNopPhi.class.getClassLoader(),
			new Class[] { TthcHinhThucNopPhi.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TthcHinhThucNopPhiClp clone = new TthcHinhThucNopPhiClp();

		clone.setId(getId());
		clone.setThuTucHanhChinhId(getThuTucHanhChinhId());
		clone.setDonViThucHienId(getDonViThucHienId());
		clone.setPhiNopBanDau(getPhiNopBanDau());
		clone.setChuyenKhoan(getChuyenKhoan());
		clone.setKeyPay(getKeyPay());

		return clone;
	}

	@Override
	public int compareTo(TthcHinhThucNopPhi tthcHinhThucNopPhi) {
		int value = 0;

		if (getId() < tthcHinhThucNopPhi.getId()) {
			value = -1;
		}
		else if (getId() > tthcHinhThucNopPhi.getId()) {
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

		if (!(obj instanceof TthcHinhThucNopPhiClp)) {
			return false;
		}

		TthcHinhThucNopPhiClp tthcHinhThucNopPhi = (TthcHinhThucNopPhiClp)obj;

		long primaryKey = tthcHinhThucNopPhi.getPrimaryKey();

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
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", thuTucHanhChinhId=");
		sb.append(getThuTucHanhChinhId());
		sb.append(", donViThucHienId=");
		sb.append(getDonViThucHienId());
		sb.append(", phiNopBanDau=");
		sb.append(getPhiNopBanDau());
		sb.append(", chuyenKhoan=");
		sb.append(getChuyenKhoan());
		sb.append(", keyPay=");
		sb.append(getKeyPay());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thuTucHanhChinhId</column-name><column-value><![CDATA[");
		sb.append(getThuTucHanhChinhId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>donViThucHienId</column-name><column-value><![CDATA[");
		sb.append(getDonViThucHienId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phiNopBanDau</column-name><column-value><![CDATA[");
		sb.append(getPhiNopBanDau());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chuyenKhoan</column-name><column-value><![CDATA[");
		sb.append(getChuyenKhoan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>keyPay</column-name><column-value><![CDATA[");
		sb.append(getKeyPay());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _thuTucHanhChinhId;
	private long _donViThucHienId;
	private long _phiNopBanDau;
	private String _chuyenKhoan;
	private String _keyPay;
	private BaseModel<?> _tthcHinhThucNopPhiRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbo.dao.thanhtoan.service.ClpSerializer.class;
}