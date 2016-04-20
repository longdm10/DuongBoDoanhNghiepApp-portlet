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
 * This class is a wrapper for {@link QlvtXuLyGpLienVanLoaiHinhVanTai}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtXuLyGpLienVanLoaiHinhVanTai
 * @generated
 */
public class QlvtXuLyGpLienVanLoaiHinhVanTaiWrapper
	implements QlvtXuLyGpLienVanLoaiHinhVanTai,
		ModelWrapper<QlvtXuLyGpLienVanLoaiHinhVanTai> {
	public QlvtXuLyGpLienVanLoaiHinhVanTaiWrapper(
		QlvtXuLyGpLienVanLoaiHinhVanTai qlvtXuLyGpLienVanLoaiHinhVanTai) {
		_qlvtXuLyGpLienVanLoaiHinhVanTai = qlvtXuLyGpLienVanLoaiHinhVanTai;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtXuLyGpLienVanLoaiHinhVanTai.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtXuLyGpLienVanLoaiHinhVanTai.class.getName();
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
	* Returns the primary key of this qlvt xu ly gp lien van loai hinh van tai.
	*
	* @return the primary key of this qlvt xu ly gp lien van loai hinh van tai
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtXuLyGpLienVanLoaiHinhVanTai.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt xu ly gp lien van loai hinh van tai.
	*
	* @param primaryKey the primary key of this qlvt xu ly gp lien van loai hinh van tai
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtXuLyGpLienVanLoaiHinhVanTai.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt xu ly gp lien van loai hinh van tai.
	*
	* @return the ID of this qlvt xu ly gp lien van loai hinh van tai
	*/
	@Override
	public long getId() {
		return _qlvtXuLyGpLienVanLoaiHinhVanTai.getId();
	}

	/**
	* Sets the ID of this qlvt xu ly gp lien van loai hinh van tai.
	*
	* @param id the ID of this qlvt xu ly gp lien van loai hinh van tai
	*/
	@Override
	public void setId(long id) {
		_qlvtXuLyGpLienVanLoaiHinhVanTai.setId(id);
	}

	/**
	* Returns the gp lien van ID of this qlvt xu ly gp lien van loai hinh van tai.
	*
	* @return the gp lien van ID of this qlvt xu ly gp lien van loai hinh van tai
	*/
	@Override
	public long getGpLienVanId() {
		return _qlvtXuLyGpLienVanLoaiHinhVanTai.getGpLienVanId();
	}

	/**
	* Sets the gp lien van ID of this qlvt xu ly gp lien van loai hinh van tai.
	*
	* @param gpLienVanId the gp lien van ID of this qlvt xu ly gp lien van loai hinh van tai
	*/
	@Override
	public void setGpLienVanId(long gpLienVanId) {
		_qlvtXuLyGpLienVanLoaiHinhVanTai.setGpLienVanId(gpLienVanId);
	}

	/**
	* Returns the ma loai hinh van tai of this qlvt xu ly gp lien van loai hinh van tai.
	*
	* @return the ma loai hinh van tai of this qlvt xu ly gp lien van loai hinh van tai
	*/
	@Override
	public java.lang.String getMaLoaiHinhVanTai() {
		return _qlvtXuLyGpLienVanLoaiHinhVanTai.getMaLoaiHinhVanTai();
	}

	/**
	* Sets the ma loai hinh van tai of this qlvt xu ly gp lien van loai hinh van tai.
	*
	* @param maLoaiHinhVanTai the ma loai hinh van tai of this qlvt xu ly gp lien van loai hinh van tai
	*/
	@Override
	public void setMaLoaiHinhVanTai(java.lang.String maLoaiHinhVanTai) {
		_qlvtXuLyGpLienVanLoaiHinhVanTai.setMaLoaiHinhVanTai(maLoaiHinhVanTai);
	}

	@Override
	public boolean isNew() {
		return _qlvtXuLyGpLienVanLoaiHinhVanTai.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtXuLyGpLienVanLoaiHinhVanTai.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtXuLyGpLienVanLoaiHinhVanTai.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtXuLyGpLienVanLoaiHinhVanTai.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtXuLyGpLienVanLoaiHinhVanTai.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtXuLyGpLienVanLoaiHinhVanTai.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtXuLyGpLienVanLoaiHinhVanTai.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtXuLyGpLienVanLoaiHinhVanTai.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtXuLyGpLienVanLoaiHinhVanTai.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtXuLyGpLienVanLoaiHinhVanTai.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtXuLyGpLienVanLoaiHinhVanTai.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtXuLyGpLienVanLoaiHinhVanTaiWrapper((QlvtXuLyGpLienVanLoaiHinhVanTai)_qlvtXuLyGpLienVanLoaiHinhVanTai.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanLoaiHinhVanTai qlvtXuLyGpLienVanLoaiHinhVanTai) {
		return _qlvtXuLyGpLienVanLoaiHinhVanTai.compareTo(qlvtXuLyGpLienVanLoaiHinhVanTai);
	}

	@Override
	public int hashCode() {
		return _qlvtXuLyGpLienVanLoaiHinhVanTai.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanLoaiHinhVanTai> toCacheModel() {
		return _qlvtXuLyGpLienVanLoaiHinhVanTai.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanLoaiHinhVanTai toEscapedModel() {
		return new QlvtXuLyGpLienVanLoaiHinhVanTaiWrapper(_qlvtXuLyGpLienVanLoaiHinhVanTai.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanLoaiHinhVanTai toUnescapedModel() {
		return new QlvtXuLyGpLienVanLoaiHinhVanTaiWrapper(_qlvtXuLyGpLienVanLoaiHinhVanTai.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtXuLyGpLienVanLoaiHinhVanTai.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtXuLyGpLienVanLoaiHinhVanTai.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtXuLyGpLienVanLoaiHinhVanTai.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtXuLyGpLienVanLoaiHinhVanTaiWrapper)) {
			return false;
		}

		QlvtXuLyGpLienVanLoaiHinhVanTaiWrapper qlvtXuLyGpLienVanLoaiHinhVanTaiWrapper =
			(QlvtXuLyGpLienVanLoaiHinhVanTaiWrapper)obj;

		if (Validator.equals(_qlvtXuLyGpLienVanLoaiHinhVanTai,
					qlvtXuLyGpLienVanLoaiHinhVanTaiWrapper._qlvtXuLyGpLienVanLoaiHinhVanTai)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtXuLyGpLienVanLoaiHinhVanTai getWrappedQlvtXuLyGpLienVanLoaiHinhVanTai() {
		return _qlvtXuLyGpLienVanLoaiHinhVanTai;
	}

	@Override
	public QlvtXuLyGpLienVanLoaiHinhVanTai getWrappedModel() {
		return _qlvtXuLyGpLienVanLoaiHinhVanTai;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtXuLyGpLienVanLoaiHinhVanTai.resetOriginalValues();
	}

	private QlvtXuLyGpLienVanLoaiHinhVanTai _qlvtXuLyGpLienVanLoaiHinhVanTai;
}