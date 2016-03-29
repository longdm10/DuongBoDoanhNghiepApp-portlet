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
 * This class is a wrapper for {@link QLVTCapPhepBienHieuPhuongTien}.
 * </p>
 *
 * @author binhta
 * @see QLVTCapPhepBienHieuPhuongTien
 * @generated
 */
public class QLVTCapPhepBienHieuPhuongTienWrapper
	implements QLVTCapPhepBienHieuPhuongTien,
		ModelWrapper<QLVTCapPhepBienHieuPhuongTien> {
	public QLVTCapPhepBienHieuPhuongTienWrapper(
		QLVTCapPhepBienHieuPhuongTien qlvtCapPhepBienHieuPhuongTien) {
		_qlvtCapPhepBienHieuPhuongTien = qlvtCapPhepBienHieuPhuongTien;
	}

	@Override
	public Class<?> getModelClass() {
		return QLVTCapPhepBienHieuPhuongTien.class;
	}

	@Override
	public String getModelClassName() {
		return QLVTCapPhepBienHieuPhuongTien.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("qlvtCapHepBienHieuId", getQlvtCapHepBienHieuId());
		attributes.put("qlvtPhuongTienVanTaiId", getQlvtPhuongTienVanTaiId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer qlvtCapHepBienHieuId = (Integer)attributes.get(
				"qlvtCapHepBienHieuId");

		if (qlvtCapHepBienHieuId != null) {
			setQlvtCapHepBienHieuId(qlvtCapHepBienHieuId);
		}

		Integer qlvtPhuongTienVanTaiId = (Integer)attributes.get(
				"qlvtPhuongTienVanTaiId");

		if (qlvtPhuongTienVanTaiId != null) {
			setQlvtPhuongTienVanTaiId(qlvtPhuongTienVanTaiId);
		}
	}

	/**
	* Returns the primary key of this q l v t cap phep bien hieu phuong tien.
	*
	* @return the primary key of this q l v t cap phep bien hieu phuong tien
	*/
	@Override
	public int getPrimaryKey() {
		return _qlvtCapPhepBienHieuPhuongTien.getPrimaryKey();
	}

	/**
	* Sets the primary key of this q l v t cap phep bien hieu phuong tien.
	*
	* @param primaryKey the primary key of this q l v t cap phep bien hieu phuong tien
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_qlvtCapPhepBienHieuPhuongTien.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this q l v t cap phep bien hieu phuong tien.
	*
	* @return the ID of this q l v t cap phep bien hieu phuong tien
	*/
	@Override
	public int getId() {
		return _qlvtCapPhepBienHieuPhuongTien.getId();
	}

	/**
	* Sets the ID of this q l v t cap phep bien hieu phuong tien.
	*
	* @param id the ID of this q l v t cap phep bien hieu phuong tien
	*/
	@Override
	public void setId(int id) {
		_qlvtCapPhepBienHieuPhuongTien.setId(id);
	}

	/**
	* Returns the qlvt cap hep bien hieu ID of this q l v t cap phep bien hieu phuong tien.
	*
	* @return the qlvt cap hep bien hieu ID of this q l v t cap phep bien hieu phuong tien
	*/
	@Override
	public int getQlvtCapHepBienHieuId() {
		return _qlvtCapPhepBienHieuPhuongTien.getQlvtCapHepBienHieuId();
	}

	/**
	* Sets the qlvt cap hep bien hieu ID of this q l v t cap phep bien hieu phuong tien.
	*
	* @param qlvtCapHepBienHieuId the qlvt cap hep bien hieu ID of this q l v t cap phep bien hieu phuong tien
	*/
	@Override
	public void setQlvtCapHepBienHieuId(int qlvtCapHepBienHieuId) {
		_qlvtCapPhepBienHieuPhuongTien.setQlvtCapHepBienHieuId(qlvtCapHepBienHieuId);
	}

	/**
	* Returns the qlvt phuong tien van tai ID of this q l v t cap phep bien hieu phuong tien.
	*
	* @return the qlvt phuong tien van tai ID of this q l v t cap phep bien hieu phuong tien
	*/
	@Override
	public int getQlvtPhuongTienVanTaiId() {
		return _qlvtCapPhepBienHieuPhuongTien.getQlvtPhuongTienVanTaiId();
	}

	/**
	* Sets the qlvt phuong tien van tai ID of this q l v t cap phep bien hieu phuong tien.
	*
	* @param qlvtPhuongTienVanTaiId the qlvt phuong tien van tai ID of this q l v t cap phep bien hieu phuong tien
	*/
	@Override
	public void setQlvtPhuongTienVanTaiId(int qlvtPhuongTienVanTaiId) {
		_qlvtCapPhepBienHieuPhuongTien.setQlvtPhuongTienVanTaiId(qlvtPhuongTienVanTaiId);
	}

	@Override
	public boolean isNew() {
		return _qlvtCapPhepBienHieuPhuongTien.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtCapPhepBienHieuPhuongTien.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtCapPhepBienHieuPhuongTien.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtCapPhepBienHieuPhuongTien.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtCapPhepBienHieuPhuongTien.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtCapPhepBienHieuPhuongTien.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtCapPhepBienHieuPhuongTien.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtCapPhepBienHieuPhuongTien.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtCapPhepBienHieuPhuongTien.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtCapPhepBienHieuPhuongTien.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtCapPhepBienHieuPhuongTien.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QLVTCapPhepBienHieuPhuongTienWrapper((QLVTCapPhepBienHieuPhuongTien)_qlvtCapPhepBienHieuPhuongTien.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepBienHieuPhuongTien qlvtCapPhepBienHieuPhuongTien) {
		return _qlvtCapPhepBienHieuPhuongTien.compareTo(qlvtCapPhepBienHieuPhuongTien);
	}

	@Override
	public int hashCode() {
		return _qlvtCapPhepBienHieuPhuongTien.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepBienHieuPhuongTien> toCacheModel() {
		return _qlvtCapPhepBienHieuPhuongTien.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepBienHieuPhuongTien toEscapedModel() {
		return new QLVTCapPhepBienHieuPhuongTienWrapper(_qlvtCapPhepBienHieuPhuongTien.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepBienHieuPhuongTien toUnescapedModel() {
		return new QLVTCapPhepBienHieuPhuongTienWrapper(_qlvtCapPhepBienHieuPhuongTien.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtCapPhepBienHieuPhuongTien.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtCapPhepBienHieuPhuongTien.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtCapPhepBienHieuPhuongTien.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QLVTCapPhepBienHieuPhuongTienWrapper)) {
			return false;
		}

		QLVTCapPhepBienHieuPhuongTienWrapper qlvtCapPhepBienHieuPhuongTienWrapper =
			(QLVTCapPhepBienHieuPhuongTienWrapper)obj;

		if (Validator.equals(_qlvtCapPhepBienHieuPhuongTien,
					qlvtCapPhepBienHieuPhuongTienWrapper._qlvtCapPhepBienHieuPhuongTien)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QLVTCapPhepBienHieuPhuongTien getWrappedQLVTCapPhepBienHieuPhuongTien() {
		return _qlvtCapPhepBienHieuPhuongTien;
	}

	@Override
	public QLVTCapPhepBienHieuPhuongTien getWrappedModel() {
		return _qlvtCapPhepBienHieuPhuongTien;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtCapPhepBienHieuPhuongTien.resetOriginalValues();
	}

	private QLVTCapPhepBienHieuPhuongTien _qlvtCapPhepBienHieuPhuongTien;
}