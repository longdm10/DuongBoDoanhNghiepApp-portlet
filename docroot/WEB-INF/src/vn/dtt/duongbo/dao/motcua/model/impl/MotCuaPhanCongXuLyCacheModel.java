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

package vn.dtt.duongbo.dao.motcua.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import vn.dtt.duongbo.dao.motcua.model.MotCuaPhanCongXuLy;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MotCuaPhanCongXuLy in entity cache.
 *
 * @author win_64
 * @see MotCuaPhanCongXuLy
 * @generated
 */
public class MotCuaPhanCongXuLyCacheModel implements CacheModel<MotCuaPhanCongXuLy>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", phieuXuLyId=");
		sb.append(phieuXuLyId);
		sb.append(", trangThaiHoSoId=");
		sb.append(trangThaiHoSoId);
		sb.append(", nguoiXuLy=");
		sb.append(nguoiXuLy);
		sb.append(", nhomXuLy=");
		sb.append(nhomXuLy);
		sb.append(", ngayPhanCong=");
		sb.append(ngayPhanCong);
		sb.append(", nguoiPhanCong=");
		sb.append(nguoiPhanCong);
		sb.append(", nguoiDuocUyQuyen=");
		sb.append(nguoiDuocUyQuyen);
		sb.append(", toChucXuLy=");
		sb.append(toChucXuLy);
		sb.append(", toChucXetDuyet=");
		sb.append(toChucXetDuyet);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MotCuaPhanCongXuLy toEntityModel() {
		MotCuaPhanCongXuLyImpl motCuaPhanCongXuLyImpl = new MotCuaPhanCongXuLyImpl();

		motCuaPhanCongXuLyImpl.setId(id);
		motCuaPhanCongXuLyImpl.setPhieuXuLyId(phieuXuLyId);
		motCuaPhanCongXuLyImpl.setTrangThaiHoSoId(trangThaiHoSoId);
		motCuaPhanCongXuLyImpl.setNguoiXuLy(nguoiXuLy);
		motCuaPhanCongXuLyImpl.setNhomXuLy(nhomXuLy);

		if (ngayPhanCong == Long.MIN_VALUE) {
			motCuaPhanCongXuLyImpl.setNgayPhanCong(null);
		}
		else {
			motCuaPhanCongXuLyImpl.setNgayPhanCong(new Date(ngayPhanCong));
		}

		motCuaPhanCongXuLyImpl.setNguoiPhanCong(nguoiPhanCong);
		motCuaPhanCongXuLyImpl.setNguoiDuocUyQuyen(nguoiDuocUyQuyen);
		motCuaPhanCongXuLyImpl.setToChucXuLy(toChucXuLy);
		motCuaPhanCongXuLyImpl.setToChucXetDuyet(toChucXetDuyet);

		motCuaPhanCongXuLyImpl.resetOriginalValues();

		return motCuaPhanCongXuLyImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		phieuXuLyId = objectInput.readLong();
		trangThaiHoSoId = objectInput.readLong();
		nguoiXuLy = objectInput.readLong();
		nhomXuLy = objectInput.readLong();
		ngayPhanCong = objectInput.readLong();
		nguoiPhanCong = objectInput.readLong();
		nguoiDuocUyQuyen = objectInput.readLong();
		toChucXuLy = objectInput.readLong();
		toChucXetDuyet = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(phieuXuLyId);
		objectOutput.writeLong(trangThaiHoSoId);
		objectOutput.writeLong(nguoiXuLy);
		objectOutput.writeLong(nhomXuLy);
		objectOutput.writeLong(ngayPhanCong);
		objectOutput.writeLong(nguoiPhanCong);
		objectOutput.writeLong(nguoiDuocUyQuyen);
		objectOutput.writeLong(toChucXuLy);
		objectOutput.writeLong(toChucXetDuyet);
	}

	public long id;
	public long phieuXuLyId;
	public long trangThaiHoSoId;
	public long nguoiXuLy;
	public long nhomXuLy;
	public long ngayPhanCong;
	public long nguoiPhanCong;
	public long nguoiDuocUyQuyen;
	public long toChucXuLy;
	public long toChucXetDuyet;
}