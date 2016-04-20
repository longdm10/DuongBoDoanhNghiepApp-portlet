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

import vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpLienVan;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QlvtCapPhepGpLienVan in entity cache.
 *
 * @author NhanNc
 * @see QlvtCapPhepGpLienVan
 * @generated
 */
public class QlvtCapPhepGpLienVanCacheModel implements CacheModel<QlvtCapPhepGpLienVan>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(45);

		sb.append("{id=");
		sb.append(id);
		sb.append(", gpkdvtVietLaoId=");
		sb.append(gpkdvtVietLaoId);
		sb.append(", loaiCapPhep=");
		sb.append(loaiCapPhep);
		sb.append(", loaiGiayPhepLienVan=");
		sb.append(loaiGiayPhepLienVan);
		sb.append(", soGiayPhepLienVan=");
		sb.append(soGiayPhepLienVan);
		sb.append(", ngayCapGplv=");
		sb.append(ngayCapGplv);
		sb.append(", ngayHetHanGplv=");
		sb.append(ngayHetHanGplv);
		sb.append(", coQuanCpLienVan=");
		sb.append(coQuanCpLienVan);
		sb.append(", soCongVanChapThuanTCD=");
		sb.append(soCongVanChapThuanTCD);
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
		sb.append(", fileId=");
		sb.append(fileId);
		sb.append(", trangThai=");
		sb.append(trangThai);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QlvtCapPhepGpLienVan toEntityModel() {
		QlvtCapPhepGpLienVanImpl qlvtCapPhepGpLienVanImpl = new QlvtCapPhepGpLienVanImpl();

		qlvtCapPhepGpLienVanImpl.setId(id);
		qlvtCapPhepGpLienVanImpl.setGpkdvtVietLaoId(gpkdvtVietLaoId);

		if (loaiCapPhep == null) {
			qlvtCapPhepGpLienVanImpl.setLoaiCapPhep(StringPool.BLANK);
		}
		else {
			qlvtCapPhepGpLienVanImpl.setLoaiCapPhep(loaiCapPhep);
		}

		if (loaiGiayPhepLienVan == null) {
			qlvtCapPhepGpLienVanImpl.setLoaiGiayPhepLienVan(StringPool.BLANK);
		}
		else {
			qlvtCapPhepGpLienVanImpl.setLoaiGiayPhepLienVan(loaiGiayPhepLienVan);
		}

		if (soGiayPhepLienVan == null) {
			qlvtCapPhepGpLienVanImpl.setSoGiayPhepLienVan(StringPool.BLANK);
		}
		else {
			qlvtCapPhepGpLienVanImpl.setSoGiayPhepLienVan(soGiayPhepLienVan);
		}

		if (ngayCapGplv == Long.MIN_VALUE) {
			qlvtCapPhepGpLienVanImpl.setNgayCapGplv(null);
		}
		else {
			qlvtCapPhepGpLienVanImpl.setNgayCapGplv(new Date(ngayCapGplv));
		}

		if (ngayHetHanGplv == Long.MIN_VALUE) {
			qlvtCapPhepGpLienVanImpl.setNgayHetHanGplv(null);
		}
		else {
			qlvtCapPhepGpLienVanImpl.setNgayHetHanGplv(new Date(ngayHetHanGplv));
		}

		if (coQuanCpLienVan == null) {
			qlvtCapPhepGpLienVanImpl.setCoQuanCpLienVan(StringPool.BLANK);
		}
		else {
			qlvtCapPhepGpLienVanImpl.setCoQuanCpLienVan(coQuanCpLienVan);
		}

		if (soCongVanChapThuanTCD == null) {
			qlvtCapPhepGpLienVanImpl.setSoCongVanChapThuanTCD(StringPool.BLANK);
		}
		else {
			qlvtCapPhepGpLienVanImpl.setSoCongVanChapThuanTCD(soCongVanChapThuanTCD);
		}

		if (ngayCongVanChapThuanTCD == Long.MIN_VALUE) {
			qlvtCapPhepGpLienVanImpl.setNgayCongVanChapThuanTCD(null);
		}
		else {
			qlvtCapPhepGpLienVanImpl.setNgayCongVanChapThuanTCD(new Date(
					ngayCongVanChapThuanTCD));
		}

		if (tuyenTu == null) {
			qlvtCapPhepGpLienVanImpl.setTuyenTu(StringPool.BLANK);
		}
		else {
			qlvtCapPhepGpLienVanImpl.setTuyenTu(tuyenTu);
		}

		if (tuyenDi == null) {
			qlvtCapPhepGpLienVanImpl.setTuyenDi(StringPool.BLANK);
		}
		else {
			qlvtCapPhepGpLienVanImpl.setTuyenDi(tuyenDi);
		}

		if (cuLy == null) {
			qlvtCapPhepGpLienVanImpl.setCuLy(StringPool.BLANK);
		}
		else {
			qlvtCapPhepGpLienVanImpl.setCuLy(cuLy);
		}

		if (maBenDi == null) {
			qlvtCapPhepGpLienVanImpl.setMaBenDi(StringPool.BLANK);
		}
		else {
			qlvtCapPhepGpLienVanImpl.setMaBenDi(maBenDi);
		}

		if (maBenDen == null) {
			qlvtCapPhepGpLienVanImpl.setMaBenDen(StringPool.BLANK);
		}
		else {
			qlvtCapPhepGpLienVanImpl.setMaBenDen(maBenDen);
		}

		if (maTinhDi == null) {
			qlvtCapPhepGpLienVanImpl.setMaTinhDi(StringPool.BLANK);
		}
		else {
			qlvtCapPhepGpLienVanImpl.setMaTinhDi(maTinhDi);
		}

		if (maTinhDen == null) {
			qlvtCapPhepGpLienVanImpl.setMaTinhDen(StringPool.BLANK);
		}
		else {
			qlvtCapPhepGpLienVanImpl.setMaTinhDen(maTinhDen);
		}

		if (hanhTrinh == null) {
			qlvtCapPhepGpLienVanImpl.setHanhTrinh(StringPool.BLANK);
		}
		else {
			qlvtCapPhepGpLienVanImpl.setHanhTrinh(hanhTrinh);
		}

		if (mucPhi == null) {
			qlvtCapPhepGpLienVanImpl.setMucPhi(StringPool.BLANK);
		}
		else {
			qlvtCapPhepGpLienVanImpl.setMucPhi(mucPhi);
		}

		if (mucDichChuyenDi == null) {
			qlvtCapPhepGpLienVanImpl.setMucDichChuyenDi(StringPool.BLANK);
		}
		else {
			qlvtCapPhepGpLienVanImpl.setMucDichChuyenDi(mucDichChuyenDi);
		}

		qlvtCapPhepGpLienVanImpl.setFileId(fileId);

		if (trangThai == null) {
			qlvtCapPhepGpLienVanImpl.setTrangThai(StringPool.BLANK);
		}
		else {
			qlvtCapPhepGpLienVanImpl.setTrangThai(trangThai);
		}

		qlvtCapPhepGpLienVanImpl.resetOriginalValues();

		return qlvtCapPhepGpLienVanImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		gpkdvtVietLaoId = objectInput.readLong();
		loaiCapPhep = objectInput.readUTF();
		loaiGiayPhepLienVan = objectInput.readUTF();
		soGiayPhepLienVan = objectInput.readUTF();
		ngayCapGplv = objectInput.readLong();
		ngayHetHanGplv = objectInput.readLong();
		coQuanCpLienVan = objectInput.readUTF();
		soCongVanChapThuanTCD = objectInput.readUTF();
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
		fileId = objectInput.readLong();
		trangThai = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(gpkdvtVietLaoId);

		if (loaiCapPhep == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(loaiCapPhep);
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

		objectOutput.writeLong(ngayCapGplv);
		objectOutput.writeLong(ngayHetHanGplv);

		if (coQuanCpLienVan == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(coQuanCpLienVan);
		}

		if (soCongVanChapThuanTCD == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soCongVanChapThuanTCD);
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

		objectOutput.writeLong(fileId);

		if (trangThai == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(trangThai);
		}
	}

	public long id;
	public long gpkdvtVietLaoId;
	public String loaiCapPhep;
	public String loaiGiayPhepLienVan;
	public String soGiayPhepLienVan;
	public long ngayCapGplv;
	public long ngayHetHanGplv;
	public String coQuanCpLienVan;
	public String soCongVanChapThuanTCD;
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
	public long fileId;
	public String trangThai;
}