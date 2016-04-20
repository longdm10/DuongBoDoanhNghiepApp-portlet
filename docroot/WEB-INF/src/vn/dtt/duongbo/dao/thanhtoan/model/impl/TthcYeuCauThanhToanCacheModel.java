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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.duongbo.dao.thanhtoan.model.TthcYeuCauThanhToan;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TthcYeuCauThanhToan in entity cache.
 *
 * @author win_64
 * @see TthcYeuCauThanhToan
 * @generated
 */
public class TthcYeuCauThanhToanCacheModel implements CacheModel<TthcYeuCauThanhToan>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(id);
		sb.append(", maSoYeuCau=");
		sb.append(maSoYeuCau);
		sb.append(", soTien=");
		sb.append(soTien);
		sb.append(", chiTietYeuCau=");
		sb.append(chiTietYeuCau);
		sb.append(", ngayTao=");
		sb.append(ngayTao);
		sb.append(", nguoiTao=");
		sb.append(nguoiTao);
		sb.append(", toChucQuanLy=");
		sb.append(toChucQuanLy);
		sb.append(", hoSoThuTucId=");
		sb.append(hoSoThuTucId);
		sb.append(", xacNhanThanhToanId=");
		sb.append(xacNhanThanhToanId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TthcYeuCauThanhToan toEntityModel() {
		TthcYeuCauThanhToanImpl tthcYeuCauThanhToanImpl = new TthcYeuCauThanhToanImpl();

		tthcYeuCauThanhToanImpl.setId(id);

		if (maSoYeuCau == null) {
			tthcYeuCauThanhToanImpl.setMaSoYeuCau(StringPool.BLANK);
		}
		else {
			tthcYeuCauThanhToanImpl.setMaSoYeuCau(maSoYeuCau);
		}

		tthcYeuCauThanhToanImpl.setSoTien(soTien);

		if (chiTietYeuCau == null) {
			tthcYeuCauThanhToanImpl.setChiTietYeuCau(StringPool.BLANK);
		}
		else {
			tthcYeuCauThanhToanImpl.setChiTietYeuCau(chiTietYeuCau);
		}

		if (ngayTao == Long.MIN_VALUE) {
			tthcYeuCauThanhToanImpl.setNgayTao(null);
		}
		else {
			tthcYeuCauThanhToanImpl.setNgayTao(new Date(ngayTao));
		}

		tthcYeuCauThanhToanImpl.setNguoiTao(nguoiTao);
		tthcYeuCauThanhToanImpl.setToChucQuanLy(toChucQuanLy);
		tthcYeuCauThanhToanImpl.setHoSoThuTucId(hoSoThuTucId);
		tthcYeuCauThanhToanImpl.setXacNhanThanhToanId(xacNhanThanhToanId);

		tthcYeuCauThanhToanImpl.resetOriginalValues();

		return tthcYeuCauThanhToanImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		maSoYeuCau = objectInput.readUTF();
		soTien = objectInput.readLong();
		chiTietYeuCau = objectInput.readUTF();
		ngayTao = objectInput.readLong();
		nguoiTao = objectInput.readLong();
		toChucQuanLy = objectInput.readLong();
		hoSoThuTucId = objectInput.readLong();
		xacNhanThanhToanId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (maSoYeuCau == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maSoYeuCau);
		}

		objectOutput.writeLong(soTien);

		if (chiTietYeuCau == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(chiTietYeuCau);
		}

		objectOutput.writeLong(ngayTao);
		objectOutput.writeLong(nguoiTao);
		objectOutput.writeLong(toChucQuanLy);
		objectOutput.writeLong(hoSoThuTucId);
		objectOutput.writeLong(xacNhanThanhToanId);
	}

	public long id;
	public String maSoYeuCau;
	public long soTien;
	public String chiTietYeuCau;
	public long ngayTao;
	public long nguoiTao;
	public long toChucQuanLy;
	public long hoSoThuTucId;
	public long xacNhanThanhToanId;
}