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

package vn.dtt.duongbo.dao.quocte.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen in entity cache.
 *
 * @author NoiPham
 * @see QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen
 * @generated
 */
public class QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenCacheModel
	implements CacheModel<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen>,
		Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(id);
		sb.append(", gpkdLoaiHinhKdId=");
		sb.append(gpkdLoaiHinhKdId);
		sb.append(", maTuyen=");
		sb.append(maTuyen);
		sb.append(", tenTuyen=");
		sb.append(tenTuyen);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen toEntityModel() {
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl =
			new QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl();

		qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl.setId(id);
		qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl.setGpkdLoaiHinhKdId(gpkdLoaiHinhKdId);

		if (maTuyen == null) {
			qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl.setMaTuyen(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl.setMaTuyen(maTuyen);
		}

		if (tenTuyen == null) {
			qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl.setTenTuyen(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl.setTenTuyen(tenTuyen);
		}

		qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl.resetOriginalValues();

		return qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		gpkdLoaiHinhKdId = objectInput.readInt();
		maTuyen = objectInput.readUTF();
		tenTuyen = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeInt(gpkdLoaiHinhKdId);

		if (maTuyen == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maTuyen);
		}

		if (tenTuyen == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenTuyen);
		}
	}

	public long id;
	public int gpkdLoaiHinhKdId;
	public String maTuyen;
	public String tenTuyen;
}