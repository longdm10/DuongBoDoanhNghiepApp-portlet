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
 * This class is a wrapper for {@link TempCrewDetails}.
 * </p>
 *
 * @author longdm
 * @see TempCrewDetails
 * @generated
 */
public class TempCrewDetailsWrapper implements TempCrewDetails,
	ModelWrapper<TempCrewDetails> {
	public TempCrewDetailsWrapper(TempCrewDetails tempCrewDetails) {
		_tempCrewDetails = tempCrewDetails;
	}

	@Override
	public Class<?> getModelClass() {
		return TempCrewDetails.class;
	}

	@Override
	public String getModelClassName() {
		return TempCrewDetails.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("requestCode", getRequestCode());
		attributes.put("crewcode", getCrewcode());
		attributes.put("familyName", getFamilyName());
		attributes.put("givenName", getGivenName());
		attributes.put("rankCode", getRankCode());
		attributes.put("nationality", getNationality());
		attributes.put("dateOfBirth", getDateOfBirth());
		attributes.put("placeOfBirth", getPlaceOfBirth());
		attributes.put("passportNumber", getPassportNumber());
		attributes.put("passportTypeCode", getPassportTypeCode());

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

		String crewcode = (String)attributes.get("crewcode");

		if (crewcode != null) {
			setCrewcode(crewcode);
		}

		String familyName = (String)attributes.get("familyName");

		if (familyName != null) {
			setFamilyName(familyName);
		}

		String givenName = (String)attributes.get("givenName");

		if (givenName != null) {
			setGivenName(givenName);
		}

		String rankCode = (String)attributes.get("rankCode");

		if (rankCode != null) {
			setRankCode(rankCode);
		}

		String nationality = (String)attributes.get("nationality");

		if (nationality != null) {
			setNationality(nationality);
		}

		Date dateOfBirth = (Date)attributes.get("dateOfBirth");

		if (dateOfBirth != null) {
			setDateOfBirth(dateOfBirth);
		}

		String placeOfBirth = (String)attributes.get("placeOfBirth");

		if (placeOfBirth != null) {
			setPlaceOfBirth(placeOfBirth);
		}

		String passportNumber = (String)attributes.get("passportNumber");

		if (passportNumber != null) {
			setPassportNumber(passportNumber);
		}

		String passportTypeCode = (String)attributes.get("passportTypeCode");

		if (passportTypeCode != null) {
			setPassportTypeCode(passportTypeCode);
		}
	}

	/**
	* Returns the primary key of this temp crew details.
	*
	* @return the primary key of this temp crew details
	*/
	@Override
	public long getPrimaryKey() {
		return _tempCrewDetails.getPrimaryKey();
	}

	/**
	* Sets the primary key of this temp crew details.
	*
	* @param primaryKey the primary key of this temp crew details
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tempCrewDetails.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this temp crew details.
	*
	* @return the ID of this temp crew details
	*/
	@Override
	public long getId() {
		return _tempCrewDetails.getId();
	}

	/**
	* Sets the ID of this temp crew details.
	*
	* @param id the ID of this temp crew details
	*/
	@Override
	public void setId(long id) {
		_tempCrewDetails.setId(id);
	}

	/**
	* Returns the request code of this temp crew details.
	*
	* @return the request code of this temp crew details
	*/
	@Override
	public java.lang.String getRequestCode() {
		return _tempCrewDetails.getRequestCode();
	}

	/**
	* Sets the request code of this temp crew details.
	*
	* @param requestCode the request code of this temp crew details
	*/
	@Override
	public void setRequestCode(java.lang.String requestCode) {
		_tempCrewDetails.setRequestCode(requestCode);
	}

	/**
	* Returns the crewcode of this temp crew details.
	*
	* @return the crewcode of this temp crew details
	*/
	@Override
	public java.lang.String getCrewcode() {
		return _tempCrewDetails.getCrewcode();
	}

	/**
	* Sets the crewcode of this temp crew details.
	*
	* @param crewcode the crewcode of this temp crew details
	*/
	@Override
	public void setCrewcode(java.lang.String crewcode) {
		_tempCrewDetails.setCrewcode(crewcode);
	}

	/**
	* Returns the family name of this temp crew details.
	*
	* @return the family name of this temp crew details
	*/
	@Override
	public java.lang.String getFamilyName() {
		return _tempCrewDetails.getFamilyName();
	}

	/**
	* Sets the family name of this temp crew details.
	*
	* @param familyName the family name of this temp crew details
	*/
	@Override
	public void setFamilyName(java.lang.String familyName) {
		_tempCrewDetails.setFamilyName(familyName);
	}

	/**
	* Returns the given name of this temp crew details.
	*
	* @return the given name of this temp crew details
	*/
	@Override
	public java.lang.String getGivenName() {
		return _tempCrewDetails.getGivenName();
	}

	/**
	* Sets the given name of this temp crew details.
	*
	* @param givenName the given name of this temp crew details
	*/
	@Override
	public void setGivenName(java.lang.String givenName) {
		_tempCrewDetails.setGivenName(givenName);
	}

	/**
	* Returns the rank code of this temp crew details.
	*
	* @return the rank code of this temp crew details
	*/
	@Override
	public java.lang.String getRankCode() {
		return _tempCrewDetails.getRankCode();
	}

	/**
	* Sets the rank code of this temp crew details.
	*
	* @param rankCode the rank code of this temp crew details
	*/
	@Override
	public void setRankCode(java.lang.String rankCode) {
		_tempCrewDetails.setRankCode(rankCode);
	}

	/**
	* Returns the nationality of this temp crew details.
	*
	* @return the nationality of this temp crew details
	*/
	@Override
	public java.lang.String getNationality() {
		return _tempCrewDetails.getNationality();
	}

	/**
	* Sets the nationality of this temp crew details.
	*
	* @param nationality the nationality of this temp crew details
	*/
	@Override
	public void setNationality(java.lang.String nationality) {
		_tempCrewDetails.setNationality(nationality);
	}

	/**
	* Returns the date of birth of this temp crew details.
	*
	* @return the date of birth of this temp crew details
	*/
	@Override
	public java.util.Date getDateOfBirth() {
		return _tempCrewDetails.getDateOfBirth();
	}

	/**
	* Sets the date of birth of this temp crew details.
	*
	* @param dateOfBirth the date of birth of this temp crew details
	*/
	@Override
	public void setDateOfBirth(java.util.Date dateOfBirth) {
		_tempCrewDetails.setDateOfBirth(dateOfBirth);
	}

	/**
	* Returns the place of birth of this temp crew details.
	*
	* @return the place of birth of this temp crew details
	*/
	@Override
	public java.lang.String getPlaceOfBirth() {
		return _tempCrewDetails.getPlaceOfBirth();
	}

	/**
	* Sets the place of birth of this temp crew details.
	*
	* @param placeOfBirth the place of birth of this temp crew details
	*/
	@Override
	public void setPlaceOfBirth(java.lang.String placeOfBirth) {
		_tempCrewDetails.setPlaceOfBirth(placeOfBirth);
	}

	/**
	* Returns the passport number of this temp crew details.
	*
	* @return the passport number of this temp crew details
	*/
	@Override
	public java.lang.String getPassportNumber() {
		return _tempCrewDetails.getPassportNumber();
	}

	/**
	* Sets the passport number of this temp crew details.
	*
	* @param passportNumber the passport number of this temp crew details
	*/
	@Override
	public void setPassportNumber(java.lang.String passportNumber) {
		_tempCrewDetails.setPassportNumber(passportNumber);
	}

	/**
	* Returns the passport type code of this temp crew details.
	*
	* @return the passport type code of this temp crew details
	*/
	@Override
	public java.lang.String getPassportTypeCode() {
		return _tempCrewDetails.getPassportTypeCode();
	}

	/**
	* Sets the passport type code of this temp crew details.
	*
	* @param passportTypeCode the passport type code of this temp crew details
	*/
	@Override
	public void setPassportTypeCode(java.lang.String passportTypeCode) {
		_tempCrewDetails.setPassportTypeCode(passportTypeCode);
	}

	@Override
	public boolean isNew() {
		return _tempCrewDetails.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tempCrewDetails.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tempCrewDetails.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tempCrewDetails.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tempCrewDetails.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tempCrewDetails.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tempCrewDetails.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tempCrewDetails.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tempCrewDetails.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tempCrewDetails.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tempCrewDetails.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TempCrewDetailsWrapper((TempCrewDetails)_tempCrewDetails.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.TempCrewDetails tempCrewDetails) {
		return _tempCrewDetails.compareTo(tempCrewDetails);
	}

	@Override
	public int hashCode() {
		return _tempCrewDetails.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.TempCrewDetails> toCacheModel() {
		return _tempCrewDetails.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempCrewDetails toEscapedModel() {
		return new TempCrewDetailsWrapper(_tempCrewDetails.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempCrewDetails toUnescapedModel() {
		return new TempCrewDetailsWrapper(_tempCrewDetails.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tempCrewDetails.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tempCrewDetails.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempCrewDetails.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TempCrewDetailsWrapper)) {
			return false;
		}

		TempCrewDetailsWrapper tempCrewDetailsWrapper = (TempCrewDetailsWrapper)obj;

		if (Validator.equals(_tempCrewDetails,
					tempCrewDetailsWrapper._tempCrewDetails)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TempCrewDetails getWrappedTempCrewDetails() {
		return _tempCrewDetails;
	}

	@Override
	public TempCrewDetails getWrappedModel() {
		return _tempCrewDetails;
	}

	@Override
	public void resetOriginalValues() {
		_tempCrewDetails.resetOriginalValues();
	}

	private TempCrewDetails _tempCrewDetails;
}