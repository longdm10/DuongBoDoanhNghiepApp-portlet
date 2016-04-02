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
 * This class is a wrapper for {@link InterfaceRequestField}.
 * </p>
 *
 * @author longdm
 * @see InterfaceRequestField
 * @generated
 */
public class InterfaceRequestFieldWrapper implements InterfaceRequestField,
	ModelWrapper<InterfaceRequestField> {
	public InterfaceRequestFieldWrapper(
		InterfaceRequestField interfaceRequestField) {
		_interfaceRequestField = interfaceRequestField;
	}

	@Override
	public Class<?> getModelClass() {
		return InterfaceRequestField.class;
	}

	@Override
	public String getModelClassName() {
		return InterfaceRequestField.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("requestCode", getRequestCode());
		attributes.put("organizationCode", getOrganizationCode());
		attributes.put("locCode", getLocCode());
		attributes.put("requestDate", getRequestDate());
		attributes.put("requestedDate", getRequestedDate());
		attributes.put("requestDirection", getRequestDirection());
		attributes.put("requestState", getRequestState());
		attributes.put("requestResponseTime", getRequestResponseTime());
		attributes.put("documentType", getDocumentType());
		attributes.put("businessType", getBusinessType());
		attributes.put("functionType", getFunctionType());
		attributes.put("senderName", getSenderName());
		attributes.put("requestVersion", getRequestVersion());
		attributes.put("senderIdentify", getSenderIdentify());
		attributes.put("receiverName", getReceiverName());
		attributes.put("sendingDate", getSendingDate());
		attributes.put("receiverIdentify", getReceiverIdentify());
		attributes.put("remarks", getRemarks());

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

		String organizationCode = (String)attributes.get("organizationCode");

		if (organizationCode != null) {
			setOrganizationCode(organizationCode);
		}

		String locCode = (String)attributes.get("locCode");

		if (locCode != null) {
			setLocCode(locCode);
		}

		Date requestDate = (Date)attributes.get("requestDate");

		if (requestDate != null) {
			setRequestDate(requestDate);
		}

		Date requestedDate = (Date)attributes.get("requestedDate");

		if (requestedDate != null) {
			setRequestedDate(requestedDate);
		}

		String requestDirection = (String)attributes.get("requestDirection");

		if (requestDirection != null) {
			setRequestDirection(requestDirection);
		}

		Integer requestState = (Integer)attributes.get("requestState");

		if (requestState != null) {
			setRequestState(requestState);
		}

		Date requestResponseTime = (Date)attributes.get("requestResponseTime");

		if (requestResponseTime != null) {
			setRequestResponseTime(requestResponseTime);
		}

		String documentType = (String)attributes.get("documentType");

		if (documentType != null) {
			setDocumentType(documentType);
		}

		String businessType = (String)attributes.get("businessType");

		if (businessType != null) {
			setBusinessType(businessType);
		}

		String functionType = (String)attributes.get("functionType");

		if (functionType != null) {
			setFunctionType(functionType);
		}

		String senderName = (String)attributes.get("senderName");

		if (senderName != null) {
			setSenderName(senderName);
		}

		String requestVersion = (String)attributes.get("requestVersion");

		if (requestVersion != null) {
			setRequestVersion(requestVersion);
		}

		String senderIdentify = (String)attributes.get("senderIdentify");

		if (senderIdentify != null) {
			setSenderIdentify(senderIdentify);
		}

		String receiverName = (String)attributes.get("receiverName");

		if (receiverName != null) {
			setReceiverName(receiverName);
		}

		Date sendingDate = (Date)attributes.get("sendingDate");

		if (sendingDate != null) {
			setSendingDate(sendingDate);
		}

		String receiverIdentify = (String)attributes.get("receiverIdentify");

		if (receiverIdentify != null) {
			setReceiverIdentify(receiverIdentify);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}
	}

	/**
	* Returns the primary key of this interface request field.
	*
	* @return the primary key of this interface request field
	*/
	@Override
	public long getPrimaryKey() {
		return _interfaceRequestField.getPrimaryKey();
	}

	/**
	* Sets the primary key of this interface request field.
	*
	* @param primaryKey the primary key of this interface request field
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_interfaceRequestField.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this interface request field.
	*
	* @return the ID of this interface request field
	*/
	@Override
	public long getId() {
		return _interfaceRequestField.getId();
	}

	/**
	* Sets the ID of this interface request field.
	*
	* @param id the ID of this interface request field
	*/
	@Override
	public void setId(long id) {
		_interfaceRequestField.setId(id);
	}

	/**
	* Returns the request code of this interface request field.
	*
	* @return the request code of this interface request field
	*/
	@Override
	public java.lang.String getRequestCode() {
		return _interfaceRequestField.getRequestCode();
	}

	/**
	* Sets the request code of this interface request field.
	*
	* @param requestCode the request code of this interface request field
	*/
	@Override
	public void setRequestCode(java.lang.String requestCode) {
		_interfaceRequestField.setRequestCode(requestCode);
	}

	/**
	* Returns the organization code of this interface request field.
	*
	* @return the organization code of this interface request field
	*/
	@Override
	public java.lang.String getOrganizationCode() {
		return _interfaceRequestField.getOrganizationCode();
	}

	/**
	* Sets the organization code of this interface request field.
	*
	* @param organizationCode the organization code of this interface request field
	*/
	@Override
	public void setOrganizationCode(java.lang.String organizationCode) {
		_interfaceRequestField.setOrganizationCode(organizationCode);
	}

	/**
	* Returns the loc code of this interface request field.
	*
	* @return the loc code of this interface request field
	*/
	@Override
	public java.lang.String getLocCode() {
		return _interfaceRequestField.getLocCode();
	}

	/**
	* Sets the loc code of this interface request field.
	*
	* @param locCode the loc code of this interface request field
	*/
	@Override
	public void setLocCode(java.lang.String locCode) {
		_interfaceRequestField.setLocCode(locCode);
	}

	/**
	* Returns the request date of this interface request field.
	*
	* @return the request date of this interface request field
	*/
	@Override
	public java.util.Date getRequestDate() {
		return _interfaceRequestField.getRequestDate();
	}

	/**
	* Sets the request date of this interface request field.
	*
	* @param requestDate the request date of this interface request field
	*/
	@Override
	public void setRequestDate(java.util.Date requestDate) {
		_interfaceRequestField.setRequestDate(requestDate);
	}

	/**
	* Returns the requested date of this interface request field.
	*
	* @return the requested date of this interface request field
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _interfaceRequestField.getRequestedDate();
	}

	/**
	* Sets the requested date of this interface request field.
	*
	* @param requestedDate the requested date of this interface request field
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_interfaceRequestField.setRequestedDate(requestedDate);
	}

	/**
	* Returns the request direction of this interface request field.
	*
	* @return the request direction of this interface request field
	*/
	@Override
	public java.lang.String getRequestDirection() {
		return _interfaceRequestField.getRequestDirection();
	}

	/**
	* Sets the request direction of this interface request field.
	*
	* @param requestDirection the request direction of this interface request field
	*/
	@Override
	public void setRequestDirection(java.lang.String requestDirection) {
		_interfaceRequestField.setRequestDirection(requestDirection);
	}

	/**
	* Returns the request state of this interface request field.
	*
	* @return the request state of this interface request field
	*/
	@Override
	public int getRequestState() {
		return _interfaceRequestField.getRequestState();
	}

	/**
	* Sets the request state of this interface request field.
	*
	* @param requestState the request state of this interface request field
	*/
	@Override
	public void setRequestState(int requestState) {
		_interfaceRequestField.setRequestState(requestState);
	}

	/**
	* Returns the request response time of this interface request field.
	*
	* @return the request response time of this interface request field
	*/
	@Override
	public java.util.Date getRequestResponseTime() {
		return _interfaceRequestField.getRequestResponseTime();
	}

	/**
	* Sets the request response time of this interface request field.
	*
	* @param requestResponseTime the request response time of this interface request field
	*/
	@Override
	public void setRequestResponseTime(java.util.Date requestResponseTime) {
		_interfaceRequestField.setRequestResponseTime(requestResponseTime);
	}

	/**
	* Returns the document type of this interface request field.
	*
	* @return the document type of this interface request field
	*/
	@Override
	public java.lang.String getDocumentType() {
		return _interfaceRequestField.getDocumentType();
	}

	/**
	* Sets the document type of this interface request field.
	*
	* @param documentType the document type of this interface request field
	*/
	@Override
	public void setDocumentType(java.lang.String documentType) {
		_interfaceRequestField.setDocumentType(documentType);
	}

	/**
	* Returns the business type of this interface request field.
	*
	* @return the business type of this interface request field
	*/
	@Override
	public java.lang.String getBusinessType() {
		return _interfaceRequestField.getBusinessType();
	}

	/**
	* Sets the business type of this interface request field.
	*
	* @param businessType the business type of this interface request field
	*/
	@Override
	public void setBusinessType(java.lang.String businessType) {
		_interfaceRequestField.setBusinessType(businessType);
	}

	/**
	* Returns the function type of this interface request field.
	*
	* @return the function type of this interface request field
	*/
	@Override
	public java.lang.String getFunctionType() {
		return _interfaceRequestField.getFunctionType();
	}

	/**
	* Sets the function type of this interface request field.
	*
	* @param functionType the function type of this interface request field
	*/
	@Override
	public void setFunctionType(java.lang.String functionType) {
		_interfaceRequestField.setFunctionType(functionType);
	}

	/**
	* Returns the sender name of this interface request field.
	*
	* @return the sender name of this interface request field
	*/
	@Override
	public java.lang.String getSenderName() {
		return _interfaceRequestField.getSenderName();
	}

	/**
	* Sets the sender name of this interface request field.
	*
	* @param senderName the sender name of this interface request field
	*/
	@Override
	public void setSenderName(java.lang.String senderName) {
		_interfaceRequestField.setSenderName(senderName);
	}

	/**
	* Returns the request version of this interface request field.
	*
	* @return the request version of this interface request field
	*/
	@Override
	public java.lang.String getRequestVersion() {
		return _interfaceRequestField.getRequestVersion();
	}

	/**
	* Sets the request version of this interface request field.
	*
	* @param requestVersion the request version of this interface request field
	*/
	@Override
	public void setRequestVersion(java.lang.String requestVersion) {
		_interfaceRequestField.setRequestVersion(requestVersion);
	}

	/**
	* Returns the sender identify of this interface request field.
	*
	* @return the sender identify of this interface request field
	*/
	@Override
	public java.lang.String getSenderIdentify() {
		return _interfaceRequestField.getSenderIdentify();
	}

	/**
	* Sets the sender identify of this interface request field.
	*
	* @param senderIdentify the sender identify of this interface request field
	*/
	@Override
	public void setSenderIdentify(java.lang.String senderIdentify) {
		_interfaceRequestField.setSenderIdentify(senderIdentify);
	}

	/**
	* Returns the receiver name of this interface request field.
	*
	* @return the receiver name of this interface request field
	*/
	@Override
	public java.lang.String getReceiverName() {
		return _interfaceRequestField.getReceiverName();
	}

	/**
	* Sets the receiver name of this interface request field.
	*
	* @param receiverName the receiver name of this interface request field
	*/
	@Override
	public void setReceiverName(java.lang.String receiverName) {
		_interfaceRequestField.setReceiverName(receiverName);
	}

	/**
	* Returns the sending date of this interface request field.
	*
	* @return the sending date of this interface request field
	*/
	@Override
	public java.util.Date getSendingDate() {
		return _interfaceRequestField.getSendingDate();
	}

	/**
	* Sets the sending date of this interface request field.
	*
	* @param sendingDate the sending date of this interface request field
	*/
	@Override
	public void setSendingDate(java.util.Date sendingDate) {
		_interfaceRequestField.setSendingDate(sendingDate);
	}

	/**
	* Returns the receiver identify of this interface request field.
	*
	* @return the receiver identify of this interface request field
	*/
	@Override
	public java.lang.String getReceiverIdentify() {
		return _interfaceRequestField.getReceiverIdentify();
	}

	/**
	* Sets the receiver identify of this interface request field.
	*
	* @param receiverIdentify the receiver identify of this interface request field
	*/
	@Override
	public void setReceiverIdentify(java.lang.String receiverIdentify) {
		_interfaceRequestField.setReceiverIdentify(receiverIdentify);
	}

	/**
	* Returns the remarks of this interface request field.
	*
	* @return the remarks of this interface request field
	*/
	@Override
	public java.lang.String getRemarks() {
		return _interfaceRequestField.getRemarks();
	}

	/**
	* Sets the remarks of this interface request field.
	*
	* @param remarks the remarks of this interface request field
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_interfaceRequestField.setRemarks(remarks);
	}

	@Override
	public boolean isNew() {
		return _interfaceRequestField.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_interfaceRequestField.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _interfaceRequestField.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_interfaceRequestField.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _interfaceRequestField.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _interfaceRequestField.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_interfaceRequestField.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _interfaceRequestField.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_interfaceRequestField.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_interfaceRequestField.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_interfaceRequestField.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new InterfaceRequestFieldWrapper((InterfaceRequestField)_interfaceRequestField.clone());
	}

	@Override
	public int compareTo(InterfaceRequestField interfaceRequestField) {
		return _interfaceRequestField.compareTo(interfaceRequestField);
	}

	@Override
	public int hashCode() {
		return _interfaceRequestField.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<InterfaceRequestField> toCacheModel() {
		return _interfaceRequestField.toCacheModel();
	}

	@Override
	public InterfaceRequestField toEscapedModel() {
		return new InterfaceRequestFieldWrapper(_interfaceRequestField.toEscapedModel());
	}

	@Override
	public InterfaceRequestField toUnescapedModel() {
		return new InterfaceRequestFieldWrapper(_interfaceRequestField.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _interfaceRequestField.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _interfaceRequestField.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_interfaceRequestField.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof InterfaceRequestFieldWrapper)) {
			return false;
		}

		InterfaceRequestFieldWrapper interfaceRequestFieldWrapper = (InterfaceRequestFieldWrapper)obj;

		if (Validator.equals(_interfaceRequestField,
					interfaceRequestFieldWrapper._interfaceRequestField)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public InterfaceRequestField getWrappedInterfaceRequestField() {
		return _interfaceRequestField;
	}

	@Override
	public InterfaceRequestField getWrappedModel() {
		return _interfaceRequestField;
	}

	@Override
	public void resetOriginalValues() {
		_interfaceRequestField.resetOriginalValues();
	}

	private InterfaceRequestField _interfaceRequestField;
}