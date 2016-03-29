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

import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QlvtThongTinXuLy in entity cache.
 *
 * @author NhanNc
 * @see QlvtThongTinXuLy
 * @generated
 */
public class QlvtThongTinXuLyCacheModel implements CacheModel<QlvtThongTinXuLy>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{id=");
		sb.append(id);
		sb.append(", ketQuaXuLy=");
		sb.append(ketQuaXuLy);
		sb.append(", thongTinHoSoId=");
		sb.append(thongTinHoSoId);
		sb.append(", maSoHoSo=");
		sb.append(maSoHoSo);
		sb.append(", canBoXuLy=");
		sb.append(canBoXuLy);
		sb.append(", thoiGianXuLy=");
		sb.append(thoiGianXuLy);
		sb.append(", yKienCanBoXuLy=");
		sb.append(yKienCanBoXuLy);
		sb.append(", lanhDaoDuyet=");
		sb.append(lanhDaoDuyet);
		sb.append(", yKienLanhDaoDuyet=");
		sb.append(yKienLanhDaoDuyet);
		sb.append(", thoiGianDuyet=");
		sb.append(thoiGianDuyet);
		sb.append(", ketQuaDuyet=");
		sb.append(ketQuaDuyet);
		sb.append(", lanhDaoPheDuyet=");
		sb.append(lanhDaoPheDuyet);
		sb.append(", thoiGianPheDuyet=");
		sb.append(thoiGianPheDuyet);
		sb.append(", ketQuaPheDuyet=");
		sb.append(ketQuaPheDuyet);
		sb.append(", yKienLanhDaoPheDuyet=");
		sb.append(yKienLanhDaoPheDuyet);
		sb.append(", nguoiTraKetQua=");
		sb.append(nguoiTraKetQua);
		sb.append(", thoiGianTraKetQua=");
		sb.append(thoiGianTraKetQua);
		sb.append(", thoiGianCapPhep=");
		sb.append(thoiGianCapPhep);
		sb.append(", ketQuaThamDinhXML=");
		sb.append(ketQuaThamDinhXML);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QlvtThongTinXuLy toEntityModel() {
		QlvtThongTinXuLyImpl qlvtThongTinXuLyImpl = new QlvtThongTinXuLyImpl();

		qlvtThongTinXuLyImpl.setId(id);

		if (ketQuaXuLy == null) {
			qlvtThongTinXuLyImpl.setKetQuaXuLy(StringPool.BLANK);
		}
		else {
			qlvtThongTinXuLyImpl.setKetQuaXuLy(ketQuaXuLy);
		}

		qlvtThongTinXuLyImpl.setThongTinHoSoId(thongTinHoSoId);

		if (maSoHoSo == null) {
			qlvtThongTinXuLyImpl.setMaSoHoSo(StringPool.BLANK);
		}
		else {
			qlvtThongTinXuLyImpl.setMaSoHoSo(maSoHoSo);
		}

		qlvtThongTinXuLyImpl.setCanBoXuLy(canBoXuLy);

		if (thoiGianXuLy == Long.MIN_VALUE) {
			qlvtThongTinXuLyImpl.setThoiGianXuLy(null);
		}
		else {
			qlvtThongTinXuLyImpl.setThoiGianXuLy(new Date(thoiGianXuLy));
		}

		if (yKienCanBoXuLy == null) {
			qlvtThongTinXuLyImpl.setYKienCanBoXuLy(StringPool.BLANK);
		}
		else {
			qlvtThongTinXuLyImpl.setYKienCanBoXuLy(yKienCanBoXuLy);
		}

		qlvtThongTinXuLyImpl.setLanhDaoDuyet(lanhDaoDuyet);

		if (yKienLanhDaoDuyet == null) {
			qlvtThongTinXuLyImpl.setYKienLanhDaoDuyet(StringPool.BLANK);
		}
		else {
			qlvtThongTinXuLyImpl.setYKienLanhDaoDuyet(yKienLanhDaoDuyet);
		}

		if (thoiGianDuyet == Long.MIN_VALUE) {
			qlvtThongTinXuLyImpl.setThoiGianDuyet(null);
		}
		else {
			qlvtThongTinXuLyImpl.setThoiGianDuyet(new Date(thoiGianDuyet));
		}

		qlvtThongTinXuLyImpl.setKetQuaDuyet(ketQuaDuyet);
		qlvtThongTinXuLyImpl.setLanhDaoPheDuyet(lanhDaoPheDuyet);

		if (thoiGianPheDuyet == Long.MIN_VALUE) {
			qlvtThongTinXuLyImpl.setThoiGianPheDuyet(null);
		}
		else {
			qlvtThongTinXuLyImpl.setThoiGianPheDuyet(new Date(thoiGianPheDuyet));
		}

		qlvtThongTinXuLyImpl.setKetQuaPheDuyet(ketQuaPheDuyet);

		if (yKienLanhDaoPheDuyet == null) {
			qlvtThongTinXuLyImpl.setYKienLanhDaoPheDuyet(StringPool.BLANK);
		}
		else {
			qlvtThongTinXuLyImpl.setYKienLanhDaoPheDuyet(yKienLanhDaoPheDuyet);
		}

		qlvtThongTinXuLyImpl.setNguoiTraKetQua(nguoiTraKetQua);

		if (thoiGianTraKetQua == Long.MIN_VALUE) {
			qlvtThongTinXuLyImpl.setThoiGianTraKetQua(null);
		}
		else {
			qlvtThongTinXuLyImpl.setThoiGianTraKetQua(new Date(
					thoiGianTraKetQua));
		}

		if (thoiGianCapPhep == Long.MIN_VALUE) {
			qlvtThongTinXuLyImpl.setThoiGianCapPhep(null);
		}
		else {
			qlvtThongTinXuLyImpl.setThoiGianCapPhep(new Date(thoiGianCapPhep));
		}

		if (ketQuaThamDinhXML == null) {
			qlvtThongTinXuLyImpl.setKetQuaThamDinhXML(StringPool.BLANK);
		}
		else {
			qlvtThongTinXuLyImpl.setKetQuaThamDinhXML(ketQuaThamDinhXML);
		}

		qlvtThongTinXuLyImpl.resetOriginalValues();

		return qlvtThongTinXuLyImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		ketQuaXuLy = objectInput.readUTF();
		thongTinHoSoId = objectInput.readLong();
		maSoHoSo = objectInput.readUTF();
		canBoXuLy = objectInput.readInt();
		thoiGianXuLy = objectInput.readLong();
		yKienCanBoXuLy = objectInput.readUTF();
		lanhDaoDuyet = objectInput.readInt();
		yKienLanhDaoDuyet = objectInput.readUTF();
		thoiGianDuyet = objectInput.readLong();
		ketQuaDuyet = objectInput.readInt();
		lanhDaoPheDuyet = objectInput.readInt();
		thoiGianPheDuyet = objectInput.readLong();
		ketQuaPheDuyet = objectInput.readInt();
		yKienLanhDaoPheDuyet = objectInput.readUTF();
		nguoiTraKetQua = objectInput.readInt();
		thoiGianTraKetQua = objectInput.readLong();
		thoiGianCapPhep = objectInput.readLong();
		ketQuaThamDinhXML = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (ketQuaXuLy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ketQuaXuLy);
		}

		objectOutput.writeLong(thongTinHoSoId);

		if (maSoHoSo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maSoHoSo);
		}

		objectOutput.writeInt(canBoXuLy);
		objectOutput.writeLong(thoiGianXuLy);

		if (yKienCanBoXuLy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(yKienCanBoXuLy);
		}

		objectOutput.writeInt(lanhDaoDuyet);

		if (yKienLanhDaoDuyet == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(yKienLanhDaoDuyet);
		}

		objectOutput.writeLong(thoiGianDuyet);
		objectOutput.writeInt(ketQuaDuyet);
		objectOutput.writeInt(lanhDaoPheDuyet);
		objectOutput.writeLong(thoiGianPheDuyet);
		objectOutput.writeInt(ketQuaPheDuyet);

		if (yKienLanhDaoPheDuyet == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(yKienLanhDaoPheDuyet);
		}

		objectOutput.writeInt(nguoiTraKetQua);
		objectOutput.writeLong(thoiGianTraKetQua);
		objectOutput.writeLong(thoiGianCapPhep);

		if (ketQuaThamDinhXML == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ketQuaThamDinhXML);
		}
	}

	public long id;
	public String ketQuaXuLy;
	public long thongTinHoSoId;
	public String maSoHoSo;
	public int canBoXuLy;
	public long thoiGianXuLy;
	public String yKienCanBoXuLy;
	public int lanhDaoDuyet;
	public String yKienLanhDaoDuyet;
	public long thoiGianDuyet;
	public int ketQuaDuyet;
	public int lanhDaoPheDuyet;
	public long thoiGianPheDuyet;
	public int ketQuaPheDuyet;
	public String yKienLanhDaoPheDuyet;
	public int nguoiTraKetQua;
	public long thoiGianTraKetQua;
	public long thoiGianCapPhep;
	public String ketQuaThamDinhXML;
}