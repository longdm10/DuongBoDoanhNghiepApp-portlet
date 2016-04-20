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

package vn.dtt.duongbo.dao.quocte.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen}.
 * </p>
 *
 * @author NoiPham
 * @see QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen
 * @generated
 */
public class QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenWrapper
	implements QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen,
		ModelWrapper<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen> {
	public QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenWrapper(
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen) {
		_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen = qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("gpkdLoaiHinhKdId", getGpkdLoaiHinhKdId());
		attributes.put("maTuyen", getMaTuyen());
		attributes.put("tenTuyen", getTenTuyen());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer gpkdLoaiHinhKdId = (Integer)attributes.get("gpkdLoaiHinhKdId");

		if (gpkdLoaiHinhKdId != null) {
			setGpkdLoaiHinhKdId(gpkdLoaiHinhKdId);
		}

		String maTuyen = (String)attributes.get("maTuyen");

		if (maTuyen != null) {
			setMaTuyen(maTuyen);
		}

		String tenTuyen = (String)attributes.get("tenTuyen");

		if (tenTuyen != null) {
			setTenTuyen(tenTuyen);
		}
	}

	/**
	* Returns the primary key of this qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen.
	*
	* @return the primary key of this qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen.
	*
	* @param primaryKey the primary key of this qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen.
	*
	* @return the ID of this qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen
	*/
	@Override
	public long getId() {
		return _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.getId();
	}

	/**
	* Sets the ID of this qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen.
	*
	* @param id the ID of this qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen
	*/
	@Override
	public void setId(long id) {
		_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.setId(id);
	}

	/**
	* Returns the gpkd loai hinh kd ID of this qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen.
	*
	* @return the gpkd loai hinh kd ID of this qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen
	*/
	@Override
	public int getGpkdLoaiHinhKdId() {
		return _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.getGpkdLoaiHinhKdId();
	}

	/**
	* Sets the gpkd loai hinh kd ID of this qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen.
	*
	* @param gpkdLoaiHinhKdId the gpkd loai hinh kd ID of this qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen
	*/
	@Override
	public void setGpkdLoaiHinhKdId(int gpkdLoaiHinhKdId) {
		_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.setGpkdLoaiHinhKdId(gpkdLoaiHinhKdId);
	}

	/**
	* Returns the ma tuyen of this qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen.
	*
	* @return the ma tuyen of this qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen
	*/
	@Override
	public java.lang.String getMaTuyen() {
		return _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.getMaTuyen();
	}

	/**
	* Sets the ma tuyen of this qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen.
	*
	* @param maTuyen the ma tuyen of this qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen
	*/
	@Override
	public void setMaTuyen(java.lang.String maTuyen) {
		_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.setMaTuyen(maTuyen);
	}

	/**
	* Returns the ten tuyen of this qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen.
	*
	* @return the ten tuyen of this qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen
	*/
	@Override
	public java.lang.String getTenTuyen() {
		return _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.getTenTuyen();
	}

	/**
	* Sets the ten tuyen of this qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen.
	*
	* @param tenTuyen the ten tuyen of this qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen
	*/
	@Override
	public void setTenTuyen(java.lang.String tenTuyen) {
		_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.setTenTuyen(tenTuyen);
	}

	@Override
	public boolean isNew() {
		return _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenWrapper((QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen)_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen) {
		return _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.compareTo(qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen);
	}

	@Override
	public int hashCode() {
		return _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen> toCacheModel() {
		return _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen toEscapedModel() {
		return new QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenWrapper(_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen toUnescapedModel() {
		return new QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenWrapper(_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenWrapper)) {
			return false;
		}

		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenWrapper qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenWrapper =
			(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenWrapper)obj;

		if (Validator.equals(_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen,
					qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenWrapper._qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen getWrappedQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen() {
		return _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen;
	}

	@Override
	public QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen getWrappedModel() {
		return _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.resetOriginalValues();
	}

	private QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen;
}