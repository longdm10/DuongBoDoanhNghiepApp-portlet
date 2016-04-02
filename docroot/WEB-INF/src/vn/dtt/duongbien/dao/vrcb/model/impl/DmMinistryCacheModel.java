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

import vn.dtt.duongbien.dao.vrcb.model.DmMinistry;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DmMinistry in entity cache.
 *
 * @author longdm
 * @see DmMinistry
 * @generated
 */
public class DmMinistryCacheModel implements CacheModel<DmMinistry>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", ministryCode=");
		sb.append(ministryCode);
		sb.append(", ministryName=");
		sb.append(ministryName);
		sb.append(", ministryNameVN=");
		sb.append(ministryNameVN);
		sb.append(", ministryOrder=");
		sb.append(ministryOrder);
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
	public DmMinistry toEntityModel() {
		DmMinistryImpl dmMinistryImpl = new DmMinistryImpl();

		dmMinistryImpl.setId(id);

		if (ministryCode == null) {
			dmMinistryImpl.setMinistryCode(StringPool.BLANK);
		}
		else {
			dmMinistryImpl.setMinistryCode(ministryCode);
		}

		if (ministryName == null) {
			dmMinistryImpl.setMinistryName(StringPool.BLANK);
		}
		else {
			dmMinistryImpl.setMinistryName(ministryName);
		}

		if (ministryNameVN == null) {
			dmMinistryImpl.setMinistryNameVN(StringPool.BLANK);
		}
		else {
			dmMinistryImpl.setMinistryNameVN(ministryNameVN);
		}

		dmMinistryImpl.setMinistryOrder(ministryOrder);
		dmMinistryImpl.setIsDelete(isDelete);
		dmMinistryImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmMinistryImpl.setModifiedDate(null);
		}
		else {
			dmMinistryImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmMinistryImpl.setRequestedDate(null);
		}
		else {
			dmMinistryImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmMinistryImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmMinistryImpl.setSyncVersion(syncVersion);
		}

		dmMinistryImpl.resetOriginalValues();

		return dmMinistryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		ministryCode = objectInput.readUTF();
		ministryName = objectInput.readUTF();
		ministryNameVN = objectInput.readUTF();
		ministryOrder = objectInput.readInt();
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

		if (ministryCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ministryCode);
		}

		if (ministryName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ministryName);
		}

		if (ministryNameVN == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ministryNameVN);
		}

		objectOutput.writeInt(ministryOrder);
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
	public String ministryCode;
	public String ministryName;
	public String ministryNameVN;
	public int ministryOrder;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}