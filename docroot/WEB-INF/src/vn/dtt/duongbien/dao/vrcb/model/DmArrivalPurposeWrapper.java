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
 * This class is a wrapper for {@link DmArrivalPurpose}.
 * </p>
 *
 * @author longdm
 * @see DmArrivalPurpose
 * @generated
 */
public class DmArrivalPurposeWrapper implements DmArrivalPurpose,
	ModelWrapper<DmArrivalPurpose> {
	public DmArrivalPurposeWrapper(DmArrivalPurpose dmArrivalPurpose) {
		_dmArrivalPurpose = dmArrivalPurpose;
	}

	@Override
	public Class<?> getModelClass() {
		return DmArrivalPurpose.class;
	}

	@Override
	public String getModelClassName() {
		return DmArrivalPurpose.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("purposeCode", getPurposeCode());
		attributes.put("purposeName", getPurposeName());
		attributes.put("purposeNameVN", getPurposeNameVN());
		attributes.put("isDelete", getIsDelete());
		attributes.put("markedAsDelete", getMarkedAsDelete());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("requestedDate", getRequestedDate());
		attributes.put("syncVersion", getSyncVersion());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String purposeCode = (String)attributes.get("purposeCode");

		if (purposeCode != null) {
			setPurposeCode(purposeCode);
		}

		String purposeName = (String)attributes.get("purposeName");

		if (purposeName != null) {
			setPurposeName(purposeName);
		}

		String purposeNameVN = (String)attributes.get("purposeNameVN");

		if (purposeNameVN != null) {
			setPurposeNameVN(purposeNameVN);
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
	* Returns the primary key of this dm arrival purpose.
	*
	* @return the primary key of this dm arrival purpose
	*/
	@Override
	public int getPrimaryKey() {
		return _dmArrivalPurpose.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm arrival purpose.
	*
	* @param primaryKey the primary key of this dm arrival purpose
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_dmArrivalPurpose.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm arrival purpose.
	*
	* @return the ID of this dm arrival purpose
	*/
	@Override
	public int getId() {
		return _dmArrivalPurpose.getId();
	}

	/**
	* Sets the ID of this dm arrival purpose.
	*
	* @param id the ID of this dm arrival purpose
	*/
	@Override
	public void setId(int id) {
		_dmArrivalPurpose.setId(id);
	}

	/**
	* Returns the purpose code of this dm arrival purpose.
	*
	* @return the purpose code of this dm arrival purpose
	*/
	@Override
	public java.lang.String getPurposeCode() {
		return _dmArrivalPurpose.getPurposeCode();
	}

	/**
	* Sets the purpose code of this dm arrival purpose.
	*
	* @param purposeCode the purpose code of this dm arrival purpose
	*/
	@Override
	public void setPurposeCode(java.lang.String purposeCode) {
		_dmArrivalPurpose.setPurposeCode(purposeCode);
	}

	/**
	* Returns the purpose name of this dm arrival purpose.
	*
	* @return the purpose name of this dm arrival purpose
	*/
	@Override
	public java.lang.String getPurposeName() {
		return _dmArrivalPurpose.getPurposeName();
	}

	/**
	* Sets the purpose name of this dm arrival purpose.
	*
	* @param purposeName the purpose name of this dm arrival purpose
	*/
	@Override
	public void setPurposeName(java.lang.String purposeName) {
		_dmArrivalPurpose.setPurposeName(purposeName);
	}

	/**
	* Returns the purpose name v n of this dm arrival purpose.
	*
	* @return the purpose name v n of this dm arrival purpose
	*/
	@Override
	public java.lang.String getPurposeNameVN() {
		return _dmArrivalPurpose.getPurposeNameVN();
	}

	/**
	* Sets the purpose name v n of this dm arrival purpose.
	*
	* @param purposeNameVN the purpose name v n of this dm arrival purpose
	*/
	@Override
	public void setPurposeNameVN(java.lang.String purposeNameVN) {
		_dmArrivalPurpose.setPurposeNameVN(purposeNameVN);
	}

	/**
	* Returns the is delete of this dm arrival purpose.
	*
	* @return the is delete of this dm arrival purpose
	*/
	@Override
	public int getIsDelete() {
		return _dmArrivalPurpose.getIsDelete();
	}

	/**
	* Sets the is delete of this dm arrival purpose.
	*
	* @param isDelete the is delete of this dm arrival purpose
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmArrivalPurpose.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm arrival purpose.
	*
	* @return the marked as delete of this dm arrival purpose
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmArrivalPurpose.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm arrival purpose.
	*
	* @param markedAsDelete the marked as delete of this dm arrival purpose
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmArrivalPurpose.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm arrival purpose.
	*
	* @return the modified date of this dm arrival purpose
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmArrivalPurpose.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm arrival purpose.
	*
	* @param modifiedDate the modified date of this dm arrival purpose
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmArrivalPurpose.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm arrival purpose.
	*
	* @return the requested date of this dm arrival purpose
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmArrivalPurpose.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm arrival purpose.
	*
	* @param requestedDate the requested date of this dm arrival purpose
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmArrivalPurpose.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm arrival purpose.
	*
	* @return the sync version of this dm arrival purpose
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmArrivalPurpose.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm arrival purpose.
	*
	* @param syncVersion the sync version of this dm arrival purpose
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmArrivalPurpose.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmArrivalPurpose.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmArrivalPurpose.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmArrivalPurpose.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmArrivalPurpose.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmArrivalPurpose.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmArrivalPurpose.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmArrivalPurpose.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmArrivalPurpose.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmArrivalPurpose.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmArrivalPurpose.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmArrivalPurpose.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmArrivalPurposeWrapper((DmArrivalPurpose)_dmArrivalPurpose.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.DmArrivalPurpose dmArrivalPurpose) {
		return _dmArrivalPurpose.compareTo(dmArrivalPurpose);
	}

	@Override
	public int hashCode() {
		return _dmArrivalPurpose.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.DmArrivalPurpose> toCacheModel() {
		return _dmArrivalPurpose.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmArrivalPurpose toEscapedModel() {
		return new DmArrivalPurposeWrapper(_dmArrivalPurpose.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmArrivalPurpose toUnescapedModel() {
		return new DmArrivalPurposeWrapper(_dmArrivalPurpose.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmArrivalPurpose.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmArrivalPurpose.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmArrivalPurpose.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmArrivalPurposeWrapper)) {
			return false;
		}

		DmArrivalPurposeWrapper dmArrivalPurposeWrapper = (DmArrivalPurposeWrapper)obj;

		if (Validator.equals(_dmArrivalPurpose,
					dmArrivalPurposeWrapper._dmArrivalPurpose)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmArrivalPurpose getWrappedDmArrivalPurpose() {
		return _dmArrivalPurpose;
	}

	@Override
	public DmArrivalPurpose getWrappedModel() {
		return _dmArrivalPurpose;
	}

	@Override
	public void resetOriginalValues() {
		_dmArrivalPurpose.resetOriginalValues();
	}

	private DmArrivalPurpose _dmArrivalPurpose;
}