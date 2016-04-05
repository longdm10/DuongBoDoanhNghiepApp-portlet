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
 * This class is a wrapper for {@link DmHistoryGoodsType}.
 * </p>
 *
 * @author longdm
 * @see DmHistoryGoodsType
 * @generated
 */
public class DmHistoryGoodsTypeWrapper implements DmHistoryGoodsType,
	ModelWrapper<DmHistoryGoodsType> {
	public DmHistoryGoodsTypeWrapper(DmHistoryGoodsType dmHistoryGoodsType) {
		_dmHistoryGoodsType = dmHistoryGoodsType;
	}

	@Override
	public Class<?> getModelClass() {
		return DmHistoryGoodsType.class;
	}

	@Override
	public String getModelClassName() {
		return DmHistoryGoodsType.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("goodsTypeCode", getGoodsTypeCode());
		attributes.put("goodsTypeName", getGoodsTypeName());
		attributes.put("goodsTypeNameVN", getGoodsTypeNameVN());
		attributes.put("goodsTypeOrder", getGoodsTypeOrder());
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

		String goodsTypeCode = (String)attributes.get("goodsTypeCode");

		if (goodsTypeCode != null) {
			setGoodsTypeCode(goodsTypeCode);
		}

		String goodsTypeName = (String)attributes.get("goodsTypeName");

		if (goodsTypeName != null) {
			setGoodsTypeName(goodsTypeName);
		}

		String goodsTypeNameVN = (String)attributes.get("goodsTypeNameVN");

		if (goodsTypeNameVN != null) {
			setGoodsTypeNameVN(goodsTypeNameVN);
		}

		Integer goodsTypeOrder = (Integer)attributes.get("goodsTypeOrder");

		if (goodsTypeOrder != null) {
			setGoodsTypeOrder(goodsTypeOrder);
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
	* Returns the primary key of this dm history goods type.
	*
	* @return the primary key of this dm history goods type
	*/
	@Override
	public int getPrimaryKey() {
		return _dmHistoryGoodsType.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm history goods type.
	*
	* @param primaryKey the primary key of this dm history goods type
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_dmHistoryGoodsType.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm history goods type.
	*
	* @return the ID of this dm history goods type
	*/
	@Override
	public int getId() {
		return _dmHistoryGoodsType.getId();
	}

	/**
	* Sets the ID of this dm history goods type.
	*
	* @param id the ID of this dm history goods type
	*/
	@Override
	public void setId(int id) {
		_dmHistoryGoodsType.setId(id);
	}

	/**
	* Returns the goods type code of this dm history goods type.
	*
	* @return the goods type code of this dm history goods type
	*/
	@Override
	public java.lang.String getGoodsTypeCode() {
		return _dmHistoryGoodsType.getGoodsTypeCode();
	}

	/**
	* Sets the goods type code of this dm history goods type.
	*
	* @param goodsTypeCode the goods type code of this dm history goods type
	*/
	@Override
	public void setGoodsTypeCode(java.lang.String goodsTypeCode) {
		_dmHistoryGoodsType.setGoodsTypeCode(goodsTypeCode);
	}

	/**
	* Returns the goods type name of this dm history goods type.
	*
	* @return the goods type name of this dm history goods type
	*/
	@Override
	public java.lang.String getGoodsTypeName() {
		return _dmHistoryGoodsType.getGoodsTypeName();
	}

	/**
	* Sets the goods type name of this dm history goods type.
	*
	* @param goodsTypeName the goods type name of this dm history goods type
	*/
	@Override
	public void setGoodsTypeName(java.lang.String goodsTypeName) {
		_dmHistoryGoodsType.setGoodsTypeName(goodsTypeName);
	}

	/**
	* Returns the goods type name v n of this dm history goods type.
	*
	* @return the goods type name v n of this dm history goods type
	*/
	@Override
	public java.lang.String getGoodsTypeNameVN() {
		return _dmHistoryGoodsType.getGoodsTypeNameVN();
	}

	/**
	* Sets the goods type name v n of this dm history goods type.
	*
	* @param goodsTypeNameVN the goods type name v n of this dm history goods type
	*/
	@Override
	public void setGoodsTypeNameVN(java.lang.String goodsTypeNameVN) {
		_dmHistoryGoodsType.setGoodsTypeNameVN(goodsTypeNameVN);
	}

	/**
	* Returns the goods type order of this dm history goods type.
	*
	* @return the goods type order of this dm history goods type
	*/
	@Override
	public int getGoodsTypeOrder() {
		return _dmHistoryGoodsType.getGoodsTypeOrder();
	}

	/**
	* Sets the goods type order of this dm history goods type.
	*
	* @param goodsTypeOrder the goods type order of this dm history goods type
	*/
	@Override
	public void setGoodsTypeOrder(int goodsTypeOrder) {
		_dmHistoryGoodsType.setGoodsTypeOrder(goodsTypeOrder);
	}

	/**
	* Returns the is delete of this dm history goods type.
	*
	* @return the is delete of this dm history goods type
	*/
	@Override
	public int getIsDelete() {
		return _dmHistoryGoodsType.getIsDelete();
	}

	/**
	* Sets the is delete of this dm history goods type.
	*
	* @param isDelete the is delete of this dm history goods type
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmHistoryGoodsType.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm history goods type.
	*
	* @return the marked as delete of this dm history goods type
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmHistoryGoodsType.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm history goods type.
	*
	* @param markedAsDelete the marked as delete of this dm history goods type
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmHistoryGoodsType.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm history goods type.
	*
	* @return the modified date of this dm history goods type
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmHistoryGoodsType.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm history goods type.
	*
	* @param modifiedDate the modified date of this dm history goods type
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmHistoryGoodsType.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm history goods type.
	*
	* @return the requested date of this dm history goods type
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmHistoryGoodsType.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm history goods type.
	*
	* @param requestedDate the requested date of this dm history goods type
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmHistoryGoodsType.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm history goods type.
	*
	* @return the sync version of this dm history goods type
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmHistoryGoodsType.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm history goods type.
	*
	* @param syncVersion the sync version of this dm history goods type
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmHistoryGoodsType.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmHistoryGoodsType.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmHistoryGoodsType.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmHistoryGoodsType.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmHistoryGoodsType.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmHistoryGoodsType.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmHistoryGoodsType.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmHistoryGoodsType.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmHistoryGoodsType.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmHistoryGoodsType.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmHistoryGoodsType.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmHistoryGoodsType.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmHistoryGoodsTypeWrapper((DmHistoryGoodsType)_dmHistoryGoodsType.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType dmHistoryGoodsType) {
		return _dmHistoryGoodsType.compareTo(dmHistoryGoodsType);
	}

	@Override
	public int hashCode() {
		return _dmHistoryGoodsType.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType> toCacheModel() {
		return _dmHistoryGoodsType.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType toEscapedModel() {
		return new DmHistoryGoodsTypeWrapper(_dmHistoryGoodsType.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType toUnescapedModel() {
		return new DmHistoryGoodsTypeWrapper(_dmHistoryGoodsType.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmHistoryGoodsType.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmHistoryGoodsType.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryGoodsType.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmHistoryGoodsTypeWrapper)) {
			return false;
		}

		DmHistoryGoodsTypeWrapper dmHistoryGoodsTypeWrapper = (DmHistoryGoodsTypeWrapper)obj;

		if (Validator.equals(_dmHistoryGoodsType,
					dmHistoryGoodsTypeWrapper._dmHistoryGoodsType)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmHistoryGoodsType getWrappedDmHistoryGoodsType() {
		return _dmHistoryGoodsType;
	}

	@Override
	public DmHistoryGoodsType getWrappedModel() {
		return _dmHistoryGoodsType;
	}

	@Override
	public void resetOriginalValues() {
		_dmHistoryGoodsType.resetOriginalValues();
	}

	private DmHistoryGoodsType _dmHistoryGoodsType;
}