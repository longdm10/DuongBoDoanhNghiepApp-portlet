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
 * This class is a wrapper for {@link QlvtDiemDungDangKyVietLao}.
 * </p>
 *
 * @author win_64
 * @see QlvtDiemDungDangKyVietLao
 * @generated
 */
public class QlvtDiemDungDangKyVietLaoWrapper
	implements QlvtDiemDungDangKyVietLao,
		ModelWrapper<QlvtDiemDungDangKyVietLao> {
	public QlvtDiemDungDangKyVietLaoWrapper(
		QlvtDiemDungDangKyVietLao qlvtDiemDungDangKyVietLao) {
		_qlvtDiemDungDangKyVietLao = qlvtDiemDungDangKyVietLao;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtDiemDungDangKyVietLao.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtDiemDungDangKyVietLao.class.getName();
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
	* Returns the primary key of this qlvt diem dung dang ky viet lao.
	*
	* @return the primary key of this qlvt diem dung dang ky viet lao
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtDiemDungDangKyVietLao.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt diem dung dang ky viet lao.
	*
	* @param primaryKey the primary key of this qlvt diem dung dang ky viet lao
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtDiemDungDangKyVietLao.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt diem dung dang ky viet lao.
	*
	* @return the ID of this qlvt diem dung dang ky viet lao
	*/
	@Override
	public long getId() {
		return _qlvtDiemDungDangKyVietLao.getId();
	}

	/**
	* Sets the ID of this qlvt diem dung dang ky viet lao.
	*
	* @param id the ID of this qlvt diem dung dang ky viet lao
	*/
	@Override
	public void setId(long id) {
		_qlvtDiemDungDangKyVietLao.setId(id);
	}

	/**
	* Returns the phuong tien dang ky ID of this qlvt diem dung dang ky viet lao.
	*
	* @return the phuong tien dang ky ID of this qlvt diem dung dang ky viet lao
	*/
	@Override
	public java.lang.String getPhuongTienDangKyId() {
		return _qlvtDiemDungDangKyVietLao.getPhuongTienDangKyId();
	}

	/**
	* Sets the phuong tien dang ky ID of this qlvt diem dung dang ky viet lao.
	*
	* @param PhuongTienDangKyId the phuong tien dang ky ID of this qlvt diem dung dang ky viet lao
	*/
	@Override
	public void setPhuongTienDangKyId(java.lang.String PhuongTienDangKyId) {
		_qlvtDiemDungDangKyVietLao.setPhuongTienDangKyId(PhuongTienDangKyId);
	}

	/**
	* Returns the noi dung ho so ID of this qlvt diem dung dang ky viet lao.
	*
	* @return the noi dung ho so ID of this qlvt diem dung dang ky viet lao
	*/
	@Override
	public java.lang.String getNoiDungHoSoId() {
		return _qlvtDiemDungDangKyVietLao.getNoiDungHoSoId();
	}

	/**
	* Sets the noi dung ho so ID of this qlvt diem dung dang ky viet lao.
	*
	* @param NoiDungHoSoId the noi dung ho so ID of this qlvt diem dung dang ky viet lao
	*/
	@Override
	public void setNoiDungHoSoId(java.lang.String NoiDungHoSoId) {
		_qlvtDiemDungDangKyVietLao.setNoiDungHoSoId(NoiDungHoSoId);
	}

	/**
	* Returns the ho so thu tuc ID of this qlvt diem dung dang ky viet lao.
	*
	* @return the ho so thu tuc ID of this qlvt diem dung dang ky viet lao
	*/
	@Override
	public java.lang.String getHoSoThuTucId() {
		return _qlvtDiemDungDangKyVietLao.getHoSoThuTucId();
	}

	/**
	* Sets the ho so thu tuc ID of this qlvt diem dung dang ky viet lao.
	*
	* @param HoSoThuTucId the ho so thu tuc ID of this qlvt diem dung dang ky viet lao
	*/
	@Override
	public void setHoSoThuTucId(java.lang.String HoSoThuTucId) {
		_qlvtDiemDungDangKyVietLao.setHoSoThuTucId(HoSoThuTucId);
	}

	/**
	* Returns the ma diem dung of this qlvt diem dung dang ky viet lao.
	*
	* @return the ma diem dung of this qlvt diem dung dang ky viet lao
	*/
	@Override
	public long getMaDiemDung() {
		return _qlvtDiemDungDangKyVietLao.getMaDiemDung();
	}

	/**
	* Sets the ma diem dung of this qlvt diem dung dang ky viet lao.
	*
	* @param MaDiemDung the ma diem dung of this qlvt diem dung dang ky viet lao
	*/
	@Override
	public void setMaDiemDung(long MaDiemDung) {
		_qlvtDiemDungDangKyVietLao.setMaDiemDung(MaDiemDung);
	}

	/**
	* Returns the ten diem dung of this qlvt diem dung dang ky viet lao.
	*
	* @return the ten diem dung of this qlvt diem dung dang ky viet lao
	*/
	@Override
	public long getTenDiemDung() {
		return _qlvtDiemDungDangKyVietLao.getTenDiemDung();
	}

	/**
	* Sets the ten diem dung of this qlvt diem dung dang ky viet lao.
	*
	* @param TenDiemDung the ten diem dung of this qlvt diem dung dang ky viet lao
	*/
	@Override
	public void setTenDiemDung(long TenDiemDung) {
		_qlvtDiemDungDangKyVietLao.setTenDiemDung(TenDiemDung);
	}

	@Override
	public boolean isNew() {
		return _qlvtDiemDungDangKyVietLao.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtDiemDungDangKyVietLao.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtDiemDungDangKyVietLao.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtDiemDungDangKyVietLao.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtDiemDungDangKyVietLao.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtDiemDungDangKyVietLao.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtDiemDungDangKyVietLao.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtDiemDungDangKyVietLao.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtDiemDungDangKyVietLao.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtDiemDungDangKyVietLao.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtDiemDungDangKyVietLao.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtDiemDungDangKyVietLaoWrapper((QlvtDiemDungDangKyVietLao)_qlvtDiemDungDangKyVietLao.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietLao qlvtDiemDungDangKyVietLao) {
		return _qlvtDiemDungDangKyVietLao.compareTo(qlvtDiemDungDangKyVietLao);
	}

	@Override
	public int hashCode() {
		return _qlvtDiemDungDangKyVietLao.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietLao> toCacheModel() {
		return _qlvtDiemDungDangKyVietLao.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietLao toEscapedModel() {
		return new QlvtDiemDungDangKyVietLaoWrapper(_qlvtDiemDungDangKyVietLao.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietLao toUnescapedModel() {
		return new QlvtDiemDungDangKyVietLaoWrapper(_qlvtDiemDungDangKyVietLao.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtDiemDungDangKyVietLao.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtDiemDungDangKyVietLao.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtDiemDungDangKyVietLao.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtDiemDungDangKyVietLaoWrapper)) {
			return false;
		}

		QlvtDiemDungDangKyVietLaoWrapper qlvtDiemDungDangKyVietLaoWrapper = (QlvtDiemDungDangKyVietLaoWrapper)obj;

		if (Validator.equals(_qlvtDiemDungDangKyVietLao,
					qlvtDiemDungDangKyVietLaoWrapper._qlvtDiemDungDangKyVietLao)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtDiemDungDangKyVietLao getWrappedQlvtDiemDungDangKyVietLao() {
		return _qlvtDiemDungDangKyVietLao;
	}

	@Override
	public QlvtDiemDungDangKyVietLao getWrappedModel() {
		return _qlvtDiemDungDangKyVietLao;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtDiemDungDangKyVietLao.resetOriginalValues();
	}

	private QlvtDiemDungDangKyVietLao _qlvtDiemDungDangKyVietLao;
}