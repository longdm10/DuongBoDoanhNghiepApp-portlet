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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DnDoanhNghiep}.
 * </p>
 *
 * @author win_64
 * @see DnDoanhNghiep
 * @generated
 */
public class DnDoanhNghiepWrapper implements DnDoanhNghiep,
	ModelWrapper<DnDoanhNghiep> {
	public DnDoanhNghiepWrapper(DnDoanhNghiep dnDoanhNghiep) {
		_dnDoanhNghiep = dnDoanhNghiep;
	}

	@Override
	public Class<?> getModelClass() {
		return DnDoanhNghiep.class;
	}

	@Override
	public String getModelClassName() {
		return DnDoanhNghiep.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("maSoDoanhNghiep", getMaSoDoanhNghiep());
		attributes.put("tenDoanhNghiep", getTenDoanhNghiep());
		attributes.put("diaChi", getDiaChi());
		attributes.put("maTinhThanh", getMaTinhThanh());
		attributes.put("maQuanHuyen", getMaQuanHuyen());
		attributes.put("maPhuongXa", getMaPhuongXa());
		attributes.put("dienThoai", getDienThoai());
		attributes.put("website", getWebsite());
		attributes.put("fax", getFax());
		attributes.put("email", getEmail());
		attributes.put("master", getMaster());
		attributes.put("ngayDangKi", getNgayDangKi());
		attributes.put("hangTaiKhoan", getHangTaiKhoan());
		attributes.put("maKichHoat", getMaKichHoat());
		attributes.put("ngayKichHoat", getNgayKichHoat());
		attributes.put("soDangKyKinhDoanh", getSoDangKyKinhDoanh());
		attributes.put("ngayCapDkKd", getNgayCapDkKd());
		attributes.put("ngayHetHanDKKD", getNgayHetHanDKKD());
		attributes.put("coQuanCapDkKd", getCoQuanCapDkKd());
		attributes.put("loaiDoanhNghiep", getLoaiDoanhNghiep());
		attributes.put("nguoiDaiDien", getNguoiDaiDien());
		attributes.put("soDienThoaiNguoiDaiDien", getSoDienThoaiNguoiDaiDien());
		attributes.put("chucVuNguoiDaiDien", getChucVuNguoiDaiDien());
		attributes.put("tenTiengAnh", getTenTiengAnh());
		attributes.put("tenVietTat", getTenVietTat());
		attributes.put("soGpkdVanTaiBangOto", getSoGpkdVanTaiBangOto());
		attributes.put("ngayCapGpkdVanTaiBangOto", getNgayCapGpkdVanTaiBangOto());
		attributes.put("coQuanCapGpkdVanTaiBangOto",
			getCoQuanCapGpkdVanTaiBangOto());
		attributes.put("maSoCongDan", getMaSoCongDan());
		attributes.put("tenCongDan", getTenCongDan());
		attributes.put("quocTich", getQuocTich());
		attributes.put("gioiTinh", getGioiTinh());
		attributes.put("ngayCapCMND", getNgayCapCMND());
		attributes.put("noiCapCMND", getNoiCapCMND());
		attributes.put("loaiNguoiLamThuTuc", getLoaiNguoiLamThuTuc());
		attributes.put("namSinh", getNamSinh());
		attributes.put("ngaySinh", getNgaySinh());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String maSoDoanhNghiep = (String)attributes.get("maSoDoanhNghiep");

		if (maSoDoanhNghiep != null) {
			setMaSoDoanhNghiep(maSoDoanhNghiep);
		}

		String tenDoanhNghiep = (String)attributes.get("tenDoanhNghiep");

		if (tenDoanhNghiep != null) {
			setTenDoanhNghiep(tenDoanhNghiep);
		}

		String diaChi = (String)attributes.get("diaChi");

		if (diaChi != null) {
			setDiaChi(diaChi);
		}

		String maTinhThanh = (String)attributes.get("maTinhThanh");

		if (maTinhThanh != null) {
			setMaTinhThanh(maTinhThanh);
		}

		String maQuanHuyen = (String)attributes.get("maQuanHuyen");

		if (maQuanHuyen != null) {
			setMaQuanHuyen(maQuanHuyen);
		}

		String maPhuongXa = (String)attributes.get("maPhuongXa");

		if (maPhuongXa != null) {
			setMaPhuongXa(maPhuongXa);
		}

		String dienThoai = (String)attributes.get("dienThoai");

		if (dienThoai != null) {
			setDienThoai(dienThoai);
		}

		String website = (String)attributes.get("website");

		if (website != null) {
			setWebsite(website);
		}

		String fax = (String)attributes.get("fax");

		if (fax != null) {
			setFax(fax);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		Long master = (Long)attributes.get("master");

		if (master != null) {
			setMaster(master);
		}

		Date ngayDangKi = (Date)attributes.get("ngayDangKi");

		if (ngayDangKi != null) {
			setNgayDangKi(ngayDangKi);
		}

		String hangTaiKhoan = (String)attributes.get("hangTaiKhoan");

		if (hangTaiKhoan != null) {
			setHangTaiKhoan(hangTaiKhoan);
		}

		String maKichHoat = (String)attributes.get("maKichHoat");

		if (maKichHoat != null) {
			setMaKichHoat(maKichHoat);
		}

		Date ngayKichHoat = (Date)attributes.get("ngayKichHoat");

		if (ngayKichHoat != null) {
			setNgayKichHoat(ngayKichHoat);
		}

		String soDangKyKinhDoanh = (String)attributes.get("soDangKyKinhDoanh");

		if (soDangKyKinhDoanh != null) {
			setSoDangKyKinhDoanh(soDangKyKinhDoanh);
		}

		Date ngayCapDkKd = (Date)attributes.get("ngayCapDkKd");

		if (ngayCapDkKd != null) {
			setNgayCapDkKd(ngayCapDkKd);
		}

		Date ngayHetHanDKKD = (Date)attributes.get("ngayHetHanDKKD");

		if (ngayHetHanDKKD != null) {
			setNgayHetHanDKKD(ngayHetHanDKKD);
		}

		String coQuanCapDkKd = (String)attributes.get("coQuanCapDkKd");

		if (coQuanCapDkKd != null) {
			setCoQuanCapDkKd(coQuanCapDkKd);
		}

		String loaiDoanhNghiep = (String)attributes.get("loaiDoanhNghiep");

		if (loaiDoanhNghiep != null) {
			setLoaiDoanhNghiep(loaiDoanhNghiep);
		}

		String nguoiDaiDien = (String)attributes.get("nguoiDaiDien");

		if (nguoiDaiDien != null) {
			setNguoiDaiDien(nguoiDaiDien);
		}

		String soDienThoaiNguoiDaiDien = (String)attributes.get(
				"soDienThoaiNguoiDaiDien");

		if (soDienThoaiNguoiDaiDien != null) {
			setSoDienThoaiNguoiDaiDien(soDienThoaiNguoiDaiDien);
		}

		String chucVuNguoiDaiDien = (String)attributes.get("chucVuNguoiDaiDien");

		if (chucVuNguoiDaiDien != null) {
			setChucVuNguoiDaiDien(chucVuNguoiDaiDien);
		}

		String tenTiengAnh = (String)attributes.get("tenTiengAnh");

		if (tenTiengAnh != null) {
			setTenTiengAnh(tenTiengAnh);
		}

		String tenVietTat = (String)attributes.get("tenVietTat");

		if (tenVietTat != null) {
			setTenVietTat(tenVietTat);
		}

		String soGpkdVanTaiBangOto = (String)attributes.get(
				"soGpkdVanTaiBangOto");

		if (soGpkdVanTaiBangOto != null) {
			setSoGpkdVanTaiBangOto(soGpkdVanTaiBangOto);
		}

		Date ngayCapGpkdVanTaiBangOto = (Date)attributes.get(
				"ngayCapGpkdVanTaiBangOto");

		if (ngayCapGpkdVanTaiBangOto != null) {
			setNgayCapGpkdVanTaiBangOto(ngayCapGpkdVanTaiBangOto);
		}

		String coQuanCapGpkdVanTaiBangOto = (String)attributes.get(
				"coQuanCapGpkdVanTaiBangOto");

		if (coQuanCapGpkdVanTaiBangOto != null) {
			setCoQuanCapGpkdVanTaiBangOto(coQuanCapGpkdVanTaiBangOto);
		}

		String maSoCongDan = (String)attributes.get("maSoCongDan");

		if (maSoCongDan != null) {
			setMaSoCongDan(maSoCongDan);
		}

		String tenCongDan = (String)attributes.get("tenCongDan");

		if (tenCongDan != null) {
			setTenCongDan(tenCongDan);
		}

		String quocTich = (String)attributes.get("quocTich");

		if (quocTich != null) {
			setQuocTich(quocTich);
		}

		String gioiTinh = (String)attributes.get("gioiTinh");

		if (gioiTinh != null) {
			setGioiTinh(gioiTinh);
		}

		Date ngayCapCMND = (Date)attributes.get("ngayCapCMND");

		if (ngayCapCMND != null) {
			setNgayCapCMND(ngayCapCMND);
		}

		String noiCapCMND = (String)attributes.get("noiCapCMND");

		if (noiCapCMND != null) {
			setNoiCapCMND(noiCapCMND);
		}

		String loaiNguoiLamThuTuc = (String)attributes.get("loaiNguoiLamThuTuc");

		if (loaiNguoiLamThuTuc != null) {
			setLoaiNguoiLamThuTuc(loaiNguoiLamThuTuc);
		}

		String namSinh = (String)attributes.get("namSinh");

		if (namSinh != null) {
			setNamSinh(namSinh);
		}

		Date ngaySinh = (Date)attributes.get("ngaySinh");

		if (ngaySinh != null) {
			setNgaySinh(ngaySinh);
		}
	}

	/**
	* Returns the primary key of this dn doanh nghiep.
	*
	* @return the primary key of this dn doanh nghiep
	*/
	@Override
	public long getPrimaryKey() {
		return _dnDoanhNghiep.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dn doanh nghiep.
	*
	* @param primaryKey the primary key of this dn doanh nghiep
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dnDoanhNghiep.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dn doanh nghiep.
	*
	* @return the ID of this dn doanh nghiep
	*/
	@Override
	public long getId() {
		return _dnDoanhNghiep.getId();
	}

	/**
	* Sets the ID of this dn doanh nghiep.
	*
	* @param id the ID of this dn doanh nghiep
	*/
	@Override
	public void setId(long id) {
		_dnDoanhNghiep.setId(id);
	}

	/**
	* Returns the ma so doanh nghiep of this dn doanh nghiep.
	*
	* @return the ma so doanh nghiep of this dn doanh nghiep
	*/
	@Override
	public java.lang.String getMaSoDoanhNghiep() {
		return _dnDoanhNghiep.getMaSoDoanhNghiep();
	}

	/**
	* Sets the ma so doanh nghiep of this dn doanh nghiep.
	*
	* @param maSoDoanhNghiep the ma so doanh nghiep of this dn doanh nghiep
	*/
	@Override
	public void setMaSoDoanhNghiep(java.lang.String maSoDoanhNghiep) {
		_dnDoanhNghiep.setMaSoDoanhNghiep(maSoDoanhNghiep);
	}

	/**
	* Returns the ten doanh nghiep of this dn doanh nghiep.
	*
	* @return the ten doanh nghiep of this dn doanh nghiep
	*/
	@Override
	public java.lang.String getTenDoanhNghiep() {
		return _dnDoanhNghiep.getTenDoanhNghiep();
	}

	/**
	* Sets the ten doanh nghiep of this dn doanh nghiep.
	*
	* @param tenDoanhNghiep the ten doanh nghiep of this dn doanh nghiep
	*/
	@Override
	public void setTenDoanhNghiep(java.lang.String tenDoanhNghiep) {
		_dnDoanhNghiep.setTenDoanhNghiep(tenDoanhNghiep);
	}

	/**
	* Returns the dia chi of this dn doanh nghiep.
	*
	* @return the dia chi of this dn doanh nghiep
	*/
	@Override
	public java.lang.String getDiaChi() {
		return _dnDoanhNghiep.getDiaChi();
	}

	/**
	* Sets the dia chi of this dn doanh nghiep.
	*
	* @param diaChi the dia chi of this dn doanh nghiep
	*/
	@Override
	public void setDiaChi(java.lang.String diaChi) {
		_dnDoanhNghiep.setDiaChi(diaChi);
	}

	/**
	* Returns the ma tinh thanh of this dn doanh nghiep.
	*
	* @return the ma tinh thanh of this dn doanh nghiep
	*/
	@Override
	public java.lang.String getMaTinhThanh() {
		return _dnDoanhNghiep.getMaTinhThanh();
	}

	/**
	* Sets the ma tinh thanh of this dn doanh nghiep.
	*
	* @param maTinhThanh the ma tinh thanh of this dn doanh nghiep
	*/
	@Override
	public void setMaTinhThanh(java.lang.String maTinhThanh) {
		_dnDoanhNghiep.setMaTinhThanh(maTinhThanh);
	}

	/**
	* Returns the ma quan huyen of this dn doanh nghiep.
	*
	* @return the ma quan huyen of this dn doanh nghiep
	*/
	@Override
	public java.lang.String getMaQuanHuyen() {
		return _dnDoanhNghiep.getMaQuanHuyen();
	}

	/**
	* Sets the ma quan huyen of this dn doanh nghiep.
	*
	* @param maQuanHuyen the ma quan huyen of this dn doanh nghiep
	*/
	@Override
	public void setMaQuanHuyen(java.lang.String maQuanHuyen) {
		_dnDoanhNghiep.setMaQuanHuyen(maQuanHuyen);
	}

	/**
	* Returns the ma phuong xa of this dn doanh nghiep.
	*
	* @return the ma phuong xa of this dn doanh nghiep
	*/
	@Override
	public java.lang.String getMaPhuongXa() {
		return _dnDoanhNghiep.getMaPhuongXa();
	}

	/**
	* Sets the ma phuong xa of this dn doanh nghiep.
	*
	* @param maPhuongXa the ma phuong xa of this dn doanh nghiep
	*/
	@Override
	public void setMaPhuongXa(java.lang.String maPhuongXa) {
		_dnDoanhNghiep.setMaPhuongXa(maPhuongXa);
	}

	/**
	* Returns the dien thoai of this dn doanh nghiep.
	*
	* @return the dien thoai of this dn doanh nghiep
	*/
	@Override
	public java.lang.String getDienThoai() {
		return _dnDoanhNghiep.getDienThoai();
	}

	/**
	* Sets the dien thoai of this dn doanh nghiep.
	*
	* @param dienThoai the dien thoai of this dn doanh nghiep
	*/
	@Override
	public void setDienThoai(java.lang.String dienThoai) {
		_dnDoanhNghiep.setDienThoai(dienThoai);
	}

	/**
	* Returns the website of this dn doanh nghiep.
	*
	* @return the website of this dn doanh nghiep
	*/
	@Override
	public java.lang.String getWebsite() {
		return _dnDoanhNghiep.getWebsite();
	}

	/**
	* Sets the website of this dn doanh nghiep.
	*
	* @param website the website of this dn doanh nghiep
	*/
	@Override
	public void setWebsite(java.lang.String website) {
		_dnDoanhNghiep.setWebsite(website);
	}

	/**
	* Returns the fax of this dn doanh nghiep.
	*
	* @return the fax of this dn doanh nghiep
	*/
	@Override
	public java.lang.String getFax() {
		return _dnDoanhNghiep.getFax();
	}

	/**
	* Sets the fax of this dn doanh nghiep.
	*
	* @param fax the fax of this dn doanh nghiep
	*/
	@Override
	public void setFax(java.lang.String fax) {
		_dnDoanhNghiep.setFax(fax);
	}

	/**
	* Returns the email of this dn doanh nghiep.
	*
	* @return the email of this dn doanh nghiep
	*/
	@Override
	public java.lang.String getEmail() {
		return _dnDoanhNghiep.getEmail();
	}

	/**
	* Sets the email of this dn doanh nghiep.
	*
	* @param email the email of this dn doanh nghiep
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_dnDoanhNghiep.setEmail(email);
	}

	/**
	* Returns the master of this dn doanh nghiep.
	*
	* @return the master of this dn doanh nghiep
	*/
	@Override
	public long getMaster() {
		return _dnDoanhNghiep.getMaster();
	}

	/**
	* Sets the master of this dn doanh nghiep.
	*
	* @param master the master of this dn doanh nghiep
	*/
	@Override
	public void setMaster(long master) {
		_dnDoanhNghiep.setMaster(master);
	}

	/**
	* Returns the ngay dang ki of this dn doanh nghiep.
	*
	* @return the ngay dang ki of this dn doanh nghiep
	*/
	@Override
	public java.util.Date getNgayDangKi() {
		return _dnDoanhNghiep.getNgayDangKi();
	}

	/**
	* Sets the ngay dang ki of this dn doanh nghiep.
	*
	* @param ngayDangKi the ngay dang ki of this dn doanh nghiep
	*/
	@Override
	public void setNgayDangKi(java.util.Date ngayDangKi) {
		_dnDoanhNghiep.setNgayDangKi(ngayDangKi);
	}

	/**
	* Returns the hang tai khoan of this dn doanh nghiep.
	*
	* @return the hang tai khoan of this dn doanh nghiep
	*/
	@Override
	public java.lang.String getHangTaiKhoan() {
		return _dnDoanhNghiep.getHangTaiKhoan();
	}

	/**
	* Sets the hang tai khoan of this dn doanh nghiep.
	*
	* @param hangTaiKhoan the hang tai khoan of this dn doanh nghiep
	*/
	@Override
	public void setHangTaiKhoan(java.lang.String hangTaiKhoan) {
		_dnDoanhNghiep.setHangTaiKhoan(hangTaiKhoan);
	}

	/**
	* Returns the ma kich hoat of this dn doanh nghiep.
	*
	* @return the ma kich hoat of this dn doanh nghiep
	*/
	@Override
	public java.lang.String getMaKichHoat() {
		return _dnDoanhNghiep.getMaKichHoat();
	}

	/**
	* Sets the ma kich hoat of this dn doanh nghiep.
	*
	* @param maKichHoat the ma kich hoat of this dn doanh nghiep
	*/
	@Override
	public void setMaKichHoat(java.lang.String maKichHoat) {
		_dnDoanhNghiep.setMaKichHoat(maKichHoat);
	}

	/**
	* Returns the ngay kich hoat of this dn doanh nghiep.
	*
	* @return the ngay kich hoat of this dn doanh nghiep
	*/
	@Override
	public java.util.Date getNgayKichHoat() {
		return _dnDoanhNghiep.getNgayKichHoat();
	}

	/**
	* Sets the ngay kich hoat of this dn doanh nghiep.
	*
	* @param ngayKichHoat the ngay kich hoat of this dn doanh nghiep
	*/
	@Override
	public void setNgayKichHoat(java.util.Date ngayKichHoat) {
		_dnDoanhNghiep.setNgayKichHoat(ngayKichHoat);
	}

	/**
	* Returns the so dang ky kinh doanh of this dn doanh nghiep.
	*
	* @return the so dang ky kinh doanh of this dn doanh nghiep
	*/
	@Override
	public java.lang.String getSoDangKyKinhDoanh() {
		return _dnDoanhNghiep.getSoDangKyKinhDoanh();
	}

	/**
	* Sets the so dang ky kinh doanh of this dn doanh nghiep.
	*
	* @param soDangKyKinhDoanh the so dang ky kinh doanh of this dn doanh nghiep
	*/
	@Override
	public void setSoDangKyKinhDoanh(java.lang.String soDangKyKinhDoanh) {
		_dnDoanhNghiep.setSoDangKyKinhDoanh(soDangKyKinhDoanh);
	}

	/**
	* Returns the ngay cap dk kd of this dn doanh nghiep.
	*
	* @return the ngay cap dk kd of this dn doanh nghiep
	*/
	@Override
	public java.util.Date getNgayCapDkKd() {
		return _dnDoanhNghiep.getNgayCapDkKd();
	}

	/**
	* Sets the ngay cap dk kd of this dn doanh nghiep.
	*
	* @param ngayCapDkKd the ngay cap dk kd of this dn doanh nghiep
	*/
	@Override
	public void setNgayCapDkKd(java.util.Date ngayCapDkKd) {
		_dnDoanhNghiep.setNgayCapDkKd(ngayCapDkKd);
	}

	/**
	* Returns the ngay het han d k k d of this dn doanh nghiep.
	*
	* @return the ngay het han d k k d of this dn doanh nghiep
	*/
	@Override
	public java.util.Date getNgayHetHanDKKD() {
		return _dnDoanhNghiep.getNgayHetHanDKKD();
	}

	/**
	* Sets the ngay het han d k k d of this dn doanh nghiep.
	*
	* @param ngayHetHanDKKD the ngay het han d k k d of this dn doanh nghiep
	*/
	@Override
	public void setNgayHetHanDKKD(java.util.Date ngayHetHanDKKD) {
		_dnDoanhNghiep.setNgayHetHanDKKD(ngayHetHanDKKD);
	}

	/**
	* Returns the co quan cap dk kd of this dn doanh nghiep.
	*
	* @return the co quan cap dk kd of this dn doanh nghiep
	*/
	@Override
	public java.lang.String getCoQuanCapDkKd() {
		return _dnDoanhNghiep.getCoQuanCapDkKd();
	}

	/**
	* Sets the co quan cap dk kd of this dn doanh nghiep.
	*
	* @param coQuanCapDkKd the co quan cap dk kd of this dn doanh nghiep
	*/
	@Override
	public void setCoQuanCapDkKd(java.lang.String coQuanCapDkKd) {
		_dnDoanhNghiep.setCoQuanCapDkKd(coQuanCapDkKd);
	}

	/**
	* Returns the loai doanh nghiep of this dn doanh nghiep.
	*
	* @return the loai doanh nghiep of this dn doanh nghiep
	*/
	@Override
	public java.lang.String getLoaiDoanhNghiep() {
		return _dnDoanhNghiep.getLoaiDoanhNghiep();
	}

	/**
	* Sets the loai doanh nghiep of this dn doanh nghiep.
	*
	* @param loaiDoanhNghiep the loai doanh nghiep of this dn doanh nghiep
	*/
	@Override
	public void setLoaiDoanhNghiep(java.lang.String loaiDoanhNghiep) {
		_dnDoanhNghiep.setLoaiDoanhNghiep(loaiDoanhNghiep);
	}

	/**
	* Returns the nguoi dai dien of this dn doanh nghiep.
	*
	* @return the nguoi dai dien of this dn doanh nghiep
	*/
	@Override
	public java.lang.String getNguoiDaiDien() {
		return _dnDoanhNghiep.getNguoiDaiDien();
	}

	/**
	* Sets the nguoi dai dien of this dn doanh nghiep.
	*
	* @param nguoiDaiDien the nguoi dai dien of this dn doanh nghiep
	*/
	@Override
	public void setNguoiDaiDien(java.lang.String nguoiDaiDien) {
		_dnDoanhNghiep.setNguoiDaiDien(nguoiDaiDien);
	}

	/**
	* Returns the so dien thoai nguoi dai dien of this dn doanh nghiep.
	*
	* @return the so dien thoai nguoi dai dien of this dn doanh nghiep
	*/
	@Override
	public java.lang.String getSoDienThoaiNguoiDaiDien() {
		return _dnDoanhNghiep.getSoDienThoaiNguoiDaiDien();
	}

	/**
	* Sets the so dien thoai nguoi dai dien of this dn doanh nghiep.
	*
	* @param soDienThoaiNguoiDaiDien the so dien thoai nguoi dai dien of this dn doanh nghiep
	*/
	@Override
	public void setSoDienThoaiNguoiDaiDien(
		java.lang.String soDienThoaiNguoiDaiDien) {
		_dnDoanhNghiep.setSoDienThoaiNguoiDaiDien(soDienThoaiNguoiDaiDien);
	}

	/**
	* Returns the chuc vu nguoi dai dien of this dn doanh nghiep.
	*
	* @return the chuc vu nguoi dai dien of this dn doanh nghiep
	*/
	@Override
	public java.lang.String getChucVuNguoiDaiDien() {
		return _dnDoanhNghiep.getChucVuNguoiDaiDien();
	}

	/**
	* Sets the chuc vu nguoi dai dien of this dn doanh nghiep.
	*
	* @param chucVuNguoiDaiDien the chuc vu nguoi dai dien of this dn doanh nghiep
	*/
	@Override
	public void setChucVuNguoiDaiDien(java.lang.String chucVuNguoiDaiDien) {
		_dnDoanhNghiep.setChucVuNguoiDaiDien(chucVuNguoiDaiDien);
	}

	/**
	* Returns the ten tieng anh of this dn doanh nghiep.
	*
	* @return the ten tieng anh of this dn doanh nghiep
	*/
	@Override
	public java.lang.String getTenTiengAnh() {
		return _dnDoanhNghiep.getTenTiengAnh();
	}

	/**
	* Sets the ten tieng anh of this dn doanh nghiep.
	*
	* @param tenTiengAnh the ten tieng anh of this dn doanh nghiep
	*/
	@Override
	public void setTenTiengAnh(java.lang.String tenTiengAnh) {
		_dnDoanhNghiep.setTenTiengAnh(tenTiengAnh);
	}

	/**
	* Returns the ten viet tat of this dn doanh nghiep.
	*
	* @return the ten viet tat of this dn doanh nghiep
	*/
	@Override
	public java.lang.String getTenVietTat() {
		return _dnDoanhNghiep.getTenVietTat();
	}

	/**
	* Sets the ten viet tat of this dn doanh nghiep.
	*
	* @param tenVietTat the ten viet tat of this dn doanh nghiep
	*/
	@Override
	public void setTenVietTat(java.lang.String tenVietTat) {
		_dnDoanhNghiep.setTenVietTat(tenVietTat);
	}

	/**
	* Returns the so gpkd van tai bang oto of this dn doanh nghiep.
	*
	* @return the so gpkd van tai bang oto of this dn doanh nghiep
	*/
	@Override
	public java.lang.String getSoGpkdVanTaiBangOto() {
		return _dnDoanhNghiep.getSoGpkdVanTaiBangOto();
	}

	/**
	* Sets the so gpkd van tai bang oto of this dn doanh nghiep.
	*
	* @param soGpkdVanTaiBangOto the so gpkd van tai bang oto of this dn doanh nghiep
	*/
	@Override
	public void setSoGpkdVanTaiBangOto(java.lang.String soGpkdVanTaiBangOto) {
		_dnDoanhNghiep.setSoGpkdVanTaiBangOto(soGpkdVanTaiBangOto);
	}

	/**
	* Returns the ngay cap gpkd van tai bang oto of this dn doanh nghiep.
	*
	* @return the ngay cap gpkd van tai bang oto of this dn doanh nghiep
	*/
	@Override
	public java.util.Date getNgayCapGpkdVanTaiBangOto() {
		return _dnDoanhNghiep.getNgayCapGpkdVanTaiBangOto();
	}

	/**
	* Sets the ngay cap gpkd van tai bang oto of this dn doanh nghiep.
	*
	* @param ngayCapGpkdVanTaiBangOto the ngay cap gpkd van tai bang oto of this dn doanh nghiep
	*/
	@Override
	public void setNgayCapGpkdVanTaiBangOto(
		java.util.Date ngayCapGpkdVanTaiBangOto) {
		_dnDoanhNghiep.setNgayCapGpkdVanTaiBangOto(ngayCapGpkdVanTaiBangOto);
	}

	/**
	* Returns the co quan cap gpkd van tai bang oto of this dn doanh nghiep.
	*
	* @return the co quan cap gpkd van tai bang oto of this dn doanh nghiep
	*/
	@Override
	public java.lang.String getCoQuanCapGpkdVanTaiBangOto() {
		return _dnDoanhNghiep.getCoQuanCapGpkdVanTaiBangOto();
	}

	/**
	* Sets the co quan cap gpkd van tai bang oto of this dn doanh nghiep.
	*
	* @param coQuanCapGpkdVanTaiBangOto the co quan cap gpkd van tai bang oto of this dn doanh nghiep
	*/
	@Override
	public void setCoQuanCapGpkdVanTaiBangOto(
		java.lang.String coQuanCapGpkdVanTaiBangOto) {
		_dnDoanhNghiep.setCoQuanCapGpkdVanTaiBangOto(coQuanCapGpkdVanTaiBangOto);
	}

	/**
	* Returns the ma so cong dan of this dn doanh nghiep.
	*
	* @return the ma so cong dan of this dn doanh nghiep
	*/
	@Override
	public java.lang.String getMaSoCongDan() {
		return _dnDoanhNghiep.getMaSoCongDan();
	}

	/**
	* Sets the ma so cong dan of this dn doanh nghiep.
	*
	* @param maSoCongDan the ma so cong dan of this dn doanh nghiep
	*/
	@Override
	public void setMaSoCongDan(java.lang.String maSoCongDan) {
		_dnDoanhNghiep.setMaSoCongDan(maSoCongDan);
	}

	/**
	* Returns the ten cong dan of this dn doanh nghiep.
	*
	* @return the ten cong dan of this dn doanh nghiep
	*/
	@Override
	public java.lang.String getTenCongDan() {
		return _dnDoanhNghiep.getTenCongDan();
	}

	/**
	* Sets the ten cong dan of this dn doanh nghiep.
	*
	* @param tenCongDan the ten cong dan of this dn doanh nghiep
	*/
	@Override
	public void setTenCongDan(java.lang.String tenCongDan) {
		_dnDoanhNghiep.setTenCongDan(tenCongDan);
	}

	/**
	* Returns the quoc tich of this dn doanh nghiep.
	*
	* @return the quoc tich of this dn doanh nghiep
	*/
	@Override
	public java.lang.String getQuocTich() {
		return _dnDoanhNghiep.getQuocTich();
	}

	/**
	* Sets the quoc tich of this dn doanh nghiep.
	*
	* @param quocTich the quoc tich of this dn doanh nghiep
	*/
	@Override
	public void setQuocTich(java.lang.String quocTich) {
		_dnDoanhNghiep.setQuocTich(quocTich);
	}

	/**
	* Returns the gioi tinh of this dn doanh nghiep.
	*
	* @return the gioi tinh of this dn doanh nghiep
	*/
	@Override
	public java.lang.String getGioiTinh() {
		return _dnDoanhNghiep.getGioiTinh();
	}

	/**
	* Sets the gioi tinh of this dn doanh nghiep.
	*
	* @param gioiTinh the gioi tinh of this dn doanh nghiep
	*/
	@Override
	public void setGioiTinh(java.lang.String gioiTinh) {
		_dnDoanhNghiep.setGioiTinh(gioiTinh);
	}

	/**
	* Returns the ngay cap c m n d of this dn doanh nghiep.
	*
	* @return the ngay cap c m n d of this dn doanh nghiep
	*/
	@Override
	public java.util.Date getNgayCapCMND() {
		return _dnDoanhNghiep.getNgayCapCMND();
	}

	/**
	* Sets the ngay cap c m n d of this dn doanh nghiep.
	*
	* @param ngayCapCMND the ngay cap c m n d of this dn doanh nghiep
	*/
	@Override
	public void setNgayCapCMND(java.util.Date ngayCapCMND) {
		_dnDoanhNghiep.setNgayCapCMND(ngayCapCMND);
	}

	/**
	* Returns the noi cap c m n d of this dn doanh nghiep.
	*
	* @return the noi cap c m n d of this dn doanh nghiep
	*/
	@Override
	public java.lang.String getNoiCapCMND() {
		return _dnDoanhNghiep.getNoiCapCMND();
	}

	/**
	* Sets the noi cap c m n d of this dn doanh nghiep.
	*
	* @param noiCapCMND the noi cap c m n d of this dn doanh nghiep
	*/
	@Override
	public void setNoiCapCMND(java.lang.String noiCapCMND) {
		_dnDoanhNghiep.setNoiCapCMND(noiCapCMND);
	}

	/**
	* Returns the loai nguoi lam thu tuc of this dn doanh nghiep.
	*
	* @return the loai nguoi lam thu tuc of this dn doanh nghiep
	*/
	@Override
	public java.lang.String getLoaiNguoiLamThuTuc() {
		return _dnDoanhNghiep.getLoaiNguoiLamThuTuc();
	}

	/**
	* Sets the loai nguoi lam thu tuc of this dn doanh nghiep.
	*
	* @param loaiNguoiLamThuTuc the loai nguoi lam thu tuc of this dn doanh nghiep
	*/
	@Override
	public void setLoaiNguoiLamThuTuc(java.lang.String loaiNguoiLamThuTuc) {
		_dnDoanhNghiep.setLoaiNguoiLamThuTuc(loaiNguoiLamThuTuc);
	}

	/**
	* Returns the nam sinh of this dn doanh nghiep.
	*
	* @return the nam sinh of this dn doanh nghiep
	*/
	@Override
	public java.lang.String getNamSinh() {
		return _dnDoanhNghiep.getNamSinh();
	}

	/**
	* Sets the nam sinh of this dn doanh nghiep.
	*
	* @param namSinh the nam sinh of this dn doanh nghiep
	*/
	@Override
	public void setNamSinh(java.lang.String namSinh) {
		_dnDoanhNghiep.setNamSinh(namSinh);
	}

	/**
	* Returns the ngay sinh of this dn doanh nghiep.
	*
	* @return the ngay sinh of this dn doanh nghiep
	*/
	@Override
	public java.util.Date getNgaySinh() {
		return _dnDoanhNghiep.getNgaySinh();
	}

	/**
	* Sets the ngay sinh of this dn doanh nghiep.
	*
	* @param ngaySinh the ngay sinh of this dn doanh nghiep
	*/
	@Override
	public void setNgaySinh(java.util.Date ngaySinh) {
		_dnDoanhNghiep.setNgaySinh(ngaySinh);
	}

	@Override
	public boolean isNew() {
		return _dnDoanhNghiep.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dnDoanhNghiep.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dnDoanhNghiep.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dnDoanhNghiep.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dnDoanhNghiep.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dnDoanhNghiep.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dnDoanhNghiep.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dnDoanhNghiep.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dnDoanhNghiep.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dnDoanhNghiep.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dnDoanhNghiep.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DnDoanhNghiepWrapper((DnDoanhNghiep)_dnDoanhNghiep.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep dnDoanhNghiep) {
		return _dnDoanhNghiep.compareTo(dnDoanhNghiep);
	}

	@Override
	public int hashCode() {
		return _dnDoanhNghiep.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep> toCacheModel() {
		return _dnDoanhNghiep.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep toEscapedModel() {
		return new DnDoanhNghiepWrapper(_dnDoanhNghiep.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep toUnescapedModel() {
		return new DnDoanhNghiepWrapper(_dnDoanhNghiep.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dnDoanhNghiep.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dnDoanhNghiep.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dnDoanhNghiep.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DnDoanhNghiepWrapper)) {
			return false;
		}

		DnDoanhNghiepWrapper dnDoanhNghiepWrapper = (DnDoanhNghiepWrapper)obj;

		if (Validator.equals(_dnDoanhNghiep, dnDoanhNghiepWrapper._dnDoanhNghiep)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DnDoanhNghiep getWrappedDnDoanhNghiep() {
		return _dnDoanhNghiep;
	}

	@Override
	public DnDoanhNghiep getWrappedModel() {
		return _dnDoanhNghiep;
	}

	@Override
	public void resetOriginalValues() {
		_dnDoanhNghiep.resetOriginalValues();
	}

	private DnDoanhNghiep _dnDoanhNghiep;
}