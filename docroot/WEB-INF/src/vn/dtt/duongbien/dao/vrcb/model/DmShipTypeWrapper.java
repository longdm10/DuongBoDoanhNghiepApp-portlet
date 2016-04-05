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
 * This class is a wrapper for {@link DmShipType}.
 * </p>
 *
 * @author longdm
 * @see DmShipType
 * @generated
 */
public class DmShipTypeWrapper implements DmShipType, ModelWrapper<DmShipType> {
	public DmShipTypeWrapper(DmShipType dmShipType) {
		_dmShipType = dmShipType;
	}

	@Override
	public Class<?> getModelClass() {
		return DmShipType.class;
	}

	@Override
	public String getModelClassName() {
		return DmShipType.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("shipTypeCode", getShipTypeCode());
		attributes.put("shipTypeName", getShipTypeName());
		attributes.put("shipTypeNameVN", getShipTypeNameVN());
		attributes.put("shipTypeOrder", getShipTypeOrder());
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

		String shipTypeCode = (String)attributes.get("shipTypeCode");

		if (shipTypeCode != null) {
			setShipTypeCode(shipTypeCode);
		}

		String shipTypeName = (String)attributes.get("shipTypeName");

		if (shipTypeName != null) {
			setShipTypeName(shipTypeName);
		}

		String shipTypeNameVN = (String)attributes.get("shipTypeNameVN");

		if (shipTypeNameVN != null) {
			setShipTypeNameVN(shipTypeNameVN);
		}

		Integer shipTypeOrder = (Integer)attributes.get("shipTypeOrder");

		if (shipTypeOrder != null) {
			setShipTypeOrder(shipTypeOrder);
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
	* Returns the primary key of this dm ship type.
	*
	* @return the primary key of this dm ship type
	*/
	@Override
	public int getPrimaryKey() {
		return _dmShipType.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm ship type.
	*
	* @param primaryKey the primary key of this dm ship type
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_dmShipType.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm ship type.
	*
	* @return the ID of this dm ship type
	*/
	@Override
	public int getId() {
		return _dmShipType.getId();
	}

	/**
	* Sets the ID of this dm ship type.
	*
	* @param id the ID of this dm ship type
	*/
	@Override
	public void setId(int id) {
		_dmShipType.setId(id);
	}

	/**
	* Returns the ship type code of this dm ship type.
	*
	* @return the ship type code of this dm ship type
	*/
	@Override
	public java.lang.String getShipTypeCode() {
		return _dmShipType.getShipTypeCode();
	}

	/**
	* Sets the ship type code of this dm ship type.
	*
	* @param shipTypeCode the ship type code of this dm ship type
	*/
	@Override
	public void setShipTypeCode(java.lang.String shipTypeCode) {
		_dmShipType.setShipTypeCode(shipTypeCode);
	}

	/**
	* Returns the ship type name of this dm ship type.
	*
	* @return the ship type name of this dm ship type
	*/
	@Override
	public java.lang.String getShipTypeName() {
		return _dmShipType.getShipTypeName();
	}

	/**
	* Sets the ship type name of this dm ship type.
	*
	* @param shipTypeName the ship type name of this dm ship type
	*/
	@Override
	public void setShipTypeName(java.lang.String shipTypeName) {
		_dmShipType.setShipTypeName(shipTypeName);
	}

	/**
	* Returns the ship type name v n of this dm ship type.
	*
	* @return the ship type name v n of this dm ship type
	*/
	@Override
	public java.lang.String getShipTypeNameVN() {
		return _dmShipType.getShipTypeNameVN();
	}

	/**
	* Sets the ship type name v n of this dm ship type.
	*
	* @param shipTypeNameVN the ship type name v n of this dm ship type
	*/
	@Override
	public void setShipTypeNameVN(java.lang.String shipTypeNameVN) {
		_dmShipType.setShipTypeNameVN(shipTypeNameVN);
	}

	/**
	* Returns the ship type order of this dm ship type.
	*
	* @return the ship type order of this dm ship type
	*/
	@Override
	public int getShipTypeOrder() {
		return _dmShipType.getShipTypeOrder();
	}

	/**
	* Sets the ship type order of this dm ship type.
	*
	* @param shipTypeOrder the ship type order of this dm ship type
	*/
	@Override
	public void setShipTypeOrder(int shipTypeOrder) {
		_dmShipType.setShipTypeOrder(shipTypeOrder);
	}

	/**
	* Returns the is delete of this dm ship type.
	*
	* @return the is delete of this dm ship type
	*/
	@Override
	public int getIsDelete() {
		return _dmShipType.getIsDelete();
	}

	/**
	* Sets the is delete of this dm ship type.
	*
	* @param isDelete the is delete of this dm ship type
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmShipType.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm ship type.
	*
	* @return the marked as delete of this dm ship type
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmShipType.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm ship type.
	*
	* @param markedAsDelete the marked as delete of this dm ship type
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmShipType.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm ship type.
	*
	* @return the modified date of this dm ship type
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmShipType.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm ship type.
	*
	* @param modifiedDate the modified date of this dm ship type
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmShipType.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm ship type.
	*
	* @return the requested date of this dm ship type
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmShipType.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm ship type.
	*
	* @param requestedDate the requested date of this dm ship type
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmShipType.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm ship type.
	*
	* @return the sync version of this dm ship type
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmShipType.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm ship type.
	*
	* @param syncVersion the sync version of this dm ship type
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmShipType.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmShipType.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmShipType.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmShipType.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmShipType.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmShipType.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmShipType.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmShipType.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmShipType.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmShipType.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmShipType.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmShipType.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmShipTypeWrapper((DmShipType)_dmShipType.clone());
	}

	@Override
	public int compareTo(vn.dtt.duongbien.dao.vrcb.model.DmShipType dmShipType) {
		return _dmShipType.compareTo(dmShipType);
	}

	@Override
	public int hashCode() {
		return _dmShipType.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.DmShipType> toCacheModel() {
		return _dmShipType.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmShipType toEscapedModel() {
		return new DmShipTypeWrapper(_dmShipType.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmShipType toUnescapedModel() {
		return new DmShipTypeWrapper(_dmShipType.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmShipType.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmShipType.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmShipType.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmShipTypeWrapper)) {
			return false;
		}

		DmShipTypeWrapper dmShipTypeWrapper = (DmShipTypeWrapper)obj;

		if (Validator.equals(_dmShipType, dmShipTypeWrapper._dmShipType)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmShipType getWrappedDmShipType() {
		return _dmShipType;
	}

	@Override
	public DmShipType getWrappedModel() {
		return _dmShipType;
	}

	@Override
	public void resetOriginalValues() {
		_dmShipType.resetOriginalValues();
	}

	private DmShipType _dmShipType;
}