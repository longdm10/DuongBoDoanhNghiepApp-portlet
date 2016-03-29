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

package vn.dtt.duongbo.dao.motcua.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link OEPUserMgtJobpos2role}.
 * </p>
 *
 * @author win_64
 * @see OEPUserMgtJobpos2role
 * @generated
 */
public class OEPUserMgtJobpos2roleWrapper implements OEPUserMgtJobpos2role,
	ModelWrapper<OEPUserMgtJobpos2role> {
	public OEPUserMgtJobpos2roleWrapper(
		OEPUserMgtJobpos2role oepUserMgtJobpos2role) {
		_oepUserMgtJobpos2role = oepUserMgtJobpos2role;
	}

	@Override
	public Class<?> getModelClass() {
		return OEPUserMgtJobpos2role.class;
	}

	@Override
	public String getModelClassName() {
		return OEPUserMgtJobpos2role.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("jobPosId", getJobPosId());
		attributes.put("roleId", getRoleId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer jobPosId = (Integer)attributes.get("jobPosId");

		if (jobPosId != null) {
			setJobPosId(jobPosId);
		}

		Integer roleId = (Integer)attributes.get("roleId");

		if (roleId != null) {
			setRoleId(roleId);
		}
	}

	/**
	* Returns the primary key of this o e p user mgt jobpos2role.
	*
	* @return the primary key of this o e p user mgt jobpos2role
	*/
	@Override
	public vn.dtt.duongbo.dao.motcua.service.persistence.OEPUserMgtJobpos2rolePK getPrimaryKey() {
		return _oepUserMgtJobpos2role.getPrimaryKey();
	}

	/**
	* Sets the primary key of this o e p user mgt jobpos2role.
	*
	* @param primaryKey the primary key of this o e p user mgt jobpos2role
	*/
	@Override
	public void setPrimaryKey(
		vn.dtt.duongbo.dao.motcua.service.persistence.OEPUserMgtJobpos2rolePK primaryKey) {
		_oepUserMgtJobpos2role.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the job pos ID of this o e p user mgt jobpos2role.
	*
	* @return the job pos ID of this o e p user mgt jobpos2role
	*/
	@Override
	public int getJobPosId() {
		return _oepUserMgtJobpos2role.getJobPosId();
	}

	/**
	* Sets the job pos ID of this o e p user mgt jobpos2role.
	*
	* @param jobPosId the job pos ID of this o e p user mgt jobpos2role
	*/
	@Override
	public void setJobPosId(int jobPosId) {
		_oepUserMgtJobpos2role.setJobPosId(jobPosId);
	}

	/**
	* Returns the role ID of this o e p user mgt jobpos2role.
	*
	* @return the role ID of this o e p user mgt jobpos2role
	*/
	@Override
	public int getRoleId() {
		return _oepUserMgtJobpos2role.getRoleId();
	}

	/**
	* Sets the role ID of this o e p user mgt jobpos2role.
	*
	* @param roleId the role ID of this o e p user mgt jobpos2role
	*/
	@Override
	public void setRoleId(int roleId) {
		_oepUserMgtJobpos2role.setRoleId(roleId);
	}

	@Override
	public boolean isNew() {
		return _oepUserMgtJobpos2role.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_oepUserMgtJobpos2role.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _oepUserMgtJobpos2role.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_oepUserMgtJobpos2role.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _oepUserMgtJobpos2role.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _oepUserMgtJobpos2role.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_oepUserMgtJobpos2role.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _oepUserMgtJobpos2role.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_oepUserMgtJobpos2role.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_oepUserMgtJobpos2role.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_oepUserMgtJobpos2role.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new OEPUserMgtJobpos2roleWrapper((OEPUserMgtJobpos2role)_oepUserMgtJobpos2role.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos2role oepUserMgtJobpos2role) {
		return _oepUserMgtJobpos2role.compareTo(oepUserMgtJobpos2role);
	}

	@Override
	public int hashCode() {
		return _oepUserMgtJobpos2role.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos2role> toCacheModel() {
		return _oepUserMgtJobpos2role.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos2role toEscapedModel() {
		return new OEPUserMgtJobpos2roleWrapper(_oepUserMgtJobpos2role.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos2role toUnescapedModel() {
		return new OEPUserMgtJobpos2roleWrapper(_oepUserMgtJobpos2role.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _oepUserMgtJobpos2role.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _oepUserMgtJobpos2role.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_oepUserMgtJobpos2role.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OEPUserMgtJobpos2roleWrapper)) {
			return false;
		}

		OEPUserMgtJobpos2roleWrapper oepUserMgtJobpos2roleWrapper = (OEPUserMgtJobpos2roleWrapper)obj;

		if (Validator.equals(_oepUserMgtJobpos2role,
					oepUserMgtJobpos2roleWrapper._oepUserMgtJobpos2role)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public OEPUserMgtJobpos2role getWrappedOEPUserMgtJobpos2role() {
		return _oepUserMgtJobpos2role;
	}

	@Override
	public OEPUserMgtJobpos2role getWrappedModel() {
		return _oepUserMgtJobpos2role;
	}

	@Override
	public void resetOriginalValues() {
		_oepUserMgtJobpos2role.resetOriginalValues();
	}

	private OEPUserMgtJobpos2role _oepUserMgtJobpos2role;
}