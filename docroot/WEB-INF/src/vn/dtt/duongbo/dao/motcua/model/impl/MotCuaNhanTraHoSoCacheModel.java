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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing MotCuaNhanTraHoSo in entity cache.
 *
 * @author win_64
 * @see MotCuaNhanTraHoSo
 * @generated
 */
public class MotCuaNhanTraHoSoCacheModel implements CacheModel<MotCuaNhanTraHoSo>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(id);
		sb.append(", hoSoThuTucId=");
		sb.append(hoSoThuTucId);
		sb.append(", tenNguoiNop=");
		sb.append(tenNguoiNop);
		sb.append(", cmndNguoiNop=");
		sb.append(cmndNguoiNop);
		sb.append(", diaChiNguoiNop=");
		sb.append(diaChiNguoiNop);
		sb.append(", soDienThoaiNguoiNop=");
		sb.append(soDienThoaiNguoiNop);
		sb.append(", emailNguoiNop=");
		sb.append(emailNguoiNop);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MotCuaNhanTraHoSo toEntityModel() {
		MotCuaNhanTraHoSoImpl motCuaNhanTraHoSoImpl = new MotCuaNhanTraHoSoImpl();

		motCuaNhanTraHoSoImpl.setId(id);
		motCuaNhanTraHoSoImpl.setHoSoThuTucId(hoSoThuTucId);

		if (tenNguoiNop == null) {
			motCuaNhanTraHoSoImpl.setTenNguoiNop(StringPool.BLANK);
		}
		else {
			motCuaNhanTraHoSoImpl.setTenNguoiNop(tenNguoiNop);
		}

		if (cmndNguoiNop == null) {
			motCuaNhanTraHoSoImpl.setCmndNguoiNop(StringPool.BLANK);
		}
		else {
			motCuaNhanTraHoSoImpl.setCmndNguoiNop(cmndNguoiNop);
		}

		if (diaChiNguoiNop == null) {
			motCuaNhanTraHoSoImpl.setDiaChiNguoiNop(StringPool.BLANK);
		}
		else {
			motCuaNhanTraHoSoImpl.setDiaChiNguoiNop(diaChiNguoiNop);
		}

		if (soDienThoaiNguoiNop == null) {
			motCuaNhanTraHoSoImpl.setSoDienThoaiNguoiNop(StringPool.BLANK);
		}
		else {
			motCuaNhanTraHoSoImpl.setSoDienThoaiNguoiNop(soDienThoaiNguoiNop);
		}

		if (emailNguoiNop == null) {
			motCuaNhanTraHoSoImpl.setEmailNguoiNop(StringPool.BLANK);
		}
		else {
			motCuaNhanTraHoSoImpl.setEmailNguoiNop(emailNguoiNop);
		}

		motCuaNhanTraHoSoImpl.resetOriginalValues();

		return motCuaNhanTraHoSoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		hoSoThuTucId = objectInput.readLong();
		tenNguoiNop = objectInput.readUTF();
		cmndNguoiNop = objectInput.readUTF();
		diaChiNguoiNop = objectInput.readUTF();
		soDienThoaiNguoiNop = objectInput.readUTF();
		emailNguoiNop = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(hoSoThuTucId);

		if (tenNguoiNop == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenNguoiNop);
		}

		if (cmndNguoiNop == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cmndNguoiNop);
		}

		if (diaChiNguoiNop == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(diaChiNguoiNop);
		}

		if (soDienThoaiNguoiNop == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soDienThoaiNguoiNop);
		}

		if (emailNguoiNop == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(emailNguoiNop);
		}
	}

	public long id;
	public long hoSoThuTucId;
	public String tenNguoiNop;
	public String cmndNguoiNop;
	public String diaChiNguoiNop;
	public String soDienThoaiNguoiNop;
	public String emailNguoiNop;
}