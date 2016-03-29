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
import com.liferay.portal.model.CacheModel;

import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoQuocTe;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing QlvtThongTinHoSoQuocTe in entity cache.
 *
 * @author NhanNc
 * @see QlvtThongTinHoSoQuocTe
 * @generated
 */
public class QlvtThongTinHoSoQuocTeCacheModel implements CacheModel<QlvtThongTinHoSoQuocTe>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(id);
		sb.append(", thongtinHoSoId=");
		sb.append(thongtinHoSoId);
		sb.append(", gpkdvtID=");
		sb.append(gpkdvtID);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QlvtThongTinHoSoQuocTe toEntityModel() {
		QlvtThongTinHoSoQuocTeImpl qlvtThongTinHoSoQuocTeImpl = new QlvtThongTinHoSoQuocTeImpl();

		qlvtThongTinHoSoQuocTeImpl.setId(id);
		qlvtThongTinHoSoQuocTeImpl.setThongtinHoSoId(thongtinHoSoId);
		qlvtThongTinHoSoQuocTeImpl.setGpkdvtID(gpkdvtID);

		qlvtThongTinHoSoQuocTeImpl.resetOriginalValues();

		return qlvtThongTinHoSoQuocTeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		thongtinHoSoId = objectInput.readLong();
		gpkdvtID = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(thongtinHoSoId);
		objectOutput.writeLong(gpkdvtID);
	}

	public long id;
	public long thongtinHoSoId;
	public long gpkdvtID;
}