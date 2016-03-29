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

import vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing MotCuaAnhXaTrangThai in entity cache.
 *
 * @author win_64
 * @see MotCuaAnhXaTrangThai
 * @generated
 */
public class MotCuaAnhXaTrangThaiCacheModel implements CacheModel<MotCuaAnhXaTrangThai>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(id);
		sb.append(", maTTCanBo=");
		sb.append(maTTCanBo);
		sb.append(", maTTDoanhNghiep=");
		sb.append(maTTDoanhNghiep);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MotCuaAnhXaTrangThai toEntityModel() {
		MotCuaAnhXaTrangThaiImpl motCuaAnhXaTrangThaiImpl = new MotCuaAnhXaTrangThaiImpl();

		motCuaAnhXaTrangThaiImpl.setId(id);

		if (maTTCanBo == null) {
			motCuaAnhXaTrangThaiImpl.setMaTTCanBo(StringPool.BLANK);
		}
		else {
			motCuaAnhXaTrangThaiImpl.setMaTTCanBo(maTTCanBo);
		}

		if (maTTDoanhNghiep == null) {
			motCuaAnhXaTrangThaiImpl.setMaTTDoanhNghiep(StringPool.BLANK);
		}
		else {
			motCuaAnhXaTrangThaiImpl.setMaTTDoanhNghiep(maTTDoanhNghiep);
		}

		motCuaAnhXaTrangThaiImpl.resetOriginalValues();

		return motCuaAnhXaTrangThaiImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		maTTCanBo = objectInput.readUTF();
		maTTDoanhNghiep = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (maTTCanBo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maTTCanBo);
		}

		if (maTTDoanhNghiep == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maTTDoanhNghiep);
		}
	}

	public long id;
	public String maTTCanBo;
	public String maTTDoanhNghiep;
}