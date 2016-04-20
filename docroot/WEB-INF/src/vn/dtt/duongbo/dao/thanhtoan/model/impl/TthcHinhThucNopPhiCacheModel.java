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

import vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TthcHinhThucNopPhi in entity cache.
 *
 * @author win_64
 * @see TthcHinhThucNopPhi
 * @generated
 */
public class TthcHinhThucNopPhiCacheModel implements CacheModel<TthcHinhThucNopPhi>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(id);
		sb.append(", thuTucHanhChinhId=");
		sb.append(thuTucHanhChinhId);
		sb.append(", donViThucHienId=");
		sb.append(donViThucHienId);
		sb.append(", phiNopBanDau=");
		sb.append(phiNopBanDau);
		sb.append(", chuyenKhoan=");
		sb.append(chuyenKhoan);
		sb.append(", keyPay=");
		sb.append(keyPay);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TthcHinhThucNopPhi toEntityModel() {
		TthcHinhThucNopPhiImpl tthcHinhThucNopPhiImpl = new TthcHinhThucNopPhiImpl();

		tthcHinhThucNopPhiImpl.setId(id);
		tthcHinhThucNopPhiImpl.setThuTucHanhChinhId(thuTucHanhChinhId);
		tthcHinhThucNopPhiImpl.setDonViThucHienId(donViThucHienId);
		tthcHinhThucNopPhiImpl.setPhiNopBanDau(phiNopBanDau);

		if (chuyenKhoan == null) {
			tthcHinhThucNopPhiImpl.setChuyenKhoan(StringPool.BLANK);
		}
		else {
			tthcHinhThucNopPhiImpl.setChuyenKhoan(chuyenKhoan);
		}

		if (keyPay == null) {
			tthcHinhThucNopPhiImpl.setKeyPay(StringPool.BLANK);
		}
		else {
			tthcHinhThucNopPhiImpl.setKeyPay(keyPay);
		}

		tthcHinhThucNopPhiImpl.resetOriginalValues();

		return tthcHinhThucNopPhiImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		thuTucHanhChinhId = objectInput.readLong();
		donViThucHienId = objectInput.readLong();
		phiNopBanDau = objectInput.readLong();
		chuyenKhoan = objectInput.readUTF();
		keyPay = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(thuTucHanhChinhId);
		objectOutput.writeLong(donViThucHienId);
		objectOutput.writeLong(phiNopBanDau);

		if (chuyenKhoan == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(chuyenKhoan);
		}

		if (keyPay == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(keyPay);
		}
	}

	public long id;
	public long thuTucHanhChinhId;
	public long donViThucHienId;
	public long phiNopBanDau;
	public String chuyenKhoan;
	public String keyPay;
}