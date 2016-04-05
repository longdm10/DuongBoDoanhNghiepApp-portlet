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
 * This class is a wrapper for {@link DmHistoryArrivalPurpose}.
 * </p>
 *
 * @author longdm
 * @see DmHistoryArrivalPurpose
 * @generated
 */
public class DmHistoryArrivalPurposeWrapper implements DmHistoryArrivalPurpose,
	ModelWrapper<DmHistoryArrivalPurpose> {
	public DmHistoryArrivalPurposeWrapper(
		DmHistoryArrivalPurpose dmHistoryArrivalPurpose) {
		_dmHistoryArrivalPurpose = dmHistoryArrivalPurpose;
	}

	@Override
	public Class<?> getModelClass() {
		return DmHistoryArrivalPurpose.class;
	}

	@Override
	public String getModelClassName() {
		return DmHistoryArrivalPurpose.class.getName();
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
	* Returns the primary key of this dm history arrival purpose.
	*
	* @return the primary key of this dm history arrival purpose
	*/
	@Override
	public int getPrimaryKey() {
		return _dmHistoryArrivalPurpose.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm history arrival purpose.
	*
	* @param primaryKey the primary key of this dm history arrival purpose
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_dmHistoryArrivalPurpose.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm history arrival purpose.
	*
	* @return the ID of this dm history arrival purpose
	*/
	@Override
	public int getId() {
		return _dmHistoryArrivalPurpose.getId();
	}

	/**
	* Sets the ID of this dm history arrival purpose.
	*
	* @param id the ID of this dm history arrival purpose
	*/
	@Override
	public void setId(int id) {
		_dmHistoryArrivalPurpose.setId(id);
	}

	/**
	* Returns the purpose code of this dm history arrival purpose.
	*
	* @return the purpose code of this dm history arrival purpose
	*/
	@Override
	public java.lang.String getPurposeCode() {
		return _dmHistoryArrivalPurpose.getPurposeCode();
	}

	/**
	* Sets the purpose code of this dm history arrival purpose.
	*
	* @param purposeCode the purpose code of this dm history arrival purpose
	*/
	@Override
	public void setPurposeCode(java.lang.String purposeCode) {
		_dmHistoryArrivalPurpose.setPurposeCode(purposeCode);
	}

	/**
	* Returns the purpose name of this dm history arrival purpose.
	*
	* @return the purpose name of this dm history arrival purpose
	*/
	@Override
	public java.lang.String getPurposeName() {
		return _dmHistoryArrivalPurpose.getPurposeName();
	}

	/**
	* Sets the purpose name of this dm history arrival purpose.
	*
	* @param purposeName the purpose name of this dm history arrival purpose
	*/
	@Override
	public void setPurposeName(java.lang.String purposeName) {
		_dmHistoryArrivalPurpose.setPurposeName(purposeName);
	}

	/**
	* Returns the purpose name v n of this dm history arrival purpose.
	*
	* @return the purpose name v n of this dm history arrival purpose
	*/
	@Override
	public java.lang.String getPurposeNameVN() {
		return _dmHistoryArrivalPurpose.getPurposeNameVN();
	}

	/**
	* Sets the purpose name v n of this dm history arrival purpose.
	*
	* @param purposeNameVN the purpose name v n of this dm history arrival purpose
	*/
	@Override
	public void setPurposeNameVN(java.lang.String purposeNameVN) {
		_dmHistoryArrivalPurpose.setPurposeNameVN(purposeNameVN);
	}

	/**
	* Returns the is delete of this dm history arrival purpose.
	*
	* @return the is delete of this dm history arrival purpose
	*/
	@Override
	public int getIsDelete() {
		return _dmHistoryArrivalPurpose.getIsDelete();
	}

	/**
	* Sets the is delete of this dm history arrival purpose.
	*
	* @param isDelete the is delete of this dm history arrival purpose
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmHistoryArrivalPurpose.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm history arrival purpose.
	*
	* @return the marked as delete of this dm history arrival purpose
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmHistoryArrivalPurpose.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm history arrival purpose.
	*
	* @param markedAsDelete the marked as delete of this dm history arrival purpose
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmHistoryArrivalPurpose.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm history arrival purpose.
	*
	* @return the modified date of this dm history arrival purpose
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmHistoryArrivalPurpose.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm history arrival purpose.
	*
	* @param modifiedDate the modified date of this dm history arrival purpose
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmHistoryArrivalPurpose.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm history arrival purpose.
	*
	* @return the requested date of this dm history arrival purpose
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmHistoryArrivalPurpose.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm history arrival purpose.
	*
	* @param requestedDate the requested date of this dm history arrival purpose
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmHistoryArrivalPurpose.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm history arrival purpose.
	*
	* @return the sync version of this dm history arrival purpose
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmHistoryArrivalPurpose.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm history arrival purpose.
	*
	* @param syncVersion the sync version of this dm history arrival purpose
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmHistoryArrivalPurpose.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmHistoryArrivalPurpose.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmHistoryArrivalPurpose.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmHistoryArrivalPurpose.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmHistoryArrivalPurpose.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmHistoryArrivalPurpose.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmHistoryArrivalPurpose.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmHistoryArrivalPurpose.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmHistoryArrivalPurpose.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmHistoryArrivalPurpose.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmHistoryArrivalPurpose.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmHistoryArrivalPurpose.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmHistoryArrivalPurposeWrapper((DmHistoryArrivalPurpose)_dmHistoryArrivalPurpose.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryArrivalPurpose dmHistoryArrivalPurpose) {
		return _dmHistoryArrivalPurpose.compareTo(dmHistoryArrivalPurpose);
	}

	@Override
	public int hashCode() {
		return _dmHistoryArrivalPurpose.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.DmHistoryArrivalPurpose> toCacheModel() {
		return _dmHistoryArrivalPurpose.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryArrivalPurpose toEscapedModel() {
		return new DmHistoryArrivalPurposeWrapper(_dmHistoryArrivalPurpose.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryArrivalPurpose toUnescapedModel() {
		return new DmHistoryArrivalPurposeWrapper(_dmHistoryArrivalPurpose.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmHistoryArrivalPurpose.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmHistoryArrivalPurpose.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryArrivalPurpose.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmHistoryArrivalPurposeWrapper)) {
			return false;
		}

		DmHistoryArrivalPurposeWrapper dmHistoryArrivalPurposeWrapper = (DmHistoryArrivalPurposeWrapper)obj;

		if (Validator.equals(_dmHistoryArrivalPurpose,
					dmHistoryArrivalPurposeWrapper._dmHistoryArrivalPurpose)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmHistoryArrivalPurpose getWrappedDmHistoryArrivalPurpose() {
		return _dmHistoryArrivalPurpose;
	}

	@Override
	public DmHistoryArrivalPurpose getWrappedModel() {
		return _dmHistoryArrivalPurpose;
	}

	@Override
	public void resetOriginalValues() {
		_dmHistoryArrivalPurpose.resetOriginalValues();
	}

	private DmHistoryArrivalPurpose _dmHistoryArrivalPurpose;
}