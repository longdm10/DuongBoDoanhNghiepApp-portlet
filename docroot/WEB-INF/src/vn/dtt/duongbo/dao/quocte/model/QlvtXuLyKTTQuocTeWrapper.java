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
 * This class is a wrapper for {@link QlvtXuLyKTTQuocTe}.
 * </p>
 *
 * @author NoiPham
 * @see QlvtXuLyKTTQuocTe
 * @generated
 */
public class QlvtXuLyKTTQuocTeWrapper implements QlvtXuLyKTTQuocTe,
	ModelWrapper<QlvtXuLyKTTQuocTe> {
	public QlvtXuLyKTTQuocTeWrapper(QlvtXuLyKTTQuocTe qlvtXuLyKTTQuocTe) {
		_qlvtXuLyKTTQuocTe = qlvtXuLyKTTQuocTe;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtXuLyKTTQuocTe.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtXuLyKTTQuocTe.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("thongTinXuLyId", getThongTinXuLyId());
		attributes.put("loaiCapPhep", getLoaiCapPhep());
		attributes.put("benDi", getBenDi());
		attributes.put("diemDi", getDiemDi());
		attributes.put("benDen", getBenDen());
		attributes.put("diemDen", getDiemDen());
		attributes.put("cuLyVanChuyen", getCuLyVanChuyen());
		attributes.put("hanhTrinhChay", getHanhTrinhChay());
		attributes.put("cuaKhau", getCuaKhau());
		attributes.put("ketQuaDanhGiaGPVT", getKetQuaDanhGiaGPVT());
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

		String benDi = (String)attributes.get("benDi");

		if (benDi != null) {
			setBenDi(benDi);
		}

		String diemDi = (String)attributes.get("diemDi");

		if (diemDi != null) {
			setDiemDi(diemDi);
		}

		String benDen = (String)attributes.get("benDen");

		if (benDen != null) {
			setBenDen(benDen);
		}

		String diemDen = (String)attributes.get("diemDen");

		if (diemDen != null) {
			setDiemDen(diemDen);
		}

		Integer cuLyVanChuyen = (Integer)attributes.get("cuLyVanChuyen");

		if (cuLyVanChuyen != null) {
			setCuLyVanChuyen(cuLyVanChuyen);
		}

		String hanhTrinhChay = (String)attributes.get("hanhTrinhChay");

		if (hanhTrinhChay != null) {
			setHanhTrinhChay(hanhTrinhChay);
		}

		String cuaKhau = (String)attributes.get("cuaKhau");

		if (cuaKhau != null) {
			setCuaKhau(cuaKhau);
		}

		String ketQuaDanhGiaGPVT = (String)attributes.get("ketQuaDanhGiaGPVT");

		if (ketQuaDanhGiaGPVT != null) {
			setKetQuaDanhGiaGPVT(ketQuaDanhGiaGPVT);
		}

		String lyDoKhongDat = (String)attributes.get("lyDoKhongDat");

		if (lyDoKhongDat != null) {
			setLyDoKhongDat(lyDoKhongDat);
		}
	}

	/**
	* Returns the primary key of this qlvt xu ly k t t quoc te.
	*
	* @return the primary key of this qlvt xu ly k t t quoc te
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtXuLyKTTQuocTe.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt xu ly k t t quoc te.
	*
	* @param primaryKey the primary key of this qlvt xu ly k t t quoc te
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtXuLyKTTQuocTe.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt xu ly k t t quoc te.
	*
	* @return the ID of this qlvt xu ly k t t quoc te
	*/
	@Override
	public long getId() {
		return _qlvtXuLyKTTQuocTe.getId();
	}

	/**
	* Sets the ID of this qlvt xu ly k t t quoc te.
	*
	* @param id the ID of this qlvt xu ly k t t quoc te
	*/
	@Override
	public void setId(long id) {
		_qlvtXuLyKTTQuocTe.setId(id);
	}

	/**
	* Returns the thong tin xu ly ID of this qlvt xu ly k t t quoc te.
	*
	* @return the thong tin xu ly ID of this qlvt xu ly k t t quoc te
	*/
	@Override
	public int getThongTinXuLyId() {
		return _qlvtXuLyKTTQuocTe.getThongTinXuLyId();
	}

	/**
	* Sets the thong tin xu ly ID of this qlvt xu ly k t t quoc te.
	*
	* @param thongTinXuLyId the thong tin xu ly ID of this qlvt xu ly k t t quoc te
	*/
	@Override
	public void setThongTinXuLyId(int thongTinXuLyId) {
		_qlvtXuLyKTTQuocTe.setThongTinXuLyId(thongTinXuLyId);
	}

	/**
	* Returns the loai cap phep of this qlvt xu ly k t t quoc te.
	*
	* @return the loai cap phep of this qlvt xu ly k t t quoc te
	*/
	@Override
	public java.lang.String getLoaiCapPhep() {
		return _qlvtXuLyKTTQuocTe.getLoaiCapPhep();
	}

	/**
	* Sets the loai cap phep of this qlvt xu ly k t t quoc te.
	*
	* @param loaiCapPhep the loai cap phep of this qlvt xu ly k t t quoc te
	*/
	@Override
	public void setLoaiCapPhep(java.lang.String loaiCapPhep) {
		_qlvtXuLyKTTQuocTe.setLoaiCapPhep(loaiCapPhep);
	}

	/**
	* Returns the ben di of this qlvt xu ly k t t quoc te.
	*
	* @return the ben di of this qlvt xu ly k t t quoc te
	*/
	@Override
	public java.lang.String getBenDi() {
		return _qlvtXuLyKTTQuocTe.getBenDi();
	}

	/**
	* Sets the ben di of this qlvt xu ly k t t quoc te.
	*
	* @param benDi the ben di of this qlvt xu ly k t t quoc te
	*/
	@Override
	public void setBenDi(java.lang.String benDi) {
		_qlvtXuLyKTTQuocTe.setBenDi(benDi);
	}

	/**
	* Returns the diem di of this qlvt xu ly k t t quoc te.
	*
	* @return the diem di of this qlvt xu ly k t t quoc te
	*/
	@Override
	public java.lang.String getDiemDi() {
		return _qlvtXuLyKTTQuocTe.getDiemDi();
	}

	/**
	* Sets the diem di of this qlvt xu ly k t t quoc te.
	*
	* @param diemDi the diem di of this qlvt xu ly k t t quoc te
	*/
	@Override
	public void setDiemDi(java.lang.String diemDi) {
		_qlvtXuLyKTTQuocTe.setDiemDi(diemDi);
	}

	/**
	* Returns the ben den of this qlvt xu ly k t t quoc te.
	*
	* @return the ben den of this qlvt xu ly k t t quoc te
	*/
	@Override
	public java.lang.String getBenDen() {
		return _qlvtXuLyKTTQuocTe.getBenDen();
	}

	/**
	* Sets the ben den of this qlvt xu ly k t t quoc te.
	*
	* @param benDen the ben den of this qlvt xu ly k t t quoc te
	*/
	@Override
	public void setBenDen(java.lang.String benDen) {
		_qlvtXuLyKTTQuocTe.setBenDen(benDen);
	}

	/**
	* Returns the diem den of this qlvt xu ly k t t quoc te.
	*
	* @return the diem den of this qlvt xu ly k t t quoc te
	*/
	@Override
	public java.lang.String getDiemDen() {
		return _qlvtXuLyKTTQuocTe.getDiemDen();
	}

	/**
	* Sets the diem den of this qlvt xu ly k t t quoc te.
	*
	* @param diemDen the diem den of this qlvt xu ly k t t quoc te
	*/
	@Override
	public void setDiemDen(java.lang.String diemDen) {
		_qlvtXuLyKTTQuocTe.setDiemDen(diemDen);
	}

	/**
	* Returns the cu ly van chuyen of this qlvt xu ly k t t quoc te.
	*
	* @return the cu ly van chuyen of this qlvt xu ly k t t quoc te
	*/
	@Override
	public int getCuLyVanChuyen() {
		return _qlvtXuLyKTTQuocTe.getCuLyVanChuyen();
	}

	/**
	* Sets the cu ly van chuyen of this qlvt xu ly k t t quoc te.
	*
	* @param cuLyVanChuyen the cu ly van chuyen of this qlvt xu ly k t t quoc te
	*/
	@Override
	public void setCuLyVanChuyen(int cuLyVanChuyen) {
		_qlvtXuLyKTTQuocTe.setCuLyVanChuyen(cuLyVanChuyen);
	}

	/**
	* Returns the hanh trinh chay of this qlvt xu ly k t t quoc te.
	*
	* @return the hanh trinh chay of this qlvt xu ly k t t quoc te
	*/
	@Override
	public java.lang.String getHanhTrinhChay() {
		return _qlvtXuLyKTTQuocTe.getHanhTrinhChay();
	}

	/**
	* Sets the hanh trinh chay of this qlvt xu ly k t t quoc te.
	*
	* @param hanhTrinhChay the hanh trinh chay of this qlvt xu ly k t t quoc te
	*/
	@Override
	public void setHanhTrinhChay(java.lang.String hanhTrinhChay) {
		_qlvtXuLyKTTQuocTe.setHanhTrinhChay(hanhTrinhChay);
	}

	/**
	* Returns the cua khau of this qlvt xu ly k t t quoc te.
	*
	* @return the cua khau of this qlvt xu ly k t t quoc te
	*/
	@Override
	public java.lang.String getCuaKhau() {
		return _qlvtXuLyKTTQuocTe.getCuaKhau();
	}

	/**
	* Sets the cua khau of this qlvt xu ly k t t quoc te.
	*
	* @param cuaKhau the cua khau of this qlvt xu ly k t t quoc te
	*/
	@Override
	public void setCuaKhau(java.lang.String cuaKhau) {
		_qlvtXuLyKTTQuocTe.setCuaKhau(cuaKhau);
	}

	/**
	* Returns the ket qua danh gia g p v t of this qlvt xu ly k t t quoc te.
	*
	* @return the ket qua danh gia g p v t of this qlvt xu ly k t t quoc te
	*/
	@Override
	public java.lang.String getKetQuaDanhGiaGPVT() {
		return _qlvtXuLyKTTQuocTe.getKetQuaDanhGiaGPVT();
	}

	/**
	* Sets the ket qua danh gia g p v t of this qlvt xu ly k t t quoc te.
	*
	* @param ketQuaDanhGiaGPVT the ket qua danh gia g p v t of this qlvt xu ly k t t quoc te
	*/
	@Override
	public void setKetQuaDanhGiaGPVT(java.lang.String ketQuaDanhGiaGPVT) {
		_qlvtXuLyKTTQuocTe.setKetQuaDanhGiaGPVT(ketQuaDanhGiaGPVT);
	}

	/**
	* Returns the ly do khong dat of this qlvt xu ly k t t quoc te.
	*
	* @return the ly do khong dat of this qlvt xu ly k t t quoc te
	*/
	@Override
	public java.lang.String getLyDoKhongDat() {
		return _qlvtXuLyKTTQuocTe.getLyDoKhongDat();
	}

	/**
	* Sets the ly do khong dat of this qlvt xu ly k t t quoc te.
	*
	* @param lyDoKhongDat the ly do khong dat of this qlvt xu ly k t t quoc te
	*/
	@Override
	public void setLyDoKhongDat(java.lang.String lyDoKhongDat) {
		_qlvtXuLyKTTQuocTe.setLyDoKhongDat(lyDoKhongDat);
	}

	@Override
	public boolean isNew() {
		return _qlvtXuLyKTTQuocTe.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtXuLyKTTQuocTe.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtXuLyKTTQuocTe.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtXuLyKTTQuocTe.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtXuLyKTTQuocTe.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtXuLyKTTQuocTe.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtXuLyKTTQuocTe.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtXuLyKTTQuocTe.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtXuLyKTTQuocTe.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtXuLyKTTQuocTe.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtXuLyKTTQuocTe.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtXuLyKTTQuocTeWrapper((QlvtXuLyKTTQuocTe)_qlvtXuLyKTTQuocTe.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTe qlvtXuLyKTTQuocTe) {
		return _qlvtXuLyKTTQuocTe.compareTo(qlvtXuLyKTTQuocTe);
	}

	@Override
	public int hashCode() {
		return _qlvtXuLyKTTQuocTe.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTe> toCacheModel() {
		return _qlvtXuLyKTTQuocTe.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTe toEscapedModel() {
		return new QlvtXuLyKTTQuocTeWrapper(_qlvtXuLyKTTQuocTe.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTe toUnescapedModel() {
		return new QlvtXuLyKTTQuocTeWrapper(_qlvtXuLyKTTQuocTe.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtXuLyKTTQuocTe.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtXuLyKTTQuocTe.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtXuLyKTTQuocTe.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtXuLyKTTQuocTeWrapper)) {
			return false;
		}

		QlvtXuLyKTTQuocTeWrapper qlvtXuLyKTTQuocTeWrapper = (QlvtXuLyKTTQuocTeWrapper)obj;

		if (Validator.equals(_qlvtXuLyKTTQuocTe,
					qlvtXuLyKTTQuocTeWrapper._qlvtXuLyKTTQuocTe)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtXuLyKTTQuocTe getWrappedQlvtXuLyKTTQuocTe() {
		return _qlvtXuLyKTTQuocTe;
	}

	@Override
	public QlvtXuLyKTTQuocTe getWrappedModel() {
		return _qlvtXuLyKTTQuocTe;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtXuLyKTTQuocTe.resetOriginalValues();
	}

	private QlvtXuLyKTTQuocTe _qlvtXuLyKTTQuocTe;
}