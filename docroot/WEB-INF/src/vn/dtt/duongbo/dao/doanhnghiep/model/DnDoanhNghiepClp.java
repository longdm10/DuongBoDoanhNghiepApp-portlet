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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbo.dao.doanhnghiep.service.ClpSerializer;
import vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class DnDoanhNghiepClp extends BaseModelImpl<DnDoanhNghiep>
	implements DnDoanhNghiep {
	public DnDoanhNghiepClp() {
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
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_dnDoanhNghiepRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_dnDoanhNghiepRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaSoDoanhNghiep() {
		return _maSoDoanhNghiep;
	}

	@Override
	public void setMaSoDoanhNghiep(String maSoDoanhNghiep) {
		_maSoDoanhNghiep = maSoDoanhNghiep;

		if (_dnDoanhNghiepRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepRemoteModel.getClass();

				Method method = clazz.getMethod("setMaSoDoanhNghiep",
						String.class);

				method.invoke(_dnDoanhNghiepRemoteModel, maSoDoanhNghiep);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenDoanhNghiep() {
		return _tenDoanhNghiep;
	}

	@Override
	public void setTenDoanhNghiep(String tenDoanhNghiep) {
		_tenDoanhNghiep = tenDoanhNghiep;

		if (_dnDoanhNghiepRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepRemoteModel.getClass();

				Method method = clazz.getMethod("setTenDoanhNghiep",
						String.class);

				method.invoke(_dnDoanhNghiepRemoteModel, tenDoanhNghiep);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDiaChi() {
		return _diaChi;
	}

	@Override
	public void setDiaChi(String diaChi) {
		_diaChi = diaChi;

		if (_dnDoanhNghiepRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepRemoteModel.getClass();

				Method method = clazz.getMethod("setDiaChi", String.class);

				method.invoke(_dnDoanhNghiepRemoteModel, diaChi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaTinhThanh() {
		return _maTinhThanh;
	}

	@Override
	public void setMaTinhThanh(String maTinhThanh) {
		_maTinhThanh = maTinhThanh;

		if (_dnDoanhNghiepRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepRemoteModel.getClass();

				Method method = clazz.getMethod("setMaTinhThanh", String.class);

				method.invoke(_dnDoanhNghiepRemoteModel, maTinhThanh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaQuanHuyen() {
		return _maQuanHuyen;
	}

	@Override
	public void setMaQuanHuyen(String maQuanHuyen) {
		_maQuanHuyen = maQuanHuyen;

		if (_dnDoanhNghiepRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepRemoteModel.getClass();

				Method method = clazz.getMethod("setMaQuanHuyen", String.class);

				method.invoke(_dnDoanhNghiepRemoteModel, maQuanHuyen);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaPhuongXa() {
		return _maPhuongXa;
	}

	@Override
	public void setMaPhuongXa(String maPhuongXa) {
		_maPhuongXa = maPhuongXa;

		if (_dnDoanhNghiepRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepRemoteModel.getClass();

				Method method = clazz.getMethod("setMaPhuongXa", String.class);

				method.invoke(_dnDoanhNghiepRemoteModel, maPhuongXa);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDienThoai() {
		return _dienThoai;
	}

	@Override
	public void setDienThoai(String dienThoai) {
		_dienThoai = dienThoai;

		if (_dnDoanhNghiepRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepRemoteModel.getClass();

				Method method = clazz.getMethod("setDienThoai", String.class);

				method.invoke(_dnDoanhNghiepRemoteModel, dienThoai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getWebsite() {
		return _website;
	}

	@Override
	public void setWebsite(String website) {
		_website = website;

		if (_dnDoanhNghiepRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepRemoteModel.getClass();

				Method method = clazz.getMethod("setWebsite", String.class);

				method.invoke(_dnDoanhNghiepRemoteModel, website);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFax() {
		return _fax;
	}

	@Override
	public void setFax(String fax) {
		_fax = fax;

		if (_dnDoanhNghiepRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepRemoteModel.getClass();

				Method method = clazz.getMethod("setFax", String.class);

				method.invoke(_dnDoanhNghiepRemoteModel, fax);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmail() {
		return _email;
	}

	@Override
	public void setEmail(String email) {
		_email = email;

		if (_dnDoanhNghiepRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepRemoteModel.getClass();

				Method method = clazz.getMethod("setEmail", String.class);

				method.invoke(_dnDoanhNghiepRemoteModel, email);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getMaster() {
		return _master;
	}

	@Override
	public void setMaster(long master) {
		_master = master;

		if (_dnDoanhNghiepRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepRemoteModel.getClass();

				Method method = clazz.getMethod("setMaster", long.class);

				method.invoke(_dnDoanhNghiepRemoteModel, master);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayDangKi() {
		return _ngayDangKi;
	}

	@Override
	public void setNgayDangKi(Date ngayDangKi) {
		_ngayDangKi = ngayDangKi;

		if (_dnDoanhNghiepRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayDangKi", Date.class);

				method.invoke(_dnDoanhNghiepRemoteModel, ngayDangKi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getHangTaiKhoan() {
		return _hangTaiKhoan;
	}

	@Override
	public void setHangTaiKhoan(String hangTaiKhoan) {
		_hangTaiKhoan = hangTaiKhoan;

		if (_dnDoanhNghiepRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepRemoteModel.getClass();

				Method method = clazz.getMethod("setHangTaiKhoan", String.class);

				method.invoke(_dnDoanhNghiepRemoteModel, hangTaiKhoan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaKichHoat() {
		return _maKichHoat;
	}

	@Override
	public void setMaKichHoat(String maKichHoat) {
		_maKichHoat = maKichHoat;

		if (_dnDoanhNghiepRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepRemoteModel.getClass();

				Method method = clazz.getMethod("setMaKichHoat", String.class);

				method.invoke(_dnDoanhNghiepRemoteModel, maKichHoat);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayKichHoat() {
		return _ngayKichHoat;
	}

	@Override
	public void setNgayKichHoat(Date ngayKichHoat) {
		_ngayKichHoat = ngayKichHoat;

		if (_dnDoanhNghiepRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayKichHoat", Date.class);

				method.invoke(_dnDoanhNghiepRemoteModel, ngayKichHoat);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoDangKyKinhDoanh() {
		return _soDangKyKinhDoanh;
	}

	@Override
	public void setSoDangKyKinhDoanh(String soDangKyKinhDoanh) {
		_soDangKyKinhDoanh = soDangKyKinhDoanh;

		if (_dnDoanhNghiepRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepRemoteModel.getClass();

				Method method = clazz.getMethod("setSoDangKyKinhDoanh",
						String.class);

				method.invoke(_dnDoanhNghiepRemoteModel, soDangKyKinhDoanh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayCapDkKd() {
		return _ngayCapDkKd;
	}

	@Override
	public void setNgayCapDkKd(Date ngayCapDkKd) {
		_ngayCapDkKd = ngayCapDkKd;

		if (_dnDoanhNghiepRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayCapDkKd", Date.class);

				method.invoke(_dnDoanhNghiepRemoteModel, ngayCapDkKd);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayHetHanDKKD() {
		return _ngayHetHanDKKD;
	}

	@Override
	public void setNgayHetHanDKKD(Date ngayHetHanDKKD) {
		_ngayHetHanDKKD = ngayHetHanDKKD;

		if (_dnDoanhNghiepRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayHetHanDKKD", Date.class);

				method.invoke(_dnDoanhNghiepRemoteModel, ngayHetHanDKKD);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCoQuanCapDkKd() {
		return _coQuanCapDkKd;
	}

	@Override
	public void setCoQuanCapDkKd(String coQuanCapDkKd) {
		_coQuanCapDkKd = coQuanCapDkKd;

		if (_dnDoanhNghiepRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepRemoteModel.getClass();

				Method method = clazz.getMethod("setCoQuanCapDkKd", String.class);

				method.invoke(_dnDoanhNghiepRemoteModel, coQuanCapDkKd);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLoaiDoanhNghiep() {
		return _loaiDoanhNghiep;
	}

	@Override
	public void setLoaiDoanhNghiep(String loaiDoanhNghiep) {
		_loaiDoanhNghiep = loaiDoanhNghiep;

		if (_dnDoanhNghiepRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiDoanhNghiep",
						String.class);

				method.invoke(_dnDoanhNghiepRemoteModel, loaiDoanhNghiep);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNguoiDaiDien() {
		return _nguoiDaiDien;
	}

	@Override
	public void setNguoiDaiDien(String nguoiDaiDien) {
		_nguoiDaiDien = nguoiDaiDien;

		if (_dnDoanhNghiepRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepRemoteModel.getClass();

				Method method = clazz.getMethod("setNguoiDaiDien", String.class);

				method.invoke(_dnDoanhNghiepRemoteModel, nguoiDaiDien);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoDienThoaiNguoiDaiDien() {
		return _soDienThoaiNguoiDaiDien;
	}

	@Override
	public void setSoDienThoaiNguoiDaiDien(String soDienThoaiNguoiDaiDien) {
		_soDienThoaiNguoiDaiDien = soDienThoaiNguoiDaiDien;

		if (_dnDoanhNghiepRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepRemoteModel.getClass();

				Method method = clazz.getMethod("setSoDienThoaiNguoiDaiDien",
						String.class);

				method.invoke(_dnDoanhNghiepRemoteModel, soDienThoaiNguoiDaiDien);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getChucVuNguoiDaiDien() {
		return _chucVuNguoiDaiDien;
	}

	@Override
	public void setChucVuNguoiDaiDien(String chucVuNguoiDaiDien) {
		_chucVuNguoiDaiDien = chucVuNguoiDaiDien;

		if (_dnDoanhNghiepRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepRemoteModel.getClass();

				Method method = clazz.getMethod("setChucVuNguoiDaiDien",
						String.class);

				method.invoke(_dnDoanhNghiepRemoteModel, chucVuNguoiDaiDien);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenTiengAnh() {
		return _tenTiengAnh;
	}

	@Override
	public void setTenTiengAnh(String tenTiengAnh) {
		_tenTiengAnh = tenTiengAnh;

		if (_dnDoanhNghiepRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepRemoteModel.getClass();

				Method method = clazz.getMethod("setTenTiengAnh", String.class);

				method.invoke(_dnDoanhNghiepRemoteModel, tenTiengAnh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenVietTat() {
		return _tenVietTat;
	}

	@Override
	public void setTenVietTat(String tenVietTat) {
		_tenVietTat = tenVietTat;

		if (_dnDoanhNghiepRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepRemoteModel.getClass();

				Method method = clazz.getMethod("setTenVietTat", String.class);

				method.invoke(_dnDoanhNghiepRemoteModel, tenVietTat);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoGpkdVanTaiBangOto() {
		return _soGpkdVanTaiBangOto;
	}

	@Override
	public void setSoGpkdVanTaiBangOto(String soGpkdVanTaiBangOto) {
		_soGpkdVanTaiBangOto = soGpkdVanTaiBangOto;

		if (_dnDoanhNghiepRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepRemoteModel.getClass();

				Method method = clazz.getMethod("setSoGpkdVanTaiBangOto",
						String.class);

				method.invoke(_dnDoanhNghiepRemoteModel, soGpkdVanTaiBangOto);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayCapGpkdVanTaiBangOto() {
		return _ngayCapGpkdVanTaiBangOto;
	}

	@Override
	public void setNgayCapGpkdVanTaiBangOto(Date ngayCapGpkdVanTaiBangOto) {
		_ngayCapGpkdVanTaiBangOto = ngayCapGpkdVanTaiBangOto;

		if (_dnDoanhNghiepRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayCapGpkdVanTaiBangOto",
						Date.class);

				method.invoke(_dnDoanhNghiepRemoteModel,
					ngayCapGpkdVanTaiBangOto);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCoQuanCapGpkdVanTaiBangOto() {
		return _coQuanCapGpkdVanTaiBangOto;
	}

	@Override
	public void setCoQuanCapGpkdVanTaiBangOto(String coQuanCapGpkdVanTaiBangOto) {
		_coQuanCapGpkdVanTaiBangOto = coQuanCapGpkdVanTaiBangOto;

		if (_dnDoanhNghiepRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepRemoteModel.getClass();

				Method method = clazz.getMethod("setCoQuanCapGpkdVanTaiBangOto",
						String.class);

				method.invoke(_dnDoanhNghiepRemoteModel,
					coQuanCapGpkdVanTaiBangOto);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaSoCongDan() {
		return _maSoCongDan;
	}

	@Override
	public void setMaSoCongDan(String maSoCongDan) {
		_maSoCongDan = maSoCongDan;

		if (_dnDoanhNghiepRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepRemoteModel.getClass();

				Method method = clazz.getMethod("setMaSoCongDan", String.class);

				method.invoke(_dnDoanhNghiepRemoteModel, maSoCongDan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenCongDan() {
		return _tenCongDan;
	}

	@Override
	public void setTenCongDan(String tenCongDan) {
		_tenCongDan = tenCongDan;

		if (_dnDoanhNghiepRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepRemoteModel.getClass();

				Method method = clazz.getMethod("setTenCongDan", String.class);

				method.invoke(_dnDoanhNghiepRemoteModel, tenCongDan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getQuocTich() {
		return _quocTich;
	}

	@Override
	public void setQuocTich(String quocTich) {
		_quocTich = quocTich;

		if (_dnDoanhNghiepRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepRemoteModel.getClass();

				Method method = clazz.getMethod("setQuocTich", String.class);

				method.invoke(_dnDoanhNghiepRemoteModel, quocTich);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGioiTinh() {
		return _gioiTinh;
	}

	@Override
	public void setGioiTinh(String gioiTinh) {
		_gioiTinh = gioiTinh;

		if (_dnDoanhNghiepRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepRemoteModel.getClass();

				Method method = clazz.getMethod("setGioiTinh", String.class);

				method.invoke(_dnDoanhNghiepRemoteModel, gioiTinh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayCapCMND() {
		return _ngayCapCMND;
	}

	@Override
	public void setNgayCapCMND(Date ngayCapCMND) {
		_ngayCapCMND = ngayCapCMND;

		if (_dnDoanhNghiepRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayCapCMND", Date.class);

				method.invoke(_dnDoanhNghiepRemoteModel, ngayCapCMND);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNoiCapCMND() {
		return _noiCapCMND;
	}

	@Override
	public void setNoiCapCMND(String noiCapCMND) {
		_noiCapCMND = noiCapCMND;

		if (_dnDoanhNghiepRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepRemoteModel.getClass();

				Method method = clazz.getMethod("setNoiCapCMND", String.class);

				method.invoke(_dnDoanhNghiepRemoteModel, noiCapCMND);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLoaiNguoiLamThuTuc() {
		return _loaiNguoiLamThuTuc;
	}

	@Override
	public void setLoaiNguoiLamThuTuc(String loaiNguoiLamThuTuc) {
		_loaiNguoiLamThuTuc = loaiNguoiLamThuTuc;

		if (_dnDoanhNghiepRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiNguoiLamThuTuc",
						String.class);

				method.invoke(_dnDoanhNghiepRemoteModel, loaiNguoiLamThuTuc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNamSinh() {
		return _namSinh;
	}

	@Override
	public void setNamSinh(String namSinh) {
		_namSinh = namSinh;

		if (_dnDoanhNghiepRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepRemoteModel.getClass();

				Method method = clazz.getMethod("setNamSinh", String.class);

				method.invoke(_dnDoanhNghiepRemoteModel, namSinh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgaySinh() {
		return _ngaySinh;
	}

	@Override
	public void setNgaySinh(Date ngaySinh) {
		_ngaySinh = ngaySinh;

		if (_dnDoanhNghiepRemoteModel != null) {
			try {
				Class<?> clazz = _dnDoanhNghiepRemoteModel.getClass();

				Method method = clazz.getMethod("setNgaySinh", Date.class);

				method.invoke(_dnDoanhNghiepRemoteModel, ngaySinh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDnDoanhNghiepRemoteModel() {
		return _dnDoanhNghiepRemoteModel;
	}

	public void setDnDoanhNghiepRemoteModel(
		BaseModel<?> dnDoanhNghiepRemoteModel) {
		_dnDoanhNghiepRemoteModel = dnDoanhNghiepRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _dnDoanhNghiepRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_dnDoanhNghiepRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DnDoanhNghiepLocalServiceUtil.addDnDoanhNghiep(this);
		}
		else {
			DnDoanhNghiepLocalServiceUtil.updateDnDoanhNghiep(this);
		}
	}

	@Override
	public DnDoanhNghiep toEscapedModel() {
		return (DnDoanhNghiep)ProxyUtil.newProxyInstance(DnDoanhNghiep.class.getClassLoader(),
			new Class[] { DnDoanhNghiep.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DnDoanhNghiepClp clone = new DnDoanhNghiepClp();

		clone.setId(getId());
		clone.setMaSoDoanhNghiep(getMaSoDoanhNghiep());
		clone.setTenDoanhNghiep(getTenDoanhNghiep());
		clone.setDiaChi(getDiaChi());
		clone.setMaTinhThanh(getMaTinhThanh());
		clone.setMaQuanHuyen(getMaQuanHuyen());
		clone.setMaPhuongXa(getMaPhuongXa());
		clone.setDienThoai(getDienThoai());
		clone.setWebsite(getWebsite());
		clone.setFax(getFax());
		clone.setEmail(getEmail());
		clone.setMaster(getMaster());
		clone.setNgayDangKi(getNgayDangKi());
		clone.setHangTaiKhoan(getHangTaiKhoan());
		clone.setMaKichHoat(getMaKichHoat());
		clone.setNgayKichHoat(getNgayKichHoat());
		clone.setSoDangKyKinhDoanh(getSoDangKyKinhDoanh());
		clone.setNgayCapDkKd(getNgayCapDkKd());
		clone.setNgayHetHanDKKD(getNgayHetHanDKKD());
		clone.setCoQuanCapDkKd(getCoQuanCapDkKd());
		clone.setLoaiDoanhNghiep(getLoaiDoanhNghiep());
		clone.setNguoiDaiDien(getNguoiDaiDien());
		clone.setSoDienThoaiNguoiDaiDien(getSoDienThoaiNguoiDaiDien());
		clone.setChucVuNguoiDaiDien(getChucVuNguoiDaiDien());
		clone.setTenTiengAnh(getTenTiengAnh());
		clone.setTenVietTat(getTenVietTat());
		clone.setSoGpkdVanTaiBangOto(getSoGpkdVanTaiBangOto());
		clone.setNgayCapGpkdVanTaiBangOto(getNgayCapGpkdVanTaiBangOto());
		clone.setCoQuanCapGpkdVanTaiBangOto(getCoQuanCapGpkdVanTaiBangOto());
		clone.setMaSoCongDan(getMaSoCongDan());
		clone.setTenCongDan(getTenCongDan());
		clone.setQuocTich(getQuocTich());
		clone.setGioiTinh(getGioiTinh());
		clone.setNgayCapCMND(getNgayCapCMND());
		clone.setNoiCapCMND(getNoiCapCMND());
		clone.setLoaiNguoiLamThuTuc(getLoaiNguoiLamThuTuc());
		clone.setNamSinh(getNamSinh());
		clone.setNgaySinh(getNgaySinh());

		return clone;
	}

	@Override
	public int compareTo(DnDoanhNghiep dnDoanhNghiep) {
		int value = 0;

		if (getId() < dnDoanhNghiep.getId()) {
			value = -1;
		}
		else if (getId() > dnDoanhNghiep.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DnDoanhNghiepClp)) {
			return false;
		}

		DnDoanhNghiepClp dnDoanhNghiep = (DnDoanhNghiepClp)obj;

		long primaryKey = dnDoanhNghiep.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(77);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", maSoDoanhNghiep=");
		sb.append(getMaSoDoanhNghiep());
		sb.append(", tenDoanhNghiep=");
		sb.append(getTenDoanhNghiep());
		sb.append(", diaChi=");
		sb.append(getDiaChi());
		sb.append(", maTinhThanh=");
		sb.append(getMaTinhThanh());
		sb.append(", maQuanHuyen=");
		sb.append(getMaQuanHuyen());
		sb.append(", maPhuongXa=");
		sb.append(getMaPhuongXa());
		sb.append(", dienThoai=");
		sb.append(getDienThoai());
		sb.append(", website=");
		sb.append(getWebsite());
		sb.append(", fax=");
		sb.append(getFax());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", master=");
		sb.append(getMaster());
		sb.append(", ngayDangKi=");
		sb.append(getNgayDangKi());
		sb.append(", hangTaiKhoan=");
		sb.append(getHangTaiKhoan());
		sb.append(", maKichHoat=");
		sb.append(getMaKichHoat());
		sb.append(", ngayKichHoat=");
		sb.append(getNgayKichHoat());
		sb.append(", soDangKyKinhDoanh=");
		sb.append(getSoDangKyKinhDoanh());
		sb.append(", ngayCapDkKd=");
		sb.append(getNgayCapDkKd());
		sb.append(", ngayHetHanDKKD=");
		sb.append(getNgayHetHanDKKD());
		sb.append(", coQuanCapDkKd=");
		sb.append(getCoQuanCapDkKd());
		sb.append(", loaiDoanhNghiep=");
		sb.append(getLoaiDoanhNghiep());
		sb.append(", nguoiDaiDien=");
		sb.append(getNguoiDaiDien());
		sb.append(", soDienThoaiNguoiDaiDien=");
		sb.append(getSoDienThoaiNguoiDaiDien());
		sb.append(", chucVuNguoiDaiDien=");
		sb.append(getChucVuNguoiDaiDien());
		sb.append(", tenTiengAnh=");
		sb.append(getTenTiengAnh());
		sb.append(", tenVietTat=");
		sb.append(getTenVietTat());
		sb.append(", soGpkdVanTaiBangOto=");
		sb.append(getSoGpkdVanTaiBangOto());
		sb.append(", ngayCapGpkdVanTaiBangOto=");
		sb.append(getNgayCapGpkdVanTaiBangOto());
		sb.append(", coQuanCapGpkdVanTaiBangOto=");
		sb.append(getCoQuanCapGpkdVanTaiBangOto());
		sb.append(", maSoCongDan=");
		sb.append(getMaSoCongDan());
		sb.append(", tenCongDan=");
		sb.append(getTenCongDan());
		sb.append(", quocTich=");
		sb.append(getQuocTich());
		sb.append(", gioiTinh=");
		sb.append(getGioiTinh());
		sb.append(", ngayCapCMND=");
		sb.append(getNgayCapCMND());
		sb.append(", noiCapCMND=");
		sb.append(getNoiCapCMND());
		sb.append(", loaiNguoiLamThuTuc=");
		sb.append(getLoaiNguoiLamThuTuc());
		sb.append(", namSinh=");
		sb.append(getNamSinh());
		sb.append(", ngaySinh=");
		sb.append(getNgaySinh());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(118);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maSoDoanhNghiep</column-name><column-value><![CDATA[");
		sb.append(getMaSoDoanhNghiep());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenDoanhNghiep</column-name><column-value><![CDATA[");
		sb.append(getTenDoanhNghiep());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>diaChi</column-name><column-value><![CDATA[");
		sb.append(getDiaChi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maTinhThanh</column-name><column-value><![CDATA[");
		sb.append(getMaTinhThanh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maQuanHuyen</column-name><column-value><![CDATA[");
		sb.append(getMaQuanHuyen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maPhuongXa</column-name><column-value><![CDATA[");
		sb.append(getMaPhuongXa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dienThoai</column-name><column-value><![CDATA[");
		sb.append(getDienThoai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>website</column-name><column-value><![CDATA[");
		sb.append(getWebsite());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fax</column-name><column-value><![CDATA[");
		sb.append(getFax());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>master</column-name><column-value><![CDATA[");
		sb.append(getMaster());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayDangKi</column-name><column-value><![CDATA[");
		sb.append(getNgayDangKi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hangTaiKhoan</column-name><column-value><![CDATA[");
		sb.append(getHangTaiKhoan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maKichHoat</column-name><column-value><![CDATA[");
		sb.append(getMaKichHoat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayKichHoat</column-name><column-value><![CDATA[");
		sb.append(getNgayKichHoat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soDangKyKinhDoanh</column-name><column-value><![CDATA[");
		sb.append(getSoDangKyKinhDoanh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayCapDkKd</column-name><column-value><![CDATA[");
		sb.append(getNgayCapDkKd());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayHetHanDKKD</column-name><column-value><![CDATA[");
		sb.append(getNgayHetHanDKKD());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>coQuanCapDkKd</column-name><column-value><![CDATA[");
		sb.append(getCoQuanCapDkKd());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiDoanhNghiep</column-name><column-value><![CDATA[");
		sb.append(getLoaiDoanhNghiep());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiDaiDien</column-name><column-value><![CDATA[");
		sb.append(getNguoiDaiDien());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soDienThoaiNguoiDaiDien</column-name><column-value><![CDATA[");
		sb.append(getSoDienThoaiNguoiDaiDien());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chucVuNguoiDaiDien</column-name><column-value><![CDATA[");
		sb.append(getChucVuNguoiDaiDien());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenTiengAnh</column-name><column-value><![CDATA[");
		sb.append(getTenTiengAnh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenVietTat</column-name><column-value><![CDATA[");
		sb.append(getTenVietTat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soGpkdVanTaiBangOto</column-name><column-value><![CDATA[");
		sb.append(getSoGpkdVanTaiBangOto());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayCapGpkdVanTaiBangOto</column-name><column-value><![CDATA[");
		sb.append(getNgayCapGpkdVanTaiBangOto());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>coQuanCapGpkdVanTaiBangOto</column-name><column-value><![CDATA[");
		sb.append(getCoQuanCapGpkdVanTaiBangOto());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maSoCongDan</column-name><column-value><![CDATA[");
		sb.append(getMaSoCongDan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenCongDan</column-name><column-value><![CDATA[");
		sb.append(getTenCongDan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>quocTich</column-name><column-value><![CDATA[");
		sb.append(getQuocTich());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gioiTinh</column-name><column-value><![CDATA[");
		sb.append(getGioiTinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayCapCMND</column-name><column-value><![CDATA[");
		sb.append(getNgayCapCMND());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>noiCapCMND</column-name><column-value><![CDATA[");
		sb.append(getNoiCapCMND());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiNguoiLamThuTuc</column-name><column-value><![CDATA[");
		sb.append(getLoaiNguoiLamThuTuc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>namSinh</column-name><column-value><![CDATA[");
		sb.append(getNamSinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngaySinh</column-name><column-value><![CDATA[");
		sb.append(getNgaySinh());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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
	private BaseModel<?> _dnDoanhNghiepRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbo.dao.doanhnghiep.service.ClpSerializer.class;
}