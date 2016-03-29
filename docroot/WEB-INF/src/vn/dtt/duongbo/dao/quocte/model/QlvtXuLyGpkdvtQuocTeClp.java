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

package vn.dtt.duongbo.dao.quocte.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbo.dao.quocte.service.ClpSerializer;
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyGpkdvtQuocTeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author NoiPham
 */
public class QlvtXuLyGpkdvtQuocTeClp extends BaseModelImpl<QlvtXuLyGpkdvtQuocTe>
	implements QlvtXuLyGpkdvtQuocTe {
	public QlvtXuLyGpkdvtQuocTeClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtXuLyGpkdvtQuocTe.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtXuLyGpkdvtQuocTe.class.getName();
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
		attributes.put("loaiCapPhep", getLoaiCapPhep());
		attributes.put("soGiapPhepVanTai", getSoGiapPhepVanTai());
		attributes.put("ngayCapGiayPhepVanTai", getNgayCapGiayPhepVanTai());
		attributes.put("coQuanCapGiayPhepVanTaiId",
			getCoQuanCapGiayPhepVanTaiId());
		attributes.put("ngayHetHanGiayPhepVanTai", getNgayHetHanGiayPhepVanTai());
		attributes.put("mucPhi", getMucPhi());
		attributes.put("ketQuaXuLy", getKetQuaXuLy());
		attributes.put("lyDoKhongDat", getLyDoKhongDat());

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

		String loaiCapPhep = (String)attributes.get("loaiCapPhep");

		if (loaiCapPhep != null) {
			setLoaiCapPhep(loaiCapPhep);
		}

		String soGiapPhepVanTai = (String)attributes.get("soGiapPhepVanTai");

		if (soGiapPhepVanTai != null) {
			setSoGiapPhepVanTai(soGiapPhepVanTai);
		}

		Date ngayCapGiayPhepVanTai = (Date)attributes.get(
				"ngayCapGiayPhepVanTai");

		if (ngayCapGiayPhepVanTai != null) {
			setNgayCapGiayPhepVanTai(ngayCapGiayPhepVanTai);
		}

		String coQuanCapGiayPhepVanTaiId = (String)attributes.get(
				"coQuanCapGiayPhepVanTaiId");

		if (coQuanCapGiayPhepVanTaiId != null) {
			setCoQuanCapGiayPhepVanTaiId(coQuanCapGiayPhepVanTaiId);
		}

		Date ngayHetHanGiayPhepVanTai = (Date)attributes.get(
				"ngayHetHanGiayPhepVanTai");

		if (ngayHetHanGiayPhepVanTai != null) {
			setNgayHetHanGiayPhepVanTai(ngayHetHanGiayPhepVanTai);
		}

		String mucPhi = (String)attributes.get("mucPhi");

		if (mucPhi != null) {
			setMucPhi(mucPhi);
		}

		String ketQuaXuLy = (String)attributes.get("ketQuaXuLy");

		if (ketQuaXuLy != null) {
			setKetQuaXuLy(ketQuaXuLy);
		}

		String lyDoKhongDat = (String)attributes.get("lyDoKhongDat");

		if (lyDoKhongDat != null) {
			setLyDoKhongDat(lyDoKhongDat);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_qlvtXuLyGpkdvtQuocTeRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtQuocTeRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_qlvtXuLyGpkdvtQuocTeRemoteModel, id);
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

		if (_qlvtXuLyGpkdvtQuocTeRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtQuocTeRemoteModel.getClass();

				Method method = clazz.getMethod("setThongTinXuLyId", int.class);

				method.invoke(_qlvtXuLyGpkdvtQuocTeRemoteModel, thongTinXuLyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLoaiCapPhep() {
		return _loaiCapPhep;
	}

	@Override
	public void setLoaiCapPhep(String loaiCapPhep) {
		_loaiCapPhep = loaiCapPhep;

		if (_qlvtXuLyGpkdvtQuocTeRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtQuocTeRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiCapPhep", String.class);

				method.invoke(_qlvtXuLyGpkdvtQuocTeRemoteModel, loaiCapPhep);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoGiapPhepVanTai() {
		return _soGiapPhepVanTai;
	}

	@Override
	public void setSoGiapPhepVanTai(String soGiapPhepVanTai) {
		_soGiapPhepVanTai = soGiapPhepVanTai;

		if (_qlvtXuLyGpkdvtQuocTeRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtQuocTeRemoteModel.getClass();

				Method method = clazz.getMethod("setSoGiapPhepVanTai",
						String.class);

				method.invoke(_qlvtXuLyGpkdvtQuocTeRemoteModel, soGiapPhepVanTai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayCapGiayPhepVanTai() {
		return _ngayCapGiayPhepVanTai;
	}

	@Override
	public void setNgayCapGiayPhepVanTai(Date ngayCapGiayPhepVanTai) {
		_ngayCapGiayPhepVanTai = ngayCapGiayPhepVanTai;

		if (_qlvtXuLyGpkdvtQuocTeRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtQuocTeRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayCapGiayPhepVanTai",
						Date.class);

				method.invoke(_qlvtXuLyGpkdvtQuocTeRemoteModel,
					ngayCapGiayPhepVanTai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCoQuanCapGiayPhepVanTaiId() {
		return _coQuanCapGiayPhepVanTaiId;
	}

	@Override
	public void setCoQuanCapGiayPhepVanTaiId(String coQuanCapGiayPhepVanTaiId) {
		_coQuanCapGiayPhepVanTaiId = coQuanCapGiayPhepVanTaiId;

		if (_qlvtXuLyGpkdvtQuocTeRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtQuocTeRemoteModel.getClass();

				Method method = clazz.getMethod("setCoQuanCapGiayPhepVanTaiId",
						String.class);

				method.invoke(_qlvtXuLyGpkdvtQuocTeRemoteModel,
					coQuanCapGiayPhepVanTaiId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayHetHanGiayPhepVanTai() {
		return _ngayHetHanGiayPhepVanTai;
	}

	@Override
	public void setNgayHetHanGiayPhepVanTai(Date ngayHetHanGiayPhepVanTai) {
		_ngayHetHanGiayPhepVanTai = ngayHetHanGiayPhepVanTai;

		if (_qlvtXuLyGpkdvtQuocTeRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtQuocTeRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayHetHanGiayPhepVanTai",
						Date.class);

				method.invoke(_qlvtXuLyGpkdvtQuocTeRemoteModel,
					ngayHetHanGiayPhepVanTai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMucPhi() {
		return _mucPhi;
	}

	@Override
	public void setMucPhi(String mucPhi) {
		_mucPhi = mucPhi;

		if (_qlvtXuLyGpkdvtQuocTeRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtQuocTeRemoteModel.getClass();

				Method method = clazz.getMethod("setMucPhi", String.class);

				method.invoke(_qlvtXuLyGpkdvtQuocTeRemoteModel, mucPhi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getKetQuaXuLy() {
		return _ketQuaXuLy;
	}

	@Override
	public void setKetQuaXuLy(String ketQuaXuLy) {
		_ketQuaXuLy = ketQuaXuLy;

		if (_qlvtXuLyGpkdvtQuocTeRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtQuocTeRemoteModel.getClass();

				Method method = clazz.getMethod("setKetQuaXuLy", String.class);

				method.invoke(_qlvtXuLyGpkdvtQuocTeRemoteModel, ketQuaXuLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLyDoKhongDat() {
		return _lyDoKhongDat;
	}

	@Override
	public void setLyDoKhongDat(String lyDoKhongDat) {
		_lyDoKhongDat = lyDoKhongDat;

		if (_qlvtXuLyGpkdvtQuocTeRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtQuocTeRemoteModel.getClass();

				Method method = clazz.getMethod("setLyDoKhongDat", String.class);

				method.invoke(_qlvtXuLyGpkdvtQuocTeRemoteModel, lyDoKhongDat);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQlvtXuLyGpkdvtQuocTeRemoteModel() {
		return _qlvtXuLyGpkdvtQuocTeRemoteModel;
	}

	public void setQlvtXuLyGpkdvtQuocTeRemoteModel(
		BaseModel<?> qlvtXuLyGpkdvtQuocTeRemoteModel) {
		_qlvtXuLyGpkdvtQuocTeRemoteModel = qlvtXuLyGpkdvtQuocTeRemoteModel;
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

		Class<?> remoteModelClass = _qlvtXuLyGpkdvtQuocTeRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtXuLyGpkdvtQuocTeRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtXuLyGpkdvtQuocTeLocalServiceUtil.addQlvtXuLyGpkdvtQuocTe(this);
		}
		else {
			QlvtXuLyGpkdvtQuocTeLocalServiceUtil.updateQlvtXuLyGpkdvtQuocTe(this);
		}
	}

	@Override
	public QlvtXuLyGpkdvtQuocTe toEscapedModel() {
		return (QlvtXuLyGpkdvtQuocTe)ProxyUtil.newProxyInstance(QlvtXuLyGpkdvtQuocTe.class.getClassLoader(),
			new Class[] { QlvtXuLyGpkdvtQuocTe.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QlvtXuLyGpkdvtQuocTeClp clone = new QlvtXuLyGpkdvtQuocTeClp();

		clone.setId(getId());
		clone.setThongTinXuLyId(getThongTinXuLyId());
		clone.setLoaiCapPhep(getLoaiCapPhep());
		clone.setSoGiapPhepVanTai(getSoGiapPhepVanTai());
		clone.setNgayCapGiayPhepVanTai(getNgayCapGiayPhepVanTai());
		clone.setCoQuanCapGiayPhepVanTaiId(getCoQuanCapGiayPhepVanTaiId());
		clone.setNgayHetHanGiayPhepVanTai(getNgayHetHanGiayPhepVanTai());
		clone.setMucPhi(getMucPhi());
		clone.setKetQuaXuLy(getKetQuaXuLy());
		clone.setLyDoKhongDat(getLyDoKhongDat());

		return clone;
	}

	@Override
	public int compareTo(QlvtXuLyGpkdvtQuocTe qlvtXuLyGpkdvtQuocTe) {
		int value = 0;

		if (getId() < qlvtXuLyGpkdvtQuocTe.getId()) {
			value = -1;
		}
		else if (getId() > qlvtXuLyGpkdvtQuocTe.getId()) {
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

		if (!(obj instanceof QlvtXuLyGpkdvtQuocTeClp)) {
			return false;
		}

		QlvtXuLyGpkdvtQuocTeClp qlvtXuLyGpkdvtQuocTe = (QlvtXuLyGpkdvtQuocTeClp)obj;

		long primaryKey = qlvtXuLyGpkdvtQuocTe.getPrimaryKey();

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
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", thongTinXuLyId=");
		sb.append(getThongTinXuLyId());
		sb.append(", loaiCapPhep=");
		sb.append(getLoaiCapPhep());
		sb.append(", soGiapPhepVanTai=");
		sb.append(getSoGiapPhepVanTai());
		sb.append(", ngayCapGiayPhepVanTai=");
		sb.append(getNgayCapGiayPhepVanTai());
		sb.append(", coQuanCapGiayPhepVanTaiId=");
		sb.append(getCoQuanCapGiayPhepVanTaiId());
		sb.append(", ngayHetHanGiayPhepVanTai=");
		sb.append(getNgayHetHanGiayPhepVanTai());
		sb.append(", mucPhi=");
		sb.append(getMucPhi());
		sb.append(", ketQuaXuLy=");
		sb.append(getKetQuaXuLy());
		sb.append(", lyDoKhongDat=");
		sb.append(getLyDoKhongDat());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTe");
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
			"<column><column-name>loaiCapPhep</column-name><column-value><![CDATA[");
		sb.append(getLoaiCapPhep());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soGiapPhepVanTai</column-name><column-value><![CDATA[");
		sb.append(getSoGiapPhepVanTai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayCapGiayPhepVanTai</column-name><column-value><![CDATA[");
		sb.append(getNgayCapGiayPhepVanTai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>coQuanCapGiayPhepVanTaiId</column-name><column-value><![CDATA[");
		sb.append(getCoQuanCapGiayPhepVanTaiId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayHetHanGiayPhepVanTai</column-name><column-value><![CDATA[");
		sb.append(getNgayHetHanGiayPhepVanTai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mucPhi</column-name><column-value><![CDATA[");
		sb.append(getMucPhi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ketQuaXuLy</column-name><column-value><![CDATA[");
		sb.append(getKetQuaXuLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lyDoKhongDat</column-name><column-value><![CDATA[");
		sb.append(getLyDoKhongDat());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private int _thongTinXuLyId;
	private String _loaiCapPhep;
	private String _soGiapPhepVanTai;
	private Date _ngayCapGiayPhepVanTai;
	private String _coQuanCapGiayPhepVanTaiId;
	private Date _ngayHetHanGiayPhepVanTai;
	private String _mucPhi;
	private String _ketQuaXuLy;
	private String _lyDoKhongDat;
	private BaseModel<?> _qlvtXuLyGpkdvtQuocTeRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbo.dao.quocte.service.ClpSerializer.class;
}