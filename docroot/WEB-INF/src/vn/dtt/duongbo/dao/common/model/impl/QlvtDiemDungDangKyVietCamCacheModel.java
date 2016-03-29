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

import vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietCam;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing QlvtDiemDungDangKyVietCam in entity cache.
 *
 * @author win_64
 * @see QlvtDiemDungDangKyVietCam
 * @generated
 */
public class QlvtDiemDungDangKyVietCamCacheModel implements CacheModel<QlvtDiemDungDangKyVietCam>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(id);
		sb.append(", PhuongTienDangKyId=");
		sb.append(PhuongTienDangKyId);
		sb.append(", NoiDungHoSoId=");
		sb.append(NoiDungHoSoId);
		sb.append(", HoSoThuTucId=");
		sb.append(HoSoThuTucId);
		sb.append(", MaDiemDung=");
		sb.append(MaDiemDung);
		sb.append(", TenDiemDung=");
		sb.append(TenDiemDung);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QlvtDiemDungDangKyVietCam toEntityModel() {
		QlvtDiemDungDangKyVietCamImpl qlvtDiemDungDangKyVietCamImpl = new QlvtDiemDungDangKyVietCamImpl();

		qlvtDiemDungDangKyVietCamImpl.setId(id);

		if (PhuongTienDangKyId == null) {
			qlvtDiemDungDangKyVietCamImpl.setPhuongTienDangKyId(StringPool.BLANK);
		}
		else {
			qlvtDiemDungDangKyVietCamImpl.setPhuongTienDangKyId(PhuongTienDangKyId);
		}

		if (NoiDungHoSoId == null) {
			qlvtDiemDungDangKyVietCamImpl.setNoiDungHoSoId(StringPool.BLANK);
		}
		else {
			qlvtDiemDungDangKyVietCamImpl.setNoiDungHoSoId(NoiDungHoSoId);
		}

		if (HoSoThuTucId == null) {
			qlvtDiemDungDangKyVietCamImpl.setHoSoThuTucId(StringPool.BLANK);
		}
		else {
			qlvtDiemDungDangKyVietCamImpl.setHoSoThuTucId(HoSoThuTucId);
		}

		qlvtDiemDungDangKyVietCamImpl.setMaDiemDung(MaDiemDung);
		qlvtDiemDungDangKyVietCamImpl.setTenDiemDung(TenDiemDung);

		qlvtDiemDungDangKyVietCamImpl.resetOriginalValues();

		return qlvtDiemDungDangKyVietCamImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		PhuongTienDangKyId = objectInput.readUTF();
		NoiDungHoSoId = objectInput.readUTF();
		HoSoThuTucId = objectInput.readUTF();
		MaDiemDung = objectInput.readLong();
		TenDiemDung = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (PhuongTienDangKyId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PhuongTienDangKyId);
		}

		if (NoiDungHoSoId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(NoiDungHoSoId);
		}

		if (HoSoThuTucId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(HoSoThuTucId);
		}

		objectOutput.writeLong(MaDiemDung);
		objectOutput.writeLong(TenDiemDung);
	}

	public long id;
	public String PhuongTienDangKyId;
	public String NoiDungHoSoId;
	public String HoSoThuTucId;
	public long MaDiemDung;
	public long TenDiemDung;
}