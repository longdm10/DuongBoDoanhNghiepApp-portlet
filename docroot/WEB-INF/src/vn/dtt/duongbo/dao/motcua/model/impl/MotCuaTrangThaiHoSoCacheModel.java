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

package vn.dtt.duongbo.dao.motcua.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.duongbo.dao.motcua.model.MotCuaTrangThaiHoSo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing MotCuaTrangThaiHoSo in entity cache.
 *
 * @author win_64
 * @see MotCuaTrangThaiHoSo
 * @generated
 */
public class MotCuaTrangThaiHoSoCacheModel implements CacheModel<MotCuaTrangThaiHoSo>,
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
	public MotCuaTrangThaiHoSo toEntityModel() {
		MotCuaTrangThaiHoSoImpl motCuaTrangThaiHoSoImpl = new MotCuaTrangThaiHoSoImpl();

		motCuaTrangThaiHoSoImpl.setId(id);
		motCuaTrangThaiHoSoImpl.setQuyTrinhThuTucId(quyTrinhThuTucId);

		if (maTrangThai == null) {
			motCuaTrangThaiHoSoImpl.setMaTrangThai(StringPool.BLANK);
		}
		else {
			motCuaTrangThaiHoSoImpl.setMaTrangThai(maTrangThai);
		}

		if (tenTrangThai == null) {
			motCuaTrangThaiHoSoImpl.setTenTrangThai(StringPool.BLANK);
		}
		else {
			motCuaTrangThaiHoSoImpl.setTenTrangThai(tenTrangThai);
		}

		if (tenTiengAnh == null) {
			motCuaTrangThaiHoSoImpl.setTenTiengAnh(StringPool.BLANK);
		}
		else {
			motCuaTrangThaiHoSoImpl.setTenTiengAnh(tenTiengAnh);
		}

		motCuaTrangThaiHoSoImpl.setSoThuTu(soThuTu);
		motCuaTrangThaiHoSoImpl.setTrangThaiKetThuc(trangThaiKetThuc);

		if (moTaTrangThai == null) {
			motCuaTrangThaiHoSoImpl.setMoTaTrangThai(StringPool.BLANK);
		}
		else {
			motCuaTrangThaiHoSoImpl.setMoTaTrangThai(moTaTrangThai);
		}

		motCuaTrangThaiHoSoImpl.setVaiTroXuLy1(vaiTroXuLy1);
		motCuaTrangThaiHoSoImpl.setVaiTroXuLy2(vaiTroXuLy2);
		motCuaTrangThaiHoSoImpl.setVaiTroXuLy3(vaiTroXuLy3);

		if (formXuLy == null) {
			motCuaTrangThaiHoSoImpl.setFormXuLy(StringPool.BLANK);
		}
		else {
			motCuaTrangThaiHoSoImpl.setFormXuLy(formXuLy);
		}

		motCuaTrangThaiHoSoImpl.resetOriginalValues();

		return motCuaTrangThaiHoSoImpl;
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