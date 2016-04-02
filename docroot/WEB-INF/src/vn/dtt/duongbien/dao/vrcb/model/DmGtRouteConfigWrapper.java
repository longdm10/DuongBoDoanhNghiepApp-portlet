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
 * This class is a wrapper for {@link DmGtRouteConfig}.
 * </p>
 *
 * @author longdm
 * @see DmGtRouteConfig
 * @generated
 */
public class DmGtRouteConfigWrapper implements DmGtRouteConfig,
	ModelWrapper<DmGtRouteConfig> {
	public DmGtRouteConfigWrapper(DmGtRouteConfig dmGtRouteConfig) {
		_dmGtRouteConfig = dmGtRouteConfig;
	}

	@Override
	public Class<?> getModelClass() {
		return DmGtRouteConfig.class;
	}

	@Override
	public String getModelClassName() {
		return DmGtRouteConfig.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("routeCode", getRouteCode());
		attributes.put("organizationCode", getOrganizationCode());
		attributes.put("locCode", getLocCode());
		attributes.put("ipName", getIpName());
		attributes.put("portName", getPortName());
		attributes.put("linkAddress", getLinkAddress());
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

		String routeCode = (String)attributes.get("routeCode");

		if (routeCode != null) {
			setRouteCode(routeCode);
		}

		String organizationCode = (String)attributes.get("organizationCode");

		if (organizationCode != null) {
			setOrganizationCode(organizationCode);
		}

		String locCode = (String)attributes.get("locCode");

		if (locCode != null) {
			setLocCode(locCode);
		}

		String ipName = (String)attributes.get("ipName");

		if (ipName != null) {
			setIpName(ipName);
		}

		String portName = (String)attributes.get("portName");

		if (portName != null) {
			setPortName(portName);
		}

		String linkAddress = (String)attributes.get("linkAddress");

		if (linkAddress != null) {
			setLinkAddress(linkAddress);
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
	* Returns the primary key of this dm gt route config.
	*
	* @return the primary key of this dm gt route config
	*/
	@Override
	public long getPrimaryKey() {
		return _dmGtRouteConfig.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm gt route config.
	*
	* @param primaryKey the primary key of this dm gt route config
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dmGtRouteConfig.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm gt route config.
	*
	* @return the ID of this dm gt route config
	*/
	@Override
	public long getId() {
		return _dmGtRouteConfig.getId();
	}

	/**
	* Sets the ID of this dm gt route config.
	*
	* @param id the ID of this dm gt route config
	*/
	@Override
	public void setId(long id) {
		_dmGtRouteConfig.setId(id);
	}

	/**
	* Returns the route code of this dm gt route config.
	*
	* @return the route code of this dm gt route config
	*/
	@Override
	public java.lang.String getRouteCode() {
		return _dmGtRouteConfig.getRouteCode();
	}

	/**
	* Sets the route code of this dm gt route config.
	*
	* @param routeCode the route code of this dm gt route config
	*/
	@Override
	public void setRouteCode(java.lang.String routeCode) {
		_dmGtRouteConfig.setRouteCode(routeCode);
	}

	/**
	* Returns the organization code of this dm gt route config.
	*
	* @return the organization code of this dm gt route config
	*/
	@Override
	public java.lang.String getOrganizationCode() {
		return _dmGtRouteConfig.getOrganizationCode();
	}

	/**
	* Sets the organization code of this dm gt route config.
	*
	* @param organizationCode the organization code of this dm gt route config
	*/
	@Override
	public void setOrganizationCode(java.lang.String organizationCode) {
		_dmGtRouteConfig.setOrganizationCode(organizationCode);
	}

	/**
	* Returns the loc code of this dm gt route config.
	*
	* @return the loc code of this dm gt route config
	*/
	@Override
	public java.lang.String getLocCode() {
		return _dmGtRouteConfig.getLocCode();
	}

	/**
	* Sets the loc code of this dm gt route config.
	*
	* @param locCode the loc code of this dm gt route config
	*/
	@Override
	public void setLocCode(java.lang.String locCode) {
		_dmGtRouteConfig.setLocCode(locCode);
	}

	/**
	* Returns the ip name of this dm gt route config.
	*
	* @return the ip name of this dm gt route config
	*/
	@Override
	public java.lang.String getIpName() {
		return _dmGtRouteConfig.getIpName();
	}

	/**
	* Sets the ip name of this dm gt route config.
	*
	* @param ipName the ip name of this dm gt route config
	*/
	@Override
	public void setIpName(java.lang.String ipName) {
		_dmGtRouteConfig.setIpName(ipName);
	}

	/**
	* Returns the port name of this dm gt route config.
	*
	* @return the port name of this dm gt route config
	*/
	@Override
	public java.lang.String getPortName() {
		return _dmGtRouteConfig.getPortName();
	}

	/**
	* Sets the port name of this dm gt route config.
	*
	* @param portName the port name of this dm gt route config
	*/
	@Override
	public void setPortName(java.lang.String portName) {
		_dmGtRouteConfig.setPortName(portName);
	}

	/**
	* Returns the link address of this dm gt route config.
	*
	* @return the link address of this dm gt route config
	*/
	@Override
	public java.lang.String getLinkAddress() {
		return _dmGtRouteConfig.getLinkAddress();
	}

	/**
	* Sets the link address of this dm gt route config.
	*
	* @param linkAddress the link address of this dm gt route config
	*/
	@Override
	public void setLinkAddress(java.lang.String linkAddress) {
		_dmGtRouteConfig.setLinkAddress(linkAddress);
	}

	/**
	* Returns the is delete of this dm gt route config.
	*
	* @return the is delete of this dm gt route config
	*/
	@Override
	public int getIsDelete() {
		return _dmGtRouteConfig.getIsDelete();
	}

	/**
	* Sets the is delete of this dm gt route config.
	*
	* @param isDelete the is delete of this dm gt route config
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmGtRouteConfig.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm gt route config.
	*
	* @return the marked as delete of this dm gt route config
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmGtRouteConfig.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm gt route config.
	*
	* @param markedAsDelete the marked as delete of this dm gt route config
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmGtRouteConfig.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm gt route config.
	*
	* @return the modified date of this dm gt route config
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmGtRouteConfig.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm gt route config.
	*
	* @param modifiedDate the modified date of this dm gt route config
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmGtRouteConfig.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm gt route config.
	*
	* @return the requested date of this dm gt route config
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmGtRouteConfig.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm gt route config.
	*
	* @param requestedDate the requested date of this dm gt route config
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmGtRouteConfig.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm gt route config.
	*
	* @return the sync version of this dm gt route config
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmGtRouteConfig.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm gt route config.
	*
	* @param syncVersion the sync version of this dm gt route config
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmGtRouteConfig.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmGtRouteConfig.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmGtRouteConfig.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmGtRouteConfig.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmGtRouteConfig.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmGtRouteConfig.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmGtRouteConfig.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmGtRouteConfig.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmGtRouteConfig.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmGtRouteConfig.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmGtRouteConfig.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmGtRouteConfig.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmGtRouteConfigWrapper((DmGtRouteConfig)_dmGtRouteConfig.clone());
	}

	@Override
	public int compareTo(DmGtRouteConfig dmGtRouteConfig) {
		return _dmGtRouteConfig.compareTo(dmGtRouteConfig);
	}

	@Override
	public int hashCode() {
		return _dmGtRouteConfig.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<DmGtRouteConfig> toCacheModel() {
		return _dmGtRouteConfig.toCacheModel();
	}

	@Override
	public DmGtRouteConfig toEscapedModel() {
		return new DmGtRouteConfigWrapper(_dmGtRouteConfig.toEscapedModel());
	}

	@Override
	public DmGtRouteConfig toUnescapedModel() {
		return new DmGtRouteConfigWrapper(_dmGtRouteConfig.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmGtRouteConfig.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmGtRouteConfig.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmGtRouteConfig.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmGtRouteConfigWrapper)) {
			return false;
		}

		DmGtRouteConfigWrapper dmGtRouteConfigWrapper = (DmGtRouteConfigWrapper)obj;

		if (Validator.equals(_dmGtRouteConfig,
					dmGtRouteConfigWrapper._dmGtRouteConfig)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmGtRouteConfig getWrappedDmGtRouteConfig() {
		return _dmGtRouteConfig;
	}

	@Override
	public DmGtRouteConfig getWrappedModel() {
		return _dmGtRouteConfig;
	}

	@Override
	public void resetOriginalValues() {
		_dmGtRouteConfig.resetOriginalValues();
	}

	private DmGtRouteConfig _dmGtRouteConfig;
}