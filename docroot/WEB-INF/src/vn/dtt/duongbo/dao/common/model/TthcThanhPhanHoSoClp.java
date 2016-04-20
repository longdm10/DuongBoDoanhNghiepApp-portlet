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
import vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class TthcThanhPhanHoSoClp extends BaseModelImpl<TthcThanhPhanHoSo>
	implements TthcThanhPhanHoSo {
	public TthcThanhPhanHoSoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TthcThanhPhanHoSo.class;
	}

	@Override
	public String getModelClassName() {
		return TthcThanhPhanHoSo.class.getName();
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
		attributes.put("tenThanhPhan", getTenThanhPhan());
		attributes.put("ghiChu", getGhiChu());
		attributes.put("maThanhPhan", getMaThanhPhan());
		attributes.put("thuTuHienThi", getThuTuHienThi());
		attributes.put("loaiThanhPhan", getLoaiThanhPhan());
		attributes.put("soTaiLieuDinhKem", getSoTaiLieuDinhKem());
		attributes.put("mauTrucTuyen", getMauTrucTuyen());

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

		String tenThanhPhan = (String)attributes.get("tenThanhPhan");

		if (tenThanhPhan != null) {
			setTenThanhPhan(tenThanhPhan);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}

		String maThanhPhan = (String)attributes.get("maThanhPhan");

		if (maThanhPhan != null) {
			setMaThanhPhan(maThanhPhan);
		}

		Long thuTuHienThi = (Long)attributes.get("thuTuHienThi");

		if (thuTuHienThi != null) {
			setThuTuHienThi(thuTuHienThi);
		}

		Long loaiThanhPhan = (Long)attributes.get("loaiThanhPhan");

		if (loaiThanhPhan != null) {
			setLoaiThanhPhan(loaiThanhPhan);
		}

		Long soTaiLieuDinhKem = (Long)attributes.get("soTaiLieuDinhKem");

		if (soTaiLieuDinhKem != null) {
			setSoTaiLieuDinhKem(soTaiLieuDinhKem);
		}

		String mauTrucTuyen = (String)attributes.get("mauTrucTuyen");

		if (mauTrucTuyen != null) {
			setMauTrucTuyen(mauTrucTuyen);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tthcThanhPhanHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThanhPhanHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tthcThanhPhanHoSoRemoteModel, id);
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

		if (_tthcThanhPhanHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThanhPhanHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setThuTucHanhChinhId",
						long.class);

				method.invoke(_tthcThanhPhanHoSoRemoteModel, thuTucHanhChinhId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenThanhPhan() {
		return _tenThanhPhan;
	}

	@Override
	public void setTenThanhPhan(String tenThanhPhan) {
		_tenThanhPhan = tenThanhPhan;

		if (_tthcThanhPhanHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThanhPhanHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setTenThanhPhan", String.class);

				method.invoke(_tthcThanhPhanHoSoRemoteModel, tenThanhPhan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGhiChu() {
		return _ghiChu;
	}

	@Override
	public void setGhiChu(String ghiChu) {
		_ghiChu = ghiChu;

		if (_tthcThanhPhanHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThanhPhanHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setGhiChu", String.class);

				method.invoke(_tthcThanhPhanHoSoRemoteModel, ghiChu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaThanhPhan() {
		return _maThanhPhan;
	}

	@Override
	public void setMaThanhPhan(String maThanhPhan) {
		_maThanhPhan = maThanhPhan;

		if (_tthcThanhPhanHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThanhPhanHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setMaThanhPhan", String.class);

				method.invoke(_tthcThanhPhanHoSoRemoteModel, maThanhPhan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getThuTuHienThi() {
		return _thuTuHienThi;
	}

	@Override
	public void setThuTuHienThi(long thuTuHienThi) {
		_thuTuHienThi = thuTuHienThi;

		if (_tthcThanhPhanHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThanhPhanHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setThuTuHienThi", long.class);

				method.invoke(_tthcThanhPhanHoSoRemoteModel, thuTuHienThi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getLoaiThanhPhan() {
		return _loaiThanhPhan;
	}

	@Override
	public void setLoaiThanhPhan(long loaiThanhPhan) {
		_loaiThanhPhan = loaiThanhPhan;

		if (_tthcThanhPhanHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThanhPhanHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiThanhPhan", long.class);

				method.invoke(_tthcThanhPhanHoSoRemoteModel, loaiThanhPhan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSoTaiLieuDinhKem() {
		return _soTaiLieuDinhKem;
	}

	@Override
	public void setSoTaiLieuDinhKem(long soTaiLieuDinhKem) {
		_soTaiLieuDinhKem = soTaiLieuDinhKem;

		if (_tthcThanhPhanHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThanhPhanHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setSoTaiLieuDinhKem",
						long.class);

				method.invoke(_tthcThanhPhanHoSoRemoteModel, soTaiLieuDinhKem);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMauTrucTuyen() {
		return _mauTrucTuyen;
	}

	@Override
	public void setMauTrucTuyen(String mauTrucTuyen) {
		_mauTrucTuyen = mauTrucTuyen;

		if (_tthcThanhPhanHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThanhPhanHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setMauTrucTuyen", String.class);

				method.invoke(_tthcThanhPhanHoSoRemoteModel, mauTrucTuyen);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTthcThanhPhanHoSoRemoteModel() {
		return _tthcThanhPhanHoSoRemoteModel;
	}

	public void setTthcThanhPhanHoSoRemoteModel(
		BaseModel<?> tthcThanhPhanHoSoRemoteModel) {
		_tthcThanhPhanHoSoRemoteModel = tthcThanhPhanHoSoRemoteModel;
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

		Class<?> remoteModelClass = _tthcThanhPhanHoSoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tthcThanhPhanHoSoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TthcThanhPhanHoSoLocalServiceUtil.addTthcThanhPhanHoSo(this);
		}
		else {
			TthcThanhPhanHoSoLocalServiceUtil.updateTthcThanhPhanHoSo(this);
		}
	}

	@Override
	public TthcThanhPhanHoSo toEscapedModel() {
		return (TthcThanhPhanHoSo)ProxyUtil.newProxyInstance(TthcThanhPhanHoSo.class.getClassLoader(),
			new Class[] { TthcThanhPhanHoSo.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TthcThanhPhanHoSoClp clone = new TthcThanhPhanHoSoClp();

		clone.setId(getId());
		clone.setThuTucHanhChinhId(getThuTucHanhChinhId());
		clone.setTenThanhPhan(getTenThanhPhan());
		clone.setGhiChu(getGhiChu());
		clone.setMaThanhPhan(getMaThanhPhan());
		clone.setThuTuHienThi(getThuTuHienThi());
		clone.setLoaiThanhPhan(getLoaiThanhPhan());
		clone.setSoTaiLieuDinhKem(getSoTaiLieuDinhKem());
		clone.setMauTrucTuyen(getMauTrucTuyen());

		return clone;
	}

	@Override
	public int compareTo(TthcThanhPhanHoSo tthcThanhPhanHoSo) {
		int value = 0;

		if (getId() < tthcThanhPhanHoSo.getId()) {
			value = -1;
		}
		else if (getId() > tthcThanhPhanHoSo.getId()) {
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

		if (!(obj instanceof TthcThanhPhanHoSoClp)) {
			return false;
		}

		TthcThanhPhanHoSoClp tthcThanhPhanHoSo = (TthcThanhPhanHoSoClp)obj;

		long primaryKey = tthcThanhPhanHoSo.getPrimaryKey();

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
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", thuTucHanhChinhId=");
		sb.append(getThuTucHanhChinhId());
		sb.append(", tenThanhPhan=");
		sb.append(getTenThanhPhan());
		sb.append(", ghiChu=");
		sb.append(getGhiChu());
		sb.append(", maThanhPhan=");
		sb.append(getMaThanhPhan());
		sb.append(", thuTuHienThi=");
		sb.append(getThuTuHienThi());
		sb.append(", loaiThanhPhan=");
		sb.append(getLoaiThanhPhan());
		sb.append(", soTaiLieuDinhKem=");
		sb.append(getSoTaiLieuDinhKem());
		sb.append(", mauTrucTuyen=");
		sb.append(getMauTrucTuyen());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo");
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
			"<column><column-name>tenThanhPhan</column-name><column-value><![CDATA[");
		sb.append(getTenThanhPhan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ghiChu</column-name><column-value><![CDATA[");
		sb.append(getGhiChu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maThanhPhan</column-name><column-value><![CDATA[");
		sb.append(getMaThanhPhan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thuTuHienThi</column-name><column-value><![CDATA[");
		sb.append(getThuTuHienThi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiThanhPhan</column-name><column-value><![CDATA[");
		sb.append(getLoaiThanhPhan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soTaiLieuDinhKem</column-name><column-value><![CDATA[");
		sb.append(getSoTaiLieuDinhKem());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mauTrucTuyen</column-name><column-value><![CDATA[");
		sb.append(getMauTrucTuyen());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _thuTucHanhChinhId;
	private String _tenThanhPhan;
	private String _ghiChu;
	private String _maThanhPhan;
	private long _thuTuHienThi;
	private long _loaiThanhPhan;
	private long _soTaiLieuDinhKem;
	private String _mauTrucTuyen;
	private BaseModel<?> _tthcThanhPhanHoSoRemoteModel;
}