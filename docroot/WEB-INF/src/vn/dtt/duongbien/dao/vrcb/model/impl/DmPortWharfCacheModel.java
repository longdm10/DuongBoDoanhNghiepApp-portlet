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

import vn.dtt.duongbien.dao.vrcb.model.DmPortWharf;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DmPortWharf in entity cache.
 *
 * @author longdm
 * @see DmPortWharf
 * @generated
 */
public class DmPortWharfCacheModel implements CacheModel<DmPortWharf>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{id=");
		sb.append(id);
		sb.append(", portWharfCode=");
		sb.append(portWharfCode);
		sb.append(", portWharfName=");
		sb.append(portWharfName);
		sb.append(", portWharfNameVN=");
		sb.append(portWharfNameVN);
		sb.append(", portWharfType=");
		sb.append(portWharfType);
		sb.append(", portCode=");
		sb.append(portCode);
		sb.append(", portHarbourCode=");
		sb.append(portHarbourCode);
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
	public DmPortWharf toEntityModel() {
		DmPortWharfImpl dmPortWharfImpl = new DmPortWharfImpl();

		dmPortWharfImpl.setId(id);

		if (portWharfCode == null) {
			dmPortWharfImpl.setPortWharfCode(StringPool.BLANK);
		}
		else {
			dmPortWharfImpl.setPortWharfCode(portWharfCode);
		}

		if (portWharfName == null) {
			dmPortWharfImpl.setPortWharfName(StringPool.BLANK);
		}
		else {
			dmPortWharfImpl.setPortWharfName(portWharfName);
		}

		if (portWharfNameVN == null) {
			dmPortWharfImpl.setPortWharfNameVN(StringPool.BLANK);
		}
		else {
			dmPortWharfImpl.setPortWharfNameVN(portWharfNameVN);
		}

		dmPortWharfImpl.setPortWharfType(portWharfType);

		if (portCode == null) {
			dmPortWharfImpl.setPortCode(StringPool.BLANK);
		}
		else {
			dmPortWharfImpl.setPortCode(portCode);
		}

		if (portHarbourCode == null) {
			dmPortWharfImpl.setPortHarbourCode(StringPool.BLANK);
		}
		else {
			dmPortWharfImpl.setPortHarbourCode(portHarbourCode);
		}

		if (portRegionCode == null) {
			dmPortWharfImpl.setPortRegionCode(StringPool.BLANK);
		}
		else {
			dmPortWharfImpl.setPortRegionCode(portRegionCode);
		}

		if (note == null) {
			dmPortWharfImpl.setNote(StringPool.BLANK);
		}
		else {
			dmPortWharfImpl.setNote(note);
		}

		dmPortWharfImpl.setIsDelete(isDelete);
		dmPortWharfImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmPortWharfImpl.setModifiedDate(null);
		}
		else {
			dmPortWharfImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmPortWharfImpl.setRequestedDate(null);
		}
		else {
			dmPortWharfImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmPortWharfImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmPortWharfImpl.setSyncVersion(syncVersion);
		}

		dmPortWharfImpl.resetOriginalValues();

		return dmPortWharfImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		portWharfCode = objectInput.readUTF();
		portWharfName = objectInput.readUTF();
		portWharfNameVN = objectInput.readUTF();
		portWharfType = objectInput.readInt();
		portCode = objectInput.readUTF();
		portHarbourCode = objectInput.readUTF();
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

		if (portWharfCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(portWharfCode);
		}

		if (portWharfName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(portWharfName);
		}

		if (portWharfNameVN == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(portWharfNameVN);
		}

		objectOutput.writeInt(portWharfType);

		if (portCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(portCode);
		}

		if (portHarbourCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(portHarbourCode);
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
	public String portWharfCode;
	public String portWharfName;
	public String portWharfNameVN;
	public int portWharfType;
	public String portCode;
	public String portHarbourCode;
	public String portRegionCode;
	public String note;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}