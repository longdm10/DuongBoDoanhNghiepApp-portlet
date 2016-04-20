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
import com.liferay.portal.model.CacheModel;

import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepBienHieuPhuongTien;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing QLVTCapPhepBienHieuPhuongTien in entity cache.
 *
 * @author binhta
 * @see QLVTCapPhepBienHieuPhuongTien
 * @generated
 */
public class QLVTCapPhepBienHieuPhuongTienCacheModel implements CacheModel<QLVTCapPhepBienHieuPhuongTien>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(id);
		sb.append(", qlvtCapHepBienHieuId=");
		sb.append(qlvtCapHepBienHieuId);
		sb.append(", qlvtPhuongTienVanTaiId=");
		sb.append(qlvtPhuongTienVanTaiId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QLVTCapPhepBienHieuPhuongTien toEntityModel() {
		QLVTCapPhepBienHieuPhuongTienImpl qlvtCapPhepBienHieuPhuongTienImpl = new QLVTCapPhepBienHieuPhuongTienImpl();

		qlvtCapPhepBienHieuPhuongTienImpl.setId(id);
		qlvtCapPhepBienHieuPhuongTienImpl.setQlvtCapHepBienHieuId(qlvtCapHepBienHieuId);
		qlvtCapPhepBienHieuPhuongTienImpl.setQlvtPhuongTienVanTaiId(qlvtPhuongTienVanTaiId);

		qlvtCapPhepBienHieuPhuongTienImpl.resetOriginalValues();

		return qlvtCapPhepBienHieuPhuongTienImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		qlvtCapHepBienHieuId = objectInput.readInt();
		qlvtPhuongTienVanTaiId = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(id);
		objectOutput.writeInt(qlvtCapHepBienHieuId);
		objectOutput.writeInt(qlvtPhuongTienVanTaiId);
	}

	public int id;
	public int qlvtCapHepBienHieuId;
	public int qlvtPhuongTienVanTaiId;
}