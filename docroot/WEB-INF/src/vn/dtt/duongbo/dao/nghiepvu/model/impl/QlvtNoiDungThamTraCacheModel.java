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

import vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing QlvtNoiDungThamTra in entity cache.
 *
 * @author NhanNc
 * @see QlvtNoiDungThamTra
 * @generated
 */
public class QlvtNoiDungThamTraCacheModel implements CacheModel<QlvtNoiDungThamTra>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(id);
		sb.append(", mucKiemTra=");
		sb.append(mucKiemTra);
		sb.append(", chaId=");
		sb.append(chaId);
		sb.append(", coYKien=");
		sb.append(coYKien);
		sb.append(", buocXuLy=");
		sb.append(buocXuLy);
		sb.append(", thuTuHienThi=");
		sb.append(thuTuHienThi);
		sb.append(", tthcNoiDungThamTraId=");
		sb.append(tthcNoiDungThamTraId);
		sb.append(", tienTo=");
		sb.append(tienTo);
		sb.append(", thanhPhanHoSo=");
		sb.append(thanhPhanHoSo);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QlvtNoiDungThamTra toEntityModel() {
		QlvtNoiDungThamTraImpl qlvtNoiDungThamTraImpl = new QlvtNoiDungThamTraImpl();

		qlvtNoiDungThamTraImpl.setId(id);

		if (mucKiemTra == null) {
			qlvtNoiDungThamTraImpl.setMucKiemTra(StringPool.BLANK);
		}
		else {
			qlvtNoiDungThamTraImpl.setMucKiemTra(mucKiemTra);
		}

		qlvtNoiDungThamTraImpl.setChaId(chaId);
		qlvtNoiDungThamTraImpl.setCoYKien(coYKien);
		qlvtNoiDungThamTraImpl.setBuocXuLy(buocXuLy);
		qlvtNoiDungThamTraImpl.setThuTuHienThi(thuTuHienThi);
		qlvtNoiDungThamTraImpl.setTthcNoiDungThamTraId(tthcNoiDungThamTraId);

		if (tienTo == null) {
			qlvtNoiDungThamTraImpl.setTienTo(StringPool.BLANK);
		}
		else {
			qlvtNoiDungThamTraImpl.setTienTo(tienTo);
		}

		if (thanhPhanHoSo == null) {
			qlvtNoiDungThamTraImpl.setThanhPhanHoSo(StringPool.BLANK);
		}
		else {
			qlvtNoiDungThamTraImpl.setThanhPhanHoSo(thanhPhanHoSo);
		}

		qlvtNoiDungThamTraImpl.resetOriginalValues();

		return qlvtNoiDungThamTraImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		mucKiemTra = objectInput.readUTF();
		chaId = objectInput.readInt();
		coYKien = objectInput.readInt();
		buocXuLy = objectInput.readInt();
		thuTuHienThi = objectInput.readInt();
		tthcNoiDungThamTraId = objectInput.readInt();
		tienTo = objectInput.readUTF();
		thanhPhanHoSo = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (mucKiemTra == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mucKiemTra);
		}

		objectOutput.writeInt(chaId);
		objectOutput.writeInt(coYKien);
		objectOutput.writeInt(buocXuLy);
		objectOutput.writeInt(thuTuHienThi);
		objectOutput.writeInt(tthcNoiDungThamTraId);

		if (tienTo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tienTo);
		}

		if (thanhPhanHoSo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(thanhPhanHoSo);
		}
	}

	public long id;
	public String mucKiemTra;
	public int chaId;
	public int coYKien;
	public int buocXuLy;
	public int thuTuHienThi;
	public int tthcNoiDungThamTraId;
	public String tienTo;
	public String thanhPhanHoSo;
}