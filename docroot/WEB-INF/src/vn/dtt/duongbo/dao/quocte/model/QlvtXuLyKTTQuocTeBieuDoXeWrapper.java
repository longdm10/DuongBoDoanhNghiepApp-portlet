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
 * This class is a wrapper for {@link QlvtXuLyKTTQuocTeBieuDoXe}.
 * </p>
 *
 * @author NoiPham
 * @see QlvtXuLyKTTQuocTeBieuDoXe
 * @generated
 */
public class QlvtXuLyKTTQuocTeBieuDoXeWrapper
	implements QlvtXuLyKTTQuocTeBieuDoXe,
		ModelWrapper<QlvtXuLyKTTQuocTeBieuDoXe> {
	public QlvtXuLyKTTQuocTeBieuDoXeWrapper(
		QlvtXuLyKTTQuocTeBieuDoXe qlvtXuLyKTTQuocTeBieuDoXe) {
		_qlvtXuLyKTTQuocTeBieuDoXe = qlvtXuLyKTTQuocTeBieuDoXe;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtXuLyKTTQuocTeBieuDoXe.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtXuLyKTTQuocTeBieuDoXe.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("kttQuocTeId", getKttQuocTeId());
		attributes.put("loaiLuot", getLoaiLuot());
		attributes.put("soThuTuLuot", getSoThuTuLuot());
		attributes.put("maBen", getMaBen());
		attributes.put("gioXuatBen", getGioXuatBen());
		attributes.put("phuXuatBen", getPhuXuatBen());
		attributes.put("tanXuat", getTanXuat());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer kttQuocTeId = (Integer)attributes.get("kttQuocTeId");

		if (kttQuocTeId != null) {
			setKttQuocTeId(kttQuocTeId);
		}

		String loaiLuot = (String)attributes.get("loaiLuot");

		if (loaiLuot != null) {
			setLoaiLuot(loaiLuot);
		}

		Integer soThuTuLuot = (Integer)attributes.get("soThuTuLuot");

		if (soThuTuLuot != null) {
			setSoThuTuLuot(soThuTuLuot);
		}

		String maBen = (String)attributes.get("maBen");

		if (maBen != null) {
			setMaBen(maBen);
		}

		Integer gioXuatBen = (Integer)attributes.get("gioXuatBen");

		if (gioXuatBen != null) {
			setGioXuatBen(gioXuatBen);
		}

		Integer phuXuatBen = (Integer)attributes.get("phuXuatBen");

		if (phuXuatBen != null) {
			setPhuXuatBen(phuXuatBen);
		}

		Integer tanXuat = (Integer)attributes.get("tanXuat");

		if (tanXuat != null) {
			setTanXuat(tanXuat);
		}
	}

	/**
	* Returns the primary key of this qlvt xu ly k t t quoc te bieu do xe.
	*
	* @return the primary key of this qlvt xu ly k t t quoc te bieu do xe
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtXuLyKTTQuocTeBieuDoXe.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt xu ly k t t quoc te bieu do xe.
	*
	* @param primaryKey the primary key of this qlvt xu ly k t t quoc te bieu do xe
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtXuLyKTTQuocTeBieuDoXe.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt xu ly k t t quoc te bieu do xe.
	*
	* @return the ID of this qlvt xu ly k t t quoc te bieu do xe
	*/
	@Override
	public long getId() {
		return _qlvtXuLyKTTQuocTeBieuDoXe.getId();
	}

	/**
	* Sets the ID of this qlvt xu ly k t t quoc te bieu do xe.
	*
	* @param id the ID of this qlvt xu ly k t t quoc te bieu do xe
	*/
	@Override
	public void setId(long id) {
		_qlvtXuLyKTTQuocTeBieuDoXe.setId(id);
	}

	/**
	* Returns the ktt quoc te ID of this qlvt xu ly k t t quoc te bieu do xe.
	*
	* @return the ktt quoc te ID of this qlvt xu ly k t t quoc te bieu do xe
	*/
	@Override
	public int getKttQuocTeId() {
		return _qlvtXuLyKTTQuocTeBieuDoXe.getKttQuocTeId();
	}

	/**
	* Sets the ktt quoc te ID of this qlvt xu ly k t t quoc te bieu do xe.
	*
	* @param kttQuocTeId the ktt quoc te ID of this qlvt xu ly k t t quoc te bieu do xe
	*/
	@Override
	public void setKttQuocTeId(int kttQuocTeId) {
		_qlvtXuLyKTTQuocTeBieuDoXe.setKttQuocTeId(kttQuocTeId);
	}

	/**
	* Returns the loai luot of this qlvt xu ly k t t quoc te bieu do xe.
	*
	* @return the loai luot of this qlvt xu ly k t t quoc te bieu do xe
	*/
	@Override
	public java.lang.String getLoaiLuot() {
		return _qlvtXuLyKTTQuocTeBieuDoXe.getLoaiLuot();
	}

	/**
	* Sets the loai luot of this qlvt xu ly k t t quoc te bieu do xe.
	*
	* @param loaiLuot the loai luot of this qlvt xu ly k t t quoc te bieu do xe
	*/
	@Override
	public void setLoaiLuot(java.lang.String loaiLuot) {
		_qlvtXuLyKTTQuocTeBieuDoXe.setLoaiLuot(loaiLuot);
	}

	/**
	* Returns the so thu tu luot of this qlvt xu ly k t t quoc te bieu do xe.
	*
	* @return the so thu tu luot of this qlvt xu ly k t t quoc te bieu do xe
	*/
	@Override
	public int getSoThuTuLuot() {
		return _qlvtXuLyKTTQuocTeBieuDoXe.getSoThuTuLuot();
	}

	/**
	* Sets the so thu tu luot of this qlvt xu ly k t t quoc te bieu do xe.
	*
	* @param soThuTuLuot the so thu tu luot of this qlvt xu ly k t t quoc te bieu do xe
	*/
	@Override
	public void setSoThuTuLuot(int soThuTuLuot) {
		_qlvtXuLyKTTQuocTeBieuDoXe.setSoThuTuLuot(soThuTuLuot);
	}

	/**
	* Returns the ma ben of this qlvt xu ly k t t quoc te bieu do xe.
	*
	* @return the ma ben of this qlvt xu ly k t t quoc te bieu do xe
	*/
	@Override
	public java.lang.String getMaBen() {
		return _qlvtXuLyKTTQuocTeBieuDoXe.getMaBen();
	}

	/**
	* Sets the ma ben of this qlvt xu ly k t t quoc te bieu do xe.
	*
	* @param maBen the ma ben of this qlvt xu ly k t t quoc te bieu do xe
	*/
	@Override
	public void setMaBen(java.lang.String maBen) {
		_qlvtXuLyKTTQuocTeBieuDoXe.setMaBen(maBen);
	}

	/**
	* Returns the gio xuat ben of this qlvt xu ly k t t quoc te bieu do xe.
	*
	* @return the gio xuat ben of this qlvt xu ly k t t quoc te bieu do xe
	*/
	@Override
	public int getGioXuatBen() {
		return _qlvtXuLyKTTQuocTeBieuDoXe.getGioXuatBen();
	}

	/**
	* Sets the gio xuat ben of this qlvt xu ly k t t quoc te bieu do xe.
	*
	* @param gioXuatBen the gio xuat ben of this qlvt xu ly k t t quoc te bieu do xe
	*/
	@Override
	public void setGioXuatBen(int gioXuatBen) {
		_qlvtXuLyKTTQuocTeBieuDoXe.setGioXuatBen(gioXuatBen);
	}

	/**
	* Returns the phu xuat ben of this qlvt xu ly k t t quoc te bieu do xe.
	*
	* @return the phu xuat ben of this qlvt xu ly k t t quoc te bieu do xe
	*/
	@Override
	public int getPhuXuatBen() {
		return _qlvtXuLyKTTQuocTeBieuDoXe.getPhuXuatBen();
	}

	/**
	* Sets the phu xuat ben of this qlvt xu ly k t t quoc te bieu do xe.
	*
	* @param phuXuatBen the phu xuat ben of this qlvt xu ly k t t quoc te bieu do xe
	*/
	@Override
	public void setPhuXuatBen(int phuXuatBen) {
		_qlvtXuLyKTTQuocTeBieuDoXe.setPhuXuatBen(phuXuatBen);
	}

	/**
	* Returns the tan xuat of this qlvt xu ly k t t quoc te bieu do xe.
	*
	* @return the tan xuat of this qlvt xu ly k t t quoc te bieu do xe
	*/
	@Override
	public int getTanXuat() {
		return _qlvtXuLyKTTQuocTeBieuDoXe.getTanXuat();
	}

	/**
	* Sets the tan xuat of this qlvt xu ly k t t quoc te bieu do xe.
	*
	* @param tanXuat the tan xuat of this qlvt xu ly k t t quoc te bieu do xe
	*/
	@Override
	public void setTanXuat(int tanXuat) {
		_qlvtXuLyKTTQuocTeBieuDoXe.setTanXuat(tanXuat);
	}

	@Override
	public boolean isNew() {
		return _qlvtXuLyKTTQuocTeBieuDoXe.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtXuLyKTTQuocTeBieuDoXe.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtXuLyKTTQuocTeBieuDoXe.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtXuLyKTTQuocTeBieuDoXe.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtXuLyKTTQuocTeBieuDoXe.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtXuLyKTTQuocTeBieuDoXe.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtXuLyKTTQuocTeBieuDoXe.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtXuLyKTTQuocTeBieuDoXe.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtXuLyKTTQuocTeBieuDoXe.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtXuLyKTTQuocTeBieuDoXe.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtXuLyKTTQuocTeBieuDoXe.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtXuLyKTTQuocTeBieuDoXeWrapper((QlvtXuLyKTTQuocTeBieuDoXe)_qlvtXuLyKTTQuocTeBieuDoXe.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXe qlvtXuLyKTTQuocTeBieuDoXe) {
		return _qlvtXuLyKTTQuocTeBieuDoXe.compareTo(qlvtXuLyKTTQuocTeBieuDoXe);
	}

	@Override
	public int hashCode() {
		return _qlvtXuLyKTTQuocTeBieuDoXe.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXe> toCacheModel() {
		return _qlvtXuLyKTTQuocTeBieuDoXe.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXe toEscapedModel() {
		return new QlvtXuLyKTTQuocTeBieuDoXeWrapper(_qlvtXuLyKTTQuocTeBieuDoXe.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXe toUnescapedModel() {
		return new QlvtXuLyKTTQuocTeBieuDoXeWrapper(_qlvtXuLyKTTQuocTeBieuDoXe.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtXuLyKTTQuocTeBieuDoXe.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtXuLyKTTQuocTeBieuDoXe.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtXuLyKTTQuocTeBieuDoXe.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtXuLyKTTQuocTeBieuDoXeWrapper)) {
			return false;
		}

		QlvtXuLyKTTQuocTeBieuDoXeWrapper qlvtXuLyKTTQuocTeBieuDoXeWrapper = (QlvtXuLyKTTQuocTeBieuDoXeWrapper)obj;

		if (Validator.equals(_qlvtXuLyKTTQuocTeBieuDoXe,
					qlvtXuLyKTTQuocTeBieuDoXeWrapper._qlvtXuLyKTTQuocTeBieuDoXe)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtXuLyKTTQuocTeBieuDoXe getWrappedQlvtXuLyKTTQuocTeBieuDoXe() {
		return _qlvtXuLyKTTQuocTeBieuDoXe;
	}

	@Override
	public QlvtXuLyKTTQuocTeBieuDoXe getWrappedModel() {
		return _qlvtXuLyKTTQuocTeBieuDoXe;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtXuLyKTTQuocTeBieuDoXe.resetOriginalValues();
	}

	private QlvtXuLyKTTQuocTeBieuDoXe _qlvtXuLyKTTQuocTeBieuDoXe;
}