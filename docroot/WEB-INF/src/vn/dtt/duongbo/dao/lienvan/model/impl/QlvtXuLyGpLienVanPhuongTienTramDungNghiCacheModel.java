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

import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing QlvtXuLyGpLienVanPhuongTienTramDungNghi in entity cache.
 *
 * @author NhanNc
 * @see QlvtXuLyGpLienVanPhuongTienTramDungNghi
 * @generated
 */
public class QlvtXuLyGpLienVanPhuongTienTramDungNghiCacheModel
	implements CacheModel<QlvtXuLyGpLienVanPhuongTienTramDungNghi>,
		Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(id);
		sb.append(", capGplxPhuongTienId=");
		sb.append(capGplxPhuongTienId);
		sb.append(", maTramDungNghi=");
		sb.append(maTramDungNghi);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QlvtXuLyGpLienVanPhuongTienTramDungNghi toEntityModel() {
		QlvtXuLyGpLienVanPhuongTienTramDungNghiImpl qlvtXuLyGpLienVanPhuongTienTramDungNghiImpl =
			new QlvtXuLyGpLienVanPhuongTienTramDungNghiImpl();

		qlvtXuLyGpLienVanPhuongTienTramDungNghiImpl.setId(id);
		qlvtXuLyGpLienVanPhuongTienTramDungNghiImpl.setCapGplxPhuongTienId(capGplxPhuongTienId);

		if (maTramDungNghi == null) {
			qlvtXuLyGpLienVanPhuongTienTramDungNghiImpl.setMaTramDungNghi(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpLienVanPhuongTienTramDungNghiImpl.setMaTramDungNghi(maTramDungNghi);
		}

		qlvtXuLyGpLienVanPhuongTienTramDungNghiImpl.resetOriginalValues();

		return qlvtXuLyGpLienVanPhuongTienTramDungNghiImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		capGplxPhuongTienId = objectInput.readLong();
		maTramDungNghi = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(capGplxPhuongTienId);

		if (maTramDungNghi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maTramDungNghi);
		}
	}

	public long id;
	public long capGplxPhuongTienId;
	public String maTramDungNghi;
}