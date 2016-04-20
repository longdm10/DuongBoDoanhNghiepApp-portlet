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

package vn.dtt.duongbo.dao.doanhnghiep.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author win_64
 * @generated
 */
public class DnDoanhNghiepSoap implements Serializable {
	public static DnDoanhNghiepSoap toSoapModel(DnDoanhNghiep model) {
		DnDoanhNghiepSoap soapModel = new DnDoanhNghiepSoap();

		soapModel.setId(model.getId());
		soapModel.setMaSoDoanhNghiep(model.getMaSoDoanhNghiep());
		soapModel.setTenDoanhNghiep(model.getTenDoanhNghiep());
		soapModel.setDiaChi(model.getDiaChi());
		soapModel.setMaTinhThanh(model.getMaTinhThanh());
		soapModel.setMaQuanHuyen(model.getMaQuanHuyen());
		soapModel.setMaPhuongXa(model.getMaPhuongXa());
		soapModel.setDienThoai(model.getDienThoai());
		soapModel.setWebsite(model.getWebsite());
		soapModel.setFax(model.getFax());
		soapModel.setEmail(model.getEmail());
		soapModel.setMaster(model.getMaster());
		soapModel.setNgayDangKi(model.getNgayDangKi());
		soapModel.setHangTaiKhoan(model.getHangTaiKhoan());
		soapModel.setMaKichHoat(model.getMaKichHoat());
		soapModel.setNgayKichHoat(model.getNgayKichHoat());
		soapModel.setSoDangKyKinhDoanh(model.getSoDangKyKinhDoanh());
		soapModel.setNgayCapDkKd(model.getNgayCapDkKd());
		soapModel.setNgayHetHanDKKD(model.getNgayHetHanDKKD());
		soapModel.setCoQuanCapDkKd(model.getCoQuanCapDkKd());
		soapModel.setLoaiDoanhNghiep(model.getLoaiDoanhNghiep());
		soapModel.setNguoiDaiDien(model.getNguoiDaiDien());
		soapModel.setSoDienThoaiNguoiDaiDien(model.getSoDienThoaiNguoiDaiDien());
		soapModel.setChucVuNguoiDaiDien(model.getChucVuNguoiDaiDien());
		soapModel.setTenTiengAnh(model.getTenTiengAnh());
		soapModel.setTenVietTat(model.getTenVietTat());
		soapModel.setSoGpkdVanTaiBangOto(model.getSoGpkdVanTaiBangOto());
		soapModel.setNgayCapGpkdVanTaiBangOto(model.getNgayCapGpkdVanTaiBangOto());
		soapModel.setCoQuanCapGpkdVanTaiBangOto(model.getCoQuanCapGpkdVanTaiBangOto());
		soapModel.setMaSoCongDan(model.getMaSoCongDan());
		soapModel.setTenCongDan(model.getTenCongDan());
		soapModel.setQuocTich(model.getQuocTich());
		soapModel.setGioiTinh(model.getGioiTinh());
		soapModel.setNgayCapCMND(model.getNgayCapCMND());
		soapModel.setNoiCapCMND(model.getNoiCapCMND());
		soapModel.setLoaiNguoiLamThuTuc(model.getLoaiNguoiLamThuTuc());
		soapModel.setNamSinh(model.getNamSinh());
		soapModel.setNgaySinh(model.getNgaySinh());

		return soapModel;
	}

	public static DnDoanhNghiepSoap[] toSoapModels(DnDoanhNghiep[] models) {
		DnDoanhNghiepSoap[] soapModels = new DnDoanhNghiepSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DnDoanhNghiepSoap[][] toSoapModels(DnDoanhNghiep[][] models) {
		DnDoanhNghiepSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DnDoanhNghiepSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DnDoanhNghiepSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DnDoanhNghiepSoap[] toSoapModels(List<DnDoanhNghiep> models) {
		List<DnDoanhNghiepSoap> soapModels = new ArrayList<DnDoanhNghiepSoap>(models.size());

		for (DnDoanhNghiep model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DnDoanhNghiepSoap[soapModels.size()]);
	}

	public DnDoanhNghiepSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getMaSoDoanhNghiep() {
		return _maSoDoanhNghiep;
	}

	public void setMaSoDoanhNghiep(String maSoDoanhNghiep) {
		_maSoDoanhNghiep = maSoDoanhNghiep;
	}

	public String getTenDoanhNghiep() {
		return _tenDoanhNghiep;
	}

	public void setTenDoanhNghiep(String tenDoanhNghiep) {
		_tenDoanhNghiep = tenDoanhNghiep;
	}

	public String getDiaChi() {
		return _diaChi;
	}

	public void setDiaChi(String diaChi) {
		_diaChi = diaChi;
	}

	public String getMaTinhThanh() {
		return _maTinhThanh;
	}

	public void setMaTinhThanh(String maTinhThanh) {
		_maTinhThanh = maTinhThanh;
	}

	public String getMaQuanHuyen() {
		return _maQuanHuyen;
	}

	public void setMaQuanHuyen(String maQuanHuyen) {
		_maQuanHuyen = maQuanHuyen;
	}

	public String getMaPhuongXa() {
		return _maPhuongXa;
	}

	public void setMaPhuongXa(String maPhuongXa) {
		_maPhuongXa = maPhuongXa;
	}

	public String getDienThoai() {
		return _dienThoai;
	}

	public void setDienThoai(String dienThoai) {
		_dienThoai = dienThoai;
	}

	public String getWebsite() {
		return _website;
	}

	public void setWebsite(String website) {
		_website = website;
	}

	public String getFax() {
		return _fax;
	}

	public void setFax(String fax) {
		_fax = fax;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public long getMaster() {
		return _master;
	}

	public void setMaster(long master) {
		_master = master;
	}

	public Date getNgayDangKi() {
		return _ngayDangKi;
	}

	public void setNgayDangKi(Date ngayDangKi) {
		_ngayDangKi = ngayDangKi;
	}

	public String getHangTaiKhoan() {
		return _hangTaiKhoan;
	}

	public void setHangTaiKhoan(String hangTaiKhoan) {
		_hangTaiKhoan = hangTaiKhoan;
	}

	public String getMaKichHoat() {
		return _maKichHoat;
	}

	public void setMaKichHoat(String maKichHoat) {
		_maKichHoat = maKichHoat;
	}

	public Date getNgayKichHoat() {
		return _ngayKichHoat;
	}

	public void setNgayKichHoat(Date ngayKichHoat) {
		_ngayKichHoat = ngayKichHoat;
	}

	public String getSoDangKyKinhDoanh() {
		return _soDangKyKinhDoanh;
	}

	public void setSoDangKyKinhDoanh(String soDangKyKinhDoanh) {
		_soDangKyKinhDoanh = soDangKyKinhDoanh;
	}

	public Date getNgayCapDkKd() {
		return _ngayCapDkKd;
	}

	public void setNgayCapDkKd(Date ngayCapDkKd) {
		_ngayCapDkKd = ngayCapDkKd;
	}

	public Date getNgayHetHanDKKD() {
		return _ngayHetHanDKKD;
	}

	public void setNgayHetHanDKKD(Date ngayHetHanDKKD) {
		_ngayHetHanDKKD = ngayHetHanDKKD;
	}

	public String getCoQuanCapDkKd() {
		return _coQuanCapDkKd;
	}

	public void setCoQuanCapDkKd(String coQuanCapDkKd) {
		_coQuanCapDkKd = coQuanCapDkKd;
	}

	public String getLoaiDoanhNghiep() {
		return _loaiDoanhNghiep;
	}

	public void setLoaiDoanhNghiep(String loaiDoanhNghiep) {
		_loaiDoanhNghiep = loaiDoanhNghiep;
	}

	public String getNguoiDaiDien() {
		return _nguoiDaiDien;
	}

	public void setNguoiDaiDien(String nguoiDaiDien) {
		_nguoiDaiDien = nguoiDaiDien;
	}

	public String getSoDienThoaiNguoiDaiDien() {
		return _soDienThoaiNguoiDaiDien;
	}

	public void setSoDienThoaiNguoiDaiDien(String soDienThoaiNguoiDaiDien) {
		_soDienThoaiNguoiDaiDien = soDienThoaiNguoiDaiDien;
	}

	public String getChucVuNguoiDaiDien() {
		return _chucVuNguoiDaiDien;
	}

	public void setChucVuNguoiDaiDien(String chucVuNguoiDaiDien) {
		_chucVuNguoiDaiDien = chucVuNguoiDaiDien;
	}

	public String getTenTiengAnh() {
		return _tenTiengAnh;
	}

	public void setTenTiengAnh(String tenTiengAnh) {
		_tenTiengAnh = tenTiengAnh;
	}

	public String getTenVietTat() {
		return _tenVietTat;
	}

	public void setTenVietTat(String tenVietTat) {
		_tenVietTat = tenVietTat;
	}

	public String getSoGpkdVanTaiBangOto() {
		return _soGpkdVanTaiBangOto;
	}

	public void setSoGpkdVanTaiBangOto(String soGpkdVanTaiBangOto) {
		_soGpkdVanTaiBangOto = soGpkdVanTaiBangOto;
	}

	public Date getNgayCapGpkdVanTaiBangOto() {
		return _ngayCapGpkdVanTaiBangOto;
	}

	public void setNgayCapGpkdVanTaiBangOto(Date ngayCapGpkdVanTaiBangOto) {
		_ngayCapGpkdVanTaiBangOto = ngayCapGpkdVanTaiBangOto;
	}

	public String getCoQuanCapGpkdVanTaiBangOto() {
		return _coQuanCapGpkdVanTaiBangOto;
	}

	public void setCoQuanCapGpkdVanTaiBangOto(String coQuanCapGpkdVanTaiBangOto) {
		_coQuanCapGpkdVanTaiBangOto = coQuanCapGpkdVanTaiBangOto;
	}

	public String getMaSoCongDan() {
		return _maSoCongDan;
	}

	public void setMaSoCongDan(String maSoCongDan) {
		_maSoCongDan = maSoCongDan;
	}

	public String getTenCongDan() {
		return _tenCongDan;
	}

	public void setTenCongDan(String tenCongDan) {
		_tenCongDan = tenCongDan;
	}

	public String getQuocTich() {
		return _quocTich;
	}

	public void setQuocTich(String quocTich) {
		_quocTich = quocTich;
	}

	public String getGioiTinh() {
		return _gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		_gioiTinh = gioiTinh;
	}

	public Date getNgayCapCMND() {
		return _ngayCapCMND;
	}

	public void setNgayCapCMND(Date ngayCapCMND) {
		_ngayCapCMND = ngayCapCMND;
	}

	public String getNoiCapCMND() {
		return _noiCapCMND;
	}

	public void setNoiCapCMND(String noiCapCMND) {
		_noiCapCMND = noiCapCMND;
	}

	public String getLoaiNguoiLamThuTuc() {
		return _loaiNguoiLamThuTuc;
	}

	public void setLoaiNguoiLamThuTuc(String loaiNguoiLamThuTuc) {
		_loaiNguoiLamThuTuc = loaiNguoiLamThuTuc;
	}

	public String getNamSinh() {
		return _namSinh;
	}

	public void setNamSinh(String namSinh) {
		_namSinh = namSinh;
	}

	public Date getNgaySinh() {
		return _ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		_ngaySinh = ngaySinh;
	}

	private long _id;
	private String _maSoDoanhNghiep;
	private String _tenDoanhNghiep;
	private String _diaChi;
	private String _maTinhThanh;
	private String _maQuanHuyen;
	private String _maPhuongXa;
	private String _dienThoai;
	private String _website;
	private String _fax;
	private String _email;
	private long _master;
	private Date _ngayDangKi;
	private String _hangTaiKhoan;
	private String _maKichHoat;
	private Date _ngayKichHoat;
	private String _soDangKyKinhDoanh;
	private Date _ngayCapDkKd;
	private Date _ngayHetHanDKKD;
	private String _coQuanCapDkKd;
	private String _loaiDoanhNghiep;
	private String _nguoiDaiDien;
	private String _soDienThoaiNguoiDaiDien;
	private String _chucVuNguoiDaiDien;
	private String _tenTiengAnh;
	private String _tenVietTat;
	private String _soGpkdVanTaiBangOto;
	private Date _ngayCapGpkdVanTaiBangOto;
	private String _coQuanCapGpkdVanTaiBangOto;
	private String _maSoCongDan;
	private String _tenCongDan;
	private String _quocTich;
	private String _gioiTinh;
	private Date _ngayCapCMND;
	private String _noiCapCMND;
	private String _loaiNguoiLamThuTuc;
	private String _namSinh;
	private Date _ngaySinh;
}