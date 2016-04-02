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

import vn.dtt.duongbien.dao.vrcb.model.DmGTShipPosition;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DmGTShipPosition in entity cache.
 *
 * @author longdm
 * @see DmGTShipPosition
 * @generated
 */
public class DmGTShipPositionCacheModel implements CacheModel<DmGTShipPosition>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", positionCode=");
		sb.append(positionCode);
		sb.append(", positionName=");
		sb.append(positionName);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append(", positionOrder=");
		sb.append(positionOrder);
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
	public DmGTShipPosition toEntityModel() {
		DmGTShipPositionImpl dmGTShipPositionImpl = new DmGTShipPositionImpl();

		dmGTShipPositionImpl.setId(id);

		if (positionCode == null) {
			dmGTShipPositionImpl.setPositionCode(StringPool.BLANK);
		}
		else {
			dmGTShipPositionImpl.setPositionCode(positionCode);
		}

		if (positionName == null) {
			dmGTShipPositionImpl.setPositionName(StringPool.BLANK);
		}
		else {
			dmGTShipPositionImpl.setPositionName(positionName);
		}

		if (remarks == null) {
			dmGTShipPositionImpl.setRemarks(StringPool.BLANK);
		}
		else {
			dmGTShipPositionImpl.setRemarks(remarks);
		}

		dmGTShipPositionImpl.setPositionOrder(positionOrder);
		dmGTShipPositionImpl.setIsDelete(isDelete);
		dmGTShipPositionImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmGTShipPositionImpl.setModifiedDate(null);
		}
		else {
			dmGTShipPositionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmGTShipPositionImpl.setRequestedDate(null);
		}
		else {
			dmGTShipPositionImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmGTShipPositionImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmGTShipPositionImpl.setSyncVersion(syncVersion);
		}

		dmGTShipPositionImpl.resetOriginalValues();

		return dmGTShipPositionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		positionCode = objectInput.readUTF();
		positionName = objectInput.readUTF();
		remarks = objectInput.readUTF();
		positionOrder = objectInput.readInt();
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

		if (positionCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(positionCode);
		}

		if (positionName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(positionName);
		}

		if (remarks == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remarks);
		}

		objectOutput.writeInt(positionOrder);
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
	public String positionCode;
	public String positionName;
	public String remarks;
	public int positionOrder;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}