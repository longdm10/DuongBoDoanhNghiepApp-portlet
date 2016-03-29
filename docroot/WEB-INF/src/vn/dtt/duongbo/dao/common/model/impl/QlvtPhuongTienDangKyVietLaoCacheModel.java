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

import vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietLao;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QlvtPhuongTienDangKyVietLao in entity cache.
 *
 * @author win_64
 * @see QlvtPhuongTienDangKyVietLao
 * @generated
 */
public class QlvtPhuongTienDangKyVietLaoCacheModel implements CacheModel<QlvtPhuongTienDangKyVietLao>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{id=");
		sb.append(id);
		sb.append(", BienSo=");
		sb.append(BienSo);
		sb.append(", TenDangKySoHuu=");
		sb.append(TenDangKySoHuu);
		sb.append(", NhanHieu=");
		sb.append(NhanHieu);
		sb.append(", TrongTai=");
		sb.append(TrongTai);
		sb.append(", NamSanXuat=");
		sb.append(NamSanXuat);
		sb.append(", CuaKhauXuatNhap=");
		sb.append(CuaKhauXuatNhap);
		sb.append(", HinhThucHoatDong=");
		sb.append(HinhThucHoatDong);
		sb.append(", LoaiHinhHoatDong=");
		sb.append(LoaiHinhHoatDong);
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
		sb.append(", NoiDungHoSoId=");
		sb.append(NoiDungHoSoId);
		sb.append(", HoSoThuTucId=");
		sb.append(HoSoThuTucId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QlvtPhuongTienDangKyVietLao toEntityModel() {
		QlvtPhuongTienDangKyVietLaoImpl qlvtPhuongTienDangKyVietLaoImpl = new QlvtPhuongTienDangKyVietLaoImpl();

		qlvtPhuongTienDangKyVietLaoImpl.setId(id);

		if (BienSo == null) {
			qlvtPhuongTienDangKyVietLaoImpl.setBienSo(StringPool.BLANK);
		}
		else {
			qlvtPhuongTienDangKyVietLaoImpl.setBienSo(BienSo);
		}

		if (TenDangKySoHuu == null) {
			qlvtPhuongTienDangKyVietLaoImpl.setTenDangKySoHuu(StringPool.BLANK);
		}
		else {
			qlvtPhuongTienDangKyVietLaoImpl.setTenDangKySoHuu(TenDangKySoHuu);
		}

		if (NhanHieu == null) {
			qlvtPhuongTienDangKyVietLaoImpl.setNhanHieu(StringPool.BLANK);
		}
		else {
			qlvtPhuongTienDangKyVietLaoImpl.setNhanHieu(NhanHieu);
		}

		if (TrongTai == null) {
			qlvtPhuongTienDangKyVietLaoImpl.setTrongTai(StringPool.BLANK);
		}
		else {
			qlvtPhuongTienDangKyVietLaoImpl.setTrongTai(TrongTai);
		}

		if (NamSanXuat == null) {
			qlvtPhuongTienDangKyVietLaoImpl.setNamSanXuat(StringPool.BLANK);
		}
		else {
			qlvtPhuongTienDangKyVietLaoImpl.setNamSanXuat(NamSanXuat);
		}

		if (CuaKhauXuatNhap == null) {
			qlvtPhuongTienDangKyVietLaoImpl.setCuaKhauXuatNhap(StringPool.BLANK);
		}
		else {
			qlvtPhuongTienDangKyVietLaoImpl.setCuaKhauXuatNhap(CuaKhauXuatNhap);
		}

		if (HinhThucHoatDong == null) {
			qlvtPhuongTienDangKyVietLaoImpl.setHinhThucHoatDong(StringPool.BLANK);
		}
		else {
			qlvtPhuongTienDangKyVietLaoImpl.setHinhThucHoatDong(HinhThucHoatDong);
		}

		if (LoaiHinhHoatDong == null) {
			qlvtPhuongTienDangKyVietLaoImpl.setLoaiHinhHoatDong(StringPool.BLANK);
		}
		else {
			qlvtPhuongTienDangKyVietLaoImpl.setLoaiHinhHoatDong(LoaiHinhHoatDong);
		}

		if (TuyenHoatDong == null) {
			qlvtPhuongTienDangKyVietLaoImpl.setTuyenHoatDong(StringPool.BLANK);
		}
		else {
			qlvtPhuongTienDangKyVietLaoImpl.setTuyenHoatDong(TuyenHoatDong);
		}

		if (ThoiGianXinCapPhepTu == Long.MIN_VALUE) {
			qlvtPhuongTienDangKyVietLaoImpl.setThoiGianXinCapPhepTu(null);
		}
		else {
			qlvtPhuongTienDangKyVietLaoImpl.setThoiGianXinCapPhepTu(new Date(
					ThoiGianXinCapPhepTu));
		}

		if (ThoiGianXinCapPhepDen == Long.MIN_VALUE) {
			qlvtPhuongTienDangKyVietLaoImpl.setThoiGianXinCapPhepDen(null);
		}
		else {
			qlvtPhuongTienDangKyVietLaoImpl.setThoiGianXinCapPhepDen(new Date(
					ThoiGianXinCapPhepDen));
		}

		if (SoKhung == null) {
			qlvtPhuongTienDangKyVietLaoImpl.setSoKhung(StringPool.BLANK);
		}
		else {
			qlvtPhuongTienDangKyVietLaoImpl.setSoKhung(SoKhung);
		}

		if (MauSon == null) {
			qlvtPhuongTienDangKyVietLaoImpl.setMauSon(StringPool.BLANK);
		}
		else {
			qlvtPhuongTienDangKyVietLaoImpl.setMauSon(MauSon);
		}

		if (SoMay == null) {
			qlvtPhuongTienDangKyVietLaoImpl.setSoMay(StringPool.BLANK);
		}
		else {
			qlvtPhuongTienDangKyVietLaoImpl.setSoMay(SoMay);
		}

		if (LoaiHangVanChuyen == null) {
			qlvtPhuongTienDangKyVietLaoImpl.setLoaiHangVanChuyen(StringPool.BLANK);
		}
		else {
			qlvtPhuongTienDangKyVietLaoImpl.setLoaiHangVanChuyen(LoaiHangVanChuyen);
		}

		if (ThoiGianDuKienKhoiHanh == Long.MIN_VALUE) {
			qlvtPhuongTienDangKyVietLaoImpl.setThoiGianDuKienKhoiHanh(null);
		}
		else {
			qlvtPhuongTienDangKyVietLaoImpl.setThoiGianDuKienKhoiHanh(new Date(
					ThoiGianDuKienKhoiHanh));
		}

		qlvtPhuongTienDangKyVietLaoImpl.setNoiDungHoSoId(NoiDungHoSoId);
		qlvtPhuongTienDangKyVietLaoImpl.setHoSoThuTucId(HoSoThuTucId);

		qlvtPhuongTienDangKyVietLaoImpl.resetOriginalValues();

		return qlvtPhuongTienDangKyVietLaoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		BienSo = objectInput.readUTF();
		TenDangKySoHuu = objectInput.readUTF();
		NhanHieu = objectInput.readUTF();
		TrongTai = objectInput.readUTF();
		NamSanXuat = objectInput.readUTF();
		CuaKhauXuatNhap = objectInput.readUTF();
		HinhThucHoatDong = objectInput.readUTF();
		LoaiHinhHoatDong = objectInput.readUTF();
		TuyenHoatDong = objectInput.readUTF();
		ThoiGianXinCapPhepTu = objectInput.readLong();
		ThoiGianXinCapPhepDen = objectInput.readLong();
		SoKhung = objectInput.readUTF();
		MauSon = objectInput.readUTF();
		SoMay = objectInput.readUTF();
		LoaiHangVanChuyen = objectInput.readUTF();
		ThoiGianDuKienKhoiHanh = objectInput.readLong();
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

		if (TenDangKySoHuu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TenDangKySoHuu);
		}

		if (NhanHieu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(NhanHieu);
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

		if (LoaiHinhHoatDong == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LoaiHinhHoatDong);
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
		objectOutput.writeLong(NoiDungHoSoId);
		objectOutput.writeLong(HoSoThuTucId);
	}

	public long id;
	public String BienSo;
	public String TenDangKySoHuu;
	public String NhanHieu;
	public String TrongTai;
	public String NamSanXuat;
	public String CuaKhauXuatNhap;
	public String HinhThucHoatDong;
	public String LoaiHinhHoatDong;
	public String TuyenHoatDong;
	public long ThoiGianXinCapPhepTu;
	public long ThoiGianXinCapPhepDen;
	public String SoKhung;
	public String MauSon;
	public String SoMay;
	public String LoaiHangVanChuyen;
	public long ThoiGianDuKienKhoiHanh;
	public long NoiDungHoSoId;
	public long HoSoThuTucId;
}