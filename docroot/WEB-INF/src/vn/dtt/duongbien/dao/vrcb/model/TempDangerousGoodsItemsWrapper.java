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
 * This class is a wrapper for {@link TempDangerousGoodsItems}.
 * </p>
 *
 * @author longdm
 * @see TempDangerousGoodsItems
 * @generated
 */
public class TempDangerousGoodsItemsWrapper implements TempDangerousGoodsItems,
	ModelWrapper<TempDangerousGoodsItems> {
	public TempDangerousGoodsItemsWrapper(
		TempDangerousGoodsItems tempDangerousGoodsItems) {
		_tempDangerousGoodsItems = tempDangerousGoodsItems;
	}

	@Override
	public Class<?> getModelClass() {
		return TempDangerousGoodsItems.class;
	}

	@Override
	public String getModelClassName() {
		return TempDangerousGoodsItems.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("requestCode", getRequestCode());
		attributes.put("dangerousGoodItemCode", getDangerousGoodItemCode());
		attributes.put("refNumber", getRefNumber());
		attributes.put("marksContainer", getMarksContainer());
		attributes.put("numberContainer", getNumberContainer());
		attributes.put("numberOfPackage", getNumberOfPackage());
		attributes.put("kindOfPackages", getKindOfPackages());
		attributes.put("properShippingName", getProperShippingName());
		attributes.put("goodClass", getGoodClass());
		attributes.put("unNumber", getUnNumber());
		attributes.put("packingGroup", getPackingGroup());
		attributes.put("subsidiaryRisk", getSubsidiaryRisk());
		attributes.put("flashPoint", getFlashPoint());
		attributes.put("marinePollutant", getMarinePollutant());
		attributes.put("grossWeight", getGrossWeight());
		attributes.put("ems", getEms());

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

		String dangerousGoodItemCode = (String)attributes.get(
				"dangerousGoodItemCode");

		if (dangerousGoodItemCode != null) {
			setDangerousGoodItemCode(dangerousGoodItemCode);
		}

		String refNumber = (String)attributes.get("refNumber");

		if (refNumber != null) {
			setRefNumber(refNumber);
		}

		String marksContainer = (String)attributes.get("marksContainer");

		if (marksContainer != null) {
			setMarksContainer(marksContainer);
		}

		String numberContainer = (String)attributes.get("numberContainer");

		if (numberContainer != null) {
			setNumberContainer(numberContainer);
		}

		String numberOfPackage = (String)attributes.get("numberOfPackage");

		if (numberOfPackage != null) {
			setNumberOfPackage(numberOfPackage);
		}

		String kindOfPackages = (String)attributes.get("kindOfPackages");

		if (kindOfPackages != null) {
			setKindOfPackages(kindOfPackages);
		}

		String properShippingName = (String)attributes.get("properShippingName");

		if (properShippingName != null) {
			setProperShippingName(properShippingName);
		}

		String goodClass = (String)attributes.get("goodClass");

		if (goodClass != null) {
			setGoodClass(goodClass);
		}

		String unNumber = (String)attributes.get("unNumber");

		if (unNumber != null) {
			setUnNumber(unNumber);
		}

		String packingGroup = (String)attributes.get("packingGroup");

		if (packingGroup != null) {
			setPackingGroup(packingGroup);
		}

		String subsidiaryRisk = (String)attributes.get("subsidiaryRisk");

		if (subsidiaryRisk != null) {
			setSubsidiaryRisk(subsidiaryRisk);
		}

		String flashPoint = (String)attributes.get("flashPoint");

		if (flashPoint != null) {
			setFlashPoint(flashPoint);
		}

		String marinePollutant = (String)attributes.get("marinePollutant");

		if (marinePollutant != null) {
			setMarinePollutant(marinePollutant);
		}

		Long grossWeight = (Long)attributes.get("grossWeight");

		if (grossWeight != null) {
			setGrossWeight(grossWeight);
		}

		String ems = (String)attributes.get("ems");

		if (ems != null) {
			setEms(ems);
		}
	}

	/**
	* Returns the primary key of this temp dangerous goods items.
	*
	* @return the primary key of this temp dangerous goods items
	*/
	@Override
	public long getPrimaryKey() {
		return _tempDangerousGoodsItems.getPrimaryKey();
	}

	/**
	* Sets the primary key of this temp dangerous goods items.
	*
	* @param primaryKey the primary key of this temp dangerous goods items
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tempDangerousGoodsItems.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this temp dangerous goods items.
	*
	* @return the ID of this temp dangerous goods items
	*/
	@Override
	public long getId() {
		return _tempDangerousGoodsItems.getId();
	}

	/**
	* Sets the ID of this temp dangerous goods items.
	*
	* @param id the ID of this temp dangerous goods items
	*/
	@Override
	public void setId(long id) {
		_tempDangerousGoodsItems.setId(id);
	}

	/**
	* Returns the request code of this temp dangerous goods items.
	*
	* @return the request code of this temp dangerous goods items
	*/
	@Override
	public java.lang.String getRequestCode() {
		return _tempDangerousGoodsItems.getRequestCode();
	}

	/**
	* Sets the request code of this temp dangerous goods items.
	*
	* @param requestCode the request code of this temp dangerous goods items
	*/
	@Override
	public void setRequestCode(java.lang.String requestCode) {
		_tempDangerousGoodsItems.setRequestCode(requestCode);
	}

	/**
	* Returns the dangerous good item code of this temp dangerous goods items.
	*
	* @return the dangerous good item code of this temp dangerous goods items
	*/
	@Override
	public java.lang.String getDangerousGoodItemCode() {
		return _tempDangerousGoodsItems.getDangerousGoodItemCode();
	}

	/**
	* Sets the dangerous good item code of this temp dangerous goods items.
	*
	* @param dangerousGoodItemCode the dangerous good item code of this temp dangerous goods items
	*/
	@Override
	public void setDangerousGoodItemCode(java.lang.String dangerousGoodItemCode) {
		_tempDangerousGoodsItems.setDangerousGoodItemCode(dangerousGoodItemCode);
	}

	/**
	* Returns the ref number of this temp dangerous goods items.
	*
	* @return the ref number of this temp dangerous goods items
	*/
	@Override
	public java.lang.String getRefNumber() {
		return _tempDangerousGoodsItems.getRefNumber();
	}

	/**
	* Sets the ref number of this temp dangerous goods items.
	*
	* @param refNumber the ref number of this temp dangerous goods items
	*/
	@Override
	public void setRefNumber(java.lang.String refNumber) {
		_tempDangerousGoodsItems.setRefNumber(refNumber);
	}

	/**
	* Returns the marks container of this temp dangerous goods items.
	*
	* @return the marks container of this temp dangerous goods items
	*/
	@Override
	public java.lang.String getMarksContainer() {
		return _tempDangerousGoodsItems.getMarksContainer();
	}

	/**
	* Sets the marks container of this temp dangerous goods items.
	*
	* @param marksContainer the marks container of this temp dangerous goods items
	*/
	@Override
	public void setMarksContainer(java.lang.String marksContainer) {
		_tempDangerousGoodsItems.setMarksContainer(marksContainer);
	}

	/**
	* Returns the number container of this temp dangerous goods items.
	*
	* @return the number container of this temp dangerous goods items
	*/
	@Override
	public java.lang.String getNumberContainer() {
		return _tempDangerousGoodsItems.getNumberContainer();
	}

	/**
	* Sets the number container of this temp dangerous goods items.
	*
	* @param numberContainer the number container of this temp dangerous goods items
	*/
	@Override
	public void setNumberContainer(java.lang.String numberContainer) {
		_tempDangerousGoodsItems.setNumberContainer(numberContainer);
	}

	/**
	* Returns the number of package of this temp dangerous goods items.
	*
	* @return the number of package of this temp dangerous goods items
	*/
	@Override
	public java.lang.String getNumberOfPackage() {
		return _tempDangerousGoodsItems.getNumberOfPackage();
	}

	/**
	* Sets the number of package of this temp dangerous goods items.
	*
	* @param numberOfPackage the number of package of this temp dangerous goods items
	*/
	@Override
	public void setNumberOfPackage(java.lang.String numberOfPackage) {
		_tempDangerousGoodsItems.setNumberOfPackage(numberOfPackage);
	}

	/**
	* Returns the kind of packages of this temp dangerous goods items.
	*
	* @return the kind of packages of this temp dangerous goods items
	*/
	@Override
	public java.lang.String getKindOfPackages() {
		return _tempDangerousGoodsItems.getKindOfPackages();
	}

	/**
	* Sets the kind of packages of this temp dangerous goods items.
	*
	* @param kindOfPackages the kind of packages of this temp dangerous goods items
	*/
	@Override
	public void setKindOfPackages(java.lang.String kindOfPackages) {
		_tempDangerousGoodsItems.setKindOfPackages(kindOfPackages);
	}

	/**
	* Returns the proper shipping name of this temp dangerous goods items.
	*
	* @return the proper shipping name of this temp dangerous goods items
	*/
	@Override
	public java.lang.String getProperShippingName() {
		return _tempDangerousGoodsItems.getProperShippingName();
	}

	/**
	* Sets the proper shipping name of this temp dangerous goods items.
	*
	* @param properShippingName the proper shipping name of this temp dangerous goods items
	*/
	@Override
	public void setProperShippingName(java.lang.String properShippingName) {
		_tempDangerousGoodsItems.setProperShippingName(properShippingName);
	}

	/**
	* Returns the good class of this temp dangerous goods items.
	*
	* @return the good class of this temp dangerous goods items
	*/
	@Override
	public java.lang.String getGoodClass() {
		return _tempDangerousGoodsItems.getGoodClass();
	}

	/**
	* Sets the good class of this temp dangerous goods items.
	*
	* @param goodClass the good class of this temp dangerous goods items
	*/
	@Override
	public void setGoodClass(java.lang.String goodClass) {
		_tempDangerousGoodsItems.setGoodClass(goodClass);
	}

	/**
	* Returns the un number of this temp dangerous goods items.
	*
	* @return the un number of this temp dangerous goods items
	*/
	@Override
	public java.lang.String getUnNumber() {
		return _tempDangerousGoodsItems.getUnNumber();
	}

	/**
	* Sets the un number of this temp dangerous goods items.
	*
	* @param unNumber the un number of this temp dangerous goods items
	*/
	@Override
	public void setUnNumber(java.lang.String unNumber) {
		_tempDangerousGoodsItems.setUnNumber(unNumber);
	}

	/**
	* Returns the packing group of this temp dangerous goods items.
	*
	* @return the packing group of this temp dangerous goods items
	*/
	@Override
	public java.lang.String getPackingGroup() {
		return _tempDangerousGoodsItems.getPackingGroup();
	}

	/**
	* Sets the packing group of this temp dangerous goods items.
	*
	* @param packingGroup the packing group of this temp dangerous goods items
	*/
	@Override
	public void setPackingGroup(java.lang.String packingGroup) {
		_tempDangerousGoodsItems.setPackingGroup(packingGroup);
	}

	/**
	* Returns the subsidiary risk of this temp dangerous goods items.
	*
	* @return the subsidiary risk of this temp dangerous goods items
	*/
	@Override
	public java.lang.String getSubsidiaryRisk() {
		return _tempDangerousGoodsItems.getSubsidiaryRisk();
	}

	/**
	* Sets the subsidiary risk of this temp dangerous goods items.
	*
	* @param subsidiaryRisk the subsidiary risk of this temp dangerous goods items
	*/
	@Override
	public void setSubsidiaryRisk(java.lang.String subsidiaryRisk) {
		_tempDangerousGoodsItems.setSubsidiaryRisk(subsidiaryRisk);
	}

	/**
	* Returns the flash point of this temp dangerous goods items.
	*
	* @return the flash point of this temp dangerous goods items
	*/
	@Override
	public java.lang.String getFlashPoint() {
		return _tempDangerousGoodsItems.getFlashPoint();
	}

	/**
	* Sets the flash point of this temp dangerous goods items.
	*
	* @param flashPoint the flash point of this temp dangerous goods items
	*/
	@Override
	public void setFlashPoint(java.lang.String flashPoint) {
		_tempDangerousGoodsItems.setFlashPoint(flashPoint);
	}

	/**
	* Returns the marine pollutant of this temp dangerous goods items.
	*
	* @return the marine pollutant of this temp dangerous goods items
	*/
	@Override
	public java.lang.String getMarinePollutant() {
		return _tempDangerousGoodsItems.getMarinePollutant();
	}

	/**
	* Sets the marine pollutant of this temp dangerous goods items.
	*
	* @param marinePollutant the marine pollutant of this temp dangerous goods items
	*/
	@Override
	public void setMarinePollutant(java.lang.String marinePollutant) {
		_tempDangerousGoodsItems.setMarinePollutant(marinePollutant);
	}

	/**
	* Returns the gross weight of this temp dangerous goods items.
	*
	* @return the gross weight of this temp dangerous goods items
	*/
	@Override
	public long getGrossWeight() {
		return _tempDangerousGoodsItems.getGrossWeight();
	}

	/**
	* Sets the gross weight of this temp dangerous goods items.
	*
	* @param grossWeight the gross weight of this temp dangerous goods items
	*/
	@Override
	public void setGrossWeight(long grossWeight) {
		_tempDangerousGoodsItems.setGrossWeight(grossWeight);
	}

	/**
	* Returns the ems of this temp dangerous goods items.
	*
	* @return the ems of this temp dangerous goods items
	*/
	@Override
	public java.lang.String getEms() {
		return _tempDangerousGoodsItems.getEms();
	}

	/**
	* Sets the ems of this temp dangerous goods items.
	*
	* @param ems the ems of this temp dangerous goods items
	*/
	@Override
	public void setEms(java.lang.String ems) {
		_tempDangerousGoodsItems.setEms(ems);
	}

	@Override
	public boolean isNew() {
		return _tempDangerousGoodsItems.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tempDangerousGoodsItems.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tempDangerousGoodsItems.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tempDangerousGoodsItems.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tempDangerousGoodsItems.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tempDangerousGoodsItems.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tempDangerousGoodsItems.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tempDangerousGoodsItems.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tempDangerousGoodsItems.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tempDangerousGoodsItems.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tempDangerousGoodsItems.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TempDangerousGoodsItemsWrapper((TempDangerousGoodsItems)_tempDangerousGoodsItems.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.TempDangerousGoodsItems tempDangerousGoodsItems) {
		return _tempDangerousGoodsItems.compareTo(tempDangerousGoodsItems);
	}

	@Override
	public int hashCode() {
		return _tempDangerousGoodsItems.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.TempDangerousGoodsItems> toCacheModel() {
		return _tempDangerousGoodsItems.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempDangerousGoodsItems toEscapedModel() {
		return new TempDangerousGoodsItemsWrapper(_tempDangerousGoodsItems.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempDangerousGoodsItems toUnescapedModel() {
		return new TempDangerousGoodsItemsWrapper(_tempDangerousGoodsItems.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tempDangerousGoodsItems.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tempDangerousGoodsItems.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempDangerousGoodsItems.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TempDangerousGoodsItemsWrapper)) {
			return false;
		}

		TempDangerousGoodsItemsWrapper tempDangerousGoodsItemsWrapper = (TempDangerousGoodsItemsWrapper)obj;

		if (Validator.equals(_tempDangerousGoodsItems,
					tempDangerousGoodsItemsWrapper._tempDangerousGoodsItems)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TempDangerousGoodsItems getWrappedTempDangerousGoodsItems() {
		return _tempDangerousGoodsItems;
	}

	@Override
	public TempDangerousGoodsItems getWrappedModel() {
		return _tempDangerousGoodsItems;
	}

	@Override
	public void resetOriginalValues() {
		_tempDangerousGoodsItems.resetOriginalValues();
	}

	private TempDangerousGoodsItems _tempDangerousGoodsItems;
}