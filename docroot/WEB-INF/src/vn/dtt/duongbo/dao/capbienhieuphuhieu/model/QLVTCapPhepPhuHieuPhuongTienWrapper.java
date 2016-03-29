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

package vn.dtt.duongbo.dao.capbienhieuphuhieu.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link QLVTCapPhepPhuHieuPhuongTien}.
 * </p>
 *
 * @author binhta
 * @see QLVTCapPhepPhuHieuPhuongTien
 * @generated
 */
public class QLVTCapPhepPhuHieuPhuongTienWrapper
	implements QLVTCapPhepPhuHieuPhuongTien,
		ModelWrapper<QLVTCapPhepPhuHieuPhuongTien> {
	public QLVTCapPhepPhuHieuPhuongTienWrapper(
		QLVTCapPhepPhuHieuPhuongTien qlvtCapPhepPhuHieuPhuongTien) {
		_qlvtCapPhepPhuHieuPhuongTien = qlvtCapPhepPhuHieuPhuongTien;
	}

	@Override
	public Class<?> getModelClass() {
		return QLVTCapPhepPhuHieuPhuongTien.class;
	}

	@Override
	public String getModelClassName() {
		return QLVTCapPhepPhuHieuPhuongTien.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("qlvtCapPhepPhuHieuXeId", getQlvtCapPhepPhuHieuXeId());
		attributes.put("qlvtPhuongTienVanTaiId", getQlvtPhuongTienVanTaiId());
		attributes.put("trangThai", getTrangThai());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer qlvtCapPhepPhuHieuXeId = (Integer)attributes.get(
				"qlvtCapPhepPhuHieuXeId");

		if (qlvtCapPhepPhuHieuXeId != null) {
			setQlvtCapPhepPhuHieuXeId(qlvtCapPhepPhuHieuXeId);
		}

		Integer qlvtPhuongTienVanTaiId = (Integer)attributes.get(
				"qlvtPhuongTienVanTaiId");

		if (qlvtPhuongTienVanTaiId != null) {
			setQlvtPhuongTienVanTaiId(qlvtPhuongTienVanTaiId);
		}

		String trangThai = (String)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}
	}

	/**
	* Returns the primary key of this q l v t cap phep phu hieu phuong tien.
	*
	* @return the primary key of this q l v t cap phep phu hieu phuong tien
	*/
	@Override
	public int getPrimaryKey() {
		return _qlvtCapPhepPhuHieuPhuongTien.getPrimaryKey();
	}

	/**
	* Sets the primary key of this q l v t cap phep phu hieu phuong tien.
	*
	* @param primaryKey the primary key of this q l v t cap phep phu hieu phuong tien
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_qlvtCapPhepPhuHieuPhuongTien.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this q l v t cap phep phu hieu phuong tien.
	*
	* @return the ID of this q l v t cap phep phu hieu phuong tien
	*/
	@Override
	public int getId() {
		return _qlvtCapPhepPhuHieuPhuongTien.getId();
	}

	/**
	* Sets the ID of this q l v t cap phep phu hieu phuong tien.
	*
	* @param id the ID of this q l v t cap phep phu hieu phuong tien
	*/
	@Override
	public void setId(int id) {
		_qlvtCapPhepPhuHieuPhuongTien.setId(id);
	}

	/**
	* Returns the qlvt cap phep phu hieu xe ID of this q l v t cap phep phu hieu phuong tien.
	*
	* @return the qlvt cap phep phu hieu xe ID of this q l v t cap phep phu hieu phuong tien
	*/
	@Override
	public int getQlvtCapPhepPhuHieuXeId() {
		return _qlvtCapPhepPhuHieuPhuongTien.getQlvtCapPhepPhuHieuXeId();
	}

	/**
	* Sets the qlvt cap phep phu hieu xe ID of this q l v t cap phep phu hieu phuong tien.
	*
	* @param qlvtCapPhepPhuHieuXeId the qlvt cap phep phu hieu xe ID of this q l v t cap phep phu hieu phuong tien
	*/
	@Override
	public void setQlvtCapPhepPhuHieuXeId(int qlvtCapPhepPhuHieuXeId) {
		_qlvtCapPhepPhuHieuPhuongTien.setQlvtCapPhepPhuHieuXeId(qlvtCapPhepPhuHieuXeId);
	}

	/**
	* Returns the qlvt phuong tien van tai ID of this q l v t cap phep phu hieu phuong tien.
	*
	* @return the qlvt phuong tien van tai ID of this q l v t cap phep phu hieu phuong tien
	*/
	@Override
	public int getQlvtPhuongTienVanTaiId() {
		return _qlvtCapPhepPhuHieuPhuongTien.getQlvtPhuongTienVanTaiId();
	}

	/**
	* Sets the qlvt phuong tien van tai ID of this q l v t cap phep phu hieu phuong tien.
	*
	* @param qlvtPhuongTienVanTaiId the qlvt phuong tien van tai ID of this q l v t cap phep phu hieu phuong tien
	*/
	@Override
	public void setQlvtPhuongTienVanTaiId(int qlvtPhuongTienVanTaiId) {
		_qlvtCapPhepPhuHieuPhuongTien.setQlvtPhuongTienVanTaiId(qlvtPhuongTienVanTaiId);
	}

	/**
	* Returns the trang thai of this q l v t cap phep phu hieu phuong tien.
	*
	* @return the trang thai of this q l v t cap phep phu hieu phuong tien
	*/
	@Override
	public java.lang.String getTrangThai() {
		return _qlvtCapPhepPhuHieuPhuongTien.getTrangThai();
	}

	/**
	* Sets the trang thai of this q l v t cap phep phu hieu phuong tien.
	*
	* @param trangThai the trang thai of this q l v t cap phep phu hieu phuong tien
	*/
	@Override
	public void setTrangThai(java.lang.String trangThai) {
		_qlvtCapPhepPhuHieuPhuongTien.setTrangThai(trangThai);
	}

	@Override
	public boolean isNew() {
		return _qlvtCapPhepPhuHieuPhuongTien.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtCapPhepPhuHieuPhuongTien.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtCapPhepPhuHieuPhuongTien.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtCapPhepPhuHieuPhuongTien.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtCapPhepPhuHieuPhuongTien.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtCapPhepPhuHieuPhuongTien.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtCapPhepPhuHieuPhuongTien.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtCapPhepPhuHieuPhuongTien.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtCapPhepPhuHieuPhuongTien.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtCapPhepPhuHieuPhuongTien.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtCapPhepPhuHieuPhuongTien.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QLVTCapPhepPhuHieuPhuongTienWrapper((QLVTCapPhepPhuHieuPhuongTien)_qlvtCapPhepPhuHieuPhuongTien.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepPhuHieuPhuongTien qlvtCapPhepPhuHieuPhuongTien) {
		return _qlvtCapPhepPhuHieuPhuongTien.compareTo(qlvtCapPhepPhuHieuPhuongTien);
	}

	@Override
	public int hashCode() {
		return _qlvtCapPhepPhuHieuPhuongTien.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepPhuHieuPhuongTien> toCacheModel() {
		return _qlvtCapPhepPhuHieuPhuongTien.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepPhuHieuPhuongTien toEscapedModel() {
		return new QLVTCapPhepPhuHieuPhuongTienWrapper(_qlvtCapPhepPhuHieuPhuongTien.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepPhuHieuPhuongTien toUnescapedModel() {
		return new QLVTCapPhepPhuHieuPhuongTienWrapper(_qlvtCapPhepPhuHieuPhuongTien.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtCapPhepPhuHieuPhuongTien.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtCapPhepPhuHieuPhuongTien.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtCapPhepPhuHieuPhuongTien.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QLVTCapPhepPhuHieuPhuongTienWrapper)) {
			return false;
		}

		QLVTCapPhepPhuHieuPhuongTienWrapper qlvtCapPhepPhuHieuPhuongTienWrapper = (QLVTCapPhepPhuHieuPhuongTienWrapper)obj;

		if (Validator.equals(_qlvtCapPhepPhuHieuPhuongTien,
					qlvtCapPhepPhuHieuPhuongTienWrapper._qlvtCapPhepPhuHieuPhuongTien)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QLVTCapPhepPhuHieuPhuongTien getWrappedQLVTCapPhepPhuHieuPhuongTien() {
		return _qlvtCapPhepPhuHieuPhuongTien;
	}

	@Override
	public QLVTCapPhepPhuHieuPhuongTien getWrappedModel() {
		return _qlvtCapPhepPhuHieuPhuongTien;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtCapPhepPhuHieuPhuongTien.resetOriginalValues();
	}

	private QLVTCapPhepPhuHieuPhuongTien _qlvtCapPhepPhuHieuPhuongTien;
}