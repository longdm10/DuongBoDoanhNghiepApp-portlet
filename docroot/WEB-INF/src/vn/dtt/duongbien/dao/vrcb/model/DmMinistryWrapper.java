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
 * This class is a wrapper for {@link DmMinistry}.
 * </p>
 *
 * @author longdm
 * @see DmMinistry
 * @generated
 */
public class DmMinistryWrapper implements DmMinistry, ModelWrapper<DmMinistry> {
	public DmMinistryWrapper(DmMinistry dmMinistry) {
		_dmMinistry = dmMinistry;
	}

	@Override
	public Class<?> getModelClass() {
		return DmMinistry.class;
	}

	@Override
	public String getModelClassName() {
		return DmMinistry.class.getName();
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
	* Returns the primary key of this dm ministry.
	*
	* @return the primary key of this dm ministry
	*/
	@Override
	public long getPrimaryKey() {
		return _dmMinistry.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm ministry.
	*
	* @param primaryKey the primary key of this dm ministry
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dmMinistry.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm ministry.
	*
	* @return the ID of this dm ministry
	*/
	@Override
	public long getId() {
		return _dmMinistry.getId();
	}

	/**
	* Sets the ID of this dm ministry.
	*
	* @param id the ID of this dm ministry
	*/
	@Override
	public void setId(long id) {
		_dmMinistry.setId(id);
	}

	/**
	* Returns the ministry code of this dm ministry.
	*
	* @return the ministry code of this dm ministry
	*/
	@Override
	public java.lang.String getMinistryCode() {
		return _dmMinistry.getMinistryCode();
	}

	/**
	* Sets the ministry code of this dm ministry.
	*
	* @param ministryCode the ministry code of this dm ministry
	*/
	@Override
	public void setMinistryCode(java.lang.String ministryCode) {
		_dmMinistry.setMinistryCode(ministryCode);
	}

	/**
	* Returns the ministry name of this dm ministry.
	*
	* @return the ministry name of this dm ministry
	*/
	@Override
	public java.lang.String getMinistryName() {
		return _dmMinistry.getMinistryName();
	}

	/**
	* Sets the ministry name of this dm ministry.
	*
	* @param ministryName the ministry name of this dm ministry
	*/
	@Override
	public void setMinistryName(java.lang.String ministryName) {
		_dmMinistry.setMinistryName(ministryName);
	}

	/**
	* Returns the ministry name v n of this dm ministry.
	*
	* @return the ministry name v n of this dm ministry
	*/
	@Override
	public java.lang.String getMinistryNameVN() {
		return _dmMinistry.getMinistryNameVN();
	}

	/**
	* Sets the ministry name v n of this dm ministry.
	*
	* @param ministryNameVN the ministry name v n of this dm ministry
	*/
	@Override
	public void setMinistryNameVN(java.lang.String ministryNameVN) {
		_dmMinistry.setMinistryNameVN(ministryNameVN);
	}

	/**
	* Returns the ministry order of this dm ministry.
	*
	* @return the ministry order of this dm ministry
	*/
	@Override
	public int getMinistryOrder() {
		return _dmMinistry.getMinistryOrder();
	}

	/**
	* Sets the ministry order of this dm ministry.
	*
	* @param ministryOrder the ministry order of this dm ministry
	*/
	@Override
	public void setMinistryOrder(int ministryOrder) {
		_dmMinistry.setMinistryOrder(ministryOrder);
	}

	/**
	* Returns the is delete of this dm ministry.
	*
	* @return the is delete of this dm ministry
	*/
	@Override
	public int getIsDelete() {
		return _dmMinistry.getIsDelete();
	}

	/**
	* Sets the is delete of this dm ministry.
	*
	* @param isDelete the is delete of this dm ministry
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmMinistry.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm ministry.
	*
	* @return the marked as delete of this dm ministry
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmMinistry.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm ministry.
	*
	* @param markedAsDelete the marked as delete of this dm ministry
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmMinistry.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm ministry.
	*
	* @return the modified date of this dm ministry
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmMinistry.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm ministry.
	*
	* @param modifiedDate the modified date of this dm ministry
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmMinistry.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm ministry.
	*
	* @return the requested date of this dm ministry
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmMinistry.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm ministry.
	*
	* @param requestedDate the requested date of this dm ministry
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmMinistry.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm ministry.
	*
	* @return the sync version of this dm ministry
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmMinistry.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm ministry.
	*
	* @param syncVersion the sync version of this dm ministry
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmMinistry.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmMinistry.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmMinistry.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmMinistry.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmMinistry.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmMinistry.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmMinistry.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmMinistry.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmMinistry.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmMinistry.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmMinistry.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmMinistry.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmMinistryWrapper((DmMinistry)_dmMinistry.clone());
	}

	@Override
	public int compareTo(vn.dtt.duongbien.dao.vrcb.model.DmMinistry dmMinistry) {
		return _dmMinistry.compareTo(dmMinistry);
	}

	@Override
	public int hashCode() {
		return _dmMinistry.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.DmMinistry> toCacheModel() {
		return _dmMinistry.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmMinistry toEscapedModel() {
		return new DmMinistryWrapper(_dmMinistry.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmMinistry toUnescapedModel() {
		return new DmMinistryWrapper(_dmMinistry.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmMinistry.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmMinistry.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmMinistry.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmMinistryWrapper)) {
			return false;
		}

		DmMinistryWrapper dmMinistryWrapper = (DmMinistryWrapper)obj;

		if (Validator.equals(_dmMinistry, dmMinistryWrapper._dmMinistry)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmMinistry getWrappedDmMinistry() {
		return _dmMinistry;
	}

	@Override
	public DmMinistry getWrappedModel() {
		return _dmMinistry;
	}

	@Override
	public void resetOriginalValues() {
		_dmMinistry.resetOriginalValues();
	}

	private DmMinistry _dmMinistry;
}