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

import vn.dtt.duongbien.dao.vrcb.model.DmSecurityLevel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DmSecurityLevel in entity cache.
 *
 * @author longdm
 * @see DmSecurityLevel
 * @generated
 */
public class DmSecurityLevelCacheModel implements CacheModel<DmSecurityLevel>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(id);
		sb.append(", securityLevelCode=");
		sb.append(securityLevelCode);
		sb.append(", securityLevel=");
		sb.append(securityLevel);
		sb.append(", securityLevelName=");
		sb.append(securityLevelName);
		sb.append(", isDelete=");
		sb.append(isDelete);
		sb.append(", markedAsDelete=");
		sb.append(markedAsDelete);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", requestedDate=");
		sb.append(requestedDate);
		sb.append(", syncVersion=");
		sb.append(syncVersion);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DmSecurityLevel toEntityModel() {
		DmSecurityLevelImpl dmSecurityLevelImpl = new DmSecurityLevelImpl();

		dmSecurityLevelImpl.setId(id);

		if (securityLevelCode == null) {
			dmSecurityLevelImpl.setSecurityLevelCode(StringPool.BLANK);
		}
		else {
			dmSecurityLevelImpl.setSecurityLevelCode(securityLevelCode);
		}

		if (securityLevel == null) {
			dmSecurityLevelImpl.setSecurityLevel(StringPool.BLANK);
		}
		else {
			dmSecurityLevelImpl.setSecurityLevel(securityLevel);
		}

		if (securityLevelName == null) {
			dmSecurityLevelImpl.setSecurityLevelName(StringPool.BLANK);
		}
		else {
			dmSecurityLevelImpl.setSecurityLevelName(securityLevelName);
		}

		dmSecurityLevelImpl.setIsDelete(isDelete);
		dmSecurityLevelImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmSecurityLevelImpl.setModifiedDate(null);
		}
		else {
			dmSecurityLevelImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmSecurityLevelImpl.setRequestedDate(null);
		}
		else {
			dmSecurityLevelImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmSecurityLevelImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmSecurityLevelImpl.setSyncVersion(syncVersion);
		}

		dmSecurityLevelImpl.resetOriginalValues();

		return dmSecurityLevelImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		securityLevelCode = objectInput.readUTF();
		securityLevel = objectInput.readUTF();
		securityLevelName = objectInput.readUTF();
		isDelete = objectInput.readInt();
		markedAsDelete = objectInput.readInt();
		modifiedDate = objectInput.readLong();
		requestedDate = objectInput.readLong();
		syncVersion = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(id);

		if (securityLevelCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(securityLevelCode);
		}

		if (securityLevel == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(securityLevel);
		}

		if (securityLevelName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(securityLevelName);
		}

		objectOutput.writeInt(isDelete);
		objectOutput.writeInt(markedAsDelete);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(requestedDate);

		if (syncVersion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(syncVersion);
		}
	}

	public int id;
	public String securityLevelCode;
	public String securityLevel;
	public String securityLevelName;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}