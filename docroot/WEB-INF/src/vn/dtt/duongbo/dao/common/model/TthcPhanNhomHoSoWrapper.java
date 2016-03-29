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
 * This class is a wrapper for {@link TthcPhanNhomHoSo}.
 * </p>
 *
 * @author win_64
 * @see TthcPhanNhomHoSo
 * @generated
 */
public class TthcPhanNhomHoSoWrapper implements TthcPhanNhomHoSo,
	ModelWrapper<TthcPhanNhomHoSo> {
	public TthcPhanNhomHoSoWrapper(TthcPhanNhomHoSo tthcPhanNhomHoSo) {
		_tthcPhanNhomHoSo = tthcPhanNhomHoSo;
	}

	@Override
	public Class<?> getModelClass() {
		return TthcPhanNhomHoSo.class;
	}

	@Override
	public String getModelClassName() {
		return TthcPhanNhomHoSo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("maPhanNhom", getMaPhanNhom());
		attributes.put("tenPhanNhom", getTenPhanNhom());
		attributes.put("tenTiengAnh", getTenTiengAnh());
		attributes.put("soThuTu", getSoThuTu());
		attributes.put("loaiPhanNhom", getLoaiPhanNhom());
		attributes.put("toChucQuanLy", getToChucQuanLy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String maPhanNhom = (String)attributes.get("maPhanNhom");

		if (maPhanNhom != null) {
			setMaPhanNhom(maPhanNhom);
		}

		String tenPhanNhom = (String)attributes.get("tenPhanNhom");

		if (tenPhanNhom != null) {
			setTenPhanNhom(tenPhanNhom);
		}

		String tenTiengAnh = (String)attributes.get("tenTiengAnh");

		if (tenTiengAnh != null) {
			setTenTiengAnh(tenTiengAnh);
		}

		Integer soThuTu = (Integer)attributes.get("soThuTu");

		if (soThuTu != null) {
			setSoThuTu(soThuTu);
		}

		Integer loaiPhanNhom = (Integer)attributes.get("loaiPhanNhom");

		if (loaiPhanNhom != null) {
			setLoaiPhanNhom(loaiPhanNhom);
		}

		Long toChucQuanLy = (Long)attributes.get("toChucQuanLy");

		if (toChucQuanLy != null) {
			setToChucQuanLy(toChucQuanLy);
		}
	}

	/**
	* Returns the primary key of this tthc phan nhom ho so.
	*
	* @return the primary key of this tthc phan nhom ho so
	*/
	@Override
	public long getPrimaryKey() {
		return _tthcPhanNhomHoSo.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tthc phan nhom ho so.
	*
	* @param primaryKey the primary key of this tthc phan nhom ho so
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tthcPhanNhomHoSo.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this tthc phan nhom ho so.
	*
	* @return the ID of this tthc phan nhom ho so
	*/
	@Override
	public long getId() {
		return _tthcPhanNhomHoSo.getId();
	}

	/**
	* Sets the ID of this tthc phan nhom ho so.
	*
	* @param id the ID of this tthc phan nhom ho so
	*/
	@Override
	public void setId(long id) {
		_tthcPhanNhomHoSo.setId(id);
	}

	/**
	* Returns the ma phan nhom of this tthc phan nhom ho so.
	*
	* @return the ma phan nhom of this tthc phan nhom ho so
	*/
	@Override
	public java.lang.String getMaPhanNhom() {
		return _tthcPhanNhomHoSo.getMaPhanNhom();
	}

	/**
	* Sets the ma phan nhom of this tthc phan nhom ho so.
	*
	* @param maPhanNhom the ma phan nhom of this tthc phan nhom ho so
	*/
	@Override
	public void setMaPhanNhom(java.lang.String maPhanNhom) {
		_tthcPhanNhomHoSo.setMaPhanNhom(maPhanNhom);
	}

	/**
	* Returns the ten phan nhom of this tthc phan nhom ho so.
	*
	* @return the ten phan nhom of this tthc phan nhom ho so
	*/
	@Override
	public java.lang.String getTenPhanNhom() {
		return _tthcPhanNhomHoSo.getTenPhanNhom();
	}

	/**
	* Sets the ten phan nhom of this tthc phan nhom ho so.
	*
	* @param tenPhanNhom the ten phan nhom of this tthc phan nhom ho so
	*/
	@Override
	public void setTenPhanNhom(java.lang.String tenPhanNhom) {
		_tthcPhanNhomHoSo.setTenPhanNhom(tenPhanNhom);
	}

	/**
	* Returns the ten tieng anh of this tthc phan nhom ho so.
	*
	* @return the ten tieng anh of this tthc phan nhom ho so
	*/
	@Override
	public java.lang.String getTenTiengAnh() {
		return _tthcPhanNhomHoSo.getTenTiengAnh();
	}

	/**
	* Sets the ten tieng anh of this tthc phan nhom ho so.
	*
	* @param tenTiengAnh the ten tieng anh of this tthc phan nhom ho so
	*/
	@Override
	public void setTenTiengAnh(java.lang.String tenTiengAnh) {
		_tthcPhanNhomHoSo.setTenTiengAnh(tenTiengAnh);
	}

	/**
	* Returns the so thu tu of this tthc phan nhom ho so.
	*
	* @return the so thu tu of this tthc phan nhom ho so
	*/
	@Override
	public int getSoThuTu() {
		return _tthcPhanNhomHoSo.getSoThuTu();
	}

	/**
	* Sets the so thu tu of this tthc phan nhom ho so.
	*
	* @param soThuTu the so thu tu of this tthc phan nhom ho so
	*/
	@Override
	public void setSoThuTu(int soThuTu) {
		_tthcPhanNhomHoSo.setSoThuTu(soThuTu);
	}

	/**
	* Returns the loai phan nhom of this tthc phan nhom ho so.
	*
	* @return the loai phan nhom of this tthc phan nhom ho so
	*/
	@Override
	public int getLoaiPhanNhom() {
		return _tthcPhanNhomHoSo.getLoaiPhanNhom();
	}

	/**
	* Sets the loai phan nhom of this tthc phan nhom ho so.
	*
	* @param loaiPhanNhom the loai phan nhom of this tthc phan nhom ho so
	*/
	@Override
	public void setLoaiPhanNhom(int loaiPhanNhom) {
		_tthcPhanNhomHoSo.setLoaiPhanNhom(loaiPhanNhom);
	}

	/**
	* Returns the to chuc quan ly of this tthc phan nhom ho so.
	*
	* @return the to chuc quan ly of this tthc phan nhom ho so
	*/
	@Override
	public long getToChucQuanLy() {
		return _tthcPhanNhomHoSo.getToChucQuanLy();
	}

	/**
	* Sets the to chuc quan ly of this tthc phan nhom ho so.
	*
	* @param toChucQuanLy the to chuc quan ly of this tthc phan nhom ho so
	*/
	@Override
	public void setToChucQuanLy(long toChucQuanLy) {
		_tthcPhanNhomHoSo.setToChucQuanLy(toChucQuanLy);
	}

	@Override
	public boolean isNew() {
		return _tthcPhanNhomHoSo.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tthcPhanNhomHoSo.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tthcPhanNhomHoSo.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tthcPhanNhomHoSo.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tthcPhanNhomHoSo.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tthcPhanNhomHoSo.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tthcPhanNhomHoSo.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tthcPhanNhomHoSo.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tthcPhanNhomHoSo.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tthcPhanNhomHoSo.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tthcPhanNhomHoSo.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TthcPhanNhomHoSoWrapper((TthcPhanNhomHoSo)_tthcPhanNhomHoSo.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo tthcPhanNhomHoSo) {
		return _tthcPhanNhomHoSo.compareTo(tthcPhanNhomHoSo);
	}

	@Override
	public int hashCode() {
		return _tthcPhanNhomHoSo.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo> toCacheModel() {
		return _tthcPhanNhomHoSo.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo toEscapedModel() {
		return new TthcPhanNhomHoSoWrapper(_tthcPhanNhomHoSo.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo toUnescapedModel() {
		return new TthcPhanNhomHoSoWrapper(_tthcPhanNhomHoSo.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tthcPhanNhomHoSo.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tthcPhanNhomHoSo.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tthcPhanNhomHoSo.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TthcPhanNhomHoSoWrapper)) {
			return false;
		}

		TthcPhanNhomHoSoWrapper tthcPhanNhomHoSoWrapper = (TthcPhanNhomHoSoWrapper)obj;

		if (Validator.equals(_tthcPhanNhomHoSo,
					tthcPhanNhomHoSoWrapper._tthcPhanNhomHoSo)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TthcPhanNhomHoSo getWrappedTthcPhanNhomHoSo() {
		return _tthcPhanNhomHoSo;
	}

	@Override
	public TthcPhanNhomHoSo getWrappedModel() {
		return _tthcPhanNhomHoSo;
	}

	@Override
	public void resetOriginalValues() {
		_tthcPhanNhomHoSo.resetOriginalValues();
	}

	private TthcPhanNhomHoSo _tthcPhanNhomHoSo;
}