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

package vn.dtt.duongbo.dao.nghiepvu.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QlvtThongTinHoSo in entity cache.
 *
 * @author NhanNc
 * @see QlvtThongTinHoSo
 * @generated
 */
public class QlvtThongTinHoSoCacheModel implements CacheModel<QlvtThongTinHoSo>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(75);

		sb.append("{id=");
		sb.append(id);
		sb.append(", soCongVanDen=");
		sb.append(soCongVanDen);
		sb.append(", tenDn=");
		sb.append(tenDn);
		sb.append(", diaChiDn=");
		sb.append(diaChiDn);
		sb.append(", dienThoaiDn=");
		sb.append(dienThoaiDn);
		sb.append(", soFaxDn=");
		sb.append(soFaxDn);
		sb.append(", emailDn=");
		sb.append(emailDn);
		sb.append(", webSiteDn=");
		sb.append(webSiteDn);
		sb.append(", soDkkd=");
		sb.append(soDkkd);
		sb.append(", ngayCapDkkd=");
		sb.append(ngayCapDkkd);
		sb.append(", ngayHetHanDkkd=");
		sb.append(ngayHetHanDkkd);
		sb.append(", coQuanCapDkkd=");
		sb.append(coQuanCapDkkd);
		sb.append(", daiDienDn=");
		sb.append(daiDienDn);
		sb.append(", coQuanGiaiQuyet=");
		sb.append(coQuanGiaiQuyet);
		sb.append(", diaDiemLamHoSo=");
		sb.append(diaDiemLamHoSo);
		sb.append(", phieuXuLyId=");
		sb.append(phieuXuLyId);
		sb.append(", maSoHoSo=");
		sb.append(maSoHoSo);
		sb.append(", lyDoCapLai=");
		sb.append(lyDoCapLai);
		sb.append(", lanCapGiayDangKyKinhDoanh=");
		sb.append(lanCapGiayDangKyKinhDoanh);
		sb.append(", soGiayPhepKinhDoanhVanTaiNoiDia=");
		sb.append(soGiayPhepKinhDoanhVanTaiNoiDia);
		sb.append(", ngayCapGPKDVTNoiDia=");
		sb.append(ngayCapGPKDVTNoiDia);
		sb.append(", NgayGiaHanGPKDVTNoiDia=");
		sb.append(NgayGiaHanGPKDVTNoiDia);
		sb.append(", NgayHetHanGPKDVTNoiDia=");
		sb.append(NgayHetHanGPKDVTNoiDia);
		sb.append(", lanCapGPKDVTNoiDia=");
		sb.append(lanCapGPKDVTNoiDia);
		sb.append(", ngayGiaHanGiayDangKyKinhDoanh=");
		sb.append(ngayGiaHanGiayDangKyKinhDoanh);
		sb.append(", soGiayPhepKinhDoanhVanTaiQuocTe=");
		sb.append(soGiayPhepKinhDoanhVanTaiQuocTe);
		sb.append(", lanCapGPKDVTQuocTe=");
		sb.append(lanCapGPKDVTQuocTe);
		sb.append(", ngayCapGPKDVTQuocTe=");
		sb.append(ngayCapGPKDVTQuocTe);
		sb.append(", ngayGiaHanGPKDVTQuocTe=");
		sb.append(ngayGiaHanGPKDVTQuocTe);
		sb.append(", ngayHetHanGPKDVTQuocTe=");
		sb.append(ngayHetHanGPKDVTQuocTe);
		sb.append(", nguoiLienHeTraKetQua=");
		sb.append(nguoiLienHeTraKetQua);
		sb.append(", soDienThoaiNguoiLienHe=");
		sb.append(soDienThoaiNguoiLienHe);
		sb.append(", coQuanCapGPKDVTNoiDia=");
		sb.append(coQuanCapGPKDVTNoiDia);
		sb.append(", nguoiNhanKetQua=");
		sb.append(nguoiNhanKetQua);
		sb.append(", thongTinTraKetQua=");
		sb.append(thongTinTraKetQua);
		sb.append(", ngayTraKetQua=");
		sb.append(ngayTraKetQua);
		sb.append(", diaChiNguoiLienHeTraKetQua=");
		sb.append(diaChiNguoiLienHeTraKetQua);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QlvtThongTinHoSo toEntityModel() {
		QlvtThongTinHoSoImpl qlvtThongTinHoSoImpl = new QlvtThongTinHoSoImpl();

		qlvtThongTinHoSoImpl.setId(id);

		if (soCongVanDen == null) {
			qlvtThongTinHoSoImpl.setSoCongVanDen(StringPool.BLANK);
		}
		else {
			qlvtThongTinHoSoImpl.setSoCongVanDen(soCongVanDen);
		}

		if (tenDn == null) {
			qlvtThongTinHoSoImpl.setTenDn(StringPool.BLANK);
		}
		else {
			qlvtThongTinHoSoImpl.setTenDn(tenDn);
		}

		if (diaChiDn == null) {
			qlvtThongTinHoSoImpl.setDiaChiDn(StringPool.BLANK);
		}
		else {
			qlvtThongTinHoSoImpl.setDiaChiDn(diaChiDn);
		}

		if (dienThoaiDn == null) {
			qlvtThongTinHoSoImpl.setDienThoaiDn(StringPool.BLANK);
		}
		else {
			qlvtThongTinHoSoImpl.setDienThoaiDn(dienThoaiDn);
		}

		if (soFaxDn == null) {
			qlvtThongTinHoSoImpl.setSoFaxDn(StringPool.BLANK);
		}
		else {
			qlvtThongTinHoSoImpl.setSoFaxDn(soFaxDn);
		}

		if (emailDn == null) {
			qlvtThongTinHoSoImpl.setEmailDn(StringPool.BLANK);
		}
		else {
			qlvtThongTinHoSoImpl.setEmailDn(emailDn);
		}

		if (webSiteDn == null) {
			qlvtThongTinHoSoImpl.setWebSiteDn(StringPool.BLANK);
		}
		else {
			qlvtThongTinHoSoImpl.setWebSiteDn(webSiteDn);
		}

		if (soDkkd == null) {
			qlvtThongTinHoSoImpl.setSoDkkd(StringPool.BLANK);
		}
		else {
			qlvtThongTinHoSoImpl.setSoDkkd(soDkkd);
		}

		if (ngayCapDkkd == Long.MIN_VALUE) {
			qlvtThongTinHoSoImpl.setNgayCapDkkd(null);
		}
		else {
			qlvtThongTinHoSoImpl.setNgayCapDkkd(new Date(ngayCapDkkd));
		}

		if (ngayHetHanDkkd == Long.MIN_VALUE) {
			qlvtThongTinHoSoImpl.setNgayHetHanDkkd(null);
		}
		else {
			qlvtThongTinHoSoImpl.setNgayHetHanDkkd(new Date(ngayHetHanDkkd));
		}

		if (coQuanCapDkkd == null) {
			qlvtThongTinHoSoImpl.setCoQuanCapDkkd(StringPool.BLANK);
		}
		else {
			qlvtThongTinHoSoImpl.setCoQuanCapDkkd(coQuanCapDkkd);
		}

		if (daiDienDn == null) {
			qlvtThongTinHoSoImpl.setDaiDienDn(StringPool.BLANK);
		}
		else {
			qlvtThongTinHoSoImpl.setDaiDienDn(daiDienDn);
		}

		qlvtThongTinHoSoImpl.setCoQuanGiaiQuyet(coQuanGiaiQuyet);

		if (diaDiemLamHoSo == null) {
			qlvtThongTinHoSoImpl.setDiaDiemLamHoSo(StringPool.BLANK);
		}
		else {
			qlvtThongTinHoSoImpl.setDiaDiemLamHoSo(diaDiemLamHoSo);
		}

		qlvtThongTinHoSoImpl.setPhieuXuLyId(phieuXuLyId);

		if (maSoHoSo == null) {
			qlvtThongTinHoSoImpl.setMaSoHoSo(StringPool.BLANK);
		}
		else {
			qlvtThongTinHoSoImpl.setMaSoHoSo(maSoHoSo);
		}

		if (lyDoCapLai == null) {
			qlvtThongTinHoSoImpl.setLyDoCapLai(StringPool.BLANK);
		}
		else {
			qlvtThongTinHoSoImpl.setLyDoCapLai(lyDoCapLai);
		}

		qlvtThongTinHoSoImpl.setLanCapGiayDangKyKinhDoanh(lanCapGiayDangKyKinhDoanh);

		if (soGiayPhepKinhDoanhVanTaiNoiDia == null) {
			qlvtThongTinHoSoImpl.setSoGiayPhepKinhDoanhVanTaiNoiDia(StringPool.BLANK);
		}
		else {
			qlvtThongTinHoSoImpl.setSoGiayPhepKinhDoanhVanTaiNoiDia(soGiayPhepKinhDoanhVanTaiNoiDia);
		}

		if (ngayCapGPKDVTNoiDia == Long.MIN_VALUE) {
			qlvtThongTinHoSoImpl.setNgayCapGPKDVTNoiDia(null);
		}
		else {
			qlvtThongTinHoSoImpl.setNgayCapGPKDVTNoiDia(new Date(
					ngayCapGPKDVTNoiDia));
		}

		if (NgayGiaHanGPKDVTNoiDia == Long.MIN_VALUE) {
			qlvtThongTinHoSoImpl.setNgayGiaHanGPKDVTNoiDia(null);
		}
		else {
			qlvtThongTinHoSoImpl.setNgayGiaHanGPKDVTNoiDia(new Date(
					NgayGiaHanGPKDVTNoiDia));
		}

		if (NgayHetHanGPKDVTNoiDia == Long.MIN_VALUE) {
			qlvtThongTinHoSoImpl.setNgayHetHanGPKDVTNoiDia(null);
		}
		else {
			qlvtThongTinHoSoImpl.setNgayHetHanGPKDVTNoiDia(new Date(
					NgayHetHanGPKDVTNoiDia));
		}

		qlvtThongTinHoSoImpl.setLanCapGPKDVTNoiDia(lanCapGPKDVTNoiDia);

		if (ngayGiaHanGiayDangKyKinhDoanh == Long.MIN_VALUE) {
			qlvtThongTinHoSoImpl.setNgayGiaHanGiayDangKyKinhDoanh(null);
		}
		else {
			qlvtThongTinHoSoImpl.setNgayGiaHanGiayDangKyKinhDoanh(new Date(
					ngayGiaHanGiayDangKyKinhDoanh));
		}

		if (soGiayPhepKinhDoanhVanTaiQuocTe == null) {
			qlvtThongTinHoSoImpl.setSoGiayPhepKinhDoanhVanTaiQuocTe(StringPool.BLANK);
		}
		else {
			qlvtThongTinHoSoImpl.setSoGiayPhepKinhDoanhVanTaiQuocTe(soGiayPhepKinhDoanhVanTaiQuocTe);
		}

		qlvtThongTinHoSoImpl.setLanCapGPKDVTQuocTe(lanCapGPKDVTQuocTe);

		if (ngayCapGPKDVTQuocTe == Long.MIN_VALUE) {
			qlvtThongTinHoSoImpl.setNgayCapGPKDVTQuocTe(null);
		}
		else {
			qlvtThongTinHoSoImpl.setNgayCapGPKDVTQuocTe(new Date(
					ngayCapGPKDVTQuocTe));
		}

		if (ngayGiaHanGPKDVTQuocTe == Long.MIN_VALUE) {
			qlvtThongTinHoSoImpl.setNgayGiaHanGPKDVTQuocTe(null);
		}
		else {
			qlvtThongTinHoSoImpl.setNgayGiaHanGPKDVTQuocTe(new Date(
					ngayGiaHanGPKDVTQuocTe));
		}

		if (ngayHetHanGPKDVTQuocTe == Long.MIN_VALUE) {
			qlvtThongTinHoSoImpl.setNgayHetHanGPKDVTQuocTe(null);
		}
		else {
			qlvtThongTinHoSoImpl.setNgayHetHanGPKDVTQuocTe(new Date(
					ngayHetHanGPKDVTQuocTe));
		}

		if (nguoiLienHeTraKetQua == null) {
			qlvtThongTinHoSoImpl.setNguoiLienHeTraKetQua(StringPool.BLANK);
		}
		else {
			qlvtThongTinHoSoImpl.setNguoiLienHeTraKetQua(nguoiLienHeTraKetQua);
		}

		if (soDienThoaiNguoiLienHe == null) {
			qlvtThongTinHoSoImpl.setSoDienThoaiNguoiLienHe(StringPool.BLANK);
		}
		else {
			qlvtThongTinHoSoImpl.setSoDienThoaiNguoiLienHe(soDienThoaiNguoiLienHe);
		}

		if (coQuanCapGPKDVTNoiDia == null) {
			qlvtThongTinHoSoImpl.setCoQuanCapGPKDVTNoiDia(StringPool.BLANK);
		}
		else {
			qlvtThongTinHoSoImpl.setCoQuanCapGPKDVTNoiDia(coQuanCapGPKDVTNoiDia);
		}

		if (nguoiNhanKetQua == null) {
			qlvtThongTinHoSoImpl.setNguoiNhanKetQua(StringPool.BLANK);
		}
		else {
			qlvtThongTinHoSoImpl.setNguoiNhanKetQua(nguoiNhanKetQua);
		}

		if (thongTinTraKetQua == null) {
			qlvtThongTinHoSoImpl.setThongTinTraKetQua(StringPool.BLANK);
		}
		else {
			qlvtThongTinHoSoImpl.setThongTinTraKetQua(thongTinTraKetQua);
		}

		if (ngayTraKetQua == Long.MIN_VALUE) {
			qlvtThongTinHoSoImpl.setNgayTraKetQua(null);
		}
		else {
			qlvtThongTinHoSoImpl.setNgayTraKetQua(new Date(ngayTraKetQua));
		}

		if (diaChiNguoiLienHeTraKetQua == null) {
			qlvtThongTinHoSoImpl.setDiaChiNguoiLienHeTraKetQua(StringPool.BLANK);
		}
		else {
			qlvtThongTinHoSoImpl.setDiaChiNguoiLienHeTraKetQua(diaChiNguoiLienHeTraKetQua);
		}

		qlvtThongTinHoSoImpl.resetOriginalValues();

		return qlvtThongTinHoSoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		soCongVanDen = objectInput.readUTF();
		tenDn = objectInput.readUTF();
		diaChiDn = objectInput.readUTF();
		dienThoaiDn = objectInput.readUTF();
		soFaxDn = objectInput.readUTF();
		emailDn = objectInput.readUTF();
		webSiteDn = objectInput.readUTF();
		soDkkd = objectInput.readUTF();
		ngayCapDkkd = objectInput.readLong();
		ngayHetHanDkkd = objectInput.readLong();
		coQuanCapDkkd = objectInput.readUTF();
		daiDienDn = objectInput.readUTF();
		coQuanGiaiQuyet = objectInput.readLong();
		diaDiemLamHoSo = objectInput.readUTF();
		phieuXuLyId = objectInput.readLong();
		maSoHoSo = objectInput.readUTF();
		lyDoCapLai = objectInput.readUTF();
		lanCapGiayDangKyKinhDoanh = objectInput.readInt();
		soGiayPhepKinhDoanhVanTaiNoiDia = objectInput.readUTF();
		ngayCapGPKDVTNoiDia = objectInput.readLong();
		NgayGiaHanGPKDVTNoiDia = objectInput.readLong();
		NgayHetHanGPKDVTNoiDia = objectInput.readLong();
		lanCapGPKDVTNoiDia = objectInput.readInt();
		ngayGiaHanGiayDangKyKinhDoanh = objectInput.readLong();
		soGiayPhepKinhDoanhVanTaiQuocTe = objectInput.readUTF();
		lanCapGPKDVTQuocTe = objectInput.readInt();
		ngayCapGPKDVTQuocTe = objectInput.readLong();
		ngayGiaHanGPKDVTQuocTe = objectInput.readLong();
		ngayHetHanGPKDVTQuocTe = objectInput.readLong();
		nguoiLienHeTraKetQua = objectInput.readUTF();
		soDienThoaiNguoiLienHe = objectInput.readUTF();
		coQuanCapGPKDVTNoiDia = objectInput.readUTF();
		nguoiNhanKetQua = objectInput.readUTF();
		thongTinTraKetQua = objectInput.readUTF();
		ngayTraKetQua = objectInput.readLong();
		diaChiNguoiLienHeTraKetQua = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (soCongVanDen == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soCongVanDen);
		}

		if (tenDn == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenDn);
		}

		if (diaChiDn == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(diaChiDn);
		}

		if (dienThoaiDn == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dienThoaiDn);
		}

		if (soFaxDn == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soFaxDn);
		}

		if (emailDn == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(emailDn);
		}

		if (webSiteDn == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(webSiteDn);
		}

		if (soDkkd == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soDkkd);
		}

		objectOutput.writeLong(ngayCapDkkd);
		objectOutput.writeLong(ngayHetHanDkkd);

		if (coQuanCapDkkd == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(coQuanCapDkkd);
		}

		if (daiDienDn == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(daiDienDn);
		}

		objectOutput.writeLong(coQuanGiaiQuyet);

		if (diaDiemLamHoSo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(diaDiemLamHoSo);
		}

		objectOutput.writeLong(phieuXuLyId);

		if (maSoHoSo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maSoHoSo);
		}

		if (lyDoCapLai == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lyDoCapLai);
		}

		objectOutput.writeInt(lanCapGiayDangKyKinhDoanh);

		if (soGiayPhepKinhDoanhVanTaiNoiDia == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soGiayPhepKinhDoanhVanTaiNoiDia);
		}

		objectOutput.writeLong(ngayCapGPKDVTNoiDia);
		objectOutput.writeLong(NgayGiaHanGPKDVTNoiDia);
		objectOutput.writeLong(NgayHetHanGPKDVTNoiDia);
		objectOutput.writeInt(lanCapGPKDVTNoiDia);
		objectOutput.writeLong(ngayGiaHanGiayDangKyKinhDoanh);

		if (soGiayPhepKinhDoanhVanTaiQuocTe == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soGiayPhepKinhDoanhVanTaiQuocTe);
		}

		objectOutput.writeInt(lanCapGPKDVTQuocTe);
		objectOutput.writeLong(ngayCapGPKDVTQuocTe);
		objectOutput.writeLong(ngayGiaHanGPKDVTQuocTe);
		objectOutput.writeLong(ngayHetHanGPKDVTQuocTe);

		if (nguoiLienHeTraKetQua == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nguoiLienHeTraKetQua);
		}

		if (soDienThoaiNguoiLienHe == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soDienThoaiNguoiLienHe);
		}

		if (coQuanCapGPKDVTNoiDia == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(coQuanCapGPKDVTNoiDia);
		}

		if (nguoiNhanKetQua == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nguoiNhanKetQua);
		}

		if (thongTinTraKetQua == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(thongTinTraKetQua);
		}

		objectOutput.writeLong(ngayTraKetQua);

		if (diaChiNguoiLienHeTraKetQua == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(diaChiNguoiLienHeTraKetQua);
		}
	}

	public long id;
	public String soCongVanDen;
	public String tenDn;
	public String diaChiDn;
	public String dienThoaiDn;
	public String soFaxDn;
	public String emailDn;
	public String webSiteDn;
	public String soDkkd;
	public long ngayCapDkkd;
	public long ngayHetHanDkkd;
	public String coQuanCapDkkd;
	public String daiDienDn;
	public long coQuanGiaiQuyet;
	public String diaDiemLamHoSo;
	public long phieuXuLyId;
	public String maSoHoSo;
	public String lyDoCapLai;
	public int lanCapGiayDangKyKinhDoanh;
	public String soGiayPhepKinhDoanhVanTaiNoiDia;
	public long ngayCapGPKDVTNoiDia;
	public long NgayGiaHanGPKDVTNoiDia;
	public long NgayHetHanGPKDVTNoiDia;
	public int lanCapGPKDVTNoiDia;
	public long ngayGiaHanGiayDangKyKinhDoanh;
	public String soGiayPhepKinhDoanhVanTaiQuocTe;
	public int lanCapGPKDVTQuocTe;
	public long ngayCapGPKDVTQuocTe;
	public long ngayGiaHanGPKDVTQuocTe;
	public long ngayHetHanGPKDVTQuocTe;
	public String nguoiLienHeTraKetQua;
	public String soDienThoaiNguoiLienHe;
	public String coQuanCapGPKDVTNoiDia;
	public String nguoiNhanKetQua;
	public String thongTinTraKetQua;
	public long ngayTraKetQua;
	public String diaChiNguoiLienHeTraKetQua;
}