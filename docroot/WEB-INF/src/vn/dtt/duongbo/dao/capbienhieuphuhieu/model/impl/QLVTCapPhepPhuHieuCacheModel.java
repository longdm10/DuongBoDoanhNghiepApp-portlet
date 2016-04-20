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

import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepPhuHieu;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QLVTCapPhepPhuHieu in entity cache.
 *
 * @author binhta
 * @see QLVTCapPhepPhuHieu
 * @generated
 */
public class QLVTCapPhepPhuHieuCacheModel implements CacheModel<QLVTCapPhepPhuHieu>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

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
		sb.append(", noiSanXuat=");
		sb.append(noiSanXuat);
		sb.append(", namSanXuat=");
		sb.append(namSanXuat);
		sb.append(", maTuyenCoDinh=");
		sb.append(maTuyenCoDinh);
		sb.append(", loaiPhuHieu=");
		sb.append(loaiPhuHieu);
		sb.append(", lanGiaHan=");
		sb.append(lanGiaHan);
		sb.append(", ngayCapLanDau=");
		sb.append(ngayCapLanDau);
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
	public QLVTCapPhepPhuHieu toEntityModel() {
		QLVTCapPhepPhuHieuImpl qlvtCapPhepPhuHieuImpl = new QLVTCapPhepPhuHieuImpl();

		qlvtCapPhepPhuHieuImpl.setId(id);
		qlvtCapPhepPhuHieuImpl.setThongTinHoSoId(thongTinHoSoId);
		qlvtCapPhepPhuHieuImpl.setLoaiHinhKinhDoanhId(loaiHinhKinhDoanhId);
		qlvtCapPhepPhuHieuImpl.setSoPhuHieu(soPhuHieu);
		qlvtCapPhepPhuHieuImpl.setCoQuanCapLanDauId(coQuanCapLanDauId);
		qlvtCapPhepPhuHieuImpl.setCoQuanCapPhepId(CoQuanCapPhepId);

		if (ngayCapPhuHieu == Long.MIN_VALUE) {
			qlvtCapPhepPhuHieuImpl.setNgayCapPhuHieu(null);
		}
		else {
			qlvtCapPhepPhuHieuImpl.setNgayCapPhuHieu(new Date(ngayCapPhuHieu));
		}

		if (thoiHanPhuHieu == Long.MIN_VALUE) {
			qlvtCapPhepPhuHieuImpl.setThoiHanPhuHieu(null);
		}
		else {
			qlvtCapPhepPhuHieuImpl.setThoiHanPhuHieu(new Date(thoiHanPhuHieu));
		}

		if (noiSanXuat == null) {
			qlvtCapPhepPhuHieuImpl.setNoiSanXuat(StringPool.BLANK);
		}
		else {
			qlvtCapPhepPhuHieuImpl.setNoiSanXuat(noiSanXuat);
		}

		qlvtCapPhepPhuHieuImpl.setNamSanXuat(namSanXuat);

		if (maTuyenCoDinh == null) {
			qlvtCapPhepPhuHieuImpl.setMaTuyenCoDinh(StringPool.BLANK);
		}
		else {
			qlvtCapPhepPhuHieuImpl.setMaTuyenCoDinh(maTuyenCoDinh);
		}

		if (loaiPhuHieu == null) {
			qlvtCapPhepPhuHieuImpl.setLoaiPhuHieu(StringPool.BLANK);
		}
		else {
			qlvtCapPhepPhuHieuImpl.setLoaiPhuHieu(loaiPhuHieu);
		}

		qlvtCapPhepPhuHieuImpl.setLanGiaHan(lanGiaHan);

		if (ngayCapLanDau == Long.MIN_VALUE) {
			qlvtCapPhepPhuHieuImpl.setNgayCapLanDau(null);
		}
		else {
			qlvtCapPhepPhuHieuImpl.setNgayCapLanDau(new Date(ngayCapLanDau));
		}

		if (ghiChu == null) {
			qlvtCapPhepPhuHieuImpl.setGhiChu(StringPool.BLANK);
		}
		else {
			qlvtCapPhepPhuHieuImpl.setGhiChu(ghiChu);
		}

		if (trangThai == null) {
			qlvtCapPhepPhuHieuImpl.setTrangThai(StringPool.BLANK);
		}
		else {
			qlvtCapPhepPhuHieuImpl.setTrangThai(trangThai);
		}

		qlvtCapPhepPhuHieuImpl.setFileId(fileId);

		qlvtCapPhepPhuHieuImpl.resetOriginalValues();

		return qlvtCapPhepPhuHieuImpl;
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
		noiSanXuat = objectInput.readUTF();
		namSanXuat = objectInput.readInt();
		maTuyenCoDinh = objectInput.readUTF();
		loaiPhuHieu = objectInput.readUTF();
		lanGiaHan = objectInput.readInt();
		ngayCapLanDau = objectInput.readLong();
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

		if (noiSanXuat == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(noiSanXuat);
		}

		objectOutput.writeInt(namSanXuat);

		if (maTuyenCoDinh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maTuyenCoDinh);
		}

		if (loaiPhuHieu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(loaiPhuHieu);
		}

		objectOutput.writeInt(lanGiaHan);
		objectOutput.writeLong(ngayCapLanDau);

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
	public String noiSanXuat;
	public int namSanXuat;
	public String maTuyenCoDinh;
	public String loaiPhuHieu;
	public int lanGiaHan;
	public long ngayCapLanDau;
	public String ghiChu;
	public String trangThai;
	public int fileId;
}