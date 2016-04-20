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
import com.liferay.portal.model.CacheModel;

import vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TthcThanhPhanHoSoBieuMau in entity cache.
 *
 * @author win_64
 * @see TthcThanhPhanHoSoBieuMau
 * @generated
 */
public class TthcThanhPhanHoSoBieuMauCacheModel implements CacheModel<TthcThanhPhanHoSoBieuMau>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(id);
		sb.append(", thanhPhanHoSoId=");
		sb.append(thanhPhanHoSoId);
		sb.append(", bieuMauHoSoId=");
		sb.append(bieuMauHoSoId);
		sb.append(", soThuTu=");
		sb.append(soThuTu);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TthcThanhPhanHoSoBieuMau toEntityModel() {
		TthcThanhPhanHoSoBieuMauImpl tthcThanhPhanHoSoBieuMauImpl = new TthcThanhPhanHoSoBieuMauImpl();

		tthcThanhPhanHoSoBieuMauImpl.setId(id);
		tthcThanhPhanHoSoBieuMauImpl.setThanhPhanHoSoId(thanhPhanHoSoId);
		tthcThanhPhanHoSoBieuMauImpl.setBieuMauHoSoId(bieuMauHoSoId);
		tthcThanhPhanHoSoBieuMauImpl.setSoThuTu(soThuTu);

		tthcThanhPhanHoSoBieuMauImpl.resetOriginalValues();

		return tthcThanhPhanHoSoBieuMauImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		thanhPhanHoSoId = objectInput.readLong();
		bieuMauHoSoId = objectInput.readLong();
		soThuTu = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(thanhPhanHoSoId);
		objectOutput.writeLong(bieuMauHoSoId);
		objectOutput.writeInt(soThuTu);
	}

	public long id;
	public long thanhPhanHoSoId;
	public long bieuMauHoSoId;
	public int soThuTu;
}