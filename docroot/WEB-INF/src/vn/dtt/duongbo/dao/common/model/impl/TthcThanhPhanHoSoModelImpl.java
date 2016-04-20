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

import vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo;
import vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the TthcThanhPhanHoSo service. Represents a row in the &quot;tthc_thanhphanhoso&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TthcThanhPhanHoSoImpl}.
 * </p>
 *
 * @author win_64
 * @see TthcThanhPhanHoSoImpl
 * @see vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo
 * @see vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoModel
 * @generated
 */
public class TthcThanhPhanHoSoModelImpl extends BaseModelImpl<TthcThanhPhanHoSo>
	implements TthcThanhPhanHoSoModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tthc thanh phan ho so model instance should use the {@link vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo} interface instead.
	 */
	public static final String TABLE_NAME = "tthc_thanhphanhoso";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "thutuchanhchinhid", Types.BIGINT },
			{ "tenthanhphan", Types.VARCHAR },
			{ "ghichu", Types.VARCHAR },
			{ "mathanhphan", Types.VARCHAR },
			{ "thutuhienthi", Types.BIGINT },
			{ "loaithanhphan", Types.BIGINT },
			{ "sotailieudinhkem", Types.BIGINT },
			{ "mautructuyen", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table tthc_thanhphanhoso (id LONG not null primary key,thutuchanhchinhid LONG,tenthanhphan VARCHAR(75) null,ghichu VARCHAR(75) null,mathanhphan VARCHAR(75) null,thutuhienthi LONG,loaithanhphan LONG,sotailieudinhkem LONG,mautructuyen VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table tthc_thanhphanhoso";
	public static final String ORDER_BY_JPQL = " ORDER BY tthcThanhPhanHoSo.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY tthc_thanhphanhoso.id ASC";
	public static final String DATA_SOURCE = "tthcDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo"),
			true);
	public static long MATHANHPHAN_COLUMN_BITMASK = 1L;
	public static long THUTUCHANHCHINHID_COLUMN_BITMASK = 2L;
	public static long ID_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo"));

	public TthcThanhPhanHoSoModelImpl() {
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
		return TthcThanhPhanHoSo.class;
	}

	@Override
	public String getModelClassName() {
		return TthcThanhPhanHoSo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("thuTucHanhChinhId", getThuTucHanhChinhId());
		attributes.put("tenThanhPhan", getTenThanhPhan());
		attributes.put("ghiChu", getGhiChu());
		attributes.put("maThanhPhan", getMaThanhPhan());
		attributes.put("thuTuHienThi", getThuTuHienThi());
		attributes.put("loaiThanhPhan", getLoaiThanhPhan());
		attributes.put("soTaiLieuDinhKem", getSoTaiLieuDinhKem());
		attributes.put("mauTrucTuyen", getMauTrucTuyen());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long thuTucHanhChinhId = (Long)attributes.get("thuTucHanhChinhId");

		if (thuTucHanhChinhId != null) {
			setThuTucHanhChinhId(thuTucHanhChinhId);
		}

		String tenThanhPhan = (String)attributes.get("tenThanhPhan");

		if (tenThanhPhan != null) {
			setTenThanhPhan(tenThanhPhan);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}

		String maThanhPhan = (String)attributes.get("maThanhPhan");

		if (maThanhPhan != null) {
			setMaThanhPhan(maThanhPhan);
		}

		Long thuTuHienThi = (Long)attributes.get("thuTuHienThi");

		if (thuTuHienThi != null) {
			setThuTuHienThi(thuTuHienThi);
		}

		Long loaiThanhPhan = (Long)attributes.get("loaiThanhPhan");

		if (loaiThanhPhan != null) {
			setLoaiThanhPhan(loaiThanhPhan);
		}

		Long soTaiLieuDinhKem = (Long)attributes.get("soTaiLieuDinhKem");

		if (soTaiLieuDinhKem != null) {
			setSoTaiLieuDinhKem(soTaiLieuDinhKem);
		}

		String mauTrucTuyen = (String)attributes.get("mauTrucTuyen");

		if (mauTrucTuyen != null) {
			setMauTrucTuyen(mauTrucTuyen);
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
	public long getThuTucHanhChinhId() {
		return _thuTucHanhChinhId;
	}

	@Override
	public void setThuTucHanhChinhId(long thuTucHanhChinhId) {
		_columnBitmask |= THUTUCHANHCHINHID_COLUMN_BITMASK;

		if (!_setOriginalThuTucHanhChinhId) {
			_setOriginalThuTucHanhChinhId = true;

			_originalThuTucHanhChinhId = _thuTucHanhChinhId;
		}

		_thuTucHanhChinhId = thuTucHanhChinhId;
	}

	public long getOriginalThuTucHanhChinhId() {
		return _originalThuTucHanhChinhId;
	}

	@Override
	public String getTenThanhPhan() {
		if (_tenThanhPhan == null) {
			return StringPool.BLANK;
		}
		else {
			return _tenThanhPhan;
		}
	}

	@Override
	public void setTenThanhPhan(String tenThanhPhan) {
		_tenThanhPhan = tenThanhPhan;
	}

	@Override
	public String getGhiChu() {
		if (_ghiChu == null) {
			return StringPool.BLANK;
		}
		else {
			return _ghiChu;
		}
	}

	@Override
	public void setGhiChu(String ghiChu) {
		_ghiChu = ghiChu;
	}

	@Override
	public String getMaThanhPhan() {
		if (_maThanhPhan == null) {
			return StringPool.BLANK;
		}
		else {
			return _maThanhPhan;
		}
	}

	@Override
	public void setMaThanhPhan(String maThanhPhan) {
		_columnBitmask |= MATHANHPHAN_COLUMN_BITMASK;

		if (_originalMaThanhPhan == null) {
			_originalMaThanhPhan = _maThanhPhan;
		}

		_maThanhPhan = maThanhPhan;
	}

	public String getOriginalMaThanhPhan() {
		return GetterUtil.getString(_originalMaThanhPhan);
	}

	@Override
	public long getThuTuHienThi() {
		return _thuTuHienThi;
	}

	@Override
	public void setThuTuHienThi(long thuTuHienThi) {
		_thuTuHienThi = thuTuHienThi;
	}

	@Override
	public long getLoaiThanhPhan() {
		return _loaiThanhPhan;
	}

	@Override
	public void setLoaiThanhPhan(long loaiThanhPhan) {
		_loaiThanhPhan = loaiThanhPhan;
	}

	@Override
	public long getSoTaiLieuDinhKem() {
		return _soTaiLieuDinhKem;
	}

	@Override
	public void setSoTaiLieuDinhKem(long soTaiLieuDinhKem) {
		_soTaiLieuDinhKem = soTaiLieuDinhKem;
	}

	@Override
	public String getMauTrucTuyen() {
		if (_mauTrucTuyen == null) {
			return StringPool.BLANK;
		}
		else {
			return _mauTrucTuyen;
		}
	}

	@Override
	public void setMauTrucTuyen(String mauTrucTuyen) {
		_mauTrucTuyen = mauTrucTuyen;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			TthcThanhPhanHoSo.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TthcThanhPhanHoSo toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (TthcThanhPhanHoSo)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TthcThanhPhanHoSoImpl tthcThanhPhanHoSoImpl = new TthcThanhPhanHoSoImpl();

		tthcThanhPhanHoSoImpl.setId(getId());
		tthcThanhPhanHoSoImpl.setThuTucHanhChinhId(getThuTucHanhChinhId());
		tthcThanhPhanHoSoImpl.setTenThanhPhan(getTenThanhPhan());
		tthcThanhPhanHoSoImpl.setGhiChu(getGhiChu());
		tthcThanhPhanHoSoImpl.setMaThanhPhan(getMaThanhPhan());
		tthcThanhPhanHoSoImpl.setThuTuHienThi(getThuTuHienThi());
		tthcThanhPhanHoSoImpl.setLoaiThanhPhan(getLoaiThanhPhan());
		tthcThanhPhanHoSoImpl.setSoTaiLieuDinhKem(getSoTaiLieuDinhKem());
		tthcThanhPhanHoSoImpl.setMauTrucTuyen(getMauTrucTuyen());

		tthcThanhPhanHoSoImpl.resetOriginalValues();

		return tthcThanhPhanHoSoImpl;
	}

	@Override
	public int compareTo(TthcThanhPhanHoSo tthcThanhPhanHoSo) {
		int value = 0;

		if (getId() < tthcThanhPhanHoSo.getId()) {
			value = -1;
		}
		else if (getId() > tthcThanhPhanHoSo.getId()) {
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

		if (!(obj instanceof TthcThanhPhanHoSo)) {
			return false;
		}

		TthcThanhPhanHoSo tthcThanhPhanHoSo = (TthcThanhPhanHoSo)obj;

		long primaryKey = tthcThanhPhanHoSo.getPrimaryKey();

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
		TthcThanhPhanHoSoModelImpl tthcThanhPhanHoSoModelImpl = this;

		tthcThanhPhanHoSoModelImpl._originalThuTucHanhChinhId = tthcThanhPhanHoSoModelImpl._thuTucHanhChinhId;

		tthcThanhPhanHoSoModelImpl._setOriginalThuTucHanhChinhId = false;

		tthcThanhPhanHoSoModelImpl._originalMaThanhPhan = tthcThanhPhanHoSoModelImpl._maThanhPhan;

		tthcThanhPhanHoSoModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<TthcThanhPhanHoSo> toCacheModel() {
		TthcThanhPhanHoSoCacheModel tthcThanhPhanHoSoCacheModel = new TthcThanhPhanHoSoCacheModel();

		tthcThanhPhanHoSoCacheModel.id = getId();

		tthcThanhPhanHoSoCacheModel.thuTucHanhChinhId = getThuTucHanhChinhId();

		tthcThanhPhanHoSoCacheModel.tenThanhPhan = getTenThanhPhan();

		String tenThanhPhan = tthcThanhPhanHoSoCacheModel.tenThanhPhan;

		if ((tenThanhPhan != null) && (tenThanhPhan.length() == 0)) {
			tthcThanhPhanHoSoCacheModel.tenThanhPhan = null;
		}

		tthcThanhPhanHoSoCacheModel.ghiChu = getGhiChu();

		String ghiChu = tthcThanhPhanHoSoCacheModel.ghiChu;

		if ((ghiChu != null) && (ghiChu.length() == 0)) {
			tthcThanhPhanHoSoCacheModel.ghiChu = null;
		}

		tthcThanhPhanHoSoCacheModel.maThanhPhan = getMaThanhPhan();

		String maThanhPhan = tthcThanhPhanHoSoCacheModel.maThanhPhan;

		if ((maThanhPhan != null) && (maThanhPhan.length() == 0)) {
			tthcThanhPhanHoSoCacheModel.maThanhPhan = null;
		}

		tthcThanhPhanHoSoCacheModel.thuTuHienThi = getThuTuHienThi();

		tthcThanhPhanHoSoCacheModel.loaiThanhPhan = getLoaiThanhPhan();

		tthcThanhPhanHoSoCacheModel.soTaiLieuDinhKem = getSoTaiLieuDinhKem();

		tthcThanhPhanHoSoCacheModel.mauTrucTuyen = getMauTrucTuyen();

		String mauTrucTuyen = tthcThanhPhanHoSoCacheModel.mauTrucTuyen;

		if ((mauTrucTuyen != null) && (mauTrucTuyen.length() == 0)) {
			tthcThanhPhanHoSoCacheModel.mauTrucTuyen = null;
		}

		return tthcThanhPhanHoSoCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", thuTucHanhChinhId=");
		sb.append(getThuTucHanhChinhId());
		sb.append(", tenThanhPhan=");
		sb.append(getTenThanhPhan());
		sb.append(", ghiChu=");
		sb.append(getGhiChu());
		sb.append(", maThanhPhan=");
		sb.append(getMaThanhPhan());
		sb.append(", thuTuHienThi=");
		sb.append(getThuTuHienThi());
		sb.append(", loaiThanhPhan=");
		sb.append(getLoaiThanhPhan());
		sb.append(", soTaiLieuDinhKem=");
		sb.append(getSoTaiLieuDinhKem());
		sb.append(", mauTrucTuyen=");
		sb.append(getMauTrucTuyen());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thuTucHanhChinhId</column-name><column-value><![CDATA[");
		sb.append(getThuTucHanhChinhId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenThanhPhan</column-name><column-value><![CDATA[");
		sb.append(getTenThanhPhan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ghiChu</column-name><column-value><![CDATA[");
		sb.append(getGhiChu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maThanhPhan</column-name><column-value><![CDATA[");
		sb.append(getMaThanhPhan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thuTuHienThi</column-name><column-value><![CDATA[");
		sb.append(getThuTuHienThi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiThanhPhan</column-name><column-value><![CDATA[");
		sb.append(getLoaiThanhPhan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soTaiLieuDinhKem</column-name><column-value><![CDATA[");
		sb.append(getSoTaiLieuDinhKem());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mauTrucTuyen</column-name><column-value><![CDATA[");
		sb.append(getMauTrucTuyen());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = TthcThanhPhanHoSo.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			TthcThanhPhanHoSo.class
		};
	private long _id;
	private long _thuTucHanhChinhId;
	private long _originalThuTucHanhChinhId;
	private boolean _setOriginalThuTucHanhChinhId;
	private String _tenThanhPhan;
	private String _ghiChu;
	private String _maThanhPhan;
	private String _originalMaThanhPhan;
	private long _thuTuHienThi;
	private long _loaiThanhPhan;
	private long _soTaiLieuDinhKem;
	private String _mauTrucTuyen;
	private long _columnBitmask;
	private TthcThanhPhanHoSo _escapedModel;
}