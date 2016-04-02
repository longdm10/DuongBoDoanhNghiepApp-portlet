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

import vn.dtt.duongbien.dao.vrcb.model.DmHistoryState;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DmHistoryState in entity cache.
 *
 * @author longdm
 * @see DmHistoryState
 * @generated
 */
public class DmHistoryStateCacheModel implements CacheModel<DmHistoryState>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(id);
		sb.append(", stateCode=");
		sb.append(stateCode);
		sb.append(", stateName=");
		sb.append(stateName);
		sb.append(", description=");
		sb.append(description);
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
	public DmHistoryState toEntityModel() {
		DmHistoryStateImpl dmHistoryStateImpl = new DmHistoryStateImpl();

		dmHistoryStateImpl.setId(id);

		if (stateCode == null) {
			dmHistoryStateImpl.setStateCode(StringPool.BLANK);
		}
		else {
			dmHistoryStateImpl.setStateCode(stateCode);
		}

		if (stateName == null) {
			dmHistoryStateImpl.setStateName(StringPool.BLANK);
		}
		else {
			dmHistoryStateImpl.setStateName(stateName);
		}

		if (description == null) {
			dmHistoryStateImpl.setDescription(StringPool.BLANK);
		}
		else {
			dmHistoryStateImpl.setDescription(description);
		}

		dmHistoryStateImpl.setIsDelete(isDelete);
		dmHistoryStateImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmHistoryStateImpl.setModifiedDate(null);
		}
		else {
			dmHistoryStateImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmHistoryStateImpl.setRequestedDate(null);
		}
		else {
			dmHistoryStateImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmHistoryStateImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmHistoryStateImpl.setSyncVersion(syncVersion);
		}

		dmHistoryStateImpl.resetOriginalValues();

		return dmHistoryStateImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		stateCode = objectInput.readUTF();
		stateName = objectInput.readUTF();
		description = objectInput.readUTF();
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

		if (stateCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(stateCode);
		}

		if (stateName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(stateName);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
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
	public String stateCode;
	public String stateName;
	public String description;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}