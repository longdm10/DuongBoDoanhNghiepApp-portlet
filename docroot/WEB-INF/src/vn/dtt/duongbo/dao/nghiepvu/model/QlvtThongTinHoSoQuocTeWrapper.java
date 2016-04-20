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
 * This class is a wrapper for {@link QlvtThongTinHoSoQuocTe}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtThongTinHoSoQuocTe
 * @generated
 */
public class QlvtThongTinHoSoQuocTeWrapper implements QlvtThongTinHoSoQuocTe,
	ModelWrapper<QlvtThongTinHoSoQuocTe> {
	public QlvtThongTinHoSoQuocTeWrapper(
		QlvtThongTinHoSoQuocTe qlvtThongTinHoSoQuocTe) {
		_qlvtThongTinHoSoQuocTe = qlvtThongTinHoSoQuocTe;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtThongTinHoSoQuocTe.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtThongTinHoSoQuocTe.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("thongtinHoSoId", getThongtinHoSoId());
		attributes.put("gpkdvtID", getGpkdvtID());

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

		Long gpkdvtID = (Long)attributes.get("gpkdvtID");

		if (gpkdvtID != null) {
			setGpkdvtID(gpkdvtID);
		}
	}

	/**
	* Returns the primary key of this qlvt thong tin ho so quoc te.
	*
	* @return the primary key of this qlvt thong tin ho so quoc te
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtThongTinHoSoQuocTe.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt thong tin ho so quoc te.
	*
	* @param primaryKey the primary key of this qlvt thong tin ho so quoc te
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtThongTinHoSoQuocTe.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt thong tin ho so quoc te.
	*
	* @return the ID of this qlvt thong tin ho so quoc te
	*/
	@Override
	public long getId() {
		return _qlvtThongTinHoSoQuocTe.getId();
	}

	/**
	* Sets the ID of this qlvt thong tin ho so quoc te.
	*
	* @param id the ID of this qlvt thong tin ho so quoc te
	*/
	@Override
	public void setId(long id) {
		_qlvtThongTinHoSoQuocTe.setId(id);
	}

	/**
	* Returns the thongtin ho so ID of this qlvt thong tin ho so quoc te.
	*
	* @return the thongtin ho so ID of this qlvt thong tin ho so quoc te
	*/
	@Override
	public long getThongtinHoSoId() {
		return _qlvtThongTinHoSoQuocTe.getThongtinHoSoId();
	}

	/**
	* Sets the thongtin ho so ID of this qlvt thong tin ho so quoc te.
	*
	* @param thongtinHoSoId the thongtin ho so ID of this qlvt thong tin ho so quoc te
	*/
	@Override
	public void setThongtinHoSoId(long thongtinHoSoId) {
		_qlvtThongTinHoSoQuocTe.setThongtinHoSoId(thongtinHoSoId);
	}

	/**
	* Returns the gpkdvt i d of this qlvt thong tin ho so quoc te.
	*
	* @return the gpkdvt i d of this qlvt thong tin ho so quoc te
	*/
	@Override
	public long getGpkdvtID() {
		return _qlvtThongTinHoSoQuocTe.getGpkdvtID();
	}

	/**
	* Sets the gpkdvt i d of this qlvt thong tin ho so quoc te.
	*
	* @param gpkdvtID the gpkdvt i d of this qlvt thong tin ho so quoc te
	*/
	@Override
	public void setGpkdvtID(long gpkdvtID) {
		_qlvtThongTinHoSoQuocTe.setGpkdvtID(gpkdvtID);
	}

	@Override
	public boolean isNew() {
		return _qlvtThongTinHoSoQuocTe.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtThongTinHoSoQuocTe.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtThongTinHoSoQuocTe.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtThongTinHoSoQuocTe.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtThongTinHoSoQuocTe.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtThongTinHoSoQuocTe.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtThongTinHoSoQuocTe.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtThongTinHoSoQuocTe.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtThongTinHoSoQuocTe.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtThongTinHoSoQuocTe.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtThongTinHoSoQuocTe.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtThongTinHoSoQuocTeWrapper((QlvtThongTinHoSoQuocTe)_qlvtThongTinHoSoQuocTe.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoQuocTe qlvtThongTinHoSoQuocTe) {
		return _qlvtThongTinHoSoQuocTe.compareTo(qlvtThongTinHoSoQuocTe);
	}

	@Override
	public int hashCode() {
		return _qlvtThongTinHoSoQuocTe.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoQuocTe> toCacheModel() {
		return _qlvtThongTinHoSoQuocTe.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoQuocTe toEscapedModel() {
		return new QlvtThongTinHoSoQuocTeWrapper(_qlvtThongTinHoSoQuocTe.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoQuocTe toUnescapedModel() {
		return new QlvtThongTinHoSoQuocTeWrapper(_qlvtThongTinHoSoQuocTe.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtThongTinHoSoQuocTe.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtThongTinHoSoQuocTe.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtThongTinHoSoQuocTe.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtThongTinHoSoQuocTeWrapper)) {
			return false;
		}

		QlvtThongTinHoSoQuocTeWrapper qlvtThongTinHoSoQuocTeWrapper = (QlvtThongTinHoSoQuocTeWrapper)obj;

		if (Validator.equals(_qlvtThongTinHoSoQuocTe,
					qlvtThongTinHoSoQuocTeWrapper._qlvtThongTinHoSoQuocTe)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtThongTinHoSoQuocTe getWrappedQlvtThongTinHoSoQuocTe() {
		return _qlvtThongTinHoSoQuocTe;
	}

	@Override
	public QlvtThongTinHoSoQuocTe getWrappedModel() {
		return _qlvtThongTinHoSoQuocTe;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtThongTinHoSoQuocTe.resetOriginalValues();
	}

	private QlvtThongTinHoSoQuocTe _qlvtThongTinHoSoQuocTe;
}