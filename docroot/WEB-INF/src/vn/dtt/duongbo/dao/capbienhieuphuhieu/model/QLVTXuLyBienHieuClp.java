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

package vn.dtt.duongbo.dao.capbienhieuphuhieu.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbo.dao.capbienhieuphuhieu.service.ClpSerializer;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyBienHieuLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author binhta
 */
public class QLVTXuLyBienHieuClp extends BaseModelImpl<QLVTXuLyBienHieu>
	implements QLVTXuLyBienHieu {
	public QLVTXuLyBienHieuClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QLVTXuLyBienHieu.class;
	}

	@Override
	public String getModelClassName() {
		return QLVTXuLyBienHieu.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("thongTinXuLyId", getThongTinXuLyId());
		attributes.put("LinhVucKinhDoanh", getLinhVucKinhDoanh());
		attributes.put("lyDoCapLai", getLyDoCapLai());
		attributes.put("gpkdLuuHanhQuocTe", getGpkdLuuHanhQuocTe());
		attributes.put("gpkdLuuHanhQuocTeCQCAP", getGpkdLuuHanhQuocTeCQCAP());
		attributes.put("gpkdLuuHanhQuocTeNgayCap", getGpkdLuuHanhQuocTeNgayCap());
		attributes.put("gpkdLuuHanhQuocTeNgayHetHan",
			getGpkdLuuHanhQuocTeNgayHetHan());
		attributes.put("soLuongXe", getSoLuongXe());
		attributes.put("soLuongBHPHNopLai", getSoLuongBHPHNopLai());
		attributes.put("lapCap", getLapCap());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer thongTinXuLyId = (Integer)attributes.get("thongTinXuLyId");

		if (thongTinXuLyId != null) {
			setThongTinXuLyId(thongTinXuLyId);
		}

		String LinhVucKinhDoanh = (String)attributes.get("LinhVucKinhDoanh");

		if (LinhVucKinhDoanh != null) {
			setLinhVucKinhDoanh(LinhVucKinhDoanh);
		}

		String lyDoCapLai = (String)attributes.get("lyDoCapLai");

		if (lyDoCapLai != null) {
			setLyDoCapLai(lyDoCapLai);
		}

		String gpkdLuuHanhQuocTe = (String)attributes.get("gpkdLuuHanhQuocTe");

		if (gpkdLuuHanhQuocTe != null) {
			setGpkdLuuHanhQuocTe(gpkdLuuHanhQuocTe);
		}

		String gpkdLuuHanhQuocTeCQCAP = (String)attributes.get(
				"gpkdLuuHanhQuocTeCQCAP");

		if (gpkdLuuHanhQuocTeCQCAP != null) {
			setGpkdLuuHanhQuocTeCQCAP(gpkdLuuHanhQuocTeCQCAP);
		}

		Date gpkdLuuHanhQuocTeNgayCap = (Date)attributes.get(
				"gpkdLuuHanhQuocTeNgayCap");

		if (gpkdLuuHanhQuocTeNgayCap != null) {
			setGpkdLuuHanhQuocTeNgayCap(gpkdLuuHanhQuocTeNgayCap);
		}

		Date gpkdLuuHanhQuocTeNgayHetHan = (Date)attributes.get(
				"gpkdLuuHanhQuocTeNgayHetHan");

		if (gpkdLuuHanhQuocTeNgayHetHan != null) {
			setGpkdLuuHanhQuocTeNgayHetHan(gpkdLuuHanhQuocTeNgayHetHan);
		}

		String soLuongXe = (String)attributes.get("soLuongXe");

		if (soLuongXe != null) {
			setSoLuongXe(soLuongXe);
		}

		Integer soLuongBHPHNopLai = (Integer)attributes.get("soLuongBHPHNopLai");

		if (soLuongBHPHNopLai != null) {
			setSoLuongBHPHNopLai(soLuongBHPHNopLai);
		}

		Integer lapCap = (Integer)attributes.get("lapCap");

		if (lapCap != null) {
			setLapCap(lapCap);
		}
	}

	@Override
	public int getId() {
		return _id;
	}

	@Override
	public void setId(int id) {
		_id = id;

		if (_qlvtXuLyBienHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyBienHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setId", int.class);

				method.invoke(_qlvtXuLyBienHieuRemoteModel, id);
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

		if (_qlvtXuLyBienHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyBienHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setThongTinXuLyId", int.class);

				method.invoke(_qlvtXuLyBienHieuRemoteModel, thongTinXuLyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLinhVucKinhDoanh() {
		return _LinhVucKinhDoanh;
	}

	@Override
	public void setLinhVucKinhDoanh(String LinhVucKinhDoanh) {
		_LinhVucKinhDoanh = LinhVucKinhDoanh;

		if (_qlvtXuLyBienHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyBienHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setLinhVucKinhDoanh",
						String.class);

				method.invoke(_qlvtXuLyBienHieuRemoteModel, LinhVucKinhDoanh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLyDoCapLai() {
		return _lyDoCapLai;
	}

	@Override
	public void setLyDoCapLai(String lyDoCapLai) {
		_lyDoCapLai = lyDoCapLai;

		if (_qlvtXuLyBienHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyBienHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setLyDoCapLai", String.class);

				method.invoke(_qlvtXuLyBienHieuRemoteModel, lyDoCapLai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGpkdLuuHanhQuocTe() {
		return _gpkdLuuHanhQuocTe;
	}

	@Override
	public void setGpkdLuuHanhQuocTe(String gpkdLuuHanhQuocTe) {
		_gpkdLuuHanhQuocTe = gpkdLuuHanhQuocTe;

		if (_qlvtXuLyBienHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyBienHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setGpkdLuuHanhQuocTe",
						String.class);

				method.invoke(_qlvtXuLyBienHieuRemoteModel, gpkdLuuHanhQuocTe);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGpkdLuuHanhQuocTeCQCAP() {
		return _gpkdLuuHanhQuocTeCQCAP;
	}

	@Override
	public void setGpkdLuuHanhQuocTeCQCAP(String gpkdLuuHanhQuocTeCQCAP) {
		_gpkdLuuHanhQuocTeCQCAP = gpkdLuuHanhQuocTeCQCAP;

		if (_qlvtXuLyBienHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyBienHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setGpkdLuuHanhQuocTeCQCAP",
						String.class);

				method.invoke(_qlvtXuLyBienHieuRemoteModel,
					gpkdLuuHanhQuocTeCQCAP);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getGpkdLuuHanhQuocTeNgayCap() {
		return _gpkdLuuHanhQuocTeNgayCap;
	}

	@Override
	public void setGpkdLuuHanhQuocTeNgayCap(Date gpkdLuuHanhQuocTeNgayCap) {
		_gpkdLuuHanhQuocTeNgayCap = gpkdLuuHanhQuocTeNgayCap;

		if (_qlvtXuLyBienHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyBienHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setGpkdLuuHanhQuocTeNgayCap",
						Date.class);

				method.invoke(_qlvtXuLyBienHieuRemoteModel,
					gpkdLuuHanhQuocTeNgayCap);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getGpkdLuuHanhQuocTeNgayHetHan() {
		return _gpkdLuuHanhQuocTeNgayHetHan;
	}

	@Override
	public void setGpkdLuuHanhQuocTeNgayHetHan(Date gpkdLuuHanhQuocTeNgayHetHan) {
		_gpkdLuuHanhQuocTeNgayHetHan = gpkdLuuHanhQuocTeNgayHetHan;

		if (_qlvtXuLyBienHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyBienHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setGpkdLuuHanhQuocTeNgayHetHan",
						Date.class);

				method.invoke(_qlvtXuLyBienHieuRemoteModel,
					gpkdLuuHanhQuocTeNgayHetHan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoLuongXe() {
		return _soLuongXe;
	}

	@Override
	public void setSoLuongXe(String soLuongXe) {
		_soLuongXe = soLuongXe;

		if (_qlvtXuLyBienHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyBienHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setSoLuongXe", String.class);

				method.invoke(_qlvtXuLyBienHieuRemoteModel, soLuongXe);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoLuongBHPHNopLai() {
		return _soLuongBHPHNopLai;
	}

	@Override
	public void setSoLuongBHPHNopLai(int soLuongBHPHNopLai) {
		_soLuongBHPHNopLai = soLuongBHPHNopLai;

		if (_qlvtXuLyBienHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyBienHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setSoLuongBHPHNopLai",
						int.class);

				method.invoke(_qlvtXuLyBienHieuRemoteModel, soLuongBHPHNopLai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLapCap() {
		return _lapCap;
	}

	@Override
	public void setLapCap(int lapCap) {
		_lapCap = lapCap;

		if (_qlvtXuLyBienHieuRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyBienHieuRemoteModel.getClass();

				Method method = clazz.getMethod("setLapCap", int.class);

				method.invoke(_qlvtXuLyBienHieuRemoteModel, lapCap);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQLVTXuLyBienHieuRemoteModel() {
		return _qlvtXuLyBienHieuRemoteModel;
	}

	public void setQLVTXuLyBienHieuRemoteModel(
		BaseModel<?> qlvtXuLyBienHieuRemoteModel) {
		_qlvtXuLyBienHieuRemoteModel = qlvtXuLyBienHieuRemoteModel;
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

		Class<?> remoteModelClass = _qlvtXuLyBienHieuRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtXuLyBienHieuRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QLVTXuLyBienHieuLocalServiceUtil.addQLVTXuLyBienHieu(this);
		}
		else {
			QLVTXuLyBienHieuLocalServiceUtil.updateQLVTXuLyBienHieu(this);
		}
	}

	@Override
	public QLVTXuLyBienHieu toEscapedModel() {
		return (QLVTXuLyBienHieu)ProxyUtil.newProxyInstance(QLVTXuLyBienHieu.class.getClassLoader(),
			new Class[] { QLVTXuLyBienHieu.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QLVTXuLyBienHieuClp clone = new QLVTXuLyBienHieuClp();

		clone.setId(getId());
		clone.setThongTinXuLyId(getThongTinXuLyId());
		clone.setLinhVucKinhDoanh(getLinhVucKinhDoanh());
		clone.setLyDoCapLai(getLyDoCapLai());
		clone.setGpkdLuuHanhQuocTe(getGpkdLuuHanhQuocTe());
		clone.setGpkdLuuHanhQuocTeCQCAP(getGpkdLuuHanhQuocTeCQCAP());
		clone.setGpkdLuuHanhQuocTeNgayCap(getGpkdLuuHanhQuocTeNgayCap());
		clone.setGpkdLuuHanhQuocTeNgayHetHan(getGpkdLuuHanhQuocTeNgayHetHan());
		clone.setSoLuongXe(getSoLuongXe());
		clone.setSoLuongBHPHNopLai(getSoLuongBHPHNopLai());
		clone.setLapCap(getLapCap());

		return clone;
	}

	@Override
	public int compareTo(QLVTXuLyBienHieu qlvtXuLyBienHieu) {
		int primaryKey = qlvtXuLyBienHieu.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QLVTXuLyBienHieuClp)) {
			return false;
		}

		QLVTXuLyBienHieuClp qlvtXuLyBienHieu = (QLVTXuLyBienHieuClp)obj;

		int primaryKey = qlvtXuLyBienHieu.getPrimaryKey();

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
		return getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", thongTinXuLyId=");
		sb.append(getThongTinXuLyId());
		sb.append(", LinhVucKinhDoanh=");
		sb.append(getLinhVucKinhDoanh());
		sb.append(", lyDoCapLai=");
		sb.append(getLyDoCapLai());
		sb.append(", gpkdLuuHanhQuocTe=");
		sb.append(getGpkdLuuHanhQuocTe());
		sb.append(", gpkdLuuHanhQuocTeCQCAP=");
		sb.append(getGpkdLuuHanhQuocTeCQCAP());
		sb.append(", gpkdLuuHanhQuocTeNgayCap=");
		sb.append(getGpkdLuuHanhQuocTeNgayCap());
		sb.append(", gpkdLuuHanhQuocTeNgayHetHan=");
		sb.append(getGpkdLuuHanhQuocTeNgayHetHan());
		sb.append(", soLuongXe=");
		sb.append(getSoLuongXe());
		sb.append(", soLuongBHPHNopLai=");
		sb.append(getSoLuongBHPHNopLai());
		sb.append(", lapCap=");
		sb.append(getLapCap());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append(
			"vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieu");
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
			"<column><column-name>LinhVucKinhDoanh</column-name><column-value><![CDATA[");
		sb.append(getLinhVucKinhDoanh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lyDoCapLai</column-name><column-value><![CDATA[");
		sb.append(getLyDoCapLai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gpkdLuuHanhQuocTe</column-name><column-value><![CDATA[");
		sb.append(getGpkdLuuHanhQuocTe());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gpkdLuuHanhQuocTeCQCAP</column-name><column-value><![CDATA[");
		sb.append(getGpkdLuuHanhQuocTeCQCAP());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gpkdLuuHanhQuocTeNgayCap</column-name><column-value><![CDATA[");
		sb.append(getGpkdLuuHanhQuocTeNgayCap());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gpkdLuuHanhQuocTeNgayHetHan</column-name><column-value><![CDATA[");
		sb.append(getGpkdLuuHanhQuocTeNgayHetHan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soLuongXe</column-name><column-value><![CDATA[");
		sb.append(getSoLuongXe());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soLuongBHPHNopLai</column-name><column-value><![CDATA[");
		sb.append(getSoLuongBHPHNopLai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lapCap</column-name><column-value><![CDATA[");
		sb.append(getLapCap());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _id;
	private int _thongTinXuLyId;
	private String _LinhVucKinhDoanh;
	private String _lyDoCapLai;
	private String _gpkdLuuHanhQuocTe;
	private String _gpkdLuuHanhQuocTeCQCAP;
	private Date _gpkdLuuHanhQuocTeNgayCap;
	private Date _gpkdLuuHanhQuocTeNgayHetHan;
	private String _soLuongXe;
	private int _soLuongBHPHNopLai;
	private int _lapCap;
	private BaseModel<?> _qlvtXuLyBienHieuRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbo.dao.capbienhieuphuhieu.service.ClpSerializer.class;
}