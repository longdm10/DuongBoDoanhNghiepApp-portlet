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
 * This class is a wrapper for {@link DmHistoryShipType}.
 * </p>
 *
 * @author longdm
 * @see DmHistoryShipType
 * @generated
 */
public class DmHistoryShipTypeWrapper implements DmHistoryShipType,
	ModelWrapper<DmHistoryShipType> {
	public DmHistoryShipTypeWrapper(DmHistoryShipType dmHistoryShipType) {
		_dmHistoryShipType = dmHistoryShipType;
	}

	@Override
	public Class<?> getModelClass() {
		return DmHistoryShipType.class;
	}

	@Override
	public String getModelClassName() {
		return DmHistoryShipType.class.getName();
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
	* Returns the primary key of this dm history ship type.
	*
	* @return the primary key of this dm history ship type
	*/
	@Override
	public int getPrimaryKey() {
		return _dmHistoryShipType.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm history ship type.
	*
	* @param primaryKey the primary key of this dm history ship type
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_dmHistoryShipType.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm history ship type.
	*
	* @return the ID of this dm history ship type
	*/
	@Override
	public int getId() {
		return _dmHistoryShipType.getId();
	}

	/**
	* Sets the ID of this dm history ship type.
	*
	* @param id the ID of this dm history ship type
	*/
	@Override
	public void setId(int id) {
		_dmHistoryShipType.setId(id);
	}

	/**
	* Returns the ship type code of this dm history ship type.
	*
	* @return the ship type code of this dm history ship type
	*/
	@Override
	public java.lang.String getShipTypeCode() {
		return _dmHistoryShipType.getShipTypeCode();
	}

	/**
	* Sets the ship type code of this dm history ship type.
	*
	* @param shipTypeCode the ship type code of this dm history ship type
	*/
	@Override
	public void setShipTypeCode(java.lang.String shipTypeCode) {
		_dmHistoryShipType.setShipTypeCode(shipTypeCode);
	}

	/**
	* Returns the ship type name of this dm history ship type.
	*
	* @return the ship type name of this dm history ship type
	*/
	@Override
	public java.lang.String getShipTypeName() {
		return _dmHistoryShipType.getShipTypeName();
	}

	/**
	* Sets the ship type name of this dm history ship type.
	*
	* @param shipTypeName the ship type name of this dm history ship type
	*/
	@Override
	public void setShipTypeName(java.lang.String shipTypeName) {
		_dmHistoryShipType.setShipTypeName(shipTypeName);
	}

	/**
	* Returns the ship type name v n of this dm history ship type.
	*
	* @return the ship type name v n of this dm history ship type
	*/
	@Override
	public java.lang.String getShipTypeNameVN() {
		return _dmHistoryShipType.getShipTypeNameVN();
	}

	/**
	* Sets the ship type name v n of this dm history ship type.
	*
	* @param shipTypeNameVN the ship type name v n of this dm history ship type
	*/
	@Override
	public void setShipTypeNameVN(java.lang.String shipTypeNameVN) {
		_dmHistoryShipType.setShipTypeNameVN(shipTypeNameVN);
	}

	/**
	* Returns the ship type order of this dm history ship type.
	*
	* @return the ship type order of this dm history ship type
	*/
	@Override
	public int getShipTypeOrder() {
		return _dmHistoryShipType.getShipTypeOrder();
	}

	/**
	* Sets the ship type order of this dm history ship type.
	*
	* @param shipTypeOrder the ship type order of this dm history ship type
	*/
	@Override
	public void setShipTypeOrder(int shipTypeOrder) {
		_dmHistoryShipType.setShipTypeOrder(shipTypeOrder);
	}

	/**
	* Returns the is delete of this dm history ship type.
	*
	* @return the is delete of this dm history ship type
	*/
	@Override
	public int getIsDelete() {
		return _dmHistoryShipType.getIsDelete();
	}

	/**
	* Sets the is delete of this dm history ship type.
	*
	* @param isDelete the is delete of this dm history ship type
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmHistoryShipType.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm history ship type.
	*
	* @return the marked as delete of this dm history ship type
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmHistoryShipType.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm history ship type.
	*
	* @param markedAsDelete the marked as delete of this dm history ship type
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmHistoryShipType.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm history ship type.
	*
	* @return the modified date of this dm history ship type
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmHistoryShipType.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm history ship type.
	*
	* @param modifiedDate the modified date of this dm history ship type
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmHistoryShipType.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm history ship type.
	*
	* @return the requested date of this dm history ship type
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmHistoryShipType.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm history ship type.
	*
	* @param requestedDate the requested date of this dm history ship type
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmHistoryShipType.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm history ship type.
	*
	* @return the sync version of this dm history ship type
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmHistoryShipType.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm history ship type.
	*
	* @param syncVersion the sync version of this dm history ship type
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmHistoryShipType.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmHistoryShipType.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmHistoryShipType.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmHistoryShipType.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmHistoryShipType.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmHistoryShipType.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmHistoryShipType.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmHistoryShipType.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmHistoryShipType.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmHistoryShipType.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmHistoryShipType.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmHistoryShipType.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmHistoryShipTypeWrapper((DmHistoryShipType)_dmHistoryShipType.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType dmHistoryShipType) {
		return _dmHistoryShipType.compareTo(dmHistoryShipType);
	}

	@Override
	public int hashCode() {
		return _dmHistoryShipType.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType> toCacheModel() {
		return _dmHistoryShipType.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType toEscapedModel() {
		return new DmHistoryShipTypeWrapper(_dmHistoryShipType.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType toUnescapedModel() {
		return new DmHistoryShipTypeWrapper(_dmHistoryShipType.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmHistoryShipType.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmHistoryShipType.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryShipType.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmHistoryShipTypeWrapper)) {
			return false;
		}

		DmHistoryShipTypeWrapper dmHistoryShipTypeWrapper = (DmHistoryShipTypeWrapper)obj;

		if (Validator.equals(_dmHistoryShipType,
					dmHistoryShipTypeWrapper._dmHistoryShipType)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmHistoryShipType getWrappedDmHistoryShipType() {
		return _dmHistoryShipType;
	}

	@Override
	public DmHistoryShipType getWrappedModel() {
		return _dmHistoryShipType;
	}

	@Override
	public void resetOriginalValues() {
		_dmHistoryShipType.resetOriginalValues();
	}

	private DmHistoryShipType _dmHistoryShipType;
}