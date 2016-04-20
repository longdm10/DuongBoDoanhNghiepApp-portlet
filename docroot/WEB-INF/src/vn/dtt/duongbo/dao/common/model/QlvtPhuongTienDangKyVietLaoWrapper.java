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
 * This class is a wrapper for {@link QlvtPhuongTienDangKyVietLao}.
 * </p>
 *
 * @author win_64
 * @see QlvtPhuongTienDangKyVietLao
 * @generated
 */
public class QlvtPhuongTienDangKyVietLaoWrapper
	implements QlvtPhuongTienDangKyVietLao,
		ModelWrapper<QlvtPhuongTienDangKyVietLao> {
	public QlvtPhuongTienDangKyVietLaoWrapper(
		QlvtPhuongTienDangKyVietLao qlvtPhuongTienDangKyVietLao) {
		_qlvtPhuongTienDangKyVietLao = qlvtPhuongTienDangKyVietLao;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtPhuongTienDangKyVietLao.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtPhuongTienDangKyVietLao.class.getName();
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
	* Returns the primary key of this qlvt phuong tien dang ky viet lao.
	*
	* @return the primary key of this qlvt phuong tien dang ky viet lao
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtPhuongTienDangKyVietLao.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt phuong tien dang ky viet lao.
	*
	* @param primaryKey the primary key of this qlvt phuong tien dang ky viet lao
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtPhuongTienDangKyVietLao.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt phuong tien dang ky viet lao.
	*
	* @return the ID of this qlvt phuong tien dang ky viet lao
	*/
	@Override
	public long getId() {
		return _qlvtPhuongTienDangKyVietLao.getId();
	}

	/**
	* Sets the ID of this qlvt phuong tien dang ky viet lao.
	*
	* @param id the ID of this qlvt phuong tien dang ky viet lao
	*/
	@Override
	public void setId(long id) {
		_qlvtPhuongTienDangKyVietLao.setId(id);
	}

	/**
	* Returns the bien so of this qlvt phuong tien dang ky viet lao.
	*
	* @return the bien so of this qlvt phuong tien dang ky viet lao
	*/
	@Override
	public java.lang.String getBienSo() {
		return _qlvtPhuongTienDangKyVietLao.getBienSo();
	}

	/**
	* Sets the bien so of this qlvt phuong tien dang ky viet lao.
	*
	* @param BienSo the bien so of this qlvt phuong tien dang ky viet lao
	*/
	@Override
	public void setBienSo(java.lang.String BienSo) {
		_qlvtPhuongTienDangKyVietLao.setBienSo(BienSo);
	}

	/**
	* Returns the ten dang ky so huu of this qlvt phuong tien dang ky viet lao.
	*
	* @return the ten dang ky so huu of this qlvt phuong tien dang ky viet lao
	*/
	@Override
	public java.lang.String getTenDangKySoHuu() {
		return _qlvtPhuongTienDangKyVietLao.getTenDangKySoHuu();
	}

	/**
	* Sets the ten dang ky so huu of this qlvt phuong tien dang ky viet lao.
	*
	* @param TenDangKySoHuu the ten dang ky so huu of this qlvt phuong tien dang ky viet lao
	*/
	@Override
	public void setTenDangKySoHuu(java.lang.String TenDangKySoHuu) {
		_qlvtPhuongTienDangKyVietLao.setTenDangKySoHuu(TenDangKySoHuu);
	}

	/**
	* Returns the nhan hieu of this qlvt phuong tien dang ky viet lao.
	*
	* @return the nhan hieu of this qlvt phuong tien dang ky viet lao
	*/
	@Override
	public java.lang.String getNhanHieu() {
		return _qlvtPhuongTienDangKyVietLao.getNhanHieu();
	}

	/**
	* Sets the nhan hieu of this qlvt phuong tien dang ky viet lao.
	*
	* @param NhanHieu the nhan hieu of this qlvt phuong tien dang ky viet lao
	*/
	@Override
	public void setNhanHieu(java.lang.String NhanHieu) {
		_qlvtPhuongTienDangKyVietLao.setNhanHieu(NhanHieu);
	}

	/**
	* Returns the trong tai of this qlvt phuong tien dang ky viet lao.
	*
	* @return the trong tai of this qlvt phuong tien dang ky viet lao
	*/
	@Override
	public java.lang.String getTrongTai() {
		return _qlvtPhuongTienDangKyVietLao.getTrongTai();
	}

	/**
	* Sets the trong tai of this qlvt phuong tien dang ky viet lao.
	*
	* @param TrongTai the trong tai of this qlvt phuong tien dang ky viet lao
	*/
	@Override
	public void setTrongTai(java.lang.String TrongTai) {
		_qlvtPhuongTienDangKyVietLao.setTrongTai(TrongTai);
	}

	/**
	* Returns the nam san xuat of this qlvt phuong tien dang ky viet lao.
	*
	* @return the nam san xuat of this qlvt phuong tien dang ky viet lao
	*/
	@Override
	public java.lang.String getNamSanXuat() {
		return _qlvtPhuongTienDangKyVietLao.getNamSanXuat();
	}

	/**
	* Sets the nam san xuat of this qlvt phuong tien dang ky viet lao.
	*
	* @param NamSanXuat the nam san xuat of this qlvt phuong tien dang ky viet lao
	*/
	@Override
	public void setNamSanXuat(java.lang.String NamSanXuat) {
		_qlvtPhuongTienDangKyVietLao.setNamSanXuat(NamSanXuat);
	}

	/**
	* Returns the cua khau xuat nhap of this qlvt phuong tien dang ky viet lao.
	*
	* @return the cua khau xuat nhap of this qlvt phuong tien dang ky viet lao
	*/
	@Override
	public java.lang.String getCuaKhauXuatNhap() {
		return _qlvtPhuongTienDangKyVietLao.getCuaKhauXuatNhap();
	}

	/**
	* Sets the cua khau xuat nhap of this qlvt phuong tien dang ky viet lao.
	*
	* @param CuaKhauXuatNhap the cua khau xuat nhap of this qlvt phuong tien dang ky viet lao
	*/
	@Override
	public void setCuaKhauXuatNhap(java.lang.String CuaKhauXuatNhap) {
		_qlvtPhuongTienDangKyVietLao.setCuaKhauXuatNhap(CuaKhauXuatNhap);
	}

	/**
	* Returns the hinh thuc hoat dong of this qlvt phuong tien dang ky viet lao.
	*
	* @return the hinh thuc hoat dong of this qlvt phuong tien dang ky viet lao
	*/
	@Override
	public java.lang.String getHinhThucHoatDong() {
		return _qlvtPhuongTienDangKyVietLao.getHinhThucHoatDong();
	}

	/**
	* Sets the hinh thuc hoat dong of this qlvt phuong tien dang ky viet lao.
	*
	* @param HinhThucHoatDong the hinh thuc hoat dong of this qlvt phuong tien dang ky viet lao
	*/
	@Override
	public void setHinhThucHoatDong(java.lang.String HinhThucHoatDong) {
		_qlvtPhuongTienDangKyVietLao.setHinhThucHoatDong(HinhThucHoatDong);
	}

	/**
	* Returns the loai hinh hoat dong of this qlvt phuong tien dang ky viet lao.
	*
	* @return the loai hinh hoat dong of this qlvt phuong tien dang ky viet lao
	*/
	@Override
	public java.lang.String getLoaiHinhHoatDong() {
		return _qlvtPhuongTienDangKyVietLao.getLoaiHinhHoatDong();
	}

	/**
	* Sets the loai hinh hoat dong of this qlvt phuong tien dang ky viet lao.
	*
	* @param LoaiHinhHoatDong the loai hinh hoat dong of this qlvt phuong tien dang ky viet lao
	*/
	@Override
	public void setLoaiHinhHoatDong(java.lang.String LoaiHinhHoatDong) {
		_qlvtPhuongTienDangKyVietLao.setLoaiHinhHoatDong(LoaiHinhHoatDong);
	}

	/**
	* Returns the tuyen hoat dong of this qlvt phuong tien dang ky viet lao.
	*
	* @return the tuyen hoat dong of this qlvt phuong tien dang ky viet lao
	*/
	@Override
	public java.lang.String getTuyenHoatDong() {
		return _qlvtPhuongTienDangKyVietLao.getTuyenHoatDong();
	}

	/**
	* Sets the tuyen hoat dong of this qlvt phuong tien dang ky viet lao.
	*
	* @param TuyenHoatDong the tuyen hoat dong of this qlvt phuong tien dang ky viet lao
	*/
	@Override
	public void setTuyenHoatDong(java.lang.String TuyenHoatDong) {
		_qlvtPhuongTienDangKyVietLao.setTuyenHoatDong(TuyenHoatDong);
	}

	/**
	* Returns the thoi gian xin cap phep tu of this qlvt phuong tien dang ky viet lao.
	*
	* @return the thoi gian xin cap phep tu of this qlvt phuong tien dang ky viet lao
	*/
	@Override
	public java.util.Date getThoiGianXinCapPhepTu() {
		return _qlvtPhuongTienDangKyVietLao.getThoiGianXinCapPhepTu();
	}

	/**
	* Sets the thoi gian xin cap phep tu of this qlvt phuong tien dang ky viet lao.
	*
	* @param ThoiGianXinCapPhepTu the thoi gian xin cap phep tu of this qlvt phuong tien dang ky viet lao
	*/
	@Override
	public void setThoiGianXinCapPhepTu(java.util.Date ThoiGianXinCapPhepTu) {
		_qlvtPhuongTienDangKyVietLao.setThoiGianXinCapPhepTu(ThoiGianXinCapPhepTu);
	}

	/**
	* Returns the thoi gian xin cap phep den of this qlvt phuong tien dang ky viet lao.
	*
	* @return the thoi gian xin cap phep den of this qlvt phuong tien dang ky viet lao
	*/
	@Override
	public java.util.Date getThoiGianXinCapPhepDen() {
		return _qlvtPhuongTienDangKyVietLao.getThoiGianXinCapPhepDen();
	}

	/**
	* Sets the thoi gian xin cap phep den of this qlvt phuong tien dang ky viet lao.
	*
	* @param ThoiGianXinCapPhepDen the thoi gian xin cap phep den of this qlvt phuong tien dang ky viet lao
	*/
	@Override
	public void setThoiGianXinCapPhepDen(java.util.Date ThoiGianXinCapPhepDen) {
		_qlvtPhuongTienDangKyVietLao.setThoiGianXinCapPhepDen(ThoiGianXinCapPhepDen);
	}

	/**
	* Returns the so khung of this qlvt phuong tien dang ky viet lao.
	*
	* @return the so khung of this qlvt phuong tien dang ky viet lao
	*/
	@Override
	public java.lang.String getSoKhung() {
		return _qlvtPhuongTienDangKyVietLao.getSoKhung();
	}

	/**
	* Sets the so khung of this qlvt phuong tien dang ky viet lao.
	*
	* @param SoKhung the so khung of this qlvt phuong tien dang ky viet lao
	*/
	@Override
	public void setSoKhung(java.lang.String SoKhung) {
		_qlvtPhuongTienDangKyVietLao.setSoKhung(SoKhung);
	}

	/**
	* Returns the mau son of this qlvt phuong tien dang ky viet lao.
	*
	* @return the mau son of this qlvt phuong tien dang ky viet lao
	*/
	@Override
	public java.lang.String getMauSon() {
		return _qlvtPhuongTienDangKyVietLao.getMauSon();
	}

	/**
	* Sets the mau son of this qlvt phuong tien dang ky viet lao.
	*
	* @param MauSon the mau son of this qlvt phuong tien dang ky viet lao
	*/
	@Override
	public void setMauSon(java.lang.String MauSon) {
		_qlvtPhuongTienDangKyVietLao.setMauSon(MauSon);
	}

	/**
	* Returns the so may of this qlvt phuong tien dang ky viet lao.
	*
	* @return the so may of this qlvt phuong tien dang ky viet lao
	*/
	@Override
	public java.lang.String getSoMay() {
		return _qlvtPhuongTienDangKyVietLao.getSoMay();
	}

	/**
	* Sets the so may of this qlvt phuong tien dang ky viet lao.
	*
	* @param SoMay the so may of this qlvt phuong tien dang ky viet lao
	*/
	@Override
	public void setSoMay(java.lang.String SoMay) {
		_qlvtPhuongTienDangKyVietLao.setSoMay(SoMay);
	}

	/**
	* Returns the loai hang van chuyen of this qlvt phuong tien dang ky viet lao.
	*
	* @return the loai hang van chuyen of this qlvt phuong tien dang ky viet lao
	*/
	@Override
	public java.lang.String getLoaiHangVanChuyen() {
		return _qlvtPhuongTienDangKyVietLao.getLoaiHangVanChuyen();
	}

	/**
	* Sets the loai hang van chuyen of this qlvt phuong tien dang ky viet lao.
	*
	* @param LoaiHangVanChuyen the loai hang van chuyen of this qlvt phuong tien dang ky viet lao
	*/
	@Override
	public void setLoaiHangVanChuyen(java.lang.String LoaiHangVanChuyen) {
		_qlvtPhuongTienDangKyVietLao.setLoaiHangVanChuyen(LoaiHangVanChuyen);
	}

	/**
	* Returns the thoi gian du kien khoi hanh of this qlvt phuong tien dang ky viet lao.
	*
	* @return the thoi gian du kien khoi hanh of this qlvt phuong tien dang ky viet lao
	*/
	@Override
	public java.util.Date getThoiGianDuKienKhoiHanh() {
		return _qlvtPhuongTienDangKyVietLao.getThoiGianDuKienKhoiHanh();
	}

	/**
	* Sets the thoi gian du kien khoi hanh of this qlvt phuong tien dang ky viet lao.
	*
	* @param ThoiGianDuKienKhoiHanh the thoi gian du kien khoi hanh of this qlvt phuong tien dang ky viet lao
	*/
	@Override
	public void setThoiGianDuKienKhoiHanh(java.util.Date ThoiGianDuKienKhoiHanh) {
		_qlvtPhuongTienDangKyVietLao.setThoiGianDuKienKhoiHanh(ThoiGianDuKienKhoiHanh);
	}

	/**
	* Returns the noi dung ho so ID of this qlvt phuong tien dang ky viet lao.
	*
	* @return the noi dung ho so ID of this qlvt phuong tien dang ky viet lao
	*/
	@Override
	public long getNoiDungHoSoId() {
		return _qlvtPhuongTienDangKyVietLao.getNoiDungHoSoId();
	}

	/**
	* Sets the noi dung ho so ID of this qlvt phuong tien dang ky viet lao.
	*
	* @param NoiDungHoSoId the noi dung ho so ID of this qlvt phuong tien dang ky viet lao
	*/
	@Override
	public void setNoiDungHoSoId(long NoiDungHoSoId) {
		_qlvtPhuongTienDangKyVietLao.setNoiDungHoSoId(NoiDungHoSoId);
	}

	/**
	* Returns the ho so thu tuc ID of this qlvt phuong tien dang ky viet lao.
	*
	* @return the ho so thu tuc ID of this qlvt phuong tien dang ky viet lao
	*/
	@Override
	public long getHoSoThuTucId() {
		return _qlvtPhuongTienDangKyVietLao.getHoSoThuTucId();
	}

	/**
	* Sets the ho so thu tuc ID of this qlvt phuong tien dang ky viet lao.
	*
	* @param HoSoThuTucId the ho so thu tuc ID of this qlvt phuong tien dang ky viet lao
	*/
	@Override
	public void setHoSoThuTucId(long HoSoThuTucId) {
		_qlvtPhuongTienDangKyVietLao.setHoSoThuTucId(HoSoThuTucId);
	}

	@Override
	public boolean isNew() {
		return _qlvtPhuongTienDangKyVietLao.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtPhuongTienDangKyVietLao.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtPhuongTienDangKyVietLao.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtPhuongTienDangKyVietLao.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtPhuongTienDangKyVietLao.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtPhuongTienDangKyVietLao.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtPhuongTienDangKyVietLao.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtPhuongTienDangKyVietLao.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtPhuongTienDangKyVietLao.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtPhuongTienDangKyVietLao.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtPhuongTienDangKyVietLao.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtPhuongTienDangKyVietLaoWrapper((QlvtPhuongTienDangKyVietLao)_qlvtPhuongTienDangKyVietLao.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietLao qlvtPhuongTienDangKyVietLao) {
		return _qlvtPhuongTienDangKyVietLao.compareTo(qlvtPhuongTienDangKyVietLao);
	}

	@Override
	public int hashCode() {
		return _qlvtPhuongTienDangKyVietLao.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietLao> toCacheModel() {
		return _qlvtPhuongTienDangKyVietLao.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietLao toEscapedModel() {
		return new QlvtPhuongTienDangKyVietLaoWrapper(_qlvtPhuongTienDangKyVietLao.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietLao toUnescapedModel() {
		return new QlvtPhuongTienDangKyVietLaoWrapper(_qlvtPhuongTienDangKyVietLao.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtPhuongTienDangKyVietLao.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtPhuongTienDangKyVietLao.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtPhuongTienDangKyVietLao.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtPhuongTienDangKyVietLaoWrapper)) {
			return false;
		}

		QlvtPhuongTienDangKyVietLaoWrapper qlvtPhuongTienDangKyVietLaoWrapper = (QlvtPhuongTienDangKyVietLaoWrapper)obj;

		if (Validator.equals(_qlvtPhuongTienDangKyVietLao,
					qlvtPhuongTienDangKyVietLaoWrapper._qlvtPhuongTienDangKyVietLao)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtPhuongTienDangKyVietLao getWrappedQlvtPhuongTienDangKyVietLao() {
		return _qlvtPhuongTienDangKyVietLao;
	}

	@Override
	public QlvtPhuongTienDangKyVietLao getWrappedModel() {
		return _qlvtPhuongTienDangKyVietLao;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtPhuongTienDangKyVietLao.resetOriginalValues();
	}

	private QlvtPhuongTienDangKyVietLao _qlvtPhuongTienDangKyVietLao;
}