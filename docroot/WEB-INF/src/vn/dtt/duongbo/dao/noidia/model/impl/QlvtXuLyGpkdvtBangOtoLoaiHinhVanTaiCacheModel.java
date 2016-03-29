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

import vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai in entity cache.
 *
 * @author NoiPham
 * @see QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai
 * @generated
 */
public class QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiCacheModel implements CacheModel<QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{id=");
		sb.append(id);
		sb.append(", gpkdvtBangOtoId=");
		sb.append(gpkdvtBangOtoId);
		sb.append(", maLoaiHinhHoatDong=");
		sb.append(maLoaiHinhHoatDong);
		sb.append(", loaiHinhKinhDoanhCuThe=");
		sb.append(loaiHinhKinhDoanhCuThe);
		sb.append(", soLuongPhuongTien=");
		sb.append(soLuongPhuongTien);
		sb.append(", thietBiGiamSatHanhTrinh=");
		sb.append(thietBiGiamSatHanhTrinh);
		sb.append(", phamViHoatDong=");
		sb.append(phamViHoatDong);
		sb.append(", tuyenTu=");
		sb.append(tuyenTu);
		sb.append(", tuyenDen=");
		sb.append(tuyenDen);
		sb.append(", soChuyen=");
		sb.append(soChuyen);
		sb.append(", mauSon=");
		sb.append(mauSon);
		sb.append(", ketQuaXuLy=");
		sb.append(ketQuaXuLy);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai toEntityModel() {
		QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl =
			new QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl();

		qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.setId(id);
		qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.setGpkdvtBangOtoId(gpkdvtBangOtoId);

		if (maLoaiHinhHoatDong == null) {
			qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.setMaLoaiHinhHoatDong(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.setMaLoaiHinhHoatDong(maLoaiHinhHoatDong);
		}

		if (loaiHinhKinhDoanhCuThe == null) {
			qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.setLoaiHinhKinhDoanhCuThe(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.setLoaiHinhKinhDoanhCuThe(loaiHinhKinhDoanhCuThe);
		}

		qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.setSoLuongPhuongTien(soLuongPhuongTien);
		qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.setThietBiGiamSatHanhTrinh(thietBiGiamSatHanhTrinh);

		if (phamViHoatDong == null) {
			qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.setPhamViHoatDong(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.setPhamViHoatDong(phamViHoatDong);
		}

		if (tuyenTu == null) {
			qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.setTuyenTu(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.setTuyenTu(tuyenTu);
		}

		if (tuyenDen == null) {
			qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.setTuyenDen(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.setTuyenDen(tuyenDen);
		}

		qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.setSoChuyen(soChuyen);

		if (mauSon == null) {
			qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.setMauSon(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.setMauSon(mauSon);
		}

		if (ketQuaXuLy == null) {
			qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.setKetQuaXuLy(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.setKetQuaXuLy(ketQuaXuLy);
		}

		qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.resetOriginalValues();

		return qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		gpkdvtBangOtoId = objectInput.readInt();
		maLoaiHinhHoatDong = objectInput.readUTF();
		loaiHinhKinhDoanhCuThe = objectInput.readUTF();
		soLuongPhuongTien = objectInput.readInt();
		thietBiGiamSatHanhTrinh = objectInput.readLong();
		phamViHoatDong = objectInput.readUTF();
		tuyenTu = objectInput.readUTF();
		tuyenDen = objectInput.readUTF();
		soChuyen = objectInput.readInt();
		mauSon = objectInput.readUTF();
		ketQuaXuLy = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeInt(gpkdvtBangOtoId);

		if (maLoaiHinhHoatDong == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maLoaiHinhHoatDong);
		}

		if (loaiHinhKinhDoanhCuThe == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(loaiHinhKinhDoanhCuThe);
		}

		objectOutput.writeInt(soLuongPhuongTien);
		objectOutput.writeLong(thietBiGiamSatHanhTrinh);

		if (phamViHoatDong == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(phamViHoatDong);
		}

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
	}

	public long id;
	public int gpkdvtBangOtoId;
	public String maLoaiHinhHoatDong;
	public String loaiHinhKinhDoanhCuThe;
	public int soLuongPhuongTien;
	public long thietBiGiamSatHanhTrinh;
	public String phamViHoatDong;
	public String tuyenTu;
	public String tuyenDen;
	public int soChuyen;
	public String mauSon;
	public String ketQuaXuLy;
}