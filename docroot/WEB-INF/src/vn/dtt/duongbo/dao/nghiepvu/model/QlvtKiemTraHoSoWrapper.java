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

package vn.dtt.duongbo.dao.nghiepvu.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link QlvtKiemTraHoSo}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtKiemTraHoSo
 * @generated
 */
public class QlvtKiemTraHoSoWrapper implements QlvtKiemTraHoSo,
	ModelWrapper<QlvtKiemTraHoSo> {
	public QlvtKiemTraHoSoWrapper(QlvtKiemTraHoSo qlvtKiemTraHoSo) {
		_qlvtKiemTraHoSo = qlvtKiemTraHoSo;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtKiemTraHoSo.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtKiemTraHoSo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("thongTinXuLyId", getThongTinXuLyId());
		attributes.put("idNoiDungThamTra", getIdNoiDungThamTra());
		attributes.put("yKienThamTra", getYKienThamTra());
		attributes.put("ketQuaXuLy", getKetQuaXuLy());
		attributes.put("maSoHoSo", getMaSoHoSo());
		attributes.put("yKienDanhGia", getYKienDanhGia());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer thongTinXuLyId = (Integer)attributes.get("thongTinXuLyId");

		if (thongTinXuLyId != null) {
			setThongTinXuLyId(thongTinXuLyId);
		}

		Integer idNoiDungThamTra = (Integer)attributes.get("idNoiDungThamTra");

		if (idNoiDungThamTra != null) {
			setIdNoiDungThamTra(idNoiDungThamTra);
		}

		String yKienThamTra = (String)attributes.get("yKienThamTra");

		if (yKienThamTra != null) {
			setYKienThamTra(yKienThamTra);
		}

		Integer ketQuaXuLy = (Integer)attributes.get("ketQuaXuLy");

		if (ketQuaXuLy != null) {
			setKetQuaXuLy(ketQuaXuLy);
		}

		Integer maSoHoSo = (Integer)attributes.get("maSoHoSo");

		if (maSoHoSo != null) {
			setMaSoHoSo(maSoHoSo);
		}

		String yKienDanhGia = (String)attributes.get("yKienDanhGia");

		if (yKienDanhGia != null) {
			setYKienDanhGia(yKienDanhGia);
		}
	}

	/**
	* Returns the primary key of this qlvt kiem tra ho so.
	*
	* @return the primary key of this qlvt kiem tra ho so
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtKiemTraHoSo.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt kiem tra ho so.
	*
	* @param primaryKey the primary key of this qlvt kiem tra ho so
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtKiemTraHoSo.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt kiem tra ho so.
	*
	* @return the ID of this qlvt kiem tra ho so
	*/
	@Override
	public long getId() {
		return _qlvtKiemTraHoSo.getId();
	}

	/**
	* Sets the ID of this qlvt kiem tra ho so.
	*
	* @param id the ID of this qlvt kiem tra ho so
	*/
	@Override
	public void setId(long id) {
		_qlvtKiemTraHoSo.setId(id);
	}

	/**
	* Returns the thong tin xu ly ID of this qlvt kiem tra ho so.
	*
	* @return the thong tin xu ly ID of this qlvt kiem tra ho so
	*/
	@Override
	public int getThongTinXuLyId() {
		return _qlvtKiemTraHoSo.getThongTinXuLyId();
	}

	/**
	* Sets the thong tin xu ly ID of this qlvt kiem tra ho so.
	*
	* @param thongTinXuLyId the thong tin xu ly ID of this qlvt kiem tra ho so
	*/
	@Override
	public void setThongTinXuLyId(int thongTinXuLyId) {
		_qlvtKiemTraHoSo.setThongTinXuLyId(thongTinXuLyId);
	}

	/**
	* Returns the id noi dung tham tra of this qlvt kiem tra ho so.
	*
	* @return the id noi dung tham tra of this qlvt kiem tra ho so
	*/
	@Override
	public int getIdNoiDungThamTra() {
		return _qlvtKiemTraHoSo.getIdNoiDungThamTra();
	}

	/**
	* Sets the id noi dung tham tra of this qlvt kiem tra ho so.
	*
	* @param idNoiDungThamTra the id noi dung tham tra of this qlvt kiem tra ho so
	*/
	@Override
	public void setIdNoiDungThamTra(int idNoiDungThamTra) {
		_qlvtKiemTraHoSo.setIdNoiDungThamTra(idNoiDungThamTra);
	}

	/**
	* Returns the y kien tham tra of this qlvt kiem tra ho so.
	*
	* @return the y kien tham tra of this qlvt kiem tra ho so
	*/
	@Override
	public java.lang.String getYKienThamTra() {
		return _qlvtKiemTraHoSo.getYKienThamTra();
	}

	/**
	* Sets the y kien tham tra of this qlvt kiem tra ho so.
	*
	* @param yKienThamTra the y kien tham tra of this qlvt kiem tra ho so
	*/
	@Override
	public void setYKienThamTra(java.lang.String yKienThamTra) {
		_qlvtKiemTraHoSo.setYKienThamTra(yKienThamTra);
	}

	/**
	* Returns the ket qua xu ly of this qlvt kiem tra ho so.
	*
	* @return the ket qua xu ly of this qlvt kiem tra ho so
	*/
	@Override
	public int getKetQuaXuLy() {
		return _qlvtKiemTraHoSo.getKetQuaXuLy();
	}

	/**
	* Sets the ket qua xu ly of this qlvt kiem tra ho so.
	*
	* @param ketQuaXuLy the ket qua xu ly of this qlvt kiem tra ho so
	*/
	@Override
	public void setKetQuaXuLy(int ketQuaXuLy) {
		_qlvtKiemTraHoSo.setKetQuaXuLy(ketQuaXuLy);
	}

	/**
	* Returns the ma so ho so of this qlvt kiem tra ho so.
	*
	* @return the ma so ho so of this qlvt kiem tra ho so
	*/
	@Override
	public int getMaSoHoSo() {
		return _qlvtKiemTraHoSo.getMaSoHoSo();
	}

	/**
	* Sets the ma so ho so of this qlvt kiem tra ho so.
	*
	* @param maSoHoSo the ma so ho so of this qlvt kiem tra ho so
	*/
	@Override
	public void setMaSoHoSo(int maSoHoSo) {
		_qlvtKiemTraHoSo.setMaSoHoSo(maSoHoSo);
	}

	/**
	* Returns the y kien danh gia of this qlvt kiem tra ho so.
	*
	* @return the y kien danh gia of this qlvt kiem tra ho so
	*/
	@Override
	public java.lang.String getYKienDanhGia() {
		return _qlvtKiemTraHoSo.getYKienDanhGia();
	}

	/**
	* Sets the y kien danh gia of this qlvt kiem tra ho so.
	*
	* @param yKienDanhGia the y kien danh gia of this qlvt kiem tra ho so
	*/
	@Override
	public void setYKienDanhGia(java.lang.String yKienDanhGia) {
		_qlvtKiemTraHoSo.setYKienDanhGia(yKienDanhGia);
	}

	@Override
	public boolean isNew() {
		return _qlvtKiemTraHoSo.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtKiemTraHoSo.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtKiemTraHoSo.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtKiemTraHoSo.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtKiemTraHoSo.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtKiemTraHoSo.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtKiemTraHoSo.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtKiemTraHoSo.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtKiemTraHoSo.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtKiemTraHoSo.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtKiemTraHoSo.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtKiemTraHoSoWrapper((QlvtKiemTraHoSo)_qlvtKiemTraHoSo.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtKiemTraHoSo qlvtKiemTraHoSo) {
		return _qlvtKiemTraHoSo.compareTo(qlvtKiemTraHoSo);
	}

	@Override
	public int hashCode() {
		return _qlvtKiemTraHoSo.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.nghiepvu.model.QlvtKiemTraHoSo> toCacheModel() {
		return _qlvtKiemTraHoSo.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtKiemTraHoSo toEscapedModel() {
		return new QlvtKiemTraHoSoWrapper(_qlvtKiemTraHoSo.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtKiemTraHoSo toUnescapedModel() {
		return new QlvtKiemTraHoSoWrapper(_qlvtKiemTraHoSo.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtKiemTraHoSo.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtKiemTraHoSo.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtKiemTraHoSo.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtKiemTraHoSoWrapper)) {
			return false;
		}

		QlvtKiemTraHoSoWrapper qlvtKiemTraHoSoWrapper = (QlvtKiemTraHoSoWrapper)obj;

		if (Validator.equals(_qlvtKiemTraHoSo,
					qlvtKiemTraHoSoWrapper._qlvtKiemTraHoSo)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtKiemTraHoSo getWrappedQlvtKiemTraHoSo() {
		return _qlvtKiemTraHoSo;
	}

	@Override
	public QlvtKiemTraHoSo getWrappedModel() {
		return _qlvtKiemTraHoSo;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtKiemTraHoSo.resetOriginalValues();
	}

	private QlvtKiemTraHoSo _qlvtKiemTraHoSo;
}