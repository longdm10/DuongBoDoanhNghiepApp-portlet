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

import vn.dtt.duongbo.dao.common.model.TthcDonViThucHien;
import vn.dtt.duongbo.dao.common.model.TthcDonViThucHienModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the TthcDonViThucHien service. Represents a row in the &quot;tthc_donvithuchien&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbo.dao.common.model.TthcDonViThucHienModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TthcDonViThucHienImpl}.
 * </p>
 *
 * @author win_64
 * @see TthcDonViThucHienImpl
 * @see vn.dtt.duongbo.dao.common.model.TthcDonViThucHien
 * @see vn.dtt.duongbo.dao.common.model.TthcDonViThucHienModel
 * @generated
 */
public class TthcDonViThucHienModelImpl extends BaseModelImpl<TthcDonViThucHien>
	implements TthcDonViThucHienModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tthc don vi thuc hien model instance should use the {@link vn.dtt.duongbo.dao.common.model.TthcDonViThucHien} interface instead.
	 */
	public static final String TABLE_NAME = "tthc_donvithuchien";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "thutuchanhchinhid", Types.BIGINT },
			{ "madonvi", Types.VARCHAR },
			{ "tochuc", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table tthc_donvithuchien (id LONG not null primary key,thutuchanhchinhid LONG,madonvi VARCHAR(75) null,tochuc LONG)";
	public static final String TABLE_SQL_DROP = "drop table tthc_donvithuchien";
	public static final String ORDER_BY_JPQL = " ORDER BY tthcDonViThucHien.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY tthc_donvithuchien.id ASC";
	public static final String DATA_SOURCE = "tthcDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbo.dao.common.model.TthcDonViThucHien"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbo.dao.common.model.TthcDonViThucHien"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.duongbo.dao.common.model.TthcDonViThucHien"),
			true);
	public static long MADONVI_COLUMN_BITMASK = 1L;
	public static long THUTUCHANHCHINHID_COLUMN_BITMASK = 2L;
	public static long ID_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbo.dao.common.model.TthcDonViThucHien"));

	public TthcDonViThucHienModelImpl() {
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
		return TthcDonViThucHien.class;
	}

	@Override
	public String getModelClassName() {
		return TthcDonViThucHien.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("thuTucHanhChinhId", getThuTucHanhChinhId());
		attributes.put("maDonVi", getMaDonVi());
		attributes.put("toChuc", getToChuc());

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

		String maDonVi = (String)attributes.get("maDonVi");

		if (maDonVi != null) {
			setMaDonVi(maDonVi);
		}

		Long toChuc = (Long)attributes.get("toChuc");

		if (toChuc != null) {
			setToChuc(toChuc);
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
	public String getMaDonVi() {
		if (_maDonVi == null) {
			return StringPool.BLANK;
		}
		else {
			return _maDonVi;
		}
	}

	@Override
	public void setMaDonVi(String maDonVi) {
		_columnBitmask |= MADONVI_COLUMN_BITMASK;

		if (_originalMaDonVi == null) {
			_originalMaDonVi = _maDonVi;
		}

		_maDonVi = maDonVi;
	}

	public String getOriginalMaDonVi() {
		return GetterUtil.getString(_originalMaDonVi);
	}

	@Override
	public long getToChuc() {
		return _toChuc;
	}

	@Override
	public void setToChuc(long toChuc) {
		_toChuc = toChuc;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			TthcDonViThucHien.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TthcDonViThucHien toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (TthcDonViThucHien)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TthcDonViThucHienImpl tthcDonViThucHienImpl = new TthcDonViThucHienImpl();

		tthcDonViThucHienImpl.setId(getId());
		tthcDonViThucHienImpl.setThuTucHanhChinhId(getThuTucHanhChinhId());
		tthcDonViThucHienImpl.setMaDonVi(getMaDonVi());
		tthcDonViThucHienImpl.setToChuc(getToChuc());

		tthcDonViThucHienImpl.resetOriginalValues();

		return tthcDonViThucHienImpl;
	}

	@Override
	public int compareTo(TthcDonViThucHien tthcDonViThucHien) {
		int value = 0;

		if (getId() < tthcDonViThucHien.getId()) {
			value = -1;
		}
		else if (getId() > tthcDonViThucHien.getId()) {
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

		if (!(obj instanceof TthcDonViThucHien)) {
			return false;
		}

		TthcDonViThucHien tthcDonViThucHien = (TthcDonViThucHien)obj;

		long primaryKey = tthcDonViThucHien.getPrimaryKey();

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
		TthcDonViThucHienModelImpl tthcDonViThucHienModelImpl = this;

		tthcDonViThucHienModelImpl._originalThuTucHanhChinhId = tthcDonViThucHienModelImpl._thuTucHanhChinhId;

		tthcDonViThucHienModelImpl._setOriginalThuTucHanhChinhId = false;

		tthcDonViThucHienModelImpl._originalMaDonVi = tthcDonViThucHienModelImpl._maDonVi;

		tthcDonViThucHienModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<TthcDonViThucHien> toCacheModel() {
		TthcDonViThucHienCacheModel tthcDonViThucHienCacheModel = new TthcDonViThucHienCacheModel();

		tthcDonViThucHienCacheModel.id = getId();

		tthcDonViThucHienCacheModel.thuTucHanhChinhId = getThuTucHanhChinhId();

		tthcDonViThucHienCacheModel.maDonVi = getMaDonVi();

		String maDonVi = tthcDonViThucHienCacheModel.maDonVi;

		if ((maDonVi != null) && (maDonVi.length() == 0)) {
			tthcDonViThucHienCacheModel.maDonVi = null;
		}

		tthcDonViThucHienCacheModel.toChuc = getToChuc();

		return tthcDonViThucHienCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", thuTucHanhChinhId=");
		sb.append(getThuTucHanhChinhId());
		sb.append(", maDonVi=");
		sb.append(getMaDonVi());
		sb.append(", toChuc=");
		sb.append(getToChuc());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.common.model.TthcDonViThucHien");
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
			"<column><column-name>maDonVi</column-name><column-value><![CDATA[");
		sb.append(getMaDonVi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>toChuc</column-name><column-value><![CDATA[");
		sb.append(getToChuc());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = TthcDonViThucHien.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			TthcDonViThucHien.class
		};
	private long _id;
	private long _thuTucHanhChinhId;
	private long _originalThuTucHanhChinhId;
	private boolean _setOriginalThuTucHanhChinhId;
	private String _maDonVi;
	private String _originalMaDonVi;
	private long _toChuc;
	private long _columnBitmask;
	private TthcDonViThucHien _escapedModel;
}