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

package vn.dtt.duongbo.dao.common.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DmDataVersion}.
 * </p>
 *
 * @author win_64
 * @see DmDataVersion
 * @generated
 */
public class DmDataVersionWrapper implements DmDataVersion,
	ModelWrapper<DmDataVersion> {
	public DmDataVersionWrapper(DmDataVersion dmDataVersion) {
		_dmDataVersion = dmDataVersion;
	}

	@Override
	public Class<?> getModelClass() {
		return DmDataVersion.class;
	}

	@Override
	public String getModelClassName() {
		return DmDataVersion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("dataGroupId", getDataGroupId());
		attributes.put("version", getVersion());
		attributes.put("issuedTime", getIssuedTime());
		attributes.put("validateDFrom", getValidateDFrom());
		attributes.put("validatedTo", getValidatedTo());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long dataGroupId = (Long)attributes.get("dataGroupId");

		if (dataGroupId != null) {
			setDataGroupId(dataGroupId);
		}

		String version = (String)attributes.get("version");

		if (version != null) {
			setVersion(version);
		}

		Date issuedTime = (Date)attributes.get("issuedTime");

		if (issuedTime != null) {
			setIssuedTime(issuedTime);
		}

		Date validateDFrom = (Date)attributes.get("validateDFrom");

		if (validateDFrom != null) {
			setValidateDFrom(validateDFrom);
		}

		Date validatedTo = (Date)attributes.get("validatedTo");

		if (validatedTo != null) {
			setValidatedTo(validatedTo);
		}
	}

	/**
	* Returns the primary key of this dm data version.
	*
	* @return the primary key of this dm data version
	*/
	@Override
	public long getPrimaryKey() {
		return _dmDataVersion.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm data version.
	*
	* @param primaryKey the primary key of this dm data version
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dmDataVersion.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm data version.
	*
	* @return the ID of this dm data version
	*/
	@Override
	public long getId() {
		return _dmDataVersion.getId();
	}

	/**
	* Sets the ID of this dm data version.
	*
	* @param id the ID of this dm data version
	*/
	@Override
	public void setId(long id) {
		_dmDataVersion.setId(id);
	}

	/**
	* Returns the data group ID of this dm data version.
	*
	* @return the data group ID of this dm data version
	*/
	@Override
	public long getDataGroupId() {
		return _dmDataVersion.getDataGroupId();
	}

	/**
	* Sets the data group ID of this dm data version.
	*
	* @param dataGroupId the data group ID of this dm data version
	*/
	@Override
	public void setDataGroupId(long dataGroupId) {
		_dmDataVersion.setDataGroupId(dataGroupId);
	}

	/**
	* Returns the version of this dm data version.
	*
	* @return the version of this dm data version
	*/
	@Override
	public java.lang.String getVersion() {
		return _dmDataVersion.getVersion();
	}

	/**
	* Sets the version of this dm data version.
	*
	* @param version the version of this dm data version
	*/
	@Override
	public void setVersion(java.lang.String version) {
		_dmDataVersion.setVersion(version);
	}

	/**
	* Returns the issued time of this dm data version.
	*
	* @return the issued time of this dm data version
	*/
	@Override
	public java.util.Date getIssuedTime() {
		return _dmDataVersion.getIssuedTime();
	}

	/**
	* Sets the issued time of this dm data version.
	*
	* @param issuedTime the issued time of this dm data version
	*/
	@Override
	public void setIssuedTime(java.util.Date issuedTime) {
		_dmDataVersion.setIssuedTime(issuedTime);
	}

	/**
	* Returns the validate d from of this dm data version.
	*
	* @return the validate d from of this dm data version
	*/
	@Override
	public java.util.Date getValidateDFrom() {
		return _dmDataVersion.getValidateDFrom();
	}

	/**
	* Sets the validate d from of this dm data version.
	*
	* @param validateDFrom the validate d from of this dm data version
	*/
	@Override
	public void setValidateDFrom(java.util.Date validateDFrom) {
		_dmDataVersion.setValidateDFrom(validateDFrom);
	}

	/**
	* Returns the validated to of this dm data version.
	*
	* @return the validated to of this dm data version
	*/
	@Override
	public java.util.Date getValidatedTo() {
		return _dmDataVersion.getValidatedTo();
	}

	/**
	* Sets the validated to of this dm data version.
	*
	* @param validatedTo the validated to of this dm data version
	*/
	@Override
	public void setValidatedTo(java.util.Date validatedTo) {
		_dmDataVersion.setValidatedTo(validatedTo);
	}

	@Override
	public boolean isNew() {
		return _dmDataVersion.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmDataVersion.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmDataVersion.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmDataVersion.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmDataVersion.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmDataVersion.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmDataVersion.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmDataVersion.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmDataVersion.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmDataVersion.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmDataVersion.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmDataVersionWrapper((DmDataVersion)_dmDataVersion.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.common.model.DmDataVersion dmDataVersion) {
		return _dmDataVersion.compareTo(dmDataVersion);
	}

	@Override
	public int hashCode() {
		return _dmDataVersion.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.common.model.DmDataVersion> toCacheModel() {
		return _dmDataVersion.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.DmDataVersion toEscapedModel() {
		return new DmDataVersionWrapper(_dmDataVersion.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.DmDataVersion toUnescapedModel() {
		return new DmDataVersionWrapper(_dmDataVersion.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmDataVersion.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmDataVersion.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmDataVersion.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmDataVersionWrapper)) {
			return false;
		}

		DmDataVersionWrapper dmDataVersionWrapper = (DmDataVersionWrapper)obj;

		if (Validator.equals(_dmDataVersion, dmDataVersionWrapper._dmDataVersion)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmDataVersion getWrappedDmDataVersion() {
		return _dmDataVersion;
	}

	@Override
	public DmDataVersion getWrappedModel() {
		return _dmDataVersion;
	}

	@Override
	public void resetOriginalValues() {
		_dmDataVersion.resetOriginalValues();
	}

	private DmDataVersion _dmDataVersion;
}