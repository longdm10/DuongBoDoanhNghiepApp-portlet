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

import vn.dtt.duongbien.dao.vrcb.model.DmHistorySecurityLevel;
import vn.dtt.duongbien.dao.vrcb.model.DmHistorySecurityLevelModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the DmHistorySecurityLevel service. Represents a row in the &quot;DM_HISTORY_SECURITY_LEVEL&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbien.dao.vrcb.model.DmHistorySecurityLevelModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DmHistorySecurityLevelImpl}.
 * </p>
 *
 * @author longdm
 * @see DmHistorySecurityLevelImpl
 * @see vn.dtt.duongbien.dao.vrcb.model.DmHistorySecurityLevel
 * @see vn.dtt.duongbien.dao.vrcb.model.DmHistorySecurityLevelModel
 * @generated
 */
public class DmHistorySecurityLevelModelImpl extends BaseModelImpl<DmHistorySecurityLevel>
	implements DmHistorySecurityLevelModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dm history security level model instance should use the {@link vn.dtt.duongbien.dao.vrcb.model.DmHistorySecurityLevel} interface instead.
	 */
	public static final String TABLE_NAME = "DM_HISTORY_SECURITY_LEVEL";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.INTEGER },
			{ "SecurityLevelCode", Types.VARCHAR },
			{ "SecurityLevel", Types.VARCHAR },
			{ "SecurityLevelName", Types.VARCHAR },
			{ "IsDelete", Types.INTEGER },
			{ "MarkedAsDelete", Types.INTEGER },
			{ "ModifiedDate", Types.TIMESTAMP },
			{ "RequestedDate", Types.TIMESTAMP },
			{ "SyncVersion", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table DM_HISTORY_SECURITY_LEVEL (id INTEGER not null primary key,SecurityLevelCode VARCHAR(75) null,SecurityLevel VARCHAR(75) null,SecurityLevelName VARCHAR(75) null,IsDelete INTEGER,MarkedAsDelete INTEGER,ModifiedDate DATE null,RequestedDate DATE null,SyncVersion VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table DM_HISTORY_SECURITY_LEVEL";
	public static final String ORDER_BY_JPQL = " ORDER BY dmHistorySecurityLevel.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY DM_HISTORY_SECURITY_LEVEL.id ASC";
	public static final String DATA_SOURCE = "vaoracangbienDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.DmHistorySecurityLevel"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.DmHistorySecurityLevel"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.duongbien.dao.vrcb.model.DmHistorySecurityLevel"),
			true);
	public static long SECURITYLEVELCODE_COLUMN_BITMASK = 1L;
	public static long SYNCVERSION_COLUMN_BITMASK = 2L;
	public static long ID_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbien.dao.vrcb.model.DmHistorySecurityLevel"));

	public DmHistorySecurityLevelModelImpl() {
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
		return DmHistorySecurityLevel.class;
	}

	@Override
	public String getModelClassName() {
		return DmHistorySecurityLevel.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("securityLevelCode", getSecurityLevelCode());
		attributes.put("securityLevel", getSecurityLevel());
		attributes.put("securityLevelName", getSecurityLevelName());
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

		String securityLevelCode = (String)attributes.get("securityLevelCode");

		if (securityLevelCode != null) {
			setSecurityLevelCode(securityLevelCode);
		}

		String securityLevel = (String)attributes.get("securityLevel");

		if (securityLevel != null) {
			setSecurityLevel(securityLevel);
		}

		String securityLevelName = (String)attributes.get("securityLevelName");

		if (securityLevelName != null) {
			setSecurityLevelName(securityLevelName);
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
	public String getSecurityLevelCode() {
		if (_securityLevelCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _securityLevelCode;
		}
	}

	@Override
	public void setSecurityLevelCode(String securityLevelCode) {
		_columnBitmask |= SECURITYLEVELCODE_COLUMN_BITMASK;

		if (_originalSecurityLevelCode == null) {
			_originalSecurityLevelCode = _securityLevelCode;
		}

		_securityLevelCode = securityLevelCode;
	}

	public String getOriginalSecurityLevelCode() {
		return GetterUtil.getString(_originalSecurityLevelCode);
	}

	@Override
	public String getSecurityLevel() {
		if (_securityLevel == null) {
			return StringPool.BLANK;
		}
		else {
			return _securityLevel;
		}
	}

	@Override
	public void setSecurityLevel(String securityLevel) {
		_securityLevel = securityLevel;
	}

	@Override
	public String getSecurityLevelName() {
		if (_securityLevelName == null) {
			return StringPool.BLANK;
		}
		else {
			return _securityLevelName;
		}
	}

	@Override
	public void setSecurityLevelName(String securityLevelName) {
		_securityLevelName = securityLevelName;
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
	public DmHistorySecurityLevel toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DmHistorySecurityLevel)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DmHistorySecurityLevelImpl dmHistorySecurityLevelImpl = new DmHistorySecurityLevelImpl();

		dmHistorySecurityLevelImpl.setId(getId());
		dmHistorySecurityLevelImpl.setSecurityLevelCode(getSecurityLevelCode());
		dmHistorySecurityLevelImpl.setSecurityLevel(getSecurityLevel());
		dmHistorySecurityLevelImpl.setSecurityLevelName(getSecurityLevelName());
		dmHistorySecurityLevelImpl.setIsDelete(getIsDelete());
		dmHistorySecurityLevelImpl.setMarkedAsDelete(getMarkedAsDelete());
		dmHistorySecurityLevelImpl.setModifiedDate(getModifiedDate());
		dmHistorySecurityLevelImpl.setRequestedDate(getRequestedDate());
		dmHistorySecurityLevelImpl.setSyncVersion(getSyncVersion());

		dmHistorySecurityLevelImpl.resetOriginalValues();

		return dmHistorySecurityLevelImpl;
	}

	@Override
	public int compareTo(DmHistorySecurityLevel dmHistorySecurityLevel) {
		int value = 0;

		if (getId() < dmHistorySecurityLevel.getId()) {
			value = -1;
		}
		else if (getId() > dmHistorySecurityLevel.getId()) {
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

		if (!(obj instanceof DmHistorySecurityLevel)) {
			return false;
		}

		DmHistorySecurityLevel dmHistorySecurityLevel = (DmHistorySecurityLevel)obj;

		int primaryKey = dmHistorySecurityLevel.getPrimaryKey();

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
		DmHistorySecurityLevelModelImpl dmHistorySecurityLevelModelImpl = this;

		dmHistorySecurityLevelModelImpl._originalSecurityLevelCode = dmHistorySecurityLevelModelImpl._securityLevelCode;

		dmHistorySecurityLevelModelImpl._originalSyncVersion = dmHistorySecurityLevelModelImpl._syncVersion;

		dmHistorySecurityLevelModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DmHistorySecurityLevel> toCacheModel() {
		DmHistorySecurityLevelCacheModel dmHistorySecurityLevelCacheModel = new DmHistorySecurityLevelCacheModel();

		dmHistorySecurityLevelCacheModel.id = getId();

		dmHistorySecurityLevelCacheModel.securityLevelCode = getSecurityLevelCode();

		String securityLevelCode = dmHistorySecurityLevelCacheModel.securityLevelCode;

		if ((securityLevelCode != null) && (securityLevelCode.length() == 0)) {
			dmHistorySecurityLevelCacheModel.securityLevelCode = null;
		}

		dmHistorySecurityLevelCacheModel.securityLevel = getSecurityLevel();

		String securityLevel = dmHistorySecurityLevelCacheModel.securityLevel;

		if ((securityLevel != null) && (securityLevel.length() == 0)) {
			dmHistorySecurityLevelCacheModel.securityLevel = null;
		}

		dmHistorySecurityLevelCacheModel.securityLevelName = getSecurityLevelName();

		String securityLevelName = dmHistorySecurityLevelCacheModel.securityLevelName;

		if ((securityLevelName != null) && (securityLevelName.length() == 0)) {
			dmHistorySecurityLevelCacheModel.securityLevelName = null;
		}

		dmHistorySecurityLevelCacheModel.isDelete = getIsDelete();

		dmHistorySecurityLevelCacheModel.markedAsDelete = getMarkedAsDelete();

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			dmHistorySecurityLevelCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			dmHistorySecurityLevelCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		Date requestedDate = getRequestedDate();

		if (requestedDate != null) {
			dmHistorySecurityLevelCacheModel.requestedDate = requestedDate.getTime();
		}
		else {
			dmHistorySecurityLevelCacheModel.requestedDate = Long.MIN_VALUE;
		}

		dmHistorySecurityLevelCacheModel.syncVersion = getSyncVersion();

		String syncVersion = dmHistorySecurityLevelCacheModel.syncVersion;

		if ((syncVersion != null) && (syncVersion.length() == 0)) {
			dmHistorySecurityLevelCacheModel.syncVersion = null;
		}

		return dmHistorySecurityLevelCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", securityLevelCode=");
		sb.append(getSecurityLevelCode());
		sb.append(", securityLevel=");
		sb.append(getSecurityLevel());
		sb.append(", securityLevelName=");
		sb.append(getSecurityLevelName());
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
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DmHistorySecurityLevel");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>securityLevelCode</column-name><column-value><![CDATA[");
		sb.append(getSecurityLevelCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>securityLevel</column-name><column-value><![CDATA[");
		sb.append(getSecurityLevel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>securityLevelName</column-name><column-value><![CDATA[");
		sb.append(getSecurityLevelName());
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

	private static ClassLoader _classLoader = DmHistorySecurityLevel.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DmHistorySecurityLevel.class
		};
	private int _id;
	private String _securityLevelCode;
	private String _originalSecurityLevelCode;
	private String _securityLevel;
	private String _securityLevelName;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private String _originalSyncVersion;
	private long _columnBitmask;
	private DmHistorySecurityLevel _escapedModel;
}