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
 * This class is a wrapper for {@link OEPThuTucHanhChinhRole}.
 * </p>
 *
 * @author win_64
 * @see OEPThuTucHanhChinhRole
 * @generated
 */
public class OEPThuTucHanhChinhRoleWrapper implements OEPThuTucHanhChinhRole,
	ModelWrapper<OEPThuTucHanhChinhRole> {
	public OEPThuTucHanhChinhRoleWrapper(
		OEPThuTucHanhChinhRole oepThuTucHanhChinhRole) {
		_oepThuTucHanhChinhRole = oepThuTucHanhChinhRole;
	}

	@Override
	public Class<?> getModelClass() {
		return OEPThuTucHanhChinhRole.class;
	}

	@Override
	public String getModelClassName() {
		return OEPThuTucHanhChinhRole.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("thuTucHinhChinhId", getThuTucHinhChinhId());
		attributes.put("vaiTroThucHien", getVaiTroThucHien());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer thuTucHinhChinhId = (Integer)attributes.get("thuTucHinhChinhId");

		if (thuTucHinhChinhId != null) {
			setThuTucHinhChinhId(thuTucHinhChinhId);
		}

		Integer vaiTroThucHien = (Integer)attributes.get("vaiTroThucHien");

		if (vaiTroThucHien != null) {
			setVaiTroThucHien(vaiTroThucHien);
		}
	}

	/**
	* Returns the primary key of this o e p thu tuc hanh chinh role.
	*
	* @return the primary key of this o e p thu tuc hanh chinh role
	*/
	@Override
	public int getPrimaryKey() {
		return _oepThuTucHanhChinhRole.getPrimaryKey();
	}

	/**
	* Sets the primary key of this o e p thu tuc hanh chinh role.
	*
	* @param primaryKey the primary key of this o e p thu tuc hanh chinh role
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_oepThuTucHanhChinhRole.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this o e p thu tuc hanh chinh role.
	*
	* @return the ID of this o e p thu tuc hanh chinh role
	*/
	@Override
	public int getId() {
		return _oepThuTucHanhChinhRole.getId();
	}

	/**
	* Sets the ID of this o e p thu tuc hanh chinh role.
	*
	* @param id the ID of this o e p thu tuc hanh chinh role
	*/
	@Override
	public void setId(int id) {
		_oepThuTucHanhChinhRole.setId(id);
	}

	/**
	* Returns the thu tuc hinh chinh ID of this o e p thu tuc hanh chinh role.
	*
	* @return the thu tuc hinh chinh ID of this o e p thu tuc hanh chinh role
	*/
	@Override
	public int getThuTucHinhChinhId() {
		return _oepThuTucHanhChinhRole.getThuTucHinhChinhId();
	}

	/**
	* Sets the thu tuc hinh chinh ID of this o e p thu tuc hanh chinh role.
	*
	* @param thuTucHinhChinhId the thu tuc hinh chinh ID of this o e p thu tuc hanh chinh role
	*/
	@Override
	public void setThuTucHinhChinhId(int thuTucHinhChinhId) {
		_oepThuTucHanhChinhRole.setThuTucHinhChinhId(thuTucHinhChinhId);
	}

	/**
	* Returns the vai tro thuc hien of this o e p thu tuc hanh chinh role.
	*
	* @return the vai tro thuc hien of this o e p thu tuc hanh chinh role
	*/
	@Override
	public int getVaiTroThucHien() {
		return _oepThuTucHanhChinhRole.getVaiTroThucHien();
	}

	/**
	* Sets the vai tro thuc hien of this o e p thu tuc hanh chinh role.
	*
	* @param vaiTroThucHien the vai tro thuc hien of this o e p thu tuc hanh chinh role
	*/
	@Override
	public void setVaiTroThucHien(int vaiTroThucHien) {
		_oepThuTucHanhChinhRole.setVaiTroThucHien(vaiTroThucHien);
	}

	@Override
	public boolean isNew() {
		return _oepThuTucHanhChinhRole.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_oepThuTucHanhChinhRole.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _oepThuTucHanhChinhRole.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_oepThuTucHanhChinhRole.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _oepThuTucHanhChinhRole.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _oepThuTucHanhChinhRole.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_oepThuTucHanhChinhRole.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _oepThuTucHanhChinhRole.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_oepThuTucHanhChinhRole.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_oepThuTucHanhChinhRole.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_oepThuTucHanhChinhRole.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new OEPThuTucHanhChinhRoleWrapper((OEPThuTucHanhChinhRole)_oepThuTucHanhChinhRole.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.motcua.model.OEPThuTucHanhChinhRole oepThuTucHanhChinhRole) {
		return _oepThuTucHanhChinhRole.compareTo(oepThuTucHanhChinhRole);
	}

	@Override
	public int hashCode() {
		return _oepThuTucHanhChinhRole.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.motcua.model.OEPThuTucHanhChinhRole> toCacheModel() {
		return _oepThuTucHanhChinhRole.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPThuTucHanhChinhRole toEscapedModel() {
		return new OEPThuTucHanhChinhRoleWrapper(_oepThuTucHanhChinhRole.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.motcua.model.OEPThuTucHanhChinhRole toUnescapedModel() {
		return new OEPThuTucHanhChinhRoleWrapper(_oepThuTucHanhChinhRole.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _oepThuTucHanhChinhRole.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _oepThuTucHanhChinhRole.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_oepThuTucHanhChinhRole.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OEPThuTucHanhChinhRoleWrapper)) {
			return false;
		}

		OEPThuTucHanhChinhRoleWrapper oepThuTucHanhChinhRoleWrapper = (OEPThuTucHanhChinhRoleWrapper)obj;

		if (Validator.equals(_oepThuTucHanhChinhRole,
					oepThuTucHanhChinhRoleWrapper._oepThuTucHanhChinhRole)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public OEPThuTucHanhChinhRole getWrappedOEPThuTucHanhChinhRole() {
		return _oepThuTucHanhChinhRole;
	}

	@Override
	public OEPThuTucHanhChinhRole getWrappedModel() {
		return _oepThuTucHanhChinhRole;
	}

	@Override
	public void resetOriginalValues() {
		_oepThuTucHanhChinhRole.resetOriginalValues();
	}

	private OEPThuTucHanhChinhRole _oepThuTucHanhChinhRole;
}