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

import vn.dtt.duongbien.dao.vrcb.model.DmUnitGeneral;
import vn.dtt.duongbien.dao.vrcb.model.DmUnitGeneralModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the DmUnitGeneral service. Represents a row in the &quot;DM_UNIT_GENERAL&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbien.dao.vrcb.model.DmUnitGeneralModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DmUnitGeneralImpl}.
 * </p>
 *
 * @author longdm
 * @see DmUnitGeneralImpl
 * @see vn.dtt.duongbien.dao.vrcb.model.DmUnitGeneral
 * @see vn.dtt.duongbien.dao.vrcb.model.DmUnitGeneralModel
 * @generated
 */
public class DmUnitGeneralModelImpl extends BaseModelImpl<DmUnitGeneral>
	implements DmUnitGeneralModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dm unit general model instance should use the {@link vn.dtt.duongbien.dao.vrcb.model.DmUnitGeneral} interface instead.
	 */
	public static final String TABLE_NAME = "DM_UNIT_GENERAL";
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
	public static final String TABLE_SQL_CREATE = "create table DM_UNIT_GENERAL (id INTEGER not null primary key,UnitCode VARCHAR(75) null,UnitName VARCHAR(75) null,IsDelete INTEGER,MarkedAsDelete INTEGER,ModifiedDate DATE null,RequestedDate DATE null,SyncVersion VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table DM_UNIT_GENERAL";
	public static final String ORDER_BY_JPQL = " ORDER BY dmUnitGeneral.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY DM_UNIT_GENERAL.id ASC";
	public static final String DATA_SOURCE = "vaoracangbienDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.DmUnitGeneral"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.DmUnitGeneral"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.duongbien.dao.vrcb.model.DmUnitGeneral"),
			true);
	public static long SYNCVERSION_COLUMN_BITMASK = 1L;
	public static long UNITCODE_COLUMN_BITMASK = 2L;
	public static long ID_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbien.dao.vrcb.model.DmUnitGeneral"));

	public DmUnitGeneralModelImpl() {
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
		return DmUnitGeneral.class;
	}

	@Override
	public String getModelClassName() {
		return DmUnitGeneral.class.getName();
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
	public DmUnitGeneral toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DmUnitGeneral)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DmUnitGeneralImpl dmUnitGeneralImpl = new DmUnitGeneralImpl();

		dmUnitGeneralImpl.setId(getId());
		dmUnitGeneralImpl.setUnitCode(getUnitCode());
		dmUnitGeneralImpl.setUnitName(getUnitName());
		dmUnitGeneralImpl.setIsDelete(getIsDelete());
		dmUnitGeneralImpl.setMarkedAsDelete(getMarkedAsDelete());
		dmUnitGeneralImpl.setModifiedDate(getModifiedDate());
		dmUnitGeneralImpl.setRequestedDate(getRequestedDate());
		dmUnitGeneralImpl.setSyncVersion(getSyncVersion());

		dmUnitGeneralImpl.resetOriginalValues();

		return dmUnitGeneralImpl;
	}

	@Override
	public int compareTo(DmUnitGeneral dmUnitGeneral) {
		int value = 0;

		if (getId() < dmUnitGeneral.getId()) {
			value = -1;
		}
		else if (getId() > dmUnitGeneral.getId()) {
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

		if (!(obj instanceof DmUnitGeneral)) {
			return false;
		}

		DmUnitGeneral dmUnitGeneral = (DmUnitGeneral)obj;

		int primaryKey = dmUnitGeneral.getPrimaryKey();

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
		DmUnitGeneralModelImpl dmUnitGeneralModelImpl = this;

		dmUnitGeneralModelImpl._originalUnitCode = dmUnitGeneralModelImpl._unitCode;

		dmUnitGeneralModelImpl._originalSyncVersion = dmUnitGeneralModelImpl._syncVersion;

		dmUnitGeneralModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DmUnitGeneral> toCacheModel() {
		DmUnitGeneralCacheModel dmUnitGeneralCacheModel = new DmUnitGeneralCacheModel();

		dmUnitGeneralCacheModel.id = getId();

		dmUnitGeneralCacheModel.unitCode = getUnitCode();

		String unitCode = dmUnitGeneralCacheModel.unitCode;

		if ((unitCode != null) && (unitCode.length() == 0)) {
			dmUnitGeneralCacheModel.unitCode = null;
		}

		dmUnitGeneralCacheModel.unitName = getUnitName();

		String unitName = dmUnitGeneralCacheModel.unitName;

		if ((unitName != null) && (unitName.length() == 0)) {
			dmUnitGeneralCacheModel.unitName = null;
		}

		dmUnitGeneralCacheModel.isDelete = getIsDelete();

		dmUnitGeneralCacheModel.markedAsDelete = getMarkedAsDelete();

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			dmUnitGeneralCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			dmUnitGeneralCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		Date requestedDate = getRequestedDate();

		if (requestedDate != null) {
			dmUnitGeneralCacheModel.requestedDate = requestedDate.getTime();
		}
		else {
			dmUnitGeneralCacheModel.requestedDate = Long.MIN_VALUE;
		}

		dmUnitGeneralCacheModel.syncVersion = getSyncVersion();

		String syncVersion = dmUnitGeneralCacheModel.syncVersion;

		if ((syncVersion != null) && (syncVersion.length() == 0)) {
			dmUnitGeneralCacheModel.syncVersion = null;
		}

		return dmUnitGeneralCacheModel;
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
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DmUnitGeneral");
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

	private static ClassLoader _classLoader = DmUnitGeneral.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DmUnitGeneral.class
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
	private DmUnitGeneral _escapedModel;
}