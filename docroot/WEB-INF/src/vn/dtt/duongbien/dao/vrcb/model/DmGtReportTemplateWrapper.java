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
 * This class is a wrapper for {@link DmGtReportTemplate}.
 * </p>
 *
 * @author longdm
 * @see DmGtReportTemplate
 * @generated
 */
public class DmGtReportTemplateWrapper implements DmGtReportTemplate,
	ModelWrapper<DmGtReportTemplate> {
	public DmGtReportTemplateWrapper(DmGtReportTemplate dmGtReportTemplate) {
		_dmGtReportTemplate = dmGtReportTemplate;
	}

	@Override
	public Class<?> getModelClass() {
		return DmGtReportTemplate.class;
	}

	@Override
	public String getModelClassName() {
		return DmGtReportTemplate.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("reportCode", getReportCode());
		attributes.put("reportName", getReportName());
		attributes.put("reportType", getReportType());
		attributes.put("category", getCategory());
		attributes.put("description", getDescription());
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

		Integer reportCode = (Integer)attributes.get("reportCode");

		if (reportCode != null) {
			setReportCode(reportCode);
		}

		String reportName = (String)attributes.get("reportName");

		if (reportName != null) {
			setReportName(reportName);
		}

		Integer reportType = (Integer)attributes.get("reportType");

		if (reportType != null) {
			setReportType(reportType);
		}

		String category = (String)attributes.get("category");

		if (category != null) {
			setCategory(category);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
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
	* Returns the primary key of this dm gt report template.
	*
	* @return the primary key of this dm gt report template
	*/
	@Override
	public long getPrimaryKey() {
		return _dmGtReportTemplate.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm gt report template.
	*
	* @param primaryKey the primary key of this dm gt report template
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dmGtReportTemplate.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm gt report template.
	*
	* @return the ID of this dm gt report template
	*/
	@Override
	public long getId() {
		return _dmGtReportTemplate.getId();
	}

	/**
	* Sets the ID of this dm gt report template.
	*
	* @param id the ID of this dm gt report template
	*/
	@Override
	public void setId(long id) {
		_dmGtReportTemplate.setId(id);
	}

	/**
	* Returns the report code of this dm gt report template.
	*
	* @return the report code of this dm gt report template
	*/
	@Override
	public int getReportCode() {
		return _dmGtReportTemplate.getReportCode();
	}

	/**
	* Sets the report code of this dm gt report template.
	*
	* @param reportCode the report code of this dm gt report template
	*/
	@Override
	public void setReportCode(int reportCode) {
		_dmGtReportTemplate.setReportCode(reportCode);
	}

	/**
	* Returns the report name of this dm gt report template.
	*
	* @return the report name of this dm gt report template
	*/
	@Override
	public java.lang.String getReportName() {
		return _dmGtReportTemplate.getReportName();
	}

	/**
	* Sets the report name of this dm gt report template.
	*
	* @param reportName the report name of this dm gt report template
	*/
	@Override
	public void setReportName(java.lang.String reportName) {
		_dmGtReportTemplate.setReportName(reportName);
	}

	/**
	* Returns the report type of this dm gt report template.
	*
	* @return the report type of this dm gt report template
	*/
	@Override
	public int getReportType() {
		return _dmGtReportTemplate.getReportType();
	}

	/**
	* Sets the report type of this dm gt report template.
	*
	* @param reportType the report type of this dm gt report template
	*/
	@Override
	public void setReportType(int reportType) {
		_dmGtReportTemplate.setReportType(reportType);
	}

	/**
	* Returns the category of this dm gt report template.
	*
	* @return the category of this dm gt report template
	*/
	@Override
	public java.lang.String getCategory() {
		return _dmGtReportTemplate.getCategory();
	}

	/**
	* Sets the category of this dm gt report template.
	*
	* @param category the category of this dm gt report template
	*/
	@Override
	public void setCategory(java.lang.String category) {
		_dmGtReportTemplate.setCategory(category);
	}

	/**
	* Returns the description of this dm gt report template.
	*
	* @return the description of this dm gt report template
	*/
	@Override
	public java.lang.String getDescription() {
		return _dmGtReportTemplate.getDescription();
	}

	/**
	* Sets the description of this dm gt report template.
	*
	* @param description the description of this dm gt report template
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_dmGtReportTemplate.setDescription(description);
	}

	/**
	* Returns the is delete of this dm gt report template.
	*
	* @return the is delete of this dm gt report template
	*/
	@Override
	public int getIsDelete() {
		return _dmGtReportTemplate.getIsDelete();
	}

	/**
	* Sets the is delete of this dm gt report template.
	*
	* @param isDelete the is delete of this dm gt report template
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmGtReportTemplate.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm gt report template.
	*
	* @return the marked as delete of this dm gt report template
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmGtReportTemplate.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm gt report template.
	*
	* @param markedAsDelete the marked as delete of this dm gt report template
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmGtReportTemplate.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm gt report template.
	*
	* @return the modified date of this dm gt report template
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmGtReportTemplate.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm gt report template.
	*
	* @param modifiedDate the modified date of this dm gt report template
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmGtReportTemplate.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm gt report template.
	*
	* @return the requested date of this dm gt report template
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmGtReportTemplate.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm gt report template.
	*
	* @param requestedDate the requested date of this dm gt report template
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmGtReportTemplate.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm gt report template.
	*
	* @return the sync version of this dm gt report template
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmGtReportTemplate.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm gt report template.
	*
	* @param syncVersion the sync version of this dm gt report template
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmGtReportTemplate.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmGtReportTemplate.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmGtReportTemplate.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmGtReportTemplate.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmGtReportTemplate.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmGtReportTemplate.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmGtReportTemplate.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmGtReportTemplate.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmGtReportTemplate.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmGtReportTemplate.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmGtReportTemplate.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmGtReportTemplate.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmGtReportTemplateWrapper((DmGtReportTemplate)_dmGtReportTemplate.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.DmGtReportTemplate dmGtReportTemplate) {
		return _dmGtReportTemplate.compareTo(dmGtReportTemplate);
	}

	@Override
	public int hashCode() {
		return _dmGtReportTemplate.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.DmGtReportTemplate> toCacheModel() {
		return _dmGtReportTemplate.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGtReportTemplate toEscapedModel() {
		return new DmGtReportTemplateWrapper(_dmGtReportTemplate.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGtReportTemplate toUnescapedModel() {
		return new DmGtReportTemplateWrapper(_dmGtReportTemplate.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmGtReportTemplate.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmGtReportTemplate.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmGtReportTemplate.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmGtReportTemplateWrapper)) {
			return false;
		}

		DmGtReportTemplateWrapper dmGtReportTemplateWrapper = (DmGtReportTemplateWrapper)obj;

		if (Validator.equals(_dmGtReportTemplate,
					dmGtReportTemplateWrapper._dmGtReportTemplate)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmGtReportTemplate getWrappedDmGtReportTemplate() {
		return _dmGtReportTemplate;
	}

	@Override
	public DmGtReportTemplate getWrappedModel() {
		return _dmGtReportTemplate;
	}

	@Override
	public void resetOriginalValues() {
		_dmGtReportTemplate.resetOriginalValues();
	}

	private DmGtReportTemplate _dmGtReportTemplate;
}