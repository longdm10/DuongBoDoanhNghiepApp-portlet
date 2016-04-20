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

import vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TthcThanhPhanHoSo in entity cache.
 *
 * @author win_64
 * @see TthcThanhPhanHoSo
 * @generated
 */
public class TthcThanhPhanHoSoCacheModel implements CacheModel<TthcThanhPhanHoSo>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(id);
		sb.append(", thuTucHanhChinhId=");
		sb.append(thuTucHanhChinhId);
		sb.append(", tenThanhPhan=");
		sb.append(tenThanhPhan);
		sb.append(", ghiChu=");
		sb.append(ghiChu);
		sb.append(", maThanhPhan=");
		sb.append(maThanhPhan);
		sb.append(", thuTuHienThi=");
		sb.append(thuTuHienThi);
		sb.append(", loaiThanhPhan=");
		sb.append(loaiThanhPhan);
		sb.append(", soTaiLieuDinhKem=");
		sb.append(soTaiLieuDinhKem);
		sb.append(", mauTrucTuyen=");
		sb.append(mauTrucTuyen);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TthcThanhPhanHoSo toEntityModel() {
		TthcThanhPhanHoSoImpl tthcThanhPhanHoSoImpl = new TthcThanhPhanHoSoImpl();

		tthcThanhPhanHoSoImpl.setId(id);
		tthcThanhPhanHoSoImpl.setThuTucHanhChinhId(thuTucHanhChinhId);

		if (tenThanhPhan == null) {
			tthcThanhPhanHoSoImpl.setTenThanhPhan(StringPool.BLANK);
		}
		else {
			tthcThanhPhanHoSoImpl.setTenThanhPhan(tenThanhPhan);
		}

		if (ghiChu == null) {
			tthcThanhPhanHoSoImpl.setGhiChu(StringPool.BLANK);
		}
		else {
			tthcThanhPhanHoSoImpl.setGhiChu(ghiChu);
		}

		if (maThanhPhan == null) {
			tthcThanhPhanHoSoImpl.setMaThanhPhan(StringPool.BLANK);
		}
		else {
			tthcThanhPhanHoSoImpl.setMaThanhPhan(maThanhPhan);
		}

		tthcThanhPhanHoSoImpl.setThuTuHienThi(thuTuHienThi);
		tthcThanhPhanHoSoImpl.setLoaiThanhPhan(loaiThanhPhan);
		tthcThanhPhanHoSoImpl.setSoTaiLieuDinhKem(soTaiLieuDinhKem);

		if (mauTrucTuyen == null) {
			tthcThanhPhanHoSoImpl.setMauTrucTuyen(StringPool.BLANK);
		}
		else {
			tthcThanhPhanHoSoImpl.setMauTrucTuyen(mauTrucTuyen);
		}

		tthcThanhPhanHoSoImpl.resetOriginalValues();

		return tthcThanhPhanHoSoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		thuTucHanhChinhId = objectInput.readLong();
		tenThanhPhan = objectInput.readUTF();
		ghiChu = objectInput.readUTF();
		maThanhPhan = objectInput.readUTF();
		thuTuHienThi = objectInput.readLong();
		loaiThanhPhan = objectInput.readLong();
		soTaiLieuDinhKem = objectInput.readLong();
		mauTrucTuyen = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(thuTucHanhChinhId);

		if (tenThanhPhan == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenThanhPhan);
		}

		if (ghiChu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ghiChu);
		}

		if (maThanhPhan == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maThanhPhan);
		}

		objectOutput.writeLong(thuTuHienThi);
		objectOutput.writeLong(loaiThanhPhan);
		objectOutput.writeLong(soTaiLieuDinhKem);

		if (mauTrucTuyen == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mauTrucTuyen);
		}
	}

	public long id;
	public long thuTucHanhChinhId;
	public String tenThanhPhan;
	public String ghiChu;
	public String maThanhPhan;
	public long thuTuHienThi;
	public long loaiThanhPhan;
	public long soTaiLieuDinhKem;
	public String mauTrucTuyen;
}