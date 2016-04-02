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
 * This class is a wrapper for {@link DmGoodsType}.
 * </p>
 *
 * @author longdm
 * @see DmGoodsType
 * @generated
 */
public class DmGoodsTypeWrapper implements DmGoodsType,
	ModelWrapper<DmGoodsType> {
	public DmGoodsTypeWrapper(DmGoodsType dmGoodsType) {
		_dmGoodsType = dmGoodsType;
	}

	@Override
	public Class<?> getModelClass() {
		return DmGoodsType.class;
	}

	@Override
	public String getModelClassName() {
		return DmGoodsType.class.getName();
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
	* Returns the primary key of this dm goods type.
	*
	* @return the primary key of this dm goods type
	*/
	@Override
	public int getPrimaryKey() {
		return _dmGoodsType.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm goods type.
	*
	* @param primaryKey the primary key of this dm goods type
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_dmGoodsType.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm goods type.
	*
	* @return the ID of this dm goods type
	*/
	@Override
	public int getId() {
		return _dmGoodsType.getId();
	}

	/**
	* Sets the ID of this dm goods type.
	*
	* @param id the ID of this dm goods type
	*/
	@Override
	public void setId(int id) {
		_dmGoodsType.setId(id);
	}

	/**
	* Returns the goods type code of this dm goods type.
	*
	* @return the goods type code of this dm goods type
	*/
	@Override
	public java.lang.String getGoodsTypeCode() {
		return _dmGoodsType.getGoodsTypeCode();
	}

	/**
	* Sets the goods type code of this dm goods type.
	*
	* @param goodsTypeCode the goods type code of this dm goods type
	*/
	@Override
	public void setGoodsTypeCode(java.lang.String goodsTypeCode) {
		_dmGoodsType.setGoodsTypeCode(goodsTypeCode);
	}

	/**
	* Returns the goods type name of this dm goods type.
	*
	* @return the goods type name of this dm goods type
	*/
	@Override
	public java.lang.String getGoodsTypeName() {
		return _dmGoodsType.getGoodsTypeName();
	}

	/**
	* Sets the goods type name of this dm goods type.
	*
	* @param goodsTypeName the goods type name of this dm goods type
	*/
	@Override
	public void setGoodsTypeName(java.lang.String goodsTypeName) {
		_dmGoodsType.setGoodsTypeName(goodsTypeName);
	}

	/**
	* Returns the goods type name v n of this dm goods type.
	*
	* @return the goods type name v n of this dm goods type
	*/
	@Override
	public java.lang.String getGoodsTypeNameVN() {
		return _dmGoodsType.getGoodsTypeNameVN();
	}

	/**
	* Sets the goods type name v n of this dm goods type.
	*
	* @param goodsTypeNameVN the goods type name v n of this dm goods type
	*/
	@Override
	public void setGoodsTypeNameVN(java.lang.String goodsTypeNameVN) {
		_dmGoodsType.setGoodsTypeNameVN(goodsTypeNameVN);
	}

	/**
	* Returns the goods type order of this dm goods type.
	*
	* @return the goods type order of this dm goods type
	*/
	@Override
	public int getGoodsTypeOrder() {
		return _dmGoodsType.getGoodsTypeOrder();
	}

	/**
	* Sets the goods type order of this dm goods type.
	*
	* @param goodsTypeOrder the goods type order of this dm goods type
	*/
	@Override
	public void setGoodsTypeOrder(int goodsTypeOrder) {
		_dmGoodsType.setGoodsTypeOrder(goodsTypeOrder);
	}

	/**
	* Returns the is delete of this dm goods type.
	*
	* @return the is delete of this dm goods type
	*/
	@Override
	public int getIsDelete() {
		return _dmGoodsType.getIsDelete();
	}

	/**
	* Sets the is delete of this dm goods type.
	*
	* @param isDelete the is delete of this dm goods type
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmGoodsType.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm goods type.
	*
	* @return the marked as delete of this dm goods type
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmGoodsType.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm goods type.
	*
	* @param markedAsDelete the marked as delete of this dm goods type
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmGoodsType.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm goods type.
	*
	* @return the modified date of this dm goods type
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmGoodsType.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm goods type.
	*
	* @param modifiedDate the modified date of this dm goods type
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmGoodsType.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm goods type.
	*
	* @return the requested date of this dm goods type
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmGoodsType.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm goods type.
	*
	* @param requestedDate the requested date of this dm goods type
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmGoodsType.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm goods type.
	*
	* @return the sync version of this dm goods type
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmGoodsType.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm goods type.
	*
	* @param syncVersion the sync version of this dm goods type
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmGoodsType.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmGoodsType.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmGoodsType.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmGoodsType.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmGoodsType.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmGoodsType.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmGoodsType.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmGoodsType.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmGoodsType.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmGoodsType.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmGoodsType.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmGoodsType.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmGoodsTypeWrapper((DmGoodsType)_dmGoodsType.clone());
	}

	@Override
	public int compareTo(DmGoodsType dmGoodsType) {
		return _dmGoodsType.compareTo(dmGoodsType);
	}

	@Override
	public int hashCode() {
		return _dmGoodsType.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<DmGoodsType> toCacheModel() {
		return _dmGoodsType.toCacheModel();
	}

	@Override
	public DmGoodsType toEscapedModel() {
		return new DmGoodsTypeWrapper(_dmGoodsType.toEscapedModel());
	}

	@Override
	public DmGoodsType toUnescapedModel() {
		return new DmGoodsTypeWrapper(_dmGoodsType.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmGoodsType.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmGoodsType.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmGoodsType.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmGoodsTypeWrapper)) {
			return false;
		}

		DmGoodsTypeWrapper dmGoodsTypeWrapper = (DmGoodsTypeWrapper)obj;

		if (Validator.equals(_dmGoodsType, dmGoodsTypeWrapper._dmGoodsType)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmGoodsType getWrappedDmGoodsType() {
		return _dmGoodsType;
	}

	@Override
	public DmGoodsType getWrappedModel() {
		return _dmGoodsType;
	}

	@Override
	public void resetOriginalValues() {
		_dmGoodsType.resetOriginalValues();
	}

	private DmGoodsType _dmGoodsType;
}