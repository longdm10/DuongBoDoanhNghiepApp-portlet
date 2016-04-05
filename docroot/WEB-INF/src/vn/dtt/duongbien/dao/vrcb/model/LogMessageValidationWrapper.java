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
 * This class is a wrapper for {@link LogMessageValidation}.
 * </p>
 *
 * @author longdm
 * @see LogMessageValidation
 * @generated
 */
public class LogMessageValidationWrapper implements LogMessageValidation,
	ModelWrapper<LogMessageValidation> {
	public LogMessageValidationWrapper(
		LogMessageValidation logMessageValidation) {
		_logMessageValidation = logMessageValidation;
	}

	@Override
	public Class<?> getModelClass() {
		return LogMessageValidation.class;
	}

	@Override
	public String getModelClassName() {
		return LogMessageValidation.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("requestCode", getRequestCode());
		attributes.put("requestDirection", getRequestDirection());
		attributes.put("requestDate", getRequestDate());
		attributes.put("documentName", getDocumentName());
		attributes.put("documentYear", getDocumentYear());
		attributes.put("documentType", getDocumentType());
		attributes.put("tagProperty", getTagProperty());
		attributes.put("dataValidation", getDataValidation());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String requestCode = (String)attributes.get("requestCode");

		if (requestCode != null) {
			setRequestCode(requestCode);
		}

		String requestDirection = (String)attributes.get("requestDirection");

		if (requestDirection != null) {
			setRequestDirection(requestDirection);
		}

		Date requestDate = (Date)attributes.get("requestDate");

		if (requestDate != null) {
			setRequestDate(requestDate);
		}

		Long documentName = (Long)attributes.get("documentName");

		if (documentName != null) {
			setDocumentName(documentName);
		}

		Integer documentYear = (Integer)attributes.get("documentYear");

		if (documentYear != null) {
			setDocumentYear(documentYear);
		}

		String documentType = (String)attributes.get("documentType");

		if (documentType != null) {
			setDocumentType(documentType);
		}

		String tagProperty = (String)attributes.get("tagProperty");

		if (tagProperty != null) {
			setTagProperty(tagProperty);
		}

		String dataValidation = (String)attributes.get("dataValidation");

		if (dataValidation != null) {
			setDataValidation(dataValidation);
		}
	}

	/**
	* Returns the primary key of this log message validation.
	*
	* @return the primary key of this log message validation
	*/
	@Override
	public long getPrimaryKey() {
		return _logMessageValidation.getPrimaryKey();
	}

	/**
	* Sets the primary key of this log message validation.
	*
	* @param primaryKey the primary key of this log message validation
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_logMessageValidation.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this log message validation.
	*
	* @return the ID of this log message validation
	*/
	@Override
	public long getId() {
		return _logMessageValidation.getId();
	}

	/**
	* Sets the ID of this log message validation.
	*
	* @param id the ID of this log message validation
	*/
	@Override
	public void setId(long id) {
		_logMessageValidation.setId(id);
	}

	/**
	* Returns the request code of this log message validation.
	*
	* @return the request code of this log message validation
	*/
	@Override
	public java.lang.String getRequestCode() {
		return _logMessageValidation.getRequestCode();
	}

	/**
	* Sets the request code of this log message validation.
	*
	* @param requestCode the request code of this log message validation
	*/
	@Override
	public void setRequestCode(java.lang.String requestCode) {
		_logMessageValidation.setRequestCode(requestCode);
	}

	/**
	* Returns the request direction of this log message validation.
	*
	* @return the request direction of this log message validation
	*/
	@Override
	public java.lang.String getRequestDirection() {
		return _logMessageValidation.getRequestDirection();
	}

	/**
	* Sets the request direction of this log message validation.
	*
	* @param requestDirection the request direction of this log message validation
	*/
	@Override
	public void setRequestDirection(java.lang.String requestDirection) {
		_logMessageValidation.setRequestDirection(requestDirection);
	}

	/**
	* Returns the request date of this log message validation.
	*
	* @return the request date of this log message validation
	*/
	@Override
	public java.util.Date getRequestDate() {
		return _logMessageValidation.getRequestDate();
	}

	/**
	* Sets the request date of this log message validation.
	*
	* @param requestDate the request date of this log message validation
	*/
	@Override
	public void setRequestDate(java.util.Date requestDate) {
		_logMessageValidation.setRequestDate(requestDate);
	}

	/**
	* Returns the document name of this log message validation.
	*
	* @return the document name of this log message validation
	*/
	@Override
	public long getDocumentName() {
		return _logMessageValidation.getDocumentName();
	}

	/**
	* Sets the document name of this log message validation.
	*
	* @param documentName the document name of this log message validation
	*/
	@Override
	public void setDocumentName(long documentName) {
		_logMessageValidation.setDocumentName(documentName);
	}

	/**
	* Returns the document year of this log message validation.
	*
	* @return the document year of this log message validation
	*/
	@Override
	public int getDocumentYear() {
		return _logMessageValidation.getDocumentYear();
	}

	/**
	* Sets the document year of this log message validation.
	*
	* @param documentYear the document year of this log message validation
	*/
	@Override
	public void setDocumentYear(int documentYear) {
		_logMessageValidation.setDocumentYear(documentYear);
	}

	/**
	* Returns the document type of this log message validation.
	*
	* @return the document type of this log message validation
	*/
	@Override
	public java.lang.String getDocumentType() {
		return _logMessageValidation.getDocumentType();
	}

	/**
	* Sets the document type of this log message validation.
	*
	* @param documentType the document type of this log message validation
	*/
	@Override
	public void setDocumentType(java.lang.String documentType) {
		_logMessageValidation.setDocumentType(documentType);
	}

	/**
	* Returns the tag property of this log message validation.
	*
	* @return the tag property of this log message validation
	*/
	@Override
	public java.lang.String getTagProperty() {
		return _logMessageValidation.getTagProperty();
	}

	/**
	* Sets the tag property of this log message validation.
	*
	* @param tagProperty the tag property of this log message validation
	*/
	@Override
	public void setTagProperty(java.lang.String tagProperty) {
		_logMessageValidation.setTagProperty(tagProperty);
	}

	/**
	* Returns the data validation of this log message validation.
	*
	* @return the data validation of this log message validation
	*/
	@Override
	public java.lang.String getDataValidation() {
		return _logMessageValidation.getDataValidation();
	}

	/**
	* Sets the data validation of this log message validation.
	*
	* @param dataValidation the data validation of this log message validation
	*/
	@Override
	public void setDataValidation(java.lang.String dataValidation) {
		_logMessageValidation.setDataValidation(dataValidation);
	}

	@Override
	public boolean isNew() {
		return _logMessageValidation.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_logMessageValidation.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _logMessageValidation.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_logMessageValidation.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _logMessageValidation.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _logMessageValidation.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_logMessageValidation.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _logMessageValidation.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_logMessageValidation.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_logMessageValidation.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_logMessageValidation.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new LogMessageValidationWrapper((LogMessageValidation)_logMessageValidation.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.LogMessageValidation logMessageValidation) {
		return _logMessageValidation.compareTo(logMessageValidation);
	}

	@Override
	public int hashCode() {
		return _logMessageValidation.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.LogMessageValidation> toCacheModel() {
		return _logMessageValidation.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.LogMessageValidation toEscapedModel() {
		return new LogMessageValidationWrapper(_logMessageValidation.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.LogMessageValidation toUnescapedModel() {
		return new LogMessageValidationWrapper(_logMessageValidation.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _logMessageValidation.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _logMessageValidation.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_logMessageValidation.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LogMessageValidationWrapper)) {
			return false;
		}

		LogMessageValidationWrapper logMessageValidationWrapper = (LogMessageValidationWrapper)obj;

		if (Validator.equals(_logMessageValidation,
					logMessageValidationWrapper._logMessageValidation)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public LogMessageValidation getWrappedLogMessageValidation() {
		return _logMessageValidation;
	}

	@Override
	public LogMessageValidation getWrappedModel() {
		return _logMessageValidation;
	}

	@Override
	public void resetOriginalValues() {
		_logMessageValidation.resetOriginalValues();
	}

	private LogMessageValidation _logMessageValidation;
}