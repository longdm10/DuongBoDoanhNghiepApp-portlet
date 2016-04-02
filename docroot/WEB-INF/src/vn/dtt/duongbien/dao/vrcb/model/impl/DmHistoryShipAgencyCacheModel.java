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

import vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DmHistoryShipAgency in entity cache.
 *
 * @author longdm
 * @see DmHistoryShipAgency
 * @generated
 */
public class DmHistoryShipAgencyCacheModel implements CacheModel<DmHistoryShipAgency>,
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
	public DmHistoryShipAgency toEntityModel() {
		DmHistoryShipAgencyImpl dmHistoryShipAgencyImpl = new DmHistoryShipAgencyImpl();

		dmHistoryShipAgencyImpl.setId(id);

		if (shipAgencyCode == null) {
			dmHistoryShipAgencyImpl.setShipAgencyCode(StringPool.BLANK);
		}
		else {
			dmHistoryShipAgencyImpl.setShipAgencyCode(shipAgencyCode);
		}

		if (shipAgencyName == null) {
			dmHistoryShipAgencyImpl.setShipAgencyName(StringPool.BLANK);
		}
		else {
			dmHistoryShipAgencyImpl.setShipAgencyName(shipAgencyName);
		}

		if (shipAgencyNameVN == null) {
			dmHistoryShipAgencyImpl.setShipAgencyNameVN(StringPool.BLANK);
		}
		else {
			dmHistoryShipAgencyImpl.setShipAgencyNameVN(shipAgencyNameVN);
		}

		if (taxCode == null) {
			dmHistoryShipAgencyImpl.setTaxCode(StringPool.BLANK);
		}
		else {
			dmHistoryShipAgencyImpl.setTaxCode(taxCode);
		}

		if (stateCode == null) {
			dmHistoryShipAgencyImpl.setStateCode(StringPool.BLANK);
		}
		else {
			dmHistoryShipAgencyImpl.setStateCode(stateCode);
		}

		if (citycode == null) {
			dmHistoryShipAgencyImpl.setCitycode(StringPool.BLANK);
		}
		else {
			dmHistoryShipAgencyImpl.setCitycode(citycode);
		}

		if (address == null) {
			dmHistoryShipAgencyImpl.setAddress(StringPool.BLANK);
		}
		else {
			dmHistoryShipAgencyImpl.setAddress(address);
		}

		if (addressVN == null) {
			dmHistoryShipAgencyImpl.setAddressVN(StringPool.BLANK);
		}
		else {
			dmHistoryShipAgencyImpl.setAddressVN(addressVN);
		}

		if (phone == null) {
			dmHistoryShipAgencyImpl.setPhone(StringPool.BLANK);
		}
		else {
			dmHistoryShipAgencyImpl.setPhone(phone);
		}

		if (fax == null) {
			dmHistoryShipAgencyImpl.setFax(StringPool.BLANK);
		}
		else {
			dmHistoryShipAgencyImpl.setFax(fax);
		}

		if (email == null) {
			dmHistoryShipAgencyImpl.setEmail(StringPool.BLANK);
		}
		else {
			dmHistoryShipAgencyImpl.setEmail(email);
		}

		if (description == null) {
			dmHistoryShipAgencyImpl.setDescription(StringPool.BLANK);
		}
		else {
			dmHistoryShipAgencyImpl.setDescription(description);
		}

		if (contacter == null) {
			dmHistoryShipAgencyImpl.setContacter(StringPool.BLANK);
		}
		else {
			dmHistoryShipAgencyImpl.setContacter(contacter);
		}

		if (position == null) {
			dmHistoryShipAgencyImpl.setPosition(StringPool.BLANK);
		}
		else {
			dmHistoryShipAgencyImpl.setPosition(position);
		}

		if (contactTell == null) {
			dmHistoryShipAgencyImpl.setContactTell(StringPool.BLANK);
		}
		else {
			dmHistoryShipAgencyImpl.setContactTell(contactTell);
		}

		dmHistoryShipAgencyImpl.setIsDelete(isDelete);
		dmHistoryShipAgencyImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmHistoryShipAgencyImpl.setModifiedDate(null);
		}
		else {
			dmHistoryShipAgencyImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmHistoryShipAgencyImpl.setRequestedDate(null);
		}
		else {
			dmHistoryShipAgencyImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmHistoryShipAgencyImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmHistoryShipAgencyImpl.setSyncVersion(syncVersion);
		}

		dmHistoryShipAgencyImpl.resetOriginalValues();

		return dmHistoryShipAgencyImpl;
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