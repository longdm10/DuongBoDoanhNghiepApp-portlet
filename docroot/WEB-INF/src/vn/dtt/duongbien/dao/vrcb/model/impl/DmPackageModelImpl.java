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

import vn.dtt.duongbien.dao.vrcb.model.DmPackage;
import vn.dtt.duongbien.dao.vrcb.model.DmPackageModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the DmPackage service. Represents a row in the &quot;DM_PACKAGE&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbien.dao.vrcb.model.DmPackageModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DmPackageImpl}.
 * </p>
 *
 * @author longdm
 * @see DmPackageImpl
 * @see vn.dtt.duongbien.dao.vrcb.model.DmPackage
 * @see vn.dtt.duongbien.dao.vrcb.model.DmPackageModel
 * @generated
 */
public class DmPackageModelImpl extends BaseModelImpl<DmPackage>
	implements DmPackageModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dm package model instance should use the {@link vn.dtt.duongbien.dao.vrcb.model.DmPackage} interface instead.
	 */
	public static final String TABLE_NAME = "DM_PACKAGE";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.INTEGER },
			{ "PackageCode", Types.VARCHAR },
			{ "PackageName", Types.VARCHAR },
			{ "PackageNameVN", Types.VARCHAR },
			{ "PackageOrder", Types.INTEGER },
			{ "IsDelete", Types.INTEGER },
			{ "MarkedAsDelete", Types.INTEGER },
			{ "ModifiedDate", Types.TIMESTAMP },
			{ "RequestedDate", Types.TIMESTAMP },
			{ "SyncVersion", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table DM_PACKAGE (id INTEGER not null primary key,PackageCode VARCHAR(75) null,PackageName VARCHAR(75) null,PackageNameVN VARCHAR(75) null,PackageOrder INTEGER,IsDelete INTEGER,MarkedAsDelete INTEGER,ModifiedDate DATE null,RequestedDate DATE null,SyncVersion VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table DM_PACKAGE";
	public static final String ORDER_BY_JPQL = " ORDER BY dmPackage.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY DM_PACKAGE.id ASC";
	public static final String DATA_SOURCE = "vaoracangbienDataSource";
	public static final String SESSION_FACTORY = "ravaocangbienSessionFactory";
	public static final String TX_MANAGER = "ravaocangbienTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.DmPackage"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.DmPackage"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.duongbien.dao.vrcb.model.DmPackage"),
			true);
	public static long PACKAGECODE_COLUMN_BITMASK = 1L;
	public static long ID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbien.dao.vrcb.model.DmPackage"));

	public DmPackageModelImpl() {
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
		return DmPackage.class;
	}

	@Override
	public String getModelClassName() {
		return DmPackage.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("packageCode", getPackageCode());
		attributes.put("packageName", getPackageName());
		attributes.put("packageNameVN", getPackageNameVN());
		attributes.put("packageOrder", getPackageOrder());
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

		String packageCode = (String)attributes.get("packageCode");

		if (packageCode != null) {
			setPackageCode(packageCode);
		}

		String packageName = (String)attributes.get("packageName");

		if (packageName != null) {
			setPackageName(packageName);
		}

		String packageNameVN = (String)attributes.get("packageNameVN");

		if (packageNameVN != null) {
			setPackageNameVN(packageNameVN);
		}

		Integer packageOrder = (Integer)attributes.get("packageOrder");

		if (packageOrder != null) {
			setPackageOrder(packageOrder);
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
	public String getPackageCode() {
		if (_packageCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _packageCode;
		}
	}

	@Override
	public void setPackageCode(String packageCode) {
		_columnBitmask |= PACKAGECODE_COLUMN_BITMASK;

		if (_originalPackageCode == null) {
			_originalPackageCode = _packageCode;
		}

		_packageCode = packageCode;
	}

	public String getOriginalPackageCode() {
		return GetterUtil.getString(_originalPackageCode);
	}

	@Override
	public String getPackageName() {
		if (_packageName == null) {
			return StringPool.BLANK;
		}
		else {
			return _packageName;
		}
	}

	@Override
	public void setPackageName(String packageName) {
		_packageName = packageName;
	}

	@Override
	public String getPackageNameVN() {
		if (_packageNameVN == null) {
			return StringPool.BLANK;
		}
		else {
			return _packageNameVN;
		}
	}

	@Override
	public void setPackageNameVN(String packageNameVN) {
		_packageNameVN = packageNameVN;
	}

	@Override
	public int getPackageOrder() {
		return _packageOrder;
	}

	@Override
	public void setPackageOrder(int packageOrder) {
		_packageOrder = packageOrder;
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
	public DmPackage toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DmPackage)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DmPackageImpl dmPackageImpl = new DmPackageImpl();

		dmPackageImpl.setId(getId());
		dmPackageImpl.setPackageCode(getPackageCode());
		dmPackageImpl.setPackageName(getPackageName());
		dmPackageImpl.setPackageNameVN(getPackageNameVN());
		dmPackageImpl.setPackageOrder(getPackageOrder());
		dmPackageImpl.setIsDelete(getIsDelete());
		dmPackageImpl.setMarkedAsDelete(getMarkedAsDelete());
		dmPackageImpl.setModifiedDate(getModifiedDate());
		dmPackageImpl.setRequestedDate(getRequestedDate());
		dmPackageImpl.setSyncVersion(getSyncVersion());

		dmPackageImpl.resetOriginalValues();

		return dmPackageImpl;
	}

	@Override
	public int compareTo(DmPackage dmPackage) {
		int value = 0;

		if (getId() < dmPackage.getId()) {
			value = -1;
		}
		else if (getId() > dmPackage.getId()) {
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

		if (!(obj instanceof DmPackage)) {
			return false;
		}

		DmPackage dmPackage = (DmPackage)obj;

		int primaryKey = dmPackage.getPrimaryKey();

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
		DmPackageModelImpl dmPackageModelImpl = this;

		dmPackageModelImpl._originalPackageCode = dmPackageModelImpl._packageCode;

		dmPackageModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DmPackage> toCacheModel() {
		DmPackageCacheModel dmPackageCacheModel = new DmPackageCacheModel();

		dmPackageCacheModel.id = getId();

		dmPackageCacheModel.packageCode = getPackageCode();

		String packageCode = dmPackageCacheModel.packageCode;

		if ((packageCode != null) && (packageCode.length() == 0)) {
			dmPackageCacheModel.packageCode = null;
		}

		dmPackageCacheModel.packageName = getPackageName();

		String packageName = dmPackageCacheModel.packageName;

		if ((packageName != null) && (packageName.length() == 0)) {
			dmPackageCacheModel.packageName = null;
		}

		dmPackageCacheModel.packageNameVN = getPackageNameVN();

		String packageNameVN = dmPackageCacheModel.packageNameVN;

		if ((packageNameVN != null) && (packageNameVN.length() == 0)) {
			dmPackageCacheModel.packageNameVN = null;
		}

		dmPackageCacheModel.packageOrder = getPackageOrder();

		dmPackageCacheModel.isDelete = getIsDelete();

		dmPackageCacheModel.markedAsDelete = getMarkedAsDelete();

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			dmPackageCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			dmPackageCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		Date requestedDate = getRequestedDate();

		if (requestedDate != null) {
			dmPackageCacheModel.requestedDate = requestedDate.getTime();
		}
		else {
			dmPackageCacheModel.requestedDate = Long.MIN_VALUE;
		}

		dmPackageCacheModel.syncVersion = getSyncVersion();

		String syncVersion = dmPackageCacheModel.syncVersion;

		if ((syncVersion != null) && (syncVersion.length() == 0)) {
			dmPackageCacheModel.syncVersion = null;
		}

		return dmPackageCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", packageCode=");
		sb.append(getPackageCode());
		sb.append(", packageName=");
		sb.append(getPackageName());
		sb.append(", packageNameVN=");
		sb.append(getPackageNameVN());
		sb.append(", packageOrder=");
		sb.append(getPackageOrder());
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
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DmPackage");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>packageCode</column-name><column-value><![CDATA[");
		sb.append(getPackageCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>packageName</column-name><column-value><![CDATA[");
		sb.append(getPackageName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>packageNameVN</column-name><column-value><![CDATA[");
		sb.append(getPackageNameVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>packageOrder</column-name><column-value><![CDATA[");
		sb.append(getPackageOrder());
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

	private static ClassLoader _classLoader = DmPackage.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DmPackage.class
		};
	private int _id;
	private String _packageCode;
	private String _originalPackageCode;
	private String _packageName;
	private String _packageNameVN;
	private int _packageOrder;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private long _columnBitmask;
	private DmPackage _escapedModel;
}