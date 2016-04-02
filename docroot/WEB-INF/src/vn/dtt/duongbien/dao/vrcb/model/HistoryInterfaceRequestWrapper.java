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
 * This class is a wrapper for {@link HistoryInterfaceRequest}.
 * </p>
 *
 * @author longdm
 * @see HistoryInterfaceRequest
 * @generated
 */
public class HistoryInterfaceRequestWrapper implements HistoryInterfaceRequest,
	ModelWrapper<HistoryInterfaceRequest> {
	public HistoryInterfaceRequestWrapper(
		HistoryInterfaceRequest historyInterfaceRequest) {
		_historyInterfaceRequest = historyInterfaceRequest;
	}

	@Override
	public Class<?> getModelClass() {
		return HistoryInterfaceRequest.class;
	}

	@Override
	public String getModelClassName() {
		return HistoryInterfaceRequest.class.getName();
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
		attributes.put("requestContent", getRequestContent());
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

		String requestContent = (String)attributes.get("requestContent");

		if (requestContent != null) {
			setRequestContent(requestContent);
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
	* Returns the primary key of this history interface request.
	*
	* @return the primary key of this history interface request
	*/
	@Override
	public long getPrimaryKey() {
		return _historyInterfaceRequest.getPrimaryKey();
	}

	/**
	* Sets the primary key of this history interface request.
	*
	* @param primaryKey the primary key of this history interface request
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_historyInterfaceRequest.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this history interface request.
	*
	* @return the ID of this history interface request
	*/
	@Override
	public long getId() {
		return _historyInterfaceRequest.getId();
	}

	/**
	* Sets the ID of this history interface request.
	*
	* @param id the ID of this history interface request
	*/
	@Override
	public void setId(long id) {
		_historyInterfaceRequest.setId(id);
	}

	/**
	* Returns the request code of this history interface request.
	*
	* @return the request code of this history interface request
	*/
	@Override
	public java.lang.String getRequestCode() {
		return _historyInterfaceRequest.getRequestCode();
	}

	/**
	* Sets the request code of this history interface request.
	*
	* @param requestCode the request code of this history interface request
	*/
	@Override
	public void setRequestCode(java.lang.String requestCode) {
		_historyInterfaceRequest.setRequestCode(requestCode);
	}

	/**
	* Returns the organization code of this history interface request.
	*
	* @return the organization code of this history interface request
	*/
	@Override
	public java.lang.String getOrganizationCode() {
		return _historyInterfaceRequest.getOrganizationCode();
	}

	/**
	* Sets the organization code of this history interface request.
	*
	* @param organizationCode the organization code of this history interface request
	*/
	@Override
	public void setOrganizationCode(java.lang.String organizationCode) {
		_historyInterfaceRequest.setOrganizationCode(organizationCode);
	}

	/**
	* Returns the loc code of this history interface request.
	*
	* @return the loc code of this history interface request
	*/
	@Override
	public java.lang.String getLocCode() {
		return _historyInterfaceRequest.getLocCode();
	}

	/**
	* Sets the loc code of this history interface request.
	*
	* @param locCode the loc code of this history interface request
	*/
	@Override
	public void setLocCode(java.lang.String locCode) {
		_historyInterfaceRequest.setLocCode(locCode);
	}

	/**
	* Returns the request date of this history interface request.
	*
	* @return the request date of this history interface request
	*/
	@Override
	public java.util.Date getRequestDate() {
		return _historyInterfaceRequest.getRequestDate();
	}

	/**
	* Sets the request date of this history interface request.
	*
	* @param requestDate the request date of this history interface request
	*/
	@Override
	public void setRequestDate(java.util.Date requestDate) {
		_historyInterfaceRequest.setRequestDate(requestDate);
	}

	/**
	* Returns the requested date of this history interface request.
	*
	* @return the requested date of this history interface request
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _historyInterfaceRequest.getRequestedDate();
	}

	/**
	* Sets the requested date of this history interface request.
	*
	* @param requestedDate the requested date of this history interface request
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_historyInterfaceRequest.setRequestedDate(requestedDate);
	}

	/**
	* Returns the request direction of this history interface request.
	*
	* @return the request direction of this history interface request
	*/
	@Override
	public java.lang.String getRequestDirection() {
		return _historyInterfaceRequest.getRequestDirection();
	}

	/**
	* Sets the request direction of this history interface request.
	*
	* @param requestDirection the request direction of this history interface request
	*/
	@Override
	public void setRequestDirection(java.lang.String requestDirection) {
		_historyInterfaceRequest.setRequestDirection(requestDirection);
	}

	/**
	* Returns the request state of this history interface request.
	*
	* @return the request state of this history interface request
	*/
	@Override
	public int getRequestState() {
		return _historyInterfaceRequest.getRequestState();
	}

	/**
	* Sets the request state of this history interface request.
	*
	* @param requestState the request state of this history interface request
	*/
	@Override
	public void setRequestState(int requestState) {
		_historyInterfaceRequest.setRequestState(requestState);
	}

	/**
	* Returns the request response time of this history interface request.
	*
	* @return the request response time of this history interface request
	*/
	@Override
	public java.util.Date getRequestResponseTime() {
		return _historyInterfaceRequest.getRequestResponseTime();
	}

	/**
	* Sets the request response time of this history interface request.
	*
	* @param requestResponseTime the request response time of this history interface request
	*/
	@Override
	public void setRequestResponseTime(java.util.Date requestResponseTime) {
		_historyInterfaceRequest.setRequestResponseTime(requestResponseTime);
	}

	/**
	* Returns the document type of this history interface request.
	*
	* @return the document type of this history interface request
	*/
	@Override
	public java.lang.String getDocumentType() {
		return _historyInterfaceRequest.getDocumentType();
	}

	/**
	* Sets the document type of this history interface request.
	*
	* @param documentType the document type of this history interface request
	*/
	@Override
	public void setDocumentType(java.lang.String documentType) {
		_historyInterfaceRequest.setDocumentType(documentType);
	}

	/**
	* Returns the business type of this history interface request.
	*
	* @return the business type of this history interface request
	*/
	@Override
	public java.lang.String getBusinessType() {
		return _historyInterfaceRequest.getBusinessType();
	}

	/**
	* Sets the business type of this history interface request.
	*
	* @param businessType the business type of this history interface request
	*/
	@Override
	public void setBusinessType(java.lang.String businessType) {
		_historyInterfaceRequest.setBusinessType(businessType);
	}

	/**
	* Returns the function type of this history interface request.
	*
	* @return the function type of this history interface request
	*/
	@Override
	public java.lang.String getFunctionType() {
		return _historyInterfaceRequest.getFunctionType();
	}

	/**
	* Sets the function type of this history interface request.
	*
	* @param functionType the function type of this history interface request
	*/
	@Override
	public void setFunctionType(java.lang.String functionType) {
		_historyInterfaceRequest.setFunctionType(functionType);
	}

	/**
	* Returns the request content of this history interface request.
	*
	* @return the request content of this history interface request
	*/
	@Override
	public java.lang.String getRequestContent() {
		return _historyInterfaceRequest.getRequestContent();
	}

	/**
	* Sets the request content of this history interface request.
	*
	* @param requestContent the request content of this history interface request
	*/
	@Override
	public void setRequestContent(java.lang.String requestContent) {
		_historyInterfaceRequest.setRequestContent(requestContent);
	}

	/**
	* Returns the sender name of this history interface request.
	*
	* @return the sender name of this history interface request
	*/
	@Override
	public java.lang.String getSenderName() {
		return _historyInterfaceRequest.getSenderName();
	}

	/**
	* Sets the sender name of this history interface request.
	*
	* @param senderName the sender name of this history interface request
	*/
	@Override
	public void setSenderName(java.lang.String senderName) {
		_historyInterfaceRequest.setSenderName(senderName);
	}

	/**
	* Returns the request version of this history interface request.
	*
	* @return the request version of this history interface request
	*/
	@Override
	public java.lang.String getRequestVersion() {
		return _historyInterfaceRequest.getRequestVersion();
	}

	/**
	* Sets the request version of this history interface request.
	*
	* @param requestVersion the request version of this history interface request
	*/
	@Override
	public void setRequestVersion(java.lang.String requestVersion) {
		_historyInterfaceRequest.setRequestVersion(requestVersion);
	}

	/**
	* Returns the sender identify of this history interface request.
	*
	* @return the sender identify of this history interface request
	*/
	@Override
	public java.lang.String getSenderIdentify() {
		return _historyInterfaceRequest.getSenderIdentify();
	}

	/**
	* Sets the sender identify of this history interface request.
	*
	* @param senderIdentify the sender identify of this history interface request
	*/
	@Override
	public void setSenderIdentify(java.lang.String senderIdentify) {
		_historyInterfaceRequest.setSenderIdentify(senderIdentify);
	}

	/**
	* Returns the receiver name of this history interface request.
	*
	* @return the receiver name of this history interface request
	*/
	@Override
	public java.lang.String getReceiverName() {
		return _historyInterfaceRequest.getReceiverName();
	}

	/**
	* Sets the receiver name of this history interface request.
	*
	* @param receiverName the receiver name of this history interface request
	*/
	@Override
	public void setReceiverName(java.lang.String receiverName) {
		_historyInterfaceRequest.setReceiverName(receiverName);
	}

	/**
	* Returns the sending date of this history interface request.
	*
	* @return the sending date of this history interface request
	*/
	@Override
	public java.util.Date getSendingDate() {
		return _historyInterfaceRequest.getSendingDate();
	}

	/**
	* Sets the sending date of this history interface request.
	*
	* @param sendingDate the sending date of this history interface request
	*/
	@Override
	public void setSendingDate(java.util.Date sendingDate) {
		_historyInterfaceRequest.setSendingDate(sendingDate);
	}

	/**
	* Returns the receiver identify of this history interface request.
	*
	* @return the receiver identify of this history interface request
	*/
	@Override
	public java.lang.String getReceiverIdentify() {
		return _historyInterfaceRequest.getReceiverIdentify();
	}

	/**
	* Sets the receiver identify of this history interface request.
	*
	* @param receiverIdentify the receiver identify of this history interface request
	*/
	@Override
	public void setReceiverIdentify(java.lang.String receiverIdentify) {
		_historyInterfaceRequest.setReceiverIdentify(receiverIdentify);
	}

	/**
	* Returns the remarks of this history interface request.
	*
	* @return the remarks of this history interface request
	*/
	@Override
	public java.lang.String getRemarks() {
		return _historyInterfaceRequest.getRemarks();
	}

	/**
	* Sets the remarks of this history interface request.
	*
	* @param remarks the remarks of this history interface request
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_historyInterfaceRequest.setRemarks(remarks);
	}

	@Override
	public boolean isNew() {
		return _historyInterfaceRequest.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_historyInterfaceRequest.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _historyInterfaceRequest.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_historyInterfaceRequest.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _historyInterfaceRequest.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _historyInterfaceRequest.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_historyInterfaceRequest.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _historyInterfaceRequest.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_historyInterfaceRequest.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_historyInterfaceRequest.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_historyInterfaceRequest.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new HistoryInterfaceRequestWrapper((HistoryInterfaceRequest)_historyInterfaceRequest.clone());
	}

	@Override
	public int compareTo(HistoryInterfaceRequest historyInterfaceRequest) {
		return _historyInterfaceRequest.compareTo(historyInterfaceRequest);
	}

	@Override
	public int hashCode() {
		return _historyInterfaceRequest.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<HistoryInterfaceRequest> toCacheModel() {
		return _historyInterfaceRequest.toCacheModel();
	}

	@Override
	public HistoryInterfaceRequest toEscapedModel() {
		return new HistoryInterfaceRequestWrapper(_historyInterfaceRequest.toEscapedModel());
	}

	@Override
	public HistoryInterfaceRequest toUnescapedModel() {
		return new HistoryInterfaceRequestWrapper(_historyInterfaceRequest.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _historyInterfaceRequest.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _historyInterfaceRequest.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_historyInterfaceRequest.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof HistoryInterfaceRequestWrapper)) {
			return false;
		}

		HistoryInterfaceRequestWrapper historyInterfaceRequestWrapper = (HistoryInterfaceRequestWrapper)obj;

		if (Validator.equals(_historyInterfaceRequest,
					historyInterfaceRequestWrapper._historyInterfaceRequest)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public HistoryInterfaceRequest getWrappedHistoryInterfaceRequest() {
		return _historyInterfaceRequest;
	}

	@Override
	public HistoryInterfaceRequest getWrappedModel() {
		return _historyInterfaceRequest;
	}

	@Override
	public void resetOriginalValues() {
		_historyInterfaceRequest.resetOriginalValues();
	}

	private HistoryInterfaceRequest _historyInterfaceRequest;
}