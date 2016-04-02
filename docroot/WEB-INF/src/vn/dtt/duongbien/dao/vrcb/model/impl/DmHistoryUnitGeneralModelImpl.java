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

package vn.dtt.duongbien.dao.vrcb.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbien.dao.vrcb.model.DmHistoryUnitGeneral;
import vn.dtt.duongbien.dao.vrcb.model.DmHistoryUnitGeneralModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the DmHistoryUnitGeneral service. Represents a row in the &quot;DM_HISTORY_UNIT_GENERAL&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbien.dao.vrcb.model.DmHistoryUnitGeneralModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DmHistoryUnitGeneralImpl}.
 * </p>
 *
 * @author longdm
 * @see DmHistoryUnitGeneralImpl
 * @see vn.dtt.duongbien.dao.vrcb.model.DmHistoryUnitGeneral
 * @see vn.dtt.duongbien.dao.vrcb.model.DmHistoryUnitGeneralModel
 * @generated
 */
public class DmHistoryUnitGeneralModelImpl extends BaseModelImpl<DmHistoryUnitGeneral>
	implements DmHistoryUnitGeneralModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dm history unit general model instance should use the {@link vn.dtt.duongbien.dao.vrcb.model.DmHistoryUnitGeneral} interface instead.
	 */
	public static final String TABLE_NAME = "DM_HISTORY_UNIT_GENERAL";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.INTEGER },
			{ "UnitCode", Types.VARCHAR },
			{ "UnitName", Types.VARCHAR },
			{ "IsDelete", Types.INTEGER },
			{ "MarkedAsDelete", Types.INTEGER },
			{ "ModifiedDate", Types.TIMESTAMP },
			{ "RequestedDate", Types.TIMESTAMP },
			{ "SyncVersion", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table DM_HISTORY_UNIT_GENERAL (id INTEGER not null primary key,UnitCode VARCHAR(75) null,UnitName VARCHAR(75) null,IsDelete INTEGER,MarkedAsDelete INTEGER,ModifiedDate DATE null,RequestedDate DATE null,SyncVersion VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table DM_HISTORY_UNIT_GENERAL";
	public static final String ORDER_BY_JPQL = " ORDER BY dmHistoryUnitGeneral.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY DM_HISTORY_UNIT_GENERAL.id ASC";
	public static final String DATA_SOURCE = "vaoracangbienDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.DmHistoryUnitGeneral"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.DmHistoryUnitGeneral"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.duongbien.dao.vrcb.model.DmHistoryUnitGeneral"),
			true);
	public static long SYNCVERSION_COLUMN_BITMASK = 1L;
	public static long UNITCODE_COLUMN_BITMASK = 2L;
	public static long ID_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbien.dao.vrcb.model.DmHistoryUnitGeneral"));

	public DmHistoryUnitGeneralModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Class<?> getModelClass() {
		return DmHistoryUnitGeneral.class;
	}

	@Override
	public String getModelClassName() {
		return DmHistoryUnitGeneral.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("unitCode", getUnitCode());
		attributes.put("unitName", getUnitName());
		attributes.put("isDelete", getIsDelete());
		attributes.put("markedAsDelete", getMarkedAsDelete());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("requestedDate", getRequestedDate());
		attributes.put("syncVersion", getSyncVersion());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String unitCode = (String)attributes.get("unitCode");

		if (unitCode != null) {
			setUnitCode(unitCode);
		}

		String unitName = (String)attributes.get("unitName");

		if (unitName != null) {
			setUnitName(unitName);
		}

		Integer isDelete = (Integer)attributes.get("isDelete");

		if (isDelete != null) {
			setIsDelete(isDelete);
		}

		Integer markedAsDelete = (Integer)attributes.get("markedAsDelete");

		if (markedAsDelete != null) {
			setMarkedAsDelete(markedAsDelete);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Date requestedDate = (Date)attributes.get("requestedDate");

		if (requestedDate != null) {
			setRequestedDate(requestedDate);
		}

		String syncVersion = (String)attributes.get("syncVersion");

		if (syncVersion != null) {
			setSyncVersion(syncVersion);
		}
	}

	@Override
	public int getId() {
		return _id;
	}

	@Override
	public void setId(int id) {
		_columnBitmask = -1L;

		_id = id;
	}

	@Override
	public String getUnitCode() {
		if (_unitCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _unitCode;
		}
	}

	@Override
	public void setUnitCode(String unitCode) {
		_columnBitmask |= UNITCODE_COLUMN_BITMASK;

		if (_originalUnitCode == null) {
			_originalUnitCode = _unitCode;
		}

		_unitCode = unitCode;
	}

	public String getOriginalUnitCode() {
		return GetterUtil.getString(_originalUnitCode);
	}

	@Override
	public String getUnitName() {
		if (_unitName == null) {
			return StringPool.BLANK;
		}
		else {
			return _unitName;
		}
	}

	@Override
	public void setUnitName(String unitName) {
		_unitName = unitName;
	}

	@Override
	public int getIsDelete() {
		return _isDelete;
	}

	@Override
	public void setIsDelete(int isDelete) {
		_isDelete = isDelete;
	}

	@Override
	public int getMarkedAsDelete() {
		return _markedAsDelete;
	}

	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_markedAsDelete = markedAsDelete;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@Override
	public Date getRequestedDate() {
		return _requestedDate;
	}

	@Override
	public void setRequestedDate(Date requestedDate) {
		_requestedDate = requestedDate;
	}

	@Override
	public String getSyncVersion() {
		if (_syncVersion == null) {
			return StringPool.BLANK;
		}
		else {
			return _syncVersion;
		}
	}

	@Override
	public void setSyncVersion(String syncVersion) {
		_columnBitmask |= SYNCVERSION_COLUMN_BITMASK;

		if (_originalSyncVersion == null) {
			_originalSyncVersion = _syncVersion;
		}

		_syncVersion = syncVersion;
	}

	public String getOriginalSyncVersion() {
		return GetterUtil.getString(_originalSyncVersion);
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public DmHistoryUnitGeneral toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DmHistoryUnitGeneral)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DmHistoryUnitGeneralImpl dmHistoryUnitGeneralImpl = new DmHistoryUnitGeneralImpl();

		dmHistoryUnitGeneralImpl.setId(getId());
		dmHistoryUnitGeneralImpl.setUnitCode(getUnitCode());
		dmHistoryUnitGeneralImpl.setUnitName(getUnitName());
		dmHistoryUnitGeneralImpl.setIsDelete(getIsDelete());
		dmHistoryUnitGeneralImpl.setMarkedAsDelete(getMarkedAsDelete());
		dmHistoryUnitGeneralImpl.setModifiedDate(getModifiedDate());
		dmHistoryUnitGeneralImpl.setRequestedDate(getRequestedDate());
		dmHistoryUnitGeneralImpl.setSyncVersion(getSyncVersion());

		dmHistoryUnitGeneralImpl.resetOriginalValues();

		return dmHistoryUnitGeneralImpl;
	}

	@Override
	public int compareTo(DmHistoryUnitGeneral dmHistoryUnitGeneral) {
		int value = 0;

		if (getId() < dmHistoryUnitGeneral.getId()) {
			value = -1;
		}
		else if (getId() > dmHistoryUnitGeneral.getId()) {
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

		if (!(obj instanceof DmHistoryUnitGeneral)) {
			return false;
		}

		DmHistoryUnitGeneral dmHistoryUnitGeneral = (DmHistoryUnitGeneral)obj;

		int primaryKey = dmHistoryUnitGeneral.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		DmHistoryUnitGeneralModelImpl dmHistoryUnitGeneralModelImpl = this;

		dmHistoryUnitGeneralModelImpl._originalUnitCode = dmHistoryUnitGeneralModelImpl._unitCode;

		dmHistoryUnitGeneralModelImpl._originalSyncVersion = dmHistoryUnitGeneralModelImpl._syncVersion;

		dmHistoryUnitGeneralModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DmHistoryUnitGeneral> toCacheModel() {
		DmHistoryUnitGeneralCacheModel dmHistoryUnitGeneralCacheModel = new DmHistoryUnitGeneralCacheModel();

		dmHistoryUnitGeneralCacheModel.id = getId();

		dmHistoryUnitGeneralCacheModel.unitCode = getUnitCode();

		String unitCode = dmHistoryUnitGeneralCacheModel.unitCode;

		if ((unitCode != null) && (unitCode.length() == 0)) {
			dmHistoryUnitGeneralCacheModel.unitCode = null;
		}

		dmHistoryUnitGeneralCacheModel.unitName = getUnitName();

		String unitName = dmHistoryUnitGeneralCacheModel.unitName;

		if ((unitName != null) && (unitName.length() == 0)) {
			dmHistoryUnitGeneralCacheModel.unitName = null;
		}

		dmHistoryUnitGeneralCacheModel.isDelete = getIsDelete();

		dmHistoryUnitGeneralCacheModel.markedAsDelete = getMarkedAsDelete();

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			dmHistoryUnitGeneralCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			dmHistoryUnitGeneralCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		Date requestedDate = getRequestedDate();

		if (requestedDate != null) {
			dmHistoryUnitGeneralCacheModel.requestedDate = requestedDate.getTime();
		}
		else {
			dmHistoryUnitGeneralCacheModel.requestedDate = Long.MIN_VALUE;
		}

		dmHistoryUnitGeneralCacheModel.syncVersion = getSyncVersion();

		String syncVersion = dmHistoryUnitGeneralCacheModel.syncVersion;

		if ((syncVersion != null) && (syncVersion.length() == 0)) {
			dmHistoryUnitGeneralCacheModel.syncVersion = null;
		}

		return dmHistoryUnitGeneralCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", unitCode=");
		sb.append(getUnitCode());
		sb.append(", unitName=");
		sb.append(getUnitName());
		sb.append(", isDelete=");
		sb.append(getIsDelete());
		sb.append(", markedAsDelete=");
		sb.append(getMarkedAsDelete());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", requestedDate=");
		sb.append(getRequestedDate());
		sb.append(", syncVersion=");
		sb.append(getSyncVersion());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DmHistoryUnitGeneral");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitCode</column-name><column-value><![CDATA[");
		sb.append(getUnitCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitName</column-name><column-value><![CDATA[");
		sb.append(getUnitName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isDelete</column-name><column-value><![CDATA[");
		sb.append(getIsDelete());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markedAsDelete</column-name><column-value><![CDATA[");
		sb.append(getMarkedAsDelete());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestedDate</column-name><column-value><![CDATA[");
		sb.append(getRequestedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>syncVersion</column-name><column-value><![CDATA[");
		sb.append(getSyncVersion());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = DmHistoryUnitGeneral.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DmHistoryUnitGeneral.class
		};
	private int _id;
	private String _unitCode;
	private String _originalUnitCode;
	private String _unitName;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private String _originalSyncVersion;
	private long _columnBitmask;
	private DmHistoryUnitGeneral _escapedModel;
}