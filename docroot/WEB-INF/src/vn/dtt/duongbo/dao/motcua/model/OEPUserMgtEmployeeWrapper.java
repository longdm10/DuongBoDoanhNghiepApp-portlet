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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link OEPUserMgtEmployee}.
 * </p>
 *
 * @author win_64
 * @see OEPUserMgtEmployee
 * @generated
 */
public class OEPUserMgtEmployeeWrapper implements OEPUserMgtEmployee,
	ModelWrapper<OEPUserMgtEmployee> {
	public OEPUserMgtEmployeeWrapper(OEPUserMgtEmployee oepUserMgtEmployee) {
		_oepUserMgtEmployee = oepUserMgtEmployee;
	}

	@Override
	public Class<?> getModelClass() {
		return OEPUserMgtEmployee.class;
	}

	@Override
	public String getModelClassName() {
		return OEPUserMgtEmployee.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeId", getEmployeeId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("mappingUserId", getMappingUserId());
		attributes.put("workingUnitId", getWorkingUnitId());
		attributes.put("mainJobPosId", getMainJobPosId());
		attributes.put("employeeNo", getEmployeeNo());
		attributes.put("fullName", getFullName());
		attributes.put("officeTel", getOfficeTel());
		attributes.put("homeTel", getHomeTel());
		attributes.put("mobile", getMobile());
		attributes.put("email", getEmail());
		attributes.put("typeOfEmployee", getTypeOfEmployee());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long employeeId = (Long)attributes.get("employeeId");

		if (employeeId != null) {
			setEmployeeId(employeeId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long mappingUserId = (Long)attributes.get("mappingUserId");

		if (mappingUserId != null) {
			setMappingUserId(mappingUserId);
		}

		Long workingUnitId = (Long)attributes.get("workingUnitId");

		if (workingUnitId != null) {
			setWorkingUnitId(workingUnitId);
		}

		Long mainJobPosId = (Long)attributes.get("mainJobPosId");

		if (mainJobPosId != null) {
			setMainJobPosId(mainJobPosId);
		}

		String employeeNo = (String)attributes.get("employeeNo");

		if (employeeNo != null) {
			setEmployeeNo(employeeNo);
		}

		String fullName = (String)attributes.get("fullName");

		if (fullName != null) {
			setFullName(fullName);
		}

		String officeTel = (String)attributes.get("officeTel");

		if (officeTel != null) {
			setOfficeTel(officeTel);
		}

		String homeTel = (String)attributes.get("homeTel");

		if (homeTel != null) {
			setHomeTel(homeTel);
		}

		String mobile = (String)attributes.get("mobile");

		if (mobile != null) {
			setMobile(mobile);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String typeOfEmployee = (String)attributes.get("typeOfEmployee");

		if (typeOfEmployee != null) {
			setTypeOfEmployee(typeOfEmployee);
		}
	}

	/**
	* Returns the primary key of this o e p user mgt employee.
	*
	* @return the primary key of this o e p user mgt employee
	*/
	@Override
	public long getPrimaryKey() {
		return _oepUserMgtEmployee.getPrimaryKey();
	}

	/**
	* Sets the primary key of this o e p user mgt employee.
	*
	* @param primaryKey the primary key of this o e p user mgt employee
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_oepUserMgtEmployee.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the employee ID of this o e p user mgt employee.
	*
	* @return the employee ID of this o e p user mgt employee
	*/
	@Override
	public long getEmployeeId() {
		return _oepUserMgtEmployee.getEmployeeId();
	}

	/**
	* Sets the employee ID of this o e p user mgt employee.
	*
	* @param employeeId the employee ID of this o e p user mgt employee
	*/
	@Override
	public void setEmployeeId(long employeeId) {
		_oepUserMgtEmployee.setEmployeeId(employeeId);
	}

	/**
	* Returns the user ID of this o e p user mgt employee.
	*
	* @return the user ID of this o e p user mgt employee
	*/
	@Override
	public long getUserId() {
		return _oepUserMgtEmployee.getUserId();
	}

	/**
	* Sets the user ID of this o e p user mgt employee.
	*
	* @param userId the user ID of this o e p user mgt employee
	*/
	@Override
	public void setUserId(long userId) {
		_oepUserMgtEmployee.setUserId(userId);
	}

	/**
	* Returns the user uuid of this o e p user mgt employee.
	*
	* @return the user uuid of this o e p user mgt employee
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtEmployee.getUserUuid();
	}

	/**
	* Sets the user uuid of this o e p user mgt employee.
	*
	* @param userUuid the user uuid of this o e p user mgt employee
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_oepUserMgtEmployee.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this o e p user mgt employee.
	*
	* @return the group ID of this o e p user mgt employee
	*/
	@Override
	public long getGroupId() {
		return _oepUserMgtEmployee.getGroupId();
	}

	/**
	* Sets the group ID of this o e p user mgt employee.
	*
	* @param groupId the group ID of this o e p user mgt employee
	*/
	@Override
	public void setGroupId(long groupId) {
		_oepUserMgtEmployee.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this o e p user mgt employee.
	*
	* @return the company ID of this o e p user mgt employee
	*/
	@Override
	public long getCompanyId() {
		return _oepUserMgtEmployee.getCompanyId();
	}

	/**
	* Sets the company ID of this o e p user mgt employee.
	*
	* @param companyId the company ID of this o e p user mgt employee
	*/
	@Override
	public void setCompanyId(long companyId) {
		_oepUserMgtEmployee.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this o e p user mgt employee.
	*
	* @return the create date of this o e p user mgt employee
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _oepUserMgtEmployee.getCreateDate();
	}

	/**
	* Sets the create date of this o e p user mgt employee.
	*
	* @param createDate the create date of this o e p user mgt employee
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_oepUserMgtEmployee.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this o e p user mgt employee.
	*
	* @return the modified date of this o e p user mgt employee
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _oepUserMgtEmployee.getModifiedDate();
	}

	/**
	* Sets the modified date of this o e p user mgt employee.
	*
	* @param modifiedDate the modified date of this o e p user mgt employee
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_oepUserMgtEmployee.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the mapping user ID of this o e p user mgt employee.
	*
	* @return the mapping user ID of this o e p user mgt employee
	*/
	@Override
	public long getMappingUserId() {
		return _oepUserMgtEmployee.getMappingUserId();
	}

	/**
	* Sets the mapping user ID of this o e p user mgt employee.
	*
	* @param mappingUserId the mapping user ID of this o e p user mgt employee
	*/
	@Override
	public void setMappingUserId(long mappingUserId) {
		_oepUserMgtEmployee.setMappingUserId(mappingUserId);
	}

	/**
	* Returns the mapping user uuid of this o e p user mgt employee.
	*
	* @return the mapping user uuid of this o e p user mgt employee
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getMappingUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtEmployee.getMappingUserUuid();
	}

	/**
	* Sets the mapping user uuid of this o e p user mgt employee.
	*
	* @param mappingUserUuid the mapping user uuid of this o e p user mgt employee
	*/
	@Override
	public void setMappingUserUuid(java.lang.String mappingUserUuid) {
		_oepUserMgtEmployee.setMappingUserUuid(mappingUserUuid);
	}

	/**
	* Returns the working unit ID of this o e p user mgt employee.
	*
	* @return the working unit ID of this o e p user mgt employee
	*/
	@Override
	public long getWorkingUnitId() {
		return _oepUserMgtEmployee.getWorkingUnitId();
	}

	/**
	* Sets the working unit ID of this o e p user mgt employee.
	*
	* @param workingUnitId the working unit ID of this o e p user mgt employee
	*/
	@Override
	public void setWorkingUnitId(long workingUnitId) {
		_oepUserMgtEmployee.setWorkingUnitId(workingUnitId);
	}

	/**
	* Returns the main job pos ID of this o e p user mgt employee.
	*
	* @return the main job pos ID of this o e p user mgt employee
	*/
	@Override
	public long getMainJobPosId() {
		return _oepUserMgtEmployee.getMainJobPosId();
	}

	/**
	* Sets the main job pos ID of this o e p user mgt employee.
	*
	* @param mainJobPosId the main job pos ID of this o e p user mgt employee
	*/
	@Override
	public void setMainJobPosId(long mainJobPosId) {
		_oepUserMgtEmployee.setMainJobPosId(mainJobPosId);
	}

	/**
	* Returns the employee no of this o e p user mgt employee.
	*
	* @return the employee no of this o e p user mgt employee
	*/
	@Override
	public java.lang.String getEmployeeNo() {
		return _oepUserMgtEmployee.getEmployeeNo();
	}

	/**
	* Sets the employee no of this o e p user mgt employee.
	*
	* @param employeeNo the employee no of this o e p user mgt employee
	*/
	@Override
	public void setEmployeeNo(java.lang.String employeeNo) {
		_oepUserMgtEmployee.setEmployeeNo(employeeNo);
	}

	/**
	* Returns the full name of this o e p user mgt employee.
	*
	* @return the full name of this o e p user mgt employee
	*/
	@Override
	public java.lang.String getFullName() {
		return _oepUserMgtEmployee.getFullName();
	}

	/**
	* Sets the full name of this o e p user mgt employee.
	*
	* @param fullName the full name of this o e p user mgt employee
	*/
	@Override
	public void setFullName(java.lang.String fullName) {
		_oepUserMgtEmployee.setFullName(fullName);
	}

	/**
	* Returns the office tel of this o e p user mgt employee.
	*
	* @return the office tel of this o e p user mgt employee
	*/
	@Override
	public java.lang.String getOfficeTel() {
		return _oepUserMgtEmployee.getOfficeTel();
	}

	/**
	* Sets the office tel of this o e p user mgt employee.
	*
	* @param officeTel the office tel of this o e p user mgt employee
	*/
	@Override
	public void setOfficeTel(java.lang.String officeTel) {
		_oepUserMgtEmployee.setOfficeTel(officeTel);
	}

	/**
	* Returns the home tel of this o e p user mgt employee.
	*
	* @return the home tel of this o e p user mgt employee
	*/
	@Override
	public java.lang.String getHomeTel() {
		return _oepUserMgtEmployee.getHomeTel();
	}

	/**
	* Sets the home tel of this o e p user mgt employee.
	*
	* @param homeTel the home tel of this o e p user mgt employee
	*/
	@Override
	public void setHomeTel(java.lang.String homeTel) {
		_oepUserMgtEmployee.setHomeTel(homeTel);
	}

	/**
	* Returns the mobile of this o e p user mgt employee.
	*
	* @return the mobile of this o e p user mgt employee
	*/
	@Override
	public java.lang.String getMobile() {
		return _oepUserMgtEmployee.getMobile();
	}

	/**
	* Sets the mobile of this o e p user mgt employee.
	*
	* @param mobile the mobile of this o e p user mgt employee
	*/
	@Override
	public void setMobile(java.lang.String mobile) {
		_oepUserMgtEmployee.setMobile(mobile);
	}

	/**
	* Returns the email of this o e p user mgt employee.
	*
	* @return the email of this o e p user mgt employee
	*/
	@Override
	public java.lang.String getEmail() {
		return _oepUserMgtEmployee.getEmail();
	}

	/**
	* Sets the email of this o e p user mgt employee.
	*
	* @param email the email of this o e p user mgt employee
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_oepUserMgtEmployee.setEmail(email);
	}

	/**
	* Returns the type of employee of this o e p user mgt employee.
	*
	* @return the type of employee of this o e p user mgt employee
	*/
	@Override
	public java.lang.String getTypeOfEmployee() {
		return _oepUserMgtEmployee.getTypeOfEmployee();
	}

	/**
	* Sets the type of employee of this o e p user mgt employee.
	*
	* @param typeOfEmployee the type of employee of this o e p user mgt employee
	*/
	@Override
	public void setTypeOfEmployee(java.lang.String typeOfEmployee) {
		_oepUserMgtEmployee.setTypeOfEmployee(typeOfEmployee);
	}

	@Override
	public boolean isNew() {
		return _oepUserMgtEmployee.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_oepUserMgtEmployee.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _oepUserMgtEmployee.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_oepUserMgtEmployee.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _oepUserMgtEmployee.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _oepUserMgtEmployee.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_oepUserMgtEmployee.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _oepUserMgtEmployee.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_oepUserMgtEmployee.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_oepUserMgtEmployee.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_oepUserMgtEmployee.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new OEPUserMgtEmployeeWrapper((OEPUserMgtEmployee)_oepUserMgtEmployee.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee oepUserMgtEmployee) {
		return _oepUserMgtEmployee.compareTo(oepUserMgtEmployee);
	}

	@Override
	public int hashCode() {
		return _oepUserMgtEmployee.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee> toCacheModel() {
		return _oepUserMgtEmployee.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee toEscapedModel() {
		return new OEPUserMgtEmployeeWrapper(_oepUserMgtEmployee.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee toUnescapedModel() {
		return new OEPUserMgtEmployeeWrapper(_oepUserMgtEmployee.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _oepUserMgtEmployee.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _oepUserMgtEmployee.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_oepUserMgtEmployee.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OEPUserMgtEmployeeWrapper)) {
			return false;
		}

		OEPUserMgtEmployeeWrapper oepUserMgtEmployeeWrapper = (OEPUserMgtEmployeeWrapper)obj;

		if (Validator.equals(_oepUserMgtEmployee,
					oepUserMgtEmployeeWrapper._oepUserMgtEmployee)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public OEPUserMgtEmployee getWrappedOEPUserMgtEmployee() {
		return _oepUserMgtEmployee;
	}

	@Override
	public OEPUserMgtEmployee getWrappedModel() {
		return _oepUserMgtEmployee;
	}

	@Override
	public void resetOriginalValues() {
		_oepUserMgtEmployee.resetOriginalValues();
	}

	private OEPUserMgtEmployee _oepUserMgtEmployee;
}