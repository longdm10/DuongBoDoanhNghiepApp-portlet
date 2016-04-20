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

package vn.dtt.duongbo.dao.common.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TthcPhanNhomHoSoVaiTro}.
 * </p>
 *
 * @author win_64
 * @see TthcPhanNhomHoSoVaiTro
 * @generated
 */
public class TthcPhanNhomHoSoVaiTroWrapper implements TthcPhanNhomHoSoVaiTro,
	ModelWrapper<TthcPhanNhomHoSoVaiTro> {
	public TthcPhanNhomHoSoVaiTroWrapper(
		TthcPhanNhomHoSoVaiTro tthcPhanNhomHoSoVaiTro) {
		_tthcPhanNhomHoSoVaiTro = tthcPhanNhomHoSoVaiTro;
	}

	@Override
	public Class<?> getModelClass() {
		return TthcPhanNhomHoSoVaiTro.class;
	}

	@Override
	public String getModelClassName() {
		return TthcPhanNhomHoSoVaiTro.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("phanNhomHoSoId", getPhanNhomHoSoId());
		attributes.put("vaiTroXuLy", getVaiTroXuLy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long phanNhomHoSoId = (Long)attributes.get("phanNhomHoSoId");

		if (phanNhomHoSoId != null) {
			setPhanNhomHoSoId(phanNhomHoSoId);
		}

		Long vaiTroXuLy = (Long)attributes.get("vaiTroXuLy");

		if (vaiTroXuLy != null) {
			setVaiTroXuLy(vaiTroXuLy);
		}
	}

	/**
	* Returns the primary key of this tthc phan nhom ho so vai tro.
	*
	* @return the primary key of this tthc phan nhom ho so vai tro
	*/
	@Override
	public long getPrimaryKey() {
		return _tthcPhanNhomHoSoVaiTro.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tthc phan nhom ho so vai tro.
	*
	* @param primaryKey the primary key of this tthc phan nhom ho so vai tro
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tthcPhanNhomHoSoVaiTro.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this tthc phan nhom ho so vai tro.
	*
	* @return the ID of this tthc phan nhom ho so vai tro
	*/
	@Override
	public long getId() {
		return _tthcPhanNhomHoSoVaiTro.getId();
	}

	/**
	* Sets the ID of this tthc phan nhom ho so vai tro.
	*
	* @param id the ID of this tthc phan nhom ho so vai tro
	*/
	@Override
	public void setId(long id) {
		_tthcPhanNhomHoSoVaiTro.setId(id);
	}

	/**
	* Returns the phan nhom ho so ID of this tthc phan nhom ho so vai tro.
	*
	* @return the phan nhom ho so ID of this tthc phan nhom ho so vai tro
	*/
	@Override
	public long getPhanNhomHoSoId() {
		return _tthcPhanNhomHoSoVaiTro.getPhanNhomHoSoId();
	}

	/**
	* Sets the phan nhom ho so ID of this tthc phan nhom ho so vai tro.
	*
	* @param phanNhomHoSoId the phan nhom ho so ID of this tthc phan nhom ho so vai tro
	*/
	@Override
	public void setPhanNhomHoSoId(long phanNhomHoSoId) {
		_tthcPhanNhomHoSoVaiTro.setPhanNhomHoSoId(phanNhomHoSoId);
	}

	/**
	* Returns the vai tro xu ly of this tthc phan nhom ho so vai tro.
	*
	* @return the vai tro xu ly of this tthc phan nhom ho so vai tro
	*/
	@Override
	public long getVaiTroXuLy() {
		return _tthcPhanNhomHoSoVaiTro.getVaiTroXuLy();
	}

	/**
	* Sets the vai tro xu ly of this tthc phan nhom ho so vai tro.
	*
	* @param vaiTroXuLy the vai tro xu ly of this tthc phan nhom ho so vai tro
	*/
	@Override
	public void setVaiTroXuLy(long vaiTroXuLy) {
		_tthcPhanNhomHoSoVaiTro.setVaiTroXuLy(vaiTroXuLy);
	}

	@Override
	public boolean isNew() {
		return _tthcPhanNhomHoSoVaiTro.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tthcPhanNhomHoSoVaiTro.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tthcPhanNhomHoSoVaiTro.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tthcPhanNhomHoSoVaiTro.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tthcPhanNhomHoSoVaiTro.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tthcPhanNhomHoSoVaiTro.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tthcPhanNhomHoSoVaiTro.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tthcPhanNhomHoSoVaiTro.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tthcPhanNhomHoSoVaiTro.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tthcPhanNhomHoSoVaiTro.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tthcPhanNhomHoSoVaiTro.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TthcPhanNhomHoSoVaiTroWrapper((TthcPhanNhomHoSoVaiTro)_tthcPhanNhomHoSoVaiTro.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSoVaiTro tthcPhanNhomHoSoVaiTro) {
		return _tthcPhanNhomHoSoVaiTro.compareTo(tthcPhanNhomHoSoVaiTro);
	}

	@Override
	public int hashCode() {
		return _tthcPhanNhomHoSoVaiTro.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSoVaiTro> toCacheModel() {
		return _tthcPhanNhomHoSoVaiTro.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSoVaiTro toEscapedModel() {
		return new TthcPhanNhomHoSoVaiTroWrapper(_tthcPhanNhomHoSoVaiTro.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSoVaiTro toUnescapedModel() {
		return new TthcPhanNhomHoSoVaiTroWrapper(_tthcPhanNhomHoSoVaiTro.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tthcPhanNhomHoSoVaiTro.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tthcPhanNhomHoSoVaiTro.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tthcPhanNhomHoSoVaiTro.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TthcPhanNhomHoSoVaiTroWrapper)) {
			return false;
		}

		TthcPhanNhomHoSoVaiTroWrapper tthcPhanNhomHoSoVaiTroWrapper = (TthcPhanNhomHoSoVaiTroWrapper)obj;

		if (Validator.equals(_tthcPhanNhomHoSoVaiTro,
					tthcPhanNhomHoSoVaiTroWrapper._tthcPhanNhomHoSoVaiTro)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TthcPhanNhomHoSoVaiTro getWrappedTthcPhanNhomHoSoVaiTro() {
		return _tthcPhanNhomHoSoVaiTro;
	}

	@Override
	public TthcPhanNhomHoSoVaiTro getWrappedModel() {
		return _tthcPhanNhomHoSoVaiTro;
	}

	@Override
	public void resetOriginalValues() {
		_tthcPhanNhomHoSoVaiTro.resetOriginalValues();
	}

	private TthcPhanNhomHoSoVaiTro _tthcPhanNhomHoSoVaiTro;
}