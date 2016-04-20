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

import vn.dtt.duongbo.dao.common.model.TthcDonViThucHien;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TthcDonViThucHien in entity cache.
 *
 * @author win_64
 * @see TthcDonViThucHien
 * @generated
 */
public class TthcDonViThucHienCacheModel implements CacheModel<TthcDonViThucHien>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(id);
		sb.append(", thuTucHanhChinhId=");
		sb.append(thuTucHanhChinhId);
		sb.append(", maDonVi=");
		sb.append(maDonVi);
		sb.append(", toChuc=");
		sb.append(toChuc);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TthcDonViThucHien toEntityModel() {
		TthcDonViThucHienImpl tthcDonViThucHienImpl = new TthcDonViThucHienImpl();

		tthcDonViThucHienImpl.setId(id);
		tthcDonViThucHienImpl.setThuTucHanhChinhId(thuTucHanhChinhId);

		if (maDonVi == null) {
			tthcDonViThucHienImpl.setMaDonVi(StringPool.BLANK);
		}
		else {
			tthcDonViThucHienImpl.setMaDonVi(maDonVi);
		}

		tthcDonViThucHienImpl.setToChuc(toChuc);

		tthcDonViThucHienImpl.resetOriginalValues();

		return tthcDonViThucHienImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		thuTucHanhChinhId = objectInput.readLong();
		maDonVi = objectInput.readUTF();
		toChuc = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(thuTucHanhChinhId);

		if (maDonVi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maDonVi);
		}

		objectOutput.writeLong(toChuc);
	}

	public long id;
	public long thuTucHanhChinhId;
	public String maDonVi;
	public long toChuc;
}