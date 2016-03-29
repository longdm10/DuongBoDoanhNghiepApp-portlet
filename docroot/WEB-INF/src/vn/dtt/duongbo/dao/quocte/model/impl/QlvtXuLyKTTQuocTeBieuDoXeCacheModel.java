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

import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXe;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing QlvtXuLyKTTQuocTeBieuDoXe in entity cache.
 *
 * @author NoiPham
 * @see QlvtXuLyKTTQuocTeBieuDoXe
 * @generated
 */
public class QlvtXuLyKTTQuocTeBieuDoXeCacheModel implements CacheModel<QlvtXuLyKTTQuocTeBieuDoXe>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(id);
		sb.append(", kttQuocTeId=");
		sb.append(kttQuocTeId);
		sb.append(", loaiLuot=");
		sb.append(loaiLuot);
		sb.append(", soThuTuLuot=");
		sb.append(soThuTuLuot);
		sb.append(", maBen=");
		sb.append(maBen);
		sb.append(", gioXuatBen=");
		sb.append(gioXuatBen);
		sb.append(", phuXuatBen=");
		sb.append(phuXuatBen);
		sb.append(", tanXuat=");
		sb.append(tanXuat);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QlvtXuLyKTTQuocTeBieuDoXe toEntityModel() {
		QlvtXuLyKTTQuocTeBieuDoXeImpl qlvtXuLyKTTQuocTeBieuDoXeImpl = new QlvtXuLyKTTQuocTeBieuDoXeImpl();

		qlvtXuLyKTTQuocTeBieuDoXeImpl.setId(id);
		qlvtXuLyKTTQuocTeBieuDoXeImpl.setKttQuocTeId(kttQuocTeId);

		if (loaiLuot == null) {
			qlvtXuLyKTTQuocTeBieuDoXeImpl.setLoaiLuot(StringPool.BLANK);
		}
		else {
			qlvtXuLyKTTQuocTeBieuDoXeImpl.setLoaiLuot(loaiLuot);
		}

		qlvtXuLyKTTQuocTeBieuDoXeImpl.setSoThuTuLuot(soThuTuLuot);

		if (maBen == null) {
			qlvtXuLyKTTQuocTeBieuDoXeImpl.setMaBen(StringPool.BLANK);
		}
		else {
			qlvtXuLyKTTQuocTeBieuDoXeImpl.setMaBen(maBen);
		}

		qlvtXuLyKTTQuocTeBieuDoXeImpl.setGioXuatBen(gioXuatBen);
		qlvtXuLyKTTQuocTeBieuDoXeImpl.setPhuXuatBen(phuXuatBen);
		qlvtXuLyKTTQuocTeBieuDoXeImpl.setTanXuat(tanXuat);

		qlvtXuLyKTTQuocTeBieuDoXeImpl.resetOriginalValues();

		return qlvtXuLyKTTQuocTeBieuDoXeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		kttQuocTeId = objectInput.readInt();
		loaiLuot = objectInput.readUTF();
		soThuTuLuot = objectInput.readInt();
		maBen = objectInput.readUTF();
		gioXuatBen = objectInput.readInt();
		phuXuatBen = objectInput.readInt();
		tanXuat = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeInt(kttQuocTeId);

		if (loaiLuot == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(loaiLuot);
		}

		objectOutput.writeInt(soThuTuLuot);

		if (maBen == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maBen);
		}

		objectOutput.writeInt(gioXuatBen);
		objectOutput.writeInt(phuXuatBen);
		objectOutput.writeInt(tanXuat);
	}

	public long id;
	public int kttQuocTeId;
	public String loaiLuot;
	public int soThuTuLuot;
	public String maBen;
	public int gioXuatBen;
	public int phuXuatBen;
	public int tanXuat;
}