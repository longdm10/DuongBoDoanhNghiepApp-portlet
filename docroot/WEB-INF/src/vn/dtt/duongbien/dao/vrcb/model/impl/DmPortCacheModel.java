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

import vn.dtt.duongbien.dao.vrcb.model.DmPort;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DmPort in entity cache.
 *
 * @author longdm
 * @see DmPort
 * @generated
 */
public class DmPortCacheModel implements CacheModel<DmPort>, Externalizable {
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
	public DmPort toEntityModel() {
		DmPortImpl dmPortImpl = new DmPortImpl();

		dmPortImpl.setId(id);

		if (portCode == null) {
			dmPortImpl.setPortCode(StringPool.BLANK);
		}
		else {
			dmPortImpl.setPortCode(portCode);
		}

		if (loCode == null) {
			dmPortImpl.setLoCode(StringPool.BLANK);
		}
		else {
			dmPortImpl.setLoCode(loCode);
		}

		if (portName == null) {
			dmPortImpl.setPortName(StringPool.BLANK);
		}
		else {
			dmPortImpl.setPortName(portName);
		}

		if (fullName == null) {
			dmPortImpl.setFullName(StringPool.BLANK);
		}
		else {
			dmPortImpl.setFullName(fullName);
		}

		if (fullNameVN == null) {
			dmPortImpl.setFullNameVN(StringPool.BLANK);
		}
		else {
			dmPortImpl.setFullNameVN(fullNameVN);
		}

		if (portType == null) {
			dmPortImpl.setPortType(StringPool.BLANK);
		}
		else {
			dmPortImpl.setPortType(portType);
		}

		dmPortImpl.setPortOrder(portOrder);

		if (address == null) {
			dmPortImpl.setAddress(StringPool.BLANK);
		}
		else {
			dmPortImpl.setAddress(address);
		}

		if (addressVN == null) {
			dmPortImpl.setAddressVN(StringPool.BLANK);
		}
		else {
			dmPortImpl.setAddressVN(addressVN);
		}

		if (stateCode == null) {
			dmPortImpl.setStateCode(StringPool.BLANK);
		}
		else {
			dmPortImpl.setStateCode(stateCode);
		}

		if (citycode == null) {
			dmPortImpl.setCitycode(StringPool.BLANK);
		}
		else {
			dmPortImpl.setCitycode(citycode);
		}

		dmPortImpl.setIsDelete(isDelete);
		dmPortImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmPortImpl.setModifiedDate(null);
		}
		else {
			dmPortImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmPortImpl.setRequestedDate(null);
		}
		else {
			dmPortImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmPortImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmPortImpl.setSyncVersion(syncVersion);
		}

		dmPortImpl.resetOriginalValues();

		return dmPortImpl;
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