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
 * This class is a wrapper for {@link ResultMinistry}.
 * </p>
 *
 * @author longdm
 * @see ResultMinistry
 * @generated
 */
public class ResultMinistryWrapper implements ResultMinistry,
	ModelWrapper<ResultMinistry> {
	public ResultMinistryWrapper(ResultMinistry resultMinistry) {
		_resultMinistry = resultMinistry;
	}

	@Override
	public Class<?> getModelClass() {
		return ResultMinistry.class;
	}

	@Override
	public String getModelClassName() {
		return ResultMinistry.class.getName();
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

		Integer documentName = (Integer)attributes.get("documentName");

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
	* Returns the primary key of this result ministry.
	*
	* @return the primary key of this result ministry
	*/
	@Override
	public long getPrimaryKey() {
		return _resultMinistry.getPrimaryKey();
	}

	/**
	* Sets the primary key of this result ministry.
	*
	* @param primaryKey the primary key of this result ministry
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_resultMinistry.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this result ministry.
	*
	* @return the ID of this result ministry
	*/
	@Override
	public long getId() {
		return _resultMinistry.getId();
	}

	/**
	* Sets the ID of this result ministry.
	*
	* @param id the ID of this result ministry
	*/
	@Override
	public void setId(long id) {
		_resultMinistry.setId(id);
	}

	/**
	* Returns the request code of this result ministry.
	*
	* @return the request code of this result ministry
	*/
	@Override
	public java.lang.String getRequestCode() {
		return _resultMinistry.getRequestCode();
	}

	/**
	* Sets the request code of this result ministry.
	*
	* @param requestCode the request code of this result ministry
	*/
	@Override
	public void setRequestCode(java.lang.String requestCode) {
		_resultMinistry.setRequestCode(requestCode);
	}

	/**
	* Returns the request state of this result ministry.
	*
	* @return the request state of this result ministry
	*/
	@Override
	public int getRequestState() {
		return _resultMinistry.getRequestState();
	}

	/**
	* Sets the request state of this result ministry.
	*
	* @param requestState the request state of this result ministry
	*/
	@Override
	public void setRequestState(int requestState) {
		_resultMinistry.setRequestState(requestState);
	}

	/**
	* Returns the document name of this result ministry.
	*
	* @return the document name of this result ministry
	*/
	@Override
	public int getDocumentName() {
		return _resultMinistry.getDocumentName();
	}

	/**
	* Sets the document name of this result ministry.
	*
	* @param documentName the document name of this result ministry
	*/
	@Override
	public void setDocumentName(int documentName) {
		_resultMinistry.setDocumentName(documentName);
	}

	/**
	* Returns the document year of this result ministry.
	*
	* @return the document year of this result ministry
	*/
	@Override
	public int getDocumentYear() {
		return _resultMinistry.getDocumentYear();
	}

	/**
	* Sets the document year of this result ministry.
	*
	* @param documentYear the document year of this result ministry
	*/
	@Override
	public void setDocumentYear(int documentYear) {
		_resultMinistry.setDocumentYear(documentYear);
	}

	/**
	* Returns the ministry code of this result ministry.
	*
	* @return the ministry code of this result ministry
	*/
	@Override
	public java.lang.String getMinistryCode() {
		return _resultMinistry.getMinistryCode();
	}

	/**
	* Sets the ministry code of this result ministry.
	*
	* @param ministryCode the ministry code of this result ministry
	*/
	@Override
	public void setMinistryCode(java.lang.String ministryCode) {
		_resultMinistry.setMinistryCode(ministryCode);
	}

	/**
	* Returns the organization of this result ministry.
	*
	* @return the organization of this result ministry
	*/
	@Override
	public java.lang.String getOrganization() {
		return _resultMinistry.getOrganization();
	}

	/**
	* Sets the organization of this result ministry.
	*
	* @param organization the organization of this result ministry
	*/
	@Override
	public void setOrganization(java.lang.String organization) {
		_resultMinistry.setOrganization(organization);
	}

	/**
	* Returns the division of this result ministry.
	*
	* @return the division of this result ministry
	*/
	@Override
	public java.lang.String getDivision() {
		return _resultMinistry.getDivision();
	}

	/**
	* Sets the division of this result ministry.
	*
	* @param division the division of this result ministry
	*/
	@Override
	public void setDivision(java.lang.String division) {
		_resultMinistry.setDivision(division);
	}

	/**
	* Returns the officer name of this result ministry.
	*
	* @return the officer name of this result ministry
	*/
	@Override
	public java.lang.String getOfficerName() {
		return _resultMinistry.getOfficerName();
	}

	/**
	* Sets the officer name of this result ministry.
	*
	* @param officerName the officer name of this result ministry
	*/
	@Override
	public void setOfficerName(java.lang.String officerName) {
		_resultMinistry.setOfficerName(officerName);
	}

	/**
	* Returns the latest date of this result ministry.
	*
	* @return the latest date of this result ministry
	*/
	@Override
	public java.util.Date getLatestDate() {
		return _resultMinistry.getLatestDate();
	}

	/**
	* Sets the latest date of this result ministry.
	*
	* @param latestDate the latest date of this result ministry
	*/
	@Override
	public void setLatestDate(java.util.Date latestDate) {
		_resultMinistry.setLatestDate(latestDate);
	}

	/**
	* Returns the business type code of this result ministry.
	*
	* @return the business type code of this result ministry
	*/
	@Override
	public int getBusinessTypeCode() {
		return _resultMinistry.getBusinessTypeCode();
	}

	/**
	* Sets the business type code of this result ministry.
	*
	* @param businessTypeCode the business type code of this result ministry
	*/
	@Override
	public void setBusinessTypeCode(int businessTypeCode) {
		_resultMinistry.setBusinessTypeCode(businessTypeCode);
	}

	/**
	* Returns the response of this result ministry.
	*
	* @return the response of this result ministry
	*/
	@Override
	public java.lang.String getResponse() {
		return _resultMinistry.getResponse();
	}

	/**
	* Sets the response of this result ministry.
	*
	* @param response the response of this result ministry
	*/
	@Override
	public void setResponse(java.lang.String response) {
		_resultMinistry.setResponse(response);
	}

	/**
	* Returns the remarks of this result ministry.
	*
	* @return the remarks of this result ministry
	*/
	@Override
	public java.lang.String getRemarks() {
		return _resultMinistry.getRemarks();
	}

	/**
	* Sets the remarks of this result ministry.
	*
	* @param remarks the remarks of this result ministry
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_resultMinistry.setRemarks(remarks);
	}

	@Override
	public boolean isNew() {
		return _resultMinistry.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_resultMinistry.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _resultMinistry.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_resultMinistry.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _resultMinistry.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _resultMinistry.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_resultMinistry.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _resultMinistry.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_resultMinistry.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_resultMinistry.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_resultMinistry.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ResultMinistryWrapper((ResultMinistry)_resultMinistry.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.ResultMinistry resultMinistry) {
		return _resultMinistry.compareTo(resultMinistry);
	}

	@Override
	public int hashCode() {
		return _resultMinistry.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.ResultMinistry> toCacheModel() {
		return _resultMinistry.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.ResultMinistry toEscapedModel() {
		return new ResultMinistryWrapper(_resultMinistry.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.ResultMinistry toUnescapedModel() {
		return new ResultMinistryWrapper(_resultMinistry.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _resultMinistry.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _resultMinistry.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_resultMinistry.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ResultMinistryWrapper)) {
			return false;
		}

		ResultMinistryWrapper resultMinistryWrapper = (ResultMinistryWrapper)obj;

		if (Validator.equals(_resultMinistry,
					resultMinistryWrapper._resultMinistry)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ResultMinistry getWrappedResultMinistry() {
		return _resultMinistry;
	}

	@Override
	public ResultMinistry getWrappedModel() {
		return _resultMinistry;
	}

	@Override
	public void resetOriginalValues() {
		_resultMinistry.resetOriginalValues();
	}

	private ResultMinistry _resultMinistry;
}