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
 * This class is a wrapper for {@link Document}.
 * </p>
 *
 * @author longdm
 * @see Document
 * @generated
 */
public class DocumentWrapper implements Document, ModelWrapper<Document> {
	public DocumentWrapper(Document document) {
		_document = document;
	}

	@Override
	public Class<?> getModelClass() {
		return Document.class;
	}

	@Override
	public String getModelClassName() {
		return Document.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("documentName", getDocumentName());
		attributes.put("userCreated", getUserCreated());
		attributes.put("documentTypeCode", getDocumentTypeCode());
		attributes.put("callSign", getCallSign());
		attributes.put("preDocumentName", getPreDocumentName());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("lastModifiedDate", getLastModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long documentName = (Long)attributes.get("documentName");

		if (documentName != null) {
			setDocumentName(documentName);
		}

		String userCreated = (String)attributes.get("userCreated");

		if (userCreated != null) {
			setUserCreated(userCreated);
		}

		String documentTypeCode = (String)attributes.get("documentTypeCode");

		if (documentTypeCode != null) {
			setDocumentTypeCode(documentTypeCode);
		}

		String callSign = (String)attributes.get("callSign");

		if (callSign != null) {
			setCallSign(callSign);
		}

		String preDocumentName = (String)attributes.get("preDocumentName");

		if (preDocumentName != null) {
			setPreDocumentName(preDocumentName);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		Date lastModifiedDate = (Date)attributes.get("lastModifiedDate");

		if (lastModifiedDate != null) {
			setLastModifiedDate(lastModifiedDate);
		}
	}

	/**
	* Returns the primary key of this document.
	*
	* @return the primary key of this document
	*/
	@Override
	public long getPrimaryKey() {
		return _document.getPrimaryKey();
	}

	/**
	* Sets the primary key of this document.
	*
	* @param primaryKey the primary key of this document
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_document.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this document.
	*
	* @return the ID of this document
	*/
	@Override
	public long getId() {
		return _document.getId();
	}

	/**
	* Sets the ID of this document.
	*
	* @param id the ID of this document
	*/
	@Override
	public void setId(long id) {
		_document.setId(id);
	}

	/**
	* Returns the document name of this document.
	*
	* @return the document name of this document
	*/
	@Override
	public long getDocumentName() {
		return _document.getDocumentName();
	}

	/**
	* Sets the document name of this document.
	*
	* @param documentName the document name of this document
	*/
	@Override
	public void setDocumentName(long documentName) {
		_document.setDocumentName(documentName);
	}

	/**
	* Returns the user created of this document.
	*
	* @return the user created of this document
	*/
	@Override
	public java.lang.String getUserCreated() {
		return _document.getUserCreated();
	}

	/**
	* Sets the user created of this document.
	*
	* @param userCreated the user created of this document
	*/
	@Override
	public void setUserCreated(java.lang.String userCreated) {
		_document.setUserCreated(userCreated);
	}

	/**
	* Returns the document type code of this document.
	*
	* @return the document type code of this document
	*/
	@Override
	public java.lang.String getDocumentTypeCode() {
		return _document.getDocumentTypeCode();
	}

	/**
	* Sets the document type code of this document.
	*
	* @param documentTypeCode the document type code of this document
	*/
	@Override
	public void setDocumentTypeCode(java.lang.String documentTypeCode) {
		_document.setDocumentTypeCode(documentTypeCode);
	}

	/**
	* Returns the call sign of this document.
	*
	* @return the call sign of this document
	*/
	@Override
	public java.lang.String getCallSign() {
		return _document.getCallSign();
	}

	/**
	* Sets the call sign of this document.
	*
	* @param callSign the call sign of this document
	*/
	@Override
	public void setCallSign(java.lang.String callSign) {
		_document.setCallSign(callSign);
	}

	/**
	* Returns the pre document name of this document.
	*
	* @return the pre document name of this document
	*/
	@Override
	public java.lang.String getPreDocumentName() {
		return _document.getPreDocumentName();
	}

	/**
	* Sets the pre document name of this document.
	*
	* @param preDocumentName the pre document name of this document
	*/
	@Override
	public void setPreDocumentName(java.lang.String preDocumentName) {
		_document.setPreDocumentName(preDocumentName);
	}

	/**
	* Returns the created date of this document.
	*
	* @return the created date of this document
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _document.getCreatedDate();
	}

	/**
	* Sets the created date of this document.
	*
	* @param createdDate the created date of this document
	*/
	@Override
	public void setCreatedDate(java.util.Date createdDate) {
		_document.setCreatedDate(createdDate);
	}

	/**
	* Returns the last modified date of this document.
	*
	* @return the last modified date of this document
	*/
	@Override
	public java.util.Date getLastModifiedDate() {
		return _document.getLastModifiedDate();
	}

	/**
	* Sets the last modified date of this document.
	*
	* @param lastModifiedDate the last modified date of this document
	*/
	@Override
	public void setLastModifiedDate(java.util.Date lastModifiedDate) {
		_document.setLastModifiedDate(lastModifiedDate);
	}

	@Override
	public boolean isNew() {
		return _document.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_document.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _document.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_document.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _document.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _document.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_document.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _document.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_document.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_document.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_document.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DocumentWrapper((Document)_document.clone());
	}

	@Override
	public int compareTo(Document document) {
		return _document.compareTo(document);
	}

	@Override
	public int hashCode() {
		return _document.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<Document> toCacheModel() {
		return _document.toCacheModel();
	}

	@Override
	public Document toEscapedModel() {
		return new DocumentWrapper(_document.toEscapedModel());
	}

	@Override
	public Document toUnescapedModel() {
		return new DocumentWrapper(_document.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _document.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _document.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_document.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DocumentWrapper)) {
			return false;
		}

		DocumentWrapper documentWrapper = (DocumentWrapper)obj;

		if (Validator.equals(_document, documentWrapper._document)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Document getWrappedDocument() {
		return _document;
	}

	@Override
	public Document getWrappedModel() {
		return _document;
	}

	@Override
	public void resetOriginalValues() {
		_document.resetOriginalValues();
	}

	private Document _document;
}