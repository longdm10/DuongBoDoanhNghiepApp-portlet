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

import vn.dtt.duongbien.dao.vrcb.model.DmGoodsType;
import vn.dtt.duongbien.dao.vrcb.model.DmGoodsTypeModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the DmGoodsType service. Represents a row in the &quot;DM_GOODS_TYPE&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbien.dao.vrcb.model.DmGoodsTypeModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DmGoodsTypeImpl}.
 * </p>
 *
 * @author longdm
 * @see DmGoodsTypeImpl
 * @see vn.dtt.duongbien.dao.vrcb.model.DmGoodsType
 * @see vn.dtt.duongbien.dao.vrcb.model.DmGoodsTypeModel
 * @generated
 */
public class DmGoodsTypeModelImpl extends BaseModelImpl<DmGoodsType>
	implements DmGoodsTypeModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dm goods type model instance should use the {@link vn.dtt.duongbien.dao.vrcb.model.DmGoodsType} interface instead.
	 */
	public static final String TABLE_NAME = "DM_GOODS_TYPE";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.INTEGER },
			{ "GoodsTypeCode", Types.VARCHAR },
			{ "GoodsTypeName", Types.VARCHAR },
			{ "GoodsTypeNameVN", Types.VARCHAR },
			{ "GoodsTypeOrder", Types.INTEGER },
			{ "IsDelete", Types.INTEGER },
			{ "MarkedAsDelete", Types.INTEGER },
			{ "ModifiedDate", Types.TIMESTAMP },
			{ "RequestedDate", Types.TIMESTAMP },
			{ "SyncVersion", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table DM_GOODS_TYPE (id INTEGER not null primary key,GoodsTypeCode VARCHAR(75) null,GoodsTypeName VARCHAR(75) null,GoodsTypeNameVN VARCHAR(75) null,GoodsTypeOrder INTEGER,IsDelete INTEGER,MarkedAsDelete INTEGER,ModifiedDate DATE null,RequestedDate DATE null,SyncVersion VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table DM_GOODS_TYPE";
	public static final String ORDER_BY_JPQL = " ORDER BY dmGoodsType.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY DM_GOODS_TYPE.id ASC";
	public static final String DATA_SOURCE = "vaoracangbienDataSource";
	public static final String SESSION_FACTORY = "ravaocangbienSessionFactory";
	public static final String TX_MANAGER = "ravaocangbienTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.DmGoodsType"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.DmGoodsType"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.duongbien.dao.vrcb.model.DmGoodsType"),
			true);
	public static long GOODSTYPECODE_COLUMN_BITMASK = 1L;
	public static long ID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbien.dao.vrcb.model.DmGoodsType"));

	public DmGoodsTypeModelImpl() {
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
		return DmGoodsType.class;
	}

	@Override
	public String getModelClassName() {
		return DmGoodsType.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("goodsTypeCode", getGoodsTypeCode());
		attributes.put("goodsTypeName", getGoodsTypeName());
		attributes.put("goodsTypeNameVN", getGoodsTypeNameVN());
		attributes.put("goodsTypeOrder", getGoodsTypeOrder());
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

		String goodsTypeCode = (String)attributes.get("goodsTypeCode");

		if (goodsTypeCode != null) {
			setGoodsTypeCode(goodsTypeCode);
		}

		String goodsTypeName = (String)attributes.get("goodsTypeName");

		if (goodsTypeName != null) {
			setGoodsTypeName(goodsTypeName);
		}

		String goodsTypeNameVN = (String)attributes.get("goodsTypeNameVN");

		if (goodsTypeNameVN != null) {
			setGoodsTypeNameVN(goodsTypeNameVN);
		}

		Integer goodsTypeOrder = (Integer)attributes.get("goodsTypeOrder");

		if (goodsTypeOrder != null) {
			setGoodsTypeOrder(goodsTypeOrder);
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
	public String getGoodsTypeCode() {
		if (_goodsTypeCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _goodsTypeCode;
		}
	}

	@Override
	public void setGoodsTypeCode(String goodsTypeCode) {
		_columnBitmask |= GOODSTYPECODE_COLUMN_BITMASK;

		if (_originalGoodsTypeCode == null) {
			_originalGoodsTypeCode = _goodsTypeCode;
		}

		_goodsTypeCode = goodsTypeCode;
	}

	public String getOriginalGoodsTypeCode() {
		return GetterUtil.getString(_originalGoodsTypeCode);
	}

	@Override
	public String getGoodsTypeName() {
		if (_goodsTypeName == null) {
			return StringPool.BLANK;
		}
		else {
			return _goodsTypeName;
		}
	}

	@Override
	public void setGoodsTypeName(String goodsTypeName) {
		_goodsTypeName = goodsTypeName;
	}

	@Override
	public String getGoodsTypeNameVN() {
		if (_goodsTypeNameVN == null) {
			return StringPool.BLANK;
		}
		else {
			return _goodsTypeNameVN;
		}
	}

	@Override
	public void setGoodsTypeNameVN(String goodsTypeNameVN) {
		_goodsTypeNameVN = goodsTypeNameVN;
	}

	@Override
	public int getGoodsTypeOrder() {
		return _goodsTypeOrder;
	}

	@Override
	public void setGoodsTypeOrder(int goodsTypeOrder) {
		_goodsTypeOrder = goodsTypeOrder;
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
	public DmGoodsType toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DmGoodsType)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DmGoodsTypeImpl dmGoodsTypeImpl = new DmGoodsTypeImpl();

		dmGoodsTypeImpl.setId(getId());
		dmGoodsTypeImpl.setGoodsTypeCode(getGoodsTypeCode());
		dmGoodsTypeImpl.setGoodsTypeName(getGoodsTypeName());
		dmGoodsTypeImpl.setGoodsTypeNameVN(getGoodsTypeNameVN());
		dmGoodsTypeImpl.setGoodsTypeOrder(getGoodsTypeOrder());
		dmGoodsTypeImpl.setIsDelete(getIsDelete());
		dmGoodsTypeImpl.setMarkedAsDelete(getMarkedAsDelete());
		dmGoodsTypeImpl.setModifiedDate(getModifiedDate());
		dmGoodsTypeImpl.setRequestedDate(getRequestedDate());
		dmGoodsTypeImpl.setSyncVersion(getSyncVersion());

		dmGoodsTypeImpl.resetOriginalValues();

		return dmGoodsTypeImpl;
	}

	@Override
	public int compareTo(DmGoodsType dmGoodsType) {
		int value = 0;

		if (getId() < dmGoodsType.getId()) {
			value = -1;
		}
		else if (getId() > dmGoodsType.getId()) {
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

		if (!(obj instanceof DmGoodsType)) {
			return false;
		}

		DmGoodsType dmGoodsType = (DmGoodsType)obj;

		int primaryKey = dmGoodsType.getPrimaryKey();

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
		DmGoodsTypeModelImpl dmGoodsTypeModelImpl = this;

		dmGoodsTypeModelImpl._originalGoodsTypeCode = dmGoodsTypeModelImpl._goodsTypeCode;

		dmGoodsTypeModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DmGoodsType> toCacheModel() {
		DmGoodsTypeCacheModel dmGoodsTypeCacheModel = new DmGoodsTypeCacheModel();

		dmGoodsTypeCacheModel.id = getId();

		dmGoodsTypeCacheModel.goodsTypeCode = getGoodsTypeCode();

		String goodsTypeCode = dmGoodsTypeCacheModel.goodsTypeCode;

		if ((goodsTypeCode != null) && (goodsTypeCode.length() == 0)) {
			dmGoodsTypeCacheModel.goodsTypeCode = null;
		}

		dmGoodsTypeCacheModel.goodsTypeName = getGoodsTypeName();

		String goodsTypeName = dmGoodsTypeCacheModel.goodsTypeName;

		if ((goodsTypeName != null) && (goodsTypeName.length() == 0)) {
			dmGoodsTypeCacheModel.goodsTypeName = null;
		}

		dmGoodsTypeCacheModel.goodsTypeNameVN = getGoodsTypeNameVN();

		String goodsTypeNameVN = dmGoodsTypeCacheModel.goodsTypeNameVN;

		if ((goodsTypeNameVN != null) && (goodsTypeNameVN.length() == 0)) {
			dmGoodsTypeCacheModel.goodsTypeNameVN = null;
		}

		dmGoodsTypeCacheModel.goodsTypeOrder = getGoodsTypeOrder();

		dmGoodsTypeCacheModel.isDelete = getIsDelete();

		dmGoodsTypeCacheModel.markedAsDelete = getMarkedAsDelete();

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			dmGoodsTypeCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			dmGoodsTypeCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		Date requestedDate = getRequestedDate();

		if (requestedDate != null) {
			dmGoodsTypeCacheModel.requestedDate = requestedDate.getTime();
		}
		else {
			dmGoodsTypeCacheModel.requestedDate = Long.MIN_VALUE;
		}

		dmGoodsTypeCacheModel.syncVersion = getSyncVersion();

		String syncVersion = dmGoodsTypeCacheModel.syncVersion;

		if ((syncVersion != null) && (syncVersion.length() == 0)) {
			dmGoodsTypeCacheModel.syncVersion = null;
		}

		return dmGoodsTypeCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", goodsTypeCode=");
		sb.append(getGoodsTypeCode());
		sb.append(", goodsTypeName=");
		sb.append(getGoodsTypeName());
		sb.append(", goodsTypeNameVN=");
		sb.append(getGoodsTypeNameVN());
		sb.append(", goodsTypeOrder=");
		sb.append(getGoodsTypeOrder());
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
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DmGoodsType");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>goodsTypeCode</column-name><column-value><![CDATA[");
		sb.append(getGoodsTypeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>goodsTypeName</column-name><column-value><![CDATA[");
		sb.append(getGoodsTypeName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>goodsTypeNameVN</column-name><column-value><![CDATA[");
		sb.append(getGoodsTypeNameVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>goodsTypeOrder</column-name><column-value><![CDATA[");
		sb.append(getGoodsTypeOrder());
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

	private static ClassLoader _classLoader = DmGoodsType.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DmGoodsType.class
		};
	private int _id;
	private String _goodsTypeCode;
	private String _originalGoodsTypeCode;
	private String _goodsTypeName;
	private String _goodsTypeNameVN;
	private int _goodsTypeOrder;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private long _columnBitmask;
	private DmGoodsType _escapedModel;
}