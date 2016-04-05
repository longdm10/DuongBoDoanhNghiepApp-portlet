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
 * This class is a wrapper for {@link TempShipSecurityPortItems}.
 * </p>
 *
 * @author longdm
 * @see TempShipSecurityPortItems
 * @generated
 */
public class TempShipSecurityPortItemsWrapper
	implements TempShipSecurityPortItems,
		ModelWrapper<TempShipSecurityPortItems> {
	public TempShipSecurityPortItemsWrapper(
		TempShipSecurityPortItems tempShipSecurityPortItems) {
		_tempShipSecurityPortItems = tempShipSecurityPortItems;
	}

	@Override
	public Class<?> getModelClass() {
		return TempShipSecurityPortItems.class;
	}

	@Override
	public String getModelClassName() {
		return TempShipSecurityPortItems.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("requestCode", getRequestCode());
		attributes.put("shipSecurityPortItemCode", getShipSecurityPortItemCode());
		attributes.put("portCode", getPortCode());
		attributes.put("dateArrival", getDateArrival());
		attributes.put("dateDeparture", getDateDeparture());
		attributes.put("securityLevelCode", getSecurityLevelCode());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String requestCode = (String)attributes.get("requestCode");

		if (requestCode != null) {
			setRequestCode(requestCode);
		}

		String shipSecurityPortItemCode = (String)attributes.get(
				"shipSecurityPortItemCode");

		if (shipSecurityPortItemCode != null) {
			setShipSecurityPortItemCode(shipSecurityPortItemCode);
		}

		String portCode = (String)attributes.get("portCode");

		if (portCode != null) {
			setPortCode(portCode);
		}

		Date dateArrival = (Date)attributes.get("dateArrival");

		if (dateArrival != null) {
			setDateArrival(dateArrival);
		}

		Date dateDeparture = (Date)attributes.get("dateDeparture");

		if (dateDeparture != null) {
			setDateDeparture(dateDeparture);
		}

		String securityLevelCode = (String)attributes.get("securityLevelCode");

		if (securityLevelCode != null) {
			setSecurityLevelCode(securityLevelCode);
		}
	}

	/**
	* Returns the primary key of this temp ship security port items.
	*
	* @return the primary key of this temp ship security port items
	*/
	@Override
	public long getPrimaryKey() {
		return _tempShipSecurityPortItems.getPrimaryKey();
	}

	/**
	* Sets the primary key of this temp ship security port items.
	*
	* @param primaryKey the primary key of this temp ship security port items
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tempShipSecurityPortItems.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this temp ship security port items.
	*
	* @return the ID of this temp ship security port items
	*/
	@Override
	public long getId() {
		return _tempShipSecurityPortItems.getId();
	}

	/**
	* Sets the ID of this temp ship security port items.
	*
	* @param id the ID of this temp ship security port items
	*/
	@Override
	public void setId(long id) {
		_tempShipSecurityPortItems.setId(id);
	}

	/**
	* Returns the request code of this temp ship security port items.
	*
	* @return the request code of this temp ship security port items
	*/
	@Override
	public java.lang.String getRequestCode() {
		return _tempShipSecurityPortItems.getRequestCode();
	}

	/**
	* Sets the request code of this temp ship security port items.
	*
	* @param requestCode the request code of this temp ship security port items
	*/
	@Override
	public void setRequestCode(java.lang.String requestCode) {
		_tempShipSecurityPortItems.setRequestCode(requestCode);
	}

	/**
	* Returns the ship security port item code of this temp ship security port items.
	*
	* @return the ship security port item code of this temp ship security port items
	*/
	@Override
	public java.lang.String getShipSecurityPortItemCode() {
		return _tempShipSecurityPortItems.getShipSecurityPortItemCode();
	}

	/**
	* Sets the ship security port item code of this temp ship security port items.
	*
	* @param shipSecurityPortItemCode the ship security port item code of this temp ship security port items
	*/
	@Override
	public void setShipSecurityPortItemCode(
		java.lang.String shipSecurityPortItemCode) {
		_tempShipSecurityPortItems.setShipSecurityPortItemCode(shipSecurityPortItemCode);
	}

	/**
	* Returns the port code of this temp ship security port items.
	*
	* @return the port code of this temp ship security port items
	*/
	@Override
	public java.lang.String getPortCode() {
		return _tempShipSecurityPortItems.getPortCode();
	}

	/**
	* Sets the port code of this temp ship security port items.
	*
	* @param portCode the port code of this temp ship security port items
	*/
	@Override
	public void setPortCode(java.lang.String portCode) {
		_tempShipSecurityPortItems.setPortCode(portCode);
	}

	/**
	* Returns the date arrival of this temp ship security port items.
	*
	* @return the date arrival of this temp ship security port items
	*/
	@Override
	public java.util.Date getDateArrival() {
		return _tempShipSecurityPortItems.getDateArrival();
	}

	/**
	* Sets the date arrival of this temp ship security port items.
	*
	* @param dateArrival the date arrival of this temp ship security port items
	*/
	@Override
	public void setDateArrival(java.util.Date dateArrival) {
		_tempShipSecurityPortItems.setDateArrival(dateArrival);
	}

	/**
	* Returns the date departure of this temp ship security port items.
	*
	* @return the date departure of this temp ship security port items
	*/
	@Override
	public java.util.Date getDateDeparture() {
		return _tempShipSecurityPortItems.getDateDeparture();
	}

	/**
	* Sets the date departure of this temp ship security port items.
	*
	* @param dateDeparture the date departure of this temp ship security port items
	*/
	@Override
	public void setDateDeparture(java.util.Date dateDeparture) {
		_tempShipSecurityPortItems.setDateDeparture(dateDeparture);
	}

	/**
	* Returns the security level code of this temp ship security port items.
	*
	* @return the security level code of this temp ship security port items
	*/
	@Override
	public java.lang.String getSecurityLevelCode() {
		return _tempShipSecurityPortItems.getSecurityLevelCode();
	}

	/**
	* Sets the security level code of this temp ship security port items.
	*
	* @param securityLevelCode the security level code of this temp ship security port items
	*/
	@Override
	public void setSecurityLevelCode(java.lang.String securityLevelCode) {
		_tempShipSecurityPortItems.setSecurityLevelCode(securityLevelCode);
	}

	@Override
	public boolean isNew() {
		return _tempShipSecurityPortItems.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tempShipSecurityPortItems.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tempShipSecurityPortItems.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tempShipSecurityPortItems.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tempShipSecurityPortItems.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tempShipSecurityPortItems.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tempShipSecurityPortItems.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tempShipSecurityPortItems.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tempShipSecurityPortItems.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tempShipSecurityPortItems.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tempShipSecurityPortItems.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TempShipSecurityPortItemsWrapper((TempShipSecurityPortItems)_tempShipSecurityPortItems.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityPortItems tempShipSecurityPortItems) {
		return _tempShipSecurityPortItems.compareTo(tempShipSecurityPortItems);
	}

	@Override
	public int hashCode() {
		return _tempShipSecurityPortItems.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityPortItems> toCacheModel() {
		return _tempShipSecurityPortItems.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityPortItems toEscapedModel() {
		return new TempShipSecurityPortItemsWrapper(_tempShipSecurityPortItems.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityPortItems toUnescapedModel() {
		return new TempShipSecurityPortItemsWrapper(_tempShipSecurityPortItems.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tempShipSecurityPortItems.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tempShipSecurityPortItems.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempShipSecurityPortItems.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TempShipSecurityPortItemsWrapper)) {
			return false;
		}

		TempShipSecurityPortItemsWrapper tempShipSecurityPortItemsWrapper = (TempShipSecurityPortItemsWrapper)obj;

		if (Validator.equals(_tempShipSecurityPortItems,
					tempShipSecurityPortItemsWrapper._tempShipSecurityPortItems)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TempShipSecurityPortItems getWrappedTempShipSecurityPortItems() {
		return _tempShipSecurityPortItems;
	}

	@Override
	public TempShipSecurityPortItems getWrappedModel() {
		return _tempShipSecurityPortItems;
	}

	@Override
	public void resetOriginalValues() {
		_tempShipSecurityPortItems.resetOriginalValues();
	}

	private TempShipSecurityPortItems _tempShipSecurityPortItems;
}