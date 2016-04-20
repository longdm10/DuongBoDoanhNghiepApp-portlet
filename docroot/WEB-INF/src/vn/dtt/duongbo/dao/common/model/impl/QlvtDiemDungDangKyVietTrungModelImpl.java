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

import vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietTrung;
import vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietTrungModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the QlvtDiemDungDangKyVietTrung service. Represents a row in the &quot;qlvt_diemdungdangky_vt&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietTrungModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link QlvtDiemDungDangKyVietTrungImpl}.
 * </p>
 *
 * @author win_64
 * @see QlvtDiemDungDangKyVietTrungImpl
 * @see vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietTrung
 * @see vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietTrungModel
 * @generated
 */
public class QlvtDiemDungDangKyVietTrungModelImpl extends BaseModelImpl<QlvtDiemDungDangKyVietTrung>
	implements QlvtDiemDungDangKyVietTrungModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a qlvt diem dung dang ky viet trung model instance should use the {@link vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietTrung} interface instead.
	 */
	public static final String TABLE_NAME = "qlvt_diemdungdangky_vt";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.BIGINT },
			{ "PHUONGTIENDANGKYID", Types.VARCHAR },
			{ "NOIDUNGHOSOID", Types.VARCHAR },
			{ "HOSOTHUTUCID", Types.VARCHAR },
			{ "MADIEMDUNG", Types.BIGINT },
			{ "TENDIEMDUNG", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table qlvt_diemdungdangky_vt (ID LONG not null primary key,PHUONGTIENDANGKYID VARCHAR(75) null,NOIDUNGHOSOID VARCHAR(75) null,HOSOTHUTUCID VARCHAR(75) null,MADIEMDUNG LONG,TENDIEMDUNG LONG)";
	public static final String TABLE_SQL_DROP = "drop table qlvt_diemdungdangky_vt";
	public static final String ORDER_BY_JPQL = " ORDER BY qlvtDiemDungDangKyVietTrung.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY qlvt_diemdungdangky_vt.ID ASC";
	public static final String DATA_SOURCE = "tthcDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietTrung"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietTrung"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietTrung"));

	public QlvtDiemDungDangKyVietTrungModelImpl() {
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
		return QlvtDiemDungDangKyVietTrung.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtDiemDungDangKyVietTrung.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("PhuongTienDangKyId", getPhuongTienDangKyId());
		attributes.put("NoiDungHoSoId", getNoiDungHoSoId());
		attributes.put("HoSoThuTucId", getHoSoThuTucId());
		attributes.put("MaDiemDung", getMaDiemDung());
		attributes.put("TenDiemDung", getTenDiemDung());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String PhuongTienDangKyId = (String)attributes.get("PhuongTienDangKyId");

		if (PhuongTienDangKyId != null) {
			setPhuongTienDangKyId(PhuongTienDangKyId);
		}

		String NoiDungHoSoId = (String)attributes.get("NoiDungHoSoId");

		if (NoiDungHoSoId != null) {
			setNoiDungHoSoId(NoiDungHoSoId);
		}

		String HoSoThuTucId = (String)attributes.get("HoSoThuTucId");

		if (HoSoThuTucId != null) {
			setHoSoThuTucId(HoSoThuTucId);
		}

		Long MaDiemDung = (Long)attributes.get("MaDiemDung");

		if (MaDiemDung != null) {
			setMaDiemDung(MaDiemDung);
		}

		Long TenDiemDung = (Long)attributes.get("TenDiemDung");

		if (TenDiemDung != null) {
			setTenDiemDung(TenDiemDung);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;
	}

	@Override
	public String getPhuongTienDangKyId() {
		if (_PhuongTienDangKyId == null) {
			return StringPool.BLANK;
		}
		else {
			return _PhuongTienDangKyId;
		}
	}

	@Override
	public void setPhuongTienDangKyId(String PhuongTienDangKyId) {
		_PhuongTienDangKyId = PhuongTienDangKyId;
	}

	@Override
	public String getNoiDungHoSoId() {
		if (_NoiDungHoSoId == null) {
			return StringPool.BLANK;
		}
		else {
			return _NoiDungHoSoId;
		}
	}

	@Override
	public void setNoiDungHoSoId(String NoiDungHoSoId) {
		_NoiDungHoSoId = NoiDungHoSoId;
	}

	@Override
	public String getHoSoThuTucId() {
		if (_HoSoThuTucId == null) {
			return StringPool.BLANK;
		}
		else {
			return _HoSoThuTucId;
		}
	}

	@Override
	public void setHoSoThuTucId(String HoSoThuTucId) {
		_HoSoThuTucId = HoSoThuTucId;
	}

	@Override
	public long getMaDiemDung() {
		return _MaDiemDung;
	}

	@Override
	public void setMaDiemDung(long MaDiemDung) {
		_MaDiemDung = MaDiemDung;
	}

	@Override
	public long getTenDiemDung() {
		return _TenDiemDung;
	}

	@Override
	public void setTenDiemDung(long TenDiemDung) {
		_TenDiemDung = TenDiemDung;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			QlvtDiemDungDangKyVietTrung.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public QlvtDiemDungDangKyVietTrung toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (QlvtDiemDungDangKyVietTrung)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		QlvtDiemDungDangKyVietTrungImpl qlvtDiemDungDangKyVietTrungImpl = new QlvtDiemDungDangKyVietTrungImpl();

		qlvtDiemDungDangKyVietTrungImpl.setId(getId());
		qlvtDiemDungDangKyVietTrungImpl.setPhuongTienDangKyId(getPhuongTienDangKyId());
		qlvtDiemDungDangKyVietTrungImpl.setNoiDungHoSoId(getNoiDungHoSoId());
		qlvtDiemDungDangKyVietTrungImpl.setHoSoThuTucId(getHoSoThuTucId());
		qlvtDiemDungDangKyVietTrungImpl.setMaDiemDung(getMaDiemDung());
		qlvtDiemDungDangKyVietTrungImpl.setTenDiemDung(getTenDiemDung());

		qlvtDiemDungDangKyVietTrungImpl.resetOriginalValues();

		return qlvtDiemDungDangKyVietTrungImpl;
	}

	@Override
	public int compareTo(
		QlvtDiemDungDangKyVietTrung qlvtDiemDungDangKyVietTrung) {
		int value = 0;

		if (getId() < qlvtDiemDungDangKyVietTrung.getId()) {
			value = -1;
		}
		else if (getId() > qlvtDiemDungDangKyVietTrung.getId()) {
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

		if (!(obj instanceof QlvtDiemDungDangKyVietTrung)) {
			return false;
		}

		QlvtDiemDungDangKyVietTrung qlvtDiemDungDangKyVietTrung = (QlvtDiemDungDangKyVietTrung)obj;

		long primaryKey = qlvtDiemDungDangKyVietTrung.getPrimaryKey();

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
	}

	@Override
	public CacheModel<QlvtDiemDungDangKyVietTrung> toCacheModel() {
		QlvtDiemDungDangKyVietTrungCacheModel qlvtDiemDungDangKyVietTrungCacheModel =
			new QlvtDiemDungDangKyVietTrungCacheModel();

		qlvtDiemDungDangKyVietTrungCacheModel.id = getId();

		qlvtDiemDungDangKyVietTrungCacheModel.PhuongTienDangKyId = getPhuongTienDangKyId();

		String PhuongTienDangKyId = qlvtDiemDungDangKyVietTrungCacheModel.PhuongTienDangKyId;

		if ((PhuongTienDangKyId != null) && (PhuongTienDangKyId.length() == 0)) {
			qlvtDiemDungDangKyVietTrungCacheModel.PhuongTienDangKyId = null;
		}

		qlvtDiemDungDangKyVietTrungCacheModel.NoiDungHoSoId = getNoiDungHoSoId();

		String NoiDungHoSoId = qlvtDiemDungDangKyVietTrungCacheModel.NoiDungHoSoId;

		if ((NoiDungHoSoId != null) && (NoiDungHoSoId.length() == 0)) {
			qlvtDiemDungDangKyVietTrungCacheModel.NoiDungHoSoId = null;
		}

		qlvtDiemDungDangKyVietTrungCacheModel.HoSoThuTucId = getHoSoThuTucId();

		String HoSoThuTucId = qlvtDiemDungDangKyVietTrungCacheModel.HoSoThuTucId;

		if ((HoSoThuTucId != null) && (HoSoThuTucId.length() == 0)) {
			qlvtDiemDungDangKyVietTrungCacheModel.HoSoThuTucId = null;
		}

		qlvtDiemDungDangKyVietTrungCacheModel.MaDiemDung = getMaDiemDung();

		qlvtDiemDungDangKyVietTrungCacheModel.TenDiemDung = getTenDiemDung();

		return qlvtDiemDungDangKyVietTrungCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", PhuongTienDangKyId=");
		sb.append(getPhuongTienDangKyId());
		sb.append(", NoiDungHoSoId=");
		sb.append(getNoiDungHoSoId());
		sb.append(", HoSoThuTucId=");
		sb.append(getHoSoThuTucId());
		sb.append(", MaDiemDung=");
		sb.append(getMaDiemDung());
		sb.append(", TenDiemDung=");
		sb.append(getTenDiemDung());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietTrung");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PhuongTienDangKyId</column-name><column-value><![CDATA[");
		sb.append(getPhuongTienDangKyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NoiDungHoSoId</column-name><column-value><![CDATA[");
		sb.append(getNoiDungHoSoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>HoSoThuTucId</column-name><column-value><![CDATA[");
		sb.append(getHoSoThuTucId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MaDiemDung</column-name><column-value><![CDATA[");
		sb.append(getMaDiemDung());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TenDiemDung</column-name><column-value><![CDATA[");
		sb.append(getTenDiemDung());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = QlvtDiemDungDangKyVietTrung.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			QlvtDiemDungDangKyVietTrung.class
		};
	private long _id;
	private String _PhuongTienDangKyId;
	private String _NoiDungHoSoId;
	private String _HoSoThuTucId;
	private long _MaDiemDung;
	private long _TenDiemDung;
	private QlvtDiemDungDangKyVietTrung _escapedModel;
}