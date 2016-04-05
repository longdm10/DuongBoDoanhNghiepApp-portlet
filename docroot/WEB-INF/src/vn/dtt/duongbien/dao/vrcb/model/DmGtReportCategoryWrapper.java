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
 * This class is a wrapper for {@link DmGtReportCategory}.
 * </p>
 *
 * @author longdm
 * @see DmGtReportCategory
 * @generated
 */
public class DmGtReportCategoryWrapper implements DmGtReportCategory,
	ModelWrapper<DmGtReportCategory> {
	public DmGtReportCategoryWrapper(DmGtReportCategory dmGtReportCategory) {
		_dmGtReportCategory = dmGtReportCategory;
	}

	@Override
	public Class<?> getModelClass() {
		return DmGtReportCategory.class;
	}

	@Override
	public String getModelClassName() {
		return DmGtReportCategory.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("category", getCategory());
		attributes.put("categoryName", getCategoryName());
		attributes.put("categoryOrder", getCategoryOrder());
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

		String category = (String)attributes.get("category");

		if (category != null) {
			setCategory(category);
		}

		String categoryName = (String)attributes.get("categoryName");

		if (categoryName != null) {
			setCategoryName(categoryName);
		}

		Integer categoryOrder = (Integer)attributes.get("categoryOrder");

		if (categoryOrder != null) {
			setCategoryOrder(categoryOrder);
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
	* Returns the primary key of this dm gt report category.
	*
	* @return the primary key of this dm gt report category
	*/
	@Override
	public long getPrimaryKey() {
		return _dmGtReportCategory.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm gt report category.
	*
	* @param primaryKey the primary key of this dm gt report category
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dmGtReportCategory.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm gt report category.
	*
	* @return the ID of this dm gt report category
	*/
	@Override
	public long getId() {
		return _dmGtReportCategory.getId();
	}

	/**
	* Sets the ID of this dm gt report category.
	*
	* @param id the ID of this dm gt report category
	*/
	@Override
	public void setId(long id) {
		_dmGtReportCategory.setId(id);
	}

	/**
	* Returns the category of this dm gt report category.
	*
	* @return the category of this dm gt report category
	*/
	@Override
	public java.lang.String getCategory() {
		return _dmGtReportCategory.getCategory();
	}

	/**
	* Sets the category of this dm gt report category.
	*
	* @param category the category of this dm gt report category
	*/
	@Override
	public void setCategory(java.lang.String category) {
		_dmGtReportCategory.setCategory(category);
	}

	/**
	* Returns the category name of this dm gt report category.
	*
	* @return the category name of this dm gt report category
	*/
	@Override
	public java.lang.String getCategoryName() {
		return _dmGtReportCategory.getCategoryName();
	}

	/**
	* Sets the category name of this dm gt report category.
	*
	* @param categoryName the category name of this dm gt report category
	*/
	@Override
	public void setCategoryName(java.lang.String categoryName) {
		_dmGtReportCategory.setCategoryName(categoryName);
	}

	/**
	* Returns the category order of this dm gt report category.
	*
	* @return the category order of this dm gt report category
	*/
	@Override
	public int getCategoryOrder() {
		return _dmGtReportCategory.getCategoryOrder();
	}

	/**
	* Sets the category order of this dm gt report category.
	*
	* @param categoryOrder the category order of this dm gt report category
	*/
	@Override
	public void setCategoryOrder(int categoryOrder) {
		_dmGtReportCategory.setCategoryOrder(categoryOrder);
	}

	/**
	* Returns the is delete of this dm gt report category.
	*
	* @return the is delete of this dm gt report category
	*/
	@Override
	public int getIsDelete() {
		return _dmGtReportCategory.getIsDelete();
	}

	/**
	* Sets the is delete of this dm gt report category.
	*
	* @param isDelete the is delete of this dm gt report category
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmGtReportCategory.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm gt report category.
	*
	* @return the marked as delete of this dm gt report category
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmGtReportCategory.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm gt report category.
	*
	* @param markedAsDelete the marked as delete of this dm gt report category
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmGtReportCategory.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm gt report category.
	*
	* @return the modified date of this dm gt report category
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmGtReportCategory.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm gt report category.
	*
	* @param modifiedDate the modified date of this dm gt report category
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmGtReportCategory.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm gt report category.
	*
	* @return the requested date of this dm gt report category
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmGtReportCategory.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm gt report category.
	*
	* @param requestedDate the requested date of this dm gt report category
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmGtReportCategory.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm gt report category.
	*
	* @return the sync version of this dm gt report category
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmGtReportCategory.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm gt report category.
	*
	* @param syncVersion the sync version of this dm gt report category
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmGtReportCategory.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmGtReportCategory.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmGtReportCategory.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmGtReportCategory.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmGtReportCategory.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmGtReportCategory.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmGtReportCategory.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmGtReportCategory.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmGtReportCategory.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmGtReportCategory.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmGtReportCategory.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmGtReportCategory.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmGtReportCategoryWrapper((DmGtReportCategory)_dmGtReportCategory.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.DmGtReportCategory dmGtReportCategory) {
		return _dmGtReportCategory.compareTo(dmGtReportCategory);
	}

	@Override
	public int hashCode() {
		return _dmGtReportCategory.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.DmGtReportCategory> toCacheModel() {
		return _dmGtReportCategory.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGtReportCategory toEscapedModel() {
		return new DmGtReportCategoryWrapper(_dmGtReportCategory.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGtReportCategory toUnescapedModel() {
		return new DmGtReportCategoryWrapper(_dmGtReportCategory.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmGtReportCategory.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmGtReportCategory.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmGtReportCategory.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmGtReportCategoryWrapper)) {
			return false;
		}

		DmGtReportCategoryWrapper dmGtReportCategoryWrapper = (DmGtReportCategoryWrapper)obj;

		if (Validator.equals(_dmGtReportCategory,
					dmGtReportCategoryWrapper._dmGtReportCategory)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmGtReportCategory getWrappedDmGtReportCategory() {
		return _dmGtReportCategory;
	}

	@Override
	public DmGtReportCategory getWrappedModel() {
		return _dmGtReportCategory;
	}

	@Override
	public void resetOriginalValues() {
		_dmGtReportCategory.resetOriginalValues();
	}

	private DmGtReportCategory _dmGtReportCategory;
}