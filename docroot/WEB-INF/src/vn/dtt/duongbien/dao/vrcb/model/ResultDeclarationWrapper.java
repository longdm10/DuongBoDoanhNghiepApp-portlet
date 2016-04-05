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
 * This class is a wrapper for {@link ResultDeclaration}.
 * </p>
 *
 * @author longdm
 * @see ResultDeclaration
 * @generated
 */
public class ResultDeclarationWrapper implements ResultDeclaration,
	ModelWrapper<ResultDeclaration> {
	public ResultDeclarationWrapper(ResultDeclaration resultDeclaration) {
		_resultDeclaration = resultDeclaration;
	}

	@Override
	public Class<?> getModelClass() {
		return ResultDeclaration.class;
	}

	@Override
	public String getModelClassName() {
		return ResultDeclaration.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("requestCode", getRequestCode());
		attributes.put("requestState", getRequestState());
		attributes.put("documentName", getDocumentName());
		attributes.put("documentYear", getDocumentYear());
		attributes.put("businessOrder", getBusinessOrder());
		attributes.put("businessTypeCode", getBusinessTypeCode());
		attributes.put("latestSend", getLatestSend());
		attributes.put("declarationTime", getDeclarationTime());
		attributes.put("arrivalDepartureTime", getArrivalDepartureTime());
		attributes.put("remainingTime", getRemainingTime());
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

		Integer businessOrder = (Integer)attributes.get("businessOrder");

		if (businessOrder != null) {
			setBusinessOrder(businessOrder);
		}

		Integer businessTypeCode = (Integer)attributes.get("businessTypeCode");

		if (businessTypeCode != null) {
			setBusinessTypeCode(businessTypeCode);
		}

		Integer latestSend = (Integer)attributes.get("latestSend");

		if (latestSend != null) {
			setLatestSend(latestSend);
		}

		Date declarationTime = (Date)attributes.get("declarationTime");

		if (declarationTime != null) {
			setDeclarationTime(declarationTime);
		}

		Date arrivalDepartureTime = (Date)attributes.get("arrivalDepartureTime");

		if (arrivalDepartureTime != null) {
			setArrivalDepartureTime(arrivalDepartureTime);
		}

		String remainingTime = (String)attributes.get("remainingTime");

		if (remainingTime != null) {
			setRemainingTime(remainingTime);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}
	}

	/**
	* Returns the primary key of this result declaration.
	*
	* @return the primary key of this result declaration
	*/
	@Override
	public long getPrimaryKey() {
		return _resultDeclaration.getPrimaryKey();
	}

	/**
	* Sets the primary key of this result declaration.
	*
	* @param primaryKey the primary key of this result declaration
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_resultDeclaration.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this result declaration.
	*
	* @return the ID of this result declaration
	*/
	@Override
	public long getId() {
		return _resultDeclaration.getId();
	}

	/**
	* Sets the ID of this result declaration.
	*
	* @param id the ID of this result declaration
	*/
	@Override
	public void setId(long id) {
		_resultDeclaration.setId(id);
	}

	/**
	* Returns the request code of this result declaration.
	*
	* @return the request code of this result declaration
	*/
	@Override
	public java.lang.String getRequestCode() {
		return _resultDeclaration.getRequestCode();
	}

	/**
	* Sets the request code of this result declaration.
	*
	* @param requestCode the request code of this result declaration
	*/
	@Override
	public void setRequestCode(java.lang.String requestCode) {
		_resultDeclaration.setRequestCode(requestCode);
	}

	/**
	* Returns the request state of this result declaration.
	*
	* @return the request state of this result declaration
	*/
	@Override
	public int getRequestState() {
		return _resultDeclaration.getRequestState();
	}

	/**
	* Sets the request state of this result declaration.
	*
	* @param requestState the request state of this result declaration
	*/
	@Override
	public void setRequestState(int requestState) {
		_resultDeclaration.setRequestState(requestState);
	}

	/**
	* Returns the document name of this result declaration.
	*
	* @return the document name of this result declaration
	*/
	@Override
	public long getDocumentName() {
		return _resultDeclaration.getDocumentName();
	}

	/**
	* Sets the document name of this result declaration.
	*
	* @param documentName the document name of this result declaration
	*/
	@Override
	public void setDocumentName(long documentName) {
		_resultDeclaration.setDocumentName(documentName);
	}

	/**
	* Returns the document year of this result declaration.
	*
	* @return the document year of this result declaration
	*/
	@Override
	public int getDocumentYear() {
		return _resultDeclaration.getDocumentYear();
	}

	/**
	* Sets the document year of this result declaration.
	*
	* @param documentYear the document year of this result declaration
	*/
	@Override
	public void setDocumentYear(int documentYear) {
		_resultDeclaration.setDocumentYear(documentYear);
	}

	/**
	* Returns the business order of this result declaration.
	*
	* @return the business order of this result declaration
	*/
	@Override
	public int getBusinessOrder() {
		return _resultDeclaration.getBusinessOrder();
	}

	/**
	* Sets the business order of this result declaration.
	*
	* @param businessOrder the business order of this result declaration
	*/
	@Override
	public void setBusinessOrder(int businessOrder) {
		_resultDeclaration.setBusinessOrder(businessOrder);
	}

	/**
	* Returns the business type code of this result declaration.
	*
	* @return the business type code of this result declaration
	*/
	@Override
	public int getBusinessTypeCode() {
		return _resultDeclaration.getBusinessTypeCode();
	}

	/**
	* Sets the business type code of this result declaration.
	*
	* @param businessTypeCode the business type code of this result declaration
	*/
	@Override
	public void setBusinessTypeCode(int businessTypeCode) {
		_resultDeclaration.setBusinessTypeCode(businessTypeCode);
	}

	/**
	* Returns the latest send of this result declaration.
	*
	* @return the latest send of this result declaration
	*/
	@Override
	public int getLatestSend() {
		return _resultDeclaration.getLatestSend();
	}

	/**
	* Sets the latest send of this result declaration.
	*
	* @param latestSend the latest send of this result declaration
	*/
	@Override
	public void setLatestSend(int latestSend) {
		_resultDeclaration.setLatestSend(latestSend);
	}

	/**
	* Returns the declaration time of this result declaration.
	*
	* @return the declaration time of this result declaration
	*/
	@Override
	public java.util.Date getDeclarationTime() {
		return _resultDeclaration.getDeclarationTime();
	}

	/**
	* Sets the declaration time of this result declaration.
	*
	* @param declarationTime the declaration time of this result declaration
	*/
	@Override
	public void setDeclarationTime(java.util.Date declarationTime) {
		_resultDeclaration.setDeclarationTime(declarationTime);
	}

	/**
	* Returns the arrival departure time of this result declaration.
	*
	* @return the arrival departure time of this result declaration
	*/
	@Override
	public java.util.Date getArrivalDepartureTime() {
		return _resultDeclaration.getArrivalDepartureTime();
	}

	/**
	* Sets the arrival departure time of this result declaration.
	*
	* @param arrivalDepartureTime the arrival departure time of this result declaration
	*/
	@Override
	public void setArrivalDepartureTime(java.util.Date arrivalDepartureTime) {
		_resultDeclaration.setArrivalDepartureTime(arrivalDepartureTime);
	}

	/**
	* Returns the remaining time of this result declaration.
	*
	* @return the remaining time of this result declaration
	*/
	@Override
	public java.lang.String getRemainingTime() {
		return _resultDeclaration.getRemainingTime();
	}

	/**
	* Sets the remaining time of this result declaration.
	*
	* @param remainingTime the remaining time of this result declaration
	*/
	@Override
	public void setRemainingTime(java.lang.String remainingTime) {
		_resultDeclaration.setRemainingTime(remainingTime);
	}

	/**
	* Returns the remarks of this result declaration.
	*
	* @return the remarks of this result declaration
	*/
	@Override
	public java.lang.String getRemarks() {
		return _resultDeclaration.getRemarks();
	}

	/**
	* Sets the remarks of this result declaration.
	*
	* @param remarks the remarks of this result declaration
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_resultDeclaration.setRemarks(remarks);
	}

	@Override
	public boolean isNew() {
		return _resultDeclaration.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_resultDeclaration.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _resultDeclaration.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_resultDeclaration.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _resultDeclaration.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _resultDeclaration.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_resultDeclaration.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _resultDeclaration.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_resultDeclaration.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_resultDeclaration.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_resultDeclaration.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ResultDeclarationWrapper((ResultDeclaration)_resultDeclaration.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration resultDeclaration) {
		return _resultDeclaration.compareTo(resultDeclaration);
	}

	@Override
	public int hashCode() {
		return _resultDeclaration.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration> toCacheModel() {
		return _resultDeclaration.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration toEscapedModel() {
		return new ResultDeclarationWrapper(_resultDeclaration.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration toUnescapedModel() {
		return new ResultDeclarationWrapper(_resultDeclaration.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _resultDeclaration.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _resultDeclaration.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_resultDeclaration.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ResultDeclarationWrapper)) {
			return false;
		}

		ResultDeclarationWrapper resultDeclarationWrapper = (ResultDeclarationWrapper)obj;

		if (Validator.equals(_resultDeclaration,
					resultDeclarationWrapper._resultDeclaration)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ResultDeclaration getWrappedResultDeclaration() {
		return _resultDeclaration;
	}

	@Override
	public ResultDeclaration getWrappedModel() {
		return _resultDeclaration;
	}

	@Override
	public void resetOriginalValues() {
		_resultDeclaration.resetOriginalValues();
	}

	private ResultDeclaration _resultDeclaration;
}