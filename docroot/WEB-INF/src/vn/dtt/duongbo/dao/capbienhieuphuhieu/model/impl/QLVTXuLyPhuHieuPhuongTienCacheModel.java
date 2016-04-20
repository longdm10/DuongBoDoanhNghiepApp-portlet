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

package vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTien;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QLVTXuLyPhuHieuPhuongTien in entity cache.
 *
 * @author binhta
 * @see QLVTXuLyPhuHieuPhuongTien
 * @generated
 */
public class QLVTXuLyPhuHieuPhuongTienCacheModel implements CacheModel<QLVTXuLyPhuHieuPhuongTien>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(47);

		sb.append("{id=");
		sb.append(id);
		sb.append(", capPhuHieuID=");
		sb.append(capPhuHieuID);
		sb.append(", nhanHieu=");
		sb.append(nhanHieu);
		sb.append(", bienSo=");
		sb.append(bienSo);
		sb.append(", trongTai=");
		sb.append(trongTai);
		sb.append(", soChoNgoi=");
		sb.append(soChoNgoi);
		sb.append(", noiSanXuat=");
		sb.append(noiSanXuat);
		sb.append(", namSanXuat=");
		sb.append(namSanXuat);
		sb.append(", maTuyenCoDinh=");
		sb.append(maTuyenCoDinh);
		sb.append(", loaiTuyen=");
		sb.append(loaiTuyen);
		sb.append(", hinhThucSoHuuXe=");
		sb.append(hinhThucSoHuuXe);
		sb.append(", linhVucKinhDoanhXeDuLich=");
		sb.append(linhVucKinhDoanhXeDuLich);
		sb.append(", nienHanSuDungGiayDangKiem=");
		sb.append(nienHanSuDungGiayDangKiem);
		sb.append(", nienHanSuDungND86=");
		sb.append(nienHanSuDungND86);
		sb.append(", doanhNghiepSoHuuThue=");
		sb.append(doanhNghiepSoHuuThue);
		sb.append(", thoiHanThue=");
		sb.append(thoiHanThue);
		sb.append(", hopDongSauCung=");
		sb.append(hopDongSauCung);
		sb.append(", ketQuaXuLy=");
		sb.append(ketQuaXuLy);
		sb.append(", soPhuHieuDuocCap=");
		sb.append(soPhuHieuDuocCap);
		sb.append(", thoiHanDuocCapPhep=");
		sb.append(thoiHanDuocCapPhep);
		sb.append(", loaiPhuHieuXinCap=");
		sb.append(loaiPhuHieuXinCap);
		sb.append(", lyDoKhongDat=");
		sb.append(lyDoKhongDat);
		sb.append(", coGiaTriDen=");
		sb.append(coGiaTriDen);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QLVTXuLyPhuHieuPhuongTien toEntityModel() {
		QLVTXuLyPhuHieuPhuongTienImpl qlvtXuLyPhuHieuPhuongTienImpl = new QLVTXuLyPhuHieuPhuongTienImpl();

		qlvtXuLyPhuHieuPhuongTienImpl.setId(id);
		qlvtXuLyPhuHieuPhuongTienImpl.setCapPhuHieuID(capPhuHieuID);

		if (nhanHieu == null) {
			qlvtXuLyPhuHieuPhuongTienImpl.setNhanHieu(StringPool.BLANK);
		}
		else {
			qlvtXuLyPhuHieuPhuongTienImpl.setNhanHieu(nhanHieu);
		}

		if (bienSo == null) {
			qlvtXuLyPhuHieuPhuongTienImpl.setBienSo(StringPool.BLANK);
		}
		else {
			qlvtXuLyPhuHieuPhuongTienImpl.setBienSo(bienSo);
		}

		qlvtXuLyPhuHieuPhuongTienImpl.setTrongTai(trongTai);
		qlvtXuLyPhuHieuPhuongTienImpl.setSoChoNgoi(soChoNgoi);

		if (noiSanXuat == null) {
			qlvtXuLyPhuHieuPhuongTienImpl.setNoiSanXuat(StringPool.BLANK);
		}
		else {
			qlvtXuLyPhuHieuPhuongTienImpl.setNoiSanXuat(noiSanXuat);
		}

		qlvtXuLyPhuHieuPhuongTienImpl.setNamSanXuat(namSanXuat);

		if (maTuyenCoDinh == null) {
			qlvtXuLyPhuHieuPhuongTienImpl.setMaTuyenCoDinh(StringPool.BLANK);
		}
		else {
			qlvtXuLyPhuHieuPhuongTienImpl.setMaTuyenCoDinh(maTuyenCoDinh);
		}

		if (loaiTuyen == null) {
			qlvtXuLyPhuHieuPhuongTienImpl.setLoaiTuyen(StringPool.BLANK);
		}
		else {
			qlvtXuLyPhuHieuPhuongTienImpl.setLoaiTuyen(loaiTuyen);
		}

		if (hinhThucSoHuuXe == null) {
			qlvtXuLyPhuHieuPhuongTienImpl.setHinhThucSoHuuXe(StringPool.BLANK);
		}
		else {
			qlvtXuLyPhuHieuPhuongTienImpl.setHinhThucSoHuuXe(hinhThucSoHuuXe);
		}

		if (linhVucKinhDoanhXeDuLich == null) {
			qlvtXuLyPhuHieuPhuongTienImpl.setLinhVucKinhDoanhXeDuLich(StringPool.BLANK);
		}
		else {
			qlvtXuLyPhuHieuPhuongTienImpl.setLinhVucKinhDoanhXeDuLich(linhVucKinhDoanhXeDuLich);
		}

		qlvtXuLyPhuHieuPhuongTienImpl.setNienHanSuDungGiayDangKiem(nienHanSuDungGiayDangKiem);
		qlvtXuLyPhuHieuPhuongTienImpl.setNienHanSuDungND86(nienHanSuDungND86);

		if (doanhNghiepSoHuuThue == null) {
			qlvtXuLyPhuHieuPhuongTienImpl.setDoanhNghiepSoHuuThue(StringPool.BLANK);
		}
		else {
			qlvtXuLyPhuHieuPhuongTienImpl.setDoanhNghiepSoHuuThue(doanhNghiepSoHuuThue);
		}

		if (thoiHanThue == Long.MIN_VALUE) {
			qlvtXuLyPhuHieuPhuongTienImpl.setThoiHanThue(null);
		}
		else {
			qlvtXuLyPhuHieuPhuongTienImpl.setThoiHanThue(new Date(thoiHanThue));
		}

		qlvtXuLyPhuHieuPhuongTienImpl.setHopDongSauCung(hopDongSauCung);

		if (ketQuaXuLy == null) {
			qlvtXuLyPhuHieuPhuongTienImpl.setKetQuaXuLy(StringPool.BLANK);
		}
		else {
			qlvtXuLyPhuHieuPhuongTienImpl.setKetQuaXuLy(ketQuaXuLy);
		}

		if (soPhuHieuDuocCap == null) {
			qlvtXuLyPhuHieuPhuongTienImpl.setSoPhuHieuDuocCap(StringPool.BLANK);
		}
		else {
			qlvtXuLyPhuHieuPhuongTienImpl.setSoPhuHieuDuocCap(soPhuHieuDuocCap);
		}

		if (thoiHanDuocCapPhep == Long.MIN_VALUE) {
			qlvtXuLyPhuHieuPhuongTienImpl.setThoiHanDuocCapPhep(null);
		}
		else {
			qlvtXuLyPhuHieuPhuongTienImpl.setThoiHanDuocCapPhep(new Date(
					thoiHanDuocCapPhep));
		}

		if (loaiPhuHieuXinCap == null) {
			qlvtXuLyPhuHieuPhuongTienImpl.setLoaiPhuHieuXinCap(StringPool.BLANK);
		}
		else {
			qlvtXuLyPhuHieuPhuongTienImpl.setLoaiPhuHieuXinCap(loaiPhuHieuXinCap);
		}

		if (lyDoKhongDat == null) {
			qlvtXuLyPhuHieuPhuongTienImpl.setLyDoKhongDat(StringPool.BLANK);
		}
		else {
			qlvtXuLyPhuHieuPhuongTienImpl.setLyDoKhongDat(lyDoKhongDat);
		}

		if (coGiaTriDen == Long.MIN_VALUE) {
			qlvtXuLyPhuHieuPhuongTienImpl.setCoGiaTriDen(null);
		}
		else {
			qlvtXuLyPhuHieuPhuongTienImpl.setCoGiaTriDen(new Date(coGiaTriDen));
		}

		qlvtXuLyPhuHieuPhuongTienImpl.resetOriginalValues();

		return qlvtXuLyPhuHieuPhuongTienImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		capPhuHieuID = objectInput.readInt();
		nhanHieu = objectInput.readUTF();
		bienSo = objectInput.readUTF();
		trongTai = objectInput.readInt();
		soChoNgoi = objectInput.readInt();
		noiSanXuat = objectInput.readUTF();
		namSanXuat = objectInput.readInt();
		maTuyenCoDinh = objectInput.readUTF();
		loaiTuyen = objectInput.readUTF();
		hinhThucSoHuuXe = objectInput.readUTF();
		linhVucKinhDoanhXeDuLich = objectInput.readUTF();
		nienHanSuDungGiayDangKiem = objectInput.readInt();
		nienHanSuDungND86 = objectInput.readInt();
		doanhNghiepSoHuuThue = objectInput.readUTF();
		thoiHanThue = objectInput.readLong();
		hopDongSauCung = objectInput.readInt();
		ketQuaXuLy = objectInput.readUTF();
		soPhuHieuDuocCap = objectInput.readUTF();
		thoiHanDuocCapPhep = objectInput.readLong();
		loaiPhuHieuXinCap = objectInput.readUTF();
		lyDoKhongDat = objectInput.readUTF();
		coGiaTriDen = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(id);
		objectOutput.writeInt(capPhuHieuID);

		if (nhanHieu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nhanHieu);
		}

		if (bienSo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(bienSo);
		}

		objectOutput.writeInt(trongTai);
		objectOutput.writeInt(soChoNgoi);

		if (noiSanXuat == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(noiSanXuat);
		}

		objectOutput.writeInt(namSanXuat);

		if (maTuyenCoDinh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maTuyenCoDinh);
		}

		if (loaiTuyen == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(loaiTuyen);
		}

		if (hinhThucSoHuuXe == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(hinhThucSoHuuXe);
		}

		if (linhVucKinhDoanhXeDuLich == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(linhVucKinhDoanhXeDuLich);
		}

		objectOutput.writeInt(nienHanSuDungGiayDangKiem);
		objectOutput.writeInt(nienHanSuDungND86);

		if (doanhNghiepSoHuuThue == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(doanhNghiepSoHuuThue);
		}

		objectOutput.writeLong(thoiHanThue);
		objectOutput.writeInt(hopDongSauCung);

		if (ketQuaXuLy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ketQuaXuLy);
		}

		if (soPhuHieuDuocCap == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soPhuHieuDuocCap);
		}

		objectOutput.writeLong(thoiHanDuocCapPhep);

		if (loaiPhuHieuXinCap == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(loaiPhuHieuXinCap);
		}

		if (lyDoKhongDat == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lyDoKhongDat);
		}

		objectOutput.writeLong(coGiaTriDen);
	}

	public int id;
	public int capPhuHieuID;
	public String nhanHieu;
	public String bienSo;
	public int trongTai;
	public int soChoNgoi;
	public String noiSanXuat;
	public int namSanXuat;
	public String maTuyenCoDinh;
	public String loaiTuyen;
	public String hinhThucSoHuuXe;
	public String linhVucKinhDoanhXeDuLich;
	public int nienHanSuDungGiayDangKiem;
	public int nienHanSuDungND86;
	public String doanhNghiepSoHuuThue;
	public long thoiHanThue;
	public int hopDongSauCung;
	public String ketQuaXuLy;
	public String soPhuHieuDuocCap;
	public long thoiHanDuocCapPhep;
	public String loaiPhuHieuXinCap;
	public String lyDoKhongDat;
	public long coGiaTriDen;
}