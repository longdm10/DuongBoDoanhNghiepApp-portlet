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
import vn.dtt.duongbo.dao.motcua.service.MotCuaPhieuXuLyLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class MotCuaPhieuXuLyClp extends BaseModelImpl<MotCuaPhieuXuLy>
	implements MotCuaPhieuXuLy {
	public MotCuaPhieuXuLyClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return MotCuaPhieuXuLy.class;
	}

	@Override
	public String getModelClassName() {
		return MotCuaPhieuXuLy.class.getName();
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
		attributes.put("hoSoThuTucId", getHoSoThuTucId());
		attributes.put("quyTrinhThuTucId", getQuyTrinhThuTucId());
		attributes.put("soThuTu", getSoThuTu());
		attributes.put("trichYeuNoiDung", getTrichYeuNoiDung());
		attributes.put("ghiChu", getGhiChu());
		attributes.put("phieuXuLyCha", getPhieuXuLyCha());
		attributes.put("trangThaiHienTaiId", getTrangThaiHienTaiId());
		attributes.put("phanNhomHoSoId", getPhanNhomHoSoId());
		attributes.put("chiemQuyenXuLy", getChiemQuyenXuLy());
		attributes.put("trangThaiKetThuc", getTrangThaiKetThuc());
		attributes.put("toChucQuanLy", getToChucQuanLy());
		attributes.put("fileTaiLieu", getFileTaiLieu());
		attributes.put("nguoiXuLy", getNguoiXuLy());
		attributes.put("nguoiDuocUyQuyen", getNguoiDuocUyQuyen());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long hoSoThuTucId = (Long)attributes.get("hoSoThuTucId");

		if (hoSoThuTucId != null) {
			setHoSoThuTucId(hoSoThuTucId);
		}

		Long quyTrinhThuTucId = (Long)attributes.get("quyTrinhThuTucId");

		if (quyTrinhThuTucId != null) {
			setQuyTrinhThuTucId(quyTrinhThuTucId);
		}

		Integer soThuTu = (Integer)attributes.get("soThuTu");

		if (soThuTu != null) {
			setSoThuTu(soThuTu);
		}

		String trichYeuNoiDung = (String)attributes.get("trichYeuNoiDung");

		if (trichYeuNoiDung != null) {
			setTrichYeuNoiDung(trichYeuNoiDung);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}

		Long phieuXuLyCha = (Long)attributes.get("phieuXuLyCha");

		if (phieuXuLyCha != null) {
			setPhieuXuLyCha(phieuXuLyCha);
		}

		Long trangThaiHienTaiId = (Long)attributes.get("trangThaiHienTaiId");

		if (trangThaiHienTaiId != null) {
			setTrangThaiHienTaiId(trangThaiHienTaiId);
		}

		Long phanNhomHoSoId = (Long)attributes.get("phanNhomHoSoId");

		if (phanNhomHoSoId != null) {
			setPhanNhomHoSoId(phanNhomHoSoId);
		}

		Long chiemQuyenXuLy = (Long)attributes.get("chiemQuyenXuLy");

		if (chiemQuyenXuLy != null) {
			setChiemQuyenXuLy(chiemQuyenXuLy);
		}

		Long trangThaiKetThuc = (Long)attributes.get("trangThaiKetThuc");

		if (trangThaiKetThuc != null) {
			setTrangThaiKetThuc(trangThaiKetThuc);
		}

		Long toChucQuanLy = (Long)attributes.get("toChucQuanLy");

		if (toChucQuanLy != null) {
			setToChucQuanLy(toChucQuanLy);
		}

		Long fileTaiLieu = (Long)attributes.get("fileTaiLieu");

		if (fileTaiLieu != null) {
			setFileTaiLieu(fileTaiLieu);
		}

		Long nguoiXuLy = (Long)attributes.get("nguoiXuLy");

		if (nguoiXuLy != null) {
			setNguoiXuLy(nguoiXuLy);
		}

		Long nguoiDuocUyQuyen = (Long)attributes.get("nguoiDuocUyQuyen");

		if (nguoiDuocUyQuyen != null) {
			setNguoiDuocUyQuyen(nguoiDuocUyQuyen);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_motCuaPhieuXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhieuXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_motCuaPhieuXuLyRemoteModel, id);
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

		if (_motCuaPhieuXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhieuXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setHoSoThuTucId", long.class);

				method.invoke(_motCuaPhieuXuLyRemoteModel, hoSoThuTucId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getQuyTrinhThuTucId() {
		return _quyTrinhThuTucId;
	}

	@Override
	public void setQuyTrinhThuTucId(long quyTrinhThuTucId) {
		_quyTrinhThuTucId = quyTrinhThuTucId;

		if (_motCuaPhieuXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhieuXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setQuyTrinhThuTucId",
						long.class);

				method.invoke(_motCuaPhieuXuLyRemoteModel, quyTrinhThuTucId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoThuTu() {
		return _soThuTu;
	}

	@Override
	public void setSoThuTu(int soThuTu) {
		_soThuTu = soThuTu;

		if (_motCuaPhieuXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhieuXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setSoThuTu", int.class);

				method.invoke(_motCuaPhieuXuLyRemoteModel, soThuTu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTrichYeuNoiDung() {
		return _trichYeuNoiDung;
	}

	@Override
	public void setTrichYeuNoiDung(String trichYeuNoiDung) {
		_trichYeuNoiDung = trichYeuNoiDung;

		if (_motCuaPhieuXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhieuXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setTrichYeuNoiDung",
						String.class);

				method.invoke(_motCuaPhieuXuLyRemoteModel, trichYeuNoiDung);
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

		if (_motCuaPhieuXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhieuXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setGhiChu", String.class);

				method.invoke(_motCuaPhieuXuLyRemoteModel, ghiChu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPhieuXuLyCha() {
		return _phieuXuLyCha;
	}

	@Override
	public void setPhieuXuLyCha(long phieuXuLyCha) {
		_phieuXuLyCha = phieuXuLyCha;

		if (_motCuaPhieuXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhieuXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setPhieuXuLyCha", long.class);

				method.invoke(_motCuaPhieuXuLyRemoteModel, phieuXuLyCha);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTrangThaiHienTaiId() {
		return _trangThaiHienTaiId;
	}

	@Override
	public void setTrangThaiHienTaiId(long trangThaiHienTaiId) {
		_trangThaiHienTaiId = trangThaiHienTaiId;

		if (_motCuaPhieuXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhieuXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThaiHienTaiId",
						long.class);

				method.invoke(_motCuaPhieuXuLyRemoteModel, trangThaiHienTaiId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPhanNhomHoSoId() {
		return _phanNhomHoSoId;
	}

	@Override
	public void setPhanNhomHoSoId(long phanNhomHoSoId) {
		_phanNhomHoSoId = phanNhomHoSoId;

		if (_motCuaPhieuXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhieuXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setPhanNhomHoSoId", long.class);

				method.invoke(_motCuaPhieuXuLyRemoteModel, phanNhomHoSoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getChiemQuyenXuLy() {
		return _chiemQuyenXuLy;
	}

	@Override
	public void setChiemQuyenXuLy(long chiemQuyenXuLy) {
		_chiemQuyenXuLy = chiemQuyenXuLy;

		if (_motCuaPhieuXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhieuXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setChiemQuyenXuLy", long.class);

				method.invoke(_motCuaPhieuXuLyRemoteModel, chiemQuyenXuLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTrangThaiKetThuc() {
		return _trangThaiKetThuc;
	}

	@Override
	public void setTrangThaiKetThuc(long trangThaiKetThuc) {
		_trangThaiKetThuc = trangThaiKetThuc;

		if (_motCuaPhieuXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhieuXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThaiKetThuc",
						long.class);

				method.invoke(_motCuaPhieuXuLyRemoteModel, trangThaiKetThuc);
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

		if (_motCuaPhieuXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhieuXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setToChucQuanLy", long.class);

				method.invoke(_motCuaPhieuXuLyRemoteModel, toChucQuanLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getFileTaiLieu() {
		return _fileTaiLieu;
	}

	@Override
	public void setFileTaiLieu(long fileTaiLieu) {
		_fileTaiLieu = fileTaiLieu;

		if (_motCuaPhieuXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhieuXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setFileTaiLieu", long.class);

				method.invoke(_motCuaPhieuXuLyRemoteModel, fileTaiLieu);
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

		if (_motCuaPhieuXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhieuXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setNguoiXuLy", long.class);

				method.invoke(_motCuaPhieuXuLyRemoteModel, nguoiXuLy);
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

		if (_motCuaPhieuXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhieuXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setNguoiDuocUyQuyen",
						long.class);

				method.invoke(_motCuaPhieuXuLyRemoteModel, nguoiDuocUyQuyen);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getMotCuaPhieuXuLyRemoteModel() {
		return _motCuaPhieuXuLyRemoteModel;
	}

	public void setMotCuaPhieuXuLyRemoteModel(
		BaseModel<?> motCuaPhieuXuLyRemoteModel) {
		_motCuaPhieuXuLyRemoteModel = motCuaPhieuXuLyRemoteModel;
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

		Class<?> remoteModelClass = _motCuaPhieuXuLyRemoteModel.getClass();

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

		Object returnValue = method.invoke(_motCuaPhieuXuLyRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			MotCuaPhieuXuLyLocalServiceUtil.addMotCuaPhieuXuLy(this);
		}
		else {
			MotCuaPhieuXuLyLocalServiceUtil.updateMotCuaPhieuXuLy(this);
		}
	}

	@Override
	public MotCuaPhieuXuLy toEscapedModel() {
		return (MotCuaPhieuXuLy)ProxyUtil.newProxyInstance(MotCuaPhieuXuLy.class.getClassLoader(),
			new Class[] { MotCuaPhieuXuLy.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		MotCuaPhieuXuLyClp clone = new MotCuaPhieuXuLyClp();

		clone.setId(getId());
		clone.setHoSoThuTucId(getHoSoThuTucId());
		clone.setQuyTrinhThuTucId(getQuyTrinhThuTucId());
		clone.setSoThuTu(getSoThuTu());
		clone.setTrichYeuNoiDung(getTrichYeuNoiDung());
		clone.setGhiChu(getGhiChu());
		clone.setPhieuXuLyCha(getPhieuXuLyCha());
		clone.setTrangThaiHienTaiId(getTrangThaiHienTaiId());
		clone.setPhanNhomHoSoId(getPhanNhomHoSoId());
		clone.setChiemQuyenXuLy(getChiemQuyenXuLy());
		clone.setTrangThaiKetThuc(getTrangThaiKetThuc());
		clone.setToChucQuanLy(getToChucQuanLy());
		clone.setFileTaiLieu(getFileTaiLieu());
		clone.setNguoiXuLy(getNguoiXuLy());
		clone.setNguoiDuocUyQuyen(getNguoiDuocUyQuyen());

		return clone;
	}

	@Override
	public int compareTo(MotCuaPhieuXuLy motCuaPhieuXuLy) {
		int value = 0;

		if (getId() < motCuaPhieuXuLy.getId()) {
			value = -1;
		}
		else if (getId() > motCuaPhieuXuLy.getId()) {
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

		if (!(obj instanceof MotCuaPhieuXuLyClp)) {
			return false;
		}

		MotCuaPhieuXuLyClp motCuaPhieuXuLy = (MotCuaPhieuXuLyClp)obj;

		long primaryKey = motCuaPhieuXuLy.getPrimaryKey();

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
		StringBundler sb = new StringBundler(31);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", hoSoThuTucId=");
		sb.append(getHoSoThuTucId());
		sb.append(", quyTrinhThuTucId=");
		sb.append(getQuyTrinhThuTucId());
		sb.append(", soThuTu=");
		sb.append(getSoThuTu());
		sb.append(", trichYeuNoiDung=");
		sb.append(getTrichYeuNoiDung());
		sb.append(", ghiChu=");
		sb.append(getGhiChu());
		sb.append(", phieuXuLyCha=");
		sb.append(getPhieuXuLyCha());
		sb.append(", trangThaiHienTaiId=");
		sb.append(getTrangThaiHienTaiId());
		sb.append(", phanNhomHoSoId=");
		sb.append(getPhanNhomHoSoId());
		sb.append(", chiemQuyenXuLy=");
		sb.append(getChiemQuyenXuLy());
		sb.append(", trangThaiKetThuc=");
		sb.append(getTrangThaiKetThuc());
		sb.append(", toChucQuanLy=");
		sb.append(getToChucQuanLy());
		sb.append(", fileTaiLieu=");
		sb.append(getFileTaiLieu());
		sb.append(", nguoiXuLy=");
		sb.append(getNguoiXuLy());
		sb.append(", nguoiDuocUyQuyen=");
		sb.append(getNguoiDuocUyQuyen());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoSoThuTucId</column-name><column-value><![CDATA[");
		sb.append(getHoSoThuTucId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>quyTrinhThuTucId</column-name><column-value><![CDATA[");
		sb.append(getQuyTrinhThuTucId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soThuTu</column-name><column-value><![CDATA[");
		sb.append(getSoThuTu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trichYeuNoiDung</column-name><column-value><![CDATA[");
		sb.append(getTrichYeuNoiDung());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ghiChu</column-name><column-value><![CDATA[");
		sb.append(getGhiChu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phieuXuLyCha</column-name><column-value><![CDATA[");
		sb.append(getPhieuXuLyCha());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThaiHienTaiId</column-name><column-value><![CDATA[");
		sb.append(getTrangThaiHienTaiId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phanNhomHoSoId</column-name><column-value><![CDATA[");
		sb.append(getPhanNhomHoSoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chiemQuyenXuLy</column-name><column-value><![CDATA[");
		sb.append(getChiemQuyenXuLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThaiKetThuc</column-name><column-value><![CDATA[");
		sb.append(getTrangThaiKetThuc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>toChucQuanLy</column-name><column-value><![CDATA[");
		sb.append(getToChucQuanLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fileTaiLieu</column-name><column-value><![CDATA[");
		sb.append(getFileTaiLieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiXuLy</column-name><column-value><![CDATA[");
		sb.append(getNguoiXuLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiDuocUyQuyen</column-name><column-value><![CDATA[");
		sb.append(getNguoiDuocUyQuyen());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _hoSoThuTucId;
	private long _quyTrinhThuTucId;
	private int _soThuTu;
	private String _trichYeuNoiDung;
	private String _ghiChu;
	private long _phieuXuLyCha;
	private long _trangThaiHienTaiId;
	private long _phanNhomHoSoId;
	private long _chiemQuyenXuLy;
	private long _trangThaiKetThuc;
	private long _toChucQuanLy;
	private long _fileTaiLieu;
	private long _nguoiXuLy;
	private long _nguoiDuocUyQuyen;
	private BaseModel<?> _motCuaPhieuXuLyRemoteModel;
}