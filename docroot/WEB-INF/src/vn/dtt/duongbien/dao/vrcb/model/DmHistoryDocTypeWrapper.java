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
 * This class is a wrapper for {@link DmHistoryDocType}.
 * </p>
 *
 * @author longdm
 * @see DmHistoryDocType
 * @generated
 */
public class DmHistoryDocTypeWrapper implements DmHistoryDocType,
	ModelWrapper<DmHistoryDocType> {
	public DmHistoryDocTypeWrapper(DmHistoryDocType dmHistoryDocType) {
		_dmHistoryDocType = dmHistoryDocType;
	}

	@Override
	public Class<?> getModelClass() {
		return DmHistoryDocType.class;
	}

	@Override
	public String getModelClassName() {
		return DmHistoryDocType.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("documentTypeCode", getDocumentTypeCode());
		attributes.put("documentType", getDocumentType());
		attributes.put("documentTypeName", getDocumentTypeName());
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

		String documentTypeCode = (String)attributes.get("documentTypeCode");

		if (documentTypeCode != null) {
			setDocumentTypeCode(documentTypeCode);
		}

		String documentType = (String)attributes.get("documentType");

		if (documentType != null) {
			setDocumentType(documentType);
		}

		String documentTypeName = (String)attributes.get("documentTypeName");

		if (documentTypeName != null) {
			setDocumentTypeName(documentTypeName);
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
	* Returns the primary key of this dm history doc type.
	*
	* @return the primary key of this dm history doc type
	*/
	@Override
	public int getPrimaryKey() {
		return _dmHistoryDocType.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm history doc type.
	*
	* @param primaryKey the primary key of this dm history doc type
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_dmHistoryDocType.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm history doc type.
	*
	* @return the ID of this dm history doc type
	*/
	@Override
	public int getId() {
		return _dmHistoryDocType.getId();
	}

	/**
	* Sets the ID of this dm history doc type.
	*
	* @param id the ID of this dm history doc type
	*/
	@Override
	public void setId(int id) {
		_dmHistoryDocType.setId(id);
	}

	/**
	* Returns the document type code of this dm history doc type.
	*
	* @return the document type code of this dm history doc type
	*/
	@Override
	public java.lang.String getDocumentTypeCode() {
		return _dmHistoryDocType.getDocumentTypeCode();
	}

	/**
	* Sets the document type code of this dm history doc type.
	*
	* @param documentTypeCode the document type code of this dm history doc type
	*/
	@Override
	public void setDocumentTypeCode(java.lang.String documentTypeCode) {
		_dmHistoryDocType.setDocumentTypeCode(documentTypeCode);
	}

	/**
	* Returns the document type of this dm history doc type.
	*
	* @return the document type of this dm history doc type
	*/
	@Override
	public java.lang.String getDocumentType() {
		return _dmHistoryDocType.getDocumentType();
	}

	/**
	* Sets the document type of this dm history doc type.
	*
	* @param documentType the document type of this dm history doc type
	*/
	@Override
	public void setDocumentType(java.lang.String documentType) {
		_dmHistoryDocType.setDocumentType(documentType);
	}

	/**
	* Returns the document type name of this dm history doc type.
	*
	* @return the document type name of this dm history doc type
	*/
	@Override
	public java.lang.String getDocumentTypeName() {
		return _dmHistoryDocType.getDocumentTypeName();
	}

	/**
	* Sets the document type name of this dm history doc type.
	*
	* @param documentTypeName the document type name of this dm history doc type
	*/
	@Override
	public void setDocumentTypeName(java.lang.String documentTypeName) {
		_dmHistoryDocType.setDocumentTypeName(documentTypeName);
	}

	/**
	* Returns the is delete of this dm history doc type.
	*
	* @return the is delete of this dm history doc type
	*/
	@Override
	public int getIsDelete() {
		return _dmHistoryDocType.getIsDelete();
	}

	/**
	* Sets the is delete of this dm history doc type.
	*
	* @param isDelete the is delete of this dm history doc type
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmHistoryDocType.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm history doc type.
	*
	* @return the marked as delete of this dm history doc type
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmHistoryDocType.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm history doc type.
	*
	* @param markedAsDelete the marked as delete of this dm history doc type
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmHistoryDocType.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm history doc type.
	*
	* @return the modified date of this dm history doc type
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmHistoryDocType.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm history doc type.
	*
	* @param modifiedDate the modified date of this dm history doc type
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmHistoryDocType.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm history doc type.
	*
	* @return the requested date of this dm history doc type
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmHistoryDocType.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm history doc type.
	*
	* @param requestedDate the requested date of this dm history doc type
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmHistoryDocType.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm history doc type.
	*
	* @return the sync version of this dm history doc type
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmHistoryDocType.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm history doc type.
	*
	* @param syncVersion the sync version of this dm history doc type
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmHistoryDocType.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmHistoryDocType.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmHistoryDocType.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmHistoryDocType.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmHistoryDocType.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmHistoryDocType.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmHistoryDocType.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmHistoryDocType.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmHistoryDocType.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmHistoryDocType.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmHistoryDocType.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmHistoryDocType.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmHistoryDocTypeWrapper((DmHistoryDocType)_dmHistoryDocType.clone());
	}

	@Override
	public int compareTo(DmHistoryDocType dmHistoryDocType) {
		return _dmHistoryDocType.compareTo(dmHistoryDocType);
	}

	@Override
	public int hashCode() {
		return _dmHistoryDocType.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<DmHistoryDocType> toCacheModel() {
		return _dmHistoryDocType.toCacheModel();
	}

	@Override
	public DmHistoryDocType toEscapedModel() {
		return new DmHistoryDocTypeWrapper(_dmHistoryDocType.toEscapedModel());
	}

	@Override
	public DmHistoryDocType toUnescapedModel() {
		return new DmHistoryDocTypeWrapper(_dmHistoryDocType.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmHistoryDocType.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmHistoryDocType.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryDocType.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmHistoryDocTypeWrapper)) {
			return false;
		}

		DmHistoryDocTypeWrapper dmHistoryDocTypeWrapper = (DmHistoryDocTypeWrapper)obj;

		if (Validator.equals(_dmHistoryDocType,
					dmHistoryDocTypeWrapper._dmHistoryDocType)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmHistoryDocType getWrappedDmHistoryDocType() {
		return _dmHistoryDocType;
	}

	@Override
	public DmHistoryDocType getWrappedModel() {
		return _dmHistoryDocType;
	}

	@Override
	public void resetOriginalValues() {
		_dmHistoryDocType.resetOriginalValues();
	}

	private DmHistoryDocType _dmHistoryDocType;
}