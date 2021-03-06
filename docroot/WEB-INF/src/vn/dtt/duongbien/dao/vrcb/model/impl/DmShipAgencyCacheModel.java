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

import vn.dtt.duongbien.dao.vrcb.model.DmShipAgency;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DmShipAgency in entity cache.
 *
 * @author longdm
 * @see DmShipAgency
 * @generated
 */
public class DmShipAgencyCacheModel implements CacheModel<DmShipAgency>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{id=");
		sb.append(id);
		sb.append(", shipAgencyCode=");
		sb.append(shipAgencyCode);
		sb.append(", shipAgencyName=");
		sb.append(shipAgencyName);
		sb.append(", shipAgencyNameVN=");
		sb.append(shipAgencyNameVN);
		sb.append(", taxCode=");
		sb.append(taxCode);
		sb.append(", stateCode=");
		sb.append(stateCode);
		sb.append(", citycode=");
		sb.append(citycode);
		sb.append(", address=");
		sb.append(address);
		sb.append(", addressVN=");
		sb.append(addressVN);
		sb.append(", phone=");
		sb.append(phone);
		sb.append(", fax=");
		sb.append(fax);
		sb.append(", email=");
		sb.append(email);
		sb.append(", description=");
		sb.append(description);
		sb.append(", contacter=");
		sb.append(contacter);
		sb.append(", position=");
		sb.append(position);
		sb.append(", contactTell=");
		sb.append(contactTell);
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
	public DmShipAgency toEntityModel() {
		DmShipAgencyImpl dmShipAgencyImpl = new DmShipAgencyImpl();

		dmShipAgencyImpl.setId(id);

		if (shipAgencyCode == null) {
			dmShipAgencyImpl.setShipAgencyCode(StringPool.BLANK);
		}
		else {
			dmShipAgencyImpl.setShipAgencyCode(shipAgencyCode);
		}

		if (shipAgencyName == null) {
			dmShipAgencyImpl.setShipAgencyName(StringPool.BLANK);
		}
		else {
			dmShipAgencyImpl.setShipAgencyName(shipAgencyName);
		}

		if (shipAgencyNameVN == null) {
			dmShipAgencyImpl.setShipAgencyNameVN(StringPool.BLANK);
		}
		else {
			dmShipAgencyImpl.setShipAgencyNameVN(shipAgencyNameVN);
		}

		if (taxCode == null) {
			dmShipAgencyImpl.setTaxCode(StringPool.BLANK);
		}
		else {
			dmShipAgencyImpl.setTaxCode(taxCode);
		}

		if (stateCode == null) {
			dmShipAgencyImpl.setStateCode(StringPool.BLANK);
		}
		else {
			dmShipAgencyImpl.setStateCode(stateCode);
		}

		if (citycode == null) {
			dmShipAgencyImpl.setCitycode(StringPool.BLANK);
		}
		else {
			dmShipAgencyImpl.setCitycode(citycode);
		}

		if (address == null) {
			dmShipAgencyImpl.setAddress(StringPool.BLANK);
		}
		else {
			dmShipAgencyImpl.setAddress(address);
		}

		if (addressVN == null) {
			dmShipAgencyImpl.setAddressVN(StringPool.BLANK);
		}
		else {
			dmShipAgencyImpl.setAddressVN(addressVN);
		}

		if (phone == null) {
			dmShipAgencyImpl.setPhone(StringPool.BLANK);
		}
		else {
			dmShipAgencyImpl.setPhone(phone);
		}

		if (fax == null) {
			dmShipAgencyImpl.setFax(StringPool.BLANK);
		}
		else {
			dmShipAgencyImpl.setFax(fax);
		}

		if (email == null) {
			dmShipAgencyImpl.setEmail(StringPool.BLANK);
		}
		else {
			dmShipAgencyImpl.setEmail(email);
		}

		if (description == null) {
			dmShipAgencyImpl.setDescription(StringPool.BLANK);
		}
		else {
			dmShipAgencyImpl.setDescription(description);
		}

		if (contacter == null) {
			dmShipAgencyImpl.setContacter(StringPool.BLANK);
		}
		else {
			dmShipAgencyImpl.setContacter(contacter);
		}

		if (position == null) {
			dmShipAgencyImpl.setPosition(StringPool.BLANK);
		}
		else {
			dmShipAgencyImpl.setPosition(position);
		}

		if (contactTell == null) {
			dmShipAgencyImpl.setContactTell(StringPool.BLANK);
		}
		else {
			dmShipAgencyImpl.setContactTell(contactTell);
		}

		dmShipAgencyImpl.setIsDelete(isDelete);
		dmShipAgencyImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmShipAgencyImpl.setModifiedDate(null);
		}
		else {
			dmShipAgencyImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmShipAgencyImpl.setRequestedDate(null);
		}
		else {
			dmShipAgencyImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmShipAgencyImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmShipAgencyImpl.setSyncVersion(syncVersion);
		}

		dmShipAgencyImpl.resetOriginalValues();

		return dmShipAgencyImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		shipAgencyCode = objectInput.readUTF();
		shipAgencyName = objectInput.readUTF();
		shipAgencyNameVN = objectInput.readUTF();
		taxCode = objectInput.readUTF();
		stateCode = objectInput.readUTF();
		citycode = objectInput.readUTF();
		address = objectInput.readUTF();
		addressVN = objectInput.readUTF();
		phone = objectInput.readUTF();
		fax = objectInput.readUTF();
		email = objectInput.readUTF();
		description = objectInput.readUTF();
		contacter = objectInput.readUTF();
		position = objectInput.readUTF();
		contactTell = objectInput.readUTF();
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

		if (shipAgencyCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shipAgencyCode);
		}

		if (shipAgencyName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shipAgencyName);
		}

		if (shipAgencyNameVN == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shipAgencyNameVN);
		}

		if (taxCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(taxCode);
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

		if (phone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(phone);
		}

		if (fax == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fax);
		}

		if (email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (contacter == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(contacter);
		}

		if (position == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(position);
		}

		if (contactTell == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(contactTell);
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
	public String shipAgencyCode;
	public String shipAgencyName;
	public String shipAgencyNameVN;
	public String taxCode;
	public String stateCode;
	public String citycode;
	public String address;
	public String addressVN;
	public String phone;
	public String fax;
	public String email;
	public String description;
	public String contacter;
	public String position;
	public String contactTell;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}