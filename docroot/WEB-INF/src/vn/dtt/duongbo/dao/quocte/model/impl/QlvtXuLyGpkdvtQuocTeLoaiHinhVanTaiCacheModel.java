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

import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai in entity cache.
 *
 * @author NoiPham
 * @see QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai
 * @generated
 */
public class QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiCacheModel implements CacheModel<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", thongTinCapGpkdVanTaiId=");
		sb.append(thongTinCapGpkdVanTaiId);
		sb.append(", maLoaiHinhHoatDong=");
		sb.append(maLoaiHinhHoatDong);
		sb.append(", soLuongPhuongTien=");
		sb.append(soLuongPhuongTien);
		sb.append(", thietBiGiamSatHanhTrinh=");
		sb.append(thietBiGiamSatHanhTrinh);
		sb.append(", phamViHoatDong=");
		sb.append(phamViHoatDong);
		sb.append(", soChuyen=");
		sb.append(soChuyen);
		sb.append(", mauSon=");
		sb.append(mauSon);
		sb.append(", ketQuaXuLy=");
		sb.append(ketQuaXuLy);
		sb.append(", lyDoKhongDat=");
		sb.append(lyDoKhongDat);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai toEntityModel() {
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiImpl qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiImpl =
			new QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiImpl();

		qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiImpl.setId(id);
		qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiImpl.setThongTinCapGpkdVanTaiId(thongTinCapGpkdVanTaiId);

		if (maLoaiHinhHoatDong == null) {
			qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiImpl.setMaLoaiHinhHoatDong(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiImpl.setMaLoaiHinhHoatDong(maLoaiHinhHoatDong);
		}

		qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiImpl.setSoLuongPhuongTien(soLuongPhuongTien);
		qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiImpl.setThietBiGiamSatHanhTrinh(thietBiGiamSatHanhTrinh);

		if (phamViHoatDong == null) {
			qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiImpl.setPhamViHoatDong(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiImpl.setPhamViHoatDong(phamViHoatDong);
		}

		qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiImpl.setSoChuyen(soChuyen);

		if (mauSon == null) {
			qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiImpl.setMauSon(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiImpl.setMauSon(mauSon);
		}

		if (ketQuaXuLy == null) {
			qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiImpl.setKetQuaXuLy(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiImpl.setKetQuaXuLy(ketQuaXuLy);
		}

		if (lyDoKhongDat == null) {
			qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiImpl.setLyDoKhongDat(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiImpl.setLyDoKhongDat(lyDoKhongDat);
		}

		qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiImpl.resetOriginalValues();

		return qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		thongTinCapGpkdVanTaiId = objectInput.readInt();
		maLoaiHinhHoatDong = objectInput.readUTF();
		soLuongPhuongTien = objectInput.readInt();
		thietBiGiamSatHanhTrinh = objectInput.readLong();
		phamViHoatDong = objectInput.readUTF();
		soChuyen = objectInput.readInt();
		mauSon = objectInput.readUTF();
		ketQuaXuLy = objectInput.readUTF();
		lyDoKhongDat = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeInt(thongTinCapGpkdVanTaiId);

		if (maLoaiHinhHoatDong == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maLoaiHinhHoatDong);
		}

		objectOutput.writeInt(soLuongPhuongTien);
		objectOutput.writeLong(thietBiGiamSatHanhTrinh);

		if (phamViHoatDong == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(phamViHoatDong);
		}

		objectOutput.writeInt(soChuyen);

		if (mauSon == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mauSon);
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
	}

	public long id;
	public int thongTinCapGpkdVanTaiId;
	public String maLoaiHinhHoatDong;
	public int soLuongPhuongTien;
	public long thietBiGiamSatHanhTrinh;
	public String phamViHoatDong;
	public int soChuyen;
	public String mauSon;
	public String ketQuaXuLy;
	public String lyDoKhongDat;
}