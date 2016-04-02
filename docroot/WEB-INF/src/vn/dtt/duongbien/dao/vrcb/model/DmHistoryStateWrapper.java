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
 * This class is a wrapper for {@link DmHistoryState}.
 * </p>
 *
 * @author longdm
 * @see DmHistoryState
 * @generated
 */
public class DmHistoryStateWrapper implements DmHistoryState,
	ModelWrapper<DmHistoryState> {
	public DmHistoryStateWrapper(DmHistoryState dmHistoryState) {
		_dmHistoryState = dmHistoryState;
	}

	@Override
	public Class<?> getModelClass() {
		return DmHistoryState.class;
	}

	@Override
	public String getModelClassName() {
		return DmHistoryState.class.getName();
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
	* Returns the primary key of this dm history state.
	*
	* @return the primary key of this dm history state
	*/
	@Override
	public int getPrimaryKey() {
		return _dmHistoryState.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm history state.
	*
	* @param primaryKey the primary key of this dm history state
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_dmHistoryState.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm history state.
	*
	* @return the ID of this dm history state
	*/
	@Override
	public int getId() {
		return _dmHistoryState.getId();
	}

	/**
	* Sets the ID of this dm history state.
	*
	* @param id the ID of this dm history state
	*/
	@Override
	public void setId(int id) {
		_dmHistoryState.setId(id);
	}

	/**
	* Returns the state code of this dm history state.
	*
	* @return the state code of this dm history state
	*/
	@Override
	public java.lang.String getStateCode() {
		return _dmHistoryState.getStateCode();
	}

	/**
	* Sets the state code of this dm history state.
	*
	* @param stateCode the state code of this dm history state
	*/
	@Override
	public void setStateCode(java.lang.String stateCode) {
		_dmHistoryState.setStateCode(stateCode);
	}

	/**
	* Returns the state name of this dm history state.
	*
	* @return the state name of this dm history state
	*/
	@Override
	public java.lang.String getStateName() {
		return _dmHistoryState.getStateName();
	}

	/**
	* Sets the state name of this dm history state.
	*
	* @param stateName the state name of this dm history state
	*/
	@Override
	public void setStateName(java.lang.String stateName) {
		_dmHistoryState.setStateName(stateName);
	}

	/**
	* Returns the description of this dm history state.
	*
	* @return the description of this dm history state
	*/
	@Override
	public java.lang.String getDescription() {
		return _dmHistoryState.getDescription();
	}

	/**
	* Sets the description of this dm history state.
	*
	* @param description the description of this dm history state
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_dmHistoryState.setDescription(description);
	}

	/**
	* Returns the is delete of this dm history state.
	*
	* @return the is delete of this dm history state
	*/
	@Override
	public int getIsDelete() {
		return _dmHistoryState.getIsDelete();
	}

	/**
	* Sets the is delete of this dm history state.
	*
	* @param isDelete the is delete of this dm history state
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmHistoryState.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm history state.
	*
	* @return the marked as delete of this dm history state
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmHistoryState.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm history state.
	*
	* @param markedAsDelete the marked as delete of this dm history state
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmHistoryState.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm history state.
	*
	* @return the modified date of this dm history state
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmHistoryState.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm history state.
	*
	* @param modifiedDate the modified date of this dm history state
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmHistoryState.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm history state.
	*
	* @return the requested date of this dm history state
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmHistoryState.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm history state.
	*
	* @param requestedDate the requested date of this dm history state
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmHistoryState.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm history state.
	*
	* @return the sync version of this dm history state
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmHistoryState.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm history state.
	*
	* @param syncVersion the sync version of this dm history state
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmHistoryState.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmHistoryState.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmHistoryState.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmHistoryState.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmHistoryState.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmHistoryState.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmHistoryState.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmHistoryState.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmHistoryState.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmHistoryState.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmHistoryState.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmHistoryState.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmHistoryStateWrapper((DmHistoryState)_dmHistoryState.clone());
	}

	@Override
	public int compareTo(DmHistoryState dmHistoryState) {
		return _dmHistoryState.compareTo(dmHistoryState);
	}

	@Override
	public int hashCode() {
		return _dmHistoryState.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<DmHistoryState> toCacheModel() {
		return _dmHistoryState.toCacheModel();
	}

	@Override
	public DmHistoryState toEscapedModel() {
		return new DmHistoryStateWrapper(_dmHistoryState.toEscapedModel());
	}

	@Override
	public DmHistoryState toUnescapedModel() {
		return new DmHistoryStateWrapper(_dmHistoryState.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmHistoryState.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmHistoryState.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryState.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmHistoryStateWrapper)) {
			return false;
		}

		DmHistoryStateWrapper dmHistoryStateWrapper = (DmHistoryStateWrapper)obj;

		if (Validator.equals(_dmHistoryState,
					dmHistoryStateWrapper._dmHistoryState)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmHistoryState getWrappedDmHistoryState() {
		return _dmHistoryState;
	}

	@Override
	public DmHistoryState getWrappedModel() {
		return _dmHistoryState;
	}

	@Override
	public void resetOriginalValues() {
		_dmHistoryState.resetOriginalValues();
	}

	private DmHistoryState _dmHistoryState;
}