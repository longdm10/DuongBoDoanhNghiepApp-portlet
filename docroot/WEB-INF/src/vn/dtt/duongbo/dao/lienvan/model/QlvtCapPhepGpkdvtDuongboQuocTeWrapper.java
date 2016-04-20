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

package vn.dtt.duongbo.dao.lienvan.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link QlvtCapPhepGpkdvtDuongboQuocTe}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtCapPhepGpkdvtDuongboQuocTe
 * @generated
 */
public class QlvtCapPhepGpkdvtDuongboQuocTeWrapper
	implements QlvtCapPhepGpkdvtDuongboQuocTe,
		ModelWrapper<QlvtCapPhepGpkdvtDuongboQuocTe> {
	public QlvtCapPhepGpkdvtDuongboQuocTeWrapper(
		QlvtCapPhepGpkdvtDuongboQuocTe qlvtCapPhepGpkdvtDuongboQuocTe) {
		_qlvtCapPhepGpkdvtDuongboQuocTe = qlvtCapPhepGpkdvtDuongboQuocTe;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtCapPhepGpkdvtDuongboQuocTe.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtCapPhepGpkdvtDuongboQuocTe.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("gpKinhDoanhVanTaiOtoId", getGpKinhDoanhVanTaiOtoId());
		attributes.put("soGpvtQuocTe", getSoGpvtQuocTe());
		attributes.put("coQuanCapLanDauId", getCoQuanCapLanDauId());
		attributes.put("ngayCapGpvt", getNgayCapGpvt());
		attributes.put("coQuanCapGpvtId", getCoQuanCapGpvtId());
		attributes.put("ngayGiaHan", getNgayGiaHan());
		attributes.put("ngayHetHan", getNgayHetHan());
		attributes.put("lanGiaHan", getLanGiaHan());
		attributes.put("fileId", getFileId());
		attributes.put("trangThai", getTrangThai());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long gpKinhDoanhVanTaiOtoId = (Long)attributes.get(
				"gpKinhDoanhVanTaiOtoId");

		if (gpKinhDoanhVanTaiOtoId != null) {
			setGpKinhDoanhVanTaiOtoId(gpKinhDoanhVanTaiOtoId);
		}

		String soGpvtQuocTe = (String)attributes.get("soGpvtQuocTe");

		if (soGpvtQuocTe != null) {
			setSoGpvtQuocTe(soGpvtQuocTe);
		}

		Long coQuanCapLanDauId = (Long)attributes.get("coQuanCapLanDauId");

		if (coQuanCapLanDauId != null) {
			setCoQuanCapLanDauId(coQuanCapLanDauId);
		}

		Date ngayCapGpvt = (Date)attributes.get("ngayCapGpvt");

		if (ngayCapGpvt != null) {
			setNgayCapGpvt(ngayCapGpvt);
		}

		Long coQuanCapGpvtId = (Long)attributes.get("coQuanCapGpvtId");

		if (coQuanCapGpvtId != null) {
			setCoQuanCapGpvtId(coQuanCapGpvtId);
		}

		Date ngayGiaHan = (Date)attributes.get("ngayGiaHan");

		if (ngayGiaHan != null) {
			setNgayGiaHan(ngayGiaHan);
		}

		Date ngayHetHan = (Date)attributes.get("ngayHetHan");

		if (ngayHetHan != null) {
			setNgayHetHan(ngayHetHan);
		}

		Integer lanGiaHan = (Integer)attributes.get("lanGiaHan");

		if (lanGiaHan != null) {
			setLanGiaHan(lanGiaHan);
		}

		Long fileId = (Long)attributes.get("fileId");

		if (fileId != null) {
			setFileId(fileId);
		}

		String trangThai = (String)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}
	}

	/**
	* Returns the primary key of this qlvt cap phep gpkdvt duongbo quoc te.
	*
	* @return the primary key of this qlvt cap phep gpkdvt duongbo quoc te
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtCapPhepGpkdvtDuongboQuocTe.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt cap phep gpkdvt duongbo quoc te.
	*
	* @param primaryKey the primary key of this qlvt cap phep gpkdvt duongbo quoc te
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtCapPhepGpkdvtDuongboQuocTe.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt cap phep gpkdvt duongbo quoc te.
	*
	* @return the ID of this qlvt cap phep gpkdvt duongbo quoc te
	*/
	@Override
	public long getId() {
		return _qlvtCapPhepGpkdvtDuongboQuocTe.getId();
	}

	/**
	* Sets the ID of this qlvt cap phep gpkdvt duongbo quoc te.
	*
	* @param id the ID of this qlvt cap phep gpkdvt duongbo quoc te
	*/
	@Override
	public void setId(long id) {
		_qlvtCapPhepGpkdvtDuongboQuocTe.setId(id);
	}

	/**
	* Returns the gp kinh doanh van tai oto ID of this qlvt cap phep gpkdvt duongbo quoc te.
	*
	* @return the gp kinh doanh van tai oto ID of this qlvt cap phep gpkdvt duongbo quoc te
	*/
	@Override
	public long getGpKinhDoanhVanTaiOtoId() {
		return _qlvtCapPhepGpkdvtDuongboQuocTe.getGpKinhDoanhVanTaiOtoId();
	}

	/**
	* Sets the gp kinh doanh van tai oto ID of this qlvt cap phep gpkdvt duongbo quoc te.
	*
	* @param gpKinhDoanhVanTaiOtoId the gp kinh doanh van tai oto ID of this qlvt cap phep gpkdvt duongbo quoc te
	*/
	@Override
	public void setGpKinhDoanhVanTaiOtoId(long gpKinhDoanhVanTaiOtoId) {
		_qlvtCapPhepGpkdvtDuongboQuocTe.setGpKinhDoanhVanTaiOtoId(gpKinhDoanhVanTaiOtoId);
	}

	/**
	* Returns the so gpvt quoc te of this qlvt cap phep gpkdvt duongbo quoc te.
	*
	* @return the so gpvt quoc te of this qlvt cap phep gpkdvt duongbo quoc te
	*/
	@Override
	public java.lang.String getSoGpvtQuocTe() {
		return _qlvtCapPhepGpkdvtDuongboQuocTe.getSoGpvtQuocTe();
	}

	/**
	* Sets the so gpvt quoc te of this qlvt cap phep gpkdvt duongbo quoc te.
	*
	* @param soGpvtQuocTe the so gpvt quoc te of this qlvt cap phep gpkdvt duongbo quoc te
	*/
	@Override
	public void setSoGpvtQuocTe(java.lang.String soGpvtQuocTe) {
		_qlvtCapPhepGpkdvtDuongboQuocTe.setSoGpvtQuocTe(soGpvtQuocTe);
	}

	/**
	* Returns the co quan cap lan dau ID of this qlvt cap phep gpkdvt duongbo quoc te.
	*
	* @return the co quan cap lan dau ID of this qlvt cap phep gpkdvt duongbo quoc te
	*/
	@Override
	public long getCoQuanCapLanDauId() {
		return _qlvtCapPhepGpkdvtDuongboQuocTe.getCoQuanCapLanDauId();
	}

	/**
	* Sets the co quan cap lan dau ID of this qlvt cap phep gpkdvt duongbo quoc te.
	*
	* @param coQuanCapLanDauId the co quan cap lan dau ID of this qlvt cap phep gpkdvt duongbo quoc te
	*/
	@Override
	public void setCoQuanCapLanDauId(long coQuanCapLanDauId) {
		_qlvtCapPhepGpkdvtDuongboQuocTe.setCoQuanCapLanDauId(coQuanCapLanDauId);
	}

	/**
	* Returns the ngay cap gpvt of this qlvt cap phep gpkdvt duongbo quoc te.
	*
	* @return the ngay cap gpvt of this qlvt cap phep gpkdvt duongbo quoc te
	*/
	@Override
	public java.util.Date getNgayCapGpvt() {
		return _qlvtCapPhepGpkdvtDuongboQuocTe.getNgayCapGpvt();
	}

	/**
	* Sets the ngay cap gpvt of this qlvt cap phep gpkdvt duongbo quoc te.
	*
	* @param ngayCapGpvt the ngay cap gpvt of this qlvt cap phep gpkdvt duongbo quoc te
	*/
	@Override
	public void setNgayCapGpvt(java.util.Date ngayCapGpvt) {
		_qlvtCapPhepGpkdvtDuongboQuocTe.setNgayCapGpvt(ngayCapGpvt);
	}

	/**
	* Returns the co quan cap gpvt ID of this qlvt cap phep gpkdvt duongbo quoc te.
	*
	* @return the co quan cap gpvt ID of this qlvt cap phep gpkdvt duongbo quoc te
	*/
	@Override
	public long getCoQuanCapGpvtId() {
		return _qlvtCapPhepGpkdvtDuongboQuocTe.getCoQuanCapGpvtId();
	}

	/**
	* Sets the co quan cap gpvt ID of this qlvt cap phep gpkdvt duongbo quoc te.
	*
	* @param coQuanCapGpvtId the co quan cap gpvt ID of this qlvt cap phep gpkdvt duongbo quoc te
	*/
	@Override
	public void setCoQuanCapGpvtId(long coQuanCapGpvtId) {
		_qlvtCapPhepGpkdvtDuongboQuocTe.setCoQuanCapGpvtId(coQuanCapGpvtId);
	}

	/**
	* Returns the ngay gia han of this qlvt cap phep gpkdvt duongbo quoc te.
	*
	* @return the ngay gia han of this qlvt cap phep gpkdvt duongbo quoc te
	*/
	@Override
	public java.util.Date getNgayGiaHan() {
		return _qlvtCapPhepGpkdvtDuongboQuocTe.getNgayGiaHan();
	}

	/**
	* Sets the ngay gia han of this qlvt cap phep gpkdvt duongbo quoc te.
	*
	* @param ngayGiaHan the ngay gia han of this qlvt cap phep gpkdvt duongbo quoc te
	*/
	@Override
	public void setNgayGiaHan(java.util.Date ngayGiaHan) {
		_qlvtCapPhepGpkdvtDuongboQuocTe.setNgayGiaHan(ngayGiaHan);
	}

	/**
	* Returns the ngay het han of this qlvt cap phep gpkdvt duongbo quoc te.
	*
	* @return the ngay het han of this qlvt cap phep gpkdvt duongbo quoc te
	*/
	@Override
	public java.util.Date getNgayHetHan() {
		return _qlvtCapPhepGpkdvtDuongboQuocTe.getNgayHetHan();
	}

	/**
	* Sets the ngay het han of this qlvt cap phep gpkdvt duongbo quoc te.
	*
	* @param ngayHetHan the ngay het han of this qlvt cap phep gpkdvt duongbo quoc te
	*/
	@Override
	public void setNgayHetHan(java.util.Date ngayHetHan) {
		_qlvtCapPhepGpkdvtDuongboQuocTe.setNgayHetHan(ngayHetHan);
	}

	/**
	* Returns the lan gia han of this qlvt cap phep gpkdvt duongbo quoc te.
	*
	* @return the lan gia han of this qlvt cap phep gpkdvt duongbo quoc te
	*/
	@Override
	public int getLanGiaHan() {
		return _qlvtCapPhepGpkdvtDuongboQuocTe.getLanGiaHan();
	}

	/**
	* Sets the lan gia han of this qlvt cap phep gpkdvt duongbo quoc te.
	*
	* @param lanGiaHan the lan gia han of this qlvt cap phep gpkdvt duongbo quoc te
	*/
	@Override
	public void setLanGiaHan(int lanGiaHan) {
		_qlvtCapPhepGpkdvtDuongboQuocTe.setLanGiaHan(lanGiaHan);
	}

	/**
	* Returns the file ID of this qlvt cap phep gpkdvt duongbo quoc te.
	*
	* @return the file ID of this qlvt cap phep gpkdvt duongbo quoc te
	*/
	@Override
	public long getFileId() {
		return _qlvtCapPhepGpkdvtDuongboQuocTe.getFileId();
	}

	/**
	* Sets the file ID of this qlvt cap phep gpkdvt duongbo quoc te.
	*
	* @param fileId the file ID of this qlvt cap phep gpkdvt duongbo quoc te
	*/
	@Override
	public void setFileId(long fileId) {
		_qlvtCapPhepGpkdvtDuongboQuocTe.setFileId(fileId);
	}

	/**
	* Returns the trang thai of this qlvt cap phep gpkdvt duongbo quoc te.
	*
	* @return the trang thai of this qlvt cap phep gpkdvt duongbo quoc te
	*/
	@Override
	public java.lang.String getTrangThai() {
		return _qlvtCapPhepGpkdvtDuongboQuocTe.getTrangThai();
	}

	/**
	* Sets the trang thai of this qlvt cap phep gpkdvt duongbo quoc te.
	*
	* @param trangThai the trang thai of this qlvt cap phep gpkdvt duongbo quoc te
	*/
	@Override
	public void setTrangThai(java.lang.String trangThai) {
		_qlvtCapPhepGpkdvtDuongboQuocTe.setTrangThai(trangThai);
	}

	@Override
	public boolean isNew() {
		return _qlvtCapPhepGpkdvtDuongboQuocTe.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtCapPhepGpkdvtDuongboQuocTe.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtCapPhepGpkdvtDuongboQuocTe.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtCapPhepGpkdvtDuongboQuocTe.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtCapPhepGpkdvtDuongboQuocTe.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtCapPhepGpkdvtDuongboQuocTe.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtCapPhepGpkdvtDuongboQuocTe.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtCapPhepGpkdvtDuongboQuocTe.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtCapPhepGpkdvtDuongboQuocTe.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtCapPhepGpkdvtDuongboQuocTe.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtCapPhepGpkdvtDuongboQuocTe.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtCapPhepGpkdvtDuongboQuocTeWrapper((QlvtCapPhepGpkdvtDuongboQuocTe)_qlvtCapPhepGpkdvtDuongboQuocTe.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpkdvtDuongboQuocTe qlvtCapPhepGpkdvtDuongboQuocTe) {
		return _qlvtCapPhepGpkdvtDuongboQuocTe.compareTo(qlvtCapPhepGpkdvtDuongboQuocTe);
	}

	@Override
	public int hashCode() {
		return _qlvtCapPhepGpkdvtDuongboQuocTe.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpkdvtDuongboQuocTe> toCacheModel() {
		return _qlvtCapPhepGpkdvtDuongboQuocTe.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpkdvtDuongboQuocTe toEscapedModel() {
		return new QlvtCapPhepGpkdvtDuongboQuocTeWrapper(_qlvtCapPhepGpkdvtDuongboQuocTe.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpkdvtDuongboQuocTe toUnescapedModel() {
		return new QlvtCapPhepGpkdvtDuongboQuocTeWrapper(_qlvtCapPhepGpkdvtDuongboQuocTe.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtCapPhepGpkdvtDuongboQuocTe.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtCapPhepGpkdvtDuongboQuocTe.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtCapPhepGpkdvtDuongboQuocTe.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtCapPhepGpkdvtDuongboQuocTeWrapper)) {
			return false;
		}

		QlvtCapPhepGpkdvtDuongboQuocTeWrapper qlvtCapPhepGpkdvtDuongboQuocTeWrapper =
			(QlvtCapPhepGpkdvtDuongboQuocTeWrapper)obj;

		if (Validator.equals(_qlvtCapPhepGpkdvtDuongboQuocTe,
					qlvtCapPhepGpkdvtDuongboQuocTeWrapper._qlvtCapPhepGpkdvtDuongboQuocTe)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtCapPhepGpkdvtDuongboQuocTe getWrappedQlvtCapPhepGpkdvtDuongboQuocTe() {
		return _qlvtCapPhepGpkdvtDuongboQuocTe;
	}

	@Override
	public QlvtCapPhepGpkdvtDuongboQuocTe getWrappedModel() {
		return _qlvtCapPhepGpkdvtDuongboQuocTe;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtCapPhepGpkdvtDuongboQuocTe.resetOriginalValues();
	}

	private QlvtCapPhepGpkdvtDuongboQuocTe _qlvtCapPhepGpkdvtDuongboQuocTe;
}