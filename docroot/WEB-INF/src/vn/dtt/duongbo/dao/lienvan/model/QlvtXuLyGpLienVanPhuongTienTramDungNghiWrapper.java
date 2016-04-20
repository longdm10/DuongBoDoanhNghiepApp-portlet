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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link QlvtXuLyGpLienVanPhuongTienTramDungNghi}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtXuLyGpLienVanPhuongTienTramDungNghi
 * @generated
 */
public class QlvtXuLyGpLienVanPhuongTienTramDungNghiWrapper
	implements QlvtXuLyGpLienVanPhuongTienTramDungNghi,
		ModelWrapper<QlvtXuLyGpLienVanPhuongTienTramDungNghi> {
	public QlvtXuLyGpLienVanPhuongTienTramDungNghiWrapper(
		QlvtXuLyGpLienVanPhuongTienTramDungNghi qlvtXuLyGpLienVanPhuongTienTramDungNghi) {
		_qlvtXuLyGpLienVanPhuongTienTramDungNghi = qlvtXuLyGpLienVanPhuongTienTramDungNghi;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtXuLyGpLienVanPhuongTienTramDungNghi.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtXuLyGpLienVanPhuongTienTramDungNghi.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("capGplxPhuongTienId", getCapGplxPhuongTienId());
		attributes.put("maTramDungNghi", getMaTramDungNghi());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long capGplxPhuongTienId = (Long)attributes.get("capGplxPhuongTienId");

		if (capGplxPhuongTienId != null) {
			setCapGplxPhuongTienId(capGplxPhuongTienId);
		}

		String maTramDungNghi = (String)attributes.get("maTramDungNghi");

		if (maTramDungNghi != null) {
			setMaTramDungNghi(maTramDungNghi);
		}
	}

	/**
	* Returns the primary key of this qlvt xu ly gp lien van phuong tien tram dung nghi.
	*
	* @return the primary key of this qlvt xu ly gp lien van phuong tien tram dung nghi
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtXuLyGpLienVanPhuongTienTramDungNghi.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt xu ly gp lien van phuong tien tram dung nghi.
	*
	* @param primaryKey the primary key of this qlvt xu ly gp lien van phuong tien tram dung nghi
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtXuLyGpLienVanPhuongTienTramDungNghi.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt xu ly gp lien van phuong tien tram dung nghi.
	*
	* @return the ID of this qlvt xu ly gp lien van phuong tien tram dung nghi
	*/
	@Override
	public long getId() {
		return _qlvtXuLyGpLienVanPhuongTienTramDungNghi.getId();
	}

	/**
	* Sets the ID of this qlvt xu ly gp lien van phuong tien tram dung nghi.
	*
	* @param id the ID of this qlvt xu ly gp lien van phuong tien tram dung nghi
	*/
	@Override
	public void setId(long id) {
		_qlvtXuLyGpLienVanPhuongTienTramDungNghi.setId(id);
	}

	/**
	* Returns the cap gplx phuong tien ID of this qlvt xu ly gp lien van phuong tien tram dung nghi.
	*
	* @return the cap gplx phuong tien ID of this qlvt xu ly gp lien van phuong tien tram dung nghi
	*/
	@Override
	public long getCapGplxPhuongTienId() {
		return _qlvtXuLyGpLienVanPhuongTienTramDungNghi.getCapGplxPhuongTienId();
	}

	/**
	* Sets the cap gplx phuong tien ID of this qlvt xu ly gp lien van phuong tien tram dung nghi.
	*
	* @param capGplxPhuongTienId the cap gplx phuong tien ID of this qlvt xu ly gp lien van phuong tien tram dung nghi
	*/
	@Override
	public void setCapGplxPhuongTienId(long capGplxPhuongTienId) {
		_qlvtXuLyGpLienVanPhuongTienTramDungNghi.setCapGplxPhuongTienId(capGplxPhuongTienId);
	}

	/**
	* Returns the ma tram dung nghi of this qlvt xu ly gp lien van phuong tien tram dung nghi.
	*
	* @return the ma tram dung nghi of this qlvt xu ly gp lien van phuong tien tram dung nghi
	*/
	@Override
	public java.lang.String getMaTramDungNghi() {
		return _qlvtXuLyGpLienVanPhuongTienTramDungNghi.getMaTramDungNghi();
	}

	/**
	* Sets the ma tram dung nghi of this qlvt xu ly gp lien van phuong tien tram dung nghi.
	*
	* @param maTramDungNghi the ma tram dung nghi of this qlvt xu ly gp lien van phuong tien tram dung nghi
	*/
	@Override
	public void setMaTramDungNghi(java.lang.String maTramDungNghi) {
		_qlvtXuLyGpLienVanPhuongTienTramDungNghi.setMaTramDungNghi(maTramDungNghi);
	}

	@Override
	public boolean isNew() {
		return _qlvtXuLyGpLienVanPhuongTienTramDungNghi.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtXuLyGpLienVanPhuongTienTramDungNghi.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtXuLyGpLienVanPhuongTienTramDungNghi.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtXuLyGpLienVanPhuongTienTramDungNghi.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtXuLyGpLienVanPhuongTienTramDungNghi.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtXuLyGpLienVanPhuongTienTramDungNghi.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtXuLyGpLienVanPhuongTienTramDungNghi.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtXuLyGpLienVanPhuongTienTramDungNghi.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtXuLyGpLienVanPhuongTienTramDungNghi.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtXuLyGpLienVanPhuongTienTramDungNghi.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtXuLyGpLienVanPhuongTienTramDungNghi.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtXuLyGpLienVanPhuongTienTramDungNghiWrapper((QlvtXuLyGpLienVanPhuongTienTramDungNghi)_qlvtXuLyGpLienVanPhuongTienTramDungNghi.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi qlvtXuLyGpLienVanPhuongTienTramDungNghi) {
		return _qlvtXuLyGpLienVanPhuongTienTramDungNghi.compareTo(qlvtXuLyGpLienVanPhuongTienTramDungNghi);
	}

	@Override
	public int hashCode() {
		return _qlvtXuLyGpLienVanPhuongTienTramDungNghi.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi> toCacheModel() {
		return _qlvtXuLyGpLienVanPhuongTienTramDungNghi.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi toEscapedModel() {
		return new QlvtXuLyGpLienVanPhuongTienTramDungNghiWrapper(_qlvtXuLyGpLienVanPhuongTienTramDungNghi.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi toUnescapedModel() {
		return new QlvtXuLyGpLienVanPhuongTienTramDungNghiWrapper(_qlvtXuLyGpLienVanPhuongTienTramDungNghi.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtXuLyGpLienVanPhuongTienTramDungNghi.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtXuLyGpLienVanPhuongTienTramDungNghi.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtXuLyGpLienVanPhuongTienTramDungNghi.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtXuLyGpLienVanPhuongTienTramDungNghiWrapper)) {
			return false;
		}

		QlvtXuLyGpLienVanPhuongTienTramDungNghiWrapper qlvtXuLyGpLienVanPhuongTienTramDungNghiWrapper =
			(QlvtXuLyGpLienVanPhuongTienTramDungNghiWrapper)obj;

		if (Validator.equals(_qlvtXuLyGpLienVanPhuongTienTramDungNghi,
					qlvtXuLyGpLienVanPhuongTienTramDungNghiWrapper._qlvtXuLyGpLienVanPhuongTienTramDungNghi)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtXuLyGpLienVanPhuongTienTramDungNghi getWrappedQlvtXuLyGpLienVanPhuongTienTramDungNghi() {
		return _qlvtXuLyGpLienVanPhuongTienTramDungNghi;
	}

	@Override
	public QlvtXuLyGpLienVanPhuongTienTramDungNghi getWrappedModel() {
		return _qlvtXuLyGpLienVanPhuongTienTramDungNghi;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtXuLyGpLienVanPhuongTienTramDungNghi.resetOriginalValues();
	}

	private QlvtXuLyGpLienVanPhuongTienTramDungNghi _qlvtXuLyGpLienVanPhuongTienTramDungNghi;
}