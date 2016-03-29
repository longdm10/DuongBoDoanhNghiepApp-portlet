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
 * This class is a wrapper for {@link OEPUserMgtEmployee2jobpos}.
 * </p>
 *
 * @author win_64
 * @see OEPUserMgtEmployee2jobpos
 * @generated
 */
public class OEPUserMgtEmployee2jobposWrapper
	implements OEPUserMgtEmployee2jobpos,
		ModelWrapper<OEPUserMgtEmployee2jobpos> {
	public OEPUserMgtEmployee2jobposWrapper(
		OEPUserMgtEmployee2jobpos oepUserMgtEmployee2jobpos) {
		_oepUserMgtEmployee2jobpos = oepUserMgtEmployee2jobpos;
	}

	@Override
	public Class<?> getModelClass() {
		return OEPUserMgtEmployee2jobpos.class;
	}

	@Override
	public String getModelClassName() {
		return OEPUserMgtEmployee2jobpos.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeId", getEmployeeId());
		attributes.put("jobPosId", getJobPosId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer employeeId = (Integer)attributes.get("employeeId");

		if (employeeId != null) {
			setEmployeeId(employeeId);
		}

		Integer jobPosId = (Integer)attributes.get("jobPosId");

		if (jobPosId != null) {
			setJobPosId(jobPosId);
		}
	}

	/**
	* Returns the primary key of this o e p user mgt employee2jobpos.
	*
	* @return the primary key of this o e p user mgt employee2jobpos
	*/
	@Override
	public vn.dtt.duongbo.dao.motcua.service.persistence.OEPUserMgtEmployee2jobposPK getPrimaryKey() {
		return _oepUserMgtEmployee2jobpos.getPrimaryKey();
	}

	/**
	* Sets the primary key of this o e p user mgt employee2jobpos.
	*
	* @param primaryKey the primary key of this o e p user mgt employee2jobpos
	*/
	@Override
	public void setPrimaryKey(
		vn.dtt.duongbo.dao.motcua.service.persistence.OEPUserMgtEmployee2jobposPK primaryKey) {
		_oepUserMgtEmployee2jobpos.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the employee ID of this o e p user mgt employee2jobpos.
	*
	* @return the employee ID of this o e p user mgt employee2jobpos
	*/
	@Override
	public int getEmployeeId() {
		return _oepUserMgtEmployee2jobpos.getEmployeeId();
	}

	/**
	* Sets the employee ID of this o e p user mgt employee2jobpos.
	*
	* @param employeeId the employee ID of this o e p user mgt employee2jobpos
	*/
	@Override
	public void setEmployeeId(int employeeId) {
		_oepUserMgtEmployee2jobpos.setEmployeeId(employeeId);
	}

	/**
	* Returns the job pos ID of this o e p user mgt employee2jobpos.
	*
	* @return the job pos ID of this o e p user mgt employee2jobpos
	*/
	@Override
	public int getJobPosId() {
		return _oepUserMgtEmployee2jobpos.getJobPosId();
	}

	/**
	* Sets the job pos ID of this o e p user mgt employee2jobpos.
	*
	* @param jobPosId the job pos ID of this o e p user mgt employee2jobpos
	*/
	@Override
	public void setJobPosId(int jobPosId) {
		_oepUserMgtEmployee2jobpos.setJobPosId(jobPosId);
	}

	@Override
	public boolean isNew() {
		return _oepUserMgtEmployee2jobpos.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_oepUserMgtEmployee2jobpos.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _oepUserMgtEmployee2jobpos.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_oepUserMgtEmployee2jobpos.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _oepUserMgtEmployee2jobpos.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _oepUserMgtEmployee2jobpos.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_oepUserMgtEmployee2jobpos.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _oepUserMgtEmployee2jobpos.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_oepUserMgtEmployee2jobpos.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_oepUserMgtEmployee2jobpos.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_oepUserMgtEmployee2jobpos.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new OEPUserMgtEmployee2jobposWrapper((OEPUserMgtEmployee2jobpos)_oepUserMgtEmployee2jobpos.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee2jobpos oepUserMgtEmployee2jobpos) {
		return _oepUserMgtEmployee2jobpos.compareTo(oepUserMgtEmployee2jobpos);
	}

	@Override
	public int hashCode() {
		return _oepUserMgtEmployee2jobpos.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee2jobpos> toCacheModel() {
		return _oepUserMgtEmployee2jobpos.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee2jobpos toEscapedModel() {
		return new OEPUserMgtEmployee2jobposWrapper(_oepUserMgtEmployee2jobpos.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee2jobpos toUnescapedModel() {
		return new OEPUserMgtEmployee2jobposWrapper(_oepUserMgtEmployee2jobpos.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _oepUserMgtEmployee2jobpos.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _oepUserMgtEmployee2jobpos.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_oepUserMgtEmployee2jobpos.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OEPUserMgtEmployee2jobposWrapper)) {
			return false;
		}

		OEPUserMgtEmployee2jobposWrapper oepUserMgtEmployee2jobposWrapper = (OEPUserMgtEmployee2jobposWrapper)obj;

		if (Validator.equals(_oepUserMgtEmployee2jobpos,
					oepUserMgtEmployee2jobposWrapper._oepUserMgtEmployee2jobpos)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public OEPUserMgtEmployee2jobpos getWrappedOEPUserMgtEmployee2jobpos() {
		return _oepUserMgtEmployee2jobpos;
	}

	@Override
	public OEPUserMgtEmployee2jobpos getWrappedModel() {
		return _oepUserMgtEmployee2jobpos;
	}

	@Override
	public void resetOriginalValues() {
		_oepUserMgtEmployee2jobpos.resetOriginalValues();
	}

	private OEPUserMgtEmployee2jobpos _oepUserMgtEmployee2jobpos;
}