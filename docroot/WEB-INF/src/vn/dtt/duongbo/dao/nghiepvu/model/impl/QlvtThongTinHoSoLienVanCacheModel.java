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

import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoLienVan;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing QlvtThongTinHoSoLienVan in entity cache.
 *
 * @author NhanNc
 * @see QlvtThongTinHoSoLienVan
 * @generated
 */
public class QlvtThongTinHoSoLienVanCacheModel implements CacheModel<QlvtThongTinHoSoLienVan>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(id);
		sb.append(", thongtinHoSoId=");
		sb.append(thongtinHoSoId);
		sb.append(", gplienvanID=");
		sb.append(gplienvanID);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QlvtThongTinHoSoLienVan toEntityModel() {
		QlvtThongTinHoSoLienVanImpl qlvtThongTinHoSoLienVanImpl = new QlvtThongTinHoSoLienVanImpl();

		qlvtThongTinHoSoLienVanImpl.setId(id);
		qlvtThongTinHoSoLienVanImpl.setThongtinHoSoId(thongtinHoSoId);
		qlvtThongTinHoSoLienVanImpl.setGplienvanID(gplienvanID);

		qlvtThongTinHoSoLienVanImpl.resetOriginalValues();

		return qlvtThongTinHoSoLienVanImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		thongtinHoSoId = objectInput.readLong();
		gplienvanID = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(thongtinHoSoId);
		objectOutput.writeLong(gplienvanID);
	}

	public long id;
	public long thongtinHoSoId;
	public long gplienvanID;
}