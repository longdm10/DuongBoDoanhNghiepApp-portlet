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

import vn.dtt.duongbien.dao.vrcb.model.DmHistoryMinistry;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DmHistoryMinistry in entity cache.
 *
 * @author longdm
 * @see DmHistoryMinistry
 * @generated
 */
public class DmHistoryMinistryCacheModel implements CacheModel<DmHistoryMinistry>,
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
	public DmHistoryMinistry toEntityModel() {
		DmHistoryMinistryImpl dmHistoryMinistryImpl = new DmHistoryMinistryImpl();

		dmHistoryMinistryImpl.setId(id);

		if (ministryCode == null) {
			dmHistoryMinistryImpl.setMinistryCode(StringPool.BLANK);
		}
		else {
			dmHistoryMinistryImpl.setMinistryCode(ministryCode);
		}

		if (ministryName == null) {
			dmHistoryMinistryImpl.setMinistryName(StringPool.BLANK);
		}
		else {
			dmHistoryMinistryImpl.setMinistryName(ministryName);
		}

		if (ministryNameVN == null) {
			dmHistoryMinistryImpl.setMinistryNameVN(StringPool.BLANK);
		}
		else {
			dmHistoryMinistryImpl.setMinistryNameVN(ministryNameVN);
		}

		dmHistoryMinistryImpl.setMinistryOrder(ministryOrder);
		dmHistoryMinistryImpl.setIsDelete(isDelete);
		dmHistoryMinistryImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmHistoryMinistryImpl.setModifiedDate(null);
		}
		else {
			dmHistoryMinistryImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmHistoryMinistryImpl.setRequestedDate(null);
		}
		else {
			dmHistoryMinistryImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmHistoryMinistryImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmHistoryMinistryImpl.setSyncVersion(syncVersion);
		}

		dmHistoryMinistryImpl.resetOriginalValues();

		return dmHistoryMinistryImpl;
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