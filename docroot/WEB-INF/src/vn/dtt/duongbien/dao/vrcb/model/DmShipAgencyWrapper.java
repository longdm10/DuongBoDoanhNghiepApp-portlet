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
 * This class is a wrapper for {@link DmShipAgency}.
 * </p>
 *
 * @author longdm
 * @see DmShipAgency
 * @generated
 */
public class DmShipAgencyWrapper implements DmShipAgency,
	ModelWrapper<DmShipAgency> {
	public DmShipAgencyWrapper(DmShipAgency dmShipAgency) {
		_dmShipAgency = dmShipAgency;
	}

	@Override
	public Class<?> getModelClass() {
		return DmShipAgency.class;
	}

	@Override
	public String getModelClassName() {
		return DmShipAgency.class.getName();
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

	/**
	* Returns the primary key of this dm ship agency.
	*
	* @return the primary key of this dm ship agency
	*/
	@Override
	public int getPrimaryKey() {
		return _dmShipAgency.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm ship agency.
	*
	* @param primaryKey the primary key of this dm ship agency
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_dmShipAgency.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm ship agency.
	*
	* @return the ID of this dm ship agency
	*/
	@Override
	public int getId() {
		return _dmShipAgency.getId();
	}

	/**
	* Sets the ID of this dm ship agency.
	*
	* @param id the ID of this dm ship agency
	*/
	@Override
	public void setId(int id) {
		_dmShipAgency.setId(id);
	}

	/**
	* Returns the ship agency code of this dm ship agency.
	*
	* @return the ship agency code of this dm ship agency
	*/
	@Override
	public java.lang.String getShipAgencyCode() {
		return _dmShipAgency.getShipAgencyCode();
	}

	/**
	* Sets the ship agency code of this dm ship agency.
	*
	* @param shipAgencyCode the ship agency code of this dm ship agency
	*/
	@Override
	public void setShipAgencyCode(java.lang.String shipAgencyCode) {
		_dmShipAgency.setShipAgencyCode(shipAgencyCode);
	}

	/**
	* Returns the ship agency name of this dm ship agency.
	*
	* @return the ship agency name of this dm ship agency
	*/
	@Override
	public java.lang.String getShipAgencyName() {
		return _dmShipAgency.getShipAgencyName();
	}

	/**
	* Sets the ship agency name of this dm ship agency.
	*
	* @param shipAgencyName the ship agency name of this dm ship agency
	*/
	@Override
	public void setShipAgencyName(java.lang.String shipAgencyName) {
		_dmShipAgency.setShipAgencyName(shipAgencyName);
	}

	/**
	* Returns the ship agency name v n of this dm ship agency.
	*
	* @return the ship agency name v n of this dm ship agency
	*/
	@Override
	public java.lang.String getShipAgencyNameVN() {
		return _dmShipAgency.getShipAgencyNameVN();
	}

	/**
	* Sets the ship agency name v n of this dm ship agency.
	*
	* @param shipAgencyNameVN the ship agency name v n of this dm ship agency
	*/
	@Override
	public void setShipAgencyNameVN(java.lang.String shipAgencyNameVN) {
		_dmShipAgency.setShipAgencyNameVN(shipAgencyNameVN);
	}

	/**
	* Returns the tax code of this dm ship agency.
	*
	* @return the tax code of this dm ship agency
	*/
	@Override
	public java.lang.String getTaxCode() {
		return _dmShipAgency.getTaxCode();
	}

	/**
	* Sets the tax code of this dm ship agency.
	*
	* @param taxCode the tax code of this dm ship agency
	*/
	@Override
	public void setTaxCode(java.lang.String taxCode) {
		_dmShipAgency.setTaxCode(taxCode);
	}

	/**
	* Returns the state code of this dm ship agency.
	*
	* @return the state code of this dm ship agency
	*/
	@Override
	public java.lang.String getStateCode() {
		return _dmShipAgency.getStateCode();
	}

	/**
	* Sets the state code of this dm ship agency.
	*
	* @param stateCode the state code of this dm ship agency
	*/
	@Override
	public void setStateCode(java.lang.String stateCode) {
		_dmShipAgency.setStateCode(stateCode);
	}

	/**
	* Returns the citycode of this dm ship agency.
	*
	* @return the citycode of this dm ship agency
	*/
	@Override
	public java.lang.String getCitycode() {
		return _dmShipAgency.getCitycode();
	}

	/**
	* Sets the citycode of this dm ship agency.
	*
	* @param citycode the citycode of this dm ship agency
	*/
	@Override
	public void setCitycode(java.lang.String citycode) {
		_dmShipAgency.setCitycode(citycode);
	}

	/**
	* Returns the address of this dm ship agency.
	*
	* @return the address of this dm ship agency
	*/
	@Override
	public java.lang.String getAddress() {
		return _dmShipAgency.getAddress();
	}

	/**
	* Sets the address of this dm ship agency.
	*
	* @param address the address of this dm ship agency
	*/
	@Override
	public void setAddress(java.lang.String address) {
		_dmShipAgency.setAddress(address);
	}

	/**
	* Returns the address v n of this dm ship agency.
	*
	* @return the address v n of this dm ship agency
	*/
	@Override
	public java.lang.String getAddressVN() {
		return _dmShipAgency.getAddressVN();
	}

	/**
	* Sets the address v n of this dm ship agency.
	*
	* @param addressVN the address v n of this dm ship agency
	*/
	@Override
	public void setAddressVN(java.lang.String addressVN) {
		_dmShipAgency.setAddressVN(addressVN);
	}

	/**
	* Returns the phone of this dm ship agency.
	*
	* @return the phone of this dm ship agency
	*/
	@Override
	public java.lang.String getPhone() {
		return _dmShipAgency.getPhone();
	}

	/**
	* Sets the phone of this dm ship agency.
	*
	* @param phone the phone of this dm ship agency
	*/
	@Override
	public void setPhone(java.lang.String phone) {
		_dmShipAgency.setPhone(phone);
	}

	/**
	* Returns the fax of this dm ship agency.
	*
	* @return the fax of this dm ship agency
	*/
	@Override
	public java.lang.String getFax() {
		return _dmShipAgency.getFax();
	}

	/**
	* Sets the fax of this dm ship agency.
	*
	* @param fax the fax of this dm ship agency
	*/
	@Override
	public void setFax(java.lang.String fax) {
		_dmShipAgency.setFax(fax);
	}

	/**
	* Returns the email of this dm ship agency.
	*
	* @return the email of this dm ship agency
	*/
	@Override
	public java.lang.String getEmail() {
		return _dmShipAgency.getEmail();
	}

	/**
	* Sets the email of this dm ship agency.
	*
	* @param email the email of this dm ship agency
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_dmShipAgency.setEmail(email);
	}

	/**
	* Returns the description of this dm ship agency.
	*
	* @return the description of this dm ship agency
	*/
	@Override
	public java.lang.String getDescription() {
		return _dmShipAgency.getDescription();
	}

	/**
	* Sets the description of this dm ship agency.
	*
	* @param description the description of this dm ship agency
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_dmShipAgency.setDescription(description);
	}

	/**
	* Returns the contacter of this dm ship agency.
	*
	* @return the contacter of this dm ship agency
	*/
	@Override
	public java.lang.String getContacter() {
		return _dmShipAgency.getContacter();
	}

	/**
	* Sets the contacter of this dm ship agency.
	*
	* @param contacter the contacter of this dm ship agency
	*/
	@Override
	public void setContacter(java.lang.String contacter) {
		_dmShipAgency.setContacter(contacter);
	}

	/**
	* Returns the position of this dm ship agency.
	*
	* @return the position of this dm ship agency
	*/
	@Override
	public java.lang.String getPosition() {
		return _dmShipAgency.getPosition();
	}

	/**
	* Sets the position of this dm ship agency.
	*
	* @param position the position of this dm ship agency
	*/
	@Override
	public void setPosition(java.lang.String position) {
		_dmShipAgency.setPosition(position);
	}

	/**
	* Returns the contact tell of this dm ship agency.
	*
	* @return the contact tell of this dm ship agency
	*/
	@Override
	public java.lang.String getContactTell() {
		return _dmShipAgency.getContactTell();
	}

	/**
	* Sets the contact tell of this dm ship agency.
	*
	* @param contactTell the contact tell of this dm ship agency
	*/
	@Override
	public void setContactTell(java.lang.String contactTell) {
		_dmShipAgency.setContactTell(contactTell);
	}

	/**
	* Returns the is delete of this dm ship agency.
	*
	* @return the is delete of this dm ship agency
	*/
	@Override
	public int getIsDelete() {
		return _dmShipAgency.getIsDelete();
	}

	/**
	* Sets the is delete of this dm ship agency.
	*
	* @param isDelete the is delete of this dm ship agency
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmShipAgency.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm ship agency.
	*
	* @return the marked as delete of this dm ship agency
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmShipAgency.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm ship agency.
	*
	* @param markedAsDelete the marked as delete of this dm ship agency
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmShipAgency.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm ship agency.
	*
	* @return the modified date of this dm ship agency
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmShipAgency.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm ship agency.
	*
	* @param modifiedDate the modified date of this dm ship agency
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmShipAgency.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm ship agency.
	*
	* @return the requested date of this dm ship agency
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmShipAgency.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm ship agency.
	*
	* @param requestedDate the requested date of this dm ship agency
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmShipAgency.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm ship agency.
	*
	* @return the sync version of this dm ship agency
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmShipAgency.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm ship agency.
	*
	* @param syncVersion the sync version of this dm ship agency
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmShipAgency.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmShipAgency.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmShipAgency.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmShipAgency.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmShipAgency.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmShipAgency.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmShipAgency.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmShipAgency.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmShipAgency.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmShipAgency.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmShipAgency.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmShipAgency.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmShipAgencyWrapper((DmShipAgency)_dmShipAgency.clone());
	}

	@Override
	public int compareTo(DmShipAgency dmShipAgency) {
		return _dmShipAgency.compareTo(dmShipAgency);
	}

	@Override
	public int hashCode() {
		return _dmShipAgency.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<DmShipAgency> toCacheModel() {
		return _dmShipAgency.toCacheModel();
	}

	@Override
	public DmShipAgency toEscapedModel() {
		return new DmShipAgencyWrapper(_dmShipAgency.toEscapedModel());
	}

	@Override
	public DmShipAgency toUnescapedModel() {
		return new DmShipAgencyWrapper(_dmShipAgency.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmShipAgency.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmShipAgency.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmShipAgency.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmShipAgencyWrapper)) {
			return false;
		}

		DmShipAgencyWrapper dmShipAgencyWrapper = (DmShipAgencyWrapper)obj;

		if (Validator.equals(_dmShipAgency, dmShipAgencyWrapper._dmShipAgency)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmShipAgency getWrappedDmShipAgency() {
		return _dmShipAgency;
	}

	@Override
	public DmShipAgency getWrappedModel() {
		return _dmShipAgency;
	}

	@Override
	public void resetOriginalValues() {
		_dmShipAgency.resetOriginalValues();
	}

	private DmShipAgency _dmShipAgency;
}