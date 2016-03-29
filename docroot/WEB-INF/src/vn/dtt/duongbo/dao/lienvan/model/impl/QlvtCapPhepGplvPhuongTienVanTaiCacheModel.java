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
import com.liferay.portal.model.CacheModel;

import vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvPhuongTienVanTai;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing QlvtCapPhepGplvPhuongTienVanTai in entity cache.
 *
 * @author NhanNc
 * @see QlvtCapPhepGplvPhuongTienVanTai
 * @generated
 */
public class QlvtCapPhepGplvPhuongTienVanTaiCacheModel implements CacheModel<QlvtCapPhepGplvPhuongTienVanTai>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(id);
		sb.append(", capphepGplienvanPhuongtienId=");
		sb.append(capphepGplienvanPhuongtienId);
		sb.append(", capphepPhuongtienvantaiId=");
		sb.append(capphepPhuongtienvantaiId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QlvtCapPhepGplvPhuongTienVanTai toEntityModel() {
		QlvtCapPhepGplvPhuongTienVanTaiImpl qlvtCapPhepGplvPhuongTienVanTaiImpl = new QlvtCapPhepGplvPhuongTienVanTaiImpl();

		qlvtCapPhepGplvPhuongTienVanTaiImpl.setId(id);
		qlvtCapPhepGplvPhuongTienVanTaiImpl.setCapphepGplienvanPhuongtienId(capphepGplienvanPhuongtienId);
		qlvtCapPhepGplvPhuongTienVanTaiImpl.setCapphepPhuongtienvantaiId(capphepPhuongtienvantaiId);

		qlvtCapPhepGplvPhuongTienVanTaiImpl.resetOriginalValues();

		return qlvtCapPhepGplvPhuongTienVanTaiImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		capphepGplienvanPhuongtienId = objectInput.readLong();
		capphepPhuongtienvantaiId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(capphepGplienvanPhuongtienId);
		objectOutput.writeLong(capphepPhuongtienvantaiId);
	}

	public long id;
	public long capphepGplienvanPhuongtienId;
	public long capphepPhuongtienvantaiId;
}