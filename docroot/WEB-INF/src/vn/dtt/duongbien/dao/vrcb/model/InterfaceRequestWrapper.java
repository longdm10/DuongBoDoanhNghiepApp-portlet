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
 * This class is a wrapper for {@link InterfaceRequest}.
 * </p>
 *
 * @author longdm
 * @see InterfaceRequest
 * @generated
 */
public class InterfaceRequestWrapper implements InterfaceRequest,
	ModelWrapper<InterfaceRequest> {
	public InterfaceRequestWrapper(InterfaceRequest interfaceRequest) {
		_interfaceRequest = interfaceRequest;
	}

	@Override
	public Class<?> getModelClass() {
		return InterfaceRequest.class;
	}

	@Override
	public String getModelClassName() {
		return InterfaceRequest.class.getName();
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
	* Returns the primary key of this interface request.
	*
	* @return the primary key of this interface request
	*/
	@Override
	public long getPrimaryKey() {
		return _interfaceRequest.getPrimaryKey();
	}

	/**
	* Sets the primary key of this interface request.
	*
	* @param primaryKey the primary key of this interface request
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_interfaceRequest.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this interface request.
	*
	* @return the ID of this interface request
	*/
	@Override
	public long getId() {
		return _interfaceRequest.getId();
	}

	/**
	* Sets the ID of this interface request.
	*
	* @param id the ID of this interface request
	*/
	@Override
	public void setId(long id) {
		_interfaceRequest.setId(id);
	}

	/**
	* Returns the request code of this interface request.
	*
	* @return the request code of this interface request
	*/
	@Override
	public java.lang.String getRequestCode() {
		return _interfaceRequest.getRequestCode();
	}

	/**
	* Sets the request code of this interface request.
	*
	* @param requestCode the request code of this interface request
	*/
	@Override
	public void setRequestCode(java.lang.String requestCode) {
		_interfaceRequest.setRequestCode(requestCode);
	}

	/**
	* Returns the organization code of this interface request.
	*
	* @return the organization code of this interface request
	*/
	@Override
	public java.lang.String getOrganizationCode() {
		return _interfaceRequest.getOrganizationCode();
	}

	/**
	* Sets the organization code of this interface request.
	*
	* @param organizationCode the organization code of this interface request
	*/
	@Override
	public void setOrganizationCode(java.lang.String organizationCode) {
		_interfaceRequest.setOrganizationCode(organizationCode);
	}

	/**
	* Returns the loc code of this interface request.
	*
	* @return the loc code of this interface request
	*/
	@Override
	public java.lang.String getLocCode() {
		return _interfaceRequest.getLocCode();
	}

	/**
	* Sets the loc code of this interface request.
	*
	* @param locCode the loc code of this interface request
	*/
	@Override
	public void setLocCode(java.lang.String locCode) {
		_interfaceRequest.setLocCode(locCode);
	}

	/**
	* Returns the request date of this interface request.
	*
	* @return the request date of this interface request
	*/
	@Override
	public java.util.Date getRequestDate() {
		return _interfaceRequest.getRequestDate();
	}

	/**
	* Sets the request date of this interface request.
	*
	* @param requestDate the request date of this interface request
	*/
	@Override
	public void setRequestDate(java.util.Date requestDate) {
		_interfaceRequest.setRequestDate(requestDate);
	}

	/**
	* Returns the requested date of this interface request.
	*
	* @return the requested date of this interface request
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _interfaceRequest.getRequestedDate();
	}

	/**
	* Sets the requested date of this interface request.
	*
	* @param requestedDate the requested date of this interface request
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_interfaceRequest.setRequestedDate(requestedDate);
	}

	/**
	* Returns the request direction of this interface request.
	*
	* @return the request direction of this interface request
	*/
	@Override
	public java.lang.String getRequestDirection() {
		return _interfaceRequest.getRequestDirection();
	}

	/**
	* Sets the request direction of this interface request.
	*
	* @param requestDirection the request direction of this interface request
	*/
	@Override
	public void setRequestDirection(java.lang.String requestDirection) {
		_interfaceRequest.setRequestDirection(requestDirection);
	}

	/**
	* Returns the request state of this interface request.
	*
	* @return the request state of this interface request
	*/
	@Override
	public int getRequestState() {
		return _interfaceRequest.getRequestState();
	}

	/**
	* Sets the request state of this interface request.
	*
	* @param requestState the request state of this interface request
	*/
	@Override
	public void setRequestState(int requestState) {
		_interfaceRequest.setRequestState(requestState);
	}

	/**
	* Returns the request response time of this interface request.
	*
	* @return the request response time of this interface request
	*/
	@Override
	public java.util.Date getRequestResponseTime() {
		return _interfaceRequest.getRequestResponseTime();
	}

	/**
	* Sets the request response time of this interface request.
	*
	* @param requestResponseTime the request response time of this interface request
	*/
	@Override
	public void setRequestResponseTime(java.util.Date requestResponseTime) {
		_interfaceRequest.setRequestResponseTime(requestResponseTime);
	}

	/**
	* Returns the document type of this interface request.
	*
	* @return the document type of this interface request
	*/
	@Override
	public java.lang.String getDocumentType() {
		return _interfaceRequest.getDocumentType();
	}

	/**
	* Sets the document type of this interface request.
	*
	* @param documentType the document type of this interface request
	*/
	@Override
	public void setDocumentType(java.lang.String documentType) {
		_interfaceRequest.setDocumentType(documentType);
	}

	/**
	* Returns the business type of this interface request.
	*
	* @return the business type of this interface request
	*/
	@Override
	public java.lang.String getBusinessType() {
		return _interfaceRequest.getBusinessType();
	}

	/**
	* Sets the business type of this interface request.
	*
	* @param businessType the business type of this interface request
	*/
	@Override
	public void setBusinessType(java.lang.String businessType) {
		_interfaceRequest.setBusinessType(businessType);
	}

	/**
	* Returns the function type of this interface request.
	*
	* @return the function type of this interface request
	*/
	@Override
	public java.lang.String getFunctionType() {
		return _interfaceRequest.getFunctionType();
	}

	/**
	* Sets the function type of this interface request.
	*
	* @param functionType the function type of this interface request
	*/
	@Override
	public void setFunctionType(java.lang.String functionType) {
		_interfaceRequest.setFunctionType(functionType);
	}

	/**
	* Returns the request content of this interface request.
	*
	* @return the request content of this interface request
	*/
	@Override
	public java.lang.String getRequestContent() {
		return _interfaceRequest.getRequestContent();
	}

	/**
	* Sets the request content of this interface request.
	*
	* @param requestContent the request content of this interface request
	*/
	@Override
	public void setRequestContent(java.lang.String requestContent) {
		_interfaceRequest.setRequestContent(requestContent);
	}

	/**
	* Returns the sender name of this interface request.
	*
	* @return the sender name of this interface request
	*/
	@Override
	public java.lang.String getSenderName() {
		return _interfaceRequest.getSenderName();
	}

	/**
	* Sets the sender name of this interface request.
	*
	* @param senderName the sender name of this interface request
	*/
	@Override
	public void setSenderName(java.lang.String senderName) {
		_interfaceRequest.setSenderName(senderName);
	}

	/**
	* Returns the request version of this interface request.
	*
	* @return the request version of this interface request
	*/
	@Override
	public java.lang.String getRequestVersion() {
		return _interfaceRequest.getRequestVersion();
	}

	/**
	* Sets the request version of this interface request.
	*
	* @param requestVersion the request version of this interface request
	*/
	@Override
	public void setRequestVersion(java.lang.String requestVersion) {
		_interfaceRequest.setRequestVersion(requestVersion);
	}

	/**
	* Returns the sender identify of this interface request.
	*
	* @return the sender identify of this interface request
	*/
	@Override
	public java.lang.String getSenderIdentify() {
		return _interfaceRequest.getSenderIdentify();
	}

	/**
	* Sets the sender identify of this interface request.
	*
	* @param senderIdentify the sender identify of this interface request
	*/
	@Override
	public void setSenderIdentify(java.lang.String senderIdentify) {
		_interfaceRequest.setSenderIdentify(senderIdentify);
	}

	/**
	* Returns the receiver name of this interface request.
	*
	* @return the receiver name of this interface request
	*/
	@Override
	public java.lang.String getReceiverName() {
		return _interfaceRequest.getReceiverName();
	}

	/**
	* Sets the receiver name of this interface request.
	*
	* @param receiverName the receiver name of this interface request
	*/
	@Override
	public void setReceiverName(java.lang.String receiverName) {
		_interfaceRequest.setReceiverName(receiverName);
	}

	/**
	* Returns the sending date of this interface request.
	*
	* @return the sending date of this interface request
	*/
	@Override
	public java.util.Date getSendingDate() {
		return _interfaceRequest.getSendingDate();
	}

	/**
	* Sets the sending date of this interface request.
	*
	* @param sendingDate the sending date of this interface request
	*/
	@Override
	public void setSendingDate(java.util.Date sendingDate) {
		_interfaceRequest.setSendingDate(sendingDate);
	}

	/**
	* Returns the receiver identify of this interface request.
	*
	* @return the receiver identify of this interface request
	*/
	@Override
	public java.lang.String getReceiverIdentify() {
		return _interfaceRequest.getReceiverIdentify();
	}

	/**
	* Sets the receiver identify of this interface request.
	*
	* @param receiverIdentify the receiver identify of this interface request
	*/
	@Override
	public void setReceiverIdentify(java.lang.String receiverIdentify) {
		_interfaceRequest.setReceiverIdentify(receiverIdentify);
	}

	/**
	* Returns the remarks of this interface request.
	*
	* @return the remarks of this interface request
	*/
	@Override
	public java.lang.String getRemarks() {
		return _interfaceRequest.getRemarks();
	}

	/**
	* Sets the remarks of this interface request.
	*
	* @param remarks the remarks of this interface request
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_interfaceRequest.setRemarks(remarks);
	}

	@Override
	public boolean isNew() {
		return _interfaceRequest.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_interfaceRequest.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _interfaceRequest.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_interfaceRequest.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _interfaceRequest.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _interfaceRequest.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_interfaceRequest.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _interfaceRequest.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_interfaceRequest.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_interfaceRequest.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_interfaceRequest.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new InterfaceRequestWrapper((InterfaceRequest)_interfaceRequest.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.InterfaceRequest interfaceRequest) {
		return _interfaceRequest.compareTo(interfaceRequest);
	}

	@Override
	public int hashCode() {
		return _interfaceRequest.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.InterfaceRequest> toCacheModel() {
		return _interfaceRequest.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.InterfaceRequest toEscapedModel() {
		return new InterfaceRequestWrapper(_interfaceRequest.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.InterfaceRequest toUnescapedModel() {
		return new InterfaceRequestWrapper(_interfaceRequest.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _interfaceRequest.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _interfaceRequest.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_interfaceRequest.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof InterfaceRequestWrapper)) {
			return false;
		}

		InterfaceRequestWrapper interfaceRequestWrapper = (InterfaceRequestWrapper)obj;

		if (Validator.equals(_interfaceRequest,
					interfaceRequestWrapper._interfaceRequest)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public InterfaceRequest getWrappedInterfaceRequest() {
		return _interfaceRequest;
	}

	@Override
	public InterfaceRequest getWrappedModel() {
		return _interfaceRequest;
	}

	@Override
	public void resetOriginalValues() {
		_interfaceRequest.resetOriginalValues();
	}

	private InterfaceRequest _interfaceRequest;
}