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
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSoVaiTro;
import vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSoVaiTroModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the TthcPhanNhomHoSoVaiTro service. Represents a row in the &quot;tthc_phannhomhoso_vaitro&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSoVaiTroModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TthcPhanNhomHoSoVaiTroImpl}.
 * </p>
 *
 * @author win_64
 * @see TthcPhanNhomHoSoVaiTroImpl
 * @see vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSoVaiTro
 * @see vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSoVaiTroModel
 * @generated
 */
public class TthcPhanNhomHoSoVaiTroModelImpl extends BaseModelImpl<TthcPhanNhomHoSoVaiTro>
	implements TthcPhanNhomHoSoVaiTroModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tthc phan nhom ho so vai tro model instance should use the {@link vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSoVaiTro} interface instead.
	 */
	public static final String TABLE_NAME = "tthc_phannhomhoso_vaitro";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "phannhomhosoid", Types.BIGINT },
			{ "vaitroxuly", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table tthc_phannhomhoso_vaitro (id LONG not null primary key,phannhomhosoid LONG,vaitroxuly LONG)";
	public static final String TABLE_SQL_DROP = "drop table tthc_phannhomhoso_vaitro";
	public static final String ORDER_BY_JPQL = " ORDER BY tthcPhanNhomHoSoVaiTro.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY tthc_phannhomhoso_vaitro.id ASC";
	public static final String DATA_SOURCE = "tthcDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSoVaiTro"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSoVaiTro"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSoVaiTro"),
			true);
	public static long PHANNHOMHOSOID_COLUMN_BITMASK = 1L;
	public static long VAITROXULY_COLUMN_BITMASK = 2L;
	public static long ID_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSoVaiTro"));

	public TthcPhanNhomHoSoVaiTroModelImpl() {
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
		return TthcPhanNhomHoSoVaiTro.class;
	}

	@Override
	public String getModelClassName() {
		return TthcPhanNhomHoSoVaiTro.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("phanNhomHoSoId", getPhanNhomHoSoId());
		attributes.put("vaiTroXuLy", getVaiTroXuLy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long phanNhomHoSoId = (Long)attributes.get("phanNhomHoSoId");

		if (phanNhomHoSoId != null) {
			setPhanNhomHoSoId(phanNhomHoSoId);
		}

		Long vaiTroXuLy = (Long)attributes.get("vaiTroXuLy");

		if (vaiTroXuLy != null) {
			setVaiTroXuLy(vaiTroXuLy);
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
	public long getPhanNhomHoSoId() {
		return _phanNhomHoSoId;
	}

	@Override
	public void setPhanNhomHoSoId(long phanNhomHoSoId) {
		_columnBitmask |= PHANNHOMHOSOID_COLUMN_BITMASK;

		if (!_setOriginalPhanNhomHoSoId) {
			_setOriginalPhanNhomHoSoId = true;

			_originalPhanNhomHoSoId = _phanNhomHoSoId;
		}

		_phanNhomHoSoId = phanNhomHoSoId;
	}

	public long getOriginalPhanNhomHoSoId() {
		return _originalPhanNhomHoSoId;
	}

	@Override
	public long getVaiTroXuLy() {
		return _vaiTroXuLy;
	}

	@Override
	public void setVaiTroXuLy(long vaiTroXuLy) {
		_columnBitmask |= VAITROXULY_COLUMN_BITMASK;

		if (!_setOriginalVaiTroXuLy) {
			_setOriginalVaiTroXuLy = true;

			_originalVaiTroXuLy = _vaiTroXuLy;
		}

		_vaiTroXuLy = vaiTroXuLy;
	}

	public long getOriginalVaiTroXuLy() {
		return _originalVaiTroXuLy;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			TthcPhanNhomHoSoVaiTro.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TthcPhanNhomHoSoVaiTro toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (TthcPhanNhomHoSoVaiTro)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TthcPhanNhomHoSoVaiTroImpl tthcPhanNhomHoSoVaiTroImpl = new TthcPhanNhomHoSoVaiTroImpl();

		tthcPhanNhomHoSoVaiTroImpl.setId(getId());
		tthcPhanNhomHoSoVaiTroImpl.setPhanNhomHoSoId(getPhanNhomHoSoId());
		tthcPhanNhomHoSoVaiTroImpl.setVaiTroXuLy(getVaiTroXuLy());

		tthcPhanNhomHoSoVaiTroImpl.resetOriginalValues();

		return tthcPhanNhomHoSoVaiTroImpl;
	}

	@Override
	public int compareTo(TthcPhanNhomHoSoVaiTro tthcPhanNhomHoSoVaiTro) {
		int value = 0;

		if (getId() < tthcPhanNhomHoSoVaiTro.getId()) {
			value = -1;
		}
		else if (getId() > tthcPhanNhomHoSoVaiTro.getId()) {
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

		if (!(obj instanceof TthcPhanNhomHoSoVaiTro)) {
			return false;
		}

		TthcPhanNhomHoSoVaiTro tthcPhanNhomHoSoVaiTro = (TthcPhanNhomHoSoVaiTro)obj;

		long primaryKey = tthcPhanNhomHoSoVaiTro.getPrimaryKey();

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
		TthcPhanNhomHoSoVaiTroModelImpl tthcPhanNhomHoSoVaiTroModelImpl = this;

		tthcPhanNhomHoSoVaiTroModelImpl._originalPhanNhomHoSoId = tthcPhanNhomHoSoVaiTroModelImpl._phanNhomHoSoId;

		tthcPhanNhomHoSoVaiTroModelImpl._setOriginalPhanNhomHoSoId = false;

		tthcPhanNhomHoSoVaiTroModelImpl._originalVaiTroXuLy = tthcPhanNhomHoSoVaiTroModelImpl._vaiTroXuLy;

		tthcPhanNhomHoSoVaiTroModelImpl._setOriginalVaiTroXuLy = false;

		tthcPhanNhomHoSoVaiTroModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<TthcPhanNhomHoSoVaiTro> toCacheModel() {
		TthcPhanNhomHoSoVaiTroCacheModel tthcPhanNhomHoSoVaiTroCacheModel = new TthcPhanNhomHoSoVaiTroCacheModel();

		tthcPhanNhomHoSoVaiTroCacheModel.id = getId();

		tthcPhanNhomHoSoVaiTroCacheModel.phanNhomHoSoId = getPhanNhomHoSoId();

		tthcPhanNhomHoSoVaiTroCacheModel.vaiTroXuLy = getVaiTroXuLy();

		return tthcPhanNhomHoSoVaiTroCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", phanNhomHoSoId=");
		sb.append(getPhanNhomHoSoId());
		sb.append(", vaiTroXuLy=");
		sb.append(getVaiTroXuLy());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSoVaiTro");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phanNhomHoSoId</column-name><column-value><![CDATA[");
		sb.append(getPhanNhomHoSoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vaiTroXuLy</column-name><column-value><![CDATA[");
		sb.append(getVaiTroXuLy());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = TthcPhanNhomHoSoVaiTro.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			TthcPhanNhomHoSoVaiTro.class
		};
	private long _id;
	private long _phanNhomHoSoId;
	private long _originalPhanNhomHoSoId;
	private boolean _setOriginalPhanNhomHoSoId;
	private long _vaiTroXuLy;
	private long _originalVaiTroXuLy;
	private boolean _setOriginalVaiTroXuLy;
	private long _columnBitmask;
	private TthcPhanNhomHoSoVaiTro _escapedModel;
}