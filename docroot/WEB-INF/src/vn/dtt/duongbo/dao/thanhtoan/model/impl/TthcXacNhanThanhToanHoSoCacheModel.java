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

package vn.dtt.duongbo.dao.thanhtoan.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TthcXacNhanThanhToanHoSo in entity cache.
 *
 * @author win_64
 * @see TthcXacNhanThanhToanHoSo
 * @generated
 */
public class TthcXacNhanThanhToanHoSoCacheModel implements CacheModel<TthcXacNhanThanhToanHoSo>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(id);
		sb.append(", xacNhanThanhToanId=");
		sb.append(xacNhanThanhToanId);
		sb.append(", hoSoThuTucId=");
		sb.append(hoSoThuTucId);
		sb.append(", soTien=");
		sb.append(soTien);
		sb.append(", phieuXuLyId=");
		sb.append(phieuXuLyId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TthcXacNhanThanhToanHoSo toEntityModel() {
		TthcXacNhanThanhToanHoSoImpl tthcXacNhanThanhToanHoSoImpl = new TthcXacNhanThanhToanHoSoImpl();

		tthcXacNhanThanhToanHoSoImpl.setId(id);
		tthcXacNhanThanhToanHoSoImpl.setXacNhanThanhToanId(xacNhanThanhToanId);
		tthcXacNhanThanhToanHoSoImpl.setHoSoThuTucId(hoSoThuTucId);
		tthcXacNhanThanhToanHoSoImpl.setSoTien(soTien);
		tthcXacNhanThanhToanHoSoImpl.setPhieuXuLyId(phieuXuLyId);

		tthcXacNhanThanhToanHoSoImpl.resetOriginalValues();

		return tthcXacNhanThanhToanHoSoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		xacNhanThanhToanId = objectInput.readLong();
		hoSoThuTucId = objectInput.readLong();
		soTien = objectInput.readLong();
		phieuXuLyId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(xacNhanThanhToanId);
		objectOutput.writeLong(hoSoThuTucId);
		objectOutput.writeLong(soTien);
		objectOutput.writeLong(phieuXuLyId);
	}

	public long id;
	public long xacNhanThanhToanId;
	public long hoSoThuTucId;
	public long soTien;
	public long phieuXuLyId;
}