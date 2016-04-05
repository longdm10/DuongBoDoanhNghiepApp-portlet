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
 * This class is a wrapper for {@link DmHistoryEnterrise}.
 * </p>
 *
 * @author longdm
 * @see DmHistoryEnterrise
 * @generated
 */
public class DmHistoryEnterriseWrapper implements DmHistoryEnterrise,
	ModelWrapper<DmHistoryEnterrise> {
	public DmHistoryEnterriseWrapper(DmHistoryEnterrise dmHistoryEnterrise) {
		_dmHistoryEnterrise = dmHistoryEnterrise;
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

	/**
	* Returns the primary key of this dm history enterrise.
	*
	* @return the primary key of this dm history enterrise
	*/
	@Override
	public int getPrimaryKey() {
		return _dmHistoryEnterrise.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm history enterrise.
	*
	* @param primaryKey the primary key of this dm history enterrise
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_dmHistoryEnterrise.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm history enterrise.
	*
	* @return the ID of this dm history enterrise
	*/
	@Override
	public int getId() {
		return _dmHistoryEnterrise.getId();
	}

	/**
	* Sets the ID of this dm history enterrise.
	*
	* @param id the ID of this dm history enterrise
	*/
	@Override
	public void setId(int id) {
		_dmHistoryEnterrise.setId(id);
	}

	/**
	* Returns the enterprise code of this dm history enterrise.
	*
	* @return the enterprise code of this dm history enterrise
	*/
	@Override
	public java.lang.String getEnterpriseCode() {
		return _dmHistoryEnterrise.getEnterpriseCode();
	}

	/**
	* Sets the enterprise code of this dm history enterrise.
	*
	* @param enterpriseCode the enterprise code of this dm history enterrise
	*/
	@Override
	public void setEnterpriseCode(java.lang.String enterpriseCode) {
		_dmHistoryEnterrise.setEnterpriseCode(enterpriseCode);
	}

	/**
	* Returns the enterprise tax code of this dm history enterrise.
	*
	* @return the enterprise tax code of this dm history enterrise
	*/
	@Override
	public java.lang.String getEnterpriseTaxCode() {
		return _dmHistoryEnterrise.getEnterpriseTaxCode();
	}

	/**
	* Sets the enterprise tax code of this dm history enterrise.
	*
	* @param enterpriseTaxCode the enterprise tax code of this dm history enterrise
	*/
	@Override
	public void setEnterpriseTaxCode(java.lang.String enterpriseTaxCode) {
		_dmHistoryEnterrise.setEnterpriseTaxCode(enterpriseTaxCode);
	}

	/**
	* Returns the enterprise name of this dm history enterrise.
	*
	* @return the enterprise name of this dm history enterrise
	*/
	@Override
	public java.lang.String getEnterpriseName() {
		return _dmHistoryEnterrise.getEnterpriseName();
	}

	/**
	* Sets the enterprise name of this dm history enterrise.
	*
	* @param enterpriseName the enterprise name of this dm history enterrise
	*/
	@Override
	public void setEnterpriseName(java.lang.String enterpriseName) {
		_dmHistoryEnterrise.setEnterpriseName(enterpriseName);
	}

	/**
	* Returns the enterprise short name of this dm history enterrise.
	*
	* @return the enterprise short name of this dm history enterrise
	*/
	@Override
	public java.lang.String getEnterpriseShortName() {
		return _dmHistoryEnterrise.getEnterpriseShortName();
	}

	/**
	* Sets the enterprise short name of this dm history enterrise.
	*
	* @param enterpriseShortName the enterprise short name of this dm history enterrise
	*/
	@Override
	public void setEnterpriseShortName(java.lang.String enterpriseShortName) {
		_dmHistoryEnterrise.setEnterpriseShortName(enterpriseShortName);
	}

	/**
	* Returns the enterprise foreign name of this dm history enterrise.
	*
	* @return the enterprise foreign name of this dm history enterrise
	*/
	@Override
	public java.lang.String getEnterpriseForeignName() {
		return _dmHistoryEnterrise.getEnterpriseForeignName();
	}

	/**
	* Sets the enterprise foreign name of this dm history enterrise.
	*
	* @param enterpriseForeignName the enterprise foreign name of this dm history enterrise
	*/
	@Override
	public void setEnterpriseForeignName(java.lang.String enterpriseForeignName) {
		_dmHistoryEnterrise.setEnterpriseForeignName(enterpriseForeignName);
	}

	/**
	* Returns the enterprise person of this dm history enterrise.
	*
	* @return the enterprise person of this dm history enterrise
	*/
	@Override
	public java.lang.String getEnterprisePerson() {
		return _dmHistoryEnterrise.getEnterprisePerson();
	}

	/**
	* Sets the enterprise person of this dm history enterrise.
	*
	* @param enterprisePerson the enterprise person of this dm history enterrise
	*/
	@Override
	public void setEnterprisePerson(java.lang.String enterprisePerson) {
		_dmHistoryEnterrise.setEnterprisePerson(enterprisePerson);
	}

	/**
	* Returns the enterprise h o address of this dm history enterrise.
	*
	* @return the enterprise h o address of this dm history enterrise
	*/
	@Override
	public java.lang.String getEnterpriseHOAddress() {
		return _dmHistoryEnterrise.getEnterpriseHOAddress();
	}

	/**
	* Sets the enterprise h o address of this dm history enterrise.
	*
	* @param enterpriseHOAddress the enterprise h o address of this dm history enterrise
	*/
	@Override
	public void setEnterpriseHOAddress(java.lang.String enterpriseHOAddress) {
		_dmHistoryEnterrise.setEnterpriseHOAddress(enterpriseHOAddress);
	}

	/**
	* Returns the state code of this dm history enterrise.
	*
	* @return the state code of this dm history enterrise
	*/
	@Override
	public java.lang.String getStateCode() {
		return _dmHistoryEnterrise.getStateCode();
	}

	/**
	* Sets the state code of this dm history enterrise.
	*
	* @param stateCode the state code of this dm history enterrise
	*/
	@Override
	public void setStateCode(java.lang.String stateCode) {
		_dmHistoryEnterrise.setStateCode(stateCode);
	}

	/**
	* Returns the city code of this dm history enterrise.
	*
	* @return the city code of this dm history enterrise
	*/
	@Override
	public java.lang.String getCityCode() {
		return _dmHistoryEnterrise.getCityCode();
	}

	/**
	* Sets the city code of this dm history enterrise.
	*
	* @param cityCode the city code of this dm history enterrise
	*/
	@Override
	public void setCityCode(java.lang.String cityCode) {
		_dmHistoryEnterrise.setCityCode(cityCode);
	}

	/**
	* Returns the district code of this dm history enterrise.
	*
	* @return the district code of this dm history enterrise
	*/
	@Override
	public java.lang.String getDistrictCode() {
		return _dmHistoryEnterrise.getDistrictCode();
	}

	/**
	* Sets the district code of this dm history enterrise.
	*
	* @param districtCode the district code of this dm history enterrise
	*/
	@Override
	public void setDistrictCode(java.lang.String districtCode) {
		_dmHistoryEnterrise.setDistrictCode(districtCode);
	}

	/**
	* Returns the ward code of this dm history enterrise.
	*
	* @return the ward code of this dm history enterrise
	*/
	@Override
	public java.lang.String getWardCode() {
		return _dmHistoryEnterrise.getWardCode();
	}

	/**
	* Sets the ward code of this dm history enterrise.
	*
	* @param wardCode the ward code of this dm history enterrise
	*/
	@Override
	public void setWardCode(java.lang.String wardCode) {
		_dmHistoryEnterrise.setWardCode(wardCode);
	}

	/**
	* Returns the telephone no of this dm history enterrise.
	*
	* @return the telephone no of this dm history enterrise
	*/
	@Override
	public java.lang.String getTelephoneNo() {
		return _dmHistoryEnterrise.getTelephoneNo();
	}

	/**
	* Sets the telephone no of this dm history enterrise.
	*
	* @param telephoneNo the telephone no of this dm history enterrise
	*/
	@Override
	public void setTelephoneNo(java.lang.String telephoneNo) {
		_dmHistoryEnterrise.setTelephoneNo(telephoneNo);
	}

	/**
	* Returns the registration code of this dm history enterrise.
	*
	* @return the registration code of this dm history enterrise
	*/
	@Override
	public java.lang.String getRegistrationCode() {
		return _dmHistoryEnterrise.getRegistrationCode();
	}

	/**
	* Sets the registration code of this dm history enterrise.
	*
	* @param registrationCode the registration code of this dm history enterrise
	*/
	@Override
	public void setRegistrationCode(java.lang.String registrationCode) {
		_dmHistoryEnterrise.setRegistrationCode(registrationCode);
	}

	/**
	* Returns the registration address of this dm history enterrise.
	*
	* @return the registration address of this dm history enterrise
	*/
	@Override
	public java.lang.String getRegistrationAddress() {
		return _dmHistoryEnterrise.getRegistrationAddress();
	}

	/**
	* Sets the registration address of this dm history enterrise.
	*
	* @param registrationAddress the registration address of this dm history enterrise
	*/
	@Override
	public void setRegistrationAddress(java.lang.String registrationAddress) {
		_dmHistoryEnterrise.setRegistrationAddress(registrationAddress);
	}

	/**
	* Returns the registration date of this dm history enterrise.
	*
	* @return the registration date of this dm history enterrise
	*/
	@Override
	public java.util.Date getRegistrationDate() {
		return _dmHistoryEnterrise.getRegistrationDate();
	}

	/**
	* Sets the registration date of this dm history enterrise.
	*
	* @param registrationDate the registration date of this dm history enterrise
	*/
	@Override
	public void setRegistrationDate(java.util.Date registrationDate) {
		_dmHistoryEnterrise.setRegistrationDate(registrationDate);
	}

	/**
	* Returns the is delete of this dm history enterrise.
	*
	* @return the is delete of this dm history enterrise
	*/
	@Override
	public int getIsDelete() {
		return _dmHistoryEnterrise.getIsDelete();
	}

	/**
	* Sets the is delete of this dm history enterrise.
	*
	* @param isDelete the is delete of this dm history enterrise
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmHistoryEnterrise.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm history enterrise.
	*
	* @return the marked as delete of this dm history enterrise
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmHistoryEnterrise.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm history enterrise.
	*
	* @param markedAsDelete the marked as delete of this dm history enterrise
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmHistoryEnterrise.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm history enterrise.
	*
	* @return the modified date of this dm history enterrise
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmHistoryEnterrise.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm history enterrise.
	*
	* @param modifiedDate the modified date of this dm history enterrise
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmHistoryEnterrise.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm history enterrise.
	*
	* @return the requested date of this dm history enterrise
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmHistoryEnterrise.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm history enterrise.
	*
	* @param requestedDate the requested date of this dm history enterrise
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmHistoryEnterrise.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm history enterrise.
	*
	* @return the sync version of this dm history enterrise
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmHistoryEnterrise.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm history enterrise.
	*
	* @param syncVersion the sync version of this dm history enterrise
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmHistoryEnterrise.setSyncVersion(syncVersion);
	}

	/**
	* Returns the modified user of this dm history enterrise.
	*
	* @return the modified user of this dm history enterrise
	*/
	@Override
	public java.lang.String getModifiedUser() {
		return _dmHistoryEnterrise.getModifiedUser();
	}

	/**
	* Sets the modified user of this dm history enterrise.
	*
	* @param modifiedUser the modified user of this dm history enterrise
	*/
	@Override
	public void setModifiedUser(java.lang.String modifiedUser) {
		_dmHistoryEnterrise.setModifiedUser(modifiedUser);
	}

	@Override
	public boolean isNew() {
		return _dmHistoryEnterrise.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmHistoryEnterrise.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmHistoryEnterrise.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmHistoryEnterrise.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmHistoryEnterrise.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmHistoryEnterrise.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmHistoryEnterrise.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmHistoryEnterrise.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmHistoryEnterrise.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmHistoryEnterrise.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmHistoryEnterrise.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmHistoryEnterriseWrapper((DmHistoryEnterrise)_dmHistoryEnterrise.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise dmHistoryEnterrise) {
		return _dmHistoryEnterrise.compareTo(dmHistoryEnterrise);
	}

	@Override
	public int hashCode() {
		return _dmHistoryEnterrise.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise> toCacheModel() {
		return _dmHistoryEnterrise.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise toEscapedModel() {
		return new DmHistoryEnterriseWrapper(_dmHistoryEnterrise.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise toUnescapedModel() {
		return new DmHistoryEnterriseWrapper(_dmHistoryEnterrise.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmHistoryEnterrise.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmHistoryEnterrise.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryEnterrise.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmHistoryEnterriseWrapper)) {
			return false;
		}

		DmHistoryEnterriseWrapper dmHistoryEnterriseWrapper = (DmHistoryEnterriseWrapper)obj;

		if (Validator.equals(_dmHistoryEnterrise,
					dmHistoryEnterriseWrapper._dmHistoryEnterrise)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmHistoryEnterrise getWrappedDmHistoryEnterrise() {
		return _dmHistoryEnterrise;
	}

	@Override
	public DmHistoryEnterrise getWrappedModel() {
		return _dmHistoryEnterrise;
	}

	@Override
	public void resetOriginalValues() {
		_dmHistoryEnterrise.resetOriginalValues();
	}

	private DmHistoryEnterrise _dmHistoryEnterrise;
}