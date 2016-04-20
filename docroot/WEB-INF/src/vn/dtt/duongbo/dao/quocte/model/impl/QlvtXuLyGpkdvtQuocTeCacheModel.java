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

import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTe;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QlvtXuLyGpkdvtQuocTe in entity cache.
 *
 * @author NoiPham
 * @see QlvtXuLyGpkdvtQuocTe
 * @generated
 */
public class QlvtXuLyGpkdvtQuocTeCacheModel implements CacheModel<QlvtXuLyGpkdvtQuocTe>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", thongTinXuLyId=");
		sb.append(thongTinXuLyId);
		sb.append(", loaiCapPhep=");
		sb.append(loaiCapPhep);
		sb.append(", soGiapPhepVanTai=");
		sb.append(soGiapPhepVanTai);
		sb.append(", ngayCapGiayPhepVanTai=");
		sb.append(ngayCapGiayPhepVanTai);
		sb.append(", coQuanCapGiayPhepVanTaiId=");
		sb.append(coQuanCapGiayPhepVanTaiId);
		sb.append(", ngayHetHanGiayPhepVanTai=");
		sb.append(ngayHetHanGiayPhepVanTai);
		sb.append(", mucPhi=");
		sb.append(mucPhi);
		sb.append(", ketQuaXuLy=");
		sb.append(ketQuaXuLy);
		sb.append(", lyDoKhongDat=");
		sb.append(lyDoKhongDat);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QlvtXuLyGpkdvtQuocTe toEntityModel() {
		QlvtXuLyGpkdvtQuocTeImpl qlvtXuLyGpkdvtQuocTeImpl = new QlvtXuLyGpkdvtQuocTeImpl();

		qlvtXuLyGpkdvtQuocTeImpl.setId(id);
		qlvtXuLyGpkdvtQuocTeImpl.setThongTinXuLyId(thongTinXuLyId);

		if (loaiCapPhep == null) {
			qlvtXuLyGpkdvtQuocTeImpl.setLoaiCapPhep(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpkdvtQuocTeImpl.setLoaiCapPhep(loaiCapPhep);
		}

		if (soGiapPhepVanTai == null) {
			qlvtXuLyGpkdvtQuocTeImpl.setSoGiapPhepVanTai(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpkdvtQuocTeImpl.setSoGiapPhepVanTai(soGiapPhepVanTai);
		}

		if (ngayCapGiayPhepVanTai == Long.MIN_VALUE) {
			qlvtXuLyGpkdvtQuocTeImpl.setNgayCapGiayPhepVanTai(null);
		}
		else {
			qlvtXuLyGpkdvtQuocTeImpl.setNgayCapGiayPhepVanTai(new Date(
					ngayCapGiayPhepVanTai));
		}

		if (coQuanCapGiayPhepVanTaiId == null) {
			qlvtXuLyGpkdvtQuocTeImpl.setCoQuanCapGiayPhepVanTaiId(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpkdvtQuocTeImpl.setCoQuanCapGiayPhepVanTaiId(coQuanCapGiayPhepVanTaiId);
		}

		if (ngayHetHanGiayPhepVanTai == Long.MIN_VALUE) {
			qlvtXuLyGpkdvtQuocTeImpl.setNgayHetHanGiayPhepVanTai(null);
		}
		else {
			qlvtXuLyGpkdvtQuocTeImpl.setNgayHetHanGiayPhepVanTai(new Date(
					ngayHetHanGiayPhepVanTai));
		}

		if (mucPhi == null) {
			qlvtXuLyGpkdvtQuocTeImpl.setMucPhi(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpkdvtQuocTeImpl.setMucPhi(mucPhi);
		}

		if (ketQuaXuLy == null) {
			qlvtXuLyGpkdvtQuocTeImpl.setKetQuaXuLy(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpkdvtQuocTeImpl.setKetQuaXuLy(ketQuaXuLy);
		}

		if (lyDoKhongDat == null) {
			qlvtXuLyGpkdvtQuocTeImpl.setLyDoKhongDat(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpkdvtQuocTeImpl.setLyDoKhongDat(lyDoKhongDat);
		}

		qlvtXuLyGpkdvtQuocTeImpl.resetOriginalValues();

		return qlvtXuLyGpkdvtQuocTeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		thongTinXuLyId = objectInput.readInt();
		loaiCapPhep = objectInput.readUTF();
		soGiapPhepVanTai = objectInput.readUTF();
		ngayCapGiayPhepVanTai = objectInput.readLong();
		coQuanCapGiayPhepVanTaiId = objectInput.readUTF();
		ngayHetHanGiayPhepVanTai = objectInput.readLong();
		mucPhi = objectInput.readUTF();
		ketQuaXuLy = objectInput.readUTF();
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

		if (soGiapPhepVanTai == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soGiapPhepVanTai);
		}

		objectOutput.writeLong(ngayCapGiayPhepVanTai);

		if (coQuanCapGiayPhepVanTaiId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(coQuanCapGiayPhepVanTaiId);
		}

		objectOutput.writeLong(ngayHetHanGiayPhepVanTai);

		if (mucPhi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mucPhi);
		}

		if (ketQuaXuLy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ketQuaXuLy);
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
	public String soGiapPhepVanTai;
	public long ngayCapGiayPhepVanTai;
	public String coQuanCapGiayPhepVanTaiId;
	public long ngayHetHanGiayPhepVanTai;
	public String mucPhi;
	public String ketQuaXuLy;
	public String lyDoKhongDat;
}