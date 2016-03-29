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

package vn.dtt.duongbo.dao.lienvan.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVan;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QlvtXuLyGpLienVan in entity cache.
 *
 * @author NhanNc
 * @see QlvtXuLyGpLienVan
 * @generated
 */
public class QlvtXuLyGpLienVanCacheModel implements CacheModel<QlvtXuLyGpLienVan>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(51);

		sb.append("{id=");
		sb.append(id);
		sb.append(", thongTinXuLyId=");
		sb.append(thongTinXuLyId);
		sb.append(", loaiCapPhep=");
		sb.append(loaiCapPhep);
		sb.append(", soGpvt=");
		sb.append(soGpvt);
		sb.append(", ngayCapGpvt=");
		sb.append(ngayCapGpvt);
		sb.append(", soCongVanChapThuanTcd=");
		sb.append(soCongVanChapThuanTcd);
		sb.append(", ngayCongVanChapThuanTCD=");
		sb.append(ngayCongVanChapThuanTCD);
		sb.append(", tuyenTu=");
		sb.append(tuyenTu);
		sb.append(", tuyenDi=");
		sb.append(tuyenDi);
		sb.append(", cuLy=");
		sb.append(cuLy);
		sb.append(", maBenDi=");
		sb.append(maBenDi);
		sb.append(", maBenDen=");
		sb.append(maBenDen);
		sb.append(", maTinhDi=");
		sb.append(maTinhDi);
		sb.append(", maTinhDen=");
		sb.append(maTinhDen);
		sb.append(", hanhTrinh=");
		sb.append(hanhTrinh);
		sb.append(", mucPhi=");
		sb.append(mucPhi);
		sb.append(", mucDichChuyenDi=");
		sb.append(mucDichChuyenDi);
		sb.append(", loaiGiayPhepLienVan=");
		sb.append(loaiGiayPhepLienVan);
		sb.append(", soGiayPhepLienVan=");
		sb.append(soGiayPhepLienVan);
		sb.append(", ngayCapGiayPhepLienVan=");
		sb.append(ngayCapGiayPhepLienVan);
		sb.append(", ngayHetHanGiayPhepLienVan=");
		sb.append(ngayHetHanGiayPhepLienVan);
		sb.append(", coQuanCapPhepLienVan=");
		sb.append(coQuanCapPhepLienVan);
		sb.append(", ketQuaXuLy=");
		sb.append(ketQuaXuLy);
		sb.append(", lyDoKhongDat=");
		sb.append(lyDoKhongDat);
		sb.append(", ngayCapGiayPhepLienVan_LanDau=");
		sb.append(ngayCapGiayPhepLienVan_LanDau);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QlvtXuLyGpLienVan toEntityModel() {
		QlvtXuLyGpLienVanImpl qlvtXuLyGpLienVanImpl = new QlvtXuLyGpLienVanImpl();

		qlvtXuLyGpLienVanImpl.setId(id);
		qlvtXuLyGpLienVanImpl.setThongTinXuLyId(thongTinXuLyId);

		if (loaiCapPhep == null) {
			qlvtXuLyGpLienVanImpl.setLoaiCapPhep(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpLienVanImpl.setLoaiCapPhep(loaiCapPhep);
		}

		if (soGpvt == null) {
			qlvtXuLyGpLienVanImpl.setSoGpvt(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpLienVanImpl.setSoGpvt(soGpvt);
		}

		if (ngayCapGpvt == Long.MIN_VALUE) {
			qlvtXuLyGpLienVanImpl.setNgayCapGpvt(null);
		}
		else {
			qlvtXuLyGpLienVanImpl.setNgayCapGpvt(new Date(ngayCapGpvt));
		}

		if (soCongVanChapThuanTcd == null) {
			qlvtXuLyGpLienVanImpl.setSoCongVanChapThuanTcd(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpLienVanImpl.setSoCongVanChapThuanTcd(soCongVanChapThuanTcd);
		}

		if (ngayCongVanChapThuanTCD == Long.MIN_VALUE) {
			qlvtXuLyGpLienVanImpl.setNgayCongVanChapThuanTCD(null);
		}
		else {
			qlvtXuLyGpLienVanImpl.setNgayCongVanChapThuanTCD(new Date(
					ngayCongVanChapThuanTCD));
		}

		if (tuyenTu == null) {
			qlvtXuLyGpLienVanImpl.setTuyenTu(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpLienVanImpl.setTuyenTu(tuyenTu);
		}

		if (tuyenDi == null) {
			qlvtXuLyGpLienVanImpl.setTuyenDi(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpLienVanImpl.setTuyenDi(tuyenDi);
		}

		if (cuLy == null) {
			qlvtXuLyGpLienVanImpl.setCuLy(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpLienVanImpl.setCuLy(cuLy);
		}

		if (maBenDi == null) {
			qlvtXuLyGpLienVanImpl.setMaBenDi(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpLienVanImpl.setMaBenDi(maBenDi);
		}

		if (maBenDen == null) {
			qlvtXuLyGpLienVanImpl.setMaBenDen(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpLienVanImpl.setMaBenDen(maBenDen);
		}

		if (maTinhDi == null) {
			qlvtXuLyGpLienVanImpl.setMaTinhDi(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpLienVanImpl.setMaTinhDi(maTinhDi);
		}

		if (maTinhDen == null) {
			qlvtXuLyGpLienVanImpl.setMaTinhDen(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpLienVanImpl.setMaTinhDen(maTinhDen);
		}

		if (hanhTrinh == null) {
			qlvtXuLyGpLienVanImpl.setHanhTrinh(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpLienVanImpl.setHanhTrinh(hanhTrinh);
		}

		if (mucPhi == null) {
			qlvtXuLyGpLienVanImpl.setMucPhi(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpLienVanImpl.setMucPhi(mucPhi);
		}

		if (mucDichChuyenDi == null) {
			qlvtXuLyGpLienVanImpl.setMucDichChuyenDi(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpLienVanImpl.setMucDichChuyenDi(mucDichChuyenDi);
		}

		if (loaiGiayPhepLienVan == null) {
			qlvtXuLyGpLienVanImpl.setLoaiGiayPhepLienVan(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpLienVanImpl.setLoaiGiayPhepLienVan(loaiGiayPhepLienVan);
		}

		if (soGiayPhepLienVan == null) {
			qlvtXuLyGpLienVanImpl.setSoGiayPhepLienVan(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpLienVanImpl.setSoGiayPhepLienVan(soGiayPhepLienVan);
		}

		if (ngayCapGiayPhepLienVan == Long.MIN_VALUE) {
			qlvtXuLyGpLienVanImpl.setNgayCapGiayPhepLienVan(null);
		}
		else {
			qlvtXuLyGpLienVanImpl.setNgayCapGiayPhepLienVan(new Date(
					ngayCapGiayPhepLienVan));
		}

		if (ngayHetHanGiayPhepLienVan == Long.MIN_VALUE) {
			qlvtXuLyGpLienVanImpl.setNgayHetHanGiayPhepLienVan(null);
		}
		else {
			qlvtXuLyGpLienVanImpl.setNgayHetHanGiayPhepLienVan(new Date(
					ngayHetHanGiayPhepLienVan));
		}

		if (coQuanCapPhepLienVan == null) {
			qlvtXuLyGpLienVanImpl.setCoQuanCapPhepLienVan(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpLienVanImpl.setCoQuanCapPhepLienVan(coQuanCapPhepLienVan);
		}

		if (ketQuaXuLy == null) {
			qlvtXuLyGpLienVanImpl.setKetQuaXuLy(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpLienVanImpl.setKetQuaXuLy(ketQuaXuLy);
		}

		if (lyDoKhongDat == null) {
			qlvtXuLyGpLienVanImpl.setLyDoKhongDat(StringPool.BLANK);
		}
		else {
			qlvtXuLyGpLienVanImpl.setLyDoKhongDat(lyDoKhongDat);
		}

		if (ngayCapGiayPhepLienVan_LanDau == Long.MIN_VALUE) {
			qlvtXuLyGpLienVanImpl.setNgayCapGiayPhepLienVan_LanDau(null);
		}
		else {
			qlvtXuLyGpLienVanImpl.setNgayCapGiayPhepLienVan_LanDau(new Date(
					ngayCapGiayPhepLienVan_LanDau));
		}

		qlvtXuLyGpLienVanImpl.resetOriginalValues();

		return qlvtXuLyGpLienVanImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		thongTinXuLyId = objectInput.readLong();
		loaiCapPhep = objectInput.readUTF();
		soGpvt = objectInput.readUTF();
		ngayCapGpvt = objectInput.readLong();
		soCongVanChapThuanTcd = objectInput.readUTF();
		ngayCongVanChapThuanTCD = objectInput.readLong();
		tuyenTu = objectInput.readUTF();
		tuyenDi = objectInput.readUTF();
		cuLy = objectInput.readUTF();
		maBenDi = objectInput.readUTF();
		maBenDen = objectInput.readUTF();
		maTinhDi = objectInput.readUTF();
		maTinhDen = objectInput.readUTF();
		hanhTrinh = objectInput.readUTF();
		mucPhi = objectInput.readUTF();
		mucDichChuyenDi = objectInput.readUTF();
		loaiGiayPhepLienVan = objectInput.readUTF();
		soGiayPhepLienVan = objectInput.readUTF();
		ngayCapGiayPhepLienVan = objectInput.readLong();
		ngayHetHanGiayPhepLienVan = objectInput.readLong();
		coQuanCapPhepLienVan = objectInput.readUTF();
		ketQuaXuLy = objectInput.readUTF();
		lyDoKhongDat = objectInput.readUTF();
		ngayCapGiayPhepLienVan_LanDau = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(thongTinXuLyId);

		if (loaiCapPhep == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(loaiCapPhep);
		}

		if (soGpvt == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soGpvt);
		}

		objectOutput.writeLong(ngayCapGpvt);

		if (soCongVanChapThuanTcd == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soCongVanChapThuanTcd);
		}

		objectOutput.writeLong(ngayCongVanChapThuanTCD);

		if (tuyenTu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tuyenTu);
		}

		if (tuyenDi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tuyenDi);
		}

		if (cuLy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cuLy);
		}

		if (maBenDi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maBenDi);
		}

		if (maBenDen == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maBenDen);
		}

		if (maTinhDi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maTinhDi);
		}

		if (maTinhDen == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maTinhDen);
		}

		if (hanhTrinh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(hanhTrinh);
		}

		if (mucPhi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mucPhi);
		}

		if (mucDichChuyenDi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mucDichChuyenDi);
		}

		if (loaiGiayPhepLienVan == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(loaiGiayPhepLienVan);
		}

		if (soGiayPhepLienVan == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soGiayPhepLienVan);
		}

		objectOutput.writeLong(ngayCapGiayPhepLienVan);
		objectOutput.writeLong(ngayHetHanGiayPhepLienVan);

		if (coQuanCapPhepLienVan == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(coQuanCapPhepLienVan);
		}

		if (ketQuaXuLy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ketQuaXuLy);
		}

		if (lyDoKhongDat == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lyDoKhongDat);
		}

		objectOutput.writeLong(ngayCapGiayPhepLienVan_LanDau);
	}

	public long id;
	public long thongTinXuLyId;
	public String loaiCapPhep;
	public String soGpvt;
	public long ngayCapGpvt;
	public String soCongVanChapThuanTcd;
	public long ngayCongVanChapThuanTCD;
	public String tuyenTu;
	public String tuyenDi;
	public String cuLy;
	public String maBenDi;
	public String maBenDen;
	public String maTinhDi;
	public String maTinhDen;
	public String hanhTrinh;
	public String mucPhi;
	public String mucDichChuyenDi;
	public String loaiGiayPhepLienVan;
	public String soGiayPhepLienVan;
	public long ngayCapGiayPhepLienVan;
	public long ngayHetHanGiayPhepLienVan;
	public String coQuanCapPhepLienVan;
	public String ketQuaXuLy;
	public String lyDoKhongDat;
	public long ngayCapGiayPhepLienVan_LanDau;
}