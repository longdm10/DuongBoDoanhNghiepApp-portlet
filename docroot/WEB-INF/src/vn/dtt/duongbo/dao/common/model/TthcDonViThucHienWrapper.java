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
 * This class is a wrapper for {@link TthcDonViThucHien}.
 * </p>
 *
 * @author win_64
 * @see TthcDonViThucHien
 * @generated
 */
public class TthcDonViThucHienWrapper implements TthcDonViThucHien,
	ModelWrapper<TthcDonViThucHien> {
	public TthcDonViThucHienWrapper(TthcDonViThucHien tthcDonViThucHien) {
		_tthcDonViThucHien = tthcDonViThucHien;
	}

	@Override
	public Class<?> getModelClass() {
		return TthcDonViThucHien.class;
	}

	@Override
	public String getModelClassName() {
		return TthcDonViThucHien.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("thuTucHanhChinhId", getThuTucHanhChinhId());
		attributes.put("maDonVi", getMaDonVi());
		attributes.put("toChuc", getToChuc());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long thuTucHanhChinhId = (Long)attributes.get("thuTucHanhChinhId");

		if (thuTucHanhChinhId != null) {
			setThuTucHanhChinhId(thuTucHanhChinhId);
		}

		String maDonVi = (String)attributes.get("maDonVi");

		if (maDonVi != null) {
			setMaDonVi(maDonVi);
		}

		Long toChuc = (Long)attributes.get("toChuc");

		if (toChuc != null) {
			setToChuc(toChuc);
		}
	}

	/**
	* Returns the primary key of this tthc don vi thuc hien.
	*
	* @return the primary key of this tthc don vi thuc hien
	*/
	@Override
	public long getPrimaryKey() {
		return _tthcDonViThucHien.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tthc don vi thuc hien.
	*
	* @param primaryKey the primary key of this tthc don vi thuc hien
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tthcDonViThucHien.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this tthc don vi thuc hien.
	*
	* @return the ID of this tthc don vi thuc hien
	*/
	@Override
	public long getId() {
		return _tthcDonViThucHien.getId();
	}

	/**
	* Sets the ID of this tthc don vi thuc hien.
	*
	* @param id the ID of this tthc don vi thuc hien
	*/
	@Override
	public void setId(long id) {
		_tthcDonViThucHien.setId(id);
	}

	/**
	* Returns the thu tuc hanh chinh ID of this tthc don vi thuc hien.
	*
	* @return the thu tuc hanh chinh ID of this tthc don vi thuc hien
	*/
	@Override
	public long getThuTucHanhChinhId() {
		return _tthcDonViThucHien.getThuTucHanhChinhId();
	}

	/**
	* Sets the thu tuc hanh chinh ID of this tthc don vi thuc hien.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID of this tthc don vi thuc hien
	*/
	@Override
	public void setThuTucHanhChinhId(long thuTucHanhChinhId) {
		_tthcDonViThucHien.setThuTucHanhChinhId(thuTucHanhChinhId);
	}

	/**
	* Returns the ma don vi of this tthc don vi thuc hien.
	*
	* @return the ma don vi of this tthc don vi thuc hien
	*/
	@Override
	public java.lang.String getMaDonVi() {
		return _tthcDonViThucHien.getMaDonVi();
	}

	/**
	* Sets the ma don vi of this tthc don vi thuc hien.
	*
	* @param maDonVi the ma don vi of this tthc don vi thuc hien
	*/
	@Override
	public void setMaDonVi(java.lang.String maDonVi) {
		_tthcDonViThucHien.setMaDonVi(maDonVi);
	}

	/**
	* Returns the to chuc of this tthc don vi thuc hien.
	*
	* @return the to chuc of this tthc don vi thuc hien
	*/
	@Override
	public long getToChuc() {
		return _tthcDonViThucHien.getToChuc();
	}

	/**
	* Sets the to chuc of this tthc don vi thuc hien.
	*
	* @param toChuc the to chuc of this tthc don vi thuc hien
	*/
	@Override
	public void setToChuc(long toChuc) {
		_tthcDonViThucHien.setToChuc(toChuc);
	}

	@Override
	public boolean isNew() {
		return _tthcDonViThucHien.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tthcDonViThucHien.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tthcDonViThucHien.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tthcDonViThucHien.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tthcDonViThucHien.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tthcDonViThucHien.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tthcDonViThucHien.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tthcDonViThucHien.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tthcDonViThucHien.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tthcDonViThucHien.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tthcDonViThucHien.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TthcDonViThucHienWrapper((TthcDonViThucHien)_tthcDonViThucHien.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.common.model.TthcDonViThucHien tthcDonViThucHien) {
		return _tthcDonViThucHien.compareTo(tthcDonViThucHien);
	}

	@Override
	public int hashCode() {
		return _tthcDonViThucHien.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.common.model.TthcDonViThucHien> toCacheModel() {
		return _tthcDonViThucHien.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.TthcDonViThucHien toEscapedModel() {
		return new TthcDonViThucHienWrapper(_tthcDonViThucHien.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.TthcDonViThucHien toUnescapedModel() {
		return new TthcDonViThucHienWrapper(_tthcDonViThucHien.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tthcDonViThucHien.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tthcDonViThucHien.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tthcDonViThucHien.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TthcDonViThucHienWrapper)) {
			return false;
		}

		TthcDonViThucHienWrapper tthcDonViThucHienWrapper = (TthcDonViThucHienWrapper)obj;

		if (Validator.equals(_tthcDonViThucHien,
					tthcDonViThucHienWrapper._tthcDonViThucHien)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TthcDonViThucHien getWrappedTthcDonViThucHien() {
		return _tthcDonViThucHien;
	}

	@Override
	public TthcDonViThucHien getWrappedModel() {
		return _tthcDonViThucHien;
	}

	@Override
	public void resetOriginalValues() {
		_tthcDonViThucHien.resetOriginalValues();
	}

	private TthcDonViThucHien _tthcDonViThucHien;
}