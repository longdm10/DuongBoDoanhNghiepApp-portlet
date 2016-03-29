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

package vn.dtt.duongbo.dao.lienvan.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTien;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QlvtXuLyGpLienVanPhuongTien in entity cache.
 *
 * @author NhanNc
 * @see QlvtXuLyGpLienVanPhuongTien
 * @generated
 */
public class QlvtXuLyGpLienVanPhuongTienCacheModel implements CacheModel<QlvtXuLyGpLienVanPhuongTien>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(71);

		sb.append("{id=");
		sb.append(id);
		sb.append(", capGplvId=");
		sb.append(capGplvId);
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
		sb.append(", mauSon=");
		sb.append(mauSon);
		sb.append(", cuaKhau=");
		sb.append(cuaKhau);
		sb.append(", maCuaKhau=");
		sb.append(maCuaKhau);
		sb.append(", xinCapPhepTuNgay=");
		sb.append(xinCapPhepTuNgay);
		sb.append(", xinCapPhepDenNgay=");
		sb.append(xinCapPhepDenNgay);
		sb.append(", hinhThucHoatDong=");
		sb.append(hinhThucHoatDong);
		sb.append(", soPhuHieu=");
		sb.append(soPhuHieu);
		sb.append(", thoiHanPhuHieu=");
		sb.append(thoiHanPhuHieu);
		sb.append(", soNgayXinhGiaHan=");
		sb.append(soNgayXinhGiaHan);
		sb.append(", xinGiaHanTuNgay=");
		sb.append(xinGiaHanTuNgay);
		sb.append(", xinGiaHanDenNgay=");
		sb.append(xinGiaHanDenNgay);
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
		sb.append(", loaiHinhGiaHan=");
		sb.append(loaiHinhGiaHan);
		sb.append(", loaiGiayPhep=");
		sb.append(loaiGiayPhep);
		sb.append(", ketQuaXuLy=");
		sb.append(ketQuaXuLy);
		sb.append(", lyDoKhongDat=");
		sb.append(lyDoKhongDat);
		sb.append(", soChoNgoi=");
		sb.append(soChoNgoi);
		sb.append(", hanhTrinh=");
		sb.append(hanhTrinh);
		sb.append(", phiCapPhep=");
		sb.append(phiCapPhep);
		sb.append(", soGiayPhepLienVanPhuongTien=");
		sb.append(soGiayPhepLienVanPhuongTien);
		sb.append(", loaiTuyen=");
		sb.append(loaiTuyen);
		sb.append(", loaiHangVanChuyen=");
		sb.append(loaiHangVanChuyen);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QlvtXuLyGpLienVanPhuongTien toEntityModel() {
		QlvtXuLyGpLienVanPhuongTienImpl qlvtXuLyGpLienVanPhuongTienImpl = new QlvtXuLyGpLienVanPhuongTienImpl();

		qlvtXuLyGpLienVanPhuongTienImpl.setId(id);
		qlvtXuLyGpLienVanPhuongTienImpl.setCapGplvId(capGplvId);

		if (bienSo == null) {
			qlvtXuLyGpLienVanPhuongTienImpl.setBienSo(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpLienVanPhuongTienImpl.setBienSo(bienSo);
		}

		qlvtXuLyGpLienVanPhuongTienImpl.setTrongTai(trongTai);
		qlvtXuLyGpLienVanPhuongTienImpl.setNamSx(namSx);

		if (nhanHieu == null) {
			qlvtXuLyGpLienVanPhuongTienImpl.setNhanHieu(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpLienVanPhuongTienImpl.setNhanHieu(nhanHieu);
		}

		if (soKhung == null) {
			qlvtXuLyGpLienVanPhuongTienImpl.setSoKhung(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpLienVanPhuongTienImpl.setSoKhung(soKhung);
		}

		if (soMay == null) {
			qlvtXuLyGpLienVanPhuongTienImpl.setSoMay(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpLienVanPhuongTienImpl.setSoMay(soMay);
		}

		if (mauSon == null) {
			qlvtXuLyGpLienVanPhuongTienImpl.setMauSon(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpLienVanPhuongTienImpl.setMauSon(mauSon);
		}

		if (cuaKhau == null) {
			qlvtXuLyGpLienVanPhuongTienImpl.setCuaKhau(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpLienVanPhuongTienImpl.setCuaKhau(cuaKhau);
		}

		if (maCuaKhau == null) {
			qlvtXuLyGpLienVanPhuongTienImpl.setMaCuaKhau(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpLienVanPhuongTienImpl.setMaCuaKhau(maCuaKhau);
		}

		if (xinCapPhepTuNgay == Long.MIN_VALUE) {
			qlvtXuLyGpLienVanPhuongTienImpl.setXinCapPhepTuNgay(null);
		}
		else {
			qlvtXuLyGpLienVanPhuongTienImpl.setXinCapPhepTuNgay(new Date(
					xinCapPhepTuNgay));
		}

		if (xinCapPhepDenNgay == Long.MIN_VALUE) {
			qlvtXuLyGpLienVanPhuongTienImpl.setXinCapPhepDenNgay(null);
		}
		else {
			qlvtXuLyGpLienVanPhuongTienImpl.setXinCapPhepDenNgay(new Date(
					xinCapPhepDenNgay));
		}

		if (hinhThucHoatDong == null) {
			qlvtXuLyGpLienVanPhuongTienImpl.setHinhThucHoatDong(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpLienVanPhuongTienImpl.setHinhThucHoatDong(hinhThucHoatDong);
		}

		if (soPhuHieu == null) {
			qlvtXuLyGpLienVanPhuongTienImpl.setSoPhuHieu(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpLienVanPhuongTienImpl.setSoPhuHieu(soPhuHieu);
		}

		if (thoiHanPhuHieu == Long.MIN_VALUE) {
			qlvtXuLyGpLienVanPhuongTienImpl.setThoiHanPhuHieu(null);
		}
		else {
			qlvtXuLyGpLienVanPhuongTienImpl.setThoiHanPhuHieu(new Date(
					thoiHanPhuHieu));
		}

		qlvtXuLyGpLienVanPhuongTienImpl.setSoNgayXinhGiaHan(soNgayXinhGiaHan);

		if (xinGiaHanTuNgay == Long.MIN_VALUE) {
			qlvtXuLyGpLienVanPhuongTienImpl.setXinGiaHanTuNgay(null);
		}
		else {
			qlvtXuLyGpLienVanPhuongTienImpl.setXinGiaHanTuNgay(new Date(
					xinGiaHanTuNgay));
		}

		if (xinGiaHanDenNgay == Long.MIN_VALUE) {
			qlvtXuLyGpLienVanPhuongTienImpl.setXinGiaHanDenNgay(null);
		}
		else {
			qlvtXuLyGpLienVanPhuongTienImpl.setXinGiaHanDenNgay(new Date(
					xinGiaHanDenNgay));
		}

		if (hinhThucSoHuu == null) {
			qlvtXuLyGpLienVanPhuongTienImpl.setHinhThucSoHuu(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpLienVanPhuongTienImpl.setHinhThucSoHuu(hinhThucSoHuu);
		}

		if (doanhNghiepChoThue == null) {
			qlvtXuLyGpLienVanPhuongTienImpl.setDoanhNghiepChoThue(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpLienVanPhuongTienImpl.setDoanhNghiepChoThue(doanhNghiepChoThue);
		}

		if (thoiHanChoThue == Long.MIN_VALUE) {
			qlvtXuLyGpLienVanPhuongTienImpl.setThoiHanChoThue(null);
		}
		else {
			qlvtXuLyGpLienVanPhuongTienImpl.setThoiHanChoThue(new Date(
					thoiHanChoThue));
		}

		qlvtXuLyGpLienVanPhuongTienImpl.setHopDongSauCung(hopDongSauCung);

		if (thoiGianNhapCanh == Long.MIN_VALUE) {
			qlvtXuLyGpLienVanPhuongTienImpl.setThoiGianNhapCanh(null);
		}
		else {
			qlvtXuLyGpLienVanPhuongTienImpl.setThoiGianNhapCanh(new Date(
					thoiGianNhapCanh));
		}

		if (thoiGianKhoiHanh == Long.MIN_VALUE) {
			qlvtXuLyGpLienVanPhuongTienImpl.setThoiGianKhoiHanh(null);
		}
		else {
			qlvtXuLyGpLienVanPhuongTienImpl.setThoiGianKhoiHanh(new Date(
					thoiGianKhoiHanh));
		}

		if (loaiHinhGiaHan == null) {
			qlvtXuLyGpLienVanPhuongTienImpl.setLoaiHinhGiaHan(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpLienVanPhuongTienImpl.setLoaiHinhGiaHan(loaiHinhGiaHan);
		}

		if (loaiGiayPhep == null) {
			qlvtXuLyGpLienVanPhuongTienImpl.setLoaiGiayPhep(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpLienVanPhuongTienImpl.setLoaiGiayPhep(loaiGiayPhep);
		}

		if (ketQuaXuLy == null) {
			qlvtXuLyGpLienVanPhuongTienImpl.setKetQuaXuLy(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpLienVanPhuongTienImpl.setKetQuaXuLy(ketQuaXuLy);
		}

		if (lyDoKhongDat == null) {
			qlvtXuLyGpLienVanPhuongTienImpl.setLyDoKhongDat(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpLienVanPhuongTienImpl.setLyDoKhongDat(lyDoKhongDat);
		}

		if (soChoNgoi == null) {
			qlvtXuLyGpLienVanPhuongTienImpl.setSoChoNgoi(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpLienVanPhuongTienImpl.setSoChoNgoi(soChoNgoi);
		}

		if (hanhTrinh == null) {
			qlvtXuLyGpLienVanPhuongTienImpl.setHanhTrinh(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpLienVanPhuongTienImpl.setHanhTrinh(hanhTrinh);
		}

		qlvtXuLyGpLienVanPhuongTienImpl.setPhiCapPhep(phiCapPhep);

		if (soGiayPhepLienVanPhuongTien == null) {
			qlvtXuLyGpLienVanPhuongTienImpl.setSoGiayPhepLienVanPhuongTien(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpLienVanPhuongTienImpl.setSoGiayPhepLienVanPhuongTien(soGiayPhepLienVanPhuongTien);
		}

		if (loaiTuyen == null) {
			qlvtXuLyGpLienVanPhuongTienImpl.setLoaiTuyen(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpLienVanPhuongTienImpl.setLoaiTuyen(loaiTuyen);
		}

		if (loaiHangVanChuyen == null) {
			qlvtXuLyGpLienVanPhuongTienImpl.setLoaiHangVanChuyen(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpLienVanPhuongTienImpl.setLoaiHangVanChuyen(loaiHangVanChuyen);
		}

		qlvtXuLyGpLienVanPhuongTienImpl.resetOriginalValues();

		return qlvtXuLyGpLienVanPhuongTienImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		capGplvId = objectInput.readLong();
		bienSo = objectInput.readUTF();
		trongTai = objectInput.readInt();
		namSx = objectInput.readInt();
		nhanHieu = objectInput.readUTF();
		soKhung = objectInput.readUTF();
		soMay = objectInput.readUTF();
		mauSon = objectInput.readUTF();
		cuaKhau = objectInput.readUTF();
		maCuaKhau = objectInput.readUTF();
		xinCapPhepTuNgay = objectInput.readLong();
		xinCapPhepDenNgay = objectInput.readLong();
		hinhThucHoatDong = objectInput.readUTF();
		soPhuHieu = objectInput.readUTF();
		thoiHanPhuHieu = objectInput.readLong();
		soNgayXinhGiaHan = objectInput.readInt();
		xinGiaHanTuNgay = objectInput.readLong();
		xinGiaHanDenNgay = objectInput.readLong();
		hinhThucSoHuu = objectInput.readUTF();
		doanhNghiepChoThue = objectInput.readUTF();
		thoiHanChoThue = objectInput.readLong();
		hopDongSauCung = objectInput.readLong();
		thoiGianNhapCanh = objectInput.readLong();
		thoiGianKhoiHanh = objectInput.readLong();
		loaiHinhGiaHan = objectInput.readUTF();
		loaiGiayPhep = objectInput.readUTF();
		ketQuaXuLy = objectInput.readUTF();
		lyDoKhongDat = objectInput.readUTF();
		soChoNgoi = objectInput.readUTF();
		hanhTrinh = objectInput.readUTF();
		phiCapPhep = objectInput.readInt();
		soGiayPhepLienVanPhuongTien = objectInput.readUTF();
		loaiTuyen = objectInput.readUTF();
		loaiHangVanChuyen = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(capGplvId);

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

		if (mauSon == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mauSon);
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

		objectOutput.writeLong(xinCapPhepTuNgay);
		objectOutput.writeLong(xinCapPhepDenNgay);

		if (hinhThucHoatDong == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(hinhThucHoatDong);
		}

		if (soPhuHieu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soPhuHieu);
		}

		objectOutput.writeLong(thoiHanPhuHieu);
		objectOutput.writeInt(soNgayXinhGiaHan);
		objectOutput.writeLong(xinGiaHanTuNgay);
		objectOutput.writeLong(xinGiaHanDenNgay);

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

		if (loaiHinhGiaHan == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(loaiHinhGiaHan);
		}

		if (loaiGiayPhep == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(loaiGiayPhep);
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

		if (soChoNgoi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soChoNgoi);
		}

		if (hanhTrinh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(hanhTrinh);
		}

		objectOutput.writeInt(phiCapPhep);

		if (soGiayPhepLienVanPhuongTien == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soGiayPhepLienVanPhuongTien);
		}

		if (loaiTuyen == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(loaiTuyen);
		}

		if (loaiHangVanChuyen == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(loaiHangVanChuyen);
		}
	}

	public long id;
	public long capGplvId;
	public String bienSo;
	public int trongTai;
	public int namSx;
	public String nhanHieu;
	public String soKhung;
	public String soMay;
	public String mauSon;
	public String cuaKhau;
	public String maCuaKhau;
	public long xinCapPhepTuNgay;
	public long xinCapPhepDenNgay;
	public String hinhThucHoatDong;
	public String soPhuHieu;
	public long thoiHanPhuHieu;
	public int soNgayXinhGiaHan;
	public long xinGiaHanTuNgay;
	public long xinGiaHanDenNgay;
	public String hinhThucSoHuu;
	public String doanhNghiepChoThue;
	public long thoiHanChoThue;
	public long hopDongSauCung;
	public long thoiGianNhapCanh;
	public long thoiGianKhoiHanh;
	public String loaiHinhGiaHan;
	public String loaiGiayPhep;
	public String ketQuaXuLy;
	public String lyDoKhongDat;
	public String soChoNgoi;
	public String hanhTrinh;
	public int phiCapPhep;
	public String soGiayPhepLienVanPhuongTien;
	public String loaiTuyen;
	public String loaiHangVanChuyen;
}