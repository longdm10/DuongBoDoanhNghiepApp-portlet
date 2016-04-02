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

import vn.dtt.duongbien.dao.vrcb.model.DmPassportType;
import vn.dtt.duongbien.dao.vrcb.model.DmPassportTypeModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the DmPassportType service. Represents a row in the &quot;DM_PASSPORT_TYPE&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbien.dao.vrcb.model.DmPassportTypeModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DmPassportTypeImpl}.
 * </p>
 *
 * @author longdm
 * @see DmPassportTypeImpl
 * @see vn.dtt.duongbien.dao.vrcb.model.DmPassportType
 * @see vn.dtt.duongbien.dao.vrcb.model.DmPassportTypeModel
 * @generated
 */
public class DmPassportTypeModelImpl extends BaseModelImpl<DmPassportType>
	implements DmPassportTypeModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dm passport type model instance should use the {@link vn.dtt.duongbien.dao.vrcb.model.DmPassportType} interface instead.
	 */
	public static final String TABLE_NAME = "DM_PASSPORT_TYPE";
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
	public static final String TABLE_SQL_CREATE = "create table DM_PASSPORT_TYPE (id INTEGER not null primary key,PassportTypeCode VARCHAR(75) null,PassportType VARCHAR(75) null,PassportTypeName VARCHAR(75) null,PassportTypeNameVN VARCHAR(75) null,IsDelete INTEGER,MarkedAsDelete INTEGER,ModifiedDate DATE null,RequestedDate DATE null,SyncVersion VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table DM_PASSPORT_TYPE";
	public static final String ORDER_BY_JPQL = " ORDER BY dmPassportType.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY DM_PASSPORT_TYPE.id ASC";
	public static final String DATA_SOURCE = "vaoracangbienDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.DmPassportType"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.DmPassportType"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.duongbien.dao.vrcb.model.DmPassportType"),
			true);
	public static long PASSPORTTYPECODE_COLUMN_BITMASK = 1L;
	public static long ID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbien.dao.vrcb.model.DmPassportType"));

	public DmPassportTypeModelImpl() {
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
		return DmPassportType.class;
	}

	@Override
	public String getModelClassName() {
		return DmPassportType.class.getName();
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
		_syncVersion = syncVersion;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public DmPassportType toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DmPassportType)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DmPassportTypeImpl dmPassportTypeImpl = new DmPassportTypeImpl();

		dmPassportTypeImpl.setId(getId());
		dmPassportTypeImpl.setPassportTypeCode(getPassportTypeCode());
		dmPassportTypeImpl.setPassportType(getPassportType());
		dmPassportTypeImpl.setPassportTypeName(getPassportTypeName());
		dmPassportTypeImpl.setPassportTypeNameVN(getPassportTypeNameVN());
		dmPassportTypeImpl.setIsDelete(getIsDelete());
		dmPassportTypeImpl.setMarkedAsDelete(getMarkedAsDelete());
		dmPassportTypeImpl.setModifiedDate(getModifiedDate());
		dmPassportTypeImpl.setRequestedDate(getRequestedDate());
		dmPassportTypeImpl.setSyncVersion(getSyncVersion());

		dmPassportTypeImpl.resetOriginalValues();

		return dmPassportTypeImpl;
	}

	@Override
	public int compareTo(DmPassportType dmPassportType) {
		int value = 0;

		if (getId() < dmPassportType.getId()) {
			value = -1;
		}
		else if (getId() > dmPassportType.getId()) {
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

		if (!(obj instanceof DmPassportType)) {
			return false;
		}

		DmPassportType dmPassportType = (DmPassportType)obj;

		int primaryKey = dmPassportType.getPrimaryKey();

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
		DmPassportTypeModelImpl dmPassportTypeModelImpl = this;

		dmPassportTypeModelImpl._originalPassportTypeCode = dmPassportTypeModelImpl._passportTypeCode;

		dmPassportTypeModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DmPassportType> toCacheModel() {
		DmPassportTypeCacheModel dmPassportTypeCacheModel = new DmPassportTypeCacheModel();

		dmPassportTypeCacheModel.id = getId();

		dmPassportTypeCacheModel.passportTypeCode = getPassportTypeCode();

		String passportTypeCode = dmPassportTypeCacheModel.passportTypeCode;

		if ((passportTypeCode != null) && (passportTypeCode.length() == 0)) {
			dmPassportTypeCacheModel.passportTypeCode = null;
		}

		dmPassportTypeCacheModel.passportType = getPassportType();

		String passportType = dmPassportTypeCacheModel.passportType;

		if ((passportType != null) && (passportType.length() == 0)) {
			dmPassportTypeCacheModel.passportType = null;
		}

		dmPassportTypeCacheModel.passportTypeName = getPassportTypeName();

		String passportTypeName = dmPassportTypeCacheModel.passportTypeName;

		if ((passportTypeName != null) && (passportTypeName.length() == 0)) {
			dmPassportTypeCacheModel.passportTypeName = null;
		}

		dmPassportTypeCacheModel.passportTypeNameVN = getPassportTypeNameVN();

		String passportTypeNameVN = dmPassportTypeCacheModel.passportTypeNameVN;

		if ((passportTypeNameVN != null) && (passportTypeNameVN.length() == 0)) {
			dmPassportTypeCacheModel.passportTypeNameVN = null;
		}

		dmPassportTypeCacheModel.isDelete = getIsDelete();

		dmPassportTypeCacheModel.markedAsDelete = getMarkedAsDelete();

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			dmPassportTypeCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			dmPassportTypeCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		Date requestedDate = getRequestedDate();

		if (requestedDate != null) {
			dmPassportTypeCacheModel.requestedDate = requestedDate.getTime();
		}
		else {
			dmPassportTypeCacheModel.requestedDate = Long.MIN_VALUE;
		}

		dmPassportTypeCacheModel.syncVersion = getSyncVersion();

		String syncVersion = dmPassportTypeCacheModel.syncVersion;

		if ((syncVersion != null) && (syncVersion.length() == 0)) {
			dmPassportTypeCacheModel.syncVersion = null;
		}

		return dmPassportTypeCacheModel;
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
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DmPassportType");
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

	private static ClassLoader _classLoader = DmPassportType.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DmPassportType.class
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
	private long _columnBitmask;
	private DmPassportType _escapedModel;
}