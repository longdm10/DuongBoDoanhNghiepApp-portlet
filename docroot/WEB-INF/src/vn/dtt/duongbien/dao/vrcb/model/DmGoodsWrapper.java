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
 * This class is a wrapper for {@link DmGoods}.
 * </p>
 *
 * @author longdm
 * @see DmGoods
 * @generated
 */
public class DmGoodsWrapper implements DmGoods, ModelWrapper<DmGoods> {
	public DmGoodsWrapper(DmGoods dmGoods) {
		_dmGoods = dmGoods;
	}

	@Override
	public Class<?> getModelClass() {
		return DmGoods.class;
	}

	@Override
	public String getModelClassName() {
		return DmGoods.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("goodsItemCode", getGoodsItemCode());
		attributes.put("goodsItemName", getGoodsItemName());
		attributes.put("goodsItemNameVN", getGoodsItemNameVN());
		attributes.put("goodsItemOrder", getGoodsItemOrder());
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

		String goodsItemCode = (String)attributes.get("goodsItemCode");

		if (goodsItemCode != null) {
			setGoodsItemCode(goodsItemCode);
		}

		String goodsItemName = (String)attributes.get("goodsItemName");

		if (goodsItemName != null) {
			setGoodsItemName(goodsItemName);
		}

		String goodsItemNameVN = (String)attributes.get("goodsItemNameVN");

		if (goodsItemNameVN != null) {
			setGoodsItemNameVN(goodsItemNameVN);
		}

		Integer goodsItemOrder = (Integer)attributes.get("goodsItemOrder");

		if (goodsItemOrder != null) {
			setGoodsItemOrder(goodsItemOrder);
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
	* Returns the primary key of this dm goods.
	*
	* @return the primary key of this dm goods
	*/
	@Override
	public int getPrimaryKey() {
		return _dmGoods.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm goods.
	*
	* @param primaryKey the primary key of this dm goods
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_dmGoods.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm goods.
	*
	* @return the ID of this dm goods
	*/
	@Override
	public int getId() {
		return _dmGoods.getId();
	}

	/**
	* Sets the ID of this dm goods.
	*
	* @param id the ID of this dm goods
	*/
	@Override
	public void setId(int id) {
		_dmGoods.setId(id);
	}

	/**
	* Returns the goods item code of this dm goods.
	*
	* @return the goods item code of this dm goods
	*/
	@Override
	public java.lang.String getGoodsItemCode() {
		return _dmGoods.getGoodsItemCode();
	}

	/**
	* Sets the goods item code of this dm goods.
	*
	* @param goodsItemCode the goods item code of this dm goods
	*/
	@Override
	public void setGoodsItemCode(java.lang.String goodsItemCode) {
		_dmGoods.setGoodsItemCode(goodsItemCode);
	}

	/**
	* Returns the goods item name of this dm goods.
	*
	* @return the goods item name of this dm goods
	*/
	@Override
	public java.lang.String getGoodsItemName() {
		return _dmGoods.getGoodsItemName();
	}

	/**
	* Sets the goods item name of this dm goods.
	*
	* @param goodsItemName the goods item name of this dm goods
	*/
	@Override
	public void setGoodsItemName(java.lang.String goodsItemName) {
		_dmGoods.setGoodsItemName(goodsItemName);
	}

	/**
	* Returns the goods item name v n of this dm goods.
	*
	* @return the goods item name v n of this dm goods
	*/
	@Override
	public java.lang.String getGoodsItemNameVN() {
		return _dmGoods.getGoodsItemNameVN();
	}

	/**
	* Sets the goods item name v n of this dm goods.
	*
	* @param goodsItemNameVN the goods item name v n of this dm goods
	*/
	@Override
	public void setGoodsItemNameVN(java.lang.String goodsItemNameVN) {
		_dmGoods.setGoodsItemNameVN(goodsItemNameVN);
	}

	/**
	* Returns the goods item order of this dm goods.
	*
	* @return the goods item order of this dm goods
	*/
	@Override
	public int getGoodsItemOrder() {
		return _dmGoods.getGoodsItemOrder();
	}

	/**
	* Sets the goods item order of this dm goods.
	*
	* @param goodsItemOrder the goods item order of this dm goods
	*/
	@Override
	public void setGoodsItemOrder(int goodsItemOrder) {
		_dmGoods.setGoodsItemOrder(goodsItemOrder);
	}

	/**
	* Returns the is delete of this dm goods.
	*
	* @return the is delete of this dm goods
	*/
	@Override
	public int getIsDelete() {
		return _dmGoods.getIsDelete();
	}

	/**
	* Sets the is delete of this dm goods.
	*
	* @param isDelete the is delete of this dm goods
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmGoods.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm goods.
	*
	* @return the marked as delete of this dm goods
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmGoods.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm goods.
	*
	* @param markedAsDelete the marked as delete of this dm goods
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmGoods.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm goods.
	*
	* @return the modified date of this dm goods
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmGoods.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm goods.
	*
	* @param modifiedDate the modified date of this dm goods
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmGoods.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm goods.
	*
	* @return the requested date of this dm goods
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmGoods.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm goods.
	*
	* @param requestedDate the requested date of this dm goods
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmGoods.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm goods.
	*
	* @return the sync version of this dm goods
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmGoods.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm goods.
	*
	* @param syncVersion the sync version of this dm goods
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmGoods.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmGoods.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmGoods.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmGoods.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmGoods.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmGoods.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmGoods.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmGoods.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmGoods.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmGoods.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmGoods.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmGoods.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmGoodsWrapper((DmGoods)_dmGoods.clone());
	}

	@Override
	public int compareTo(vn.dtt.duongbien.dao.vrcb.model.DmGoods dmGoods) {
		return _dmGoods.compareTo(dmGoods);
	}

	@Override
	public int hashCode() {
		return _dmGoods.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.DmGoods> toCacheModel() {
		return _dmGoods.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGoods toEscapedModel() {
		return new DmGoodsWrapper(_dmGoods.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGoods toUnescapedModel() {
		return new DmGoodsWrapper(_dmGoods.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmGoods.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmGoods.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmGoods.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmGoodsWrapper)) {
			return false;
		}

		DmGoodsWrapper dmGoodsWrapper = (DmGoodsWrapper)obj;

		if (Validator.equals(_dmGoods, dmGoodsWrapper._dmGoods)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmGoods getWrappedDmGoods() {
		return _dmGoods;
	}

	@Override
	public DmGoods getWrappedModel() {
		return _dmGoods;
	}

	@Override
	public void resetOriginalValues() {
		_dmGoods.resetOriginalValues();
	}

	private DmGoods _dmGoods;
}