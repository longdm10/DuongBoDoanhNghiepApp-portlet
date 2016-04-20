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

import vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TthcPhanNhomHoSo in entity cache.
 *
 * @author win_64
 * @see TthcPhanNhomHoSo
 * @generated
 */
public class TthcPhanNhomHoSoCacheModel implements CacheModel<TthcPhanNhomHoSo>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(id);
		sb.append(", maPhanNhom=");
		sb.append(maPhanNhom);
		sb.append(", tenPhanNhom=");
		sb.append(tenPhanNhom);
		sb.append(", tenTiengAnh=");
		sb.append(tenTiengAnh);
		sb.append(", soThuTu=");
		sb.append(soThuTu);
		sb.append(", loaiPhanNhom=");
		sb.append(loaiPhanNhom);
		sb.append(", toChucQuanLy=");
		sb.append(toChucQuanLy);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TthcPhanNhomHoSo toEntityModel() {
		TthcPhanNhomHoSoImpl tthcPhanNhomHoSoImpl = new TthcPhanNhomHoSoImpl();

		tthcPhanNhomHoSoImpl.setId(id);

		if (maPhanNhom == null) {
			tthcPhanNhomHoSoImpl.setMaPhanNhom(StringPool.BLANK);
		}
		else {
			tthcPhanNhomHoSoImpl.setMaPhanNhom(maPhanNhom);
		}

		if (tenPhanNhom == null) {
			tthcPhanNhomHoSoImpl.setTenPhanNhom(StringPool.BLANK);
		}
		else {
			tthcPhanNhomHoSoImpl.setTenPhanNhom(tenPhanNhom);
		}

		if (tenTiengAnh == null) {
			tthcPhanNhomHoSoImpl.setTenTiengAnh(StringPool.BLANK);
		}
		else {
			tthcPhanNhomHoSoImpl.setTenTiengAnh(tenTiengAnh);
		}

		tthcPhanNhomHoSoImpl.setSoThuTu(soThuTu);
		tthcPhanNhomHoSoImpl.setLoaiPhanNhom(loaiPhanNhom);
		tthcPhanNhomHoSoImpl.setToChucQuanLy(toChucQuanLy);

		tthcPhanNhomHoSoImpl.resetOriginalValues();

		return tthcPhanNhomHoSoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		maPhanNhom = objectInput.readUTF();
		tenPhanNhom = objectInput.readUTF();
		tenTiengAnh = objectInput.readUTF();
		soThuTu = objectInput.readInt();
		loaiPhanNhom = objectInput.readInt();
		toChucQuanLy = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (maPhanNhom == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maPhanNhom);
		}

		if (tenPhanNhom == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenPhanNhom);
		}

		if (tenTiengAnh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenTiengAnh);
		}

		objectOutput.writeInt(soThuTu);
		objectOutput.writeInt(loaiPhanNhom);
		objectOutput.writeLong(toChucQuanLy);
	}

	public long id;
	public String maPhanNhom;
	public String tenPhanNhom;
	public String tenTiengAnh;
	public int soThuTu;
	public int loaiPhanNhom;
	public long toChucQuanLy;
}