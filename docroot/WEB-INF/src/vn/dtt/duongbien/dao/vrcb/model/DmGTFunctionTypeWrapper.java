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
 * This class is a wrapper for {@link DmGTFunctionType}.
 * </p>
 *
 * @author longdm
 * @see DmGTFunctionType
 * @generated
 */
public class DmGTFunctionTypeWrapper implements DmGTFunctionType,
	ModelWrapper<DmGTFunctionType> {
	public DmGTFunctionTypeWrapper(DmGTFunctionType dmGTFunctionType) {
		_dmGTFunctionType = dmGTFunctionType;
	}

	@Override
	public Class<?> getModelClass() {
		return DmGTFunctionType.class;
	}

	@Override
	public String getModelClassName() {
		return DmGTFunctionType.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("functionTypeCode", getFunctionTypeCode());
		attributes.put("functionTypeName", getFunctionTypeName());
		attributes.put("functionTypeNameVN", getFunctionTypeNameVN());
		attributes.put("functionTypeOrder", getFunctionTypeOrder());
		attributes.put("isDelete", getIsDelete());
		attributes.put("markedAsDelete", getMarkedAsDelete());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("requestedDate", getRequestedDate());
		attributes.put("syncVersion", getSyncVersion());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String functionTypeCode = (String)attributes.get("functionTypeCode");

		if (functionTypeCode != null) {
			setFunctionTypeCode(functionTypeCode);
		}

		String functionTypeName = (String)attributes.get("functionTypeName");

		if (functionTypeName != null) {
			setFunctionTypeName(functionTypeName);
		}

		String functionTypeNameVN = (String)attributes.get("functionTypeNameVN");

		if (functionTypeNameVN != null) {
			setFunctionTypeNameVN(functionTypeNameVN);
		}

		Integer functionTypeOrder = (Integer)attributes.get("functionTypeOrder");

		if (functionTypeOrder != null) {
			setFunctionTypeOrder(functionTypeOrder);
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
	* Returns the primary key of this dm g t function type.
	*
	* @return the primary key of this dm g t function type
	*/
	@Override
	public long getPrimaryKey() {
		return _dmGTFunctionType.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm g t function type.
	*
	* @param primaryKey the primary key of this dm g t function type
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dmGTFunctionType.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm g t function type.
	*
	* @return the ID of this dm g t function type
	*/
	@Override
	public long getId() {
		return _dmGTFunctionType.getId();
	}

	/**
	* Sets the ID of this dm g t function type.
	*
	* @param id the ID of this dm g t function type
	*/
	@Override
	public void setId(long id) {
		_dmGTFunctionType.setId(id);
	}

	/**
	* Returns the function type code of this dm g t function type.
	*
	* @return the function type code of this dm g t function type
	*/
	@Override
	public java.lang.String getFunctionTypeCode() {
		return _dmGTFunctionType.getFunctionTypeCode();
	}

	/**
	* Sets the function type code of this dm g t function type.
	*
	* @param functionTypeCode the function type code of this dm g t function type
	*/
	@Override
	public void setFunctionTypeCode(java.lang.String functionTypeCode) {
		_dmGTFunctionType.setFunctionTypeCode(functionTypeCode);
	}

	/**
	* Returns the function type name of this dm g t function type.
	*
	* @return the function type name of this dm g t function type
	*/
	@Override
	public java.lang.String getFunctionTypeName() {
		return _dmGTFunctionType.getFunctionTypeName();
	}

	/**
	* Sets the function type name of this dm g t function type.
	*
	* @param functionTypeName the function type name of this dm g t function type
	*/
	@Override
	public void setFunctionTypeName(java.lang.String functionTypeName) {
		_dmGTFunctionType.setFunctionTypeName(functionTypeName);
	}

	/**
	* Returns the function type name v n of this dm g t function type.
	*
	* @return the function type name v n of this dm g t function type
	*/
	@Override
	public java.lang.String getFunctionTypeNameVN() {
		return _dmGTFunctionType.getFunctionTypeNameVN();
	}

	/**
	* Sets the function type name v n of this dm g t function type.
	*
	* @param functionTypeNameVN the function type name v n of this dm g t function type
	*/
	@Override
	public void setFunctionTypeNameVN(java.lang.String functionTypeNameVN) {
		_dmGTFunctionType.setFunctionTypeNameVN(functionTypeNameVN);
	}

	/**
	* Returns the function type order of this dm g t function type.
	*
	* @return the function type order of this dm g t function type
	*/
	@Override
	public int getFunctionTypeOrder() {
		return _dmGTFunctionType.getFunctionTypeOrder();
	}

	/**
	* Sets the function type order of this dm g t function type.
	*
	* @param functionTypeOrder the function type order of this dm g t function type
	*/
	@Override
	public void setFunctionTypeOrder(int functionTypeOrder) {
		_dmGTFunctionType.setFunctionTypeOrder(functionTypeOrder);
	}

	/**
	* Returns the is delete of this dm g t function type.
	*
	* @return the is delete of this dm g t function type
	*/
	@Override
	public int getIsDelete() {
		return _dmGTFunctionType.getIsDelete();
	}

	/**
	* Sets the is delete of this dm g t function type.
	*
	* @param isDelete the is delete of this dm g t function type
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmGTFunctionType.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm g t function type.
	*
	* @return the marked as delete of this dm g t function type
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmGTFunctionType.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm g t function type.
	*
	* @param markedAsDelete the marked as delete of this dm g t function type
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmGTFunctionType.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm g t function type.
	*
	* @return the modified date of this dm g t function type
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmGTFunctionType.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm g t function type.
	*
	* @param modifiedDate the modified date of this dm g t function type
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmGTFunctionType.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm g t function type.
	*
	* @return the requested date of this dm g t function type
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmGTFunctionType.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm g t function type.
	*
	* @param requestedDate the requested date of this dm g t function type
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmGTFunctionType.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm g t function type.
	*
	* @return the sync version of this dm g t function type
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmGTFunctionType.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm g t function type.
	*
	* @param syncVersion the sync version of this dm g t function type
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmGTFunctionType.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmGTFunctionType.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmGTFunctionType.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmGTFunctionType.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmGTFunctionType.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmGTFunctionType.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmGTFunctionType.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmGTFunctionType.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmGTFunctionType.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmGTFunctionType.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmGTFunctionType.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmGTFunctionType.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmGTFunctionTypeWrapper((DmGTFunctionType)_dmGTFunctionType.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.DmGTFunctionType dmGTFunctionType) {
		return _dmGTFunctionType.compareTo(dmGTFunctionType);
	}

	@Override
	public int hashCode() {
		return _dmGTFunctionType.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.DmGTFunctionType> toCacheModel() {
		return _dmGTFunctionType.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGTFunctionType toEscapedModel() {
		return new DmGTFunctionTypeWrapper(_dmGTFunctionType.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGTFunctionType toUnescapedModel() {
		return new DmGTFunctionTypeWrapper(_dmGTFunctionType.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmGTFunctionType.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmGTFunctionType.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmGTFunctionType.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmGTFunctionTypeWrapper)) {
			return false;
		}

		DmGTFunctionTypeWrapper dmGTFunctionTypeWrapper = (DmGTFunctionTypeWrapper)obj;

		if (Validator.equals(_dmGTFunctionType,
					dmGTFunctionTypeWrapper._dmGTFunctionType)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmGTFunctionType getWrappedDmGTFunctionType() {
		return _dmGTFunctionType;
	}

	@Override
	public DmGTFunctionType getWrappedModel() {
		return _dmGTFunctionType;
	}

	@Override
	public void resetOriginalValues() {
		_dmGTFunctionType.resetOriginalValues();
	}

	private DmGTFunctionType _dmGTFunctionType;
}