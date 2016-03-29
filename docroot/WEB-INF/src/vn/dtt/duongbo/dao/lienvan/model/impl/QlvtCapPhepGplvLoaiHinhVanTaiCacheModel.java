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

import vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvLoaiHinhVanTai;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing QlvtCapPhepGplvLoaiHinhVanTai in entity cache.
 *
 * @author NhanNc
 * @see QlvtCapPhepGplvLoaiHinhVanTai
 * @generated
 */
public class QlvtCapPhepGplvLoaiHinhVanTaiCacheModel implements CacheModel<QlvtCapPhepGplvLoaiHinhVanTai>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(id);
		sb.append(", gpLienVanId=");
		sb.append(gpLienVanId);
		sb.append(", maLoaiHinhVanTai=");
		sb.append(maLoaiHinhVanTai);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QlvtCapPhepGplvLoaiHinhVanTai toEntityModel() {
		QlvtCapPhepGplvLoaiHinhVanTaiImpl qlvtCapPhepGplvLoaiHinhVanTaiImpl = new QlvtCapPhepGplvLoaiHinhVanTaiImpl();

		qlvtCapPhepGplvLoaiHinhVanTaiImpl.setId(id);
		qlvtCapPhepGplvLoaiHinhVanTaiImpl.setGpLienVanId(gpLienVanId);

		if (maLoaiHinhVanTai == null) {
			qlvtCapPhepGplvLoaiHinhVanTaiImpl.setMaLoaiHinhVanTai(StringPool.BLANK);
		}
		else {
			qlvtCapPhepGplvLoaiHinhVanTaiImpl.setMaLoaiHinhVanTai(maLoaiHinhVanTai);
		}

		qlvtCapPhepGplvLoaiHinhVanTaiImpl.resetOriginalValues();

		return qlvtCapPhepGplvLoaiHinhVanTaiImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		gpLienVanId = objectInput.readLong();
		maLoaiHinhVanTai = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(gpLienVanId);

		if (maLoaiHinhVanTai == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maLoaiHinhVanTai);
		}
	}

	public long id;
	public long gpLienVanId;
	public String maLoaiHinhVanTai;
}