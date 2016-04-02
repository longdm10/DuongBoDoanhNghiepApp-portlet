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

import vn.dtt.duongbien.dao.vrcb.model.DmGtOrganization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DmGtOrganization in entity cache.
 *
 * @author longdm
 * @see DmGtOrganization
 * @generated
 */
public class DmGtOrganizationCacheModel implements CacheModel<DmGtOrganization>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", organizationCode=");
		sb.append(organizationCode);
		sb.append(", organizationName=");
		sb.append(organizationName);
		sb.append(", organizationNameVN=");
		sb.append(organizationNameVN);
		sb.append(", organizationorder=");
		sb.append(organizationorder);
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
	public DmGtOrganization toEntityModel() {
		DmGtOrganizationImpl dmGtOrganizationImpl = new DmGtOrganizationImpl();

		dmGtOrganizationImpl.setId(id);

		if (organizationCode == null) {
			dmGtOrganizationImpl.setOrganizationCode(StringPool.BLANK);
		}
		else {
			dmGtOrganizationImpl.setOrganizationCode(organizationCode);
		}

		if (organizationName == null) {
			dmGtOrganizationImpl.setOrganizationName(StringPool.BLANK);
		}
		else {
			dmGtOrganizationImpl.setOrganizationName(organizationName);
		}

		if (organizationNameVN == null) {
			dmGtOrganizationImpl.setOrganizationNameVN(StringPool.BLANK);
		}
		else {
			dmGtOrganizationImpl.setOrganizationNameVN(organizationNameVN);
		}

		dmGtOrganizationImpl.setOrganizationorder(organizationorder);
		dmGtOrganizationImpl.setIsDelete(isDelete);
		dmGtOrganizationImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmGtOrganizationImpl.setModifiedDate(null);
		}
		else {
			dmGtOrganizationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmGtOrganizationImpl.setRequestedDate(null);
		}
		else {
			dmGtOrganizationImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmGtOrganizationImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmGtOrganizationImpl.setSyncVersion(syncVersion);
		}

		dmGtOrganizationImpl.resetOriginalValues();

		return dmGtOrganizationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		organizationCode = objectInput.readUTF();
		organizationName = objectInput.readUTF();
		organizationNameVN = objectInput.readUTF();
		organizationorder = objectInput.readInt();
		isDelete = objectInput.readInt();
		markedAsDelete = objectInput.readInt();
		modifiedDate = objectInput.readLong();
		requestedDate = objectInput.readLong();
		syncVersion = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (organizationCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(organizationCode);
		}

		if (organizationName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(organizationName);
		}

		if (organizationNameVN == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(organizationNameVN);
		}

		objectOutput.writeInt(organizationorder);
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

	public long id;
	public String organizationCode;
	public String organizationName;
	public String organizationNameVN;
	public int organizationorder;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}