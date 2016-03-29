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

import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTe;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing QlvtXuLyKTTQuocTe in entity cache.
 *
 * @author NoiPham
 * @see QlvtXuLyKTTQuocTe
 * @generated
 */
public class QlvtXuLyKTTQuocTeCacheModel implements CacheModel<QlvtXuLyKTTQuocTe>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{id=");
		sb.append(id);
		sb.append(", thongTinXuLyId=");
		sb.append(thongTinXuLyId);
		sb.append(", loaiCapPhep=");
		sb.append(loaiCapPhep);
		sb.append(", benDi=");
		sb.append(benDi);
		sb.append(", diemDi=");
		sb.append(diemDi);
		sb.append(", benDen=");
		sb.append(benDen);
		sb.append(", diemDen=");
		sb.append(diemDen);
		sb.append(", cuLyVanChuyen=");
		sb.append(cuLyVanChuyen);
		sb.append(", hanhTrinhChay=");
		sb.append(hanhTrinhChay);
		sb.append(", cuaKhau=");
		sb.append(cuaKhau);
		sb.append(", ketQuaDanhGiaGPVT=");
		sb.append(ketQuaDanhGiaGPVT);
		sb.append(", lyDoKhongDat=");
		sb.append(lyDoKhongDat);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QlvtXuLyKTTQuocTe toEntityModel() {
		QlvtXuLyKTTQuocTeImpl qlvtXuLyKTTQuocTeImpl = new QlvtXuLyKTTQuocTeImpl();

		qlvtXuLyKTTQuocTeImpl.setId(id);
		qlvtXuLyKTTQuocTeImpl.setThongTinXuLyId(thongTinXuLyId);

		if (loaiCapPhep == null) {
			qlvtXuLyKTTQuocTeImpl.setLoaiCapPhep(StringPool.BLANK);
		}
		else {
			qlvtXuLyKTTQuocTeImpl.setLoaiCapPhep(loaiCapPhep);
		}

		if (benDi == null) {
			qlvtXuLyKTTQuocTeImpl.setBenDi(StringPool.BLANK);
		}
		else {
			qlvtXuLyKTTQuocTeImpl.setBenDi(benDi);
		}

		if (diemDi == null) {
			qlvtXuLyKTTQuocTeImpl.setDiemDi(StringPool.BLANK);
		}
		else {
			qlvtXuLyKTTQuocTeImpl.setDiemDi(diemDi);
		}

		if (benDen == null) {
			qlvtXuLyKTTQuocTeImpl.setBenDen(StringPool.BLANK);
		}
		else {
			qlvtXuLyKTTQuocTeImpl.setBenDen(benDen);
		}

		if (diemDen == null) {
			qlvtXuLyKTTQuocTeImpl.setDiemDen(StringPool.BLANK);
		}
		else {
			qlvtXuLyKTTQuocTeImpl.setDiemDen(diemDen);
		}

		qlvtXuLyKTTQuocTeImpl.setCuLyVanChuyen(cuLyVanChuyen);

		if (hanhTrinhChay == null) {
			qlvtXuLyKTTQuocTeImpl.setHanhTrinhChay(StringPool.BLANK);
		}
		else {
			qlvtXuLyKTTQuocTeImpl.setHanhTrinhChay(hanhTrinhChay);
		}

		if (cuaKhau == null) {
			qlvtXuLyKTTQuocTeImpl.setCuaKhau(StringPool.BLANK);
		}
		else {
			qlvtXuLyKTTQuocTeImpl.setCuaKhau(cuaKhau);
		}

		if (ketQuaDanhGiaGPVT == null) {
			qlvtXuLyKTTQuocTeImpl.setKetQuaDanhGiaGPVT(StringPool.BLANK);
		}
		else {
			qlvtXuLyKTTQuocTeImpl.setKetQuaDanhGiaGPVT(ketQuaDanhGiaGPVT);
		}

		if (lyDoKhongDat == null) {
			qlvtXuLyKTTQuocTeImpl.setLyDoKhongDat(StringPool.BLANK);
		}
		else {
			qlvtXuLyKTTQuocTeImpl.setLyDoKhongDat(lyDoKhongDat);
		}

		qlvtXuLyKTTQuocTeImpl.resetOriginalValues();

		return qlvtXuLyKTTQuocTeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		thongTinXuLyId = objectInput.readInt();
		loaiCapPhep = objectInput.readUTF();
		benDi = objectInput.readUTF();
		diemDi = objectInput.readUTF();
		benDen = objectInput.readUTF();
		diemDen = objectInput.readUTF();
		cuLyVanChuyen = objectInput.readInt();
		hanhTrinhChay = objectInput.readUTF();
		cuaKhau = objectInput.readUTF();
		ketQuaDanhGiaGPVT = objectInput.readUTF();
		lyDoKhongDat = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeInt(thongTinXuLyId);

		if (loaiCapPhep == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(loaiCapPhep);
		}

		if (benDi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(benDi);
		}

		if (diemDi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(diemDi);
		}

		if (benDen == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(benDen);
		}

		if (diemDen == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(diemDen);
		}

		objectOutput.writeInt(cuLyVanChuyen);

		if (hanhTrinhChay == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(hanhTrinhChay);
		}

		if (cuaKhau == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cuaKhau);
		}

		if (ketQuaDanhGiaGPVT == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ketQuaDanhGiaGPVT);
		}

		if (lyDoKhongDat == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lyDoKhongDat);
		}
	}

	public long id;
	public int thongTinXuLyId;
	public String loaiCapPhep;
	public String benDi;
	public String diemDi;
	public String benDen;
	public String diemDen;
	public int cuLyVanChuyen;
	public String hanhTrinhChay;
	public String cuaKhau;
	public String ketQuaDanhGiaGPVT;
	public String lyDoKhongDat;
}