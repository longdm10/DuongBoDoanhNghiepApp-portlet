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
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtNoiDungThamTraLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author NhanNc
 */
public class QlvtNoiDungThamTraClp extends BaseModelImpl<QlvtNoiDungThamTra>
	implements QlvtNoiDungThamTra {
	public QlvtNoiDungThamTraClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtNoiDungThamTra.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtNoiDungThamTra.class.getName();
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
		attributes.put("mucKiemTra", getMucKiemTra());
		attributes.put("chaId", getChaId());
		attributes.put("coYKien", getCoYKien());
		attributes.put("buocXuLy", getBuocXuLy());
		attributes.put("thuTuHienThi", getThuTuHienThi());
		attributes.put("tthcNoiDungThamTraId", getTthcNoiDungThamTraId());
		attributes.put("tienTo", getTienTo());
		attributes.put("thanhPhanHoSo", getThanhPhanHoSo());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String mucKiemTra = (String)attributes.get("mucKiemTra");

		if (mucKiemTra != null) {
			setMucKiemTra(mucKiemTra);
		}

		Integer chaId = (Integer)attributes.get("chaId");

		if (chaId != null) {
			setChaId(chaId);
		}

		Integer coYKien = (Integer)attributes.get("coYKien");

		if (coYKien != null) {
			setCoYKien(coYKien);
		}

		Integer buocXuLy = (Integer)attributes.get("buocXuLy");

		if (buocXuLy != null) {
			setBuocXuLy(buocXuLy);
		}

		Integer thuTuHienThi = (Integer)attributes.get("thuTuHienThi");

		if (thuTuHienThi != null) {
			setThuTuHienThi(thuTuHienThi);
		}

		Integer tthcNoiDungThamTraId = (Integer)attributes.get(
				"tthcNoiDungThamTraId");

		if (tthcNoiDungThamTraId != null) {
			setTthcNoiDungThamTraId(tthcNoiDungThamTraId);
		}

		String tienTo = (String)attributes.get("tienTo");

		if (tienTo != null) {
			setTienTo(tienTo);
		}

		String thanhPhanHoSo = (String)attributes.get("thanhPhanHoSo");

		if (thanhPhanHoSo != null) {
			setThanhPhanHoSo(thanhPhanHoSo);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_qlvtNoiDungThamTraRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtNoiDungThamTraRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_qlvtNoiDungThamTraRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMucKiemTra() {
		return _mucKiemTra;
	}

	@Override
	public void setMucKiemTra(String mucKiemTra) {
		_mucKiemTra = mucKiemTra;

		if (_qlvtNoiDungThamTraRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtNoiDungThamTraRemoteModel.getClass();

				Method method = clazz.getMethod("setMucKiemTra", String.class);

				method.invoke(_qlvtNoiDungThamTraRemoteModel, mucKiemTra);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getChaId() {
		return _chaId;
	}

	@Override
	public void setChaId(int chaId) {
		_chaId = chaId;

		if (_qlvtNoiDungThamTraRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtNoiDungThamTraRemoteModel.getClass();

				Method method = clazz.getMethod("setChaId", int.class);

				method.invoke(_qlvtNoiDungThamTraRemoteModel, chaId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCoYKien() {
		return _coYKien;
	}

	@Override
	public void setCoYKien(int coYKien) {
		_coYKien = coYKien;

		if (_qlvtNoiDungThamTraRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtNoiDungThamTraRemoteModel.getClass();

				Method method = clazz.getMethod("setCoYKien", int.class);

				method.invoke(_qlvtNoiDungThamTraRemoteModel, coYKien);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getBuocXuLy() {
		return _buocXuLy;
	}

	@Override
	public void setBuocXuLy(int buocXuLy) {
		_buocXuLy = buocXuLy;

		if (_qlvtNoiDungThamTraRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtNoiDungThamTraRemoteModel.getClass();

				Method method = clazz.getMethod("setBuocXuLy", int.class);

				method.invoke(_qlvtNoiDungThamTraRemoteModel, buocXuLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getThuTuHienThi() {
		return _thuTuHienThi;
	}

	@Override
	public void setThuTuHienThi(int thuTuHienThi) {
		_thuTuHienThi = thuTuHienThi;

		if (_qlvtNoiDungThamTraRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtNoiDungThamTraRemoteModel.getClass();

				Method method = clazz.getMethod("setThuTuHienThi", int.class);

				method.invoke(_qlvtNoiDungThamTraRemoteModel, thuTuHienThi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTthcNoiDungThamTraId() {
		return _tthcNoiDungThamTraId;
	}

	@Override
	public void setTthcNoiDungThamTraId(int tthcNoiDungThamTraId) {
		_tthcNoiDungThamTraId = tthcNoiDungThamTraId;

		if (_qlvtNoiDungThamTraRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtNoiDungThamTraRemoteModel.getClass();

				Method method = clazz.getMethod("setTthcNoiDungThamTraId",
						int.class);

				method.invoke(_qlvtNoiDungThamTraRemoteModel,
					tthcNoiDungThamTraId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTienTo() {
		return _tienTo;
	}

	@Override
	public void setTienTo(String tienTo) {
		_tienTo = tienTo;

		if (_qlvtNoiDungThamTraRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtNoiDungThamTraRemoteModel.getClass();

				Method method = clazz.getMethod("setTienTo", String.class);

				method.invoke(_qlvtNoiDungThamTraRemoteModel, tienTo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getThanhPhanHoSo() {
		return _thanhPhanHoSo;
	}

	@Override
	public void setThanhPhanHoSo(String thanhPhanHoSo) {
		_thanhPhanHoSo = thanhPhanHoSo;

		if (_qlvtNoiDungThamTraRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtNoiDungThamTraRemoteModel.getClass();

				Method method = clazz.getMethod("setThanhPhanHoSo", String.class);

				method.invoke(_qlvtNoiDungThamTraRemoteModel, thanhPhanHoSo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQlvtNoiDungThamTraRemoteModel() {
		return _qlvtNoiDungThamTraRemoteModel;
	}

	public void setQlvtNoiDungThamTraRemoteModel(
		BaseModel<?> qlvtNoiDungThamTraRemoteModel) {
		_qlvtNoiDungThamTraRemoteModel = qlvtNoiDungThamTraRemoteModel;
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

		Class<?> remoteModelClass = _qlvtNoiDungThamTraRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtNoiDungThamTraRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtNoiDungThamTraLocalServiceUtil.addQlvtNoiDungThamTra(this);
		}
		else {
			QlvtNoiDungThamTraLocalServiceUtil.updateQlvtNoiDungThamTra(this);
		}
	}

	@Override
	public QlvtNoiDungThamTra toEscapedModel() {
		return (QlvtNoiDungThamTra)ProxyUtil.newProxyInstance(QlvtNoiDungThamTra.class.getClassLoader(),
			new Class[] { QlvtNoiDungThamTra.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QlvtNoiDungThamTraClp clone = new QlvtNoiDungThamTraClp();

		clone.setId(getId());
		clone.setMucKiemTra(getMucKiemTra());
		clone.setChaId(getChaId());
		clone.setCoYKien(getCoYKien());
		clone.setBuocXuLy(getBuocXuLy());
		clone.setThuTuHienThi(getThuTuHienThi());
		clone.setTthcNoiDungThamTraId(getTthcNoiDungThamTraId());
		clone.setTienTo(getTienTo());
		clone.setThanhPhanHoSo(getThanhPhanHoSo());

		return clone;
	}

	@Override
	public int compareTo(QlvtNoiDungThamTra qlvtNoiDungThamTra) {
		int value = 0;

		if (getThuTuHienThi() < qlvtNoiDungThamTra.getThuTuHienThi()) {
			value = -1;
		}
		else if (getThuTuHienThi() > qlvtNoiDungThamTra.getThuTuHienThi()) {
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

		if (!(obj instanceof QlvtNoiDungThamTraClp)) {
			return false;
		}

		QlvtNoiDungThamTraClp qlvtNoiDungThamTra = (QlvtNoiDungThamTraClp)obj;

		long primaryKey = qlvtNoiDungThamTra.getPrimaryKey();

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
		sb.append(", mucKiemTra=");
		sb.append(getMucKiemTra());
		sb.append(", chaId=");
		sb.append(getChaId());
		sb.append(", coYKien=");
		sb.append(getCoYKien());
		sb.append(", buocXuLy=");
		sb.append(getBuocXuLy());
		sb.append(", thuTuHienThi=");
		sb.append(getThuTuHienThi());
		sb.append(", tthcNoiDungThamTraId=");
		sb.append(getTthcNoiDungThamTraId());
		sb.append(", tienTo=");
		sb.append(getTienTo());
		sb.append(", thanhPhanHoSo=");
		sb.append(getThanhPhanHoSo());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mucKiemTra</column-name><column-value><![CDATA[");
		sb.append(getMucKiemTra());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chaId</column-name><column-value><![CDATA[");
		sb.append(getChaId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>coYKien</column-name><column-value><![CDATA[");
		sb.append(getCoYKien());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>buocXuLy</column-name><column-value><![CDATA[");
		sb.append(getBuocXuLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thuTuHienThi</column-name><column-value><![CDATA[");
		sb.append(getThuTuHienThi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tthcNoiDungThamTraId</column-name><column-value><![CDATA[");
		sb.append(getTthcNoiDungThamTraId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tienTo</column-name><column-value><![CDATA[");
		sb.append(getTienTo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thanhPhanHoSo</column-name><column-value><![CDATA[");
		sb.append(getThanhPhanHoSo());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _mucKiemTra;
	private int _chaId;
	private int _coYKien;
	private int _buocXuLy;
	private int _thuTuHienThi;
	private int _tthcNoiDungThamTraId;
	private String _tienTo;
	private String _thanhPhanHoSo;
	private BaseModel<?> _qlvtNoiDungThamTraRemoteModel;
}