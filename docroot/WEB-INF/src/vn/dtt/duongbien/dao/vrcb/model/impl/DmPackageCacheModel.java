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

import vn.dtt.duongbien.dao.vrcb.model.DmPackage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DmPackage in entity cache.
 *
 * @author longdm
 * @see DmPackage
 * @generated
 */
public class DmPackageCacheModel implements CacheModel<DmPackage>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", packageCode=");
		sb.append(packageCode);
		sb.append(", packageName=");
		sb.append(packageName);
		sb.append(", packageNameVN=");
		sb.append(packageNameVN);
		sb.append(", packageOrder=");
		sb.append(packageOrder);
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
	public DmPackage toEntityModel() {
		DmPackageImpl dmPackageImpl = new DmPackageImpl();

		dmPackageImpl.setId(id);

		if (packageCode == null) {
			dmPackageImpl.setPackageCode(StringPool.BLANK);
		}
		else {
			dmPackageImpl.setPackageCode(packageCode);
		}

		if (packageName == null) {
			dmPackageImpl.setPackageName(StringPool.BLANK);
		}
		else {
			dmPackageImpl.setPackageName(packageName);
		}

		if (packageNameVN == null) {
			dmPackageImpl.setPackageNameVN(StringPool.BLANK);
		}
		else {
			dmPackageImpl.setPackageNameVN(packageNameVN);
		}

		dmPackageImpl.setPackageOrder(packageOrder);
		dmPackageImpl.setIsDelete(isDelete);
		dmPackageImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmPackageImpl.setModifiedDate(null);
		}
		else {
			dmPackageImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmPackageImpl.setRequestedDate(null);
		}
		else {
			dmPackageImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmPackageImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmPackageImpl.setSyncVersion(syncVersion);
		}

		dmPackageImpl.resetOriginalValues();

		return dmPackageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		packageCode = objectInput.readUTF();
		packageName = objectInput.readUTF();
		packageNameVN = objectInput.readUTF();
		packageOrder = objectInput.readInt();
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

		if (packageCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(packageCode);
		}

		if (packageName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(packageName);
		}

		if (packageNameVN == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(packageNameVN);
		}

		objectOutput.writeInt(packageOrder);
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
	public String packageCode;
	public String packageName;
	public String packageNameVN;
	public int packageOrder;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}