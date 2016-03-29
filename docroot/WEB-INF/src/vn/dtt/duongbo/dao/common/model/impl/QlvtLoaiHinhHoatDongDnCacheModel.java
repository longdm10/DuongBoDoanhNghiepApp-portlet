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

import vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing QlvtLoaiHinhHoatDongDn in entity cache.
 *
 * @author win_64
 * @see QlvtLoaiHinhHoatDongDn
 * @generated
 */
public class QlvtLoaiHinhHoatDongDnCacheModel implements CacheModel<QlvtLoaiHinhHoatDongDn>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(id);
		sb.append(", hoSoThuTucId=");
		sb.append(hoSoThuTucId);
		sb.append(", noiDungHoSoId=");
		sb.append(noiDungHoSoId);
		sb.append(", maLoaiHinhHoatDong=");
		sb.append(maLoaiHinhHoatDong);
		sb.append(", maMauSon=");
		sb.append(maMauSon);
		sb.append(", maPhamViHoatDong=");
		sb.append(maPhamViHoatDong);
		sb.append(", soLuongPhuongTien=");
		sb.append(soLuongPhuongTien);
		sb.append(", thietBiGiamSatHanhTrinh=");
		sb.append(thietBiGiamSatHanhTrinh);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QlvtLoaiHinhHoatDongDn toEntityModel() {
		QlvtLoaiHinhHoatDongDnImpl qlvtLoaiHinhHoatDongDnImpl = new QlvtLoaiHinhHoatDongDnImpl();

		qlvtLoaiHinhHoatDongDnImpl.setId(id);
		qlvtLoaiHinhHoatDongDnImpl.setHoSoThuTucId(hoSoThuTucId);
		qlvtLoaiHinhHoatDongDnImpl.setNoiDungHoSoId(noiDungHoSoId);

		if (maLoaiHinhHoatDong == null) {
			qlvtLoaiHinhHoatDongDnImpl.setMaLoaiHinhHoatDong(StringPool.BLANK);
		}
		else {
			qlvtLoaiHinhHoatDongDnImpl.setMaLoaiHinhHoatDong(maLoaiHinhHoatDong);
		}

		if (maMauSon == null) {
			qlvtLoaiHinhHoatDongDnImpl.setMaMauSon(StringPool.BLANK);
		}
		else {
			qlvtLoaiHinhHoatDongDnImpl.setMaMauSon(maMauSon);
		}

		if (maPhamViHoatDong == null) {
			qlvtLoaiHinhHoatDongDnImpl.setMaPhamViHoatDong(StringPool.BLANK);
		}
		else {
			qlvtLoaiHinhHoatDongDnImpl.setMaPhamViHoatDong(maPhamViHoatDong);
		}

		if (soLuongPhuongTien == null) {
			qlvtLoaiHinhHoatDongDnImpl.setSoLuongPhuongTien(StringPool.BLANK);
		}
		else {
			qlvtLoaiHinhHoatDongDnImpl.setSoLuongPhuongTien(soLuongPhuongTien);
		}

		if (thietBiGiamSatHanhTrinh == null) {
			qlvtLoaiHinhHoatDongDnImpl.setThietBiGiamSatHanhTrinh(StringPool.BLANK);
		}
		else {
			qlvtLoaiHinhHoatDongDnImpl.setThietBiGiamSatHanhTrinh(thietBiGiamSatHanhTrinh);
		}

		qlvtLoaiHinhHoatDongDnImpl.resetOriginalValues();

		return qlvtLoaiHinhHoatDongDnImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		hoSoThuTucId = objectInput.readLong();
		noiDungHoSoId = objectInput.readLong();
		maLoaiHinhHoatDong = objectInput.readUTF();
		maMauSon = objectInput.readUTF();
		maPhamViHoatDong = objectInput.readUTF();
		soLuongPhuongTien = objectInput.readUTF();
		thietBiGiamSatHanhTrinh = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(hoSoThuTucId);
		objectOutput.writeLong(noiDungHoSoId);

		if (maLoaiHinhHoatDong == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maLoaiHinhHoatDong);
		}

		if (maMauSon == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maMauSon);
		}

		if (maPhamViHoatDong == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maPhamViHoatDong);
		}

		if (soLuongPhuongTien == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soLuongPhuongTien);
		}

		if (thietBiGiamSatHanhTrinh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(thietBiGiamSatHanhTrinh);
		}
	}

	public long id;
	public long hoSoThuTucId;
	public long noiDungHoSoId;
	public String maLoaiHinhHoatDong;
	public String maMauSon;
	public String maPhamViHoatDong;
	public String soLuongPhuongTien;
	public String thietBiGiamSatHanhTrinh;
}