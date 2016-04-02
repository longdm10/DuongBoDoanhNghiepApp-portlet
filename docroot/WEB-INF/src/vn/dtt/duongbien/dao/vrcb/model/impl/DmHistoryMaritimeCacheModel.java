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

import vn.dtt.duongbien.dao.vrcb.model.DmHistoryMaritime;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DmHistoryMaritime in entity cache.
 *
 * @author longdm
 * @see DmHistoryMaritime
 * @generated
 */
public class DmHistoryMaritimeCacheModel implements CacheModel<DmHistoryMaritime>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{id=");
		sb.append(id);
		sb.append(", maritimeCode=");
		sb.append(maritimeCode);
		sb.append(", maritimeReference=");
		sb.append(maritimeReference);
		sb.append(", maritimeName=");
		sb.append(maritimeName);
		sb.append(", maritimeNameVN=");
		sb.append(maritimeNameVN);
		sb.append(", address=");
		sb.append(address);
		sb.append(", addressVN=");
		sb.append(addressVN);
		sb.append(", stateCode=");
		sb.append(stateCode);
		sb.append(", citycode=");
		sb.append(citycode);
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
	public DmHistoryMaritime toEntityModel() {
		DmHistoryMaritimeImpl dmHistoryMaritimeImpl = new DmHistoryMaritimeImpl();

		dmHistoryMaritimeImpl.setId(id);

		if (maritimeCode == null) {
			dmHistoryMaritimeImpl.setMaritimeCode(StringPool.BLANK);
		}
		else {
			dmHistoryMaritimeImpl.setMaritimeCode(maritimeCode);
		}

		if (maritimeReference == null) {
			dmHistoryMaritimeImpl.setMaritimeReference(StringPool.BLANK);
		}
		else {
			dmHistoryMaritimeImpl.setMaritimeReference(maritimeReference);
		}

		if (maritimeName == null) {
			dmHistoryMaritimeImpl.setMaritimeName(StringPool.BLANK);
		}
		else {
			dmHistoryMaritimeImpl.setMaritimeName(maritimeName);
		}

		if (maritimeNameVN == null) {
			dmHistoryMaritimeImpl.setMaritimeNameVN(StringPool.BLANK);
		}
		else {
			dmHistoryMaritimeImpl.setMaritimeNameVN(maritimeNameVN);
		}

		if (address == null) {
			dmHistoryMaritimeImpl.setAddress(StringPool.BLANK);
		}
		else {
			dmHistoryMaritimeImpl.setAddress(address);
		}

		if (addressVN == null) {
			dmHistoryMaritimeImpl.setAddressVN(StringPool.BLANK);
		}
		else {
			dmHistoryMaritimeImpl.setAddressVN(addressVN);
		}

		if (stateCode == null) {
			dmHistoryMaritimeImpl.setStateCode(StringPool.BLANK);
		}
		else {
			dmHistoryMaritimeImpl.setStateCode(stateCode);
		}

		if (citycode == null) {
			dmHistoryMaritimeImpl.setCitycode(StringPool.BLANK);
		}
		else {
			dmHistoryMaritimeImpl.setCitycode(citycode);
		}

		dmHistoryMaritimeImpl.setIsDelete(isDelete);
		dmHistoryMaritimeImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmHistoryMaritimeImpl.setModifiedDate(null);
		}
		else {
			dmHistoryMaritimeImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmHistoryMaritimeImpl.setRequestedDate(null);
		}
		else {
			dmHistoryMaritimeImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmHistoryMaritimeImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmHistoryMaritimeImpl.setSyncVersion(syncVersion);
		}

		dmHistoryMaritimeImpl.resetOriginalValues();

		return dmHistoryMaritimeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		maritimeCode = objectInput.readUTF();
		maritimeReference = objectInput.readUTF();
		maritimeName = objectInput.readUTF();
		maritimeNameVN = objectInput.readUTF();
		address = objectInput.readUTF();
		addressVN = objectInput.readUTF();
		stateCode = objectInput.readUTF();
		citycode = objectInput.readUTF();
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

		if (maritimeCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maritimeCode);
		}

		if (maritimeReference == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maritimeReference);
		}

		if (maritimeName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maritimeName);
		}

		if (maritimeNameVN == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maritimeNameVN);
		}

		if (address == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(address);
		}

		if (addressVN == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(addressVN);
		}

		if (stateCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(stateCode);
		}

		if (citycode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(citycode);
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
	public String maritimeCode;
	public String maritimeReference;
	public String maritimeName;
	public String maritimeNameVN;
	public String address;
	public String addressVN;
	public String stateCode;
	public String citycode;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}