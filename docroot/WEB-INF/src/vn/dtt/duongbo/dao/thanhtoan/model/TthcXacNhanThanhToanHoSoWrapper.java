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

package vn.dtt.duongbo.dao.thanhtoan.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TthcXacNhanThanhToanHoSo}.
 * </p>
 *
 * @author win_64
 * @see TthcXacNhanThanhToanHoSo
 * @generated
 */
public class TthcXacNhanThanhToanHoSoWrapper implements TthcXacNhanThanhToanHoSo,
	ModelWrapper<TthcXacNhanThanhToanHoSo> {
	public TthcXacNhanThanhToanHoSoWrapper(
		TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo) {
		_tthcXacNhanThanhToanHoSo = tthcXacNhanThanhToanHoSo;
	}

	@Override
	public Class<?> getModelClass() {
		return TthcXacNhanThanhToanHoSo.class;
	}

	@Override
	public String getModelClassName() {
		return TthcXacNhanThanhToanHoSo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("xacNhanThanhToanId", getXacNhanThanhToanId());
		attributes.put("hoSoThuTucId", getHoSoThuTucId());
		attributes.put("soTien", getSoTien());
		attributes.put("phieuXuLyId", getPhieuXuLyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long xacNhanThanhToanId = (Long)attributes.get("xacNhanThanhToanId");

		if (xacNhanThanhToanId != null) {
			setXacNhanThanhToanId(xacNhanThanhToanId);
		}

		Long hoSoThuTucId = (Long)attributes.get("hoSoThuTucId");

		if (hoSoThuTucId != null) {
			setHoSoThuTucId(hoSoThuTucId);
		}

		Long soTien = (Long)attributes.get("soTien");

		if (soTien != null) {
			setSoTien(soTien);
		}

		Long phieuXuLyId = (Long)attributes.get("phieuXuLyId");

		if (phieuXuLyId != null) {
			setPhieuXuLyId(phieuXuLyId);
		}
	}

	/**
	* Returns the primary key of this tthc xac nhan thanh toan ho so.
	*
	* @return the primary key of this tthc xac nhan thanh toan ho so
	*/
	@Override
	public long getPrimaryKey() {
		return _tthcXacNhanThanhToanHoSo.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tthc xac nhan thanh toan ho so.
	*
	* @param primaryKey the primary key of this tthc xac nhan thanh toan ho so
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tthcXacNhanThanhToanHoSo.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this tthc xac nhan thanh toan ho so.
	*
	* @return the ID of this tthc xac nhan thanh toan ho so
	*/
	@Override
	public long getId() {
		return _tthcXacNhanThanhToanHoSo.getId();
	}

	/**
	* Sets the ID of this tthc xac nhan thanh toan ho so.
	*
	* @param id the ID of this tthc xac nhan thanh toan ho so
	*/
	@Override
	public void setId(long id) {
		_tthcXacNhanThanhToanHoSo.setId(id);
	}

	/**
	* Returns the xac nhan thanh toan ID of this tthc xac nhan thanh toan ho so.
	*
	* @return the xac nhan thanh toan ID of this tthc xac nhan thanh toan ho so
	*/
	@Override
	public long getXacNhanThanhToanId() {
		return _tthcXacNhanThanhToanHoSo.getXacNhanThanhToanId();
	}

	/**
	* Sets the xac nhan thanh toan ID of this tthc xac nhan thanh toan ho so.
	*
	* @param xacNhanThanhToanId the xac nhan thanh toan ID of this tthc xac nhan thanh toan ho so
	*/
	@Override
	public void setXacNhanThanhToanId(long xacNhanThanhToanId) {
		_tthcXacNhanThanhToanHoSo.setXacNhanThanhToanId(xacNhanThanhToanId);
	}

	/**
	* Returns the ho so thu tuc ID of this tthc xac nhan thanh toan ho so.
	*
	* @return the ho so thu tuc ID of this tthc xac nhan thanh toan ho so
	*/
	@Override
	public long getHoSoThuTucId() {
		return _tthcXacNhanThanhToanHoSo.getHoSoThuTucId();
	}

	/**
	* Sets the ho so thu tuc ID of this tthc xac nhan thanh toan ho so.
	*
	* @param hoSoThuTucId the ho so thu tuc ID of this tthc xac nhan thanh toan ho so
	*/
	@Override
	public void setHoSoThuTucId(long hoSoThuTucId) {
		_tthcXacNhanThanhToanHoSo.setHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns the so tien of this tthc xac nhan thanh toan ho so.
	*
	* @return the so tien of this tthc xac nhan thanh toan ho so
	*/
	@Override
	public long getSoTien() {
		return _tthcXacNhanThanhToanHoSo.getSoTien();
	}

	/**
	* Sets the so tien of this tthc xac nhan thanh toan ho so.
	*
	* @param soTien the so tien of this tthc xac nhan thanh toan ho so
	*/
	@Override
	public void setSoTien(long soTien) {
		_tthcXacNhanThanhToanHoSo.setSoTien(soTien);
	}

	/**
	* Returns the phieu xu ly ID of this tthc xac nhan thanh toan ho so.
	*
	* @return the phieu xu ly ID of this tthc xac nhan thanh toan ho so
	*/
	@Override
	public long getPhieuXuLyId() {
		return _tthcXacNhanThanhToanHoSo.getPhieuXuLyId();
	}

	/**
	* Sets the phieu xu ly ID of this tthc xac nhan thanh toan ho so.
	*
	* @param phieuXuLyId the phieu xu ly ID of this tthc xac nhan thanh toan ho so
	*/
	@Override
	public void setPhieuXuLyId(long phieuXuLyId) {
		_tthcXacNhanThanhToanHoSo.setPhieuXuLyId(phieuXuLyId);
	}

	@Override
	public boolean isNew() {
		return _tthcXacNhanThanhToanHoSo.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tthcXacNhanThanhToanHoSo.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tthcXacNhanThanhToanHoSo.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tthcXacNhanThanhToanHoSo.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tthcXacNhanThanhToanHoSo.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tthcXacNhanThanhToanHoSo.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tthcXacNhanThanhToanHoSo.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tthcXacNhanThanhToanHoSo.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tthcXacNhanThanhToanHoSo.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tthcXacNhanThanhToanHoSo.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tthcXacNhanThanhToanHoSo.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TthcXacNhanThanhToanHoSoWrapper((TthcXacNhanThanhToanHoSo)_tthcXacNhanThanhToanHoSo.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo) {
		return _tthcXacNhanThanhToanHoSo.compareTo(tthcXacNhanThanhToanHoSo);
	}

	@Override
	public int hashCode() {
		return _tthcXacNhanThanhToanHoSo.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo> toCacheModel() {
		return _tthcXacNhanThanhToanHoSo.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo toEscapedModel() {
		return new TthcXacNhanThanhToanHoSoWrapper(_tthcXacNhanThanhToanHoSo.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo toUnescapedModel() {
		return new TthcXacNhanThanhToanHoSoWrapper(_tthcXacNhanThanhToanHoSo.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tthcXacNhanThanhToanHoSo.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tthcXacNhanThanhToanHoSo.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tthcXacNhanThanhToanHoSo.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TthcXacNhanThanhToanHoSoWrapper)) {
			return false;
		}

		TthcXacNhanThanhToanHoSoWrapper tthcXacNhanThanhToanHoSoWrapper = (TthcXacNhanThanhToanHoSoWrapper)obj;

		if (Validator.equals(_tthcXacNhanThanhToanHoSo,
					tthcXacNhanThanhToanHoSoWrapper._tthcXacNhanThanhToanHoSo)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TthcXacNhanThanhToanHoSo getWrappedTthcXacNhanThanhToanHoSo() {
		return _tthcXacNhanThanhToanHoSo;
	}

	@Override
	public TthcXacNhanThanhToanHoSo getWrappedModel() {
		return _tthcXacNhanThanhToanHoSo;
	}

	@Override
	public void resetOriginalValues() {
		_tthcXacNhanThanhToanHoSo.resetOriginalValues();
	}

	private TthcXacNhanThanhToanHoSo _tthcXacNhanThanhToanHoSo;
}