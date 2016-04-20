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

import vn.dtt.duongbo.dao.common.model.TthcLinhVucThuTuc;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TthcLinhVucThuTuc in entity cache.
 *
 * @author win_64
 * @see TthcLinhVucThuTuc
 * @generated
 */
public class TthcLinhVucThuTucCacheModel implements CacheModel<TthcLinhVucThuTuc>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(id);
		sb.append(", tenCoQuanQltt=");
		sb.append(tenCoQuanQltt);
		sb.append(", tenTiengAnh=");
		sb.append(tenTiengAnh);
		sb.append(", idCha=");
		sb.append(idCha);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TthcLinhVucThuTuc toEntityModel() {
		TthcLinhVucThuTucImpl tthcLinhVucThuTucImpl = new TthcLinhVucThuTucImpl();

		tthcLinhVucThuTucImpl.setId(id);

		if (tenCoQuanQltt == null) {
			tthcLinhVucThuTucImpl.setTenCoQuanQltt(StringPool.BLANK);
		}
		else {
			tthcLinhVucThuTucImpl.setTenCoQuanQltt(tenCoQuanQltt);
		}

		if (tenTiengAnh == null) {
			tthcLinhVucThuTucImpl.setTenTiengAnh(StringPool.BLANK);
		}
		else {
			tthcLinhVucThuTucImpl.setTenTiengAnh(tenTiengAnh);
		}

		tthcLinhVucThuTucImpl.setIdCha(idCha);

		tthcLinhVucThuTucImpl.resetOriginalValues();

		return tthcLinhVucThuTucImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		tenCoQuanQltt = objectInput.readUTF();
		tenTiengAnh = objectInput.readUTF();
		idCha = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (tenCoQuanQltt == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenCoQuanQltt);
		}

		if (tenTiengAnh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenTiengAnh);
		}

		objectOutput.writeLong(idCha);
	}

	public long id;
	public String tenCoQuanQltt;
	public String tenTiengAnh;
	public long idCha;
}