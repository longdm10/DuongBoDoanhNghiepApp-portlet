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

import vn.dtt.duongbien.dao.vrcb.model.DmGtVersion;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DmGtVersion in entity cache.
 *
 * @author longdm
 * @see DmGtVersion
 * @generated
 */
public class DmGtVersionCacheModel implements CacheModel<DmGtVersion>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{id=");
		sb.append(id);
		sb.append(", versionName=");
		sb.append(versionName);
		sb.append(", versionDate=");
		sb.append(versionDate);
		sb.append(", versionDeployer=");
		sb.append(versionDeployer);
		sb.append(", contents=");
		sb.append(contents);
		sb.append(", description=");
		sb.append(description);
		sb.append(", dbFileName=");
		sb.append(dbFileName);
		sb.append(", dbFileSize=");
		sb.append(dbFileSize);
		sb.append(", dbDescription=");
		sb.append(dbDescription);
		sb.append(", appFileName=");
		sb.append(appFileName);
		sb.append(", appFileSize=");
		sb.append(appFileSize);
		sb.append(", appDescription=");
		sb.append(appDescription);
		sb.append(", specFileName=");
		sb.append(specFileName);
		sb.append(", specFileSize=");
		sb.append(specFileSize);
		sb.append(", specDescription=");
		sb.append(specDescription);
		sb.append(", organizationCode=");
		sb.append(organizationCode);
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
	public DmGtVersion toEntityModel() {
		DmGtVersionImpl dmGtVersionImpl = new DmGtVersionImpl();

		dmGtVersionImpl.setId(id);

		if (versionName == null) {
			dmGtVersionImpl.setVersionName(StringPool.BLANK);
		}
		else {
			dmGtVersionImpl.setVersionName(versionName);
		}

		if (versionDate == Long.MIN_VALUE) {
			dmGtVersionImpl.setVersionDate(null);
		}
		else {
			dmGtVersionImpl.setVersionDate(new Date(versionDate));
		}

		if (versionDeployer == null) {
			dmGtVersionImpl.setVersionDeployer(StringPool.BLANK);
		}
		else {
			dmGtVersionImpl.setVersionDeployer(versionDeployer);
		}

		if (contents == null) {
			dmGtVersionImpl.setContents(StringPool.BLANK);
		}
		else {
			dmGtVersionImpl.setContents(contents);
		}

		if (description == null) {
			dmGtVersionImpl.setDescription(StringPool.BLANK);
		}
		else {
			dmGtVersionImpl.setDescription(description);
		}

		if (dbFileName == null) {
			dmGtVersionImpl.setDbFileName(StringPool.BLANK);
		}
		else {
			dmGtVersionImpl.setDbFileName(dbFileName);
		}

		if (dbFileSize == null) {
			dmGtVersionImpl.setDbFileSize(StringPool.BLANK);
		}
		else {
			dmGtVersionImpl.setDbFileSize(dbFileSize);
		}

		if (dbDescription == null) {
			dmGtVersionImpl.setDbDescription(StringPool.BLANK);
		}
		else {
			dmGtVersionImpl.setDbDescription(dbDescription);
		}

		if (appFileName == null) {
			dmGtVersionImpl.setAppFileName(StringPool.BLANK);
		}
		else {
			dmGtVersionImpl.setAppFileName(appFileName);
		}

		if (appFileSize == null) {
			dmGtVersionImpl.setAppFileSize(StringPool.BLANK);
		}
		else {
			dmGtVersionImpl.setAppFileSize(appFileSize);
		}

		if (appDescription == null) {
			dmGtVersionImpl.setAppDescription(StringPool.BLANK);
		}
		else {
			dmGtVersionImpl.setAppDescription(appDescription);
		}

		if (specFileName == null) {
			dmGtVersionImpl.setSpecFileName(StringPool.BLANK);
		}
		else {
			dmGtVersionImpl.setSpecFileName(specFileName);
		}

		if (specFileSize == null) {
			dmGtVersionImpl.setSpecFileSize(StringPool.BLANK);
		}
		else {
			dmGtVersionImpl.setSpecFileSize(specFileSize);
		}

		if (specDescription == null) {
			dmGtVersionImpl.setSpecDescription(StringPool.BLANK);
		}
		else {
			dmGtVersionImpl.setSpecDescription(specDescription);
		}

		if (organizationCode == null) {
			dmGtVersionImpl.setOrganizationCode(StringPool.BLANK);
		}
		else {
			dmGtVersionImpl.setOrganizationCode(organizationCode);
		}

		dmGtVersionImpl.setIsDelete(isDelete);
		dmGtVersionImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmGtVersionImpl.setModifiedDate(null);
		}
		else {
			dmGtVersionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmGtVersionImpl.setRequestedDate(null);
		}
		else {
			dmGtVersionImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmGtVersionImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmGtVersionImpl.setSyncVersion(syncVersion);
		}

		dmGtVersionImpl.resetOriginalValues();

		return dmGtVersionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		versionName = objectInput.readUTF();
		versionDate = objectInput.readLong();
		versionDeployer = objectInput.readUTF();
		contents = objectInput.readUTF();
		description = objectInput.readUTF();
		dbFileName = objectInput.readUTF();
		dbFileSize = objectInput.readUTF();
		dbDescription = objectInput.readUTF();
		appFileName = objectInput.readUTF();
		appFileSize = objectInput.readUTF();
		appDescription = objectInput.readUTF();
		specFileName = objectInput.readUTF();
		specFileSize = objectInput.readUTF();
		specDescription = objectInput.readUTF();
		organizationCode = objectInput.readUTF();
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

		if (versionName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(versionName);
		}

		objectOutput.writeLong(versionDate);

		if (versionDeployer == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(versionDeployer);
		}

		if (contents == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(contents);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (dbFileName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dbFileName);
		}

		if (dbFileSize == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dbFileSize);
		}

		if (dbDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dbDescription);
		}

		if (appFileName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(appFileName);
		}

		if (appFileSize == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(appFileSize);
		}

		if (appDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(appDescription);
		}

		if (specFileName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specFileName);
		}

		if (specFileSize == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specFileSize);
		}

		if (specDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specDescription);
		}

		if (organizationCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(organizationCode);
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
	public String versionName;
	public long versionDate;
	public String versionDeployer;
	public String contents;
	public String description;
	public String dbFileName;
	public String dbFileSize;
	public String dbDescription;
	public String appFileName;
	public String appFileSize;
	public String appDescription;
	public String specFileName;
	public String specFileSize;
	public String specDescription;
	public String organizationCode;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}