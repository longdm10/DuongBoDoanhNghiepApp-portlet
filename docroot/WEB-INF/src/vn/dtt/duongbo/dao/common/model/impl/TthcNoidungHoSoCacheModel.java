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

import vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TthcNoidungHoSo in entity cache.
 *
 * @author win_64
 * @see TthcNoidungHoSo
 * @generated
 */
public class TthcNoidungHoSoCacheModel implements CacheModel<TthcNoidungHoSo>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{id=");
		sb.append(id);
		sb.append(", maTuSinh=");
		sb.append(maTuSinh);
		sb.append(", hoSoThuTucId=");
		sb.append(hoSoThuTucId);
		sb.append(", thanhPhanHoSoId=");
		sb.append(thanhPhanHoSoId);
		sb.append(", tenTaiLieu=");
		sb.append(tenTaiLieu);
		sb.append(", taiLieuDinhKem=");
		sb.append(taiLieuDinhKem);
		sb.append(", noiDungXml=");
		sb.append(noiDungXml);
		sb.append(", noiDungHtml=");
		sb.append(noiDungHtml);
		sb.append(", bieuMauHoSoId=");
		sb.append(bieuMauHoSoId);
		sb.append(", ngayGuiNhan=");
		sb.append(ngayGuiNhan);
		sb.append(", loaiTaiLieu=");
		sb.append(loaiTaiLieu);
		sb.append(", ngayTao=");
		sb.append(ngayTao);
		sb.append(", nguoiTao=");
		sb.append(nguoiTao);
		sb.append(", trangThai=");
		sb.append(trangThai);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TthcNoidungHoSo toEntityModel() {
		TthcNoidungHoSoImpl tthcNoidungHoSoImpl = new TthcNoidungHoSoImpl();

		tthcNoidungHoSoImpl.setId(id);

		if (maTuSinh == null) {
			tthcNoidungHoSoImpl.setMaTuSinh(StringPool.BLANK);
		}
		else {
			tthcNoidungHoSoImpl.setMaTuSinh(maTuSinh);
		}

		tthcNoidungHoSoImpl.setHoSoThuTucId(hoSoThuTucId);
		tthcNoidungHoSoImpl.setThanhPhanHoSoId(thanhPhanHoSoId);

		if (tenTaiLieu == null) {
			tthcNoidungHoSoImpl.setTenTaiLieu(StringPool.BLANK);
		}
		else {
			tthcNoidungHoSoImpl.setTenTaiLieu(tenTaiLieu);
		}

		tthcNoidungHoSoImpl.setTaiLieuDinhKem(taiLieuDinhKem);

		if (noiDungXml == null) {
			tthcNoidungHoSoImpl.setNoiDungXml(StringPool.BLANK);
		}
		else {
			tthcNoidungHoSoImpl.setNoiDungXml(noiDungXml);
		}

		if (noiDungHtml == null) {
			tthcNoidungHoSoImpl.setNoiDungHtml(StringPool.BLANK);
		}
		else {
			tthcNoidungHoSoImpl.setNoiDungHtml(noiDungHtml);
		}

		tthcNoidungHoSoImpl.setBieuMauHoSoId(bieuMauHoSoId);

		if (ngayGuiNhan == Long.MIN_VALUE) {
			tthcNoidungHoSoImpl.setNgayGuiNhan(null);
		}
		else {
			tthcNoidungHoSoImpl.setNgayGuiNhan(new Date(ngayGuiNhan));
		}

		tthcNoidungHoSoImpl.setLoaiTaiLieu(loaiTaiLieu);

		if (ngayTao == Long.MIN_VALUE) {
			tthcNoidungHoSoImpl.setNgayTao(null);
		}
		else {
			tthcNoidungHoSoImpl.setNgayTao(new Date(ngayTao));
		}

		tthcNoidungHoSoImpl.setNguoiTao(nguoiTao);
		tthcNoidungHoSoImpl.setTrangThai(trangThai);

		tthcNoidungHoSoImpl.resetOriginalValues();

		return tthcNoidungHoSoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		maTuSinh = objectInput.readUTF();
		hoSoThuTucId = objectInput.readLong();
		thanhPhanHoSoId = objectInput.readLong();
		tenTaiLieu = objectInput.readUTF();
		taiLieuDinhKem = objectInput.readLong();
		noiDungXml = objectInput.readUTF();
		noiDungHtml = objectInput.readUTF();
		bieuMauHoSoId = objectInput.readLong();
		ngayGuiNhan = objectInput.readLong();
		loaiTaiLieu = objectInput.readLong();
		ngayTao = objectInput.readLong();
		nguoiTao = objectInput.readLong();
		trangThai = objectInput.readLong();
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

		objectOutput.writeLong(hoSoThuTucId);
		objectOutput.writeLong(thanhPhanHoSoId);

		if (tenTaiLieu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenTaiLieu);
		}

		objectOutput.writeLong(taiLieuDinhKem);

		if (noiDungXml == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(noiDungXml);
		}

		if (noiDungHtml == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(noiDungHtml);
		}

		objectOutput.writeLong(bieuMauHoSoId);
		objectOutput.writeLong(ngayGuiNhan);
		objectOutput.writeLong(loaiTaiLieu);
		objectOutput.writeLong(ngayTao);
		objectOutput.writeLong(nguoiTao);
		objectOutput.writeLong(trangThai);
	}

	public long id;
	public String maTuSinh;
	public long hoSoThuTucId;
	public long thanhPhanHoSoId;
	public String tenTaiLieu;
	public long taiLieuDinhKem;
	public String noiDungXml;
	public String noiDungHtml;
	public long bieuMauHoSoId;
	public long ngayGuiNhan;
	public long loaiTaiLieu;
	public long ngayTao;
	public long nguoiTao;
	public long trangThai;
}