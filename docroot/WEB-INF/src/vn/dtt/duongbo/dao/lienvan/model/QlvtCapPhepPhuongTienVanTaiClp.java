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

package vn.dtt.duongbo.dao.lienvan.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbo.dao.lienvan.service.ClpSerializer;
import vn.dtt.duongbo.dao.lienvan.service.QlvtCapPhepPhuongTienVanTaiLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author NhanNc
 */
public class QlvtCapPhepPhuongTienVanTaiClp extends BaseModelImpl<QlvtCapPhepPhuongTienVanTai>
	implements QlvtCapPhepPhuongTienVanTai {
	public QlvtCapPhepPhuongTienVanTaiClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtCapPhepPhuongTienVanTai.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtCapPhepPhuongTienVanTai.class.getName();
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
		attributes.put("bienSoXe", getBienSoXe());
		attributes.put("nhanHieu", getNhanHieu());
		attributes.put("trongTai", getTrongTai());
		attributes.put("noiSanXuat", getNoiSanXuat());
		attributes.put("namSanXuat", getNamSanXuat());
		attributes.put("soChoNgoi", getSoChoNgoi());
		attributes.put("hinhThucSoHuuXe", getHinhThucSoHuuXe());
		attributes.put("nienHanSuDungGiayDangKiem",
			getNienHanSuDungGiayDangKiem());
		attributes.put("nienHanSuDungND86", getNienHanSuDungND86());
		attributes.put("soKhung", getSoKhung());
		attributes.put("soMay", getSoMay());
		attributes.put("mauSon", getMauSon());
		attributes.put("thongTinXuLyViPham", getThongTinXuLyViPham());
		attributes.put("trangThai", getTrangThai());
		attributes.put("fileId", getFileId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String bienSoXe = (String)attributes.get("bienSoXe");

		if (bienSoXe != null) {
			setBienSoXe(bienSoXe);
		}

		String nhanHieu = (String)attributes.get("nhanHieu");

		if (nhanHieu != null) {
			setNhanHieu(nhanHieu);
		}

		Integer trongTai = (Integer)attributes.get("trongTai");

		if (trongTai != null) {
			setTrongTai(trongTai);
		}

		String noiSanXuat = (String)attributes.get("noiSanXuat");

		if (noiSanXuat != null) {
			setNoiSanXuat(noiSanXuat);
		}

		Integer namSanXuat = (Integer)attributes.get("namSanXuat");

		if (namSanXuat != null) {
			setNamSanXuat(namSanXuat);
		}

		Integer soChoNgoi = (Integer)attributes.get("soChoNgoi");

		if (soChoNgoi != null) {
			setSoChoNgoi(soChoNgoi);
		}

		String hinhThucSoHuuXe = (String)attributes.get("hinhThucSoHuuXe");

		if (hinhThucSoHuuXe != null) {
			setHinhThucSoHuuXe(hinhThucSoHuuXe);
		}

		Integer nienHanSuDungGiayDangKiem = (Integer)attributes.get(
				"nienHanSuDungGiayDangKiem");

		if (nienHanSuDungGiayDangKiem != null) {
			setNienHanSuDungGiayDangKiem(nienHanSuDungGiayDangKiem);
		}

		Integer nienHanSuDungND86 = (Integer)attributes.get("nienHanSuDungND86");

		if (nienHanSuDungND86 != null) {
			setNienHanSuDungND86(nienHanSuDungND86);
		}

		String soKhung = (String)attributes.get("soKhung");

		if (soKhung != null) {
			setSoKhung(soKhung);
		}

		String soMay = (String)attributes.get("soMay");

		if (soMay != null) {
			setSoMay(soMay);
		}

		String mauSon = (String)attributes.get("mauSon");

		if (mauSon != null) {
			setMauSon(mauSon);
		}

		String thongTinXuLyViPham = (String)attributes.get("thongTinXuLyViPham");

		if (thongTinXuLyViPham != null) {
			setThongTinXuLyViPham(thongTinXuLyViPham);
		}

		String trangThai = (String)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}

		Long fileId = (Long)attributes.get("fileId");

		if (fileId != null) {
			setFileId(fileId);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_qlvtCapPhepPhuongTienVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepPhuongTienVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_qlvtCapPhepPhuongTienVanTaiRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBienSoXe() {
		return _bienSoXe;
	}

	@Override
	public void setBienSoXe(String bienSoXe) {
		_bienSoXe = bienSoXe;

		if (_qlvtCapPhepPhuongTienVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepPhuongTienVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setBienSoXe", String.class);

				method.invoke(_qlvtCapPhepPhuongTienVanTaiRemoteModel, bienSoXe);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNhanHieu() {
		return _nhanHieu;
	}

	@Override
	public void setNhanHieu(String nhanHieu) {
		_nhanHieu = nhanHieu;

		if (_qlvtCapPhepPhuongTienVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepPhuongTienVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setNhanHieu", String.class);

				method.invoke(_qlvtCapPhepPhuongTienVanTaiRemoteModel, nhanHieu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTrongTai() {
		return _trongTai;
	}

	@Override
	public void setTrongTai(int trongTai) {
		_trongTai = trongTai;

		if (_qlvtCapPhepPhuongTienVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepPhuongTienVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setTrongTai", int.class);

				method.invoke(_qlvtCapPhepPhuongTienVanTaiRemoteModel, trongTai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNoiSanXuat() {
		return _noiSanXuat;
	}

	@Override
	public void setNoiSanXuat(String noiSanXuat) {
		_noiSanXuat = noiSanXuat;

		if (_qlvtCapPhepPhuongTienVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepPhuongTienVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setNoiSanXuat", String.class);

				method.invoke(_qlvtCapPhepPhuongTienVanTaiRemoteModel,
					noiSanXuat);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNamSanXuat() {
		return _namSanXuat;
	}

	@Override
	public void setNamSanXuat(int namSanXuat) {
		_namSanXuat = namSanXuat;

		if (_qlvtCapPhepPhuongTienVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepPhuongTienVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setNamSanXuat", int.class);

				method.invoke(_qlvtCapPhepPhuongTienVanTaiRemoteModel,
					namSanXuat);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoChoNgoi() {
		return _soChoNgoi;
	}

	@Override
	public void setSoChoNgoi(int soChoNgoi) {
		_soChoNgoi = soChoNgoi;

		if (_qlvtCapPhepPhuongTienVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepPhuongTienVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setSoChoNgoi", int.class);

				method.invoke(_qlvtCapPhepPhuongTienVanTaiRemoteModel, soChoNgoi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getHinhThucSoHuuXe() {
		return _hinhThucSoHuuXe;
	}

	@Override
	public void setHinhThucSoHuuXe(String hinhThucSoHuuXe) {
		_hinhThucSoHuuXe = hinhThucSoHuuXe;

		if (_qlvtCapPhepPhuongTienVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepPhuongTienVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setHinhThucSoHuuXe",
						String.class);

				method.invoke(_qlvtCapPhepPhuongTienVanTaiRemoteModel,
					hinhThucSoHuuXe);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNienHanSuDungGiayDangKiem() {
		return _nienHanSuDungGiayDangKiem;
	}

	@Override
	public void setNienHanSuDungGiayDangKiem(int nienHanSuDungGiayDangKiem) {
		_nienHanSuDungGiayDangKiem = nienHanSuDungGiayDangKiem;

		if (_qlvtCapPhepPhuongTienVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepPhuongTienVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setNienHanSuDungGiayDangKiem",
						int.class);

				method.invoke(_qlvtCapPhepPhuongTienVanTaiRemoteModel,
					nienHanSuDungGiayDangKiem);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNienHanSuDungND86() {
		return _nienHanSuDungND86;
	}

	@Override
	public void setNienHanSuDungND86(int nienHanSuDungND86) {
		_nienHanSuDungND86 = nienHanSuDungND86;

		if (_qlvtCapPhepPhuongTienVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepPhuongTienVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setNienHanSuDungND86",
						int.class);

				method.invoke(_qlvtCapPhepPhuongTienVanTaiRemoteModel,
					nienHanSuDungND86);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoKhung() {
		return _soKhung;
	}

	@Override
	public void setSoKhung(String soKhung) {
		_soKhung = soKhung;

		if (_qlvtCapPhepPhuongTienVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepPhuongTienVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setSoKhung", String.class);

				method.invoke(_qlvtCapPhepPhuongTienVanTaiRemoteModel, soKhung);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoMay() {
		return _soMay;
	}

	@Override
	public void setSoMay(String soMay) {
		_soMay = soMay;

		if (_qlvtCapPhepPhuongTienVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepPhuongTienVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setSoMay", String.class);

				method.invoke(_qlvtCapPhepPhuongTienVanTaiRemoteModel, soMay);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMauSon() {
		return _mauSon;
	}

	@Override
	public void setMauSon(String mauSon) {
		_mauSon = mauSon;

		if (_qlvtCapPhepPhuongTienVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepPhuongTienVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setMauSon", String.class);

				method.invoke(_qlvtCapPhepPhuongTienVanTaiRemoteModel, mauSon);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getThongTinXuLyViPham() {
		return _thongTinXuLyViPham;
	}

	@Override
	public void setThongTinXuLyViPham(String thongTinXuLyViPham) {
		_thongTinXuLyViPham = thongTinXuLyViPham;

		if (_qlvtCapPhepPhuongTienVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepPhuongTienVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setThongTinXuLyViPham",
						String.class);

				method.invoke(_qlvtCapPhepPhuongTienVanTaiRemoteModel,
					thongTinXuLyViPham);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTrangThai() {
		return _trangThai;
	}

	@Override
	public void setTrangThai(String trangThai) {
		_trangThai = trangThai;

		if (_qlvtCapPhepPhuongTienVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepPhuongTienVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThai", String.class);

				method.invoke(_qlvtCapPhepPhuongTienVanTaiRemoteModel, trangThai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getFileId() {
		return _fileId;
	}

	@Override
	public void setFileId(long fileId) {
		_fileId = fileId;

		if (_qlvtCapPhepPhuongTienVanTaiRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepPhuongTienVanTaiRemoteModel.getClass();

				Method method = clazz.getMethod("setFileId", long.class);

				method.invoke(_qlvtCapPhepPhuongTienVanTaiRemoteModel, fileId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQlvtCapPhepPhuongTienVanTaiRemoteModel() {
		return _qlvtCapPhepPhuongTienVanTaiRemoteModel;
	}

	public void setQlvtCapPhepPhuongTienVanTaiRemoteModel(
		BaseModel<?> qlvtCapPhepPhuongTienVanTaiRemoteModel) {
		_qlvtCapPhepPhuongTienVanTaiRemoteModel = qlvtCapPhepPhuongTienVanTaiRemoteModel;
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

		Class<?> remoteModelClass = _qlvtCapPhepPhuongTienVanTaiRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtCapPhepPhuongTienVanTaiRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtCapPhepPhuongTienVanTaiLocalServiceUtil.addQlvtCapPhepPhuongTienVanTai(this);
		}
		else {
			QlvtCapPhepPhuongTienVanTaiLocalServiceUtil.updateQlvtCapPhepPhuongTienVanTai(this);
		}
	}

	@Override
	public QlvtCapPhepPhuongTienVanTai toEscapedModel() {
		return (QlvtCapPhepPhuongTienVanTai)ProxyUtil.newProxyInstance(QlvtCapPhepPhuongTienVanTai.class.getClassLoader(),
			new Class[] { QlvtCapPhepPhuongTienVanTai.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QlvtCapPhepPhuongTienVanTaiClp clone = new QlvtCapPhepPhuongTienVanTaiClp();

		clone.setId(getId());
		clone.setBienSoXe(getBienSoXe());
		clone.setNhanHieu(getNhanHieu());
		clone.setTrongTai(getTrongTai());
		clone.setNoiSanXuat(getNoiSanXuat());
		clone.setNamSanXuat(getNamSanXuat());
		clone.setSoChoNgoi(getSoChoNgoi());
		clone.setHinhThucSoHuuXe(getHinhThucSoHuuXe());
		clone.setNienHanSuDungGiayDangKiem(getNienHanSuDungGiayDangKiem());
		clone.setNienHanSuDungND86(getNienHanSuDungND86());
		clone.setSoKhung(getSoKhung());
		clone.setSoMay(getSoMay());
		clone.setMauSon(getMauSon());
		clone.setThongTinXuLyViPham(getThongTinXuLyViPham());
		clone.setTrangThai(getTrangThai());
		clone.setFileId(getFileId());

		return clone;
	}

	@Override
	public int compareTo(
		QlvtCapPhepPhuongTienVanTai qlvtCapPhepPhuongTienVanTai) {
		int value = 0;

		if (getId() < qlvtCapPhepPhuongTienVanTai.getId()) {
			value = -1;
		}
		else if (getId() > qlvtCapPhepPhuongTienVanTai.getId()) {
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

		if (!(obj instanceof QlvtCapPhepPhuongTienVanTaiClp)) {
			return false;
		}

		QlvtCapPhepPhuongTienVanTaiClp qlvtCapPhepPhuongTienVanTai = (QlvtCapPhepPhuongTienVanTaiClp)obj;

		long primaryKey = qlvtCapPhepPhuongTienVanTai.getPrimaryKey();

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
		StringBundler sb = new StringBundler(33);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", bienSoXe=");
		sb.append(getBienSoXe());
		sb.append(", nhanHieu=");
		sb.append(getNhanHieu());
		sb.append(", trongTai=");
		sb.append(getTrongTai());
		sb.append(", noiSanXuat=");
		sb.append(getNoiSanXuat());
		sb.append(", namSanXuat=");
		sb.append(getNamSanXuat());
		sb.append(", soChoNgoi=");
		sb.append(getSoChoNgoi());
		sb.append(", hinhThucSoHuuXe=");
		sb.append(getHinhThucSoHuuXe());
		sb.append(", nienHanSuDungGiayDangKiem=");
		sb.append(getNienHanSuDungGiayDangKiem());
		sb.append(", nienHanSuDungND86=");
		sb.append(getNienHanSuDungND86());
		sb.append(", soKhung=");
		sb.append(getSoKhung());
		sb.append(", soMay=");
		sb.append(getSoMay());
		sb.append(", mauSon=");
		sb.append(getMauSon());
		sb.append(", thongTinXuLyViPham=");
		sb.append(getThongTinXuLyViPham());
		sb.append(", trangThai=");
		sb.append(getTrangThai());
		sb.append(", fileId=");
		sb.append(getFileId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(52);

		sb.append("<model><model-name>");
		sb.append(
			"vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepPhuongTienVanTai");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bienSoXe</column-name><column-value><![CDATA[");
		sb.append(getBienSoXe());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nhanHieu</column-name><column-value><![CDATA[");
		sb.append(getNhanHieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trongTai</column-name><column-value><![CDATA[");
		sb.append(getTrongTai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>noiSanXuat</column-name><column-value><![CDATA[");
		sb.append(getNoiSanXuat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>namSanXuat</column-name><column-value><![CDATA[");
		sb.append(getNamSanXuat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soChoNgoi</column-name><column-value><![CDATA[");
		sb.append(getSoChoNgoi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hinhThucSoHuuXe</column-name><column-value><![CDATA[");
		sb.append(getHinhThucSoHuuXe());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nienHanSuDungGiayDangKiem</column-name><column-value><![CDATA[");
		sb.append(getNienHanSuDungGiayDangKiem());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nienHanSuDungND86</column-name><column-value><![CDATA[");
		sb.append(getNienHanSuDungND86());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soKhung</column-name><column-value><![CDATA[");
		sb.append(getSoKhung());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soMay</column-name><column-value><![CDATA[");
		sb.append(getSoMay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mauSon</column-name><column-value><![CDATA[");
		sb.append(getMauSon());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thongTinXuLyViPham</column-name><column-value><![CDATA[");
		sb.append(getThongTinXuLyViPham());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThai</column-name><column-value><![CDATA[");
		sb.append(getTrangThai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fileId</column-name><column-value><![CDATA[");
		sb.append(getFileId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _bienSoXe;
	private String _nhanHieu;
	private int _trongTai;
	private String _noiSanXuat;
	private int _namSanXuat;
	private int _soChoNgoi;
	private String _hinhThucSoHuuXe;
	private int _nienHanSuDungGiayDangKiem;
	private int _nienHanSuDungND86;
	private String _soKhung;
	private String _soMay;
	private String _mauSon;
	private String _thongTinXuLyViPham;
	private String _trangThai;
	private long _fileId;
	private BaseModel<?> _qlvtCapPhepPhuongTienVanTaiRemoteModel;
}