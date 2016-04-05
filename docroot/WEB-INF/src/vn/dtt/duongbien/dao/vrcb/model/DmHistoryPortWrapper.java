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
 * This class is a wrapper for {@link DmHistoryPort}.
 * </p>
 *
 * @author longdm
 * @see DmHistoryPort
 * @generated
 */
public class DmHistoryPortWrapper implements DmHistoryPort,
	ModelWrapper<DmHistoryPort> {
	public DmHistoryPortWrapper(DmHistoryPort dmHistoryPort) {
		_dmHistoryPort = dmHistoryPort;
	}

	@Override
	public Class<?> getModelClass() {
		return DmHistoryPort.class;
	}

	@Override
	public String getModelClassName() {
		return DmHistoryPort.class.getName();
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
	* Returns the primary key of this dm history port.
	*
	* @return the primary key of this dm history port
	*/
	@Override
	public int getPrimaryKey() {
		return _dmHistoryPort.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm history port.
	*
	* @param primaryKey the primary key of this dm history port
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_dmHistoryPort.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm history port.
	*
	* @return the ID of this dm history port
	*/
	@Override
	public int getId() {
		return _dmHistoryPort.getId();
	}

	/**
	* Sets the ID of this dm history port.
	*
	* @param id the ID of this dm history port
	*/
	@Override
	public void setId(int id) {
		_dmHistoryPort.setId(id);
	}

	/**
	* Returns the port code of this dm history port.
	*
	* @return the port code of this dm history port
	*/
	@Override
	public java.lang.String getPortCode() {
		return _dmHistoryPort.getPortCode();
	}

	/**
	* Sets the port code of this dm history port.
	*
	* @param portCode the port code of this dm history port
	*/
	@Override
	public void setPortCode(java.lang.String portCode) {
		_dmHistoryPort.setPortCode(portCode);
	}

	/**
	* Returns the lo code of this dm history port.
	*
	* @return the lo code of this dm history port
	*/
	@Override
	public java.lang.String getLoCode() {
		return _dmHistoryPort.getLoCode();
	}

	/**
	* Sets the lo code of this dm history port.
	*
	* @param loCode the lo code of this dm history port
	*/
	@Override
	public void setLoCode(java.lang.String loCode) {
		_dmHistoryPort.setLoCode(loCode);
	}

	/**
	* Returns the port name of this dm history port.
	*
	* @return the port name of this dm history port
	*/
	@Override
	public java.lang.String getPortName() {
		return _dmHistoryPort.getPortName();
	}

	/**
	* Sets the port name of this dm history port.
	*
	* @param portName the port name of this dm history port
	*/
	@Override
	public void setPortName(java.lang.String portName) {
		_dmHistoryPort.setPortName(portName);
	}

	/**
	* Returns the full name of this dm history port.
	*
	* @return the full name of this dm history port
	*/
	@Override
	public java.lang.String getFullName() {
		return _dmHistoryPort.getFullName();
	}

	/**
	* Sets the full name of this dm history port.
	*
	* @param fullName the full name of this dm history port
	*/
	@Override
	public void setFullName(java.lang.String fullName) {
		_dmHistoryPort.setFullName(fullName);
	}

	/**
	* Returns the full name v n of this dm history port.
	*
	* @return the full name v n of this dm history port
	*/
	@Override
	public java.lang.String getFullNameVN() {
		return _dmHistoryPort.getFullNameVN();
	}

	/**
	* Sets the full name v n of this dm history port.
	*
	* @param fullNameVN the full name v n of this dm history port
	*/
	@Override
	public void setFullNameVN(java.lang.String fullNameVN) {
		_dmHistoryPort.setFullNameVN(fullNameVN);
	}

	/**
	* Returns the port type of this dm history port.
	*
	* @return the port type of this dm history port
	*/
	@Override
	public java.lang.String getPortType() {
		return _dmHistoryPort.getPortType();
	}

	/**
	* Sets the port type of this dm history port.
	*
	* @param portType the port type of this dm history port
	*/
	@Override
	public void setPortType(java.lang.String portType) {
		_dmHistoryPort.setPortType(portType);
	}

	/**
	* Returns the port order of this dm history port.
	*
	* @return the port order of this dm history port
	*/
	@Override
	public int getPortOrder() {
		return _dmHistoryPort.getPortOrder();
	}

	/**
	* Sets the port order of this dm history port.
	*
	* @param portOrder the port order of this dm history port
	*/
	@Override
	public void setPortOrder(int portOrder) {
		_dmHistoryPort.setPortOrder(portOrder);
	}

	/**
	* Returns the address of this dm history port.
	*
	* @return the address of this dm history port
	*/
	@Override
	public java.lang.String getAddress() {
		return _dmHistoryPort.getAddress();
	}

	/**
	* Sets the address of this dm history port.
	*
	* @param address the address of this dm history port
	*/
	@Override
	public void setAddress(java.lang.String address) {
		_dmHistoryPort.setAddress(address);
	}

	/**
	* Returns the address v n of this dm history port.
	*
	* @return the address v n of this dm history port
	*/
	@Override
	public java.lang.String getAddressVN() {
		return _dmHistoryPort.getAddressVN();
	}

	/**
	* Sets the address v n of this dm history port.
	*
	* @param addressVN the address v n of this dm history port
	*/
	@Override
	public void setAddressVN(java.lang.String addressVN) {
		_dmHistoryPort.setAddressVN(addressVN);
	}

	/**
	* Returns the state code of this dm history port.
	*
	* @return the state code of this dm history port
	*/
	@Override
	public java.lang.String getStateCode() {
		return _dmHistoryPort.getStateCode();
	}

	/**
	* Sets the state code of this dm history port.
	*
	* @param stateCode the state code of this dm history port
	*/
	@Override
	public void setStateCode(java.lang.String stateCode) {
		_dmHistoryPort.setStateCode(stateCode);
	}

	/**
	* Returns the citycode of this dm history port.
	*
	* @return the citycode of this dm history port
	*/
	@Override
	public java.lang.String getCitycode() {
		return _dmHistoryPort.getCitycode();
	}

	/**
	* Sets the citycode of this dm history port.
	*
	* @param citycode the citycode of this dm history port
	*/
	@Override
	public void setCitycode(java.lang.String citycode) {
		_dmHistoryPort.setCitycode(citycode);
	}

	/**
	* Returns the is delete of this dm history port.
	*
	* @return the is delete of this dm history port
	*/
	@Override
	public int getIsDelete() {
		return _dmHistoryPort.getIsDelete();
	}

	/**
	* Sets the is delete of this dm history port.
	*
	* @param isDelete the is delete of this dm history port
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmHistoryPort.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm history port.
	*
	* @return the marked as delete of this dm history port
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmHistoryPort.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm history port.
	*
	* @param markedAsDelete the marked as delete of this dm history port
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmHistoryPort.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm history port.
	*
	* @return the modified date of this dm history port
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmHistoryPort.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm history port.
	*
	* @param modifiedDate the modified date of this dm history port
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmHistoryPort.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm history port.
	*
	* @return the requested date of this dm history port
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmHistoryPort.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm history port.
	*
	* @param requestedDate the requested date of this dm history port
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmHistoryPort.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm history port.
	*
	* @return the sync version of this dm history port
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmHistoryPort.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm history port.
	*
	* @param syncVersion the sync version of this dm history port
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmHistoryPort.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmHistoryPort.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmHistoryPort.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmHistoryPort.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmHistoryPort.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmHistoryPort.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmHistoryPort.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmHistoryPort.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmHistoryPort.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmHistoryPort.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmHistoryPort.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmHistoryPort.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmHistoryPortWrapper((DmHistoryPort)_dmHistoryPort.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryPort dmHistoryPort) {
		return _dmHistoryPort.compareTo(dmHistoryPort);
	}

	@Override
	public int hashCode() {
		return _dmHistoryPort.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPort> toCacheModel() {
		return _dmHistoryPort.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryPort toEscapedModel() {
		return new DmHistoryPortWrapper(_dmHistoryPort.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryPort toUnescapedModel() {
		return new DmHistoryPortWrapper(_dmHistoryPort.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmHistoryPort.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmHistoryPort.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryPort.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmHistoryPortWrapper)) {
			return false;
		}

		DmHistoryPortWrapper dmHistoryPortWrapper = (DmHistoryPortWrapper)obj;

		if (Validator.equals(_dmHistoryPort, dmHistoryPortWrapper._dmHistoryPort)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmHistoryPort getWrappedDmHistoryPort() {
		return _dmHistoryPort;
	}

	@Override
	public DmHistoryPort getWrappedModel() {
		return _dmHistoryPort;
	}

	@Override
	public void resetOriginalValues() {
		_dmHistoryPort.resetOriginalValues();
	}

	private DmHistoryPort _dmHistoryPort;
}