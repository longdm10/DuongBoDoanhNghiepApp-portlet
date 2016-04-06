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

import vn.dtt.duongbien.dao.vrcb.model.DmHistoryPassportType;
import vn.dtt.duongbien.dao.vrcb.model.DmHistoryPassportTypeModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the DmHistoryPassportType service. Represents a row in the &quot;DM_HISTORY_PASSPORT_TYPE&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbien.dao.vrcb.model.DmHistoryPassportTypeModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DmHistoryPassportTypeImpl}.
 * </p>
 *
 * @author longdm
 * @see DmHistoryPassportTypeImpl
 * @see vn.dtt.duongbien.dao.vrcb.model.DmHistoryPassportType
 * @see vn.dtt.duongbien.dao.vrcb.model.DmHistoryPassportTypeModel
 * @generated
 */
public class DmHistoryPassportTypeModelImpl extends BaseModelImpl<DmHistoryPassportType>
	implements DmHistoryPassportTypeModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dm history passport type model instance should use the {@link vn.dtt.duongbien.dao.vrcb.model.DmHistoryPassportType} interface instead.
	 */
	public static final String TABLE_NAME = "DM_HISTORY_PASSPORT_TYPE";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.INTEGER },
			{ "PassportTypeCode", Types.VARCHAR },
			{ "PassportType", Types.VARCHAR },
			{ "PassportTypeName", Types.VARCHAR },
			{ "PassportTypeNameVN", Types.VARCHAR },
			{ "IsDelete", Types.INTEGER },
			{ "MarkedAsDelete", Types.INTEGER },
			{ "ModifiedDate", Types.TIMESTAMP },
			{ "RequestedDate", Types.TIMESTAMP },
			{ "SyncVersion", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table DM_HISTORY_PASSPORT_TYPE (id INTEGER not null primary key,PassportTypeCode VARCHAR(75) null,PassportType VARCHAR(75) null,PassportTypeName VARCHAR(75) null,PassportTypeNameVN VARCHAR(75) null,IsDelete INTEGER,MarkedAsDelete INTEGER,ModifiedDate DATE null,RequestedDate DATE null,SyncVersion VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table DM_HISTORY_PASSPORT_TYPE";
	public static final String ORDER_BY_JPQL = " ORDER BY dmHistoryPassportType.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY DM_HISTORY_PASSPORT_TYPE.id ASC";
	public static final String DATA_SOURCE = "vaoracangbienDataSource";
	public static final String SESSION_FACTORY = "ravaocangbienSessionFactory";
	public static final String TX_MANAGER = "ravaocangbienTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.DmHistoryPassportType"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.DmHistoryPassportType"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.duongbien.dao.vrcb.model.DmHistoryPassportType"),
			true);
	public static long PASSPORTTYPECODE_COLUMN_BITMASK = 1L;
	public static long SYNCVERSION_COLUMN_BITMASK = 2L;
	public static long ID_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbien.dao.vrcb.model.DmHistoryPassportType"));

	public DmHistoryPassportTypeModelImpl() {
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
		return DmHistoryPassportType.class;
	}

	@Override
	public String getModelClassName() {
		return DmHistoryPassportType.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("passportTypeCode", getPassportTypeCode());
		attributes.put("passportType", getPassportType());
		attributes.put("passportTypeName", getPassportTypeName());
		attributes.put("passportTypeNameVN", getPassportTypeNameVN());
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

		String passportTypeCode = (String)attributes.get("passportTypeCode");

		if (passportTypeCode != null) {
			setPassportTypeCode(passportTypeCode);
		}

		String passportType = (String)attributes.get("passportType");

		if (passportType != null) {
			setPassportType(passportType);
		}

		String passportTypeName = (String)attributes.get("passportTypeName");

		if (passportTypeName != null) {
			setPassportTypeName(passportTypeName);
		}

		String passportTypeNameVN = (String)attributes.get("passportTypeNameVN");

		if (passportTypeNameVN != null) {
			setPassportTypeNameVN(passportTypeNameVN);
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
	public String getPassportTypeCode() {
		if (_passportTypeCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _passportTypeCode;
		}
	}

	@Override
	public void setPassportTypeCode(String passportTypeCode) {
		_columnBitmask |= PASSPORTTYPECODE_COLUMN_BITMASK;

		if (_originalPassportTypeCode == null) {
			_originalPassportTypeCode = _passportTypeCode;
		}

		_passportTypeCode = passportTypeCode;
	}

	public String getOriginalPassportTypeCode() {
		return GetterUtil.getString(_originalPassportTypeCode);
	}

	@Override
	public String getPassportType() {
		if (_passportType == null) {
			return StringPool.BLANK;
		}
		else {
			return _passportType;
		}
	}

	@Override
	public void setPassportType(String passportType) {
		_passportType = passportType;
	}

	@Override
	public String getPassportTypeName() {
		if (_passportTypeName == null) {
			return StringPool.BLANK;
		}
		else {
			return _passportTypeName;
		}
	}

	@Override
	public void setPassportTypeName(String passportTypeName) {
		_passportTypeName = passportTypeName;
	}

	@Override
	public String getPassportTypeNameVN() {
		if (_passportTypeNameVN == null) {
			return StringPool.BLANK;
		}
		else {
			return _passportTypeNameVN;
		}
	}

	@Override
	public void setPassportTypeNameVN(String passportTypeNameVN) {
		_passportTypeNameVN = passportTypeNameVN;
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
	public DmHistoryPassportType toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DmHistoryPassportType)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DmHistoryPassportTypeImpl dmHistoryPassportTypeImpl = new DmHistoryPassportTypeImpl();

		dmHistoryPassportTypeImpl.setId(getId());
		dmHistoryPassportTypeImpl.setPassportTypeCode(getPassportTypeCode());
		dmHistoryPassportTypeImpl.setPassportType(getPassportType());
		dmHistoryPassportTypeImpl.setPassportTypeName(getPassportTypeName());
		dmHistoryPassportTypeImpl.setPassportTypeNameVN(getPassportTypeNameVN());
		dmHistoryPassportTypeImpl.setIsDelete(getIsDelete());
		dmHistoryPassportTypeImpl.setMarkedAsDelete(getMarkedAsDelete());
		dmHistoryPassportTypeImpl.setModifiedDate(getModifiedDate());
		dmHistoryPassportTypeImpl.setRequestedDate(getRequestedDate());
		dmHistoryPassportTypeImpl.setSyncVersion(getSyncVersion());

		dmHistoryPassportTypeImpl.resetOriginalValues();

		return dmHistoryPassportTypeImpl;
	}

	@Override
	public int compareTo(DmHistoryPassportType dmHistoryPassportType) {
		int value = 0;

		if (getId() < dmHistoryPassportType.getId()) {
			value = -1;
		}
		else if (getId() > dmHistoryPassportType.getId()) {
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

		if (!(obj instanceof DmHistoryPassportType)) {
			return false;
		}

		DmHistoryPassportType dmHistoryPassportType = (DmHistoryPassportType)obj;

		int primaryKey = dmHistoryPassportType.getPrimaryKey();

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
		DmHistoryPassportTypeModelImpl dmHistoryPassportTypeModelImpl = this;

		dmHistoryPassportTypeModelImpl._originalPassportTypeCode = dmHistoryPassportTypeModelImpl._passportTypeCode;

		dmHistoryPassportTypeModelImpl._originalSyncVersion = dmHistoryPassportTypeModelImpl._syncVersion;

		dmHistoryPassportTypeModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DmHistoryPassportType> toCacheModel() {
		DmHistoryPassportTypeCacheModel dmHistoryPassportTypeCacheModel = new DmHistoryPassportTypeCacheModel();

		dmHistoryPassportTypeCacheModel.id = getId();

		dmHistoryPassportTypeCacheModel.passportTypeCode = getPassportTypeCode();

		String passportTypeCode = dmHistoryPassportTypeCacheModel.passportTypeCode;

		if ((passportTypeCode != null) && (passportTypeCode.length() == 0)) {
			dmHistoryPassportTypeCacheModel.passportTypeCode = null;
		}

		dmHistoryPassportTypeCacheModel.passportType = getPassportType();

		String passportType = dmHistoryPassportTypeCacheModel.passportType;

		if ((passportType != null) && (passportType.length() == 0)) {
			dmHistoryPassportTypeCacheModel.passportType = null;
		}

		dmHistoryPassportTypeCacheModel.passportTypeName = getPassportTypeName();

		String passportTypeName = dmHistoryPassportTypeCacheModel.passportTypeName;

		if ((passportTypeName != null) && (passportTypeName.length() == 0)) {
			dmHistoryPassportTypeCacheModel.passportTypeName = null;
		}

		dmHistoryPassportTypeCacheModel.passportTypeNameVN = getPassportTypeNameVN();

		String passportTypeNameVN = dmHistoryPassportTypeCacheModel.passportTypeNameVN;

		if ((passportTypeNameVN != null) && (passportTypeNameVN.length() == 0)) {
			dmHistoryPassportTypeCacheModel.passportTypeNameVN = null;
		}

		dmHistoryPassportTypeCacheModel.isDelete = getIsDelete();

		dmHistoryPassportTypeCacheModel.markedAsDelete = getMarkedAsDelete();

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			dmHistoryPassportTypeCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			dmHistoryPassportTypeCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		Date requestedDate = getRequestedDate();

		if (requestedDate != null) {
			dmHistoryPassportTypeCacheModel.requestedDate = requestedDate.getTime();
		}
		else {
			dmHistoryPassportTypeCacheModel.requestedDate = Long.MIN_VALUE;
		}

		dmHistoryPassportTypeCacheModel.syncVersion = getSyncVersion();

		String syncVersion = dmHistoryPassportTypeCacheModel.syncVersion;

		if ((syncVersion != null) && (syncVersion.length() == 0)) {
			dmHistoryPassportTypeCacheModel.syncVersion = null;
		}

		return dmHistoryPassportTypeCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", passportTypeCode=");
		sb.append(getPassportTypeCode());
		sb.append(", passportType=");
		sb.append(getPassportType());
		sb.append(", passportTypeName=");
		sb.append(getPassportTypeName());
		sb.append(", passportTypeNameVN=");
		sb.append(getPassportTypeNameVN());
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
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DmHistoryPassportType");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>passportTypeCode</column-name><column-value><![CDATA[");
		sb.append(getPassportTypeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>passportType</column-name><column-value><![CDATA[");
		sb.append(getPassportType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>passportTypeName</column-name><column-value><![CDATA[");
		sb.append(getPassportTypeName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>passportTypeNameVN</column-name><column-value><![CDATA[");
		sb.append(getPassportTypeNameVN());
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

	private static ClassLoader _classLoader = DmHistoryPassportType.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DmHistoryPassportType.class
		};
	private int _id;
	private String _passportTypeCode;
	private String _originalPassportTypeCode;
	private String _passportType;
	private String _passportTypeName;
	private String _passportTypeNameVN;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private String _originalSyncVersion;
	private long _columnBitmask;
	private DmHistoryPassportType _escapedModel;
}