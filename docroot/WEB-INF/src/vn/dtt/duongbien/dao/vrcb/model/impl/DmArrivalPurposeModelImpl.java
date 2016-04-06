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

import vn.dtt.duongbien.dao.vrcb.model.DmArrivalPurpose;
import vn.dtt.duongbien.dao.vrcb.model.DmArrivalPurposeModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the DmArrivalPurpose service. Represents a row in the &quot;DM_ARRIVAL_PURPOSE&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbien.dao.vrcb.model.DmArrivalPurposeModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DmArrivalPurposeImpl}.
 * </p>
 *
 * @author longdm
 * @see DmArrivalPurposeImpl
 * @see vn.dtt.duongbien.dao.vrcb.model.DmArrivalPurpose
 * @see vn.dtt.duongbien.dao.vrcb.model.DmArrivalPurposeModel
 * @generated
 */
public class DmArrivalPurposeModelImpl extends BaseModelImpl<DmArrivalPurpose>
	implements DmArrivalPurposeModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dm arrival purpose model instance should use the {@link vn.dtt.duongbien.dao.vrcb.model.DmArrivalPurpose} interface instead.
	 */
	public static final String TABLE_NAME = "DM_ARRIVAL_PURPOSE";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.INTEGER },
			{ "PurposeCode", Types.VARCHAR },
			{ "PurposeName", Types.VARCHAR },
			{ "PurposeNameVN", Types.VARCHAR },
			{ "IsDelete", Types.INTEGER },
			{ "MarkedAsDelete", Types.INTEGER },
			{ "ModifiedDate", Types.TIMESTAMP },
			{ "RequestedDate", Types.TIMESTAMP },
			{ "SyncVersion", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table DM_ARRIVAL_PURPOSE (id INTEGER not null primary key,PurposeCode VARCHAR(75) null,PurposeName VARCHAR(75) null,PurposeNameVN VARCHAR(75) null,IsDelete INTEGER,MarkedAsDelete INTEGER,ModifiedDate DATE null,RequestedDate DATE null,SyncVersion VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table DM_ARRIVAL_PURPOSE";
	public static final String ORDER_BY_JPQL = " ORDER BY dmArrivalPurpose.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY DM_ARRIVAL_PURPOSE.id ASC";
	public static final String DATA_SOURCE = "vaoracangbienDataSource";
	public static final String SESSION_FACTORY = "ravaocangbienSessionFactory";
	public static final String TX_MANAGER = "ravaocangbienTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.DmArrivalPurpose"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.DmArrivalPurpose"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.duongbien.dao.vrcb.model.DmArrivalPurpose"),
			true);
	public static long PURPOSECODE_COLUMN_BITMASK = 1L;
	public static long ID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbien.dao.vrcb.model.DmArrivalPurpose"));

	public DmArrivalPurposeModelImpl() {
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
		return DmArrivalPurpose.class;
	}

	@Override
	public String getModelClassName() {
		return DmArrivalPurpose.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("purposeCode", getPurposeCode());
		attributes.put("purposeName", getPurposeName());
		attributes.put("purposeNameVN", getPurposeNameVN());
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

		String purposeCode = (String)attributes.get("purposeCode");

		if (purposeCode != null) {
			setPurposeCode(purposeCode);
		}

		String purposeName = (String)attributes.get("purposeName");

		if (purposeName != null) {
			setPurposeName(purposeName);
		}

		String purposeNameVN = (String)attributes.get("purposeNameVN");

		if (purposeNameVN != null) {
			setPurposeNameVN(purposeNameVN);
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
	public String getPurposeCode() {
		if (_purposeCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _purposeCode;
		}
	}

	@Override
	public void setPurposeCode(String purposeCode) {
		_columnBitmask |= PURPOSECODE_COLUMN_BITMASK;

		if (_originalPurposeCode == null) {
			_originalPurposeCode = _purposeCode;
		}

		_purposeCode = purposeCode;
	}

	public String getOriginalPurposeCode() {
		return GetterUtil.getString(_originalPurposeCode);
	}

	@Override
	public String getPurposeName() {
		if (_purposeName == null) {
			return StringPool.BLANK;
		}
		else {
			return _purposeName;
		}
	}

	@Override
	public void setPurposeName(String purposeName) {
		_purposeName = purposeName;
	}

	@Override
	public String getPurposeNameVN() {
		if (_purposeNameVN == null) {
			return StringPool.BLANK;
		}
		else {
			return _purposeNameVN;
		}
	}

	@Override
	public void setPurposeNameVN(String purposeNameVN) {
		_purposeNameVN = purposeNameVN;
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
	public DmArrivalPurpose toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DmArrivalPurpose)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DmArrivalPurposeImpl dmArrivalPurposeImpl = new DmArrivalPurposeImpl();

		dmArrivalPurposeImpl.setId(getId());
		dmArrivalPurposeImpl.setPurposeCode(getPurposeCode());
		dmArrivalPurposeImpl.setPurposeName(getPurposeName());
		dmArrivalPurposeImpl.setPurposeNameVN(getPurposeNameVN());
		dmArrivalPurposeImpl.setIsDelete(getIsDelete());
		dmArrivalPurposeImpl.setMarkedAsDelete(getMarkedAsDelete());
		dmArrivalPurposeImpl.setModifiedDate(getModifiedDate());
		dmArrivalPurposeImpl.setRequestedDate(getRequestedDate());
		dmArrivalPurposeImpl.setSyncVersion(getSyncVersion());

		dmArrivalPurposeImpl.resetOriginalValues();

		return dmArrivalPurposeImpl;
	}

	@Override
	public int compareTo(DmArrivalPurpose dmArrivalPurpose) {
		int value = 0;

		if (getId() < dmArrivalPurpose.getId()) {
			value = -1;
		}
		else if (getId() > dmArrivalPurpose.getId()) {
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

		if (!(obj instanceof DmArrivalPurpose)) {
			return false;
		}

		DmArrivalPurpose dmArrivalPurpose = (DmArrivalPurpose)obj;

		int primaryKey = dmArrivalPurpose.getPrimaryKey();

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
		DmArrivalPurposeModelImpl dmArrivalPurposeModelImpl = this;

		dmArrivalPurposeModelImpl._originalPurposeCode = dmArrivalPurposeModelImpl._purposeCode;

		dmArrivalPurposeModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DmArrivalPurpose> toCacheModel() {
		DmArrivalPurposeCacheModel dmArrivalPurposeCacheModel = new DmArrivalPurposeCacheModel();

		dmArrivalPurposeCacheModel.id = getId();

		dmArrivalPurposeCacheModel.purposeCode = getPurposeCode();

		String purposeCode = dmArrivalPurposeCacheModel.purposeCode;

		if ((purposeCode != null) && (purposeCode.length() == 0)) {
			dmArrivalPurposeCacheModel.purposeCode = null;
		}

		dmArrivalPurposeCacheModel.purposeName = getPurposeName();

		String purposeName = dmArrivalPurposeCacheModel.purposeName;

		if ((purposeName != null) && (purposeName.length() == 0)) {
			dmArrivalPurposeCacheModel.purposeName = null;
		}

		dmArrivalPurposeCacheModel.purposeNameVN = getPurposeNameVN();

		String purposeNameVN = dmArrivalPurposeCacheModel.purposeNameVN;

		if ((purposeNameVN != null) && (purposeNameVN.length() == 0)) {
			dmArrivalPurposeCacheModel.purposeNameVN = null;
		}

		dmArrivalPurposeCacheModel.isDelete = getIsDelete();

		dmArrivalPurposeCacheModel.markedAsDelete = getMarkedAsDelete();

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			dmArrivalPurposeCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			dmArrivalPurposeCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		Date requestedDate = getRequestedDate();

		if (requestedDate != null) {
			dmArrivalPurposeCacheModel.requestedDate = requestedDate.getTime();
		}
		else {
			dmArrivalPurposeCacheModel.requestedDate = Long.MIN_VALUE;
		}

		dmArrivalPurposeCacheModel.syncVersion = getSyncVersion();

		String syncVersion = dmArrivalPurposeCacheModel.syncVersion;

		if ((syncVersion != null) && (syncVersion.length() == 0)) {
			dmArrivalPurposeCacheModel.syncVersion = null;
		}

		return dmArrivalPurposeCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", purposeCode=");
		sb.append(getPurposeCode());
		sb.append(", purposeName=");
		sb.append(getPurposeName());
		sb.append(", purposeNameVN=");
		sb.append(getPurposeNameVN());
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
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DmArrivalPurpose");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>purposeCode</column-name><column-value><![CDATA[");
		sb.append(getPurposeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>purposeName</column-name><column-value><![CDATA[");
		sb.append(getPurposeName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>purposeNameVN</column-name><column-value><![CDATA[");
		sb.append(getPurposeNameVN());
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

	private static ClassLoader _classLoader = DmArrivalPurpose.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DmArrivalPurpose.class
		};
	private int _id;
	private String _purposeCode;
	private String _originalPurposeCode;
	private String _purposeName;
	private String _purposeNameVN;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private long _columnBitmask;
	private DmArrivalPurpose _escapedModel;
}