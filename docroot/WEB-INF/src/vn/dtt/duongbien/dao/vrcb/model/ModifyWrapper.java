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
 * This class is a wrapper for {@link Modify}.
 * </p>
 *
 * @author longdm
 * @see Modify
 * @generated
 */
public class ModifyWrapper implements Modify, ModelWrapper<Modify> {
	public ModifyWrapper(Modify modify) {
		_modify = modify;
	}

	@Override
	public Class<?> getModelClass() {
		return Modify.class;
	}

	@Override
	public String getModelClassName() {
		return Modify.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("modifyCode", getModifyCode());
		attributes.put("modifyDesc", getModifyDesc());
		attributes.put("organization", getOrganization());
		attributes.put("division", getDivision());
		attributes.put("name", getName());
		attributes.put("modifyDate", getModifyDate());
		attributes.put("documentName", getDocumentName());
		attributes.put("documentYear", getDocumentYear());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String modifyCode = (String)attributes.get("modifyCode");

		if (modifyCode != null) {
			setModifyCode(modifyCode);
		}

		String modifyDesc = (String)attributes.get("modifyDesc");

		if (modifyDesc != null) {
			setModifyDesc(modifyDesc);
		}

		String organization = (String)attributes.get("organization");

		if (organization != null) {
			setOrganization(organization);
		}

		String division = (String)attributes.get("division");

		if (division != null) {
			setDivision(division);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Date modifyDate = (Date)attributes.get("modifyDate");

		if (modifyDate != null) {
			setModifyDate(modifyDate);
		}

		Long documentName = (Long)attributes.get("documentName");

		if (documentName != null) {
			setDocumentName(documentName);
		}

		Long documentYear = (Long)attributes.get("documentYear");

		if (documentYear != null) {
			setDocumentYear(documentYear);
		}
	}

	/**
	* Returns the primary key of this modify.
	*
	* @return the primary key of this modify
	*/
	@Override
	public long getPrimaryKey() {
		return _modify.getPrimaryKey();
	}

	/**
	* Sets the primary key of this modify.
	*
	* @param primaryKey the primary key of this modify
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_modify.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this modify.
	*
	* @return the ID of this modify
	*/
	@Override
	public long getId() {
		return _modify.getId();
	}

	/**
	* Sets the ID of this modify.
	*
	* @param id the ID of this modify
	*/
	@Override
	public void setId(long id) {
		_modify.setId(id);
	}

	/**
	* Returns the modify code of this modify.
	*
	* @return the modify code of this modify
	*/
	@Override
	public java.lang.String getModifyCode() {
		return _modify.getModifyCode();
	}

	/**
	* Sets the modify code of this modify.
	*
	* @param modifyCode the modify code of this modify
	*/
	@Override
	public void setModifyCode(java.lang.String modifyCode) {
		_modify.setModifyCode(modifyCode);
	}

	/**
	* Returns the modify desc of this modify.
	*
	* @return the modify desc of this modify
	*/
	@Override
	public java.lang.String getModifyDesc() {
		return _modify.getModifyDesc();
	}

	/**
	* Sets the modify desc of this modify.
	*
	* @param modifyDesc the modify desc of this modify
	*/
	@Override
	public void setModifyDesc(java.lang.String modifyDesc) {
		_modify.setModifyDesc(modifyDesc);
	}

	/**
	* Returns the organization of this modify.
	*
	* @return the organization of this modify
	*/
	@Override
	public java.lang.String getOrganization() {
		return _modify.getOrganization();
	}

	/**
	* Sets the organization of this modify.
	*
	* @param organization the organization of this modify
	*/
	@Override
	public void setOrganization(java.lang.String organization) {
		_modify.setOrganization(organization);
	}

	/**
	* Returns the division of this modify.
	*
	* @return the division of this modify
	*/
	@Override
	public java.lang.String getDivision() {
		return _modify.getDivision();
	}

	/**
	* Sets the division of this modify.
	*
	* @param division the division of this modify
	*/
	@Override
	public void setDivision(java.lang.String division) {
		_modify.setDivision(division);
	}

	/**
	* Returns the name of this modify.
	*
	* @return the name of this modify
	*/
	@Override
	public java.lang.String getName() {
		return _modify.getName();
	}

	/**
	* Sets the name of this modify.
	*
	* @param name the name of this modify
	*/
	@Override
	public void setName(java.lang.String name) {
		_modify.setName(name);
	}

	/**
	* Returns the modify date of this modify.
	*
	* @return the modify date of this modify
	*/
	@Override
	public java.util.Date getModifyDate() {
		return _modify.getModifyDate();
	}

	/**
	* Sets the modify date of this modify.
	*
	* @param modifyDate the modify date of this modify
	*/
	@Override
	public void setModifyDate(java.util.Date modifyDate) {
		_modify.setModifyDate(modifyDate);
	}

	/**
	* Returns the document name of this modify.
	*
	* @return the document name of this modify
	*/
	@Override
	public long getDocumentName() {
		return _modify.getDocumentName();
	}

	/**
	* Sets the document name of this modify.
	*
	* @param documentName the document name of this modify
	*/
	@Override
	public void setDocumentName(long documentName) {
		_modify.setDocumentName(documentName);
	}

	/**
	* Returns the document year of this modify.
	*
	* @return the document year of this modify
	*/
	@Override
	public long getDocumentYear() {
		return _modify.getDocumentYear();
	}

	/**
	* Sets the document year of this modify.
	*
	* @param documentYear the document year of this modify
	*/
	@Override
	public void setDocumentYear(long documentYear) {
		_modify.setDocumentYear(documentYear);
	}

	@Override
	public boolean isNew() {
		return _modify.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_modify.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _modify.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_modify.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _modify.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _modify.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_modify.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _modify.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_modify.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_modify.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_modify.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ModifyWrapper((Modify)_modify.clone());
	}

	@Override
	public int compareTo(Modify modify) {
		return _modify.compareTo(modify);
	}

	@Override
	public int hashCode() {
		return _modify.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<Modify> toCacheModel() {
		return _modify.toCacheModel();
	}

	@Override
	public Modify toEscapedModel() {
		return new ModifyWrapper(_modify.toEscapedModel());
	}

	@Override
	public Modify toUnescapedModel() {
		return new ModifyWrapper(_modify.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _modify.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _modify.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_modify.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ModifyWrapper)) {
			return false;
		}

		ModifyWrapper modifyWrapper = (ModifyWrapper)obj;

		if (Validator.equals(_modify, modifyWrapper._modify)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Modify getWrappedModify() {
		return _modify;
	}

	@Override
	public Modify getWrappedModel() {
		return _modify;
	}

	@Override
	public void resetOriginalValues() {
		_modify.resetOriginalValues();
	}

	private Modify _modify;
}