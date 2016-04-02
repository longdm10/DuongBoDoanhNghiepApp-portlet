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
 * This class is a wrapper for {@link ResultCertificate}.
 * </p>
 *
 * @author longdm
 * @see ResultCertificate
 * @generated
 */
public class ResultCertificateWrapper implements ResultCertificate,
	ModelWrapper<ResultCertificate> {
	public ResultCertificateWrapper(ResultCertificate resultCertificate) {
		_resultCertificate = resultCertificate;
	}

	@Override
	public Class<?> getModelClass() {
		return ResultCertificate.class;
	}

	@Override
	public String getModelClassName() {
		return ResultCertificate.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("documentName", getDocumentName());
		attributes.put("documentYear", getDocumentYear());
		attributes.put("maritimeCode", getMaritimeCode());
		attributes.put("certificateCode", getCertificateCode());
		attributes.put("certificateOrder", getCertificateOrder());
		attributes.put("certificateNo", getCertificateNo());
		attributes.put("certificateIssueDate", getCertificateIssueDate());
		attributes.put("certificateExpiredDate", getCertificateExpiredDate());
		attributes.put("examinationDate", getExaminationDate());
		attributes.put("approvalName", getApprovalName());
		attributes.put("isExamined", getIsExamined());
		attributes.put("mandatory", getMandatory());

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

		Integer documentYear = (Integer)attributes.get("documentYear");

		if (documentYear != null) {
			setDocumentYear(documentYear);
		}

		String maritimeCode = (String)attributes.get("maritimeCode");

		if (maritimeCode != null) {
			setMaritimeCode(maritimeCode);
		}

		String certificateCode = (String)attributes.get("certificateCode");

		if (certificateCode != null) {
			setCertificateCode(certificateCode);
		}

		Integer certificateOrder = (Integer)attributes.get("certificateOrder");

		if (certificateOrder != null) {
			setCertificateOrder(certificateOrder);
		}

		String certificateNo = (String)attributes.get("certificateNo");

		if (certificateNo != null) {
			setCertificateNo(certificateNo);
		}

		Date certificateIssueDate = (Date)attributes.get("certificateIssueDate");

		if (certificateIssueDate != null) {
			setCertificateIssueDate(certificateIssueDate);
		}

		Date certificateExpiredDate = (Date)attributes.get(
				"certificateExpiredDate");

		if (certificateExpiredDate != null) {
			setCertificateExpiredDate(certificateExpiredDate);
		}

		Date examinationDate = (Date)attributes.get("examinationDate");

		if (examinationDate != null) {
			setExaminationDate(examinationDate);
		}

		String approvalName = (String)attributes.get("approvalName");

		if (approvalName != null) {
			setApprovalName(approvalName);
		}

		Integer isExamined = (Integer)attributes.get("isExamined");

		if (isExamined != null) {
			setIsExamined(isExamined);
		}

		Integer mandatory = (Integer)attributes.get("mandatory");

		if (mandatory != null) {
			setMandatory(mandatory);
		}
	}

	/**
	* Returns the primary key of this result certificate.
	*
	* @return the primary key of this result certificate
	*/
	@Override
	public long getPrimaryKey() {
		return _resultCertificate.getPrimaryKey();
	}

	/**
	* Sets the primary key of this result certificate.
	*
	* @param primaryKey the primary key of this result certificate
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_resultCertificate.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this result certificate.
	*
	* @return the ID of this result certificate
	*/
	@Override
	public long getId() {
		return _resultCertificate.getId();
	}

	/**
	* Sets the ID of this result certificate.
	*
	* @param id the ID of this result certificate
	*/
	@Override
	public void setId(long id) {
		_resultCertificate.setId(id);
	}

	/**
	* Returns the document name of this result certificate.
	*
	* @return the document name of this result certificate
	*/
	@Override
	public long getDocumentName() {
		return _resultCertificate.getDocumentName();
	}

	/**
	* Sets the document name of this result certificate.
	*
	* @param documentName the document name of this result certificate
	*/
	@Override
	public void setDocumentName(long documentName) {
		_resultCertificate.setDocumentName(documentName);
	}

	/**
	* Returns the document year of this result certificate.
	*
	* @return the document year of this result certificate
	*/
	@Override
	public int getDocumentYear() {
		return _resultCertificate.getDocumentYear();
	}

	/**
	* Sets the document year of this result certificate.
	*
	* @param documentYear the document year of this result certificate
	*/
	@Override
	public void setDocumentYear(int documentYear) {
		_resultCertificate.setDocumentYear(documentYear);
	}

	/**
	* Returns the maritime code of this result certificate.
	*
	* @return the maritime code of this result certificate
	*/
	@Override
	public java.lang.String getMaritimeCode() {
		return _resultCertificate.getMaritimeCode();
	}

	/**
	* Sets the maritime code of this result certificate.
	*
	* @param maritimeCode the maritime code of this result certificate
	*/
	@Override
	public void setMaritimeCode(java.lang.String maritimeCode) {
		_resultCertificate.setMaritimeCode(maritimeCode);
	}

	/**
	* Returns the certificate code of this result certificate.
	*
	* @return the certificate code of this result certificate
	*/
	@Override
	public java.lang.String getCertificateCode() {
		return _resultCertificate.getCertificateCode();
	}

	/**
	* Sets the certificate code of this result certificate.
	*
	* @param certificateCode the certificate code of this result certificate
	*/
	@Override
	public void setCertificateCode(java.lang.String certificateCode) {
		_resultCertificate.setCertificateCode(certificateCode);
	}

	/**
	* Returns the certificate order of this result certificate.
	*
	* @return the certificate order of this result certificate
	*/
	@Override
	public int getCertificateOrder() {
		return _resultCertificate.getCertificateOrder();
	}

	/**
	* Sets the certificate order of this result certificate.
	*
	* @param certificateOrder the certificate order of this result certificate
	*/
	@Override
	public void setCertificateOrder(int certificateOrder) {
		_resultCertificate.setCertificateOrder(certificateOrder);
	}

	/**
	* Returns the certificate no of this result certificate.
	*
	* @return the certificate no of this result certificate
	*/
	@Override
	public java.lang.String getCertificateNo() {
		return _resultCertificate.getCertificateNo();
	}

	/**
	* Sets the certificate no of this result certificate.
	*
	* @param certificateNo the certificate no of this result certificate
	*/
	@Override
	public void setCertificateNo(java.lang.String certificateNo) {
		_resultCertificate.setCertificateNo(certificateNo);
	}

	/**
	* Returns the certificate issue date of this result certificate.
	*
	* @return the certificate issue date of this result certificate
	*/
	@Override
	public java.util.Date getCertificateIssueDate() {
		return _resultCertificate.getCertificateIssueDate();
	}

	/**
	* Sets the certificate issue date of this result certificate.
	*
	* @param certificateIssueDate the certificate issue date of this result certificate
	*/
	@Override
	public void setCertificateIssueDate(java.util.Date certificateIssueDate) {
		_resultCertificate.setCertificateIssueDate(certificateIssueDate);
	}

	/**
	* Returns the certificate expired date of this result certificate.
	*
	* @return the certificate expired date of this result certificate
	*/
	@Override
	public java.util.Date getCertificateExpiredDate() {
		return _resultCertificate.getCertificateExpiredDate();
	}

	/**
	* Sets the certificate expired date of this result certificate.
	*
	* @param certificateExpiredDate the certificate expired date of this result certificate
	*/
	@Override
	public void setCertificateExpiredDate(java.util.Date certificateExpiredDate) {
		_resultCertificate.setCertificateExpiredDate(certificateExpiredDate);
	}

	/**
	* Returns the examination date of this result certificate.
	*
	* @return the examination date of this result certificate
	*/
	@Override
	public java.util.Date getExaminationDate() {
		return _resultCertificate.getExaminationDate();
	}

	/**
	* Sets the examination date of this result certificate.
	*
	* @param examinationDate the examination date of this result certificate
	*/
	@Override
	public void setExaminationDate(java.util.Date examinationDate) {
		_resultCertificate.setExaminationDate(examinationDate);
	}

	/**
	* Returns the approval name of this result certificate.
	*
	* @return the approval name of this result certificate
	*/
	@Override
	public java.lang.String getApprovalName() {
		return _resultCertificate.getApprovalName();
	}

	/**
	* Sets the approval name of this result certificate.
	*
	* @param approvalName the approval name of this result certificate
	*/
	@Override
	public void setApprovalName(java.lang.String approvalName) {
		_resultCertificate.setApprovalName(approvalName);
	}

	/**
	* Returns the is examined of this result certificate.
	*
	* @return the is examined of this result certificate
	*/
	@Override
	public int getIsExamined() {
		return _resultCertificate.getIsExamined();
	}

	/**
	* Sets the is examined of this result certificate.
	*
	* @param isExamined the is examined of this result certificate
	*/
	@Override
	public void setIsExamined(int isExamined) {
		_resultCertificate.setIsExamined(isExamined);
	}

	/**
	* Returns the mandatory of this result certificate.
	*
	* @return the mandatory of this result certificate
	*/
	@Override
	public int getMandatory() {
		return _resultCertificate.getMandatory();
	}

	/**
	* Sets the mandatory of this result certificate.
	*
	* @param mandatory the mandatory of this result certificate
	*/
	@Override
	public void setMandatory(int mandatory) {
		_resultCertificate.setMandatory(mandatory);
	}

	@Override
	public boolean isNew() {
		return _resultCertificate.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_resultCertificate.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _resultCertificate.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_resultCertificate.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _resultCertificate.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _resultCertificate.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_resultCertificate.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _resultCertificate.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_resultCertificate.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_resultCertificate.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_resultCertificate.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ResultCertificateWrapper((ResultCertificate)_resultCertificate.clone());
	}

	@Override
	public int compareTo(ResultCertificate resultCertificate) {
		return _resultCertificate.compareTo(resultCertificate);
	}

	@Override
	public int hashCode() {
		return _resultCertificate.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<ResultCertificate> toCacheModel() {
		return _resultCertificate.toCacheModel();
	}

	@Override
	public ResultCertificate toEscapedModel() {
		return new ResultCertificateWrapper(_resultCertificate.toEscapedModel());
	}

	@Override
	public ResultCertificate toUnescapedModel() {
		return new ResultCertificateWrapper(_resultCertificate.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _resultCertificate.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _resultCertificate.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_resultCertificate.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ResultCertificateWrapper)) {
			return false;
		}

		ResultCertificateWrapper resultCertificateWrapper = (ResultCertificateWrapper)obj;

		if (Validator.equals(_resultCertificate,
					resultCertificateWrapper._resultCertificate)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ResultCertificate getWrappedResultCertificate() {
		return _resultCertificate;
	}

	@Override
	public ResultCertificate getWrappedModel() {
		return _resultCertificate;
	}

	@Override
	public void resetOriginalValues() {
		_resultCertificate.resetOriginalValues();
	}

	private ResultCertificate _resultCertificate;
}