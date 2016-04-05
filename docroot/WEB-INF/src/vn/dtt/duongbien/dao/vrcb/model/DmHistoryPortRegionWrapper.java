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
 * This class is a wrapper for {@link DmHistoryPortRegion}.
 * </p>
 *
 * @author longdm
 * @see DmHistoryPortRegion
 * @generated
 */
public class DmHistoryPortRegionWrapper implements DmHistoryPortRegion,
	ModelWrapper<DmHistoryPortRegion> {
	public DmHistoryPortRegionWrapper(DmHistoryPortRegion dmHistoryPortRegion) {
		_dmHistoryPortRegion = dmHistoryPortRegion;
	}

	@Override
	public Class<?> getModelClass() {
		return DmHistoryPortRegion.class;
	}

	@Override
	public String getModelClassName() {
		return DmHistoryPortRegion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("portRegionCode", getPortRegionCode());
		attributes.put("portRegionName", getPortRegionName());
		attributes.put("portRegionNameVN", getPortRegionNameVN());
		attributes.put("portRegionRef", getPortRegionRef());
		attributes.put("portCode", getPortCode());
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

		String portRegionCode = (String)attributes.get("portRegionCode");

		if (portRegionCode != null) {
			setPortRegionCode(portRegionCode);
		}

		String portRegionName = (String)attributes.get("portRegionName");

		if (portRegionName != null) {
			setPortRegionName(portRegionName);
		}

		String portRegionNameVN = (String)attributes.get("portRegionNameVN");

		if (portRegionNameVN != null) {
			setPortRegionNameVN(portRegionNameVN);
		}

		String portRegionRef = (String)attributes.get("portRegionRef");

		if (portRegionRef != null) {
			setPortRegionRef(portRegionRef);
		}

		String portCode = (String)attributes.get("portCode");

		if (portCode != null) {
			setPortCode(portCode);
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
	* Returns the primary key of this dm history port region.
	*
	* @return the primary key of this dm history port region
	*/
	@Override
	public int getPrimaryKey() {
		return _dmHistoryPortRegion.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm history port region.
	*
	* @param primaryKey the primary key of this dm history port region
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_dmHistoryPortRegion.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm history port region.
	*
	* @return the ID of this dm history port region
	*/
	@Override
	public int getId() {
		return _dmHistoryPortRegion.getId();
	}

	/**
	* Sets the ID of this dm history port region.
	*
	* @param id the ID of this dm history port region
	*/
	@Override
	public void setId(int id) {
		_dmHistoryPortRegion.setId(id);
	}

	/**
	* Returns the port region code of this dm history port region.
	*
	* @return the port region code of this dm history port region
	*/
	@Override
	public java.lang.String getPortRegionCode() {
		return _dmHistoryPortRegion.getPortRegionCode();
	}

	/**
	* Sets the port region code of this dm history port region.
	*
	* @param portRegionCode the port region code of this dm history port region
	*/
	@Override
	public void setPortRegionCode(java.lang.String portRegionCode) {
		_dmHistoryPortRegion.setPortRegionCode(portRegionCode);
	}

	/**
	* Returns the port region name of this dm history port region.
	*
	* @return the port region name of this dm history port region
	*/
	@Override
	public java.lang.String getPortRegionName() {
		return _dmHistoryPortRegion.getPortRegionName();
	}

	/**
	* Sets the port region name of this dm history port region.
	*
	* @param portRegionName the port region name of this dm history port region
	*/
	@Override
	public void setPortRegionName(java.lang.String portRegionName) {
		_dmHistoryPortRegion.setPortRegionName(portRegionName);
	}

	/**
	* Returns the port region name v n of this dm history port region.
	*
	* @return the port region name v n of this dm history port region
	*/
	@Override
	public java.lang.String getPortRegionNameVN() {
		return _dmHistoryPortRegion.getPortRegionNameVN();
	}

	/**
	* Sets the port region name v n of this dm history port region.
	*
	* @param portRegionNameVN the port region name v n of this dm history port region
	*/
	@Override
	public void setPortRegionNameVN(java.lang.String portRegionNameVN) {
		_dmHistoryPortRegion.setPortRegionNameVN(portRegionNameVN);
	}

	/**
	* Returns the port region ref of this dm history port region.
	*
	* @return the port region ref of this dm history port region
	*/
	@Override
	public java.lang.String getPortRegionRef() {
		return _dmHistoryPortRegion.getPortRegionRef();
	}

	/**
	* Sets the port region ref of this dm history port region.
	*
	* @param portRegionRef the port region ref of this dm history port region
	*/
	@Override
	public void setPortRegionRef(java.lang.String portRegionRef) {
		_dmHistoryPortRegion.setPortRegionRef(portRegionRef);
	}

	/**
	* Returns the port code of this dm history port region.
	*
	* @return the port code of this dm history port region
	*/
	@Override
	public java.lang.String getPortCode() {
		return _dmHistoryPortRegion.getPortCode();
	}

	/**
	* Sets the port code of this dm history port region.
	*
	* @param portCode the port code of this dm history port region
	*/
	@Override
	public void setPortCode(java.lang.String portCode) {
		_dmHistoryPortRegion.setPortCode(portCode);
	}

	/**
	* Returns the is delete of this dm history port region.
	*
	* @return the is delete of this dm history port region
	*/
	@Override
	public int getIsDelete() {
		return _dmHistoryPortRegion.getIsDelete();
	}

	/**
	* Sets the is delete of this dm history port region.
	*
	* @param isDelete the is delete of this dm history port region
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmHistoryPortRegion.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm history port region.
	*
	* @return the marked as delete of this dm history port region
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmHistoryPortRegion.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm history port region.
	*
	* @param markedAsDelete the marked as delete of this dm history port region
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmHistoryPortRegion.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm history port region.
	*
	* @return the modified date of this dm history port region
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmHistoryPortRegion.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm history port region.
	*
	* @param modifiedDate the modified date of this dm history port region
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmHistoryPortRegion.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm history port region.
	*
	* @return the requested date of this dm history port region
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmHistoryPortRegion.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm history port region.
	*
	* @param requestedDate the requested date of this dm history port region
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmHistoryPortRegion.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm history port region.
	*
	* @return the sync version of this dm history port region
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmHistoryPortRegion.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm history port region.
	*
	* @param syncVersion the sync version of this dm history port region
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmHistoryPortRegion.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmHistoryPortRegion.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmHistoryPortRegion.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmHistoryPortRegion.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmHistoryPortRegion.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmHistoryPortRegion.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmHistoryPortRegion.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmHistoryPortRegion.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmHistoryPortRegion.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmHistoryPortRegion.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmHistoryPortRegion.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmHistoryPortRegion.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmHistoryPortRegionWrapper((DmHistoryPortRegion)_dmHistoryPortRegion.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortRegion dmHistoryPortRegion) {
		return _dmHistoryPortRegion.compareTo(dmHistoryPortRegion);
	}

	@Override
	public int hashCode() {
		return _dmHistoryPortRegion.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortRegion> toCacheModel() {
		return _dmHistoryPortRegion.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortRegion toEscapedModel() {
		return new DmHistoryPortRegionWrapper(_dmHistoryPortRegion.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortRegion toUnescapedModel() {
		return new DmHistoryPortRegionWrapper(_dmHistoryPortRegion.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmHistoryPortRegion.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmHistoryPortRegion.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryPortRegion.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmHistoryPortRegionWrapper)) {
			return false;
		}

		DmHistoryPortRegionWrapper dmHistoryPortRegionWrapper = (DmHistoryPortRegionWrapper)obj;

		if (Validator.equals(_dmHistoryPortRegion,
					dmHistoryPortRegionWrapper._dmHistoryPortRegion)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmHistoryPortRegion getWrappedDmHistoryPortRegion() {
		return _dmHistoryPortRegion;
	}

	@Override
	public DmHistoryPortRegion getWrappedModel() {
		return _dmHistoryPortRegion;
	}

	@Override
	public void resetOriginalValues() {
		_dmHistoryPortRegion.resetOriginalValues();
	}

	private DmHistoryPortRegion _dmHistoryPortRegion;
}