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

import vn.dtt.duongbo.dao.motcua.model.OEPThuTucHanhChinhRole;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing OEPThuTucHanhChinhRole in entity cache.
 *
 * @author win_64
 * @see OEPThuTucHanhChinhRole
 * @generated
 */
public class OEPThuTucHanhChinhRoleCacheModel implements CacheModel<OEPThuTucHanhChinhRole>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(id);
		sb.append(", thuTucHinhChinhId=");
		sb.append(thuTucHinhChinhId);
		sb.append(", vaiTroThucHien=");
		sb.append(vaiTroThucHien);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OEPThuTucHanhChinhRole toEntityModel() {
		OEPThuTucHanhChinhRoleImpl oepThuTucHanhChinhRoleImpl = new OEPThuTucHanhChinhRoleImpl();

		oepThuTucHanhChinhRoleImpl.setId(id);
		oepThuTucHanhChinhRoleImpl.setThuTucHinhChinhId(thuTucHinhChinhId);
		oepThuTucHanhChinhRoleImpl.setVaiTroThucHien(vaiTroThucHien);

		oepThuTucHanhChinhRoleImpl.resetOriginalValues();

		return oepThuTucHanhChinhRoleImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		thuTucHinhChinhId = objectInput.readInt();
		vaiTroThucHien = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(id);
		objectOutput.writeInt(thuTucHinhChinhId);
		objectOutput.writeInt(vaiTroThucHien);
	}

	public int id;
	public int thuTucHinhChinhId;
	public int vaiTroThucHien;
}