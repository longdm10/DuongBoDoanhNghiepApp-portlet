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

package vn.dtt.duongbo.dao.quocte.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QlvtXuLyKTTQuocTePhuongTien in entity cache.
 *
 * @author NoiPham
 * @see QlvtXuLyKTTQuocTePhuongTien
 * @generated
 */
public class QlvtXuLyKTTQuocTePhuongTienCacheModel implements CacheModel<QlvtXuLyKTTQuocTePhuongTien>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(53);

		sb.append("{id=");
		sb.append(id);
		sb.append(", kttQuocTeID=");
		sb.append(kttQuocTeID);
		sb.append(", bienSo=");
		sb.append(bienSo);
		sb.append(", trongTai=");
		sb.append(trongTai);
		sb.append(", namSx=");
		sb.append(namSx);
		sb.append(", nhanHieu=");
		sb.append(nhanHieu);
		sb.append(", soKhung=");
		sb.append(soKhung);
		sb.append(", soMay=");
		sb.append(soMay);
		sb.append(", cuaKhau=");
		sb.append(cuaKhau);
		sb.append(", maCuaKhau=");
		sb.append(maCuaKhau);
		sb.append(", hinhThucSoHuu=");
		sb.append(hinhThucSoHuu);
		sb.append(", doanhNghiepChoThue=");
		sb.append(doanhNghiepChoThue);
		sb.append(", thoiHanChoThue=");
		sb.append(thoiHanChoThue);
		sb.append(", hopDongSauCung=");
		sb.append(hopDongSauCung);
		sb.append(", thoiGianNhapCanh=");
		sb.append(thoiGianNhapCanh);
		sb.append(", thoiGianKhoiHanh=");
		sb.append(thoiGianKhoiHanh);
		sb.append(", xinCapPhepTuNgay=");
		sb.append(xinCapPhepTuNgay);
		sb.append(", xinCapPhepDenNgay=");
		sb.append(xinCapPhepDenNgay);
		sb.append(", hinhThucHoatDong=");
		sb.append(hinhThucHoatDong);
		sb.append(", loaiHinhGiaHan=");
		sb.append(loaiHinhGiaHan);
		sb.append(", ketQuaXuLy=");
		sb.append(ketQuaXuLy);
		sb.append(", lyDoKhongDat=");
		sb.append(lyDoKhongDat);
		sb.append(", capPhepKTTQuocTeID=");
		sb.append(capPhepKTTQuocTeID);
		sb.append(", loaiGiayPhep=");
		sb.append(loaiGiayPhep);
		sb.append(", soChoNgoi=");
		sb.append(soChoNgoi);
		sb.append(", tenDangKySoHuu=");
		sb.append(tenDangKySoHuu);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QlvtXuLyKTTQuocTePhuongTien toEntityModel() {
		QlvtXuLyKTTQuocTePhuongTienImpl qlvtXuLyKTTQuocTePhuongTienImpl = new QlvtXuLyKTTQuocTePhuongTienImpl();

		qlvtXuLyKTTQuocTePhuongTienImpl.setId(id);
		qlvtXuLyKTTQuocTePhuongTienImpl.setKttQuocTeID(kttQuocTeID);

		if (bienSo == null) {
			qlvtXuLyKTTQuocTePhuongTienImpl.setBienSo(StringPool.BLANK);
		}
		else {
			qlvtXuLyKTTQuocTePhuongTienImpl.setBienSo(bienSo);
		}

		qlvtXuLyKTTQuocTePhuongTienImpl.setTrongTai(trongTai);
		qlvtXuLyKTTQuocTePhuongTienImpl.setNamSx(namSx);

		if (nhanHieu == null) {
			qlvtXuLyKTTQuocTePhuongTienImpl.setNhanHieu(StringPool.BLANK);
		}
		else {
			qlvtXuLyKTTQuocTePhuongTienImpl.setNhanHieu(nhanHieu);
		}

		if (soKhung == null) {
			qlvtXuLyKTTQuocTePhuongTienImpl.setSoKhung(StringPool.BLANK);
		}
		else {
			qlvtXuLyKTTQuocTePhuongTienImpl.setSoKhung(soKhung);
		}

		if (soMay == null) {
			qlvtXuLyKTTQuocTePhuongTienImpl.setSoMay(StringPool.BLANK);
		}
		else {
			qlvtXuLyKTTQuocTePhuongTienImpl.setSoMay(soMay);
		}

		if (cuaKhau == null) {
			qlvtXuLyKTTQuocTePhuongTienImpl.setCuaKhau(StringPool.BLANK);
		}
		else {
			qlvtXuLyKTTQuocTePhuongTienImpl.setCuaKhau(cuaKhau);
		}

		if (maCuaKhau == null) {
			qlvtXuLyKTTQuocTePhuongTienImpl.setMaCuaKhau(StringPool.BLANK);
		}
		else {
			qlvtXuLyKTTQuocTePhuongTienImpl.setMaCuaKhau(maCuaKhau);
		}

		if (hinhThucSoHuu == null) {
			qlvtXuLyKTTQuocTePhuongTienImpl.setHinhThucSoHuu(StringPool.BLANK);
		}
		else {
			qlvtXuLyKTTQuocTePhuongTienImpl.setHinhThucSoHuu(hinhThucSoHuu);
		}

		if (doanhNghiepChoThue == null) {
			qlvtXuLyKTTQuocTePhuongTienImpl.setDoanhNghiepChoThue(StringPool.BLANK);
		}
		else {
			qlvtXuLyKTTQuocTePhuongTienImpl.setDoanhNghiepChoThue(doanhNghiepChoThue);
		}

		if (thoiHanChoThue == Long.MIN_VALUE) {
			qlvtXuLyKTTQuocTePhuongTienImpl.setThoiHanChoThue(null);
		}
		else {
			qlvtXuLyKTTQuocTePhuongTienImpl.setThoiHanChoThue(new Date(
					thoiHanChoThue));
		}

		qlvtXuLyKTTQuocTePhuongTienImpl.setHopDongSauCung(hopDongSauCung);

		if (thoiGianNhapCanh == Long.MIN_VALUE) {
			qlvtXuLyKTTQuocTePhuongTienImpl.setThoiGianNhapCanh(null);
		}
		else {
			qlvtXuLyKTTQuocTePhuongTienImpl.setThoiGianNhapCanh(new Date(
					thoiGianNhapCanh));
		}

		if (thoiGianKhoiHanh == Long.MIN_VALUE) {
			qlvtXuLyKTTQuocTePhuongTienImpl.setThoiGianKhoiHanh(null);
		}
		else {
			qlvtXuLyKTTQuocTePhuongTienImpl.setThoiGianKhoiHanh(new Date(
					thoiGianKhoiHanh));
		}

		if (xinCapPhepTuNgay == Long.MIN_VALUE) {
			qlvtXuLyKTTQuocTePhuongTienImpl.setXinCapPhepTuNgay(null);
		}
		else {
			qlvtXuLyKTTQuocTePhuongTienImpl.setXinCapPhepTuNgay(new Date(
					xinCapPhepTuNgay));
		}

		if (xinCapPhepDenNgay == Long.MIN_VALUE) {
			qlvtXuLyKTTQuocTePhuongTienImpl.setXinCapPhepDenNgay(null);
		}
		else {
			qlvtXuLyKTTQuocTePhuongTienImpl.setXinCapPhepDenNgay(new Date(
					xinCapPhepDenNgay));
		}

		if (hinhThucHoatDong == null) {
			qlvtXuLyKTTQuocTePhuongTienImpl.setHinhThucHoatDong(StringPool.BLANK);
		}
		else {
			qlvtXuLyKTTQuocTePhuongTienImpl.setHinhThucHoatDong(hinhThucHoatDong);
		}

		if (loaiHinhGiaHan == null) {
			qlvtXuLyKTTQuocTePhuongTienImpl.setLoaiHinhGiaHan(StringPool.BLANK);
		}
		else {
			qlvtXuLyKTTQuocTePhuongTienImpl.setLoaiHinhGiaHan(loaiHinhGiaHan);
		}

		if (ketQuaXuLy == null) {
			qlvtXuLyKTTQuocTePhuongTienImpl.setKetQuaXuLy(StringPool.BLANK);
		}
		else {
			qlvtXuLyKTTQuocTePhuongTienImpl.setKetQuaXuLy(ketQuaXuLy);
		}

		if (lyDoKhongDat == null) {
			qlvtXuLyKTTQuocTePhuongTienImpl.setLyDoKhongDat(StringPool.BLANK);
		}
		else {
			qlvtXuLyKTTQuocTePhuongTienImpl.setLyDoKhongDat(lyDoKhongDat);
		}

		qlvtXuLyKTTQuocTePhuongTienImpl.setCapPhepKTTQuocTeID(capPhepKTTQuocTeID);

		if (loaiGiayPhep == null) {
			qlvtXuLyKTTQuocTePhuongTienImpl.setLoaiGiayPhep(StringPool.BLANK);
		}
		else {
			qlvtXuLyKTTQuocTePhuongTienImpl.setLoaiGiayPhep(loaiGiayPhep);
		}

		qlvtXuLyKTTQuocTePhuongTienImpl.setSoChoNgoi(soChoNgoi);

		if (tenDangKySoHuu == null) {
			qlvtXuLyKTTQuocTePhuongTienImpl.setTenDangKySoHuu(StringPool.BLANK);
		}
		else {
			qlvtXuLyKTTQuocTePhuongTienImpl.setTenDangKySoHuu(tenDangKySoHuu);
		}

		qlvtXuLyKTTQuocTePhuongTienImpl.resetOriginalValues();

		return qlvtXuLyKTTQuocTePhuongTienImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		kttQuocTeID = objectInput.readLong();
		bienSo = objectInput.readUTF();
		trongTai = objectInput.readInt();
		namSx = objectInput.readInt();
		nhanHieu = objectInput.readUTF();
		soKhung = objectInput.readUTF();
		soMay = objectInput.readUTF();
		cuaKhau = objectInput.readUTF();
		maCuaKhau = objectInput.readUTF();
		hinhThucSoHuu = objectInput.readUTF();
		doanhNghiepChoThue = objectInput.readUTF();
		thoiHanChoThue = objectInput.readLong();
		hopDongSauCung = objectInput.readLong();
		thoiGianNhapCanh = objectInput.readLong();
		thoiGianKhoiHanh = objectInput.readLong();
		xinCapPhepTuNgay = objectInput.readLong();
		xinCapPhepDenNgay = objectInput.readLong();
		hinhThucHoatDong = objectInput.readUTF();
		loaiHinhGiaHan = objectInput.readUTF();
		ketQuaXuLy = objectInput.readUTF();
		lyDoKhongDat = objectInput.readUTF();
		capPhepKTTQuocTeID = objectInput.readLong();
		loaiGiayPhep = objectInput.readUTF();
		soChoNgoi = objectInput.readInt();
		tenDangKySoHuu = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(kttQuocTeID);

		if (bienSo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(bienSo);
		}

		objectOutput.writeInt(trongTai);
		objectOutput.writeInt(namSx);

		if (nhanHieu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nhanHieu);
		}

		if (soKhung == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soKhung);
		}

		if (soMay == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soMay);
		}

		if (cuaKhau == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cuaKhau);
		}

		if (maCuaKhau == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maCuaKhau);
		}

		if (hinhThucSoHuu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(hinhThucSoHuu);
		}

		if (doanhNghiepChoThue == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(doanhNghiepChoThue);
		}

		objectOutput.writeLong(thoiHanChoThue);
		objectOutput.writeLong(hopDongSauCung);
		objectOutput.writeLong(thoiGianNhapCanh);
		objectOutput.writeLong(thoiGianKhoiHanh);
		objectOutput.writeLong(xinCapPhepTuNgay);
		objectOutput.writeLong(xinCapPhepDenNgay);

		if (hinhThucHoatDong == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(hinhThucHoatDong);
		}

		if (loaiHinhGiaHan == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(loaiHinhGiaHan);
		}

		if (ketQuaXuLy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ketQuaXuLy);
		}

		if (lyDoKhongDat == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lyDoKhongDat);
		}

		objectOutput.writeLong(capPhepKTTQuocTeID);

		if (loaiGiayPhep == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(loaiGiayPhep);
		}

		objectOutput.writeInt(soChoNgoi);

		if (tenDangKySoHuu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenDangKySoHuu);
		}
	}

	public long id;
	public long kttQuocTeID;
	public String bienSo;
	public int trongTai;
	public int namSx;
	public String nhanHieu;
	public String soKhung;
	public String soMay;
	public String cuaKhau;
	public String maCuaKhau;
	public String hinhThucSoHuu;
	public String doanhNghiepChoThue;
	public long thoiHanChoThue;
	public long hopDongSauCung;
	public long thoiGianNhapCanh;
	public long thoiGianKhoiHanh;
	public long xinCapPhepTuNgay;
	public long xinCapPhepDenNgay;
	public String hinhThucHoatDong;
	public String loaiHinhGiaHan;
	public String ketQuaXuLy;
	public String lyDoKhongDat;
	public long capPhepKTTQuocTeID;
	public String loaiGiayPhep;
	public int soChoNgoi;
	public String tenDangKySoHuu;
}