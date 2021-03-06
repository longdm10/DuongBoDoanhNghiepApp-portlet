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

import vn.dtt.duongbo.dao.common.model.TthcBieuMauHoSo;
import vn.dtt.duongbo.dao.common.model.TthcBieuMauHoSoModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the TthcBieuMauHoSo service. Represents a row in the &quot;tthc_bieumauhoso&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbo.dao.common.model.TthcBieuMauHoSoModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TthcBieuMauHoSoImpl}.
 * </p>
 *
 * @author win_64
 * @see TthcBieuMauHoSoImpl
 * @see vn.dtt.duongbo.dao.common.model.TthcBieuMauHoSo
 * @see vn.dtt.duongbo.dao.common.model.TthcBieuMauHoSoModel
 * @generated
 */
public class TthcBieuMauHoSoModelImpl extends BaseModelImpl<TthcBieuMauHoSo>
	implements TthcBieuMauHoSoModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tthc bieu mau ho so model instance should use the {@link vn.dtt.duongbo.dao.common.model.TthcBieuMauHoSo} interface instead.
	 */
	public static final String TABLE_NAME = "tthc_bieumauhoso";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "mabieumau", Types.VARCHAR },
			{ "tenbieumau", Types.VARCHAR },
			{ "tentienganh", Types.VARCHAR },
			{ "tailieumau", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table tthc_bieumauhoso (id LONG not null primary key,mabieumau VARCHAR(75) null,tenbieumau VARCHAR(75) null,tentienganh VARCHAR(75) null,tailieumau LONG)";
	public static final String TABLE_SQL_DROP = "drop table tthc_bieumauhoso";
	public static final String ORDER_BY_JPQL = " ORDER BY tthcBieuMauHoSo.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY tthc_bieumauhoso.id ASC";
	public static final String DATA_SOURCE = "tthcDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbo.dao.common.model.TthcBieuMauHoSo"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbo.dao.common.model.TthcBieuMauHoSo"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.duongbo.dao.common.model.TthcBieuMauHoSo"),
			true);
	public static long MABIEUMAU_COLUMN_BITMASK = 1L;
	public static long ID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbo.dao.common.model.TthcBieuMauHoSo"));

	public TthcBieuMauHoSoModelImpl() {
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
		return TthcBieuMauHoSo.class;
	}

	@Override
	public String getModelClassName() {
		return TthcBieuMauHoSo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("maBieuMau", getMaBieuMau());
		attributes.put("tenBieuMau", getTenBieuMau());
		attributes.put("tenTiengAnh", getTenTiengAnh());
		attributes.put("taiLieuMau", getTaiLieuMau());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String maBieuMau = (String)attributes.get("maBieuMau");

		if (maBieuMau != null) {
			setMaBieuMau(maBieuMau);
		}

		String tenBieuMau = (String)attributes.get("tenBieuMau");

		if (tenBieuMau != null) {
			setTenBieuMau(tenBieuMau);
		}

		String tenTiengAnh = (String)attributes.get("tenTiengAnh");

		if (tenTiengAnh != null) {
			setTenTiengAnh(tenTiengAnh);
		}

		Long taiLieuMau = (Long)attributes.get("taiLieuMau");

		if (taiLieuMau != null) {
			setTaiLieuMau(taiLieuMau);
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
	public String getMaBieuMau() {
		if (_maBieuMau == null) {
			return StringPool.BLANK;
		}
		else {
			return _maBieuMau;
		}
	}

	@Override
	public void setMaBieuMau(String maBieuMau) {
		_columnBitmask |= MABIEUMAU_COLUMN_BITMASK;

		if (_originalMaBieuMau == null) {
			_originalMaBieuMau = _maBieuMau;
		}

		_maBieuMau = maBieuMau;
	}

	public String getOriginalMaBieuMau() {
		return GetterUtil.getString(_originalMaBieuMau);
	}

	@Override
	public String getTenBieuMau() {
		if (_tenBieuMau == null) {
			return StringPool.BLANK;
		}
		else {
			return _tenBieuMau;
		}
	}

	@Override
	public void setTenBieuMau(String tenBieuMau) {
		_tenBieuMau = tenBieuMau;
	}

	@Override
	public String getTenTiengAnh() {
		if (_tenTiengAnh == null) {
			return StringPool.BLANK;
		}
		else {
			return _tenTiengAnh;
		}
	}

	@Override
	public void setTenTiengAnh(String tenTiengAnh) {
		_tenTiengAnh = tenTiengAnh;
	}

	@Override
	public long getTaiLieuMau() {
		return _taiLieuMau;
	}

	@Override
	public void setTaiLieuMau(long taiLieuMau) {
		_taiLieuMau = taiLieuMau;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			TthcBieuMauHoSo.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TthcBieuMauHoSo toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (TthcBieuMauHoSo)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TthcBieuMauHoSoImpl tthcBieuMauHoSoImpl = new TthcBieuMauHoSoImpl();

		tthcBieuMauHoSoImpl.setId(getId());
		tthcBieuMauHoSoImpl.setMaBieuMau(getMaBieuMau());
		tthcBieuMauHoSoImpl.setTenBieuMau(getTenBieuMau());
		tthcBieuMauHoSoImpl.setTenTiengAnh(getTenTiengAnh());
		tthcBieuMauHoSoImpl.setTaiLieuMau(getTaiLieuMau());

		tthcBieuMauHoSoImpl.resetOriginalValues();

		return tthcBieuMauHoSoImpl;
	}

	@Override
	public int compareTo(TthcBieuMauHoSo tthcBieuMauHoSo) {
		int value = 0;

		if (getId() < tthcBieuMauHoSo.getId()) {
			value = -1;
		}
		else if (getId() > tthcBieuMauHoSo.getId()) {
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

		if (!(obj instanceof TthcBieuMauHoSo)) {
			return false;
		}

		TthcBieuMauHoSo tthcBieuMauHoSo = (TthcBieuMauHoSo)obj;

		long primaryKey = tthcBieuMauHoSo.getPrimaryKey();

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
		TthcBieuMauHoSoModelImpl tthcBieuMauHoSoModelImpl = this;

		tthcBieuMauHoSoModelImpl._originalMaBieuMau = tthcBieuMauHoSoModelImpl._maBieuMau;

		tthcBieuMauHoSoModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<TthcBieuMauHoSo> toCacheModel() {
		TthcBieuMauHoSoCacheModel tthcBieuMauHoSoCacheModel = new TthcBieuMauHoSoCacheModel();

		tthcBieuMauHoSoCacheModel.id = getId();

		tthcBieuMauHoSoCacheModel.maBieuMau = getMaBieuMau();

		String maBieuMau = tthcBieuMauHoSoCacheModel.maBieuMau;

		if ((maBieuMau != null) && (maBieuMau.length() == 0)) {
			tthcBieuMauHoSoCacheModel.maBieuMau = null;
		}

		tthcBieuMauHoSoCacheModel.tenBieuMau = getTenBieuMau();

		String tenBieuMau = tthcBieuMauHoSoCacheModel.tenBieuMau;

		if ((tenBieuMau != null) && (tenBieuMau.length() == 0)) {
			tthcBieuMauHoSoCacheModel.tenBieuMau = null;
		}

		tthcBieuMauHoSoCacheModel.tenTiengAnh = getTenTiengAnh();

		String tenTiengAnh = tthcBieuMauHoSoCacheModel.tenTiengAnh;

		if ((tenTiengAnh != null) && (tenTiengAnh.length() == 0)) {
			tthcBieuMauHoSoCacheModel.tenTiengAnh = null;
		}

		tthcBieuMauHoSoCacheModel.taiLieuMau = getTaiLieuMau();

		return tthcBieuMauHoSoCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", maBieuMau=");
		sb.append(getMaBieuMau());
		sb.append(", tenBieuMau=");
		sb.append(getTenBieuMau());
		sb.append(", tenTiengAnh=");
		sb.append(getTenTiengAnh());
		sb.append(", taiLieuMau=");
		sb.append(getTaiLieuMau());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.common.model.TthcBieuMauHoSo");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maBieuMau</column-name><column-value><![CDATA[");
		sb.append(getMaBieuMau());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenBieuMau</column-name><column-value><![CDATA[");
		sb.append(getTenBieuMau());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenTiengAnh</column-name><column-value><![CDATA[");
		sb.append(getTenTiengAnh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>taiLieuMau</column-name><column-value><![CDATA[");
		sb.append(getTaiLieuMau());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = TthcBieuMauHoSo.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			TthcBieuMauHoSo.class
		};
	private long _id;
	private String _maBieuMau;
	private String _originalMaBieuMau;
	private String _tenBieuMau;
	private String _tenTiengAnh;
	private long _taiLieuMau;
	private long _columnBitmask;
	private TthcBieuMauHoSo _escapedModel;
}