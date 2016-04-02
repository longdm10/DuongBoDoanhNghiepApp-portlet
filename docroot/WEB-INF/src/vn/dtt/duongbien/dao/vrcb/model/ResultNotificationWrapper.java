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
 * This class is a wrapper for {@link ResultNotification}.
 * </p>
 *
 * @author longdm
 * @see ResultNotification
 * @generated
 */
public class ResultNotificationWrapper implements ResultNotification,
	ModelWrapper<ResultNotification> {
	public ResultNotificationWrapper(ResultNotification resultNotification) {
		_resultNotification = resultNotification;
	}

	@Override
	public Class<?> getModelClass() {
		return ResultNotification.class;
	}

	@Override
	public String getModelClassName() {
		return ResultNotification.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("requestCode", getRequestCode());
		attributes.put("requestState", getRequestState());
		attributes.put("documentName", getDocumentName());
		attributes.put("documentYear", getDocumentYear());
		attributes.put("maritimeCode", getMaritimeCode());
		attributes.put("role", getRole());
		attributes.put("response", getResponse());
		attributes.put("organization", getOrganization());
		attributes.put("division", getDivision());
		attributes.put("officerName", getOfficerName());
		attributes.put("latestDate", getLatestDate());
		attributes.put("businessTypeCode", getBusinessTypeCode());
		attributes.put("remarks", getRemarks());
		attributes.put("isReply", getIsReply());
		attributes.put("responseTime", getResponseTime());

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

		Integer requestState = (Integer)attributes.get("requestState");

		if (requestState != null) {
			setRequestState(requestState);
		}

		Long documentName = (Long)attributes.get("documentName");

		if (documentName != null) {
			setDocumentName(documentName);
		}

		Integer documentYear = (Integer)attributes.get("documentYear");

		if (documentYear != null) {
			setDocumentYear(documentYear);
		}

		String maritimeCode = (String)attributes.get("maritimeCode");

		if (maritimeCode != null) {
			setMaritimeCode(maritimeCode);
		}

		Long role = (Long)attributes.get("role");

		if (role != null) {
			setRole(role);
		}

		String response = (String)attributes.get("response");

		if (response != null) {
			setResponse(response);
		}

		String organization = (String)attributes.get("organization");

		if (organization != null) {
			setOrganization(organization);
		}

		String division = (String)attributes.get("division");

		if (division != null) {
			setDivision(division);
		}

		String officerName = (String)attributes.get("officerName");

		if (officerName != null) {
			setOfficerName(officerName);
		}

		String latestDate = (String)attributes.get("latestDate");

		if (latestDate != null) {
			setLatestDate(latestDate);
		}

		Integer businessTypeCode = (Integer)attributes.get("businessTypeCode");

		if (businessTypeCode != null) {
			setBusinessTypeCode(businessTypeCode);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		Integer isReply = (Integer)attributes.get("isReply");

		if (isReply != null) {
			setIsReply(isReply);
		}

		Date responseTime = (Date)attributes.get("responseTime");

		if (responseTime != null) {
			setResponseTime(responseTime);
		}
	}

	/**
	* Returns the primary key of this result notification.
	*
	* @return the primary key of this result notification
	*/
	@Override
	public long getPrimaryKey() {
		return _resultNotification.getPrimaryKey();
	}

	/**
	* Sets the primary key of this result notification.
	*
	* @param primaryKey the primary key of this result notification
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_resultNotification.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this result notification.
	*
	* @return the ID of this result notification
	*/
	@Override
	public long getId() {
		return _resultNotification.getId();
	}

	/**
	* Sets the ID of this result notification.
	*
	* @param id the ID of this result notification
	*/
	@Override
	public void setId(long id) {
		_resultNotification.setId(id);
	}

	/**
	* Returns the request code of this result notification.
	*
	* @return the request code of this result notification
	*/
	@Override
	public java.lang.String getRequestCode() {
		return _resultNotification.getRequestCode();
	}

	/**
	* Sets the request code of this result notification.
	*
	* @param requestCode the request code of this result notification
	*/
	@Override
	public void setRequestCode(java.lang.String requestCode) {
		_resultNotification.setRequestCode(requestCode);
	}

	/**
	* Returns the request state of this result notification.
	*
	* @return the request state of this result notification
	*/
	@Override
	public int getRequestState() {
		return _resultNotification.getRequestState();
	}

	/**
	* Sets the request state of this result notification.
	*
	* @param requestState the request state of this result notification
	*/
	@Override
	public void setRequestState(int requestState) {
		_resultNotification.setRequestState(requestState);
	}

	/**
	* Returns the document name of this result notification.
	*
	* @return the document name of this result notification
	*/
	@Override
	public long getDocumentName() {
		return _resultNotification.getDocumentName();
	}

	/**
	* Sets the document name of this result notification.
	*
	* @param documentName the document name of this result notification
	*/
	@Override
	public void setDocumentName(long documentName) {
		_resultNotification.setDocumentName(documentName);
	}

	/**
	* Returns the document year of this result notification.
	*
	* @return the document year of this result notification
	*/
	@Override
	public int getDocumentYear() {
		return _resultNotification.getDocumentYear();
	}

	/**
	* Sets the document year of this result notification.
	*
	* @param documentYear the document year of this result notification
	*/
	@Override
	public void setDocumentYear(int documentYear) {
		_resultNotification.setDocumentYear(documentYear);
	}

	/**
	* Returns the maritime code of this result notification.
	*
	* @return the maritime code of this result notification
	*/
	@Override
	public java.lang.String getMaritimeCode() {
		return _resultNotification.getMaritimeCode();
	}

	/**
	* Sets the maritime code of this result notification.
	*
	* @param maritimeCode the maritime code of this result notification
	*/
	@Override
	public void setMaritimeCode(java.lang.String maritimeCode) {
		_resultNotification.setMaritimeCode(maritimeCode);
	}

	/**
	* Returns the role of this result notification.
	*
	* @return the role of this result notification
	*/
	@Override
	public long getRole() {
		return _resultNotification.getRole();
	}

	/**
	* Sets the role of this result notification.
	*
	* @param role the role of this result notification
	*/
	@Override
	public void setRole(long role) {
		_resultNotification.setRole(role);
	}

	/**
	* Returns the response of this result notification.
	*
	* @return the response of this result notification
	*/
	@Override
	public java.lang.String getResponse() {
		return _resultNotification.getResponse();
	}

	/**
	* Sets the response of this result notification.
	*
	* @param response the response of this result notification
	*/
	@Override
	public void setResponse(java.lang.String response) {
		_resultNotification.setResponse(response);
	}

	/**
	* Returns the organization of this result notification.
	*
	* @return the organization of this result notification
	*/
	@Override
	public java.lang.String getOrganization() {
		return _resultNotification.getOrganization();
	}

	/**
	* Sets the organization of this result notification.
	*
	* @param organization the organization of this result notification
	*/
	@Override
	public void setOrganization(java.lang.String organization) {
		_resultNotification.setOrganization(organization);
	}

	/**
	* Returns the division of this result notification.
	*
	* @return the division of this result notification
	*/
	@Override
	public java.lang.String getDivision() {
		return _resultNotification.getDivision();
	}

	/**
	* Sets the division of this result notification.
	*
	* @param division the division of this result notification
	*/
	@Override
	public void setDivision(java.lang.String division) {
		_resultNotification.setDivision(division);
	}

	/**
	* Returns the officer name of this result notification.
	*
	* @return the officer name of this result notification
	*/
	@Override
	public java.lang.String getOfficerName() {
		return _resultNotification.getOfficerName();
	}

	/**
	* Sets the officer name of this result notification.
	*
	* @param officerName the officer name of this result notification
	*/
	@Override
	public void setOfficerName(java.lang.String officerName) {
		_resultNotification.setOfficerName(officerName);
	}

	/**
	* Returns the latest date of this result notification.
	*
	* @return the latest date of this result notification
	*/
	@Override
	public java.lang.String getLatestDate() {
		return _resultNotification.getLatestDate();
	}

	/**
	* Sets the latest date of this result notification.
	*
	* @param latestDate the latest date of this result notification
	*/
	@Override
	public void setLatestDate(java.lang.String latestDate) {
		_resultNotification.setLatestDate(latestDate);
	}

	/**
	* Returns the business type code of this result notification.
	*
	* @return the business type code of this result notification
	*/
	@Override
	public int getBusinessTypeCode() {
		return _resultNotification.getBusinessTypeCode();
	}

	/**
	* Sets the business type code of this result notification.
	*
	* @param businessTypeCode the business type code of this result notification
	*/
	@Override
	public void setBusinessTypeCode(int businessTypeCode) {
		_resultNotification.setBusinessTypeCode(businessTypeCode);
	}

	/**
	* Returns the remarks of this result notification.
	*
	* @return the remarks of this result notification
	*/
	@Override
	public java.lang.String getRemarks() {
		return _resultNotification.getRemarks();
	}

	/**
	* Sets the remarks of this result notification.
	*
	* @param remarks the remarks of this result notification
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_resultNotification.setRemarks(remarks);
	}

	/**
	* Returns the is reply of this result notification.
	*
	* @return the is reply of this result notification
	*/
	@Override
	public int getIsReply() {
		return _resultNotification.getIsReply();
	}

	/**
	* Sets the is reply of this result notification.
	*
	* @param isReply the is reply of this result notification
	*/
	@Override
	public void setIsReply(int isReply) {
		_resultNotification.setIsReply(isReply);
	}

	/**
	* Returns the response time of this result notification.
	*
	* @return the response time of this result notification
	*/
	@Override
	public java.util.Date getResponseTime() {
		return _resultNotification.getResponseTime();
	}

	/**
	* Sets the response time of this result notification.
	*
	* @param responseTime the response time of this result notification
	*/
	@Override
	public void setResponseTime(java.util.Date responseTime) {
		_resultNotification.setResponseTime(responseTime);
	}

	@Override
	public boolean isNew() {
		return _resultNotification.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_resultNotification.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _resultNotification.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_resultNotification.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _resultNotification.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _resultNotification.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_resultNotification.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _resultNotification.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_resultNotification.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_resultNotification.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_resultNotification.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ResultNotificationWrapper((ResultNotification)_resultNotification.clone());
	}

	@Override
	public int compareTo(ResultNotification resultNotification) {
		return _resultNotification.compareTo(resultNotification);
	}

	@Override
	public int hashCode() {
		return _resultNotification.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<ResultNotification> toCacheModel() {
		return _resultNotification.toCacheModel();
	}

	@Override
	public ResultNotification toEscapedModel() {
		return new ResultNotificationWrapper(_resultNotification.toEscapedModel());
	}

	@Override
	public ResultNotification toUnescapedModel() {
		return new ResultNotificationWrapper(_resultNotification.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _resultNotification.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _resultNotification.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_resultNotification.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ResultNotificationWrapper)) {
			return false;
		}

		ResultNotificationWrapper resultNotificationWrapper = (ResultNotificationWrapper)obj;

		if (Validator.equals(_resultNotification,
					resultNotificationWrapper._resultNotification)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ResultNotification getWrappedResultNotification() {
		return _resultNotification;
	}

	@Override
	public ResultNotification getWrappedModel() {
		return _resultNotification;
	}

	@Override
	public void resetOriginalValues() {
		_resultNotification.resetOriginalValues();
	}

	private ResultNotification _resultNotification;
}