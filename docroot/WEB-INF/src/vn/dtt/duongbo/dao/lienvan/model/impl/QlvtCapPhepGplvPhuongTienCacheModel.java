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

import vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvPhuongTien;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QlvtCapPhepGplvPhuongTien in entity cache.
 *
 * @author NhanNc
 * @see QlvtCapPhepGplvPhuongTien
 * @generated
 */
public class QlvtCapPhepGplvPhuongTienCacheModel implements CacheModel<QlvtCapPhepGplvPhuongTien>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{id=");
		sb.append(id);
		sb.append(", giayPhepLienVanId=");
		sb.append(giayPhepLienVanId);
		sb.append(", soPhuHieu=");
		sb.append(soPhuHieu);
		sb.append(", ngayCapPhep=");
		sb.append(ngayCapPhep);
		sb.append(", ngayGiaHan=");
		sb.append(ngayGiaHan);
		sb.append(", ngayHetHan=");
		sb.append(ngayHetHan);
		sb.append(", cuaKhau=");
		sb.append(cuaKhau);
		sb.append(", maCuaKhau=");
		sb.append(maCuaKhau);
		sb.append(", hinhThucHoatDong=");
		sb.append(hinhThucHoatDong);
		sb.append(", thoiHanPhuHieu=");
		sb.append(thoiHanPhuHieu);
		sb.append(", soHuu=");
		sb.append(soHuu);
		sb.append(", chuSoHuu=");
		sb.append(chuSoHuu);
		sb.append(", thoiHanChoThue=");
		sb.append(thoiHanChoThue);
		sb.append(", hopDongSauCung=");
		sb.append(hopDongSauCung);
		sb.append(", mucPhi=");
		sb.append(mucPhi);
		sb.append(", thongTinXuLyViPham=");
		sb.append(thongTinXuLyViPham);
		sb.append(", trangThai=");
		sb.append(trangThai);
		sb.append(", fileId=");
		sb.append(fileId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QlvtCapPhepGplvPhuongTien toEntityModel() {
		QlvtCapPhepGplvPhuongTienImpl qlvtCapPhepGplvPhuongTienImpl = new QlvtCapPhepGplvPhuongTienImpl();

		qlvtCapPhepGplvPhuongTienImpl.setId(id);
		qlvtCapPhepGplvPhuongTienImpl.setGiayPhepLienVanId(giayPhepLienVanId);

		if (soPhuHieu == null) {
			qlvtCapPhepGplvPhuongTienImpl.setSoPhuHieu(StringPool.BLANK);
		}
		else {
			qlvtCapPhepGplvPhuongTienImpl.setSoPhuHieu(soPhuHieu);
		}

		if (ngayCapPhep == Long.MIN_VALUE) {
			qlvtCapPhepGplvPhuongTienImpl.setNgayCapPhep(null);
		}
		else {
			qlvtCapPhepGplvPhuongTienImpl.setNgayCapPhep(new Date(ngayCapPhep));
		}

		if (ngayGiaHan == Long.MIN_VALUE) {
			qlvtCapPhepGplvPhuongTienImpl.setNgayGiaHan(null);
		}
		else {
			qlvtCapPhepGplvPhuongTienImpl.setNgayGiaHan(new Date(ngayGiaHan));
		}

		if (ngayHetHan == Long.MIN_VALUE) {
			qlvtCapPhepGplvPhuongTienImpl.setNgayHetHan(null);
		}
		else {
			qlvtCapPhepGplvPhuongTienImpl.setNgayHetHan(new Date(ngayHetHan));
		}

		if (cuaKhau == null) {
			qlvtCapPhepGplvPhuongTienImpl.setCuaKhau(StringPool.BLANK);
		}
		else {
			qlvtCapPhepGplvPhuongTienImpl.setCuaKhau(cuaKhau);
		}

		if (maCuaKhau == null) {
			qlvtCapPhepGplvPhuongTienImpl.setMaCuaKhau(StringPool.BLANK);
		}
		else {
			qlvtCapPhepGplvPhuongTienImpl.setMaCuaKhau(maCuaKhau);
		}

		if (hinhThucHoatDong == null) {
			qlvtCapPhepGplvPhuongTienImpl.setHinhThucHoatDong(StringPool.BLANK);
		}
		else {
			qlvtCapPhepGplvPhuongTienImpl.setHinhThucHoatDong(hinhThucHoatDong);
		}

		if (thoiHanPhuHieu == Long.MIN_VALUE) {
			qlvtCapPhepGplvPhuongTienImpl.setThoiHanPhuHieu(null);
		}
		else {
			qlvtCapPhepGplvPhuongTienImpl.setThoiHanPhuHieu(new Date(
					thoiHanPhuHieu));
		}

		qlvtCapPhepGplvPhuongTienImpl.setSoHuu(soHuu);

		if (chuSoHuu == null) {
			qlvtCapPhepGplvPhuongTienImpl.setChuSoHuu(StringPool.BLANK);
		}
		else {
			qlvtCapPhepGplvPhuongTienImpl.setChuSoHuu(chuSoHuu);
		}

		if (thoiHanChoThue == Long.MIN_VALUE) {
			qlvtCapPhepGplvPhuongTienImpl.setThoiHanChoThue(null);
		}
		else {
			qlvtCapPhepGplvPhuongTienImpl.setThoiHanChoThue(new Date(
					thoiHanChoThue));
		}

		qlvtCapPhepGplvPhuongTienImpl.setHopDongSauCung(hopDongSauCung);

		if (mucPhi == null) {
			qlvtCapPhepGplvPhuongTienImpl.setMucPhi(StringPool.BLANK);
		}
		else {
			qlvtCapPhepGplvPhuongTienImpl.setMucPhi(mucPhi);
		}

		if (thongTinXuLyViPham == null) {
			qlvtCapPhepGplvPhuongTienImpl.setThongTinXuLyViPham(StringPool.BLANK);
		}
		else {
			qlvtCapPhepGplvPhuongTienImpl.setThongTinXuLyViPham(thongTinXuLyViPham);
		}

		if (trangThai == null) {
			qlvtCapPhepGplvPhuongTienImpl.setTrangThai(StringPool.BLANK);
		}
		else {
			qlvtCapPhepGplvPhuongTienImpl.setTrangThai(trangThai);
		}

		qlvtCapPhepGplvPhuongTienImpl.setFileId(fileId);

		qlvtCapPhepGplvPhuongTienImpl.resetOriginalValues();

		return qlvtCapPhepGplvPhuongTienImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		giayPhepLienVanId = objectInput.readLong();
		soPhuHieu = objectInput.readUTF();
		ngayCapPhep = objectInput.readLong();
		ngayGiaHan = objectInput.readLong();
		ngayHetHan = objectInput.readLong();
		cuaKhau = objectInput.readUTF();
		maCuaKhau = objectInput.readUTF();
		hinhThucHoatDong = objectInput.readUTF();
		thoiHanPhuHieu = objectInput.readLong();
		soHuu = objectInput.readInt();
		chuSoHuu = objectInput.readUTF();
		thoiHanChoThue = objectInput.readLong();
		hopDongSauCung = objectInput.readInt();
		mucPhi = objectInput.readUTF();
		thongTinXuLyViPham = objectInput.readUTF();
		trangThai = objectInput.readUTF();
		fileId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(giayPhepLienVanId);

		if (soPhuHieu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soPhuHieu);
		}

		objectOutput.writeLong(ngayCapPhep);
		objectOutput.writeLong(ngayGiaHan);
		objectOutput.writeLong(ngayHetHan);

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

		if (hinhThucHoatDong == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(hinhThucHoatDong);
		}

		objectOutput.writeLong(thoiHanPhuHieu);
		objectOutput.writeInt(soHuu);

		if (chuSoHuu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(chuSoHuu);
		}

		objectOutput.writeLong(thoiHanChoThue);
		objectOutput.writeInt(hopDongSauCung);

		if (mucPhi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mucPhi);
		}

		if (thongTinXuLyViPham == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(thongTinXuLyViPham);
		}

		if (trangThai == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(trangThai);
		}

		objectOutput.writeLong(fileId);
	}

	public long id;
	public long giayPhepLienVanId;
	public String soPhuHieu;
	public long ngayCapPhep;
	public long ngayGiaHan;
	public long ngayHetHan;
	public String cuaKhau;
	public String maCuaKhau;
	public String hinhThucHoatDong;
	public long thoiHanPhuHieu;
	public int soHuu;
	public String chuSoHuu;
	public long thoiHanChoThue;
	public int hopDongSauCung;
	public String mucPhi;
	public String thongTinXuLyViPham;
	public String trangThai;
	public long fileId;
}