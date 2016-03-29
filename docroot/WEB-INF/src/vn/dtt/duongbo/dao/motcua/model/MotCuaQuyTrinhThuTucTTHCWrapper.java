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
 * This class is a wrapper for {@link MotCuaQuyTrinhThuTucTTHC}.
 * </p>
 *
 * @author win_64
 * @see MotCuaQuyTrinhThuTucTTHC
 * @generated
 */
public class MotCuaQuyTrinhThuTucTTHCWrapper implements MotCuaQuyTrinhThuTucTTHC,
	ModelWrapper<MotCuaQuyTrinhThuTucTTHC> {
	public MotCuaQuyTrinhThuTucTTHCWrapper(
		MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC) {
		_motCuaQuyTrinhThuTucTTHC = motCuaQuyTrinhThuTucTTHC;
	}

	@Override
	public Class<?> getModelClass() {
		return MotCuaQuyTrinhThuTucTTHC.class;
	}

	@Override
	public String getModelClassName() {
		return MotCuaQuyTrinhThuTucTTHC.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("quyTrinhThuTucId", getQuyTrinhThuTucId());
		attributes.put("thuTucHanhChinhID", getThuTucHanhChinhID());
		attributes.put("toChucXuLy", getToChucXuLy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long quyTrinhThuTucId = (Long)attributes.get("quyTrinhThuTucId");

		if (quyTrinhThuTucId != null) {
			setQuyTrinhThuTucId(quyTrinhThuTucId);
		}

		Long thuTucHanhChinhID = (Long)attributes.get("thuTucHanhChinhID");

		if (thuTucHanhChinhID != null) {
			setThuTucHanhChinhID(thuTucHanhChinhID);
		}

		Long toChucXuLy = (Long)attributes.get("toChucXuLy");

		if (toChucXuLy != null) {
			setToChucXuLy(toChucXuLy);
		}
	}

	/**
	* Returns the primary key of this mot cua quy trinh thu tuc t t h c.
	*
	* @return the primary key of this mot cua quy trinh thu tuc t t h c
	*/
	@Override
	public long getPrimaryKey() {
		return _motCuaQuyTrinhThuTucTTHC.getPrimaryKey();
	}

	/**
	* Sets the primary key of this mot cua quy trinh thu tuc t t h c.
	*
	* @param primaryKey the primary key of this mot cua quy trinh thu tuc t t h c
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_motCuaQuyTrinhThuTucTTHC.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this mot cua quy trinh thu tuc t t h c.
	*
	* @return the ID of this mot cua quy trinh thu tuc t t h c
	*/
	@Override
	public long getId() {
		return _motCuaQuyTrinhThuTucTTHC.getId();
	}

	/**
	* Sets the ID of this mot cua quy trinh thu tuc t t h c.
	*
	* @param id the ID of this mot cua quy trinh thu tuc t t h c
	*/
	@Override
	public void setId(long id) {
		_motCuaQuyTrinhThuTucTTHC.setId(id);
	}

	/**
	* Returns the quy trinh thu tuc ID of this mot cua quy trinh thu tuc t t h c.
	*
	* @return the quy trinh thu tuc ID of this mot cua quy trinh thu tuc t t h c
	*/
	@Override
	public long getQuyTrinhThuTucId() {
		return _motCuaQuyTrinhThuTucTTHC.getQuyTrinhThuTucId();
	}

	/**
	* Sets the quy trinh thu tuc ID of this mot cua quy trinh thu tuc t t h c.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID of this mot cua quy trinh thu tuc t t h c
	*/
	@Override
	public void setQuyTrinhThuTucId(long quyTrinhThuTucId) {
		_motCuaQuyTrinhThuTucTTHC.setQuyTrinhThuTucId(quyTrinhThuTucId);
	}

	/**
	* Returns the thu tuc hanh chinh i d of this mot cua quy trinh thu tuc t t h c.
	*
	* @return the thu tuc hanh chinh i d of this mot cua quy trinh thu tuc t t h c
	*/
	@Override
	public long getThuTucHanhChinhID() {
		return _motCuaQuyTrinhThuTucTTHC.getThuTucHanhChinhID();
	}

	/**
	* Sets the thu tuc hanh chinh i d of this mot cua quy trinh thu tuc t t h c.
	*
	* @param thuTucHanhChinhID the thu tuc hanh chinh i d of this mot cua quy trinh thu tuc t t h c
	*/
	@Override
	public void setThuTucHanhChinhID(long thuTucHanhChinhID) {
		_motCuaQuyTrinhThuTucTTHC.setThuTucHanhChinhID(thuTucHanhChinhID);
	}

	/**
	* Returns the to chuc xu ly of this mot cua quy trinh thu tuc t t h c.
	*
	* @return the to chuc xu ly of this mot cua quy trinh thu tuc t t h c
	*/
	@Override
	public long getToChucXuLy() {
		return _motCuaQuyTrinhThuTucTTHC.getToChucXuLy();
	}

	/**
	* Sets the to chuc xu ly of this mot cua quy trinh thu tuc t t h c.
	*
	* @param toChucXuLy the to chuc xu ly of this mot cua quy trinh thu tuc t t h c
	*/
	@Override
	public void setToChucXuLy(long toChucXuLy) {
		_motCuaQuyTrinhThuTucTTHC.setToChucXuLy(toChucXuLy);
	}

	@Override
	public boolean isNew() {
		return _motCuaQuyTrinhThuTucTTHC.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_motCuaQuyTrinhThuTucTTHC.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _motCuaQuyTrinhThuTucTTHC.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_motCuaQuyTrinhThuTucTTHC.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _motCuaQuyTrinhThuTucTTHC.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _motCuaQuyTrinhThuTucTTHC.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_motCuaQuyTrinhThuTucTTHC.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _motCuaQuyTrinhThuTucTTHC.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_motCuaQuyTrinhThuTucTTHC.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_motCuaQuyTrinhThuTucTTHC.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_motCuaQuyTrinhThuTucTTHC.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new MotCuaQuyTrinhThuTucTTHCWrapper((MotCuaQuyTrinhThuTucTTHC)_motCuaQuyTrinhThuTucTTHC.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC) {
		return _motCuaQuyTrinhThuTucTTHC.compareTo(motCuaQuyTrinhThuTucTTHC);
	}

	@Override
	public int hashCode() {
		return _motCuaQuyTrinhThuTucTTHC.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC> toCacheModel() {
		return _motCuaQuyTrinhThuTucTTHC.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC toEscapedModel() {
		return new MotCuaQuyTrinhThuTucTTHCWrapper(_motCuaQuyTrinhThuTucTTHC.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC toUnescapedModel() {
		return new MotCuaQuyTrinhThuTucTTHCWrapper(_motCuaQuyTrinhThuTucTTHC.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _motCuaQuyTrinhThuTucTTHC.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _motCuaQuyTrinhThuTucTTHC.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_motCuaQuyTrinhThuTucTTHC.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MotCuaQuyTrinhThuTucTTHCWrapper)) {
			return false;
		}

		MotCuaQuyTrinhThuTucTTHCWrapper motCuaQuyTrinhThuTucTTHCWrapper = (MotCuaQuyTrinhThuTucTTHCWrapper)obj;

		if (Validator.equals(_motCuaQuyTrinhThuTucTTHC,
					motCuaQuyTrinhThuTucTTHCWrapper._motCuaQuyTrinhThuTucTTHC)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public MotCuaQuyTrinhThuTucTTHC getWrappedMotCuaQuyTrinhThuTucTTHC() {
		return _motCuaQuyTrinhThuTucTTHC;
	}

	@Override
	public MotCuaQuyTrinhThuTucTTHC getWrappedModel() {
		return _motCuaQuyTrinhThuTucTTHC;
	}

	@Override
	public void resetOriginalValues() {
		_motCuaQuyTrinhThuTucTTHC.resetOriginalValues();
	}

	private MotCuaQuyTrinhThuTucTTHC _motCuaQuyTrinhThuTucTTHC;
}