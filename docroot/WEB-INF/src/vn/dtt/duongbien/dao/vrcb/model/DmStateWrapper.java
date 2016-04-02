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
 * This class is a wrapper for {@link DmState}.
 * </p>
 *
 * @author longdm
 * @see DmState
 * @generated
 */
public class DmStateWrapper implements DmState, ModelWrapper<DmState> {
	public DmStateWrapper(DmState dmState) {
		_dmState = dmState;
	}

	@Override
	public Class<?> getModelClass() {
		return DmState.class;
	}

	@Override
	public String getModelClassName() {
		return DmState.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("stateCode", getStateCode());
		attributes.put("stateName", getStateName());
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
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String stateCode = (String)attributes.get("stateCode");

		if (stateCode != null) {
			setStateCode(stateCode);
		}

		String stateName = (String)attributes.get("stateName");

		if (stateName != null) {
			setStateName(stateName);
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
	* Returns the primary key of this dm state.
	*
	* @return the primary key of this dm state
	*/
	@Override
	public int getPrimaryKey() {
		return _dmState.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm state.
	*
	* @param primaryKey the primary key of this dm state
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_dmState.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm state.
	*
	* @return the ID of this dm state
	*/
	@Override
	public int getId() {
		return _dmState.getId();
	}

	/**
	* Sets the ID of this dm state.
	*
	* @param id the ID of this dm state
	*/
	@Override
	public void setId(int id) {
		_dmState.setId(id);
	}

	/**
	* Returns the state code of this dm state.
	*
	* @return the state code of this dm state
	*/
	@Override
	public java.lang.String getStateCode() {
		return _dmState.getStateCode();
	}

	/**
	* Sets the state code of this dm state.
	*
	* @param stateCode the state code of this dm state
	*/
	@Override
	public void setStateCode(java.lang.String stateCode) {
		_dmState.setStateCode(stateCode);
	}

	/**
	* Returns the state name of this dm state.
	*
	* @return the state name of this dm state
	*/
	@Override
	public java.lang.String getStateName() {
		return _dmState.getStateName();
	}

	/**
	* Sets the state name of this dm state.
	*
	* @param stateName the state name of this dm state
	*/
	@Override
	public void setStateName(java.lang.String stateName) {
		_dmState.setStateName(stateName);
	}

	/**
	* Returns the description of this dm state.
	*
	* @return the description of this dm state
	*/
	@Override
	public java.lang.String getDescription() {
		return _dmState.getDescription();
	}

	/**
	* Sets the description of this dm state.
	*
	* @param description the description of this dm state
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_dmState.setDescription(description);
	}

	/**
	* Returns the is delete of this dm state.
	*
	* @return the is delete of this dm state
	*/
	@Override
	public int getIsDelete() {
		return _dmState.getIsDelete();
	}

	/**
	* Sets the is delete of this dm state.
	*
	* @param isDelete the is delete of this dm state
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmState.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm state.
	*
	* @return the marked as delete of this dm state
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmState.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm state.
	*
	* @param markedAsDelete the marked as delete of this dm state
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmState.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm state.
	*
	* @return the modified date of this dm state
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmState.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm state.
	*
	* @param modifiedDate the modified date of this dm state
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmState.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm state.
	*
	* @return the requested date of this dm state
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmState.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm state.
	*
	* @param requestedDate the requested date of this dm state
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmState.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm state.
	*
	* @return the sync version of this dm state
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmState.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm state.
	*
	* @param syncVersion the sync version of this dm state
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmState.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmState.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmState.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmState.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmState.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmState.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmState.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmState.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmState.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmState.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmState.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmState.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmStateWrapper((DmState)_dmState.clone());
	}

	@Override
	public int compareTo(DmState dmState) {
		return _dmState.compareTo(dmState);
	}

	@Override
	public int hashCode() {
		return _dmState.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<DmState> toCacheModel() {
		return _dmState.toCacheModel();
	}

	@Override
	public DmState toEscapedModel() {
		return new DmStateWrapper(_dmState.toEscapedModel());
	}

	@Override
	public DmState toUnescapedModel() {
		return new DmStateWrapper(_dmState.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmState.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmState.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmState.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmStateWrapper)) {
			return false;
		}

		DmStateWrapper dmStateWrapper = (DmStateWrapper)obj;

		if (Validator.equals(_dmState, dmStateWrapper._dmState)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmState getWrappedDmState() {
		return _dmState;
	}

	@Override
	public DmState getWrappedModel() {
		return _dmState;
	}

	@Override
	public void resetOriginalValues() {
		_dmState.resetOriginalValues();
	}

	private DmState _dmState;
}