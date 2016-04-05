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
 * This class is a wrapper for {@link DmCertificate}.
 * </p>
 *
 * @author longdm
 * @see DmCertificate
 * @generated
 */
public class DmCertificateWrapper implements DmCertificate,
	ModelWrapper<DmCertificate> {
	public DmCertificateWrapper(DmCertificate dmCertificate) {
		_dmCertificate = dmCertificate;
	}

	@Override
	public Class<?> getModelClass() {
		return DmCertificate.class;
	}

	@Override
	public String getModelClassName() {
		return DmCertificate.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("certificateCode", getCertificateCode());
		attributes.put("certificateName", getCertificateName());
		attributes.put("certificateNameVN", getCertificateNameVN());
		attributes.put("certificateOrder", getCertificateOrder());
		attributes.put("isDelete", getIsDelete());
		attributes.put("markedAsDelete", getMarkedAsDelete());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("requestedDate", getRequestedDate());
		attributes.put("syncVersion", getSyncVersion());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String certificateCode = (String)attributes.get("certificateCode");

		if (certificateCode != null) {
			setCertificateCode(certificateCode);
		}

		String certificateName = (String)attributes.get("certificateName");

		if (certificateName != null) {
			setCertificateName(certificateName);
		}

		String certificateNameVN = (String)attributes.get("certificateNameVN");

		if (certificateNameVN != null) {
			setCertificateNameVN(certificateNameVN);
		}

		Integer certificateOrder = (Integer)attributes.get("certificateOrder");

		if (certificateOrder != null) {
			setCertificateOrder(certificateOrder);
		}

		Integer isDelete = (Integer)attributes.get("isDelete");

		if (isDelete != null) {
			setIsDelete(isDelete);
		}

		Integer markedAsDelete = (Integer)attributes.get("markedAsDelete");

		if (markedAsDelete != null) {
			setMarkedAsDelete(markedAsDelete);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Date requestedDate = (Date)attributes.get("requestedDate");

		if (requestedDate != null) {
			setRequestedDate(requestedDate);
		}

		String syncVersion = (String)attributes.get("syncVersion");

		if (syncVersion != null) {
			setSyncVersion(syncVersion);
		}
	}

	/**
	* Returns the primary key of this dm certificate.
	*
	* @return the primary key of this dm certificate
	*/
	@Override
	public long getPrimaryKey() {
		return _dmCertificate.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm certificate.
	*
	* @param primaryKey the primary key of this dm certificate
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dmCertificate.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm certificate.
	*
	* @return the ID of this dm certificate
	*/
	@Override
	public long getId() {
		return _dmCertificate.getId();
	}

	/**
	* Sets the ID of this dm certificate.
	*
	* @param id the ID of this dm certificate
	*/
	@Override
	public void setId(long id) {
		_dmCertificate.setId(id);
	}

	/**
	* Returns the certificate code of this dm certificate.
	*
	* @return the certificate code of this dm certificate
	*/
	@Override
	public java.lang.String getCertificateCode() {
		return _dmCertificate.getCertificateCode();
	}

	/**
	* Sets the certificate code of this dm certificate.
	*
	* @param certificateCode the certificate code of this dm certificate
	*/
	@Override
	public void setCertificateCode(java.lang.String certificateCode) {
		_dmCertificate.setCertificateCode(certificateCode);
	}

	/**
	* Returns the certificate name of this dm certificate.
	*
	* @return the certificate name of this dm certificate
	*/
	@Override
	public java.lang.String getCertificateName() {
		return _dmCertificate.getCertificateName();
	}

	/**
	* Sets the certificate name of this dm certificate.
	*
	* @param certificateName the certificate name of this dm certificate
	*/
	@Override
	public void setCertificateName(java.lang.String certificateName) {
		_dmCertificate.setCertificateName(certificateName);
	}

	/**
	* Returns the certificate name v n of this dm certificate.
	*
	* @return the certificate name v n of this dm certificate
	*/
	@Override
	public java.lang.String getCertificateNameVN() {
		return _dmCertificate.getCertificateNameVN();
	}

	/**
	* Sets the certificate name v n of this dm certificate.
	*
	* @param certificateNameVN the certificate name v n of this dm certificate
	*/
	@Override
	public void setCertificateNameVN(java.lang.String certificateNameVN) {
		_dmCertificate.setCertificateNameVN(certificateNameVN);
	}

	/**
	* Returns the certificate order of this dm certificate.
	*
	* @return the certificate order of this dm certificate
	*/
	@Override
	public int getCertificateOrder() {
		return _dmCertificate.getCertificateOrder();
	}

	/**
	* Sets the certificate order of this dm certificate.
	*
	* @param certificateOrder the certificate order of this dm certificate
	*/
	@Override
	public void setCertificateOrder(int certificateOrder) {
		_dmCertificate.setCertificateOrder(certificateOrder);
	}

	/**
	* Returns the is delete of this dm certificate.
	*
	* @return the is delete of this dm certificate
	*/
	@Override
	public int getIsDelete() {
		return _dmCertificate.getIsDelete();
	}

	/**
	* Sets the is delete of this dm certificate.
	*
	* @param isDelete the is delete of this dm certificate
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmCertificate.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm certificate.
	*
	* @return the marked as delete of this dm certificate
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmCertificate.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm certificate.
	*
	* @param markedAsDelete the marked as delete of this dm certificate
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmCertificate.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm certificate.
	*
	* @return the modified date of this dm certificate
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmCertificate.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm certificate.
	*
	* @param modifiedDate the modified date of this dm certificate
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmCertificate.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm certificate.
	*
	* @return the requested date of this dm certificate
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmCertificate.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm certificate.
	*
	* @param requestedDate the requested date of this dm certificate
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmCertificate.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm certificate.
	*
	* @return the sync version of this dm certificate
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmCertificate.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm certificate.
	*
	* @param syncVersion the sync version of this dm certificate
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmCertificate.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmCertificate.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmCertificate.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmCertificate.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmCertificate.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmCertificate.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmCertificate.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmCertificate.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmCertificate.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmCertificate.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmCertificate.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmCertificate.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmCertificateWrapper((DmCertificate)_dmCertificate.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.DmCertificate dmCertificate) {
		return _dmCertificate.compareTo(dmCertificate);
	}

	@Override
	public int hashCode() {
		return _dmCertificate.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.DmCertificate> toCacheModel() {
		return _dmCertificate.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmCertificate toEscapedModel() {
		return new DmCertificateWrapper(_dmCertificate.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmCertificate toUnescapedModel() {
		return new DmCertificateWrapper(_dmCertificate.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmCertificate.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmCertificate.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmCertificate.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmCertificateWrapper)) {
			return false;
		}

		DmCertificateWrapper dmCertificateWrapper = (DmCertificateWrapper)obj;

		if (Validator.equals(_dmCertificate, dmCertificateWrapper._dmCertificate)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmCertificate getWrappedDmCertificate() {
		return _dmCertificate;
	}

	@Override
	public DmCertificate getWrappedModel() {
		return _dmCertificate;
	}

	@Override
	public void resetOriginalValues() {
		_dmCertificate.resetOriginalValues();
	}

	private DmCertificate _dmCertificate;
}