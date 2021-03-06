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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the OEPUserMgtEmployee service. Represents a row in the &quot;oep_usermgt_employee&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtEmployeeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtEmployeeImpl}.
 * </p>
 *
 * @author win_64
 * @see OEPUserMgtEmployee
 * @see vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtEmployeeImpl
 * @see vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtEmployeeModelImpl
 * @generated
 */
public interface OEPUserMgtEmployeeModel extends BaseModel<OEPUserMgtEmployee> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a o e p user mgt employee model instance should use the {@link OEPUserMgtEmployee} interface instead.
	 */

	/**
	 * Returns the primary key of this o e p user mgt employee.
	 *
	 * @return the primary key of this o e p user mgt employee
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this o e p user mgt employee.
	 *
	 * @param primaryKey the primary key of this o e p user mgt employee
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the employee ID of this o e p user mgt employee.
	 *
	 * @return the employee ID of this o e p user mgt employee
	 */
	public long getEmployeeId();

	/**
	 * Sets the employee ID of this o e p user mgt employee.
	 *
	 * @param employeeId the employee ID of this o e p user mgt employee
	 */
	public void setEmployeeId(long employeeId);

	/**
	 * Returns the user ID of this o e p user mgt employee.
	 *
	 * @return the user ID of this o e p user mgt employee
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this o e p user mgt employee.
	 *
	 * @param userId the user ID of this o e p user mgt employee
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this o e p user mgt employee.
	 *
	 * @return the user uuid of this o e p user mgt employee
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this o e p user mgt employee.
	 *
	 * @param userUuid the user uuid of this o e p user mgt employee
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the group ID of this o e p user mgt employee.
	 *
	 * @return the group ID of this o e p user mgt employee
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this o e p user mgt employee.
	 *
	 * @param groupId the group ID of this o e p user mgt employee
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this o e p user mgt employee.
	 *
	 * @return the company ID of this o e p user mgt employee
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this o e p user mgt employee.
	 *
	 * @param companyId the company ID of this o e p user mgt employee
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the create date of this o e p user mgt employee.
	 *
	 * @return the create date of this o e p user mgt employee
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this o e p user mgt employee.
	 *
	 * @param createDate the create date of this o e p user mgt employee
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this o e p user mgt employee.
	 *
	 * @return the modified date of this o e p user mgt employee
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this o e p user mgt employee.
	 *
	 * @param modifiedDate the modified date of this o e p user mgt employee
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the mapping user ID of this o e p user mgt employee.
	 *
	 * @return the mapping user ID of this o e p user mgt employee
	 */
	public long getMappingUserId();

	/**
	 * Sets the mapping user ID of this o e p user mgt employee.
	 *
	 * @param mappingUserId the mapping user ID of this o e p user mgt employee
	 */
	public void setMappingUserId(long mappingUserId);

	/**
	 * Returns the mapping user uuid of this o e p user mgt employee.
	 *
	 * @return the mapping user uuid of this o e p user mgt employee
	 * @throws SystemException if a system exception occurred
	 */
	public String getMappingUserUuid() throws SystemException;

	/**
	 * Sets the mapping user uuid of this o e p user mgt employee.
	 *
	 * @param mappingUserUuid the mapping user uuid of this o e p user mgt employee
	 */
	public void setMappingUserUuid(String mappingUserUuid);

	/**
	 * Returns the working unit ID of this o e p user mgt employee.
	 *
	 * @return the working unit ID of this o e p user mgt employee
	 */
	public long getWorkingUnitId();

	/**
	 * Sets the working unit ID of this o e p user mgt employee.
	 *
	 * @param workingUnitId the working unit ID of this o e p user mgt employee
	 */
	public void setWorkingUnitId(long workingUnitId);

	/**
	 * Returns the main job pos ID of this o e p user mgt employee.
	 *
	 * @return the main job pos ID of this o e p user mgt employee
	 */
	public long getMainJobPosId();

	/**
	 * Sets the main job pos ID of this o e p user mgt employee.
	 *
	 * @param mainJobPosId the main job pos ID of this o e p user mgt employee
	 */
	public void setMainJobPosId(long mainJobPosId);

	/**
	 * Returns the employee no of this o e p user mgt employee.
	 *
	 * @return the employee no of this o e p user mgt employee
	 */
	@AutoEscape
	public String getEmployeeNo();

	/**
	 * Sets the employee no of this o e p user mgt employee.
	 *
	 * @param employeeNo the employee no of this o e p user mgt employee
	 */
	public void setEmployeeNo(String employeeNo);

	/**
	 * Returns the full name of this o e p user mgt employee.
	 *
	 * @return the full name of this o e p user mgt employee
	 */
	@AutoEscape
	public String getFullName();

	/**
	 * Sets the full name of this o e p user mgt employee.
	 *
	 * @param fullName the full name of this o e p user mgt employee
	 */
	public void setFullName(String fullName);

	/**
	 * Returns the office tel of this o e p user mgt employee.
	 *
	 * @return the office tel of this o e p user mgt employee
	 */
	@AutoEscape
	public String getOfficeTel();

	/**
	 * Sets the office tel of this o e p user mgt employee.
	 *
	 * @param officeTel the office tel of this o e p user mgt employee
	 */
	public void setOfficeTel(String officeTel);

	/**
	 * Returns the home tel of this o e p user mgt employee.
	 *
	 * @return the home tel of this o e p user mgt employee
	 */
	@AutoEscape
	public String getHomeTel();

	/**
	 * Sets the home tel of this o e p user mgt employee.
	 *
	 * @param homeTel the home tel of this o e p user mgt employee
	 */
	public void setHomeTel(String homeTel);

	/**
	 * Returns the mobile of this o e p user mgt employee.
	 *
	 * @return the mobile of this o e p user mgt employee
	 */
	@AutoEscape
	public String getMobile();

	/**
	 * Sets the mobile of this o e p user mgt employee.
	 *
	 * @param mobile the mobile of this o e p user mgt employee
	 */
	public void setMobile(String mobile);

	/**
	 * Returns the email of this o e p user mgt employee.
	 *
	 * @return the email of this o e p user mgt employee
	 */
	@AutoEscape
	public String getEmail();

	/**
	 * Sets the email of this o e p user mgt employee.
	 *
	 * @param email the email of this o e p user mgt employee
	 */
	public void setEmail(String email);

	/**
	 * Returns the type of employee of this o e p user mgt employee.
	 *
	 * @return the type of employee of this o e p user mgt employee
	 */
	@AutoEscape
	public String getTypeOfEmployee();

	/**
	 * Sets the type of employee of this o e p user mgt employee.
	 *
	 * @param typeOfEmployee the type of employee of this o e p user mgt employee
	 */
	public void setTypeOfEmployee(String typeOfEmployee);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(OEPUserMgtEmployee oepUserMgtEmployee);

	@Override
	public int hashCode();

	@Override
	public CacheModel<OEPUserMgtEmployee> toCacheModel();

	@Override
	public OEPUserMgtEmployee toEscapedModel();

	@Override
	public OEPUserMgtEmployee toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}