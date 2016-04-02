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

import vn.dtt.duongbien.dao.vrcb.model.DmShipType;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DmShipType in entity cache.
 *
 * @author longdm
 * @see DmShipType
 * @generated
 */
public class DmShipTypeCacheModel implements CacheModel<DmShipType>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", shipTypeCode=");
		sb.append(shipTypeCode);
		sb.append(", shipTypeName=");
		sb.append(shipTypeName);
		sb.append(", shipTypeNameVN=");
		sb.append(shipTypeNameVN);
		sb.append(", shipTypeOrder=");
		sb.append(shipTypeOrder);
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
	public DmShipType toEntityModel() {
		DmShipTypeImpl dmShipTypeImpl = new DmShipTypeImpl();

		dmShipTypeImpl.setId(id);

		if (shipTypeCode == null) {
			dmShipTypeImpl.setShipTypeCode(StringPool.BLANK);
		}
		else {
			dmShipTypeImpl.setShipTypeCode(shipTypeCode);
		}

		if (shipTypeName == null) {
			dmShipTypeImpl.setShipTypeName(StringPool.BLANK);
		}
		else {
			dmShipTypeImpl.setShipTypeName(shipTypeName);
		}

		if (shipTypeNameVN == null) {
			dmShipTypeImpl.setShipTypeNameVN(StringPool.BLANK);
		}
		else {
			dmShipTypeImpl.setShipTypeNameVN(shipTypeNameVN);
		}

		dmShipTypeImpl.setShipTypeOrder(shipTypeOrder);
		dmShipTypeImpl.setIsDelete(isDelete);
		dmShipTypeImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmShipTypeImpl.setModifiedDate(null);
		}
		else {
			dmShipTypeImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmShipTypeImpl.setRequestedDate(null);
		}
		else {
			dmShipTypeImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmShipTypeImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmShipTypeImpl.setSyncVersion(syncVersion);
		}

		dmShipTypeImpl.resetOriginalValues();

		return dmShipTypeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		shipTypeCode = objectInput.readUTF();
		shipTypeName = objectInput.readUTF();
		shipTypeNameVN = objectInput.readUTF();
		shipTypeOrder = objectInput.readInt();
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

		if (shipTypeCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shipTypeCode);
		}

		if (shipTypeName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shipTypeName);
		}

		if (shipTypeNameVN == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shipTypeNameVN);
		}

		objectOutput.writeInt(shipTypeOrder);
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
	public String shipTypeCode;
	public String shipTypeName;
	public String shipTypeNameVN;
	public int shipTypeOrder;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}