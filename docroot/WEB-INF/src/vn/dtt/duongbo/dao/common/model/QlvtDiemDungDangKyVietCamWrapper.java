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
 * This class is a wrapper for {@link QlvtDiemDungDangKyVietCam}.
 * </p>
 *
 * @author win_64
 * @see QlvtDiemDungDangKyVietCam
 * @generated
 */
public class QlvtDiemDungDangKyVietCamWrapper
	implements QlvtDiemDungDangKyVietCam,
		ModelWrapper<QlvtDiemDungDangKyVietCam> {
	public QlvtDiemDungDangKyVietCamWrapper(
		QlvtDiemDungDangKyVietCam qlvtDiemDungDangKyVietCam) {
		_qlvtDiemDungDangKyVietCam = qlvtDiemDungDangKyVietCam;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtDiemDungDangKyVietCam.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtDiemDungDangKyVietCam.class.getName();
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
	* Returns the primary key of this qlvt diem dung dang ky viet cam.
	*
	* @return the primary key of this qlvt diem dung dang ky viet cam
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtDiemDungDangKyVietCam.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt diem dung dang ky viet cam.
	*
	* @param primaryKey the primary key of this qlvt diem dung dang ky viet cam
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtDiemDungDangKyVietCam.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt diem dung dang ky viet cam.
	*
	* @return the ID of this qlvt diem dung dang ky viet cam
	*/
	@Override
	public long getId() {
		return _qlvtDiemDungDangKyVietCam.getId();
	}

	/**
	* Sets the ID of this qlvt diem dung dang ky viet cam.
	*
	* @param id the ID of this qlvt diem dung dang ky viet cam
	*/
	@Override
	public void setId(long id) {
		_qlvtDiemDungDangKyVietCam.setId(id);
	}

	/**
	* Returns the phuong tien dang ky ID of this qlvt diem dung dang ky viet cam.
	*
	* @return the phuong tien dang ky ID of this qlvt diem dung dang ky viet cam
	*/
	@Override
	public java.lang.String getPhuongTienDangKyId() {
		return _qlvtDiemDungDangKyVietCam.getPhuongTienDangKyId();
	}

	/**
	* Sets the phuong tien dang ky ID of this qlvt diem dung dang ky viet cam.
	*
	* @param PhuongTienDangKyId the phuong tien dang ky ID of this qlvt diem dung dang ky viet cam
	*/
	@Override
	public void setPhuongTienDangKyId(java.lang.String PhuongTienDangKyId) {
		_qlvtDiemDungDangKyVietCam.setPhuongTienDangKyId(PhuongTienDangKyId);
	}

	/**
	* Returns the noi dung ho so ID of this qlvt diem dung dang ky viet cam.
	*
	* @return the noi dung ho so ID of this qlvt diem dung dang ky viet cam
	*/
	@Override
	public java.lang.String getNoiDungHoSoId() {
		return _qlvtDiemDungDangKyVietCam.getNoiDungHoSoId();
	}

	/**
	* Sets the noi dung ho so ID of this qlvt diem dung dang ky viet cam.
	*
	* @param NoiDungHoSoId the noi dung ho so ID of this qlvt diem dung dang ky viet cam
	*/
	@Override
	public void setNoiDungHoSoId(java.lang.String NoiDungHoSoId) {
		_qlvtDiemDungDangKyVietCam.setNoiDungHoSoId(NoiDungHoSoId);
	}

	/**
	* Returns the ho so thu tuc ID of this qlvt diem dung dang ky viet cam.
	*
	* @return the ho so thu tuc ID of this qlvt diem dung dang ky viet cam
	*/
	@Override
	public java.lang.String getHoSoThuTucId() {
		return _qlvtDiemDungDangKyVietCam.getHoSoThuTucId();
	}

	/**
	* Sets the ho so thu tuc ID of this qlvt diem dung dang ky viet cam.
	*
	* @param HoSoThuTucId the ho so thu tuc ID of this qlvt diem dung dang ky viet cam
	*/
	@Override
	public void setHoSoThuTucId(java.lang.String HoSoThuTucId) {
		_qlvtDiemDungDangKyVietCam.setHoSoThuTucId(HoSoThuTucId);
	}

	/**
	* Returns the ma diem dung of this qlvt diem dung dang ky viet cam.
	*
	* @return the ma diem dung of this qlvt diem dung dang ky viet cam
	*/
	@Override
	public long getMaDiemDung() {
		return _qlvtDiemDungDangKyVietCam.getMaDiemDung();
	}

	/**
	* Sets the ma diem dung of this qlvt diem dung dang ky viet cam.
	*
	* @param MaDiemDung the ma diem dung of this qlvt diem dung dang ky viet cam
	*/
	@Override
	public void setMaDiemDung(long MaDiemDung) {
		_qlvtDiemDungDangKyVietCam.setMaDiemDung(MaDiemDung);
	}

	/**
	* Returns the ten diem dung of this qlvt diem dung dang ky viet cam.
	*
	* @return the ten diem dung of this qlvt diem dung dang ky viet cam
	*/
	@Override
	public long getTenDiemDung() {
		return _qlvtDiemDungDangKyVietCam.getTenDiemDung();
	}

	/**
	* Sets the ten diem dung of this qlvt diem dung dang ky viet cam.
	*
	* @param TenDiemDung the ten diem dung of this qlvt diem dung dang ky viet cam
	*/
	@Override
	public void setTenDiemDung(long TenDiemDung) {
		_qlvtDiemDungDangKyVietCam.setTenDiemDung(TenDiemDung);
	}

	@Override
	public boolean isNew() {
		return _qlvtDiemDungDangKyVietCam.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtDiemDungDangKyVietCam.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtDiemDungDangKyVietCam.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtDiemDungDangKyVietCam.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtDiemDungDangKyVietCam.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtDiemDungDangKyVietCam.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtDiemDungDangKyVietCam.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtDiemDungDangKyVietCam.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtDiemDungDangKyVietCam.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtDiemDungDangKyVietCam.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtDiemDungDangKyVietCam.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtDiemDungDangKyVietCamWrapper((QlvtDiemDungDangKyVietCam)_qlvtDiemDungDangKyVietCam.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietCam qlvtDiemDungDangKyVietCam) {
		return _qlvtDiemDungDangKyVietCam.compareTo(qlvtDiemDungDangKyVietCam);
	}

	@Override
	public int hashCode() {
		return _qlvtDiemDungDangKyVietCam.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietCam> toCacheModel() {
		return _qlvtDiemDungDangKyVietCam.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietCam toEscapedModel() {
		return new QlvtDiemDungDangKyVietCamWrapper(_qlvtDiemDungDangKyVietCam.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietCam toUnescapedModel() {
		return new QlvtDiemDungDangKyVietCamWrapper(_qlvtDiemDungDangKyVietCam.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtDiemDungDangKyVietCam.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtDiemDungDangKyVietCam.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtDiemDungDangKyVietCam.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtDiemDungDangKyVietCamWrapper)) {
			return false;
		}

		QlvtDiemDungDangKyVietCamWrapper qlvtDiemDungDangKyVietCamWrapper = (QlvtDiemDungDangKyVietCamWrapper)obj;

		if (Validator.equals(_qlvtDiemDungDangKyVietCam,
					qlvtDiemDungDangKyVietCamWrapper._qlvtDiemDungDangKyVietCam)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtDiemDungDangKyVietCam getWrappedQlvtDiemDungDangKyVietCam() {
		return _qlvtDiemDungDangKyVietCam;
	}

	@Override
	public QlvtDiemDungDangKyVietCam getWrappedModel() {
		return _qlvtDiemDungDangKyVietCam;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtDiemDungDangKyVietCam.resetOriginalValues();
	}

	private QlvtDiemDungDangKyVietCam _qlvtDiemDungDangKyVietCam;
}