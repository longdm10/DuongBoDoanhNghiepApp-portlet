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

import vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo;
import vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSoModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the TthcPhanNhomHoSo service. Represents a row in the &quot;tthc_phannhomhoso&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSoModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TthcPhanNhomHoSoImpl}.
 * </p>
 *
 * @author win_64
 * @see TthcPhanNhomHoSoImpl
 * @see vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo
 * @see vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSoModel
 * @generated
 */
public class TthcPhanNhomHoSoModelImpl extends BaseModelImpl<TthcPhanNhomHoSo>
	implements TthcPhanNhomHoSoModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tthc phan nhom ho so model instance should use the {@link vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo} interface instead.
	 */
	public static final String TABLE_NAME = "tthc_phannhomhoso";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "maphannhom", Types.VARCHAR },
			{ "tenphannhom", Types.VARCHAR },
			{ "tentienganh", Types.VARCHAR },
			{ "sothutu", Types.INTEGER },
			{ "LOAIPHANNHOM", Types.INTEGER },
			{ "tochucquanly", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table tthc_phannhomhoso (id LONG not null primary key,maphannhom VARCHAR(75) null,tenphannhom VARCHAR(75) null,tentienganh VARCHAR(75) null,sothutu INTEGER,LOAIPHANNHOM INTEGER,tochucquanly LONG)";
	public static final String TABLE_SQL_DROP = "drop table tthc_phannhomhoso";
	public static final String ORDER_BY_JPQL = " ORDER BY tthcPhanNhomHoSo.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY tthc_phannhomhoso.id ASC";
	public static final String DATA_SOURCE = "tthcDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo"),
			true);
	public static long MAPHANNHOM_COLUMN_BITMASK = 1L;
	public static long TOCHUCQUANLY_COLUMN_BITMASK = 2L;
	public static long ID_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo"));

	public TthcPhanNhomHoSoModelImpl() {
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
		return TthcPhanNhomHoSo.class;
	}

	@Override
	public String getModelClassName() {
		return TthcPhanNhomHoSo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("maPhanNhom", getMaPhanNhom());
		attributes.put("tenPhanNhom", getTenPhanNhom());
		attributes.put("tenTiengAnh", getTenTiengAnh());
		attributes.put("soThuTu", getSoThuTu());
		attributes.put("loaiPhanNhom", getLoaiPhanNhom());
		attributes.put("toChucQuanLy", getToChucQuanLy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String maPhanNhom = (String)attributes.get("maPhanNhom");

		if (maPhanNhom != null) {
			setMaPhanNhom(maPhanNhom);
		}

		String tenPhanNhom = (String)attributes.get("tenPhanNhom");

		if (tenPhanNhom != null) {
			setTenPhanNhom(tenPhanNhom);
		}

		String tenTiengAnh = (String)attributes.get("tenTiengAnh");

		if (tenTiengAnh != null) {
			setTenTiengAnh(tenTiengAnh);
		}

		Integer soThuTu = (Integer)attributes.get("soThuTu");

		if (soThuTu != null) {
			setSoThuTu(soThuTu);
		}

		Integer loaiPhanNhom = (Integer)attributes.get("loaiPhanNhom");

		if (loaiPhanNhom != null) {
			setLoaiPhanNhom(loaiPhanNhom);
		}

		Long toChucQuanLy = (Long)attributes.get("toChucQuanLy");

		if (toChucQuanLy != null) {
			setToChucQuanLy(toChucQuanLy);
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
	public String getMaPhanNhom() {
		if (_maPhanNhom == null) {
			return StringPool.BLANK;
		}
		else {
			return _maPhanNhom;
		}
	}

	@Override
	public void setMaPhanNhom(String maPhanNhom) {
		_columnBitmask |= MAPHANNHOM_COLUMN_BITMASK;

		if (_originalMaPhanNhom == null) {
			_originalMaPhanNhom = _maPhanNhom;
		}

		_maPhanNhom = maPhanNhom;
	}

	public String getOriginalMaPhanNhom() {
		return GetterUtil.getString(_originalMaPhanNhom);
	}

	@Override
	public String getTenPhanNhom() {
		if (_tenPhanNhom == null) {
			return StringPool.BLANK;
		}
		else {
			return _tenPhanNhom;
		}
	}

	@Override
	public void setTenPhanNhom(String tenPhanNhom) {
		_tenPhanNhom = tenPhanNhom;
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
	public int getSoThuTu() {
		return _soThuTu;
	}

	@Override
	public void setSoThuTu(int soThuTu) {
		_soThuTu = soThuTu;
	}

	@Override
	public int getLoaiPhanNhom() {
		return _loaiPhanNhom;
	}

	@Override
	public void setLoaiPhanNhom(int loaiPhanNhom) {
		_loaiPhanNhom = loaiPhanNhom;
	}

	@Override
	public long getToChucQuanLy() {
		return _toChucQuanLy;
	}

	@Override
	public void setToChucQuanLy(long toChucQuanLy) {
		_columnBitmask |= TOCHUCQUANLY_COLUMN_BITMASK;

		if (!_setOriginalToChucQuanLy) {
			_setOriginalToChucQuanLy = true;

			_originalToChucQuanLy = _toChucQuanLy;
		}

		_toChucQuanLy = toChucQuanLy;
	}

	public long getOriginalToChucQuanLy() {
		return _originalToChucQuanLy;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			TthcPhanNhomHoSo.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TthcPhanNhomHoSo toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (TthcPhanNhomHoSo)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TthcPhanNhomHoSoImpl tthcPhanNhomHoSoImpl = new TthcPhanNhomHoSoImpl();

		tthcPhanNhomHoSoImpl.setId(getId());
		tthcPhanNhomHoSoImpl.setMaPhanNhom(getMaPhanNhom());
		tthcPhanNhomHoSoImpl.setTenPhanNhom(getTenPhanNhom());
		tthcPhanNhomHoSoImpl.setTenTiengAnh(getTenTiengAnh());
		tthcPhanNhomHoSoImpl.setSoThuTu(getSoThuTu());
		tthcPhanNhomHoSoImpl.setLoaiPhanNhom(getLoaiPhanNhom());
		tthcPhanNhomHoSoImpl.setToChucQuanLy(getToChucQuanLy());

		tthcPhanNhomHoSoImpl.resetOriginalValues();

		return tthcPhanNhomHoSoImpl;
	}

	@Override
	public int compareTo(TthcPhanNhomHoSo tthcPhanNhomHoSo) {
		int value = 0;

		if (getId() < tthcPhanNhomHoSo.getId()) {
			value = -1;
		}
		else if (getId() > tthcPhanNhomHoSo.getId()) {
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

		if (!(obj instanceof TthcPhanNhomHoSo)) {
			return false;
		}

		TthcPhanNhomHoSo tthcPhanNhomHoSo = (TthcPhanNhomHoSo)obj;

		long primaryKey = tthcPhanNhomHoSo.getPrimaryKey();

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
		TthcPhanNhomHoSoModelImpl tthcPhanNhomHoSoModelImpl = this;

		tthcPhanNhomHoSoModelImpl._originalMaPhanNhom = tthcPhanNhomHoSoModelImpl._maPhanNhom;

		tthcPhanNhomHoSoModelImpl._originalToChucQuanLy = tthcPhanNhomHoSoModelImpl._toChucQuanLy;

		tthcPhanNhomHoSoModelImpl._setOriginalToChucQuanLy = false;

		tthcPhanNhomHoSoModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<TthcPhanNhomHoSo> toCacheModel() {
		TthcPhanNhomHoSoCacheModel tthcPhanNhomHoSoCacheModel = new TthcPhanNhomHoSoCacheModel();

		tthcPhanNhomHoSoCacheModel.id = getId();

		tthcPhanNhomHoSoCacheModel.maPhanNhom = getMaPhanNhom();

		String maPhanNhom = tthcPhanNhomHoSoCacheModel.maPhanNhom;

		if ((maPhanNhom != null) && (maPhanNhom.length() == 0)) {
			tthcPhanNhomHoSoCacheModel.maPhanNhom = null;
		}

		tthcPhanNhomHoSoCacheModel.tenPhanNhom = getTenPhanNhom();

		String tenPhanNhom = tthcPhanNhomHoSoCacheModel.tenPhanNhom;

		if ((tenPhanNhom != null) && (tenPhanNhom.length() == 0)) {
			tthcPhanNhomHoSoCacheModel.tenPhanNhom = null;
		}

		tthcPhanNhomHoSoCacheModel.tenTiengAnh = getTenTiengAnh();

		String tenTiengAnh = tthcPhanNhomHoSoCacheModel.tenTiengAnh;

		if ((tenTiengAnh != null) && (tenTiengAnh.length() == 0)) {
			tthcPhanNhomHoSoCacheModel.tenTiengAnh = null;
		}

		tthcPhanNhomHoSoCacheModel.soThuTu = getSoThuTu();

		tthcPhanNhomHoSoCacheModel.loaiPhanNhom = getLoaiPhanNhom();

		tthcPhanNhomHoSoCacheModel.toChucQuanLy = getToChucQuanLy();

		return tthcPhanNhomHoSoCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", maPhanNhom=");
		sb.append(getMaPhanNhom());
		sb.append(", tenPhanNhom=");
		sb.append(getTenPhanNhom());
		sb.append(", tenTiengAnh=");
		sb.append(getTenTiengAnh());
		sb.append(", soThuTu=");
		sb.append(getSoThuTu());
		sb.append(", loaiPhanNhom=");
		sb.append(getLoaiPhanNhom());
		sb.append(", toChucQuanLy=");
		sb.append(getToChucQuanLy());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maPhanNhom</column-name><column-value><![CDATA[");
		sb.append(getMaPhanNhom());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenPhanNhom</column-name><column-value><![CDATA[");
		sb.append(getTenPhanNhom());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenTiengAnh</column-name><column-value><![CDATA[");
		sb.append(getTenTiengAnh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soThuTu</column-name><column-value><![CDATA[");
		sb.append(getSoThuTu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiPhanNhom</column-name><column-value><![CDATA[");
		sb.append(getLoaiPhanNhom());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>toChucQuanLy</column-name><column-value><![CDATA[");
		sb.append(getToChucQuanLy());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = TthcPhanNhomHoSo.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			TthcPhanNhomHoSo.class
		};
	private long _id;
	private String _maPhanNhom;
	private String _originalMaPhanNhom;
	private String _tenPhanNhom;
	private String _tenTiengAnh;
	private int _soThuTu;
	private int _loaiPhanNhom;
	private long _toChucQuanLy;
	private long _originalToChucQuanLy;
	private boolean _setOriginalToChucQuanLy;
	private long _columnBitmask;
	private TthcPhanNhomHoSo _escapedModel;
}