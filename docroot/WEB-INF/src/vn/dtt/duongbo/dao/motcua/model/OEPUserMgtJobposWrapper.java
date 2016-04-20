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
 * This class is a wrapper for {@link OEPUserMgtJobpos}.
 * </p>
 *
 * @author win_64
 * @see OEPUserMgtJobpos
 * @generated
 */
public class OEPUserMgtJobposWrapper implements OEPUserMgtJobpos,
	ModelWrapper<OEPUserMgtJobpos> {
	public OEPUserMgtJobposWrapper(OEPUserMgtJobpos oepUserMgtJobpos) {
		_oepUserMgtJobpos = oepUserMgtJobpos;
	}

	@Override
	public Class<?> getModelClass() {
		return OEPUserMgtJobpos.class;
	}

	@Override
	public String getModelClassName() {
		return OEPUserMgtJobpos.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("jobPosId", getJobPosId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("title", getTitle());
		attributes.put("positionCatNo", getPositionCatNo());
		attributes.put("workingUnitId", getWorkingUnitId());
		attributes.put("leader", getLeader());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long jobPosId = (Long)attributes.get("jobPosId");

		if (jobPosId != null) {
			setJobPosId(jobPosId);
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

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String positionCatNo = (String)attributes.get("positionCatNo");

		if (positionCatNo != null) {
			setPositionCatNo(positionCatNo);
		}

		Long workingUnitId = (Long)attributes.get("workingUnitId");

		if (workingUnitId != null) {
			setWorkingUnitId(workingUnitId);
		}

		Integer leader = (Integer)attributes.get("leader");

		if (leader != null) {
			setLeader(leader);
		}
	}

	/**
	* Returns the primary key of this o e p user mgt jobpos.
	*
	* @return the primary key of this o e p user mgt jobpos
	*/
	@Override
	public long getPrimaryKey() {
		return _oepUserMgtJobpos.getPrimaryKey();
	}

	/**
	* Sets the primary key of this o e p user mgt jobpos.
	*
	* @param primaryKey the primary key of this o e p user mgt jobpos
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_oepUserMgtJobpos.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the job pos ID of this o e p user mgt jobpos.
	*
	* @return the job pos ID of this o e p user mgt jobpos
	*/
	@Override
	public long getJobPosId() {
		return _oepUserMgtJobpos.getJobPosId();
	}

	/**
	* Sets the job pos ID of this o e p user mgt jobpos.
	*
	* @param jobPosId the job pos ID of this o e p user mgt jobpos
	*/
	@Override
	public void setJobPosId(long jobPosId) {
		_oepUserMgtJobpos.setJobPosId(jobPosId);
	}

	/**
	* Returns the user ID of this o e p user mgt jobpos.
	*
	* @return the user ID of this o e p user mgt jobpos
	*/
	@Override
	public long getUserId() {
		return _oepUserMgtJobpos.getUserId();
	}

	/**
	* Sets the user ID of this o e p user mgt jobpos.
	*
	* @param userId the user ID of this o e p user mgt jobpos
	*/
	@Override
	public void setUserId(long userId) {
		_oepUserMgtJobpos.setUserId(userId);
	}

	/**
	* Returns the user uuid of this o e p user mgt jobpos.
	*
	* @return the user uuid of this o e p user mgt jobpos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtJobpos.getUserUuid();
	}

	/**
	* Sets the user uuid of this o e p user mgt jobpos.
	*
	* @param userUuid the user uuid of this o e p user mgt jobpos
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_oepUserMgtJobpos.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this o e p user mgt jobpos.
	*
	* @return the group ID of this o e p user mgt jobpos
	*/
	@Override
	public long getGroupId() {
		return _oepUserMgtJobpos.getGroupId();
	}

	/**
	* Sets the group ID of this o e p user mgt jobpos.
	*
	* @param groupId the group ID of this o e p user mgt jobpos
	*/
	@Override
	public void setGroupId(long groupId) {
		_oepUserMgtJobpos.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this o e p user mgt jobpos.
	*
	* @return the company ID of this o e p user mgt jobpos
	*/
	@Override
	public long getCompanyId() {
		return _oepUserMgtJobpos.getCompanyId();
	}

	/**
	* Sets the company ID of this o e p user mgt jobpos.
	*
	* @param companyId the company ID of this o e p user mgt jobpos
	*/
	@Override
	public void setCompanyId(long companyId) {
		_oepUserMgtJobpos.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this o e p user mgt jobpos.
	*
	* @return the create date of this o e p user mgt jobpos
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _oepUserMgtJobpos.getCreateDate();
	}

	/**
	* Sets the create date of this o e p user mgt jobpos.
	*
	* @param createDate the create date of this o e p user mgt jobpos
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_oepUserMgtJobpos.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this o e p user mgt jobpos.
	*
	* @return the modified date of this o e p user mgt jobpos
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _oepUserMgtJobpos.getModifiedDate();
	}

	/**
	* Sets the modified date of this o e p user mgt jobpos.
	*
	* @param modifiedDate the modified date of this o e p user mgt jobpos
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_oepUserMgtJobpos.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the title of this o e p user mgt jobpos.
	*
	* @return the title of this o e p user mgt jobpos
	*/
	@Override
	public java.lang.String getTitle() {
		return _oepUserMgtJobpos.getTitle();
	}

	/**
	* Sets the title of this o e p user mgt jobpos.
	*
	* @param title the title of this o e p user mgt jobpos
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_oepUserMgtJobpos.setTitle(title);
	}

	/**
	* Returns the position cat no of this o e p user mgt jobpos.
	*
	* @return the position cat no of this o e p user mgt jobpos
	*/
	@Override
	public java.lang.String getPositionCatNo() {
		return _oepUserMgtJobpos.getPositionCatNo();
	}

	/**
	* Sets the position cat no of this o e p user mgt jobpos.
	*
	* @param positionCatNo the position cat no of this o e p user mgt jobpos
	*/
	@Override
	public void setPositionCatNo(java.lang.String positionCatNo) {
		_oepUserMgtJobpos.setPositionCatNo(positionCatNo);
	}

	/**
	* Returns the working unit ID of this o e p user mgt jobpos.
	*
	* @return the working unit ID of this o e p user mgt jobpos
	*/
	@Override
	public long getWorkingUnitId() {
		return _oepUserMgtJobpos.getWorkingUnitId();
	}

	/**
	* Sets the working unit ID of this o e p user mgt jobpos.
	*
	* @param workingUnitId the working unit ID of this o e p user mgt jobpos
	*/
	@Override
	public void setWorkingUnitId(long workingUnitId) {
		_oepUserMgtJobpos.setWorkingUnitId(workingUnitId);
	}

	/**
	* Returns the leader of this o e p user mgt jobpos.
	*
	* @return the leader of this o e p user mgt jobpos
	*/
	@Override
	public int getLeader() {
		return _oepUserMgtJobpos.getLeader();
	}

	/**
	* Sets the leader of this o e p user mgt jobpos.
	*
	* @param leader the leader of this o e p user mgt jobpos
	*/
	@Override
	public void setLeader(int leader) {
		_oepUserMgtJobpos.setLeader(leader);
	}

	@Override
	public boolean isNew() {
		return _oepUserMgtJobpos.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_oepUserMgtJobpos.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _oepUserMgtJobpos.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_oepUserMgtJobpos.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _oepUserMgtJobpos.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _oepUserMgtJobpos.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_oepUserMgtJobpos.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _oepUserMgtJobpos.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_oepUserMgtJobpos.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_oepUserMgtJobpos.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_oepUserMgtJobpos.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new OEPUserMgtJobposWrapper((OEPUserMgtJobpos)_oepUserMgtJobpos.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos oepUserMgtJobpos) {
		return _oepUserMgtJobpos.compareTo(oepUserMgtJobpos);
	}

	@Override
	public int hashCode() {
		return _oepUserMgtJobpos.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos> toCacheModel() {
		return _oepUserMgtJobpos.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos toEscapedModel() {
		return new OEPUserMgtJobposWrapper(_oepUserMgtJobpos.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos toUnescapedModel() {
		return new OEPUserMgtJobposWrapper(_oepUserMgtJobpos.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _oepUserMgtJobpos.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _oepUserMgtJobpos.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_oepUserMgtJobpos.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OEPUserMgtJobposWrapper)) {
			return false;
		}

		OEPUserMgtJobposWrapper oepUserMgtJobposWrapper = (OEPUserMgtJobposWrapper)obj;

		if (Validator.equals(_oepUserMgtJobpos,
					oepUserMgtJobposWrapper._oepUserMgtJobpos)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public OEPUserMgtJobpos getWrappedOEPUserMgtJobpos() {
		return _oepUserMgtJobpos;
	}

	@Override
	public OEPUserMgtJobpos getWrappedModel() {
		return _oepUserMgtJobpos;
	}

	@Override
	public void resetOriginalValues() {
		_oepUserMgtJobpos.resetOriginalValues();
	}

	private OEPUserMgtJobpos _oepUserMgtJobpos;
}