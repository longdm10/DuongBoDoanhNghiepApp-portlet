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
import vn.dtt.duongbo.dao.common.service.QlvtPhuongTienDangKyVietLaoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class QlvtPhuongTienDangKyVietLaoClp extends BaseModelImpl<QlvtPhuongTienDangKyVietLao>
	implements QlvtPhuongTienDangKyVietLao {
	public QlvtPhuongTienDangKyVietLaoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtPhuongTienDangKyVietLao.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtPhuongTienDangKyVietLao.class.getName();
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
		attributes.put("BienSo", getBienSo());
		attributes.put("TenDangKySoHuu", getTenDangKySoHuu());
		attributes.put("NhanHieu", getNhanHieu());
		attributes.put("TrongTai", getTrongTai());
		attributes.put("NamSanXuat", getNamSanXuat());
		attributes.put("CuaKhauXuatNhap", getCuaKhauXuatNhap());
		attributes.put("HinhThucHoatDong", getHinhThucHoatDong());
		attributes.put("LoaiHinhHoatDong", getLoaiHinhHoatDong());
		attributes.put("TuyenHoatDong", getTuyenHoatDong());
		attributes.put("ThoiGianXinCapPhepTu", getThoiGianXinCapPhepTu());
		attributes.put("ThoiGianXinCapPhepDen", getThoiGianXinCapPhepDen());
		attributes.put("SoKhung", getSoKhung());
		attributes.put("MauSon", getMauSon());
		attributes.put("SoMay", getSoMay());
		attributes.put("LoaiHangVanChuyen", getLoaiHangVanChuyen());
		attributes.put("ThoiGianDuKienKhoiHanh", getThoiGianDuKienKhoiHanh());
		attributes.put("NoiDungHoSoId", getNoiDungHoSoId());
		attributes.put("HoSoThuTucId", getHoSoThuTucId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String BienSo = (String)attributes.get("BienSo");

		if (BienSo != null) {
			setBienSo(BienSo);
		}

		String TenDangKySoHuu = (String)attributes.get("TenDangKySoHuu");

		if (TenDangKySoHuu != null) {
			setTenDangKySoHuu(TenDangKySoHuu);
		}

		String NhanHieu = (String)attributes.get("NhanHieu");

		if (NhanHieu != null) {
			setNhanHieu(NhanHieu);
		}

		String TrongTai = (String)attributes.get("TrongTai");

		if (TrongTai != null) {
			setTrongTai(TrongTai);
		}

		String NamSanXuat = (String)attributes.get("NamSanXuat");

		if (NamSanXuat != null) {
			setNamSanXuat(NamSanXuat);
		}

		String CuaKhauXuatNhap = (String)attributes.get("CuaKhauXuatNhap");

		if (CuaKhauXuatNhap != null) {
			setCuaKhauXuatNhap(CuaKhauXuatNhap);
		}

		String HinhThucHoatDong = (String)attributes.get("HinhThucHoatDong");

		if (HinhThucHoatDong != null) {
			setHinhThucHoatDong(HinhThucHoatDong);
		}

		String LoaiHinhHoatDong = (String)attributes.get("LoaiHinhHoatDong");

		if (LoaiHinhHoatDong != null) {
			setLoaiHinhHoatDong(LoaiHinhHoatDong);
		}

		String TuyenHoatDong = (String)attributes.get("TuyenHoatDong");

		if (TuyenHoatDong != null) {
			setTuyenHoatDong(TuyenHoatDong);
		}

		Date ThoiGianXinCapPhepTu = (Date)attributes.get("ThoiGianXinCapPhepTu");

		if (ThoiGianXinCapPhepTu != null) {
			setThoiGianXinCapPhepTu(ThoiGianXinCapPhepTu);
		}

		Date ThoiGianXinCapPhepDen = (Date)attributes.get(
				"ThoiGianXinCapPhepDen");

		if (ThoiGianXinCapPhepDen != null) {
			setThoiGianXinCapPhepDen(ThoiGianXinCapPhepDen);
		}

		String SoKhung = (String)attributes.get("SoKhung");

		if (SoKhung != null) {
			setSoKhung(SoKhung);
		}

		String MauSon = (String)attributes.get("MauSon");

		if (MauSon != null) {
			setMauSon(MauSon);
		}

		String SoMay = (String)attributes.get("SoMay");

		if (SoMay != null) {
			setSoMay(SoMay);
		}

		String LoaiHangVanChuyen = (String)attributes.get("LoaiHangVanChuyen");

		if (LoaiHangVanChuyen != null) {
			setLoaiHangVanChuyen(LoaiHangVanChuyen);
		}

		Date ThoiGianDuKienKhoiHanh = (Date)attributes.get(
				"ThoiGianDuKienKhoiHanh");

		if (ThoiGianDuKienKhoiHanh != null) {
			setThoiGianDuKienKhoiHanh(ThoiGianDuKienKhoiHanh);
		}

		Long NoiDungHoSoId = (Long)attributes.get("NoiDungHoSoId");

		if (NoiDungHoSoId != null) {
			setNoiDungHoSoId(NoiDungHoSoId);
		}

		Long HoSoThuTucId = (Long)attributes.get("HoSoThuTucId");

		if (HoSoThuTucId != null) {
			setHoSoThuTucId(HoSoThuTucId);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_qlvtPhuongTienDangKyVietLaoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtPhuongTienDangKyVietLaoRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_qlvtPhuongTienDangKyVietLaoRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBienSo() {
		return _BienSo;
	}

	@Override
	public void setBienSo(String BienSo) {
		_BienSo = BienSo;

		if (_qlvtPhuongTienDangKyVietLaoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtPhuongTienDangKyVietLaoRemoteModel.getClass();

				Method method = clazz.getMethod("setBienSo", String.class);

				method.invoke(_qlvtPhuongTienDangKyVietLaoRemoteModel, BienSo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenDangKySoHuu() {
		return _TenDangKySoHuu;
	}

	@Override
	public void setTenDangKySoHuu(String TenDangKySoHuu) {
		_TenDangKySoHuu = TenDangKySoHuu;

		if (_qlvtPhuongTienDangKyVietLaoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtPhuongTienDangKyVietLaoRemoteModel.getClass();

				Method method = clazz.getMethod("setTenDangKySoHuu",
						String.class);

				method.invoke(_qlvtPhuongTienDangKyVietLaoRemoteModel,
					TenDangKySoHuu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNhanHieu() {
		return _NhanHieu;
	}

	@Override
	public void setNhanHieu(String NhanHieu) {
		_NhanHieu = NhanHieu;

		if (_qlvtPhuongTienDangKyVietLaoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtPhuongTienDangKyVietLaoRemoteModel.getClass();

				Method method = clazz.getMethod("setNhanHieu", String.class);

				method.invoke(_qlvtPhuongTienDangKyVietLaoRemoteModel, NhanHieu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTrongTai() {
		return _TrongTai;
	}

	@Override
	public void setTrongTai(String TrongTai) {
		_TrongTai = TrongTai;

		if (_qlvtPhuongTienDangKyVietLaoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtPhuongTienDangKyVietLaoRemoteModel.getClass();

				Method method = clazz.getMethod("setTrongTai", String.class);

				method.invoke(_qlvtPhuongTienDangKyVietLaoRemoteModel, TrongTai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNamSanXuat() {
		return _NamSanXuat;
	}

	@Override
	public void setNamSanXuat(String NamSanXuat) {
		_NamSanXuat = NamSanXuat;

		if (_qlvtPhuongTienDangKyVietLaoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtPhuongTienDangKyVietLaoRemoteModel.getClass();

				Method method = clazz.getMethod("setNamSanXuat", String.class);

				method.invoke(_qlvtPhuongTienDangKyVietLaoRemoteModel,
					NamSanXuat);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCuaKhauXuatNhap() {
		return _CuaKhauXuatNhap;
	}

	@Override
	public void setCuaKhauXuatNhap(String CuaKhauXuatNhap) {
		_CuaKhauXuatNhap = CuaKhauXuatNhap;

		if (_qlvtPhuongTienDangKyVietLaoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtPhuongTienDangKyVietLaoRemoteModel.getClass();

				Method method = clazz.getMethod("setCuaKhauXuatNhap",
						String.class);

				method.invoke(_qlvtPhuongTienDangKyVietLaoRemoteModel,
					CuaKhauXuatNhap);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getHinhThucHoatDong() {
		return _HinhThucHoatDong;
	}

	@Override
	public void setHinhThucHoatDong(String HinhThucHoatDong) {
		_HinhThucHoatDong = HinhThucHoatDong;

		if (_qlvtPhuongTienDangKyVietLaoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtPhuongTienDangKyVietLaoRemoteModel.getClass();

				Method method = clazz.getMethod("setHinhThucHoatDong",
						String.class);

				method.invoke(_qlvtPhuongTienDangKyVietLaoRemoteModel,
					HinhThucHoatDong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLoaiHinhHoatDong() {
		return _LoaiHinhHoatDong;
	}

	@Override
	public void setLoaiHinhHoatDong(String LoaiHinhHoatDong) {
		_LoaiHinhHoatDong = LoaiHinhHoatDong;

		if (_qlvtPhuongTienDangKyVietLaoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtPhuongTienDangKyVietLaoRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiHinhHoatDong",
						String.class);

				method.invoke(_qlvtPhuongTienDangKyVietLaoRemoteModel,
					LoaiHinhHoatDong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTuyenHoatDong() {
		return _TuyenHoatDong;
	}

	@Override
	public void setTuyenHoatDong(String TuyenHoatDong) {
		_TuyenHoatDong = TuyenHoatDong;

		if (_qlvtPhuongTienDangKyVietLaoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtPhuongTienDangKyVietLaoRemoteModel.getClass();

				Method method = clazz.getMethod("setTuyenHoatDong", String.class);

				method.invoke(_qlvtPhuongTienDangKyVietLaoRemoteModel,
					TuyenHoatDong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getThoiGianXinCapPhepTu() {
		return _ThoiGianXinCapPhepTu;
	}

	@Override
	public void setThoiGianXinCapPhepTu(Date ThoiGianXinCapPhepTu) {
		_ThoiGianXinCapPhepTu = ThoiGianXinCapPhepTu;

		if (_qlvtPhuongTienDangKyVietLaoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtPhuongTienDangKyVietLaoRemoteModel.getClass();

				Method method = clazz.getMethod("setThoiGianXinCapPhepTu",
						Date.class);

				method.invoke(_qlvtPhuongTienDangKyVietLaoRemoteModel,
					ThoiGianXinCapPhepTu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getThoiGianXinCapPhepDen() {
		return _ThoiGianXinCapPhepDen;
	}

	@Override
	public void setThoiGianXinCapPhepDen(Date ThoiGianXinCapPhepDen) {
		_ThoiGianXinCapPhepDen = ThoiGianXinCapPhepDen;

		if (_qlvtPhuongTienDangKyVietLaoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtPhuongTienDangKyVietLaoRemoteModel.getClass();

				Method method = clazz.getMethod("setThoiGianXinCapPhepDen",
						Date.class);

				method.invoke(_qlvtPhuongTienDangKyVietLaoRemoteModel,
					ThoiGianXinCapPhepDen);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoKhung() {
		return _SoKhung;
	}

	@Override
	public void setSoKhung(String SoKhung) {
		_SoKhung = SoKhung;

		if (_qlvtPhuongTienDangKyVietLaoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtPhuongTienDangKyVietLaoRemoteModel.getClass();

				Method method = clazz.getMethod("setSoKhung", String.class);

				method.invoke(_qlvtPhuongTienDangKyVietLaoRemoteModel, SoKhung);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMauSon() {
		return _MauSon;
	}

	@Override
	public void setMauSon(String MauSon) {
		_MauSon = MauSon;

		if (_qlvtPhuongTienDangKyVietLaoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtPhuongTienDangKyVietLaoRemoteModel.getClass();

				Method method = clazz.getMethod("setMauSon", String.class);

				method.invoke(_qlvtPhuongTienDangKyVietLaoRemoteModel, MauSon);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoMay() {
		return _SoMay;
	}

	@Override
	public void setSoMay(String SoMay) {
		_SoMay = SoMay;

		if (_qlvtPhuongTienDangKyVietLaoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtPhuongTienDangKyVietLaoRemoteModel.getClass();

				Method method = clazz.getMethod("setSoMay", String.class);

				method.invoke(_qlvtPhuongTienDangKyVietLaoRemoteModel, SoMay);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLoaiHangVanChuyen() {
		return _LoaiHangVanChuyen;
	}

	@Override
	public void setLoaiHangVanChuyen(String LoaiHangVanChuyen) {
		_LoaiHangVanChuyen = LoaiHangVanChuyen;

		if (_qlvtPhuongTienDangKyVietLaoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtPhuongTienDangKyVietLaoRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiHangVanChuyen",
						String.class);

				method.invoke(_qlvtPhuongTienDangKyVietLaoRemoteModel,
					LoaiHangVanChuyen);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getThoiGianDuKienKhoiHanh() {
		return _ThoiGianDuKienKhoiHanh;
	}

	@Override
	public void setThoiGianDuKienKhoiHanh(Date ThoiGianDuKienKhoiHanh) {
		_ThoiGianDuKienKhoiHanh = ThoiGianDuKienKhoiHanh;

		if (_qlvtPhuongTienDangKyVietLaoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtPhuongTienDangKyVietLaoRemoteModel.getClass();

				Method method = clazz.getMethod("setThoiGianDuKienKhoiHanh",
						Date.class);

				method.invoke(_qlvtPhuongTienDangKyVietLaoRemoteModel,
					ThoiGianDuKienKhoiHanh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNoiDungHoSoId() {
		return _NoiDungHoSoId;
	}

	@Override
	public void setNoiDungHoSoId(long NoiDungHoSoId) {
		_NoiDungHoSoId = NoiDungHoSoId;

		if (_qlvtPhuongTienDangKyVietLaoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtPhuongTienDangKyVietLaoRemoteModel.getClass();

				Method method = clazz.getMethod("setNoiDungHoSoId", long.class);

				method.invoke(_qlvtPhuongTienDangKyVietLaoRemoteModel,
					NoiDungHoSoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getHoSoThuTucId() {
		return _HoSoThuTucId;
	}

	@Override
	public void setHoSoThuTucId(long HoSoThuTucId) {
		_HoSoThuTucId = HoSoThuTucId;

		if (_qlvtPhuongTienDangKyVietLaoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtPhuongTienDangKyVietLaoRemoteModel.getClass();

				Method method = clazz.getMethod("setHoSoThuTucId", long.class);

				method.invoke(_qlvtPhuongTienDangKyVietLaoRemoteModel,
					HoSoThuTucId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQlvtPhuongTienDangKyVietLaoRemoteModel() {
		return _qlvtPhuongTienDangKyVietLaoRemoteModel;
	}

	public void setQlvtPhuongTienDangKyVietLaoRemoteModel(
		BaseModel<?> qlvtPhuongTienDangKyVietLaoRemoteModel) {
		_qlvtPhuongTienDangKyVietLaoRemoteModel = qlvtPhuongTienDangKyVietLaoRemoteModel;
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

		Class<?> remoteModelClass = _qlvtPhuongTienDangKyVietLaoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtPhuongTienDangKyVietLaoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtPhuongTienDangKyVietLaoLocalServiceUtil.addQlvtPhuongTienDangKyVietLao(this);
		}
		else {
			QlvtPhuongTienDangKyVietLaoLocalServiceUtil.updateQlvtPhuongTienDangKyVietLao(this);
		}
	}

	@Override
	public QlvtPhuongTienDangKyVietLao toEscapedModel() {
		return (QlvtPhuongTienDangKyVietLao)ProxyUtil.newProxyInstance(QlvtPhuongTienDangKyVietLao.class.getClassLoader(),
			new Class[] { QlvtPhuongTienDangKyVietLao.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QlvtPhuongTienDangKyVietLaoClp clone = new QlvtPhuongTienDangKyVietLaoClp();

		clone.setId(getId());
		clone.setBienSo(getBienSo());
		clone.setTenDangKySoHuu(getTenDangKySoHuu());
		clone.setNhanHieu(getNhanHieu());
		clone.setTrongTai(getTrongTai());
		clone.setNamSanXuat(getNamSanXuat());
		clone.setCuaKhauXuatNhap(getCuaKhauXuatNhap());
		clone.setHinhThucHoatDong(getHinhThucHoatDong());
		clone.setLoaiHinhHoatDong(getLoaiHinhHoatDong());
		clone.setTuyenHoatDong(getTuyenHoatDong());
		clone.setThoiGianXinCapPhepTu(getThoiGianXinCapPhepTu());
		clone.setThoiGianXinCapPhepDen(getThoiGianXinCapPhepDen());
		clone.setSoKhung(getSoKhung());
		clone.setMauSon(getMauSon());
		clone.setSoMay(getSoMay());
		clone.setLoaiHangVanChuyen(getLoaiHangVanChuyen());
		clone.setThoiGianDuKienKhoiHanh(getThoiGianDuKienKhoiHanh());
		clone.setNoiDungHoSoId(getNoiDungHoSoId());
		clone.setHoSoThuTucId(getHoSoThuTucId());

		return clone;
	}

	@Override
	public int compareTo(
		QlvtPhuongTienDangKyVietLao qlvtPhuongTienDangKyVietLao) {
		int value = 0;

		if (getId() < qlvtPhuongTienDangKyVietLao.getId()) {
			value = -1;
		}
		else if (getId() > qlvtPhuongTienDangKyVietLao.getId()) {
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

		if (!(obj instanceof QlvtPhuongTienDangKyVietLaoClp)) {
			return false;
		}

		QlvtPhuongTienDangKyVietLaoClp qlvtPhuongTienDangKyVietLao = (QlvtPhuongTienDangKyVietLaoClp)obj;

		long primaryKey = qlvtPhuongTienDangKyVietLao.getPrimaryKey();

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
		StringBundler sb = new StringBundler(39);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", BienSo=");
		sb.append(getBienSo());
		sb.append(", TenDangKySoHuu=");
		sb.append(getTenDangKySoHuu());
		sb.append(", NhanHieu=");
		sb.append(getNhanHieu());
		sb.append(", TrongTai=");
		sb.append(getTrongTai());
		sb.append(", NamSanXuat=");
		sb.append(getNamSanXuat());
		sb.append(", CuaKhauXuatNhap=");
		sb.append(getCuaKhauXuatNhap());
		sb.append(", HinhThucHoatDong=");
		sb.append(getHinhThucHoatDong());
		sb.append(", LoaiHinhHoatDong=");
		sb.append(getLoaiHinhHoatDong());
		sb.append(", TuyenHoatDong=");
		sb.append(getTuyenHoatDong());
		sb.append(", ThoiGianXinCapPhepTu=");
		sb.append(getThoiGianXinCapPhepTu());
		sb.append(", ThoiGianXinCapPhepDen=");
		sb.append(getThoiGianXinCapPhepDen());
		sb.append(", SoKhung=");
		sb.append(getSoKhung());
		sb.append(", MauSon=");
		sb.append(getMauSon());
		sb.append(", SoMay=");
		sb.append(getSoMay());
		sb.append(", LoaiHangVanChuyen=");
		sb.append(getLoaiHangVanChuyen());
		sb.append(", ThoiGianDuKienKhoiHanh=");
		sb.append(getThoiGianDuKienKhoiHanh());
		sb.append(", NoiDungHoSoId=");
		sb.append(getNoiDungHoSoId());
		sb.append(", HoSoThuTucId=");
		sb.append(getHoSoThuTucId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(61);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietLao");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>BienSo</column-name><column-value><![CDATA[");
		sb.append(getBienSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TenDangKySoHuu</column-name><column-value><![CDATA[");
		sb.append(getTenDangKySoHuu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NhanHieu</column-name><column-value><![CDATA[");
		sb.append(getNhanHieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TrongTai</column-name><column-value><![CDATA[");
		sb.append(getTrongTai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NamSanXuat</column-name><column-value><![CDATA[");
		sb.append(getNamSanXuat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CuaKhauXuatNhap</column-name><column-value><![CDATA[");
		sb.append(getCuaKhauXuatNhap());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>HinhThucHoatDong</column-name><column-value><![CDATA[");
		sb.append(getHinhThucHoatDong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LoaiHinhHoatDong</column-name><column-value><![CDATA[");
		sb.append(getLoaiHinhHoatDong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TuyenHoatDong</column-name><column-value><![CDATA[");
		sb.append(getTuyenHoatDong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ThoiGianXinCapPhepTu</column-name><column-value><![CDATA[");
		sb.append(getThoiGianXinCapPhepTu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ThoiGianXinCapPhepDen</column-name><column-value><![CDATA[");
		sb.append(getThoiGianXinCapPhepDen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SoKhung</column-name><column-value><![CDATA[");
		sb.append(getSoKhung());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MauSon</column-name><column-value><![CDATA[");
		sb.append(getMauSon());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SoMay</column-name><column-value><![CDATA[");
		sb.append(getSoMay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LoaiHangVanChuyen</column-name><column-value><![CDATA[");
		sb.append(getLoaiHangVanChuyen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ThoiGianDuKienKhoiHanh</column-name><column-value><![CDATA[");
		sb.append(getThoiGianDuKienKhoiHanh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NoiDungHoSoId</column-name><column-value><![CDATA[");
		sb.append(getNoiDungHoSoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>HoSoThuTucId</column-name><column-value><![CDATA[");
		sb.append(getHoSoThuTucId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _BienSo;
	private String _TenDangKySoHuu;
	private String _NhanHieu;
	private String _TrongTai;
	private String _NamSanXuat;
	private String _CuaKhauXuatNhap;
	private String _HinhThucHoatDong;
	private String _LoaiHinhHoatDong;
	private String _TuyenHoatDong;
	private Date _ThoiGianXinCapPhepTu;
	private Date _ThoiGianXinCapPhepDen;
	private String _SoKhung;
	private String _MauSon;
	private String _SoMay;
	private String _LoaiHangVanChuyen;
	private Date _ThoiGianDuKienKhoiHanh;
	private long _NoiDungHoSoId;
	private long _HoSoThuTucId;
	private BaseModel<?> _qlvtPhuongTienDangKyVietLaoRemoteModel;
}