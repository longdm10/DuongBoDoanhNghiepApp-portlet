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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TthcThongBaoXuLy}.
 * </p>
 *
 * @author win_64
 * @see TthcThongBaoXuLy
 * @generated
 */
public class TthcThongBaoXuLyWrapper implements TthcThongBaoXuLy,
	ModelWrapper<TthcThongBaoXuLy> {
	public TthcThongBaoXuLyWrapper(TthcThongBaoXuLy tthcThongBaoXuLy) {
		_tthcThongBaoXuLy = tthcThongBaoXuLy;
	}

	@Override
	public Class<?> getModelClass() {
		return TthcThongBaoXuLy.class;
	}

	@Override
	public String getModelClassName() {
		return TthcThongBaoXuLy.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("hoSoThuTucId", getHoSoThuTucId());
		attributes.put("maThongBao", getMaThongBao());
		attributes.put("noiDungThongBao", getNoiDungThongBao());
		attributes.put("duLieuThongBao", getDuLieuThongBao());
		attributes.put("ngayGio", getNgayGio());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long hoSoThuTucId = (Long)attributes.get("hoSoThuTucId");

		if (hoSoThuTucId != null) {
			setHoSoThuTucId(hoSoThuTucId);
		}

		String maThongBao = (String)attributes.get("maThongBao");

		if (maThongBao != null) {
			setMaThongBao(maThongBao);
		}

		String noiDungThongBao = (String)attributes.get("noiDungThongBao");

		if (noiDungThongBao != null) {
			setNoiDungThongBao(noiDungThongBao);
		}

		String duLieuThongBao = (String)attributes.get("duLieuThongBao");

		if (duLieuThongBao != null) {
			setDuLieuThongBao(duLieuThongBao);
		}

		Date ngayGio = (Date)attributes.get("ngayGio");

		if (ngayGio != null) {
			setNgayGio(ngayGio);
		}
	}

	/**
	* Returns the primary key of this tthc thong bao xu ly.
	*
	* @return the primary key of this tthc thong bao xu ly
	*/
	@Override
	public long getPrimaryKey() {
		return _tthcThongBaoXuLy.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tthc thong bao xu ly.
	*
	* @param primaryKey the primary key of this tthc thong bao xu ly
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tthcThongBaoXuLy.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this tthc thong bao xu ly.
	*
	* @return the ID of this tthc thong bao xu ly
	*/
	@Override
	public long getId() {
		return _tthcThongBaoXuLy.getId();
	}

	/**
	* Sets the ID of this tthc thong bao xu ly.
	*
	* @param id the ID of this tthc thong bao xu ly
	*/
	@Override
	public void setId(long id) {
		_tthcThongBaoXuLy.setId(id);
	}

	/**
	* Returns the ho so thu tuc ID of this tthc thong bao xu ly.
	*
	* @return the ho so thu tuc ID of this tthc thong bao xu ly
	*/
	@Override
	public long getHoSoThuTucId() {
		return _tthcThongBaoXuLy.getHoSoThuTucId();
	}

	/**
	* Sets the ho so thu tuc ID of this tthc thong bao xu ly.
	*
	* @param hoSoThuTucId the ho so thu tuc ID of this tthc thong bao xu ly
	*/
	@Override
	public void setHoSoThuTucId(long hoSoThuTucId) {
		_tthcThongBaoXuLy.setHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns the ma thong bao of this tthc thong bao xu ly.
	*
	* @return the ma thong bao of this tthc thong bao xu ly
	*/
	@Override
	public java.lang.String getMaThongBao() {
		return _tthcThongBaoXuLy.getMaThongBao();
	}

	/**
	* Sets the ma thong bao of this tthc thong bao xu ly.
	*
	* @param maThongBao the ma thong bao of this tthc thong bao xu ly
	*/
	@Override
	public void setMaThongBao(java.lang.String maThongBao) {
		_tthcThongBaoXuLy.setMaThongBao(maThongBao);
	}

	/**
	* Returns the noi dung thong bao of this tthc thong bao xu ly.
	*
	* @return the noi dung thong bao of this tthc thong bao xu ly
	*/
	@Override
	public java.lang.String getNoiDungThongBao() {
		return _tthcThongBaoXuLy.getNoiDungThongBao();
	}

	/**
	* Sets the noi dung thong bao of this tthc thong bao xu ly.
	*
	* @param noiDungThongBao the noi dung thong bao of this tthc thong bao xu ly
	*/
	@Override
	public void setNoiDungThongBao(java.lang.String noiDungThongBao) {
		_tthcThongBaoXuLy.setNoiDungThongBao(noiDungThongBao);
	}

	/**
	* Returns the du lieu thong bao of this tthc thong bao xu ly.
	*
	* @return the du lieu thong bao of this tthc thong bao xu ly
	*/
	@Override
	public java.lang.String getDuLieuThongBao() {
		return _tthcThongBaoXuLy.getDuLieuThongBao();
	}

	/**
	* Sets the du lieu thong bao of this tthc thong bao xu ly.
	*
	* @param duLieuThongBao the du lieu thong bao of this tthc thong bao xu ly
	*/
	@Override
	public void setDuLieuThongBao(java.lang.String duLieuThongBao) {
		_tthcThongBaoXuLy.setDuLieuThongBao(duLieuThongBao);
	}

	/**
	* Returns the ngay gio of this tthc thong bao xu ly.
	*
	* @return the ngay gio of this tthc thong bao xu ly
	*/
	@Override
	public java.util.Date getNgayGio() {
		return _tthcThongBaoXuLy.getNgayGio();
	}

	/**
	* Sets the ngay gio of this tthc thong bao xu ly.
	*
	* @param ngayGio the ngay gio of this tthc thong bao xu ly
	*/
	@Override
	public void setNgayGio(java.util.Date ngayGio) {
		_tthcThongBaoXuLy.setNgayGio(ngayGio);
	}

	@Override
	public boolean isNew() {
		return _tthcThongBaoXuLy.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tthcThongBaoXuLy.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tthcThongBaoXuLy.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tthcThongBaoXuLy.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tthcThongBaoXuLy.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tthcThongBaoXuLy.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tthcThongBaoXuLy.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tthcThongBaoXuLy.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tthcThongBaoXuLy.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tthcThongBaoXuLy.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tthcThongBaoXuLy.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TthcThongBaoXuLyWrapper((TthcThongBaoXuLy)_tthcThongBaoXuLy.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.common.model.TthcThongBaoXuLy tthcThongBaoXuLy) {
		return _tthcThongBaoXuLy.compareTo(tthcThongBaoXuLy);
	}

	@Override
	public int hashCode() {
		return _tthcThongBaoXuLy.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.common.model.TthcThongBaoXuLy> toCacheModel() {
		return _tthcThongBaoXuLy.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.TthcThongBaoXuLy toEscapedModel() {
		return new TthcThongBaoXuLyWrapper(_tthcThongBaoXuLy.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.TthcThongBaoXuLy toUnescapedModel() {
		return new TthcThongBaoXuLyWrapper(_tthcThongBaoXuLy.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tthcThongBaoXuLy.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tthcThongBaoXuLy.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tthcThongBaoXuLy.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TthcThongBaoXuLyWrapper)) {
			return false;
		}

		TthcThongBaoXuLyWrapper tthcThongBaoXuLyWrapper = (TthcThongBaoXuLyWrapper)obj;

		if (Validator.equals(_tthcThongBaoXuLy,
					tthcThongBaoXuLyWrapper._tthcThongBaoXuLy)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TthcThongBaoXuLy getWrappedTthcThongBaoXuLy() {
		return _tthcThongBaoXuLy;
	}

	@Override
	public TthcThongBaoXuLy getWrappedModel() {
		return _tthcThongBaoXuLy;
	}

	@Override
	public void resetOriginalValues() {
		_tthcThongBaoXuLy.resetOriginalValues();
	}

	private TthcThongBaoXuLy _tthcThongBaoXuLy;
}