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

import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTienTuyen;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing QLVTXuLyPhuHieuPhuongTienTuyen in entity cache.
 *
 * @author binhta
 * @see QLVTXuLyPhuHieuPhuongTienTuyen
 * @generated
 */
public class QLVTXuLyPhuHieuPhuongTienTuyenCacheModel implements CacheModel<QLVTXuLyPhuHieuPhuongTienTuyen>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(id);
		sb.append(", ptCapPhuHieuId=");
		sb.append(ptCapPhuHieuId);
		sb.append(", maTuyen=");
		sb.append(maTuyen);
		sb.append(", tenTuyen=");
		sb.append(tenTuyen);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QLVTXuLyPhuHieuPhuongTienTuyen toEntityModel() {
		QLVTXuLyPhuHieuPhuongTienTuyenImpl qlvtXuLyPhuHieuPhuongTienTuyenImpl = new QLVTXuLyPhuHieuPhuongTienTuyenImpl();

		qlvtXuLyPhuHieuPhuongTienTuyenImpl.setId(id);
		qlvtXuLyPhuHieuPhuongTienTuyenImpl.setPtCapPhuHieuId(ptCapPhuHieuId);

		if (maTuyen == null) {
			qlvtXuLyPhuHieuPhuongTienTuyenImpl.setMaTuyen(StringPool.BLANK);
		}
		else {
			qlvtXuLyPhuHieuPhuongTienTuyenImpl.setMaTuyen(maTuyen);
		}

		if (tenTuyen == null) {
			qlvtXuLyPhuHieuPhuongTienTuyenImpl.setTenTuyen(StringPool.BLANK);
		}
		else {
			qlvtXuLyPhuHieuPhuongTienTuyenImpl.setTenTuyen(tenTuyen);
		}

		qlvtXuLyPhuHieuPhuongTienTuyenImpl.resetOriginalValues();

		return qlvtXuLyPhuHieuPhuongTienTuyenImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		ptCapPhuHieuId = objectInput.readInt();
		maTuyen = objectInput.readUTF();
		tenTuyen = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(id);
		objectOutput.writeInt(ptCapPhuHieuId);

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

	public int id;
	public int ptCapPhuHieuId;
	public String maTuyen;
	public String tenTuyen;
}