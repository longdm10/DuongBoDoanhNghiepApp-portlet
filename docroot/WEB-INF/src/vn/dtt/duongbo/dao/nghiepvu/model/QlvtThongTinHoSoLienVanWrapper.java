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
 * This class is a wrapper for {@link QlvtThongTinHoSoLienVan}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtThongTinHoSoLienVan
 * @generated
 */
public class QlvtThongTinHoSoLienVanWrapper implements QlvtThongTinHoSoLienVan,
	ModelWrapper<QlvtThongTinHoSoLienVan> {
	public QlvtThongTinHoSoLienVanWrapper(
		QlvtThongTinHoSoLienVan qlvtThongTinHoSoLienVan) {
		_qlvtThongTinHoSoLienVan = qlvtThongTinHoSoLienVan;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtThongTinHoSoLienVan.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtThongTinHoSoLienVan.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("thongtinHoSoId", getThongtinHoSoId());
		attributes.put("gplienvanID", getGplienvanID());

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

		Long gplienvanID = (Long)attributes.get("gplienvanID");

		if (gplienvanID != null) {
			setGplienvanID(gplienvanID);
		}
	}

	/**
	* Returns the primary key of this qlvt thong tin ho so lien van.
	*
	* @return the primary key of this qlvt thong tin ho so lien van
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtThongTinHoSoLienVan.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt thong tin ho so lien van.
	*
	* @param primaryKey the primary key of this qlvt thong tin ho so lien van
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtThongTinHoSoLienVan.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt thong tin ho so lien van.
	*
	* @return the ID of this qlvt thong tin ho so lien van
	*/
	@Override
	public long getId() {
		return _qlvtThongTinHoSoLienVan.getId();
	}

	/**
	* Sets the ID of this qlvt thong tin ho so lien van.
	*
	* @param id the ID of this qlvt thong tin ho so lien van
	*/
	@Override
	public void setId(long id) {
		_qlvtThongTinHoSoLienVan.setId(id);
	}

	/**
	* Returns the thongtin ho so ID of this qlvt thong tin ho so lien van.
	*
	* @return the thongtin ho so ID of this qlvt thong tin ho so lien van
	*/
	@Override
	public long getThongtinHoSoId() {
		return _qlvtThongTinHoSoLienVan.getThongtinHoSoId();
	}

	/**
	* Sets the thongtin ho so ID of this qlvt thong tin ho so lien van.
	*
	* @param thongtinHoSoId the thongtin ho so ID of this qlvt thong tin ho so lien van
	*/
	@Override
	public void setThongtinHoSoId(long thongtinHoSoId) {
		_qlvtThongTinHoSoLienVan.setThongtinHoSoId(thongtinHoSoId);
	}

	/**
	* Returns the gplienvan i d of this qlvt thong tin ho so lien van.
	*
	* @return the gplienvan i d of this qlvt thong tin ho so lien van
	*/
	@Override
	public long getGplienvanID() {
		return _qlvtThongTinHoSoLienVan.getGplienvanID();
	}

	/**
	* Sets the gplienvan i d of this qlvt thong tin ho so lien van.
	*
	* @param gplienvanID the gplienvan i d of this qlvt thong tin ho so lien van
	*/
	@Override
	public void setGplienvanID(long gplienvanID) {
		_qlvtThongTinHoSoLienVan.setGplienvanID(gplienvanID);
	}

	@Override
	public boolean isNew() {
		return _qlvtThongTinHoSoLienVan.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtThongTinHoSoLienVan.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtThongTinHoSoLienVan.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtThongTinHoSoLienVan.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtThongTinHoSoLienVan.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtThongTinHoSoLienVan.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtThongTinHoSoLienVan.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtThongTinHoSoLienVan.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtThongTinHoSoLienVan.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtThongTinHoSoLienVan.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtThongTinHoSoLienVan.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtThongTinHoSoLienVanWrapper((QlvtThongTinHoSoLienVan)_qlvtThongTinHoSoLienVan.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoLienVan qlvtThongTinHoSoLienVan) {
		return _qlvtThongTinHoSoLienVan.compareTo(qlvtThongTinHoSoLienVan);
	}

	@Override
	public int hashCode() {
		return _qlvtThongTinHoSoLienVan.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoLienVan> toCacheModel() {
		return _qlvtThongTinHoSoLienVan.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoLienVan toEscapedModel() {
		return new QlvtThongTinHoSoLienVanWrapper(_qlvtThongTinHoSoLienVan.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoLienVan toUnescapedModel() {
		return new QlvtThongTinHoSoLienVanWrapper(_qlvtThongTinHoSoLienVan.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtThongTinHoSoLienVan.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtThongTinHoSoLienVan.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtThongTinHoSoLienVan.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtThongTinHoSoLienVanWrapper)) {
			return false;
		}

		QlvtThongTinHoSoLienVanWrapper qlvtThongTinHoSoLienVanWrapper = (QlvtThongTinHoSoLienVanWrapper)obj;

		if (Validator.equals(_qlvtThongTinHoSoLienVan,
					qlvtThongTinHoSoLienVanWrapper._qlvtThongTinHoSoLienVan)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtThongTinHoSoLienVan getWrappedQlvtThongTinHoSoLienVan() {
		return _qlvtThongTinHoSoLienVan;
	}

	@Override
	public QlvtThongTinHoSoLienVan getWrappedModel() {
		return _qlvtThongTinHoSoLienVan;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtThongTinHoSoLienVan.resetOriginalValues();
	}

	private QlvtThongTinHoSoLienVan _qlvtThongTinHoSoLienVan;
}