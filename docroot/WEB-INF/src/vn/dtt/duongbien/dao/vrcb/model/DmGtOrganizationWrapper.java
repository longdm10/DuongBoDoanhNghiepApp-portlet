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
 * This class is a wrapper for {@link DmGtOrganization}.
 * </p>
 *
 * @author longdm
 * @see DmGtOrganization
 * @generated
 */
public class DmGtOrganizationWrapper implements DmGtOrganization,
	ModelWrapper<DmGtOrganization> {
	public DmGtOrganizationWrapper(DmGtOrganization dmGtOrganization) {
		_dmGtOrganization = dmGtOrganization;
	}

	@Override
	public Class<?> getModelClass() {
		return DmGtOrganization.class;
	}

	@Override
	public String getModelClassName() {
		return DmGtOrganization.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("organizationCode", getOrganizationCode());
		attributes.put("organizationName", getOrganizationName());
		attributes.put("organizationNameVN", getOrganizationNameVN());
		attributes.put("organizationorder", getOrganizationorder());
		attributes.put("isDelete", getIsDelete());
		attributes.put("markedAsDelete", getMarkedAsDelete());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("requestedDate", getRequestedDate());
		attributes.put("syncVersion", getSyncVersion());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String organizationCode = (String)attributes.get("organizationCode");

		if (organizationCode != null) {
			setOrganizationCode(organizationCode);
		}

		String organizationName = (String)attributes.get("organizationName");

		if (organizationName != null) {
			setOrganizationName(organizationName);
		}

		String organizationNameVN = (String)attributes.get("organizationNameVN");

		if (organizationNameVN != null) {
			setOrganizationNameVN(organizationNameVN);
		}

		Integer organizationorder = (Integer)attributes.get("organizationorder");

		if (organizationorder != null) {
			setOrganizationorder(organizationorder);
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
	* Returns the primary key of this dm gt organization.
	*
	* @return the primary key of this dm gt organization
	*/
	@Override
	public long getPrimaryKey() {
		return _dmGtOrganization.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm gt organization.
	*
	* @param primaryKey the primary key of this dm gt organization
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dmGtOrganization.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm gt organization.
	*
	* @return the ID of this dm gt organization
	*/
	@Override
	public long getId() {
		return _dmGtOrganization.getId();
	}

	/**
	* Sets the ID of this dm gt organization.
	*
	* @param id the ID of this dm gt organization
	*/
	@Override
	public void setId(long id) {
		_dmGtOrganization.setId(id);
	}

	/**
	* Returns the organization code of this dm gt organization.
	*
	* @return the organization code of this dm gt organization
	*/
	@Override
	public java.lang.String getOrganizationCode() {
		return _dmGtOrganization.getOrganizationCode();
	}

	/**
	* Sets the organization code of this dm gt organization.
	*
	* @param organizationCode the organization code of this dm gt organization
	*/
	@Override
	public void setOrganizationCode(java.lang.String organizationCode) {
		_dmGtOrganization.setOrganizationCode(organizationCode);
	}

	/**
	* Returns the organization name of this dm gt organization.
	*
	* @return the organization name of this dm gt organization
	*/
	@Override
	public java.lang.String getOrganizationName() {
		return _dmGtOrganization.getOrganizationName();
	}

	/**
	* Sets the organization name of this dm gt organization.
	*
	* @param organizationName the organization name of this dm gt organization
	*/
	@Override
	public void setOrganizationName(java.lang.String organizationName) {
		_dmGtOrganization.setOrganizationName(organizationName);
	}

	/**
	* Returns the organization name v n of this dm gt organization.
	*
	* @return the organization name v n of this dm gt organization
	*/
	@Override
	public java.lang.String getOrganizationNameVN() {
		return _dmGtOrganization.getOrganizationNameVN();
	}

	/**
	* Sets the organization name v n of this dm gt organization.
	*
	* @param organizationNameVN the organization name v n of this dm gt organization
	*/
	@Override
	public void setOrganizationNameVN(java.lang.String organizationNameVN) {
		_dmGtOrganization.setOrganizationNameVN(organizationNameVN);
	}

	/**
	* Returns the organizationorder of this dm gt organization.
	*
	* @return the organizationorder of this dm gt organization
	*/
	@Override
	public int getOrganizationorder() {
		return _dmGtOrganization.getOrganizationorder();
	}

	/**
	* Sets the organizationorder of this dm gt organization.
	*
	* @param organizationorder the organizationorder of this dm gt organization
	*/
	@Override
	public void setOrganizationorder(int organizationorder) {
		_dmGtOrganization.setOrganizationorder(organizationorder);
	}

	/**
	* Returns the is delete of this dm gt organization.
	*
	* @return the is delete of this dm gt organization
	*/
	@Override
	public int getIsDelete() {
		return _dmGtOrganization.getIsDelete();
	}

	/**
	* Sets the is delete of this dm gt organization.
	*
	* @param isDelete the is delete of this dm gt organization
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmGtOrganization.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm gt organization.
	*
	* @return the marked as delete of this dm gt organization
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmGtOrganization.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm gt organization.
	*
	* @param markedAsDelete the marked as delete of this dm gt organization
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmGtOrganization.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm gt organization.
	*
	* @return the modified date of this dm gt organization
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmGtOrganization.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm gt organization.
	*
	* @param modifiedDate the modified date of this dm gt organization
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmGtOrganization.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm gt organization.
	*
	* @return the requested date of this dm gt organization
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmGtOrganization.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm gt organization.
	*
	* @param requestedDate the requested date of this dm gt organization
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmGtOrganization.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm gt organization.
	*
	* @return the sync version of this dm gt organization
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmGtOrganization.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm gt organization.
	*
	* @param syncVersion the sync version of this dm gt organization
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmGtOrganization.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmGtOrganization.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmGtOrganization.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmGtOrganization.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmGtOrganization.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmGtOrganization.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmGtOrganization.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmGtOrganization.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmGtOrganization.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmGtOrganization.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmGtOrganization.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmGtOrganization.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmGtOrganizationWrapper((DmGtOrganization)_dmGtOrganization.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.DmGtOrganization dmGtOrganization) {
		return _dmGtOrganization.compareTo(dmGtOrganization);
	}

	@Override
	public int hashCode() {
		return _dmGtOrganization.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.DmGtOrganization> toCacheModel() {
		return _dmGtOrganization.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGtOrganization toEscapedModel() {
		return new DmGtOrganizationWrapper(_dmGtOrganization.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGtOrganization toUnescapedModel() {
		return new DmGtOrganizationWrapper(_dmGtOrganization.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmGtOrganization.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmGtOrganization.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmGtOrganization.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmGtOrganizationWrapper)) {
			return false;
		}

		DmGtOrganizationWrapper dmGtOrganizationWrapper = (DmGtOrganizationWrapper)obj;

		if (Validator.equals(_dmGtOrganization,
					dmGtOrganizationWrapper._dmGtOrganization)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmGtOrganization getWrappedDmGtOrganization() {
		return _dmGtOrganization;
	}

	@Override
	public DmGtOrganization getWrappedModel() {
		return _dmGtOrganization;
	}

	@Override
	public void resetOriginalValues() {
		_dmGtOrganization.resetOriginalValues();
	}

	private DmGtOrganization _dmGtOrganization;
}