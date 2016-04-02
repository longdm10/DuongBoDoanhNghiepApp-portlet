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

import vn.dtt.duongbien.dao.vrcb.model.DmHistoryPort;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DmHistoryPort in entity cache.
 *
 * @author longdm
 * @see DmHistoryPort
 * @generated
 */
public class DmHistoryPortCacheModel implements CacheModel<DmHistoryPort>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{id=");
		sb.append(id);
		sb.append(", portCode=");
		sb.append(portCode);
		sb.append(", loCode=");
		sb.append(loCode);
		sb.append(", portName=");
		sb.append(portName);
		sb.append(", fullName=");
		sb.append(fullName);
		sb.append(", fullNameVN=");
		sb.append(fullNameVN);
		sb.append(", portType=");
		sb.append(portType);
		sb.append(", portOrder=");
		sb.append(portOrder);
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
	public DmHistoryPort toEntityModel() {
		DmHistoryPortImpl dmHistoryPortImpl = new DmHistoryPortImpl();

		dmHistoryPortImpl.setId(id);

		if (portCode == null) {
			dmHistoryPortImpl.setPortCode(StringPool.BLANK);
		}
		else {
			dmHistoryPortImpl.setPortCode(portCode);
		}

		if (loCode == null) {
			dmHistoryPortImpl.setLoCode(StringPool.BLANK);
		}
		else {
			dmHistoryPortImpl.setLoCode(loCode);
		}

		if (portName == null) {
			dmHistoryPortImpl.setPortName(StringPool.BLANK);
		}
		else {
			dmHistoryPortImpl.setPortName(portName);
		}

		if (fullName == null) {
			dmHistoryPortImpl.setFullName(StringPool.BLANK);
		}
		else {
			dmHistoryPortImpl.setFullName(fullName);
		}

		if (fullNameVN == null) {
			dmHistoryPortImpl.setFullNameVN(StringPool.BLANK);
		}
		else {
			dmHistoryPortImpl.setFullNameVN(fullNameVN);
		}

		if (portType == null) {
			dmHistoryPortImpl.setPortType(StringPool.BLANK);
		}
		else {
			dmHistoryPortImpl.setPortType(portType);
		}

		dmHistoryPortImpl.setPortOrder(portOrder);

		if (address == null) {
			dmHistoryPortImpl.setAddress(StringPool.BLANK);
		}
		else {
			dmHistoryPortImpl.setAddress(address);
		}

		if (addressVN == null) {
			dmHistoryPortImpl.setAddressVN(StringPool.BLANK);
		}
		else {
			dmHistoryPortImpl.setAddressVN(addressVN);
		}

		if (stateCode == null) {
			dmHistoryPortImpl.setStateCode(StringPool.BLANK);
		}
		else {
			dmHistoryPortImpl.setStateCode(stateCode);
		}

		if (citycode == null) {
			dmHistoryPortImpl.setCitycode(StringPool.BLANK);
		}
		else {
			dmHistoryPortImpl.setCitycode(citycode);
		}

		dmHistoryPortImpl.setIsDelete(isDelete);
		dmHistoryPortImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmHistoryPortImpl.setModifiedDate(null);
		}
		else {
			dmHistoryPortImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmHistoryPortImpl.setRequestedDate(null);
		}
		else {
			dmHistoryPortImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmHistoryPortImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmHistoryPortImpl.setSyncVersion(syncVersion);
		}

		dmHistoryPortImpl.resetOriginalValues();

		return dmHistoryPortImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		portCode = objectInput.readUTF();
		loCode = objectInput.readUTF();
		portName = objectInput.readUTF();
		fullName = objectInput.readUTF();
		fullNameVN = objectInput.readUTF();
		portType = objectInput.readUTF();
		portOrder = objectInput.readInt();
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

		if (portCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(portCode);
		}

		if (loCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(loCode);
		}

		if (portName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(portName);
		}

		if (fullName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fullName);
		}

		if (fullNameVN == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fullNameVN);
		}

		if (portType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(portType);
		}

		objectOutput.writeInt(portOrder);

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
	public String portCode;
	public String loCode;
	public String portName;
	public String fullName;
	public String fullNameVN;
	public String portType;
	public int portOrder;
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