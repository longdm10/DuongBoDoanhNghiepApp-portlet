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
 * This class is a wrapper for {@link DmHistoryPassportType}.
 * </p>
 *
 * @author longdm
 * @see DmHistoryPassportType
 * @generated
 */
public class DmHistoryPassportTypeWrapper implements DmHistoryPassportType,
	ModelWrapper<DmHistoryPassportType> {
	public DmHistoryPassportTypeWrapper(
		DmHistoryPassportType dmHistoryPassportType) {
		_dmHistoryPassportType = dmHistoryPassportType;
	}

	@Override
	public Class<?> getModelClass() {
		return DmHistoryPassportType.class;
	}

	@Override
	public String getModelClassName() {
		return DmHistoryPassportType.class.getName();
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
	* Returns the primary key of this dm history passport type.
	*
	* @return the primary key of this dm history passport type
	*/
	@Override
	public int getPrimaryKey() {
		return _dmHistoryPassportType.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm history passport type.
	*
	* @param primaryKey the primary key of this dm history passport type
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_dmHistoryPassportType.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm history passport type.
	*
	* @return the ID of this dm history passport type
	*/
	@Override
	public int getId() {
		return _dmHistoryPassportType.getId();
	}

	/**
	* Sets the ID of this dm history passport type.
	*
	* @param id the ID of this dm history passport type
	*/
	@Override
	public void setId(int id) {
		_dmHistoryPassportType.setId(id);
	}

	/**
	* Returns the passport type code of this dm history passport type.
	*
	* @return the passport type code of this dm history passport type
	*/
	@Override
	public java.lang.String getPassportTypeCode() {
		return _dmHistoryPassportType.getPassportTypeCode();
	}

	/**
	* Sets the passport type code of this dm history passport type.
	*
	* @param passportTypeCode the passport type code of this dm history passport type
	*/
	@Override
	public void setPassportTypeCode(java.lang.String passportTypeCode) {
		_dmHistoryPassportType.setPassportTypeCode(passportTypeCode);
	}

	/**
	* Returns the passport type of this dm history passport type.
	*
	* @return the passport type of this dm history passport type
	*/
	@Override
	public java.lang.String getPassportType() {
		return _dmHistoryPassportType.getPassportType();
	}

	/**
	* Sets the passport type of this dm history passport type.
	*
	* @param passportType the passport type of this dm history passport type
	*/
	@Override
	public void setPassportType(java.lang.String passportType) {
		_dmHistoryPassportType.setPassportType(passportType);
	}

	/**
	* Returns the passport type name of this dm history passport type.
	*
	* @return the passport type name of this dm history passport type
	*/
	@Override
	public java.lang.String getPassportTypeName() {
		return _dmHistoryPassportType.getPassportTypeName();
	}

	/**
	* Sets the passport type name of this dm history passport type.
	*
	* @param passportTypeName the passport type name of this dm history passport type
	*/
	@Override
	public void setPassportTypeName(java.lang.String passportTypeName) {
		_dmHistoryPassportType.setPassportTypeName(passportTypeName);
	}

	/**
	* Returns the passport type name v n of this dm history passport type.
	*
	* @return the passport type name v n of this dm history passport type
	*/
	@Override
	public java.lang.String getPassportTypeNameVN() {
		return _dmHistoryPassportType.getPassportTypeNameVN();
	}

	/**
	* Sets the passport type name v n of this dm history passport type.
	*
	* @param passportTypeNameVN the passport type name v n of this dm history passport type
	*/
	@Override
	public void setPassportTypeNameVN(java.lang.String passportTypeNameVN) {
		_dmHistoryPassportType.setPassportTypeNameVN(passportTypeNameVN);
	}

	/**
	* Returns the is delete of this dm history passport type.
	*
	* @return the is delete of this dm history passport type
	*/
	@Override
	public int getIsDelete() {
		return _dmHistoryPassportType.getIsDelete();
	}

	/**
	* Sets the is delete of this dm history passport type.
	*
	* @param isDelete the is delete of this dm history passport type
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmHistoryPassportType.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm history passport type.
	*
	* @return the marked as delete of this dm history passport type
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmHistoryPassportType.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm history passport type.
	*
	* @param markedAsDelete the marked as delete of this dm history passport type
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmHistoryPassportType.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm history passport type.
	*
	* @return the modified date of this dm history passport type
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmHistoryPassportType.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm history passport type.
	*
	* @param modifiedDate the modified date of this dm history passport type
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmHistoryPassportType.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm history passport type.
	*
	* @return the requested date of this dm history passport type
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmHistoryPassportType.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm history passport type.
	*
	* @param requestedDate the requested date of this dm history passport type
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmHistoryPassportType.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm history passport type.
	*
	* @return the sync version of this dm history passport type
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmHistoryPassportType.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm history passport type.
	*
	* @param syncVersion the sync version of this dm history passport type
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmHistoryPassportType.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmHistoryPassportType.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmHistoryPassportType.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmHistoryPassportType.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmHistoryPassportType.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmHistoryPassportType.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmHistoryPassportType.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmHistoryPassportType.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmHistoryPassportType.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmHistoryPassportType.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmHistoryPassportType.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmHistoryPassportType.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmHistoryPassportTypeWrapper((DmHistoryPassportType)_dmHistoryPassportType.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryPassportType dmHistoryPassportType) {
		return _dmHistoryPassportType.compareTo(dmHistoryPassportType);
	}

	@Override
	public int hashCode() {
		return _dmHistoryPassportType.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPassportType> toCacheModel() {
		return _dmHistoryPassportType.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryPassportType toEscapedModel() {
		return new DmHistoryPassportTypeWrapper(_dmHistoryPassportType.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryPassportType toUnescapedModel() {
		return new DmHistoryPassportTypeWrapper(_dmHistoryPassportType.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmHistoryPassportType.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmHistoryPassportType.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryPassportType.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmHistoryPassportTypeWrapper)) {
			return false;
		}

		DmHistoryPassportTypeWrapper dmHistoryPassportTypeWrapper = (DmHistoryPassportTypeWrapper)obj;

		if (Validator.equals(_dmHistoryPassportType,
					dmHistoryPassportTypeWrapper._dmHistoryPassportType)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmHistoryPassportType getWrappedDmHistoryPassportType() {
		return _dmHistoryPassportType;
	}

	@Override
	public DmHistoryPassportType getWrappedModel() {
		return _dmHistoryPassportType;
	}

	@Override
	public void resetOriginalValues() {
		_dmHistoryPassportType.resetOriginalValues();
	}

	private DmHistoryPassportType _dmHistoryPassportType;
}