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
 * This class is a wrapper for {@link QlvtPhuongTienDangKyVietTrung}.
 * </p>
 *
 * @author win_64
 * @see QlvtPhuongTienDangKyVietTrung
 * @generated
 */
public class QlvtPhuongTienDangKyVietTrungWrapper
	implements QlvtPhuongTienDangKyVietTrung,
		ModelWrapper<QlvtPhuongTienDangKyVietTrung> {
	public QlvtPhuongTienDangKyVietTrungWrapper(
		QlvtPhuongTienDangKyVietTrung qlvtPhuongTienDangKyVietTrung) {
		_qlvtPhuongTienDangKyVietTrung = qlvtPhuongTienDangKyVietTrung;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtPhuongTienDangKyVietTrung.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtPhuongTienDangKyVietTrung.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("BienSo", getBienSo());
		attributes.put("NhanHieu", getNhanHieu());
		attributes.put("tenDangKySoHuu", getTenDangKySoHuu());
		attributes.put("loaiXe", getLoaiXe());
		attributes.put("TrongTai", getTrongTai());
		attributes.put("NamSanXuat", getNamSanXuat());
		attributes.put("CuaKhauXuatNhap", getCuaKhauXuatNhap());
		attributes.put("HinhThucHoatDong", getHinhThucHoatDong());
		attributes.put("TuyenHoatDong", getTuyenHoatDong());
		attributes.put("ThoiGianXinCapPhepTu", getThoiGianXinCapPhepTu());
		attributes.put("ThoiGianXinCapPhepDen", getThoiGianXinCapPhepDen());
		attributes.put("SoKhung", getSoKhung());
		attributes.put("MauSon", getMauSon());
		attributes.put("SoMay", getSoMay());
		attributes.put("LoaiHangVanChuyen", getLoaiHangVanChuyen());
		attributes.put("ThoiGianDuKienKhoiHanh", getThoiGianDuKienKhoiHanh());
		attributes.put("hanhTrinhDeNghi", getHanhTrinhDeNghi());
		attributes.put("soGiayPhepBiMatHong", getSoGiayPhepBiMatHong());
		attributes.put("diemDungDoDangKy", getDiemDungDoDangKy());
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

		String NhanHieu = (String)attributes.get("NhanHieu");

		if (NhanHieu != null) {
			setNhanHieu(NhanHieu);
		}

		String tenDangKySoHuu = (String)attributes.get("tenDangKySoHuu");

		if (tenDangKySoHuu != null) {
			setTenDangKySoHuu(tenDangKySoHuu);
		}

		String loaiXe = (String)attributes.get("loaiXe");

		if (loaiXe != null) {
			setLoaiXe(loaiXe);
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

		String hanhTrinhDeNghi = (String)attributes.get("hanhTrinhDeNghi");

		if (hanhTrinhDeNghi != null) {
			setHanhTrinhDeNghi(hanhTrinhDeNghi);
		}

		String soGiayPhepBiMatHong = (String)attributes.get(
				"soGiayPhepBiMatHong");

		if (soGiayPhepBiMatHong != null) {
			setSoGiayPhepBiMatHong(soGiayPhepBiMatHong);
		}

		String diemDungDoDangKy = (String)attributes.get("diemDungDoDangKy");

		if (diemDungDoDangKy != null) {
			setDiemDungDoDangKy(diemDungDoDangKy);
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
	* Returns the primary key of this qlvt phuong tien dang ky viet trung.
	*
	* @return the primary key of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtPhuongTienDangKyVietTrung.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt phuong tien dang ky viet trung.
	*
	* @param primaryKey the primary key of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtPhuongTienDangKyVietTrung.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt phuong tien dang ky viet trung.
	*
	* @return the ID of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public long getId() {
		return _qlvtPhuongTienDangKyVietTrung.getId();
	}

	/**
	* Sets the ID of this qlvt phuong tien dang ky viet trung.
	*
	* @param id the ID of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public void setId(long id) {
		_qlvtPhuongTienDangKyVietTrung.setId(id);
	}

	/**
	* Returns the bien so of this qlvt phuong tien dang ky viet trung.
	*
	* @return the bien so of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public java.lang.String getBienSo() {
		return _qlvtPhuongTienDangKyVietTrung.getBienSo();
	}

	/**
	* Sets the bien so of this qlvt phuong tien dang ky viet trung.
	*
	* @param BienSo the bien so of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public void setBienSo(java.lang.String BienSo) {
		_qlvtPhuongTienDangKyVietTrung.setBienSo(BienSo);
	}

	/**
	* Returns the nhan hieu of this qlvt phuong tien dang ky viet trung.
	*
	* @return the nhan hieu of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public java.lang.String getNhanHieu() {
		return _qlvtPhuongTienDangKyVietTrung.getNhanHieu();
	}

	/**
	* Sets the nhan hieu of this qlvt phuong tien dang ky viet trung.
	*
	* @param NhanHieu the nhan hieu of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public void setNhanHieu(java.lang.String NhanHieu) {
		_qlvtPhuongTienDangKyVietTrung.setNhanHieu(NhanHieu);
	}

	/**
	* Returns the ten dang ky so huu of this qlvt phuong tien dang ky viet trung.
	*
	* @return the ten dang ky so huu of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public java.lang.String getTenDangKySoHuu() {
		return _qlvtPhuongTienDangKyVietTrung.getTenDangKySoHuu();
	}

	/**
	* Sets the ten dang ky so huu of this qlvt phuong tien dang ky viet trung.
	*
	* @param tenDangKySoHuu the ten dang ky so huu of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public void setTenDangKySoHuu(java.lang.String tenDangKySoHuu) {
		_qlvtPhuongTienDangKyVietTrung.setTenDangKySoHuu(tenDangKySoHuu);
	}

	/**
	* Returns the loai xe of this qlvt phuong tien dang ky viet trung.
	*
	* @return the loai xe of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public java.lang.String getLoaiXe() {
		return _qlvtPhuongTienDangKyVietTrung.getLoaiXe();
	}

	/**
	* Sets the loai xe of this qlvt phuong tien dang ky viet trung.
	*
	* @param loaiXe the loai xe of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public void setLoaiXe(java.lang.String loaiXe) {
		_qlvtPhuongTienDangKyVietTrung.setLoaiXe(loaiXe);
	}

	/**
	* Returns the trong tai of this qlvt phuong tien dang ky viet trung.
	*
	* @return the trong tai of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public java.lang.String getTrongTai() {
		return _qlvtPhuongTienDangKyVietTrung.getTrongTai();
	}

	/**
	* Sets the trong tai of this qlvt phuong tien dang ky viet trung.
	*
	* @param TrongTai the trong tai of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public void setTrongTai(java.lang.String TrongTai) {
		_qlvtPhuongTienDangKyVietTrung.setTrongTai(TrongTai);
	}

	/**
	* Returns the nam san xuat of this qlvt phuong tien dang ky viet trung.
	*
	* @return the nam san xuat of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public java.lang.String getNamSanXuat() {
		return _qlvtPhuongTienDangKyVietTrung.getNamSanXuat();
	}

	/**
	* Sets the nam san xuat of this qlvt phuong tien dang ky viet trung.
	*
	* @param NamSanXuat the nam san xuat of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public void setNamSanXuat(java.lang.String NamSanXuat) {
		_qlvtPhuongTienDangKyVietTrung.setNamSanXuat(NamSanXuat);
	}

	/**
	* Returns the cua khau xuat nhap of this qlvt phuong tien dang ky viet trung.
	*
	* @return the cua khau xuat nhap of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public java.lang.String getCuaKhauXuatNhap() {
		return _qlvtPhuongTienDangKyVietTrung.getCuaKhauXuatNhap();
	}

	/**
	* Sets the cua khau xuat nhap of this qlvt phuong tien dang ky viet trung.
	*
	* @param CuaKhauXuatNhap the cua khau xuat nhap of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public void setCuaKhauXuatNhap(java.lang.String CuaKhauXuatNhap) {
		_qlvtPhuongTienDangKyVietTrung.setCuaKhauXuatNhap(CuaKhauXuatNhap);
	}

	/**
	* Returns the hinh thuc hoat dong of this qlvt phuong tien dang ky viet trung.
	*
	* @return the hinh thuc hoat dong of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public java.lang.String getHinhThucHoatDong() {
		return _qlvtPhuongTienDangKyVietTrung.getHinhThucHoatDong();
	}

	/**
	* Sets the hinh thuc hoat dong of this qlvt phuong tien dang ky viet trung.
	*
	* @param HinhThucHoatDong the hinh thuc hoat dong of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public void setHinhThucHoatDong(java.lang.String HinhThucHoatDong) {
		_qlvtPhuongTienDangKyVietTrung.setHinhThucHoatDong(HinhThucHoatDong);
	}

	/**
	* Returns the tuyen hoat dong of this qlvt phuong tien dang ky viet trung.
	*
	* @return the tuyen hoat dong of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public java.lang.String getTuyenHoatDong() {
		return _qlvtPhuongTienDangKyVietTrung.getTuyenHoatDong();
	}

	/**
	* Sets the tuyen hoat dong of this qlvt phuong tien dang ky viet trung.
	*
	* @param TuyenHoatDong the tuyen hoat dong of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public void setTuyenHoatDong(java.lang.String TuyenHoatDong) {
		_qlvtPhuongTienDangKyVietTrung.setTuyenHoatDong(TuyenHoatDong);
	}

	/**
	* Returns the thoi gian xin cap phep tu of this qlvt phuong tien dang ky viet trung.
	*
	* @return the thoi gian xin cap phep tu of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public java.util.Date getThoiGianXinCapPhepTu() {
		return _qlvtPhuongTienDangKyVietTrung.getThoiGianXinCapPhepTu();
	}

	/**
	* Sets the thoi gian xin cap phep tu of this qlvt phuong tien dang ky viet trung.
	*
	* @param ThoiGianXinCapPhepTu the thoi gian xin cap phep tu of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public void setThoiGianXinCapPhepTu(java.util.Date ThoiGianXinCapPhepTu) {
		_qlvtPhuongTienDangKyVietTrung.setThoiGianXinCapPhepTu(ThoiGianXinCapPhepTu);
	}

	/**
	* Returns the thoi gian xin cap phep den of this qlvt phuong tien dang ky viet trung.
	*
	* @return the thoi gian xin cap phep den of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public java.util.Date getThoiGianXinCapPhepDen() {
		return _qlvtPhuongTienDangKyVietTrung.getThoiGianXinCapPhepDen();
	}

	/**
	* Sets the thoi gian xin cap phep den of this qlvt phuong tien dang ky viet trung.
	*
	* @param ThoiGianXinCapPhepDen the thoi gian xin cap phep den of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public void setThoiGianXinCapPhepDen(java.util.Date ThoiGianXinCapPhepDen) {
		_qlvtPhuongTienDangKyVietTrung.setThoiGianXinCapPhepDen(ThoiGianXinCapPhepDen);
	}

	/**
	* Returns the so khung of this qlvt phuong tien dang ky viet trung.
	*
	* @return the so khung of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public java.lang.String getSoKhung() {
		return _qlvtPhuongTienDangKyVietTrung.getSoKhung();
	}

	/**
	* Sets the so khung of this qlvt phuong tien dang ky viet trung.
	*
	* @param SoKhung the so khung of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public void setSoKhung(java.lang.String SoKhung) {
		_qlvtPhuongTienDangKyVietTrung.setSoKhung(SoKhung);
	}

	/**
	* Returns the mau son of this qlvt phuong tien dang ky viet trung.
	*
	* @return the mau son of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public java.lang.String getMauSon() {
		return _qlvtPhuongTienDangKyVietTrung.getMauSon();
	}

	/**
	* Sets the mau son of this qlvt phuong tien dang ky viet trung.
	*
	* @param MauSon the mau son of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public void setMauSon(java.lang.String MauSon) {
		_qlvtPhuongTienDangKyVietTrung.setMauSon(MauSon);
	}

	/**
	* Returns the so may of this qlvt phuong tien dang ky viet trung.
	*
	* @return the so may of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public java.lang.String getSoMay() {
		return _qlvtPhuongTienDangKyVietTrung.getSoMay();
	}

	/**
	* Sets the so may of this qlvt phuong tien dang ky viet trung.
	*
	* @param SoMay the so may of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public void setSoMay(java.lang.String SoMay) {
		_qlvtPhuongTienDangKyVietTrung.setSoMay(SoMay);
	}

	/**
	* Returns the loai hang van chuyen of this qlvt phuong tien dang ky viet trung.
	*
	* @return the loai hang van chuyen of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public java.lang.String getLoaiHangVanChuyen() {
		return _qlvtPhuongTienDangKyVietTrung.getLoaiHangVanChuyen();
	}

	/**
	* Sets the loai hang van chuyen of this qlvt phuong tien dang ky viet trung.
	*
	* @param LoaiHangVanChuyen the loai hang van chuyen of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public void setLoaiHangVanChuyen(java.lang.String LoaiHangVanChuyen) {
		_qlvtPhuongTienDangKyVietTrung.setLoaiHangVanChuyen(LoaiHangVanChuyen);
	}

	/**
	* Returns the thoi gian du kien khoi hanh of this qlvt phuong tien dang ky viet trung.
	*
	* @return the thoi gian du kien khoi hanh of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public java.util.Date getThoiGianDuKienKhoiHanh() {
		return _qlvtPhuongTienDangKyVietTrung.getThoiGianDuKienKhoiHanh();
	}

	/**
	* Sets the thoi gian du kien khoi hanh of this qlvt phuong tien dang ky viet trung.
	*
	* @param ThoiGianDuKienKhoiHanh the thoi gian du kien khoi hanh of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public void setThoiGianDuKienKhoiHanh(java.util.Date ThoiGianDuKienKhoiHanh) {
		_qlvtPhuongTienDangKyVietTrung.setThoiGianDuKienKhoiHanh(ThoiGianDuKienKhoiHanh);
	}

	/**
	* Returns the hanh trinh de nghi of this qlvt phuong tien dang ky viet trung.
	*
	* @return the hanh trinh de nghi of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public java.lang.String getHanhTrinhDeNghi() {
		return _qlvtPhuongTienDangKyVietTrung.getHanhTrinhDeNghi();
	}

	/**
	* Sets the hanh trinh de nghi of this qlvt phuong tien dang ky viet trung.
	*
	* @param hanhTrinhDeNghi the hanh trinh de nghi of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public void setHanhTrinhDeNghi(java.lang.String hanhTrinhDeNghi) {
		_qlvtPhuongTienDangKyVietTrung.setHanhTrinhDeNghi(hanhTrinhDeNghi);
	}

	/**
	* Returns the so giay phep bi mat hong of this qlvt phuong tien dang ky viet trung.
	*
	* @return the so giay phep bi mat hong of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public java.lang.String getSoGiayPhepBiMatHong() {
		return _qlvtPhuongTienDangKyVietTrung.getSoGiayPhepBiMatHong();
	}

	/**
	* Sets the so giay phep bi mat hong of this qlvt phuong tien dang ky viet trung.
	*
	* @param soGiayPhepBiMatHong the so giay phep bi mat hong of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public void setSoGiayPhepBiMatHong(java.lang.String soGiayPhepBiMatHong) {
		_qlvtPhuongTienDangKyVietTrung.setSoGiayPhepBiMatHong(soGiayPhepBiMatHong);
	}

	/**
	* Returns the diem dung do dang ky of this qlvt phuong tien dang ky viet trung.
	*
	* @return the diem dung do dang ky of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public java.lang.String getDiemDungDoDangKy() {
		return _qlvtPhuongTienDangKyVietTrung.getDiemDungDoDangKy();
	}

	/**
	* Sets the diem dung do dang ky of this qlvt phuong tien dang ky viet trung.
	*
	* @param diemDungDoDangKy the diem dung do dang ky of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public void setDiemDungDoDangKy(java.lang.String diemDungDoDangKy) {
		_qlvtPhuongTienDangKyVietTrung.setDiemDungDoDangKy(diemDungDoDangKy);
	}

	/**
	* Returns the noi dung ho so ID of this qlvt phuong tien dang ky viet trung.
	*
	* @return the noi dung ho so ID of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public long getNoiDungHoSoId() {
		return _qlvtPhuongTienDangKyVietTrung.getNoiDungHoSoId();
	}

	/**
	* Sets the noi dung ho so ID of this qlvt phuong tien dang ky viet trung.
	*
	* @param NoiDungHoSoId the noi dung ho so ID of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public void setNoiDungHoSoId(long NoiDungHoSoId) {
		_qlvtPhuongTienDangKyVietTrung.setNoiDungHoSoId(NoiDungHoSoId);
	}

	/**
	* Returns the ho so thu tuc ID of this qlvt phuong tien dang ky viet trung.
	*
	* @return the ho so thu tuc ID of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public long getHoSoThuTucId() {
		return _qlvtPhuongTienDangKyVietTrung.getHoSoThuTucId();
	}

	/**
	* Sets the ho so thu tuc ID of this qlvt phuong tien dang ky viet trung.
	*
	* @param HoSoThuTucId the ho so thu tuc ID of this qlvt phuong tien dang ky viet trung
	*/
	@Override
	public void setHoSoThuTucId(long HoSoThuTucId) {
		_qlvtPhuongTienDangKyVietTrung.setHoSoThuTucId(HoSoThuTucId);
	}

	@Override
	public boolean isNew() {
		return _qlvtPhuongTienDangKyVietTrung.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtPhuongTienDangKyVietTrung.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtPhuongTienDangKyVietTrung.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtPhuongTienDangKyVietTrung.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtPhuongTienDangKyVietTrung.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtPhuongTienDangKyVietTrung.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtPhuongTienDangKyVietTrung.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtPhuongTienDangKyVietTrung.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtPhuongTienDangKyVietTrung.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtPhuongTienDangKyVietTrung.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtPhuongTienDangKyVietTrung.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtPhuongTienDangKyVietTrungWrapper((QlvtPhuongTienDangKyVietTrung)_qlvtPhuongTienDangKyVietTrung.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietTrung qlvtPhuongTienDangKyVietTrung) {
		return _qlvtPhuongTienDangKyVietTrung.compareTo(qlvtPhuongTienDangKyVietTrung);
	}

	@Override
	public int hashCode() {
		return _qlvtPhuongTienDangKyVietTrung.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietTrung> toCacheModel() {
		return _qlvtPhuongTienDangKyVietTrung.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietTrung toEscapedModel() {
		return new QlvtPhuongTienDangKyVietTrungWrapper(_qlvtPhuongTienDangKyVietTrung.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietTrung toUnescapedModel() {
		return new QlvtPhuongTienDangKyVietTrungWrapper(_qlvtPhuongTienDangKyVietTrung.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtPhuongTienDangKyVietTrung.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtPhuongTienDangKyVietTrung.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtPhuongTienDangKyVietTrung.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtPhuongTienDangKyVietTrungWrapper)) {
			return false;
		}

		QlvtPhuongTienDangKyVietTrungWrapper qlvtPhuongTienDangKyVietTrungWrapper =
			(QlvtPhuongTienDangKyVietTrungWrapper)obj;

		if (Validator.equals(_qlvtPhuongTienDangKyVietTrung,
					qlvtPhuongTienDangKyVietTrungWrapper._qlvtPhuongTienDangKyVietTrung)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtPhuongTienDangKyVietTrung getWrappedQlvtPhuongTienDangKyVietTrung() {
		return _qlvtPhuongTienDangKyVietTrung;
	}

	@Override
	public QlvtPhuongTienDangKyVietTrung getWrappedModel() {
		return _qlvtPhuongTienDangKyVietTrung;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtPhuongTienDangKyVietTrung.resetOriginalValues();
	}

	private QlvtPhuongTienDangKyVietTrung _qlvtPhuongTienDangKyVietTrung;
}