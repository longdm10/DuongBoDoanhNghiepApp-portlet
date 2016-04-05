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
 * This class is a wrapper for {@link PassengerList}.
 * </p>
 *
 * @author longdm
 * @see PassengerList
 * @generated
 */
public class PassengerListWrapper implements PassengerList,
	ModelWrapper<PassengerList> {
	public PassengerListWrapper(PassengerList passengerList) {
		_passengerList = passengerList;
	}

	@Override
	public Class<?> getModelClass() {
		return PassengerList.class;
	}

	@Override
	public String getModelClassName() {
		return PassengerList.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("passengerCode", getPassengerCode());
		attributes.put("documentNo", getDocumentNo());
		attributes.put("fullName", getFullName());
		attributes.put("stateCode", getStateCode());
		attributes.put("birthDay", getBirthDay());
		attributes.put("birthPlace", getBirthPlace());
		attributes.put("passportTypeCode", getPassportTypeCode());
		attributes.put("passPortNo", getPassPortNo());
		attributes.put("portCheckInCode", getPortCheckInCode());
		attributes.put("portCheckOutCode", getPortCheckOutCode());
		attributes.put("isTransit", getIsTransit());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifyDate", getModifyDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String passengerCode = (String)attributes.get("passengerCode");

		if (passengerCode != null) {
			setPassengerCode(passengerCode);
		}

		String documentNo = (String)attributes.get("documentNo");

		if (documentNo != null) {
			setDocumentNo(documentNo);
		}

		String fullName = (String)attributes.get("fullName");

		if (fullName != null) {
			setFullName(fullName);
		}

		String stateCode = (String)attributes.get("stateCode");

		if (stateCode != null) {
			setStateCode(stateCode);
		}

		Date birthDay = (Date)attributes.get("birthDay");

		if (birthDay != null) {
			setBirthDay(birthDay);
		}

		String birthPlace = (String)attributes.get("birthPlace");

		if (birthPlace != null) {
			setBirthPlace(birthPlace);
		}

		String passportTypeCode = (String)attributes.get("passportTypeCode");

		if (passportTypeCode != null) {
			setPassportTypeCode(passportTypeCode);
		}

		String passPortNo = (String)attributes.get("passPortNo");

		if (passPortNo != null) {
			setPassPortNo(passPortNo);
		}

		String portCheckInCode = (String)attributes.get("portCheckInCode");

		if (portCheckInCode != null) {
			setPortCheckInCode(portCheckInCode);
		}

		String portCheckOutCode = (String)attributes.get("portCheckOutCode");

		if (portCheckOutCode != null) {
			setPortCheckOutCode(portCheckOutCode);
		}

		Boolean isTransit = (Boolean)attributes.get("isTransit");

		if (isTransit != null) {
			setIsTransit(isTransit);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifyDate = (Date)attributes.get("modifyDate");

		if (modifyDate != null) {
			setModifyDate(modifyDate);
		}
	}

	/**
	* Returns the primary key of this passenger list.
	*
	* @return the primary key of this passenger list
	*/
	@Override
	public long getPrimaryKey() {
		return _passengerList.getPrimaryKey();
	}

	/**
	* Sets the primary key of this passenger list.
	*
	* @param primaryKey the primary key of this passenger list
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_passengerList.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this passenger list.
	*
	* @return the ID of this passenger list
	*/
	@Override
	public long getId() {
		return _passengerList.getId();
	}

	/**
	* Sets the ID of this passenger list.
	*
	* @param id the ID of this passenger list
	*/
	@Override
	public void setId(long id) {
		_passengerList.setId(id);
	}

	/**
	* Returns the passenger code of this passenger list.
	*
	* @return the passenger code of this passenger list
	*/
	@Override
	public java.lang.String getPassengerCode() {
		return _passengerList.getPassengerCode();
	}

	/**
	* Sets the passenger code of this passenger list.
	*
	* @param passengerCode the passenger code of this passenger list
	*/
	@Override
	public void setPassengerCode(java.lang.String passengerCode) {
		_passengerList.setPassengerCode(passengerCode);
	}

	/**
	* Returns the document no of this passenger list.
	*
	* @return the document no of this passenger list
	*/
	@Override
	public java.lang.String getDocumentNo() {
		return _passengerList.getDocumentNo();
	}

	/**
	* Sets the document no of this passenger list.
	*
	* @param documentNo the document no of this passenger list
	*/
	@Override
	public void setDocumentNo(java.lang.String documentNo) {
		_passengerList.setDocumentNo(documentNo);
	}

	/**
	* Returns the full name of this passenger list.
	*
	* @return the full name of this passenger list
	*/
	@Override
	public java.lang.String getFullName() {
		return _passengerList.getFullName();
	}

	/**
	* Sets the full name of this passenger list.
	*
	* @param fullName the full name of this passenger list
	*/
	@Override
	public void setFullName(java.lang.String fullName) {
		_passengerList.setFullName(fullName);
	}

	/**
	* Returns the state code of this passenger list.
	*
	* @return the state code of this passenger list
	*/
	@Override
	public java.lang.String getStateCode() {
		return _passengerList.getStateCode();
	}

	/**
	* Sets the state code of this passenger list.
	*
	* @param stateCode the state code of this passenger list
	*/
	@Override
	public void setStateCode(java.lang.String stateCode) {
		_passengerList.setStateCode(stateCode);
	}

	/**
	* Returns the birth day of this passenger list.
	*
	* @return the birth day of this passenger list
	*/
	@Override
	public java.util.Date getBirthDay() {
		return _passengerList.getBirthDay();
	}

	/**
	* Sets the birth day of this passenger list.
	*
	* @param birthDay the birth day of this passenger list
	*/
	@Override
	public void setBirthDay(java.util.Date birthDay) {
		_passengerList.setBirthDay(birthDay);
	}

	/**
	* Returns the birth place of this passenger list.
	*
	* @return the birth place of this passenger list
	*/
	@Override
	public java.lang.String getBirthPlace() {
		return _passengerList.getBirthPlace();
	}

	/**
	* Sets the birth place of this passenger list.
	*
	* @param birthPlace the birth place of this passenger list
	*/
	@Override
	public void setBirthPlace(java.lang.String birthPlace) {
		_passengerList.setBirthPlace(birthPlace);
	}

	/**
	* Returns the passport type code of this passenger list.
	*
	* @return the passport type code of this passenger list
	*/
	@Override
	public java.lang.String getPassportTypeCode() {
		return _passengerList.getPassportTypeCode();
	}

	/**
	* Sets the passport type code of this passenger list.
	*
	* @param passportTypeCode the passport type code of this passenger list
	*/
	@Override
	public void setPassportTypeCode(java.lang.String passportTypeCode) {
		_passengerList.setPassportTypeCode(passportTypeCode);
	}

	/**
	* Returns the pass port no of this passenger list.
	*
	* @return the pass port no of this passenger list
	*/
	@Override
	public java.lang.String getPassPortNo() {
		return _passengerList.getPassPortNo();
	}

	/**
	* Sets the pass port no of this passenger list.
	*
	* @param passPortNo the pass port no of this passenger list
	*/
	@Override
	public void setPassPortNo(java.lang.String passPortNo) {
		_passengerList.setPassPortNo(passPortNo);
	}

	/**
	* Returns the port check in code of this passenger list.
	*
	* @return the port check in code of this passenger list
	*/
	@Override
	public java.lang.String getPortCheckInCode() {
		return _passengerList.getPortCheckInCode();
	}

	/**
	* Sets the port check in code of this passenger list.
	*
	* @param portCheckInCode the port check in code of this passenger list
	*/
	@Override
	public void setPortCheckInCode(java.lang.String portCheckInCode) {
		_passengerList.setPortCheckInCode(portCheckInCode);
	}

	/**
	* Returns the port check out code of this passenger list.
	*
	* @return the port check out code of this passenger list
	*/
	@Override
	public java.lang.String getPortCheckOutCode() {
		return _passengerList.getPortCheckOutCode();
	}

	/**
	* Sets the port check out code of this passenger list.
	*
	* @param portCheckOutCode the port check out code of this passenger list
	*/
	@Override
	public void setPortCheckOutCode(java.lang.String portCheckOutCode) {
		_passengerList.setPortCheckOutCode(portCheckOutCode);
	}

	/**
	* Returns the is transit of this passenger list.
	*
	* @return the is transit of this passenger list
	*/
	@Override
	public boolean getIsTransit() {
		return _passengerList.getIsTransit();
	}

	/**
	* Returns <code>true</code> if this passenger list is is transit.
	*
	* @return <code>true</code> if this passenger list is is transit; <code>false</code> otherwise
	*/
	@Override
	public boolean isIsTransit() {
		return _passengerList.isIsTransit();
	}

	/**
	* Sets whether this passenger list is is transit.
	*
	* @param isTransit the is transit of this passenger list
	*/
	@Override
	public void setIsTransit(boolean isTransit) {
		_passengerList.setIsTransit(isTransit);
	}

	/**
	* Returns the create date of this passenger list.
	*
	* @return the create date of this passenger list
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _passengerList.getCreateDate();
	}

	/**
	* Sets the create date of this passenger list.
	*
	* @param createDate the create date of this passenger list
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_passengerList.setCreateDate(createDate);
	}

	/**
	* Returns the modify date of this passenger list.
	*
	* @return the modify date of this passenger list
	*/
	@Override
	public java.util.Date getModifyDate() {
		return _passengerList.getModifyDate();
	}

	/**
	* Sets the modify date of this passenger list.
	*
	* @param modifyDate the modify date of this passenger list
	*/
	@Override
	public void setModifyDate(java.util.Date modifyDate) {
		_passengerList.setModifyDate(modifyDate);
	}

	@Override
	public boolean isNew() {
		return _passengerList.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_passengerList.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _passengerList.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_passengerList.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _passengerList.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _passengerList.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_passengerList.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _passengerList.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_passengerList.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_passengerList.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_passengerList.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PassengerListWrapper((PassengerList)_passengerList.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.PassengerList passengerList) {
		return _passengerList.compareTo(passengerList);
	}

	@Override
	public int hashCode() {
		return _passengerList.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.PassengerList> toCacheModel() {
		return _passengerList.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.PassengerList toEscapedModel() {
		return new PassengerListWrapper(_passengerList.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.PassengerList toUnescapedModel() {
		return new PassengerListWrapper(_passengerList.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _passengerList.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _passengerList.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_passengerList.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PassengerListWrapper)) {
			return false;
		}

		PassengerListWrapper passengerListWrapper = (PassengerListWrapper)obj;

		if (Validator.equals(_passengerList, passengerListWrapper._passengerList)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PassengerList getWrappedPassengerList() {
		return _passengerList;
	}

	@Override
	public PassengerList getWrappedModel() {
		return _passengerList;
	}

	@Override
	public void resetOriginalValues() {
		_passengerList.resetOriginalValues();
	}

	private PassengerList _passengerList;
}