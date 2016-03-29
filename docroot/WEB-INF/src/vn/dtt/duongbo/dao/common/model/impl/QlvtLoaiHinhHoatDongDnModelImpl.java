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

import vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn;
import vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDnModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the QlvtLoaiHinhHoatDongDn service. Represents a row in the &quot;qlvt_loaihinhhoatdong&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDnModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link QlvtLoaiHinhHoatDongDnImpl}.
 * </p>
 *
 * @author win_64
 * @see QlvtLoaiHinhHoatDongDnImpl
 * @see vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn
 * @see vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDnModel
 * @generated
 */
public class QlvtLoaiHinhHoatDongDnModelImpl extends BaseModelImpl<QlvtLoaiHinhHoatDongDn>
	implements QlvtLoaiHinhHoatDongDnModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a qlvt loai hinh hoat dong dn model instance should use the {@link vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn} interface instead.
	 */
	public static final String TABLE_NAME = "qlvt_loaihinhhoatdong";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "HOSOTHUTUCID", Types.BIGINT },
			{ "NOIDUNGHOSOID", Types.BIGINT },
			{ "MALOAIHINHHOATDONG", Types.VARCHAR },
			{ "MAMAUSON", Types.VARCHAR },
			{ "MAPHAMVIHOATDONG", Types.VARCHAR },
			{ "SOLUONGPHUONGTIEN", Types.VARCHAR },
			{ "THIETBIGIAMSATHANHTRINH", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table qlvt_loaihinhhoatdong (id LONG not null primary key,HOSOTHUTUCID LONG,NOIDUNGHOSOID LONG,MALOAIHINHHOATDONG VARCHAR(75) null,MAMAUSON VARCHAR(75) null,MAPHAMVIHOATDONG VARCHAR(75) null,SOLUONGPHUONGTIEN VARCHAR(75) null,THIETBIGIAMSATHANHTRINH VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table qlvt_loaihinhhoatdong";
	public static final String ORDER_BY_JPQL = " ORDER BY qlvtLoaiHinhHoatDongDn.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY qlvt_loaihinhhoatdong.id ASC";
	public static final String DATA_SOURCE = "tthcDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn"),
			true);
	public static long HOSOTHUTUCID_COLUMN_BITMASK = 1L;
	public static long MALOAIHINHHOATDONG_COLUMN_BITMASK = 2L;
	public static long NOIDUNGHOSOID_COLUMN_BITMASK = 4L;
	public static long ID_COLUMN_BITMASK = 8L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn"));

	public QlvtLoaiHinhHoatDongDnModelImpl() {
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
		return QlvtLoaiHinhHoatDongDn.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtLoaiHinhHoatDongDn.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("hoSoThuTucId", getHoSoThuTucId());
		attributes.put("noiDungHoSoId", getNoiDungHoSoId());
		attributes.put("maLoaiHinhHoatDong", getMaLoaiHinhHoatDong());
		attributes.put("maMauSon", getMaMauSon());
		attributes.put("maPhamViHoatDong", getMaPhamViHoatDong());
		attributes.put("soLuongPhuongTien", getSoLuongPhuongTien());
		attributes.put("thietBiGiamSatHanhTrinh", getThietBiGiamSatHanhTrinh());

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

		Long noiDungHoSoId = (Long)attributes.get("noiDungHoSoId");

		if (noiDungHoSoId != null) {
			setNoiDungHoSoId(noiDungHoSoId);
		}

		String maLoaiHinhHoatDong = (String)attributes.get("maLoaiHinhHoatDong");

		if (maLoaiHinhHoatDong != null) {
			setMaLoaiHinhHoatDong(maLoaiHinhHoatDong);
		}

		String maMauSon = (String)attributes.get("maMauSon");

		if (maMauSon != null) {
			setMaMauSon(maMauSon);
		}

		String maPhamViHoatDong = (String)attributes.get("maPhamViHoatDong");

		if (maPhamViHoatDong != null) {
			setMaPhamViHoatDong(maPhamViHoatDong);
		}

		String soLuongPhuongTien = (String)attributes.get("soLuongPhuongTien");

		if (soLuongPhuongTien != null) {
			setSoLuongPhuongTien(soLuongPhuongTien);
		}

		String thietBiGiamSatHanhTrinh = (String)attributes.get(
				"thietBiGiamSatHanhTrinh");

		if (thietBiGiamSatHanhTrinh != null) {
			setThietBiGiamSatHanhTrinh(thietBiGiamSatHanhTrinh);
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
	public long getHoSoThuTucId() {
		return _hoSoThuTucId;
	}

	@Override
	public void setHoSoThuTucId(long hoSoThuTucId) {
		_columnBitmask |= HOSOTHUTUCID_COLUMN_BITMASK;

		if (!_setOriginalHoSoThuTucId) {
			_setOriginalHoSoThuTucId = true;

			_originalHoSoThuTucId = _hoSoThuTucId;
		}

		_hoSoThuTucId = hoSoThuTucId;
	}

	public long getOriginalHoSoThuTucId() {
		return _originalHoSoThuTucId;
	}

	@Override
	public long getNoiDungHoSoId() {
		return _noiDungHoSoId;
	}

	@Override
	public void setNoiDungHoSoId(long noiDungHoSoId) {
		_columnBitmask |= NOIDUNGHOSOID_COLUMN_BITMASK;

		if (!_setOriginalNoiDungHoSoId) {
			_setOriginalNoiDungHoSoId = true;

			_originalNoiDungHoSoId = _noiDungHoSoId;
		}

		_noiDungHoSoId = noiDungHoSoId;
	}

	public long getOriginalNoiDungHoSoId() {
		return _originalNoiDungHoSoId;
	}

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
		_columnBitmask |= MALOAIHINHHOATDONG_COLUMN_BITMASK;

		if (_originalMaLoaiHinhHoatDong == null) {
			_originalMaLoaiHinhHoatDong = _maLoaiHinhHoatDong;
		}

		_maLoaiHinhHoatDong = maLoaiHinhHoatDong;
	}

	public String getOriginalMaLoaiHinhHoatDong() {
		return GetterUtil.getString(_originalMaLoaiHinhHoatDong);
	}

	@Override
	public String getMaMauSon() {
		if (_maMauSon == null) {
			return StringPool.BLANK;
		}
		else {
			return _maMauSon;
		}
	}

	@Override
	public void setMaMauSon(String maMauSon) {
		_maMauSon = maMauSon;
	}

	@Override
	public String getMaPhamViHoatDong() {
		if (_maPhamViHoatDong == null) {
			return StringPool.BLANK;
		}
		else {
			return _maPhamViHoatDong;
		}
	}

	@Override
	public void setMaPhamViHoatDong(String maPhamViHoatDong) {
		_maPhamViHoatDong = maPhamViHoatDong;
	}

	@Override
	public String getSoLuongPhuongTien() {
		if (_soLuongPhuongTien == null) {
			return StringPool.BLANK;
		}
		else {
			return _soLuongPhuongTien;
		}
	}

	@Override
	public void setSoLuongPhuongTien(String soLuongPhuongTien) {
		_soLuongPhuongTien = soLuongPhuongTien;
	}

	@Override
	public String getThietBiGiamSatHanhTrinh() {
		if (_thietBiGiamSatHanhTrinh == null) {
			return StringPool.BLANK;
		}
		else {
			return _thietBiGiamSatHanhTrinh;
		}
	}

	@Override
	public void setThietBiGiamSatHanhTrinh(String thietBiGiamSatHanhTrinh) {
		_thietBiGiamSatHanhTrinh = thietBiGiamSatHanhTrinh;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			QlvtLoaiHinhHoatDongDn.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public QlvtLoaiHinhHoatDongDn toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (QlvtLoaiHinhHoatDongDn)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		QlvtLoaiHinhHoatDongDnImpl qlvtLoaiHinhHoatDongDnImpl = new QlvtLoaiHinhHoatDongDnImpl();

		qlvtLoaiHinhHoatDongDnImpl.setId(getId());
		qlvtLoaiHinhHoatDongDnImpl.setHoSoThuTucId(getHoSoThuTucId());
		qlvtLoaiHinhHoatDongDnImpl.setNoiDungHoSoId(getNoiDungHoSoId());
		qlvtLoaiHinhHoatDongDnImpl.setMaLoaiHinhHoatDong(getMaLoaiHinhHoatDong());
		qlvtLoaiHinhHoatDongDnImpl.setMaMauSon(getMaMauSon());
		qlvtLoaiHinhHoatDongDnImpl.setMaPhamViHoatDong(getMaPhamViHoatDong());
		qlvtLoaiHinhHoatDongDnImpl.setSoLuongPhuongTien(getSoLuongPhuongTien());
		qlvtLoaiHinhHoatDongDnImpl.setThietBiGiamSatHanhTrinh(getThietBiGiamSatHanhTrinh());

		qlvtLoaiHinhHoatDongDnImpl.resetOriginalValues();

		return qlvtLoaiHinhHoatDongDnImpl;
	}

	@Override
	public int compareTo(QlvtLoaiHinhHoatDongDn qlvtLoaiHinhHoatDongDn) {
		int value = 0;

		if (getId() < qlvtLoaiHinhHoatDongDn.getId()) {
			value = -1;
		}
		else if (getId() > qlvtLoaiHinhHoatDongDn.getId()) {
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

		if (!(obj instanceof QlvtLoaiHinhHoatDongDn)) {
			return false;
		}

		QlvtLoaiHinhHoatDongDn qlvtLoaiHinhHoatDongDn = (QlvtLoaiHinhHoatDongDn)obj;

		long primaryKey = qlvtLoaiHinhHoatDongDn.getPrimaryKey();

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
		QlvtLoaiHinhHoatDongDnModelImpl qlvtLoaiHinhHoatDongDnModelImpl = this;

		qlvtLoaiHinhHoatDongDnModelImpl._originalHoSoThuTucId = qlvtLoaiHinhHoatDongDnModelImpl._hoSoThuTucId;

		qlvtLoaiHinhHoatDongDnModelImpl._setOriginalHoSoThuTucId = false;

		qlvtLoaiHinhHoatDongDnModelImpl._originalNoiDungHoSoId = qlvtLoaiHinhHoatDongDnModelImpl._noiDungHoSoId;

		qlvtLoaiHinhHoatDongDnModelImpl._setOriginalNoiDungHoSoId = false;

		qlvtLoaiHinhHoatDongDnModelImpl._originalMaLoaiHinhHoatDong = qlvtLoaiHinhHoatDongDnModelImpl._maLoaiHinhHoatDong;

		qlvtLoaiHinhHoatDongDnModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<QlvtLoaiHinhHoatDongDn> toCacheModel() {
		QlvtLoaiHinhHoatDongDnCacheModel qlvtLoaiHinhHoatDongDnCacheModel = new QlvtLoaiHinhHoatDongDnCacheModel();

		qlvtLoaiHinhHoatDongDnCacheModel.id = getId();

		qlvtLoaiHinhHoatDongDnCacheModel.hoSoThuTucId = getHoSoThuTucId();

		qlvtLoaiHinhHoatDongDnCacheModel.noiDungHoSoId = getNoiDungHoSoId();

		qlvtLoaiHinhHoatDongDnCacheModel.maLoaiHinhHoatDong = getMaLoaiHinhHoatDong();

		String maLoaiHinhHoatDong = qlvtLoaiHinhHoatDongDnCacheModel.maLoaiHinhHoatDong;

		if ((maLoaiHinhHoatDong != null) && (maLoaiHinhHoatDong.length() == 0)) {
			qlvtLoaiHinhHoatDongDnCacheModel.maLoaiHinhHoatDong = null;
		}

		qlvtLoaiHinhHoatDongDnCacheModel.maMauSon = getMaMauSon();

		String maMauSon = qlvtLoaiHinhHoatDongDnCacheModel.maMauSon;

		if ((maMauSon != null) && (maMauSon.length() == 0)) {
			qlvtLoaiHinhHoatDongDnCacheModel.maMauSon = null;
		}

		qlvtLoaiHinhHoatDongDnCacheModel.maPhamViHoatDong = getMaPhamViHoatDong();

		String maPhamViHoatDong = qlvtLoaiHinhHoatDongDnCacheModel.maPhamViHoatDong;

		if ((maPhamViHoatDong != null) && (maPhamViHoatDong.length() == 0)) {
			qlvtLoaiHinhHoatDongDnCacheModel.maPhamViHoatDong = null;
		}

		qlvtLoaiHinhHoatDongDnCacheModel.soLuongPhuongTien = getSoLuongPhuongTien();

		String soLuongPhuongTien = qlvtLoaiHinhHoatDongDnCacheModel.soLuongPhuongTien;

		if ((soLuongPhuongTien != null) && (soLuongPhuongTien.length() == 0)) {
			qlvtLoaiHinhHoatDongDnCacheModel.soLuongPhuongTien = null;
		}

		qlvtLoaiHinhHoatDongDnCacheModel.thietBiGiamSatHanhTrinh = getThietBiGiamSatHanhTrinh();

		String thietBiGiamSatHanhTrinh = qlvtLoaiHinhHoatDongDnCacheModel.thietBiGiamSatHanhTrinh;

		if ((thietBiGiamSatHanhTrinh != null) &&
				(thietBiGiamSatHanhTrinh.length() == 0)) {
			qlvtLoaiHinhHoatDongDnCacheModel.thietBiGiamSatHanhTrinh = null;
		}

		return qlvtLoaiHinhHoatDongDnCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", hoSoThuTucId=");
		sb.append(getHoSoThuTucId());
		sb.append(", noiDungHoSoId=");
		sb.append(getNoiDungHoSoId());
		sb.append(", maLoaiHinhHoatDong=");
		sb.append(getMaLoaiHinhHoatDong());
		sb.append(", maMauSon=");
		sb.append(getMaMauSon());
		sb.append(", maPhamViHoatDong=");
		sb.append(getMaPhamViHoatDong());
		sb.append(", soLuongPhuongTien=");
		sb.append(getSoLuongPhuongTien());
		sb.append(", thietBiGiamSatHanhTrinh=");
		sb.append(getThietBiGiamSatHanhTrinh());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn");
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
			"<column><column-name>noiDungHoSoId</column-name><column-value><![CDATA[");
		sb.append(getNoiDungHoSoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maLoaiHinhHoatDong</column-name><column-value><![CDATA[");
		sb.append(getMaLoaiHinhHoatDong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maMauSon</column-name><column-value><![CDATA[");
		sb.append(getMaMauSon());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maPhamViHoatDong</column-name><column-value><![CDATA[");
		sb.append(getMaPhamViHoatDong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soLuongPhuongTien</column-name><column-value><![CDATA[");
		sb.append(getSoLuongPhuongTien());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thietBiGiamSatHanhTrinh</column-name><column-value><![CDATA[");
		sb.append(getThietBiGiamSatHanhTrinh());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = QlvtLoaiHinhHoatDongDn.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			QlvtLoaiHinhHoatDongDn.class
		};
	private long _id;
	private long _hoSoThuTucId;
	private long _originalHoSoThuTucId;
	private boolean _setOriginalHoSoThuTucId;
	private long _noiDungHoSoId;
	private long _originalNoiDungHoSoId;
	private boolean _setOriginalNoiDungHoSoId;
	private String _maLoaiHinhHoatDong;
	private String _originalMaLoaiHinhHoatDong;
	private String _maMauSon;
	private String _maPhamViHoatDong;
	private String _soLuongPhuongTien;
	private String _thietBiGiamSatHanhTrinh;
	private long _columnBitmask;
	private QlvtLoaiHinhHoatDongDn _escapedModel;
}