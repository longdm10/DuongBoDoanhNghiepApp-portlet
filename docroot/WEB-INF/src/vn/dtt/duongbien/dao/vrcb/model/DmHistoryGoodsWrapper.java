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
 * This class is a wrapper for {@link DmHistoryGoods}.
 * </p>
 *
 * @author longdm
 * @see DmHistoryGoods
 * @generated
 */
public class DmHistoryGoodsWrapper implements DmHistoryGoods,
	ModelWrapper<DmHistoryGoods> {
	public DmHistoryGoodsWrapper(DmHistoryGoods dmHistoryGoods) {
		_dmHistoryGoods = dmHistoryGoods;
	}

	@Override
	public Class<?> getModelClass() {
		return DmHistoryGoods.class;
	}

	@Override
	public String getModelClassName() {
		return DmHistoryGoods.class.getName();
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
	* Returns the primary key of this dm history goods.
	*
	* @return the primary key of this dm history goods
	*/
	@Override
	public int getPrimaryKey() {
		return _dmHistoryGoods.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm history goods.
	*
	* @param primaryKey the primary key of this dm history goods
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_dmHistoryGoods.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm history goods.
	*
	* @return the ID of this dm history goods
	*/
	@Override
	public int getId() {
		return _dmHistoryGoods.getId();
	}

	/**
	* Sets the ID of this dm history goods.
	*
	* @param id the ID of this dm history goods
	*/
	@Override
	public void setId(int id) {
		_dmHistoryGoods.setId(id);
	}

	/**
	* Returns the goods item code of this dm history goods.
	*
	* @return the goods item code of this dm history goods
	*/
	@Override
	public java.lang.String getGoodsItemCode() {
		return _dmHistoryGoods.getGoodsItemCode();
	}

	/**
	* Sets the goods item code of this dm history goods.
	*
	* @param goodsItemCode the goods item code of this dm history goods
	*/
	@Override
	public void setGoodsItemCode(java.lang.String goodsItemCode) {
		_dmHistoryGoods.setGoodsItemCode(goodsItemCode);
	}

	/**
	* Returns the goods item name of this dm history goods.
	*
	* @return the goods item name of this dm history goods
	*/
	@Override
	public java.lang.String getGoodsItemName() {
		return _dmHistoryGoods.getGoodsItemName();
	}

	/**
	* Sets the goods item name of this dm history goods.
	*
	* @param goodsItemName the goods item name of this dm history goods
	*/
	@Override
	public void setGoodsItemName(java.lang.String goodsItemName) {
		_dmHistoryGoods.setGoodsItemName(goodsItemName);
	}

	/**
	* Returns the goods item name v n of this dm history goods.
	*
	* @return the goods item name v n of this dm history goods
	*/
	@Override
	public java.lang.String getGoodsItemNameVN() {
		return _dmHistoryGoods.getGoodsItemNameVN();
	}

	/**
	* Sets the goods item name v n of this dm history goods.
	*
	* @param goodsItemNameVN the goods item name v n of this dm history goods
	*/
	@Override
	public void setGoodsItemNameVN(java.lang.String goodsItemNameVN) {
		_dmHistoryGoods.setGoodsItemNameVN(goodsItemNameVN);
	}

	/**
	* Returns the goods item order of this dm history goods.
	*
	* @return the goods item order of this dm history goods
	*/
	@Override
	public int getGoodsItemOrder() {
		return _dmHistoryGoods.getGoodsItemOrder();
	}

	/**
	* Sets the goods item order of this dm history goods.
	*
	* @param goodsItemOrder the goods item order of this dm history goods
	*/
	@Override
	public void setGoodsItemOrder(int goodsItemOrder) {
		_dmHistoryGoods.setGoodsItemOrder(goodsItemOrder);
	}

	/**
	* Returns the is delete of this dm history goods.
	*
	* @return the is delete of this dm history goods
	*/
	@Override
	public int getIsDelete() {
		return _dmHistoryGoods.getIsDelete();
	}

	/**
	* Sets the is delete of this dm history goods.
	*
	* @param isDelete the is delete of this dm history goods
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmHistoryGoods.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm history goods.
	*
	* @return the marked as delete of this dm history goods
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmHistoryGoods.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm history goods.
	*
	* @param markedAsDelete the marked as delete of this dm history goods
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmHistoryGoods.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm history goods.
	*
	* @return the modified date of this dm history goods
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmHistoryGoods.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm history goods.
	*
	* @param modifiedDate the modified date of this dm history goods
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmHistoryGoods.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm history goods.
	*
	* @return the requested date of this dm history goods
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmHistoryGoods.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm history goods.
	*
	* @param requestedDate the requested date of this dm history goods
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmHistoryGoods.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm history goods.
	*
	* @return the sync version of this dm history goods
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmHistoryGoods.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm history goods.
	*
	* @param syncVersion the sync version of this dm history goods
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmHistoryGoods.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmHistoryGoods.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmHistoryGoods.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmHistoryGoods.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmHistoryGoods.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmHistoryGoods.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmHistoryGoods.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmHistoryGoods.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmHistoryGoods.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmHistoryGoods.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmHistoryGoods.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmHistoryGoods.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmHistoryGoodsWrapper((DmHistoryGoods)_dmHistoryGoods.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods dmHistoryGoods) {
		return _dmHistoryGoods.compareTo(dmHistoryGoods);
	}

	@Override
	public int hashCode() {
		return _dmHistoryGoods.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods> toCacheModel() {
		return _dmHistoryGoods.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods toEscapedModel() {
		return new DmHistoryGoodsWrapper(_dmHistoryGoods.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods toUnescapedModel() {
		return new DmHistoryGoodsWrapper(_dmHistoryGoods.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmHistoryGoods.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmHistoryGoods.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryGoods.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmHistoryGoodsWrapper)) {
			return false;
		}

		DmHistoryGoodsWrapper dmHistoryGoodsWrapper = (DmHistoryGoodsWrapper)obj;

		if (Validator.equals(_dmHistoryGoods,
					dmHistoryGoodsWrapper._dmHistoryGoods)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmHistoryGoods getWrappedDmHistoryGoods() {
		return _dmHistoryGoods;
	}

	@Override
	public DmHistoryGoods getWrappedModel() {
		return _dmHistoryGoods;
	}

	@Override
	public void resetOriginalValues() {
		_dmHistoryGoods.resetOriginalValues();
	}

	private DmHistoryGoods _dmHistoryGoods;
}