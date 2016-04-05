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
 * This class is a wrapper for {@link DmUnitGeneral}.
 * </p>
 *
 * @author longdm
 * @see DmUnitGeneral
 * @generated
 */
public class DmUnitGeneralWrapper implements DmUnitGeneral,
	ModelWrapper<DmUnitGeneral> {
	public DmUnitGeneralWrapper(DmUnitGeneral dmUnitGeneral) {
		_dmUnitGeneral = dmUnitGeneral;
	}

	@Override
	public Class<?> getModelClass() {
		return DmUnitGeneral.class;
	}

	@Override
	public String getModelClassName() {
		return DmUnitGeneral.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("unitCode", getUnitCode());
		attributes.put("unitName", getUnitName());
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

		String unitCode = (String)attributes.get("unitCode");

		if (unitCode != null) {
			setUnitCode(unitCode);
		}

		String unitName = (String)attributes.get("unitName");

		if (unitName != null) {
			setUnitName(unitName);
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
	* Returns the primary key of this dm unit general.
	*
	* @return the primary key of this dm unit general
	*/
	@Override
	public int getPrimaryKey() {
		return _dmUnitGeneral.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm unit general.
	*
	* @param primaryKey the primary key of this dm unit general
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_dmUnitGeneral.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm unit general.
	*
	* @return the ID of this dm unit general
	*/
	@Override
	public int getId() {
		return _dmUnitGeneral.getId();
	}

	/**
	* Sets the ID of this dm unit general.
	*
	* @param id the ID of this dm unit general
	*/
	@Override
	public void setId(int id) {
		_dmUnitGeneral.setId(id);
	}

	/**
	* Returns the unit code of this dm unit general.
	*
	* @return the unit code of this dm unit general
	*/
	@Override
	public java.lang.String getUnitCode() {
		return _dmUnitGeneral.getUnitCode();
	}

	/**
	* Sets the unit code of this dm unit general.
	*
	* @param unitCode the unit code of this dm unit general
	*/
	@Override
	public void setUnitCode(java.lang.String unitCode) {
		_dmUnitGeneral.setUnitCode(unitCode);
	}

	/**
	* Returns the unit name of this dm unit general.
	*
	* @return the unit name of this dm unit general
	*/
	@Override
	public java.lang.String getUnitName() {
		return _dmUnitGeneral.getUnitName();
	}

	/**
	* Sets the unit name of this dm unit general.
	*
	* @param unitName the unit name of this dm unit general
	*/
	@Override
	public void setUnitName(java.lang.String unitName) {
		_dmUnitGeneral.setUnitName(unitName);
	}

	/**
	* Returns the is delete of this dm unit general.
	*
	* @return the is delete of this dm unit general
	*/
	@Override
	public int getIsDelete() {
		return _dmUnitGeneral.getIsDelete();
	}

	/**
	* Sets the is delete of this dm unit general.
	*
	* @param isDelete the is delete of this dm unit general
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmUnitGeneral.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm unit general.
	*
	* @return the marked as delete of this dm unit general
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmUnitGeneral.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm unit general.
	*
	* @param markedAsDelete the marked as delete of this dm unit general
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmUnitGeneral.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm unit general.
	*
	* @return the modified date of this dm unit general
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmUnitGeneral.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm unit general.
	*
	* @param modifiedDate the modified date of this dm unit general
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmUnitGeneral.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm unit general.
	*
	* @return the requested date of this dm unit general
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmUnitGeneral.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm unit general.
	*
	* @param requestedDate the requested date of this dm unit general
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmUnitGeneral.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm unit general.
	*
	* @return the sync version of this dm unit general
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmUnitGeneral.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm unit general.
	*
	* @param syncVersion the sync version of this dm unit general
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmUnitGeneral.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmUnitGeneral.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmUnitGeneral.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmUnitGeneral.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmUnitGeneral.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmUnitGeneral.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmUnitGeneral.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmUnitGeneral.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmUnitGeneral.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmUnitGeneral.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmUnitGeneral.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmUnitGeneral.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmUnitGeneralWrapper((DmUnitGeneral)_dmUnitGeneral.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.DmUnitGeneral dmUnitGeneral) {
		return _dmUnitGeneral.compareTo(dmUnitGeneral);
	}

	@Override
	public int hashCode() {
		return _dmUnitGeneral.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.DmUnitGeneral> toCacheModel() {
		return _dmUnitGeneral.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmUnitGeneral toEscapedModel() {
		return new DmUnitGeneralWrapper(_dmUnitGeneral.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmUnitGeneral toUnescapedModel() {
		return new DmUnitGeneralWrapper(_dmUnitGeneral.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmUnitGeneral.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmUnitGeneral.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmUnitGeneral.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmUnitGeneralWrapper)) {
			return false;
		}

		DmUnitGeneralWrapper dmUnitGeneralWrapper = (DmUnitGeneralWrapper)obj;

		if (Validator.equals(_dmUnitGeneral, dmUnitGeneralWrapper._dmUnitGeneral)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmUnitGeneral getWrappedDmUnitGeneral() {
		return _dmUnitGeneral;
	}

	@Override
	public DmUnitGeneral getWrappedModel() {
		return _dmUnitGeneral;
	}

	@Override
	public void resetOriginalValues() {
		_dmUnitGeneral.resetOriginalValues();
	}

	private DmUnitGeneral _dmUnitGeneral;
}