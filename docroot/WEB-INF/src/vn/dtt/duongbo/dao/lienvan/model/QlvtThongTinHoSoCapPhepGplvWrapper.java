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

package vn.dtt.duongbo.dao.lienvan.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link QlvtThongTinHoSoCapPhepGplv}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtThongTinHoSoCapPhepGplv
 * @generated
 */
public class QlvtThongTinHoSoCapPhepGplvWrapper
	implements QlvtThongTinHoSoCapPhepGplv,
		ModelWrapper<QlvtThongTinHoSoCapPhepGplv> {
	public QlvtThongTinHoSoCapPhepGplvWrapper(
		QlvtThongTinHoSoCapPhepGplv qlvtThongTinHoSoCapPhepGplv) {
		_qlvtThongTinHoSoCapPhepGplv = qlvtThongTinHoSoCapPhepGplv;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtThongTinHoSoCapPhepGplv.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtThongTinHoSoCapPhepGplv.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("thongtinhosoId", getThongtinhosoId());
		attributes.put("capphepGplienvanId", getCapphepGplienvanId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long thongtinhosoId = (Long)attributes.get("thongtinhosoId");

		if (thongtinhosoId != null) {
			setThongtinhosoId(thongtinhosoId);
		}

		Long capphepGplienvanId = (Long)attributes.get("capphepGplienvanId");

		if (capphepGplienvanId != null) {
			setCapphepGplienvanId(capphepGplienvanId);
		}
	}

	/**
	* Returns the primary key of this qlvt thong tin ho so cap phep gplv.
	*
	* @return the primary key of this qlvt thong tin ho so cap phep gplv
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtThongTinHoSoCapPhepGplv.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt thong tin ho so cap phep gplv.
	*
	* @param primaryKey the primary key of this qlvt thong tin ho so cap phep gplv
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtThongTinHoSoCapPhepGplv.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt thong tin ho so cap phep gplv.
	*
	* @return the ID of this qlvt thong tin ho so cap phep gplv
	*/
	@Override
	public long getId() {
		return _qlvtThongTinHoSoCapPhepGplv.getId();
	}

	/**
	* Sets the ID of this qlvt thong tin ho so cap phep gplv.
	*
	* @param id the ID of this qlvt thong tin ho so cap phep gplv
	*/
	@Override
	public void setId(long id) {
		_qlvtThongTinHoSoCapPhepGplv.setId(id);
	}

	/**
	* Returns the thongtinhoso ID of this qlvt thong tin ho so cap phep gplv.
	*
	* @return the thongtinhoso ID of this qlvt thong tin ho so cap phep gplv
	*/
	@Override
	public long getThongtinhosoId() {
		return _qlvtThongTinHoSoCapPhepGplv.getThongtinhosoId();
	}

	/**
	* Sets the thongtinhoso ID of this qlvt thong tin ho so cap phep gplv.
	*
	* @param thongtinhosoId the thongtinhoso ID of this qlvt thong tin ho so cap phep gplv
	*/
	@Override
	public void setThongtinhosoId(long thongtinhosoId) {
		_qlvtThongTinHoSoCapPhepGplv.setThongtinhosoId(thongtinhosoId);
	}

	/**
	* Returns the capphep gplienvan ID of this qlvt thong tin ho so cap phep gplv.
	*
	* @return the capphep gplienvan ID of this qlvt thong tin ho so cap phep gplv
	*/
	@Override
	public long getCapphepGplienvanId() {
		return _qlvtThongTinHoSoCapPhepGplv.getCapphepGplienvanId();
	}

	/**
	* Sets the capphep gplienvan ID of this qlvt thong tin ho so cap phep gplv.
	*
	* @param capphepGplienvanId the capphep gplienvan ID of this qlvt thong tin ho so cap phep gplv
	*/
	@Override
	public void setCapphepGplienvanId(long capphepGplienvanId) {
		_qlvtThongTinHoSoCapPhepGplv.setCapphepGplienvanId(capphepGplienvanId);
	}

	@Override
	public boolean isNew() {
		return _qlvtThongTinHoSoCapPhepGplv.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtThongTinHoSoCapPhepGplv.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtThongTinHoSoCapPhepGplv.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtThongTinHoSoCapPhepGplv.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtThongTinHoSoCapPhepGplv.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtThongTinHoSoCapPhepGplv.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtThongTinHoSoCapPhepGplv.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtThongTinHoSoCapPhepGplv.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtThongTinHoSoCapPhepGplv.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtThongTinHoSoCapPhepGplv.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtThongTinHoSoCapPhepGplv.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtThongTinHoSoCapPhepGplvWrapper((QlvtThongTinHoSoCapPhepGplv)_qlvtThongTinHoSoCapPhepGplv.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoCapPhepGplv qlvtThongTinHoSoCapPhepGplv) {
		return _qlvtThongTinHoSoCapPhepGplv.compareTo(qlvtThongTinHoSoCapPhepGplv);
	}

	@Override
	public int hashCode() {
		return _qlvtThongTinHoSoCapPhepGplv.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoCapPhepGplv> toCacheModel() {
		return _qlvtThongTinHoSoCapPhepGplv.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoCapPhepGplv toEscapedModel() {
		return new QlvtThongTinHoSoCapPhepGplvWrapper(_qlvtThongTinHoSoCapPhepGplv.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoCapPhepGplv toUnescapedModel() {
		return new QlvtThongTinHoSoCapPhepGplvWrapper(_qlvtThongTinHoSoCapPhepGplv.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtThongTinHoSoCapPhepGplv.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtThongTinHoSoCapPhepGplv.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtThongTinHoSoCapPhepGplv.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtThongTinHoSoCapPhepGplvWrapper)) {
			return false;
		}

		QlvtThongTinHoSoCapPhepGplvWrapper qlvtThongTinHoSoCapPhepGplvWrapper = (QlvtThongTinHoSoCapPhepGplvWrapper)obj;

		if (Validator.equals(_qlvtThongTinHoSoCapPhepGplv,
					qlvtThongTinHoSoCapPhepGplvWrapper._qlvtThongTinHoSoCapPhepGplv)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtThongTinHoSoCapPhepGplv getWrappedQlvtThongTinHoSoCapPhepGplv() {
		return _qlvtThongTinHoSoCapPhepGplv;
	}

	@Override
	public QlvtThongTinHoSoCapPhepGplv getWrappedModel() {
		return _qlvtThongTinHoSoCapPhepGplv;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtThongTinHoSoCapPhepGplv.resetOriginalValues();
	}

	private QlvtThongTinHoSoCapPhepGplv _qlvtThongTinHoSoCapPhepGplv;
}