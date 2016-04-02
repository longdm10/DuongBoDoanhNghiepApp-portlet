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
 * This class is a wrapper for {@link DmPassportType}.
 * </p>
 *
 * @author longdm
 * @see DmPassportType
 * @generated
 */
public class DmPassportTypeWrapper implements DmPassportType,
	ModelWrapper<DmPassportType> {
	public DmPassportTypeWrapper(DmPassportType dmPassportType) {
		_dmPassportType = dmPassportType;
	}

	@Override
	public Class<?> getModelClass() {
		return DmPassportType.class;
	}

	@Override
	public String getModelClassName() {
		return DmPassportType.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("passportTypeCode", getPassportTypeCode());
		attributes.put("passportType", getPassportType());
		attributes.put("passportTypeName", getPassportTypeName());
		attributes.put("passportTypeNameVN", getPassportTypeNameVN());
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

		String passportTypeCode = (String)attributes.get("passportTypeCode");

		if (passportTypeCode != null) {
			setPassportTypeCode(passportTypeCode);
		}

		String passportType = (String)attributes.get("passportType");

		if (passportType != null) {
			setPassportType(passportType);
		}

		String passportTypeName = (String)attributes.get("passportTypeName");

		if (passportTypeName != null) {
			setPassportTypeName(passportTypeName);
		}

		String passportTypeNameVN = (String)attributes.get("passportTypeNameVN");

		if (passportTypeNameVN != null) {
			setPassportTypeNameVN(passportTypeNameVN);
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
	* Returns the primary key of this dm passport type.
	*
	* @return the primary key of this dm passport type
	*/
	@Override
	public int getPrimaryKey() {
		return _dmPassportType.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm passport type.
	*
	* @param primaryKey the primary key of this dm passport type
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_dmPassportType.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm passport type.
	*
	* @return the ID of this dm passport type
	*/
	@Override
	public int getId() {
		return _dmPassportType.getId();
	}

	/**
	* Sets the ID of this dm passport type.
	*
	* @param id the ID of this dm passport type
	*/
	@Override
	public void setId(int id) {
		_dmPassportType.setId(id);
	}

	/**
	* Returns the passport type code of this dm passport type.
	*
	* @return the passport type code of this dm passport type
	*/
	@Override
	public java.lang.String getPassportTypeCode() {
		return _dmPassportType.getPassportTypeCode();
	}

	/**
	* Sets the passport type code of this dm passport type.
	*
	* @param passportTypeCode the passport type code of this dm passport type
	*/
	@Override
	public void setPassportTypeCode(java.lang.String passportTypeCode) {
		_dmPassportType.setPassportTypeCode(passportTypeCode);
	}

	/**
	* Returns the passport type of this dm passport type.
	*
	* @return the passport type of this dm passport type
	*/
	@Override
	public java.lang.String getPassportType() {
		return _dmPassportType.getPassportType();
	}

	/**
	* Sets the passport type of this dm passport type.
	*
	* @param passportType the passport type of this dm passport type
	*/
	@Override
	public void setPassportType(java.lang.String passportType) {
		_dmPassportType.setPassportType(passportType);
	}

	/**
	* Returns the passport type name of this dm passport type.
	*
	* @return the passport type name of this dm passport type
	*/
	@Override
	public java.lang.String getPassportTypeName() {
		return _dmPassportType.getPassportTypeName();
	}

	/**
	* Sets the passport type name of this dm passport type.
	*
	* @param passportTypeName the passport type name of this dm passport type
	*/
	@Override
	public void setPassportTypeName(java.lang.String passportTypeName) {
		_dmPassportType.setPassportTypeName(passportTypeName);
	}

	/**
	* Returns the passport type name v n of this dm passport type.
	*
	* @return the passport type name v n of this dm passport type
	*/
	@Override
	public java.lang.String getPassportTypeNameVN() {
		return _dmPassportType.getPassportTypeNameVN();
	}

	/**
	* Sets the passport type name v n of this dm passport type.
	*
	* @param passportTypeNameVN the passport type name v n of this dm passport type
	*/
	@Override
	public void setPassportTypeNameVN(java.lang.String passportTypeNameVN) {
		_dmPassportType.setPassportTypeNameVN(passportTypeNameVN);
	}

	/**
	* Returns the is delete of this dm passport type.
	*
	* @return the is delete of this dm passport type
	*/
	@Override
	public int getIsDelete() {
		return _dmPassportType.getIsDelete();
	}

	/**
	* Sets the is delete of this dm passport type.
	*
	* @param isDelete the is delete of this dm passport type
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmPassportType.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm passport type.
	*
	* @return the marked as delete of this dm passport type
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmPassportType.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm passport type.
	*
	* @param markedAsDelete the marked as delete of this dm passport type
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmPassportType.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm passport type.
	*
	* @return the modified date of this dm passport type
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmPassportType.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm passport type.
	*
	* @param modifiedDate the modified date of this dm passport type
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmPassportType.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm passport type.
	*
	* @return the requested date of this dm passport type
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmPassportType.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm passport type.
	*
	* @param requestedDate the requested date of this dm passport type
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmPassportType.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm passport type.
	*
	* @return the sync version of this dm passport type
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmPassportType.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm passport type.
	*
	* @param syncVersion the sync version of this dm passport type
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmPassportType.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmPassportType.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmPassportType.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmPassportType.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmPassportType.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmPassportType.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmPassportType.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmPassportType.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmPassportType.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmPassportType.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmPassportType.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmPassportType.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmPassportTypeWrapper((DmPassportType)_dmPassportType.clone());
	}

	@Override
	public int compareTo(DmPassportType dmPassportType) {
		return _dmPassportType.compareTo(dmPassportType);
	}

	@Override
	public int hashCode() {
		return _dmPassportType.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<DmPassportType> toCacheModel() {
		return _dmPassportType.toCacheModel();
	}

	@Override
	public DmPassportType toEscapedModel() {
		return new DmPassportTypeWrapper(_dmPassportType.toEscapedModel());
	}

	@Override
	public DmPassportType toUnescapedModel() {
		return new DmPassportTypeWrapper(_dmPassportType.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmPassportType.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmPassportType.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmPassportType.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmPassportTypeWrapper)) {
			return false;
		}

		DmPassportTypeWrapper dmPassportTypeWrapper = (DmPassportTypeWrapper)obj;

		if (Validator.equals(_dmPassportType,
					dmPassportTypeWrapper._dmPassportType)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmPassportType getWrappedDmPassportType() {
		return _dmPassportType;
	}

	@Override
	public DmPassportType getWrappedModel() {
		return _dmPassportType;
	}

	@Override
	public void resetOriginalValues() {
		_dmPassportType.resetOriginalValues();
	}

	private DmPassportType _dmPassportType;
}