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
 * This class is a wrapper for {@link QlvtLoaiHinhHoatDongDn}.
 * </p>
 *
 * @author win_64
 * @see QlvtLoaiHinhHoatDongDn
 * @generated
 */
public class QlvtLoaiHinhHoatDongDnWrapper implements QlvtLoaiHinhHoatDongDn,
	ModelWrapper<QlvtLoaiHinhHoatDongDn> {
	public QlvtLoaiHinhHoatDongDnWrapper(
		QlvtLoaiHinhHoatDongDn qlvtLoaiHinhHoatDongDn) {
		_qlvtLoaiHinhHoatDongDn = qlvtLoaiHinhHoatDongDn;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtLoaiHinhHoatDongDn.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtLoaiHinhHoatDongDn.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("hoSoThuTucId", getHoSoThuTucId());
		attributes.put("noiDungHoSoId", getNoiDungHoSoId());
		attributes.put("maLoaiHinhHoatDong", getMaLoaiHinhHoatDong());
		attributes.put("maMauSon", getMaMauSon());
		attributes.put("maPhamViHoatDong", getMaPhamViHoatDong());
		attributes.put("soLuongPhuongTien", getSoLuongPhuongTien());
		attributes.put("thietBiGiamSatHanhTrinh", getThietBiGiamSatHanhTrinh());

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

		Long noiDungHoSoId = (Long)attributes.get("noiDungHoSoId");

		if (noiDungHoSoId != null) {
			setNoiDungHoSoId(noiDungHoSoId);
		}

		String maLoaiHinhHoatDong = (String)attributes.get("maLoaiHinhHoatDong");

		if (maLoaiHinhHoatDong != null) {
			setMaLoaiHinhHoatDong(maLoaiHinhHoatDong);
		}

		String maMauSon = (String)attributes.get("maMauSon");

		if (maMauSon != null) {
			setMaMauSon(maMauSon);
		}

		String maPhamViHoatDong = (String)attributes.get("maPhamViHoatDong");

		if (maPhamViHoatDong != null) {
			setMaPhamViHoatDong(maPhamViHoatDong);
		}

		String soLuongPhuongTien = (String)attributes.get("soLuongPhuongTien");

		if (soLuongPhuongTien != null) {
			setSoLuongPhuongTien(soLuongPhuongTien);
		}

		String thietBiGiamSatHanhTrinh = (String)attributes.get(
				"thietBiGiamSatHanhTrinh");

		if (thietBiGiamSatHanhTrinh != null) {
			setThietBiGiamSatHanhTrinh(thietBiGiamSatHanhTrinh);
		}
	}

	/**
	* Returns the primary key of this qlvt loai hinh hoat dong dn.
	*
	* @return the primary key of this qlvt loai hinh hoat dong dn
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtLoaiHinhHoatDongDn.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt loai hinh hoat dong dn.
	*
	* @param primaryKey the primary key of this qlvt loai hinh hoat dong dn
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtLoaiHinhHoatDongDn.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt loai hinh hoat dong dn.
	*
	* @return the ID of this qlvt loai hinh hoat dong dn
	*/
	@Override
	public long getId() {
		return _qlvtLoaiHinhHoatDongDn.getId();
	}

	/**
	* Sets the ID of this qlvt loai hinh hoat dong dn.
	*
	* @param id the ID of this qlvt loai hinh hoat dong dn
	*/
	@Override
	public void setId(long id) {
		_qlvtLoaiHinhHoatDongDn.setId(id);
	}

	/**
	* Returns the ho so thu tuc ID of this qlvt loai hinh hoat dong dn.
	*
	* @return the ho so thu tuc ID of this qlvt loai hinh hoat dong dn
	*/
	@Override
	public long getHoSoThuTucId() {
		return _qlvtLoaiHinhHoatDongDn.getHoSoThuTucId();
	}

	/**
	* Sets the ho so thu tuc ID of this qlvt loai hinh hoat dong dn.
	*
	* @param hoSoThuTucId the ho so thu tuc ID of this qlvt loai hinh hoat dong dn
	*/
	@Override
	public void setHoSoThuTucId(long hoSoThuTucId) {
		_qlvtLoaiHinhHoatDongDn.setHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns the noi dung ho so ID of this qlvt loai hinh hoat dong dn.
	*
	* @return the noi dung ho so ID of this qlvt loai hinh hoat dong dn
	*/
	@Override
	public long getNoiDungHoSoId() {
		return _qlvtLoaiHinhHoatDongDn.getNoiDungHoSoId();
	}

	/**
	* Sets the noi dung ho so ID of this qlvt loai hinh hoat dong dn.
	*
	* @param noiDungHoSoId the noi dung ho so ID of this qlvt loai hinh hoat dong dn
	*/
	@Override
	public void setNoiDungHoSoId(long noiDungHoSoId) {
		_qlvtLoaiHinhHoatDongDn.setNoiDungHoSoId(noiDungHoSoId);
	}

	/**
	* Returns the ma loai hinh hoat dong of this qlvt loai hinh hoat dong dn.
	*
	* @return the ma loai hinh hoat dong of this qlvt loai hinh hoat dong dn
	*/
	@Override
	public java.lang.String getMaLoaiHinhHoatDong() {
		return _qlvtLoaiHinhHoatDongDn.getMaLoaiHinhHoatDong();
	}

	/**
	* Sets the ma loai hinh hoat dong of this qlvt loai hinh hoat dong dn.
	*
	* @param maLoaiHinhHoatDong the ma loai hinh hoat dong of this qlvt loai hinh hoat dong dn
	*/
	@Override
	public void setMaLoaiHinhHoatDong(java.lang.String maLoaiHinhHoatDong) {
		_qlvtLoaiHinhHoatDongDn.setMaLoaiHinhHoatDong(maLoaiHinhHoatDong);
	}

	/**
	* Returns the ma mau son of this qlvt loai hinh hoat dong dn.
	*
	* @return the ma mau son of this qlvt loai hinh hoat dong dn
	*/
	@Override
	public java.lang.String getMaMauSon() {
		return _qlvtLoaiHinhHoatDongDn.getMaMauSon();
	}

	/**
	* Sets the ma mau son of this qlvt loai hinh hoat dong dn.
	*
	* @param maMauSon the ma mau son of this qlvt loai hinh hoat dong dn
	*/
	@Override
	public void setMaMauSon(java.lang.String maMauSon) {
		_qlvtLoaiHinhHoatDongDn.setMaMauSon(maMauSon);
	}

	/**
	* Returns the ma pham vi hoat dong of this qlvt loai hinh hoat dong dn.
	*
	* @return the ma pham vi hoat dong of this qlvt loai hinh hoat dong dn
	*/
	@Override
	public java.lang.String getMaPhamViHoatDong() {
		return _qlvtLoaiHinhHoatDongDn.getMaPhamViHoatDong();
	}

	/**
	* Sets the ma pham vi hoat dong of this qlvt loai hinh hoat dong dn.
	*
	* @param maPhamViHoatDong the ma pham vi hoat dong of this qlvt loai hinh hoat dong dn
	*/
	@Override
	public void setMaPhamViHoatDong(java.lang.String maPhamViHoatDong) {
		_qlvtLoaiHinhHoatDongDn.setMaPhamViHoatDong(maPhamViHoatDong);
	}

	/**
	* Returns the so luong phuong tien of this qlvt loai hinh hoat dong dn.
	*
	* @return the so luong phuong tien of this qlvt loai hinh hoat dong dn
	*/
	@Override
	public java.lang.String getSoLuongPhuongTien() {
		return _qlvtLoaiHinhHoatDongDn.getSoLuongPhuongTien();
	}

	/**
	* Sets the so luong phuong tien of this qlvt loai hinh hoat dong dn.
	*
	* @param soLuongPhuongTien the so luong phuong tien of this qlvt loai hinh hoat dong dn
	*/
	@Override
	public void setSoLuongPhuongTien(java.lang.String soLuongPhuongTien) {
		_qlvtLoaiHinhHoatDongDn.setSoLuongPhuongTien(soLuongPhuongTien);
	}

	/**
	* Returns the thiet bi giam sat hanh trinh of this qlvt loai hinh hoat dong dn.
	*
	* @return the thiet bi giam sat hanh trinh of this qlvt loai hinh hoat dong dn
	*/
	@Override
	public java.lang.String getThietBiGiamSatHanhTrinh() {
		return _qlvtLoaiHinhHoatDongDn.getThietBiGiamSatHanhTrinh();
	}

	/**
	* Sets the thiet bi giam sat hanh trinh of this qlvt loai hinh hoat dong dn.
	*
	* @param thietBiGiamSatHanhTrinh the thiet bi giam sat hanh trinh of this qlvt loai hinh hoat dong dn
	*/
	@Override
	public void setThietBiGiamSatHanhTrinh(
		java.lang.String thietBiGiamSatHanhTrinh) {
		_qlvtLoaiHinhHoatDongDn.setThietBiGiamSatHanhTrinh(thietBiGiamSatHanhTrinh);
	}

	@Override
	public boolean isNew() {
		return _qlvtLoaiHinhHoatDongDn.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtLoaiHinhHoatDongDn.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtLoaiHinhHoatDongDn.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtLoaiHinhHoatDongDn.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtLoaiHinhHoatDongDn.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtLoaiHinhHoatDongDn.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtLoaiHinhHoatDongDn.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtLoaiHinhHoatDongDn.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtLoaiHinhHoatDongDn.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtLoaiHinhHoatDongDn.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtLoaiHinhHoatDongDn.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtLoaiHinhHoatDongDnWrapper((QlvtLoaiHinhHoatDongDn)_qlvtLoaiHinhHoatDongDn.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn qlvtLoaiHinhHoatDongDn) {
		return _qlvtLoaiHinhHoatDongDn.compareTo(qlvtLoaiHinhHoatDongDn);
	}

	@Override
	public int hashCode() {
		return _qlvtLoaiHinhHoatDongDn.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn> toCacheModel() {
		return _qlvtLoaiHinhHoatDongDn.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn toEscapedModel() {
		return new QlvtLoaiHinhHoatDongDnWrapper(_qlvtLoaiHinhHoatDongDn.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn toUnescapedModel() {
		return new QlvtLoaiHinhHoatDongDnWrapper(_qlvtLoaiHinhHoatDongDn.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtLoaiHinhHoatDongDn.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtLoaiHinhHoatDongDn.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtLoaiHinhHoatDongDn.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtLoaiHinhHoatDongDnWrapper)) {
			return false;
		}

		QlvtLoaiHinhHoatDongDnWrapper qlvtLoaiHinhHoatDongDnWrapper = (QlvtLoaiHinhHoatDongDnWrapper)obj;

		if (Validator.equals(_qlvtLoaiHinhHoatDongDn,
					qlvtLoaiHinhHoatDongDnWrapper._qlvtLoaiHinhHoatDongDn)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtLoaiHinhHoatDongDn getWrappedQlvtLoaiHinhHoatDongDn() {
		return _qlvtLoaiHinhHoatDongDn;
	}

	@Override
	public QlvtLoaiHinhHoatDongDn getWrappedModel() {
		return _qlvtLoaiHinhHoatDongDn;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtLoaiHinhHoatDongDn.resetOriginalValues();
	}

	private QlvtLoaiHinhHoatDongDn _qlvtLoaiHinhHoatDongDn;
}