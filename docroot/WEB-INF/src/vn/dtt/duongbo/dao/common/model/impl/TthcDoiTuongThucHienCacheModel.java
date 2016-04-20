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

import vn.dtt.duongbo.dao.common.model.TthcDoiTuongThucHien;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TthcDoiTuongThucHien in entity cache.
 *
 * @author win_64
 * @see TthcDoiTuongThucHien
 * @generated
 */
public class TthcDoiTuongThucHienCacheModel implements CacheModel<TthcDoiTuongThucHien>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(id);
		sb.append(", thuTucHanhChinhId=");
		sb.append(thuTucHanhChinhId);
		sb.append(", loaiDoiTuongThucHien=");
		sb.append(loaiDoiTuongThucHien);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TthcDoiTuongThucHien toEntityModel() {
		TthcDoiTuongThucHienImpl tthcDoiTuongThucHienImpl = new TthcDoiTuongThucHienImpl();

		tthcDoiTuongThucHienImpl.setId(id);
		tthcDoiTuongThucHienImpl.setThuTucHanhChinhId(thuTucHanhChinhId);

		if (loaiDoiTuongThucHien == null) {
			tthcDoiTuongThucHienImpl.setLoaiDoiTuongThucHien(StringPool.BLANK);
		}
		else {
			tthcDoiTuongThucHienImpl.setLoaiDoiTuongThucHien(loaiDoiTuongThucHien);
		}

		tthcDoiTuongThucHienImpl.resetOriginalValues();

		return tthcDoiTuongThucHienImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		thuTucHanhChinhId = objectInput.readLong();
		loaiDoiTuongThucHien = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(thuTucHanhChinhId);

		if (loaiDoiTuongThucHien == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(loaiDoiTuongThucHien);
		}
	}

	public long id;
	public long thuTucHanhChinhId;
	public String loaiDoiTuongThucHien;
}