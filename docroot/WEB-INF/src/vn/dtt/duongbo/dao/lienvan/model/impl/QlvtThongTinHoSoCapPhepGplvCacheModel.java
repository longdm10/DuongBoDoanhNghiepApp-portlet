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

import vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoCapPhepGplv;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing QlvtThongTinHoSoCapPhepGplv in entity cache.
 *
 * @author NhanNc
 * @see QlvtThongTinHoSoCapPhepGplv
 * @generated
 */
public class QlvtThongTinHoSoCapPhepGplvCacheModel implements CacheModel<QlvtThongTinHoSoCapPhepGplv>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(id);
		sb.append(", thongtinhosoId=");
		sb.append(thongtinhosoId);
		sb.append(", capphepGplienvanId=");
		sb.append(capphepGplienvanId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QlvtThongTinHoSoCapPhepGplv toEntityModel() {
		QlvtThongTinHoSoCapPhepGplvImpl qlvtThongTinHoSoCapPhepGplvImpl = new QlvtThongTinHoSoCapPhepGplvImpl();

		qlvtThongTinHoSoCapPhepGplvImpl.setId(id);
		qlvtThongTinHoSoCapPhepGplvImpl.setThongtinhosoId(thongtinhosoId);
		qlvtThongTinHoSoCapPhepGplvImpl.setCapphepGplienvanId(capphepGplienvanId);

		qlvtThongTinHoSoCapPhepGplvImpl.resetOriginalValues();

		return qlvtThongTinHoSoCapPhepGplvImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		thongtinhosoId = objectInput.readLong();
		capphepGplienvanId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(thongtinhosoId);
		objectOutput.writeLong(capphepGplienvanId);
	}

	public long id;
	public long thongtinhosoId;
	public long capphepGplienvanId;
}