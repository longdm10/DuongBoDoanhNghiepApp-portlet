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

package vn.dtt.duongbo.dao.quocte.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link QlvtXuLyKTTQuocTeDiemDungNghi}.
 * </p>
 *
 * @author NoiPham
 * @see QlvtXuLyKTTQuocTeDiemDungNghi
 * @generated
 */
public class QlvtXuLyKTTQuocTeDiemDungNghiWrapper
	implements QlvtXuLyKTTQuocTeDiemDungNghi,
		ModelWrapper<QlvtXuLyKTTQuocTeDiemDungNghi> {
	public QlvtXuLyKTTQuocTeDiemDungNghiWrapper(
		QlvtXuLyKTTQuocTeDiemDungNghi qlvtXuLyKTTQuocTeDiemDungNghi) {
		_qlvtXuLyKTTQuocTeDiemDungNghi = qlvtXuLyKTTQuocTeDiemDungNghi;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtXuLyKTTQuocTeDiemDungNghi.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtXuLyKTTQuocTeDiemDungNghi.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("kttQuocTeId", getKttQuocTeId());
		attributes.put("loaiLuot", getLoaiLuot());
		attributes.put("soThuTuLuot", getSoThuTuLuot());
		attributes.put("maBen", getMaBen());
		attributes.put("soGioDungNghi", getSoGioDungNghi());
		attributes.put("soPhutDungNghi", getSoPhutDungNghi());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer kttQuocTeId = (Integer)attributes.get("kttQuocTeId");

		if (kttQuocTeId != null) {
			setKttQuocTeId(kttQuocTeId);
		}

		String loaiLuot = (String)attributes.get("loaiLuot");

		if (loaiLuot != null) {
			setLoaiLuot(loaiLuot);
		}

		Integer soThuTuLuot = (Integer)attributes.get("soThuTuLuot");

		if (soThuTuLuot != null) {
			setSoThuTuLuot(soThuTuLuot);
		}

		String maBen = (String)attributes.get("maBen");

		if (maBen != null) {
			setMaBen(maBen);
		}

		Integer soGioDungNghi = (Integer)attributes.get("soGioDungNghi");

		if (soGioDungNghi != null) {
			setSoGioDungNghi(soGioDungNghi);
		}

		Integer soPhutDungNghi = (Integer)attributes.get("soPhutDungNghi");

		if (soPhutDungNghi != null) {
			setSoPhutDungNghi(soPhutDungNghi);
		}
	}

	/**
	* Returns the primary key of this qlvt xu ly k t t quoc te diem dung nghi.
	*
	* @return the primary key of this qlvt xu ly k t t quoc te diem dung nghi
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtXuLyKTTQuocTeDiemDungNghi.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt xu ly k t t quoc te diem dung nghi.
	*
	* @param primaryKey the primary key of this qlvt xu ly k t t quoc te diem dung nghi
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtXuLyKTTQuocTeDiemDungNghi.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt xu ly k t t quoc te diem dung nghi.
	*
	* @return the ID of this qlvt xu ly k t t quoc te diem dung nghi
	*/
	@Override
	public long getId() {
		return _qlvtXuLyKTTQuocTeDiemDungNghi.getId();
	}

	/**
	* Sets the ID of this qlvt xu ly k t t quoc te diem dung nghi.
	*
	* @param id the ID of this qlvt xu ly k t t quoc te diem dung nghi
	*/
	@Override
	public void setId(long id) {
		_qlvtXuLyKTTQuocTeDiemDungNghi.setId(id);
	}

	/**
	* Returns the ktt quoc te ID of this qlvt xu ly k t t quoc te diem dung nghi.
	*
	* @return the ktt quoc te ID of this qlvt xu ly k t t quoc te diem dung nghi
	*/
	@Override
	public int getKttQuocTeId() {
		return _qlvtXuLyKTTQuocTeDiemDungNghi.getKttQuocTeId();
	}

	/**
	* Sets the ktt quoc te ID of this qlvt xu ly k t t quoc te diem dung nghi.
	*
	* @param kttQuocTeId the ktt quoc te ID of this qlvt xu ly k t t quoc te diem dung nghi
	*/
	@Override
	public void setKttQuocTeId(int kttQuocTeId) {
		_qlvtXuLyKTTQuocTeDiemDungNghi.setKttQuocTeId(kttQuocTeId);
	}

	/**
	* Returns the loai luot of this qlvt xu ly k t t quoc te diem dung nghi.
	*
	* @return the loai luot of this qlvt xu ly k t t quoc te diem dung nghi
	*/
	@Override
	public java.lang.String getLoaiLuot() {
		return _qlvtXuLyKTTQuocTeDiemDungNghi.getLoaiLuot();
	}

	/**
	* Sets the loai luot of this qlvt xu ly k t t quoc te diem dung nghi.
	*
	* @param loaiLuot the loai luot of this qlvt xu ly k t t quoc te diem dung nghi
	*/
	@Override
	public void setLoaiLuot(java.lang.String loaiLuot) {
		_qlvtXuLyKTTQuocTeDiemDungNghi.setLoaiLuot(loaiLuot);
	}

	/**
	* Returns the so thu tu luot of this qlvt xu ly k t t quoc te diem dung nghi.
	*
	* @return the so thu tu luot of this qlvt xu ly k t t quoc te diem dung nghi
	*/
	@Override
	public int getSoThuTuLuot() {
		return _qlvtXuLyKTTQuocTeDiemDungNghi.getSoThuTuLuot();
	}

	/**
	* Sets the so thu tu luot of this qlvt xu ly k t t quoc te diem dung nghi.
	*
	* @param soThuTuLuot the so thu tu luot of this qlvt xu ly k t t quoc te diem dung nghi
	*/
	@Override
	public void setSoThuTuLuot(int soThuTuLuot) {
		_qlvtXuLyKTTQuocTeDiemDungNghi.setSoThuTuLuot(soThuTuLuot);
	}

	/**
	* Returns the ma ben of this qlvt xu ly k t t quoc te diem dung nghi.
	*
	* @return the ma ben of this qlvt xu ly k t t quoc te diem dung nghi
	*/
	@Override
	public java.lang.String getMaBen() {
		return _qlvtXuLyKTTQuocTeDiemDungNghi.getMaBen();
	}

	/**
	* Sets the ma ben of this qlvt xu ly k t t quoc te diem dung nghi.
	*
	* @param maBen the ma ben of this qlvt xu ly k t t quoc te diem dung nghi
	*/
	@Override
	public void setMaBen(java.lang.String maBen) {
		_qlvtXuLyKTTQuocTeDiemDungNghi.setMaBen(maBen);
	}

	/**
	* Returns the so gio dung nghi of this qlvt xu ly k t t quoc te diem dung nghi.
	*
	* @return the so gio dung nghi of this qlvt xu ly k t t quoc te diem dung nghi
	*/
	@Override
	public int getSoGioDungNghi() {
		return _qlvtXuLyKTTQuocTeDiemDungNghi.getSoGioDungNghi();
	}

	/**
	* Sets the so gio dung nghi of this qlvt xu ly k t t quoc te diem dung nghi.
	*
	* @param soGioDungNghi the so gio dung nghi of this qlvt xu ly k t t quoc te diem dung nghi
	*/
	@Override
	public void setSoGioDungNghi(int soGioDungNghi) {
		_qlvtXuLyKTTQuocTeDiemDungNghi.setSoGioDungNghi(soGioDungNghi);
	}

	/**
	* Returns the so phut dung nghi of this qlvt xu ly k t t quoc te diem dung nghi.
	*
	* @return the so phut dung nghi of this qlvt xu ly k t t quoc te diem dung nghi
	*/
	@Override
	public int getSoPhutDungNghi() {
		return _qlvtXuLyKTTQuocTeDiemDungNghi.getSoPhutDungNghi();
	}

	/**
	* Sets the so phut dung nghi of this qlvt xu ly k t t quoc te diem dung nghi.
	*
	* @param soPhutDungNghi the so phut dung nghi of this qlvt xu ly k t t quoc te diem dung nghi
	*/
	@Override
	public void setSoPhutDungNghi(int soPhutDungNghi) {
		_qlvtXuLyKTTQuocTeDiemDungNghi.setSoPhutDungNghi(soPhutDungNghi);
	}

	@Override
	public boolean isNew() {
		return _qlvtXuLyKTTQuocTeDiemDungNghi.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtXuLyKTTQuocTeDiemDungNghi.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtXuLyKTTQuocTeDiemDungNghi.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtXuLyKTTQuocTeDiemDungNghi.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtXuLyKTTQuocTeDiemDungNghi.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtXuLyKTTQuocTeDiemDungNghi.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtXuLyKTTQuocTeDiemDungNghi.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtXuLyKTTQuocTeDiemDungNghi.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtXuLyKTTQuocTeDiemDungNghi.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtXuLyKTTQuocTeDiemDungNghi.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtXuLyKTTQuocTeDiemDungNghi.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtXuLyKTTQuocTeDiemDungNghiWrapper((QlvtXuLyKTTQuocTeDiemDungNghi)_qlvtXuLyKTTQuocTeDiemDungNghi.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeDiemDungNghi qlvtXuLyKTTQuocTeDiemDungNghi) {
		return _qlvtXuLyKTTQuocTeDiemDungNghi.compareTo(qlvtXuLyKTTQuocTeDiemDungNghi);
	}

	@Override
	public int hashCode() {
		return _qlvtXuLyKTTQuocTeDiemDungNghi.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeDiemDungNghi> toCacheModel() {
		return _qlvtXuLyKTTQuocTeDiemDungNghi.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeDiemDungNghi toEscapedModel() {
		return new QlvtXuLyKTTQuocTeDiemDungNghiWrapper(_qlvtXuLyKTTQuocTeDiemDungNghi.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeDiemDungNghi toUnescapedModel() {
		return new QlvtXuLyKTTQuocTeDiemDungNghiWrapper(_qlvtXuLyKTTQuocTeDiemDungNghi.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtXuLyKTTQuocTeDiemDungNghi.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtXuLyKTTQuocTeDiemDungNghi.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtXuLyKTTQuocTeDiemDungNghi.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtXuLyKTTQuocTeDiemDungNghiWrapper)) {
			return false;
		}

		QlvtXuLyKTTQuocTeDiemDungNghiWrapper qlvtXuLyKTTQuocTeDiemDungNghiWrapper =
			(QlvtXuLyKTTQuocTeDiemDungNghiWrapper)obj;

		if (Validator.equals(_qlvtXuLyKTTQuocTeDiemDungNghi,
					qlvtXuLyKTTQuocTeDiemDungNghiWrapper._qlvtXuLyKTTQuocTeDiemDungNghi)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtXuLyKTTQuocTeDiemDungNghi getWrappedQlvtXuLyKTTQuocTeDiemDungNghi() {
		return _qlvtXuLyKTTQuocTeDiemDungNghi;
	}

	@Override
	public QlvtXuLyKTTQuocTeDiemDungNghi getWrappedModel() {
		return _qlvtXuLyKTTQuocTeDiemDungNghi;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtXuLyKTTQuocTeDiemDungNghi.resetOriginalValues();
	}

	private QlvtXuLyKTTQuocTeDiemDungNghi _qlvtXuLyKTTQuocTeDiemDungNghi;
}