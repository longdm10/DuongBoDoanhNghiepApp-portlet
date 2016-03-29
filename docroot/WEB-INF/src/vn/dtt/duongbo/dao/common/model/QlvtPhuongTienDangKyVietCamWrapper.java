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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link QlvtPhuongTienDangKyVietCam}.
 * </p>
 *
 * @author win_64
 * @see QlvtPhuongTienDangKyVietCam
 * @generated
 */
public class QlvtPhuongTienDangKyVietCamWrapper
	implements QlvtPhuongTienDangKyVietCam,
		ModelWrapper<QlvtPhuongTienDangKyVietCam> {
	public QlvtPhuongTienDangKyVietCamWrapper(
		QlvtPhuongTienDangKyVietCam qlvtPhuongTienDangKyVietCam) {
		_qlvtPhuongTienDangKyVietCam = qlvtPhuongTienDangKyVietCam;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtPhuongTienDangKyVietCam.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtPhuongTienDangKyVietCam.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("BienSo", getBienSo());
		attributes.put("TenDangKySoHuu", getTenDangKySoHuu());
		attributes.put("NhanHieu", getNhanHieu());
		attributes.put("TrongTai", getTrongTai());
		attributes.put("NamSanXuat", getNamSanXuat());
		attributes.put("CuaKhauXuatNhap", getCuaKhauXuatNhap());
		attributes.put("HinhThucHoatDong", getHinhThucHoatDong());
		attributes.put("LoaiHinhHoatDong", getLoaiHinhHoatDong());
		attributes.put("TuyenHoatDong", getTuyenHoatDong());
		attributes.put("ThoiGianXinCapPhepTu", getThoiGianXinCapPhepTu());
		attributes.put("ThoiGianXinCapPhepDen", getThoiGianXinCapPhepDen());
		attributes.put("SoKhung", getSoKhung());
		attributes.put("MauSon", getMauSon());
		attributes.put("SoMay", getSoMay());
		attributes.put("LoaiHangVanChuyen", getLoaiHangVanChuyen());
		attributes.put("ThoiGianDuKienKhoiHanh", getThoiGianDuKienKhoiHanh());
		attributes.put("NoiDungHoSoId", getNoiDungHoSoId());
		attributes.put("HoSoThuTucId", getHoSoThuTucId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String BienSo = (String)attributes.get("BienSo");

		if (BienSo != null) {
			setBienSo(BienSo);
		}

		String TenDangKySoHuu = (String)attributes.get("TenDangKySoHuu");

		if (TenDangKySoHuu != null) {
			setTenDangKySoHuu(TenDangKySoHuu);
		}

		String NhanHieu = (String)attributes.get("NhanHieu");

		if (NhanHieu != null) {
			setNhanHieu(NhanHieu);
		}

		String TrongTai = (String)attributes.get("TrongTai");

		if (TrongTai != null) {
			setTrongTai(TrongTai);
		}

		String NamSanXuat = (String)attributes.get("NamSanXuat");

		if (NamSanXuat != null) {
			setNamSanXuat(NamSanXuat);
		}

		String CuaKhauXuatNhap = (String)attributes.get("CuaKhauXuatNhap");

		if (CuaKhauXuatNhap != null) {
			setCuaKhauXuatNhap(CuaKhauXuatNhap);
		}

		String HinhThucHoatDong = (String)attributes.get("HinhThucHoatDong");

		if (HinhThucHoatDong != null) {
			setHinhThucHoatDong(HinhThucHoatDong);
		}

		String LoaiHinhHoatDong = (String)attributes.get("LoaiHinhHoatDong");

		if (LoaiHinhHoatDong != null) {
			setLoaiHinhHoatDong(LoaiHinhHoatDong);
		}

		String TuyenHoatDong = (String)attributes.get("TuyenHoatDong");

		if (TuyenHoatDong != null) {
			setTuyenHoatDong(TuyenHoatDong);
		}

		Date ThoiGianXinCapPhepTu = (Date)attributes.get("ThoiGianXinCapPhepTu");

		if (ThoiGianXinCapPhepTu != null) {
			setThoiGianXinCapPhepTu(ThoiGianXinCapPhepTu);
		}

		Date ThoiGianXinCapPhepDen = (Date)attributes.get(
				"ThoiGianXinCapPhepDen");

		if (ThoiGianXinCapPhepDen != null) {
			setThoiGianXinCapPhepDen(ThoiGianXinCapPhepDen);
		}

		String SoKhung = (String)attributes.get("SoKhung");

		if (SoKhung != null) {
			setSoKhung(SoKhung);
		}

		String MauSon = (String)attributes.get("MauSon");

		if (MauSon != null) {
			setMauSon(MauSon);
		}

		String SoMay = (String)attributes.get("SoMay");

		if (SoMay != null) {
			setSoMay(SoMay);
		}

		String LoaiHangVanChuyen = (String)attributes.get("LoaiHangVanChuyen");

		if (LoaiHangVanChuyen != null) {
			setLoaiHangVanChuyen(LoaiHangVanChuyen);
		}

		Date ThoiGianDuKienKhoiHanh = (Date)attributes.get(
				"ThoiGianDuKienKhoiHanh");

		if (ThoiGianDuKienKhoiHanh != null) {
			setThoiGianDuKienKhoiHanh(ThoiGianDuKienKhoiHanh);
		}

		Long NoiDungHoSoId = (Long)attributes.get("NoiDungHoSoId");

		if (NoiDungHoSoId != null) {
			setNoiDungHoSoId(NoiDungHoSoId);
		}

		Long HoSoThuTucId = (Long)attributes.get("HoSoThuTucId");

		if (HoSoThuTucId != null) {
			setHoSoThuTucId(HoSoThuTucId);
		}
	}

	/**
	* Returns the primary key of this qlvt phuong tien dang ky viet cam.
	*
	* @return the primary key of this qlvt phuong tien dang ky viet cam
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtPhuongTienDangKyVietCam.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt phuong tien dang ky viet cam.
	*
	* @param primaryKey the primary key of this qlvt phuong tien dang ky viet cam
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtPhuongTienDangKyVietCam.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt phuong tien dang ky viet cam.
	*
	* @return the ID of this qlvt phuong tien dang ky viet cam
	*/
	@Override
	public long getId() {
		return _qlvtPhuongTienDangKyVietCam.getId();
	}

	/**
	* Sets the ID of this qlvt phuong tien dang ky viet cam.
	*
	* @param id the ID of this qlvt phuong tien dang ky viet cam
	*/
	@Override
	public void setId(long id) {
		_qlvtPhuongTienDangKyVietCam.setId(id);
	}

	/**
	* Returns the bien so of this qlvt phuong tien dang ky viet cam.
	*
	* @return the bien so of this qlvt phuong tien dang ky viet cam
	*/
	@Override
	public java.lang.String getBienSo() {
		return _qlvtPhuongTienDangKyVietCam.getBienSo();
	}

	/**
	* Sets the bien so of this qlvt phuong tien dang ky viet cam.
	*
	* @param BienSo the bien so of this qlvt phuong tien dang ky viet cam
	*/
	@Override
	public void setBienSo(java.lang.String BienSo) {
		_qlvtPhuongTienDangKyVietCam.setBienSo(BienSo);
	}

	/**
	* Returns the ten dang ky so huu of this qlvt phuong tien dang ky viet cam.
	*
	* @return the ten dang ky so huu of this qlvt phuong tien dang ky viet cam
	*/
	@Override
	public java.lang.String getTenDangKySoHuu() {
		return _qlvtPhuongTienDangKyVietCam.getTenDangKySoHuu();
	}

	/**
	* Sets the ten dang ky so huu of this qlvt phuong tien dang ky viet cam.
	*
	* @param TenDangKySoHuu the ten dang ky so huu of this qlvt phuong tien dang ky viet cam
	*/
	@Override
	public void setTenDangKySoHuu(java.lang.String TenDangKySoHuu) {
		_qlvtPhuongTienDangKyVietCam.setTenDangKySoHuu(TenDangKySoHuu);
	}

	/**
	* Returns the nhan hieu of this qlvt phuong tien dang ky viet cam.
	*
	* @return the nhan hieu of this qlvt phuong tien dang ky viet cam
	*/
	@Override
	public java.lang.String getNhanHieu() {
		return _qlvtPhuongTienDangKyVietCam.getNhanHieu();
	}

	/**
	* Sets the nhan hieu of this qlvt phuong tien dang ky viet cam.
	*
	* @param NhanHieu the nhan hieu of this qlvt phuong tien dang ky viet cam
	*/
	@Override
	public void setNhanHieu(java.lang.String NhanHieu) {
		_qlvtPhuongTienDangKyVietCam.setNhanHieu(NhanHieu);
	}

	/**
	* Returns the trong tai of this qlvt phuong tien dang ky viet cam.
	*
	* @return the trong tai of this qlvt phuong tien dang ky viet cam
	*/
	@Override
	public java.lang.String getTrongTai() {
		return _qlvtPhuongTienDangKyVietCam.getTrongTai();
	}

	/**
	* Sets the trong tai of this qlvt phuong tien dang ky viet cam.
	*
	* @param TrongTai the trong tai of this qlvt phuong tien dang ky viet cam
	*/
	@Override
	public void setTrongTai(java.lang.String TrongTai) {
		_qlvtPhuongTienDangKyVietCam.setTrongTai(TrongTai);
	}

	/**
	* Returns the nam san xuat of this qlvt phuong tien dang ky viet cam.
	*
	* @return the nam san xuat of this qlvt phuong tien dang ky viet cam
	*/
	@Override
	public java.lang.String getNamSanXuat() {
		return _qlvtPhuongTienDangKyVietCam.getNamSanXuat();
	}

	/**
	* Sets the nam san xuat of this qlvt phuong tien dang ky viet cam.
	*
	* @param NamSanXuat the nam san xuat of this qlvt phuong tien dang ky viet cam
	*/
	@Override
	public void setNamSanXuat(java.lang.String NamSanXuat) {
		_qlvtPhuongTienDangKyVietCam.setNamSanXuat(NamSanXuat);
	}

	/**
	* Returns the cua khau xuat nhap of this qlvt phuong tien dang ky viet cam.
	*
	* @return the cua khau xuat nhap of this qlvt phuong tien dang ky viet cam
	*/
	@Override
	public java.lang.String getCuaKhauXuatNhap() {
		return _qlvtPhuongTienDangKyVietCam.getCuaKhauXuatNhap();
	}

	/**
	* Sets the cua khau xuat nhap of this qlvt phuong tien dang ky viet cam.
	*
	* @param CuaKhauXuatNhap the cua khau xuat nhap of this qlvt phuong tien dang ky viet cam
	*/
	@Override
	public void setCuaKhauXuatNhap(java.lang.String CuaKhauXuatNhap) {
		_qlvtPhuongTienDangKyVietCam.setCuaKhauXuatNhap(CuaKhauXuatNhap);
	}

	/**
	* Returns the hinh thuc hoat dong of this qlvt phuong tien dang ky viet cam.
	*
	* @return the hinh thuc hoat dong of this qlvt phuong tien dang ky viet cam
	*/
	@Override
	public java.lang.String getHinhThucHoatDong() {
		return _qlvtPhuongTienDangKyVietCam.getHinhThucHoatDong();
	}

	/**
	* Sets the hinh thuc hoat dong of this qlvt phuong tien dang ky viet cam.
	*
	* @param HinhThucHoatDong the hinh thuc hoat dong of this qlvt phuong tien dang ky viet cam
	*/
	@Override
	public void setHinhThucHoatDong(java.lang.String HinhThucHoatDong) {
		_qlvtPhuongTienDangKyVietCam.setHinhThucHoatDong(HinhThucHoatDong);
	}

	/**
	* Returns the loai hinh hoat dong of this qlvt phuong tien dang ky viet cam.
	*
	* @return the loai hinh hoat dong of this qlvt phuong tien dang ky viet cam
	*/
	@Override
	public java.lang.String getLoaiHinhHoatDong() {
		return _qlvtPhuongTienDangKyVietCam.getLoaiHinhHoatDong();
	}

	/**
	* Sets the loai hinh hoat dong of this qlvt phuong tien dang ky viet cam.
	*
	* @param LoaiHinhHoatDong the loai hinh hoat dong of this qlvt phuong tien dang ky viet cam
	*/
	@Override
	public void setLoaiHinhHoatDong(java.lang.String LoaiHinhHoatDong) {
		_qlvtPhuongTienDangKyVietCam.setLoaiHinhHoatDong(LoaiHinhHoatDong);
	}

	/**
	* Returns the tuyen hoat dong of this qlvt phuong tien dang ky viet cam.
	*
	* @return the tuyen hoat dong of this qlvt phuong tien dang ky viet cam
	*/
	@Override
	public java.lang.String getTuyenHoatDong() {
		return _qlvtPhuongTienDangKyVietCam.getTuyenHoatDong();
	}

	/**
	* Sets the tuyen hoat dong of this qlvt phuong tien dang ky viet cam.
	*
	* @param TuyenHoatDong the tuyen hoat dong of this qlvt phuong tien dang ky viet cam
	*/
	@Override
	public void setTuyenHoatDong(java.lang.String TuyenHoatDong) {
		_qlvtPhuongTienDangKyVietCam.setTuyenHoatDong(TuyenHoatDong);
	}

	/**
	* Returns the thoi gian xin cap phep tu of this qlvt phuong tien dang ky viet cam.
	*
	* @return the thoi gian xin cap phep tu of this qlvt phuong tien dang ky viet cam
	*/
	@Override
	public java.util.Date getThoiGianXinCapPhepTu() {
		return _qlvtPhuongTienDangKyVietCam.getThoiGianXinCapPhepTu();
	}

	/**
	* Sets the thoi gian xin cap phep tu of this qlvt phuong tien dang ky viet cam.
	*
	* @param ThoiGianXinCapPhepTu the thoi gian xin cap phep tu of this qlvt phuong tien dang ky viet cam
	*/
	@Override
	public void setThoiGianXinCapPhepTu(java.util.Date ThoiGianXinCapPhepTu) {
		_qlvtPhuongTienDangKyVietCam.setThoiGianXinCapPhepTu(ThoiGianXinCapPhepTu);
	}

	/**
	* Returns the thoi gian xin cap phep den of this qlvt phuong tien dang ky viet cam.
	*
	* @return the thoi gian xin cap phep den of this qlvt phuong tien dang ky viet cam
	*/
	@Override
	public java.util.Date getThoiGianXinCapPhepDen() {
		return _qlvtPhuongTienDangKyVietCam.getThoiGianXinCapPhepDen();
	}

	/**
	* Sets the thoi gian xin cap phep den of this qlvt phuong tien dang ky viet cam.
	*
	* @param ThoiGianXinCapPhepDen the thoi gian xin cap phep den of this qlvt phuong tien dang ky viet cam
	*/
	@Override
	public void setThoiGianXinCapPhepDen(java.util.Date ThoiGianXinCapPhepDen) {
		_qlvtPhuongTienDangKyVietCam.setThoiGianXinCapPhepDen(ThoiGianXinCapPhepDen);
	}

	/**
	* Returns the so khung of this qlvt phuong tien dang ky viet cam.
	*
	* @return the so khung of this qlvt phuong tien dang ky viet cam
	*/
	@Override
	public java.lang.String getSoKhung() {
		return _qlvtPhuongTienDangKyVietCam.getSoKhung();
	}

	/**
	* Sets the so khung of this qlvt phuong tien dang ky viet cam.
	*
	* @param SoKhung the so khung of this qlvt phuong tien dang ky viet cam
	*/
	@Override
	public void setSoKhung(java.lang.String SoKhung) {
		_qlvtPhuongTienDangKyVietCam.setSoKhung(SoKhung);
	}

	/**
	* Returns the mau son of this qlvt phuong tien dang ky viet cam.
	*
	* @return the mau son of this qlvt phuong tien dang ky viet cam
	*/
	@Override
	public java.lang.String getMauSon() {
		return _qlvtPhuongTienDangKyVietCam.getMauSon();
	}

	/**
	* Sets the mau son of this qlvt phuong tien dang ky viet cam.
	*
	* @param MauSon the mau son of this qlvt phuong tien dang ky viet cam
	*/
	@Override
	public void setMauSon(java.lang.String MauSon) {
		_qlvtPhuongTienDangKyVietCam.setMauSon(MauSon);
	}

	/**
	* Returns the so may of this qlvt phuong tien dang ky viet cam.
	*
	* @return the so may of this qlvt phuong tien dang ky viet cam
	*/
	@Override
	public java.lang.String getSoMay() {
		return _qlvtPhuongTienDangKyVietCam.getSoMay();
	}

	/**
	* Sets the so may of this qlvt phuong tien dang ky viet cam.
	*
	* @param SoMay the so may of this qlvt phuong tien dang ky viet cam
	*/
	@Override
	public void setSoMay(java.lang.String SoMay) {
		_qlvtPhuongTienDangKyVietCam.setSoMay(SoMay);
	}

	/**
	* Returns the loai hang van chuyen of this qlvt phuong tien dang ky viet cam.
	*
	* @return the loai hang van chuyen of this qlvt phuong tien dang ky viet cam
	*/
	@Override
	public java.lang.String getLoaiHangVanChuyen() {
		return _qlvtPhuongTienDangKyVietCam.getLoaiHangVanChuyen();
	}

	/**
	* Sets the loai hang van chuyen of this qlvt phuong tien dang ky viet cam.
	*
	* @param LoaiHangVanChuyen the loai hang van chuyen of this qlvt phuong tien dang ky viet cam
	*/
	@Override
	public void setLoaiHangVanChuyen(java.lang.String LoaiHangVanChuyen) {
		_qlvtPhuongTienDangKyVietCam.setLoaiHangVanChuyen(LoaiHangVanChuyen);
	}

	/**
	* Returns the thoi gian du kien khoi hanh of this qlvt phuong tien dang ky viet cam.
	*
	* @return the thoi gian du kien khoi hanh of this qlvt phuong tien dang ky viet cam
	*/
	@Override
	public java.util.Date getThoiGianDuKienKhoiHanh() {
		return _qlvtPhuongTienDangKyVietCam.getThoiGianDuKienKhoiHanh();
	}

	/**
	* Sets the thoi gian du kien khoi hanh of this qlvt phuong tien dang ky viet cam.
	*
	* @param ThoiGianDuKienKhoiHanh the thoi gian du kien khoi hanh of this qlvt phuong tien dang ky viet cam
	*/
	@Override
	public void setThoiGianDuKienKhoiHanh(java.util.Date ThoiGianDuKienKhoiHanh) {
		_qlvtPhuongTienDangKyVietCam.setThoiGianDuKienKhoiHanh(ThoiGianDuKienKhoiHanh);
	}

	/**
	* Returns the noi dung ho so ID of this qlvt phuong tien dang ky viet cam.
	*
	* @return the noi dung ho so ID of this qlvt phuong tien dang ky viet cam
	*/
	@Override
	public long getNoiDungHoSoId() {
		return _qlvtPhuongTienDangKyVietCam.getNoiDungHoSoId();
	}

	/**
	* Sets the noi dung ho so ID of this qlvt phuong tien dang ky viet cam.
	*
	* @param NoiDungHoSoId the noi dung ho so ID of this qlvt phuong tien dang ky viet cam
	*/
	@Override
	public void setNoiDungHoSoId(long NoiDungHoSoId) {
		_qlvtPhuongTienDangKyVietCam.setNoiDungHoSoId(NoiDungHoSoId);
	}

	/**
	* Returns the ho so thu tuc ID of this qlvt phuong tien dang ky viet cam.
	*
	* @return the ho so thu tuc ID of this qlvt phuong tien dang ky viet cam
	*/
	@Override
	public long getHoSoThuTucId() {
		return _qlvtPhuongTienDangKyVietCam.getHoSoThuTucId();
	}

	/**
	* Sets the ho so thu tuc ID of this qlvt phuong tien dang ky viet cam.
	*
	* @param HoSoThuTucId the ho so thu tuc ID of this qlvt phuong tien dang ky viet cam
	*/
	@Override
	public void setHoSoThuTucId(long HoSoThuTucId) {
		_qlvtPhuongTienDangKyVietCam.setHoSoThuTucId(HoSoThuTucId);
	}

	@Override
	public boolean isNew() {
		return _qlvtPhuongTienDangKyVietCam.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtPhuongTienDangKyVietCam.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtPhuongTienDangKyVietCam.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtPhuongTienDangKyVietCam.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtPhuongTienDangKyVietCam.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtPhuongTienDangKyVietCam.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtPhuongTienDangKyVietCam.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtPhuongTienDangKyVietCam.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtPhuongTienDangKyVietCam.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtPhuongTienDangKyVietCam.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtPhuongTienDangKyVietCam.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtPhuongTienDangKyVietCamWrapper((QlvtPhuongTienDangKyVietCam)_qlvtPhuongTienDangKyVietCam.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCam qlvtPhuongTienDangKyVietCam) {
		return _qlvtPhuongTienDangKyVietCam.compareTo(qlvtPhuongTienDangKyVietCam);
	}

	@Override
	public int hashCode() {
		return _qlvtPhuongTienDangKyVietCam.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCam> toCacheModel() {
		return _qlvtPhuongTienDangKyVietCam.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCam toEscapedModel() {
		return new QlvtPhuongTienDangKyVietCamWrapper(_qlvtPhuongTienDangKyVietCam.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCam toUnescapedModel() {
		return new QlvtPhuongTienDangKyVietCamWrapper(_qlvtPhuongTienDangKyVietCam.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtPhuongTienDangKyVietCam.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtPhuongTienDangKyVietCam.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtPhuongTienDangKyVietCam.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtPhuongTienDangKyVietCamWrapper)) {
			return false;
		}

		QlvtPhuongTienDangKyVietCamWrapper qlvtPhuongTienDangKyVietCamWrapper = (QlvtPhuongTienDangKyVietCamWrapper)obj;

		if (Validator.equals(_qlvtPhuongTienDangKyVietCam,
					qlvtPhuongTienDangKyVietCamWrapper._qlvtPhuongTienDangKyVietCam)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtPhuongTienDangKyVietCam getWrappedQlvtPhuongTienDangKyVietCam() {
		return _qlvtPhuongTienDangKyVietCam;
	}

	@Override
	public QlvtPhuongTienDangKyVietCam getWrappedModel() {
		return _qlvtPhuongTienDangKyVietCam;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtPhuongTienDangKyVietCam.resetOriginalValues();
	}

	private QlvtPhuongTienDangKyVietCam _qlvtPhuongTienDangKyVietCam;
}