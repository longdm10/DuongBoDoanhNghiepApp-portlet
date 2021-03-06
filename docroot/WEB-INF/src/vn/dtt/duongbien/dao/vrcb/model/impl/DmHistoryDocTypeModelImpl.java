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

import vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType;
import vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocTypeModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the DmHistoryDocType service. Represents a row in the &quot;DM_HISTORY_DOC_TYPE&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocTypeModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DmHistoryDocTypeImpl}.
 * </p>
 *
 * @author longdm
 * @see DmHistoryDocTypeImpl
 * @see vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType
 * @see vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocTypeModel
 * @generated
 */
public class DmHistoryDocTypeModelImpl extends BaseModelImpl<DmHistoryDocType>
	implements DmHistoryDocTypeModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dm history doc type model instance should use the {@link vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType} interface instead.
	 */
	public static final String TABLE_NAME = "DM_HISTORY_DOC_TYPE";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.INTEGER },
			{ "DocumentTypeCode", Types.VARCHAR },
			{ "DocumentType", Types.VARCHAR },
			{ "DocumentTypeName", Types.VARCHAR },
			{ "IsDelete", Types.INTEGER },
			{ "MarkedAsDelete", Types.INTEGER },
			{ "ModifiedDate", Types.TIMESTAMP },
			{ "RequestedDate", Types.TIMESTAMP },
			{ "SyncVersion", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table DM_HISTORY_DOC_TYPE (id INTEGER not null primary key,DocumentTypeCode VARCHAR(75) null,DocumentType VARCHAR(75) null,DocumentTypeName VARCHAR(75) null,IsDelete INTEGER,MarkedAsDelete INTEGER,ModifiedDate DATE null,RequestedDate DATE null,SyncVersion VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table DM_HISTORY_DOC_TYPE";
	public static final String ORDER_BY_JPQL = " ORDER BY dmHistoryDocType.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY DM_HISTORY_DOC_TYPE.id ASC";
	public static final String DATA_SOURCE = "vaoracangbienDataSource";
	public static final String SESSION_FACTORY = "ravaocangbienSessionFactory";
	public static final String TX_MANAGER = "ravaocangbienTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType"),
			true);
	public static long DOCUMENTTYPE_COLUMN_BITMASK = 1L;
	public static long SYNCVERSION_COLUMN_BITMASK = 2L;
	public static long ID_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType"));

	public DmHistoryDocTypeModelImpl() {
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
		return DmHistoryDocType.class;
	}

	@Override
	public String getModelClassName() {
		return DmHistoryDocType.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("documentTypeCode", getDocumentTypeCode());
		attributes.put("documentType", getDocumentType());
		attributes.put("documentTypeName", getDocumentTypeName());
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

		String documentTypeCode = (String)attributes.get("documentTypeCode");

		if (documentTypeCode != null) {
			setDocumentTypeCode(documentTypeCode);
		}

		String documentType = (String)attributes.get("documentType");

		if (documentType != null) {
			setDocumentType(documentType);
		}

		String documentTypeName = (String)attributes.get("documentTypeName");

		if (documentTypeName != null) {
			setDocumentTypeName(documentTypeName);
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
	public String getDocumentTypeCode() {
		if (_documentTypeCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _documentTypeCode;
		}
	}

	@Override
	public void setDocumentTypeCode(String documentTypeCode) {
		_documentTypeCode = documentTypeCode;
	}

	@Override
	public String getDocumentType() {
		if (_documentType == null) {
			return StringPool.BLANK;
		}
		else {
			return _documentType;
		}
	}

	@Override
	public void setDocumentType(String documentType) {
		_columnBitmask |= DOCUMENTTYPE_COLUMN_BITMASK;

		if (_originalDocumentType == null) {
			_originalDocumentType = _documentType;
		}

		_documentType = documentType;
	}

	public String getOriginalDocumentType() {
		return GetterUtil.getString(_originalDocumentType);
	}

	@Override
	public String getDocumentTypeName() {
		if (_documentTypeName == null) {
			return StringPool.BLANK;
		}
		else {
			return _documentTypeName;
		}
	}

	@Override
	public void setDocumentTypeName(String documentTypeName) {
		_documentTypeName = documentTypeName;
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
	public DmHistoryDocType toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DmHistoryDocType)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DmHistoryDocTypeImpl dmHistoryDocTypeImpl = new DmHistoryDocTypeImpl();

		dmHistoryDocTypeImpl.setId(getId());
		dmHistoryDocTypeImpl.setDocumentTypeCode(getDocumentTypeCode());
		dmHistoryDocTypeImpl.setDocumentType(getDocumentType());
		dmHistoryDocTypeImpl.setDocumentTypeName(getDocumentTypeName());
		dmHistoryDocTypeImpl.setIsDelete(getIsDelete());
		dmHistoryDocTypeImpl.setMarkedAsDelete(getMarkedAsDelete());
		dmHistoryDocTypeImpl.setModifiedDate(getModifiedDate());
		dmHistoryDocTypeImpl.setRequestedDate(getRequestedDate());
		dmHistoryDocTypeImpl.setSyncVersion(getSyncVersion());

		dmHistoryDocTypeImpl.resetOriginalValues();

		return dmHistoryDocTypeImpl;
	}

	@Override
	public int compareTo(DmHistoryDocType dmHistoryDocType) {
		int value = 0;

		if (getId() < dmHistoryDocType.getId()) {
			value = -1;
		}
		else if (getId() > dmHistoryDocType.getId()) {
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

		if (!(obj instanceof DmHistoryDocType)) {
			return false;
		}

		DmHistoryDocType dmHistoryDocType = (DmHistoryDocType)obj;

		int primaryKey = dmHistoryDocType.getPrimaryKey();

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
		DmHistoryDocTypeModelImpl dmHistoryDocTypeModelImpl = this;

		dmHistoryDocTypeModelImpl._originalDocumentType = dmHistoryDocTypeModelImpl._documentType;

		dmHistoryDocTypeModelImpl._originalSyncVersion = dmHistoryDocTypeModelImpl._syncVersion;

		dmHistoryDocTypeModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DmHistoryDocType> toCacheModel() {
		DmHistoryDocTypeCacheModel dmHistoryDocTypeCacheModel = new DmHistoryDocTypeCacheModel();

		dmHistoryDocTypeCacheModel.id = getId();

		dmHistoryDocTypeCacheModel.documentTypeCode = getDocumentTypeCode();

		String documentTypeCode = dmHistoryDocTypeCacheModel.documentTypeCode;

		if ((documentTypeCode != null) && (documentTypeCode.length() == 0)) {
			dmHistoryDocTypeCacheModel.documentTypeCode = null;
		}

		dmHistoryDocTypeCacheModel.documentType = getDocumentType();

		String documentType = dmHistoryDocTypeCacheModel.documentType;

		if ((documentType != null) && (documentType.length() == 0)) {
			dmHistoryDocTypeCacheModel.documentType = null;
		}

		dmHistoryDocTypeCacheModel.documentTypeName = getDocumentTypeName();

		String documentTypeName = dmHistoryDocTypeCacheModel.documentTypeName;

		if ((documentTypeName != null) && (documentTypeName.length() == 0)) {
			dmHistoryDocTypeCacheModel.documentTypeName = null;
		}

		dmHistoryDocTypeCacheModel.isDelete = getIsDelete();

		dmHistoryDocTypeCacheModel.markedAsDelete = getMarkedAsDelete();

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			dmHistoryDocTypeCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			dmHistoryDocTypeCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		Date requestedDate = getRequestedDate();

		if (requestedDate != null) {
			dmHistoryDocTypeCacheModel.requestedDate = requestedDate.getTime();
		}
		else {
			dmHistoryDocTypeCacheModel.requestedDate = Long.MIN_VALUE;
		}

		dmHistoryDocTypeCacheModel.syncVersion = getSyncVersion();

		String syncVersion = dmHistoryDocTypeCacheModel.syncVersion;

		if ((syncVersion != null) && (syncVersion.length() == 0)) {
			dmHistoryDocTypeCacheModel.syncVersion = null;
		}

		return dmHistoryDocTypeCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", documentTypeCode=");
		sb.append(getDocumentTypeCode());
		sb.append(", documentType=");
		sb.append(getDocumentType());
		sb.append(", documentTypeName=");
		sb.append(getDocumentTypeName());
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
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentTypeCode</column-name><column-value><![CDATA[");
		sb.append(getDocumentTypeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentType</column-name><column-value><![CDATA[");
		sb.append(getDocumentType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentTypeName</column-name><column-value><![CDATA[");
		sb.append(getDocumentTypeName());
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

	private static ClassLoader _classLoader = DmHistoryDocType.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DmHistoryDocType.class
		};
	private int _id;
	private String _documentTypeCode;
	private String _documentType;
	private String _originalDocumentType;
	private String _documentTypeName;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private String _originalSyncVersion;
	private long _columnBitmask;
	private DmHistoryDocType _escapedModel;
}