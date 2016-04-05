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
 * This class is a wrapper for {@link HistorySyncVersion}.
 * </p>
 *
 * @author longdm
 * @see HistorySyncVersion
 * @generated
 */
public class HistorySyncVersionWrapper implements HistorySyncVersion,
	ModelWrapper<HistorySyncVersion> {
	public HistorySyncVersionWrapper(HistorySyncVersion historySyncVersion) {
		_historySyncVersion = historySyncVersion;
	}

	@Override
	public Class<?> getModelClass() {
		return HistorySyncVersion.class;
	}

	@Override
	public String getModelClassName() {
		return HistorySyncVersion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("requestedDate", getRequestedDate());
		attributes.put("timeofPublish", getTimeofPublish());
		attributes.put("categoryID", getCategoryID());
		attributes.put("syncUnit", getSyncUnit());
		attributes.put("syncUser", getSyncUser());
		attributes.put("syncVersion", getSyncVersion());
		attributes.put("latestValueDate", getLatestValueDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Date requestedDate = (Date)attributes.get("requestedDate");

		if (requestedDate != null) {
			setRequestedDate(requestedDate);
		}

		Date timeofPublish = (Date)attributes.get("timeofPublish");

		if (timeofPublish != null) {
			setTimeofPublish(timeofPublish);
		}

		String categoryID = (String)attributes.get("categoryID");

		if (categoryID != null) {
			setCategoryID(categoryID);
		}

		String syncUnit = (String)attributes.get("syncUnit");

		if (syncUnit != null) {
			setSyncUnit(syncUnit);
		}

		String syncUser = (String)attributes.get("syncUser");

		if (syncUser != null) {
			setSyncUser(syncUser);
		}

		String syncVersion = (String)attributes.get("syncVersion");

		if (syncVersion != null) {
			setSyncVersion(syncVersion);
		}

		Date latestValueDate = (Date)attributes.get("latestValueDate");

		if (latestValueDate != null) {
			setLatestValueDate(latestValueDate);
		}
	}

	/**
	* Returns the primary key of this history sync version.
	*
	* @return the primary key of this history sync version
	*/
	@Override
	public long getPrimaryKey() {
		return _historySyncVersion.getPrimaryKey();
	}

	/**
	* Sets the primary key of this history sync version.
	*
	* @param primaryKey the primary key of this history sync version
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_historySyncVersion.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this history sync version.
	*
	* @return the ID of this history sync version
	*/
	@Override
	public long getId() {
		return _historySyncVersion.getId();
	}

	/**
	* Sets the ID of this history sync version.
	*
	* @param id the ID of this history sync version
	*/
	@Override
	public void setId(long id) {
		_historySyncVersion.setId(id);
	}

	/**
	* Returns the requested date of this history sync version.
	*
	* @return the requested date of this history sync version
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _historySyncVersion.getRequestedDate();
	}

	/**
	* Sets the requested date of this history sync version.
	*
	* @param requestedDate the requested date of this history sync version
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_historySyncVersion.setRequestedDate(requestedDate);
	}

	/**
	* Returns the timeof publish of this history sync version.
	*
	* @return the timeof publish of this history sync version
	*/
	@Override
	public java.util.Date getTimeofPublish() {
		return _historySyncVersion.getTimeofPublish();
	}

	/**
	* Sets the timeof publish of this history sync version.
	*
	* @param timeofPublish the timeof publish of this history sync version
	*/
	@Override
	public void setTimeofPublish(java.util.Date timeofPublish) {
		_historySyncVersion.setTimeofPublish(timeofPublish);
	}

	/**
	* Returns the category i d of this history sync version.
	*
	* @return the category i d of this history sync version
	*/
	@Override
	public java.lang.String getCategoryID() {
		return _historySyncVersion.getCategoryID();
	}

	/**
	* Sets the category i d of this history sync version.
	*
	* @param categoryID the category i d of this history sync version
	*/
	@Override
	public void setCategoryID(java.lang.String categoryID) {
		_historySyncVersion.setCategoryID(categoryID);
	}

	/**
	* Returns the sync unit of this history sync version.
	*
	* @return the sync unit of this history sync version
	*/
	@Override
	public java.lang.String getSyncUnit() {
		return _historySyncVersion.getSyncUnit();
	}

	/**
	* Sets the sync unit of this history sync version.
	*
	* @param syncUnit the sync unit of this history sync version
	*/
	@Override
	public void setSyncUnit(java.lang.String syncUnit) {
		_historySyncVersion.setSyncUnit(syncUnit);
	}

	/**
	* Returns the sync user of this history sync version.
	*
	* @return the sync user of this history sync version
	*/
	@Override
	public java.lang.String getSyncUser() {
		return _historySyncVersion.getSyncUser();
	}

	/**
	* Sets the sync user of this history sync version.
	*
	* @param syncUser the sync user of this history sync version
	*/
	@Override
	public void setSyncUser(java.lang.String syncUser) {
		_historySyncVersion.setSyncUser(syncUser);
	}

	/**
	* Returns the sync version of this history sync version.
	*
	* @return the sync version of this history sync version
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _historySyncVersion.getSyncVersion();
	}

	/**
	* Sets the sync version of this history sync version.
	*
	* @param syncVersion the sync version of this history sync version
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_historySyncVersion.setSyncVersion(syncVersion);
	}

	/**
	* Returns the latest value date of this history sync version.
	*
	* @return the latest value date of this history sync version
	*/
	@Override
	public java.util.Date getLatestValueDate() {
		return _historySyncVersion.getLatestValueDate();
	}

	/**
	* Sets the latest value date of this history sync version.
	*
	* @param latestValueDate the latest value date of this history sync version
	*/
	@Override
	public void setLatestValueDate(java.util.Date latestValueDate) {
		_historySyncVersion.setLatestValueDate(latestValueDate);
	}

	@Override
	public boolean isNew() {
		return _historySyncVersion.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_historySyncVersion.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _historySyncVersion.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_historySyncVersion.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _historySyncVersion.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _historySyncVersion.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_historySyncVersion.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _historySyncVersion.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_historySyncVersion.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_historySyncVersion.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_historySyncVersion.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new HistorySyncVersionWrapper((HistorySyncVersion)_historySyncVersion.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.HistorySyncVersion historySyncVersion) {
		return _historySyncVersion.compareTo(historySyncVersion);
	}

	@Override
	public int hashCode() {
		return _historySyncVersion.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.HistorySyncVersion> toCacheModel() {
		return _historySyncVersion.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.HistorySyncVersion toEscapedModel() {
		return new HistorySyncVersionWrapper(_historySyncVersion.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.HistorySyncVersion toUnescapedModel() {
		return new HistorySyncVersionWrapper(_historySyncVersion.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _historySyncVersion.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _historySyncVersion.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_historySyncVersion.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof HistorySyncVersionWrapper)) {
			return false;
		}

		HistorySyncVersionWrapper historySyncVersionWrapper = (HistorySyncVersionWrapper)obj;

		if (Validator.equals(_historySyncVersion,
					historySyncVersionWrapper._historySyncVersion)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public HistorySyncVersion getWrappedHistorySyncVersion() {
		return _historySyncVersion;
	}

	@Override
	public HistorySyncVersion getWrappedModel() {
		return _historySyncVersion;
	}

	@Override
	public void resetOriginalValues() {
		_historySyncVersion.resetOriginalValues();
	}

	private HistorySyncVersion _historySyncVersion;
}