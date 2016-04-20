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

package vn.dtt.duongbo.dao.lienvan.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link QlvtXuLyGpLienVanTuyen}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtXuLyGpLienVanTuyen
 * @generated
 */
public class QlvtXuLyGpLienVanTuyenWrapper implements QlvtXuLyGpLienVanTuyen,
	ModelWrapper<QlvtXuLyGpLienVanTuyen> {
	public QlvtXuLyGpLienVanTuyenWrapper(
		QlvtXuLyGpLienVanTuyen qlvtXuLyGpLienVanTuyen) {
		_qlvtXuLyGpLienVanTuyen = qlvtXuLyGpLienVanTuyen;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtXuLyGpLienVanTuyen.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtXuLyGpLienVanTuyen.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("gpLienVanPhuongTienId", getGpLienVanPhuongTienId());
		attributes.put("maTuyen", getMaTuyen());
		attributes.put("tenTuyen", getTenTuyen());
		attributes.put("tuNgay", getTuNgay());
		attributes.put("denNgay", getDenNgay());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long gpLienVanPhuongTienId = (Long)attributes.get(
				"gpLienVanPhuongTienId");

		if (gpLienVanPhuongTienId != null) {
			setGpLienVanPhuongTienId(gpLienVanPhuongTienId);
		}

		String maTuyen = (String)attributes.get("maTuyen");

		if (maTuyen != null) {
			setMaTuyen(maTuyen);
		}

		String tenTuyen = (String)attributes.get("tenTuyen");

		if (tenTuyen != null) {
			setTenTuyen(tenTuyen);
		}

		Date tuNgay = (Date)attributes.get("tuNgay");

		if (tuNgay != null) {
			setTuNgay(tuNgay);
		}

		Date denNgay = (Date)attributes.get("denNgay");

		if (denNgay != null) {
			setDenNgay(denNgay);
		}
	}

	/**
	* Returns the primary key of this qlvt xu ly gp lien van tuyen.
	*
	* @return the primary key of this qlvt xu ly gp lien van tuyen
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtXuLyGpLienVanTuyen.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt xu ly gp lien van tuyen.
	*
	* @param primaryKey the primary key of this qlvt xu ly gp lien van tuyen
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtXuLyGpLienVanTuyen.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt xu ly gp lien van tuyen.
	*
	* @return the ID of this qlvt xu ly gp lien van tuyen
	*/
	@Override
	public long getId() {
		return _qlvtXuLyGpLienVanTuyen.getId();
	}

	/**
	* Sets the ID of this qlvt xu ly gp lien van tuyen.
	*
	* @param id the ID of this qlvt xu ly gp lien van tuyen
	*/
	@Override
	public void setId(long id) {
		_qlvtXuLyGpLienVanTuyen.setId(id);
	}

	/**
	* Returns the gp lien van phuong tien ID of this qlvt xu ly gp lien van tuyen.
	*
	* @return the gp lien van phuong tien ID of this qlvt xu ly gp lien van tuyen
	*/
	@Override
	public long getGpLienVanPhuongTienId() {
		return _qlvtXuLyGpLienVanTuyen.getGpLienVanPhuongTienId();
	}

	/**
	* Sets the gp lien van phuong tien ID of this qlvt xu ly gp lien van tuyen.
	*
	* @param gpLienVanPhuongTienId the gp lien van phuong tien ID of this qlvt xu ly gp lien van tuyen
	*/
	@Override
	public void setGpLienVanPhuongTienId(long gpLienVanPhuongTienId) {
		_qlvtXuLyGpLienVanTuyen.setGpLienVanPhuongTienId(gpLienVanPhuongTienId);
	}

	/**
	* Returns the ma tuyen of this qlvt xu ly gp lien van tuyen.
	*
	* @return the ma tuyen of this qlvt xu ly gp lien van tuyen
	*/
	@Override
	public java.lang.String getMaTuyen() {
		return _qlvtXuLyGpLienVanTuyen.getMaTuyen();
	}

	/**
	* Sets the ma tuyen of this qlvt xu ly gp lien van tuyen.
	*
	* @param maTuyen the ma tuyen of this qlvt xu ly gp lien van tuyen
	*/
	@Override
	public void setMaTuyen(java.lang.String maTuyen) {
		_qlvtXuLyGpLienVanTuyen.setMaTuyen(maTuyen);
	}

	/**
	* Returns the ten tuyen of this qlvt xu ly gp lien van tuyen.
	*
	* @return the ten tuyen of this qlvt xu ly gp lien van tuyen
	*/
	@Override
	public java.lang.String getTenTuyen() {
		return _qlvtXuLyGpLienVanTuyen.getTenTuyen();
	}

	/**
	* Sets the ten tuyen of this qlvt xu ly gp lien van tuyen.
	*
	* @param tenTuyen the ten tuyen of this qlvt xu ly gp lien van tuyen
	*/
	@Override
	public void setTenTuyen(java.lang.String tenTuyen) {
		_qlvtXuLyGpLienVanTuyen.setTenTuyen(tenTuyen);
	}

	/**
	* Returns the tu ngay of this qlvt xu ly gp lien van tuyen.
	*
	* @return the tu ngay of this qlvt xu ly gp lien van tuyen
	*/
	@Override
	public java.util.Date getTuNgay() {
		return _qlvtXuLyGpLienVanTuyen.getTuNgay();
	}

	/**
	* Sets the tu ngay of this qlvt xu ly gp lien van tuyen.
	*
	* @param tuNgay the tu ngay of this qlvt xu ly gp lien van tuyen
	*/
	@Override
	public void setTuNgay(java.util.Date tuNgay) {
		_qlvtXuLyGpLienVanTuyen.setTuNgay(tuNgay);
	}

	/**
	* Returns the den ngay of this qlvt xu ly gp lien van tuyen.
	*
	* @return the den ngay of this qlvt xu ly gp lien van tuyen
	*/
	@Override
	public java.util.Date getDenNgay() {
		return _qlvtXuLyGpLienVanTuyen.getDenNgay();
	}

	/**
	* Sets the den ngay of this qlvt xu ly gp lien van tuyen.
	*
	* @param denNgay the den ngay of this qlvt xu ly gp lien van tuyen
	*/
	@Override
	public void setDenNgay(java.util.Date denNgay) {
		_qlvtXuLyGpLienVanTuyen.setDenNgay(denNgay);
	}

	@Override
	public boolean isNew() {
		return _qlvtXuLyGpLienVanTuyen.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtXuLyGpLienVanTuyen.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtXuLyGpLienVanTuyen.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtXuLyGpLienVanTuyen.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtXuLyGpLienVanTuyen.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtXuLyGpLienVanTuyen.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtXuLyGpLienVanTuyen.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtXuLyGpLienVanTuyen.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtXuLyGpLienVanTuyen.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtXuLyGpLienVanTuyen.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtXuLyGpLienVanTuyen.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtXuLyGpLienVanTuyenWrapper((QlvtXuLyGpLienVanTuyen)_qlvtXuLyGpLienVanTuyen.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen qlvtXuLyGpLienVanTuyen) {
		return _qlvtXuLyGpLienVanTuyen.compareTo(qlvtXuLyGpLienVanTuyen);
	}

	@Override
	public int hashCode() {
		return _qlvtXuLyGpLienVanTuyen.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen> toCacheModel() {
		return _qlvtXuLyGpLienVanTuyen.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen toEscapedModel() {
		return new QlvtXuLyGpLienVanTuyenWrapper(_qlvtXuLyGpLienVanTuyen.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen toUnescapedModel() {
		return new QlvtXuLyGpLienVanTuyenWrapper(_qlvtXuLyGpLienVanTuyen.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtXuLyGpLienVanTuyen.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtXuLyGpLienVanTuyen.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtXuLyGpLienVanTuyen.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtXuLyGpLienVanTuyenWrapper)) {
			return false;
		}

		QlvtXuLyGpLienVanTuyenWrapper qlvtXuLyGpLienVanTuyenWrapper = (QlvtXuLyGpLienVanTuyenWrapper)obj;

		if (Validator.equals(_qlvtXuLyGpLienVanTuyen,
					qlvtXuLyGpLienVanTuyenWrapper._qlvtXuLyGpLienVanTuyen)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtXuLyGpLienVanTuyen getWrappedQlvtXuLyGpLienVanTuyen() {
		return _qlvtXuLyGpLienVanTuyen;
	}

	@Override
	public QlvtXuLyGpLienVanTuyen getWrappedModel() {
		return _qlvtXuLyGpLienVanTuyen;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtXuLyGpLienVanTuyen.resetOriginalValues();
	}

	private QlvtXuLyGpLienVanTuyen _qlvtXuLyGpLienVanTuyen;
}