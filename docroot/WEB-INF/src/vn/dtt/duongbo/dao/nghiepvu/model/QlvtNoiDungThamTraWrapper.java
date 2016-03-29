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
 * This class is a wrapper for {@link QlvtNoiDungThamTra}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtNoiDungThamTra
 * @generated
 */
public class QlvtNoiDungThamTraWrapper implements QlvtNoiDungThamTra,
	ModelWrapper<QlvtNoiDungThamTra> {
	public QlvtNoiDungThamTraWrapper(QlvtNoiDungThamTra qlvtNoiDungThamTra) {
		_qlvtNoiDungThamTra = qlvtNoiDungThamTra;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtNoiDungThamTra.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtNoiDungThamTra.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mucKiemTra", getMucKiemTra());
		attributes.put("chaId", getChaId());
		attributes.put("coYKien", getCoYKien());
		attributes.put("buocXuLy", getBuocXuLy());
		attributes.put("thuTuHienThi", getThuTuHienThi());
		attributes.put("tthcNoiDungThamTraId", getTthcNoiDungThamTraId());
		attributes.put("tienTo", getTienTo());
		attributes.put("thanhPhanHoSo", getThanhPhanHoSo());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String mucKiemTra = (String)attributes.get("mucKiemTra");

		if (mucKiemTra != null) {
			setMucKiemTra(mucKiemTra);
		}

		Integer chaId = (Integer)attributes.get("chaId");

		if (chaId != null) {
			setChaId(chaId);
		}

		Integer coYKien = (Integer)attributes.get("coYKien");

		if (coYKien != null) {
			setCoYKien(coYKien);
		}

		Integer buocXuLy = (Integer)attributes.get("buocXuLy");

		if (buocXuLy != null) {
			setBuocXuLy(buocXuLy);
		}

		Integer thuTuHienThi = (Integer)attributes.get("thuTuHienThi");

		if (thuTuHienThi != null) {
			setThuTuHienThi(thuTuHienThi);
		}

		Integer tthcNoiDungThamTraId = (Integer)attributes.get(
				"tthcNoiDungThamTraId");

		if (tthcNoiDungThamTraId != null) {
			setTthcNoiDungThamTraId(tthcNoiDungThamTraId);
		}

		String tienTo = (String)attributes.get("tienTo");

		if (tienTo != null) {
			setTienTo(tienTo);
		}

		String thanhPhanHoSo = (String)attributes.get("thanhPhanHoSo");

		if (thanhPhanHoSo != null) {
			setThanhPhanHoSo(thanhPhanHoSo);
		}
	}

	/**
	* Returns the primary key of this qlvt noi dung tham tra.
	*
	* @return the primary key of this qlvt noi dung tham tra
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtNoiDungThamTra.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt noi dung tham tra.
	*
	* @param primaryKey the primary key of this qlvt noi dung tham tra
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtNoiDungThamTra.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt noi dung tham tra.
	*
	* @return the ID of this qlvt noi dung tham tra
	*/
	@Override
	public long getId() {
		return _qlvtNoiDungThamTra.getId();
	}

	/**
	* Sets the ID of this qlvt noi dung tham tra.
	*
	* @param id the ID of this qlvt noi dung tham tra
	*/
	@Override
	public void setId(long id) {
		_qlvtNoiDungThamTra.setId(id);
	}

	/**
	* Returns the muc kiem tra of this qlvt noi dung tham tra.
	*
	* @return the muc kiem tra of this qlvt noi dung tham tra
	*/
	@Override
	public java.lang.String getMucKiemTra() {
		return _qlvtNoiDungThamTra.getMucKiemTra();
	}

	/**
	* Sets the muc kiem tra of this qlvt noi dung tham tra.
	*
	* @param mucKiemTra the muc kiem tra of this qlvt noi dung tham tra
	*/
	@Override
	public void setMucKiemTra(java.lang.String mucKiemTra) {
		_qlvtNoiDungThamTra.setMucKiemTra(mucKiemTra);
	}

	/**
	* Returns the cha ID of this qlvt noi dung tham tra.
	*
	* @return the cha ID of this qlvt noi dung tham tra
	*/
	@Override
	public int getChaId() {
		return _qlvtNoiDungThamTra.getChaId();
	}

	/**
	* Sets the cha ID of this qlvt noi dung tham tra.
	*
	* @param chaId the cha ID of this qlvt noi dung tham tra
	*/
	@Override
	public void setChaId(int chaId) {
		_qlvtNoiDungThamTra.setChaId(chaId);
	}

	/**
	* Returns the co y kien of this qlvt noi dung tham tra.
	*
	* @return the co y kien of this qlvt noi dung tham tra
	*/
	@Override
	public int getCoYKien() {
		return _qlvtNoiDungThamTra.getCoYKien();
	}

	/**
	* Sets the co y kien of this qlvt noi dung tham tra.
	*
	* @param coYKien the co y kien of this qlvt noi dung tham tra
	*/
	@Override
	public void setCoYKien(int coYKien) {
		_qlvtNoiDungThamTra.setCoYKien(coYKien);
	}

	/**
	* Returns the buoc xu ly of this qlvt noi dung tham tra.
	*
	* @return the buoc xu ly of this qlvt noi dung tham tra
	*/
	@Override
	public int getBuocXuLy() {
		return _qlvtNoiDungThamTra.getBuocXuLy();
	}

	/**
	* Sets the buoc xu ly of this qlvt noi dung tham tra.
	*
	* @param buocXuLy the buoc xu ly of this qlvt noi dung tham tra
	*/
	@Override
	public void setBuocXuLy(int buocXuLy) {
		_qlvtNoiDungThamTra.setBuocXuLy(buocXuLy);
	}

	/**
	* Returns the thu tu hien thi of this qlvt noi dung tham tra.
	*
	* @return the thu tu hien thi of this qlvt noi dung tham tra
	*/
	@Override
	public int getThuTuHienThi() {
		return _qlvtNoiDungThamTra.getThuTuHienThi();
	}

	/**
	* Sets the thu tu hien thi of this qlvt noi dung tham tra.
	*
	* @param thuTuHienThi the thu tu hien thi of this qlvt noi dung tham tra
	*/
	@Override
	public void setThuTuHienThi(int thuTuHienThi) {
		_qlvtNoiDungThamTra.setThuTuHienThi(thuTuHienThi);
	}

	/**
	* Returns the tthc noi dung tham tra ID of this qlvt noi dung tham tra.
	*
	* @return the tthc noi dung tham tra ID of this qlvt noi dung tham tra
	*/
	@Override
	public int getTthcNoiDungThamTraId() {
		return _qlvtNoiDungThamTra.getTthcNoiDungThamTraId();
	}

	/**
	* Sets the tthc noi dung tham tra ID of this qlvt noi dung tham tra.
	*
	* @param tthcNoiDungThamTraId the tthc noi dung tham tra ID of this qlvt noi dung tham tra
	*/
	@Override
	public void setTthcNoiDungThamTraId(int tthcNoiDungThamTraId) {
		_qlvtNoiDungThamTra.setTthcNoiDungThamTraId(tthcNoiDungThamTraId);
	}

	/**
	* Returns the tien to of this qlvt noi dung tham tra.
	*
	* @return the tien to of this qlvt noi dung tham tra
	*/
	@Override
	public java.lang.String getTienTo() {
		return _qlvtNoiDungThamTra.getTienTo();
	}

	/**
	* Sets the tien to of this qlvt noi dung tham tra.
	*
	* @param tienTo the tien to of this qlvt noi dung tham tra
	*/
	@Override
	public void setTienTo(java.lang.String tienTo) {
		_qlvtNoiDungThamTra.setTienTo(tienTo);
	}

	/**
	* Returns the thanh phan ho so of this qlvt noi dung tham tra.
	*
	* @return the thanh phan ho so of this qlvt noi dung tham tra
	*/
	@Override
	public java.lang.String getThanhPhanHoSo() {
		return _qlvtNoiDungThamTra.getThanhPhanHoSo();
	}

	/**
	* Sets the thanh phan ho so of this qlvt noi dung tham tra.
	*
	* @param thanhPhanHoSo the thanh phan ho so of this qlvt noi dung tham tra
	*/
	@Override
	public void setThanhPhanHoSo(java.lang.String thanhPhanHoSo) {
		_qlvtNoiDungThamTra.setThanhPhanHoSo(thanhPhanHoSo);
	}

	@Override
	public boolean isNew() {
		return _qlvtNoiDungThamTra.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtNoiDungThamTra.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtNoiDungThamTra.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtNoiDungThamTra.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtNoiDungThamTra.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtNoiDungThamTra.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtNoiDungThamTra.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtNoiDungThamTra.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtNoiDungThamTra.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtNoiDungThamTra.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtNoiDungThamTra.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtNoiDungThamTraWrapper((QlvtNoiDungThamTra)_qlvtNoiDungThamTra.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra qlvtNoiDungThamTra) {
		return _qlvtNoiDungThamTra.compareTo(qlvtNoiDungThamTra);
	}

	@Override
	public int hashCode() {
		return _qlvtNoiDungThamTra.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra> toCacheModel() {
		return _qlvtNoiDungThamTra.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra toEscapedModel() {
		return new QlvtNoiDungThamTraWrapper(_qlvtNoiDungThamTra.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra toUnescapedModel() {
		return new QlvtNoiDungThamTraWrapper(_qlvtNoiDungThamTra.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtNoiDungThamTra.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtNoiDungThamTra.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtNoiDungThamTra.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtNoiDungThamTraWrapper)) {
			return false;
		}

		QlvtNoiDungThamTraWrapper qlvtNoiDungThamTraWrapper = (QlvtNoiDungThamTraWrapper)obj;

		if (Validator.equals(_qlvtNoiDungThamTra,
					qlvtNoiDungThamTraWrapper._qlvtNoiDungThamTra)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtNoiDungThamTra getWrappedQlvtNoiDungThamTra() {
		return _qlvtNoiDungThamTra;
	}

	@Override
	public QlvtNoiDungThamTra getWrappedModel() {
		return _qlvtNoiDungThamTra;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtNoiDungThamTra.resetOriginalValues();
	}

	private QlvtNoiDungThamTra _qlvtNoiDungThamTra;
}