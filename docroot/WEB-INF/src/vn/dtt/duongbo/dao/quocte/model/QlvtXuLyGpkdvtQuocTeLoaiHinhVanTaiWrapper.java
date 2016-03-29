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
 * This class is a wrapper for {@link QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai}.
 * </p>
 *
 * @author NoiPham
 * @see QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai
 * @generated
 */
public class QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiWrapper
	implements QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai,
		ModelWrapper<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai> {
	public QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiWrapper(
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai) {
		_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai = qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("thongTinCapGpkdVanTaiId", getThongTinCapGpkdVanTaiId());
		attributes.put("maLoaiHinhHoatDong", getMaLoaiHinhHoatDong());
		attributes.put("soLuongPhuongTien", getSoLuongPhuongTien());
		attributes.put("thietBiGiamSatHanhTrinh", getThietBiGiamSatHanhTrinh());
		attributes.put("phamViHoatDong", getPhamViHoatDong());
		attributes.put("soChuyen", getSoChuyen());
		attributes.put("mauSon", getMauSon());
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

		Integer thongTinCapGpkdVanTaiId = (Integer)attributes.get(
				"thongTinCapGpkdVanTaiId");

		if (thongTinCapGpkdVanTaiId != null) {
			setThongTinCapGpkdVanTaiId(thongTinCapGpkdVanTaiId);
		}

		String maLoaiHinhHoatDong = (String)attributes.get("maLoaiHinhHoatDong");

		if (maLoaiHinhHoatDong != null) {
			setMaLoaiHinhHoatDong(maLoaiHinhHoatDong);
		}

		Integer soLuongPhuongTien = (Integer)attributes.get("soLuongPhuongTien");

		if (soLuongPhuongTien != null) {
			setSoLuongPhuongTien(soLuongPhuongTien);
		}

		Long thietBiGiamSatHanhTrinh = (Long)attributes.get(
				"thietBiGiamSatHanhTrinh");

		if (thietBiGiamSatHanhTrinh != null) {
			setThietBiGiamSatHanhTrinh(thietBiGiamSatHanhTrinh);
		}

		String phamViHoatDong = (String)attributes.get("phamViHoatDong");

		if (phamViHoatDong != null) {
			setPhamViHoatDong(phamViHoatDong);
		}

		Integer soChuyen = (Integer)attributes.get("soChuyen");

		if (soChuyen != null) {
			setSoChuyen(soChuyen);
		}

		String mauSon = (String)attributes.get("mauSon");

		if (mauSon != null) {
			setMauSon(mauSon);
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
	* Returns the primary key of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	*
	* @return the primary key of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	*
	* @param primaryKey the primary key of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	*
	* @return the ID of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	*/
	@Override
	public long getId() {
		return _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.getId();
	}

	/**
	* Sets the ID of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	*
	* @param id the ID of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	*/
	@Override
	public void setId(long id) {
		_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.setId(id);
	}

	/**
	* Returns the thong tin cap gpkd van tai ID of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	*
	* @return the thong tin cap gpkd van tai ID of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	*/
	@Override
	public int getThongTinCapGpkdVanTaiId() {
		return _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.getThongTinCapGpkdVanTaiId();
	}

	/**
	* Sets the thong tin cap gpkd van tai ID of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	*
	* @param thongTinCapGpkdVanTaiId the thong tin cap gpkd van tai ID of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	*/
	@Override
	public void setThongTinCapGpkdVanTaiId(int thongTinCapGpkdVanTaiId) {
		_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.setThongTinCapGpkdVanTaiId(thongTinCapGpkdVanTaiId);
	}

	/**
	* Returns the ma loai hinh hoat dong of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	*
	* @return the ma loai hinh hoat dong of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	*/
	@Override
	public java.lang.String getMaLoaiHinhHoatDong() {
		return _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.getMaLoaiHinhHoatDong();
	}

	/**
	* Sets the ma loai hinh hoat dong of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	*
	* @param maLoaiHinhHoatDong the ma loai hinh hoat dong of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	*/
	@Override
	public void setMaLoaiHinhHoatDong(java.lang.String maLoaiHinhHoatDong) {
		_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.setMaLoaiHinhHoatDong(maLoaiHinhHoatDong);
	}

	/**
	* Returns the so luong phuong tien of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	*
	* @return the so luong phuong tien of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	*/
	@Override
	public int getSoLuongPhuongTien() {
		return _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.getSoLuongPhuongTien();
	}

	/**
	* Sets the so luong phuong tien of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	*
	* @param soLuongPhuongTien the so luong phuong tien of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	*/
	@Override
	public void setSoLuongPhuongTien(int soLuongPhuongTien) {
		_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.setSoLuongPhuongTien(soLuongPhuongTien);
	}

	/**
	* Returns the thiet bi giam sat hanh trinh of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	*
	* @return the thiet bi giam sat hanh trinh of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	*/
	@Override
	public long getThietBiGiamSatHanhTrinh() {
		return _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.getThietBiGiamSatHanhTrinh();
	}

	/**
	* Sets the thiet bi giam sat hanh trinh of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	*
	* @param thietBiGiamSatHanhTrinh the thiet bi giam sat hanh trinh of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	*/
	@Override
	public void setThietBiGiamSatHanhTrinh(long thietBiGiamSatHanhTrinh) {
		_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.setThietBiGiamSatHanhTrinh(thietBiGiamSatHanhTrinh);
	}

	/**
	* Returns the pham vi hoat dong of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	*
	* @return the pham vi hoat dong of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	*/
	@Override
	public java.lang.String getPhamViHoatDong() {
		return _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.getPhamViHoatDong();
	}

	/**
	* Sets the pham vi hoat dong of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	*
	* @param phamViHoatDong the pham vi hoat dong of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	*/
	@Override
	public void setPhamViHoatDong(java.lang.String phamViHoatDong) {
		_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.setPhamViHoatDong(phamViHoatDong);
	}

	/**
	* Returns the so chuyen of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	*
	* @return the so chuyen of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	*/
	@Override
	public int getSoChuyen() {
		return _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.getSoChuyen();
	}

	/**
	* Sets the so chuyen of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	*
	* @param soChuyen the so chuyen of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	*/
	@Override
	public void setSoChuyen(int soChuyen) {
		_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.setSoChuyen(soChuyen);
	}

	/**
	* Returns the mau son of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	*
	* @return the mau son of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	*/
	@Override
	public java.lang.String getMauSon() {
		return _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.getMauSon();
	}

	/**
	* Sets the mau son of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	*
	* @param mauSon the mau son of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	*/
	@Override
	public void setMauSon(java.lang.String mauSon) {
		_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.setMauSon(mauSon);
	}

	/**
	* Returns the ket qua xu ly of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	*
	* @return the ket qua xu ly of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	*/
	@Override
	public java.lang.String getKetQuaXuLy() {
		return _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.getKetQuaXuLy();
	}

	/**
	* Sets the ket qua xu ly of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	*
	* @param ketQuaXuLy the ket qua xu ly of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	*/
	@Override
	public void setKetQuaXuLy(java.lang.String ketQuaXuLy) {
		_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.setKetQuaXuLy(ketQuaXuLy);
	}

	/**
	* Returns the ly do khong dat of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	*
	* @return the ly do khong dat of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	*/
	@Override
	public java.lang.String getLyDoKhongDat() {
		return _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.getLyDoKhongDat();
	}

	/**
	* Sets the ly do khong dat of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	*
	* @param lyDoKhongDat the ly do khong dat of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	*/
	@Override
	public void setLyDoKhongDat(java.lang.String lyDoKhongDat) {
		_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.setLyDoKhongDat(lyDoKhongDat);
	}

	@Override
	public boolean isNew() {
		return _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiWrapper((QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai)_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai) {
		return _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.compareTo(qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai);
	}

	@Override
	public int hashCode() {
		return _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai> toCacheModel() {
		return _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai toEscapedModel() {
		return new QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiWrapper(_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai toUnescapedModel() {
		return new QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiWrapper(_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiWrapper)) {
			return false;
		}

		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiWrapper qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiWrapper =
			(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiWrapper)obj;

		if (Validator.equals(_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai,
					qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiWrapper._qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai getWrappedQlvtXuLyGpkdvtQuocTeLoaiHinhVanTai() {
		return _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai;
	}

	@Override
	public QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai getWrappedModel() {
		return _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.resetOriginalValues();
	}

	private QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai _qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai;
}