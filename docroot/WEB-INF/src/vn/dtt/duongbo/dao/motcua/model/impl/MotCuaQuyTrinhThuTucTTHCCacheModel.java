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
import com.liferay.portal.model.CacheModel;

import vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing MotCuaQuyTrinhThuTucTTHC in entity cache.
 *
 * @author win_64
 * @see MotCuaQuyTrinhThuTucTTHC
 * @generated
 */
public class MotCuaQuyTrinhThuTucTTHCCacheModel implements CacheModel<MotCuaQuyTrinhThuTucTTHC>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(id);
		sb.append(", quyTrinhThuTucId=");
		sb.append(quyTrinhThuTucId);
		sb.append(", thuTucHanhChinhID=");
		sb.append(thuTucHanhChinhID);
		sb.append(", toChucXuLy=");
		sb.append(toChucXuLy);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MotCuaQuyTrinhThuTucTTHC toEntityModel() {
		MotCuaQuyTrinhThuTucTTHCImpl motCuaQuyTrinhThuTucTTHCImpl = new MotCuaQuyTrinhThuTucTTHCImpl();

		motCuaQuyTrinhThuTucTTHCImpl.setId(id);
		motCuaQuyTrinhThuTucTTHCImpl.setQuyTrinhThuTucId(quyTrinhThuTucId);
		motCuaQuyTrinhThuTucTTHCImpl.setThuTucHanhChinhID(thuTucHanhChinhID);
		motCuaQuyTrinhThuTucTTHCImpl.setToChucXuLy(toChucXuLy);

		motCuaQuyTrinhThuTucTTHCImpl.resetOriginalValues();

		return motCuaQuyTrinhThuTucTTHCImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		quyTrinhThuTucId = objectInput.readLong();
		thuTucHanhChinhID = objectInput.readLong();
		toChucXuLy = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(quyTrinhThuTucId);
		objectOutput.writeLong(thuTucHanhChinhID);
		objectOutput.writeLong(toChucXuLy);
	}

	public long id;
	public long quyTrinhThuTucId;
	public long thuTucHanhChinhID;
	public long toChucXuLy;
}