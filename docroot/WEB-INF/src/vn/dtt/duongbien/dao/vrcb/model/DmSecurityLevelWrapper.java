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
 * This class is a wrapper for {@link DmSecurityLevel}.
 * </p>
 *
 * @author longdm
 * @see DmSecurityLevel
 * @generated
 */
public class DmSecurityLevelWrapper implements DmSecurityLevel,
	ModelWrapper<DmSecurityLevel> {
	public DmSecurityLevelWrapper(DmSecurityLevel dmSecurityLevel) {
		_dmSecurityLevel = dmSecurityLevel;
	}

	@Override
	public Class<?> getModelClass() {
		return DmSecurityLevel.class;
	}

	@Override
	public String getModelClassName() {
		return DmSecurityLevel.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("securityLevelCode", getSecurityLevelCode());
		attributes.put("securityLevel", getSecurityLevel());
		attributes.put("securityLevelName", getSecurityLevelName());
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

		String securityLevelCode = (String)attributes.get("securityLevelCode");

		if (securityLevelCode != null) {
			setSecurityLevelCode(securityLevelCode);
		}

		String securityLevel = (String)attributes.get("securityLevel");

		if (securityLevel != null) {
			setSecurityLevel(securityLevel);
		}

		String securityLevelName = (String)attributes.get("securityLevelName");

		if (securityLevelName != null) {
			setSecurityLevelName(securityLevelName);
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
	* Returns the primary key of this dm security level.
	*
	* @return the primary key of this dm security level
	*/
	@Override
	public int getPrimaryKey() {
		return _dmSecurityLevel.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm security level.
	*
	* @param primaryKey the primary key of this dm security level
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_dmSecurityLevel.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm security level.
	*
	* @return the ID of this dm security level
	*/
	@Override
	public int getId() {
		return _dmSecurityLevel.getId();
	}

	/**
	* Sets the ID of this dm security level.
	*
	* @param id the ID of this dm security level
	*/
	@Override
	public void setId(int id) {
		_dmSecurityLevel.setId(id);
	}

	/**
	* Returns the security level code of this dm security level.
	*
	* @return the security level code of this dm security level
	*/
	@Override
	public java.lang.String getSecurityLevelCode() {
		return _dmSecurityLevel.getSecurityLevelCode();
	}

	/**
	* Sets the security level code of this dm security level.
	*
	* @param securityLevelCode the security level code of this dm security level
	*/
	@Override
	public void setSecurityLevelCode(java.lang.String securityLevelCode) {
		_dmSecurityLevel.setSecurityLevelCode(securityLevelCode);
	}

	/**
	* Returns the security level of this dm security level.
	*
	* @return the security level of this dm security level
	*/
	@Override
	public java.lang.String getSecurityLevel() {
		return _dmSecurityLevel.getSecurityLevel();
	}

	/**
	* Sets the security level of this dm security level.
	*
	* @param securityLevel the security level of this dm security level
	*/
	@Override
	public void setSecurityLevel(java.lang.String securityLevel) {
		_dmSecurityLevel.setSecurityLevel(securityLevel);
	}

	/**
	* Returns the security level name of this dm security level.
	*
	* @return the security level name of this dm security level
	*/
	@Override
	public java.lang.String getSecurityLevelName() {
		return _dmSecurityLevel.getSecurityLevelName();
	}

	/**
	* Sets the security level name of this dm security level.
	*
	* @param securityLevelName the security level name of this dm security level
	*/
	@Override
	public void setSecurityLevelName(java.lang.String securityLevelName) {
		_dmSecurityLevel.setSecurityLevelName(securityLevelName);
	}

	/**
	* Returns the is delete of this dm security level.
	*
	* @return the is delete of this dm security level
	*/
	@Override
	public int getIsDelete() {
		return _dmSecurityLevel.getIsDelete();
	}

	/**
	* Sets the is delete of this dm security level.
	*
	* @param isDelete the is delete of this dm security level
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmSecurityLevel.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm security level.
	*
	* @return the marked as delete of this dm security level
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmSecurityLevel.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm security level.
	*
	* @param markedAsDelete the marked as delete of this dm security level
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmSecurityLevel.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm security level.
	*
	* @return the modified date of this dm security level
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmSecurityLevel.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm security level.
	*
	* @param modifiedDate the modified date of this dm security level
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmSecurityLevel.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm security level.
	*
	* @return the requested date of this dm security level
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmSecurityLevel.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm security level.
	*
	* @param requestedDate the requested date of this dm security level
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmSecurityLevel.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm security level.
	*
	* @return the sync version of this dm security level
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmSecurityLevel.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm security level.
	*
	* @param syncVersion the sync version of this dm security level
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmSecurityLevel.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmSecurityLevel.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmSecurityLevel.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmSecurityLevel.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmSecurityLevel.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmSecurityLevel.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmSecurityLevel.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmSecurityLevel.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmSecurityLevel.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmSecurityLevel.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmSecurityLevel.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmSecurityLevel.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmSecurityLevelWrapper((DmSecurityLevel)_dmSecurityLevel.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.DmSecurityLevel dmSecurityLevel) {
		return _dmSecurityLevel.compareTo(dmSecurityLevel);
	}

	@Override
	public int hashCode() {
		return _dmSecurityLevel.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.DmSecurityLevel> toCacheModel() {
		return _dmSecurityLevel.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmSecurityLevel toEscapedModel() {
		return new DmSecurityLevelWrapper(_dmSecurityLevel.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmSecurityLevel toUnescapedModel() {
		return new DmSecurityLevelWrapper(_dmSecurityLevel.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmSecurityLevel.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmSecurityLevel.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmSecurityLevel.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmSecurityLevelWrapper)) {
			return false;
		}

		DmSecurityLevelWrapper dmSecurityLevelWrapper = (DmSecurityLevelWrapper)obj;

		if (Validator.equals(_dmSecurityLevel,
					dmSecurityLevelWrapper._dmSecurityLevel)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmSecurityLevel getWrappedDmSecurityLevel() {
		return _dmSecurityLevel;
	}

	@Override
	public DmSecurityLevel getWrappedModel() {
		return _dmSecurityLevel;
	}

	@Override
	public void resetOriginalValues() {
		_dmSecurityLevel.resetOriginalValues();
	}

	private DmSecurityLevel _dmSecurityLevel;
}