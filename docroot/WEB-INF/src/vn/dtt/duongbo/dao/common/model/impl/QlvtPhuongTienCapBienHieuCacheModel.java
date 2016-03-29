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

import vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapBienHieu;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing QlvtPhuongTienCapBienHieu in entity cache.
 *
 * @author win_64
 * @see QlvtPhuongTienCapBienHieu
 * @generated
 */
public class QlvtPhuongTienCapBienHieuCacheModel implements CacheModel<QlvtPhuongTienCapBienHieu>,
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
		sb.append(", SoKhung=");
		sb.append(SoKhung);
		sb.append(", SoMay=");
		sb.append(SoMay);
		sb.append(", NamSanXuat=");
		sb.append(NamSanXuat);
		sb.append(", MauSon=");
		sb.append(MauSon);
		sb.append(", SoChoNgoi=");
		sb.append(SoChoNgoi);
		sb.append(", NoiDungHoSoId=");
		sb.append(NoiDungHoSoId);
		sb.append(", HoSoThuTucId=");
		sb.append(HoSoThuTucId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QlvtPhuongTienCapBienHieu toEntityModel() {
		QlvtPhuongTienCapBienHieuImpl qlvtPhuongTienCapBienHieuImpl = new QlvtPhuongTienCapBienHieuImpl();

		qlvtPhuongTienCapBienHieuImpl.setId(id);

		if (NhanHieu == null) {
			qlvtPhuongTienCapBienHieuImpl.setNhanHieu(StringPool.BLANK);
		}
		else {
			qlvtPhuongTienCapBienHieuImpl.setNhanHieu(NhanHieu);
		}

		if (BienSo == null) {
			qlvtPhuongTienCapBienHieuImpl.setBienSo(StringPool.BLANK);
		}
		else {
			qlvtPhuongTienCapBienHieuImpl.setBienSo(BienSo);
		}

		if (SoKhung == null) {
			qlvtPhuongTienCapBienHieuImpl.setSoKhung(StringPool.BLANK);
		}
		else {
			qlvtPhuongTienCapBienHieuImpl.setSoKhung(SoKhung);
		}

		if (SoMay == null) {
			qlvtPhuongTienCapBienHieuImpl.setSoMay(StringPool.BLANK);
		}
		else {
			qlvtPhuongTienCapBienHieuImpl.setSoMay(SoMay);
		}

		if (NamSanXuat == null) {
			qlvtPhuongTienCapBienHieuImpl.setNamSanXuat(StringPool.BLANK);
		}
		else {
			qlvtPhuongTienCapBienHieuImpl.setNamSanXuat(NamSanXuat);
		}

		if (MauSon == null) {
			qlvtPhuongTienCapBienHieuImpl.setMauSon(StringPool.BLANK);
		}
		else {
			qlvtPhuongTienCapBienHieuImpl.setMauSon(MauSon);
		}

		qlvtPhuongTienCapBienHieuImpl.setSoChoNgoi(SoChoNgoi);
		qlvtPhuongTienCapBienHieuImpl.setNoiDungHoSoId(NoiDungHoSoId);
		qlvtPhuongTienCapBienHieuImpl.setHoSoThuTucId(HoSoThuTucId);

		qlvtPhuongTienCapBienHieuImpl.resetOriginalValues();

		return qlvtPhuongTienCapBienHieuImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		NhanHieu = objectInput.readUTF();
		BienSo = objectInput.readUTF();
		SoKhung = objectInput.readUTF();
		SoMay = objectInput.readUTF();
		NamSanXuat = objectInput.readUTF();
		MauSon = objectInput.readUTF();
		SoChoNgoi = objectInput.readLong();
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

		if (SoKhung == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SoKhung);
		}

		if (SoMay == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SoMay);
		}

		if (NamSanXuat == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(NamSanXuat);
		}

		if (MauSon == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MauSon);
		}

		objectOutput.writeLong(SoChoNgoi);
		objectOutput.writeLong(NoiDungHoSoId);
		objectOutput.writeLong(HoSoThuTucId);
	}

	public long id;
	public String NhanHieu;
	public String BienSo;
	public String SoKhung;
	public String SoMay;
	public String NamSanXuat;
	public String MauSon;
	public long SoChoNgoi;
	public long NoiDungHoSoId;
	public long HoSoThuTucId;
}