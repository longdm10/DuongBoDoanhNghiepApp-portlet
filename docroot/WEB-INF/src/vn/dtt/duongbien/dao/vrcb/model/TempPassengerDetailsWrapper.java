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
 * This class is a wrapper for {@link TempPassengerDetails}.
 * </p>
 *
 * @author longdm
 * @see TempPassengerDetails
 * @generated
 */
public class TempPassengerDetailsWrapper implements TempPassengerDetails,
	ModelWrapper<TempPassengerDetails> {
	public TempPassengerDetailsWrapper(
		TempPassengerDetails tempPassengerDetails) {
		_tempPassengerDetails = tempPassengerDetails;
	}

	@Override
	public Class<?> getModelClass() {
		return TempPassengerDetails.class;
	}

	@Override
	public String getModelClassName() {
		return TempPassengerDetails.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("requestCode", getRequestCode());
		attributes.put("passengerCode", getPassengerCode());
		attributes.put("familyName", getFamilyName());
		attributes.put("givenName", getGivenName());
		attributes.put("nationality", getNationality());
		attributes.put("birthDay", getBirthDay());
		attributes.put("birthPlace", getBirthPlace());
		attributes.put("typeOfIdentity", getTypeOfIdentity());
		attributes.put("passportExpiredDate", getPassportExpiredDate());
		attributes.put("serialNumberOfIdentity", getSerialNumberOfIdentity());
		attributes.put("portOfEmbarkation", getPortOfEmbarkation());
		attributes.put("portOfDisembarkation", getPortOfDisembarkation());
		attributes.put("isTransit", getIsTransit());

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

		String passengerCode = (String)attributes.get("passengerCode");

		if (passengerCode != null) {
			setPassengerCode(passengerCode);
		}

		String familyName = (String)attributes.get("familyName");

		if (familyName != null) {
			setFamilyName(familyName);
		}

		String givenName = (String)attributes.get("givenName");

		if (givenName != null) {
			setGivenName(givenName);
		}

		String nationality = (String)attributes.get("nationality");

		if (nationality != null) {
			setNationality(nationality);
		}

		Date birthDay = (Date)attributes.get("birthDay");

		if (birthDay != null) {
			setBirthDay(birthDay);
		}

		String birthPlace = (String)attributes.get("birthPlace");

		if (birthPlace != null) {
			setBirthPlace(birthPlace);
		}

		String typeOfIdentity = (String)attributes.get("typeOfIdentity");

		if (typeOfIdentity != null) {
			setTypeOfIdentity(typeOfIdentity);
		}

		Date passportExpiredDate = (Date)attributes.get("passportExpiredDate");

		if (passportExpiredDate != null) {
			setPassportExpiredDate(passportExpiredDate);
		}

		String serialNumberOfIdentity = (String)attributes.get(
				"serialNumberOfIdentity");

		if (serialNumberOfIdentity != null) {
			setSerialNumberOfIdentity(serialNumberOfIdentity);
		}

		String portOfEmbarkation = (String)attributes.get("portOfEmbarkation");

		if (portOfEmbarkation != null) {
			setPortOfEmbarkation(portOfEmbarkation);
		}

		String portOfDisembarkation = (String)attributes.get(
				"portOfDisembarkation");

		if (portOfDisembarkation != null) {
			setPortOfDisembarkation(portOfDisembarkation);
		}

		Integer isTransit = (Integer)attributes.get("isTransit");

		if (isTransit != null) {
			setIsTransit(isTransit);
		}
	}

	/**
	* Returns the primary key of this temp passenger details.
	*
	* @return the primary key of this temp passenger details
	*/
	@Override
	public long getPrimaryKey() {
		return _tempPassengerDetails.getPrimaryKey();
	}

	/**
	* Sets the primary key of this temp passenger details.
	*
	* @param primaryKey the primary key of this temp passenger details
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tempPassengerDetails.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this temp passenger details.
	*
	* @return the ID of this temp passenger details
	*/
	@Override
	public long getId() {
		return _tempPassengerDetails.getId();
	}

	/**
	* Sets the ID of this temp passenger details.
	*
	* @param id the ID of this temp passenger details
	*/
	@Override
	public void setId(long id) {
		_tempPassengerDetails.setId(id);
	}

	/**
	* Returns the request code of this temp passenger details.
	*
	* @return the request code of this temp passenger details
	*/
	@Override
	public java.lang.String getRequestCode() {
		return _tempPassengerDetails.getRequestCode();
	}

	/**
	* Sets the request code of this temp passenger details.
	*
	* @param requestCode the request code of this temp passenger details
	*/
	@Override
	public void setRequestCode(java.lang.String requestCode) {
		_tempPassengerDetails.setRequestCode(requestCode);
	}

	/**
	* Returns the passenger code of this temp passenger details.
	*
	* @return the passenger code of this temp passenger details
	*/
	@Override
	public java.lang.String getPassengerCode() {
		return _tempPassengerDetails.getPassengerCode();
	}

	/**
	* Sets the passenger code of this temp passenger details.
	*
	* @param passengerCode the passenger code of this temp passenger details
	*/
	@Override
	public void setPassengerCode(java.lang.String passengerCode) {
		_tempPassengerDetails.setPassengerCode(passengerCode);
	}

	/**
	* Returns the family name of this temp passenger details.
	*
	* @return the family name of this temp passenger details
	*/
	@Override
	public java.lang.String getFamilyName() {
		return _tempPassengerDetails.getFamilyName();
	}

	/**
	* Sets the family name of this temp passenger details.
	*
	* @param familyName the family name of this temp passenger details
	*/
	@Override
	public void setFamilyName(java.lang.String familyName) {
		_tempPassengerDetails.setFamilyName(familyName);
	}

	/**
	* Returns the given name of this temp passenger details.
	*
	* @return the given name of this temp passenger details
	*/
	@Override
	public java.lang.String getGivenName() {
		return _tempPassengerDetails.getGivenName();
	}

	/**
	* Sets the given name of this temp passenger details.
	*
	* @param givenName the given name of this temp passenger details
	*/
	@Override
	public void setGivenName(java.lang.String givenName) {
		_tempPassengerDetails.setGivenName(givenName);
	}

	/**
	* Returns the nationality of this temp passenger details.
	*
	* @return the nationality of this temp passenger details
	*/
	@Override
	public java.lang.String getNationality() {
		return _tempPassengerDetails.getNationality();
	}

	/**
	* Sets the nationality of this temp passenger details.
	*
	* @param nationality the nationality of this temp passenger details
	*/
	@Override
	public void setNationality(java.lang.String nationality) {
		_tempPassengerDetails.setNationality(nationality);
	}

	/**
	* Returns the birth day of this temp passenger details.
	*
	* @return the birth day of this temp passenger details
	*/
	@Override
	public java.util.Date getBirthDay() {
		return _tempPassengerDetails.getBirthDay();
	}

	/**
	* Sets the birth day of this temp passenger details.
	*
	* @param birthDay the birth day of this temp passenger details
	*/
	@Override
	public void setBirthDay(java.util.Date birthDay) {
		_tempPassengerDetails.setBirthDay(birthDay);
	}

	/**
	* Returns the birth place of this temp passenger details.
	*
	* @return the birth place of this temp passenger details
	*/
	@Override
	public java.lang.String getBirthPlace() {
		return _tempPassengerDetails.getBirthPlace();
	}

	/**
	* Sets the birth place of this temp passenger details.
	*
	* @param birthPlace the birth place of this temp passenger details
	*/
	@Override
	public void setBirthPlace(java.lang.String birthPlace) {
		_tempPassengerDetails.setBirthPlace(birthPlace);
	}

	/**
	* Returns the type of identity of this temp passenger details.
	*
	* @return the type of identity of this temp passenger details
	*/
	@Override
	public java.lang.String getTypeOfIdentity() {
		return _tempPassengerDetails.getTypeOfIdentity();
	}

	/**
	* Sets the type of identity of this temp passenger details.
	*
	* @param typeOfIdentity the type of identity of this temp passenger details
	*/
	@Override
	public void setTypeOfIdentity(java.lang.String typeOfIdentity) {
		_tempPassengerDetails.setTypeOfIdentity(typeOfIdentity);
	}

	/**
	* Returns the passport expired date of this temp passenger details.
	*
	* @return the passport expired date of this temp passenger details
	*/
	@Override
	public java.util.Date getPassportExpiredDate() {
		return _tempPassengerDetails.getPassportExpiredDate();
	}

	/**
	* Sets the passport expired date of this temp passenger details.
	*
	* @param passportExpiredDate the passport expired date of this temp passenger details
	*/
	@Override
	public void setPassportExpiredDate(java.util.Date passportExpiredDate) {
		_tempPassengerDetails.setPassportExpiredDate(passportExpiredDate);
	}

	/**
	* Returns the serial number of identity of this temp passenger details.
	*
	* @return the serial number of identity of this temp passenger details
	*/
	@Override
	public java.lang.String getSerialNumberOfIdentity() {
		return _tempPassengerDetails.getSerialNumberOfIdentity();
	}

	/**
	* Sets the serial number of identity of this temp passenger details.
	*
	* @param serialNumberOfIdentity the serial number of identity of this temp passenger details
	*/
	@Override
	public void setSerialNumberOfIdentity(
		java.lang.String serialNumberOfIdentity) {
		_tempPassengerDetails.setSerialNumberOfIdentity(serialNumberOfIdentity);
	}

	/**
	* Returns the port of embarkation of this temp passenger details.
	*
	* @return the port of embarkation of this temp passenger details
	*/
	@Override
	public java.lang.String getPortOfEmbarkation() {
		return _tempPassengerDetails.getPortOfEmbarkation();
	}

	/**
	* Sets the port of embarkation of this temp passenger details.
	*
	* @param portOfEmbarkation the port of embarkation of this temp passenger details
	*/
	@Override
	public void setPortOfEmbarkation(java.lang.String portOfEmbarkation) {
		_tempPassengerDetails.setPortOfEmbarkation(portOfEmbarkation);
	}

	/**
	* Returns the port of disembarkation of this temp passenger details.
	*
	* @return the port of disembarkation of this temp passenger details
	*/
	@Override
	public java.lang.String getPortOfDisembarkation() {
		return _tempPassengerDetails.getPortOfDisembarkation();
	}

	/**
	* Sets the port of disembarkation of this temp passenger details.
	*
	* @param portOfDisembarkation the port of disembarkation of this temp passenger details
	*/
	@Override
	public void setPortOfDisembarkation(java.lang.String portOfDisembarkation) {
		_tempPassengerDetails.setPortOfDisembarkation(portOfDisembarkation);
	}

	/**
	* Returns the is transit of this temp passenger details.
	*
	* @return the is transit of this temp passenger details
	*/
	@Override
	public int getIsTransit() {
		return _tempPassengerDetails.getIsTransit();
	}

	/**
	* Sets the is transit of this temp passenger details.
	*
	* @param isTransit the is transit of this temp passenger details
	*/
	@Override
	public void setIsTransit(int isTransit) {
		_tempPassengerDetails.setIsTransit(isTransit);
	}

	@Override
	public boolean isNew() {
		return _tempPassengerDetails.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tempPassengerDetails.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tempPassengerDetails.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tempPassengerDetails.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tempPassengerDetails.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tempPassengerDetails.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tempPassengerDetails.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tempPassengerDetails.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tempPassengerDetails.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tempPassengerDetails.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tempPassengerDetails.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TempPassengerDetailsWrapper((TempPassengerDetails)_tempPassengerDetails.clone());
	}

	@Override
	public int compareTo(TempPassengerDetails tempPassengerDetails) {
		return _tempPassengerDetails.compareTo(tempPassengerDetails);
	}

	@Override
	public int hashCode() {
		return _tempPassengerDetails.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<TempPassengerDetails> toCacheModel() {
		return _tempPassengerDetails.toCacheModel();
	}

	@Override
	public TempPassengerDetails toEscapedModel() {
		return new TempPassengerDetailsWrapper(_tempPassengerDetails.toEscapedModel());
	}

	@Override
	public TempPassengerDetails toUnescapedModel() {
		return new TempPassengerDetailsWrapper(_tempPassengerDetails.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tempPassengerDetails.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tempPassengerDetails.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempPassengerDetails.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TempPassengerDetailsWrapper)) {
			return false;
		}

		TempPassengerDetailsWrapper tempPassengerDetailsWrapper = (TempPassengerDetailsWrapper)obj;

		if (Validator.equals(_tempPassengerDetails,
					tempPassengerDetailsWrapper._tempPassengerDetails)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TempPassengerDetails getWrappedTempPassengerDetails() {
		return _tempPassengerDetails;
	}

	@Override
	public TempPassengerDetails getWrappedModel() {
		return _tempPassengerDetails;
	}

	@Override
	public void resetOriginalValues() {
		_tempPassengerDetails.resetOriginalValues();
	}

	private TempPassengerDetails _tempPassengerDetails;
}