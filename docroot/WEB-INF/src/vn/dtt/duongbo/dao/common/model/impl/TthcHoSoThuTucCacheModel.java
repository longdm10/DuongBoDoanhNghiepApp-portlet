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

import vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TthcHoSoThuTuc in entity cache.
 *
 * @author win_64
 * @see TthcHoSoThuTuc
 * @generated
 */
public class TthcHoSoThuTucCacheModel implements CacheModel<TthcHoSoThuTuc>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(57);

		sb.append("{id=");
		sb.append(id);
		sb.append(", maSoHoSo=");
		sb.append(maSoHoSo);
		sb.append(", maBienNhan=");
		sb.append(maBienNhan);
		sb.append(", thuTucHanhChinhId=");
		sb.append(thuTucHanhChinhId);
		sb.append(", loaiChuHoSo=");
		sb.append(loaiChuHoSo);
		sb.append(", maSoChuHoSo=");
		sb.append(maSoChuHoSo);
		sb.append(", tenChuHoSo=");
		sb.append(tenChuHoSo);
		sb.append(", diaChiChuHoSo=");
		sb.append(diaChiChuHoSo);
		sb.append(", maDonVi=");
		sb.append(maDonVi);
		sb.append(", nguonGocHoSo=");
		sb.append(nguonGocHoSo);
		sb.append(", trichYeuNoiDung=");
		sb.append(trichYeuNoiDung);
		sb.append(", ngayGuiHoSo=");
		sb.append(ngayGuiHoSo);
		sb.append(", ngayTiepNhan=");
		sb.append(ngayTiepNhan);
		sb.append(", ngayBoSung=");
		sb.append(ngayBoSung);
		sb.append(", ngayHenTra=");
		sb.append(ngayHenTra);
		sb.append(", ngayTraKetQua=");
		sb.append(ngayTraKetQua);
		sb.append(", ngayDongHoSo=");
		sb.append(ngayDongHoSo);
		sb.append(", trangThaiHoSo=");
		sb.append(trangThaiHoSo);
		sb.append(", phanNhomHoSoId=");
		sb.append(phanNhomHoSoId);
		sb.append(", maTinhThanh=");
		sb.append(maTinhThanh);
		sb.append(", maQuanHuyen=");
		sb.append(maQuanHuyen);
		sb.append(", maPhuongXa=");
		sb.append(maPhuongXa);
		sb.append(", thongBaoXuLy=");
		sb.append(thongBaoXuLy);
		sb.append(", toChucQuanLy=");
		sb.append(toChucQuanLy);
		sb.append(", ngayTao=");
		sb.append(ngayTao);
		sb.append(", nguoiTao=");
		sb.append(nguoiTao);
		sb.append(", ghiChu=");
		sb.append(ghiChu);
		sb.append(", nguoiLamThuTucId=");
		sb.append(nguoiLamThuTucId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TthcHoSoThuTuc toEntityModel() {
		TthcHoSoThuTucImpl tthcHoSoThuTucImpl = new TthcHoSoThuTucImpl();

		tthcHoSoThuTucImpl.setId(id);

		if (maSoHoSo == null) {
			tthcHoSoThuTucImpl.setMaSoHoSo(StringPool.BLANK);
		}
		else {
			tthcHoSoThuTucImpl.setMaSoHoSo(maSoHoSo);
		}

		if (maBienNhan == null) {
			tthcHoSoThuTucImpl.setMaBienNhan(StringPool.BLANK);
		}
		else {
			tthcHoSoThuTucImpl.setMaBienNhan(maBienNhan);
		}

		tthcHoSoThuTucImpl.setThuTucHanhChinhId(thuTucHanhChinhId);
		tthcHoSoThuTucImpl.setLoaiChuHoSo(loaiChuHoSo);

		if (maSoChuHoSo == null) {
			tthcHoSoThuTucImpl.setMaSoChuHoSo(StringPool.BLANK);
		}
		else {
			tthcHoSoThuTucImpl.setMaSoChuHoSo(maSoChuHoSo);
		}

		if (tenChuHoSo == null) {
			tthcHoSoThuTucImpl.setTenChuHoSo(StringPool.BLANK);
		}
		else {
			tthcHoSoThuTucImpl.setTenChuHoSo(tenChuHoSo);
		}

		if (diaChiChuHoSo == null) {
			tthcHoSoThuTucImpl.setDiaChiChuHoSo(StringPool.BLANK);
		}
		else {
			tthcHoSoThuTucImpl.setDiaChiChuHoSo(diaChiChuHoSo);
		}

		if (maDonVi == null) {
			tthcHoSoThuTucImpl.setMaDonVi(StringPool.BLANK);
		}
		else {
			tthcHoSoThuTucImpl.setMaDonVi(maDonVi);
		}

		if (nguonGocHoSo == null) {
			tthcHoSoThuTucImpl.setNguonGocHoSo(StringPool.BLANK);
		}
		else {
			tthcHoSoThuTucImpl.setNguonGocHoSo(nguonGocHoSo);
		}

		if (trichYeuNoiDung == null) {
			tthcHoSoThuTucImpl.setTrichYeuNoiDung(StringPool.BLANK);
		}
		else {
			tthcHoSoThuTucImpl.setTrichYeuNoiDung(trichYeuNoiDung);
		}

		if (ngayGuiHoSo == Long.MIN_VALUE) {
			tthcHoSoThuTucImpl.setNgayGuiHoSo(null);
		}
		else {
			tthcHoSoThuTucImpl.setNgayGuiHoSo(new Date(ngayGuiHoSo));
		}

		if (ngayTiepNhan == Long.MIN_VALUE) {
			tthcHoSoThuTucImpl.setNgayTiepNhan(null);
		}
		else {
			tthcHoSoThuTucImpl.setNgayTiepNhan(new Date(ngayTiepNhan));
		}

		if (ngayBoSung == Long.MIN_VALUE) {
			tthcHoSoThuTucImpl.setNgayBoSung(null);
		}
		else {
			tthcHoSoThuTucImpl.setNgayBoSung(new Date(ngayBoSung));
		}

		if (ngayHenTra == Long.MIN_VALUE) {
			tthcHoSoThuTucImpl.setNgayHenTra(null);
		}
		else {
			tthcHoSoThuTucImpl.setNgayHenTra(new Date(ngayHenTra));
		}

		if (ngayTraKetQua == Long.MIN_VALUE) {
			tthcHoSoThuTucImpl.setNgayTraKetQua(null);
		}
		else {
			tthcHoSoThuTucImpl.setNgayTraKetQua(new Date(ngayTraKetQua));
		}

		if (ngayDongHoSo == Long.MIN_VALUE) {
			tthcHoSoThuTucImpl.setNgayDongHoSo(null);
		}
		else {
			tthcHoSoThuTucImpl.setNgayDongHoSo(new Date(ngayDongHoSo));
		}

		if (trangThaiHoSo == null) {
			tthcHoSoThuTucImpl.setTrangThaiHoSo(StringPool.BLANK);
		}
		else {
			tthcHoSoThuTucImpl.setTrangThaiHoSo(trangThaiHoSo);
		}

		tthcHoSoThuTucImpl.setPhanNhomHoSoId(phanNhomHoSoId);

		if (maTinhThanh == null) {
			tthcHoSoThuTucImpl.setMaTinhThanh(StringPool.BLANK);
		}
		else {
			tthcHoSoThuTucImpl.setMaTinhThanh(maTinhThanh);
		}

		if (maQuanHuyen == null) {
			tthcHoSoThuTucImpl.setMaQuanHuyen(StringPool.BLANK);
		}
		else {
			tthcHoSoThuTucImpl.setMaQuanHuyen(maQuanHuyen);
		}

		if (maPhuongXa == null) {
			tthcHoSoThuTucImpl.setMaPhuongXa(StringPool.BLANK);
		}
		else {
			tthcHoSoThuTucImpl.setMaPhuongXa(maPhuongXa);
		}

		if (thongBaoXuLy == null) {
			tthcHoSoThuTucImpl.setThongBaoXuLy(StringPool.BLANK);
		}
		else {
			tthcHoSoThuTucImpl.setThongBaoXuLy(thongBaoXuLy);
		}

		tthcHoSoThuTucImpl.setToChucQuanLy(toChucQuanLy);

		if (ngayTao == Long.MIN_VALUE) {
			tthcHoSoThuTucImpl.setNgayTao(null);
		}
		else {
			tthcHoSoThuTucImpl.setNgayTao(new Date(ngayTao));
		}

		tthcHoSoThuTucImpl.setNguoiTao(nguoiTao);

		if (ghiChu == null) {
			tthcHoSoThuTucImpl.setGhiChu(StringPool.BLANK);
		}
		else {
			tthcHoSoThuTucImpl.setGhiChu(ghiChu);
		}

		tthcHoSoThuTucImpl.setNguoiLamThuTucId(nguoiLamThuTucId);

		tthcHoSoThuTucImpl.resetOriginalValues();

		return tthcHoSoThuTucImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		maSoHoSo = objectInput.readUTF();
		maBienNhan = objectInput.readUTF();
		thuTucHanhChinhId = objectInput.readLong();
		loaiChuHoSo = objectInput.readLong();
		maSoChuHoSo = objectInput.readUTF();
		tenChuHoSo = objectInput.readUTF();
		diaChiChuHoSo = objectInput.readUTF();
		maDonVi = objectInput.readUTF();
		nguonGocHoSo = objectInput.readUTF();
		trichYeuNoiDung = objectInput.readUTF();
		ngayGuiHoSo = objectInput.readLong();
		ngayTiepNhan = objectInput.readLong();
		ngayBoSung = objectInput.readLong();
		ngayHenTra = objectInput.readLong();
		ngayTraKetQua = objectInput.readLong();
		ngayDongHoSo = objectInput.readLong();
		trangThaiHoSo = objectInput.readUTF();
		phanNhomHoSoId = objectInput.readLong();
		maTinhThanh = objectInput.readUTF();
		maQuanHuyen = objectInput.readUTF();
		maPhuongXa = objectInput.readUTF();
		thongBaoXuLy = objectInput.readUTF();
		toChucQuanLy = objectInput.readLong();
		ngayTao = objectInput.readLong();
		nguoiTao = objectInput.readLong();
		ghiChu = objectInput.readUTF();
		nguoiLamThuTucId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (maSoHoSo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maSoHoSo);
		}

		if (maBienNhan == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maBienNhan);
		}

		objectOutput.writeLong(thuTucHanhChinhId);
		objectOutput.writeLong(loaiChuHoSo);

		if (maSoChuHoSo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maSoChuHoSo);
		}

		if (tenChuHoSo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenChuHoSo);
		}

		if (diaChiChuHoSo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(diaChiChuHoSo);
		}

		if (maDonVi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maDonVi);
		}

		if (nguonGocHoSo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nguonGocHoSo);
		}

		if (trichYeuNoiDung == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(trichYeuNoiDung);
		}

		objectOutput.writeLong(ngayGuiHoSo);
		objectOutput.writeLong(ngayTiepNhan);
		objectOutput.writeLong(ngayBoSung);
		objectOutput.writeLong(ngayHenTra);
		objectOutput.writeLong(ngayTraKetQua);
		objectOutput.writeLong(ngayDongHoSo);

		if (trangThaiHoSo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(trangThaiHoSo);
		}

		objectOutput.writeLong(phanNhomHoSoId);

		if (maTinhThanh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maTinhThanh);
		}

		if (maQuanHuyen == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maQuanHuyen);
		}

		if (maPhuongXa == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maPhuongXa);
		}

		if (thongBaoXuLy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(thongBaoXuLy);
		}

		objectOutput.writeLong(toChucQuanLy);
		objectOutput.writeLong(ngayTao);
		objectOutput.writeLong(nguoiTao);

		if (ghiChu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ghiChu);
		}

		objectOutput.writeLong(nguoiLamThuTucId);
	}

	public long id;
	public String maSoHoSo;
	public String maBienNhan;
	public long thuTucHanhChinhId;
	public long loaiChuHoSo;
	public String maSoChuHoSo;
	public String tenChuHoSo;
	public String diaChiChuHoSo;
	public String maDonVi;
	public String nguonGocHoSo;
	public String trichYeuNoiDung;
	public long ngayGuiHoSo;
	public long ngayTiepNhan;
	public long ngayBoSung;
	public long ngayHenTra;
	public long ngayTraKetQua;
	public long ngayDongHoSo;
	public String trangThaiHoSo;
	public long phanNhomHoSoId;
	public String maTinhThanh;
	public String maQuanHuyen;
	public String maPhuongXa;
	public String thongBaoXuLy;
	public long toChucQuanLy;
	public long ngayTao;
	public long nguoiTao;
	public String ghiChu;
	public long nguoiLamThuTucId;
}