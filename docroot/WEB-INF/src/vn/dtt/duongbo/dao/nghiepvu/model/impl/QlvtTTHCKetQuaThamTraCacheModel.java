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

import vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTra;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing QlvtTTHCKetQuaThamTra in entity cache.
 *
 * @author NhanNc
 * @see QlvtTTHCKetQuaThamTra
 * @generated
 */
public class QlvtTTHCKetQuaThamTraCacheModel implements CacheModel<QlvtTTHCKetQuaThamTra>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(id);
		sb.append(", maKetQuaThamTra=");
		sb.append(maKetQuaThamTra);
		sb.append(", maTTHC=");
		sb.append(maTTHC);
		sb.append(", buocXuLy=");
		sb.append(buocXuLy);
		sb.append(", toChucXuLy=");
		sb.append(toChucXuLy);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QlvtTTHCKetQuaThamTra toEntityModel() {
		QlvtTTHCKetQuaThamTraImpl qlvtTTHCKetQuaThamTraImpl = new QlvtTTHCKetQuaThamTraImpl();

		qlvtTTHCKetQuaThamTraImpl.setId(id);

		if (maKetQuaThamTra == null) {
			qlvtTTHCKetQuaThamTraImpl.setMaKetQuaThamTra(StringPool.BLANK);
		}
		else {
			qlvtTTHCKetQuaThamTraImpl.setMaKetQuaThamTra(maKetQuaThamTra);
		}

		if (maTTHC == null) {
			qlvtTTHCKetQuaThamTraImpl.setMaTTHC(StringPool.BLANK);
		}
		else {
			qlvtTTHCKetQuaThamTraImpl.setMaTTHC(maTTHC);
		}

		qlvtTTHCKetQuaThamTraImpl.setBuocXuLy(buocXuLy);
		qlvtTTHCKetQuaThamTraImpl.setToChucXuLy(toChucXuLy);

		qlvtTTHCKetQuaThamTraImpl.resetOriginalValues();

		return qlvtTTHCKetQuaThamTraImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		maKetQuaThamTra = objectInput.readUTF();
		maTTHC = objectInput.readUTF();
		buocXuLy = objectInput.readInt();
		toChucXuLy = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (maKetQuaThamTra == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maKetQuaThamTra);
		}

		if (maTTHC == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maTTHC);
		}

		objectOutput.writeInt(buocXuLy);
		objectOutput.writeInt(toChucXuLy);
	}

	public long id;
	public String maKetQuaThamTra;
	public String maTTHC;
	public int buocXuLy;
	public int toChucXuLy;
}