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
 * This class is a wrapper for {@link DmHistoryUnitGeneral}.
 * </p>
 *
 * @author longdm
 * @see DmHistoryUnitGeneral
 * @generated
 */
public class DmHistoryUnitGeneralWrapper implements DmHistoryUnitGeneral,
	ModelWrapper<DmHistoryUnitGeneral> {
	public DmHistoryUnitGeneralWrapper(
		DmHistoryUnitGeneral dmHistoryUnitGeneral) {
		_dmHistoryUnitGeneral = dmHistoryUnitGeneral;
	}

	@Override
	public Class<?> getModelClass() {
		return DmHistoryUnitGeneral.class;
	}

	@Override
	public String getModelClassName() {
		return DmHistoryUnitGeneral.class.getName();
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
	* Returns the primary key of this dm history unit general.
	*
	* @return the primary key of this dm history unit general
	*/
	@Override
	public int getPrimaryKey() {
		return _dmHistoryUnitGeneral.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm history unit general.
	*
	* @param primaryKey the primary key of this dm history unit general
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_dmHistoryUnitGeneral.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm history unit general.
	*
	* @return the ID of this dm history unit general
	*/
	@Override
	public int getId() {
		return _dmHistoryUnitGeneral.getId();
	}

	/**
	* Sets the ID of this dm history unit general.
	*
	* @param id the ID of this dm history unit general
	*/
	@Override
	public void setId(int id) {
		_dmHistoryUnitGeneral.setId(id);
	}

	/**
	* Returns the unit code of this dm history unit general.
	*
	* @return the unit code of this dm history unit general
	*/
	@Override
	public java.lang.String getUnitCode() {
		return _dmHistoryUnitGeneral.getUnitCode();
	}

	/**
	* Sets the unit code of this dm history unit general.
	*
	* @param unitCode the unit code of this dm history unit general
	*/
	@Override
	public void setUnitCode(java.lang.String unitCode) {
		_dmHistoryUnitGeneral.setUnitCode(unitCode);
	}

	/**
	* Returns the unit name of this dm history unit general.
	*
	* @return the unit name of this dm history unit general
	*/
	@Override
	public java.lang.String getUnitName() {
		return _dmHistoryUnitGeneral.getUnitName();
	}

	/**
	* Sets the unit name of this dm history unit general.
	*
	* @param unitName the unit name of this dm history unit general
	*/
	@Override
	public void setUnitName(java.lang.String unitName) {
		_dmHistoryUnitGeneral.setUnitName(unitName);
	}

	/**
	* Returns the is delete of this dm history unit general.
	*
	* @return the is delete of this dm history unit general
	*/
	@Override
	public int getIsDelete() {
		return _dmHistoryUnitGeneral.getIsDelete();
	}

	/**
	* Sets the is delete of this dm history unit general.
	*
	* @param isDelete the is delete of this dm history unit general
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmHistoryUnitGeneral.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm history unit general.
	*
	* @return the marked as delete of this dm history unit general
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmHistoryUnitGeneral.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm history unit general.
	*
	* @param markedAsDelete the marked as delete of this dm history unit general
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmHistoryUnitGeneral.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm history unit general.
	*
	* @return the modified date of this dm history unit general
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmHistoryUnitGeneral.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm history unit general.
	*
	* @param modifiedDate the modified date of this dm history unit general
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmHistoryUnitGeneral.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm history unit general.
	*
	* @return the requested date of this dm history unit general
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmHistoryUnitGeneral.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm history unit general.
	*
	* @param requestedDate the requested date of this dm history unit general
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmHistoryUnitGeneral.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm history unit general.
	*
	* @return the sync version of this dm history unit general
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmHistoryUnitGeneral.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm history unit general.
	*
	* @param syncVersion the sync version of this dm history unit general
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmHistoryUnitGeneral.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmHistoryUnitGeneral.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmHistoryUnitGeneral.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmHistoryUnitGeneral.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmHistoryUnitGeneral.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmHistoryUnitGeneral.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmHistoryUnitGeneral.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmHistoryUnitGeneral.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmHistoryUnitGeneral.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmHistoryUnitGeneral.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmHistoryUnitGeneral.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmHistoryUnitGeneral.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmHistoryUnitGeneralWrapper((DmHistoryUnitGeneral)_dmHistoryUnitGeneral.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryUnitGeneral dmHistoryUnitGeneral) {
		return _dmHistoryUnitGeneral.compareTo(dmHistoryUnitGeneral);
	}

	@Override
	public int hashCode() {
		return _dmHistoryUnitGeneral.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.DmHistoryUnitGeneral> toCacheModel() {
		return _dmHistoryUnitGeneral.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryUnitGeneral toEscapedModel() {
		return new DmHistoryUnitGeneralWrapper(_dmHistoryUnitGeneral.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryUnitGeneral toUnescapedModel() {
		return new DmHistoryUnitGeneralWrapper(_dmHistoryUnitGeneral.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmHistoryUnitGeneral.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmHistoryUnitGeneral.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryUnitGeneral.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmHistoryUnitGeneralWrapper)) {
			return false;
		}

		DmHistoryUnitGeneralWrapper dmHistoryUnitGeneralWrapper = (DmHistoryUnitGeneralWrapper)obj;

		if (Validator.equals(_dmHistoryUnitGeneral,
					dmHistoryUnitGeneralWrapper._dmHistoryUnitGeneral)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmHistoryUnitGeneral getWrappedDmHistoryUnitGeneral() {
		return _dmHistoryUnitGeneral;
	}

	@Override
	public DmHistoryUnitGeneral getWrappedModel() {
		return _dmHistoryUnitGeneral;
	}

	@Override
	public void resetOriginalValues() {
		_dmHistoryUnitGeneral.resetOriginalValues();
	}

	private DmHistoryUnitGeneral _dmHistoryUnitGeneral;
}