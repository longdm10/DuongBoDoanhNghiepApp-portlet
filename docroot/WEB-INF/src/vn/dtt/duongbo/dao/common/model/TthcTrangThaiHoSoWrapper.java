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
 * This class is a wrapper for {@link TthcTrangThaiHoSo}.
 * </p>
 *
 * @author win_64
 * @see TthcTrangThaiHoSo
 * @generated
 */
public class TthcTrangThaiHoSoWrapper implements TthcTrangThaiHoSo,
	ModelWrapper<TthcTrangThaiHoSo> {
	public TthcTrangThaiHoSoWrapper(TthcTrangThaiHoSo tthcTrangThaiHoSo) {
		_tthcTrangThaiHoSo = tthcTrangThaiHoSo;
	}

	@Override
	public Class<?> getModelClass() {
		return TthcTrangThaiHoSo.class;
	}

	@Override
	public String getModelClassName() {
		return TthcTrangThaiHoSo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("quyTrinhThuTucId", getQuyTrinhThuTucId());
		attributes.put("maTrangThai", getMaTrangThai());
		attributes.put("tenTrangThai", getTenTrangThai());
		attributes.put("tenTiengAnh", getTenTiengAnh());
		attributes.put("soThuTu", getSoThuTu());
		attributes.put("trangThaiKetThuc", getTrangThaiKetThuc());
		attributes.put("moTaTrangThai", getMoTaTrangThai());
		attributes.put("vaiTroXuLy1", getVaiTroXuLy1());
		attributes.put("vaiTroXuLy2", getVaiTroXuLy2());
		attributes.put("vaiTroXuLy3", getVaiTroXuLy3());
		attributes.put("formXuLy", getFormXuLy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long quyTrinhThuTucId = (Long)attributes.get("quyTrinhThuTucId");

		if (quyTrinhThuTucId != null) {
			setQuyTrinhThuTucId(quyTrinhThuTucId);
		}

		String maTrangThai = (String)attributes.get("maTrangThai");

		if (maTrangThai != null) {
			setMaTrangThai(maTrangThai);
		}

		String tenTrangThai = (String)attributes.get("tenTrangThai");

		if (tenTrangThai != null) {
			setTenTrangThai(tenTrangThai);
		}

		String tenTiengAnh = (String)attributes.get("tenTiengAnh");

		if (tenTiengAnh != null) {
			setTenTiengAnh(tenTiengAnh);
		}

		Integer soThuTu = (Integer)attributes.get("soThuTu");

		if (soThuTu != null) {
			setSoThuTu(soThuTu);
		}

		Integer trangThaiKetThuc = (Integer)attributes.get("trangThaiKetThuc");

		if (trangThaiKetThuc != null) {
			setTrangThaiKetThuc(trangThaiKetThuc);
		}

		String moTaTrangThai = (String)attributes.get("moTaTrangThai");

		if (moTaTrangThai != null) {
			setMoTaTrangThai(moTaTrangThai);
		}

		Long vaiTroXuLy1 = (Long)attributes.get("vaiTroXuLy1");

		if (vaiTroXuLy1 != null) {
			setVaiTroXuLy1(vaiTroXuLy1);
		}

		Long vaiTroXuLy2 = (Long)attributes.get("vaiTroXuLy2");

		if (vaiTroXuLy2 != null) {
			setVaiTroXuLy2(vaiTroXuLy2);
		}

		Long vaiTroXuLy3 = (Long)attributes.get("vaiTroXuLy3");

		if (vaiTroXuLy3 != null) {
			setVaiTroXuLy3(vaiTroXuLy3);
		}

		String formXuLy = (String)attributes.get("formXuLy");

		if (formXuLy != null) {
			setFormXuLy(formXuLy);
		}
	}

	/**
	* Returns the primary key of this tthc trang thai ho so.
	*
	* @return the primary key of this tthc trang thai ho so
	*/
	@Override
	public long getPrimaryKey() {
		return _tthcTrangThaiHoSo.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tthc trang thai ho so.
	*
	* @param primaryKey the primary key of this tthc trang thai ho so
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tthcTrangThaiHoSo.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this tthc trang thai ho so.
	*
	* @return the ID of this tthc trang thai ho so
	*/
	@Override
	public long getId() {
		return _tthcTrangThaiHoSo.getId();
	}

	/**
	* Sets the ID of this tthc trang thai ho so.
	*
	* @param id the ID of this tthc trang thai ho so
	*/
	@Override
	public void setId(long id) {
		_tthcTrangThaiHoSo.setId(id);
	}

	/**
	* Returns the quy trinh thu tuc ID of this tthc trang thai ho so.
	*
	* @return the quy trinh thu tuc ID of this tthc trang thai ho so
	*/
	@Override
	public long getQuyTrinhThuTucId() {
		return _tthcTrangThaiHoSo.getQuyTrinhThuTucId();
	}

	/**
	* Sets the quy trinh thu tuc ID of this tthc trang thai ho so.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID of this tthc trang thai ho so
	*/
	@Override
	public void setQuyTrinhThuTucId(long quyTrinhThuTucId) {
		_tthcTrangThaiHoSo.setQuyTrinhThuTucId(quyTrinhThuTucId);
	}

	/**
	* Returns the ma trang thai of this tthc trang thai ho so.
	*
	* @return the ma trang thai of this tthc trang thai ho so
	*/
	@Override
	public java.lang.String getMaTrangThai() {
		return _tthcTrangThaiHoSo.getMaTrangThai();
	}

	/**
	* Sets the ma trang thai of this tthc trang thai ho so.
	*
	* @param maTrangThai the ma trang thai of this tthc trang thai ho so
	*/
	@Override
	public void setMaTrangThai(java.lang.String maTrangThai) {
		_tthcTrangThaiHoSo.setMaTrangThai(maTrangThai);
	}

	/**
	* Returns the ten trang thai of this tthc trang thai ho so.
	*
	* @return the ten trang thai of this tthc trang thai ho so
	*/
	@Override
	public java.lang.String getTenTrangThai() {
		return _tthcTrangThaiHoSo.getTenTrangThai();
	}

	/**
	* Sets the ten trang thai of this tthc trang thai ho so.
	*
	* @param tenTrangThai the ten trang thai of this tthc trang thai ho so
	*/
	@Override
	public void setTenTrangThai(java.lang.String tenTrangThai) {
		_tthcTrangThaiHoSo.setTenTrangThai(tenTrangThai);
	}

	/**
	* Returns the ten tieng anh of this tthc trang thai ho so.
	*
	* @return the ten tieng anh of this tthc trang thai ho so
	*/
	@Override
	public java.lang.String getTenTiengAnh() {
		return _tthcTrangThaiHoSo.getTenTiengAnh();
	}

	/**
	* Sets the ten tieng anh of this tthc trang thai ho so.
	*
	* @param tenTiengAnh the ten tieng anh of this tthc trang thai ho so
	*/
	@Override
	public void setTenTiengAnh(java.lang.String tenTiengAnh) {
		_tthcTrangThaiHoSo.setTenTiengAnh(tenTiengAnh);
	}

	/**
	* Returns the so thu tu of this tthc trang thai ho so.
	*
	* @return the so thu tu of this tthc trang thai ho so
	*/
	@Override
	public int getSoThuTu() {
		return _tthcTrangThaiHoSo.getSoThuTu();
	}

	/**
	* Sets the so thu tu of this tthc trang thai ho so.
	*
	* @param soThuTu the so thu tu of this tthc trang thai ho so
	*/
	@Override
	public void setSoThuTu(int soThuTu) {
		_tthcTrangThaiHoSo.setSoThuTu(soThuTu);
	}

	/**
	* Returns the trang thai ket thuc of this tthc trang thai ho so.
	*
	* @return the trang thai ket thuc of this tthc trang thai ho so
	*/
	@Override
	public int getTrangThaiKetThuc() {
		return _tthcTrangThaiHoSo.getTrangThaiKetThuc();
	}

	/**
	* Sets the trang thai ket thuc of this tthc trang thai ho so.
	*
	* @param trangThaiKetThuc the trang thai ket thuc of this tthc trang thai ho so
	*/
	@Override
	public void setTrangThaiKetThuc(int trangThaiKetThuc) {
		_tthcTrangThaiHoSo.setTrangThaiKetThuc(trangThaiKetThuc);
	}

	/**
	* Returns the mo ta trang thai of this tthc trang thai ho so.
	*
	* @return the mo ta trang thai of this tthc trang thai ho so
	*/
	@Override
	public java.lang.String getMoTaTrangThai() {
		return _tthcTrangThaiHoSo.getMoTaTrangThai();
	}

	/**
	* Sets the mo ta trang thai of this tthc trang thai ho so.
	*
	* @param moTaTrangThai the mo ta trang thai of this tthc trang thai ho so
	*/
	@Override
	public void setMoTaTrangThai(java.lang.String moTaTrangThai) {
		_tthcTrangThaiHoSo.setMoTaTrangThai(moTaTrangThai);
	}

	/**
	* Returns the vai tro xu ly1 of this tthc trang thai ho so.
	*
	* @return the vai tro xu ly1 of this tthc trang thai ho so
	*/
	@Override
	public long getVaiTroXuLy1() {
		return _tthcTrangThaiHoSo.getVaiTroXuLy1();
	}

	/**
	* Sets the vai tro xu ly1 of this tthc trang thai ho so.
	*
	* @param vaiTroXuLy1 the vai tro xu ly1 of this tthc trang thai ho so
	*/
	@Override
	public void setVaiTroXuLy1(long vaiTroXuLy1) {
		_tthcTrangThaiHoSo.setVaiTroXuLy1(vaiTroXuLy1);
	}

	/**
	* Returns the vai tro xu ly2 of this tthc trang thai ho so.
	*
	* @return the vai tro xu ly2 of this tthc trang thai ho so
	*/
	@Override
	public long getVaiTroXuLy2() {
		return _tthcTrangThaiHoSo.getVaiTroXuLy2();
	}

	/**
	* Sets the vai tro xu ly2 of this tthc trang thai ho so.
	*
	* @param vaiTroXuLy2 the vai tro xu ly2 of this tthc trang thai ho so
	*/
	@Override
	public void setVaiTroXuLy2(long vaiTroXuLy2) {
		_tthcTrangThaiHoSo.setVaiTroXuLy2(vaiTroXuLy2);
	}

	/**
	* Returns the vai tro xu ly3 of this tthc trang thai ho so.
	*
	* @return the vai tro xu ly3 of this tthc trang thai ho so
	*/
	@Override
	public long getVaiTroXuLy3() {
		return _tthcTrangThaiHoSo.getVaiTroXuLy3();
	}

	/**
	* Sets the vai tro xu ly3 of this tthc trang thai ho so.
	*
	* @param vaiTroXuLy3 the vai tro xu ly3 of this tthc trang thai ho so
	*/
	@Override
	public void setVaiTroXuLy3(long vaiTroXuLy3) {
		_tthcTrangThaiHoSo.setVaiTroXuLy3(vaiTroXuLy3);
	}

	/**
	* Returns the form xu ly of this tthc trang thai ho so.
	*
	* @return the form xu ly of this tthc trang thai ho so
	*/
	@Override
	public java.lang.String getFormXuLy() {
		return _tthcTrangThaiHoSo.getFormXuLy();
	}

	/**
	* Sets the form xu ly of this tthc trang thai ho so.
	*
	* @param formXuLy the form xu ly of this tthc trang thai ho so
	*/
	@Override
	public void setFormXuLy(java.lang.String formXuLy) {
		_tthcTrangThaiHoSo.setFormXuLy(formXuLy);
	}

	@Override
	public boolean isNew() {
		return _tthcTrangThaiHoSo.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tthcTrangThaiHoSo.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tthcTrangThaiHoSo.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tthcTrangThaiHoSo.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tthcTrangThaiHoSo.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tthcTrangThaiHoSo.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tthcTrangThaiHoSo.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tthcTrangThaiHoSo.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tthcTrangThaiHoSo.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tthcTrangThaiHoSo.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tthcTrangThaiHoSo.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TthcTrangThaiHoSoWrapper((TthcTrangThaiHoSo)_tthcTrangThaiHoSo.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.common.model.TthcTrangThaiHoSo tthcTrangThaiHoSo) {
		return _tthcTrangThaiHoSo.compareTo(tthcTrangThaiHoSo);
	}

	@Override
	public int hashCode() {
		return _tthcTrangThaiHoSo.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.common.model.TthcTrangThaiHoSo> toCacheModel() {
		return _tthcTrangThaiHoSo.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.TthcTrangThaiHoSo toEscapedModel() {
		return new TthcTrangThaiHoSoWrapper(_tthcTrangThaiHoSo.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.TthcTrangThaiHoSo toUnescapedModel() {
		return new TthcTrangThaiHoSoWrapper(_tthcTrangThaiHoSo.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tthcTrangThaiHoSo.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tthcTrangThaiHoSo.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tthcTrangThaiHoSo.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TthcTrangThaiHoSoWrapper)) {
			return false;
		}

		TthcTrangThaiHoSoWrapper tthcTrangThaiHoSoWrapper = (TthcTrangThaiHoSoWrapper)obj;

		if (Validator.equals(_tthcTrangThaiHoSo,
					tthcTrangThaiHoSoWrapper._tthcTrangThaiHoSo)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TthcTrangThaiHoSo getWrappedTthcTrangThaiHoSo() {
		return _tthcTrangThaiHoSo;
	}

	@Override
	public TthcTrangThaiHoSo getWrappedModel() {
		return _tthcTrangThaiHoSo;
	}

	@Override
	public void resetOriginalValues() {
		_tthcTrangThaiHoSo.resetOriginalValues();
	}

	private TthcTrangThaiHoSo _tthcTrangThaiHoSo;
}