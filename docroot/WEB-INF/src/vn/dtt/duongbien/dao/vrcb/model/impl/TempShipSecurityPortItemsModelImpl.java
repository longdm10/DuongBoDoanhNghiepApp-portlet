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
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityPortItems;
import vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityPortItemsModel;
import vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityPortItemsSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the TempShipSecurityPortItems service. Represents a row in the &quot;TEMP_SHIP_SECURITY_PORT_ITEMS&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityPortItemsModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TempShipSecurityPortItemsImpl}.
 * </p>
 *
 * @author longdm
 * @see TempShipSecurityPortItemsImpl
 * @see vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityPortItems
 * @see vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityPortItemsModel
 * @generated
 */
@JSON(strict = true)
public class TempShipSecurityPortItemsModelImpl extends BaseModelImpl<TempShipSecurityPortItems>
	implements TempShipSecurityPortItemsModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a temp ship security port items model instance should use the {@link vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityPortItems} interface instead.
	 */
	public static final String TABLE_NAME = "TEMP_SHIP_SECURITY_PORT_ITEMS";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.BIGINT },
			{ "RequestCode", Types.VARCHAR },
			{ "ShipSecurityPortItemCode", Types.VARCHAR },
			{ "PortCode", Types.VARCHAR },
			{ "DateArrival", Types.TIMESTAMP },
			{ "DateDeparture", Types.TIMESTAMP },
			{ "SecurityLevelCode", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table TEMP_SHIP_SECURITY_PORT_ITEMS (ID LONG not null primary key,RequestCode VARCHAR(75) null,ShipSecurityPortItemCode VARCHAR(75) null,PortCode VARCHAR(75) null,DateArrival DATE null,DateDeparture DATE null,SecurityLevelCode VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table TEMP_SHIP_SECURITY_PORT_ITEMS";
	public static final String ORDER_BY_JPQL = " ORDER BY tempShipSecurityPortItems.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY TEMP_SHIP_SECURITY_PORT_ITEMS.ID ASC";
	public static final String DATA_SOURCE = "vaoracangbienDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityPortItems"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityPortItems"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityPortItems"),
			true);
	public static long REQUESTCODE_COLUMN_BITMASK = 1L;
	public static long ID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static TempShipSecurityPortItems toModel(
		TempShipSecurityPortItemsSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		TempShipSecurityPortItems model = new TempShipSecurityPortItemsImpl();

		model.setId(soapModel.getId());
		model.setRequestCode(soapModel.getRequestCode());
		model.setShipSecurityPortItemCode(soapModel.getShipSecurityPortItemCode());
		model.setPortCode(soapModel.getPortCode());
		model.setDateArrival(soapModel.getDateArrival());
		model.setDateDeparture(soapModel.getDateDeparture());
		model.setSecurityLevelCode(soapModel.getSecurityLevelCode());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<TempShipSecurityPortItems> toModels(
		TempShipSecurityPortItemsSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<TempShipSecurityPortItems> models = new ArrayList<TempShipSecurityPortItems>(soapModels.length);

		for (TempShipSecurityPortItemsSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityPortItems"));

	public TempShipSecurityPortItemsModelImpl() {
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
		return TempShipSecurityPortItems.class;
	}

	@Override
	public String getModelClassName() {
		return TempShipSecurityPortItems.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("requestCode", getRequestCode());
		attributes.put("shipSecurityPortItemCode", getShipSecurityPortItemCode());
		attributes.put("portCode", getPortCode());
		attributes.put("dateArrival", getDateArrival());
		attributes.put("dateDeparture", getDateDeparture());
		attributes.put("securityLevelCode", getSecurityLevelCode());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String requestCode = (String)attributes.get("requestCode");

		if (requestCode != null) {
			setRequestCode(requestCode);
		}

		String shipSecurityPortItemCode = (String)attributes.get(
				"shipSecurityPortItemCode");

		if (shipSecurityPortItemCode != null) {
			setShipSecurityPortItemCode(shipSecurityPortItemCode);
		}

		String portCode = (String)attributes.get("portCode");

		if (portCode != null) {
			setPortCode(portCode);
		}

		Date dateArrival = (Date)attributes.get("dateArrival");

		if (dateArrival != null) {
			setDateArrival(dateArrival);
		}

		Date dateDeparture = (Date)attributes.get("dateDeparture");

		if (dateDeparture != null) {
			setDateDeparture(dateDeparture);
		}

		String securityLevelCode = (String)attributes.get("securityLevelCode");

		if (securityLevelCode != null) {
			setSecurityLevelCode(securityLevelCode);
		}
	}

	@JSON
	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_columnBitmask = -1L;

		_id = id;
	}

	@JSON
	@Override
	public String getRequestCode() {
		if (_requestCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _requestCode;
		}
	}

	@Override
	public void setRequestCode(String requestCode) {
		_columnBitmask |= REQUESTCODE_COLUMN_BITMASK;

		if (_originalRequestCode == null) {
			_originalRequestCode = _requestCode;
		}

		_requestCode = requestCode;
	}

	public String getOriginalRequestCode() {
		return GetterUtil.getString(_originalRequestCode);
	}

	@JSON
	@Override
	public String getShipSecurityPortItemCode() {
		if (_shipSecurityPortItemCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _shipSecurityPortItemCode;
		}
	}

	@Override
	public void setShipSecurityPortItemCode(String shipSecurityPortItemCode) {
		_shipSecurityPortItemCode = shipSecurityPortItemCode;
	}

	@JSON
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

	@JSON
	@Override
	public Date getDateArrival() {
		return _dateArrival;
	}

	@Override
	public void setDateArrival(Date dateArrival) {
		_dateArrival = dateArrival;
	}

	@JSON
	@Override
	public Date getDateDeparture() {
		return _dateDeparture;
	}

	@Override
	public void setDateDeparture(Date dateDeparture) {
		_dateDeparture = dateDeparture;
	}

	@JSON
	@Override
	public String getSecurityLevelCode() {
		if (_securityLevelCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _securityLevelCode;
		}
	}

	@Override
	public void setSecurityLevelCode(String securityLevelCode) {
		_securityLevelCode = securityLevelCode;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			TempShipSecurityPortItems.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TempShipSecurityPortItems toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (TempShipSecurityPortItems)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TempShipSecurityPortItemsImpl tempShipSecurityPortItemsImpl = new TempShipSecurityPortItemsImpl();

		tempShipSecurityPortItemsImpl.setId(getId());
		tempShipSecurityPortItemsImpl.setRequestCode(getRequestCode());
		tempShipSecurityPortItemsImpl.setShipSecurityPortItemCode(getShipSecurityPortItemCode());
		tempShipSecurityPortItemsImpl.setPortCode(getPortCode());
		tempShipSecurityPortItemsImpl.setDateArrival(getDateArrival());
		tempShipSecurityPortItemsImpl.setDateDeparture(getDateDeparture());
		tempShipSecurityPortItemsImpl.setSecurityLevelCode(getSecurityLevelCode());

		tempShipSecurityPortItemsImpl.resetOriginalValues();

		return tempShipSecurityPortItemsImpl;
	}

	@Override
	public int compareTo(TempShipSecurityPortItems tempShipSecurityPortItems) {
		int value = 0;

		if (getId() < tempShipSecurityPortItems.getId()) {
			value = -1;
		}
		else if (getId() > tempShipSecurityPortItems.getId()) {
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

		if (!(obj instanceof TempShipSecurityPortItems)) {
			return false;
		}

		TempShipSecurityPortItems tempShipSecurityPortItems = (TempShipSecurityPortItems)obj;

		long primaryKey = tempShipSecurityPortItems.getPrimaryKey();

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
		TempShipSecurityPortItemsModelImpl tempShipSecurityPortItemsModelImpl = this;

		tempShipSecurityPortItemsModelImpl._originalRequestCode = tempShipSecurityPortItemsModelImpl._requestCode;

		tempShipSecurityPortItemsModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<TempShipSecurityPortItems> toCacheModel() {
		TempShipSecurityPortItemsCacheModel tempShipSecurityPortItemsCacheModel = new TempShipSecurityPortItemsCacheModel();

		tempShipSecurityPortItemsCacheModel.id = getId();

		tempShipSecurityPortItemsCacheModel.requestCode = getRequestCode();

		String requestCode = tempShipSecurityPortItemsCacheModel.requestCode;

		if ((requestCode != null) && (requestCode.length() == 0)) {
			tempShipSecurityPortItemsCacheModel.requestCode = null;
		}

		tempShipSecurityPortItemsCacheModel.shipSecurityPortItemCode = getShipSecurityPortItemCode();

		String shipSecurityPortItemCode = tempShipSecurityPortItemsCacheModel.shipSecurityPortItemCode;

		if ((shipSecurityPortItemCode != null) &&
				(shipSecurityPortItemCode.length() == 0)) {
			tempShipSecurityPortItemsCacheModel.shipSecurityPortItemCode = null;
		}

		tempShipSecurityPortItemsCacheModel.portCode = getPortCode();

		String portCode = tempShipSecurityPortItemsCacheModel.portCode;

		if ((portCode != null) && (portCode.length() == 0)) {
			tempShipSecurityPortItemsCacheModel.portCode = null;
		}

		Date dateArrival = getDateArrival();

		if (dateArrival != null) {
			tempShipSecurityPortItemsCacheModel.dateArrival = dateArrival.getTime();
		}
		else {
			tempShipSecurityPortItemsCacheModel.dateArrival = Long.MIN_VALUE;
		}

		Date dateDeparture = getDateDeparture();

		if (dateDeparture != null) {
			tempShipSecurityPortItemsCacheModel.dateDeparture = dateDeparture.getTime();
		}
		else {
			tempShipSecurityPortItemsCacheModel.dateDeparture = Long.MIN_VALUE;
		}

		tempShipSecurityPortItemsCacheModel.securityLevelCode = getSecurityLevelCode();

		String securityLevelCode = tempShipSecurityPortItemsCacheModel.securityLevelCode;

		if ((securityLevelCode != null) && (securityLevelCode.length() == 0)) {
			tempShipSecurityPortItemsCacheModel.securityLevelCode = null;
		}

		return tempShipSecurityPortItemsCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", shipSecurityPortItemCode=");
		sb.append(getShipSecurityPortItemCode());
		sb.append(", portCode=");
		sb.append(getPortCode());
		sb.append(", dateArrival=");
		sb.append(getDateArrival());
		sb.append(", dateDeparture=");
		sb.append(getDateDeparture());
		sb.append(", securityLevelCode=");
		sb.append(getSecurityLevelCode());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityPortItems");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestCode</column-name><column-value><![CDATA[");
		sb.append(getRequestCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipSecurityPortItemCode</column-name><column-value><![CDATA[");
		sb.append(getShipSecurityPortItemCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portCode</column-name><column-value><![CDATA[");
		sb.append(getPortCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateArrival</column-name><column-value><![CDATA[");
		sb.append(getDateArrival());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateDeparture</column-name><column-value><![CDATA[");
		sb.append(getDateDeparture());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>securityLevelCode</column-name><column-value><![CDATA[");
		sb.append(getSecurityLevelCode());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = TempShipSecurityPortItems.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			TempShipSecurityPortItems.class
		};
	private long _id;
	private String _requestCode;
	private String _originalRequestCode;
	private String _shipSecurityPortItemCode;
	private String _portCode;
	private Date _dateArrival;
	private Date _dateDeparture;
	private String _securityLevelCode;
	private long _columnBitmask;
	private TempShipSecurityPortItems _escapedModel;
}