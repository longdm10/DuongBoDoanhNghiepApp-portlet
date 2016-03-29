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

import vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TthcXacNhanThanhToan in entity cache.
 *
 * @author win_64
 * @see TthcXacNhanThanhToan
 * @generated
 */
public class TthcXacNhanThanhToanCacheModel implements CacheModel<TthcXacNhanThanhToan>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{id=");
		sb.append(id);
		sb.append(", maTuSinh=");
		sb.append(maTuSinh);
		sb.append(", soTien=");
		sb.append(soTien);
		sb.append(", hinhThucThanhToan=");
		sb.append(hinhThucThanhToan);
		sb.append(", thongTinXacNhan=");
		sb.append(thongTinXacNhan);
		sb.append(", taiLieuDinhKem=");
		sb.append(taiLieuDinhKem);
		sb.append(", ngayTao=");
		sb.append(ngayTao);
		sb.append(", nguoiTao=");
		sb.append(nguoiTao);
		sb.append(", ngayXacNhan=");
		sb.append(ngayXacNhan);
		sb.append(", nguoiXacNhan=");
		sb.append(nguoiXacNhan);
		sb.append(", toChucQuanLy=");
		sb.append(toChucQuanLy);
		sb.append(", trangThaiXacNhan=");
		sb.append(trangThaiXacNhan);
		sb.append(", yKienXuLy=");
		sb.append(yKienXuLy);
		sb.append(", loaiPhi=");
		sb.append(loaiPhi);
		sb.append(", tenDoanhNghiep=");
		sb.append(tenDoanhNghiep);
		sb.append(", ghiChu=");
		sb.append(ghiChu);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TthcXacNhanThanhToan toEntityModel() {
		TthcXacNhanThanhToanImpl tthcXacNhanThanhToanImpl = new TthcXacNhanThanhToanImpl();

		tthcXacNhanThanhToanImpl.setId(id);

		if (maTuSinh == null) {
			tthcXacNhanThanhToanImpl.setMaTuSinh(StringPool.BLANK);
		}
		else {
			tthcXacNhanThanhToanImpl.setMaTuSinh(maTuSinh);
		}

		tthcXacNhanThanhToanImpl.setSoTien(soTien);
		tthcXacNhanThanhToanImpl.setHinhThucThanhToan(hinhThucThanhToan);

		if (thongTinXacNhan == null) {
			tthcXacNhanThanhToanImpl.setThongTinXacNhan(StringPool.BLANK);
		}
		else {
			tthcXacNhanThanhToanImpl.setThongTinXacNhan(thongTinXacNhan);
		}

		tthcXacNhanThanhToanImpl.setTaiLieuDinhKem(taiLieuDinhKem);

		if (ngayTao == Long.MIN_VALUE) {
			tthcXacNhanThanhToanImpl.setNgayTao(null);
		}
		else {
			tthcXacNhanThanhToanImpl.setNgayTao(new Date(ngayTao));
		}

		tthcXacNhanThanhToanImpl.setNguoiTao(nguoiTao);

		if (ngayXacNhan == Long.MIN_VALUE) {
			tthcXacNhanThanhToanImpl.setNgayXacNhan(null);
		}
		else {
			tthcXacNhanThanhToanImpl.setNgayXacNhan(new Date(ngayXacNhan));
		}

		tthcXacNhanThanhToanImpl.setNguoiXacNhan(nguoiXacNhan);
		tthcXacNhanThanhToanImpl.setToChucQuanLy(toChucQuanLy);
		tthcXacNhanThanhToanImpl.setTrangThaiXacNhan(trangThaiXacNhan);

		if (yKienXuLy == null) {
			tthcXacNhanThanhToanImpl.setYKienXuLy(StringPool.BLANK);
		}
		else {
			tthcXacNhanThanhToanImpl.setYKienXuLy(yKienXuLy);
		}

		if (loaiPhi == null) {
			tthcXacNhanThanhToanImpl.setLoaiPhi(StringPool.BLANK);
		}
		else {
			tthcXacNhanThanhToanImpl.setLoaiPhi(loaiPhi);
		}

		if (tenDoanhNghiep == null) {
			tthcXacNhanThanhToanImpl.setTenDoanhNghiep(StringPool.BLANK);
		}
		else {
			tthcXacNhanThanhToanImpl.setTenDoanhNghiep(tenDoanhNghiep);
		}

		if (ghiChu == null) {
			tthcXacNhanThanhToanImpl.setGhiChu(StringPool.BLANK);
		}
		else {
			tthcXacNhanThanhToanImpl.setGhiChu(ghiChu);
		}

		tthcXacNhanThanhToanImpl.resetOriginalValues();

		return tthcXacNhanThanhToanImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		maTuSinh = objectInput.readUTF();
		soTien = objectInput.readLong();
		hinhThucThanhToan = objectInput.readLong();
		thongTinXacNhan = objectInput.readUTF();
		taiLieuDinhKem = objectInput.readLong();
		ngayTao = objectInput.readLong();
		nguoiTao = objectInput.readLong();
		ngayXacNhan = objectInput.readLong();
		nguoiXacNhan = objectInput.readLong();
		toChucQuanLy = objectInput.readLong();
		trangThaiXacNhan = objectInput.readInt();
		yKienXuLy = objectInput.readUTF();
		loaiPhi = objectInput.readUTF();
		tenDoanhNghiep = objectInput.readUTF();
		ghiChu = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (maTuSinh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maTuSinh);
		}

		objectOutput.writeLong(soTien);
		objectOutput.writeLong(hinhThucThanhToan);

		if (thongTinXacNhan == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(thongTinXacNhan);
		}

		objectOutput.writeLong(taiLieuDinhKem);
		objectOutput.writeLong(ngayTao);
		objectOutput.writeLong(nguoiTao);
		objectOutput.writeLong(ngayXacNhan);
		objectOutput.writeLong(nguoiXacNhan);
		objectOutput.writeLong(toChucQuanLy);
		objectOutput.writeInt(trangThaiXacNhan);

		if (yKienXuLy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(yKienXuLy);
		}

		if (loaiPhi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(loaiPhi);
		}

		if (tenDoanhNghiep == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenDoanhNghiep);
		}

		if (ghiChu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ghiChu);
		}
	}

	public long id;
	public String maTuSinh;
	public long soTien;
	public long hinhThucThanhToan;
	public String thongTinXacNhan;
	public long taiLieuDinhKem;
	public long ngayTao;
	public long nguoiTao;
	public long ngayXacNhan;
	public long nguoiXacNhan;
	public long toChucQuanLy;
	public int trangThaiXacNhan;
	public String yKienXuLy;
	public String loaiPhi;
	public String tenDoanhNghiep;
	public String ghiChu;
}