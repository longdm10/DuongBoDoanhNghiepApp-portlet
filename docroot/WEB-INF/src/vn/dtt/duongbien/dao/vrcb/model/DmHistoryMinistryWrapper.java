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
 * This class is a wrapper for {@link DmHistoryMinistry}.
 * </p>
 *
 * @author longdm
 * @see DmHistoryMinistry
 * @generated
 */
public class DmHistoryMinistryWrapper implements DmHistoryMinistry,
	ModelWrapper<DmHistoryMinistry> {
	public DmHistoryMinistryWrapper(DmHistoryMinistry dmHistoryMinistry) {
		_dmHistoryMinistry = dmHistoryMinistry;
	}

	@Override
	public Class<?> getModelClass() {
		return DmHistoryMinistry.class;
	}

	@Override
	public String getModelClassName() {
		return DmHistoryMinistry.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("ministryCode", getMinistryCode());
		attributes.put("ministryName", getMinistryName());
		attributes.put("ministryNameVN", getMinistryNameVN());
		attributes.put("ministryOrder", getMinistryOrder());
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

		String ministryCode = (String)attributes.get("ministryCode");

		if (ministryCode != null) {
			setMinistryCode(ministryCode);
		}

		String ministryName = (String)attributes.get("ministryName");

		if (ministryName != null) {
			setMinistryName(ministryName);
		}

		String ministryNameVN = (String)attributes.get("ministryNameVN");

		if (ministryNameVN != null) {
			setMinistryNameVN(ministryNameVN);
		}

		Integer ministryOrder = (Integer)attributes.get("ministryOrder");

		if (ministryOrder != null) {
			setMinistryOrder(ministryOrder);
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
	* Returns the primary key of this dm history ministry.
	*
	* @return the primary key of this dm history ministry
	*/
	@Override
	public long getPrimaryKey() {
		return _dmHistoryMinistry.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm history ministry.
	*
	* @param primaryKey the primary key of this dm history ministry
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dmHistoryMinistry.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm history ministry.
	*
	* @return the ID of this dm history ministry
	*/
	@Override
	public long getId() {
		return _dmHistoryMinistry.getId();
	}

	/**
	* Sets the ID of this dm history ministry.
	*
	* @param id the ID of this dm history ministry
	*/
	@Override
	public void setId(long id) {
		_dmHistoryMinistry.setId(id);
	}

	/**
	* Returns the ministry code of this dm history ministry.
	*
	* @return the ministry code of this dm history ministry
	*/
	@Override
	public java.lang.String getMinistryCode() {
		return _dmHistoryMinistry.getMinistryCode();
	}

	/**
	* Sets the ministry code of this dm history ministry.
	*
	* @param ministryCode the ministry code of this dm history ministry
	*/
	@Override
	public void setMinistryCode(java.lang.String ministryCode) {
		_dmHistoryMinistry.setMinistryCode(ministryCode);
	}

	/**
	* Returns the ministry name of this dm history ministry.
	*
	* @return the ministry name of this dm history ministry
	*/
	@Override
	public java.lang.String getMinistryName() {
		return _dmHistoryMinistry.getMinistryName();
	}

	/**
	* Sets the ministry name of this dm history ministry.
	*
	* @param ministryName the ministry name of this dm history ministry
	*/
	@Override
	public void setMinistryName(java.lang.String ministryName) {
		_dmHistoryMinistry.setMinistryName(ministryName);
	}

	/**
	* Returns the ministry name v n of this dm history ministry.
	*
	* @return the ministry name v n of this dm history ministry
	*/
	@Override
	public java.lang.String getMinistryNameVN() {
		return _dmHistoryMinistry.getMinistryNameVN();
	}

	/**
	* Sets the ministry name v n of this dm history ministry.
	*
	* @param ministryNameVN the ministry name v n of this dm history ministry
	*/
	@Override
	public void setMinistryNameVN(java.lang.String ministryNameVN) {
		_dmHistoryMinistry.setMinistryNameVN(ministryNameVN);
	}

	/**
	* Returns the ministry order of this dm history ministry.
	*
	* @return the ministry order of this dm history ministry
	*/
	@Override
	public int getMinistryOrder() {
		return _dmHistoryMinistry.getMinistryOrder();
	}

	/**
	* Sets the ministry order of this dm history ministry.
	*
	* @param ministryOrder the ministry order of this dm history ministry
	*/
	@Override
	public void setMinistryOrder(int ministryOrder) {
		_dmHistoryMinistry.setMinistryOrder(ministryOrder);
	}

	/**
	* Returns the is delete of this dm history ministry.
	*
	* @return the is delete of this dm history ministry
	*/
	@Override
	public int getIsDelete() {
		return _dmHistoryMinistry.getIsDelete();
	}

	/**
	* Sets the is delete of this dm history ministry.
	*
	* @param isDelete the is delete of this dm history ministry
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmHistoryMinistry.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm history ministry.
	*
	* @return the marked as delete of this dm history ministry
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmHistoryMinistry.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm history ministry.
	*
	* @param markedAsDelete the marked as delete of this dm history ministry
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmHistoryMinistry.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm history ministry.
	*
	* @return the modified date of this dm history ministry
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmHistoryMinistry.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm history ministry.
	*
	* @param modifiedDate the modified date of this dm history ministry
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmHistoryMinistry.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm history ministry.
	*
	* @return the requested date of this dm history ministry
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmHistoryMinistry.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm history ministry.
	*
	* @param requestedDate the requested date of this dm history ministry
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmHistoryMinistry.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm history ministry.
	*
	* @return the sync version of this dm history ministry
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmHistoryMinistry.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm history ministry.
	*
	* @param syncVersion the sync version of this dm history ministry
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmHistoryMinistry.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmHistoryMinistry.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmHistoryMinistry.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmHistoryMinistry.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmHistoryMinistry.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmHistoryMinistry.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmHistoryMinistry.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmHistoryMinistry.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmHistoryMinistry.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmHistoryMinistry.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmHistoryMinistry.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmHistoryMinistry.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmHistoryMinistryWrapper((DmHistoryMinistry)_dmHistoryMinistry.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryMinistry dmHistoryMinistry) {
		return _dmHistoryMinistry.compareTo(dmHistoryMinistry);
	}

	@Override
	public int hashCode() {
		return _dmHistoryMinistry.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.DmHistoryMinistry> toCacheModel() {
		return _dmHistoryMinistry.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryMinistry toEscapedModel() {
		return new DmHistoryMinistryWrapper(_dmHistoryMinistry.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryMinistry toUnescapedModel() {
		return new DmHistoryMinistryWrapper(_dmHistoryMinistry.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmHistoryMinistry.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmHistoryMinistry.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryMinistry.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmHistoryMinistryWrapper)) {
			return false;
		}

		DmHistoryMinistryWrapper dmHistoryMinistryWrapper = (DmHistoryMinistryWrapper)obj;

		if (Validator.equals(_dmHistoryMinistry,
					dmHistoryMinistryWrapper._dmHistoryMinistry)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmHistoryMinistry getWrappedDmHistoryMinistry() {
		return _dmHistoryMinistry;
	}

	@Override
	public DmHistoryMinistry getWrappedModel() {
		return _dmHistoryMinistry;
	}

	@Override
	public void resetOriginalValues() {
		_dmHistoryMinistry.resetOriginalValues();
	}

	private DmHistoryMinistry _dmHistoryMinistry;
}