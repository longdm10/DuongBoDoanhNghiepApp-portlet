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

import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeDiemDungNghi;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing QlvtXuLyKTTQuocTeDiemDungNghi in entity cache.
 *
 * @author NoiPham
 * @see QlvtXuLyKTTQuocTeDiemDungNghi
 * @generated
 */
public class QlvtXuLyKTTQuocTeDiemDungNghiCacheModel implements CacheModel<QlvtXuLyKTTQuocTeDiemDungNghi>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

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
		sb.append(", soGioDungNghi=");
		sb.append(soGioDungNghi);
		sb.append(", soPhutDungNghi=");
		sb.append(soPhutDungNghi);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QlvtXuLyKTTQuocTeDiemDungNghi toEntityModel() {
		QlvtXuLyKTTQuocTeDiemDungNghiImpl qlvtXuLyKTTQuocTeDiemDungNghiImpl = new QlvtXuLyKTTQuocTeDiemDungNghiImpl();

		qlvtXuLyKTTQuocTeDiemDungNghiImpl.setId(id);
		qlvtXuLyKTTQuocTeDiemDungNghiImpl.setKttQuocTeId(kttQuocTeId);

		if (loaiLuot == null) {
			qlvtXuLyKTTQuocTeDiemDungNghiImpl.setLoaiLuot(StringPool.BLANK);
		}
		else {
			qlvtXuLyKTTQuocTeDiemDungNghiImpl.setLoaiLuot(loaiLuot);
		}

		qlvtXuLyKTTQuocTeDiemDungNghiImpl.setSoThuTuLuot(soThuTuLuot);

		if (maBen == null) {
			qlvtXuLyKTTQuocTeDiemDungNghiImpl.setMaBen(StringPool.BLANK);
		}
		else {
			qlvtXuLyKTTQuocTeDiemDungNghiImpl.setMaBen(maBen);
		}

		qlvtXuLyKTTQuocTeDiemDungNghiImpl.setSoGioDungNghi(soGioDungNghi);
		qlvtXuLyKTTQuocTeDiemDungNghiImpl.setSoPhutDungNghi(soPhutDungNghi);

		qlvtXuLyKTTQuocTeDiemDungNghiImpl.resetOriginalValues();

		return qlvtXuLyKTTQuocTeDiemDungNghiImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		kttQuocTeId = objectInput.readInt();
		loaiLuot = objectInput.readUTF();
		soThuTuLuot = objectInput.readInt();
		maBen = objectInput.readUTF();
		soGioDungNghi = objectInput.readInt();
		soPhutDungNghi = objectInput.readInt();
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

		objectOutput.writeInt(soGioDungNghi);
		objectOutput.writeInt(soPhutDungNghi);
	}

	public long id;
	public int kttQuocTeId;
	public String loaiLuot;
	public int soThuTuLuot;
	public String maBen;
	public int soGioDungNghi;
	public int soPhutDungNghi;
}