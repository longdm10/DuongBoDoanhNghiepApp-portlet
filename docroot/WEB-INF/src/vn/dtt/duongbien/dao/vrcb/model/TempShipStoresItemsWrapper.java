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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TempShipStoresItems}.
 * </p>
 *
 * @author longdm
 * @see TempShipStoresItems
 * @generated
 */
public class TempShipStoresItemsWrapper implements TempShipStoresItems,
	ModelWrapper<TempShipStoresItems> {
	public TempShipStoresItemsWrapper(TempShipStoresItems tempShipStoresItems) {
		_tempShipStoresItems = tempShipStoresItems;
	}

	@Override
	public Class<?> getModelClass() {
		return TempShipStoresItems.class;
	}

	@Override
	public String getModelClassName() {
		return TempShipStoresItems.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("requestCode", getRequestCode());
		attributes.put("shipsstoreItemCode", getShipsstoreItemCode());
		attributes.put("nameOfArticle", getNameOfArticle());
		attributes.put("quantity", getQuantity());
		attributes.put("quantityUnit", getQuantityUnit());
		attributes.put("locationOnBoat", getLocationOnBoat());
		attributes.put("useInBoat", getUseInBoat());

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

		String shipsstoreItemCode = (String)attributes.get("shipsstoreItemCode");

		if (shipsstoreItemCode != null) {
			setShipsstoreItemCode(shipsstoreItemCode);
		}

		String nameOfArticle = (String)attributes.get("nameOfArticle");

		if (nameOfArticle != null) {
			setNameOfArticle(nameOfArticle);
		}

		String quantity = (String)attributes.get("quantity");

		if (quantity != null) {
			setQuantity(quantity);
		}

		String quantityUnit = (String)attributes.get("quantityUnit");

		if (quantityUnit != null) {
			setQuantityUnit(quantityUnit);
		}

		String locationOnBoat = (String)attributes.get("locationOnBoat");

		if (locationOnBoat != null) {
			setLocationOnBoat(locationOnBoat);
		}

		Integer useInBoat = (Integer)attributes.get("useInBoat");

		if (useInBoat != null) {
			setUseInBoat(useInBoat);
		}
	}

	/**
	* Returns the primary key of this temp ship stores items.
	*
	* @return the primary key of this temp ship stores items
	*/
	@Override
	public long getPrimaryKey() {
		return _tempShipStoresItems.getPrimaryKey();
	}

	/**
	* Sets the primary key of this temp ship stores items.
	*
	* @param primaryKey the primary key of this temp ship stores items
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tempShipStoresItems.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this temp ship stores items.
	*
	* @return the ID of this temp ship stores items
	*/
	@Override
	public long getId() {
		return _tempShipStoresItems.getId();
	}

	/**
	* Sets the ID of this temp ship stores items.
	*
	* @param id the ID of this temp ship stores items
	*/
	@Override
	public void setId(long id) {
		_tempShipStoresItems.setId(id);
	}

	/**
	* Returns the request code of this temp ship stores items.
	*
	* @return the request code of this temp ship stores items
	*/
	@Override
	public java.lang.String getRequestCode() {
		return _tempShipStoresItems.getRequestCode();
	}

	/**
	* Sets the request code of this temp ship stores items.
	*
	* @param requestCode the request code of this temp ship stores items
	*/
	@Override
	public void setRequestCode(java.lang.String requestCode) {
		_tempShipStoresItems.setRequestCode(requestCode);
	}

	/**
	* Returns the shipsstore item code of this temp ship stores items.
	*
	* @return the shipsstore item code of this temp ship stores items
	*/
	@Override
	public java.lang.String getShipsstoreItemCode() {
		return _tempShipStoresItems.getShipsstoreItemCode();
	}

	/**
	* Sets the shipsstore item code of this temp ship stores items.
	*
	* @param shipsstoreItemCode the shipsstore item code of this temp ship stores items
	*/
	@Override
	public void setShipsstoreItemCode(java.lang.String shipsstoreItemCode) {
		_tempShipStoresItems.setShipsstoreItemCode(shipsstoreItemCode);
	}

	/**
	* Returns the name of article of this temp ship stores items.
	*
	* @return the name of article of this temp ship stores items
	*/
	@Override
	public java.lang.String getNameOfArticle() {
		return _tempShipStoresItems.getNameOfArticle();
	}

	/**
	* Sets the name of article of this temp ship stores items.
	*
	* @param nameOfArticle the name of article of this temp ship stores items
	*/
	@Override
	public void setNameOfArticle(java.lang.String nameOfArticle) {
		_tempShipStoresItems.setNameOfArticle(nameOfArticle);
	}

	/**
	* Returns the quantity of this temp ship stores items.
	*
	* @return the quantity of this temp ship stores items
	*/
	@Override
	public java.lang.String getQuantity() {
		return _tempShipStoresItems.getQuantity();
	}

	/**
	* Sets the quantity of this temp ship stores items.
	*
	* @param quantity the quantity of this temp ship stores items
	*/
	@Override
	public void setQuantity(java.lang.String quantity) {
		_tempShipStoresItems.setQuantity(quantity);
	}

	/**
	* Returns the quantity unit of this temp ship stores items.
	*
	* @return the quantity unit of this temp ship stores items
	*/
	@Override
	public java.lang.String getQuantityUnit() {
		return _tempShipStoresItems.getQuantityUnit();
	}

	/**
	* Sets the quantity unit of this temp ship stores items.
	*
	* @param quantityUnit the quantity unit of this temp ship stores items
	*/
	@Override
	public void setQuantityUnit(java.lang.String quantityUnit) {
		_tempShipStoresItems.setQuantityUnit(quantityUnit);
	}

	/**
	* Returns the location on boat of this temp ship stores items.
	*
	* @return the location on boat of this temp ship stores items
	*/
	@Override
	public java.lang.String getLocationOnBoat() {
		return _tempShipStoresItems.getLocationOnBoat();
	}

	/**
	* Sets the location on boat of this temp ship stores items.
	*
	* @param locationOnBoat the location on boat of this temp ship stores items
	*/
	@Override
	public void setLocationOnBoat(java.lang.String locationOnBoat) {
		_tempShipStoresItems.setLocationOnBoat(locationOnBoat);
	}

	/**
	* Returns the use in boat of this temp ship stores items.
	*
	* @return the use in boat of this temp ship stores items
	*/
	@Override
	public int getUseInBoat() {
		return _tempShipStoresItems.getUseInBoat();
	}

	/**
	* Sets the use in boat of this temp ship stores items.
	*
	* @param useInBoat the use in boat of this temp ship stores items
	*/
	@Override
	public void setUseInBoat(int useInBoat) {
		_tempShipStoresItems.setUseInBoat(useInBoat);
	}

	@Override
	public boolean isNew() {
		return _tempShipStoresItems.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tempShipStoresItems.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tempShipStoresItems.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tempShipStoresItems.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tempShipStoresItems.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tempShipStoresItems.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tempShipStoresItems.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tempShipStoresItems.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tempShipStoresItems.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tempShipStoresItems.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tempShipStoresItems.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TempShipStoresItemsWrapper((TempShipStoresItems)_tempShipStoresItems.clone());
	}

	@Override
	public int compareTo(TempShipStoresItems tempShipStoresItems) {
		return _tempShipStoresItems.compareTo(tempShipStoresItems);
	}

	@Override
	public int hashCode() {
		return _tempShipStoresItems.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<TempShipStoresItems> toCacheModel() {
		return _tempShipStoresItems.toCacheModel();
	}

	@Override
	public TempShipStoresItems toEscapedModel() {
		return new TempShipStoresItemsWrapper(_tempShipStoresItems.toEscapedModel());
	}

	@Override
	public TempShipStoresItems toUnescapedModel() {
		return new TempShipStoresItemsWrapper(_tempShipStoresItems.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tempShipStoresItems.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tempShipStoresItems.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempShipStoresItems.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TempShipStoresItemsWrapper)) {
			return false;
		}

		TempShipStoresItemsWrapper tempShipStoresItemsWrapper = (TempShipStoresItemsWrapper)obj;

		if (Validator.equals(_tempShipStoresItems,
					tempShipStoresItemsWrapper._tempShipStoresItems)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TempShipStoresItems getWrappedTempShipStoresItems() {
		return _tempShipStoresItems;
	}

	@Override
	public TempShipStoresItems getWrappedModel() {
		return _tempShipStoresItems;
	}

	@Override
	public void resetOriginalValues() {
		_tempShipStoresItems.resetOriginalValues();
	}

	private TempShipStoresItems _tempShipStoresItems;
}