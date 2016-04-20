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

package vn.dtt.duongbo.dao.lienvan.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpkdvtDuongboQuocTe;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QlvtCapPhepGpkdvtDuongboQuocTe in entity cache.
 *
 * @author NhanNc
 * @see QlvtCapPhepGpkdvtDuongboQuocTe
 * @generated
 */
public class QlvtCapPhepGpkdvtDuongboQuocTeCacheModel implements CacheModel<QlvtCapPhepGpkdvtDuongboQuocTe>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(id);
		sb.append(", gpKinhDoanhVanTaiOtoId=");
		sb.append(gpKinhDoanhVanTaiOtoId);
		sb.append(", soGpvtQuocTe=");
		sb.append(soGpvtQuocTe);
		sb.append(", coQuanCapLanDauId=");
		sb.append(coQuanCapLanDauId);
		sb.append(", ngayCapGpvt=");
		sb.append(ngayCapGpvt);
		sb.append(", coQuanCapGpvtId=");
		sb.append(coQuanCapGpvtId);
		sb.append(", ngayGiaHan=");
		sb.append(ngayGiaHan);
		sb.append(", ngayHetHan=");
		sb.append(ngayHetHan);
		sb.append(", lanGiaHan=");
		sb.append(lanGiaHan);
		sb.append(", fileId=");
		sb.append(fileId);
		sb.append(", trangThai=");
		sb.append(trangThai);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QlvtCapPhepGpkdvtDuongboQuocTe toEntityModel() {
		QlvtCapPhepGpkdvtDuongboQuocTeImpl qlvtCapPhepGpkdvtDuongboQuocTeImpl = new QlvtCapPhepGpkdvtDuongboQuocTeImpl();

		qlvtCapPhepGpkdvtDuongboQuocTeImpl.setId(id);
		qlvtCapPhepGpkdvtDuongboQuocTeImpl.setGpKinhDoanhVanTaiOtoId(gpKinhDoanhVanTaiOtoId);

		if (soGpvtQuocTe == null) {
			qlvtCapPhepGpkdvtDuongboQuocTeImpl.setSoGpvtQuocTe(StringPool.BLANK);
		}
		else {
			qlvtCapPhepGpkdvtDuongboQuocTeImpl.setSoGpvtQuocTe(soGpvtQuocTe);
		}

		qlvtCapPhepGpkdvtDuongboQuocTeImpl.setCoQuanCapLanDauId(coQuanCapLanDauId);

		if (ngayCapGpvt == Long.MIN_VALUE) {
			qlvtCapPhepGpkdvtDuongboQuocTeImpl.setNgayCapGpvt(null);
		}
		else {
			qlvtCapPhepGpkdvtDuongboQuocTeImpl.setNgayCapGpvt(new Date(
					ngayCapGpvt));
		}

		qlvtCapPhepGpkdvtDuongboQuocTeImpl.setCoQuanCapGpvtId(coQuanCapGpvtId);

		if (ngayGiaHan == Long.MIN_VALUE) {
			qlvtCapPhepGpkdvtDuongboQuocTeImpl.setNgayGiaHan(null);
		}
		else {
			qlvtCapPhepGpkdvtDuongboQuocTeImpl.setNgayGiaHan(new Date(
					ngayGiaHan));
		}

		if (ngayHetHan == Long.MIN_VALUE) {
			qlvtCapPhepGpkdvtDuongboQuocTeImpl.setNgayHetHan(null);
		}
		else {
			qlvtCapPhepGpkdvtDuongboQuocTeImpl.setNgayHetHan(new Date(
					ngayHetHan));
		}

		qlvtCapPhepGpkdvtDuongboQuocTeImpl.setLanGiaHan(lanGiaHan);
		qlvtCapPhepGpkdvtDuongboQuocTeImpl.setFileId(fileId);

		if (trangThai == null) {
			qlvtCapPhepGpkdvtDuongboQuocTeImpl.setTrangThai(StringPool.BLANK);
		}
		else {
			qlvtCapPhepGpkdvtDuongboQuocTeImpl.setTrangThai(trangThai);
		}

		qlvtCapPhepGpkdvtDuongboQuocTeImpl.resetOriginalValues();

		return qlvtCapPhepGpkdvtDuongboQuocTeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		gpKinhDoanhVanTaiOtoId = objectInput.readLong();
		soGpvtQuocTe = objectInput.readUTF();
		coQuanCapLanDauId = objectInput.readLong();
		ngayCapGpvt = objectInput.readLong();
		coQuanCapGpvtId = objectInput.readLong();
		ngayGiaHan = objectInput.readLong();
		ngayHetHan = objectInput.readLong();
		lanGiaHan = objectInput.readInt();
		fileId = objectInput.readLong();
		trangThai = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(gpKinhDoanhVanTaiOtoId);

		if (soGpvtQuocTe == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soGpvtQuocTe);
		}

		objectOutput.writeLong(coQuanCapLanDauId);
		objectOutput.writeLong(ngayCapGpvt);
		objectOutput.writeLong(coQuanCapGpvtId);
		objectOutput.writeLong(ngayGiaHan);
		objectOutput.writeLong(ngayHetHan);
		objectOutput.writeInt(lanGiaHan);
		objectOutput.writeLong(fileId);

		if (trangThai == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(trangThai);
		}
	}

	public long id;
	public long gpKinhDoanhVanTaiOtoId;
	public String soGpvtQuocTe;
	public long coQuanCapLanDauId;
	public long ngayCapGpvt;
	public long coQuanCapGpvtId;
	public long ngayGiaHan;
	public long ngayHetHan;
	public int lanGiaHan;
	public long fileId;
	public String trangThai;
}