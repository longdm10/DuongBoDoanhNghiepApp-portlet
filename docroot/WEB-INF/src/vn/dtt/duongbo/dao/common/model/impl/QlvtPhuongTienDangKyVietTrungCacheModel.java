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

package vn.dtt.duongbo.dao.common.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietTrung;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QlvtPhuongTienDangKyVietTrung in entity cache.
 *
 * @author win_64
 * @see QlvtPhuongTienDangKyVietTrung
 * @generated
 */
public class QlvtPhuongTienDangKyVietTrungCacheModel implements CacheModel<QlvtPhuongTienDangKyVietTrung>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(45);

		sb.append("{id=");
		sb.append(id);
		sb.append(", BienSo=");
		sb.append(BienSo);
		sb.append(", NhanHieu=");
		sb.append(NhanHieu);
		sb.append(", tenDangKySoHuu=");
		sb.append(tenDangKySoHuu);
		sb.append(", loaiXe=");
		sb.append(loaiXe);
		sb.append(", TrongTai=");
		sb.append(TrongTai);
		sb.append(", NamSanXuat=");
		sb.append(NamSanXuat);
		sb.append(", CuaKhauXuatNhap=");
		sb.append(CuaKhauXuatNhap);
		sb.append(", HinhThucHoatDong=");
		sb.append(HinhThucHoatDong);
		sb.append(", TuyenHoatDong=");
		sb.append(TuyenHoatDong);
		sb.append(", ThoiGianXinCapPhepTu=");
		sb.append(ThoiGianXinCapPhepTu);
		sb.append(", ThoiGianXinCapPhepDen=");
		sb.append(ThoiGianXinCapPhepDen);
		sb.append(", SoKhung=");
		sb.append(SoKhung);
		sb.append(", MauSon=");
		sb.append(MauSon);
		sb.append(", SoMay=");
		sb.append(SoMay);
		sb.append(", LoaiHangVanChuyen=");
		sb.append(LoaiHangVanChuyen);
		sb.append(", ThoiGianDuKienKhoiHanh=");
		sb.append(ThoiGianDuKienKhoiHanh);
		sb.append(", hanhTrinhDeNghi=");
		sb.append(hanhTrinhDeNghi);
		sb.append(", soGiayPhepBiMatHong=");
		sb.append(soGiayPhepBiMatHong);
		sb.append(", diemDungDoDangKy=");
		sb.append(diemDungDoDangKy);
		sb.append(", NoiDungHoSoId=");
		sb.append(NoiDungHoSoId);
		sb.append(", HoSoThuTucId=");
		sb.append(HoSoThuTucId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QlvtPhuongTienDangKyVietTrung toEntityModel() {
		QlvtPhuongTienDangKyVietTrungImpl qlvtPhuongTienDangKyVietTrungImpl = new QlvtPhuongTienDangKyVietTrungImpl();

		qlvtPhuongTienDangKyVietTrungImpl.setId(id);

		if (BienSo == null) {
			qlvtPhuongTienDangKyVietTrungImpl.setBienSo(StringPool.BLANK);
		}
		else {
			qlvtPhuongTienDangKyVietTrungImpl.setBienSo(BienSo);
		}

		if (NhanHieu == null) {
			qlvtPhuongTienDangKyVietTrungImpl.setNhanHieu(StringPool.BLANK);
		}
		else {
			qlvtPhuongTienDangKyVietTrungImpl.setNhanHieu(NhanHieu);
		}

		if (tenDangKySoHuu == null) {
			qlvtPhuongTienDangKyVietTrungImpl.setTenDangKySoHuu(StringPool.BLANK);
		}
		else {
			qlvtPhuongTienDangKyVietTrungImpl.setTenDangKySoHuu(tenDangKySoHuu);
		}

		if (loaiXe == null) {
			qlvtPhuongTienDangKyVietTrungImpl.setLoaiXe(StringPool.BLANK);
		}
		else {
			qlvtPhuongTienDangKyVietTrungImpl.setLoaiXe(loaiXe);
		}

		if (TrongTai == null) {
			qlvtPhuongTienDangKyVietTrungImpl.setTrongTai(StringPool.BLANK);
		}
		else {
			qlvtPhuongTienDangKyVietTrungImpl.setTrongTai(TrongTai);
		}

		if (NamSanXuat == null) {
			qlvtPhuongTienDangKyVietTrungImpl.setNamSanXuat(StringPool.BLANK);
		}
		else {
			qlvtPhuongTienDangKyVietTrungImpl.setNamSanXuat(NamSanXuat);
		}

		if (CuaKhauXuatNhap == null) {
			qlvtPhuongTienDangKyVietTrungImpl.setCuaKhauXuatNhap(StringPool.BLANK);
		}
		else {
			qlvtPhuongTienDangKyVietTrungImpl.setCuaKhauXuatNhap(CuaKhauXuatNhap);
		}

		if (HinhThucHoatDong == null) {
			qlvtPhuongTienDangKyVietTrungImpl.setHinhThucHoatDong(StringPool.BLANK);
		}
		else {
			qlvtPhuongTienDangKyVietTrungImpl.setHinhThucHoatDong(HinhThucHoatDong);
		}

		if (TuyenHoatDong == null) {
			qlvtPhuongTienDangKyVietTrungImpl.setTuyenHoatDong(StringPool.BLANK);
		}
		else {
			qlvtPhuongTienDangKyVietTrungImpl.setTuyenHoatDong(TuyenHoatDong);
		}

		if (ThoiGianXinCapPhepTu == Long.MIN_VALUE) {
			qlvtPhuongTienDangKyVietTrungImpl.setThoiGianXinCapPhepTu(null);
		}
		else {
			qlvtPhuongTienDangKyVietTrungImpl.setThoiGianXinCapPhepTu(new Date(
					ThoiGianXinCapPhepTu));
		}

		if (ThoiGianXinCapPhepDen == Long.MIN_VALUE) {
			qlvtPhuongTienDangKyVietTrungImpl.setThoiGianXinCapPhepDen(null);
		}
		else {
			qlvtPhuongTienDangKyVietTrungImpl.setThoiGianXinCapPhepDen(new Date(
					ThoiGianXinCapPhepDen));
		}

		if (SoKhung == null) {
			qlvtPhuongTienDangKyVietTrungImpl.setSoKhung(StringPool.BLANK);
		}
		else {
			qlvtPhuongTienDangKyVietTrungImpl.setSoKhung(SoKhung);
		}

		if (MauSon == null) {
			qlvtPhuongTienDangKyVietTrungImpl.setMauSon(StringPool.BLANK);
		}
		else {
			qlvtPhuongTienDangKyVietTrungImpl.setMauSon(MauSon);
		}

		if (SoMay == null) {
			qlvtPhuongTienDangKyVietTrungImpl.setSoMay(StringPool.BLANK);
		}
		else {
			qlvtPhuongTienDangKyVietTrungImpl.setSoMay(SoMay);
		}

		if (LoaiHangVanChuyen == null) {
			qlvtPhuongTienDangKyVietTrungImpl.setLoaiHangVanChuyen(StringPool.BLANK);
		}
		else {
			qlvtPhuongTienDangKyVietTrungImpl.setLoaiHangVanChuyen(LoaiHangVanChuyen);
		}

		if (ThoiGianDuKienKhoiHanh == Long.MIN_VALUE) {
			qlvtPhuongTienDangKyVietTrungImpl.setThoiGianDuKienKhoiHanh(null);
		}
		else {
			qlvtPhuongTienDangKyVietTrungImpl.setThoiGianDuKienKhoiHanh(new Date(
					ThoiGianDuKienKhoiHanh));
		}

		if (hanhTrinhDeNghi == null) {
			qlvtPhuongTienDangKyVietTrungImpl.setHanhTrinhDeNghi(StringPool.BLANK);
		}
		else {
			qlvtPhuongTienDangKyVietTrungImpl.setHanhTrinhDeNghi(hanhTrinhDeNghi);
		}

		if (soGiayPhepBiMatHong == null) {
			qlvtPhuongTienDangKyVietTrungImpl.setSoGiayPhepBiMatHong(StringPool.BLANK);
		}
		else {
			qlvtPhuongTienDangKyVietTrungImpl.setSoGiayPhepBiMatHong(soGiayPhepBiMatHong);
		}

		if (diemDungDoDangKy == null) {
			qlvtPhuongTienDangKyVietTrungImpl.setDiemDungDoDangKy(StringPool.BLANK);
		}
		else {
			qlvtPhuongTienDangKyVietTrungImpl.setDiemDungDoDangKy(diemDungDoDangKy);
		}

		qlvtPhuongTienDangKyVietTrungImpl.setNoiDungHoSoId(NoiDungHoSoId);
		qlvtPhuongTienDangKyVietTrungImpl.setHoSoThuTucId(HoSoThuTucId);

		qlvtPhuongTienDangKyVietTrungImpl.resetOriginalValues();

		return qlvtPhuongTienDangKyVietTrungImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		BienSo = objectInput.readUTF();
		NhanHieu = objectInput.readUTF();
		tenDangKySoHuu = objectInput.readUTF();
		loaiXe = objectInput.readUTF();
		TrongTai = objectInput.readUTF();
		NamSanXuat = objectInput.readUTF();
		CuaKhauXuatNhap = objectInput.readUTF();
		HinhThucHoatDong = objectInput.readUTF();
		TuyenHoatDong = objectInput.readUTF();
		ThoiGianXinCapPhepTu = objectInput.readLong();
		ThoiGianXinCapPhepDen = objectInput.readLong();
		SoKhung = objectInput.readUTF();
		MauSon = objectInput.readUTF();
		SoMay = objectInput.readUTF();
		LoaiHangVanChuyen = objectInput.readUTF();
		ThoiGianDuKienKhoiHanh = objectInput.readLong();
		hanhTrinhDeNghi = objectInput.readUTF();
		soGiayPhepBiMatHong = objectInput.readUTF();
		diemDungDoDangKy = objectInput.readUTF();
		NoiDungHoSoId = objectInput.readLong();
		HoSoThuTucId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (BienSo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BienSo);
		}

		if (NhanHieu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(NhanHieu);
		}

		if (tenDangKySoHuu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenDangKySoHuu);
		}

		if (loaiXe == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(loaiXe);
		}

		if (TrongTai == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TrongTai);
		}

		if (NamSanXuat == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(NamSanXuat);
		}

		if (CuaKhauXuatNhap == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CuaKhauXuatNhap);
		}

		if (HinhThucHoatDong == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(HinhThucHoatDong);
		}

		if (TuyenHoatDong == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TuyenHoatDong);
		}

		objectOutput.writeLong(ThoiGianXinCapPhepTu);
		objectOutput.writeLong(ThoiGianXinCapPhepDen);

		if (SoKhung == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SoKhung);
		}

		if (MauSon == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MauSon);
		}

		if (SoMay == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SoMay);
		}

		if (LoaiHangVanChuyen == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LoaiHangVanChuyen);
		}

		objectOutput.writeLong(ThoiGianDuKienKhoiHanh);

		if (hanhTrinhDeNghi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(hanhTrinhDeNghi);
		}

		if (soGiayPhepBiMatHong == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soGiayPhepBiMatHong);
		}

		if (diemDungDoDangKy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(diemDungDoDangKy);
		}

		objectOutput.writeLong(NoiDungHoSoId);
		objectOutput.writeLong(HoSoThuTucId);
	}

	public long id;
	public String BienSo;
	public String NhanHieu;
	public String tenDangKySoHuu;
	public String loaiXe;
	public String TrongTai;
	public String NamSanXuat;
	public String CuaKhauXuatNhap;
	public String HinhThucHoatDong;
	public String TuyenHoatDong;
	public long ThoiGianXinCapPhepTu;
	public long ThoiGianXinCapPhepDen;
	public String SoKhung;
	public String MauSon;
	public String SoMay;
	public String LoaiHangVanChuyen;
	public long ThoiGianDuKienKhoiHanh;
	public String hanhTrinhDeNghi;
	public String soGiayPhepBiMatHong;
	public String diemDungDoDangKy;
	public long NoiDungHoSoId;
	public long HoSoThuTucId;
}