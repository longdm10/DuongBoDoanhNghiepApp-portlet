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

import vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QlvtQuanLyFile in entity cache.
 *
 * @author NhanNc
 * @see QlvtQuanLyFile
 * @generated
 */
public class QlvtQuanLyFileCacheModel implements CacheModel<QlvtQuanLyFile>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{id=");
		sb.append(id);
		sb.append(", tenFile=");
		sb.append(tenFile);
		sb.append(", loaiFile=");
		sb.append(loaiFile);
		sb.append(", thongTinFile=");
		sb.append(thongTinFile);
		sb.append(", ngayTai=");
		sb.append(ngayTai);
		sb.append(", ngayCap=");
		sb.append(ngayCap);
		sb.append(", ngayHetHan=");
		sb.append(ngayHetHan);
		sb.append(", idFile=");
		sb.append(idFile);
		sb.append(", trangThai=");
		sb.append(trangThai);
		sb.append(", doanhNghiepId=");
		sb.append(doanhNghiepId);
		sb.append(", taiKhoan=");
		sb.append(taiKhoan);
		sb.append(", mieuTa=");
		sb.append(mieuTa);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QlvtQuanLyFile toEntityModel() {
		QlvtQuanLyFileImpl qlvtQuanLyFileImpl = new QlvtQuanLyFileImpl();

		qlvtQuanLyFileImpl.setId(id);

		if (tenFile == null) {
			qlvtQuanLyFileImpl.setTenFile(StringPool.BLANK);
		}
		else {
			qlvtQuanLyFileImpl.setTenFile(tenFile);
		}

		qlvtQuanLyFileImpl.setLoaiFile(loaiFile);

		if (thongTinFile == null) {
			qlvtQuanLyFileImpl.setThongTinFile(StringPool.BLANK);
		}
		else {
			qlvtQuanLyFileImpl.setThongTinFile(thongTinFile);
		}

		if (ngayTai == Long.MIN_VALUE) {
			qlvtQuanLyFileImpl.setNgayTai(null);
		}
		else {
			qlvtQuanLyFileImpl.setNgayTai(new Date(ngayTai));
		}

		if (ngayCap == Long.MIN_VALUE) {
			qlvtQuanLyFileImpl.setNgayCap(null);
		}
		else {
			qlvtQuanLyFileImpl.setNgayCap(new Date(ngayCap));
		}

		if (ngayHetHan == Long.MIN_VALUE) {
			qlvtQuanLyFileImpl.setNgayHetHan(null);
		}
		else {
			qlvtQuanLyFileImpl.setNgayHetHan(new Date(ngayHetHan));
		}

		qlvtQuanLyFileImpl.setIdFile(idFile);

		if (trangThai == null) {
			qlvtQuanLyFileImpl.setTrangThai(StringPool.BLANK);
		}
		else {
			qlvtQuanLyFileImpl.setTrangThai(trangThai);
		}

		qlvtQuanLyFileImpl.setDoanhNghiepId(doanhNghiepId);
		qlvtQuanLyFileImpl.setTaiKhoan(taiKhoan);

		if (mieuTa == null) {
			qlvtQuanLyFileImpl.setMieuTa(StringPool.BLANK);
		}
		else {
			qlvtQuanLyFileImpl.setMieuTa(mieuTa);
		}

		qlvtQuanLyFileImpl.resetOriginalValues();

		return qlvtQuanLyFileImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		tenFile = objectInput.readUTF();
		loaiFile = objectInput.readLong();
		thongTinFile = objectInput.readUTF();
		ngayTai = objectInput.readLong();
		ngayCap = objectInput.readLong();
		ngayHetHan = objectInput.readLong();
		idFile = objectInput.readLong();
		trangThai = objectInput.readUTF();
		doanhNghiepId = objectInput.readLong();
		taiKhoan = objectInput.readLong();
		mieuTa = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (tenFile == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenFile);
		}

		objectOutput.writeLong(loaiFile);

		if (thongTinFile == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(thongTinFile);
		}

		objectOutput.writeLong(ngayTai);
		objectOutput.writeLong(ngayCap);
		objectOutput.writeLong(ngayHetHan);
		objectOutput.writeLong(idFile);

		if (trangThai == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(trangThai);
		}

		objectOutput.writeLong(doanhNghiepId);
		objectOutput.writeLong(taiKhoan);

		if (mieuTa == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mieuTa);
		}
	}

	public long id;
	public String tenFile;
	public long loaiFile;
	public String thongTinFile;
	public long ngayTai;
	public long ngayCap;
	public long ngayHetHan;
	public long idFile;
	public String trangThai;
	public long doanhNghiepId;
	public long taiKhoan;
	public String mieuTa;
}