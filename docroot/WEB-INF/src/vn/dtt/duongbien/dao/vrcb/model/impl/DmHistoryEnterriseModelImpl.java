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

import vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise;
import vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterriseModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the DmHistoryEnterrise service. Represents a row in the &quot;dm_history_enterprise&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterriseModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DmHistoryEnterriseImpl}.
 * </p>
 *
 * @author longdm
 * @see DmHistoryEnterriseImpl
 * @see vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise
 * @see vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterriseModel
 * @generated
 */
public class DmHistoryEnterriseModelImpl extends BaseModelImpl<DmHistoryEnterrise>
	implements DmHistoryEnterriseModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dm history enterrise model instance should use the {@link vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise} interface instead.
	 */
	public static final String TABLE_NAME = "dm_history_enterprise";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.INTEGER },
			{ "enterprisecode", Types.VARCHAR },
			{ "enterprisetaxcode", Types.VARCHAR },
			{ "enterprisename", Types.VARCHAR },
			{ "enterpriseshortname", Types.VARCHAR },
			{ "enterpriseforeignname", Types.VARCHAR },
			{ "enterpriseperson", Types.VARCHAR },
			{ "enterprisehoaddress", Types.VARCHAR },
			{ "statecode", Types.VARCHAR },
			{ "citycode", Types.VARCHAR },
			{ "districtcode", Types.VARCHAR },
			{ "wardcode", Types.VARCHAR },
			{ "telephoneno", Types.VARCHAR },
			{ "registrationcode", Types.VARCHAR },
			{ "registrationaddress", Types.VARCHAR },
			{ "registrationdate", Types.TIMESTAMP },
			{ "isdelete", Types.INTEGER },
			{ "markedasdelete", Types.INTEGER },
			{ "modifieddate", Types.TIMESTAMP },
			{ "requesteddate", Types.TIMESTAMP },
			{ "syncversion", Types.VARCHAR },
			{ "modifieduser", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table dm_history_enterprise (id INTEGER not null primary key,enterprisecode VARCHAR(75) null,enterprisetaxcode VARCHAR(75) null,enterprisename VARCHAR(75) null,enterpriseshortname VARCHAR(75) null,enterpriseforeignname VARCHAR(75) null,enterpriseperson VARCHAR(75) null,enterprisehoaddress VARCHAR(75) null,statecode VARCHAR(75) null,citycode VARCHAR(75) null,districtcode VARCHAR(75) null,wardcode VARCHAR(75) null,telephoneno VARCHAR(75) null,registrationcode VARCHAR(75) null,registrationaddress VARCHAR(75) null,registrationdate DATE null,isdelete INTEGER,markedasdelete INTEGER,modifieddate DATE null,requesteddate DATE null,syncversion VARCHAR(75) null,modifieduser VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table dm_history_enterprise";
	public static final String ORDER_BY_JPQL = " ORDER BY dmHistoryEnterrise.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY dm_history_enterprise.id ASC";
	public static final String DATA_SOURCE = "vaoracangbienDataSource";
	public static final String SESSION_FACTORY = "ravaocangbienSessionFactory";
	public static final String TX_MANAGER = "ravaocangbienTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise"),
			true);
	public static long ENTERPRISECODE_COLUMN_BITMASK = 1L;
	public static long ENTERPRISETAXCODE_COLUMN_BITMASK = 2L;
	public static long SYNCVERSION_COLUMN_BITMASK = 4L;
	public static long ID_COLUMN_BITMASK = 8L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise"));

	public DmHistoryEnterriseModelImpl() {
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
		return DmHistoryEnterrise.class;
	}

	@Override
	public String getModelClassName() {
		return DmHistoryEnterrise.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("enterpriseCode", getEnterpriseCode());
		attributes.put("enterpriseTaxCode", getEnterpriseTaxCode());
		attributes.put("enterpriseName", getEnterpriseName());
		attributes.put("enterpriseShortName", getEnterpriseShortName());
		attributes.put("enterpriseForeignName", getEnterpriseForeignName());
		attributes.put("enterprisePerson", getEnterprisePerson());
		attributes.put("enterpriseHOAddress", getEnterpriseHOAddress());
		attributes.put("stateCode", getStateCode());
		attributes.put("cityCode", getCityCode());
		attributes.put("districtCode", getDistrictCode());
		attributes.put("wardCode", getWardCode());
		attributes.put("telephoneNo", getTelephoneNo());
		attributes.put("registrationCode", getRegistrationCode());
		attributes.put("registrationAddress", getRegistrationAddress());
		attributes.put("registrationDate", getRegistrationDate());
		attributes.put("isDelete", getIsDelete());
		attributes.put("markedAsDelete", getMarkedAsDelete());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("requestedDate", getRequestedDate());
		attributes.put("syncVersion", getSyncVersion());
		attributes.put("modifiedUser", getModifiedUser());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String enterpriseCode = (String)attributes.get("enterpriseCode");

		if (enterpriseCode != null) {
			setEnterpriseCode(enterpriseCode);
		}

		String enterpriseTaxCode = (String)attributes.get("enterpriseTaxCode");

		if (enterpriseTaxCode != null) {
			setEnterpriseTaxCode(enterpriseTaxCode);
		}

		String enterpriseName = (String)attributes.get("enterpriseName");

		if (enterpriseName != null) {
			setEnterpriseName(enterpriseName);
		}

		String enterpriseShortName = (String)attributes.get(
				"enterpriseShortName");

		if (enterpriseShortName != null) {
			setEnterpriseShortName(enterpriseShortName);
		}

		String enterpriseForeignName = (String)attributes.get(
				"enterpriseForeignName");

		if (enterpriseForeignName != null) {
			setEnterpriseForeignName(enterpriseForeignName);
		}

		String enterprisePerson = (String)attributes.get("enterprisePerson");

		if (enterprisePerson != null) {
			setEnterprisePerson(enterprisePerson);
		}

		String enterpriseHOAddress = (String)attributes.get(
				"enterpriseHOAddress");

		if (enterpriseHOAddress != null) {
			setEnterpriseHOAddress(enterpriseHOAddress);
		}

		String stateCode = (String)attributes.get("stateCode");

		if (stateCode != null) {
			setStateCode(stateCode);
		}

		String cityCode = (String)attributes.get("cityCode");

		if (cityCode != null) {
			setCityCode(cityCode);
		}

		String districtCode = (String)attributes.get("districtCode");

		if (districtCode != null) {
			setDistrictCode(districtCode);
		}

		String wardCode = (String)attributes.get("wardCode");

		if (wardCode != null) {
			setWardCode(wardCode);
		}

		String telephoneNo = (String)attributes.get("telephoneNo");

		if (telephoneNo != null) {
			setTelephoneNo(telephoneNo);
		}

		String registrationCode = (String)attributes.get("registrationCode");

		if (registrationCode != null) {
			setRegistrationCode(registrationCode);
		}

		String registrationAddress = (String)attributes.get(
				"registrationAddress");

		if (registrationAddress != null) {
			setRegistrationAddress(registrationAddress);
		}

		Date registrationDate = (Date)attributes.get("registrationDate");

		if (registrationDate != null) {
			setRegistrationDate(registrationDate);
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

		String modifiedUser = (String)attributes.get("modifiedUser");

		if (modifiedUser != null) {
			setModifiedUser(modifiedUser);
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
	public String getEnterpriseCode() {
		if (_enterpriseCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _enterpriseCode;
		}
	}

	@Override
	public void setEnterpriseCode(String enterpriseCode) {
		_columnBitmask |= ENTERPRISECODE_COLUMN_BITMASK;

		if (_originalEnterpriseCode == null) {
			_originalEnterpriseCode = _enterpriseCode;
		}

		_enterpriseCode = enterpriseCode;
	}

	public String getOriginalEnterpriseCode() {
		return GetterUtil.getString(_originalEnterpriseCode);
	}

	@Override
	public String getEnterpriseTaxCode() {
		if (_enterpriseTaxCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _enterpriseTaxCode;
		}
	}

	@Override
	public void setEnterpriseTaxCode(String enterpriseTaxCode) {
		_columnBitmask |= ENTERPRISETAXCODE_COLUMN_BITMASK;

		if (_originalEnterpriseTaxCode == null) {
			_originalEnterpriseTaxCode = _enterpriseTaxCode;
		}

		_enterpriseTaxCode = enterpriseTaxCode;
	}

	public String getOriginalEnterpriseTaxCode() {
		return GetterUtil.getString(_originalEnterpriseTaxCode);
	}

	@Override
	public String getEnterpriseName() {
		if (_enterpriseName == null) {
			return StringPool.BLANK;
		}
		else {
			return _enterpriseName;
		}
	}

	@Override
	public void setEnterpriseName(String enterpriseName) {
		_enterpriseName = enterpriseName;
	}

	@Override
	public String getEnterpriseShortName() {
		if (_enterpriseShortName == null) {
			return StringPool.BLANK;
		}
		else {
			return _enterpriseShortName;
		}
	}

	@Override
	public void setEnterpriseShortName(String enterpriseShortName) {
		_enterpriseShortName = enterpriseShortName;
	}

	@Override
	public String getEnterpriseForeignName() {
		if (_enterpriseForeignName == null) {
			return StringPool.BLANK;
		}
		else {
			return _enterpriseForeignName;
		}
	}

	@Override
	public void setEnterpriseForeignName(String enterpriseForeignName) {
		_enterpriseForeignName = enterpriseForeignName;
	}

	@Override
	public String getEnterprisePerson() {
		if (_enterprisePerson == null) {
			return StringPool.BLANK;
		}
		else {
			return _enterprisePerson;
		}
	}

	@Override
	public void setEnterprisePerson(String enterprisePerson) {
		_enterprisePerson = enterprisePerson;
	}

	@Override
	public String getEnterpriseHOAddress() {
		if (_enterpriseHOAddress == null) {
			return StringPool.BLANK;
		}
		else {
			return _enterpriseHOAddress;
		}
	}

	@Override
	public void setEnterpriseHOAddress(String enterpriseHOAddress) {
		_enterpriseHOAddress = enterpriseHOAddress;
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
	public String getCityCode() {
		if (_cityCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _cityCode;
		}
	}

	@Override
	public void setCityCode(String cityCode) {
		_cityCode = cityCode;
	}

	@Override
	public String getDistrictCode() {
		if (_districtCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _districtCode;
		}
	}

	@Override
	public void setDistrictCode(String districtCode) {
		_districtCode = districtCode;
	}

	@Override
	public String getWardCode() {
		if (_wardCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _wardCode;
		}
	}

	@Override
	public void setWardCode(String wardCode) {
		_wardCode = wardCode;
	}

	@Override
	public String getTelephoneNo() {
		if (_telephoneNo == null) {
			return StringPool.BLANK;
		}
		else {
			return _telephoneNo;
		}
	}

	@Override
	public void setTelephoneNo(String telephoneNo) {
		_telephoneNo = telephoneNo;
	}

	@Override
	public String getRegistrationCode() {
		if (_registrationCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _registrationCode;
		}
	}

	@Override
	public void setRegistrationCode(String registrationCode) {
		_registrationCode = registrationCode;
	}

	@Override
	public String getRegistrationAddress() {
		if (_registrationAddress == null) {
			return StringPool.BLANK;
		}
		else {
			return _registrationAddress;
		}
	}

	@Override
	public void setRegistrationAddress(String registrationAddress) {
		_registrationAddress = registrationAddress;
	}

	@Override
	public Date getRegistrationDate() {
		return _registrationDate;
	}

	@Override
	public void setRegistrationDate(Date registrationDate) {
		_registrationDate = registrationDate;
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

	@Override
	public String getModifiedUser() {
		if (_modifiedUser == null) {
			return StringPool.BLANK;
		}
		else {
			return _modifiedUser;
		}
	}

	@Override
	public void setModifiedUser(String modifiedUser) {
		_modifiedUser = modifiedUser;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public DmHistoryEnterrise toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DmHistoryEnterrise)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DmHistoryEnterriseImpl dmHistoryEnterriseImpl = new DmHistoryEnterriseImpl();

		dmHistoryEnterriseImpl.setId(getId());
		dmHistoryEnterriseImpl.setEnterpriseCode(getEnterpriseCode());
		dmHistoryEnterriseImpl.setEnterpriseTaxCode(getEnterpriseTaxCode());
		dmHistoryEnterriseImpl.setEnterpriseName(getEnterpriseName());
		dmHistoryEnterriseImpl.setEnterpriseShortName(getEnterpriseShortName());
		dmHistoryEnterriseImpl.setEnterpriseForeignName(getEnterpriseForeignName());
		dmHistoryEnterriseImpl.setEnterprisePerson(getEnterprisePerson());
		dmHistoryEnterriseImpl.setEnterpriseHOAddress(getEnterpriseHOAddress());
		dmHistoryEnterriseImpl.setStateCode(getStateCode());
		dmHistoryEnterriseImpl.setCityCode(getCityCode());
		dmHistoryEnterriseImpl.setDistrictCode(getDistrictCode());
		dmHistoryEnterriseImpl.setWardCode(getWardCode());
		dmHistoryEnterriseImpl.setTelephoneNo(getTelephoneNo());
		dmHistoryEnterriseImpl.setRegistrationCode(getRegistrationCode());
		dmHistoryEnterriseImpl.setRegistrationAddress(getRegistrationAddress());
		dmHistoryEnterriseImpl.setRegistrationDate(getRegistrationDate());
		dmHistoryEnterriseImpl.setIsDelete(getIsDelete());
		dmHistoryEnterriseImpl.setMarkedAsDelete(getMarkedAsDelete());
		dmHistoryEnterriseImpl.setModifiedDate(getModifiedDate());
		dmHistoryEnterriseImpl.setRequestedDate(getRequestedDate());
		dmHistoryEnterriseImpl.setSyncVersion(getSyncVersion());
		dmHistoryEnterriseImpl.setModifiedUser(getModifiedUser());

		dmHistoryEnterriseImpl.resetOriginalValues();

		return dmHistoryEnterriseImpl;
	}

	@Override
	public int compareTo(DmHistoryEnterrise dmHistoryEnterrise) {
		int value = 0;

		if (getId() < dmHistoryEnterrise.getId()) {
			value = -1;
		}
		else if (getId() > dmHistoryEnterrise.getId()) {
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

		if (!(obj instanceof DmHistoryEnterrise)) {
			return false;
		}

		DmHistoryEnterrise dmHistoryEnterrise = (DmHistoryEnterrise)obj;

		int primaryKey = dmHistoryEnterrise.getPrimaryKey();

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
		DmHistoryEnterriseModelImpl dmHistoryEnterriseModelImpl = this;

		dmHistoryEnterriseModelImpl._originalEnterpriseCode = dmHistoryEnterriseModelImpl._enterpriseCode;

		dmHistoryEnterriseModelImpl._originalEnterpriseTaxCode = dmHistoryEnterriseModelImpl._enterpriseTaxCode;

		dmHistoryEnterriseModelImpl._originalSyncVersion = dmHistoryEnterriseModelImpl._syncVersion;

		dmHistoryEnterriseModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DmHistoryEnterrise> toCacheModel() {
		DmHistoryEnterriseCacheModel dmHistoryEnterriseCacheModel = new DmHistoryEnterriseCacheModel();

		dmHistoryEnterriseCacheModel.id = getId();

		dmHistoryEnterriseCacheModel.enterpriseCode = getEnterpriseCode();

		String enterpriseCode = dmHistoryEnterriseCacheModel.enterpriseCode;

		if ((enterpriseCode != null) && (enterpriseCode.length() == 0)) {
			dmHistoryEnterriseCacheModel.enterpriseCode = null;
		}

		dmHistoryEnterriseCacheModel.enterpriseTaxCode = getEnterpriseTaxCode();

		String enterpriseTaxCode = dmHistoryEnterriseCacheModel.enterpriseTaxCode;

		if ((enterpriseTaxCode != null) && (enterpriseTaxCode.length() == 0)) {
			dmHistoryEnterriseCacheModel.enterpriseTaxCode = null;
		}

		dmHistoryEnterriseCacheModel.enterpriseName = getEnterpriseName();

		String enterpriseName = dmHistoryEnterriseCacheModel.enterpriseName;

		if ((enterpriseName != null) && (enterpriseName.length() == 0)) {
			dmHistoryEnterriseCacheModel.enterpriseName = null;
		}

		dmHistoryEnterriseCacheModel.enterpriseShortName = getEnterpriseShortName();

		String enterpriseShortName = dmHistoryEnterriseCacheModel.enterpriseShortName;

		if ((enterpriseShortName != null) &&
				(enterpriseShortName.length() == 0)) {
			dmHistoryEnterriseCacheModel.enterpriseShortName = null;
		}

		dmHistoryEnterriseCacheModel.enterpriseForeignName = getEnterpriseForeignName();

		String enterpriseForeignName = dmHistoryEnterriseCacheModel.enterpriseForeignName;

		if ((enterpriseForeignName != null) &&
				(enterpriseForeignName.length() == 0)) {
			dmHistoryEnterriseCacheModel.enterpriseForeignName = null;
		}

		dmHistoryEnterriseCacheModel.enterprisePerson = getEnterprisePerson();

		String enterprisePerson = dmHistoryEnterriseCacheModel.enterprisePerson;

		if ((enterprisePerson != null) && (enterprisePerson.length() == 0)) {
			dmHistoryEnterriseCacheModel.enterprisePerson = null;
		}

		dmHistoryEnterriseCacheModel.enterpriseHOAddress = getEnterpriseHOAddress();

		String enterpriseHOAddress = dmHistoryEnterriseCacheModel.enterpriseHOAddress;

		if ((enterpriseHOAddress != null) &&
				(enterpriseHOAddress.length() == 0)) {
			dmHistoryEnterriseCacheModel.enterpriseHOAddress = null;
		}

		dmHistoryEnterriseCacheModel.stateCode = getStateCode();

		String stateCode = dmHistoryEnterriseCacheModel.stateCode;

		if ((stateCode != null) && (stateCode.length() == 0)) {
			dmHistoryEnterriseCacheModel.stateCode = null;
		}

		dmHistoryEnterriseCacheModel.cityCode = getCityCode();

		String cityCode = dmHistoryEnterriseCacheModel.cityCode;

		if ((cityCode != null) && (cityCode.length() == 0)) {
			dmHistoryEnterriseCacheModel.cityCode = null;
		}

		dmHistoryEnterriseCacheModel.districtCode = getDistrictCode();

		String districtCode = dmHistoryEnterriseCacheModel.districtCode;

		if ((districtCode != null) && (districtCode.length() == 0)) {
			dmHistoryEnterriseCacheModel.districtCode = null;
		}

		dmHistoryEnterriseCacheModel.wardCode = getWardCode();

		String wardCode = dmHistoryEnterriseCacheModel.wardCode;

		if ((wardCode != null) && (wardCode.length() == 0)) {
			dmHistoryEnterriseCacheModel.wardCode = null;
		}

		dmHistoryEnterriseCacheModel.telephoneNo = getTelephoneNo();

		String telephoneNo = dmHistoryEnterriseCacheModel.telephoneNo;

		if ((telephoneNo != null) && (telephoneNo.length() == 0)) {
			dmHistoryEnterriseCacheModel.telephoneNo = null;
		}

		dmHistoryEnterriseCacheModel.registrationCode = getRegistrationCode();

		String registrationCode = dmHistoryEnterriseCacheModel.registrationCode;

		if ((registrationCode != null) && (registrationCode.length() == 0)) {
			dmHistoryEnterriseCacheModel.registrationCode = null;
		}

		dmHistoryEnterriseCacheModel.registrationAddress = getRegistrationAddress();

		String registrationAddress = dmHistoryEnterriseCacheModel.registrationAddress;

		if ((registrationAddress != null) &&
				(registrationAddress.length() == 0)) {
			dmHistoryEnterriseCacheModel.registrationAddress = null;
		}

		Date registrationDate = getRegistrationDate();

		if (registrationDate != null) {
			dmHistoryEnterriseCacheModel.registrationDate = registrationDate.getTime();
		}
		else {
			dmHistoryEnterriseCacheModel.registrationDate = Long.MIN_VALUE;
		}

		dmHistoryEnterriseCacheModel.isDelete = getIsDelete();

		dmHistoryEnterriseCacheModel.markedAsDelete = getMarkedAsDelete();

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			dmHistoryEnterriseCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			dmHistoryEnterriseCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		Date requestedDate = getRequestedDate();

		if (requestedDate != null) {
			dmHistoryEnterriseCacheModel.requestedDate = requestedDate.getTime();
		}
		else {
			dmHistoryEnterriseCacheModel.requestedDate = Long.MIN_VALUE;
		}

		dmHistoryEnterriseCacheModel.syncVersion = getSyncVersion();

		String syncVersion = dmHistoryEnterriseCacheModel.syncVersion;

		if ((syncVersion != null) && (syncVersion.length() == 0)) {
			dmHistoryEnterriseCacheModel.syncVersion = null;
		}

		dmHistoryEnterriseCacheModel.modifiedUser = getModifiedUser();

		String modifiedUser = dmHistoryEnterriseCacheModel.modifiedUser;

		if ((modifiedUser != null) && (modifiedUser.length() == 0)) {
			dmHistoryEnterriseCacheModel.modifiedUser = null;
		}

		return dmHistoryEnterriseCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(45);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", enterpriseCode=");
		sb.append(getEnterpriseCode());
		sb.append(", enterpriseTaxCode=");
		sb.append(getEnterpriseTaxCode());
		sb.append(", enterpriseName=");
		sb.append(getEnterpriseName());
		sb.append(", enterpriseShortName=");
		sb.append(getEnterpriseShortName());
		sb.append(", enterpriseForeignName=");
		sb.append(getEnterpriseForeignName());
		sb.append(", enterprisePerson=");
		sb.append(getEnterprisePerson());
		sb.append(", enterpriseHOAddress=");
		sb.append(getEnterpriseHOAddress());
		sb.append(", stateCode=");
		sb.append(getStateCode());
		sb.append(", cityCode=");
		sb.append(getCityCode());
		sb.append(", districtCode=");
		sb.append(getDistrictCode());
		sb.append(", wardCode=");
		sb.append(getWardCode());
		sb.append(", telephoneNo=");
		sb.append(getTelephoneNo());
		sb.append(", registrationCode=");
		sb.append(getRegistrationCode());
		sb.append(", registrationAddress=");
		sb.append(getRegistrationAddress());
		sb.append(", registrationDate=");
		sb.append(getRegistrationDate());
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
		sb.append(", modifiedUser=");
		sb.append(getModifiedUser());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(70);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>enterpriseCode</column-name><column-value><![CDATA[");
		sb.append(getEnterpriseCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>enterpriseTaxCode</column-name><column-value><![CDATA[");
		sb.append(getEnterpriseTaxCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>enterpriseName</column-name><column-value><![CDATA[");
		sb.append(getEnterpriseName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>enterpriseShortName</column-name><column-value><![CDATA[");
		sb.append(getEnterpriseShortName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>enterpriseForeignName</column-name><column-value><![CDATA[");
		sb.append(getEnterpriseForeignName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>enterprisePerson</column-name><column-value><![CDATA[");
		sb.append(getEnterprisePerson());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>enterpriseHOAddress</column-name><column-value><![CDATA[");
		sb.append(getEnterpriseHOAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stateCode</column-name><column-value><![CDATA[");
		sb.append(getStateCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cityCode</column-name><column-value><![CDATA[");
		sb.append(getCityCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>districtCode</column-name><column-value><![CDATA[");
		sb.append(getDistrictCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wardCode</column-name><column-value><![CDATA[");
		sb.append(getWardCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>telephoneNo</column-name><column-value><![CDATA[");
		sb.append(getTelephoneNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registrationCode</column-name><column-value><![CDATA[");
		sb.append(getRegistrationCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registrationAddress</column-name><column-value><![CDATA[");
		sb.append(getRegistrationAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registrationDate</column-name><column-value><![CDATA[");
		sb.append(getRegistrationDate());
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
		sb.append(
			"<column><column-name>modifiedUser</column-name><column-value><![CDATA[");
		sb.append(getModifiedUser());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = DmHistoryEnterrise.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DmHistoryEnterrise.class
		};
	private int _id;
	private String _enterpriseCode;
	private String _originalEnterpriseCode;
	private String _enterpriseTaxCode;
	private String _originalEnterpriseTaxCode;
	private String _enterpriseName;
	private String _enterpriseShortName;
	private String _enterpriseForeignName;
	private String _enterprisePerson;
	private String _enterpriseHOAddress;
	private String _stateCode;
	private String _cityCode;
	private String _districtCode;
	private String _wardCode;
	private String _telephoneNo;
	private String _registrationCode;
	private String _registrationAddress;
	private Date _registrationDate;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private String _originalSyncVersion;
	private String _modifiedUser;
	private long _columnBitmask;
	private DmHistoryEnterrise _escapedModel;
}