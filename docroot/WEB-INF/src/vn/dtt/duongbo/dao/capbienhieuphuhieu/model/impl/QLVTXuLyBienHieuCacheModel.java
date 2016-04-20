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

import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieu;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QLVTXuLyBienHieu in entity cache.
 *
 * @author binhta
 * @see QLVTXuLyBienHieu
 * @generated
 */
public class QLVTXuLyBienHieuCacheModel implements CacheModel<QLVTXuLyBienHieu>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(id);
		sb.append(", thongTinXuLyId=");
		sb.append(thongTinXuLyId);
		sb.append(", LinhVucKinhDoanh=");
		sb.append(LinhVucKinhDoanh);
		sb.append(", lyDoCapLai=");
		sb.append(lyDoCapLai);
		sb.append(", gpkdLuuHanhQuocTe=");
		sb.append(gpkdLuuHanhQuocTe);
		sb.append(", gpkdLuuHanhQuocTeCQCAP=");
		sb.append(gpkdLuuHanhQuocTeCQCAP);
		sb.append(", gpkdLuuHanhQuocTeNgayCap=");
		sb.append(gpkdLuuHanhQuocTeNgayCap);
		sb.append(", gpkdLuuHanhQuocTeNgayHetHan=");
		sb.append(gpkdLuuHanhQuocTeNgayHetHan);
		sb.append(", soLuongXe=");
		sb.append(soLuongXe);
		sb.append(", soLuongBHPHNopLai=");
		sb.append(soLuongBHPHNopLai);
		sb.append(", lapCap=");
		sb.append(lapCap);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QLVTXuLyBienHieu toEntityModel() {
		QLVTXuLyBienHieuImpl qlvtXuLyBienHieuImpl = new QLVTXuLyBienHieuImpl();

		qlvtXuLyBienHieuImpl.setId(id);
		qlvtXuLyBienHieuImpl.setThongTinXuLyId(thongTinXuLyId);

		if (LinhVucKinhDoanh == null) {
			qlvtXuLyBienHieuImpl.setLinhVucKinhDoanh(StringPool.BLANK);
		}
		else {
			qlvtXuLyBienHieuImpl.setLinhVucKinhDoanh(LinhVucKinhDoanh);
		}

		if (lyDoCapLai == null) {
			qlvtXuLyBienHieuImpl.setLyDoCapLai(StringPool.BLANK);
		}
		else {
			qlvtXuLyBienHieuImpl.setLyDoCapLai(lyDoCapLai);
		}

		if (gpkdLuuHanhQuocTe == null) {
			qlvtXuLyBienHieuImpl.setGpkdLuuHanhQuocTe(StringPool.BLANK);
		}
		else {
			qlvtXuLyBienHieuImpl.setGpkdLuuHanhQuocTe(gpkdLuuHanhQuocTe);
		}

		if (gpkdLuuHanhQuocTeCQCAP == null) {
			qlvtXuLyBienHieuImpl.setGpkdLuuHanhQuocTeCQCAP(StringPool.BLANK);
		}
		else {
			qlvtXuLyBienHieuImpl.setGpkdLuuHanhQuocTeCQCAP(gpkdLuuHanhQuocTeCQCAP);
		}

		if (gpkdLuuHanhQuocTeNgayCap == Long.MIN_VALUE) {
			qlvtXuLyBienHieuImpl.setGpkdLuuHanhQuocTeNgayCap(null);
		}
		else {
			qlvtXuLyBienHieuImpl.setGpkdLuuHanhQuocTeNgayCap(new Date(
					gpkdLuuHanhQuocTeNgayCap));
		}

		if (gpkdLuuHanhQuocTeNgayHetHan == Long.MIN_VALUE) {
			qlvtXuLyBienHieuImpl.setGpkdLuuHanhQuocTeNgayHetHan(null);
		}
		else {
			qlvtXuLyBienHieuImpl.setGpkdLuuHanhQuocTeNgayHetHan(new Date(
					gpkdLuuHanhQuocTeNgayHetHan));
		}

		if (soLuongXe == null) {
			qlvtXuLyBienHieuImpl.setSoLuongXe(StringPool.BLANK);
		}
		else {
			qlvtXuLyBienHieuImpl.setSoLuongXe(soLuongXe);
		}

		qlvtXuLyBienHieuImpl.setSoLuongBHPHNopLai(soLuongBHPHNopLai);
		qlvtXuLyBienHieuImpl.setLapCap(lapCap);

		qlvtXuLyBienHieuImpl.resetOriginalValues();

		return qlvtXuLyBienHieuImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		thongTinXuLyId = objectInput.readInt();
		LinhVucKinhDoanh = objectInput.readUTF();
		lyDoCapLai = objectInput.readUTF();
		gpkdLuuHanhQuocTe = objectInput.readUTF();
		gpkdLuuHanhQuocTeCQCAP = objectInput.readUTF();
		gpkdLuuHanhQuocTeNgayCap = objectInput.readLong();
		gpkdLuuHanhQuocTeNgayHetHan = objectInput.readLong();
		soLuongXe = objectInput.readUTF();
		soLuongBHPHNopLai = objectInput.readInt();
		lapCap = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(id);
		objectOutput.writeInt(thongTinXuLyId);

		if (LinhVucKinhDoanh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LinhVucKinhDoanh);
		}

		if (lyDoCapLai == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lyDoCapLai);
		}

		if (gpkdLuuHanhQuocTe == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(gpkdLuuHanhQuocTe);
		}

		if (gpkdLuuHanhQuocTeCQCAP == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(gpkdLuuHanhQuocTeCQCAP);
		}

		objectOutput.writeLong(gpkdLuuHanhQuocTeNgayCap);
		objectOutput.writeLong(gpkdLuuHanhQuocTeNgayHetHan);

		if (soLuongXe == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soLuongXe);
		}

		objectOutput.writeInt(soLuongBHPHNopLai);
		objectOutput.writeInt(lapCap);
	}

	public int id;
	public int thongTinXuLyId;
	public String LinhVucKinhDoanh;
	public String lyDoCapLai;
	public String gpkdLuuHanhQuocTe;
	public String gpkdLuuHanhQuocTeCQCAP;
	public long gpkdLuuHanhQuocTeNgayCap;
	public long gpkdLuuHanhQuocTeNgayHetHan;
	public String soLuongXe;
	public int soLuongBHPHNopLai;
	public int lapCap;
}