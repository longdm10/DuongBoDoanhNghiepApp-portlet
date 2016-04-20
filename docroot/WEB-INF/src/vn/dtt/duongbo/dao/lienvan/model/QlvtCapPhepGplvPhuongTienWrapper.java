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
 * This class is a wrapper for {@link QlvtCapPhepGplvPhuongTien}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtCapPhepGplvPhuongTien
 * @generated
 */
public class QlvtCapPhepGplvPhuongTienWrapper
	implements QlvtCapPhepGplvPhuongTien,
		ModelWrapper<QlvtCapPhepGplvPhuongTien> {
	public QlvtCapPhepGplvPhuongTienWrapper(
		QlvtCapPhepGplvPhuongTien qlvtCapPhepGplvPhuongTien) {
		_qlvtCapPhepGplvPhuongTien = qlvtCapPhepGplvPhuongTien;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtCapPhepGplvPhuongTien.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtCapPhepGplvPhuongTien.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("giayPhepLienVanId", getGiayPhepLienVanId());
		attributes.put("soPhuHieu", getSoPhuHieu());
		attributes.put("ngayCapPhep", getNgayCapPhep());
		attributes.put("ngayGiaHan", getNgayGiaHan());
		attributes.put("ngayHetHan", getNgayHetHan());
		attributes.put("cuaKhau", getCuaKhau());
		attributes.put("maCuaKhau", getMaCuaKhau());
		attributes.put("hinhThucHoatDong", getHinhThucHoatDong());
		attributes.put("thoiHanPhuHieu", getThoiHanPhuHieu());
		attributes.put("soHuu", getSoHuu());
		attributes.put("chuSoHuu", getChuSoHuu());
		attributes.put("thoiHanChoThue", getThoiHanChoThue());
		attributes.put("hopDongSauCung", getHopDongSauCung());
		attributes.put("mucPhi", getMucPhi());
		attributes.put("thongTinXuLyViPham", getThongTinXuLyViPham());
		attributes.put("trangThai", getTrangThai());
		attributes.put("fileId", getFileId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long giayPhepLienVanId = (Long)attributes.get("giayPhepLienVanId");

		if (giayPhepLienVanId != null) {
			setGiayPhepLienVanId(giayPhepLienVanId);
		}

		String soPhuHieu = (String)attributes.get("soPhuHieu");

		if (soPhuHieu != null) {
			setSoPhuHieu(soPhuHieu);
		}

		Date ngayCapPhep = (Date)attributes.get("ngayCapPhep");

		if (ngayCapPhep != null) {
			setNgayCapPhep(ngayCapPhep);
		}

		Date ngayGiaHan = (Date)attributes.get("ngayGiaHan");

		if (ngayGiaHan != null) {
			setNgayGiaHan(ngayGiaHan);
		}

		Date ngayHetHan = (Date)attributes.get("ngayHetHan");

		if (ngayHetHan != null) {
			setNgayHetHan(ngayHetHan);
		}

		String cuaKhau = (String)attributes.get("cuaKhau");

		if (cuaKhau != null) {
			setCuaKhau(cuaKhau);
		}

		String maCuaKhau = (String)attributes.get("maCuaKhau");

		if (maCuaKhau != null) {
			setMaCuaKhau(maCuaKhau);
		}

		String hinhThucHoatDong = (String)attributes.get("hinhThucHoatDong");

		if (hinhThucHoatDong != null) {
			setHinhThucHoatDong(hinhThucHoatDong);
		}

		Date thoiHanPhuHieu = (Date)attributes.get("thoiHanPhuHieu");

		if (thoiHanPhuHieu != null) {
			setThoiHanPhuHieu(thoiHanPhuHieu);
		}

		Integer soHuu = (Integer)attributes.get("soHuu");

		if (soHuu != null) {
			setSoHuu(soHuu);
		}

		String chuSoHuu = (String)attributes.get("chuSoHuu");

		if (chuSoHuu != null) {
			setChuSoHuu(chuSoHuu);
		}

		Date thoiHanChoThue = (Date)attributes.get("thoiHanChoThue");

		if (thoiHanChoThue != null) {
			setThoiHanChoThue(thoiHanChoThue);
		}

		Integer hopDongSauCung = (Integer)attributes.get("hopDongSauCung");

		if (hopDongSauCung != null) {
			setHopDongSauCung(hopDongSauCung);
		}

		String mucPhi = (String)attributes.get("mucPhi");

		if (mucPhi != null) {
			setMucPhi(mucPhi);
		}

		String thongTinXuLyViPham = (String)attributes.get("thongTinXuLyViPham");

		if (thongTinXuLyViPham != null) {
			setThongTinXuLyViPham(thongTinXuLyViPham);
		}

		String trangThai = (String)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}

		Long fileId = (Long)attributes.get("fileId");

		if (fileId != null) {
			setFileId(fileId);
		}
	}

	/**
	* Returns the primary key of this qlvt cap phep gplv phuong tien.
	*
	* @return the primary key of this qlvt cap phep gplv phuong tien
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtCapPhepGplvPhuongTien.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt cap phep gplv phuong tien.
	*
	* @param primaryKey the primary key of this qlvt cap phep gplv phuong tien
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtCapPhepGplvPhuongTien.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt cap phep gplv phuong tien.
	*
	* @return the ID of this qlvt cap phep gplv phuong tien
	*/
	@Override
	public long getId() {
		return _qlvtCapPhepGplvPhuongTien.getId();
	}

	/**
	* Sets the ID of this qlvt cap phep gplv phuong tien.
	*
	* @param id the ID of this qlvt cap phep gplv phuong tien
	*/
	@Override
	public void setId(long id) {
		_qlvtCapPhepGplvPhuongTien.setId(id);
	}

	/**
	* Returns the giay phep lien van ID of this qlvt cap phep gplv phuong tien.
	*
	* @return the giay phep lien van ID of this qlvt cap phep gplv phuong tien
	*/
	@Override
	public long getGiayPhepLienVanId() {
		return _qlvtCapPhepGplvPhuongTien.getGiayPhepLienVanId();
	}

	/**
	* Sets the giay phep lien van ID of this qlvt cap phep gplv phuong tien.
	*
	* @param giayPhepLienVanId the giay phep lien van ID of this qlvt cap phep gplv phuong tien
	*/
	@Override
	public void setGiayPhepLienVanId(long giayPhepLienVanId) {
		_qlvtCapPhepGplvPhuongTien.setGiayPhepLienVanId(giayPhepLienVanId);
	}

	/**
	* Returns the so phu hieu of this qlvt cap phep gplv phuong tien.
	*
	* @return the so phu hieu of this qlvt cap phep gplv phuong tien
	*/
	@Override
	public java.lang.String getSoPhuHieu() {
		return _qlvtCapPhepGplvPhuongTien.getSoPhuHieu();
	}

	/**
	* Sets the so phu hieu of this qlvt cap phep gplv phuong tien.
	*
	* @param soPhuHieu the so phu hieu of this qlvt cap phep gplv phuong tien
	*/
	@Override
	public void setSoPhuHieu(java.lang.String soPhuHieu) {
		_qlvtCapPhepGplvPhuongTien.setSoPhuHieu(soPhuHieu);
	}

	/**
	* Returns the ngay cap phep of this qlvt cap phep gplv phuong tien.
	*
	* @return the ngay cap phep of this qlvt cap phep gplv phuong tien
	*/
	@Override
	public java.util.Date getNgayCapPhep() {
		return _qlvtCapPhepGplvPhuongTien.getNgayCapPhep();
	}

	/**
	* Sets the ngay cap phep of this qlvt cap phep gplv phuong tien.
	*
	* @param ngayCapPhep the ngay cap phep of this qlvt cap phep gplv phuong tien
	*/
	@Override
	public void setNgayCapPhep(java.util.Date ngayCapPhep) {
		_qlvtCapPhepGplvPhuongTien.setNgayCapPhep(ngayCapPhep);
	}

	/**
	* Returns the ngay gia han of this qlvt cap phep gplv phuong tien.
	*
	* @return the ngay gia han of this qlvt cap phep gplv phuong tien
	*/
	@Override
	public java.util.Date getNgayGiaHan() {
		return _qlvtCapPhepGplvPhuongTien.getNgayGiaHan();
	}

	/**
	* Sets the ngay gia han of this qlvt cap phep gplv phuong tien.
	*
	* @param ngayGiaHan the ngay gia han of this qlvt cap phep gplv phuong tien
	*/
	@Override
	public void setNgayGiaHan(java.util.Date ngayGiaHan) {
		_qlvtCapPhepGplvPhuongTien.setNgayGiaHan(ngayGiaHan);
	}

	/**
	* Returns the ngay het han of this qlvt cap phep gplv phuong tien.
	*
	* @return the ngay het han of this qlvt cap phep gplv phuong tien
	*/
	@Override
	public java.util.Date getNgayHetHan() {
		return _qlvtCapPhepGplvPhuongTien.getNgayHetHan();
	}

	/**
	* Sets the ngay het han of this qlvt cap phep gplv phuong tien.
	*
	* @param ngayHetHan the ngay het han of this qlvt cap phep gplv phuong tien
	*/
	@Override
	public void setNgayHetHan(java.util.Date ngayHetHan) {
		_qlvtCapPhepGplvPhuongTien.setNgayHetHan(ngayHetHan);
	}

	/**
	* Returns the cua khau of this qlvt cap phep gplv phuong tien.
	*
	* @return the cua khau of this qlvt cap phep gplv phuong tien
	*/
	@Override
	public java.lang.String getCuaKhau() {
		return _qlvtCapPhepGplvPhuongTien.getCuaKhau();
	}

	/**
	* Sets the cua khau of this qlvt cap phep gplv phuong tien.
	*
	* @param cuaKhau the cua khau of this qlvt cap phep gplv phuong tien
	*/
	@Override
	public void setCuaKhau(java.lang.String cuaKhau) {
		_qlvtCapPhepGplvPhuongTien.setCuaKhau(cuaKhau);
	}

	/**
	* Returns the ma cua khau of this qlvt cap phep gplv phuong tien.
	*
	* @return the ma cua khau of this qlvt cap phep gplv phuong tien
	*/
	@Override
	public java.lang.String getMaCuaKhau() {
		return _qlvtCapPhepGplvPhuongTien.getMaCuaKhau();
	}

	/**
	* Sets the ma cua khau of this qlvt cap phep gplv phuong tien.
	*
	* @param maCuaKhau the ma cua khau of this qlvt cap phep gplv phuong tien
	*/
	@Override
	public void setMaCuaKhau(java.lang.String maCuaKhau) {
		_qlvtCapPhepGplvPhuongTien.setMaCuaKhau(maCuaKhau);
	}

	/**
	* Returns the hinh thuc hoat dong of this qlvt cap phep gplv phuong tien.
	*
	* @return the hinh thuc hoat dong of this qlvt cap phep gplv phuong tien
	*/
	@Override
	public java.lang.String getHinhThucHoatDong() {
		return _qlvtCapPhepGplvPhuongTien.getHinhThucHoatDong();
	}

	/**
	* Sets the hinh thuc hoat dong of this qlvt cap phep gplv phuong tien.
	*
	* @param hinhThucHoatDong the hinh thuc hoat dong of this qlvt cap phep gplv phuong tien
	*/
	@Override
	public void setHinhThucHoatDong(java.lang.String hinhThucHoatDong) {
		_qlvtCapPhepGplvPhuongTien.setHinhThucHoatDong(hinhThucHoatDong);
	}

	/**
	* Returns the thoi han phu hieu of this qlvt cap phep gplv phuong tien.
	*
	* @return the thoi han phu hieu of this qlvt cap phep gplv phuong tien
	*/
	@Override
	public java.util.Date getThoiHanPhuHieu() {
		return _qlvtCapPhepGplvPhuongTien.getThoiHanPhuHieu();
	}

	/**
	* Sets the thoi han phu hieu of this qlvt cap phep gplv phuong tien.
	*
	* @param thoiHanPhuHieu the thoi han phu hieu of this qlvt cap phep gplv phuong tien
	*/
	@Override
	public void setThoiHanPhuHieu(java.util.Date thoiHanPhuHieu) {
		_qlvtCapPhepGplvPhuongTien.setThoiHanPhuHieu(thoiHanPhuHieu);
	}

	/**
	* Returns the so huu of this qlvt cap phep gplv phuong tien.
	*
	* @return the so huu of this qlvt cap phep gplv phuong tien
	*/
	@Override
	public int getSoHuu() {
		return _qlvtCapPhepGplvPhuongTien.getSoHuu();
	}

	/**
	* Sets the so huu of this qlvt cap phep gplv phuong tien.
	*
	* @param soHuu the so huu of this qlvt cap phep gplv phuong tien
	*/
	@Override
	public void setSoHuu(int soHuu) {
		_qlvtCapPhepGplvPhuongTien.setSoHuu(soHuu);
	}

	/**
	* Returns the chu so huu of this qlvt cap phep gplv phuong tien.
	*
	* @return the chu so huu of this qlvt cap phep gplv phuong tien
	*/
	@Override
	public java.lang.String getChuSoHuu() {
		return _qlvtCapPhepGplvPhuongTien.getChuSoHuu();
	}

	/**
	* Sets the chu so huu of this qlvt cap phep gplv phuong tien.
	*
	* @param chuSoHuu the chu so huu of this qlvt cap phep gplv phuong tien
	*/
	@Override
	public void setChuSoHuu(java.lang.String chuSoHuu) {
		_qlvtCapPhepGplvPhuongTien.setChuSoHuu(chuSoHuu);
	}

	/**
	* Returns the thoi han cho thue of this qlvt cap phep gplv phuong tien.
	*
	* @return the thoi han cho thue of this qlvt cap phep gplv phuong tien
	*/
	@Override
	public java.util.Date getThoiHanChoThue() {
		return _qlvtCapPhepGplvPhuongTien.getThoiHanChoThue();
	}

	/**
	* Sets the thoi han cho thue of this qlvt cap phep gplv phuong tien.
	*
	* @param thoiHanChoThue the thoi han cho thue of this qlvt cap phep gplv phuong tien
	*/
	@Override
	public void setThoiHanChoThue(java.util.Date thoiHanChoThue) {
		_qlvtCapPhepGplvPhuongTien.setThoiHanChoThue(thoiHanChoThue);
	}

	/**
	* Returns the hop dong sau cung of this qlvt cap phep gplv phuong tien.
	*
	* @return the hop dong sau cung of this qlvt cap phep gplv phuong tien
	*/
	@Override
	public int getHopDongSauCung() {
		return _qlvtCapPhepGplvPhuongTien.getHopDongSauCung();
	}

	/**
	* Sets the hop dong sau cung of this qlvt cap phep gplv phuong tien.
	*
	* @param hopDongSauCung the hop dong sau cung of this qlvt cap phep gplv phuong tien
	*/
	@Override
	public void setHopDongSauCung(int hopDongSauCung) {
		_qlvtCapPhepGplvPhuongTien.setHopDongSauCung(hopDongSauCung);
	}

	/**
	* Returns the muc phi of this qlvt cap phep gplv phuong tien.
	*
	* @return the muc phi of this qlvt cap phep gplv phuong tien
	*/
	@Override
	public java.lang.String getMucPhi() {
		return _qlvtCapPhepGplvPhuongTien.getMucPhi();
	}

	/**
	* Sets the muc phi of this qlvt cap phep gplv phuong tien.
	*
	* @param mucPhi the muc phi of this qlvt cap phep gplv phuong tien
	*/
	@Override
	public void setMucPhi(java.lang.String mucPhi) {
		_qlvtCapPhepGplvPhuongTien.setMucPhi(mucPhi);
	}

	/**
	* Returns the thong tin xu ly vi pham of this qlvt cap phep gplv phuong tien.
	*
	* @return the thong tin xu ly vi pham of this qlvt cap phep gplv phuong tien
	*/
	@Override
	public java.lang.String getThongTinXuLyViPham() {
		return _qlvtCapPhepGplvPhuongTien.getThongTinXuLyViPham();
	}

	/**
	* Sets the thong tin xu ly vi pham of this qlvt cap phep gplv phuong tien.
	*
	* @param thongTinXuLyViPham the thong tin xu ly vi pham of this qlvt cap phep gplv phuong tien
	*/
	@Override
	public void setThongTinXuLyViPham(java.lang.String thongTinXuLyViPham) {
		_qlvtCapPhepGplvPhuongTien.setThongTinXuLyViPham(thongTinXuLyViPham);
	}

	/**
	* Returns the trang thai of this qlvt cap phep gplv phuong tien.
	*
	* @return the trang thai of this qlvt cap phep gplv phuong tien
	*/
	@Override
	public java.lang.String getTrangThai() {
		return _qlvtCapPhepGplvPhuongTien.getTrangThai();
	}

	/**
	* Sets the trang thai of this qlvt cap phep gplv phuong tien.
	*
	* @param trangThai the trang thai of this qlvt cap phep gplv phuong tien
	*/
	@Override
	public void setTrangThai(java.lang.String trangThai) {
		_qlvtCapPhepGplvPhuongTien.setTrangThai(trangThai);
	}

	/**
	* Returns the file ID of this qlvt cap phep gplv phuong tien.
	*
	* @return the file ID of this qlvt cap phep gplv phuong tien
	*/
	@Override
	public long getFileId() {
		return _qlvtCapPhepGplvPhuongTien.getFileId();
	}

	/**
	* Sets the file ID of this qlvt cap phep gplv phuong tien.
	*
	* @param fileId the file ID of this qlvt cap phep gplv phuong tien
	*/
	@Override
	public void setFileId(long fileId) {
		_qlvtCapPhepGplvPhuongTien.setFileId(fileId);
	}

	@Override
	public boolean isNew() {
		return _qlvtCapPhepGplvPhuongTien.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtCapPhepGplvPhuongTien.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtCapPhepGplvPhuongTien.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtCapPhepGplvPhuongTien.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtCapPhepGplvPhuongTien.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtCapPhepGplvPhuongTien.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtCapPhepGplvPhuongTien.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtCapPhepGplvPhuongTien.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtCapPhepGplvPhuongTien.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtCapPhepGplvPhuongTien.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtCapPhepGplvPhuongTien.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtCapPhepGplvPhuongTienWrapper((QlvtCapPhepGplvPhuongTien)_qlvtCapPhepGplvPhuongTien.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvPhuongTien qlvtCapPhepGplvPhuongTien) {
		return _qlvtCapPhepGplvPhuongTien.compareTo(qlvtCapPhepGplvPhuongTien);
	}

	@Override
	public int hashCode() {
		return _qlvtCapPhepGplvPhuongTien.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvPhuongTien> toCacheModel() {
		return _qlvtCapPhepGplvPhuongTien.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvPhuongTien toEscapedModel() {
		return new QlvtCapPhepGplvPhuongTienWrapper(_qlvtCapPhepGplvPhuongTien.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvPhuongTien toUnescapedModel() {
		return new QlvtCapPhepGplvPhuongTienWrapper(_qlvtCapPhepGplvPhuongTien.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtCapPhepGplvPhuongTien.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtCapPhepGplvPhuongTien.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtCapPhepGplvPhuongTien.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtCapPhepGplvPhuongTienWrapper)) {
			return false;
		}

		QlvtCapPhepGplvPhuongTienWrapper qlvtCapPhepGplvPhuongTienWrapper = (QlvtCapPhepGplvPhuongTienWrapper)obj;

		if (Validator.equals(_qlvtCapPhepGplvPhuongTien,
					qlvtCapPhepGplvPhuongTienWrapper._qlvtCapPhepGplvPhuongTien)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtCapPhepGplvPhuongTien getWrappedQlvtCapPhepGplvPhuongTien() {
		return _qlvtCapPhepGplvPhuongTien;
	}

	@Override
	public QlvtCapPhepGplvPhuongTien getWrappedModel() {
		return _qlvtCapPhepGplvPhuongTien;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtCapPhepGplvPhuongTien.resetOriginalValues();
	}

	private QlvtCapPhepGplvPhuongTien _qlvtCapPhepGplvPhuongTien;
}