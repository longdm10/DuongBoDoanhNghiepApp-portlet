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
 * This class is a wrapper for {@link DmSyncCategory}.
 * </p>
 *
 * @author longdm
 * @see DmSyncCategory
 * @generated
 */
public class DmSyncCategoryWrapper implements DmSyncCategory,
	ModelWrapper<DmSyncCategory> {
	public DmSyncCategoryWrapper(DmSyncCategory dmSyncCategory) {
		_dmSyncCategory = dmSyncCategory;
	}

	@Override
	public Class<?> getModelClass() {
		return DmSyncCategory.class;
	}

	@Override
	public String getModelClassName() {
		return DmSyncCategory.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("categoryId", getCategoryId());
		attributes.put("categoryDescription", getCategoryDescription());
		attributes.put("modifiedUser", getModifiedUser());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String categoryId = (String)attributes.get("categoryId");

		if (categoryId != null) {
			setCategoryId(categoryId);
		}

		String categoryDescription = (String)attributes.get(
				"categoryDescription");

		if (categoryDescription != null) {
			setCategoryDescription(categoryDescription);
		}

		String modifiedUser = (String)attributes.get("modifiedUser");

		if (modifiedUser != null) {
			setModifiedUser(modifiedUser);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	/**
	* Returns the primary key of this dm sync category.
	*
	* @return the primary key of this dm sync category
	*/
	@Override
	public long getPrimaryKey() {
		return _dmSyncCategory.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm sync category.
	*
	* @param primaryKey the primary key of this dm sync category
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dmSyncCategory.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm sync category.
	*
	* @return the ID of this dm sync category
	*/
	@Override
	public long getId() {
		return _dmSyncCategory.getId();
	}

	/**
	* Sets the ID of this dm sync category.
	*
	* @param id the ID of this dm sync category
	*/
	@Override
	public void setId(long id) {
		_dmSyncCategory.setId(id);
	}

	/**
	* Returns the category ID of this dm sync category.
	*
	* @return the category ID of this dm sync category
	*/
	@Override
	public java.lang.String getCategoryId() {
		return _dmSyncCategory.getCategoryId();
	}

	/**
	* Sets the category ID of this dm sync category.
	*
	* @param categoryId the category ID of this dm sync category
	*/
	@Override
	public void setCategoryId(java.lang.String categoryId) {
		_dmSyncCategory.setCategoryId(categoryId);
	}

	/**
	* Returns the category description of this dm sync category.
	*
	* @return the category description of this dm sync category
	*/
	@Override
	public java.lang.String getCategoryDescription() {
		return _dmSyncCategory.getCategoryDescription();
	}

	/**
	* Sets the category description of this dm sync category.
	*
	* @param categoryDescription the category description of this dm sync category
	*/
	@Override
	public void setCategoryDescription(java.lang.String categoryDescription) {
		_dmSyncCategory.setCategoryDescription(categoryDescription);
	}

	/**
	* Returns the modified user of this dm sync category.
	*
	* @return the modified user of this dm sync category
	*/
	@Override
	public java.lang.String getModifiedUser() {
		return _dmSyncCategory.getModifiedUser();
	}

	/**
	* Sets the modified user of this dm sync category.
	*
	* @param modifiedUser the modified user of this dm sync category
	*/
	@Override
	public void setModifiedUser(java.lang.String modifiedUser) {
		_dmSyncCategory.setModifiedUser(modifiedUser);
	}

	/**
	* Returns the modified date of this dm sync category.
	*
	* @return the modified date of this dm sync category
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmSyncCategory.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm sync category.
	*
	* @param modifiedDate the modified date of this dm sync category
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmSyncCategory.setModifiedDate(modifiedDate);
	}

	@Override
	public boolean isNew() {
		return _dmSyncCategory.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmSyncCategory.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmSyncCategory.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmSyncCategory.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmSyncCategory.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmSyncCategory.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmSyncCategory.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmSyncCategory.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmSyncCategory.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmSyncCategory.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmSyncCategory.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmSyncCategoryWrapper((DmSyncCategory)_dmSyncCategory.clone());
	}

	@Override
	public int compareTo(DmSyncCategory dmSyncCategory) {
		return _dmSyncCategory.compareTo(dmSyncCategory);
	}

	@Override
	public int hashCode() {
		return _dmSyncCategory.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<DmSyncCategory> toCacheModel() {
		return _dmSyncCategory.toCacheModel();
	}

	@Override
	public DmSyncCategory toEscapedModel() {
		return new DmSyncCategoryWrapper(_dmSyncCategory.toEscapedModel());
	}

	@Override
	public DmSyncCategory toUnescapedModel() {
		return new DmSyncCategoryWrapper(_dmSyncCategory.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmSyncCategory.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmSyncCategory.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmSyncCategory.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmSyncCategoryWrapper)) {
			return false;
		}

		DmSyncCategoryWrapper dmSyncCategoryWrapper = (DmSyncCategoryWrapper)obj;

		if (Validator.equals(_dmSyncCategory,
					dmSyncCategoryWrapper._dmSyncCategory)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmSyncCategory getWrappedDmSyncCategory() {
		return _dmSyncCategory;
	}

	@Override
	public DmSyncCategory getWrappedModel() {
		return _dmSyncCategory;
	}

	@Override
	public void resetOriginalValues() {
		_dmSyncCategory.resetOriginalValues();
	}

	private DmSyncCategory _dmSyncCategory;
}