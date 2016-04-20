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
 * This class is a wrapper for {@link QlvtDiemDungDangKyVietTrung}.
 * </p>
 *
 * @author win_64
 * @see QlvtDiemDungDangKyVietTrung
 * @generated
 */
public class QlvtDiemDungDangKyVietTrungWrapper
	implements QlvtDiemDungDangKyVietTrung,
		ModelWrapper<QlvtDiemDungDangKyVietTrung> {
	public QlvtDiemDungDangKyVietTrungWrapper(
		QlvtDiemDungDangKyVietTrung qlvtDiemDungDangKyVietTrung) {
		_qlvtDiemDungDangKyVietTrung = qlvtDiemDungDangKyVietTrung;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtDiemDungDangKyVietTrung.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtDiemDungDangKyVietTrung.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("PhuongTienDangKyId", getPhuongTienDangKyId());
		attributes.put("NoiDungHoSoId", getNoiDungHoSoId());
		attributes.put("HoSoThuTucId", getHoSoThuTucId());
		attributes.put("MaDiemDung", getMaDiemDung());
		attributes.put("TenDiemDung", getTenDiemDung());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String PhuongTienDangKyId = (String)attributes.get("PhuongTienDangKyId");

		if (PhuongTienDangKyId != null) {
			setPhuongTienDangKyId(PhuongTienDangKyId);
		}

		String NoiDungHoSoId = (String)attributes.get("NoiDungHoSoId");

		if (NoiDungHoSoId != null) {
			setNoiDungHoSoId(NoiDungHoSoId);
		}

		String HoSoThuTucId = (String)attributes.get("HoSoThuTucId");

		if (HoSoThuTucId != null) {
			setHoSoThuTucId(HoSoThuTucId);
		}

		Long MaDiemDung = (Long)attributes.get("MaDiemDung");

		if (MaDiemDung != null) {
			setMaDiemDung(MaDiemDung);
		}

		Long TenDiemDung = (Long)attributes.get("TenDiemDung");

		if (TenDiemDung != null) {
			setTenDiemDung(TenDiemDung);
		}
	}

	/**
	* Returns the primary key of this qlvt diem dung dang ky viet trung.
	*
	* @return the primary key of this qlvt diem dung dang ky viet trung
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtDiemDungDangKyVietTrung.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt diem dung dang ky viet trung.
	*
	* @param primaryKey the primary key of this qlvt diem dung dang ky viet trung
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtDiemDungDangKyVietTrung.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt diem dung dang ky viet trung.
	*
	* @return the ID of this qlvt diem dung dang ky viet trung
	*/
	@Override
	public long getId() {
		return _qlvtDiemDungDangKyVietTrung.getId();
	}

	/**
	* Sets the ID of this qlvt diem dung dang ky viet trung.
	*
	* @param id the ID of this qlvt diem dung dang ky viet trung
	*/
	@Override
	public void setId(long id) {
		_qlvtDiemDungDangKyVietTrung.setId(id);
	}

	/**
	* Returns the phuong tien dang ky ID of this qlvt diem dung dang ky viet trung.
	*
	* @return the phuong tien dang ky ID of this qlvt diem dung dang ky viet trung
	*/
	@Override
	public java.lang.String getPhuongTienDangKyId() {
		return _qlvtDiemDungDangKyVietTrung.getPhuongTienDangKyId();
	}

	/**
	* Sets the phuong tien dang ky ID of this qlvt diem dung dang ky viet trung.
	*
	* @param PhuongTienDangKyId the phuong tien dang ky ID of this qlvt diem dung dang ky viet trung
	*/
	@Override
	public void setPhuongTienDangKyId(java.lang.String PhuongTienDangKyId) {
		_qlvtDiemDungDangKyVietTrung.setPhuongTienDangKyId(PhuongTienDangKyId);
	}

	/**
	* Returns the noi dung ho so ID of this qlvt diem dung dang ky viet trung.
	*
	* @return the noi dung ho so ID of this qlvt diem dung dang ky viet trung
	*/
	@Override
	public java.lang.String getNoiDungHoSoId() {
		return _qlvtDiemDungDangKyVietTrung.getNoiDungHoSoId();
	}

	/**
	* Sets the noi dung ho so ID of this qlvt diem dung dang ky viet trung.
	*
	* @param NoiDungHoSoId the noi dung ho so ID of this qlvt diem dung dang ky viet trung
	*/
	@Override
	public void setNoiDungHoSoId(java.lang.String NoiDungHoSoId) {
		_qlvtDiemDungDangKyVietTrung.setNoiDungHoSoId(NoiDungHoSoId);
	}

	/**
	* Returns the ho so thu tuc ID of this qlvt diem dung dang ky viet trung.
	*
	* @return the ho so thu tuc ID of this qlvt diem dung dang ky viet trung
	*/
	@Override
	public java.lang.String getHoSoThuTucId() {
		return _qlvtDiemDungDangKyVietTrung.getHoSoThuTucId();
	}

	/**
	* Sets the ho so thu tuc ID of this qlvt diem dung dang ky viet trung.
	*
	* @param HoSoThuTucId the ho so thu tuc ID of this qlvt diem dung dang ky viet trung
	*/
	@Override
	public void setHoSoThuTucId(java.lang.String HoSoThuTucId) {
		_qlvtDiemDungDangKyVietTrung.setHoSoThuTucId(HoSoThuTucId);
	}

	/**
	* Returns the ma diem dung of this qlvt diem dung dang ky viet trung.
	*
	* @return the ma diem dung of this qlvt diem dung dang ky viet trung
	*/
	@Override
	public long getMaDiemDung() {
		return _qlvtDiemDungDangKyVietTrung.getMaDiemDung();
	}

	/**
	* Sets the ma diem dung of this qlvt diem dung dang ky viet trung.
	*
	* @param MaDiemDung the ma diem dung of this qlvt diem dung dang ky viet trung
	*/
	@Override
	public void setMaDiemDung(long MaDiemDung) {
		_qlvtDiemDungDangKyVietTrung.setMaDiemDung(MaDiemDung);
	}

	/**
	* Returns the ten diem dung of this qlvt diem dung dang ky viet trung.
	*
	* @return the ten diem dung of this qlvt diem dung dang ky viet trung
	*/
	@Override
	public long getTenDiemDung() {
		return _qlvtDiemDungDangKyVietTrung.getTenDiemDung();
	}

	/**
	* Sets the ten diem dung of this qlvt diem dung dang ky viet trung.
	*
	* @param TenDiemDung the ten diem dung of this qlvt diem dung dang ky viet trung
	*/
	@Override
	public void setTenDiemDung(long TenDiemDung) {
		_qlvtDiemDungDangKyVietTrung.setTenDiemDung(TenDiemDung);
	}

	@Override
	public boolean isNew() {
		return _qlvtDiemDungDangKyVietTrung.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtDiemDungDangKyVietTrung.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtDiemDungDangKyVietTrung.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtDiemDungDangKyVietTrung.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtDiemDungDangKyVietTrung.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtDiemDungDangKyVietTrung.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtDiemDungDangKyVietTrung.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtDiemDungDangKyVietTrung.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtDiemDungDangKyVietTrung.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtDiemDungDangKyVietTrung.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtDiemDungDangKyVietTrung.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtDiemDungDangKyVietTrungWrapper((QlvtDiemDungDangKyVietTrung)_qlvtDiemDungDangKyVietTrung.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietTrung qlvtDiemDungDangKyVietTrung) {
		return _qlvtDiemDungDangKyVietTrung.compareTo(qlvtDiemDungDangKyVietTrung);
	}

	@Override
	public int hashCode() {
		return _qlvtDiemDungDangKyVietTrung.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietTrung> toCacheModel() {
		return _qlvtDiemDungDangKyVietTrung.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietTrung toEscapedModel() {
		return new QlvtDiemDungDangKyVietTrungWrapper(_qlvtDiemDungDangKyVietTrung.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietTrung toUnescapedModel() {
		return new QlvtDiemDungDangKyVietTrungWrapper(_qlvtDiemDungDangKyVietTrung.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtDiemDungDangKyVietTrung.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtDiemDungDangKyVietTrung.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtDiemDungDangKyVietTrung.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtDiemDungDangKyVietTrungWrapper)) {
			return false;
		}

		QlvtDiemDungDangKyVietTrungWrapper qlvtDiemDungDangKyVietTrungWrapper = (QlvtDiemDungDangKyVietTrungWrapper)obj;

		if (Validator.equals(_qlvtDiemDungDangKyVietTrung,
					qlvtDiemDungDangKyVietTrungWrapper._qlvtDiemDungDangKyVietTrung)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtDiemDungDangKyVietTrung getWrappedQlvtDiemDungDangKyVietTrung() {
		return _qlvtDiemDungDangKyVietTrung;
	}

	@Override
	public QlvtDiemDungDangKyVietTrung getWrappedModel() {
		return _qlvtDiemDungDangKyVietTrung;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtDiemDungDangKyVietTrung.resetOriginalValues();
	}

	private QlvtDiemDungDangKyVietTrung _qlvtDiemDungDangKyVietTrung;
}