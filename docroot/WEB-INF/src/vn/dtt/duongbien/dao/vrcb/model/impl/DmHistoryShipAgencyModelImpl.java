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

import vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency;
import vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgencyModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the DmHistoryShipAgency service. Represents a row in the &quot;DM_HISTORY_SHIP_AGENCY&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgencyModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DmHistoryShipAgencyImpl}.
 * </p>
 *
 * @author longdm
 * @see DmHistoryShipAgencyImpl
 * @see vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency
 * @see vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgencyModel
 * @generated
 */
public class DmHistoryShipAgencyModelImpl extends BaseModelImpl<DmHistoryShipAgency>
	implements DmHistoryShipAgencyModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dm history ship agency model instance should use the {@link vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency} interface instead.
	 */
	public static final String TABLE_NAME = "DM_HISTORY_SHIP_AGENCY";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.INTEGER },
			{ "ShipAgencyCode", Types.VARCHAR },
			{ "ShipAgencyName", Types.VARCHAR },
			{ "ShipAgencyNameVN", Types.VARCHAR },
			{ "TaxCode", Types.VARCHAR },
			{ "StateCode", Types.VARCHAR },
			{ "CityCode", Types.VARCHAR },
			{ "Address", Types.VARCHAR },
			{ "AddressVN", Types.VARCHAR },
			{ "Phone", Types.VARCHAR },
			{ "Fax", Types.VARCHAR },
			{ "Email", Types.VARCHAR },
			{ "Description", Types.VARCHAR },
			{ "Contacter", Types.VARCHAR },
			{ "Position", Types.VARCHAR },
			{ "ContactTell", Types.VARCHAR },
			{ "IsDelete", Types.INTEGER },
			{ "MarkedAsDelete", Types.INTEGER },
			{ "ModifiedDate", Types.TIMESTAMP },
			{ "RequestedDate", Types.TIMESTAMP },
			{ "SyncVersion", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table DM_HISTORY_SHIP_AGENCY (id INTEGER not null primary key,ShipAgencyCode VARCHAR(75) null,ShipAgencyName VARCHAR(75) null,ShipAgencyNameVN VARCHAR(75) null,TaxCode VARCHAR(75) null,StateCode VARCHAR(75) null,CityCode VARCHAR(75) null,Address VARCHAR(75) null,AddressVN VARCHAR(75) null,Phone VARCHAR(75) null,Fax VARCHAR(75) null,Email VARCHAR(75) null,Description VARCHAR(75) null,Contacter VARCHAR(75) null,Position VARCHAR(75) null,ContactTell VARCHAR(75) null,IsDelete INTEGER,MarkedAsDelete INTEGER,ModifiedDate DATE null,RequestedDate DATE null,SyncVersion VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table DM_HISTORY_SHIP_AGENCY";
	public static final String ORDER_BY_JPQL = " ORDER BY dmHistoryShipAgency.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY DM_HISTORY_SHIP_AGENCY.id ASC";
	public static final String DATA_SOURCE = "vaoracangbienDataSource";
	public static final String SESSION_FACTORY = "ravaocangbienSessionFactory";
	public static final String TX_MANAGER = "ravaocangbienTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency"),
			true);
	public static long SHIPAGENCYCODE_COLUMN_BITMASK = 1L;
	public static long SYNCVERSION_COLUMN_BITMASK = 2L;
	public static long ID_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency"));

	public DmHistoryShipAgencyModelImpl() {
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
		return DmHistoryShipAgency.class;
	}

	@Override
	public String getModelClassName() {
		return DmHistoryShipAgency.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("shipAgencyCode", getShipAgencyCode());
		attributes.put("shipAgencyName", getShipAgencyName());
		attributes.put("shipAgencyNameVN", getShipAgencyNameVN());
		attributes.put("taxCode", getTaxCode());
		attributes.put("stateCode", getStateCode());
		attributes.put("citycode", getCitycode());
		attributes.put("address", getAddress());
		attributes.put("addressVN", getAddressVN());
		attributes.put("phone", getPhone());
		attributes.put("fax", getFax());
		attributes.put("email", getEmail());
		attributes.put("description", getDescription());
		attributes.put("contacter", getContacter());
		attributes.put("position", getPosition());
		attributes.put("contactTell", getContactTell());
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

		String shipAgencyCode = (String)attributes.get("shipAgencyCode");

		if (shipAgencyCode != null) {
			setShipAgencyCode(shipAgencyCode);
		}

		String shipAgencyName = (String)attributes.get("shipAgencyName");

		if (shipAgencyName != null) {
			setShipAgencyName(shipAgencyName);
		}

		String shipAgencyNameVN = (String)attributes.get("shipAgencyNameVN");

		if (shipAgencyNameVN != null) {
			setShipAgencyNameVN(shipAgencyNameVN);
		}

		String taxCode = (String)attributes.get("taxCode");

		if (taxCode != null) {
			setTaxCode(taxCode);
		}

		String stateCode = (String)attributes.get("stateCode");

		if (stateCode != null) {
			setStateCode(stateCode);
		}

		String citycode = (String)attributes.get("citycode");

		if (citycode != null) {
			setCitycode(citycode);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String addressVN = (String)attributes.get("addressVN");

		if (addressVN != null) {
			setAddressVN(addressVN);
		}

		String phone = (String)attributes.get("phone");

		if (phone != null) {
			setPhone(phone);
		}

		String fax = (String)attributes.get("fax");

		if (fax != null) {
			setFax(fax);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String contacter = (String)attributes.get("contacter");

		if (contacter != null) {
			setContacter(contacter);
		}

		String position = (String)attributes.get("position");

		if (position != null) {
			setPosition(position);
		}

		String contactTell = (String)attributes.get("contactTell");

		if (contactTell != null) {
			setContactTell(contactTell);
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
	public String getShipAgencyCode() {
		if (_shipAgencyCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _shipAgencyCode;
		}
	}

	@Override
	public void setShipAgencyCode(String shipAgencyCode) {
		_columnBitmask |= SHIPAGENCYCODE_COLUMN_BITMASK;

		if (_originalShipAgencyCode == null) {
			_originalShipAgencyCode = _shipAgencyCode;
		}

		_shipAgencyCode = shipAgencyCode;
	}

	public String getOriginalShipAgencyCode() {
		return GetterUtil.getString(_originalShipAgencyCode);
	}

	@Override
	public String getShipAgencyName() {
		if (_shipAgencyName == null) {
			return StringPool.BLANK;
		}
		else {
			return _shipAgencyName;
		}
	}

	@Override
	public void setShipAgencyName(String shipAgencyName) {
		_shipAgencyName = shipAgencyName;
	}

	@Override
	public String getShipAgencyNameVN() {
		if (_shipAgencyNameVN == null) {
			return StringPool.BLANK;
		}
		else {
			return _shipAgencyNameVN;
		}
	}

	@Override
	public void setShipAgencyNameVN(String shipAgencyNameVN) {
		_shipAgencyNameVN = shipAgencyNameVN;
	}

	@Override
	public String getTaxCode() {
		if (_taxCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _taxCode;
		}
	}

	@Override
	public void setTaxCode(String taxCode) {
		_taxCode = taxCode;
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
		_stateCode = stateCode;
	}

	@Override
	public String getCitycode() {
		if (_citycode == null) {
			return StringPool.BLANK;
		}
		else {
			return _citycode;
		}
	}

	@Override
	public void setCitycode(String citycode) {
		_citycode = citycode;
	}

	@Override
	public String getAddress() {
		if (_address == null) {
			return StringPool.BLANK;
		}
		else {
			return _address;
		}
	}

	@Override
	public void setAddress(String address) {
		_address = address;
	}

	@Override
	public String getAddressVN() {
		if (_addressVN == null) {
			return StringPool.BLANK;
		}
		else {
			return _addressVN;
		}
	}

	@Override
	public void setAddressVN(String addressVN) {
		_addressVN = addressVN;
	}

	@Override
	public String getPhone() {
		if (_phone == null) {
			return StringPool.BLANK;
		}
		else {
			return _phone;
		}
	}

	@Override
	public void setPhone(String phone) {
		_phone = phone;
	}

	@Override
	public String getFax() {
		if (_fax == null) {
			return StringPool.BLANK;
		}
		else {
			return _fax;
		}
	}

	@Override
	public void setFax(String fax) {
		_fax = fax;
	}

	@Override
	public String getEmail() {
		if (_email == null) {
			return StringPool.BLANK;
		}
		else {
			return _email;
		}
	}

	@Override
	public void setEmail(String email) {
		_email = email;
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
	public String getContacter() {
		if (_contacter == null) {
			return StringPool.BLANK;
		}
		else {
			return _contacter;
		}
	}

	@Override
	public void setContacter(String contacter) {
		_contacter = contacter;
	}

	@Override
	public String getPosition() {
		if (_position == null) {
			return StringPool.BLANK;
		}
		else {
			return _position;
		}
	}

	@Override
	public void setPosition(String position) {
		_position = position;
	}

	@Override
	public String getContactTell() {
		if (_contactTell == null) {
			return StringPool.BLANK;
		}
		else {
			return _contactTell;
		}
	}

	@Override
	public void setContactTell(String contactTell) {
		_contactTell = contactTell;
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
	public DmHistoryShipAgency toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DmHistoryShipAgency)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DmHistoryShipAgencyImpl dmHistoryShipAgencyImpl = new DmHistoryShipAgencyImpl();

		dmHistoryShipAgencyImpl.setId(getId());
		dmHistoryShipAgencyImpl.setShipAgencyCode(getShipAgencyCode());
		dmHistoryShipAgencyImpl.setShipAgencyName(getShipAgencyName());
		dmHistoryShipAgencyImpl.setShipAgencyNameVN(getShipAgencyNameVN());
		dmHistoryShipAgencyImpl.setTaxCode(getTaxCode());
		dmHistoryShipAgencyImpl.setStateCode(getStateCode());
		dmHistoryShipAgencyImpl.setCitycode(getCitycode());
		dmHistoryShipAgencyImpl.setAddress(getAddress());
		dmHistoryShipAgencyImpl.setAddressVN(getAddressVN());
		dmHistoryShipAgencyImpl.setPhone(getPhone());
		dmHistoryShipAgencyImpl.setFax(getFax());
		dmHistoryShipAgencyImpl.setEmail(getEmail());
		dmHistoryShipAgencyImpl.setDescription(getDescription());
		dmHistoryShipAgencyImpl.setContacter(getContacter());
		dmHistoryShipAgencyImpl.setPosition(getPosition());
		dmHistoryShipAgencyImpl.setContactTell(getContactTell());
		dmHistoryShipAgencyImpl.setIsDelete(getIsDelete());
		dmHistoryShipAgencyImpl.setMarkedAsDelete(getMarkedAsDelete());
		dmHistoryShipAgencyImpl.setModifiedDate(getModifiedDate());
		dmHistoryShipAgencyImpl.setRequestedDate(getRequestedDate());
		dmHistoryShipAgencyImpl.setSyncVersion(getSyncVersion());

		dmHistoryShipAgencyImpl.resetOriginalValues();

		return dmHistoryShipAgencyImpl;
	}

	@Override
	public int compareTo(DmHistoryShipAgency dmHistoryShipAgency) {
		int value = 0;

		if (getId() < dmHistoryShipAgency.getId()) {
			value = -1;
		}
		else if (getId() > dmHistoryShipAgency.getId()) {
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

		if (!(obj instanceof DmHistoryShipAgency)) {
			return false;
		}

		DmHistoryShipAgency dmHistoryShipAgency = (DmHistoryShipAgency)obj;

		int primaryKey = dmHistoryShipAgency.getPrimaryKey();

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
		DmHistoryShipAgencyModelImpl dmHistoryShipAgencyModelImpl = this;

		dmHistoryShipAgencyModelImpl._originalShipAgencyCode = dmHistoryShipAgencyModelImpl._shipAgencyCode;

		dmHistoryShipAgencyModelImpl._originalSyncVersion = dmHistoryShipAgencyModelImpl._syncVersion;

		dmHistoryShipAgencyModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DmHistoryShipAgency> toCacheModel() {
		DmHistoryShipAgencyCacheModel dmHistoryShipAgencyCacheModel = new DmHistoryShipAgencyCacheModel();

		dmHistoryShipAgencyCacheModel.id = getId();

		dmHistoryShipAgencyCacheModel.shipAgencyCode = getShipAgencyCode();

		String shipAgencyCode = dmHistoryShipAgencyCacheModel.shipAgencyCode;

		if ((shipAgencyCode != null) && (shipAgencyCode.length() == 0)) {
			dmHistoryShipAgencyCacheModel.shipAgencyCode = null;
		}

		dmHistoryShipAgencyCacheModel.shipAgencyName = getShipAgencyName();

		String shipAgencyName = dmHistoryShipAgencyCacheModel.shipAgencyName;

		if ((shipAgencyName != null) && (shipAgencyName.length() == 0)) {
			dmHistoryShipAgencyCacheModel.shipAgencyName = null;
		}

		dmHistoryShipAgencyCacheModel.shipAgencyNameVN = getShipAgencyNameVN();

		String shipAgencyNameVN = dmHistoryShipAgencyCacheModel.shipAgencyNameVN;

		if ((shipAgencyNameVN != null) && (shipAgencyNameVN.length() == 0)) {
			dmHistoryShipAgencyCacheModel.shipAgencyNameVN = null;
		}

		dmHistoryShipAgencyCacheModel.taxCode = getTaxCode();

		String taxCode = dmHistoryShipAgencyCacheModel.taxCode;

		if ((taxCode != null) && (taxCode.length() == 0)) {
			dmHistoryShipAgencyCacheModel.taxCode = null;
		}

		dmHistoryShipAgencyCacheModel.stateCode = getStateCode();

		String stateCode = dmHistoryShipAgencyCacheModel.stateCode;

		if ((stateCode != null) && (stateCode.length() == 0)) {
			dmHistoryShipAgencyCacheModel.stateCode = null;
		}

		dmHistoryShipAgencyCacheModel.citycode = getCitycode();

		String citycode = dmHistoryShipAgencyCacheModel.citycode;

		if ((citycode != null) && (citycode.length() == 0)) {
			dmHistoryShipAgencyCacheModel.citycode = null;
		}

		dmHistoryShipAgencyCacheModel.address = getAddress();

		String address = dmHistoryShipAgencyCacheModel.address;

		if ((address != null) && (address.length() == 0)) {
			dmHistoryShipAgencyCacheModel.address = null;
		}

		dmHistoryShipAgencyCacheModel.addressVN = getAddressVN();

		String addressVN = dmHistoryShipAgencyCacheModel.addressVN;

		if ((addressVN != null) && (addressVN.length() == 0)) {
			dmHistoryShipAgencyCacheModel.addressVN = null;
		}

		dmHistoryShipAgencyCacheModel.phone = getPhone();

		String phone = dmHistoryShipAgencyCacheModel.phone;

		if ((phone != null) && (phone.length() == 0)) {
			dmHistoryShipAgencyCacheModel.phone = null;
		}

		dmHistoryShipAgencyCacheModel.fax = getFax();

		String fax = dmHistoryShipAgencyCacheModel.fax;

		if ((fax != null) && (fax.length() == 0)) {
			dmHistoryShipAgencyCacheModel.fax = null;
		}

		dmHistoryShipAgencyCacheModel.email = getEmail();

		String email = dmHistoryShipAgencyCacheModel.email;

		if ((email != null) && (email.length() == 0)) {
			dmHistoryShipAgencyCacheModel.email = null;
		}

		dmHistoryShipAgencyCacheModel.description = getDescription();

		String description = dmHistoryShipAgencyCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			dmHistoryShipAgencyCacheModel.description = null;
		}

		dmHistoryShipAgencyCacheModel.contacter = getContacter();

		String contacter = dmHistoryShipAgencyCacheModel.contacter;

		if ((contacter != null) && (contacter.length() == 0)) {
			dmHistoryShipAgencyCacheModel.contacter = null;
		}

		dmHistoryShipAgencyCacheModel.position = getPosition();

		String position = dmHistoryShipAgencyCacheModel.position;

		if ((position != null) && (position.length() == 0)) {
			dmHistoryShipAgencyCacheModel.position = null;
		}

		dmHistoryShipAgencyCacheModel.contactTell = getContactTell();

		String contactTell = dmHistoryShipAgencyCacheModel.contactTell;

		if ((contactTell != null) && (contactTell.length() == 0)) {
			dmHistoryShipAgencyCacheModel.contactTell = null;
		}

		dmHistoryShipAgencyCacheModel.isDelete = getIsDelete();

		dmHistoryShipAgencyCacheModel.markedAsDelete = getMarkedAsDelete();

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			dmHistoryShipAgencyCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			dmHistoryShipAgencyCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		Date requestedDate = getRequestedDate();

		if (requestedDate != null) {
			dmHistoryShipAgencyCacheModel.requestedDate = requestedDate.getTime();
		}
		else {
			dmHistoryShipAgencyCacheModel.requestedDate = Long.MIN_VALUE;
		}

		dmHistoryShipAgencyCacheModel.syncVersion = getSyncVersion();

		String syncVersion = dmHistoryShipAgencyCacheModel.syncVersion;

		if ((syncVersion != null) && (syncVersion.length() == 0)) {
			dmHistoryShipAgencyCacheModel.syncVersion = null;
		}

		return dmHistoryShipAgencyCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", shipAgencyCode=");
		sb.append(getShipAgencyCode());
		sb.append(", shipAgencyName=");
		sb.append(getShipAgencyName());
		sb.append(", shipAgencyNameVN=");
		sb.append(getShipAgencyNameVN());
		sb.append(", taxCode=");
		sb.append(getTaxCode());
		sb.append(", stateCode=");
		sb.append(getStateCode());
		sb.append(", citycode=");
		sb.append(getCitycode());
		sb.append(", address=");
		sb.append(getAddress());
		sb.append(", addressVN=");
		sb.append(getAddressVN());
		sb.append(", phone=");
		sb.append(getPhone());
		sb.append(", fax=");
		sb.append(getFax());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", contacter=");
		sb.append(getContacter());
		sb.append(", position=");
		sb.append(getPosition());
		sb.append(", contactTell=");
		sb.append(getContactTell());
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
		StringBundler sb = new StringBundler(67);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipAgencyCode</column-name><column-value><![CDATA[");
		sb.append(getShipAgencyCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipAgencyName</column-name><column-value><![CDATA[");
		sb.append(getShipAgencyName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipAgencyNameVN</column-name><column-value><![CDATA[");
		sb.append(getShipAgencyNameVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>taxCode</column-name><column-value><![CDATA[");
		sb.append(getTaxCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stateCode</column-name><column-value><![CDATA[");
		sb.append(getStateCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>citycode</column-name><column-value><![CDATA[");
		sb.append(getCitycode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address</column-name><column-value><![CDATA[");
		sb.append(getAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>addressVN</column-name><column-value><![CDATA[");
		sb.append(getAddressVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phone</column-name><column-value><![CDATA[");
		sb.append(getPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fax</column-name><column-value><![CDATA[");
		sb.append(getFax());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contacter</column-name><column-value><![CDATA[");
		sb.append(getContacter());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>position</column-name><column-value><![CDATA[");
		sb.append(getPosition());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactTell</column-name><column-value><![CDATA[");
		sb.append(getContactTell());
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

	private static ClassLoader _classLoader = DmHistoryShipAgency.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DmHistoryShipAgency.class
		};
	private int _id;
	private String _shipAgencyCode;
	private String _originalShipAgencyCode;
	private String _shipAgencyName;
	private String _shipAgencyNameVN;
	private String _taxCode;
	private String _stateCode;
	private String _citycode;
	private String _address;
	private String _addressVN;
	private String _phone;
	private String _fax;
	private String _email;
	private String _description;
	private String _contacter;
	private String _position;
	private String _contactTell;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private String _originalSyncVersion;
	private long _columnBitmask;
	private DmHistoryShipAgency _escapedModel;
}