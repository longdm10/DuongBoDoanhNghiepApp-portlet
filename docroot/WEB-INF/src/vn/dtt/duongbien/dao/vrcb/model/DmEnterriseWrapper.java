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

package vn.dtt.duongbien.dao.vrcb.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DmEnterrise}.
 * </p>
 *
 * @author longdm
 * @see DmEnterrise
 * @generated
 */
public class DmEnterriseWrapper implements DmEnterrise,
	ModelWrapper<DmEnterrise> {
	public DmEnterriseWrapper(DmEnterrise dmEnterrise) {
		_dmEnterrise = dmEnterrise;
	}

	@Override
	public Class<?> getModelClass() {
		return DmEnterrise.class;
	}

	@Override
	public String getModelClassName() {
		return DmEnterrise.class.getName();
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

	/**
	* Returns the primary key of this dm enterrise.
	*
	* @return the primary key of this dm enterrise
	*/
	@Override
	public int getPrimaryKey() {
		return _dmEnterrise.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm enterrise.
	*
	* @param primaryKey the primary key of this dm enterrise
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_dmEnterrise.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm enterrise.
	*
	* @return the ID of this dm enterrise
	*/
	@Override
	public int getId() {
		return _dmEnterrise.getId();
	}

	/**
	* Sets the ID of this dm enterrise.
	*
	* @param id the ID of this dm enterrise
	*/
	@Override
	public void setId(int id) {
		_dmEnterrise.setId(id);
	}

	/**
	* Returns the enterprise code of this dm enterrise.
	*
	* @return the enterprise code of this dm enterrise
	*/
	@Override
	public java.lang.String getEnterpriseCode() {
		return _dmEnterrise.getEnterpriseCode();
	}

	/**
	* Sets the enterprise code of this dm enterrise.
	*
	* @param enterpriseCode the enterprise code of this dm enterrise
	*/
	@Override
	public void setEnterpriseCode(java.lang.String enterpriseCode) {
		_dmEnterrise.setEnterpriseCode(enterpriseCode);
	}

	/**
	* Returns the enterprise tax code of this dm enterrise.
	*
	* @return the enterprise tax code of this dm enterrise
	*/
	@Override
	public java.lang.String getEnterpriseTaxCode() {
		return _dmEnterrise.getEnterpriseTaxCode();
	}

	/**
	* Sets the enterprise tax code of this dm enterrise.
	*
	* @param enterpriseTaxCode the enterprise tax code of this dm enterrise
	*/
	@Override
	public void setEnterpriseTaxCode(java.lang.String enterpriseTaxCode) {
		_dmEnterrise.setEnterpriseTaxCode(enterpriseTaxCode);
	}

	/**
	* Returns the enterprise name of this dm enterrise.
	*
	* @return the enterprise name of this dm enterrise
	*/
	@Override
	public java.lang.String getEnterpriseName() {
		return _dmEnterrise.getEnterpriseName();
	}

	/**
	* Sets the enterprise name of this dm enterrise.
	*
	* @param enterpriseName the enterprise name of this dm enterrise
	*/
	@Override
	public void setEnterpriseName(java.lang.String enterpriseName) {
		_dmEnterrise.setEnterpriseName(enterpriseName);
	}

	/**
	* Returns the enterprise short name of this dm enterrise.
	*
	* @return the enterprise short name of this dm enterrise
	*/
	@Override
	public java.lang.String getEnterpriseShortName() {
		return _dmEnterrise.getEnterpriseShortName();
	}

	/**
	* Sets the enterprise short name of this dm enterrise.
	*
	* @param enterpriseShortName the enterprise short name of this dm enterrise
	*/
	@Override
	public void setEnterpriseShortName(java.lang.String enterpriseShortName) {
		_dmEnterrise.setEnterpriseShortName(enterpriseShortName);
	}

	/**
	* Returns the enterprise foreign name of this dm enterrise.
	*
	* @return the enterprise foreign name of this dm enterrise
	*/
	@Override
	public java.lang.String getEnterpriseForeignName() {
		return _dmEnterrise.getEnterpriseForeignName();
	}

	/**
	* Sets the enterprise foreign name of this dm enterrise.
	*
	* @param enterpriseForeignName the enterprise foreign name of this dm enterrise
	*/
	@Override
	public void setEnterpriseForeignName(java.lang.String enterpriseForeignName) {
		_dmEnterrise.setEnterpriseForeignName(enterpriseForeignName);
	}

	/**
	* Returns the enterprise person of this dm enterrise.
	*
	* @return the enterprise person of this dm enterrise
	*/
	@Override
	public java.lang.String getEnterprisePerson() {
		return _dmEnterrise.getEnterprisePerson();
	}

	/**
	* Sets the enterprise person of this dm enterrise.
	*
	* @param enterprisePerson the enterprise person of this dm enterrise
	*/
	@Override
	public void setEnterprisePerson(java.lang.String enterprisePerson) {
		_dmEnterrise.setEnterprisePerson(enterprisePerson);
	}

	/**
	* Returns the enterprise h o address of this dm enterrise.
	*
	* @return the enterprise h o address of this dm enterrise
	*/
	@Override
	public java.lang.String getEnterpriseHOAddress() {
		return _dmEnterrise.getEnterpriseHOAddress();
	}

	/**
	* Sets the enterprise h o address of this dm enterrise.
	*
	* @param enterpriseHOAddress the enterprise h o address of this dm enterrise
	*/
	@Override
	public void setEnterpriseHOAddress(java.lang.String enterpriseHOAddress) {
		_dmEnterrise.setEnterpriseHOAddress(enterpriseHOAddress);
	}

	/**
	* Returns the state code of this dm enterrise.
	*
	* @return the state code of this dm enterrise
	*/
	@Override
	public java.lang.String getStateCode() {
		return _dmEnterrise.getStateCode();
	}

	/**
	* Sets the state code of this dm enterrise.
	*
	* @param stateCode the state code of this dm enterrise
	*/
	@Override
	public void setStateCode(java.lang.String stateCode) {
		_dmEnterrise.setStateCode(stateCode);
	}

	/**
	* Returns the city code of this dm enterrise.
	*
	* @return the city code of this dm enterrise
	*/
	@Override
	public java.lang.String getCityCode() {
		return _dmEnterrise.getCityCode();
	}

	/**
	* Sets the city code of this dm enterrise.
	*
	* @param cityCode the city code of this dm enterrise
	*/
	@Override
	public void setCityCode(java.lang.String cityCode) {
		_dmEnterrise.setCityCode(cityCode);
	}

	/**
	* Returns the district code of this dm enterrise.
	*
	* @return the district code of this dm enterrise
	*/
	@Override
	public java.lang.String getDistrictCode() {
		return _dmEnterrise.getDistrictCode();
	}

	/**
	* Sets the district code of this dm enterrise.
	*
	* @param districtCode the district code of this dm enterrise
	*/
	@Override
	public void setDistrictCode(java.lang.String districtCode) {
		_dmEnterrise.setDistrictCode(districtCode);
	}

	/**
	* Returns the ward code of this dm enterrise.
	*
	* @return the ward code of this dm enterrise
	*/
	@Override
	public java.lang.String getWardCode() {
		return _dmEnterrise.getWardCode();
	}

	/**
	* Sets the ward code of this dm enterrise.
	*
	* @param wardCode the ward code of this dm enterrise
	*/
	@Override
	public void setWardCode(java.lang.String wardCode) {
		_dmEnterrise.setWardCode(wardCode);
	}

	/**
	* Returns the telephone no of this dm enterrise.
	*
	* @return the telephone no of this dm enterrise
	*/
	@Override
	public java.lang.String getTelephoneNo() {
		return _dmEnterrise.getTelephoneNo();
	}

	/**
	* Sets the telephone no of this dm enterrise.
	*
	* @param telephoneNo the telephone no of this dm enterrise
	*/
	@Override
	public void setTelephoneNo(java.lang.String telephoneNo) {
		_dmEnterrise.setTelephoneNo(telephoneNo);
	}

	/**
	* Returns the registration code of this dm enterrise.
	*
	* @return the registration code of this dm enterrise
	*/
	@Override
	public java.lang.String getRegistrationCode() {
		return _dmEnterrise.getRegistrationCode();
	}

	/**
	* Sets the registration code of this dm enterrise.
	*
	* @param registrationCode the registration code of this dm enterrise
	*/
	@Override
	public void setRegistrationCode(java.lang.String registrationCode) {
		_dmEnterrise.setRegistrationCode(registrationCode);
	}

	/**
	* Returns the registration address of this dm enterrise.
	*
	* @return the registration address of this dm enterrise
	*/
	@Override
	public java.lang.String getRegistrationAddress() {
		return _dmEnterrise.getRegistrationAddress();
	}

	/**
	* Sets the registration address of this dm enterrise.
	*
	* @param registrationAddress the registration address of this dm enterrise
	*/
	@Override
	public void setRegistrationAddress(java.lang.String registrationAddress) {
		_dmEnterrise.setRegistrationAddress(registrationAddress);
	}

	/**
	* Returns the registration date of this dm enterrise.
	*
	* @return the registration date of this dm enterrise
	*/
	@Override
	public java.util.Date getRegistrationDate() {
		return _dmEnterrise.getRegistrationDate();
	}

	/**
	* Sets the registration date of this dm enterrise.
	*
	* @param registrationDate the registration date of this dm enterrise
	*/
	@Override
	public void setRegistrationDate(java.util.Date registrationDate) {
		_dmEnterrise.setRegistrationDate(registrationDate);
	}

	/**
	* Returns the is delete of this dm enterrise.
	*
	* @return the is delete of this dm enterrise
	*/
	@Override
	public int getIsDelete() {
		return _dmEnterrise.getIsDelete();
	}

	/**
	* Sets the is delete of this dm enterrise.
	*
	* @param isDelete the is delete of this dm enterrise
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmEnterrise.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm enterrise.
	*
	* @return the marked as delete of this dm enterrise
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmEnterrise.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm enterrise.
	*
	* @param markedAsDelete the marked as delete of this dm enterrise
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmEnterrise.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm enterrise.
	*
	* @return the modified date of this dm enterrise
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmEnterrise.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm enterrise.
	*
	* @param modifiedDate the modified date of this dm enterrise
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmEnterrise.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm enterrise.
	*
	* @return the requested date of this dm enterrise
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmEnterrise.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm enterrise.
	*
	* @param requestedDate the requested date of this dm enterrise
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmEnterrise.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm enterrise.
	*
	* @return the sync version of this dm enterrise
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmEnterrise.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm enterrise.
	*
	* @param syncVersion the sync version of this dm enterrise
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmEnterrise.setSyncVersion(syncVersion);
	}

	/**
	* Returns the modified user of this dm enterrise.
	*
	* @return the modified user of this dm enterrise
	*/
	@Override
	public java.lang.String getModifiedUser() {
		return _dmEnterrise.getModifiedUser();
	}

	/**
	* Sets the modified user of this dm enterrise.
	*
	* @param modifiedUser the modified user of this dm enterrise
	*/
	@Override
	public void setModifiedUser(java.lang.String modifiedUser) {
		_dmEnterrise.setModifiedUser(modifiedUser);
	}

	@Override
	public boolean isNew() {
		return _dmEnterrise.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmEnterrise.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmEnterrise.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmEnterrise.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmEnterrise.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmEnterrise.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmEnterrise.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmEnterrise.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmEnterrise.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmEnterrise.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmEnterrise.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmEnterriseWrapper((DmEnterrise)_dmEnterrise.clone());
	}

	@Override
	public int compareTo(DmEnterrise dmEnterrise) {
		return _dmEnterrise.compareTo(dmEnterrise);
	}

	@Override
	public int hashCode() {
		return _dmEnterrise.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<DmEnterrise> toCacheModel() {
		return _dmEnterrise.toCacheModel();
	}

	@Override
	public DmEnterrise toEscapedModel() {
		return new DmEnterriseWrapper(_dmEnterrise.toEscapedModel());
	}

	@Override
	public DmEnterrise toUnescapedModel() {
		return new DmEnterriseWrapper(_dmEnterrise.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmEnterrise.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmEnterrise.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmEnterrise.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmEnterriseWrapper)) {
			return false;
		}

		DmEnterriseWrapper dmEnterriseWrapper = (DmEnterriseWrapper)obj;

		if (Validator.equals(_dmEnterrise, dmEnterriseWrapper._dmEnterrise)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmEnterrise getWrappedDmEnterrise() {
		return _dmEnterrise;
	}

	@Override
	public DmEnterrise getWrappedModel() {
		return _dmEnterrise;
	}

	@Override
	public void resetOriginalValues() {
		_dmEnterrise.resetOriginalValues();
	}

	private DmEnterrise _dmEnterrise;
}