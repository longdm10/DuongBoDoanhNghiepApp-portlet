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

package vn.dtt.duongbo.dao.nghiepvu.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing QlvtLoaiHinhHoatDongTths in entity cache.
 *
 * @author NhanNc
 * @see QlvtLoaiHinhHoatDongTths
 * @generated
 */
public class QlvtLoaiHinhHoatDongTthsCacheModel implements CacheModel<QlvtLoaiHinhHoatDongTths>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{id=");
		sb.append(id);
		sb.append(", maLoaiHinhHoatDong=");
		sb.append(maLoaiHinhHoatDong);
		sb.append(", thongTinHoSoId=");
		sb.append(thongTinHoSoId);
		sb.append(", soLuongPhuongTien=");
		sb.append(soLuongPhuongTien);
		sb.append(", thietBiGiamSatHanhTrinh=");
		sb.append(thietBiGiamSatHanhTrinh);
		sb.append(", tuyenTu=");
		sb.append(tuyenTu);
		sb.append(", tuyenDen=");
		sb.append(tuyenDen);
		sb.append(", soChuyen=");
		sb.append(soChuyen);
		sb.append(", mauSon=");
		sb.append(mauSon);
		sb.append(", loaiHinhKinhDoanhCuThe=");
		sb.append(loaiHinhKinhDoanhCuThe);
		sb.append(", danhGia=");
		sb.append(danhGia);
		sb.append(", lyDoKhongDat=");
		sb.append(lyDoKhongDat);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QlvtLoaiHinhHoatDongTths toEntityModel() {
		QlvtLoaiHinhHoatDongTthsImpl qlvtLoaiHinhHoatDongTthsImpl = new QlvtLoaiHinhHoatDongTthsImpl();

		qlvtLoaiHinhHoatDongTthsImpl.setId(id);

		if (maLoaiHinhHoatDong == null) {
			qlvtLoaiHinhHoatDongTthsImpl.setMaLoaiHinhHoatDong(StringPool.BLANK);
		}
		else {
			qlvtLoaiHinhHoatDongTthsImpl.setMaLoaiHinhHoatDong(maLoaiHinhHoatDong);
		}

		qlvtLoaiHinhHoatDongTthsImpl.setThongTinHoSoId(thongTinHoSoId);
		qlvtLoaiHinhHoatDongTthsImpl.setSoLuongPhuongTien(soLuongPhuongTien);
		qlvtLoaiHinhHoatDongTthsImpl.setThietBiGiamSatHanhTrinh(thietBiGiamSatHanhTrinh);

		if (tuyenTu == null) {
			qlvtLoaiHinhHoatDongTthsImpl.setTuyenTu(StringPool.BLANK);
		}
		else {
			qlvtLoaiHinhHoatDongTthsImpl.setTuyenTu(tuyenTu);
		}

		if (tuyenDen == null) {
			qlvtLoaiHinhHoatDongTthsImpl.setTuyenDen(StringPool.BLANK);
		}
		else {
			qlvtLoaiHinhHoatDongTthsImpl.setTuyenDen(tuyenDen);
		}

		qlvtLoaiHinhHoatDongTthsImpl.setSoChuyen(soChuyen);

		if (mauSon == null) {
			qlvtLoaiHinhHoatDongTthsImpl.setMauSon(StringPool.BLANK);
		}
		else {
			qlvtLoaiHinhHoatDongTthsImpl.setMauSon(mauSon);
		}

		if (loaiHinhKinhDoanhCuThe == null) {
			qlvtLoaiHinhHoatDongTthsImpl.setLoaiHinhKinhDoanhCuThe(StringPool.BLANK);
		}
		else {
			qlvtLoaiHinhHoatDongTthsImpl.setLoaiHinhKinhDoanhCuThe(loaiHinhKinhDoanhCuThe);
		}

		qlvtLoaiHinhHoatDongTthsImpl.setDanhGia(danhGia);

		if (lyDoKhongDat == null) {
			qlvtLoaiHinhHoatDongTthsImpl.setLyDoKhongDat(StringPool.BLANK);
		}
		else {
			qlvtLoaiHinhHoatDongTthsImpl.setLyDoKhongDat(lyDoKhongDat);
		}

		qlvtLoaiHinhHoatDongTthsImpl.resetOriginalValues();

		return qlvtLoaiHinhHoatDongTthsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		maLoaiHinhHoatDong = objectInput.readUTF();
		thongTinHoSoId = objectInput.readLong();
		soLuongPhuongTien = objectInput.readInt();
		thietBiGiamSatHanhTrinh = objectInput.readInt();
		tuyenTu = objectInput.readUTF();
		tuyenDen = objectInput.readUTF();
		soChuyen = objectInput.readLong();
		mauSon = objectInput.readUTF();
		loaiHinhKinhDoanhCuThe = objectInput.readUTF();
		danhGia = objectInput.readInt();
		lyDoKhongDat = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (maLoaiHinhHoatDong == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maLoaiHinhHoatDong);
		}

		objectOutput.writeLong(thongTinHoSoId);
		objectOutput.writeInt(soLuongPhuongTien);
		objectOutput.writeInt(thietBiGiamSatHanhTrinh);

		if (tuyenTu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tuyenTu);
		}

		if (tuyenDen == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tuyenDen);
		}

		objectOutput.writeLong(soChuyen);

		if (mauSon == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mauSon);
		}

		if (loaiHinhKinhDoanhCuThe == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(loaiHinhKinhDoanhCuThe);
		}

		objectOutput.writeInt(danhGia);

		if (lyDoKhongDat == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lyDoKhongDat);
		}
	}

	public long id;
	public String maLoaiHinhHoatDong;
	public long thongTinHoSoId;
	public int soLuongPhuongTien;
	public int thietBiGiamSatHanhTrinh;
	public String tuyenTu;
	public String tuyenDen;
	public long soChuyen;
	public String mauSon;
	public String loaiHinhKinhDoanhCuThe;
	public int danhGia;
	public String lyDoKhongDat;
}