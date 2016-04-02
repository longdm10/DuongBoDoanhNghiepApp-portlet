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
 * This class is a wrapper for {@link DmPackage}.
 * </p>
 *
 * @author longdm
 * @see DmPackage
 * @generated
 */
public class DmPackageWrapper implements DmPackage, ModelWrapper<DmPackage> {
	public DmPackageWrapper(DmPackage dmPackage) {
		_dmPackage = dmPackage;
	}

	@Override
	public Class<?> getModelClass() {
		return DmPackage.class;
	}

	@Override
	public String getModelClassName() {
		return DmPackage.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("packageCode", getPackageCode());
		attributes.put("packageName", getPackageName());
		attributes.put("packageNameVN", getPackageNameVN());
		attributes.put("packageOrder", getPackageOrder());
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

		String packageCode = (String)attributes.get("packageCode");

		if (packageCode != null) {
			setPackageCode(packageCode);
		}

		String packageName = (String)attributes.get("packageName");

		if (packageName != null) {
			setPackageName(packageName);
		}

		String packageNameVN = (String)attributes.get("packageNameVN");

		if (packageNameVN != null) {
			setPackageNameVN(packageNameVN);
		}

		Integer packageOrder = (Integer)attributes.get("packageOrder");

		if (packageOrder != null) {
			setPackageOrder(packageOrder);
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
	* Returns the primary key of this dm package.
	*
	* @return the primary key of this dm package
	*/
	@Override
	public int getPrimaryKey() {
		return _dmPackage.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm package.
	*
	* @param primaryKey the primary key of this dm package
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_dmPackage.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm package.
	*
	* @return the ID of this dm package
	*/
	@Override
	public int getId() {
		return _dmPackage.getId();
	}

	/**
	* Sets the ID of this dm package.
	*
	* @param id the ID of this dm package
	*/
	@Override
	public void setId(int id) {
		_dmPackage.setId(id);
	}

	/**
	* Returns the package code of this dm package.
	*
	* @return the package code of this dm package
	*/
	@Override
	public java.lang.String getPackageCode() {
		return _dmPackage.getPackageCode();
	}

	/**
	* Sets the package code of this dm package.
	*
	* @param packageCode the package code of this dm package
	*/
	@Override
	public void setPackageCode(java.lang.String packageCode) {
		_dmPackage.setPackageCode(packageCode);
	}

	/**
	* Returns the package name of this dm package.
	*
	* @return the package name of this dm package
	*/
	@Override
	public java.lang.String getPackageName() {
		return _dmPackage.getPackageName();
	}

	/**
	* Sets the package name of this dm package.
	*
	* @param packageName the package name of this dm package
	*/
	@Override
	public void setPackageName(java.lang.String packageName) {
		_dmPackage.setPackageName(packageName);
	}

	/**
	* Returns the package name v n of this dm package.
	*
	* @return the package name v n of this dm package
	*/
	@Override
	public java.lang.String getPackageNameVN() {
		return _dmPackage.getPackageNameVN();
	}

	/**
	* Sets the package name v n of this dm package.
	*
	* @param packageNameVN the package name v n of this dm package
	*/
	@Override
	public void setPackageNameVN(java.lang.String packageNameVN) {
		_dmPackage.setPackageNameVN(packageNameVN);
	}

	/**
	* Returns the package order of this dm package.
	*
	* @return the package order of this dm package
	*/
	@Override
	public int getPackageOrder() {
		return _dmPackage.getPackageOrder();
	}

	/**
	* Sets the package order of this dm package.
	*
	* @param packageOrder the package order of this dm package
	*/
	@Override
	public void setPackageOrder(int packageOrder) {
		_dmPackage.setPackageOrder(packageOrder);
	}

	/**
	* Returns the is delete of this dm package.
	*
	* @return the is delete of this dm package
	*/
	@Override
	public int getIsDelete() {
		return _dmPackage.getIsDelete();
	}

	/**
	* Sets the is delete of this dm package.
	*
	* @param isDelete the is delete of this dm package
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmPackage.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm package.
	*
	* @return the marked as delete of this dm package
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmPackage.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm package.
	*
	* @param markedAsDelete the marked as delete of this dm package
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmPackage.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm package.
	*
	* @return the modified date of this dm package
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmPackage.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm package.
	*
	* @param modifiedDate the modified date of this dm package
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmPackage.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm package.
	*
	* @return the requested date of this dm package
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmPackage.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm package.
	*
	* @param requestedDate the requested date of this dm package
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmPackage.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm package.
	*
	* @return the sync version of this dm package
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmPackage.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm package.
	*
	* @param syncVersion the sync version of this dm package
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmPackage.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmPackage.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmPackage.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmPackage.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmPackage.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmPackage.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmPackage.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmPackage.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmPackage.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmPackage.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmPackage.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmPackage.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmPackageWrapper((DmPackage)_dmPackage.clone());
	}

	@Override
	public int compareTo(DmPackage dmPackage) {
		return _dmPackage.compareTo(dmPackage);
	}

	@Override
	public int hashCode() {
		return _dmPackage.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<DmPackage> toCacheModel() {
		return _dmPackage.toCacheModel();
	}

	@Override
	public DmPackage toEscapedModel() {
		return new DmPackageWrapper(_dmPackage.toEscapedModel());
	}

	@Override
	public DmPackage toUnescapedModel() {
		return new DmPackageWrapper(_dmPackage.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmPackage.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmPackage.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmPackage.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmPackageWrapper)) {
			return false;
		}

		DmPackageWrapper dmPackageWrapper = (DmPackageWrapper)obj;

		if (Validator.equals(_dmPackage, dmPackageWrapper._dmPackage)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmPackage getWrappedDmPackage() {
		return _dmPackage;
	}

	@Override
	public DmPackage getWrappedModel() {
		return _dmPackage;
	}

	@Override
	public void resetOriginalValues() {
		_dmPackage.resetOriginalValues();
	}

	private DmPackage _dmPackage;
}