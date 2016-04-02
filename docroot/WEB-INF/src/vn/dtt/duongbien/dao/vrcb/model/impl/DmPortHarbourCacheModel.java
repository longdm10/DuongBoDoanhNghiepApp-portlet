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

import vn.dtt.duongbien.dao.vrcb.model.DmPortHarbour;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DmPortHarbour in entity cache.
 *
 * @author longdm
 * @see DmPortHarbour
 * @generated
 */
public class DmPortHarbourCacheModel implements CacheModel<DmPortHarbour>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{id=");
		sb.append(id);
		sb.append(", portHarbourCode=");
		sb.append(portHarbourCode);
		sb.append(", portHarbourName=");
		sb.append(portHarbourName);
		sb.append(", portHarbourNameVN=");
		sb.append(portHarbourNameVN);
		sb.append(", portHarbourType=");
		sb.append(portHarbourType);
		sb.append(", portCode=");
		sb.append(portCode);
		sb.append(", portRegionCode=");
		sb.append(portRegionCode);
		sb.append(", note=");
		sb.append(note);
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
	public DmPortHarbour toEntityModel() {
		DmPortHarbourImpl dmPortHarbourImpl = new DmPortHarbourImpl();

		dmPortHarbourImpl.setId(id);

		if (portHarbourCode == null) {
			dmPortHarbourImpl.setPortHarbourCode(StringPool.BLANK);
		}
		else {
			dmPortHarbourImpl.setPortHarbourCode(portHarbourCode);
		}

		if (portHarbourName == null) {
			dmPortHarbourImpl.setPortHarbourName(StringPool.BLANK);
		}
		else {
			dmPortHarbourImpl.setPortHarbourName(portHarbourName);
		}

		if (portHarbourNameVN == null) {
			dmPortHarbourImpl.setPortHarbourNameVN(StringPool.BLANK);
		}
		else {
			dmPortHarbourImpl.setPortHarbourNameVN(portHarbourNameVN);
		}

		dmPortHarbourImpl.setPortHarbourType(portHarbourType);

		if (portCode == null) {
			dmPortHarbourImpl.setPortCode(StringPool.BLANK);
		}
		else {
			dmPortHarbourImpl.setPortCode(portCode);
		}

		if (portRegionCode == null) {
			dmPortHarbourImpl.setPortRegionCode(StringPool.BLANK);
		}
		else {
			dmPortHarbourImpl.setPortRegionCode(portRegionCode);
		}

		if (note == null) {
			dmPortHarbourImpl.setNote(StringPool.BLANK);
		}
		else {
			dmPortHarbourImpl.setNote(note);
		}

		dmPortHarbourImpl.setIsDelete(isDelete);
		dmPortHarbourImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmPortHarbourImpl.setModifiedDate(null);
		}
		else {
			dmPortHarbourImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmPortHarbourImpl.setRequestedDate(null);
		}
		else {
			dmPortHarbourImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmPortHarbourImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmPortHarbourImpl.setSyncVersion(syncVersion);
		}

		dmPortHarbourImpl.resetOriginalValues();

		return dmPortHarbourImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		portHarbourCode = objectInput.readUTF();
		portHarbourName = objectInput.readUTF();
		portHarbourNameVN = objectInput.readUTF();
		portHarbourType = objectInput.readInt();
		portCode = objectInput.readUTF();
		portRegionCode = objectInput.readUTF();
		note = objectInput.readUTF();
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

		if (portHarbourCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(portHarbourCode);
		}

		if (portHarbourName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(portHarbourName);
		}

		if (portHarbourNameVN == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(portHarbourNameVN);
		}

		objectOutput.writeInt(portHarbourType);

		if (portCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(portCode);
		}

		if (portRegionCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(portRegionCode);
		}

		if (note == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(note);
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
	public String portHarbourCode;
	public String portHarbourName;
	public String portHarbourNameVN;
	public int portHarbourType;
	public String portCode;
	public String portRegionCode;
	public String note;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}