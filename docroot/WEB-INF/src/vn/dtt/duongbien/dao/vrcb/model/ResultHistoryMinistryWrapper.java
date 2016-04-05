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
 * This class is a wrapper for {@link ResultHistoryMinistry}.
 * </p>
 *
 * @author longdm
 * @see ResultHistoryMinistry
 * @generated
 */
public class ResultHistoryMinistryWrapper implements ResultHistoryMinistry,
	ModelWrapper<ResultHistoryMinistry> {
	public ResultHistoryMinistryWrapper(
		ResultHistoryMinistry resultHistoryMinistry) {
		_resultHistoryMinistry = resultHistoryMinistry;
	}

	@Override
	public Class<?> getModelClass() {
		return ResultHistoryMinistry.class;
	}

	@Override
	public String getModelClassName() {
		return ResultHistoryMinistry.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("requestCode", getRequestCode());
		attributes.put("requestState", getRequestState());
		attributes.put("documentName", getDocumentName());
		attributes.put("documentYear", getDocumentYear());
		attributes.put("ministryCode", getMinistryCode());
		attributes.put("organization", getOrganization());
		attributes.put("division", getDivision());
		attributes.put("officerName", getOfficerName());
		attributes.put("latestDate", getLatestDate());
		attributes.put("businessTypeCode", getBusinessTypeCode());
		attributes.put("response", getResponse());
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

		String ministryCode = (String)attributes.get("ministryCode");

		if (ministryCode != null) {
			setMinistryCode(ministryCode);
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

		Date latestDate = (Date)attributes.get("latestDate");

		if (latestDate != null) {
			setLatestDate(latestDate);
		}

		Integer businessTypeCode = (Integer)attributes.get("businessTypeCode");

		if (businessTypeCode != null) {
			setBusinessTypeCode(businessTypeCode);
		}

		String response = (String)attributes.get("response");

		if (response != null) {
			setResponse(response);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}
	}

	/**
	* Returns the primary key of this result history ministry.
	*
	* @return the primary key of this result history ministry
	*/
	@Override
	public long getPrimaryKey() {
		return _resultHistoryMinistry.getPrimaryKey();
	}

	/**
	* Sets the primary key of this result history ministry.
	*
	* @param primaryKey the primary key of this result history ministry
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_resultHistoryMinistry.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this result history ministry.
	*
	* @return the ID of this result history ministry
	*/
	@Override
	public long getId() {
		return _resultHistoryMinistry.getId();
	}

	/**
	* Sets the ID of this result history ministry.
	*
	* @param id the ID of this result history ministry
	*/
	@Override
	public void setId(long id) {
		_resultHistoryMinistry.setId(id);
	}

	/**
	* Returns the request code of this result history ministry.
	*
	* @return the request code of this result history ministry
	*/
	@Override
	public java.lang.String getRequestCode() {
		return _resultHistoryMinistry.getRequestCode();
	}

	/**
	* Sets the request code of this result history ministry.
	*
	* @param requestCode the request code of this result history ministry
	*/
	@Override
	public void setRequestCode(java.lang.String requestCode) {
		_resultHistoryMinistry.setRequestCode(requestCode);
	}

	/**
	* Returns the request state of this result history ministry.
	*
	* @return the request state of this result history ministry
	*/
	@Override
	public int getRequestState() {
		return _resultHistoryMinistry.getRequestState();
	}

	/**
	* Sets the request state of this result history ministry.
	*
	* @param requestState the request state of this result history ministry
	*/
	@Override
	public void setRequestState(int requestState) {
		_resultHistoryMinistry.setRequestState(requestState);
	}

	/**
	* Returns the document name of this result history ministry.
	*
	* @return the document name of this result history ministry
	*/
	@Override
	public long getDocumentName() {
		return _resultHistoryMinistry.getDocumentName();
	}

	/**
	* Sets the document name of this result history ministry.
	*
	* @param documentName the document name of this result history ministry
	*/
	@Override
	public void setDocumentName(long documentName) {
		_resultHistoryMinistry.setDocumentName(documentName);
	}

	/**
	* Returns the document year of this result history ministry.
	*
	* @return the document year of this result history ministry
	*/
	@Override
	public int getDocumentYear() {
		return _resultHistoryMinistry.getDocumentYear();
	}

	/**
	* Sets the document year of this result history ministry.
	*
	* @param documentYear the document year of this result history ministry
	*/
	@Override
	public void setDocumentYear(int documentYear) {
		_resultHistoryMinistry.setDocumentYear(documentYear);
	}

	/**
	* Returns the ministry code of this result history ministry.
	*
	* @return the ministry code of this result history ministry
	*/
	@Override
	public java.lang.String getMinistryCode() {
		return _resultHistoryMinistry.getMinistryCode();
	}

	/**
	* Sets the ministry code of this result history ministry.
	*
	* @param ministryCode the ministry code of this result history ministry
	*/
	@Override
	public void setMinistryCode(java.lang.String ministryCode) {
		_resultHistoryMinistry.setMinistryCode(ministryCode);
	}

	/**
	* Returns the organization of this result history ministry.
	*
	* @return the organization of this result history ministry
	*/
	@Override
	public java.lang.String getOrganization() {
		return _resultHistoryMinistry.getOrganization();
	}

	/**
	* Sets the organization of this result history ministry.
	*
	* @param organization the organization of this result history ministry
	*/
	@Override
	public void setOrganization(java.lang.String organization) {
		_resultHistoryMinistry.setOrganization(organization);
	}

	/**
	* Returns the division of this result history ministry.
	*
	* @return the division of this result history ministry
	*/
	@Override
	public java.lang.String getDivision() {
		return _resultHistoryMinistry.getDivision();
	}

	/**
	* Sets the division of this result history ministry.
	*
	* @param division the division of this result history ministry
	*/
	@Override
	public void setDivision(java.lang.String division) {
		_resultHistoryMinistry.setDivision(division);
	}

	/**
	* Returns the officer name of this result history ministry.
	*
	* @return the officer name of this result history ministry
	*/
	@Override
	public java.lang.String getOfficerName() {
		return _resultHistoryMinistry.getOfficerName();
	}

	/**
	* Sets the officer name of this result history ministry.
	*
	* @param officerName the officer name of this result history ministry
	*/
	@Override
	public void setOfficerName(java.lang.String officerName) {
		_resultHistoryMinistry.setOfficerName(officerName);
	}

	/**
	* Returns the latest date of this result history ministry.
	*
	* @return the latest date of this result history ministry
	*/
	@Override
	public java.util.Date getLatestDate() {
		return _resultHistoryMinistry.getLatestDate();
	}

	/**
	* Sets the latest date of this result history ministry.
	*
	* @param latestDate the latest date of this result history ministry
	*/
	@Override
	public void setLatestDate(java.util.Date latestDate) {
		_resultHistoryMinistry.setLatestDate(latestDate);
	}

	/**
	* Returns the business type code of this result history ministry.
	*
	* @return the business type code of this result history ministry
	*/
	@Override
	public int getBusinessTypeCode() {
		return _resultHistoryMinistry.getBusinessTypeCode();
	}

	/**
	* Sets the business type code of this result history ministry.
	*
	* @param businessTypeCode the business type code of this result history ministry
	*/
	@Override
	public void setBusinessTypeCode(int businessTypeCode) {
		_resultHistoryMinistry.setBusinessTypeCode(businessTypeCode);
	}

	/**
	* Returns the response of this result history ministry.
	*
	* @return the response of this result history ministry
	*/
	@Override
	public java.lang.String getResponse() {
		return _resultHistoryMinistry.getResponse();
	}

	/**
	* Sets the response of this result history ministry.
	*
	* @param response the response of this result history ministry
	*/
	@Override
	public void setResponse(java.lang.String response) {
		_resultHistoryMinistry.setResponse(response);
	}

	/**
	* Returns the remarks of this result history ministry.
	*
	* @return the remarks of this result history ministry
	*/
	@Override
	public java.lang.String getRemarks() {
		return _resultHistoryMinistry.getRemarks();
	}

	/**
	* Sets the remarks of this result history ministry.
	*
	* @param remarks the remarks of this result history ministry
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_resultHistoryMinistry.setRemarks(remarks);
	}

	@Override
	public boolean isNew() {
		return _resultHistoryMinistry.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_resultHistoryMinistry.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _resultHistoryMinistry.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_resultHistoryMinistry.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _resultHistoryMinistry.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _resultHistoryMinistry.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_resultHistoryMinistry.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _resultHistoryMinistry.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_resultHistoryMinistry.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_resultHistoryMinistry.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_resultHistoryMinistry.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ResultHistoryMinistryWrapper((ResultHistoryMinistry)_resultHistoryMinistry.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry resultHistoryMinistry) {
		return _resultHistoryMinistry.compareTo(resultHistoryMinistry);
	}

	@Override
	public int hashCode() {
		return _resultHistoryMinistry.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry> toCacheModel() {
		return _resultHistoryMinistry.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry toEscapedModel() {
		return new ResultHistoryMinistryWrapper(_resultHistoryMinistry.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry toUnescapedModel() {
		return new ResultHistoryMinistryWrapper(_resultHistoryMinistry.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _resultHistoryMinistry.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _resultHistoryMinistry.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_resultHistoryMinistry.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ResultHistoryMinistryWrapper)) {
			return false;
		}

		ResultHistoryMinistryWrapper resultHistoryMinistryWrapper = (ResultHistoryMinistryWrapper)obj;

		if (Validator.equals(_resultHistoryMinistry,
					resultHistoryMinistryWrapper._resultHistoryMinistry)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ResultHistoryMinistry getWrappedResultHistoryMinistry() {
		return _resultHistoryMinistry;
	}

	@Override
	public ResultHistoryMinistry getWrappedModel() {
		return _resultHistoryMinistry;
	}

	@Override
	public void resetOriginalValues() {
		_resultHistoryMinistry.resetOriginalValues();
	}

	private ResultHistoryMinistry _resultHistoryMinistry;
}