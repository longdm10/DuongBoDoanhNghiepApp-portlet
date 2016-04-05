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
 * This class is a wrapper for {@link DmDocType}.
 * </p>
 *
 * @author longdm
 * @see DmDocType
 * @generated
 */
public class DmDocTypeWrapper implements DmDocType, ModelWrapper<DmDocType> {
	public DmDocTypeWrapper(DmDocType dmDocType) {
		_dmDocType = dmDocType;
	}

	@Override
	public Class<?> getModelClass() {
		return DmDocType.class;
	}

	@Override
	public String getModelClassName() {
		return DmDocType.class.getName();
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
	* Returns the primary key of this dm doc type.
	*
	* @return the primary key of this dm doc type
	*/
	@Override
	public int getPrimaryKey() {
		return _dmDocType.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm doc type.
	*
	* @param primaryKey the primary key of this dm doc type
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_dmDocType.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm doc type.
	*
	* @return the ID of this dm doc type
	*/
	@Override
	public int getId() {
		return _dmDocType.getId();
	}

	/**
	* Sets the ID of this dm doc type.
	*
	* @param id the ID of this dm doc type
	*/
	@Override
	public void setId(int id) {
		_dmDocType.setId(id);
	}

	/**
	* Returns the document type code of this dm doc type.
	*
	* @return the document type code of this dm doc type
	*/
	@Override
	public java.lang.String getDocumentTypeCode() {
		return _dmDocType.getDocumentTypeCode();
	}

	/**
	* Sets the document type code of this dm doc type.
	*
	* @param documentTypeCode the document type code of this dm doc type
	*/
	@Override
	public void setDocumentTypeCode(java.lang.String documentTypeCode) {
		_dmDocType.setDocumentTypeCode(documentTypeCode);
	}

	/**
	* Returns the document type of this dm doc type.
	*
	* @return the document type of this dm doc type
	*/
	@Override
	public java.lang.String getDocumentType() {
		return _dmDocType.getDocumentType();
	}

	/**
	* Sets the document type of this dm doc type.
	*
	* @param documentType the document type of this dm doc type
	*/
	@Override
	public void setDocumentType(java.lang.String documentType) {
		_dmDocType.setDocumentType(documentType);
	}

	/**
	* Returns the document type name of this dm doc type.
	*
	* @return the document type name of this dm doc type
	*/
	@Override
	public java.lang.String getDocumentTypeName() {
		return _dmDocType.getDocumentTypeName();
	}

	/**
	* Sets the document type name of this dm doc type.
	*
	* @param documentTypeName the document type name of this dm doc type
	*/
	@Override
	public void setDocumentTypeName(java.lang.String documentTypeName) {
		_dmDocType.setDocumentTypeName(documentTypeName);
	}

	/**
	* Returns the is delete of this dm doc type.
	*
	* @return the is delete of this dm doc type
	*/
	@Override
	public int getIsDelete() {
		return _dmDocType.getIsDelete();
	}

	/**
	* Sets the is delete of this dm doc type.
	*
	* @param isDelete the is delete of this dm doc type
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmDocType.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm doc type.
	*
	* @return the marked as delete of this dm doc type
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmDocType.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm doc type.
	*
	* @param markedAsDelete the marked as delete of this dm doc type
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmDocType.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm doc type.
	*
	* @return the modified date of this dm doc type
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmDocType.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm doc type.
	*
	* @param modifiedDate the modified date of this dm doc type
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmDocType.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm doc type.
	*
	* @return the requested date of this dm doc type
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmDocType.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm doc type.
	*
	* @param requestedDate the requested date of this dm doc type
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmDocType.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm doc type.
	*
	* @return the sync version of this dm doc type
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmDocType.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm doc type.
	*
	* @param syncVersion the sync version of this dm doc type
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmDocType.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmDocType.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmDocType.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmDocType.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmDocType.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmDocType.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmDocType.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmDocType.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmDocType.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmDocType.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmDocType.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmDocType.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmDocTypeWrapper((DmDocType)_dmDocType.clone());
	}

	@Override
	public int compareTo(vn.dtt.duongbien.dao.vrcb.model.DmDocType dmDocType) {
		return _dmDocType.compareTo(dmDocType);
	}

	@Override
	public int hashCode() {
		return _dmDocType.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.DmDocType> toCacheModel() {
		return _dmDocType.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmDocType toEscapedModel() {
		return new DmDocTypeWrapper(_dmDocType.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmDocType toUnescapedModel() {
		return new DmDocTypeWrapper(_dmDocType.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmDocType.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmDocType.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmDocType.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmDocTypeWrapper)) {
			return false;
		}

		DmDocTypeWrapper dmDocTypeWrapper = (DmDocTypeWrapper)obj;

		if (Validator.equals(_dmDocType, dmDocTypeWrapper._dmDocType)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmDocType getWrappedDmDocType() {
		return _dmDocType;
	}

	@Override
	public DmDocType getWrappedModel() {
		return _dmDocType;
	}

	@Override
	public void resetOriginalValues() {
		_dmDocType.resetOriginalValues();
	}

	private DmDocType _dmDocType;
}