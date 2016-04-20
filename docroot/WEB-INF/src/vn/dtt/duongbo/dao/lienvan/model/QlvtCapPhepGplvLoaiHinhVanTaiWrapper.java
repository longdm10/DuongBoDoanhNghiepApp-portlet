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
 * This class is a wrapper for {@link QlvtCapPhepGplvLoaiHinhVanTai}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtCapPhepGplvLoaiHinhVanTai
 * @generated
 */
public class QlvtCapPhepGplvLoaiHinhVanTaiWrapper
	implements QlvtCapPhepGplvLoaiHinhVanTai,
		ModelWrapper<QlvtCapPhepGplvLoaiHinhVanTai> {
	public QlvtCapPhepGplvLoaiHinhVanTaiWrapper(
		QlvtCapPhepGplvLoaiHinhVanTai qlvtCapPhepGplvLoaiHinhVanTai) {
		_qlvtCapPhepGplvLoaiHinhVanTai = qlvtCapPhepGplvLoaiHinhVanTai;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtCapPhepGplvLoaiHinhVanTai.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtCapPhepGplvLoaiHinhVanTai.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("gpLienVanId", getGpLienVanId());
		attributes.put("maLoaiHinhVanTai", getMaLoaiHinhVanTai());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long gpLienVanId = (Long)attributes.get("gpLienVanId");

		if (gpLienVanId != null) {
			setGpLienVanId(gpLienVanId);
		}

		String maLoaiHinhVanTai = (String)attributes.get("maLoaiHinhVanTai");

		if (maLoaiHinhVanTai != null) {
			setMaLoaiHinhVanTai(maLoaiHinhVanTai);
		}
	}

	/**
	* Returns the primary key of this qlvt cap phep gplv loai hinh van tai.
	*
	* @return the primary key of this qlvt cap phep gplv loai hinh van tai
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtCapPhepGplvLoaiHinhVanTai.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt cap phep gplv loai hinh van tai.
	*
	* @param primaryKey the primary key of this qlvt cap phep gplv loai hinh van tai
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtCapPhepGplvLoaiHinhVanTai.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt cap phep gplv loai hinh van tai.
	*
	* @return the ID of this qlvt cap phep gplv loai hinh van tai
	*/
	@Override
	public long getId() {
		return _qlvtCapPhepGplvLoaiHinhVanTai.getId();
	}

	/**
	* Sets the ID of this qlvt cap phep gplv loai hinh van tai.
	*
	* @param id the ID of this qlvt cap phep gplv loai hinh van tai
	*/
	@Override
	public void setId(long id) {
		_qlvtCapPhepGplvLoaiHinhVanTai.setId(id);
	}

	/**
	* Returns the gp lien van ID of this qlvt cap phep gplv loai hinh van tai.
	*
	* @return the gp lien van ID of this qlvt cap phep gplv loai hinh van tai
	*/
	@Override
	public long getGpLienVanId() {
		return _qlvtCapPhepGplvLoaiHinhVanTai.getGpLienVanId();
	}

	/**
	* Sets the gp lien van ID of this qlvt cap phep gplv loai hinh van tai.
	*
	* @param gpLienVanId the gp lien van ID of this qlvt cap phep gplv loai hinh van tai
	*/
	@Override
	public void setGpLienVanId(long gpLienVanId) {
		_qlvtCapPhepGplvLoaiHinhVanTai.setGpLienVanId(gpLienVanId);
	}

	/**
	* Returns the ma loai hinh van tai of this qlvt cap phep gplv loai hinh van tai.
	*
	* @return the ma loai hinh van tai of this qlvt cap phep gplv loai hinh van tai
	*/
	@Override
	public java.lang.String getMaLoaiHinhVanTai() {
		return _qlvtCapPhepGplvLoaiHinhVanTai.getMaLoaiHinhVanTai();
	}

	/**
	* Sets the ma loai hinh van tai of this qlvt cap phep gplv loai hinh van tai.
	*
	* @param maLoaiHinhVanTai the ma loai hinh van tai of this qlvt cap phep gplv loai hinh van tai
	*/
	@Override
	public void setMaLoaiHinhVanTai(java.lang.String maLoaiHinhVanTai) {
		_qlvtCapPhepGplvLoaiHinhVanTai.setMaLoaiHinhVanTai(maLoaiHinhVanTai);
	}

	@Override
	public boolean isNew() {
		return _qlvtCapPhepGplvLoaiHinhVanTai.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtCapPhepGplvLoaiHinhVanTai.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtCapPhepGplvLoaiHinhVanTai.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtCapPhepGplvLoaiHinhVanTai.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtCapPhepGplvLoaiHinhVanTai.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtCapPhepGplvLoaiHinhVanTai.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtCapPhepGplvLoaiHinhVanTai.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtCapPhepGplvLoaiHinhVanTai.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtCapPhepGplvLoaiHinhVanTai.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtCapPhepGplvLoaiHinhVanTai.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtCapPhepGplvLoaiHinhVanTai.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtCapPhepGplvLoaiHinhVanTaiWrapper((QlvtCapPhepGplvLoaiHinhVanTai)_qlvtCapPhepGplvLoaiHinhVanTai.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvLoaiHinhVanTai qlvtCapPhepGplvLoaiHinhVanTai) {
		return _qlvtCapPhepGplvLoaiHinhVanTai.compareTo(qlvtCapPhepGplvLoaiHinhVanTai);
	}

	@Override
	public int hashCode() {
		return _qlvtCapPhepGplvLoaiHinhVanTai.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvLoaiHinhVanTai> toCacheModel() {
		return _qlvtCapPhepGplvLoaiHinhVanTai.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvLoaiHinhVanTai toEscapedModel() {
		return new QlvtCapPhepGplvLoaiHinhVanTaiWrapper(_qlvtCapPhepGplvLoaiHinhVanTai.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvLoaiHinhVanTai toUnescapedModel() {
		return new QlvtCapPhepGplvLoaiHinhVanTaiWrapper(_qlvtCapPhepGplvLoaiHinhVanTai.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtCapPhepGplvLoaiHinhVanTai.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtCapPhepGplvLoaiHinhVanTai.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtCapPhepGplvLoaiHinhVanTai.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtCapPhepGplvLoaiHinhVanTaiWrapper)) {
			return false;
		}

		QlvtCapPhepGplvLoaiHinhVanTaiWrapper qlvtCapPhepGplvLoaiHinhVanTaiWrapper =
			(QlvtCapPhepGplvLoaiHinhVanTaiWrapper)obj;

		if (Validator.equals(_qlvtCapPhepGplvLoaiHinhVanTai,
					qlvtCapPhepGplvLoaiHinhVanTaiWrapper._qlvtCapPhepGplvLoaiHinhVanTai)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtCapPhepGplvLoaiHinhVanTai getWrappedQlvtCapPhepGplvLoaiHinhVanTai() {
		return _qlvtCapPhepGplvLoaiHinhVanTai;
	}

	@Override
	public QlvtCapPhepGplvLoaiHinhVanTai getWrappedModel() {
		return _qlvtCapPhepGplvLoaiHinhVanTai;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtCapPhepGplvLoaiHinhVanTai.resetOriginalValues();
	}

	private QlvtCapPhepGplvLoaiHinhVanTai _qlvtCapPhepGplvLoaiHinhVanTai;
}