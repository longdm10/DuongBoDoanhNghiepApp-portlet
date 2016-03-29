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

package vn.dtt.duongbo.dao.doanhnghiep.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DnDoanhNghiepUser}.
 * </p>
 *
 * @author win_64
 * @see DnDoanhNghiepUser
 * @generated
 */
public class DnDoanhNghiepUserWrapper implements DnDoanhNghiepUser,
	ModelWrapper<DnDoanhNghiepUser> {
	public DnDoanhNghiepUserWrapper(DnDoanhNghiepUser dnDoanhNghiepUser) {
		_dnDoanhNghiepUser = dnDoanhNghiepUser;
	}

	@Override
	public Class<?> getModelClass() {
		return DnDoanhNghiepUser.class;
	}

	@Override
	public String getModelClassName() {
		return DnDoanhNghiepUser.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("nguoiLamThuTucId", getNguoiLamThuTucId());
		attributes.put("userId", getUserId());
		attributes.put("toChucQuanLy", getToChucQuanLy());
		attributes.put("master", getMaster());
		attributes.put("tenTaiKhoan", getTenTaiKhoan());
		attributes.put("tenNguoiDung", getTenNguoiDung());
		attributes.put("tinhTrangHoatDong", getTinhTrangHoatDong());
		attributes.put("dienThoai", getDienThoai());
		attributes.put("ngayTaoTaiKhoan", getNgayTaoTaiKhoan());
		attributes.put("ngayMoTaiKhoan", getNgayMoTaiKhoan());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long nguoiLamThuTucId = (Long)attributes.get("nguoiLamThuTucId");

		if (nguoiLamThuTucId != null) {
			setNguoiLamThuTucId(nguoiLamThuTucId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String toChucQuanLy = (String)attributes.get("toChucQuanLy");

		if (toChucQuanLy != null) {
			setToChucQuanLy(toChucQuanLy);
		}

		String master = (String)attributes.get("master");

		if (master != null) {
			setMaster(master);
		}

		String tenTaiKhoan = (String)attributes.get("tenTaiKhoan");

		if (tenTaiKhoan != null) {
			setTenTaiKhoan(tenTaiKhoan);
		}

		String tenNguoiDung = (String)attributes.get("tenNguoiDung");

		if (tenNguoiDung != null) {
			setTenNguoiDung(tenNguoiDung);
		}

		String tinhTrangHoatDong = (String)attributes.get("tinhTrangHoatDong");

		if (tinhTrangHoatDong != null) {
			setTinhTrangHoatDong(tinhTrangHoatDong);
		}

		String dienThoai = (String)attributes.get("dienThoai");

		if (dienThoai != null) {
			setDienThoai(dienThoai);
		}

		Date ngayTaoTaiKhoan = (Date)attributes.get("ngayTaoTaiKhoan");

		if (ngayTaoTaiKhoan != null) {
			setNgayTaoTaiKhoan(ngayTaoTaiKhoan);
		}

		Date ngayMoTaiKhoan = (Date)attributes.get("ngayMoTaiKhoan");

		if (ngayMoTaiKhoan != null) {
			setNgayMoTaiKhoan(ngayMoTaiKhoan);
		}
	}

	/**
	* Returns the primary key of this dn doanh nghiep user.
	*
	* @return the primary key of this dn doanh nghiep user
	*/
	@Override
	public long getPrimaryKey() {
		return _dnDoanhNghiepUser.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dn doanh nghiep user.
	*
	* @param primaryKey the primary key of this dn doanh nghiep user
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dnDoanhNghiepUser.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dn doanh nghiep user.
	*
	* @return the ID of this dn doanh nghiep user
	*/
	@Override
	public long getId() {
		return _dnDoanhNghiepUser.getId();
	}

	/**
	* Sets the ID of this dn doanh nghiep user.
	*
	* @param id the ID of this dn doanh nghiep user
	*/
	@Override
	public void setId(long id) {
		_dnDoanhNghiepUser.setId(id);
	}

	/**
	* Returns the nguoi lam thu tuc ID of this dn doanh nghiep user.
	*
	* @return the nguoi lam thu tuc ID of this dn doanh nghiep user
	*/
	@Override
	public long getNguoiLamThuTucId() {
		return _dnDoanhNghiepUser.getNguoiLamThuTucId();
	}

	/**
	* Sets the nguoi lam thu tuc ID of this dn doanh nghiep user.
	*
	* @param nguoiLamThuTucId the nguoi lam thu tuc ID of this dn doanh nghiep user
	*/
	@Override
	public void setNguoiLamThuTucId(long nguoiLamThuTucId) {
		_dnDoanhNghiepUser.setNguoiLamThuTucId(nguoiLamThuTucId);
	}

	/**
	* Returns the user ID of this dn doanh nghiep user.
	*
	* @return the user ID of this dn doanh nghiep user
	*/
	@Override
	public long getUserId() {
		return _dnDoanhNghiepUser.getUserId();
	}

	/**
	* Sets the user ID of this dn doanh nghiep user.
	*
	* @param userId the user ID of this dn doanh nghiep user
	*/
	@Override
	public void setUserId(long userId) {
		_dnDoanhNghiepUser.setUserId(userId);
	}

	/**
	* Returns the user uuid of this dn doanh nghiep user.
	*
	* @return the user uuid of this dn doanh nghiep user
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dnDoanhNghiepUser.getUserUuid();
	}

	/**
	* Sets the user uuid of this dn doanh nghiep user.
	*
	* @param userUuid the user uuid of this dn doanh nghiep user
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_dnDoanhNghiepUser.setUserUuid(userUuid);
	}

	/**
	* Returns the to chuc quan ly of this dn doanh nghiep user.
	*
	* @return the to chuc quan ly of this dn doanh nghiep user
	*/
	@Override
	public java.lang.String getToChucQuanLy() {
		return _dnDoanhNghiepUser.getToChucQuanLy();
	}

	/**
	* Sets the to chuc quan ly of this dn doanh nghiep user.
	*
	* @param toChucQuanLy the to chuc quan ly of this dn doanh nghiep user
	*/
	@Override
	public void setToChucQuanLy(java.lang.String toChucQuanLy) {
		_dnDoanhNghiepUser.setToChucQuanLy(toChucQuanLy);
	}

	/**
	* Returns the master of this dn doanh nghiep user.
	*
	* @return the master of this dn doanh nghiep user
	*/
	@Override
	public java.lang.String getMaster() {
		return _dnDoanhNghiepUser.getMaster();
	}

	/**
	* Sets the master of this dn doanh nghiep user.
	*
	* @param master the master of this dn doanh nghiep user
	*/
	@Override
	public void setMaster(java.lang.String master) {
		_dnDoanhNghiepUser.setMaster(master);
	}

	/**
	* Returns the ten tai khoan of this dn doanh nghiep user.
	*
	* @return the ten tai khoan of this dn doanh nghiep user
	*/
	@Override
	public java.lang.String getTenTaiKhoan() {
		return _dnDoanhNghiepUser.getTenTaiKhoan();
	}

	/**
	* Sets the ten tai khoan of this dn doanh nghiep user.
	*
	* @param tenTaiKhoan the ten tai khoan of this dn doanh nghiep user
	*/
	@Override
	public void setTenTaiKhoan(java.lang.String tenTaiKhoan) {
		_dnDoanhNghiepUser.setTenTaiKhoan(tenTaiKhoan);
	}

	/**
	* Returns the ten nguoi dung of this dn doanh nghiep user.
	*
	* @return the ten nguoi dung of this dn doanh nghiep user
	*/
	@Override
	public java.lang.String getTenNguoiDung() {
		return _dnDoanhNghiepUser.getTenNguoiDung();
	}

	/**
	* Sets the ten nguoi dung of this dn doanh nghiep user.
	*
	* @param tenNguoiDung the ten nguoi dung of this dn doanh nghiep user
	*/
	@Override
	public void setTenNguoiDung(java.lang.String tenNguoiDung) {
		_dnDoanhNghiepUser.setTenNguoiDung(tenNguoiDung);
	}

	/**
	* Returns the tinh trang hoat dong of this dn doanh nghiep user.
	*
	* @return the tinh trang hoat dong of this dn doanh nghiep user
	*/
	@Override
	public java.lang.String getTinhTrangHoatDong() {
		return _dnDoanhNghiepUser.getTinhTrangHoatDong();
	}

	/**
	* Sets the tinh trang hoat dong of this dn doanh nghiep user.
	*
	* @param tinhTrangHoatDong the tinh trang hoat dong of this dn doanh nghiep user
	*/
	@Override
	public void setTinhTrangHoatDong(java.lang.String tinhTrangHoatDong) {
		_dnDoanhNghiepUser.setTinhTrangHoatDong(tinhTrangHoatDong);
	}

	/**
	* Returns the dien thoai of this dn doanh nghiep user.
	*
	* @return the dien thoai of this dn doanh nghiep user
	*/
	@Override
	public java.lang.String getDienThoai() {
		return _dnDoanhNghiepUser.getDienThoai();
	}

	/**
	* Sets the dien thoai of this dn doanh nghiep user.
	*
	* @param dienThoai the dien thoai of this dn doanh nghiep user
	*/
	@Override
	public void setDienThoai(java.lang.String dienThoai) {
		_dnDoanhNghiepUser.setDienThoai(dienThoai);
	}

	/**
	* Returns the ngay tao tai khoan of this dn doanh nghiep user.
	*
	* @return the ngay tao tai khoan of this dn doanh nghiep user
	*/
	@Override
	public java.util.Date getNgayTaoTaiKhoan() {
		return _dnDoanhNghiepUser.getNgayTaoTaiKhoan();
	}

	/**
	* Sets the ngay tao tai khoan of this dn doanh nghiep user.
	*
	* @param ngayTaoTaiKhoan the ngay tao tai khoan of this dn doanh nghiep user
	*/
	@Override
	public void setNgayTaoTaiKhoan(java.util.Date ngayTaoTaiKhoan) {
		_dnDoanhNghiepUser.setNgayTaoTaiKhoan(ngayTaoTaiKhoan);
	}

	/**
	* Returns the ngay mo tai khoan of this dn doanh nghiep user.
	*
	* @return the ngay mo tai khoan of this dn doanh nghiep user
	*/
	@Override
	public java.util.Date getNgayMoTaiKhoan() {
		return _dnDoanhNghiepUser.getNgayMoTaiKhoan();
	}

	/**
	* Sets the ngay mo tai khoan of this dn doanh nghiep user.
	*
	* @param ngayMoTaiKhoan the ngay mo tai khoan of this dn doanh nghiep user
	*/
	@Override
	public void setNgayMoTaiKhoan(java.util.Date ngayMoTaiKhoan) {
		_dnDoanhNghiepUser.setNgayMoTaiKhoan(ngayMoTaiKhoan);
	}

	@Override
	public boolean isNew() {
		return _dnDoanhNghiepUser.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dnDoanhNghiepUser.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dnDoanhNghiepUser.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dnDoanhNghiepUser.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dnDoanhNghiepUser.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dnDoanhNghiepUser.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dnDoanhNghiepUser.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dnDoanhNghiepUser.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dnDoanhNghiepUser.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dnDoanhNghiepUser.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dnDoanhNghiepUser.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DnDoanhNghiepUserWrapper((DnDoanhNghiepUser)_dnDoanhNghiepUser.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser dnDoanhNghiepUser) {
		return _dnDoanhNghiepUser.compareTo(dnDoanhNghiepUser);
	}

	@Override
	public int hashCode() {
		return _dnDoanhNghiepUser.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser> toCacheModel() {
		return _dnDoanhNghiepUser.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser toEscapedModel() {
		return new DnDoanhNghiepUserWrapper(_dnDoanhNghiepUser.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser toUnescapedModel() {
		return new DnDoanhNghiepUserWrapper(_dnDoanhNghiepUser.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dnDoanhNghiepUser.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dnDoanhNghiepUser.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dnDoanhNghiepUser.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DnDoanhNghiepUserWrapper)) {
			return false;
		}

		DnDoanhNghiepUserWrapper dnDoanhNghiepUserWrapper = (DnDoanhNghiepUserWrapper)obj;

		if (Validator.equals(_dnDoanhNghiepUser,
					dnDoanhNghiepUserWrapper._dnDoanhNghiepUser)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DnDoanhNghiepUser getWrappedDnDoanhNghiepUser() {
		return _dnDoanhNghiepUser;
	}

	@Override
	public DnDoanhNghiepUser getWrappedModel() {
		return _dnDoanhNghiepUser;
	}

	@Override
	public void resetOriginalValues() {
		_dnDoanhNghiepUser.resetOriginalValues();
	}

	private DnDoanhNghiepUser _dnDoanhNghiepUser;
}