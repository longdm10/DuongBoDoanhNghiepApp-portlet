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
 * This class is a wrapper for {@link OEPUserMgtWorkingUnit2tthc}.
 * </p>
 *
 * @author win_64
 * @see OEPUserMgtWorkingUnit2tthc
 * @generated
 */
public class OEPUserMgtWorkingUnit2tthcWrapper
	implements OEPUserMgtWorkingUnit2tthc,
		ModelWrapper<OEPUserMgtWorkingUnit2tthc> {
	public OEPUserMgtWorkingUnit2tthcWrapper(
		OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc) {
		_oepUserMgtWorkingUnit2tthc = oepUserMgtWorkingUnit2tthc;
	}

	@Override
	public Class<?> getModelClass() {
		return OEPUserMgtWorkingUnit2tthc.class;
	}

	@Override
	public String getModelClassName() {
		return OEPUserMgtWorkingUnit2tthc.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("workingUnit2TTHCId", getWorkingUnit2TTHCId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("workingUnitId", getWorkingUnitId());
		attributes.put("TTHCId", getTTHCId());
		attributes.put("laDonViTiepNhanBanDau", getLaDonViTiepNhanBanDau());
		attributes.put("parentWorkingUnitID", getParentWorkingUnitID());
		attributes.put("tiepNhanTrucTiep", getTiepNhanTrucTiep());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long workingUnit2TTHCId = (Long)attributes.get("workingUnit2TTHCId");

		if (workingUnit2TTHCId != null) {
			setWorkingUnit2TTHCId(workingUnit2TTHCId);
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

		Long workingUnitId = (Long)attributes.get("workingUnitId");

		if (workingUnitId != null) {
			setWorkingUnitId(workingUnitId);
		}

		Long TTHCId = (Long)attributes.get("TTHCId");

		if (TTHCId != null) {
			setTTHCId(TTHCId);
		}

		Integer laDonViTiepNhanBanDau = (Integer)attributes.get(
				"laDonViTiepNhanBanDau");

		if (laDonViTiepNhanBanDau != null) {
			setLaDonViTiepNhanBanDau(laDonViTiepNhanBanDau);
		}

		Long parentWorkingUnitID = (Long)attributes.get("parentWorkingUnitID");

		if (parentWorkingUnitID != null) {
			setParentWorkingUnitID(parentWorkingUnitID);
		}

		Integer tiepNhanTrucTiep = (Integer)attributes.get("tiepNhanTrucTiep");

		if (tiepNhanTrucTiep != null) {
			setTiepNhanTrucTiep(tiepNhanTrucTiep);
		}
	}

	/**
	* Returns the primary key of this o e p user mgt working unit2tthc.
	*
	* @return the primary key of this o e p user mgt working unit2tthc
	*/
	@Override
	public long getPrimaryKey() {
		return _oepUserMgtWorkingUnit2tthc.getPrimaryKey();
	}

	/**
	* Sets the primary key of this o e p user mgt working unit2tthc.
	*
	* @param primaryKey the primary key of this o e p user mgt working unit2tthc
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_oepUserMgtWorkingUnit2tthc.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the working unit2 t t h c ID of this o e p user mgt working unit2tthc.
	*
	* @return the working unit2 t t h c ID of this o e p user mgt working unit2tthc
	*/
	@Override
	public long getWorkingUnit2TTHCId() {
		return _oepUserMgtWorkingUnit2tthc.getWorkingUnit2TTHCId();
	}

	/**
	* Sets the working unit2 t t h c ID of this o e p user mgt working unit2tthc.
	*
	* @param workingUnit2TTHCId the working unit2 t t h c ID of this o e p user mgt working unit2tthc
	*/
	@Override
	public void setWorkingUnit2TTHCId(long workingUnit2TTHCId) {
		_oepUserMgtWorkingUnit2tthc.setWorkingUnit2TTHCId(workingUnit2TTHCId);
	}

	/**
	* Returns the user ID of this o e p user mgt working unit2tthc.
	*
	* @return the user ID of this o e p user mgt working unit2tthc
	*/
	@Override
	public long getUserId() {
		return _oepUserMgtWorkingUnit2tthc.getUserId();
	}

	/**
	* Sets the user ID of this o e p user mgt working unit2tthc.
	*
	* @param userId the user ID of this o e p user mgt working unit2tthc
	*/
	@Override
	public void setUserId(long userId) {
		_oepUserMgtWorkingUnit2tthc.setUserId(userId);
	}

	/**
	* Returns the user uuid of this o e p user mgt working unit2tthc.
	*
	* @return the user uuid of this o e p user mgt working unit2tthc
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oepUserMgtWorkingUnit2tthc.getUserUuid();
	}

	/**
	* Sets the user uuid of this o e p user mgt working unit2tthc.
	*
	* @param userUuid the user uuid of this o e p user mgt working unit2tthc
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_oepUserMgtWorkingUnit2tthc.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this o e p user mgt working unit2tthc.
	*
	* @return the group ID of this o e p user mgt working unit2tthc
	*/
	@Override
	public long getGroupId() {
		return _oepUserMgtWorkingUnit2tthc.getGroupId();
	}

	/**
	* Sets the group ID of this o e p user mgt working unit2tthc.
	*
	* @param groupId the group ID of this o e p user mgt working unit2tthc
	*/
	@Override
	public void setGroupId(long groupId) {
		_oepUserMgtWorkingUnit2tthc.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this o e p user mgt working unit2tthc.
	*
	* @return the company ID of this o e p user mgt working unit2tthc
	*/
	@Override
	public long getCompanyId() {
		return _oepUserMgtWorkingUnit2tthc.getCompanyId();
	}

	/**
	* Sets the company ID of this o e p user mgt working unit2tthc.
	*
	* @param companyId the company ID of this o e p user mgt working unit2tthc
	*/
	@Override
	public void setCompanyId(long companyId) {
		_oepUserMgtWorkingUnit2tthc.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this o e p user mgt working unit2tthc.
	*
	* @return the create date of this o e p user mgt working unit2tthc
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _oepUserMgtWorkingUnit2tthc.getCreateDate();
	}

	/**
	* Sets the create date of this o e p user mgt working unit2tthc.
	*
	* @param createDate the create date of this o e p user mgt working unit2tthc
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_oepUserMgtWorkingUnit2tthc.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this o e p user mgt working unit2tthc.
	*
	* @return the modified date of this o e p user mgt working unit2tthc
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _oepUserMgtWorkingUnit2tthc.getModifiedDate();
	}

	/**
	* Sets the modified date of this o e p user mgt working unit2tthc.
	*
	* @param modifiedDate the modified date of this o e p user mgt working unit2tthc
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_oepUserMgtWorkingUnit2tthc.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the working unit ID of this o e p user mgt working unit2tthc.
	*
	* @return the working unit ID of this o e p user mgt working unit2tthc
	*/
	@Override
	public long getWorkingUnitId() {
		return _oepUserMgtWorkingUnit2tthc.getWorkingUnitId();
	}

	/**
	* Sets the working unit ID of this o e p user mgt working unit2tthc.
	*
	* @param workingUnitId the working unit ID of this o e p user mgt working unit2tthc
	*/
	@Override
	public void setWorkingUnitId(long workingUnitId) {
		_oepUserMgtWorkingUnit2tthc.setWorkingUnitId(workingUnitId);
	}

	/**
	* Returns the t t h c ID of this o e p user mgt working unit2tthc.
	*
	* @return the t t h c ID of this o e p user mgt working unit2tthc
	*/
	@Override
	public long getTTHCId() {
		return _oepUserMgtWorkingUnit2tthc.getTTHCId();
	}

	/**
	* Sets the t t h c ID of this o e p user mgt working unit2tthc.
	*
	* @param TTHCId the t t h c ID of this o e p user mgt working unit2tthc
	*/
	@Override
	public void setTTHCId(long TTHCId) {
		_oepUserMgtWorkingUnit2tthc.setTTHCId(TTHCId);
	}

	/**
	* Returns the la don vi tiep nhan ban dau of this o e p user mgt working unit2tthc.
	*
	* @return the la don vi tiep nhan ban dau of this o e p user mgt working unit2tthc
	*/
	@Override
	public int getLaDonViTiepNhanBanDau() {
		return _oepUserMgtWorkingUnit2tthc.getLaDonViTiepNhanBanDau();
	}

	/**
	* Sets the la don vi tiep nhan ban dau of this o e p user mgt working unit2tthc.
	*
	* @param laDonViTiepNhanBanDau the la don vi tiep nhan ban dau of this o e p user mgt working unit2tthc
	*/
	@Override
	public void setLaDonViTiepNhanBanDau(int laDonViTiepNhanBanDau) {
		_oepUserMgtWorkingUnit2tthc.setLaDonViTiepNhanBanDau(laDonViTiepNhanBanDau);
	}

	/**
	* Returns the parent working unit i d of this o e p user mgt working unit2tthc.
	*
	* @return the parent working unit i d of this o e p user mgt working unit2tthc
	*/
	@Override
	public long getParentWorkingUnitID() {
		return _oepUserMgtWorkingUnit2tthc.getParentWorkingUnitID();
	}

	/**
	* Sets the parent working unit i d of this o e p user mgt working unit2tthc.
	*
	* @param parentWorkingUnitID the parent working unit i d of this o e p user mgt working unit2tthc
	*/
	@Override
	public void setParentWorkingUnitID(long parentWorkingUnitID) {
		_oepUserMgtWorkingUnit2tthc.setParentWorkingUnitID(parentWorkingUnitID);
	}

	/**
	* Returns the tiep nhan truc tiep of this o e p user mgt working unit2tthc.
	*
	* @return the tiep nhan truc tiep of this o e p user mgt working unit2tthc
	*/
	@Override
	public int getTiepNhanTrucTiep() {
		return _oepUserMgtWorkingUnit2tthc.getTiepNhanTrucTiep();
	}

	/**
	* Sets the tiep nhan truc tiep of this o e p user mgt working unit2tthc.
	*
	* @param tiepNhanTrucTiep the tiep nhan truc tiep of this o e p user mgt working unit2tthc
	*/
	@Override
	public void setTiepNhanTrucTiep(int tiepNhanTrucTiep) {
		_oepUserMgtWorkingUnit2tthc.setTiepNhanTrucTiep(tiepNhanTrucTiep);
	}

	@Override
	public boolean isNew() {
		return _oepUserMgtWorkingUnit2tthc.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_oepUserMgtWorkingUnit2tthc.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _oepUserMgtWorkingUnit2tthc.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_oepUserMgtWorkingUnit2tthc.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _oepUserMgtWorkingUnit2tthc.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _oepUserMgtWorkingUnit2tthc.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_oepUserMgtWorkingUnit2tthc.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _oepUserMgtWorkingUnit2tthc.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_oepUserMgtWorkingUnit2tthc.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_oepUserMgtWorkingUnit2tthc.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_oepUserMgtWorkingUnit2tthc.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new OEPUserMgtWorkingUnit2tthcWrapper((OEPUserMgtWorkingUnit2tthc)_oepUserMgtWorkingUnit2tthc.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc) {
		return _oepUserMgtWorkingUnit2tthc.compareTo(oepUserMgtWorkingUnit2tthc);
	}

	@Override
	public int hashCode() {
		return _oepUserMgtWorkingUnit2tthc.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc> toCacheModel() {
		return _oepUserMgtWorkingUnit2tthc.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc toEscapedModel() {
		return new OEPUserMgtWorkingUnit2tthcWrapper(_oepUserMgtWorkingUnit2tthc.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc toUnescapedModel() {
		return new OEPUserMgtWorkingUnit2tthcWrapper(_oepUserMgtWorkingUnit2tthc.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _oepUserMgtWorkingUnit2tthc.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _oepUserMgtWorkingUnit2tthc.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_oepUserMgtWorkingUnit2tthc.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OEPUserMgtWorkingUnit2tthcWrapper)) {
			return false;
		}

		OEPUserMgtWorkingUnit2tthcWrapper oepUserMgtWorkingUnit2tthcWrapper = (OEPUserMgtWorkingUnit2tthcWrapper)obj;

		if (Validator.equals(_oepUserMgtWorkingUnit2tthc,
					oepUserMgtWorkingUnit2tthcWrapper._oepUserMgtWorkingUnit2tthc)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public OEPUserMgtWorkingUnit2tthc getWrappedOEPUserMgtWorkingUnit2tthc() {
		return _oepUserMgtWorkingUnit2tthc;
	}

	@Override
	public OEPUserMgtWorkingUnit2tthc getWrappedModel() {
		return _oepUserMgtWorkingUnit2tthc;
	}

	@Override
	public void resetOriginalValues() {
		_oepUserMgtWorkingUnit2tthc.resetOriginalValues();
	}

	private OEPUserMgtWorkingUnit2tthc _oepUserMgtWorkingUnit2tthc;
}