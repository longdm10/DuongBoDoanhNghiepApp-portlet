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

package vn.dtt.duongbien.dao.vrcb.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.duongbien.dao.vrcb.model.UserPort;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing UserPort in entity cache.
 *
 * @author longdm
 * @see UserPort
 * @generated
 */
public class UserPortCacheModel implements CacheModel<UserPort>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(id);
		sb.append(", portCode=");
		sb.append(portCode);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public UserPort toEntityModel() {
		UserPortImpl userPortImpl = new UserPortImpl();

		userPortImpl.setId(id);

		if (portCode == null) {
			userPortImpl.setPortCode(StringPool.BLANK);
		}
		else {
			userPortImpl.setPortCode(portCode);
		}

		userPortImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			userPortImpl.setCreateDate(null);
		}
		else {
			userPortImpl.setCreateDate(new Date(createDate));
		}

		userPortImpl.setStatus(status);

		userPortImpl.resetOriginalValues();

		return userPortImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		portCode = objectInput.readUTF();
		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		status = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (portCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(portCode);
		}

		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);
		objectOutput.writeInt(status);
	}

	public long id;
	public String portCode;
	public long userId;
	public long createDate;
	public int status;
}