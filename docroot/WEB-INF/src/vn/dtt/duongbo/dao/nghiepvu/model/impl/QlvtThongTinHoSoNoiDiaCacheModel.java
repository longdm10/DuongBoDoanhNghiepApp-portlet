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

import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoNoiDia;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing QlvtThongTinHoSoNoiDia in entity cache.
 *
 * @author NhanNc
 * @see QlvtThongTinHoSoNoiDia
 * @generated
 */
public class QlvtThongTinHoSoNoiDiaCacheModel implements CacheModel<QlvtThongTinHoSoNoiDia>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(id);
		sb.append(", thongtinHoSoId=");
		sb.append(thongtinHoSoId);
		sb.append(", noiDiaId=");
		sb.append(noiDiaId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QlvtThongTinHoSoNoiDia toEntityModel() {
		QlvtThongTinHoSoNoiDiaImpl qlvtThongTinHoSoNoiDiaImpl = new QlvtThongTinHoSoNoiDiaImpl();

		qlvtThongTinHoSoNoiDiaImpl.setId(id);
		qlvtThongTinHoSoNoiDiaImpl.setThongtinHoSoId(thongtinHoSoId);
		qlvtThongTinHoSoNoiDiaImpl.setNoiDiaId(noiDiaId);

		qlvtThongTinHoSoNoiDiaImpl.resetOriginalValues();

		return qlvtThongTinHoSoNoiDiaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		thongtinHoSoId = objectInput.readLong();
		noiDiaId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(thongtinHoSoId);
		objectOutput.writeLong(noiDiaId);
	}

	public long id;
	public long thongtinHoSoId;
	public long noiDiaId;
}