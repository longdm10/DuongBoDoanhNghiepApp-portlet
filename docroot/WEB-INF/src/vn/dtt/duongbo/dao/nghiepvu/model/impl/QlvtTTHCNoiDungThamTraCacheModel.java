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

import vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing QlvtTTHCNoiDungThamTra in entity cache.
 *
 * @author NhanNc
 * @see QlvtTTHCNoiDungThamTra
 * @generated
 */
public class QlvtTTHCNoiDungThamTraCacheModel implements CacheModel<QlvtTTHCNoiDungThamTra>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(id);
		sb.append(", maTTHC=");
		sb.append(maTTHC);
		sb.append(", toChucXuLy=");
		sb.append(toChucXuLy);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QlvtTTHCNoiDungThamTra toEntityModel() {
		QlvtTTHCNoiDungThamTraImpl qlvtTTHCNoiDungThamTraImpl = new QlvtTTHCNoiDungThamTraImpl();

		qlvtTTHCNoiDungThamTraImpl.setId(id);

		if (maTTHC == null) {
			qlvtTTHCNoiDungThamTraImpl.setMaTTHC(StringPool.BLANK);
		}
		else {
			qlvtTTHCNoiDungThamTraImpl.setMaTTHC(maTTHC);
		}

		qlvtTTHCNoiDungThamTraImpl.setToChucXuLy(toChucXuLy);

		qlvtTTHCNoiDungThamTraImpl.resetOriginalValues();

		return qlvtTTHCNoiDungThamTraImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		maTTHC = objectInput.readUTF();
		toChucXuLy = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (maTTHC == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maTTHC);
		}

		objectOutput.writeInt(toChucXuLy);
	}

	public long id;
	public String maTTHC;
	public int toChucXuLy;
}