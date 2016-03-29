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
 * This class is a wrapper for {@link QlvtTTHCKetQuaThamTra}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtTTHCKetQuaThamTra
 * @generated
 */
public class QlvtTTHCKetQuaThamTraWrapper implements QlvtTTHCKetQuaThamTra,
	ModelWrapper<QlvtTTHCKetQuaThamTra> {
	public QlvtTTHCKetQuaThamTraWrapper(
		QlvtTTHCKetQuaThamTra qlvtTTHCKetQuaThamTra) {
		_qlvtTTHCKetQuaThamTra = qlvtTTHCKetQuaThamTra;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtTTHCKetQuaThamTra.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtTTHCKetQuaThamTra.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("maKetQuaThamTra", getMaKetQuaThamTra());
		attributes.put("maTTHC", getMaTTHC());
		attributes.put("buocXuLy", getBuocXuLy());
		attributes.put("toChucXuLy", getToChucXuLy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String maKetQuaThamTra = (String)attributes.get("maKetQuaThamTra");

		if (maKetQuaThamTra != null) {
			setMaKetQuaThamTra(maKetQuaThamTra);
		}

		String maTTHC = (String)attributes.get("maTTHC");

		if (maTTHC != null) {
			setMaTTHC(maTTHC);
		}

		Integer buocXuLy = (Integer)attributes.get("buocXuLy");

		if (buocXuLy != null) {
			setBuocXuLy(buocXuLy);
		}

		Integer toChucXuLy = (Integer)attributes.get("toChucXuLy");

		if (toChucXuLy != null) {
			setToChucXuLy(toChucXuLy);
		}
	}

	/**
	* Returns the primary key of this qlvt t t h c ket qua tham tra.
	*
	* @return the primary key of this qlvt t t h c ket qua tham tra
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtTTHCKetQuaThamTra.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt t t h c ket qua tham tra.
	*
	* @param primaryKey the primary key of this qlvt t t h c ket qua tham tra
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtTTHCKetQuaThamTra.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt t t h c ket qua tham tra.
	*
	* @return the ID of this qlvt t t h c ket qua tham tra
	*/
	@Override
	public long getId() {
		return _qlvtTTHCKetQuaThamTra.getId();
	}

	/**
	* Sets the ID of this qlvt t t h c ket qua tham tra.
	*
	* @param id the ID of this qlvt t t h c ket qua tham tra
	*/
	@Override
	public void setId(long id) {
		_qlvtTTHCKetQuaThamTra.setId(id);
	}

	/**
	* Returns the ma ket qua tham tra of this qlvt t t h c ket qua tham tra.
	*
	* @return the ma ket qua tham tra of this qlvt t t h c ket qua tham tra
	*/
	@Override
	public java.lang.String getMaKetQuaThamTra() {
		return _qlvtTTHCKetQuaThamTra.getMaKetQuaThamTra();
	}

	/**
	* Sets the ma ket qua tham tra of this qlvt t t h c ket qua tham tra.
	*
	* @param maKetQuaThamTra the ma ket qua tham tra of this qlvt t t h c ket qua tham tra
	*/
	@Override
	public void setMaKetQuaThamTra(java.lang.String maKetQuaThamTra) {
		_qlvtTTHCKetQuaThamTra.setMaKetQuaThamTra(maKetQuaThamTra);
	}

	/**
	* Returns the ma t t h c of this qlvt t t h c ket qua tham tra.
	*
	* @return the ma t t h c of this qlvt t t h c ket qua tham tra
	*/
	@Override
	public java.lang.String getMaTTHC() {
		return _qlvtTTHCKetQuaThamTra.getMaTTHC();
	}

	/**
	* Sets the ma t t h c of this qlvt t t h c ket qua tham tra.
	*
	* @param maTTHC the ma t t h c of this qlvt t t h c ket qua tham tra
	*/
	@Override
	public void setMaTTHC(java.lang.String maTTHC) {
		_qlvtTTHCKetQuaThamTra.setMaTTHC(maTTHC);
	}

	/**
	* Returns the buoc xu ly of this qlvt t t h c ket qua tham tra.
	*
	* @return the buoc xu ly of this qlvt t t h c ket qua tham tra
	*/
	@Override
	public int getBuocXuLy() {
		return _qlvtTTHCKetQuaThamTra.getBuocXuLy();
	}

	/**
	* Sets the buoc xu ly of this qlvt t t h c ket qua tham tra.
	*
	* @param buocXuLy the buoc xu ly of this qlvt t t h c ket qua tham tra
	*/
	@Override
	public void setBuocXuLy(int buocXuLy) {
		_qlvtTTHCKetQuaThamTra.setBuocXuLy(buocXuLy);
	}

	/**
	* Returns the to chuc xu ly of this qlvt t t h c ket qua tham tra.
	*
	* @return the to chuc xu ly of this qlvt t t h c ket qua tham tra
	*/
	@Override
	public int getToChucXuLy() {
		return _qlvtTTHCKetQuaThamTra.getToChucXuLy();
	}

	/**
	* Sets the to chuc xu ly of this qlvt t t h c ket qua tham tra.
	*
	* @param toChucXuLy the to chuc xu ly of this qlvt t t h c ket qua tham tra
	*/
	@Override
	public void setToChucXuLy(int toChucXuLy) {
		_qlvtTTHCKetQuaThamTra.setToChucXuLy(toChucXuLy);
	}

	@Override
	public boolean isNew() {
		return _qlvtTTHCKetQuaThamTra.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtTTHCKetQuaThamTra.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtTTHCKetQuaThamTra.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtTTHCKetQuaThamTra.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtTTHCKetQuaThamTra.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtTTHCKetQuaThamTra.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtTTHCKetQuaThamTra.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtTTHCKetQuaThamTra.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtTTHCKetQuaThamTra.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtTTHCKetQuaThamTra.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtTTHCKetQuaThamTra.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtTTHCKetQuaThamTraWrapper((QlvtTTHCKetQuaThamTra)_qlvtTTHCKetQuaThamTra.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTra qlvtTTHCKetQuaThamTra) {
		return _qlvtTTHCKetQuaThamTra.compareTo(qlvtTTHCKetQuaThamTra);
	}

	@Override
	public int hashCode() {
		return _qlvtTTHCKetQuaThamTra.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTra> toCacheModel() {
		return _qlvtTTHCKetQuaThamTra.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTra toEscapedModel() {
		return new QlvtTTHCKetQuaThamTraWrapper(_qlvtTTHCKetQuaThamTra.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTra toUnescapedModel() {
		return new QlvtTTHCKetQuaThamTraWrapper(_qlvtTTHCKetQuaThamTra.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtTTHCKetQuaThamTra.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtTTHCKetQuaThamTra.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtTTHCKetQuaThamTra.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtTTHCKetQuaThamTraWrapper)) {
			return false;
		}

		QlvtTTHCKetQuaThamTraWrapper qlvtTTHCKetQuaThamTraWrapper = (QlvtTTHCKetQuaThamTraWrapper)obj;

		if (Validator.equals(_qlvtTTHCKetQuaThamTra,
					qlvtTTHCKetQuaThamTraWrapper._qlvtTTHCKetQuaThamTra)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtTTHCKetQuaThamTra getWrappedQlvtTTHCKetQuaThamTra() {
		return _qlvtTTHCKetQuaThamTra;
	}

	@Override
	public QlvtTTHCKetQuaThamTra getWrappedModel() {
		return _qlvtTTHCKetQuaThamTra;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtTTHCKetQuaThamTra.resetOriginalValues();
	}

	private QlvtTTHCKetQuaThamTra _qlvtTTHCKetQuaThamTra;
}