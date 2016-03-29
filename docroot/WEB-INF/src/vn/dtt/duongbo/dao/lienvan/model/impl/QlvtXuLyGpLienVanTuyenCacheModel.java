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

import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QlvtXuLyGpLienVanTuyen in entity cache.
 *
 * @author NhanNc
 * @see QlvtXuLyGpLienVanTuyen
 * @generated
 */
public class QlvtXuLyGpLienVanTuyenCacheModel implements CacheModel<QlvtXuLyGpLienVanTuyen>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(id);
		sb.append(", gpLienVanPhuongTienId=");
		sb.append(gpLienVanPhuongTienId);
		sb.append(", maTuyen=");
		sb.append(maTuyen);
		sb.append(", tenTuyen=");
		sb.append(tenTuyen);
		sb.append(", tuNgay=");
		sb.append(tuNgay);
		sb.append(", denNgay=");
		sb.append(denNgay);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QlvtXuLyGpLienVanTuyen toEntityModel() {
		QlvtXuLyGpLienVanTuyenImpl qlvtXuLyGpLienVanTuyenImpl = new QlvtXuLyGpLienVanTuyenImpl();

		qlvtXuLyGpLienVanTuyenImpl.setId(id);
		qlvtXuLyGpLienVanTuyenImpl.setGpLienVanPhuongTienId(gpLienVanPhuongTienId);

		if (maTuyen == null) {
			qlvtXuLyGpLienVanTuyenImpl.setMaTuyen(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpLienVanTuyenImpl.setMaTuyen(maTuyen);
		}

		if (tenTuyen == null) {
			qlvtXuLyGpLienVanTuyenImpl.setTenTuyen(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpLienVanTuyenImpl.setTenTuyen(tenTuyen);
		}

		if (tuNgay == Long.MIN_VALUE) {
			qlvtXuLyGpLienVanTuyenImpl.setTuNgay(null);
		}
		else {
			qlvtXuLyGpLienVanTuyenImpl.setTuNgay(new Date(tuNgay));
		}

		if (denNgay == Long.MIN_VALUE) {
			qlvtXuLyGpLienVanTuyenImpl.setDenNgay(null);
		}
		else {
			qlvtXuLyGpLienVanTuyenImpl.setDenNgay(new Date(denNgay));
		}

		qlvtXuLyGpLienVanTuyenImpl.resetOriginalValues();

		return qlvtXuLyGpLienVanTuyenImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		gpLienVanPhuongTienId = objectInput.readLong();
		maTuyen = objectInput.readUTF();
		tenTuyen = objectInput.readUTF();
		tuNgay = objectInput.readLong();
		denNgay = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(gpLienVanPhuongTienId);

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

		objectOutput.writeLong(tuNgay);
		objectOutput.writeLong(denNgay);
	}

	public long id;
	public long gpLienVanPhuongTienId;
	public String maTuyen;
	public String tenTuyen;
	public long tuNgay;
	public long denNgay;
}