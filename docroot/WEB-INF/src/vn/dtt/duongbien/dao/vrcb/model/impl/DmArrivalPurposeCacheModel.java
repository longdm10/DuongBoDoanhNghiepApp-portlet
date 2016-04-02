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

import vn.dtt.duongbien.dao.vrcb.model.DmArrivalPurpose;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DmArrivalPurpose in entity cache.
 *
 * @author longdm
 * @see DmArrivalPurpose
 * @generated
 */
public class DmArrivalPurposeCacheModel implements CacheModel<DmArrivalPurpose>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(id);
		sb.append(", purposeCode=");
		sb.append(purposeCode);
		sb.append(", purposeName=");
		sb.append(purposeName);
		sb.append(", purposeNameVN=");
		sb.append(purposeNameVN);
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
	public DmArrivalPurpose toEntityModel() {
		DmArrivalPurposeImpl dmArrivalPurposeImpl = new DmArrivalPurposeImpl();

		dmArrivalPurposeImpl.setId(id);

		if (purposeCode == null) {
			dmArrivalPurposeImpl.setPurposeCode(StringPool.BLANK);
		}
		else {
			dmArrivalPurposeImpl.setPurposeCode(purposeCode);
		}

		if (purposeName == null) {
			dmArrivalPurposeImpl.setPurposeName(StringPool.BLANK);
		}
		else {
			dmArrivalPurposeImpl.setPurposeName(purposeName);
		}

		if (purposeNameVN == null) {
			dmArrivalPurposeImpl.setPurposeNameVN(StringPool.BLANK);
		}
		else {
			dmArrivalPurposeImpl.setPurposeNameVN(purposeNameVN);
		}

		dmArrivalPurposeImpl.setIsDelete(isDelete);
		dmArrivalPurposeImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmArrivalPurposeImpl.setModifiedDate(null);
		}
		else {
			dmArrivalPurposeImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmArrivalPurposeImpl.setRequestedDate(null);
		}
		else {
			dmArrivalPurposeImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmArrivalPurposeImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmArrivalPurposeImpl.setSyncVersion(syncVersion);
		}

		dmArrivalPurposeImpl.resetOriginalValues();

		return dmArrivalPurposeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		purposeCode = objectInput.readUTF();
		purposeName = objectInput.readUTF();
		purposeNameVN = objectInput.readUTF();
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

		if (purposeCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(purposeCode);
		}

		if (purposeName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(purposeName);
		}

		if (purposeNameVN == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(purposeNameVN);
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
	public String purposeCode;
	public String purposeName;
	public String purposeNameVN;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}