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

import vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepPhuongTienVanTai;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing QlvtCapPhepPhuongTienVanTai in entity cache.
 *
 * @author NhanNc
 * @see QlvtCapPhepPhuongTienVanTai
 * @generated
 */
public class QlvtCapPhepPhuongTienVanTaiCacheModel implements CacheModel<QlvtCapPhepPhuongTienVanTai>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{id=");
		sb.append(id);
		sb.append(", bienSoXe=");
		sb.append(bienSoXe);
		sb.append(", nhanHieu=");
		sb.append(nhanHieu);
		sb.append(", trongTai=");
		sb.append(trongTai);
		sb.append(", noiSanXuat=");
		sb.append(noiSanXuat);
		sb.append(", namSanXuat=");
		sb.append(namSanXuat);
		sb.append(", soChoNgoi=");
		sb.append(soChoNgoi);
		sb.append(", hinhThucSoHuuXe=");
		sb.append(hinhThucSoHuuXe);
		sb.append(", nienHanSuDungGiayDangKiem=");
		sb.append(nienHanSuDungGiayDangKiem);
		sb.append(", nienHanSuDungND86=");
		sb.append(nienHanSuDungND86);
		sb.append(", soKhung=");
		sb.append(soKhung);
		sb.append(", soMay=");
		sb.append(soMay);
		sb.append(", mauSon=");
		sb.append(mauSon);
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
	public QlvtCapPhepPhuongTienVanTai toEntityModel() {
		QlvtCapPhepPhuongTienVanTaiImpl qlvtCapPhepPhuongTienVanTaiImpl = new QlvtCapPhepPhuongTienVanTaiImpl();

		qlvtCapPhepPhuongTienVanTaiImpl.setId(id);

		if (bienSoXe == null) {
			qlvtCapPhepPhuongTienVanTaiImpl.setBienSoXe(StringPool.BLANK);
		}
		else {
			qlvtCapPhepPhuongTienVanTaiImpl.setBienSoXe(bienSoXe);
		}

		if (nhanHieu == null) {
			qlvtCapPhepPhuongTienVanTaiImpl.setNhanHieu(StringPool.BLANK);
		}
		else {
			qlvtCapPhepPhuongTienVanTaiImpl.setNhanHieu(nhanHieu);
		}

		qlvtCapPhepPhuongTienVanTaiImpl.setTrongTai(trongTai);

		if (noiSanXuat == null) {
			qlvtCapPhepPhuongTienVanTaiImpl.setNoiSanXuat(StringPool.BLANK);
		}
		else {
			qlvtCapPhepPhuongTienVanTaiImpl.setNoiSanXuat(noiSanXuat);
		}

		qlvtCapPhepPhuongTienVanTaiImpl.setNamSanXuat(namSanXuat);
		qlvtCapPhepPhuongTienVanTaiImpl.setSoChoNgoi(soChoNgoi);

		if (hinhThucSoHuuXe == null) {
			qlvtCapPhepPhuongTienVanTaiImpl.setHinhThucSoHuuXe(StringPool.BLANK);
		}
		else {
			qlvtCapPhepPhuongTienVanTaiImpl.setHinhThucSoHuuXe(hinhThucSoHuuXe);
		}

		qlvtCapPhepPhuongTienVanTaiImpl.setNienHanSuDungGiayDangKiem(nienHanSuDungGiayDangKiem);
		qlvtCapPhepPhuongTienVanTaiImpl.setNienHanSuDungND86(nienHanSuDungND86);

		if (soKhung == null) {
			qlvtCapPhepPhuongTienVanTaiImpl.setSoKhung(StringPool.BLANK);
		}
		else {
			qlvtCapPhepPhuongTienVanTaiImpl.setSoKhung(soKhung);
		}

		if (soMay == null) {
			qlvtCapPhepPhuongTienVanTaiImpl.setSoMay(StringPool.BLANK);
		}
		else {
			qlvtCapPhepPhuongTienVanTaiImpl.setSoMay(soMay);
		}

		if (mauSon == null) {
			qlvtCapPhepPhuongTienVanTaiImpl.setMauSon(StringPool.BLANK);
		}
		else {
			qlvtCapPhepPhuongTienVanTaiImpl.setMauSon(mauSon);
		}

		if (thongTinXuLyViPham == null) {
			qlvtCapPhepPhuongTienVanTaiImpl.setThongTinXuLyViPham(StringPool.BLANK);
		}
		else {
			qlvtCapPhepPhuongTienVanTaiImpl.setThongTinXuLyViPham(thongTinXuLyViPham);
		}

		if (trangThai == null) {
			qlvtCapPhepPhuongTienVanTaiImpl.setTrangThai(StringPool.BLANK);
		}
		else {
			qlvtCapPhepPhuongTienVanTaiImpl.setTrangThai(trangThai);
		}

		qlvtCapPhepPhuongTienVanTaiImpl.setFileId(fileId);

		qlvtCapPhepPhuongTienVanTaiImpl.resetOriginalValues();

		return qlvtCapPhepPhuongTienVanTaiImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		bienSoXe = objectInput.readUTF();
		nhanHieu = objectInput.readUTF();
		trongTai = objectInput.readInt();
		noiSanXuat = objectInput.readUTF();
		namSanXuat = objectInput.readInt();
		soChoNgoi = objectInput.readInt();
		hinhThucSoHuuXe = objectInput.readUTF();
		nienHanSuDungGiayDangKiem = objectInput.readInt();
		nienHanSuDungND86 = objectInput.readInt();
		soKhung = objectInput.readUTF();
		soMay = objectInput.readUTF();
		mauSon = objectInput.readUTF();
		thongTinXuLyViPham = objectInput.readUTF();
		trangThai = objectInput.readUTF();
		fileId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (bienSoXe == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(bienSoXe);
		}

		if (nhanHieu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nhanHieu);
		}

		objectOutput.writeInt(trongTai);

		if (noiSanXuat == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(noiSanXuat);
		}

		objectOutput.writeInt(namSanXuat);
		objectOutput.writeInt(soChoNgoi);

		if (hinhThucSoHuuXe == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(hinhThucSoHuuXe);
		}

		objectOutput.writeInt(nienHanSuDungGiayDangKiem);
		objectOutput.writeInt(nienHanSuDungND86);

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
	public String bienSoXe;
	public String nhanHieu;
	public int trongTai;
	public String noiSanXuat;
	public int namSanXuat;
	public int soChoNgoi;
	public String hinhThucSoHuuXe;
	public int nienHanSuDungGiayDangKiem;
	public int nienHanSuDungND86;
	public String soKhung;
	public String soMay;
	public String mauSon;
	public String thongTinXuLyViPham;
	public String trangThai;
	public long fileId;
}