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
 * This class is a wrapper for {@link DmGtStatus}.
 * </p>
 *
 * @author longdm
 * @see DmGtStatus
 * @generated
 */
public class DmGtStatusWrapper implements DmGtStatus, ModelWrapper<DmGtStatus> {
	public DmGtStatusWrapper(DmGtStatus dmGtStatus) {
		_dmGtStatus = dmGtStatus;
	}

	@Override
	public Class<?> getModelClass() {
		return DmGtStatus.class;
	}

	@Override
	public String getModelClassName() {
		return DmGtStatus.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("statusCode", getStatusCode());
		attributes.put("statusName", getStatusName());
		attributes.put("type", getType());
		attributes.put("description", getDescription());
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

		Integer statusCode = (Integer)attributes.get("statusCode");

		if (statusCode != null) {
			setStatusCode(statusCode);
		}

		String statusName = (String)attributes.get("statusName");

		if (statusName != null) {
			setStatusName(statusName);
		}

		Integer type = (Integer)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
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
	* Returns the primary key of this dm gt status.
	*
	* @return the primary key of this dm gt status
	*/
	@Override
	public long getPrimaryKey() {
		return _dmGtStatus.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm gt status.
	*
	* @param primaryKey the primary key of this dm gt status
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dmGtStatus.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm gt status.
	*
	* @return the ID of this dm gt status
	*/
	@Override
	public long getId() {
		return _dmGtStatus.getId();
	}

	/**
	* Sets the ID of this dm gt status.
	*
	* @param id the ID of this dm gt status
	*/
	@Override
	public void setId(long id) {
		_dmGtStatus.setId(id);
	}

	/**
	* Returns the status code of this dm gt status.
	*
	* @return the status code of this dm gt status
	*/
	@Override
	public int getStatusCode() {
		return _dmGtStatus.getStatusCode();
	}

	/**
	* Sets the status code of this dm gt status.
	*
	* @param statusCode the status code of this dm gt status
	*/
	@Override
	public void setStatusCode(int statusCode) {
		_dmGtStatus.setStatusCode(statusCode);
	}

	/**
	* Returns the status name of this dm gt status.
	*
	* @return the status name of this dm gt status
	*/
	@Override
	public java.lang.String getStatusName() {
		return _dmGtStatus.getStatusName();
	}

	/**
	* Sets the status name of this dm gt status.
	*
	* @param statusName the status name of this dm gt status
	*/
	@Override
	public void setStatusName(java.lang.String statusName) {
		_dmGtStatus.setStatusName(statusName);
	}

	/**
	* Returns the type of this dm gt status.
	*
	* @return the type of this dm gt status
	*/
	@Override
	public int getType() {
		return _dmGtStatus.getType();
	}

	/**
	* Sets the type of this dm gt status.
	*
	* @param type the type of this dm gt status
	*/
	@Override
	public void setType(int type) {
		_dmGtStatus.setType(type);
	}

	/**
	* Returns the description of this dm gt status.
	*
	* @return the description of this dm gt status
	*/
	@Override
	public java.lang.String getDescription() {
		return _dmGtStatus.getDescription();
	}

	/**
	* Sets the description of this dm gt status.
	*
	* @param description the description of this dm gt status
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_dmGtStatus.setDescription(description);
	}

	/**
	* Returns the is delete of this dm gt status.
	*
	* @return the is delete of this dm gt status
	*/
	@Override
	public int getIsDelete() {
		return _dmGtStatus.getIsDelete();
	}

	/**
	* Sets the is delete of this dm gt status.
	*
	* @param isDelete the is delete of this dm gt status
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmGtStatus.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm gt status.
	*
	* @return the marked as delete of this dm gt status
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmGtStatus.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm gt status.
	*
	* @param markedAsDelete the marked as delete of this dm gt status
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmGtStatus.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm gt status.
	*
	* @return the modified date of this dm gt status
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmGtStatus.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm gt status.
	*
	* @param modifiedDate the modified date of this dm gt status
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmGtStatus.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm gt status.
	*
	* @return the requested date of this dm gt status
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmGtStatus.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm gt status.
	*
	* @param requestedDate the requested date of this dm gt status
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmGtStatus.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm gt status.
	*
	* @return the sync version of this dm gt status
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmGtStatus.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm gt status.
	*
	* @param syncVersion the sync version of this dm gt status
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmGtStatus.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmGtStatus.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmGtStatus.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmGtStatus.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmGtStatus.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmGtStatus.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmGtStatus.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmGtStatus.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmGtStatus.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmGtStatus.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmGtStatus.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmGtStatus.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmGtStatusWrapper((DmGtStatus)_dmGtStatus.clone());
	}

	@Override
	public int compareTo(vn.dtt.duongbien.dao.vrcb.model.DmGtStatus dmGtStatus) {
		return _dmGtStatus.compareTo(dmGtStatus);
	}

	@Override
	public int hashCode() {
		return _dmGtStatus.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.DmGtStatus> toCacheModel() {
		return _dmGtStatus.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGtStatus toEscapedModel() {
		return new DmGtStatusWrapper(_dmGtStatus.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGtStatus toUnescapedModel() {
		return new DmGtStatusWrapper(_dmGtStatus.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmGtStatus.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmGtStatus.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmGtStatus.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmGtStatusWrapper)) {
			return false;
		}

		DmGtStatusWrapper dmGtStatusWrapper = (DmGtStatusWrapper)obj;

		if (Validator.equals(_dmGtStatus, dmGtStatusWrapper._dmGtStatus)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmGtStatus getWrappedDmGtStatus() {
		return _dmGtStatus;
	}

	@Override
	public DmGtStatus getWrappedModel() {
		return _dmGtStatus;
	}

	@Override
	public void resetOriginalValues() {
		_dmGtStatus.resetOriginalValues();
	}

	private DmGtStatus _dmGtStatus;
}