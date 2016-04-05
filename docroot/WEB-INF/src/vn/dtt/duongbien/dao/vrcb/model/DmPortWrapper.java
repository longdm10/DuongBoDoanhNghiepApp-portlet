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
 * This class is a wrapper for {@link DmPort}.
 * </p>
 *
 * @author longdm
 * @see DmPort
 * @generated
 */
public class DmPortWrapper implements DmPort, ModelWrapper<DmPort> {
	public DmPortWrapper(DmPort dmPort) {
		_dmPort = dmPort;
	}

	@Override
	public Class<?> getModelClass() {
		return DmPort.class;
	}

	@Override
	public String getModelClassName() {
		return DmPort.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("portCode", getPortCode());
		attributes.put("loCode", getLoCode());
		attributes.put("portName", getPortName());
		attributes.put("fullName", getFullName());
		attributes.put("fullNameVN", getFullNameVN());
		attributes.put("portType", getPortType());
		attributes.put("portOrder", getPortOrder());
		attributes.put("address", getAddress());
		attributes.put("addressVN", getAddressVN());
		attributes.put("stateCode", getStateCode());
		attributes.put("citycode", getCitycode());
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

		String portCode = (String)attributes.get("portCode");

		if (portCode != null) {
			setPortCode(portCode);
		}

		String loCode = (String)attributes.get("loCode");

		if (loCode != null) {
			setLoCode(loCode);
		}

		String portName = (String)attributes.get("portName");

		if (portName != null) {
			setPortName(portName);
		}

		String fullName = (String)attributes.get("fullName");

		if (fullName != null) {
			setFullName(fullName);
		}

		String fullNameVN = (String)attributes.get("fullNameVN");

		if (fullNameVN != null) {
			setFullNameVN(fullNameVN);
		}

		String portType = (String)attributes.get("portType");

		if (portType != null) {
			setPortType(portType);
		}

		Integer portOrder = (Integer)attributes.get("portOrder");

		if (portOrder != null) {
			setPortOrder(portOrder);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String addressVN = (String)attributes.get("addressVN");

		if (addressVN != null) {
			setAddressVN(addressVN);
		}

		String stateCode = (String)attributes.get("stateCode");

		if (stateCode != null) {
			setStateCode(stateCode);
		}

		String citycode = (String)attributes.get("citycode");

		if (citycode != null) {
			setCitycode(citycode);
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
	* Returns the primary key of this dm port.
	*
	* @return the primary key of this dm port
	*/
	@Override
	public int getPrimaryKey() {
		return _dmPort.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm port.
	*
	* @param primaryKey the primary key of this dm port
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_dmPort.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm port.
	*
	* @return the ID of this dm port
	*/
	@Override
	public int getId() {
		return _dmPort.getId();
	}

	/**
	* Sets the ID of this dm port.
	*
	* @param id the ID of this dm port
	*/
	@Override
	public void setId(int id) {
		_dmPort.setId(id);
	}

	/**
	* Returns the port code of this dm port.
	*
	* @return the port code of this dm port
	*/
	@Override
	public java.lang.String getPortCode() {
		return _dmPort.getPortCode();
	}

	/**
	* Sets the port code of this dm port.
	*
	* @param portCode the port code of this dm port
	*/
	@Override
	public void setPortCode(java.lang.String portCode) {
		_dmPort.setPortCode(portCode);
	}

	/**
	* Returns the lo code of this dm port.
	*
	* @return the lo code of this dm port
	*/
	@Override
	public java.lang.String getLoCode() {
		return _dmPort.getLoCode();
	}

	/**
	* Sets the lo code of this dm port.
	*
	* @param loCode the lo code of this dm port
	*/
	@Override
	public void setLoCode(java.lang.String loCode) {
		_dmPort.setLoCode(loCode);
	}

	/**
	* Returns the port name of this dm port.
	*
	* @return the port name of this dm port
	*/
	@Override
	public java.lang.String getPortName() {
		return _dmPort.getPortName();
	}

	/**
	* Sets the port name of this dm port.
	*
	* @param portName the port name of this dm port
	*/
	@Override
	public void setPortName(java.lang.String portName) {
		_dmPort.setPortName(portName);
	}

	/**
	* Returns the full name of this dm port.
	*
	* @return the full name of this dm port
	*/
	@Override
	public java.lang.String getFullName() {
		return _dmPort.getFullName();
	}

	/**
	* Sets the full name of this dm port.
	*
	* @param fullName the full name of this dm port
	*/
	@Override
	public void setFullName(java.lang.String fullName) {
		_dmPort.setFullName(fullName);
	}

	/**
	* Returns the full name v n of this dm port.
	*
	* @return the full name v n of this dm port
	*/
	@Override
	public java.lang.String getFullNameVN() {
		return _dmPort.getFullNameVN();
	}

	/**
	* Sets the full name v n of this dm port.
	*
	* @param fullNameVN the full name v n of this dm port
	*/
	@Override
	public void setFullNameVN(java.lang.String fullNameVN) {
		_dmPort.setFullNameVN(fullNameVN);
	}

	/**
	* Returns the port type of this dm port.
	*
	* @return the port type of this dm port
	*/
	@Override
	public java.lang.String getPortType() {
		return _dmPort.getPortType();
	}

	/**
	* Sets the port type of this dm port.
	*
	* @param portType the port type of this dm port
	*/
	@Override
	public void setPortType(java.lang.String portType) {
		_dmPort.setPortType(portType);
	}

	/**
	* Returns the port order of this dm port.
	*
	* @return the port order of this dm port
	*/
	@Override
	public int getPortOrder() {
		return _dmPort.getPortOrder();
	}

	/**
	* Sets the port order of this dm port.
	*
	* @param portOrder the port order of this dm port
	*/
	@Override
	public void setPortOrder(int portOrder) {
		_dmPort.setPortOrder(portOrder);
	}

	/**
	* Returns the address of this dm port.
	*
	* @return the address of this dm port
	*/
	@Override
	public java.lang.String getAddress() {
		return _dmPort.getAddress();
	}

	/**
	* Sets the address of this dm port.
	*
	* @param address the address of this dm port
	*/
	@Override
	public void setAddress(java.lang.String address) {
		_dmPort.setAddress(address);
	}

	/**
	* Returns the address v n of this dm port.
	*
	* @return the address v n of this dm port
	*/
	@Override
	public java.lang.String getAddressVN() {
		return _dmPort.getAddressVN();
	}

	/**
	* Sets the address v n of this dm port.
	*
	* @param addressVN the address v n of this dm port
	*/
	@Override
	public void setAddressVN(java.lang.String addressVN) {
		_dmPort.setAddressVN(addressVN);
	}

	/**
	* Returns the state code of this dm port.
	*
	* @return the state code of this dm port
	*/
	@Override
	public java.lang.String getStateCode() {
		return _dmPort.getStateCode();
	}

	/**
	* Sets the state code of this dm port.
	*
	* @param stateCode the state code of this dm port
	*/
	@Override
	public void setStateCode(java.lang.String stateCode) {
		_dmPort.setStateCode(stateCode);
	}

	/**
	* Returns the citycode of this dm port.
	*
	* @return the citycode of this dm port
	*/
	@Override
	public java.lang.String getCitycode() {
		return _dmPort.getCitycode();
	}

	/**
	* Sets the citycode of this dm port.
	*
	* @param citycode the citycode of this dm port
	*/
	@Override
	public void setCitycode(java.lang.String citycode) {
		_dmPort.setCitycode(citycode);
	}

	/**
	* Returns the is delete of this dm port.
	*
	* @return the is delete of this dm port
	*/
	@Override
	public int getIsDelete() {
		return _dmPort.getIsDelete();
	}

	/**
	* Sets the is delete of this dm port.
	*
	* @param isDelete the is delete of this dm port
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmPort.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm port.
	*
	* @return the marked as delete of this dm port
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmPort.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm port.
	*
	* @param markedAsDelete the marked as delete of this dm port
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmPort.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm port.
	*
	* @return the modified date of this dm port
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmPort.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm port.
	*
	* @param modifiedDate the modified date of this dm port
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmPort.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm port.
	*
	* @return the requested date of this dm port
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmPort.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm port.
	*
	* @param requestedDate the requested date of this dm port
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmPort.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm port.
	*
	* @return the sync version of this dm port
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmPort.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm port.
	*
	* @param syncVersion the sync version of this dm port
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmPort.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmPort.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmPort.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmPort.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmPort.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmPort.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmPort.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmPort.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmPort.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmPort.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmPort.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmPort.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmPortWrapper((DmPort)_dmPort.clone());
	}

	@Override
	public int compareTo(vn.dtt.duongbien.dao.vrcb.model.DmPort dmPort) {
		return _dmPort.compareTo(dmPort);
	}

	@Override
	public int hashCode() {
		return _dmPort.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.DmPort> toCacheModel() {
		return _dmPort.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmPort toEscapedModel() {
		return new DmPortWrapper(_dmPort.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmPort toUnescapedModel() {
		return new DmPortWrapper(_dmPort.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmPort.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmPort.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmPort.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmPortWrapper)) {
			return false;
		}

		DmPortWrapper dmPortWrapper = (DmPortWrapper)obj;

		if (Validator.equals(_dmPort, dmPortWrapper._dmPort)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmPort getWrappedDmPort() {
		return _dmPort;
	}

	@Override
	public DmPort getWrappedModel() {
		return _dmPort;
	}

	@Override
	public void resetOriginalValues() {
		_dmPort.resetOriginalValues();
	}

	private DmPort _dmPort;
}