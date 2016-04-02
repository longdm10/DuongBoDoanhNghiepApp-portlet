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
 * This class is a wrapper for {@link CrewList}.
 * </p>
 *
 * @author longdm
 * @see CrewList
 * @generated
 */
public class CrewListWrapper implements CrewList, ModelWrapper<CrewList> {
	public CrewListWrapper(CrewList crewList) {
		_crewList = crewList;
	}

	@Override
	public Class<?> getModelClass() {
		return CrewList.class;
	}

	@Override
	public String getModelClassName() {
		return CrewList.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("crewCode", getCrewCode());
		attributes.put("documentNo", getDocumentNo());
		attributes.put("stateCode", getStateCode());
		attributes.put("birthDay", getBirthDay());
		attributes.put("birthPlace", getBirthPlace());
		attributes.put("familyName", getFamilyName());
		attributes.put("fullName", getFullName());
		attributes.put("givenName", getGivenName());
		attributes.put("passportNumber", getPassportNumber());
		attributes.put("passportType", getPassportType());
		attributes.put("rankCode", getRankCode());
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

		String crewCode = (String)attributes.get("crewCode");

		if (crewCode != null) {
			setCrewCode(crewCode);
		}

		String documentNo = (String)attributes.get("documentNo");

		if (documentNo != null) {
			setDocumentNo(documentNo);
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

		String familyName = (String)attributes.get("familyName");

		if (familyName != null) {
			setFamilyName(familyName);
		}

		String fullName = (String)attributes.get("fullName");

		if (fullName != null) {
			setFullName(fullName);
		}

		String givenName = (String)attributes.get("givenName");

		if (givenName != null) {
			setGivenName(givenName);
		}

		String passportNumber = (String)attributes.get("passportNumber");

		if (passportNumber != null) {
			setPassportNumber(passportNumber);
		}

		String passportType = (String)attributes.get("passportType");

		if (passportType != null) {
			setPassportType(passportType);
		}

		String rankCode = (String)attributes.get("rankCode");

		if (rankCode != null) {
			setRankCode(rankCode);
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
	* Returns the primary key of this crew list.
	*
	* @return the primary key of this crew list
	*/
	@Override
	public long getPrimaryKey() {
		return _crewList.getPrimaryKey();
	}

	/**
	* Sets the primary key of this crew list.
	*
	* @param primaryKey the primary key of this crew list
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_crewList.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this crew list.
	*
	* @return the ID of this crew list
	*/
	@Override
	public long getId() {
		return _crewList.getId();
	}

	/**
	* Sets the ID of this crew list.
	*
	* @param id the ID of this crew list
	*/
	@Override
	public void setId(long id) {
		_crewList.setId(id);
	}

	/**
	* Returns the crew code of this crew list.
	*
	* @return the crew code of this crew list
	*/
	@Override
	public java.lang.String getCrewCode() {
		return _crewList.getCrewCode();
	}

	/**
	* Sets the crew code of this crew list.
	*
	* @param crewCode the crew code of this crew list
	*/
	@Override
	public void setCrewCode(java.lang.String crewCode) {
		_crewList.setCrewCode(crewCode);
	}

	/**
	* Returns the document no of this crew list.
	*
	* @return the document no of this crew list
	*/
	@Override
	public java.lang.String getDocumentNo() {
		return _crewList.getDocumentNo();
	}

	/**
	* Sets the document no of this crew list.
	*
	* @param documentNo the document no of this crew list
	*/
	@Override
	public void setDocumentNo(java.lang.String documentNo) {
		_crewList.setDocumentNo(documentNo);
	}

	/**
	* Returns the state code of this crew list.
	*
	* @return the state code of this crew list
	*/
	@Override
	public java.lang.String getStateCode() {
		return _crewList.getStateCode();
	}

	/**
	* Sets the state code of this crew list.
	*
	* @param stateCode the state code of this crew list
	*/
	@Override
	public void setStateCode(java.lang.String stateCode) {
		_crewList.setStateCode(stateCode);
	}

	/**
	* Returns the birth day of this crew list.
	*
	* @return the birth day of this crew list
	*/
	@Override
	public java.util.Date getBirthDay() {
		return _crewList.getBirthDay();
	}

	/**
	* Sets the birth day of this crew list.
	*
	* @param birthDay the birth day of this crew list
	*/
	@Override
	public void setBirthDay(java.util.Date birthDay) {
		_crewList.setBirthDay(birthDay);
	}

	/**
	* Returns the birth place of this crew list.
	*
	* @return the birth place of this crew list
	*/
	@Override
	public java.lang.String getBirthPlace() {
		return _crewList.getBirthPlace();
	}

	/**
	* Sets the birth place of this crew list.
	*
	* @param birthPlace the birth place of this crew list
	*/
	@Override
	public void setBirthPlace(java.lang.String birthPlace) {
		_crewList.setBirthPlace(birthPlace);
	}

	/**
	* Returns the family name of this crew list.
	*
	* @return the family name of this crew list
	*/
	@Override
	public java.lang.String getFamilyName() {
		return _crewList.getFamilyName();
	}

	/**
	* Sets the family name of this crew list.
	*
	* @param familyName the family name of this crew list
	*/
	@Override
	public void setFamilyName(java.lang.String familyName) {
		_crewList.setFamilyName(familyName);
	}

	/**
	* Returns the full name of this crew list.
	*
	* @return the full name of this crew list
	*/
	@Override
	public java.lang.String getFullName() {
		return _crewList.getFullName();
	}

	/**
	* Sets the full name of this crew list.
	*
	* @param fullName the full name of this crew list
	*/
	@Override
	public void setFullName(java.lang.String fullName) {
		_crewList.setFullName(fullName);
	}

	/**
	* Returns the given name of this crew list.
	*
	* @return the given name of this crew list
	*/
	@Override
	public java.lang.String getGivenName() {
		return _crewList.getGivenName();
	}

	/**
	* Sets the given name of this crew list.
	*
	* @param givenName the given name of this crew list
	*/
	@Override
	public void setGivenName(java.lang.String givenName) {
		_crewList.setGivenName(givenName);
	}

	/**
	* Returns the passport number of this crew list.
	*
	* @return the passport number of this crew list
	*/
	@Override
	public java.lang.String getPassportNumber() {
		return _crewList.getPassportNumber();
	}

	/**
	* Sets the passport number of this crew list.
	*
	* @param passportNumber the passport number of this crew list
	*/
	@Override
	public void setPassportNumber(java.lang.String passportNumber) {
		_crewList.setPassportNumber(passportNumber);
	}

	/**
	* Returns the passport type of this crew list.
	*
	* @return the passport type of this crew list
	*/
	@Override
	public java.lang.String getPassportType() {
		return _crewList.getPassportType();
	}

	/**
	* Sets the passport type of this crew list.
	*
	* @param passportType the passport type of this crew list
	*/
	@Override
	public void setPassportType(java.lang.String passportType) {
		_crewList.setPassportType(passportType);
	}

	/**
	* Returns the rank code of this crew list.
	*
	* @return the rank code of this crew list
	*/
	@Override
	public java.lang.String getRankCode() {
		return _crewList.getRankCode();
	}

	/**
	* Sets the rank code of this crew list.
	*
	* @param rankCode the rank code of this crew list
	*/
	@Override
	public void setRankCode(java.lang.String rankCode) {
		_crewList.setRankCode(rankCode);
	}

	/**
	* Returns the create date of this crew list.
	*
	* @return the create date of this crew list
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _crewList.getCreateDate();
	}

	/**
	* Sets the create date of this crew list.
	*
	* @param createDate the create date of this crew list
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_crewList.setCreateDate(createDate);
	}

	/**
	* Returns the modify date of this crew list.
	*
	* @return the modify date of this crew list
	*/
	@Override
	public java.util.Date getModifyDate() {
		return _crewList.getModifyDate();
	}

	/**
	* Sets the modify date of this crew list.
	*
	* @param modifyDate the modify date of this crew list
	*/
	@Override
	public void setModifyDate(java.util.Date modifyDate) {
		_crewList.setModifyDate(modifyDate);
	}

	@Override
	public boolean isNew() {
		return _crewList.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_crewList.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _crewList.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_crewList.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _crewList.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _crewList.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_crewList.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _crewList.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_crewList.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_crewList.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_crewList.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CrewListWrapper((CrewList)_crewList.clone());
	}

	@Override
	public int compareTo(CrewList crewList) {
		return _crewList.compareTo(crewList);
	}

	@Override
	public int hashCode() {
		return _crewList.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<CrewList> toCacheModel() {
		return _crewList.toCacheModel();
	}

	@Override
	public CrewList toEscapedModel() {
		return new CrewListWrapper(_crewList.toEscapedModel());
	}

	@Override
	public CrewList toUnescapedModel() {
		return new CrewListWrapper(_crewList.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _crewList.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _crewList.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_crewList.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CrewListWrapper)) {
			return false;
		}

		CrewListWrapper crewListWrapper = (CrewListWrapper)obj;

		if (Validator.equals(_crewList, crewListWrapper._crewList)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CrewList getWrappedCrewList() {
		return _crewList;
	}

	@Override
	public CrewList getWrappedModel() {
		return _crewList;
	}

	@Override
	public void resetOriginalValues() {
		_crewList.resetOriginalValues();
	}

	private CrewList _crewList;
}