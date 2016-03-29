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
 * This class is a wrapper for {@link QlvtPhuongTienCapBienHieu}.
 * </p>
 *
 * @author win_64
 * @see QlvtPhuongTienCapBienHieu
 * @generated
 */
public class QlvtPhuongTienCapBienHieuWrapper
	implements QlvtPhuongTienCapBienHieu,
		ModelWrapper<QlvtPhuongTienCapBienHieu> {
	public QlvtPhuongTienCapBienHieuWrapper(
		QlvtPhuongTienCapBienHieu qlvtPhuongTienCapBienHieu) {
		_qlvtPhuongTienCapBienHieu = qlvtPhuongTienCapBienHieu;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtPhuongTienCapBienHieu.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtPhuongTienCapBienHieu.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("NhanHieu", getNhanHieu());
		attributes.put("BienSo", getBienSo());
		attributes.put("SoKhung", getSoKhung());
		attributes.put("SoMay", getSoMay());
		attributes.put("NamSanXuat", getNamSanXuat());
		attributes.put("MauSon", getMauSon());
		attributes.put("SoChoNgoi", getSoChoNgoi());
		attributes.put("NoiDungHoSoId", getNoiDungHoSoId());
		attributes.put("HoSoThuTucId", getHoSoThuTucId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String NhanHieu = (String)attributes.get("NhanHieu");

		if (NhanHieu != null) {
			setNhanHieu(NhanHieu);
		}

		String BienSo = (String)attributes.get("BienSo");

		if (BienSo != null) {
			setBienSo(BienSo);
		}

		String SoKhung = (String)attributes.get("SoKhung");

		if (SoKhung != null) {
			setSoKhung(SoKhung);
		}

		String SoMay = (String)attributes.get("SoMay");

		if (SoMay != null) {
			setSoMay(SoMay);
		}

		String NamSanXuat = (String)attributes.get("NamSanXuat");

		if (NamSanXuat != null) {
			setNamSanXuat(NamSanXuat);
		}

		String MauSon = (String)attributes.get("MauSon");

		if (MauSon != null) {
			setMauSon(MauSon);
		}

		Long SoChoNgoi = (Long)attributes.get("SoChoNgoi");

		if (SoChoNgoi != null) {
			setSoChoNgoi(SoChoNgoi);
		}

		Long NoiDungHoSoId = (Long)attributes.get("NoiDungHoSoId");

		if (NoiDungHoSoId != null) {
			setNoiDungHoSoId(NoiDungHoSoId);
		}

		Long HoSoThuTucId = (Long)attributes.get("HoSoThuTucId");

		if (HoSoThuTucId != null) {
			setHoSoThuTucId(HoSoThuTucId);
		}
	}

	/**
	* Returns the primary key of this qlvt phuong tien cap bien hieu.
	*
	* @return the primary key of this qlvt phuong tien cap bien hieu
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtPhuongTienCapBienHieu.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt phuong tien cap bien hieu.
	*
	* @param primaryKey the primary key of this qlvt phuong tien cap bien hieu
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtPhuongTienCapBienHieu.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt phuong tien cap bien hieu.
	*
	* @return the ID of this qlvt phuong tien cap bien hieu
	*/
	@Override
	public long getId() {
		return _qlvtPhuongTienCapBienHieu.getId();
	}

	/**
	* Sets the ID of this qlvt phuong tien cap bien hieu.
	*
	* @param id the ID of this qlvt phuong tien cap bien hieu
	*/
	@Override
	public void setId(long id) {
		_qlvtPhuongTienCapBienHieu.setId(id);
	}

	/**
	* Returns the nhan hieu of this qlvt phuong tien cap bien hieu.
	*
	* @return the nhan hieu of this qlvt phuong tien cap bien hieu
	*/
	@Override
	public java.lang.String getNhanHieu() {
		return _qlvtPhuongTienCapBienHieu.getNhanHieu();
	}

	/**
	* Sets the nhan hieu of this qlvt phuong tien cap bien hieu.
	*
	* @param NhanHieu the nhan hieu of this qlvt phuong tien cap bien hieu
	*/
	@Override
	public void setNhanHieu(java.lang.String NhanHieu) {
		_qlvtPhuongTienCapBienHieu.setNhanHieu(NhanHieu);
	}

	/**
	* Returns the bien so of this qlvt phuong tien cap bien hieu.
	*
	* @return the bien so of this qlvt phuong tien cap bien hieu
	*/
	@Override
	public java.lang.String getBienSo() {
		return _qlvtPhuongTienCapBienHieu.getBienSo();
	}

	/**
	* Sets the bien so of this qlvt phuong tien cap bien hieu.
	*
	* @param BienSo the bien so of this qlvt phuong tien cap bien hieu
	*/
	@Override
	public void setBienSo(java.lang.String BienSo) {
		_qlvtPhuongTienCapBienHieu.setBienSo(BienSo);
	}

	/**
	* Returns the so khung of this qlvt phuong tien cap bien hieu.
	*
	* @return the so khung of this qlvt phuong tien cap bien hieu
	*/
	@Override
	public java.lang.String getSoKhung() {
		return _qlvtPhuongTienCapBienHieu.getSoKhung();
	}

	/**
	* Sets the so khung of this qlvt phuong tien cap bien hieu.
	*
	* @param SoKhung the so khung of this qlvt phuong tien cap bien hieu
	*/
	@Override
	public void setSoKhung(java.lang.String SoKhung) {
		_qlvtPhuongTienCapBienHieu.setSoKhung(SoKhung);
	}

	/**
	* Returns the so may of this qlvt phuong tien cap bien hieu.
	*
	* @return the so may of this qlvt phuong tien cap bien hieu
	*/
	@Override
	public java.lang.String getSoMay() {
		return _qlvtPhuongTienCapBienHieu.getSoMay();
	}

	/**
	* Sets the so may of this qlvt phuong tien cap bien hieu.
	*
	* @param SoMay the so may of this qlvt phuong tien cap bien hieu
	*/
	@Override
	public void setSoMay(java.lang.String SoMay) {
		_qlvtPhuongTienCapBienHieu.setSoMay(SoMay);
	}

	/**
	* Returns the nam san xuat of this qlvt phuong tien cap bien hieu.
	*
	* @return the nam san xuat of this qlvt phuong tien cap bien hieu
	*/
	@Override
	public java.lang.String getNamSanXuat() {
		return _qlvtPhuongTienCapBienHieu.getNamSanXuat();
	}

	/**
	* Sets the nam san xuat of this qlvt phuong tien cap bien hieu.
	*
	* @param NamSanXuat the nam san xuat of this qlvt phuong tien cap bien hieu
	*/
	@Override
	public void setNamSanXuat(java.lang.String NamSanXuat) {
		_qlvtPhuongTienCapBienHieu.setNamSanXuat(NamSanXuat);
	}

	/**
	* Returns the mau son of this qlvt phuong tien cap bien hieu.
	*
	* @return the mau son of this qlvt phuong tien cap bien hieu
	*/
	@Override
	public java.lang.String getMauSon() {
		return _qlvtPhuongTienCapBienHieu.getMauSon();
	}

	/**
	* Sets the mau son of this qlvt phuong tien cap bien hieu.
	*
	* @param MauSon the mau son of this qlvt phuong tien cap bien hieu
	*/
	@Override
	public void setMauSon(java.lang.String MauSon) {
		_qlvtPhuongTienCapBienHieu.setMauSon(MauSon);
	}

	/**
	* Returns the so cho ngoi of this qlvt phuong tien cap bien hieu.
	*
	* @return the so cho ngoi of this qlvt phuong tien cap bien hieu
	*/
	@Override
	public long getSoChoNgoi() {
		return _qlvtPhuongTienCapBienHieu.getSoChoNgoi();
	}

	/**
	* Sets the so cho ngoi of this qlvt phuong tien cap bien hieu.
	*
	* @param SoChoNgoi the so cho ngoi of this qlvt phuong tien cap bien hieu
	*/
	@Override
	public void setSoChoNgoi(long SoChoNgoi) {
		_qlvtPhuongTienCapBienHieu.setSoChoNgoi(SoChoNgoi);
	}

	/**
	* Returns the noi dung ho so ID of this qlvt phuong tien cap bien hieu.
	*
	* @return the noi dung ho so ID of this qlvt phuong tien cap bien hieu
	*/
	@Override
	public long getNoiDungHoSoId() {
		return _qlvtPhuongTienCapBienHieu.getNoiDungHoSoId();
	}

	/**
	* Sets the noi dung ho so ID of this qlvt phuong tien cap bien hieu.
	*
	* @param NoiDungHoSoId the noi dung ho so ID of this qlvt phuong tien cap bien hieu
	*/
	@Override
	public void setNoiDungHoSoId(long NoiDungHoSoId) {
		_qlvtPhuongTienCapBienHieu.setNoiDungHoSoId(NoiDungHoSoId);
	}

	/**
	* Returns the ho so thu tuc ID of this qlvt phuong tien cap bien hieu.
	*
	* @return the ho so thu tuc ID of this qlvt phuong tien cap bien hieu
	*/
	@Override
	public long getHoSoThuTucId() {
		return _qlvtPhuongTienCapBienHieu.getHoSoThuTucId();
	}

	/**
	* Sets the ho so thu tuc ID of this qlvt phuong tien cap bien hieu.
	*
	* @param HoSoThuTucId the ho so thu tuc ID of this qlvt phuong tien cap bien hieu
	*/
	@Override
	public void setHoSoThuTucId(long HoSoThuTucId) {
		_qlvtPhuongTienCapBienHieu.setHoSoThuTucId(HoSoThuTucId);
	}

	@Override
	public boolean isNew() {
		return _qlvtPhuongTienCapBienHieu.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtPhuongTienCapBienHieu.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtPhuongTienCapBienHieu.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtPhuongTienCapBienHieu.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtPhuongTienCapBienHieu.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtPhuongTienCapBienHieu.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtPhuongTienCapBienHieu.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtPhuongTienCapBienHieu.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtPhuongTienCapBienHieu.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtPhuongTienCapBienHieu.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtPhuongTienCapBienHieu.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtPhuongTienCapBienHieuWrapper((QlvtPhuongTienCapBienHieu)_qlvtPhuongTienCapBienHieu.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapBienHieu qlvtPhuongTienCapBienHieu) {
		return _qlvtPhuongTienCapBienHieu.compareTo(qlvtPhuongTienCapBienHieu);
	}

	@Override
	public int hashCode() {
		return _qlvtPhuongTienCapBienHieu.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapBienHieu> toCacheModel() {
		return _qlvtPhuongTienCapBienHieu.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapBienHieu toEscapedModel() {
		return new QlvtPhuongTienCapBienHieuWrapper(_qlvtPhuongTienCapBienHieu.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapBienHieu toUnescapedModel() {
		return new QlvtPhuongTienCapBienHieuWrapper(_qlvtPhuongTienCapBienHieu.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtPhuongTienCapBienHieu.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtPhuongTienCapBienHieu.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtPhuongTienCapBienHieu.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtPhuongTienCapBienHieuWrapper)) {
			return false;
		}

		QlvtPhuongTienCapBienHieuWrapper qlvtPhuongTienCapBienHieuWrapper = (QlvtPhuongTienCapBienHieuWrapper)obj;

		if (Validator.equals(_qlvtPhuongTienCapBienHieu,
					qlvtPhuongTienCapBienHieuWrapper._qlvtPhuongTienCapBienHieu)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtPhuongTienCapBienHieu getWrappedQlvtPhuongTienCapBienHieu() {
		return _qlvtPhuongTienCapBienHieu;
	}

	@Override
	public QlvtPhuongTienCapBienHieu getWrappedModel() {
		return _qlvtPhuongTienCapBienHieu;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtPhuongTienCapBienHieu.resetOriginalValues();
	}

	private QlvtPhuongTienCapBienHieu _qlvtPhuongTienCapBienHieu;
}