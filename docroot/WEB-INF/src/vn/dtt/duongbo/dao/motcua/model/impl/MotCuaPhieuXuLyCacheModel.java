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

import vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing MotCuaPhieuXuLy in entity cache.
 *
 * @author win_64
 * @see MotCuaPhieuXuLy
 * @generated
 */
public class MotCuaPhieuXuLyCacheModel implements CacheModel<MotCuaPhieuXuLy>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{id=");
		sb.append(id);
		sb.append(", hoSoThuTucId=");
		sb.append(hoSoThuTucId);
		sb.append(", quyTrinhThuTucId=");
		sb.append(quyTrinhThuTucId);
		sb.append(", soThuTu=");
		sb.append(soThuTu);
		sb.append(", trichYeuNoiDung=");
		sb.append(trichYeuNoiDung);
		sb.append(", ghiChu=");
		sb.append(ghiChu);
		sb.append(", phieuXuLyCha=");
		sb.append(phieuXuLyCha);
		sb.append(", trangThaiHienTaiId=");
		sb.append(trangThaiHienTaiId);
		sb.append(", phanNhomHoSoId=");
		sb.append(phanNhomHoSoId);
		sb.append(", chiemQuyenXuLy=");
		sb.append(chiemQuyenXuLy);
		sb.append(", trangThaiKetThuc=");
		sb.append(trangThaiKetThuc);
		sb.append(", toChucQuanLy=");
		sb.append(toChucQuanLy);
		sb.append(", fileTaiLieu=");
		sb.append(fileTaiLieu);
		sb.append(", nguoiXuLy=");
		sb.append(nguoiXuLy);
		sb.append(", nguoiDuocUyQuyen=");
		sb.append(nguoiDuocUyQuyen);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MotCuaPhieuXuLy toEntityModel() {
		MotCuaPhieuXuLyImpl motCuaPhieuXuLyImpl = new MotCuaPhieuXuLyImpl();

		motCuaPhieuXuLyImpl.setId(id);
		motCuaPhieuXuLyImpl.setHoSoThuTucId(hoSoThuTucId);
		motCuaPhieuXuLyImpl.setQuyTrinhThuTucId(quyTrinhThuTucId);
		motCuaPhieuXuLyImpl.setSoThuTu(soThuTu);

		if (trichYeuNoiDung == null) {
			motCuaPhieuXuLyImpl.setTrichYeuNoiDung(StringPool.BLANK);
		}
		else {
			motCuaPhieuXuLyImpl.setTrichYeuNoiDung(trichYeuNoiDung);
		}

		if (ghiChu == null) {
			motCuaPhieuXuLyImpl.setGhiChu(StringPool.BLANK);
		}
		else {
			motCuaPhieuXuLyImpl.setGhiChu(ghiChu);
		}

		motCuaPhieuXuLyImpl.setPhieuXuLyCha(phieuXuLyCha);
		motCuaPhieuXuLyImpl.setTrangThaiHienTaiId(trangThaiHienTaiId);
		motCuaPhieuXuLyImpl.setPhanNhomHoSoId(phanNhomHoSoId);
		motCuaPhieuXuLyImpl.setChiemQuyenXuLy(chiemQuyenXuLy);
		motCuaPhieuXuLyImpl.setTrangThaiKetThuc(trangThaiKetThuc);
		motCuaPhieuXuLyImpl.setToChucQuanLy(toChucQuanLy);
		motCuaPhieuXuLyImpl.setFileTaiLieu(fileTaiLieu);
		motCuaPhieuXuLyImpl.setNguoiXuLy(nguoiXuLy);
		motCuaPhieuXuLyImpl.setNguoiDuocUyQuyen(nguoiDuocUyQuyen);

		motCuaPhieuXuLyImpl.resetOriginalValues();

		return motCuaPhieuXuLyImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		hoSoThuTucId = objectInput.readLong();
		quyTrinhThuTucId = objectInput.readLong();
		soThuTu = objectInput.readInt();
		trichYeuNoiDung = objectInput.readUTF();
		ghiChu = objectInput.readUTF();
		phieuXuLyCha = objectInput.readLong();
		trangThaiHienTaiId = objectInput.readLong();
		phanNhomHoSoId = objectInput.readLong();
		chiemQuyenXuLy = objectInput.readLong();
		trangThaiKetThuc = objectInput.readLong();
		toChucQuanLy = objectInput.readLong();
		fileTaiLieu = objectInput.readLong();
		nguoiXuLy = objectInput.readLong();
		nguoiDuocUyQuyen = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(hoSoThuTucId);
		objectOutput.writeLong(quyTrinhThuTucId);
		objectOutput.writeInt(soThuTu);

		if (trichYeuNoiDung == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(trichYeuNoiDung);
		}

		if (ghiChu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ghiChu);
		}

		objectOutput.writeLong(phieuXuLyCha);
		objectOutput.writeLong(trangThaiHienTaiId);
		objectOutput.writeLong(phanNhomHoSoId);
		objectOutput.writeLong(chiemQuyenXuLy);
		objectOutput.writeLong(trangThaiKetThuc);
		objectOutput.writeLong(toChucQuanLy);
		objectOutput.writeLong(fileTaiLieu);
		objectOutput.writeLong(nguoiXuLy);
		objectOutput.writeLong(nguoiDuocUyQuyen);
	}

	public long id;
	public long hoSoThuTucId;
	public long quyTrinhThuTucId;
	public int soThuTu;
	public String trichYeuNoiDung;
	public String ghiChu;
	public long phieuXuLyCha;
	public long trangThaiHienTaiId;
	public long phanNhomHoSoId;
	public long chiemQuyenXuLy;
	public long trangThaiKetThuc;
	public long toChucQuanLy;
	public long fileTaiLieu;
	public long nguoiXuLy;
	public long nguoiDuocUyQuyen;
}