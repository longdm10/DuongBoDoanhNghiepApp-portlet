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
 * This class is a wrapper for {@link DmGTBusinessType}.
 * </p>
 *
 * @author longdm
 * @see DmGTBusinessType
 * @generated
 */
public class DmGTBusinessTypeWrapper implements DmGTBusinessType,
	ModelWrapper<DmGTBusinessType> {
	public DmGTBusinessTypeWrapper(DmGTBusinessType dmGTBusinessType) {
		_dmGTBusinessType = dmGTBusinessType;
	}

	@Override
	public Class<?> getModelClass() {
		return DmGTBusinessType.class;
	}

	@Override
	public String getModelClassName() {
		return DmGTBusinessType.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("businessTypeCode", getBusinessTypeCode());
		attributes.put("businessTypeName", getBusinessTypeName());
		attributes.put("businessTypeNameVN", getBusinessTypeNameVN());
		attributes.put("businessTypeOrder", getBusinessTypeOrder());
		attributes.put("isDelete", getIsDelete());
		attributes.put("markedAsDelete", getMarkedAsDelete());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("requestedDate", getRequestedDate());
		attributes.put("syncVersion", getSyncVersion());
		attributes.put("remarks", getRemarks());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer businessTypeCode = (Integer)attributes.get("businessTypeCode");

		if (businessTypeCode != null) {
			setBusinessTypeCode(businessTypeCode);
		}

		String businessTypeName = (String)attributes.get("businessTypeName");

		if (businessTypeName != null) {
			setBusinessTypeName(businessTypeName);
		}

		String businessTypeNameVN = (String)attributes.get("businessTypeNameVN");

		if (businessTypeNameVN != null) {
			setBusinessTypeNameVN(businessTypeNameVN);
		}

		Integer businessTypeOrder = (Integer)attributes.get("businessTypeOrder");

		if (businessTypeOrder != null) {
			setBusinessTypeOrder(businessTypeOrder);
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

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}
	}

	/**
	* Returns the primary key of this dm g t business type.
	*
	* @return the primary key of this dm g t business type
	*/
	@Override
	public long getPrimaryKey() {
		return _dmGTBusinessType.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm g t business type.
	*
	* @param primaryKey the primary key of this dm g t business type
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dmGTBusinessType.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm g t business type.
	*
	* @return the ID of this dm g t business type
	*/
	@Override
	public long getId() {
		return _dmGTBusinessType.getId();
	}

	/**
	* Sets the ID of this dm g t business type.
	*
	* @param id the ID of this dm g t business type
	*/
	@Override
	public void setId(long id) {
		_dmGTBusinessType.setId(id);
	}

	/**
	* Returns the business type code of this dm g t business type.
	*
	* @return the business type code of this dm g t business type
	*/
	@Override
	public int getBusinessTypeCode() {
		return _dmGTBusinessType.getBusinessTypeCode();
	}

	/**
	* Sets the business type code of this dm g t business type.
	*
	* @param businessTypeCode the business type code of this dm g t business type
	*/
	@Override
	public void setBusinessTypeCode(int businessTypeCode) {
		_dmGTBusinessType.setBusinessTypeCode(businessTypeCode);
	}

	/**
	* Returns the business type name of this dm g t business type.
	*
	* @return the business type name of this dm g t business type
	*/
	@Override
	public java.lang.String getBusinessTypeName() {
		return _dmGTBusinessType.getBusinessTypeName();
	}

	/**
	* Sets the business type name of this dm g t business type.
	*
	* @param businessTypeName the business type name of this dm g t business type
	*/
	@Override
	public void setBusinessTypeName(java.lang.String businessTypeName) {
		_dmGTBusinessType.setBusinessTypeName(businessTypeName);
	}

	/**
	* Returns the business type name v n of this dm g t business type.
	*
	* @return the business type name v n of this dm g t business type
	*/
	@Override
	public java.lang.String getBusinessTypeNameVN() {
		return _dmGTBusinessType.getBusinessTypeNameVN();
	}

	/**
	* Sets the business type name v n of this dm g t business type.
	*
	* @param businessTypeNameVN the business type name v n of this dm g t business type
	*/
	@Override
	public void setBusinessTypeNameVN(java.lang.String businessTypeNameVN) {
		_dmGTBusinessType.setBusinessTypeNameVN(businessTypeNameVN);
	}

	/**
	* Returns the business type order of this dm g t business type.
	*
	* @return the business type order of this dm g t business type
	*/
	@Override
	public int getBusinessTypeOrder() {
		return _dmGTBusinessType.getBusinessTypeOrder();
	}

	/**
	* Sets the business type order of this dm g t business type.
	*
	* @param businessTypeOrder the business type order of this dm g t business type
	*/
	@Override
	public void setBusinessTypeOrder(int businessTypeOrder) {
		_dmGTBusinessType.setBusinessTypeOrder(businessTypeOrder);
	}

	/**
	* Returns the is delete of this dm g t business type.
	*
	* @return the is delete of this dm g t business type
	*/
	@Override
	public int getIsDelete() {
		return _dmGTBusinessType.getIsDelete();
	}

	/**
	* Sets the is delete of this dm g t business type.
	*
	* @param isDelete the is delete of this dm g t business type
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmGTBusinessType.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm g t business type.
	*
	* @return the marked as delete of this dm g t business type
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmGTBusinessType.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm g t business type.
	*
	* @param markedAsDelete the marked as delete of this dm g t business type
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmGTBusinessType.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm g t business type.
	*
	* @return the modified date of this dm g t business type
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmGTBusinessType.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm g t business type.
	*
	* @param modifiedDate the modified date of this dm g t business type
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmGTBusinessType.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm g t business type.
	*
	* @return the requested date of this dm g t business type
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmGTBusinessType.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm g t business type.
	*
	* @param requestedDate the requested date of this dm g t business type
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmGTBusinessType.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm g t business type.
	*
	* @return the sync version of this dm g t business type
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmGTBusinessType.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm g t business type.
	*
	* @param syncVersion the sync version of this dm g t business type
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmGTBusinessType.setSyncVersion(syncVersion);
	}

	/**
	* Returns the remarks of this dm g t business type.
	*
	* @return the remarks of this dm g t business type
	*/
	@Override
	public java.lang.String getRemarks() {
		return _dmGTBusinessType.getRemarks();
	}

	/**
	* Sets the remarks of this dm g t business type.
	*
	* @param remarks the remarks of this dm g t business type
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_dmGTBusinessType.setRemarks(remarks);
	}

	@Override
	public boolean isNew() {
		return _dmGTBusinessType.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmGTBusinessType.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmGTBusinessType.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmGTBusinessType.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmGTBusinessType.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmGTBusinessType.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmGTBusinessType.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmGTBusinessType.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmGTBusinessType.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmGTBusinessType.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmGTBusinessType.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmGTBusinessTypeWrapper((DmGTBusinessType)_dmGTBusinessType.clone());
	}

	@Override
	public int compareTo(DmGTBusinessType dmGTBusinessType) {
		return _dmGTBusinessType.compareTo(dmGTBusinessType);
	}

	@Override
	public int hashCode() {
		return _dmGTBusinessType.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<DmGTBusinessType> toCacheModel() {
		return _dmGTBusinessType.toCacheModel();
	}

	@Override
	public DmGTBusinessType toEscapedModel() {
		return new DmGTBusinessTypeWrapper(_dmGTBusinessType.toEscapedModel());
	}

	@Override
	public DmGTBusinessType toUnescapedModel() {
		return new DmGTBusinessTypeWrapper(_dmGTBusinessType.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmGTBusinessType.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmGTBusinessType.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmGTBusinessType.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmGTBusinessTypeWrapper)) {
			return false;
		}

		DmGTBusinessTypeWrapper dmGTBusinessTypeWrapper = (DmGTBusinessTypeWrapper)obj;

		if (Validator.equals(_dmGTBusinessType,
					dmGTBusinessTypeWrapper._dmGTBusinessType)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmGTBusinessType getWrappedDmGTBusinessType() {
		return _dmGTBusinessType;
	}

	@Override
	public DmGTBusinessType getWrappedModel() {
		return _dmGTBusinessType;
	}

	@Override
	public void resetOriginalValues() {
		_dmGTBusinessType.resetOriginalValues();
	}

	private DmGTBusinessType _dmGTBusinessType;
}