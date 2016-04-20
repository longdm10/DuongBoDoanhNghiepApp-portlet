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

package vn.dtt.duongbo.dao.common.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSoVaiTro;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TthcPhanNhomHoSoVaiTro in entity cache.
 *
 * @author win_64
 * @see TthcPhanNhomHoSoVaiTro
 * @generated
 */
public class TthcPhanNhomHoSoVaiTroCacheModel implements CacheModel<TthcPhanNhomHoSoVaiTro>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(id);
		sb.append(", phanNhomHoSoId=");
		sb.append(phanNhomHoSoId);
		sb.append(", vaiTroXuLy=");
		sb.append(vaiTroXuLy);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TthcPhanNhomHoSoVaiTro toEntityModel() {
		TthcPhanNhomHoSoVaiTroImpl tthcPhanNhomHoSoVaiTroImpl = new TthcPhanNhomHoSoVaiTroImpl();

		tthcPhanNhomHoSoVaiTroImpl.setId(id);
		tthcPhanNhomHoSoVaiTroImpl.setPhanNhomHoSoId(phanNhomHoSoId);
		tthcPhanNhomHoSoVaiTroImpl.setVaiTroXuLy(vaiTroXuLy);

		tthcPhanNhomHoSoVaiTroImpl.resetOriginalValues();

		return tthcPhanNhomHoSoVaiTroImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		phanNhomHoSoId = objectInput.readLong();
		vaiTroXuLy = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(phanNhomHoSoId);
		objectOutput.writeLong(vaiTroXuLy);
	}

	public long id;
	public long phanNhomHoSoId;
	public long vaiTroXuLy;
}