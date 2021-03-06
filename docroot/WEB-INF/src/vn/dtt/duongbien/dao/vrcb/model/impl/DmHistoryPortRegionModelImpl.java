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

import vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortRegion;
import vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortRegionModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the DmHistoryPortRegion service. Represents a row in the &quot;DM_HISTORY_PORT_REGION&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortRegionModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DmHistoryPortRegionImpl}.
 * </p>
 *
 * @author longdm
 * @see DmHistoryPortRegionImpl
 * @see vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortRegion
 * @see vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortRegionModel
 * @generated
 */
public class DmHistoryPortRegionModelImpl extends BaseModelImpl<DmHistoryPortRegion>
	implements DmHistoryPortRegionModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dm history port region model instance should use the {@link vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortRegion} interface instead.
	 */
	public static final String TABLE_NAME = "DM_HISTORY_PORT_REGION";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.INTEGER },
			{ "PortRegionCode", Types.VARCHAR },
			{ "PortRegionName", Types.VARCHAR },
			{ "PortRegionNameVN", Types.VARCHAR },
			{ "PortRegionRef", Types.VARCHAR },
			{ "PortCode", Types.VARCHAR },
			{ "IsDelete", Types.INTEGER },
			{ "MarkedAsDelete", Types.INTEGER },
			{ "ModifiedDate", Types.TIMESTAMP },
			{ "RequestedDate", Types.TIMESTAMP },
			{ "SyncVersion", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table DM_HISTORY_PORT_REGION (id INTEGER not null primary key,PortRegionCode VARCHAR(75) null,PortRegionName VARCHAR(75) null,PortRegionNameVN VARCHAR(75) null,PortRegionRef VARCHAR(75) null,PortCode VARCHAR(75) null,IsDelete INTEGER,MarkedAsDelete INTEGER,ModifiedDate DATE null,RequestedDate DATE null,SyncVersion VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table DM_HISTORY_PORT_REGION";
	public static final String ORDER_BY_JPQL = " ORDER BY dmHistoryPortRegion.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY DM_HISTORY_PORT_REGION.id ASC";
	public static final String DATA_SOURCE = "vaoracangbienDataSource";
	public static final String SESSION_FACTORY = "ravaocangbienSessionFactory";
	public static final String TX_MANAGER = "ravaocangbienTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortRegion"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortRegion"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortRegion"),
			true);
	public static long PORTREGIONCODE_COLUMN_BITMASK = 1L;
	public static long SYNCVERSION_COLUMN_BITMASK = 2L;
	public static long ID_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortRegion"));

	public DmHistoryPortRegionModelImpl() {
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
		return DmHistoryPortRegion.class;
	}

	@Override
	public String getModelClassName() {
		return DmHistoryPortRegion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("portRegionCode", getPortRegionCode());
		attributes.put("portRegionName", getPortRegionName());
		attributes.put("portRegionNameVN", getPortRegionNameVN());
		attributes.put("portRegionRef", getPortRegionRef());
		attributes.put("portCode", getPortCode());
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

		String portRegionCode = (String)attributes.get("portRegionCode");

		if (portRegionCode != null) {
			setPortRegionCode(portRegionCode);
		}

		String portRegionName = (String)attributes.get("portRegionName");

		if (portRegionName != null) {
			setPortRegionName(portRegionName);
		}

		String portRegionNameVN = (String)attributes.get("portRegionNameVN");

		if (portRegionNameVN != null) {
			setPortRegionNameVN(portRegionNameVN);
		}

		String portRegionRef = (String)attributes.get("portRegionRef");

		if (portRegionRef != null) {
			setPortRegionRef(portRegionRef);
		}

		String portCode = (String)attributes.get("portCode");

		if (portCode != null) {
			setPortCode(portCode);
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
	public String getPortRegionCode() {
		if (_portRegionCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _portRegionCode;
		}
	}

	@Override
	public void setPortRegionCode(String portRegionCode) {
		_columnBitmask |= PORTREGIONCODE_COLUMN_BITMASK;

		if (_originalPortRegionCode == null) {
			_originalPortRegionCode = _portRegionCode;
		}

		_portRegionCode = portRegionCode;
	}

	public String getOriginalPortRegionCode() {
		return GetterUtil.getString(_originalPortRegionCode);
	}

	@Override
	public String getPortRegionName() {
		if (_portRegionName == null) {
			return StringPool.BLANK;
		}
		else {
			return _portRegionName;
		}
	}

	@Override
	public void setPortRegionName(String portRegionName) {
		_portRegionName = portRegionName;
	}

	@Override
	public String getPortRegionNameVN() {
		if (_portRegionNameVN == null) {
			return StringPool.BLANK;
		}
		else {
			return _portRegionNameVN;
		}
	}

	@Override
	public void setPortRegionNameVN(String portRegionNameVN) {
		_portRegionNameVN = portRegionNameVN;
	}

	@Override
	public String getPortRegionRef() {
		if (_portRegionRef == null) {
			return StringPool.BLANK;
		}
		else {
			return _portRegionRef;
		}
	}

	@Override
	public void setPortRegionRef(String portRegionRef) {
		_portRegionRef = portRegionRef;
	}

	@Override
	public String getPortCode() {
		if (_portCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _portCode;
		}
	}

	@Override
	public void setPortCode(String portCode) {
		_portCode = portCode;
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
	public DmHistoryPortRegion toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DmHistoryPortRegion)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DmHistoryPortRegionImpl dmHistoryPortRegionImpl = new DmHistoryPortRegionImpl();

		dmHistoryPortRegionImpl.setId(getId());
		dmHistoryPortRegionImpl.setPortRegionCode(getPortRegionCode());
		dmHistoryPortRegionImpl.setPortRegionName(getPortRegionName());
		dmHistoryPortRegionImpl.setPortRegionNameVN(getPortRegionNameVN());
		dmHistoryPortRegionImpl.setPortRegionRef(getPortRegionRef());
		dmHistoryPortRegionImpl.setPortCode(getPortCode());
		dmHistoryPortRegionImpl.setIsDelete(getIsDelete());
		dmHistoryPortRegionImpl.setMarkedAsDelete(getMarkedAsDelete());
		dmHistoryPortRegionImpl.setModifiedDate(getModifiedDate());
		dmHistoryPortRegionImpl.setRequestedDate(getRequestedDate());
		dmHistoryPortRegionImpl.setSyncVersion(getSyncVersion());

		dmHistoryPortRegionImpl.resetOriginalValues();

		return dmHistoryPortRegionImpl;
	}

	@Override
	public int compareTo(DmHistoryPortRegion dmHistoryPortRegion) {
		int value = 0;

		if (getId() < dmHistoryPortRegion.getId()) {
			value = -1;
		}
		else if (getId() > dmHistoryPortRegion.getId()) {
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

		if (!(obj instanceof DmHistoryPortRegion)) {
			return false;
		}

		DmHistoryPortRegion dmHistoryPortRegion = (DmHistoryPortRegion)obj;

		int primaryKey = dmHistoryPortRegion.getPrimaryKey();

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
		DmHistoryPortRegionModelImpl dmHistoryPortRegionModelImpl = this;

		dmHistoryPortRegionModelImpl._originalPortRegionCode = dmHistoryPortRegionModelImpl._portRegionCode;

		dmHistoryPortRegionModelImpl._originalSyncVersion = dmHistoryPortRegionModelImpl._syncVersion;

		dmHistoryPortRegionModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DmHistoryPortRegion> toCacheModel() {
		DmHistoryPortRegionCacheModel dmHistoryPortRegionCacheModel = new DmHistoryPortRegionCacheModel();

		dmHistoryPortRegionCacheModel.id = getId();

		dmHistoryPortRegionCacheModel.portRegionCode = getPortRegionCode();

		String portRegionCode = dmHistoryPortRegionCacheModel.portRegionCode;

		if ((portRegionCode != null) && (portRegionCode.length() == 0)) {
			dmHistoryPortRegionCacheModel.portRegionCode = null;
		}

		dmHistoryPortRegionCacheModel.portRegionName = getPortRegionName();

		String portRegionName = dmHistoryPortRegionCacheModel.portRegionName;

		if ((portRegionName != null) && (portRegionName.length() == 0)) {
			dmHistoryPortRegionCacheModel.portRegionName = null;
		}

		dmHistoryPortRegionCacheModel.portRegionNameVN = getPortRegionNameVN();

		String portRegionNameVN = dmHistoryPortRegionCacheModel.portRegionNameVN;

		if ((portRegionNameVN != null) && (portRegionNameVN.length() == 0)) {
			dmHistoryPortRegionCacheModel.portRegionNameVN = null;
		}

		dmHistoryPortRegionCacheModel.portRegionRef = getPortRegionRef();

		String portRegionRef = dmHistoryPortRegionCacheModel.portRegionRef;

		if ((portRegionRef != null) && (portRegionRef.length() == 0)) {
			dmHistoryPortRegionCacheModel.portRegionRef = null;
		}

		dmHistoryPortRegionCacheModel.portCode = getPortCode();

		String portCode = dmHistoryPortRegionCacheModel.portCode;

		if ((portCode != null) && (portCode.length() == 0)) {
			dmHistoryPortRegionCacheModel.portCode = null;
		}

		dmHistoryPortRegionCacheModel.isDelete = getIsDelete();

		dmHistoryPortRegionCacheModel.markedAsDelete = getMarkedAsDelete();

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			dmHistoryPortRegionCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			dmHistoryPortRegionCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		Date requestedDate = getRequestedDate();

		if (requestedDate != null) {
			dmHistoryPortRegionCacheModel.requestedDate = requestedDate.getTime();
		}
		else {
			dmHistoryPortRegionCacheModel.requestedDate = Long.MIN_VALUE;
		}

		dmHistoryPortRegionCacheModel.syncVersion = getSyncVersion();

		String syncVersion = dmHistoryPortRegionCacheModel.syncVersion;

		if ((syncVersion != null) && (syncVersion.length() == 0)) {
			dmHistoryPortRegionCacheModel.syncVersion = null;
		}

		return dmHistoryPortRegionCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", portRegionCode=");
		sb.append(getPortRegionCode());
		sb.append(", portRegionName=");
		sb.append(getPortRegionName());
		sb.append(", portRegionNameVN=");
		sb.append(getPortRegionNameVN());
		sb.append(", portRegionRef=");
		sb.append(getPortRegionRef());
		sb.append(", portCode=");
		sb.append(getPortCode());
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
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortRegion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portRegionCode</column-name><column-value><![CDATA[");
		sb.append(getPortRegionCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portRegionName</column-name><column-value><![CDATA[");
		sb.append(getPortRegionName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portRegionNameVN</column-name><column-value><![CDATA[");
		sb.append(getPortRegionNameVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portRegionRef</column-name><column-value><![CDATA[");
		sb.append(getPortRegionRef());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portCode</column-name><column-value><![CDATA[");
		sb.append(getPortCode());
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

	private static ClassLoader _classLoader = DmHistoryPortRegion.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DmHistoryPortRegion.class
		};
	private int _id;
	private String _portRegionCode;
	private String _originalPortRegionCode;
	private String _portRegionName;
	private String _portRegionNameVN;
	private String _portRegionRef;
	private String _portCode;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private String _originalSyncVersion;
	private long _columnBitmask;
	private DmHistoryPortRegion _escapedModel;
}