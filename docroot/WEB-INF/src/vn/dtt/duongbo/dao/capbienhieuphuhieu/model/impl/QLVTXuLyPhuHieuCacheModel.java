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

import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QLVTXuLyPhuHieu in entity cache.
 *
 * @author binhta
 * @see QLVTXuLyPhuHieu
 * @generated
 */
public class QLVTXuLyPhuHieuCacheModel implements CacheModel<QLVTXuLyPhuHieu>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", soLuongBHPHNopLai=");
		sb.append(soLuongBHPHNopLai);
		sb.append(", soLuongBienHieu=");
		sb.append(soLuongBienHieu);
		sb.append(", thongTinXuLyId=");
		sb.append(thongTinXuLyId);
		sb.append(", loaiPhuHieu=");
		sb.append(loaiPhuHieu);
		sb.append(", soLuong=");
		sb.append(soLuong);
		sb.append(", soLuongBH_PHNopLai=");
		sb.append(soLuongBH_PHNopLai);
		sb.append(", sovbChapNhanTuyen=");
		sb.append(sovbChapNhanTuyen);
		sb.append(", ngayCapVBChapNhanTuyen=");
		sb.append(ngayCapVBChapNhanTuyen);
		sb.append(", lanCap=");
		sb.append(lanCap);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QLVTXuLyPhuHieu toEntityModel() {
		QLVTXuLyPhuHieuImpl qlvtXuLyPhuHieuImpl = new QLVTXuLyPhuHieuImpl();

		qlvtXuLyPhuHieuImpl.setId(id);
		qlvtXuLyPhuHieuImpl.setSoLuongBHPHNopLai(soLuongBHPHNopLai);
		qlvtXuLyPhuHieuImpl.setSoLuongBienHieu(soLuongBienHieu);
		qlvtXuLyPhuHieuImpl.setThongTinXuLyId(thongTinXuLyId);

		if (loaiPhuHieu == null) {
			qlvtXuLyPhuHieuImpl.setLoaiPhuHieu(StringPool.BLANK);
		}
		else {
			qlvtXuLyPhuHieuImpl.setLoaiPhuHieu(loaiPhuHieu);
		}

		qlvtXuLyPhuHieuImpl.setSoLuong(soLuong);
		qlvtXuLyPhuHieuImpl.setSoLuongBH_PHNopLai(soLuongBH_PHNopLai);

		if (sovbChapNhanTuyen == null) {
			qlvtXuLyPhuHieuImpl.setSovbChapNhanTuyen(StringPool.BLANK);
		}
		else {
			qlvtXuLyPhuHieuImpl.setSovbChapNhanTuyen(sovbChapNhanTuyen);
		}

		if (ngayCapVBChapNhanTuyen == Long.MIN_VALUE) {
			qlvtXuLyPhuHieuImpl.setNgayCapVBChapNhanTuyen(null);
		}
		else {
			qlvtXuLyPhuHieuImpl.setNgayCapVBChapNhanTuyen(new Date(
					ngayCapVBChapNhanTuyen));
		}

		qlvtXuLyPhuHieuImpl.setLanCap(lanCap);

		qlvtXuLyPhuHieuImpl.resetOriginalValues();

		return qlvtXuLyPhuHieuImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		soLuongBHPHNopLai = objectInput.readInt();
		soLuongBienHieu = objectInput.readInt();
		thongTinXuLyId = objectInput.readInt();
		loaiPhuHieu = objectInput.readUTF();
		soLuong = objectInput.readInt();
		soLuongBH_PHNopLai = objectInput.readInt();
		sovbChapNhanTuyen = objectInput.readUTF();
		ngayCapVBChapNhanTuyen = objectInput.readLong();
		lanCap = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(id);
		objectOutput.writeInt(soLuongBHPHNopLai);
		objectOutput.writeInt(soLuongBienHieu);
		objectOutput.writeInt(thongTinXuLyId);

		if (loaiPhuHieu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(loaiPhuHieu);
		}

		objectOutput.writeInt(soLuong);
		objectOutput.writeInt(soLuongBH_PHNopLai);

		if (sovbChapNhanTuyen == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sovbChapNhanTuyen);
		}

		objectOutput.writeLong(ngayCapVBChapNhanTuyen);
		objectOutput.writeInt(lanCap);
	}

	public int id;
	public int soLuongBHPHNopLai;
	public int soLuongBienHieu;
	public int thongTinXuLyId;
	public String loaiPhuHieu;
	public int soLuong;
	public int soLuongBH_PHNopLai;
	public String sovbChapNhanTuyen;
	public long ngayCapVBChapNhanTuyen;
	public int lanCap;
}