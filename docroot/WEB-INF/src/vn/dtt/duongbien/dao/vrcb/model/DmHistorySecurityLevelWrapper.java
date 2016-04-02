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
 * This class is a wrapper for {@link DmHistorySecurityLevel}.
 * </p>
 *
 * @author longdm
 * @see DmHistorySecurityLevel
 * @generated
 */
public class DmHistorySecurityLevelWrapper implements DmHistorySecurityLevel,
	ModelWrapper<DmHistorySecurityLevel> {
	public DmHistorySecurityLevelWrapper(
		DmHistorySecurityLevel dmHistorySecurityLevel) {
		_dmHistorySecurityLevel = dmHistorySecurityLevel;
	}

	@Override
	public Class<?> getModelClass() {
		return DmHistorySecurityLevel.class;
	}

	@Override
	public String getModelClassName() {
		return DmHistorySecurityLevel.class.getName();
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
	* Returns the primary key of this dm history security level.
	*
	* @return the primary key of this dm history security level
	*/
	@Override
	public int getPrimaryKey() {
		return _dmHistorySecurityLevel.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm history security level.
	*
	* @param primaryKey the primary key of this dm history security level
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_dmHistorySecurityLevel.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm history security level.
	*
	* @return the ID of this dm history security level
	*/
	@Override
	public int getId() {
		return _dmHistorySecurityLevel.getId();
	}

	/**
	* Sets the ID of this dm history security level.
	*
	* @param id the ID of this dm history security level
	*/
	@Override
	public void setId(int id) {
		_dmHistorySecurityLevel.setId(id);
	}

	/**
	* Returns the security level code of this dm history security level.
	*
	* @return the security level code of this dm history security level
	*/
	@Override
	public java.lang.String getSecurityLevelCode() {
		return _dmHistorySecurityLevel.getSecurityLevelCode();
	}

	/**
	* Sets the security level code of this dm history security level.
	*
	* @param securityLevelCode the security level code of this dm history security level
	*/
	@Override
	public void setSecurityLevelCode(java.lang.String securityLevelCode) {
		_dmHistorySecurityLevel.setSecurityLevelCode(securityLevelCode);
	}

	/**
	* Returns the security level of this dm history security level.
	*
	* @return the security level of this dm history security level
	*/
	@Override
	public java.lang.String getSecurityLevel() {
		return _dmHistorySecurityLevel.getSecurityLevel();
	}

	/**
	* Sets the security level of this dm history security level.
	*
	* @param securityLevel the security level of this dm history security level
	*/
	@Override
	public void setSecurityLevel(java.lang.String securityLevel) {
		_dmHistorySecurityLevel.setSecurityLevel(securityLevel);
	}

	/**
	* Returns the security level name of this dm history security level.
	*
	* @return the security level name of this dm history security level
	*/
	@Override
	public java.lang.String getSecurityLevelName() {
		return _dmHistorySecurityLevel.getSecurityLevelName();
	}

	/**
	* Sets the security level name of this dm history security level.
	*
	* @param securityLevelName the security level name of this dm history security level
	*/
	@Override
	public void setSecurityLevelName(java.lang.String securityLevelName) {
		_dmHistorySecurityLevel.setSecurityLevelName(securityLevelName);
	}

	/**
	* Returns the is delete of this dm history security level.
	*
	* @return the is delete of this dm history security level
	*/
	@Override
	public int getIsDelete() {
		return _dmHistorySecurityLevel.getIsDelete();
	}

	/**
	* Sets the is delete of this dm history security level.
	*
	* @param isDelete the is delete of this dm history security level
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmHistorySecurityLevel.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm history security level.
	*
	* @return the marked as delete of this dm history security level
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmHistorySecurityLevel.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm history security level.
	*
	* @param markedAsDelete the marked as delete of this dm history security level
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmHistorySecurityLevel.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm history security level.
	*
	* @return the modified date of this dm history security level
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmHistorySecurityLevel.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm history security level.
	*
	* @param modifiedDate the modified date of this dm history security level
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmHistorySecurityLevel.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm history security level.
	*
	* @return the requested date of this dm history security level
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmHistorySecurityLevel.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm history security level.
	*
	* @param requestedDate the requested date of this dm history security level
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmHistorySecurityLevel.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm history security level.
	*
	* @return the sync version of this dm history security level
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmHistorySecurityLevel.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm history security level.
	*
	* @param syncVersion the sync version of this dm history security level
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmHistorySecurityLevel.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmHistorySecurityLevel.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmHistorySecurityLevel.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmHistorySecurityLevel.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmHistorySecurityLevel.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmHistorySecurityLevel.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmHistorySecurityLevel.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmHistorySecurityLevel.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmHistorySecurityLevel.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmHistorySecurityLevel.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmHistorySecurityLevel.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmHistorySecurityLevel.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmHistorySecurityLevelWrapper((DmHistorySecurityLevel)_dmHistorySecurityLevel.clone());
	}

	@Override
	public int compareTo(DmHistorySecurityLevel dmHistorySecurityLevel) {
		return _dmHistorySecurityLevel.compareTo(dmHistorySecurityLevel);
	}

	@Override
	public int hashCode() {
		return _dmHistorySecurityLevel.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<DmHistorySecurityLevel> toCacheModel() {
		return _dmHistorySecurityLevel.toCacheModel();
	}

	@Override
	public DmHistorySecurityLevel toEscapedModel() {
		return new DmHistorySecurityLevelWrapper(_dmHistorySecurityLevel.toEscapedModel());
	}

	@Override
	public DmHistorySecurityLevel toUnescapedModel() {
		return new DmHistorySecurityLevelWrapper(_dmHistorySecurityLevel.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmHistorySecurityLevel.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmHistorySecurityLevel.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmHistorySecurityLevel.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmHistorySecurityLevelWrapper)) {
			return false;
		}

		DmHistorySecurityLevelWrapper dmHistorySecurityLevelWrapper = (DmHistorySecurityLevelWrapper)obj;

		if (Validator.equals(_dmHistorySecurityLevel,
					dmHistorySecurityLevelWrapper._dmHistorySecurityLevel)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmHistorySecurityLevel getWrappedDmHistorySecurityLevel() {
		return _dmHistorySecurityLevel;
	}

	@Override
	public DmHistorySecurityLevel getWrappedModel() {
		return _dmHistorySecurityLevel;
	}

	@Override
	public void resetOriginalValues() {
		_dmHistorySecurityLevel.resetOriginalValues();
	}

	private DmHistorySecurityLevel _dmHistorySecurityLevel;
}