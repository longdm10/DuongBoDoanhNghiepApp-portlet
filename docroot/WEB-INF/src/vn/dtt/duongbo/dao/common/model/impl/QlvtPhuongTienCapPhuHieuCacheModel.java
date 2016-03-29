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

package vn.dtt.duongbo.dao.common.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing QlvtPhuongTienCapPhuHieu in entity cache.
 *
 * @author win_64
 * @see QlvtPhuongTienCapPhuHieu
 * @generated
 */
public class QlvtPhuongTienCapPhuHieuCacheModel implements CacheModel<QlvtPhuongTienCapPhuHieu>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", NhanHieu=");
		sb.append(NhanHieu);
		sb.append(", BienSo=");
		sb.append(BienSo);
		sb.append(", TrongTai=");
		sb.append(TrongTai);
		sb.append(", NuocSanXuat=");
		sb.append(NuocSanXuat);
		sb.append(", NamSanXuat=");
		sb.append(NamSanXuat);
		sb.append(", TuyenHoatDong=");
		sb.append(TuyenHoatDong);
		sb.append(", LoaiHinhHoatDong=");
		sb.append(LoaiHinhHoatDong);
		sb.append(", NoiDungHoSoId=");
		sb.append(NoiDungHoSoId);
		sb.append(", HoSoThuTucId=");
		sb.append(HoSoThuTucId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QlvtPhuongTienCapPhuHieu toEntityModel() {
		QlvtPhuongTienCapPhuHieuImpl qlvtPhuongTienCapPhuHieuImpl = new QlvtPhuongTienCapPhuHieuImpl();

		qlvtPhuongTienCapPhuHieuImpl.setId(id);

		if (NhanHieu == null) {
			qlvtPhuongTienCapPhuHieuImpl.setNhanHieu(StringPool.BLANK);
		}
		else {
			qlvtPhuongTienCapPhuHieuImpl.setNhanHieu(NhanHieu);
		}

		if (BienSo == null) {
			qlvtPhuongTienCapPhuHieuImpl.setBienSo(StringPool.BLANK);
		}
		else {
			qlvtPhuongTienCapPhuHieuImpl.setBienSo(BienSo);
		}

		qlvtPhuongTienCapPhuHieuImpl.setTrongTai(TrongTai);

		if (NuocSanXuat == null) {
			qlvtPhuongTienCapPhuHieuImpl.setNuocSanXuat(StringPool.BLANK);
		}
		else {
			qlvtPhuongTienCapPhuHieuImpl.setNuocSanXuat(NuocSanXuat);
		}

		if (NamSanXuat == null) {
			qlvtPhuongTienCapPhuHieuImpl.setNamSanXuat(StringPool.BLANK);
		}
		else {
			qlvtPhuongTienCapPhuHieuImpl.setNamSanXuat(NamSanXuat);
		}

		if (TuyenHoatDong == null) {
			qlvtPhuongTienCapPhuHieuImpl.setTuyenHoatDong(StringPool.BLANK);
		}
		else {
			qlvtPhuongTienCapPhuHieuImpl.setTuyenHoatDong(TuyenHoatDong);
		}

		if (LoaiHinhHoatDong == null) {
			qlvtPhuongTienCapPhuHieuImpl.setLoaiHinhHoatDong(StringPool.BLANK);
		}
		else {
			qlvtPhuongTienCapPhuHieuImpl.setLoaiHinhHoatDong(LoaiHinhHoatDong);
		}

		qlvtPhuongTienCapPhuHieuImpl.setNoiDungHoSoId(NoiDungHoSoId);
		qlvtPhuongTienCapPhuHieuImpl.setHoSoThuTucId(HoSoThuTucId);

		qlvtPhuongTienCapPhuHieuImpl.resetOriginalValues();

		return qlvtPhuongTienCapPhuHieuImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		NhanHieu = objectInput.readUTF();
		BienSo = objectInput.readUTF();
		TrongTai = objectInput.readLong();
		NuocSanXuat = objectInput.readUTF();
		NamSanXuat = objectInput.readUTF();
		TuyenHoatDong = objectInput.readUTF();
		LoaiHinhHoatDong = objectInput.readUTF();
		NoiDungHoSoId = objectInput.readLong();
		HoSoThuTucId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (NhanHieu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(NhanHieu);
		}

		if (BienSo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BienSo);
		}

		objectOutput.writeLong(TrongTai);

		if (NuocSanXuat == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(NuocSanXuat);
		}

		if (NamSanXuat == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(NamSanXuat);
		}

		if (TuyenHoatDong == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TuyenHoatDong);
		}

		if (LoaiHinhHoatDong == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LoaiHinhHoatDong);
		}

		objectOutput.writeLong(NoiDungHoSoId);
		objectOutput.writeLong(HoSoThuTucId);
	}

	public long id;
	public String NhanHieu;
	public String BienSo;
	public long TrongTai;
	public String NuocSanXuat;
	public String NamSanXuat;
	public String TuyenHoatDong;
	public String LoaiHinhHoatDong;
	public long NoiDungHoSoId;
	public long HoSoThuTucId;
}