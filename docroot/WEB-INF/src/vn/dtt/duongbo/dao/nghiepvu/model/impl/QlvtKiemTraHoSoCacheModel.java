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

package vn.dtt.duongbo.dao.nghiepvu.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.duongbo.dao.nghiepvu.model.QlvtKiemTraHoSo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing QlvtKiemTraHoSo in entity cache.
 *
 * @author NhanNc
 * @see QlvtKiemTraHoSo
 * @generated
 */
public class QlvtKiemTraHoSoCacheModel implements CacheModel<QlvtKiemTraHoSo>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(id);
		sb.append(", thongTinXuLyId=");
		sb.append(thongTinXuLyId);
		sb.append(", idNoiDungThamTra=");
		sb.append(idNoiDungThamTra);
		sb.append(", yKienThamTra=");
		sb.append(yKienThamTra);
		sb.append(", ketQuaXuLy=");
		sb.append(ketQuaXuLy);
		sb.append(", maSoHoSo=");
		sb.append(maSoHoSo);
		sb.append(", yKienDanhGia=");
		sb.append(yKienDanhGia);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QlvtKiemTraHoSo toEntityModel() {
		QlvtKiemTraHoSoImpl qlvtKiemTraHoSoImpl = new QlvtKiemTraHoSoImpl();

		qlvtKiemTraHoSoImpl.setId(id);
		qlvtKiemTraHoSoImpl.setThongTinXuLyId(thongTinXuLyId);
		qlvtKiemTraHoSoImpl.setIdNoiDungThamTra(idNoiDungThamTra);

		if (yKienThamTra == null) {
			qlvtKiemTraHoSoImpl.setYKienThamTra(StringPool.BLANK);
		}
		else {
			qlvtKiemTraHoSoImpl.setYKienThamTra(yKienThamTra);
		}

		qlvtKiemTraHoSoImpl.setKetQuaXuLy(ketQuaXuLy);
		qlvtKiemTraHoSoImpl.setMaSoHoSo(maSoHoSo);

		if (yKienDanhGia == null) {
			qlvtKiemTraHoSoImpl.setYKienDanhGia(StringPool.BLANK);
		}
		else {
			qlvtKiemTraHoSoImpl.setYKienDanhGia(yKienDanhGia);
		}

		qlvtKiemTraHoSoImpl.resetOriginalValues();

		return qlvtKiemTraHoSoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		thongTinXuLyId = objectInput.readInt();
		idNoiDungThamTra = objectInput.readInt();
		yKienThamTra = objectInput.readUTF();
		ketQuaXuLy = objectInput.readInt();
		maSoHoSo = objectInput.readInt();
		yKienDanhGia = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeInt(thongTinXuLyId);
		objectOutput.writeInt(idNoiDungThamTra);

		if (yKienThamTra == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(yKienThamTra);
		}

		objectOutput.writeInt(ketQuaXuLy);
		objectOutput.writeInt(maSoHoSo);

		if (yKienDanhGia == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(yKienDanhGia);
		}
	}

	public long id;
	public int thongTinXuLyId;
	public int idNoiDungThamTra;
	public String yKienThamTra;
	public int ketQuaXuLy;
	public int maSoHoSo;
	public String yKienDanhGia;
}