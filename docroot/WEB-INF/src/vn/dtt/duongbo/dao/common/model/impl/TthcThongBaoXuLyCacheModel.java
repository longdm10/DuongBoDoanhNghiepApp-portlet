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

import vn.dtt.duongbo.dao.common.model.TthcThongBaoXuLy;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TthcThongBaoXuLy in entity cache.
 *
 * @author win_64
 * @see TthcThongBaoXuLy
 * @generated
 */
public class TthcThongBaoXuLyCacheModel implements CacheModel<TthcThongBaoXuLy>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(id);
		sb.append(", hoSoThuTucId=");
		sb.append(hoSoThuTucId);
		sb.append(", maThongBao=");
		sb.append(maThongBao);
		sb.append(", noiDungThongBao=");
		sb.append(noiDungThongBao);
		sb.append(", duLieuThongBao=");
		sb.append(duLieuThongBao);
		sb.append(", ngayGio=");
		sb.append(ngayGio);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TthcThongBaoXuLy toEntityModel() {
		TthcThongBaoXuLyImpl tthcThongBaoXuLyImpl = new TthcThongBaoXuLyImpl();

		tthcThongBaoXuLyImpl.setId(id);
		tthcThongBaoXuLyImpl.setHoSoThuTucId(hoSoThuTucId);

		if (maThongBao == null) {
			tthcThongBaoXuLyImpl.setMaThongBao(StringPool.BLANK);
		}
		else {
			tthcThongBaoXuLyImpl.setMaThongBao(maThongBao);
		}

		if (noiDungThongBao == null) {
			tthcThongBaoXuLyImpl.setNoiDungThongBao(StringPool.BLANK);
		}
		else {
			tthcThongBaoXuLyImpl.setNoiDungThongBao(noiDungThongBao);
		}

		if (duLieuThongBao == null) {
			tthcThongBaoXuLyImpl.setDuLieuThongBao(StringPool.BLANK);
		}
		else {
			tthcThongBaoXuLyImpl.setDuLieuThongBao(duLieuThongBao);
		}

		if (ngayGio == Long.MIN_VALUE) {
			tthcThongBaoXuLyImpl.setNgayGio(null);
		}
		else {
			tthcThongBaoXuLyImpl.setNgayGio(new Date(ngayGio));
		}

		tthcThongBaoXuLyImpl.resetOriginalValues();

		return tthcThongBaoXuLyImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		hoSoThuTucId = objectInput.readLong();
		maThongBao = objectInput.readUTF();
		noiDungThongBao = objectInput.readUTF();
		duLieuThongBao = objectInput.readUTF();
		ngayGio = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(hoSoThuTucId);

		if (maThongBao == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maThongBao);
		}

		if (noiDungThongBao == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(noiDungThongBao);
		}

		if (duLieuThongBao == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(duLieuThongBao);
		}

		objectOutput.writeLong(ngayGio);
	}

	public long id;
	public long hoSoThuTucId;
	public String maThongBao;
	public String noiDungThongBao;
	public String duLieuThongBao;
	public long ngayGio;
}