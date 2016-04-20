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

package vn.dtt.duongbo.dao.noidia.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai}.
 * </p>
 *
 * @author NoiPham
 * @see QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai
 * @generated
 */
public class QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiWrapper
	implements QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai,
		ModelWrapper<QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai> {
	public QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiWrapper(
		QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai) {
		_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai = qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("gpkdvtBangOtoId", getGpkdvtBangOtoId());
		attributes.put("maLoaiHinhHoatDong", getMaLoaiHinhHoatDong());
		attributes.put("loaiHinhKinhDoanhCuThe", getLoaiHinhKinhDoanhCuThe());
		attributes.put("soLuongPhuongTien", getSoLuongPhuongTien());
		attributes.put("thietBiGiamSatHanhTrinh", getThietBiGiamSatHanhTrinh());
		attributes.put("phamViHoatDong", getPhamViHoatDong());
		attributes.put("tuyenTu", getTuyenTu());
		attributes.put("tuyenDen", getTuyenDen());
		attributes.put("soChuyen", getSoChuyen());
		attributes.put("mauSon", getMauSon());
		attributes.put("ketQuaXuLy", getKetQuaXuLy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer gpkdvtBangOtoId = (Integer)attributes.get("gpkdvtBangOtoId");

		if (gpkdvtBangOtoId != null) {
			setGpkdvtBangOtoId(gpkdvtBangOtoId);
		}

		String maLoaiHinhHoatDong = (String)attributes.get("maLoaiHinhHoatDong");

		if (maLoaiHinhHoatDong != null) {
			setMaLoaiHinhHoatDong(maLoaiHinhHoatDong);
		}

		String loaiHinhKinhDoanhCuThe = (String)attributes.get(
				"loaiHinhKinhDoanhCuThe");

		if (loaiHinhKinhDoanhCuThe != null) {
			setLoaiHinhKinhDoanhCuThe(loaiHinhKinhDoanhCuThe);
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

		String tuyenTu = (String)attributes.get("tuyenTu");

		if (tuyenTu != null) {
			setTuyenTu(tuyenTu);
		}

		String tuyenDen = (String)attributes.get("tuyenDen");

		if (tuyenDen != null) {
			setTuyenDen(tuyenDen);
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
	}

	/**
	* Returns the primary key of this qlvt xu ly gpkdvt bang oto loai hinh van tai.
	*
	* @return the primary key of this qlvt xu ly gpkdvt bang oto loai hinh van tai
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt xu ly gpkdvt bang oto loai hinh van tai.
	*
	* @param primaryKey the primary key of this qlvt xu ly gpkdvt bang oto loai hinh van tai
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt xu ly gpkdvt bang oto loai hinh van tai.
	*
	* @return the ID of this qlvt xu ly gpkdvt bang oto loai hinh van tai
	*/
	@Override
	public long getId() {
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.getId();
	}

	/**
	* Sets the ID of this qlvt xu ly gpkdvt bang oto loai hinh van tai.
	*
	* @param id the ID of this qlvt xu ly gpkdvt bang oto loai hinh van tai
	*/
	@Override
	public void setId(long id) {
		_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.setId(id);
	}

	/**
	* Returns the gpkdvt bang oto ID of this qlvt xu ly gpkdvt bang oto loai hinh van tai.
	*
	* @return the gpkdvt bang oto ID of this qlvt xu ly gpkdvt bang oto loai hinh van tai
	*/
	@Override
	public int getGpkdvtBangOtoId() {
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.getGpkdvtBangOtoId();
	}

	/**
	* Sets the gpkdvt bang oto ID of this qlvt xu ly gpkdvt bang oto loai hinh van tai.
	*
	* @param gpkdvtBangOtoId the gpkdvt bang oto ID of this qlvt xu ly gpkdvt bang oto loai hinh van tai
	*/
	@Override
	public void setGpkdvtBangOtoId(int gpkdvtBangOtoId) {
		_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.setGpkdvtBangOtoId(gpkdvtBangOtoId);
	}

	/**
	* Returns the ma loai hinh hoat dong of this qlvt xu ly gpkdvt bang oto loai hinh van tai.
	*
	* @return the ma loai hinh hoat dong of this qlvt xu ly gpkdvt bang oto loai hinh van tai
	*/
	@Override
	public java.lang.String getMaLoaiHinhHoatDong() {
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.getMaLoaiHinhHoatDong();
	}

	/**
	* Sets the ma loai hinh hoat dong of this qlvt xu ly gpkdvt bang oto loai hinh van tai.
	*
	* @param maLoaiHinhHoatDong the ma loai hinh hoat dong of this qlvt xu ly gpkdvt bang oto loai hinh van tai
	*/
	@Override
	public void setMaLoaiHinhHoatDong(java.lang.String maLoaiHinhHoatDong) {
		_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.setMaLoaiHinhHoatDong(maLoaiHinhHoatDong);
	}

	/**
	* Returns the loai hinh kinh doanh cu the of this qlvt xu ly gpkdvt bang oto loai hinh van tai.
	*
	* @return the loai hinh kinh doanh cu the of this qlvt xu ly gpkdvt bang oto loai hinh van tai
	*/
	@Override
	public java.lang.String getLoaiHinhKinhDoanhCuThe() {
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.getLoaiHinhKinhDoanhCuThe();
	}

	/**
	* Sets the loai hinh kinh doanh cu the of this qlvt xu ly gpkdvt bang oto loai hinh van tai.
	*
	* @param loaiHinhKinhDoanhCuThe the loai hinh kinh doanh cu the of this qlvt xu ly gpkdvt bang oto loai hinh van tai
	*/
	@Override
	public void setLoaiHinhKinhDoanhCuThe(
		java.lang.String loaiHinhKinhDoanhCuThe) {
		_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.setLoaiHinhKinhDoanhCuThe(loaiHinhKinhDoanhCuThe);
	}

	/**
	* Returns the so luong phuong tien of this qlvt xu ly gpkdvt bang oto loai hinh van tai.
	*
	* @return the so luong phuong tien of this qlvt xu ly gpkdvt bang oto loai hinh van tai
	*/
	@Override
	public int getSoLuongPhuongTien() {
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.getSoLuongPhuongTien();
	}

	/**
	* Sets the so luong phuong tien of this qlvt xu ly gpkdvt bang oto loai hinh van tai.
	*
	* @param soLuongPhuongTien the so luong phuong tien of this qlvt xu ly gpkdvt bang oto loai hinh van tai
	*/
	@Override
	public void setSoLuongPhuongTien(int soLuongPhuongTien) {
		_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.setSoLuongPhuongTien(soLuongPhuongTien);
	}

	/**
	* Returns the thiet bi giam sat hanh trinh of this qlvt xu ly gpkdvt bang oto loai hinh van tai.
	*
	* @return the thiet bi giam sat hanh trinh of this qlvt xu ly gpkdvt bang oto loai hinh van tai
	*/
	@Override
	public long getThietBiGiamSatHanhTrinh() {
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.getThietBiGiamSatHanhTrinh();
	}

	/**
	* Sets the thiet bi giam sat hanh trinh of this qlvt xu ly gpkdvt bang oto loai hinh van tai.
	*
	* @param thietBiGiamSatHanhTrinh the thiet bi giam sat hanh trinh of this qlvt xu ly gpkdvt bang oto loai hinh van tai
	*/
	@Override
	public void setThietBiGiamSatHanhTrinh(long thietBiGiamSatHanhTrinh) {
		_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.setThietBiGiamSatHanhTrinh(thietBiGiamSatHanhTrinh);
	}

	/**
	* Returns the pham vi hoat dong of this qlvt xu ly gpkdvt bang oto loai hinh van tai.
	*
	* @return the pham vi hoat dong of this qlvt xu ly gpkdvt bang oto loai hinh van tai
	*/
	@Override
	public java.lang.String getPhamViHoatDong() {
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.getPhamViHoatDong();
	}

	/**
	* Sets the pham vi hoat dong of this qlvt xu ly gpkdvt bang oto loai hinh van tai.
	*
	* @param phamViHoatDong the pham vi hoat dong of this qlvt xu ly gpkdvt bang oto loai hinh van tai
	*/
	@Override
	public void setPhamViHoatDong(java.lang.String phamViHoatDong) {
		_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.setPhamViHoatDong(phamViHoatDong);
	}

	/**
	* Returns the tuyen tu of this qlvt xu ly gpkdvt bang oto loai hinh van tai.
	*
	* @return the tuyen tu of this qlvt xu ly gpkdvt bang oto loai hinh van tai
	*/
	@Override
	public java.lang.String getTuyenTu() {
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.getTuyenTu();
	}

	/**
	* Sets the tuyen tu of this qlvt xu ly gpkdvt bang oto loai hinh van tai.
	*
	* @param tuyenTu the tuyen tu of this qlvt xu ly gpkdvt bang oto loai hinh van tai
	*/
	@Override
	public void setTuyenTu(java.lang.String tuyenTu) {
		_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.setTuyenTu(tuyenTu);
	}

	/**
	* Returns the tuyen den of this qlvt xu ly gpkdvt bang oto loai hinh van tai.
	*
	* @return the tuyen den of this qlvt xu ly gpkdvt bang oto loai hinh van tai
	*/
	@Override
	public java.lang.String getTuyenDen() {
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.getTuyenDen();
	}

	/**
	* Sets the tuyen den of this qlvt xu ly gpkdvt bang oto loai hinh van tai.
	*
	* @param tuyenDen the tuyen den of this qlvt xu ly gpkdvt bang oto loai hinh van tai
	*/
	@Override
	public void setTuyenDen(java.lang.String tuyenDen) {
		_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.setTuyenDen(tuyenDen);
	}

	/**
	* Returns the so chuyen of this qlvt xu ly gpkdvt bang oto loai hinh van tai.
	*
	* @return the so chuyen of this qlvt xu ly gpkdvt bang oto loai hinh van tai
	*/
	@Override
	public int getSoChuyen() {
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.getSoChuyen();
	}

	/**
	* Sets the so chuyen of this qlvt xu ly gpkdvt bang oto loai hinh van tai.
	*
	* @param soChuyen the so chuyen of this qlvt xu ly gpkdvt bang oto loai hinh van tai
	*/
	@Override
	public void setSoChuyen(int soChuyen) {
		_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.setSoChuyen(soChuyen);
	}

	/**
	* Returns the mau son of this qlvt xu ly gpkdvt bang oto loai hinh van tai.
	*
	* @return the mau son of this qlvt xu ly gpkdvt bang oto loai hinh van tai
	*/
	@Override
	public java.lang.String getMauSon() {
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.getMauSon();
	}

	/**
	* Sets the mau son of this qlvt xu ly gpkdvt bang oto loai hinh van tai.
	*
	* @param mauSon the mau son of this qlvt xu ly gpkdvt bang oto loai hinh van tai
	*/
	@Override
	public void setMauSon(java.lang.String mauSon) {
		_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.setMauSon(mauSon);
	}

	/**
	* Returns the ket qua xu ly of this qlvt xu ly gpkdvt bang oto loai hinh van tai.
	*
	* @return the ket qua xu ly of this qlvt xu ly gpkdvt bang oto loai hinh van tai
	*/
	@Override
	public java.lang.String getKetQuaXuLy() {
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.getKetQuaXuLy();
	}

	/**
	* Sets the ket qua xu ly of this qlvt xu ly gpkdvt bang oto loai hinh van tai.
	*
	* @param ketQuaXuLy the ket qua xu ly of this qlvt xu ly gpkdvt bang oto loai hinh van tai
	*/
	@Override
	public void setKetQuaXuLy(java.lang.String ketQuaXuLy) {
		_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.setKetQuaXuLy(ketQuaXuLy);
	}

	@Override
	public boolean isNew() {
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiWrapper((QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai)_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai) {
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.compareTo(qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai);
	}

	@Override
	public int hashCode() {
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai> toCacheModel() {
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai toEscapedModel() {
		return new QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiWrapper(_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai toUnescapedModel() {
		return new QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiWrapper(_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiWrapper)) {
			return false;
		}

		QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiWrapper qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiWrapper =
			(QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiWrapper)obj;

		if (Validator.equals(_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai,
					qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiWrapper._qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai getWrappedQlvtXuLyGpkdvtBangOtoLoaiHinhVanTai() {
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai;
	}

	@Override
	public QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai getWrappedModel() {
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.resetOriginalValues();
	}

	private QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai;
}