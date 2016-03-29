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

package vn.dtt.duongbo.dao.doanhnghiep.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DnDoanhNghiepUser in entity cache.
 *
 * @author win_64
 * @see DnDoanhNghiepUser
 * @generated
 */
public class DnDoanhNghiepUserCacheModel implements CacheModel<DnDoanhNghiepUser>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(id);
		sb.append(", nguoiLamThuTucId=");
		sb.append(nguoiLamThuTucId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", toChucQuanLy=");
		sb.append(toChucQuanLy);
		sb.append(", master=");
		sb.append(master);
		sb.append(", tenTaiKhoan=");
		sb.append(tenTaiKhoan);
		sb.append(", tenNguoiDung=");
		sb.append(tenNguoiDung);
		sb.append(", tinhTrangHoatDong=");
		sb.append(tinhTrangHoatDong);
		sb.append(", dienThoai=");
		sb.append(dienThoai);
		sb.append(", ngayTaoTaiKhoan=");
		sb.append(ngayTaoTaiKhoan);
		sb.append(", ngayMoTaiKhoan=");
		sb.append(ngayMoTaiKhoan);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DnDoanhNghiepUser toEntityModel() {
		DnDoanhNghiepUserImpl dnDoanhNghiepUserImpl = new DnDoanhNghiepUserImpl();

		dnDoanhNghiepUserImpl.setId(id);
		dnDoanhNghiepUserImpl.setNguoiLamThuTucId(nguoiLamThuTucId);
		dnDoanhNghiepUserImpl.setUserId(userId);

		if (toChucQuanLy == null) {
			dnDoanhNghiepUserImpl.setToChucQuanLy(StringPool.BLANK);
		}
		else {
			dnDoanhNghiepUserImpl.setToChucQuanLy(toChucQuanLy);
		}

		if (master == null) {
			dnDoanhNghiepUserImpl.setMaster(StringPool.BLANK);
		}
		else {
			dnDoanhNghiepUserImpl.setMaster(master);
		}

		if (tenTaiKhoan == null) {
			dnDoanhNghiepUserImpl.setTenTaiKhoan(StringPool.BLANK);
		}
		else {
			dnDoanhNghiepUserImpl.setTenTaiKhoan(tenTaiKhoan);
		}

		if (tenNguoiDung == null) {
			dnDoanhNghiepUserImpl.setTenNguoiDung(StringPool.BLANK);
		}
		else {
			dnDoanhNghiepUserImpl.setTenNguoiDung(tenNguoiDung);
		}

		if (tinhTrangHoatDong == null) {
			dnDoanhNghiepUserImpl.setTinhTrangHoatDong(StringPool.BLANK);
		}
		else {
			dnDoanhNghiepUserImpl.setTinhTrangHoatDong(tinhTrangHoatDong);
		}

		if (dienThoai == null) {
			dnDoanhNghiepUserImpl.setDienThoai(StringPool.BLANK);
		}
		else {
			dnDoanhNghiepUserImpl.setDienThoai(dienThoai);
		}

		if (ngayTaoTaiKhoan == Long.MIN_VALUE) {
			dnDoanhNghiepUserImpl.setNgayTaoTaiKhoan(null);
		}
		else {
			dnDoanhNghiepUserImpl.setNgayTaoTaiKhoan(new Date(ngayTaoTaiKhoan));
		}

		if (ngayMoTaiKhoan == Long.MIN_VALUE) {
			dnDoanhNghiepUserImpl.setNgayMoTaiKhoan(null);
		}
		else {
			dnDoanhNghiepUserImpl.setNgayMoTaiKhoan(new Date(ngayMoTaiKhoan));
		}

		dnDoanhNghiepUserImpl.resetOriginalValues();

		return dnDoanhNghiepUserImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		nguoiLamThuTucId = objectInput.readLong();
		userId = objectInput.readLong();
		toChucQuanLy = objectInput.readUTF();
		master = objectInput.readUTF();
		tenTaiKhoan = objectInput.readUTF();
		tenNguoiDung = objectInput.readUTF();
		tinhTrangHoatDong = objectInput.readUTF();
		dienThoai = objectInput.readUTF();
		ngayTaoTaiKhoan = objectInput.readLong();
		ngayMoTaiKhoan = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(nguoiLamThuTucId);
		objectOutput.writeLong(userId);

		if (toChucQuanLy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(toChucQuanLy);
		}

		if (master == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(master);
		}

		if (tenTaiKhoan == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenTaiKhoan);
		}

		if (tenNguoiDung == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenNguoiDung);
		}

		if (tinhTrangHoatDong == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tinhTrangHoatDong);
		}

		if (dienThoai == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dienThoai);
		}

		objectOutput.writeLong(ngayTaoTaiKhoan);
		objectOutput.writeLong(ngayMoTaiKhoan);
	}

	public long id;
	public long nguoiLamThuTucId;
	public long userId;
	public String toChucQuanLy;
	public String master;
	public String tenTaiKhoan;
	public String tenNguoiDung;
	public String tinhTrangHoatDong;
	public String dienThoai;
	public long ngayTaoTaiKhoan;
	public long ngayMoTaiKhoan;
}