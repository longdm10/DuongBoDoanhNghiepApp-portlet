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
 * This class is a wrapper for {@link TthcDoiTuongThucHien}.
 * </p>
 *
 * @author win_64
 * @see TthcDoiTuongThucHien
 * @generated
 */
public class TthcDoiTuongThucHienWrapper implements TthcDoiTuongThucHien,
	ModelWrapper<TthcDoiTuongThucHien> {
	public TthcDoiTuongThucHienWrapper(
		TthcDoiTuongThucHien tthcDoiTuongThucHien) {
		_tthcDoiTuongThucHien = tthcDoiTuongThucHien;
	}

	@Override
	public Class<?> getModelClass() {
		return TthcDoiTuongThucHien.class;
	}

	@Override
	public String getModelClassName() {
		return TthcDoiTuongThucHien.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("thuTucHanhChinhId", getThuTucHanhChinhId());
		attributes.put("loaiDoiTuongThucHien", getLoaiDoiTuongThucHien());

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

		String loaiDoiTuongThucHien = (String)attributes.get(
				"loaiDoiTuongThucHien");

		if (loaiDoiTuongThucHien != null) {
			setLoaiDoiTuongThucHien(loaiDoiTuongThucHien);
		}
	}

	/**
	* Returns the primary key of this tthc doi tuong thuc hien.
	*
	* @return the primary key of this tthc doi tuong thuc hien
	*/
	@Override
	public long getPrimaryKey() {
		return _tthcDoiTuongThucHien.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tthc doi tuong thuc hien.
	*
	* @param primaryKey the primary key of this tthc doi tuong thuc hien
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tthcDoiTuongThucHien.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this tthc doi tuong thuc hien.
	*
	* @return the ID of this tthc doi tuong thuc hien
	*/
	@Override
	public long getId() {
		return _tthcDoiTuongThucHien.getId();
	}

	/**
	* Sets the ID of this tthc doi tuong thuc hien.
	*
	* @param id the ID of this tthc doi tuong thuc hien
	*/
	@Override
	public void setId(long id) {
		_tthcDoiTuongThucHien.setId(id);
	}

	/**
	* Returns the thu tuc hanh chinh ID of this tthc doi tuong thuc hien.
	*
	* @return the thu tuc hanh chinh ID of this tthc doi tuong thuc hien
	*/
	@Override
	public long getThuTucHanhChinhId() {
		return _tthcDoiTuongThucHien.getThuTucHanhChinhId();
	}

	/**
	* Sets the thu tuc hanh chinh ID of this tthc doi tuong thuc hien.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID of this tthc doi tuong thuc hien
	*/
	@Override
	public void setThuTucHanhChinhId(long thuTucHanhChinhId) {
		_tthcDoiTuongThucHien.setThuTucHanhChinhId(thuTucHanhChinhId);
	}

	/**
	* Returns the loai doi tuong thuc hien of this tthc doi tuong thuc hien.
	*
	* @return the loai doi tuong thuc hien of this tthc doi tuong thuc hien
	*/
	@Override
	public java.lang.String getLoaiDoiTuongThucHien() {
		return _tthcDoiTuongThucHien.getLoaiDoiTuongThucHien();
	}

	/**
	* Sets the loai doi tuong thuc hien of this tthc doi tuong thuc hien.
	*
	* @param loaiDoiTuongThucHien the loai doi tuong thuc hien of this tthc doi tuong thuc hien
	*/
	@Override
	public void setLoaiDoiTuongThucHien(java.lang.String loaiDoiTuongThucHien) {
		_tthcDoiTuongThucHien.setLoaiDoiTuongThucHien(loaiDoiTuongThucHien);
	}

	@Override
	public boolean isNew() {
		return _tthcDoiTuongThucHien.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tthcDoiTuongThucHien.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tthcDoiTuongThucHien.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tthcDoiTuongThucHien.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tthcDoiTuongThucHien.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tthcDoiTuongThucHien.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tthcDoiTuongThucHien.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tthcDoiTuongThucHien.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tthcDoiTuongThucHien.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tthcDoiTuongThucHien.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tthcDoiTuongThucHien.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TthcDoiTuongThucHienWrapper((TthcDoiTuongThucHien)_tthcDoiTuongThucHien.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.common.model.TthcDoiTuongThucHien tthcDoiTuongThucHien) {
		return _tthcDoiTuongThucHien.compareTo(tthcDoiTuongThucHien);
	}

	@Override
	public int hashCode() {
		return _tthcDoiTuongThucHien.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.common.model.TthcDoiTuongThucHien> toCacheModel() {
		return _tthcDoiTuongThucHien.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.TthcDoiTuongThucHien toEscapedModel() {
		return new TthcDoiTuongThucHienWrapper(_tthcDoiTuongThucHien.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.TthcDoiTuongThucHien toUnescapedModel() {
		return new TthcDoiTuongThucHienWrapper(_tthcDoiTuongThucHien.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tthcDoiTuongThucHien.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tthcDoiTuongThucHien.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tthcDoiTuongThucHien.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TthcDoiTuongThucHienWrapper)) {
			return false;
		}

		TthcDoiTuongThucHienWrapper tthcDoiTuongThucHienWrapper = (TthcDoiTuongThucHienWrapper)obj;

		if (Validator.equals(_tthcDoiTuongThucHien,
					tthcDoiTuongThucHienWrapper._tthcDoiTuongThucHien)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TthcDoiTuongThucHien getWrappedTthcDoiTuongThucHien() {
		return _tthcDoiTuongThucHien;
	}

	@Override
	public TthcDoiTuongThucHien getWrappedModel() {
		return _tthcDoiTuongThucHien;
	}

	@Override
	public void resetOriginalValues() {
		_tthcDoiTuongThucHien.resetOriginalValues();
	}

	private TthcDoiTuongThucHien _tthcDoiTuongThucHien;
}