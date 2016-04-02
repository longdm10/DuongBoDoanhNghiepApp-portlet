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

import vn.dtt.duongbien.dao.vrcb.model.DmState;
import vn.dtt.duongbien.dao.vrcb.model.DmStateModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the DmState service. Represents a row in the &quot;dm_state&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbien.dao.vrcb.model.DmStateModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DmStateImpl}.
 * </p>
 *
 * @author longdm
 * @see DmStateImpl
 * @see vn.dtt.duongbien.dao.vrcb.model.DmState
 * @see vn.dtt.duongbien.dao.vrcb.model.DmStateModel
 * @generated
 */
public class DmStateModelImpl extends BaseModelImpl<DmState>
	implements DmStateModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dm state model instance should use the {@link vn.dtt.duongbien.dao.vrcb.model.DmState} interface instead.
	 */
	public static final String TABLE_NAME = "dm_state";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.INTEGER },
			{ "statecode", Types.VARCHAR },
			{ "statename", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "isdelete", Types.INTEGER },
			{ "markedasdelete", Types.INTEGER },
			{ "modifieddate", Types.TIMESTAMP },
			{ "requesteddate", Types.TIMESTAMP },
			{ "syncversion", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table dm_state (id INTEGER not null primary key,statecode VARCHAR(75) null,statename VARCHAR(75) null,description VARCHAR(75) null,isdelete INTEGER,markedasdelete INTEGER,modifieddate DATE null,requesteddate DATE null,syncversion VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table dm_state";
	public static final String ORDER_BY_JPQL = " ORDER BY dmState.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY dm_state.id ASC";
	public static final String DATA_SOURCE = "vaoracangbienDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.DmState"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.DmState"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.duongbien.dao.vrcb.model.DmState"),
			true);
	public static long STATECODE_COLUMN_BITMASK = 1L;
	public static long ID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbien.dao.vrcb.model.DmState"));

	public DmStateModelImpl() {
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
		return DmState.class;
	}

	@Override
	public String getModelClassName() {
		return DmState.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("stateCode", getStateCode());
		attributes.put("stateName", getStateName());
		attributes.put("description", getDescription());
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

		String stateCode = (String)attributes.get("stateCode");

		if (stateCode != null) {
			setStateCode(stateCode);
		}

		String stateName = (String)attributes.get("stateName");

		if (stateName != null) {
			setStateName(stateName);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
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
	public String getStateCode() {
		if (_stateCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _stateCode;
		}
	}

	@Override
	public void setStateCode(String stateCode) {
		_columnBitmask |= STATECODE_COLUMN_BITMASK;

		if (_originalStateCode == null) {
			_originalStateCode = _stateCode;
		}

		_stateCode = stateCode;
	}

	public String getOriginalStateCode() {
		return GetterUtil.getString(_originalStateCode);
	}

	@Override
	public String getStateName() {
		if (_stateName == null) {
			return StringPool.BLANK;
		}
		else {
			return _stateName;
		}
	}

	@Override
	public void setStateName(String stateName) {
		_stateName = stateName;
	}

	@Override
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
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
	public DmState toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DmState)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DmStateImpl dmStateImpl = new DmStateImpl();

		dmStateImpl.setId(getId());
		dmStateImpl.setStateCode(getStateCode());
		dmStateImpl.setStateName(getStateName());
		dmStateImpl.setDescription(getDescription());
		dmStateImpl.setIsDelete(getIsDelete());
		dmStateImpl.setMarkedAsDelete(getMarkedAsDelete());
		dmStateImpl.setModifiedDate(getModifiedDate());
		dmStateImpl.setRequestedDate(getRequestedDate());
		dmStateImpl.setSyncVersion(getSyncVersion());

		dmStateImpl.resetOriginalValues();

		return dmStateImpl;
	}

	@Override
	public int compareTo(DmState dmState) {
		int value = 0;

		if (getId() < dmState.getId()) {
			value = -1;
		}
		else if (getId() > dmState.getId()) {
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

		if (!(obj instanceof DmState)) {
			return false;
		}

		DmState dmState = (DmState)obj;

		int primaryKey = dmState.getPrimaryKey();

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
		DmStateModelImpl dmStateModelImpl = this;

		dmStateModelImpl._originalStateCode = dmStateModelImpl._stateCode;

		dmStateModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DmState> toCacheModel() {
		DmStateCacheModel dmStateCacheModel = new DmStateCacheModel();

		dmStateCacheModel.id = getId();

		dmStateCacheModel.stateCode = getStateCode();

		String stateCode = dmStateCacheModel.stateCode;

		if ((stateCode != null) && (stateCode.length() == 0)) {
			dmStateCacheModel.stateCode = null;
		}

		dmStateCacheModel.stateName = getStateName();

		String stateName = dmStateCacheModel.stateName;

		if ((stateName != null) && (stateName.length() == 0)) {
			dmStateCacheModel.stateName = null;
		}

		dmStateCacheModel.description = getDescription();

		String description = dmStateCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			dmStateCacheModel.description = null;
		}

		dmStateCacheModel.isDelete = getIsDelete();

		dmStateCacheModel.markedAsDelete = getMarkedAsDelete();

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			dmStateCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			dmStateCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		Date requestedDate = getRequestedDate();

		if (requestedDate != null) {
			dmStateCacheModel.requestedDate = requestedDate.getTime();
		}
		else {
			dmStateCacheModel.requestedDate = Long.MIN_VALUE;
		}

		dmStateCacheModel.syncVersion = getSyncVersion();

		String syncVersion = dmStateCacheModel.syncVersion;

		if ((syncVersion != null) && (syncVersion.length() == 0)) {
			dmStateCacheModel.syncVersion = null;
		}

		return dmStateCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", stateCode=");
		sb.append(getStateCode());
		sb.append(", stateName=");
		sb.append(getStateName());
		sb.append(", description=");
		sb.append(getDescription());
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
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DmState");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stateCode</column-name><column-value><![CDATA[");
		sb.append(getStateCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stateName</column-name><column-value><![CDATA[");
		sb.append(getStateName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
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

	private static ClassLoader _classLoader = DmState.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DmState.class
		};
	private int _id;
	private String _stateCode;
	private String _originalStateCode;
	private String _stateName;
	private String _description;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private long _columnBitmask;
	private DmState _escapedModel;
}