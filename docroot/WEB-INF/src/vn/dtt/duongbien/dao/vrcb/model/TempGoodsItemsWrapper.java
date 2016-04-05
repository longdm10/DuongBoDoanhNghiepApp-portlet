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
 * This class is a wrapper for {@link TempGoodsItems}.
 * </p>
 *
 * @author longdm
 * @see TempGoodsItems
 * @generated
 */
public class TempGoodsItemsWrapper implements TempGoodsItems,
	ModelWrapper<TempGoodsItems> {
	public TempGoodsItemsWrapper(TempGoodsItems tempGoodsItems) {
		_tempGoodsItems = tempGoodsItems;
	}

	@Override
	public Class<?> getModelClass() {
		return TempGoodsItems.class;
	}

	@Override
	public String getModelClassName() {
		return TempGoodsItems.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("requestCode", getRequestCode());
		attributes.put("billOfLadingNo", getBillOfLadingNo());
		attributes.put("goodItemCode", getGoodItemCode());
		attributes.put("goodItemDescription", getGoodItemDescription());
		attributes.put("numberOfPackage", getNumberOfPackage());
		attributes.put("kindOfPackages", getKindOfPackages());
		attributes.put("marksandNosofGoods", getMarksandNosofGoods());
		attributes.put("grossWeight", getGrossWeight());
		attributes.put("grossWeightUnit", getGrossWeightUnit());
		attributes.put("measurement", getMeasurement());
		attributes.put("measurementUnit", getMeasurementUnit());

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

		String billOfLadingNo = (String)attributes.get("billOfLadingNo");

		if (billOfLadingNo != null) {
			setBillOfLadingNo(billOfLadingNo);
		}

		String goodItemCode = (String)attributes.get("goodItemCode");

		if (goodItemCode != null) {
			setGoodItemCode(goodItemCode);
		}

		String goodItemDescription = (String)attributes.get(
				"goodItemDescription");

		if (goodItemDescription != null) {
			setGoodItemDescription(goodItemDescription);
		}

		Long numberOfPackage = (Long)attributes.get("numberOfPackage");

		if (numberOfPackage != null) {
			setNumberOfPackage(numberOfPackage);
		}

		String kindOfPackages = (String)attributes.get("kindOfPackages");

		if (kindOfPackages != null) {
			setKindOfPackages(kindOfPackages);
		}

		String marksandNosofGoods = (String)attributes.get("marksandNosofGoods");

		if (marksandNosofGoods != null) {
			setMarksandNosofGoods(marksandNosofGoods);
		}

		Double grossWeight = (Double)attributes.get("grossWeight");

		if (grossWeight != null) {
			setGrossWeight(grossWeight);
		}

		String grossWeightUnit = (String)attributes.get("grossWeightUnit");

		if (grossWeightUnit != null) {
			setGrossWeightUnit(grossWeightUnit);
		}

		Double measurement = (Double)attributes.get("measurement");

		if (measurement != null) {
			setMeasurement(measurement);
		}

		String measurementUnit = (String)attributes.get("measurementUnit");

		if (measurementUnit != null) {
			setMeasurementUnit(measurementUnit);
		}
	}

	/**
	* Returns the primary key of this temp goods items.
	*
	* @return the primary key of this temp goods items
	*/
	@Override
	public long getPrimaryKey() {
		return _tempGoodsItems.getPrimaryKey();
	}

	/**
	* Sets the primary key of this temp goods items.
	*
	* @param primaryKey the primary key of this temp goods items
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tempGoodsItems.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this temp goods items.
	*
	* @return the ID of this temp goods items
	*/
	@Override
	public long getId() {
		return _tempGoodsItems.getId();
	}

	/**
	* Sets the ID of this temp goods items.
	*
	* @param id the ID of this temp goods items
	*/
	@Override
	public void setId(long id) {
		_tempGoodsItems.setId(id);
	}

	/**
	* Returns the request code of this temp goods items.
	*
	* @return the request code of this temp goods items
	*/
	@Override
	public java.lang.String getRequestCode() {
		return _tempGoodsItems.getRequestCode();
	}

	/**
	* Sets the request code of this temp goods items.
	*
	* @param requestCode the request code of this temp goods items
	*/
	@Override
	public void setRequestCode(java.lang.String requestCode) {
		_tempGoodsItems.setRequestCode(requestCode);
	}

	/**
	* Returns the bill of lading no of this temp goods items.
	*
	* @return the bill of lading no of this temp goods items
	*/
	@Override
	public java.lang.String getBillOfLadingNo() {
		return _tempGoodsItems.getBillOfLadingNo();
	}

	/**
	* Sets the bill of lading no of this temp goods items.
	*
	* @param billOfLadingNo the bill of lading no of this temp goods items
	*/
	@Override
	public void setBillOfLadingNo(java.lang.String billOfLadingNo) {
		_tempGoodsItems.setBillOfLadingNo(billOfLadingNo);
	}

	/**
	* Returns the good item code of this temp goods items.
	*
	* @return the good item code of this temp goods items
	*/
	@Override
	public java.lang.String getGoodItemCode() {
		return _tempGoodsItems.getGoodItemCode();
	}

	/**
	* Sets the good item code of this temp goods items.
	*
	* @param goodItemCode the good item code of this temp goods items
	*/
	@Override
	public void setGoodItemCode(java.lang.String goodItemCode) {
		_tempGoodsItems.setGoodItemCode(goodItemCode);
	}

	/**
	* Returns the good item description of this temp goods items.
	*
	* @return the good item description of this temp goods items
	*/
	@Override
	public java.lang.String getGoodItemDescription() {
		return _tempGoodsItems.getGoodItemDescription();
	}

	/**
	* Sets the good item description of this temp goods items.
	*
	* @param goodItemDescription the good item description of this temp goods items
	*/
	@Override
	public void setGoodItemDescription(java.lang.String goodItemDescription) {
		_tempGoodsItems.setGoodItemDescription(goodItemDescription);
	}

	/**
	* Returns the number of package of this temp goods items.
	*
	* @return the number of package of this temp goods items
	*/
	@Override
	public long getNumberOfPackage() {
		return _tempGoodsItems.getNumberOfPackage();
	}

	/**
	* Sets the number of package of this temp goods items.
	*
	* @param numberOfPackage the number of package of this temp goods items
	*/
	@Override
	public void setNumberOfPackage(long numberOfPackage) {
		_tempGoodsItems.setNumberOfPackage(numberOfPackage);
	}

	/**
	* Returns the kind of packages of this temp goods items.
	*
	* @return the kind of packages of this temp goods items
	*/
	@Override
	public java.lang.String getKindOfPackages() {
		return _tempGoodsItems.getKindOfPackages();
	}

	/**
	* Sets the kind of packages of this temp goods items.
	*
	* @param kindOfPackages the kind of packages of this temp goods items
	*/
	@Override
	public void setKindOfPackages(java.lang.String kindOfPackages) {
		_tempGoodsItems.setKindOfPackages(kindOfPackages);
	}

	/**
	* Returns the marksand nosof goods of this temp goods items.
	*
	* @return the marksand nosof goods of this temp goods items
	*/
	@Override
	public java.lang.String getMarksandNosofGoods() {
		return _tempGoodsItems.getMarksandNosofGoods();
	}

	/**
	* Sets the marksand nosof goods of this temp goods items.
	*
	* @param marksandNosofGoods the marksand nosof goods of this temp goods items
	*/
	@Override
	public void setMarksandNosofGoods(java.lang.String marksandNosofGoods) {
		_tempGoodsItems.setMarksandNosofGoods(marksandNosofGoods);
	}

	/**
	* Returns the gross weight of this temp goods items.
	*
	* @return the gross weight of this temp goods items
	*/
	@Override
	public double getGrossWeight() {
		return _tempGoodsItems.getGrossWeight();
	}

	/**
	* Sets the gross weight of this temp goods items.
	*
	* @param grossWeight the gross weight of this temp goods items
	*/
	@Override
	public void setGrossWeight(double grossWeight) {
		_tempGoodsItems.setGrossWeight(grossWeight);
	}

	/**
	* Returns the gross weight unit of this temp goods items.
	*
	* @return the gross weight unit of this temp goods items
	*/
	@Override
	public java.lang.String getGrossWeightUnit() {
		return _tempGoodsItems.getGrossWeightUnit();
	}

	/**
	* Sets the gross weight unit of this temp goods items.
	*
	* @param grossWeightUnit the gross weight unit of this temp goods items
	*/
	@Override
	public void setGrossWeightUnit(java.lang.String grossWeightUnit) {
		_tempGoodsItems.setGrossWeightUnit(grossWeightUnit);
	}

	/**
	* Returns the measurement of this temp goods items.
	*
	* @return the measurement of this temp goods items
	*/
	@Override
	public double getMeasurement() {
		return _tempGoodsItems.getMeasurement();
	}

	/**
	* Sets the measurement of this temp goods items.
	*
	* @param measurement the measurement of this temp goods items
	*/
	@Override
	public void setMeasurement(double measurement) {
		_tempGoodsItems.setMeasurement(measurement);
	}

	/**
	* Returns the measurement unit of this temp goods items.
	*
	* @return the measurement unit of this temp goods items
	*/
	@Override
	public java.lang.String getMeasurementUnit() {
		return _tempGoodsItems.getMeasurementUnit();
	}

	/**
	* Sets the measurement unit of this temp goods items.
	*
	* @param measurementUnit the measurement unit of this temp goods items
	*/
	@Override
	public void setMeasurementUnit(java.lang.String measurementUnit) {
		_tempGoodsItems.setMeasurementUnit(measurementUnit);
	}

	@Override
	public boolean isNew() {
		return _tempGoodsItems.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tempGoodsItems.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tempGoodsItems.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tempGoodsItems.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tempGoodsItems.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tempGoodsItems.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tempGoodsItems.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tempGoodsItems.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tempGoodsItems.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tempGoodsItems.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tempGoodsItems.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TempGoodsItemsWrapper((TempGoodsItems)_tempGoodsItems.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.TempGoodsItems tempGoodsItems) {
		return _tempGoodsItems.compareTo(tempGoodsItems);
	}

	@Override
	public int hashCode() {
		return _tempGoodsItems.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.TempGoodsItems> toCacheModel() {
		return _tempGoodsItems.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempGoodsItems toEscapedModel() {
		return new TempGoodsItemsWrapper(_tempGoodsItems.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempGoodsItems toUnescapedModel() {
		return new TempGoodsItemsWrapper(_tempGoodsItems.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tempGoodsItems.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tempGoodsItems.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempGoodsItems.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TempGoodsItemsWrapper)) {
			return false;
		}

		TempGoodsItemsWrapper tempGoodsItemsWrapper = (TempGoodsItemsWrapper)obj;

		if (Validator.equals(_tempGoodsItems,
					tempGoodsItemsWrapper._tempGoodsItems)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TempGoodsItems getWrappedTempGoodsItems() {
		return _tempGoodsItems;
	}

	@Override
	public TempGoodsItems getWrappedModel() {
		return _tempGoodsItems;
	}

	@Override
	public void resetOriginalValues() {
		_tempGoodsItems.resetOriginalValues();
	}

	private TempGoodsItems _tempGoodsItems;
}