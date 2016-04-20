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

package vn.dtt.duongbo.dao.noidia.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOto;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QlvtXuLyGpkdvtBangOto in entity cache.
 *
 * @author NoiPham
 * @see QlvtXuLyGpkdvtBangOto
 * @generated
 */
public class QlvtXuLyGpkdvtBangOtoCacheModel implements CacheModel<QlvtXuLyGpkdvtBangOto>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(45);

		sb.append("{id=");
		sb.append(id);
		sb.append(", thongTinXuLyId=");
		sb.append(thongTinXuLyId);
		sb.append(", loaiHinhCap=");
		sb.append(loaiHinhCap);
		sb.append(", soGpkdVanTaiBangOto=");
		sb.append(soGpkdVanTaiBangOto);
		sb.append(", ngayCapGpkdVanTaiBangOto=");
		sb.append(ngayCapGpkdVanTaiBangOto);
		sb.append(", coQuanCapGpkdVanTaiBangOto=");
		sb.append(coQuanCapGpkdVanTaiBangOto);
		sb.append(", ngayHetHanGpkdVanTaiBangOto=");
		sb.append(ngayHetHanGpkdVanTaiBangOto);
		sb.append(", nguoiTrucTiepDieuHanh=");
		sb.append(nguoiTrucTiepDieuHanh);
		sb.append(", soCmtNguoiDieuHanh=");
		sb.append(soCmtNguoiDieuHanh);
		sb.append(", ngayCapNguoiDieuHanh=");
		sb.append(ngayCapNguoiDieuHanh);
		sb.append(", noiCapNguoiDieuHanh=");
		sb.append(noiCapNguoiDieuHanh);
		sb.append(", bangCapNguoiDieuHanh=");
		sb.append(bangCapNguoiDieuHanh);
		sb.append(", thoiGianBatDauDieuHanh=");
		sb.append(thoiGianBatDauDieuHanh);
		sb.append(", thoiGianKetThucDieuHanh=");
		sb.append(thoiGianKetThucDieuHanh);
		sb.append(", soGiayPhepNguoiDieuHanh=");
		sb.append(soGiayPhepNguoiDieuHanh);
		sb.append(", lanCapNguoiDieuHanh=");
		sb.append(lanCapNguoiDieuHanh);
		sb.append(", ngayCapCcDieuHanh=");
		sb.append(ngayCapCcDieuHanh);
		sb.append(", ngayHetHanCcDieuHanh=");
		sb.append(ngayHetHanCcDieuHanh);
		sb.append(", ketQuaXuLy=");
		sb.append(ketQuaXuLy);
		sb.append(", lyDoKhongDat=");
		sb.append(lyDoKhongDat);
		sb.append(", ketQuaXuLyNguoiDieuHanh=");
		sb.append(ketQuaXuLyNguoiDieuHanh);
		sb.append(", lyDoKhongDatNguoiDieuHanh=");
		sb.append(lyDoKhongDatNguoiDieuHanh);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QlvtXuLyGpkdvtBangOto toEntityModel() {
		QlvtXuLyGpkdvtBangOtoImpl qlvtXuLyGpkdvtBangOtoImpl = new QlvtXuLyGpkdvtBangOtoImpl();

		qlvtXuLyGpkdvtBangOtoImpl.setId(id);
		qlvtXuLyGpkdvtBangOtoImpl.setThongTinXuLyId(thongTinXuLyId);

		if (loaiHinhCap == null) {
			qlvtXuLyGpkdvtBangOtoImpl.setLoaiHinhCap(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpkdvtBangOtoImpl.setLoaiHinhCap(loaiHinhCap);
		}

		if (soGpkdVanTaiBangOto == null) {
			qlvtXuLyGpkdvtBangOtoImpl.setSoGpkdVanTaiBangOto(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpkdvtBangOtoImpl.setSoGpkdVanTaiBangOto(soGpkdVanTaiBangOto);
		}

		if (ngayCapGpkdVanTaiBangOto == Long.MIN_VALUE) {
			qlvtXuLyGpkdvtBangOtoImpl.setNgayCapGpkdVanTaiBangOto(null);
		}
		else {
			qlvtXuLyGpkdvtBangOtoImpl.setNgayCapGpkdVanTaiBangOto(new Date(
					ngayCapGpkdVanTaiBangOto));
		}

		if (coQuanCapGpkdVanTaiBangOto == null) {
			qlvtXuLyGpkdvtBangOtoImpl.setCoQuanCapGpkdVanTaiBangOto(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpkdvtBangOtoImpl.setCoQuanCapGpkdVanTaiBangOto(coQuanCapGpkdVanTaiBangOto);
		}

		if (ngayHetHanGpkdVanTaiBangOto == Long.MIN_VALUE) {
			qlvtXuLyGpkdvtBangOtoImpl.setNgayHetHanGpkdVanTaiBangOto(null);
		}
		else {
			qlvtXuLyGpkdvtBangOtoImpl.setNgayHetHanGpkdVanTaiBangOto(new Date(
					ngayHetHanGpkdVanTaiBangOto));
		}

		if (nguoiTrucTiepDieuHanh == null) {
			qlvtXuLyGpkdvtBangOtoImpl.setNguoiTrucTiepDieuHanh(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpkdvtBangOtoImpl.setNguoiTrucTiepDieuHanh(nguoiTrucTiepDieuHanh);
		}

		if (soCmtNguoiDieuHanh == null) {
			qlvtXuLyGpkdvtBangOtoImpl.setSoCmtNguoiDieuHanh(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpkdvtBangOtoImpl.setSoCmtNguoiDieuHanh(soCmtNguoiDieuHanh);
		}

		if (ngayCapNguoiDieuHanh == Long.MIN_VALUE) {
			qlvtXuLyGpkdvtBangOtoImpl.setNgayCapNguoiDieuHanh(null);
		}
		else {
			qlvtXuLyGpkdvtBangOtoImpl.setNgayCapNguoiDieuHanh(new Date(
					ngayCapNguoiDieuHanh));
		}

		if (noiCapNguoiDieuHanh == null) {
			qlvtXuLyGpkdvtBangOtoImpl.setNoiCapNguoiDieuHanh(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpkdvtBangOtoImpl.setNoiCapNguoiDieuHanh(noiCapNguoiDieuHanh);
		}

		if (bangCapNguoiDieuHanh == null) {
			qlvtXuLyGpkdvtBangOtoImpl.setBangCapNguoiDieuHanh(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpkdvtBangOtoImpl.setBangCapNguoiDieuHanh(bangCapNguoiDieuHanh);
		}

		if (thoiGianBatDauDieuHanh == Long.MIN_VALUE) {
			qlvtXuLyGpkdvtBangOtoImpl.setThoiGianBatDauDieuHanh(null);
		}
		else {
			qlvtXuLyGpkdvtBangOtoImpl.setThoiGianBatDauDieuHanh(new Date(
					thoiGianBatDauDieuHanh));
		}

		if (thoiGianKetThucDieuHanh == Long.MIN_VALUE) {
			qlvtXuLyGpkdvtBangOtoImpl.setThoiGianKetThucDieuHanh(null);
		}
		else {
			qlvtXuLyGpkdvtBangOtoImpl.setThoiGianKetThucDieuHanh(new Date(
					thoiGianKetThucDieuHanh));
		}

		if (soGiayPhepNguoiDieuHanh == null) {
			qlvtXuLyGpkdvtBangOtoImpl.setSoGiayPhepNguoiDieuHanh(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpkdvtBangOtoImpl.setSoGiayPhepNguoiDieuHanh(soGiayPhepNguoiDieuHanh);
		}

		qlvtXuLyGpkdvtBangOtoImpl.setLanCapNguoiDieuHanh(lanCapNguoiDieuHanh);

		if (ngayCapCcDieuHanh == Long.MIN_VALUE) {
			qlvtXuLyGpkdvtBangOtoImpl.setNgayCapCcDieuHanh(null);
		}
		else {
			qlvtXuLyGpkdvtBangOtoImpl.setNgayCapCcDieuHanh(new Date(
					ngayCapCcDieuHanh));
		}

		if (ngayHetHanCcDieuHanh == Long.MIN_VALUE) {
			qlvtXuLyGpkdvtBangOtoImpl.setNgayHetHanCcDieuHanh(null);
		}
		else {
			qlvtXuLyGpkdvtBangOtoImpl.setNgayHetHanCcDieuHanh(new Date(
					ngayHetHanCcDieuHanh));
		}

		if (ketQuaXuLy == null) {
			qlvtXuLyGpkdvtBangOtoImpl.setKetQuaXuLy(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpkdvtBangOtoImpl.setKetQuaXuLy(ketQuaXuLy);
		}

		if (lyDoKhongDat == null) {
			qlvtXuLyGpkdvtBangOtoImpl.setLyDoKhongDat(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpkdvtBangOtoImpl.setLyDoKhongDat(lyDoKhongDat);
		}

		if (ketQuaXuLyNguoiDieuHanh == null) {
			qlvtXuLyGpkdvtBangOtoImpl.setKetQuaXuLyNguoiDieuHanh(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpkdvtBangOtoImpl.setKetQuaXuLyNguoiDieuHanh(ketQuaXuLyNguoiDieuHanh);
		}

		if (lyDoKhongDatNguoiDieuHanh == null) {
			qlvtXuLyGpkdvtBangOtoImpl.setLyDoKhongDatNguoiDieuHanh(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpkdvtBangOtoImpl.setLyDoKhongDatNguoiDieuHanh(lyDoKhongDatNguoiDieuHanh);
		}

		qlvtXuLyGpkdvtBangOtoImpl.resetOriginalValues();

		return qlvtXuLyGpkdvtBangOtoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		thongTinXuLyId = objectInput.readInt();
		loaiHinhCap = objectInput.readUTF();
		soGpkdVanTaiBangOto = objectInput.readUTF();
		ngayCapGpkdVanTaiBangOto = objectInput.readLong();
		coQuanCapGpkdVanTaiBangOto = objectInput.readUTF();
		ngayHetHanGpkdVanTaiBangOto = objectInput.readLong();
		nguoiTrucTiepDieuHanh = objectInput.readUTF();
		soCmtNguoiDieuHanh = objectInput.readUTF();
		ngayCapNguoiDieuHanh = objectInput.readLong();
		noiCapNguoiDieuHanh = objectInput.readUTF();
		bangCapNguoiDieuHanh = objectInput.readUTF();
		thoiGianBatDauDieuHanh = objectInput.readLong();
		thoiGianKetThucDieuHanh = objectInput.readLong();
		soGiayPhepNguoiDieuHanh = objectInput.readUTF();
		lanCapNguoiDieuHanh = objectInput.readInt();
		ngayCapCcDieuHanh = objectInput.readLong();
		ngayHetHanCcDieuHanh = objectInput.readLong();
		ketQuaXuLy = objectInput.readUTF();
		lyDoKhongDat = objectInput.readUTF();
		ketQuaXuLyNguoiDieuHanh = objectInput.readUTF();
		lyDoKhongDatNguoiDieuHanh = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeInt(thongTinXuLyId);

		if (loaiHinhCap == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(loaiHinhCap);
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

		objectOutput.writeLong(ngayHetHanGpkdVanTaiBangOto);

		if (nguoiTrucTiepDieuHanh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nguoiTrucTiepDieuHanh);
		}

		if (soCmtNguoiDieuHanh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soCmtNguoiDieuHanh);
		}

		objectOutput.writeLong(ngayCapNguoiDieuHanh);

		if (noiCapNguoiDieuHanh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(noiCapNguoiDieuHanh);
		}

		if (bangCapNguoiDieuHanh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(bangCapNguoiDieuHanh);
		}

		objectOutput.writeLong(thoiGianBatDauDieuHanh);
		objectOutput.writeLong(thoiGianKetThucDieuHanh);

		if (soGiayPhepNguoiDieuHanh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soGiayPhepNguoiDieuHanh);
		}

		objectOutput.writeInt(lanCapNguoiDieuHanh);
		objectOutput.writeLong(ngayCapCcDieuHanh);
		objectOutput.writeLong(ngayHetHanCcDieuHanh);

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

		if (ketQuaXuLyNguoiDieuHanh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ketQuaXuLyNguoiDieuHanh);
		}

		if (lyDoKhongDatNguoiDieuHanh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lyDoKhongDatNguoiDieuHanh);
		}
	}

	public long id;
	public int thongTinXuLyId;
	public String loaiHinhCap;
	public String soGpkdVanTaiBangOto;
	public long ngayCapGpkdVanTaiBangOto;
	public String coQuanCapGpkdVanTaiBangOto;
	public long ngayHetHanGpkdVanTaiBangOto;
	public String nguoiTrucTiepDieuHanh;
	public String soCmtNguoiDieuHanh;
	public long ngayCapNguoiDieuHanh;
	public String noiCapNguoiDieuHanh;
	public String bangCapNguoiDieuHanh;
	public long thoiGianBatDauDieuHanh;
	public long thoiGianKetThucDieuHanh;
	public String soGiayPhepNguoiDieuHanh;
	public int lanCapNguoiDieuHanh;
	public long ngayCapCcDieuHanh;
	public long ngayHetHanCcDieuHanh;
	public String ketQuaXuLy;
	public String lyDoKhongDat;
	public String ketQuaXuLyNguoiDieuHanh;
	public String lyDoKhongDatNguoiDieuHanh;
}