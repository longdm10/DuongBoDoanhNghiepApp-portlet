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

import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QLVTXuLyBienHieuPhuongTien in entity cache.
 *
 * @author binhta
 * @see QLVTXuLyBienHieuPhuongTien
 * @generated
 */
public class QLVTXuLyBienHieuPhuongTienCacheModel implements CacheModel<QLVTXuLyBienHieuPhuongTien>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(49);

		sb.append("{id=");
		sb.append(id);
		sb.append(", capBienHieuID=");
		sb.append(capBienHieuID);
		sb.append(", nhanHieu=");
		sb.append(nhanHieu);
		sb.append(", bienSo=");
		sb.append(bienSo);
		sb.append(", soKhung=");
		sb.append(soKhung);
		sb.append(", soMay=");
		sb.append(soMay);
		sb.append(", namSx=");
		sb.append(namSx);
		sb.append(", mauSon=");
		sb.append(mauSon);
		sb.append(", trongTai=");
		sb.append(trongTai);
		sb.append(", soChoNgoi=");
		sb.append(soChoNgoi);
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
		sb.append(", lyDoKhongDat=");
		sb.append(lyDoKhongDat);
		sb.append(", soA=");
		sb.append(soA);
		sb.append(", soB=");
		sb.append(soB);
		sb.append(", coGiaTriDen=");
		sb.append(coGiaTriDen);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QLVTXuLyBienHieuPhuongTien toEntityModel() {
		QLVTXuLyBienHieuPhuongTienImpl qlvtXuLyBienHieuPhuongTienImpl = new QLVTXuLyBienHieuPhuongTienImpl();

		qlvtXuLyBienHieuPhuongTienImpl.setId(id);
		qlvtXuLyBienHieuPhuongTienImpl.setCapBienHieuID(capBienHieuID);

		if (nhanHieu == null) {
			qlvtXuLyBienHieuPhuongTienImpl.setNhanHieu(StringPool.BLANK);
		}
		else {
			qlvtXuLyBienHieuPhuongTienImpl.setNhanHieu(nhanHieu);
		}

		if (bienSo == null) {
			qlvtXuLyBienHieuPhuongTienImpl.setBienSo(StringPool.BLANK);
		}
		else {
			qlvtXuLyBienHieuPhuongTienImpl.setBienSo(bienSo);
		}

		if (soKhung == null) {
			qlvtXuLyBienHieuPhuongTienImpl.setSoKhung(StringPool.BLANK);
		}
		else {
			qlvtXuLyBienHieuPhuongTienImpl.setSoKhung(soKhung);
		}

		if (soMay == null) {
			qlvtXuLyBienHieuPhuongTienImpl.setSoMay(StringPool.BLANK);
		}
		else {
			qlvtXuLyBienHieuPhuongTienImpl.setSoMay(soMay);
		}

		qlvtXuLyBienHieuPhuongTienImpl.setNamSx(namSx);

		if (mauSon == null) {
			qlvtXuLyBienHieuPhuongTienImpl.setMauSon(StringPool.BLANK);
		}
		else {
			qlvtXuLyBienHieuPhuongTienImpl.setMauSon(mauSon);
		}

		qlvtXuLyBienHieuPhuongTienImpl.setTrongTai(trongTai);
		qlvtXuLyBienHieuPhuongTienImpl.setSoChoNgoi(soChoNgoi);

		if (hinhThucSoHuuXe == null) {
			qlvtXuLyBienHieuPhuongTienImpl.setHinhThucSoHuuXe(StringPool.BLANK);
		}
		else {
			qlvtXuLyBienHieuPhuongTienImpl.setHinhThucSoHuuXe(hinhThucSoHuuXe);
		}

		if (linhVucKinhDoanhXeDuLich == null) {
			qlvtXuLyBienHieuPhuongTienImpl.setLinhVucKinhDoanhXeDuLich(StringPool.BLANK);
		}
		else {
			qlvtXuLyBienHieuPhuongTienImpl.setLinhVucKinhDoanhXeDuLich(linhVucKinhDoanhXeDuLich);
		}

		qlvtXuLyBienHieuPhuongTienImpl.setNienHanSuDungGiayDangKiem(nienHanSuDungGiayDangKiem);
		qlvtXuLyBienHieuPhuongTienImpl.setNienHanSuDungND86(nienHanSuDungND86);

		if (doanhNghiepSoHuuThue == null) {
			qlvtXuLyBienHieuPhuongTienImpl.setDoanhNghiepSoHuuThue(StringPool.BLANK);
		}
		else {
			qlvtXuLyBienHieuPhuongTienImpl.setDoanhNghiepSoHuuThue(doanhNghiepSoHuuThue);
		}

		if (thoiHanThue == Long.MIN_VALUE) {
			qlvtXuLyBienHieuPhuongTienImpl.setThoiHanThue(null);
		}
		else {
			qlvtXuLyBienHieuPhuongTienImpl.setThoiHanThue(new Date(thoiHanThue));
		}

		qlvtXuLyBienHieuPhuongTienImpl.setHopDongSauCung(hopDongSauCung);

		if (ketQuaXuLy == null) {
			qlvtXuLyBienHieuPhuongTienImpl.setKetQuaXuLy(StringPool.BLANK);
		}
		else {
			qlvtXuLyBienHieuPhuongTienImpl.setKetQuaXuLy(ketQuaXuLy);
		}

		if (soPhuHieuDuocCap == null) {
			qlvtXuLyBienHieuPhuongTienImpl.setSoPhuHieuDuocCap(StringPool.BLANK);
		}
		else {
			qlvtXuLyBienHieuPhuongTienImpl.setSoPhuHieuDuocCap(soPhuHieuDuocCap);
		}

		if (thoiHanDuocCapPhep == Long.MIN_VALUE) {
			qlvtXuLyBienHieuPhuongTienImpl.setThoiHanDuocCapPhep(null);
		}
		else {
			qlvtXuLyBienHieuPhuongTienImpl.setThoiHanDuocCapPhep(new Date(
					thoiHanDuocCapPhep));
		}

		if (lyDoKhongDat == null) {
			qlvtXuLyBienHieuPhuongTienImpl.setLyDoKhongDat(StringPool.BLANK);
		}
		else {
			qlvtXuLyBienHieuPhuongTienImpl.setLyDoKhongDat(lyDoKhongDat);
		}

		if (soA == null) {
			qlvtXuLyBienHieuPhuongTienImpl.setSoA(StringPool.BLANK);
		}
		else {
			qlvtXuLyBienHieuPhuongTienImpl.setSoA(soA);
		}

		if (soB == null) {
			qlvtXuLyBienHieuPhuongTienImpl.setSoB(StringPool.BLANK);
		}
		else {
			qlvtXuLyBienHieuPhuongTienImpl.setSoB(soB);
		}

		if (coGiaTriDen == Long.MIN_VALUE) {
			qlvtXuLyBienHieuPhuongTienImpl.setCoGiaTriDen(null);
		}
		else {
			qlvtXuLyBienHieuPhuongTienImpl.setCoGiaTriDen(new Date(coGiaTriDen));
		}

		qlvtXuLyBienHieuPhuongTienImpl.resetOriginalValues();

		return qlvtXuLyBienHieuPhuongTienImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		capBienHieuID = objectInput.readInt();
		nhanHieu = objectInput.readUTF();
		bienSo = objectInput.readUTF();
		soKhung = objectInput.readUTF();
		soMay = objectInput.readUTF();
		namSx = objectInput.readInt();
		mauSon = objectInput.readUTF();
		trongTai = objectInput.readLong();
		soChoNgoi = objectInput.readInt();
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
		lyDoKhongDat = objectInput.readUTF();
		soA = objectInput.readUTF();
		soB = objectInput.readUTF();
		coGiaTriDen = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(id);
		objectOutput.writeInt(capBienHieuID);

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

		if (soKhung == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soKhung);
		}

		if (soMay == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soMay);
		}

		objectOutput.writeInt(namSx);

		if (mauSon == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mauSon);
		}

		objectOutput.writeLong(trongTai);
		objectOutput.writeInt(soChoNgoi);

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

		if (lyDoKhongDat == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lyDoKhongDat);
		}

		if (soA == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soA);
		}

		if (soB == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soB);
		}

		objectOutput.writeLong(coGiaTriDen);
	}

	public int id;
	public int capBienHieuID;
	public String nhanHieu;
	public String bienSo;
	public String soKhung;
	public String soMay;
	public int namSx;
	public String mauSon;
	public long trongTai;
	public int soChoNgoi;
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
	public String lyDoKhongDat;
	public String soA;
	public String soB;
	public long coGiaTriDen;
}