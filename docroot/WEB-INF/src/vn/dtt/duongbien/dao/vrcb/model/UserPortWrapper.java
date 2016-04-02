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
 * This class is a wrapper for {@link UserPort}.
 * </p>
 *
 * @author longdm
 * @see UserPort
 * @generated
 */
public class UserPortWrapper implements UserPort, ModelWrapper<UserPort> {
	public UserPortWrapper(UserPort userPort) {
		_userPort = userPort;
	}

	@Override
	public Class<?> getModelClass() {
		return UserPort.class;
	}

	@Override
	public String getModelClassName() {
		return UserPort.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("portCode", getPortCode());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String portCode = (String)attributes.get("portCode");

		if (portCode != null) {
			setPortCode(portCode);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	/**
	* Returns the primary key of this user port.
	*
	* @return the primary key of this user port
	*/
	@Override
	public long getPrimaryKey() {
		return _userPort.getPrimaryKey();
	}

	/**
	* Sets the primary key of this user port.
	*
	* @param primaryKey the primary key of this user port
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_userPort.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this user port.
	*
	* @return the ID of this user port
	*/
	@Override
	public long getId() {
		return _userPort.getId();
	}

	/**
	* Sets the ID of this user port.
	*
	* @param id the ID of this user port
	*/
	@Override
	public void setId(long id) {
		_userPort.setId(id);
	}

	/**
	* Returns the port code of this user port.
	*
	* @return the port code of this user port
	*/
	@Override
	public java.lang.String getPortCode() {
		return _userPort.getPortCode();
	}

	/**
	* Sets the port code of this user port.
	*
	* @param portCode the port code of this user port
	*/
	@Override
	public void setPortCode(java.lang.String portCode) {
		_userPort.setPortCode(portCode);
	}

	/**
	* Returns the user ID of this user port.
	*
	* @return the user ID of this user port
	*/
	@Override
	public long getUserId() {
		return _userPort.getUserId();
	}

	/**
	* Sets the user ID of this user port.
	*
	* @param userId the user ID of this user port
	*/
	@Override
	public void setUserId(long userId) {
		_userPort.setUserId(userId);
	}

	/**
	* Returns the user uuid of this user port.
	*
	* @return the user uuid of this user port
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userPort.getUserUuid();
	}

	/**
	* Sets the user uuid of this user port.
	*
	* @param userUuid the user uuid of this user port
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_userPort.setUserUuid(userUuid);
	}

	/**
	* Returns the create date of this user port.
	*
	* @return the create date of this user port
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _userPort.getCreateDate();
	}

	/**
	* Sets the create date of this user port.
	*
	* @param createDate the create date of this user port
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_userPort.setCreateDate(createDate);
	}

	/**
	* Returns the status of this user port.
	*
	* @return the status of this user port
	*/
	@Override
	public int getStatus() {
		return _userPort.getStatus();
	}

	/**
	* Sets the status of this user port.
	*
	* @param status the status of this user port
	*/
	@Override
	public void setStatus(int status) {
		_userPort.setStatus(status);
	}

	@Override
	public boolean isNew() {
		return _userPort.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_userPort.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _userPort.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_userPort.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _userPort.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _userPort.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_userPort.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _userPort.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_userPort.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_userPort.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_userPort.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new UserPortWrapper((UserPort)_userPort.clone());
	}

	@Override
	public int compareTo(UserPort userPort) {
		return _userPort.compareTo(userPort);
	}

	@Override
	public int hashCode() {
		return _userPort.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<UserPort> toCacheModel() {
		return _userPort.toCacheModel();
	}

	@Override
	public UserPort toEscapedModel() {
		return new UserPortWrapper(_userPort.toEscapedModel());
	}

	@Override
	public UserPort toUnescapedModel() {
		return new UserPortWrapper(_userPort.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _userPort.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _userPort.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_userPort.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UserPortWrapper)) {
			return false;
		}

		UserPortWrapper userPortWrapper = (UserPortWrapper)obj;

		if (Validator.equals(_userPort, userPortWrapper._userPort)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public UserPort getWrappedUserPort() {
		return _userPort;
	}

	@Override
	public UserPort getWrappedModel() {
		return _userPort;
	}

	@Override
	public void resetOriginalValues() {
		_userPort.resetOriginalValues();
	}

	private UserPort _userPort;
}