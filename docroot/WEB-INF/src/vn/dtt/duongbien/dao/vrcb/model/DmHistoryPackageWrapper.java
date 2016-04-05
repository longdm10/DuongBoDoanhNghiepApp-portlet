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
 * This class is a wrapper for {@link DmHistoryPackage}.
 * </p>
 *
 * @author longdm
 * @see DmHistoryPackage
 * @generated
 */
public class DmHistoryPackageWrapper implements DmHistoryPackage,
	ModelWrapper<DmHistoryPackage> {
	public DmHistoryPackageWrapper(DmHistoryPackage dmHistoryPackage) {
		_dmHistoryPackage = dmHistoryPackage;
	}

	@Override
	public Class<?> getModelClass() {
		return DmHistoryPackage.class;
	}

	@Override
	public String getModelClassName() {
		return DmHistoryPackage.class.getName();
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
	* Returns the primary key of this dm history package.
	*
	* @return the primary key of this dm history package
	*/
	@Override
	public int getPrimaryKey() {
		return _dmHistoryPackage.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm history package.
	*
	* @param primaryKey the primary key of this dm history package
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_dmHistoryPackage.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm history package.
	*
	* @return the ID of this dm history package
	*/
	@Override
	public int getId() {
		return _dmHistoryPackage.getId();
	}

	/**
	* Sets the ID of this dm history package.
	*
	* @param id the ID of this dm history package
	*/
	@Override
	public void setId(int id) {
		_dmHistoryPackage.setId(id);
	}

	/**
	* Returns the package code of this dm history package.
	*
	* @return the package code of this dm history package
	*/
	@Override
	public java.lang.String getPackageCode() {
		return _dmHistoryPackage.getPackageCode();
	}

	/**
	* Sets the package code of this dm history package.
	*
	* @param packageCode the package code of this dm history package
	*/
	@Override
	public void setPackageCode(java.lang.String packageCode) {
		_dmHistoryPackage.setPackageCode(packageCode);
	}

	/**
	* Returns the package name of this dm history package.
	*
	* @return the package name of this dm history package
	*/
	@Override
	public java.lang.String getPackageName() {
		return _dmHistoryPackage.getPackageName();
	}

	/**
	* Sets the package name of this dm history package.
	*
	* @param packageName the package name of this dm history package
	*/
	@Override
	public void setPackageName(java.lang.String packageName) {
		_dmHistoryPackage.setPackageName(packageName);
	}

	/**
	* Returns the package name v n of this dm history package.
	*
	* @return the package name v n of this dm history package
	*/
	@Override
	public java.lang.String getPackageNameVN() {
		return _dmHistoryPackage.getPackageNameVN();
	}

	/**
	* Sets the package name v n of this dm history package.
	*
	* @param packageNameVN the package name v n of this dm history package
	*/
	@Override
	public void setPackageNameVN(java.lang.String packageNameVN) {
		_dmHistoryPackage.setPackageNameVN(packageNameVN);
	}

	/**
	* Returns the package order of this dm history package.
	*
	* @return the package order of this dm history package
	*/
	@Override
	public int getPackageOrder() {
		return _dmHistoryPackage.getPackageOrder();
	}

	/**
	* Sets the package order of this dm history package.
	*
	* @param packageOrder the package order of this dm history package
	*/
	@Override
	public void setPackageOrder(int packageOrder) {
		_dmHistoryPackage.setPackageOrder(packageOrder);
	}

	/**
	* Returns the is delete of this dm history package.
	*
	* @return the is delete of this dm history package
	*/
	@Override
	public int getIsDelete() {
		return _dmHistoryPackage.getIsDelete();
	}

	/**
	* Sets the is delete of this dm history package.
	*
	* @param isDelete the is delete of this dm history package
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmHistoryPackage.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm history package.
	*
	* @return the marked as delete of this dm history package
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmHistoryPackage.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm history package.
	*
	* @param markedAsDelete the marked as delete of this dm history package
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmHistoryPackage.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm history package.
	*
	* @return the modified date of this dm history package
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmHistoryPackage.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm history package.
	*
	* @param modifiedDate the modified date of this dm history package
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmHistoryPackage.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm history package.
	*
	* @return the requested date of this dm history package
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmHistoryPackage.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm history package.
	*
	* @param requestedDate the requested date of this dm history package
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmHistoryPackage.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm history package.
	*
	* @return the sync version of this dm history package
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmHistoryPackage.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm history package.
	*
	* @param syncVersion the sync version of this dm history package
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmHistoryPackage.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmHistoryPackage.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmHistoryPackage.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmHistoryPackage.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmHistoryPackage.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmHistoryPackage.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmHistoryPackage.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmHistoryPackage.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmHistoryPackage.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmHistoryPackage.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmHistoryPackage.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmHistoryPackage.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmHistoryPackageWrapper((DmHistoryPackage)_dmHistoryPackage.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryPackage dmHistoryPackage) {
		return _dmHistoryPackage.compareTo(dmHistoryPackage);
	}

	@Override
	public int hashCode() {
		return _dmHistoryPackage.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPackage> toCacheModel() {
		return _dmHistoryPackage.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryPackage toEscapedModel() {
		return new DmHistoryPackageWrapper(_dmHistoryPackage.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryPackage toUnescapedModel() {
		return new DmHistoryPackageWrapper(_dmHistoryPackage.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmHistoryPackage.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmHistoryPackage.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryPackage.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmHistoryPackageWrapper)) {
			return false;
		}

		DmHistoryPackageWrapper dmHistoryPackageWrapper = (DmHistoryPackageWrapper)obj;

		if (Validator.equals(_dmHistoryPackage,
					dmHistoryPackageWrapper._dmHistoryPackage)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmHistoryPackage getWrappedDmHistoryPackage() {
		return _dmHistoryPackage;
	}

	@Override
	public DmHistoryPackage getWrappedModel() {
		return _dmHistoryPackage;
	}

	@Override
	public void resetOriginalValues() {
		_dmHistoryPackage.resetOriginalValues();
	}

	private DmHistoryPackage _dmHistoryPackage;
}