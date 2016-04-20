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
 * This class is a wrapper for {@link QlvtThongTinHoSoNoiDia}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtThongTinHoSoNoiDia
 * @generated
 */
public class QlvtThongTinHoSoNoiDiaWrapper implements QlvtThongTinHoSoNoiDia,
	ModelWrapper<QlvtThongTinHoSoNoiDia> {
	public QlvtThongTinHoSoNoiDiaWrapper(
		QlvtThongTinHoSoNoiDia qlvtThongTinHoSoNoiDia) {
		_qlvtThongTinHoSoNoiDia = qlvtThongTinHoSoNoiDia;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtThongTinHoSoNoiDia.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtThongTinHoSoNoiDia.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("thongtinHoSoId", getThongtinHoSoId());
		attributes.put("noiDiaId", getNoiDiaId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long thongtinHoSoId = (Long)attributes.get("thongtinHoSoId");

		if (thongtinHoSoId != null) {
			setThongtinHoSoId(thongtinHoSoId);
		}

		Long noiDiaId = (Long)attributes.get("noiDiaId");

		if (noiDiaId != null) {
			setNoiDiaId(noiDiaId);
		}
	}

	/**
	* Returns the primary key of this qlvt thong tin ho so noi dia.
	*
	* @return the primary key of this qlvt thong tin ho so noi dia
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtThongTinHoSoNoiDia.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt thong tin ho so noi dia.
	*
	* @param primaryKey the primary key of this qlvt thong tin ho so noi dia
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtThongTinHoSoNoiDia.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt thong tin ho so noi dia.
	*
	* @return the ID of this qlvt thong tin ho so noi dia
	*/
	@Override
	public long getId() {
		return _qlvtThongTinHoSoNoiDia.getId();
	}

	/**
	* Sets the ID of this qlvt thong tin ho so noi dia.
	*
	* @param id the ID of this qlvt thong tin ho so noi dia
	*/
	@Override
	public void setId(long id) {
		_qlvtThongTinHoSoNoiDia.setId(id);
	}

	/**
	* Returns the thongtin ho so ID of this qlvt thong tin ho so noi dia.
	*
	* @return the thongtin ho so ID of this qlvt thong tin ho so noi dia
	*/
	@Override
	public long getThongtinHoSoId() {
		return _qlvtThongTinHoSoNoiDia.getThongtinHoSoId();
	}

	/**
	* Sets the thongtin ho so ID of this qlvt thong tin ho so noi dia.
	*
	* @param thongtinHoSoId the thongtin ho so ID of this qlvt thong tin ho so noi dia
	*/
	@Override
	public void setThongtinHoSoId(long thongtinHoSoId) {
		_qlvtThongTinHoSoNoiDia.setThongtinHoSoId(thongtinHoSoId);
	}

	/**
	* Returns the noi dia ID of this qlvt thong tin ho so noi dia.
	*
	* @return the noi dia ID of this qlvt thong tin ho so noi dia
	*/
	@Override
	public long getNoiDiaId() {
		return _qlvtThongTinHoSoNoiDia.getNoiDiaId();
	}

	/**
	* Sets the noi dia ID of this qlvt thong tin ho so noi dia.
	*
	* @param noiDiaId the noi dia ID of this qlvt thong tin ho so noi dia
	*/
	@Override
	public void setNoiDiaId(long noiDiaId) {
		_qlvtThongTinHoSoNoiDia.setNoiDiaId(noiDiaId);
	}

	@Override
	public boolean isNew() {
		return _qlvtThongTinHoSoNoiDia.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtThongTinHoSoNoiDia.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtThongTinHoSoNoiDia.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtThongTinHoSoNoiDia.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtThongTinHoSoNoiDia.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtThongTinHoSoNoiDia.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtThongTinHoSoNoiDia.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtThongTinHoSoNoiDia.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtThongTinHoSoNoiDia.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtThongTinHoSoNoiDia.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtThongTinHoSoNoiDia.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtThongTinHoSoNoiDiaWrapper((QlvtThongTinHoSoNoiDia)_qlvtThongTinHoSoNoiDia.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoNoiDia qlvtThongTinHoSoNoiDia) {
		return _qlvtThongTinHoSoNoiDia.compareTo(qlvtThongTinHoSoNoiDia);
	}

	@Override
	public int hashCode() {
		return _qlvtThongTinHoSoNoiDia.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoNoiDia> toCacheModel() {
		return _qlvtThongTinHoSoNoiDia.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoNoiDia toEscapedModel() {
		return new QlvtThongTinHoSoNoiDiaWrapper(_qlvtThongTinHoSoNoiDia.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoNoiDia toUnescapedModel() {
		return new QlvtThongTinHoSoNoiDiaWrapper(_qlvtThongTinHoSoNoiDia.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtThongTinHoSoNoiDia.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtThongTinHoSoNoiDia.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtThongTinHoSoNoiDia.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtThongTinHoSoNoiDiaWrapper)) {
			return false;
		}

		QlvtThongTinHoSoNoiDiaWrapper qlvtThongTinHoSoNoiDiaWrapper = (QlvtThongTinHoSoNoiDiaWrapper)obj;

		if (Validator.equals(_qlvtThongTinHoSoNoiDia,
					qlvtThongTinHoSoNoiDiaWrapper._qlvtThongTinHoSoNoiDia)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtThongTinHoSoNoiDia getWrappedQlvtThongTinHoSoNoiDia() {
		return _qlvtThongTinHoSoNoiDia;
	}

	@Override
	public QlvtThongTinHoSoNoiDia getWrappedModel() {
		return _qlvtThongTinHoSoNoiDia;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtThongTinHoSoNoiDia.resetOriginalValues();
	}

	private QlvtThongTinHoSoNoiDia _qlvtThongTinHoSoNoiDia;
}