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

package vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepPhuHieuPhuongTien;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing QLVTCapPhepPhuHieuPhuongTien in entity cache.
 *
 * @author binhta
 * @see QLVTCapPhepPhuHieuPhuongTien
 * @generated
 */
public class QLVTCapPhepPhuHieuPhuongTienCacheModel implements CacheModel<QLVTCapPhepPhuHieuPhuongTien>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(id);
		sb.append(", qlvtCapPhepPhuHieuXeId=");
		sb.append(qlvtCapPhepPhuHieuXeId);
		sb.append(", qlvtPhuongTienVanTaiId=");
		sb.append(qlvtPhuongTienVanTaiId);
		sb.append(", trangThai=");
		sb.append(trangThai);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QLVTCapPhepPhuHieuPhuongTien toEntityModel() {
		QLVTCapPhepPhuHieuPhuongTienImpl qlvtCapPhepPhuHieuPhuongTienImpl = new QLVTCapPhepPhuHieuPhuongTienImpl();

		qlvtCapPhepPhuHieuPhuongTienImpl.setId(id);
		qlvtCapPhepPhuHieuPhuongTienImpl.setQlvtCapPhepPhuHieuXeId(qlvtCapPhepPhuHieuXeId);
		qlvtCapPhepPhuHieuPhuongTienImpl.setQlvtPhuongTienVanTaiId(qlvtPhuongTienVanTaiId);

		if (trangThai == null) {
			qlvtCapPhepPhuHieuPhuongTienImpl.setTrangThai(StringPool.BLANK);
		}
		else {
			qlvtCapPhepPhuHieuPhuongTienImpl.setTrangThai(trangThai);
		}

		qlvtCapPhepPhuHieuPhuongTienImpl.resetOriginalValues();

		return qlvtCapPhepPhuHieuPhuongTienImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		qlvtCapPhepPhuHieuXeId = objectInput.readInt();
		qlvtPhuongTienVanTaiId = objectInput.readInt();
		trangThai = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(id);
		objectOutput.writeInt(qlvtCapPhepPhuHieuXeId);
		objectOutput.writeInt(qlvtPhuongTienVanTaiId);

		if (trangThai == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(trangThai);
		}
	}

	public int id;
	public int qlvtCapPhepPhuHieuXeId;
	public int qlvtPhuongTienVanTaiId;
	public String trangThai;
}