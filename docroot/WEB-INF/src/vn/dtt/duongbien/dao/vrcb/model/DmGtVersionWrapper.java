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
 * This class is a wrapper for {@link DmGtVersion}.
 * </p>
 *
 * @author longdm
 * @see DmGtVersion
 * @generated
 */
public class DmGtVersionWrapper implements DmGtVersion,
	ModelWrapper<DmGtVersion> {
	public DmGtVersionWrapper(DmGtVersion dmGtVersion) {
		_dmGtVersion = dmGtVersion;
	}

	@Override
	public Class<?> getModelClass() {
		return DmGtVersion.class;
	}

	@Override
	public String getModelClassName() {
		return DmGtVersion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("versionName", getVersionName());
		attributes.put("versionDate", getVersionDate());
		attributes.put("versionDeployer", getVersionDeployer());
		attributes.put("contents", getContents());
		attributes.put("description", getDescription());
		attributes.put("dbFileName", getDbFileName());
		attributes.put("dbFileSize", getDbFileSize());
		attributes.put("dbDescription", getDbDescription());
		attributes.put("appFileName", getAppFileName());
		attributes.put("appFileSize", getAppFileSize());
		attributes.put("appDescription", getAppDescription());
		attributes.put("specFileName", getSpecFileName());
		attributes.put("specFileSize", getSpecFileSize());
		attributes.put("specDescription", getSpecDescription());
		attributes.put("organizationCode", getOrganizationCode());
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

		String versionName = (String)attributes.get("versionName");

		if (versionName != null) {
			setVersionName(versionName);
		}

		Date versionDate = (Date)attributes.get("versionDate");

		if (versionDate != null) {
			setVersionDate(versionDate);
		}

		String versionDeployer = (String)attributes.get("versionDeployer");

		if (versionDeployer != null) {
			setVersionDeployer(versionDeployer);
		}

		String contents = (String)attributes.get("contents");

		if (contents != null) {
			setContents(contents);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String dbFileName = (String)attributes.get("dbFileName");

		if (dbFileName != null) {
			setDbFileName(dbFileName);
		}

		String dbFileSize = (String)attributes.get("dbFileSize");

		if (dbFileSize != null) {
			setDbFileSize(dbFileSize);
		}

		String dbDescription = (String)attributes.get("dbDescription");

		if (dbDescription != null) {
			setDbDescription(dbDescription);
		}

		String appFileName = (String)attributes.get("appFileName");

		if (appFileName != null) {
			setAppFileName(appFileName);
		}

		String appFileSize = (String)attributes.get("appFileSize");

		if (appFileSize != null) {
			setAppFileSize(appFileSize);
		}

		String appDescription = (String)attributes.get("appDescription");

		if (appDescription != null) {
			setAppDescription(appDescription);
		}

		String specFileName = (String)attributes.get("specFileName");

		if (specFileName != null) {
			setSpecFileName(specFileName);
		}

		String specFileSize = (String)attributes.get("specFileSize");

		if (specFileSize != null) {
			setSpecFileSize(specFileSize);
		}

		String specDescription = (String)attributes.get("specDescription");

		if (specDescription != null) {
			setSpecDescription(specDescription);
		}

		String organizationCode = (String)attributes.get("organizationCode");

		if (organizationCode != null) {
			setOrganizationCode(organizationCode);
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
	* Returns the primary key of this dm gt version.
	*
	* @return the primary key of this dm gt version
	*/
	@Override
	public int getPrimaryKey() {
		return _dmGtVersion.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm gt version.
	*
	* @param primaryKey the primary key of this dm gt version
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_dmGtVersion.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm gt version.
	*
	* @return the ID of this dm gt version
	*/
	@Override
	public int getId() {
		return _dmGtVersion.getId();
	}

	/**
	* Sets the ID of this dm gt version.
	*
	* @param id the ID of this dm gt version
	*/
	@Override
	public void setId(int id) {
		_dmGtVersion.setId(id);
	}

	/**
	* Returns the version name of this dm gt version.
	*
	* @return the version name of this dm gt version
	*/
	@Override
	public java.lang.String getVersionName() {
		return _dmGtVersion.getVersionName();
	}

	/**
	* Sets the version name of this dm gt version.
	*
	* @param versionName the version name of this dm gt version
	*/
	@Override
	public void setVersionName(java.lang.String versionName) {
		_dmGtVersion.setVersionName(versionName);
	}

	/**
	* Returns the version date of this dm gt version.
	*
	* @return the version date of this dm gt version
	*/
	@Override
	public java.util.Date getVersionDate() {
		return _dmGtVersion.getVersionDate();
	}

	/**
	* Sets the version date of this dm gt version.
	*
	* @param versionDate the version date of this dm gt version
	*/
	@Override
	public void setVersionDate(java.util.Date versionDate) {
		_dmGtVersion.setVersionDate(versionDate);
	}

	/**
	* Returns the version deployer of this dm gt version.
	*
	* @return the version deployer of this dm gt version
	*/
	@Override
	public java.lang.String getVersionDeployer() {
		return _dmGtVersion.getVersionDeployer();
	}

	/**
	* Sets the version deployer of this dm gt version.
	*
	* @param versionDeployer the version deployer of this dm gt version
	*/
	@Override
	public void setVersionDeployer(java.lang.String versionDeployer) {
		_dmGtVersion.setVersionDeployer(versionDeployer);
	}

	/**
	* Returns the contents of this dm gt version.
	*
	* @return the contents of this dm gt version
	*/
	@Override
	public java.lang.String getContents() {
		return _dmGtVersion.getContents();
	}

	/**
	* Sets the contents of this dm gt version.
	*
	* @param contents the contents of this dm gt version
	*/
	@Override
	public void setContents(java.lang.String contents) {
		_dmGtVersion.setContents(contents);
	}

	/**
	* Returns the description of this dm gt version.
	*
	* @return the description of this dm gt version
	*/
	@Override
	public java.lang.String getDescription() {
		return _dmGtVersion.getDescription();
	}

	/**
	* Sets the description of this dm gt version.
	*
	* @param description the description of this dm gt version
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_dmGtVersion.setDescription(description);
	}

	/**
	* Returns the db file name of this dm gt version.
	*
	* @return the db file name of this dm gt version
	*/
	@Override
	public java.lang.String getDbFileName() {
		return _dmGtVersion.getDbFileName();
	}

	/**
	* Sets the db file name of this dm gt version.
	*
	* @param dbFileName the db file name of this dm gt version
	*/
	@Override
	public void setDbFileName(java.lang.String dbFileName) {
		_dmGtVersion.setDbFileName(dbFileName);
	}

	/**
	* Returns the db file size of this dm gt version.
	*
	* @return the db file size of this dm gt version
	*/
	@Override
	public java.lang.String getDbFileSize() {
		return _dmGtVersion.getDbFileSize();
	}

	/**
	* Sets the db file size of this dm gt version.
	*
	* @param dbFileSize the db file size of this dm gt version
	*/
	@Override
	public void setDbFileSize(java.lang.String dbFileSize) {
		_dmGtVersion.setDbFileSize(dbFileSize);
	}

	/**
	* Returns the db description of this dm gt version.
	*
	* @return the db description of this dm gt version
	*/
	@Override
	public java.lang.String getDbDescription() {
		return _dmGtVersion.getDbDescription();
	}

	/**
	* Sets the db description of this dm gt version.
	*
	* @param dbDescription the db description of this dm gt version
	*/
	@Override
	public void setDbDescription(java.lang.String dbDescription) {
		_dmGtVersion.setDbDescription(dbDescription);
	}

	/**
	* Returns the app file name of this dm gt version.
	*
	* @return the app file name of this dm gt version
	*/
	@Override
	public java.lang.String getAppFileName() {
		return _dmGtVersion.getAppFileName();
	}

	/**
	* Sets the app file name of this dm gt version.
	*
	* @param appFileName the app file name of this dm gt version
	*/
	@Override
	public void setAppFileName(java.lang.String appFileName) {
		_dmGtVersion.setAppFileName(appFileName);
	}

	/**
	* Returns the app file size of this dm gt version.
	*
	* @return the app file size of this dm gt version
	*/
	@Override
	public java.lang.String getAppFileSize() {
		return _dmGtVersion.getAppFileSize();
	}

	/**
	* Sets the app file size of this dm gt version.
	*
	* @param appFileSize the app file size of this dm gt version
	*/
	@Override
	public void setAppFileSize(java.lang.String appFileSize) {
		_dmGtVersion.setAppFileSize(appFileSize);
	}

	/**
	* Returns the app description of this dm gt version.
	*
	* @return the app description of this dm gt version
	*/
	@Override
	public java.lang.String getAppDescription() {
		return _dmGtVersion.getAppDescription();
	}

	/**
	* Sets the app description of this dm gt version.
	*
	* @param appDescription the app description of this dm gt version
	*/
	@Override
	public void setAppDescription(java.lang.String appDescription) {
		_dmGtVersion.setAppDescription(appDescription);
	}

	/**
	* Returns the spec file name of this dm gt version.
	*
	* @return the spec file name of this dm gt version
	*/
	@Override
	public java.lang.String getSpecFileName() {
		return _dmGtVersion.getSpecFileName();
	}

	/**
	* Sets the spec file name of this dm gt version.
	*
	* @param specFileName the spec file name of this dm gt version
	*/
	@Override
	public void setSpecFileName(java.lang.String specFileName) {
		_dmGtVersion.setSpecFileName(specFileName);
	}

	/**
	* Returns the spec file size of this dm gt version.
	*
	* @return the spec file size of this dm gt version
	*/
	@Override
	public java.lang.String getSpecFileSize() {
		return _dmGtVersion.getSpecFileSize();
	}

	/**
	* Sets the spec file size of this dm gt version.
	*
	* @param specFileSize the spec file size of this dm gt version
	*/
	@Override
	public void setSpecFileSize(java.lang.String specFileSize) {
		_dmGtVersion.setSpecFileSize(specFileSize);
	}

	/**
	* Returns the spec description of this dm gt version.
	*
	* @return the spec description of this dm gt version
	*/
	@Override
	public java.lang.String getSpecDescription() {
		return _dmGtVersion.getSpecDescription();
	}

	/**
	* Sets the spec description of this dm gt version.
	*
	* @param specDescription the spec description of this dm gt version
	*/
	@Override
	public void setSpecDescription(java.lang.String specDescription) {
		_dmGtVersion.setSpecDescription(specDescription);
	}

	/**
	* Returns the organization code of this dm gt version.
	*
	* @return the organization code of this dm gt version
	*/
	@Override
	public java.lang.String getOrganizationCode() {
		return _dmGtVersion.getOrganizationCode();
	}

	/**
	* Sets the organization code of this dm gt version.
	*
	* @param organizationCode the organization code of this dm gt version
	*/
	@Override
	public void setOrganizationCode(java.lang.String organizationCode) {
		_dmGtVersion.setOrganizationCode(organizationCode);
	}

	/**
	* Returns the is delete of this dm gt version.
	*
	* @return the is delete of this dm gt version
	*/
	@Override
	public int getIsDelete() {
		return _dmGtVersion.getIsDelete();
	}

	/**
	* Sets the is delete of this dm gt version.
	*
	* @param isDelete the is delete of this dm gt version
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmGtVersion.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm gt version.
	*
	* @return the marked as delete of this dm gt version
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmGtVersion.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm gt version.
	*
	* @param markedAsDelete the marked as delete of this dm gt version
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmGtVersion.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm gt version.
	*
	* @return the modified date of this dm gt version
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmGtVersion.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm gt version.
	*
	* @param modifiedDate the modified date of this dm gt version
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmGtVersion.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm gt version.
	*
	* @return the requested date of this dm gt version
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmGtVersion.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm gt version.
	*
	* @param requestedDate the requested date of this dm gt version
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmGtVersion.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm gt version.
	*
	* @return the sync version of this dm gt version
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmGtVersion.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm gt version.
	*
	* @param syncVersion the sync version of this dm gt version
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmGtVersion.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmGtVersion.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmGtVersion.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmGtVersion.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmGtVersion.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmGtVersion.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmGtVersion.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmGtVersion.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmGtVersion.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmGtVersion.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmGtVersion.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmGtVersion.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmGtVersionWrapper((DmGtVersion)_dmGtVersion.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.DmGtVersion dmGtVersion) {
		return _dmGtVersion.compareTo(dmGtVersion);
	}

	@Override
	public int hashCode() {
		return _dmGtVersion.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.DmGtVersion> toCacheModel() {
		return _dmGtVersion.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGtVersion toEscapedModel() {
		return new DmGtVersionWrapper(_dmGtVersion.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGtVersion toUnescapedModel() {
		return new DmGtVersionWrapper(_dmGtVersion.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmGtVersion.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmGtVersion.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmGtVersion.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmGtVersionWrapper)) {
			return false;
		}

		DmGtVersionWrapper dmGtVersionWrapper = (DmGtVersionWrapper)obj;

		if (Validator.equals(_dmGtVersion, dmGtVersionWrapper._dmGtVersion)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmGtVersion getWrappedDmGtVersion() {
		return _dmGtVersion;
	}

	@Override
	public DmGtVersion getWrappedModel() {
		return _dmGtVersion;
	}

	@Override
	public void resetOriginalValues() {
		_dmGtVersion.resetOriginalValues();
	}

	private DmGtVersion _dmGtVersion;
}