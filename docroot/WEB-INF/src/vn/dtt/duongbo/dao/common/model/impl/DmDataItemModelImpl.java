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

package vn.dtt.duongbo.dao.common.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import vn.dtt.duongbo.dao.common.model.DmDataItem;
import vn.dtt.duongbo.dao.common.model.DmDataItemModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the DmDataItem service. Represents a row in the &quot;dm_dataitem&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbo.dao.common.model.DmDataItemModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DmDataItemImpl}.
 * </p>
 *
 * @author win_64
 * @see DmDataItemImpl
 * @see vn.dtt.duongbo.dao.common.model.DmDataItem
 * @see vn.dtt.duongbo.dao.common.model.DmDataItemModel
 * @generated
 */
public class DmDataItemModelImpl extends BaseModelImpl<DmDataItem>
	implements DmDataItemModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dm data item model instance should use the {@link vn.dtt.duongbo.dao.common.model.DmDataItem} interface instead.
	 */
	public static final String TABLE_NAME = "dm_dataitem";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "datagroupid", Types.BIGINT },
			{ "code", Types.VARCHAR },
			{ "node_1", Types.VARCHAR },
			{ "node_2", Types.VARCHAR },
			{ "node_3", Types.VARCHAR },
			{ "node_4", Types.VARCHAR },
			{ "level", Types.INTEGER },
			{ "name", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "validatedfrom", Types.VARCHAR },
			{ "validatedto", Types.VARCHAR },
			{ "status", Types.INTEGER },
			{ "order_", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table dm_dataitem (id LONG not null primary key,datagroupid LONG,code VARCHAR(75) null,node_1 VARCHAR(75) null,node_2 VARCHAR(75) null,node_3 VARCHAR(75) null,node_4 VARCHAR(75) null,level INTEGER,name VARCHAR(75) null,description VARCHAR(75) null,validatedfrom VARCHAR(75) null,validatedto VARCHAR(75) null,status INTEGER,order_ INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table dm_dataitem";
	public static final String ORDER_BY_JPQL = " ORDER BY dmDataItem.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY dm_dataitem.id ASC";
	public static final String DATA_SOURCE = "tthcDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbo.dao.common.model.DmDataItem"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbo.dao.common.model.DmDataItem"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.duongbo.dao.common.model.DmDataItem"),
			true);
	public static long CODE_COLUMN_BITMASK = 1L;
	public static long DATAGROUPID_COLUMN_BITMASK = 2L;
	public static long LEVEL_COLUMN_BITMASK = 4L;
	public static long NODE1_COLUMN_BITMASK = 8L;
	public static long STATUS_COLUMN_BITMASK = 16L;
	public static long ID_COLUMN_BITMASK = 32L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbo.dao.common.model.DmDataItem"));

	public DmDataItemModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return DmDataItem.class;
	}

	@Override
	public String getModelClassName() {
		return DmDataItem.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("dataGroupId", getDataGroupId());
		attributes.put("code", getCode());
		attributes.put("node1", getNode1());
		attributes.put("node2", getNode2());
		attributes.put("node3", getNode3());
		attributes.put("node4", getNode4());
		attributes.put("level", getLevel());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("validatedFrom", getValidatedFrom());
		attributes.put("validatedTo", getValidatedTo());
		attributes.put("status", getStatus());
		attributes.put("order", getOrder());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long dataGroupId = (Long)attributes.get("dataGroupId");

		if (dataGroupId != null) {
			setDataGroupId(dataGroupId);
		}

		String code = (String)attributes.get("code");

		if (code != null) {
			setCode(code);
		}

		String node1 = (String)attributes.get("node1");

		if (node1 != null) {
			setNode1(node1);
		}

		String node2 = (String)attributes.get("node2");

		if (node2 != null) {
			setNode2(node2);
		}

		String node3 = (String)attributes.get("node3");

		if (node3 != null) {
			setNode3(node3);
		}

		String node4 = (String)attributes.get("node4");

		if (node4 != null) {
			setNode4(node4);
		}

		Integer level = (Integer)attributes.get("level");

		if (level != null) {
			setLevel(level);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String validatedFrom = (String)attributes.get("validatedFrom");

		if (validatedFrom != null) {
			setValidatedFrom(validatedFrom);
		}

		String validatedTo = (String)attributes.get("validatedTo");

		if (validatedTo != null) {
			setValidatedTo(validatedTo);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Integer order = (Integer)attributes.get("order");

		if (order != null) {
			setOrder(order);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_columnBitmask = -1L;

		_id = id;
	}

	@Override
	public long getDataGroupId() {
		return _dataGroupId;
	}

	@Override
	public void setDataGroupId(long dataGroupId) {
		_columnBitmask |= DATAGROUPID_COLUMN_BITMASK;

		if (!_setOriginalDataGroupId) {
			_setOriginalDataGroupId = true;

			_originalDataGroupId = _dataGroupId;
		}

		_dataGroupId = dataGroupId;
	}

	public long getOriginalDataGroupId() {
		return _originalDataGroupId;
	}

	@Override
	public String getCode() {
		if (_code == null) {
			return StringPool.BLANK;
		}
		else {
			return _code;
		}
	}

	@Override
	public void setCode(String code) {
		_columnBitmask |= CODE_COLUMN_BITMASK;

		if (_originalCode == null) {
			_originalCode = _code;
		}

		_code = code;
	}

	public String getOriginalCode() {
		return GetterUtil.getString(_originalCode);
	}

	@Override
	public String getNode1() {
		if (_node1 == null) {
			return StringPool.BLANK;
		}
		else {
			return _node1;
		}
	}

	@Override
	public void setNode1(String node1) {
		_columnBitmask |= NODE1_COLUMN_BITMASK;

		if (_originalNode1 == null) {
			_originalNode1 = _node1;
		}

		_node1 = node1;
	}

	public String getOriginalNode1() {
		return GetterUtil.getString(_originalNode1);
	}

	@Override
	public String getNode2() {
		if (_node2 == null) {
			return StringPool.BLANK;
		}
		else {
			return _node2;
		}
	}

	@Override
	public void setNode2(String node2) {
		_node2 = node2;
	}

	@Override
	public String getNode3() {
		if (_node3 == null) {
			return StringPool.BLANK;
		}
		else {
			return _node3;
		}
	}

	@Override
	public void setNode3(String node3) {
		_node3 = node3;
	}

	@Override
	public String getNode4() {
		if (_node4 == null) {
			return StringPool.BLANK;
		}
		else {
			return _node4;
		}
	}

	@Override
	public void setNode4(String node4) {
		_node4 = node4;
	}

	@Override
	public int getLevel() {
		return _level;
	}

	@Override
	public void setLevel(int level) {
		_columnBitmask |= LEVEL_COLUMN_BITMASK;

		if (!_setOriginalLevel) {
			_setOriginalLevel = true;

			_originalLevel = _level;
		}

		_level = level;
	}

	public int getOriginalLevel() {
		return _originalLevel;
	}

	@Override
	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_name = name;
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
	public String getValidatedFrom() {
		if (_validatedFrom == null) {
			return StringPool.BLANK;
		}
		else {
			return _validatedFrom;
		}
	}

	@Override
	public void setValidatedFrom(String validatedFrom) {
		_validatedFrom = validatedFrom;
	}

	@Override
	public String getValidatedTo() {
		if (_validatedTo == null) {
			return StringPool.BLANK;
		}
		else {
			return _validatedTo;
		}
	}

	@Override
	public void setValidatedTo(String validatedTo) {
		_validatedTo = validatedTo;
	}

	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_columnBitmask |= STATUS_COLUMN_BITMASK;

		if (!_setOriginalStatus) {
			_setOriginalStatus = true;

			_originalStatus = _status;
		}

		_status = status;
	}

	public int getOriginalStatus() {
		return _originalStatus;
	}

	@Override
	public int getOrder() {
		return _order;
	}

	@Override
	public void setOrder(int order) {
		_order = order;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			DmDataItem.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public DmDataItem toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DmDataItem)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DmDataItemImpl dmDataItemImpl = new DmDataItemImpl();

		dmDataItemImpl.setId(getId());
		dmDataItemImpl.setDataGroupId(getDataGroupId());
		dmDataItemImpl.setCode(getCode());
		dmDataItemImpl.setNode1(getNode1());
		dmDataItemImpl.setNode2(getNode2());
		dmDataItemImpl.setNode3(getNode3());
		dmDataItemImpl.setNode4(getNode4());
		dmDataItemImpl.setLevel(getLevel());
		dmDataItemImpl.setName(getName());
		dmDataItemImpl.setDescription(getDescription());
		dmDataItemImpl.setValidatedFrom(getValidatedFrom());
		dmDataItemImpl.setValidatedTo(getValidatedTo());
		dmDataItemImpl.setStatus(getStatus());
		dmDataItemImpl.setOrder(getOrder());

		dmDataItemImpl.resetOriginalValues();

		return dmDataItemImpl;
	}

	@Override
	public int compareTo(DmDataItem dmDataItem) {
		int value = 0;

		if (getId() < dmDataItem.getId()) {
			value = -1;
		}
		else if (getId() > dmDataItem.getId()) {
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

		if (!(obj instanceof DmDataItem)) {
			return false;
		}

		DmDataItem dmDataItem = (DmDataItem)obj;

		long primaryKey = dmDataItem.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		DmDataItemModelImpl dmDataItemModelImpl = this;

		dmDataItemModelImpl._originalDataGroupId = dmDataItemModelImpl._dataGroupId;

		dmDataItemModelImpl._setOriginalDataGroupId = false;

		dmDataItemModelImpl._originalCode = dmDataItemModelImpl._code;

		dmDataItemModelImpl._originalNode1 = dmDataItemModelImpl._node1;

		dmDataItemModelImpl._originalLevel = dmDataItemModelImpl._level;

		dmDataItemModelImpl._setOriginalLevel = false;

		dmDataItemModelImpl._originalStatus = dmDataItemModelImpl._status;

		dmDataItemModelImpl._setOriginalStatus = false;

		dmDataItemModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DmDataItem> toCacheModel() {
		DmDataItemCacheModel dmDataItemCacheModel = new DmDataItemCacheModel();

		dmDataItemCacheModel.id = getId();

		dmDataItemCacheModel.dataGroupId = getDataGroupId();

		dmDataItemCacheModel.code = getCode();

		String code = dmDataItemCacheModel.code;

		if ((code != null) && (code.length() == 0)) {
			dmDataItemCacheModel.code = null;
		}

		dmDataItemCacheModel.node1 = getNode1();

		String node1 = dmDataItemCacheModel.node1;

		if ((node1 != null) && (node1.length() == 0)) {
			dmDataItemCacheModel.node1 = null;
		}

		dmDataItemCacheModel.node2 = getNode2();

		String node2 = dmDataItemCacheModel.node2;

		if ((node2 != null) && (node2.length() == 0)) {
			dmDataItemCacheModel.node2 = null;
		}

		dmDataItemCacheModel.node3 = getNode3();

		String node3 = dmDataItemCacheModel.node3;

		if ((node3 != null) && (node3.length() == 0)) {
			dmDataItemCacheModel.node3 = null;
		}

		dmDataItemCacheModel.node4 = getNode4();

		String node4 = dmDataItemCacheModel.node4;

		if ((node4 != null) && (node4.length() == 0)) {
			dmDataItemCacheModel.node4 = null;
		}

		dmDataItemCacheModel.level = getLevel();

		dmDataItemCacheModel.name = getName();

		String name = dmDataItemCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			dmDataItemCacheModel.name = null;
		}

		dmDataItemCacheModel.description = getDescription();

		String description = dmDataItemCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			dmDataItemCacheModel.description = null;
		}

		dmDataItemCacheModel.validatedFrom = getValidatedFrom();

		String validatedFrom = dmDataItemCacheModel.validatedFrom;

		if ((validatedFrom != null) && (validatedFrom.length() == 0)) {
			dmDataItemCacheModel.validatedFrom = null;
		}

		dmDataItemCacheModel.validatedTo = getValidatedTo();

		String validatedTo = dmDataItemCacheModel.validatedTo;

		if ((validatedTo != null) && (validatedTo.length() == 0)) {
			dmDataItemCacheModel.validatedTo = null;
		}

		dmDataItemCacheModel.status = getStatus();

		dmDataItemCacheModel.order = getOrder();

		return dmDataItemCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", dataGroupId=");
		sb.append(getDataGroupId());
		sb.append(", code=");
		sb.append(getCode());
		sb.append(", node1=");
		sb.append(getNode1());
		sb.append(", node2=");
		sb.append(getNode2());
		sb.append(", node3=");
		sb.append(getNode3());
		sb.append(", node4=");
		sb.append(getNode4());
		sb.append(", level=");
		sb.append(getLevel());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", validatedFrom=");
		sb.append(getValidatedFrom());
		sb.append(", validatedTo=");
		sb.append(getValidatedTo());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", order=");
		sb.append(getOrder());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.common.model.DmDataItem");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dataGroupId</column-name><column-value><![CDATA[");
		sb.append(getDataGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>code</column-name><column-value><![CDATA[");
		sb.append(getCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>node1</column-name><column-value><![CDATA[");
		sb.append(getNode1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>node2</column-name><column-value><![CDATA[");
		sb.append(getNode2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>node3</column-name><column-value><![CDATA[");
		sb.append(getNode3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>node4</column-name><column-value><![CDATA[");
		sb.append(getNode4());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>level</column-name><column-value><![CDATA[");
		sb.append(getLevel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>validatedFrom</column-name><column-value><![CDATA[");
		sb.append(getValidatedFrom());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>validatedTo</column-name><column-value><![CDATA[");
		sb.append(getValidatedTo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>order</column-name><column-value><![CDATA[");
		sb.append(getOrder());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = DmDataItem.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DmDataItem.class
		};
	private long _id;
	private long _dataGroupId;
	private long _originalDataGroupId;
	private boolean _setOriginalDataGroupId;
	private String _code;
	private String _originalCode;
	private String _node1;
	private String _originalNode1;
	private String _node2;
	private String _node3;
	private String _node4;
	private int _level;
	private int _originalLevel;
	private boolean _setOriginalLevel;
	private String _name;
	private String _description;
	private String _validatedFrom;
	private String _validatedTo;
	private int _status;
	private int _originalStatus;
	private boolean _setOriginalStatus;
	private int _order;
	private long _columnBitmask;
	private DmDataItem _escapedModel;
}