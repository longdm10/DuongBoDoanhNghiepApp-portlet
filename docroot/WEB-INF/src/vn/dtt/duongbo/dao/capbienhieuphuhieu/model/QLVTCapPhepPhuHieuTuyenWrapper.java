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
 * This class is a wrapper for {@link QLVTCapPhepPhuHieuTuyen}.
 * </p>
 *
 * @author binhta
 * @see QLVTCapPhepPhuHieuTuyen
 * @generated
 */
public class QLVTCapPhepPhuHieuTuyenWrapper implements QLVTCapPhepPhuHieuTuyen,
	ModelWrapper<QLVTCapPhepPhuHieuTuyen> {
	public QLVTCapPhepPhuHieuTuyenWrapper(
		QLVTCapPhepPhuHieuTuyen qlvtCapPhepPhuHieuTuyen) {
		_qlvtCapPhepPhuHieuTuyen = qlvtCapPhepPhuHieuTuyen;
	}

	@Override
	public Class<?> getModelClass() {
		return QLVTCapPhepPhuHieuTuyen.class;
	}

	@Override
	public String getModelClassName() {
		return QLVTCapPhepPhuHieuTuyen.class.getName();
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
	* Returns the primary key of this q l v t cap phep phu hieu tuyen.
	*
	* @return the primary key of this q l v t cap phep phu hieu tuyen
	*/
	@Override
	public int getPrimaryKey() {
		return _qlvtCapPhepPhuHieuTuyen.getPrimaryKey();
	}

	/**
	* Sets the primary key of this q l v t cap phep phu hieu tuyen.
	*
	* @param primaryKey the primary key of this q l v t cap phep phu hieu tuyen
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_qlvtCapPhepPhuHieuTuyen.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this q l v t cap phep phu hieu tuyen.
	*
	* @return the ID of this q l v t cap phep phu hieu tuyen
	*/
	@Override
	public int getId() {
		return _qlvtCapPhepPhuHieuTuyen.getId();
	}

	/**
	* Sets the ID of this q l v t cap phep phu hieu tuyen.
	*
	* @param id the ID of this q l v t cap phep phu hieu tuyen
	*/
	@Override
	public void setId(int id) {
		_qlvtCapPhepPhuHieuTuyen.setId(id);
	}

	/**
	* Returns the pt cap phu hieu ID of this q l v t cap phep phu hieu tuyen.
	*
	* @return the pt cap phu hieu ID of this q l v t cap phep phu hieu tuyen
	*/
	@Override
	public int getPtCapPhuHieuId() {
		return _qlvtCapPhepPhuHieuTuyen.getPtCapPhuHieuId();
	}

	/**
	* Sets the pt cap phu hieu ID of this q l v t cap phep phu hieu tuyen.
	*
	* @param ptCapPhuHieuId the pt cap phu hieu ID of this q l v t cap phep phu hieu tuyen
	*/
	@Override
	public void setPtCapPhuHieuId(int ptCapPhuHieuId) {
		_qlvtCapPhepPhuHieuTuyen.setPtCapPhuHieuId(ptCapPhuHieuId);
	}

	/**
	* Returns the ma tuyen of this q l v t cap phep phu hieu tuyen.
	*
	* @return the ma tuyen of this q l v t cap phep phu hieu tuyen
	*/
	@Override
	public java.lang.String getMaTuyen() {
		return _qlvtCapPhepPhuHieuTuyen.getMaTuyen();
	}

	/**
	* Sets the ma tuyen of this q l v t cap phep phu hieu tuyen.
	*
	* @param maTuyen the ma tuyen of this q l v t cap phep phu hieu tuyen
	*/
	@Override
	public void setMaTuyen(java.lang.String maTuyen) {
		_qlvtCapPhepPhuHieuTuyen.setMaTuyen(maTuyen);
	}

	/**
	* Returns the ten tuyen of this q l v t cap phep phu hieu tuyen.
	*
	* @return the ten tuyen of this q l v t cap phep phu hieu tuyen
	*/
	@Override
	public java.lang.String getTenTuyen() {
		return _qlvtCapPhepPhuHieuTuyen.getTenTuyen();
	}

	/**
	* Sets the ten tuyen of this q l v t cap phep phu hieu tuyen.
	*
	* @param tenTuyen the ten tuyen of this q l v t cap phep phu hieu tuyen
	*/
	@Override
	public void setTenTuyen(java.lang.String tenTuyen) {
		_qlvtCapPhepPhuHieuTuyen.setTenTuyen(tenTuyen);
	}

	@Override
	public boolean isNew() {
		return _qlvtCapPhepPhuHieuTuyen.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtCapPhepPhuHieuTuyen.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtCapPhepPhuHieuTuyen.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtCapPhepPhuHieuTuyen.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtCapPhepPhuHieuTuyen.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtCapPhepPhuHieuTuyen.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtCapPhepPhuHieuTuyen.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtCapPhepPhuHieuTuyen.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtCapPhepPhuHieuTuyen.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtCapPhepPhuHieuTuyen.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtCapPhepPhuHieuTuyen.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QLVTCapPhepPhuHieuTuyenWrapper((QLVTCapPhepPhuHieuTuyen)_qlvtCapPhepPhuHieuTuyen.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepPhuHieuTuyen qlvtCapPhepPhuHieuTuyen) {
		return _qlvtCapPhepPhuHieuTuyen.compareTo(qlvtCapPhepPhuHieuTuyen);
	}

	@Override
	public int hashCode() {
		return _qlvtCapPhepPhuHieuTuyen.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepPhuHieuTuyen> toCacheModel() {
		return _qlvtCapPhepPhuHieuTuyen.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepPhuHieuTuyen toEscapedModel() {
		return new QLVTCapPhepPhuHieuTuyenWrapper(_qlvtCapPhepPhuHieuTuyen.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepPhuHieuTuyen toUnescapedModel() {
		return new QLVTCapPhepPhuHieuTuyenWrapper(_qlvtCapPhepPhuHieuTuyen.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtCapPhepPhuHieuTuyen.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtCapPhepPhuHieuTuyen.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtCapPhepPhuHieuTuyen.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QLVTCapPhepPhuHieuTuyenWrapper)) {
			return false;
		}

		QLVTCapPhepPhuHieuTuyenWrapper qlvtCapPhepPhuHieuTuyenWrapper = (QLVTCapPhepPhuHieuTuyenWrapper)obj;

		if (Validator.equals(_qlvtCapPhepPhuHieuTuyen,
					qlvtCapPhepPhuHieuTuyenWrapper._qlvtCapPhepPhuHieuTuyen)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QLVTCapPhepPhuHieuTuyen getWrappedQLVTCapPhepPhuHieuTuyen() {
		return _qlvtCapPhepPhuHieuTuyen;
	}

	@Override
	public QLVTCapPhepPhuHieuTuyen getWrappedModel() {
		return _qlvtCapPhepPhuHieuTuyen;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtCapPhepPhuHieuTuyen.resetOriginalValues();
	}

	private QLVTCapPhepPhuHieuTuyen _qlvtCapPhepPhuHieuTuyen;
}