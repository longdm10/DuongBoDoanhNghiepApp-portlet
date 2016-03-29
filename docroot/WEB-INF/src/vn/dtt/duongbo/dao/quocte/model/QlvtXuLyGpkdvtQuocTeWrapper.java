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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link QlvtXuLyGpkdvtQuocTe}.
 * </p>
 *
 * @author NoiPham
 * @see QlvtXuLyGpkdvtQuocTe
 * @generated
 */
public class QlvtXuLyGpkdvtQuocTeWrapper implements QlvtXuLyGpkdvtQuocTe,
	ModelWrapper<QlvtXuLyGpkdvtQuocTe> {
	public QlvtXuLyGpkdvtQuocTeWrapper(
		QlvtXuLyGpkdvtQuocTe qlvtXuLyGpkdvtQuocTe) {
		_qlvtXuLyGpkdvtQuocTe = qlvtXuLyGpkdvtQuocTe;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtXuLyGpkdvtQuocTe.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtXuLyGpkdvtQuocTe.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("thongTinXuLyId", getThongTinXuLyId());
		attributes.put("loaiCapPhep", getLoaiCapPhep());
		attributes.put("soGiapPhepVanTai", getSoGiapPhepVanTai());
		attributes.put("ngayCapGiayPhepVanTai", getNgayCapGiayPhepVanTai());
		attributes.put("coQuanCapGiayPhepVanTaiId",
			getCoQuanCapGiayPhepVanTaiId());
		attributes.put("ngayHetHanGiayPhepVanTai", getNgayHetHanGiayPhepVanTai());
		attributes.put("mucPhi", getMucPhi());
		attributes.put("ketQuaXuLy", getKetQuaXuLy());
		attributes.put("lyDoKhongDat", getLyDoKhongDat());

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

		String loaiCapPhep = (String)attributes.get("loaiCapPhep");

		if (loaiCapPhep != null) {
			setLoaiCapPhep(loaiCapPhep);
		}

		String soGiapPhepVanTai = (String)attributes.get("soGiapPhepVanTai");

		if (soGiapPhepVanTai != null) {
			setSoGiapPhepVanTai(soGiapPhepVanTai);
		}

		Date ngayCapGiayPhepVanTai = (Date)attributes.get(
				"ngayCapGiayPhepVanTai");

		if (ngayCapGiayPhepVanTai != null) {
			setNgayCapGiayPhepVanTai(ngayCapGiayPhepVanTai);
		}

		String coQuanCapGiayPhepVanTaiId = (String)attributes.get(
				"coQuanCapGiayPhepVanTaiId");

		if (coQuanCapGiayPhepVanTaiId != null) {
			setCoQuanCapGiayPhepVanTaiId(coQuanCapGiayPhepVanTaiId);
		}

		Date ngayHetHanGiayPhepVanTai = (Date)attributes.get(
				"ngayHetHanGiayPhepVanTai");

		if (ngayHetHanGiayPhepVanTai != null) {
			setNgayHetHanGiayPhepVanTai(ngayHetHanGiayPhepVanTai);
		}

		String mucPhi = (String)attributes.get("mucPhi");

		if (mucPhi != null) {
			setMucPhi(mucPhi);
		}

		String ketQuaXuLy = (String)attributes.get("ketQuaXuLy");

		if (ketQuaXuLy != null) {
			setKetQuaXuLy(ketQuaXuLy);
		}

		String lyDoKhongDat = (String)attributes.get("lyDoKhongDat");

		if (lyDoKhongDat != null) {
			setLyDoKhongDat(lyDoKhongDat);
		}
	}

	/**
	* Returns the primary key of this qlvt xu ly gpkdvt quoc te.
	*
	* @return the primary key of this qlvt xu ly gpkdvt quoc te
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtXuLyGpkdvtQuocTe.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt xu ly gpkdvt quoc te.
	*
	* @param primaryKey the primary key of this qlvt xu ly gpkdvt quoc te
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtXuLyGpkdvtQuocTe.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt xu ly gpkdvt quoc te.
	*
	* @return the ID of this qlvt xu ly gpkdvt quoc te
	*/
	@Override
	public long getId() {
		return _qlvtXuLyGpkdvtQuocTe.getId();
	}

	/**
	* Sets the ID of this qlvt xu ly gpkdvt quoc te.
	*
	* @param id the ID of this qlvt xu ly gpkdvt quoc te
	*/
	@Override
	public void setId(long id) {
		_qlvtXuLyGpkdvtQuocTe.setId(id);
	}

	/**
	* Returns the thong tin xu ly ID of this qlvt xu ly gpkdvt quoc te.
	*
	* @return the thong tin xu ly ID of this qlvt xu ly gpkdvt quoc te
	*/
	@Override
	public int getThongTinXuLyId() {
		return _qlvtXuLyGpkdvtQuocTe.getThongTinXuLyId();
	}

	/**
	* Sets the thong tin xu ly ID of this qlvt xu ly gpkdvt quoc te.
	*
	* @param thongTinXuLyId the thong tin xu ly ID of this qlvt xu ly gpkdvt quoc te
	*/
	@Override
	public void setThongTinXuLyId(int thongTinXuLyId) {
		_qlvtXuLyGpkdvtQuocTe.setThongTinXuLyId(thongTinXuLyId);
	}

	/**
	* Returns the loai cap phep of this qlvt xu ly gpkdvt quoc te.
	*
	* @return the loai cap phep of this qlvt xu ly gpkdvt quoc te
	*/
	@Override
	public java.lang.String getLoaiCapPhep() {
		return _qlvtXuLyGpkdvtQuocTe.getLoaiCapPhep();
	}

	/**
	* Sets the loai cap phep of this qlvt xu ly gpkdvt quoc te.
	*
	* @param loaiCapPhep the loai cap phep of this qlvt xu ly gpkdvt quoc te
	*/
	@Override
	public void setLoaiCapPhep(java.lang.String loaiCapPhep) {
		_qlvtXuLyGpkdvtQuocTe.setLoaiCapPhep(loaiCapPhep);
	}

	/**
	* Returns the so giap phep van tai of this qlvt xu ly gpkdvt quoc te.
	*
	* @return the so giap phep van tai of this qlvt xu ly gpkdvt quoc te
	*/
	@Override
	public java.lang.String getSoGiapPhepVanTai() {
		return _qlvtXuLyGpkdvtQuocTe.getSoGiapPhepVanTai();
	}

	/**
	* Sets the so giap phep van tai of this qlvt xu ly gpkdvt quoc te.
	*
	* @param soGiapPhepVanTai the so giap phep van tai of this qlvt xu ly gpkdvt quoc te
	*/
	@Override
	public void setSoGiapPhepVanTai(java.lang.String soGiapPhepVanTai) {
		_qlvtXuLyGpkdvtQuocTe.setSoGiapPhepVanTai(soGiapPhepVanTai);
	}

	/**
	* Returns the ngay cap giay phep van tai of this qlvt xu ly gpkdvt quoc te.
	*
	* @return the ngay cap giay phep van tai of this qlvt xu ly gpkdvt quoc te
	*/
	@Override
	public java.util.Date getNgayCapGiayPhepVanTai() {
		return _qlvtXuLyGpkdvtQuocTe.getNgayCapGiayPhepVanTai();
	}

	/**
	* Sets the ngay cap giay phep van tai of this qlvt xu ly gpkdvt quoc te.
	*
	* @param ngayCapGiayPhepVanTai the ngay cap giay phep van tai of this qlvt xu ly gpkdvt quoc te
	*/
	@Override
	public void setNgayCapGiayPhepVanTai(java.util.Date ngayCapGiayPhepVanTai) {
		_qlvtXuLyGpkdvtQuocTe.setNgayCapGiayPhepVanTai(ngayCapGiayPhepVanTai);
	}

	/**
	* Returns the co quan cap giay phep van tai ID of this qlvt xu ly gpkdvt quoc te.
	*
	* @return the co quan cap giay phep van tai ID of this qlvt xu ly gpkdvt quoc te
	*/
	@Override
	public java.lang.String getCoQuanCapGiayPhepVanTaiId() {
		return _qlvtXuLyGpkdvtQuocTe.getCoQuanCapGiayPhepVanTaiId();
	}

	/**
	* Sets the co quan cap giay phep van tai ID of this qlvt xu ly gpkdvt quoc te.
	*
	* @param coQuanCapGiayPhepVanTaiId the co quan cap giay phep van tai ID of this qlvt xu ly gpkdvt quoc te
	*/
	@Override
	public void setCoQuanCapGiayPhepVanTaiId(
		java.lang.String coQuanCapGiayPhepVanTaiId) {
		_qlvtXuLyGpkdvtQuocTe.setCoQuanCapGiayPhepVanTaiId(coQuanCapGiayPhepVanTaiId);
	}

	/**
	* Returns the ngay het han giay phep van tai of this qlvt xu ly gpkdvt quoc te.
	*
	* @return the ngay het han giay phep van tai of this qlvt xu ly gpkdvt quoc te
	*/
	@Override
	public java.util.Date getNgayHetHanGiayPhepVanTai() {
		return _qlvtXuLyGpkdvtQuocTe.getNgayHetHanGiayPhepVanTai();
	}

	/**
	* Sets the ngay het han giay phep van tai of this qlvt xu ly gpkdvt quoc te.
	*
	* @param ngayHetHanGiayPhepVanTai the ngay het han giay phep van tai of this qlvt xu ly gpkdvt quoc te
	*/
	@Override
	public void setNgayHetHanGiayPhepVanTai(
		java.util.Date ngayHetHanGiayPhepVanTai) {
		_qlvtXuLyGpkdvtQuocTe.setNgayHetHanGiayPhepVanTai(ngayHetHanGiayPhepVanTai);
	}

	/**
	* Returns the muc phi of this qlvt xu ly gpkdvt quoc te.
	*
	* @return the muc phi of this qlvt xu ly gpkdvt quoc te
	*/
	@Override
	public java.lang.String getMucPhi() {
		return _qlvtXuLyGpkdvtQuocTe.getMucPhi();
	}

	/**
	* Sets the muc phi of this qlvt xu ly gpkdvt quoc te.
	*
	* @param mucPhi the muc phi of this qlvt xu ly gpkdvt quoc te
	*/
	@Override
	public void setMucPhi(java.lang.String mucPhi) {
		_qlvtXuLyGpkdvtQuocTe.setMucPhi(mucPhi);
	}

	/**
	* Returns the ket qua xu ly of this qlvt xu ly gpkdvt quoc te.
	*
	* @return the ket qua xu ly of this qlvt xu ly gpkdvt quoc te
	*/
	@Override
	public java.lang.String getKetQuaXuLy() {
		return _qlvtXuLyGpkdvtQuocTe.getKetQuaXuLy();
	}

	/**
	* Sets the ket qua xu ly of this qlvt xu ly gpkdvt quoc te.
	*
	* @param ketQuaXuLy the ket qua xu ly of this qlvt xu ly gpkdvt quoc te
	*/
	@Override
	public void setKetQuaXuLy(java.lang.String ketQuaXuLy) {
		_qlvtXuLyGpkdvtQuocTe.setKetQuaXuLy(ketQuaXuLy);
	}

	/**
	* Returns the ly do khong dat of this qlvt xu ly gpkdvt quoc te.
	*
	* @return the ly do khong dat of this qlvt xu ly gpkdvt quoc te
	*/
	@Override
	public java.lang.String getLyDoKhongDat() {
		return _qlvtXuLyGpkdvtQuocTe.getLyDoKhongDat();
	}

	/**
	* Sets the ly do khong dat of this qlvt xu ly gpkdvt quoc te.
	*
	* @param lyDoKhongDat the ly do khong dat of this qlvt xu ly gpkdvt quoc te
	*/
	@Override
	public void setLyDoKhongDat(java.lang.String lyDoKhongDat) {
		_qlvtXuLyGpkdvtQuocTe.setLyDoKhongDat(lyDoKhongDat);
	}

	@Override
	public boolean isNew() {
		return _qlvtXuLyGpkdvtQuocTe.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtXuLyGpkdvtQuocTe.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtXuLyGpkdvtQuocTe.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtXuLyGpkdvtQuocTe.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtXuLyGpkdvtQuocTe.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtXuLyGpkdvtQuocTe.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtXuLyGpkdvtQuocTe.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtXuLyGpkdvtQuocTe.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtXuLyGpkdvtQuocTe.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtXuLyGpkdvtQuocTe.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtXuLyGpkdvtQuocTe.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtXuLyGpkdvtQuocTeWrapper((QlvtXuLyGpkdvtQuocTe)_qlvtXuLyGpkdvtQuocTe.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTe qlvtXuLyGpkdvtQuocTe) {
		return _qlvtXuLyGpkdvtQuocTe.compareTo(qlvtXuLyGpkdvtQuocTe);
	}

	@Override
	public int hashCode() {
		return _qlvtXuLyGpkdvtQuocTe.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTe> toCacheModel() {
		return _qlvtXuLyGpkdvtQuocTe.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTe toEscapedModel() {
		return new QlvtXuLyGpkdvtQuocTeWrapper(_qlvtXuLyGpkdvtQuocTe.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTe toUnescapedModel() {
		return new QlvtXuLyGpkdvtQuocTeWrapper(_qlvtXuLyGpkdvtQuocTe.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtXuLyGpkdvtQuocTe.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtXuLyGpkdvtQuocTe.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtXuLyGpkdvtQuocTe.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtXuLyGpkdvtQuocTeWrapper)) {
			return false;
		}

		QlvtXuLyGpkdvtQuocTeWrapper qlvtXuLyGpkdvtQuocTeWrapper = (QlvtXuLyGpkdvtQuocTeWrapper)obj;

		if (Validator.equals(_qlvtXuLyGpkdvtQuocTe,
					qlvtXuLyGpkdvtQuocTeWrapper._qlvtXuLyGpkdvtQuocTe)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtXuLyGpkdvtQuocTe getWrappedQlvtXuLyGpkdvtQuocTe() {
		return _qlvtXuLyGpkdvtQuocTe;
	}

	@Override
	public QlvtXuLyGpkdvtQuocTe getWrappedModel() {
		return _qlvtXuLyGpkdvtQuocTe;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtXuLyGpkdvtQuocTe.resetOriginalValues();
	}

	private QlvtXuLyGpkdvtQuocTe _qlvtXuLyGpkdvtQuocTe;
}