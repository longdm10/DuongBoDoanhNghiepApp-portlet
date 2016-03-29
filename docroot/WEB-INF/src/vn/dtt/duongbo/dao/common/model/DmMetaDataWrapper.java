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

package vn.dtt.duongbo.dao.common.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DmMetaData}.
 * </p>
 *
 * @author win_64
 * @see DmMetaData
 * @generated
 */
public class DmMetaDataWrapper implements DmMetaData, ModelWrapper<DmMetaData> {
	public DmMetaDataWrapper(DmMetaData dmMetaData) {
		_dmMetaData = dmMetaData;
	}

	@Override
	public Class<?> getModelClass() {
		return DmMetaData.class;
	}

	@Override
	public String getModelClassName() {
		return DmMetaData.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("entity", getEntity());
		attributes.put("fieldCode", getFieldCode());
		attributes.put("fieldName", getFieldName());
		attributes.put("fieldAlterName", getFieldAlterName());
		attributes.put("fieldDescription", getFieldDescription());
		attributes.put("fieldDataSet", getFieldDataSet());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String entity = (String)attributes.get("entity");

		if (entity != null) {
			setEntity(entity);
		}

		String fieldCode = (String)attributes.get("fieldCode");

		if (fieldCode != null) {
			setFieldCode(fieldCode);
		}

		String fieldName = (String)attributes.get("fieldName");

		if (fieldName != null) {
			setFieldName(fieldName);
		}

		String fieldAlterName = (String)attributes.get("fieldAlterName");

		if (fieldAlterName != null) {
			setFieldAlterName(fieldAlterName);
		}

		String fieldDescription = (String)attributes.get("fieldDescription");

		if (fieldDescription != null) {
			setFieldDescription(fieldDescription);
		}

		String fieldDataSet = (String)attributes.get("fieldDataSet");

		if (fieldDataSet != null) {
			setFieldDataSet(fieldDataSet);
		}
	}

	/**
	* Returns the primary key of this dm meta data.
	*
	* @return the primary key of this dm meta data
	*/
	@Override
	public long getPrimaryKey() {
		return _dmMetaData.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm meta data.
	*
	* @param primaryKey the primary key of this dm meta data
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dmMetaData.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm meta data.
	*
	* @return the ID of this dm meta data
	*/
	@Override
	public long getId() {
		return _dmMetaData.getId();
	}

	/**
	* Sets the ID of this dm meta data.
	*
	* @param id the ID of this dm meta data
	*/
	@Override
	public void setId(long id) {
		_dmMetaData.setId(id);
	}

	/**
	* Returns the entity of this dm meta data.
	*
	* @return the entity of this dm meta data
	*/
	@Override
	public java.lang.String getEntity() {
		return _dmMetaData.getEntity();
	}

	/**
	* Sets the entity of this dm meta data.
	*
	* @param entity the entity of this dm meta data
	*/
	@Override
	public void setEntity(java.lang.String entity) {
		_dmMetaData.setEntity(entity);
	}

	/**
	* Returns the field code of this dm meta data.
	*
	* @return the field code of this dm meta data
	*/
	@Override
	public java.lang.String getFieldCode() {
		return _dmMetaData.getFieldCode();
	}

	/**
	* Sets the field code of this dm meta data.
	*
	* @param fieldCode the field code of this dm meta data
	*/
	@Override
	public void setFieldCode(java.lang.String fieldCode) {
		_dmMetaData.setFieldCode(fieldCode);
	}

	/**
	* Returns the field name of this dm meta data.
	*
	* @return the field name of this dm meta data
	*/
	@Override
	public java.lang.String getFieldName() {
		return _dmMetaData.getFieldName();
	}

	/**
	* Sets the field name of this dm meta data.
	*
	* @param fieldName the field name of this dm meta data
	*/
	@Override
	public void setFieldName(java.lang.String fieldName) {
		_dmMetaData.setFieldName(fieldName);
	}

	/**
	* Returns the field alter name of this dm meta data.
	*
	* @return the field alter name of this dm meta data
	*/
	@Override
	public java.lang.String getFieldAlterName() {
		return _dmMetaData.getFieldAlterName();
	}

	/**
	* Sets the field alter name of this dm meta data.
	*
	* @param fieldAlterName the field alter name of this dm meta data
	*/
	@Override
	public void setFieldAlterName(java.lang.String fieldAlterName) {
		_dmMetaData.setFieldAlterName(fieldAlterName);
	}

	/**
	* Returns the field description of this dm meta data.
	*
	* @return the field description of this dm meta data
	*/
	@Override
	public java.lang.String getFieldDescription() {
		return _dmMetaData.getFieldDescription();
	}

	/**
	* Sets the field description of this dm meta data.
	*
	* @param fieldDescription the field description of this dm meta data
	*/
	@Override
	public void setFieldDescription(java.lang.String fieldDescription) {
		_dmMetaData.setFieldDescription(fieldDescription);
	}

	/**
	* Returns the field data set of this dm meta data.
	*
	* @return the field data set of this dm meta data
	*/
	@Override
	public java.lang.String getFieldDataSet() {
		return _dmMetaData.getFieldDataSet();
	}

	/**
	* Sets the field data set of this dm meta data.
	*
	* @param fieldDataSet the field data set of this dm meta data
	*/
	@Override
	public void setFieldDataSet(java.lang.String fieldDataSet) {
		_dmMetaData.setFieldDataSet(fieldDataSet);
	}

	@Override
	public boolean isNew() {
		return _dmMetaData.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmMetaData.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmMetaData.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmMetaData.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmMetaData.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmMetaData.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmMetaData.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmMetaData.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmMetaData.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmMetaData.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmMetaData.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmMetaDataWrapper((DmMetaData)_dmMetaData.clone());
	}

	@Override
	public int compareTo(vn.dtt.duongbo.dao.common.model.DmMetaData dmMetaData) {
		return _dmMetaData.compareTo(dmMetaData);
	}

	@Override
	public int hashCode() {
		return _dmMetaData.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.common.model.DmMetaData> toCacheModel() {
		return _dmMetaData.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.DmMetaData toEscapedModel() {
		return new DmMetaDataWrapper(_dmMetaData.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.DmMetaData toUnescapedModel() {
		return new DmMetaDataWrapper(_dmMetaData.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmMetaData.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmMetaData.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmMetaData.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmMetaDataWrapper)) {
			return false;
		}

		DmMetaDataWrapper dmMetaDataWrapper = (DmMetaDataWrapper)obj;

		if (Validator.equals(_dmMetaData, dmMetaDataWrapper._dmMetaData)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmMetaData getWrappedDmMetaData() {
		return _dmMetaData;
	}

	@Override
	public DmMetaData getWrappedModel() {
		return _dmMetaData;
	}

	@Override
	public void resetOriginalValues() {
		_dmMetaData.resetOriginalValues();
	}

	private DmMetaData _dmMetaData;
}