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

package vn.dtt.duongbo.dao.common.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietLao;
import vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietLaoModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the QlvtPhuongTienDangKyVietLao service. Represents a row in the &quot;qlvt_phuongtiendangky_vl&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietLaoModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link QlvtPhuongTienDangKyVietLaoImpl}.
 * </p>
 *
 * @author win_64
 * @see QlvtPhuongTienDangKyVietLaoImpl
 * @see vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietLao
 * @see vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietLaoModel
 * @generated
 */
public class QlvtPhuongTienDangKyVietLaoModelImpl extends BaseModelImpl<QlvtPhuongTienDangKyVietLao>
	implements QlvtPhuongTienDangKyVietLaoModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a qlvt phuong tien dang ky viet lao model instance should use the {@link vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietLao} interface instead.
	 */
	public static final String TABLE_NAME = "qlvt_phuongtiendangky_vl";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.BIGINT },
			{ "BIENSO", Types.VARCHAR },
			{ "TENDANGKYSOHUU", Types.VARCHAR },
			{ "NHANHIEU", Types.VARCHAR },
			{ "TRONGTAI", Types.VARCHAR },
			{ "NAMSANXUAT", Types.VARCHAR },
			{ "CUAKHAUXUATNHAP", Types.VARCHAR },
			{ "HINHTHUCHOATDONG", Types.VARCHAR },
			{ "LOAIHINHHOATDONG", Types.VARCHAR },
			{ "TUYENHOATDONG", Types.VARCHAR },
			{ "THOIGIANXINCAPPHEPTU", Types.TIMESTAMP },
			{ "THOIGIANXINCAPPHEPDEN", Types.TIMESTAMP },
			{ "SOKHUNG", Types.VARCHAR },
			{ "MAUSON", Types.VARCHAR },
			{ "SOMAY", Types.VARCHAR },
			{ "LOAIHANGVANCHUYEN", Types.VARCHAR },
			{ "THOIGIANDUKIENKHOIHANH", Types.TIMESTAMP },
			{ "NOIDUNGHOSOID", Types.BIGINT },
			{ "HOSOTHUTUCID", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table qlvt_phuongtiendangky_vl (ID LONG not null primary key,BIENSO VARCHAR(75) null,TENDANGKYSOHUU VARCHAR(75) null,NHANHIEU VARCHAR(75) null,TRONGTAI VARCHAR(75) null,NAMSANXUAT VARCHAR(75) null,CUAKHAUXUATNHAP VARCHAR(75) null,HINHTHUCHOATDONG VARCHAR(75) null,LOAIHINHHOATDONG VARCHAR(75) null,TUYENHOATDONG VARCHAR(75) null,THOIGIANXINCAPPHEPTU DATE null,THOIGIANXINCAPPHEPDEN DATE null,SOKHUNG VARCHAR(75) null,MAUSON VARCHAR(75) null,SOMAY VARCHAR(75) null,LOAIHANGVANCHUYEN VARCHAR(75) null,THOIGIANDUKIENKHOIHANH DATE null,NOIDUNGHOSOID LONG,HOSOTHUTUCID LONG)";
	public static final String TABLE_SQL_DROP = "drop table qlvt_phuongtiendangky_vl";
	public static final String ORDER_BY_JPQL = " ORDER BY qlvtPhuongTienDangKyVietLao.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY qlvt_phuongtiendangky_vl.ID ASC";
	public static final String DATA_SOURCE = "tthcDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietLao"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietLao"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietLao"),
			true);
	public static long NOIDUNGHOSOID_COLUMN_BITMASK = 1L;
	public static long ID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietLao"));

	public QlvtPhuongTienDangKyVietLaoModelImpl() {
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
	public Class<?> getModelClass() {
		return QlvtPhuongTienDangKyVietLao.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtPhuongTienDangKyVietLao.class.getName();
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
		_columnBitmask = -1L;

		_id = id;
	}

	@Override
	public String getBienSo() {
		if (_BienSo == null) {
			return StringPool.BLANK;
		}
		else {
			return _BienSo;
		}
	}

	@Override
	public void setBienSo(String BienSo) {
		_BienSo = BienSo;
	}

	@Override
	public String getTenDangKySoHuu() {
		if (_TenDangKySoHuu == null) {
			return StringPool.BLANK;
		}
		else {
			return _TenDangKySoHuu;
		}
	}

	@Override
	public void setTenDangKySoHuu(String TenDangKySoHuu) {
		_TenDangKySoHuu = TenDangKySoHuu;
	}

	@Override
	public String getNhanHieu() {
		if (_NhanHieu == null) {
			return StringPool.BLANK;
		}
		else {
			return _NhanHieu;
		}
	}

	@Override
	public void setNhanHieu(String NhanHieu) {
		_NhanHieu = NhanHieu;
	}

	@Override
	public String getTrongTai() {
		if (_TrongTai == null) {
			return StringPool.BLANK;
		}
		else {
			return _TrongTai;
		}
	}

	@Override
	public void setTrongTai(String TrongTai) {
		_TrongTai = TrongTai;
	}

	@Override
	public String getNamSanXuat() {
		if (_NamSanXuat == null) {
			return StringPool.BLANK;
		}
		else {
			return _NamSanXuat;
		}
	}

	@Override
	public void setNamSanXuat(String NamSanXuat) {
		_NamSanXuat = NamSanXuat;
	}

	@Override
	public String getCuaKhauXuatNhap() {
		if (_CuaKhauXuatNhap == null) {
			return StringPool.BLANK;
		}
		else {
			return _CuaKhauXuatNhap;
		}
	}

	@Override
	public void setCuaKhauXuatNhap(String CuaKhauXuatNhap) {
		_CuaKhauXuatNhap = CuaKhauXuatNhap;
	}

	@Override
	public String getHinhThucHoatDong() {
		if (_HinhThucHoatDong == null) {
			return StringPool.BLANK;
		}
		else {
			return _HinhThucHoatDong;
		}
	}

	@Override
	public void setHinhThucHoatDong(String HinhThucHoatDong) {
		_HinhThucHoatDong = HinhThucHoatDong;
	}

	@Override
	public String getLoaiHinhHoatDong() {
		if (_LoaiHinhHoatDong == null) {
			return StringPool.BLANK;
		}
		else {
			return _LoaiHinhHoatDong;
		}
	}

	@Override
	public void setLoaiHinhHoatDong(String LoaiHinhHoatDong) {
		_LoaiHinhHoatDong = LoaiHinhHoatDong;
	}

	@Override
	public String getTuyenHoatDong() {
		if (_TuyenHoatDong == null) {
			return StringPool.BLANK;
		}
		else {
			return _TuyenHoatDong;
		}
	}

	@Override
	public void setTuyenHoatDong(String TuyenHoatDong) {
		_TuyenHoatDong = TuyenHoatDong;
	}

	@Override
	public Date getThoiGianXinCapPhepTu() {
		return _ThoiGianXinCapPhepTu;
	}

	@Override
	public void setThoiGianXinCapPhepTu(Date ThoiGianXinCapPhepTu) {
		_ThoiGianXinCapPhepTu = ThoiGianXinCapPhepTu;
	}

	@Override
	public Date getThoiGianXinCapPhepDen() {
		return _ThoiGianXinCapPhepDen;
	}

	@Override
	public void setThoiGianXinCapPhepDen(Date ThoiGianXinCapPhepDen) {
		_ThoiGianXinCapPhepDen = ThoiGianXinCapPhepDen;
	}

	@Override
	public String getSoKhung() {
		if (_SoKhung == null) {
			return StringPool.BLANK;
		}
		else {
			return _SoKhung;
		}
	}

	@Override
	public void setSoKhung(String SoKhung) {
		_SoKhung = SoKhung;
	}

	@Override
	public String getMauSon() {
		if (_MauSon == null) {
			return StringPool.BLANK;
		}
		else {
			return _MauSon;
		}
	}

	@Override
	public void setMauSon(String MauSon) {
		_MauSon = MauSon;
	}

	@Override
	public String getSoMay() {
		if (_SoMay == null) {
			return StringPool.BLANK;
		}
		else {
			return _SoMay;
		}
	}

	@Override
	public void setSoMay(String SoMay) {
		_SoMay = SoMay;
	}

	@Override
	public String getLoaiHangVanChuyen() {
		if (_LoaiHangVanChuyen == null) {
			return StringPool.BLANK;
		}
		else {
			return _LoaiHangVanChuyen;
		}
	}

	@Override
	public void setLoaiHangVanChuyen(String LoaiHangVanChuyen) {
		_LoaiHangVanChuyen = LoaiHangVanChuyen;
	}

	@Override
	public Date getThoiGianDuKienKhoiHanh() {
		return _ThoiGianDuKienKhoiHanh;
	}

	@Override
	public void setThoiGianDuKienKhoiHanh(Date ThoiGianDuKienKhoiHanh) {
		_ThoiGianDuKienKhoiHanh = ThoiGianDuKienKhoiHanh;
	}

	@Override
	public long getNoiDungHoSoId() {
		return _NoiDungHoSoId;
	}

	@Override
	public void setNoiDungHoSoId(long NoiDungHoSoId) {
		_columnBitmask |= NOIDUNGHOSOID_COLUMN_BITMASK;

		if (!_setOriginalNoiDungHoSoId) {
			_setOriginalNoiDungHoSoId = true;

			_originalNoiDungHoSoId = _NoiDungHoSoId;
		}

		_NoiDungHoSoId = NoiDungHoSoId;
	}

	public long getOriginalNoiDungHoSoId() {
		return _originalNoiDungHoSoId;
	}

	@Override
	public long getHoSoThuTucId() {
		return _HoSoThuTucId;
	}

	@Override
	public void setHoSoThuTucId(long HoSoThuTucId) {
		_HoSoThuTucId = HoSoThuTucId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			QlvtPhuongTienDangKyVietLao.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public QlvtPhuongTienDangKyVietLao toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (QlvtPhuongTienDangKyVietLao)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		QlvtPhuongTienDangKyVietLaoImpl qlvtPhuongTienDangKyVietLaoImpl = new QlvtPhuongTienDangKyVietLaoImpl();

		qlvtPhuongTienDangKyVietLaoImpl.setId(getId());
		qlvtPhuongTienDangKyVietLaoImpl.setBienSo(getBienSo());
		qlvtPhuongTienDangKyVietLaoImpl.setTenDangKySoHuu(getTenDangKySoHuu());
		qlvtPhuongTienDangKyVietLaoImpl.setNhanHieu(getNhanHieu());
		qlvtPhuongTienDangKyVietLaoImpl.setTrongTai(getTrongTai());
		qlvtPhuongTienDangKyVietLaoImpl.setNamSanXuat(getNamSanXuat());
		qlvtPhuongTienDangKyVietLaoImpl.setCuaKhauXuatNhap(getCuaKhauXuatNhap());
		qlvtPhuongTienDangKyVietLaoImpl.setHinhThucHoatDong(getHinhThucHoatDong());
		qlvtPhuongTienDangKyVietLaoImpl.setLoaiHinhHoatDong(getLoaiHinhHoatDong());
		qlvtPhuongTienDangKyVietLaoImpl.setTuyenHoatDong(getTuyenHoatDong());
		qlvtPhuongTienDangKyVietLaoImpl.setThoiGianXinCapPhepTu(getThoiGianXinCapPhepTu());
		qlvtPhuongTienDangKyVietLaoImpl.setThoiGianXinCapPhepDen(getThoiGianXinCapPhepDen());
		qlvtPhuongTienDangKyVietLaoImpl.setSoKhung(getSoKhung());
		qlvtPhuongTienDangKyVietLaoImpl.setMauSon(getMauSon());
		qlvtPhuongTienDangKyVietLaoImpl.setSoMay(getSoMay());
		qlvtPhuongTienDangKyVietLaoImpl.setLoaiHangVanChuyen(getLoaiHangVanChuyen());
		qlvtPhuongTienDangKyVietLaoImpl.setThoiGianDuKienKhoiHanh(getThoiGianDuKienKhoiHanh());
		qlvtPhuongTienDangKyVietLaoImpl.setNoiDungHoSoId(getNoiDungHoSoId());
		qlvtPhuongTienDangKyVietLaoImpl.setHoSoThuTucId(getHoSoThuTucId());

		qlvtPhuongTienDangKyVietLaoImpl.resetOriginalValues();

		return qlvtPhuongTienDangKyVietLaoImpl;
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

		if (!(obj instanceof QlvtPhuongTienDangKyVietLao)) {
			return false;
		}

		QlvtPhuongTienDangKyVietLao qlvtPhuongTienDangKyVietLao = (QlvtPhuongTienDangKyVietLao)obj;

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
	public void resetOriginalValues() {
		QlvtPhuongTienDangKyVietLaoModelImpl qlvtPhuongTienDangKyVietLaoModelImpl =
			this;

		qlvtPhuongTienDangKyVietLaoModelImpl._originalNoiDungHoSoId = qlvtPhuongTienDangKyVietLaoModelImpl._NoiDungHoSoId;

		qlvtPhuongTienDangKyVietLaoModelImpl._setOriginalNoiDungHoSoId = false;

		qlvtPhuongTienDangKyVietLaoModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<QlvtPhuongTienDangKyVietLao> toCacheModel() {
		QlvtPhuongTienDangKyVietLaoCacheModel qlvtPhuongTienDangKyVietLaoCacheModel =
			new QlvtPhuongTienDangKyVietLaoCacheModel();

		qlvtPhuongTienDangKyVietLaoCacheModel.id = getId();

		qlvtPhuongTienDangKyVietLaoCacheModel.BienSo = getBienSo();

		String BienSo = qlvtPhuongTienDangKyVietLaoCacheModel.BienSo;

		if ((BienSo != null) && (BienSo.length() == 0)) {
			qlvtPhuongTienDangKyVietLaoCacheModel.BienSo = null;
		}

		qlvtPhuongTienDangKyVietLaoCacheModel.TenDangKySoHuu = getTenDangKySoHuu();

		String TenDangKySoHuu = qlvtPhuongTienDangKyVietLaoCacheModel.TenDangKySoHuu;

		if ((TenDangKySoHuu != null) && (TenDangKySoHuu.length() == 0)) {
			qlvtPhuongTienDangKyVietLaoCacheModel.TenDangKySoHuu = null;
		}

		qlvtPhuongTienDangKyVietLaoCacheModel.NhanHieu = getNhanHieu();

		String NhanHieu = qlvtPhuongTienDangKyVietLaoCacheModel.NhanHieu;

		if ((NhanHieu != null) && (NhanHieu.length() == 0)) {
			qlvtPhuongTienDangKyVietLaoCacheModel.NhanHieu = null;
		}

		qlvtPhuongTienDangKyVietLaoCacheModel.TrongTai = getTrongTai();

		String TrongTai = qlvtPhuongTienDangKyVietLaoCacheModel.TrongTai;

		if ((TrongTai != null) && (TrongTai.length() == 0)) {
			qlvtPhuongTienDangKyVietLaoCacheModel.TrongTai = null;
		}

		qlvtPhuongTienDangKyVietLaoCacheModel.NamSanXuat = getNamSanXuat();

		String NamSanXuat = qlvtPhuongTienDangKyVietLaoCacheModel.NamSanXuat;

		if ((NamSanXuat != null) && (NamSanXuat.length() == 0)) {
			qlvtPhuongTienDangKyVietLaoCacheModel.NamSanXuat = null;
		}

		qlvtPhuongTienDangKyVietLaoCacheModel.CuaKhauXuatNhap = getCuaKhauXuatNhap();

		String CuaKhauXuatNhap = qlvtPhuongTienDangKyVietLaoCacheModel.CuaKhauXuatNhap;

		if ((CuaKhauXuatNhap != null) && (CuaKhauXuatNhap.length() == 0)) {
			qlvtPhuongTienDangKyVietLaoCacheModel.CuaKhauXuatNhap = null;
		}

		qlvtPhuongTienDangKyVietLaoCacheModel.HinhThucHoatDong = getHinhThucHoatDong();

		String HinhThucHoatDong = qlvtPhuongTienDangKyVietLaoCacheModel.HinhThucHoatDong;

		if ((HinhThucHoatDong != null) && (HinhThucHoatDong.length() == 0)) {
			qlvtPhuongTienDangKyVietLaoCacheModel.HinhThucHoatDong = null;
		}

		qlvtPhuongTienDangKyVietLaoCacheModel.LoaiHinhHoatDong = getLoaiHinhHoatDong();

		String LoaiHinhHoatDong = qlvtPhuongTienDangKyVietLaoCacheModel.LoaiHinhHoatDong;

		if ((LoaiHinhHoatDong != null) && (LoaiHinhHoatDong.length() == 0)) {
			qlvtPhuongTienDangKyVietLaoCacheModel.LoaiHinhHoatDong = null;
		}

		qlvtPhuongTienDangKyVietLaoCacheModel.TuyenHoatDong = getTuyenHoatDong();

		String TuyenHoatDong = qlvtPhuongTienDangKyVietLaoCacheModel.TuyenHoatDong;

		if ((TuyenHoatDong != null) && (TuyenHoatDong.length() == 0)) {
			qlvtPhuongTienDangKyVietLaoCacheModel.TuyenHoatDong = null;
		}

		Date ThoiGianXinCapPhepTu = getThoiGianXinCapPhepTu();

		if (ThoiGianXinCapPhepTu != null) {
			qlvtPhuongTienDangKyVietLaoCacheModel.ThoiGianXinCapPhepTu = ThoiGianXinCapPhepTu.getTime();
		}
		else {
			qlvtPhuongTienDangKyVietLaoCacheModel.ThoiGianXinCapPhepTu = Long.MIN_VALUE;
		}

		Date ThoiGianXinCapPhepDen = getThoiGianXinCapPhepDen();

		if (ThoiGianXinCapPhepDen != null) {
			qlvtPhuongTienDangKyVietLaoCacheModel.ThoiGianXinCapPhepDen = ThoiGianXinCapPhepDen.getTime();
		}
		else {
			qlvtPhuongTienDangKyVietLaoCacheModel.ThoiGianXinCapPhepDen = Long.MIN_VALUE;
		}

		qlvtPhuongTienDangKyVietLaoCacheModel.SoKhung = getSoKhung();

		String SoKhung = qlvtPhuongTienDangKyVietLaoCacheModel.SoKhung;

		if ((SoKhung != null) && (SoKhung.length() == 0)) {
			qlvtPhuongTienDangKyVietLaoCacheModel.SoKhung = null;
		}

		qlvtPhuongTienDangKyVietLaoCacheModel.MauSon = getMauSon();

		String MauSon = qlvtPhuongTienDangKyVietLaoCacheModel.MauSon;

		if ((MauSon != null) && (MauSon.length() == 0)) {
			qlvtPhuongTienDangKyVietLaoCacheModel.MauSon = null;
		}

		qlvtPhuongTienDangKyVietLaoCacheModel.SoMay = getSoMay();

		String SoMay = qlvtPhuongTienDangKyVietLaoCacheModel.SoMay;

		if ((SoMay != null) && (SoMay.length() == 0)) {
			qlvtPhuongTienDangKyVietLaoCacheModel.SoMay = null;
		}

		qlvtPhuongTienDangKyVietLaoCacheModel.LoaiHangVanChuyen = getLoaiHangVanChuyen();

		String LoaiHangVanChuyen = qlvtPhuongTienDangKyVietLaoCacheModel.LoaiHangVanChuyen;

		if ((LoaiHangVanChuyen != null) && (LoaiHangVanChuyen.length() == 0)) {
			qlvtPhuongTienDangKyVietLaoCacheModel.LoaiHangVanChuyen = null;
		}

		Date ThoiGianDuKienKhoiHanh = getThoiGianDuKienKhoiHanh();

		if (ThoiGianDuKienKhoiHanh != null) {
			qlvtPhuongTienDangKyVietLaoCacheModel.ThoiGianDuKienKhoiHanh = ThoiGianDuKienKhoiHanh.getTime();
		}
		else {
			qlvtPhuongTienDangKyVietLaoCacheModel.ThoiGianDuKienKhoiHanh = Long.MIN_VALUE;
		}

		qlvtPhuongTienDangKyVietLaoCacheModel.NoiDungHoSoId = getNoiDungHoSoId();

		qlvtPhuongTienDangKyVietLaoCacheModel.HoSoThuTucId = getHoSoThuTucId();

		return qlvtPhuongTienDangKyVietLaoCacheModel;
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

	private static ClassLoader _classLoader = QlvtPhuongTienDangKyVietLao.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			QlvtPhuongTienDangKyVietLao.class
		};
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
	private long _originalNoiDungHoSoId;
	private boolean _setOriginalNoiDungHoSoId;
	private long _HoSoThuTucId;
	private long _columnBitmask;
	private QlvtPhuongTienDangKyVietLao _escapedModel;
}