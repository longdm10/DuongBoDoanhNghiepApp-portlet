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

package vn.dtt.duongbo.dao.doanhnghiep.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DnDoanhNghiep in entity cache.
 *
 * @author win_64
 * @see DnDoanhNghiep
 * @generated
 */
public class DnDoanhNghiepCacheModel implements CacheModel<DnDoanhNghiep>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(77);

		sb.append("{id=");
		sb.append(id);
		sb.append(", maSoDoanhNghiep=");
		sb.append(maSoDoanhNghiep);
		sb.append(", tenDoanhNghiep=");
		sb.append(tenDoanhNghiep);
		sb.append(", diaChi=");
		sb.append(diaChi);
		sb.append(", maTinhThanh=");
		sb.append(maTinhThanh);
		sb.append(", maQuanHuyen=");
		sb.append(maQuanHuyen);
		sb.append(", maPhuongXa=");
		sb.append(maPhuongXa);
		sb.append(", dienThoai=");
		sb.append(dienThoai);
		sb.append(", website=");
		sb.append(website);
		sb.append(", fax=");
		sb.append(fax);
		sb.append(", email=");
		sb.append(email);
		sb.append(", master=");
		sb.append(master);
		sb.append(", ngayDangKi=");
		sb.append(ngayDangKi);
		sb.append(", hangTaiKhoan=");
		sb.append(hangTaiKhoan);
		sb.append(", maKichHoat=");
		sb.append(maKichHoat);
		sb.append(", ngayKichHoat=");
		sb.append(ngayKichHoat);
		sb.append(", soDangKyKinhDoanh=");
		sb.append(soDangKyKinhDoanh);
		sb.append(", ngayCapDkKd=");
		sb.append(ngayCapDkKd);
		sb.append(", ngayHetHanDKKD=");
		sb.append(ngayHetHanDKKD);
		sb.append(", coQuanCapDkKd=");
		sb.append(coQuanCapDkKd);
		sb.append(", loaiDoanhNghiep=");
		sb.append(loaiDoanhNghiep);
		sb.append(", nguoiDaiDien=");
		sb.append(nguoiDaiDien);
		sb.append(", soDienThoaiNguoiDaiDien=");
		sb.append(soDienThoaiNguoiDaiDien);
		sb.append(", chucVuNguoiDaiDien=");
		sb.append(chucVuNguoiDaiDien);
		sb.append(", tenTiengAnh=");
		sb.append(tenTiengAnh);
		sb.append(", tenVietTat=");
		sb.append(tenVietTat);
		sb.append(", soGpkdVanTaiBangOto=");
		sb.append(soGpkdVanTaiBangOto);
		sb.append(", ngayCapGpkdVanTaiBangOto=");
		sb.append(ngayCapGpkdVanTaiBangOto);
		sb.append(", coQuanCapGpkdVanTaiBangOto=");
		sb.append(coQuanCapGpkdVanTaiBangOto);
		sb.append(", maSoCongDan=");
		sb.append(maSoCongDan);
		sb.append(", tenCongDan=");
		sb.append(tenCongDan);
		sb.append(", quocTich=");
		sb.append(quocTich);
		sb.append(", gioiTinh=");
		sb.append(gioiTinh);
		sb.append(", ngayCapCMND=");
		sb.append(ngayCapCMND);
		sb.append(", noiCapCMND=");
		sb.append(noiCapCMND);
		sb.append(", loaiNguoiLamThuTuc=");
		sb.append(loaiNguoiLamThuTuc);
		sb.append(", namSinh=");
		sb.append(namSinh);
		sb.append(", ngaySinh=");
		sb.append(ngaySinh);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DnDoanhNghiep toEntityModel() {
		DnDoanhNghiepImpl dnDoanhNghiepImpl = new DnDoanhNghiepImpl();

		dnDoanhNghiepImpl.setId(id);

		if (maSoDoanhNghiep == null) {
			dnDoanhNghiepImpl.setMaSoDoanhNghiep(StringPool.BLANK);
		}
		else {
			dnDoanhNghiepImpl.setMaSoDoanhNghiep(maSoDoanhNghiep);
		}

		if (tenDoanhNghiep == null) {
			dnDoanhNghiepImpl.setTenDoanhNghiep(StringPool.BLANK);
		}
		else {
			dnDoanhNghiepImpl.setTenDoanhNghiep(tenDoanhNghiep);
		}

		if (diaChi == null) {
			dnDoanhNghiepImpl.setDiaChi(StringPool.BLANK);
		}
		else {
			dnDoanhNghiepImpl.setDiaChi(diaChi);
		}

		if (maTinhThanh == null) {
			dnDoanhNghiepImpl.setMaTinhThanh(StringPool.BLANK);
		}
		else {
			dnDoanhNghiepImpl.setMaTinhThanh(maTinhThanh);
		}

		if (maQuanHuyen == null) {
			dnDoanhNghiepImpl.setMaQuanHuyen(StringPool.BLANK);
		}
		else {
			dnDoanhNghiepImpl.setMaQuanHuyen(maQuanHuyen);
		}

		if (maPhuongXa == null) {
			dnDoanhNghiepImpl.setMaPhuongXa(StringPool.BLANK);
		}
		else {
			dnDoanhNghiepImpl.setMaPhuongXa(maPhuongXa);
		}

		if (dienThoai == null) {
			dnDoanhNghiepImpl.setDienThoai(StringPool.BLANK);
		}
		else {
			dnDoanhNghiepImpl.setDienThoai(dienThoai);
		}

		if (website == null) {
			dnDoanhNghiepImpl.setWebsite(StringPool.BLANK);
		}
		else {
			dnDoanhNghiepImpl.setWebsite(website);
		}

		if (fax == null) {
			dnDoanhNghiepImpl.setFax(StringPool.BLANK);
		}
		else {
			dnDoanhNghiepImpl.setFax(fax);
		}

		if (email == null) {
			dnDoanhNghiepImpl.setEmail(StringPool.BLANK);
		}
		else {
			dnDoanhNghiepImpl.setEmail(email);
		}

		dnDoanhNghiepImpl.setMaster(master);

		if (ngayDangKi == Long.MIN_VALUE) {
			dnDoanhNghiepImpl.setNgayDangKi(null);
		}
		else {
			dnDoanhNghiepImpl.setNgayDangKi(new Date(ngayDangKi));
		}

		if (hangTaiKhoan == null) {
			dnDoanhNghiepImpl.setHangTaiKhoan(StringPool.BLANK);
		}
		else {
			dnDoanhNghiepImpl.setHangTaiKhoan(hangTaiKhoan);
		}

		if (maKichHoat == null) {
			dnDoanhNghiepImpl.setMaKichHoat(StringPool.BLANK);
		}
		else {
			dnDoanhNghiepImpl.setMaKichHoat(maKichHoat);
		}

		if (ngayKichHoat == Long.MIN_VALUE) {
			dnDoanhNghiepImpl.setNgayKichHoat(null);
		}
		else {
			dnDoanhNghiepImpl.setNgayKichHoat(new Date(ngayKichHoat));
		}

		if (soDangKyKinhDoanh == null) {
			dnDoanhNghiepImpl.setSoDangKyKinhDoanh(StringPool.BLANK);
		}
		else {
			dnDoanhNghiepImpl.setSoDangKyKinhDoanh(soDangKyKinhDoanh);
		}

		if (ngayCapDkKd == Long.MIN_VALUE) {
			dnDoanhNghiepImpl.setNgayCapDkKd(null);
		}
		else {
			dnDoanhNghiepImpl.setNgayCapDkKd(new Date(ngayCapDkKd));
		}

		if (ngayHetHanDKKD == Long.MIN_VALUE) {
			dnDoanhNghiepImpl.setNgayHetHanDKKD(null);
		}
		else {
			dnDoanhNghiepImpl.setNgayHetHanDKKD(new Date(ngayHetHanDKKD));
		}

		if (coQuanCapDkKd == null) {
			dnDoanhNghiepImpl.setCoQuanCapDkKd(StringPool.BLANK);
		}
		else {
			dnDoanhNghiepImpl.setCoQuanCapDkKd(coQuanCapDkKd);
		}

		if (loaiDoanhNghiep == null) {
			dnDoanhNghiepImpl.setLoaiDoanhNghiep(StringPool.BLANK);
		}
		else {
			dnDoanhNghiepImpl.setLoaiDoanhNghiep(loaiDoanhNghiep);
		}

		if (nguoiDaiDien == null) {
			dnDoanhNghiepImpl.setNguoiDaiDien(StringPool.BLANK);
		}
		else {
			dnDoanhNghiepImpl.setNguoiDaiDien(nguoiDaiDien);
		}

		if (soDienThoaiNguoiDaiDien == null) {
			dnDoanhNghiepImpl.setSoDienThoaiNguoiDaiDien(StringPool.BLANK);
		}
		else {
			dnDoanhNghiepImpl.setSoDienThoaiNguoiDaiDien(soDienThoaiNguoiDaiDien);
		}

		if (chucVuNguoiDaiDien == null) {
			dnDoanhNghiepImpl.setChucVuNguoiDaiDien(StringPool.BLANK);
		}
		else {
			dnDoanhNghiepImpl.setChucVuNguoiDaiDien(chucVuNguoiDaiDien);
		}

		if (tenTiengAnh == null) {
			dnDoanhNghiepImpl.setTenTiengAnh(StringPool.BLANK);
		}
		else {
			dnDoanhNghiepImpl.setTenTiengAnh(tenTiengAnh);
		}

		if (tenVietTat == null) {
			dnDoanhNghiepImpl.setTenVietTat(StringPool.BLANK);
		}
		else {
			dnDoanhNghiepImpl.setTenVietTat(tenVietTat);
		}

		if (soGpkdVanTaiBangOto == null) {
			dnDoanhNghiepImpl.setSoGpkdVanTaiBangOto(StringPool.BLANK);
		}
		else {
			dnDoanhNghiepImpl.setSoGpkdVanTaiBangOto(soGpkdVanTaiBangOto);
		}

		if (ngayCapGpkdVanTaiBangOto == Long.MIN_VALUE) {
			dnDoanhNghiepImpl.setNgayCapGpkdVanTaiBangOto(null);
		}
		else {
			dnDoanhNghiepImpl.setNgayCapGpkdVanTaiBangOto(new Date(
					ngayCapGpkdVanTaiBangOto));
		}

		if (coQuanCapGpkdVanTaiBangOto == null) {
			dnDoanhNghiepImpl.setCoQuanCapGpkdVanTaiBangOto(StringPool.BLANK);
		}
		else {
			dnDoanhNghiepImpl.setCoQuanCapGpkdVanTaiBangOto(coQuanCapGpkdVanTaiBangOto);
		}

		if (maSoCongDan == null) {
			dnDoanhNghiepImpl.setMaSoCongDan(StringPool.BLANK);
		}
		else {
			dnDoanhNghiepImpl.setMaSoCongDan(maSoCongDan);
		}

		if (tenCongDan == null) {
			dnDoanhNghiepImpl.setTenCongDan(StringPool.BLANK);
		}
		else {
			dnDoanhNghiepImpl.setTenCongDan(tenCongDan);
		}

		if (quocTich == null) {
			dnDoanhNghiepImpl.setQuocTich(StringPool.BLANK);
		}
		else {
			dnDoanhNghiepImpl.setQuocTich(quocTich);
		}

		if (gioiTinh == null) {
			dnDoanhNghiepImpl.setGioiTinh(StringPool.BLANK);
		}
		else {
			dnDoanhNghiepImpl.setGioiTinh(gioiTinh);
		}

		if (ngayCapCMND == Long.MIN_VALUE) {
			dnDoanhNghiepImpl.setNgayCapCMND(null);
		}
		else {
			dnDoanhNghiepImpl.setNgayCapCMND(new Date(ngayCapCMND));
		}

		if (noiCapCMND == null) {
			dnDoanhNghiepImpl.setNoiCapCMND(StringPool.BLANK);
		}
		else {
			dnDoanhNghiepImpl.setNoiCapCMND(noiCapCMND);
		}

		if (loaiNguoiLamThuTuc == null) {
			dnDoanhNghiepImpl.setLoaiNguoiLamThuTuc(StringPool.BLANK);
		}
		else {
			dnDoanhNghiepImpl.setLoaiNguoiLamThuTuc(loaiNguoiLamThuTuc);
		}

		if (namSinh == null) {
			dnDoanhNghiepImpl.setNamSinh(StringPool.BLANK);
		}
		else {
			dnDoanhNghiepImpl.setNamSinh(namSinh);
		}

		if (ngaySinh == Long.MIN_VALUE) {
			dnDoanhNghiepImpl.setNgaySinh(null);
		}
		else {
			dnDoanhNghiepImpl.setNgaySinh(new Date(ngaySinh));
		}

		dnDoanhNghiepImpl.resetOriginalValues();

		return dnDoanhNghiepImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		maSoDoanhNghiep = objectInput.readUTF();
		tenDoanhNghiep = objectInput.readUTF();
		diaChi = objectInput.readUTF();
		maTinhThanh = objectInput.readUTF();
		maQuanHuyen = objectInput.readUTF();
		maPhuongXa = objectInput.readUTF();
		dienThoai = objectInput.readUTF();
		website = objectInput.readUTF();
		fax = objectInput.readUTF();
		email = objectInput.readUTF();
		master = objectInput.readLong();
		ngayDangKi = objectInput.readLong();
		hangTaiKhoan = objectInput.readUTF();
		maKichHoat = objectInput.readUTF();
		ngayKichHoat = objectInput.readLong();
		soDangKyKinhDoanh = objectInput.readUTF();
		ngayCapDkKd = objectInput.readLong();
		ngayHetHanDKKD = objectInput.readLong();
		coQuanCapDkKd = objectInput.readUTF();
		loaiDoanhNghiep = objectInput.readUTF();
		nguoiDaiDien = objectInput.readUTF();
		soDienThoaiNguoiDaiDien = objectInput.readUTF();
		chucVuNguoiDaiDien = objectInput.readUTF();
		tenTiengAnh = objectInput.readUTF();
		tenVietTat = objectInput.readUTF();
		soGpkdVanTaiBangOto = objectInput.readUTF();
		ngayCapGpkdVanTaiBangOto = objectInput.readLong();
		coQuanCapGpkdVanTaiBangOto = objectInput.readUTF();
		maSoCongDan = objectInput.readUTF();
		tenCongDan = objectInput.readUTF();
		quocTich = objectInput.readUTF();
		gioiTinh = objectInput.readUTF();
		ngayCapCMND = objectInput.readLong();
		noiCapCMND = objectInput.readUTF();
		loaiNguoiLamThuTuc = objectInput.readUTF();
		namSinh = objectInput.readUTF();
		ngaySinh = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (maSoDoanhNghiep == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maSoDoanhNghiep);
		}

		if (tenDoanhNghiep == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenDoanhNghiep);
		}

		if (diaChi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(diaChi);
		}

		if (maTinhThanh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maTinhThanh);
		}

		if (maQuanHuyen == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maQuanHuyen);
		}

		if (maPhuongXa == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maPhuongXa);
		}

		if (dienThoai == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dienThoai);
		}

		if (website == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(website);
		}

		if (fax == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fax);
		}

		if (email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email);
		}

		objectOutput.writeLong(master);
		objectOutput.writeLong(ngayDangKi);

		if (hangTaiKhoan == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(hangTaiKhoan);
		}

		if (maKichHoat == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maKichHoat);
		}

		objectOutput.writeLong(ngayKichHoat);

		if (soDangKyKinhDoanh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soDangKyKinhDoanh);
		}

		objectOutput.writeLong(ngayCapDkKd);
		objectOutput.writeLong(ngayHetHanDKKD);

		if (coQuanCapDkKd == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(coQuanCapDkKd);
		}

		if (loaiDoanhNghiep == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(loaiDoanhNghiep);
		}

		if (nguoiDaiDien == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nguoiDaiDien);
		}

		if (soDienThoaiNguoiDaiDien == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soDienThoaiNguoiDaiDien);
		}

		if (chucVuNguoiDaiDien == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(chucVuNguoiDaiDien);
		}

		if (tenTiengAnh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenTiengAnh);
		}

		if (tenVietTat == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenVietTat);
		}

		if (soGpkdVanTaiBangOto == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soGpkdVanTaiBangOto);
		}

		objectOutput.writeLong(ngayCapGpkdVanTaiBangOto);

		if (coQuanCapGpkdVanTaiBangOto == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(coQuanCapGpkdVanTaiBangOto);
		}

		if (maSoCongDan == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maSoCongDan);
		}

		if (tenCongDan == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenCongDan);
		}

		if (quocTich == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(quocTich);
		}

		if (gioiTinh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(gioiTinh);
		}

		objectOutput.writeLong(ngayCapCMND);

		if (noiCapCMND == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(noiCapCMND);
		}

		if (loaiNguoiLamThuTuc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(loaiNguoiLamThuTuc);
		}

		if (namSinh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(namSinh);
		}

		objectOutput.writeLong(ngaySinh);
	}

	public long id;
	public String maSoDoanhNghiep;
	public String tenDoanhNghiep;
	public String diaChi;
	public String maTinhThanh;
	public String maQuanHuyen;
	public String maPhuongXa;
	public String dienThoai;
	public String website;
	public String fax;
	public String email;
	public long master;
	public long ngayDangKi;
	public String hangTaiKhoan;
	public String maKichHoat;
	public long ngayKichHoat;
	public String soDangKyKinhDoanh;
	public long ngayCapDkKd;
	public long ngayHetHanDKKD;
	public String coQuanCapDkKd;
	public String loaiDoanhNghiep;
	public String nguoiDaiDien;
	public String soDienThoaiNguoiDaiDien;
	public String chucVuNguoiDaiDien;
	public String tenTiengAnh;
	public String tenVietTat;
	public String soGpkdVanTaiBangOto;
	public long ngayCapGpkdVanTaiBangOto;
	public String coQuanCapGpkdVanTaiBangOto;
	public String maSoCongDan;
	public String tenCongDan;
	public String quocTich;
	public String gioiTinh;
	public long ngayCapCMND;
	public String noiCapCMND;
	public String loaiNguoiLamThuTuc;
	public String namSinh;
	public long ngaySinh;
}