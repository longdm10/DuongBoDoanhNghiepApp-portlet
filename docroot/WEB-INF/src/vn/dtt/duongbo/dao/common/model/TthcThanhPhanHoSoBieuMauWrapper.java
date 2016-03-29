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

package vn.dtt.duongbo.dao.common.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TthcThanhPhanHoSoBieuMau}.
 * </p>
 *
 * @author win_64
 * @see TthcThanhPhanHoSoBieuMau
 * @generated
 */
public class TthcThanhPhanHoSoBieuMauWrapper implements TthcThanhPhanHoSoBieuMau,
	ModelWrapper<TthcThanhPhanHoSoBieuMau> {
	public TthcThanhPhanHoSoBieuMauWrapper(
		TthcThanhPhanHoSoBieuMau tthcThanhPhanHoSoBieuMau) {
		_tthcThanhPhanHoSoBieuMau = tthcThanhPhanHoSoBieuMau;
	}

	@Override
	public Class<?> getModelClass() {
		return TthcThanhPhanHoSoBieuMau.class;
	}

	@Override
	public String getModelClassName() {
		return TthcThanhPhanHoSoBieuMau.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("thanhPhanHoSoId", getThanhPhanHoSoId());
		attributes.put("bieuMauHoSoId", getBieuMauHoSoId());
		attributes.put("soThuTu", getSoThuTu());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long thanhPhanHoSoId = (Long)attributes.get("thanhPhanHoSoId");

		if (thanhPhanHoSoId != null) {
			setThanhPhanHoSoId(thanhPhanHoSoId);
		}

		Long bieuMauHoSoId = (Long)attributes.get("bieuMauHoSoId");

		if (bieuMauHoSoId != null) {
			setBieuMauHoSoId(bieuMauHoSoId);
		}

		Integer soThuTu = (Integer)attributes.get("soThuTu");

		if (soThuTu != null) {
			setSoThuTu(soThuTu);
		}
	}

	/**
	* Returns the primary key of this tthc thanh phan ho so bieu mau.
	*
	* @return the primary key of this tthc thanh phan ho so bieu mau
	*/
	@Override
	public long getPrimaryKey() {
		return _tthcThanhPhanHoSoBieuMau.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tthc thanh phan ho so bieu mau.
	*
	* @param primaryKey the primary key of this tthc thanh phan ho so bieu mau
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tthcThanhPhanHoSoBieuMau.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this tthc thanh phan ho so bieu mau.
	*
	* @return the ID of this tthc thanh phan ho so bieu mau
	*/
	@Override
	public long getId() {
		return _tthcThanhPhanHoSoBieuMau.getId();
	}

	/**
	* Sets the ID of this tthc thanh phan ho so bieu mau.
	*
	* @param id the ID of this tthc thanh phan ho so bieu mau
	*/
	@Override
	public void setId(long id) {
		_tthcThanhPhanHoSoBieuMau.setId(id);
	}

	/**
	* Returns the thanh phan ho so ID of this tthc thanh phan ho so bieu mau.
	*
	* @return the thanh phan ho so ID of this tthc thanh phan ho so bieu mau
	*/
	@Override
	public long getThanhPhanHoSoId() {
		return _tthcThanhPhanHoSoBieuMau.getThanhPhanHoSoId();
	}

	/**
	* Sets the thanh phan ho so ID of this tthc thanh phan ho so bieu mau.
	*
	* @param thanhPhanHoSoId the thanh phan ho so ID of this tthc thanh phan ho so bieu mau
	*/
	@Override
	public void setThanhPhanHoSoId(long thanhPhanHoSoId) {
		_tthcThanhPhanHoSoBieuMau.setThanhPhanHoSoId(thanhPhanHoSoId);
	}

	/**
	* Returns the bieu mau ho so ID of this tthc thanh phan ho so bieu mau.
	*
	* @return the bieu mau ho so ID of this tthc thanh phan ho so bieu mau
	*/
	@Override
	public long getBieuMauHoSoId() {
		return _tthcThanhPhanHoSoBieuMau.getBieuMauHoSoId();
	}

	/**
	* Sets the bieu mau ho so ID of this tthc thanh phan ho so bieu mau.
	*
	* @param bieuMauHoSoId the bieu mau ho so ID of this tthc thanh phan ho so bieu mau
	*/
	@Override
	public void setBieuMauHoSoId(long bieuMauHoSoId) {
		_tthcThanhPhanHoSoBieuMau.setBieuMauHoSoId(bieuMauHoSoId);
	}

	/**
	* Returns the so thu tu of this tthc thanh phan ho so bieu mau.
	*
	* @return the so thu tu of this tthc thanh phan ho so bieu mau
	*/
	@Override
	public int getSoThuTu() {
		return _tthcThanhPhanHoSoBieuMau.getSoThuTu();
	}

	/**
	* Sets the so thu tu of this tthc thanh phan ho so bieu mau.
	*
	* @param soThuTu the so thu tu of this tthc thanh phan ho so bieu mau
	*/
	@Override
	public void setSoThuTu(int soThuTu) {
		_tthcThanhPhanHoSoBieuMau.setSoThuTu(soThuTu);
	}

	@Override
	public boolean isNew() {
		return _tthcThanhPhanHoSoBieuMau.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tthcThanhPhanHoSoBieuMau.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tthcThanhPhanHoSoBieuMau.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tthcThanhPhanHoSoBieuMau.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tthcThanhPhanHoSoBieuMau.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tthcThanhPhanHoSoBieuMau.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tthcThanhPhanHoSoBieuMau.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tthcThanhPhanHoSoBieuMau.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tthcThanhPhanHoSoBieuMau.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tthcThanhPhanHoSoBieuMau.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tthcThanhPhanHoSoBieuMau.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TthcThanhPhanHoSoBieuMauWrapper((TthcThanhPhanHoSoBieuMau)_tthcThanhPhanHoSoBieuMau.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau tthcThanhPhanHoSoBieuMau) {
		return _tthcThanhPhanHoSoBieuMau.compareTo(tthcThanhPhanHoSoBieuMau);
	}

	@Override
	public int hashCode() {
		return _tthcThanhPhanHoSoBieuMau.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau> toCacheModel() {
		return _tthcThanhPhanHoSoBieuMau.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau toEscapedModel() {
		return new TthcThanhPhanHoSoBieuMauWrapper(_tthcThanhPhanHoSoBieuMau.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau toUnescapedModel() {
		return new TthcThanhPhanHoSoBieuMauWrapper(_tthcThanhPhanHoSoBieuMau.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tthcThanhPhanHoSoBieuMau.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tthcThanhPhanHoSoBieuMau.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tthcThanhPhanHoSoBieuMau.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TthcThanhPhanHoSoBieuMauWrapper)) {
			return false;
		}

		TthcThanhPhanHoSoBieuMauWrapper tthcThanhPhanHoSoBieuMauWrapper = (TthcThanhPhanHoSoBieuMauWrapper)obj;

		if (Validator.equals(_tthcThanhPhanHoSoBieuMau,
					tthcThanhPhanHoSoBieuMauWrapper._tthcThanhPhanHoSoBieuMau)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TthcThanhPhanHoSoBieuMau getWrappedTthcThanhPhanHoSoBieuMau() {
		return _tthcThanhPhanHoSoBieuMau;
	}

	@Override
	public TthcThanhPhanHoSoBieuMau getWrappedModel() {
		return _tthcThanhPhanHoSoBieuMau;
	}

	@Override
	public void resetOriginalValues() {
		_tthcThanhPhanHoSoBieuMau.resetOriginalValues();
	}

	private TthcThanhPhanHoSoBieuMau _tthcThanhPhanHoSoBieuMau;
}