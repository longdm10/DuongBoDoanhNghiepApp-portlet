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

package vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepBienHieu;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QLVTCapPhepBienHieu in entity cache.
 *
 * @author binhta
 * @see QLVTCapPhepBienHieu
 * @generated
 */
public class QLVTCapPhepBienHieuCacheModel implements CacheModel<QLVTCapPhepBienHieu>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{id=");
		sb.append(id);
		sb.append(", thongTinHoSoId=");
		sb.append(thongTinHoSoId);
		sb.append(", loaiHinhKinhDoanhId=");
		sb.append(loaiHinhKinhDoanhId);
		sb.append(", soPhuHieu=");
		sb.append(soPhuHieu);
		sb.append(", coQuanCapLanDauId=");
		sb.append(coQuanCapLanDauId);
		sb.append(", CoQuanCapPhepId=");
		sb.append(CoQuanCapPhepId);
		sb.append(", ngayCapPhuHieu=");
		sb.append(ngayCapPhuHieu);
		sb.append(", thoiHanPhuHieu=");
		sb.append(thoiHanPhuHieu);
		sb.append(", maTuyenCoDinh=");
		sb.append(maTuyenCoDinh);
		sb.append(", linhVucKinhDoanhXeDuLich=");
		sb.append(linhVucKinhDoanhXeDuLich);
		sb.append(", doanhNghiepChoThue=");
		sb.append(doanhNghiepChoThue);
		sb.append(", thoiHanThue=");
		sb.append(thoiHanThue);
		sb.append(", hopDongSauCung=");
		sb.append(hopDongSauCung);
		sb.append(", ngayCapLanDau=");
		sb.append(ngayCapLanDau);
		sb.append(", lanGiaHan=");
		sb.append(lanGiaHan);
		sb.append(", ghiChu=");
		sb.append(ghiChu);
		sb.append(", trangThai=");
		sb.append(trangThai);
		sb.append(", fileId=");
		sb.append(fileId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QLVTCapPhepBienHieu toEntityModel() {
		QLVTCapPhepBienHieuImpl qlvtCapPhepBienHieuImpl = new QLVTCapPhepBienHieuImpl();

		qlvtCapPhepBienHieuImpl.setId(id);
		qlvtCapPhepBienHieuImpl.setThongTinHoSoId(thongTinHoSoId);
		qlvtCapPhepBienHieuImpl.setLoaiHinhKinhDoanhId(loaiHinhKinhDoanhId);
		qlvtCapPhepBienHieuImpl.setSoPhuHieu(soPhuHieu);
		qlvtCapPhepBienHieuImpl.setCoQuanCapLanDauId(coQuanCapLanDauId);
		qlvtCapPhepBienHieuImpl.setCoQuanCapPhepId(CoQuanCapPhepId);

		if (ngayCapPhuHieu == Long.MIN_VALUE) {
			qlvtCapPhepBienHieuImpl.setNgayCapPhuHieu(null);
		}
		else {
			qlvtCapPhepBienHieuImpl.setNgayCapPhuHieu(new Date(ngayCapPhuHieu));
		}

		if (thoiHanPhuHieu == Long.MIN_VALUE) {
			qlvtCapPhepBienHieuImpl.setThoiHanPhuHieu(null);
		}
		else {
			qlvtCapPhepBienHieuImpl.setThoiHanPhuHieu(new Date(thoiHanPhuHieu));
		}

		if (maTuyenCoDinh == null) {
			qlvtCapPhepBienHieuImpl.setMaTuyenCoDinh(StringPool.BLANK);
		}
		else {
			qlvtCapPhepBienHieuImpl.setMaTuyenCoDinh(maTuyenCoDinh);
		}

		if (linhVucKinhDoanhXeDuLich == null) {
			qlvtCapPhepBienHieuImpl.setLinhVucKinhDoanhXeDuLich(StringPool.BLANK);
		}
		else {
			qlvtCapPhepBienHieuImpl.setLinhVucKinhDoanhXeDuLich(linhVucKinhDoanhXeDuLich);
		}

		if (doanhNghiepChoThue == null) {
			qlvtCapPhepBienHieuImpl.setDoanhNghiepChoThue(StringPool.BLANK);
		}
		else {
			qlvtCapPhepBienHieuImpl.setDoanhNghiepChoThue(doanhNghiepChoThue);
		}

		if (thoiHanThue == Long.MIN_VALUE) {
			qlvtCapPhepBienHieuImpl.setThoiHanThue(null);
		}
		else {
			qlvtCapPhepBienHieuImpl.setThoiHanThue(new Date(thoiHanThue));
		}

		qlvtCapPhepBienHieuImpl.setHopDongSauCung(hopDongSauCung);

		if (ngayCapLanDau == Long.MIN_VALUE) {
			qlvtCapPhepBienHieuImpl.setNgayCapLanDau(null);
		}
		else {
			qlvtCapPhepBienHieuImpl.setNgayCapLanDau(new Date(ngayCapLanDau));
		}

		qlvtCapPhepBienHieuImpl.setLanGiaHan(lanGiaHan);

		if (ghiChu == null) {
			qlvtCapPhepBienHieuImpl.setGhiChu(StringPool.BLANK);
		}
		else {
			qlvtCapPhepBienHieuImpl.setGhiChu(ghiChu);
		}

		if (trangThai == null) {
			qlvtCapPhepBienHieuImpl.setTrangThai(StringPool.BLANK);
		}
		else {
			qlvtCapPhepBienHieuImpl.setTrangThai(trangThai);
		}

		qlvtCapPhepBienHieuImpl.setFileId(fileId);

		qlvtCapPhepBienHieuImpl.resetOriginalValues();

		return qlvtCapPhepBienHieuImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		thongTinHoSoId = objectInput.readInt();
		loaiHinhKinhDoanhId = objectInput.readInt();
		soPhuHieu = objectInput.readInt();
		coQuanCapLanDauId = objectInput.readInt();
		CoQuanCapPhepId = objectInput.readInt();
		ngayCapPhuHieu = objectInput.readLong();
		thoiHanPhuHieu = objectInput.readLong();
		maTuyenCoDinh = objectInput.readUTF();
		linhVucKinhDoanhXeDuLich = objectInput.readUTF();
		doanhNghiepChoThue = objectInput.readUTF();
		thoiHanThue = objectInput.readLong();
		hopDongSauCung = objectInput.readInt();
		ngayCapLanDau = objectInput.readLong();
		lanGiaHan = objectInput.readInt();
		ghiChu = objectInput.readUTF();
		trangThai = objectInput.readUTF();
		fileId = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(id);
		objectOutput.writeInt(thongTinHoSoId);
		objectOutput.writeInt(loaiHinhKinhDoanhId);
		objectOutput.writeInt(soPhuHieu);
		objectOutput.writeInt(coQuanCapLanDauId);
		objectOutput.writeInt(CoQuanCapPhepId);
		objectOutput.writeLong(ngayCapPhuHieu);
		objectOutput.writeLong(thoiHanPhuHieu);

		if (maTuyenCoDinh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maTuyenCoDinh);
		}

		if (linhVucKinhDoanhXeDuLich == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(linhVucKinhDoanhXeDuLich);
		}

		if (doanhNghiepChoThue == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(doanhNghiepChoThue);
		}

		objectOutput.writeLong(thoiHanThue);
		objectOutput.writeInt(hopDongSauCung);
		objectOutput.writeLong(ngayCapLanDau);
		objectOutput.writeInt(lanGiaHan);

		if (ghiChu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ghiChu);
		}

		if (trangThai == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(trangThai);
		}

		objectOutput.writeInt(fileId);
	}

	public int id;
	public int thongTinHoSoId;
	public int loaiHinhKinhDoanhId;
	public int soPhuHieu;
	public int coQuanCapLanDauId;
	public int CoQuanCapPhepId;
	public long ngayCapPhuHieu;
	public long thoiHanPhuHieu;
	public String maTuyenCoDinh;
	public String linhVucKinhDoanhXeDuLich;
	public String doanhNghiepChoThue;
	public long thoiHanThue;
	public int hopDongSauCung;
	public long ngayCapLanDau;
	public int lanGiaHan;
	public String ghiChu;
	public String trangThai;
	public int fileId;
}