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

package vn.dtt.duongbo.dao.motcua.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTuc;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing MotCuaQuyTrinhThuTuc in entity cache.
 *
 * @author win_64
 * @see MotCuaQuyTrinhThuTuc
 * @generated
 */
public class MotCuaQuyTrinhThuTucCacheModel implements CacheModel<MotCuaQuyTrinhThuTuc>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(id);
		sb.append(", maQuyTrinh=");
		sb.append(maQuyTrinh);
		sb.append(", tenQuyTrinh=");
		sb.append(tenQuyTrinh);
		sb.append(", soNgayXuLy=");
		sb.append(soNgayXuLy);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MotCuaQuyTrinhThuTuc toEntityModel() {
		MotCuaQuyTrinhThuTucImpl motCuaQuyTrinhThuTucImpl = new MotCuaQuyTrinhThuTucImpl();

		motCuaQuyTrinhThuTucImpl.setId(id);

		if (maQuyTrinh == null) {
			motCuaQuyTrinhThuTucImpl.setMaQuyTrinh(StringPool.BLANK);
		}
		else {
			motCuaQuyTrinhThuTucImpl.setMaQuyTrinh(maQuyTrinh);
		}

		if (tenQuyTrinh == null) {
			motCuaQuyTrinhThuTucImpl.setTenQuyTrinh(StringPool.BLANK);
		}
		else {
			motCuaQuyTrinhThuTucImpl.setTenQuyTrinh(tenQuyTrinh);
		}

		motCuaQuyTrinhThuTucImpl.setSoNgayXuLy(soNgayXuLy);

		motCuaQuyTrinhThuTucImpl.resetOriginalValues();

		return motCuaQuyTrinhThuTucImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		maQuyTrinh = objectInput.readUTF();
		tenQuyTrinh = objectInput.readUTF();
		soNgayXuLy = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (maQuyTrinh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maQuyTrinh);
		}

		if (tenQuyTrinh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenQuyTrinh);
		}

		objectOutput.writeLong(soNgayXuLy);
	}

	public long id;
	public String maQuyTrinh;
	public String tenQuyTrinh;
	public long soNgayXuLy;
}