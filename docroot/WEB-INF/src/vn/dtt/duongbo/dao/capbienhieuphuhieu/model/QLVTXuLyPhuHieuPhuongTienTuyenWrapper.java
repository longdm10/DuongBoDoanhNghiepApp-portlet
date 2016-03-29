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
 * This class is a wrapper for {@link QLVTXuLyPhuHieuPhuongTienTuyen}.
 * </p>
 *
 * @author binhta
 * @see QLVTXuLyPhuHieuPhuongTienTuyen
 * @generated
 */
public class QLVTXuLyPhuHieuPhuongTienTuyenWrapper
	implements QLVTXuLyPhuHieuPhuongTienTuyen,
		ModelWrapper<QLVTXuLyPhuHieuPhuongTienTuyen> {
	public QLVTXuLyPhuHieuPhuongTienTuyenWrapper(
		QLVTXuLyPhuHieuPhuongTienTuyen qlvtXuLyPhuHieuPhuongTienTuyen) {
		_qlvtXuLyPhuHieuPhuongTienTuyen = qlvtXuLyPhuHieuPhuongTienTuyen;
	}

	@Override
	public Class<?> getModelClass() {
		return QLVTXuLyPhuHieuPhuongTienTuyen.class;
	}

	@Override
	public String getModelClassName() {
		return QLVTXuLyPhuHieuPhuongTienTuyen.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("ptCapPhuHieuId", getPtCapPhuHieuId());
		attributes.put("maTuyen", getMaTuyen());
		attributes.put("tenTuyen", getTenTuyen());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer ptCapPhuHieuId = (Integer)attributes.get("ptCapPhuHieuId");

		if (ptCapPhuHieuId != null) {
			setPtCapPhuHieuId(ptCapPhuHieuId);
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
	* Returns the primary key of this q l v t xu ly phu hieu phuong tien tuyen.
	*
	* @return the primary key of this q l v t xu ly phu hieu phuong tien tuyen
	*/
	@Override
	public int getPrimaryKey() {
		return _qlvtXuLyPhuHieuPhuongTienTuyen.getPrimaryKey();
	}

	/**
	* Sets the primary key of this q l v t xu ly phu hieu phuong tien tuyen.
	*
	* @param primaryKey the primary key of this q l v t xu ly phu hieu phuong tien tuyen
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_qlvtXuLyPhuHieuPhuongTienTuyen.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this q l v t xu ly phu hieu phuong tien tuyen.
	*
	* @return the ID of this q l v t xu ly phu hieu phuong tien tuyen
	*/
	@Override
	public int getId() {
		return _qlvtXuLyPhuHieuPhuongTienTuyen.getId();
	}

	/**
	* Sets the ID of this q l v t xu ly phu hieu phuong tien tuyen.
	*
	* @param id the ID of this q l v t xu ly phu hieu phuong tien tuyen
	*/
	@Override
	public void setId(int id) {
		_qlvtXuLyPhuHieuPhuongTienTuyen.setId(id);
	}

	/**
	* Returns the pt cap phu hieu ID of this q l v t xu ly phu hieu phuong tien tuyen.
	*
	* @return the pt cap phu hieu ID of this q l v t xu ly phu hieu phuong tien tuyen
	*/
	@Override
	public int getPtCapPhuHieuId() {
		return _qlvtXuLyPhuHieuPhuongTienTuyen.getPtCapPhuHieuId();
	}

	/**
	* Sets the pt cap phu hieu ID of this q l v t xu ly phu hieu phuong tien tuyen.
	*
	* @param ptCapPhuHieuId the pt cap phu hieu ID of this q l v t xu ly phu hieu phuong tien tuyen
	*/
	@Override
	public void setPtCapPhuHieuId(int ptCapPhuHieuId) {
		_qlvtXuLyPhuHieuPhuongTienTuyen.setPtCapPhuHieuId(ptCapPhuHieuId);
	}

	/**
	* Returns the ma tuyen of this q l v t xu ly phu hieu phuong tien tuyen.
	*
	* @return the ma tuyen of this q l v t xu ly phu hieu phuong tien tuyen
	*/
	@Override
	public java.lang.String getMaTuyen() {
		return _qlvtXuLyPhuHieuPhuongTienTuyen.getMaTuyen();
	}

	/**
	* Sets the ma tuyen of this q l v t xu ly phu hieu phuong tien tuyen.
	*
	* @param maTuyen the ma tuyen of this q l v t xu ly phu hieu phuong tien tuyen
	*/
	@Override
	public void setMaTuyen(java.lang.String maTuyen) {
		_qlvtXuLyPhuHieuPhuongTienTuyen.setMaTuyen(maTuyen);
	}

	/**
	* Returns the ten tuyen of this q l v t xu ly phu hieu phuong tien tuyen.
	*
	* @return the ten tuyen of this q l v t xu ly phu hieu phuong tien tuyen
	*/
	@Override
	public java.lang.String getTenTuyen() {
		return _qlvtXuLyPhuHieuPhuongTienTuyen.getTenTuyen();
	}

	/**
	* Sets the ten tuyen of this q l v t xu ly phu hieu phuong tien tuyen.
	*
	* @param tenTuyen the ten tuyen of this q l v t xu ly phu hieu phuong tien tuyen
	*/
	@Override
	public void setTenTuyen(java.lang.String tenTuyen) {
		_qlvtXuLyPhuHieuPhuongTienTuyen.setTenTuyen(tenTuyen);
	}

	@Override
	public boolean isNew() {
		return _qlvtXuLyPhuHieuPhuongTienTuyen.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtXuLyPhuHieuPhuongTienTuyen.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtXuLyPhuHieuPhuongTienTuyen.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtXuLyPhuHieuPhuongTienTuyen.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtXuLyPhuHieuPhuongTienTuyen.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtXuLyPhuHieuPhuongTienTuyen.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtXuLyPhuHieuPhuongTienTuyen.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtXuLyPhuHieuPhuongTienTuyen.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtXuLyPhuHieuPhuongTienTuyen.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtXuLyPhuHieuPhuongTienTuyen.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtXuLyPhuHieuPhuongTienTuyen.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QLVTXuLyPhuHieuPhuongTienTuyenWrapper((QLVTXuLyPhuHieuPhuongTienTuyen)_qlvtXuLyPhuHieuPhuongTienTuyen.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTienTuyen qlvtXuLyPhuHieuPhuongTienTuyen) {
		return _qlvtXuLyPhuHieuPhuongTienTuyen.compareTo(qlvtXuLyPhuHieuPhuongTienTuyen);
	}

	@Override
	public int hashCode() {
		return _qlvtXuLyPhuHieuPhuongTienTuyen.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTienTuyen> toCacheModel() {
		return _qlvtXuLyPhuHieuPhuongTienTuyen.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTienTuyen toEscapedModel() {
		return new QLVTXuLyPhuHieuPhuongTienTuyenWrapper(_qlvtXuLyPhuHieuPhuongTienTuyen.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTienTuyen toUnescapedModel() {
		return new QLVTXuLyPhuHieuPhuongTienTuyenWrapper(_qlvtXuLyPhuHieuPhuongTienTuyen.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtXuLyPhuHieuPhuongTienTuyen.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtXuLyPhuHieuPhuongTienTuyen.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtXuLyPhuHieuPhuongTienTuyen.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QLVTXuLyPhuHieuPhuongTienTuyenWrapper)) {
			return false;
		}

		QLVTXuLyPhuHieuPhuongTienTuyenWrapper qlvtXuLyPhuHieuPhuongTienTuyenWrapper =
			(QLVTXuLyPhuHieuPhuongTienTuyenWrapper)obj;

		if (Validator.equals(_qlvtXuLyPhuHieuPhuongTienTuyen,
					qlvtXuLyPhuHieuPhuongTienTuyenWrapper._qlvtXuLyPhuHieuPhuongTienTuyen)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QLVTXuLyPhuHieuPhuongTienTuyen getWrappedQLVTXuLyPhuHieuPhuongTienTuyen() {
		return _qlvtXuLyPhuHieuPhuongTienTuyen;
	}

	@Override
	public QLVTXuLyPhuHieuPhuongTienTuyen getWrappedModel() {
		return _qlvtXuLyPhuHieuPhuongTienTuyen;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtXuLyPhuHieuPhuongTienTuyen.resetOriginalValues();
	}

	private QLVTXuLyPhuHieuPhuongTienTuyen _qlvtXuLyPhuHieuPhuongTienTuyen;
}