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

import vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityPortItems;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TempShipSecurityPortItems in entity cache.
 *
 * @author longdm
 * @see TempShipSecurityPortItems
 * @generated
 */
public class TempShipSecurityPortItemsCacheModel implements CacheModel<TempShipSecurityPortItems>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(id);
		sb.append(", requestCode=");
		sb.append(requestCode);
		sb.append(", shipSecurityPortItemCode=");
		sb.append(shipSecurityPortItemCode);
		sb.append(", portCode=");
		sb.append(portCode);
		sb.append(", dateArrival=");
		sb.append(dateArrival);
		sb.append(", dateDeparture=");
		sb.append(dateDeparture);
		sb.append(", securityLevelCode=");
		sb.append(securityLevelCode);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TempShipSecurityPortItems toEntityModel() {
		TempShipSecurityPortItemsImpl tempShipSecurityPortItemsImpl = new TempShipSecurityPortItemsImpl();

		tempShipSecurityPortItemsImpl.setId(id);

		if (requestCode == null) {
			tempShipSecurityPortItemsImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			tempShipSecurityPortItemsImpl.setRequestCode(requestCode);
		}

		if (shipSecurityPortItemCode == null) {
			tempShipSecurityPortItemsImpl.setShipSecurityPortItemCode(StringPool.BLANK);
		}
		else {
			tempShipSecurityPortItemsImpl.setShipSecurityPortItemCode(shipSecurityPortItemCode);
		}

		if (portCode == null) {
			tempShipSecurityPortItemsImpl.setPortCode(StringPool.BLANK);
		}
		else {
			tempShipSecurityPortItemsImpl.setPortCode(portCode);
		}

		if (dateArrival == Long.MIN_VALUE) {
			tempShipSecurityPortItemsImpl.setDateArrival(null);
		}
		else {
			tempShipSecurityPortItemsImpl.setDateArrival(new Date(dateArrival));
		}

		if (dateDeparture == Long.MIN_VALUE) {
			tempShipSecurityPortItemsImpl.setDateDeparture(null);
		}
		else {
			tempShipSecurityPortItemsImpl.setDateDeparture(new Date(
					dateDeparture));
		}

		if (securityLevelCode == null) {
			tempShipSecurityPortItemsImpl.setSecurityLevelCode(StringPool.BLANK);
		}
		else {
			tempShipSecurityPortItemsImpl.setSecurityLevelCode(securityLevelCode);
		}

		tempShipSecurityPortItemsImpl.resetOriginalValues();

		return tempShipSecurityPortItemsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		requestCode = objectInput.readUTF();
		shipSecurityPortItemCode = objectInput.readUTF();
		portCode = objectInput.readUTF();
		dateArrival = objectInput.readLong();
		dateDeparture = objectInput.readLong();
		securityLevelCode = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (requestCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(requestCode);
		}

		if (shipSecurityPortItemCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shipSecurityPortItemCode);
		}

		if (portCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(portCode);
		}

		objectOutput.writeLong(dateArrival);
		objectOutput.writeLong(dateDeparture);

		if (securityLevelCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(securityLevelCode);
		}
	}

	public long id;
	public String requestCode;
	public String shipSecurityPortItemCode;
	public String portCode;
	public long dateArrival;
	public long dateDeparture;
	public String securityLevelCode;
}