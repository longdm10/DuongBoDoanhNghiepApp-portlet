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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.duongbo.dao.common.model.TthcTrangThaiHoSo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TthcTrangThaiHoSo in entity cache.
 *
 * @author win_64
 * @see TthcTrangThaiHoSo
 * @generated
 */
public class TthcTrangThaiHoSoCacheModel implements CacheModel<TthcTrangThaiHoSo>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{id=");
		sb.append(id);
		sb.append(", quyTrinhThuTucId=");
		sb.append(quyTrinhThuTucId);
		sb.append(", maTrangThai=");
		sb.append(maTrangThai);
		sb.append(", tenTrangThai=");
		sb.append(tenTrangThai);
		sb.append(", tenTiengAnh=");
		sb.append(tenTiengAnh);
		sb.append(", soThuTu=");
		sb.append(soThuTu);
		sb.append(", trangThaiKetThuc=");
		sb.append(trangThaiKetThuc);
		sb.append(", moTaTrangThai=");
		sb.append(moTaTrangThai);
		sb.append(", vaiTroXuLy1=");
		sb.append(vaiTroXuLy1);
		sb.append(", vaiTroXuLy2=");
		sb.append(vaiTroXuLy2);
		sb.append(", vaiTroXuLy3=");
		sb.append(vaiTroXuLy3);
		sb.append(", formXuLy=");
		sb.append(formXuLy);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TthcTrangThaiHoSo toEntityModel() {
		TthcTrangThaiHoSoImpl tthcTrangThaiHoSoImpl = new TthcTrangThaiHoSoImpl();

		tthcTrangThaiHoSoImpl.setId(id);
		tthcTrangThaiHoSoImpl.setQuyTrinhThuTucId(quyTrinhThuTucId);

		if (maTrangThai == null) {
			tthcTrangThaiHoSoImpl.setMaTrangThai(StringPool.BLANK);
		}
		else {
			tthcTrangThaiHoSoImpl.setMaTrangThai(maTrangThai);
		}

		if (tenTrangThai == null) {
			tthcTrangThaiHoSoImpl.setTenTrangThai(StringPool.BLANK);
		}
		else {
			tthcTrangThaiHoSoImpl.setTenTrangThai(tenTrangThai);
		}

		if (tenTiengAnh == null) {
			tthcTrangThaiHoSoImpl.setTenTiengAnh(StringPool.BLANK);
		}
		else {
			tthcTrangThaiHoSoImpl.setTenTiengAnh(tenTiengAnh);
		}

		tthcTrangThaiHoSoImpl.setSoThuTu(soThuTu);
		tthcTrangThaiHoSoImpl.setTrangThaiKetThuc(trangThaiKetThuc);

		if (moTaTrangThai == null) {
			tthcTrangThaiHoSoImpl.setMoTaTrangThai(StringPool.BLANK);
		}
		else {
			tthcTrangThaiHoSoImpl.setMoTaTrangThai(moTaTrangThai);
		}

		tthcTrangThaiHoSoImpl.setVaiTroXuLy1(vaiTroXuLy1);
		tthcTrangThaiHoSoImpl.setVaiTroXuLy2(vaiTroXuLy2);
		tthcTrangThaiHoSoImpl.setVaiTroXuLy3(vaiTroXuLy3);

		if (formXuLy == null) {
			tthcTrangThaiHoSoImpl.setFormXuLy(StringPool.BLANK);
		}
		else {
			tthcTrangThaiHoSoImpl.setFormXuLy(formXuLy);
		}

		tthcTrangThaiHoSoImpl.resetOriginalValues();

		return tthcTrangThaiHoSoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		quyTrinhThuTucId = objectInput.readLong();
		maTrangThai = objectInput.readUTF();
		tenTrangThai = objectInput.readUTF();
		tenTiengAnh = objectInput.readUTF();
		soThuTu = objectInput.readInt();
		trangThaiKetThuc = objectInput.readInt();
		moTaTrangThai = objectInput.readUTF();
		vaiTroXuLy1 = objectInput.readLong();
		vaiTroXuLy2 = objectInput.readLong();
		vaiTroXuLy3 = objectInput.readLong();
		formXuLy = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(quyTrinhThuTucId);

		if (maTrangThai == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maTrangThai);
		}

		if (tenTrangThai == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenTrangThai);
		}

		if (tenTiengAnh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenTiengAnh);
		}

		objectOutput.writeInt(soThuTu);
		objectOutput.writeInt(trangThaiKetThuc);

		if (moTaTrangThai == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(moTaTrangThai);
		}

		objectOutput.writeLong(vaiTroXuLy1);
		objectOutput.writeLong(vaiTroXuLy2);
		objectOutput.writeLong(vaiTroXuLy3);

		if (formXuLy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(formXuLy);
		}
	}

	public long id;
	public long quyTrinhThuTucId;
	public String maTrangThai;
	public String tenTrangThai;
	public String tenTiengAnh;
	public int soThuTu;
	public int trangThaiKetThuc;
	public String moTaTrangThai;
	public long vaiTroXuLy1;
	public long vaiTroXuLy2;
	public long vaiTroXuLy3;
	public String formXuLy;
}