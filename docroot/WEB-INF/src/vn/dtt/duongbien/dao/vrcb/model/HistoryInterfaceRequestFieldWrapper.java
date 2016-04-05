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
 * This class is a wrapper for {@link HistoryInterfaceRequestField}.
 * </p>
 *
 * @author longdm
 * @see HistoryInterfaceRequestField
 * @generated
 */
public class HistoryInterfaceRequestFieldWrapper
	implements HistoryInterfaceRequestField,
		ModelWrapper<HistoryInterfaceRequestField> {
	public HistoryInterfaceRequestFieldWrapper(
		HistoryInterfaceRequestField historyInterfaceRequestField) {
		_historyInterfaceRequestField = historyInterfaceRequestField;
	}

	@Override
	public Class<?> getModelClass() {
		return HistoryInterfaceRequestField.class;
	}

	@Override
	public String getModelClassName() {
		return HistoryInterfaceRequestField.class.getName();
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
	* Returns the primary key of this history interface request field.
	*
	* @return the primary key of this history interface request field
	*/
	@Override
	public long getPrimaryKey() {
		return _historyInterfaceRequestField.getPrimaryKey();
	}

	/**
	* Sets the primary key of this history interface request field.
	*
	* @param primaryKey the primary key of this history interface request field
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_historyInterfaceRequestField.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this history interface request field.
	*
	* @return the ID of this history interface request field
	*/
	@Override
	public long getId() {
		return _historyInterfaceRequestField.getId();
	}

	/**
	* Sets the ID of this history interface request field.
	*
	* @param id the ID of this history interface request field
	*/
	@Override
	public void setId(long id) {
		_historyInterfaceRequestField.setId(id);
	}

	/**
	* Returns the request code of this history interface request field.
	*
	* @return the request code of this history interface request field
	*/
	@Override
	public java.lang.String getRequestCode() {
		return _historyInterfaceRequestField.getRequestCode();
	}

	/**
	* Sets the request code of this history interface request field.
	*
	* @param requestCode the request code of this history interface request field
	*/
	@Override
	public void setRequestCode(java.lang.String requestCode) {
		_historyInterfaceRequestField.setRequestCode(requestCode);
	}

	/**
	* Returns the organization code of this history interface request field.
	*
	* @return the organization code of this history interface request field
	*/
	@Override
	public java.lang.String getOrganizationCode() {
		return _historyInterfaceRequestField.getOrganizationCode();
	}

	/**
	* Sets the organization code of this history interface request field.
	*
	* @param organizationCode the organization code of this history interface request field
	*/
	@Override
	public void setOrganizationCode(java.lang.String organizationCode) {
		_historyInterfaceRequestField.setOrganizationCode(organizationCode);
	}

	/**
	* Returns the loc code of this history interface request field.
	*
	* @return the loc code of this history interface request field
	*/
	@Override
	public java.lang.String getLocCode() {
		return _historyInterfaceRequestField.getLocCode();
	}

	/**
	* Sets the loc code of this history interface request field.
	*
	* @param locCode the loc code of this history interface request field
	*/
	@Override
	public void setLocCode(java.lang.String locCode) {
		_historyInterfaceRequestField.setLocCode(locCode);
	}

	/**
	* Returns the request date of this history interface request field.
	*
	* @return the request date of this history interface request field
	*/
	@Override
	public java.util.Date getRequestDate() {
		return _historyInterfaceRequestField.getRequestDate();
	}

	/**
	* Sets the request date of this history interface request field.
	*
	* @param requestDate the request date of this history interface request field
	*/
	@Override
	public void setRequestDate(java.util.Date requestDate) {
		_historyInterfaceRequestField.setRequestDate(requestDate);
	}

	/**
	* Returns the requested date of this history interface request field.
	*
	* @return the requested date of this history interface request field
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _historyInterfaceRequestField.getRequestedDate();
	}

	/**
	* Sets the requested date of this history interface request field.
	*
	* @param requestedDate the requested date of this history interface request field
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_historyInterfaceRequestField.setRequestedDate(requestedDate);
	}

	/**
	* Returns the request direction of this history interface request field.
	*
	* @return the request direction of this history interface request field
	*/
	@Override
	public java.lang.String getRequestDirection() {
		return _historyInterfaceRequestField.getRequestDirection();
	}

	/**
	* Sets the request direction of this history interface request field.
	*
	* @param requestDirection the request direction of this history interface request field
	*/
	@Override
	public void setRequestDirection(java.lang.String requestDirection) {
		_historyInterfaceRequestField.setRequestDirection(requestDirection);
	}

	/**
	* Returns the request state of this history interface request field.
	*
	* @return the request state of this history interface request field
	*/
	@Override
	public int getRequestState() {
		return _historyInterfaceRequestField.getRequestState();
	}

	/**
	* Sets the request state of this history interface request field.
	*
	* @param requestState the request state of this history interface request field
	*/
	@Override
	public void setRequestState(int requestState) {
		_historyInterfaceRequestField.setRequestState(requestState);
	}

	/**
	* Returns the request response time of this history interface request field.
	*
	* @return the request response time of this history interface request field
	*/
	@Override
	public java.util.Date getRequestResponseTime() {
		return _historyInterfaceRequestField.getRequestResponseTime();
	}

	/**
	* Sets the request response time of this history interface request field.
	*
	* @param requestResponseTime the request response time of this history interface request field
	*/
	@Override
	public void setRequestResponseTime(java.util.Date requestResponseTime) {
		_historyInterfaceRequestField.setRequestResponseTime(requestResponseTime);
	}

	/**
	* Returns the document type of this history interface request field.
	*
	* @return the document type of this history interface request field
	*/
	@Override
	public java.lang.String getDocumentType() {
		return _historyInterfaceRequestField.getDocumentType();
	}

	/**
	* Sets the document type of this history interface request field.
	*
	* @param documentType the document type of this history interface request field
	*/
	@Override
	public void setDocumentType(java.lang.String documentType) {
		_historyInterfaceRequestField.setDocumentType(documentType);
	}

	/**
	* Returns the business type of this history interface request field.
	*
	* @return the business type of this history interface request field
	*/
	@Override
	public java.lang.String getBusinessType() {
		return _historyInterfaceRequestField.getBusinessType();
	}

	/**
	* Sets the business type of this history interface request field.
	*
	* @param businessType the business type of this history interface request field
	*/
	@Override
	public void setBusinessType(java.lang.String businessType) {
		_historyInterfaceRequestField.setBusinessType(businessType);
	}

	/**
	* Returns the function type of this history interface request field.
	*
	* @return the function type of this history interface request field
	*/
	@Override
	public java.lang.String getFunctionType() {
		return _historyInterfaceRequestField.getFunctionType();
	}

	/**
	* Sets the function type of this history interface request field.
	*
	* @param functionType the function type of this history interface request field
	*/
	@Override
	public void setFunctionType(java.lang.String functionType) {
		_historyInterfaceRequestField.setFunctionType(functionType);
	}

	/**
	* Returns the sender name of this history interface request field.
	*
	* @return the sender name of this history interface request field
	*/
	@Override
	public java.lang.String getSenderName() {
		return _historyInterfaceRequestField.getSenderName();
	}

	/**
	* Sets the sender name of this history interface request field.
	*
	* @param senderName the sender name of this history interface request field
	*/
	@Override
	public void setSenderName(java.lang.String senderName) {
		_historyInterfaceRequestField.setSenderName(senderName);
	}

	/**
	* Returns the request version of this history interface request field.
	*
	* @return the request version of this history interface request field
	*/
	@Override
	public java.lang.String getRequestVersion() {
		return _historyInterfaceRequestField.getRequestVersion();
	}

	/**
	* Sets the request version of this history interface request field.
	*
	* @param requestVersion the request version of this history interface request field
	*/
	@Override
	public void setRequestVersion(java.lang.String requestVersion) {
		_historyInterfaceRequestField.setRequestVersion(requestVersion);
	}

	/**
	* Returns the sender identify of this history interface request field.
	*
	* @return the sender identify of this history interface request field
	*/
	@Override
	public java.lang.String getSenderIdentify() {
		return _historyInterfaceRequestField.getSenderIdentify();
	}

	/**
	* Sets the sender identify of this history interface request field.
	*
	* @param senderIdentify the sender identify of this history interface request field
	*/
	@Override
	public void setSenderIdentify(java.lang.String senderIdentify) {
		_historyInterfaceRequestField.setSenderIdentify(senderIdentify);
	}

	/**
	* Returns the receiver name of this history interface request field.
	*
	* @return the receiver name of this history interface request field
	*/
	@Override
	public java.lang.String getReceiverName() {
		return _historyInterfaceRequestField.getReceiverName();
	}

	/**
	* Sets the receiver name of this history interface request field.
	*
	* @param receiverName the receiver name of this history interface request field
	*/
	@Override
	public void setReceiverName(java.lang.String receiverName) {
		_historyInterfaceRequestField.setReceiverName(receiverName);
	}

	/**
	* Returns the sending date of this history interface request field.
	*
	* @return the sending date of this history interface request field
	*/
	@Override
	public java.util.Date getSendingDate() {
		return _historyInterfaceRequestField.getSendingDate();
	}

	/**
	* Sets the sending date of this history interface request field.
	*
	* @param sendingDate the sending date of this history interface request field
	*/
	@Override
	public void setSendingDate(java.util.Date sendingDate) {
		_historyInterfaceRequestField.setSendingDate(sendingDate);
	}

	/**
	* Returns the receiver identify of this history interface request field.
	*
	* @return the receiver identify of this history interface request field
	*/
	@Override
	public java.lang.String getReceiverIdentify() {
		return _historyInterfaceRequestField.getReceiverIdentify();
	}

	/**
	* Sets the receiver identify of this history interface request field.
	*
	* @param receiverIdentify the receiver identify of this history interface request field
	*/
	@Override
	public void setReceiverIdentify(java.lang.String receiverIdentify) {
		_historyInterfaceRequestField.setReceiverIdentify(receiverIdentify);
	}

	/**
	* Returns the remarks of this history interface request field.
	*
	* @return the remarks of this history interface request field
	*/
	@Override
	public java.lang.String getRemarks() {
		return _historyInterfaceRequestField.getRemarks();
	}

	/**
	* Sets the remarks of this history interface request field.
	*
	* @param remarks the remarks of this history interface request field
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_historyInterfaceRequestField.setRemarks(remarks);
	}

	@Override
	public boolean isNew() {
		return _historyInterfaceRequestField.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_historyInterfaceRequestField.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _historyInterfaceRequestField.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_historyInterfaceRequestField.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _historyInterfaceRequestField.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _historyInterfaceRequestField.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_historyInterfaceRequestField.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _historyInterfaceRequestField.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_historyInterfaceRequestField.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_historyInterfaceRequestField.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_historyInterfaceRequestField.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new HistoryInterfaceRequestFieldWrapper((HistoryInterfaceRequestField)_historyInterfaceRequestField.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequestField historyInterfaceRequestField) {
		return _historyInterfaceRequestField.compareTo(historyInterfaceRequestField);
	}

	@Override
	public int hashCode() {
		return _historyInterfaceRequestField.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequestField> toCacheModel() {
		return _historyInterfaceRequestField.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequestField toEscapedModel() {
		return new HistoryInterfaceRequestFieldWrapper(_historyInterfaceRequestField.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequestField toUnescapedModel() {
		return new HistoryInterfaceRequestFieldWrapper(_historyInterfaceRequestField.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _historyInterfaceRequestField.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _historyInterfaceRequestField.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_historyInterfaceRequestField.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof HistoryInterfaceRequestFieldWrapper)) {
			return false;
		}

		HistoryInterfaceRequestFieldWrapper historyInterfaceRequestFieldWrapper = (HistoryInterfaceRequestFieldWrapper)obj;

		if (Validator.equals(_historyInterfaceRequestField,
					historyInterfaceRequestFieldWrapper._historyInterfaceRequestField)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public HistoryInterfaceRequestField getWrappedHistoryInterfaceRequestField() {
		return _historyInterfaceRequestField;
	}

	@Override
	public HistoryInterfaceRequestField getWrappedModel() {
		return _historyInterfaceRequestField;
	}

	@Override
	public void resetOriginalValues() {
		_historyInterfaceRequestField.resetOriginalValues();
	}

	private HistoryInterfaceRequestField _historyInterfaceRequestField;
}