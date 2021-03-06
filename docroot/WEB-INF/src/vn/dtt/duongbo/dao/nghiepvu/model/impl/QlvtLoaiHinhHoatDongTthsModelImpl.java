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

package vn.dtt.duongbo.dao.nghiepvu.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTthsModel;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTthsSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the QlvtLoaiHinhHoatDongTths service. Represents a row in the &quot;QLVT_LOAIHINHHOATDONG_TTHS&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTthsModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link QlvtLoaiHinhHoatDongTthsImpl}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtLoaiHinhHoatDongTthsImpl
 * @see vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths
 * @see vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTthsModel
 * @generated
 */
@JSON(strict = true)
public class QlvtLoaiHinhHoatDongTthsModelImpl extends BaseModelImpl<QlvtLoaiHinhHoatDongTths>
	implements QlvtLoaiHinhHoatDongTthsModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a qlvt loai hinh hoat dong tths model instance should use the {@link vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths} interface instead.
	 */
	public static final String TABLE_NAME = "QLVT_LOAIHINHHOATDONG_TTHS";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.BIGINT },
			{ "MALOAIHINHHOATDONG", Types.VARCHAR },
			{ "THONGTINHOSOID", Types.BIGINT },
			{ "SOLUONGPHUONGTIEN", Types.INTEGER },
			{ "THIETBIGIAMSATHANHTRINH", Types.INTEGER },
			{ "TUYENTU", Types.VARCHAR },
			{ "TUYENDEN", Types.VARCHAR },
			{ "SOCHUYEN", Types.BIGINT },
			{ "MAUSON", Types.VARCHAR },
			{ "LOAIHINHKINHDOANHCUTHE", Types.VARCHAR },
			{ "DANHGIA", Types.INTEGER },
			{ "LYDOKHONGDAT", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table QLVT_LOAIHINHHOATDONG_TTHS (ID LONG not null primary key,MALOAIHINHHOATDONG VARCHAR(75) null,THONGTINHOSOID LONG,SOLUONGPHUONGTIEN INTEGER,THIETBIGIAMSATHANHTRINH INTEGER,TUYENTU VARCHAR(75) null,TUYENDEN VARCHAR(75) null,SOCHUYEN LONG,MAUSON VARCHAR(75) null,LOAIHINHKINHDOANHCUTHE VARCHAR(75) null,DANHGIA INTEGER,LYDOKHONGDAT VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table QLVT_LOAIHINHHOATDONG_TTHS";
	public static final String ORDER_BY_JPQL = " ORDER BY qlvtLoaiHinhHoatDongTths.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY QLVT_LOAIHINHHOATDONG_TTHS.ID ASC";
	public static final String DATA_SOURCE = "nghiepvuDataSource";
	public static final String SESSION_FACTORY = "nghiepvuSessionFactory";
	public static final String TX_MANAGER = "nghiepvuTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths"),
			true);
	public static long THONGTINHOSOID_COLUMN_BITMASK = 1L;
	public static long ID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static QlvtLoaiHinhHoatDongTths toModel(
		QlvtLoaiHinhHoatDongTthsSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		QlvtLoaiHinhHoatDongTths model = new QlvtLoaiHinhHoatDongTthsImpl();

		model.setId(soapModel.getId());
		model.setMaLoaiHinhHoatDong(soapModel.getMaLoaiHinhHoatDong());
		model.setThongTinHoSoId(soapModel.getThongTinHoSoId());
		model.setSoLuongPhuongTien(soapModel.getSoLuongPhuongTien());
		model.setThietBiGiamSatHanhTrinh(soapModel.getThietBiGiamSatHanhTrinh());
		model.setTuyenTu(soapModel.getTuyenTu());
		model.setTuyenDen(soapModel.getTuyenDen());
		model.setSoChuyen(soapModel.getSoChuyen());
		model.setMauSon(soapModel.getMauSon());
		model.setLoaiHinhKinhDoanhCuThe(soapModel.getLoaiHinhKinhDoanhCuThe());
		model.setDanhGia(soapModel.getDanhGia());
		model.setLyDoKhongDat(soapModel.getLyDoKhongDat());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<QlvtLoaiHinhHoatDongTths> toModels(
		QlvtLoaiHinhHoatDongTthsSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<QlvtLoaiHinhHoatDongTths> models = new ArrayList<QlvtLoaiHinhHoatDongTths>(soapModels.length);

		for (QlvtLoaiHinhHoatDongTthsSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths"));

	public QlvtLoaiHinhHoatDongTthsModelImpl() {
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
		return QlvtLoaiHinhHoatDongTths.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtLoaiHinhHoatDongTths.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("maLoaiHinhHoatDong", getMaLoaiHinhHoatDong());
		attributes.put("thongTinHoSoId", getThongTinHoSoId());
		attributes.put("soLuongPhuongTien", getSoLuongPhuongTien());
		attributes.put("thietBiGiamSatHanhTrinh", getThietBiGiamSatHanhTrinh());
		attributes.put("tuyenTu", getTuyenTu());
		attributes.put("tuyenDen", getTuyenDen());
		attributes.put("soChuyen", getSoChuyen());
		attributes.put("mauSon", getMauSon());
		attributes.put("loaiHinhKinhDoanhCuThe", getLoaiHinhKinhDoanhCuThe());
		attributes.put("danhGia", getDanhGia());
		attributes.put("lyDoKhongDat", getLyDoKhongDat());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String maLoaiHinhHoatDong = (String)attributes.get("maLoaiHinhHoatDong");

		if (maLoaiHinhHoatDong != null) {
			setMaLoaiHinhHoatDong(maLoaiHinhHoatDong);
		}

		Long thongTinHoSoId = (Long)attributes.get("thongTinHoSoId");

		if (thongTinHoSoId != null) {
			setThongTinHoSoId(thongTinHoSoId);
		}

		Integer soLuongPhuongTien = (Integer)attributes.get("soLuongPhuongTien");

		if (soLuongPhuongTien != null) {
			setSoLuongPhuongTien(soLuongPhuongTien);
		}

		Integer thietBiGiamSatHanhTrinh = (Integer)attributes.get(
				"thietBiGiamSatHanhTrinh");

		if (thietBiGiamSatHanhTrinh != null) {
			setThietBiGiamSatHanhTrinh(thietBiGiamSatHanhTrinh);
		}

		String tuyenTu = (String)attributes.get("tuyenTu");

		if (tuyenTu != null) {
			setTuyenTu(tuyenTu);
		}

		String tuyenDen = (String)attributes.get("tuyenDen");

		if (tuyenDen != null) {
			setTuyenDen(tuyenDen);
		}

		Long soChuyen = (Long)attributes.get("soChuyen");

		if (soChuyen != null) {
			setSoChuyen(soChuyen);
		}

		String mauSon = (String)attributes.get("mauSon");

		if (mauSon != null) {
			setMauSon(mauSon);
		}

		String loaiHinhKinhDoanhCuThe = (String)attributes.get(
				"loaiHinhKinhDoanhCuThe");

		if (loaiHinhKinhDoanhCuThe != null) {
			setLoaiHinhKinhDoanhCuThe(loaiHinhKinhDoanhCuThe);
		}

		Integer danhGia = (Integer)attributes.get("danhGia");

		if (danhGia != null) {
			setDanhGia(danhGia);
		}

		String lyDoKhongDat = (String)attributes.get("lyDoKhongDat");

		if (lyDoKhongDat != null) {
			setLyDoKhongDat(lyDoKhongDat);
		}
	}

	@JSON
	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_columnBitmask = -1L;

		_id = id;
	}

	@JSON
	@Override
	public String getMaLoaiHinhHoatDong() {
		if (_maLoaiHinhHoatDong == null) {
			return StringPool.BLANK;
		}
		else {
			return _maLoaiHinhHoatDong;
		}
	}

	@Override
	public void setMaLoaiHinhHoatDong(String maLoaiHinhHoatDong) {
		_maLoaiHinhHoatDong = maLoaiHinhHoatDong;
	}

	@JSON
	@Override
	public long getThongTinHoSoId() {
		return _thongTinHoSoId;
	}

	@Override
	public void setThongTinHoSoId(long thongTinHoSoId) {
		_columnBitmask |= THONGTINHOSOID_COLUMN_BITMASK;

		if (!_setOriginalThongTinHoSoId) {
			_setOriginalThongTinHoSoId = true;

			_originalThongTinHoSoId = _thongTinHoSoId;
		}

		_thongTinHoSoId = thongTinHoSoId;
	}

	public long getOriginalThongTinHoSoId() {
		return _originalThongTinHoSoId;
	}

	@JSON
	@Override
	public int getSoLuongPhuongTien() {
		return _soLuongPhuongTien;
	}

	@Override
	public void setSoLuongPhuongTien(int soLuongPhuongTien) {
		_soLuongPhuongTien = soLuongPhuongTien;
	}

	@JSON
	@Override
	public int getThietBiGiamSatHanhTrinh() {
		return _thietBiGiamSatHanhTrinh;
	}

	@Override
	public void setThietBiGiamSatHanhTrinh(int thietBiGiamSatHanhTrinh) {
		_thietBiGiamSatHanhTrinh = thietBiGiamSatHanhTrinh;
	}

	@JSON
	@Override
	public String getTuyenTu() {
		if (_tuyenTu == null) {
			return StringPool.BLANK;
		}
		else {
			return _tuyenTu;
		}
	}

	@Override
	public void setTuyenTu(String tuyenTu) {
		_tuyenTu = tuyenTu;
	}

	@JSON
	@Override
	public String getTuyenDen() {
		if (_tuyenDen == null) {
			return StringPool.BLANK;
		}
		else {
			return _tuyenDen;
		}
	}

	@Override
	public void setTuyenDen(String tuyenDen) {
		_tuyenDen = tuyenDen;
	}

	@JSON
	@Override
	public long getSoChuyen() {
		return _soChuyen;
	}

	@Override
	public void setSoChuyen(long soChuyen) {
		_soChuyen = soChuyen;
	}

	@JSON
	@Override
	public String getMauSon() {
		if (_mauSon == null) {
			return StringPool.BLANK;
		}
		else {
			return _mauSon;
		}
	}

	@Override
	public void setMauSon(String mauSon) {
		_mauSon = mauSon;
	}

	@JSON
	@Override
	public String getLoaiHinhKinhDoanhCuThe() {
		if (_loaiHinhKinhDoanhCuThe == null) {
			return StringPool.BLANK;
		}
		else {
			return _loaiHinhKinhDoanhCuThe;
		}
	}

	@Override
	public void setLoaiHinhKinhDoanhCuThe(String loaiHinhKinhDoanhCuThe) {
		_loaiHinhKinhDoanhCuThe = loaiHinhKinhDoanhCuThe;
	}

	@JSON
	@Override
	public int getDanhGia() {
		return _danhGia;
	}

	@Override
	public void setDanhGia(int danhGia) {
		_danhGia = danhGia;
	}

	@JSON
	@Override
	public String getLyDoKhongDat() {
		if (_lyDoKhongDat == null) {
			return StringPool.BLANK;
		}
		else {
			return _lyDoKhongDat;
		}
	}

	@Override
	public void setLyDoKhongDat(String lyDoKhongDat) {
		_lyDoKhongDat = lyDoKhongDat;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			QlvtLoaiHinhHoatDongTths.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public QlvtLoaiHinhHoatDongTths toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (QlvtLoaiHinhHoatDongTths)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		QlvtLoaiHinhHoatDongTthsImpl qlvtLoaiHinhHoatDongTthsImpl = new QlvtLoaiHinhHoatDongTthsImpl();

		qlvtLoaiHinhHoatDongTthsImpl.setId(getId());
		qlvtLoaiHinhHoatDongTthsImpl.setMaLoaiHinhHoatDong(getMaLoaiHinhHoatDong());
		qlvtLoaiHinhHoatDongTthsImpl.setThongTinHoSoId(getThongTinHoSoId());
		qlvtLoaiHinhHoatDongTthsImpl.setSoLuongPhuongTien(getSoLuongPhuongTien());
		qlvtLoaiHinhHoatDongTthsImpl.setThietBiGiamSatHanhTrinh(getThietBiGiamSatHanhTrinh());
		qlvtLoaiHinhHoatDongTthsImpl.setTuyenTu(getTuyenTu());
		qlvtLoaiHinhHoatDongTthsImpl.setTuyenDen(getTuyenDen());
		qlvtLoaiHinhHoatDongTthsImpl.setSoChuyen(getSoChuyen());
		qlvtLoaiHinhHoatDongTthsImpl.setMauSon(getMauSon());
		qlvtLoaiHinhHoatDongTthsImpl.setLoaiHinhKinhDoanhCuThe(getLoaiHinhKinhDoanhCuThe());
		qlvtLoaiHinhHoatDongTthsImpl.setDanhGia(getDanhGia());
		qlvtLoaiHinhHoatDongTthsImpl.setLyDoKhongDat(getLyDoKhongDat());

		qlvtLoaiHinhHoatDongTthsImpl.resetOriginalValues();

		return qlvtLoaiHinhHoatDongTthsImpl;
	}

	@Override
	public int compareTo(QlvtLoaiHinhHoatDongTths qlvtLoaiHinhHoatDongTths) {
		int value = 0;

		if (getId() < qlvtLoaiHinhHoatDongTths.getId()) {
			value = -1;
		}
		else if (getId() > qlvtLoaiHinhHoatDongTths.getId()) {
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

		if (!(obj instanceof QlvtLoaiHinhHoatDongTths)) {
			return false;
		}

		QlvtLoaiHinhHoatDongTths qlvtLoaiHinhHoatDongTths = (QlvtLoaiHinhHoatDongTths)obj;

		long primaryKey = qlvtLoaiHinhHoatDongTths.getPrimaryKey();

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
		QlvtLoaiHinhHoatDongTthsModelImpl qlvtLoaiHinhHoatDongTthsModelImpl = this;

		qlvtLoaiHinhHoatDongTthsModelImpl._originalThongTinHoSoId = qlvtLoaiHinhHoatDongTthsModelImpl._thongTinHoSoId;

		qlvtLoaiHinhHoatDongTthsModelImpl._setOriginalThongTinHoSoId = false;

		qlvtLoaiHinhHoatDongTthsModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<QlvtLoaiHinhHoatDongTths> toCacheModel() {
		QlvtLoaiHinhHoatDongTthsCacheModel qlvtLoaiHinhHoatDongTthsCacheModel = new QlvtLoaiHinhHoatDongTthsCacheModel();

		qlvtLoaiHinhHoatDongTthsCacheModel.id = getId();

		qlvtLoaiHinhHoatDongTthsCacheModel.maLoaiHinhHoatDong = getMaLoaiHinhHoatDong();

		String maLoaiHinhHoatDong = qlvtLoaiHinhHoatDongTthsCacheModel.maLoaiHinhHoatDong;

		if ((maLoaiHinhHoatDong != null) && (maLoaiHinhHoatDong.length() == 0)) {
			qlvtLoaiHinhHoatDongTthsCacheModel.maLoaiHinhHoatDong = null;
		}

		qlvtLoaiHinhHoatDongTthsCacheModel.thongTinHoSoId = getThongTinHoSoId();

		qlvtLoaiHinhHoatDongTthsCacheModel.soLuongPhuongTien = getSoLuongPhuongTien();

		qlvtLoaiHinhHoatDongTthsCacheModel.thietBiGiamSatHanhTrinh = getThietBiGiamSatHanhTrinh();

		qlvtLoaiHinhHoatDongTthsCacheModel.tuyenTu = getTuyenTu();

		String tuyenTu = qlvtLoaiHinhHoatDongTthsCacheModel.tuyenTu;

		if ((tuyenTu != null) && (tuyenTu.length() == 0)) {
			qlvtLoaiHinhHoatDongTthsCacheModel.tuyenTu = null;
		}

		qlvtLoaiHinhHoatDongTthsCacheModel.tuyenDen = getTuyenDen();

		String tuyenDen = qlvtLoaiHinhHoatDongTthsCacheModel.tuyenDen;

		if ((tuyenDen != null) && (tuyenDen.length() == 0)) {
			qlvtLoaiHinhHoatDongTthsCacheModel.tuyenDen = null;
		}

		qlvtLoaiHinhHoatDongTthsCacheModel.soChuyen = getSoChuyen();

		qlvtLoaiHinhHoatDongTthsCacheModel.mauSon = getMauSon();

		String mauSon = qlvtLoaiHinhHoatDongTthsCacheModel.mauSon;

		if ((mauSon != null) && (mauSon.length() == 0)) {
			qlvtLoaiHinhHoatDongTthsCacheModel.mauSon = null;
		}

		qlvtLoaiHinhHoatDongTthsCacheModel.loaiHinhKinhDoanhCuThe = getLoaiHinhKinhDoanhCuThe();

		String loaiHinhKinhDoanhCuThe = qlvtLoaiHinhHoatDongTthsCacheModel.loaiHinhKinhDoanhCuThe;

		if ((loaiHinhKinhDoanhCuThe != null) &&
				(loaiHinhKinhDoanhCuThe.length() == 0)) {
			qlvtLoaiHinhHoatDongTthsCacheModel.loaiHinhKinhDoanhCuThe = null;
		}

		qlvtLoaiHinhHoatDongTthsCacheModel.danhGia = getDanhGia();

		qlvtLoaiHinhHoatDongTthsCacheModel.lyDoKhongDat = getLyDoKhongDat();

		String lyDoKhongDat = qlvtLoaiHinhHoatDongTthsCacheModel.lyDoKhongDat;

		if ((lyDoKhongDat != null) && (lyDoKhongDat.length() == 0)) {
			qlvtLoaiHinhHoatDongTthsCacheModel.lyDoKhongDat = null;
		}

		return qlvtLoaiHinhHoatDongTthsCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", maLoaiHinhHoatDong=");
		sb.append(getMaLoaiHinhHoatDong());
		sb.append(", thongTinHoSoId=");
		sb.append(getThongTinHoSoId());
		sb.append(", soLuongPhuongTien=");
		sb.append(getSoLuongPhuongTien());
		sb.append(", thietBiGiamSatHanhTrinh=");
		sb.append(getThietBiGiamSatHanhTrinh());
		sb.append(", tuyenTu=");
		sb.append(getTuyenTu());
		sb.append(", tuyenDen=");
		sb.append(getTuyenDen());
		sb.append(", soChuyen=");
		sb.append(getSoChuyen());
		sb.append(", mauSon=");
		sb.append(getMauSon());
		sb.append(", loaiHinhKinhDoanhCuThe=");
		sb.append(getLoaiHinhKinhDoanhCuThe());
		sb.append(", danhGia=");
		sb.append(getDanhGia());
		sb.append(", lyDoKhongDat=");
		sb.append(getLyDoKhongDat());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maLoaiHinhHoatDong</column-name><column-value><![CDATA[");
		sb.append(getMaLoaiHinhHoatDong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thongTinHoSoId</column-name><column-value><![CDATA[");
		sb.append(getThongTinHoSoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soLuongPhuongTien</column-name><column-value><![CDATA[");
		sb.append(getSoLuongPhuongTien());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thietBiGiamSatHanhTrinh</column-name><column-value><![CDATA[");
		sb.append(getThietBiGiamSatHanhTrinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tuyenTu</column-name><column-value><![CDATA[");
		sb.append(getTuyenTu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tuyenDen</column-name><column-value><![CDATA[");
		sb.append(getTuyenDen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soChuyen</column-name><column-value><![CDATA[");
		sb.append(getSoChuyen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mauSon</column-name><column-value><![CDATA[");
		sb.append(getMauSon());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiHinhKinhDoanhCuThe</column-name><column-value><![CDATA[");
		sb.append(getLoaiHinhKinhDoanhCuThe());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>danhGia</column-name><column-value><![CDATA[");
		sb.append(getDanhGia());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lyDoKhongDat</column-name><column-value><![CDATA[");
		sb.append(getLyDoKhongDat());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = QlvtLoaiHinhHoatDongTths.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			QlvtLoaiHinhHoatDongTths.class
		};
	private long _id;
	private String _maLoaiHinhHoatDong;
	private long _thongTinHoSoId;
	private long _originalThongTinHoSoId;
	private boolean _setOriginalThongTinHoSoId;
	private int _soLuongPhuongTien;
	private int _thietBiGiamSatHanhTrinh;
	private String _tuyenTu;
	private String _tuyenDen;
	private long _soChuyen;
	private String _mauSon;
	private String _loaiHinhKinhDoanhCuThe;
	private int _danhGia;
	private String _lyDoKhongDat;
	private long _columnBitmask;
	private QlvtLoaiHinhHoatDongTths _escapedModel;
}