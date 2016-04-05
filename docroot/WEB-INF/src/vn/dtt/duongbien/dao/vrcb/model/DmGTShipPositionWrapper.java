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
 * This class is a wrapper for {@link DmGTShipPosition}.
 * </p>
 *
 * @author longdm
 * @see DmGTShipPosition
 * @generated
 */
public class DmGTShipPositionWrapper implements DmGTShipPosition,
	ModelWrapper<DmGTShipPosition> {
	public DmGTShipPositionWrapper(DmGTShipPosition dmGTShipPosition) {
		_dmGTShipPosition = dmGTShipPosition;
	}

	@Override
	public Class<?> getModelClass() {
		return DmGTShipPosition.class;
	}

	@Override
	public String getModelClassName() {
		return DmGTShipPosition.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("positionCode", getPositionCode());
		attributes.put("positionName", getPositionName());
		attributes.put("remarks", getRemarks());
		attributes.put("positionOrder", getPositionOrder());
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

		String positionCode = (String)attributes.get("positionCode");

		if (positionCode != null) {
			setPositionCode(positionCode);
		}

		String positionName = (String)attributes.get("positionName");

		if (positionName != null) {
			setPositionName(positionName);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		Integer positionOrder = (Integer)attributes.get("positionOrder");

		if (positionOrder != null) {
			setPositionOrder(positionOrder);
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
	* Returns the primary key of this dm g t ship position.
	*
	* @return the primary key of this dm g t ship position
	*/
	@Override
	public long getPrimaryKey() {
		return _dmGTShipPosition.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm g t ship position.
	*
	* @param primaryKey the primary key of this dm g t ship position
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dmGTShipPosition.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm g t ship position.
	*
	* @return the ID of this dm g t ship position
	*/
	@Override
	public long getId() {
		return _dmGTShipPosition.getId();
	}

	/**
	* Sets the ID of this dm g t ship position.
	*
	* @param id the ID of this dm g t ship position
	*/
	@Override
	public void setId(long id) {
		_dmGTShipPosition.setId(id);
	}

	/**
	* Returns the position code of this dm g t ship position.
	*
	* @return the position code of this dm g t ship position
	*/
	@Override
	public java.lang.String getPositionCode() {
		return _dmGTShipPosition.getPositionCode();
	}

	/**
	* Sets the position code of this dm g t ship position.
	*
	* @param positionCode the position code of this dm g t ship position
	*/
	@Override
	public void setPositionCode(java.lang.String positionCode) {
		_dmGTShipPosition.setPositionCode(positionCode);
	}

	/**
	* Returns the position name of this dm g t ship position.
	*
	* @return the position name of this dm g t ship position
	*/
	@Override
	public java.lang.String getPositionName() {
		return _dmGTShipPosition.getPositionName();
	}

	/**
	* Sets the position name of this dm g t ship position.
	*
	* @param positionName the position name of this dm g t ship position
	*/
	@Override
	public void setPositionName(java.lang.String positionName) {
		_dmGTShipPosition.setPositionName(positionName);
	}

	/**
	* Returns the remarks of this dm g t ship position.
	*
	* @return the remarks of this dm g t ship position
	*/
	@Override
	public java.lang.String getRemarks() {
		return _dmGTShipPosition.getRemarks();
	}

	/**
	* Sets the remarks of this dm g t ship position.
	*
	* @param remarks the remarks of this dm g t ship position
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_dmGTShipPosition.setRemarks(remarks);
	}

	/**
	* Returns the position order of this dm g t ship position.
	*
	* @return the position order of this dm g t ship position
	*/
	@Override
	public int getPositionOrder() {
		return _dmGTShipPosition.getPositionOrder();
	}

	/**
	* Sets the position order of this dm g t ship position.
	*
	* @param positionOrder the position order of this dm g t ship position
	*/
	@Override
	public void setPositionOrder(int positionOrder) {
		_dmGTShipPosition.setPositionOrder(positionOrder);
	}

	/**
	* Returns the is delete of this dm g t ship position.
	*
	* @return the is delete of this dm g t ship position
	*/
	@Override
	public int getIsDelete() {
		return _dmGTShipPosition.getIsDelete();
	}

	/**
	* Sets the is delete of this dm g t ship position.
	*
	* @param isDelete the is delete of this dm g t ship position
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmGTShipPosition.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm g t ship position.
	*
	* @return the marked as delete of this dm g t ship position
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmGTShipPosition.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm g t ship position.
	*
	* @param markedAsDelete the marked as delete of this dm g t ship position
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmGTShipPosition.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm g t ship position.
	*
	* @return the modified date of this dm g t ship position
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmGTShipPosition.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm g t ship position.
	*
	* @param modifiedDate the modified date of this dm g t ship position
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmGTShipPosition.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm g t ship position.
	*
	* @return the requested date of this dm g t ship position
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmGTShipPosition.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm g t ship position.
	*
	* @param requestedDate the requested date of this dm g t ship position
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmGTShipPosition.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm g t ship position.
	*
	* @return the sync version of this dm g t ship position
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmGTShipPosition.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm g t ship position.
	*
	* @param syncVersion the sync version of this dm g t ship position
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmGTShipPosition.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmGTShipPosition.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmGTShipPosition.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmGTShipPosition.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmGTShipPosition.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmGTShipPosition.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmGTShipPosition.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmGTShipPosition.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmGTShipPosition.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmGTShipPosition.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmGTShipPosition.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmGTShipPosition.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmGTShipPositionWrapper((DmGTShipPosition)_dmGTShipPosition.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.DmGTShipPosition dmGTShipPosition) {
		return _dmGTShipPosition.compareTo(dmGTShipPosition);
	}

	@Override
	public int hashCode() {
		return _dmGTShipPosition.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.DmGTShipPosition> toCacheModel() {
		return _dmGTShipPosition.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGTShipPosition toEscapedModel() {
		return new DmGTShipPositionWrapper(_dmGTShipPosition.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGTShipPosition toUnescapedModel() {
		return new DmGTShipPositionWrapper(_dmGTShipPosition.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmGTShipPosition.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmGTShipPosition.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmGTShipPosition.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmGTShipPositionWrapper)) {
			return false;
		}

		DmGTShipPositionWrapper dmGTShipPositionWrapper = (DmGTShipPositionWrapper)obj;

		if (Validator.equals(_dmGTShipPosition,
					dmGTShipPositionWrapper._dmGTShipPosition)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmGTShipPosition getWrappedDmGTShipPosition() {
		return _dmGTShipPosition;
	}

	@Override
	public DmGTShipPosition getWrappedModel() {
		return _dmGTShipPosition;
	}

	@Override
	public void resetOriginalValues() {
		_dmGTShipPosition.resetOriginalValues();
	}

	private DmGTShipPosition _dmGTShipPosition;
}