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

import vn.dtt.duongbo.dao.common.model.TthcBieuMauHoSo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TthcBieuMauHoSo in entity cache.
 *
 * @author win_64
 * @see TthcBieuMauHoSo
 * @generated
 */
public class TthcBieuMauHoSoCacheModel implements CacheModel<TthcBieuMauHoSo>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(id);
		sb.append(", maBieuMau=");
		sb.append(maBieuMau);
		sb.append(", tenBieuMau=");
		sb.append(tenBieuMau);
		sb.append(", tenTiengAnh=");
		sb.append(tenTiengAnh);
		sb.append(", taiLieuMau=");
		sb.append(taiLieuMau);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TthcBieuMauHoSo toEntityModel() {
		TthcBieuMauHoSoImpl tthcBieuMauHoSoImpl = new TthcBieuMauHoSoImpl();

		tthcBieuMauHoSoImpl.setId(id);

		if (maBieuMau == null) {
			tthcBieuMauHoSoImpl.setMaBieuMau(StringPool.BLANK);
		}
		else {
			tthcBieuMauHoSoImpl.setMaBieuMau(maBieuMau);
		}

		if (tenBieuMau == null) {
			tthcBieuMauHoSoImpl.setTenBieuMau(StringPool.BLANK);
		}
		else {
			tthcBieuMauHoSoImpl.setTenBieuMau(tenBieuMau);
		}

		if (tenTiengAnh == null) {
			tthcBieuMauHoSoImpl.setTenTiengAnh(StringPool.BLANK);
		}
		else {
			tthcBieuMauHoSoImpl.setTenTiengAnh(tenTiengAnh);
		}

		tthcBieuMauHoSoImpl.setTaiLieuMau(taiLieuMau);

		tthcBieuMauHoSoImpl.resetOriginalValues();

		return tthcBieuMauHoSoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		maBieuMau = objectInput.readUTF();
		tenBieuMau = objectInput.readUTF();
		tenTiengAnh = objectInput.readUTF();
		taiLieuMau = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (maBieuMau == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maBieuMau);
		}

		if (tenBieuMau == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenBieuMau);
		}

		if (tenTiengAnh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenTiengAnh);
		}

		objectOutput.writeLong(taiLieuMau);
	}

	public long id;
	public String maBieuMau;
	public String tenBieuMau;
	public String tenTiengAnh;
	public long taiLieuMau;
}