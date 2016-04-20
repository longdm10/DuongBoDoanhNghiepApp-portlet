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

package vn.dtt.duongbo.dao.motcua.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link OEPUserMgtWorkingUnit}.
 * </p>
 *
 * @author win_64
 * @see OEPUserMgtWorkingUnit
 * @generated
 */
public class OEPUserMgtWorkingUnitWrapper implements OEPUserMgtWorkingUnit,
	ModelWrapper<OEPUserMgtWorkingUnit> {
	public OEPUserMgtWorkingUnitWrapper(
		OEPUserMgtWorkingUnit oepUserMgtWorkingUnit) {
		_oepUserMgtWorkingUnit = oepUserMgtWorkingUnit;
	}

	@Override
	public Class<?> getModelClass() {
		return OEPUserMgtWorkingUnit.class;
	}

	@Override
	public String getModelClassName() {
		return OEPUserMgtWorkingUnit.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("workingUnitId", getWorkingUnitId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("organizationId", getOrganizationId());
		attributes.put("govAgentId", getGovAgentId());
		attributes.put("name", getName());
		attributes.put("enname", getEnname());
		attributes.put("isRoot", getIsRoot());
		attributes.put("parentWorkingUnitId", getParentWorkingUnitId());
		attributes.put("address", getAddress());
		attributes.put("cityNo", getCityNo());
		attributes.put("cityName", getCityName());
		attributes.put("districtNo", getDistrictNo());
		attributes.put("districtName", getDistrictName());
		attributes.put("wardNo", getWardNo());
		attributes.put("wardName", getWardName());
		attributes.put("gpsPosition", getGpsPosition());
		attributes.put("telNo", getTelNo());
		attributes.put("fax", getFax());
		attributes.put("email", getEmail());
		attributes.put("website", getWebsite());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long workingUnitId = (Long)attributes.get("workingUnitId");

		if (workingUnitId != null) {
			setWorkingUnitId(workingUnitId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String organizationId = (String)attributes.get("organizationId");

		if (organizationId != null) {
			setOrganizationId(organizationId);
		}

		String govAgentId = (String)attributes.get("govAgentId");

		if (govAgentId != null) {
			setGovAgentId(govAgentId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String enname = (String)attributes.get("enname");

		if (enname != null) {
			setEnname(enname);
		}

		Integer isRoot = (Integer)attributes.get("isRoot");

		if (isRoot != null) {
			setIsRoot(isRoot);
		}

		Long parentWorkingUnitId = (Long)attributes.get("parentWorkingUnitId");

		if (parentWorkingUnitId != null) {
			setParentWorkingUnitId(parentWorkingUnitId);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String cityNo = (String)attributes.get("cityNo");

		if (cityNo != null) {
			setCityNo(cityNo);
		}

		String cityName = (String)attributes.get("cityName");

		if (cityName != null) {
			setCityName(cityName);
		}

		String districtNo = (String)attributes.get("districtNo");

		if (districtNo != null) {
			setDistrictNo(districtNo);
		}

		String districtName = (String)attributes.get("districtName");

		if (districtName != null) {
			setDistrictName(districtName);
		}

		String wardNo = (String)attributes.get("wardNo");

		if (wardNo != null) {
			setWardNo(wardNo);
		}

		String wardName = (String)attributes.get("wardName");

		if (wardName != null) {
			setWardName(wardName);
		}

		String gpsPosition = (String)attributes.get("gpsPosition");

		if (gpsPosition != null) {
			setGpsPosition(gpsPosition);
		}

		String telNo = (String)attributes.get("telNo");

		if (telNo != null) {
			setTelNo(telNo);
		}

		String fax = (String)attributes.get("fax");

		if (fax != null) {
			setFax(fax);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String website = (String)attributes.get("website");

		if (website != null) {
			setWebsite(website);
		}
	}

	/**
	* Returns the primary key of this o e p user mgt working unit.
	*
	* @return the primary key of this o e p user mgt working unit
	*/
	@Override
	public long getPrimaryKey() {
		return _oepUserMgtWorkingUnit.getPrimaryKey();
	}

	/**
	* Sets the primary key of this o e p user mgt working unit.
	*
	* @param primaryKey the primary key of this o e p user mgt working unit
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_oepUserMgtWorkingUnit.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the working unit ID of this o e p user mgt working unit.
	*
	* @return the working unit ID of this o e p user mgt working unit
	*/
	@Override
	public long getWorkingUnitId() {
		return _oepUserMgtWorkingUnit.getWorkingUnitId();
	}

	/**
	* Sets the working unit ID of this o e p user mgt working unit.
	*
	* @param workingUnitId the working unit ID of this o e p user mgt working unit
	*/
	@Override
	public void setWorkingUnitId(long workingUnitId) {
		_oepUserMgtWorkingUnit.setWorkingUnitId(workingUnitId);
	}

	/**
	* Returns the user ID of this o e p user mgt working unit.
	*
	* @return the user ID of this o e p user mgt working unit
	*/
	@Override
	public long getUserId() {
		return _oepUserMgtWorkingUnit.getUserId();
	}

	/**
	* Sets the user ID of this o e p user mgt working unit.
	*
	* @param userId the user ID of this o e p user mgt working unit
	*/
	@Override
	public void setUserId(long userId) {
		_oepUserMgtWorkingUnit.setUserId(userId);
	}

	/**
	* Returns the user uuid of this o e p user mgt working unit.
	*
	* @return the user uuid of this o e p user mgt working unit
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtWorkingUnit.getUserUuid();
	}

	/**
	* Sets the user uuid of this o e p user mgt working unit.
	*
	* @param userUuid the user uuid of this o e p user mgt working unit
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_oepUserMgtWorkingUnit.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this o e p user mgt working unit.
	*
	* @return the group ID of this o e p user mgt working unit
	*/
	@Override
	public long getGroupId() {
		return _oepUserMgtWorkingUnit.getGroupId();
	}

	/**
	* Sets the group ID of this o e p user mgt working unit.
	*
	* @param groupId the group ID of this o e p user mgt working unit
	*/
	@Override
	public void setGroupId(long groupId) {
		_oepUserMgtWorkingUnit.setGroupId(groupId);
	}

	/**
	* Returns the create date of this o e p user mgt working unit.
	*
	* @return the create date of this o e p user mgt working unit
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _oepUserMgtWorkingUnit.getCreateDate();
	}

	/**
	* Sets the create date of this o e p user mgt working unit.
	*
	* @param createDate the create date of this o e p user mgt working unit
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_oepUserMgtWorkingUnit.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this o e p user mgt working unit.
	*
	* @return the modified date of this o e p user mgt working unit
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _oepUserMgtWorkingUnit.getModifiedDate();
	}

	/**
	* Sets the modified date of this o e p user mgt working unit.
	*
	* @param modifiedDate the modified date of this o e p user mgt working unit
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_oepUserMgtWorkingUnit.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the organization ID of this o e p user mgt working unit.
	*
	* @return the organization ID of this o e p user mgt working unit
	*/
	@Override
	public java.lang.String getOrganizationId() {
		return _oepUserMgtWorkingUnit.getOrganizationId();
	}

	/**
	* Sets the organization ID of this o e p user mgt working unit.
	*
	* @param organizationId the organization ID of this o e p user mgt working unit
	*/
	@Override
	public void setOrganizationId(java.lang.String organizationId) {
		_oepUserMgtWorkingUnit.setOrganizationId(organizationId);
	}

	/**
	* Returns the gov agent ID of this o e p user mgt working unit.
	*
	* @return the gov agent ID of this o e p user mgt working unit
	*/
	@Override
	public java.lang.String getGovAgentId() {
		return _oepUserMgtWorkingUnit.getGovAgentId();
	}

	/**
	* Sets the gov agent ID of this o e p user mgt working unit.
	*
	* @param govAgentId the gov agent ID of this o e p user mgt working unit
	*/
	@Override
	public void setGovAgentId(java.lang.String govAgentId) {
		_oepUserMgtWorkingUnit.setGovAgentId(govAgentId);
	}

	/**
	* Returns the name of this o e p user mgt working unit.
	*
	* @return the name of this o e p user mgt working unit
	*/
	@Override
	public java.lang.String getName() {
		return _oepUserMgtWorkingUnit.getName();
	}

	/**
	* Sets the name of this o e p user mgt working unit.
	*
	* @param name the name of this o e p user mgt working unit
	*/
	@Override
	public void setName(java.lang.String name) {
		_oepUserMgtWorkingUnit.setName(name);
	}

	/**
	* Returns the enname of this o e p user mgt working unit.
	*
	* @return the enname of this o e p user mgt working unit
	*/
	@Override
	public java.lang.String getEnname() {
		return _oepUserMgtWorkingUnit.getEnname();
	}

	/**
	* Sets the enname of this o e p user mgt working unit.
	*
	* @param enname the enname of this o e p user mgt working unit
	*/
	@Override
	public void setEnname(java.lang.String enname) {
		_oepUserMgtWorkingUnit.setEnname(enname);
	}

	/**
	* Returns the is root of this o e p user mgt working unit.
	*
	* @return the is root of this o e p user mgt working unit
	*/
	@Override
	public int getIsRoot() {
		return _oepUserMgtWorkingUnit.getIsRoot();
	}

	/**
	* Sets the is root of this o e p user mgt working unit.
	*
	* @param isRoot the is root of this o e p user mgt working unit
	*/
	@Override
	public void setIsRoot(int isRoot) {
		_oepUserMgtWorkingUnit.setIsRoot(isRoot);
	}

	/**
	* Returns the parent working unit ID of this o e p user mgt working unit.
	*
	* @return the parent working unit ID of this o e p user mgt working unit
	*/
	@Override
	public long getParentWorkingUnitId() {
		return _oepUserMgtWorkingUnit.getParentWorkingUnitId();
	}

	/**
	* Sets the parent working unit ID of this o e p user mgt working unit.
	*
	* @param parentWorkingUnitId the parent working unit ID of this o e p user mgt working unit
	*/
	@Override
	public void setParentWorkingUnitId(long parentWorkingUnitId) {
		_oepUserMgtWorkingUnit.setParentWorkingUnitId(parentWorkingUnitId);
	}

	/**
	* Returns the address of this o e p user mgt working unit.
	*
	* @return the address of this o e p user mgt working unit
	*/
	@Override
	public java.lang.String getAddress() {
		return _oepUserMgtWorkingUnit.getAddress();
	}

	/**
	* Sets the address of this o e p user mgt working unit.
	*
	* @param address the address of this o e p user mgt working unit
	*/
	@Override
	public void setAddress(java.lang.String address) {
		_oepUserMgtWorkingUnit.setAddress(address);
	}

	/**
	* Returns the city no of this o e p user mgt working unit.
	*
	* @return the city no of this o e p user mgt working unit
	*/
	@Override
	public java.lang.String getCityNo() {
		return _oepUserMgtWorkingUnit.getCityNo();
	}

	/**
	* Sets the city no of this o e p user mgt working unit.
	*
	* @param cityNo the city no of this o e p user mgt working unit
	*/
	@Override
	public void setCityNo(java.lang.String cityNo) {
		_oepUserMgtWorkingUnit.setCityNo(cityNo);
	}

	/**
	* Returns the city name of this o e p user mgt working unit.
	*
	* @return the city name of this o e p user mgt working unit
	*/
	@Override
	public java.lang.String getCityName() {
		return _oepUserMgtWorkingUnit.getCityName();
	}

	/**
	* Sets the city name of this o e p user mgt working unit.
	*
	* @param cityName the city name of this o e p user mgt working unit
	*/
	@Override
	public void setCityName(java.lang.String cityName) {
		_oepUserMgtWorkingUnit.setCityName(cityName);
	}

	/**
	* Returns the district no of this o e p user mgt working unit.
	*
	* @return the district no of this o e p user mgt working unit
	*/
	@Override
	public java.lang.String getDistrictNo() {
		return _oepUserMgtWorkingUnit.getDistrictNo();
	}

	/**
	* Sets the district no of this o e p user mgt working unit.
	*
	* @param districtNo the district no of this o e p user mgt working unit
	*/
	@Override
	public void setDistrictNo(java.lang.String districtNo) {
		_oepUserMgtWorkingUnit.setDistrictNo(districtNo);
	}

	/**
	* Returns the district name of this o e p user mgt working unit.
	*
	* @return the district name of this o e p user mgt working unit
	*/
	@Override
	public java.lang.String getDistrictName() {
		return _oepUserMgtWorkingUnit.getDistrictName();
	}

	/**
	* Sets the district name of this o e p user mgt working unit.
	*
	* @param districtName the district name of this o e p user mgt working unit
	*/
	@Override
	public void setDistrictName(java.lang.String districtName) {
		_oepUserMgtWorkingUnit.setDistrictName(districtName);
	}

	/**
	* Returns the ward no of this o e p user mgt working unit.
	*
	* @return the ward no of this o e p user mgt working unit
	*/
	@Override
	public java.lang.String getWardNo() {
		return _oepUserMgtWorkingUnit.getWardNo();
	}

	/**
	* Sets the ward no of this o e p user mgt working unit.
	*
	* @param wardNo the ward no of this o e p user mgt working unit
	*/
	@Override
	public void setWardNo(java.lang.String wardNo) {
		_oepUserMgtWorkingUnit.setWardNo(wardNo);
	}

	/**
	* Returns the ward name of this o e p user mgt working unit.
	*
	* @return the ward name of this o e p user mgt working unit
	*/
	@Override
	public java.lang.String getWardName() {
		return _oepUserMgtWorkingUnit.getWardName();
	}

	/**
	* Sets the ward name of this o e p user mgt working unit.
	*
	* @param wardName the ward name of this o e p user mgt working unit
	*/
	@Override
	public void setWardName(java.lang.String wardName) {
		_oepUserMgtWorkingUnit.setWardName(wardName);
	}

	/**
	* Returns the gps position of this o e p user mgt working unit.
	*
	* @return the gps position of this o e p user mgt working unit
	*/
	@Override
	public java.lang.String getGpsPosition() {
		return _oepUserMgtWorkingUnit.getGpsPosition();
	}

	/**
	* Sets the gps position of this o e p user mgt working unit.
	*
	* @param gpsPosition the gps position of this o e p user mgt working unit
	*/
	@Override
	public void setGpsPosition(java.lang.String gpsPosition) {
		_oepUserMgtWorkingUnit.setGpsPosition(gpsPosition);
	}

	/**
	* Returns the tel no of this o e p user mgt working unit.
	*
	* @return the tel no of this o e p user mgt working unit
	*/
	@Override
	public java.lang.String getTelNo() {
		return _oepUserMgtWorkingUnit.getTelNo();
	}

	/**
	* Sets the tel no of this o e p user mgt working unit.
	*
	* @param telNo the tel no of this o e p user mgt working unit
	*/
	@Override
	public void setTelNo(java.lang.String telNo) {
		_oepUserMgtWorkingUnit.setTelNo(telNo);
	}

	/**
	* Returns the fax of this o e p user mgt working unit.
	*
	* @return the fax of this o e p user mgt working unit
	*/
	@Override
	public java.lang.String getFax() {
		return _oepUserMgtWorkingUnit.getFax();
	}

	/**
	* Sets the fax of this o e p user mgt working unit.
	*
	* @param fax the fax of this o e p user mgt working unit
	*/
	@Override
	public void setFax(java.lang.String fax) {
		_oepUserMgtWorkingUnit.setFax(fax);
	}

	/**
	* Returns the email of this o e p user mgt working unit.
	*
	* @return the email of this o e p user mgt working unit
	*/
	@Override
	public java.lang.String getEmail() {
		return _oepUserMgtWorkingUnit.getEmail();
	}

	/**
	* Sets the email of this o e p user mgt working unit.
	*
	* @param email the email of this o e p user mgt working unit
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_oepUserMgtWorkingUnit.setEmail(email);
	}

	/**
	* Returns the website of this o e p user mgt working unit.
	*
	* @return the website of this o e p user mgt working unit
	*/
	@Override
	public java.lang.String getWebsite() {
		return _oepUserMgtWorkingUnit.getWebsite();
	}

	/**
	* Sets the website of this o e p user mgt working unit.
	*
	* @param website the website of this o e p user mgt working unit
	*/
	@Override
	public void setWebsite(java.lang.String website) {
		_oepUserMgtWorkingUnit.setWebsite(website);
	}

	@Override
	public boolean isNew() {
		return _oepUserMgtWorkingUnit.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_oepUserMgtWorkingUnit.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _oepUserMgtWorkingUnit.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_oepUserMgtWorkingUnit.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _oepUserMgtWorkingUnit.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _oepUserMgtWorkingUnit.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_oepUserMgtWorkingUnit.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _oepUserMgtWorkingUnit.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_oepUserMgtWorkingUnit.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_oepUserMgtWorkingUnit.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_oepUserMgtWorkingUnit.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new OEPUserMgtWorkingUnitWrapper((OEPUserMgtWorkingUnit)_oepUserMgtWorkingUnit.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit oepUserMgtWorkingUnit) {
		return _oepUserMgtWorkingUnit.compareTo(oepUserMgtWorkingUnit);
	}

	@Override
	public int hashCode() {
		return _oepUserMgtWorkingUnit.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit> toCacheModel() {
		return _oepUserMgtWorkingUnit.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit toEscapedModel() {
		return new OEPUserMgtWorkingUnitWrapper(_oepUserMgtWorkingUnit.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit toUnescapedModel() {
		return new OEPUserMgtWorkingUnitWrapper(_oepUserMgtWorkingUnit.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _oepUserMgtWorkingUnit.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _oepUserMgtWorkingUnit.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_oepUserMgtWorkingUnit.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OEPUserMgtWorkingUnitWrapper)) {
			return false;
		}

		OEPUserMgtWorkingUnitWrapper oepUserMgtWorkingUnitWrapper = (OEPUserMgtWorkingUnitWrapper)obj;

		if (Validator.equals(_oepUserMgtWorkingUnit,
					oepUserMgtWorkingUnitWrapper._oepUserMgtWorkingUnit)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public OEPUserMgtWorkingUnit getWrappedOEPUserMgtWorkingUnit() {
		return _oepUserMgtWorkingUnit;
	}

	@Override
	public OEPUserMgtWorkingUnit getWrappedModel() {
		return _oepUserMgtWorkingUnit;
	}

	@Override
	public void resetOriginalValues() {
		_oepUserMgtWorkingUnit.resetOriginalValues();
	}

	private OEPUserMgtWorkingUnit _oepUserMgtWorkingUnit;
}