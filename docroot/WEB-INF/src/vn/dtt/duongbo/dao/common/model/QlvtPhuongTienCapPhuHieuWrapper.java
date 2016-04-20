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
 * This class is a wrapper for {@link QlvtPhuongTienCapPhuHieu}.
 * </p>
 *
 * @author win_64
 * @see QlvtPhuongTienCapPhuHieu
 * @generated
 */
public class QlvtPhuongTienCapPhuHieuWrapper implements QlvtPhuongTienCapPhuHieu,
	ModelWrapper<QlvtPhuongTienCapPhuHieu> {
	public QlvtPhuongTienCapPhuHieuWrapper(
		QlvtPhuongTienCapPhuHieu qlvtPhuongTienCapPhuHieu) {
		_qlvtPhuongTienCapPhuHieu = qlvtPhuongTienCapPhuHieu;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtPhuongTienCapPhuHieu.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtPhuongTienCapPhuHieu.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("NhanHieu", getNhanHieu());
		attributes.put("BienSo", getBienSo());
		attributes.put("TrongTai", getTrongTai());
		attributes.put("NuocSanXuat", getNuocSanXuat());
		attributes.put("NamSanXuat", getNamSanXuat());
		attributes.put("TuyenHoatDong", getTuyenHoatDong());
		attributes.put("LoaiHinhHoatDong", getLoaiHinhHoatDong());
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

		Long TrongTai = (Long)attributes.get("TrongTai");

		if (TrongTai != null) {
			setTrongTai(TrongTai);
		}

		String NuocSanXuat = (String)attributes.get("NuocSanXuat");

		if (NuocSanXuat != null) {
			setNuocSanXuat(NuocSanXuat);
		}

		String NamSanXuat = (String)attributes.get("NamSanXuat");

		if (NamSanXuat != null) {
			setNamSanXuat(NamSanXuat);
		}

		String TuyenHoatDong = (String)attributes.get("TuyenHoatDong");

		if (TuyenHoatDong != null) {
			setTuyenHoatDong(TuyenHoatDong);
		}

		String LoaiHinhHoatDong = (String)attributes.get("LoaiHinhHoatDong");

		if (LoaiHinhHoatDong != null) {
			setLoaiHinhHoatDong(LoaiHinhHoatDong);
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
	* Returns the primary key of this qlvt phuong tien cap phu hieu.
	*
	* @return the primary key of this qlvt phuong tien cap phu hieu
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtPhuongTienCapPhuHieu.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt phuong tien cap phu hieu.
	*
	* @param primaryKey the primary key of this qlvt phuong tien cap phu hieu
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtPhuongTienCapPhuHieu.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt phuong tien cap phu hieu.
	*
	* @return the ID of this qlvt phuong tien cap phu hieu
	*/
	@Override
	public long getId() {
		return _qlvtPhuongTienCapPhuHieu.getId();
	}

	/**
	* Sets the ID of this qlvt phuong tien cap phu hieu.
	*
	* @param id the ID of this qlvt phuong tien cap phu hieu
	*/
	@Override
	public void setId(long id) {
		_qlvtPhuongTienCapPhuHieu.setId(id);
	}

	/**
	* Returns the nhan hieu of this qlvt phuong tien cap phu hieu.
	*
	* @return the nhan hieu of this qlvt phuong tien cap phu hieu
	*/
	@Override
	public java.lang.String getNhanHieu() {
		return _qlvtPhuongTienCapPhuHieu.getNhanHieu();
	}

	/**
	* Sets the nhan hieu of this qlvt phuong tien cap phu hieu.
	*
	* @param NhanHieu the nhan hieu of this qlvt phuong tien cap phu hieu
	*/
	@Override
	public void setNhanHieu(java.lang.String NhanHieu) {
		_qlvtPhuongTienCapPhuHieu.setNhanHieu(NhanHieu);
	}

	/**
	* Returns the bien so of this qlvt phuong tien cap phu hieu.
	*
	* @return the bien so of this qlvt phuong tien cap phu hieu
	*/
	@Override
	public java.lang.String getBienSo() {
		return _qlvtPhuongTienCapPhuHieu.getBienSo();
	}

	/**
	* Sets the bien so of this qlvt phuong tien cap phu hieu.
	*
	* @param BienSo the bien so of this qlvt phuong tien cap phu hieu
	*/
	@Override
	public void setBienSo(java.lang.String BienSo) {
		_qlvtPhuongTienCapPhuHieu.setBienSo(BienSo);
	}

	/**
	* Returns the trong tai of this qlvt phuong tien cap phu hieu.
	*
	* @return the trong tai of this qlvt phuong tien cap phu hieu
	*/
	@Override
	public long getTrongTai() {
		return _qlvtPhuongTienCapPhuHieu.getTrongTai();
	}

	/**
	* Sets the trong tai of this qlvt phuong tien cap phu hieu.
	*
	* @param TrongTai the trong tai of this qlvt phuong tien cap phu hieu
	*/
	@Override
	public void setTrongTai(long TrongTai) {
		_qlvtPhuongTienCapPhuHieu.setTrongTai(TrongTai);
	}

	/**
	* Returns the nuoc san xuat of this qlvt phuong tien cap phu hieu.
	*
	* @return the nuoc san xuat of this qlvt phuong tien cap phu hieu
	*/
	@Override
	public java.lang.String getNuocSanXuat() {
		return _qlvtPhuongTienCapPhuHieu.getNuocSanXuat();
	}

	/**
	* Sets the nuoc san xuat of this qlvt phuong tien cap phu hieu.
	*
	* @param NuocSanXuat the nuoc san xuat of this qlvt phuong tien cap phu hieu
	*/
	@Override
	public void setNuocSanXuat(java.lang.String NuocSanXuat) {
		_qlvtPhuongTienCapPhuHieu.setNuocSanXuat(NuocSanXuat);
	}

	/**
	* Returns the nam san xuat of this qlvt phuong tien cap phu hieu.
	*
	* @return the nam san xuat of this qlvt phuong tien cap phu hieu
	*/
	@Override
	public java.lang.String getNamSanXuat() {
		return _qlvtPhuongTienCapPhuHieu.getNamSanXuat();
	}

	/**
	* Sets the nam san xuat of this qlvt phuong tien cap phu hieu.
	*
	* @param NamSanXuat the nam san xuat of this qlvt phuong tien cap phu hieu
	*/
	@Override
	public void setNamSanXuat(java.lang.String NamSanXuat) {
		_qlvtPhuongTienCapPhuHieu.setNamSanXuat(NamSanXuat);
	}

	/**
	* Returns the tuyen hoat dong of this qlvt phuong tien cap phu hieu.
	*
	* @return the tuyen hoat dong of this qlvt phuong tien cap phu hieu
	*/
	@Override
	public java.lang.String getTuyenHoatDong() {
		return _qlvtPhuongTienCapPhuHieu.getTuyenHoatDong();
	}

	/**
	* Sets the tuyen hoat dong of this qlvt phuong tien cap phu hieu.
	*
	* @param TuyenHoatDong the tuyen hoat dong of this qlvt phuong tien cap phu hieu
	*/
	@Override
	public void setTuyenHoatDong(java.lang.String TuyenHoatDong) {
		_qlvtPhuongTienCapPhuHieu.setTuyenHoatDong(TuyenHoatDong);
	}

	/**
	* Returns the loai hinh hoat dong of this qlvt phuong tien cap phu hieu.
	*
	* @return the loai hinh hoat dong of this qlvt phuong tien cap phu hieu
	*/
	@Override
	public java.lang.String getLoaiHinhHoatDong() {
		return _qlvtPhuongTienCapPhuHieu.getLoaiHinhHoatDong();
	}

	/**
	* Sets the loai hinh hoat dong of this qlvt phuong tien cap phu hieu.
	*
	* @param LoaiHinhHoatDong the loai hinh hoat dong of this qlvt phuong tien cap phu hieu
	*/
	@Override
	public void setLoaiHinhHoatDong(java.lang.String LoaiHinhHoatDong) {
		_qlvtPhuongTienCapPhuHieu.setLoaiHinhHoatDong(LoaiHinhHoatDong);
	}

	/**
	* Returns the noi dung ho so ID of this qlvt phuong tien cap phu hieu.
	*
	* @return the noi dung ho so ID of this qlvt phuong tien cap phu hieu
	*/
	@Override
	public long getNoiDungHoSoId() {
		return _qlvtPhuongTienCapPhuHieu.getNoiDungHoSoId();
	}

	/**
	* Sets the noi dung ho so ID of this qlvt phuong tien cap phu hieu.
	*
	* @param NoiDungHoSoId the noi dung ho so ID of this qlvt phuong tien cap phu hieu
	*/
	@Override
	public void setNoiDungHoSoId(long NoiDungHoSoId) {
		_qlvtPhuongTienCapPhuHieu.setNoiDungHoSoId(NoiDungHoSoId);
	}

	/**
	* Returns the ho so thu tuc ID of this qlvt phuong tien cap phu hieu.
	*
	* @return the ho so thu tuc ID of this qlvt phuong tien cap phu hieu
	*/
	@Override
	public long getHoSoThuTucId() {
		return _qlvtPhuongTienCapPhuHieu.getHoSoThuTucId();
	}

	/**
	* Sets the ho so thu tuc ID of this qlvt phuong tien cap phu hieu.
	*
	* @param HoSoThuTucId the ho so thu tuc ID of this qlvt phuong tien cap phu hieu
	*/
	@Override
	public void setHoSoThuTucId(long HoSoThuTucId) {
		_qlvtPhuongTienCapPhuHieu.setHoSoThuTucId(HoSoThuTucId);
	}

	@Override
	public boolean isNew() {
		return _qlvtPhuongTienCapPhuHieu.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtPhuongTienCapPhuHieu.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtPhuongTienCapPhuHieu.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtPhuongTienCapPhuHieu.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtPhuongTienCapPhuHieu.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtPhuongTienCapPhuHieu.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtPhuongTienCapPhuHieu.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtPhuongTienCapPhuHieu.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtPhuongTienCapPhuHieu.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtPhuongTienCapPhuHieu.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtPhuongTienCapPhuHieu.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtPhuongTienCapPhuHieuWrapper((QlvtPhuongTienCapPhuHieu)_qlvtPhuongTienCapPhuHieu.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu qlvtPhuongTienCapPhuHieu) {
		return _qlvtPhuongTienCapPhuHieu.compareTo(qlvtPhuongTienCapPhuHieu);
	}

	@Override
	public int hashCode() {
		return _qlvtPhuongTienCapPhuHieu.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu> toCacheModel() {
		return _qlvtPhuongTienCapPhuHieu.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu toEscapedModel() {
		return new QlvtPhuongTienCapPhuHieuWrapper(_qlvtPhuongTienCapPhuHieu.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu toUnescapedModel() {
		return new QlvtPhuongTienCapPhuHieuWrapper(_qlvtPhuongTienCapPhuHieu.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtPhuongTienCapPhuHieu.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtPhuongTienCapPhuHieu.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtPhuongTienCapPhuHieu.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtPhuongTienCapPhuHieuWrapper)) {
			return false;
		}

		QlvtPhuongTienCapPhuHieuWrapper qlvtPhuongTienCapPhuHieuWrapper = (QlvtPhuongTienCapPhuHieuWrapper)obj;

		if (Validator.equals(_qlvtPhuongTienCapPhuHieu,
					qlvtPhuongTienCapPhuHieuWrapper._qlvtPhuongTienCapPhuHieu)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtPhuongTienCapPhuHieu getWrappedQlvtPhuongTienCapPhuHieu() {
		return _qlvtPhuongTienCapPhuHieu;
	}

	@Override
	public QlvtPhuongTienCapPhuHieu getWrappedModel() {
		return _qlvtPhuongTienCapPhuHieu;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtPhuongTienCapPhuHieu.resetOriginalValues();
	}

	private QlvtPhuongTienCapPhuHieu _qlvtPhuongTienCapPhuHieu;
}