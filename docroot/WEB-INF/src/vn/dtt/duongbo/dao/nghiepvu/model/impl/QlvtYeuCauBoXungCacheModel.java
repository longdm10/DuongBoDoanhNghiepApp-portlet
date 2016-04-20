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

package vn.dtt.duongbo.dao.nghiepvu.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.duongbo.dao.nghiepvu.model.QlvtYeuCauBoXung;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QlvtYeuCauBoXung in entity cache.
 *
 * @author NhanNc
 * @see QlvtYeuCauBoXung
 * @generated
 */
public class QlvtYeuCauBoXungCacheModel implements CacheModel<QlvtYeuCauBoXung>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(id);
		sb.append(", noiDung=");
		sb.append(noiDung);
		sb.append(", thongTinXuLyId=");
		sb.append(thongTinXuLyId);
		sb.append(", soCongVan=");
		sb.append(soCongVan);
		sb.append(", ngayCongVan=");
		sb.append(ngayCongVan);
		sb.append(", fileID=");
		sb.append(fileID);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QlvtYeuCauBoXung toEntityModel() {
		QlvtYeuCauBoXungImpl qlvtYeuCauBoXungImpl = new QlvtYeuCauBoXungImpl();

		qlvtYeuCauBoXungImpl.setId(id);

		if (noiDung == null) {
			qlvtYeuCauBoXungImpl.setNoiDung(StringPool.BLANK);
		}
		else {
			qlvtYeuCauBoXungImpl.setNoiDung(noiDung);
		}

		qlvtYeuCauBoXungImpl.setThongTinXuLyId(thongTinXuLyId);

		if (soCongVan == null) {
			qlvtYeuCauBoXungImpl.setSoCongVan(StringPool.BLANK);
		}
		else {
			qlvtYeuCauBoXungImpl.setSoCongVan(soCongVan);
		}

		if (ngayCongVan == Long.MIN_VALUE) {
			qlvtYeuCauBoXungImpl.setNgayCongVan(null);
		}
		else {
			qlvtYeuCauBoXungImpl.setNgayCongVan(new Date(ngayCongVan));
		}

		qlvtYeuCauBoXungImpl.setFileID(fileID);

		qlvtYeuCauBoXungImpl.resetOriginalValues();

		return qlvtYeuCauBoXungImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		noiDung = objectInput.readUTF();
		thongTinXuLyId = objectInput.readInt();
		soCongVan = objectInput.readUTF();
		ngayCongVan = objectInput.readLong();
		fileID = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (noiDung == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(noiDung);
		}

		objectOutput.writeInt(thongTinXuLyId);

		if (soCongVan == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soCongVan);
		}

		objectOutput.writeLong(ngayCongVan);
		objectOutput.writeInt(fileID);
	}

	public long id;
	public String noiDung;
	public int thongTinXuLyId;
	public String soCongVan;
	public long ngayCongVan;
	public int fileID;
}