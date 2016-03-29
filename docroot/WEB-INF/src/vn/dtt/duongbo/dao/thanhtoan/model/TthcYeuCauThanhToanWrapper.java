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

package vn.dtt.duongbo.dao.thanhtoan.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TthcYeuCauThanhToan}.
 * </p>
 *
 * @author win_64
 * @see TthcYeuCauThanhToan
 * @generated
 */
public class TthcYeuCauThanhToanWrapper implements TthcYeuCauThanhToan,
	ModelWrapper<TthcYeuCauThanhToan> {
	public TthcYeuCauThanhToanWrapper(TthcYeuCauThanhToan tthcYeuCauThanhToan) {
		_tthcYeuCauThanhToan = tthcYeuCauThanhToan;
	}

	@Override
	public Class<?> getModelClass() {
		return TthcYeuCauThanhToan.class;
	}

	@Override
	public String getModelClassName() {
		return TthcYeuCauThanhToan.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("maSoYeuCau", getMaSoYeuCau());
		attributes.put("soTien", getSoTien());
		attributes.put("chiTietYeuCau", getChiTietYeuCau());
		attributes.put("ngayTao", getNgayTao());
		attributes.put("nguoiTao", getNguoiTao());
		attributes.put("toChucQuanLy", getToChucQuanLy());
		attributes.put("hoSoThuTucId", getHoSoThuTucId());
		attributes.put("xacNhanThanhToanId", getXacNhanThanhToanId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String maSoYeuCau = (String)attributes.get("maSoYeuCau");

		if (maSoYeuCau != null) {
			setMaSoYeuCau(maSoYeuCau);
		}

		Long soTien = (Long)attributes.get("soTien");

		if (soTien != null) {
			setSoTien(soTien);
		}

		String chiTietYeuCau = (String)attributes.get("chiTietYeuCau");

		if (chiTietYeuCau != null) {
			setChiTietYeuCau(chiTietYeuCau);
		}

		Date ngayTao = (Date)attributes.get("ngayTao");

		if (ngayTao != null) {
			setNgayTao(ngayTao);
		}

		Long nguoiTao = (Long)attributes.get("nguoiTao");

		if (nguoiTao != null) {
			setNguoiTao(nguoiTao);
		}

		Long toChucQuanLy = (Long)attributes.get("toChucQuanLy");

		if (toChucQuanLy != null) {
			setToChucQuanLy(toChucQuanLy);
		}

		Long hoSoThuTucId = (Long)attributes.get("hoSoThuTucId");

		if (hoSoThuTucId != null) {
			setHoSoThuTucId(hoSoThuTucId);
		}

		Long xacNhanThanhToanId = (Long)attributes.get("xacNhanThanhToanId");

		if (xacNhanThanhToanId != null) {
			setXacNhanThanhToanId(xacNhanThanhToanId);
		}
	}

	/**
	* Returns the primary key of this tthc yeu cau thanh toan.
	*
	* @return the primary key of this tthc yeu cau thanh toan
	*/
	@Override
	public long getPrimaryKey() {
		return _tthcYeuCauThanhToan.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tthc yeu cau thanh toan.
	*
	* @param primaryKey the primary key of this tthc yeu cau thanh toan
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tthcYeuCauThanhToan.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this tthc yeu cau thanh toan.
	*
	* @return the ID of this tthc yeu cau thanh toan
	*/
	@Override
	public long getId() {
		return _tthcYeuCauThanhToan.getId();
	}

	/**
	* Sets the ID of this tthc yeu cau thanh toan.
	*
	* @param id the ID of this tthc yeu cau thanh toan
	*/
	@Override
	public void setId(long id) {
		_tthcYeuCauThanhToan.setId(id);
	}

	/**
	* Returns the ma so yeu cau of this tthc yeu cau thanh toan.
	*
	* @return the ma so yeu cau of this tthc yeu cau thanh toan
	*/
	@Override
	public java.lang.String getMaSoYeuCau() {
		return _tthcYeuCauThanhToan.getMaSoYeuCau();
	}

	/**
	* Sets the ma so yeu cau of this tthc yeu cau thanh toan.
	*
	* @param maSoYeuCau the ma so yeu cau of this tthc yeu cau thanh toan
	*/
	@Override
	public void setMaSoYeuCau(java.lang.String maSoYeuCau) {
		_tthcYeuCauThanhToan.setMaSoYeuCau(maSoYeuCau);
	}

	/**
	* Returns the so tien of this tthc yeu cau thanh toan.
	*
	* @return the so tien of this tthc yeu cau thanh toan
	*/
	@Override
	public long getSoTien() {
		return _tthcYeuCauThanhToan.getSoTien();
	}

	/**
	* Sets the so tien of this tthc yeu cau thanh toan.
	*
	* @param soTien the so tien of this tthc yeu cau thanh toan
	*/
	@Override
	public void setSoTien(long soTien) {
		_tthcYeuCauThanhToan.setSoTien(soTien);
	}

	/**
	* Returns the chi tiet yeu cau of this tthc yeu cau thanh toan.
	*
	* @return the chi tiet yeu cau of this tthc yeu cau thanh toan
	*/
	@Override
	public java.lang.String getChiTietYeuCau() {
		return _tthcYeuCauThanhToan.getChiTietYeuCau();
	}

	/**
	* Sets the chi tiet yeu cau of this tthc yeu cau thanh toan.
	*
	* @param chiTietYeuCau the chi tiet yeu cau of this tthc yeu cau thanh toan
	*/
	@Override
	public void setChiTietYeuCau(java.lang.String chiTietYeuCau) {
		_tthcYeuCauThanhToan.setChiTietYeuCau(chiTietYeuCau);
	}

	/**
	* Returns the ngay tao of this tthc yeu cau thanh toan.
	*
	* @return the ngay tao of this tthc yeu cau thanh toan
	*/
	@Override
	public java.util.Date getNgayTao() {
		return _tthcYeuCauThanhToan.getNgayTao();
	}

	/**
	* Sets the ngay tao of this tthc yeu cau thanh toan.
	*
	* @param ngayTao the ngay tao of this tthc yeu cau thanh toan
	*/
	@Override
	public void setNgayTao(java.util.Date ngayTao) {
		_tthcYeuCauThanhToan.setNgayTao(ngayTao);
	}

	/**
	* Returns the nguoi tao of this tthc yeu cau thanh toan.
	*
	* @return the nguoi tao of this tthc yeu cau thanh toan
	*/
	@Override
	public long getNguoiTao() {
		return _tthcYeuCauThanhToan.getNguoiTao();
	}

	/**
	* Sets the nguoi tao of this tthc yeu cau thanh toan.
	*
	* @param nguoiTao the nguoi tao of this tthc yeu cau thanh toan
	*/
	@Override
	public void setNguoiTao(long nguoiTao) {
		_tthcYeuCauThanhToan.setNguoiTao(nguoiTao);
	}

	/**
	* Returns the to chuc quan ly of this tthc yeu cau thanh toan.
	*
	* @return the to chuc quan ly of this tthc yeu cau thanh toan
	*/
	@Override
	public long getToChucQuanLy() {
		return _tthcYeuCauThanhToan.getToChucQuanLy();
	}

	/**
	* Sets the to chuc quan ly of this tthc yeu cau thanh toan.
	*
	* @param toChucQuanLy the to chuc quan ly of this tthc yeu cau thanh toan
	*/
	@Override
	public void setToChucQuanLy(long toChucQuanLy) {
		_tthcYeuCauThanhToan.setToChucQuanLy(toChucQuanLy);
	}

	/**
	* Returns the ho so thu tuc ID of this tthc yeu cau thanh toan.
	*
	* @return the ho so thu tuc ID of this tthc yeu cau thanh toan
	*/
	@Override
	public long getHoSoThuTucId() {
		return _tthcYeuCauThanhToan.getHoSoThuTucId();
	}

	/**
	* Sets the ho so thu tuc ID of this tthc yeu cau thanh toan.
	*
	* @param hoSoThuTucId the ho so thu tuc ID of this tthc yeu cau thanh toan
	*/
	@Override
	public void setHoSoThuTucId(long hoSoThuTucId) {
		_tthcYeuCauThanhToan.setHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns the xac nhan thanh toan ID of this tthc yeu cau thanh toan.
	*
	* @return the xac nhan thanh toan ID of this tthc yeu cau thanh toan
	*/
	@Override
	public long getXacNhanThanhToanId() {
		return _tthcYeuCauThanhToan.getXacNhanThanhToanId();
	}

	/**
	* Sets the xac nhan thanh toan ID of this tthc yeu cau thanh toan.
	*
	* @param xacNhanThanhToanId the xac nhan thanh toan ID of this tthc yeu cau thanh toan
	*/
	@Override
	public void setXacNhanThanhToanId(long xacNhanThanhToanId) {
		_tthcYeuCauThanhToan.setXacNhanThanhToanId(xacNhanThanhToanId);
	}

	@Override
	public boolean isNew() {
		return _tthcYeuCauThanhToan.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tthcYeuCauThanhToan.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tthcYeuCauThanhToan.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tthcYeuCauThanhToan.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tthcYeuCauThanhToan.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tthcYeuCauThanhToan.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tthcYeuCauThanhToan.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tthcYeuCauThanhToan.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tthcYeuCauThanhToan.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tthcYeuCauThanhToan.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tthcYeuCauThanhToan.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TthcYeuCauThanhToanWrapper((TthcYeuCauThanhToan)_tthcYeuCauThanhToan.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.thanhtoan.model.TthcYeuCauThanhToan tthcYeuCauThanhToan) {
		return _tthcYeuCauThanhToan.compareTo(tthcYeuCauThanhToan);
	}

	@Override
	public int hashCode() {
		return _tthcYeuCauThanhToan.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.thanhtoan.model.TthcYeuCauThanhToan> toCacheModel() {
		return _tthcYeuCauThanhToan.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcYeuCauThanhToan toEscapedModel() {
		return new TthcYeuCauThanhToanWrapper(_tthcYeuCauThanhToan.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcYeuCauThanhToan toUnescapedModel() {
		return new TthcYeuCauThanhToanWrapper(_tthcYeuCauThanhToan.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tthcYeuCauThanhToan.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tthcYeuCauThanhToan.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tthcYeuCauThanhToan.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TthcYeuCauThanhToanWrapper)) {
			return false;
		}

		TthcYeuCauThanhToanWrapper tthcYeuCauThanhToanWrapper = (TthcYeuCauThanhToanWrapper)obj;

		if (Validator.equals(_tthcYeuCauThanhToan,
					tthcYeuCauThanhToanWrapper._tthcYeuCauThanhToan)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TthcYeuCauThanhToan getWrappedTthcYeuCauThanhToan() {
		return _tthcYeuCauThanhToan;
	}

	@Override
	public TthcYeuCauThanhToan getWrappedModel() {
		return _tthcYeuCauThanhToan;
	}

	@Override
	public void resetOriginalValues() {
		_tthcYeuCauThanhToan.resetOriginalValues();
	}

	private TthcYeuCauThanhToan _tthcYeuCauThanhToan;
}