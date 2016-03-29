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

import vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi in entity cache.
 *
 * @author NhanNc
 * @see QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi
 * @generated
 */
public class QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiCacheModel
	implements CacheModel<QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi>,
		Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(id);
		sb.append(", capGplienvanPhuongtienId=");
		sb.append(capGplienvanPhuongtienId);
		sb.append(", maTramDungNghi=");
		sb.append(maTramDungNghi);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi toEntityModel() {
		QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiImpl qlvtCapPhepGplvPhuongTienVanTaiTramdungnghiImpl =
			new QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiImpl();

		qlvtCapPhepGplvPhuongTienVanTaiTramdungnghiImpl.setId(id);
		qlvtCapPhepGplvPhuongTienVanTaiTramdungnghiImpl.setCapGplienvanPhuongtienId(capGplienvanPhuongtienId);

		if (maTramDungNghi == null) {
			qlvtCapPhepGplvPhuongTienVanTaiTramdungnghiImpl.setMaTramDungNghi(StringPool.BLANK);
		}
		else {
			qlvtCapPhepGplvPhuongTienVanTaiTramdungnghiImpl.setMaTramDungNghi(maTramDungNghi);
		}

		qlvtCapPhepGplvPhuongTienVanTaiTramdungnghiImpl.resetOriginalValues();

		return qlvtCapPhepGplvPhuongTienVanTaiTramdungnghiImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		capGplienvanPhuongtienId = objectInput.readLong();
		maTramDungNghi = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(capGplienvanPhuongtienId);

		if (maTramDungNghi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maTramDungNghi);
		}
	}

	public long id;
	public long capGplienvanPhuongtienId;
	public String maTramDungNghi;
}