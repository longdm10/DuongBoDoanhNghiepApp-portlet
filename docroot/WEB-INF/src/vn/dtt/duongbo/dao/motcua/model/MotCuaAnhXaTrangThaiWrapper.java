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

package vn.dtt.duongbo.dao.motcua.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MotCuaAnhXaTrangThai}.
 * </p>
 *
 * @author win_64
 * @see MotCuaAnhXaTrangThai
 * @generated
 */
public class MotCuaAnhXaTrangThaiWrapper implements MotCuaAnhXaTrangThai,
	ModelWrapper<MotCuaAnhXaTrangThai> {
	public MotCuaAnhXaTrangThaiWrapper(
		MotCuaAnhXaTrangThai motCuaAnhXaTrangThai) {
		_motCuaAnhXaTrangThai = motCuaAnhXaTrangThai;
	}

	@Override
	public Class<?> getModelClass() {
		return MotCuaAnhXaTrangThai.class;
	}

	@Override
	public String getModelClassName() {
		return MotCuaAnhXaTrangThai.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("maTTCanBo", getMaTTCanBo());
		attributes.put("maTTDoanhNghiep", getMaTTDoanhNghiep());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String maTTCanBo = (String)attributes.get("maTTCanBo");

		if (maTTCanBo != null) {
			setMaTTCanBo(maTTCanBo);
		}

		String maTTDoanhNghiep = (String)attributes.get("maTTDoanhNghiep");

		if (maTTDoanhNghiep != null) {
			setMaTTDoanhNghiep(maTTDoanhNghiep);
		}
	}

	/**
	* Returns the primary key of this mot cua anh xa trang thai.
	*
	* @return the primary key of this mot cua anh xa trang thai
	*/
	@Override
	public long getPrimaryKey() {
		return _motCuaAnhXaTrangThai.getPrimaryKey();
	}

	/**
	* Sets the primary key of this mot cua anh xa trang thai.
	*
	* @param primaryKey the primary key of this mot cua anh xa trang thai
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_motCuaAnhXaTrangThai.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this mot cua anh xa trang thai.
	*
	* @return the ID of this mot cua anh xa trang thai
	*/
	@Override
	public long getId() {
		return _motCuaAnhXaTrangThai.getId();
	}

	/**
	* Sets the ID of this mot cua anh xa trang thai.
	*
	* @param id the ID of this mot cua anh xa trang thai
	*/
	@Override
	public void setId(long id) {
		_motCuaAnhXaTrangThai.setId(id);
	}

	/**
	* Returns the ma t t can bo of this mot cua anh xa trang thai.
	*
	* @return the ma t t can bo of this mot cua anh xa trang thai
	*/
	@Override
	public java.lang.String getMaTTCanBo() {
		return _motCuaAnhXaTrangThai.getMaTTCanBo();
	}

	/**
	* Sets the ma t t can bo of this mot cua anh xa trang thai.
	*
	* @param maTTCanBo the ma t t can bo of this mot cua anh xa trang thai
	*/
	@Override
	public void setMaTTCanBo(java.lang.String maTTCanBo) {
		_motCuaAnhXaTrangThai.setMaTTCanBo(maTTCanBo);
	}

	/**
	* Returns the ma t t doanh nghiep of this mot cua anh xa trang thai.
	*
	* @return the ma t t doanh nghiep of this mot cua anh xa trang thai
	*/
	@Override
	public java.lang.String getMaTTDoanhNghiep() {
		return _motCuaAnhXaTrangThai.getMaTTDoanhNghiep();
	}

	/**
	* Sets the ma t t doanh nghiep of this mot cua anh xa trang thai.
	*
	* @param maTTDoanhNghiep the ma t t doanh nghiep of this mot cua anh xa trang thai
	*/
	@Override
	public void setMaTTDoanhNghiep(java.lang.String maTTDoanhNghiep) {
		_motCuaAnhXaTrangThai.setMaTTDoanhNghiep(maTTDoanhNghiep);
	}

	@Override
	public boolean isNew() {
		return _motCuaAnhXaTrangThai.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_motCuaAnhXaTrangThai.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _motCuaAnhXaTrangThai.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_motCuaAnhXaTrangThai.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _motCuaAnhXaTrangThai.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _motCuaAnhXaTrangThai.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_motCuaAnhXaTrangThai.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _motCuaAnhXaTrangThai.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_motCuaAnhXaTrangThai.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_motCuaAnhXaTrangThai.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_motCuaAnhXaTrangThai.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new MotCuaAnhXaTrangThaiWrapper((MotCuaAnhXaTrangThai)_motCuaAnhXaTrangThai.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai motCuaAnhXaTrangThai) {
		return _motCuaAnhXaTrangThai.compareTo(motCuaAnhXaTrangThai);
	}

	@Override
	public int hashCode() {
		return _motCuaAnhXaTrangThai.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai> toCacheModel() {
		return _motCuaAnhXaTrangThai.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai toEscapedModel() {
		return new MotCuaAnhXaTrangThaiWrapper(_motCuaAnhXaTrangThai.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai toUnescapedModel() {
		return new MotCuaAnhXaTrangThaiWrapper(_motCuaAnhXaTrangThai.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _motCuaAnhXaTrangThai.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _motCuaAnhXaTrangThai.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_motCuaAnhXaTrangThai.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MotCuaAnhXaTrangThaiWrapper)) {
			return false;
		}

		MotCuaAnhXaTrangThaiWrapper motCuaAnhXaTrangThaiWrapper = (MotCuaAnhXaTrangThaiWrapper)obj;

		if (Validator.equals(_motCuaAnhXaTrangThai,
					motCuaAnhXaTrangThaiWrapper._motCuaAnhXaTrangThai)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public MotCuaAnhXaTrangThai getWrappedMotCuaAnhXaTrangThai() {
		return _motCuaAnhXaTrangThai;
	}

	@Override
	public MotCuaAnhXaTrangThai getWrappedModel() {
		return _motCuaAnhXaTrangThai;
	}

	@Override
	public void resetOriginalValues() {
		_motCuaAnhXaTrangThai.resetOriginalValues();
	}

	private MotCuaAnhXaTrangThai _motCuaAnhXaTrangThai;
}