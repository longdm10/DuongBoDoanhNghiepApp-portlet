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

import vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MotCuaDienBienHoSo in entity cache.
 *
 * @author win_64
 * @see MotCuaDienBienHoSo
 * @generated
 */
public class MotCuaDienBienHoSoCacheModel implements CacheModel<MotCuaDienBienHoSo>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(id);
		sb.append(", hoSoThuTucId=");
		sb.append(hoSoThuTucId);
		sb.append(", phieuXuLyId=");
		sb.append(phieuXuLyId);
		sb.append(", soNgayQuaHan=");
		sb.append(soNgayQuaHan);
		sb.append(", trangThaiTruocId=");
		sb.append(trangThaiTruocId);
		sb.append(", trangThaiSauId=");
		sb.append(trangThaiSauId);
		sb.append(", ngayXuLy=");
		sb.append(ngayXuLy);
		sb.append(", nguoiXuLy=");
		sb.append(nguoiXuLy);
		sb.append(", hanhDongXuLy=");
		sb.append(hanhDongXuLy);
		sb.append(", ghiChu=");
		sb.append(ghiChu);
		sb.append(", taiLieuDinhKem=");
		sb.append(taiLieuDinhKem);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MotCuaDienBienHoSo toEntityModel() {
		MotCuaDienBienHoSoImpl motCuaDienBienHoSoImpl = new MotCuaDienBienHoSoImpl();

		motCuaDienBienHoSoImpl.setId(id);
		motCuaDienBienHoSoImpl.setHoSoThuTucId(hoSoThuTucId);
		motCuaDienBienHoSoImpl.setPhieuXuLyId(phieuXuLyId);
		motCuaDienBienHoSoImpl.setSoNgayQuaHan(soNgayQuaHan);
		motCuaDienBienHoSoImpl.setTrangThaiTruocId(trangThaiTruocId);
		motCuaDienBienHoSoImpl.setTrangThaiSauId(trangThaiSauId);

		if (ngayXuLy == Long.MIN_VALUE) {
			motCuaDienBienHoSoImpl.setNgayXuLy(null);
		}
		else {
			motCuaDienBienHoSoImpl.setNgayXuLy(new Date(ngayXuLy));
		}

		motCuaDienBienHoSoImpl.setNguoiXuLy(nguoiXuLy);

		if (hanhDongXuLy == null) {
			motCuaDienBienHoSoImpl.setHanhDongXuLy(StringPool.BLANK);
		}
		else {
			motCuaDienBienHoSoImpl.setHanhDongXuLy(hanhDongXuLy);
		}

		if (ghiChu == null) {
			motCuaDienBienHoSoImpl.setGhiChu(StringPool.BLANK);
		}
		else {
			motCuaDienBienHoSoImpl.setGhiChu(ghiChu);
		}

		motCuaDienBienHoSoImpl.setTaiLieuDinhKem(taiLieuDinhKem);

		motCuaDienBienHoSoImpl.resetOriginalValues();

		return motCuaDienBienHoSoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		hoSoThuTucId = objectInput.readLong();
		phieuXuLyId = objectInput.readLong();
		soNgayQuaHan = objectInput.readInt();
		trangThaiTruocId = objectInput.readLong();
		trangThaiSauId = objectInput.readLong();
		ngayXuLy = objectInput.readLong();
		nguoiXuLy = objectInput.readLong();
		hanhDongXuLy = objectInput.readUTF();
		ghiChu = objectInput.readUTF();
		taiLieuDinhKem = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(hoSoThuTucId);
		objectOutput.writeLong(phieuXuLyId);
		objectOutput.writeInt(soNgayQuaHan);
		objectOutput.writeLong(trangThaiTruocId);
		objectOutput.writeLong(trangThaiSauId);
		objectOutput.writeLong(ngayXuLy);
		objectOutput.writeLong(nguoiXuLy);

		if (hanhDongXuLy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(hanhDongXuLy);
		}

		if (ghiChu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ghiChu);
		}

		objectOutput.writeLong(taiLieuDinhKem);
	}

	public long id;
	public long hoSoThuTucId;
	public long phieuXuLyId;
	public int soNgayQuaHan;
	public long trangThaiTruocId;
	public long trangThaiSauId;
	public long ngayXuLy;
	public long nguoiXuLy;
	public String hanhDongXuLy;
	public String ghiChu;
	public long taiLieuDinhKem;
}