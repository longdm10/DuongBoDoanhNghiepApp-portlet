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

package vn.dtt.duongbo.dao.nghiepvu.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link QlvtTTHCNoiDungThamTra}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtTTHCNoiDungThamTra
 * @generated
 */
public class QlvtTTHCNoiDungThamTraWrapper implements QlvtTTHCNoiDungThamTra,
	ModelWrapper<QlvtTTHCNoiDungThamTra> {
	public QlvtTTHCNoiDungThamTraWrapper(
		QlvtTTHCNoiDungThamTra qlvtTTHCNoiDungThamTra) {
		_qlvtTTHCNoiDungThamTra = qlvtTTHCNoiDungThamTra;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtTTHCNoiDungThamTra.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtTTHCNoiDungThamTra.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("maTTHC", getMaTTHC());
		attributes.put("toChucXuLy", getToChucXuLy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String maTTHC = (String)attributes.get("maTTHC");

		if (maTTHC != null) {
			setMaTTHC(maTTHC);
		}

		Integer toChucXuLy = (Integer)attributes.get("toChucXuLy");

		if (toChucXuLy != null) {
			setToChucXuLy(toChucXuLy);
		}
	}

	/**
	* Returns the primary key of this qlvt t t h c noi dung tham tra.
	*
	* @return the primary key of this qlvt t t h c noi dung tham tra
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtTTHCNoiDungThamTra.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt t t h c noi dung tham tra.
	*
	* @param primaryKey the primary key of this qlvt t t h c noi dung tham tra
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtTTHCNoiDungThamTra.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt t t h c noi dung tham tra.
	*
	* @return the ID of this qlvt t t h c noi dung tham tra
	*/
	@Override
	public long getId() {
		return _qlvtTTHCNoiDungThamTra.getId();
	}

	/**
	* Sets the ID of this qlvt t t h c noi dung tham tra.
	*
	* @param id the ID of this qlvt t t h c noi dung tham tra
	*/
	@Override
	public void setId(long id) {
		_qlvtTTHCNoiDungThamTra.setId(id);
	}

	/**
	* Returns the ma t t h c of this qlvt t t h c noi dung tham tra.
	*
	* @return the ma t t h c of this qlvt t t h c noi dung tham tra
	*/
	@Override
	public java.lang.String getMaTTHC() {
		return _qlvtTTHCNoiDungThamTra.getMaTTHC();
	}

	/**
	* Sets the ma t t h c of this qlvt t t h c noi dung tham tra.
	*
	* @param maTTHC the ma t t h c of this qlvt t t h c noi dung tham tra
	*/
	@Override
	public void setMaTTHC(java.lang.String maTTHC) {
		_qlvtTTHCNoiDungThamTra.setMaTTHC(maTTHC);
	}

	/**
	* Returns the to chuc xu ly of this qlvt t t h c noi dung tham tra.
	*
	* @return the to chuc xu ly of this qlvt t t h c noi dung tham tra
	*/
	@Override
	public int getToChucXuLy() {
		return _qlvtTTHCNoiDungThamTra.getToChucXuLy();
	}

	/**
	* Sets the to chuc xu ly of this qlvt t t h c noi dung tham tra.
	*
	* @param toChucXuLy the to chuc xu ly of this qlvt t t h c noi dung tham tra
	*/
	@Override
	public void setToChucXuLy(int toChucXuLy) {
		_qlvtTTHCNoiDungThamTra.setToChucXuLy(toChucXuLy);
	}

	@Override
	public boolean isNew() {
		return _qlvtTTHCNoiDungThamTra.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtTTHCNoiDungThamTra.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtTTHCNoiDungThamTra.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtTTHCNoiDungThamTra.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtTTHCNoiDungThamTra.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtTTHCNoiDungThamTra.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtTTHCNoiDungThamTra.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtTTHCNoiDungThamTra.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtTTHCNoiDungThamTra.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtTTHCNoiDungThamTra.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtTTHCNoiDungThamTra.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtTTHCNoiDungThamTraWrapper((QlvtTTHCNoiDungThamTra)_qlvtTTHCNoiDungThamTra.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra qlvtTTHCNoiDungThamTra) {
		return _qlvtTTHCNoiDungThamTra.compareTo(qlvtTTHCNoiDungThamTra);
	}

	@Override
	public int hashCode() {
		return _qlvtTTHCNoiDungThamTra.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra> toCacheModel() {
		return _qlvtTTHCNoiDungThamTra.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra toEscapedModel() {
		return new QlvtTTHCNoiDungThamTraWrapper(_qlvtTTHCNoiDungThamTra.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra toUnescapedModel() {
		return new QlvtTTHCNoiDungThamTraWrapper(_qlvtTTHCNoiDungThamTra.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtTTHCNoiDungThamTra.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtTTHCNoiDungThamTra.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtTTHCNoiDungThamTra.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtTTHCNoiDungThamTraWrapper)) {
			return false;
		}

		QlvtTTHCNoiDungThamTraWrapper qlvtTTHCNoiDungThamTraWrapper = (QlvtTTHCNoiDungThamTraWrapper)obj;

		if (Validator.equals(_qlvtTTHCNoiDungThamTra,
					qlvtTTHCNoiDungThamTraWrapper._qlvtTTHCNoiDungThamTra)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtTTHCNoiDungThamTra getWrappedQlvtTTHCNoiDungThamTra() {
		return _qlvtTTHCNoiDungThamTra;
	}

	@Override
	public QlvtTTHCNoiDungThamTra getWrappedModel() {
		return _qlvtTTHCNoiDungThamTra;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtTTHCNoiDungThamTra.resetOriginalValues();
	}

	private QlvtTTHCNoiDungThamTra _qlvtTTHCNoiDungThamTra;
}